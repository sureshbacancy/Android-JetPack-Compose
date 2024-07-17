package com.example.jetpackcomposeexample.extension

import android.content.Context
import android.content.Intent
import android.os.Bundle

fun Context.openScreen(activity: Class<*>, bundle: Bundle? = null,isFinish: Boolean = false) {
    val intent = Intent(this, activity)
    if (isFinish){
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
    }
    if (bundle != null) {
        intent.putExtras(bundle)
    }
    this.startActivity(intent)
}