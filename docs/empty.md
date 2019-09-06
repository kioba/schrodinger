[schrodinger](../index.md) / [dev.kioba.cat](index.md) / [empty](./empty.md)

# empty

`fun <A> empty(): `[`A`](empty.md#A)`?`

Constructs a left side value.

Example usage:

```
val myVal = empty<Int>()
```

```
1.fold(::empty, { it })
```

**Return**
left side value.

