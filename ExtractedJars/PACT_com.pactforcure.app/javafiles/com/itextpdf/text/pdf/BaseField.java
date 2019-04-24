// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfCopyFieldsImp, PdfName, BaseFont, PdfAppearance, 
//			PdfDictionary, PdfWriter

public abstract class BaseField
{

	public BaseField(PdfWriter pdfwriter, Rectangle rectangle, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		borderWidth = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #99  <Field float borderWidth>
		borderStyle = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #101 <Field int borderStyle>
		fontSize = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #103 <Field float fontSize>
		alignment = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #105 <Field int alignment>
		rotation = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #107 <Field int rotation>
		writer = pdfwriter;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #109 <Field PdfWriter writer>
		setBox(rectangle);
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #113 <Method void setBox(Rectangle)>
		fieldName = s;
	//   23   39:aload_0         
	//   24   40:aload_3         
	//   25   41:putfield        #115 <Field String fieldName>
	//   26   44:return          
	}

	protected static ArrayList breakLines(ArrayList arraylist, BaseFont basefont, float f, float f1)
	{
		int l1;
		ArrayList arraylist1;
		StringBuffer stringbuffer;
		arraylist1 = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore          17
		stringbuffer = new StringBuffer();
	//    4    9:new             #122 <Class StringBuffer>
	//    5   12:dup             
	//    6   13:invokespecial   #123 <Method void StringBuffer()>
	//    7   16:astore          18
		l1 = 0;
	//    8   18:iconst_0        
	//    9   19:istore          14
_L9:
		float f2;
		int j;
		int i1;
		int j1;
		int i2;
		int j2;
		char ac[];
		if(l1 >= arraylist.size())
			break; /* Loop/switch isn't completed */
	//   10   21:iload           14
	//   11   23:aload_0         
	//   12   24:invokevirtual   #127 <Method int ArrayList.size()>
	//   13   27:icmpge          598
		stringbuffer.setLength(0);
	//   14   30:aload           18
	//   15   32:iconst_0        
	//   16   33:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
		f2 = 0.0F;
	//   17   36:fconst_0        
	//   18   37:fstore          5
		ac = ((String)arraylist.get(l1)).toCharArray();
	//   19   39:aload_0         
	//   20   40:iload           14
	//   21   42:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   22   45:checkcast       #137 <Class String>
	//   23   48:invokevirtual   #141 <Method char[] String.toCharArray()>
	//   24   51:astore          19
		j2 = ac.length;
	//   25   53:aload           19
	//   26   55:arraylength     
	//   27   56:istore          16
		i2 = 0;
	//   28   58:iconst_0        
	//   29   59:istore          15
		i1 = -1;
	//   30   61:iconst_m1       
	//   31   62:istore          11
		j1 = 0;
	//   32   64:iconst_0        
	//   33   65:istore          12
		j = 0;
	//   34   67:iconst_0        
	//   35   68:istore          8
_L6:
		char c;
		if(j >= j2)
			break MISSING_BLOCK_LABEL_573;
	//   36   70:iload           8
	//   37   72:iload           16
	//   38   74:icmpge          573
		c = ac[j];
	//   39   77:aload           19
	//   40   79:iload           8
	//   41   81:caload          
	//   42   82:istore          4
		i2;
	//   43   84:iload           15
		JVM INSTR tableswitch 0 2: default 112
	//	               0 149
	//	               1 307
	//	               2 527;
	//   44   86:tableswitch     0 2: default 112
	//	               0 149
	//	               1 307
	//	               2 527
		   goto _L1 _L2 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_527;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		int i;
		int k;
		int l;
		int k1;
		i = i2;
	//   45  112:iload           15
	//   46  114:istore          7
		l = j1;
	//   47  116:iload           12
	//   48  118:istore          10
		k1 = i1;
	//   49  120:iload           11
	//   50  122:istore          13
		k = j;
	//   51  124:iload           8
	//   52  126:istore          9
_L7:
		j = k + 1;
	//   53  128:iload           9
	//   54  130:iconst_1        
	//   55  131:iadd            
	//   56  132:istore          8
		i1 = k1;
	//   57  134:iload           13
	//   58  136:istore          11
		j1 = l;
	//   59  138:iload           10
	//   60  140:istore          12
		i2 = i;
	//   61  142:iload           7
	//   62  144:istore          15
		if(true) goto _L6; else goto _L5
	//   63  146:goto            70
_L5:
		float f3 = f2 + basefont.getWidthPoint(((int) (c)), f);
	//   64  149:fload           5
	//   65  151:aload_1         
	//   66  152:iload           4
	//   67  154:fload_2         
	//   68  155:invokevirtual   #147 <Method float BaseFont.getWidthPoint(int, float)>
	//   69  158:fadd            
	//   70  159:fstore          6
		stringbuffer.append(c);
	//   71  161:aload           18
	//   72  163:iload           4
	//   73  165:invokevirtual   #151 <Method StringBuffer StringBuffer.append(char)>
	//   74  168:pop             
		if(f3 > f1)
	//*  75  169:fload           6
	//*  76  171:fload_3         
	//*  77  172:fcmpl           
	//*  78  173:ifle            258
		{
			f2 = 0.0F;
	//   79  176:fconst_0        
	//   80  177:fstore          5
			k = j;
	//   81  179:iload           8
	//   82  181:istore          9
			if(stringbuffer.length() > 1)
	//*  83  183:aload           18
	//*  84  185:invokevirtual   #154 <Method int StringBuffer.length()>
	//*  85  188:iconst_1        
	//*  86  189:icmple          210
			{
				k = j - 1;
	//   87  192:iload           8
	//   88  194:iconst_1        
	//   89  195:isub            
	//   90  196:istore          9
				stringbuffer.setLength(stringbuffer.length() - 1);
	//   91  198:aload           18
	//   92  200:aload           18
	//   93  202:invokevirtual   #154 <Method int StringBuffer.length()>
	//   94  205:iconst_1        
	//   95  206:isub            
	//   96  207:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
			}
			arraylist1.add(((Object) (stringbuffer.toString())));
	//   97  210:aload           17
	//   98  212:aload           18
	//   99  214:invokevirtual   #158 <Method String StringBuffer.toString()>
	//  100  217:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//  101  220:pop             
			stringbuffer.setLength(0);
	//  102  221:aload           18
	//  103  223:iconst_0        
	//  104  224:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
			l = k;
	//  105  227:iload           9
	//  106  229:istore          10
			if(c == ' ')
	//* 107  231:iload           4
	//* 108  233:bipush          32
	//* 109  235:icmpne          248
			{
				i = 2;
	//  110  238:iconst_2        
	//  111  239:istore          7
				k1 = i1;
	//  112  241:iload           11
	//  113  243:istore          13
			} else
	//* 114  245:goto            128
			{
				i = 1;
	//  115  248:iconst_1        
	//  116  249:istore          7
				k1 = i1;
	//  117  251:iload           11
	//  118  253:istore          13
			}
		} else
	//* 119  255:goto            128
		{
			k = j;
	//  120  258:iload           8
	//  121  260:istore          9
			k1 = i1;
	//  122  262:iload           11
	//  123  264:istore          13
			l = j1;
	//  124  266:iload           12
	//  125  268:istore          10
			i = i2;
	//  126  270:iload           15
	//  127  272:istore          7
			f2 = f3;
	//  128  274:fload           6
	//  129  276:fstore          5
			if(c != ' ')
	//* 130  278:iload           4
	//* 131  280:bipush          32
	//* 132  282:icmpeq          128
			{
				i = 1;
	//  133  285:iconst_1        
	//  134  286:istore          7
				k = j;
	//  135  288:iload           8
	//  136  290:istore          9
				k1 = i1;
	//  137  292:iload           11
	//  138  294:istore          13
				l = j1;
	//  139  296:iload           12
	//  140  298:istore          10
				f2 = f3;
	//  141  300:fload           6
	//  142  302:fstore          5
			}
		}
		  goto _L7
	//* 143  304:goto            128
_L3:
		float f4 = f2 + basefont.getWidthPoint(((int) (c)), f);
	//  144  307:fload           5
	//  145  309:aload_1         
	//  146  310:iload           4
	//  147  312:fload_2         
	//  148  313:invokevirtual   #147 <Method float BaseFont.getWidthPoint(int, float)>
	//  149  316:fadd            
	//  150  317:fstore          6
		stringbuffer.append(c);
	//  151  319:aload           18
	//  152  321:iload           4
	//  153  323:invokevirtual   #151 <Method StringBuffer StringBuffer.append(char)>
	//  154  326:pop             
		if(c == ' ')
	//* 155  327:iload           4
	//* 156  329:bipush          32
	//* 157  331:icmpne          338
			i1 = j;
	//  158  334:iload           8
	//  159  336:istore          11
		k = j;
	//  160  338:iload           8
	//  161  340:istore          9
		k1 = i1;
	//  162  342:iload           11
	//  163  344:istore          13
		l = j1;
	//  164  346:iload           12
	//  165  348:istore          10
		i = i2;
	//  166  350:iload           15
	//  167  352:istore          7
		f2 = f4;
	//  168  354:fload           6
	//  169  356:fstore          5
		if(f4 > f1)
	//* 170  358:fload           6
	//* 171  360:fload_3         
	//* 172  361:fcmpl           
	//* 173  362:ifle            128
		{
			float f5 = 0.0F;
	//  174  365:fconst_0        
	//  175  366:fstore          6
			if(i1 >= 0)
	//* 176  368:iload           11
	//* 177  370:iflt            426
			{
				k = i1;
	//  178  373:iload           11
	//  179  375:istore          9
				stringbuffer.setLength(i1 - j1);
	//  180  377:aload           18
	//  181  379:iload           11
	//  182  381:iload           12
	//  183  383:isub            
	//  184  384:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
				trimRight(stringbuffer);
	//  185  387:aload           18
	//  186  389:invokestatic    #166 <Method void trimRight(StringBuffer)>
				arraylist1.add(((Object) (stringbuffer.toString())));
	//  187  392:aload           17
	//  188  394:aload           18
	//  189  396:invokevirtual   #158 <Method String StringBuffer.toString()>
	//  190  399:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//  191  402:pop             
				stringbuffer.setLength(0);
	//  192  403:aload           18
	//  193  405:iconst_0        
	//  194  406:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
				l = k;
	//  195  409:iload           9
	//  196  411:istore          10
				k1 = -1;
	//  197  413:iconst_m1       
	//  198  414:istore          13
				i = 2;
	//  199  416:iconst_2        
	//  200  417:istore          7
				f2 = f5;
	//  201  419:fload           6
	//  202  421:fstore          5
			} else
	//* 203  423:goto            128
			{
				j1 = j;
	//  204  426:iload           8
	//  205  428:istore          12
				if(stringbuffer.length() > 1)
	//* 206  430:aload           18
	//* 207  432:invokevirtual   #154 <Method int StringBuffer.length()>
	//* 208  435:iconst_1        
	//* 209  436:icmple          457
				{
					j1 = j - 1;
	//  210  439:iload           8
	//  211  441:iconst_1        
	//  212  442:isub            
	//  213  443:istore          12
					stringbuffer.setLength(stringbuffer.length() - 1);
	//  214  445:aload           18
	//  215  447:aload           18
	//  216  449:invokevirtual   #154 <Method int StringBuffer.length()>
	//  217  452:iconst_1        
	//  218  453:isub            
	//  219  454:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
				}
				arraylist1.add(((Object) (stringbuffer.toString())));
	//  220  457:aload           17
	//  221  459:aload           18
	//  222  461:invokevirtual   #158 <Method String StringBuffer.toString()>
	//  223  464:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//  224  467:pop             
				stringbuffer.setLength(0);
	//  225  468:aload           18
	//  226  470:iconst_0        
	//  227  471:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
				j = j1;
	//  228  474:iload           12
	//  229  476:istore          8
				k = j1;
	//  230  478:iload           12
	//  231  480:istore          9
				k1 = i1;
	//  232  482:iload           11
	//  233  484:istore          13
				l = j;
	//  234  486:iload           8
	//  235  488:istore          10
				i = i2;
	//  236  490:iload           15
	//  237  492:istore          7
				f2 = f5;
	//  238  494:fload           6
	//  239  496:fstore          5
				if(c == ' ')
	//* 240  498:iload           4
	//* 241  500:bipush          32
	//* 242  502:icmpne          128
				{
					i = 2;
	//  243  505:iconst_2        
	//  244  506:istore          7
					k = j1;
	//  245  508:iload           12
	//  246  510:istore          9
					k1 = i1;
	//  247  512:iload           11
	//  248  514:istore          13
					l = j;
	//  249  516:iload           8
	//  250  518:istore          10
					f2 = f5;
	//  251  520:fload           6
	//  252  522:fstore          5
				}
			}
		}
		  goto _L7
	//* 253  524:goto            128
		k = j;
	//  254  527:iload           8
	//  255  529:istore          9
		k1 = i1;
	//  256  531:iload           11
	//  257  533:istore          13
		l = j1;
	//  258  535:iload           12
	//  259  537:istore          10
		i = i2;
	//  260  539:iload           15
	//  261  541:istore          7
		if(c != ' ')
	//* 262  543:iload           4
	//* 263  545:bipush          32
	//* 264  547:icmpeq          128
		{
			f2 = 0.0F;
	//  265  550:fconst_0        
	//  266  551:fstore          5
			k = j - 1;
	//  267  553:iload           8
	//  268  555:iconst_1        
	//  269  556:isub            
	//  270  557:istore          9
			i = 1;
	//  271  559:iconst_1        
	//  272  560:istore          7
			k1 = i1;
	//  273  562:iload           11
	//  274  564:istore          13
			l = j1;
	//  275  566:iload           12
	//  276  568:istore          10
		}
		  goto _L7
	//* 277  570:goto            128
		trimRight(stringbuffer);
	//  278  573:aload           18
	//  279  575:invokestatic    #166 <Method void trimRight(StringBuffer)>
		arraylist1.add(((Object) (stringbuffer.toString())));
	//  280  578:aload           17
	//  281  580:aload           18
	//  282  582:invokevirtual   #158 <Method String StringBuffer.toString()>
	//  283  585:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//  284  588:pop             
		l1++;
	//  285  589:iload           14
	//  286  591:iconst_1        
	//  287  592:iadd            
	//  288  593:istore          14
		if(true) goto _L9; else goto _L8
	//  289  595:goto            21
_L8:
		return arraylist1;
	//  290  598:aload           17
	//  291  600:areturn         
	}

	private void drawBottomFrame(PdfAppearance pdfappearance)
	{
		pdfappearance.moveTo(borderWidth, borderWidth);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #99  <Field float borderWidth>
	//    3    5:aload_0         
	//    4    6:getfield        #99  <Field float borderWidth>
	//    5    9:invokevirtual   #176 <Method void PdfAppearance.moveTo(float, float)>
		pdfappearance.lineTo(box.getWidth() - borderWidth, borderWidth);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #178 <Field Rectangle box>
	//    9   17:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   10   20:aload_0         
	//   11   21:getfield        #99  <Field float borderWidth>
	//   12   24:fsub            
	//   13   25:aload_0         
	//   14   26:getfield        #99  <Field float borderWidth>
	//   15   29:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(box.getWidth() - borderWidth, box.getHeight() - borderWidth);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #178 <Field Rectangle box>
	//   19   37:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   20   40:aload_0         
	//   21   41:getfield        #99  <Field float borderWidth>
	//   22   44:fsub            
	//   23   45:aload_0         
	//   24   46:getfield        #178 <Field Rectangle box>
	//   25   49:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//   26   52:aload_0         
	//   27   53:getfield        #99  <Field float borderWidth>
	//   28   56:fsub            
	//   29   57:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(box.getWidth() - borderWidth * 2.0F, box.getHeight() - borderWidth * 2.0F);
	//   30   60:aload_1         
	//   31   61:aload_0         
	//   32   62:getfield        #178 <Field Rectangle box>
	//   33   65:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   34   68:aload_0         
	//   35   69:getfield        #99  <Field float borderWidth>
	//   36   72:fconst_2        
	//   37   73:fmul            
	//   38   74:fsub            
	//   39   75:aload_0         
	//   40   76:getfield        #178 <Field Rectangle box>
	//   41   79:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//   42   82:aload_0         
	//   43   83:getfield        #99  <Field float borderWidth>
	//   44   86:fconst_2        
	//   45   87:fmul            
	//   46   88:fsub            
	//   47   89:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(box.getWidth() - borderWidth * 2.0F, borderWidth * 2.0F);
	//   48   92:aload_1         
	//   49   93:aload_0         
	//   50   94:getfield        #178 <Field Rectangle box>
	//   51   97:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   52  100:aload_0         
	//   53  101:getfield        #99  <Field float borderWidth>
	//   54  104:fconst_2        
	//   55  105:fmul            
	//   56  106:fsub            
	//   57  107:aload_0         
	//   58  108:getfield        #99  <Field float borderWidth>
	//   59  111:fconst_2        
	//   60  112:fmul            
	//   61  113:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(borderWidth * 2.0F, borderWidth * 2.0F);
	//   62  116:aload_1         
	//   63  117:aload_0         
	//   64  118:getfield        #99  <Field float borderWidth>
	//   65  121:fconst_2        
	//   66  122:fmul            
	//   67  123:aload_0         
	//   68  124:getfield        #99  <Field float borderWidth>
	//   69  127:fconst_2        
	//   70  128:fmul            
	//   71  129:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(borderWidth, borderWidth);
	//   72  132:aload_1         
	//   73  133:aload_0         
	//   74  134:getfield        #99  <Field float borderWidth>
	//   75  137:aload_0         
	//   76  138:getfield        #99  <Field float borderWidth>
	//   77  141:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.fill();
	//   78  144:aload_1         
	//   79  145:invokevirtual   #193 <Method void PdfAppearance.fill()>
	//   80  148:return          
	}

	private void drawTopFrame(PdfAppearance pdfappearance)
	{
		pdfappearance.moveTo(borderWidth, borderWidth);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #99  <Field float borderWidth>
	//    3    5:aload_0         
	//    4    6:getfield        #99  <Field float borderWidth>
	//    5    9:invokevirtual   #176 <Method void PdfAppearance.moveTo(float, float)>
		pdfappearance.lineTo(borderWidth, box.getHeight() - borderWidth);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #99  <Field float borderWidth>
	//    9   17:aload_0         
	//   10   18:getfield        #178 <Field Rectangle box>
	//   11   21:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//   12   24:aload_0         
	//   13   25:getfield        #99  <Field float borderWidth>
	//   14   28:fsub            
	//   15   29:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(box.getWidth() - borderWidth, box.getHeight() - borderWidth);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #178 <Field Rectangle box>
	//   19   37:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   20   40:aload_0         
	//   21   41:getfield        #99  <Field float borderWidth>
	//   22   44:fsub            
	//   23   45:aload_0         
	//   24   46:getfield        #178 <Field Rectangle box>
	//   25   49:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//   26   52:aload_0         
	//   27   53:getfield        #99  <Field float borderWidth>
	//   28   56:fsub            
	//   29   57:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(box.getWidth() - borderWidth * 2.0F, box.getHeight() - borderWidth * 2.0F);
	//   30   60:aload_1         
	//   31   61:aload_0         
	//   32   62:getfield        #178 <Field Rectangle box>
	//   33   65:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   34   68:aload_0         
	//   35   69:getfield        #99  <Field float borderWidth>
	//   36   72:fconst_2        
	//   37   73:fmul            
	//   38   74:fsub            
	//   39   75:aload_0         
	//   40   76:getfield        #178 <Field Rectangle box>
	//   41   79:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//   42   82:aload_0         
	//   43   83:getfield        #99  <Field float borderWidth>
	//   44   86:fconst_2        
	//   45   87:fmul            
	//   46   88:fsub            
	//   47   89:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(borderWidth * 2.0F, box.getHeight() - borderWidth * 2.0F);
	//   48   92:aload_1         
	//   49   93:aload_0         
	//   50   94:getfield        #99  <Field float borderWidth>
	//   51   97:fconst_2        
	//   52   98:fmul            
	//   53   99:aload_0         
	//   54  100:getfield        #178 <Field Rectangle box>
	//   55  103:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//   56  106:aload_0         
	//   57  107:getfield        #99  <Field float borderWidth>
	//   58  110:fconst_2        
	//   59  111:fmul            
	//   60  112:fsub            
	//   61  113:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(borderWidth * 2.0F, borderWidth * 2.0F);
	//   62  116:aload_1         
	//   63  117:aload_0         
	//   64  118:getfield        #99  <Field float borderWidth>
	//   65  121:fconst_2        
	//   66  122:fmul            
	//   67  123:aload_0         
	//   68  124:getfield        #99  <Field float borderWidth>
	//   69  127:fconst_2        
	//   70  128:fmul            
	//   71  129:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.lineTo(borderWidth, borderWidth);
	//   72  132:aload_1         
	//   73  133:aload_0         
	//   74  134:getfield        #99  <Field float borderWidth>
	//   75  137:aload_0         
	//   76  138:getfield        #99  <Field float borderWidth>
	//   77  141:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
		pdfappearance.fill();
	//   78  144:aload_1         
	//   79  145:invokevirtual   #193 <Method void PdfAppearance.fill()>
	//   80  148:return          
	}

	protected static ArrayList getHardBreaks(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore          5
		char ac[] = s.toCharArray();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #141 <Method char[] String.toCharArray()>
	//    6   13:astore          6
		int k = ac.length;
	//    7   15:aload           6
	//    8   17:arraylength     
	//    9   18:istore          4
		s = ((String) (new StringBuffer()));
	//   10   20:new             #122 <Class StringBuffer>
	//   11   23:dup             
	//   12   24:invokespecial   #123 <Method void StringBuffer()>
	//   13   27:astore_0        
		int i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
		while(i < k) 
	//*  16   30:iload_2         
	//*  17   31:iload           4
	//*  18   33:icmpge          137
		{
			char c = ac[i];
	//   19   36:aload           6
	//   20   38:iload_2         
	//   21   39:caload          
	//   22   40:istore_1        
			if(c == '\r')
	//*  23   41:iload_1         
	//*  24   42:bipush          13
	//*  25   44:icmpne          101
			{
				int j = i;
	//   26   47:iload_2         
	//   27   48:istore_3        
				if(i + 1 < k)
	//*  28   49:iload_2         
	//*  29   50:iconst_1        
	//*  30   51:iadd            
	//*  31   52:iload           4
	//*  32   54:icmpge          74
				{
					j = i;
	//   33   57:iload_2         
	//   34   58:istore_3        
					if(ac[i + 1] == '\n')
	//*  35   59:aload           6
	//*  36   61:iload_2         
	//*  37   62:iconst_1        
	//*  38   63:iadd            
	//*  39   64:caload          
	//*  40   65:bipush          10
	//*  41   67:icmpne          74
						j = i + 1;
	//   42   70:iload_2         
	//   43   71:iconst_1        
	//   44   72:iadd            
	//   45   73:istore_3        
				}
				arraylist.add(((Object) (((StringBuffer) (s)).toString())));
	//   46   74:aload           5
	//   47   76:aload_0         
	//   48   77:invokevirtual   #158 <Method String StringBuffer.toString()>
	//   49   80:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//   50   83:pop             
				s = ((String) (new StringBuffer()));
	//   51   84:new             #122 <Class StringBuffer>
	//   52   87:dup             
	//   53   88:invokespecial   #123 <Method void StringBuffer()>
	//   54   91:astore_0        
				i = j;
	//   55   92:iload_3         
	//   56   93:istore_2        
			} else
	//*  57   94:iload_2         
	//*  58   95:iconst_1        
	//*  59   96:iadd            
	//*  60   97:istore_2        
	//*  61   98:goto            30
			if(c == '\n')
	//*  62  101:iload_1         
	//*  63  102:bipush          10
	//*  64  104:icmpne          128
			{
				arraylist.add(((Object) (((StringBuffer) (s)).toString())));
	//   65  107:aload           5
	//   66  109:aload_0         
	//   67  110:invokevirtual   #158 <Method String StringBuffer.toString()>
	//   68  113:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//   69  116:pop             
				s = ((String) (new StringBuffer()));
	//   70  117:new             #122 <Class StringBuffer>
	//   71  120:dup             
	//   72  121:invokespecial   #123 <Method void StringBuffer()>
	//   73  124:astore_0        
			} else
	//*  74  125:goto            94
			{
				((StringBuffer) (s)).append(c);
	//   75  128:aload_0         
	//   76  129:iload_1         
	//   77  130:invokevirtual   #151 <Method StringBuffer StringBuffer.append(char)>
	//   78  133:pop             
			}
			i++;
		}
	//*  79  134:goto            94
		arraylist.add(((Object) (((StringBuffer) (s)).toString())));
	//   80  137:aload           5
	//   81  139:aload_0         
	//   82  140:invokevirtual   #158 <Method String StringBuffer.toString()>
	//   83  143:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//   84  146:pop             
		return arraylist;
	//   85  147:aload           5
	//   86  149:areturn         
	}

	public static void moveFields(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1)
	{
		Iterator iterator = pdfdictionary.getKeys().iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #205 <Method Set PdfDictionary.getKeys()>
	//    2    4:invokeinterface #211 <Method Iterator Set.iterator()>
	//    3    9:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_2         
	//    5   11:invokeinterface #217 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            62
			PdfName pdfname = (PdfName)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #221 <Method Object Iterator.next()>
	//    9   25:checkcast       #80  <Class PdfName>
	//   10   28:astore_3        
			if(fieldKeys.containsKey(((Object) (pdfname))))
	//*  11   29:getstatic       #71  <Field HashMap fieldKeys>
	//*  12   32:aload_3         
	//*  13   33:invokevirtual   #224 <Method boolean HashMap.containsKey(Object)>
	//*  14   36:ifeq            10
			{
				if(pdfdictionary1 != null)
	//*  15   39:aload_1         
	//*  16   40:ifnull          53
					pdfdictionary1.put(pdfname, pdfdictionary.get(pdfname));
	//   17   43:aload_1         
	//   18   44:aload_3         
	//   19   45:aload_0         
	//   20   46:aload_3         
	//   21   47:invokevirtual   #227 <Method PdfObject PdfDictionary.get(PdfName)>
	//   22   50:invokevirtual   #230 <Method void PdfDictionary.put(PdfName, PdfObject)>
				iterator.remove();
	//   23   53:aload_2         
	//   24   54:invokeinterface #233 <Method void Iterator.remove()>
			}
		} while(true);
	//   25   59:goto            10
	//   26   62:return          
	}

	protected static void trimRight(StringBuffer stringbuffer)
	{
		int i = stringbuffer.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method int StringBuffer.length()>
	//    2    4:istore_1        
_L5:
		if(i != 0) goto _L2; else goto _L1
	//    3    5:iload_1         
	//    4    6:ifne            10
_L1:
		return;
	//    5    9:return          
	//*   6   10:iload_1         
	//*   7   11:iconst_1        
	//*   8   12:isub            
	//*   9   13:istore_1        
_L2:
		if(stringbuffer.charAt(i--) != ' ') goto _L1; else goto _L3
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokevirtual   #237 <Method char StringBuffer.charAt(int)>
	//   13   19:bipush          32
	//   14   21:icmpne          9
_L3:
		stringbuffer.setLength(i);
	//   15   24:aload_0         
	//   16   25:iload_1         
	//   17   26:invokevirtual   #131 <Method void StringBuffer.setLength(int)>
		if(true) goto _L5; else goto _L4
	//   18   29:goto            5
_L4:
	}

	public int getAlignment()
	{
		return alignment;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int alignment>
	//    2    4:ireturn         
	}

	public BaseColor getBackgroundColor()
	{
		return backgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field BaseColor backgroundColor>
	//    2    4:areturn         
	}

	protected PdfAppearance getBorderAppearance()
	{
		PdfAppearance pdfappearance = PdfAppearance.createAppearance(writer, box.getWidth(), box.getHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field PdfWriter writer>
	//    2    4:aload_0         
	//    3    5:getfield        #178 <Field Rectangle box>
	//    4    8:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//    5   11:aload_0         
	//    6   12:getfield        #178 <Field Rectangle box>
	//    7   15:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//    8   18:invokestatic    #248 <Method PdfAppearance PdfAppearance.createAppearance(PdfWriter, float, float)>
	//    9   21:astore          9
		rotation;
	//   10   23:aload_0         
	//   11   24:getfield        #107 <Field int rotation>
		JVM INSTR lookupswitch 3: default 60
	//	               90: 192
	//	               180: 214
	//	               270: 244;
	//   12   27:lookupswitch    3: default 60
	//	               90: 192
	//	               180: 214
	//	               270: 244
		   goto _L1 _L2 _L3 _L4
_L1:
		break; /* Loop/switch isn't completed */
_L4:
		break MISSING_BLOCK_LABEL_244;
_L5:
		pdfappearance.saveState();
	//   13   60:aload           9
	//   14   62:invokevirtual   #251 <Method void PdfAppearance.saveState()>
		if(backgroundColor != null)
	//*  15   65:aload_0         
	//*  16   66:getfield        #242 <Field BaseColor backgroundColor>
	//*  17   69:ifnull          107
		{
			pdfappearance.setColorFill(backgroundColor);
	//   18   72:aload           9
	//   19   74:aload_0         
	//   20   75:getfield        #242 <Field BaseColor backgroundColor>
	//   21   78:invokevirtual   #255 <Method void PdfAppearance.setColorFill(BaseColor)>
			pdfappearance.rectangle(0.0F, 0.0F, box.getWidth(), box.getHeight());
	//   22   81:aload           9
	//   23   83:fconst_0        
	//   24   84:fconst_0        
	//   25   85:aload_0         
	//   26   86:getfield        #178 <Field Rectangle box>
	//   27   89:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   28   92:aload_0         
	//   29   93:getfield        #178 <Field Rectangle box>
	//   30   96:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//   31   99:invokevirtual   #259 <Method void PdfAppearance.rectangle(float, float, float, float)>
			pdfappearance.fill();
	//   32  102:aload           9
	//   33  104:invokevirtual   #193 <Method void PdfAppearance.fill()>
		}
		if(borderStyle == 4)
	//*  34  107:aload_0         
	//*  35  108:getfield        #101 <Field int borderStyle>
	//*  36  111:iconst_4        
	//*  37  112:icmpne          266
		{
			if(borderWidth != 0.0F && borderColor != null)
	//*  38  115:aload_0         
	//*  39  116:getfield        #99  <Field float borderWidth>
	//*  40  119:fconst_0        
	//*  41  120:fcmpl           
	//*  42  121:ifeq            184
	//*  43  124:aload_0         
	//*  44  125:getfield        #261 <Field BaseColor borderColor>
	//*  45  128:ifnull          184
			{
				pdfappearance.setColorStroke(borderColor);
	//   46  131:aload           9
	//   47  133:aload_0         
	//   48  134:getfield        #261 <Field BaseColor borderColor>
	//   49  137:invokevirtual   #264 <Method void PdfAppearance.setColorStroke(BaseColor)>
				pdfappearance.setLineWidth(borderWidth);
	//   50  140:aload           9
	//   51  142:aload_0         
	//   52  143:getfield        #99  <Field float borderWidth>
	//   53  146:invokevirtual   #268 <Method void PdfAppearance.setLineWidth(float)>
				pdfappearance.moveTo(0.0F, borderWidth / 2.0F);
	//   54  149:aload           9
	//   55  151:fconst_0        
	//   56  152:aload_0         
	//   57  153:getfield        #99  <Field float borderWidth>
	//   58  156:fconst_2        
	//   59  157:fdiv            
	//   60  158:invokevirtual   #176 <Method void PdfAppearance.moveTo(float, float)>
				pdfappearance.lineTo(box.getWidth(), borderWidth / 2.0F);
	//   61  161:aload           9
	//   62  163:aload_0         
	//   63  164:getfield        #178 <Field Rectangle box>
	//   64  167:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//   65  170:aload_0         
	//   66  171:getfield        #99  <Field float borderWidth>
	//   67  174:fconst_2        
	//   68  175:fdiv            
	//   69  176:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
				pdfappearance.stroke();
	//   70  179:aload           9
	//   71  181:invokevirtual   #271 <Method void PdfAppearance.stroke()>
			}
		} else
	//*  72  184:aload           9
	//*  73  186:invokevirtual   #274 <Method void PdfAppearance.restoreState()>
	//*  74  189:aload           9
	//*  75  191:areturn         
	//*  76  192:aload           9
	//*  77  194:fconst_0        
	//*  78  195:fconst_1        
	//*  79  196:ldc2            #275 <Float -1F>
	//*  80  199:fconst_0        
	//*  81  200:aload_0         
	//*  82  201:getfield        #178 <Field Rectangle box>
	//*  83  204:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//*  84  207:fconst_0        
	//*  85  208:invokevirtual   #279 <Method void PdfAppearance.setMatrix(float, float, float, float, float, float)>
	//*  86  211:goto            60
	//*  87  214:aload           9
	//*  88  216:ldc2            #275 <Float -1F>
	//*  89  219:fconst_0        
	//*  90  220:fconst_0        
	//*  91  221:ldc2            #275 <Float -1F>
	//*  92  224:aload_0         
	//*  93  225:getfield        #178 <Field Rectangle box>
	//*  94  228:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//*  95  231:aload_0         
	//*  96  232:getfield        #178 <Field Rectangle box>
	//*  97  235:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//*  98  238:invokevirtual   #279 <Method void PdfAppearance.setMatrix(float, float, float, float, float, float)>
	//*  99  241:goto            60
	//* 100  244:aload           9
	//* 101  246:fconst_0        
	//* 102  247:ldc2            #275 <Float -1F>
	//* 103  250:fconst_1        
	//* 104  251:fconst_0        
	//* 105  252:fconst_0        
	//* 106  253:aload_0         
	//* 107  254:getfield        #178 <Field Rectangle box>
	//* 108  257:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//* 109  260:invokevirtual   #279 <Method void PdfAppearance.setMatrix(float, float, float, float, float, float)>
	//* 110  263:goto            60
		if(borderStyle == 2)
	//* 111  266:aload_0         
	//* 112  267:getfield        #101 <Field int borderStyle>
	//* 113  270:iconst_2        
	//* 114  271:icmpne          405
		{
			if(borderWidth != 0.0F && borderColor != null)
	//* 115  274:aload_0         
	//* 116  275:getfield        #99  <Field float borderWidth>
	//* 117  278:fconst_0        
	//* 118  279:fcmpl           
	//* 119  280:ifeq            354
	//* 120  283:aload_0         
	//* 121  284:getfield        #261 <Field BaseColor borderColor>
	//* 122  287:ifnull          354
			{
				pdfappearance.setColorStroke(borderColor);
	//  123  290:aload           9
	//  124  292:aload_0         
	//  125  293:getfield        #261 <Field BaseColor borderColor>
	//  126  296:invokevirtual   #264 <Method void PdfAppearance.setColorStroke(BaseColor)>
				pdfappearance.setLineWidth(borderWidth);
	//  127  299:aload           9
	//  128  301:aload_0         
	//  129  302:getfield        #99  <Field float borderWidth>
	//  130  305:invokevirtual   #268 <Method void PdfAppearance.setLineWidth(float)>
				pdfappearance.rectangle(borderWidth / 2.0F, borderWidth / 2.0F, box.getWidth() - borderWidth, box.getHeight() - borderWidth);
	//  131  308:aload           9
	//  132  310:aload_0         
	//  133  311:getfield        #99  <Field float borderWidth>
	//  134  314:fconst_2        
	//  135  315:fdiv            
	//  136  316:aload_0         
	//  137  317:getfield        #99  <Field float borderWidth>
	//  138  320:fconst_2        
	//  139  321:fdiv            
	//  140  322:aload_0         
	//  141  323:getfield        #178 <Field Rectangle box>
	//  142  326:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//  143  329:aload_0         
	//  144  330:getfield        #99  <Field float borderWidth>
	//  145  333:fsub            
	//  146  334:aload_0         
	//  147  335:getfield        #178 <Field Rectangle box>
	//  148  338:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//  149  341:aload_0         
	//  150  342:getfield        #99  <Field float borderWidth>
	//  151  345:fsub            
	//  152  346:invokevirtual   #259 <Method void PdfAppearance.rectangle(float, float, float, float)>
				pdfappearance.stroke();
	//  153  349:aload           9
	//  154  351:invokevirtual   #271 <Method void PdfAppearance.stroke()>
			}
			BaseColor basecolor1 = backgroundColor;
	//  155  354:aload_0         
	//  156  355:getfield        #242 <Field BaseColor backgroundColor>
	//  157  358:astore          8
			BaseColor basecolor = basecolor1;
	//  158  360:aload           8
	//  159  362:astore          7
			if(basecolor1 == null)
	//* 160  364:aload           8
	//* 161  366:ifnonnull       374
				basecolor = BaseColor.WHITE;
	//  162  369:getstatic       #284 <Field BaseColor BaseColor.WHITE>
	//  163  372:astore          7
			pdfappearance.setGrayFill(1.0F);
	//  164  374:aload           9
	//  165  376:fconst_1        
	//  166  377:invokevirtual   #287 <Method void PdfAppearance.setGrayFill(float)>
			drawTopFrame(pdfappearance);
	//  167  380:aload_0         
	//  168  381:aload           9
	//  169  383:invokespecial   #289 <Method void drawTopFrame(PdfAppearance)>
			pdfappearance.setColorFill(basecolor.darker());
	//  170  386:aload           9
	//  171  388:aload           7
	//  172  390:invokevirtual   #292 <Method BaseColor BaseColor.darker()>
	//  173  393:invokevirtual   #255 <Method void PdfAppearance.setColorFill(BaseColor)>
			drawBottomFrame(pdfappearance);
	//  174  396:aload_0         
	//  175  397:aload           9
	//  176  399:invokespecial   #294 <Method void drawBottomFrame(PdfAppearance)>
		} else
	//* 177  402:goto            184
		if(borderStyle == 3)
	//* 178  405:aload_0         
	//* 179  406:getfield        #101 <Field int borderStyle>
	//* 180  409:iconst_3        
	//* 181  410:icmpne          524
		{
			if(borderWidth != 0.0F && borderColor != null)
	//* 182  413:aload_0         
	//* 183  414:getfield        #99  <Field float borderWidth>
	//* 184  417:fconst_0        
	//* 185  418:fcmpl           
	//* 186  419:ifeq            493
	//* 187  422:aload_0         
	//* 188  423:getfield        #261 <Field BaseColor borderColor>
	//* 189  426:ifnull          493
			{
				pdfappearance.setColorStroke(borderColor);
	//  190  429:aload           9
	//  191  431:aload_0         
	//  192  432:getfield        #261 <Field BaseColor borderColor>
	//  193  435:invokevirtual   #264 <Method void PdfAppearance.setColorStroke(BaseColor)>
				pdfappearance.setLineWidth(borderWidth);
	//  194  438:aload           9
	//  195  440:aload_0         
	//  196  441:getfield        #99  <Field float borderWidth>
	//  197  444:invokevirtual   #268 <Method void PdfAppearance.setLineWidth(float)>
				pdfappearance.rectangle(borderWidth / 2.0F, borderWidth / 2.0F, box.getWidth() - borderWidth, box.getHeight() - borderWidth);
	//  198  447:aload           9
	//  199  449:aload_0         
	//  200  450:getfield        #99  <Field float borderWidth>
	//  201  453:fconst_2        
	//  202  454:fdiv            
	//  203  455:aload_0         
	//  204  456:getfield        #99  <Field float borderWidth>
	//  205  459:fconst_2        
	//  206  460:fdiv            
	//  207  461:aload_0         
	//  208  462:getfield        #178 <Field Rectangle box>
	//  209  465:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//  210  468:aload_0         
	//  211  469:getfield        #99  <Field float borderWidth>
	//  212  472:fsub            
	//  213  473:aload_0         
	//  214  474:getfield        #178 <Field Rectangle box>
	//  215  477:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//  216  480:aload_0         
	//  217  481:getfield        #99  <Field float borderWidth>
	//  218  484:fsub            
	//  219  485:invokevirtual   #259 <Method void PdfAppearance.rectangle(float, float, float, float)>
				pdfappearance.stroke();
	//  220  488:aload           9
	//  221  490:invokevirtual   #271 <Method void PdfAppearance.stroke()>
			}
			pdfappearance.setGrayFill(0.5F);
	//  222  493:aload           9
	//  223  495:ldc2            #295 <Float 0.5F>
	//  224  498:invokevirtual   #287 <Method void PdfAppearance.setGrayFill(float)>
			drawTopFrame(pdfappearance);
	//  225  501:aload_0         
	//  226  502:aload           9
	//  227  504:invokespecial   #289 <Method void drawTopFrame(PdfAppearance)>
			pdfappearance.setGrayFill(0.75F);
	//  228  507:aload           9
	//  229  509:ldc2            #296 <Float 0.75F>
	//  230  512:invokevirtual   #287 <Method void PdfAppearance.setGrayFill(float)>
			drawBottomFrame(pdfappearance);
	//  231  515:aload_0         
	//  232  516:aload           9
	//  233  518:invokespecial   #294 <Method void drawBottomFrame(PdfAppearance)>
		} else
	//* 234  521:goto            184
		if(borderWidth != 0.0F && borderColor != null)
	//* 235  524:aload_0         
	//* 236  525:getfield        #99  <Field float borderWidth>
	//* 237  528:fconst_0        
	//* 238  529:fcmpl           
	//* 239  530:ifeq            184
	//* 240  533:aload_0         
	//* 241  534:getfield        #261 <Field BaseColor borderColor>
	//* 242  537:ifnull          184
		{
			if(borderStyle == 1)
	//* 243  540:aload_0         
	//* 244  541:getfield        #101 <Field int borderStyle>
	//* 245  544:iconst_1        
	//* 246  545:icmpne          556
				pdfappearance.setLineDash(3F, 0.0F);
	//  247  548:aload           9
	//  248  550:ldc1            #9   <Float 3F>
	//  249  552:fconst_0        
	//  250  553:invokevirtual   #299 <Method void PdfAppearance.setLineDash(float, float)>
			pdfappearance.setColorStroke(borderColor);
	//  251  556:aload           9
	//  252  558:aload_0         
	//  253  559:getfield        #261 <Field BaseColor borderColor>
	//  254  562:invokevirtual   #264 <Method void PdfAppearance.setColorStroke(BaseColor)>
			pdfappearance.setLineWidth(borderWidth);
	//  255  565:aload           9
	//  256  567:aload_0         
	//  257  568:getfield        #99  <Field float borderWidth>
	//  258  571:invokevirtual   #268 <Method void PdfAppearance.setLineWidth(float)>
			pdfappearance.rectangle(borderWidth / 2.0F, borderWidth / 2.0F, box.getWidth() - borderWidth, box.getHeight() - borderWidth);
	//  259  574:aload           9
	//  260  576:aload_0         
	//  261  577:getfield        #99  <Field float borderWidth>
	//  262  580:fconst_2        
	//  263  581:fdiv            
	//  264  582:aload_0         
	//  265  583:getfield        #99  <Field float borderWidth>
	//  266  586:fconst_2        
	//  267  587:fdiv            
	//  268  588:aload_0         
	//  269  589:getfield        #178 <Field Rectangle box>
	//  270  592:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//  271  595:aload_0         
	//  272  596:getfield        #99  <Field float borderWidth>
	//  273  599:fsub            
	//  274  600:aload_0         
	//  275  601:getfield        #178 <Field Rectangle box>
	//  276  604:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//  277  607:aload_0         
	//  278  608:getfield        #99  <Field float borderWidth>
	//  279  611:fsub            
	//  280  612:invokevirtual   #259 <Method void PdfAppearance.rectangle(float, float, float, float)>
			pdfappearance.stroke();
	//  281  615:aload           9
	//  282  617:invokevirtual   #271 <Method void PdfAppearance.stroke()>
			if((options & 0x1000000) != 0 && maxCharacterLength > 1)
	//* 283  620:aload_0         
	//* 284  621:getfield        #301 <Field int options>
	//* 285  624:ldc1            #14  <Int 0x1000000>
	//* 286  626:iand            
	//* 287  627:ifeq            184
	//* 288  630:aload_0         
	//* 289  631:getfield        #303 <Field int maxCharacterLength>
	//* 290  634:iconst_1        
	//* 291  635:icmple          184
			{
				float f = box.getWidth() / (float)maxCharacterLength;
	//  292  638:aload_0         
	//  293  639:getfield        #178 <Field Rectangle box>
	//  294  642:invokevirtual   #184 <Method float Rectangle.getWidth()>
	//  295  645:aload_0         
	//  296  646:getfield        #303 <Field int maxCharacterLength>
	//  297  649:i2f             
	//  298  650:fdiv            
	//  299  651:fstore_1        
				float f1 = borderWidth / 2.0F;
	//  300  652:aload_0         
	//  301  653:getfield        #99  <Field float borderWidth>
	//  302  656:fconst_2        
	//  303  657:fdiv            
	//  304  658:fstore_2        
				float f2 = box.getHeight();
	//  305  659:aload_0         
	//  306  660:getfield        #178 <Field Rectangle box>
	//  307  663:invokevirtual   #190 <Method float Rectangle.getHeight()>
	//  308  666:fstore_3        
				float f3 = borderWidth / 2.0F;
	//  309  667:aload_0         
	//  310  668:getfield        #99  <Field float borderWidth>
	//  311  671:fconst_2        
	//  312  672:fdiv            
	//  313  673:fstore          4
				for(int i = 1; i < maxCharacterLength; i++)
	//* 314  675:iconst_1        
	//* 315  676:istore          6
	//* 316  678:iload           6
	//* 317  680:aload_0         
	//* 318  681:getfield        #303 <Field int maxCharacterLength>
	//* 319  684:icmpge          722
				{
					float f4 = f * (float)i;
	//  320  687:fload_1         
	//  321  688:iload           6
	//  322  690:i2f             
	//  323  691:fmul            
	//  324  692:fstore          5
					pdfappearance.moveTo(f4, f1);
	//  325  694:aload           9
	//  326  696:fload           5
	//  327  698:fload_2         
	//  328  699:invokevirtual   #176 <Method void PdfAppearance.moveTo(float, float)>
					pdfappearance.lineTo(f4, f2 - f3);
	//  329  702:aload           9
	//  330  704:fload           5
	//  331  706:fload_3         
	//  332  707:fload           4
	//  333  709:fsub            
	//  334  710:invokevirtual   #187 <Method void PdfAppearance.lineTo(float, float)>
				}

	//  335  713:iload           6
	//  336  715:iconst_1        
	//  337  716:iadd            
	//  338  717:istore          6
	//* 339  719:goto            678
				pdfappearance.stroke();
	//  340  722:aload           9
	//  341  724:invokevirtual   #271 <Method void PdfAppearance.stroke()>
			}
		}
		pdfappearance.restoreState();
		return pdfappearance;
_L2:
		pdfappearance.setMatrix(0.0F, 1.0F, -1F, 0.0F, box.getHeight(), 0.0F);
		  goto _L5
_L3:
		pdfappearance.setMatrix(-1F, 0.0F, 0.0F, -1F, box.getWidth(), box.getHeight());
		  goto _L5
		pdfappearance.setMatrix(0.0F, -1F, 1.0F, 0.0F, 0.0F, box.getWidth());
		  goto _L5
	//* 342  727:goto            184
	}

	public BaseColor getBorderColor()
	{
		return borderColor;
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field BaseColor borderColor>
	//    2    4:areturn         
	}

	public int getBorderStyle()
	{
		return borderStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int borderStyle>
	//    2    4:ireturn         
	}

	public float getBorderWidth()
	{
		return borderWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field float borderWidth>
	//    2    4:freturn         
	}

	public Rectangle getBox()
	{
		return box;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Rectangle box>
	//    2    4:areturn         
	}

	public String getFieldName()
	{
		return fieldName;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String fieldName>
	//    2    4:areturn         
	}

	public BaseFont getFont()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field BaseFont font>
	//    2    4:areturn         
	}

	public float getFontSize()
	{
		return fontSize;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field float fontSize>
	//    2    4:freturn         
	}

	public int getMaxCharacterLength()
	{
		return maxCharacterLength;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field int maxCharacterLength>
	//    2    4:ireturn         
	}

	public int getOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field int options>
	//    2    4:ireturn         
	}

	protected BaseFont getRealFont()
		throws IOException, DocumentException
	{
		if(font == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field BaseFont font>
	//*   2    4:ifnonnull       18
			return BaseFont.createFont("Helvetica", "Cp1252", false);
	//    3    7:ldc2            #323 <String "Helvetica">
	//    4   10:ldc2            #325 <String "Cp1252">
	//    5   13:iconst_0        
	//    6   14:invokestatic    #329 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//    7   17:areturn         
		else
			return font;
	//    8   18:aload_0         
	//    9   19:getfield        #313 <Field BaseFont font>
	//   10   22:areturn         
	}

	public int getRotation()
	{
		return rotation;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int rotation>
	//    2    4:ireturn         
	}

	public String getText()
	{
		return text;
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field String text>
	//    2    4:areturn         
	}

	public BaseColor getTextColor()
	{
		return textColor;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field BaseColor textColor>
	//    2    4:areturn         
	}

	public int getVisibility()
	{
		return visibility;
	//    0    0:aload_0         
	//    1    1:getfield        #340 <Field int visibility>
	//    2    4:ireturn         
	}

	public PdfWriter getWriter()
	{
		return writer;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field PdfWriter writer>
	//    2    4:areturn         
	}

	public void setAlignment(int i)
	{
		alignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field int alignment>
	//    3    5:return          
	}

	public void setBackgroundColor(BaseColor basecolor)
	{
		backgroundColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #242 <Field BaseColor backgroundColor>
	//    3    5:return          
	}

	public void setBorderColor(BaseColor basecolor)
	{
		borderColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #261 <Field BaseColor borderColor>
	//    3    5:return          
	}

	public void setBorderStyle(int i)
	{
		borderStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field int borderStyle>
	//    3    5:return          
	}

	public void setBorderWidth(float f)
	{
		borderWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #99  <Field float borderWidth>
	//    3    5:return          
	}

	public void setBox(Rectangle rectangle)
	{
		if(rectangle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			box = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #178 <Field Rectangle box>
			return;
	//    5    9:return          
		} else
		{
			box = new Rectangle(rectangle);
	//    6   10:aload_0         
	//    7   11:new             #180 <Class Rectangle>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #349 <Method void Rectangle(Rectangle)>
	//   11   19:putfield        #178 <Field Rectangle box>
			box.normalize();
	//   12   22:aload_0         
	//   13   23:getfield        #178 <Field Rectangle box>
	//   14   26:invokevirtual   #352 <Method void Rectangle.normalize()>
			return;
	//   15   29:return          
		}
	}

	public void setFieldName(String s)
	{
		fieldName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field String fieldName>
	//    3    5:return          
	}

	public void setFont(BaseFont basefont)
	{
		font = basefont;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #313 <Field BaseFont font>
	//    3    5:return          
	}

	public void setFontSize(float f)
	{
		fontSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #103 <Field float fontSize>
	//    3    5:return          
	}

	public void setMaxCharacterLength(int i)
	{
		maxCharacterLength = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #303 <Field int maxCharacterLength>
	//    3    5:return          
	}

	public void setOptions(int i)
	{
		options = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #301 <Field int options>
	//    3    5:return          
	}

	public void setRotation(int i)
	{
		if(i % 90 != 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          90
	//*   2    3:irem            
	//*   3    4:ifeq            25
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("rotation.must.be.a.multiple.of.90", new Object[0]));
	//    4    7:new             #362 <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc2            #364 <String "rotation.must.be.a.multiple.of.90">
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokestatic    #370 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   21:invokespecial   #372 <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		int j = i % 360;
	//   12   25:iload_1         
	//   13   26:sipush          360
	//   14   29:irem            
	//   15   30:istore_2        
		i = j;
	//   16   31:iload_2         
	//   17   32:istore_1        
		if(j < 0)
	//*  18   33:iload_2         
	//*  19   34:ifge            43
			i = j + 360;
	//   20   37:iload_2         
	//   21   38:sipush          360
	//   22   41:iadd            
	//   23   42:istore_1        
		rotation = i;
	//   24   43:aload_0         
	//   25   44:iload_1         
	//   26   45:putfield        #107 <Field int rotation>
	//   27   48:return          
	}

	public void setRotationFromPage(Rectangle rectangle)
	{
		setRotation(rectangle.getRotation());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #375 <Method int Rectangle.getRotation()>
	//    3    5:invokevirtual   #377 <Method void setRotation(int)>
	//    4    8:return          
	}

	public void setText(String s)
	{
		text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #334 <Field String text>
	//    3    5:return          
	}

	public void setTextColor(BaseColor basecolor)
	{
		textColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #337 <Field BaseColor textColor>
	//    3    5:return          
	}

	public void setVisibility(int i)
	{
		visibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #340 <Field int visibility>
	//    3    5:return          
	}

	public void setWriter(PdfWriter pdfwriter)
	{
		writer = pdfwriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field PdfWriter writer>
	//    3    5:return          
	}

	public static final float BORDER_WIDTH_MEDIUM = 2F;
	public static final float BORDER_WIDTH_THICK = 3F;
	public static final float BORDER_WIDTH_THIN = 1F;
	public static final int COMB = 0x1000000;
	public static final int DO_NOT_SCROLL = 0x800000;
	public static final int DO_NOT_SPELL_CHECK = 0x400000;
	public static final int EDIT = 0x40000;
	public static final int FILE_SELECTION = 0x100000;
	public static final int HIDDEN = 1;
	public static final int HIDDEN_BUT_PRINTABLE = 3;
	public static final int MULTILINE = 4096;
	public static final int MULTISELECT = 0x200000;
	public static final int PASSWORD = 8192;
	public static final int READ_ONLY = 1;
	public static final int REQUIRED = 2;
	public static final int VISIBLE = 0;
	public static final int VISIBLE_BUT_DOES_NOT_PRINT = 2;
	private static final HashMap fieldKeys;
	protected int alignment;
	protected BaseColor backgroundColor;
	protected BaseColor borderColor;
	protected int borderStyle;
	protected float borderWidth;
	protected Rectangle box;
	protected String fieldName;
	protected BaseFont font;
	protected float fontSize;
	protected int maxCharacterLength;
	protected int options;
	protected int rotation;
	protected String text;
	protected BaseColor textColor;
	protected int visibility;
	protected PdfWriter writer;

	static 
	{
		fieldKeys = new HashMap();
	//    0    0:new             #66  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void HashMap()>
	//    3    7:putstatic       #71  <Field HashMap fieldKeys>
		fieldKeys.putAll(((java.util.Map) (PdfCopyFieldsImp.fieldKeys)));
	//    4   10:getstatic       #71  <Field HashMap fieldKeys>
	//    5   13:getstatic       #74  <Field HashMap PdfCopyFieldsImp.fieldKeys>
	//    6   16:invokevirtual   #78  <Method void HashMap.putAll(java.util.Map)>
		fieldKeys.put(((Object) (PdfName.T)), ((Object) (Integer.valueOf(1))));
	//    7   19:getstatic       #71  <Field HashMap fieldKeys>
	//    8   22:getstatic       #84  <Field PdfName PdfName.T>
	//    9   25:iconst_1        
	//   10   26:invokestatic    #90  <Method Integer Integer.valueOf(int)>
	//   11   29:invokevirtual   #94  <Method Object HashMap.put(Object, Object)>
	//   12   32:pop             
	//*  13   33:return          
	}
}
