// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.shimmer;


// Referenced classes of package com.facebook.shimmer:
//			ShimmerFrameLayout

private static class ShimmerFrameLayout$MaskTranslation
{

	public void set(int i, int j, int k, int l)
	{
		fromX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int fromX>
		fromY = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int fromY>
		toX = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int toX>
		toY = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int toY>
	//   12   21:return          
	}

	public int fromX;
	public int fromY;
	public int toX;
	public int toY;

	private ShimmerFrameLayout$MaskTranslation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	ShimmerFrameLayout$MaskTranslation(ShimmerFrameLayout._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ShimmerFrameLayout$MaskTranslation()>
	//    2    4:return          
	}
}
