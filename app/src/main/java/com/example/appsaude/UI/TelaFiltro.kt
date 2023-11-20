package com.example.appsaude.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.appsaude.R
import org.w3c.dom.Text

class TelaFiltro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_filtro)

        //dados da lista
        val listaCidades = arrayOf("Brusque", "Itajaí", "Florianópolis")

        //criar arrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaCidades)

        //especificar o layout a ser usado quando a lista de opções aparecer
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        //Configurar o spinner
        val spinner: Spinner = findViewById(R.id.selectCidade)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: android.view.View?,
                position: Int,
                id: Long
            ) {
                val cidadeSelecionada = listaCidades[position]
                PreencherInfosPorCidade(cidadeSelecionada)

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Código a ser executado quando nada é selecionado
            }
        }
    }

    fun PreencherInfosPorCidade(cidadeSelecionada: String) {
        when (cidadeSelecionada) {
            "Brusque" -> {
                PreencherInfosPsicoBrusque()
            }

            "Itajaí" -> {
                PreencherInfosPsicoItajai()
            }

            "Florianópolis" -> {
                PreencherInfosPsicoFloripa()
            }
        }
    }

    fun PreencherInfosPsicoBrusque() {
        val nome1 = findViewById<TextView>(R.id.nome1)
        val cidade1 = findViewById<TextView>(R.id.cidade1)
        val abordagem1 = findViewById<TextView>(R.id.abordagem1)
        val celular1 = findViewById<TextView>(R.id.celular1)

        nome1.text = "Dr. João da Silva"
        cidade1.text = "Brusque - SC"
        abordagem1.text = "Terapia Cognitivo-Comportamental"
        celular1.text = "(47) 98765 4321"

        val nome2 = findViewById<TextView>(R.id.nome2)
        val cidade2 = findViewById<TextView>(R.id.cidade2)
        val abordagem2 = findViewById<TextView>(R.id.abordagem2)
        val celular2 = findViewById<TextView>(R.id.celular2)

        nome2.text = "Dra. Maria Santos"
        cidade2.text = "Brusque - SC"
        abordagem2.text = "Psicoterapia Humanista"
        celular2.text = "(47) 93456 7890"

        val nome3 = findViewById<TextView>(R.id.nome3)
        val cidade3 = findViewById<TextView>(R.id.cidade3)
        val abordagem3 = findViewById<TextView>(R.id.abordagem3)
        val celular3 = findViewById<TextView>(R.id.celular3)

        nome3.text = "Dr. Pedro Oliveira"
        cidade3.text = "Brusque - SC"
        abordagem3.text = "Análise Transacional"
        celular3.text = "(47) 97890 1234"
    }

    fun PreencherInfosPsicoItajai() {
        val nome1 = findViewById<TextView>(R.id.nome1)
        val cidade1 = findViewById<TextView>(R.id.cidade1)
        val abordagem1 = findViewById<TextView>(R.id.abordagem1)
        val celular1 = findViewById<TextView>(R.id.celular1)

        nome1.text = "Dr. Lucas Martins"
        cidade1.text = "Itajaí - SC"
        abordagem1.text = "Terapia Cognitivo-Comportamental"
        celular1.text = "(47) 98765 4321"

        val nome2 = findViewById<TextView>(R.id.nome2)
        val cidade2 = findViewById<TextView>(R.id.cidade2)
        val abordagem2 = findViewById<TextView>(R.id.abordagem2)
        val celular2 = findViewById<TextView>(R.id.celular2)

        nome2.text = "Dra. Carolina Lima"
        cidade2.text = "Itajaí - SC"
        abordagem2.text = "Gestalt-Terapia"
        celular2.text = "(47) 93456 7890"

        val nome3 = findViewById<TextView>(R.id.nome3)
        val cidade3 = findViewById<TextView>(R.id.cidade3)
        val abordagem3 = findViewById<TextView>(R.id.abordagem3)
        val celular3 = findViewById<TextView>(R.id.celular3)

        nome3.text = "Dr. Rafael Silva"
        cidade3.text = "Itajaí - SC"
        abordagem3.text = "Psicoterapia Breve"
        celular3.text = "(47) 97890 1234"
    }

    fun PreencherInfosPsicoFloripa() {
        val nome1 = findViewById<TextView>(R.id.nome1)
        val cidade1 = findViewById<TextView>(R.id.cidade1)
        val abordagem1 = findViewById<TextView>(R.id.abordagem1)
        val celular1 = findViewById<TextView>(R.id.celular1)

        nome1.text = "Dr. Roberto Dias Cardoso"
        cidade1.text = "Florianópolis - SC"
        abordagem1.text = "Terapia Cognitivo-Comportamental"
        celular1.text = "(48) 99855 3445"

        val nome2 = findViewById<TextView>(R.id.nome2)
        val cidade2 = findViewById<TextView>(R.id.cidade2)
        val abordagem2 = findViewById<TextView>(R.id.abordagem2)
        val celular2 = findViewById<TextView>(R.id.celular2)

        nome2.text = "Dra. Eloisa Montebelle"
        cidade2.text = "Florianópolis - SC"
        abordagem2.text = "Terapia Analítica"
        celular2.text = "(48) 99569 7112"

        val nome3 = findViewById<TextView>(R.id.nome3)
        val cidade3 = findViewById<TextView>(R.id.cidade3)
        val abordagem3 = findViewById<TextView>(R.id.abordagem3)
        val celular3 = findViewById<TextView>(R.id.celular3)

        nome3.text = "Dr. Leonardo Sanches"
        cidade3.text = "Florianópolis - SC"
        abordagem3.text = "Psicoterapia Breve"
        celular3.text = "(48) 98588 7818"
    }
}