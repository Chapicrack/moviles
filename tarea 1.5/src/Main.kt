import kotlin.random.Random

// Función principal para jugar al juego de Adivina el Número.
fun jugarAdivinaNumero() {
    // Generar un número aleatorio entre 1 y 30 que el jugador debe adivinar.
    val numeroAdivinar = Random.nextInt(1, 31)
    // Inicializar el número de intentos y la bandera para verificar si se ha adivinado el número.
    var intentos = 5
    var adivinado = false

    // Mensaje de bienvenida al juego.
    println("¡Bienvenido al juego de Adivina el Número!")
    println("Tienes 5 intentos para adivinar un número entre 1 y 30.")

    // Ciclo mientras haya intentos y el número no haya sido adivinado.
    while (intentos > 0 && !adivinado) {
        // Solicitar al jugador que ingrese su intento.
        print("Ingresa tu adivinanza: ")
        val intento = readLine()?.toIntOrNull()

        // Verificar si el intento es válido.
        if (intento == null || intento !in 1..30) {
            println("Por favor, ingresa un número válido entre 1 y 30.")
            continue
        }

        // Comparar el intento del jugador con el número a adivinar.
        when {
            intento < numeroAdivinar -> println("El número a adivinar es mayor.")
            intento > numeroAdivinar -> println("El número a adivinar es menor.")
            else -> {
                println("¡Felicitaciones! ¡Has adivinado el número correctamente!")
                adivinado = true
            }
        }

        // Decrementar el número de intentos.
        intentos--
    }

    // Mensaje final si el jugador no ha adivinado el número.
    if (!adivinado) {
        println("¡Game over! El número a adivinar era: $numeroAdivinar")
    }
}

// Función principal que ejecuta el juego.
fun main() {
    jugarAdivinaNumero()
}

