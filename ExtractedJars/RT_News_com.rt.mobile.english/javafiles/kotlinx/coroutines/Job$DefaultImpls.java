// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlinx.coroutines:
//			Job, DisposableHandle

public static final class Job$DefaultImpls
{

	public static boolean cancel(Job job)
	{
		return job.cancel(((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokeinterface #28  <Method boolean Job.cancel(Throwable)>
	//    3    7:ireturn         
	}

	public static boolean cancel$default(Job job, Throwable throwable, int i, Object obj)
	{
		if(obj != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          14
			throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
	//    2    4:new             #43  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:ldc1            #45  <String "Super calls with default arguments not supported in this target, function: cancel">
	//    5   10:invokespecial   #49  <Method void UnsupportedOperationException(String)>
	//    6   13:athrow          
		if((i & 1) != 0)
	//*   7   14:iload_2         
	//*   8   15:iconst_1        
	//*   9   16:iand            
	//*  10   17:ifeq            25
			throwable = (Throwable)null;
	//   11   20:aconst_null     
	//   12   21:checkcast       #51  <Class Throwable>
	//   13   24:astore_1        
		return job.cancel(throwable);
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokeinterface #28  <Method boolean Job.cancel(Throwable)>
	//   17   32:ireturn         
	}

	public static Object fold(Job job, Object obj, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "operation");
	//    0    0:aload_2         
	//    1    1:ldc1            #56  <String "operation">
	//    2    3:invokestatic    #62  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return kotlin.coroutines.Element.DefaultImpls.fold((kotlin.coroutines.Element)job, obj, function2);
	//    3    6:aload_0         
	//    4    7:checkcast       #64  <Class kotlin.coroutines.CoroutineContext$Element>
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokestatic    #69  <Method Object kotlin.coroutines.CoroutineContext$Element$DefaultImpls.fold(kotlin.coroutines.CoroutineContext$Element, Object, Function2)>
	//    8   15:areturn         
	}

	public static kotlin.coroutines.Element get(Job job, kotlin.coroutines.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #77  <String "key">
	//    2    3:invokestatic    #62  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return kotlin.coroutines.Element.DefaultImpls.get((kotlin.coroutines.Element)job, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #64  <Class kotlin.coroutines.CoroutineContext$Element>
	//    5   10:aload_1         
	//    6   11:invokestatic    #80  <Method kotlin.coroutines.CoroutineContext$Element kotlin.coroutines.CoroutineContext$Element$DefaultImpls.get(kotlin.coroutines.CoroutineContext$Element, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static DisposableHandle invokeOnCompletion$default(Job job, boolean flag, boolean flag1, Function1 function1, int i, Object obj)
	{
		if(obj != null)
	//*   0    0:aload           5
	//*   1    2:ifnull          15
			throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
	//    2    5:new             #43  <Class UnsupportedOperationException>
	//    3    8:dup             
	//    4    9:ldc1            #86  <String "Super calls with default arguments not supported in this target, function: invokeOnCompletion">
	//    5   11:invokespecial   #49  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
		if((i & 1) != 0)
	//*   7   15:iload           4
	//*   8   17:iconst_1        
	//*   9   18:iand            
	//*  10   19:ifeq            24
			flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		if((i & 2) != 0)
	//*  13   24:iload           4
	//*  14   26:iconst_2        
	//*  15   27:iand            
	//*  16   28:ifeq            33
			flag1 = true;
	//   17   31:iconst_1        
	//   18   32:istore_2        
		return job.invokeOnCompletion(flag, flag1, function1);
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:iload_2         
	//   22   36:aload_3         
	//   23   37:invokeinterface #90  <Method DisposableHandle Job.invokeOnCompletion(boolean, boolean, Function1)>
	//   24   42:areturn         
	}

	public static CoroutineContext minusKey(Job job, kotlin.coroutines.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #77  <String "key">
	//    2    3:invokestatic    #62  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return kotlin.coroutines.Element.DefaultImpls.minusKey((kotlin.coroutines.Element)job, key);
	//    3    6:aload_0         
	//    4    7:checkcast       #64  <Class kotlin.coroutines.CoroutineContext$Element>
	//    5   10:aload_1         
	//    6   11:invokestatic    #95  <Method CoroutineContext kotlin.coroutines.CoroutineContext$Element$DefaultImpls.minusKey(kotlin.coroutines.CoroutineContext$Element, kotlin.coroutines.CoroutineContext$Key)>
	//    7   14:areturn         
	}

	public static CoroutineContext plus(Job job, CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #100 <String "context">
	//    2    3:invokestatic    #62  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return kotlin.coroutines.Element.DefaultImpls.plus((kotlin.coroutines.Element)job, coroutinecontext);
	//    3    6:aload_0         
	//    4    7:checkcast       #64  <Class kotlin.coroutines.CoroutineContext$Element>
	//    5   10:aload_1         
	//    6   11:invokestatic    #103 <Method CoroutineContext kotlin.coroutines.CoroutineContext$Element$DefaultImpls.plus(kotlin.coroutines.CoroutineContext$Element, CoroutineContext)>
	//    7   14:areturn         
	}

	public static Job plus(Job job, Job job1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job1)), "other");
	//    0    0:aload_1         
	//    1    1:ldc1            #108 <String "other">
	//    2    3:invokestatic    #62  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return job1;
	//    3    6:aload_1         
	//    4    7:areturn         
	}
}
