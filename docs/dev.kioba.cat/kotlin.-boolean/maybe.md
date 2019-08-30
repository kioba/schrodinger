---
title: maybe - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">schrodinger</a> / <a href="../index.html">dev.kioba.cat</a> / <a href="index.html">kotlin.Boolean</a> / <a href="./maybe.html">maybe</a></div>

# maybe

<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">.</span><span class="identifier">maybe</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$maybe(kotlin.Boolean, kotlin.Function0((dev.kioba.cat.maybe.A)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="maybe.html#A"><span class="identifier">A</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="maybe.html#A"><span class="identifier">A</span></a><span class="symbol">?</span></code></div>

returns the result of $f in case of the receiver is true otherwsie null.

Example usage:

<pre markdown="1">true.maybe{ 1 } // 1

false.maybe{ 1 } // null
</pre>

### Parameters

<code>f</code> - function to apply if the receiver is true.

**Receiver**
value which $f will be applied on.

**Return**
the result of f if the receiver is true otherwise null.

