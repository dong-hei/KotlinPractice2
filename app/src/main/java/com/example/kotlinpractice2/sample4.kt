package com.example.kotlinpractice2

//O 클래스
//O 클래스는 다른 클래스와 다른데, CarFactory라는 객체는 모든 앱을 실행할때 딱 한번 실행된다
//싱글톤 패턴이 적용된다 (불필요한 메모리 사용을 막는다)
object CarFactory{
    val cars = mutableListOf<Car>()
    fun carA(carName : String,horsePower : Int,manufacturer : String) : Car {
        val car = Car(carName,horsePower, manufacturer)
        cars.add(car)
        return car
    }
}

data class Car(val carName : String, val horsePower : Int, val manufacturer : String)

fun main(){
    val car = CarFactory.carA("Model3",473,"Tesla")
    val car2 = CarFactory.carA("K5",180,"Hyundai")

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())

}