package ru.netology

fun agoToText(seconds: Int): String =
    when(seconds){
        in 0..60 -> "только что"
        in 61..3600 -> textForMinutes(seconds/60)
        in 3601..3600*24 -> textForHours(seconds/3600)
        in 3600*24+1..3600*48 -> "сегодня"
        in 3600*48+1..3600*72 -> "вчера"
        else ->"давно"
    }

fun textForHours(hours: Int): String =
    when(hours){
        1,21 -> "$hours час назад"
        in 2..4, in 22..24 -> "$hours часа назад"
        else -> "$hours часов назад"
    }


fun textForMinutes(minutes: Int): String =
    when{
        minutes in 11..14 -> "$minutes минут назад"
        minutes%10 == 1 -> "$minutes минуту назад"
        minutes%10 in 2..4 -> "$minutes минуты назад"
        else -> "$minutes минут назад"
    }

fun main() {
    val lastTime = agoToText(567)
    println("Был(а) $lastTime")
}