fun main() {

    do{
        println("BIENVENIDO A RECIPE MAKER BETA 1.0")
        println("***********MENU***************")
        val menuText = """Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir""".trimIndent()
        println(menuText)
        var response:String? = readLine()
        println("opcion elegida: $response")
        when(response){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("Bye bye\n")
            else -> println("Seleccione una opcion valida")
        }
    }while(response != "3")
}

fun viewRecipe() {
    println("Metodo para hacer recetas\n")
    val ingredientes =
    """
    Hacer receta
    Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites  
    """.trimIndent()
    println(ingredientes)
}

fun makeRecipe() {
    println("Ver mis recetas\n")
}
