//class or object
class cars(){
    //attributes
    var color = ""
    var modelo = 0
    var marca = ""

    //Methods
    fun acelera(){
        println("Acelera a 200km/h")
    }

    fun enciende(){
        println("Encendido por boton")
    }

    fun apagar(){
        println("Apagado por boton")
    }
}

//Instances
var bmwx5 = cars()
bmwx5.color = "verde"
bmwx5.modelo = 2029
bmwx5.marca = "BMW"
println(bmwx5.color)
println(bmwx5.modelo)
println(bmwx5.marca)
bmwx5.enciende()
bmwx5.acelera()
bmwx5.apagar()

var glecoupe = cars()
glecoupe.color = "Verde"
glecoupe.modelo = 2029
glecoupe.marca = "Mercedez Benz"
println(glecoupe.color)
println(glecoupe.modelo)
println(glecoupe.marca)
glecoupe.enciende()
glecoupe.acelera()
glecoupe.apagar()