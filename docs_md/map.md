# map

`inline fun <A, B> A?.map(f: (A) -> B): B?`

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

