// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			wt

final class wu
	implements Runnable
{

	wu(wt wt1)
	{
		a = wt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field wt a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		wt.a(a, Thread.currentThread());
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field wt a>
	//    2    4:invokestatic    #23  <Method Thread Thread.currentThread()>
	//    3    7:invokestatic    #28  <Method Thread wt.a(wt, Thread)>
	//    4   10:pop             
		a.a();
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field wt a>
	//    7   15:invokevirtual   #30  <Method void wt.a()>
	//    8   18:return          
	}

	private final wt a;
}
