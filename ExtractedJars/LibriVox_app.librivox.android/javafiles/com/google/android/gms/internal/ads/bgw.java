// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bgv

public final class bgw
{

	private bgw(long al[], int ai[], int i, long al1[], int ai1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field long[] a>
		b = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field int[] b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int c>
		d = al1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field long[] d>
		e = ai1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #27  <Field int[] e>
	//   17   31:return          
	}

	bgw(long al[], int ai[], int i, long al1[], int ai1[], bgv bgv)
	{
		this(al, ai, i, al1, ai1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #31  <Method void bgw(long[], int[], int, long[], int[])>
	//    7   11:return          
	}

	public final long a[];
	public final int b[];
	public final int c;
	public final long d[];
	public final int e[];
}
