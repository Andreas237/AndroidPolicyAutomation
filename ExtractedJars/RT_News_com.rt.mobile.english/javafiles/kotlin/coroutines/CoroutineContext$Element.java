// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.coroutines;

import kotlin.jvm.functions.Function2;

// Referenced classes of package kotlin.coroutines:
//			CoroutineContext

public static interface CoroutineContext$Element
	extends CoroutineContext
{

	public abstract Object fold(Object obj, Function2 function2);

	public abstract CoroutineContext$Element get(CoroutineContext.Key key);

	public abstract CoroutineContext.Key getKey();

	public abstract CoroutineContext minusKey(CoroutineContext.Key key);

	// Unreferenced inner class kotlin/coroutines/CoroutineContext$Element$DefaultImpls
	/* block-local class not found */
	class DefaultImpls {}

}
