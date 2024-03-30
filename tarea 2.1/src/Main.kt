/**
 * Descripción: Clase para representar una cuenta bancaria con saldo y límite de retiro.
 * Autor: Enzo Valentino Llapa Arce
 * Fecha de creación: 28 de marzo de 2024
 * Fecha de última modificación: 29 de marzo de 2024
 */

class CuentaBancaria(private var saldo: Double, private val limiteRetiro: Double) {

    // Método para establecer el saldo
    fun setSaldo(nuevoSaldo: Double) {
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo
        } else {
            println("Error: El saldo no puede ser negativo.")
        }
    }

    // Método para obtener el saldo
    fun getSaldo(): Double {
        return saldo
    }

    // Método para realizar retiros
    fun realizarRetiro(cantidad: Double) {
        if (cantidad > 0 && cantidad <= saldo && cantidad <= limiteRetiro) {
            saldo -= cantidad
            println("Retiro exitoso. Saldo restante: $saldo")
        } else {
            println("Error: Retiro no válido.")
        }
    }
}

fun main() {
    // Ejemplo de uso de la clase CuentaBancaria
    val cuenta = CuentaBancaria(1000.0, 500.0)
    println("Saldo actual: ${cuenta.getSaldo()}")

    cuenta.realizarRetiro(200.0) // Retiro válido
    cuenta.realizarRetiro(800.0) // Retiro no válido por exceder el saldo
    cuenta.realizarRetiro(600.0) // Retiro no válido por exceder el límite de retiro
    cuenta.realizarRetiro(-100.0) // Retiro no válido por cantidad negativa

    println("Saldo final: ${cuenta.getSaldo()}")
}
