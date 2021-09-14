package com.example.facebooklogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,TextWatcher{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        im_logo.visibility=View.VISIBLE
        im_logo.animate()
            .translationY(-700f)
            .scaleX(0.7f)
            .scaleY(0.7f)
            .duration=1000

        ed_mail.addTextChangedListener(this)
        ed_pass.addTextChangedListener(this)
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        btn_login.isEnabled=ed_mail.text.trim().isNotEmpty() && ed_pass.text.isNotEmpty()
    }

    override fun afterTextChanged(p0: Editable?) {

    }
}