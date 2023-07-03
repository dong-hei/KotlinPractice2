package com.example.kotlinpractice2

//3. Data Class
//Pojo Class : 메소드가 기능역할을하는 클래스가 아닌 데이터를 담는 클래스

data class region(val regionLat : Int,val regionLon : Int, val regionName : String, val regionCountry : String)

class regionNormal(val regionLat : Int,val regionLon : Int, val regionName : String, val regionCountry : String)

// toString(), hashCode(), equals(), copy()

fun main(){
    val regionA = region(37,126, "Seoul", "South Korea")
    val regionB = region(39,125, "Pyongyang", "North Korea")
    val regionC = regionNormal(35,139,"Tokyo","Japen")

    println(regionA)
    println(regionB)
    println(regionC)
    //객체를 넣으면 바로바로 출력을 해주기때문에 굉장히 편하다.
}