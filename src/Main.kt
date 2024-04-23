import java.util.Scanner

fun xxx(n : Int) {
    print("$n ")
    if (n < 2) {
        xxx(n+1)
        print("$n ")
    } else {
        print("$n ")
    }
    print("$n ")
}

fun main() {
    //xxx(-1)

    appFun()
}


//Triangle, Square, Rectangle, and Circle
fun continueFun() : Boolean {
    println("----------------------------------------------------\n")
    print("Perform another operation? [Yes/Y] or Any key to exit. > ")
    val cont = Scanner(System.`in`).next()
    if (cont == "Yes" || cont == "Y" || cont == "y") {
        appFun()
        return true
    }
    return false
}

fun scanDouble(scanner: Scanner = Scanner(System.`in`)) : Double {
    try {
        return scanner.nextDouble()
    } catch (e: Exception) {
        print("Invalid number. Try again > ")
        return scanDouble(scanner)
    }
}

fun appFun() {
    var option : Char

    println("[A] - Triangle\n" +
            "[B] - Square\n" +
            "[C] - Rectangle\n" +
            "[D] - Circle\n" +
            "[X] - Exit App")

    print("Please select the geometric figure to perform operations on\n" +
            "by entering the corresponding letter > ")
    main@ while (true) {
        option = Scanner(System.`in`).next()[0]
        println()

        when (option) {
            'A', 'a' -> {
                print("Please enter the base > ")
                val base = scanDouble()
                print("Please enter the height > ")
                val height = scanDouble()
                val area = base * height / 2
                println("Geometric figure on which operations have been made: Triangle\n" +
                        "Base of triangle: ${base}m\n" +
                        "Height of triangle: ${height}m\n" +
                        "Area of triangle: ${area}m²")
                continueFun()
                break@main
            }
            'B', 'b' -> {
                print("Please enter the side > ")
                val side = scanDouble()
                val area = side * side
                println("Geometric figure on which operations have been made: Square\n" +
                        "Side of the square: ${side}m\n" +
                        "Area of the square: ${area}m²")
                continueFun()
                break@main
            }
            'C', 'c' -> {
                print("Please enter the length > ")
                val length = scanDouble()
                print("Please enter the width > ")
                val width = scanDouble()
                val area = length * width

                println("Geometric figure on which operations have been made: Rectangle\n" +
                        "Length of rectangle: ${length}m\n" +
                        "Width of rectangle: ${width}m\n" +
                        "Area of rectangle: ${area}m²")
                continueFun()
                break@main
            }
            'D','d' -> {
                print("Please enter the radius > ")
                val radius = scanDouble()
                val area = Math.PI * radius * radius
                println("Geometric figure on which operations have been made: Circle\n" +
                        "Radius of circle: ${radius}m\n" +
                        "Area of circle: ${area}m²")
                continueFun()
                break@main
            }
            'X','x' -> {
                break@main
            }
            else -> {
                print("\nInvalid input. No calculations have been performed.\n" +
                        "Try again > ")
                continue@main
            }
        }
    }

}