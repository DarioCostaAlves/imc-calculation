package pt.ipmaia.estg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    lateinit var oBotao: Button
    lateinit var oNome: EditText
    lateinit var oPeso: EditText
    lateinit var aAltura: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            oBotao = findViewById(R.id.botaoExecutar)
            oNome = findViewById(R.id.campoNome)
            oPeso = findViewById(R.id.campoPeso)
            aAltura = findViewById(R.id.campoAltura)

        oBotao.setOnClickListener {
            val nome = oNome.text.toString()
            val peso = oPeso.text.toString().toDouble()
            val altura = aAltura.text.toString().toDouble()
            //Calcular imc
            val imc = (peso / (altura*altura)).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()

            Toast.makeText(applicationContext, "$nome - $imc imc", Toast.LENGTH_SHORT).show()

        }
    }
}