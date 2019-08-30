---
title: id - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">schrodinger</a> / <a href="index.html">dev.kioba.cat</a> / <a href="./id.html">id</a></div>

# id

<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <span class="identifier">id</span><span class="symbol">(</span><span class="parameterName" id="dev.kioba.cat$id(dev.kioba.cat.id.A)/a">a</span><span class="symbol">:</span>&nbsp;<a href="id.html#A"><span class="identifier">A</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="id.html#A"><span class="identifier">A</span></a></code></div>

Identity function.

Example usage:

<pre markdown="1">1.fold({ 1 }, ::id)
</pre>

### Parameters

<code>a</code> - the value which will be returned.

**Return**
the given argument.

