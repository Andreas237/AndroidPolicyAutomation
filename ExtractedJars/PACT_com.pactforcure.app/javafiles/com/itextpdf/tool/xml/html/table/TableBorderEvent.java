// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.table;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.*;

// Referenced classes of package com.itextpdf.tool.xml.html.table:
//			TableStyleValues

public class TableBorderEvent
	implements PdfPTableEvent
{

	public TableBorderEvent(TableStyleValues tablestylevalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		styleValues = tablestylevalues;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field TableStyleValues styleValues>
	//    5    9:return          
	}

	public TableStyleValues getTableStyleValues()
	{
		return styleValues;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TableStyleValues styleValues>
	//    2    4:areturn         
	}

	public void tableLayout(PdfPTable pdfptable, float af[][], float af1[], int i, int j, PdfContentByte apdfcontentbyte[])
	{
		float f = styleValues.getBorderWidthLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TableStyleValues styleValues>
	//    2    4:invokevirtual   #26  <Method float TableStyleValues.getBorderWidthLeft()>
	//    3    7:fstore          7
		float f1 = styleValues.getBorderWidthRight();
	//    4    9:aload_0         
	//    5   10:getfield        #15  <Field TableStyleValues styleValues>
	//    6   13:invokevirtual   #29  <Method float TableStyleValues.getBorderWidthRight()>
	//    7   16:fstore          8
		float f2 = styleValues.getBorderWidthTop();
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field TableStyleValues styleValues>
	//   10   22:invokevirtual   #32  <Method float TableStyleValues.getBorderWidthTop()>
	//   11   25:fstore          9
		float f3 = styleValues.getBorderWidthBottom();
	//   12   27:aload_0         
	//   13   28:getfield        #15  <Field TableStyleValues styleValues>
	//   14   31:invokevirtual   #35  <Method float TableStyleValues.getBorderWidthBottom()>
	//   15   34:fstore          10
		pdfptable = ((PdfPTable) (af[0]));
	//   16   36:aload_2         
	//   17   37:iconst_0        
	//   18   38:aaload          
	//   19   39:astore_1        
		float f4 = f / 2.0F;
	//   20   40:fload           7
	//   21   42:fconst_2        
	//   22   43:fdiv            
	//   23   44:fstore          11
		f4 = pdfptable[0] - f4;
	//   24   46:aload_1         
	//   25   47:iconst_0        
	//   26   48:faload          
	//   27   49:fload           11
	//   28   51:fsub            
	//   29   52:fstore          11
		float f5 = f1 / 2.0F;
	//   30   54:fload           8
	//   31   56:fconst_2        
	//   32   57:fdiv            
	//   33   58:fstore          12
		f5 = pdfptable[pdfptable.length - 1] + f5;
	//   34   60:aload_1         
	//   35   61:aload_1         
	//   36   62:arraylength     
	//   37   63:iconst_1        
	//   38   64:isub            
	//   39   65:faload          
	//   40   66:fload           12
	//   41   68:fadd            
	//   42   69:fstore          12
		float f6 = f2 / 2.0F;
	//   43   71:fload           9
	//   44   73:fconst_2        
	//   45   74:fdiv            
	//   46   75:fstore          13
		f6 = af1[0] + f6;
	//   47   77:aload_3         
	//   48   78:iconst_0        
	//   49   79:faload          
	//   50   80:fload           13
	//   51   82:fadd            
	//   52   83:fstore          13
		float f7 = f3 / 2.0F;
	//   53   85:fload           10
	//   54   87:fconst_2        
	//   55   88:fdiv            
	//   56   89:fstore          14
		float f8 = styleValues.getVerBorderSpacing();
	//   57   91:aload_0         
	//   58   92:getfield        #15  <Field TableStyleValues styleValues>
	//   59   95:invokevirtual   #38  <Method float TableStyleValues.getVerBorderSpacing()>
	//   60   98:fstore          15
		f7 = af1[af1.length - 1] - (f7 + f8);
	//   61  100:aload_3         
	//   62  101:aload_3         
	//   63  102:arraylength     
	//   64  103:iconst_1        
	//   65  104:isub            
	//   66  105:faload          
	//   67  106:fload           14
	//   68  108:fload           15
	//   69  110:fadd            
	//   70  111:fsub            
	//   71  112:fstore          14
		pdfptable = ((PdfPTable) (apdfcontentbyte[1]));
	//   72  114:aload           6
	//   73  116:iconst_1        
	//   74  117:aaload          
	//   75  118:astore_1        
		af = ((float [][]) (styleValues.getBackground()));
	//   76  119:aload_0         
	//   77  120:getfield        #15  <Field TableStyleValues styleValues>
	//   78  123:invokevirtual   #42  <Method BaseColor TableStyleValues.getBackground()>
	//   79  126:astore_2        
		if(af != null)
	//*  80  127:aload_2         
	//*  81  128:ifnull          158
		{
			((PdfContentByte) (pdfptable)).setColorFill(((BaseColor) (af)));
	//   82  131:aload_1         
	//   83  132:aload_2         
	//   84  133:invokevirtual   #48  <Method void PdfContentByte.setColorFill(BaseColor)>
			((PdfContentByte) (pdfptable)).rectangle(f4, f6, f5 - f4, f7 - f6);
	//   85  136:aload_1         
	//   86  137:fload           11
	//   87  139:fload           13
	//   88  141:fload           12
	//   89  143:fload           11
	//   90  145:fsub            
	//   91  146:fload           14
	//   92  148:fload           13
	//   93  150:fsub            
	//   94  151:invokevirtual   #52  <Method void PdfContentByte.rectangle(float, float, float, float)>
			((PdfContentByte) (pdfptable)).fill();
	//   95  154:aload_1         
	//   96  155:invokevirtual   #55  <Method void PdfContentByte.fill()>
		}
		af1 = ((float []) (apdfcontentbyte[2]));
	//   97  158:aload           6
	//   98  160:iconst_2        
	//   99  161:aaload          
	//  100  162:astore_3        
		if(f != 0.0F)
	//* 101  163:fload           7
	//* 102  165:fconst_0        
	//* 103  166:fcmpl           
	//* 104  167:ifeq            219
		{
			af = ((float [][]) (styleValues.getBorderColorLeft()));
	//  105  170:aload_0         
	//  106  171:getfield        #15  <Field TableStyleValues styleValues>
	//  107  174:invokevirtual   #58  <Method BaseColor TableStyleValues.getBorderColorLeft()>
	//  108  177:astore_2        
			pdfptable = ((PdfPTable) (af));
	//  109  178:aload_2         
	//  110  179:astore_1        
			if(af == null)
	//* 111  180:aload_2         
	//* 112  181:ifnonnull       188
				pdfptable = ((PdfPTable) (BaseColor.BLACK));
	//  113  184:getstatic       #64  <Field BaseColor BaseColor.BLACK>
	//  114  187:astore_1        
			((PdfContentByte) (af1)).setLineWidth(f);
	//  115  188:aload_3         
	//  116  189:fload           7
	//  117  191:invokevirtual   #68  <Method void PdfContentByte.setLineWidth(float)>
			((PdfContentByte) (af1)).setColorStroke(((BaseColor) (pdfptable)));
	//  118  194:aload_3         
	//  119  195:aload_1         
	//  120  196:invokevirtual   #71  <Method void PdfContentByte.setColorStroke(BaseColor)>
			((PdfContentByte) (af1)).moveTo(f4, f6);
	//  121  199:aload_3         
	//  122  200:fload           11
	//  123  202:fload           13
	//  124  204:invokevirtual   #75  <Method void PdfContentByte.moveTo(float, float)>
			((PdfContentByte) (af1)).lineTo(f4, f7);
	//  125  207:aload_3         
	//  126  208:fload           11
	//  127  210:fload           14
	//  128  212:invokevirtual   #78  <Method void PdfContentByte.lineTo(float, float)>
			((PdfContentByte) (af1)).stroke();
	//  129  215:aload_3         
	//  130  216:invokevirtual   #81  <Method void PdfContentByte.stroke()>
		}
		if(f3 != 0.0F)
	//* 131  219:fload           10
	//* 132  221:fconst_0        
	//* 133  222:fcmpl           
	//* 134  223:ifeq            275
		{
			af = ((float [][]) (styleValues.getBorderColorBottom()));
	//  135  226:aload_0         
	//  136  227:getfield        #15  <Field TableStyleValues styleValues>
	//  137  230:invokevirtual   #84  <Method BaseColor TableStyleValues.getBorderColorBottom()>
	//  138  233:astore_2        
			pdfptable = ((PdfPTable) (af));
	//  139  234:aload_2         
	//  140  235:astore_1        
			if(af == null)
	//* 141  236:aload_2         
	//* 142  237:ifnonnull       244
				pdfptable = ((PdfPTable) (BaseColor.BLACK));
	//  143  240:getstatic       #64  <Field BaseColor BaseColor.BLACK>
	//  144  243:astore_1        
			((PdfContentByte) (af1)).setLineWidth(f3);
	//  145  244:aload_3         
	//  146  245:fload           10
	//  147  247:invokevirtual   #68  <Method void PdfContentByte.setLineWidth(float)>
			((PdfContentByte) (af1)).setColorStroke(((BaseColor) (pdfptable)));
	//  148  250:aload_3         
	//  149  251:aload_1         
	//  150  252:invokevirtual   #71  <Method void PdfContentByte.setColorStroke(BaseColor)>
			((PdfContentByte) (af1)).moveTo(f4, f7);
	//  151  255:aload_3         
	//  152  256:fload           11
	//  153  258:fload           14
	//  154  260:invokevirtual   #75  <Method void PdfContentByte.moveTo(float, float)>
			((PdfContentByte) (af1)).lineTo(f5, f7);
	//  155  263:aload_3         
	//  156  264:fload           12
	//  157  266:fload           14
	//  158  268:invokevirtual   #78  <Method void PdfContentByte.lineTo(float, float)>
			((PdfContentByte) (af1)).stroke();
	//  159  271:aload_3         
	//  160  272:invokevirtual   #81  <Method void PdfContentByte.stroke()>
		}
		if(f1 != 0.0F)
	//* 161  275:fload           8
	//* 162  277:fconst_0        
	//* 163  278:fcmpl           
	//* 164  279:ifeq            331
		{
			af = ((float [][]) (styleValues.getBorderColorRight()));
	//  165  282:aload_0         
	//  166  283:getfield        #15  <Field TableStyleValues styleValues>
	//  167  286:invokevirtual   #87  <Method BaseColor TableStyleValues.getBorderColorRight()>
	//  168  289:astore_2        
			pdfptable = ((PdfPTable) (af));
	//  169  290:aload_2         
	//  170  291:astore_1        
			if(af == null)
	//* 171  292:aload_2         
	//* 172  293:ifnonnull       300
				pdfptable = ((PdfPTable) (BaseColor.BLACK));
	//  173  296:getstatic       #64  <Field BaseColor BaseColor.BLACK>
	//  174  299:astore_1        
			((PdfContentByte) (af1)).setLineWidth(f1);
	//  175  300:aload_3         
	//  176  301:fload           8
	//  177  303:invokevirtual   #68  <Method void PdfContentByte.setLineWidth(float)>
			((PdfContentByte) (af1)).setColorStroke(((BaseColor) (pdfptable)));
	//  178  306:aload_3         
	//  179  307:aload_1         
	//  180  308:invokevirtual   #71  <Method void PdfContentByte.setColorStroke(BaseColor)>
			((PdfContentByte) (af1)).moveTo(f5, f7);
	//  181  311:aload_3         
	//  182  312:fload           12
	//  183  314:fload           14
	//  184  316:invokevirtual   #75  <Method void PdfContentByte.moveTo(float, float)>
			((PdfContentByte) (af1)).lineTo(f5, f6);
	//  185  319:aload_3         
	//  186  320:fload           12
	//  187  322:fload           13
	//  188  324:invokevirtual   #78  <Method void PdfContentByte.lineTo(float, float)>
			((PdfContentByte) (af1)).stroke();
	//  189  327:aload_3         
	//  190  328:invokevirtual   #81  <Method void PdfContentByte.stroke()>
		}
		if(f2 != 0.0F)
	//* 191  331:fload           9
	//* 192  333:fconst_0        
	//* 193  334:fcmpl           
	//* 194  335:ifeq            387
		{
			af = ((float [][]) (styleValues.getBorderColorTop()));
	//  195  338:aload_0         
	//  196  339:getfield        #15  <Field TableStyleValues styleValues>
	//  197  342:invokevirtual   #90  <Method BaseColor TableStyleValues.getBorderColorTop()>
	//  198  345:astore_2        
			pdfptable = ((PdfPTable) (af));
	//  199  346:aload_2         
	//  200  347:astore_1        
			if(af == null)
	//* 201  348:aload_2         
	//* 202  349:ifnonnull       356
				pdfptable = ((PdfPTable) (BaseColor.BLACK));
	//  203  352:getstatic       #64  <Field BaseColor BaseColor.BLACK>
	//  204  355:astore_1        
			((PdfContentByte) (af1)).setLineWidth(f2);
	//  205  356:aload_3         
	//  206  357:fload           9
	//  207  359:invokevirtual   #68  <Method void PdfContentByte.setLineWidth(float)>
			((PdfContentByte) (af1)).setColorStroke(((BaseColor) (pdfptable)));
	//  208  362:aload_3         
	//  209  363:aload_1         
	//  210  364:invokevirtual   #71  <Method void PdfContentByte.setColorStroke(BaseColor)>
			((PdfContentByte) (af1)).moveTo(f5, f6);
	//  211  367:aload_3         
	//  212  368:fload           12
	//  213  370:fload           13
	//  214  372:invokevirtual   #75  <Method void PdfContentByte.moveTo(float, float)>
			((PdfContentByte) (af1)).lineTo(f4, f6);
	//  215  375:aload_3         
	//  216  376:fload           11
	//  217  378:fload           13
	//  218  380:invokevirtual   #78  <Method void PdfContentByte.lineTo(float, float)>
			((PdfContentByte) (af1)).stroke();
	//  219  383:aload_3         
	//  220  384:invokevirtual   #81  <Method void PdfContentByte.stroke()>
		}
		((PdfContentByte) (af1)).resetRGBColorStroke();
	//  221  387:aload_3         
	//  222  388:invokevirtual   #93  <Method void PdfContentByte.resetRGBColorStroke()>
	//  223  391:return          
	}

	private final TableStyleValues styleValues;
}
