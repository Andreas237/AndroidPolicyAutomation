// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abe, abf

final class abb
	implements abe
{

	abb(Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = throwable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Throwable a>
	//    5    9:aload_0         
	//    6   10:new             #20  <Class abf>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void abf()>
	//    9   17:putfield        #23  <Field abf b>
		b.a();
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field abf b>
	//   12   24:invokevirtual   #25  <Method void abf.a()>
	//   13   27:return          
	}

	public final void a(Runnable runnable, Executor executor)
	{
		b.a(runnable, executor);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field abf b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #29  <Method void abf.a(Runnable, Executor)>
	//    5    9:return          
	}

	public final boolean cancel(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object get()
	{
		throw new ExecutionException(a);
	//    0    0:new             #35  <Class ExecutionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Throwable a>
	//    4    8:invokespecial   #37  <Method void ExecutionException(Throwable)>
	//    5   11:athrow          
	}

	public final Object get(long l, TimeUnit timeunit)
	{
		throw new ExecutionException(a);
	//    0    0:new             #35  <Class ExecutionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Throwable a>
	//    4    8:invokespecial   #37  <Method void ExecutionException(Throwable)>
	//    5   11:athrow          
	}

	public final boolean isCancelled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isDone()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final Throwable a;
	private final abf b = new abf();
}
