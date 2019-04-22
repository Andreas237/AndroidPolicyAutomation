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
//			Layer, LottieComposition, ShapeGroup, Keyframe

static class Layer$Factory
{

	static Layer newInstance(LottieComposition lottiecomposition)
	{
		Rect rect = lottiecomposition.getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #15  <Method Rect LottieComposition.getBounds()>
	//    2    4:astore_1        
		return new Layer(Collections.emptyList(), lottiecomposition, ((String) (null)), -1L, e.PreComp, -1L, ((String) (null)), Collections.emptyList(), sform.Factory.newInstance(), 0, 0, 0, 0.0F, 0.0F, rect.width(), rect.height(), Collections.emptyList(), e.None, ((Layer._cls1) (null)));
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
		e e;
		if(i < e.Unknown.ordinal())
	//*  17   33:iload           6
	//*  18   35:getstatic       #80  <Field Layer$LayerType Layer$LayerType.Unknown>
	//*  19   38:invokevirtual   #83  <Method int Layer$LayerType.ordinal()>
	//*  20   41:icmpge          55
			e = com.airbnb.lottie.e.values()[i];
	//   21   44:invokestatic    #87  <Method Layer$LayerType[] Layer$LayerType.values()>
	//   22   47:iload           6
	//   23   49:aaload          
	//   24   50:astore          15
		else
	//*  25   52:goto            60
			e = e.Unknown;
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
		if(e == e.Solid)
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
		AnimatableTransform animatabletransform = sform.Factory.newInstance(jsonobject.optJSONObject("ks"), lottiecomposition);
	//   66  132:aload_0         
	//   67  133:ldc1            #115 <String "ks">
	//   68  135:invokevirtual   #119 <Method JSONObject JSONObject.optJSONObject(String)>
	//   69  138:aload_1         
	//   70  139:invokestatic    #122 <Method AnimatableTransform AnimatableTransform$Factory.newInstance(JSONObject, LottieComposition)>
	//   71  142:astore          19
		e e1 = com.airbnb.lottie.e.values()[jsonobject.optInt("tt")];
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
		if(e == e.PreComp)
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
		return new Layer(((List) (arraylist1)), lottiecomposition, s, l1, e, l2, s1, ((List) (arraylist2)), animatabletransform, i, j, k, f1, f2, j1, k1, ((List) (arraylist)), e1, ((Layer._cls1) (null)));
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
