package kt.ruby

/**
 * Created by natsuki on 16/06/2017.
 */

infix fun <E> MutableList<E>.lsh(e: E) = add(e)

fun <E> MutableList<E>.push(e: E) = add(e)

fun <E> MutableList<E>.unshift(e: E) = add(0, e)

fun <E> MutableList<E>.delete(element: E) = if (remove(element)) element else null

fun <E> MutableList<E>.deleteAt(position: Int) = removeAt(position)

fun <E> MutableList<E>.deleteIf(block: (E) -> Boolean) = removeIf(block)

fun <T> MutableList<T>.shift() = removeAt(0)

fun <T> MutableList<T>.pop() = removeAt(length - 1)

fun <T> MutableList<T>.compact() = removeIf { it == null }

fun <T> MutableList<T>.drop(n: Int) = forEachIndexed { index, _ -> if (index < n) removeAt(index) }

