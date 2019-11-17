# flatMap

`inline fun <A, B> A?.flatMap(f: (A) -> B?): B?`

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

