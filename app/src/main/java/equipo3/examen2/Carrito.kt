package equipo3.examen2

class Carrito {
    companion object {
        var compra: ArrayList<ElementoCarro> = ArrayList<ElementoCarro>()

            fun getTotal() : Double {
                var total : Double = 0.0
                for (elemento in compra){
                    total += elemento.total
                }
                return  total
            }
    }

    init {
        compra = ArrayList<ElementoCarro>()
    }

}
