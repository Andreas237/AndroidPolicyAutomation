// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//			GCMReceiver, j

class GCMReceiver$1
	implements j.a
{

	public void a(j j1)
	{
		j1.c().c(a);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method j$c j.c()>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String a>
	//    4    8:invokeinterface #36  <Method void j$c.c(String)>
	//    5   13:return          
	}

	final String a;
	final GCMReceiver b;

	GCMReceiver$1(GCMReceiver gcmreceiver, String s)
	{
		b = gcmreceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GCMReceiver b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
