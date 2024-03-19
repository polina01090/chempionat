package com.example.polina_pb11

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

@SuppressLint("CustomSplashScreen")
class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
    }
    val timer = object : CountDownTimer(3000, 1000){
        override fun onTick(p0: Long) {

        }

        override fun onFinish() {
            val intent = Intent(this@LaunchActivity, Menu1Activity::class.java)
            startActivity(intent)
            finish()
        }

    }.start()
}