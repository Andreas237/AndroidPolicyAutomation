// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlinx.coroutines:
//			Deferred, Job

public static final class Deferred$DefaultImpls
{

	public static boolean cancel(Deferred deferred)
	{
		return Job.DefaultImpls.cancel((Job)deferred);
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class Job>
	//    2    4:invokestatic    #32  <Method boolean Job$DefaultImpls.cancel(Job)>
	//    3    7:ireturn         
	}

	public static Object fold(Deferred deferred, Object obj, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "operation");
	//    0    0:aload_2         
	//    1    1:ldc1            #42  <String "operation">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.fold((Job)deferred, obj, function2);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokestatic    #51  <Method Object Job$DefaultImpls.fold(Job, Object, Function2)>
	//    8   15:areturn         
	}

	public static kotlin.coroutines.nt get(Deferred deferred, kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #58  <String "key">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.get((Job)deferred, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #61  <Method kotlin.coroutines.CoroutineContext$Element Job$DefaultImpls.get(Job, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static CoroutineContext minusKey(Deferred deferred, kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #58  <String "key">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.minusKey((Job)deferred, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #67  <Method CoroutineContext Job$DefaultImpls.minusKey(Job, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static CoroutineContext plus(Deferred deferred, CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #72  <String "context">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.plus((Job)deferred, coroutinecontext);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #75  <Method CoroutineContext Job$DefaultImpls.plus(Job, CoroutineContext)>
	//    7   14:areturn         
	}

	public static Job plus(Deferred deferred, Job job)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "other");
	//    0    0:aload_1         
	//    1    1:ldc1            #81  <String "other">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.plus((Job)deferred, job);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #84  <Method Job Job$DefaultImpls.plus(Job, Job)>
	//    7   14:areturn         
	}
}
