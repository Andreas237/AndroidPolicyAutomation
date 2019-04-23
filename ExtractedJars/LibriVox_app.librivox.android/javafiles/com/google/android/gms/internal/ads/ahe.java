// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ahc, vo

final class ahe
	implements Runnable
{

	ahe(ahc ahc1, View view, vo vo, int i)
	{
		d = ahc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ahc d>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field View a>
		b = vo;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field vo b>
		c = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #24  <Field int c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		ahc.a(d, a, b, c - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ahc d>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field View a>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field vo b>
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field int c>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:invokestatic    #33  <Method void ahc.a(ahc, View, vo, int)>
	//   11   21:return          
	}

	private final View a;
	private final vo b;
	private final int c;
	private final ahc d;
}
