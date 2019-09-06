[schrodinger](../index.md) / [dev.kioba.cat](index.md) / [flatMap](./flat-map.md)

# flatMap

`inline fun <A, B> `[`A`](flat-map.md#A)`?.flatMap(f: (`[`A`](flat-map.md#A)`) -> `[`B`](flat-map.md#B)`?): `[`B`](flat-map.md#B)`?`

Returns the result of $f if the $receiver is a right side value.

Example usage:

```
1.flatMap{ getAge() }

null.flatMap{ getAge() }
```

### Parameters

`f` - function to apply in the right side value.

**Receiver**
the vlaue which $f will be appliead if it is a right side value.

**Return**
the result of applying $f on the value if it is a right side value otherwise null.

