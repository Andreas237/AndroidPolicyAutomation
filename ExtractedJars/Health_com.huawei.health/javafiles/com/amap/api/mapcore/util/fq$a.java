// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.FPoint;

// Referenced classes of package com.amap.api.mapcore.util:
//			fq

public static class fq$a extends android.view.roup.LayoutParams
{

	public FPoint a;
	public int b;
	public int c;
	public int d;

	public fq$a(int i, int j, FPoint fpoint, int k, int l, int i1)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #17  <Method void android.view.ViewGroup$LayoutParams(int, int)>
		a = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #19  <Field FPoint a>
		b = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #21  <Field int b>
		c = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #23  <Field int c>
		d = 51;
	//   13   21:aload_0         
	//   14   22:bipush          51
	//   15   24:putfield        #25  <Field int d>
		a = fpoint;
	//   16   27:aload_0         
	//   17   28:aload_3         
	//   18   29:putfield        #19  <Field FPoint a>
		b = k;
	//   19   32:aload_0         
	//   20   33:iload           4
	//   21   35:putfield        #21  <Field int b>
		c = l;
	//   22   38:aload_0         
	//   23   39:iload           5
	//   24   41:putfield        #23  <Field int c>
		d = i1;
	//   25   44:aload_0         
	//   26   45:iload           6
	//   27   47:putfield        #25  <Field int d>
	//   28   50:return          
	}
}
