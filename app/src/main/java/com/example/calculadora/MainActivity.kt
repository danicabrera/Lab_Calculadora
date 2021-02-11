package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num1: Double = 0.0
    var num2 : Double = 0.0
    var op : Int = 0
    var respuesta : Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonMas : Button = findViewById(R.id.btnSuma)
        val botonMenos : Button = findViewById(R.id.btnResta)
        val botonMulti : Button = findViewById(R.id.btnMultiplica)
        val botonDividir : Button = findViewById(R.id.btnDivide)

        val botonIgual : Button = findViewById(R.id.btnIgual)
        val botonAC : Button = findViewById(R.id.btnAC)

        val resultado: TextView = findViewById(R.id.txtResp)

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

        botonMas.setOnClickListener{
            resultado.text = "0"
            num1 = resultado.text.toString().toDouble()
            op = 1
        }
        botonMenos.setOnClickListener{
            num1 = resultado.text.toString().toDouble()
            resultado.text = "0"
            op = 2
        }
        botonMulti.setOnClickListener{
            num1 = resultado.text.toString().toDouble()
            resultado.text = "0"
            op = 3
        }
        botonDividir.setOnClickListener{
            num1 = resultado.text.toString().toDouble()
            resultado.text = "0"
            op = 4
        }

        botonIgual.setOnClickListener{
            if(op == 1){
                respuesta = num1  + num2
            } else if (op == 2){
                respuesta = num1  - num2
            } else if (op == 3){
                respuesta = num1  * num2
            } else if (op == 4){
                respuesta = num1  / num2
            } else{
                respuesta = 0.0
            }
            resultado.text = respuesta.toString()
        }

        botonAC.setOnClickListener{
            num1 = 0.0
            num2 = 0.0
            resultado.text = "0"

        }
    }


    @SuppressLint("SetTextI18n")
    private fun Presionar(num: String, res :TextView){
        res.text = "${res.text}$num"
        if(op == 0){
            num1 = res.text.toString().toDouble()
        } else{
            num2 = res.text.toString().toDouble()
        }
    }


}