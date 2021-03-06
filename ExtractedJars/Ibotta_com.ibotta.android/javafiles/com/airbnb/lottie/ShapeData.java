// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			CubicCurveData, MiscUtils

class ShapeData
{
	static class Factory
		implements AnimatableValue.Factory
	{

		private static PointF vertexAtIndex(int i, JSONArray jsonarray)
		{
			if(i < jsonarray.length())
		//*   0    0:iload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #29  <Method int JSONArray.length()>
		//*   3    5:icmpge          117
			{
				Object obj = ((Object) (jsonarray.optJSONArray(i)));
		//    4    8:aload_1         
		//    5    9:iload_0         
		//    6   10:invokevirtual   #33  <Method JSONArray JSONArray.optJSONArray(int)>
		//    7   13:astore          4
				jsonarray = ((JSONArray) (((JSONArray) (obj)).opt(0)));
		//    8   15:aload           4
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #37  <Method Object JSONArray.opt(int)>
		//   11   21:astore_1        
				obj = ((JSONArray) (obj)).opt(1);
		//   12   22:aload           4
		//   13   24:iconst_1        
		//   14   25:invokevirtual   #37  <Method Object JSONArray.opt(int)>
		//   15   28:astore          4
				float f;
				if(jsonarray instanceof Double)
		//*  16   30:aload_1         
		//*  17   31:instanceof      #39  <Class Double>
		//*  18   34:ifeq            58
					f = (new Float(((Double)jsonarray).doubleValue())).floatValue();
		//   19   37:new             #41  <Class Float>
		//   20   40:dup             
		//   21   41:aload_1         
		//   22   42:checkcast       #39  <Class Double>
		//   23   45:invokevirtual   #45  <Method double Double.doubleValue()>
		//   24   48:invokespecial   #48  <Method void Float(double)>
		//   25   51:invokevirtual   #52  <Method float Float.floatValue()>
		//   26   54:fstore_2        
				else
		//*  27   55:goto            67
					f = ((Integer)jsonarray).intValue();
		//   28   58:aload_1         
		//   29   59:checkcast       #54  <Class Integer>
		//   30   62:invokevirtual   #57  <Method int Integer.intValue()>
		//   31   65:i2f             
		//   32   66:fstore_2        
				float f1;
				if(obj instanceof Double)
		//*  33   67:aload           4
		//*  34   69:instanceof      #39  <Class Double>
		//*  35   72:ifeq            97
					f1 = (new Float(((Double)obj).doubleValue())).floatValue();
		//   36   75:new             #41  <Class Float>
		//   37   78:dup             
		//   38   79:aload           4
		//   39   81:checkcast       #39  <Class Double>
		//   40   84:invokevirtual   #45  <Method double Double.doubleValue()>
		//   41   87:invokespecial   #48  <Method void Float(double)>
		//   42   90:invokevirtual   #52  <Method float Float.floatValue()>
		//   43   93:fstore_3        
				else
		//*  44   94:goto            107
					f1 = ((Integer)obj).intValue();
		//   45   97:aload           4
		//   46   99:checkcast       #54  <Class Integer>
		//   47  102:invokevirtual   #57  <Method int Integer.intValue()>
		//   48  105:i2f             
		//   49  106:fstore_3        
				return new PointF(f, f1);
		//   50  107:new             #59  <Class PointF>
		//   51  110:dup             
		//   52  111:fload_2         
		//   53  112:fload_3         
		//   54  113:invokespecial   #62  <Method void PointF(float, float)>
		//   55  116:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   56  117:new             #64  <Class StringBuilder>
		//   57  120:dup             
		//   58  121:invokespecial   #65  <Method void StringBuilder()>
		//   59  124:astore          4
				stringbuilder.append("Invalid index ");
		//   60  126:aload           4
		//   61  128:ldc1            #67  <String "Invalid index ">
		//   62  130:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   63  133:pop             
				stringbuilder.append(i);
		//   64  134:aload           4
		//   65  136:iload_0         
		//   66  137:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
		//   67  140:pop             
				stringbuilder.append(". There are only ");
		//   68  141:aload           4
		//   69  143:ldc1            #76  <String ". There are only ">
		//   70  145:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   71  148:pop             
				stringbuilder.append(jsonarray.length());
		//   72  149:aload           4
		//   73  151:aload_1         
		//   74  152:invokevirtual   #29  <Method int JSONArray.length()>
		//   75  155:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
		//   76  158:pop             
				stringbuilder.append(" points.");
		//   77  159:aload           4
		//   78  161:ldc1            #78  <String " points.">
		//   79  163:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   80  166:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
		//   81  167:new             #80  <Class IllegalArgumentException>
		//   82  170:dup             
		//   83  171:aload           4
		//   84  173:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   85  176:invokespecial   #87  <Method void IllegalArgumentException(String)>
		//   86  179:athrow          
			}
		}

		public ShapeData valueFromObject(Object obj, float f)
		{
label0:
			{
				if(obj instanceof JSONArray)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #25  <Class JSONArray>
		//*   2    4:ifeq            45
				{
					obj = ((JSONArray)obj).opt(0);
		//    3    7:aload_1         
		//    4    8:checkcast       #25  <Class JSONArray>
		//    5   11:iconst_0        
		//    6   12:invokevirtual   #37  <Method Object JSONArray.opt(int)>
		//    7   15:astore_1        
					if(obj instanceof JSONObject)
		//*   8   16:aload_1         
		//*   9   17:instanceof      #91  <Class JSONObject>
		//*  10   20:ifeq            40
					{
						obj = ((Object) ((JSONObject)obj));
		//   11   23:aload_1         
		//   12   24:checkcast       #91  <Class JSONObject>
		//   13   27:astore_1        
						if(((JSONObject) (obj)).has("v"))
		//*  14   28:aload_1         
		//*  15   29:ldc1            #93  <String "v">
		//*  16   31:invokevirtual   #97  <Method boolean JSONObject.has(String)>
		//*  17   34:ifeq            40
							break label0;
		//   18   37:goto            71
					}
					obj = null;
		//   19   40:aconst_null     
		//   20   41:astore_1        
					break label0;
		//   21   42:goto            71
				}
				if(obj instanceof JSONObject)
		//*  22   45:aload_1         
		//*  23   46:instanceof      #91  <Class JSONObject>
		//*  24   49:ifeq            69
				{
					obj = ((Object) ((JSONObject)obj));
		//   25   52:aload_1         
		//   26   53:checkcast       #91  <Class JSONObject>
		//   27   56:astore_1        
					if(((JSONObject) (obj)).has("v"))
		//*  28   57:aload_1         
		//*  29   58:ldc1            #93  <String "v">
		//*  30   60:invokevirtual   #97  <Method boolean JSONObject.has(String)>
		//*  31   63:ifeq            69
						break label0;
		//   32   66:goto            71
				}
				obj = null;
		//   33   69:aconst_null     
		//   34   70:astore_1        
			}
			if(obj == null)
		//*  35   71:aload_1         
		//*  36   72:ifnonnull       77
				return null;
		//   37   75:aconst_null     
		//   38   76:areturn         
			Object obj3 = ((Object) (((JSONObject) (obj)).optJSONArray("v")));
		//   39   77:aload_1         
		//   40   78:ldc1            #93  <String "v">
		//   41   80:invokevirtual   #100 <Method JSONArray JSONObject.optJSONArray(String)>
		//   42   83:astore          10
			Object obj1 = ((Object) (((JSONObject) (obj)).optJSONArray("i")));
		//   43   85:aload_1         
		//   44   86:ldc1            #102 <String "i">
		//   45   88:invokevirtual   #100 <Method JSONArray JSONObject.optJSONArray(String)>
		//   46   91:astore          8
			Object obj2 = ((Object) (((JSONObject) (obj)).optJSONArray("o")));
		//   47   93:aload_1         
		//   48   94:ldc1            #104 <String "o">
		//   49   96:invokevirtual   #100 <Method JSONArray JSONObject.optJSONArray(String)>
		//   50   99:astore          9
			boolean flag = ((JSONObject) (obj)).optBoolean("c", false);
		//   51  101:aload_1         
		//   52  102:ldc1            #106 <String "c">
		//   53  104:iconst_0        
		//   54  105:invokevirtual   #110 <Method boolean JSONObject.optBoolean(String, boolean)>
		//   55  108:istore          6
			if(obj3 != null && obj1 != null && obj2 != null && ((JSONArray) (obj3)).length() == ((JSONArray) (obj1)).length() && ((JSONArray) (obj3)).length() == ((JSONArray) (obj2)).length())
		//*  56  110:aload           10
		//*  57  112:ifnull          562
		//*  58  115:aload           8
		//*  59  117:ifnull          562
		//*  60  120:aload           9
		//*  61  122:ifnull          562
		//*  62  125:aload           10
		//*  63  127:invokevirtual   #29  <Method int JSONArray.length()>
		//*  64  130:aload           8
		//*  65  132:invokevirtual   #29  <Method int JSONArray.length()>
		//*  66  135:icmpne          562
		//*  67  138:aload           10
		//*  68  140:invokevirtual   #29  <Method int JSONArray.length()>
		//*  69  143:aload           9
		//*  70  145:invokevirtual   #29  <Method int JSONArray.length()>
		//*  71  148:icmpne          562
			{
				if(((JSONArray) (obj3)).length() == 0)
		//*  72  151:aload           10
		//*  73  153:invokevirtual   #29  <Method int JSONArray.length()>
		//*  74  156:ifne            179
					return new ShapeData(new PointF(), false, Collections.emptyList());
		//   75  159:new             #9   <Class ShapeData>
		//   76  162:dup             
		//   77  163:new             #59  <Class PointF>
		//   78  166:dup             
		//   79  167:invokespecial   #111 <Method void PointF()>
		//   80  170:iconst_0        
		//   81  171:invokestatic    #117 <Method List Collections.emptyList()>
		//   82  174:aconst_null     
		//   83  175:invokespecial   #120 <Method void ShapeData(PointF, boolean, List, ShapeData$1)>
		//   84  178:areturn         
				int k = ((JSONArray) (obj3)).length();
		//   85  179:aload           10
		//   86  181:invokevirtual   #29  <Method int JSONArray.length()>
		//   87  184:istore          4
				obj = ((Object) (vertexAtIndex(0, ((JSONArray) (obj3)))));
		//   88  186:iconst_0        
		//   89  187:aload           10
		//   90  189:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//   91  192:astore_1        
				obj.x = ((PointF) (obj)).x * f;
		//   92  193:aload_1         
		//   93  194:aload_1         
		//   94  195:getfield        #126 <Field float PointF.x>
		//   95  198:fload_2         
		//   96  199:fmul            
		//   97  200:putfield        #126 <Field float PointF.x>
				obj.y = ((PointF) (obj)).y * f;
		//   98  203:aload_1         
		//   99  204:aload_1         
		//  100  205:getfield        #129 <Field float PointF.y>
		//  101  208:fload_2         
		//  102  209:fmul            
		//  103  210:putfield        #129 <Field float PointF.y>
				ArrayList arraylist = new ArrayList(k);
		//  104  213:new             #131 <Class ArrayList>
		//  105  216:dup             
		//  106  217:iload           4
		//  107  219:invokespecial   #134 <Method void ArrayList(int)>
		//  108  222:astore          7
				for(int i = 1; i < k; i++)
		//* 109  224:iconst_1        
		//* 110  225:istore_3        
		//* 111  226:iload_3         
		//* 112  227:iload           4
		//* 113  229:icmpge          389
				{
					PointF pointf = vertexAtIndex(i, ((JSONArray) (obj3)));
		//  114  232:iload_3         
		//  115  233:aload           10
		//  116  235:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  117  238:astore          11
					int l = i - 1;
		//  118  240:iload_3         
		//  119  241:iconst_1        
		//  120  242:isub            
		//  121  243:istore          5
					PointF pointf3 = vertexAtIndex(l, ((JSONArray) (obj3)));
		//  122  245:iload           5
		//  123  247:aload           10
		//  124  249:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  125  252:astore          13
					PointF pointf4 = vertexAtIndex(l, ((JSONArray) (obj2)));
		//  126  254:iload           5
		//  127  256:aload           9
		//  128  258:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  129  261:astore          14
					PointF pointf2 = vertexAtIndex(i, ((JSONArray) (obj1)));
		//  130  263:iload_3         
		//  131  264:aload           8
		//  132  266:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  133  269:astore          12
					pointf3 = MiscUtils.addPoints(pointf3, pointf4);
		//  134  271:aload           13
		//  135  273:aload           14
		//  136  275:invokestatic    #140 <Method PointF MiscUtils.addPoints(PointF, PointF)>
		//  137  278:astore          13
					pointf2 = MiscUtils.addPoints(pointf, pointf2);
		//  138  280:aload           11
		//  139  282:aload           12
		//  140  284:invokestatic    #140 <Method PointF MiscUtils.addPoints(PointF, PointF)>
		//  141  287:astore          12
					pointf3.x = pointf3.x * f;
		//  142  289:aload           13
		//  143  291:aload           13
		//  144  293:getfield        #126 <Field float PointF.x>
		//  145  296:fload_2         
		//  146  297:fmul            
		//  147  298:putfield        #126 <Field float PointF.x>
					pointf3.y = pointf3.y * f;
		//  148  301:aload           13
		//  149  303:aload           13
		//  150  305:getfield        #129 <Field float PointF.y>
		//  151  308:fload_2         
		//  152  309:fmul            
		//  153  310:putfield        #129 <Field float PointF.y>
					pointf2.x = pointf2.x * f;
		//  154  313:aload           12
		//  155  315:aload           12
		//  156  317:getfield        #126 <Field float PointF.x>
		//  157  320:fload_2         
		//  158  321:fmul            
		//  159  322:putfield        #126 <Field float PointF.x>
					pointf2.y = pointf2.y * f;
		//  160  325:aload           12
		//  161  327:aload           12
		//  162  329:getfield        #129 <Field float PointF.y>
		//  163  332:fload_2         
		//  164  333:fmul            
		//  165  334:putfield        #129 <Field float PointF.y>
					pointf.x = pointf.x * f;
		//  166  337:aload           11
		//  167  339:aload           11
		//  168  341:getfield        #126 <Field float PointF.x>
		//  169  344:fload_2         
		//  170  345:fmul            
		//  171  346:putfield        #126 <Field float PointF.x>
					pointf.y = pointf.y * f;
		//  172  349:aload           11
		//  173  351:aload           11
		//  174  353:getfield        #129 <Field float PointF.y>
		//  175  356:fload_2         
		//  176  357:fmul            
		//  177  358:putfield        #129 <Field float PointF.y>
					((List) (arraylist)).add(((Object) (new CubicCurveData(pointf3, pointf2, pointf))));
		//  178  361:aload           7
		//  179  363:new             #142 <Class CubicCurveData>
		//  180  366:dup             
		//  181  367:aload           13
		//  182  369:aload           12
		//  183  371:aload           11
		//  184  373:invokespecial   #145 <Method void CubicCurveData(PointF, PointF, PointF)>
		//  185  376:invokeinterface #151 <Method boolean List.add(Object)>
		//  186  381:pop             
				}

		//  187  382:iload_3         
		//  188  383:iconst_1        
		//  189  384:iadd            
		//  190  385:istore_3        
		//* 191  386:goto            226
				if(flag)
		//* 192  389:iload           6
		//* 193  391:ifeq            548
				{
					PointF pointf1 = vertexAtIndex(0, ((JSONArray) (obj3)));
		//  194  394:iconst_0        
		//  195  395:aload           10
		//  196  397:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  197  400:astore          11
					int j = k - 1;
		//  198  402:iload           4
		//  199  404:iconst_1        
		//  200  405:isub            
		//  201  406:istore_3        
					obj3 = ((Object) (vertexAtIndex(j, ((JSONArray) (obj3)))));
		//  202  407:iload_3         
		//  203  408:aload           10
		//  204  410:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  205  413:astore          10
					obj2 = ((Object) (vertexAtIndex(j, ((JSONArray) (obj2)))));
		//  206  415:iload_3         
		//  207  416:aload           9
		//  208  418:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  209  421:astore          9
					obj1 = ((Object) (vertexAtIndex(0, ((JSONArray) (obj1)))));
		//  210  423:iconst_0        
		//  211  424:aload           8
		//  212  426:invokestatic    #122 <Method PointF vertexAtIndex(int, JSONArray)>
		//  213  429:astore          8
					obj2 = ((Object) (MiscUtils.addPoints(((PointF) (obj3)), ((PointF) (obj2)))));
		//  214  431:aload           10
		//  215  433:aload           9
		//  216  435:invokestatic    #140 <Method PointF MiscUtils.addPoints(PointF, PointF)>
		//  217  438:astore          9
					obj1 = ((Object) (MiscUtils.addPoints(pointf1, ((PointF) (obj1)))));
		//  218  440:aload           11
		//  219  442:aload           8
		//  220  444:invokestatic    #140 <Method PointF MiscUtils.addPoints(PointF, PointF)>
		//  221  447:astore          8
					if(f != 1.0F)
		//* 222  449:fload_2         
		//* 223  450:fconst_1        
		//* 224  451:fcmpl           
		//* 225  452:ifeq            527
					{
						obj2.x = ((PointF) (obj2)).x * f;
		//  226  455:aload           9
		//  227  457:aload           9
		//  228  459:getfield        #126 <Field float PointF.x>
		//  229  462:fload_2         
		//  230  463:fmul            
		//  231  464:putfield        #126 <Field float PointF.x>
						obj2.y = ((PointF) (obj2)).y * f;
		//  232  467:aload           9
		//  233  469:aload           9
		//  234  471:getfield        #129 <Field float PointF.y>
		//  235  474:fload_2         
		//  236  475:fmul            
		//  237  476:putfield        #129 <Field float PointF.y>
						obj1.x = ((PointF) (obj1)).x * f;
		//  238  479:aload           8
		//  239  481:aload           8
		//  240  483:getfield        #126 <Field float PointF.x>
		//  241  486:fload_2         
		//  242  487:fmul            
		//  243  488:putfield        #126 <Field float PointF.x>
						obj1.y = ((PointF) (obj1)).y * f;
		//  244  491:aload           8
		//  245  493:aload           8
		//  246  495:getfield        #129 <Field float PointF.y>
		//  247  498:fload_2         
		//  248  499:fmul            
		//  249  500:putfield        #129 <Field float PointF.y>
						pointf1.x = pointf1.x * f;
		//  250  503:aload           11
		//  251  505:aload           11
		//  252  507:getfield        #126 <Field float PointF.x>
		//  253  510:fload_2         
		//  254  511:fmul            
		//  255  512:putfield        #126 <Field float PointF.x>
						pointf1.y = pointf1.y * f;
		//  256  515:aload           11
		//  257  517:aload           11
		//  258  519:getfield        #129 <Field float PointF.y>
		//  259  522:fload_2         
		//  260  523:fmul            
		//  261  524:putfield        #129 <Field float PointF.y>
					}
					((List) (arraylist)).add(((Object) (new CubicCurveData(((PointF) (obj2)), ((PointF) (obj1)), pointf1))));
		//  262  527:aload           7
		//  263  529:new             #142 <Class CubicCurveData>
		//  264  532:dup             
		//  265  533:aload           9
		//  266  535:aload           8
		//  267  537:aload           11
		//  268  539:invokespecial   #145 <Method void CubicCurveData(PointF, PointF, PointF)>
		//  269  542:invokeinterface #151 <Method boolean List.add(Object)>
		//  270  547:pop             
				}
				return new ShapeData(((PointF) (obj)), flag, ((List) (arraylist)));
		//  271  548:new             #9   <Class ShapeData>
		//  272  551:dup             
		//  273  552:aload_1         
		//  274  553:iload           6
		//  275  555:aload           7
		//  276  557:aconst_null     
		//  277  558:invokespecial   #120 <Method void ShapeData(PointF, boolean, List, ShapeData$1)>
		//  278  561:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//  279  562:new             #64  <Class StringBuilder>
		//  280  565:dup             
		//  281  566:invokespecial   #65  <Method void StringBuilder()>
		//  282  569:astore          7
				stringbuilder.append("Unable to process points array or tangents. ");
		//  283  571:aload           7
		//  284  573:ldc1            #153 <String "Unable to process points array or tangents. ">
		//  285  575:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//  286  578:pop             
				stringbuilder.append(obj);
		//  287  579:aload           7
		//  288  581:aload_1         
		//  289  582:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
		//  290  585:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//  291  586:new             #158 <Class IllegalStateException>
		//  292  589:dup             
		//  293  590:aload           7
		//  294  592:invokevirtual   #84  <Method String StringBuilder.toString()>
		//  295  595:invokespecial   #159 <Method void IllegalStateException(String)>
		//  296  598:athrow          
			}
		}

		public volatile Object valueFromObject(Object obj, float f)
		{
			return ((Object) (valueFromObject(obj, f)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:fload_2         
		//    3    3:invokevirtual   #162 <Method ShapeData valueFromObject(Object, float)>
		//    4    6:areturn         
		}

		static final Factory INSTANCE = new Factory();

		static 
		{
		//    0    0:new             #2   <Class ShapeData$Factory>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void ShapeData$Factory()>
		//    3    7:putstatic       #19  <Field ShapeData$Factory INSTANCE>
		//*   4   10:return          
		}

		private Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	ShapeData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		curves = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field List curves>
	//    7   15:return          
	}

	private ShapeData(PointF pointf, boolean flag, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		curves = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field List curves>
		initialPoint = pointf;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #29  <Field PointF initialPoint>
		closed = flag;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:putfield        #31  <Field boolean closed>
		curves.addAll(((java.util.Collection) (list)));
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field List curves>
	//   15   29:aload_3         
	//   16   30:invokeinterface #37  <Method boolean List.addAll(java.util.Collection)>
	//   17   35:pop             
	//   18   36:return          
	}


	private void setInitialPoint(float f, float f1)
	{
		if(initialPoint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field PointF initialPoint>
	//*   2    4:ifnonnull       18
			initialPoint = new PointF();
	//    3    7:aload_0         
	//    4    8:new             #46  <Class PointF>
	//    5   11:dup             
	//    6   12:invokespecial   #47  <Method void PointF()>
	//    7   15:putfield        #29  <Field PointF initialPoint>
		initialPoint.set(f, f1);
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field PointF initialPoint>
	//   10   22:fload_1         
	//   11   23:fload_2         
	//   12   24:invokevirtual   #50  <Method void PointF.set(float, float)>
	//   13   27:return          
	}

	List getCurves()
	{
		return curves;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List curves>
	//    2    4:areturn         
	}

	PointF getInitialPoint()
	{
		return initialPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PointF initialPoint>
	//    2    4:areturn         
	}

	void interpolateBetween(ShapeData shapedata, ShapeData shapedata1, float f)
	{
		if(initialPoint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field PointF initialPoint>
	//*   2    4:ifnonnull       18
			initialPoint = new PointF();
	//    3    7:aload_0         
	//    4    8:new             #46  <Class PointF>
	//    5   11:dup             
	//    6   12:invokespecial   #47  <Method void PointF()>
	//    7   15:putfield        #29  <Field PointF initialPoint>
		boolean flag;
		if(!shapedata.isClosed() && !shapedata1.isClosed())
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #68  <Method boolean isClosed()>
	//*  10   22:ifne            41
	//*  11   25:aload_2         
	//*  12   26:invokevirtual   #68  <Method boolean isClosed()>
	//*  13   29:ifeq            35
	//*  14   32:goto            41
			flag = false;
	//   15   35:iconst_0        
	//   16   36:istore          5
		else
	//*  17   38:goto            44
			flag = true;
	//   18   41:iconst_1        
	//   19   42:istore          5
		closed = flag;
	//   20   44:aload_0         
	//   21   45:iload           5
	//   22   47:putfield        #31  <Field boolean closed>
		if(!curves.isEmpty() && curves.size() != shapedata.getCurves().size() && curves.size() != shapedata1.getCurves().size())
	//*  23   50:aload_0         
	//*  24   51:getfield        #25  <Field List curves>
	//*  25   54:invokeinterface #71  <Method boolean List.isEmpty()>
	//*  26   59:ifne            198
	//*  27   62:aload_0         
	//*  28   63:getfield        #25  <Field List curves>
	//*  29   66:invokeinterface #75  <Method int List.size()>
	//*  30   71:aload_1         
	//*  31   72:invokevirtual   #77  <Method List getCurves()>
	//*  32   75:invokeinterface #75  <Method int List.size()>
	//*  33   80:icmpeq          198
	//*  34   83:aload_0         
	//*  35   84:getfield        #25  <Field List curves>
	//*  36   87:invokeinterface #75  <Method int List.size()>
	//*  37   92:aload_2         
	//*  38   93:invokevirtual   #77  <Method List getCurves()>
	//*  39   96:invokeinterface #75  <Method int List.size()>
	//*  40  101:icmpne          107
	//*  41  104:goto            198
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   42  107:new             #79  <Class StringBuilder>
	//   43  110:dup             
	//   44  111:invokespecial   #80  <Method void StringBuilder()>
	//   45  114:astore          6
			stringbuilder.append("Curves must have the same number of control points. This: ");
	//   46  116:aload           6
	//   47  118:ldc1            #82  <String "Curves must have the same number of control points. This: ">
	//   48  120:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   49  123:pop             
			stringbuilder.append(getCurves().size());
	//   50  124:aload           6
	//   51  126:aload_0         
	//   52  127:invokevirtual   #77  <Method List getCurves()>
	//   53  130:invokeinterface #75  <Method int List.size()>
	//   54  135:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   55  138:pop             
			stringbuilder.append("\tShape 1: ");
	//   56  139:aload           6
	//   57  141:ldc1            #91  <String "\tShape 1: ">
	//   58  143:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   59  146:pop             
			stringbuilder.append(shapedata.getCurves().size());
	//   60  147:aload           6
	//   61  149:aload_1         
	//   62  150:invokevirtual   #77  <Method List getCurves()>
	//   63  153:invokeinterface #75  <Method int List.size()>
	//   64  158:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   65  161:pop             
			stringbuilder.append("\tShape 2: ");
	//   66  162:aload           6
	//   67  164:ldc1            #93  <String "\tShape 2: ">
	//   68  166:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   69  169:pop             
			stringbuilder.append(shapedata1.getCurves().size());
	//   70  170:aload           6
	//   71  172:aload_2         
	//   72  173:invokevirtual   #77  <Method List getCurves()>
	//   73  176:invokeinterface #75  <Method int List.size()>
	//   74  181:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   75  184:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   76  185:new             #95  <Class IllegalStateException>
	//   77  188:dup             
	//   78  189:aload           6
	//   79  191:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   80  194:invokespecial   #102 <Method void IllegalStateException(String)>
	//   81  197:athrow          
		}
		if(curves.isEmpty())
	//*  82  198:aload_0         
	//*  83  199:getfield        #25  <Field List curves>
	//*  84  202:invokeinterface #71  <Method boolean List.isEmpty()>
	//*  85  207:ifeq            254
		{
			for(int i = shapedata.getCurves().size() - 1; i >= 0; i--)
	//*  86  210:aload_1         
	//*  87  211:invokevirtual   #77  <Method List getCurves()>
	//*  88  214:invokeinterface #75  <Method int List.size()>
	//*  89  219:iconst_1        
	//*  90  220:isub            
	//*  91  221:istore          4
	//*  92  223:iload           4
	//*  93  225:iflt            254
				curves.add(((Object) (new CubicCurveData())));
	//   94  228:aload_0         
	//   95  229:getfield        #25  <Field List curves>
	//   96  232:new             #104 <Class CubicCurveData>
	//   97  235:dup             
	//   98  236:invokespecial   #105 <Method void CubicCurveData()>
	//   99  239:invokeinterface #109 <Method boolean List.add(Object)>
	//  100  244:pop             

	//  101  245:iload           4
	//  102  247:iconst_1        
	//  103  248:isub            
	//  104  249:istore          4
		}
	//* 105  251:goto            223
		PointF pointf = shapedata.getInitialPoint();
	//  106  254:aload_1         
	//  107  255:invokevirtual   #111 <Method PointF getInitialPoint()>
	//  108  258:astore          6
		PointF pointf2 = shapedata1.getInitialPoint();
	//  109  260:aload_2         
	//  110  261:invokevirtual   #111 <Method PointF getInitialPoint()>
	//  111  264:astore          7
		setInitialPoint(MiscUtils.lerp(pointf.x, pointf2.x, f), MiscUtils.lerp(pointf.y, pointf2.y, f));
	//  112  266:aload_0         
	//  113  267:aload           6
	//  114  269:getfield        #115 <Field float PointF.x>
	//  115  272:aload           7
	//  116  274:getfield        #115 <Field float PointF.x>
	//  117  277:fload_3         
	//  118  278:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  119  281:aload           6
	//  120  283:getfield        #124 <Field float PointF.y>
	//  121  286:aload           7
	//  122  288:getfield        #124 <Field float PointF.y>
	//  123  291:fload_3         
	//  124  292:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  125  295:invokespecial   #126 <Method void setInitialPoint(float, float)>
		for(int j = curves.size() - 1; j >= 0; j--)
	//* 126  298:aload_0         
	//* 127  299:getfield        #25  <Field List curves>
	//* 128  302:invokeinterface #75  <Method int List.size()>
	//* 129  307:iconst_1        
	//* 130  308:isub            
	//* 131  309:istore          4
	//* 132  311:iload           4
	//* 133  313:iflt            534
		{
			Object obj1 = ((Object) ((CubicCurveData)shapedata.getCurves().get(j)));
	//  134  316:aload_1         
	//  135  317:invokevirtual   #77  <Method List getCurves()>
	//  136  320:iload           4
	//  137  322:invokeinterface #130 <Method Object List.get(int)>
	//  138  327:checkcast       #104 <Class CubicCurveData>
	//  139  330:astore          9
			Object obj = ((Object) ((CubicCurveData)shapedata1.getCurves().get(j)));
	//  140  332:aload_2         
	//  141  333:invokevirtual   #77  <Method List getCurves()>
	//  142  336:iload           4
	//  143  338:invokeinterface #130 <Method Object List.get(int)>
	//  144  343:checkcast       #104 <Class CubicCurveData>
	//  145  346:astore          8
			PointF pointf1 = ((CubicCurveData) (obj1)).getControlPoint1();
	//  146  348:aload           9
	//  147  350:invokevirtual   #133 <Method PointF CubicCurveData.getControlPoint1()>
	//  148  353:astore          6
			PointF pointf3 = ((CubicCurveData) (obj1)).getControlPoint2();
	//  149  355:aload           9
	//  150  357:invokevirtual   #136 <Method PointF CubicCurveData.getControlPoint2()>
	//  151  360:astore          7
			obj1 = ((Object) (((CubicCurveData) (obj1)).getVertex()));
	//  152  362:aload           9
	//  153  364:invokevirtual   #139 <Method PointF CubicCurveData.getVertex()>
	//  154  367:astore          9
			PointF pointf4 = ((CubicCurveData) (obj)).getControlPoint1();
	//  155  369:aload           8
	//  156  371:invokevirtual   #133 <Method PointF CubicCurveData.getControlPoint1()>
	//  157  374:astore          10
			PointF pointf5 = ((CubicCurveData) (obj)).getControlPoint2();
	//  158  376:aload           8
	//  159  378:invokevirtual   #136 <Method PointF CubicCurveData.getControlPoint2()>
	//  160  381:astore          11
			obj = ((Object) (((CubicCurveData) (obj)).getVertex()));
	//  161  383:aload           8
	//  162  385:invokevirtual   #139 <Method PointF CubicCurveData.getVertex()>
	//  163  388:astore          8
			((CubicCurveData)curves.get(j)).setControlPoint1(MiscUtils.lerp(pointf1.x, pointf4.x, f), MiscUtils.lerp(pointf1.y, pointf4.y, f));
	//  164  390:aload_0         
	//  165  391:getfield        #25  <Field List curves>
	//  166  394:iload           4
	//  167  396:invokeinterface #130 <Method Object List.get(int)>
	//  168  401:checkcast       #104 <Class CubicCurveData>
	//  169  404:aload           6
	//  170  406:getfield        #115 <Field float PointF.x>
	//  171  409:aload           10
	//  172  411:getfield        #115 <Field float PointF.x>
	//  173  414:fload_3         
	//  174  415:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  175  418:aload           6
	//  176  420:getfield        #124 <Field float PointF.y>
	//  177  423:aload           10
	//  178  425:getfield        #124 <Field float PointF.y>
	//  179  428:fload_3         
	//  180  429:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  181  432:invokevirtual   #142 <Method void CubicCurveData.setControlPoint1(float, float)>
			((CubicCurveData)curves.get(j)).setControlPoint2(MiscUtils.lerp(pointf3.x, pointf5.x, f), MiscUtils.lerp(pointf3.y, pointf5.y, f));
	//  182  435:aload_0         
	//  183  436:getfield        #25  <Field List curves>
	//  184  439:iload           4
	//  185  441:invokeinterface #130 <Method Object List.get(int)>
	//  186  446:checkcast       #104 <Class CubicCurveData>
	//  187  449:aload           7
	//  188  451:getfield        #115 <Field float PointF.x>
	//  189  454:aload           11
	//  190  456:getfield        #115 <Field float PointF.x>
	//  191  459:fload_3         
	//  192  460:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  193  463:aload           7
	//  194  465:getfield        #124 <Field float PointF.y>
	//  195  468:aload           11
	//  196  470:getfield        #124 <Field float PointF.y>
	//  197  473:fload_3         
	//  198  474:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  199  477:invokevirtual   #145 <Method void CubicCurveData.setControlPoint2(float, float)>
			((CubicCurveData)curves.get(j)).setVertex(MiscUtils.lerp(((PointF) (obj1)).x, ((PointF) (obj)).x, f), MiscUtils.lerp(((PointF) (obj1)).y, ((PointF) (obj)).y, f));
	//  200  480:aload_0         
	//  201  481:getfield        #25  <Field List curves>
	//  202  484:iload           4
	//  203  486:invokeinterface #130 <Method Object List.get(int)>
	//  204  491:checkcast       #104 <Class CubicCurveData>
	//  205  494:aload           9
	//  206  496:getfield        #115 <Field float PointF.x>
	//  207  499:aload           8
	//  208  501:getfield        #115 <Field float PointF.x>
	//  209  504:fload_3         
	//  210  505:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  211  508:aload           9
	//  212  510:getfield        #124 <Field float PointF.y>
	//  213  513:aload           8
	//  214  515:getfield        #124 <Field float PointF.y>
	//  215  518:fload_3         
	//  216  519:invokestatic    #121 <Method float MiscUtils.lerp(float, float, float)>
	//  217  522:invokevirtual   #148 <Method void CubicCurveData.setVertex(float, float)>
		}

	//  218  525:iload           4
	//  219  527:iconst_1        
	//  220  528:isub            
	//  221  529:istore          4
	//* 222  531:goto            311
	//  223  534:return          
	}

	boolean isClosed()
	{
		return closed;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean closed>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ShapeData{numCurves=");
	//    4    8:aload_1         
	//    5    9:ldc1            #151 <String "ShapeData{numCurves=">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(curves.size());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field List curves>
	//   11   20:invokeinterface #75  <Method int List.size()>
	//   12   25:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   13   28:pop             
		stringbuilder.append("closed=");
	//   14   29:aload_1         
	//   15   30:ldc1            #153 <String "closed=">
	//   16   32:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(closed);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #31  <Field boolean closed>
	//   21   41:invokevirtual   #156 <Method StringBuilder StringBuilder.append(boolean)>
	//   22   44:pop             
		stringbuilder.append('}');
	//   23   45:aload_1         
	//   24   46:bipush          125
	//   25   48:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   26   51:pop             
		return stringbuilder.toString();
	//   27   52:aload_1         
	//   28   53:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   29   56:areturn         
	}

	private boolean closed;
	private final List curves;
	private PointF initialPoint;
}
