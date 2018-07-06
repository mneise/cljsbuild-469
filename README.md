Repository to reproduce [lein-cljsbuild issue 469](https://github.com/emezeske/lein-cljsbuild/issues/469).

When trying to compile with

```
lein cljsbuild once
```

you will get an exception that starts like this:

```
clojure.lang.ExceptionInfo: failed compiling file:target/js/clojure/core/rrb_vector/trees.cljs {:file #object[java.io.File 0x1f78d415 "target/js/clojure/core/rrb_vector/trees.cljs"]}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at cljs.compiler$compile_file$fn__3727.invoke(compiler.cljc:1568)
	at cljs.compiler$compile_file.invokeStatic(compiler.cljc:1528)
	at cljs.compiler$compile_file.invoke(compiler.cljc:1504)
	at cljs.closure$compile_file.invokeStatic(closure.clj:647)
	at cljs.closure$compile_file.invoke(closure.clj:625)
	at cljs.closure$compile_from_jar.invokeStatic(closure.clj:707)
```
