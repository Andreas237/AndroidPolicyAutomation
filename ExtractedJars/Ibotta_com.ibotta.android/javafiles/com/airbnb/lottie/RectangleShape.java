// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableFloatValue, AnimatableValue, AnimatablePointValue, AnimatablePathValue, 
//			LottieComposition

class RectangleShape
{
	static class Factory
	{

		static RectangleShape newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			return new RectangleShape(jsonobject.optString("nm"), AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(jsonobject.optJSONObject("p"), lottiecomposition), AnimatablePointValue.Factory.newInstance(jsonobject.optJSONObject("s"), lottiecomposition), AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("r"), lottiecomposition));
		//    0    0:new             #6   <Class RectangleShape>
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
		//   15   30:aload_0         
		//   16   31:ldc1            #38  <String "r">
		//   17   33:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//   18   36:aload_1         
		//   19   37:invokestatic    #43  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   20   40:aconst_null     
		//   21   41:invokespecial   #47  <Method void RectangleShape(String, AnimatableValue, AnimatablePointValue, AnimatableFloatValue, RectangleShape$1)>
		//   22   44:areturn         
		}
	}


	private RectangleShape(String s, AnimatableValue animatablevalue, AnimatablePointValue animatablepointvalue, AnimatableFloatValue animatablefloatvalue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String name>
		position = animatablevalue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field AnimatableValue position>
		size = animatablepointvalue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field AnimatablePointValue size>
		cornerRadius = animatablefloatvalue;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field AnimatableFloatValue cornerRadius>
	//   14   25:return          
	}


	AnimatableFloatValue getCornerRadius()
	{
		return cornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnimatableFloatValue cornerRadius>
	//    2    4:areturn         
	}

	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String name>
	//    2    4:areturn         
	}

	AnimatableValue getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field AnimatableValue position>
	//    2    4:areturn         
	}

	AnimatablePointValue getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AnimatablePointValue size>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("RectangleShape{cornerRadius=");
	//    4    8:aload_1         
	//    5    9:ldc1            #52  <String "RectangleShape{cornerRadius=">
	//    6   11:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (cornerRadius.getInitialValue())));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field AnimatableFloatValue cornerRadius>
	//   11   20:invokevirtual   #62  <Method Float AnimatableFloatValue.getInitialValue()>
	//   12   23:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
		stringbuilder.append(", position=");
	//   14   27:aload_1         
	//   15   28:ldc1            #67  <String ", position=">
	//   16   30:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (position)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #27  <Field AnimatableValue position>
	//   21   39:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append(", size=");
	//   23   43:aload_1         
	//   24   44:ldc1            #69  <String ", size=">
	//   25   46:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(((Object) (size)));
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #29  <Field AnimatablePointValue size>
	//   30   55:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   31   58:pop             
		stringbuilder.append('}');
	//   32   59:aload_1         
	//   33   60:bipush          125
	//   34   62:invokevirtual   #72  <Method StringBuilder StringBuilder.append(char)>
	//   35   65:pop             
		return stringbuilder.toString();
	//   36   66:aload_1         
	//   37   67:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   38   70:areturn         
	}

	private final AnimatableFloatValue cornerRadius;
	private final String name;
	private final AnimatableValue position;
	private final AnimatablePointValue size;
}
