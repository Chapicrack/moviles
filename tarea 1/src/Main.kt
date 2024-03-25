// Función principal que ejecuta el programa.
fun main() {
    // Solicitar el salario mensual al usuario.
    val salarioMensual = solicitarSalarioMensual()

    // Solicitar la puntuación en la evaluación al usuario.
    val puntuacion = solicitarPuntuacion()

    // Obtener el nivel de rendimiento en función de la puntuación.
    val nivelRendimiento = obtenerNivelRendimiento(puntuacion)

    // Calcular la cantidad de dinero recibido en función del salario y la puntuación.
    val cantidadDineroRecibido = calcularCantidadDinero(salarioMensual, puntuacion)

    // Imprimir los resultados.
    println("Resultado:")
    println("Nivel de Rendimiento: $nivelRendimiento")
    println("Cantidad de Dinero Recibido: \$$cantidadDineroRecibido")
}

// Función para solicitar el salario mensual al usuario.
fun solicitarSalarioMensual(): Double {
    print("Ingrese su salario mensual: ")
    return readLine()?.toDoubleOrNull() ?: 0.0
}

// Función para solicitar la puntuación en la evaluación al usuario.
fun solicitarPuntuacion(): Int {
    print("Ingrese su puntuación en la evaluación (0-10): ")
    return readLine()?.toIntOrNull() ?: 0
}

// Función para obtener el nivel de rendimiento en función de la puntuación.
fun obtenerNivelRendimiento(puntuacion: Int): String {
    return when (puntuacion) {
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Puntuación no válida"
    }
}

// Función para calcular la cantidad de dinero recibido en función del salario y la puntuación.
fun calcularCantidadDinero(salarioMensual: Double, puntuacion: Int): Double {
    return salarioMensual * (puntuacion.toDouble() / 10.0)
}
