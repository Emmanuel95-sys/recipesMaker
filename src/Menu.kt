fun main() {

    do{
        println("***********MENU***************")
        println("Selecciona la opción deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")
        var response:String? = readLine()
        println("opcion elegida: $response")
        when(response){
            "1" -> println("Metodo para hacer recetas\n")
            "2" -> println("Metodo para mostrar recetas\n")
            "3" -> println("Bye bye\n")
            else -> println("Seleccione una opcion valida")
        }
    }while(response != "3")
}