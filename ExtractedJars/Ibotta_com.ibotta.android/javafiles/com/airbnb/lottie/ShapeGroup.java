// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.util.Log;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			LottieComposition

class ShapeGroup
{
	static class Factory
	{

		private static ShapeGroup newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			JSONArray jsonarray = jsonobject.optJSONArray("it");
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <String "it">
		//    2    3:invokevirtual   #21  <Method JSONArray JSONObject.optJSONArray(String)>
		//    3    6:astore_3        
			jsonobject = ((JSONObject) (jsonobject.optString("nm")));
		//    4    7:aload_0         
		//    5    8:ldc1            #23  <String "nm">
		//    6   10:invokevirtual   #27  <Method String JSONObject.optString(String)>
		//    7   13:astore_0        
			ArrayList arraylist = new ArrayList();
		//    8   14:new             #29  <Class ArrayList>
		//    9   17:dup             
		//   10   18:invokespecial   #33  <Method void ArrayList()>
		//   11   21:astore          4
			for(int i = 0; i < jsonarray.length(); i++)
		//*  12   23:iconst_0        
		//*  13   24:istore_2        
		//*  14   25:iload_2         
		//*  15   26:aload_3         
		//*  16   27:invokevirtual   #39  <Method int JSONArray.length()>
		//*  17   30:icmpge          66
			{
				Object obj = ShapeGroup.shapeItemWithJson(jsonarray.optJSONObject(i), lottiecomposition);
		//   18   33:aload_3         
		//   19   34:iload_2         
		//   20   35:invokevirtual   #43  <Method JSONObject JSONArray.optJSONObject(int)>
		//   21   38:aload_1         
		//   22   39:invokestatic    #47  <Method Object ShapeGroup.shapeItemWithJson(JSONObject, LottieComposition)>
		//   23   42:astore          5
				if(obj != null)
		//*  24   44:aload           5
		//*  25   46:ifnull          59
					((List) (arraylist)).add(obj);
		//   26   49:aload           4
		//   27   51:aload           5
		//   28   53:invokeinterface #53  <Method boolean List.add(Object)>
		//   29   58:pop             
			}

		//   30   59:iload_2         
		//   31   60:iconst_1        
		//   32   61:iadd            
		//   33   62:istore_2        
		//*  34   63:goto            25
			return new ShapeGroup(((String) (jsonobject)), ((List) (arraylist)));
		//   35   66:new             #6   <Class ShapeGroup>
		//   36   69:dup             
		//   37   70:aload_0         
		//   38   71:aload           4
		//   39   73:invokespecial   #56  <Method void ShapeGroup(String, List)>
		//   40   76:areturn         
		}


/*
		static ShapeGroup access$000(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			return newInstance(jsonobject, lottiecomposition);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #12  <Method ShapeGroup newInstance(JSONObject, LottieComposition)>
		//    3    5:areturn         
		}

*/
	}


	ShapeGroup(String s, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String name>
		items = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field List items>
	//    8   14:return          
	}

	static Object shapeItemWithJson(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		byte byte0;
		String s;
label0:
		{
			s = jsonobject.optString("ty");
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "ty">
	//    2    3:invokevirtual   #35  <Method String JSONObject.optString(String)>
	//    3    6:astore_3        
			switch(s.hashCode())
	//*   4    7:aload_3         
	//*   5    8:invokevirtual   #41  <Method int String.hashCode()>
			{
			default:
				break;

	//*   6   11:lookupswitch    12: default 116
	//	               3239: 278
	//	               3270: 264
	//	               3295: 250
	//	               3307: 236
	//	               3308: 222
	//	               3488: 207
	//	               3633: 192
	//	               3669: 177
	//	               3679: 162
	//	               3681: 148
	//	               3705: 133
	//	               3710: 119
	//*   7  116:goto            293
			case 3710: 
				if(s.equals("tr"))
	//*   8  119:aload_3         
	//*   9  120:ldc1            #43  <String "tr">
	//*  10  122:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  11  125:ifeq            293
				{
					byte0 = 5;
	//   12  128:iconst_5        
	//   13  129:istore_2        
					break label0;
	//   14  130:goto            295
				}
				break;

			case 3705: 
				if(!s.equals("tm"))
					break;
	//   15  133:aload_3         
	//   16  134:ldc1            #49  <String "tm">
	//   17  136:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   18  139:ifeq            293
				byte0 = 9;
	//   19  142:bipush          9
	//   20  144:istore_2        
				break label0;
	//   21  145:goto            295

			case 3681: 
				if(!s.equals("st"))
					break;
	//   22  148:aload_3         
	//   23  149:ldc1            #51  <String "st">
	//   24  151:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   25  154:ifeq            293
				byte0 = 1;
	//   26  157:iconst_1        
	//   27  158:istore_2        
				break label0;
	//   28  159:goto            295

			case 3679: 
				if(!s.equals("sr"))
					break;
	//   29  162:aload_3         
	//   30  163:ldc1            #53  <String "sr">
	//   31  165:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   32  168:ifeq            293
				byte0 = 10;
	//   33  171:bipush          10
	//   34  173:istore_2        
				break label0;
	//   35  174:goto            295

			case 3669: 
				if(!s.equals("sh"))
					break;
	//   36  177:aload_3         
	//   37  178:ldc1            #55  <String "sh">
	//   38  180:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   39  183:ifeq            293
				byte0 = 6;
	//   40  186:bipush          6
	//   41  188:istore_2        
				break label0;
	//   42  189:goto            295

			case 3633: 
				if(!s.equals("rc"))
					break;
	//   43  192:aload_3         
	//   44  193:ldc1            #57  <String "rc">
	//   45  195:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   46  198:ifeq            293
				byte0 = 8;
	//   47  201:bipush          8
	//   48  203:istore_2        
				break label0;
	//   49  204:goto            295

			case 3488: 
				if(!s.equals("mm"))
					break;
	//   50  207:aload_3         
	//   51  208:ldc1            #59  <String "mm">
	//   52  210:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   53  213:ifeq            293
				byte0 = 11;
	//   54  216:bipush          11
	//   55  218:istore_2        
				break label0;
	//   56  219:goto            295

			case 3308: 
				if(!s.equals("gs"))
					break;
	//   57  222:aload_3         
	//   58  223:ldc1            #61  <String "gs">
	//   59  225:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   60  228:ifeq            293
				byte0 = 2;
	//   61  231:iconst_2        
	//   62  232:istore_2        
				break label0;
	//   63  233:goto            295

			case 3307: 
				if(!s.equals("gr"))
					break;
	//   64  236:aload_3         
	//   65  237:ldc1            #63  <String "gr">
	//   66  239:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   67  242:ifeq            293
				byte0 = 0;
	//   68  245:iconst_0        
	//   69  246:istore_2        
				break label0;
	//   70  247:goto            295

			case 3295: 
				if(!s.equals("gf"))
					break;
	//   71  250:aload_3         
	//   72  251:ldc1            #65  <String "gf">
	//   73  253:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   74  256:ifeq            293
				byte0 = 4;
	//   75  259:iconst_4        
	//   76  260:istore_2        
				break label0;
	//   77  261:goto            295

			case 3270: 
				if(!s.equals("fl"))
					break;
	//   78  264:aload_3         
	//   79  265:ldc1            #67  <String "fl">
	//   80  267:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   81  270:ifeq            293
				byte0 = 3;
	//   82  273:iconst_3        
	//   83  274:istore_2        
				break label0;
	//   84  275:goto            295

			case 3239: 
				if(!s.equals("el"))
					break;
	//   85  278:aload_3         
	//   86  279:ldc1            #69  <String "el">
	//   87  281:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   88  284:ifeq            293
				byte0 = 7;
	//   89  287:bipush          7
	//   90  289:istore_2        
				break label0;
	//   91  290:goto            295
			}
			byte0 = -1;
	//   92  293:iconst_m1       
	//   93  294:istore_2        
		}
		switch(byte0)
	//*  94  295:iload_2         
		{
	//*  95  296:tableswitch     0 11: default 360
	//	               0 458
	//	               1 452
	//	               2 446
	//	               3 440
	//	               4 434
	//	               5 428
	//	               6 422
	//	               7 416
	//	               8 410
	//	               9 404
	//	               10 398
	//	               11 393
		default:
			jsonobject = ((JSONObject) (new StringBuilder()));
	//   96  360:new             #71  <Class StringBuilder>
	//   97  363:dup             
	//   98  364:invokespecial   #72  <Method void StringBuilder()>
	//   99  367:astore_0        
			((StringBuilder) (jsonobject)).append("Unknown shape type ");
	//  100  368:aload_0         
	//  101  369:ldc1            #74  <String "Unknown shape type ">
	//  102  371:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  103  374:pop             
			((StringBuilder) (jsonobject)).append(s);
	//  104  375:aload_0         
	//  105  376:aload_3         
	//  106  377:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  107  380:pop             
			Log.w("LOTTIE", ((StringBuilder) (jsonobject)).toString());
	//  108  381:ldc1            #80  <String "LOTTIE">
	//  109  383:aload_0         
	//  110  384:invokevirtual   #84  <Method String StringBuilder.toString()>
	//  111  387:invokestatic    #90  <Method int Log.w(String, String)>
	//  112  390:pop             
			return ((Object) (null));
	//  113  391:aconst_null     
	//  114  392:areturn         

		case 11: // '\013'
			return ((Object) (MergePaths.Factory.newInstance(jsonobject)));
	//  115  393:aload_0         
	//  116  394:invokestatic    #96  <Method MergePaths MergePaths$Factory.newInstance(JSONObject)>
	//  117  397:areturn         

		case 10: // '\n'
			return ((Object) (PolystarShape.Factory.newInstance(jsonobject, lottiecomposition)));
	//  118  398:aload_0         
	//  119  399:aload_1         
	//  120  400:invokestatic    #101 <Method PolystarShape PolystarShape$Factory.newInstance(JSONObject, LottieComposition)>
	//  121  403:areturn         

		case 9: // '\t'
			return ((Object) (ShapeTrimPath.Factory.newInstance(jsonobject, lottiecomposition)));
	//  122  404:aload_0         
	//  123  405:aload_1         
	//  124  406:invokestatic    #106 <Method ShapeTrimPath ShapeTrimPath$Factory.newInstance(JSONObject, LottieComposition)>
	//  125  409:areturn         

		case 8: // '\b'
			return ((Object) (RectangleShape.Factory.newInstance(jsonobject, lottiecomposition)));
	//  126  410:aload_0         
	//  127  411:aload_1         
	//  128  412:invokestatic    #111 <Method RectangleShape RectangleShape$Factory.newInstance(JSONObject, LottieComposition)>
	//  129  415:areturn         

		case 7: // '\007'
			return ((Object) (CircleShape.Factory.newInstance(jsonobject, lottiecomposition)));
	//  130  416:aload_0         
	//  131  417:aload_1         
	//  132  418:invokestatic    #116 <Method CircleShape CircleShape$Factory.newInstance(JSONObject, LottieComposition)>
	//  133  421:areturn         

		case 6: // '\006'
			return ((Object) (ShapePath.Factory.newInstance(jsonobject, lottiecomposition)));
	//  134  422:aload_0         
	//  135  423:aload_1         
	//  136  424:invokestatic    #121 <Method ShapePath ShapePath$Factory.newInstance(JSONObject, LottieComposition)>
	//  137  427:areturn         

		case 5: // '\005'
			return ((Object) (AnimatableTransform.Factory.newInstance(jsonobject, lottiecomposition)));
	//  138  428:aload_0         
	//  139  429:aload_1         
	//  140  430:invokestatic    #126 <Method AnimatableTransform AnimatableTransform$Factory.newInstance(JSONObject, LottieComposition)>
	//  141  433:areturn         

		case 4: // '\004'
			return ((Object) (GradientFill.Factory.newInstance(jsonobject, lottiecomposition)));
	//  142  434:aload_0         
	//  143  435:aload_1         
	//  144  436:invokestatic    #131 <Method GradientFill GradientFill$Factory.newInstance(JSONObject, LottieComposition)>
	//  145  439:areturn         

		case 3: // '\003'
			return ((Object) (ShapeFill.Factory.newInstance(jsonobject, lottiecomposition)));
	//  146  440:aload_0         
	//  147  441:aload_1         
	//  148  442:invokestatic    #136 <Method ShapeFill ShapeFill$Factory.newInstance(JSONObject, LottieComposition)>
	//  149  445:areturn         

		case 2: // '\002'
			return ((Object) (GradientStroke.Factory.newInstance(jsonobject, lottiecomposition)));
	//  150  446:aload_0         
	//  151  447:aload_1         
	//  152  448:invokestatic    #141 <Method GradientStroke GradientStroke$Factory.newInstance(JSONObject, LottieComposition)>
	//  153  451:areturn         

		case 1: // '\001'
			return ((Object) (ShapeStroke.Factory.newInstance(jsonobject, lottiecomposition)));
	//  154  452:aload_0         
	//  155  453:aload_1         
	//  156  454:invokestatic    #146 <Method ShapeStroke ShapeStroke$Factory.newInstance(JSONObject, LottieComposition)>
	//  157  457:areturn         

		case 0: // '\0'
			return ((Object) (Factory.newInstance(jsonobject, lottiecomposition)));
	//  158  458:aload_0         
	//  159  459:aload_1         
	//  160  460:invokestatic    #150 <Method ShapeGroup ShapeGroup$Factory.access$000(JSONObject, LottieComposition)>
	//  161  463:areturn         
		}
	}

	List getItems()
	{
		return items;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List items>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String name>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #71  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ShapeGroup{name='");
	//    4    8:aload_1         
	//    5    9:ldc1            #157 <String "ShapeGroup{name='">
	//    6   11:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field String name>
	//   11   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("' Shapes: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #159 <String "' Shapes: ">
	//   15   27:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(Arrays.toString(items.toArray()));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #21  <Field List items>
	//   20   36:invokeinterface #165 <Method Object[] List.toArray()>
	//   21   41:invokestatic    #170 <Method String Arrays.toString(Object[])>
	//   22   44:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append('}');
	//   24   48:aload_1         
	//   25   49:bipush          125
	//   26   51:invokevirtual   #173 <Method StringBuilder StringBuilder.append(char)>
	//   27   54:pop             
		return stringbuilder.toString();
	//   28   55:aload_1         
	//   29   56:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   30   59:areturn         
	}

	private final List items;
	private final String name;
}
