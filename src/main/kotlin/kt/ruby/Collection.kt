package kt.ruby

/**
 * Created by natsuki on 16/06/2017.
 */

// val <T> Collection<T>.length by alias(Collection<T>::size)

val <T> Collection<T>.length
    get() = size

