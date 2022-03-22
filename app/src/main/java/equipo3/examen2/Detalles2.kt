package equipo3.examen2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Detalles2 : AppCompatActivity() {
    var precio : Double = 0.0
    var total : Double = 0.0
    var cantidad : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles2)

        val producto_nombre: TextView = findViewById(R.id.nombreProducto)
        val producto_precio: TextView = findViewById(R.id.precioProducto)
        val producto_img: ImageView = findViewById(R.id.imagenProducto)
        val producto_total: TextView = findViewById(R.id.producto_total)

        val bundle = intent.extras

        if(bundle!=null)
        {
            var queEs = bundle.getString("nombre")
            if (queEs != null) {
                Log.d("nombre de product view ", queEs)
            }
            producto_nombre.setText(bundle.get("nombre").toString())
            producto_img.setImageResource(bundle.getInt("imagen"))
            precio = bundle.getDouble("precio")
            total  = bundle.getDouble("precio")
            producto_precio.setText(precio.toString())
            producto_total.setText(precio.toString())
        }

        val btn_mas: Button = findViewById(R.id.masArticulo)
        val btn_menos: Button = findViewById(R.id.menosArticulo)
        val producto_cantidad: TextView = findViewById(R.id.cantidadProducto)

        btn_mas.setOnClickListener{
            cantidad += 1
            total = cantidad * precio
            var formatted = String.format("%.2f",total)
            producto_cantidad.setText(cantidad.toString())
            producto_total.setText(formatted)
        }

        btn_menos.setOnClickListener{
            cantidad = when(cantidad > 0){
                true -> cantidad - 1
                false -> 0
            }
            total = cantidad * precio
            var formatted = String.format("%.2f",total)
            producto_cantidad.setText(cantidad.toString())
            producto_total.setText(formatted)

        }
    }
}