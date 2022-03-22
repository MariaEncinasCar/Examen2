package equipo3.examen2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
import android.widget.BaseAdapter
import android.widget.ListView
=======
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

>>>>>>> terminado

class carritoActivity : AppCompatActivity() {

        var carrito = ArrayList<Detalles1>()
        var carrito2 = ArrayList<Detalles2>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)
<<<<<<< HEAD

        agregarPedido()
        var adapter = Detalles1(this, pedido)
        var adapter = Detalles2(this, pedido)
        var listView: ListView = findViewById(R.id.listProductos)
        listview.adapter = adapter
=======
        var total : TextView  = findViewById(R.id.tv_total)
        var formatted = String.format("%.2f",Carrito.getTotal())
        total.setText(formatted)
        var listView: ListView = findViewById(R.id.list_pedidos) as ListView
        var adaptador = carritoActivity.AdaptadorCarrito(this, Carrito.compra)
        listView.adapter=adaptador
>>>>>>> terminado

    }


<<<<<<< HEAD
    private class Detalles1: BaseAdapter {
        var pedido = ArrayList()

    }

    private class Detalles2: BaseAdapter {
        var pedido = ArrayList()

=======
    private class AdaptadorCarrito: BaseAdapter {
        var compra = ArrayList<ElementoCarro>()
        var contexto: Context? = null

        constructor(contexto: Context, compra: ArrayList<ElementoCarro>) {
            this.compra = compra
            this.contexto = contexto

        }

        override fun getCount(): Int {
            return compra.size
        }

        override fun getItem(p0: Int): Any {
            return compra[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val prod = compra[p0]
            val inflador = LayoutInflater.from(contexto)
            val vista = inflador.inflate(R.layout.detalle_carrito, null)

            var imagen = vista.findViewById(R.id.pedido_img) as ImageView
            var nombre = vista.findViewById(R.id.pedido_nombre) as TextView
            var precio = vista.findViewById(R.id.pedido_precio) as TextView
            var cantidad = vista.findViewById(R.id.pedido_cantidad) as TextView

            var btnEliminar = vista.findViewById(R.id.btn_eliminar) as Button


            var formatted = String.format("%.2f",prod.total)

            imagen.setImageResource(prod.producto.image)
            nombre.setText(prod.producto.name)
            precio.setText(formatted)
            cantidad.setText(prod.cantidad.toString())

            btnEliminar.setOnClickListener{
                Carrito.compra.remove(prod)
                var intent: Intent = Intent(contexto,Menu::class.java)
                contexto!!.startActivity(intent)
            }

            return vista
        }
>>>>>>> terminado
    }

}