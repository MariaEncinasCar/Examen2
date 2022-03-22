package equipo3.examen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.ListView

class carritoActivity : AppCompatActivity() {

        var carrito = ArrayList<Detalles1>()
        var carrito2 = ArrayList<Detalles2>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        agregarPedido()
        var adapter = Detalles1(this, pedido)
        var adapter = Detalles2(this, pedido)
        var listView: ListView = findViewById(R.id.listProductos)
        listview.adapter = adapter

    }


    private class Detalles1: BaseAdapter {
        var pedido = ArrayList()

    }

    private class Detalles2: BaseAdapter {
        var pedido = ArrayList()

    }

}