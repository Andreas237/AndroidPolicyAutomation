// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlinx.coroutines:
//			ParentJob, Job

public static final class ParentJob$DefaultImpls
{

	public static boolean cancel(ParentJob parentjob)
	{
		return Job.DefaultImpls.cancel((Job)parentjob);
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class Job>
	//    2    4:invokestatic    #32  <Method boolean Job$DefaultImpls.cancel(Job)>
	//    3    7:ireturn         
	}

	public static Object fold(ParentJob parentjob, Object obj, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "operation");
	//    0    0:aload_2         
	//    1    1:ldc1            #40  <String "operation">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.fold((Job)parentjob, obj, function2);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokestatic    #49  <Method Object Job$DefaultImpls.fold(Job, Object, Function2)>
	//    8   15:areturn         
	}

	public static kotlin.coroutines.t get(ParentJob parentjob, kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #57  <String "key">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.get((Job)parentjob, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #60  <Method kotlin.coroutines.CoroutineContext$Element Job$DefaultImpls.get(Job, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static CoroutineContext minusKey(ParentJob parentjob, kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #57  <String "key">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.minusKey((Job)parentjob, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #66  <Method CoroutineContext Job$DefaultImpls.minusKey(Job, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static CoroutineContext plus(ParentJob parentjob, CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #71  <String "context">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.plus((Job)parentjob, coroutinecontext);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #74  <Method CoroutineContext Job$DefaultImpls.plus(Job, CoroutineContext)>
	//    7   14:areturn         
	}

	public static Job plus(ParentJob parentjob, Job job)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "other");
	//    0    0:aload_1         
	//    1    1:ldc1            #79  <String "other">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.plus((Job)parentjob, job);
	//    3    6:aload_0         
	//    4    7:checkcast       #27  <Class Job>
	//    5   10:aload_1         
	//    6   11:invokestatic    #82  <Method Job Job$DefaultImpls.plus(Job, Job)>
	//    7   14:areturn         
	}
}
