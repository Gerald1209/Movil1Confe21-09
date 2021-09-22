package ni.edu.uca.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numdia = findViewById<View>(R.id.txnIngresar) as TextView
        val btnDia = findViewById<View>(R.id.btnDia) as Button
        val tvDia = findViewById<View>(R.id.tvDia) as TextView
        btnDia.setOnClickListener(View.OnClickListener {
            val ndia= numdia.text.toString().toInt()
            val dia= getDiasSemanas(ndia)
            tvDia.text=dia
        })
    }

    fun getDiasSemanas(ndia:Int):String{
        val dia =
            when {
                ndia == 1 -> "Domingo"
                ndia == 2 -> "Lunes"
                ndia == 3 -> "Martes"
                ndia == 4 -> "Miercoles"
                ndia == 5 -> "Jueves"
                ndia == 6 -> "Viernes"
                ndia == 7 -> "Sabado"
                else -> "Error"
            }
        return dia
        
    }
}



