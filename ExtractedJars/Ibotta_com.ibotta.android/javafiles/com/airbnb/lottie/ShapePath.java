// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableShapeValue, LottieComposition

class ShapePath
{
	static class Factory
	{

		static ShapePath newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			lottiecomposition = ((LottieComposition) (AnimatableShapeValue.Factory.newInstance(jsonobject.optJSONObject("ks"), lottiecomposition)));
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "ks">
		//    2    3:invokevirtual   #17  <Method JSONObject JSONObject.optJSONObject(String)>
		//    3    6:aload_1         
		//    4    7:invokestatic    #22  <Method AnimatableShapeValue AnimatableShapeValue$Factory.newInstance(JSONObject, LottieComposition)>
		//    5   10:astore_1        
			return new ShapePath(jsonobject.optString("nm"), jsonobject.optInt("ind"), ((AnimatableShapeValue) (lottiecomposition)));
		//    6   11:new             #6   <Class ShapePath>
		//    7   14:dup             
		//    8   15:aload_0         
		//    9   16:ldc1            #24  <String "nm">
		//   10   18:invokevirtual   #28  <Method String JSONObject.optString(String)>
		//   11   21:aload_0         
		//   12   22:ldc1            #30  <String "ind">
		//   13   24:invokevirtual   #34  <Method int JSONObject.optInt(String)>
		//   14   27:aload_1         
		//   15   28:aconst_null     
		//   16   29:invokespecial   #38  <Method void ShapePath(String, int, AnimatableShapeValue, ShapePath$1)>
		//   17   32:areturn         
		}
	}


	private ShapePath(String s, int i, AnimatableShapeValue animatableshapevalue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String name>
		index = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int index>
		shapePath = animatableshapevalue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field AnimatableShapeValue shapePath>
	//   11   19:return          
	}


	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String name>
	//    2    4:areturn         
	}

	AnimatableShapeValue getShapePath()
	{
		return shapePath;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AnimatableShapeValue shapePath>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ShapePath{name=");
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "ShapePath{name=">
	//    6   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field String name>
	//   11   20:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", index=");
	//   13   24:aload_1         
	//   14   25:ldc1            #46  <String ", index=">
	//   15   27:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(index);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #24  <Field int index>
	//   20   36:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", hasAnimation=");
	//   22   40:aload_1         
	//   23   41:ldc1            #51  <String ", hasAnimation=">
	//   24   43:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(shapePath.hasAnimation());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #26  <Field AnimatableShapeValue shapePath>
	//   29   52:invokevirtual   #57  <Method boolean AnimatableShapeValue.hasAnimation()>
	//   30   55:invokevirtual   #60  <Method StringBuilder StringBuilder.append(boolean)>
	//   31   58:pop             
		stringbuilder.append('}');
	//   32   59:aload_1         
	//   33   60:bipush          125
	//   34   62:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   35   65:pop             
		return stringbuilder.toString();
	//   36   66:aload_1         
	//   37   67:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   38   70:areturn         
	}

	private final int index;
	private final String name;
	private final AnimatableShapeValue shapePath;
}
