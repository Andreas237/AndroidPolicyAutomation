// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.coroutines;


// Referenced classes of package kotlin.coroutines:
//			Continuation, CoroutineContext

public interface ContinuationInterceptor
	extends CoroutineContext.Element
{

	public abstract CoroutineContext.Element get(CoroutineContext.Key key);

	public abstract Continuation interceptContinuation(Continuation continuation);

	public abstract CoroutineContext minusKey(CoroutineContext.Key key);

	public abstract void releaseInterceptedContinuation(Continuation continuation);

	public static final Key Key = Key...INSTANCE;

	/* static  */
	/* { */
	/* block-local class not found */
	class Key {}

	//    0    0:getstatic       #47  <Field ContinuationInterceptor$Key ContinuationInterceptor$Key.$$INSTANCE>
	//    1    3:putstatic       #49  <Field ContinuationInterceptor$Key Key>
	//*   2    6:return          
	/* } */

	// Unreferenced inner class kotlin/coroutines/ContinuationInterceptor$DefaultImpls
	/* block-local class not found */
	class DefaultImpls {}

}
