// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//			GCMReceiver, j

class GCMReceiver$2
	implements j.a
{

	public void a(j j1)
	{
		j1.c().b();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method j$c j.c()>
	//    2    4:invokeinterface #32  <Method void j$c.b()>
	//    3    9:return          
	}

	final GCMReceiver a;

	GCMReceiver$2(GCMReceiver gcmreceiver)
	{
		a = gcmreceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field GCMReceiver a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
