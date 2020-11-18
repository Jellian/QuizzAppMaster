package com.fiuady.quizzappmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Opciones : AppCompatActivity() {

    private lateinit var todoschek: CheckBox
    private lateinit var ciencia_checkbox: CheckBox
    private lateinit var cine_checkbox: CheckBox
    private lateinit var deporte_checkbox: CheckBox
    private lateinit var musica_checkbox: CheckBox
    private lateinit var arte_checkbox: CheckBox
    private lateinit var videojuegos_checkbox: CheckBox
    var radioGroup: RadioGroup? = null
    private lateinit var switch: Switch
    private lateinit var radioButton: RadioButton

    private val temascheckboxes = mutableListOf<CheckBox>()

    val num_pre= arrayOf(5, 6, 7, 8, 9, 10)
    val num_pistas= arrayOf(1, 2, 3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        todoschek=findViewById(R.id.todos_checkbox)
        ciencia_checkbox=findViewById(R.id.ciencia_checkbox)
        cine_checkbox=findViewById(R.id.cine_checkbox)
        deporte_checkbox=findViewById(R.id.deporte_checkbox)
        musica_checkbox=findViewById(R.id.musica_checkbox)
        arte_checkbox=findViewById(R.id.arte_checkbox)
        videojuegos_checkbox=findViewById(R.id.videojuegos_checkbox)
        radioGroup = findViewById(R.id.radioGroup1)
        switch = findViewById(R.id.pistas);

        val spinner: Spinner = findViewById(R.id.numero_preguntas)
        val spinnerpistas: Spinner = findViewById(R.id.numero_pistas)

        spinner.setAdapter(ArrayAdapter<Int>(this, android.R.layout.simple_spinner_item, num_pre))
        spinnerpistas.setAdapter(ArrayAdapter<Int>(this, android.R.layout.simple_spinner_item, num_pistas))






    }
}