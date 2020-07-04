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
    println("ver mis recetas\n")

}

fun makeRecipe() {
    val ingredientes =
        """
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Liquidos
        2. Origen Animal
        3. Verduras
        4. Frutas
        5. Cereal
        """.trimIndent()

    println(ingredientes)
    var response:String? = readLine()
    println("opcion elegida: $response")
    when(response){
        "1" -> showLiquids()
        "2" -> showAnimalOrigin()
        "3" -> showVegetables()
        "4" -> showFruits()
        "5" ->showCereals()
        else -> println("Seleccione una opcion valida")
    }

}

fun showCereals() {
    val cereals =
        """
        Lista de cereles
        1. Arroz
        2. Maiz
        3. Trigo
        """.trimIndent()

    println(cereals)
}

fun showFruits() {
    val cereals =
        """
        Lista de cereles
        1. Manzana
        2. Uva
        3. Platano
        4. Durazno
        """.trimIndent()

    println(cereals)
}

fun showVegetables() {
    val vegetales =
        """
        Lista de Vegetales
        1. Brocoli
        2.  Pepino
        3. Lechuga
        4. Tomate
        """.trimIndent()

    println(vegetales)
}

fun showAnimalOrigin() {
    val animalOrigin =
        """
        Lista de Ingredietnes de origen animal
        1. Carne
        2.  Huevo
        """.trimIndent()

    println(animalOrigin)
}

fun showLiquids() {
    val liquidos =
        """
        Lista de ingredientes liquidos
        1. Agua
        2. Leche
        """.trimIndent()

    println(liquidos)
}
