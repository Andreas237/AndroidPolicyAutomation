// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import android.view.Surface;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			o

class o$2
	implements Runnable
{

	public void run()
	{
		o.a(b).a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field o b>
	//    2    4:invokestatic    #28  <Method o$a o.a(o)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Surface a>
	//    5   11:invokeinterface #33  <Method void o$a.a(Surface)>
	//    6   16:return          
	}

	final Surface a;
	final o b;

	o$2(o o1, Surface surface)
	{
		b = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field o b>
		a = surface;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Surface a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
