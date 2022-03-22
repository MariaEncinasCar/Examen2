package equipo3.examen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnTacos : Button = findViewById(R.id.button_tacos)
        val btnCaldos : Button = findViewById(R.id.button_caldos)
        val btnAntojitos : Button = findViewById(R.id.button_antojitos)
        val btnTortas : Button = findViewById(R.id.button_tortas)
        val btnSopas : Button = findViewById(R.id.button_sopas)
        val btnDrinks : Button = findViewById(R.id.button_drinks)
        val btnEspecialidades : Button = findViewById(R.id.button_especialidades)
        val btnSides : Button = findViewById(R.id.button_sides)
        val btnCarro : Button = findViewById(R.id.carrito)

        btnCarro.setOnClickListener {
            val intent= Intent(this, carritoActivity::class.java)
            startActivity(intent)
        }

        btnTacos.setOnClickListener {
            val intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","tacos")
            startActivity(intent)
        }

        btnCaldos.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","caldos")
            startActivity(intent)
        }

        btnAntojitos.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","antojitos")
            startActivity(intent)
        }

        btnTortas.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","tortas")
            startActivity(intent)
        }

        btnSopas.setOnClickListener {
            val intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","sopas")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","drinks")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","especialidades")
            startActivity(intent)
        }

        btnSides.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("type","sides")
            startActivity(intent)
        }
    }
}