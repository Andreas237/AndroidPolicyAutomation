// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableFloatValue, LottieComposition

class ShapeTrimPath
{
	static class Factory
	{

		static ShapeTrimPath newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			return new ShapeTrimPath(jsonobject.optString("nm"), Type.forId(jsonobject.optInt("m", 1)), AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("s"), lottiecomposition, false), AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("e"), lottiecomposition, false), AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("o"), lottiecomposition, false));
		//    0    0:new             #6   <Class ShapeTrimPath>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:ldc1            #11  <String "nm">
		//    4    7:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//    5   10:aload_0         
		//    6   11:ldc1            #19  <String "m">
		//    7   13:iconst_1        
		//    8   14:invokevirtual   #23  <Method int JSONObject.optInt(String, int)>
		//    9   17:invokestatic    #29  <Method ShapeTrimPath$Type ShapeTrimPath$Type.forId(int)>
		//   10   20:aload_0         
		//   11   21:ldc1            #31  <String "s">
		//   12   23:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
		//   13   26:aload_1         
		//   14   27:iconst_0        
		//   15   28:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
		//   16   31:aload_0         
		//   17   32:ldc1            #42  <String "e">
		//   18   34:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
		//   19   37:aload_1         
		//   20   38:iconst_0        
		//   21   39:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
		//   22   42:aload_0         
		//   23   43:ldc1            #44  <String "o">
		//   24   45:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
		//   25   48:aload_1         
		//   26   49:iconst_0        
		//   27   50:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
		//   28   53:aconst_null     
		//   29   54:invokespecial   #48  <Method void ShapeTrimPath(String, ShapeTrimPath$Type, AnimatableFloatValue, AnimatableFloatValue, AnimatableFloatValue, ShapeTrimPath$1)>
		//   30   57:areturn         
		}
	}

	static final class Type extends Enum
	{

		static Type forId(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 2: default 24
		//		               1 61
		//		               2 57
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    2   24:new             #34  <Class StringBuilder>
		//    3   27:dup             
		//    4   28:invokespecial   #36  <Method void StringBuilder()>
		//    5   31:astore_1        
				stringbuilder.append("Unknown trim path type ");
		//    6   32:aload_1         
		//    7   33:ldc1            #38  <String "Unknown trim path type ">
		//    8   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//    9   38:pop             
				stringbuilder.append(i);
		//   10   39:aload_1         
		//   11   40:iload_0         
		//   12   41:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
		//   13   44:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
		//   14   45:new             #47  <Class IllegalArgumentException>
		//   15   48:dup             
		//   16   49:aload_1         
		//   17   50:invokevirtual   #51  <Method String StringBuilder.toString()>
		//   18   53:invokespecial   #54  <Method void IllegalArgumentException(String)>
		//   19   56:athrow          

			case 2: // '\002'
				return Individually;
		//   20   57:getstatic       #25  <Field ShapeTrimPath$Type Individually>
		//   21   60:areturn         

			case 1: // '\001'
				return Simultaneously;
		//   22   61:getstatic       #22  <Field ShapeTrimPath$Type Simultaneously>
		//   23   64:areturn         
			}
		}

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/airbnb/lottie/ShapeTrimPath$Type, s);
		//    0    0:ldc1            #2   <Class ShapeTrimPath$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShapeTrimPath$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ShapeTrimPath$Type[] $VALUES>
		//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.airbnb.lottie.ShapeTrimPath$Type_3B_.clone()>
		//    2    6:checkcast       #62  <Class ShapeTrimPath$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type Individually;
		public static final Type Simultaneously;

		static 
		{
			Simultaneously = new Type("Simultaneously", 0);
		//    0    0:new             #2   <Class ShapeTrimPath$Type>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "Simultaneously">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ShapeTrimPath$Type(String, int)>
		//    5   10:putstatic       #22  <Field ShapeTrimPath$Type Simultaneously>
			Individually = new Type("Individually", 1);
		//    6   13:new             #2   <Class ShapeTrimPath$Type>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "Individually">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ShapeTrimPath$Type(String, int)>
		//   11   23:putstatic       #25  <Field ShapeTrimPath$Type Individually>
			$VALUES = (new Type[] {
				Simultaneously, Individually
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Type[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ShapeTrimPath$Type Simultaneously>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ShapeTrimPath$Type Individually>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ShapeTrimPath$Type[] $VALUES>
		//*  23   45:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private ShapeTrimPath(String s, Type type1, AnimatableFloatValue animatablefloatvalue, AnimatableFloatValue animatablefloatvalue1, AnimatableFloatValue animatablefloatvalue2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String name>
		type = type1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field ShapeTrimPath$Type type>
		start = animatablefloatvalue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field AnimatableFloatValue start>
		end = animatablefloatvalue1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field AnimatableFloatValue end>
		offset = animatablefloatvalue2;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #35  <Field AnimatableFloatValue offset>
	//   17   31:return          
	}


	AnimatableFloatValue getEnd()
	{
		return end;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnimatableFloatValue end>
	//    2    4:areturn         
	}

	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String name>
	//    2    4:areturn         
	}

	AnimatableFloatValue getOffset()
	{
		return offset;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AnimatableFloatValue offset>
	//    2    4:areturn         
	}

	AnimatableFloatValue getStart()
	{
		return start;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnimatableFloatValue start>
	//    2    4:areturn         
	}

	Type getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ShapeTrimPath$Type type>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Trim Path: {start: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #53  <String "Trim Path: {start: ">
	//    6   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (start)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field AnimatableFloatValue start>
	//   11   20:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", end: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #62  <String ", end: ">
	//   15   27:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (end)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #33  <Field AnimatableFloatValue end>
	//   20   36:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", offset: ");
	//   22   40:aload_1         
	//   23   41:ldc1            #64  <String ", offset: ">
	//   24   43:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (offset)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #35  <Field AnimatableFloatValue offset>
	//   29   52:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append("}");
	//   31   56:aload_1         
	//   32   57:ldc1            #66  <String "}">
	//   33   59:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	private final AnimatableFloatValue end;
	private final String name;
	private final AnimatableFloatValue offset;
	private final AnimatableFloatValue start;
	private final Type type;
}
