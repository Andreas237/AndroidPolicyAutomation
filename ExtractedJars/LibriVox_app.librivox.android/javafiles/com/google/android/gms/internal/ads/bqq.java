// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqp

final class bqq
	implements Runnable
{

	bqq(bqp bqp1, View view)
	{
		b = bqp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bqp b>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field View a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		b.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bqp b>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field View a>
	//    4    8:invokevirtual   #26  <Method void bqp.a(View)>
	//    5   11:return          
	}

	private final View a;
	private final bqp b;
}
