// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import kotlin.coroutines.*;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlinx.coroutines:
//			DispatchedContinuation, DebugKt

public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement
	implements ContinuationInterceptor
{

	public CoroutineDispatcher()
	{
		super((kotlin.coroutines.CoroutineContext.Key)ContinuationInterceptor.Key);
	//    0    0:aload_0         
	//    1    1:getstatic       #43  <Field kotlin.coroutines.ContinuationInterceptor$Key ContinuationInterceptor.Key>
	//    2    4:checkcast       #45  <Class kotlin.coroutines.CoroutineContext$Key>
	//    3    7:invokespecial   #48  <Method void AbstractCoroutineContextElement(kotlin.coroutines.CoroutineContext$Key)>
	//    4   10:return          
	}

	public abstract void dispatch(CoroutineContext coroutinecontext, Runnable runnable);

	public void dispatchYield(CoroutineContext coroutinecontext, Runnable runnable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #53  <String "context">
	//    2    3:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (runnable)), "block");
	//    3    6:aload_2         
	//    4    7:ldc1            #60  <String "block">
	//    5    9:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		dispatch(coroutinecontext, runnable);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #62  <Method void dispatch(CoroutineContext, Runnable)>
	//   10   18:return          
	}

	public kotlin.coroutines.CoroutineContext.Element get(kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #69  <String "key">
	//    2    3:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return kotlin.coroutines.ContinuationInterceptor.DefaultImpls.get(((ContinuationInterceptor) (this)), key);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #74  <Method kotlin.coroutines.CoroutineContext$Element kotlin.coroutines.ContinuationInterceptor$DefaultImpls.get(ContinuationInterceptor, kotlin.coroutines.CoroutineContext$Key)>
	//    6   11:areturn         
	}

	public final Continuation interceptContinuation(Continuation continuation)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (continuation)), "continuation");
	//    0    0:aload_1         
	//    1    1:ldc1            #78  <String "continuation">
	//    2    3:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (Continuation)new DispatchedContinuation(this, continuation);
	//    3    6:new             #80  <Class DispatchedContinuation>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #83  <Method void DispatchedContinuation(CoroutineDispatcher, Continuation)>
	//    8   15:checkcast       #85  <Class Continuation>
	//    9   18:areturn         
	}

	public boolean isDispatchNeeded(CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #53  <String "context">
	//    2    3:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return true;
	//    3    6:iconst_1        
	//    4    7:ireturn         
	}

	public CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #69  <String "key">
	//    2    3:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return kotlin.coroutines.ContinuationInterceptor.DefaultImpls.minusKey(((ContinuationInterceptor) (this)), key);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #93  <Method CoroutineContext kotlin.coroutines.ContinuationInterceptor$DefaultImpls.minusKey(ContinuationInterceptor, kotlin.coroutines.CoroutineContext$Key)>
	//    6   11:areturn         
	}

	public final CoroutineDispatcher plus(CoroutineDispatcher coroutinedispatcher)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinedispatcher)), "other");
	//    0    0:aload_1         
	//    1    1:ldc1            #102 <String "other">
	//    2    3:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return coroutinedispatcher;
	//    3    6:aload_1         
	//    4    7:areturn         
	}

	public void releaseInterceptedContinuation(Continuation continuation)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (continuation)), "continuation");
	//    0    0:aload_1         
	//    1    1:ldc1            #78  <String "continuation">
	//    2    3:invokestatic    #59  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kotlin.coroutines.ContinuationInterceptor.DefaultImpls.releaseInterceptedContinuation(((ContinuationInterceptor) (this)), continuation);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #108 <Method void kotlin.coroutines.ContinuationInterceptor$DefaultImpls.releaseInterceptedContinuation(ContinuationInterceptor, Continuation)>
	//    6   11:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #112 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(DebugKt.getClassSimpleName(((Object) (this))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #120 <Method String DebugKt.getClassSimpleName(Object)>
	//    7   13:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append('@');
	//    9   17:aload_1         
	//   10   18:bipush          64
	//   11   20:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//   12   23:pop             
		stringbuilder.append(DebugKt.getHexAddress(((Object) (this))));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokestatic    #130 <Method String DebugKt.getHexAddress(Object)>
	//   16   29:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}
}
