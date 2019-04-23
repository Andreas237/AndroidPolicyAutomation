// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdp, bdc

public final class bde
{

	public bde(bdp bdp, Object obj, bdc bdc, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = bdp;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field bdp a>
		b = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Object b>
		c = bdc;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field bdc c>
		d = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #25  <Field int d>
	//   14   25:return          
	}

	public final bdp a;
	public final Object b;
	public final bdc c;
	public final int d;
}
