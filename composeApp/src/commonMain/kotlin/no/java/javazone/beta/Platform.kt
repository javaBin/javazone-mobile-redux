package no.java.javazone.beta

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform