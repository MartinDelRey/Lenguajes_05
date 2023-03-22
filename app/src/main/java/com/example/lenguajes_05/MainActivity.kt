package com.example.lenguajes_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var txtTitulo: TextView
    lateinit var txtCaracteristica: TextView
    lateinit var spLenguajes: Spinner
    var lenguajes = arrayOf("JAVA", "KOTLIN", "PHP", "SWIFT", "C#", "C++","Dart","JS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inicializar
        txtTitulo = findViewById(R.id.tituloventana)
        txtCaracteristica = findViewById(R.id.txtCaracteristica)
        spLenguajes = findViewById(R.id.spLenguajes)
        //Crear adaptador
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, lenguajes)
        //como se comporta
        adaptador.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item)
        spLenguajes.adapter = adaptador
        spLenguajes.onItemSelectedListener = this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, posicion: Int, p3: Long) {
        val valorSeleccionado = lenguajes[posicion]
        Toast.makeText(this, "Selecciono $valorSeleccionado", Toast.LENGTH_LONG).show()

        txtTitulo.text= valorSeleccionado
        when(valorSeleccionado){
            "JAVA" -> txtCaracteristica.text = "java esta bomnito"
            "KOTLIN" -> txtCaracteristica.text = "kotlin de android studio"
            "PHP" -> txtCaracteristica.text = "php para base de datos"
            "SWIFT" -> txtCaracteristica.text = "taylor swift"
            "C#" -> txtCaracteristica.text = "c# lo que hacemos con juan luis"
            "C++" -> txtCaracteristica.text = "c++ para juegos"
            "Dart" -> txtCaracteristica.text = "dart jaja"
            "JS" -> txtCaracteristica.text = "JS para paginas wev"

        }

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}