// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.*;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			MarginMemory, ChunkCssApplier, PageSizeContainable

public class ParagraphCssApplier
	implements CssApplier
{

	public ParagraphCssApplier(CssAppliers cssappliers)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		appliers = cssappliers;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field CssAppliers appliers>
	//    5    9:return          
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((Paragraph)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Paragraph>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #24  <Method Paragraph apply(Paragraph, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public Paragraph apply(Paragraph paragraph, Tag tag, MarginMemory marginmemory)
	{
		return apply(paragraph, tag, marginmemory, ((PageSizeContainable) (null)), ((HtmlPipelineContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #24  <Method Paragraph apply(Paragraph, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}

	public Paragraph apply(Paragraph paragraph, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		pagesizecontainable = ((PageSizeContainable) (CssUtils.getInstance()));
	//    0    0:invokestatic    #31  <Method CssUtils CssUtils.getInstance()>
	//    1    3:astore          4
		float f1 = FontSizeTranslator.getInstance().getFontSize(tag);
	//    2    5:invokestatic    #36  <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//    3    8:aload_2         
	//    4    9:invokevirtual   #40  <Method float FontSizeTranslator.getFontSize(Tag)>
	//    5   12:fstore          7
		float f = f1;
	//    6   14:fload           7
	//    7   16:fstore          6
		if(f1 == -1F)
	//*   8   18:fload           7
	//*   9   20:ldc1            #41  <Float -1F>
	//*  10   22:fcmpl           
	//*  11   23:ifne            29
			f = 0.0F;
	//   12   26:fconst_0        
	//   13   27:fstore          6
		f1 = 0.0F;
	//   14   29:fconst_0        
	//   15   30:fstore          7
		boolean flag = false;
	//   16   32:iconst_0        
	//   17   33:istore          8
		htmlpipelinecontext = ((HtmlPipelineContext) (tag.getCSS().entrySet().iterator()));
	//   18   35:aload_2         
	//   19   36:invokevirtual   #47  <Method Map Tag.getCSS()>
	//   20   39:invokeinterface #53  <Method Set Map.entrySet()>
	//   21   44:invokeinterface #59  <Method Iterator Set.iterator()>
	//   22   49:astore          5
		do
		{
			if(!((Iterator) (htmlpipelinecontext)).hasNext())
				break;
	//   23   51:aload           5
	//   24   53:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//   25   58:ifeq            499
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (htmlpipelinecontext)).next()));
	//   26   61:aload           5
	//   27   63:invokeinterface #69  <Method Object Iterator.next()>
	//   28   68:checkcast       #71  <Class java.util.Map$Entry>
	//   29   71:astore          10
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   30   73:aload           10
	//   31   75:invokeinterface #74  <Method Object java.util.Map$Entry.getKey()>
	//   32   80:checkcast       #76  <Class String>
	//   33   83:astore          9
			obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   34   85:aload           10
	//   35   87:invokeinterface #79  <Method Object java.util.Map$Entry.getValue()>
	//   36   92:checkcast       #76  <Class String>
	//   37   95:astore          10
			if("margin-top".equalsIgnoreCase(s))
	//*  38   97:ldc1            #81  <String "margin-top">
	//*  39   99:aload           9
	//*  40  101:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//*  41  104:ifeq            129
				paragraph.setSpacingBefore(paragraph.getSpacingBefore() + ((CssUtils) (pagesizecontainable)).calculateMarginTop(((String) (obj)), f, marginmemory));
	//   42  107:aload_1         
	//   43  108:aload_1         
	//   44  109:invokevirtual   #89  <Method float Paragraph.getSpacingBefore()>
	//   45  112:aload           4
	//   46  114:aload           10
	//   47  116:fload           6
	//   48  118:aload_3         
	//   49  119:invokevirtual   #93  <Method float CssUtils.calculateMarginTop(String, float, MarginMemory)>
	//   50  122:fadd            
	//   51  123:invokevirtual   #97  <Method void Paragraph.setSpacingBefore(float)>
			else
	//*  52  126:goto            51
			if("padding-top".equalsIgnoreCase(s))
	//*  53  129:ldc1            #99  <String "padding-top">
	//*  54  131:aload           9
	//*  55  133:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//*  56  136:ifeq            173
			{
				paragraph.setSpacingBefore(paragraph.getSpacingBefore() + ((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//   57  139:aload_1         
	//   58  140:aload_1         
	//   59  141:invokevirtual   #89  <Method float Paragraph.getSpacingBefore()>
	//   60  144:aload           4
	//   61  146:aload           10
	//   62  148:fload           6
	//   63  150:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//   64  153:fadd            
	//   65  154:invokevirtual   #97  <Method void Paragraph.setSpacingBefore(float)>
				paragraph.setPaddingTop(((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//   66  157:aload_1         
	//   67  158:aload           4
	//   68  160:aload           10
	//   69  162:fload           6
	//   70  164:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//   71  167:invokevirtual   #106 <Method void Paragraph.setPaddingTop(float)>
			} else
	//*  72  170:goto            51
			if("margin-bottom".equalsIgnoreCase(s))
	//*  73  173:ldc1            #108 <String "margin-bottom">
	//*  74  175:aload           9
	//*  75  177:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//*  76  180:ifeq            211
			{
				f1 = ((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f);
	//   77  183:aload           4
	//   78  185:aload           10
	//   79  187:fload           6
	//   80  189:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//   81  192:fstore          7
				paragraph.setSpacingAfter(paragraph.getSpacingAfter() + f1);
	//   82  194:aload_1         
	//   83  195:aload_1         
	//   84  196:invokevirtual   #111 <Method float Paragraph.getSpacingAfter()>
	//   85  199:fload           7
	//   86  201:fadd            
	//   87  202:invokevirtual   #114 <Method void Paragraph.setSpacingAfter(float)>
				flag = true;
	//   88  205:iconst_1        
	//   89  206:istore          8
			} else
	//*  90  208:goto            51
			if("padding-bottom".equalsIgnoreCase(s))
	//*  91  211:ldc1            #116 <String "padding-bottom">
	//*  92  213:aload           9
	//*  93  215:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//*  94  218:ifeq            242
				paragraph.setSpacingAfter(paragraph.getSpacingAfter() + ((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//   95  221:aload_1         
	//   96  222:aload_1         
	//   97  223:invokevirtual   #111 <Method float Paragraph.getSpacingAfter()>
	//   98  226:aload           4
	//   99  228:aload           10
	//  100  230:fload           6
	//  101  232:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//  102  235:fadd            
	//  103  236:invokevirtual   #114 <Method void Paragraph.setSpacingAfter(float)>
			else
	//* 104  239:goto            51
			if("margin-left".equalsIgnoreCase(s))
	//* 105  242:ldc1            #118 <String "margin-left">
	//* 106  244:aload           9
	//* 107  246:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//* 108  249:ifeq            273
				paragraph.setIndentationLeft(paragraph.getIndentationLeft() + ((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//  109  252:aload_1         
	//  110  253:aload_1         
	//  111  254:invokevirtual   #121 <Method float Paragraph.getIndentationLeft()>
	//  112  257:aload           4
	//  113  259:aload           10
	//  114  261:fload           6
	//  115  263:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//  116  266:fadd            
	//  117  267:invokevirtual   #124 <Method void Paragraph.setIndentationLeft(float)>
			else
	//* 118  270:goto            51
			if("margin-right".equalsIgnoreCase(s))
	//* 119  273:ldc1            #126 <String "margin-right">
	//* 120  275:aload           9
	//* 121  277:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//* 122  280:ifeq            304
				paragraph.setIndentationRight(paragraph.getIndentationRight() + ((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//  123  283:aload_1         
	//  124  284:aload_1         
	//  125  285:invokevirtual   #129 <Method float Paragraph.getIndentationRight()>
	//  126  288:aload           4
	//  127  290:aload           10
	//  128  292:fload           6
	//  129  294:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//  130  297:fadd            
	//  131  298:invokevirtual   #132 <Method void Paragraph.setIndentationRight(float)>
			else
	//* 132  301:goto            51
			if("padding-left".equalsIgnoreCase(s))
	//* 133  304:ldc1            #134 <String "padding-left">
	//* 134  306:aload           9
	//* 135  308:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//* 136  311:ifeq            335
				paragraph.setIndentationLeft(paragraph.getIndentationLeft() + ((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//  137  314:aload_1         
	//  138  315:aload_1         
	//  139  316:invokevirtual   #121 <Method float Paragraph.getIndentationLeft()>
	//  140  319:aload           4
	//  141  321:aload           10
	//  142  323:fload           6
	//  143  325:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//  144  328:fadd            
	//  145  329:invokevirtual   #124 <Method void Paragraph.setIndentationLeft(float)>
			else
	//* 146  332:goto            51
			if("padding-right".equalsIgnoreCase(s))
	//* 147  335:ldc1            #136 <String "padding-right">
	//* 148  337:aload           9
	//* 149  339:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//* 150  342:ifeq            366
				paragraph.setIndentationRight(paragraph.getIndentationRight() + ((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//  151  345:aload_1         
	//  152  346:aload_1         
	//  153  347:invokevirtual   #129 <Method float Paragraph.getIndentationRight()>
	//  154  350:aload           4
	//  155  352:aload           10
	//  156  354:fload           6
	//  157  356:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//  158  359:fadd            
	//  159  360:invokevirtual   #132 <Method void Paragraph.setIndentationRight(float)>
			else
	//* 160  363:goto            51
			if("text-align".equalsIgnoreCase(s))
	//* 161  366:ldc1            #138 <String "text-align">
	//* 162  368:aload           9
	//* 163  370:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//* 164  373:ifeq            388
				paragraph.setAlignment(CSS.getElementAlignment(((String) (obj))));
	//  165  376:aload_1         
	//  166  377:aload           10
	//  167  379:invokestatic    #144 <Method int CSS.getElementAlignment(String)>
	//  168  382:invokevirtual   #148 <Method void Paragraph.setAlignment(int)>
			else
	//* 169  385:goto            51
			if("text-indent".equalsIgnoreCase(s))
	//* 170  388:ldc1            #150 <String "text-indent">
	//* 171  390:aload           9
	//* 172  392:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//* 173  395:ifeq            414
				paragraph.setFirstLineIndent(((CssUtils) (pagesizecontainable)).parseValueToPt(((String) (obj)), f));
	//  174  398:aload_1         
	//  175  399:aload           4
	//  176  401:aload           10
	//  177  403:fload           6
	//  178  405:invokevirtual   #103 <Method float CssUtils.parseValueToPt(String, float)>
	//  179  408:invokevirtual   #153 <Method void Paragraph.setFirstLineIndent(float)>
			else
	//* 180  411:goto            51
			if("line-height".equalsIgnoreCase(s))
	//* 181  414:ldc1            #155 <String "line-height">
	//* 182  416:aload           9
	//* 183  418:invokevirtual   #85  <Method boolean String.equalsIgnoreCase(String)>
	//* 184  421:ifeq            51
				if(((CssUtils) (pagesizecontainable)).isNumericValue(((String) (obj))))
	//* 185  424:aload           4
	//* 186  426:aload           10
	//* 187  428:invokevirtual   #158 <Method boolean CssUtils.isNumericValue(String)>
	//* 188  431:ifeq            449
					paragraph.setLeading(Float.parseFloat(((String) (obj))) * f);
	//  189  434:aload_1         
	//  190  435:aload           10
	//  191  437:invokestatic    #164 <Method float Float.parseFloat(String)>
	//  192  440:fload           6
	//  193  442:fmul            
	//  194  443:invokevirtual   #167 <Method void Paragraph.setLeading(float)>
				else
	//* 195  446:goto            51
				if(((CssUtils) (pagesizecontainable)).isRelativeValue(((String) (obj))))
	//* 196  449:aload           4
	//* 197  451:aload           10
	//* 198  453:invokevirtual   #170 <Method boolean CssUtils.isRelativeValue(String)>
	//* 199  456:ifeq            475
					paragraph.setLeading(((CssUtils) (pagesizecontainable)).parseRelativeValue(((String) (obj)), f));
	//  200  459:aload_1         
	//  201  460:aload           4
	//  202  462:aload           10
	//  203  464:fload           6
	//  204  466:invokevirtual   #173 <Method float CssUtils.parseRelativeValue(String, float)>
	//  205  469:invokevirtual   #167 <Method void Paragraph.setLeading(float)>
				else
	//* 206  472:goto            51
				if(((CssUtils) (pagesizecontainable)).isMetricValue(((String) (obj))))
	//* 207  475:aload           4
	//* 208  477:aload           10
	//* 209  479:invokevirtual   #176 <Method boolean CssUtils.isMetricValue(String)>
	//* 210  482:ifeq            51
					paragraph.setLeading(((CssUtils) (pagesizecontainable)).parsePxInCmMmPcToPt(((String) (obj))));
	//  211  485:aload_1         
	//  212  486:aload           4
	//  213  488:aload           10
	//  214  490:invokevirtual   #179 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  215  493:invokevirtual   #167 <Method void Paragraph.setLeading(float)>
		} while(true);
	//  216  496:goto            51
		if(tag.getAttributes().containsKey("align"))
	//* 217  499:aload_2         
	//* 218  500:invokevirtual   #182 <Method Map Tag.getAttributes()>
	//* 219  503:ldc1            #184 <String "align">
	//* 220  505:invokeinterface #188 <Method boolean Map.containsKey(Object)>
	//* 221  510:ifeq            543
		{
			pagesizecontainable = ((PageSizeContainable) ((String)tag.getAttributes().get("align")));
	//  222  513:aload_2         
	//  223  514:invokevirtual   #182 <Method Map Tag.getAttributes()>
	//  224  517:ldc1            #184 <String "align">
	//  225  519:invokeinterface #192 <Method Object Map.get(Object)>
	//  226  524:checkcast       #76  <Class String>
	//  227  527:astore          4
			if(pagesizecontainable != null)
	//* 228  529:aload           4
	//* 229  531:ifnull          543
				paragraph.setAlignment(CSS.getElementAlignment(((String) (pagesizecontainable))));
	//  230  534:aload_1         
	//  231  535:aload           4
	//  232  537:invokestatic    #144 <Method int CSS.getElementAlignment(String)>
	//  233  540:invokevirtual   #148 <Method void Paragraph.setAlignment(int)>
		}
		if(flag)
	//* 234  543:iload           8
	//* 235  545:ifeq            559
			marginmemory.setLastMarginBottom(Float.valueOf(f1));
	//  236  548:aload_3         
	//  237  549:fload           7
	//  238  551:invokestatic    #196 <Method Float Float.valueOf(float)>
	//  239  554:invokeinterface #202 <Method void MarginMemory.setLastMarginBottom(Float)>
		paragraph.setFont(appliers.getChunkCssAplier().applyFontStyles(tag));
	//  240  559:aload_1         
	//  241  560:aload_0         
	//  242  561:getfield        #16  <Field CssAppliers appliers>
	//  243  564:invokeinterface #208 <Method ChunkCssApplier CssAppliers.getChunkCssAplier()>
	//  244  569:aload_2         
	//  245  570:invokevirtual   #214 <Method com.itextpdf.text.Font ChunkCssApplier.applyFontStyles(Tag)>
	//  246  573:invokevirtual   #218 <Method void Paragraph.setFont(com.itextpdf.text.Font)>
		return paragraph;
	//  247  576:aload_1         
	//  248  577:areturn         
	}

	private final CssAppliers appliers;
}
