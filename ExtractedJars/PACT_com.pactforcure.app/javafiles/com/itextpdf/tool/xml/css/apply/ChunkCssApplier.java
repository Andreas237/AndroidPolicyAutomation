// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.*;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.css.FontSizeTranslator;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			MarginMemory, PageSizeContainable

public class ChunkCssApplier
	implements CssApplier
{

	public ChunkCssApplier()
	{
		this(((FontProvider) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #43  <Method void ChunkCssApplier(FontProvider)>
	//    3    5:return          
	}

	public ChunkCssApplier(FontProvider fontprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		utils = CssUtils.getInstance();
	//    2    4:aload_0         
	//    3    5:invokestatic    #51  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #53  <Field CssUtils utils>
		if(fontprovider != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          21
		{
			fontProvider = fontprovider;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #55  <Field FontProvider fontProvider>
			return;
	//   10   20:return          
		} else
		{
			fontProvider = ((FontProvider) (new FontFactoryImp()));
	//   11   21:aload_0         
	//   12   22:new             #57  <Class FontFactoryImp>
	//   13   25:dup             
	//   14   26:invokespecial   #58  <Method void FontFactoryImp()>
	//   15   29:putfield        #55  <Field FontProvider fontProvider>
			return;
	//   16   32:return          
		}
	}

	public Chunk apply(Chunk chunk, Tag tag)
	{
		return apply(chunk, tag, ((MarginMemory) (null)), ((PageSizeContainable) (null)), ((HtmlPipelineContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #63  <Method Chunk apply(Chunk, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}

	public Chunk apply(Chunk chunk, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		float f2;
		marginmemory = ((MarginMemory) (applyFontStyles(tag)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #67  <Method Font applyFontStyles(Tag)>
	//    3    5:astore_3        
		f2 = ((Font) (marginmemory)).getSize();
	//    4    6:aload_3         
	//    5    7:invokevirtual   #73  <Method float Font.getSize()>
	//    6   10:fstore          7
		pagesizecontainable = ((PageSizeContainable) (tag.getCSS()));
	//    7   12:aload_2         
	//    8   13:invokevirtual   #79  <Method Map Tag.getCSS()>
	//    9   16:astore          4
		tag = ((Tag) (((Map) (pagesizecontainable)).entrySet().iterator()));
	//   10   18:aload           4
	//   11   20:invokeinterface #85  <Method Set Map.entrySet()>
	//   12   25:invokeinterface #91  <Method Iterator Set.iterator()>
	//   13   30:astore_2        
_L7:
		Object obj;
		if(!((Iterator) (tag)).hasNext())
			break; /* Loop/switch isn't completed */
	//   14   31:aload_2         
	//   15   32:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   16   37:ifeq            241
		obj = ((Object) ((java.util.Map.Entry)((Iterator) (tag)).next()));
	//   17   40:aload_2         
	//   18   41:invokeinterface #101 <Method Object Iterator.next()>
	//   19   46:checkcast       #103 <Class java.util.Map$Entry>
	//   20   49:astore          10
		htmlpipelinecontext = ((HtmlPipelineContext) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   21   51:aload           10
	//   22   53:invokeinterface #106 <Method Object java.util.Map$Entry.getKey()>
	//   23   58:checkcast       #18  <Class String>
	//   24   61:astore          5
		obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   25   63:aload           10
	//   26   65:invokeinterface #109 <Method Object java.util.Map$Entry.getValue()>
	//   27   70:checkcast       #18  <Class String>
	//   28   73:astore          10
		if("font-style".equalsIgnoreCase(((String) (htmlpipelinecontext))))
	//*  29   75:ldc1            #111 <String "font-style">
	//*  30   77:aload           5
	//*  31   79:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  32   82:ifeq            106
		{
			if(((String) (obj)).equalsIgnoreCase("oblique"))
	//*  33   85:aload           10
	//*  34   87:ldc1            #117 <String "oblique">
	//*  35   89:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  36   92:ifeq            31
				chunk.setSkew(0.0F, 12F);
	//   37   95:aload_1         
	//   38   96:fconst_0        
	//   39   97:ldc1            #118 <Float 12F>
	//   40   99:invokevirtual   #124 <Method Chunk Chunk.setSkew(float, float)>
	//   41  102:pop             
			continue; /* Loop/switch isn't completed */
	//   42  103:goto            31
		}
		if(!"letter-spacing".equalsIgnoreCase(((String) (htmlpipelinecontext)))) goto _L2; else goto _L1
	//   43  106:ldc1            #126 <String "letter-spacing">
	//   44  108:aload           5
	//   45  110:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//   46  113:ifeq            196
_L1:
		float f;
		htmlpipelinecontext = ((HtmlPipelineContext) ((String)((Map) (pagesizecontainable)).get("letter-spacing")));
	//   47  116:aload           4
	//   48  118:ldc1            #126 <String "letter-spacing">
	//   49  120:invokeinterface #130 <Method Object Map.get(Object)>
	//   50  125:checkcast       #18  <Class String>
	//   51  128:astore          5
		f = 0.0F;
	//   52  130:fconst_0        
	//   53  131:fstore          6
		if(!utils.isRelativeValue(((String) (obj)))) goto _L4; else goto _L3
	//   54  133:aload_0         
	//   55  134:getfield        #53  <Field CssUtils utils>
	//   56  137:aload           10
	//   57  139:invokevirtual   #133 <Method boolean CssUtils.isRelativeValue(String)>
	//   58  142:ifeq            170
_L3:
		f = utils.parseRelativeValue(((String) (htmlpipelinecontext)), ((Font) (marginmemory)).getSize());
	//   59  145:aload_0         
	//   60  146:getfield        #53  <Field CssUtils utils>
	//   61  149:aload           5
	//   62  151:aload_3         
	//   63  152:invokevirtual   #73  <Method float Font.getSize()>
	//   64  155:invokevirtual   #137 <Method float CssUtils.parseRelativeValue(String, float)>
	//   65  158:fstore          6
_L5:
		chunk.setCharacterSpacing(f);
	//   66  160:aload_1         
	//   67  161:fload           6
	//   68  163:invokevirtual   #141 <Method Chunk Chunk.setCharacterSpacing(float)>
	//   69  166:pop             
		continue; /* Loop/switch isn't completed */
	//   70  167:goto            31
_L4:
		if(utils.isMetricValue(((String) (obj))))
	//*  71  170:aload_0         
	//*  72  171:getfield        #53  <Field CssUtils utils>
	//*  73  174:aload           10
	//*  74  176:invokevirtual   #144 <Method boolean CssUtils.isMetricValue(String)>
	//*  75  179:ifeq            160
			f = utils.parsePxInCmMmPcToPt(((String) (htmlpipelinecontext)));
	//   76  182:aload_0         
	//   77  183:getfield        #53  <Field CssUtils utils>
	//   78  186:aload           5
	//   79  188:invokevirtual   #148 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//   80  191:fstore          6
		if(true) goto _L5; else goto _L2
	//   81  193:goto            160
_L2:
		if(((Map) (pagesizecontainable)).get("xfa-font-horizontal-scale") != null)
	//*  82  196:aload           4
	//*  83  198:ldc1            #150 <String "xfa-font-horizontal-scale">
	//*  84  200:invokeinterface #130 <Method Object Map.get(Object)>
	//*  85  205:ifnull          31
			chunk.setHorizontalScaling(Float.parseFloat(((String)((Map) (pagesizecontainable)).get("xfa-font-horizontal-scale")).replace("%", "")) / 100F);
	//   86  208:aload_1         
	//   87  209:aload           4
	//   88  211:ldc1            #150 <String "xfa-font-horizontal-scale">
	//   89  213:invokeinterface #130 <Method Object Map.get(Object)>
	//   90  218:checkcast       #18  <Class String>
	//   91  221:ldc1            #152 <String "%">
	//   92  223:ldc1            #154 <String "">
	//   93  225:invokevirtual   #158 <Method String String.replace(CharSequence, CharSequence)>
	//   94  228:invokestatic    #163 <Method float Float.parseFloat(String)>
	//   95  231:ldc1            #164 <Float 100F>
	//   96  233:fdiv            
	//   97  234:invokevirtual   #167 <Method Chunk Chunk.setHorizontalScaling(float)>
	//   98  237:pop             
		if(true) goto _L7; else goto _L6
	//   99  238:goto            31
_L6:
		float f1;
		if(((Map) (pagesizecontainable)).get("vertical-align") != null)
	//* 100  241:aload           4
	//* 101  243:ldc1            #169 <String "vertical-align">
	//* 102  245:invokeinterface #130 <Method Object Map.get(Object)>
	//* 103  250:ifnull          308
		{
			tag = ((Tag) ((String)((Map) (pagesizecontainable)).get("vertical-align")));
	//  104  253:aload           4
	//  105  255:ldc1            #169 <String "vertical-align">
	//  106  257:invokeinterface #130 <Method Object Map.get(Object)>
	//  107  262:checkcast       #18  <Class String>
	//  108  265:astore_2        
			int i;
			int j;
			if(((String) (tag)).equalsIgnoreCase("super") || ((String) (tag)).equalsIgnoreCase("top") || ((String) (tag)).equalsIgnoreCase("text-top"))
	//* 109  266:aload_2         
	//* 110  267:ldc1            #171 <String "super">
	//* 111  269:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 112  272:ifne            293
	//* 113  275:aload_2         
	//* 114  276:ldc1            #173 <String "top">
	//* 115  278:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 116  281:ifne            293
	//* 117  284:aload_2         
	//* 118  285:ldc1            #175 <String "text-top">
	//* 119  287:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 120  290:ifeq            485
				chunk.setTextRise((float)((double)(f2 / 2.0F) + 0.5D));
	//  121  293:aload_1         
	//  122  294:fload           7
	//  123  296:fconst_2        
	//  124  297:fdiv            
	//  125  298:f2d             
	//  126  299:ldc2w           #176 <Double 0.5D>
	//  127  302:dadd            
	//  128  303:d2f             
	//  129  304:invokevirtual   #180 <Method Chunk Chunk.setTextRise(float)>
	//  130  307:pop             
			else
	//* 131  308:aload           4
	//* 132  310:ldc1            #182 <String "xfa-font-vertical-scale">
	//* 133  312:invokeinterface #130 <Method Object Map.get(Object)>
	//* 134  317:checkcast       #18  <Class String>
	//* 135  320:astore_2        
	//* 136  321:fload           7
	//* 137  323:fstore          6
	//* 138  325:aload_2         
	//* 139  326:ifnull          380
	//* 140  329:fload           7
	//* 141  331:fstore          6
	//* 142  333:aload_2         
	//* 143  334:ldc1            #152 <String "%">
	//* 144  336:invokevirtual   #186 <Method boolean String.contains(CharSequence)>
	//* 145  339:ifeq            380
	//* 146  342:fload           7
	//* 147  344:aload_2         
	//* 148  345:ldc1            #152 <String "%">
	//* 149  347:ldc1            #154 <String "">
	//* 150  349:invokevirtual   #158 <Method String String.replace(CharSequence, CharSequence)>
	//* 151  352:invokestatic    #163 <Method float Float.parseFloat(String)>
	//* 152  355:ldc1            #164 <Float 100F>
	//* 153  357:fdiv            
	//* 154  358:fmul            
	//* 155  359:fstore          6
	//* 156  361:aload_1         
	//* 157  362:ldc1            #164 <Float 100F>
	//* 158  364:aload_2         
	//* 159  365:ldc1            #152 <String "%">
	//* 160  367:ldc1            #154 <String "">
	//* 161  369:invokevirtual   #158 <Method String String.replace(CharSequence, CharSequence)>
	//* 162  372:invokestatic    #163 <Method float Float.parseFloat(String)>
	//* 163  375:fdiv            
	//* 164  376:invokevirtual   #167 <Method Chunk Chunk.setHorizontalScaling(float)>
	//* 165  379:pop             
	//* 166  380:aload           4
	//* 167  382:ldc1            #188 <String "text-decoration">
	//* 168  384:invokeinterface #130 <Method Object Map.get(Object)>
	//* 169  389:ifnull          541
	//* 170  392:aload           4
	//* 171  394:ldc1            #188 <String "text-decoration">
	//* 172  396:invokeinterface #130 <Method Object Map.get(Object)>
	//* 173  401:checkcast       #18  <Class String>
	//* 174  404:ldc1            #190 <String "\\s+">
	//* 175  406:invokevirtual   #194 <Method String[] String.split(String)>
	//* 176  409:astore_2        
	//* 177  410:aload_2         
	//* 178  411:arraylength     
	//* 179  412:istore          9
	//* 180  414:iconst_0        
	//* 181  415:istore          8
	//* 182  417:iload           8
	//* 183  419:iload           9
	//* 184  421:icmpge          541
	//* 185  424:aload_2         
	//* 186  425:iload           8
	//* 187  427:aaload          
	//* 188  428:astore          5
	//* 189  430:ldc1            #196 <String "underline">
	//* 190  432:aload           5
	//* 191  434:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 192  437:ifeq            453
	//* 193  440:aload_1         
	//* 194  441:aconst_null     
	//* 195  442:ldc1            #197 <Float 0.75F>
	//* 196  444:fconst_0        
	//* 197  445:fconst_0        
	//* 198  446:ldc1            #198 <Float -0.125F>
	//* 199  448:iconst_0        
	//* 200  449:invokevirtual   #202 <Method Chunk Chunk.setUnderline(com.itextpdf.text.BaseColor, float, float, float, float, int)>
	//* 201  452:pop             
	//* 202  453:ldc1            #204 <String "line-through">
	//* 203  455:aload           5
	//* 204  457:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 205  460:ifeq            476
	//* 206  463:aload_1         
	//* 207  464:aconst_null     
	//* 208  465:ldc1            #197 <Float 0.75F>
	//* 209  467:fconst_0        
	//* 210  468:fconst_0        
	//* 211  469:ldc1            #205 <Float 0.25F>
	//* 212  471:iconst_0        
	//* 213  472:invokevirtual   #202 <Method Chunk Chunk.setUnderline(com.itextpdf.text.BaseColor, float, float, float, float, int)>
	//* 214  475:pop             
	//* 215  476:iload           8
	//* 216  478:iconst_1        
	//* 217  479:iadd            
	//* 218  480:istore          8
	//* 219  482:goto            417
			if(((String) (tag)).equalsIgnoreCase("sub") || ((String) (tag)).equalsIgnoreCase("bottom") || ((String) (tag)).equalsIgnoreCase("text-bottom"))
	//* 220  485:aload_2         
	//* 221  486:ldc1            #207 <String "sub">
	//* 222  488:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 223  491:ifne            512
	//* 224  494:aload_2         
	//* 225  495:ldc1            #209 <String "bottom">
	//* 226  497:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 227  500:ifne            512
	//* 228  503:aload_2         
	//* 229  504:ldc1            #211 <String "text-bottom">
	//* 230  506:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//* 231  509:ifeq            525
				chunk.setTextRise(-f2 / 2.0F);
	//  232  512:aload_1         
	//  233  513:fload           7
	//  234  515:fneg            
	//  235  516:fconst_2        
	//  236  517:fdiv            
	//  237  518:invokevirtual   #180 <Method Chunk Chunk.setTextRise(float)>
	//  238  521:pop             
			else
	//* 239  522:goto            308
				chunk.setTextRise(utils.parsePxInCmMmPcToPt(((String) (tag))));
	//  240  525:aload_1         
	//  241  526:aload_0         
	//  242  527:getfield        #53  <Field CssUtils utils>
	//  243  530:aload_2         
	//  244  531:invokevirtual   #148 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  245  534:invokevirtual   #180 <Method Chunk Chunk.setTextRise(float)>
	//  246  537:pop             
		}
		tag = ((Tag) ((String)((Map) (pagesizecontainable)).get("xfa-font-vertical-scale")));
		f1 = f2;
		if(tag != null)
		{
			f1 = f2;
			if(((String) (tag)).contains("%"))
			{
				f1 = f2 * (Float.parseFloat(((String) (tag)).replace("%", "")) / 100F);
				chunk.setHorizontalScaling(100F / Float.parseFloat(((String) (tag)).replace("%", "")));
			}
		}
		if(((Map) (pagesizecontainable)).get("text-decoration") != null)
		{
			tag = ((Tag) (((String)((Map) (pagesizecontainable)).get("text-decoration")).split("\\s+")));
			j = tag.length;
			for(i = 0; i < j; i++)
			{
				htmlpipelinecontext = ((HtmlPipelineContext) (tag[i]));
				if("underline".equalsIgnoreCase(((String) (htmlpipelinecontext))))
					chunk.setUnderline(((com.itextpdf.text.BaseColor) (null)), 0.75F, 0.0F, 0.0F, -0.125F, 0);
				if("line-through".equalsIgnoreCase(((String) (htmlpipelinecontext))))
					chunk.setUnderline(((com.itextpdf.text.BaseColor) (null)), 0.75F, 0.0F, 0.0F, 0.25F, 0);
			}

		}
	//* 247  538:goto            308
		if(((Map) (pagesizecontainable)).get("background-color") != null)
	//* 248  541:aload           4
	//* 249  543:ldc1            #213 <String "background-color">
	//* 250  545:invokeinterface #130 <Method Object Map.get(Object)>
	//* 251  550:ifnull          573
			chunk.setBackground(HtmlUtilities.decodeColor((String)((Map) (pagesizecontainable)).get("background-color")));
	//  252  553:aload_1         
	//  253  554:aload           4
	//  254  556:ldc1            #213 <String "background-color">
	//  255  558:invokeinterface #130 <Method Object Map.get(Object)>
	//  256  563:checkcast       #18  <Class String>
	//  257  566:invokestatic    #219 <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//  258  569:invokevirtual   #223 <Method Chunk Chunk.setBackground(com.itextpdf.text.BaseColor)>
	//  259  572:pop             
		((Font) (marginmemory)).setSize(f1);
	//  260  573:aload_3         
	//  261  574:fload           6
	//  262  576:invokevirtual   #227 <Method void Font.setSize(float)>
		chunk.setFont(((Font) (marginmemory)));
	//  263  579:aload_1         
	//  264  580:aload_3         
	//  265  581:invokevirtual   #231 <Method void Chunk.setFont(Font)>
		marginmemory = null;
	//  266  584:aconst_null     
	//  267  585:astore_3        
		tag = ((Tag) (marginmemory));
	//  268  586:aload_3         
	//  269  587:astore_2        
		if(((Map) (pagesizecontainable)).get("line-height") == null) goto _L9; else goto _L8
	//  270  588:aload           4
	//  271  590:ldc1            #233 <String "line-height">
	//  272  592:invokeinterface #130 <Method Object Map.get(Object)>
	//  273  597:ifnull          643
_L8:
		pagesizecontainable = ((PageSizeContainable) ((String)((Map) (pagesizecontainable)).get("line-height")));
	//  274  600:aload           4
	//  275  602:ldc1            #233 <String "line-height">
	//  276  604:invokeinterface #130 <Method Object Map.get(Object)>
	//  277  609:checkcast       #18  <Class String>
	//  278  612:astore          4
		if(!utils.isNumericValue(((String) (pagesizecontainable)))) goto _L11; else goto _L10
	//  279  614:aload_0         
	//  280  615:getfield        #53  <Field CssUtils utils>
	//  281  618:aload           4
	//  282  620:invokevirtual   #236 <Method boolean CssUtils.isNumericValue(String)>
	//  283  623:ifeq            658
_L10:
		tag = ((Tag) (Float.valueOf(Float.parseFloat(((String) (pagesizecontainable))) * chunk.getFont().getSize())));
	//  284  626:aload           4
	//  285  628:invokestatic    #163 <Method float Float.parseFloat(String)>
	//  286  631:aload_1         
	//  287  632:invokevirtual   #240 <Method Font Chunk.getFont()>
	//  288  635:invokevirtual   #73  <Method float Font.getSize()>
	//  289  638:fmul            
	//  290  639:invokestatic    #244 <Method Float Float.valueOf(float)>
	//  291  642:astore_2        
_L9:
		if(tag != null)
	//* 292  643:aload_2         
	//* 293  644:ifnull          656
			chunk.setLineHeight(((Float) (tag)).floatValue());
	//  294  647:aload_1         
	//  295  648:aload_2         
	//  296  649:invokevirtual   #247 <Method float Float.floatValue()>
	//  297  652:invokevirtual   #250 <Method Chunk Chunk.setLineHeight(float)>
	//  298  655:pop             
		return chunk;
	//  299  656:aload_1         
	//  300  657:areturn         
_L11:
		if(utils.isRelativeValue(((String) (pagesizecontainable))))
	//* 301  658:aload_0         
	//* 302  659:getfield        #53  <Field CssUtils utils>
	//* 303  662:aload           4
	//* 304  664:invokevirtual   #133 <Method boolean CssUtils.isRelativeValue(String)>
	//* 305  667:ifeq            693
		{
			tag = ((Tag) (Float.valueOf(utils.parseRelativeValue(((String) (pagesizecontainable)), chunk.getFont().getSize()))));
	//  306  670:aload_0         
	//  307  671:getfield        #53  <Field CssUtils utils>
	//  308  674:aload           4
	//  309  676:aload_1         
	//  310  677:invokevirtual   #240 <Method Font Chunk.getFont()>
	//  311  680:invokevirtual   #73  <Method float Font.getSize()>
	//  312  683:invokevirtual   #137 <Method float CssUtils.parseRelativeValue(String, float)>
	//  313  686:invokestatic    #244 <Method Float Float.valueOf(float)>
	//  314  689:astore_2        
		} else
	//* 315  690:goto            643
		{
			tag = ((Tag) (marginmemory));
	//  316  693:aload_3         
	//  317  694:astore_2        
			if(utils.isMetricValue(((String) (pagesizecontainable))))
	//* 318  695:aload_0         
	//* 319  696:getfield        #53  <Field CssUtils utils>
	//* 320  699:aload           4
	//* 321  701:invokevirtual   #144 <Method boolean CssUtils.isMetricValue(String)>
	//* 322  704:ifeq            643
				tag = ((Tag) (Float.valueOf(utils.parsePxInCmMmPcToPt(((String) (pagesizecontainable))))));
	//  323  707:aload_0         
	//  324  708:getfield        #53  <Field CssUtils utils>
	//  325  711:aload           4
	//  326  713:invokevirtual   #148 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  327  716:invokestatic    #244 <Method Float Float.valueOf(float)>
	//  328  719:astore_2        
		}
		if(true) goto _L9; else goto _L12
	//  329  720:goto            643
_L12:
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((Chunk)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #120 <Class Chunk>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #63  <Method Chunk apply(Chunk, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public Font applyFontStyles(Tag tag)
	{
		Tag tag1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		float f1 = FontSizeTranslator.getInstance().getFontSize(tag);
	//    2    3:invokestatic    #256 <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//    3    6:aload_1         
	//    4    7:invokevirtual   #260 <Method float FontSizeTranslator.getFontSize(Tag)>
	//    5   10:fstore_3        
		float f = f1;
	//    6   11:fload_3         
	//    7   12:fstore_2        
		if(f1 == -1F)
	//*   8   13:fload_3         
	//*   9   14:ldc2            #261 <Float -1F>
	//*  10   17:fcmpl           
	//*  11   18:ifne            24
			f = 12F;
	//   12   21:ldc1            #118 <Float 12F>
	//   13   23:fstore_2        
		byte byte0 = -1;
	//   14   24:iconst_m1       
	//   15   25:istore          4
		com.itextpdf.text.BaseColor basecolor = null;
	//   16   27:aconst_null     
	//   17   28:astore          8
		Iterator iterator = tag.getCSS().entrySet().iterator();
	//   18   30:aload_1         
	//   19   31:invokevirtual   #79  <Method Map Tag.getCSS()>
	//   20   34:invokeinterface #85  <Method Set Map.entrySet()>
	//   21   39:invokeinterface #91  <Method Iterator Set.iterator()>
	//   22   44:astore          9
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   46:aload           9
	//   24   48:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            224
			tag = ((Tag) ((java.util.Map.Entry)iterator.next()));
	//   26   56:aload           9
	//   27   58:invokeinterface #101 <Method Object Iterator.next()>
	//   28   63:checkcast       #103 <Class java.util.Map$Entry>
	//   29   66:astore_1        
			String s = (String)((java.util.Map.Entry) (tag)).getKey();
	//   30   67:aload_1         
	//   31   68:invokeinterface #106 <Method Object java.util.Map$Entry.getKey()>
	//   32   73:checkcast       #18  <Class String>
	//   33   76:astore          10
			tag = ((Tag) ((String)((java.util.Map.Entry) (tag)).getValue()));
	//   34   78:aload_1         
	//   35   79:invokeinterface #109 <Method Object java.util.Map$Entry.getValue()>
	//   36   84:checkcast       #18  <Class String>
	//   37   87:astore_1        
			if("font-weight".equalsIgnoreCase(s))
	//*  38   88:ldc2            #263 <String "font-weight">
	//*  39   91:aload           10
	//*  40   93:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  41   96:ifeq            149
			{
				if(isBoldValue(((String) (tag))))
	//*  42   99:aload_0         
	//*  43  100:aload_1         
	//*  44  101:invokevirtual   #266 <Method boolean isBoldValue(String)>
	//*  45  104:ifeq            125
				{
					if(byte0 == 2)
	//*  46  107:iload           4
	//*  47  109:iconst_2        
	//*  48  110:icmpne          119
						byte0 = 3;
	//   49  113:iconst_3        
	//   50  114:istore          4
					else
	//*  51  116:goto            46
						byte0 = 1;
	//   52  119:iconst_1        
	//   53  120:istore          4
				} else
	//*  54  122:goto            46
				if(byte0 == 3)
	//*  55  125:iload           4
	//*  56  127:iconst_3        
	//*  57  128:icmpne          137
					byte0 = 2;
	//   58  131:iconst_2        
	//   59  132:istore          4
				else
	//*  60  134:goto            46
				if(byte0 == 1)
	//*  61  137:iload           4
	//*  62  139:iconst_1        
	//*  63  140:icmpne          46
					byte0 = 0;
	//   64  143:iconst_0        
	//   65  144:istore          4
			} else
	//*  66  146:goto            46
			if("font-style".equalsIgnoreCase(s))
	//*  67  149:ldc1            #111 <String "font-style">
	//*  68  151:aload           10
	//*  69  153:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  70  156:ifeq            187
			{
				if(((String) (tag)).equalsIgnoreCase("italic"))
	//*  71  159:aload_1         
	//*  72  160:ldc2            #268 <String "italic">
	//*  73  163:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  74  166:ifeq            46
					if(byte0 == 1)
	//*  75  169:iload           4
	//*  76  171:iconst_1        
	//*  77  172:icmpne          181
						byte0 = 3;
	//   78  175:iconst_3        
	//   79  176:istore          4
					else
	//*  80  178:goto            46
						byte0 = 2;
	//   81  181:iconst_2        
	//   82  182:istore          4
			} else
	//*  83  184:goto            46
			if("font-family".equalsIgnoreCase(s))
	//*  84  187:ldc2            #270 <String "font-family">
	//*  85  190:aload           10
	//*  86  192:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  87  195:ifeq            204
				tag1 = tag;
	//   88  198:aload_1         
	//   89  199:astore          7
			else
	//*  90  201:goto            46
			if("color".equalsIgnoreCase(s))
	//*  91  204:ldc2            #272 <String "color">
	//*  92  207:aload           10
	//*  93  209:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  94  212:ifeq            46
				basecolor = HtmlUtilities.decodeColor(((String) (tag)));
	//   95  215:aload_1         
	//   96  216:invokestatic    #219 <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//   97  219:astore          8
		} while(true);
	//   98  221:goto            46
		tag = tag1;
	//   99  224:aload           7
	//  100  226:astore_1        
		if(tag1 != null)
	//* 101  227:aload           7
	//* 102  229:ifnull          410
			if(((String) (tag1)).contains(","))
	//* 103  232:aload           7
	//* 104  234:ldc2            #274 <String ",">
	//* 105  237:invokevirtual   #186 <Method boolean String.contains(CharSequence)>
	//* 106  240:ifeq            435
			{
				String as[] = ((String) (tag1)).split(",");
	//  107  243:aload           7
	//  108  245:ldc2            #274 <String ",">
	//  109  248:invokevirtual   #194 <Method String[] String.split(String)>
	//  110  251:astore          11
				tag = null;
	//  111  253:aconst_null     
	//  112  254:astore_1        
				int j = as.length;
	//  113  255:aload           11
	//  114  257:arraylength     
	//  115  258:istore          6
				for(int i = 0; i < j;)
	//* 116  260:iconst_0        
	//* 117  261:istore          5
	//* 118  263:iload           5
	//* 119  265:iload           6
	//* 120  267:icmpge          380
				{
					Object obj = ((Object) (as[i]));
	//  121  270:aload           11
	//  122  272:iload           5
	//  123  274:aaload          
	//  124  275:astore          9
					Object obj1 = ((Object) (utils.trimAndRemoveQuoutes(((String) (obj)))));
	//  125  277:aload_0         
	//  126  278:getfield        #53  <Field CssUtils utils>
	//  127  281:aload           9
	//  128  283:invokevirtual   #278 <Method String CssUtils.trimAndRemoveQuoutes(String)>
	//  129  286:astore          10
					obj = ((Object) (tag));
	//  130  288:aload_1         
	//  131  289:astore          9
					if(fontProvider.isRegistered(((String) (obj1))))
	//* 132  291:aload_0         
	//* 133  292:getfield        #55  <Field FontProvider fontProvider>
	//* 134  295:aload           10
	//* 135  297:invokeinterface #283 <Method boolean FontProvider.isRegistered(String)>
	//* 136  302:ifeq            368
					{
						obj1 = ((Object) (fontProvider.getFont(((String) (obj1)), "Cp1252", true, f, ((int) (byte0)), basecolor)));
	//  137  305:aload_0         
	//  138  306:getfield        #55  <Field FontProvider fontProvider>
	//  139  309:aload           10
	//  140  311:ldc2            #285 <String "Cp1252">
	//  141  314:iconst_1        
	//  142  315:fload_2         
	//  143  316:iload           4
	//  144  318:aload           8
	//  145  320:invokeinterface #288 <Method Font FontProvider.getFont(String, String, boolean, float, int, com.itextpdf.text.BaseColor)>
	//  146  325:astore          10
						if(obj1 != null && (byte0 == 0 || byte0 == -1 || (((Font) (obj1)).getStyle() & byte0) == 0))
	//* 147  327:aload           10
	//* 148  329:ifnull          357
	//* 149  332:iload           4
	//* 150  334:ifeq            354
	//* 151  337:iload           4
	//* 152  339:iconst_m1       
	//* 153  340:icmpeq          354
	//* 154  343:aload           10
	//* 155  345:invokevirtual   #292 <Method int Font.getStyle()>
	//* 156  348:iload           4
	//* 157  350:iand            
	//* 158  351:ifne            357
							return ((Font) (obj1));
	//  159  354:aload           10
	//  160  356:areturn         
						obj = ((Object) (tag));
	//  161  357:aload_1         
	//  162  358:astore          9
						if(tag == null)
	//* 163  360:aload_1         
	//* 164  361:ifnonnull       368
							obj = obj1;
	//  165  364:aload           10
	//  166  366:astore          9
					}
					i++;
	//  167  368:iload           5
	//  168  370:iconst_1        
	//  169  371:iadd            
	//  170  372:istore          5
					tag = ((Tag) (obj));
	//  171  374:aload           9
	//  172  376:astore_1        
				}

	//* 173  377:goto            263
				if(tag != null)
	//* 174  380:aload_1         
	//* 175  381:ifnull          386
					return ((Font) (tag));
	//  176  384:aload_1         
	//  177  385:areturn         
				if(as.length > 0)
	//* 178  386:aload           11
	//* 179  388:arraylength     
	//* 180  389:ifle            430
					tag = ((Tag) (utils.trimAndRemoveQuoutes(((String) (tag1)).split(",")[0])));
	//  181  392:aload_0         
	//  182  393:getfield        #53  <Field CssUtils utils>
	//  183  396:aload           7
	//  184  398:ldc2            #274 <String ",">
	//  185  401:invokevirtual   #194 <Method String[] String.split(String)>
	//  186  404:iconst_0        
	//  187  405:aaload          
	//  188  406:invokevirtual   #278 <Method String CssUtils.trimAndRemoveQuoutes(String)>
	//  189  409:astore_1        
				else
	//* 190  410:aload_0         
	//* 191  411:getfield        #55  <Field FontProvider fontProvider>
	//* 192  414:aload_1         
	//* 193  415:ldc2            #285 <String "Cp1252">
	//* 194  418:iconst_1        
	//* 195  419:fload_2         
	//* 196  420:iload           4
	//* 197  422:aload           8
	//* 198  424:invokeinterface #288 <Method Font FontProvider.getFont(String, String, boolean, float, int, com.itextpdf.text.BaseColor)>
	//* 199  429:areturn         
					tag = null;
	//  200  430:aconst_null     
	//  201  431:astore_1        
			} else
	//* 202  432:goto            410
			{
				tag = ((Tag) (utils.trimAndRemoveQuoutes(((String) (tag1)))));
	//  203  435:aload_0         
	//  204  436:getfield        #53  <Field CssUtils utils>
	//  205  439:aload           7
	//  206  441:invokevirtual   #278 <Method String CssUtils.trimAndRemoveQuoutes(String)>
	//  207  444:astore_1        
			}
		return fontProvider.getFont(((String) (tag)), "Cp1252", true, f, ((int) (byte0)), basecolor);
	//* 208  445:goto            410
	}

	public void copyChunkStyles(Chunk chunk, Chunk chunk1)
	{
		chunk1.setFont(chunk.getFont());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #240 <Method Font Chunk.getFont()>
	//    3    5:invokevirtual   #231 <Method void Chunk.setFont(Font)>
		chunk1.setAttributes(chunk.getAttributes());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #298 <Method java.util.HashMap Chunk.getAttributes()>
	//    7   13:invokevirtual   #302 <Method void Chunk.setAttributes(java.util.HashMap)>
		chunk1.setCharacterSpacing(chunk.getCharacterSpacing());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #305 <Method float Chunk.getCharacterSpacing()>
	//   11   21:invokevirtual   #141 <Method Chunk Chunk.setCharacterSpacing(float)>
	//   12   24:pop             
		chunk1.setHorizontalScaling(chunk.getHorizontalScaling());
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #308 <Method float Chunk.getHorizontalScaling()>
	//   16   30:invokevirtual   #167 <Method Chunk Chunk.setHorizontalScaling(float)>
	//   17   33:pop             
		chunk1.setHorizontalScaling(chunk.getHorizontalScaling());
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #308 <Method float Chunk.getHorizontalScaling()>
	//   21   39:invokevirtual   #167 <Method Chunk Chunk.setHorizontalScaling(float)>
	//   22   42:pop             
	//   23   43:return          
	}

	public FontProvider getFontProvider()
	{
		return fontProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field FontProvider fontProvider>
	//    2    4:areturn         
	}

	public float getWidestWord(Chunk chunk)
	{
		String as[] = chunk.getContent().split("\\s");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #316 <Method String Chunk.getContent()>
	//    2    4:ldc2            #318 <String "\\s">
	//    3    7:invokevirtual   #194 <Method String[] String.split(String)>
	//    4   10:astore          5
		float f = 0.0F;
	//    5   12:fconst_0        
	//    6   13:fstore_2        
		for(int i = 0; i < as.length;)
	//*   7   14:iconst_0        
	//*   8   15:istore          4
	//*   9   17:iload           4
	//*  10   19:aload           5
	//*  11   21:arraylength     
	//*  12   22:icmpge          75
		{
			Chunk chunk1 = new Chunk(as[i]);
	//   13   25:new             #120 <Class Chunk>
	//   14   28:dup             
	//   15   29:aload           5
	//   16   31:iload           4
	//   17   33:aaload          
	//   18   34:invokespecial   #321 <Method void Chunk(String)>
	//   19   37:astore          6
			copyChunkStyles(chunk, chunk1);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload           6
	//   23   43:invokevirtual   #323 <Method void copyChunkStyles(Chunk, Chunk)>
			float f1 = f;
	//   24   46:fload_2         
	//   25   47:fstore_3        
			if(chunk1.getWidthPoint() > f)
	//*  26   48:aload           6
	//*  27   50:invokevirtual   #326 <Method float Chunk.getWidthPoint()>
	//*  28   53:fload_2         
	//*  29   54:fcmpl           
	//*  30   55:ifle            64
				f1 = chunk1.getWidthPoint();
	//   31   58:aload           6
	//   32   60:invokevirtual   #326 <Method float Chunk.getWidthPoint()>
	//   33   63:fstore_3        
			i++;
	//   34   64:iload           4
	//   35   66:iconst_1        
	//   36   67:iadd            
	//   37   68:istore          4
			f = f1;
	//   38   70:fload_3         
	//   39   71:fstore_2        
		}

	//*  40   72:goto            17
		return f;
	//   41   75:fload_2         
	//   42   76:freturn         
	}

	protected boolean isBoldValue(String s)
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			s = s.trim();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #329 <Method String String.trim()>
	//    4    6:astore_1        
			if(!"bold".contains(((CharSequence) (s))))
	//*   5    7:ldc1            #20  <String "bold">
	//*   6    9:aload_1         
	//*   7   10:invokevirtual   #186 <Method boolean String.contains(CharSequence)>
	//*   8   13:ifne            62
			{
				flag = flag1;
	//    9   16:iload_3         
	//   10   17:istore_2        
				if(s.length() != 3)
					break label0;
	//   11   18:aload_1         
	//   12   19:invokevirtual   #332 <Method int String.length()>
	//   13   22:iconst_3        
	//   14   23:icmpne          64
				flag = flag1;
	//   15   26:iload_3         
	//   16   27:istore_2        
				if(!s.endsWith("00"))
					break label0;
	//   17   28:aload_1         
	//   18   29:ldc2            #334 <String "00">
	//   19   32:invokevirtual   #337 <Method boolean String.endsWith(String)>
	//   20   35:ifeq            64
				flag = flag1;
	//   21   38:iload_3         
	//   22   39:istore_2        
				if(s.charAt(0) < '6')
					break label0;
	//   23   40:aload_1         
	//   24   41:iconst_0        
	//   25   42:invokevirtual   #341 <Method char String.charAt(int)>
	//   26   45:bipush          54
	//   27   47:icmplt          64
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(s.charAt(0) > '9')
					break label0;
	//   30   52:aload_1         
	//   31   53:iconst_0        
	//   32   54:invokevirtual   #341 <Method char String.charAt(int)>
	//   33   57:bipush          57
	//   34   59:icmpgt          64
			}
			flag = true;
	//   35   62:iconst_1        
	//   36   63:istore_2        
		}
		return flag;
	//   37   64:iload_2         
	//   38   65:ireturn         
	}

	public void setFontProvider(FontProvider fontprovider)
	{
		fontProvider = fontprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field FontProvider fontProvider>
	//    3    5:return          
	}

	public static final List BOLD = Arrays.asList(((Object []) (new String[] {
		"bold", "bolder", "600", "700", "800", "900"
	})));
	protected FontProvider fontProvider;
	protected final CssUtils utils;

	static 
	{
	//    0    0:bipush          6
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #20  <String "bold">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #22  <String "bolder">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #24  <String "600">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #26  <String "700">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #28  <String "800">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #30  <String "900">
	//   25   34:aastore         
	//   26   35:invokestatic    #36  <Method List Arrays.asList(Object[])>
	//   27   38:putstatic       #38  <Field List BOLD>
	//*  28   41:return          
	}
}
