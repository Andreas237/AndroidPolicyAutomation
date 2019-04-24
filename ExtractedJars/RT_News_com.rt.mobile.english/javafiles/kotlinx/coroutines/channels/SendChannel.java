// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.selects.SelectClause2;

public interface SendChannel
{

	public abstract boolean close(Throwable throwable);

	public abstract SelectClause2 getOnSend();

	public abstract void invokeOnClose(Function1 function1);

	public abstract boolean isClosedForSend();

	public abstract boolean isFull();

	public abstract boolean offer(Object obj);

	public abstract Object send(Object obj, Continuation continuation);

	// Unreferenced inner class kotlinx/coroutines/channels/SendChannel$DefaultImpls
	/* block-local class not found */
	class DefaultImpls {}

}
