// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.*;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.*;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.html.pdfelement.HtmlCell;
import com.itextpdf.tool.xml.html.table.*;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			MarginMemory, PageSizeContainable

public class HtmlCellCssApplier
	implements CssApplier
{

	public HtmlCellCssApplier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #19  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #21  <Field CssUtils utils>
	//    5   11:return          
	}

	private void setBottomOfBorder(HtmlCell htmlcell, String s, String s1, TableStyleValues tablestylevalues)
	{
		if(s.contains("width"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #26  <String "width">
	//*   2    3:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            22
			tablestylevalues.setBorderWidthBottom(utils.parsePxInCmMmPcToPt(s1));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field CssUtils utils>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//    9   19:invokevirtual   #42  <Method void TableStyleValues.setBorderWidthBottom(float)>
		if(!s.contains("color")) goto _L2; else goto _L1
	//   10   22:aload_2         
	//   11   23:ldc1            #44  <String "color">
	//   12   25:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//   13   28:ifeq            66
_L1:
		tablestylevalues.setBorderColorBottom(HtmlUtilities.decodeColor(s1));
	//   14   31:aload           4
	//   15   33:aload_3         
	//   16   34:invokestatic    #50  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//   17   37:invokevirtual   #54  <Method void TableStyleValues.setBorderColorBottom(BaseColor)>
_L4:
		if(s.contains("style") && tablestylevalues.getBorderWidthBottom(false) == null)
	//*  18   40:aload_2         
	//*  19   41:ldc1            #56  <String "style">
	//*  20   43:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*  21   46:ifeq            65
	//*  22   49:aload           4
	//*  23   51:iconst_0        
	//*  24   52:invokevirtual   #60  <Method Float TableStyleValues.getBorderWidthBottom(boolean)>
	//*  25   55:ifnonnull       65
			tablestylevalues.setBorderWidthBottom(2.25F);
	//   26   58:aload           4
	//   27   60:ldc1            #61  <Float 2.25F>
	//   28   62:invokevirtual   #42  <Method void TableStyleValues.setBorderWidthBottom(float)>
		return;
	//   29   65:return          
_L2:
		if(tablestylevalues.getBorderColorBottom() == null)
	//*  30   66:aload           4
	//*  31   68:invokevirtual   #65  <Method BaseColor TableStyleValues.getBorderColorBottom()>
	//*  32   71:ifnonnull       40
			tablestylevalues.setBorderColorBottom(BaseColor.BLACK);
	//   33   74:aload           4
	//   34   76:getstatic       #71  <Field BaseColor BaseColor.BLACK>
	//   35   79:invokevirtual   #54  <Method void TableStyleValues.setBorderColorBottom(BaseColor)>
		if(true) goto _L4; else goto _L3
	//   36   82:goto            40
_L3:
	}

	private void setLeftOfBorder(HtmlCell htmlcell, String s, String s1, TableStyleValues tablestylevalues)
	{
		if(s.contains("width"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #26  <String "width">
	//*   2    3:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            22
			tablestylevalues.setBorderWidthLeft(utils.parsePxInCmMmPcToPt(s1));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field CssUtils utils>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//    9   19:invokevirtual   #75  <Method void TableStyleValues.setBorderWidthLeft(float)>
		if(!s.contains("color")) goto _L2; else goto _L1
	//   10   22:aload_2         
	//   11   23:ldc1            #44  <String "color">
	//   12   25:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//   13   28:ifeq            66
_L1:
		tablestylevalues.setBorderColorLeft(HtmlUtilities.decodeColor(s1));
	//   14   31:aload           4
	//   15   33:aload_3         
	//   16   34:invokestatic    #50  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//   17   37:invokevirtual   #78  <Method void TableStyleValues.setBorderColorLeft(BaseColor)>
_L4:
		if(s.contains("style") && tablestylevalues.getBorderWidthLeft(false) == null)
	//*  18   40:aload_2         
	//*  19   41:ldc1            #56  <String "style">
	//*  20   43:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*  21   46:ifeq            65
	//*  22   49:aload           4
	//*  23   51:iconst_0        
	//*  24   52:invokevirtual   #81  <Method Float TableStyleValues.getBorderWidthLeft(boolean)>
	//*  25   55:ifnonnull       65
			tablestylevalues.setBorderWidthLeft(2.25F);
	//   26   58:aload           4
	//   27   60:ldc1            #61  <Float 2.25F>
	//   28   62:invokevirtual   #75  <Method void TableStyleValues.setBorderWidthLeft(float)>
		return;
	//   29   65:return          
_L2:
		if(tablestylevalues.getBorderColorLeft() == null)
	//*  30   66:aload           4
	//*  31   68:invokevirtual   #84  <Method BaseColor TableStyleValues.getBorderColorLeft()>
	//*  32   71:ifnonnull       40
			tablestylevalues.setBorderColorLeft(BaseColor.BLACK);
	//   33   74:aload           4
	//   34   76:getstatic       #71  <Field BaseColor BaseColor.BLACK>
	//   35   79:invokevirtual   #78  <Method void TableStyleValues.setBorderColorLeft(BaseColor)>
		if(true) goto _L4; else goto _L3
	//   36   82:goto            40
_L3:
	}

	private void setRightOfBorder(HtmlCell htmlcell, String s, String s1, TableStyleValues tablestylevalues)
	{
		if(s.contains("width"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #26  <String "width">
	//*   2    3:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            22
			tablestylevalues.setBorderWidthRight(utils.parsePxInCmMmPcToPt(s1));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field CssUtils utils>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//    9   19:invokevirtual   #88  <Method void TableStyleValues.setBorderWidthRight(float)>
		if(!s.contains("color")) goto _L2; else goto _L1
	//   10   22:aload_2         
	//   11   23:ldc1            #44  <String "color">
	//   12   25:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//   13   28:ifeq            66
_L1:
		tablestylevalues.setBorderColorRight(HtmlUtilities.decodeColor(s1));
	//   14   31:aload           4
	//   15   33:aload_3         
	//   16   34:invokestatic    #50  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//   17   37:invokevirtual   #91  <Method void TableStyleValues.setBorderColorRight(BaseColor)>
_L4:
		if(s.contains("style") && tablestylevalues.getBorderWidthRight(false) == null)
	//*  18   40:aload_2         
	//*  19   41:ldc1            #56  <String "style">
	//*  20   43:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*  21   46:ifeq            65
	//*  22   49:aload           4
	//*  23   51:iconst_0        
	//*  24   52:invokevirtual   #94  <Method Float TableStyleValues.getBorderWidthRight(boolean)>
	//*  25   55:ifnonnull       65
			tablestylevalues.setBorderWidthRight(2.25F);
	//   26   58:aload           4
	//   27   60:ldc1            #61  <Float 2.25F>
	//   28   62:invokevirtual   #88  <Method void TableStyleValues.setBorderWidthRight(float)>
		return;
	//   29   65:return          
_L2:
		if(tablestylevalues.getBorderColorRight() == null)
	//*  30   66:aload           4
	//*  31   68:invokevirtual   #97  <Method BaseColor TableStyleValues.getBorderColorRight()>
	//*  32   71:ifnonnull       40
			tablestylevalues.setBorderColorRight(BaseColor.BLACK);
	//   33   74:aload           4
	//   34   76:getstatic       #71  <Field BaseColor BaseColor.BLACK>
	//   35   79:invokevirtual   #91  <Method void TableStyleValues.setBorderColorRight(BaseColor)>
		if(true) goto _L4; else goto _L3
	//   36   82:goto            40
_L3:
	}

	private void setTopOfBorder(HtmlCell htmlcell, String s, String s1, TableStyleValues tablestylevalues)
	{
		if(s.contains("width"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #26  <String "width">
	//*   2    3:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            22
			tablestylevalues.setBorderWidthTop(utils.parsePxInCmMmPcToPt(s1));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field CssUtils utils>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//    9   19:invokevirtual   #101 <Method void TableStyleValues.setBorderWidthTop(float)>
		if(!s.contains("color")) goto _L2; else goto _L1
	//   10   22:aload_2         
	//   11   23:ldc1            #44  <String "color">
	//   12   25:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//   13   28:ifeq            66
_L1:
		tablestylevalues.setBorderColorTop(HtmlUtilities.decodeColor(s1));
	//   14   31:aload           4
	//   15   33:aload_3         
	//   16   34:invokestatic    #50  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//   17   37:invokevirtual   #104 <Method void TableStyleValues.setBorderColorTop(BaseColor)>
_L4:
		if(s.contains("style") && tablestylevalues.getBorderWidthTop(false) == null)
	//*  18   40:aload_2         
	//*  19   41:ldc1            #56  <String "style">
	//*  20   43:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*  21   46:ifeq            65
	//*  22   49:aload           4
	//*  23   51:iconst_0        
	//*  24   52:invokevirtual   #107 <Method Float TableStyleValues.getBorderWidthTop(boolean)>
	//*  25   55:ifnonnull       65
			tablestylevalues.setBorderWidthTop(2.25F);
	//   26   58:aload           4
	//   27   60:ldc1            #61  <Float 2.25F>
	//   28   62:invokevirtual   #101 <Method void TableStyleValues.setBorderWidthTop(float)>
		return;
	//   29   65:return          
_L2:
		if(tablestylevalues.getBorderColorTop() == null)
	//*  30   66:aload           4
	//*  31   68:invokevirtual   #110 <Method BaseColor TableStyleValues.getBorderColorTop()>
	//*  32   71:ifnonnull       40
			tablestylevalues.setBorderColorTop(BaseColor.BLACK);
	//   33   74:aload           4
	//   34   76:getstatic       #71  <Field BaseColor BaseColor.BLACK>
	//   35   79:invokevirtual   #104 <Method void TableStyleValues.setBorderColorTop(BaseColor)>
		if(true) goto _L4; else goto _L3
	//   36   82:goto            40
_L3:
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((HtmlCell)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #114 <Class HtmlCell>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #117 <Method HtmlCell apply(HtmlCell, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public HtmlCell apply(HtmlCell htmlcell, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable)
	{
		return apply(htmlcell, tag, marginmemory, pagesizecontainable, ((HtmlPipelineContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #117 <Method HtmlCell apply(HtmlCell, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7   10:areturn         
	}

	public HtmlCell apply(HtmlCell htmlcell, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		Tag tag1;
		TableStyleValues tablestylevalues;
		Map map;
		for(tag1 = tag.getParent(); tag1 != null && !tag1.getName().equals("tr"); tag1 = tag1.getParent());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #124 <Method Tag Tag.getParent()>
	//    2    4:astore          6
	//    3    6:aload           6
	//    4    8:ifnull          34
	//    5   11:aload           6
	//    6   13:invokevirtual   #128 <Method String Tag.getName()>
	//    7   16:ldc1            #130 <String "tr">
	//    8   18:invokevirtual   #134 <Method boolean String.equals(Object)>
	//    9   21:ifne            34
	//   10   24:aload           6
	//   11   26:invokevirtual   #124 <Method Tag Tag.getParent()>
	//   12   29:astore          6
	//*  13   31:goto            6
		for(htmlpipelinecontext = ((HtmlPipelineContext) (tag.getParent())); htmlpipelinecontext != null && !((Tag) (htmlpipelinecontext)).getName().equals("table"); htmlpipelinecontext = ((HtmlPipelineContext) (((Tag) (htmlpipelinecontext)).getParent())));
	//   14   34:aload_2         
	//   15   35:invokevirtual   #124 <Method Tag Tag.getParent()>
	//   16   38:astore          5
	//   17   40:aload           5
	//   18   42:ifnull          68
	//   19   45:aload           5
	//   20   47:invokevirtual   #128 <Method String Tag.getName()>
	//   21   50:ldc1            #136 <String "table">
	//   22   52:invokevirtual   #134 <Method boolean String.equals(Object)>
	//   23   55:ifne            68
	//   24   58:aload           5
	//   25   60:invokevirtual   #124 <Method Tag Tag.getParent()>
	//   26   63:astore          5
	//*  27   65:goto            40
		tablestylevalues = Table.setBorderAttributeForCell(((Tag) (htmlpipelinecontext)));
	//   28   68:aload           5
	//   29   70:invokestatic    #142 <Method TableStyleValues Table.setBorderAttributeForCell(Tag)>
	//   30   73:astore          8
		map = tag.getCSS();
	//   31   75:aload_2         
	//   32   76:invokevirtual   #146 <Method Map Tag.getCSS()>
	//   33   79:astore          9
		htmlpipelinecontext = ((HtmlPipelineContext) ((String)map.get("empty-cells")));
	//   34   81:aload           9
	//   35   83:ldc1            #148 <String "empty-cells">
	//   36   85:invokeinterface #154 <Method Object Map.get(Object)>
	//   37   90:checkcast       #28  <Class String>
	//   38   93:astore          5
		if(htmlpipelinecontext == null || !"hide".equalsIgnoreCase(((String) (htmlpipelinecontext))) || htmlcell.getCompositeElements() != null) goto _L2; else goto _L1
	//   39   95:aload           5
	//   40   97:ifnull          148
	//   41  100:ldc1            #156 <String "hide">
	//   42  102:aload           5
	//   43  104:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//   44  107:ifeq            148
	//   45  110:aload_1         
	//   46  111:invokevirtual   #164 <Method java.util.List HtmlCell.getCompositeElements()>
	//   47  114:ifnonnull       148
_L1:
		htmlcell.setBorder(0);
	//   48  117:aload_1         
	//   49  118:iconst_0        
	//   50  119:invokevirtual   #168 <Method void HtmlCell.setBorder(int)>
_L4:
		htmlcell.setBorder(0);
	//   51  122:aload_1         
	//   52  123:iconst_0        
	//   53  124:invokevirtual   #168 <Method void HtmlCell.setBorder(int)>
		htmlcell.setCellEvent(((com.itextpdf.text.pdf.PdfPCellEvent) (new CellSpacingEvent(tablestylevalues))));
	//   54  127:aload_1         
	//   55  128:new             #170 <Class CellSpacingEvent>
	//   56  131:dup             
	//   57  132:aload           8
	//   58  134:invokespecial   #173 <Method void CellSpacingEvent(TableStyleValues)>
	//   59  137:invokevirtual   #177 <Method void HtmlCell.setCellEvent(com.itextpdf.text.pdf.PdfPCellEvent)>
		htmlcell.setCellValues(tablestylevalues);
	//   60  140:aload_1         
	//   61  141:aload           8
	//   62  143:invokevirtual   #180 <Method void HtmlCell.setCellValues(TableStyleValues)>
		return htmlcell;
	//   63  146:aload_1         
	//   64  147:areturn         
_L2:
		htmlcell.setVerticalAlignment(5);
	//   65  148:aload_1         
	//   66  149:iconst_5        
	//   67  150:invokevirtual   #183 <Method void HtmlCell.setVerticalAlignment(int)>
		HeightCalculator heightcalculator = null;
	//   68  153:aconst_null     
	//   69  154:astore          7
		if(tag.getAttributes().containsKey("valign"))
	//*  70  156:aload_2         
	//*  71  157:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//*  72  160:ldc1            #188 <String "valign">
	//*  73  162:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//*  74  167:ifeq            528
			htmlpipelinecontext = ((HtmlPipelineContext) ((String)tag.getAttributes().get("valign")));
	//   75  170:aload_2         
	//   76  171:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//   77  174:ldc1            #188 <String "valign">
	//   78  176:invokeinterface #154 <Method Object Map.get(Object)>
	//   79  181:checkcast       #28  <Class String>
	//   80  184:astore          5
		else
	//*  81  186:aload           5
	//*  82  188:ifnull          206
	//*  83  191:aload           5
	//*  84  193:ldc1            #193 <String "top">
	//*  85  195:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//*  86  198:ifeq            640
	//*  87  201:aload_1         
	//*  88  202:iconst_4        
	//*  89  203:invokevirtual   #183 <Method void HtmlCell.setVerticalAlignment(int)>
	//*  90  206:aconst_null     
	//*  91  207:astore          5
	//*  92  209:aload_2         
	//*  93  210:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//*  94  213:ldc1            #195 <String "align">
	//*  95  215:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//*  96  220:ifeq            660
	//*  97  223:aload_2         
	//*  98  224:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//*  99  227:ldc1            #195 <String "align">
	//* 100  229:invokeinterface #154 <Method Object Map.get(Object)>
	//* 101  234:checkcast       #28  <Class String>
	//* 102  237:astore          5
	//* 103  239:aload           5
	//* 104  241:ifnull          259
	//* 105  244:aload           5
	//* 106  246:ldc1            #197 <String "center">
	//* 107  248:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 108  251:ifeq            691
	//* 109  254:aload_1         
	//* 110  255:iconst_1        
	//* 111  256:invokevirtual   #200 <Method void HtmlCell.setHorizontalAlignment(int)>
	//* 112  259:aload_2         
	//* 113  260:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//* 114  263:ldc1            #26  <String "width">
	//* 115  265:invokeinterface #154 <Method Object Map.get(Object)>
	//* 116  270:ifnonnull       285
	//* 117  273:aload           9
	//* 118  275:ldc1            #26  <String "width">
	//* 119  277:invokeinterface #154 <Method Object Map.get(Object)>
	//* 120  282:ifnull          316
	//* 121  285:aload_1         
	//* 122  286:new             #202 <Class WidthCalculator>
	//* 123  289:dup             
	//* 124  290:invokespecial   #203 <Method void WidthCalculator()>
	//* 125  293:aload_2         
	//* 126  294:aload_3         
	//* 127  295:invokeinterface #208 <Method java.util.List MarginMemory.getRootTags()>
	//* 128  300:aload           4
	//* 129  302:invokeinterface #214 <Method Rectangle PageSizeContainable.getPageSize()>
	//* 130  307:invokevirtual   #220 <Method float Rectangle.getWidth()>
	//* 131  310:invokevirtual   #223 <Method float WidthCalculator.getWidth(Tag, java.util.List, float)>
	//* 132  313:invokevirtual   #226 <Method void HtmlCell.setFixedWidth(float)>
	//* 133  316:new             #228 <Class HeightCalculator>
	//* 134  319:dup             
	//* 135  320:invokespecial   #229 <Method void HeightCalculator()>
	//* 136  323:astore          7
	//* 137  325:aload           7
	//* 138  327:aload_2         
	//* 139  328:aload           4
	//* 140  330:invokeinterface #214 <Method Rectangle PageSizeContainable.getPageSize()>
	//* 141  335:invokevirtual   #232 <Method float Rectangle.getHeight()>
	//* 142  338:invokevirtual   #235 <Method Float HeightCalculator.getHeight(Tag, float)>
	//* 143  341:astore          5
	//* 144  343:aload           5
	//* 145  345:astore_3        
	//* 146  346:aload           5
	//* 147  348:ifnonnull       377
	//* 148  351:aload           5
	//* 149  353:astore_3        
	//* 150  354:aload           6
	//* 151  356:ifnull          377
	//* 152  359:aload           7
	//* 153  361:aload           6
	//* 154  363:aload           4
	//* 155  365:invokeinterface #214 <Method Rectangle PageSizeContainable.getPageSize()>
	//* 156  370:invokevirtual   #232 <Method float Rectangle.getHeight()>
	//* 157  373:invokevirtual   #235 <Method Float HeightCalculator.getHeight(Tag, float)>
	//* 158  376:astore_3        
	//* 159  377:aload_3         
	//* 160  378:ifnull          389
	//* 161  381:aload_1         
	//* 162  382:aload_3         
	//* 163  383:invokevirtual   #240 <Method float Float.floatValue()>
	//* 164  386:invokevirtual   #243 <Method void HtmlCell.setMinimumHeight(float)>
	//* 165  389:aload_2         
	//* 166  390:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//* 167  393:ldc1            #245 <String "colspan">
	//* 168  395:invokeinterface #154 <Method Object Map.get(Object)>
	//* 169  400:checkcast       #28  <Class String>
	//* 170  403:astore_3        
	//* 171  404:aload_3         
	//* 172  405:ifnull          416
	//* 173  408:aload_1         
	//* 174  409:aload_3         
	//* 175  410:invokestatic    #251 <Method int Integer.parseInt(String)>
	//* 176  413:invokevirtual   #254 <Method void HtmlCell.setColspan(int)>
	//* 177  416:aload_2         
	//* 178  417:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//* 179  420:ldc2            #256 <String "rowspan">
	//* 180  423:invokeinterface #154 <Method Object Map.get(Object)>
	//* 181  428:checkcast       #28  <Class String>
	//* 182  431:astore_2        
	//* 183  432:aload_2         
	//* 184  433:ifnull          444
	//* 185  436:aload_1         
	//* 186  437:aload_2         
	//* 187  438:invokestatic    #251 <Method int Integer.parseInt(String)>
	//* 188  441:invokevirtual   #259 <Method void HtmlCell.setRowspan(int)>
	//* 189  444:aload           9
	//* 190  446:invokeinterface #263 <Method Set Map.entrySet()>
	//* 191  451:invokeinterface #269 <Method Iterator Set.iterator()>
	//* 192  456:astore_2        
	//* 193  457:aload_2         
	//* 194  458:invokeinterface #275 <Method boolean Iterator.hasNext()>
	//* 195  463:ifeq            1067
	//* 196  466:aload_2         
	//* 197  467:invokeinterface #279 <Method Object Iterator.next()>
	//* 198  472:checkcast       #281 <Class java.util.Map$Entry>
	//* 199  475:astore          4
	//* 200  477:aload           4
	//* 201  479:invokeinterface #284 <Method Object java.util.Map$Entry.getKey()>
	//* 202  484:checkcast       #28  <Class String>
	//* 203  487:astore_3        
	//* 204  488:aload           4
	//* 205  490:invokeinterface #287 <Method Object java.util.Map$Entry.getValue()>
	//* 206  495:checkcast       #28  <Class String>
	//* 207  498:astore          4
	//* 208  500:aload_1         
	//* 209  501:iconst_1        
	//* 210  502:invokevirtual   #291 <Method void HtmlCell.setUseBorderPadding(boolean)>
	//* 211  505:aload_3         
	//* 212  506:ldc2            #293 <String "background-color">
	//* 213  509:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 214  512:ifeq            729
	//* 215  515:aload           8
	//* 216  517:aload           4
	//* 217  519:invokestatic    #50  <Method BaseColor HtmlUtilities.decodeColor(String)>
	//* 218  522:invokevirtual   #296 <Method void TableStyleValues.setBackground(BaseColor)>
	//* 219  525:goto            457
		if(map.containsKey("valign"))
	//* 220  528:aload           9
	//* 221  530:ldc1            #188 <String "valign">
	//* 222  532:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//* 223  537:ifeq            557
		{
			htmlpipelinecontext = ((HtmlPipelineContext) ((String)map.get("valign")));
	//  224  540:aload           9
	//  225  542:ldc1            #188 <String "valign">
	//  226  544:invokeinterface #154 <Method Object Map.get(Object)>
	//  227  549:checkcast       #28  <Class String>
	//  228  552:astore          5
		} else
	//* 229  554:goto            186
		{
			htmlpipelinecontext = ((HtmlPipelineContext) (heightcalculator));
	//  230  557:aload           7
	//  231  559:astore          5
			if(tag1 != null)
	//* 232  561:aload           6
	//* 233  563:ifnull          186
				if(tag1.getAttributes().containsKey("valign"))
	//* 234  566:aload           6
	//* 235  568:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//* 236  571:ldc1            #188 <String "valign">
	//* 237  573:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//* 238  578:ifeq            601
				{
					htmlpipelinecontext = ((HtmlPipelineContext) ((String)tag1.getAttributes().get("valign")));
	//  239  581:aload           6
	//  240  583:invokevirtual   #186 <Method Map Tag.getAttributes()>
	//  241  586:ldc1            #188 <String "valign">
	//  242  588:invokeinterface #154 <Method Object Map.get(Object)>
	//  243  593:checkcast       #28  <Class String>
	//  244  596:astore          5
				} else
	//* 245  598:goto            186
				{
					htmlpipelinecontext = ((HtmlPipelineContext) (heightcalculator));
	//  246  601:aload           7
	//  247  603:astore          5
					if(tag1.getCSS().containsKey("valign"))
	//* 248  605:aload           6
	//* 249  607:invokevirtual   #146 <Method Map Tag.getCSS()>
	//* 250  610:ldc1            #188 <String "valign">
	//* 251  612:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//* 252  617:ifeq            186
						htmlpipelinecontext = ((HtmlPipelineContext) ((String)tag1.getCSS().get("valign")));
	//  253  620:aload           6
	//  254  622:invokevirtual   #146 <Method Map Tag.getCSS()>
	//  255  625:ldc1            #188 <String "valign">
	//  256  627:invokeinterface #154 <Method Object Map.get(Object)>
	//  257  632:checkcast       #28  <Class String>
	//  258  635:astore          5
				}
		}
		if(htmlpipelinecontext != null)
			if(((String) (htmlpipelinecontext)).equalsIgnoreCase("top"))
				htmlcell.setVerticalAlignment(4);
			else
	//* 259  637:goto            186
			if(((String) (htmlpipelinecontext)).equalsIgnoreCase("bottom"))
	//* 260  640:aload           5
	//* 261  642:ldc2            #298 <String "bottom">
	//* 262  645:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 263  648:ifeq            206
				htmlcell.setVerticalAlignment(6);
	//  264  651:aload_1         
	//  265  652:bipush          6
	//  266  654:invokevirtual   #183 <Method void HtmlCell.setVerticalAlignment(int)>
		htmlpipelinecontext = null;
		if(tag.getAttributes().containsKey("align"))
			htmlpipelinecontext = ((HtmlPipelineContext) ((String)tag.getAttributes().get("align")));
		else
	//* 267  657:goto            206
		if(map.containsKey("text-align"))
	//* 268  660:aload           9
	//* 269  662:ldc2            #300 <String "text-align">
	//* 270  665:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//* 271  670:ifeq            239
			htmlpipelinecontext = ((HtmlPipelineContext) ((String)map.get("text-align")));
	//  272  673:aload           9
	//  273  675:ldc2            #300 <String "text-align">
	//  274  678:invokeinterface #154 <Method Object Map.get(Object)>
	//  275  683:checkcast       #28  <Class String>
	//  276  686:astore          5
		if(htmlpipelinecontext != null)
			if(((String) (htmlpipelinecontext)).equalsIgnoreCase("center"))
				htmlcell.setHorizontalAlignment(1);
			else
	//* 277  688:goto            239
			if(((String) (htmlpipelinecontext)).equalsIgnoreCase("right"))
	//* 278  691:aload           5
	//* 279  693:ldc2            #302 <String "right">
	//* 280  696:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 281  699:ifeq            710
				htmlcell.setHorizontalAlignment(2);
	//  282  702:aload_1         
	//  283  703:iconst_2        
	//  284  704:invokevirtual   #200 <Method void HtmlCell.setHorizontalAlignment(int)>
			else
	//* 285  707:goto            259
			if(((String) (htmlpipelinecontext)).equalsIgnoreCase("justify"))
	//* 286  710:aload           5
	//* 287  712:ldc2            #304 <String "justify">
	//* 288  715:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 289  718:ifeq            259
				htmlcell.setHorizontalAlignment(3);
	//  290  721:aload_1         
	//  291  722:iconst_3        
	//  292  723:invokevirtual   #200 <Method void HtmlCell.setHorizontalAlignment(int)>
		if(tag.getAttributes().get("width") != null || map.get("width") != null)
			htmlcell.setFixedWidth((new WidthCalculator()).getWidth(tag, marginmemory.getRootTags(), pagesizecontainable.getPageSize().getWidth()));
		heightcalculator = new HeightCalculator();
		htmlpipelinecontext = ((HtmlPipelineContext) (heightcalculator.getHeight(tag, pagesizecontainable.getPageSize().getHeight())));
		marginmemory = ((MarginMemory) (htmlpipelinecontext));
		if(htmlpipelinecontext == null)
		{
			marginmemory = ((MarginMemory) (htmlpipelinecontext));
			if(tag1 != null)
				marginmemory = ((MarginMemory) (heightcalculator.getHeight(tag1, pagesizecontainable.getPageSize().getHeight())));
		}
		if(marginmemory != null)
			htmlcell.setMinimumHeight(((Float) (marginmemory)).floatValue());
		marginmemory = ((MarginMemory) ((String)tag.getAttributes().get("colspan")));
		if(marginmemory != null)
			htmlcell.setColspan(Integer.parseInt(((String) (marginmemory))));
		tag = ((Tag) ((String)tag.getAttributes().get("rowspan")));
		if(tag != null)
			htmlcell.setRowspan(Integer.parseInt(((String) (tag))));
		for(tag = ((Tag) (map.entrySet().iterator())); ((Iterator) (tag)).hasNext();)
		{
			pagesizecontainable = ((PageSizeContainable) ((java.util.Map.Entry)((Iterator) (tag)).next()));
			marginmemory = ((MarginMemory) ((String)((java.util.Map.Entry) (pagesizecontainable)).getKey()));
			pagesizecontainable = ((PageSizeContainable) ((String)((java.util.Map.Entry) (pagesizecontainable)).getValue()));
			htmlcell.setUseBorderPadding(true);
			if(((String) (marginmemory)).equalsIgnoreCase("background-color"))
				tablestylevalues.setBackground(HtmlUtilities.decodeColor(((String) (pagesizecontainable))));
			else
	//* 293  726:goto            259
			if(((String) (marginmemory)).equalsIgnoreCase("vertical-align"))
	//* 294  729:aload_3         
	//* 295  730:ldc2            #306 <String "vertical-align">
	//* 296  733:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 297  736:ifeq            801
			{
				if(((String) (pagesizecontainable)).equalsIgnoreCase("top"))
	//* 298  739:aload           4
	//* 299  741:ldc1            #193 <String "top">
	//* 300  743:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 301  746:ifeq            769
				{
					htmlcell.setVerticalAlignment(4);
	//  302  749:aload_1         
	//  303  750:iconst_4        
	//  304  751:invokevirtual   #183 <Method void HtmlCell.setVerticalAlignment(int)>
					htmlcell.setPaddingTop(htmlcell.getPaddingTop() + 6F);
	//  305  754:aload_1         
	//  306  755:aload_1         
	//  307  756:invokevirtual   #309 <Method float HtmlCell.getPaddingTop()>
	//  308  759:ldc2            #310 <Float 6F>
	//  309  762:fadd            
	//  310  763:invokevirtual   #313 <Method void HtmlCell.setPaddingTop(float)>
				} else
	//* 311  766:goto            457
				if(((String) (pagesizecontainable)).equalsIgnoreCase("bottom"))
	//* 312  769:aload           4
	//* 313  771:ldc2            #298 <String "bottom">
	//* 314  774:invokevirtual   #160 <Method boolean String.equalsIgnoreCase(String)>
	//* 315  777:ifeq            457
				{
					htmlcell.setVerticalAlignment(6);
	//  316  780:aload_1         
	//  317  781:bipush          6
	//  318  783:invokevirtual   #183 <Method void HtmlCell.setVerticalAlignment(int)>
					htmlcell.setPaddingBottom(htmlcell.getPaddingBottom() + 6F);
	//  319  786:aload_1         
	//  320  787:aload_1         
	//  321  788:invokevirtual   #316 <Method float HtmlCell.getPaddingBottom()>
	//  322  791:ldc2            #310 <Float 6F>
	//  323  794:fadd            
	//  324  795:invokevirtual   #319 <Method void HtmlCell.setPaddingBottom(float)>
				}
			} else
	//* 325  798:goto            457
			if(((String) (marginmemory)).contains("border"))
	//* 326  801:aload_3         
	//* 327  802:ldc2            #321 <String "border">
	//* 328  805:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 329  808:ifeq            902
			{
				if(((String) (marginmemory)).contains("top"))
	//* 330  811:aload_3         
	//* 331  812:ldc1            #193 <String "top">
	//* 332  814:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 333  817:ifeq            833
					setTopOfBorder(htmlcell, ((String) (marginmemory)), ((String) (pagesizecontainable)), tablestylevalues);
	//  334  820:aload_0         
	//  335  821:aload_1         
	//  336  822:aload_3         
	//  337  823:aload           4
	//  338  825:aload           8
	//  339  827:invokespecial   #323 <Method void setTopOfBorder(HtmlCell, String, String, TableStyleValues)>
				else
	//* 340  830:goto            457
				if(((String) (marginmemory)).contains("bottom"))
	//* 341  833:aload_3         
	//* 342  834:ldc2            #298 <String "bottom">
	//* 343  837:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 344  840:ifeq            856
					setBottomOfBorder(htmlcell, ((String) (marginmemory)), ((String) (pagesizecontainable)), tablestylevalues);
	//  345  843:aload_0         
	//  346  844:aload_1         
	//  347  845:aload_3         
	//  348  846:aload           4
	//  349  848:aload           8
	//  350  850:invokespecial   #325 <Method void setBottomOfBorder(HtmlCell, String, String, TableStyleValues)>
				else
	//* 351  853:goto            457
				if(((String) (marginmemory)).contains("left"))
	//* 352  856:aload_3         
	//* 353  857:ldc2            #327 <String "left">
	//* 354  860:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 355  863:ifeq            879
					setLeftOfBorder(htmlcell, ((String) (marginmemory)), ((String) (pagesizecontainable)), tablestylevalues);
	//  356  866:aload_0         
	//  357  867:aload_1         
	//  358  868:aload_3         
	//  359  869:aload           4
	//  360  871:aload           8
	//  361  873:invokespecial   #329 <Method void setLeftOfBorder(HtmlCell, String, String, TableStyleValues)>
				else
	//* 362  876:goto            457
				if(((String) (marginmemory)).contains("right"))
	//* 363  879:aload_3         
	//* 364  880:ldc2            #302 <String "right">
	//* 365  883:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 366  886:ifeq            457
					setRightOfBorder(htmlcell, ((String) (marginmemory)), ((String) (pagesizecontainable)), tablestylevalues);
	//  367  889:aload_0         
	//  368  890:aload_1         
	//  369  891:aload_3         
	//  370  892:aload           4
	//  371  894:aload           8
	//  372  896:invokespecial   #331 <Method void setRightOfBorder(HtmlCell, String, String, TableStyleValues)>
			} else
	//* 373  899:goto            457
			if(((String) (marginmemory)).contains("cellpadding") || ((String) (marginmemory)).contains("padding"))
	//* 374  902:aload_3         
	//* 375  903:ldc2            #333 <String "cellpadding">
	//* 376  906:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 377  909:ifne            922
	//* 378  912:aload_3         
	//* 379  913:ldc2            #335 <String "padding">
	//* 380  916:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 381  919:ifeq            1045
			{
				if(((String) (marginmemory)).contains("top"))
	//* 382  922:aload_3         
	//* 383  923:ldc1            #193 <String "top">
	//* 384  925:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 385  928:ifeq            952
					htmlcell.setPaddingTop(htmlcell.getPaddingTop() + utils.parsePxInCmMmPcToPt(((String) (pagesizecontainable))));
	//  386  931:aload_1         
	//  387  932:aload_1         
	//  388  933:invokevirtual   #309 <Method float HtmlCell.getPaddingTop()>
	//  389  936:aload_0         
	//  390  937:getfield        #21  <Field CssUtils utils>
	//  391  940:aload           4
	//  392  942:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  393  945:fadd            
	//  394  946:invokevirtual   #313 <Method void HtmlCell.setPaddingTop(float)>
				else
	//* 395  949:goto            457
				if(((String) (marginmemory)).contains("bottom"))
	//* 396  952:aload_3         
	//* 397  953:ldc2            #298 <String "bottom">
	//* 398  956:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 399  959:ifeq            983
					htmlcell.setPaddingBottom(htmlcell.getPaddingBottom() + utils.parsePxInCmMmPcToPt(((String) (pagesizecontainable))));
	//  400  962:aload_1         
	//  401  963:aload_1         
	//  402  964:invokevirtual   #316 <Method float HtmlCell.getPaddingBottom()>
	//  403  967:aload_0         
	//  404  968:getfield        #21  <Field CssUtils utils>
	//  405  971:aload           4
	//  406  973:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  407  976:fadd            
	//  408  977:invokevirtual   #319 <Method void HtmlCell.setPaddingBottom(float)>
				else
	//* 409  980:goto            457
				if(((String) (marginmemory)).contains("left"))
	//* 410  983:aload_3         
	//* 411  984:ldc2            #327 <String "left">
	//* 412  987:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 413  990:ifeq            1014
					htmlcell.setPaddingLeft(htmlcell.getPaddingLeft() + utils.parsePxInCmMmPcToPt(((String) (pagesizecontainable))));
	//  414  993:aload_1         
	//  415  994:aload_1         
	//  416  995:invokevirtual   #338 <Method float HtmlCell.getPaddingLeft()>
	//  417  998:aload_0         
	//  418  999:getfield        #21  <Field CssUtils utils>
	//  419 1002:aload           4
	//  420 1004:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  421 1007:fadd            
	//  422 1008:invokevirtual   #341 <Method void HtmlCell.setPaddingLeft(float)>
				else
	//* 423 1011:goto            457
				if(((String) (marginmemory)).contains("right"))
	//* 424 1014:aload_3         
	//* 425 1015:ldc2            #302 <String "right">
	//* 426 1018:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 427 1021:ifeq            457
					htmlcell.setPaddingRight(htmlcell.getPaddingRight() + utils.parsePxInCmMmPcToPt(((String) (pagesizecontainable))));
	//  428 1024:aload_1         
	//  429 1025:aload_1         
	//  430 1026:invokevirtual   #344 <Method float HtmlCell.getPaddingRight()>
	//  431 1029:aload_0         
	//  432 1030:getfield        #21  <Field CssUtils utils>
	//  433 1033:aload           4
	//  434 1035:invokevirtual   #36  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//  435 1038:fadd            
	//  436 1039:invokevirtual   #347 <Method void HtmlCell.setPaddingRight(float)>
			} else
	//* 437 1042:goto            457
			if(((String) (marginmemory)).contains("text-align"))
	//* 438 1045:aload_3         
	//* 439 1046:ldc2            #300 <String "text-align">
	//* 440 1049:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//* 441 1052:ifeq            457
				htmlcell.setHorizontalAlignment(CSS.getElementAlignment(((String) (pagesizecontainable))));
	//  442 1055:aload_1         
	//  443 1056:aload           4
	//  444 1058:invokestatic    #352 <Method int CSS.getElementAlignment(String)>
	//  445 1061:invokevirtual   #200 <Method void HtmlCell.setHorizontalAlignment(int)>
		}

	//* 446 1064:goto            457
		htmlcell.setPaddingLeft(htmlcell.getPaddingLeft() + tablestylevalues.getHorBorderSpacing() + tablestylevalues.getBorderWidthLeft());
	//  447 1067:aload_1         
	//  448 1068:aload_1         
	//  449 1069:invokevirtual   #338 <Method float HtmlCell.getPaddingLeft()>
	//  450 1072:aload           8
	//  451 1074:invokevirtual   #355 <Method float TableStyleValues.getHorBorderSpacing()>
	//  452 1077:fadd            
	//  453 1078:aload           8
	//  454 1080:invokevirtual   #357 <Method float TableStyleValues.getBorderWidthLeft()>
	//  455 1083:fadd            
	//  456 1084:invokevirtual   #341 <Method void HtmlCell.setPaddingLeft(float)>
		htmlcell.setPaddingRight(htmlcell.getPaddingRight() + tablestylevalues.getBorderWidthRight());
	//  457 1087:aload_1         
	//  458 1088:aload_1         
	//  459 1089:invokevirtual   #344 <Method float HtmlCell.getPaddingRight()>
	//  460 1092:aload           8
	//  461 1094:invokevirtual   #359 <Method float TableStyleValues.getBorderWidthRight()>
	//  462 1097:fadd            
	//  463 1098:invokevirtual   #347 <Method void HtmlCell.setPaddingRight(float)>
		htmlcell.setPaddingTop(htmlcell.getPaddingTop() + tablestylevalues.getVerBorderSpacing() + tablestylevalues.getBorderWidthTop());
	//  464 1101:aload_1         
	//  465 1102:aload_1         
	//  466 1103:invokevirtual   #309 <Method float HtmlCell.getPaddingTop()>
	//  467 1106:aload           8
	//  468 1108:invokevirtual   #362 <Method float TableStyleValues.getVerBorderSpacing()>
	//  469 1111:fadd            
	//  470 1112:aload           8
	//  471 1114:invokevirtual   #364 <Method float TableStyleValues.getBorderWidthTop()>
	//  472 1117:fadd            
	//  473 1118:invokevirtual   #313 <Method void HtmlCell.setPaddingTop(float)>
		htmlcell.setPaddingBottom(htmlcell.getPaddingBottom() + tablestylevalues.getBorderWidthBottom());
	//  474 1121:aload_1         
	//  475 1122:aload_1         
	//  476 1123:invokevirtual   #316 <Method float HtmlCell.getPaddingBottom()>
	//  477 1126:aload           8
	//  478 1128:invokevirtual   #366 <Method float TableStyleValues.getBorderWidthBottom()>
	//  479 1131:fadd            
	//  480 1132:invokevirtual   #319 <Method void HtmlCell.setPaddingBottom(float)>
		if(true) goto _L4; else goto _L3
	//  481 1135:goto            122
_L3:
	}

	private final CssUtils utils = CssUtils.getInstance();
}
