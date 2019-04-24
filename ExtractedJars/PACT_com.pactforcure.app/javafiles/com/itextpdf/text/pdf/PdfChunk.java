// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfFont, BaseFont, DefaultSplitCharacter, HyphenationEvent, 
//			PdfAction

public class PdfChunk
{

	PdfChunk(Chunk chunk, PdfAction pdfaction)
	{
		float f;
		int i;
		Font font1;
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void Object()>
		value = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "">
	//    4    7:putfield        #111 <Field String value>
		encoding = "Cp1252";
	//    5   10:aload_0         
	//    6   11:ldc1            #113 <String "Cp1252">
	//    7   13:putfield        #115 <Field String encoding>
		attributes = new HashMap();
	//    8   16:aload_0         
	//    9   17:new             #117 <Class HashMap>
	//   10   20:dup             
	//   11   21:invokespecial   #118 <Method void HashMap()>
	//   12   24:putfield        #120 <Field HashMap attributes>
		noStroke = new HashMap();
	//   13   27:aload_0         
	//   14   28:new             #117 <Class HashMap>
	//   15   31:dup             
	//   16   32:invokespecial   #118 <Method void HashMap()>
	//   17   35:putfield        #122 <Field HashMap noStroke>
		imageScalePercentage = 1.0F;
	//   18   38:aload_0         
	//   19   39:fconst_1        
	//   20   40:putfield        #124 <Field float imageScalePercentage>
		changeLeading = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #126 <Field boolean changeLeading>
		leading = 0.0F;
	//   24   48:aload_0         
	//   25   49:fconst_0        
	//   26   50:putfield        #128 <Field float leading>
		accessibleElement = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #130 <Field IAccessibleElement accessibleElement>
		value = chunk.getContent();
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #136 <Method String Chunk.getContent()>
	//   33   63:putfield        #111 <Field String value>
		font1 = chunk.getFont();
	//   34   66:aload_1         
	//   35   67:invokevirtual   #140 <Method Font Chunk.getFont()>
	//   36   70:astore          7
		float f1 = font1.getSize();
	//   37   72:aload           7
	//   38   74:invokevirtual   #146 <Method float Font.getSize()>
	//   39   77:fstore          4
		f = f1;
	//   40   79:fload           4
	//   41   81:fstore_3        
		if(f1 == -1F)
	//*  42   82:fload           4
	//*  43   84:ldc1            #147 <Float -1F>
	//*  44   86:fcmpl           
	//*  45   87:ifne            93
			f = 12F;
	//   46   90:ldc1            #148 <Float 12F>
	//   47   92:fstore_3        
		baseFont = font1.getBaseFont();
	//   48   93:aload_0         
	//   49   94:aload           7
	//   50   96:invokevirtual   #152 <Method BaseFont Font.getBaseFont()>
	//   51   99:putfield        #154 <Field BaseFont baseFont>
		int j = font1.getStyle();
	//   52  102:aload           7
	//   53  104:invokevirtual   #158 <Method int Font.getStyle()>
	//   54  107:istore          6
		i = j;
	//   55  109:iload           6
	//   56  111:istore          5
		if(j == -1)
	//*  57  113:iload           6
	//*  58  115:iconst_m1       
	//*  59  116:icmpne          122
			i = 0;
	//   60  119:iconst_0        
	//   61  120:istore          5
		if(baseFont != null) goto _L2; else goto _L1
	//   62  122:aload_0         
	//   63  123:getfield        #154 <Field BaseFont baseFont>
	//   64  126:ifnonnull       243
_L1:
		baseFont = font1.getCalculatedBaseFont(false);
	//   65  129:aload_0         
	//   66  130:aload           7
	//   67  132:iconst_0        
	//   68  133:invokevirtual   #162 <Method BaseFont Font.getCalculatedBaseFont(boolean)>
	//   69  136:putfield        #154 <Field BaseFont baseFont>
_L8:
		HashMap hashmap;
		font = new PdfFont(baseFont, f);
	//   70  139:aload_0         
	//   71  140:new             #164 <Class PdfFont>
	//   72  143:dup             
	//   73  144:aload_0         
	//   74  145:getfield        #154 <Field BaseFont baseFont>
	//   75  148:fload_3         
	//   76  149:invokespecial   #167 <Method void PdfFont(BaseFont, float)>
	//   77  152:putfield        #169 <Field PdfFont font>
		hashmap = chunk.getAttributes();
	//   78  155:aload_1         
	//   79  156:invokevirtual   #173 <Method HashMap Chunk.getAttributes()>
	//   80  159:astore          8
		if(hashmap == null) goto _L4; else goto _L3
	//   81  161:aload           8
	//   82  163:ifnull          381
_L3:
		Iterator iterator = hashmap.entrySet().iterator();
	//   83  166:aload           8
	//   84  168:invokevirtual   #177 <Method Set HashMap.entrySet()>
	//   85  171:invokeinterface #183 <Method Iterator Set.iterator()>
	//   86  176:astore          9
_L6:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   87  178:aload           9
	//   88  180:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//   89  185:ifeq            352
		java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   90  188:aload           9
	//   91  190:invokeinterface #193 <Method Object Iterator.next()>
	//   92  195:checkcast       #195 <Class java.util.Map$Entry>
	//   93  198:astore          10
		String s = (String)entry.getKey();
	//   94  200:aload           10
	//   95  202:invokeinterface #198 <Method Object java.util.Map$Entry.getKey()>
	//   96  207:checkcast       #200 <Class String>
	//   97  210:astore          11
		if(keysAttributes.contains(((Object) (s))))
	//*  98  212:getstatic       #54  <Field HashSet keysAttributes>
	//*  99  215:aload           11
	//* 100  217:invokevirtual   #203 <Method boolean HashSet.contains(Object)>
	//* 101  220:ifeq            321
			attributes.put(((Object) (s)), entry.getValue());
	//  102  223:aload_0         
	//  103  224:getfield        #120 <Field HashMap attributes>
	//  104  227:aload           11
	//  105  229:aload           10
	//  106  231:invokeinterface #206 <Method Object java.util.Map$Entry.getValue()>
	//  107  236:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  108  239:pop             
		else
	//* 109  240:goto            178
	//* 110  243:iload           5
	//* 111  245:iconst_1        
	//* 112  246:iand            
	//* 113  247:ifeq            289
	//* 114  250:aload_0         
	//* 115  251:getfield        #120 <Field HashMap attributes>
	//* 116  254:ldc1            #104 <String "TEXTRENDERMODE">
	//* 117  256:iconst_3        
	//* 118  257:anewarray       Object[]
	//* 119  260:dup             
	//* 120  261:iconst_0        
	//* 121  262:iconst_2        
	//* 122  263:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//* 123  266:aastore         
	//* 124  267:dup             
	//* 125  268:iconst_1        
	//* 126  269:new             #218 <Class Float>
	//* 127  272:dup             
	//* 128  273:fload_3         
	//* 129  274:ldc1            #219 <Float 30F>
	//* 130  276:fdiv            
	//* 131  277:invokespecial   #222 <Method void Float(float)>
	//* 132  280:aastore         
	//* 133  281:dup             
	//* 134  282:iconst_2        
	//* 135  283:aconst_null     
	//* 136  284:aastore         
	//* 137  285:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//* 138  288:pop             
	//* 139  289:iload           5
	//* 140  291:iconst_2        
	//* 141  292:iand            
	//* 142  293:ifeq            139
	//* 143  296:aload_0         
	//* 144  297:getfield        #120 <Field HashMap attributes>
	//* 145  300:ldc1            #82  <String "SKEW">
	//* 146  302:iconst_2        
	//* 147  303:newarray        float[]
	//* 148  305:dup             
	//* 149  306:iconst_0        
	//* 150  307:fconst_0        
	//* 151  308:fastore         
	//* 152  309:dup             
	//* 153  310:iconst_1        
	//* 154  311:ldc1            #7   <Float 0.21256F>
	//* 155  313:fastore         
	//* 156  314:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//* 157  317:pop             
	//* 158  318:goto            139
		if(keysNoStroke.contains(((Object) (s))))
	//* 159  321:getstatic       #56  <Field HashSet keysNoStroke>
	//* 160  324:aload           11
	//* 161  326:invokevirtual   #203 <Method boolean HashSet.contains(Object)>
	//* 162  329:ifeq            178
			noStroke.put(((Object) (s)), entry.getValue());
	//  163  332:aload_0         
	//  164  333:getfield        #122 <Field HashMap noStroke>
	//  165  336:aload           11
	//  166  338:aload           10
	//  167  340:invokeinterface #206 <Method Object java.util.Map$Entry.getValue()>
	//  168  345:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  169  348:pop             
		continue; /* Loop/switch isn't completed */
	//  170  349:goto            178
_L2:
		if((i & 1) != 0)
			attributes.put("TEXTRENDERMODE", ((Object) (new Object[] {
				Integer.valueOf(2), new Float(f / 30F), null
			})));
		if((i & 2) != 0)
			attributes.put("SKEW", ((Object) (new float[] {
				0.0F, 0.21256F
			})));
		continue; /* Loop/switch isn't completed */
		if(true) goto _L6; else goto _L5
_L5:
		if("".equals(hashmap.get("GENERICTAG")))
	//* 171  352:ldc1            #109 <String "">
	//* 172  354:aload           8
	//* 173  356:ldc1            #72  <String "GENERICTAG">
	//* 174  358:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//* 175  361:invokevirtual   #229 <Method boolean String.equals(Object)>
	//* 176  364:ifeq            381
			attributes.put("GENERICTAG", ((Object) (chunk.getContent())));
	//  177  367:aload_0         
	//  178  368:getfield        #120 <Field HashMap attributes>
	//  179  371:ldc1            #72  <String "GENERICTAG">
	//  180  373:aload_1         
	//  181  374:invokevirtual   #136 <Method String Chunk.getContent()>
	//  182  377:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  183  380:pop             
_L4:
		if(font1.isUnderlined())
	//* 184  381:aload           7
	//* 185  383:invokevirtual   #232 <Method boolean Font.isUnderlined()>
	//* 186  386:ifeq            457
		{
			Object aobj[][] = Utilities.addToArray((Object[][])(Object[][])attributes.get("UNDERLINE"), new Object[] {
				null, new float[] {
					0.0F, 0.06666667F, 0.0F, -0.3333333F, 0.0F
				}
			});
	//  187  389:aload_0         
	//  188  390:getfield        #120 <Field HashMap attributes>
	//  189  393:ldc1            #64  <String "UNDERLINE">
	//  190  395:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//  191  398:checkcast       #234 <Class Object[][]>
	//  192  401:checkcast       #234 <Class Object[][]>
	//  193  404:iconst_2        
	//  194  405:anewarray       Object[]
	//  195  408:dup             
	//  196  409:iconst_0        
	//  197  410:aconst_null     
	//  198  411:aastore         
	//  199  412:dup             
	//  200  413:iconst_1        
	//  201  414:iconst_5        
	//  202  415:newarray        float[]
	//  203  417:dup             
	//  204  418:iconst_0        
	//  205  419:fconst_0        
	//  206  420:fastore         
	//  207  421:dup             
	//  208  422:iconst_1        
	//  209  423:ldc1            #14  <Float 0.06666667F>
	//  210  425:fastore         
	//  211  426:dup             
	//  212  427:iconst_2        
	//  213  428:fconst_0        
	//  214  429:fastore         
	//  215  430:dup             
	//  216  431:iconst_3        
	//  217  432:ldc1            #12  <Float -0.3333333F>
	//  218  434:fastore         
	//  219  435:dup             
	//  220  436:iconst_4        
	//  221  437:fconst_0        
	//  222  438:fastore         
	//  223  439:aastore         
	//  224  440:invokestatic    #240 <Method Object[][] Utilities.addToArray(Object[][], Object[])>
	//  225  443:astore          8
			attributes.put("UNDERLINE", ((Object) (aobj)));
	//  226  445:aload_0         
	//  227  446:getfield        #120 <Field HashMap attributes>
	//  228  449:ldc1            #64  <String "UNDERLINE">
	//  229  451:aload           8
	//  230  453:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  231  456:pop             
		}
		if(font1.isStrikethru())
	//* 232  457:aload           7
	//* 233  459:invokevirtual   #243 <Method boolean Font.isStrikethru()>
	//* 234  462:ifeq            533
		{
			Object aobj1[][] = Utilities.addToArray((Object[][])(Object[][])attributes.get("UNDERLINE"), new Object[] {
				null, new float[] {
					0.0F, 0.06666667F, 0.0F, 0.3333333F, 0.0F
				}
			});
	//  235  465:aload_0         
	//  236  466:getfield        #120 <Field HashMap attributes>
	//  237  469:ldc1            #64  <String "UNDERLINE">
	//  238  471:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//  239  474:checkcast       #234 <Class Object[][]>
	//  240  477:checkcast       #234 <Class Object[][]>
	//  241  480:iconst_2        
	//  242  481:anewarray       Object[]
	//  243  484:dup             
	//  244  485:iconst_0        
	//  245  486:aconst_null     
	//  246  487:aastore         
	//  247  488:dup             
	//  248  489:iconst_1        
	//  249  490:iconst_5        
	//  250  491:newarray        float[]
	//  251  493:dup             
	//  252  494:iconst_0        
	//  253  495:fconst_0        
	//  254  496:fastore         
	//  255  497:dup             
	//  256  498:iconst_1        
	//  257  499:ldc1            #14  <Float 0.06666667F>
	//  258  501:fastore         
	//  259  502:dup             
	//  260  503:iconst_2        
	//  261  504:fconst_0        
	//  262  505:fastore         
	//  263  506:dup             
	//  264  507:iconst_3        
	//  265  508:ldc1            #244 <Float 0.3333333F>
	//  266  510:fastore         
	//  267  511:dup             
	//  268  512:iconst_4        
	//  269  513:fconst_0        
	//  270  514:fastore         
	//  271  515:aastore         
	//  272  516:invokestatic    #240 <Method Object[][] Utilities.addToArray(Object[][], Object[])>
	//  273  519:astore          8
			attributes.put("UNDERLINE", ((Object) (aobj1)));
	//  274  521:aload_0         
	//  275  522:getfield        #120 <Field HashMap attributes>
	//  276  525:ldc1            #64  <String "UNDERLINE">
	//  277  527:aload           8
	//  278  529:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  279  532:pop             
		}
		if(pdfaction != null)
	//* 280  533:aload_2         
	//* 281  534:ifnull          548
			attributes.put("ACTION", ((Object) (pdfaction)));
	//  282  537:aload_0         
	//  283  538:getfield        #120 <Field HashMap attributes>
	//  284  541:ldc1            #58  <String "ACTION">
	//  285  543:aload_2         
	//  286  544:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  287  547:pop             
		noStroke.put("COLOR", ((Object) (font1.getColor())));
	//  288  548:aload_0         
	//  289  549:getfield        #122 <Field HashMap noStroke>
	//  290  552:ldc1            #246 <String "COLOR">
	//  291  554:aload           7
	//  292  556:invokevirtual   #250 <Method BaseColor Font.getColor()>
	//  293  559:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  294  562:pop             
		noStroke.put("ENCODING", ((Object) (font.getFont().getEncoding())));
	//  295  563:aload_0         
	//  296  564:getfield        #122 <Field HashMap noStroke>
	//  297  567:ldc1            #252 <String "ENCODING">
	//  298  569:aload_0         
	//  299  570:getfield        #169 <Field PdfFont font>
	//  300  573:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//  301  576:invokevirtual   #259 <Method String BaseFont.getEncoding()>
	//  302  579:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//  303  582:pop             
		pdfaction = ((PdfAction) ((Float)attributes.get("LINEHEIGHT")));
	//  304  583:aload_0         
	//  305  584:getfield        #120 <Field HashMap attributes>
	//  306  587:ldc1            #96  <String "LINEHEIGHT">
	//  307  589:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//  308  592:checkcast       #218 <Class Float>
	//  309  595:astore_2        
		if(pdfaction != null)
	//* 310  596:aload_2         
	//* 311  597:ifnull          613
		{
			changeLeading = true;
	//  312  600:aload_0         
	//  313  601:iconst_1        
	//  314  602:putfield        #126 <Field boolean changeLeading>
			leading = ((Float) (pdfaction)).floatValue();
	//  315  605:aload_0         
	//  316  606:aload_2         
	//  317  607:invokevirtual   #262 <Method float Float.floatValue()>
	//  318  610:putfield        #128 <Field float leading>
		}
		pdfaction = ((PdfAction) ((Object[])(Object[])attributes.get("IMAGE")));
	//  319  613:aload_0         
	//  320  614:getfield        #120 <Field HashMap attributes>
	//  321  617:ldc1            #76  <String "IMAGE">
	//  322  619:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//  323  622:checkcast       #264 <Class Object[]>
	//  324  625:checkcast       #264 <Class Object[]>
	//  325  628:astore_2        
		if(pdfaction == null)
	//* 326  629:aload_2         
	//* 327  630:ifnonnull       716
		{
			image = null;
	//  328  633:aload_0         
	//  329  634:aconst_null     
	//  330  635:putfield        #266 <Field Image image>
		} else
	//* 331  638:aload_0         
	//* 332  639:getfield        #120 <Field HashMap attributes>
	//* 333  642:ldc1            #84  <String "HSCALE">
	//* 334  644:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//* 335  647:checkcast       #218 <Class Float>
	//* 336  650:astore_2        
	//* 337  651:aload_2         
	//* 338  652:ifnull          666
	//* 339  655:aload_0         
	//* 340  656:getfield        #169 <Field PdfFont font>
	//* 341  659:aload_2         
	//* 342  660:invokevirtual   #262 <Method float Float.floatValue()>
	//* 343  663:invokevirtual   #269 <Method void PdfFont.setHorizontalScaling(float)>
	//* 344  666:aload_0         
	//* 345  667:aload_0         
	//* 346  668:getfield        #169 <Field PdfFont font>
	//* 347  671:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//* 348  674:invokevirtual   #259 <Method String BaseFont.getEncoding()>
	//* 349  677:putfield        #115 <Field String encoding>
	//* 350  680:aload_0         
	//* 351  681:aload_0         
	//* 352  682:getfield        #122 <Field HashMap noStroke>
	//* 353  685:ldc1            #100 <String "SPLITCHARACTER">
	//* 354  687:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//* 355  690:checkcast       #271 <Class SplitCharacter>
	//* 356  693:putfield        #273 <Field SplitCharacter splitCharacter>
	//* 357  696:aload_0         
	//* 358  697:getfield        #273 <Field SplitCharacter splitCharacter>
	//* 359  700:ifnonnull       710
	//* 360  703:aload_0         
	//* 361  704:getstatic       #278 <Field SplitCharacter DefaultSplitCharacter.DEFAULT>
	//* 362  707:putfield        #273 <Field SplitCharacter splitCharacter>
	//* 363  710:aload_0         
	//* 364  711:aload_1         
	//* 365  712:putfield        #130 <Field IAccessibleElement accessibleElement>
	//* 366  715:return          
		{
			attributes.remove("HSCALE");
	//  367  716:aload_0         
	//  368  717:getfield        #120 <Field HashMap attributes>
	//  369  720:ldc1            #84  <String "HSCALE">
	//  370  722:invokevirtual   #281 <Method Object HashMap.remove(Object)>
	//  371  725:pop             
			image = (Image)pdfaction[0];
	//  372  726:aload_0         
	//  373  727:aload_2         
	//  374  728:iconst_0        
	//  375  729:aaload          
	//  376  730:checkcast       #283 <Class Image>
	//  377  733:putfield        #266 <Field Image image>
			offsetX = ((Float)pdfaction[1]).floatValue();
	//  378  736:aload_0         
	//  379  737:aload_2         
	//  380  738:iconst_1        
	//  381  739:aaload          
	//  382  740:checkcast       #218 <Class Float>
	//  383  743:invokevirtual   #262 <Method float Float.floatValue()>
	//  384  746:putfield        #285 <Field float offsetX>
			offsetY = ((Float)pdfaction[2]).floatValue();
	//  385  749:aload_0         
	//  386  750:aload_2         
	//  387  751:iconst_2        
	//  388  752:aaload          
	//  389  753:checkcast       #218 <Class Float>
	//  390  756:invokevirtual   #262 <Method float Float.floatValue()>
	//  391  759:putfield        #287 <Field float offsetY>
			changeLeading = ((Boolean)pdfaction[3]).booleanValue();
	//  392  762:aload_0         
	//  393  763:aload_2         
	//  394  764:iconst_3        
	//  395  765:aaload          
	//  396  766:checkcast       #289 <Class Boolean>
	//  397  769:invokevirtual   #292 <Method boolean Boolean.booleanValue()>
	//  398  772:putfield        #126 <Field boolean changeLeading>
		}
		pdfaction = ((PdfAction) ((Float)attributes.get("HSCALE")));
		if(pdfaction != null)
			font.setHorizontalScaling(((Float) (pdfaction)).floatValue());
		encoding = font.getFont().getEncoding();
		splitCharacter = (SplitCharacter)noStroke.get("SPLITCHARACTER");
		if(splitCharacter == null)
			splitCharacter = DefaultSplitCharacter.DEFAULT;
		accessibleElement = ((IAccessibleElement) (chunk));
		return;
		if(true) goto _L8; else goto _L7
	//  399  775:goto            638
_L7:
	}

	PdfChunk(Chunk chunk, PdfAction pdfaction, TabSettings tabsettings)
	{
		this(chunk, pdfaction);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #295 <Method void PdfChunk(Chunk, PdfAction)>
		if(tabsettings != null && attributes.get("TABSETTINGS") == null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          33
	//*   6   10:aload_0         
	//*   7   11:getfield        #120 <Field HashMap attributes>
	//*   8   14:ldc1            #90  <String "TABSETTINGS">
	//*   9   16:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//*  10   19:ifnonnull       33
			attributes.put("TABSETTINGS", ((Object) (tabsettings)));
	//   11   22:aload_0         
	//   12   23:getfield        #120 <Field HashMap attributes>
	//   13   26:ldc1            #90  <String "TABSETTINGS">
	//   14   28:aload_3         
	//   15   29:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//   16   32:pop             
	//   17   33:return          
	}

	PdfChunk(String s, PdfChunk pdfchunk)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void Object()>
		value = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "">
	//    4    7:putfield        #111 <Field String value>
		encoding = "Cp1252";
	//    5   10:aload_0         
	//    6   11:ldc1            #113 <String "Cp1252">
	//    7   13:putfield        #115 <Field String encoding>
		attributes = new HashMap();
	//    8   16:aload_0         
	//    9   17:new             #117 <Class HashMap>
	//   10   20:dup             
	//   11   21:invokespecial   #118 <Method void HashMap()>
	//   12   24:putfield        #120 <Field HashMap attributes>
		noStroke = new HashMap();
	//   13   27:aload_0         
	//   14   28:new             #117 <Class HashMap>
	//   15   31:dup             
	//   16   32:invokespecial   #118 <Method void HashMap()>
	//   17   35:putfield        #122 <Field HashMap noStroke>
		imageScalePercentage = 1.0F;
	//   18   38:aload_0         
	//   19   39:fconst_1        
	//   20   40:putfield        #124 <Field float imageScalePercentage>
		changeLeading = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #126 <Field boolean changeLeading>
		leading = 0.0F;
	//   24   48:aload_0         
	//   25   49:fconst_0        
	//   26   50:putfield        #128 <Field float leading>
		accessibleElement = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #130 <Field IAccessibleElement accessibleElement>
		value = s;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:putfield        #111 <Field String value>
		font = pdfchunk.font;
	//   33   63:aload_0         
	//   34   64:aload_2         
	//   35   65:getfield        #169 <Field PdfFont font>
	//   36   68:putfield        #169 <Field PdfFont font>
		attributes = pdfchunk.attributes;
	//   37   71:aload_0         
	//   38   72:aload_2         
	//   39   73:getfield        #120 <Field HashMap attributes>
	//   40   76:putfield        #120 <Field HashMap attributes>
		noStroke = pdfchunk.noStroke;
	//   41   79:aload_0         
	//   42   80:aload_2         
	//   43   81:getfield        #122 <Field HashMap noStroke>
	//   44   84:putfield        #122 <Field HashMap noStroke>
		baseFont = pdfchunk.baseFont;
	//   45   87:aload_0         
	//   46   88:aload_2         
	//   47   89:getfield        #154 <Field BaseFont baseFont>
	//   48   92:putfield        #154 <Field BaseFont baseFont>
		changeLeading = pdfchunk.changeLeading;
	//   49   95:aload_0         
	//   50   96:aload_2         
	//   51   97:getfield        #126 <Field boolean changeLeading>
	//   52  100:putfield        #126 <Field boolean changeLeading>
		leading = pdfchunk.leading;
	//   53  103:aload_0         
	//   54  104:aload_2         
	//   55  105:getfield        #128 <Field float leading>
	//   56  108:putfield        #128 <Field float leading>
		s = ((String) ((Object[])(Object[])attributes.get("IMAGE")));
	//   57  111:aload_0         
	//   58  112:getfield        #120 <Field HashMap attributes>
	//   59  115:ldc1            #76  <String "IMAGE">
	//   60  117:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//   61  120:checkcast       #264 <Class Object[]>
	//   62  123:checkcast       #264 <Class Object[]>
	//   63  126:astore_1        
		if(s == null)
	//*  64  127:aload_1         
	//*  65  128:ifnonnull       189
		{
			image = null;
	//   66  131:aload_0         
	//   67  132:aconst_null     
	//   68  133:putfield        #266 <Field Image image>
		} else
	//*  69  136:aload_0         
	//*  70  137:aload_0         
	//*  71  138:getfield        #169 <Field PdfFont font>
	//*  72  141:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//*  73  144:invokevirtual   #259 <Method String BaseFont.getEncoding()>
	//*  74  147:putfield        #115 <Field String encoding>
	//*  75  150:aload_0         
	//*  76  151:aload_0         
	//*  77  152:getfield        #122 <Field HashMap noStroke>
	//*  78  155:ldc1            #100 <String "SPLITCHARACTER">
	//*  79  157:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//*  80  160:checkcast       #271 <Class SplitCharacter>
	//*  81  163:putfield        #273 <Field SplitCharacter splitCharacter>
	//*  82  166:aload_0         
	//*  83  167:getfield        #273 <Field SplitCharacter splitCharacter>
	//*  84  170:ifnonnull       180
	//*  85  173:aload_0         
	//*  86  174:getstatic       #278 <Field SplitCharacter DefaultSplitCharacter.DEFAULT>
	//*  87  177:putfield        #273 <Field SplitCharacter splitCharacter>
	//*  88  180:aload_0         
	//*  89  181:aload_2         
	//*  90  182:getfield        #130 <Field IAccessibleElement accessibleElement>
	//*  91  185:putfield        #130 <Field IAccessibleElement accessibleElement>
	//*  92  188:return          
		{
			image = (Image)s[0];
	//   93  189:aload_0         
	//   94  190:aload_1         
	//   95  191:iconst_0        
	//   96  192:aaload          
	//   97  193:checkcast       #283 <Class Image>
	//   98  196:putfield        #266 <Field Image image>
			offsetX = ((Float)s[1]).floatValue();
	//   99  199:aload_0         
	//  100  200:aload_1         
	//  101  201:iconst_1        
	//  102  202:aaload          
	//  103  203:checkcast       #218 <Class Float>
	//  104  206:invokevirtual   #262 <Method float Float.floatValue()>
	//  105  209:putfield        #285 <Field float offsetX>
			offsetY = ((Float)s[2]).floatValue();
	//  106  212:aload_0         
	//  107  213:aload_1         
	//  108  214:iconst_2        
	//  109  215:aaload          
	//  110  216:checkcast       #218 <Class Float>
	//  111  219:invokevirtual   #262 <Method float Float.floatValue()>
	//  112  222:putfield        #287 <Field float offsetY>
			changeLeading = ((Boolean)s[3]).booleanValue();
	//  113  225:aload_0         
	//  114  226:aload_1         
	//  115  227:iconst_3        
	//  116  228:aaload          
	//  117  229:checkcast       #289 <Class Boolean>
	//  118  232:invokevirtual   #292 <Method boolean Boolean.booleanValue()>
	//  119  235:putfield        #126 <Field boolean changeLeading>
		}
		encoding = font.getFont().getEncoding();
		splitCharacter = (SplitCharacter)noStroke.get("SPLITCHARACTER");
		if(splitCharacter == null)
			splitCharacter = DefaultSplitCharacter.DEFAULT;
		accessibleElement = pdfchunk.accessibleElement;
	//* 120  238:goto            136
	}

	static TabStop getTabStop(PdfChunk pdfchunk, float f)
	{
		Object obj;
label0:
		{
			obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
			Object aobj[] = (Object[])(Object[])pdfchunk.attributes.get("TAB");
	//    2    2:aload_0         
	//    3    3:getfield        #120 <Field HashMap attributes>
	//    4    6:ldc1            #88  <String "TAB">
	//    5    8:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//    6   11:checkcast       #264 <Class Object[]>
	//    7   14:checkcast       #264 <Class Object[]>
	//    8   17:astore_3        
			if(aobj != null)
	//*   9   18:aload_3         
	//*  10   19:ifnull          56
			{
				obj = ((Object) ((Float)aobj[0]));
	//   11   22:aload_3         
	//   12   23:iconst_0        
	//   13   24:aaload          
	//   14   25:checkcast       #218 <Class Float>
	//   15   28:astore_2        
				if(!Float.isNaN(((Float) (obj)).floatValue()))
					break label0;
	//   16   29:aload_2         
	//   17   30:invokevirtual   #262 <Method float Float.floatValue()>
	//   18   33:invokestatic    #302 <Method boolean Float.isNaN(float)>
	//   19   36:ifeq            58
				obj = ((Object) (TabSettings.getTabStopNewInstance(f, (TabSettings)pdfchunk.attributes.get("TABSETTINGS"))));
	//   20   39:fload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #120 <Field HashMap attributes>
	//   23   44:ldc1            #90  <String "TABSETTINGS">
	//   24   46:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//   25   49:checkcast       #304 <Class TabSettings>
	//   26   52:invokestatic    #308 <Method TabStop TabSettings.getTabStopNewInstance(float, TabSettings)>
	//   27   55:astore_2        
			}
			return ((TabStop) (obj));
	//   28   56:aload_2         
	//   29   57:areturn         
		}
		return TabStop.newInstance(f, ((Float) (obj)).floatValue());
	//   30   58:fload_1         
	//   31   59:aload_2         
	//   32   60:invokevirtual   #262 <Method float Float.floatValue()>
	//   33   63:invokestatic    #314 <Method TabStop TabStop.newInstance(float, float)>
	//   34   66:areturn         
	}

	public static boolean noPrint(int i)
	{
		return i >= 8203 && i <= 8207 || i >= 8234 && i <= 8238 || i == 173;
	//    0    0:iload_0         
	//    1    1:sipush          8203
	//    2    4:icmplt          14
	//    3    7:iload_0         
	//    4    8:sipush          8207
	//    5   11:icmple          35
	//    6   14:iload_0         
	//    7   15:sipush          8234
	//    8   18:icmplt          28
	//    9   21:iload_0         
	//   10   22:sipush          8238
	//   11   25:icmple          35
	//   12   28:iload_0         
	//   13   29:sipush          173
	//   14   32:icmpne          37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	void adjustLeft(float f)
	{
		Object aobj[] = (Object[])(Object[])attributes.get("TAB");
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field HashMap attributes>
	//    2    4:ldc1            #88  <String "TAB">
	//    3    6:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #264 <Class Object[]>
	//    5   12:checkcast       #264 <Class Object[]>
	//    6   15:astore_2        
		if(aobj != null)
	//*   7   16:aload_2         
	//*   8   17:ifnull          63
			attributes.put("TAB", ((Object) (new Object[] {
				aobj[0], aobj[1], aobj[2], new Float(f)
			})));
	//    9   20:aload_0         
	//   10   21:getfield        #120 <Field HashMap attributes>
	//   11   24:ldc1            #88  <String "TAB">
	//   12   26:iconst_4        
	//   13   27:anewarray       Object[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:aload_2         
	//   17   33:iconst_0        
	//   18   34:aaload          
	//   19   35:aastore         
	//   20   36:dup             
	//   21   37:iconst_1        
	//   22   38:aload_2         
	//   23   39:iconst_1        
	//   24   40:aaload          
	//   25   41:aastore         
	//   26   42:dup             
	//   27   43:iconst_2        
	//   28   44:aload_2         
	//   29   45:iconst_2        
	//   30   46:aaload          
	//   31   47:aastore         
	//   32   48:dup             
	//   33   49:iconst_3        
	//   34   50:new             #218 <Class Float>
	//   35   53:dup             
	//   36   54:fload_1         
	//   37   55:invokespecial   #222 <Method void Float(float)>
	//   38   58:aastore         
	//   39   59:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//   40   62:pop             
	//   41   63:return          
	}

	public boolean changeLeading()
	{
		return changeLeading;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field boolean changeLeading>
	//    2    4:ireturn         
	}

	BaseColor color()
	{
		return (BaseColor)noStroke.get("COLOR");
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field HashMap noStroke>
	//    2    4:ldc1            #246 <String "COLOR">
	//    3    6:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #322 <Class BaseColor>
	//    5   12:areturn         
	}

	PdfFont font()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field PdfFont font>
	//    2    4:areturn         
	}

	Object getAttribute(String s)
	{
		if(attributes.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field HashMap attributes>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #328 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifeq            20
			return attributes.get(((Object) (s)));
	//    5   11:aload_0         
	//    6   12:getfield        #120 <Field HashMap attributes>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//    9   19:areturn         
		else
			return noStroke.get(((Object) (s)));
	//   10   20:aload_0         
	//   11   21:getfield        #122 <Field HashMap noStroke>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//   14   28:areturn         
	}

	float getCharWidth(int i)
	{
		if(noPrint(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #332 <Method boolean noPrint(int)>
	//*   2    4:ifeq            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		if(isAttribute("CHAR_SPACING"))
	//*   5    9:aload_0         
	//*   6   10:ldc1            #92  <String "CHAR_SPACING">
	//*   7   12:invokevirtual   #336 <Method boolean isAttribute(String)>
	//*   8   15:ifeq            50
		{
			Float float1 = (Float)getAttribute("CHAR_SPACING");
	//    9   18:aload_0         
	//   10   19:ldc1            #92  <String "CHAR_SPACING">
	//   11   21:invokevirtual   #338 <Method Object getAttribute(String)>
	//   12   24:checkcast       #218 <Class Float>
	//   13   27:astore_2        
			return font.width(i) + float1.floatValue() * font.getHorizontalScaling();
	//   14   28:aload_0         
	//   15   29:getfield        #169 <Field PdfFont font>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #341 <Method float PdfFont.width(int)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #262 <Method float Float.floatValue()>
	//   20   40:aload_0         
	//   21   41:getfield        #169 <Field PdfFont font>
	//   22   44:invokevirtual   #344 <Method float PdfFont.getHorizontalScaling()>
	//   23   47:fmul            
	//   24   48:fadd            
	//   25   49:freturn         
		}
		if(isImage())
	//*  26   50:aload_0         
	//*  27   51:invokevirtual   #347 <Method boolean isImage()>
	//*  28   54:ifeq            62
			return getImageWidth();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #350 <Method float getImageWidth()>
	//   31   61:freturn         
		else
			return font.width(i);
	//   32   62:aload_0         
	//   33   63:getfield        #169 <Field PdfFont font>
	//   34   66:iload_1         
	//   35   67:invokevirtual   #341 <Method float PdfFont.width(int)>
	//   36   70:freturn         
	}

	String getEncoding()
	{
		return encoding;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String encoding>
	//    2    4:areturn         
	}

	Image getImage()
	{
		return image;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field Image image>
	//    2    4:areturn         
	}

	float getImageHeight()
	{
		return image.getScaledHeight() * imageScalePercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field Image image>
	//    2    4:invokevirtual   #356 <Method float Image.getScaledHeight()>
	//    3    7:aload_0         
	//    4    8:getfield        #124 <Field float imageScalePercentage>
	//    5   11:fmul            
	//    6   12:freturn         
	}

	float getImageOffsetX()
	{
		return offsetX;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field float offsetX>
	//    2    4:freturn         
	}

	float getImageOffsetY()
	{
		return offsetY;
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field float offsetY>
	//    2    4:freturn         
	}

	public float getImageScalePercentage()
	{
		return imageScalePercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field float imageScalePercentage>
	//    2    4:freturn         
	}

	float getImageWidth()
	{
		return image.getScaledWidth() * imageScalePercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field Image image>
	//    2    4:invokevirtual   #362 <Method float Image.getScaledWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #124 <Field float imageScalePercentage>
	//    5   11:fmul            
	//    6   12:freturn         
	}

	public float getLeading()
	{
		return leading;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field float leading>
	//    2    4:freturn         
	}

	TabStop getTabStop()
	{
		return (TabStop)attributes.get("TABSTOP");
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field HashMap attributes>
	//    2    4:ldc1            #10  <String "TABSTOP">
	//    3    6:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #310 <Class TabStop>
	//    5   12:areturn         
	}

	public float getTextRise()
	{
		Float float1 = (Float)getAttribute("SUBSUPSCRIPT");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "SUBSUPSCRIPT">
	//    2    3:invokevirtual   #338 <Method Object getAttribute(String)>
	//    3    6:checkcast       #218 <Class Float>
	//    4    9:astore_1        
		if(float1 != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          19
			return float1.floatValue();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #262 <Method float Float.floatValue()>
	//    9   18:freturn         
		else
			return 0.0F;
	//   10   19:fconst_0        
	//   11   20:freturn         
	}

	public int getUnicodeEquivalent(int i)
	{
		return baseFont.getUnicodeEquivalent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field BaseFont baseFont>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #369 <Method int BaseFont.getUnicodeEquivalent(int)>
	//    4    8:ireturn         
	}

	public float getWidthCorrected(float f, float f1)
	{
		if(image != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field Image image>
	//*   2    4:ifnull          17
			return image.getScaledWidth() + f;
	//    3    7:aload_0         
	//    4    8:getfield        #266 <Field Image image>
	//    5   11:invokevirtual   #362 <Method float Image.getScaledWidth()>
	//    6   14:fload_1         
	//    7   15:fadd            
	//    8   16:freturn         
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		int j = -1;
	//   11   19:iconst_m1       
	//   12   20:istore          4
		do
		{
			j = value.indexOf(' ', j + 1);
	//   13   22:aload_0         
	//   14   23:getfield        #111 <Field String value>
	//   15   26:bipush          32
	//   16   28:iload           4
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:invokevirtual   #375 <Method int String.indexOf(int, int)>
	//   20   35:istore          4
			if(j >= 0)
	//*  21   37:iload           4
	//*  22   39:iflt            49
				i++;
	//   23   42:iload_3         
	//   24   43:iconst_1        
	//   25   44:iadd            
	//   26   45:istore_3        
			else
	//*  27   46:goto            22
				return font.width(value) + (float)value.length() * f + (float)i * f1;
	//   28   49:aload_0         
	//   29   50:getfield        #169 <Field PdfFont font>
	//   30   53:aload_0         
	//   31   54:getfield        #111 <Field String value>
	//   32   57:invokevirtual   #378 <Method float PdfFont.width(String)>
	//   33   60:aload_0         
	//   34   61:getfield        #111 <Field String value>
	//   35   64:invokevirtual   #381 <Method int String.length()>
	//   36   67:i2f             
	//   37   68:fload_1         
	//   38   69:fmul            
	//   39   70:fadd            
	//   40   71:iload_3         
	//   41   72:i2f             
	//   42   73:fload_2         
	//   43   74:fmul            
	//   44   75:fadd            
	//   45   76:freturn         
		} while(true);
	}

	protected int getWord(String s, int i)
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #381 <Method int String.length()>
	//    2    4:istore_3        
		do
		{
			if(i >= j || !Character.isLetter(s.charAt(i)))
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:icmpge          21
	//*   6   10:aload_1         
	//*   7   11:iload_2         
	//*   8   12:invokevirtual   #387 <Method char String.charAt(int)>
	//*   9   15:invokestatic    #393 <Method boolean Character.isLetter(char)>
	//*  10   18:ifne            23
				return i;
	//   11   21:iload_2         
	//   12   22:ireturn         
			i++;
	//   13   23:iload_2         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_2        
		} while(true);
	//   17   27:goto            5
	}

	float height()
	{
		if(isImage())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #347 <Method boolean isImage()>
	//*   2    4:ifeq            12
			return getImageHeight();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #396 <Method float getImageHeight()>
	//    5   11:freturn         
		else
			return font.size();
	//    6   12:aload_0         
	//    7   13:getfield        #169 <Field PdfFont font>
	//    8   16:invokevirtual   #399 <Method float PdfFont.size()>
	//    9   19:freturn         
	}

	boolean isAttribute(String s)
	{
		if(attributes.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field HashMap attributes>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #328 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifeq            13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		else
			return noStroke.containsKey(((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #122 <Field HashMap noStroke>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #328 <Method boolean HashMap.containsKey(Object)>
	//   11   21:ireturn         
	}

	boolean isExtSplitCharacter(int i, int j, int k, char ac[], PdfChunk apdfchunk[])
	{
		return splitCharacter.isSplitCharacter(i, j, k, ac, apdfchunk);
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field SplitCharacter splitCharacter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokeinterface #404 <Method boolean SplitCharacter.isSplitCharacter(int, int, int, char[], PdfChunk[])>
	//    8   16:ireturn         
	}

	boolean isHorizontalSeparator()
	{
		if(isAttribute("SEPARATOR"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #86  <String "SEPARATOR">
	//*   2    3:invokevirtual   #336 <Method boolean isAttribute(String)>
	//*   3    6:ifeq            36
			return !((Boolean)((Object[])(Object[])getAttribute("SEPARATOR"))[1]).booleanValue();
	//    4    9:aload_0         
	//    5   10:ldc1            #86  <String "SEPARATOR">
	//    6   12:invokevirtual   #338 <Method Object getAttribute(String)>
	//    7   15:checkcast       #264 <Class Object[]>
	//    8   18:checkcast       #264 <Class Object[]>
	//    9   21:iconst_1        
	//   10   22:aaload          
	//   11   23:checkcast       #289 <Class Boolean>
	//   12   26:invokevirtual   #292 <Method boolean Boolean.booleanValue()>
	//   13   29:ifne            34
	//   14   32:iconst_1        
	//   15   33:ireturn         
	//   16   34:iconst_0        
	//   17   35:ireturn         
		else
			return false;
	//   18   36:iconst_0        
	//   19   37:ireturn         
	}

	boolean isImage()
	{
		return image != null;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field Image image>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isNewlineSplit()
	{
		return newlineSplit;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field boolean newlineSplit>
	//    2    4:ireturn         
	}

	boolean isSeparator()
	{
		return isAttribute("SEPARATOR");
	//    0    0:aload_0         
	//    1    1:ldc1            #86  <String "SEPARATOR">
	//    2    3:invokevirtual   #336 <Method boolean isAttribute(String)>
	//    3    6:ireturn         
	}

	boolean isSpecialEncoding()
	{
		return encoding.equals("UnicodeBigUnmarked") || encoding.equals("Identity-H");
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String encoding>
	//    2    4:ldc2            #412 <String "UnicodeBigUnmarked">
	//    3    7:invokevirtual   #229 <Method boolean String.equals(Object)>
	//    4   10:ifne            26
	//    5   13:aload_0         
	//    6   14:getfield        #115 <Field String encoding>
	//    7   17:ldc2            #414 <String "Identity-H">
	//    8   20:invokevirtual   #229 <Method boolean String.equals(Object)>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	boolean isStroked()
	{
		return !attributes.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field HashMap attributes>
	//    2    4:invokevirtual   #418 <Method boolean HashMap.isEmpty()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	boolean isTab()
	{
		return isAttribute("TAB");
	//    0    0:aload_0         
	//    1    1:ldc1            #88  <String "TAB">
	//    2    3:invokevirtual   #336 <Method boolean isAttribute(String)>
	//    3    6:ireturn         
	}

	int length()
	{
		return value.length();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String value>
	//    2    4:invokevirtual   #381 <Method int String.length()>
	//    3    7:ireturn         
	}

	int lengthUtf32()
	{
		if("Identity-H".equals(((Object) (encoding)))) goto _L2; else goto _L1
	//    0    0:ldc2            #414 <String "Identity-H">
	//    1    3:aload_0         
	//    2    4:getfield        #115 <Field String encoding>
	//    3    7:invokevirtual   #229 <Method boolean String.equals(Object)>
	//    4   10:ifne            23
_L1:
		int k = value.length();
	//    5   13:aload_0         
	//    6   14:getfield        #111 <Field String value>
	//    7   17:invokevirtual   #381 <Method int String.length()>
	//    8   20:istore_3        
_L4:
		return k;
	//    9   21:iload_3         
	//   10   22:ireturn         
_L2:
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		int l = value.length();
	//   13   25:aload_0         
	//   14   26:getfield        #111 <Field String value>
	//   15   29:invokevirtual   #381 <Method int String.length()>
	//   16   32:istore          4
		int j = 0;
	//   17   34:iconst_0        
	//   18   35:istore_2        
		do
		{
			k = i;
	//   19   36:iload_1         
	//   20   37:istore_3        
			if(j >= l)
				continue;
	//   21   38:iload_2         
	//   22   39:iload           4
	//   23   41:icmpge          21
			k = j;
	//   24   44:iload_2         
	//   25   45:istore_3        
			if(Utilities.isSurrogateHigh(value.charAt(j)))
	//*  26   46:aload_0         
	//*  27   47:getfield        #111 <Field String value>
	//*  28   50:iload_2         
	//*  29   51:invokevirtual   #387 <Method char String.charAt(int)>
	//*  30   54:invokestatic    #423 <Method boolean Utilities.isSurrogateHigh(char)>
	//*  31   57:ifeq            64
				k = j + 1;
	//   32   60:iload_2         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:istore_3        
			i++;
	//   36   64:iload_1         
	//   37   65:iconst_1        
	//   38   66:iadd            
	//   39   67:istore_1        
			j = k + 1;
	//   40   68:iload_3         
	//   41   69:iconst_1        
	//   42   70:iadd            
	//   43   71:istore_2        
		} while(true);
	//   44   72:goto            36
		if(true) goto _L4; else goto _L3
_L3:
	}

	void setImageOffsetX(float f)
	{
		offsetX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #285 <Field float offsetX>
	//    3    5:return          
	}

	void setImageOffsetY(float f)
	{
		offsetY = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #287 <Field float offsetY>
	//    3    5:return          
	}

	public void setImageScalePercentage(float f)
	{
		imageScalePercentage = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #124 <Field float imageScalePercentage>
	//    3    5:return          
	}

	void setTabStop(TabStop tabstop)
	{
		attributes.put("TABSTOP", ((Object) (tabstop)));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field HashMap attributes>
	//    2    4:ldc1            #10  <String "TABSTOP">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #210 <Method Object HashMap.put(Object, Object)>
	//    5   10:pop             
	//    6   11:return          
	}

	void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field String value>
	//    3    5:return          
	}

	PdfChunk split(float f)
	{
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		int i;
		int j;
		int l;
		int j1;
		int k1;
		int l1;
		boolean flag;
		int i2;
		Object obj;
		char ac[];
		BaseFont basefont;
		newlineSplit = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #408 <Field boolean newlineSplit>
		if(image != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #266 <Field Image image>
	//*   5    9:ifnull          71
			if(image.getScaledWidth() > f)
	//*   6   12:aload_0         
	//*   7   13:getfield        #266 <Field Image image>
	//*   8   16:invokevirtual   #362 <Method float Image.getScaledWidth()>
	//*   9   19:fload_1         
	//*  10   20:fcmpl           
	//*  11   21:ifle            69
			{
				PdfChunk pdfchunk = new PdfChunk("\uFFFC", this);
	//   12   24:new             #2   <Class PdfChunk>
	//   13   27:dup             
	//   14   28:ldc2            #434 <String "\uFFFC">
	//   15   31:aload_0         
	//   16   32:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//   17   35:astore          17
				value = "";
	//   18   37:aload_0         
	//   19   38:ldc1            #109 <String "">
	//   20   40:putfield        #111 <Field String value>
				attributes = new HashMap();
	//   21   43:aload_0         
	//   22   44:new             #117 <Class HashMap>
	//   23   47:dup             
	//   24   48:invokespecial   #118 <Method void HashMap()>
	//   25   51:putfield        #120 <Field HashMap attributes>
				image = null;
	//   26   54:aload_0         
	//   27   55:aconst_null     
	//   28   56:putfield        #266 <Field Image image>
				font = PdfFont.getDefaultFont();
	//   29   59:aload_0         
	//   30   60:invokestatic    #439 <Method PdfFont PdfFont.getDefaultFont()>
	//   31   63:putfield        #169 <Field PdfFont font>
				return pdfchunk;
	//   32   66:aload           17
	//   33   68:areturn         
			} else
			{
				return null;
	//   34   69:aconst_null     
	//   35   70:areturn         
			}
		obj = ((Object) ((HyphenationEvent)noStroke.get("HYPHENATION")));
	//   36   71:aload_0         
	//   37   72:getfield        #122 <Field HashMap noStroke>
	//   38   75:ldc1            #102 <String "HYPHENATION">
	//   39   77:invokevirtual   #226 <Method Object HashMap.get(Object)>
	//   40   80:checkcast       #441 <Class HyphenationEvent>
	//   41   83:astore          17
		flag = false;
	//   42   85:iconst_0        
	//   43   86:istore          14
		l1 = 0;
	//   44   88:iconst_0        
	//   45   89:istore          13
		j1 = -1;
	//   46   91:iconst_m1       
	//   47   92:istore          11
		f5 = 0.0F;
	//   48   94:fconst_0        
	//   49   95:fstore          6
		f1 = 0.0F;
	//   50   97:fconst_0        
	//   51   98:fstore_2        
		i = -1;
	//   52   99:iconst_m1       
	//   53  100:istore          8
		f6 = 0.0F;
	//   54  102:fconst_0        
	//   55  103:fstore          7
		f4 = 0.0F;
	//   56  105:fconst_0        
	//   57  106:fstore          5
		i2 = value.length();
	//   58  108:aload_0         
	//   59  109:getfield        #111 <Field String value>
	//   60  112:invokevirtual   #381 <Method int String.length()>
	//   61  115:istore          15
		ac = value.toCharArray();
	//   62  117:aload_0         
	//   63  118:getfield        #111 <Field String value>
	//   64  121:invokevirtual   #445 <Method char[] String.toCharArray()>
	//   65  124:astore          18
		basefont = font.getFont();
	//   66  126:aload_0         
	//   67  127:getfield        #169 <Field PdfFont font>
	//   68  130:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//   69  133:astore          19
		j = ((int) (flag));
	//   70  135:iload           14
	//   71  137:istore          9
		f3 = f5;
	//   72  139:fload           6
	//   73  141:fstore          4
		k1 = i;
	//   74  143:iload           8
	//   75  145:istore          12
		f2 = f6;
	//   76  147:fload           7
	//   77  149:fstore_3        
		l = j1;
	//   78  150:iload           11
	//   79  152:istore          10
		if(basefont.getFontType() != 2) goto _L2; else goto _L1
	//   80  154:aload           19
	//   81  156:invokevirtual   #448 <Method int BaseFont.getFontType()>
	//   82  159:iconst_2        
	//   83  160:icmpne          462
_L1:
		j = ((int) (flag));
	//   84  163:iload           14
	//   85  165:istore          9
		f3 = f5;
	//   86  167:fload           6
	//   87  169:fstore          4
		k1 = i;
	//   88  171:iload           8
	//   89  173:istore          12
		f2 = f6;
	//   90  175:fload           7
	//   91  177:fstore_3        
		l = j1;
	//   92  178:iload           11
	//   93  180:istore          10
		if(basefont.getUnicodeEquivalent(32) == 32) goto _L2; else goto _L3
	//   94  182:aload           19
	//   95  184:bipush          32
	//   96  186:invokevirtual   #369 <Method int BaseFont.getUnicodeEquivalent(int)>
	//   97  189:bipush          32
	//   98  191:icmpeq          462
_L3:
		l = j1;
	//   99  194:iload           11
	//  100  196:istore          10
		f2 = f4;
	//  101  198:fload           5
	//  102  200:fstore_3        
		k1 = i;
	//  103  201:iload           8
	//  104  203:istore          12
		f3 = f1;
	//  105  205:fload_2         
	//  106  206:fstore          4
		j = l1;
	//  107  208:iload           13
	//  108  210:istore          9
_L12:
		j1 = j;
	//  109  212:iload           9
	//  110  214:istore          11
		i = k1;
	//  111  216:iload           12
	//  112  218:istore          8
		f1 = f2;
	//  113  220:fload_3         
	//  114  221:fstore_2        
		l1 = l;
	//  115  222:iload           10
	//  116  224:istore          13
		if(j >= i2) goto _L5; else goto _L4
	//  117  226:iload           9
	//  118  228:iload           15
	//  119  230:icmpge          366
_L4:
		i = ((int) (ac[j]));
	//  120  233:aload           18
	//  121  235:iload           9
	//  122  237:caload          
	//  123  238:istore          8
		j1 = ((int) ((char)basefont.getUnicodeEquivalent(i)));
	//  124  240:aload           19
	//  125  242:iload           8
	//  126  244:invokevirtual   #369 <Method int BaseFont.getUnicodeEquivalent(int)>
	//  127  247:int2char        
	//  128  248:istore          11
		if(j1 == 10)
	//* 129  250:iload           11
	//* 130  252:bipush          10
	//* 131  254:icmpne          318
		{
			newlineSplit = true;
	//  132  257:aload_0         
	//  133  258:iconst_1        
	//  134  259:putfield        #408 <Field boolean newlineSplit>
			obj = ((Object) (value.substring(j + 1)));
	//  135  262:aload_0         
	//  136  263:getfield        #111 <Field String value>
	//  137  266:iload           9
	//  138  268:iconst_1        
	//  139  269:iadd            
	//  140  270:invokevirtual   #452 <Method String String.substring(int)>
	//  141  273:astore          17
			value = value.substring(0, j);
	//  142  275:aload_0         
	//  143  276:aload_0         
	//  144  277:getfield        #111 <Field String value>
	//  145  280:iconst_0        
	//  146  281:iload           9
	//  147  283:invokevirtual   #455 <Method String String.substring(int, int)>
	//  148  286:putfield        #111 <Field String value>
			if(value.length() < 1)
	//* 149  289:aload_0         
	//* 150  290:getfield        #111 <Field String value>
	//* 151  293:invokevirtual   #381 <Method int String.length()>
	//* 152  296:iconst_1        
	//* 153  297:icmpge          307
				value = "\001";
	//  154  300:aload_0         
	//  155  301:ldc2            #457 <String "\001">
	//  156  304:putfield        #111 <Field String value>
			return new PdfChunk(((String) (obj)), this);
	//  157  307:new             #2   <Class PdfChunk>
	//  158  310:dup             
	//  159  311:aload           17
	//  160  313:aload_0         
	//  161  314:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//  162  317:areturn         
		}
		f3 += getCharWidth(i);
	//  163  318:fload           4
	//  164  320:aload_0         
	//  165  321:iload           8
	//  166  323:invokevirtual   #459 <Method float getCharWidth(int)>
	//  167  326:fadd            
	//  168  327:fstore          4
		i = k1;
	//  169  329:iload           12
	//  170  331:istore          8
		f1 = f2;
	//  171  333:fload_3         
	//  172  334:fstore_2        
		if(j1 == 32)
	//* 173  335:iload           11
	//* 174  337:bipush          32
	//* 175  339:icmpne          351
		{
			i = j + 1;
	//  176  342:iload           9
	//  177  344:iconst_1        
	//  178  345:iadd            
	//  179  346:istore          8
			f1 = f3;
	//  180  348:fload           4
	//  181  350:fstore_2        
		}
		if(f3 <= f) goto _L7; else goto _L6
	//  182  351:fload           4
	//  183  353:fload_1         
	//  184  354:fcmpl           
	//  185  355:ifle            375
_L6:
		l1 = l;
	//  186  358:iload           10
	//  187  360:istore          13
		j1 = j;
	//  188  362:iload           9
	//  189  364:istore          11
_L5:
		if(j1 == i2)
	//* 190  366:iload           11
	//* 191  368:iload           15
	//* 192  370:icmpne          711
			return null;
	//  193  373:aconst_null     
	//  194  374:areturn         
		break; /* Loop/switch isn't completed */
_L7:
		if(splitCharacter.isSplitCharacter(0, j, i2, ac, new PdfChunk[] {
	this
}))
	//* 195  375:aload_0         
	//* 196  376:getfield        #273 <Field SplitCharacter splitCharacter>
	//* 197  379:iconst_0        
	//* 198  380:iload           9
	//* 199  382:iload           15
	//* 200  384:aload           18
	//* 201  386:iconst_1        
	//* 202  387:anewarray       PdfChunk[]
	//* 203  390:dup             
	//* 204  391:iconst_0        
	//* 205  392:aload_0         
	//* 206  393:aastore         
	//* 207  394:invokeinterface #404 <Method boolean SplitCharacter.isSplitCharacter(int, int, int, char[], PdfChunk[])>
	//* 208  399:ifeq            408
			l = j + 1;
	//  209  402:iload           9
	//  210  404:iconst_1        
	//  211  405:iadd            
	//  212  406:istore          10
		j++;
	//  213  408:iload           9
	//  214  410:iconst_1        
	//  215  411:iadd            
	//  216  412:istore          9
		k1 = i;
	//  217  414:iload           8
	//  218  416:istore          12
		f2 = f1;
	//  219  418:fload_2         
	//  220  419:fstore_3        
		continue; /* Loop/switch isn't completed */
	//  221  420:goto            212
_L9:
		if(splitCharacter.isSplitCharacter(0, j1, i2, ac, ((PdfChunk []) (null))))
	//* 222  423:aload_0         
	//* 223  424:getfield        #273 <Field SplitCharacter splitCharacter>
	//* 224  427:iconst_0        
	//* 225  428:iload           11
	//* 226  430:iload           15
	//* 227  432:aload           18
	//* 228  434:aconst_null     
	//* 229  435:invokeinterface #404 <Method boolean SplitCharacter.isSplitCharacter(int, int, int, char[], PdfChunk[])>
	//* 230  440:ifeq            449
			l = j1 + 1;
	//  231  443:iload           11
	//  232  445:iconst_1        
	//  233  446:iadd            
	//  234  447:istore          10
		j = j1 + 1;
	//  235  449:iload           11
	//  236  451:iconst_1        
	//  237  452:iadd            
	//  238  453:istore          9
		k1 = i;
	//  239  455:iload           8
	//  240  457:istore          12
		f3 = f1;
	//  241  459:fload_2         
	//  242  460:fstore          4
_L2:
		j1 = j;
	//  243  462:iload           9
	//  244  464:istore          11
		i = k1;
	//  245  466:iload           12
	//  246  468:istore          8
		f1 = f2;
	//  247  470:fload_3         
	//  248  471:fstore_2        
		l1 = l;
	//  249  472:iload           10
	//  250  474:istore          13
		if(j >= i2)
			continue; /* Loop/switch isn't completed */
	//  251  476:iload           9
	//  252  478:iload           15
	//  253  480:icmpge          366
		j1 = ((int) (ac[j]));
	//  254  483:aload           18
	//  255  485:iload           9
	//  256  487:caload          
	//  257  488:istore          11
		if(j1 == 13 || j1 == 10)
	//* 258  490:iload           11
	//* 259  492:bipush          13
	//* 260  494:icmpeq          504
	//* 261  497:iload           11
	//* 262  499:bipush          10
	//* 263  501:icmpne          612
		{
			newlineSplit = true;
	//  264  504:aload_0         
	//  265  505:iconst_1        
	//  266  506:putfield        #408 <Field boolean newlineSplit>
			l = 1;
	//  267  509:iconst_1        
	//  268  510:istore          10
			i = l;
	//  269  512:iload           10
	//  270  514:istore          8
			if(j1 == 13)
	//* 271  516:iload           11
	//* 272  518:bipush          13
	//* 273  520:icmpne          555
			{
				i = l;
	//  274  523:iload           10
	//  275  525:istore          8
				if(j + 1 < i2)
	//* 276  527:iload           9
	//* 277  529:iconst_1        
	//* 278  530:iadd            
	//* 279  531:iload           15
	//* 280  533:icmpge          555
				{
					i = l;
	//  281  536:iload           10
	//  282  538:istore          8
					if(ac[j + 1] == '\n')
	//* 283  540:aload           18
	//* 284  542:iload           9
	//* 285  544:iconst_1        
	//* 286  545:iadd            
	//* 287  546:caload          
	//* 288  547:bipush          10
	//* 289  549:icmpne          555
						i = 2;
	//  290  552:iconst_2        
	//  291  553:istore          8
				}
			}
			obj = ((Object) (value.substring(j + i)));
	//  292  555:aload_0         
	//  293  556:getfield        #111 <Field String value>
	//  294  559:iload           9
	//  295  561:iload           8
	//  296  563:iadd            
	//  297  564:invokevirtual   #452 <Method String String.substring(int)>
	//  298  567:astore          17
			value = value.substring(0, j);
	//  299  569:aload_0         
	//  300  570:aload_0         
	//  301  571:getfield        #111 <Field String value>
	//  302  574:iconst_0        
	//  303  575:iload           9
	//  304  577:invokevirtual   #455 <Method String String.substring(int, int)>
	//  305  580:putfield        #111 <Field String value>
			if(value.length() < 1)
	//* 306  583:aload_0         
	//* 307  584:getfield        #111 <Field String value>
	//* 308  587:invokevirtual   #381 <Method int String.length()>
	//* 309  590:iconst_1        
	//* 310  591:icmpge          601
				value = " ";
	//  311  594:aload_0         
	//  312  595:ldc2            #461 <String " ">
	//  313  598:putfield        #111 <Field String value>
			return new PdfChunk(((String) (obj)), this);
	//  314  601:new             #2   <Class PdfChunk>
	//  315  604:dup             
	//  316  605:aload           17
	//  317  607:aload_0         
	//  318  608:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//  319  611:areturn         
		}
		boolean flag1 = Utilities.isSurrogatePair(ac, j);
	//  320  612:aload           18
	//  321  614:iload           9
	//  322  616:invokestatic    #465 <Method boolean Utilities.isSurrogatePair(char[], int)>
	//  323  619:istore          16
		if(flag1)
	//* 324  621:iload           16
	//* 325  623:ifeq            698
			f1 = f3 + getCharWidth(Utilities.convertToUtf32(ac[j], ac[j + 1]));
	//  326  626:fload           4
	//  327  628:aload_0         
	//  328  629:aload           18
	//  329  631:iload           9
	//  330  633:caload          
	//  331  634:aload           18
	//  332  636:iload           9
	//  333  638:iconst_1        
	//  334  639:iadd            
	//  335  640:caload          
	//  336  641:invokestatic    #469 <Method int Utilities.convertToUtf32(char, char)>
	//  337  644:invokevirtual   #459 <Method float getCharWidth(int)>
	//  338  647:fadd            
	//  339  648:fstore_2        
		else
	//* 340  649:iload           12
	//* 341  651:istore          8
	//* 342  653:iload           11
	//* 343  655:bipush          32
	//* 344  657:icmpne          668
	//* 345  660:iload           9
	//* 346  662:iconst_1        
	//* 347  663:iadd            
	//* 348  664:istore          8
	//* 349  666:fload_2         
	//* 350  667:fstore_3        
	//* 351  668:iload           9
	//* 352  670:istore          11
	//* 353  672:iload           16
	//* 354  674:ifeq            683
	//* 355  677:iload           9
	//* 356  679:iconst_1        
	//* 357  680:iadd            
	//* 358  681:istore          11
	//* 359  683:fload_2         
	//* 360  684:fload_1         
	//* 361  685:fcmpl           
	//* 362  686:ifle            423
	//* 363  689:fload_3         
	//* 364  690:fstore_2        
	//* 365  691:iload           10
	//* 366  693:istore          13
	//* 367  695:goto            366
			f1 = f3 + getCharWidth(j1);
	//  368  698:fload           4
	//  369  700:aload_0         
	//  370  701:iload           11
	//  371  703:invokevirtual   #459 <Method float getCharWidth(int)>
	//  372  706:fadd            
	//  373  707:fstore_2        
		i = k1;
		if(j1 == 32)
		{
			i = j + 1;
			f2 = f1;
		}
		j1 = j;
		if(flag1)
			j1 = j + 1;
		if(f1 <= f) goto _L9; else goto _L8
_L8:
		f1 = f2;
		l1 = l;
		if(true) goto _L5; else goto _L10
	//* 374  708:goto            649
_L10:
		if(l1 < 0)
	//* 375  711:iload           13
	//* 376  713:ifge            739
		{
			obj = ((Object) (value));
	//  377  716:aload_0         
	//  378  717:getfield        #111 <Field String value>
	//  379  720:astore          17
			value = "";
	//  380  722:aload_0         
	//  381  723:ldc1            #109 <String "">
	//  382  725:putfield        #111 <Field String value>
			return new PdfChunk(((String) (obj)), this);
	//  383  728:new             #2   <Class PdfChunk>
	//  384  731:dup             
	//  385  732:aload           17
	//  386  734:aload_0         
	//  387  735:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//  388  738:areturn         
		}
		int k = l1;
	//  389  739:iload           13
	//  390  741:istore          9
		if(i > l1)
	//* 391  743:iload           8
	//* 392  745:iload           13
	//* 393  747:icmple          777
		{
			k = l1;
	//  394  750:iload           13
	//  395  752:istore          9
			if(splitCharacter.isSplitCharacter(0, 0, 1, singleSpace, ((PdfChunk []) (null))))
	//* 396  754:aload_0         
	//* 397  755:getfield        #273 <Field SplitCharacter splitCharacter>
	//* 398  758:iconst_0        
	//* 399  759:iconst_0        
	//* 400  760:iconst_1        
	//* 401  761:getstatic       #47  <Field char[] singleSpace>
	//* 402  764:aconst_null     
	//* 403  765:invokeinterface #404 <Method boolean SplitCharacter.isSplitCharacter(int, int, int, char[], PdfChunk[])>
	//* 404  770:ifeq            777
				k = i;
	//  405  773:iload           8
	//  406  775:istore          9
		}
		if(obj != null && i >= 0 && i < j1)
	//* 407  777:aload           17
	//* 408  779:ifnull          943
	//* 409  782:iload           8
	//* 410  784:iflt            943
	//* 411  787:iload           8
	//* 412  789:iload           11
	//* 413  791:icmpge          943
		{
			int i1 = getWord(value, i);
	//  414  794:aload_0         
	//  415  795:aload_0         
	//  416  796:getfield        #111 <Field String value>
	//  417  799:iload           8
	//  418  801:invokevirtual   #471 <Method int getWord(String, int)>
	//  419  804:istore          10
			if(i1 > i)
	//* 420  806:iload           10
	//* 421  808:iload           8
	//* 422  810:icmple          943
			{
				String s = ((HyphenationEvent) (obj)).getHyphenatedWordPre(value.substring(i, i1), font.getFont(), font.size(), f - f1);
	//  423  813:aload           17
	//  424  815:aload_0         
	//  425  816:getfield        #111 <Field String value>
	//  426  819:iload           8
	//  427  821:iload           10
	//  428  823:invokevirtual   #455 <Method String String.substring(int, int)>
	//  429  826:aload_0         
	//  430  827:getfield        #169 <Field PdfFont font>
	//  431  830:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//  432  833:aload_0         
	//  433  834:getfield        #169 <Field PdfFont font>
	//  434  837:invokevirtual   #399 <Method float PdfFont.size()>
	//  435  840:fload_1         
	//  436  841:fload_2         
	//  437  842:fsub            
	//  438  843:invokeinterface #475 <Method String HyphenationEvent.getHyphenatedWordPre(String, BaseFont, float, float)>
	//  439  848:astore          18
				obj = ((Object) (((HyphenationEvent) (obj)).getHyphenatedWordPost()));
	//  440  850:aload           17
	//  441  852:invokeinterface #478 <Method String HyphenationEvent.getHyphenatedWordPost()>
	//  442  857:astore          17
				if(s.length() > 0)
	//* 443  859:aload           18
	//* 444  861:invokevirtual   #381 <Method int String.length()>
	//* 445  864:ifle            943
				{
					obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(value.substring(i1)).toString()));
	//  446  867:new             #480 <Class StringBuilder>
	//  447  870:dup             
	//  448  871:invokespecial   #481 <Method void StringBuilder()>
	//  449  874:aload           17
	//  450  876:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//  451  879:aload_0         
	//  452  880:getfield        #111 <Field String value>
	//  453  883:iload           10
	//  454  885:invokevirtual   #452 <Method String String.substring(int)>
	//  455  888:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//  456  891:invokevirtual   #488 <Method String StringBuilder.toString()>
	//  457  894:astore          17
					value = trim((new StringBuilder()).append(value.substring(0, i)).append(s).toString());
	//  458  896:aload_0         
	//  459  897:aload_0         
	//  460  898:new             #480 <Class StringBuilder>
	//  461  901:dup             
	//  462  902:invokespecial   #481 <Method void StringBuilder()>
	//  463  905:aload_0         
	//  464  906:getfield        #111 <Field String value>
	//  465  909:iconst_0        
	//  466  910:iload           8
	//  467  912:invokevirtual   #455 <Method String String.substring(int, int)>
	//  468  915:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//  469  918:aload           18
	//  470  920:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//  471  923:invokevirtual   #488 <Method String StringBuilder.toString()>
	//  472  926:invokevirtual   #492 <Method String trim(String)>
	//  473  929:putfield        #111 <Field String value>
					return new PdfChunk(((String) (obj)), this);
	//  474  932:new             #2   <Class PdfChunk>
	//  475  935:dup             
	//  476  936:aload           17
	//  477  938:aload_0         
	//  478  939:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//  479  942:areturn         
				}
			}
		}
		obj = ((Object) (value.substring(k)));
	//  480  943:aload_0         
	//  481  944:getfield        #111 <Field String value>
	//  482  947:iload           9
	//  483  949:invokevirtual   #452 <Method String String.substring(int)>
	//  484  952:astore          17
		value = trim(value.substring(0, k));
	//  485  954:aload_0         
	//  486  955:aload_0         
	//  487  956:aload_0         
	//  488  957:getfield        #111 <Field String value>
	//  489  960:iconst_0        
	//  490  961:iload           9
	//  491  963:invokevirtual   #455 <Method String String.substring(int, int)>
	//  492  966:invokevirtual   #492 <Method String trim(String)>
	//  493  969:putfield        #111 <Field String value>
		return new PdfChunk(((String) (obj)), this);
	//  494  972:new             #2   <Class PdfChunk>
	//  495  975:dup             
	//  496  976:aload           17
	//  497  978:aload_0         
	//  498  979:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//  499  982:areturn         
		if(true) goto _L12; else goto _L11
_L11:
	}

	public String toString()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String value>
	//    2    4:areturn         
	}

	String trim(String s)
	{
		Object obj;
label0:
		{
			obj = ((Object) (font.getFont()));
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field PdfFont font>
	//    2    4:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//    3    7:astore_3        
			String s1 = s;
	//    4    8:aload_1         
	//    5    9:astore_2        
			if(((BaseFont) (obj)).getFontType() == 2)
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #448 <Method int BaseFont.getFontType()>
	//*   8   14:iconst_2        
	//*   9   15:icmpne          58
			{
				s1 = s;
	//   10   18:aload_1         
	//   11   19:astore_2        
				if(((BaseFont) (obj)).getUnicodeEquivalent(32) != 32)
	//*  12   20:aload_3         
	//*  13   21:bipush          32
	//*  14   23:invokevirtual   #369 <Method int BaseFont.getUnicodeEquivalent(int)>
	//*  15   26:bipush          32
	//*  16   28:icmpeq          58
				{
					do
					{
						obj = ((Object) (s));
	//   17   31:aload_1         
	//   18   32:astore_3        
						if(!s.endsWith("\001"))
							break;
	//   19   33:aload_1         
	//   20   34:ldc2            #457 <String "\001">
	//   21   37:invokevirtual   #495 <Method boolean String.endsWith(String)>
	//   22   40:ifeq            95
						s = s.substring(0, s.length() - 1);
	//   23   43:aload_1         
	//   24   44:iconst_0        
	//   25   45:aload_1         
	//   26   46:invokevirtual   #381 <Method int String.length()>
	//   27   49:iconst_1        
	//   28   50:isub            
	//   29   51:invokevirtual   #455 <Method String String.substring(int, int)>
	//   30   54:astore_1        
					} while(true);
	//   31   55:goto            31
					break label0;
				}
			}
			do
			{
				if(!s1.endsWith(" "))
	//*  32   58:aload_2         
	//*  33   59:ldc2            #461 <String " ">
	//*  34   62:invokevirtual   #495 <Method boolean String.endsWith(String)>
	//*  35   65:ifne            80
				{
					obj = ((Object) (s1));
	//   36   68:aload_2         
	//   37   69:astore_3        
					if(!s1.endsWith("\t"))
						break;
	//   38   70:aload_2         
	//   39   71:ldc2            #497 <String "\t">
	//   40   74:invokevirtual   #495 <Method boolean String.endsWith(String)>
	//   41   77:ifeq            95
				}
				s1 = s1.substring(0, s1.length() - 1);
	//   42   80:aload_2         
	//   43   81:iconst_0        
	//   44   82:aload_2         
	//   45   83:invokevirtual   #381 <Method int String.length()>
	//   46   86:iconst_1        
	//   47   87:isub            
	//   48   88:invokevirtual   #455 <Method String String.substring(int, int)>
	//   49   91:astore_2        
			} while(true);
	//   50   92:goto            58
		}
		return ((String) (obj));
	//   51   95:aload_3         
	//   52   96:areturn         
	}

	public float trimFirstSpace()
	{
		BaseFont basefont = font.getFont();
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field PdfFont font>
	//    2    4:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//    3    7:astore_1        
		if(basefont.getFontType() == 2 && basefont.getUnicodeEquivalent(32) != 32)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #448 <Method int BaseFont.getFontType()>
	//*   6   12:iconst_2        
	//*   7   13:icmpne          72
	//*   8   16:aload_1         
	//*   9   17:bipush          32
	//*  10   19:invokevirtual   #369 <Method int BaseFont.getUnicodeEquivalent(int)>
	//*  11   22:bipush          32
	//*  12   24:icmpeq          72
		{
			if(value.length() > 1 && value.startsWith("\001"))
	//*  13   27:aload_0         
	//*  14   28:getfield        #111 <Field String value>
	//*  15   31:invokevirtual   #381 <Method int String.length()>
	//*  16   34:iconst_1        
	//*  17   35:icmple          118
	//*  18   38:aload_0         
	//*  19   39:getfield        #111 <Field String value>
	//*  20   42:ldc2            #457 <String "\001">
	//*  21   45:invokevirtual   #501 <Method boolean String.startsWith(String)>
	//*  22   48:ifeq            118
			{
				value = value.substring(1);
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:getfield        #111 <Field String value>
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #452 <Method String String.substring(int)>
	//   28   60:putfield        #111 <Field String value>
				return font.width(1);
	//   29   63:aload_0         
	//   30   64:getfield        #169 <Field PdfFont font>
	//   31   67:iconst_1        
	//   32   68:invokevirtual   #341 <Method float PdfFont.width(int)>
	//   33   71:freturn         
			}
		} else
		if(value.length() > 1 && value.startsWith(" "))
	//*  34   72:aload_0         
	//*  35   73:getfield        #111 <Field String value>
	//*  36   76:invokevirtual   #381 <Method int String.length()>
	//*  37   79:iconst_1        
	//*  38   80:icmple          118
	//*  39   83:aload_0         
	//*  40   84:getfield        #111 <Field String value>
	//*  41   87:ldc2            #461 <String " ">
	//*  42   90:invokevirtual   #501 <Method boolean String.startsWith(String)>
	//*  43   93:ifeq            118
		{
			value = value.substring(1);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #111 <Field String value>
	//   47  101:iconst_1        
	//   48  102:invokevirtual   #452 <Method String String.substring(int)>
	//   49  105:putfield        #111 <Field String value>
			return font.width(32);
	//   50  108:aload_0         
	//   51  109:getfield        #169 <Field PdfFont font>
	//   52  112:bipush          32
	//   53  114:invokevirtual   #341 <Method float PdfFont.width(int)>
	//   54  117:freturn         
		}
		return 0.0F;
	//   55  118:fconst_0        
	//   56  119:freturn         
	}

	public float trimLastSpace()
	{
		BaseFont basefont = font.getFont();
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field PdfFont font>
	//    2    4:invokevirtual   #254 <Method BaseFont PdfFont.getFont()>
	//    3    7:astore_1        
		if(basefont.getFontType() == 2 && basefont.getUnicodeEquivalent(32) != 32)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #448 <Method int BaseFont.getFontType()>
	//*   6   12:iconst_2        
	//*   7   13:icmpne          81
	//*   8   16:aload_1         
	//*   9   17:bipush          32
	//*  10   19:invokevirtual   #369 <Method int BaseFont.getUnicodeEquivalent(int)>
	//*  11   22:bipush          32
	//*  12   24:icmpeq          81
		{
			if(value.length() > 1 && value.endsWith("\001"))
	//*  13   27:aload_0         
	//*  14   28:getfield        #111 <Field String value>
	//*  15   31:invokevirtual   #381 <Method int String.length()>
	//*  16   34:iconst_1        
	//*  17   35:icmple          136
	//*  18   38:aload_0         
	//*  19   39:getfield        #111 <Field String value>
	//*  20   42:ldc2            #457 <String "\001">
	//*  21   45:invokevirtual   #495 <Method boolean String.endsWith(String)>
	//*  22   48:ifeq            136
			{
				value = value.substring(0, value.length() - 1);
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:getfield        #111 <Field String value>
	//   26   56:iconst_0        
	//   27   57:aload_0         
	//   28   58:getfield        #111 <Field String value>
	//   29   61:invokevirtual   #381 <Method int String.length()>
	//   30   64:iconst_1        
	//   31   65:isub            
	//   32   66:invokevirtual   #455 <Method String String.substring(int, int)>
	//   33   69:putfield        #111 <Field String value>
				return font.width(1);
	//   34   72:aload_0         
	//   35   73:getfield        #169 <Field PdfFont font>
	//   36   76:iconst_1        
	//   37   77:invokevirtual   #341 <Method float PdfFont.width(int)>
	//   38   80:freturn         
			}
		} else
		if(value.length() > 1 && value.endsWith(" "))
	//*  39   81:aload_0         
	//*  40   82:getfield        #111 <Field String value>
	//*  41   85:invokevirtual   #381 <Method int String.length()>
	//*  42   88:iconst_1        
	//*  43   89:icmple          136
	//*  44   92:aload_0         
	//*  45   93:getfield        #111 <Field String value>
	//*  46   96:ldc2            #461 <String " ">
	//*  47   99:invokevirtual   #495 <Method boolean String.endsWith(String)>
	//*  48  102:ifeq            136
		{
			value = value.substring(0, value.length() - 1);
	//   49  105:aload_0         
	//   50  106:aload_0         
	//   51  107:getfield        #111 <Field String value>
	//   52  110:iconst_0        
	//   53  111:aload_0         
	//   54  112:getfield        #111 <Field String value>
	//   55  115:invokevirtual   #381 <Method int String.length()>
	//   56  118:iconst_1        
	//   57  119:isub            
	//   58  120:invokevirtual   #455 <Method String String.substring(int, int)>
	//   59  123:putfield        #111 <Field String value>
			return font.width(32);
	//   60  126:aload_0         
	//   61  127:getfield        #169 <Field PdfFont font>
	//   62  130:bipush          32
	//   63  132:invokevirtual   #341 <Method float PdfFont.width(int)>
	//   64  135:freturn         
		}
		return 0.0F;
	//   65  136:fconst_0        
	//   66  137:freturn         
	}

	PdfChunk truncate(float f)
	{
		if(image != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field Image image>
	//*   2    4:ifnull          89
			if(image.getScaledWidth() > f)
	//*   3    7:aload_0         
	//*   4    8:getfield        #266 <Field Image image>
	//*   5   11:invokevirtual   #362 <Method float Image.getScaledWidth()>
	//*   6   14:fload_1         
	//*   7   15:fcmpl           
	//*   8   16:ifle            87
			{
				if(image.isScaleToFitLineWhenOverflow())
	//*   9   19:aload_0         
	//*  10   20:getfield        #266 <Field Image image>
	//*  11   23:invokevirtual   #506 <Method boolean Image.isScaleToFitLineWhenOverflow()>
	//*  12   26:ifeq            44
				{
					setImageScalePercentage(f / image.getWidth());
	//   13   29:aload_0         
	//   14   30:fload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #266 <Field Image image>
	//   17   35:invokevirtual   #509 <Method float Image.getWidth()>
	//   18   38:fdiv            
	//   19   39:invokevirtual   #511 <Method void setImageScalePercentage(float)>
					return null;
	//   20   42:aconst_null     
	//   21   43:areturn         
				} else
				{
					PdfChunk pdfchunk = new PdfChunk("", this);
	//   22   44:new             #2   <Class PdfChunk>
	//   23   47:dup             
	//   24   48:ldc1            #109 <String "">
	//   25   50:aload_0         
	//   26   51:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//   27   54:astore          7
					value = "";
	//   28   56:aload_0         
	//   29   57:ldc1            #109 <String "">
	//   30   59:putfield        #111 <Field String value>
					attributes.remove("IMAGE");
	//   31   62:aload_0         
	//   32   63:getfield        #120 <Field HashMap attributes>
	//   33   66:ldc1            #76  <String "IMAGE">
	//   34   68:invokevirtual   #281 <Method Object HashMap.remove(Object)>
	//   35   71:pop             
					image = null;
	//   36   72:aload_0         
	//   37   73:aconst_null     
	//   38   74:putfield        #266 <Field Image image>
					font = PdfFont.getDefaultFont();
	//   39   77:aload_0         
	//   40   78:invokestatic    #439 <Method PdfFont PdfFont.getDefaultFont()>
	//   41   81:putfield        #169 <Field PdfFont font>
					return pdfchunk;
	//   42   84:aload           7
	//   43   86:areturn         
				}
			} else
			{
				return null;
	//   44   87:aconst_null     
	//   45   88:areturn         
			}
		int i = 0;
	//   46   89:iconst_0        
	//   47   90:istore_3        
		float f1 = 0.0F;
	//   48   91:fconst_0        
	//   49   92:fstore_2        
		if(f < font.width())
	//*  50   93:fload_1         
	//*  51   94:aload_0         
	//*  52   95:getfield        #169 <Field PdfFont font>
	//*  53   98:invokevirtual   #513 <Method float PdfFont.width()>
	//*  54  101:fcmpg           
	//*  55  102:ifge            139
		{
			String s = value.substring(1);
	//   56  105:aload_0         
	//   57  106:getfield        #111 <Field String value>
	//   58  109:iconst_1        
	//   59  110:invokevirtual   #452 <Method String String.substring(int)>
	//   60  113:astore          7
			value = value.substring(0, 1);
	//   61  115:aload_0         
	//   62  116:aload_0         
	//   63  117:getfield        #111 <Field String value>
	//   64  120:iconst_0        
	//   65  121:iconst_1        
	//   66  122:invokevirtual   #455 <Method String String.substring(int, int)>
	//   67  125:putfield        #111 <Field String value>
			return new PdfChunk(s, this);
	//   68  128:new             #2   <Class PdfChunk>
	//   69  131:dup             
	//   70  132:aload           7
	//   71  134:aload_0         
	//   72  135:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//   73  138:areturn         
		}
		int l = value.length();
	//   74  139:aload_0         
	//   75  140:getfield        #111 <Field String value>
	//   76  143:invokevirtual   #381 <Method int String.length()>
	//   77  146:istore          5
		boolean flag = false;
	//   78  148:iconst_0        
	//   79  149:istore          6
label0:
		do
		{
label1:
			{
				if(i < l)
	//*  80  151:iload_3         
	//*  81  152:iload           5
	//*  82  154:icmpge          193
				{
					flag = Utilities.isSurrogatePair(value, i);
	//   83  157:aload_0         
	//   84  158:getfield        #111 <Field String value>
	//   85  161:iload_3         
	//   86  162:invokestatic    #516 <Method boolean Utilities.isSurrogatePair(String, int)>
	//   87  165:istore          6
					if(flag)
	//*  88  167:iload           6
	//*  89  169:ifeq            201
						f1 += getCharWidth(Utilities.convertToUtf32(value, i));
	//   90  172:fload_2         
	//   91  173:aload_0         
	//   92  174:aload_0         
	//   93  175:getfield        #111 <Field String value>
	//   94  178:iload_3         
	//   95  179:invokestatic    #518 <Method int Utilities.convertToUtf32(String, int)>
	//   96  182:invokevirtual   #459 <Method float getCharWidth(int)>
	//   97  185:fadd            
	//   98  186:fstore_2        
					else
	//*  99  187:fload_2         
	//* 100  188:fload_1         
	//* 101  189:fcmpl           
	//* 102  190:ifle            219
	//* 103  193:iload_3         
	//* 104  194:iload           5
	//* 105  196:icmpne          240
	//* 106  199:aconst_null     
	//* 107  200:areturn         
						f1 += getCharWidth(((int) (value.charAt(i))));
	//  108  201:fload_2         
	//  109  202:aload_0         
	//  110  203:aload_0         
	//  111  204:getfield        #111 <Field String value>
	//  112  207:iload_3         
	//  113  208:invokevirtual   #387 <Method char String.charAt(int)>
	//  114  211:invokevirtual   #459 <Method float getCharWidth(int)>
	//  115  214:fadd            
	//  116  215:fstore_2        
					if(f1 <= f)
						break label1;
				}
				if(i == l)
					return null;
				break label0;
			}
	//* 117  216:goto            187
			int j = i;
	//  118  219:iload_3         
	//  119  220:istore          4
			if(flag)
	//* 120  222:iload           6
	//* 121  224:ifeq            232
				j = i + 1;
	//  122  227:iload_3         
	//  123  228:iconst_1        
	//  124  229:iadd            
	//  125  230:istore          4
			i = j + 1;
	//  126  232:iload           4
	//  127  234:iconst_1        
	//  128  235:iadd            
	//  129  236:istore_3        
		} while(true);
	//  130  237:goto            151
		int k = i;
	//  131  240:iload_3         
	//  132  241:istore          4
		if(i == 0)
	//* 133  243:iload_3         
	//* 134  244:ifne            260
		{
			k = 1;
	//  135  247:iconst_1        
	//  136  248:istore          4
			if(flag)
	//* 137  250:iload           6
	//* 138  252:ifeq            260
				k = 1 + 1;
	//  139  255:iconst_1        
	//  140  256:iconst_1        
	//  141  257:iadd            
	//  142  258:istore          4
		}
		String s1 = value.substring(k);
	//  143  260:aload_0         
	//  144  261:getfield        #111 <Field String value>
	//  145  264:iload           4
	//  146  266:invokevirtual   #452 <Method String String.substring(int)>
	//  147  269:astore          7
		value = value.substring(0, k);
	//  148  271:aload_0         
	//  149  272:aload_0         
	//  150  273:getfield        #111 <Field String value>
	//  151  276:iconst_0        
	//  152  277:iload           4
	//  153  279:invokevirtual   #455 <Method String String.substring(int, int)>
	//  154  282:putfield        #111 <Field String value>
		return new PdfChunk(s1, this);
	//  155  285:new             #2   <Class PdfChunk>
	//  156  288:dup             
	//  157  289:aload           7
	//  158  291:aload_0         
	//  159  292:invokespecial   #436 <Method void PdfChunk(String, PdfChunk)>
	//  160  295:areturn         
	}

	float width()
	{
		return width(value);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #111 <Field String value>
	//    3    5:invokevirtual   #519 <Method float width(String)>
	//    4    8:freturn         
	}

	float width(String s)
	{
		float f1;
		if(isAttribute("SEPARATOR"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #86  <String "SEPARATOR">
	//*   2    3:invokevirtual   #336 <Method boolean isAttribute(String)>
	//*   3    6:ifeq            13
		{
			f1 = 0.0F;
	//    4    9:fconst_0        
	//    5   10:fstore_3        
		} else
	//*   6   11:fload_3         
	//*   7   12:freturn         
		{
			if(isImage())
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #347 <Method boolean isImage()>
	//*  10   17:ifeq            25
				return getImageWidth();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #350 <Method float getImageWidth()>
	//   13   24:freturn         
			f1 = font.width(s);
	//   14   25:aload_0         
	//   15   26:getfield        #169 <Field PdfFont font>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #378 <Method float PdfFont.width(String)>
	//   18   33:fstore_3        
			float f = f1;
	//   19   34:fload_3         
	//   20   35:fstore_2        
			if(isAttribute("CHAR_SPACING"))
	//*  21   36:aload_0         
	//*  22   37:ldc1            #92  <String "CHAR_SPACING">
	//*  23   39:invokevirtual   #336 <Method boolean isAttribute(String)>
	//*  24   42:ifeq            70
			{
				Float float1 = (Float)getAttribute("CHAR_SPACING");
	//   25   45:aload_0         
	//   26   46:ldc1            #92  <String "CHAR_SPACING">
	//   27   48:invokevirtual   #338 <Method Object getAttribute(String)>
	//   28   51:checkcast       #218 <Class Float>
	//   29   54:astore          6
				f = f1 + (float)s.length() * float1.floatValue();
	//   30   56:fload_3         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #381 <Method int String.length()>
	//   33   61:i2f             
	//   34   62:aload           6
	//   35   64:invokevirtual   #262 <Method float Float.floatValue()>
	//   36   67:fmul            
	//   37   68:fadd            
	//   38   69:fstore_2        
			}
			f1 = f;
	//   39   70:fload_2         
	//   40   71:fstore_3        
			if(isAttribute("WORD_SPACING"))
	//*  41   72:aload_0         
	//*  42   73:ldc1            #94  <String "WORD_SPACING">
	//*  43   75:invokevirtual   #336 <Method boolean isAttribute(String)>
	//*  44   78:ifeq            11
			{
				int i = 0;
	//   45   81:iconst_0        
	//   46   82:istore          4
				int j = -1;
	//   47   84:iconst_m1       
	//   48   85:istore          5
				do
				{
					j = s.indexOf(' ', j + 1);
	//   49   87:aload_1         
	//   50   88:bipush          32
	//   51   90:iload           5
	//   52   92:iconst_1        
	//   53   93:iadd            
	//   54   94:invokevirtual   #375 <Method int String.indexOf(int, int)>
	//   55   97:istore          5
					if(j >= 0)
	//*  56   99:iload           5
	//*  57  101:iflt            113
					{
						i++;
	//   58  104:iload           4
	//   59  106:iconst_1        
	//   60  107:iadd            
	//   61  108:istore          4
					} else
	//*  62  110:goto            87
					{
						s = ((String) ((Float)getAttribute("WORD_SPACING")));
	//   63  113:aload_0         
	//   64  114:ldc1            #94  <String "WORD_SPACING">
	//   65  116:invokevirtual   #338 <Method Object getAttribute(String)>
	//   66  119:checkcast       #218 <Class Float>
	//   67  122:astore_1        
						return f + (float)i * ((Float) (s)).floatValue();
	//   68  123:fload_2         
	//   69  124:iload           4
	//   70  126:i2f             
	//   71  127:aload_1         
	//   72  128:invokevirtual   #262 <Method float Float.floatValue()>
	//   73  131:fmul            
	//   74  132:fadd            
	//   75  133:freturn         
					}
				} while(true);
			}
		}
		return f1;
	}

	private static final float ITALIC_ANGLE = 0.21256F;
	private static final String TABSTOP = "TABSTOP";
	public static final float UNDERLINE_OFFSET = -0.3333333F;
	public static final float UNDERLINE_THICKNESS = 0.06666667F;
	private static final HashSet keysAttributes;
	private static final HashSet keysNoStroke;
	private static final char singleSpace[] = {
		' '
	};
	protected IAccessibleElement accessibleElement;
	protected HashMap attributes;
	protected BaseFont baseFont;
	protected boolean changeLeading;
	protected String encoding;
	protected PdfFont font;
	protected Image image;
	protected float imageScalePercentage;
	protected float leading;
	protected boolean newlineSplit;
	protected HashMap noStroke;
	protected float offsetX;
	protected float offsetY;
	protected SplitCharacter splitCharacter;
	protected String value;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        char[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:bipush          32
	//    5    7:castore         
	//    6    8:putstatic       #47  <Field char[] singleSpace>
		keysAttributes = new HashSet();
	//    7   11:new             #49  <Class HashSet>
	//    8   14:dup             
	//    9   15:invokespecial   #52  <Method void HashSet()>
	//   10   18:putstatic       #54  <Field HashSet keysAttributes>
		keysNoStroke = new HashSet();
	//   11   21:new             #49  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #52  <Method void HashSet()>
	//   14   28:putstatic       #56  <Field HashSet keysNoStroke>
		keysAttributes.add("ACTION");
	//   15   31:getstatic       #54  <Field HashSet keysAttributes>
	//   16   34:ldc1            #58  <String "ACTION">
	//   17   36:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   18   39:pop             
		keysAttributes.add("UNDERLINE");
	//   19   40:getstatic       #54  <Field HashSet keysAttributes>
	//   20   43:ldc1            #64  <String "UNDERLINE">
	//   21   45:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   22   48:pop             
		keysAttributes.add("REMOTEGOTO");
	//   23   49:getstatic       #54  <Field HashSet keysAttributes>
	//   24   52:ldc1            #66  <String "REMOTEGOTO">
	//   25   54:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   26   57:pop             
		keysAttributes.add("LOCALGOTO");
	//   27   58:getstatic       #54  <Field HashSet keysAttributes>
	//   28   61:ldc1            #68  <String "LOCALGOTO">
	//   29   63:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   30   66:pop             
		keysAttributes.add("LOCALDESTINATION");
	//   31   67:getstatic       #54  <Field HashSet keysAttributes>
	//   32   70:ldc1            #70  <String "LOCALDESTINATION">
	//   33   72:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   34   75:pop             
		keysAttributes.add("GENERICTAG");
	//   35   76:getstatic       #54  <Field HashSet keysAttributes>
	//   36   79:ldc1            #72  <String "GENERICTAG">
	//   37   81:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   38   84:pop             
		keysAttributes.add("NEWPAGE");
	//   39   85:getstatic       #54  <Field HashSet keysAttributes>
	//   40   88:ldc1            #74  <String "NEWPAGE">
	//   41   90:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   42   93:pop             
		keysAttributes.add("IMAGE");
	//   43   94:getstatic       #54  <Field HashSet keysAttributes>
	//   44   97:ldc1            #76  <String "IMAGE">
	//   45   99:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   46  102:pop             
		keysAttributes.add("BACKGROUND");
	//   47  103:getstatic       #54  <Field HashSet keysAttributes>
	//   48  106:ldc1            #78  <String "BACKGROUND">
	//   49  108:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   50  111:pop             
		keysAttributes.add("PDFANNOTATION");
	//   51  112:getstatic       #54  <Field HashSet keysAttributes>
	//   52  115:ldc1            #80  <String "PDFANNOTATION">
	//   53  117:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   54  120:pop             
		keysAttributes.add("SKEW");
	//   55  121:getstatic       #54  <Field HashSet keysAttributes>
	//   56  124:ldc1            #82  <String "SKEW">
	//   57  126:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   58  129:pop             
		keysAttributes.add("HSCALE");
	//   59  130:getstatic       #54  <Field HashSet keysAttributes>
	//   60  133:ldc1            #84  <String "HSCALE">
	//   61  135:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   62  138:pop             
		keysAttributes.add("SEPARATOR");
	//   63  139:getstatic       #54  <Field HashSet keysAttributes>
	//   64  142:ldc1            #86  <String "SEPARATOR">
	//   65  144:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   66  147:pop             
		keysAttributes.add("TAB");
	//   67  148:getstatic       #54  <Field HashSet keysAttributes>
	//   68  151:ldc1            #88  <String "TAB">
	//   69  153:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   70  156:pop             
		keysAttributes.add("TABSETTINGS");
	//   71  157:getstatic       #54  <Field HashSet keysAttributes>
	//   72  160:ldc1            #90  <String "TABSETTINGS">
	//   73  162:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   74  165:pop             
		keysAttributes.add("CHAR_SPACING");
	//   75  166:getstatic       #54  <Field HashSet keysAttributes>
	//   76  169:ldc1            #92  <String "CHAR_SPACING">
	//   77  171:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   78  174:pop             
		keysAttributes.add("WORD_SPACING");
	//   79  175:getstatic       #54  <Field HashSet keysAttributes>
	//   80  178:ldc1            #94  <String "WORD_SPACING">
	//   81  180:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   82  183:pop             
		keysAttributes.add("LINEHEIGHT");
	//   83  184:getstatic       #54  <Field HashSet keysAttributes>
	//   84  187:ldc1            #96  <String "LINEHEIGHT">
	//   85  189:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   86  192:pop             
		keysNoStroke.add("SUBSUPSCRIPT");
	//   87  193:getstatic       #56  <Field HashSet keysNoStroke>
	//   88  196:ldc1            #98  <String "SUBSUPSCRIPT">
	//   89  198:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   90  201:pop             
		keysNoStroke.add("SPLITCHARACTER");
	//   91  202:getstatic       #56  <Field HashSet keysNoStroke>
	//   92  205:ldc1            #100 <String "SPLITCHARACTER">
	//   93  207:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   94  210:pop             
		keysNoStroke.add("HYPHENATION");
	//   95  211:getstatic       #56  <Field HashSet keysNoStroke>
	//   96  214:ldc1            #102 <String "HYPHENATION">
	//   97  216:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//   98  219:pop             
		keysNoStroke.add("TEXTRENDERMODE");
	//   99  220:getstatic       #56  <Field HashSet keysNoStroke>
	//  100  223:ldc1            #104 <String "TEXTRENDERMODE">
	//  101  225:invokevirtual   #62  <Method boolean HashSet.add(Object)>
	//  102  228:pop             
	//* 103  229:return          
	}
}
