// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.coroutines;

import kotlin.jvm.functions.Function2;

public interface CoroutineContext
{
	public static interface Element
		extends CoroutineContext
	{

		public abstract Object fold(Object obj, Function2 function2);

		public abstract Element get(Key key);

		public abstract Key getKey();

		public abstract CoroutineContext minusKey(Key key);
	}


	public abstract Object fold(Object obj, Function2 function2);

	public abstract Element get(Key key);

	public abstract CoroutineContext minusKey(Key key);

	public abstract CoroutineContext plus(CoroutineContext coroutinecontext);

	// Unreferenced inner class kotlin/coroutines/CoroutineContext$DefaultImpls
	/* block-local class not found */
	class DefaultImpls {}


	// Unreferenced inner class kotlin/coroutines/CoroutineContext$Element$DefaultImpls
	/* block-local class not found */
	class Element.DefaultImpls {}


	// Unreferenced inner class kotlin/coroutines/CoroutineContext$Key
	/* block-local class not found */
	class Key {}

}
