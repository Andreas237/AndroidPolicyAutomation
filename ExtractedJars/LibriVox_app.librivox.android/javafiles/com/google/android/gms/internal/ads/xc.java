// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xb

final class xc
	implements Runnable
{

	xc(xb xb1, Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = xb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field xb a>
		b = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Context b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field String c>
	//   11   19:return          
	}

	public final void run()
	{
		a.a(b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field xb a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Context b>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field String c>
	//    6   12:invokevirtual   #30  <Method void xb.a(Context, String)>
	//    7   15:return          
	}

	private final xb a;
	private final Context b;
	private final String c;
}
