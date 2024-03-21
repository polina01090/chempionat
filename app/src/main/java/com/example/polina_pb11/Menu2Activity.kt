package com.example.polina_pb11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
    }

    fun skip2(view: View) {
        val intent = Intent(this@Menu2Activity, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun next2(view: View) {
        val intent = Intent(this@Menu2Activity, Menu3Activity::class.java)
        startActivity(intent)
        finish()
    }
}