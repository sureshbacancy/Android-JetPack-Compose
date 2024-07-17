package com.example.jetpackcomposeexample.base

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

open class BaseActivity : ComponentActivity() {
    var firebaseAuth: FirebaseAuth? = null
    var firebaseUser: FirebaseUser? = null
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeFirebase()
        context = this
    }

    private fun initializeFirebase() {
        firebaseAuth = FirebaseAuth.getInstance()
        firebaseUser = FirebaseAuth.getInstance().currentUser
    }
}