// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bjo

public final class bma
{

	bma(int ai[], bjo abjo[], int ai1[], int ai2[][][], bjo bjo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		b = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field int[] b>
		c = abjo;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field bjo[] c>
		e = ai2;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #26  <Field int[][][] e>
		d = ai1;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #28  <Field int[] d>
		f = bjo;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #30  <Field bjo f>
		a = abjo.length;
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:arraylength     
	//   20   34:putfield        #32  <Field int a>
	//   21   37:return          
	}

	private final int a;
	private final int b[];
	private final bjo c[];
	private final int d[];
	private final int e[][][];
	private final bjo f;
}
