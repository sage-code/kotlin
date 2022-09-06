// File: Main.kt

fun menu() {
    println("------ main menu---")
    println("0 - Exit program!")
    println("1 - Hello World!")
    println("2 - Hello World!")
    println("--------------------")
}

fun main(args: Array<String>) {
    menu()
    var op = "1"
    while (op != "0") {
        print("option:>")
        op = readLine().toString()
        when (op) {
            "0" ->  op = "0";
            "1" ->  hello();
            "2" ->  hello();
            else -> {
                println("ERROR: invalid option")
                menu()
            }
        }
    }
}

fun hello() {
    println("Hello World!")
}
