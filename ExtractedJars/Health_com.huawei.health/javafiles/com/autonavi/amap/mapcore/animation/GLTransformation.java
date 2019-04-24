// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;


public class GLTransformation
{

	public GLTransformation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		x = (0.0D / 0.0D);
	//    2    4:aload_0         
	//    3    5:ldc2w           #16  <Double (0.0D / 0.0D)>
	//    4    8:putfield        #19  <Field double x>
		y = (0.0D / 0.0D);
	//    5   11:aload_0         
	//    6   12:ldc2w           #16  <Double (0.0D / 0.0D)>
	//    7   15:putfield        #21  <Field double y>
		alpha = (0.0D / 0.0D);
	//    8   18:aload_0         
	//    9   19:ldc2w           #16  <Double (0.0D / 0.0D)>
	//   10   22:putfield        #23  <Field double alpha>
		rotate = (0.0D / 0.0D);
	//   11   25:aload_0         
	//   12   26:ldc2w           #16  <Double (0.0D / 0.0D)>
	//   13   29:putfield        #25  <Field double rotate>
		scaleX = (0.0D / 0.0D);
	//   14   32:aload_0         
	//   15   33:ldc2w           #16  <Double (0.0D / 0.0D)>
	//   16   36:putfield        #27  <Field double scaleX>
		scaleY = (0.0D / 0.0D);
	//   17   39:aload_0         
	//   18   40:ldc2w           #16  <Double (0.0D / 0.0D)>
	//   19   43:putfield        #29  <Field double scaleY>
	//   20   46:return          
	}

	public void clear()
	{
		x = (0.0D / 0.0D);
	//    0    0:aload_0         
	//    1    1:ldc2w           #16  <Double (0.0D / 0.0D)>
	//    2    4:putfield        #19  <Field double x>
		y = (0.0D / 0.0D);
	//    3    7:aload_0         
	//    4    8:ldc2w           #16  <Double (0.0D / 0.0D)>
	//    5   11:putfield        #21  <Field double y>
		alpha = (0.0D / 0.0D);
	//    6   14:aload_0         
	//    7   15:ldc2w           #16  <Double (0.0D / 0.0D)>
	//    8   18:putfield        #23  <Field double alpha>
		scaleX = (0.0D / 0.0D);
	//    9   21:aload_0         
	//   10   22:ldc2w           #16  <Double (0.0D / 0.0D)>
	//   11   25:putfield        #27  <Field double scaleX>
		scaleY = (0.0D / 0.0D);
	//   12   28:aload_0         
	//   13   29:ldc2w           #16  <Double (0.0D / 0.0D)>
	//   14   32:putfield        #29  <Field double scaleY>
		rotate = (0.0D / 0.0D);
	//   15   35:aload_0         
	//   16   36:ldc2w           #16  <Double (0.0D / 0.0D)>
	//   17   39:putfield        #25  <Field double rotate>
	//   18   42:return          
	}

	public double alpha;
	public double rotate;
	public double scaleX;
	public double scaleY;
	public double x;
	public double y;
}
