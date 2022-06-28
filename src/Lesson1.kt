fun main(){
    print("Hello, fucking Kotlin!")
}

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")