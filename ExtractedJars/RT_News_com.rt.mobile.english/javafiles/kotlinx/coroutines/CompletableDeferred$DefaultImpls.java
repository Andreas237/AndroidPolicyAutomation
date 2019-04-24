// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlinx.coroutines:
//			CompletableDeferred, Deferred, Job

public static final class CompletableDeferred$DefaultImpls
{

	public static boolean cancel(CompletableDeferred completabledeferred)
	{
		return Deferred.DefaultImpls.cancel((Deferred)completabledeferred);
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class Deferred>
	//    2    4:invokestatic    #32  <Method boolean Deferred$DefaultImpls.cancel(Deferred)>
	//    3    7:ireturn         
	}

	public static Object fold(CompletableDeferred completabledeferred, Object obj, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "operation");
	//    0    0:aload_2         
	//    1    1:ldc1            #42  <String "operation">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Deferred.DefaultImpls.fold((Deferred)completabledeferred, obj, function2);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Deferred>
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokestatic    #51  <Method Object Deferred$DefaultImpls.fold(Deferred, Object, Function2)>
	//    8   15:areturn         
	}

	public static kotlin.coroutines.CoroutineContext.Element get(CompletableDeferred completabledeferred, kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #58  <String "key">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Deferred.DefaultImpls.get((Deferred)completabledeferred, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Deferred>
	//    5   10:aload_1         
	//    6   11:invokestatic    #61  <Method kotlin.coroutines.CoroutineContext$Element Deferred$DefaultImpls.get(Deferred, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static CoroutineContext minusKey(CompletableDeferred completabledeferred, kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #58  <String "key">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Deferred.DefaultImpls.minusKey((Deferred)completabledeferred, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Deferred>
	//    5   10:aload_1         
	//    6   11:invokestatic    #67  <Method CoroutineContext Deferred$DefaultImpls.minusKey(Deferred, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static CoroutineContext plus(CompletableDeferred completabledeferred, CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #72  <String "context">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Deferred.DefaultImpls.plus((Deferred)completabledeferred, coroutinecontext);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Deferred>
	//    5   10:aload_1         
	//    6   11:invokestatic    #75  <Method CoroutineContext Deferred$DefaultImpls.plus(Deferred, CoroutineContext)>
	//    7   14:areturn         
	}

	public static Job plus(CompletableDeferred completabledeferred, Job job)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "other");
	//    0    0:aload_1         
	//    1    1:ldc1            #81  <String "other">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Deferred.DefaultImpls.plus((Deferred)completabledeferred, job);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Deferred>
	//    5   10:aload_1         
	//    6   11:invokestatic    #84  <Method Job Deferred$DefaultImpls.plus(Deferred, Job)>
	//    7   14:areturn         
	}
}
