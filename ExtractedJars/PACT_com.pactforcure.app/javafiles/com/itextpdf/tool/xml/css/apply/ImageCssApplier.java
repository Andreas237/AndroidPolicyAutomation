// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			MarginMemory, PageSizeContainable

public class ImageCssApplier
	implements CssApplier
{

	public ImageCssApplier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((Image)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class Image>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #19  <Method Image apply(Image, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public Image apply(Image image, Tag tag)
	{
		return apply(image, tag, ((MarginMemory) (null)), ((PageSizeContainable) (null)), ((HtmlPipelineContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #19  <Method Image apply(Image, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}

	public Image apply(Image image, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		float f;
		float f1;
		Map map = tag.getCSS();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #26  <Method Map Tag.getCSS()>
	//    2    4:astore          8
		pagesizecontainable = ((PageSizeContainable) ((String)map.get("width")));
	//    3    6:aload           8
	//    4    8:ldc1            #28  <String "width">
	//    5   10:invokeinterface #34  <Method Object Map.get(Object)>
	//    6   15:checkcast       #36  <Class String>
	//    7   18:astore          4
		marginmemory = ((MarginMemory) (pagesizecontainable));
	//    8   20:aload           4
	//    9   22:astore_3        
		if(pagesizecontainable == null)
	//*  10   23:aload           4
	//*  11   25:ifnonnull       43
			marginmemory = ((MarginMemory) ((String)tag.getAttributes().get("width")));
	//   12   28:aload_2         
	//   13   29:invokevirtual   #39  <Method Map Tag.getAttributes()>
	//   14   32:ldc1            #28  <String "width">
	//   15   34:invokeinterface #34  <Method Object Map.get(Object)>
	//   16   39:checkcast       #36  <Class String>
	//   17   42:astore_3        
		htmlpipelinecontext = ((HtmlPipelineContext) ((String)map.get("height")));
	//   18   43:aload           8
	//   19   45:ldc1            #41  <String "height">
	//   20   47:invokeinterface #34  <Method Object Map.get(Object)>
	//   21   52:checkcast       #36  <Class String>
	//   22   55:astore          5
		pagesizecontainable = ((PageSizeContainable) (htmlpipelinecontext));
	//   23   57:aload           5
	//   24   59:astore          4
		if(htmlpipelinecontext == null)
	//*  25   61:aload           5
	//*  26   63:ifnonnull       82
			pagesizecontainable = ((PageSizeContainable) ((String)tag.getAttributes().get("height")));
	//   27   66:aload_2         
	//   28   67:invokevirtual   #39  <Method Map Tag.getAttributes()>
	//   29   70:ldc1            #41  <String "height">
	//   30   72:invokeinterface #34  <Method Object Map.get(Object)>
	//   31   77:checkcast       #36  <Class String>
	//   32   80:astore          4
		if(marginmemory == null)
	//*  33   82:aload_3         
	//*  34   83:ifnonnull       402
			image.setScaleToFitLineWhenOverflow(true);
	//   35   86:aload_1         
	//   36   87:iconst_1        
	//   37   88:invokevirtual   #45  <Method void Image.setScaleToFitLineWhenOverflow(boolean)>
		else
	//*  38   91:aload_1         
	//*  39   92:iconst_0        
	//*  40   93:invokevirtual   #48  <Method void Image.setScaleToFitHeight(boolean)>
	//*  41   96:invokestatic    #54  <Method CssUtils CssUtils.getInstance()>
	//*  42   99:astore_2        
	//*  43  100:aload_2         
	//*  44  101:aload_3         
	//*  45  102:invokevirtual   #58  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//*  46  105:fstore          6
	//*  47  107:aload_2         
	//*  48  108:aload           4
	//*  49  110:invokevirtual   #58  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//*  50  113:fstore          7
	//*  51  115:fload           6
	//*  52  117:fconst_0        
	//*  53  118:fcmpl           
	//*  54  119:ifle            410
	//*  55  122:fload           7
	//*  56  124:fconst_0        
	//*  57  125:fcmpl           
	//*  58  126:ifle            410
	//*  59  129:aload_1         
	//*  60  130:fload           6
	//*  61  132:fload           7
	//*  62  134:invokevirtual   #62  <Method void Image.scaleAbsolute(float, float)>
	//*  63  137:aload           8
	//*  64  139:ldc1            #64  <String "border-top-color">
	//*  65  141:invokeinterface #34  <Method Object Map.get(Object)>
	//*  66  146:checkcast       #36  <Class String>
	//*  67  149:astore_3        
	//*  68  150:aload_3         
	//*  69  151:ifnull          162
	//*  70  154:aload_1         
	//*  71  155:aload_3         
	//*  72  156:invokestatic    #70  <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//*  73  159:invokevirtual   #74  <Method void Image.setBorderColorTop(com.itextpdf.text.BaseColor)>
	//*  74  162:aload           8
	//*  75  164:ldc1            #76  <String "border-top-width">
	//*  76  166:invokeinterface #34  <Method Object Map.get(Object)>
	//*  77  171:checkcast       #36  <Class String>
	//*  78  174:astore_3        
	//*  79  175:aload_3         
	//*  80  176:ifnull          189
	//*  81  179:aload_1         
	//*  82  180:aload_2         
	//*  83  181:aload_3         
	//*  84  182:fconst_1        
	//*  85  183:invokevirtual   #80  <Method float CssUtils.parseValueToPt(String, float)>
	//*  86  186:invokevirtual   #84  <Method void Image.setBorderWidthTop(float)>
	//*  87  189:aload           8
	//*  88  191:ldc1            #86  <String "border-right-color">
	//*  89  193:invokeinterface #34  <Method Object Map.get(Object)>
	//*  90  198:checkcast       #36  <Class String>
	//*  91  201:astore_3        
	//*  92  202:aload_3         
	//*  93  203:ifnull          214
	//*  94  206:aload_1         
	//*  95  207:aload_3         
	//*  96  208:invokestatic    #70  <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//*  97  211:invokevirtual   #89  <Method void Image.setBorderColorRight(com.itextpdf.text.BaseColor)>
	//*  98  214:aload           8
	//*  99  216:ldc1            #91  <String "border-right-width">
	//* 100  218:invokeinterface #34  <Method Object Map.get(Object)>
	//* 101  223:checkcast       #36  <Class String>
	//* 102  226:astore_3        
	//* 103  227:aload_3         
	//* 104  228:ifnull          241
	//* 105  231:aload_1         
	//* 106  232:aload_2         
	//* 107  233:aload_3         
	//* 108  234:fconst_1        
	//* 109  235:invokevirtual   #80  <Method float CssUtils.parseValueToPt(String, float)>
	//* 110  238:invokevirtual   #94  <Method void Image.setBorderWidthRight(float)>
	//* 111  241:aload           8
	//* 112  243:ldc1            #96  <String "border-bottom-color">
	//* 113  245:invokeinterface #34  <Method Object Map.get(Object)>
	//* 114  250:checkcast       #36  <Class String>
	//* 115  253:astore_3        
	//* 116  254:aload_3         
	//* 117  255:ifnull          266
	//* 118  258:aload_1         
	//* 119  259:aload_3         
	//* 120  260:invokestatic    #70  <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//* 121  263:invokevirtual   #99  <Method void Image.setBorderColorBottom(com.itextpdf.text.BaseColor)>
	//* 122  266:aload           8
	//* 123  268:ldc1            #101 <String "border-bottom-width">
	//* 124  270:invokeinterface #34  <Method Object Map.get(Object)>
	//* 125  275:checkcast       #36  <Class String>
	//* 126  278:astore_3        
	//* 127  279:aload_3         
	//* 128  280:ifnull          293
	//* 129  283:aload_1         
	//* 130  284:aload_2         
	//* 131  285:aload_3         
	//* 132  286:fconst_1        
	//* 133  287:invokevirtual   #80  <Method float CssUtils.parseValueToPt(String, float)>
	//* 134  290:invokevirtual   #104 <Method void Image.setBorderWidthBottom(float)>
	//* 135  293:aload           8
	//* 136  295:ldc1            #106 <String "border-left-color">
	//* 137  297:invokeinterface #34  <Method Object Map.get(Object)>
	//* 138  302:checkcast       #36  <Class String>
	//* 139  305:astore_3        
	//* 140  306:aload_3         
	//* 141  307:ifnull          318
	//* 142  310:aload_1         
	//* 143  311:aload_3         
	//* 144  312:invokestatic    #70  <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//* 145  315:invokevirtual   #109 <Method void Image.setBorderColorLeft(com.itextpdf.text.BaseColor)>
	//* 146  318:aload           8
	//* 147  320:ldc1            #111 <String "border-left-width">
	//* 148  322:invokeinterface #34  <Method Object Map.get(Object)>
	//* 149  327:checkcast       #36  <Class String>
	//* 150  330:astore_3        
	//* 151  331:aload_3         
	//* 152  332:ifnull          345
	//* 153  335:aload_1         
	//* 154  336:aload_2         
	//* 155  337:aload_3         
	//* 156  338:fconst_1        
	//* 157  339:invokevirtual   #80  <Method float CssUtils.parseValueToPt(String, float)>
	//* 158  342:invokevirtual   #114 <Method void Image.setBorderWidthLeft(float)>
	//* 159  345:aload           8
	//* 160  347:ldc1            #116 <String "before">
	//* 161  349:invokeinterface #34  <Method Object Map.get(Object)>
	//* 162  354:checkcast       #36  <Class String>
	//* 163  357:astore_2        
	//* 164  358:aload_2         
	//* 165  359:ifnull          370
	//* 166  362:aload_1         
	//* 167  363:aload_2         
	//* 168  364:invokestatic    #121 <Method float Float.parseFloat(String)>
	//* 169  367:invokevirtual   #124 <Method void Image.setSpacingBefore(float)>
	//* 170  370:aload           8
	//* 171  372:ldc1            #126 <String "after">
	//* 172  374:invokeinterface #34  <Method Object Map.get(Object)>
	//* 173  379:checkcast       #36  <Class String>
	//* 174  382:astore_2        
	//* 175  383:aload_2         
	//* 176  384:ifnull          395
	//* 177  387:aload_1         
	//* 178  388:aload_2         
	//* 179  389:invokestatic    #121 <Method float Float.parseFloat(String)>
	//* 180  392:invokevirtual   #129 <Method void Image.setSpacingAfter(float)>
	//* 181  395:aload_1         
	//* 182  396:fconst_0        
	//* 183  397:invokevirtual   #132 <Method void Image.setWidthPercentage(float)>
	//* 184  400:aload_1         
	//* 185  401:areturn         
			image.setScaleToFitLineWhenOverflow(false);
	//  186  402:aload_1         
	//  187  403:iconst_0        
	//  188  404:invokevirtual   #45  <Method void Image.setScaleToFitLineWhenOverflow(boolean)>
		image.setScaleToFitHeight(false);
		tag = ((Tag) (CssUtils.getInstance()));
		f = ((CssUtils) (tag)).parsePxInCmMmPcToPt(((String) (marginmemory)));
		f1 = ((CssUtils) (tag)).parsePxInCmMmPcToPt(((String) (pagesizecontainable)));
		if(f <= 0.0F || f1 <= 0.0F) goto _L2; else goto _L1
_L1:
		image.scaleAbsolute(f, f1);
_L4:
		marginmemory = ((MarginMemory) ((String)map.get("border-top-color")));
		if(marginmemory != null)
			image.setBorderColorTop(HtmlUtilities.decodeColor(((String) (marginmemory))));
		marginmemory = ((MarginMemory) ((String)map.get("border-top-width")));
		if(marginmemory != null)
			image.setBorderWidthTop(((CssUtils) (tag)).parseValueToPt(((String) (marginmemory)), 1.0F));
		marginmemory = ((MarginMemory) ((String)map.get("border-right-color")));
		if(marginmemory != null)
			image.setBorderColorRight(HtmlUtilities.decodeColor(((String) (marginmemory))));
		marginmemory = ((MarginMemory) ((String)map.get("border-right-width")));
		if(marginmemory != null)
			image.setBorderWidthRight(((CssUtils) (tag)).parseValueToPt(((String) (marginmemory)), 1.0F));
		marginmemory = ((MarginMemory) ((String)map.get("border-bottom-color")));
		if(marginmemory != null)
			image.setBorderColorBottom(HtmlUtilities.decodeColor(((String) (marginmemory))));
		marginmemory = ((MarginMemory) ((String)map.get("border-bottom-width")));
		if(marginmemory != null)
			image.setBorderWidthBottom(((CssUtils) (tag)).parseValueToPt(((String) (marginmemory)), 1.0F));
		marginmemory = ((MarginMemory) ((String)map.get("border-left-color")));
		if(marginmemory != null)
			image.setBorderColorLeft(HtmlUtilities.decodeColor(((String) (marginmemory))));
		marginmemory = ((MarginMemory) ((String)map.get("border-left-width")));
		if(marginmemory != null)
			image.setBorderWidthLeft(((CssUtils) (tag)).parseValueToPt(((String) (marginmemory)), 1.0F));
		tag = ((Tag) ((String)map.get("before")));
		if(tag != null)
			image.setSpacingBefore(Float.parseFloat(((String) (tag))));
		tag = ((Tag) ((String)map.get("after")));
		if(tag != null)
			image.setSpacingAfter(Float.parseFloat(((String) (tag))));
		image.setWidthPercentage(0.0F);
		return image;
	//* 189  407:goto            91
_L2:
		if(f > 0.0F)
	//* 190  410:fload           6
	//* 191  412:fconst_0        
	//* 192  413:fcmpl           
	//* 193  414:ifle            438
			image.scaleAbsolute(f, (image.getHeight() * f) / image.getWidth());
	//  194  417:aload_1         
	//  195  418:fload           6
	//  196  420:aload_1         
	//  197  421:invokevirtual   #136 <Method float Image.getHeight()>
	//  198  424:fload           6
	//  199  426:fmul            
	//  200  427:aload_1         
	//  201  428:invokevirtual   #139 <Method float Image.getWidth()>
	//  202  431:fdiv            
	//  203  432:invokevirtual   #62  <Method void Image.scaleAbsolute(float, float)>
		else
	//* 204  435:goto            137
		if(f1 > 0.0F)
	//* 205  438:fload           7
	//* 206  440:fconst_0        
	//* 207  441:fcmpl           
	//* 208  442:ifle            137
			image.scaleAbsolute((image.getWidth() * f1) / image.getHeight(), f1);
	//  209  445:aload_1         
	//  210  446:aload_1         
	//  211  447:invokevirtual   #139 <Method float Image.getWidth()>
	//  212  450:fload           7
	//  213  452:fmul            
	//  214  453:aload_1         
	//  215  454:invokevirtual   #136 <Method float Image.getHeight()>
	//  216  457:fdiv            
	//  217  458:fload           7
	//  218  460:invokevirtual   #62  <Method void Image.scaleAbsolute(float, float)>
		if(true) goto _L4; else goto _L3
	//  219  463:goto            137
_L3:
	}
}
