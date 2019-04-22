// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			ShapeData, CubicCurveData

class MiscUtils
{

	static PointF addPoints(PointF pointf, PointF pointf1)
	{
		return new PointF(pointf.x + pointf1.x, pointf.y + pointf1.y);
	//    0    0:new             #8   <Class PointF>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field float PointF.x>
	//    4    8:aload_1         
	//    5    9:getfield        #12  <Field float PointF.x>
	//    6   12:fadd            
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field float PointF.y>
	//    9   17:aload_1         
	//   10   18:getfield        #15  <Field float PointF.y>
	//   11   21:fadd            
	//   12   22:invokespecial   #19  <Method void PointF(float, float)>
	//   13   25:areturn         
	}

	static void getPathFromData(ShapeData shapedata, Path path)
	{
		path.reset();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method void Path.reset()>
		PointF pointf = shapedata.getInitialPoint();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #34  <Method PointF ShapeData.getInitialPoint()>
	//    4    8:astore_3        
		path.moveTo(pointf.x, pointf.y);
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:getfield        #12  <Field float PointF.x>
	//    8   14:aload_3         
	//    9   15:getfield        #15  <Field float PointF.y>
	//   10   18:invokevirtual   #37  <Method void Path.moveTo(float, float)>
		for(int i = 0; i < shapedata.getCurves().size(); i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #41  <Method List ShapeData.getCurves()>
	//*  16   28:invokeinterface #47  <Method int List.size()>
	//*  17   33:icmpge          103
		{
			CubicCurveData cubiccurvedata = (CubicCurveData)shapedata.getCurves().get(i);
	//   18   36:aload_0         
	//   19   37:invokevirtual   #41  <Method List ShapeData.getCurves()>
	//   20   40:iload_2         
	//   21   41:invokeinterface #51  <Method Object List.get(int)>
	//   22   46:checkcast       #53  <Class CubicCurveData>
	//   23   49:astore_3        
			path.cubicTo(cubiccurvedata.getControlPoint1().x, cubiccurvedata.getControlPoint1().y, cubiccurvedata.getControlPoint2().x, cubiccurvedata.getControlPoint2().y, cubiccurvedata.getVertex().x, cubiccurvedata.getVertex().y);
	//   24   50:aload_1         
	//   25   51:aload_3         
	//   26   52:invokevirtual   #56  <Method PointF CubicCurveData.getControlPoint1()>
	//   27   55:getfield        #12  <Field float PointF.x>
	//   28   58:aload_3         
	//   29   59:invokevirtual   #56  <Method PointF CubicCurveData.getControlPoint1()>
	//   30   62:getfield        #15  <Field float PointF.y>
	//   31   65:aload_3         
	//   32   66:invokevirtual   #59  <Method PointF CubicCurveData.getControlPoint2()>
	//   33   69:getfield        #12  <Field float PointF.x>
	//   34   72:aload_3         
	//   35   73:invokevirtual   #59  <Method PointF CubicCurveData.getControlPoint2()>
	//   36   76:getfield        #15  <Field float PointF.y>
	//   37   79:aload_3         
	//   38   80:invokevirtual   #62  <Method PointF CubicCurveData.getVertex()>
	//   39   83:getfield        #12  <Field float PointF.x>
	//   40   86:aload_3         
	//   41   87:invokevirtual   #62  <Method PointF CubicCurveData.getVertex()>
	//   42   90:getfield        #15  <Field float PointF.y>
	//   43   93:invokevirtual   #66  <Method void Path.cubicTo(float, float, float, float, float, float)>
		}

	//   44   96:iload_2         
	//   45   97:iconst_1        
	//   46   98:iadd            
	//   47   99:istore_2        
	//*  48  100:goto            23
		if(shapedata.isClosed())
	//*  49  103:aload_0         
	//*  50  104:invokevirtual   #70  <Method boolean ShapeData.isClosed()>
	//*  51  107:ifeq            114
			path.close();
	//   52  110:aload_1         
	//   53  111:invokevirtual   #73  <Method void Path.close()>
	//   54  114:return          
	}

	static float lerp(float f, float f1, float f2)
	{
		return f + f2 * (f1 - f);
	//    0    0:fload_0         
	//    1    1:fload_2         
	//    2    2:fload_1         
	//    3    3:fload_0         
	//    4    4:fsub            
	//    5    5:fmul            
	//    6    6:fadd            
	//    7    7:freturn         
	}

	static int lerp(int i, int j, float f)
	{
		return (int)((float)i + f * (float)(j - i));
	//    0    0:iload_0         
	//    1    1:i2f             
	//    2    2:fload_2         
	//    3    3:iload_1         
	//    4    4:iload_0         
	//    5    5:isub            
	//    6    6:i2f             
	//    7    7:fmul            
	//    8    8:fadd            
	//    9    9:f2i             
	//   10   10:ireturn         
	}
}
