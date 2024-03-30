/**
 * Descripción: Sistema de alquiler de vehículos con interfaces y clases concretas.
 * Autor: Enzo Valentino Llapa Arce
 * Fecha de creación: 29 de marzo de 2024
 * Fecha de última modificación: 29 de marzo de 2024
 */

// Interfaz para vehículos alquilables
interface VehiculoAlquilable {
    fun alquilar()
    fun devolver()
}

// Clase concreta Coche que implementa la interfaz VehiculoAlquilable
class Coche(val modelo: String) : VehiculoAlquilable {
    private var alquilado: Boolean = false

    override fun alquilar() {
        if (!alquilado) {
            alquilado = true
            println("El coche modelo $modelo ha sido alquilado.")
        } else {
            println("El coche modelo $modelo ya está alquilado.")
        }
    }

    override fun devolver() {
        if (alquilado) {
            alquilado = false
            println("El coche modelo $modelo ha sido devuelto.")
        } else {
            println("El coche modelo $modelo no está alquilado.")
        }
    }
}

// Clase concreta Moto que implementa la interfaz VehiculoAlquilable
class Moto(val marca: String) : VehiculoAlquilable {
    private var alquilado: Boolean = false

    override fun alquilar() {
        if (!alquilado) {
            alquilado = true
            println("La moto marca $marca ha sido alquilada.")
        } else {
            println("La moto marca $marca ya está alquilada.")
        }
    }

    override fun devolver() {
        if (alquilado) {
            alquilado = false
            println("La moto marca $marca ha sido devuelta.")
        } else {
            println("La moto marca $marca no está alquilada.")
        }
    }
}

fun main() {
    // Ejemplo de uso del sistema de alquiler de vehículos
    val coche1 = Coche("Toyota")
    val coche2 = Coche("Ford")
    val moto1 = Moto("Honda")
    val moto2 = Moto("Yamaha")

    coche1.alquilar()
    coche2.alquilar()
    moto1.alquilar()
    moto2.alquilar()

    coche1.devolver()
    coche2.devolver()
    moto1.devolver()
    moto2.devolver()
}