// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			ShapeStroke, LottieComposition

static class ShapeStroke$Factory
{

	static ShapeStroke newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		String s;
		ArrayList arraylist;
		AnimatableColorValue animatablecolorvalue;
		AnimatableFloatValue animatablefloatvalue;
		AnimatableIntegerValue animatableintegervalue;
		ype ype;
		Type type;
label0:
		{
label1:
			{
				s = jsonobject.optString("nm");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "nm">
	//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//    3    6:astore          4
				arraylist = new ArrayList();
	//    4    8:new             #19  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #23  <Method void ArrayList()>
	//    7   15:astore          5
				animatablecolorvalue = .Factory.newInstance(jsonobject.optJSONObject("c"), lottiecomposition);
	//    8   17:aload_0         
	//    9   18:ldc1            #25  <String "c">
	//   10   20:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
	//   11   23:aload_1         
	//   12   24:invokestatic    #34  <Method AnimatableColorValue AnimatableColorValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   13   27:astore          6
				animatablefloatvalue = .Factory.newInstance(jsonobject.optJSONObject("w"), lottiecomposition);
	//   14   29:aload_0         
	//   15   30:ldc1            #36  <String "w">
	//   16   32:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
	//   17   35:aload_1         
	//   18   36:invokestatic    #41  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   19   39:astore          7
				animatableintegervalue = ue.Factory.newInstance(jsonobject.optJSONObject("o"), lottiecomposition);
	//   20   41:aload_0         
	//   21   42:ldc1            #43  <String "o">
	//   22   44:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
	//   23   47:aload_1         
	//   24   48:invokestatic    #48  <Method AnimatableIntegerValue AnimatableIntegerValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   25   51:astore          8
				ype = com.airbnb.lottie.ype.values()[jsonobject.optInt("lc") - 1];
	//   26   53:invokestatic    #54  <Method ShapeStroke$LineCapType[] ShapeStroke$LineCapType.values()>
	//   27   56:aload_0         
	//   28   57:ldc1            #56  <String "lc">
	//   29   59:invokevirtual   #60  <Method int JSONObject.optInt(String)>
	//   30   62:iconst_1        
	//   31   63:isub            
	//   32   64:aaload          
	//   33   65:astore          9
				type = Type.values()[jsonobject.optInt("lj") - 1];
	//   34   67:invokestatic    #65  <Method ShapeStroke$LineJoinType[] ShapeStroke$LineJoinType.values()>
	//   35   70:aload_0         
	//   36   71:ldc1            #67  <String "lj">
	//   37   73:invokevirtual   #60  <Method int JSONObject.optInt(String)>
	//   38   76:iconst_1        
	//   39   77:isub            
	//   40   78:aaload          
	//   41   79:astore          10
				if(!jsonobject.has("d"))
					break label1;
	//   42   81:aload_0         
	//   43   82:ldc1            #69  <String "d">
	//   44   84:invokevirtual   #73  <Method boolean JSONObject.has(String)>
	//   45   87:ifeq            235
				JSONArray jsonarray = jsonobject.optJSONArray("d");
	//   46   90:aload_0         
	//   47   91:ldc1            #69  <String "d">
	//   48   93:invokevirtual   #77  <Method JSONArray JSONObject.optJSONArray(String)>
	//   49   96:astore          11
				jsonobject = null;
	//   50   98:aconst_null     
	//   51   99:astore_0        
				for(int i = 0; i < jsonarray.length();)
	//*  52  100:iconst_0        
	//*  53  101:istore_2        
	//*  54  102:iload_2         
	//*  55  103:aload           11
	//*  56  105:invokevirtual   #83  <Method int JSONArray.length()>
	//*  57  108:icmpge          205
				{
					Object obj;
label2:
					{
						JSONObject jsonobject1 = jsonarray.optJSONObject(i);
	//   58  111:aload           11
	//   59  113:iload_2         
	//   60  114:invokevirtual   #86  <Method JSONObject JSONArray.optJSONObject(int)>
	//   61  117:astore          12
						String s1 = jsonobject1.optString("n");
	//   62  119:aload           12
	//   63  121:ldc1            #88  <String "n">
	//   64  123:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//   65  126:astore          13
						if(s1.equals("o"))
	//*  66  128:aload           13
	//*  67  130:ldc1            #43  <String "o">
	//*  68  132:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*  69  135:ifeq            153
						{
							obj = ((Object) (.Factory.newInstance(jsonobject1.optJSONObject("v"), lottiecomposition)));
	//   70  138:aload           12
	//   71  140:ldc1            #96  <String "v">
	//   72  142:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
	//   73  145:aload_1         
	//   74  146:invokestatic    #41  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   75  149:astore_3        
							break label2;
	//   76  150:goto            196
						}
						if(!s1.equals("d"))
	//*  77  153:aload           13
	//*  78  155:ldc1            #69  <String "d">
	//*  79  157:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*  80  160:ifne            175
						{
							obj = ((Object) (jsonobject));
	//   81  163:aload_0         
	//   82  164:astore_3        
							if(!s1.equals("g"))
								break label2;
	//   83  165:aload           13
	//   84  167:ldc1            #98  <String "g">
	//   85  169:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   86  172:ifeq            196
						}
						((List) (arraylist)).add(((Object) (.Factory.newInstance(jsonobject1.optJSONObject("v"), lottiecomposition))));
	//   87  175:aload           5
	//   88  177:aload           12
	//   89  179:ldc1            #96  <String "v">
	//   90  181:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
	//   91  184:aload_1         
	//   92  185:invokestatic    #41  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   93  188:invokeinterface #103 <Method boolean List.add(Object)>
	//   94  193:pop             
						obj = ((Object) (jsonobject));
	//   95  194:aload_0         
	//   96  195:astore_3        
					}
					i++;
	//   97  196:iload_2         
	//   98  197:iconst_1        
	//   99  198:iadd            
	//  100  199:istore_2        
					jsonobject = ((JSONObject) (obj));
	//  101  200:aload_3         
	//  102  201:astore_0        
				}

	//* 103  202:goto            102
				if(((List) (arraylist)).size() == 1)
	//* 104  205:aload           5
	//* 105  207:invokeinterface #106 <Method int List.size()>
	//* 106  212:iconst_1        
	//* 107  213:icmpne          232
					((List) (arraylist)).add(((List) (arraylist)).get(0));
	//  108  216:aload           5
	//  109  218:aload           5
	//  110  220:iconst_0        
	//  111  221:invokeinterface #110 <Method Object List.get(int)>
	//  112  226:invokeinterface #103 <Method boolean List.add(Object)>
	//  113  231:pop             
				break label0;
	//  114  232:goto            237
			}
			jsonobject = null;
	//  115  235:aconst_null     
	//  116  236:astore_0        
		}
		return new ShapeStroke(s, ((AnimatableFloatValue) (jsonobject)), ((List) (arraylist)), animatablecolorvalue, animatableintegervalue, animatablefloatvalue, ype, type, ((ShapeStroke._cls1) (null)));
	//  117  237:new             #6   <Class ShapeStroke>
	//  118  240:dup             
	//  119  241:aload           4
	//  120  243:aload_0         
	//  121  244:aload           5
	//  122  246:aload           6
	//  123  248:aload           8
	//  124  250:aload           7
	//  125  252:aload           9
	//  126  254:aload           10
	//  127  256:aconst_null     
	//  128  257:invokespecial   #113 <Method void ShapeStroke(String, AnimatableFloatValue, List, AnimatableColorValue, AnimatableIntegerValue, AnimatableFloatValue, ShapeStroke$LineCapType, ShapeStroke$LineJoinType, ShapeStroke$1)>
	//  129  260:areturn         
	}
}
