// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableValue, AnimatablePointValue, AnimatablePathValue, LottieComposition

class CircleShape
{
	static class Factory
	{

		static CircleShape newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			return new CircleShape(jsonobject.optString("nm"), AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(jsonobject.optJSONObject("p"), lottiecomposition), AnimatablePointValue.Factory.newInstance(jsonobject.optJSONObject("s"), lottiecomposition));
		//    0    0:new             #6   <Class CircleShape>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:ldc1            #11  <String "nm">
		//    4    7:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//    5   10:aload_0         
		//    6   11:ldc1            #19  <String "p">
		//    7   13:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//    8   16:aload_1         
		//    9   17:invokestatic    #29  <Method AnimatableValue AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(JSONObject, LottieComposition)>
		//   10   20:aload_0         
		//   11   21:ldc1            #31  <String "s">
		//   12   23:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//   13   26:aload_1         
		//   14   27:invokestatic    #36  <Method AnimatablePointValue AnimatablePointValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   15   30:aconst_null     
		//   16   31:invokespecial   #40  <Method void CircleShape(String, AnimatableValue, AnimatablePointValue, CircleShape$1)>
		//   17   34:areturn         
		}
	}


	private CircleShape(String s, AnimatableValue animatablevalue, AnimatablePointValue animatablepointvalue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String name>
		position = animatablevalue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field AnimatableValue position>
		size = animatablepointvalue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field AnimatablePointValue size>
	//   11   19:return          
	}


	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String name>
	//    2    4:areturn         
	}

	public AnimatableValue getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnimatableValue position>
	//    2    4:areturn         
	}

	public AnimatablePointValue getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field AnimatablePointValue size>
	//    2    4:areturn         
	}

	private final String name;
	private final AnimatableValue position;
	private final AnimatablePointValue size;
}
