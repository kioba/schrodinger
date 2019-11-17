[schrodinger ](index.md) / [exists](./exists.md)

# exists

`inline fun <A> `[`A`](exists.md#A)`?.exists(f: (`[`A`](exists.md#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns the result of $f applied on the $receiver.

Example usage:

```
1.exists{ it > 5 } // false

1.exists{ it < 5 } // true
```

### Parameters

`f` - function to apply in the right side value.

**Receiver**
the vlaue which $f will be appliead on.

**Return**
the result of applying $f on the right side value otherwise false.

