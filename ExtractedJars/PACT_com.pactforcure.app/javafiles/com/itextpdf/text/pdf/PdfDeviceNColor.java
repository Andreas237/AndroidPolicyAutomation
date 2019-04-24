// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.itextpdf.text.pdf:
//			ICachedColorSpace, IPdfSpecialColorSpace, ColorDetails, PdfWriter, 
//			PdfArray, PdfName, PdfDictionary, PdfSpotColor, 
//			ExtendedColor, GrayColor, CMYKColor, LabColor, 
//			PdfFunction, PdfObject

public class PdfDeviceNColor
	implements ICachedColorSpace, IPdfSpecialColorSpace
{

	public PdfDeviceNColor(PdfSpotColor apdfspotcolor[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		spotColors = apdfspotcolor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field PdfSpotColor[] spotColors>
	//    5    9:return          
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof PdfDeviceNColor))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PdfDeviceNColor>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((PdfDeviceNColor)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PdfDeviceNColor>
	//   12   20:astore_1        
			if(!Arrays.equals(((Object []) (spotColors)), ((Object []) (((PdfDeviceNColor) (obj)).spotColors))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #19  <Field PdfSpotColor[] spotColors>
	//*  15   25:aload_1         
	//*  16   26:getfield        #19  <Field PdfSpotColor[] spotColors>
	//*  17   29:invokestatic    #27  <Method boolean Arrays.equals(Object[], Object[])>
	//*  18   32:ifne            5
				return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		}
		return true;
	}

	public ColorDetails[] getColorantDetails(PdfWriter pdfwriter)
	{
		if(colorantsDetails == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field ColorDetails[] colorantsDetails>
	//*   2    4:ifnonnull       69
		{
			colorantsDetails = new ColorDetails[spotColors.length];
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field PdfSpotColor[] spotColors>
	//    6   12:arraylength     
	//    7   13:anewarray       ColorDetails[]
	//    8   16:putfield        #31  <Field ColorDetails[] colorantsDetails>
			int j = 0;
	//    9   19:iconst_0        
	//   10   20:istore_3        
			PdfSpotColor apdfspotcolor[] = spotColors;
	//   11   21:aload_0         
	//   12   22:getfield        #19  <Field PdfSpotColor[] spotColors>
	//   13   25:astore          5
			int k = apdfspotcolor.length;
	//   14   27:aload           5
	//   15   29:arraylength     
	//   16   30:istore          4
			for(int i = 0; i < k; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_2        
	//*  19   34:iload_2         
	//*  20   35:iload           4
	//*  21   37:icmpge          69
			{
				PdfSpotColor pdfspotcolor = apdfspotcolor[i];
	//   22   40:aload           5
	//   23   42:iload_2         
	//   24   43:aaload          
	//   25   44:astore          6
				colorantsDetails[j] = pdfwriter.addSimple(((ICachedColorSpace) (pdfspotcolor)));
	//   26   46:aload_0         
	//   27   47:getfield        #31  <Field ColorDetails[] colorantsDetails>
	//   28   50:iload_3         
	//   29   51:aload_1         
	//   30   52:aload           6
	//   31   54:invokevirtual   #39  <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//   32   57:aastore         
				j++;
	//   33   58:iload_3         
	//   34   59:iconst_1        
	//   35   60:iadd            
	//   36   61:istore_3        
			}

	//   37   62:iload_2         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:istore_2        
		}
	//*  41   66:goto            34
		return colorantsDetails;
	//   42   69:aload_0         
	//   43   70:getfield        #31  <Field ColorDetails[] colorantsDetails>
	//   44   73:areturn         
	}

	public int getNumberOfColorants()
	{
		return spotColors.length;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PdfSpotColor[] spotColors>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public PdfObject getPdfObject(PdfWriter pdfwriter)
	{
		int i;
		int l;
		String s;
		Object obj;
		PdfArray pdfarray;
		PdfDictionary pdfdictionary;
		float af[];
		float af1[][];
		pdfarray = new PdfArray(((PdfObject) (PdfName.DEVICEN)));
	//    0    0:new             #45  <Class PdfArray>
	//    1    3:dup             
	//    2    4:getstatic       #51  <Field PdfName PdfName.DEVICEN>
	//    3    7:invokespecial   #54  <Method void PdfArray(PdfObject)>
	//    4   10:astore          13
		obj = ((Object) (new PdfArray()));
	//    5   12:new             #45  <Class PdfArray>
	//    6   15:dup             
	//    7   16:invokespecial   #55  <Method void PdfArray()>
	//    8   19:astore          12
		af = new float[spotColors.length * 2];
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field PdfSpotColor[] spotColors>
	//   11   25:arraylength     
	//   12   26:iconst_2        
	//   13   27:imul            
	//   14   28:newarray        float[]
	//   15   30:astore          15
		pdfdictionary = new PdfDictionary();
	//   16   32:new             #57  <Class PdfDictionary>
	//   17   35:dup             
	//   18   36:invokespecial   #58  <Method void PdfDictionary()>
	//   19   39:astore          14
		s = "";
	//   20   41:ldc1            #60  <String "">
	//   21   43:astore          11
		l = spotColors.length;
	//   22   45:aload_0         
	//   23   46:getfield        #19  <Field PdfSpotColor[] spotColors>
	//   24   49:arraylength     
	//   25   50:istore          10
		af1 = (float[][])Array.newInstance(Float.TYPE, new int[] {
			4, l
		});
	//   26   52:getstatic       #66  <Field Class Float.TYPE>
	//   27   55:iconst_2        
	//   28   56:newarray        int[]
	//   29   58:dup             
	//   30   59:iconst_0        
	//   31   60:iconst_4        
	//   32   61:iastore         
	//   33   62:dup             
	//   34   63:iconst_1        
	//   35   64:iload           10
	//   36   66:iastore         
	//   37   67:invokestatic    #72  <Method Object Array.newInstance(Class, int[])>
	//   38   70:checkcast       #74  <Class float[][]>
	//   39   73:astore          16
		i = 0;
	//   40   75:iconst_0        
	//   41   76:istore          8
_L7:
		Object obj1;
		if(i >= l)
			break MISSING_BLOCK_LABEL_626;
	//   42   78:iload           8
	//   43   80:iload           10
	//   44   82:icmpge          626
		obj1 = ((Object) (spotColors[i]));
	//   45   85:aload_0         
	//   46   86:getfield        #19  <Field PdfSpotColor[] spotColors>
	//   47   89:iload           8
	//   48   91:aaload          
	//   49   92:astore          17
		af[i * 2] = 0.0F;
	//   50   94:aload           15
	//   51   96:iload           8
	//   52   98:iconst_2        
	//   53   99:imul            
	//   54  100:fconst_0        
	//   55  101:fastore         
		af[i * 2 + 1] = 1.0F;
	//   56  102:aload           15
	//   57  104:iload           8
	//   58  106:iconst_2        
	//   59  107:imul            
	//   60  108:iconst_1        
	//   61  109:iadd            
	//   62  110:fconst_1        
	//   63  111:fastore         
		((PdfArray) (obj)).add(((PdfObject) (((PdfSpotColor) (obj1)).getName())));
	//   64  112:aload           12
	//   65  114:aload           17
	//   66  116:invokevirtual   #80  <Method PdfName PdfSpotColor.getName()>
	//   67  119:invokevirtual   #84  <Method boolean PdfArray.add(PdfObject)>
	//   68  122:pop             
		if(pdfdictionary.get(((PdfSpotColor) (obj1)).getName()) != null)
	//*  69  123:aload           14
	//*  70  125:aload           17
	//*  71  127:invokevirtual   #80  <Method PdfName PdfSpotColor.getName()>
	//*  72  130:invokevirtual   #88  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  73  133:ifnull          153
			throw new RuntimeException(MessageLocalization.getComposedMessage("devicen.component.names.shall.be.different", new Object[0]));
	//   74  136:new             #90  <Class RuntimeException>
	//   75  139:dup             
	//   76  140:ldc1            #92  <String "devicen.component.names.shall.be.different">
	//   77  142:iconst_0        
	//   78  143:anewarray       Object[]
	//   79  146:invokestatic    #98  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   80  149:invokespecial   #101 <Method void RuntimeException(String)>
	//   81  152:athrow          
		if(colorantsDetails != null)
	//*  82  153:aload_0         
	//*  83  154:getfield        #31  <Field ColorDetails[] colorantsDetails>
	//*  84  157:ifnull          253
			pdfdictionary.put(((PdfSpotColor) (obj1)).getName(), ((PdfObject) (colorantsDetails[i].getIndirectReference())));
	//   85  160:aload           14
	//   86  162:aload           17
	//   87  164:invokevirtual   #80  <Method PdfName PdfSpotColor.getName()>
	//   88  167:aload_0         
	//   89  168:getfield        #31  <Field ColorDetails[] colorantsDetails>
	//   90  171:iload           8
	//   91  173:aaload          
	//   92  174:invokevirtual   #105 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   93  177:invokevirtual   #109 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  94  180:aload           17
	//*  95  182:invokevirtual   #113 <Method BaseColor PdfSpotColor.getAlternativeCS()>
	//*  96  185:astore          17
	//*  97  187:aload           17
	//*  98  189:instanceof      #115 <Class ExtendedColor>
	//*  99  192:ifeq            468
	//* 100  195:aload           17
	//* 101  197:checkcast       #115 <Class ExtendedColor>
	//* 102  200:getfield        #119 <Field int ExtendedColor.type>
	//* 103  203:lookupswitch    3: default 236
	//	               1: 272
	//	               2: 344
	//	               7: 407
	//* 104  236:new             #90  <Class RuntimeException>
	//* 105  239:dup             
	//* 106  240:ldc1            #121 <String "only.rgb.gray.and.cmyk.are.supported.as.alternative.color.spaces">
	//* 107  242:iconst_0        
	//* 108  243:anewarray       Object[]
	//* 109  246:invokestatic    #98  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 110  249:invokespecial   #101 <Method void RuntimeException(String)>
	//* 111  252:athrow          
			pdfdictionary.put(((PdfSpotColor) (obj1)).getName(), ((PdfSpotColor) (obj1)).getPdfObject(pdfwriter));
	//  112  253:aload           14
	//  113  255:aload           17
	//  114  257:invokevirtual   #80  <Method PdfName PdfSpotColor.getName()>
	//  115  260:aload           17
	//  116  262:aload_1         
	//  117  263:invokevirtual   #123 <Method PdfObject PdfSpotColor.getPdfObject(PdfWriter)>
	//  118  266:invokevirtual   #109 <Method void PdfDictionary.put(PdfName, PdfObject)>
		obj1 = ((Object) (((PdfSpotColor) (obj1)).getAlternativeCS()));
		if(!(obj1 instanceof ExtendedColor)) goto _L2; else goto _L1
_L1:
		((ExtendedColor)obj1).type;
		JVM INSTR lookupswitch 3: default 236
	//	               1: 272
	//	               2: 344
	//	               7: 407;
		   goto _L3 _L4 _L5 _L6
_L3:
		throw new RuntimeException(MessageLocalization.getComposedMessage("only.rgb.gray.and.cmyk.are.supported.as.alternative.color.spaces", new Object[0]));
	//* 119  269:goto            180
_L4:
		af1[0][i] = 0;
	//  120  272:aload           16
	//  121  274:iconst_0        
	//  122  275:aaload          
	//  123  276:iload           8
	//  124  278:iconst_0        
	//  125  279:iastore         
		af1[1][i] = 0;
	//  126  280:aload           16
	//  127  282:iconst_1        
	//  128  283:aaload          
	//  129  284:iload           8
	//  130  286:iconst_0        
	//  131  287:iastore         
		af1[2][i] = 0;
	//  132  288:aload           16
	//  133  290:iconst_2        
	//  134  291:aaload          
	//  135  292:iload           8
	//  136  294:iconst_0        
	//  137  295:iastore         
		af1[3][i] = 1.0F - ((GrayColor)obj1).getGray();
	//  138  296:aload           16
	//  139  298:iconst_3        
	//  140  299:aaload          
	//  141  300:iload           8
	//  142  302:fconst_1        
	//  143  303:aload           17
	//  144  305:checkcast       #125 <Class GrayColor>
	//  145  308:invokevirtual   #129 <Method float GrayColor.getGray()>
	//  146  311:fsub            
	//  147  312:fastore         
_L8:
		s = (new StringBuilder()).append(s).append("pop ").toString();
	//  148  313:new             #131 <Class StringBuilder>
	//  149  316:dup             
	//  150  317:invokespecial   #132 <Method void StringBuilder()>
	//  151  320:aload           11
	//  152  322:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  153  325:ldc1            #138 <String "pop ">
	//  154  327:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  155  330:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  156  333:astore          11
		i++;
	//  157  335:iload           8
	//  158  337:iconst_1        
	//  159  338:iadd            
	//  160  339:istore          8
		  goto _L7
	//* 161  341:goto            78
_L5:
		af1[0][i] = ((CMYKColor)obj1).getCyan();
	//  162  344:aload           16
	//  163  346:iconst_0        
	//  164  347:aaload          
	//  165  348:iload           8
	//  166  350:aload           17
	//  167  352:checkcast       #144 <Class CMYKColor>
	//  168  355:invokevirtual   #147 <Method float CMYKColor.getCyan()>
	//  169  358:fastore         
		af1[1][i] = ((CMYKColor)obj1).getMagenta();
	//  170  359:aload           16
	//  171  361:iconst_1        
	//  172  362:aaload          
	//  173  363:iload           8
	//  174  365:aload           17
	//  175  367:checkcast       #144 <Class CMYKColor>
	//  176  370:invokevirtual   #150 <Method float CMYKColor.getMagenta()>
	//  177  373:fastore         
		af1[2][i] = ((CMYKColor)obj1).getYellow();
	//  178  374:aload           16
	//  179  376:iconst_2        
	//  180  377:aaload          
	//  181  378:iload           8
	//  182  380:aload           17
	//  183  382:checkcast       #144 <Class CMYKColor>
	//  184  385:invokevirtual   #153 <Method float CMYKColor.getYellow()>
	//  185  388:fastore         
		af1[3][i] = ((CMYKColor)obj1).getBlack();
	//  186  389:aload           16
	//  187  391:iconst_3        
	//  188  392:aaload          
	//  189  393:iload           8
	//  190  395:aload           17
	//  191  397:checkcast       #144 <Class CMYKColor>
	//  192  400:invokevirtual   #156 <Method float CMYKColor.getBlack()>
	//  193  403:fastore         
		  goto _L8
	//* 194  404:goto            313
_L6:
		obj1 = ((Object) (((LabColor)obj1).toCmyk()));
	//  195  407:aload           17
	//  196  409:checkcast       #158 <Class LabColor>
	//  197  412:invokevirtual   #162 <Method CMYKColor LabColor.toCmyk()>
	//  198  415:astore          17
		af1[0][i] = ((CMYKColor) (obj1)).getCyan();
	//  199  417:aload           16
	//  200  419:iconst_0        
	//  201  420:aaload          
	//  202  421:iload           8
	//  203  423:aload           17
	//  204  425:invokevirtual   #147 <Method float CMYKColor.getCyan()>
	//  205  428:fastore         
		af1[1][i] = ((CMYKColor) (obj1)).getMagenta();
	//  206  429:aload           16
	//  207  431:iconst_1        
	//  208  432:aaload          
	//  209  433:iload           8
	//  210  435:aload           17
	//  211  437:invokevirtual   #150 <Method float CMYKColor.getMagenta()>
	//  212  440:fastore         
		af1[2][i] = ((CMYKColor) (obj1)).getYellow();
	//  213  441:aload           16
	//  214  443:iconst_2        
	//  215  444:aaload          
	//  216  445:iload           8
	//  217  447:aload           17
	//  218  449:invokevirtual   #153 <Method float CMYKColor.getYellow()>
	//  219  452:fastore         
		af1[3][i] = ((CMYKColor) (obj1)).getBlack();
	//  220  453:aload           16
	//  221  455:iconst_3        
	//  222  456:aaload          
	//  223  457:iload           8
	//  224  459:aload           17
	//  225  461:invokevirtual   #156 <Method float CMYKColor.getBlack()>
	//  226  464:fastore         
		  goto _L8
	//* 227  465:goto            313
_L2:
		float f5 = ((BaseColor) (obj1)).getRed();
	//  228  468:aload           17
	//  229  470:invokevirtual   #167 <Method int BaseColor.getRed()>
	//  230  473:i2f             
	//  231  474:fstore          7
		float f4 = ((BaseColor) (obj1)).getGreen();
	//  232  476:aload           17
	//  233  478:invokevirtual   #170 <Method int BaseColor.getGreen()>
	//  234  481:i2f             
	//  235  482:fstore          6
		float f1 = ((BaseColor) (obj1)).getBlue();
	//  236  484:aload           17
	//  237  486:invokevirtual   #173 <Method int BaseColor.getBlue()>
	//  238  489:i2f             
	//  239  490:fstore_3        
		float f = 0.0F;
	//  240  491:fconst_0        
	//  241  492:fstore_2        
		float f2 = 0.0F;
	//  242  493:fconst_0        
	//  243  494:fstore          4
		float f3 = 0.0F;
	//  244  496:fconst_0        
	//  245  497:fstore          5
		if(f5 == 0.0F && f4 == 0.0F && f1 == 0.0F)
	//* 246  499:fload           7
	//* 247  501:fconst_0        
	//* 248  502:fcmpl           
	//* 249  503:ifne            558
	//* 250  506:fload           6
	//* 251  508:fconst_0        
	//* 252  509:fcmpl           
	//* 253  510:ifne            558
	//* 254  513:fload_3         
	//* 255  514:fconst_0        
	//* 256  515:fcmpl           
	//* 257  516:ifne            558
		{
			f1 = 1.0F;
	//  258  519:fconst_1        
	//  259  520:fstore_3        
		} else
	//* 260  521:aload           16
	//* 261  523:iconst_0        
	//* 262  524:aaload          
	//* 263  525:iload           8
	//* 264  527:fload_2         
	//* 265  528:fastore         
	//* 266  529:aload           16
	//* 267  531:iconst_1        
	//* 268  532:aaload          
	//* 269  533:iload           8
	//* 270  535:fload           4
	//* 271  537:fastore         
	//* 272  538:aload           16
	//* 273  540:iconst_2        
	//* 274  541:aaload          
	//* 275  542:iload           8
	//* 276  544:fload           5
	//* 277  546:fastore         
	//* 278  547:aload           16
	//* 279  549:iconst_3        
	//* 280  550:aaload          
	//* 281  551:iload           8
	//* 282  553:fload_3         
	//* 283  554:fastore         
	//* 284  555:goto            313
		{
			f = 1.0F - f5 / 255F;
	//  285  558:fconst_1        
	//  286  559:fload           7
	//  287  561:ldc1            #174 <Float 255F>
	//  288  563:fdiv            
	//  289  564:fsub            
	//  290  565:fstore_2        
			f2 = 1.0F - f4 / 255F;
	//  291  566:fconst_1        
	//  292  567:fload           6
	//  293  569:ldc1            #174 <Float 255F>
	//  294  571:fdiv            
	//  295  572:fsub            
	//  296  573:fstore          4
			f3 = 1.0F - f1 / 255F;
	//  297  575:fconst_1        
	//  298  576:fload_3         
	//  299  577:ldc1            #174 <Float 255F>
	//  300  579:fdiv            
	//  301  580:fsub            
	//  302  581:fstore          5
			f1 = Math.min(f, Math.min(f2, f3));
	//  303  583:fload_2         
	//  304  584:fload           4
	//  305  586:fload           5
	//  306  588:invokestatic    #180 <Method float Math.min(float, float)>
	//  307  591:invokestatic    #180 <Method float Math.min(float, float)>
	//  308  594:fstore_3        
			f = (f - f1) / (1.0F - f1);
	//  309  595:fload_2         
	//  310  596:fload_3         
	//  311  597:fsub            
	//  312  598:fconst_1        
	//  313  599:fload_3         
	//  314  600:fsub            
	//  315  601:fdiv            
	//  316  602:fstore_2        
			f2 = (f2 - f1) / (1.0F - f1);
	//  317  603:fload           4
	//  318  605:fload_3         
	//  319  606:fsub            
	//  320  607:fconst_1        
	//  321  608:fload_3         
	//  322  609:fsub            
	//  323  610:fdiv            
	//  324  611:fstore          4
			f3 = (f3 - f1) / (1.0F - f1);
	//  325  613:fload           5
	//  326  615:fload_3         
	//  327  616:fsub            
	//  328  617:fconst_1        
	//  329  618:fload_3         
	//  330  619:fsub            
	//  331  620:fdiv            
	//  332  621:fstore          5
		}
		af1[0][i] = f;
		af1[1][i] = f2;
		af1[2][i] = f3;
		af1[3][i] = f1;
		  goto _L8
	//* 333  623:goto            521
		pdfarray.add(((PdfObject) (obj)));
	//  334  626:aload           13
	//  335  628:aload           12
	//  336  630:invokevirtual   #84  <Method boolean PdfArray.add(PdfObject)>
	//  337  633:pop             
		obj = ((Object) (String.format(Locale.US, "1.000000 %d 1 roll ", new Object[] {
			Integer.valueOf(l + 1)
		})));
	//  338  634:getstatic       #186 <Field Locale Locale.US>
	//  339  637:ldc1            #188 <String "1.000000 %d 1 roll ">
	//  340  639:iconst_1        
	//  341  640:anewarray       Object[]
	//  342  643:dup             
	//  343  644:iconst_0        
	//  344  645:iload           10
	//  345  647:iconst_1        
	//  346  648:iadd            
	//  347  649:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//  348  652:aastore         
	//  349  653:invokestatic    #200 <Method String String.format(Locale, String, Object[])>
	//  350  656:astore          12
		pdfarray.add(((PdfObject) (PdfName.DEVICECMYK)));
	//  351  658:aload           13
	//  352  660:getstatic       #203 <Field PdfName PdfName.DEVICECMYK>
	//  353  663:invokevirtual   #84  <Method boolean PdfArray.add(PdfObject)>
	//  354  666:pop             
		String s1 = (new StringBuilder()).append(((String) (obj))).append(((String) (obj))).append(((String) (obj))).append(((String) (obj))).toString();
	//  355  667:new             #131 <Class StringBuilder>
	//  356  670:dup             
	//  357  671:invokespecial   #132 <Method void StringBuilder()>
	//  358  674:aload           12
	//  359  676:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  360  679:aload           12
	//  361  681:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  362  684:aload           12
	//  363  686:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  364  689:aload           12
	//  365  691:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  366  694:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  367  697:astore          17
		obj = "";
	//  368  699:ldc1            #60  <String "">
	//  369  701:astore          12
		for(int j = l + 4; j > l; j--)
	//* 370  703:iload           10
	//* 371  705:iconst_4        
	//* 372  706:iadd            
	//* 373  707:istore          8
	//* 374  709:iload           8
	//* 375  711:iload           10
	//* 376  713:icmple          885
		{
			obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(String.format(Locale.US, "%d -1 roll ", new Object[] {
				Integer.valueOf(j)
			})).toString()));
	//  377  716:new             #131 <Class StringBuilder>
	//  378  719:dup             
	//  379  720:invokespecial   #132 <Method void StringBuilder()>
	//  380  723:aload           12
	//  381  725:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  382  728:getstatic       #186 <Field Locale Locale.US>
	//  383  731:ldc1            #205 <String "%d -1 roll ">
	//  384  733:iconst_1        
	//  385  734:anewarray       Object[]
	//  386  737:dup             
	//  387  738:iconst_0        
	//  388  739:iload           8
	//  389  741:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//  390  744:aastore         
	//  391  745:invokestatic    #200 <Method String String.format(Locale, String, Object[])>
	//  392  748:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  393  751:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  394  754:astore          12
			for(int k = l; k > 0; k--)
	//* 395  756:iload           10
	//* 396  758:istore          9
	//* 397  760:iload           9
	//* 398  762:ifle            836
				obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(String.format(Locale.US, "%d index %f mul 1.000000 cvr exch sub mul ", new Object[] {
					Integer.valueOf(k), Float.valueOf(af1[(l + 4) - j][l - k])
				})).toString()));
	//  399  765:new             #131 <Class StringBuilder>
	//  400  768:dup             
	//  401  769:invokespecial   #132 <Method void StringBuilder()>
	//  402  772:aload           12
	//  403  774:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  404  777:getstatic       #186 <Field Locale Locale.US>
	//  405  780:ldc1            #207 <String "%d index %f mul 1.000000 cvr exch sub mul ">
	//  406  782:iconst_2        
	//  407  783:anewarray       Object[]
	//  408  786:dup             
	//  409  787:iconst_0        
	//  410  788:iload           9
	//  411  790:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//  412  793:aastore         
	//  413  794:dup             
	//  414  795:iconst_1        
	//  415  796:aload           16
	//  416  798:iload           10
	//  417  800:iconst_4        
	//  418  801:iadd            
	//  419  802:iload           8
	//  420  804:isub            
	//  421  805:aaload          
	//  422  806:iload           10
	//  423  808:iload           9
	//  424  810:isub            
	//  425  811:faload          
	//  426  812:invokestatic    #210 <Method Float Float.valueOf(float)>
	//  427  815:aastore         
	//  428  816:invokestatic    #200 <Method String String.format(Locale, String, Object[])>
	//  429  819:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  430  822:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  431  825:astore          12

	//  432  827:iload           9
	//  433  829:iconst_1        
	//  434  830:isub            
	//  435  831:istore          9
	//* 436  833:goto            760
			obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(String.format(Locale.US, "1.000000 cvr exch sub %d 1 roll ", new Object[] {
				Integer.valueOf(j)
			})).toString()));
	//  437  836:new             #131 <Class StringBuilder>
	//  438  839:dup             
	//  439  840:invokespecial   #132 <Method void StringBuilder()>
	//  440  843:aload           12
	//  441  845:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  442  848:getstatic       #186 <Field Locale Locale.US>
	//  443  851:ldc1            #212 <String "1.000000 cvr exch sub %d 1 roll ">
	//  444  853:iconst_1        
	//  445  854:anewarray       Object[]
	//  446  857:dup             
	//  447  858:iconst_0        
	//  448  859:iload           8
	//  449  861:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//  450  864:aastore         
	//  451  865:invokestatic    #200 <Method String String.format(Locale, String, Object[])>
	//  452  868:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  453  871:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  454  874:astore          12
		}

	//  455  876:iload           8
	//  456  878:iconst_1        
	//  457  879:isub            
	//  458  880:istore          8
	//* 459  882:goto            709
		s = (new StringBuilder()).append("{ ").append(s1).append(((String) (obj))).append(s).append("}").toString();
	//  460  885:new             #131 <Class StringBuilder>
	//  461  888:dup             
	//  462  889:invokespecial   #132 <Method void StringBuilder()>
	//  463  892:ldc1            #214 <String "{ ">
	//  464  894:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  465  897:aload           17
	//  466  899:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  467  902:aload           12
	//  468  904:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  469  907:aload           11
	//  470  909:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  471  912:ldc1            #216 <String "}">
	//  472  914:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  473  917:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  474  920:astore          11
		pdfarray.add(((PdfObject) (PdfFunction.type4(pdfwriter, af, new float[] {
			0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F
		}, s).getReference())));
	//  475  922:aload           13
	//  476  924:aload_1         
	//  477  925:aload           15
	//  478  927:bipush          8
	//  479  929:newarray        float[]
	//  480  931:dup             
	//  481  932:iconst_0        
	//  482  933:fconst_0        
	//  483  934:fastore         
	//  484  935:dup             
	//  485  936:iconst_1        
	//  486  937:fconst_1        
	//  487  938:fastore         
	//  488  939:dup             
	//  489  940:iconst_2        
	//  490  941:fconst_0        
	//  491  942:fastore         
	//  492  943:dup             
	//  493  944:iconst_3        
	//  494  945:fconst_1        
	//  495  946:fastore         
	//  496  947:dup             
	//  497  948:iconst_4        
	//  498  949:fconst_0        
	//  499  950:fastore         
	//  500  951:dup             
	//  501  952:iconst_5        
	//  502  953:fconst_1        
	//  503  954:fastore         
	//  504  955:dup             
	//  505  956:bipush          6
	//  506  958:fconst_0        
	//  507  959:fastore         
	//  508  960:dup             
	//  509  961:bipush          7
	//  510  963:fconst_1        
	//  511  964:fastore         
	//  512  965:aload           11
	//  513  967:invokestatic    #222 <Method PdfFunction PdfFunction.type4(PdfWriter, float[], float[], String)>
	//  514  970:invokevirtual   #225 <Method PdfIndirectReference PdfFunction.getReference()>
	//  515  973:invokevirtual   #84  <Method boolean PdfArray.add(PdfObject)>
	//  516  976:pop             
		pdfwriter = ((PdfWriter) (new PdfDictionary()));
	//  517  977:new             #57  <Class PdfDictionary>
	//  518  980:dup             
	//  519  981:invokespecial   #58  <Method void PdfDictionary()>
	//  520  984:astore_1        
		((PdfDictionary) (pdfwriter)).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.NCHANNEL)));
	//  521  985:aload_1         
	//  522  986:getstatic       #228 <Field PdfName PdfName.SUBTYPE>
	//  523  989:getstatic       #231 <Field PdfName PdfName.NCHANNEL>
	//  524  992:invokevirtual   #109 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (pdfwriter)).put(PdfName.COLORANTS, ((PdfObject) (pdfdictionary)));
	//  525  995:aload_1         
	//  526  996:getstatic       #234 <Field PdfName PdfName.COLORANTS>
	//  527  999:aload           14
	//  528 1001:invokevirtual   #109 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfarray.add(((PdfObject) (pdfwriter)));
	//  529 1004:aload           13
	//  530 1006:aload_1         
	//  531 1007:invokevirtual   #84  <Method boolean PdfArray.add(PdfObject)>
	//  532 1010:pop             
		return ((PdfObject) (pdfarray));
	//  533 1011:aload           13
	//  534 1013:areturn         
		  goto _L8
	}

	public PdfSpotColor[] getSpotColors()
	{
		return spotColors;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PdfSpotColor[] spotColors>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Arrays.hashCode(((Object []) (spotColors)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PdfSpotColor[] spotColors>
	//    2    4:invokestatic    #240 <Method int Arrays.hashCode(Object[])>
	//    3    7:ireturn         
	}

	ColorDetails colorantsDetails[];
	PdfSpotColor spotColors[];
}
