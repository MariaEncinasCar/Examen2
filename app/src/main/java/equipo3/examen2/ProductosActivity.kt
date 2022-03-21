package equipo3.examen2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosActivity : AppCompatActivity() {

    var menu =  ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        menu.clear()

        var menuOption: String? = intent.getStringExtra("type")
        agregarProductos(menuOption)

        var listView: ListView = findViewById(R.id.listProductos) as ListView
        var adaptador = AdaptadorProductos(this, menu)
        listView.adapter=adaptador
    }

    fun agregarProductos(option:String?){
        when(option){
            "tacos"  -> agregarTacos()
            "sopas"  -> agregarSopas()
            "antojitos"  -> agregarAntojitos()
            "especialidades"  -> agregarEspecialidades()
            "caldos"  -> agregarCaldos()
            "combinations"  -> agregarCombinations()
            "tortas"  -> agregarTortas()
            "sides"  -> agregarSides()
            "drinks"  -> agregarBebidas()
        }

    }

    fun agregarTacos(){
        menu.add(Product(getString(R.string.tacoT), R.drawable.tacos, getString(R.string.tacoT_desc), 2.35))
        menu.add(Product(getString(R.string.tacoP), R.drawable.tacos, getString(R.string.tacoP_desc), 2.35))
    }

    fun agregarSopas(){
        menu.add(Product(getString(R.string.pozole), R.drawable.pozole, getString(R.string.pozole_desc),5.99))
        menu.add(Product(getString(R.string.menudo), R.drawable.menudo, getString(R.string.menudo_desc),5.99))
        menu.add(Product(getString(R.string.caldoRes), R.drawable.caldores, getString(R.string.caldoRes_desc),  5.99))
        menu.add(Product(getString(R.string.caldoCamaron), R.drawable.caldocamaron, getString(R.string.caldoCamaron_desc),10.69))
        menu.add(Product(getString(R.string.sopaMariscos), R.drawable.sopamariscos, getString(R.string.sopaMariscos_desc),15.75))
        menu.add(Product(getString(R.string.coctelCamaron), R.drawable.coctelcamaron, getString(R.string.coctelCamaron_desc),13.50))
    }

    fun agregarAntojitos(){
        menu.add(Product(getString(R.string.quesadilla), R.drawable.quesadillas, getString(R.string.quesadilla_desc),4.75))
        menu.add(Product(getString(R.string.huaraches), R.drawable.huarache, getString(R.string.huaraches_desc),9.87))
        menu.add(Product(getString(R.string.gringas), R.drawable.gringa, getString(R.string.gringas_desc),6.47))
        menu.add(Product(getString(R.string.sincronizadas), R.drawable.sincronizada, getString(R.string.sincronizadas_desc),6.99))
        menu.add(Product(getString(R.string.sopes), R.drawable.sopes, getString(R.string.sopes_desc),3.39))
        menu.add(Product(getString(R.string.tostadas), R.drawable.tostada, getString(R.string.tostadas_desc),3.55))
    }

    fun agregarEspecialidades(){
        menu.add(Product(getString(R.string.mojarra), R.drawable.mojarrafrita, getString(R.string.mojarra_desc), 14.49))
        menu.add(Product(getString(R.string.tostadasCev), R.drawable.tostadaceviche, getString(R.string.tostadasCev_desc), 2.99))
        menu.add(Product(getString(R.string.fajitaBurrito), R.drawable.fajitaburrito, getString(R.string.fajitaBurrito_desc), 11.79))
        menu.add(Product(getString(R.string.fajitaQuesadilla), R.drawable.fajitaquesadilla, getString(R.string.fajitaQuesadilla_desc), 12.49))
        menu.add(Product(getString(R.string.botanaC), R.drawable.botanacamaron, getString(R.string.botanaC_desc), 17.99))
        menu.add(Product(getString(R.string.coctelCamaron), R.drawable.coctelcamaron, getString(R.string.coctelCamaron_desc), 14.50))
    }

    fun agregarCaldos(){
        menu.add(Product(getString(R.string.larger), R.drawable.caldolargo, getString(R.string.larger_desc), 10.99))
        menu.add(Product(getString(R.string.camaron), R.drawable.caldocamaron, getString(R.string.camaron_desc), 11.99))
    }

    fun agregarCombinations(){
        menu.add(Product(getString(R.string.traditionalTacoCombo), R.drawable.tacos, getString(R.string.traditionalTacoCombo_desc), 6.99))
        menu.add(Product(getString(R.string.mexicanBurritos), R.drawable.fajitaburrito, getString(R.string.mexicanBurritos_desc), 10.99))
        menu.add(Product(getString(R.string.losPortalesBurrito), R.drawable.fajitaburrito, getString(R.string.losPortalesBurrito_desc), 11.79))
        menu.add(Product(getString(R.string.cinco), R.drawable.fajitaburrito, getString(R.string.cinco_desc), 7.67))
        menu.add(Product(getString(R.string.dosAmigos), R.drawable.tacos, getString(R.string.dosAmigos_desc), 8.25))
        menu.add(Product(getString(R.string.burritoPepe), R.drawable.fajitaburrito, getString(R.string.burritoPepe_desc), 6.89))
    }

    fun agregarTortas(){
        menu.add(Product(getString(R.string.tortaRegular), R.drawable.torta, getString(R.string.tortaRegular_desc), 10.95))
        menu.add(Product(getString(R.string.tortaMilanesa), R.drawable.torta, getString(R.string.tortaMilanesa_desc), 11.99))
        menu.add(Product(getString(R.string.tortaCubuana), R.drawable.torta, getString(R.string.tortaCubuana_desc), 12.35))
        menu.add(Product(getString(R.string.tortaMixta), R.drawable.torta, getString(R.string.tortaMixta_desc), 11.99))
        menu.add(Product(getString(R.string.mexicanTorta), R.drawable.torta, getString(R.string.mexicanTorta_desc), 6.89))
    }

    fun agregarSides(){
        menu.add(Product(getString(R.string.sideGuacamole), R.drawable.guarnicionguacamole, getString(R.string.sideGuacamole_desc), 3.75))
        menu.add(Product(getString(R.string.sideRice), R.drawable.guarnicionarroz, getString(R.string.sideRice_desc), 1.99))
        menu.add(Product(getString(R.string.sideBeans), R.drawable.guarnicionfrijol, getString(R.string.sideBeans_desc), 1.99))
        menu.add(Product(getString(R.string.sideChips), R.drawable.guarnicionchips, getString(R.string.sideChips_desc), 2.25))
        menu.add(Product(getString(R.string.sideTacos), R.drawable.flourtacos, getString(R.string.sideTacos_desc), 2.99))
    }

    fun agregarBebidas(){
        menu.add(Product(getString(R.string.sodas), R.drawable.vaso, getString(R.string.sodas_desc), 2.75))
        menu.add(Product(getString(R.string.jarritos), R.drawable.vaso, getString(R.string.jarritos_desc), 2.73))
        menu.add(Product(getString(R.string.aguasFrescas), R.drawable.vaso, getString(R.string.aguasFrescas_desc), 2.75))
        menu.add(Product(getString(R.string.domesticBeer), R.drawable.vaso, getString(R.string.domesticBeer_desc), 3.55))
        menu.add(Product(getString(R.string.mexicanBeer), R.drawable.vaso, getString(R.string.mexicanBeer_desc), 3.99))
        menu.add(Product(getString(R.string.micheladas), R.drawable.vaso, getString(R.string.micheladas_desc), 6.75))
        menu.add(Product(getString(R.string.caguama), R.drawable.vaso, getString(R.string.caguama_desc), 7.99))
        menu.add(Product(getString(R.string.caguamaMichelada), R.drawable.vaso, getString(R.string.caguamaMichelada_desc), 10.99))
        menu.add(Product(getString(R.string.cubetazos), R.drawable.vaso, getString(R.string.cubetazos_desc), 19.99))
        menu.add(Product(getString(R.string.lataBeer), R.drawable.vaso, getString(R.string.lataBeer_desc), 2.99))
        menu.add(Product(getString(R.string.charolazo), R.drawable.vaso, getString(R.string.charolazo_desc), 15.75))
        menu.add(Product(getString(R.string.carolazoCamarones), R.drawable.vaso, getString(R.string.carolazoCamarones_desc), 21.99))
        menu.add(Product(getString(R.string.laMamalona), R.drawable.vaso, getString(R.string.laMamalona_desc), 12.99))
        menu.add(Product(getString(R.string.laMamalonaCamarones), R.drawable.vaso, getString(R.string.laMamalonaCamarones_desc), 14.99))
        menu.add(Product(getString(R.string.cubetazo), R.drawable.vaso, getString(R.string.cubetazo_desc), 21.99))
    }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, producto: ArrayList<Product>){
            this.productos=producto
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val prod=productos[p0]
            val inflador= LayoutInflater.from(contexto)
            val vista=inflador.inflate(R.layout.producto_view, null)

            var imagen=vista.findViewById(R.id.imagenProducto) as ImageView
            var nombre=vista.findViewById(R.id.nombreProducto) as TextView
            var desc=vista.findViewById(R.id.descripcionProducto) as TextView
            var precio=vista.findViewById(R.id.precioProducto) as TextView

            //Este hace que se vaya a al producto view
            imagen.setOnClickListener{
                val intent = Intent(contexto, Detalles1::class.java)
                intent.putExtra("nombre", prod.name)
                intent.putExtra("imagen",prod.image)
                intent.putExtra("precio",prod.price)
                contexto!!.startActivity(intent)

            }

            nombre.setOnClickListener{
                val intent = Intent(contexto, Detalles1::class.java)
                intent.putExtra("nombre", prod.name)
                intent.putExtra("imagen",prod.image)
                intent.putExtra("precio",prod.price)
                contexto!!.startActivity(intent)

            }
            desc.setOnClickListener{
                val intent = Intent(contexto, Detalles1::class.java)
                intent.putExtra("nombre", prod.name)
                intent.putExtra("imagen",prod.image)
                intent.putExtra("precio",prod.price)
                contexto!!.startActivity(intent)

            }
            precio.setOnClickListener{
                val intent = Intent(contexto, Detalles1::class.java)
                intent.putExtra("nombre", prod.name)
                intent.putExtra("imagen",prod.image)
                intent.putExtra("precio",prod.price)
                contexto!!.startActivity(intent)

            }

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            print(prod.name)
            print(prod.name)
            print(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")

            return vista
        }
    }
}