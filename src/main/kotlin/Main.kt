
import model.Comercial
import model.Repartidor

fun main(args: Array<String>) {

    println("hola mundo")

    var comercial = Comercial("Pedro",35, 1500, 200F)
    var repartidor = Repartidor("Ana", 40,1300,"zona 3")

    comercial.hacerPlus()
    repartidor.hacerPlus()

    println(comercial.toString())
    println(repartidor.toString())



}