[schrodinger](../index.md) / [dev.kioba.cat](./index.md)

## Package dev.kioba.cat

### Extensions for External Classes

| Name | Summary |
|---|---|
| [kotlin.Boolean](kotlin.-boolean/index.md) |  |

### Functions

| Name | Summary |
|---|---|
| [empty](empty.md) | `fun <A> empty(): `[`A`](empty.md#A)`?`<br>Constructs a left side value. |
| [exists](exists.md) | `fun <A> `[`A`](exists.md#A)`?.exists(f: (`[`A`](exists.md#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [filter](filter.md) | `fun <A> `[`A`](filter.md#A)`?.filter(f: (`[`A`](filter.md#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`A`](filter.md#A)`?`<br>Returns the $receiver value if the result of $f applied on it is true otherwise null. |
| [filterNot](filter-not.md) | `fun <A> `[`A`](filter-not.md#A)`?.filterNot(f: (`[`A`](filter-not.md#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`A`](filter-not.md#A)`?`<br>Returns the $receiver value if the result of $f applied on it is false otherwise null. |
| [flatMap](flat-map.md) | `fun <A, B> `[`A`](flat-map.md#A)`?.flatMap(f: (`[`A`](flat-map.md#A)`) -> `[`B`](flat-map.md#B)`?): `[`B`](flat-map.md#B)`?`<br>Returns the result of $f if the $receiver is a right side value. |
| [fold](fold.md) | `fun <A, B> `[`A`](fold.md#A)`?.fold(ifNull: () -> `[`B`](fold.md#B)`, ifSome: (`[`A`](fold.md#A)`) -> `[`B`](fold.md#B)`): `[`B`](fold.md#B)<br>Fold higher order function reduces the left or right side into a return value |
| [id](id.md) | `fun <A> id(a: `[`A`](id.md#A)`): `[`A`](id.md#A)<br>Identity function. |
| [isEmpty](is-empty.md) | `fun <A> `[`A`](is-empty.md#A)`?.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if the values is left value or not. |
| [isSome](is-some.md) | `fun <A> `[`A`](is-some.md#A)`?.isSome(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if the values is right value or not. |
| [map](map.md) | `fun <A, B> `[`A`](map.md#A)`?.map(f: (`[`A`](map.md#A)`) -> `[`B`](map.md#B)`): `[`B`](map.md#B)`?`<br>Map higher order function takes the right side value and applies on f. |
| [or](or.md) | `fun <A> `[`A`](or.md#A)`?.or(f: () -> `[`A`](or.md#A)`): `[`A`](or.md#A) |
| [orElse](or-else.md) | `fun <A> `[`A`](or-else.md#A)`?.orElse(f: () -> `[`A`](or-else.md#A)`): `[`A`](or-else.md#A) |
