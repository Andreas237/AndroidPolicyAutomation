// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			Mask, LottieComposition

static class Mask$Factory
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
		 ;
		switch(i)
	//*  40   77:iload_2         
		{
	//*  41   78:tableswitch     0 2: default 104
	//	               0 125
	//	               1 118
	//	               2 111
		default:
			 = .MaskModeUnknown;
	//   42  104:getstatic       #39  <Field Mask$MaskMode Mask$MaskMode.MaskModeUnknown>
	//   43  107:astore_3        
			break;

	//*  44  108:goto            129
		case 2: // '\002'
			 = .MaskModeIntersect;
	//   45  111:getstatic       #42  <Field Mask$MaskMode Mask$MaskMode.MaskModeIntersect>
	//   46  114:astore_3        
			break;

	//*  47  115:goto            129
		case 1: // '\001'
			 = .MaskModeSubtract;
	//   48  118:getstatic       #45  <Field Mask$MaskMode Mask$MaskMode.MaskModeSubtract>
	//   49  121:astore_3        
			break;

	//*  50  122:goto            129
		case 0: // '\0'
			 = .MaskModeAdd;
	//   51  125:getstatic       #48  <Field Mask$MaskMode Mask$MaskMode.MaskModeAdd>
	//   52  128:astore_3        
			break;
		}
		return new Mask(, peValue.Factory.newInstance(jsonobject.optJSONObject("pt"), lottiecomposition), ((Mask._cls1) (null)));
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
