// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableShapeValue, LottieComposition

class Mask
{
	static class Factory
	{

		static Mask newMask(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			int i;
label0:
			{
				String s = jsonobject.optString("mode");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "mode">
		//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//    3    6:astore_3        
				i = s.hashCode();
		//    4    7:aload_3         
		//    5    8:invokevirtual   #23  <Method int String.hashCode()>
		//    6   11:istore_2        
				if(i != 97)
		//*   7   12:iload_2         
		//*   8   13:bipush          97
		//*   9   15:icmpeq          61
				{
					if(i != 105)
		//*  10   18:iload_2         
		//*  11   19:bipush          105
		//*  12   21:icmpeq          47
					{
						if(i == 115 && s.equals("s"))
		//*  13   24:iload_2         
		//*  14   25:bipush          115
		//*  15   27:icmpeq          33
		//*  16   30:goto            75
		//*  17   33:aload_3         
		//*  18   34:ldc1            #25  <String "s">
		//*  19   36:invokevirtual   #29  <Method boolean String.equals(Object)>
		//*  20   39:ifeq            75
						{
							i = 1;
		//   21   42:iconst_1        
		//   22   43:istore_2        
							break label0;
		//   23   44:goto            77
						}
					} else
					if(s.equals("i"))
		//*  24   47:aload_3         
		//*  25   48:ldc1            #31  <String "i">
		//*  26   50:invokevirtual   #29  <Method boolean String.equals(Object)>
		//*  27   53:ifeq            75
					{
						i = 2;
		//   28   56:iconst_2        
		//   29   57:istore_2        
						break label0;
		//   30   58:goto            77
					}
				} else
				if(s.equals("a"))
		//*  31   61:aload_3         
		//*  32   62:ldc1            #33  <String "a">
		//*  33   64:invokevirtual   #29  <Method boolean String.equals(Object)>
		//*  34   67:ifeq            75
				{
					i = 0;
		//   35   70:iconst_0        
		//   36   71:istore_2        
					break label0;
		//   37   72:goto            77
				}
				i = -1;
		//   38   75:iconst_m1       
		//   39   76:istore_2        
			}
			MaskMode maskmode;
			switch(i)
		//*  40   77:iload_2         
			{
		//*  41   78:tableswitch     0 2: default 104
		//		               0 125
		//		               1 118
		//		               2 111
			default:
				maskmode = MaskMode.MaskModeUnknown;
		//   42  104:getstatic       #39  <Field Mask$MaskMode Mask$MaskMode.MaskModeUnknown>
		//   43  107:astore_3        
				break;

		//*  44  108:goto            129
			case 2: // '\002'
				maskmode = MaskMode.MaskModeIntersect;
		//   45  111:getstatic       #42  <Field Mask$MaskMode Mask$MaskMode.MaskModeIntersect>
		//   46  114:astore_3        
				break;

		//*  47  115:goto            129
			case 1: // '\001'
				maskmode = MaskMode.MaskModeSubtract;
		//   48  118:getstatic       #45  <Field Mask$MaskMode Mask$MaskMode.MaskModeSubtract>
		//   49  121:astore_3        
				break;

		//*  50  122:goto            129
			case 0: // '\0'
				maskmode = MaskMode.MaskModeAdd;
		//   51  125:getstatic       #48  <Field Mask$MaskMode Mask$MaskMode.MaskModeAdd>
		//   52  128:astore_3        
				break;
			}
			return new Mask(maskmode, AnimatableShapeValue.Factory.newInstance(jsonobject.optJSONObject("pt"), lottiecomposition));
		//   53  129:new             #6   <Class Mask>
		//   54  132:dup             
		//   55  133:aload_3         
		//   56  134:aload_0         
		//   57  135:ldc1            #50  <String "pt">
		//   58  137:invokevirtual   #54  <Method JSONObject JSONObject.optJSONObject(String)>
		//   59  140:aload_1         
		//   60  141:invokestatic    #60  <Method AnimatableShapeValue AnimatableShapeValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   61  144:aconst_null     
		//   62  145:invokespecial   #64  <Method void Mask(Mask$MaskMode, AnimatableShapeValue, Mask$1)>
		//   63  148:areturn         
		}
	}

	static final class MaskMode extends Enum
	{

		public static MaskMode valueOf(String s)
		{
			return (MaskMode)Enum.valueOf(com/airbnb/lottie/Mask$MaskMode, s);
		//    0    0:ldc1            #2   <Class Mask$MaskMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Mask$MaskMode>
		//    4    9:areturn         
		}

		public static MaskMode[] values()
		{
			return (MaskMode[])((MaskMode []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field Mask$MaskMode[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.airbnb.lottie.Mask$MaskMode_3B_.clone()>
		//    2    6:checkcast       #46  <Class Mask$MaskMode[]>
		//    3    9:areturn         
		}

		private static final MaskMode $VALUES[];
		public static final MaskMode MaskModeAdd;
		public static final MaskMode MaskModeIntersect;
		public static final MaskMode MaskModeSubtract;
		public static final MaskMode MaskModeUnknown;

		static 
		{
			MaskModeAdd = new MaskMode("MaskModeAdd", 0);
		//    0    0:new             #2   <Class Mask$MaskMode>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "MaskModeAdd">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
		//    5   10:putstatic       #24  <Field Mask$MaskMode MaskModeAdd>
			MaskModeSubtract = new MaskMode("MaskModeSubtract", 1);
		//    6   13:new             #2   <Class Mask$MaskMode>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "MaskModeSubtract">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
		//   11   23:putstatic       #27  <Field Mask$MaskMode MaskModeSubtract>
			MaskModeIntersect = new MaskMode("MaskModeIntersect", 2);
		//   12   26:new             #2   <Class Mask$MaskMode>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "MaskModeIntersect">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
		//   17   36:putstatic       #30  <Field Mask$MaskMode MaskModeIntersect>
			MaskModeUnknown = new MaskMode("MaskModeUnknown", 3);
		//   18   39:new             #2   <Class Mask$MaskMode>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "MaskModeUnknown">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
		//   23   49:putstatic       #33  <Field Mask$MaskMode MaskModeUnknown>
			$VALUES = (new MaskMode[] {
				MaskModeAdd, MaskModeSubtract, MaskModeIntersect, MaskModeUnknown
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       MaskMode[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field Mask$MaskMode MaskModeAdd>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field Mask$MaskMode MaskModeSubtract>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field Mask$MaskMode MaskModeIntersect>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field Mask$MaskMode MaskModeUnknown>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field Mask$MaskMode[] $VALUES>
		//*  43   83:return          
		}

		private MaskMode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private Mask(MaskMode maskmode, AnimatableShapeValue animatableshapevalue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		maskMode = maskmode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Mask$MaskMode maskMode>
		maskPath = animatableshapevalue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field AnimatableShapeValue maskPath>
	//    8   14:return          
	}


	MaskMode getMaskMode()
	{
		return maskMode;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Mask$MaskMode maskMode>
	//    2    4:areturn         
	}

	AnimatableShapeValue getMaskPath()
	{
		return maskPath;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnimatableShapeValue maskPath>
	//    2    4:areturn         
	}

	private final MaskMode maskMode;
	private final AnimatableShapeValue maskPath;
}
