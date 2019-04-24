// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.Element;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.*;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.html.pdfelement.NoNewLineParagraph;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			MarginMemory, PageSizeContainable

public class NoNewLineParagraphCssApplier
	implements CssApplier
{

	public NoNewLineParagraphCssApplier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #19  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #21  <Field CssUtils utils>
	//    5   11:return          
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((NoNewLineParagraph)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class NoNewLineParagraph>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #29  <Method NoNewLineParagraph apply(NoNewLineParagraph, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public NoNewLineParagraph apply(NoNewLineParagraph nonewlineparagraph, Tag tag, MarginMemory marginmemory)
	{
		return apply(nonewlineparagraph, tag, marginmemory, ((PageSizeContainable) (null)), ((HtmlPipelineContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #29  <Method NoNewLineParagraph apply(NoNewLineParagraph, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}

	public NoNewLineParagraph apply(NoNewLineParagraph nonewlineparagraph, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		float f3 = FontSizeTranslator.getInstance().getFontSize(tag);
	//    0    0:invokestatic    #35  <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #39  <Method float FontSizeTranslator.getFontSize(Tag)>
	//    3    7:fstore          9
		float f = 0.0F;
	//    4    9:fconst_0        
	//    5   10:fstore          6
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          10
		pagesizecontainable = ((PageSizeContainable) (tag.getCSS()));
	//    8   15:aload_2         
	//    9   16:invokevirtual   #45  <Method Map Tag.getCSS()>
	//   10   19:astore          4
		htmlpipelinecontext = ((HtmlPipelineContext) (((Map) (pagesizecontainable)).entrySet().iterator()));
	//   11   21:aload           4
	//   12   23:invokeinterface #51  <Method Set Map.entrySet()>
	//   13   28:invokeinterface #57  <Method Iterator Set.iterator()>
	//   14   33:astore          5
		do
		{
			if(!((Iterator) (htmlpipelinecontext)).hasNext())
				break;
	//   15   35:aload           5
	//   16   37:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            403
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (htmlpipelinecontext)).next()));
	//   18   45:aload           5
	//   19   47:invokeinterface #67  <Method Object Iterator.next()>
	//   20   52:checkcast       #69  <Class java.util.Map$Entry>
	//   21   55:astore          14
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   22   57:aload           14
	//   23   59:invokeinterface #72  <Method Object java.util.Map$Entry.getKey()>
	//   24   64:checkcast       #74  <Class String>
	//   25   67:astore          13
			obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   26   69:aload           14
	//   27   71:invokeinterface #77  <Method Object java.util.Map$Entry.getValue()>
	//   28   76:checkcast       #74  <Class String>
	//   29   79:astore          14
			if("margin-top".equalsIgnoreCase(s))
	//*  30   81:ldc1            #79  <String "margin-top">
	//*  31   83:aload           13
	//*  32   85:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//*  33   88:ifeq            115
				nonewlineparagraph.setSpacingBefore(nonewlineparagraph.getSpacingBefore() + utils.calculateMarginTop(((String) (obj)), f3, marginmemory));
	//   34   91:aload_1         
	//   35   92:aload_1         
	//   36   93:invokevirtual   #87  <Method float NoNewLineParagraph.getSpacingBefore()>
	//   37   96:aload_0         
	//   38   97:getfield        #21  <Field CssUtils utils>
	//   39  100:aload           14
	//   40  102:fload           9
	//   41  104:aload_3         
	//   42  105:invokevirtual   #91  <Method float CssUtils.calculateMarginTop(String, float, MarginMemory)>
	//   43  108:fadd            
	//   44  109:invokevirtual   #95  <Method void NoNewLineParagraph.setSpacingBefore(float)>
			else
	//*  45  112:goto            35
			if("padding-top".equalsIgnoreCase(s))
	//*  46  115:ldc1            #97  <String "padding-top">
	//*  47  117:aload           13
	//*  48  119:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//*  49  122:ifeq            148
				nonewlineparagraph.setSpacingBefore(nonewlineparagraph.getSpacingBefore() + utils.parseValueToPt(((String) (obj)), f3));
	//   50  125:aload_1         
	//   51  126:aload_1         
	//   52  127:invokevirtual   #87  <Method float NoNewLineParagraph.getSpacingBefore()>
	//   53  130:aload_0         
	//   54  131:getfield        #21  <Field CssUtils utils>
	//   55  134:aload           14
	//   56  136:fload           9
	//   57  138:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//   58  141:fadd            
	//   59  142:invokevirtual   #95  <Method void NoNewLineParagraph.setSpacingBefore(float)>
			else
	//*  60  145:goto            35
			if("margin-bottom".equalsIgnoreCase(s))
	//*  61  148:ldc1            #103 <String "margin-bottom">
	//*  62  150:aload           13
	//*  63  152:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//*  64  155:ifeq            188
			{
				f = utils.parseValueToPt(((String) (obj)), f3);
	//   65  158:aload_0         
	//   66  159:getfield        #21  <Field CssUtils utils>
	//   67  162:aload           14
	//   68  164:fload           9
	//   69  166:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//   70  169:fstore          6
				nonewlineparagraph.setSpacingAfter(nonewlineparagraph.getSpacingAfter() + f);
	//   71  171:aload_1         
	//   72  172:aload_1         
	//   73  173:invokevirtual   #106 <Method float NoNewLineParagraph.getSpacingAfter()>
	//   74  176:fload           6
	//   75  178:fadd            
	//   76  179:invokevirtual   #109 <Method void NoNewLineParagraph.setSpacingAfter(float)>
				flag = true;
	//   77  182:iconst_1        
	//   78  183:istore          10
			} else
	//*  79  185:goto            35
			if("padding-bottom".equalsIgnoreCase(s))
	//*  80  188:ldc1            #111 <String "padding-bottom">
	//*  81  190:aload           13
	//*  82  192:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//*  83  195:ifeq            221
				nonewlineparagraph.setSpacingAfter(nonewlineparagraph.getSpacingAfter() + utils.parseValueToPt(((String) (obj)), f3));
	//   84  198:aload_1         
	//   85  199:aload_1         
	//   86  200:invokevirtual   #106 <Method float NoNewLineParagraph.getSpacingAfter()>
	//   87  203:aload_0         
	//   88  204:getfield        #21  <Field CssUtils utils>
	//   89  207:aload           14
	//   90  209:fload           9
	//   91  211:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//   92  214:fadd            
	//   93  215:invokevirtual   #109 <Method void NoNewLineParagraph.setSpacingAfter(float)>
			else
	//*  94  218:goto            35
			if("margin-left".equalsIgnoreCase(s))
	//*  95  221:ldc1            #113 <String "margin-left">
	//*  96  223:aload           13
	//*  97  225:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//*  98  228:ifeq            254
				nonewlineparagraph.setIndentationLeft(nonewlineparagraph.getIndentationLeft() + utils.parseValueToPt(((String) (obj)), f3));
	//   99  231:aload_1         
	//  100  232:aload_1         
	//  101  233:invokevirtual   #116 <Method float NoNewLineParagraph.getIndentationLeft()>
	//  102  236:aload_0         
	//  103  237:getfield        #21  <Field CssUtils utils>
	//  104  240:aload           14
	//  105  242:fload           9
	//  106  244:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//  107  247:fadd            
	//  108  248:invokevirtual   #119 <Method void NoNewLineParagraph.setIndentationLeft(float)>
			else
	//* 109  251:goto            35
			if("margin-right".equalsIgnoreCase(s))
	//* 110  254:ldc1            #121 <String "margin-right">
	//* 111  256:aload           13
	//* 112  258:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//* 113  261:ifeq            287
				nonewlineparagraph.setIndentationRight(nonewlineparagraph.getIndentationRight() + utils.parseValueToPt(((String) (obj)), f3));
	//  114  264:aload_1         
	//  115  265:aload_1         
	//  116  266:invokevirtual   #124 <Method float NoNewLineParagraph.getIndentationRight()>
	//  117  269:aload_0         
	//  118  270:getfield        #21  <Field CssUtils utils>
	//  119  273:aload           14
	//  120  275:fload           9
	//  121  277:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//  122  280:fadd            
	//  123  281:invokevirtual   #127 <Method void NoNewLineParagraph.setIndentationRight(float)>
			else
	//* 124  284:goto            35
			if("padding-left".equalsIgnoreCase(s))
	//* 125  287:ldc1            #129 <String "padding-left">
	//* 126  289:aload           13
	//* 127  291:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//* 128  294:ifeq            320
				nonewlineparagraph.setIndentationLeft(nonewlineparagraph.getIndentationLeft() + utils.parseValueToPt(((String) (obj)), f3));
	//  129  297:aload_1         
	//  130  298:aload_1         
	//  131  299:invokevirtual   #116 <Method float NoNewLineParagraph.getIndentationLeft()>
	//  132  302:aload_0         
	//  133  303:getfield        #21  <Field CssUtils utils>
	//  134  306:aload           14
	//  135  308:fload           9
	//  136  310:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//  137  313:fadd            
	//  138  314:invokevirtual   #119 <Method void NoNewLineParagraph.setIndentationLeft(float)>
			else
	//* 139  317:goto            35
			if("padding-right".equalsIgnoreCase(s))
	//* 140  320:ldc1            #131 <String "padding-right">
	//* 141  322:aload           13
	//* 142  324:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//* 143  327:ifeq            353
				nonewlineparagraph.setIndentationRight(nonewlineparagraph.getIndentationRight() + utils.parseValueToPt(((String) (obj)), f3));
	//  144  330:aload_1         
	//  145  331:aload_1         
	//  146  332:invokevirtual   #124 <Method float NoNewLineParagraph.getIndentationRight()>
	//  147  335:aload_0         
	//  148  336:getfield        #21  <Field CssUtils utils>
	//  149  339:aload           14
	//  150  341:fload           9
	//  151  343:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//  152  346:fadd            
	//  153  347:invokevirtual   #127 <Method void NoNewLineParagraph.setIndentationRight(float)>
			else
	//* 154  350:goto            35
			if("text-align".equalsIgnoreCase(s))
	//* 155  353:ldc1            #133 <String "text-align">
	//* 156  355:aload           13
	//* 157  357:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//* 158  360:ifeq            375
				nonewlineparagraph.setAlignment(CSS.getElementAlignment(((String) (obj))));
	//  159  363:aload_1         
	//  160  364:aload           14
	//  161  366:invokestatic    #139 <Method int CSS.getElementAlignment(String)>
	//  162  369:invokevirtual   #143 <Method void NoNewLineParagraph.setAlignment(int)>
			else
	//* 163  372:goto            35
			if("text-indent".equalsIgnoreCase(s))
	//* 164  375:ldc1            #145 <String "text-indent">
	//* 165  377:aload           13
	//* 166  379:invokevirtual   #83  <Method boolean String.equalsIgnoreCase(String)>
	//* 167  382:ifeq            35
				nonewlineparagraph.setFirstLineIndent(utils.parseValueToPt(((String) (obj)), f3));
	//  168  385:aload_1         
	//  169  386:aload_0         
	//  170  387:getfield        #21  <Field CssUtils utils>
	//  171  390:aload           14
	//  172  392:fload           9
	//  173  394:invokevirtual   #101 <Method float CssUtils.parseValueToPt(String, float)>
	//  174  397:invokevirtual   #148 <Method void NoNewLineParagraph.setFirstLineIndent(float)>
		} while(true);
	//  175  400:goto            35
		boolean flag2 = flag;
	//  176  403:iload           10
	//  177  405:istore          12
		float f2 = f;
	//  178  407:fload           6
	//  179  409:fstore          8
		if(tag.getParent() != null)
	//* 180  411:aload_2         
	//* 181  412:invokevirtual   #152 <Method Tag Tag.getParent()>
	//* 182  415:ifnull          611
		{
			tag = ((Tag) (tag.getParent().getName()));
	//  183  418:aload_2         
	//  184  419:invokevirtual   #152 <Method Tag Tag.getParent()>
	//  185  422:invokevirtual   #156 <Method String Tag.getName()>
	//  186  425:astore_2        
			if(((Map) (pagesizecontainable)).get("margin-top") == null && marginmemory.getRootTags().contains(((Object) (tag))))
	//* 187  426:aload           4
	//* 188  428:ldc1            #79  <String "margin-top">
	//* 189  430:invokeinterface #160 <Method Object Map.get(Object)>
	//* 190  435:ifnonnull       491
	//* 191  438:aload_3         
	//* 192  439:invokeinterface #166 <Method List MarginMemory.getRootTags()>
	//* 193  444:aload_2         
	//* 194  445:invokeinterface #172 <Method boolean List.contains(Object)>
	//* 195  450:ifeq            491
				nonewlineparagraph.setSpacingBefore(nonewlineparagraph.getSpacingBefore() + utils.calculateMarginTop((new StringBuilder()).append(f3).append("pt").toString(), 0.0F, marginmemory));
	//  196  453:aload_1         
	//  197  454:aload_1         
	//  198  455:invokevirtual   #87  <Method float NoNewLineParagraph.getSpacingBefore()>
	//  199  458:aload_0         
	//  200  459:getfield        #21  <Field CssUtils utils>
	//  201  462:new             #174 <Class StringBuilder>
	//  202  465:dup             
	//  203  466:invokespecial   #175 <Method void StringBuilder()>
	//  204  469:fload           9
	//  205  471:invokevirtual   #179 <Method StringBuilder StringBuilder.append(float)>
	//  206  474:ldc1            #181 <String "pt">
	//  207  476:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  208  479:invokevirtual   #187 <Method String StringBuilder.toString()>
	//  209  482:fconst_0        
	//  210  483:aload_3         
	//  211  484:invokevirtual   #91  <Method float CssUtils.calculateMarginTop(String, float, MarginMemory)>
	//  212  487:fadd            
	//  213  488:invokevirtual   #95  <Method void NoNewLineParagraph.setSpacingBefore(float)>
			boolean flag1 = flag;
	//  214  491:iload           10
	//  215  493:istore          11
			float f1 = f;
	//  216  495:fload           6
	//  217  497:fstore          7
			if(((Map) (pagesizecontainable)).get("margin-bottom") == null)
	//* 218  499:aload           4
	//* 219  501:ldc1            #103 <String "margin-bottom">
	//* 220  503:invokeinterface #160 <Method Object Map.get(Object)>
	//* 221  508:ifnonnull       582
			{
				flag1 = flag;
	//  222  511:iload           10
	//  223  513:istore          11
				f1 = f;
	//  224  515:fload           6
	//  225  517:fstore          7
				if(marginmemory.getRootTags().contains(((Object) (tag))))
	//* 226  519:aload_3         
	//* 227  520:invokeinterface #166 <Method List MarginMemory.getRootTags()>
	//* 228  525:aload_2         
	//* 229  526:invokeinterface #172 <Method boolean List.contains(Object)>
	//* 230  531:ifeq            582
				{
					nonewlineparagraph.setSpacingAfter(nonewlineparagraph.getSpacingAfter() + f3);
	//  231  534:aload_1         
	//  232  535:aload_1         
	//  233  536:invokevirtual   #106 <Method float NoNewLineParagraph.getSpacingAfter()>
	//  234  539:fload           9
	//  235  541:fadd            
	//  236  542:invokevirtual   #109 <Method void NoNewLineParagraph.setSpacingAfter(float)>
					((Map) (pagesizecontainable)).put("margin-bottom", ((Object) ((new StringBuilder()).append(f3).append("pt").toString())));
	//  237  545:aload           4
	//  238  547:ldc1            #103 <String "margin-bottom">
	//  239  549:new             #174 <Class StringBuilder>
	//  240  552:dup             
	//  241  553:invokespecial   #175 <Method void StringBuilder()>
	//  242  556:fload           9
	//  243  558:invokevirtual   #179 <Method StringBuilder StringBuilder.append(float)>
	//  244  561:ldc1            #181 <String "pt">
	//  245  563:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  246  566:invokevirtual   #187 <Method String StringBuilder.toString()>
	//  247  569:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//  248  574:pop             
					f1 = f3;
	//  249  575:fload           9
	//  250  577:fstore          7
					flag1 = true;
	//  251  579:iconst_1        
	//  252  580:istore          11
				}
			}
			flag2 = flag1;
	//  253  582:iload           11
	//  254  584:istore          12
			f2 = f1;
	//  255  586:fload           7
	//  256  588:fstore          8
			if(nonewlineparagraph.getAlignment() == -1)
	//* 257  590:aload_1         
	//* 258  591:invokevirtual   #195 <Method int NoNewLineParagraph.getAlignment()>
	//* 259  594:iconst_m1       
	//* 260  595:icmpne          611
			{
				nonewlineparagraph.setAlignment(0);
	//  261  598:aload_1         
	//  262  599:iconst_0        
	//  263  600:invokevirtual   #143 <Method void NoNewLineParagraph.setAlignment(int)>
				f2 = f1;
	//  264  603:fload           7
	//  265  605:fstore          8
				flag2 = flag1;
	//  266  607:iload           11
	//  267  609:istore          12
			}
		}
		if(flag2)
	//* 268  611:iload           12
	//* 269  613:ifeq            627
			marginmemory.setLastMarginBottom(Float.valueOf(f2));
	//  270  616:aload_3         
	//  271  617:fload           8
	//  272  619:invokestatic    #201 <Method Float Float.valueOf(float)>
	//  273  622:invokeinterface #205 <Method void MarginMemory.setLastMarginBottom(Float)>
		return nonewlineparagraph;
	//  274  627:aload_1         
	//  275  628:areturn         
	}

	private final CssUtils utils = CssUtils.getInstance();
}
