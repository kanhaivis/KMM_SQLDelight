package kk.kmm_sqldelight

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}