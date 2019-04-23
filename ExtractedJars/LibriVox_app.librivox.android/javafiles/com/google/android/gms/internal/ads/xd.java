// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			xb

final class xd
	implements Runnable
{

	xd(xb xb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = xb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field xb a>
	//    5    9:return          
	}

	public final void run()
	{
		a.n();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field xb a>
	//    2    4:invokevirtual   #23  <Method bqp xb.n()>
	//    3    7:pop             
	//    4    8:return          
	}

	private final xb a;
}
