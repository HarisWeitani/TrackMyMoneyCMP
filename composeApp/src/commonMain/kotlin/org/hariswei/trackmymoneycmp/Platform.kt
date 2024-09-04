package org.hariswei.trackmymoneycmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform