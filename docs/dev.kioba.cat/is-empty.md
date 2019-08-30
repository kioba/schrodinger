---
title: isEmpty - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">schrodinger</a> / <a href="index.html">dev.kioba.cat</a> / <a href="./is-empty.html">isEmpty</a></div>

# isEmpty

<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="is-empty.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">isEmpty</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

Checks if the values is left value or not.

Example usage:

<pre markdown="1">val myVal: Int = null
if(myVal.isEmpty()) {
  // code
}
</pre>

**Receiver**
will be used as the value for identification.

**Return**
True if the value is null

