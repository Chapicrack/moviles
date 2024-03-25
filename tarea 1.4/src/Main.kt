// Función principal que ejecuta el programa de calculadora.
fun main() {
    var opcion: Int

    // Bucle do-while para mostrar el menú y procesar la opción del usuario.
    do {
        // Mostrar el menú de operaciones.
        mostrarMenu()
        opcion = readLine()?.toIntOrNull() ?: 0

        // Procesar la opción seleccionada por el usuario.
        when (opcion) {
            1 -> realizarOperacion("Suma")
            2 -> realizarOperacion("Resta")
            3 -> realizarOperacion("Multiplicación")
            4 -> realizarOperacion("División")
            5 -> println("¡Hasta luego!") // Salir del programa
            else -> println("Opción no válida. Por favor, seleccione una opción del menú.")
        }
    } while (opcion != 5) // Continuar el bucle hasta que el usuario seleccione la opción de salida.
}

// Función para mostrar el menú de operaciones disponibles.
fun mostrarMenu() {
    println("==== Menú ====")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")
    println("5. Salir")
    print("Seleccione una opción: ")
}

// Función para realizar la operación seleccionada por el usuario.
fun realizarOperacion(nombreOperacion: String) {
    // Solicitar al usuario los dos números para la operación.
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toDoubleOrNull()
    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()

    // Verificar si se ingresaron números válidos.
    if (num1 != null && num2 != null) {
        // Realizar la operación correspondiente y mostrar el resultado.
        when (nombreOperacion) {
            "Suma" -> println("Resultado de la suma: ${num1 + num2}")
            "Resta" -> println("Resultado de la resta: ${num1 - num2}")
            "Multiplicación" -> println("Resultado de la multiplicación: ${num1 * num2}")
            "División" -> {
                if (num2 != 0.0) {
                    println("Resultado de la división: ${num1 / num2}")
                } else {
                    println("No se puede dividir por cero.")
                }
            }
        }
    } else {
        // Mensaje de error si los números ingresados no son válidos.
        println("Por favor, ingrese números válidos.")
    }
}
