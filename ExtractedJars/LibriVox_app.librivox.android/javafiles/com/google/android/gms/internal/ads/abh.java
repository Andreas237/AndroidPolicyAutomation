// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abe, abf

final class abh extends FutureTask
	implements abe
{

	abh(Runnable runnable, Object obj)
	{
		super(runnable, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void FutureTask(Runnable, Object)>
		a = new abf();
	//    4    6:aload_0         
	//    5    7:new             #16  <Class abf>
	//    6   10:dup             
	//    7   11:invokespecial   #19  <Method void abf()>
	//    8   14:putfield        #21  <Field abf a>
	//    9   17:return          
	}

	abh(Callable callable)
	{
		super(callable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void FutureTask(Callable)>
		a = new abf();
	//    3    5:aload_0         
	//    4    6:new             #16  <Class abf>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void abf()>
	//    7   13:putfield        #21  <Field abf a>
	//    8   16:return          
	}

	public final void a(Runnable runnable, Executor executor)
	{
		a.a(runnable, executor);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field abf a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #29  <Method void abf.a(Runnable, Executor)>
	//    5    9:return          
	}

	protected final void done()
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field abf a>
	//    2    4:invokevirtual   #32  <Method void abf.a()>
	//    3    7:return          
	}

	private final abf a;
}
