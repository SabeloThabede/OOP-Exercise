fun main(){
    var tiger = Animal(80)
    tiger.run()

    tiger.topSpeed = 100
    tiger.run()


}

class Animal(var topSpeed: Int){

    fun run(){
        println("The animal's Top Speed is $topSpeed km/h ")
    }


}