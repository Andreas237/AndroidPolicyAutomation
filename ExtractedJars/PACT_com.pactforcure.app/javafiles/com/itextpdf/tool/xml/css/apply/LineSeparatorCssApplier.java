// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.*;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			PageSizeContainable, MarginMemory

public class LineSeparatorCssApplier
	implements CssApplier
{

	public LineSeparatorCssApplier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((LineSeparator)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class LineSeparator>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #19  <Method LineSeparator apply(LineSeparator, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public LineSeparator apply(LineSeparator lineseparator, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		float f;
		f = 1.0F;
	//    0    0:fconst_1        
	//    1    1:fstore          6
		htmlpipelinecontext = ((HtmlPipelineContext) (tag.getCSS()));
	//    2    3:aload_2         
	//    3    4:invokevirtual   #25  <Method Map Tag.getCSS()>
	//    4    7:astore          5
		if(tag.getAttributes().get("size") == null) goto _L2; else goto _L1
	//    5    9:aload_2         
	//    6   10:invokevirtual   #28  <Method Map Tag.getAttributes()>
	//    7   13:ldc1            #30  <String "size">
	//    8   15:invokeinterface #36  <Method Object Map.get(Object)>
	//    9   20:ifnull          196
_L1:
		f = CssUtils.getInstance().parsePxInCmMmPcToPt((String)tag.getAttributes().get("size"));
	//   10   23:invokestatic    #42  <Method CssUtils CssUtils.getInstance()>
	//   11   26:aload_2         
	//   12   27:invokevirtual   #28  <Method Map Tag.getAttributes()>
	//   13   30:ldc1            #30  <String "size">
	//   14   32:invokeinterface #36  <Method Object Map.get(Object)>
	//   15   37:checkcast       #44  <Class String>
	//   16   40:invokevirtual   #48  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//   17   43:fstore          6
_L8:
		lineseparator.setLineWidth(f);
	//   18   45:aload_1         
	//   19   46:fload           6
	//   20   48:invokevirtual   #52  <Method void LineSeparator.setLineWidth(float)>
		marginmemory = ((MarginMemory) (BaseColor.BLACK));
	//   21   51:getstatic       #58  <Field BaseColor BaseColor.BLACK>
	//   22   54:astore_3        
		if(tag.getAttributes().get("color") != null)
	//*  23   55:aload_2         
	//*  24   56:invokevirtual   #28  <Method Map Tag.getAttributes()>
	//*  25   59:ldc1            #60  <String "color">
	//*  26   61:invokeinterface #36  <Method Object Map.get(Object)>
	//*  27   66:ifnull          231
			marginmemory = ((MarginMemory) (HtmlUtilities.decodeColor((String)tag.getAttributes().get("color"))));
	//   28   69:aload_2         
	//   29   70:invokevirtual   #28  <Method Map Tag.getAttributes()>
	//   30   73:ldc1            #60  <String "color">
	//   31   75:invokeinterface #36  <Method Object Map.get(Object)>
	//   32   80:checkcast       #44  <Class String>
	//   33   83:invokestatic    #66  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//   34   86:astore_3        
		else
	//*  35   87:aload_1         
	//*  36   88:aload_3         
	//*  37   89:invokevirtual   #70  <Method void LineSeparator.setLineColor(BaseColor)>
	//*  38   92:ldc1            #71  <Float 100F>
	//*  39   94:fstore          6
	//*  40   96:aload           5
	//*  41   98:ldc1            #73  <String "width">
	//*  42  100:invokeinterface #36  <Method Object Map.get(Object)>
	//*  43  105:checkcast       #44  <Class String>
	//*  44  108:astore          5
	//*  45  110:aload           5
	//*  46  112:astore_3        
	//*  47  113:aload           5
	//*  48  115:ifnonnull       133
	//*  49  118:aload_2         
	//*  50  119:invokevirtual   #28  <Method Map Tag.getAttributes()>
	//*  51  122:ldc1            #73  <String "width">
	//*  52  124:invokeinterface #36  <Method Object Map.get(Object)>
	//*  53  129:checkcast       #44  <Class String>
	//*  54  132:astore_3        
	//*  55  133:aload_3         
	//*  56  134:ifnull          159
	//*  57  137:aload_3         
	//*  58  138:ldc1            #75  <String "%">
	//*  59  140:invokevirtual   #79  <Method boolean String.contains(CharSequence)>
	//*  60  143:ifeq            293
	//*  61  146:aload_3         
	//*  62  147:ldc1            #75  <String "%">
	//*  63  149:ldc1            #81  <String "">
	//*  64  151:invokevirtual   #85  <Method String String.replace(CharSequence, CharSequence)>
	//*  65  154:invokestatic    #90  <Method float Float.parseFloat(String)>
	//*  66  157:fstore          6
	//*  67  159:aload_1         
	//*  68  160:fload           6
	//*  69  162:invokevirtual   #93  <Method void LineSeparator.setPercentage(float)>
	//*  70  165:aload_2         
	//*  71  166:invokevirtual   #28  <Method Map Tag.getAttributes()>
	//*  72  169:ldc1            #95  <String "align">
	//*  73  171:invokeinterface #36  <Method Object Map.get(Object)>
	//*  74  176:checkcast       #44  <Class String>
	//*  75  179:astore_2        
	//*  76  180:ldc1            #97  <String "right">
	//*  77  182:aload_2         
	//*  78  183:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  79  186:ifeq            319
	//*  80  189:aload_1         
	//*  81  190:iconst_2        
	//*  82  191:invokevirtual   #105 <Method void LineSeparator.setAlignment(int)>
	//*  83  194:aload_1         
	//*  84  195:areturn         
	//*  85  196:aload           5
	//*  86  198:ldc1            #107 <String "height">
	//*  87  200:invokeinterface #36  <Method Object Map.get(Object)>
	//*  88  205:ifnull          45
	//*  89  208:invokestatic    #42  <Method CssUtils CssUtils.getInstance()>
	//*  90  211:aload           5
	//*  91  213:ldc1            #107 <String "height">
	//*  92  215:invokeinterface #36  <Method Object Map.get(Object)>
	//*  93  220:checkcast       #44  <Class String>
	//*  94  223:invokevirtual   #48  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//*  95  226:fstore          6
	//*  96  228:goto            45
		if(((Map) (htmlpipelinecontext)).get("color") != null)
	//*  97  231:aload           5
	//*  98  233:ldc1            #60  <String "color">
	//*  99  235:invokeinterface #36  <Method Object Map.get(Object)>
	//* 100  240:ifnull          262
			marginmemory = ((MarginMemory) (HtmlUtilities.decodeColor((String)((Map) (htmlpipelinecontext)).get("color"))));
	//  101  243:aload           5
	//  102  245:ldc1            #60  <String "color">
	//  103  247:invokeinterface #36  <Method Object Map.get(Object)>
	//  104  252:checkcast       #44  <Class String>
	//  105  255:invokestatic    #66  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//  106  258:astore_3        
		else
	//* 107  259:goto            87
		if(((Map) (htmlpipelinecontext)).get("background-color") != null)
	//* 108  262:aload           5
	//* 109  264:ldc1            #109 <String "background-color">
	//* 110  266:invokeinterface #36  <Method Object Map.get(Object)>
	//* 111  271:ifnull          87
			marginmemory = ((MarginMemory) (HtmlUtilities.decodeColor((String)((Map) (htmlpipelinecontext)).get("background-color"))));
	//  112  274:aload           5
	//  113  276:ldc1            #109 <String "background-color">
	//  114  278:invokeinterface #36  <Method Object Map.get(Object)>
	//  115  283:checkcast       #44  <Class String>
	//  116  286:invokestatic    #66  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//  117  289:astore_3        
		lineseparator.setLineColor(((BaseColor) (marginmemory)));
		f = 100F;
		htmlpipelinecontext = ((HtmlPipelineContext) ((String)((Map) (htmlpipelinecontext)).get("width")));
		marginmemory = ((MarginMemory) (htmlpipelinecontext));
		if(htmlpipelinecontext == null)
			marginmemory = ((MarginMemory) ((String)tag.getAttributes().get("width")));
		if(marginmemory != null)
			if(((String) (marginmemory)).contains("%"))
				f = Float.parseFloat(((String) (marginmemory)).replace("%", ""));
			else
	//* 118  290:goto            87
				f = (CssUtils.getInstance().parsePxInCmMmPcToPt(((String) (marginmemory))) / pagesizecontainable.getPageSize().getWidth()) * 100F;
	//  119  293:invokestatic    #42  <Method CssUtils CssUtils.getInstance()>
	//  120  296:aload_3         
	//  121  297:invokevirtual   #48  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  122  300:aload           4
	//  123  302:invokeinterface #115 <Method Rectangle PageSizeContainable.getPageSize()>
	//  124  307:invokevirtual   #121 <Method float Rectangle.getWidth()>
	//  125  310:fdiv            
	//  126  311:ldc1            #71  <Float 100F>
	//  127  313:fmul            
	//  128  314:fstore          6
		lineseparator.setPercentage(f);
		tag = ((Tag) ((String)tag.getAttributes().get("align")));
		if(!"right".equals(((Object) (tag)))) goto _L4; else goto _L3
_L3:
		lineseparator.setAlignment(2);
_L6:
		return lineseparator;
_L2:
		if(((Map) (htmlpipelinecontext)).get("height") != null)
			f = CssUtils.getInstance().parsePxInCmMmPcToPt((String)((Map) (htmlpipelinecontext)).get("height"));
		continue; /* Loop/switch isn't completed */
	//* 129  316:goto            159
_L4:
		if("left".equals(((Object) (tag))))
	//* 130  319:ldc1            #123 <String "left">
	//* 131  321:aload_2         
	//* 132  322:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 133  325:ifeq            335
		{
			lineseparator.setAlignment(0);
	//  134  328:aload_1         
	//  135  329:iconst_0        
	//  136  330:invokevirtual   #105 <Method void LineSeparator.setAlignment(int)>
			return lineseparator;
	//  137  333:aload_1         
	//  138  334:areturn         
		}
		if(!"center".equals(((Object) (tag)))) goto _L6; else goto _L5
	//  139  335:ldc1            #125 <String "center">
	//  140  337:aload_2         
	//  141  338:invokevirtual   #101 <Method boolean String.equals(Object)>
	//  142  341:ifeq            194
_L5:
		lineseparator.setAlignment(1);
	//  143  344:aload_1         
	//  144  345:iconst_1        
	//  145  346:invokevirtual   #105 <Method void LineSeparator.setAlignment(int)>
		return lineseparator;
	//  146  349:aload_1         
	//  147  350:areturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public LineSeparator apply(LineSeparator lineseparator, Tag tag, PageSizeContainable pagesizecontainable)
	{
		return apply(lineseparator, tag, ((MarginMemory) (null)), pagesizecontainable, ((HtmlPipelineContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #19  <Method LineSeparator apply(LineSeparator, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}
}
