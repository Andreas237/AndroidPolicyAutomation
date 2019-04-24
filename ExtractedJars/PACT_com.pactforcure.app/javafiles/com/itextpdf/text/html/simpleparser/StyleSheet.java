// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.html.HtmlUtilities;
import java.util.*;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			ChainedProperties

public class StyleSheet
{

	public StyleSheet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		tagMap = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:putfield        #18  <Field Map tagMap>
		classMap = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #15  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #16  <Method void HashMap()>
	//   11   23:putfield        #20  <Field Map classMap>
	//   12   26:return          
	}

	public static void resolveStyleAttribute(Map map, ChainedProperties chainedproperties)
	{
		Object obj = ((Object) ((String)map.get("style")));
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <String "style">
	//    2    3:invokeinterface #31  <Method Object Map.get(Object)>
	//    3    8:checkcast       #33  <Class String>
	//    4   11:astore          4
		if(obj != null)
	//*   5   13:aload           4
	//*   6   15:ifnonnull       19
	//*   7   18:return          
		{
			obj = ((Object) (HtmlUtilities.parseAttributes(((String) (obj)))));
	//    8   19:aload           4
	//    9   21:invokestatic    #39  <Method Properties HtmlUtilities.parseAttributes(String)>
	//   10   24:astore          4
			Iterator iterator = ((Properties) (obj)).keySet().iterator();
	//   11   26:aload           4
	//   12   28:invokevirtual   #45  <Method Set Properties.keySet()>
	//   13   31:invokeinterface #51  <Method Iterator Set.iterator()>
	//   14   36:astore          5
			while(iterator.hasNext()) 
	//*  15   38:aload           5
	//*  16   40:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//*  17   45:ifeq            18
			{
				Object obj1 = ((Object) ((String)iterator.next()));
	//   18   48:aload           5
	//   19   50:invokeinterface #61  <Method Object Iterator.next()>
	//   20   55:checkcast       #33  <Class String>
	//   21   58:astore          6
				if(((String) (obj1)).equals("font-family"))
	//*  22   60:aload           6
	//*  23   62:ldc1            #63  <String "font-family">
	//*  24   64:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  25   67:ifeq            89
					map.put("face", ((Object) (((Properties) (obj)).getProperty(((String) (obj1))))));
	//   26   70:aload_0         
	//   27   71:ldc1            #69  <String "face">
	//   28   73:aload           4
	//   29   75:aload           6
	//   30   77:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//   31   80:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   32   85:pop             
				else
	//*  33   86:goto            38
				if(((String) (obj1)).equals("font-size"))
	//*  34   89:aload           6
	//*  35   91:ldc1            #79  <String "font-size">
	//*  36   93:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  37   96:ifeq            166
				{
					float f2 = HtmlUtilities.parseLength(chainedproperties.getProperty("size"), 12F);
	//   38   99:aload_1         
	//   39  100:ldc1            #81  <String "size">
	//   40  102:invokevirtual   #84  <Method String ChainedProperties.getProperty(String)>
	//   41  105:ldc1            #85  <Float 12F>
	//   42  107:invokestatic    #89  <Method float HtmlUtilities.parseLength(String, float)>
	//   43  110:fstore_3        
					float f = f2;
	//   44  111:fload_3         
	//   45  112:fstore_2        
					if(f2 <= 0.0F)
	//*  46  113:fload_3         
	//*  47  114:fconst_0        
	//*  48  115:fcmpg           
	//*  49  116:ifgt            122
						f = 12F;
	//   50  119:ldc1            #85  <Float 12F>
	//   51  121:fstore_2        
					map.put("size", ((Object) ((new StringBuilder()).append(Float.toString(HtmlUtilities.parseLength(((Properties) (obj)).getProperty(((String) (obj1))), f))).append("pt").toString())));
	//   52  122:aload_0         
	//   53  123:ldc1            #81  <String "size">
	//   54  125:new             #91  <Class StringBuilder>
	//   55  128:dup             
	//   56  129:invokespecial   #92  <Method void StringBuilder()>
	//   57  132:aload           4
	//   58  134:aload           6
	//   59  136:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//   60  139:fload_2         
	//   61  140:invokestatic    #89  <Method float HtmlUtilities.parseLength(String, float)>
	//   62  143:invokestatic    #98  <Method String Float.toString(float)>
	//   63  146:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   64  149:ldc1            #104 <String "pt">
	//   65  151:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   66  154:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   67  157:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   68  162:pop             
				} else
	//*  69  163:goto            38
				if(((String) (obj1)).equals("font-style"))
	//*  70  166:aload           6
	//*  71  168:ldc1            #109 <String "font-style">
	//*  72  170:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  73  173:ifeq            224
				{
					obj1 = ((Object) (((Properties) (obj)).getProperty(((String) (obj1))).trim().toLowerCase()));
	//   74  176:aload           4
	//   75  178:aload           6
	//   76  180:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//   77  183:invokevirtual   #112 <Method String String.trim()>
	//   78  186:invokevirtual   #115 <Method String String.toLowerCase()>
	//   79  189:astore          6
					if(((String) (obj1)).equals("italic") || ((String) (obj1)).equals("oblique"))
	//*  80  191:aload           6
	//*  81  193:ldc1            #117 <String "italic">
	//*  82  195:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  83  198:ifne            211
	//*  84  201:aload           6
	//*  85  203:ldc1            #119 <String "oblique">
	//*  86  205:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  87  208:ifeq            38
						map.put("i", ((Object) (null)));
	//   88  211:aload_0         
	//   89  212:ldc1            #121 <String "i">
	//   90  214:aconst_null     
	//   91  215:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   92  220:pop             
				} else
	//*  93  221:goto            38
				if(((String) (obj1)).equals("font-weight"))
	//*  94  224:aload           6
	//*  95  226:ldc1            #123 <String "font-weight">
	//*  96  228:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  97  231:ifeq            302
				{
					obj1 = ((Object) (((Properties) (obj)).getProperty(((String) (obj1))).trim().toLowerCase()));
	//   98  234:aload           4
	//   99  236:aload           6
	//  100  238:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//  101  241:invokevirtual   #112 <Method String String.trim()>
	//  102  244:invokevirtual   #115 <Method String String.toLowerCase()>
	//  103  247:astore          6
					if(((String) (obj1)).equals("bold") || ((String) (obj1)).equals("700") || ((String) (obj1)).equals("800") || ((String) (obj1)).equals("900"))
	//* 104  249:aload           6
	//* 105  251:ldc1            #125 <String "bold">
	//* 106  253:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 107  256:ifne            289
	//* 108  259:aload           6
	//* 109  261:ldc1            #127 <String "700">
	//* 110  263:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 111  266:ifne            289
	//* 112  269:aload           6
	//* 113  271:ldc1            #129 <String "800">
	//* 114  273:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 115  276:ifne            289
	//* 116  279:aload           6
	//* 117  281:ldc1            #131 <String "900">
	//* 118  283:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 119  286:ifeq            38
						map.put("b", ((Object) (null)));
	//  120  289:aload_0         
	//  121  290:ldc1            #133 <String "b">
	//  122  292:aconst_null     
	//  123  293:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  124  298:pop             
				} else
	//* 125  299:goto            38
				if(((String) (obj1)).equals("text-decoration"))
	//* 126  302:aload           6
	//* 127  304:ldc1            #135 <String "text-decoration">
	//* 128  306:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 129  309:ifeq            346
				{
					if(((Properties) (obj)).getProperty(((String) (obj1))).trim().toLowerCase().equals("underline"))
	//* 130  312:aload           4
	//* 131  314:aload           6
	//* 132  316:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//* 133  319:invokevirtual   #112 <Method String String.trim()>
	//* 134  322:invokevirtual   #115 <Method String String.toLowerCase()>
	//* 135  325:ldc1            #137 <String "underline">
	//* 136  327:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 137  330:ifeq            38
						map.put("u", ((Object) (null)));
	//  138  333:aload_0         
	//  139  334:ldc1            #139 <String "u">
	//  140  336:aconst_null     
	//  141  337:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  142  342:pop             
				} else
	//* 143  343:goto            38
				if(((String) (obj1)).equals("color"))
	//* 144  346:aload           6
	//* 145  348:ldc1            #141 <String "color">
	//* 146  350:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 147  353:ifeq            448
				{
					obj1 = ((Object) (HtmlUtilities.decodeColor(((Properties) (obj)).getProperty(((String) (obj1))))));
	//  148  356:aload           4
	//  149  358:aload           6
	//  150  360:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//  151  363:invokestatic    #145 <Method BaseColor HtmlUtilities.decodeColor(String)>
	//  152  366:astore          6
					if(obj1 != null)
	//* 153  368:aload           6
	//* 154  370:ifnull          38
					{
						obj1 = ((Object) (Integer.toHexString(((BaseColor) (obj1)).getRGB())));
	//  155  373:aload           6
	//  156  375:invokevirtual   #151 <Method int BaseColor.getRGB()>
	//  157  378:invokestatic    #157 <Method String Integer.toHexString(int)>
	//  158  381:astore          6
						obj1 = ((Object) ((new StringBuilder()).append("000000").append(((String) (obj1))).toString()));
	//  159  383:new             #91  <Class StringBuilder>
	//  160  386:dup             
	//  161  387:invokespecial   #92  <Method void StringBuilder()>
	//  162  390:ldc1            #159 <String "000000">
	//  163  392:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  164  395:aload           6
	//  165  397:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  166  400:invokevirtual   #107 <Method String StringBuilder.toString()>
	//  167  403:astore          6
						map.put("color", ((Object) ((new StringBuilder()).append("#").append(((String) (obj1)).substring(((String) (obj1)).length() - 6)).toString())));
	//  168  405:aload_0         
	//  169  406:ldc1            #141 <String "color">
	//  170  408:new             #91  <Class StringBuilder>
	//  171  411:dup             
	//  172  412:invokespecial   #92  <Method void StringBuilder()>
	//  173  415:ldc1            #161 <String "#">
	//  174  417:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  175  420:aload           6
	//  176  422:aload           6
	//  177  424:invokevirtual   #164 <Method int String.length()>
	//  178  427:bipush          6
	//  179  429:isub            
	//  180  430:invokevirtual   #167 <Method String String.substring(int)>
	//  181  433:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  182  436:invokevirtual   #107 <Method String StringBuilder.toString()>
	//  183  439:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  184  444:pop             
					}
				} else
	//* 185  445:goto            38
				if(((String) (obj1)).equals("line-height"))
	//* 186  448:aload           6
	//* 187  450:ldc1            #169 <String "line-height">
	//* 188  452:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 189  455:ifeq            600
				{
					String s = ((Properties) (obj)).getProperty(((String) (obj1))).trim();
	//  190  458:aload           4
	//  191  460:aload           6
	//  192  462:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//  193  465:invokevirtual   #112 <Method String String.trim()>
	//  194  468:astore          7
					float f3 = HtmlUtilities.parseLength(chainedproperties.getProperty("size"), 12F);
	//  195  470:aload_1         
	//  196  471:ldc1            #81  <String "size">
	//  197  473:invokevirtual   #84  <Method String ChainedProperties.getProperty(String)>
	//  198  476:ldc1            #85  <Float 12F>
	//  199  478:invokestatic    #89  <Method float HtmlUtilities.parseLength(String, float)>
	//  200  481:fstore_3        
					float f1 = f3;
	//  201  482:fload_3         
	//  202  483:fstore_2        
					if(f3 <= 0.0F)
	//* 203  484:fload_3         
	//* 204  485:fconst_0        
	//* 205  486:fcmpg           
	//* 206  487:ifgt            493
						f1 = 12F;
	//  207  490:ldc1            #85  <Float 12F>
	//  208  492:fstore_2        
					f1 = HtmlUtilities.parseLength(((Properties) (obj)).getProperty(((String) (obj1))), f1);
	//  209  493:aload           4
	//  210  495:aload           6
	//  211  497:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//  212  500:fload_2         
	//  213  501:invokestatic    #89  <Method float HtmlUtilities.parseLength(String, float)>
	//  214  504:fstore_2        
					if(s.endsWith("%"))
	//* 215  505:aload           7
	//* 216  507:ldc1            #171 <String "%">
	//* 217  509:invokevirtual   #175 <Method boolean String.endsWith(String)>
	//* 218  512:ifeq            547
					{
						map.put("leading", ((Object) ((new StringBuilder()).append("0,").append(f1 / 100F).toString())));
	//  219  515:aload_0         
	//  220  516:ldc1            #177 <String "leading">
	//  221  518:new             #91  <Class StringBuilder>
	//  222  521:dup             
	//  223  522:invokespecial   #92  <Method void StringBuilder()>
	//  224  525:ldc1            #179 <String "0,">
	//  225  527:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  226  530:fload_2         
	//  227  531:ldc1            #180 <Float 100F>
	//  228  533:fdiv            
	//  229  534:invokevirtual   #183 <Method StringBuilder StringBuilder.append(float)>
	//  230  537:invokevirtual   #107 <Method String StringBuilder.toString()>
	//  231  540:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  232  545:pop             
						return;
	//  233  546:return          
					}
					if("normal".equalsIgnoreCase(s))
	//* 234  547:ldc1            #185 <String "normal">
	//* 235  549:aload           7
	//* 236  551:invokevirtual   #188 <Method boolean String.equalsIgnoreCase(String)>
	//* 237  554:ifeq            569
					{
						map.put("leading", "0,1.5");
	//  238  557:aload_0         
	//  239  558:ldc1            #177 <String "leading">
	//  240  560:ldc1            #190 <String "0,1.5">
	//  241  562:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  242  567:pop             
						return;
	//  243  568:return          
					}
					map.put("leading", ((Object) ((new StringBuilder()).append(f1).append(",0").toString())));
	//  244  569:aload_0         
	//  245  570:ldc1            #177 <String "leading">
	//  246  572:new             #91  <Class StringBuilder>
	//  247  575:dup             
	//  248  576:invokespecial   #92  <Method void StringBuilder()>
	//  249  579:fload_2         
	//  250  580:invokevirtual   #183 <Method StringBuilder StringBuilder.append(float)>
	//  251  583:ldc1            #192 <String ",0">
	//  252  585:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  253  588:invokevirtual   #107 <Method String StringBuilder.toString()>
	//  254  591:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  255  596:pop             
				} else
	//* 256  597:goto            38
				if(((String) (obj1)).equals("text-align"))
	//* 257  600:aload           6
	//* 258  602:ldc1            #194 <String "text-align">
	//* 259  604:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 260  607:ifeq            635
					map.put("align", ((Object) (((Properties) (obj)).getProperty(((String) (obj1))).trim().toLowerCase())));
	//  261  610:aload_0         
	//  262  611:ldc1            #196 <String "align">
	//  263  613:aload           4
	//  264  615:aload           6
	//  265  617:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//  266  620:invokevirtual   #112 <Method String String.trim()>
	//  267  623:invokevirtual   #115 <Method String String.toLowerCase()>
	//  268  626:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  269  631:pop             
				else
	//* 270  632:goto            38
				if(((String) (obj1)).equals("padding-left"))
	//* 271  635:aload           6
	//* 272  637:ldc1            #198 <String "padding-left">
	//* 273  639:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 274  642:ifeq            38
					map.put("indent", ((Object) (Float.toString(HtmlUtilities.parseLength(((Properties) (obj)).getProperty(((String) (obj1))).trim().toLowerCase())))));
	//  275  645:aload_0         
	//  276  646:ldc1            #200 <String "indent">
	//  277  648:aload           4
	//  278  650:aload           6
	//  279  652:invokevirtual   #73  <Method String Properties.getProperty(String)>
	//  280  655:invokevirtual   #112 <Method String String.trim()>
	//  281  658:invokevirtual   #115 <Method String String.toLowerCase()>
	//  282  661:invokestatic    #203 <Method float HtmlUtilities.parseLength(String)>
	//  283  664:invokestatic    #98  <Method String Float.toString(float)>
	//  284  667:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//  285  672:pop             
			}
		}
	//* 286  673:goto            38
	}

	public void applyStyle(String s, Map map)
	{
		s = ((String) ((Map)tagMap.get(((Object) (s.toLowerCase())))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map tagMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method String String.toLowerCase()>
	//    4    8:invokeinterface #31  <Method Object Map.get(Object)>
	//    5   13:checkcast       #27  <Class Map>
	//    6   16:astore_1        
		if(s != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          44
		{
			s = ((String) (new HashMap(((Map) (s)))));
	//    9   21:new             #15  <Class HashMap>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:invokespecial   #210 <Method void HashMap(Map)>
	//   13   29:astore_1        
			((Map) (s)).putAll(map);
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:invokeinterface #213 <Method void Map.putAll(Map)>
			map.putAll(((Map) (s)));
	//   17   37:aload_2         
	//   18   38:aload_1         
	//   19   39:invokeinterface #213 <Method void Map.putAll(Map)>
		}
		s = (String)map.get("class");
	//   20   44:aload_2         
	//   21   45:ldc1            #215 <String "class">
	//   22   47:invokeinterface #31  <Method Object Map.get(Object)>
	//   23   52:checkcast       #33  <Class String>
	//   24   55:astore_1        
		if(s != null)
	//*  25   56:aload_1         
	//*  26   57:ifnonnull       61
	//*  27   60:return          
	//*  28   61:aload_0         
	//*  29   62:getfield        #20  <Field Map classMap>
	//*  30   65:aload_1         
	//*  31   66:invokevirtual   #115 <Method String String.toLowerCase()>
	//*  32   69:invokeinterface #31  <Method Object Map.get(Object)>
	//*  33   74:checkcast       #27  <Class Map>
	//*  34   77:astore_1        
			if((s = ((String) ((Map)classMap.get(((Object) (s.toLowerCase())))))) != null)
	//*  35   78:aload_1         
	//*  36   79:ifnull          60
			{
				map.remove("class");
	//   37   82:aload_2         
	//   38   83:ldc1            #215 <String "class">
	//   39   85:invokeinterface #218 <Method Object Map.remove(Object)>
	//   40   90:pop             
				s = ((String) (new HashMap(((Map) (s)))));
	//   41   91:new             #15  <Class HashMap>
	//   42   94:dup             
	//   43   95:aload_1         
	//   44   96:invokespecial   #210 <Method void HashMap(Map)>
	//   45   99:astore_1        
				((Map) (s)).putAll(map);
	//   46  100:aload_1         
	//   47  101:aload_2         
	//   48  102:invokeinterface #213 <Method void Map.putAll(Map)>
				map.putAll(((Map) (s)));
	//   49  107:aload_2         
	//   50  108:aload_1         
	//   51  109:invokeinterface #213 <Method void Map.putAll(Map)>
				return;
	//   52  114:return          
			}
	}

	public void loadStyle(String s, String s1, String s2)
	{
		String s3 = s.toLowerCase();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #115 <Method String String.toLowerCase()>
	//    2    4:astore          5
		Map map = (Map)classMap.get(((Object) (s3)));
	//    3    6:aload_0         
	//    4    7:getfield        #20  <Field Map classMap>
	//    5   10:aload           5
	//    6   12:invokeinterface #31  <Method Object Map.get(Object)>
	//    7   17:checkcast       #27  <Class Map>
	//    8   20:astore          4
		s = ((String) (map));
	//    9   22:aload           4
	//   10   24:astore_1        
		if(map == null)
	//*  11   25:aload           4
	//*  12   27:ifnonnull       51
		{
			s = ((String) (new HashMap()));
	//   13   30:new             #15  <Class HashMap>
	//   14   33:dup             
	//   15   34:invokespecial   #16  <Method void HashMap()>
	//   16   37:astore_1        
			classMap.put(((Object) (s3)), ((Object) (s)));
	//   17   38:aload_0         
	//   18   39:getfield        #20  <Field Map classMap>
	//   19   42:aload           5
	//   20   44:aload_1         
	//   21   45:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   22   50:pop             
		}
		((Map) (s)).put(((Object) (s1)), ((Object) (s2)));
	//   23   51:aload_1         
	//   24   52:aload_2         
	//   25   53:aload_3         
	//   26   54:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   27   59:pop             
	//   28   60:return          
	}

	public void loadStyle(String s, HashMap hashmap)
	{
		classMap.put(((Object) (s.toLowerCase())), ((Object) (hashmap)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map classMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method String String.toLowerCase()>
	//    4    8:aload_2         
	//    5    9:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void loadTagStyle(String s, String s1, String s2)
	{
		String s3 = s.toLowerCase();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #115 <Method String String.toLowerCase()>
	//    2    4:astore          5
		Map map = (Map)tagMap.get(((Object) (s3)));
	//    3    6:aload_0         
	//    4    7:getfield        #18  <Field Map tagMap>
	//    5   10:aload           5
	//    6   12:invokeinterface #31  <Method Object Map.get(Object)>
	//    7   17:checkcast       #27  <Class Map>
	//    8   20:astore          4
		s = ((String) (map));
	//    9   22:aload           4
	//   10   24:astore_1        
		if(map == null)
	//*  11   25:aload           4
	//*  12   27:ifnonnull       51
		{
			s = ((String) (new HashMap()));
	//   13   30:new             #15  <Class HashMap>
	//   14   33:dup             
	//   15   34:invokespecial   #16  <Method void HashMap()>
	//   16   37:astore_1        
			tagMap.put(((Object) (s3)), ((Object) (s)));
	//   17   38:aload_0         
	//   18   39:getfield        #18  <Field Map tagMap>
	//   19   42:aload           5
	//   20   44:aload_1         
	//   21   45:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   22   50:pop             
		}
		((Map) (s)).put(((Object) (s1)), ((Object) (s2)));
	//   23   51:aload_1         
	//   24   52:aload_2         
	//   25   53:aload_3         
	//   26   54:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//   27   59:pop             
	//   28   60:return          
	}

	public void loadTagStyle(String s, Map map)
	{
		tagMap.put(((Object) (s.toLowerCase())), ((Object) (map)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map tagMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method String String.toLowerCase()>
	//    4    8:aload_2         
	//    5    9:invokeinterface #77  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	protected Map classMap;
	protected Map tagMap;
}
