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

fun <E> MutableList<E>.unshift(e: E) = add(0, e)

fun <E> List<E>.include(e: E): Boolean = contains(e)


val <T> Array<T>.length
    get() = size

val <T> Collection<T>.length
    get() = size

//val <T> Array<T>.length by alias(Array<T>::size)
//val <T> Collection<T>.length by alias(Collection<T>::size)
//
//fun <R, T> alias(alias: KProperty1<R, T>) = object : ReadOnlyProperty<R, T> {
//    override operator fun getValue(thisRef: R, property: KProperty<*>): T {
//        return alias.get(thisRef)
//    }
//}









