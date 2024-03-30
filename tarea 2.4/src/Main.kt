import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Descripción: Clase abstracta Shape con propiedades área y perímetro, y funciones para calcular estos valores.
 * Autor: Enzo Valentino Llapa Arce
 * Fecha de creación: 29 de marzo de 2024
 * Fecha de última modificación: 29 de marzo de 2024
 */

// Clase abstracta Shape
abstract class Shape {
    abstract val area: Double
    abstract val perimetro: Double

    abstract fun calcularArea()
    abstract fun calcularPerimetro()

    // Función para imprimir los resultados
    fun imprimirResultados() {
        println("Área: $area")
        println("Perímetro: $perimetro")
    }
}

// Subclase Cuadrado
class Cuadrado(val lado: Double) : Shape() {
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    override fun calcularArea() {
        area = lado * lado
    }

    override fun calcularPerimetro() {
        perimetro = lado * 4
    }
}

// Subclase Círculo
class Circulo(val radio: Double) : Shape() {
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    override fun calcularArea() {
        area = PI * radio.pow(2)
    }

    override fun calcularPerimetro() {
        perimetro = 2 * PI * radio
    }
}

// Subclase Rectángulo
class Rectangulo(val base: Double, val altura: Double) : Shape() {
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    override fun calcularArea() {
        area = base * altura
    }

    override fun calcularPerimetro() {
        perimetro = 2 * (base + altura)
    }
}

fun main() {
    // Crear instancias de las subclases y calcular área y perímetro
    val cuadrado = Cuadrado(5.0)
    cuadrado.calcularArea()
    cuadrado.calcularPerimetro()
    println("Cuadrado:")
    cuadrado.imprimirResultados()

    val circulo = Circulo(3.0)
    circulo.calcularArea()
    circulo.calcularPerimetro()
    println("Círculo:")
    circulo.imprimirResultados()

    val rectangulo = Rectangulo(4.0, 6.0)
    rectangulo.calcularArea()
    rectangulo.calcularPerimetro()
    println("Rectángulo:")
    rectangulo.imprimirResultados()
}
