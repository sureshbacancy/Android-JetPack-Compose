package com.example.jetpackcomposeexample.login.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackcomposeexample.common.USERS
import com.example.jetpackcomposeexample.common.model.UserDetails
import com.example.jetpackcomposeexample.database.pref.SharedPrefManager
import com.example.jetpackcomposeexample.signup.viewmodel.SignUpViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.MutableStateFlow

class LoginViewModel(
    private val firebaseAuth: FirebaseAuth?,
    private val firebaseUser: FirebaseUser?,
    private val mContext: Context
) : ViewModel() {

    fun doLoginUser(email: String, password: String, state: (CreateUserState) -> Unit) {
        state.invoke(CreateUserState.Loading(isShowLoader = true))

        firebaseAuth?.signInWithEmailAndPassword(email, password)
            ?.addOnCompleteListener { status ->
                if (status.isSuccessful) {

                    val database = FirebaseFirestore.getInstance()
                    val userId = database.collection(USERS).document().id

                    database.collection(USERS).document(userId).get()
                        .addOnSuccessListener { document ->
                            if (document != null) {
                                val name = document.getString("name").orEmpty()
                                val mobile = document.getString("mobile").orEmpty()

                                val userDetails = UserDetails(
                                    id = userId,
                                    name = name,
                                    email = email,
                                    mobile = mobile,
                                    password = password
                                )

                                SharedPrefManager.saveUserDetails(mContext, userDetails)
                                state.invoke(CreateUserState.Success)
                            }

                            state.invoke(CreateUserState.Loading(isShowLoader = false))

                        }.addOnFailureListener {
                            state.invoke(CreateUserState.Loading(isShowLoader = false))
                        }

                } else {
                    state.invoke(CreateUserState.Loading(isShowLoader = false))
                    state.invoke(CreateUserState.Error(errorMessage = status.exception?.message.toString()))
                }
            }
    }

    sealed class CreateUserState {
        data class Loading(val isShowLoader: Boolean) : CreateUserState()
        data object Success : CreateUserState()
        data class Error(val errorMessage: String) : CreateUserState()
        data object NetworkError : CreateUserState()
    }

    class LoginViewModelFactory(
        private val firebaseAuth: FirebaseAuth?,
        private val firebaseUser: FirebaseUser?,
        private val mContext: Context
    ) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T = LoginViewModel(
            firebaseAuth, firebaseUser, mContext
        ) as T
    }
}