// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			byt

final class byu
	implements Runnable
{

	byu(byt byt1, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = byt1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field byt a>
		b = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Context b>
	//    8   14:return          
	}

	public final void run()
	{
		a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byt a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Context b>
	//    4    8:invokevirtual   #26  <Method com.google.android.gms.ads.reward.c byt.a(Context)>
	//    5   11:pop             
	//    6   12:return          
	}

	private final byt a;
	private final Context b;
}
