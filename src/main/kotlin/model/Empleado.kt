package model

abstract class Empleado(val n:String, val e:Int, var sal:Int) {
    //constructor() : this()


    var nombre:String
    var edad:Int
    var salario:Int
    var plus:Int

    init{
        nombre ="indef"
        edad = 0
        salario = 0
        plus = 0
    }
    /*
    constructor(nombre:String, edad:Int, salario:Int):this(){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    */

  //  constructor() : this()
}