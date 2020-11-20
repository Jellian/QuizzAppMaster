package com.fiuady.quizzappmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Opciones : AppCompatActivity() {

    private lateinit var todoschek: CheckBox
    private lateinit var ciencia_checkbox: CheckBox
    private lateinit var cine_checkbox: CheckBox
    private lateinit var deporte_checkbox: CheckBox
    private lateinit var musica_checkbox: CheckBox
    private lateinit var arte_checkbox: CheckBox
    private lateinit var videojuegos_checkbox: CheckBox
    private lateinit var spinner: Spinner
    private lateinit var spinnerpistas: Spinner
    var radioGroup: RadioGroup? = null
    private lateinit var switch: Switch
    private lateinit var Alto: RadioButton
    private lateinit var medio: RadioButton
    private lateinit var bajo: RadioButton
    private lateinit var prueba: TextView
    private var flagenvio = false
    var cont = 1
    private val temascheckboxes = mutableListOf<CheckBox>()
    var topicsarray = arrayListOf<Int>(1)
    val num_pistas = arrayOf(1, 2, 3)
    var adapterQuestions: ArrayAdapter<Int>? = null
    var adapterpistas: ArrayAdapter<Int>? = null
    var dificultad = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)


        todoschek = findViewById(R.id.todos_checkbox)
        ciencia_checkbox = findViewById(R.id.ciencia_checkbox)
        cine_checkbox = findViewById(R.id.cine_checkbox)
        deporte_checkbox = findViewById(R.id.deporte_checkbox)
        musica_checkbox = findViewById(R.id.musica_checkbox)
        arte_checkbox = findViewById(R.id.arte_checkbox)
        videojuegos_checkbox = findViewById(R.id.videojuegos_checkbox)
        radioGroup = findViewById(R.id.radioGroup1)
        switch = findViewById(R.id.pistas)
        spinner = findViewById(R.id.numero_preguntas)
        spinnerpistas = findViewById(R.id.numero_pistas)
        Alto = findViewById(R.id.nivel_alto)
        medio = findViewById(R.id.nivel_medio)
        bajo = findViewById(R.id.nivel_bajo)
        prueba = findViewById(R.id.prueba)

        //spinadp()
        medio.isChecked = true
        adapterpistas = ArrayAdapter<Int>(this, R.layout.support_simple_spinner_dropdown_item, num_pistas)
        spinnerpistas.setAdapter(adapterpistas)
        spinnerpistas.isEnabled = false
        cine_checkbox.isChecked = true

        if (todoschek.isChecked == true) {
            ciencia_checkbox.isChecked = true
            cine_checkbox.isChecked = true
            deporte_checkbox.isChecked = true
            musica_checkbox.isChecked = true
            arte_checkbox.isChecked = true
            videojuegos_checkbox.isChecked = true
        }
            if (!switch.isChecked()) {
                spinnerpistas.setEnabled(false)
            }

            if (!switch.isChecked()) {
                spinnerpistas.setEnabled(false)
            }

            if (!cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && videojuegos_checkbox.isChecked || cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked ||
                    !cine_checkbox.isChecked && ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked || !cine_checkbox.isChecked && !ciencia_checkbox.isChecked && deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked ||
                    !cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked || !cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && musica_checkbox.isChecked && !videojuegos_checkbox.isChecked) {
                spinner.isEnabled = false
                spinner.setSelection(0)
            } else {
                spinner.isEnabled = true
            }


            cine_checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    cont += 1
                    if (!topicsarray.contains(1)) topicsarray.add(1)

                } else if (cont == 1) {
                    cine_checkbox.isChecked = true

                } else {
                    cont -= 1
                    topicsarray.remove(1)

                }
                validar()
            }

            ciencia_checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    cont += 1
                    if (!topicsarray.contains(3)) topicsarray.add(3)
                } else if (cont == 1) {
                    ciencia_checkbox.isChecked = true
                } else {
                    cont -= 1
                    topicsarray.remove(3)
                }
                validar()
            }
            deporte_checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    cont += 1
                    if (!topicsarray.contains(4)) topicsarray.add(4)
                } else if (cont == 1) {
                    deporte_checkbox.isChecked = true
                } else {
                    cont -= 1
                    topicsarray.remove(4)
                }
                validar()
            }
            arte_checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    cont += 1
                    if (!topicsarray.contains(5)) topicsarray.add(5)
                } else if (cont == 1) {
                    arte_checkbox.isChecked = true
                } else {
                    cont -= 1
                    topicsarray.remove(5)
                }
                validar()
            }
            musica_checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    cont += 1
                    if (!topicsarray.contains(2)) topicsarray.add(2)
                } else if (cont == 1) {
                    musica_checkbox.isChecked = true
                } else {
                    cont -= 1
                    topicsarray.remove(2)
                }
                validar()
            }
            videojuegos_checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    prueba.text = topicsarray[0].toString()
                    cont += 1
                    if (!topicsarray.contains(6)) topicsarray.add(6)
                } else if (cont == 1) {
                    videojuegos_checkbox.isChecked = true
                } else {
                    cont -= 1
                    topicsarray.remove(6)
                }
                validar()
            }


            todoschek.setOnClickListener {
                if (todoschek.isChecked == true) {
                    todoschek.isEnabled = false
                    ciencia_checkbox.isChecked = true
                    cine_checkbox.isChecked = true
                    deporte_checkbox.isChecked = true
                    musica_checkbox.isChecked = true
                    arte_checkbox.isChecked = true
                    videojuegos_checkbox.isChecked = true
                    spinner.setSelection(1)
                }
            }

            switch.setOnCheckedChangeListener { _, _ ->
                if (!switch.isChecked) {
                    spinnerpistas.isEnabled = false
                }
                if (switch.isChecked) {
                    spinnerpistas.isEnabled = true
                }
            }
        }

        fun validar() {
            when (cont) {
                1 -> {
                    spinadp()
                    todoschek.isEnabled = true
                    todoschek.isChecked = false
                    spinner.setSelection(0)
                    spinner.isEnabled = false
                }
                in 2..5 -> {
                    spinadp()
                    todoschek.isEnabled = true
                    todoschek.isChecked = false
                    spinner.setSelection(0)
                    spinner.isEnabled = true
                }
                6 -> {
                    spinadp()
                    todoschek.isChecked = true
                    todoschek.isEnabled = false
                    spinner.setSelection(0)
                    spinner.isEnabled = true
                }
            }
        }

        fun spinadp() {
            if (cont < 6) {
                val num_pre = arrayOf(5, 6, 7, 8, 9, 10)
                adapterQuestions = ArrayAdapter<Int>(this, R.layout.support_simple_spinner_dropdown_item, num_pre)
                spinner.setAdapter(adapterQuestions)
            }

            if (cont == 6) {
                val preg = arrayListOf<Int>(6, 7, 8, 9, 10)
                adapterQuestions = ArrayAdapter<Int>(this, R.layout.support_simple_spinner_dropdown_item, preg)
                spinner.setAdapter(adapterQuestions)
            }

        }

        fun selectdificulty() {
            if (Alto.isChecked) dificultad = 3
            if (medio.isChecked) dificultad = 2
            if (bajo.isChecked) dificultad = 1
        }


  

    fun selectdificulty() {
        if (Alto.isChecked) dificultad = 3
        if (medio.isChecked) dificultad = 2
        if (bajo.isChecked) dificultad = 1
    }

    override fun onBackPressed() {
        flagenvio = true
        selectdificulty()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("topicsarray", topicsarray)
        intent.putExtra("intNoQuestions", spinner.getSelectedItem().toString().toInt());
        intent.putExtra("intNopistas", spinnerpistas.getSelectedItem().toString().toInt());
        intent.putExtra("dificultad", dificultad)
        intent.putExtra("intspinpistas", switch.isChecked)
        startActivity(intent)
    }

}


