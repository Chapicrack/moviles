/**
 * Descripción: Clase para representar un producto con precio y descuento aplicable.
 * Autor: Enzo Valentino Llapa Arce
 * Fecha de creación: 28 de marzo de 2024
 * Fecha de última modificación: 29 de marzo de 2024
 */

class Producto(private var precio: Double, private var descuento: Double) {

    // Método para establecer el precio
    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("Error: El precio no puede ser negativo.")
        }
    }

    // Método para obtener el precio
    fun getPrecio(): Double {
        return precio
    }

    // Método para establecer el descuento
    fun setDescuento(nuevoDescuento: Double) {
        if (nuevoDescuento >= 0 && nuevoDescuento <= 100) {
            descuento = nuevoDescuento
        } else {
            println("Error: El descuento debe estar entre 0 y 100.")
        }
    }

    // Método para obtener el descuento
    fun getDescuento(): Double {
        return descuento
    }

    // Método para calcular el precio final después de aplicar el descuento
    fun calcularPrecioFinal(): Double {
        val precioConDescuento = precio * (1 - descuento / 100)
        return precioConDescuento
    }
}

fun main() {
    // Ejemplo de uso de la clase Producto
    val producto = Producto(100.0, 20.0)
    println("Precio inicial: ${producto.getPrecio()}")

    println("Descuento aplicable: ${producto.getDescuento()}%")
    println("Precio final con descuento: ${producto.calcularPrecioFinal()}")
}