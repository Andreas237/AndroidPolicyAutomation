// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.Element;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.text.log.*;
import com.itextpdf.text.pdf.PdfDiv;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.net.ImageRetrieve;
import com.itextpdf.tool.xml.net.exc.NoImageException;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			ListStyleTypeCssApplier, PageSizeContainable, MarginMemory

public class DivCssApplier
	implements CssApplier
{

	public DivCssApplier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #33  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #35  <Field CssUtils utils>
	//    5   11:return          
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((PdfDiv)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class PdfDiv>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #42  <Method PdfDiv apply(PdfDiv, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public PdfDiv apply(PdfDiv pdfdiv, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		float f;
		Object obj;
		Map map = tag.getCSS();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #50  <Method Map Tag.getCSS()>
	//    2    4:astore          10
		float f1 = FontSizeTranslator.getInstance().translateFontSize(tag);
	//    3    6:invokestatic    #55  <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//    4    9:aload_2         
	//    5   10:invokevirtual   #59  <Method float FontSizeTranslator.translateFontSize(Tag)>
	//    6   13:fstore          7
		f = f1;
	//    7   15:fload           7
	//    8   17:fstore          6
		if(f1 == -1F)
	//*   9   19:fload           7
	//*  10   21:ldc1            #60  <Float -1F>
	//*  11   23:fcmpl           
	//*  12   24:ifne            31
			f = 12F;
	//   13   27:ldc1            #61  <Float 12F>
	//   14   29:fstore          6
		obj = null;
	//   15   31:aconst_null     
	//   16   32:astore          8
		String s;
		if(tag.getAttributes().containsKey("align"))
	//*  17   34:aload_2         
	//*  18   35:invokevirtual   #64  <Method Map Tag.getAttributes()>
	//*  19   38:ldc1            #66  <String "align">
	//*  20   40:invokeinterface #72  <Method boolean Map.containsKey(Object)>
	//*  21   45:ifeq            351
		{
			obj = ((Object) ((String)tag.getAttributes().get("align")));
	//   22   48:aload_2         
	//   23   49:invokevirtual   #64  <Method Map Tag.getAttributes()>
	//   24   52:ldc1            #66  <String "align">
	//   25   54:invokeinterface #76  <Method Object Map.get(Object)>
	//   26   59:checkcast       #78  <Class String>
	//   27   62:astore          8
			break MISSING_BLOCK_LABEL_64;
		} else
	//*  28   64:aload           8
	//*  29   66:ifnull          78
	//*  30   69:aload_1         
	//*  31   70:aload           8
	//*  32   72:invokestatic    #84  <Method int CSS.getElementAlignment(String)>
	//*  33   75:invokevirtual   #88  <Method void PdfDiv.setTextAlignment(int)>
	//*  34   78:aload           10
	//*  35   80:ldc1            #90  <String "width">
	//*  36   82:invokeinterface #76  <Method Object Map.get(Object)>
	//*  37   87:checkcast       #78  <Class String>
	//*  38   90:astore          9
	//*  39   92:aload           9
	//*  40   94:astore          8
	//*  41   96:aload           9
	//*  42   98:ifnonnull       117
	//*  43  101:aload_2         
	//*  44  102:invokevirtual   #64  <Method Map Tag.getAttributes()>
	//*  45  105:ldc1            #90  <String "width">
	//*  46  107:invokeinterface #76  <Method Object Map.get(Object)>
	//*  47  112:checkcast       #78  <Class String>
	//*  48  115:astore          8
	//*  49  117:aload           8
	//*  50  119:ifnull          179
	//*  51  122:aload           4
	//*  52  124:invokeinterface #96  <Method Rectangle PageSizeContainable.getPageSize()>
	//*  53  129:invokevirtual   #102 <Method float Rectangle.getWidth()>
	//*  54  132:fstore          7
	//*  55  134:aload_0         
	//*  56  135:getfield        #35  <Field CssUtils utils>
	//*  57  138:aload           8
	//*  58  140:invokevirtual   #106 <Method boolean CssUtils.isNumericValue(String)>
	//*  59  143:ifne            158
	//*  60  146:aload_0         
	//*  61  147:getfield        #35  <Field CssUtils utils>
	//*  62  150:aload           8
	//*  63  152:invokevirtual   #109 <Method boolean CssUtils.isMetricValue(String)>
	//*  64  155:ifeq            380
	//*  65  158:aload_1         
	//*  66  159:fload           7
	//*  67  161:aload_0         
	//*  68  162:getfield        #35  <Field CssUtils utils>
	//*  69  165:aload           8
	//*  70  167:invokevirtual   #113 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//*  71  170:invokestatic    #119 <Method float Math.min(float, float)>
	//*  72  173:invokestatic    #125 <Method Float Float.valueOf(float)>
	//*  73  176:invokevirtual   #129 <Method void PdfDiv.setWidth(Float)>
	//*  74  179:aload           10
	//*  75  181:ldc1            #131 <String "height">
	//*  76  183:invokeinterface #76  <Method Object Map.get(Object)>
	//*  77  188:checkcast       #78  <Class String>
	//*  78  191:astore          8
	//*  79  193:aload           8
	//*  80  195:astore          4
	//*  81  197:aload           8
	//*  82  199:ifnonnull       218
	//*  83  202:aload_2         
	//*  84  203:invokevirtual   #64  <Method Map Tag.getAttributes()>
	//*  85  206:ldc1            #131 <String "height">
	//*  86  208:invokeinterface #76  <Method Object Map.get(Object)>
	//*  87  213:checkcast       #78  <Class String>
	//*  88  216:astore          4
	//*  89  218:aload           4
	//*  90  220:ifnull          263
	//*  91  223:aload_0         
	//*  92  224:getfield        #35  <Field CssUtils utils>
	//*  93  227:aload           4
	//*  94  229:invokevirtual   #106 <Method boolean CssUtils.isNumericValue(String)>
	//*  95  232:ifne            247
	//*  96  235:aload_0         
	//*  97  236:getfield        #35  <Field CssUtils utils>
	//*  98  239:aload           4
	//*  99  241:invokevirtual   #109 <Method boolean CssUtils.isMetricValue(String)>
	//* 100  244:ifeq            448
	//* 101  247:aload_1         
	//* 102  248:aload_0         
	//* 103  249:getfield        #35  <Field CssUtils utils>
	//* 104  252:aload           4
	//* 105  254:invokevirtual   #113 <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//* 106  257:invokestatic    #125 <Method Float Float.valueOf(float)>
	//* 107  260:invokevirtual   #134 <Method void PdfDiv.setHeight(Float)>
	//* 108  263:aload           10
	//* 109  265:invokeinterface #138 <Method Set Map.entrySet()>
	//* 110  270:invokeinterface #144 <Method Iterator Set.iterator()>
	//* 111  275:astore_2        
	//* 112  276:aload_2         
	//* 113  277:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//* 114  282:ifeq            1604
	//* 115  285:aload_2         
	//* 116  286:invokeinterface #154 <Method Object Iterator.next()>
	//* 117  291:checkcast       #156 <Class java.util.Map$Entry>
	//* 118  294:astore          8
	//* 119  296:aload           8
	//* 120  298:invokeinterface #159 <Method Object java.util.Map$Entry.getKey()>
	//* 121  303:checkcast       #78  <Class String>
	//* 122  306:astore          4
	//* 123  308:aload           8
	//* 124  310:invokeinterface #162 <Method Object java.util.Map$Entry.getValue()>
	//* 125  315:checkcast       #78  <Class String>
	//* 126  318:astore          8
	//* 127  320:aload           4
	//* 128  322:ldc1            #164 <String "left">
	//* 129  324:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 130  327:ifeq            511
	//* 131  330:aload_1         
	//* 132  331:aload_0         
	//* 133  332:getfield        #35  <Field CssUtils utils>
	//* 134  335:aload           8
	//* 135  337:fload           6
	//* 136  339:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//* 137  342:invokestatic    #125 <Method Float Float.valueOf(float)>
	//* 138  345:invokevirtual   #174 <Method void PdfDiv.setLeft(Float)>
	//* 139  348:goto            276
		{
			if(map.containsKey("text-align"))
	//* 140  351:aload           10
	//* 141  353:ldc1            #176 <String "text-align">
	//* 142  355:invokeinterface #72  <Method boolean Map.containsKey(Object)>
	//* 143  360:ifeq            64
				obj = ((Object) ((String)map.get("text-align")));
	//  144  363:aload           10
	//  145  365:ldc1            #176 <String "text-align">
	//  146  367:invokeinterface #76  <Method Object Map.get(Object)>
	//  147  372:checkcast       #78  <Class String>
	//  148  375:astore          8
			continue;
	//  149  377:goto            64
		}
		do
		{
			if(obj != null)
				pdfdiv.setTextAlignment(CSS.getElementAlignment(((String) (obj))));
			s = (String)map.get("width");
			obj = ((Object) (s));
			if(s == null)
				obj = ((Object) ((String)tag.getAttributes().get("width")));
			if(obj != null)
			{
				float f2 = pagesizecontainable.getPageSize().getWidth();
				if(utils.isNumericValue(((String) (obj))) || utils.isMetricValue(((String) (obj))))
					pdfdiv.setWidth(Float.valueOf(Math.min(f2, utils.parsePxInCmMmPcToPt(((String) (obj))))));
				else
				if(utils.isRelativeValue(((String) (obj))))
	//* 150  380:aload_0         
	//* 151  381:getfield        #35  <Field CssUtils utils>
	//* 152  384:aload           8
	//* 153  386:invokevirtual   #179 <Method boolean CssUtils.isRelativeValue(String)>
	//* 154  389:ifeq            179
					if(((String) (obj)).contains("%"))
	//* 155  392:aload           8
	//* 156  394:ldc1            #181 <String "%">
	//* 157  396:invokevirtual   #185 <Method boolean String.contains(CharSequence)>
	//* 158  399:ifeq            422
						pdfdiv.setPercentageWidth(Float.valueOf(utils.parseRelativeValue(((String) (obj)), 1.0F)));
	//  159  402:aload_1         
	//  160  403:aload_0         
	//  161  404:getfield        #35  <Field CssUtils utils>
	//  162  407:aload           8
	//  163  409:fconst_1        
	//  164  410:invokevirtual   #188 <Method float CssUtils.parseRelativeValue(String, float)>
	//  165  413:invokestatic    #125 <Method Float Float.valueOf(float)>
	//  166  416:invokevirtual   #191 <Method void PdfDiv.setPercentageWidth(Float)>
					else
	//* 167  419:goto            179
						pdfdiv.setWidth(Float.valueOf(Math.min(f2, utils.parseRelativeValue(((String) (obj)), f))));
	//  168  422:aload_1         
	//  169  423:fload           7
	//  170  425:aload_0         
	//  171  426:getfield        #35  <Field CssUtils utils>
	//  172  429:aload           8
	//  173  431:fload           6
	//  174  433:invokevirtual   #188 <Method float CssUtils.parseRelativeValue(String, float)>
	//  175  436:invokestatic    #119 <Method float Math.min(float, float)>
	//  176  439:invokestatic    #125 <Method Float Float.valueOf(float)>
	//  177  442:invokevirtual   #129 <Method void PdfDiv.setWidth(Float)>
			}
			obj = ((Object) ((String)map.get("height")));
			pagesizecontainable = ((PageSizeContainable) (obj));
			if(obj == null)
				pagesizecontainable = ((PageSizeContainable) ((String)tag.getAttributes().get("height")));
			if(pagesizecontainable != null)
				if(utils.isNumericValue(((String) (pagesizecontainable))) || utils.isMetricValue(((String) (pagesizecontainable))))
					pdfdiv.setHeight(Float.valueOf(utils.parsePxInCmMmPcToPt(((String) (pagesizecontainable)))));
				else
	//* 178  445:goto            179
				if(utils.isRelativeValue(((String) (pagesizecontainable))))
	//* 179  448:aload_0         
	//* 180  449:getfield        #35  <Field CssUtils utils>
	//* 181  452:aload           4
	//* 182  454:invokevirtual   #179 <Method boolean CssUtils.isRelativeValue(String)>
	//* 183  457:ifeq            263
					if(((String) (pagesizecontainable)).contains("%"))
	//* 184  460:aload           4
	//* 185  462:ldc1            #181 <String "%">
	//* 186  464:invokevirtual   #185 <Method boolean String.contains(CharSequence)>
	//* 187  467:ifeq            490
						pdfdiv.setPercentageHeight(Float.valueOf(utils.parseRelativeValue(((String) (pagesizecontainable)), 1.0F)));
	//  188  470:aload_1         
	//  189  471:aload_0         
	//  190  472:getfield        #35  <Field CssUtils utils>
	//  191  475:aload           4
	//  192  477:fconst_1        
	//  193  478:invokevirtual   #188 <Method float CssUtils.parseRelativeValue(String, float)>
	//  194  481:invokestatic    #125 <Method Float Float.valueOf(float)>
	//  195  484:invokevirtual   #194 <Method void PdfDiv.setPercentageHeight(Float)>
					else
	//* 196  487:goto            263
						pdfdiv.setHeight(Float.valueOf(utils.parseRelativeValue(((String) (pagesizecontainable)), f)));
	//  197  490:aload_1         
	//  198  491:aload_0         
	//  199  492:getfield        #35  <Field CssUtils utils>
	//  200  495:aload           4
	//  201  497:fload           6
	//  202  499:invokevirtual   #188 <Method float CssUtils.parseRelativeValue(String, float)>
	//  203  502:invokestatic    #125 <Method Float Float.valueOf(float)>
	//  204  505:invokevirtual   #134 <Method void PdfDiv.setHeight(Float)>
			for(tag = ((Tag) (map.entrySet().iterator())); ((Iterator) (tag)).hasNext();)
			{
				obj = ((Object) ((java.util.Map.Entry)((Iterator) (tag)).next()));
				pagesizecontainable = ((PageSizeContainable) ((String)((java.util.Map.Entry) (obj)).getKey()));
				obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
				if(((String) (pagesizecontainable)).equalsIgnoreCase("left"))
					pdfdiv.setLeft(Float.valueOf(utils.parseValueToPt(((String) (obj)), f)));
				else
	//* 205  508:goto            263
				if(((String) (pagesizecontainable)).equalsIgnoreCase("right"))
	//* 206  511:aload           4
	//* 207  513:ldc1            #196 <String "right">
	//* 208  515:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 209  518:ifeq            556
				{
					if(pdfdiv.getWidth() == null || pdfdiv.getLeft() == null)
	//* 210  521:aload_1         
	//* 211  522:invokevirtual   #199 <Method Float PdfDiv.getWidth()>
	//* 212  525:ifnull          535
	//* 213  528:aload_1         
	//* 214  529:invokevirtual   #202 <Method Float PdfDiv.getLeft()>
	//* 215  532:ifnonnull       276
						pdfdiv.setRight(Float.valueOf(utils.parseValueToPt(((String) (obj)), f)));
	//  216  535:aload_1         
	//  217  536:aload_0         
	//  218  537:getfield        #35  <Field CssUtils utils>
	//  219  540:aload           8
	//  220  542:fload           6
	//  221  544:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  222  547:invokestatic    #125 <Method Float Float.valueOf(float)>
	//  223  550:invokevirtual   #205 <Method void PdfDiv.setRight(Float)>
				} else
	//* 224  553:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("top"))
	//* 225  556:aload           4
	//* 226  558:ldc1            #207 <String "top">
	//* 227  560:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 228  563:ifeq            587
					pdfdiv.setTop(Float.valueOf(utils.parseValueToPt(((String) (obj)), f)));
	//  229  566:aload_1         
	//  230  567:aload_0         
	//  231  568:getfield        #35  <Field CssUtils utils>
	//  232  571:aload           8
	//  233  573:fload           6
	//  234  575:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  235  578:invokestatic    #125 <Method Float Float.valueOf(float)>
	//  236  581:invokevirtual   #210 <Method void PdfDiv.setTop(Float)>
				else
	//* 237  584:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("bottom"))
	//* 238  587:aload           4
	//* 239  589:ldc1            #212 <String "bottom">
	//* 240  591:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 241  594:ifeq            632
				{
					if(pdfdiv.getHeight() == null || pdfdiv.getTop() == null)
	//* 242  597:aload_1         
	//* 243  598:invokevirtual   #215 <Method Float PdfDiv.getHeight()>
	//* 244  601:ifnull          611
	//* 245  604:aload_1         
	//* 246  605:invokevirtual   #218 <Method Float PdfDiv.getTop()>
	//* 247  608:ifnonnull       276
						pdfdiv.setBottom(Float.valueOf(utils.parseValueToPt(((String) (obj)), f)));
	//  248  611:aload_1         
	//  249  612:aload_0         
	//  250  613:getfield        #35  <Field CssUtils utils>
	//  251  616:aload           8
	//  252  618:fload           6
	//  253  620:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  254  623:invokestatic    #125 <Method Float Float.valueOf(float)>
	//  255  626:invokevirtual   #221 <Method void PdfDiv.setBottom(Float)>
				} else
	//* 256  629:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("background-color"))
	//* 257  632:aload           4
	//* 258  634:ldc1            #223 <String "background-color">
	//* 259  636:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 260  639:ifeq            654
					pdfdiv.setBackgroundColor(HtmlUtilities.decodeColor(((String) (obj))));
	//  261  642:aload_1         
	//  262  643:aload           8
	//  263  645:invokestatic    #229 <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//  264  648:invokevirtual   #233 <Method void PdfDiv.setBackgroundColor(com.itextpdf.text.BaseColor)>
				else
	//* 265  651:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("background-image"))
	//* 266  654:aload           4
	//* 267  656:ldc1            #235 <String "background-image">
	//* 268  658:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 269  661:ifeq            754
				{
					pagesizecontainable = ((PageSizeContainable) (utils.extractUrl(((String) (obj)))));
	//  270  664:aload_0         
	//  271  665:getfield        #35  <Field CssUtils utils>
	//  272  668:aload           8
	//  273  670:invokevirtual   #239 <Method String CssUtils.extractUrl(String)>
	//  274  673:astore          4
					try
					{
						pdfdiv.setBackgroundImage((new ImageRetrieve(htmlpipelinecontext.getResourcesRootPath(), htmlpipelinecontext.getImageProvider())).retrieveImage(((String) (pagesizecontainable))));
	//  275  675:aload_1         
	//  276  676:new             #241 <Class ImageRetrieve>
	//  277  679:dup             
	//  278  680:aload           5
	//  279  682:invokevirtual   #247 <Method String HtmlPipelineContext.getResourcesRootPath()>
	//  280  685:aload           5
	//  281  687:invokevirtual   #251 <Method com.itextpdf.tool.xml.pipeline.html.ImageProvider HtmlPipelineContext.getImageProvider()>
	//  282  690:invokespecial   #254 <Method void ImageRetrieve(String, com.itextpdf.tool.xml.pipeline.html.ImageProvider)>
	//  283  693:aload           4
	//  284  695:invokevirtual   #258 <Method com.itextpdf.text.Image ImageRetrieve.retrieveImage(String)>
	//  285  698:invokevirtual   #262 <Method void PdfDiv.setBackgroundImage(com.itextpdf.text.Image)>
					}
	//* 286  701:goto            276
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//* 287  704:astore          8
					{
						if(LOG.isLogging(Level.ERROR))
	//* 288  706:getstatic       #23  <Field Logger LOG>
	//* 289  709:getstatic       #268 <Field Level Level.ERROR>
	//* 290  712:invokeinterface #274 <Method boolean Logger.isLogging(Level)>
	//* 291  717:ifeq            276
							LOG.error(String.format(LocaleMessages.getInstance().getMessage("html.tag.img.failed"), new Object[] {
								pagesizecontainable
							}), ((Exception) (obj)));
	//  292  720:getstatic       #23  <Field Logger LOG>
	//  293  723:invokestatic    #279 <Method LocaleMessages LocaleMessages.getInstance()>
	//  294  726:ldc2            #281 <String "html.tag.img.failed">
	//  295  729:invokevirtual   #284 <Method String LocaleMessages.getMessage(String)>
	//  296  732:iconst_1        
	//  297  733:anewarray       Object[]
	//  298  736:dup             
	//  299  737:iconst_0        
	//  300  738:aload           4
	//  301  740:aastore         
	//  302  741:invokestatic    #288 <Method String String.format(String, Object[])>
	//  303  744:aload           8
	//  304  746:invokeinterface #292 <Method void Logger.error(String, Exception)>
					}
				} else
	//* 305  751:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("padding-left"))
	//* 306  754:aload           4
	//* 307  756:ldc2            #294 <String "padding-left">
	//* 308  759:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 309  762:ifeq            783
					pdfdiv.setPaddingLeft(utils.parseValueToPt(((String) (obj)), f));
	//  310  765:aload_1         
	//  311  766:aload_0         
	//  312  767:getfield        #35  <Field CssUtils utils>
	//  313  770:aload           8
	//  314  772:fload           6
	//  315  774:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  316  777:invokevirtual   #298 <Method void PdfDiv.setPaddingLeft(float)>
				else
	//* 317  780:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("padding-right"))
	//* 318  783:aload           4
	//* 319  785:ldc2            #300 <String "padding-right">
	//* 320  788:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 321  791:ifeq            812
					pdfdiv.setPaddingRight(utils.parseValueToPt(((String) (obj)), f));
	//  322  794:aload_1         
	//  323  795:aload_0         
	//  324  796:getfield        #35  <Field CssUtils utils>
	//  325  799:aload           8
	//  326  801:fload           6
	//  327  803:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  328  806:invokevirtual   #303 <Method void PdfDiv.setPaddingRight(float)>
				else
	//* 329  809:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("padding-top"))
	//* 330  812:aload           4
	//* 331  814:ldc2            #305 <String "padding-top">
	//* 332  817:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 333  820:ifeq            841
					pdfdiv.setPaddingTop(utils.parseValueToPt(((String) (obj)), f));
	//  334  823:aload_1         
	//  335  824:aload_0         
	//  336  825:getfield        #35  <Field CssUtils utils>
	//  337  828:aload           8
	//  338  830:fload           6
	//  339  832:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  340  835:invokevirtual   #308 <Method void PdfDiv.setPaddingTop(float)>
				else
	//* 341  838:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("padding-bottom"))
	//* 342  841:aload           4
	//* 343  843:ldc2            #310 <String "padding-bottom">
	//* 344  846:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 345  849:ifeq            870
					pdfdiv.setPaddingBottom(utils.parseValueToPt(((String) (obj)), f));
	//  346  852:aload_1         
	//  347  853:aload_0         
	//  348  854:getfield        #35  <Field CssUtils utils>
	//  349  857:aload           8
	//  350  859:fload           6
	//  351  861:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  352  864:invokevirtual   #313 <Method void PdfDiv.setPaddingBottom(float)>
				else
	//* 353  867:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("margin-top"))
	//* 354  870:aload           4
	//* 355  872:ldc2            #315 <String "margin-top">
	//* 356  875:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 357  878:ifeq            897
					utils.calculateMarginTop(((String) (obj)), f, marginmemory);
	//  358  881:aload_0         
	//  359  882:getfield        #35  <Field CssUtils utils>
	//  360  885:aload           8
	//  361  887:fload           6
	//  362  889:aload_3         
	//  363  890:invokevirtual   #319 <Method float CssUtils.calculateMarginTop(String, float, MarginMemory)>
	//  364  893:pop             
				else
	//* 365  894:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("margin-bottom"))
	//* 366  897:aload           4
	//* 367  899:ldc2            #321 <String "margin-bottom">
	//* 368  902:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 369  905:ifeq            923
					utils.parseValueToPt(((String) (obj)), f);
	//  370  908:aload_0         
	//  371  909:getfield        #35  <Field CssUtils utils>
	//  372  912:aload           8
	//  373  914:fload           6
	//  374  916:invokevirtual   #171 <Method float CssUtils.parseValueToPt(String, float)>
	//  375  919:pop             
				else
	//* 376  920:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("float"))
	//* 377  923:aload           4
	//* 378  925:ldc2            #323 <String "float">
	//* 379  928:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 380  931:ifeq            974
				{
					if(((String) (obj)).equalsIgnoreCase("left"))
	//* 381  934:aload           8
	//* 382  936:ldc1            #164 <String "left">
	//* 383  938:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 384  941:ifeq            954
						pdfdiv.setFloatType(com.itextpdf.text.pdf.PdfDiv.FloatType.LEFT);
	//  385  944:aload_1         
	//  386  945:getstatic       #329 <Field com.itextpdf.text.pdf.PdfDiv$FloatType com.itextpdf.text.pdf.PdfDiv$FloatType.LEFT>
	//  387  948:invokevirtual   #333 <Method void PdfDiv.setFloatType(com.itextpdf.text.pdf.PdfDiv$FloatType)>
					else
	//* 388  951:goto            276
					if(((String) (obj)).equalsIgnoreCase("right"))
	//* 389  954:aload           8
	//* 390  956:ldc1            #196 <String "right">
	//* 391  958:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 392  961:ifeq            276
						pdfdiv.setFloatType(com.itextpdf.text.pdf.PdfDiv.FloatType.RIGHT);
	//  393  964:aload_1         
	//  394  965:getstatic       #336 <Field com.itextpdf.text.pdf.PdfDiv$FloatType com.itextpdf.text.pdf.PdfDiv$FloatType.RIGHT>
	//  395  968:invokevirtual   #333 <Method void PdfDiv.setFloatType(com.itextpdf.text.pdf.PdfDiv$FloatType)>
				} else
	//* 396  971:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("position"))
	//* 397  974:aload           4
	//* 398  976:ldc2            #338 <String "position">
	//* 399  979:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 400  982:ifeq            1048
				{
					if(((String) (obj)).equalsIgnoreCase("absolute"))
	//* 401  985:aload           8
	//* 402  987:ldc2            #340 <String "absolute">
	//* 403  990:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 404  993:ifeq            1006
						pdfdiv.setPosition(com.itextpdf.text.pdf.PdfDiv.PositionType.ABSOLUTE);
	//  405  996:aload_1         
	//  406  997:getstatic       #346 <Field com.itextpdf.text.pdf.PdfDiv$PositionType com.itextpdf.text.pdf.PdfDiv$PositionType.ABSOLUTE>
	//  407 1000:invokevirtual   #350 <Method void PdfDiv.setPosition(com.itextpdf.text.pdf.PdfDiv$PositionType)>
					else
	//* 408 1003:goto            276
					if(((String) (obj)).equalsIgnoreCase("fixed"))
	//* 409 1006:aload           8
	//* 410 1008:ldc2            #352 <String "fixed">
	//* 411 1011:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 412 1014:ifeq            1027
						pdfdiv.setPosition(com.itextpdf.text.pdf.PdfDiv.PositionType.FIXED);
	//  413 1017:aload_1         
	//  414 1018:getstatic       #355 <Field com.itextpdf.text.pdf.PdfDiv$PositionType com.itextpdf.text.pdf.PdfDiv$PositionType.FIXED>
	//  415 1021:invokevirtual   #350 <Method void PdfDiv.setPosition(com.itextpdf.text.pdf.PdfDiv$PositionType)>
					else
	//* 416 1024:goto            276
					if(((String) (obj)).equalsIgnoreCase("relative"))
	//* 417 1027:aload           8
	//* 418 1029:ldc2            #357 <String "relative">
	//* 419 1032:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 420 1035:ifeq            276
						pdfdiv.setPosition(com.itextpdf.text.pdf.PdfDiv.PositionType.RELATIVE);
	//  421 1038:aload_1         
	//  422 1039:getstatic       #360 <Field com.itextpdf.text.pdf.PdfDiv$PositionType com.itextpdf.text.pdf.PdfDiv$PositionType.RELATIVE>
	//  423 1042:invokevirtual   #350 <Method void PdfDiv.setPosition(com.itextpdf.text.pdf.PdfDiv$PositionType)>
				} else
	//* 424 1045:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("display"))
	//* 425 1048:aload           4
	//* 426 1050:ldc2            #362 <String "display">
	//* 427 1053:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 428 1056:ifeq            1395
				{
					if(((String) (obj)).equalsIgnoreCase("block"))
	//* 429 1059:aload           8
	//* 430 1061:ldc2            #364 <String "block">
	//* 431 1064:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 432 1067:ifeq            1080
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.BLOCK);
	//  433 1070:aload_1         
	//  434 1071:getstatic       #370 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.BLOCK>
	//  435 1074:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 436 1077:goto            276
					if(((String) (obj)).equalsIgnoreCase("inline"))
	//* 437 1080:aload           8
	//* 438 1082:ldc2            #376 <String "inline">
	//* 439 1085:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 440 1088:ifeq            1101
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.INLINE);
	//  441 1091:aload_1         
	//  442 1092:getstatic       #379 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.INLINE>
	//  443 1095:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 444 1098:goto            276
					if(((String) (obj)).equalsIgnoreCase("inline-block"))
	//* 445 1101:aload           8
	//* 446 1103:ldc2            #381 <String "inline-block">
	//* 447 1106:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 448 1109:ifeq            1122
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.INLINE_BLOCK);
	//  449 1112:aload_1         
	//  450 1113:getstatic       #384 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.INLINE_BLOCK>
	//  451 1116:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 452 1119:goto            276
					if(((String) (obj)).equalsIgnoreCase("inline-table"))
	//* 453 1122:aload           8
	//* 454 1124:ldc2            #386 <String "inline-table">
	//* 455 1127:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 456 1130:ifeq            1143
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.INLINE_TABLE);
	//  457 1133:aload_1         
	//  458 1134:getstatic       #389 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.INLINE_TABLE>
	//  459 1137:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 460 1140:goto            276
					if(((String) (obj)).equalsIgnoreCase("list-item"))
	//* 461 1143:aload           8
	//* 462 1145:ldc2            #391 <String "list-item">
	//* 463 1148:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 464 1151:ifeq            1164
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.LIST_ITEM);
	//  465 1154:aload_1         
	//  466 1155:getstatic       #394 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.LIST_ITEM>
	//  467 1158:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 468 1161:goto            276
					if(((String) (obj)).equalsIgnoreCase("none"))
	//* 469 1164:aload           8
	//* 470 1166:ldc2            #396 <String "none">
	//* 471 1169:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 472 1172:ifeq            1185
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.NONE);
	//  473 1175:aload_1         
	//  474 1176:getstatic       #399 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.NONE>
	//  475 1179:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 476 1182:goto            276
					if(((String) (obj)).equalsIgnoreCase("run-in"))
	//* 477 1185:aload           8
	//* 478 1187:ldc2            #401 <String "run-in">
	//* 479 1190:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 480 1193:ifeq            1206
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.RUN_IN);
	//  481 1196:aload_1         
	//  482 1197:getstatic       #404 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.RUN_IN>
	//  483 1200:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 484 1203:goto            276
					if(((String) (obj)).equalsIgnoreCase("table"))
	//* 485 1206:aload           8
	//* 486 1208:ldc2            #406 <String "table">
	//* 487 1211:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 488 1214:ifeq            1227
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE);
	//  489 1217:aload_1         
	//  490 1218:getstatic       #409 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE>
	//  491 1221:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 492 1224:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-caption"))
	//* 493 1227:aload           8
	//* 494 1229:ldc2            #411 <String "table-caption">
	//* 495 1232:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 496 1235:ifeq            1248
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_CAPTION);
	//  497 1238:aload_1         
	//  498 1239:getstatic       #414 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_CAPTION>
	//  499 1242:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 500 1245:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-cell"))
	//* 501 1248:aload           8
	//* 502 1250:ldc2            #416 <String "table-cell">
	//* 503 1253:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 504 1256:ifeq            1269
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_CELL);
	//  505 1259:aload_1         
	//  506 1260:getstatic       #419 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_CELL>
	//  507 1263:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 508 1266:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-column-group"))
	//* 509 1269:aload           8
	//* 510 1271:ldc2            #421 <String "table-column-group">
	//* 511 1274:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 512 1277:ifeq            1290
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_COLUMN_GROUP);
	//  513 1280:aload_1         
	//  514 1281:getstatic       #424 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_COLUMN_GROUP>
	//  515 1284:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 516 1287:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-column"))
	//* 517 1290:aload           8
	//* 518 1292:ldc2            #426 <String "table-column">
	//* 519 1295:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 520 1298:ifeq            1311
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_COLUMN);
	//  521 1301:aload_1         
	//  522 1302:getstatic       #429 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_COLUMN>
	//  523 1305:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 524 1308:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-footer-group"))
	//* 525 1311:aload           8
	//* 526 1313:ldc2            #431 <String "table-footer-group">
	//* 527 1316:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 528 1319:ifeq            1332
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_FOOTER_GROUP);
	//  529 1322:aload_1         
	//  530 1323:getstatic       #434 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_FOOTER_GROUP>
	//  531 1326:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 532 1329:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-header-group"))
	//* 533 1332:aload           8
	//* 534 1334:ldc2            #436 <String "table-header-group">
	//* 535 1337:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 536 1340:ifeq            1353
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_HEADER_GROUP);
	//  537 1343:aload_1         
	//  538 1344:getstatic       #439 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_HEADER_GROUP>
	//  539 1347:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 540 1350:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-row"))
	//* 541 1353:aload           8
	//* 542 1355:ldc2            #441 <String "table-row">
	//* 543 1358:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 544 1361:ifeq            1374
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_ROW);
	//  545 1364:aload_1         
	//  546 1365:getstatic       #444 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_ROW>
	//  547 1368:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
					else
	//* 548 1371:goto            276
					if(((String) (obj)).equalsIgnoreCase("table-row-group"))
	//* 549 1374:aload           8
	//* 550 1376:ldc2            #446 <String "table-row-group">
	//* 551 1379:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 552 1382:ifeq            276
						pdfdiv.setDisplay(com.itextpdf.text.pdf.PdfDiv.DisplayType.TABLE_ROW_GROUP);
	//  553 1385:aload_1         
	//  554 1386:getstatic       #449 <Field com.itextpdf.text.pdf.PdfDiv$DisplayType com.itextpdf.text.pdf.PdfDiv$DisplayType.TABLE_ROW_GROUP>
	//  555 1389:invokevirtual   #374 <Method void PdfDiv.setDisplay(com.itextpdf.text.pdf.PdfDiv$DisplayType)>
				} else
	//* 556 1392:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("border-top-style"))
	//* 557 1395:aload           4
	//* 558 1397:ldc2            #451 <String "border-top-style">
	//* 559 1400:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 560 1403:ifeq            1574
				{
					if(((String) (obj)).equalsIgnoreCase("dotted"))
	//* 561 1406:aload           8
	//* 562 1408:ldc2            #453 <String "dotted">
	//* 563 1411:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 564 1414:ifeq            1427
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.DOTTED);
	//  565 1417:aload_1         
	//  566 1418:getstatic       #459 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.DOTTED>
	//  567 1421:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
					else
	//* 568 1424:goto            276
					if(((String) (obj)).equalsIgnoreCase("dashed"))
	//* 569 1427:aload           8
	//* 570 1429:ldc2            #465 <String "dashed">
	//* 571 1432:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 572 1435:ifeq            1448
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.DASHED);
	//  573 1438:aload_1         
	//  574 1439:getstatic       #468 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.DASHED>
	//  575 1442:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
					else
	//* 576 1445:goto            276
					if(((String) (obj)).equalsIgnoreCase("solid"))
	//* 577 1448:aload           8
	//* 578 1450:ldc2            #470 <String "solid">
	//* 579 1453:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 580 1456:ifeq            1469
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.SOLID);
	//  581 1459:aload_1         
	//  582 1460:getstatic       #473 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.SOLID>
	//  583 1463:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
					else
	//* 584 1466:goto            276
					if(((String) (obj)).equalsIgnoreCase("double"))
	//* 585 1469:aload           8
	//* 586 1471:ldc2            #475 <String "double">
	//* 587 1474:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 588 1477:ifeq            1490
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.DOUBLE);
	//  589 1480:aload_1         
	//  590 1481:getstatic       #478 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.DOUBLE>
	//  591 1484:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
					else
	//* 592 1487:goto            276
					if(((String) (obj)).equalsIgnoreCase("groove"))
	//* 593 1490:aload           8
	//* 594 1492:ldc2            #480 <String "groove">
	//* 595 1495:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 596 1498:ifeq            1511
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.GROOVE);
	//  597 1501:aload_1         
	//  598 1502:getstatic       #483 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.GROOVE>
	//  599 1505:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
					else
	//* 600 1508:goto            276
					if(((String) (obj)).equalsIgnoreCase("ridge"))
	//* 601 1511:aload           8
	//* 602 1513:ldc2            #485 <String "ridge">
	//* 603 1516:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 604 1519:ifeq            1532
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.RIDGE);
	//  605 1522:aload_1         
	//  606 1523:getstatic       #488 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.RIDGE>
	//  607 1526:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
					else
	//* 608 1529:goto            276
					if(((String) (obj)).equalsIgnoreCase("inset"))
	//* 609 1532:aload           8
	//* 610 1534:ldc2            #490 <String "inset">
	//* 611 1537:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 612 1540:ifeq            1553
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.INSET);
	//  613 1543:aload_1         
	//  614 1544:getstatic       #493 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.INSET>
	//  615 1547:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
					else
	//* 616 1550:goto            276
					if(((String) (obj)).equalsIgnoreCase("outset"))
	//* 617 1553:aload           8
	//* 618 1555:ldc2            #495 <String "outset">
	//* 619 1558:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 620 1561:ifeq            276
						pdfdiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv.BorderTopStyle.OUTSET);
	//  621 1564:aload_1         
	//  622 1565:getstatic       #498 <Field com.itextpdf.text.pdf.PdfDiv$BorderTopStyle com.itextpdf.text.pdf.PdfDiv$BorderTopStyle.OUTSET>
	//  623 1568:invokevirtual   #463 <Method void PdfDiv.setBorderTopStyle(com.itextpdf.text.pdf.PdfDiv$BorderTopStyle)>
				} else
	//* 624 1571:goto            276
				if(((String) (pagesizecontainable)).equalsIgnoreCase("page-break-inside") && ((String) (obj)).equalsIgnoreCase("avoid"))
	//* 625 1574:aload           4
	//* 626 1576:ldc2            #500 <String "page-break-inside">
	//* 627 1579:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 628 1582:ifeq            276
	//* 629 1585:aload           8
	//* 630 1587:ldc2            #502 <String "avoid">
	//* 631 1590:invokevirtual   #167 <Method boolean String.equalsIgnoreCase(String)>
	//* 632 1593:ifeq            276
					pdfdiv.setKeepTogether(true);
	//  633 1596:aload_1         
	//  634 1597:iconst_1        
	//  635 1598:invokevirtual   #506 <Method void PdfDiv.setKeepTogether(boolean)>
			}

	//* 636 1601:goto            276
			return pdfdiv;
	//  637 1604:aload_1         
	//  638 1605:areturn         
		} while(true);
	}

	private static final Logger LOG = LoggerFactory.getLogger(com/itextpdf/tool/xml/css/apply/ListStyleTypeCssApplier);
	private final CssUtils utils = CssUtils.getInstance();

	static 
	{
	//    0    0:ldc1            #15  <Class ListStyleTypeCssApplier>
	//    1    2:invokestatic    #21  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #23  <Field Logger LOG>
	//*   3    8:return          
	}
}
