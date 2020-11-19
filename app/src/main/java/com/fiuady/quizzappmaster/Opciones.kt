package com.fiuady.quizzappmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Opciones : AppCompatActivity() {

    private lateinit var todoschek:CheckBox
    private lateinit var ciencia_checkbox:CheckBox
    private lateinit var cine_checkbox:CheckBox
    private lateinit var deporte_checkbox:CheckBox
    private lateinit var musica_checkbox:CheckBox
    private lateinit var arte_checkbox:CheckBox
    private lateinit var videojuegos_checkbox:CheckBox
    private lateinit var spinner:Spinner
    private lateinit var spinnerpistas:Spinner
    var radioGroup: RadioGroup? = null
    private lateinit var switch: Switch
    private lateinit var Alto: RadioButton
    private lateinit var medio: RadioButton
    private lateinit var bajo: RadioButton
    private var flagenvio = false

    private val temascheckboxes = mutableListOf<CheckBox>()

    val num_pre= arrayOf(5, 6, 7, 8, 9, 10)
    val num_pistas= arrayOf(1, 2, 3)
    var adapterQuestions: ArrayAdapter<Int>? = null
    var adapterpistas: ArrayAdapter<Int>? = null
    var count=0

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


        adapterQuestions = ArrayAdapter<Int>(this, R.layout.support_simple_spinner_dropdown_item, num_pre)
        spinner.setAdapter(adapterQuestions)

        adapterpistas = ArrayAdapter<Int>(this, R.layout.support_simple_spinner_dropdown_item, num_pistas)
        spinnerpistas.setAdapter(adapterpistas)
        spinnerpistas.isEnabled = false


        if (todoschek.isChecked == true) {
            ciencia_checkbox.isChecked = true
            cine_checkbox.isChecked = true
            deporte_checkbox.isChecked = true
            musica_checkbox.isChecked = true
            arte_checkbox.isChecked = true
            videojuegos_checkbox.isChecked = true
            todoschek.isEnabled=true
        }

        val booltodos = intent.getBooleanExtra("intTodos", false)
        val boolciencia = intent.getBooleanExtra("intciencia", true)
        val boolcine = intent.getBooleanExtra("intcine", false)
        val booldeporte = intent.getBooleanExtra("intdeporte", false)
        val boolmusica = intent.getBooleanExtra("intmusica", false)
        val boolarte = intent.getBooleanExtra("intarte", false)
        val boolvideojuegos = intent.getBooleanExtra("intvideojuegos", false)
        val stringNopreguntas = intent.getIntExtra("intNoQuestions", 0)
        val stringNoCpistas = intent.getIntExtra("intNopistas", 0)
        val boolbajo = intent.getBooleanExtra("intbajo", false)
        val boolmedio = intent.getBooleanExtra("intMedio", false)
        val boolalto = intent.getBooleanExtra("intAlto", true)
        val boolspistas = intent.getBooleanExtra("intspinpistas", false)

        if(booltodos) {
            todoschek.setChecked(true)
            ciencia_checkbox.setChecked(true)
            musica_checkbox.setChecked(true)
            arte_checkbox.setChecked(true)
            deporte_checkbox.setChecked(true)
            cine_checkbox.setChecked(true)
            videojuegos_checkbox.setChecked(true)
        }
        if ( boolciencia) {
            ciencia_checkbox.setChecked(true)
        }
        if (boolcine) {
            ciencia_checkbox.setChecked(true)
        }
        if (booldeporte) {
            deporte_checkbox.setChecked(true)
        }
        if (boolmusica) {
            musica_checkbox.setChecked(true)
        }
        if (boolarte) {
            arte_checkbox.setChecked(true)
        }
        if (boolvideojuegos) {
            videojuegos_checkbox.setChecked(true)
        }

        if (boolspistas) {
            switch.setChecked(true)
        }

        if (!switch.isChecked()) {
            spinnerpistas.setEnabled(false)
        }

        if (stringNopreguntas == 5) {
            spinner.setSelection(0)
        }

        if (stringNopreguntas == 6) {
            spinner.setSelection(1)
        }

        if (stringNopreguntas == 7) {
            spinner.setSelection(2)
        }

        if (stringNopreguntas == 8) {
            spinner.setSelection(3)
        }

        if (stringNopreguntas == 9) {
            spinner.setSelection(4)
        }

        if (stringNopreguntas == 10) {
            spinner.setSelection(5)
        }

        if (stringNoCpistas == 1) {
            spinnerpistas.setSelection(0)
        }

        if (stringNoCpistas == 2) {
            spinnerpistas.setSelection(1)
        }

        if (stringNoCpistas == 3) {
            spinnerpistas.setSelection(2)
        }

        if (boolbajo) {
            bajo.setChecked(true)
        }

        if (boolmedio) {
            medio.setChecked(true)
        }

        if (boolalto) {
            Alto.setChecked(true)
        }


        if (!cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && videojuegos_checkbox.isChecked || cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked ||
                !cine_checkbox.isChecked && ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked || !cine_checkbox.isChecked && !ciencia_checkbox.isChecked && deporte_checkbox.isChecked && !arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked ||
                !cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && arte_checkbox.isChecked && !musica_checkbox.isChecked && !videojuegos_checkbox.isChecked || !cine_checkbox.isChecked && !ciencia_checkbox.isChecked && !deporte_checkbox.isChecked && !arte_checkbox.isChecked && musica_checkbox.isChecked && !videojuegos_checkbox.isChecked) {
            spinner.isEnabled = false
            spinner.setSelection(0)
        } else {
            spinner.isEnabled = true
        }



        switch.setOnCheckedChangeListener { _, _ ->
            if (switch.isChecked == false) {
                spinnerpistas.isEnabled = false
            }
            if (switch.isChecked) {
                spinnerpistas.isEnabled = true
            }


        }


    }


    override fun onBackPressed() {
        flagenvio = true
        val intent = Intent(this@Opciones, MainActivity::class.java)

        intent.putExtra("intTodos", todoschek.isChecked())
        intent.putExtra("intciencia", ciencia_checkbox.isChecked())
        intent.putExtra("intcine", cine_checkbox.isChecked() )
        intent.putExtra("intdeporte", deporte_checkbox.isChecked())
        intent.putExtra("intmusica", musica_checkbox.isChecked())
        intent.putExtra("intarte", arte_checkbox.isChecked())
        intent.putExtra("intvideojuegos", videojuegos_checkbox.isChecked())
        intent.putExtra("intNoQuestions", spinner.getSelectedItem().toString().toInt());
        intent.putExtra("intNopistas", spinnerpistas.getSelectedItem().toString().toInt());
        intent.putExtra("intbajo", bajo.isChecked())
        intent.putExtra("intMedio", medio.isChecked())
        intent.putExtra("intAlto", Alto.isChecked())
        intent.putExtra("intspinpistas", switch.isChecked())
        intent.putExtra("flagop", flagenvio)
        startActivity(intent)





    }

}
