package kt.ruby

/**
 * Created by natsuki on 16/06/2017.
 */
fun <T> List<T>.at(idx: Int) = this[idx]

fun <E> List<E>.include(e: E): Boolean = contains(e)

fun <T> List<T>.fetch(idx: Int, default: T) = if (idx >= size) default else this[idx]

fun <T> List<T>.compact() = filter { it != null }

fun <T> List<T>.findIndex(block: (T) -> Boolean) = auto {
    forEachIndexed { index, t ->
        if (block(t)) {
            return@auto index
        }
    }
    return@auto null
}

