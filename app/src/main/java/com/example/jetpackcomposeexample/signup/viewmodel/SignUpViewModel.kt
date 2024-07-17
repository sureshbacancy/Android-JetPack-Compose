package com.example.jetpackcomposeexample.signup.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackcomposeexample.common.USERS
import com.example.jetpackcomposeexample.common.model.UserDetails
import com.example.jetpackcomposeexample.database.pref.SharedPrefManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore

class SignUpViewModel(
    private val firebaseAuth: FirebaseAuth?,
    private val firebaseUser: FirebaseUser?,
    private val mContext: Context
) : ViewModel() {

    fun createUser(
        name: String,
        email: String,
        mobile: String,
        password: String,
        state: (CreateUserState) -> Unit
    ) {
        state.invoke(CreateUserState.Loading(isShowLoader = true))
        firebaseAuth?.createUserWithEmailAndPassword(email, password)
            ?.addOnCompleteListener { status ->
                Log.d("createUser", "createUser: ${status.isSuccessful}")
                if (status.isSuccessful) {
                    val database = FirebaseFirestore.getInstance()
                    val userId = database.collection(USERS).document().id
                    Log.d("createUser", "createUser 1 USER ID : $userId")

                    val userDetails = UserDetails(
                        id = userId,
                        name = name,
                        email = email,
                        mobile = mobile,
                        password = password
                    )
                    database.collection(USERS).document(userId).set(userDetails)
                       .addOnCompleteListener {
                            Log.d("createUser", "createUser 2 : sucess")
                            state.invoke(CreateUserState.Loading(isShowLoader = false))

                            SharedPrefManager.saveUserDetails(mContext, userDetails)
                            state.invoke(CreateUserState.Success)

                        }.addOnFailureListener {
                            Log.d("createUser", "createUser 2 : fail = ${it.message}")
                            state.invoke(CreateUserState.Loading(isShowLoader = false))
                        }

                } else {
                    state.invoke(CreateUserState.Loading(isShowLoader = false))
                    state.invoke(CreateUserState.Error(errorMessage = status.exception?.message.toString()))
                    Log.d("createUser", "Error: ${status.exception?.message}")
                }
            }
    }

    sealed class CreateUserState {
        data class Loading(val isShowLoader: Boolean) : CreateUserState()
        data object Success : CreateUserState()
        data class Error(val errorMessage: String) : CreateUserState()
        data object NetworkError : CreateUserState()
    }

    class SignUpViewModelFactory(
        private val firebaseAuth: FirebaseAuth?,
        private val firebaseUser: FirebaseUser?,
        private val mContext: Context
    ) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T = SignUpViewModel(
            firebaseAuth, firebaseUser, mContext
        ) as T
    }
}