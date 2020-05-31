/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package hello.world

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println("Kotlin Coroutines World!")
    }
    println("Hello")
}
