---
title: map - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">schrodinger</a> / <a href="index.html">dev.kioba.cat</a> / <a href="./map.html">map</a></div>

# map

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">, </span><span class="identifier">B</span><span class="symbol">&gt;</span> <a href="map.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">map</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$map(dev.kioba.cat.map.A, kotlin.Function1((dev.kioba.cat.map.A, dev.kioba.cat.map.B)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="map.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="map.html#B"><span class="identifier">B</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="map.html#B"><span class="identifier">B</span></a><span class="symbol">?</span></code></div>

Map higher order function takes the right side value and applies on f.

Example usage:

<pre markdown="1">1.map{ it.toString() } // "1"
</pre><pre markdown="1">null.map{ "Hello World" } // null
</pre>

### Parameters

<code>f</code> - function to apply on the right side value.

**Receiver**
the value which $f will be applied if it is a right side value.

**Return**
the result of applying $f on the value if it is a right side value otherwise null.

