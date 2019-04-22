// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			LottieComposition, AnimatableTransform, ShapeGroup, Keyframe

class Layer
{
	static class Factory
	{

		static Layer newInstance(LottieComposition lottiecomposition)
		{
			Rect rect = lottiecomposition.getBounds();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #15  <Method Rect LottieComposition.getBounds()>
		//    2    4:astore_1        
			return new Layer(Collections.emptyList(), lottiecomposition, ((String) (null)), -1L, LayerType.PreComp, -1L, ((String) (null)), Collections.emptyList(), AnimatableTransform.Factory.newInstance(), 0, 0, 0, 0.0F, 0.0F, rect.width(), rect.height(), Collections.emptyList(), MatteType.None);
		//    3    5:new             #6   <Class Layer>
		//    4    8:dup             
		//    5    9:invokestatic    #21  <Method List Collections.emptyList()>
		//    6   12:aload_0         
		//    7   13:aconst_null     
		//    8   14:ldc2w           #22  <Long -1L>
		//    9   17:getstatic       #29  <Field Layer$LayerType Layer$LayerType.PreComp>
		//   10   20:ldc2w           #22  <Long -1L>
		//   11   23:aconst_null     
		//   12   24:invokestatic    #21  <Method List Collections.emptyList()>
		//   13   27:invokestatic    #34  <Method AnimatableTransform AnimatableTransform$Factory.newInstance()>
		//   14   30:iconst_0        
		//   15   31:iconst_0        
		//   16   32:iconst_0        
		//   17   33:fconst_0        
		//   18   34:fconst_0        
		//   19   35:aload_1         
		//   20   36:invokevirtual   #40  <Method int Rect.width()>
		//   21   39:aload_1         
		//   22   40:invokevirtual   #43  <Method int Rect.height()>
		//   23   43:invokestatic    #21  <Method List Collections.emptyList()>
		//   24   46:getstatic       #49  <Field Layer$MatteType Layer$MatteType.None>
		//   25   49:aconst_null     
		//   26   50:invokespecial   #53  <Method void Layer(List, LottieComposition, String, long, Layer$LayerType, long, String, List, AnimatableTransform, int, int, int, float, float, int, int, List, Layer$MatteType, Layer$1)>
		//   27   53:areturn         
		}

		static Layer newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			String s = jsonobject.optString("nm");
		//    0    0:aload_0         
		//    1    1:ldc1            #57  <String "nm">
		//    2    3:invokevirtual   #63  <Method String JSONObject.optString(String)>
		//    3    6:astore          17
			String s1 = jsonobject.optString("refId");
		//    4    8:aload_0         
		//    5    9:ldc1            #65  <String "refId">
		//    6   11:invokevirtual   #63  <Method String JSONObject.optString(String)>
		//    7   14:astore          18
			long l1 = jsonobject.optLong("ind");
		//    8   16:aload_0         
		//    9   17:ldc1            #67  <String "ind">
		//   10   19:invokevirtual   #71  <Method long JSONObject.optLong(String)>
		//   11   22:lstore          11
			int i = jsonobject.optInt("ty", -1);
		//   12   24:aload_0         
		//   13   25:ldc1            #73  <String "ty">
		//   14   27:iconst_m1       
		//   15   28:invokevirtual   #77  <Method int JSONObject.optInt(String, int)>
		//   16   31:istore          6
			LayerType layertype;
			if(i < LayerType.Unknown.ordinal())
		//*  17   33:iload           6
		//*  18   35:getstatic       #80  <Field Layer$LayerType Layer$LayerType.Unknown>
		//*  19   38:invokevirtual   #83  <Method int Layer$LayerType.ordinal()>
		//*  20   41:icmpge          55
				layertype = LayerType.values()[i];
		//   21   44:invokestatic    #87  <Method Layer$LayerType[] Layer$LayerType.values()>
		//   22   47:iload           6
		//   23   49:aaload          
		//   24   50:astore          15
			else
		//*  25   52:goto            60
				layertype = LayerType.Unknown;
		//   26   55:getstatic       #80  <Field Layer$LayerType Layer$LayerType.Unknown>
		//   27   58:astore          15
			long l2 = jsonobject.optLong("parent", -1L);
		//   28   60:aload_0         
		//   29   61:ldc1            #89  <String "parent">
		//   30   63:ldc2w           #22  <Long -1L>
		//   31   66:invokevirtual   #92  <Method long JSONObject.optLong(String, long)>
		//   32   69:lstore          13
			int j;
			int k;
			if(layertype == LayerType.Solid)
		//*  33   71:aload           15
		//*  34   73:getstatic       #95  <Field Layer$LayerType Layer$LayerType.Solid>
		//*  35   76:if_acmpne       123
			{
				i = (int)((float)jsonobject.optInt("sw") * lottiecomposition.getDpScale());
		//   36   79:aload_0         
		//   37   80:ldc1            #97  <String "sw">
		//   38   82:invokevirtual   #100 <Method int JSONObject.optInt(String)>
		//   39   85:i2f             
		//   40   86:aload_1         
		//   41   87:invokevirtual   #104 <Method float LottieComposition.getDpScale()>
		//   42   90:fmul            
		//   43   91:f2i             
		//   44   92:istore          6
				j = (int)((float)jsonobject.optInt("sh") * lottiecomposition.getDpScale());
		//   45   94:aload_0         
		//   46   95:ldc1            #106 <String "sh">
		//   47   97:invokevirtual   #100 <Method int JSONObject.optInt(String)>
		//   48  100:i2f             
		//   49  101:aload_1         
		//   50  102:invokevirtual   #104 <Method float LottieComposition.getDpScale()>
		//   51  105:fmul            
		//   52  106:f2i             
		//   53  107:istore          7
				k = Color.parseColor(jsonobject.optString("sc"));
		//   54  109:aload_0         
		//   55  110:ldc1            #108 <String "sc">
		//   56  112:invokevirtual   #63  <Method String JSONObject.optString(String)>
		//   57  115:invokestatic    #113 <Method int Color.parseColor(String)>
		//   58  118:istore          8
			} else
		//*  59  120:goto            132
			{
				i = 0;
		//   60  123:iconst_0        
		//   61  124:istore          6
				j = 0;
		//   62  126:iconst_0        
		//   63  127:istore          7
				k = 0;
		//   64  129:iconst_0        
		//   65  130:istore          8
			}
			AnimatableTransform animatabletransform = AnimatableTransform.Factory.newInstance(jsonobject.optJSONObject("ks"), lottiecomposition);
		//   66  132:aload_0         
		//   67  133:ldc1            #115 <String "ks">
		//   68  135:invokevirtual   #119 <Method JSONObject JSONObject.optJSONObject(String)>
		//   69  138:aload_1         
		//   70  139:invokestatic    #122 <Method AnimatableTransform AnimatableTransform$Factory.newInstance(JSONObject, LottieComposition)>
		//   71  142:astore          19
			MatteType mattetype = MatteType.values()[jsonobject.optInt("tt")];
		//   72  144:invokestatic    #125 <Method Layer$MatteType[] Layer$MatteType.values()>
		//   73  147:aload_0         
		//   74  148:ldc1            #127 <String "tt">
		//   75  150:invokevirtual   #100 <Method int JSONObject.optInt(String)>
		//   76  153:aaload          
		//   77  154:astore          20
			ArrayList arraylist1 = new ArrayList();
		//   78  156:new             #129 <Class ArrayList>
		//   79  159:dup             
		//   80  160:invokespecial   #132 <Method void ArrayList()>
		//   81  163:astore          21
			ArrayList arraylist2 = new ArrayList();
		//   82  165:new             #129 <Class ArrayList>
		//   83  168:dup             
		//   84  169:invokespecial   #132 <Method void ArrayList()>
		//   85  172:astore          22
			ArrayList arraylist = new ArrayList();
		//   86  174:new             #129 <Class ArrayList>
		//   87  177:dup             
		//   88  178:invokespecial   #132 <Method void ArrayList()>
		//   89  181:astore          16
			JSONArray jsonarray = jsonobject.optJSONArray("masksProperties");
		//   90  183:aload_0         
		//   91  184:ldc1            #134 <String "masksProperties">
		//   92  186:invokevirtual   #138 <Method JSONArray JSONObject.optJSONArray(String)>
		//   93  189:astore          23
			if(jsonarray != null)
		//*  94  191:aload           23
		//*  95  193:ifnull          237
			{
				for(int l = 0; l < jsonarray.length(); l++)
		//*  96  196:iconst_0        
		//*  97  197:istore          9
		//*  98  199:iload           9
		//*  99  201:aload           23
		//* 100  203:invokevirtual   #143 <Method int JSONArray.length()>
		//* 101  206:icmpge          237
					((List) (arraylist2)).add(((Object) (Mask.Factory.newMask(jsonarray.optJSONObject(l), lottiecomposition))));
		//  102  209:aload           22
		//  103  211:aload           23
		//  104  213:iload           9
		//  105  215:invokevirtual   #146 <Method JSONObject JSONArray.optJSONObject(int)>
		//  106  218:aload_1         
		//  107  219:invokestatic    #152 <Method Mask Mask$Factory.newMask(JSONObject, LottieComposition)>
		//  108  222:invokeinterface #158 <Method boolean List.add(Object)>
		//  109  227:pop             

		//  110  228:iload           9
		//  111  230:iconst_1        
		//  112  231:iadd            
		//  113  232:istore          9
			}
		//* 114  234:goto            199
			jsonarray = jsonobject.optJSONArray("shapes");
		//  115  237:aload_0         
		//  116  238:ldc1            #160 <String "shapes">
		//  117  240:invokevirtual   #138 <Method JSONArray JSONObject.optJSONArray(String)>
		//  118  243:astore          23
			if(jsonarray != null)
		//* 119  245:aload           23
		//* 120  247:ifnull          300
			{
				for(int i1 = 0; i1 < jsonarray.length(); i1++)
		//* 121  250:iconst_0        
		//* 122  251:istore          9
		//* 123  253:iload           9
		//* 124  255:aload           23
		//* 125  257:invokevirtual   #143 <Method int JSONArray.length()>
		//* 126  260:icmpge          300
				{
					Object obj = ShapeGroup.shapeItemWithJson(jsonarray.optJSONObject(i1), lottiecomposition);
		//  127  263:aload           23
		//  128  265:iload           9
		//  129  267:invokevirtual   #146 <Method JSONObject JSONArray.optJSONObject(int)>
		//  130  270:aload_1         
		//  131  271:invokestatic    #166 <Method Object ShapeGroup.shapeItemWithJson(JSONObject, LottieComposition)>
		//  132  274:astore          24
					if(obj != null)
		//* 133  276:aload           24
		//* 134  278:ifnull          291
						((List) (arraylist1)).add(obj);
		//  135  281:aload           21
		//  136  283:aload           24
		//  137  285:invokeinterface #158 <Method boolean List.add(Object)>
		//  138  290:pop             
				}

		//  139  291:iload           9
		//  140  293:iconst_1        
		//  141  294:iadd            
		//  142  295:istore          9
			}
		//* 143  297:goto            253
			float f1 = (float)jsonobject.optDouble("sr", 1.0D);
		//  144  300:aload_0         
		//  145  301:ldc1            #168 <String "sr">
		//  146  303:dconst_1        
		//  147  304:invokevirtual   #172 <Method double JSONObject.optDouble(String, double)>
		//  148  307:d2f             
		//  149  308:fstore_3        
			float f2 = (float)jsonobject.optDouble("st") / lottiecomposition.getDurationFrames();
		//  150  309:aload_0         
		//  151  310:ldc1            #174 <String "st">
		//  152  312:invokevirtual   #177 <Method double JSONObject.optDouble(String)>
		//  153  315:d2f             
		//  154  316:aload_1         
		//  155  317:invokevirtual   #180 <Method float LottieComposition.getDurationFrames()>
		//  156  320:fdiv            
		//  157  321:fstore          4
			int j1;
			int k1;
			if(layertype == LayerType.PreComp)
		//* 158  323:aload           15
		//* 159  325:getstatic       #29  <Field Layer$LayerType Layer$LayerType.PreComp>
		//* 160  328:if_acmpne       364
			{
				j1 = (int)((float)jsonobject.optInt("w") * lottiecomposition.getDpScale());
		//  161  331:aload_0         
		//  162  332:ldc1            #182 <String "w">
		//  163  334:invokevirtual   #100 <Method int JSONObject.optInt(String)>
		//  164  337:i2f             
		//  165  338:aload_1         
		//  166  339:invokevirtual   #104 <Method float LottieComposition.getDpScale()>
		//  167  342:fmul            
		//  168  343:f2i             
		//  169  344:istore          9
				k1 = (int)((float)jsonobject.optInt("h") * lottiecomposition.getDpScale());
		//  170  346:aload_0         
		//  171  347:ldc1            #184 <String "h">
		//  172  349:invokevirtual   #100 <Method int JSONObject.optInt(String)>
		//  173  352:i2f             
		//  174  353:aload_1         
		//  175  354:invokevirtual   #104 <Method float LottieComposition.getDpScale()>
		//  176  357:fmul            
		//  177  358:f2i             
		//  178  359:istore          10
			} else
		//* 179  361:goto            370
			{
				j1 = 0;
		//  180  364:iconst_0        
		//  181  365:istore          9
				k1 = 0;
		//  182  367:iconst_0        
		//  183  368:istore          10
			}
			float f3 = jsonobject.optLong("ip");
		//  184  370:aload_0         
		//  185  371:ldc1            #186 <String "ip">
		//  186  373:invokevirtual   #71  <Method long JSONObject.optLong(String)>
		//  187  376:l2f             
		//  188  377:fstore          5
			float f = jsonobject.optLong("op");
		//  189  379:aload_0         
		//  190  380:ldc1            #188 <String "op">
		//  191  382:invokevirtual   #71  <Method long JSONObject.optLong(String)>
		//  192  385:l2f             
		//  193  386:fstore_2        
			if(f3 > 0.0F)
		//* 194  387:fload           5
		//* 195  389:fconst_0        
		//* 196  390:fcmpl           
		//* 197  391:ifle            428
				((List) (arraylist)).add(((Object) (new Keyframe(lottiecomposition, ((Object) (Float.valueOf(0.0F))), ((Object) (Float.valueOf(0.0F))), ((android.view.animation.Interpolator) (null)), 0.0F, Float.valueOf(f3)))));
		//  198  394:aload           16
		//  199  396:new             #190 <Class Keyframe>
		//  200  399:dup             
		//  201  400:aload_1         
		//  202  401:fconst_0        
		//  203  402:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  204  405:fconst_0        
		//  205  406:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  206  409:aconst_null     
		//  207  410:fconst_0        
		//  208  411:fload           5
		//  209  413:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  210  416:invokespecial   #199 <Method void Keyframe(LottieComposition, Object, Object, android.view.animation.Interpolator, float, Float)>
		//  211  419:invokeinterface #158 <Method boolean List.add(Object)>
		//  212  424:pop             
		//* 213  425:goto            428
			if(f <= 0.0F)
		//* 214  428:fload_2         
		//* 215  429:fconst_0        
		//* 216  430:fcmpl           
		//* 217  431:ifle            437
		//* 218  434:goto            445
				f = lottiecomposition.getEndFrame() + 1L;
		//  219  437:aload_1         
		//  220  438:invokevirtual   #203 <Method long LottieComposition.getEndFrame()>
		//  221  441:lconst_1        
		//  222  442:ladd            
		//  223  443:l2f             
		//  224  444:fstore_2        
			((List) (arraylist)).add(((Object) (new Keyframe(lottiecomposition, ((Object) (Float.valueOf(1.0F))), ((Object) (Float.valueOf(1.0F))), ((android.view.animation.Interpolator) (null)), f3, Float.valueOf(f)))));
		//  225  445:aload           16
		//  226  447:new             #190 <Class Keyframe>
		//  227  450:dup             
		//  228  451:aload_1         
		//  229  452:fconst_1        
		//  230  453:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  231  456:fconst_1        
		//  232  457:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  233  460:aconst_null     
		//  234  461:fload           5
		//  235  463:fload_2         
		//  236  464:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  237  467:invokespecial   #199 <Method void Keyframe(LottieComposition, Object, Object, android.view.animation.Interpolator, float, Float)>
		//  238  470:invokeinterface #158 <Method boolean List.add(Object)>
		//  239  475:pop             
			if(f <= lottiecomposition.getDurationFrames())
		//* 240  476:fload_2         
		//* 241  477:aload_1         
		//* 242  478:invokevirtual   #180 <Method float LottieComposition.getDurationFrames()>
		//* 243  481:fcmpg           
		//* 244  482:ifgt            519
				((List) (arraylist)).add(((Object) (new Keyframe(lottiecomposition, ((Object) (Float.valueOf(0.0F))), ((Object) (Float.valueOf(0.0F))), ((android.view.animation.Interpolator) (null)), f, Float.valueOf(lottiecomposition.getEndFrame())))));
		//  245  485:aload           16
		//  246  487:new             #190 <Class Keyframe>
		//  247  490:dup             
		//  248  491:aload_1         
		//  249  492:fconst_0        
		//  250  493:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  251  496:fconst_0        
		//  252  497:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  253  500:aconst_null     
		//  254  501:fload_2         
		//  255  502:aload_1         
		//  256  503:invokevirtual   #203 <Method long LottieComposition.getEndFrame()>
		//  257  506:l2f             
		//  258  507:invokestatic    #196 <Method Float Float.valueOf(float)>
		//  259  510:invokespecial   #199 <Method void Keyframe(LottieComposition, Object, Object, android.view.animation.Interpolator, float, Float)>
		//  260  513:invokeinterface #158 <Method boolean List.add(Object)>
		//  261  518:pop             
			return new Layer(((List) (arraylist1)), lottiecomposition, s, l1, layertype, l2, s1, ((List) (arraylist2)), animatabletransform, i, j, k, f1, f2, j1, k1, ((List) (arraylist)), mattetype);
		//  262  519:new             #6   <Class Layer>
		//  263  522:dup             
		//  264  523:aload           21
		//  265  525:aload_1         
		//  266  526:aload           17
		//  267  528:lload           11
		//  268  530:aload           15
		//  269  532:lload           13
		//  270  534:aload           18
		//  271  536:aload           22
		//  272  538:aload           19
		//  273  540:iload           6
		//  274  542:iload           7
		//  275  544:iload           8
		//  276  546:fload_3         
		//  277  547:fload           4
		//  278  549:iload           9
		//  279  551:iload           10
		//  280  553:aload           16
		//  281  555:aload           20
		//  282  557:aconst_null     
		//  283  558:invokespecial   #53  <Method void Layer(List, LottieComposition, String, long, Layer$LayerType, long, String, List, AnimatableTransform, int, int, int, float, float, int, int, List, Layer$MatteType, Layer$1)>
		//  284  561:areturn         
		}
	}

	static final class LayerType extends Enum
	{

		public static LayerType valueOf(String s)
		{
			return (LayerType)Enum.valueOf(com/airbnb/lottie/Layer$LayerType, s);
		//    0    0:ldc1            #2   <Class Layer$LayerType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Layer$LayerType>
		//    4    9:areturn         
		}

		public static LayerType[] values()
		{
			return (LayerType[])((LayerType []) ($VALUES)).clone();
		//    0    0:getstatic       #47  <Field Layer$LayerType[] $VALUES>
		//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.airbnb.lottie.Layer$LayerType_3B_.clone()>
		//    2    6:checkcast       #58  <Class Layer$LayerType[]>
		//    3    9:areturn         
		}

		private static final LayerType $VALUES[];
		public static final LayerType Image;
		public static final LayerType Null;
		public static final LayerType PreComp;
		public static final LayerType Shape;
		public static final LayerType Solid;
		public static final LayerType Text;
		public static final LayerType Unknown;

		static 
		{
			PreComp = new LayerType("PreComp", 0);
		//    0    0:new             #2   <Class Layer$LayerType>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "PreComp">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #25  <Method void Layer$LayerType(String, int)>
		//    5   10:putstatic       #27  <Field Layer$LayerType PreComp>
			Solid = new LayerType("Solid", 1);
		//    6   13:new             #2   <Class Layer$LayerType>
		//    7   16:dup             
		//    8   17:ldc1            #28  <String "Solid">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #25  <Method void Layer$LayerType(String, int)>
		//   11   23:putstatic       #30  <Field Layer$LayerType Solid>
			Image = new LayerType("Image", 2);
		//   12   26:new             #2   <Class Layer$LayerType>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "Image">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #25  <Method void Layer$LayerType(String, int)>
		//   17   36:putstatic       #33  <Field Layer$LayerType Image>
			Null = new LayerType("Null", 3);
		//   18   39:new             #2   <Class Layer$LayerType>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "Null">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #25  <Method void Layer$LayerType(String, int)>
		//   23   49:putstatic       #36  <Field Layer$LayerType Null>
			Shape = new LayerType("Shape", 4);
		//   24   52:new             #2   <Class Layer$LayerType>
		//   25   55:dup             
		//   26   56:ldc1            #37  <String "Shape">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #25  <Method void Layer$LayerType(String, int)>
		//   29   62:putstatic       #39  <Field Layer$LayerType Shape>
			Text = new LayerType("Text", 5);
		//   30   65:new             #2   <Class Layer$LayerType>
		//   31   68:dup             
		//   32   69:ldc1            #40  <String "Text">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #25  <Method void Layer$LayerType(String, int)>
		//   35   75:putstatic       #42  <Field Layer$LayerType Text>
			Unknown = new LayerType("Unknown", 6);
		//   36   78:new             #2   <Class Layer$LayerType>
		//   37   81:dup             
		//   38   82:ldc1            #43  <String "Unknown">
		//   39   84:bipush          6
		//   40   86:invokespecial   #25  <Method void Layer$LayerType(String, int)>
		//   41   89:putstatic       #45  <Field Layer$LayerType Unknown>
			$VALUES = (new LayerType[] {
				PreComp, Solid, Image, Null, Shape, Text, Unknown
			});
		//   42   92:bipush          7
		//   43   94:anewarray       LayerType[]
		//   44   97:dup             
		//   45   98:iconst_0        
		//   46   99:getstatic       #27  <Field Layer$LayerType PreComp>
		//   47  102:aastore         
		//   48  103:dup             
		//   49  104:iconst_1        
		//   50  105:getstatic       #30  <Field Layer$LayerType Solid>
		//   51  108:aastore         
		//   52  109:dup             
		//   53  110:iconst_2        
		//   54  111:getstatic       #33  <Field Layer$LayerType Image>
		//   55  114:aastore         
		//   56  115:dup             
		//   57  116:iconst_3        
		//   58  117:getstatic       #36  <Field Layer$LayerType Null>
		//   59  120:aastore         
		//   60  121:dup             
		//   61  122:iconst_4        
		//   62  123:getstatic       #39  <Field Layer$LayerType Shape>
		//   63  126:aastore         
		//   64  127:dup             
		//   65  128:iconst_5        
		//   66  129:getstatic       #42  <Field Layer$LayerType Text>
		//   67  132:aastore         
		//   68  133:dup             
		//   69  134:bipush          6
		//   70  136:getstatic       #45  <Field Layer$LayerType Unknown>
		//   71  139:aastore         
		//   72  140:putstatic       #47  <Field Layer$LayerType[] $VALUES>
		//*  73  143:return          
		}

		private LayerType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	static final class MatteType extends Enum
	{

		public static MatteType valueOf(String s)
		{
			return (MatteType)Enum.valueOf(com/airbnb/lottie/Layer$MatteType, s);
		//    0    0:ldc1            #2   <Class Layer$MatteType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Layer$MatteType>
		//    4    9:areturn         
		}

		public static MatteType[] values()
		{
			return (MatteType[])((MatteType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field Layer$MatteType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.airbnb.lottie.Layer$MatteType_3B_.clone()>
		//    2    6:checkcast       #46  <Class Layer$MatteType[]>
		//    3    9:areturn         
		}

		private static final MatteType $VALUES[];
		public static final MatteType Add;
		public static final MatteType Invert;
		public static final MatteType None;
		public static final MatteType Unknown;

		static 
		{
			None = new MatteType("None", 0);
		//    0    0:new             #2   <Class Layer$MatteType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "None">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void Layer$MatteType(String, int)>
		//    5   10:putstatic       #24  <Field Layer$MatteType None>
			Add = new MatteType("Add", 1);
		//    6   13:new             #2   <Class Layer$MatteType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "Add">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void Layer$MatteType(String, int)>
		//   11   23:putstatic       #27  <Field Layer$MatteType Add>
			Invert = new MatteType("Invert", 2);
		//   12   26:new             #2   <Class Layer$MatteType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "Invert">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void Layer$MatteType(String, int)>
		//   17   36:putstatic       #30  <Field Layer$MatteType Invert>
			Unknown = new MatteType("Unknown", 3);
		//   18   39:new             #2   <Class Layer$MatteType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "Unknown">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void Layer$MatteType(String, int)>
		//   23   49:putstatic       #33  <Field Layer$MatteType Unknown>
			$VALUES = (new MatteType[] {
				None, Add, Invert, Unknown
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       MatteType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field Layer$MatteType None>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field Layer$MatteType Add>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field Layer$MatteType Invert>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field Layer$MatteType Unknown>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field Layer$MatteType[] $VALUES>
		//*  43   83:return          
		}

		private MatteType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private Layer(List list, LottieComposition lottiecomposition, String s, long l, LayerType layertype, long l1, String s1, List list1, AnimatableTransform animatabletransform, int i, int j, int k, 
			float f, float f1, int i1, int j1, List list2, MatteType mattetype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		shapes = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #58  <Field List shapes>
		composition = lottiecomposition;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #60  <Field LottieComposition composition>
		layerName = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #62  <Field String layerName>
		layerId = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #64  <Field long layerId>
		layerType = layertype;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #66  <Field Layer$LayerType layerType>
		parentId = l1;
	//   17   31:aload_0         
	//   18   32:lload           7
	//   19   34:putfield        #68  <Field long parentId>
		refId = s1;
	//   20   37:aload_0         
	//   21   38:aload           9
	//   22   40:putfield        #70  <Field String refId>
		masks = list1;
	//   23   43:aload_0         
	//   24   44:aload           10
	//   25   46:putfield        #72  <Field List masks>
		transform = animatabletransform;
	//   26   49:aload_0         
	//   27   50:aload           11
	//   28   52:putfield        #74  <Field AnimatableTransform transform>
		solidWidth = i;
	//   29   55:aload_0         
	//   30   56:iload           12
	//   31   58:putfield        #76  <Field int solidWidth>
		solidHeight = j;
	//   32   61:aload_0         
	//   33   62:iload           13
	//   34   64:putfield        #78  <Field int solidHeight>
		solidColor = k;
	//   35   67:aload_0         
	//   36   68:iload           14
	//   37   70:putfield        #80  <Field int solidColor>
		timeStretch = f;
	//   38   73:aload_0         
	//   39   74:fload           15
	//   40   76:putfield        #82  <Field float timeStretch>
		startProgress = f1;
	//   41   79:aload_0         
	//   42   80:fload           16
	//   43   82:putfield        #84  <Field float startProgress>
		preCompWidth = i1;
	//   44   85:aload_0         
	//   45   86:iload           17
	//   46   88:putfield        #86  <Field int preCompWidth>
		preCompHeight = j1;
	//   47   91:aload_0         
	//   48   92:iload           18
	//   49   94:putfield        #88  <Field int preCompHeight>
		inOutKeyframes = list2;
	//   50   97:aload_0         
	//   51   98:aload           19
	//   52  100:putfield        #90  <Field List inOutKeyframes>
		matteType = mattetype;
	//   53  103:aload_0         
	//   54  104:aload           20
	//   55  106:putfield        #92  <Field Layer$MatteType matteType>
	//   56  109:return          
	}

	Layer(List list, LottieComposition lottiecomposition, String s, long l, LayerType layertype, long l1, String s1, List list1, AnimatableTransform animatabletransform, int i, int j, int k, 
			float f, float f1, int i1, int j1, List list2, MatteType mattetype, _cls1 _pcls1)
	{
		this(list, lottiecomposition, s, l, layertype, l1, s1, list1, animatabletransform, i, j, k, f, f1, i1, j1, list2, mattetype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:aload           6
	//    6    8:lload           7
	//    7   10:aload           9
	//    8   12:aload           10
	//    9   14:aload           11
	//   10   16:iload           12
	//   11   18:iload           13
	//   12   20:iload           14
	//   13   22:fload           15
	//   14   24:fload           16
	//   15   26:iload           17
	//   16   28:iload           18
	//   17   30:aload           19
	//   18   32:aload           20
	//   19   34:invokespecial   #98  <Method void Layer(List, LottieComposition, String, long, Layer$LayerType, long, String, List, AnimatableTransform, int, int, int, float, float, int, int, List, Layer$MatteType)>
	//   20   37:return          
	}

	long getId()
	{
		return layerId;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long layerId>
	//    2    4:lreturn         
	}

	List getInOutKeyframes()
	{
		return inOutKeyframes;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field List inOutKeyframes>
	//    2    4:areturn         
	}

	LayerType getLayerType()
	{
		return layerType;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Layer$LayerType layerType>
	//    2    4:areturn         
	}

	List getMasks()
	{
		return masks;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field List masks>
	//    2    4:areturn         
	}

	MatteType getMatteType()
	{
		return matteType;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Layer$MatteType matteType>
	//    2    4:areturn         
	}

	String getName()
	{
		return layerName;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String layerName>
	//    2    4:areturn         
	}

	long getParentId()
	{
		return parentId;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long parentId>
	//    2    4:lreturn         
	}

	String getRefId()
	{
		return refId;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String refId>
	//    2    4:areturn         
	}

	List getShapes()
	{
		return shapes;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field List shapes>
	//    2    4:areturn         
	}

	int getSolidColor()
	{
		return solidColor;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int solidColor>
	//    2    4:ireturn         
	}

	int getSolidHeight()
	{
		return solidHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int solidHeight>
	//    2    4:ireturn         
	}

	int getSolidWidth()
	{
		return solidWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int solidWidth>
	//    2    4:ireturn         
	}

	float getStartProgress()
	{
		return startProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float startProgress>
	//    2    4:freturn         
	}

	AnimatableTransform getTransform()
	{
		return transform;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field AnimatableTransform transform>
	//    2    4:areturn         
	}

	public String toString()
	{
		return toString("");
	//    0    0:aload_0         
	//    1    1:ldc1            #127 <String "">
	//    2    3:invokevirtual   #130 <Method String toString(String)>
	//    3    6:areturn         
	}

	String toString(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #132 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #133 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(getName());
	//    8   14:aload_3         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #139 <Method String getName()>
	//   11   19:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		stringbuilder.append("\n");
	//   13   23:aload_3         
	//   14   24:ldc1            #141 <String "\n">
	//   15   26:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		Layer layer = composition.layerModelForId(getParentId());
	//   17   30:aload_0         
	//   18   31:getfield        #60  <Field LottieComposition composition>
	//   19   34:aload_0         
	//   20   35:invokevirtual   #143 <Method long getParentId()>
	//   21   38:invokevirtual   #149 <Method Layer LottieComposition.layerModelForId(long)>
	//   22   41:astore_2        
		if(layer != null)
	//*  23   42:aload_2         
	//*  24   43:ifnull          122
		{
			stringbuilder.append("\t\tParents: ");
	//   25   46:aload_3         
	//   26   47:ldc1            #151 <String "\t\tParents: ">
	//   27   49:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(layer.getName());
	//   29   53:aload_3         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #139 <Method String getName()>
	//   32   58:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
			for(layer = composition.layerModelForId(layer.getParentId()); layer != null; layer = composition.layerModelForId(layer.getParentId()))
	//*  34   62:aload_0         
	//*  35   63:getfield        #60  <Field LottieComposition composition>
	//*  36   66:aload_2         
	//*  37   67:invokevirtual   #143 <Method long getParentId()>
	//*  38   70:invokevirtual   #149 <Method Layer LottieComposition.layerModelForId(long)>
	//*  39   73:astore_2        
	//*  40   74:aload_2         
	//*  41   75:ifnull          109
			{
				stringbuilder.append("->");
	//   42   78:aload_3         
	//   43   79:ldc1            #153 <String "->">
	//   44   81:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
				stringbuilder.append(layer.getName());
	//   46   85:aload_3         
	//   47   86:aload_2         
	//   48   87:invokevirtual   #139 <Method String getName()>
	//   49   90:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   50   93:pop             
			}

	//   51   94:aload_0         
	//   52   95:getfield        #60  <Field LottieComposition composition>
	//   53   98:aload_2         
	//   54   99:invokevirtual   #143 <Method long getParentId()>
	//   55  102:invokevirtual   #149 <Method Layer LottieComposition.layerModelForId(long)>
	//   56  105:astore_2        
	//*  57  106:goto            74
			stringbuilder.append(s);
	//   58  109:aload_3         
	//   59  110:aload_1         
	//   60  111:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   61  114:pop             
			stringbuilder.append("\n");
	//   62  115:aload_3         
	//   63  116:ldc1            #141 <String "\n">
	//   64  118:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   65  121:pop             
		}
		if(!getMasks().isEmpty())
	//*  66  122:aload_0         
	//*  67  123:invokevirtual   #155 <Method List getMasks()>
	//*  68  126:invokeinterface #161 <Method boolean List.isEmpty()>
	//*  69  131:ifne            168
		{
			stringbuilder.append(s);
	//   70  134:aload_3         
	//   71  135:aload_1         
	//   72  136:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   73  139:pop             
			stringbuilder.append("\tMasks: ");
	//   74  140:aload_3         
	//   75  141:ldc1            #163 <String "\tMasks: ">
	//   76  143:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   77  146:pop             
			stringbuilder.append(getMasks().size());
	//   78  147:aload_3         
	//   79  148:aload_0         
	//   80  149:invokevirtual   #155 <Method List getMasks()>
	//   81  152:invokeinterface #166 <Method int List.size()>
	//   82  157:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   83  160:pop             
			stringbuilder.append("\n");
	//   84  161:aload_3         
	//   85  162:ldc1            #141 <String "\n">
	//   86  164:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   87  167:pop             
		}
		if(getSolidWidth() != 0 && getSolidHeight() != 0)
	//*  88  168:aload_0         
	//*  89  169:invokevirtual   #171 <Method int getSolidWidth()>
	//*  90  172:ifeq            242
	//*  91  175:aload_0         
	//*  92  176:invokevirtual   #173 <Method int getSolidHeight()>
	//*  93  179:ifeq            242
		{
			stringbuilder.append(s);
	//   94  182:aload_3         
	//   95  183:aload_1         
	//   96  184:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   97  187:pop             
			stringbuilder.append("\tBackground: ");
	//   98  188:aload_3         
	//   99  189:ldc1            #175 <String "\tBackground: ">
	//  100  191:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  101  194:pop             
			stringbuilder.append(String.format(Locale.US, "%dx%d %X\n", new Object[] {
				Integer.valueOf(getSolidWidth()), Integer.valueOf(getSolidHeight()), Integer.valueOf(getSolidColor())
			}));
	//  102  195:aload_3         
	//  103  196:getstatic       #181 <Field Locale Locale.US>
	//  104  199:ldc1            #183 <String "%dx%d %X\n">
	//  105  201:iconst_3        
	//  106  202:anewarray       Object[]
	//  107  205:dup             
	//  108  206:iconst_0        
	//  109  207:aload_0         
	//  110  208:invokevirtual   #171 <Method int getSolidWidth()>
	//  111  211:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//  112  214:aastore         
	//  113  215:dup             
	//  114  216:iconst_1        
	//  115  217:aload_0         
	//  116  218:invokevirtual   #173 <Method int getSolidHeight()>
	//  117  221:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//  118  224:aastore         
	//  119  225:dup             
	//  120  226:iconst_2        
	//  121  227:aload_0         
	//  122  228:invokevirtual   #191 <Method int getSolidColor()>
	//  123  231:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//  124  234:aastore         
	//  125  235:invokestatic    #197 <Method String String.format(Locale, String, Object[])>
	//  126  238:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  127  241:pop             
		}
		if(!shapes.isEmpty())
	//* 128  242:aload_0         
	//* 129  243:getfield        #58  <Field List shapes>
	//* 130  246:invokeinterface #161 <Method boolean List.isEmpty()>
	//* 131  251:ifne            324
		{
			stringbuilder.append(s);
	//  132  254:aload_3         
	//  133  255:aload_1         
	//  134  256:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  135  259:pop             
			stringbuilder.append("\tShapes:\n");
	//  136  260:aload_3         
	//  137  261:ldc1            #199 <String "\tShapes:\n">
	//  138  263:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  139  266:pop             
			for(Iterator iterator = shapes.iterator(); iterator.hasNext(); stringbuilder.append("\n"))
	//* 140  267:aload_0         
	//* 141  268:getfield        #58  <Field List shapes>
	//* 142  271:invokeinterface #203 <Method Iterator List.iterator()>
	//* 143  276:astore_2        
	//* 144  277:aload_2         
	//* 145  278:invokeinterface #208 <Method boolean Iterator.hasNext()>
	//* 146  283:ifeq            324
			{
				Object obj = iterator.next();
	//  147  286:aload_2         
	//  148  287:invokeinterface #212 <Method Object Iterator.next()>
	//  149  292:astore          4
				stringbuilder.append(s);
	//  150  294:aload_3         
	//  151  295:aload_1         
	//  152  296:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  153  299:pop             
				stringbuilder.append("\t\t");
	//  154  300:aload_3         
	//  155  301:ldc1            #214 <String "\t\t">
	//  156  303:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  157  306:pop             
				stringbuilder.append(obj);
	//  158  307:aload_3         
	//  159  308:aload           4
	//  160  310:invokevirtual   #217 <Method StringBuilder StringBuilder.append(Object)>
	//  161  313:pop             
			}

	//  162  314:aload_3         
	//  163  315:ldc1            #141 <String "\n">
	//  164  317:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  165  320:pop             
		}
	//* 166  321:goto            277
		return stringbuilder.toString();
	//  167  324:aload_3         
	//  168  325:invokevirtual   #219 <Method String StringBuilder.toString()>
	//  169  328:areturn         
	}

	private static final String TAG = "Layer";
	private final LottieComposition composition;
	private final List inOutKeyframes;
	private final long layerId;
	private final String layerName;
	private final LayerType layerType;
	private final List masks;
	private final MatteType matteType;
	private final long parentId;
	private final int preCompHeight;
	private final int preCompWidth;
	private final String refId;
	private final List shapes;
	private final int solidColor;
	private final int solidHeight;
	private final int solidWidth;
	private final float startProgress;
	private final float timeStretch;
	private final AnimatableTransform transform;

	static 
	{
	//    0    0:return          
	}
}
