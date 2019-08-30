---
title: dev.kioba.cat - schrodinger
---

[schrodinger](../index.html) / [dev.kioba.cat](./index.html)

## Package dev.kioba.cat

### Extensions for External Classes

| [kotlin.Boolean](kotlin.-boolean/index.html) |  |

### Functions

| [empty](empty.html) | `fun <A> empty(): `[`A`](empty.html#A)`?`<br>Constructs a left side value. |
| [exists](exists.html) | `fun <A> `[`A`](exists.html#A)`?.exists(f: (`[`A`](exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [filter](filter.html) | `fun <A> `[`A`](filter.html#A)`?.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`A`](filter.html#A)`?`<br>Returns the $receiver value if the result of $f applied on it is true otherwise null. |
| [filterNot](filter-not.html) | `fun <A> `[`A`](filter-not.html#A)`?.filterNot(f: (`[`A`](filter-not.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`A`](filter-not.html#A)`?`<br>Returns the $receiver value if the result of $f applied on it is false otherwise null. |
| [flatMap](flat-map.html) | `fun <A, B> `[`A`](flat-map.html#A)`?.flatMap(f: (`[`A`](flat-map.html#A)`) -> `[`B`](flat-map.html#B)`?): `[`B`](flat-map.html#B)`?`<br>Returns the result of $f if the $receiver is a right side value. |
| [fold](fold.html) | `fun <A, B> `[`A`](fold.html#A)`?.fold(ifNull: () -> `[`B`](fold.html#B)`, ifSome: (`[`A`](fold.html#A)`) -> `[`B`](fold.html#B)`): `[`B`](fold.html#B)<br>Fold higher order function reduces the left or right side into a return value |
| [id](id.html) | `fun <A> id(a: `[`A`](id.html#A)`): `[`A`](id.html#A)<br>Identity function. |
| [isEmpty](is-empty.html) | `fun <A> `[`A`](is-empty.html#A)`?.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if the values is left value or not. |
| [isSome](is-some.html) | `fun <A> `[`A`](is-some.html#A)`?.isSome(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if the values is right value or not. |
| [map](map.html) | `fun <A, B> `[`A`](map.html#A)`?.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`B`](map.html#B)`?`<br>Map higher order function takes the right side value and applies f. |
| [or](or.html) | `fun <A> `[`A`](or.html#A)`?.or(a: `[`A`](or.html#A)`): `[`A`](or.html#A) |
| [orElse](or-else.html) | `fun <A> `[`A`](or-else.html#A)`?.orElse(f: () -> `[`A`](or-else.html#A)`): `[`A`](or-else.html#A) |

