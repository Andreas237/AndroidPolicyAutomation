// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Path;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			BaseKeyframeAnimation, ShapeData, Keyframe, MiscUtils

class ShapeKeyframeAnimation extends BaseKeyframeAnimation
{

	ShapeKeyframeAnimation(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BaseKeyframeAnimation(List)>
	//    3    5:aload_0         
	//    4    6:new             #15  <Class ShapeData>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void ShapeData()>
	//    7   13:putfield        #20  <Field ShapeData tempShapeData>
	//    8   16:aload_0         
	//    9   17:new             #22  <Class Path>
	//   10   20:dup             
	//   11   21:invokespecial   #23  <Method void Path()>
	//   12   24:putfield        #25  <Field Path tempPath>
	//   13   27:return          
	}

	public Path getValue(Keyframe keyframe, float f)
	{
		ShapeData shapedata = (ShapeData)keyframe.startValue;
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field Object Keyframe.startValue>
	//    2    4:checkcast       #15  <Class ShapeData>
	//    3    7:astore_3        
		keyframe = ((Keyframe) ((ShapeData)keyframe.endValue));
	//    4    8:aload_1         
	//    5    9:getfield        #39  <Field Object Keyframe.endValue>
	//    6   12:checkcast       #15  <Class ShapeData>
	//    7   15:astore_1        
		tempShapeData.interpolateBetween(shapedata, ((ShapeData) (keyframe)), f);
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field ShapeData tempShapeData>
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:fload_2         
	//   13   23:invokevirtual   #43  <Method void ShapeData.interpolateBetween(ShapeData, ShapeData, float)>
		MiscUtils.getPathFromData(tempShapeData, tempPath);
	//   14   26:aload_0         
	//   15   27:getfield        #20  <Field ShapeData tempShapeData>
	//   16   30:aload_0         
	//   17   31:getfield        #25  <Field Path tempPath>
	//   18   34:invokestatic    #49  <Method void MiscUtils.getPathFromData(ShapeData, Path)>
		return tempPath;
	//   19   37:aload_0         
	//   20   38:getfield        #25  <Field Path tempPath>
	//   21   41:areturn         
	}

	public volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #53  <Method Path getValue(Keyframe, float)>
	//    4    6:areturn         
	}

	private final Path tempPath = new Path();
	private final ShapeData tempShapeData = new ShapeData();
}
