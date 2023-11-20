package com.example.appsaude.UI

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.appsaude.R

class TelaInicial : AppCompatActivity() {

    private val TEMPO_DE_ATRASO = 700


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        CarregamentoAssincrono().execute()
    }

    private inner class CarregamentoAssincrono : AsyncTask<Void, Void, Void>() {
        override fun doInBackground(vararg params: Void?): Void? {
            // Realize operações pesadas aqui

            return null
        }

        override fun onPostExecute(result: Void?) {
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@TelaInicial, TelaFiltro::class.java)
                startActivity(intent)

                finish()
            }, TEMPO_DE_ATRASO.toLong())
        }
    }
}