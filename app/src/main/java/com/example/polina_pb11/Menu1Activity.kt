package com.example.polina_pb11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)
    }

    fun skip1(view: View) {
        val intent = Intent(this@Menu1Activity, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun next1(view: View) {
        val intent = Intent(this@Menu1Activity, Menu2Activity::class.java)
        startActivity(intent)
        finish()
    }

}