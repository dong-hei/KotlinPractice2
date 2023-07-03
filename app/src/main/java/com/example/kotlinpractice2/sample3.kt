package com.example.kotlinpractice2

//companion O 는 Java Static 역할의 정적인 메소드

class Book private constructor(val id : Int, val bookName : String){

    companion object library : IdProvider{

        override fun getId(): Int {
            return 442
        }

        val myBook = "new Book"

        fun create() = Book(getId(),myBook)
    }
}

interface  IdProvider {
    fun getId() : Int
}

fun main(){
    val book = Book.create()
    val bookId = Book.library.getId()

    println("아이디 ${bookId} , ${book.bookName}는 이달의 책으로 선정되었습니다.")
}
