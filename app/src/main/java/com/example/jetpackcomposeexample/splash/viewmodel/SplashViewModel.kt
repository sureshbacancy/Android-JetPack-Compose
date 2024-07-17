package com.example.jetpackcomposeexample.splash.viewmodel

import android.content.Context
import android.os.Handler
import android.os.Looper
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.jetpackcomposeexample.database.pref.SharedPrefManager
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

const val SPLASH_SCREEN_DURATION = 3000L

class SplashViewModel(private val context: Context) : ViewModel() {

    fun fetchLoginData(redirection: (RedirectionStatus) -> Unit) {
        viewModelScope.launch {
            delay(SPLASH_SCREEN_DURATION)
            if (SharedPrefManager.isUserLoggedIn(context)) {
                redirection.invoke(RedirectionStatus.Home)
            } else {
                redirection.invoke(RedirectionStatus.Login)
            }
        }
    }

    sealed class RedirectionStatus {
        data object Login : RedirectionStatus()
        data object Home : RedirectionStatus()
    }

    class SplashViewModelFactory(private val mContext: Context) :
        ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T =
            SplashViewModel(mContext) as T
    }
}