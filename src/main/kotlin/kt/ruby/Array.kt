package kt.ruby

/**
 * Created by natsuki on 07/06/2017.
 */

// val <T> Array<T>.length by alias(Array<T>::size)

val <T> Array<T>.length
    get() = size

fun <T> Array<T>.at(idx: Int) = this[idx]

fun <T> Array<T>.fetch(idx: Int, default: T) = if (idx >= size) default else this[idx]

fun <T> Array<T>.compact() = filter { it != null }



