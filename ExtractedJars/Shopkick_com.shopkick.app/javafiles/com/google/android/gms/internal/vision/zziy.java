// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzja, zzgf

abstract class zziy
{

	zziy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static void zzc(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		int i;
		int j;
		int j1;
		j1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #19  <Method int CharSequence.length()>
	//    2    6:istore          10
		j = bytebuffer.position();
	//    3    8:aload_1         
	//    4    9:invokevirtual   #24  <Method int ByteBuffer.position()>
	//    5   12:istore          6
		i = 0;
	//    6   14:iconst_0        
	//    7   15:istore          5
_L2:
		int k;
		int l;
		if(i >= j1)
			break; /* Loop/switch isn't completed */
	//    8   17:iload           5
	//    9   19:iload           10
	//   10   21:icmpge          80
		l = j;
	//   11   24:iload           6
	//   12   26:istore          8
		k = i;
	//   13   28:iload           5
	//   14   30:istore          7
		int i1 = ((int) (charsequence.charAt(i)));
	//   15   32:aload_0         
	//   16   33:iload           5
	//   17   35:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//   18   40:istore          9
		if(i1 >= '\200')
			break; /* Loop/switch isn't completed */
	//   19   42:iload           9
	//   20   44:sipush          128
	//   21   47:icmpge          80
		l = j;
	//   22   50:iload           6
	//   23   52:istore          8
		k = i;
	//   24   54:iload           5
	//   25   56:istore          7
		bytebuffer.put(j + i, (byte)i1);
	//   26   58:aload_1         
	//   27   59:iload           6
	//   28   61:iload           5
	//   29   63:iadd            
	//   30   64:iload           9
	//   31   66:int2byte        
	//   32   67:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//   33   70:pop             
		i++;
	//   34   71:iload           5
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:istore          5
		if(true) goto _L2; else goto _L1
	//   38   77:goto            17
_L1:
		if(i != j1) goto _L4; else goto _L3
	//   39   80:iload           5
	//   40   82:iload           10
	//   41   84:icmpne          662
	//*  42   87:iload           6
	//*  43   89:istore          8
	//*  44   91:iload           5
	//*  45   93:istore          7
	//*  46   95:aload_1         
	//*  47   96:iload           6
	//*  48   98:iload           5
	//*  49  100:iadd            
	//*  50  101:invokevirtual   #35  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  51  104:pop             
	//*  52  105:return          
_L24:
		if(i >= j1) goto _L6; else goto _L5
	//   53  106:iload           5
	//   54  108:iload           10
	//   55  110:icmpge          520
_L5:
		l = j;
	//   56  113:iload           6
	//   57  115:istore          8
		k = i;
	//   58  117:iload           5
	//   59  119:istore          7
		c = charsequence.charAt(i);
	//   60  121:aload_0         
	//   61  122:iload           5
	//   62  124:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//   63  129:istore_3        
		if(c >= '\200') goto _L8; else goto _L7
	//   64  130:iload_3         
	//   65  131:sipush          128
	//   66  134:icmpge          157
_L7:
		l = j;
	//   67  137:iload           6
	//   68  139:istore          8
		k = i;
	//   69  141:iload           5
	//   70  143:istore          7
		bytebuffer.put(j, (byte)c);
	//   71  145:aload_1         
	//   72  146:iload           6
	//   73  148:iload_3         
	//   74  149:int2byte        
	//   75  150:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//   76  153:pop             
		  goto _L9
	//*  77  154:goto            672
_L8:
		if(c >= '\u0800') goto _L11; else goto _L10
	//   78  157:iload_3         
	//   79  158:sipush          2048
	//   80  161:icmpge          218
_L10:
		k = j + 1;
	//   81  164:iload           6
	//   82  166:iconst_1        
	//   83  167:iadd            
	//   84  168:istore          7
		byte0 = (byte)(c >>> 6 | 0xc0);
	//   85  170:iload_3         
	//   86  171:bipush          6
	//   87  173:iushr           
	//   88  174:sipush          192
	//   89  177:ior             
	//   90  178:int2byte        
	//   91  179:istore_2        
		bytebuffer.put(j, byte0);
	//   92  180:aload_1         
	//   93  181:iload           6
	//   94  183:iload_2         
	//   95  184:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//   96  187:pop             
		bytebuffer.put(k, (byte)(c & 0x3f | 0x80));
	//   97  188:aload_1         
	//   98  189:iload           7
	//   99  191:iload_3         
	//  100  192:bipush          63
	//  101  194:iand            
	//  102  195:sipush          128
	//  103  198:ior             
	//  104  199:int2byte        
	//  105  200:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//  106  203:pop             
		j = k;
	//  107  204:iload           7
	//  108  206:istore          6
		  goto _L9
	//* 109  208:goto            672
_L20:
		j = k;
	//  110  211:iload           7
	//  111  213:istore          6
		  goto _L12
	//* 112  215:goto            536
_L11:
		if(c >= '\uD800' && '\uDFFF' >= c) goto _L14; else goto _L13
	//  113  218:iload_3         
	//  114  219:ldc1            #36  <Int 55296>
	//  115  221:icmplt          434
	//  116  224:ldc1            #37  <Int 57343>
	//  117  226:iload_3         
	//  118  227:icmpge          233
	//* 119  230:goto            434
_L14:
		k = i + 1;
	//  120  233:iload           5
	//  121  235:iconst_1        
	//  122  236:iadd            
	//  123  237:istore          7
		if(k == j1) goto _L16; else goto _L15
	//  124  239:iload           7
	//  125  241:iload           10
	//  126  243:icmpeq          414
_L15:
		c2 = charsequence.charAt(k);
	//  127  246:aload_0         
	//  128  247:iload           7
	//  129  249:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//  130  254:istore          4
		if(!Character.isSurrogatePair(c, c2)) goto _L18; else goto _L17
	//  131  256:iload_3         
	//  132  257:iload           4
	//  133  259:invokestatic    #43  <Method boolean Character.isSurrogatePair(char, char)>
	//  134  262:ifeq            400
_L17:
		l = Character.toCodePoint(c, c2);
	//  135  265:iload_3         
	//  136  266:iload           4
	//  137  268:invokestatic    #47  <Method int Character.toCodePoint(char, char)>
	//  138  271:istore          8
		i = j + 1;
	//  139  273:iload           6
	//  140  275:iconst_1        
	//  141  276:iadd            
	//  142  277:istore          5
		byte0 = (byte)(l >>> 18 | 0xf0);
	//  143  279:iload           8
	//  144  281:bipush          18
	//  145  283:iushr           
	//  146  284:sipush          240
	//  147  287:ior             
	//  148  288:int2byte        
	//  149  289:istore_2        
		bytebuffer.put(j, byte0);
	//  150  290:aload_1         
	//  151  291:iload           6
	//  152  293:iload_2         
	//  153  294:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//  154  297:pop             
		j = i + 1;
	//  155  298:iload           5
	//  156  300:iconst_1        
	//  157  301:iadd            
	//  158  302:istore          6
		byte0 = (byte)(l >>> 12 & 0x3f | 0x80);
	//  159  304:iload           8
	//  160  306:bipush          12
	//  161  308:iushr           
	//  162  309:bipush          63
	//  163  311:iand            
	//  164  312:sipush          128
	//  165  315:ior             
	//  166  316:int2byte        
	//  167  317:istore_2        
		bytebuffer.put(i, byte0);
	//  168  318:aload_1         
	//  169  319:iload           5
	//  170  321:iload_2         
	//  171  322:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//  172  325:pop             
		i = j + 1;
	//  173  326:iload           6
	//  174  328:iconst_1        
	//  175  329:iadd            
	//  176  330:istore          5
		byte0 = (byte)(l >>> 6 & 0x3f | 0x80);
	//  177  332:iload           8
	//  178  334:bipush          6
	//  179  336:iushr           
	//  180  337:bipush          63
	//  181  339:iand            
	//  182  340:sipush          128
	//  183  343:ior             
	//  184  344:int2byte        
	//  185  345:istore_2        
		bytebuffer.put(j, byte0);
	//  186  346:aload_1         
	//  187  347:iload           6
	//  188  349:iload_2         
	//  189  350:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//  190  353:pop             
		bytebuffer.put(i, (byte)(l & 0x3f | 0x80));
	//  191  354:aload_1         
	//  192  355:iload           5
	//  193  357:iload           8
	//  194  359:bipush          63
	//  195  361:iand            
	//  196  362:sipush          128
	//  197  365:ior             
	//  198  366:int2byte        
	//  199  367:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//  200  370:pop             
		j = i;
	//  201  371:iload           5
	//  202  373:istore          6
		i = k;
	//  203  375:iload           7
	//  204  377:istore          5
		  goto _L9
	//* 205  379:goto            672
_L23:
		j = i;
	//  206  382:iload           5
	//  207  384:istore          6
		  goto _L19
	//* 208  386:goto            407
_L21:
		j = i;
	//  209  389:iload           5
	//  210  391:istore          6
_L22:
		i = k;
	//  211  393:iload           7
	//  212  395:istore          5
		  goto _L12
	//* 213  397:goto            536
_L18:
		i = k;
	//  214  400:iload           7
	//  215  402:istore          5
		  goto _L16
	//* 216  404:goto            414
_L19:
		i = k;
	//  217  407:iload           7
	//  218  409:istore          5
		  goto _L12
	//* 219  411:goto            536
_L16:
		l = j;
	//  220  414:iload           6
	//  221  416:istore          8
		k = i;
	//  222  418:iload           5
	//  223  420:istore          7
		throw new zzja(i, j1);
	//  224  422:new             #49  <Class zzja>
	//  225  425:dup             
	//  226  426:iload           5
	//  227  428:iload           10
	//  228  430:invokespecial   #52  <Method void zzja(int, int)>
	//  229  433:athrow          
_L13:
		i1 = j + 1;
	//  230  434:iload           6
	//  231  436:iconst_1        
	//  232  437:iadd            
	//  233  438:istore          9
		byte byte1 = (byte)(c >>> 12 | 0xe0);
	//  234  440:iload_3         
	//  235  441:bipush          12
	//  236  443:iushr           
	//  237  444:sipush          224
	//  238  447:ior             
	//  239  448:int2byte        
	//  240  449:istore_2        
		char c1;
		IndexOutOfBoundsException indexoutofboundsexception;
		try
		{
			bytebuffer.put(j, byte1);
	//  241  450:aload_1         
	//  242  451:iload           6
	//  243  453:iload_2         
	//  244  454:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//  245  457:pop             
		}
	//* 246  458:iload           9
	//* 247  460:iconst_1        
	//* 248  461:iadd            
	//* 249  462:istore          6
	//* 250  464:iload_3         
	//* 251  465:bipush          6
	//* 252  467:iushr           
	//* 253  468:bipush          63
	//* 254  470:iand            
	//* 255  471:sipush          128
	//* 256  474:ior             
	//* 257  475:int2byte        
	//* 258  476:istore_2        
	//* 259  477:iload           6
	//* 260  479:istore          8
	//* 261  481:iload           5
	//* 262  483:istore          7
	//* 263  485:aload_1         
	//* 264  486:iload           9
	//* 265  488:iload_2         
	//* 266  489:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 267  492:pop             
	//* 268  493:iload           6
	//* 269  495:istore          8
	//* 270  497:iload           5
	//* 271  499:istore          7
	//* 272  501:aload_1         
	//* 273  502:iload           6
	//* 274  504:iload_3         
	//* 275  505:bipush          63
	//* 276  507:iand            
	//* 277  508:sipush          128
	//* 278  511:ior             
	//* 279  512:int2byte        
	//* 280  513:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 281  516:pop             
	//* 282  517:goto            672
	//* 283  520:iload           6
	//* 284  522:istore          8
	//* 285  524:iload           5
	//* 286  526:istore          7
	//* 287  528:aload_1         
	//* 288  529:iload           6
	//* 289  531:invokevirtual   #35  <Method java.nio.Buffer ByteBuffer.position(int)>
	//* 290  534:pop             
	//* 291  535:return          
	//* 292  536:aload_1         
	//* 293  537:invokevirtual   #24  <Method int ByteBuffer.position()>
	//* 294  540:istore          7
	//* 295  542:iload           5
	//* 296  544:iload           6
	//* 297  546:aload_1         
	//* 298  547:invokevirtual   #24  <Method int ByteBuffer.position()>
	//* 299  550:isub            
	//* 300  551:iconst_1        
	//* 301  552:iadd            
	//* 302  553:invokestatic    #58  <Method int Math.max(int, int)>
	//* 303  556:istore          6
	//* 304  558:aload_0         
	//* 305  559:iload           5
	//* 306  561:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//* 307  566:istore_3        
	//* 308  567:new             #60  <Class StringBuilder>
	//* 309  570:dup             
	//* 310  571:bipush          37
	//* 311  573:invokespecial   #63  <Method void StringBuilder(int)>
	//* 312  576:astore_0        
	//* 313  577:aload_0         
	//* 314  578:ldc1            #65  <String "Failed writing ">
	//* 315  580:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 316  583:pop             
	//* 317  584:aload_0         
	//* 318  585:iload_3         
	//* 319  586:invokevirtual   #72  <Method StringBuilder StringBuilder.append(char)>
	//* 320  589:pop             
	//* 321  590:aload_0         
	//* 322  591:ldc1            #74  <String " at index ">
	//* 323  593:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 324  596:pop             
	//* 325  597:aload_0         
	//* 326  598:iload           7
	//* 327  600:iload           6
	//* 328  602:iadd            
	//* 329  603:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//* 330  606:pop             
	//* 331  607:new             #79  <Class ArrayIndexOutOfBoundsException>
	//* 332  610:dup             
	//* 333  611:aload_0         
	//* 334  612:invokevirtual   #83  <Method String StringBuilder.toString()>
	//* 335  615:invokespecial   #86  <Method void ArrayIndexOutOfBoundsException(String)>
	//* 336  618:athrow          
	//* 337  619:astore          11
	//* 338  621:iload           8
	//* 339  623:istore          6
	//* 340  625:iload           7
	//* 341  627:istore          5
	//* 342  629:goto            536
	//* 343  632:astore          11
	//* 344  634:goto            211
	//* 345  637:astore          11
	//* 346  639:goto            407
	//* 347  642:astore          11
	//* 348  644:goto            389
	//* 349  647:astore          11
	//* 350  649:goto            393
	//* 351  652:astore          11
	//* 352  654:goto            382
		catch(IndexOutOfBoundsException indexoutofboundsexception1)
	//* 353  657:astore          11
		{
			break MISSING_BLOCK_LABEL_687;
	//  354  659:goto            687
		}
		j = i1 + 1;
		byte1 = (byte)(c >>> 6 & 0x3f | 0x80);
		l = j;
		k = i;
		bytebuffer.put(i1, byte1);
		l = j;
		k = i;
		bytebuffer.put(j, (byte)(c & 0x3f | 0x80));
		  goto _L9
_L6:
		l = j;
		k = i;
		bytebuffer.position(j);
		return;
_L12:
		k = bytebuffer.position();
		j = Math.max(i, (j - bytebuffer.position()) + 1);
		c1 = charsequence.charAt(i);
		charsequence = ((CharSequence) (new StringBuilder(37)));
		((StringBuilder) (charsequence)).append("Failed writing ");
		((StringBuilder) (charsequence)).append(c1);
		((StringBuilder) (charsequence)).append(" at index ");
		((StringBuilder) (charsequence)).append(k + j);
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
_L3:
		l = j;
		k = i;
		byte byte0;
		char c;
		char c2;
		try
		{
			bytebuffer.position(j + i);
			return;
		}
		// Misplaced declaration of an exception variable
		catch(IndexOutOfBoundsException indexoutofboundsexception)
		{
			j = l;
		}
		i = k;
		  goto _L12
		indexoutofboundsexception;
		  goto _L20
		indexoutofboundsexception;
		  goto _L19
		indexoutofboundsexception;
		  goto _L21
		indexoutofboundsexception;
		  goto _L22
		indexoutofboundsexception;
		  goto _L23
_L4:
		j += i;
	//  355  662:iload           6
	//  356  664:iload           5
	//  357  666:iadd            
	//  358  667:istore          6
		  goto _L24
	//* 359  669:goto            106
_L9:
		i++;
	//  360  672:iload           5
	//  361  674:iconst_1        
	//  362  675:iadd            
	//  363  676:istore          5
		j++;
	//  364  678:iload           6
	//  365  680:iconst_1        
	//  366  681:iadd            
	//  367  682:istore          6
		  goto _L24
	//* 368  684:goto            106
		j = i1;
	//  369  687:iload           9
	//  370  689:istore          6
		  goto _L12
	//* 371  691:goto            536
	}

	abstract int zzb(int i, byte abyte0[], int j, int k);

	abstract int zzb(CharSequence charsequence, byte abyte0[], int i, int j);

	abstract void zzb(CharSequence charsequence, ByteBuffer bytebuffer);

	final boolean zzg(byte abyte0[], int i, int j)
	{
		return zzb(0, abyte0, i, j) == 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokevirtual   #93  <Method int zzb(int, byte[], int, int)>
	//    6    8:ifne            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	abstract String zzi(byte abyte0[], int i, int j)
		throws zzgf;
}
