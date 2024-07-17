package com.example.jetpackcomposeexample.database.pref

import android.content.Context
import com.example.jetpackcomposeexample.common.model.UserDetails

object SharedPrefManager {

    const val PREF_NAME = "jetpack_user_prefs"
    const val KEY_ID = "id"
    const val KEY_NAME = "name"
    const val KEY_EMAIL = "email"
    const val KEY_MOBILE = "mobile"
    const val KEY_PASSWORD = "password"

    fun saveUserDetails(context: Context, userDetails:UserDetails) {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(KEY_ID, userDetails.id)
        editor.putString(KEY_NAME, userDetails.name)
        editor.putString(KEY_EMAIL, userDetails.email)
        editor.putString(KEY_MOBILE, userDetails.mobile)
        editor.putString(KEY_PASSWORD, userDetails.password)
        editor.apply()
    }

    fun getUserDetails(context: Context): UserDetails {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return UserDetails(
            id = sharedPreferences.getString(KEY_ID, "").orEmpty(),
            name = sharedPreferences.getString(KEY_NAME, "").orEmpty(),
            email = sharedPreferences.getString(KEY_EMAIL, "").orEmpty(),
            mobile = sharedPreferences.getString(KEY_MOBILE, "").orEmpty(),
        )
    }

    fun getValue(context: Context,key:String): String {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, "").orEmpty()
    }

    fun clearUserDetails(context: Context) {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    fun isUserLoggedIn(context: Context): Boolean {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val id = sharedPreferences.getString(KEY_ID, "").orEmpty()
        return sharedPreferences!=null && id.isNotEmpty()
    }
}