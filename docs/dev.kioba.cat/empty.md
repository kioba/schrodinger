---
title: empty - schrodinger
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">schrodinger</a> / <a href="index.html">dev.kioba.cat</a> / <a href="./empty.html">empty</a></div>

# empty

<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">A</span><span class="symbol">&gt;</span> <span class="identifier">empty</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="empty.html#A"><span class="identifier">A</span></a><span class="symbol">?</span></code></div>

Constructs a left side value.

Example usage:

<pre markdown="1">val myVal = empty&lt;Int&gt;()
</pre><pre markdown="1">1.fold(::empty, { it })
</pre>

**Return**
left side value.

