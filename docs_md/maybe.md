# maybe

`fun <A> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`.maybe(f: () -> A): A?`

returns the result of $f in case of the receiver is true otherwsie null.

Example usage:

```
true.maybe{ 1 } // 1

false.maybe{ 1 } // null
```

### Parameters

`f` - function to apply if the receiver is true.

**Receiver**
value which $f will be applied on.

**Return**
the result of f if the receiver is true otherwise null.

