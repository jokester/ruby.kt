package kt.ruby

/**
 * Created by natsuki on 07/06/2017.
 */

fun <T> List<T>.at(idx: Int) = this[idx]

fun <T> Array<T>.at(idx: Int) = this[idx]

fun <T> List<T>.fetch(idx: Int, default: T) = if (idx >= size) default else this[idx]

fun <T> Array<T>.fetch(idx: Int, default: T) = if (idx >= size) default else this[idx]

infix fun <E> MutableList<E>.lsh(e: E) = add(e)

fun <E> MutableList<E>.push(e: E) = add(e)

fun <E> List<E>.include(e: E): Boolean = contains(e)

inline val <T> Array<T>.length: Int
    get() = size

inline val <T> Collection<T>.length: Int
    get() = size




