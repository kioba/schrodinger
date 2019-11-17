[schrodinger ](index.md) / [fold](./fold.md)

# fold

`inline fun <A, B> `[`A`](fold.md#A)`?.fold(ifNull: () -> `[`B`](fold.md#B)`, ifSome: (`[`A`](fold.md#A)`) -> `[`B`](fold.md#B)`): `[`B`](fold.md#B)

Fold higher order function reduces the left or right side into a return value

Example usage:

```
null.fold({ 1 }, ::id)
```

```
1.fold(
 ifNull = { 1 },
 ifSome = ::id
)
```

### Parameters

`ifNull` - the lambda will be applied in case of a left side value.

`ifSome` - the lambda will be applied with the right side value.

**Receiver**
the value it will be folded over

**Return**
result of $ifNull if the $receiver is null otherwise the result of $ifSome

