package com.example.polina_pb11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)
    }
    fun login(view: View) {
        val intent = Intent(this@Menu3Activity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}