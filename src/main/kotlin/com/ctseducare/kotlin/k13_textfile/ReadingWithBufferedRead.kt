package com.ctseducare.kotlin.k13_textfile

import java.io.File

fun main() {

    val lines = File("dadoscurso.txt").bufferedReader().readLines()
    lines.forEach { println(it) }

}