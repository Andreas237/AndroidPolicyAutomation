// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;

class CubicCurveData
{

	CubicCurveData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		controlPoint1 = new PointF();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class PointF>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void PointF()>
	//    6   12:putfield        #17  <Field PointF controlPoint1>
		controlPoint2 = new PointF();
	//    7   15:aload_0         
	//    8   16:new             #14  <Class PointF>
	//    9   19:dup             
	//   10   20:invokespecial   #15  <Method void PointF()>
	//   11   23:putfield        #19  <Field PointF controlPoint2>
		vertex = new PointF();
	//   12   26:aload_0         
	//   13   27:new             #14  <Class PointF>
	//   14   30:dup             
	//   15   31:invokespecial   #15  <Method void PointF()>
	//   16   34:putfield        #21  <Field PointF vertex>
	//   17   37:return          
	}

	CubicCurveData(PointF pointf, PointF pointf1, PointF pointf2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		controlPoint1 = pointf;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field PointF controlPoint1>
		controlPoint2 = pointf1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field PointF controlPoint2>
		vertex = pointf2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field PointF vertex>
	//   11   19:return          
	}

	PointF getControlPoint1()
	{
		return controlPoint1;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PointF controlPoint1>
	//    2    4:areturn         
	}

	PointF getControlPoint2()
	{
		return controlPoint2;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PointF controlPoint2>
	//    2    4:areturn         
	}

	PointF getVertex()
	{
		return vertex;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PointF vertex>
	//    2    4:areturn         
	}

	void setControlPoint1(float f, float f1)
	{
		controlPoint1.set(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PointF controlPoint1>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #32  <Method void PointF.set(float, float)>
	//    5    9:return          
	}

	void setControlPoint2(float f, float f1)
	{
		controlPoint2.set(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PointF controlPoint2>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #32  <Method void PointF.set(float, float)>
	//    5    9:return          
	}

	void setVertex(float f, float f1)
	{
		vertex.set(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PointF vertex>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #32  <Method void PointF.set(float, float)>
	//    5    9:return          
	}

	private final PointF controlPoint1;
	private final PointF controlPoint2;
	private final PointF vertex;
}
