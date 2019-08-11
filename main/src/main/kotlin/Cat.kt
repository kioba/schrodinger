import java.util.function.Function

fun <A> empty(): A? = null

fun <A> identity(a: A): A = a

fun <A> A?.isEmpty(): Boolean = this == null

fun <A> A?.isSome(): Boolean = !isEmpty()

fun <A> Boolean.maybe(f: () -> A): A? = if (this) f() else null

inline fun <A, B> A?.fold(ifNull: () -> B, ifSome: (A) -> B): B = if (this == null) ifNull() else ifSome(this)

inline fun <A, B> A?.map(f: (A) -> B): B? = flatMap(f)

inline fun <A, B> A?.flatMap(f: (A) -> B?): B? = this?.let(f)

inline fun <A> A?.filter(f: (A) -> Boolean): A? = flatMap { a -> if (f(a)) a else null }

inline fun <A> A?.filterNot(f: (A) -> Boolean): A? = flatMap { a -> if (!f(a)) a else null }

inline fun <A> A?.exists(f: (A) -> Boolean): Boolean = fold({ false }, f)

inline fun <A> A?.orElse(f: () -> A): A = fold(f, ::identity)

fun <A> A?.or(a: A): A = fold({ a }, ::identity)

fun <A, B> A?.ap(ff: ((A) -> B)?): B? = ff.flatMap { this.map(it) }
