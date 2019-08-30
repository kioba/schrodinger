package dev.kioba.cat


/**
 * Constructs a left side value.
 *
 * Example usage:
 *
 * ```
 * val myVal = empty<Int>()
 * ```
 *
 * ```
 *  1.fold(::empty, { it })
 * ```
 *
 * @return left side value.
 */
fun <A> empty(): A? = null


/**
 * Identity function.
 *
 * Example usage:
 *
 * ```
 * 1.fold({ 1 }, ::id)
 * ```
 *  
 * @param a the value which will be returned.
 * @return the given argument.
 */
fun <A> id(a: A): A = a


/**
 * Checks if the values is left value or not.
 *
 * Example usage:
 *
 * ```
 * val myVal: Int = null
 * if(myVal.isEmpty()) {
 *   // code
 * }
 * ```
 *
 * @receiver will be used as the value for identification.
 * @return True if the value is null
 */
fun <A> A?.isEmpty(): Boolean = 
    this == null


/**
 * Checks if the values is right value or not.
 *
 * Example usage:
 *
 * ```
 * val myVal: Int = 1
 * if(myVal.isSome()) {
 *   // code
 * }
 * ```
 *
 * @receiver the value for identification.
 * @return True if the value is some
 */
fun <A> A?.isSome(): Boolean = 
    !isEmpty()


/**
 * Fold higher order function reduces the left or right side into a return value
 *
 * Example usage:
 *
 * ```
 * null.fold({ 1 }, ::id)
 * ```
 *
 * ```
 * 1.fold(
 *  ifNull = { 1 },
 *  ifSome = ::id
 * )
 * ```
 *
 * @receiver the value it will be folded over
 * @param ifNull the lambda will be applied in case of a left side value.
 * @param ifSome the lambda will be applied with the right side value.
 * @return result of $ifNull if the $receiver is null otherwise the result of $ifSome
 */
inline fun <A, B> A?.fold(ifNull: () -> B, ifSome: (A) -> B): B = 
    if (this == null) ifNull() else ifSome(this)


/**
 * Map higher order function takes the right side value and applies on f.
 *
 * Example usage:
 *
 * ```
 * 1.map{ it.toString() } // "1"
 * ```
 *
 * ```
 * null.map{ "Hello World" } // null
 * ```
 *
 * @receiver the value which $f will be applied if it is a right side value.
 * @param f function to apply on the right side value.
 * @return the result of applying $f on the value if it is a right side value otherwise null.
 */
inline fun <A, B> A?.map(f: (A) -> B): B? = 
    flatMap(f)


/**
 * Returns the result of $f if the $receiver is a right side value.
 * 
 * Example usage:
 * 
 * ```
 * 1.flatMap{ getAge() }
 *
 * null.flatMap{ getAge() }
 * ```
 * 
 * @receiver the vlaue which $f will be appliead if it is a right side value.
 * @param f function to apply in the right side value.
 * @return the result of applying $f on the value if it is a right side value otherwise null.
 */
inline fun <A, B> A?.flatMap(f: (A) -> B?): B? = 
    this?.let(f)


/**
 * Returns the $receiver value if the result of $f applied on it is true otherwise null.
 * 
 * Example usage:
 * 
 * ```
 * 1.filter{ it > 5 } // null
 *
 * 1.filter{ it < 5 } // 1
 * ```
 * 
 * @receiver the vlaue which $f will be appliead on.
 * @param f function to apply in the right side value.
 * @return the receiver if the result of applying $f on the right side value is true otherwise null.
 */
inline fun <A> A?.filter(f: (A) -> Boolean): A? =
    flatMap { a -> if (f(a)) a else null }


/**
 * Returns the $receiver value if the result of $f applied on it is false otherwise null.
 * 
 * Example usage:
 * 
 * ```
 * 1.filterNot{ it > 5 } // 1
 *
 * 1.filterNot{ it < 5 } // null
 * ```
 * 
 * @receiver the vlaue which $f will be appliead on.
 * @param f function to apply in the right side value.
 * @return the receiver if the result of applying $f on the right side value is false otherwise null.
 */
inline fun <A> A?.filterNot(f: (A) -> Boolean): A? = 
    flatMap { a -> if (!f(a)) a else null }


/**
 *
 */
inline fun <A> A?.exists(f: (A) -> Boolean): Boolean = 
    fold({ false }, f)


/**
 *
 */
inline fun <A> A?.orElse(f: () -> A): A = 
    fold(f, ::id)


/**
 *
 */
fun <A> A?.or(f: () -> A): A = 
    fold(::f, ::id)


/**
 * returns the result of $f in case of the receiver is true otherwsie null.
 *
 * Example usage:
 * ```
 * true.maybe{ 1 } // 1
 *
 * false.maybe{ 1 } // null
 * ```
 *
 * @receiver value which $f will be applied on.
 * @param f function to apply if the receiver is true.
 * @return the result of f if the receiver is true otherwise null.
 */
fun <A> Boolean.maybe(f: () -> A): A? = 
    if (this) f() else null