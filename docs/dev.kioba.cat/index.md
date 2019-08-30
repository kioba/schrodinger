---
title: dev.kioba.cat - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">schrodinger</a> / <a href="./index.html">dev.kioba.cat</a></div>

## Package dev.kioba.cat

### Extensions for External Classes

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="kotlin.-boolean/index.html">kotlin.Boolean</a>


</td>
<td markdown="1">

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="empty.html">empty</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <span class="identifier">empty</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="empty.html#A"><span class="identifier">A</span></a><span class="symbol">?</span></code></div>

Constructs a left side value.


</td>
</tr>
<tr>
<td markdown="1">

<a href="exists.html">exists</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="exists.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">exists</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$exists(dev.kioba.cat.exists.A, kotlin.Function1((dev.kioba.cat.exists.A, kotlin.Boolean)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="exists.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="filter.html">filter</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="filter.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">filter</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$filter(dev.kioba.cat.filter.A, kotlin.Function1((dev.kioba.cat.filter.A, kotlin.Boolean)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="filter.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="filter.html#A"><span class="identifier">A</span></a><span class="symbol">?</span></code></div>

Returns the $receiver value if the result of $f applied on it is true otherwise null.


</td>
</tr>
<tr>
<td markdown="1">

<a href="filter-not.html">filterNot</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="filter-not.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">filterNot</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$filterNot(dev.kioba.cat.filterNot.A, kotlin.Function1((dev.kioba.cat.filterNot.A, kotlin.Boolean)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="filter-not.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="filter-not.html#A"><span class="identifier">A</span></a><span class="symbol">?</span></code></div>

Returns the $receiver value if the result of $f applied on it is false otherwise null.


</td>
</tr>
<tr>
<td markdown="1">

<a href="flat-map.html">flatMap</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">, </span><span class="identifier">B</span><span class="symbol">&gt;</span> <a href="flat-map.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">flatMap</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$flatMap(dev.kioba.cat.flatMap.A, kotlin.Function1((dev.kioba.cat.flatMap.A, dev.kioba.cat.flatMap.B)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="flat-map.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="flat-map.html#B"><span class="identifier">B</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="flat-map.html#B"><span class="identifier">B</span></a><span class="symbol">?</span></code></div>

Returns the result of $f if the $receiver is a right side value.


</td>
</tr>
<tr>
<td markdown="1">

<a href="fold.html">fold</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">, </span><span class="identifier">B</span><span class="symbol">&gt;</span> <a href="fold.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">fold</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$fold(dev.kioba.cat.fold.A, kotlin.Function0((dev.kioba.cat.fold.B)), kotlin.Function1((dev.kioba.cat.fold.A, dev.kioba.cat.fold.B)))/ifNull">ifNull</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="fold.html#B"><span class="identifier">B</span></a><span class="symbol">, </span><span class="parameterName" id="dev.kioba.cat$fold(dev.kioba.cat.fold.A, kotlin.Function0((dev.kioba.cat.fold.B)), kotlin.Function1((dev.kioba.cat.fold.A, dev.kioba.cat.fold.B)))/ifSome">ifSome</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="fold.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="fold.html#B"><span class="identifier">B</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="fold.html#B"><span class="identifier">B</span></a></code></div>

Fold higher order function reduces the left or right side into a return value


</td>
</tr>
<tr>
<td markdown="1">

<a href="id.html">id</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <span class="identifier">id</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$id(dev.kioba.cat.id.A)/a">a</span><span class="symbol">:</span>&nbsp;<a href="id.html#A"><span class="identifier">A</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="id.html#A"><span class="identifier">A</span></a></code></div>

Identity function.


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-empty.html">isEmpty</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="is-empty.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">isEmpty</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

Checks if the values is left value or not.


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-some.html">isSome</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="is-some.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">isSome</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

Checks if the values is right value or not.


</td>
</tr>
<tr>
<td markdown="1">

<a href="map.html">map</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">, </span><span class="identifier">B</span><span class="symbol">&gt;</span> <a href="map.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">map</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$map(dev.kioba.cat.map.A, kotlin.Function1((dev.kioba.cat.map.A, dev.kioba.cat.map.B)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="map.html#A"><span class="identifier">A</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="map.html#B"><span class="identifier">B</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="map.html#B"><span class="identifier">B</span></a><span class="symbol">?</span></code></div>

Map higher order function takes the right side value and applies on f.


</td>
</tr>
<tr>
<td markdown="1">

<a href="or.html">or</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="or.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">or</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$or(dev.kioba.cat.or.A, kotlin.Function0((dev.kioba.cat.or.A)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="or.html#A"><span class="identifier">A</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="or.html#A"><span class="identifier">A</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="or-else.html">orElse</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <a href="or-else.html#A"><span class="identifier">A</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">orElse</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$orElse(dev.kioba.cat.orElse.A, kotlin.Function0((dev.kioba.cat.orElse.A)))/f">f</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="or-else.html#A"><span class="identifier">A</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="or-else.html#A"><span class="identifier">A</span></a></code></div>

</td>
</tr>
</tbody>
</table>
