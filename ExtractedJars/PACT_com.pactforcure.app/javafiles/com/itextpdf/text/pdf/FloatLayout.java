// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.api.Spaceable;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			ColumnText, PdfDiv, PdfContentByte, PdfDocument, 
//			PdfPTable

public class FloatLayout
{

	public FloatLayout(List list, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ColumnText>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #30  <Method void ColumnText(PdfContentByte)>
	//    7   13:putfield        #32  <Field ColumnText compositeColumn>
		compositeColumn.setUseAscender(flag);
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field ColumnText compositeColumn>
	//   10   20:iload_2         
	//   11   21:invokevirtual   #36  <Method void ColumnText.setUseAscender(boolean)>
		useAscender = flag;
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:putfield        #38  <Field boolean useAscender>
		content = list;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #40  <Field List content>
	//   18   34:return          
	}

	private int floatingLayout(List list, boolean flag)
		throws DocumentException
	{
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		byte byte0;
		int i;
		int j;
		ColumnText columntext;
		Element element;
		Object obj;
		j = 1;
	//    0    0:iconst_1        
	//    1    1:istore          11
		f2 = yLine;
	//    2    3:aload_0         
	//    3    4:getfield        #49  <Field float yLine>
	//    4    7:fstore          5
		f = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_3        
		f1 = 0.0F;
	//    7   11:fconst_0        
	//    8   12:fstore          4
		columntext = compositeColumn;
	//    9   14:aload_0         
	//   10   15:getfield        #32  <Field ColumnText compositeColumn>
	//   11   18:astore          12
		if(flag)
	//*  12   20:iload_2         
	//*  13   21:ifeq            33
			columntext = ColumnText.duplicate(compositeColumn);
	//   14   24:aload_0         
	//   15   25:getfield        #32  <Field ColumnText compositeColumn>
	//   16   28:invokestatic    #53  <Method ColumnText ColumnText.duplicate(ColumnText)>
	//   17   31:astore          12
		if(maxY == yLine)
	//*  18   33:aload_0         
	//*  19   34:getfield        #55  <Field float maxY>
	//*  20   37:aload_0         
	//*  21   38:getfield        #49  <Field float yLine>
	//*  22   41:fcmpl           
	//*  23   42:ifne            297
			byte0 = 1;
	//   24   45:iconst_1        
	//   25   46:istore          9
		else
	//*  26   48:fload_3         
	//*  27   49:fstore          6
	//*  28   51:fload           5
	//*  29   53:fstore          7
	//*  30   55:fload           4
	//*  31   57:fstore          8
	//*  32   59:iload           11
	//*  33   61:istore          10
	//*  34   63:aload_1         
	//*  35   64:invokeinterface #61  <Method boolean List.isEmpty()>
	//*  36   69:ifne            245
	//*  37   72:aload_1         
	//*  38   73:iconst_0        
	//*  39   74:invokeinterface #65  <Method Object List.get(int)>
	//*  40   79:checkcast       #67  <Class Element>
	//*  41   82:astore          13
	//*  42   84:aload_1         
	//*  43   85:iconst_0        
	//*  44   86:invokeinterface #70  <Method Object List.remove(int)>
	//*  45   91:pop             
	//*  46   92:aload           13
	//*  47   94:instanceof      #72  <Class PdfDiv>
	//*  48   97:ifeq            625
	//*  49  100:aload           13
	//*  50  102:checkcast       #72  <Class PdfDiv>
	//*  51  105:astore          14
	//*  52  107:aload           14
	//*  53  109:aload_0         
	//*  54  110:getfield        #32  <Field ColumnText compositeColumn>
	//*  55  113:invokevirtual   #76  <Method PdfContentByte ColumnText.getCanvas()>
	//*  56  116:aload_0         
	//*  57  117:getfield        #38  <Field boolean useAscender>
	//*  58  120:iconst_1        
	//*  59  121:aload_0         
	//*  60  122:getfield        #78  <Field float floatLeftX>
	//*  61  125:aload_0         
	//*  62  126:getfield        #80  <Field float minY>
	//*  63  129:aload_0         
	//*  64  130:getfield        #82  <Field float floatRightX>
	//*  65  133:aload_0         
	//*  66  134:getfield        #49  <Field float yLine>
	//*  67  137:invokevirtual   #86  <Method int PdfDiv.layout(PdfContentByte, boolean, boolean, float, float, float, float)>
	//*  68  140:istore          11
	//*  69  142:iload           11
	//*  70  144:istore          10
	//*  71  146:iload           11
	//*  72  148:iconst_1        
	//*  73  149:iand            
	//*  74  150:ifne            303
	//*  75  153:aload_0         
	//*  76  154:fload           5
	//*  77  156:putfield        #49  <Field float yLine>
	//*  78  159:aload_0         
	//*  79  160:aload_0         
	//*  80  161:getfield        #88  <Field float leftX>
	//*  81  164:putfield        #78  <Field float floatLeftX>
	//*  82  167:aload_0         
	//*  83  168:aload_0         
	//*  84  169:getfield        #90  <Field float rightX>
	//*  85  172:putfield        #82  <Field float floatRightX>
	//*  86  175:aload           14
	//*  87  177:aload_0         
	//*  88  178:getfield        #32  <Field ColumnText compositeColumn>
	//*  89  181:invokevirtual   #76  <Method PdfContentByte ColumnText.getCanvas()>
	//*  90  184:aload_0         
	//*  91  185:getfield        #38  <Field boolean useAscender>
	//*  92  188:iconst_1        
	//*  93  189:aload_0         
	//*  94  190:getfield        #78  <Field float floatLeftX>
	//*  95  193:aload_0         
	//*  96  194:getfield        #80  <Field float minY>
	//*  97  197:aload_0         
	//*  98  198:getfield        #82  <Field float floatRightX>
	//*  99  201:aload_0         
	//* 100  202:getfield        #49  <Field float yLine>
	//* 101  205:invokevirtual   #86  <Method int PdfDiv.layout(PdfContentByte, boolean, boolean, float, float, float, float)>
	//* 102  208:istore          11
	//* 103  210:iload           11
	//* 104  212:istore          10
	//* 105  214:iload           11
	//* 106  216:iconst_1        
	//* 107  217:iand            
	//* 108  218:ifne            303
	//* 109  221:aload_1         
	//* 110  222:iconst_0        
	//* 111  223:aload           14
	//* 112  225:invokeinterface #94  <Method void List.add(int, Object)>
	//* 113  230:iload           11
	//* 114  232:istore          10
	//* 115  234:fload           4
	//* 116  236:fstore          8
	//* 117  238:fload           5
	//* 118  240:fstore          7
	//* 119  242:fload_3         
	//* 120  243:fstore          6
	//* 121  245:fload           6
	//* 122  247:fconst_0        
	//* 123  248:fcmpl           
	//* 124  249:ifeq            1518
	//* 125  252:fload           8
	//* 126  254:fconst_0        
	//* 127  255:fcmpl           
	//* 128  256:ifeq            1518
	//* 129  259:aload_0         
	//* 130  260:aload_0         
	//* 131  261:getfield        #90  <Field float rightX>
	//* 132  264:aload_0         
	//* 133  265:getfield        #88  <Field float leftX>
	//* 134  268:fsub            
	//* 135  269:putfield        #96  <Field float filledWidth>
	//* 136  272:aload_0         
	//* 137  273:fload           7
	//* 138  275:putfield        #49  <Field float yLine>
	//* 139  278:aload_0         
	//* 140  279:aload_0         
	//* 141  280:getfield        #88  <Field float leftX>
	//* 142  283:putfield        #78  <Field float floatLeftX>
	//* 143  286:aload_0         
	//* 144  287:aload_0         
	//* 145  288:getfield        #90  <Field float rightX>
	//* 146  291:putfield        #82  <Field float floatRightX>
	//* 147  294:iload           10
	//* 148  296:ireturn         
			byte0 = 0;
	//  149  297:iconst_0        
	//  150  298:istore          9
_L10:
		f3 = f;
		f4 = f2;
		f5 = f1;
		i = j;
		if(list.isEmpty()) goto _L2; else goto _L1
_L1:
		element = (Element)list.get(0);
		list.remove(0);
		if(!(element instanceof PdfDiv)) goto _L4; else goto _L3
_L3:
		obj = ((Object) ((PdfDiv)element));
		j = ((PdfDiv) (obj)).layout(compositeColumn.getCanvas(), useAscender, true, floatLeftX, minY, floatRightX, yLine);
		i = j;
		if((j & 1) != 0) goto _L6; else goto _L5
_L5:
		yLine = f2;
		floatLeftX = leftX;
		floatRightX = rightX;
		j = ((PdfDiv) (obj)).layout(compositeColumn.getCanvas(), useAscender, true, floatLeftX, minY, floatRightX, yLine);
		i = j;
		if((j & 1) != 0) goto _L6; else goto _L7
_L7:
		list.add(0, obj);
		i = j;
		f5 = f1;
		f4 = f2;
		f3 = f;
_L2:
		Object obj1;
		PdfWriter pdfwriter;
		PdfDocument pdfdocument;
		if(f3 != 0.0F && f5 != 0.0F)
		{
			filledWidth = rightX - leftX;
		} else
	//* 151  300:goto            48
	//* 152  303:aload           14
	//* 153  305:invokevirtual   #100 <Method PdfDiv$FloatType PdfDiv.getFloatType()>
	//* 154  308:getstatic       #106 <Field PdfDiv$FloatType PdfDiv$FloatType.LEFT>
	//* 155  311:if_acmpne       533
	//* 156  314:aload           14
	//* 157  316:aload_0         
	//* 158  317:getfield        #32  <Field ColumnText compositeColumn>
	//* 159  320:invokevirtual   #76  <Method PdfContentByte ColumnText.getCanvas()>
	//* 160  323:aload_0         
	//* 161  324:getfield        #38  <Field boolean useAscender>
	//* 162  327:iload_2         
	//* 163  328:aload_0         
	//* 164  329:getfield        #78  <Field float floatLeftX>
	//* 165  332:aload_0         
	//* 166  333:getfield        #80  <Field float minY>
	//* 167  336:aload_0         
	//* 168  337:getfield        #82  <Field float floatRightX>
	//* 169  340:aload_0         
	//* 170  341:getfield        #49  <Field float yLine>
	//* 171  344:invokevirtual   #86  <Method int PdfDiv.layout(PdfContentByte, boolean, boolean, float, float, float, float)>
	//* 172  347:istore          10
	//* 173  349:aload_0         
	//* 174  350:aload_0         
	//* 175  351:getfield        #78  <Field float floatLeftX>
	//* 176  354:aload           14
	//* 177  356:invokevirtual   #110 <Method float PdfDiv.getActualWidth()>
	//* 178  359:fadd            
	//* 179  360:putfield        #78  <Field float floatLeftX>
	//* 180  363:fload_3         
	//* 181  364:aload           14
	//* 182  366:invokevirtual   #110 <Method float PdfDiv.getActualWidth()>
	//* 183  369:fadd            
	//* 184  370:fstore          6
	//* 185  372:fload           4
	//* 186  374:fstore          8
	//* 187  376:fload           5
	//* 188  378:aload_0         
	//* 189  379:getfield        #49  <Field float yLine>
	//* 190  382:aload           14
	//* 191  384:invokevirtual   #113 <Method float PdfDiv.getActualHeight()>
	//* 192  387:fsub            
	//* 193  388:invokestatic    #119 <Method float Math.min(float, float)>
	//* 194  391:fstore          7
	//* 195  393:aload           13
	//* 196  395:instanceof      #121 <Class Paragraph>
	//* 197  398:ifeq            1340
	//* 198  401:aload           13
	//* 199  403:checkcast       #121 <Class Paragraph>
	//* 200  406:invokevirtual   #125 <Method Iterator Paragraph.iterator()>
	//* 201  409:astore          14
	//* 202  411:aload           14
	//* 203  413:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//* 204  418:ifeq            1340
	//* 205  421:aload           14
	//* 206  423:invokeinterface #134 <Method Object Iterator.next()>
	//* 207  428:checkcast       #67  <Class Element>
	//* 208  431:astore          15
	//* 209  433:aload           15
	//* 210  435:instanceof      #136 <Class WritableDirectElement>
	//* 211  438:ifeq            411
	//* 212  441:aload           15
	//* 213  443:checkcast       #136 <Class WritableDirectElement>
	//* 214  446:astore          15
	//* 215  448:aload           15
	//* 216  450:invokevirtual   #140 <Method int WritableDirectElement.getDirectElementType()>
	//* 217  453:iconst_1        
	//* 218  454:icmpne          411
	//* 219  457:iload_2         
	//* 220  458:ifne            411
	//* 221  461:aload_0         
	//* 222  462:getfield        #32  <Field ColumnText compositeColumn>
	//* 223  465:invokevirtual   #76  <Method PdfContentByte ColumnText.getCanvas()>
	//* 224  468:invokevirtual   #146 <Method PdfWriter PdfContentByte.getPdfWriter()>
	//* 225  471:astore          16
	//* 226  473:aload_0         
	//* 227  474:getfield        #32  <Field ColumnText compositeColumn>
	//* 228  477:invokevirtual   #76  <Method PdfContentByte ColumnText.getCanvas()>
	//* 229  480:invokevirtual   #150 <Method PdfDocument PdfContentByte.getPdfDocument()>
	//* 230  483:astore          17
	//* 231  485:aload           17
	//* 232  487:getfield        #155 <Field float PdfDocument.currentHeight>
	//* 233  490:fstore_3        
	//* 234  491:aload           17
	//* 235  493:aload           17
	//* 236  495:invokevirtual   #158 <Method float PdfDocument.top()>
	//* 237  498:aload_0         
	//* 238  499:getfield        #49  <Field float yLine>
	//* 239  502:fsub            
	//* 240  503:aload           17
	//* 241  505:getfield        #162 <Field PdfDocument$Indentation PdfDocument.indentation>
	//* 242  508:getfield        #167 <Field float PdfDocument$Indentation.indentTop>
	//* 243  511:fsub            
	//* 244  512:putfield        #155 <Field float PdfDocument.currentHeight>
	//* 245  515:aload           15
	//* 246  517:aload           16
	//* 247  519:aload           17
	//* 248  521:invokevirtual   #171 <Method void WritableDirectElement.write(PdfWriter, com.itextpdf.text.Document)>
	//* 249  524:aload           17
	//* 250  526:fload_3         
	//* 251  527:putfield        #155 <Field float PdfDocument.currentHeight>
	//* 252  530:goto            411
	//* 253  533:fload_3         
	//* 254  534:fstore          6
	//* 255  536:fload           4
	//* 256  538:fstore          8
	//* 257  540:aload           14
	//* 258  542:invokevirtual   #100 <Method PdfDiv$FloatType PdfDiv.getFloatType()>
	//* 259  545:getstatic       #174 <Field PdfDiv$FloatType PdfDiv$FloatType.RIGHT>
	//* 260  548:if_acmpne       376
	//* 261  551:aload           14
	//* 262  553:aload_0         
	//* 263  554:getfield        #32  <Field ColumnText compositeColumn>
	//* 264  557:invokevirtual   #76  <Method PdfContentByte ColumnText.getCanvas()>
	//* 265  560:aload_0         
	//* 266  561:getfield        #38  <Field boolean useAscender>
	//* 267  564:iload_2         
	//* 268  565:aload_0         
	//* 269  566:getfield        #82  <Field float floatRightX>
	//* 270  569:aload           14
	//* 271  571:invokevirtual   #110 <Method float PdfDiv.getActualWidth()>
	//* 272  574:fsub            
	//* 273  575:ldc1            #175 <Float 0.01F>
	//* 274  577:fsub            
	//* 275  578:aload_0         
	//* 276  579:getfield        #80  <Field float minY>
	//* 277  582:aload_0         
	//* 278  583:getfield        #82  <Field float floatRightX>
	//* 279  586:aload_0         
	//* 280  587:getfield        #49  <Field float yLine>
	//* 281  590:invokevirtual   #86  <Method int PdfDiv.layout(PdfContentByte, boolean, boolean, float, float, float, float)>
	//* 282  593:istore          10
	//* 283  595:aload_0         
	//* 284  596:aload_0         
	//* 285  597:getfield        #82  <Field float floatRightX>
	//* 286  600:aload           14
	//* 287  602:invokevirtual   #110 <Method float PdfDiv.getActualWidth()>
	//* 288  605:fsub            
	//* 289  606:putfield        #82  <Field float floatRightX>
	//* 290  609:fload           4
	//* 291  611:aload           14
	//* 292  613:invokevirtual   #110 <Method float PdfDiv.getActualWidth()>
	//* 293  616:fadd            
	//* 294  617:fstore          8
	//* 295  619:fload_3         
	//* 296  620:fstore          6
	//* 297  622:goto            376
	//* 298  625:aload_0         
	//* 299  626:getfield        #80  <Field float minY>
	//* 300  629:fload           5
	//* 301  631:fcmpl           
	//* 302  632:ifle            691
	//* 303  635:iconst_2        
	//* 304  636:istore          9
	//* 305  638:aload_1         
	//* 306  639:iconst_0        
	//* 307  640:aload           13
	//* 308  642:invokeinterface #94  <Method void List.add(int, Object)>
	//* 309  647:fload_3         
	//* 310  648:fstore          6
	//* 311  650:fload           5
	//* 312  652:fstore          7
	//* 313  654:fload           4
	//* 314  656:fstore          8
	//* 315  658:iload           9
	//* 316  660:istore          10
	//* 317  662:aload           12
	//* 318  664:ifnull          245
	//* 319  667:aload           12
	//* 320  669:aconst_null     
	//* 321  670:invokevirtual   #179 <Method void ColumnText.setText(com.itextpdf.text.Phrase)>
	//* 322  673:fload_3         
	//* 323  674:fstore          6
	//* 324  676:fload           5
	//* 325  678:fstore          7
	//* 326  680:fload           4
	//* 327  682:fstore          8
	//* 328  684:iload           9
	//* 329  686:istore          10
	//* 330  688:goto            245
	//* 331  691:aload           13
	//* 332  693:instanceof      #181 <Class Spaceable>
	//* 333  696:ifeq            746
	//* 334  699:iload           9
	//* 335  701:ifeq            727
	//* 336  704:aload           12
	//* 337  706:invokevirtual   #184 <Method boolean ColumnText.isIgnoreSpacingBefore()>
	//* 338  709:ifeq            727
	//* 339  712:aload           13
	//* 340  714:checkcast       #181 <Class Spaceable>
	//* 341  717:invokeinterface #187 <Method float Spaceable.getPaddingTop()>
	//* 342  722:fconst_0        
	//* 343  723:fcmpl           
	//* 344  724:ifeq            746
	//* 345  727:aload_0         
	//* 346  728:aload_0         
	//* 347  729:getfield        #49  <Field float yLine>
	//* 348  732:aload           13
	//* 349  734:checkcast       #181 <Class Spaceable>
	//* 350  737:invokeinterface #190 <Method float Spaceable.getSpacingBefore()>
	//* 351  742:fsub            
	//* 352  743:putfield        #49  <Field float yLine>
	//* 353  746:iload_2         
	//* 354  747:ifeq            1100
	//* 355  750:aload           13
	//* 356  752:instanceof      #192 <Class PdfPTable>
	//* 357  755:ifeq            1090
	//* 358  758:aload           12
	//* 359  760:new             #192 <Class PdfPTable>
	//* 360  763:dup             
	//* 361  764:aload           13
	//* 362  766:checkcast       #192 <Class PdfPTable>
	//* 363  769:invokespecial   #195 <Method void PdfPTable(PdfPTable)>
	//* 364  772:invokevirtual   #199 <Method void ColumnText.addElement(Element)>
	//* 365  775:aload_0         
	//* 366  776:getfield        #49  <Field float yLine>
	//* 367  779:fload           5
	//* 368  781:fcmpl           
	//* 369  782:ifle            1110
	//* 370  785:aload           12
	//* 371  787:aload_0         
	//* 372  788:getfield        #78  <Field float floatLeftX>
	//* 373  791:aload_0         
	//* 374  792:getfield        #49  <Field float yLine>
	//* 375  795:aload_0         
	//* 376  796:getfield        #82  <Field float floatRightX>
	//* 377  799:fload           5
	//* 378  801:invokevirtual   #203 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//* 379  804:aload           12
	//* 380  806:fconst_0        
	//* 381  807:invokevirtual   #207 <Method void ColumnText.setFilledWidth(float)>
	//* 382  810:aload           12
	//* 383  812:iload_2         
	//* 384  813:invokevirtual   #211 <Method int ColumnText.go(boolean)>
	//* 385  816:istore          10
	//* 386  818:aload_0         
	//* 387  819:getfield        #49  <Field float yLine>
	//* 388  822:fload           5
	//* 389  824:fcmpl           
	//* 390  825:ifle            1167
	//* 391  828:aload_0         
	//* 392  829:getfield        #78  <Field float floatLeftX>
	//* 393  832:aload_0         
	//* 394  833:getfield        #88  <Field float leftX>
	//* 395  836:fcmpl           
	//* 396  837:ifgt            852
	//* 397  840:aload_0         
	//* 398  841:getfield        #82  <Field float floatRightX>
	//* 399  844:aload_0         
	//* 400  845:getfield        #90  <Field float rightX>
	//* 401  848:fcmpg           
	//* 402  849:ifge            1167
	//* 403  852:iload           10
	//* 404  854:iconst_1        
	//* 405  855:iand            
	//* 406  856:ifne            1167
	//* 407  859:aload_0         
	//* 408  860:fload           5
	//* 409  862:putfield        #49  <Field float yLine>
	//* 410  865:aload_0         
	//* 411  866:aload_0         
	//* 412  867:getfield        #88  <Field float leftX>
	//* 413  870:putfield        #78  <Field float floatLeftX>
	//* 414  873:aload_0         
	//* 415  874:aload_0         
	//* 416  875:getfield        #90  <Field float rightX>
	//* 417  878:putfield        #82  <Field float floatRightX>
	//* 418  881:fload_3         
	//* 419  882:fconst_0        
	//* 420  883:fcmpl           
	//* 421  884:ifeq            1134
	//* 422  887:fload           4
	//* 423  889:fconst_0        
	//* 424  890:fcmpl           
	//* 425  891:ifeq            1134
	//* 426  894:aload_0         
	//* 427  895:aload_0         
	//* 428  896:getfield        #90  <Field float rightX>
	//* 429  899:aload_0         
	//* 430  900:getfield        #88  <Field float leftX>
	//* 431  903:fsub            
	//* 432  904:putfield        #96  <Field float filledWidth>
	//* 433  907:fconst_0        
	//* 434  908:fstore          6
	//* 435  910:fconst_0        
	//* 436  911:fstore          7
	//* 437  913:iload_2         
	//* 438  914:ifeq            942
	//* 439  917:aload           13
	//* 440  919:instanceof      #192 <Class PdfPTable>
	//* 441  922:ifeq            942
	//* 442  925:aload           12
	//* 443  927:new             #192 <Class PdfPTable>
	//* 444  930:dup             
	//* 445  931:aload           13
	//* 446  933:checkcast       #192 <Class PdfPTable>
	//* 447  936:invokespecial   #195 <Method void PdfPTable(PdfPTable)>
	//* 448  939:invokevirtual   #199 <Method void ColumnText.addElement(Element)>
	//* 449  942:aload           12
	//* 450  944:aload_0         
	//* 451  945:getfield        #78  <Field float floatLeftX>
	//* 452  948:aload_0         
	//* 453  949:getfield        #49  <Field float yLine>
	//* 454  952:aload_0         
	//* 455  953:getfield        #82  <Field float floatRightX>
	//* 456  956:aload_0         
	//* 457  957:getfield        #80  <Field float minY>
	//* 458  960:invokevirtual   #203 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//* 459  963:aload           12
	//* 460  965:iload_2         
	//* 461  966:invokevirtual   #211 <Method int ColumnText.go(boolean)>
	//* 462  969:istore          11
	//* 463  971:aload           12
	//* 464  973:invokevirtual   #214 <Method float ColumnText.getYLine()>
	//* 465  976:aload           12
	//* 466  978:invokevirtual   #217 <Method float ColumnText.getDescender()>
	//* 467  981:fadd            
	//* 468  982:fstore          8
	//* 469  984:aload_0         
	//* 470  985:fload           8
	//* 471  987:putfield        #49  <Field float yLine>
	//* 472  990:fload           6
	//* 473  992:fstore          5
	//* 474  994:fload           8
	//* 475  996:fstore          4
	//* 476  998:fload           7
	//* 477 1000:fstore_3        
	//* 478 1001:iload           11
	//* 479 1003:istore          10
	//* 480 1005:aload           12
	//* 481 1007:invokevirtual   #220 <Method float ColumnText.getFilledWidth()>
	//* 482 1010:aload_0         
	//* 483 1011:getfield        #96  <Field float filledWidth>
	//* 484 1014:fcmpl           
	//* 485 1015:ifle            1042
	//* 486 1018:aload_0         
	//* 487 1019:aload           12
	//* 488 1021:invokevirtual   #220 <Method float ColumnText.getFilledWidth()>
	//* 489 1024:putfield        #96  <Field float filledWidth>
	//* 490 1027:iload           11
	//* 491 1029:istore          10
	//* 492 1031:fload           7
	//* 493 1033:fstore_3        
	//* 494 1034:fload           8
	//* 495 1036:fstore          4
	//* 496 1038:fload           6
	//* 497 1040:fstore          5
	//* 498 1042:iload           10
	//* 499 1044:iconst_1        
	//* 500 1045:iand            
	//* 501 1046:ifne            1320
	//* 502 1049:iload_2         
	//* 503 1050:ifne            1291
	//* 504 1053:aload_1         
	//* 505 1054:iconst_0        
	//* 506 1055:aload           12
	//* 507 1057:invokevirtual   #224 <Method List ColumnText.getCompositeElements()>
	//* 508 1060:invokeinterface #228 <Method boolean List.addAll(int, java.util.Collection)>
	//* 509 1065:pop             
	//* 510 1066:aload           12
	//* 511 1068:invokevirtual   #224 <Method List ColumnText.getCompositeElements()>
	//* 512 1071:invokeinterface #231 <Method void List.clear()>
	//* 513 1076:fload           5
	//* 514 1078:fstore          6
	//* 515 1080:fload           4
	//* 516 1082:fstore          7
	//* 517 1084:fload_3         
	//* 518 1085:fstore          8
	//* 519 1087:goto            245
	//* 520 1090:aload           12
	//* 521 1092:aload           13
	//* 522 1094:invokevirtual   #199 <Method void ColumnText.addElement(Element)>
	//* 523 1097:goto            775
	//* 524 1100:aload           12
	//* 525 1102:aload           13
	//* 526 1104:invokevirtual   #199 <Method void ColumnText.addElement(Element)>
	//* 527 1107:goto            775
	//* 528 1110:aload           12
	//* 529 1112:aload_0         
	//* 530 1113:getfield        #78  <Field float floatLeftX>
	//* 531 1116:aload_0         
	//* 532 1117:getfield        #49  <Field float yLine>
	//* 533 1120:aload_0         
	//* 534 1121:getfield        #82  <Field float floatRightX>
	//* 535 1124:aload_0         
	//* 536 1125:getfield        #80  <Field float minY>
	//* 537 1128:invokevirtual   #203 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//* 538 1131:goto            804
	//* 539 1134:fload_3         
	//* 540 1135:aload_0         
	//* 541 1136:getfield        #96  <Field float filledWidth>
	//* 542 1139:fcmpl           
	//* 543 1140:ifle            1148
	//* 544 1143:aload_0         
	//* 545 1144:fload_3         
	//* 546 1145:putfield        #96  <Field float filledWidth>
	//* 547 1148:fload           4
	//* 548 1150:aload_0         
	//* 549 1151:getfield        #96  <Field float filledWidth>
	//* 550 1154:fcmpl           
	//* 551 1155:ifle            907
	//* 552 1158:aload_0         
	//* 553 1159:fload           4
	//* 554 1161:putfield        #96  <Field float filledWidth>
	//* 555 1164:goto            907
	//* 556 1167:fload           4
	//* 557 1169:fconst_0        
	//* 558 1170:fcmpl           
	//* 559 1171:ifle            1230
	//* 560 1174:fload           4
	//* 561 1176:aload           12
	//* 562 1178:invokevirtual   #220 <Method float ColumnText.getFilledWidth()>
	//* 563 1181:fadd            
	//* 564 1182:fstore          6
	//* 565 1184:fload_3         
	//* 566 1185:fstore          7
	//* 567 1187:aload           12
	//* 568 1189:invokevirtual   #214 <Method float ColumnText.getYLine()>
	//* 569 1192:aload           12
	//* 570 1194:invokevirtual   #217 <Method float ColumnText.getDescender()>
	//* 571 1197:fadd            
	//* 572 1198:fload           5
	//* 573 1200:invokestatic    #119 <Method float Math.min(float, float)>
	//* 574 1203:fstore          4
	//* 575 1205:aload_0         
	//* 576 1206:aload           12
	//* 577 1208:invokevirtual   #214 <Method float ColumnText.getYLine()>
	//* 578 1211:aload           12
	//* 579 1213:invokevirtual   #217 <Method float ColumnText.getDescender()>
	//* 580 1216:fadd            
	//* 581 1217:putfield        #49  <Field float yLine>
	//* 582 1220:fload           7
	//* 583 1222:fstore          5
	//* 584 1224:fload           6
	//* 585 1226:fstore_3        
	//* 586 1227:goto            1042
	//* 587 1230:fload_3         
	//* 588 1231:fconst_0        
	//* 589 1232:fcmpl           
	//* 590 1233:ifle            1252
	//* 591 1236:fload_3         
	//* 592 1237:aload           12
	//* 593 1239:invokevirtual   #220 <Method float ColumnText.getFilledWidth()>
	//* 594 1242:fadd            
	//* 595 1243:fstore          7
	//* 596 1245:fload           4
	//* 597 1247:fstore          6
	//* 598 1249:goto            1187
	//* 599 1252:fload_3         
	//* 600 1253:fstore          7
	//* 601 1255:fload           4
	//* 602 1257:fstore          6
	//* 603 1259:aload           12
	//* 604 1261:invokevirtual   #220 <Method float ColumnText.getFilledWidth()>
	//* 605 1264:aload_0         
	//* 606 1265:getfield        #96  <Field float filledWidth>
	//* 607 1268:fcmpl           
	//* 608 1269:ifle            1187
	//* 609 1272:aload_0         
	//* 610 1273:aload           12
	//* 611 1275:invokevirtual   #220 <Method float ColumnText.getFilledWidth()>
	//* 612 1278:putfield        #96  <Field float filledWidth>
	//* 613 1281:fload_3         
	//* 614 1282:fstore          7
	//* 615 1284:fload           4
	//* 616 1286:fstore          6
	//* 617 1288:goto            1187
	//* 618 1291:aload_1         
	//* 619 1292:iconst_0        
	//* 620 1293:aload           13
	//* 621 1295:invokeinterface #94  <Method void List.add(int, Object)>
	//* 622 1300:aload           12
	//* 623 1302:aconst_null     
	//* 624 1303:invokevirtual   #179 <Method void ColumnText.setText(com.itextpdf.text.Phrase)>
	//* 625 1306:fload           5
	//* 626 1308:fstore          6
	//* 627 1310:fload           4
	//* 628 1312:fstore          7
	//* 629 1314:fload_3         
	//* 630 1315:fstore          8
	//* 631 1317:goto            245
	//* 632 1320:aload           12
	//* 633 1322:aconst_null     
	//* 634 1323:invokevirtual   #179 <Method void ColumnText.setText(com.itextpdf.text.Phrase)>
	//* 635 1326:fload           5
	//* 636 1328:fstore          6
	//* 637 1330:fload           4
	//* 638 1332:fstore          7
	//* 639 1334:fload_3         
	//* 640 1335:fstore          8
	//* 641 1337:goto            393
	//* 642 1340:iload           9
	//* 643 1342:ifeq            1497
	//* 644 1345:aload           13
	//* 645 1347:invokeinterface #234 <Method List Element.getChunks()>
	//* 646 1352:invokeinterface #237 <Method int List.size()>
	//* 647 1357:ifne            1497
	//* 648 1360:aload           13
	//* 649 1362:instanceof      #121 <Class Paragraph>
	//* 650 1365:ifeq            1453
	//* 651 1368:aload           13
	//* 652 1370:checkcast       #121 <Class Paragraph>
	//* 653 1373:iconst_0        
	//* 654 1374:invokevirtual   #238 <Method Object Paragraph.get(int)>
	//* 655 1377:checkcast       #67  <Class Element>
	//* 656 1380:astore          13
	//* 657 1382:fload           6
	//* 658 1384:fstore_3        
	//* 659 1385:fload           7
	//* 660 1387:fstore          5
	//* 661 1389:fload           8
	//* 662 1391:fstore          4
	//* 663 1393:iload           10
	//* 664 1395:istore          11
	//* 665 1397:aload           13
	//* 666 1399:instanceof      #136 <Class WritableDirectElement>
	//* 667 1402:ifeq            48
	//* 668 1405:fload           6
	//* 669 1407:fstore_3        
	//* 670 1408:fload           7
	//* 671 1410:fstore          5
	//* 672 1412:fload           8
	//* 673 1414:fstore          4
	//* 674 1416:iload           10
	//* 675 1418:istore          11
	//* 676 1420:aload           13
	//* 677 1422:checkcast       #136 <Class WritableDirectElement>
	//* 678 1425:invokevirtual   #140 <Method int WritableDirectElement.getDirectElementType()>
	//* 679 1428:iconst_1        
	//* 680 1429:icmpeq          48
	//* 681 1432:iconst_0        
	//* 682 1433:istore          9
	//* 683 1435:fload           6
	//* 684 1437:fstore_3        
	//* 685 1438:fload           7
	//* 686 1440:fstore          5
	//* 687 1442:fload           8
	//* 688 1444:fstore          4
	//* 689 1446:iload           10
	//* 690 1448:istore          11
	//* 691 1450:goto            48
	//* 692 1453:fload           6
	//* 693 1455:fstore_3        
	//* 694 1456:fload           7
	//* 695 1458:fstore          5
	//* 696 1460:fload           8
	//* 697 1462:fstore          4
	//* 698 1464:iload           10
	//* 699 1466:istore          11
	//* 700 1468:aload           13
	//* 701 1470:instanceof      #181 <Class Spaceable>
	//* 702 1473:ifeq            48
	//* 703 1476:iconst_0        
	//* 704 1477:istore          9
	//* 705 1479:fload           6
	//* 706 1481:fstore_3        
	//* 707 1482:fload           7
	//* 708 1484:fstore          5
	//* 709 1486:fload           8
	//* 710 1488:fstore          4
	//* 711 1490:iload           10
	//* 712 1492:istore          11
	//* 713 1494:goto            48
	//* 714 1497:iconst_0        
	//* 715 1498:istore          9
	//* 716 1500:fload           6
	//* 717 1502:fstore_3        
	//* 718 1503:fload           7
	//* 719 1505:fstore          5
	//* 720 1507:fload           8
	//* 721 1509:fstore          4
	//* 722 1511:iload           10
	//* 723 1513:istore          11
	//* 724 1515:goto            48
		{
			if(f3 > filledWidth)
	//* 725 1518:fload           6
	//* 726 1520:aload_0         
	//* 727 1521:getfield        #96  <Field float filledWidth>
	//* 728 1524:fcmpl           
	//* 729 1525:ifle            1534
				filledWidth = f3;
	//  730 1528:aload_0         
	//  731 1529:fload           6
	//  732 1531:putfield        #96  <Field float filledWidth>
			if(f5 > filledWidth)
	//* 733 1534:fload           8
	//* 734 1536:aload_0         
	//* 735 1537:getfield        #96  <Field float filledWidth>
	//* 736 1540:fcmpl           
	//* 737 1541:ifle            272
				filledWidth = f5;
	//  738 1544:aload_0         
	//  739 1545:fload           8
	//  740 1547:putfield        #96  <Field float filledWidth>
		}
		yLine = f4;
		floatLeftX = leftX;
		floatRightX = rightX;
		return i;
_L6:
		if(((PdfDiv) (obj)).getFloatType() == PdfDiv.FloatType.LEFT)
		{
			i = ((PdfDiv) (obj)).layout(compositeColumn.getCanvas(), useAscender, flag, floatLeftX, minY, floatRightX, yLine);
			floatLeftX = floatLeftX + ((PdfDiv) (obj)).getActualWidth();
			f3 = f + ((PdfDiv) (obj)).getActualWidth();
			f5 = f1;
		} else
		{
			f3 = f;
			f5 = f1;
			if(((PdfDiv) (obj)).getFloatType() == PdfDiv.FloatType.RIGHT)
			{
				i = ((PdfDiv) (obj)).layout(compositeColumn.getCanvas(), useAscender, flag, floatRightX - ((PdfDiv) (obj)).getActualWidth() - 0.01F, minY, floatRightX, yLine);
				floatRightX = floatRightX - ((PdfDiv) (obj)).getActualWidth();
				f5 = f1 + ((PdfDiv) (obj)).getActualWidth();
				f3 = f;
			}
		}
		f4 = Math.min(f2, yLine - ((PdfDiv) (obj)).getActualHeight());
_L8:
		if(element instanceof Paragraph)
		{
			obj = ((Object) (((Paragraph)element).iterator()));
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
				obj1 = ((Object) ((Element)((Iterator) (obj)).next()));
				if(obj1 instanceof WritableDirectElement)
				{
					obj1 = ((Object) ((WritableDirectElement)obj1));
					if(((WritableDirectElement) (obj1)).getDirectElementType() == 1 && !flag)
					{
						pdfwriter = compositeColumn.getCanvas().getPdfWriter();
						pdfdocument = compositeColumn.getCanvas().getPdfDocument();
						f = pdfdocument.currentHeight;
						pdfdocument.currentHeight = pdfdocument.top() - yLine - pdfdocument.indentation.indentTop;
						((WritableDirectElement) (obj1)).write(pdfwriter, ((com.itextpdf.text.Document) (pdfdocument)));
						pdfdocument.currentHeight = f;
					}
				}
			} while(true);
		}
		break MISSING_BLOCK_LABEL_1340;
_L4:
		if(minY > f2)
		{
			byte0 = 2;
			list.add(0, ((Object) (element)));
			f3 = f;
			f4 = f2;
			f5 = f1;
			i = ((int) (byte0));
			if(columntext != null)
			{
				columntext.setText(((com.itextpdf.text.Phrase) (null)));
				f3 = f;
				f4 = f2;
				f5 = f1;
				i = ((int) (byte0));
			}
		} else
		{
label0:
			{
				if((element instanceof Spaceable) && (byte0 == 0 || !columntext.isIgnoreSpacingBefore() || ((Spaceable)element).getPaddingTop() != 0.0F))
					yLine = yLine - ((Spaceable)element).getSpacingBefore();
				if(flag)
				{
					if(element instanceof PdfPTable)
						columntext.addElement(((Element) (new PdfPTable((PdfPTable)element))));
					else
						columntext.addElement(element);
				} else
				{
					columntext.addElement(element);
				}
				if(yLine > f2)
					columntext.setSimpleColumn(floatLeftX, yLine, floatRightX, f2);
				else
					columntext.setSimpleColumn(floatLeftX, yLine, floatRightX, minY);
				columntext.setFilledWidth(0.0F);
				i = columntext.go(flag);
				if(yLine > f2 && (floatLeftX > leftX || floatRightX < rightX) && (i & 1) == 0)
				{
					yLine = f2;
					floatLeftX = leftX;
					floatRightX = rightX;
					if(f != 0.0F && f1 != 0.0F)
					{
						filledWidth = rightX - leftX;
					} else
					{
						if(f > filledWidth)
							filledWidth = f;
						if(f1 > filledWidth)
							filledWidth = f1;
					}
					f3 = 0.0F;
					f4 = 0.0F;
					if(flag && (element instanceof PdfPTable))
						columntext.addElement(((Element) (new PdfPTable((PdfPTable)element))));
					columntext.setSimpleColumn(floatLeftX, yLine, floatRightX, minY);
					j = columntext.go(flag);
					f5 = columntext.getYLine() + columntext.getDescender();
					yLine = f5;
					f2 = f3;
					f1 = f5;
					f = f4;
					i = j;
					if(columntext.getFilledWidth() > filledWidth)
					{
						filledWidth = columntext.getFilledWidth();
						i = j;
						f = f4;
						f1 = f5;
						f2 = f3;
					}
				} else
				{
					if(f1 > 0.0F)
					{
						f3 = f1 + columntext.getFilledWidth();
						f4 = f;
					} else
					if(f > 0.0F)
					{
						f4 = f + columntext.getFilledWidth();
						f3 = f1;
					} else
					{
						f4 = f;
						f3 = f1;
						if(columntext.getFilledWidth() > filledWidth)
						{
							filledWidth = columntext.getFilledWidth();
							f4 = f;
							f3 = f1;
						}
					}
					f1 = Math.min(columntext.getYLine() + columntext.getDescender(), f2);
					yLine = columntext.getYLine() + columntext.getDescender();
					f2 = f4;
					f = f3;
				}
				if((i & 1) != 0)
					break label0;
				if(!flag)
				{
					list.addAll(0, ((java.util.Collection) (columntext.getCompositeElements())));
					columntext.getCompositeElements().clear();
					f3 = f2;
					f4 = f1;
					f5 = f;
				} else
				{
					list.add(0, ((Object) (element)));
					columntext.setText(((com.itextpdf.text.Phrase) (null)));
					f3 = f2;
					f4 = f1;
					f5 = f;
				}
			}
		}
		  goto _L2
		columntext.setText(((com.itextpdf.text.Phrase) (null)));
		f3 = f2;
		f4 = f1;
		f5 = f;
		  goto _L8
		if(byte0 != 0 && element.getChunks().size() == 0)
		{
			if(element instanceof Paragraph)
			{
				element = (Element)((Paragraph)element).get(0);
				f = f3;
				f2 = f4;
				f1 = f5;
				j = i;
				if(element instanceof WritableDirectElement)
				{
					f = f3;
					f2 = f4;
					f1 = f5;
					j = i;
					if(((WritableDirectElement)element).getDirectElementType() != 1)
					{
						byte0 = 0;
						f = f3;
						f2 = f4;
						f1 = f5;
						j = i;
					}
				}
			} else
			{
				f = f3;
				f2 = f4;
				f1 = f5;
				j = i;
				if(element instanceof Spaceable)
				{
					byte0 = 0;
					f = f3;
					f2 = f4;
					f1 = f5;
					j = i;
				}
			}
		} else
		{
			byte0 = 0;
			f = f3;
			f2 = f4;
			f1 = f5;
			j = i;
		}
		if(true) goto _L10; else goto _L9
_L9:
	//* 741 1550:goto            272
	}

	public float getFilledWidth()
	{
		return filledWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field float filledWidth>
	//    2    4:freturn         
	}

	public int getRunDirection()
	{
		return compositeColumn.getRunDirection();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ColumnText compositeColumn>
	//    2    4:invokevirtual   #243 <Method int ColumnText.getRunDirection()>
	//    3    7:ireturn         
	}

	public float getYLine()
	{
		return yLine;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field float yLine>
	//    2    4:freturn         
	}

	public int layout(PdfContentByte pdfcontentbyte, boolean flag)
		throws DocumentException
	{
		int i;
		int j;
		Object obj;
		ArrayList arraylist;
		PdfDiv pdfdiv;
		compositeColumn.setCanvas(pdfcontentbyte);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ColumnText compositeColumn>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #247 <Method void ColumnText.setCanvas(PdfContentByte)>
		j = 1;
	//    4    8:iconst_1        
	//    5    9:istore          4
		arraylist = new ArrayList();
	//    6   11:new             #249 <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #250 <Method void ArrayList()>
	//    9   18:astore          6
		if(flag)
	//*  10   20:iload_2         
	//*  11   21:ifeq            119
			obj = ((Object) (new ArrayList(((java.util.Collection) (content)))));
	//   12   24:new             #249 <Class ArrayList>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #40  <Field List content>
	//   16   32:invokespecial   #253 <Method void ArrayList(java.util.Collection)>
	//   17   35:astore          5
		else
	//*  18   37:iload           4
	//*  19   39:istore_3        
	//*  20   40:aload           5
	//*  21   42:invokeinterface #61  <Method boolean List.isEmpty()>
	//*  22   47:ifne            150
	//*  23   50:aload           5
	//*  24   52:iconst_0        
	//*  25   53:invokeinterface #65  <Method Object List.get(int)>
	//*  26   58:instanceof      #72  <Class PdfDiv>
	//*  27   61:ifeq            401
	//*  28   64:aload           5
	//*  29   66:iconst_0        
	//*  30   67:invokeinterface #65  <Method Object List.get(int)>
	//*  31   72:checkcast       #72  <Class PdfDiv>
	//*  32   75:astore          7
	//*  33   77:aload           7
	//*  34   79:invokevirtual   #100 <Method PdfDiv$FloatType PdfDiv.getFloatType()>
	//*  35   82:getstatic       #106 <Field PdfDiv$FloatType PdfDiv$FloatType.LEFT>
	//*  36   85:if_acmpeq       99
	//*  37   88:aload           7
	//*  38   90:invokevirtual   #100 <Method PdfDiv$FloatType PdfDiv.getFloatType()>
	//*  39   93:getstatic       #174 <Field PdfDiv$FloatType PdfDiv$FloatType.RIGHT>
	//*  40   96:if_acmpne       128
	//*  41   99:aload           6
	//*  42  101:aload           7
	//*  43  103:invokevirtual   #256 <Method boolean ArrayList.add(Object)>
	//*  44  106:pop             
	//*  45  107:aload           5
	//*  46  109:iconst_0        
	//*  47  110:invokeinterface #70  <Method Object List.remove(int)>
	//*  48  115:pop             
	//*  49  116:goto            37
			obj = ((Object) (content));
	//   50  119:aload_0         
	//   51  120:getfield        #40  <Field List content>
	//   52  123:astore          5
_L7:
		i = j;
		if(((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
		if(!(((List) (obj)).get(0) instanceof PdfDiv))
			break MISSING_BLOCK_LABEL_401;
		pdfdiv = (PdfDiv)((List) (obj)).get(0);
		if(pdfdiv.getFloatType() == PdfDiv.FloatType.LEFT || pdfdiv.getFloatType() == PdfDiv.FloatType.RIGHT)
		{
			arraylist.add(((Object) (pdfdiv)));
			((List) (obj)).remove(0);
			continue; /* Loop/switch isn't completed */
		}
	//*  53  125:goto            37
		if(arraylist.isEmpty()) goto _L4; else goto _L3
	//   54  128:aload           6
	//   55  130:invokevirtual   #257 <Method boolean ArrayList.isEmpty()>
	//   56  133:ifne            193
_L3:
		i = floatingLayout(((List) (arraylist)), flag);
	//   57  136:aload_0         
	//   58  137:aload           6
	//   59  139:iload_2         
	//   60  140:invokespecial   #259 <Method int floatingLayout(List, boolean)>
	//   61  143:istore_3        
		if((i & 1) != 0) goto _L4; else goto _L2
	//   62  144:iload_3         
	//   63  145:iconst_1        
	//   64  146:iand            
	//   65  147:ifne            193
_L2:
		j = i;
	//   66  150:iload_3         
	//   67  151:istore          4
		if((i & 1) != 0)
	//*  68  153:iload_3         
	//*  69  154:iconst_1        
	//*  70  155:iand            
	//*  71  156:ifeq            179
		{
			j = i;
	//   72  159:iload_3         
	//   73  160:istore          4
			if(!arraylist.isEmpty())
	//*  74  162:aload           6
	//*  75  164:invokevirtual   #257 <Method boolean ArrayList.isEmpty()>
	//*  76  167:ifne            179
				j = floatingLayout(((List) (arraylist)), flag);
	//   77  170:aload_0         
	//   78  171:aload           6
	//   79  173:iload_2         
	//   80  174:invokespecial   #259 <Method int floatingLayout(List, boolean)>
	//   81  177:istore          4
		}
		((List) (obj)).addAll(0, ((java.util.Collection) (arraylist)));
	//   82  179:aload           5
	//   83  181:iconst_0        
	//   84  182:aload           6
	//   85  184:invokeinterface #228 <Method boolean List.addAll(int, java.util.Collection)>
	//   86  189:pop             
		return j;
	//   87  190:iload           4
	//   88  192:ireturn         
_L4:
		((List) (obj)).remove(0);
	//   89  193:aload           5
	//   90  195:iconst_0        
	//   91  196:invokeinterface #70  <Method Object List.remove(int)>
	//   92  201:pop             
		i = pdfdiv.layout(pdfcontentbyte, useAscender, true, floatLeftX, minY, floatRightX, yLine);
	//   93  202:aload           7
	//   94  204:aload_1         
	//   95  205:aload_0         
	//   96  206:getfield        #38  <Field boolean useAscender>
	//   97  209:iconst_1        
	//   98  210:aload_0         
	//   99  211:getfield        #78  <Field float floatLeftX>
	//  100  214:aload_0         
	//  101  215:getfield        #80  <Field float minY>
	//  102  218:aload_0         
	//  103  219:getfield        #82  <Field float floatRightX>
	//  104  222:aload_0         
	//  105  223:getfield        #49  <Field float yLine>
	//  106  226:invokevirtual   #86  <Method int PdfDiv.layout(PdfContentByte, boolean, boolean, float, float, float, float)>
	//  107  229:istore_3        
		if(pdfdiv.getKeepTogether() && (i & 1) == 0 && (compositeColumn.getCanvas().getPdfDocument().currentHeight > 0.0F || yLine != maxY))
	//* 108  230:aload           7
	//* 109  232:invokevirtual   #262 <Method boolean PdfDiv.getKeepTogether()>
	//* 110  235:ifeq            287
	//* 111  238:iload_3         
	//* 112  239:iconst_1        
	//* 113  240:iand            
	//* 114  241:ifne            287
	//* 115  244:aload_0         
	//* 116  245:getfield        #32  <Field ColumnText compositeColumn>
	//* 117  248:invokevirtual   #76  <Method PdfContentByte ColumnText.getCanvas()>
	//* 118  251:invokevirtual   #150 <Method PdfDocument PdfContentByte.getPdfDocument()>
	//* 119  254:getfield        #155 <Field float PdfDocument.currentHeight>
	//* 120  257:fconst_0        
	//* 121  258:fcmpl           
	//* 122  259:ifgt            274
	//* 123  262:aload_0         
	//* 124  263:getfield        #49  <Field float yLine>
	//* 125  266:aload_0         
	//* 126  267:getfield        #55  <Field float maxY>
	//* 127  270:fcmpl           
	//* 128  271:ifeq            287
		{
			((List) (obj)).add(0, ((Object) (pdfdiv)));
	//  129  274:aload           5
	//  130  276:iconst_0        
	//  131  277:aload           7
	//  132  279:invokeinterface #94  <Method void List.add(int, Object)>
			continue; /* Loop/switch isn't completed */
	//  133  284:goto            150
		}
		if(!flag)
	//* 134  287:iload_2         
	//* 135  288:ifne            331
		{
			pdfcontentbyte.openMCBlock(((com.itextpdf.text.pdf.interfaces.IAccessibleElement) (pdfdiv)));
	//  136  291:aload_1         
	//  137  292:aload           7
	//  138  294:invokevirtual   #266 <Method void PdfContentByte.openMCBlock(com.itextpdf.text.pdf.interfaces.IAccessibleElement)>
			i = pdfdiv.layout(pdfcontentbyte, useAscender, flag, floatLeftX, minY, floatRightX, yLine);
	//  139  297:aload           7
	//  140  299:aload_1         
	//  141  300:aload_0         
	//  142  301:getfield        #38  <Field boolean useAscender>
	//  143  304:iload_2         
	//  144  305:aload_0         
	//  145  306:getfield        #78  <Field float floatLeftX>
	//  146  309:aload_0         
	//  147  310:getfield        #80  <Field float minY>
	//  148  313:aload_0         
	//  149  314:getfield        #82  <Field float floatRightX>
	//  150  317:aload_0         
	//  151  318:getfield        #49  <Field float yLine>
	//  152  321:invokevirtual   #86  <Method int PdfDiv.layout(PdfContentByte, boolean, boolean, float, float, float, float)>
	//  153  324:istore_3        
			pdfcontentbyte.closeMCBlock(((com.itextpdf.text.pdf.interfaces.IAccessibleElement) (pdfdiv)));
	//  154  325:aload_1         
	//  155  326:aload           7
	//  156  328:invokevirtual   #269 <Method void PdfContentByte.closeMCBlock(com.itextpdf.text.pdf.interfaces.IAccessibleElement)>
		}
		if(pdfdiv.getActualWidth() > filledWidth)
	//* 157  331:aload           7
	//* 158  333:invokevirtual   #110 <Method float PdfDiv.getActualWidth()>
	//* 159  336:aload_0         
	//* 160  337:getfield        #96  <Field float filledWidth>
	//* 161  340:fcmpl           
	//* 162  341:ifle            353
			filledWidth = pdfdiv.getActualWidth();
	//  163  344:aload_0         
	//  164  345:aload           7
	//  165  347:invokevirtual   #110 <Method float PdfDiv.getActualWidth()>
	//  166  350:putfield        #96  <Field float filledWidth>
		if((i & 1) != 0)
			break; /* Loop/switch isn't completed */
	//  167  353:iload_3         
	//  168  354:iconst_1        
	//  169  355:iand            
	//  170  356:ifne            381
		((List) (obj)).add(0, ((Object) (pdfdiv)));
	//  171  359:aload           5
	//  172  361:iconst_0        
	//  173  362:aload           7
	//  174  364:invokeinterface #94  <Method void List.add(int, Object)>
		yLine = pdfdiv.getYLine();
	//  175  369:aload_0         
	//  176  370:aload           7
	//  177  372:invokevirtual   #270 <Method float PdfDiv.getYLine()>
	//  178  375:putfield        #49  <Field float yLine>
		if(true) goto _L2; else goto _L5
	//  179  378:goto            150
_L5:
		yLine = yLine - pdfdiv.getActualHeight();
	//  180  381:aload_0         
	//  181  382:aload_0         
	//  182  383:getfield        #49  <Field float yLine>
	//  183  386:aload           7
	//  184  388:invokevirtual   #113 <Method float PdfDiv.getActualHeight()>
	//  185  391:fsub            
	//  186  392:putfield        #49  <Field float yLine>
		j = i;
	//  187  395:iload_3         
	//  188  396:istore          4
		continue; /* Loop/switch isn't completed */
	//  189  398:goto            37
		arraylist.add(((List) (obj)).get(0));
	//  190  401:aload           6
	//  191  403:aload           5
	//  192  405:iconst_0        
	//  193  406:invokeinterface #65  <Method Object List.get(int)>
	//  194  411:invokevirtual   #256 <Method boolean ArrayList.add(Object)>
	//  195  414:pop             
		((List) (obj)).remove(0);
	//  196  415:aload           5
	//  197  417:iconst_0        
	//  198  418:invokeinterface #70  <Method Object List.remove(int)>
	//  199  423:pop             
		if(true) goto _L7; else goto _L6
	//  200  424:goto            37
_L6:
	}

	public void setFilledWidth(float f)
	{
		filledWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #96  <Field float filledWidth>
	//    3    5:return          
	}

	public void setRunDirection(int i)
	{
		compositeColumn.setRunDirection(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ColumnText compositeColumn>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #274 <Method void ColumnText.setRunDirection(int)>
	//    4    8:return          
	}

	public void setSimpleColumn(float f, float f1, float f2, float f3)
	{
		leftX = Math.min(f, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_3         
	//    3    3:invokestatic    #119 <Method float Math.min(float, float)>
	//    4    6:putfield        #88  <Field float leftX>
		maxY = Math.max(f1, f3);
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:fload           4
	//    8   13:invokestatic    #277 <Method float Math.max(float, float)>
	//    9   16:putfield        #55  <Field float maxY>
		minY = Math.min(f1, f3);
	//   10   19:aload_0         
	//   11   20:fload_2         
	//   12   21:fload           4
	//   13   23:invokestatic    #119 <Method float Math.min(float, float)>
	//   14   26:putfield        #80  <Field float minY>
		rightX = Math.max(f, f2);
	//   15   29:aload_0         
	//   16   30:fload_1         
	//   17   31:fload_3         
	//   18   32:invokestatic    #277 <Method float Math.max(float, float)>
	//   19   35:putfield        #90  <Field float rightX>
		floatLeftX = leftX;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #88  <Field float leftX>
	//   23   43:putfield        #78  <Field float floatLeftX>
		floatRightX = rightX;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #90  <Field float rightX>
	//   27   51:putfield        #82  <Field float floatRightX>
		yLine = maxY;
	//   28   54:aload_0         
	//   29   55:aload_0         
	//   30   56:getfield        #55  <Field float maxY>
	//   31   59:putfield        #49  <Field float yLine>
		filledWidth = 0.0F;
	//   32   62:aload_0         
	//   33   63:fconst_0        
	//   34   64:putfield        #96  <Field float filledWidth>
	//   35   67:return          
	}

	public void setYLine(float f)
	{
		yLine = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #49  <Field float yLine>
	//    3    5:return          
	}

	protected final ColumnText compositeColumn = new ColumnText(((PdfContentByte) (null)));
	protected final List content;
	protected float filledWidth;
	protected float floatLeftX;
	protected float floatRightX;
	protected float leftX;
	protected float maxY;
	protected float minY;
	protected float rightX;
	protected final boolean useAscender;
	protected float yLine;
}
