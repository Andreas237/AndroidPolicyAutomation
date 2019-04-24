// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

// Referenced classes of package kotlinx.coroutines:
//			DisposableHandle, JobImpl, Job, JobKt, 
//			DisposeOnCompletion, CompletionHandlerBase

final class JobKt__JobKt
{

	public static final DisposableHandle DisposableHandle(Function0 function0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function0)), "block");
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "block">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class DisposableHandle._cls1 {}

		return (DisposableHandle)new DisposableHandle._cls1(function0);
	//    3    6:new             #50  <Class JobKt__JobKt$DisposableHandle$1>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #54  <Method void JobKt__JobKt$DisposableHandle$1(Function0)>
	//    7   14:checkcast       #56  <Class DisposableHandle>
	//    8   17:areturn         
	}

	public static final Job Job(Job job)
	{
		return (Job)new JobImpl(job);
	//    0    0:new             #65  <Class JobImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #68  <Method void JobImpl(Job)>
	//    4    8:checkcast       #70  <Class Job>
	//    5   11:areturn         
	}

	public static Job Job$default(Job job, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			job = (Job)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #70  <Class Job>
	//    6   10:astore_0        
		return JobKt.Job(job);
	//    7   11:aload_0         
	//    8   12:invokestatic    #75  <Method Job JobKt.Job(Job)>
	//    9   15:areturn         
	}

	public static final void cancel(CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		coroutinecontext = ((CoroutineContext) ((Job)coroutinecontext.get((kotlin.coroutines.CoroutineContext.Key)Job.Key)));
	//    3    6:aload_0         
	//    4    7:getstatic       #82  <Field Job$Key Job.Key>
	//    5   10:checkcast       #84  <Class kotlin.coroutines.CoroutineContext$Key>
	//    6   13:invokeinterface #90  <Method kotlin.coroutines.CoroutineContext$Element CoroutineContext.get(kotlin.coroutines.CoroutineContext$Key)>
	//    7   18:checkcast       #70  <Class Job>
	//    8   21:astore_0        
		if(coroutinecontext != null)
	//*   9   22:aload_0         
	//*  10   23:ifnull          32
			((Job) (coroutinecontext)).cancel();
	//   11   26:aload_0         
	//   12   27:invokeinterface #93  <Method void Job.cancel()>
	//   13   32:return          
	}

	public static final boolean cancel(CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		coroutinecontext = ((CoroutineContext) ((Job)coroutinecontext.get((kotlin.coroutines.CoroutineContext.Key)Job.Key)));
	//    3    6:aload_0         
	//    4    7:getstatic       #82  <Field Job$Key Job.Key>
	//    5   10:checkcast       #84  <Class kotlin.coroutines.CoroutineContext$Key>
	//    6   13:invokeinterface #90  <Method kotlin.coroutines.CoroutineContext$Element CoroutineContext.get(kotlin.coroutines.CoroutineContext$Key)>
	//    7   18:checkcast       #70  <Class Job>
	//    8   21:astore_0        
		if(coroutinecontext != null)
	//*   9   22:aload_0         
	//*  10   23:ifnull          32
			((Job) (coroutinecontext)).cancel();
	//   11   26:aload_0         
	//   12   27:invokeinterface #93  <Method void Job.cancel()>
		return true;
	//   13   32:iconst_1        
	//   14   33:ireturn         
	}

	public static final boolean cancel(CoroutineContext coroutinecontext, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		coroutinecontext = ((CoroutineContext) ((Job)coroutinecontext.get((kotlin.coroutines.CoroutineContext.Key)Job.Key)));
	//    3    6:aload_0         
	//    4    7:getstatic       #82  <Field Job$Key Job.Key>
	//    5   10:checkcast       #84  <Class kotlin.coroutines.CoroutineContext$Key>
	//    6   13:invokeinterface #90  <Method kotlin.coroutines.CoroutineContext$Element CoroutineContext.get(kotlin.coroutines.CoroutineContext$Key)>
	//    7   18:checkcast       #70  <Class Job>
	//    8   21:astore_0        
		if(coroutinecontext != null)
	//*   9   22:aload_0         
	//*  10   23:ifnull          34
			return ((Job) (coroutinecontext)).cancel(throwable);
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:invokeinterface #114 <Method boolean Job.cancel(Throwable)>
	//   14   33:ireturn         
		else
			return false;
	//   15   34:iconst_0        
	//   16   35:ireturn         
	}

	public static boolean cancel$default(CoroutineContext coroutinecontext, Throwable throwable, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #118 <Class Throwable>
	//    6   10:astore_1        
		return JobKt.cancel(coroutinecontext, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #120 <Method boolean JobKt.cancel(CoroutineContext, Throwable)>
	//   10   16:ireturn         
	}

	public static final Object cancelAndJoin(Job job, Continuation continuation)
	{
		job.cancel();
	//    0    0:aload_0         
	//    1    1:invokeinterface #93  <Method void Job.cancel()>
		return job.join(continuation);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokeinterface #124 <Method Object Job.join(Continuation)>
	//    5   13:areturn         
	}

	public static final void cancelChildren(CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		coroutinecontext = ((CoroutineContext) ((Job)coroutinecontext.get((kotlin.coroutines.CoroutineContext.Key)Job.Key)));
	//    3    6:aload_0         
	//    4    7:getstatic       #82  <Field Job$Key Job.Key>
	//    5   10:checkcast       #84  <Class kotlin.coroutines.CoroutineContext$Key>
	//    6   13:invokeinterface #90  <Method kotlin.coroutines.CoroutineContext$Element CoroutineContext.get(kotlin.coroutines.CoroutineContext$Key)>
	//    7   18:checkcast       #70  <Class Job>
	//    8   21:astore_0        
		if(coroutinecontext != null)
	//*   9   22:aload_0         
	//*  10   23:ifnull          70
		{
			coroutinecontext = ((CoroutineContext) (((Job) (coroutinecontext)).getChildren()));
	//   11   26:aload_0         
	//   12   27:invokeinterface #129 <Method Sequence Job.getChildren()>
	//   13   32:astore_0        
			if(coroutinecontext != null)
	//*  14   33:aload_0         
	//*  15   34:ifnull          70
				for(coroutinecontext = ((CoroutineContext) (((Sequence) (coroutinecontext)).iterator())); ((Iterator) (coroutinecontext)).hasNext(); ((Job)((Iterator) (coroutinecontext)).next()).cancel());
	//   16   37:aload_0         
	//   17   38:invokeinterface #135 <Method Iterator Sequence.iterator()>
	//   18   43:astore_0        
	//   19   44:aload_0         
	//   20   45:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            70
	//   22   53:aload_0         
	//   23   54:invokeinterface #145 <Method Object Iterator.next()>
	//   24   59:checkcast       #70  <Class Job>
	//   25   62:invokeinterface #93  <Method void Job.cancel()>
		}
	//*  26   67:goto            44
	//   27   70:return          
	}

	public static final void cancelChildren(CoroutineContext coroutinecontext, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		coroutinecontext = ((CoroutineContext) ((Job)coroutinecontext.get((kotlin.coroutines.CoroutineContext.Key)Job.Key)));
	//    3    6:aload_0         
	//    4    7:getstatic       #82  <Field Job$Key Job.Key>
	//    5   10:checkcast       #84  <Class kotlin.coroutines.CoroutineContext$Key>
	//    6   13:invokeinterface #90  <Method kotlin.coroutines.CoroutineContext$Element CoroutineContext.get(kotlin.coroutines.CoroutineContext$Key)>
	//    7   18:checkcast       #70  <Class Job>
	//    8   21:astore_0        
		if(coroutinecontext != null)
	//*   9   22:aload_0         
	//*  10   23:ifnull          72
		{
			coroutinecontext = ((CoroutineContext) (((Job) (coroutinecontext)).getChildren()));
	//   11   26:aload_0         
	//   12   27:invokeinterface #129 <Method Sequence Job.getChildren()>
	//   13   32:astore_0        
			if(coroutinecontext != null)
	//*  14   33:aload_0         
	//*  15   34:ifnull          72
				for(coroutinecontext = ((CoroutineContext) (((Sequence) (coroutinecontext)).iterator())); ((Iterator) (coroutinecontext)).hasNext(); ((Job)((Iterator) (coroutinecontext)).next()).cancel(throwable));
	//   16   37:aload_0         
	//   17   38:invokeinterface #135 <Method Iterator Sequence.iterator()>
	//   18   43:astore_0        
	//   19   44:aload_0         
	//   20   45:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            72
	//   22   53:aload_0         
	//   23   54:invokeinterface #145 <Method Object Iterator.next()>
	//   24   59:checkcast       #70  <Class Job>
	//   25   62:aload_1         
	//   26   63:invokeinterface #114 <Method boolean Job.cancel(Throwable)>
	//   27   68:pop             
		}
	//*  28   69:goto            44
	//   29   72:return          
	}

	public static final void cancelChildren(Job job)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		for(job = ((Job) (job.getChildren().iterator())); ((Iterator) (job)).hasNext(); ((Job)((Iterator) (job)).next()).cancel());
	//    3    6:aload_0         
	//    4    7:invokeinterface #129 <Method Sequence Job.getChildren()>
	//    5   12:invokeinterface #135 <Method Iterator Sequence.iterator()>
	//    6   17:astore_0        
	//    7   18:aload_0         
	//    8   19:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//    9   24:ifeq            44
	//   10   27:aload_0         
	//   11   28:invokeinterface #145 <Method Object Iterator.next()>
	//   12   33:checkcast       #70  <Class Job>
	//   13   36:invokeinterface #93  <Method void Job.cancel()>
	//*  14   41:goto            18
	//   15   44:return          
	}

	public static final void cancelChildren(Job job, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		for(job = ((Job) (job.getChildren().iterator())); ((Iterator) (job)).hasNext(); ((Job)((Iterator) (job)).next()).cancel(throwable));
	//    3    6:aload_0         
	//    4    7:invokeinterface #129 <Method Sequence Job.getChildren()>
	//    5   12:invokeinterface #135 <Method Iterator Sequence.iterator()>
	//    6   17:astore_0        
	//    7   18:aload_0         
	//    8   19:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//    9   24:ifeq            46
	//   10   27:aload_0         
	//   11   28:invokeinterface #145 <Method Object Iterator.next()>
	//   12   33:checkcast       #70  <Class Job>
	//   13   36:aload_1         
	//   14   37:invokeinterface #114 <Method boolean Job.cancel(Throwable)>
	//   15   42:pop             
	//*  16   43:goto            18
	//   17   46:return          
	}

	public static void cancelChildren$default(CoroutineContext coroutinecontext, Throwable throwable, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #118 <Class Throwable>
	//    6   10:astore_1        
		JobKt.cancelChildren(coroutinecontext, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #153 <Method void JobKt.cancelChildren(CoroutineContext, Throwable)>
	//   10   16:return          
	}

	public static void cancelChildren$default(Job job, Throwable throwable, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #118 <Class Throwable>
	//    6   10:astore_1        
		JobKt.cancelChildren(job, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #156 <Method void JobKt.cancelChildren(Job, Throwable)>
	//   10   16:return          
	}

	public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposablehandle)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (disposablehandle)), "handle");
	//    3    6:aload_1         
	//    4    7:ldc1            #158 <String "handle">
	//    5    9:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return job.invokeOnCompletion((Function1)(CompletionHandlerBase)new DisposeOnCompletion(job, disposablehandle));
	//    6   12:aload_0         
	//    7   13:new             #160 <Class DisposeOnCompletion>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #163 <Method void DisposeOnCompletion(Job, DisposableHandle)>
	//   12   22:checkcast       #165 <Class CompletionHandlerBase>
	//   13   25:checkcast       #167 <Class Function1>
	//   14   28:invokeinterface #171 <Method DisposableHandle Job.invokeOnCompletion(Function1)>
	//   15   33:areturn         
	}

	public static final boolean isActive(CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		coroutinecontext = ((CoroutineContext) ((Job)coroutinecontext.get((kotlin.coroutines.CoroutineContext.Key)Job.Key)));
	//    3    6:aload_0         
	//    4    7:getstatic       #82  <Field Job$Key Job.Key>
	//    5   10:checkcast       #84  <Class kotlin.coroutines.CoroutineContext$Key>
	//    6   13:invokeinterface #90  <Method kotlin.coroutines.CoroutineContext$Element CoroutineContext.get(kotlin.coroutines.CoroutineContext$Key)>
	//    7   18:checkcast       #70  <Class Job>
	//    8   21:astore_0        
		return coroutinecontext != null && ((Job) (coroutinecontext)).isActive();
	//    9   22:aload_0         
	//   10   23:ifnull          38
	//   11   26:aload_0         
	//   12   27:invokeinterface #173 <Method boolean Job.isActive()>
	//   13   32:iconst_1        
	//   14   33:icmpne          38
	//   15   36:iconst_1        
	//   16   37:ireturn         
	//   17   38:iconst_0        
	//   18   39:ireturn         
	}
}
