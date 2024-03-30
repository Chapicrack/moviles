/**
 * Descripción: Sistema de gestión de empleados con clases abstractas e implementaciones de empleados a tiempo completo y medio tiempo.
 * Autor: Enzo Valentino Llapa Arce
 * Fecha de creación: 28 de marzo de 2024
 * Fecha de última modificación: 29 de marzo de 2024
 */

// Clase abstracta Empleado
abstract class Empleado(
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val salario: Double
) {
    // Método abstracto para calcular el pago
    abstract fun calcularPago(): Double
}

// Subclase EmpleadoTiempoCompleto
class EmpleadoTiempoCompleto(
    nombre: String,
    apellido: String,
    edad: Int,
    salario: Double,
    private val horasTrabajadas: Int,
    private val tarifaHora: Double
) : Empleado(nombre, apellido, edad, salario) {

    // Implementación del método para calcular el pago
    override fun calcularPago(): Double {
        return salario + horasTrabajadas * tarifaHora
    }
}

// Subclase EmpleadoMedioTiempo
class EmpleadoMedioTiempo(
    nombre: String,
    apellido: String,
    edad: Int,
    salario: Double,
    private val horasTrabajadas: Int,
    private val tarifaHora: Double,
    private val diasTrabajados: Int
) : Empleado(nombre, apellido, edad, salario) {

    // Implementación del método para calcular el pago
    override fun calcularPago(): Double {
        return salario + horasTrabajadas * tarifaHora * diasTrabajados
    }
}

fun main() {
    // Crear instancias de las subclases y ejecutar operaciones para realizar pruebas
    val empleadoCompleto = EmpleadoTiempoCompleto("Juan", "Pérez", 30, 2000.0, 40, 10.0)
    val empleadoMedioTiempo = EmpleadoMedioTiempo("María", "González", 25, 1500.0, 20, 12.0, 4)

    println("Pago de ${empleadoCompleto.nombre} ${empleadoCompleto.apellido}: ${empleadoCompleto.calcularPago()}")
    println("Pago de ${empleadoMedioTiempo.nombre} ${empleadoMedioTiempo.apellido}: ${empleadoMedioTiempo.calcularPago()}")
}
