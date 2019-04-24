// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseField, BaseFont, PdfAppearance, PdfTemplate, 
//			PdfName, PdfWriter, PdfReader, PdfDictionary, 
//			PdfArray, PdfNumber, PdfFormField, PdfAnnotation, 
//			PdfBorderDictionary, PdfDashPattern, PRIndirectReference

public class PushbuttonField extends BaseField
{

	public PushbuttonField(PdfWriter pdfwriter, Rectangle rectangle, String s)
	{
		super(pdfwriter, rectangle, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #42  <Method void BaseField(PdfWriter, Rectangle, String)>
		layout = 1;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #44  <Field int layout>
		scaleIcon = 1;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #46  <Field int scaleIcon>
		proportionalIcon = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #48  <Field boolean proportionalIcon>
		iconVerticalAdjustment = 0.5F;
	//   14   22:aload_0         
	//   15   23:ldc1            #49  <Float 0.5F>
	//   16   25:putfield        #51  <Field float iconVerticalAdjustment>
		iconHorizontalAdjustment = 0.5F;
	//   17   28:aload_0         
	//   18   29:ldc1            #49  <Float 0.5F>
	//   19   31:putfield        #53  <Field float iconHorizontalAdjustment>
	//   20   34:return          
	}

	private float calculateFontSize(float f, float f1)
		throws IOException, DocumentException
	{
		BaseFont basefont = getRealFont();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method BaseFont getRealFont()>
	//    2    4:astore          5
		float f3 = fontSize;
	//    3    6:aload_0         
	//    4    7:getfield        #67  <Field float fontSize>
	//    5   10:fstore          4
		float f2 = f3;
	//    6   12:fload           4
	//    7   14:fstore_3        
		if(f3 == 0.0F)
	//*   8   15:fload           4
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifne            70
		{
			f2 = basefont.getWidthPoint(text, 1.0F);
	//   12   22:aload           5
	//   13   24:aload_0         
	//   14   25:getfield        #71  <Field String text>
	//   15   28:fconst_1        
	//   16   29:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//   17   32:fstore_3        
			if(f2 == 0.0F)
	//*  18   33:fload_3         
	//*  19   34:fconst_0        
	//*  20   35:fcmpl           
	//*  21   36:ifne            72
				f = 12F;
	//   22   39:ldc1            #78  <Float 12F>
	//   23   41:fstore_1        
			else
	//*  24   42:fload_1         
	//*  25   43:fload_2         
	//*  26   44:fconst_1        
	//*  27   45:aload           5
	//*  28   47:iconst_3        
	//*  29   48:fconst_1        
	//*  30   49:invokevirtual   #82  <Method float BaseFont.getFontDescriptor(int, float)>
	//*  31   52:fsub            
	//*  32   53:fdiv            
	//*  33   54:invokestatic    #87  <Method float Math.min(float, float)>
	//*  34   57:fstore_1        
	//*  35   58:fload_1         
	//*  36   59:fstore_3        
	//*  37   60:fload_1         
	//*  38   61:ldc1            #88  <Float 4F>
	//*  39   63:fcmpg           
	//*  40   64:ifge            70
	//*  41   67:ldc1            #88  <Float 4F>
	//*  42   69:fstore_3        
	//*  43   70:fload_3         
	//*  44   71:freturn         
				f /= f2;
	//   45   72:fload_1         
	//   46   73:fload_3         
	//   47   74:fdiv            
	//   48   75:fstore_1        
			f = Math.min(f, f1 / (1.0F - basefont.getFontDescriptor(3, 1.0F)));
			f2 = f;
			if(f < 4F)
				f2 = 4F;
		}
		return f2;
	//*  49   76:goto            42
	}

	public PdfAppearance getAppearance()
		throws IOException, DocumentException
	{
		PdfAppearance pdfappearance;
		Rectangle rectangle1;
		pdfappearance = getBorderAppearance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method PdfAppearance getBorderAppearance()>
	//    2    4:astore          19
		rectangle1 = new Rectangle(pdfappearance.getBoundingBox());
	//    3    6:new             #96  <Class Rectangle>
	//    4    9:dup             
	//    5   10:aload           19
	//    6   12:invokevirtual   #102 <Method Rectangle PdfAppearance.getBoundingBox()>
	//    7   15:invokespecial   #105 <Method void Rectangle(Rectangle)>
	//    8   18:astore          20
		break MISSING_BLOCK_LABEL_20;
_L15:
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f6;
		float f8;
		float f9;
		float f11;
		float f12;
		float f14;
		int i;
		Object obj;
		BaseFont basefont;
		do
	//*   9   20:aload_0         
	//*  10   21:getfield        #71  <Field String text>
	//*  11   24:ifnull          37
	//*  12   27:aload_0         
	//*  13   28:getfield        #71  <Field String text>
	//*  14   31:invokevirtual   #111 <Method int String.length()>
	//*  15   34:ifne            69
	//*  16   37:aload_0         
	//*  17   38:getfield        #44  <Field int layout>
	//*  18   41:iconst_1        
	//*  19   42:icmpeq          66
	//*  20   45:aload_0         
	//*  21   46:getfield        #113 <Field Image image>
	//*  22   49:ifnonnull       69
	//*  23   52:aload_0         
	//*  24   53:getfield        #115 <Field PdfTemplate template>
	//*  25   56:ifnonnull       69
	//*  26   59:aload_0         
	//*  27   60:getfield        #117 <Field PRIndirectReference iconReference>
	//*  28   63:ifnonnull       69
			return pdfappearance;
	//   29   66:aload           19
	//   30   68:areturn         
		while((text == null || text.length() == 0) && (layout == 1 || image == null && template == null && iconReference == null) || layout == 2 && image == null && template == null && iconReference == null);
	//   31   69:aload_0         
	//   32   70:getfield        #44  <Field int layout>
	//   33   73:iconst_2        
	//   34   74:icmpne          98
	//   35   77:aload_0         
	//   36   78:getfield        #113 <Field Image image>
	//   37   81:ifnonnull       98
	//   38   84:aload_0         
	//   39   85:getfield        #115 <Field PdfTemplate template>
	//   40   88:ifnonnull       98
	//   41   91:aload_0         
	//   42   92:getfield        #117 <Field PRIndirectReference iconReference>
	//   43   95:ifnull          66
		basefont = getRealFont();
	//   44   98:aload_0         
	//   45   99:invokevirtual   #64  <Method BaseFont getRealFont()>
	//   46  102:astore          21
		int j;
		Object obj1;
		if(borderStyle == 2 || borderStyle == 3)
	//*  47  104:aload_0         
	//*  48  105:getfield        #120 <Field int borderStyle>
	//*  49  108:iconst_2        
	//*  50  109:icmpeq          120
	//*  51  112:aload_0         
	//*  52  113:getfield        #120 <Field int borderStyle>
	//*  53  116:iconst_3        
	//*  54  117:icmpne          833
			i = 1;
	//   55  120:iconst_1        
	//   56  121:istore          14
		else
	//*  57  123:aload           20
	//*  58  125:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//*  59  128:pop             
	//*  60  129:aload_0         
	//*  61  130:getfield        #127 <Field float borderWidth>
	//*  62  133:fstore_1        
	//*  63  134:aload_0         
	//*  64  135:getfield        #127 <Field float borderWidth>
	//*  65  138:fstore_2        
	//*  66  139:fload_2         
	//*  67  140:fstore_1        
	//*  68  141:iload           14
	//*  69  143:ifeq            155
	//*  70  146:aload_0         
	//*  71  147:getfield        #127 <Field float borderWidth>
	//*  72  150:fstore_1        
	//*  73  151:fload_2         
	//*  74  152:fconst_2        
	//*  75  153:fmul            
	//*  76  154:fstore_1        
	//*  77  155:iload           14
	//*  78  157:ifeq            839
	//*  79  160:fconst_2        
	//*  80  161:aload_0         
	//*  81  162:getfield        #127 <Field float borderWidth>
	//*  82  165:fmul            
	//*  83  166:fstore_2        
	//*  84  167:fload_1         
	//*  85  168:fload_2         
	//*  86  169:fconst_1        
	//*  87  170:invokestatic    #130 <Method float Math.max(float, float)>
	//*  88  173:invokestatic    #87  <Method float Math.min(float, float)>
	//*  89  176:fstore          9
	//*  90  178:aload_0         
	//*  91  179:aconst_null     
	//*  92  180:putfield        #132 <Field PdfTemplate tp>
	//*  93  183:ldc1            #133 <Float (0.0F / 0.0F)>
	//*  94  185:fstore_3        
	//*  95  186:fconst_0        
	//*  96  187:fstore          8
	//*  97  189:fconst_0        
	//*  98  190:fstore_1        
	//*  99  191:aload_0         
	//* 100  192:getfield        #67  <Field float fontSize>
	//* 101  195:fstore_2        
	//* 102  196:aload           20
	//* 103  198:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 104  201:fconst_2        
	//* 105  202:fload           9
	//* 106  204:fmul            
	//* 107  205:fsub            
	//* 108  206:fconst_2        
	//* 109  207:fsub            
	//* 110  208:fstore          10
	//* 111  210:aload           20
	//* 112  212:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 113  215:fconst_2        
	//* 114  216:fload           9
	//* 115  218:fmul            
	//* 116  219:fsub            
	//* 117  220:fstore          11
	//* 118  222:aload_0         
	//* 119  223:getfield        #138 <Field boolean iconFitToBounds>
	//* 120  226:ifeq            847
	//* 121  229:fconst_0        
	//* 122  230:fstore          7
	//* 123  232:aload_0         
	//* 124  233:getfield        #44  <Field int layout>
	//* 125  236:istore          15
	//* 126  238:iload           15
	//* 127  240:istore          14
	//* 128  242:aload_0         
	//* 129  243:getfield        #113 <Field Image image>
	//* 130  246:ifnonnull       274
	//* 131  249:iload           15
	//* 132  251:istore          14
	//* 133  253:aload_0         
	//* 134  254:getfield        #115 <Field PdfTemplate template>
	//* 135  257:ifnonnull       274
	//* 136  260:iload           15
	//* 137  262:istore          14
	//* 138  264:aload_0         
	//* 139  265:getfield        #117 <Field PRIndirectReference iconReference>
	//* 140  268:ifnonnull       274
	//* 141  271:iconst_1        
	//* 142  272:istore          14
	//* 143  274:aconst_null     
	//* 144  275:astore          16
	//* 145  277:fload_2         
	//* 146  278:fstore          6
	//* 147  280:fload_3         
	//* 148  281:fstore          5
	//* 149  283:fload           8
	//* 150  285:fstore          4
	//* 151  287:iload           14
	//* 152  289:tableswitch     1 7: default 332
	//	               1 856
	//	               2 976
	//	               3 1051
	//	               4 1189
	//	               5 1513
	//	               6 1348
	//	               7 856
	//* 153  332:fload_1         
	//* 154  333:fstore          7
	//* 155  335:fload_1         
	//* 156  336:aload           20
	//* 157  338:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 158  341:fload           9
	//* 159  343:fadd            
	//* 160  344:fcmpg           
	//* 161  345:ifge            358
	//* 162  348:aload           20
	//* 163  350:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 164  353:fload           9
	//* 165  355:fadd            
	//* 166  356:fstore          7
	//* 167  358:aload           16
	//* 168  360:astore          17
	//* 169  362:aload           16
	//* 170  364:ifnull          394
	//* 171  367:aload           16
	//* 172  369:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 173  372:fconst_0        
	//* 174  373:fcmpg           
	//* 175  374:ifle            391
	//* 176  377:aload           16
	//* 177  379:astore          17
	//* 178  381:aload           16
	//* 179  383:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 180  386:fconst_0        
	//* 181  387:fcmpg           
	//* 182  388:ifgt            394
	//* 183  391:aconst_null     
	//* 184  392:astore          17
	//* 185  394:iconst_0        
	//* 186  395:istore          15
	//* 187  397:fconst_0        
	//* 188  398:fstore_1        
	//* 189  399:fconst_0        
	//* 190  400:fstore          4
	//* 191  402:aconst_null     
	//* 192  403:astore          18
	//* 193  405:fload           4
	//* 194  407:fstore          5
	//* 195  409:fload_1         
	//* 196  410:fstore          6
	//* 197  412:iload           15
	//* 198  414:istore          14
	//* 199  416:aload           18
	//* 200  418:astore          16
	//* 201  420:aload           17
	//* 202  422:ifnull          540
	//* 203  425:aload_0         
	//* 204  426:getfield        #113 <Field Image image>
	//* 205  429:ifnull          1686
	//* 206  432:aload_0         
	//* 207  433:new             #143 <Class PdfTemplate>
	//* 208  436:dup             
	//* 209  437:aload_0         
	//* 210  438:getfield        #147 <Field PdfWriter writer>
	//* 211  441:invokespecial   #150 <Method void PdfTemplate(PdfWriter)>
	//* 212  444:putfield        #132 <Field PdfTemplate tp>
	//* 213  447:aload_0         
	//* 214  448:getfield        #132 <Field PdfTemplate tp>
	//* 215  451:new             #96  <Class Rectangle>
	//* 216  454:dup             
	//* 217  455:aload_0         
	//* 218  456:getfield        #113 <Field Image image>
	//* 219  459:invokespecial   #105 <Method void Rectangle(Rectangle)>
	//* 220  462:invokevirtual   #153 <Method void PdfTemplate.setBoundingBox(Rectangle)>
	//* 221  465:aload_0         
	//* 222  466:getfield        #147 <Field PdfWriter writer>
	//* 223  469:aload_0         
	//* 224  470:getfield        #132 <Field PdfTemplate tp>
	//* 225  473:getstatic       #159 <Field PdfName PdfName.FRM>
	//* 226  476:invokevirtual   #165 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//* 227  479:pop             
	//* 228  480:aload_0         
	//* 229  481:getfield        #132 <Field PdfTemplate tp>
	//* 230  484:aload_0         
	//* 231  485:getfield        #113 <Field Image image>
	//* 232  488:aload_0         
	//* 233  489:getfield        #113 <Field Image image>
	//* 234  492:invokevirtual   #168 <Method float Image.getWidth()>
	//* 235  495:fconst_0        
	//* 236  496:fconst_0        
	//* 237  497:aload_0         
	//* 238  498:getfield        #113 <Field Image image>
	//* 239  501:invokevirtual   #169 <Method float Image.getHeight()>
	//* 240  504:fconst_0        
	//* 241  505:fconst_0        
	//* 242  506:invokevirtual   #173 <Method void PdfTemplate.addImage(Image, float, float, float, float, float, float)>
	//* 243  509:iconst_1        
	//* 244  510:istore          14
	//* 245  512:aload_0         
	//* 246  513:getfield        #132 <Field PdfTemplate tp>
	//* 247  516:invokevirtual   #174 <Method Rectangle PdfTemplate.getBoundingBox()>
	//* 248  519:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 249  522:fstore          6
	//* 250  524:aload_0         
	//* 251  525:getfield        #132 <Field PdfTemplate tp>
	//* 252  528:invokevirtual   #174 <Method Rectangle PdfTemplate.getBoundingBox()>
	//* 253  531:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 254  534:fstore          5
	//* 255  536:aload           18
	//* 256  538:astore          16
	//* 257  540:iload           14
	//* 258  542:ifeq            727
	//* 259  545:aload           17
	//* 260  547:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 261  550:fload           6
	//* 262  552:fdiv            
	//* 263  553:fstore_1        
	//* 264  554:aload           17
	//* 265  556:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 266  559:fload           5
	//* 267  561:fdiv            
	//* 268  562:fstore          4
	//* 269  564:aload_0         
	//* 270  565:getfield        #48  <Field boolean proportionalIcon>
	//* 271  568:ifeq            1946
	//* 272  571:aload_0         
	//* 273  572:getfield        #46  <Field int scaleIcon>
	//* 274  575:tableswitch     2 4: default 600
	//	               2 1941
	//	               3 1913
	//	               4 1927
	//* 275  600:fload_1         
	//* 276  601:fload           4
	//* 277  603:invokestatic    #87  <Method float Math.min(float, float)>
	//* 278  606:fstore_1        
	//* 279  607:fload_1         
	//* 280  608:fstore          4
	//* 281  610:aload           17
	//* 282  612:invokevirtual   #177 <Method float Rectangle.getLeft()>
	//* 283  615:aload           17
	//* 284  617:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 285  620:fload           6
	//* 286  622:fload_1         
	//* 287  623:fmul            
	//* 288  624:fsub            
	//* 289  625:aload_0         
	//* 290  626:getfield        #53  <Field float iconHorizontalAdjustment>
	//* 291  629:fmul            
	//* 292  630:fadd            
	//* 293  631:fstore          12
	//* 294  633:aload           17
	//* 295  635:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 296  638:aload           17
	//* 297  640:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 298  643:fload           5
	//* 299  645:fload           4
	//* 300  647:fmul            
	//* 301  648:fsub            
	//* 302  649:aload_0         
	//* 303  650:getfield        #51  <Field float iconVerticalAdjustment>
	//* 304  653:fmul            
	//* 305  654:fadd            
	//* 306  655:fstore          13
	//* 307  657:aload           19
	//* 308  659:invokevirtual   #181 <Method void PdfAppearance.saveState()>
	//* 309  662:aload           19
	//* 310  664:aload           17
	//* 311  666:invokevirtual   #177 <Method float Rectangle.getLeft()>
	//* 312  669:aload           17
	//* 313  671:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 314  674:aload           17
	//* 315  676:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 316  679:aload           17
	//* 317  681:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 318  684:invokevirtual   #185 <Method void PdfAppearance.rectangle(float, float, float, float)>
	//* 319  687:aload           19
	//* 320  689:invokevirtual   #188 <Method void PdfAppearance.clip()>
	//* 321  692:aload           19
	//* 322  694:invokevirtual   #191 <Method void PdfAppearance.newPath()>
	//* 323  697:aload_0         
	//* 324  698:getfield        #132 <Field PdfTemplate tp>
	//* 325  701:ifnull          2021
	//* 326  704:aload           19
	//* 327  706:aload_0         
	//* 328  707:getfield        #132 <Field PdfTemplate tp>
	//* 329  710:fload_1         
	//* 330  711:fconst_0        
	//* 331  712:fconst_0        
	//* 332  713:fload           4
	//* 333  715:fload           12
	//* 334  717:fload           13
	//* 335  719:invokevirtual   #195 <Method void PdfAppearance.addTemplate(PdfTemplate, float, float, float, float, float, float)>
	//* 336  722:aload           19
	//* 337  724:invokevirtual   #198 <Method void PdfAppearance.restoreState()>
	//* 338  727:fload_3         
	//* 339  728:invokestatic    #204 <Method boolean Float.isNaN(float)>
	//* 340  731:ifne            66
	//* 341  734:aload           19
	//* 342  736:invokevirtual   #181 <Method void PdfAppearance.saveState()>
	//* 343  739:aload           19
	//* 344  741:fload           9
	//* 345  743:fload           9
	//* 346  745:aload           20
	//* 347  747:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 348  750:fconst_2        
	//* 349  751:fload           9
	//* 350  753:fmul            
	//* 351  754:fsub            
	//* 352  755:aload           20
	//* 353  757:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 354  760:fconst_2        
	//* 355  761:fload           9
	//* 356  763:fmul            
	//* 357  764:fsub            
	//* 358  765:invokevirtual   #185 <Method void PdfAppearance.rectangle(float, float, float, float)>
	//* 359  768:aload           19
	//* 360  770:invokevirtual   #188 <Method void PdfAppearance.clip()>
	//* 361  773:aload           19
	//* 362  775:invokevirtual   #191 <Method void PdfAppearance.newPath()>
	//* 363  778:aload_0         
	//* 364  779:getfield        #208 <Field com.itextpdf.text.BaseColor textColor>
	//* 365  782:ifnonnull       2148
	//* 366  785:aload           19
	//* 367  787:invokevirtual   #211 <Method void PdfAppearance.resetGrayFill()>
	//* 368  790:aload           19
	//* 369  792:invokevirtual   #214 <Method void PdfAppearance.beginText()>
	//* 370  795:aload           19
	//* 371  797:aload           21
	//* 372  799:fload_2         
	//* 373  800:invokevirtual   #218 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
	//* 374  803:aload           19
	//* 375  805:fload_3         
	//* 376  806:fload           7
	//* 377  808:invokevirtual   #222 <Method void PdfAppearance.setTextMatrix(float, float)>
	//* 378  811:aload           19
	//* 379  813:aload_0         
	//* 380  814:getfield        #71  <Field String text>
	//* 381  817:invokevirtual   #226 <Method void PdfAppearance.showText(String)>
	//* 382  820:aload           19
	//* 383  822:invokevirtual   #229 <Method void PdfAppearance.endText()>
	//* 384  825:aload           19
	//* 385  827:invokevirtual   #198 <Method void PdfAppearance.restoreState()>
	//* 386  830:aload           19
	//* 387  832:areturn         
			i = 0;
	//  388  833:iconst_0        
	//  389  834:istore          14
		rectangle1.getHeight();
		f = borderWidth;
		f1 = borderWidth;
		f = f1;
		if(i != 0)
		{
			f = borderWidth;
			f = f1 * 2.0F;
		}
		if(i != 0)
			f1 = 2.0F * borderWidth;
		else
	//* 390  836:goto            123
			f1 = borderWidth;
	//  391  839:aload_0         
	//  392  840:getfield        #127 <Field float borderWidth>
	//  393  843:fstore_2        
		f11 = Math.min(f, Math.max(f1, 1.0F));
		tp = null;
		f2 = (0.0F / 0.0F);
		f9 = 0.0F;
		f = 0.0F;
		f1 = fontSize;
		f12 = rectangle1.getWidth() - 2.0F * f11 - 2.0F;
		f14 = rectangle1.getHeight() - 2.0F * f11;
		if(iconFitToBounds)
			f8 = 0.0F;
		else
	//* 394  844:goto            167
			f8 = f11 + 1.0F;
	//  395  847:fload           9
	//  396  849:fconst_1        
	//  397  850:fadd            
	//  398  851:fstore          7
		j = layout;
		i = j;
		if(image == null)
		{
			i = j;
			if(template == null)
			{
				i = j;
				if(iconReference == null)
					i = 1;
			}
		}
		obj = null;
_L20:
		f6 = f1;
		f4 = f2;
		f3 = f9;
		i;
		JVM INSTR tableswitch 1 7: default 332
	//	               1 856
	//	               2 976
	//	               3 1051
	//	               4 1189
	//	               5 1513
	//	               6 1348
	//	               7 856;
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L2
_L1:
label0:
		{
			f8 = f;
			if(f < rectangle1.getBottom() + f11)
				f8 = rectangle1.getBottom() + f11;
			obj1 = obj;
			if(obj == null)
				break label0;
			if(((Rectangle) (obj)).getWidth() > 0.0F)
			{
				obj1 = obj;
				if(((Rectangle) (obj)).getHeight() > 0.0F)
					break label0;
			}
			obj1 = null;
		}
		boolean flag = false;
		f = 0.0F;
		f3 = 0.0F;
		Object obj2 = null;
		f4 = f3;
		f6 = f;
		i = ((int) (flag));
		obj = ((Object) (obj2));
		if(obj1 != null)
			if(image != null)
			{
				tp = new PdfTemplate(writer);
				tp.setBoundingBox(new Rectangle(((Rectangle) (image))));
				writer.addDirectTemplateSimple(tp, PdfName.FRM);
				tp.addImage(image, image.getWidth(), 0.0F, 0.0F, image.getHeight(), 0.0F, 0.0F);
				i = 1;
				f6 = tp.getBoundingBox().getWidth();
				f4 = tp.getBoundingBox().getHeight();
				obj = ((Object) (obj2));
			} else
	//* 399  853:goto            232
	//* 400  856:fload_2         
	//* 401  857:fstore          6
	//* 402  859:fload_3         
	//* 403  860:fstore          5
	//* 404  862:fload           8
	//* 405  864:fstore          4
	//* 406  866:aload_0         
	//* 407  867:getfield        #71  <Field String text>
	//* 408  870:ifnull          976
	//* 409  873:fload_2         
	//* 410  874:fstore          6
	//* 411  876:fload_3         
	//* 412  877:fstore          5
	//* 413  879:fload           8
	//* 414  881:fstore          4
	//* 415  883:aload_0         
	//* 416  884:getfield        #71  <Field String text>
	//* 417  887:invokevirtual   #111 <Method int String.length()>
	//* 418  890:ifle            976
	//* 419  893:fload_2         
	//* 420  894:fstore          6
	//* 421  896:fload_3         
	//* 422  897:fstore          5
	//* 423  899:fload           8
	//* 424  901:fstore          4
	//* 425  903:fload           10
	//* 426  905:fconst_0        
	//* 427  906:fcmpl           
	//* 428  907:ifle            976
	//* 429  910:fload_2         
	//* 430  911:fstore          6
	//* 431  913:fload_3         
	//* 432  914:fstore          5
	//* 433  916:fload           8
	//* 434  918:fstore          4
	//* 435  920:fload           11
	//* 436  922:fconst_0        
	//* 437  923:fcmpl           
	//* 438  924:ifle            976
	//* 439  927:aload_0         
	//* 440  928:fload           10
	//* 441  930:fload           11
	//* 442  932:invokespecial   #231 <Method float calculateFontSize(float, float)>
	//* 443  935:fstore          6
	//* 444  937:aload           20
	//* 445  939:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 446  942:aload           21
	//* 447  944:aload_0         
	//* 448  945:getfield        #71  <Field String text>
	//* 449  948:fload           6
	//* 450  950:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//* 451  953:fsub            
	//* 452  954:fconst_2        
	//* 453  955:fdiv            
	//* 454  956:fstore          5
	//* 455  958:aload           20
	//* 456  960:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 457  963:aload           21
	//* 458  965:iconst_1        
	//* 459  966:fload           6
	//* 460  968:invokevirtual   #82  <Method float BaseFont.getFontDescriptor(int, float)>
	//* 461  971:fsub            
	//* 462  972:fconst_2        
	//* 463  973:fdiv            
	//* 464  974:fstore          4
	//* 465  976:iload           14
	//* 466  978:bipush          7
	//* 467  980:icmpeq          998
	//* 468  983:fload           6
	//* 469  985:fstore_2        
	//* 470  986:fload           5
	//* 471  988:fstore_3        
	//* 472  989:fload           4
	//* 473  991:fstore_1        
	//* 474  992:iload           14
	//* 475  994:iconst_2        
	//* 476  995:icmpne          332
	//* 477  998:new             #96  <Class Rectangle>
	//* 478 1001:dup             
	//* 479 1002:aload           20
	//* 480 1004:invokevirtual   #177 <Method float Rectangle.getLeft()>
	//* 481 1007:fload           7
	//* 482 1009:fadd            
	//* 483 1010:aload           20
	//* 484 1012:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 485 1015:fload           7
	//* 486 1017:fadd            
	//* 487 1018:aload           20
	//* 488 1020:invokevirtual   #234 <Method float Rectangle.getRight()>
	//* 489 1023:fload           7
	//* 490 1025:fsub            
	//* 491 1026:aload           20
	//* 492 1028:invokevirtual   #237 <Method float Rectangle.getTop()>
	//* 493 1031:fload           7
	//* 494 1033:fsub            
	//* 495 1034:invokespecial   #239 <Method void Rectangle(float, float, float, float)>
	//* 496 1037:astore          16
	//* 497 1039:fload           6
	//* 498 1041:fstore_2        
	//* 499 1042:fload           5
	//* 500 1044:fstore_3        
	//* 501 1045:fload           4
	//* 502 1047:fstore_1        
	//* 503 1048:goto            332
	//* 504 1051:aload_0         
	//* 505 1052:getfield        #71  <Field String text>
	//* 506 1055:ifnull          1082
	//* 507 1058:aload_0         
	//* 508 1059:getfield        #71  <Field String text>
	//* 509 1062:invokevirtual   #111 <Method int String.length()>
	//* 510 1065:ifeq            1082
	//* 511 1068:fload           10
	//* 512 1070:fconst_0        
	//* 513 1071:fcmpg           
	//* 514 1072:ifle            1082
	//* 515 1075:fload           11
	//* 516 1077:fconst_0        
	//* 517 1078:fcmpg           
	//* 518 1079:ifgt            1088
	//* 519 1082:iconst_2        
	//* 520 1083:istore          14
	//* 521 1085:goto            277
	//* 522 1088:aload           20
	//* 523 1090:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 524 1093:ldc1            #240 <Float 0.35F>
	//* 525 1095:fmul            
	//* 526 1096:fload           9
	//* 527 1098:fsub            
	//* 528 1099:fstore_1        
	//* 529 1100:fload_1         
	//* 530 1101:fconst_0        
	//* 531 1102:fcmpl           
	//* 532 1103:ifle            1183
	//* 533 1106:aload_0         
	//* 534 1107:fload           10
	//* 535 1109:fload_1         
	//* 536 1110:invokespecial   #231 <Method float calculateFontSize(float, float)>
	//* 537 1113:fstore_2        
	//* 538 1114:aload           20
	//* 539 1116:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 540 1119:aload           21
	//* 541 1121:aload_0         
	//* 542 1122:getfield        #71  <Field String text>
	//* 543 1125:fload_2         
	//* 544 1126:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//* 545 1129:fsub            
	//* 546 1130:fconst_2        
	//* 547 1131:fdiv            
	//* 548 1132:fstore_3        
	//* 549 1133:fload           9
	//* 550 1135:aload           21
	//* 551 1137:iconst_3        
	//* 552 1138:fload_2         
	//* 553 1139:invokevirtual   #82  <Method float BaseFont.getFontDescriptor(int, float)>
	//* 554 1142:fsub            
	//* 555 1143:fstore_1        
	//* 556 1144:new             #96  <Class Rectangle>
	//* 557 1147:dup             
	//* 558 1148:aload           20
	//* 559 1150:invokevirtual   #177 <Method float Rectangle.getLeft()>
	//* 560 1153:fload           7
	//* 561 1155:fadd            
	//* 562 1156:fload_1         
	//* 563 1157:fload_2         
	//* 564 1158:fadd            
	//* 565 1159:aload           20
	//* 566 1161:invokevirtual   #234 <Method float Rectangle.getRight()>
	//* 567 1164:fload           7
	//* 568 1166:fsub            
	//* 569 1167:aload           20
	//* 570 1169:invokevirtual   #237 <Method float Rectangle.getTop()>
	//* 571 1172:fload           7
	//* 572 1174:fsub            
	//* 573 1175:invokespecial   #239 <Method void Rectangle(float, float, float, float)>
	//* 574 1178:astore          16
	//* 575 1180:goto            332
	//* 576 1183:ldc1            #88  <Float 4F>
	//* 577 1185:fstore_2        
	//* 578 1186:goto            1114
	//* 579 1189:aload_0         
	//* 580 1190:getfield        #71  <Field String text>
	//* 581 1193:ifnull          1220
	//* 582 1196:aload_0         
	//* 583 1197:getfield        #71  <Field String text>
	//* 584 1200:invokevirtual   #111 <Method int String.length()>
	//* 585 1203:ifeq            1220
	//* 586 1206:fload           10
	//* 587 1208:fconst_0        
	//* 588 1209:fcmpg           
	//* 589 1210:ifle            1220
	//* 590 1213:fload           11
	//* 591 1215:fconst_0        
	//* 592 1216:fcmpg           
	//* 593 1217:ifgt            1226
	//* 594 1220:iconst_2        
	//* 595 1221:istore          14
	//* 596 1223:goto            277
	//* 597 1226:aload           20
	//* 598 1228:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 599 1231:ldc1            #240 <Float 0.35F>
	//* 600 1233:fmul            
	//* 601 1234:fload           9
	//* 602 1236:fsub            
	//* 603 1237:fstore_1        
	//* 604 1238:fload_1         
	//* 605 1239:fconst_0        
	//* 606 1240:fcmpl           
	//* 607 1241:ifle            1342
	//* 608 1244:aload_0         
	//* 609 1245:fload           10
	//* 610 1247:fload_1         
	//* 611 1248:invokespecial   #231 <Method float calculateFontSize(float, float)>
	//* 612 1251:fstore_2        
	//* 613 1252:aload           20
	//* 614 1254:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 615 1257:aload           21
	//* 616 1259:aload_0         
	//* 617 1260:getfield        #71  <Field String text>
	//* 618 1263:fload_2         
	//* 619 1264:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//* 620 1267:fsub            
	//* 621 1268:fconst_2        
	//* 622 1269:fdiv            
	//* 623 1270:fstore_3        
	//* 624 1271:aload           20
	//* 625 1273:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 626 1276:fload           9
	//* 627 1278:fsub            
	//* 628 1279:fload_2         
	//* 629 1280:fsub            
	//* 630 1281:fstore          4
	//* 631 1283:fload           4
	//* 632 1285:fstore_1        
	//* 633 1286:fload           4
	//* 634 1288:fload           9
	//* 635 1290:fcmpg           
	//* 636 1291:ifge            1297
	//* 637 1294:fload           9
	//* 638 1296:fstore_1        
	//* 639 1297:new             #96  <Class Rectangle>
	//* 640 1300:dup             
	//* 641 1301:aload           20
	//* 642 1303:invokevirtual   #177 <Method float Rectangle.getLeft()>
	//* 643 1306:fload           7
	//* 644 1308:fadd            
	//* 645 1309:aload           20
	//* 646 1311:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 647 1314:fload           7
	//* 648 1316:fadd            
	//* 649 1317:aload           20
	//* 650 1319:invokevirtual   #234 <Method float Rectangle.getRight()>
	//* 651 1322:fload           7
	//* 652 1324:fsub            
	//* 653 1325:aload           21
	//* 654 1327:iconst_3        
	//* 655 1328:fload_2         
	//* 656 1329:invokevirtual   #82  <Method float BaseFont.getFontDescriptor(int, float)>
	//* 657 1332:fload_1         
	//* 658 1333:fadd            
	//* 659 1334:invokespecial   #239 <Method void Rectangle(float, float, float, float)>
	//* 660 1337:astore          16
	//* 661 1339:goto            332
	//* 662 1342:ldc1            #88  <Float 4F>
	//* 663 1344:fstore_2        
	//* 664 1345:goto            1252
	//* 665 1348:aload_0         
	//* 666 1349:getfield        #71  <Field String text>
	//* 667 1352:ifnull          1379
	//* 668 1355:aload_0         
	//* 669 1356:getfield        #71  <Field String text>
	//* 670 1359:invokevirtual   #111 <Method int String.length()>
	//* 671 1362:ifeq            1379
	//* 672 1365:fload           10
	//* 673 1367:fconst_0        
	//* 674 1368:fcmpg           
	//* 675 1369:ifle            1379
	//* 676 1372:fload           11
	//* 677 1374:fconst_0        
	//* 678 1375:fcmpg           
	//* 679 1376:ifgt            1385
	//* 680 1379:iconst_2        
	//* 681 1380:istore          14
	//* 682 1382:goto            277
	//* 683 1385:aload           20
	//* 684 1387:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 685 1390:ldc1            #240 <Float 0.35F>
	//* 686 1392:fmul            
	//* 687 1393:fload           9
	//* 688 1395:fsub            
	//* 689 1396:fstore_2        
	//* 690 1397:fload_2         
	//* 691 1398:fconst_0        
	//* 692 1399:fcmpl           
	//* 693 1400:ifle            1438
	//* 694 1403:aload_0         
	//* 695 1404:fload           10
	//* 696 1406:fload_2         
	//* 697 1407:invokespecial   #231 <Method float calculateFontSize(float, float)>
	//* 698 1410:fstore_2        
	//* 699 1411:aload           21
	//* 700 1413:aload_0         
	//* 701 1414:getfield        #71  <Field String text>
	//* 702 1417:fload_2         
	//* 703 1418:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//* 704 1421:fload           10
	//* 705 1423:fcmpl           
	//* 706 1424:iflt            1444
	//* 707 1427:iconst_1        
	//* 708 1428:istore          14
	//* 709 1430:aload_0         
	//* 710 1431:getfield        #67  <Field float fontSize>
	//* 711 1434:fstore_2        
	//* 712 1435:goto            277
	//* 713 1438:ldc1            #88  <Float 4F>
	//* 714 1440:fstore_2        
	//* 715 1441:goto            1411
	//* 716 1444:fload           9
	//* 717 1446:fconst_1        
	//* 718 1447:fadd            
	//* 719 1448:fstore_3        
	//* 720 1449:aload           20
	//* 721 1451:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 722 1454:aload           21
	//* 723 1456:iconst_1        
	//* 724 1457:fload_2         
	//* 725 1458:invokevirtual   #82  <Method float BaseFont.getFontDescriptor(int, float)>
	//* 726 1461:fsub            
	//* 727 1462:fconst_2        
	//* 728 1463:fdiv            
	//* 729 1464:fstore_1        
	//* 730 1465:new             #96  <Class Rectangle>
	//* 731 1468:dup             
	//* 732 1469:aload           21
	//* 733 1471:aload_0         
	//* 734 1472:getfield        #71  <Field String text>
	//* 735 1475:fload_2         
	//* 736 1476:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//* 737 1479:fload_3         
	//* 738 1480:fadd            
	//* 739 1481:aload           20
	//* 740 1483:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 741 1486:fload           7
	//* 742 1488:fadd            
	//* 743 1489:aload           20
	//* 744 1491:invokevirtual   #234 <Method float Rectangle.getRight()>
	//* 745 1494:fload           7
	//* 746 1496:fsub            
	//* 747 1497:aload           20
	//* 748 1499:invokevirtual   #237 <Method float Rectangle.getTop()>
	//* 749 1502:fload           7
	//* 750 1504:fsub            
	//* 751 1505:invokespecial   #239 <Method void Rectangle(float, float, float, float)>
	//* 752 1508:astore          16
	//* 753 1510:goto            332
	//* 754 1513:aload_0         
	//* 755 1514:getfield        #71  <Field String text>
	//* 756 1517:ifnull          1544
	//* 757 1520:aload_0         
	//* 758 1521:getfield        #71  <Field String text>
	//* 759 1524:invokevirtual   #111 <Method int String.length()>
	//* 760 1527:ifeq            1544
	//* 761 1530:fload           10
	//* 762 1532:fconst_0        
	//* 763 1533:fcmpg           
	//* 764 1534:ifle            1544
	//* 765 1537:fload           11
	//* 766 1539:fconst_0        
	//* 767 1540:fcmpg           
	//* 768 1541:ifgt            1550
	//* 769 1544:iconst_2        
	//* 770 1545:istore          14
	//* 771 1547:goto            277
	//* 772 1550:aload           20
	//* 773 1552:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 774 1555:ldc1            #240 <Float 0.35F>
	//* 775 1557:fmul            
	//* 776 1558:fload           9
	//* 777 1560:fsub            
	//* 778 1561:fstore_2        
	//* 779 1562:fload_2         
	//* 780 1563:fconst_0        
	//* 781 1564:fcmpl           
	//* 782 1565:ifle            1603
	//* 783 1568:aload_0         
	//* 784 1569:fload           10
	//* 785 1571:fload_2         
	//* 786 1572:invokespecial   #231 <Method float calculateFontSize(float, float)>
	//* 787 1575:fstore_2        
	//* 788 1576:aload           21
	//* 789 1578:aload_0         
	//* 790 1579:getfield        #71  <Field String text>
	//* 791 1582:fload_2         
	//* 792 1583:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//* 793 1586:fload           10
	//* 794 1588:fcmpl           
	//* 795 1589:iflt            1609
	//* 796 1592:iconst_1        
	//* 797 1593:istore          14
	//* 798 1595:aload_0         
	//* 799 1596:getfield        #67  <Field float fontSize>
	//* 800 1599:fstore_2        
	//* 801 1600:goto            277
	//* 802 1603:ldc1            #88  <Float 4F>
	//* 803 1605:fstore_2        
	//* 804 1606:goto            1576
	//* 805 1609:aload           20
	//* 806 1611:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//* 807 1614:aload           21
	//* 808 1616:aload_0         
	//* 809 1617:getfield        #71  <Field String text>
	//* 810 1620:fload_2         
	//* 811 1621:invokevirtual   #77  <Method float BaseFont.getWidthPoint(String, float)>
	//* 812 1624:fsub            
	//* 813 1625:fload           9
	//* 814 1627:fsub            
	//* 815 1628:fconst_1        
	//* 816 1629:fsub            
	//* 817 1630:fstore_3        
	//* 818 1631:aload           20
	//* 819 1633:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//* 820 1636:aload           21
	//* 821 1638:iconst_1        
	//* 822 1639:fload_2         
	//* 823 1640:invokevirtual   #82  <Method float BaseFont.getFontDescriptor(int, float)>
	//* 824 1643:fsub            
	//* 825 1644:fconst_2        
	//* 826 1645:fdiv            
	//* 827 1646:fstore_1        
	//* 828 1647:new             #96  <Class Rectangle>
	//* 829 1650:dup             
	//* 830 1651:aload           20
	//* 831 1653:invokevirtual   #177 <Method float Rectangle.getLeft()>
	//* 832 1656:fload           7
	//* 833 1658:fadd            
	//* 834 1659:aload           20
	//* 835 1661:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//* 836 1664:fload           7
	//* 837 1666:fadd            
	//* 838 1667:fload_3         
	//* 839 1668:fconst_1        
	//* 840 1669:fsub            
	//* 841 1670:aload           20
	//* 842 1672:invokevirtual   #237 <Method float Rectangle.getTop()>
	//* 843 1675:fload           7
	//* 844 1677:fsub            
	//* 845 1678:invokespecial   #239 <Method void Rectangle(float, float, float, float)>
	//* 846 1681:astore          16
	//* 847 1683:goto            332
			if(template != null)
	//* 848 1686:aload_0         
	//* 849 1687:getfield        #115 <Field PdfTemplate template>
	//* 850 1690:ifnull          1816
			{
				tp = new PdfTemplate(writer);
	//  851 1693:aload_0         
	//  852 1694:new             #143 <Class PdfTemplate>
	//  853 1697:dup             
	//  854 1698:aload_0         
	//  855 1699:getfield        #147 <Field PdfWriter writer>
	//  856 1702:invokespecial   #150 <Method void PdfTemplate(PdfWriter)>
	//  857 1705:putfield        #132 <Field PdfTemplate tp>
				tp.setBoundingBox(new Rectangle(template.getWidth(), template.getHeight()));
	//  858 1708:aload_0         
	//  859 1709:getfield        #132 <Field PdfTemplate tp>
	//  860 1712:new             #96  <Class Rectangle>
	//  861 1715:dup             
	//  862 1716:aload_0         
	//  863 1717:getfield        #115 <Field PdfTemplate template>
	//  864 1720:invokevirtual   #241 <Method float PdfTemplate.getWidth()>
	//  865 1723:aload_0         
	//  866 1724:getfield        #115 <Field PdfTemplate template>
	//  867 1727:invokevirtual   #242 <Method float PdfTemplate.getHeight()>
	//  868 1730:invokespecial   #244 <Method void Rectangle(float, float)>
	//  869 1733:invokevirtual   #153 <Method void PdfTemplate.setBoundingBox(Rectangle)>
				writer.addDirectTemplateSimple(tp, PdfName.FRM);
	//  870 1736:aload_0         
	//  871 1737:getfield        #147 <Field PdfWriter writer>
	//  872 1740:aload_0         
	//  873 1741:getfield        #132 <Field PdfTemplate tp>
	//  874 1744:getstatic       #159 <Field PdfName PdfName.FRM>
	//  875 1747:invokevirtual   #165 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//  876 1750:pop             
				tp.addTemplate(template, template.getBoundingBox().getLeft(), template.getBoundingBox().getBottom());
	//  877 1751:aload_0         
	//  878 1752:getfield        #132 <Field PdfTemplate tp>
	//  879 1755:aload_0         
	//  880 1756:getfield        #115 <Field PdfTemplate template>
	//  881 1759:aload_0         
	//  882 1760:getfield        #115 <Field PdfTemplate template>
	//  883 1763:invokevirtual   #174 <Method Rectangle PdfTemplate.getBoundingBox()>
	//  884 1766:invokevirtual   #177 <Method float Rectangle.getLeft()>
	//  885 1769:aload_0         
	//  886 1770:getfield        #115 <Field PdfTemplate template>
	//  887 1773:invokevirtual   #174 <Method Rectangle PdfTemplate.getBoundingBox()>
	//  888 1776:invokevirtual   #141 <Method float Rectangle.getBottom()>
	//  889 1779:invokevirtual   #247 <Method void PdfTemplate.addTemplate(PdfTemplate, float, float)>
				i = 1;
	//  890 1782:iconst_1        
	//  891 1783:istore          14
				f6 = tp.getBoundingBox().getWidth();
	//  892 1785:aload_0         
	//  893 1786:getfield        #132 <Field PdfTemplate tp>
	//  894 1789:invokevirtual   #174 <Method Rectangle PdfTemplate.getBoundingBox()>
	//  895 1792:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//  896 1795:fstore          6
				f4 = tp.getBoundingBox().getHeight();
	//  897 1797:aload_0         
	//  898 1798:getfield        #132 <Field PdfTemplate tp>
	//  899 1801:invokevirtual   #174 <Method Rectangle PdfTemplate.getBoundingBox()>
	//  900 1804:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//  901 1807:fstore          5
				obj = ((Object) (obj2));
	//  902 1809:aload           18
	//  903 1811:astore          16
			} else
	//* 904 1813:goto            540
			{
				f4 = f3;
	//  905 1816:fload           4
	//  906 1818:fstore          5
				f6 = f;
	//  907 1820:fload_1         
	//  908 1821:fstore          6
				i = ((int) (flag));
	//  909 1823:iload           15
	//  910 1825:istore          14
				obj = ((Object) (obj2));
	//  911 1827:aload           18
	//  912 1829:astore          16
				if(iconReference != null)
	//* 913 1831:aload_0         
	//* 914 1832:getfield        #117 <Field PRIndirectReference iconReference>
	//* 915 1835:ifnull          540
				{
					PdfDictionary pdfdictionary = (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (iconReference)));
	//  916 1838:aload_0         
	//  917 1839:getfield        #117 <Field PRIndirectReference iconReference>
	//  918 1842:invokestatic    #253 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  919 1845:checkcast       #255 <Class PdfDictionary>
	//  920 1848:astore          22
					f4 = f3;
	//  921 1850:fload           4
	//  922 1852:fstore          5
					f6 = f;
	//  923 1854:fload_1         
	//  924 1855:fstore          6
					i = ((int) (flag));
	//  925 1857:iload           15
	//  926 1859:istore          14
					obj = ((Object) (obj2));
	//  927 1861:aload           18
	//  928 1863:astore          16
					if(pdfdictionary != null)
	//* 929 1865:aload           22
	//* 930 1867:ifnull          540
					{
						Rectangle rectangle = PdfReader.getNormalizedRectangle(pdfdictionary.getAsArray(PdfName.BBOX));
	//  931 1870:aload           22
	//  932 1872:getstatic       #258 <Field PdfName PdfName.BBOX>
	//  933 1875:invokevirtual   #262 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  934 1878:invokestatic    #266 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//  935 1881:astore          18
						obj = ((Object) (pdfdictionary.getAsArray(PdfName.MATRIX)));
	//  936 1883:aload           22
	//  937 1885:getstatic       #269 <Field PdfName PdfName.MATRIX>
	//  938 1888:invokevirtual   #262 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  939 1891:astore          16
						i = 1;
	//  940 1893:iconst_1        
	//  941 1894:istore          14
						f6 = rectangle.getWidth();
	//  942 1896:aload           18
	//  943 1898:invokevirtual   #136 <Method float Rectangle.getWidth()>
	//  944 1901:fstore          6
						f4 = rectangle.getHeight();
	//  945 1903:aload           18
	//  946 1905:invokevirtual   #124 <Method float Rectangle.getHeight()>
	//  947 1908:fstore          5
					}
				}
			}
		if(i == 0)
			continue; /* Loop/switch isn't completed */
		f = ((Rectangle) (obj1)).getWidth() / f6;
		f3 = ((Rectangle) (obj1)).getHeight() / f4;
		if(!proportionalIcon) goto _L9; else goto _L8
_L8:
		scaleIcon;
		JVM INSTR tableswitch 2 4: default 600
	//	               2 1941
	//	               3 1913
	//	               4 1927;
		   goto _L10 _L11 _L12 _L13
_L10:
		f = Math.min(f, f3);
_L31:
		f3 = f;
_L33:
		float f16 = ((Rectangle) (obj1)).getLeft() + (((Rectangle) (obj1)).getWidth() - f6 * f) * iconHorizontalAdjustment;
		float f17 = ((Rectangle) (obj1)).getBottom() + (((Rectangle) (obj1)).getHeight() - f4 * f3) * iconVerticalAdjustment;
		pdfappearance.saveState();
		pdfappearance.rectangle(((Rectangle) (obj1)).getLeft(), ((Rectangle) (obj1)).getBottom(), ((Rectangle) (obj1)).getWidth(), ((Rectangle) (obj1)).getHeight());
		pdfappearance.clip();
		pdfappearance.newPath();
		if(tp != null)
		{
			pdfappearance.addTemplate(tp, f, 0.0F, 0.0F, f3, f16, f17);
		} else
	//* 948 1910:goto            540
	//* 949 1913:fload_1         
	//* 950 1914:fload           4
	//* 951 1916:invokestatic    #87  <Method float Math.min(float, float)>
	//* 952 1919:fconst_1        
	//* 953 1920:invokestatic    #87  <Method float Math.min(float, float)>
	//* 954 1923:fstore_1        
	//* 955 1924:goto            607
	//* 956 1927:fload_1         
	//* 957 1928:fload           4
	//* 958 1930:invokestatic    #87  <Method float Math.min(float, float)>
	//* 959 1933:fconst_1        
	//* 960 1934:invokestatic    #130 <Method float Math.max(float, float)>
	//* 961 1937:fstore_1        
	//* 962 1938:goto            607
	//* 963 1941:fconst_1        
	//* 964 1942:fstore_1        
	//* 965 1943:goto            607
	//* 966 1946:aload_0         
	//* 967 1947:getfield        #46  <Field int scaleIcon>
	//* 968 1950:tableswitch     2 4: default 1976
	//	               2 1979
	//	               3 1987
	//	               4 2004
	//* 969 1976:goto            610
	//* 970 1979:fconst_1        
	//* 971 1980:fstore          4
	//* 972 1982:fconst_1        
	//* 973 1983:fstore_1        
	//* 974 1984:goto            610
	//* 975 1987:fload_1         
	//* 976 1988:fconst_1        
	//* 977 1989:invokestatic    #87  <Method float Math.min(float, float)>
	//* 978 1992:fstore_1        
	//* 979 1993:fload           4
	//* 980 1995:fconst_1        
	//* 981 1996:invokestatic    #87  <Method float Math.min(float, float)>
	//* 982 1999:fstore          4
	//* 983 2001:goto            610
	//* 984 2004:fload_1         
	//* 985 2005:fconst_1        
	//* 986 2006:invokestatic    #130 <Method float Math.max(float, float)>
	//* 987 2009:fstore_1        
	//* 988 2010:fload           4
	//* 989 2012:fconst_1        
	//* 990 2013:invokestatic    #130 <Method float Math.max(float, float)>
	//* 991 2016:fstore          4
	//* 992 2018:goto            610
		{
			float f15 = 0.0F;
	//  993 2021:fconst_0        
	//  994 2022:fstore          11
			float f5 = 0.0F;
	//  995 2024:fconst_0        
	//  996 2025:fstore          5
			float f13 = 0.0F;
	//  997 2027:fconst_0        
	//  998 2028:fstore          10
			float f7 = f15;
	//  999 2030:fload           11
	// 1000 2032:fstore          6
			float f10 = f13;
	// 1001 2034:fload           10
	// 1002 2036:fstore          8
			if(obj != null)
	//*1003 2038:aload           16
	//*1004 2040:ifnull          2113
			{
				f7 = f15;
	// 1005 2043:fload           11
	// 1006 2045:fstore          6
				f10 = f13;
	// 1007 2047:fload           10
	// 1008 2049:fstore          8
				if(((PdfArray) (obj)).size() == 6)
	//*1009 2051:aload           16
	//*1010 2053:invokevirtual   #274 <Method int PdfArray.size()>
	//*1011 2056:bipush          6
	//*1012 2058:icmpne          2113
				{
					PdfNumber pdfnumber = ((PdfArray) (obj)).getAsNumber(4);
	// 1013 2061:aload           16
	// 1014 2063:iconst_4        
	// 1015 2064:invokevirtual   #278 <Method PdfNumber PdfArray.getAsNumber(int)>
	// 1016 2067:astore          17
					if(pdfnumber != null)
	//*1017 2069:aload           17
	//*1018 2071:ifnull          2081
						f5 = pdfnumber.floatValue();
	// 1019 2074:aload           17
	// 1020 2076:invokevirtual   #283 <Method float PdfNumber.floatValue()>
	// 1021 2079:fstore          5
					obj = ((Object) (((PdfArray) (obj)).getAsNumber(5)));
	// 1022 2081:aload           16
	// 1023 2083:iconst_5        
	// 1024 2084:invokevirtual   #278 <Method PdfNumber PdfArray.getAsNumber(int)>
	// 1025 2087:astore          16
					f7 = f5;
	// 1026 2089:fload           5
	// 1027 2091:fstore          6
					f10 = f13;
	// 1028 2093:fload           10
	// 1029 2095:fstore          8
					if(obj != null)
	//*1030 2097:aload           16
	//*1031 2099:ifnull          2113
					{
						f10 = ((PdfNumber) (obj)).floatValue();
	// 1032 2102:aload           16
	// 1033 2104:invokevirtual   #283 <Method float PdfNumber.floatValue()>
	// 1034 2107:fstore          8
						f7 = f5;
	// 1035 2109:fload           5
	// 1036 2111:fstore          6
					}
				}
			}
			pdfappearance.addTemplateReference(((PdfIndirectReference) (iconReference)), PdfName.FRM, f, 0.0F, 0.0F, f3, f16 - f7 * f, f17 - f10 * f3);
	// 1037 2113:aload           19
	// 1038 2115:aload_0         
	// 1039 2116:getfield        #117 <Field PRIndirectReference iconReference>
	// 1040 2119:getstatic       #159 <Field PdfName PdfName.FRM>
	// 1041 2122:fload_1         
	// 1042 2123:fconst_0        
	// 1043 2124:fconst_0        
	// 1044 2125:fload           4
	// 1045 2127:fload           12
	// 1046 2129:fload           6
	// 1047 2131:fload_1         
	// 1048 2132:fmul            
	// 1049 2133:fsub            
	// 1050 2134:fload           13
	// 1051 2136:fload           8
	// 1052 2138:fload           4
	// 1053 2140:fmul            
	// 1054 2141:fsub            
	// 1055 2142:invokevirtual   #287 <Method void PdfAppearance.addTemplateReference(PdfIndirectReference, PdfName, float, float, float, float, float, float)>
		}
		pdfappearance.restoreState();
		if(Float.isNaN(f2)) goto _L15; else goto _L14
_L14:
		pdfappearance.saveState();
		pdfappearance.rectangle(f11, f11, rectangle1.getWidth() - 2.0F * f11, rectangle1.getHeight() - 2.0F * f11);
		pdfappearance.clip();
		pdfappearance.newPath();
		if(textColor == null)
			pdfappearance.resetGrayFill();
		else
	//*1056 2145:goto            722
			pdfappearance.setColorFill(textColor);
	// 1057 2148:aload           19
	// 1058 2150:aload_0         
	// 1059 2151:getfield        #208 <Field com.itextpdf.text.BaseColor textColor>
	// 1060 2154:invokevirtual   #291 <Method void PdfAppearance.setColorFill(com.itextpdf.text.BaseColor)>
		pdfappearance.beginText();
		pdfappearance.setFontAndSize(basefont, f1);
		pdfappearance.setTextMatrix(f2, f8);
		pdfappearance.showText(text);
		pdfappearance.endText();
		pdfappearance.restoreState();
		return pdfappearance;
_L2:
		f6 = f1;
		f4 = f2;
		f3 = f9;
		if(text != null)
		{
			f6 = f1;
			f4 = f2;
			f3 = f9;
			if(text.length() > 0)
			{
				f6 = f1;
				f4 = f2;
				f3 = f9;
				if(f12 > 0.0F)
				{
					f6 = f1;
					f4 = f2;
					f3 = f9;
					if(f14 > 0.0F)
					{
						f6 = calculateFontSize(f12, f14);
						f4 = (rectangle1.getWidth() - basefont.getWidthPoint(text, f6)) / 2.0F;
						f3 = (rectangle1.getHeight() - basefont.getFontDescriptor(1, f6)) / 2.0F;
					}
				}
			}
		}
_L3:
		if(i == 7) goto _L17; else goto _L16
_L16:
		f1 = f6;
		f2 = f4;
		f = f3;
		if(i != 2) goto _L1; else goto _L17
_L17:
		obj = ((Object) (new Rectangle(rectangle1.getLeft() + f8, rectangle1.getBottom() + f8, rectangle1.getRight() - f8, rectangle1.getTop() - f8)));
		f1 = f6;
		f2 = f4;
		f = f3;
		  goto _L1
_L4:
		if(text != null && text.length() != 0 && f12 > 0.0F && f14 > 0.0F) goto _L19; else goto _L18
_L18:
		i = 2;
		  goto _L20
_L19:
		f = rectangle1.getHeight() * 0.35F - f11;
		if(f > 0.0F)
			f1 = calculateFontSize(f12, f);
		else
			f1 = 4F;
		f2 = (rectangle1.getWidth() - basefont.getWidthPoint(text, f1)) / 2.0F;
		f = f11 - basefont.getFontDescriptor(3, f1);
		obj = ((Object) (new Rectangle(rectangle1.getLeft() + f8, f + f1, rectangle1.getRight() - f8, rectangle1.getTop() - f8)));
		  goto _L1
_L5:
		if(text != null && text.length() != 0 && f12 > 0.0F && f14 > 0.0F) goto _L22; else goto _L21
_L21:
		i = 2;
		  goto _L20
_L22:
		f = rectangle1.getHeight() * 0.35F - f11;
		if(f > 0.0F)
			f1 = calculateFontSize(f12, f);
		else
			f1 = 4F;
		f2 = (rectangle1.getWidth() - basefont.getWidthPoint(text, f1)) / 2.0F;
		f3 = rectangle1.getHeight() - f11 - f1;
		f = f3;
		if(f3 < f11)
			f = f11;
		obj = ((Object) (new Rectangle(rectangle1.getLeft() + f8, rectangle1.getBottom() + f8, rectangle1.getRight() - f8, basefont.getFontDescriptor(3, f1) + f)));
		  goto _L1
_L7:
		if(text != null && text.length() != 0 && f12 > 0.0F && f14 > 0.0F) goto _L24; else goto _L23
_L23:
		i = 2;
		  goto _L20
_L24:
		f1 = rectangle1.getWidth() * 0.35F - f11;
		if(f1 > 0.0F)
			f1 = calculateFontSize(f12, f1);
		else
			f1 = 4F;
		if(basefont.getWidthPoint(text, f1) < f12) goto _L26; else goto _L25
_L25:
		i = 1;
		f1 = fontSize;
		  goto _L20
_L26:
		f2 = f11 + 1.0F;
		f = (rectangle1.getHeight() - basefont.getFontDescriptor(1, f1)) / 2.0F;
		obj = ((Object) (new Rectangle(basefont.getWidthPoint(text, f1) + f2, rectangle1.getBottom() + f8, rectangle1.getRight() - f8, rectangle1.getTop() - f8)));
		  goto _L1
_L6:
		if(text != null && text.length() != 0 && f12 > 0.0F && f14 > 0.0F) goto _L28; else goto _L27
_L27:
		i = 2;
		  goto _L20
_L28:
		f1 = rectangle1.getWidth() * 0.35F - f11;
		if(f1 > 0.0F)
			f1 = calculateFontSize(f12, f1);
		else
			f1 = 4F;
		if(basefont.getWidthPoint(text, f1) < f12) goto _L30; else goto _L29
_L29:
		i = 1;
		f1 = fontSize;
		  goto _L20
_L30:
		f2 = rectangle1.getWidth() - basefont.getWidthPoint(text, f1) - f11 - 1.0F;
		f = (rectangle1.getHeight() - basefont.getFontDescriptor(1, f1)) / 2.0F;
		obj = ((Object) (new Rectangle(rectangle1.getLeft() + f8, rectangle1.getBottom() + f8, f2 - 1.0F, rectangle1.getTop() - f8)));
		  goto _L1
_L12:
		f = Math.min(Math.min(f, f3), 1.0F);
		  goto _L31
_L13:
		f = Math.max(Math.min(f, f3), 1.0F);
		  goto _L31
_L11:
		f = 1.0F;
		  goto _L31
_L9:
		switch(scaleIcon)
		{
		case 2: // '\002'
			f3 = 1.0F;
			f = 1.0F;
			break;

		case 3: // '\003'
			f = Math.min(f, 1.0F);
			f3 = Math.min(f3, 1.0F);
			break;

		case 4: // '\004'
			f = Math.max(f, 1.0F);
			f3 = Math.max(f3, 1.0F);
			break;
		}
		if(true) goto _L33; else goto _L32
_L32:
		  goto _L20
	//*1061 2157:goto            790
	}

	public PdfFormField getField()
		throws IOException, DocumentException
	{
		Object obj;
		PdfFormField pdfformfield;
		pdfformfield = PdfFormField.createPushButton(writer);
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field PdfWriter writer>
	//    2    4:invokestatic    #299 <Method PdfFormField PdfFormField.createPushButton(PdfWriter)>
	//    3    7:astore_3        
		pdfformfield.setWidget(box, PdfAnnotation.HIGHLIGHT_INVERT);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #303 <Field Rectangle box>
	//    7   13:getstatic       #308 <Field PdfName PdfAnnotation.HIGHLIGHT_INVERT>
	//    8   16:invokevirtual   #312 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
		if(fieldName != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #315 <Field String fieldName>
	//*  11   23:ifnull          64
		{
			pdfformfield.setFieldName(fieldName);
	//   12   26:aload_3         
	//   13   27:aload_0         
	//   14   28:getfield        #315 <Field String fieldName>
	//   15   31:invokevirtual   #318 <Method void PdfFormField.setFieldName(String)>
			if((options & 1) != 0)
	//*  16   34:aload_0         
	//*  17   35:getfield        #321 <Field int options>
	//*  18   38:iconst_1        
	//*  19   39:iand            
	//*  20   40:ifeq            49
				pdfformfield.setFieldFlags(1);
	//   21   43:aload_3         
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #325 <Method int PdfFormField.setFieldFlags(int)>
	//   24   48:pop             
			if((options & 2) != 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #321 <Field int options>
	//*  27   53:iconst_2        
	//*  28   54:iand            
	//*  29   55:ifeq            64
				pdfformfield.setFieldFlags(2);
	//   30   58:aload_3         
	//   31   59:iconst_2        
	//   32   60:invokevirtual   #325 <Method int PdfFormField.setFieldFlags(int)>
	//   33   63:pop             
		}
		if(text != null)
	//*  34   64:aload_0         
	//*  35   65:getfield        #71  <Field String text>
	//*  36   68:ifnull          79
			pdfformfield.setMKNormalCaption(text);
	//   37   71:aload_3         
	//   38   72:aload_0         
	//   39   73:getfield        #71  <Field String text>
	//   40   76:invokevirtual   #328 <Method void PdfFormField.setMKNormalCaption(String)>
		if(rotation != 0)
	//*  41   79:aload_0         
	//*  42   80:getfield        #331 <Field int rotation>
	//*  43   83:ifeq            94
			pdfformfield.setMKRotation(rotation);
	//   44   86:aload_3         
	//   45   87:aload_0         
	//   46   88:getfield        #331 <Field int rotation>
	//   47   91:invokevirtual   #335 <Method void PdfFormField.setMKRotation(int)>
		pdfformfield.setBorderStyle(new PdfBorderDictionary(borderWidth, borderStyle, new PdfDashPattern(3F)));
	//   48   94:aload_3         
	//   49   95:new             #337 <Class PdfBorderDictionary>
	//   50   98:dup             
	//   51   99:aload_0         
	//   52  100:getfield        #127 <Field float borderWidth>
	//   53  103:aload_0         
	//   54  104:getfield        #120 <Field int borderStyle>
	//   55  107:new             #339 <Class PdfDashPattern>
	//   56  110:dup             
	//   57  111:ldc2            #340 <Float 3F>
	//   58  114:invokespecial   #343 <Method void PdfDashPattern(float)>
	//   59  117:invokespecial   #346 <Method void PdfBorderDictionary(float, int, PdfDashPattern)>
	//   60  120:invokevirtual   #350 <Method void PdfFormField.setBorderStyle(PdfBorderDictionary)>
		obj = ((Object) (getAppearance()));
	//   61  123:aload_0         
	//   62  124:invokevirtual   #352 <Method PdfAppearance getAppearance()>
	//   63  127:astore_1        
		pdfformfield.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, ((PdfTemplate) (obj)));
	//   64  128:aload_3         
	//   65  129:getstatic       #355 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//   66  132:aload_1         
	//   67  133:invokevirtual   #359 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
		obj = ((Object) ((PdfAppearance)((PdfAppearance) (obj)).getDuplicate()));
	//   68  136:aload_1         
	//   69  137:invokevirtual   #363 <Method PdfContentByte PdfAppearance.getDuplicate()>
	//   70  140:checkcast       #98  <Class PdfAppearance>
	//   71  143:astore_1        
		((PdfAppearance) (obj)).setFontAndSize(getRealFont(), fontSize);
	//   72  144:aload_1         
	//   73  145:aload_0         
	//   74  146:invokevirtual   #64  <Method BaseFont getRealFont()>
	//   75  149:aload_0         
	//   76  150:getfield        #67  <Field float fontSize>
	//   77  153:invokevirtual   #218 <Method void PdfAppearance.setFontAndSize(BaseFont, float)>
		if(textColor == null)
	//*  78  156:aload_0         
	//*  79  157:getfield        #208 <Field com.itextpdf.text.BaseColor textColor>
	//*  80  160:ifnonnull       309
			((PdfAppearance) (obj)).setGrayFill(0.0F);
	//   81  163:aload_1         
	//   82  164:fconst_0        
	//   83  165:invokevirtual   #366 <Method void PdfAppearance.setGrayFill(float)>
		else
	//*  84  168:aload_3         
	//*  85  169:aload_1         
	//*  86  170:invokevirtual   #370 <Method void PdfFormField.setDefaultAppearanceString(PdfContentByte)>
	//*  87  173:aload_0         
	//*  88  174:getfield        #373 <Field com.itextpdf.text.BaseColor borderColor>
	//*  89  177:ifnull          188
	//*  90  180:aload_3         
	//*  91  181:aload_0         
	//*  92  182:getfield        #373 <Field com.itextpdf.text.BaseColor borderColor>
	//*  93  185:invokevirtual   #376 <Method void PdfFormField.setMKBorderColor(com.itextpdf.text.BaseColor)>
	//*  94  188:aload_0         
	//*  95  189:getfield        #379 <Field com.itextpdf.text.BaseColor backgroundColor>
	//*  96  192:ifnull          203
	//*  97  195:aload_3         
	//*  98  196:aload_0         
	//*  99  197:getfield        #379 <Field com.itextpdf.text.BaseColor backgroundColor>
	//* 100  200:invokevirtual   #382 <Method void PdfFormField.setMKBackgroundColor(com.itextpdf.text.BaseColor)>
	//* 101  203:aload_0         
	//* 102  204:getfield        #385 <Field int visibility>
	//* 103  207:tableswitch     1 3: default 232
	//	               1 320
	//	               2 237
	//	               3 329
	//* 104  232:aload_3         
	//* 105  233:iconst_4        
	//* 106  234:invokevirtual   #388 <Method void PdfFormField.setFlags(int)>
	//* 107  237:aload_0         
	//* 108  238:getfield        #132 <Field PdfTemplate tp>
	//* 109  241:ifnull          252
	//* 110  244:aload_3         
	//* 111  245:aload_0         
	//* 112  246:getfield        #132 <Field PdfTemplate tp>
	//* 113  249:invokevirtual   #392 <Method void PdfFormField.setMKNormalIcon(PdfTemplate)>
	//* 114  252:aload_3         
	//* 115  253:aload_0         
	//* 116  254:getfield        #44  <Field int layout>
	//* 117  257:iconst_1        
	//* 118  258:isub            
	//* 119  259:invokevirtual   #395 <Method void PdfFormField.setMKTextPosition(int)>
	//* 120  262:getstatic       #398 <Field PdfName PdfName.A>
	//* 121  265:astore_1        
	//* 122  266:aload_0         
	//* 123  267:getfield        #46  <Field int scaleIcon>
	//* 124  270:iconst_3        
	//* 125  271:icmpne          338
	//* 126  274:getstatic       #401 <Field PdfName PdfName.B>
	//* 127  277:astore_1        
	//* 128  278:aload_0         
	//* 129  279:getfield        #48  <Field boolean proportionalIcon>
	//* 130  282:ifeq            368
	//* 131  285:getstatic       #404 <Field PdfName PdfName.P>
	//* 132  288:astore_2        
	//* 133  289:aload_3         
	//* 134  290:aload_1         
	//* 135  291:aload_2         
	//* 136  292:aload_0         
	//* 137  293:getfield        #53  <Field float iconHorizontalAdjustment>
	//* 138  296:aload_0         
	//* 139  297:getfield        #51  <Field float iconVerticalAdjustment>
	//* 140  300:aload_0         
	//* 141  301:getfield        #138 <Field boolean iconFitToBounds>
	//* 142  304:invokevirtual   #408 <Method void PdfFormField.setMKIconFit(PdfName, PdfName, float, float, boolean)>
	//* 143  307:aload_3         
	//* 144  308:areturn         
			((PdfAppearance) (obj)).setColorFill(textColor);
	//  145  309:aload_1         
	//  146  310:aload_0         
	//  147  311:getfield        #208 <Field com.itextpdf.text.BaseColor textColor>
	//  148  314:invokevirtual   #291 <Method void PdfAppearance.setColorFill(com.itextpdf.text.BaseColor)>
		pdfformfield.setDefaultAppearanceString(((PdfContentByte) (obj)));
		if(borderColor != null)
			pdfformfield.setMKBorderColor(borderColor);
		if(backgroundColor != null)
			pdfformfield.setMKBackgroundColor(backgroundColor);
		visibility;
		JVM INSTR tableswitch 1 3: default 232
	//	               1 320
	//	               2 237
	//	               3 329;
		   goto _L1 _L2 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_329;
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		pdfformfield.setFlags(4);
_L5:
		if(tp != null)
			pdfformfield.setMKNormalIcon(tp);
		pdfformfield.setMKTextPosition(layout - 1);
		obj = ((Object) (PdfName.A));
		PdfName pdfname;
		if(scaleIcon == 3)
			obj = ((Object) (PdfName.B));
		else
	//* 149  317:goto            168
	//* 150  320:aload_3         
	//* 151  321:bipush          6
	//* 152  323:invokevirtual   #388 <Method void PdfFormField.setFlags(int)>
	//* 153  326:goto            237
	//* 154  329:aload_3         
	//* 155  330:bipush          36
	//* 156  332:invokevirtual   #388 <Method void PdfFormField.setFlags(int)>
	//* 157  335:goto            237
		if(scaleIcon == 4)
	//* 158  338:aload_0         
	//* 159  339:getfield        #46  <Field int scaleIcon>
	//* 160  342:iconst_4        
	//* 161  343:icmpne          353
			obj = ((Object) (PdfName.S));
	//  162  346:getstatic       #411 <Field PdfName PdfName.S>
	//  163  349:astore_1        
		else
	//* 164  350:goto            278
		if(scaleIcon == 2)
	//* 165  353:aload_0         
	//* 166  354:getfield        #46  <Field int scaleIcon>
	//* 167  357:iconst_2        
	//* 168  358:icmpne          278
			obj = ((Object) (PdfName.N));
	//  169  361:getstatic       #414 <Field PdfName PdfName.N>
	//  170  364:astore_1        
		if(proportionalIcon)
			pdfname = PdfName.P;
		else
	//* 171  365:goto            278
			pdfname = PdfName.A;
	//  172  368:getstatic       #398 <Field PdfName PdfName.A>
	//  173  371:astore_2        
		pdfformfield.setMKIconFit(((PdfName) (obj)), pdfname, iconHorizontalAdjustment, iconVerticalAdjustment, iconFitToBounds);
		return pdfformfield;
_L2:
		pdfformfield.setFlags(6);
		  goto _L5
		pdfformfield.setFlags(36);
		  goto _L5
	//* 174  372:goto            289
	}

	public float getIconHorizontalAdjustment()
	{
		return iconHorizontalAdjustment;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field float iconHorizontalAdjustment>
	//    2    4:freturn         
	}

	public PRIndirectReference getIconReference()
	{
		return iconReference;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field PRIndirectReference iconReference>
	//    2    4:areturn         
	}

	public float getIconVerticalAdjustment()
	{
		return iconVerticalAdjustment;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float iconVerticalAdjustment>
	//    2    4:freturn         
	}

	public Image getImage()
	{
		return image;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Image image>
	//    2    4:areturn         
	}

	public int getLayout()
	{
		return layout;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int layout>
	//    2    4:ireturn         
	}

	public int getScaleIcon()
	{
		return scaleIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int scaleIcon>
	//    2    4:ireturn         
	}

	public PdfTemplate getTemplate()
	{
		return template;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field PdfTemplate template>
	//    2    4:areturn         
	}

	public boolean isIconFitToBounds()
	{
		return iconFitToBounds;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field boolean iconFitToBounds>
	//    2    4:ireturn         
	}

	public boolean isProportionalIcon()
	{
		return proportionalIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean proportionalIcon>
	//    2    4:ireturn         
	}

	public void setIconFitToBounds(boolean flag)
	{
		iconFitToBounds = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #138 <Field boolean iconFitToBounds>
	//    3    5:return          
	}

	public void setIconHorizontalAdjustment(float f)
	{
		if(f >= 0.0F) goto _L2; else goto _L1
	//    0    0:fload_1         
	//    1    1:fconst_0        
	//    2    2:fcmpg           
	//    3    3:ifge            14
_L1:
		float f1 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore_2        
_L4:
		iconHorizontalAdjustment = f1;
	//    6    8:aload_0         
	//    7    9:fload_2         
	//    8   10:putfield        #53  <Field float iconHorizontalAdjustment>
		return;
	//    9   13:return          
_L2:
		f1 = f;
	//   10   14:fload_1         
	//   11   15:fstore_2        
		if(f > 1.0F)
	//*  12   16:fload_1         
	//*  13   17:fconst_1        
	//*  14   18:fcmpl           
	//*  15   19:ifle            8
			f1 = 1.0F;
	//   16   22:fconst_1        
	//   17   23:fstore_2        
		if(true) goto _L4; else goto _L3
	//   18   24:goto            8
_L3:
	}

	public void setIconReference(PRIndirectReference prindirectreference)
	{
		iconReference = prindirectreference;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field PRIndirectReference iconReference>
	//    3    5:return          
	}

	public void setIconVerticalAdjustment(float f)
	{
		if(f >= 0.0F) goto _L2; else goto _L1
	//    0    0:fload_1         
	//    1    1:fconst_0        
	//    2    2:fcmpg           
	//    3    3:ifge            14
_L1:
		float f1 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore_2        
_L4:
		iconVerticalAdjustment = f1;
	//    6    8:aload_0         
	//    7    9:fload_2         
	//    8   10:putfield        #51  <Field float iconVerticalAdjustment>
		return;
	//    9   13:return          
_L2:
		f1 = f;
	//   10   14:fload_1         
	//   11   15:fstore_2        
		if(f > 1.0F)
	//*  12   16:fload_1         
	//*  13   17:fconst_1        
	//*  14   18:fcmpl           
	//*  15   19:ifle            8
			f1 = 1.0F;
	//   16   22:fconst_1        
	//   17   23:fstore_2        
		if(true) goto _L4; else goto _L3
	//   18   24:goto            8
_L3:
	}

	public void setImage(Image image1)
	{
		image = image1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field Image image>
		template = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #115 <Field PdfTemplate template>
	//    6   10:return          
	}

	public void setLayout(int i)
	{
		if(i < 1 || i > 7)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          11
	//*   3    5:iload_1         
	//*   4    6:bipush          7
	//*   5    8:icmple          29
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("layout.out.of.bounds", new Object[0]));
	//    6   11:new             #438 <Class IllegalArgumentException>
	//    7   14:dup             
	//    8   15:ldc2            #440 <String "layout.out.of.bounds">
	//    9   18:iconst_0        
	//   10   19:anewarray       Object[]
	//   11   22:invokestatic    #448 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   25:invokespecial   #450 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		} else
		{
			layout = i;
	//   14   29:aload_0         
	//   15   30:iload_1         
	//   16   31:putfield        #44  <Field int layout>
			return;
	//   17   34:return          
		}
	}

	public void setProportionalIcon(boolean flag)
	{
		proportionalIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean proportionalIcon>
	//    3    5:return          
	}

	public void setScaleIcon(int i)
	{
		int j;
label0:
		{
			if(i >= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          12
			{
				j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
				if(i <= 4)
					break label0;
	//    5    7:iload_1         
	//    6    8:iconst_4        
	//    7    9:icmple          14
			}
			j = 1;
	//    8   12:iconst_1        
	//    9   13:istore_2        
		}
		scaleIcon = j;
	//   10   14:aload_0         
	//   11   15:iload_2         
	//   12   16:putfield        #46  <Field int scaleIcon>
	//   13   19:return          
	}

	public void setTemplate(PdfTemplate pdftemplate)
	{
		template = pdftemplate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field PdfTemplate template>
		image = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #113 <Field Image image>
	//    6   10:return          
	}

	public static final int LAYOUT_ICON_LEFT_LABEL_RIGHT = 5;
	public static final int LAYOUT_ICON_ONLY = 2;
	public static final int LAYOUT_ICON_TOP_LABEL_BOTTOM = 3;
	public static final int LAYOUT_LABEL_LEFT_ICON_RIGHT = 6;
	public static final int LAYOUT_LABEL_ONLY = 1;
	public static final int LAYOUT_LABEL_OVER_ICON = 7;
	public static final int LAYOUT_LABEL_TOP_ICON_BOTTOM = 4;
	public static final int SCALE_ICON_ALWAYS = 1;
	public static final int SCALE_ICON_IS_TOO_BIG = 3;
	public static final int SCALE_ICON_IS_TOO_SMALL = 4;
	public static final int SCALE_ICON_NEVER = 2;
	private boolean iconFitToBounds;
	private float iconHorizontalAdjustment;
	private PRIndirectReference iconReference;
	private float iconVerticalAdjustment;
	private Image image;
	private int layout;
	private boolean proportionalIcon;
	private int scaleIcon;
	private PdfTemplate template;
	private PdfTemplate tp;
}
