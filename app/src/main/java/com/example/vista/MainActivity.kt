package com.example.vista

import android.content.Intent
import com.google.android.material.floatingactionbutton.FloatingActionButton

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.primera_vista)

        val fabAgregarNota = findViewById<FloatingActionButton>(R.id.fabAgregarNota)

        fabAgregarNota.setOnClickListener {
            val intent = Intent(this, NuevaNotaActivity::class.java)
            startActivity(intent)

       /*
       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            return@setOnApplyWindowInsetsListener insets
        }
        */

            }
        }
    }
