// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.StreamUtil;
import com.itextpdf.text.pdf.fonts.FontsResourceAnchor;
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont, RandomAccessFileOrArray, PdfEncodings, Pfm2afm, 
//			PdfDictionary, PdfName, PdfNumber, PdfArray, 
//			PdfRectangle, GlyphList, PdfWriter, PdfIndirectObject, 
//			PdfIndirectReference, PdfStream

class Type1Font extends BaseFont
{

	Type1Font(String s, String s1, boolean flag, byte abyte0[], byte abyte1[], boolean flag1)
		throws DocumentException, IOException
	{
		Object obj;
		byte abyte2[];
		Object obj1;
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void BaseFont()>
		Weight = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #58  <String "">
	//    4    7:putfield        #60  <Field String Weight>
		ItalicAngle = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #62  <Field float ItalicAngle>
		IsFixedPitch = false;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #64  <Field boolean IsFixedPitch>
		llx = -50;
	//   11   20:aload_0         
	//   12   21:bipush          -50
	//   13   23:putfield        #66  <Field int llx>
		lly = -200;
	//   14   26:aload_0         
	//   15   27:sipush          -200
	//   16   30:putfield        #68  <Field int lly>
		urx = 1000;
	//   17   33:aload_0         
	//   18   34:sipush          1000
	//   19   37:putfield        #70  <Field int urx>
		ury = 900;
	//   20   40:aload_0         
	//   21   41:sipush          900
	//   22   44:putfield        #72  <Field int ury>
		UnderlinePosition = -100;
	//   23   47:aload_0         
	//   24   48:bipush          -100
	//   25   50:putfield        #74  <Field int UnderlinePosition>
		UnderlineThickness = 50;
	//   26   53:aload_0         
	//   27   54:bipush          50
	//   28   56:putfield        #76  <Field int UnderlineThickness>
		EncodingScheme = "FontSpecific";
	//   29   59:aload_0         
	//   30   60:ldc1            #78  <String "FontSpecific">
	//   31   62:putfield        #80  <Field String EncodingScheme>
		CapHeight = 700;
	//   32   65:aload_0         
	//   33   66:sipush          700
	//   34   69:putfield        #82  <Field int CapHeight>
		XHeight = 480;
	//   35   72:aload_0         
	//   36   73:sipush          480
	//   37   76:putfield        #84  <Field int XHeight>
		Ascender = 800;
	//   38   79:aload_0         
	//   39   80:sipush          800
	//   40   83:putfield        #86  <Field int Ascender>
		Descender = -200;
	//   41   86:aload_0         
	//   42   87:sipush          -200
	//   43   90:putfield        #88  <Field int Descender>
		StdVW = 80;
	//   44   93:aload_0         
	//   45   94:bipush          80
	//   46   96:putfield        #90  <Field int StdVW>
		CharMetrics = new HashMap();
	//   47   99:aload_0         
	//   48  100:new             #92  <Class HashMap>
	//   49  103:dup             
	//   50  104:invokespecial   #93  <Method void HashMap()>
	//   51  107:putfield        #95  <Field HashMap CharMetrics>
		KernPairs = new HashMap();
	//   52  110:aload_0         
	//   53  111:new             #92  <Class HashMap>
	//   54  114:dup             
	//   55  115:invokespecial   #93  <Method void HashMap()>
	//   56  118:putfield        #97  <Field HashMap KernPairs>
		builtinFont = false;
	//   57  121:aload_0         
	//   58  122:iconst_0        
	//   59  123:putfield        #99  <Field boolean builtinFont>
		if(flag && abyte0 != null && abyte1 == null)
	//*  60  126:iload_3         
	//*  61  127:ifeq            157
	//*  62  130:aload           4
	//*  63  132:ifnull          157
	//*  64  135:aload           5
	//*  65  137:ifnonnull       157
			throw new DocumentException(MessageLocalization.getComposedMessage("two.byte.arrays.are.needed.if.the.type1.font.is.embedded", new Object[0]));
	//   66  140:new             #50  <Class DocumentException>
	//   67  143:dup             
	//   68  144:ldc1            #101 <String "two.byte.arrays.are.needed.if.the.type1.font.is.embedded">
	//   69  146:iconst_0        
	//   70  147:anewarray       Object[]
	//   71  150:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   72  153:invokespecial   #112 <Method void DocumentException(String)>
	//   73  156:athrow          
		if(flag && abyte0 != null)
	//*  74  157:iload_3         
	//*  75  158:ifeq            172
	//*  76  161:aload           4
	//*  77  163:ifnull          172
			pfb = abyte1;
	//   78  166:aload_0         
	//   79  167:aload           5
	//   80  169:putfield        #114 <Field byte[] pfb>
		encoding = s1;
	//   81  172:aload_0         
	//   82  173:aload_2         
	//   83  174:putfield        #117 <Field String encoding>
		embedded = flag;
	//   84  177:aload_0         
	//   85  178:iload_3         
	//   86  179:putfield        #120 <Field boolean embedded>
		fileName = s;
	//   87  182:aload_0         
	//   88  183:aload_1         
	//   89  184:putfield        #122 <Field String fileName>
		fontType = 0;
	//   90  187:aload_0         
	//   91  188:iconst_0        
	//   92  189:putfield        #125 <Field int fontType>
		obj1 = null;
	//   93  192:aconst_null     
	//   94  193:astore          10
		abyte2 = null;
	//   95  195:aconst_null     
	//   96  196:astore          9
		abyte1 = null;
	//   97  198:aconst_null     
	//   98  199:astore          5
		obj = null;
	//   99  201:aconst_null     
	//  100  202:astore          8
		if(!BuiltinFonts14.containsKey(((Object) (s)))) goto _L2; else goto _L1
	//  101  204:getstatic       #128 <Field HashMap BuiltinFonts14>
	//  102  207:aload_1         
	//  103  208:invokevirtual   #132 <Method boolean HashMap.containsKey(Object)>
	//  104  211:ifeq            522
_L1:
		embedded = false;
	//  105  214:aload_0         
	//  106  215:iconst_0        
	//  107  216:putfield        #120 <Field boolean embedded>
		builtinFont = true;
	//  108  219:aload_0         
	//  109  220:iconst_1        
	//  110  221:putfield        #99  <Field boolean builtinFont>
		abyte2 = new byte[1024];
	//  111  224:sipush          1024
	//  112  227:newarray        byte[]
	//  113  229:astore          9
		abyte0 = ((byte []) (obj));
	//  114  231:aload           8
	//  115  233:astore          4
		if(resourceAnchor != null)
			break MISSING_BLOCK_LABEL_255;
	//  116  235:getstatic       #134 <Field FontsResourceAnchor resourceAnchor>
	//  117  238:ifnonnull       255
		abyte0 = ((byte []) (obj));
	//  118  241:aload           8
	//  119  243:astore          4
		resourceAnchor = new FontsResourceAnchor();
	//  120  245:new             #136 <Class FontsResourceAnchor>
	//  121  248:dup             
	//  122  249:invokespecial   #137 <Method void FontsResourceAnchor()>
	//  123  252:putstatic       #134 <Field FontsResourceAnchor resourceAnchor>
		abyte0 = ((byte []) (obj));
	//  124  255:aload           8
	//  125  257:astore          4
		obj = ((Object) (StreamUtil.getResourceStream((new StringBuilder()).append("com/itextpdf/text/pdf/fonts/").append(s).append(".afm").toString(), ((Object) (resourceAnchor)).getClass().getClassLoader())));
	//  126  259:new             #139 <Class StringBuilder>
	//  127  262:dup             
	//  128  263:invokespecial   #140 <Method void StringBuilder()>
	//  129  266:ldc1            #142 <String "com/itextpdf/text/pdf/fonts/">
	//  130  268:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  131  271:aload_1         
	//  132  272:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  133  275:ldc1            #148 <String ".afm">
	//  134  277:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  135  280:invokevirtual   #152 <Method String StringBuilder.toString()>
	//  136  283:getstatic       #134 <Field FontsResourceAnchor resourceAnchor>
	//  137  286:invokevirtual   #156 <Method Class Object.getClass()>
	//  138  289:invokevirtual   #162 <Method ClassLoader Class.getClassLoader()>
	//  139  292:invokestatic    #168 <Method InputStream StreamUtil.getResourceStream(String, ClassLoader)>
	//  140  295:astore          8
		if(obj != null)
			break MISSING_BLOCK_LABEL_357;
	//  141  297:aload           8
	//  142  299:ifnonnull       357
		abyte0 = ((byte []) (obj));
	//  143  302:aload           8
	//  144  304:astore          4
		s = MessageLocalization.getComposedMessage("1.not.found.as.resource", new Object[] {
			s
		});
	//  145  306:ldc1            #170 <String "1.not.found.as.resource">
	//  146  308:iconst_1        
	//  147  309:anewarray       Object[]
	//  148  312:dup             
	//  149  313:iconst_0        
	//  150  314:aload_1         
	//  151  315:aastore         
	//  152  316:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  153  319:astore_1        
		abyte0 = ((byte []) (obj));
	//  154  320:aload           8
	//  155  322:astore          4
		System.err.println(s);
	//  156  324:getstatic       #176 <Field PrintStream System.err>
	//  157  327:aload_1         
	//  158  328:invokevirtual   #181 <Method void PrintStream.println(String)>
		abyte0 = ((byte []) (obj));
	//  159  331:aload           8
	//  160  333:astore          4
		throw new DocumentException(s);
	//  161  335:new             #50  <Class DocumentException>
	//  162  338:dup             
	//  163  339:aload_1         
	//  164  340:invokespecial   #112 <Method void DocumentException(String)>
	//  165  343:athrow          
		s;
	//  166  344:astore_1        
		int i;
		if(abyte0 != null)
	//* 167  345:aload           4
	//* 168  347:ifnull          355
			try
			{
				((InputStream) (abyte0)).close();
	//  169  350:aload           4
	//  170  352:invokevirtual   #186 <Method void InputStream.close()>
			}
	//* 171  355:aload_1         
	//* 172  356:athrow          
	//* 173  357:aload           8
	//* 174  359:astore          4
	//* 175  361:new             #188 <Class ByteArrayOutputStream>
	//* 176  364:dup             
	//* 177  365:invokespecial   #189 <Method void ByteArrayOutputStream()>
	//* 178  368:astore_1        
	//* 179  369:aload           8
	//* 180  371:astore          4
	//* 181  373:aload           8
	//* 182  375:aload           9
	//* 183  377:invokevirtual   #193 <Method int InputStream.read(byte[])>
	//* 184  380:istore          7
	//* 185  382:iload           7
	//* 186  384:ifge            492
	//* 187  387:aload           8
	//* 188  389:astore          4
	//* 189  391:aload_1         
	//* 190  392:invokevirtual   #197 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 191  395:astore_1        
	//* 192  396:aload           8
	//* 193  398:ifnull          406
	//* 194  401:aload           8
	//* 195  403:invokevirtual   #186 <Method void InputStream.close()>
	//* 196  406:new             #199 <Class RandomAccessFileOrArray>
	//* 197  409:dup             
	//* 198  410:aload_1         
	//* 199  411:invokespecial   #202 <Method void RandomAccessFileOrArray(byte[])>
	//* 200  414:astore_1        
	//* 201  415:aload_0         
	//* 202  416:aload_1         
	//* 203  417:invokevirtual   #206 <Method void process(RandomAccessFileOrArray)>
	//* 204  420:aload_1         
	//* 205  421:ifnull          428
	//* 206  424:aload_1         
	//* 207  425:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 208  428:aload_0         
	//* 209  429:aload_0         
	//* 210  430:getfield        #80  <Field String EncodingScheme>
	//* 211  433:invokevirtual   #212 <Method String String.trim()>
	//* 212  436:putfield        #80  <Field String EncodingScheme>
	//* 213  439:aload_0         
	//* 214  440:getfield        #80  <Field String EncodingScheme>
	//* 215  443:ldc1            #214 <String "AdobeStandardEncoding">
	//* 216  445:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 217  448:ifne            463
	//* 218  451:aload_0         
	//* 219  452:getfield        #80  <Field String EncodingScheme>
	//* 220  455:ldc1            #219 <String "StandardEncoding">
	//* 221  457:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 222  460:ifeq            468
	//* 223  463:aload_0         
	//* 224  464:iconst_0        
	//* 225  465:putfield        #222 <Field boolean fontSpecific>
	//* 226  468:aload_0         
	//* 227  469:getfield        #117 <Field String encoding>
	//* 228  472:ldc1            #224 <String "#">
	//* 229  474:invokevirtual   #228 <Method boolean String.startsWith(String)>
	//* 230  477:ifne            487
	//* 231  480:ldc1            #230 <String " ">
	//* 232  482:aload_2         
	//* 233  483:invokestatic    #236 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//* 234  486:pop             
	//* 235  487:aload_0         
	//* 236  488:invokevirtual   #239 <Method void createEncoding()>
	//* 237  491:return          
	//* 238  492:aload           8
	//* 239  494:astore          4
	//* 240  496:aload_1         
	//* 241  497:aload           9
	//* 242  499:iconst_0        
	//* 243  500:iload           7
	//* 244  502:invokevirtual   #243 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//* 245  505:goto            369
	//* 246  508:astore_1        
	//* 247  509:aload           5
	//* 248  511:astore_2        
	//* 249  512:aload_2         
	//* 250  513:ifnull          520
	//* 251  516:aload_2         
	//* 252  517:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 253  520:aload_1         
	//* 254  521:athrow          
	//* 255  522:aload_1         
	//* 256  523:invokevirtual   #246 <Method String String.toLowerCase()>
	//* 257  526:ldc1            #148 <String ".afm">
	//* 258  528:invokevirtual   #249 <Method boolean String.endsWith(String)>
	//* 259  531:ifeq            610
	//* 260  534:aload           4
	//* 261  536:ifnonnull       580
	//* 262  539:aload           10
	//* 263  541:astore          5
	//* 264  543:new             #199 <Class RandomAccessFileOrArray>
	//* 265  546:dup             
	//* 266  547:aload_1         
	//* 267  548:iload           6
	//* 268  550:getstatic       #254 <Field boolean Document.plainRandomAccess>
	//* 269  553:invokespecial   #257 <Method void RandomAccessFileOrArray(String, boolean, boolean)>
	//* 270  556:astore_1        
	//* 271  557:aload_1         
	//* 272  558:astore          5
	//* 273  560:aload_0         
	//* 274  561:aload_1         
	//* 275  562:invokevirtual   #206 <Method void process(RandomAccessFileOrArray)>
	//* 276  565:aload_1         
	//* 277  566:ifnull          428
	//* 278  569:aload_1         
	//* 279  570:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 280  573:goto            428
	//* 281  576:astore_1        
	//* 282  577:goto            428
	//* 283  580:aload           10
	//* 284  582:astore          5
	//* 285  584:new             #199 <Class RandomAccessFileOrArray>
	//* 286  587:dup             
	//* 287  588:aload           4
	//* 288  590:invokespecial   #202 <Method void RandomAccessFileOrArray(byte[])>
	//* 289  593:astore_1        
	//* 290  594:goto            557
	//* 291  597:astore_1        
	//* 292  598:aload           5
	//* 293  600:ifnull          608
	//* 294  603:aload           5
	//* 295  605:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 296  608:aload_1         
	//* 297  609:athrow          
	//* 298  610:aload_1         
	//* 299  611:invokevirtual   #246 <Method String String.toLowerCase()>
	//* 300  614:ldc2            #259 <String ".pfm">
	//* 301  617:invokevirtual   #249 <Method boolean String.endsWith(String)>
	//* 302  620:ifeq            740
	//* 303  623:aload           9
	//* 304  625:astore          5
	//* 305  627:new             #188 <Class ByteArrayOutputStream>
	//* 306  630:dup             
	//* 307  631:invokespecial   #189 <Method void ByteArrayOutputStream()>
	//* 308  634:astore          8
	//* 309  636:aload           4
	//* 310  638:ifnonnull       710
	//* 311  641:aload           9
	//* 312  643:astore          5
	//* 313  645:new             #199 <Class RandomAccessFileOrArray>
	//* 314  648:dup             
	//* 315  649:aload_1         
	//* 316  650:iload           6
	//* 317  652:getstatic       #254 <Field boolean Document.plainRandomAccess>
	//* 318  655:invokespecial   #257 <Method void RandomAccessFileOrArray(String, boolean, boolean)>
	//* 319  658:astore_1        
	//* 320  659:aload_1         
	//* 321  660:aload           8
	//* 322  662:invokestatic    #265 <Method void Pfm2afm.convert(RandomAccessFileOrArray, java.io.OutputStream)>
	//* 323  665:aload_1         
	//* 324  666:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 325  669:new             #199 <Class RandomAccessFileOrArray>
	//* 326  672:dup             
	//* 327  673:aload           8
	//* 328  675:invokevirtual   #197 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 329  678:invokespecial   #202 <Method void RandomAccessFileOrArray(byte[])>
	//* 330  681:astore          4
	//* 331  683:aload           4
	//* 332  685:astore          5
	//* 333  687:aload_0         
	//* 334  688:aload           4
	//* 335  690:invokevirtual   #206 <Method void process(RandomAccessFileOrArray)>
	//* 336  693:aload           4
	//* 337  695:ifnull          428
	//* 338  698:aload           4
	//* 339  700:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 340  703:goto            428
	//* 341  706:astore_1        
	//* 342  707:goto            428
	//* 343  710:aload           9
	//* 344  712:astore          5
	//* 345  714:new             #199 <Class RandomAccessFileOrArray>
	//* 346  717:dup             
	//* 347  718:aload           4
	//* 348  720:invokespecial   #202 <Method void RandomAccessFileOrArray(byte[])>
	//* 349  723:astore_1        
	//* 350  724:goto            659
	//* 351  727:astore_1        
	//* 352  728:aload           5
	//* 353  730:ifnull          738
	//* 354  733:aload           5
	//* 355  735:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 356  738:aload_1         
	//* 357  739:athrow          
	//* 358  740:new             #50  <Class DocumentException>
	//* 359  743:dup             
	//* 360  744:ldc2            #267 <String "1.is.not.an.afm.or.pfm.font.file">
	//* 361  747:iconst_1        
	//* 362  748:anewarray       Object[]
	//* 363  751:dup             
	//* 364  752:iconst_0        
	//* 365  753:aload_1         
	//* 366  754:aastore         
	//* 367  755:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 368  758:invokespecial   #112 <Method void DocumentException(String)>
	//* 369  761:athrow          
	//* 370  762:astore          4
	//* 371  764:goto            406
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  372  767:astore_2        
		throw s;
		abyte0 = ((byte []) (obj));
		s = ((String) (new ByteArrayOutputStream()));
_L4:
		abyte0 = ((byte []) (obj));
		i = ((InputStream) (obj)).read(abyte2);
		if(i >= 0)
			break MISSING_BLOCK_LABEL_492;
		abyte0 = ((byte []) (obj));
		s = ((String) (((ByteArrayOutputStream) (s)).toByteArray()));
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[]) { }
		s = ((String) (new RandomAccessFileOrArray(((byte []) (s)))));
		process(((RandomAccessFileOrArray) (s)));
		if(s != null)
			try
			{
				((RandomAccessFileOrArray) (s)).close();
			}
	//* 373  768:goto            355
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//  374  771:astore_1        
		EncodingScheme = EncodingScheme.trim();
		if(EncodingScheme.equals("AdobeStandardEncoding") || EncodingScheme.equals("StandardEncoding"))
			fontSpecific = false;
		if(!encoding.startsWith("#"))
			PdfEncodings.convertToBytes(" ", s1);
		createEncoding();
		return;
		abyte0 = ((byte []) (obj));
		((ByteArrayOutputStream) (s)).write(abyte2, 0, i);
		if(true) goto _L4; else goto _L3
_L3:
		s;
		s1 = ((String) (abyte1));
_L17:
		if(s1 != null)
			try
			{
				((RandomAccessFileOrArray) (s1)).close();
			}
	//* 375  772:goto            428
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  376  775:astore_2        
		throw s;
_L2:
		if(!s.toLowerCase().endsWith(".afm"))
			break MISSING_BLOCK_LABEL_610;
		if(abyte0 != null) goto _L6; else goto _L5
_L5:
		abyte1 = ((byte []) (obj1));
		s = ((String) (new RandomAccessFileOrArray(s, flag1, Document.plainRandomAccess)));
_L8:
		abyte1 = ((byte []) (s));
		process(((RandomAccessFileOrArray) (s)));
		if(s != null)
			try
			{
				((RandomAccessFileOrArray) (s)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s) { }
		break MISSING_BLOCK_LABEL_428;
_L6:
		abyte1 = ((byte []) (obj1));
		s = ((String) (new RandomAccessFileOrArray(abyte0)));
		if(true) goto _L8; else goto _L7
_L7:
		s;
		if(abyte1 != null)
			try
			{
				((RandomAccessFileOrArray) (abyte1)).close();
			}
	//* 377  776:goto            520
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  378  779:astore_2        
		throw s;
		if(!s.toLowerCase().endsWith(".pfm")) goto _L10; else goto _L9
_L9:
		abyte1 = abyte2;
		obj = ((Object) (new ByteArrayOutputStream()));
		if(abyte0 != null) goto _L12; else goto _L11
_L11:
		abyte1 = abyte2;
		s = ((String) (new RandomAccessFileOrArray(s, flag1, Document.plainRandomAccess)));
_L13:
		Pfm2afm.convert(((RandomAccessFileOrArray) (s)), ((java.io.OutputStream) (obj)));
		((RandomAccessFileOrArray) (s)).close();
		abyte0 = ((byte []) (new RandomAccessFileOrArray(((ByteArrayOutputStream) (obj)).toByteArray())));
		abyte1 = abyte0;
		process(((RandomAccessFileOrArray) (abyte0)));
		if(abyte0 != null)
			try
			{
				((RandomAccessFileOrArray) (abyte0)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s) { }
		break MISSING_BLOCK_LABEL_428;
_L12:
		abyte1 = abyte2;
		s = ((String) (new RandomAccessFileOrArray(abyte0)));
		  goto _L13
		s;
_L15:
		if(abyte1 != null)
			try
			{
				((RandomAccessFileOrArray) (abyte1)).close();
			}
	//* 379  780:goto            608
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  380  783:astore_2        
		throw s;
_L10:
		throw new DocumentException(MessageLocalization.getComposedMessage("1.is.not.an.afm.or.pfm.font.file", new Object[] {
			s
		}));
	//* 381  784:goto            738
		s1;
	//  382  787:astore_2        
		abyte1 = ((byte []) (s));
	//  383  788:aload_1         
	//  384  789:astore          5
		s = s1;
	//  385  791:aload_2         
	//  386  792:astore_1        
		if(true) goto _L15; else goto _L14
	//  387  793:goto            728
_L14:
		abyte0;
	//  388  796:astore          4
		s1 = s;
	//  389  798:aload_1         
	//  390  799:astore_2        
		s = ((String) (abyte0));
	//  391  800:aload           4
	//  392  802:astore_1        
		if(true) goto _L17; else goto _L16
	//  393  803:goto            512
_L16:
	}

	private PdfDictionary getFontBaseType(PdfIndirectReference pdfindirectreference, int i, int j, byte abyte0[])
	{
		int k;
		int l;
		Object obj;
		PdfDictionary pdfdictionary;
		pdfdictionary = new PdfDictionary(PdfName.FONT);
	//    0    0:new             #272 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #278 <Field PdfName PdfName.FONT>
	//    3    7:invokespecial   #281 <Method void PdfDictionary(PdfName)>
	//    4   10:astore          10
		pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE1)));
	//    5   12:aload           10
	//    6   14:getstatic       #284 <Field PdfName PdfName.SUBTYPE>
	//    7   17:getstatic       #287 <Field PdfName PdfName.TYPE1>
	//    8   20:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName(FontName))));
	//    9   23:aload           10
	//   10   25:getstatic       #294 <Field PdfName PdfName.BASEFONT>
	//   11   28:new             #274 <Class PdfName>
	//   12   31:dup             
	//   13   32:aload_0         
	//   14   33:getfield        #296 <Field String FontName>
	//   15   36:invokespecial   #297 <Method void PdfName(String)>
	//   16   39:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
		boolean flag;
		PdfName pdfname;
		if(encoding.equals("Cp1252") || encoding.equals("MacRoman"))
	//*  17   42:aload_0         
	//*  18   43:getfield        #117 <Field String encoding>
	//*  19   46:ldc2            #299 <String "Cp1252">
	//*  20   49:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  21   52:ifne            68
	//*  22   55:aload_0         
	//*  23   56:getfield        #117 <Field String encoding>
	//*  24   59:ldc2            #301 <String "MacRoman">
	//*  25   62:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  26   65:ifeq            269
			flag = true;
	//   27   68:iconst_1        
	//   28   69:istore          7
		else
	//*  29   71:aload_0         
	//*  30   72:getfield        #222 <Field boolean fontSpecific>
	//*  31   75:ifeq            88
	//*  32   78:iload_2         
	//*  33   79:istore          5
	//*  34   81:aload_0         
	//*  35   82:getfield        #305 <Field IntHashtable specialMap>
	//*  36   85:ifnull          157
	//*  37   88:iload_2         
	//*  38   89:istore          6
	//*  39   91:iload_2         
	//*  40   92:istore          5
	//*  41   94:iload           6
	//*  42   96:iload_3         
	//*  43   97:icmpgt          120
	//*  44  100:aload_0         
	//*  45  101:getfield        #309 <Field String[] differences>
	//*  46  104:iload           6
	//*  47  106:aaload          
	//*  48  107:ldc2            #311 <String ".notdef">
	//*  49  110:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  50  113:ifne            275
	//*  51  116:iload           6
	//*  52  118:istore          5
	//*  53  120:iload           7
	//*  54  122:ifeq            292
	//*  55  125:getstatic       #314 <Field PdfName PdfName.ENCODING>
	//*  56  128:astore          11
	//*  57  130:aload_0         
	//*  58  131:getfield        #117 <Field String encoding>
	//*  59  134:ldc2            #299 <String "Cp1252">
	//*  60  137:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  61  140:ifeq            284
	//*  62  143:getstatic       #317 <Field PdfName PdfName.WIN_ANSI_ENCODING>
	//*  63  146:astore          9
	//*  64  148:aload           10
	//*  65  150:aload           11
	//*  66  152:aload           9
	//*  67  154:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  68  157:aload_0         
	//*  69  158:getfield        #305 <Field IntHashtable specialMap>
	//*  70  161:ifnonnull       190
	//*  71  164:aload_0         
	//*  72  165:getfield        #320 <Field boolean forceWidthsOutput>
	//*  73  168:ifne            190
	//*  74  171:aload_0         
	//*  75  172:getfield        #99  <Field boolean builtinFont>
	//*  76  175:ifeq            190
	//*  77  178:aload_0         
	//*  78  179:getfield        #222 <Field boolean fontSpecific>
	//*  79  182:ifne            451
	//*  80  185:iload           7
	//*  81  187:ifne            451
	//*  82  190:aload           10
	//*  83  192:getstatic       #323 <Field PdfName PdfName.FIRSTCHAR>
	//*  84  195:new             #325 <Class PdfNumber>
	//*  85  198:dup             
	//*  86  199:iload           5
	//*  87  201:invokespecial   #328 <Method void PdfNumber(int)>
	//*  88  204:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  89  207:aload           10
	//*  90  209:getstatic       #331 <Field PdfName PdfName.LASTCHAR>
	//*  91  212:new             #325 <Class PdfNumber>
	//*  92  215:dup             
	//*  93  216:iload_3         
	//*  94  217:invokespecial   #328 <Method void PdfNumber(int)>
	//*  95  220:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  96  223:new             #333 <Class PdfArray>
	//*  97  226:dup             
	//*  98  227:invokespecial   #334 <Method void PdfArray()>
	//*  99  230:astore          9
	//* 100  232:iload           5
	//* 101  234:iload_3         
	//* 102  235:icmpgt          441
	//* 103  238:aload           4
	//* 104  240:iload           5
	//* 105  242:baload          
	//* 106  243:ifne            418
	//* 107  246:aload           9
	//* 108  248:new             #325 <Class PdfNumber>
	//* 109  251:dup             
	//* 110  252:iconst_0        
	//* 111  253:invokespecial   #328 <Method void PdfNumber(int)>
	//* 112  256:invokevirtual   #338 <Method boolean PdfArray.add(PdfObject)>
	//* 113  259:pop             
	//* 114  260:iload           5
	//* 115  262:iconst_1        
	//* 116  263:iadd            
	//* 117  264:istore          5
	//* 118  266:goto            232
			flag = false;
	//  119  269:iconst_0        
	//  120  270:istore          7
		if(!fontSpecific) goto _L2; else goto _L1
_L1:
		k = i;
		if(specialMap == null) goto _L3; else goto _L2
_L2:
		l = i;
_L9:
		k = i;
		if(l > j) goto _L5; else goto _L4
_L4:
		if(differences[l].equals(".notdef")) goto _L7; else goto _L6
_L6:
		k = l;
_L5:
		if(flag)
		{
			pdfname = PdfName.ENCODING;
			if(encoding.equals("Cp1252"))
				obj = ((Object) (PdfName.WIN_ANSI_ENCODING));
			else
	//* 121  272:goto            71
	//* 122  275:iload           6
	//* 123  277:iconst_1        
	//* 124  278:iadd            
	//* 125  279:istore          6
	//* 126  281:goto            91
				obj = ((Object) (PdfName.MAC_ROMAN_ENCODING));
	//  127  284:getstatic       #341 <Field PdfName PdfName.MAC_ROMAN_ENCODING>
	//  128  287:astore          9
			pdfdictionary.put(pdfname, ((PdfObject) (obj)));
		} else
	//* 129  289:goto            148
		{
			obj = ((Object) (new PdfDictionary(PdfName.ENCODING)));
	//  130  292:new             #272 <Class PdfDictionary>
	//  131  295:dup             
	//  132  296:getstatic       #314 <Field PdfName PdfName.ENCODING>
	//  133  299:invokespecial   #281 <Method void PdfDictionary(PdfName)>
	//  134  302:astore          9
			PdfArray pdfarray = new PdfArray();
	//  135  304:new             #333 <Class PdfArray>
	//  136  307:dup             
	//  137  308:invokespecial   #334 <Method void PdfArray()>
	//  138  311:astore          11
			i = 1;
	//  139  313:iconst_1        
	//  140  314:istore_2        
			int j1 = k;
	//  141  315:iload           5
	//  142  317:istore          8
			while(j1 <= j) 
	//* 143  319:iload           8
	//* 144  321:iload_3         
	//* 145  322:icmpgt          395
			{
				if(abyte0[j1] != 0)
	//* 146  325:aload           4
	//* 147  327:iload           8
	//* 148  329:baload          
	//* 149  330:ifeq            390
				{
					int i1 = i;
	//  150  333:iload_2         
	//  151  334:istore          6
					if(i != 0)
	//* 152  336:iload_2         
	//* 153  337:ifeq            358
					{
						pdfarray.add(((PdfObject) (new PdfNumber(j1))));
	//  154  340:aload           11
	//  155  342:new             #325 <Class PdfNumber>
	//  156  345:dup             
	//  157  346:iload           8
	//  158  348:invokespecial   #328 <Method void PdfNumber(int)>
	//  159  351:invokevirtual   #338 <Method boolean PdfArray.add(PdfObject)>
	//  160  354:pop             
						i1 = 0;
	//  161  355:iconst_0        
	//  162  356:istore          6
					}
					pdfarray.add(((PdfObject) (new PdfName(differences[j1]))));
	//  163  358:aload           11
	//  164  360:new             #274 <Class PdfName>
	//  165  363:dup             
	//  166  364:aload_0         
	//  167  365:getfield        #309 <Field String[] differences>
	//  168  368:iload           8
	//  169  370:aaload          
	//  170  371:invokespecial   #297 <Method void PdfName(String)>
	//  171  374:invokevirtual   #338 <Method boolean PdfArray.add(PdfObject)>
	//  172  377:pop             
					i = i1;
	//  173  378:iload           6
	//  174  380:istore_2        
				} else
	//* 175  381:iload           8
	//* 176  383:iconst_1        
	//* 177  384:iadd            
	//* 178  385:istore          8
	//* 179  387:goto            319
				{
					i = 1;
	//  180  390:iconst_1        
	//  181  391:istore_2        
				}
				j1++;
			}
	//* 182  392:goto            381
			((PdfDictionary) (obj)).put(PdfName.DIFFERENCES, ((PdfObject) (pdfarray)));
	//  183  395:aload           9
	//  184  397:getstatic       #344 <Field PdfName PdfName.DIFFERENCES>
	//  185  400:aload           11
	//  186  402:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.ENCODING, ((PdfObject) (obj)));
	//  187  405:aload           10
	//  188  407:getstatic       #314 <Field PdfName PdfName.ENCODING>
	//  189  410:aload           9
	//  190  412:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		  goto _L3
_L7:
		l++;
		continue; /* Loop/switch isn't completed */
_L3:
		if(specialMap != null || forceWidthsOutput || !builtinFont || !fontSpecific && !flag)
		{
			pdfdictionary.put(PdfName.FIRSTCHAR, ((PdfObject) (new PdfNumber(k))));
			pdfdictionary.put(PdfName.LASTCHAR, ((PdfObject) (new PdfNumber(j))));
			obj = ((Object) (new PdfArray()));
			while(k <= j) 
			{
				if(abyte0[k] == 0)
					((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(0))));
				else
	//* 191  415:goto            157
					((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(widths[k]))));
	//  192  418:aload           9
	//  193  420:new             #325 <Class PdfNumber>
	//  194  423:dup             
	//  195  424:aload_0         
	//  196  425:getfield        #347 <Field int[] widths>
	//  197  428:iload           5
	//  198  430:iaload          
	//  199  431:invokespecial   #328 <Method void PdfNumber(int)>
	//  200  434:invokevirtual   #338 <Method boolean PdfArray.add(PdfObject)>
	//  201  437:pop             
				k++;
			}
	//* 202  438:goto            260
			pdfdictionary.put(PdfName.WIDTHS, ((PdfObject) (obj)));
	//  203  441:aload           10
	//  204  443:getstatic       #350 <Field PdfName PdfName.WIDTHS>
	//  205  446:aload           9
	//  206  448:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		if(!builtinFont && pdfindirectreference != null)
	//* 207  451:aload_0         
	//* 208  452:getfield        #99  <Field boolean builtinFont>
	//* 209  455:ifne            471
	//* 210  458:aload_1         
	//* 211  459:ifnull          471
			pdfdictionary.put(PdfName.FONTDESCRIPTOR, ((PdfObject) (pdfindirectreference)));
	//  212  462:aload           10
	//  213  464:getstatic       #353 <Field PdfName PdfName.FONTDESCRIPTOR>
	//  214  467:aload_1         
	//  215  468:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfdictionary;
	//  216  471:aload           10
	//  217  473:areturn         
		if(true) goto _L9; else goto _L8
_L8:
	}

	private PdfDictionary getFontDescriptor(PdfIndirectReference pdfindirectreference)
	{
label0:
		{
			if(builtinFont)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field boolean builtinFont>
	//*   2    4:ifeq            9
				return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
			PdfDictionary pdfdictionary = new PdfDictionary(PdfName.FONTDESCRIPTOR);
	//    5    9:new             #272 <Class PdfDictionary>
	//    6   12:dup             
	//    7   13:getstatic       #353 <Field PdfName PdfName.FONTDESCRIPTOR>
	//    8   16:invokespecial   #281 <Method void PdfDictionary(PdfName)>
	//    9   19:astore          4
			pdfdictionary.put(PdfName.ASCENT, ((PdfObject) (new PdfNumber(Ascender))));
	//   10   21:aload           4
	//   11   23:getstatic       #358 <Field PdfName PdfName.ASCENT>
	//   12   26:new             #325 <Class PdfNumber>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #86  <Field int Ascender>
	//   16   34:invokespecial   #328 <Method void PdfNumber(int)>
	//   17   37:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.CAPHEIGHT, ((PdfObject) (new PdfNumber(CapHeight))));
	//   18   40:aload           4
	//   19   42:getstatic       #361 <Field PdfName PdfName.CAPHEIGHT>
	//   20   45:new             #325 <Class PdfNumber>
	//   21   48:dup             
	//   22   49:aload_0         
	//   23   50:getfield        #82  <Field int CapHeight>
	//   24   53:invokespecial   #328 <Method void PdfNumber(int)>
	//   25   56:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DESCENT, ((PdfObject) (new PdfNumber(Descender))));
	//   26   59:aload           4
	//   27   61:getstatic       #364 <Field PdfName PdfName.DESCENT>
	//   28   64:new             #325 <Class PdfNumber>
	//   29   67:dup             
	//   30   68:aload_0         
	//   31   69:getfield        #88  <Field int Descender>
	//   32   72:invokespecial   #328 <Method void PdfNumber(int)>
	//   33   75:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.FONTBBOX, ((PdfObject) (new PdfRectangle(llx, lly, urx, ury))));
	//   34   78:aload           4
	//   35   80:getstatic       #367 <Field PdfName PdfName.FONTBBOX>
	//   36   83:new             #369 <Class PdfRectangle>
	//   37   86:dup             
	//   38   87:aload_0         
	//   39   88:getfield        #66  <Field int llx>
	//   40   91:i2f             
	//   41   92:aload_0         
	//   42   93:getfield        #68  <Field int lly>
	//   43   96:i2f             
	//   44   97:aload_0         
	//   45   98:getfield        #70  <Field int urx>
	//   46  101:i2f             
	//   47  102:aload_0         
	//   48  103:getfield        #72  <Field int ury>
	//   49  106:i2f             
	//   50  107:invokespecial   #372 <Method void PdfRectangle(float, float, float, float)>
	//   51  110:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.FONTNAME, ((PdfObject) (new PdfName(FontName))));
	//   52  113:aload           4
	//   53  115:getstatic       #375 <Field PdfName PdfName.FONTNAME>
	//   54  118:new             #274 <Class PdfName>
	//   55  121:dup             
	//   56  122:aload_0         
	//   57  123:getfield        #296 <Field String FontName>
	//   58  126:invokespecial   #297 <Method void PdfName(String)>
	//   59  129:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.ITALICANGLE, ((PdfObject) (new PdfNumber(ItalicAngle))));
	//   60  132:aload           4
	//   61  134:getstatic       #378 <Field PdfName PdfName.ITALICANGLE>
	//   62  137:new             #325 <Class PdfNumber>
	//   63  140:dup             
	//   64  141:aload_0         
	//   65  142:getfield        #62  <Field float ItalicAngle>
	//   66  145:invokespecial   #381 <Method void PdfNumber(float)>
	//   67  148:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.STEMV, ((PdfObject) (new PdfNumber(StdVW))));
	//   68  151:aload           4
	//   69  153:getstatic       #384 <Field PdfName PdfName.STEMV>
	//   70  156:new             #325 <Class PdfNumber>
	//   71  159:dup             
	//   72  160:aload_0         
	//   73  161:getfield        #90  <Field int StdVW>
	//   74  164:invokespecial   #328 <Method void PdfNumber(int)>
	//   75  167:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(pdfindirectreference != null)
	//*  76  170:aload_1         
	//*  77  171:ifnull          183
				pdfdictionary.put(PdfName.FONTFILE, ((PdfObject) (pdfindirectreference)));
	//   78  174:aload           4
	//   79  176:getstatic       #387 <Field PdfName PdfName.FONTFILE>
	//   80  179:aload_1         
	//   81  180:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
			int i = 0;
	//   82  183:iconst_0        
	//   83  184:istore_2        
			if(IsFixedPitch)
	//*  84  185:aload_0         
	//*  85  186:getfield        #64  <Field boolean IsFixedPitch>
	//*  86  189:ifeq            196
				i = ((int) (false | true));
	//   87  192:iconst_0        
	//   88  193:iconst_1        
	//   89  194:ior             
	//   90  195:istore_2        
			int j;
			if(fontSpecific)
	//*  91  196:aload_0         
	//*  92  197:getfield        #222 <Field boolean fontSpecific>
	//*  93  200:ifeq            299
				j = 4;
	//   94  203:iconst_4        
	//   95  204:istore_3        
			else
	//*  96  205:iload_2         
	//*  97  206:iload_3         
	//*  98  207:ior             
	//*  99  208:istore_3        
	//* 100  209:iload_3         
	//* 101  210:istore_2        
	//* 102  211:aload_0         
	//* 103  212:getfield        #62  <Field float ItalicAngle>
	//* 104  215:fconst_0        
	//* 105  216:fcmpg           
	//* 106  217:ifge            225
	//* 107  220:iload_3         
	//* 108  221:bipush          64
	//* 109  223:ior             
	//* 110  224:istore_2        
	//* 111  225:aload_0         
	//* 112  226:getfield        #296 <Field String FontName>
	//* 113  229:ldc2            #389 <String "Caps">
	//* 114  232:invokevirtual   #393 <Method int String.indexOf(String)>
	//* 115  235:ifge            253
	//* 116  238:iload_2         
	//* 117  239:istore_3        
	//* 118  240:aload_0         
	//* 119  241:getfield        #296 <Field String FontName>
	//* 120  244:ldc2            #395 <String "SC">
	//* 121  247:invokevirtual   #249 <Method boolean String.endsWith(String)>
	//* 122  250:ifeq            259
	//* 123  253:iload_2         
	//* 124  254:ldc2            #396 <Int 0x20000>
	//* 125  257:ior             
	//* 126  258:istore_3        
	//* 127  259:iload_3         
	//* 128  260:istore_2        
	//* 129  261:aload_0         
	//* 130  262:getfield        #60  <Field String Weight>
	//* 131  265:ldc2            #398 <String "Bold">
	//* 132  268:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 133  271:ifeq            280
	//* 134  274:iload_3         
	//* 135  275:ldc2            #399 <Int 0x40000>
	//* 136  278:ior             
	//* 137  279:istore_2        
	//* 138  280:aload           4
	//* 139  282:getstatic       #402 <Field PdfName PdfName.FLAGS>
	//* 140  285:new             #325 <Class PdfNumber>
	//* 141  288:dup             
	//* 142  289:iload_2         
	//* 143  290:invokespecial   #328 <Method void PdfNumber(int)>
	//* 144  293:invokevirtual   #291 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 145  296:aload           4
	//* 146  298:areturn         
				j = 32;
	//  147  299:bipush          32
	//  148  301:istore_3        
			j = i | j;
			i = j;
			if(ItalicAngle < 0.0F)
				i = j | 0x40;
			if(FontName.indexOf("Caps") < 0)
			{
				j = i;
				if(!FontName.endsWith("SC"))
					break label0;
			}
			j = i | 0x20000;
		}
		i = j;
		if(Weight.equals("Bold"))
			i = j | 0x40000;
		pdfdictionary.put(PdfName.FLAGS, ((PdfObject) (new PdfNumber(i))));
		return pdfdictionary;
	//* 149  302:goto            205
	}

	public String[][] getAllNameEntries()
	{
		return (new String[][] {
			new String[] {
				"4", "", "", "", FullName
			}
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_5        
	//    5    7:anewarray       String[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc2            #407 <String "4">
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:ldc1            #58  <String "">
	//   13   20:aastore         
	//   14   21:dup             
	//   15   22:iconst_2        
	//   16   23:ldc1            #58  <String "">
	//   17   25:aastore         
	//   18   26:dup             
	//   19   27:iconst_3        
	//   20   28:ldc1            #58  <String "">
	//   21   30:aastore         
	//   22   31:dup             
	//   23   32:iconst_4        
	//   24   33:aload_0         
	//   25   34:getfield        #409 <Field String FullName>
	//   26   37:aastore         
	//   27   38:aastore         
	//   28   39:areturn         
	}

	public String[][] getFamilyFontName()
	{
		return (new String[][] {
			new String[] {
				"", "", "", FamilyName
			}
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_4        
	//    5    7:anewarray       String[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #58  <String "">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:ldc1            #58  <String "">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:ldc1            #58  <String "">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_3        
	//   20   27:aload_0         
	//   21   28:getfield        #412 <Field String FamilyName>
	//   22   31:aastore         
	//   23   32:aastore         
	//   24   33:areturn         
	}

	public float getFontDescriptor(int i, float f)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 14: default 72
	//	               1 74
	//	               2 86
	//	               3 98
	//	               4 110
	//	               5 115
	//	               6 127
	//	               7 139
	//	               8 151
	//	               9 74
	//	               10 98
	//	               11 72
	//	               12 163
	//	               13 180
	//	               14 192
		case 11: // '\013'
		default:
			return 0.0F;
	//    2   72:fconst_0        
	//    3   73:freturn         

		case 1: // '\001'
		case 9: // '\t'
			return ((float)Ascender * f) / 1000F;
	//    4   74:aload_0         
	//    5   75:getfield        #86  <Field int Ascender>
	//    6   78:i2f             
	//    7   79:fload_2         
	//    8   80:fmul            
	//    9   81:ldc2            #414 <Float 1000F>
	//   10   84:fdiv            
	//   11   85:freturn         

		case 2: // '\002'
			return ((float)CapHeight * f) / 1000F;
	//   12   86:aload_0         
	//   13   87:getfield        #82  <Field int CapHeight>
	//   14   90:i2f             
	//   15   91:fload_2         
	//   16   92:fmul            
	//   17   93:ldc2            #414 <Float 1000F>
	//   18   96:fdiv            
	//   19   97:freturn         

		case 3: // '\003'
		case 10: // '\n'
			return ((float)Descender * f) / 1000F;
	//   20   98:aload_0         
	//   21   99:getfield        #88  <Field int Descender>
	//   22  102:i2f             
	//   23  103:fload_2         
	//   24  104:fmul            
	//   25  105:ldc2            #414 <Float 1000F>
	//   26  108:fdiv            
	//   27  109:freturn         

		case 4: // '\004'
			return ItalicAngle;
	//   28  110:aload_0         
	//   29  111:getfield        #62  <Field float ItalicAngle>
	//   30  114:freturn         

		case 5: // '\005'
			return ((float)llx * f) / 1000F;
	//   31  115:aload_0         
	//   32  116:getfield        #66  <Field int llx>
	//   33  119:i2f             
	//   34  120:fload_2         
	//   35  121:fmul            
	//   36  122:ldc2            #414 <Float 1000F>
	//   37  125:fdiv            
	//   38  126:freturn         

		case 6: // '\006'
			return ((float)lly * f) / 1000F;
	//   39  127:aload_0         
	//   40  128:getfield        #68  <Field int lly>
	//   41  131:i2f             
	//   42  132:fload_2         
	//   43  133:fmul            
	//   44  134:ldc2            #414 <Float 1000F>
	//   45  137:fdiv            
	//   46  138:freturn         

		case 7: // '\007'
			return ((float)urx * f) / 1000F;
	//   47  139:aload_0         
	//   48  140:getfield        #70  <Field int urx>
	//   49  143:i2f             
	//   50  144:fload_2         
	//   51  145:fmul            
	//   52  146:ldc2            #414 <Float 1000F>
	//   53  149:fdiv            
	//   54  150:freturn         

		case 8: // '\b'
			return ((float)ury * f) / 1000F;
	//   55  151:aload_0         
	//   56  152:getfield        #72  <Field int ury>
	//   57  155:i2f             
	//   58  156:fload_2         
	//   59  157:fmul            
	//   60  158:ldc2            #414 <Float 1000F>
	//   61  161:fdiv            
	//   62  162:freturn         

		case 12: // '\f'
			return ((float)(urx - llx) * f) / 1000F;
	//   63  163:aload_0         
	//   64  164:getfield        #70  <Field int urx>
	//   65  167:aload_0         
	//   66  168:getfield        #66  <Field int llx>
	//   67  171:isub            
	//   68  172:i2f             
	//   69  173:fload_2         
	//   70  174:fmul            
	//   71  175:ldc2            #414 <Float 1000F>
	//   72  178:fdiv            
	//   73  179:freturn         

		case 13: // '\r'
			return ((float)UnderlinePosition * f) / 1000F;
	//   74  180:aload_0         
	//   75  181:getfield        #74  <Field int UnderlinePosition>
	//   76  184:i2f             
	//   77  185:fload_2         
	//   78  186:fmul            
	//   79  187:ldc2            #414 <Float 1000F>
	//   80  190:fdiv            
	//   81  191:freturn         

		case 14: // '\016'
			return ((float)UnderlineThickness * f) / 1000F;
	//   82  192:aload_0         
	//   83  193:getfield        #76  <Field int UnderlineThickness>
	//   84  196:i2f             
	//   85  197:fload_2         
	//   86  198:fmul            
	//   87  199:ldc2            #414 <Float 1000F>
	//   88  202:fdiv            
	//   89  203:freturn         
		}
	}

	public String[][] getFullFontName()
	{
		return (new String[][] {
			new String[] {
				"", "", "", FullName
			}
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_4        
	//    5    7:anewarray       String[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #58  <String "">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:ldc1            #58  <String "">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:ldc1            #58  <String "">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_3        
	//   20   27:aload_0         
	//   21   28:getfield        #409 <Field String FullName>
	//   22   31:aastore         
	//   23   32:aastore         
	//   24   33:areturn         
	}

	public PdfStream getFullFontStream()
		throws DocumentException
	{
		if(!builtinFont && embedded) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean builtinFont>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field boolean embedded>
	//    5   11:ifne            20
_L1:
		Object obj1 = null;
	//    6   14:aconst_null     
	//    7   15:astore          6
_L12:
		return ((PdfStream) (obj1));
	//    8   17:aload           6
	//    9   19:areturn         
_L2:
		Object obj;
		Object obj2;
		byte abyte0[];
		abyte0 = null;
	//   10   20:aconst_null     
	//   11   21:astore          8
		obj = null;
	//   12   23:aconst_null     
	//   13   24:astore          5
		obj2 = obj;
	//   14   26:aload           5
	//   15   28:astore          7
		obj1 = ((Object) (abyte0));
	//   16   30:aload           8
	//   17   32:astore          6
		String s = (new StringBuilder()).append(fileName.substring(0, fileName.length() - 3)).append("pfb").toString();
	//   18   34:new             #139 <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #140 <Method void StringBuilder()>
	//   21   41:aload_0         
	//   22   42:getfield        #122 <Field String fileName>
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #122 <Field String fileName>
	//   26   50:invokevirtual   #421 <Method int String.length()>
	//   27   53:iconst_3        
	//   28   54:isub            
	//   29   55:invokevirtual   #425 <Method String String.substring(int, int)>
	//   30   58:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:ldc2            #426 <String "pfb">
	//   32   64:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   34   70:astore          9
		obj2 = obj;
	//   35   72:aload           5
	//   36   74:astore          7
		obj1 = ((Object) (abyte0));
	//   37   76:aload           8
	//   38   78:astore          6
		if(pfb != null) goto _L4; else goto _L3
	//   39   80:aload_0         
	//   40   81:getfield        #114 <Field byte[] pfb>
	//   41   84:ifnonnull       234
_L3:
		obj2 = obj;
	//   42   87:aload           5
	//   43   89:astore          7
		obj1 = ((Object) (abyte0));
	//   44   91:aload           8
	//   45   93:astore          6
		obj = ((Object) (new RandomAccessFileOrArray(s, true, Document.plainRandomAccess)));
	//   46   95:new             #199 <Class RandomAccessFileOrArray>
	//   47   98:dup             
	//   48   99:aload           9
	//   49  101:iconst_1        
	//   50  102:getstatic       #254 <Field boolean Document.plainRandomAccess>
	//   51  105:invokespecial   #257 <Method void RandomAccessFileOrArray(String, boolean, boolean)>
	//   52  108:astore          5
_L9:
		obj2 = obj;
	//   53  110:aload           5
	//   54  112:astore          7
		obj1 = obj;
	//   55  114:aload           5
	//   56  116:astore          6
		abyte0 = new byte[(int)((RandomAccessFileOrArray) (obj)).length() - 18];
	//   57  118:aload           5
	//   58  120:invokevirtual   #429 <Method long RandomAccessFileOrArray.length()>
	//   59  123:l2i             
	//   60  124:bipush          18
	//   61  126:isub            
	//   62  127:newarray        byte[]
	//   63  129:astore          8
		obj2 = obj;
	//   64  131:aload           5
	//   65  133:astore          7
		obj1 = obj;
	//   66  135:aload           5
	//   67  137:astore          6
		int ai[] = new int[3];
	//   68  139:iconst_3        
	//   69  140:newarray        int[]
	//   70  142:astore          10
		int i;
		int j;
		j = 0;
	//   71  144:iconst_0        
	//   72  145:istore_2        
		i = 0;
	//   73  146:iconst_0        
	//   74  147:istore_1        
_L14:
		if(i >= 3) goto _L6; else goto _L5
	//   75  148:iload_1         
	//   76  149:iconst_3        
	//   77  150:icmpge          415
_L5:
		obj2 = obj;
	//   78  153:aload           5
	//   79  155:astore          7
		obj1 = obj;
	//   80  157:aload           5
	//   81  159:astore          6
		if(((RandomAccessFileOrArray) (obj)).read() == 128) goto _L8; else goto _L7
	//   82  161:aload           5
	//   83  163:invokevirtual   #431 <Method int RandomAccessFileOrArray.read()>
	//   84  166:sipush          128
	//   85  169:icmpeq          258
_L7:
		obj2 = obj;
	//   86  172:aload           5
	//   87  174:astore          7
		obj1 = obj;
	//   88  176:aload           5
	//   89  178:astore          6
		try
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("start.marker.missing.in.1", new Object[] {
				s
			}));
	//   90  180:new             #50  <Class DocumentException>
	//   91  183:dup             
	//   92  184:ldc2            #433 <String "start.marker.missing.in.1">
	//   93  187:iconst_1        
	//   94  188:anewarray       Object[]
	//   95  191:dup             
	//   96  192:iconst_0        
	//   97  193:aload           9
	//   98  195:aastore         
	//   99  196:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  100  199:invokespecial   #112 <Method void DocumentException(String)>
	//  101  202:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 102  203:astore          5
		{
			obj1 = obj2;
	//  103  205:aload           7
	//  104  207:astore          6
		}
		throw new DocumentException(((Exception) (obj)));
	//  105  209:new             #50  <Class DocumentException>
	//  106  212:dup             
	//  107  213:aload           5
	//  108  215:invokespecial   #436 <Method void DocumentException(Exception)>
	//  109  218:athrow          
		obj;
	//  110  219:astore          5
		int k;
		int l;
		Exception exception;
		BaseFont.StreamFont streamfont;
		if(obj1 != null)
	//* 111  221:aload           6
	//* 112  223:ifnull          231
			try
			{
				((RandomAccessFileOrArray) (obj1)).close();
	//  113  226:aload           6
	//  114  228:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
			}
	//* 115  231:aload           5
	//* 116  233:athrow          
	//* 117  234:aload           5
	//* 118  236:astore          7
	//* 119  238:aload           8
	//* 120  240:astore          6
	//* 121  242:new             #199 <Class RandomAccessFileOrArray>
	//* 122  245:dup             
	//* 123  246:aload_0         
	//* 124  247:getfield        #114 <Field byte[] pfb>
	//* 125  250:invokespecial   #202 <Method void RandomAccessFileOrArray(byte[])>
	//* 126  253:astore          5
	//* 127  255:goto            110
	//* 128  258:aload           5
	//* 129  260:astore          7
	//* 130  262:aload           5
	//* 131  264:astore          6
	//* 132  266:aload           5
	//* 133  268:invokevirtual   #431 <Method int RandomAccessFileOrArray.read()>
	//* 134  271:getstatic       #45  <Field int[] PFB_TYPES>
	//* 135  274:iload_1         
	//* 136  275:iaload          
	//* 137  276:icmpeq          310
	//* 138  279:aload           5
	//* 139  281:astore          7
	//* 140  283:aload           5
	//* 141  285:astore          6
	//* 142  287:new             #50  <Class DocumentException>
	//* 143  290:dup             
	//* 144  291:ldc2            #438 <String "incorrect.segment.type.in.1">
	//* 145  294:iconst_1        
	//* 146  295:anewarray       Object[]
	//* 147  298:dup             
	//* 148  299:iconst_0        
	//* 149  300:aload           9
	//* 150  302:aastore         
	//* 151  303:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 152  306:invokespecial   #112 <Method void DocumentException(String)>
	//* 153  309:athrow          
	//* 154  310:aload           5
	//* 155  312:astore          7
	//* 156  314:aload           5
	//* 157  316:astore          6
	//* 158  318:aload           5
	//* 159  320:invokevirtual   #431 <Method int RandomAccessFileOrArray.read()>
	//* 160  323:aload           5
	//* 161  325:invokevirtual   #431 <Method int RandomAccessFileOrArray.read()>
	//* 162  328:bipush          8
	//* 163  330:ishl            
	//* 164  331:iadd            
	//* 165  332:aload           5
	//* 166  334:invokevirtual   #431 <Method int RandomAccessFileOrArray.read()>
	//* 167  337:bipush          16
	//* 168  339:ishl            
	//* 169  340:iadd            
	//* 170  341:aload           5
	//* 171  343:invokevirtual   #431 <Method int RandomAccessFileOrArray.read()>
	//* 172  346:bipush          24
	//* 173  348:ishl            
	//* 174  349:iadd            
	//* 175  350:istore_3        
	//* 176  351:aload           10
	//* 177  353:iload_1         
	//* 178  354:iload_3         
	//* 179  355:iastore         
	//* 180  356:iload_3         
	//* 181  357:ifeq            480
	//* 182  360:aload           5
	//* 183  362:astore          7
	//* 184  364:aload           5
	//* 185  366:astore          6
	//* 186  368:aload           5
	//* 187  370:aload           8
	//* 188  372:iload_2         
	//* 189  373:iload_3         
	//* 190  374:invokevirtual   #441 <Method int RandomAccessFileOrArray.read(byte[], int, int)>
	//* 191  377:istore          4
	//* 192  379:iload           4
	//* 193  381:ifge            467
	//* 194  384:aload           5
	//* 195  386:astore          7
	//* 196  388:aload           5
	//* 197  390:astore          6
	//* 198  392:new             #50  <Class DocumentException>
	//* 199  395:dup             
	//* 200  396:ldc2            #443 <String "premature.end.in.1">
	//* 201  399:iconst_1        
	//* 202  400:anewarray       Object[]
	//* 203  403:dup             
	//* 204  404:iconst_0        
	//* 205  405:aload           9
	//* 206  407:aastore         
	//* 207  408:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 208  411:invokespecial   #112 <Method void DocumentException(String)>
	//* 209  414:athrow          
	//* 210  415:aload           5
	//* 211  417:astore          7
	//* 212  419:aload           5
	//* 213  421:astore          6
	//* 214  423:new             #445 <Class BaseFont$StreamFont>
	//* 215  426:dup             
	//* 216  427:aload           8
	//* 217  429:aload           10
	//* 218  431:aload_0         
	//* 219  432:getfield        #448 <Field int compressionLevel>
	//* 220  435:invokespecial   #451 <Method void BaseFont$StreamFont(byte[], int[], int)>
	//* 221  438:astore          8
	//* 222  440:aload           8
	//* 223  442:astore          6
	//* 224  444:aload           5
	//* 225  446:ifnull          17
	//* 226  449:aload           5
	//* 227  451:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
	//* 228  454:aload           8
	//* 229  456:areturn         
	//* 230  457:astore          5
	//* 231  459:aload           8
	//* 232  461:areturn         
			catch(Exception exception1) { }
	//  233  462:astore          6
		throw obj;
_L4:
		obj2 = obj;
		obj1 = ((Object) (abyte0));
		obj = ((Object) (new RandomAccessFileOrArray(pfb)));
		  goto _L9
_L8:
		obj2 = obj;
		obj1 = obj;
		if(((RandomAccessFileOrArray) (obj)).read() == PFB_TYPES[i])
			break MISSING_BLOCK_LABEL_310;
		obj2 = obj;
		obj1 = obj;
		throw new DocumentException(MessageLocalization.getComposedMessage("incorrect.segment.type.in.1", new Object[] {
			s
		}));
		obj2 = obj;
		obj1 = obj;
		k = ((RandomAccessFileOrArray) (obj)).read() + (((RandomAccessFileOrArray) (obj)).read() << 8) + (((RandomAccessFileOrArray) (obj)).read() << 16) + (((RandomAccessFileOrArray) (obj)).read() << 24);
		ai[i] = k;
_L13:
		if(k == 0)
			break MISSING_BLOCK_LABEL_480;
		obj2 = obj;
		obj1 = obj;
		l = ((RandomAccessFileOrArray) (obj)).read(abyte0, j, k);
		if(l >= 0) goto _L11; else goto _L10
_L10:
		obj2 = obj;
		obj1 = obj;
		throw new DocumentException(MessageLocalization.getComposedMessage("premature.end.in.1", new Object[] {
			s
		}));
_L6:
		obj2 = obj;
		obj1 = obj;
		streamfont = new BaseFont.StreamFont(abyte0, ai, compressionLevel);
		obj1 = ((Object) (streamfont));
		if(obj != null)
		{
			try
			{
				((RandomAccessFileOrArray) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				return ((PdfStream) (streamfont));
			}
			return ((PdfStream) (streamfont));
		}
		  goto _L12
	//* 234  464:goto            231
_L11:
		j += l;
	//  235  467:iload_2         
	//  236  468:iload           4
	//  237  470:iadd            
	//  238  471:istore_2        
		k -= l;
	//  239  472:iload_3         
	//  240  473:iload           4
	//  241  475:isub            
	//  242  476:istore_3        
		  goto _L13
	//* 243  477:goto            356
		i++;
	//  244  480:iload_1         
	//  245  481:iconst_1        
	//  246  482:iadd            
	//  247  483:istore_1        
		  goto _L14
	//* 248  484:goto            148
	}

	public int getKerning(int i, int j)
	{
		String s1 = GlyphList.unicodeToName(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #459 <Method String GlyphList.unicodeToName(int)>
	//    2    4:astore          4
		if(s1 != null) goto _L2; else goto _L1
	//    3    6:aload           4
	//    4    8:ifnonnull       13
_L1:
		String s;
		return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
	//*   7   13:iload_2         
	//*   8   14:invokestatic    #459 <Method String GlyphList.unicodeToName(int)>
	//*   9   17:astore_3        
_L2:
		Object aobj[];
		if((s = GlyphList.unicodeToName(j)) != null && (aobj = (Object[])KernPairs.get(((Object) (s1)))) != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          11
	//*  12   22:aload_0         
	//*  13   23:getfield        #97  <Field HashMap KernPairs>
	//*  14   26:aload           4
	//*  15   28:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//*  16   31:checkcast       #465 <Class Object[]>
	//*  17   34:astore          4
	//*  18   36:aload           4
	//*  19   38:ifnull          11
		{
			i = 0;
	//   20   41:iconst_0        
	//   21   42:istore_1        
			while(i < aobj.length) 
	//*  22   43:iload_1         
	//*  23   44:aload           4
	//*  24   46:arraylength     
	//*  25   47:icmpge          11
			{
				if(s.equals(aobj[i]))
	//*  26   50:aload_3         
	//*  27   51:aload           4
	//*  28   53:iload_1         
	//*  29   54:aaload          
	//*  30   55:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  31   58:ifeq            74
					return ((Integer)aobj[i + 1]).intValue();
	//   32   61:aload           4
	//   33   63:iload_1         
	//   34   64:iconst_1        
	//   35   65:iadd            
	//   36   66:aaload          
	//   37   67:checkcast       #467 <Class Integer>
	//   38   70:invokevirtual   #470 <Method int Integer.intValue()>
	//   39   73:ireturn         
				i += 2;
	//   40   74:iload_1         
	//   41   75:iconst_2        
	//   42   76:iadd            
	//   43   77:istore_1        
			}
		}
		if(true) goto _L1; else goto _L3
	//   44   78:goto            43
_L3:
	}

	public String getPostscriptFontName()
	{
		return FontName;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field String FontName>
	//    2    4:areturn         
	}

	protected int[] getRawCharBBox(int i, String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(s != null) goto _L2; else goto _L1
	//    2    3:aload_2         
	//    3    4:ifnonnull       41
_L1:
		s = ((String) ((Object[])CharMetrics.get(((Object) (Integer.valueOf(i))))));
	//    4    7:aload_0         
	//    5    8:getfield        #95  <Field HashMap CharMetrics>
	//    6   11:iload_1         
	//    7   12:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//    8   15:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//    9   18:checkcast       #465 <Class Object[]>
	//   10   21:astore_2        
_L6:
		int ai[];
		ai = ((int []) (obj));
	//   11   22:aload           4
	//   12   24:astore_3        
		if(s != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          39
			ai = (int[])(int[])s[3];
	//   15   29:aload_2         
	//   16   30:iconst_3        
	//   17   31:aaload          
	//   18   32:checkcast       #478 <Class int[]>
	//   19   35:checkcast       #478 <Class int[]>
	//   20   38:astore_3        
_L4:
		return ai;
	//   21   39:aload_3         
	//   22   40:areturn         
_L2:
		ai = ((int []) (obj));
	//   23   41:aload           4
	//   24   43:astore_3        
		if(s.equals(".notdef")) goto _L4; else goto _L3
	//   25   44:aload_2         
	//   26   45:ldc2            #311 <String ".notdef">
	//   27   48:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   28   51:ifne            39
_L3:
		s = ((String) ((Object[])CharMetrics.get(((Object) (s)))));
	//   29   54:aload_0         
	//   30   55:getfield        #95  <Field HashMap CharMetrics>
	//   31   58:aload_2         
	//   32   59:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//   33   62:checkcast       #465 <Class Object[]>
	//   34   65:astore_2        
		if(true) goto _L6; else goto _L5
	//   35   66:goto            22
_L5:
	}

	int getRawWidth(int i, String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(s != null) goto _L2; else goto _L1
	//    2    2:aload_2         
	//    3    3:ifnonnull       39
_L1:
		s = ((String) ((Object[])CharMetrics.get(((Object) (Integer.valueOf(i))))));
	//    4    6:aload_0         
	//    5    7:getfield        #95  <Field HashMap CharMetrics>
	//    6   10:iload_1         
	//    7   11:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//    8   14:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #465 <Class Object[]>
	//   10   20:astore_2        
_L6:
		i = ((int) (flag));
	//   11   21:iload_3         
	//   12   22:istore_1        
		if(s != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          37
			i = ((Integer)s[1]).intValue();
	//   15   27:aload_2         
	//   16   28:iconst_1        
	//   17   29:aaload          
	//   18   30:checkcast       #467 <Class Integer>
	//   19   33:invokevirtual   #470 <Method int Integer.intValue()>
	//   20   36:istore_1        
_L4:
		return i;
	//   21   37:iload_1         
	//   22   38:ireturn         
_L2:
		i = ((int) (flag));
	//   23   39:iload_3         
	//   24   40:istore_1        
		if(s.equals(".notdef")) goto _L4; else goto _L3
	//   25   41:aload_2         
	//   26   42:ldc2            #311 <String ".notdef">
	//   27   45:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   28   48:ifne            37
_L3:
		s = ((String) ((Object[])CharMetrics.get(((Object) (s)))));
	//   29   51:aload_0         
	//   30   52:getfield        #95  <Field HashMap CharMetrics>
	//   31   55:aload_2         
	//   32   56:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//   33   59:checkcast       #465 <Class Object[]>
	//   34   62:astore_2        
		if(true) goto _L6; else goto _L5
	//   35   63:goto            21
_L5:
	}

	public boolean hasKernPairs()
	{
		return !KernPairs.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field HashMap KernPairs>
	//    2    4:invokevirtual   #485 <Method boolean HashMap.isEmpty()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void process(RandomAccessFileOrArray randomaccessfileorarray)
		throws DocumentException, IOException
	{
		boolean flag;
label0:
		{
			boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			String s1;
label1:
			do
				do
				{
					Object obj = ((Object) (randomaccessfileorarray.readLine()));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #488 <Method String RandomAccessFileOrArray.readLine()>
	//    4    6:astore          4
					flag = flag2;
	//    5    8:iload_3         
	//    6    9:istore_2        
					if(obj == null)
						break label0;
	//    7   10:aload           4
	//    8   12:ifnull          574
					obj = ((Object) (new StringTokenizer(((String) (obj)), " ,\n\r\t\f")));
	//    9   15:new             #490 <Class StringTokenizer>
	//   10   18:dup             
	//   11   19:aload           4
	//   12   21:ldc2            #492 <String " ,\n\r\t\f">
	//   13   24:invokespecial   #495 <Method void StringTokenizer(String, String)>
	//   14   27:astore          4
					if(((StringTokenizer) (obj)).hasMoreTokens())
	//*  15   29:aload           4
	//*  16   31:invokevirtual   #498 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  17   34:ifeq            2
					{
						s1 = ((StringTokenizer) (obj)).nextToken();
	//   18   37:aload           4
	//   19   39:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//   20   42:astore          5
						if(s1.equals("FontName"))
	//*  21   44:aload           5
	//*  22   46:ldc2            #502 <String "FontName">
	//*  23   49:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  24   52:ifeq            74
							FontName = ((StringTokenizer) (obj)).nextToken("\377").substring(1);
	//   25   55:aload_0         
	//   26   56:aload           4
	//   27   58:ldc2            #504 <String "\377">
	//   28   61:invokevirtual   #507 <Method String StringTokenizer.nextToken(String)>
	//   29   64:iconst_1        
	//   30   65:invokevirtual   #509 <Method String String.substring(int)>
	//   31   68:putfield        #296 <Field String FontName>
						else
	//*  32   71:goto            2
						if(s1.equals("FullName"))
	//*  33   74:aload           5
	//*  34   76:ldc2            #510 <String "FullName">
	//*  35   79:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  36   82:ifeq            104
							FullName = ((StringTokenizer) (obj)).nextToken("\377").substring(1);
	//   37   85:aload_0         
	//   38   86:aload           4
	//   39   88:ldc2            #504 <String "\377">
	//   40   91:invokevirtual   #507 <Method String StringTokenizer.nextToken(String)>
	//   41   94:iconst_1        
	//   42   95:invokevirtual   #509 <Method String String.substring(int)>
	//   43   98:putfield        #409 <Field String FullName>
						else
	//*  44  101:goto            2
						if(s1.equals("FamilyName"))
	//*  45  104:aload           5
	//*  46  106:ldc2            #511 <String "FamilyName">
	//*  47  109:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  48  112:ifeq            134
							FamilyName = ((StringTokenizer) (obj)).nextToken("\377").substring(1);
	//   49  115:aload_0         
	//   50  116:aload           4
	//   51  118:ldc2            #504 <String "\377">
	//   52  121:invokevirtual   #507 <Method String StringTokenizer.nextToken(String)>
	//   53  124:iconst_1        
	//   54  125:invokevirtual   #509 <Method String String.substring(int)>
	//   55  128:putfield        #412 <Field String FamilyName>
						else
	//*  56  131:goto            2
						if(s1.equals("Weight"))
	//*  57  134:aload           5
	//*  58  136:ldc2            #512 <String "Weight">
	//*  59  139:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  60  142:ifeq            164
							Weight = ((StringTokenizer) (obj)).nextToken("\377").substring(1);
	//   61  145:aload_0         
	//   62  146:aload           4
	//   63  148:ldc2            #504 <String "\377">
	//   64  151:invokevirtual   #507 <Method String StringTokenizer.nextToken(String)>
	//   65  154:iconst_1        
	//   66  155:invokevirtual   #509 <Method String String.substring(int)>
	//   67  158:putfield        #60  <Field String Weight>
						else
	//*  68  161:goto            2
						if(s1.equals("ItalicAngle"))
	//*  69  164:aload           5
	//*  70  166:ldc2            #513 <String "ItalicAngle">
	//*  71  169:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  72  172:ifeq            190
							ItalicAngle = Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//   73  175:aload_0         
	//   74  176:aload           4
	//   75  178:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//   76  181:invokestatic    #519 <Method float Float.parseFloat(String)>
	//   77  184:putfield        #62  <Field float ItalicAngle>
						else
	//*  78  187:goto            2
						if(s1.equals("IsFixedPitch"))
	//*  79  190:aload           5
	//*  80  192:ldc2            #520 <String "IsFixedPitch">
	//*  81  195:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  82  198:ifeq            219
							IsFixedPitch = ((StringTokenizer) (obj)).nextToken().equals("true");
	//   83  201:aload_0         
	//   84  202:aload           4
	//   85  204:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//   86  207:ldc2            #522 <String "true">
	//   87  210:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   88  213:putfield        #64  <Field boolean IsFixedPitch>
						else
	//*  89  216:goto            2
						if(s1.equals("CharacterSet"))
	//*  90  219:aload           5
	//*  91  221:ldc2            #523 <String "CharacterSet">
	//*  92  224:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  93  227:ifeq            249
							CharacterSet = ((StringTokenizer) (obj)).nextToken("\377").substring(1);
	//   94  230:aload_0         
	//   95  231:aload           4
	//   96  233:ldc2            #504 <String "\377">
	//   97  236:invokevirtual   #507 <Method String StringTokenizer.nextToken(String)>
	//   98  239:iconst_1        
	//   99  240:invokevirtual   #509 <Method String String.substring(int)>
	//  100  243:putfield        #525 <Field String CharacterSet>
						else
	//* 101  246:goto            2
						if(s1.equals("FontBBox"))
	//* 102  249:aload           5
	//* 103  251:ldc2            #527 <String "FontBBox">
	//* 104  254:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 105  257:ifeq            315
						{
							llx = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  106  260:aload_0         
	//  107  261:aload           4
	//  108  263:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  109  266:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  110  269:f2i             
	//  111  270:putfield        #66  <Field int llx>
							lly = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  112  273:aload_0         
	//  113  274:aload           4
	//  114  276:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  115  279:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  116  282:f2i             
	//  117  283:putfield        #68  <Field int lly>
							urx = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  118  286:aload_0         
	//  119  287:aload           4
	//  120  289:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  121  292:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  122  295:f2i             
	//  123  296:putfield        #70  <Field int urx>
							ury = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  124  299:aload_0         
	//  125  300:aload           4
	//  126  302:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  127  305:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  128  308:f2i             
	//  129  309:putfield        #72  <Field int ury>
						} else
	//* 130  312:goto            2
						if(s1.equals("UnderlinePosition"))
	//* 131  315:aload           5
	//* 132  317:ldc2            #528 <String "UnderlinePosition">
	//* 133  320:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 134  323:ifeq            342
							UnderlinePosition = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  135  326:aload_0         
	//  136  327:aload           4
	//  137  329:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  138  332:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  139  335:f2i             
	//  140  336:putfield        #74  <Field int UnderlinePosition>
						else
	//* 141  339:goto            2
						if(s1.equals("UnderlineThickness"))
	//* 142  342:aload           5
	//* 143  344:ldc2            #529 <String "UnderlineThickness">
	//* 144  347:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 145  350:ifeq            369
							UnderlineThickness = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  146  353:aload_0         
	//  147  354:aload           4
	//  148  356:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  149  359:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  150  362:f2i             
	//  151  363:putfield        #76  <Field int UnderlineThickness>
						else
	//* 152  366:goto            2
						if(s1.equals("EncodingScheme"))
	//* 153  369:aload           5
	//* 154  371:ldc2            #530 <String "EncodingScheme">
	//* 155  374:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 156  377:ifeq            399
							EncodingScheme = ((StringTokenizer) (obj)).nextToken("\377").substring(1);
	//  157  380:aload_0         
	//  158  381:aload           4
	//  159  383:ldc2            #504 <String "\377">
	//  160  386:invokevirtual   #507 <Method String StringTokenizer.nextToken(String)>
	//  161  389:iconst_1        
	//  162  390:invokevirtual   #509 <Method String String.substring(int)>
	//  163  393:putfield        #80  <Field String EncodingScheme>
						else
	//* 164  396:goto            2
						if(s1.equals("CapHeight"))
	//* 165  399:aload           5
	//* 166  401:ldc2            #531 <String "CapHeight">
	//* 167  404:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 168  407:ifeq            426
							CapHeight = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  169  410:aload_0         
	//  170  411:aload           4
	//  171  413:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  172  416:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  173  419:f2i             
	//  174  420:putfield        #82  <Field int CapHeight>
						else
	//* 175  423:goto            2
						if(s1.equals("XHeight"))
	//* 176  426:aload           5
	//* 177  428:ldc2            #532 <String "XHeight">
	//* 178  431:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 179  434:ifeq            453
							XHeight = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  180  437:aload_0         
	//  181  438:aload           4
	//  182  440:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  183  443:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  184  446:f2i             
	//  185  447:putfield        #84  <Field int XHeight>
						else
	//* 186  450:goto            2
						if(s1.equals("Ascender"))
	//* 187  453:aload           5
	//* 188  455:ldc2            #533 <String "Ascender">
	//* 189  458:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 190  461:ifeq            480
							Ascender = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  191  464:aload_0         
	//  192  465:aload           4
	//  193  467:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  194  470:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  195  473:f2i             
	//  196  474:putfield        #86  <Field int Ascender>
						else
	//* 197  477:goto            2
						if(s1.equals("Descender"))
	//* 198  480:aload           5
	//* 199  482:ldc2            #534 <String "Descender">
	//* 200  485:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 201  488:ifeq            507
							Descender = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  202  491:aload_0         
	//  203  492:aload           4
	//  204  494:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  205  497:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  206  500:f2i             
	//  207  501:putfield        #88  <Field int Descender>
						else
	//* 208  504:goto            2
						if(s1.equals("StdHW"))
	//* 209  507:aload           5
	//* 210  509:ldc2            #535 <String "StdHW">
	//* 211  512:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 212  515:ifeq            534
						{
							StdHW = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  213  518:aload_0         
	//  214  519:aload           4
	//  215  521:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  216  524:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  217  527:f2i             
	//  218  528:putfield        #537 <Field int StdHW>
						} else
	//* 219  531:goto            2
						{
							if(!s1.equals("StdVW"))
								continue label1;
	//  220  534:aload           5
	//  221  536:ldc2            #538 <String "StdVW">
	//  222  539:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  223  542:ifeq            561
							StdVW = (int)Float.parseFloat(((StringTokenizer) (obj)).nextToken());
	//  224  545:aload_0         
	//  225  546:aload           4
	//  226  548:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  227  551:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  228  554:f2i             
	//  229  555:putfield        #90  <Field int StdVW>
						}
					}
				} while(true);
	//  230  558:goto            2
			while(!s1.equals("StartCharMetrics"));
	//  231  561:aload           5
	//  232  563:ldc2            #540 <String "StartCharMetrics">
	//  233  566:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  234  569:ifeq            2
			flag = true;
	//  235  572:iconst_1        
	//  236  573:istore_2        
		}
		if(!flag)
	//* 237  574:iload_2         
	//* 238  575:ifne            603
			throw new DocumentException(MessageLocalization.getComposedMessage("missing.startcharmetrics.in.1", new Object[] {
				fileName
			}));
	//  239  578:new             #50  <Class DocumentException>
	//  240  581:dup             
	//  241  582:ldc2            #542 <String "missing.startcharmetrics.in.1">
	//  242  585:iconst_1        
	//  243  586:anewarray       Object[]
	//  244  589:dup             
	//  245  590:iconst_0        
	//  246  591:aload_0         
	//  247  592:getfield        #122 <Field String fileName>
	//  248  595:aastore         
	//  249  596:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  250  599:invokespecial   #112 <Method void DocumentException(String)>
	//  251  602:athrow          
		boolean flag3;
label2:
		do
		{
			Object obj3;
label3:
			{
				obj3 = ((Object) (randomaccessfileorarray.readLine()));
	//  252  603:aload_1         
	//  253  604:invokevirtual   #488 <Method String RandomAccessFileOrArray.readLine()>
	//  254  607:astore          8
				flag3 = flag;
	//  255  609:iload_2         
	//  256  610:istore_3        
				if(obj3 != null)
	//* 257  611:aload           8
	//* 258  613:ifnull          651
				{
					StringTokenizer stringtokenizer = new StringTokenizer(((String) (obj3)));
	//  259  616:new             #490 <Class StringTokenizer>
	//  260  619:dup             
	//  261  620:aload           8
	//  262  622:invokespecial   #543 <Method void StringTokenizer(String)>
	//  263  625:astore          4
					if(!stringtokenizer.hasMoreTokens())
						continue;
	//  264  627:aload           4
	//  265  629:invokevirtual   #498 <Method boolean StringTokenizer.hasMoreTokens()>
	//  266  632:ifeq            603
					if(!stringtokenizer.nextToken().equals("EndCharMetrics"))
						break label3;
	//  267  635:aload           4
	//  268  637:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  269  640:ldc2            #545 <String "EndCharMetrics">
	//  270  643:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  271  646:ifeq            680
					flag3 = false;
	//  272  649:iconst_0        
	//  273  650:istore_3        
				}
				if(flag3)
	//* 274  651:iload_3         
	//* 275  652:ifeq            957
					throw new DocumentException(MessageLocalization.getComposedMessage("missing.endcharmetrics.in.1", new Object[] {
						fileName
					}));
	//  276  655:new             #50  <Class DocumentException>
	//  277  658:dup             
	//  278  659:ldc2            #547 <String "missing.endcharmetrics.in.1">
	//  279  662:iconst_1        
	//  280  663:anewarray       Object[]
	//  281  666:dup             
	//  282  667:iconst_0        
	//  283  668:aload_0         
	//  284  669:getfield        #122 <Field String fileName>
	//  285  672:aastore         
	//  286  673:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  287  676:invokespecial   #112 <Method void DocumentException(String)>
	//  288  679:athrow          
				break label2;
			}
			Integer integer1 = Integer.valueOf(-1);
	//  289  680:iconst_m1       
	//  290  681:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//  291  684:astore          6
			Integer integer = Integer.valueOf(250);
	//  292  686:sipush          250
	//  293  689:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//  294  692:astore          4
			String s2 = "";
	//  295  694:ldc1            #58  <String "">
	//  296  696:astore          5
			int ai[] = null;
	//  297  698:aconst_null     
	//  298  699:astore          7
			obj3 = ((Object) (new StringTokenizer(((String) (obj3)), ";")));
	//  299  701:new             #490 <Class StringTokenizer>
	//  300  704:dup             
	//  301  705:aload           8
	//  302  707:ldc2            #549 <String ";">
	//  303  710:invokespecial   #495 <Method void StringTokenizer(String, String)>
	//  304  713:astore          8
			do
			{
				if(!((StringTokenizer) (obj3)).hasMoreTokens())
					break;
	//  305  715:aload           8
	//  306  717:invokevirtual   #498 <Method boolean StringTokenizer.hasMoreTokens()>
	//  307  720:ifeq            892
				StringTokenizer stringtokenizer1 = new StringTokenizer(((StringTokenizer) (obj3)).nextToken());
	//  308  723:new             #490 <Class StringTokenizer>
	//  309  726:dup             
	//  310  727:aload           8
	//  311  729:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  312  732:invokespecial   #543 <Method void StringTokenizer(String)>
	//  313  735:astore          9
				if(stringtokenizer1.hasMoreTokens())
	//* 314  737:aload           9
	//* 315  739:invokevirtual   #498 <Method boolean StringTokenizer.hasMoreTokens()>
	//* 316  742:ifeq            715
				{
					String s4 = stringtokenizer1.nextToken();
	//  317  745:aload           9
	//  318  747:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  319  750:astore          10
					if(s4.equals("C"))
	//* 320  752:aload           10
	//* 321  754:ldc2            #551 <String "C">
	//* 322  757:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 323  760:ifeq            776
						integer1 = Integer.valueOf(stringtokenizer1.nextToken());
	//  324  763:aload           9
	//  325  765:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  326  768:invokestatic    #554 <Method Integer Integer.valueOf(String)>
	//  327  771:astore          6
					else
	//* 328  773:goto            715
					if(s4.equals("WX"))
	//* 329  776:aload           10
	//* 330  778:ldc2            #556 <String "WX">
	//* 331  781:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 332  784:ifeq            804
						integer = Integer.valueOf((int)Float.parseFloat(stringtokenizer1.nextToken()));
	//  333  787:aload           9
	//  334  789:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  335  792:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  336  795:f2i             
	//  337  796:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//  338  799:astore          4
					else
	//* 339  801:goto            715
					if(s4.equals("N"))
	//* 340  804:aload           10
	//* 341  806:ldc2            #558 <String "N">
	//* 342  809:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 343  812:ifeq            825
						s2 = stringtokenizer1.nextToken();
	//  344  815:aload           9
	//  345  817:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  346  820:astore          5
					else
	//* 347  822:goto            715
					if(s4.equals("B"))
	//* 348  825:aload           10
	//* 349  827:ldc2            #560 <String "B">
	//* 350  830:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 351  833:ifeq            715
					{
						ai = new int[4];
	//  352  836:iconst_4        
	//  353  837:newarray        int[]
	//  354  839:astore          7
						ai[0] = Integer.parseInt(stringtokenizer1.nextToken());
	//  355  841:aload           7
	//  356  843:iconst_0        
	//  357  844:aload           9
	//  358  846:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  359  849:invokestatic    #563 <Method int Integer.parseInt(String)>
	//  360  852:iastore         
						ai[1] = Integer.parseInt(stringtokenizer1.nextToken());
	//  361  853:aload           7
	//  362  855:iconst_1        
	//  363  856:aload           9
	//  364  858:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  365  861:invokestatic    #563 <Method int Integer.parseInt(String)>
	//  366  864:iastore         
						ai[2] = Integer.parseInt(stringtokenizer1.nextToken());
	//  367  865:aload           7
	//  368  867:iconst_2        
	//  369  868:aload           9
	//  370  870:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  371  873:invokestatic    #563 <Method int Integer.parseInt(String)>
	//  372  876:iastore         
						ai[3] = Integer.parseInt(stringtokenizer1.nextToken());
	//  373  877:aload           7
	//  374  879:iconst_3        
	//  375  880:aload           9
	//  376  882:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  377  885:invokestatic    #563 <Method int Integer.parseInt(String)>
	//  378  888:iastore         
					}
				}
			} while(true);
	//  379  889:goto            715
			Object aobj2[] = new Object[4];
	//  380  892:iconst_4        
	//  381  893:anewarray       Object[]
	//  382  896:astore          8
			aobj2[0] = ((Object) (integer1));
	//  383  898:aload           8
	//  384  900:iconst_0        
	//  385  901:aload           6
	//  386  903:aastore         
			aobj2[1] = ((Object) (integer));
	//  387  904:aload           8
	//  388  906:iconst_1        
	//  389  907:aload           4
	//  390  909:aastore         
			aobj2[2] = ((Object) (s2));
	//  391  910:aload           8
	//  392  912:iconst_2        
	//  393  913:aload           5
	//  394  915:aastore         
			aobj2[3] = ((Object) (ai));
	//  395  916:aload           8
	//  396  918:iconst_3        
	//  397  919:aload           7
	//  398  921:aastore         
			if(integer1.intValue() >= 0)
	//* 399  922:aload           6
	//* 400  924:invokevirtual   #470 <Method int Integer.intValue()>
	//* 401  927:iflt            942
				CharMetrics.put(((Object) (integer1)), ((Object) (aobj2)));
	//  402  930:aload_0         
	//  403  931:getfield        #95  <Field HashMap CharMetrics>
	//  404  934:aload           6
	//  405  936:aload           8
	//  406  938:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//  407  941:pop             
			CharMetrics.put(((Object) (s2)), ((Object) (aobj2)));
	//  408  942:aload_0         
	//  409  943:getfield        #95  <Field HashMap CharMetrics>
	//  410  946:aload           5
	//  411  948:aload           8
	//  412  950:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//  413  953:pop             
		} while(true);
	//  414  954:goto            603
		int i;
label4:
		{
			if(!CharMetrics.containsKey("nonbreakingspace"))
	//* 415  957:aload_0         
	//* 416  958:getfield        #95  <Field HashMap CharMetrics>
	//* 417  961:ldc2            #568 <String "nonbreakingspace">
	//* 418  964:invokevirtual   #132 <Method boolean HashMap.containsKey(Object)>
	//* 419  967:ifne            1003
			{
				Object aobj[] = (Object[])CharMetrics.get("space");
	//  420  970:aload_0         
	//  421  971:getfield        #95  <Field HashMap CharMetrics>
	//  422  974:ldc2            #570 <String "space">
	//  423  977:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//  424  980:checkcast       #465 <Class Object[]>
	//  425  983:astore          4
				if(aobj != null)
	//* 426  985:aload           4
	//* 427  987:ifnull          1003
					CharMetrics.put("nonbreakingspace", ((Object) (aobj)));
	//  428  990:aload_0         
	//  429  991:getfield        #95  <Field HashMap CharMetrics>
	//  430  994:ldc2            #568 <String "nonbreakingspace">
	//  431  997:aload           4
	//  432  999:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//  433 1002:pop             
			}
			boolean flag1;
			do
			{
				Object obj1 = ((Object) (randomaccessfileorarray.readLine()));
	//  434 1003:aload_1         
	//  435 1004:invokevirtual   #488 <Method String RandomAccessFileOrArray.readLine()>
	//  436 1007:astore          4
				flag1 = flag3;
	//  437 1009:iload_3         
	//  438 1010:istore_2        
				if(obj1 == null)
					break;
	//  439 1011:aload           4
	//  440 1013:ifnull          1067
				obj1 = ((Object) (new StringTokenizer(((String) (obj1)))));
	//  441 1016:new             #490 <Class StringTokenizer>
	//  442 1019:dup             
	//  443 1020:aload           4
	//  444 1022:invokespecial   #543 <Method void StringTokenizer(String)>
	//  445 1025:astore          4
				if(!((StringTokenizer) (obj1)).hasMoreTokens())
					continue;
	//  446 1027:aload           4
	//  447 1029:invokevirtual   #498 <Method boolean StringTokenizer.hasMoreTokens()>
	//  448 1032:ifeq            1003
				obj1 = ((Object) (((StringTokenizer) (obj1)).nextToken()));
	//  449 1035:aload           4
	//  450 1037:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  451 1040:astore          4
				if(((String) (obj1)).equals("EndFontMetrics"))
	//* 452 1042:aload           4
	//* 453 1044:ldc2            #572 <String "EndFontMetrics">
	//* 454 1047:invokevirtual   #217 <Method boolean String.equals(Object)>
	//* 455 1050:ifeq            1054
					return;
	//  456 1053:return          
				if(!((String) (obj1)).equals("StartKernPairs"))
					continue;
	//  457 1054:aload           4
	//  458 1056:ldc2            #574 <String "StartKernPairs">
	//  459 1059:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  460 1062:ifeq            1003
				flag1 = true;
	//  461 1065:iconst_1        
	//  462 1066:istore_2        
				break;
			} while(true);
			if(!flag1)
	//* 463 1067:iload_2         
	//* 464 1068:ifne            1096
				throw new DocumentException(MessageLocalization.getComposedMessage("missing.endfontmetrics.in.1", new Object[] {
					fileName
				}));
	//  465 1071:new             #50  <Class DocumentException>
	//  466 1074:dup             
	//  467 1075:ldc2            #576 <String "missing.endfontmetrics.in.1">
	//  468 1078:iconst_1        
	//  469 1079:anewarray       Object[]
	//  470 1082:dup             
	//  471 1083:iconst_0        
	//  472 1084:aload_0         
	//  473 1085:getfield        #122 <Field String fileName>
	//  474 1088:aastore         
	//  475 1089:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  476 1092:invokespecial   #112 <Method void DocumentException(String)>
	//  477 1095:athrow          
			String s;
label5:
			do
				do
				{
					s = randomaccessfileorarray.readLine();
	//  478 1096:aload_1         
	//  479 1097:invokevirtual   #488 <Method String RandomAccessFileOrArray.readLine()>
	//  480 1100:astore          4
					i = ((int) (flag1));
	//  481 1102:iload_2         
	//  482 1103:istore_3        
					if(s == null)
						break label4;
	//  483 1104:aload           4
	//  484 1106:ifnull          1284
					Object obj2 = ((Object) (new StringTokenizer(s)));
	//  485 1109:new             #490 <Class StringTokenizer>
	//  486 1112:dup             
	//  487 1113:aload           4
	//  488 1115:invokespecial   #543 <Method void StringTokenizer(String)>
	//  489 1118:astore          6
					if(((StringTokenizer) (obj2)).hasMoreTokens())
	//* 490 1120:aload           6
	//* 491 1122:invokevirtual   #498 <Method boolean StringTokenizer.hasMoreTokens()>
	//* 492 1125:ifeq            1096
					{
						s = ((StringTokenizer) (obj2)).nextToken();
	//  493 1128:aload           6
	//  494 1130:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  495 1133:astore          4
						if(!s.equals("KPX"))
							continue label5;
	//  496 1135:aload           4
	//  497 1137:ldc2            #578 <String "KPX">
	//  498 1140:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  499 1143:ifeq            1271
						s = ((StringTokenizer) (obj2)).nextToken();
	//  500 1146:aload           6
	//  501 1148:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  502 1151:astore          4
						String s3 = ((StringTokenizer) (obj2)).nextToken();
	//  503 1153:aload           6
	//  504 1155:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  505 1158:astore          5
						obj2 = ((Object) (Integer.valueOf((int)Float.parseFloat(((StringTokenizer) (obj2)).nextToken()))));
	//  506 1160:aload           6
	//  507 1162:invokevirtual   #501 <Method String StringTokenizer.nextToken()>
	//  508 1165:invokestatic    #519 <Method float Float.parseFloat(String)>
	//  509 1168:f2i             
	//  510 1169:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//  511 1172:astore          6
						Object aobj1[] = (Object[])KernPairs.get(((Object) (s)));
	//  512 1174:aload_0         
	//  513 1175:getfield        #97  <Field HashMap KernPairs>
	//  514 1178:aload           4
	//  515 1180:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//  516 1183:checkcast       #465 <Class Object[]>
	//  517 1186:astore          7
						if(aobj1 == null)
	//* 518 1188:aload           7
	//* 519 1190:ifnonnull       1220
						{
							KernPairs.put(((Object) (s)), ((Object) (new Object[] {
								s3, obj2
							})));
	//  520 1193:aload_0         
	//  521 1194:getfield        #97  <Field HashMap KernPairs>
	//  522 1197:aload           4
	//  523 1199:iconst_2        
	//  524 1200:anewarray       Object[]
	//  525 1203:dup             
	//  526 1204:iconst_0        
	//  527 1205:aload           5
	//  528 1207:aastore         
	//  529 1208:dup             
	//  530 1209:iconst_1        
	//  531 1210:aload           6
	//  532 1212:aastore         
	//  533 1213:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//  534 1216:pop             
						} else
	//* 535 1217:goto            1096
						{
							i = aobj1.length;
	//  536 1220:aload           7
	//  537 1222:arraylength     
	//  538 1223:istore_3        
							Object aobj3[] = new Object[i + 2];
	//  539 1224:iload_3         
	//  540 1225:iconst_2        
	//  541 1226:iadd            
	//  542 1227:anewarray       Object[]
	//  543 1230:astore          8
							System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj3)), 0, i);
	//  544 1232:aload           7
	//  545 1234:iconst_0        
	//  546 1235:aload           8
	//  547 1237:iconst_0        
	//  548 1238:iload_3         
	//  549 1239:invokestatic    #582 <Method void System.arraycopy(Object, int, Object, int, int)>
							aobj3[i] = ((Object) (s3));
	//  550 1242:aload           8
	//  551 1244:iload_3         
	//  552 1245:aload           5
	//  553 1247:aastore         
							aobj3[i + 1] = obj2;
	//  554 1248:aload           8
	//  555 1250:iload_3         
	//  556 1251:iconst_1        
	//  557 1252:iadd            
	//  558 1253:aload           6
	//  559 1255:aastore         
							KernPairs.put(((Object) (s)), ((Object) (aobj3)));
	//  560 1256:aload_0         
	//  561 1257:getfield        #97  <Field HashMap KernPairs>
	//  562 1260:aload           4
	//  563 1262:aload           8
	//  564 1264:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//  565 1267:pop             
						}
					}
				} while(true);
	//  566 1268:goto            1096
			while(!s.equals("EndKernPairs"));
	//  567 1271:aload           4
	//  568 1273:ldc2            #584 <String "EndKernPairs">
	//  569 1276:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  570 1279:ifeq            1096
			i = 0;
	//  571 1282:iconst_0        
	//  572 1283:istore_3        
		}
		if(i != 0)
	//* 573 1284:iload_3         
	//* 574 1285:ifeq            1313
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("missing.endkernpairs.in.1", new Object[] {
				fileName
			}));
	//  575 1288:new             #50  <Class DocumentException>
	//  576 1291:dup             
	//  577 1292:ldc2            #586 <String "missing.endkernpairs.in.1">
	//  578 1295:iconst_1        
	//  579 1296:anewarray       Object[]
	//  580 1299:dup             
	//  581 1300:iconst_0        
	//  582 1301:aload_0         
	//  583 1302:getfield        #122 <Field String fileName>
	//  584 1305:aastore         
	//  585 1306:invokestatic    #109 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  586 1309:invokespecial   #112 <Method void DocumentException(String)>
	//  587 1312:athrow          
		} else
		{
			randomaccessfileorarray.close();
	//  588 1313:aload_1         
	//  589 1314:invokevirtual   #207 <Method void RandomAccessFileOrArray.close()>
			return;
	//  590 1317:return          
		}
	}

	public void setFontDescriptor(int i, float f)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               1: 45
	//	               3: 52
	//	               9: 45
	//	               10: 52
		default:
			return;
	//    2   44:return          

		case 1: // '\001'
		case 9: // '\t'
			Ascender = (int)f;
	//    3   45:aload_0         
	//    4   46:fload_2         
	//    5   47:f2i             
	//    6   48:putfield        #86  <Field int Ascender>
			return;
	//    7   51:return          

		case 3: // '\003'
		case 10: // '\n'
			Descender = (int)f;
	//    8   52:aload_0         
	//    9   53:fload_2         
	//   10   54:f2i             
	//   11   55:putfield        #88  <Field int Descender>
			break;
		}
	//   12   58:return          
	}

	public boolean setKerning(int i, int j, int k)
	{
		String s = GlyphList.unicodeToName(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #459 <Method String GlyphList.unicodeToName(int)>
	//    2    4:astore          4
		String s1;
		if(s != null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
	//*   5   11:iconst_0        
	//*   6   12:ireturn         
	//*   7   13:iload_2         
	//*   8   14:invokestatic    #459 <Method String GlyphList.unicodeToName(int)>
	//*   9   17:astore          5
			if((s1 = GlyphList.unicodeToName(j)) != null)
	//*  10   19:aload           5
	//*  11   21:ifnull          11
			{
				Object aobj[] = (Object[])KernPairs.get(((Object) (s)));
	//   12   24:aload_0         
	//   13   25:getfield        #97  <Field HashMap KernPairs>
	//   14   28:aload           4
	//   15   30:invokevirtual   #463 <Method Object HashMap.get(Object)>
	//   16   33:checkcast       #465 <Class Object[]>
	//   17   36:astore          6
				if(aobj == null)
	//*  18   38:aload           6
	//*  19   40:ifnonnull       71
				{
					KernPairs.put(((Object) (s)), ((Object) (new Object[] {
						s1, Integer.valueOf(k)
					})));
	//   20   43:aload_0         
	//   21   44:getfield        #97  <Field HashMap KernPairs>
	//   22   47:aload           4
	//   23   49:iconst_2        
	//   24   50:anewarray       Object[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:aload           5
	//   28   57:aastore         
	//   29   58:dup             
	//   30   59:iconst_1        
	//   31   60:iload_3         
	//   32   61:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//   33   64:aastore         
	//   34   65:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//   35   68:pop             
					return true;
	//   36   69:iconst_1        
	//   37   70:ireturn         
				}
				for(i = 0; i < aobj.length; i += 2)
	//*  38   71:iconst_0        
	//*  39   72:istore_1        
	//*  40   73:iload_1         
	//*  41   74:aload           6
	//*  42   76:arraylength     
	//*  43   77:icmpge          111
					if(s1.equals(aobj[i]))
	//*  44   80:aload           5
	//*  45   82:aload           6
	//*  46   84:iload_1         
	//*  47   85:aaload          
	//*  48   86:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  49   89:ifeq            104
					{
						aobj[i + 1] = ((Object) (Integer.valueOf(k)));
	//   50   92:aload           6
	//   51   94:iload_1         
	//   52   95:iconst_1        
	//   53   96:iadd            
	//   54   97:iload_3         
	//   55   98:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//   56  101:aastore         
						return true;
	//   57  102:iconst_1        
	//   58  103:ireturn         
					}

	//   59  104:iload_1         
	//   60  105:iconst_2        
	//   61  106:iadd            
	//   62  107:istore_1        
	//*  63  108:goto            73
				i = aobj.length;
	//   64  111:aload           6
	//   65  113:arraylength     
	//   66  114:istore_1        
				Object aobj1[] = new Object[i + 2];
	//   67  115:iload_1         
	//   68  116:iconst_2        
	//   69  117:iadd            
	//   70  118:anewarray       Object[]
	//   71  121:astore          7
				System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
	//   72  123:aload           6
	//   73  125:iconst_0        
	//   74  126:aload           7
	//   75  128:iconst_0        
	//   76  129:iload_1         
	//   77  130:invokestatic    #582 <Method void System.arraycopy(Object, int, Object, int, int)>
				aobj1[i] = ((Object) (s1));
	//   78  133:aload           7
	//   79  135:iload_1         
	//   80  136:aload           5
	//   81  138:aastore         
				aobj1[i + 1] = ((Object) (Integer.valueOf(k)));
	//   82  139:aload           7
	//   83  141:iload_1         
	//   84  142:iconst_1        
	//   85  143:iadd            
	//   86  144:iload_3         
	//   87  145:invokestatic    #477 <Method Integer Integer.valueOf(int)>
	//   88  148:aastore         
				KernPairs.put(((Object) (s)), ((Object) (aobj1)));
	//   89  149:aload_0         
	//   90  150:getfield        #97  <Field HashMap KernPairs>
	//   91  153:aload           4
	//   92  155:aload           7
	//   93  157:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//   94  160:pop             
				return true;
	//   95  161:iconst_1        
	//   96  162:ireturn         
			}
		return false;
	}

	public void setPostscriptFontName(String s)
	{
		FontName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #296 <Field String FontName>
	//    3    5:return          
	}

	void writeFont(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, Object aobj[])
		throws DocumentException, IOException
	{
		int i;
		int k;
		byte abyte0[];
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
			int j = ((Integer)aobj[0]).intValue();
	//    2    3:aload_3         
	//    3    4:iconst_0        
	//    4    5:aaload          
	//    5    6:checkcast       #467 <Class Integer>
	//    6    9:invokevirtual   #470 <Method int Integer.intValue()>
	//    7   12:istore          5
			k = ((Integer)aobj[1]).intValue();
	//    8   14:aload_3         
	//    9   15:iconst_1        
	//   10   16:aaload          
	//   11   17:checkcast       #467 <Class Integer>
	//   12   20:invokevirtual   #470 <Method int Integer.intValue()>
	//   13   23:istore          6
			abyte0 = (byte[])(byte[])aobj[2];
	//   14   25:aload_3         
	//   15   26:iconst_2        
	//   16   27:aaload          
	//   17   28:checkcast       #594 <Class byte[]>
	//   18   31:checkcast       #594 <Class byte[]>
	//   19   34:astore          9
			boolean flag = flag1;
	//   20   36:iload           7
	//   21   38:istore          4
			if(((Boolean)aobj[3]).booleanValue())
	//*  22   40:aload_3         
	//*  23   41:iconst_3        
	//*  24   42:aaload          
	//*  25   43:checkcast       #596 <Class Boolean>
	//*  26   46:invokevirtual   #599 <Method boolean Boolean.booleanValue()>
	//*  27   49:ifeq            66
			{
				flag = flag1;
	//   28   52:iload           7
	//   29   54:istore          4
				if(subset)
	//*  30   56:aload_0         
	//*  31   57:getfield        #602 <Field boolean subset>
	//*  32   60:ifeq            66
					flag = true;
	//   33   63:iconst_1        
	//   34   64:istore          4
			}
			if(flag)
	//*  35   66:iload           4
	//*  36   68:ifeq            82
			{
				i = j;
	//   37   71:iload           5
	//   38   73:istore          4
				if(embedded)
					break label0;
	//   39   75:aload_0         
	//   40   76:getfield        #120 <Field boolean embedded>
	//   41   79:ifne            126
			}
			flag1 = false;
	//   42   82:iconst_0        
	//   43   83:istore          7
			int l = abyte0.length - 1;
	//   44   85:aload           9
	//   45   87:arraylength     
	//   46   88:iconst_1        
	//   47   89:isub            
	//   48   90:istore          8
			j = 0;
	//   49   92:iconst_0        
	//   50   93:istore          5
			do
			{
				i = ((int) (flag1));
	//   51   95:iload           7
	//   52   97:istore          4
				k = l;
	//   53   99:iload           8
	//   54  101:istore          6
				if(j >= abyte0.length)
					break;
	//   55  103:iload           5
	//   56  105:aload           9
	//   57  107:arraylength     
	//   58  108:icmpge          126
				abyte0[j] = 1;
	//   59  111:aload           9
	//   60  113:iload           5
	//   61  115:iconst_1        
	//   62  116:bastore         
				j++;
	//   63  117:iload           5
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:istore          5
			} while(true);
	//   67  123:goto            95
		}
		aobj = null;
	//   68  126:aconst_null     
	//   69  127:astore_3        
		Object obj = ((Object) (getFullFontStream()));
	//   70  128:aload_0         
	//   71  129:invokevirtual   #604 <Method PdfStream getFullFontStream()>
	//   72  132:astore          10
		if(obj != null)
	//*  73  134:aload           10
	//*  74  136:ifnull          149
			aobj = ((Object []) (pdfwriter.addToBody(((PdfObject) (obj))).getIndirectReference()));
	//   75  139:aload_1         
	//   76  140:aload           10
	//   77  142:invokevirtual   #610 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   78  145:invokevirtual   #616 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   79  148:astore_3        
		obj = ((Object) (getFontDescriptor(((PdfIndirectReference) (aobj)))));
	//   80  149:aload_0         
	//   81  150:aload_3         
	//   82  151:invokespecial   #618 <Method PdfDictionary getFontDescriptor(PdfIndirectReference)>
	//   83  154:astore          10
		if(obj != null)
	//*  84  156:aload           10
	//*  85  158:ifnull          171
			aobj = ((Object []) (pdfwriter.addToBody(((PdfObject) (obj))).getIndirectReference()));
	//   86  161:aload_1         
	//   87  162:aload           10
	//   88  164:invokevirtual   #610 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   89  167:invokevirtual   #616 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   90  170:astore_3        
		pdfwriter.addToBody(((PdfObject) (getFontBaseType(((PdfIndirectReference) (aobj)), i, k, abyte0))), pdfindirectreference);
	//   91  171:aload_1         
	//   92  172:aload_0         
	//   93  173:aload_3         
	//   94  174:iload           4
	//   95  176:iload           6
	//   96  178:aload           9
	//   97  180:invokespecial   #620 <Method PdfDictionary getFontBaseType(PdfIndirectReference, int, int, byte[])>
	//   98  183:aload_2         
	//   99  184:invokevirtual   #623 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//  100  187:pop             
	//  101  188:return          
	}

	private static final int PFB_TYPES[] = {
		1, 2, 1
	};
	private static FontsResourceAnchor resourceAnchor;
	private int Ascender;
	private int CapHeight;
	private HashMap CharMetrics;
	private String CharacterSet;
	private int Descender;
	private String EncodingScheme;
	private String FamilyName;
	private String FontName;
	private String FullName;
	private boolean IsFixedPitch;
	private float ItalicAngle;
	private HashMap KernPairs;
	private int StdHW;
	private int StdVW;
	private int UnderlinePosition;
	private int UnderlineThickness;
	private String Weight;
	private int XHeight;
	private boolean builtinFont;
	private String fileName;
	private int llx;
	private int lly;
	protected byte pfb[];
	private int urx;
	private int ury;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_1        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_2        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:iconst_1        
	//   13   14:iastore         
	//   14   15:putstatic       #45  <Field int[] PFB_TYPES>
	//*  15   18:return          
	}
}
