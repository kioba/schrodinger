---
title: fold - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">schrodinger</a> / <a href="index.html">dev.kioba.cat</a> / <a href="./fold.html">fold</a></div>

# fold

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">, </span><span class="identifier">B</span><span class="symbol">&gt;</span> <a href="fold.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">fold</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="dev.kioba.cat$fold(dev.kioba.cat.fold.A, kotlin.Function0((dev.kioba.cat.fold.B)), kotlin.Function1((dev.kioba.cat.fold.A, dev.kioba.cat.fold.B)))/ifNull">ifNull</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="fold.html#B"><span class="identifier">B</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="dev.kioba.cat$fold(dev.kioba.cat.fold.A, kotlin.Function0((dev.kioba.cat.fold.B)), kotlin.Function1((dev.kioba.cat.fold.A, dev.kioba.cat.fold.B)))/ifSome">ifSome</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="fold.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="fold.html#B"><span class="identifier">B</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="fold.html#B"><span class="identifier">B</span></a></code></div>

Fold higher order function reduces the left or right side into a return value

Example usage:

<pre markdown="1">null.fold({ 1 }, ::id)
</pre><pre markdown="1">1.fold(
 ifNull = { 1 },
 ifSome = ::id
)
</pre>

### Parameters

<code>ifNull</code> - the lambda will be applied in case of a left side value.

<code>ifSome</code> - the lambda will be applied with the right side value.

**Receiver**
the value it will be folded over

**Return**
result of $ifNull if the $receiver is null otherwise the result of $ifSome

