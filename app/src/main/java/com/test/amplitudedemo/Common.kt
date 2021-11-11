package com.test.amplitudedemo

import android.content.Context
import android.view.Gravity
import android.widget.Toast

fun Context.toast(msg: String) {
    val toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT)
    toast.setGravity(Gravity.BOTTOM, 0, 120)
    toast.show()
}