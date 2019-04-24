// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.table;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;

// Referenced classes of package com.itextpdf.tool.xml.html.table:
//			TableStyleValues

public class CellSpacingEvent
	implements PdfPCellEvent
{

	public CellSpacingEvent(TableStyleValues tablestylevalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		styleValues = tablestylevalues;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field TableStyleValues styleValues>
	//    5    9:return          
	}

	public void cellLayout(PdfPCell pdfpcell, Rectangle rectangle, PdfContentByte apdfcontentbyte[])
	{
		float f = styleValues.getBorderWidthLeft() / 2.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TableStyleValues styleValues>
	//    2    4:invokevirtual   #24  <Method float TableStyleValues.getBorderWidthLeft()>
	//    3    7:fconst_2        
	//    4    8:fdiv            
	//    5    9:fstore          4
		float f1 = styleValues.getHorBorderSpacing();
	//    6   11:aload_0         
	//    7   12:getfield        #15  <Field TableStyleValues styleValues>
	//    8   15:invokevirtual   #27  <Method float TableStyleValues.getHorBorderSpacing()>
	//    9   18:fstore          5
		f1 = rectangle.getLeft() + (f + f1);
	//   10   20:aload_2         
	//   11   21:invokevirtual   #32  <Method float Rectangle.getLeft()>
	//   12   24:fload           4
	//   13   26:fload           5
	//   14   28:fadd            
	//   15   29:fadd            
	//   16   30:fstore          5
		float f2;
		float f3;
		float f4;
		if(styleValues.isLastInRow())
	//*  17   32:aload_0         
	//*  18   33:getfield        #15  <Field TableStyleValues styleValues>
	//*  19   36:invokevirtual   #36  <Method boolean TableStyleValues.isLastInRow()>
	//*  20   39:ifeq            411
			f = styleValues.getBorderWidthRight() / 2.0F + styleValues.getHorBorderSpacing();
	//   21   42:aload_0         
	//   22   43:getfield        #15  <Field TableStyleValues styleValues>
	//   23   46:invokevirtual   #39  <Method float TableStyleValues.getBorderWidthRight()>
	//   24   49:fconst_2        
	//   25   50:fdiv            
	//   26   51:aload_0         
	//   27   52:getfield        #15  <Field TableStyleValues styleValues>
	//   28   55:invokevirtual   #27  <Method float TableStyleValues.getHorBorderSpacing()>
	//   29   58:fadd            
	//   30   59:fstore          4
		else
	//*  31   61:aload_2         
	//*  32   62:invokevirtual   #42  <Method float Rectangle.getRight()>
	//*  33   65:fload           4
	//*  34   67:fsub            
	//*  35   68:fstore          4
	//*  36   70:aload_0         
	//*  37   71:getfield        #15  <Field TableStyleValues styleValues>
	//*  38   74:invokevirtual   #45  <Method float TableStyleValues.getBorderWidthTop()>
	//*  39   77:fconst_2        
	//*  40   78:fdiv            
	//*  41   79:fstore          6
	//*  42   81:aload_0         
	//*  43   82:getfield        #15  <Field TableStyleValues styleValues>
	//*  44   85:invokevirtual   #48  <Method float TableStyleValues.getVerBorderSpacing()>
	//*  45   88:fstore          7
	//*  46   90:aload_2         
	//*  47   91:invokevirtual   #51  <Method float Rectangle.getTop()>
	//*  48   94:fload           6
	//*  49   96:fload           7
	//*  50   98:fadd            
	//*  51   99:fsub            
	//*  52  100:fstore          6
	//*  53  102:aload_0         
	//*  54  103:getfield        #15  <Field TableStyleValues styleValues>
	//*  55  106:invokevirtual   #54  <Method float TableStyleValues.getBorderWidthBottom()>
	//*  56  109:fconst_2        
	//*  57  110:fdiv            
	//*  58  111:fstore          7
	//*  59  113:aload_2         
	//*  60  114:invokevirtual   #57  <Method float Rectangle.getBottom()>
	//*  61  117:fload           7
	//*  62  119:fadd            
	//*  63  120:fstore          7
	//*  64  122:aload_3         
	//*  65  123:iconst_2        
	//*  66  124:aaload          
	//*  67  125:astore_1        
	//*  68  126:aload_0         
	//*  69  127:getfield        #15  <Field TableStyleValues styleValues>
	//*  70  130:invokevirtual   #61  <Method com.itextpdf.text.BaseColor TableStyleValues.getBackground()>
	//*  71  133:astore_2        
	//*  72  134:aload_2         
	//*  73  135:ifnull          170
	//*  74  138:aload_1         
	//*  75  139:aload_2         
	//*  76  140:invokevirtual   #67  <Method void PdfContentByte.setColorStroke(com.itextpdf.text.BaseColor)>
	//*  77  143:aload_1         
	//*  78  144:aload_2         
	//*  79  145:invokevirtual   #70  <Method void PdfContentByte.setColorFill(com.itextpdf.text.BaseColor)>
	//*  80  148:aload_1         
	//*  81  149:fload           5
	//*  82  151:fload           6
	//*  83  153:fload           4
	//*  84  155:fload           5
	//*  85  157:fsub            
	//*  86  158:fload           7
	//*  87  160:fload           6
	//*  88  162:fsub            
	//*  89  163:invokevirtual   #74  <Method void PdfContentByte.rectangle(float, float, float, float)>
	//*  90  166:aload_1         
	//*  91  167:invokevirtual   #77  <Method void PdfContentByte.fill()>
	//*  92  170:aload_0         
	//*  93  171:getfield        #15  <Field TableStyleValues styleValues>
	//*  94  174:invokevirtual   #80  <Method com.itextpdf.text.BaseColor TableStyleValues.getBorderColorLeft()>
	//*  95  177:astore_2        
	//*  96  178:aload_0         
	//*  97  179:getfield        #15  <Field TableStyleValues styleValues>
	//*  98  182:invokevirtual   #24  <Method float TableStyleValues.getBorderWidthLeft()>
	//*  99  185:fstore          8
	//* 100  187:aload_2         
	//* 101  188:ifnull          229
	//* 102  191:fload           8
	//* 103  193:fconst_0        
	//* 104  194:fcmpl           
	//* 105  195:ifeq            229
	//* 106  198:aload_1         
	//* 107  199:fload           8
	//* 108  201:invokevirtual   #84  <Method void PdfContentByte.setLineWidth(float)>
	//* 109  204:aload_1         
	//* 110  205:aload_2         
	//* 111  206:invokevirtual   #67  <Method void PdfContentByte.setColorStroke(com.itextpdf.text.BaseColor)>
	//* 112  209:aload_1         
	//* 113  210:fload           5
	//* 114  212:fload           6
	//* 115  214:invokevirtual   #88  <Method void PdfContentByte.moveTo(float, float)>
	//* 116  217:aload_1         
	//* 117  218:fload           5
	//* 118  220:fload           7
	//* 119  222:invokevirtual   #91  <Method void PdfContentByte.lineTo(float, float)>
	//* 120  225:aload_1         
	//* 121  226:invokevirtual   #94  <Method void PdfContentByte.stroke()>
	//* 122  229:aload_0         
	//* 123  230:getfield        #15  <Field TableStyleValues styleValues>
	//* 124  233:invokevirtual   #97  <Method com.itextpdf.text.BaseColor TableStyleValues.getBorderColorBottom()>
	//* 125  236:astore_2        
	//* 126  237:aload_0         
	//* 127  238:getfield        #15  <Field TableStyleValues styleValues>
	//* 128  241:invokevirtual   #54  <Method float TableStyleValues.getBorderWidthBottom()>
	//* 129  244:fstore          8
	//* 130  246:aload_2         
	//* 131  247:ifnull          288
	//* 132  250:fload           8
	//* 133  252:fconst_0        
	//* 134  253:fcmpl           
	//* 135  254:ifeq            288
	//* 136  257:aload_1         
	//* 137  258:fload           8
	//* 138  260:invokevirtual   #84  <Method void PdfContentByte.setLineWidth(float)>
	//* 139  263:aload_1         
	//* 140  264:aload_2         
	//* 141  265:invokevirtual   #67  <Method void PdfContentByte.setColorStroke(com.itextpdf.text.BaseColor)>
	//* 142  268:aload_1         
	//* 143  269:fload           5
	//* 144  271:fload           7
	//* 145  273:invokevirtual   #88  <Method void PdfContentByte.moveTo(float, float)>
	//* 146  276:aload_1         
	//* 147  277:fload           4
	//* 148  279:fload           7
	//* 149  281:invokevirtual   #91  <Method void PdfContentByte.lineTo(float, float)>
	//* 150  284:aload_1         
	//* 151  285:invokevirtual   #94  <Method void PdfContentByte.stroke()>
	//* 152  288:aload_0         
	//* 153  289:getfield        #15  <Field TableStyleValues styleValues>
	//* 154  292:invokevirtual   #100 <Method com.itextpdf.text.BaseColor TableStyleValues.getBorderColorRight()>
	//* 155  295:astore_2        
	//* 156  296:aload_0         
	//* 157  297:getfield        #15  <Field TableStyleValues styleValues>
	//* 158  300:invokevirtual   #39  <Method float TableStyleValues.getBorderWidthRight()>
	//* 159  303:fstore          8
	//* 160  305:aload_2         
	//* 161  306:ifnull          347
	//* 162  309:fload           8
	//* 163  311:fconst_0        
	//* 164  312:fcmpl           
	//* 165  313:ifeq            347
	//* 166  316:aload_1         
	//* 167  317:fload           8
	//* 168  319:invokevirtual   #84  <Method void PdfContentByte.setLineWidth(float)>
	//* 169  322:aload_1         
	//* 170  323:aload_2         
	//* 171  324:invokevirtual   #67  <Method void PdfContentByte.setColorStroke(com.itextpdf.text.BaseColor)>
	//* 172  327:aload_1         
	//* 173  328:fload           4
	//* 174  330:fload           7
	//* 175  332:invokevirtual   #88  <Method void PdfContentByte.moveTo(float, float)>
	//* 176  335:aload_1         
	//* 177  336:fload           4
	//* 178  338:fload           6
	//* 179  340:invokevirtual   #91  <Method void PdfContentByte.lineTo(float, float)>
	//* 180  343:aload_1         
	//* 181  344:invokevirtual   #94  <Method void PdfContentByte.stroke()>
	//* 182  347:aload_0         
	//* 183  348:getfield        #15  <Field TableStyleValues styleValues>
	//* 184  351:invokevirtual   #103 <Method com.itextpdf.text.BaseColor TableStyleValues.getBorderColorTop()>
	//* 185  354:astore_2        
	//* 186  355:aload_0         
	//* 187  356:getfield        #15  <Field TableStyleValues styleValues>
	//* 188  359:invokevirtual   #45  <Method float TableStyleValues.getBorderWidthTop()>
	//* 189  362:fstore          7
	//* 190  364:aload_2         
	//* 191  365:ifnull          406
	//* 192  368:fload           7
	//* 193  370:fconst_0        
	//* 194  371:fcmpl           
	//* 195  372:ifeq            406
	//* 196  375:aload_1         
	//* 197  376:fload           7
	//* 198  378:invokevirtual   #84  <Method void PdfContentByte.setLineWidth(float)>
	//* 199  381:aload_1         
	//* 200  382:aload_2         
	//* 201  383:invokevirtual   #67  <Method void PdfContentByte.setColorStroke(com.itextpdf.text.BaseColor)>
	//* 202  386:aload_1         
	//* 203  387:fload           4
	//* 204  389:fload           6
	//* 205  391:invokevirtual   #88  <Method void PdfContentByte.moveTo(float, float)>
	//* 206  394:aload_1         
	//* 207  395:fload           5
	//* 208  397:fload           6
	//* 209  399:invokevirtual   #91  <Method void PdfContentByte.lineTo(float, float)>
	//* 210  402:aload_1         
	//* 211  403:invokevirtual   #94  <Method void PdfContentByte.stroke()>
	//* 212  406:aload_1         
	//* 213  407:invokevirtual   #106 <Method void PdfContentByte.resetRGBColorStroke()>
	//* 214  410:return          
			f = styleValues.getBorderWidthRight() / 2.0F;
	//  215  411:aload_0         
	//  216  412:getfield        #15  <Field TableStyleValues styleValues>
	//  217  415:invokevirtual   #39  <Method float TableStyleValues.getBorderWidthRight()>
	//  218  418:fconst_2        
	//  219  419:fdiv            
	//  220  420:fstore          4
		f = rectangle.getRight() - f;
		f2 = styleValues.getBorderWidthTop() / 2.0F;
		f3 = styleValues.getVerBorderSpacing();
		f2 = rectangle.getTop() - (f2 + f3);
		f3 = styleValues.getBorderWidthBottom() / 2.0F;
		f3 = rectangle.getBottom() + f3;
		pdfpcell = ((PdfPCell) (apdfcontentbyte[2]));
		rectangle = ((Rectangle) (styleValues.getBackground()));
		if(rectangle != null)
		{
			((PdfContentByte) (pdfpcell)).setColorStroke(((com.itextpdf.text.BaseColor) (rectangle)));
			((PdfContentByte) (pdfpcell)).setColorFill(((com.itextpdf.text.BaseColor) (rectangle)));
			((PdfContentByte) (pdfpcell)).rectangle(f1, f2, f - f1, f3 - f2);
			((PdfContentByte) (pdfpcell)).fill();
		}
		rectangle = ((Rectangle) (styleValues.getBorderColorLeft()));
		f4 = styleValues.getBorderWidthLeft();
		if(rectangle != null && f4 != 0.0F)
		{
			((PdfContentByte) (pdfpcell)).setLineWidth(f4);
			((PdfContentByte) (pdfpcell)).setColorStroke(((com.itextpdf.text.BaseColor) (rectangle)));
			((PdfContentByte) (pdfpcell)).moveTo(f1, f2);
			((PdfContentByte) (pdfpcell)).lineTo(f1, f3);
			((PdfContentByte) (pdfpcell)).stroke();
		}
		rectangle = ((Rectangle) (styleValues.getBorderColorBottom()));
		f4 = styleValues.getBorderWidthBottom();
		if(rectangle != null && f4 != 0.0F)
		{
			((PdfContentByte) (pdfpcell)).setLineWidth(f4);
			((PdfContentByte) (pdfpcell)).setColorStroke(((com.itextpdf.text.BaseColor) (rectangle)));
			((PdfContentByte) (pdfpcell)).moveTo(f1, f3);
			((PdfContentByte) (pdfpcell)).lineTo(f, f3);
			((PdfContentByte) (pdfpcell)).stroke();
		}
		rectangle = ((Rectangle) (styleValues.getBorderColorRight()));
		f4 = styleValues.getBorderWidthRight();
		if(rectangle != null && f4 != 0.0F)
		{
			((PdfContentByte) (pdfpcell)).setLineWidth(f4);
			((PdfContentByte) (pdfpcell)).setColorStroke(((com.itextpdf.text.BaseColor) (rectangle)));
			((PdfContentByte) (pdfpcell)).moveTo(f, f3);
			((PdfContentByte) (pdfpcell)).lineTo(f, f2);
			((PdfContentByte) (pdfpcell)).stroke();
		}
		rectangle = ((Rectangle) (styleValues.getBorderColorTop()));
		f3 = styleValues.getBorderWidthTop();
		if(rectangle != null && f3 != 0.0F)
		{
			((PdfContentByte) (pdfpcell)).setLineWidth(f3);
			((PdfContentByte) (pdfpcell)).setColorStroke(((com.itextpdf.text.BaseColor) (rectangle)));
			((PdfContentByte) (pdfpcell)).moveTo(f, f2);
			((PdfContentByte) (pdfpcell)).lineTo(f1, f2);
			((PdfContentByte) (pdfpcell)).stroke();
		}
		((PdfContentByte) (pdfpcell)).resetRGBColorStroke();
	//* 221  422:goto            61
	}

	private final TableStyleValues styleValues;
}
