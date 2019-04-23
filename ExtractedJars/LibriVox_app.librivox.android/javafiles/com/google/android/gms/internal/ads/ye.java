// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yc

final class ye
	implements android.content.DialogInterface.OnClickListener
{

	ye(yc yc1, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = yc1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field yc a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int c>
		d = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #25  <Field int d>
	//   14   25:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		a.a(b, c, d, dialoginterface, i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field yc a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int b>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field int c>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field int d>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #33  <Method void yc.a(int, int, int, DialogInterface, int)>
	//   11   21:return          
	}

	private final yc a;
	private final int b;
	private final int c;
	private final int d;
}
