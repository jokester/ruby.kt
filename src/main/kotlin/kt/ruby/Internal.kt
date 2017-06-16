package kt.ruby

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.*

/**
 * Created by natsuki on 16/06/2017.
 */

fun <T> auto(block: () -> T) = block()

fun <R, T> alias(alias: KProperty1<R, T>) = object : ReadOnlyProperty<R, T> {
    override operator fun getValue(thisRef: R, property: KProperty<*>): T {
        return alias.get(thisRef)
    }
}

