package com.marianunez.katas

/*
 * Challenge #11
 * ELIMINANDO CARACTERES
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 */

private fun main() {
    renderOutputs("hhhhhhola1987", "ola234")
}

private fun renderOutputs(str1: String, str2: String) {
    val out1 = mutableSetOf<String>()
    val out2 = mutableSetOf<String>()

    // otra opción es sacar la función fuera para que se le asigne el valor al out1 y luego pintarlo
    compareStrings(str1, str2, out1)
    compareStrings(str2, str1, out2)

    println("This letters exist in str1 but not in str2: ${out1.joinToString("")}")
    println("This letters exist in str2 but not in str1: ${out2.joinToString("")}")
}

private fun compareStrings(string1: String, string2: String, output: MutableSet<String>) {
    string1.lowercase().splitToSequence("").map { str1 ->
        if (string2.lowercase().contains(str1).not()) {
            output.add(str1)
        }
    }.toSet()
}