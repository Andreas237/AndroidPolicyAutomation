// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableFloatValue, AnimatablePointValue, AnimatableGradientColorValue, GradientType, 
//			AnimatableIntegerValue, LottieComposition

class GradientStroke
{
	static class Factory
	{

		static GradientStroke newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			Object obj;
			Object obj1;
			GradientType gradienttype;
			Object obj2;
			Object obj3;
			String s;
			AnimatableFloatValue animatablefloatvalue;
			ShapeStroke.LineCapType linecaptype;
			ShapeStroke.LineJoinType linejointype;
			ArrayList arraylist;
label0:
			{
label1:
				{
					s = jsonobject.optString("nm");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "nm">
		//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//    3    6:astore          10
					obj1 = ((Object) (jsonobject.optJSONObject("g")));
		//    4    8:aload_0         
		//    5    9:ldc1            #19  <String "g">
		//    6   11:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//    7   14:astore          4
					obj = obj1;
		//    8   16:aload           4
		//    9   18:astore_3        
					if(obj1 != null)
		//*  10   19:aload           4
		//*  11   21:ifnull          45
					{
						obj = obj1;
		//   12   24:aload           4
		//   13   26:astore_3        
						if(((JSONObject) (obj1)).has("k"))
		//*  14   27:aload           4
		//*  15   29:ldc1            #25  <String "k">
		//*  16   31:invokevirtual   #29  <Method boolean JSONObject.has(String)>
		//*  17   34:ifeq            45
							obj = ((Object) (((JSONObject) (obj1)).optJSONObject("k")));
		//   18   37:aload           4
		//   19   39:ldc1            #25  <String "k">
		//   20   41:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//   21   44:astore_3        
					}
					if(obj != null)
		//*  22   45:aload_3         
		//*  23   46:ifnull          58
						obj = ((Object) (AnimatableGradientColorValue.Factory.newInstance(((JSONObject) (obj)), lottiecomposition)));
		//   24   49:aload_3         
		//   25   50:aload_1         
		//   26   51:invokestatic    #34  <Method AnimatableGradientColorValue AnimatableGradientColorValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   27   54:astore_3        
					else
		//*  28   55:goto            60
						obj = null;
		//   29   58:aconst_null     
		//   30   59:astore_3        
					obj1 = ((Object) (jsonobject.optJSONObject("o")));
		//   31   60:aload_0         
		//   32   61:ldc1            #36  <String "o">
		//   33   63:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//   34   66:astore          4
					if(obj1 != null)
		//*  35   68:aload           4
		//*  36   70:ifnull          84
						obj1 = ((Object) (AnimatableIntegerValue.Factory.newInstance(((JSONObject) (obj1)), lottiecomposition)));
		//   37   73:aload           4
		//   38   75:aload_1         
		//   39   76:invokestatic    #41  <Method AnimatableIntegerValue AnimatableIntegerValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   40   79:astore          4
					else
		//*  41   81:goto            87
						obj1 = null;
		//   42   84:aconst_null     
		//   43   85:astore          4
					if(jsonobject.optInt("t", 1) == 1)
		//*  44   87:aload_0         
		//*  45   88:ldc1            #43  <String "t">
		//*  46   90:iconst_1        
		//*  47   91:invokevirtual   #47  <Method int JSONObject.optInt(String, int)>
		//*  48   94:iconst_1        
		//*  49   95:icmpne          106
						gradienttype = GradientType.Linear;
		//   50   98:getstatic       #53  <Field GradientType GradientType.Linear>
		//   51  101:astore          5
					else
		//*  52  103:goto            111
						gradienttype = GradientType.Radial;
		//   53  106:getstatic       #56  <Field GradientType GradientType.Radial>
		//   54  109:astore          5
					obj2 = ((Object) (jsonobject.optJSONObject("s")));
		//   55  111:aload_0         
		//   56  112:ldc1            #58  <String "s">
		//   57  114:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//   58  117:astore          6
					if(obj2 != null)
		//*  59  119:aload           6
		//*  60  121:ifnull          135
						obj2 = ((Object) (AnimatablePointValue.Factory.newInstance(((JSONObject) (obj2)), lottiecomposition)));
		//   61  124:aload           6
		//   62  126:aload_1         
		//   63  127:invokestatic    #63  <Method AnimatablePointValue AnimatablePointValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   64  130:astore          6
					else
		//*  65  132:goto            138
						obj2 = null;
		//   66  135:aconst_null     
		//   67  136:astore          6
					obj3 = ((Object) (jsonobject.optJSONObject("e")));
		//   68  138:aload_0         
		//   69  139:ldc1            #65  <String "e">
		//   70  141:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//   71  144:astore          7
					if(obj3 != null)
		//*  72  146:aload           7
		//*  73  148:ifnull          162
						obj3 = ((Object) (AnimatablePointValue.Factory.newInstance(((JSONObject) (obj3)), lottiecomposition)));
		//   74  151:aload           7
		//   75  153:aload_1         
		//   76  154:invokestatic    #63  <Method AnimatablePointValue AnimatablePointValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   77  157:astore          7
					else
		//*  78  159:goto            165
						obj3 = null;
		//   79  162:aconst_null     
		//   80  163:astore          7
					animatablefloatvalue = AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("w"), lottiecomposition);
		//   81  165:aload_0         
		//   82  166:ldc1            #67  <String "w">
		//   83  168:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//   84  171:aload_1         
		//   85  172:invokestatic    #72  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   86  175:astore          11
					linecaptype = ShapeStroke.LineCapType.values()[jsonobject.optInt("lc") - 1];
		//   87  177:invokestatic    #78  <Method ShapeStroke$LineCapType[] ShapeStroke$LineCapType.values()>
		//   88  180:aload_0         
		//   89  181:ldc1            #80  <String "lc">
		//   90  183:invokevirtual   #83  <Method int JSONObject.optInt(String)>
		//   91  186:iconst_1        
		//   92  187:isub            
		//   93  188:aaload          
		//   94  189:astore          12
					linejointype = ShapeStroke.LineJoinType.values()[jsonobject.optInt("lj") - 1];
		//   95  191:invokestatic    #88  <Method ShapeStroke$LineJoinType[] ShapeStroke$LineJoinType.values()>
		//   96  194:aload_0         
		//   97  195:ldc1            #90  <String "lj">
		//   98  197:invokevirtual   #83  <Method int JSONObject.optInt(String)>
		//   99  200:iconst_1        
		//  100  201:isub            
		//  101  202:aaload          
		//  102  203:astore          13
					arraylist = new ArrayList();
		//  103  205:new             #92  <Class ArrayList>
		//  104  208:dup             
		//  105  209:invokespecial   #96  <Method void ArrayList()>
		//  106  212:astore          14
					if(!jsonobject.has("d"))
						break label1;
		//  107  214:aload_0         
		//  108  215:ldc1            #98  <String "d">
		//  109  217:invokevirtual   #29  <Method boolean JSONObject.has(String)>
		//  110  220:ifeq            372
					JSONArray jsonarray = jsonobject.optJSONArray("d");
		//  111  223:aload_0         
		//  112  224:ldc1            #98  <String "d">
		//  113  226:invokevirtual   #102 <Method JSONArray JSONObject.optJSONArray(String)>
		//  114  229:astore          8
					jsonobject = null;
		//  115  231:aconst_null     
		//  116  232:astore_0        
					for(int i = 0; i < jsonarray.length();)
		//* 117  233:iconst_0        
		//* 118  234:istore_2        
		//* 119  235:iload_2         
		//* 120  236:aload           8
		//* 121  238:invokevirtual   #108 <Method int JSONArray.length()>
		//* 122  241:icmpge          342
					{
						Object obj4;
label2:
						{
							JSONObject jsonobject1 = jsonarray.optJSONObject(i);
		//  123  244:aload           8
		//  124  246:iload_2         
		//  125  247:invokevirtual   #111 <Method JSONObject JSONArray.optJSONObject(int)>
		//  126  250:astore          15
							String s1 = jsonobject1.optString("n");
		//  127  252:aload           15
		//  128  254:ldc1            #113 <String "n">
		//  129  256:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//  130  259:astore          16
							if(s1.equals("o"))
		//* 131  261:aload           16
		//* 132  263:ldc1            #36  <String "o">
		//* 133  265:invokevirtual   #119 <Method boolean String.equals(Object)>
		//* 134  268:ifeq            287
							{
								obj4 = ((Object) (AnimatableFloatValue.Factory.newInstance(jsonobject1.optJSONObject("v"), lottiecomposition)));
		//  135  271:aload           15
		//  136  273:ldc1            #121 <String "v">
		//  137  275:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//  138  278:aload_1         
		//  139  279:invokestatic    #72  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//  140  282:astore          9
								break label2;
		//  141  284:goto            332
							}
							if(!s1.equals("d"))
		//* 142  287:aload           16
		//* 143  289:ldc1            #98  <String "d">
		//* 144  291:invokevirtual   #119 <Method boolean String.equals(Object)>
		//* 145  294:ifne            310
							{
								obj4 = ((Object) (jsonobject));
		//  146  297:aload_0         
		//  147  298:astore          9
								if(!s1.equals("g"))
									break label2;
		//  148  300:aload           16
		//  149  302:ldc1            #19  <String "g">
		//  150  304:invokevirtual   #119 <Method boolean String.equals(Object)>
		//  151  307:ifeq            332
							}
							((List) (arraylist)).add(((Object) (AnimatableFloatValue.Factory.newInstance(jsonobject1.optJSONObject("v"), lottiecomposition))));
		//  152  310:aload           14
		//  153  312:aload           15
		//  154  314:ldc1            #121 <String "v">
		//  155  316:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
		//  156  319:aload_1         
		//  157  320:invokestatic    #72  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//  158  323:invokeinterface #126 <Method boolean List.add(Object)>
		//  159  328:pop             
							obj4 = ((Object) (jsonobject));
		//  160  329:aload_0         
		//  161  330:astore          9
						}
						i++;
		//  162  332:iload_2         
		//  163  333:iconst_1        
		//  164  334:iadd            
		//  165  335:istore_2        
						jsonobject = ((JSONObject) (obj4));
		//  166  336:aload           9
		//  167  338:astore_0        
					}

		//* 168  339:goto            235
					if(((List) (arraylist)).size() == 1)
		//* 169  342:aload           14
		//* 170  344:invokeinterface #129 <Method int List.size()>
		//* 171  349:iconst_1        
		//* 172  350:icmpne          369
						((List) (arraylist)).add(((List) (arraylist)).get(0));
		//  173  353:aload           14
		//  174  355:aload           14
		//  175  357:iconst_0        
		//  176  358:invokeinterface #133 <Method Object List.get(int)>
		//  177  363:invokeinterface #126 <Method boolean List.add(Object)>
		//  178  368:pop             
					break label0;
		//  179  369:goto            374
				}
				jsonobject = null;
		//  180  372:aconst_null     
		//  181  373:astore_0        
			}
			return new GradientStroke(s, gradienttype, ((AnimatableGradientColorValue) (obj)), ((AnimatableIntegerValue) (obj1)), ((AnimatablePointValue) (obj2)), ((AnimatablePointValue) (obj3)), animatablefloatvalue, linecaptype, linejointype, ((List) (arraylist)), ((AnimatableFloatValue) (jsonobject)));
		//  182  374:new             #6   <Class GradientStroke>
		//  183  377:dup             
		//  184  378:aload           10
		//  185  380:aload           5
		//  186  382:aload_3         
		//  187  383:aload           4
		//  188  385:aload           6
		//  189  387:aload           7
		//  190  389:aload           11
		//  191  391:aload           12
		//  192  393:aload           13
		//  193  395:aload           14
		//  194  397:aload_0         
		//  195  398:aconst_null     
		//  196  399:invokespecial   #136 <Method void GradientStroke(String, GradientType, AnimatableGradientColorValue, AnimatableIntegerValue, AnimatablePointValue, AnimatablePointValue, AnimatableFloatValue, ShapeStroke$LineCapType, ShapeStroke$LineJoinType, List, AnimatableFloatValue, GradientStroke$1)>
		//  197  402:areturn         
		}
	}


	private GradientStroke(String s, GradientType gradienttype, AnimatableGradientColorValue animatablegradientcolorvalue, AnimatableIntegerValue animatableintegervalue, AnimatablePointValue animatablepointvalue, AnimatablePointValue animatablepointvalue1, AnimatableFloatValue animatablefloatvalue, 
			ShapeStroke.LineCapType linecaptype, ShapeStroke.LineJoinType linejointype, List list, AnimatableFloatValue animatablefloatvalue1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field String name>
		gradientType = gradienttype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field GradientType gradientType>
		gradientColor = animatablegradientcolorvalue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field AnimatableGradientColorValue gradientColor>
		opacity = animatableintegervalue;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #44  <Field AnimatableIntegerValue opacity>
		startPoint = animatablepointvalue;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #46  <Field AnimatablePointValue startPoint>
		endPoint = animatablepointvalue1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #48  <Field AnimatablePointValue endPoint>
		width = animatablefloatvalue;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #50  <Field AnimatableFloatValue width>
		capType = linecaptype;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #52  <Field ShapeStroke$LineCapType capType>
		joinType = linejointype;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #54  <Field ShapeStroke$LineJoinType joinType>
		lineDashPattern = list;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #56  <Field List lineDashPattern>
		dashOffset = animatablefloatvalue1;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #58  <Field AnimatableFloatValue dashOffset>
	//   35   67:return          
	}


	ShapeStroke.LineCapType getCapType()
	{
		return capType;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ShapeStroke$LineCapType capType>
	//    2    4:areturn         
	}

	AnimatableFloatValue getDashOffset()
	{
		return dashOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field AnimatableFloatValue dashOffset>
	//    2    4:areturn         
	}

	AnimatablePointValue getEndPoint()
	{
		return endPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field AnimatablePointValue endPoint>
	//    2    4:areturn         
	}

	AnimatableGradientColorValue getGradientColor()
	{
		return gradientColor;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnimatableGradientColorValue gradientColor>
	//    2    4:areturn         
	}

	GradientType getGradientType()
	{
		return gradientType;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field GradientType gradientType>
	//    2    4:areturn         
	}

	ShapeStroke.LineJoinType getJoinType()
	{
		return joinType;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ShapeStroke$LineJoinType joinType>
	//    2    4:areturn         
	}

	List getLineDashPattern()
	{
		return lineDashPattern;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List lineDashPattern>
	//    2    4:areturn         
	}

	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String name>
	//    2    4:areturn         
	}

	AnimatableIntegerValue getOpacity()
	{
		return opacity;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AnimatableIntegerValue opacity>
	//    2    4:areturn         
	}

	AnimatablePointValue getStartPoint()
	{
		return startPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AnimatablePointValue startPoint>
	//    2    4:areturn         
	}

	AnimatableFloatValue getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnimatableFloatValue width>
	//    2    4:areturn         
	}

	private final ShapeStroke.LineCapType capType;
	private final AnimatableFloatValue dashOffset;
	private final AnimatablePointValue endPoint;
	private final AnimatableGradientColorValue gradientColor;
	private final GradientType gradientType;
	private final ShapeStroke.LineJoinType joinType;
	private final List lineDashPattern;
	private final String name;
	private final AnimatableIntegerValue opacity;
	private final AnimatablePointValue startPoint;
	private final AnimatableFloatValue width;
}
