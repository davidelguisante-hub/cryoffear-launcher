package com.cryoffear.launcher

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.titleText)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnInstall = findViewById<Button>(R.id.btnInstall)

        title.text = "CRY OF FEAR\nLAUNCHER"

        btnPlay.setOnClickListener {
            Toast.makeText(this, "Buscando Cry of Fear...", Toast.LENGTH_SHORT).show()
        }

        btnInstall.setOnClickListener {
            Toast.makeText(this, "Instalando archivos...", Toast.LENGTH_SHORT).show()
        }
    }
}
