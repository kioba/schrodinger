---
title: filter - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">schrodinger</a> / <a href="index.html">dev.kioba.cat</a> / <a href="./filter.html">filter</a></div>

# filter

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="filter.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">filter</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$filter(dev.kioba.cat.filter.A, kotlin.Function1((dev.kioba.cat.filter.A, kotlin.Boolean)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="filter.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="filter.html#A"><span class="identifier">A</span></a><span class="symbol">?</span></code></div>

Returns the $receiver value if the result of $f applied on it is true otherwise null.

Example usage:

<pre markdown="1">1.filter{ it &gt; 5 } // null

1.filter{ it &lt; 5 } // 1
</pre>

### Parameters

<code>f</code> - function to apply in the right side value.

**Receiver**
the vlaue which $f will be appliead on.

**Return**
the receiver if the result of applying $f on the right side value is true otherwise null.

