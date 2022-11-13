package me.shakhriyor.pinterest.common.extensions

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

fun View.visibility(isVisibility: Boolean){
    visibility = if (isVisibility){
        View.GONE } else { View.GONE }
}

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.showSnackBar(message: String){
    Snackbar.make(this, message, 1500).show()
}

