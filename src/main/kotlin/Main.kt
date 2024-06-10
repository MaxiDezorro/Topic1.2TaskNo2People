package ru.netology

fun main() {
    val likes: Int = 10171
    val exception = 1


    val like: String = likes.toString()
    // заканчивается на 1 и не заканчивается на 11
    if (likes == exception || (like.length > 1 && like.get(like.length - 2) != '1') && like.endsWith('1')) {
        println("понравилось $likes человеку")
    } else {
        println("понравилось $likes людям")
    }


}