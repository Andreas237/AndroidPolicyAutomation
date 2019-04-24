// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


// Referenced classes of package com.autonavi.amap.mapcore:
//			FPoint

public class FPoint3 extends FPoint
{

	public FPoint3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void FPoint()>
		colorIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #12  <Field int colorIndex>
	//    5    9:return          
	}

	public FPoint3(float f, float f1, int i)
	{
		super(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #17  <Method void FPoint(float, float)>
		colorIndex = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #12  <Field int colorIndex>
		colorIndex = i;
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:putfield        #12  <Field int colorIndex>
	//   10   16:return          
	}

	public void setColorIndex(int i)
	{
		colorIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #12  <Field int colorIndex>
	//    3    5:return          
	}

	public int colorIndex;
}
