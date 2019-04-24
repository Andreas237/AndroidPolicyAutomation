// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.ICC_Profile;
import java.io.*;
import java.net.URL;

// Referenced classes of package com.itextpdf.text:
//			Image, BadElementException, Utilities

public class Jpeg extends Image
{

	Jpeg(Image image)
	{
		super(image);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void Image(Image)>
	//    3    5:return          
	}

	public Jpeg(URL url)
		throws BadElementException, IOException
	{
		super(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void Image(URL)>
		processParameters();
	//    3    5:aload_0         
	//    4    6:invokespecial   #65  <Method void processParameters()>
	//    5    9:return          
	}

	public Jpeg(byte abyte0[])
		throws BadElementException, IOException
	{
		super((URL)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #69  <Class URL>
	//    3    5:invokespecial   #62  <Method void Image(URL)>
		rawData = abyte0;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #72  <Field byte[] rawData>
		originalData = abyte0;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #75  <Field byte[] originalData>
		processParameters();
	//   10   18:aload_0         
	//   11   19:invokespecial   #65  <Method void processParameters()>
	//   12   22:return          
	}

	public Jpeg(byte abyte0[], float f, float f1)
		throws BadElementException, IOException
	{
		this(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void Jpeg(byte[])>
		scaledWidth = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #82  <Field float scaledWidth>
		scaledHeight = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #85  <Field float scaledHeight>
	//    9   15:return          
	}

	private static final int getShort(InputStream inputstream)
		throws IOException
	{
		return (inputstream.read() << 8) + inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method int InputStream.read()>
	//    2    4:bipush          8
	//    3    6:ishl            
	//    4    7:aload_0         
	//    5    8:invokevirtual   #93  <Method int InputStream.read()>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	private static final int marker(int i)
	{
		for(int j = 0; j < VALID_MARKERS.length; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:getstatic       #34  <Field int[] VALID_MARKERS>
	//*   4    6:arraylength     
	//*   5    7:icmpge          28
			if(i == VALID_MARKERS[j])
	//*   6   10:iload_0         
	//*   7   11:getstatic       #34  <Field int[] VALID_MARKERS>
	//*   8   14:iload_1         
	//*   9   15:iaload          
	//*  10   16:icmpne          21
				return 0;
	//   11   19:iconst_0        
	//   12   20:ireturn         

	//   13   21:iload_1         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:istore_1        
	//*  17   25:goto            2
		for(int k = 0; k < NOPARAM_MARKERS.length; k++)
	//*  18   28:iconst_0        
	//*  19   29:istore_1        
	//*  20   30:iload_1         
	//*  21   31:getstatic       #38  <Field int[] NOPARAM_MARKERS>
	//*  22   34:arraylength     
	//*  23   35:icmpge          56
			if(i == NOPARAM_MARKERS[k])
	//*  24   38:iload_0         
	//*  25   39:getstatic       #38  <Field int[] NOPARAM_MARKERS>
	//*  26   42:iload_1         
	//*  27   43:iaload          
	//*  28   44:icmpne          49
				return 2;
	//   29   47:iconst_2        
	//   30   48:ireturn         

	//   31   49:iload_1         
	//   32   50:iconst_1        
	//   33   51:iadd            
	//   34   52:istore_1        
	//*  35   53:goto            30
		for(int l = 0; l < UNSUPPORTED_MARKERS.length; l++)
	//*  36   56:iconst_0        
	//*  37   57:istore_1        
	//*  38   58:iload_1         
	//*  39   59:getstatic       #36  <Field int[] UNSUPPORTED_MARKERS>
	//*  40   62:arraylength     
	//*  41   63:icmpge          84
			if(i == UNSUPPORTED_MARKERS[l])
	//*  42   66:iload_0         
	//*  43   67:getstatic       #36  <Field int[] UNSUPPORTED_MARKERS>
	//*  44   70:iload_1         
	//*  45   71:iaload          
	//*  46   72:icmpne          77
				return 1;
	//   47   75:iconst_1        
	//   48   76:ireturn         

	//   49   77:iload_1         
	//   50   78:iconst_1        
	//   51   79:iadd            
	//   52   80:istore_1        
	//*  53   81:goto            58
		return -1;
	//   54   84:iconst_m1       
	//   55   85:ireturn         
	}

	private void processParameters()
		throws BadElementException, IOException
	{
		Object obj;
		Object obj1;
		type = 32;
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:putfield        #100 <Field int type>
		originalType = 1;
	//    3    6:aload_0         
	//    4    7:iconst_1        
	//    5    8:putfield        #103 <Field int originalType>
		obj1 = null;
	//    6   11:aconst_null     
	//    7   12:astore          8
		obj = obj1;
	//    8   14:aload           8
	//    9   16:astore          7
		if(rawData != null) goto _L2; else goto _L1
	//   10   18:aload_0         
	//   11   19:getfield        #72  <Field byte[] rawData>
	//   12   22:ifnonnull       122
_L1:
		obj = obj1;
	//   13   25:aload           8
	//   14   27:astore          7
		obj1 = ((Object) (url.openStream()));
	//   15   29:aload_0         
	//   16   30:getfield        #107 <Field URL url>
	//   17   33:invokevirtual   #111 <Method InputStream URL.openStream()>
	//   18   36:astore          8
		obj = obj1;
	//   19   38:aload           8
	//   20   40:astore          7
		String s = url.toString();
	//   21   42:aload_0         
	//   22   43:getfield        #107 <Field URL url>
	//   23   46:invokevirtual   #115 <Method String URL.toString()>
	//   24   49:astore          9
_L4:
		obj = obj1;
	//   25   51:aload           8
	//   26   53:astore          7
		if(((InputStream) (obj1)).read() != 255)
			break MISSING_BLOCK_LABEL_81;
	//   27   55:aload           8
	//   28   57:invokevirtual   #93  <Method int InputStream.read()>
	//   29   60:sipush          255
	//   30   63:icmpne          81
		obj = obj1;
	//   31   66:aload           8
	//   32   68:astore          7
		if(((InputStream) (obj1)).read() == 216)
			break; /* Loop/switch isn't completed */
	//   33   70:aload           8
	//   34   72:invokevirtual   #93  <Method int InputStream.read()>
	//   35   75:sipush          216
	//   36   78:icmpeq          146
		obj = obj1;
	//   37   81:aload           8
	//   38   83:astore          7
		throw new BadElementException(MessageLocalization.getComposedMessage("1.is.not.a.valid.jpeg.file", new Object[] {
			s
		}));
	//   39   85:new             #58  <Class BadElementException>
	//   40   88:dup             
	//   41   89:ldc1            #117 <String "1.is.not.a.valid.jpeg.file">
	//   42   91:iconst_1        
	//   43   92:anewarray       Object[]
	//   44   95:dup             
	//   45   96:iconst_0        
	//   46   97:aload           9
	//   47   99:aastore         
	//   48  100:invokestatic    #125 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   49  103:invokespecial   #128 <Method void BadElementException(String)>
	//   50  106:athrow          
		obj1;
	//   51  107:astore          8
		if(obj != null)
	//*  52  109:aload           7
	//*  53  111:ifnull          119
			((InputStream) (obj)).close();
	//   54  114:aload           7
	//   55  116:invokevirtual   #131 <Method void InputStream.close()>
		throw obj1;
	//   56  119:aload           8
	//   57  121:athrow          
_L2:
		obj = obj1;
	//   58  122:aload           8
	//   59  124:astore          7
		obj1 = ((Object) (new ByteArrayInputStream(rawData)));
	//   60  126:new             #133 <Class ByteArrayInputStream>
	//   61  129:dup             
	//   62  130:aload_0         
	//   63  131:getfield        #72  <Field byte[] rawData>
	//   64  134:invokespecial   #134 <Method void ByteArrayInputStream(byte[])>
	//   65  137:astore          8
		s = "Byte array";
	//   66  139:ldc1            #136 <String "Byte array">
	//   67  141:astore          9
		if(true) goto _L4; else goto _L3
	//   68  143:goto            51
_L3:
		int i = 1;
	//   69  146:iconst_1        
	//   70  147:istore_1        
_L8:
		obj = obj1;
	//   71  148:aload           8
	//   72  150:astore          7
		int j = ((InputStream) (obj1)).read();
	//   73  152:aload           8
	//   74  154:invokevirtual   #93  <Method int InputStream.read()>
	//   75  157:istore_2        
		if(j >= 0) goto _L6; else goto _L5
	//   76  158:iload_2         
	//   77  159:ifge            183
_L5:
		obj = obj1;
	//   78  162:aload           8
	//   79  164:astore          7
		throw new IOException(MessageLocalization.getComposedMessage("premature.eof.while.reading.jpg", new Object[0]));
	//   80  166:new             #60  <Class IOException>
	//   81  169:dup             
	//   82  170:ldc1            #138 <String "premature.eof.while.reading.jpg">
	//   83  172:iconst_0        
	//   84  173:anewarray       Object[]
	//   85  176:invokestatic    #125 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   86  179:invokespecial   #139 <Method void IOException(String)>
	//   87  182:athrow          
_L6:
		if(j != 255) goto _L8; else goto _L7
	//   88  183:iload_2         
	//   89  184:sipush          255
	//   90  187:icmpne          148
_L7:
		obj = obj1;
	//   91  190:aload           8
	//   92  192:astore          7
		int k = ((InputStream) (obj1)).read();
	//   93  194:aload           8
	//   94  196:invokevirtual   #93  <Method int InputStream.read()>
	//   95  199:istore_3        
		if(i == 0 || k != 224) goto _L10; else goto _L9
	//   96  200:iload_1         
	//   97  201:ifeq            495
	//   98  204:iload_3         
	//   99  205:sipush          224
	//  100  208:icmpne          495
_L9:
		k = 0;
	//  101  211:iconst_0        
	//  102  212:istore_3        
		obj = obj1;
	//  103  213:aload           8
	//  104  215:astore          7
		int i1 = getShort(((InputStream) (obj1)));
	//  105  217:aload           8
	//  106  219:invokestatic    #141 <Method int getShort(InputStream)>
	//  107  222:istore          5
		if(i1 >= 16)
			break MISSING_BLOCK_LABEL_249;
	//  108  224:iload           5
	//  109  226:bipush          16
	//  110  228:icmpge          249
		obj = obj1;
	//  111  231:aload           8
	//  112  233:astore          7
		Utilities.skip(((InputStream) (obj1)), i1 - 2);
	//  113  235:aload           8
	//  114  237:iload           5
	//  115  239:iconst_2        
	//  116  240:isub            
	//  117  241:invokestatic    #147 <Method void Utilities.skip(InputStream, int)>
		i = k;
	//  118  244:iload_3         
	//  119  245:istore_1        
		  goto _L8
	//* 120  246:goto            148
		obj = obj1;
	//  121  249:aload           8
	//  122  251:astore          7
		byte abyte1[] = new byte[JFIF_ID.length];
	//  123  253:getstatic       #43  <Field byte[] JFIF_ID>
	//  124  256:arraylength     
	//  125  257:newarray        byte[]
	//  126  259:astore          10
		obj = obj1;
	//  127  261:aload           8
	//  128  263:astore          7
		if(((InputStream) (obj1)).read(abyte1) == abyte1.length) goto _L12; else goto _L11
	//  129  265:aload           8
	//  130  267:aload           10
	//  131  269:invokevirtual   #150 <Method int InputStream.read(byte[])>
	//  132  272:aload           10
	//  133  274:arraylength     
	//  134  275:icmpeq          1396
_L11:
		obj = obj1;
	//  135  278:aload           8
	//  136  280:astore          7
		throw new BadElementException(MessageLocalization.getComposedMessage("1.corrupted.jfif.marker", new Object[] {
			s
		}));
	//  137  282:new             #58  <Class BadElementException>
	//  138  285:dup             
	//  139  286:ldc1            #152 <String "1.corrupted.jfif.marker">
	//  140  288:iconst_1        
	//  141  289:anewarray       Object[]
	//  142  292:dup             
	//  143  293:iconst_0        
	//  144  294:aload           9
	//  145  296:aastore         
	//  146  297:invokestatic    #125 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  147  300:invokespecial   #128 <Method void BadElementException(String)>
	//  148  303:athrow          
_L50:
		int l;
		obj = obj1;
	//  149  304:aload           8
	//  150  306:astore          7
		j = l;
	//  151  308:iload           4
	//  152  310:istore_2        
		if(i >= abyte1.length) goto _L14; else goto _L13
	//  153  311:iload_1         
	//  154  312:aload           10
	//  155  314:arraylength     
	//  156  315:icmpge          336
_L13:
		obj = obj1;
	//  157  318:aload           8
	//  158  320:astore          7
		if(abyte1[i] == JFIF_ID[i]) goto _L16; else goto _L15
	//  159  322:aload           10
	//  160  324:iload_1         
	//  161  325:baload          
	//  162  326:getstatic       #43  <Field byte[] JFIF_ID>
	//  163  329:iload_1         
	//  164  330:baload          
	//  165  331:icmpeq          1404
_L15:
		j = 0;
	//  166  334:iconst_0        
	//  167  335:istore_2        
_L14:
		if(j != 0)
			break MISSING_BLOCK_LABEL_362;
	//  168  336:iload_2         
	//  169  337:ifne            362
		obj = obj1;
	//  170  340:aload           8
	//  171  342:astore          7
		Utilities.skip(((InputStream) (obj1)), i1 - 2 - abyte1.length);
	//  172  344:aload           8
	//  173  346:iload           5
	//  174  348:iconst_2        
	//  175  349:isub            
	//  176  350:aload           10
	//  177  352:arraylength     
	//  178  353:isub            
	//  179  354:invokestatic    #147 <Method void Utilities.skip(InputStream, int)>
		i = k;
	//  180  357:iload_3         
	//  181  358:istore_1        
		  goto _L8
	//* 182  359:goto            148
		obj = obj1;
	//  183  362:aload           8
	//  184  364:astore          7
		Utilities.skip(((InputStream) (obj1)), 2);
	//  185  366:aload           8
	//  186  368:iconst_2        
	//  187  369:invokestatic    #147 <Method void Utilities.skip(InputStream, int)>
		obj = obj1;
	//  188  372:aload           8
	//  189  374:astore          7
		i = ((InputStream) (obj1)).read();
	//  190  376:aload           8
	//  191  378:invokevirtual   #93  <Method int InputStream.read()>
	//  192  381:istore_1        
		obj = obj1;
	//  193  382:aload           8
	//  194  384:astore          7
		j = getShort(((InputStream) (obj1)));
	//  195  386:aload           8
	//  196  388:invokestatic    #141 <Method int getShort(InputStream)>
	//  197  391:istore_2        
		obj = obj1;
	//  198  392:aload           8
	//  199  394:astore          7
		l = getShort(((InputStream) (obj1)));
	//  200  396:aload           8
	//  201  398:invokestatic    #141 <Method int getShort(InputStream)>
	//  202  401:istore          4
		if(i != 1) goto _L18; else goto _L17
	//  203  403:iload_1         
	//  204  404:iconst_1        
	//  205  405:icmpne          452
_L17:
		obj = obj1;
	//  206  408:aload           8
	//  207  410:astore          7
		dpiX = j;
	//  208  412:aload_0         
	//  209  413:iload_2         
	//  210  414:putfield        #155 <Field int dpiX>
		obj = obj1;
	//  211  417:aload           8
	//  212  419:astore          7
		dpiY = l;
	//  213  421:aload_0         
	//  214  422:iload           4
	//  215  424:putfield        #158 <Field int dpiY>
_L20:
		obj = obj1;
	//  216  427:aload           8
	//  217  429:astore          7
		Utilities.skip(((InputStream) (obj1)), i1 - 2 - abyte1.length - 7);
	//  218  431:aload           8
	//  219  433:iload           5
	//  220  435:iconst_2        
	//  221  436:isub            
	//  222  437:aload           10
	//  223  439:arraylength     
	//  224  440:isub            
	//  225  441:bipush          7
	//  226  443:isub            
	//  227  444:invokestatic    #147 <Method void Utilities.skip(InputStream, int)>
		i = k;
	//  228  447:iload_3         
	//  229  448:istore_1        
		  goto _L8
	//* 230  449:goto            148
_L18:
		if(i != 2) goto _L20; else goto _L19
	//  231  452:iload_1         
	//  232  453:iconst_2        
	//  233  454:icmpne          427
_L19:
		obj = obj1;
	//  234  457:aload           8
	//  235  459:astore          7
		dpiX = (int)((float)j * 2.54F + 0.5F);
	//  236  461:aload_0         
	//  237  462:iload_2         
	//  238  463:i2f             
	//  239  464:ldc1            #159 <Float 2.54F>
	//  240  466:fmul            
	//  241  467:ldc1            #160 <Float 0.5F>
	//  242  469:fadd            
	//  243  470:f2i             
	//  244  471:putfield        #155 <Field int dpiX>
		obj = obj1;
	//  245  474:aload           8
	//  246  476:astore          7
		dpiY = (int)((float)l * 2.54F + 0.5F);
	//  247  478:aload_0         
	//  248  479:iload           4
	//  249  481:i2f             
	//  250  482:ldc1            #159 <Float 2.54F>
	//  251  484:fmul            
	//  252  485:ldc1            #160 <Float 0.5F>
	//  253  487:fadd            
	//  254  488:f2i             
	//  255  489:putfield        #158 <Field int dpiY>
		  goto _L20
	//* 256  492:goto            427
_L10:
		if(k != 238)
			break MISSING_BLOCK_LABEL_600;
	//  257  495:iload_3         
	//  258  496:sipush          238
	//  259  499:icmpne          600
		obj = obj1;
	//  260  502:aload           8
	//  261  504:astore          7
		k = getShort(((InputStream) (obj1))) - 2;
	//  262  506:aload           8
	//  263  508:invokestatic    #141 <Method int getShort(InputStream)>
	//  264  511:iconst_2        
	//  265  512:isub            
	//  266  513:istore_3        
		obj = obj1;
	//  267  514:aload           8
	//  268  516:astore          7
		abyte1 = new byte[k];
	//  269  518:iload_3         
	//  270  519:newarray        byte[]
	//  271  521:astore          10
		j = 0;
	//  272  523:iconst_0        
	//  273  524:istore_2        
_L22:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//  274  525:iload_2         
	//  275  526:iload_3         
	//  276  527:icmpge          551
		obj = obj1;
	//  277  530:aload           8
	//  278  532:astore          7
		abyte1[j] = (byte)((InputStream) (obj1)).read();
	//  279  534:aload           10
	//  280  536:iload_2         
	//  281  537:aload           8
	//  282  539:invokevirtual   #93  <Method int InputStream.read()>
	//  283  542:int2byte        
	//  284  543:bastore         
		j++;
	//  285  544:iload_2         
	//  286  545:iconst_1        
	//  287  546:iadd            
	//  288  547:istore_2        
		if(true) goto _L22; else goto _L21
	//  289  548:goto            525
_L21:
		obj = obj1;
	//  290  551:aload           8
	//  291  553:astore          7
		if(abyte1.length < 12) goto _L8; else goto _L23
	//  292  555:aload           10
	//  293  557:arraylength     
	//  294  558:bipush          12
	//  295  560:icmplt          148
_L23:
		obj = obj1;
	//  296  563:aload           8
	//  297  565:astore          7
		if(!(new String(abyte1, 0, 5, "ISO-8859-1")).equals("Adobe")) goto _L8; else goto _L24
	//  298  567:new             #162 <Class String>
	//  299  570:dup             
	//  300  571:aload           10
	//  301  573:iconst_0        
	//  302  574:iconst_5        
	//  303  575:ldc1            #164 <String "ISO-8859-1">
	//  304  577:invokespecial   #167 <Method void String(byte[], int, int, String)>
	//  305  580:ldc1            #169 <String "Adobe">
	//  306  582:invokevirtual   #173 <Method boolean String.equals(Object)>
	//  307  585:ifeq            148
_L24:
		obj = obj1;
	//  308  588:aload           8
	//  309  590:astore          7
		invert = true;
	//  310  592:aload_0         
	//  311  593:iconst_1        
	//  312  594:putfield        #177 <Field boolean invert>
		  goto _L8
	//* 313  597:goto            148
		if(k != 226)
			break MISSING_BLOCK_LABEL_767;
	//  314  600:iload_3         
	//  315  601:sipush          226
	//  316  604:icmpne          767
		obj = obj1;
	//  317  607:aload           8
	//  318  609:astore          7
		k = getShort(((InputStream) (obj1))) - 2;
	//  319  611:aload           8
	//  320  613:invokestatic    #141 <Method int getShort(InputStream)>
	//  321  616:iconst_2        
	//  322  617:isub            
	//  323  618:istore_3        
		obj = obj1;
	//  324  619:aload           8
	//  325  621:astore          7
		abyte1 = new byte[k];
	//  326  623:iload_3         
	//  327  624:newarray        byte[]
	//  328  626:astore          10
		j = 0;
	//  329  628:iconst_0        
	//  330  629:istore_2        
_L26:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//  331  630:iload_2         
	//  332  631:iload_3         
	//  333  632:icmpge          656
		obj = obj1;
	//  334  635:aload           8
	//  335  637:astore          7
		abyte1[j] = (byte)((InputStream) (obj1)).read();
	//  336  639:aload           10
	//  337  641:iload_2         
	//  338  642:aload           8
	//  339  644:invokevirtual   #93  <Method int InputStream.read()>
	//  340  647:int2byte        
	//  341  648:bastore         
		j++;
	//  342  649:iload_2         
	//  343  650:iconst_1        
	//  344  651:iadd            
	//  345  652:istore_2        
		if(true) goto _L26; else goto _L25
	//  346  653:goto            630
_L25:
		obj = obj1;
	//  347  656:aload           8
	//  348  658:astore          7
		if(abyte1.length < 14) goto _L8; else goto _L27
	//  349  660:aload           10
	//  350  662:arraylength     
	//  351  663:bipush          14
	//  352  665:icmplt          148
_L27:
		obj = obj1;
	//  353  668:aload           8
	//  354  670:astore          7
		if(!(new String(abyte1, 0, 11, "ISO-8859-1")).equals("ICC_PROFILE")) goto _L8; else goto _L28
	//  355  672:new             #162 <Class String>
	//  356  675:dup             
	//  357  676:aload           10
	//  358  678:iconst_0        
	//  359  679:bipush          11
	//  360  681:ldc1            #164 <String "ISO-8859-1">
	//  361  683:invokespecial   #167 <Method void String(byte[], int, int, String)>
	//  362  686:ldc1            #179 <String "ICC_PROFILE">
	//  363  688:invokevirtual   #173 <Method boolean String.equals(Object)>
	//  364  691:ifeq            148
_L28:
		k = abyte1[12] & 0xff;
	//  365  694:aload           10
	//  366  696:bipush          12
	//  367  698:baload          
	//  368  699:sipush          255
	//  369  702:iand            
	//  370  703:istore_3        
		l = abyte1[13] & 0xff;
	//  371  704:aload           10
	//  372  706:bipush          13
	//  373  708:baload          
	//  374  709:sipush          255
	//  375  712:iand            
	//  376  713:istore          4
		j = k;
	//  377  715:iload_3         
	//  378  716:istore_2        
		boolean flag;
		int k1;
		byte abyte0[];
		IllegalArgumentException illegalargumentexception;
		if(k < 1)
	//* 379  717:iload_3         
	//* 380  718:iconst_1        
	//* 381  719:icmpge          1411
			j = 1;
	//  382  722:iconst_1        
	//  383  723:istore_2        
	//* 384  724:goto            1411
	//* 385  727:aload           8
	//* 386  729:astore          7
	//* 387  731:aload_0         
	//* 388  732:getfield        #181 <Field byte[][] icc>
	//* 389  735:ifnonnull       750
	//* 390  738:aload           8
	//* 391  740:astore          7
	//* 392  742:aload_0         
	//* 393  743:iload_3         
	//* 394  744:anewarray       byte[][]
	//* 395  747:putfield        #181 <Field byte[][] icc>
	//* 396  750:aload           8
	//* 397  752:astore          7
	//* 398  754:aload_0         
	//* 399  755:getfield        #181 <Field byte[][] icc>
	//* 400  758:iload_2         
	//* 401  759:iconst_1        
	//* 402  760:isub            
	//* 403  761:aload           10
	//* 404  763:aastore         
	//* 405  764:goto            148
	//* 406  767:iload_3         
	//* 407  768:sipush          237
	//* 408  771:icmpne          1013
	//* 409  774:aload           8
	//* 410  776:astore          7
	//* 411  778:aload           8
	//* 412  780:invokestatic    #141 <Method int getShort(InputStream)>
	//* 413  783:iconst_2        
	//* 414  784:isub            
	//* 415  785:istore          6
	//* 416  787:aload           8
	//* 417  789:astore          7
	//* 418  791:iload           6
	//* 419  793:newarray        byte[]
	//* 420  795:astore          10
	//* 421  797:iconst_0        
	//* 422  798:istore_2        
	//* 423  799:iload_2         
	//* 424  800:iload           6
	//* 425  802:icmpge          1425
	//* 426  805:aload           8
	//* 427  807:astore          7
	//* 428  809:aload           10
	//* 429  811:iload_2         
	//* 430  812:aload           8
	//* 431  814:invokevirtual   #93  <Method int InputStream.read()>
	//* 432  817:int2byte        
	//* 433  818:bastore         
	//* 434  819:iload_2         
	//* 435  820:iconst_1        
	//* 436  821:iadd            
	//* 437  822:istore_2        
	//* 438  823:goto            799
	//* 439  826:aload           8
	//* 440  828:astore          7
	//* 441  830:iload_2         
	//* 442  831:iload           6
	//* 443  833:getstatic       #50  <Field byte[] PS_8BIM_RESO>
	//* 444  836:arraylength     
	//* 445  837:isub            
	//* 446  838:icmpge          886
	//* 447  841:iconst_1        
	//* 448  842:istore          5
	//* 449  844:iconst_0        
	//* 450  845:istore_3        
	//* 451  846:aload           8
	//* 452  848:astore          7
	//* 453  850:iload           5
	//* 454  852:istore          4
	//* 455  854:iload_3         
	//* 456  855:getstatic       #50  <Field byte[] PS_8BIM_RESO>
	//* 457  858:arraylength     
	//* 458  859:icmpge          1430
	//* 459  862:aload           8
	//* 460  864:astore          7
	//* 461  866:aload           10
	//* 462  868:iload_2         
	//* 463  869:iload_3         
	//* 464  870:iadd            
	//* 465  871:baload          
	//* 466  872:getstatic       #50  <Field byte[] PS_8BIM_RESO>
	//* 467  875:iload_3         
	//* 468  876:baload          
	//* 469  877:icmpeq          1651
	//* 470  880:iconst_0        
	//* 471  881:istore          4
	//* 472  883:goto            1430
	//* 473  886:aload           8
	//* 474  888:astore          7
	//* 475  890:iload_2         
	//* 476  891:getstatic       #50  <Field byte[] PS_8BIM_RESO>
	//* 477  894:arraylength     
	//* 478  895:iadd            
	//* 479  896:istore          4
	//* 480  898:aload           8
	//* 481  900:astore          7
	//* 482  902:iload           4
	//* 483  904:iload           6
	//* 484  906:getstatic       #50  <Field byte[] PS_8BIM_RESO>
	//* 485  909:arraylength     
	//* 486  910:isub            
	//* 487  911:icmpge          148
	//* 488  914:aload           10
	//* 489  916:iload           4
	//* 490  918:baload          
	//* 491  919:iconst_1        
	//* 492  920:iadd            
	//* 493  921:int2byte        
	//* 494  922:istore_3        
	//* 495  923:iload_3         
	//* 496  924:istore_2        
	//* 497  925:iload_3         
	//* 498  926:iconst_2        
	//* 499  927:irem            
	//* 500  928:iconst_1        
	//* 501  929:icmpne          1438
	//* 502  932:iload_3         
	//* 503  933:iconst_1        
	//* 504  934:iadd            
	//* 505  935:int2byte        
	//* 506  936:istore_2        
	//* 507  937:goto            1438
	//* 508  940:aload           8
	//* 509  942:astore          7
	//* 510  944:aload_0         
	//* 511  945:getfield        #155 <Field int dpiX>
	//* 512  948:ifeq            1001
	//* 513  951:aload           8
	//* 514  953:astore          7
	//* 515  955:aload_0         
	//* 516  956:getfield        #155 <Field int dpiX>
	//* 517  959:iload_2         
	//* 518  960:icmpeq          1001
	//* 519  963:goto            1616
	//* 520  966:aload           8
	//* 521  968:astore          7
	//* 522  970:aload_0         
	//* 523  971:getfield        #158 <Field int dpiY>
	//* 524  974:ifeq            989
	//* 525  977:aload           8
	//* 526  979:astore          7
	//* 527  981:aload_0         
	//* 528  982:getfield        #158 <Field int dpiY>
	//* 529  985:iload_2         
	//* 530  986:icmpne          148
	//* 531  989:aload           8
	//* 532  991:astore          7
	//* 533  993:aload_0         
	//* 534  994:iload_2         
	//* 535  995:putfield        #158 <Field int dpiY>
	//* 536  998:goto            148
	//* 537 1001:aload           8
	//* 538 1003:astore          7
	//* 539 1005:aload_0         
	//* 540 1006:iload_2         
	//* 541 1007:putfield        #155 <Field int dpiX>
	//* 542 1010:goto            1616
	//* 543 1013:iconst_0        
	//* 544 1014:istore_2        
	//* 545 1015:aload           8
	//* 546 1017:astore          7
	//* 547 1019:iload_3         
	//* 548 1020:invokestatic    #184 <Method int marker(int)>
	//* 549 1023:istore          4
	//* 550 1025:iload           4
	//* 551 1027:ifne            1219
	//* 552 1030:aload           8
	//* 553 1032:astore          7
	//* 554 1034:aload           8
	//* 555 1036:iconst_2        
	//* 556 1037:invokestatic    #147 <Method void Utilities.skip(InputStream, int)>
	//* 557 1040:aload           8
	//* 558 1042:astore          7
	//* 559 1044:aload           8
	//* 560 1046:invokevirtual   #93  <Method int InputStream.read()>
	//* 561 1049:bipush          8
	//* 562 1051:icmpeq          1080
	//* 563 1054:aload           8
	//* 564 1056:astore          7
	//* 565 1058:new             #58  <Class BadElementException>
	//* 566 1061:dup             
	//* 567 1062:ldc1            #186 <String "1.must.have.8.bits.per.component">
	//* 568 1064:iconst_1        
	//* 569 1065:anewarray       Object[]
	//* 570 1068:dup             
	//* 571 1069:iconst_0        
	//* 572 1070:aload           9
	//* 573 1072:aastore         
	//* 574 1073:invokestatic    #125 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 575 1076:invokespecial   #128 <Method void BadElementException(String)>
	//* 576 1079:athrow          
	//* 577 1080:aload           8
	//* 578 1082:astore          7
	//* 579 1084:aload_0         
	//* 580 1085:aload           8
	//* 581 1087:invokestatic    #141 <Method int getShort(InputStream)>
	//* 582 1090:i2f             
	//* 583 1091:putfield        #85  <Field float scaledHeight>
	//* 584 1094:aload           8
	//* 585 1096:astore          7
	//* 586 1098:aload_0         
	//* 587 1099:aload_0         
	//* 588 1100:getfield        #85  <Field float scaledHeight>
	//* 589 1103:invokevirtual   #190 <Method void setTop(float)>
	//* 590 1106:aload           8
	//* 591 1108:astore          7
	//* 592 1110:aload_0         
	//* 593 1111:aload           8
	//* 594 1113:invokestatic    #141 <Method int getShort(InputStream)>
	//* 595 1116:i2f             
	//* 596 1117:putfield        #82  <Field float scaledWidth>
	//* 597 1120:aload           8
	//* 598 1122:astore          7
	//* 599 1124:aload_0         
	//* 600 1125:aload_0         
	//* 601 1126:getfield        #82  <Field float scaledWidth>
	//* 602 1129:invokevirtual   #193 <Method void setRight(float)>
	//* 603 1132:aload           8
	//* 604 1134:astore          7
	//* 605 1136:aload_0         
	//* 606 1137:aload           8
	//* 607 1139:invokevirtual   #93  <Method int InputStream.read()>
	//* 608 1142:putfield        #196 <Field int colorspace>
	//* 609 1145:aload           8
	//* 610 1147:astore          7
	//* 611 1149:aload_0         
	//* 612 1150:bipush          8
	//* 613 1152:putfield        #199 <Field int bpc>
	//* 614 1155:aload           8
	//* 615 1157:ifnull          1165
	//* 616 1160:aload           8
	//* 617 1162:invokevirtual   #131 <Method void InputStream.close()>
	//* 618 1165:aload_0         
	//* 619 1166:aload_0         
	//* 620 1167:invokevirtual   #203 <Method float getWidth()>
	//* 621 1170:putfield        #206 <Field float plainWidth>
	//* 622 1173:aload_0         
	//* 623 1174:aload_0         
	//* 624 1175:invokevirtual   #209 <Method float getHeight()>
	//* 625 1178:putfield        #212 <Field float plainHeight>
	//* 626 1181:aload_0         
	//* 627 1182:getfield        #181 <Field byte[][] icc>
	//* 628 1185:ifnull          1218
	//* 629 1188:iconst_0        
	//* 630 1189:istore_2        
	//* 631 1190:iconst_0        
	//* 632 1191:istore_1        
	//* 633 1192:iload_1         
	//* 634 1193:aload_0         
	//* 635 1194:getfield        #181 <Field byte[][] icc>
	//* 636 1197:arraylength     
	//* 637 1198:icmpge          1307
	//* 638 1201:aload_0         
	//* 639 1202:getfield        #181 <Field byte[][] icc>
	//* 640 1205:iload_1         
	//* 641 1206:aaload          
	//* 642 1207:ifnonnull       1287
	//* 643 1210:aload_0         
	//* 644 1211:aconst_null     
	//* 645 1212:checkcast       #213 <Class byte[][]>
	//* 646 1215:putfield        #181 <Field byte[][] icc>
	//* 647 1218:return          
	//* 648 1219:iload           4
	//* 649 1221:iconst_1        
	//* 650 1222:icmpne          1258
	//* 651 1225:aload           8
	//* 652 1227:astore          7
	//* 653 1229:new             #58  <Class BadElementException>
	//* 654 1232:dup             
	//* 655 1233:ldc1            #215 <String "1.unsupported.jpeg.marker.2">
	//* 656 1235:iconst_2        
	//* 657 1236:anewarray       Object[]
	//* 658 1239:dup             
	//* 659 1240:iconst_0        
	//* 660 1241:aload           9
	//* 661 1243:aastore         
	//* 662 1244:dup             
	//* 663 1245:iconst_1        
	//* 664 1246:iload_3         
	//* 665 1247:invokestatic    #219 <Method String String.valueOf(int)>
	//* 666 1250:aastore         
	//* 667 1251:invokestatic    #125 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 668 1254:invokespecial   #128 <Method void BadElementException(String)>
	//* 669 1257:athrow          
	//* 670 1258:iload_2         
	//* 671 1259:istore_1        
	//* 672 1260:iload           4
	//* 673 1262:iconst_2        
	//* 674 1263:icmpeq          148
	//* 675 1266:aload           8
	//* 676 1268:astore          7
	//* 677 1270:aload           8
	//* 678 1272:aload           8
	//* 679 1274:invokestatic    #141 <Method int getShort(InputStream)>
	//* 680 1277:iconst_2        
	//* 681 1278:isub            
	//* 682 1279:invokestatic    #147 <Method void Utilities.skip(InputStream, int)>
	//* 683 1282:iload_2         
	//* 684 1283:istore_1        
	//* 685 1284:goto            148
	//* 686 1287:iload_2         
	//* 687 1288:aload_0         
	//* 688 1289:getfield        #181 <Field byte[][] icc>
	//* 689 1292:iload_1         
	//* 690 1293:aaload          
	//* 691 1294:arraylength     
	//* 692 1295:bipush          14
	//* 693 1297:isub            
	//* 694 1298:iadd            
	//* 695 1299:istore_2        
	//* 696 1300:iload_1         
	//* 697 1301:iconst_1        
	//* 698 1302:iadd            
	//* 699 1303:istore_1        
	//* 700 1304:goto            1192
	//* 701 1307:iload_2         
	//* 702 1308:newarray        byte[]
	//* 703 1310:astore          7
	//* 704 1312:iconst_0        
	//* 705 1313:istore_2        
	//* 706 1314:iconst_0        
	//* 707 1315:istore_1        
	//* 708 1316:iload_1         
	//* 709 1317:aload_0         
	//* 710 1318:getfield        #181 <Field byte[][] icc>
	//* 711 1321:arraylength     
	//* 712 1322:icmpge          1369
	//* 713 1325:aload_0         
	//* 714 1326:getfield        #181 <Field byte[][] icc>
	//* 715 1329:iload_1         
	//* 716 1330:aaload          
	//* 717 1331:bipush          14
	//* 718 1333:aload           7
	//* 719 1335:iload_2         
	//* 720 1336:aload_0         
	//* 721 1337:getfield        #181 <Field byte[][] icc>
	//* 722 1340:iload_1         
	//* 723 1341:aaload          
	//* 724 1342:arraylength     
	//* 725 1343:bipush          14
	//* 726 1345:isub            
	//* 727 1346:invokestatic    #225 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 728 1349:iload_2         
	//* 729 1350:aload_0         
	//* 730 1351:getfield        #181 <Field byte[][] icc>
	//* 731 1354:iload_1         
	//* 732 1355:aaload          
	//* 733 1356:arraylength     
	//* 734 1357:bipush          14
	//* 735 1359:isub            
	//* 736 1360:iadd            
	//* 737 1361:istore_2        
	//* 738 1362:iload_1         
	//* 739 1363:iconst_1        
	//* 740 1364:iadd            
	//* 741 1365:istore_1        
	//* 742 1366:goto            1316
	//* 743 1369:aload_0         
	//* 744 1370:aload           7
	//* 745 1372:aload_0         
	//* 746 1373:getfield        #196 <Field int colorspace>
	//* 747 1376:invokestatic    #231 <Method ICC_Profile ICC_Profile.getInstance(byte[], int)>
	//* 748 1379:invokevirtual   #235 <Method void tagICC(ICC_Profile)>
	//* 749 1382:aload_0         
	//* 750 1383:aconst_null     
	//* 751 1384:checkcast       #213 <Class byte[][]>
	//* 752 1387:putfield        #181 <Field byte[][] icc>
	//* 753 1390:return          
	//* 754 1391:astore          7
	//* 755 1393:goto            1382
	//* 756 1396:iconst_1        
	//* 757 1397:istore          4
	//* 758 1399:iconst_0        
	//* 759 1400:istore_1        
	//* 760 1401:goto            304
	//* 761 1404:iload_1         
	//* 762 1405:iconst_1        
	//* 763 1406:iadd            
	//* 764 1407:istore_1        
	//* 765 1408:goto            304
		k = l;
	//  766 1411:iload           4
	//  767 1413:istore_3        
		if(l < 1)
	//* 768 1414:iload           4
	//* 769 1416:iconst_1        
	//* 770 1417:icmpge          727
			k = 1;
	//  771 1420:iconst_1        
	//  772 1421:istore_3        
		obj = obj1;
		if(icc != null)
			break MISSING_BLOCK_LABEL_750;
		obj = obj1;
		icc = new byte[k][];
		obj = obj1;
		icc[j - 1] = abyte1;
		  goto _L8
		if(k != 237) goto _L30; else goto _L29
_L29:
		obj = obj1;
		k1 = getShort(((InputStream) (obj1))) - 2;
		obj = obj1;
		abyte1 = new byte[k1];
		j = 0;
_L32:
		if(j >= k1)
			break; /* Loop/switch isn't completed */
		obj = obj1;
		abyte1[j] = (byte)((InputStream) (obj1)).read();
		j++;
		if(true) goto _L32; else goto _L31
_L51:
		obj = obj1;
		if(j >= k1 - PS_8BIM_RESO.length) goto _L34; else goto _L33
_L33:
		flag = true;
		k = 0;
_L56:
		obj = obj1;
		l = ((int) (flag));
		if(k >= PS_8BIM_RESO.length) goto _L36; else goto _L35
_L35:
		obj = obj1;
		if(abyte1[j + k] == PS_8BIM_RESO[k]) goto _L38; else goto _L37
_L37:
		l = 0;
		  goto _L36
_L34:
		obj = obj1;
		l = j + PS_8BIM_RESO.length;
		obj = obj1;
		if(l >= k1 - PS_8BIM_RESO.length) goto _L8; else goto _L39
_L39:
		k = ((int) ((byte)(abyte1[l] + 1)));
		j = k;
		if(k % 2 == 1)
			j = ((int) ((byte)(k + 1)));
	//* 773 1422:goto            727
	//* 774 1425:iconst_0        
	//* 775 1426:istore_2        
	//* 776 1427:goto            826
	//* 777 1430:iload           4
	//* 778 1432:ifeq            1658
	//* 779 1435:goto            886
		j = l + j;
	//  780 1438:iload           4
	//  781 1440:iload_2         
	//  782 1441:iadd            
	//  783 1442:istore_2        
		continue; /* Loop/switch isn't completed */
_L53:
		if(dpiX == 0) goto _L41; else goto _L40
_L40:
		obj = obj1;
		if(dpiX != j)
			continue; /* Loop/switch isn't completed */
		  goto _L41
_L55:
		if(dpiY == 0) goto _L43; else goto _L42
_L42:
		obj = obj1;
		if(dpiY != j) goto _L8; else goto _L43
_L43:
		obj = obj1;
		dpiY = j;
		  goto _L8
_L41:
		obj = obj1;
		dpiX = j;
		continue; /* Loop/switch isn't completed */
_L30:
		j = 0;
		obj = obj1;
		l = marker(k);
		if(l != 0) goto _L45; else goto _L44
_L44:
		obj = obj1;
		Utilities.skip(((InputStream) (obj1)), 2);
		obj = obj1;
		if(((InputStream) (obj1)).read() == 8)
			break MISSING_BLOCK_LABEL_1080;
		obj = obj1;
		throw new BadElementException(MessageLocalization.getComposedMessage("1.must.have.8.bits.per.component", new Object[] {
			s
		}));
		obj = obj1;
		scaledHeight = getShort(((InputStream) (obj1)));
		obj = obj1;
		setTop(scaledHeight);
		obj = obj1;
		scaledWidth = getShort(((InputStream) (obj1)));
		obj = obj1;
		setRight(scaledWidth);
		obj = obj1;
		colorspace = ((InputStream) (obj1)).read();
		obj = obj1;
		bpc = 8;
		if(obj1 != null)
			((InputStream) (obj1)).close();
		plainWidth = getWidth();
		plainHeight = getHeight();
		if(icc == null) goto _L47; else goto _L46
_L46:
		j = 0;
		i = 0;
_L49:
		if(i >= icc.length)
			break MISSING_BLOCK_LABEL_1307;
		if(icc[i] != null)
			break MISSING_BLOCK_LABEL_1287;
		icc = (byte[][])null;
_L47:
		return;
_L45:
		if(l != 1)
			break MISSING_BLOCK_LABEL_1258;
		obj = obj1;
		throw new BadElementException(MessageLocalization.getComposedMessage("1.unsupported.jpeg.marker.2", new Object[] {
			s, String.valueOf(k)
		}));
		i = j;
		if(l == 2) goto _L8; else goto _L48
_L48:
		obj = obj1;
		Utilities.skip(((InputStream) (obj1)), getShort(((InputStream) (obj1))) - 2);
		i = j;
		  goto _L8
		j += icc[i].length - 14;
		i++;
		  goto _L49
		abyte0 = new byte[j];
		j = 0;
		for(i = 0; i < icc.length; i++)
		{
			System.arraycopy(((Object) (icc[i])), 14, ((Object) (abyte0)), j, icc[i].length - 14);
			j += icc[i].length - 14;
		}

		try
		{
			tagICC(ICC_Profile.getInstance(abyte0, colorspace));
		}
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception) { }
		icc = (byte[][])null;
		return;
_L12:
		l = 1;
		i = 0;
		  goto _L50
_L16:
		i++;
		  goto _L50
_L31:
		j = 0;
		  goto _L51
_L36:
		if(l == 0)
			break MISSING_BLOCK_LABEL_1658;
		  goto _L34
		if((abyte1[j] << 24) + (abyte1[j + 1] << 16) + (abyte1[j + 2] << 8) + abyte1[j + 3] != 16) goto _L8; else goto _L52
	//  784 1443:aload           10
	//  785 1445:iload_2         
	//  786 1446:baload          
	//  787 1447:bipush          24
	//  788 1449:ishl            
	//  789 1450:aload           10
	//  790 1452:iload_2         
	//  791 1453:iconst_1        
	//  792 1454:iadd            
	//  793 1455:baload          
	//  794 1456:bipush          16
	//  795 1458:ishl            
	//  796 1459:iadd            
	//  797 1460:aload           10
	//  798 1462:iload_2         
	//  799 1463:iconst_2        
	//  800 1464:iadd            
	//  801 1465:baload          
	//  802 1466:bipush          8
	//  803 1468:ishl            
	//  804 1469:iadd            
	//  805 1470:aload           10
	//  806 1472:iload_2         
	//  807 1473:iconst_3        
	//  808 1474:iadd            
	//  809 1475:baload          
	//  810 1476:iadd            
	//  811 1477:bipush          16
	//  812 1479:icmpne          148
_L52:
		j += 4;
	//  813 1482:iload_2         
	//  814 1483:iconst_4        
	//  815 1484:iadd            
	//  816 1485:istore_2        
		k = (abyte1[j] << 8) + (abyte1[j + 1] & 0xff);
	//  817 1486:aload           10
	//  818 1488:iload_2         
	//  819 1489:baload          
	//  820 1490:bipush          8
	//  821 1492:ishl            
	//  822 1493:aload           10
	//  823 1495:iload_2         
	//  824 1496:iconst_1        
	//  825 1497:iadd            
	//  826 1498:baload          
	//  827 1499:sipush          255
	//  828 1502:iand            
	//  829 1503:iadd            
	//  830 1504:istore_3        
		j = j + 2 + 2;
	//  831 1505:iload_2         
	//  832 1506:iconst_2        
	//  833 1507:iadd            
	//  834 1508:iconst_2        
	//  835 1509:iadd            
	//  836 1510:istore_2        
		int j1 = (abyte1[j] << 8) + (abyte1[j + 1] & 0xff);
	//  837 1511:aload           10
	//  838 1513:iload_2         
	//  839 1514:baload          
	//  840 1515:bipush          8
	//  841 1517:ishl            
	//  842 1518:aload           10
	//  843 1520:iload_2         
	//  844 1521:iconst_1        
	//  845 1522:iadd            
	//  846 1523:baload          
	//  847 1524:sipush          255
	//  848 1527:iand            
	//  849 1528:iadd            
	//  850 1529:istore          5
		j = j + 2 + 2;
	//  851 1531:iload_2         
	//  852 1532:iconst_2        
	//  853 1533:iadd            
	//  854 1534:iconst_2        
	//  855 1535:iadd            
	//  856 1536:istore_2        
		l = (abyte1[j] << 8) + (abyte1[j + 1] & 0xff);
	//  857 1537:aload           10
	//  858 1539:iload_2         
	//  859 1540:baload          
	//  860 1541:bipush          8
	//  861 1543:ishl            
	//  862 1544:aload           10
	//  863 1546:iload_2         
	//  864 1547:iconst_1        
	//  865 1548:iadd            
	//  866 1549:baload          
	//  867 1550:sipush          255
	//  868 1553:iand            
	//  869 1554:iadd            
	//  870 1555:istore          4
		j = j + 2 + 2;
	//  871 1557:iload_2         
	//  872 1558:iconst_2        
	//  873 1559:iadd            
	//  874 1560:iconst_2        
	//  875 1561:iadd            
	//  876 1562:istore_2        
		l1 = (abyte1[j] << 8) + (abyte1[j + 1] & 0xff);
	//  877 1563:aload           10
	//  878 1565:iload_2         
	//  879 1566:baload          
	//  880 1567:bipush          8
	//  881 1569:ishl            
	//  882 1570:aload           10
	//  883 1572:iload_2         
	//  884 1573:iconst_1        
	//  885 1574:iadd            
	//  886 1575:baload          
	//  887 1576:sipush          255
	//  888 1579:iand            
	//  889 1580:iadd            
	//  890 1581:istore          6
		if(j1 != 1 && j1 != 2)
			continue; /* Loop/switch isn't completed */
	//  891 1583:iload           5
	//  892 1585:iconst_1        
	//  893 1586:icmpeq          1595
	//  894 1589:iload           5
	//  895 1591:iconst_2        
	//  896 1592:icmpne          1616
		j = k;
	//  897 1595:iload_3         
	//  898 1596:istore_2        
		if(j1 == 2)
	//* 899 1597:iload           5
	//* 900 1599:iconst_2        
	//* 901 1600:icmpne          940
			j = (int)((float)k * 2.54F + 0.5F);
	//  902 1603:iload_3         
	//  903 1604:i2f             
	//  904 1605:ldc1            #159 <Float 2.54F>
	//  905 1607:fmul            
	//  906 1608:ldc1            #160 <Float 0.5F>
	//  907 1610:fadd            
	//  908 1611:f2i             
	//  909 1612:istore_2        
		obj = obj1;
		  goto _L53
	//* 910 1613:goto            940
		if(l1 != 1 && l1 != 2) goto _L8; else goto _L54
	//  911 1616:iload           6
	//  912 1618:iconst_1        
	//  913 1619:icmpeq          1628
	//  914 1622:iload           6
	//  915 1624:iconst_2        
	//  916 1625:icmpne          148
_L54:
		j = l;
	//  917 1628:iload           4
	//  918 1630:istore_2        
		if(l1 == 2)
	//* 919 1631:iload           6
	//* 920 1633:iconst_2        
	//* 921 1634:icmpne          966
			j = (int)((float)l * 2.54F + 0.5F);
	//  922 1637:iload           4
	//  923 1639:i2f             
	//  924 1640:ldc1            #159 <Float 2.54F>
	//  925 1642:fmul            
	//  926 1643:ldc1            #160 <Float 0.5F>
	//  927 1645:fadd            
	//  928 1646:f2i             
	//  929 1647:istore_2        
		obj = obj1;
		  goto _L55
	//* 930 1648:goto            966
_L38:
		k++;
	//  931 1651:iload_3         
	//  932 1652:iconst_1        
	//  933 1653:iadd            
	//  934 1654:istore_3        
		  goto _L56
	//* 935 1655:goto            846
		j++;
	//  936 1658:iload_2         
	//  937 1659:iconst_1        
	//  938 1660:iadd            
	//  939 1661:istore_2        
		  goto _L51
	//* 940 1662:goto            826
	}

	public static final byte JFIF_ID[] = {
		74, 70, 73, 70, 0
	};
	public static final int M_APP0 = 224;
	public static final int M_APP2 = 226;
	public static final int M_APPD = 237;
	public static final int M_APPE = 238;
	public static final int NOPARAM_MARKER = 2;
	public static final int NOPARAM_MARKERS[] = {
		208, 209, 210, 211, 212, 213, 214, 215, 216, 1
	};
	public static final int NOT_A_MARKER = -1;
	public static final byte PS_8BIM_RESO[] = {
		56, 66, 73, 77, 3, -19
	};
	public static final int UNSUPPORTED_MARKER = 1;
	public static final int UNSUPPORTED_MARKERS[] = {
		195, 197, 198, 199, 200, 201, 202, 203, 205, 206, 
		207
	};
	public static final int VALID_MARKER = 0;
	public static final int VALID_MARKERS[] = {
		192, 193, 194
	};
	private byte icc[][];

	static 
	{
	//    0    0:iconst_3        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:sipush          192
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:sipush          193
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:sipush          194
	//   13   20:iastore         
	//   14   21:putstatic       #34  <Field int[] VALID_MARKERS>
	//   15   24:bipush          11
	//   16   26:newarray        int[]
	//   17   28:dup             
	//   18   29:iconst_0        
	//   19   30:sipush          195
	//   20   33:iastore         
	//   21   34:dup             
	//   22   35:iconst_1        
	//   23   36:sipush          197
	//   24   39:iastore         
	//   25   40:dup             
	//   26   41:iconst_2        
	//   27   42:sipush          198
	//   28   45:iastore         
	//   29   46:dup             
	//   30   47:iconst_3        
	//   31   48:sipush          199
	//   32   51:iastore         
	//   33   52:dup             
	//   34   53:iconst_4        
	//   35   54:sipush          200
	//   36   57:iastore         
	//   37   58:dup             
	//   38   59:iconst_5        
	//   39   60:sipush          201
	//   40   63:iastore         
	//   41   64:dup             
	//   42   65:bipush          6
	//   43   67:sipush          202
	//   44   70:iastore         
	//   45   71:dup             
	//   46   72:bipush          7
	//   47   74:sipush          203
	//   48   77:iastore         
	//   49   78:dup             
	//   50   79:bipush          8
	//   51   81:sipush          205
	//   52   84:iastore         
	//   53   85:dup             
	//   54   86:bipush          9
	//   55   88:sipush          206
	//   56   91:iastore         
	//   57   92:dup             
	//   58   93:bipush          10
	//   59   95:sipush          207
	//   60   98:iastore         
	//   61   99:putstatic       #36  <Field int[] UNSUPPORTED_MARKERS>
	//   62  102:bipush          10
	//   63  104:newarray        int[]
	//   64  106:dup             
	//   65  107:iconst_0        
	//   66  108:sipush          208
	//   67  111:iastore         
	//   68  112:dup             
	//   69  113:iconst_1        
	//   70  114:sipush          209
	//   71  117:iastore         
	//   72  118:dup             
	//   73  119:iconst_2        
	//   74  120:sipush          210
	//   75  123:iastore         
	//   76  124:dup             
	//   77  125:iconst_3        
	//   78  126:sipush          211
	//   79  129:iastore         
	//   80  130:dup             
	//   81  131:iconst_4        
	//   82  132:sipush          212
	//   83  135:iastore         
	//   84  136:dup             
	//   85  137:iconst_5        
	//   86  138:sipush          213
	//   87  141:iastore         
	//   88  142:dup             
	//   89  143:bipush          6
	//   90  145:sipush          214
	//   91  148:iastore         
	//   92  149:dup             
	//   93  150:bipush          7
	//   94  152:sipush          215
	//   95  155:iastore         
	//   96  156:dup             
	//   97  157:bipush          8
	//   98  159:sipush          216
	//   99  162:iastore         
	//  100  163:dup             
	//  101  164:bipush          9
	//  102  166:iconst_1        
	//  103  167:iastore         
	//  104  168:putstatic       #38  <Field int[] NOPARAM_MARKERS>
	//  105  171:iconst_5        
	//  106  172:newarray        byte[]
	//  107  174:dup             
	//  108  175:iconst_0        
	//  109  176:ldc1            #39  <Int 74>
	//  110  178:bastore         
	//  111  179:dup             
	//  112  180:iconst_1        
	//  113  181:ldc1            #40  <Int 70>
	//  114  183:bastore         
	//  115  184:dup             
	//  116  185:iconst_2        
	//  117  186:ldc1            #41  <Int 73>
	//  118  188:bastore         
	//  119  189:dup             
	//  120  190:iconst_3        
	//  121  191:ldc1            #40  <Int 70>
	//  122  193:bastore         
	//  123  194:dup             
	//  124  195:iconst_4        
	//  125  196:ldc1            #27  <Int 0>
	//  126  198:bastore         
	//  127  199:putstatic       #43  <Field byte[] JFIF_ID>
	//  128  202:bipush          6
	//  129  204:newarray        byte[]
	//  130  206:dup             
	//  131  207:iconst_0        
	//  132  208:ldc1            #44  <Int 56>
	//  133  210:bastore         
	//  134  211:dup             
	//  135  212:iconst_1        
	//  136  213:ldc1            #45  <Int 66>
	//  137  215:bastore         
	//  138  216:dup             
	//  139  217:iconst_2        
	//  140  218:ldc1            #41  <Int 73>
	//  141  220:bastore         
	//  142  221:dup             
	//  143  222:iconst_3        
	//  144  223:ldc1            #46  <Int 77>
	//  145  225:bastore         
	//  146  226:dup             
	//  147  227:iconst_4        
	//  148  228:ldc1            #47  <Int 3>
	//  149  230:bastore         
	//  150  231:dup             
	//  151  232:iconst_5        
	//  152  233:ldc1            #48  <Int -19>
	//  153  235:bastore         
	//  154  236:putstatic       #50  <Field byte[] PS_8BIM_RESO>
	//* 155  239:return          
	}
}
