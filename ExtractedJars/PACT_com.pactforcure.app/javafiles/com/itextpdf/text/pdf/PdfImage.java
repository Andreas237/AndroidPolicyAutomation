// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Image;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;
import java.net.URL;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, BadPdfFormatException, PdfName, PdfNumber, 
//			PdfOCG, PdfBoolean, PdfLiteral, PdfDictionary, 
//			PdfIndirectReference

public class PdfImage extends PdfStream
{

	public PdfImage(Image image1, String s, PdfIndirectReference pdfindirectreference)
		throws BadPdfFormatException
	{
		Object obj;
		Object obj1;
		Object obj2;
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void PdfStream()>
		name = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #24  <Field PdfName name>
		image = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #26  <Field Image image>
		image = image1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #26  <Field Image image>
		int i;
		int ai[];
		if(s == null)
	//*  11   19:aload_2         
	//*  12   20:ifnonnull       316
			generateImgResName(image1);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #30  <Method void generateImgResName(Image)>
		else
	//*  16   28:aload_0         
	//*  17   29:getstatic       #35  <Field PdfName PdfName.TYPE>
	//*  18   32:getstatic       #38  <Field PdfName PdfName.XOBJECT>
	//*  19   35:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  20   38:aload_0         
	//*  21   39:getstatic       #45  <Field PdfName PdfName.SUBTYPE>
	//*  22   42:getstatic       #48  <Field PdfName PdfName.IMAGE>
	//*  23   45:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  24   48:aload_0         
	//*  25   49:getstatic       #51  <Field PdfName PdfName.WIDTH>
	//*  26   52:new             #53  <Class PdfNumber>
	//*  27   55:dup             
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #59  <Method float Image.getWidth()>
	//*  30   60:invokespecial   #62  <Method void PdfNumber(float)>
	//*  31   63:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  32   66:aload_0         
	//*  33   67:getstatic       #65  <Field PdfName PdfName.HEIGHT>
	//*  34   70:new             #53  <Class PdfNumber>
	//*  35   73:dup             
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #68  <Method float Image.getHeight()>
	//*  38   78:invokespecial   #62  <Method void PdfNumber(float)>
	//*  39   81:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  40   84:aload_1         
	//*  41   85:invokevirtual   #72  <Method PdfOCG Image.getLayer()>
	//*  42   88:ifnull          107
	//*  43   91:aload_0         
	//*  44   92:getstatic       #75  <Field PdfName PdfName.OC>
	//*  45   95:aload_1         
	//*  46   96:invokevirtual   #72  <Method PdfOCG Image.getLayer()>
	//*  47   99:invokeinterface #81  <Method PdfIndirectReference PdfOCG.getRef()>
	//*  48  104:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  49  107:aload_1         
	//*  50  108:invokevirtual   #85  <Method boolean Image.isMask()>
	//*  51  111:ifeq            142
	//*  52  114:aload_1         
	//*  53  115:invokevirtual   #89  <Method int Image.getBpc()>
	//*  54  118:iconst_1        
	//*  55  119:icmpeq          132
	//*  56  122:aload_1         
	//*  57  123:invokevirtual   #89  <Method int Image.getBpc()>
	//*  58  126:sipush          255
	//*  59  129:icmple          142
	//*  60  132:aload_0         
	//*  61  133:getstatic       #92  <Field PdfName PdfName.IMAGEMASK>
	//*  62  136:getstatic       #98  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//*  63  139:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  64  142:aload_3         
	//*  65  143:ifnull          161
	//*  66  146:aload_1         
	//*  67  147:invokevirtual   #101 <Method boolean Image.isSmask()>
	//*  68  150:ifeq            331
	//*  69  153:aload_0         
	//*  70  154:getstatic       #104 <Field PdfName PdfName.SMASK>
	//*  71  157:aload_3         
	//*  72  158:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  73  161:aload_1         
	//*  74  162:invokevirtual   #85  <Method boolean Image.isMask()>
	//*  75  165:ifeq            191
	//*  76  168:aload_1         
	//*  77  169:invokevirtual   #107 <Method boolean Image.isInverted()>
	//*  78  172:ifeq            191
	//*  79  175:aload_0         
	//*  80  176:getstatic       #110 <Field PdfName PdfName.DECODE>
	//*  81  179:new             #112 <Class PdfLiteral>
	//*  82  182:dup             
	//*  83  183:ldc1            #114 <String "[1 0]">
	//*  84  185:invokespecial   #117 <Method void PdfLiteral(String)>
	//*  85  188:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  86  191:aload_1         
	//*  87  192:invokevirtual   #120 <Method boolean Image.isInterpolation()>
	//*  88  195:ifeq            208
	//*  89  198:aload_0         
	//*  90  199:getstatic       #123 <Field PdfName PdfName.INTERPOLATE>
	//*  91  202:getstatic       #98  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//*  92  205:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  93  208:aconst_null     
	//*  94  209:astore          8
	//*  95  211:aconst_null     
	//*  96  212:astore          7
	//*  97  214:aload           7
	//*  98  216:astore          6
	//*  99  218:aload           8
	//* 100  220:astore_2        
	//* 101  221:aload_1         
	//* 102  222:invokevirtual   #127 <Method int[] Image.getTransparency()>
	//* 103  225:astore          9
	//* 104  227:aload           9
	//* 105  229:ifnull          381
	//* 106  232:aload           7
	//* 107  234:astore          6
	//* 108  236:aload           8
	//* 109  238:astore_2        
	//* 110  239:aload_1         
	//* 111  240:invokevirtual   #85  <Method boolean Image.isMask()>
	//* 112  243:ifne            381
	//* 113  246:aload_3         
	//* 114  247:ifnonnull       381
	//* 115  250:aload           7
	//* 116  252:astore          6
	//* 117  254:aload           8
	//* 118  256:astore_2        
	//* 119  257:new             #129 <Class StringBuilder>
	//* 120  260:dup             
	//* 121  261:ldc1            #131 <String "[">
	//* 122  263:invokespecial   #132 <Method void StringBuilder(String)>
	//* 123  266:astore_3        
	//* 124  267:iconst_0        
	//* 125  268:istore          4
	//* 126  270:aload           7
	//* 127  272:astore          6
	//* 128  274:aload           8
	//* 129  276:astore_2        
	//* 130  277:iload           4
	//* 131  279:aload           9
	//* 132  281:arraylength     
	//* 133  282:icmpge          342
	//* 134  285:aload           7
	//* 135  287:astore          6
	//* 136  289:aload           8
	//* 137  291:astore_2        
	//* 138  292:aload_3         
	//* 139  293:aload           9
	//* 140  295:iload           4
	//* 141  297:iaload          
	//* 142  298:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//* 143  301:ldc1            #138 <String " ">
	//* 144  303:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//* 145  306:pop             
	//* 146  307:iload           4
	//* 147  309:iconst_1        
	//* 148  310:iadd            
	//* 149  311:istore          4
	//* 150  313:goto            270
			name = new PdfName(s);
	//  151  316:aload_0         
	//  152  317:new             #32  <Class PdfName>
	//  153  320:dup             
	//  154  321:aload_2         
	//  155  322:invokespecial   #142 <Method void PdfName(String)>
	//  156  325:putfield        #24  <Field PdfName name>
		put(PdfName.TYPE, ((PdfObject) (PdfName.XOBJECT)));
		put(PdfName.SUBTYPE, ((PdfObject) (PdfName.IMAGE)));
		put(PdfName.WIDTH, ((PdfObject) (new PdfNumber(image1.getWidth()))));
		put(PdfName.HEIGHT, ((PdfObject) (new PdfNumber(image1.getHeight()))));
		if(image1.getLayer() != null)
			put(PdfName.OC, ((PdfObject) (image1.getLayer().getRef())));
		if(image1.isMask() && (image1.getBpc() == 1 || image1.getBpc() > 255))
			put(PdfName.IMAGEMASK, ((PdfObject) (PdfBoolean.PDFTRUE)));
		if(pdfindirectreference != null)
			if(image1.isSmask())
				put(PdfName.SMASK, ((PdfObject) (pdfindirectreference)));
			else
	//* 157  328:goto            28
				put(PdfName.MASK, ((PdfObject) (pdfindirectreference)));
	//  158  331:aload_0         
	//  159  332:getstatic       #145 <Field PdfName PdfName.MASK>
	//  160  335:aload_3         
	//  161  336:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		if(image1.isMask() && image1.isInverted())
			put(PdfName.DECODE, ((PdfObject) (new PdfLiteral("[1 0]"))));
		if(image1.isInterpolation())
			put(PdfName.INTERPOLATE, ((PdfObject) (PdfBoolean.PDFTRUE)));
		obj2 = null;
		obj1 = null;
		obj = obj1;
		s = ((String) (obj2));
		ai = image1.getTransparency();
		if(ai == null)
			break MISSING_BLOCK_LABEL_381;
		obj = obj1;
		s = ((String) (obj2));
		if(image1.isMask() || pdfindirectreference != null)
			break MISSING_BLOCK_LABEL_381;
		obj = obj1;
		s = ((String) (obj2));
		pdfindirectreference = ((PdfIndirectReference) (new StringBuilder("[")));
		i = 0;
_L2:
		obj = obj1;
		s = ((String) (obj2));
		if(i >= ai.length)
			break; /* Loop/switch isn't completed */
		obj = obj1;
		s = ((String) (obj2));
		((StringBuilder) (pdfindirectreference)).append(ai[i]).append(" ");
		i++;
		if(true) goto _L2; else goto _L1
	//* 162  339:goto            161
_L1:
		obj = obj1;
	//  163  342:aload           7
	//  164  344:astore          6
		s = ((String) (obj2));
	//  165  346:aload           8
	//  166  348:astore_2        
		((StringBuilder) (pdfindirectreference)).append("]");
	//  167  349:aload_3         
	//  168  350:ldc1            #147 <String "]">
	//  169  352:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  170  355:pop             
		obj = obj1;
	//  171  356:aload           7
	//  172  358:astore          6
		s = ((String) (obj2));
	//  173  360:aload           8
	//  174  362:astore_2        
		put(PdfName.MASK, ((PdfObject) (new PdfLiteral(((StringBuilder) (pdfindirectreference)).toString()))));
	//  175  363:aload_0         
	//  176  364:getstatic       #145 <Field PdfName PdfName.MASK>
	//  177  367:new             #112 <Class PdfLiteral>
	//  178  370:dup             
	//  179  371:aload_3         
	//  180  372:invokevirtual   #151 <Method String StringBuilder.toString()>
	//  181  375:invokespecial   #117 <Method void PdfLiteral(String)>
	//  182  378:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		obj = obj1;
	//  183  381:aload           7
	//  184  383:astore          6
		s = ((String) (obj2));
	//  185  385:aload           8
	//  186  387:astore_2        
		if(!image1.isImgRaw()) goto _L4; else goto _L3
	//  187  388:aload_1         
	//  188  389:invokevirtual   #154 <Method boolean Image.isImgRaw()>
	//  189  392:ifeq            1156
_L3:
		obj = obj1;
	//  190  395:aload           7
	//  191  397:astore          6
		s = ((String) (obj2));
	//  192  399:aload           8
	//  193  401:astore_2        
		int j = image1.getColorspace();
	//  194  402:aload_1         
	//  195  403:invokevirtual   #157 <Method int Image.getColorspace()>
	//  196  406:istore          4
		obj = obj1;
	//  197  408:aload           7
	//  198  410:astore          6
		s = ((String) (obj2));
	//  199  412:aload           8
	//  200  414:astore_2        
		bytes = image1.getRawData();
	//  201  415:aload_0         
	//  202  416:aload_1         
	//  203  417:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//  204  420:putfield        #165 <Field byte[] bytes>
		obj = obj1;
	//  205  423:aload           7
	//  206  425:astore          6
		s = ((String) (obj2));
	//  207  427:aload           8
	//  208  429:astore_2        
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
	//  209  430:aload_0         
	//  210  431:getstatic       #168 <Field PdfName PdfName.LENGTH>
	//  211  434:new             #53  <Class PdfNumber>
	//  212  437:dup             
	//  213  438:aload_0         
	//  214  439:getfield        #165 <Field byte[] bytes>
	//  215  442:arraylength     
	//  216  443:invokespecial   #171 <Method void PdfNumber(int)>
	//  217  446:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		obj = obj1;
	//  218  449:aload           7
	//  219  451:astore          6
		s = ((String) (obj2));
	//  220  453:aload           8
	//  221  455:astore_2        
		int k = image1.getBpc();
	//  222  456:aload_1         
	//  223  457:invokevirtual   #89  <Method int Image.getBpc()>
	//  224  460:istore          5
		if(k <= 255) goto _L6; else goto _L5
	//  225  462:iload           5
	//  226  464:sipush          255
	//  227  467:icmple          766
_L5:
		obj = obj1;
	//  228  470:aload           7
	//  229  472:astore          6
		s = ((String) (obj2));
	//  230  474:aload           8
	//  231  476:astore_2        
		if(image1.isMask())
			break MISSING_BLOCK_LABEL_501;
	//  232  477:aload_1         
	//  233  478:invokevirtual   #85  <Method boolean Image.isMask()>
	//  234  481:ifne            501
		obj = obj1;
	//  235  484:aload           7
	//  236  486:astore          6
		s = ((String) (obj2));
	//  237  488:aload           8
	//  238  490:astore_2        
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICEGRAY)));
	//  239  491:aload_0         
	//  240  492:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//  241  495:getstatic       #177 <Field PdfName PdfName.DEVICEGRAY>
	//  242  498:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		obj = obj1;
	//  243  501:aload           7
	//  244  503:astore          6
		s = ((String) (obj2));
	//  245  505:aload           8
	//  246  507:astore_2        
		put(PdfName.BITSPERCOMPONENT, ((PdfObject) (new PdfNumber(1))));
	//  247  508:aload_0         
	//  248  509:getstatic       #180 <Field PdfName PdfName.BITSPERCOMPONENT>
	//  249  512:new             #53  <Class PdfNumber>
	//  250  515:dup             
	//  251  516:iconst_1        
	//  252  517:invokespecial   #171 <Method void PdfNumber(int)>
	//  253  520:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		obj = obj1;
	//  254  523:aload           7
	//  255  525:astore          6
		s = ((String) (obj2));
	//  256  527:aload           8
	//  257  529:astore_2        
		put(PdfName.FILTER, ((PdfObject) (PdfName.CCITTFAXDECODE)));
	//  258  530:aload_0         
	//  259  531:getstatic       #183 <Field PdfName PdfName.FILTER>
	//  260  534:getstatic       #186 <Field PdfName PdfName.CCITTFAXDECODE>
	//  261  537:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		k -= 257;
	//  262  540:iload           5
	//  263  542:sipush          257
	//  264  545:isub            
	//  265  546:istore          5
		obj = obj1;
	//  266  548:aload           7
	//  267  550:astore          6
		s = ((String) (obj2));
	//  268  552:aload           8
	//  269  554:astore_2        
		pdfindirectreference = ((PdfIndirectReference) (new PdfDictionary()));
	//  270  555:new             #188 <Class PdfDictionary>
	//  271  558:dup             
	//  272  559:invokespecial   #189 <Method void PdfDictionary()>
	//  273  562:astore_3        
		if(k == 0)
			break MISSING_BLOCK_LABEL_591;
	//  274  563:iload           5
	//  275  565:ifeq            591
		obj = obj1;
	//  276  568:aload           7
	//  277  570:astore          6
		s = ((String) (obj2));
	//  278  572:aload           8
	//  279  574:astore_2        
		((PdfDictionary) (pdfindirectreference)).put(PdfName.K, ((PdfObject) (new PdfNumber(k))));
	//  280  575:aload_3         
	//  281  576:getstatic       #192 <Field PdfName PdfName.K>
	//  282  579:new             #53  <Class PdfNumber>
	//  283  582:dup             
	//  284  583:iload           5
	//  285  585:invokespecial   #171 <Method void PdfNumber(int)>
	//  286  588:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if((j & 1) == 0)
			break MISSING_BLOCK_LABEL_615;
	//  287  591:iload           4
	//  288  593:iconst_1        
	//  289  594:iand            
	//  290  595:ifeq            615
		obj = obj1;
	//  291  598:aload           7
	//  292  600:astore          6
		s = ((String) (obj2));
	//  293  602:aload           8
	//  294  604:astore_2        
		((PdfDictionary) (pdfindirectreference)).put(PdfName.BLACKIS1, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//  295  605:aload_3         
	//  296  606:getstatic       #196 <Field PdfName PdfName.BLACKIS1>
	//  297  609:getstatic       #98  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//  298  612:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if((j & 2) == 0)
			break MISSING_BLOCK_LABEL_639;
	//  299  615:iload           4
	//  300  617:iconst_2        
	//  301  618:iand            
	//  302  619:ifeq            639
		obj = obj1;
	//  303  622:aload           7
	//  304  624:astore          6
		s = ((String) (obj2));
	//  305  626:aload           8
	//  306  628:astore_2        
		((PdfDictionary) (pdfindirectreference)).put(PdfName.ENCODEDBYTEALIGN, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//  307  629:aload_3         
	//  308  630:getstatic       #199 <Field PdfName PdfName.ENCODEDBYTEALIGN>
	//  309  633:getstatic       #98  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//  310  636:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if((j & 4) == 0)
			break MISSING_BLOCK_LABEL_663;
	//  311  639:iload           4
	//  312  641:iconst_4        
	//  313  642:iand            
	//  314  643:ifeq            663
		obj = obj1;
	//  315  646:aload           7
	//  316  648:astore          6
		s = ((String) (obj2));
	//  317  650:aload           8
	//  318  652:astore_2        
		((PdfDictionary) (pdfindirectreference)).put(PdfName.ENDOFLINE, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//  319  653:aload_3         
	//  320  654:getstatic       #202 <Field PdfName PdfName.ENDOFLINE>
	//  321  657:getstatic       #98  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//  322  660:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if((j & 8) == 0)
			break MISSING_BLOCK_LABEL_688;
	//  323  663:iload           4
	//  324  665:bipush          8
	//  325  667:iand            
	//  326  668:ifeq            688
		obj = obj1;
	//  327  671:aload           7
	//  328  673:astore          6
		s = ((String) (obj2));
	//  329  675:aload           8
	//  330  677:astore_2        
		((PdfDictionary) (pdfindirectreference)).put(PdfName.ENDOFBLOCK, ((PdfObject) (PdfBoolean.PDFFALSE)));
	//  331  678:aload_3         
	//  332  679:getstatic       #205 <Field PdfName PdfName.ENDOFBLOCK>
	//  333  682:getstatic       #208 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//  334  685:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
		obj = obj1;
	//  335  688:aload           7
	//  336  690:astore          6
		s = ((String) (obj2));
	//  337  692:aload           8
	//  338  694:astore_2        
		((PdfDictionary) (pdfindirectreference)).put(PdfName.COLUMNS, ((PdfObject) (new PdfNumber(image1.getWidth()))));
	//  339  695:aload_3         
	//  340  696:getstatic       #211 <Field PdfName PdfName.COLUMNS>
	//  341  699:new             #53  <Class PdfNumber>
	//  342  702:dup             
	//  343  703:aload_1         
	//  344  704:invokevirtual   #59  <Method float Image.getWidth()>
	//  345  707:invokespecial   #62  <Method void PdfNumber(float)>
	//  346  710:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
		obj = obj1;
	//  347  713:aload           7
	//  348  715:astore          6
		s = ((String) (obj2));
	//  349  717:aload           8
	//  350  719:astore_2        
		((PdfDictionary) (pdfindirectreference)).put(PdfName.ROWS, ((PdfObject) (new PdfNumber(image1.getHeight()))));
	//  351  720:aload_3         
	//  352  721:getstatic       #214 <Field PdfName PdfName.ROWS>
	//  353  724:new             #53  <Class PdfNumber>
	//  354  727:dup             
	//  355  728:aload_1         
	//  356  729:invokevirtual   #68  <Method float Image.getHeight()>
	//  357  732:invokespecial   #62  <Method void PdfNumber(float)>
	//  358  735:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
		obj = obj1;
	//  359  738:aload           7
	//  360  740:astore          6
		s = ((String) (obj2));
	//  361  742:aload           8
	//  362  744:astore_2        
		put(PdfName.DECODEPARMS, ((PdfObject) (pdfindirectreference)));
	//  363  745:aload_0         
	//  364  746:getstatic       #217 <Field PdfName PdfName.DECODEPARMS>
	//  365  749:aload_3         
	//  366  750:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
_L50:
		if(true)
			break MISSING_BLOCK_LABEL_765;
	//  367  753:iconst_0        
	//  368  754:ifeq            765
		throw new NullPointerException();
	//  369  757:new             #219 <Class NullPointerException>
	//  370  760:dup             
	//  371  761:invokespecial   #220 <Method void NullPointerException()>
	//  372  764:athrow          
_L34:
		return;
	//  373  765:return          
_L6:
		j;
	//  374  766:iload           4
		JVM INSTR tableswitch 1 3: default 796
	//	               1 1023
	//	               2 796
	//	               3 1080;
	//  375  768:tableswitch     1 3: default 796
	//	               1 1023
	//	               2 796
	//	               3 1080
		   goto _L7 _L8 _L7 _L9
_L7:
		obj = obj1;
	//  376  796:aload           7
	//  377  798:astore          6
		s = ((String) (obj2));
	//  378  800:aload           8
	//  379  802:astore_2        
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICECMYK)));
	//  380  803:aload_0         
	//  381  804:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//  382  807:getstatic       #223 <Field PdfName PdfName.DEVICECMYK>
	//  383  810:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		obj = obj1;
	//  384  813:aload           7
	//  385  815:astore          6
		s = ((String) (obj2));
	//  386  817:aload           8
	//  387  819:astore_2        
		if(!image1.isInverted())
			break MISSING_BLOCK_LABEL_850;
	//  388  820:aload_1         
	//  389  821:invokevirtual   #107 <Method boolean Image.isInverted()>
	//  390  824:ifeq            850
		obj = obj1;
	//  391  827:aload           7
	//  392  829:astore          6
		s = ((String) (obj2));
	//  393  831:aload           8
	//  394  833:astore_2        
		put(PdfName.DECODE, ((PdfObject) (new PdfLiteral("[1 0 1 0 1 0 1 0]"))));
	//  395  834:aload_0         
	//  396  835:getstatic       #110 <Field PdfName PdfName.DECODE>
	//  397  838:new             #112 <Class PdfLiteral>
	//  398  841:dup             
	//  399  842:ldc1            #225 <String "[1 0 1 0 1 0 1 0]">
	//  400  844:invokespecial   #117 <Method void PdfLiteral(String)>
	//  401  847:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
_L17:
		obj = obj1;
	//  402  850:aload           7
	//  403  852:astore          6
		s = ((String) (obj2));
	//  404  854:aload           8
	//  405  856:astore_2        
		pdfindirectreference = ((PdfIndirectReference) (image1.getAdditional()));
	//  406  857:aload_1         
	//  407  858:invokevirtual   #229 <Method PdfDictionary Image.getAdditional()>
	//  408  861:astore_3        
		if(pdfindirectreference == null) goto _L11; else goto _L10
	//  409  862:aload_3         
	//  410  863:ifnull          878
_L10:
		obj = obj1;
	//  411  866:aload           7
	//  412  868:astore          6
		s = ((String) (obj2));
	//  413  870:aload           8
	//  414  872:astore_2        
		putAll(((PdfDictionary) (pdfindirectreference)));
	//  415  873:aload_0         
	//  416  874:aload_3         
	//  417  875:invokevirtual   #233 <Method void putAll(PdfDictionary)>
_L11:
		obj = obj1;
	//  418  878:aload           7
	//  419  880:astore          6
		s = ((String) (obj2));
	//  420  882:aload           8
	//  421  884:astore_2        
		if(!image1.isMask())
			break MISSING_BLOCK_LABEL_937;
	//  422  885:aload_1         
	//  423  886:invokevirtual   #85  <Method boolean Image.isMask()>
	//  424  889:ifeq            937
		obj = obj1;
	//  425  892:aload           7
	//  426  894:astore          6
		s = ((String) (obj2));
	//  427  896:aload           8
	//  428  898:astore_2        
		if(image1.getBpc() == 1) goto _L13; else goto _L12
	//  429  899:aload_1         
	//  430  900:invokevirtual   #89  <Method int Image.getBpc()>
	//  431  903:iconst_1        
	//  432  904:icmpeq          923
_L12:
		obj = obj1;
	//  433  907:aload           7
	//  434  909:astore          6
		s = ((String) (obj2));
	//  435  911:aload           8
	//  436  913:astore_2        
		if(image1.getBpc() <= 8)
			break MISSING_BLOCK_LABEL_937;
	//  437  914:aload_1         
	//  438  915:invokevirtual   #89  <Method int Image.getBpc()>
	//  439  918:bipush          8
	//  440  920:icmple          937
_L13:
		obj = obj1;
	//  441  923:aload           7
	//  442  925:astore          6
		s = ((String) (obj2));
	//  443  927:aload           8
	//  444  929:astore_2        
		remove(PdfName.COLORSPACE);
	//  445  930:aload_0         
	//  446  931:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//  447  934:invokevirtual   #237 <Method void remove(PdfName)>
		obj = obj1;
	//  448  937:aload           7
	//  449  939:astore          6
		s = ((String) (obj2));
	//  450  941:aload           8
	//  451  943:astore_2        
		put(PdfName.BITSPERCOMPONENT, ((PdfObject) (new PdfNumber(image1.getBpc()))));
	//  452  944:aload_0         
	//  453  945:getstatic       #180 <Field PdfName PdfName.BITSPERCOMPONENT>
	//  454  948:new             #53  <Class PdfNumber>
	//  455  951:dup             
	//  456  952:aload_1         
	//  457  953:invokevirtual   #89  <Method int Image.getBpc()>
	//  458  956:invokespecial   #171 <Method void PdfNumber(int)>
	//  459  959:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		obj = obj1;
	//  460  962:aload           7
	//  461  964:astore          6
		s = ((String) (obj2));
	//  462  966:aload           8
	//  463  968:astore_2        
		if(!image1.isDeflated()) goto _L15; else goto _L14
	//  464  969:aload_1         
	//  465  970:invokevirtual   #240 <Method boolean Image.isDeflated()>
	//  466  973:ifeq            1138
_L14:
		obj = obj1;
	//  467  976:aload           7
	//  468  978:astore          6
		s = ((String) (obj2));
	//  469  980:aload           8
	//  470  982:astore_2        
		put(PdfName.FILTER, ((PdfObject) (PdfName.FLATEDECODE)));
	//  471  983:aload_0         
	//  472  984:getstatic       #183 <Field PdfName PdfName.FILTER>
	//  473  987:getstatic       #243 <Field PdfName PdfName.FLATEDECODE>
	//  474  990:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		continue; /* Loop/switch isn't completed */
	//  475  993:goto            753
	//* 476  996:astore_1        
	//* 477  997:aload           6
	//* 478  999:astore_2        
_L25:
		throw new BadPdfFormatException(((IOException) (image1)).getMessage());
	//  479 1000:new             #15  <Class BadPdfFormatException>
	//  480 1003:dup             
	//  481 1004:aload_1         
	//  482 1005:invokevirtual   #246 <Method String IOException.getMessage()>
	//  483 1008:invokespecial   #247 <Method void BadPdfFormatException(String)>
	//  484 1011:athrow          
		image1;
	//  485 1012:astore_1        
		if(s != null)
	//* 486 1013:aload_2         
	//* 487 1014:ifnull          1021
			try
			{
				((InputStream) (s)).close();
	//  488 1017:aload_2         
	//  489 1018:invokevirtual   #252 <Method void InputStream.close()>
			}
	//* 490 1021:aload_1         
	//* 491 1022:athrow          
	//* 492 1023:aload           7
	//* 493 1025:astore          6
	//* 494 1027:aload           8
	//* 495 1029:astore_2        
	//* 496 1030:aload_0         
	//* 497 1031:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 498 1034:getstatic       #177 <Field PdfName PdfName.DEVICEGRAY>
	//* 499 1037:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 500 1040:aload           7
	//* 501 1042:astore          6
	//* 502 1044:aload           8
	//* 503 1046:astore_2        
	//* 504 1047:aload_1         
	//* 505 1048:invokevirtual   #107 <Method boolean Image.isInverted()>
	//* 506 1051:ifeq            850
	//* 507 1054:aload           7
	//* 508 1056:astore          6
	//* 509 1058:aload           8
	//* 510 1060:astore_2        
	//* 511 1061:aload_0         
	//* 512 1062:getstatic       #110 <Field PdfName PdfName.DECODE>
	//* 513 1065:new             #112 <Class PdfLiteral>
	//* 514 1068:dup             
	//* 515 1069:ldc1            #114 <String "[1 0]">
	//* 516 1071:invokespecial   #117 <Method void PdfLiteral(String)>
	//* 517 1074:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 518 1077:goto            850
	//* 519 1080:aload           7
	//* 520 1082:astore          6
	//* 521 1084:aload           8
	//* 522 1086:astore_2        
	//* 523 1087:aload_0         
	//* 524 1088:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 525 1091:getstatic       #255 <Field PdfName PdfName.DEVICERGB>
	//* 526 1094:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 527 1097:aload           7
	//* 528 1099:astore          6
	//* 529 1101:aload           8
	//* 530 1103:astore_2        
	//* 531 1104:aload_1         
	//* 532 1105:invokevirtual   #107 <Method boolean Image.isInverted()>
	//* 533 1108:ifeq            850
	//* 534 1111:aload           7
	//* 535 1113:astore          6
	//* 536 1115:aload           8
	//* 537 1117:astore_2        
	//* 538 1118:aload_0         
	//* 539 1119:getstatic       #110 <Field PdfName PdfName.DECODE>
	//* 540 1122:new             #112 <Class PdfLiteral>
	//* 541 1125:dup             
	//* 542 1126:ldc2            #257 <String "[1 0 1 0 1 0]">
	//* 543 1129:invokespecial   #117 <Method void PdfLiteral(String)>
	//* 544 1132:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 545 1135:goto            850
	//* 546 1138:aload           7
	//* 547 1140:astore          6
	//* 548 1142:aload           8
	//* 549 1144:astore_2        
	//* 550 1145:aload_0         
	//* 551 1146:aload_1         
	//* 552 1147:invokevirtual   #260 <Method int Image.getCompressionLevel()>
	//* 553 1150:invokevirtual   #263 <Method void flateCompress(int)>
	//* 554 1153:goto            753
	//* 555 1156:aload           7
	//* 556 1158:astore          6
	//* 557 1160:aload           8
	//* 558 1162:astore_2        
	//* 559 1163:aload_1         
	//* 560 1164:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 561 1167:ifnonnull       1272
	//* 562 1170:aload           7
	//* 563 1172:astore          6
	//* 564 1174:aload           8
	//* 565 1176:astore_2        
	//* 566 1177:aload_1         
	//* 567 1178:invokevirtual   #267 <Method URL Image.getUrl()>
	//* 568 1181:invokevirtual   #273 <Method InputStream URL.openStream()>
	//* 569 1184:astore_3        
	//* 570 1185:aload_3         
	//* 571 1186:astore          6
	//* 572 1188:aload_3         
	//* 573 1189:astore_2        
	//* 574 1190:aload_1         
	//* 575 1191:invokevirtual   #267 <Method URL Image.getUrl()>
	//* 576 1194:invokevirtual   #274 <Method String URL.toString()>
	//* 577 1197:astore          7
	//* 578 1199:aload_3         
	//* 579 1200:astore          6
	//* 580 1202:aload_3         
	//* 581 1203:astore_2        
	//* 582 1204:aload_1         
	//* 583 1205:invokevirtual   #277 <Method int Image.type()>
	//* 584 1208:tableswitch     32 36: default 2048
	//	               32 1299
	//	               33 1669
	//	               34 1244
	//	               35 1244
	//	               36 1899
	//* 585 1244:aload_3         
	//* 586 1245:astore          6
	//* 587 1247:aload_3         
	//* 588 1248:astore_2        
	//* 589 1249:new             #15  <Class BadPdfFormatException>
	//* 590 1252:dup             
	//* 591 1253:ldc2            #279 <String "1.is.an.unknown.image.format">
	//* 592 1256:iconst_1        
	//* 593 1257:anewarray       Object[]
	//* 594 1260:dup             
	//* 595 1261:iconst_0        
	//* 596 1262:aload           7
	//* 597 1264:aastore         
	//* 598 1265:invokestatic    #287 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 599 1268:invokespecial   #247 <Method void BadPdfFormatException(String)>
	//* 600 1271:athrow          
	//* 601 1272:aload           7
	//* 602 1274:astore          6
	//* 603 1276:aload           8
	//* 604 1278:astore_2        
	//* 605 1279:new             #289 <Class ByteArrayInputStream>
	//* 606 1282:dup             
	//* 607 1283:aload_1         
	//* 608 1284:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 609 1287:invokespecial   #292 <Method void ByteArrayInputStream(byte[])>
	//* 610 1290:astore_3        
	//* 611 1291:ldc2            #294 <String "Byte array">
	//* 612 1294:astore          7
	//* 613 1296:goto            1199
	//* 614 1299:aload_3         
	//* 615 1300:astore          6
	//* 616 1302:aload_3         
	//* 617 1303:astore_2        
	//* 618 1304:aload_0         
	//* 619 1305:getstatic       #183 <Field PdfName PdfName.FILTER>
	//* 620 1308:getstatic       #297 <Field PdfName PdfName.DCTDECODE>
	//* 621 1311:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 622 1314:aload_3         
	//* 623 1315:astore          6
	//* 624 1317:aload_3         
	//* 625 1318:astore_2        
	//* 626 1319:aload_1         
	//* 627 1320:invokevirtual   #300 <Method int Image.getColorTransform()>
	//* 628 1323:ifne            1375
	//* 629 1326:aload_3         
	//* 630 1327:astore          6
	//* 631 1329:aload_3         
	//* 632 1330:astore_2        
	//* 633 1331:new             #188 <Class PdfDictionary>
	//* 634 1334:dup             
	//* 635 1335:invokespecial   #189 <Method void PdfDictionary()>
	//* 636 1338:astore          7
	//* 637 1340:aload_3         
	//* 638 1341:astore          6
	//* 639 1343:aload_3         
	//* 640 1344:astore_2        
	//* 641 1345:aload           7
	//* 642 1347:getstatic       #303 <Field PdfName PdfName.COLORTRANSFORM>
	//* 643 1350:new             #53  <Class PdfNumber>
	//* 644 1353:dup             
	//* 645 1354:iconst_0        
	//* 646 1355:invokespecial   #171 <Method void PdfNumber(int)>
	//* 647 1358:invokevirtual   #193 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 648 1361:aload_3         
	//* 649 1362:astore          6
	//* 650 1364:aload_3         
	//* 651 1365:astore_2        
	//* 652 1366:aload_0         
	//* 653 1367:getstatic       #217 <Field PdfName PdfName.DECODEPARMS>
	//* 654 1370:aload           7
	//* 655 1372:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 656 1375:aload_3         
	//* 657 1376:astore          6
	//* 658 1378:aload_3         
	//* 659 1379:astore_2        
	//* 660 1380:aload_1         
	//* 661 1381:invokevirtual   #157 <Method int Image.getColorspace()>
	//* 662 1384:tableswitch     1 3: default 2051
	//	               1 1541
	//	               2 1412
	//	               3 1559
	//* 663 1412:aload_3         
	//* 664 1413:astore          6
	//* 665 1415:aload_3         
	//* 666 1416:astore_2        
	//* 667 1417:aload_0         
	//* 668 1418:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 669 1421:getstatic       #223 <Field PdfName PdfName.DEVICECMYK>
	//* 670 1424:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 671 1427:aload_3         
	//* 672 1428:astore          6
	//* 673 1430:aload_3         
	//* 674 1431:astore_2        
	//* 675 1432:aload_1         
	//* 676 1433:invokevirtual   #107 <Method boolean Image.isInverted()>
	//* 677 1436:ifeq            1460
	//* 678 1439:aload_3         
	//* 679 1440:astore          6
	//* 680 1442:aload_3         
	//* 681 1443:astore_2        
	//* 682 1444:aload_0         
	//* 683 1445:getstatic       #110 <Field PdfName PdfName.DECODE>
	//* 684 1448:new             #112 <Class PdfLiteral>
	//* 685 1451:dup             
	//* 686 1452:ldc1            #225 <String "[1 0 1 0 1 0 1 0]">
	//* 687 1454:invokespecial   #117 <Method void PdfLiteral(String)>
	//* 688 1457:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 689 1460:aload_3         
	//* 690 1461:astore          6
	//* 691 1463:aload_3         
	//* 692 1464:astore_2        
	//* 693 1465:aload_0         
	//* 694 1466:getstatic       #180 <Field PdfName PdfName.BITSPERCOMPONENT>
	//* 695 1469:new             #53  <Class PdfNumber>
	//* 696 1472:dup             
	//* 697 1473:bipush          8
	//* 698 1475:invokespecial   #171 <Method void PdfNumber(int)>
	//* 699 1478:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 700 1481:aload_3         
	//* 701 1482:astore          6
	//* 702 1484:aload_3         
	//* 703 1485:astore_2        
	//* 704 1486:aload_1         
	//* 705 1487:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 706 1490:ifnull          1577
	//* 707 1493:aload_3         
	//* 708 1494:astore          6
	//* 709 1496:aload_3         
	//* 710 1497:astore_2        
	//* 711 1498:aload_0         
	//* 712 1499:aload_1         
	//* 713 1500:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 714 1503:putfield        #165 <Field byte[] bytes>
	//* 715 1506:aload_3         
	//* 716 1507:astore          6
	//* 717 1509:aload_3         
	//* 718 1510:astore_2        
	//* 719 1511:aload_0         
	//* 720 1512:getstatic       #168 <Field PdfName PdfName.LENGTH>
	//* 721 1515:new             #53  <Class PdfNumber>
	//* 722 1518:dup             
	//* 723 1519:aload_0         
	//* 724 1520:getfield        #165 <Field byte[] bytes>
	//* 725 1523:arraylength     
	//* 726 1524:invokespecial   #171 <Method void PdfNumber(int)>
	//* 727 1527:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 728 1530:aload_3         
	//* 729 1531:ifnull          765
	//* 730 1534:aload_3         
	//* 731 1535:invokevirtual   #252 <Method void InputStream.close()>
	//* 732 1538:return          
	//* 733 1539:astore_1        
	//* 734 1540:return          
	//* 735 1541:aload_3         
	//* 736 1542:astore          6
	//* 737 1544:aload_3         
	//* 738 1545:astore_2        
	//* 739 1546:aload_0         
	//* 740 1547:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 741 1550:getstatic       #177 <Field PdfName PdfName.DEVICEGRAY>
	//* 742 1553:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 743 1556:goto            1460
	//* 744 1559:aload_3         
	//* 745 1560:astore          6
	//* 746 1562:aload_3         
	//* 747 1563:astore_2        
	//* 748 1564:aload_0         
	//* 749 1565:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 750 1568:getstatic       #255 <Field PdfName PdfName.DEVICERGB>
	//* 751 1571:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 752 1574:goto            1460
	//* 753 1577:aload_3         
	//* 754 1578:astore          6
	//* 755 1580:aload_3         
	//* 756 1581:astore_2        
	//* 757 1582:aload_0         
	//* 758 1583:new             #305 <Class ByteArrayOutputStream>
	//* 759 1586:dup             
	//* 760 1587:invokespecial   #306 <Method void ByteArrayOutputStream()>
	//* 761 1590:putfield        #310 <Field ByteArrayOutputStream streamBytes>
	//* 762 1593:aload_3         
	//* 763 1594:astore          6
	//* 764 1596:aload_3         
	//* 765 1597:astore_2        
	//* 766 1598:aload_3         
	//* 767 1599:aload_0         
	//* 768 1600:getfield        #310 <Field ByteArrayOutputStream streamBytes>
	//* 769 1603:iconst_m1       
	//* 770 1604:invokestatic    #314 <Method void transferBytes(InputStream, OutputStream, int)>
	//* 771 1607:aload_3         
	//* 772 1608:astore          6
	//* 773 1610:aload_3         
	//* 774 1611:astore_2        
	//* 775 1612:aload_1         
	//* 776 1613:invokevirtual   #260 <Method int Image.getCompressionLevel()>
	//* 777 1616:ifle            1632
	//* 778 1619:aload_3         
	//* 779 1620:astore          6
	//* 780 1622:aload_3         
	//* 781 1623:astore_2        
	//* 782 1624:aload_0         
	//* 783 1625:aload_1         
	//* 784 1626:invokevirtual   #260 <Method int Image.getCompressionLevel()>
	//* 785 1629:invokevirtual   #263 <Method void flateCompress(int)>
	//* 786 1632:aload_3         
	//* 787 1633:astore          6
	//* 788 1635:aload_3         
	//* 789 1636:astore_2        
	//* 790 1637:aload_0         
	//* 791 1638:getstatic       #168 <Field PdfName PdfName.LENGTH>
	//* 792 1641:new             #53  <Class PdfNumber>
	//* 793 1644:dup             
	//* 794 1645:aload_0         
	//* 795 1646:getfield        #310 <Field ByteArrayOutputStream streamBytes>
	//* 796 1649:invokevirtual   #317 <Method int ByteArrayOutputStream.size()>
	//* 797 1652:invokespecial   #171 <Method void PdfNumber(int)>
	//* 798 1655:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 799 1658:aload_3         
	//* 800 1659:ifnull          765
	//* 801 1662:aload_3         
	//* 802 1663:invokevirtual   #252 <Method void InputStream.close()>
	//* 803 1666:return          
	//* 804 1667:astore_1        
	//* 805 1668:return          
	//* 806 1669:aload_3         
	//* 807 1670:astore          6
	//* 808 1672:aload_3         
	//* 809 1673:astore_2        
	//* 810 1674:aload_0         
	//* 811 1675:getstatic       #183 <Field PdfName PdfName.FILTER>
	//* 812 1678:getstatic       #320 <Field PdfName PdfName.JPXDECODE>
	//* 813 1681:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 814 1684:aload_3         
	//* 815 1685:astore          6
	//* 816 1687:aload_3         
	//* 817 1688:astore_2        
	//* 818 1689:aload_1         
	//* 819 1690:invokevirtual   #157 <Method int Image.getColorspace()>
	//* 820 1693:ifle            1770
	//* 821 1696:aload_3         
	//* 822 1697:astore          6
	//* 823 1699:aload_3         
	//* 824 1700:astore_2        
	//* 825 1701:aload_1         
	//* 826 1702:invokevirtual   #157 <Method int Image.getColorspace()>
	//* 827 1705:tableswitch     1 3: default 2054
	//	               1 1830
	//	               2 1732
	//	               3 1848
	//* 828 1732:aload_3         
	//* 829 1733:astore          6
	//* 830 1735:aload_3         
	//* 831 1736:astore_2        
	//* 832 1737:aload_0         
	//* 833 1738:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 834 1741:getstatic       #223 <Field PdfName PdfName.DEVICECMYK>
	//* 835 1744:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 836 1747:aload_3         
	//* 837 1748:astore          6
	//* 838 1750:aload_3         
	//* 839 1751:astore_2        
	//* 840 1752:aload_0         
	//* 841 1753:getstatic       #180 <Field PdfName PdfName.BITSPERCOMPONENT>
	//* 842 1756:new             #53  <Class PdfNumber>
	//* 843 1759:dup             
	//* 844 1760:aload_1         
	//* 845 1761:invokevirtual   #89  <Method int Image.getBpc()>
	//* 846 1764:invokespecial   #171 <Method void PdfNumber(int)>
	//* 847 1767:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 848 1770:aload_3         
	//* 849 1771:astore          6
	//* 850 1773:aload_3         
	//* 851 1774:astore_2        
	//* 852 1775:aload_1         
	//* 853 1776:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 854 1779:ifnull          1866
	//* 855 1782:aload_3         
	//* 856 1783:astore          6
	//* 857 1785:aload_3         
	//* 858 1786:astore_2        
	//* 859 1787:aload_0         
	//* 860 1788:aload_1         
	//* 861 1789:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 862 1792:putfield        #165 <Field byte[] bytes>
	//* 863 1795:aload_3         
	//* 864 1796:astore          6
	//* 865 1798:aload_3         
	//* 866 1799:astore_2        
	//* 867 1800:aload_0         
	//* 868 1801:getstatic       #168 <Field PdfName PdfName.LENGTH>
	//* 869 1804:new             #53  <Class PdfNumber>
	//* 870 1807:dup             
	//* 871 1808:aload_0         
	//* 872 1809:getfield        #165 <Field byte[] bytes>
	//* 873 1812:arraylength     
	//* 874 1813:invokespecial   #171 <Method void PdfNumber(int)>
	//* 875 1816:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 876 1819:aload_3         
	//* 877 1820:ifnull          765
	//* 878 1823:aload_3         
	//* 879 1824:invokevirtual   #252 <Method void InputStream.close()>
	//* 880 1827:return          
	//* 881 1828:astore_1        
	//* 882 1829:return          
	//* 883 1830:aload_3         
	//* 884 1831:astore          6
	//* 885 1833:aload_3         
	//* 886 1834:astore_2        
	//* 887 1835:aload_0         
	//* 888 1836:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 889 1839:getstatic       #177 <Field PdfName PdfName.DEVICEGRAY>
	//* 890 1842:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 891 1845:goto            1747
	//* 892 1848:aload_3         
	//* 893 1849:astore          6
	//* 894 1851:aload_3         
	//* 895 1852:astore_2        
	//* 896 1853:aload_0         
	//* 897 1854:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 898 1857:getstatic       #255 <Field PdfName PdfName.DEVICERGB>
	//* 899 1860:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 900 1863:goto            1747
	//* 901 1866:aload_3         
	//* 902 1867:astore          6
	//* 903 1869:aload_3         
	//* 904 1870:astore_2        
	//* 905 1871:aload_0         
	//* 906 1872:new             #305 <Class ByteArrayOutputStream>
	//* 907 1875:dup             
	//* 908 1876:invokespecial   #306 <Method void ByteArrayOutputStream()>
	//* 909 1879:putfield        #310 <Field ByteArrayOutputStream streamBytes>
	//* 910 1882:aload_3         
	//* 911 1883:astore          6
	//* 912 1885:aload_3         
	//* 913 1886:astore_2        
	//* 914 1887:aload_3         
	//* 915 1888:aload_0         
	//* 916 1889:getfield        #310 <Field ByteArrayOutputStream streamBytes>
	//* 917 1892:iconst_m1       
	//* 918 1893:invokestatic    #314 <Method void transferBytes(InputStream, OutputStream, int)>
	//* 919 1896:goto            1607
	//* 920 1899:aload_3         
	//* 921 1900:astore          6
	//* 922 1902:aload_3         
	//* 923 1903:astore_2        
	//* 924 1904:aload_0         
	//* 925 1905:getstatic       #183 <Field PdfName PdfName.FILTER>
	//* 926 1908:getstatic       #323 <Field PdfName PdfName.JBIG2DECODE>
	//* 927 1911:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 928 1914:aload_3         
	//* 929 1915:astore          6
	//* 930 1917:aload_3         
	//* 931 1918:astore_2        
	//* 932 1919:aload_0         
	//* 933 1920:getstatic       #174 <Field PdfName PdfName.COLORSPACE>
	//* 934 1923:getstatic       #177 <Field PdfName PdfName.DEVICEGRAY>
	//* 935 1926:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 936 1929:aload_3         
	//* 937 1930:astore          6
	//* 938 1932:aload_3         
	//* 939 1933:astore_2        
	//* 940 1934:aload_0         
	//* 941 1935:getstatic       #180 <Field PdfName PdfName.BITSPERCOMPONENT>
	//* 942 1938:new             #53  <Class PdfNumber>
	//* 943 1941:dup             
	//* 944 1942:iconst_1        
	//* 945 1943:invokespecial   #171 <Method void PdfNumber(int)>
	//* 946 1946:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 947 1949:aload_3         
	//* 948 1950:astore          6
	//* 949 1952:aload_3         
	//* 950 1953:astore_2        
	//* 951 1954:aload_1         
	//* 952 1955:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 953 1958:ifnull          2009
	//* 954 1961:aload_3         
	//* 955 1962:astore          6
	//* 956 1964:aload_3         
	//* 957 1965:astore_2        
	//* 958 1966:aload_0         
	//* 959 1967:aload_1         
	//* 960 1968:invokevirtual   #161 <Method byte[] Image.getRawData()>
	//* 961 1971:putfield        #165 <Field byte[] bytes>
	//* 962 1974:aload_3         
	//* 963 1975:astore          6
	//* 964 1977:aload_3         
	//* 965 1978:astore_2        
	//* 966 1979:aload_0         
	//* 967 1980:getstatic       #168 <Field PdfName PdfName.LENGTH>
	//* 968 1983:new             #53  <Class PdfNumber>
	//* 969 1986:dup             
	//* 970 1987:aload_0         
	//* 971 1988:getfield        #165 <Field byte[] bytes>
	//* 972 1991:arraylength     
	//* 973 1992:invokespecial   #171 <Method void PdfNumber(int)>
	//* 974 1995:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//* 975 1998:aload_3         
	//* 976 1999:ifnull          765
	//* 977 2002:aload_3         
	//* 978 2003:invokevirtual   #252 <Method void InputStream.close()>
	//* 979 2006:return          
	//* 980 2007:astore_1        
	//* 981 2008:return          
	//* 982 2009:aload_3         
	//* 983 2010:astore          6
	//* 984 2012:aload_3         
	//* 985 2013:astore_2        
	//* 986 2014:aload_0         
	//* 987 2015:new             #305 <Class ByteArrayOutputStream>
	//* 988 2018:dup             
	//* 989 2019:invokespecial   #306 <Method void ByteArrayOutputStream()>
	//* 990 2022:putfield        #310 <Field ByteArrayOutputStream streamBytes>
	//* 991 2025:aload_3         
	//* 992 2026:astore          6
	//* 993 2028:aload_3         
	//* 994 2029:astore_2        
	//* 995 2030:aload_3         
	//* 996 2031:aload_0         
	//* 997 2032:getfield        #310 <Field ByteArrayOutputStream streamBytes>
	//* 998 2035:iconst_m1       
	//* 999 2036:invokestatic    #314 <Method void transferBytes(InputStream, OutputStream, int)>
	//*1000 2039:goto            1607
	//*1001 2042:astore_1        
	//*1002 2043:return          
			// Misplaced declaration of an exception variable
			catch(String s) { }
	// 1003 2044:astore_2        
		throw image1;
_L8:
		obj = obj1;
		s = ((String) (obj2));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICEGRAY)));
		obj = obj1;
		s = ((String) (obj2));
		if(!image1.isInverted()) goto _L17; else goto _L16
_L16:
		obj = obj1;
		s = ((String) (obj2));
		put(PdfName.DECODE, ((PdfObject) (new PdfLiteral("[1 0]"))));
		  goto _L17
_L9:
		obj = obj1;
		s = ((String) (obj2));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICERGB)));
		obj = obj1;
		s = ((String) (obj2));
		if(!image1.isInverted()) goto _L17; else goto _L18
_L18:
		obj = obj1;
		s = ((String) (obj2));
		put(PdfName.DECODE, ((PdfObject) (new PdfLiteral("[1 0 1 0 1 0]"))));
		  goto _L17
_L15:
		obj = obj1;
		s = ((String) (obj2));
		flateCompress(image1.getCompressionLevel());
		continue; /* Loop/switch isn't completed */
_L4:
		obj = obj1;
		s = ((String) (obj2));
		if(image1.getRawData() != null) goto _L20; else goto _L19
_L19:
		obj = obj1;
		s = ((String) (obj2));
		pdfindirectreference = ((PdfIndirectReference) (image1.getUrl().openStream()));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		obj1 = ((Object) (image1.getUrl().toString()));
_L26:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		image1.type();
		JVM INSTR tableswitch 32 36: default 2048
	//	               32 1299
	//	               33 1669
	//	               34 1244
	//	               35 1244
	//	               36 1899;
		   goto _L21 _L22 _L23 _L21 _L21 _L24
_L21:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		try
		{
			throw new BadPdfFormatException(MessageLocalization.getComposedMessage("1.is.an.unknown.image.format", new Object[] {
				obj1
			}));
		}
		// Misplaced declaration of an exception variable
		catch(Image image1)
		{
			s = ((String) (obj));
		}
		  goto _L25
_L20:
		obj = obj1;
		s = ((String) (obj2));
		pdfindirectreference = ((PdfIndirectReference) (new ByteArrayInputStream(image1.getRawData())));
		obj1 = "Byte array";
		  goto _L26
_L22:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.FILTER, ((PdfObject) (PdfName.DCTDECODE)));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		if(image1.getColorTransform() != 0) goto _L28; else goto _L27
_L27:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		obj1 = ((Object) (new PdfDictionary()));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		((PdfDictionary) (obj1)).put(PdfName.COLORTRANSFORM, ((PdfObject) (new PdfNumber(0))));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.DECODEPARMS, ((PdfObject) (obj1)));
_L28:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		image1.getColorspace();
		JVM INSTR tableswitch 1 3: default 2051
	//	               1 1541
	//	               2 1412
	//	               3 1559;
		   goto _L29 _L30 _L29 _L31
_L29:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICECMYK)));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		if(!image1.isInverted())
			break MISSING_BLOCK_LABEL_1460;
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.DECODE, ((PdfObject) (new PdfLiteral("[1 0 1 0 1 0 1 0]"))));
_L35:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.BITSPERCOMPONENT, ((PdfObject) (new PdfNumber(8))));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		if(image1.getRawData() == null) goto _L33; else goto _L32
_L32:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		bytes = image1.getRawData();
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
		if(pdfindirectreference != null)
			try
			{
				((InputStream) (pdfindirectreference)).close();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(Image image1)
			{
				return;
			}
		  goto _L34
_L30:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICEGRAY)));
		  goto _L35
_L31:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICERGB)));
		  goto _L35
_L33:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		streamBytes = new ByteArrayOutputStream();
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		transferBytes(((InputStream) (pdfindirectreference)), ((OutputStream) (streamBytes)), -1);
_L46:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		if(image1.getCompressionLevel() <= 0) goto _L37; else goto _L36
_L36:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		flateCompress(image1.getCompressionLevel());
_L37:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(streamBytes.size()))));
		if(pdfindirectreference != null)
			try
			{
				((InputStream) (pdfindirectreference)).close();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(Image image1)
			{
				return;
			}
		  goto _L34
_L23:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.FILTER, ((PdfObject) (PdfName.JPXDECODE)));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		if(image1.getColorspace() <= 0) goto _L39; else goto _L38
_L38:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		image1.getColorspace();
		JVM INSTR tableswitch 1 3: default 2054
	//	               1 1830
	//	               2 1732
	//	               3 1848;
		   goto _L40 _L41 _L40 _L42
_L40:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICECMYK)));
_L45:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.BITSPERCOMPONENT, ((PdfObject) (new PdfNumber(image1.getBpc()))));
_L39:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		if(image1.getRawData() == null) goto _L44; else goto _L43
_L43:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		bytes = image1.getRawData();
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
		if(pdfindirectreference != null)
			try
			{
				((InputStream) (pdfindirectreference)).close();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(Image image1)
			{
				return;
			}
		  goto _L34
_L41:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICEGRAY)));
		  goto _L45
_L42:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICERGB)));
		  goto _L45
_L44:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		streamBytes = new ByteArrayOutputStream();
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		transferBytes(((InputStream) (pdfindirectreference)), ((OutputStream) (streamBytes)), -1);
		  goto _L46
_L24:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.FILTER, ((PdfObject) (PdfName.JBIG2DECODE)));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.COLORSPACE, ((PdfObject) (PdfName.DEVICEGRAY)));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.BITSPERCOMPONENT, ((PdfObject) (new PdfNumber(1))));
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		if(image1.getRawData() == null) goto _L48; else goto _L47
_L47:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		bytes = image1.getRawData();
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
		if(pdfindirectreference != null)
			try
			{
				((InputStream) (pdfindirectreference)).close();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(Image image1)
			{
				return;
			}
		  goto _L34
_L48:
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		streamBytes = new ByteArrayOutputStream();
		obj = ((Object) (pdfindirectreference));
		s = ((String) (pdfindirectreference));
		transferBytes(((InputStream) (pdfindirectreference)), ((OutputStream) (streamBytes)), -1);
		  goto _L46
		image1;
		return;
		if(true) goto _L50; else goto _L49
	// 1004 2045:goto            1021
_L49:
	//*1005 2048:goto            1244
	//*1006 2051:goto            1412
	//*1007 2054:goto            1732
	}

	private void generateImgResName(Image image1)
	{
		name = new PdfName((new StringBuilder()).append("img").append(Long.toHexString(image1.getMySerialId().longValue())).toString());
	//    0    0:aload_0         
	//    1    1:new             #32  <Class PdfName>
	//    2    4:dup             
	//    3    5:new             #129 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #326 <Method void StringBuilder()>
	//    6   12:ldc2            #328 <String "img">
	//    7   15:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #332 <Method Long Image.getMySerialId()>
	//   10   22:invokevirtual   #338 <Method long Long.longValue()>
	//   11   25:invokestatic    #342 <Method String Long.toHexString(long)>
	//   12   28:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #142 <Method void PdfName(String)>
	//   15   37:putfield        #24  <Field PdfName name>
	//   16   40:return          
	}

	static void transferBytes(InputStream inputstream, OutputStream outputstream, int i)
		throws IOException
	{
		byte abyte0[] = new byte[4096];
	//    0    0:sipush          4096
	//    1    3:newarray        byte[]
	//    2    5:astore          4
		int j = i;
	//    3    7:iload_2         
	//    4    8:istore_3        
		if(i < 0)
	//*   5    9:iload_2         
	//*   6   10:ifge            17
			j = 0x7fff0000;
	//    7   13:ldc2            #343 <Int 0x7fff0000>
	//    8   16:istore_3        
		do
		{
label0:
			{
				if(j != 0)
	//*   9   17:iload_3         
	//*  10   18:ifeq            40
				{
					i = inputstream.read(abyte0, 0, Math.min(j, 4096));
	//   11   21:aload_0         
	//   12   22:aload           4
	//   13   24:iconst_0        
	//   14   25:iload_3         
	//   15   26:sipush          4096
	//   16   29:invokestatic    #349 <Method int Math.min(int, int)>
	//   17   32:invokevirtual   #353 <Method int InputStream.read(byte[], int, int)>
	//   18   35:istore_2        
					if(i >= 0)
						break label0;
	//   19   36:iload_2         
	//   20   37:ifge            41
				}
				return;
	//   21   40:return          
			}
			outputstream.write(abyte0, 0, i);
	//   22   41:aload_1         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:iload_2         
	//   26   46:invokevirtual   #359 <Method void OutputStream.write(byte[], int, int)>
			j -= i;
	//   27   49:iload_3         
	//   28   50:iload_2         
	//   29   51:isub            
	//   30   52:istore_3        
		} while(true);
	//   31   53:goto            17
	}

	public Image getImage()
	{
		return image;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Image image>
	//    2    4:areturn         
	}

	protected void importAll(PdfImage pdfimage)
	{
		name = pdfimage.name;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #24  <Field PdfName name>
	//    3    5:putfield        #24  <Field PdfName name>
		compressed = pdfimage.compressed;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #367 <Field boolean compressed>
	//    7   13:putfield        #367 <Field boolean compressed>
		compressionLevel = pdfimage.compressionLevel;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #370 <Field int compressionLevel>
	//   11   21:putfield        #370 <Field int compressionLevel>
		streamBytes = pdfimage.streamBytes;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #310 <Field ByteArrayOutputStream streamBytes>
	//   15   29:putfield        #310 <Field ByteArrayOutputStream streamBytes>
		bytes = pdfimage.bytes;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #165 <Field byte[] bytes>
	//   19   37:putfield        #165 <Field byte[] bytes>
		hashMap = pdfimage.hashMap;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #374 <Field java.util.LinkedHashMap hashMap>
	//   23   45:putfield        #374 <Field java.util.LinkedHashMap hashMap>
	//   24   48:return          
	}

	public PdfName name()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfName name>
	//    2    4:areturn         
	}

	static final int TRANSFERSIZE = 4096;
	protected Image image;
	protected PdfName name;
}
