// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.selects.SelectClause0;

// Referenced classes of package kotlinx.coroutines:
//			Job, NonDisposableHandle, ChildHandle, DisposableHandle, 
//			ChildJob

public final class NonCancellable extends AbstractCoroutineContextElement
	implements Job
{

	private NonCancellable()
	{
		super((kotlin.coroutines.CoroutineContext.Key)Job.Key);
	//    0    0:aload_0         
	//    1    1:getstatic       #72  <Field Job$Key Job.Key>
	//    2    4:checkcast       #74  <Class kotlin.coroutines.CoroutineContext$Key>
	//    3    7:invokespecial   #77  <Method void AbstractCoroutineContextElement(kotlin.coroutines.CoroutineContext$Key)>
	//    4   10:return          
	}

	public static void children$annotations()
	{
	//    0    0:return          
	}

	public static void isActive$annotations()
	{
	//    0    0:return          
	}

	public static void isCancelled$annotations()
	{
	//    0    0:return          
	}

	public static void isCompleted$annotations()
	{
	//    0    0:return          
	}

	public ChildHandle attachChild(ChildJob childjob)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (childjob)), "child");
	//    0    0:aload_1         
	//    1    1:ldc1            #82  <String "child">
	//    2    3:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (ChildHandle)NonDisposableHandle.INSTANCE;
	//    3    6:getstatic       #93  <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//    4    9:checkcast       #95  <Class ChildHandle>
	//    5   12:areturn         
	}

	public void cancel()
	{
	//    0    0:return          
	}

	public boolean cancel()
	{
		return Job.DefaultImpls.cancel(((Job) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #108 <Method boolean Job$DefaultImpls.cancel(Job)>
	//    2    4:ireturn         
	}

	public boolean cancel(Throwable throwable)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CancellationException getCancellationException()
	{
		throw (Throwable)new IllegalStateException("This job is always active");
	//    0    0:new             #114 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #116 <String "This job is always active">
	//    3    6:invokespecial   #119 <Method void IllegalStateException(String)>
	//    4    9:checkcast       #121 <Class Throwable>
	//    5   12:athrow          
	}

	public Sequence getChildren()
	{
		return SequencesKt.emptySequence();
	//    0    0:invokestatic    #126 <Method Sequence SequencesKt.emptySequence()>
	//    1    3:areturn         
	}

	public SelectClause0 getOnJoin()
	{
		throw (Throwable)new UnsupportedOperationException("This job is always active");
	//    0    0:new             #130 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #116 <String "This job is always active">
	//    3    6:invokespecial   #131 <Method void UnsupportedOperationException(String)>
	//    4    9:checkcast       #121 <Class Throwable>
	//    5   12:athrow          
	}

	public DisposableHandle invokeOnCompletion(Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "handler");
	//    0    0:aload_1         
	//    1    1:ldc1            #133 <String "handler">
	//    2    3:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (DisposableHandle)NonDisposableHandle.INSTANCE;
	//    3    6:getstatic       #93  <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//    4    9:checkcast       #135 <Class DisposableHandle>
	//    5   12:areturn         
	}

	public DisposableHandle invokeOnCompletion(boolean flag, boolean flag1, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "handler");
	//    0    0:aload_3         
	//    1    1:ldc1            #133 <String "handler">
	//    2    3:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (DisposableHandle)NonDisposableHandle.INSTANCE;
	//    3    6:getstatic       #93  <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//    4    9:checkcast       #135 <Class DisposableHandle>
	//    5   12:areturn         
	}

	public boolean isActive()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isCancelled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isCompleted()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object join(Continuation continuation)
	{
		throw (Throwable)new UnsupportedOperationException("This job is always active");
	//    0    0:new             #130 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #116 <String "This job is always active">
	//    3    6:invokespecial   #131 <Method void UnsupportedOperationException(String)>
	//    4    9:checkcast       #121 <Class Throwable>
	//    5   12:athrow          
	}

	public Job plus(Job job)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "other");
	//    0    0:aload_1         
	//    1    1:ldc1            #145 <String "other">
	//    2    3:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.plus(((Job) (this)), job);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #148 <Method Job Job$DefaultImpls.plus(Job, Job)>
	//    6   11:areturn         
	}

	public boolean start()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static final NonCancellable INSTANCE = new NonCancellable();

	static 
	{
	//    0    0:new             #2   <Class NonCancellable>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void NonCancellable()>
	//    3    7:putstatic       #67  <Field NonCancellable INSTANCE>
	//*   4   10:return          
	}
}
