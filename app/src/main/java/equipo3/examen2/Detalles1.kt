package equipo3.examen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Detalles1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles1)
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
            producto_nombre.setText(bundle.getString("nombre"))
            producto_precio.setText(bundle.getString("precio"))
            producto_img.setImageResource(bundle.getInt("imagen"))
            producto_total.setText(bundle.getString("precio"))
        }

        val btn_mas: Button = findViewById(R.id.masArticulo)
        val btn_menos: Button = findViewById(R.id.menosArticulo)
        val producto_cantidad: TextView = findViewById(R.id.cantidadProducto)

        btn_mas.setOnClickListener{
            var cantidadInt = Integer.parseInt(producto_cantidad.text.toString())
            var precio = Integer.parseInt(producto_precio.text.toString())

            cantidadInt += 1
            producto_cantidad.setText(cantidadInt.toString())
            var  total= cantidadInt*precio
            producto_total.setText(total.toString())
        }

        btn_menos.setOnClickListener{
            var cantidadInt = Integer.parseInt(producto_cantidad.text.toString())
            var precio = Integer.parseInt(producto_precio.text.toString())
            if(cantidadInt>1){
                cantidadInt -= 1
                producto_cantidad.setText(cantidadInt.toString())
                var  total= cantidadInt*precio
                producto_total.setText(total.toString())
            }
        }
    }
}