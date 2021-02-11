package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonMas : Button = findViewById(R.id.btnSuma)
        val botonMenos : Button = findViewById(R.id.btnResta)
        val botonMulti : Button = findViewById(R.id.btnMultiplica)
        val botonDividir : Button = findViewById(R.id.btnDivide)

        var resultado: TextView = findViewById(R.id.txtResp)
        val botonUno: Button = findViewById(R.id.btn1)
        val botonDos: Button = findViewById(R.id.btn2)
        val botonTres: Button = findViewById(R.id.btn3)
        val botonCuatro: Button = findViewById(R.id.btn4)
        val botonCinco: Button = findViewById(R.id.btn5)
        val botonSeis: Button = findViewById(R.id.btn6)
        val botonSiete: Button = findViewById(R.id.btn7)
        val botonOcho: Button = findViewById(R.id.btn8)
        val botonNueve: Button = findViewById(R.id.btn9)
        val botonCero: Button = findViewById(R.id.btn0)

        botonUno.setOnClickListener{Presionar("1", resultado)}
        botonDos.setOnClickListener{Presionar("2", resultado)}
        botonTres.setOnClickListener{Presionar("3", resultado)}
        botonCuatro.setOnClickListener{Presionar("4", resultado)}
        botonCinco.setOnClickListener{Presionar("5", resultado)}
        botonSeis.setOnClickListener{Presionar("6", resultado)}
        botonSiete.setOnClickListener{Presionar("7", resultado)}
        botonOcho.setOnClickListener{Presionar("8", resultado)}
        botonNueve.setOnClickListener{Presionar("9", resultado)}
        botonCero.setOnClickListener{Presionar("0", resultado)}
    }

    private fun Presionar(num: String, res: TextView){
        res.text = "${res.text}$num"
    }
}