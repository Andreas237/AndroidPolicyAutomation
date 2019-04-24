// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseField, BaseFont, PdfAppearance, PdfFormField, 
//			PdfAnnotation, PdfBorderDictionary, PdfDashPattern, PdfWriter

public class RadioCheckField extends BaseField
{

	public RadioCheckField(PdfWriter pdfwriter, Rectangle rectangle, String s, String s1)
	{
		super(pdfwriter, rectangle, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #48  <Method void BaseField(PdfWriter, Rectangle, String)>
		setOnValue(s1);
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:invokevirtual   #52  <Method void setOnValue(String)>
		setCheckType(2);
	//    8   13:aload_0         
	//    9   14:iconst_2        
	//   10   15:invokevirtual   #56  <Method void setCheckType(int)>
	//   11   18:return          
	}

	public PdfAppearance getAppearance(boolean flag, boolean flag1)
		throws IOException, DocumentException
	{
		PdfAppearance pdfappearance;
		if(flag && checkType == 2)
	//*   0    0:iload_1         
	//*   1    1:ifeq            22
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int checkType>
	//*   4    8:iconst_2        
	//*   5    9:icmpne          22
		{
			pdfappearance = getAppearanceRadioCircle(flag1);
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #68  <Method PdfAppearance getAppearanceRadioCircle(boolean)>
	//    9   17:astore          10
		} else
	//*  10   19:aload           10
	//*  11   21:areturn         
		{
			PdfAppearance pdfappearance1 = getBorderAppearance();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #72  <Method PdfAppearance getBorderAppearance()>
	//   14   26:astore          11
			pdfappearance = pdfappearance1;
	//   15   28:aload           11
	//   16   30:astore          10
			if(flag1)
	//*  17   32:iload_2         
	//*  18   33:ifeq            19
			{
				BaseFont basefont = getRealFont();
	//   19   36:aload_0         
	//   20   37:invokevirtual   #76  <Method BaseFont getRealFont()>
	//   21   40:astore          10
				float f;
				float f1;
				float f2;
				float f3;
				float f4;
				float f5;
				boolean flag2;
				if(borderStyle == 2 || borderStyle == 3)
	//*  22   42:aload_0         
	//*  23   43:getfield        #79  <Field int borderStyle>
	//*  24   46:iconst_2        
	//*  25   47:icmpeq          58
	//*  26   50:aload_0         
	//*  27   51:getfield        #79  <Field int borderStyle>
	//*  28   54:iconst_3        
	//*  29   55:icmpne          344
					flag2 = true;
	//   30   58:iconst_1        
	//   31   59:istore          9
				else
	//*  32   61:aload_0         
	//*  33   62:getfield        #83  <Field Rectangle box>
	//*  34   65:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//*  35   68:aload_0         
	//*  36   69:getfield        #93  <Field float borderWidth>
	//*  37   72:fconst_2        
	//*  38   73:fmul            
	//*  39   74:fsub            
	//*  40   75:fstore          6
	//*  41   77:aload_0         
	//*  42   78:getfield        #93  <Field float borderWidth>
	//*  43   81:fstore          5
	//*  44   83:fload           5
	//*  45   85:fstore          4
	//*  46   87:fload           6
	//*  47   89:fstore_3        
	//*  48   90:iload           9
	//*  49   92:ifeq            111
	//*  50   95:fload           6
	//*  51   97:aload_0         
	//*  52   98:getfield        #93  <Field float borderWidth>
	//*  53  101:fconst_2        
	//*  54  102:fmul            
	//*  55  103:fsub            
	//*  56  104:fstore_3        
	//*  57  105:fload           5
	//*  58  107:fconst_2        
	//*  59  108:fmul            
	//*  60  109:fstore          4
	//*  61  111:iload           9
	//*  62  113:ifeq            350
	//*  63  116:fconst_2        
	//*  64  117:aload_0         
	//*  65  118:getfield        #93  <Field float borderWidth>
	//*  66  121:fmul            
	//*  67  122:fstore          5
	//*  68  124:fload           4
	//*  69  126:fload           5
	//*  70  128:fconst_1        
	//*  71  129:invokestatic    #99  <Method float Math.max(float, float)>
	//*  72  132:invokestatic    #102 <Method float Math.min(float, float)>
	//*  73  135:fstore          6
	//*  74  137:aload_0         
	//*  75  138:getfield        #83  <Field Rectangle box>
	//*  76  141:invokevirtual   #105 <Method float Rectangle.getWidth()>
	//*  77  144:fconst_2        
	//*  78  145:fload           6
	//*  79  147:fmul            
	//*  80  148:fsub            
	//*  81  149:fstore          7
	//*  82  151:aload_0         
	//*  83  152:getfield        #83  <Field Rectangle box>
	//*  84  155:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//*  85  158:fstore          8
	//*  86  160:aload_0         
	//*  87  161:getfield        #108 <Field float fontSize>
	//*  88  164:fstore          5
	//*  89  166:fload           5
	//*  90  168:fstore          4
	//*  91  170:fload           5
	//*  92  172:fconst_0        
	//*  93  173:fcmpl           
	//*  94  174:ifne            216
	//*  95  177:aload           10
	//*  96  179:aload_0         
	//*  97  180:getfield        #111 <Field String text>
	//*  98  183:fconst_1        
	//*  99  184:invokevirtual   #117 <Method float BaseFont.getWidthPoint(String, float)>
	//* 100  187:fstore          4
	//* 101  189:fload           4
	//* 102  191:fconst_0        
	//* 103  192:fcmpl           
	//* 104  193:ifne            359
	//* 105  196:ldc1            #118 <Float 12F>
	//* 106  198:fstore          4
	//* 107  200:fload           4
	//* 108  202:fload_3         
	//* 109  203:aload           10
	//* 110  205:iconst_1        
	//* 111  206:fconst_1        
	//* 112  207:invokevirtual   #122 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 113  210:fdiv            
	//* 114  211:invokestatic    #102 <Method float Math.min(float, float)>
	//* 115  214:fstore          4
	//* 116  216:aload           11
	//* 117  218:invokevirtual   #127 <Method void PdfAppearance.saveState()>
	//* 118  221:aload           11
	//* 119  223:fload           6
	//* 120  225:fload           6
	//* 121  227:fload           7
	//* 122  229:fload           8
	//* 123  231:fconst_2        
	//* 124  232:fload           6
	//* 125  234:fmul            
	//* 126  235:fsub            
	//* 127  236:invokevirtual   #131 <Method void PdfAppearance.rectangle(float, float, float, float)>
	//* 128  239:aload           11
	//* 129  241:invokevirtual   #134 <Method void PdfAppearance.clip()>
	//* 130  244:aload           11
	//* 131  246:invokevirtual   #137 <Method void PdfAppearance.newPath()>
	//* 132  249:aload_0         
	//* 133  250:getfield        #141 <Field com.itextpdf.text.BaseColor textColor>
	//* 134  253:ifnonnull       369
	//* 135  256:aload           11
	//* 136  258:invokevirtual   #144 <Method void PdfAppearance.resetGrayFill()>
	//* 137  261:aload           11
	//* 138  263:invokevirtual   #147 <Method void PdfAppearance.beginText()>
	//* 139  266:aload           11
	//* 140  268:aload           10
	//* 141  270:fload           4
	//* 142  272:invokevirtual   #151 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
	//* 143  275:aload           11
	//* 144  277:aload_0         
	//* 145  278:getfield        #83  <Field Rectangle box>
	//* 146  281:invokevirtual   #105 <Method float Rectangle.getWidth()>
	//* 147  284:aload           10
	//* 148  286:aload_0         
	//* 149  287:getfield        #111 <Field String text>
	//* 150  290:fload           4
	//* 151  292:invokevirtual   #117 <Method float BaseFont.getWidthPoint(String, float)>
	//* 152  295:fsub            
	//* 153  296:fconst_2        
	//* 154  297:fdiv            
	//* 155  298:aload_0         
	//* 156  299:getfield        #83  <Field Rectangle box>
	//* 157  302:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//* 158  305:aload           10
	//* 159  307:aload_0         
	//* 160  308:getfield        #111 <Field String text>
	//* 161  311:fload           4
	//* 162  313:invokevirtual   #154 <Method float BaseFont.getAscentPoint(String, float)>
	//* 163  316:fsub            
	//* 164  317:fconst_2        
	//* 165  318:fdiv            
	//* 166  319:invokevirtual   #158 <Method void PdfAppearance.setTextMatrix(float, float)>
	//* 167  322:aload           11
	//* 168  324:aload_0         
	//* 169  325:getfield        #111 <Field String text>
	//* 170  328:invokevirtual   #161 <Method void PdfAppearance.showText(String)>
	//* 171  331:aload           11
	//* 172  333:invokevirtual   #164 <Method void PdfAppearance.endText()>
	//* 173  336:aload           11
	//* 174  338:invokevirtual   #167 <Method void PdfAppearance.restoreState()>
	//* 175  341:aload           11
	//* 176  343:areturn         
					flag2 = false;
	//  177  344:iconst_0        
	//  178  345:istore          9
				f3 = box.getHeight() - borderWidth * 2.0F;
				f2 = borderWidth;
				f1 = f2;
				f = f3;
				if(flag2)
				{
					f = f3 - borderWidth * 2.0F;
					f1 = f2 * 2.0F;
				}
				if(flag2)
					f2 = 2.0F * borderWidth;
				else
	//* 179  347:goto            61
					f2 = borderWidth;
	//  180  350:aload_0         
	//  181  351:getfield        #93  <Field float borderWidth>
	//  182  354:fstore          5
				f3 = Math.min(f1, Math.max(f2, 1.0F));
				f4 = box.getWidth() - 2.0F * f3;
				f5 = box.getHeight();
				f2 = fontSize;
				f1 = f2;
				if(f2 == 0.0F)
				{
					f1 = basefont.getWidthPoint(text, 1.0F);
					if(f1 == 0.0F)
						f1 = 12F;
					else
	//* 183  356:goto            124
						f1 = f4 / f1;
	//  184  359:fload           7
	//  185  361:fload           4
	//  186  363:fdiv            
	//  187  364:fstore          4
					f1 = Math.min(f1, f / basefont.getFontDescriptor(1, 1.0F));
				}
				pdfappearance1.saveState();
				pdfappearance1.rectangle(f3, f3, f4, f5 - 2.0F * f3);
				pdfappearance1.clip();
				pdfappearance1.newPath();
				if(textColor == null)
					pdfappearance1.resetGrayFill();
				else
	//* 188  366:goto            200
					pdfappearance1.setColorFill(textColor);
	//  189  369:aload           11
	//  190  371:aload_0         
	//  191  372:getfield        #141 <Field com.itextpdf.text.BaseColor textColor>
	//  192  375:invokevirtual   #171 <Method void PdfAppearance.setColorFill(com.itextpdf.text.BaseColor)>
				pdfappearance1.beginText();
				pdfappearance1.setFontAndSize(basefont, f1);
				pdfappearance1.setTextMatrix((box.getWidth() - basefont.getWidthPoint(text, f1)) / 2.0F, (box.getHeight() - basefont.getAscentPoint(text, f1)) / 2.0F);
				pdfappearance1.showText(text);
				pdfappearance1.endText();
				pdfappearance1.restoreState();
				return pdfappearance1;
			}
		}
		return pdfappearance;
	//* 193  378:goto            261
	}

	public PdfAppearance getAppearanceRadioCircle(boolean flag)
	{
		PdfAppearance pdfappearance = PdfAppearance.createAppearance(writer, box.getWidth(), box.getHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field PdfWriter writer>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field Rectangle box>
	//    4    8:invokevirtual   #105 <Method float Rectangle.getWidth()>
	//    5   11:aload_0         
	//    6   12:getfield        #83  <Field Rectangle box>
	//    7   15:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//    8   18:invokestatic    #180 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//    9   21:astore          5
		rotation;
	//   10   23:aload_0         
	//   11   24:getfield        #183 <Field int rotation>
		JVM INSTR lookupswitch 3: default 60
	//	               90: 122
	//	               180: 143
	//	               270: 171;
	//   12   27:lookupswitch    3: default 60
	//	               90: 122
	//	               180: 143
	//	               270: 171
		   goto _L1 _L2 _L3 _L4
_L1:
		float f;
		float f1;
		float f2;
		Rectangle rectangle = new Rectangle(pdfappearance.getBoundingBox());
	//   13   60:new             #85  <Class Rectangle>
	//   14   63:dup             
	//   15   64:aload           5
	//   16   66:invokevirtual   #187 <Method Rectangle PdfAppearance.getBoundingBox()>
	//   17   69:invokespecial   #190 <Method void Rectangle(Rectangle)>
	//   18   72:astore          6
		f = rectangle.getWidth() / 2.0F;
	//   19   74:aload           6
	//   20   76:invokevirtual   #105 <Method float Rectangle.getWidth()>
	//   21   79:fconst_2        
	//   22   80:fdiv            
	//   23   81:fstore_2        
		f1 = rectangle.getHeight() / 2.0F;
	//   24   82:aload           6
	//   25   84:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//   26   87:fconst_2        
	//   27   88:fdiv            
	//   28   89:fstore_3        
		f2 = (Math.min(rectangle.getWidth(), rectangle.getHeight()) - borderWidth) / 2.0F;
	//   29   90:aload           6
	//   30   92:invokevirtual   #105 <Method float Rectangle.getWidth()>
	//   31   95:aload           6
	//   32   97:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//   33  100:invokestatic    #102 <Method float Math.min(float, float)>
	//   34  103:aload_0         
	//   35  104:getfield        #93  <Field float borderWidth>
	//   36  107:fsub            
	//   37  108:fconst_2        
	//   38  109:fdiv            
	//   39  110:fstore          4
		if(f2 > 0.0F) goto _L6; else goto _L5
	//   40  112:fload           4
	//   41  114:fconst_0        
	//   42  115:fcmpg           
	//   43  116:ifgt            192
_L5:
		return pdfappearance;
	//   44  119:aload           5
	//   45  121:areturn         
_L2:
		pdfappearance.setMatrix(0.0F, 1.0F, -1F, 0.0F, box.getHeight(), 0.0F);
	//   46  122:aload           5
	//   47  124:fconst_0        
	//   48  125:fconst_1        
	//   49  126:ldc1            #191 <Float -1F>
	//   50  128:fconst_0        
	//   51  129:aload_0         
	//   52  130:getfield        #83  <Field Rectangle box>
	//   53  133:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//   54  136:fconst_0        
	//   55  137:invokevirtual   #195 <Method void PdfAppearance.setMatrix(float, float, float, float, float, float)>
		continue; /* Loop/switch isn't completed */
	//   56  140:goto            60
_L3:
		pdfappearance.setMatrix(-1F, 0.0F, 0.0F, -1F, box.getWidth(), box.getHeight());
	//   57  143:aload           5
	//   58  145:ldc1            #191 <Float -1F>
	//   59  147:fconst_0        
	//   60  148:fconst_0        
	//   61  149:ldc1            #191 <Float -1F>
	//   62  151:aload_0         
	//   63  152:getfield        #83  <Field Rectangle box>
	//   64  155:invokevirtual   #105 <Method float Rectangle.getWidth()>
	//   65  158:aload_0         
	//   66  159:getfield        #83  <Field Rectangle box>
	//   67  162:invokevirtual   #89  <Method float Rectangle.getHeight()>
	//   68  165:invokevirtual   #195 <Method void PdfAppearance.setMatrix(float, float, float, float, float, float)>
		continue; /* Loop/switch isn't completed */
	//   69  168:goto            60
_L4:
		pdfappearance.setMatrix(0.0F, -1F, 1.0F, 0.0F, 0.0F, box.getWidth());
	//   70  171:aload           5
	//   71  173:fconst_0        
	//   72  174:ldc1            #191 <Float -1F>
	//   73  176:fconst_1        
	//   74  177:fconst_0        
	//   75  178:fconst_0        
	//   76  179:aload_0         
	//   77  180:getfield        #83  <Field Rectangle box>
	//   78  183:invokevirtual   #105 <Method float Rectangle.getWidth()>
	//   79  186:invokevirtual   #195 <Method void PdfAppearance.setMatrix(float, float, float, float, float, float)>
		continue; /* Loop/switch isn't completed */
	//   80  189:goto            60
_L6:
		if(backgroundColor != null)
	//*  81  192:aload_0         
	//*  82  193:getfield        #198 <Field com.itextpdf.text.BaseColor backgroundColor>
	//*  83  196:ifnull          229
		{
			pdfappearance.setColorFill(backgroundColor);
	//   84  199:aload           5
	//   85  201:aload_0         
	//   86  202:getfield        #198 <Field com.itextpdf.text.BaseColor backgroundColor>
	//   87  205:invokevirtual   #171 <Method void PdfAppearance.setColorFill(com.itextpdf.text.BaseColor)>
			pdfappearance.circle(f, f1, borderWidth / 2.0F + f2);
	//   88  208:aload           5
	//   89  210:fload_2         
	//   90  211:fload_3         
	//   91  212:aload_0         
	//   92  213:getfield        #93  <Field float borderWidth>
	//   93  216:fconst_2        
	//   94  217:fdiv            
	//   95  218:fload           4
	//   96  220:fadd            
	//   97  221:invokevirtual   #202 <Method void PdfAppearance.circle(float, float, float)>
			pdfappearance.fill();
	//   98  224:aload           5
	//   99  226:invokevirtual   #205 <Method void PdfAppearance.fill()>
		}
		if(borderWidth > 0.0F && borderColor != null)
	//* 100  229:aload_0         
	//* 101  230:getfield        #93  <Field float borderWidth>
	//* 102  233:fconst_0        
	//* 103  234:fcmpl           
	//* 104  235:ifle            277
	//* 105  238:aload_0         
	//* 106  239:getfield        #208 <Field com.itextpdf.text.BaseColor borderColor>
	//* 107  242:ifnull          277
		{
			pdfappearance.setLineWidth(borderWidth);
	//  108  245:aload           5
	//  109  247:aload_0         
	//  110  248:getfield        #93  <Field float borderWidth>
	//  111  251:invokevirtual   #212 <Method void PdfAppearance.setLineWidth(float)>
			pdfappearance.setColorStroke(borderColor);
	//  112  254:aload           5
	//  113  256:aload_0         
	//  114  257:getfield        #208 <Field com.itextpdf.text.BaseColor borderColor>
	//  115  260:invokevirtual   #215 <Method void PdfAppearance.setColorStroke(com.itextpdf.text.BaseColor)>
			pdfappearance.circle(f, f1, f2);
	//  116  263:aload           5
	//  117  265:fload_2         
	//  118  266:fload_3         
	//  119  267:fload           4
	//  120  269:invokevirtual   #202 <Method void PdfAppearance.circle(float, float, float)>
			pdfappearance.stroke();
	//  121  272:aload           5
	//  122  274:invokevirtual   #218 <Method void PdfAppearance.stroke()>
		}
		if(!flag) goto _L5; else goto _L7
	//  123  277:iload_1         
	//  124  278:ifeq            119
_L7:
		if(textColor == null)
	//* 125  281:aload_0         
	//* 126  282:getfield        #141 <Field com.itextpdf.text.BaseColor textColor>
	//* 127  285:ifnonnull       312
			pdfappearance.resetGrayFill();
	//  128  288:aload           5
	//  129  290:invokevirtual   #144 <Method void PdfAppearance.resetGrayFill()>
		else
	//* 130  293:aload           5
	//* 131  295:fload_2         
	//* 132  296:fload_3         
	//* 133  297:fload           4
	//* 134  299:fconst_2        
	//* 135  300:fdiv            
	//* 136  301:invokevirtual   #202 <Method void PdfAppearance.circle(float, float, float)>
	//* 137  304:aload           5
	//* 138  306:invokevirtual   #205 <Method void PdfAppearance.fill()>
	//* 139  309:aload           5
	//* 140  311:areturn         
			pdfappearance.setColorFill(textColor);
	//  141  312:aload           5
	//  142  314:aload_0         
	//  143  315:getfield        #141 <Field com.itextpdf.text.BaseColor textColor>
	//  144  318:invokevirtual   #171 <Method void PdfAppearance.setColorFill(com.itextpdf.text.BaseColor)>
		pdfappearance.circle(f, f1, f2 / 2.0F);
		pdfappearance.fill();
		return pdfappearance;
		if(true) goto _L1; else goto _L8
	//  145  321:goto            293
_L8:
	}

	public PdfFormField getCheckField()
		throws IOException, DocumentException
	{
		return getField(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #224 <Method PdfFormField getField(boolean)>
	//    3    5:areturn         
	}

	public int getCheckType()
	{
		return checkType;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int checkType>
	//    2    4:ireturn         
	}

	protected PdfFormField getField(boolean flag)
		throws IOException, DocumentException
	{
		PdfFormField pdfformfield;
		Object obj;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            319
			pdfformfield = PdfFormField.createEmpty(writer);
	//    2    4:aload_0         
	//    3    5:getfield        #176 <Field PdfWriter writer>
	//    4    8:invokestatic    #232 <Method PdfFormField PdfFormField.createEmpty(PdfWriter)>
	//    5   11:astore_2        
		else
	//*   6   12:aload_2         
	//*   7   13:aload_0         
	//*   8   14:getfield        #83  <Field Rectangle box>
	//*   9   17:getstatic       #238 <Field PdfName PdfAnnotation.HIGHLIGHT_INVERT>
	//*  10   20:invokevirtual   #242 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
	//*  11   23:iload_1         
	//*  12   24:ifne            90
	//*  13   27:aload_2         
	//*  14   28:aload_0         
	//*  15   29:getfield        #245 <Field String fieldName>
	//*  16   32:invokevirtual   #248 <Method void PdfFormField.setFieldName(String)>
	//*  17   35:aload_0         
	//*  18   36:getfield        #251 <Field int options>
	//*  19   39:iconst_1        
	//*  20   40:iand            
	//*  21   41:ifeq            50
	//*  22   44:aload_2         
	//*  23   45:iconst_1        
	//*  24   46:invokevirtual   #255 <Method int PdfFormField.setFieldFlags(int)>
	//*  25   49:pop             
	//*  26   50:aload_0         
	//*  27   51:getfield        #251 <Field int options>
	//*  28   54:iconst_2        
	//*  29   55:iand            
	//*  30   56:ifeq            65
	//*  31   59:aload_2         
	//*  32   60:iconst_2        
	//*  33   61:invokevirtual   #255 <Method int PdfFormField.setFieldFlags(int)>
	//*  34   64:pop             
	//*  35   65:aload_0         
	//*  36   66:getfield        #257 <Field boolean checked>
	//*  37   69:ifeq            330
	//*  38   72:aload_0         
	//*  39   73:getfield        #259 <Field String onValue>
	//*  40   76:astore_3        
	//*  41   77:aload_2         
	//*  42   78:aload_3         
	//*  43   79:invokevirtual   #262 <Method void PdfFormField.setValueAsName(String)>
	//*  44   82:aload_0         
	//*  45   83:aload_0         
	//*  46   84:getfield        #64  <Field int checkType>
	//*  47   87:invokevirtual   #56  <Method void setCheckType(int)>
	//*  48   90:aload_0         
	//*  49   91:getfield        #111 <Field String text>
	//*  50   94:ifnull          105
	//*  51   97:aload_2         
	//*  52   98:aload_0         
	//*  53   99:getfield        #111 <Field String text>
	//*  54  102:invokevirtual   #265 <Method void PdfFormField.setMKNormalCaption(String)>
	//*  55  105:aload_0         
	//*  56  106:getfield        #183 <Field int rotation>
	//*  57  109:ifeq            120
	//*  58  112:aload_2         
	//*  59  113:aload_0         
	//*  60  114:getfield        #183 <Field int rotation>
	//*  61  117:invokevirtual   #268 <Method void PdfFormField.setMKRotation(int)>
	//*  62  120:aload_2         
	//*  63  121:new             #270 <Class PdfBorderDictionary>
	//*  64  124:dup             
	//*  65  125:aload_0         
	//*  66  126:getfield        #93  <Field float borderWidth>
	//*  67  129:aload_0         
	//*  68  130:getfield        #79  <Field int borderStyle>
	//*  69  133:new             #272 <Class PdfDashPattern>
	//*  70  136:dup             
	//*  71  137:ldc2            #273 <Float 3F>
	//*  72  140:invokespecial   #275 <Method void PdfDashPattern(float)>
	//*  73  143:invokespecial   #278 <Method void PdfBorderDictionary(float, int, PdfDashPattern)>
	//*  74  146:invokevirtual   #282 <Method void PdfFormField.setBorderStyle(PdfBorderDictionary)>
	//*  75  149:aload_0         
	//*  76  150:iload_1         
	//*  77  151:iconst_1        
	//*  78  152:invokevirtual   #284 <Method PdfAppearance getAppearance(boolean, boolean)>
	//*  79  155:astore          4
	//*  80  157:aload_0         
	//*  81  158:iload_1         
	//*  82  159:iconst_0        
	//*  83  160:invokevirtual   #284 <Method PdfAppearance getAppearance(boolean, boolean)>
	//*  84  163:astore_3        
	//*  85  164:aload_2         
	//*  86  165:getstatic       #287 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//*  87  168:aload_0         
	//*  88  169:getfield        #259 <Field String onValue>
	//*  89  172:aload           4
	//*  90  174:invokevirtual   #291 <Method void PdfFormField.setAppearance(PdfName, String, PdfTemplate)>
	//*  91  177:aload_2         
	//*  92  178:getstatic       #287 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//*  93  181:ldc2            #293 <String "Off">
	//*  94  184:aload_3         
	//*  95  185:invokevirtual   #291 <Method void PdfFormField.setAppearance(PdfName, String, PdfTemplate)>
	//*  96  188:aload_0         
	//*  97  189:getfield        #257 <Field boolean checked>
	//*  98  192:ifeq            337
	//*  99  195:aload_0         
	//* 100  196:getfield        #259 <Field String onValue>
	//* 101  199:astore_3        
	//* 102  200:aload_2         
	//* 103  201:aload_3         
	//* 104  202:invokevirtual   #296 <Method void PdfFormField.setAppearanceState(String)>
	//* 105  205:aload           4
	//* 106  207:invokevirtual   #300 <Method PdfContentByte PdfAppearance.getDuplicate()>
	//* 107  210:checkcast       #124 <Class PdfAppearance>
	//* 108  213:astore_3        
	//* 109  214:aload_0         
	//* 110  215:invokevirtual   #76  <Method BaseFont getRealFont()>
	//* 111  218:ifnull          233
	//* 112  221:aload_3         
	//* 113  222:aload_0         
	//* 114  223:invokevirtual   #76  <Method BaseFont getRealFont()>
	//* 115  226:aload_0         
	//* 116  227:getfield        #108 <Field float fontSize>
	//* 117  230:invokevirtual   #151 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
	//* 118  233:aload_0         
	//* 119  234:getfield        #141 <Field com.itextpdf.text.BaseColor textColor>
	//* 120  237:ifnonnull       344
	//* 121  240:aload_3         
	//* 122  241:fconst_0        
	//* 123  242:invokevirtual   #303 <Method void PdfAppearance.setGrayFill(float)>
	//* 124  245:aload_2         
	//* 125  246:aload_3         
	//* 126  247:invokevirtual   #307 <Method void PdfFormField.setDefaultAppearanceString(PdfContentByte)>
	//* 127  250:aload_0         
	//* 128  251:getfield        #208 <Field com.itextpdf.text.BaseColor borderColor>
	//* 129  254:ifnull          265
	//* 130  257:aload_2         
	//* 131  258:aload_0         
	//* 132  259:getfield        #208 <Field com.itextpdf.text.BaseColor borderColor>
	//* 133  262:invokevirtual   #310 <Method void PdfFormField.setMKBorderColor(com.itextpdf.text.BaseColor)>
	//* 134  265:aload_0         
	//* 135  266:getfield        #198 <Field com.itextpdf.text.BaseColor backgroundColor>
	//* 136  269:ifnull          280
	//* 137  272:aload_2         
	//* 138  273:aload_0         
	//* 139  274:getfield        #198 <Field com.itextpdf.text.BaseColor backgroundColor>
	//* 140  277:invokevirtual   #313 <Method void PdfFormField.setMKBackgroundColor(com.itextpdf.text.BaseColor)>
	//* 141  280:aload_0         
	//* 142  281:getfield        #316 <Field int visibility>
	//* 143  284:tableswitch     1 3: default 312
	//	               1 355
	//	               2 317
	//	               3 363
	//* 144  312:aload_2         
	//* 145  313:iconst_4        
	//* 146  314:invokevirtual   #319 <Method void PdfFormField.setFlags(int)>
	//* 147  317:aload_2         
	//* 148  318:areturn         
			pdfformfield = PdfFormField.createCheckBox(writer);
	//  149  319:aload_0         
	//  150  320:getfield        #176 <Field PdfWriter writer>
	//  151  323:invokestatic    #322 <Method PdfFormField PdfFormField.createCheckBox(PdfWriter)>
	//  152  326:astore_2        
		pdfformfield.setWidget(box, PdfAnnotation.HIGHLIGHT_INVERT);
		if(!flag)
		{
			pdfformfield.setFieldName(fieldName);
			if((options & 1) != 0)
				pdfformfield.setFieldFlags(1);
			if((options & 2) != 0)
				pdfformfield.setFieldFlags(2);
			PdfAppearance pdfappearance;
			if(checked)
				obj = ((Object) (onValue));
			else
	//* 153  327:goto            12
				obj = "Off";
	//  154  330:ldc2            #293 <String "Off">
	//  155  333:astore_3        
			pdfformfield.setValueAsName(((String) (obj)));
			setCheckType(checkType);
		}
		if(text != null)
			pdfformfield.setMKNormalCaption(text);
		if(rotation != 0)
			pdfformfield.setMKRotation(rotation);
		pdfformfield.setBorderStyle(new PdfBorderDictionary(borderWidth, borderStyle, new PdfDashPattern(3F)));
		pdfappearance = getAppearance(flag, true);
		obj = ((Object) (getAppearance(flag, false)));
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, onValue, ((PdfTemplate) (pdfappearance)));
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, "Off", ((PdfTemplate) (obj)));
		if(checked)
			obj = ((Object) (onValue));
		else
	//* 156  334:goto            77
			obj = "Off";
	//  157  337:ldc2            #293 <String "Off">
	//  158  340:astore_3        
		pdfformfield.setAppearanceState(((String) (obj)));
		obj = ((Object) ((PdfAppearance)pdfappearance.getDuplicate()));
		if(getRealFont() != null)
			((PdfAppearance) (obj)).setFontAndSize(getRealFont(), fontSize);
		if(textColor == null)
			((PdfAppearance) (obj)).setGrayFill(0.0F);
		else
	//* 159  341:goto            200
			((PdfAppearance) (obj)).setColorFill(textColor);
	//  160  344:aload_3         
	//  161  345:aload_0         
	//  162  346:getfield        #141 <Field com.itextpdf.text.BaseColor textColor>
	//  163  349:invokevirtual   #171 <Method void PdfAppearance.setColorFill(com.itextpdf.text.BaseColor)>
		pdfformfield.setDefaultAppearanceString(((PdfContentByte) (obj)));
		if(borderColor != null)
			pdfformfield.setMKBorderColor(borderColor);
		if(backgroundColor != null)
			pdfformfield.setMKBackgroundColor(backgroundColor);
		switch(visibility)
		{
		default:
			pdfformfield.setFlags(4);
			// fall through

		case 2: // '\002'
			return pdfformfield;

	//* 164  352:goto            245
		case 1: // '\001'
			pdfformfield.setFlags(6);
	//  165  355:aload_2         
	//  166  356:bipush          6
	//  167  358:invokevirtual   #319 <Method void PdfFormField.setFlags(int)>
			return pdfformfield;
	//  168  361:aload_2         
	//  169  362:areturn         

		case 3: // '\003'
			pdfformfield.setFlags(36);
	//  170  363:aload_2         
	//  171  364:bipush          36
	//  172  366:invokevirtual   #319 <Method void PdfFormField.setFlags(int)>
			break;
		}
		return pdfformfield;
	//  173  369:aload_2         
	//  174  370:areturn         
	}

	public String getOnValue()
	{
		return onValue;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field String onValue>
	//    2    4:areturn         
	}

	public PdfFormField getRadioField()
		throws IOException, DocumentException
	{
		return getField(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #224 <Method PdfFormField getField(boolean)>
	//    3    5:areturn         
	}

	public PdfFormField getRadioGroup(boolean flag, boolean flag1)
	{
		PdfFormField pdfformfield = PdfFormField.createRadioButton(writer, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field PdfWriter writer>
	//    2    4:iload_1         
	//    3    5:invokestatic    #331 <Method PdfFormField PdfFormField.createRadioButton(PdfWriter, boolean)>
	//    4    8:astore          4
		if(flag1)
	//*   5   10:iload_2         
	//*   6   11:ifeq            23
			pdfformfield.setFieldFlags(0x2000000);
	//    7   14:aload           4
	//    8   16:ldc2            #332 <Int 0x2000000>
	//    9   19:invokevirtual   #255 <Method int PdfFormField.setFieldFlags(int)>
	//   10   22:pop             
		pdfformfield.setFieldName(fieldName);
	//   11   23:aload           4
	//   12   25:aload_0         
	//   13   26:getfield        #245 <Field String fieldName>
	//   14   29:invokevirtual   #248 <Method void PdfFormField.setFieldName(String)>
		if((options & 1) != 0)
	//*  15   32:aload_0         
	//*  16   33:getfield        #251 <Field int options>
	//*  17   36:iconst_1        
	//*  18   37:iand            
	//*  19   38:ifeq            48
			pdfformfield.setFieldFlags(1);
	//   20   41:aload           4
	//   21   43:iconst_1        
	//   22   44:invokevirtual   #255 <Method int PdfFormField.setFieldFlags(int)>
	//   23   47:pop             
		if((options & 2) != 0)
	//*  24   48:aload_0         
	//*  25   49:getfield        #251 <Field int options>
	//*  26   52:iconst_2        
	//*  27   53:iand            
	//*  28   54:ifeq            64
			pdfformfield.setFieldFlags(2);
	//   29   57:aload           4
	//   30   59:iconst_2        
	//   31   60:invokevirtual   #255 <Method int PdfFormField.setFieldFlags(int)>
	//   32   63:pop             
		String s;
		if(checked)
	//*  33   64:aload_0         
	//*  34   65:getfield        #257 <Field boolean checked>
	//*  35   68:ifeq            85
			s = onValue;
	//   36   71:aload_0         
	//   37   72:getfield        #259 <Field String onValue>
	//   38   75:astore_3        
		else
	//*  39   76:aload           4
	//*  40   78:aload_3         
	//*  41   79:invokevirtual   #262 <Method void PdfFormField.setValueAsName(String)>
	//*  42   82:aload           4
	//*  43   84:areturn         
			s = "Off";
	//   44   85:ldc2            #293 <String "Off">
	//   45   88:astore_3        
		pdfformfield.setValueAsName(s);
		return pdfformfield;
	//*  46   89:goto            76
	}

	public boolean isChecked()
	{
		return checked;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field boolean checked>
	//    2    4:ireturn         
	}

	public void setCheckType(int i)
	{
		int j;
label0:
		{
			if(i >= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          13
			{
				j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
				if(i <= 6)
					break label0;
	//    5    7:iload_1         
	//    6    8:bipush          6
	//    7   10:icmple          15
			}
			j = 2;
	//    8   13:iconst_2        
	//    9   14:istore_2        
		}
		checkType = j;
	//   10   15:aload_0         
	//   11   16:iload_2         
	//   12   17:putfield        #64  <Field int checkType>
		setText(typeChars[j - 1]);
	//   13   20:aload_0         
	//   14   21:getstatic       #42  <Field String[] typeChars>
	//   15   24:iload_2         
	//   16   25:iconst_1        
	//   17   26:isub            
	//   18   27:aaload          
	//   19   28:invokevirtual   #339 <Method void setText(String)>
		try
		{
			setFont(BaseFont.createFont("ZapfDingbats", "Cp1252", false));
	//   20   31:aload_0         
	//   21   32:ldc2            #341 <String "ZapfDingbats">
	//   22   35:ldc2            #343 <String "Cp1252">
	//   23   38:iconst_0        
	//   24   39:invokestatic    #347 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//   25   42:invokevirtual   #351 <Method void setFont(BaseFont)>
			return;
	//   26   45:return          
		}
		catch(Exception exception)
	//*  27   46:astore_3        
		{
			throw new ExceptionConverter(exception);
	//   28   47:new             #353 <Class ExceptionConverter>
	//   29   50:dup             
	//   30   51:aload_3         
	//   31   52:invokespecial   #356 <Method void ExceptionConverter(Exception)>
	//   32   55:athrow          
		}
	}

	public void setChecked(boolean flag)
	{
		checked = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #257 <Field boolean checked>
	//    3    5:return          
	}

	public void setOnValue(String s)
	{
		onValue = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #259 <Field String onValue>
	//    3    5:return          
	}

	public static final int TYPE_CHECK = 1;
	public static final int TYPE_CIRCLE = 2;
	public static final int TYPE_CROSS = 3;
	public static final int TYPE_DIAMOND = 4;
	public static final int TYPE_SQUARE = 5;
	public static final int TYPE_STAR = 6;
	protected static String typeChars[] = {
		"4", "l", "8", "u", "n", "H"
	};
	protected int checkType;
	private boolean checked;
	private String onValue;

	static 
	{
	//    0    0:bipush          6
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #30  <String "4">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #32  <String "l">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #34  <String "8">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #36  <String "u">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #38  <String "n">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #40  <String "H">
	//   25   34:aastore         
	//   26   35:putstatic       #42  <Field String[] typeChars>
	//*  27   38:return          
	}
}
