# or

`inline fun <A> A?.or(f: () -> A): A`

Returns the $receiver if it exists otherwise result of $f.

Example usage:

```
null.or{ 5 } // 5

1.or{ 5 } // 1
```

### Parameters

`f` - function which will be returned if the $receiver is a left side vaule.

**Receiver**
the vlaue which will be returned if it is a right side value.

**Return**
the result of applying $f or the $receiver.

