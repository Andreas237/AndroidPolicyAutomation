// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static final class AbstractFuture$Listener
{

	static final AbstractFuture$Listener TOMBSTONE = new AbstractFuture$Listener(((Runnable) (null)), ((Executor) (null)));
	final Executor executor;
	AbstractFuture$Listener next;
	final Runnable task;

	static 
	{
	//    0    0:new             #2   <Class AbstractFuture$Listener>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokespecial   #21  <Method void AbstractFuture$Listener(Runnable, Executor)>
	//    5    9:putstatic       #23  <Field AbstractFuture$Listener TOMBSTONE>
	//*   6   12:return          
	}

	AbstractFuture$Listener(Runnable runnable, Executor executor1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		task = runnable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Runnable task>
		executor = executor1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field Executor executor>
	//    8   14:return          
	}
}
