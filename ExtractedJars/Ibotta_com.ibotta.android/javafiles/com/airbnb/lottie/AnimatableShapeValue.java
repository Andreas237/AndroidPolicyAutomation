// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Path;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			BaseAnimatableValue, MiscUtils, ShapeData, StaticKeyframeAnimation, 
//			ShapeKeyframeAnimation, BaseKeyframeAnimation, LottieComposition, AnimatableValueParser

class AnimatableShapeValue extends BaseAnimatableValue
{
	static final class Factory
	{

		static AnimatableShapeValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, lottiecomposition.getDpScale(), lottiecomposition, ((AnimatableValue.Factory) (ShapeData.Factory.INSTANCE))).parseJson()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #15  <Method float LottieComposition.getDpScale()>
		//    3    5:aload_1         
		//    4    6:getstatic       #21  <Field ShapeData$Factory ShapeData$Factory.INSTANCE>
		//    5    9:invokestatic    #26  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
		//    6   12:invokevirtual   #30  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
		//    7   15:astore_0        
			return new AnimatableShapeValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, (ShapeData)((AnimatableValueParser.Result) (jsonobject)).initialValue);
		//    8   16:new             #6   <Class AnimatableShapeValue>
		//    9   19:dup             
		//   10   20:aload_0         
		//   11   21:getfield        #36  <Field List AnimatableValueParser$Result.keyframes>
		//   12   24:aload_0         
		//   13   25:getfield        #40  <Field Object AnimatableValueParser$Result.initialValue>
		//   14   28:checkcast       #42  <Class ShapeData>
		//   15   31:aconst_null     
		//   16   32:invokespecial   #46  <Method void AnimatableShapeValue(List, ShapeData, AnimatableShapeValue$1)>
		//   17   35:areturn         
		}
	}


	private AnimatableShapeValue(List list, ShapeData shapedata)
	{
		super(list, ((Object) (shapedata)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void BaseAnimatableValue(List, Object)>
		convertTypePath = new Path();
	//    4    6:aload_0         
	//    5    7:new             #19  <Class Path>
	//    6   10:dup             
	//    7   11:invokespecial   #22  <Method void Path()>
	//    8   14:putfield        #24  <Field Path convertTypePath>
	//    9   17:return          
	}


	Path convertType(ShapeData shapedata)
	{
		convertTypePath.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Path convertTypePath>
	//    2    4:invokevirtual   #35  <Method void Path.reset()>
		MiscUtils.getPathFromData(shapedata, convertTypePath);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Path convertTypePath>
	//    6   12:invokestatic    #41  <Method void MiscUtils.getPathFromData(ShapeData, Path)>
		return convertTypePath;
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field Path convertTypePath>
	//    9   19:areturn         
	}

	volatile Object convertType(Object obj)
	{
		return ((Object) (convertType((ShapeData)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #44  <Class ShapeData>
	//    3    5:invokevirtual   #46  <Method Path convertType(ShapeData)>
	//    4    8:areturn         
	}

	public BaseKeyframeAnimation createAnimation()
	{
		if(!hasAnimation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #52  <Method boolean hasAnimation()>
	//*   2    4:ifne            26
			return ((BaseKeyframeAnimation) (new StaticKeyframeAnimation(((Object) (convertType((ShapeData)initialValue))))));
	//    3    7:new             #54  <Class StaticKeyframeAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field Object initialValue>
	//    8   16:checkcast       #44  <Class ShapeData>
	//    9   19:invokevirtual   #46  <Method Path convertType(ShapeData)>
	//   10   22:invokespecial   #61  <Method void StaticKeyframeAnimation(Object)>
	//   11   25:areturn         
		else
			return ((BaseKeyframeAnimation) (new ShapeKeyframeAnimation(keyframes)));
	//   12   26:new             #63  <Class ShapeKeyframeAnimation>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #67  <Field List keyframes>
	//   16   34:invokespecial   #70  <Method void ShapeKeyframeAnimation(List)>
	//   17   37:areturn         
	}

	private final Path convertTypePath;
}
