package model

class Comercial(n: String, e: Int, sal: Int, com:Float): Empleado(n, e, sal) {
    var comision:Float = 0.0f

    init{
        this.comision = com
    }
    fun hacerPlus():Unit{
        if(this.edad > 30 && this.comision > 200)
            this.plus = 300
    }

    override
    fun toString():String{
        return this.nombre + "--" + this.plus
    }
}