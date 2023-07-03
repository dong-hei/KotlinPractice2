package com.example.kotlinpractice2

//1.람다
//람다식은 우리가 마치 val 처럼 다룰수 있는 익명함수이다.
//메소드의 파라미터로 넘겨줄수있다. fun maxBy(a : Int)
//리턴값으로 사용할 수가 있다.

//람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}

val peopleInform = {name : String, age : Int -> "my name is ${name} I'm ${age}"}

fun main(){
    println(square(12))
    println(peopleInform("kim",33))

    val a = "Kim said "
    val b = "David said "
    println(a.ForHamburgerOpnion())
    println(b.ForHamburgerOpnion())

    println(extendString("James",31))

    println(calculateGrade(101))

    val lamda = {
        number : Double -> number == 5.2343
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))
    //파람 안에 true를 넣어도 되고 it을 넣어도 된다

    invokeLamda { it > 3.22 }
    //마지막 파라미터가 람다식이면 생략 가능하다.
}

//확장함수

val ForHamburgerOpnion : String.() -> String = {
    this + "Hamburger is always Right"
}

fun extendString(name : String, age : Int) : String {

    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"
    }
    return name.introduceMyself(age)
}
//여기서 this는 확장함수가 불러줄 O it은 String 옆에있는 파라미터 (Int)를 의미한다

//2.람다의 Return

val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "C"
        in 70..79 -> "B"
        in 80..84 -> "B+"
        in 85..90 -> "A"
        in 91..100 -> "A+"
        else -> "Error"
    }
}
//마지막 한줄이 리턴값을 의미한다 고로 위 함수에서 else를 런타임적지않으면 에러가 발생한다

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

