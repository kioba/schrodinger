---
title: filter - schrodinger
---

[schrodinger](../index.html) / [dev.kioba.cat](index.html) / [filter](./filter.html)

# filter

`inline fun <A> `[`A`](filter.html#A)`?.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`A`](filter.html#A)`?`

Returns the $receiver value if the result of $f applied on it is true otherwise null.

Example usage:

```
1.filter{ it > 5 } // null

1.filter{ it < 5 } // 1
```

### Parameters

`f` - function to apply in the right side value.

**Receiver**
the vlaue which $f will be appliead on.

**Return**
the receiver if the result of applying $f on the right side value is true otherwise null.
