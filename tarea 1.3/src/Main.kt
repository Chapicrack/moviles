// Función para solicitar al usuario el número total de alumnos en el salón.
fun solicitarTotalAlumnos(): Int {
    print("Ingrese el número de alumnos en el salón: ")
    return readLine()?.toIntOrNull() ?: 0
}

// Función para solicitar al usuario la edad de un alumno específico.
fun solicitarEdad(numeroAlumno: Int): Int {
    print("Ingrese la edad del alumno $numeroAlumno: ")
    return readLine()?.toIntOrNull() ?: 0
}

// Función para mostrar las estadísticas de las edades de los alumnos.
fun mostrarEstadisticas(edades: IntArray) {
    // Calcular la edad máxima y mínima.
    val edadMaxima = edades.maxOrNull() ?: 0
    val edadMinima = edades.minOrNull() ?: 0

    // Imprimir las estadísticas.
    println("=== Edades ===")
    println("Máximo = $edadMaxima")
    println("Mínimo = $edadMinima")
    print("Todos = ")
    // Imprimir todas las edades.
    for (i in 0 until edades.size) {
        print(edades[i])
        if (i < edades.size - 1) {
            print(", ")
        }
    }
    println()
}

// Función principal que ejecuta el programa.
fun main() {
    // Solicitar al usuario el número total de alumnos.
    val totalAlumnos = solicitarTotalAlumnos()
    // Crear un arreglo para almacenar las edades de los alumnos.
    val edades = IntArray(totalAlumnos) { 0 }

    // Solicitar al usuario las edades de cada alumno.
    for (i in 0 until totalAlumnos) {
        edades[i] = solicitarEdad(i + 1)
    }

    // Mostrar las estadísticas de las edades.
    mostrarEstadisticas(edades)
}




