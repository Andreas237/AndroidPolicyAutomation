// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssUtils

public class FontSizeTranslator
{

	public FontSizeTranslator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static FontSizeTranslator getInstance()
	{
		com/itextpdf/tool/xml/css/FontSizeTranslator;
	//    0    0:ldc1            #2   <Class FontSizeTranslator>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		FontSizeTranslator fontsizetranslator;
		if(myself == null)
	//*   2    3:getstatic       #28  <Field FontSizeTranslator myself>
	//*   3    6:ifnonnull       19
			myself = new FontSizeTranslator();
	//    4    9:new             #2   <Class FontSizeTranslator>
	//    5   12:dup             
	//    6   13:invokespecial   #29  <Method void FontSizeTranslator()>
	//    7   16:putstatic       #28  <Field FontSizeTranslator myself>
		fontsizetranslator = myself;
	//    8   19:getstatic       #28  <Field FontSizeTranslator myself>
	//    9   22:astore_0        
		com/itextpdf/tool/xml/css/FontSizeTranslator;
	//   10   23:ldc1            #2   <Class FontSizeTranslator>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return fontsizetranslator;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class FontSizeTranslator>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	public float getFontSize(Tag tag)
	{
		tag = ((Tag) ((String)tag.getCSS().get("font-size")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method Map Tag.getCSS()>
	//    2    4:ldc1            #39  <String "font-size">
	//    3    6:invokeinterface #45  <Method Object Map.get(Object)>
	//    4   11:checkcast       #47  <Class String>
	//    5   14:astore_1        
		if(tag != null)
	//*   6   15:aload_1         
	//*   7   16:ifnull          31
			return Float.parseFloat(((String) (tag)).replace("pt", ""));
	//    8   19:aload_1         
	//    9   20:ldc1            #49  <String "pt">
	//   10   22:ldc1            #51  <String "">
	//   11   24:invokevirtual   #55  <Method String String.replace(CharSequence, CharSequence)>
	//   12   27:invokestatic    #61  <Method float Float.parseFloat(String)>
	//   13   30:freturn         
		else
			return -1F;
	//   14   31:ldc1            #62  <Float -1F>
	//   15   33:freturn         
	}

	public float translateFontSize(Tag tag)
	{
		float f;
		float f2;
		f2 = -1F;
	//    0    0:ldc1            #62  <Float -1F>
	//    1    2:fstore_3        
		f = f2;
	//    2    3:fload_3         
	//    3    4:fstore_2        
		if(tag.getCSS().get("font-size") == null) goto _L2; else goto _L1
	//    4    5:aload_1         
	//    5    6:invokevirtual   #37  <Method Map Tag.getCSS()>
	//    6    9:ldc1            #39  <String "font-size">
	//    7   11:invokeinterface #45  <Method Object Map.get(Object)>
	//    8   16:ifnull          48
_L1:
		String s = (String)tag.getCSS().get("font-size");
	//    9   19:aload_1         
	//   10   20:invokevirtual   #37  <Method Map Tag.getCSS()>
	//   11   23:ldc1            #39  <String "font-size">
	//   12   25:invokeinterface #45  <Method Object Map.get(Object)>
	//   13   30:checkcast       #47  <Class String>
	//   14   33:astore          5
		if(!s.equalsIgnoreCase("xx-small")) goto _L4; else goto _L3
	//   15   35:aload           5
	//   16   37:ldc1            #65  <String "xx-small">
	//   17   39:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//   18   42:ifeq            50
_L3:
		f = 6.75F;
	//   19   45:ldc1            #70  <Float 6.75F>
	//   20   47:fstore_2        
_L2:
		return f;
	//   21   48:fload_2         
	//   22   49:freturn         
_L4:
		if(s.equalsIgnoreCase("x-small"))
	//*  23   50:aload           5
	//*  24   52:ldc1            #72  <String "x-small">
	//*  25   54:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//*  26   57:ifeq            63
			return 7.5F;
	//   27   60:ldc1            #73  <Float 7.5F>
	//   28   62:freturn         
		if(s.equalsIgnoreCase("small"))
	//*  29   63:aload           5
	//*  30   65:ldc1            #75  <String "small">
	//*  31   67:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//*  32   70:ifeq            76
			return 9.75F;
	//   33   73:ldc1            #76  <Float 9.75F>
	//   34   75:freturn         
		if(s.equalsIgnoreCase("medium"))
	//*  35   76:aload           5
	//*  36   78:ldc1            #78  <String "medium">
	//*  37   80:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//*  38   83:ifeq            89
			return 12F;
	//   39   86:ldc1            #7   <Float 12F>
	//   40   88:freturn         
		if(s.equalsIgnoreCase("large"))
	//*  41   89:aload           5
	//*  42   91:ldc1            #80  <String "large">
	//*  43   93:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//*  44   96:ifeq            102
			return 13.5F;
	//   45   99:ldc1            #81  <Float 13.5F>
	//   46  101:freturn         
		if(s.equalsIgnoreCase("x-large"))
	//*  47  102:aload           5
	//*  48  104:ldc1            #83  <String "x-large">
	//*  49  106:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//*  50  109:ifeq            115
			return 18F;
	//   51  112:ldc1            #84  <Float 18F>
	//   52  114:freturn         
		if(s.equalsIgnoreCase("xx-large"))
	//*  53  115:aload           5
	//*  54  117:ldc1            #86  <String "xx-large">
	//*  55  119:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//*  56  122:ifeq            128
			return 24F;
	//   57  125:ldc1            #87  <Float 24F>
	//   58  127:freturn         
		if(!s.equalsIgnoreCase("smaller"))
			break; /* Loop/switch isn't completed */
	//   59  128:aload           5
	//   60  130:ldc1            #89  <String "smaller">
	//   61  132:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//   62  135:ifeq            280
		if(tag.getParent() != null)
	//*  63  138:aload_1         
	//*  64  139:invokevirtual   #93  <Method Tag Tag.getParent()>
	//*  65  142:ifnull          277
		{
			float f4 = getFontSize(tag.getParent());
	//   66  145:aload_0         
	//   67  146:aload_1         
	//   68  147:invokevirtual   #93  <Method Tag Tag.getParent()>
	//   69  150:invokevirtual   #95  <Method float getFontSize(Tag)>
	//   70  153:fstore          4
			if(f4 == -1F)
	//*  71  155:fload           4
	//*  72  157:ldc1            #62  <Float -1F>
	//*  73  159:fcmpl           
	//*  74  160:ifne            166
				return 9.75F;
	//   75  163:ldc1            #76  <Float 9.75F>
	//   76  165:freturn         
			if(f4 <= 6.75F)
	//*  77  166:fload           4
	//*  78  168:ldc1            #70  <Float 6.75F>
	//*  79  170:fcmpg           
	//*  80  171:ifgt            179
				return f4 - 1.0F;
	//   81  174:fload           4
	//   82  176:fconst_1        
	//   83  177:fsub            
	//   84  178:freturn         
			if(f4 == 7.5F)
	//*  85  179:fload           4
	//*  86  181:ldc1            #73  <Float 7.5F>
	//*  87  183:fcmpl           
	//*  88  184:ifne            190
				return 6.75F;
	//   89  187:ldc1            #70  <Float 6.75F>
	//   90  189:freturn         
			if(f4 == 9.75F)
	//*  91  190:fload           4
	//*  92  192:ldc1            #76  <Float 9.75F>
	//*  93  194:fcmpl           
	//*  94  195:ifne            201
				return 7.5F;
	//   95  198:ldc1            #73  <Float 7.5F>
	//   96  200:freturn         
			if(f4 == 12F)
	//*  97  201:fload           4
	//*  98  203:ldc1            #7   <Float 12F>
	//*  99  205:fcmpl           
	//* 100  206:ifne            212
				return 9.75F;
	//  101  209:ldc1            #76  <Float 9.75F>
	//  102  211:freturn         
			if(f4 == 13.5F)
	//* 103  212:fload           4
	//* 104  214:ldc1            #81  <Float 13.5F>
	//* 105  216:fcmpl           
	//* 106  217:ifne            223
				return 12F;
	//  107  220:ldc1            #7   <Float 12F>
	//  108  222:freturn         
			if(f4 == 18F)
	//* 109  223:fload           4
	//* 110  225:ldc1            #84  <Float 18F>
	//* 111  227:fcmpl           
	//* 112  228:ifne            234
				return 13.5F;
	//  113  231:ldc1            #81  <Float 13.5F>
	//  114  233:freturn         
			if(f4 == 24F)
	//* 115  234:fload           4
	//* 116  236:ldc1            #87  <Float 24F>
	//* 117  238:fcmpl           
	//* 118  239:ifne            245
				return 18F;
	//  119  242:ldc1            #84  <Float 18F>
	//  120  244:freturn         
			if(f4 < 24F)
	//* 121  245:fload           4
	//* 122  247:ldc1            #87  <Float 24F>
	//* 123  249:fcmpg           
	//* 124  250:ifge            259
				return f4 * 0.85F;
	//  125  253:fload           4
	//  126  255:ldc1            #96  <Float 0.85F>
	//  127  257:fmul            
	//  128  258:freturn         
			f = f2;
	//  129  259:fload_3         
	//  130  260:fstore_2        
			if(f4 >= 24F)
	//* 131  261:fload           4
	//* 132  263:ldc1            #87  <Float 24F>
	//* 133  265:fcmpl           
	//* 134  266:iflt            48
				return (2.0F * f4) / 3F;
	//  135  269:fconst_2        
	//  136  270:fload           4
	//  137  272:fmul            
	//  138  273:ldc1            #97  <Float 3F>
	//  139  275:fdiv            
	//  140  276:freturn         
		} else
		{
			return 9.75F;
	//  141  277:ldc1            #76  <Float 9.75F>
	//  142  279:freturn         
		}
		if(true) goto _L2; else goto _L5
_L5:
		if(s.equalsIgnoreCase("larger"))
	//* 143  280:aload           5
	//* 144  282:ldc1            #99  <String "larger">
	//* 145  284:invokevirtual   #69  <Method boolean String.equalsIgnoreCase(String)>
	//* 146  287:ifeq            384
			if(tag.getParent() != null)
	//* 147  290:aload_1         
	//* 148  291:invokevirtual   #93  <Method Tag Tag.getParent()>
	//* 149  294:ifnull          381
			{
				f = getFontSize(tag.getParent());
	//  150  297:aload_0         
	//  151  298:aload_1         
	//  152  299:invokevirtual   #93  <Method Tag Tag.getParent()>
	//  153  302:invokevirtual   #95  <Method float getFontSize(Tag)>
	//  154  305:fstore_2        
				if(f == -1F)
	//* 155  306:fload_2         
	//* 156  307:ldc1            #62  <Float -1F>
	//* 157  309:fcmpl           
	//* 158  310:ifne            316
					return 13.5F;
	//  159  313:ldc1            #81  <Float 13.5F>
	//  160  315:freturn         
				if(f == 6.75F)
	//* 161  316:fload_2         
	//* 162  317:ldc1            #70  <Float 6.75F>
	//* 163  319:fcmpl           
	//* 164  320:ifne            326
					return 7.5F;
	//  165  323:ldc1            #73  <Float 7.5F>
	//  166  325:freturn         
				if(f == 7.5F)
	//* 167  326:fload_2         
	//* 168  327:ldc1            #73  <Float 7.5F>
	//* 169  329:fcmpl           
	//* 170  330:ifne            336
					return 9.75F;
	//  171  333:ldc1            #76  <Float 9.75F>
	//  172  335:freturn         
				if(f == 9.75F)
	//* 173  336:fload_2         
	//* 174  337:ldc1            #76  <Float 9.75F>
	//* 175  339:fcmpl           
	//* 176  340:ifne            346
					return 12F;
	//  177  343:ldc1            #7   <Float 12F>
	//  178  345:freturn         
				if(f == 12F)
	//* 179  346:fload_2         
	//* 180  347:ldc1            #7   <Float 12F>
	//* 181  349:fcmpl           
	//* 182  350:ifne            356
					return 13.5F;
	//  183  353:ldc1            #81  <Float 13.5F>
	//  184  355:freturn         
				if(f == 13.5F)
	//* 185  356:fload_2         
	//* 186  357:ldc1            #81  <Float 13.5F>
	//* 187  359:fcmpl           
	//* 188  360:ifne            366
					return 18F;
	//  189  363:ldc1            #84  <Float 18F>
	//  190  365:freturn         
				if(f == 18F)
	//* 191  366:fload_2         
	//* 192  367:ldc1            #84  <Float 18F>
	//* 193  369:fcmpl           
	//* 194  370:ifne            376
					return 24F;
	//  195  373:ldc1            #87  <Float 24F>
	//  196  375:freturn         
				else
					return f * 1.5F;
	//  197  376:fload_2         
	//  198  377:ldc1            #100 <Float 1.5F>
	//  199  379:fmul            
	//  200  380:freturn         
			} else
			{
				return 13.5F;
	//  201  381:ldc1            #81  <Float 13.5F>
	//  202  383:freturn         
			}
		if(utils.isMetricValue(s) || utils.isNumericValue(s))
	//* 203  384:getstatic       #21  <Field CssUtils utils>
	//* 204  387:aload           5
	//* 205  389:invokevirtual   #103 <Method boolean CssUtils.isMetricValue(String)>
	//* 206  392:ifne            406
	//* 207  395:getstatic       #21  <Field CssUtils utils>
	//* 208  398:aload           5
	//* 209  400:invokevirtual   #106 <Method boolean CssUtils.isNumericValue(String)>
	//* 210  403:ifeq            415
			return utils.parsePxInCmMmPcToPt(s);
	//  211  406:getstatic       #21  <Field CssUtils utils>
	//  212  409:aload           5
	//  213  411:invokevirtual   #109 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  214  414:freturn         
		f = f2;
	//  215  415:fload_3         
	//  216  416:fstore_2        
		if(utils.isRelativeValue(s))
	//* 217  417:getstatic       #21  <Field CssUtils utils>
	//* 218  420:aload           5
	//* 219  422:invokevirtual   #112 <Method boolean CssUtils.isRelativeValue(String)>
	//* 220  425:ifeq            48
		{
			float f1 = -1F;
	//  221  428:ldc1            #62  <Float -1F>
	//  222  430:fstore_2        
			if(tag.getParent() != null)
	//* 223  431:aload_1         
	//* 224  432:invokevirtual   #93  <Method Tag Tag.getParent()>
	//* 225  435:ifnull          447
				f1 = getFontSize(tag.getParent());
	//  226  438:aload_0         
	//  227  439:aload_1         
	//  228  440:invokevirtual   #93  <Method Tag Tag.getParent()>
	//  229  443:invokevirtual   #95  <Method float getFontSize(Tag)>
	//  230  446:fstore_2        
			float f3 = f1;
	//  231  447:fload_2         
	//  232  448:fstore_3        
			if(f1 == -1F)
	//* 233  449:fload_2         
	//* 234  450:ldc1            #62  <Float -1F>
	//* 235  452:fcmpl           
	//* 236  453:ifne            459
				f3 = 12F;
	//  237  456:ldc1            #7   <Float 12F>
	//  238  458:fstore_3        
			return utils.parseRelativeValue(s, f3);
	//  239  459:getstatic       #21  <Field CssUtils utils>
	//  240  462:aload           5
	//  241  464:fload_3         
	//  242  465:invokevirtual   #116 <Method float CssUtils.parseRelativeValue(String, float)>
	//  243  468:freturn         
		}
		if(true) goto _L2; else goto _L6
_L6:
	}

	public static final float DEFAULT_FONT_SIZE = 12F;
	private static FontSizeTranslator myself;
	private static CssUtils utils = CssUtils.getInstance();

	static 
	{
	//    0    0:invokestatic    #19  <Method CssUtils CssUtils.getInstance()>
	//    1    3:putstatic       #21  <Field CssUtils utils>
	//*   2    6:return          
	}
}
