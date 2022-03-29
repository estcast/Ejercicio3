package model

class Repartidor(n: String, e: Int, sal: Int, zona:String) : Empleado(n,e,sal) {

    var zona:String = "--"

    init{
        this.zona = zona
    }

    fun hacerPlus():Unit{
        if(this.edad < 25 && this.zona=="zona 3")
            this.plus = 300
    }

    override
    fun toString():String{
        return this.nombre + "--" + this.plus
    }
}