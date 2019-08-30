[schrodinger](../index.md) / [dev.kioba.cat](index.md) / [map](./map.md)

# map

`inline fun <A, B> `[`A`](map.md#A)`?.map(f: (`[`A`](map.md#A)`) -> `[`B`](map.md#B)`): `[`B`](map.md#B)`?`

Map higher order function takes the right side value and applies on f.

Example usage:

```
1.map{ it.toString() } // "1"
```

```
null.map{ "Hello World" } // null
```

### Parameters

`f` - function to apply on the right side value.

**Receiver**
the value which $f will be applied if it is a right side value.

**Return**
the result of applying $f on the value if it is a right side value otherwise null.

