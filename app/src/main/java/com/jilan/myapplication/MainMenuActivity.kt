package com.jilan.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainMenuActivity: AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val btnLearn = findViewById<Button>(R.id.btnLearn)
        val btnQuiz = findViewById<Button>(R.id.btnQuiz)
        val btnAbout = findViewById<Button>(R.id.btnAbout)

        btnLearn.setOnClickListener {
            startActivity(Intent(this, LearnActivity::class.java))
        }

        btnQuiz.setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
        }

        btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}