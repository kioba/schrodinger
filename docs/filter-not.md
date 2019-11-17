[schrodinger ](index.md) / [filterNot](./filter-not.md)

# filterNot

`inline fun <A> `[`A`](filter-not.md#A)`?.filterNot(f: (`[`A`](filter-not.md#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`A`](filter-not.md#A)`?`

Returns the $receiver value if the result of $f applied on it is false otherwise null.

Example usage:

```
1.filterNot{ it > 5 } // 1

1.filterNot{ it < 5 } // null
```

### Parameters

`f` - function to apply in the right side value.

**Receiver**
the vlaue which $f will be appliead on.

**Return**
the receiver if the result of applying $f on the right side value is false otherwise null.

