import kotlin.random.Random

// Función para jugar Piedra, Papel o Tijera.
fun jugarPiedraPapelTijera() {
    // Definir las opciones disponibles para el juego.
    val opciones = arrayOf("piedra", "papel", "tijera")

    // Elegir una opción aleatoria para la computadora.
    val opcionComputadora = opciones[Random.nextInt(opciones.size)]

    // Solicitar al usuario que elija una opción.
    print("Elige piedra, papel o tijera: ")
    val opcionUsuario = readLine()?.toLowerCase()

    // Verificar si la opción del usuario es válida.
    if (opcionUsuario in opciones) {
        // Mostrar las elecciones del usuario y de la computadora.
        println("La computadora elige: $opcionComputadora")
        println("Tú eliges: $opcionUsuario")

        // Determinar el resultado del juego.
        if (opcionUsuario == opcionComputadora) {
            println("¡Es un empate!")
        } else if ((opcionUsuario == "piedra" && opcionComputadora == "tijera") ||
            (opcionUsuario == "papel" && opcionComputadora == "piedra") ||
            (opcionUsuario == "tijera" && opcionComputadora == "papel")) {
            println("¡Ganaste!")
        } else {
            println("¡Perdiste!")
        }
    } else {
        // Mensaje de error si la opción del usuario no es válida.
        println("Opción no válida. Por favor, elige piedra, papel o tijera.")
    }
}

// Función principal que ejecuta el juego.
fun main() {
    jugarPiedraPapelTijera()
}
