// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import java.util.concurrent.SynchronousQueue;

// Referenced classes of package com.truenet.android:
//			b

static final class b$c$a
	implements Runnable
{

	public final void run()
	{
		b.a(a.a).offer("");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field b$c a>
	//    2    4:getfield        #28  <Field b b$c.a>
	//    3    7:invokestatic    #31  <Method SynchronousQueue b.a(b)>
	//    4   10:ldc1            #33  <String "">
	//    5   12:invokevirtual   #39  <Method boolean SynchronousQueue.offer(Object)>
	//    6   15:pop             
	//    7   16:return          
	}

	final b.c a;

	b$c$a(b.c c1)
	{
		a = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field b$c a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
