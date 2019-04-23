// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			us, wd

final class uu
	implements Runnable
{

	uu(us us1, wd wd)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = us1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field us a>
		b = wd;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field wd b>
	//    8   14:return          
	}

	public final void run()
	{
		a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field us a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field wd b>
	//    4    8:invokevirtual   #26  <Method void us.a(wd)>
	//    5   11:return          
	}

	private final us a;
	private final wd b;
}
