// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.internal;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.interfaces.PdfXConformance;

public class PdfXConformanceImp
	implements PdfXConformance
{

	public PdfXConformanceImp(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		pdfxConformance = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int pdfxConformance>
		writer = pdfwriter;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field PdfWriter writer>
	//    8   14:return          
	}

	public void checkPdfIsoConformance(int i, Object obj)
	{
		if(writer != null && writer.isPdfX()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PdfWriter writer>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field PdfWriter writer>
	//    5   11:invokevirtual   #28  <Method boolean PdfWriter.isPdfX()>
	//    6   14:ifne            18
_L1:
		return;
	//    7   17:return          
_L2:
		int j = writer.getPDFXConformance();
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field PdfWriter writer>
	//   10   22:invokevirtual   #32  <Method int PdfWriter.getPDFXConformance()>
	//   11   25:istore          5
		i;
	//   12   27:iload_1         
		JVM INSTR tableswitch 1 7: default 72
	//	               1 73
	//	               2 17
	//	               3 241
	//	               4 264
	//	               5 301
	//	               6 440
	//	               7 613;
	//   13   28:tableswitch     1 7: default 72
	//	               1 73
	//	               2 17
	//	               3 241
	//	               4 264
	//	               5 301
	//	               6 440
	//	               7 613
		   goto _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L9
_L3:
		return;
	//   14   72:return          
_L4:
		switch(j)
	//*  15   73:iload           5
		{
	//*  16   75:tableswitch     1 1: default 92
	//	               1 93
		default:
			return;
	//   17   92:return          

		case 1: // '\001'
			break;
		}
		if(!(obj instanceof ExtendedColor))
			continue; /* Loop/switch isn't completed */
	//   18   93:aload_2         
	//   19   94:instanceof      #34  <Class ExtendedColor>
	//   20   97:ifeq            217
		obj = ((Object) ((ExtendedColor)obj));
	//   21  100:aload_2         
	//   22  101:checkcast       #34  <Class ExtendedColor>
	//   23  104:astore_2        
		switch(((ExtendedColor) (obj)).getType())
	//*  24  105:aload_2         
	//*  25  106:invokevirtual   #37  <Method int ExtendedColor.getType()>
		{
	//*  26  109:tableswitch     0 5: default 148
	//	               0 149
	//	               1 17
	//	               2 17
	//	               3 166
	//	               4 201
	//	               5 182
		default:
			return;
	//   27  148:return          

		case 0: // '\0'
			throw new PdfXConformanceException(MessageLocalization.getComposedMessage("colorspace.rgb.is.not.allowed", new Object[0]));
	//   28  149:new             #39  <Class PdfXConformanceException>
	//   29  152:dup             
	//   30  153:ldc1            #41  <String "colorspace.rgb.is.not.allowed">
	//   31  155:iconst_0        
	//   32  156:anewarray       Object[]
	//   33  159:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   34  162:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//   35  165:athrow          

		case 3: // '\003'
			checkPdfIsoConformance(1, ((Object) (((SpotColor)obj).getPdfSpotColor().getAlternativeCS())));
	//   36  166:aload_0         
	//   37  167:iconst_1        
	//   38  168:aload_2         
	//   39  169:checkcast       #52  <Class SpotColor>
	//   40  172:invokevirtual   #56  <Method PdfSpotColor SpotColor.getPdfSpotColor()>
	//   41  175:invokevirtual   #62  <Method BaseColor PdfSpotColor.getAlternativeCS()>
	//   42  178:invokevirtual   #64  <Method void checkPdfIsoConformance(int, Object)>
			return;
	//   43  181:return          

		case 5: // '\005'
			checkPdfIsoConformance(1, ((Object) (((ShadingColor)obj).getPdfShadingPattern().getShading().getColorSpace())));
	//   44  182:aload_0         
	//   45  183:iconst_1        
	//   46  184:aload_2         
	//   47  185:checkcast       #66  <Class ShadingColor>
	//   48  188:invokevirtual   #70  <Method PdfShadingPattern ShadingColor.getPdfShadingPattern()>
	//   49  191:invokevirtual   #76  <Method PdfShading PdfShadingPattern.getShading()>
	//   50  194:invokevirtual   #81  <Method BaseColor PdfShading.getColorSpace()>
	//   51  197:invokevirtual   #64  <Method void checkPdfIsoConformance(int, Object)>
			return;
	//   52  200:return          

		case 4: // '\004'
			checkPdfIsoConformance(1, ((Object) (((PatternColor)obj).getPainter().getDefaultColor())));
	//   53  201:aload_0         
	//   54  202:iconst_1        
	//   55  203:aload_2         
	//   56  204:checkcast       #83  <Class PatternColor>
	//   57  207:invokevirtual   #87  <Method PdfPatternPainter PatternColor.getPainter()>
	//   58  210:invokevirtual   #92  <Method BaseColor PdfPatternPainter.getDefaultColor()>
	//   59  213:invokevirtual   #64  <Method void checkPdfIsoConformance(int, Object)>
			return;
	//   60  216:return          

		case 1: // '\001'
		case 2: // '\002'
			break;
		}
		  goto _L1
		if(!(obj instanceof BaseColor)) goto _L1; else goto _L10
	//   61  217:aload_2         
	//   62  218:instanceof      #94  <Class BaseColor>
	//   63  221:ifeq            17
_L10:
		throw new PdfXConformanceException(MessageLocalization.getComposedMessage("colorspace.rgb.is.not.allowed", new Object[0]));
	//   64  224:new             #39  <Class PdfXConformanceException>
	//   65  227:dup             
	//   66  228:ldc1            #41  <String "colorspace.rgb.is.not.allowed">
	//   67  230:iconst_0        
	//   68  231:anewarray       Object[]
	//   69  234:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   70  237:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//   71  240:athrow          
_L5:
		if(j == 1)
	//*  72  241:iload           5
	//*  73  243:iconst_1        
	//*  74  244:icmpne          17
			throw new PdfXConformanceException(MessageLocalization.getComposedMessage("colorspace.rgb.is.not.allowed", new Object[0]));
	//   75  247:new             #39  <Class PdfXConformanceException>
	//   76  250:dup             
	//   77  251:ldc1            #41  <String "colorspace.rgb.is.not.allowed">
	//   78  253:iconst_0        
	//   79  254:anewarray       Object[]
	//   80  257:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   81  260:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//   82  263:athrow          
		  goto _L1
_L6:
		if(!((BaseFont)obj).isEmbedded())
	//*  83  264:aload_2         
	//*  84  265:checkcast       #96  <Class BaseFont>
	//*  85  268:invokevirtual   #99  <Method boolean BaseFont.isEmbedded()>
	//*  86  271:ifne            17
			throw new PdfXConformanceException(MessageLocalization.getComposedMessage("all.the.fonts.must.be.embedded.this.one.isn.t.1", new Object[] {
				((BaseFont)obj).getPostscriptFontName()
			}));
	//   87  274:new             #39  <Class PdfXConformanceException>
	//   88  277:dup             
	//   89  278:ldc1            #101 <String "all.the.fonts.must.be.embedded.this.one.isn.t.1">
	//   90  280:iconst_1        
	//   91  281:anewarray       Object[]
	//   92  284:dup             
	//   93  285:iconst_0        
	//   94  286:aload_2         
	//   95  287:checkcast       #96  <Class BaseFont>
	//   96  290:invokevirtual   #105 <Method String BaseFont.getPostscriptFontName()>
	//   97  293:aastore         
	//   98  294:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   99  297:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  100  300:athrow          
		  goto _L1
_L7:
		obj = ((Object) ((PdfImage)obj));
	//  101  301:aload_2         
	//  102  302:checkcast       #107 <Class PdfImage>
	//  103  305:astore_2        
		if(((PdfImage) (obj)).get(PdfName.SMASK) != null)
	//* 104  306:aload_2         
	//* 105  307:getstatic       #113 <Field PdfName PdfName.SMASK>
	//* 106  310:invokevirtual   #117 <Method PdfObject PdfImage.get(PdfName)>
	//* 107  313:ifnull          333
			throw new PdfXConformanceException(MessageLocalization.getComposedMessage("the.smask.key.is.not.allowed.in.images", new Object[0]));
	//  108  316:new             #39  <Class PdfXConformanceException>
	//  109  319:dup             
	//  110  320:ldc1            #119 <String "the.smask.key.is.not.allowed.in.images">
	//  111  322:iconst_0        
	//  112  323:anewarray       Object[]
	//  113  326:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  114  329:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  115  332:athrow          
		switch(j)
	//* 116  333:iload           5
		{
	//* 117  335:tableswitch     1 1: default 352
	//	               1 353
		default:
			return;
	//  118  352:return          

		case 1: // '\001'
			obj = ((Object) (((PdfImage) (obj)).get(PdfName.COLORSPACE)));
	//  119  353:aload_2         
	//  120  354:getstatic       #122 <Field PdfName PdfName.COLORSPACE>
	//  121  357:invokevirtual   #117 <Method PdfObject PdfImage.get(PdfName)>
	//  122  360:astore_2        
			break;
		}
		if(obj == null) goto _L1; else goto _L11
	//  123  361:aload_2         
	//  124  362:ifnull          17
_L11:
		if(!((PdfObject) (obj)).isName())
			continue; /* Loop/switch isn't completed */
	//  125  365:aload_2         
	//  126  366:invokevirtual   #127 <Method boolean PdfObject.isName()>
	//  127  369:ifeq            399
		if(!PdfName.DEVICERGB.equals(obj)) goto _L1; else goto _L12
	//  128  372:getstatic       #130 <Field PdfName PdfName.DEVICERGB>
	//  129  375:aload_2         
	//  130  376:invokevirtual   #134 <Method boolean PdfName.equals(Object)>
	//  131  379:ifeq            17
_L12:
		throw new PdfXConformanceException(MessageLocalization.getComposedMessage("colorspace.rgb.is.not.allowed", new Object[0]));
	//  132  382:new             #39  <Class PdfXConformanceException>
	//  133  385:dup             
	//  134  386:ldc1            #41  <String "colorspace.rgb.is.not.allowed">
	//  135  388:iconst_0        
	//  136  389:anewarray       Object[]
	//  137  392:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  138  395:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  139  398:athrow          
		if(!((PdfObject) (obj)).isArray() || !PdfName.CALRGB.equals(((Object) (((PdfArray)obj).getPdfObject(0))))) goto _L1; else goto _L13
	//  140  399:aload_2         
	//  141  400:invokevirtual   #137 <Method boolean PdfObject.isArray()>
	//  142  403:ifeq            17
	//  143  406:getstatic       #140 <Field PdfName PdfName.CALRGB>
	//  144  409:aload_2         
	//  145  410:checkcast       #142 <Class PdfArray>
	//  146  413:iconst_0        
	//  147  414:invokevirtual   #146 <Method PdfObject PdfArray.getPdfObject(int)>
	//  148  417:invokevirtual   #134 <Method boolean PdfName.equals(Object)>
	//  149  420:ifeq            17
_L13:
		throw new PdfXConformanceException(MessageLocalization.getComposedMessage("colorspace.calrgb.is.not.allowed", new Object[0]));
	//  150  423:new             #39  <Class PdfXConformanceException>
	//  151  426:dup             
	//  152  427:ldc1            #148 <String "colorspace.calrgb.is.not.allowed">
	//  153  429:iconst_0        
	//  154  430:anewarray       Object[]
	//  155  433:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  156  436:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  157  439:athrow          
_L8:
		obj = ((Object) ((PdfDictionary)obj));
	//  158  440:aload_2         
	//  159  441:checkcast       #150 <Class PdfDictionary>
	//  160  444:astore_2        
		if(obj != null)
	//* 161  445:aload_2         
	//* 162  446:ifnull          17
		{
			PdfObject pdfobject = ((PdfDictionary) (obj)).get(PdfName.BM);
	//  163  449:aload_2         
	//  164  450:getstatic       #153 <Field PdfName PdfName.BM>
	//  165  453:invokevirtual   #154 <Method PdfObject PdfDictionary.get(PdfName)>
	//  166  456:astore          6
			if(pdfobject != null && !PdfGState.BM_NORMAL.equals(((Object) (pdfobject))) && !PdfGState.BM_COMPATIBLE.equals(((Object) (pdfobject))))
	//* 167  458:aload           6
	//* 168  460:ifnull          510
	//* 169  463:getstatic       #159 <Field PdfName PdfGState.BM_NORMAL>
	//* 170  466:aload           6
	//* 171  468:invokevirtual   #134 <Method boolean PdfName.equals(Object)>
	//* 172  471:ifne            510
	//* 173  474:getstatic       #162 <Field PdfName PdfGState.BM_COMPATIBLE>
	//* 174  477:aload           6
	//* 175  479:invokevirtual   #134 <Method boolean PdfName.equals(Object)>
	//* 176  482:ifne            510
				throw new PdfXConformanceException(MessageLocalization.getComposedMessage("blend.mode.1.not.allowed", new Object[] {
					pdfobject.toString()
				}));
	//  177  485:new             #39  <Class PdfXConformanceException>
	//  178  488:dup             
	//  179  489:ldc1            #164 <String "blend.mode.1.not.allowed">
	//  180  491:iconst_1        
	//  181  492:anewarray       Object[]
	//  182  495:dup             
	//  183  496:iconst_0        
	//  184  497:aload           6
	//  185  499:invokevirtual   #167 <Method String PdfObject.toString()>
	//  186  502:aastore         
	//  187  503:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  188  506:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  189  509:athrow          
			pdfobject = ((PdfDictionary) (obj)).get(PdfName.CA);
	//  190  510:aload_2         
	//  191  511:getstatic       #170 <Field PdfName PdfName.CA>
	//  192  514:invokevirtual   #154 <Method PdfObject PdfDictionary.get(PdfName)>
	//  193  517:astore          6
			if(pdfobject != null)
	//* 194  519:aload           6
	//* 195  521:ifnull          563
			{
				double d = ((PdfNumber)pdfobject).doubleValue();
	//  196  524:aload           6
	//  197  526:checkcast       #172 <Class PdfNumber>
	//  198  529:invokevirtual   #176 <Method double PdfNumber.doubleValue()>
	//  199  532:dstore_3        
				if(d != 1.0D)
	//* 200  533:dload_3         
	//* 201  534:dconst_1        
	//* 202  535:dcmpl           
	//* 203  536:ifeq            563
					throw new PdfXConformanceException(MessageLocalization.getComposedMessage("transparency.is.not.allowed.ca.eq.1", new Object[] {
						String.valueOf(d)
					}));
	//  204  539:new             #39  <Class PdfXConformanceException>
	//  205  542:dup             
	//  206  543:ldc1            #178 <String "transparency.is.not.allowed.ca.eq.1">
	//  207  545:iconst_1        
	//  208  546:anewarray       Object[]
	//  209  549:dup             
	//  210  550:iconst_0        
	//  211  551:dload_3         
	//  212  552:invokestatic    #184 <Method String String.valueOf(double)>
	//  213  555:aastore         
	//  214  556:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  215  559:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  216  562:athrow          
			}
			obj = ((Object) (((PdfDictionary) (obj)).get(PdfName.ca)));
	//  217  563:aload_2         
	//  218  564:getstatic       #187 <Field PdfName PdfName.ca>
	//  219  567:invokevirtual   #154 <Method PdfObject PdfDictionary.get(PdfName)>
	//  220  570:astore_2        
			if(obj != null)
	//* 221  571:aload_2         
	//* 222  572:ifnull          17
			{
				double d1 = ((PdfNumber)obj).doubleValue();
	//  223  575:aload_2         
	//  224  576:checkcast       #172 <Class PdfNumber>
	//  225  579:invokevirtual   #176 <Method double PdfNumber.doubleValue()>
	//  226  582:dstore_3        
				if(d1 != 1.0D)
	//* 227  583:dload_3         
	//* 228  584:dconst_1        
	//* 229  585:dcmpl           
	//* 230  586:ifeq            17
					throw new PdfXConformanceException(MessageLocalization.getComposedMessage("transparency.is.not.allowed.ca.eq.1", new Object[] {
						String.valueOf(d1)
					}));
	//  231  589:new             #39  <Class PdfXConformanceException>
	//  232  592:dup             
	//  233  593:ldc1            #178 <String "transparency.is.not.allowed.ca.eq.1">
	//  234  595:iconst_1        
	//  235  596:anewarray       Object[]
	//  236  599:dup             
	//  237  600:iconst_0        
	//  238  601:dload_3         
	//  239  602:invokestatic    #184 <Method String String.valueOf(double)>
	//  240  605:aastore         
	//  241  606:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  242  609:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  243  612:athrow          
			}
		}
		  goto _L1
_L9:
		throw new PdfXConformanceException(MessageLocalization.getComposedMessage("layers.are.not.allowed", new Object[0]));
	//  244  613:new             #39  <Class PdfXConformanceException>
	//  245  616:dup             
	//  246  617:ldc1            #189 <String "layers.are.not.allowed">
	//  247  619:iconst_0        
	//  248  620:anewarray       Object[]
	//  249  623:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  250  626:invokespecial   #50  <Method void PdfXConformanceException(String)>
	//  251  629:athrow          
	}

	public int getPDFXConformance()
	{
		return pdfxConformance;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int pdfxConformance>
	//    2    4:ireturn         
	}

	public boolean isPdfIso()
	{
		return isPdfX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method boolean isPdfX()>
	//    2    4:ireturn         
	}

	public boolean isPdfX()
	{
		return pdfxConformance != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int pdfxConformance>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isPdfX1A2001()
	{
		return pdfxConformance == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int pdfxConformance>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isPdfX32002()
	{
		return pdfxConformance == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int pdfxConformance>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void setPDFXConformance(int i)
	{
		pdfxConformance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int pdfxConformance>
	//    3    5:return          
	}

	protected int pdfxConformance;
	protected PdfWriter writer;
}
