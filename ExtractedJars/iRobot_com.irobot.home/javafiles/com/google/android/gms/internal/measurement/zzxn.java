// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxp

abstract class zzxn
{

	zzxn()
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
		char c2 = charsequence.charAt(i);
	//   15   32:aload_0         
	//   16   33:iload           5
	//   17   35:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//   18   40:istore          9
		if(c2 >= '\200')
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
		bytebuffer.put(j + i, (byte)c2);
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
	//   41   84:icmpne          665
_L3:
		l = j;
	//   42   87:iload           6
	//   43   89:istore          8
		k = i;
	//   44   91:iload           5
	//   45   93:istore          7
		byte byte0;
		char c;
		char c1;
		int i1;
		int k1;
		try
		{
			bytebuffer.position(j + i);
	//   46   95:aload_1         
	//   47   96:iload           6
	//   48   98:iload           5
	//   49  100:iadd            
	//   50  101:invokevirtual   #35  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   51  104:pop             
			return;
	//   52  105:return          
		}
	//*  53  106:iload           5
	//*  54  108:iload           10
	//*  55  110:icmpge          542
	//*  56  113:iload           6
	//*  57  115:istore          8
	//*  58  117:iload           5
	//*  59  119:istore          7
	//*  60  121:aload_0         
	//*  61  122:iload           5
	//*  62  124:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//*  63  129:istore_3        
	//*  64  130:iload_3         
	//*  65  131:sipush          128
	//*  66  134:icmpge          157
	//*  67  137:iload           6
	//*  68  139:istore          8
	//*  69  141:iload           5
	//*  70  143:istore          7
	//*  71  145:aload_1         
	//*  72  146:iload           6
	//*  73  148:iload_3         
	//*  74  149:int2byte        
	//*  75  150:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//*  76  153:pop             
	//*  77  154:goto            675
	//*  78  157:iload_3         
	//*  79  158:sipush          2048
	//*  80  161:icmpge          226
	//*  81  164:iload           6
	//*  82  166:iconst_1        
	//*  83  167:iadd            
	//*  84  168:istore          8
	//*  85  170:iload_3         
	//*  86  171:bipush          6
	//*  87  173:iushr           
	//*  88  174:sipush          192
	//*  89  177:ior             
	//*  90  178:int2byte        
	//*  91  179:istore_2        
	//*  92  180:iload           8
	//*  93  182:istore          7
	//*  94  184:aload_1         
	//*  95  185:iload           6
	//*  96  187:iload_2         
	//*  97  188:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//*  98  191:pop             
	//*  99  192:iload           8
	//* 100  194:istore          7
	//* 101  196:aload_1         
	//* 102  197:iload           8
	//* 103  199:iload_3         
	//* 104  200:bipush          63
	//* 105  202:iand            
	//* 106  203:sipush          128
	//* 107  206:ior             
	//* 108  207:int2byte        
	//* 109  208:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 110  211:pop             
	//* 111  212:iload           8
	//* 112  214:istore          6
	//* 113  216:goto            675
	//* 114  219:iload           7
	//* 115  221:istore          8
	//* 116  223:goto            558
	//* 117  226:iload_3         
	//* 118  227:ldc1            #36  <Int 55296>
	//* 119  229:icmplt          452
	//* 120  232:ldc1            #37  <Int 57343>
	//* 121  234:iload_3         
	//* 122  235:icmpge          241
	//* 123  238:goto            452
	//* 124  241:iload           5
	//* 125  243:iconst_1        
	//* 126  244:iadd            
	//* 127  245:istore          7
	//* 128  247:iload           7
	//* 129  249:iload           10
	//* 130  251:icmpeq          432
	//* 131  254:iload           6
	//* 132  256:istore          5
	//* 133  258:aload_0         
	//* 134  259:iload           7
	//* 135  261:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//* 136  266:istore          4
	//* 137  268:iload           6
	//* 138  270:istore          5
	//* 139  272:iload_3         
	//* 140  273:iload           4
	//* 141  275:invokestatic    #43  <Method boolean Character.isSurrogatePair(char, char)>
	//* 142  278:ifne            288
	//* 143  281:iload           7
	//* 144  283:istore          5
	//* 145  285:goto            432
	//* 146  288:iload           6
	//* 147  290:istore          5
	//* 148  292:iload_3         
	//* 149  293:iload           4
	//* 150  295:invokestatic    #47  <Method int Character.toCodePoint(char, char)>
	//* 151  298:istore          11
	//* 152  300:iload           6
	//* 153  302:iconst_1        
	//* 154  303:iadd            
	//* 155  304:istore          8
	//* 156  306:iload           11
	//* 157  308:bipush          18
	//* 158  310:iushr           
	//* 159  311:sipush          240
	//* 160  314:ior             
	//* 161  315:int2byte        
	//* 162  316:istore_2        
	//* 163  317:iload           8
	//* 164  319:istore          5
	//* 165  321:aload_1         
	//* 166  322:iload           6
	//* 167  324:iload_2         
	//* 168  325:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 169  328:pop             
	//* 170  329:iload           8
	//* 171  331:iconst_1        
	//* 172  332:iadd            
	//* 173  333:istore          9
	//* 174  335:iload           11
	//* 175  337:bipush          12
	//* 176  339:iushr           
	//* 177  340:bipush          63
	//* 178  342:iand            
	//* 179  343:sipush          128
	//* 180  346:ior             
	//* 181  347:int2byte        
	//* 182  348:istore_2        
	//* 183  349:iload           9
	//* 184  351:istore          5
	//* 185  353:aload_1         
	//* 186  354:iload           8
	//* 187  356:iload_2         
	//* 188  357:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 189  360:pop             
	//* 190  361:iload           9
	//* 191  363:iconst_1        
	//* 192  364:iadd            
	//* 193  365:istore          6
	//* 194  367:iload           11
	//* 195  369:bipush          6
	//* 196  371:iushr           
	//* 197  372:bipush          63
	//* 198  374:iand            
	//* 199  375:sipush          128
	//* 200  378:ior             
	//* 201  379:int2byte        
	//* 202  380:istore_2        
	//* 203  381:iload           6
	//* 204  383:istore          5
	//* 205  385:aload_1         
	//* 206  386:iload           9
	//* 207  388:iload_2         
	//* 208  389:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 209  392:pop             
	//* 210  393:iload           6
	//* 211  395:istore          5
	//* 212  397:aload_1         
	//* 213  398:iload           6
	//* 214  400:iload           11
	//* 215  402:bipush          63
	//* 216  404:iand            
	//* 217  405:sipush          128
	//* 218  408:ior             
	//* 219  409:int2byte        
	//* 220  410:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 221  413:pop             
	//* 222  414:iload           7
	//* 223  416:istore          5
	//* 224  418:goto            675
	//* 225  421:iload           5
	//* 226  423:istore          8
	//* 227  425:iload           7
	//* 228  427:istore          5
	//* 229  429:goto            558
	//* 230  432:iload           6
	//* 231  434:istore          8
	//* 232  436:iload           5
	//* 233  438:istore          7
	//* 234  440:new             #49  <Class zzxp>
	//* 235  443:dup             
	//* 236  444:iload           5
	//* 237  446:iload           10
	//* 238  448:invokespecial   #52  <Method void zzxp(int, int)>
	//* 239  451:athrow          
	//* 240  452:iload           6
	//* 241  454:iconst_1        
	//* 242  455:iadd            
	//* 243  456:istore          9
	//* 244  458:iload_3         
	//* 245  459:bipush          12
	//* 246  461:iushr           
	//* 247  462:sipush          224
	//* 248  465:ior             
	//* 249  466:int2byte        
	//* 250  467:istore_2        
	//* 251  468:iload           9
	//* 252  470:istore          7
	//* 253  472:aload_1         
	//* 254  473:iload           6
	//* 255  475:iload_2         
	//* 256  476:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 257  479:pop             
	//* 258  480:iload           9
	//* 259  482:iconst_1        
	//* 260  483:iadd            
	//* 261  484:istore          6
	//* 262  486:iload_3         
	//* 263  487:bipush          6
	//* 264  489:iushr           
	//* 265  490:bipush          63
	//* 266  492:iand            
	//* 267  493:sipush          128
	//* 268  496:ior             
	//* 269  497:int2byte        
	//* 270  498:istore_2        
	//* 271  499:iload           6
	//* 272  501:istore          8
	//* 273  503:iload           5
	//* 274  505:istore          7
	//* 275  507:aload_1         
	//* 276  508:iload           9
	//* 277  510:iload_2         
	//* 278  511:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 279  514:pop             
	//* 280  515:iload           6
	//* 281  517:istore          8
	//* 282  519:iload           5
	//* 283  521:istore          7
	//* 284  523:aload_1         
	//* 285  524:iload           6
	//* 286  526:iload_3         
	//* 287  527:bipush          63
	//* 288  529:iand            
	//* 289  530:sipush          128
	//* 290  533:ior             
	//* 291  534:int2byte        
	//* 292  535:invokevirtual   #32  <Method ByteBuffer ByteBuffer.put(int, byte)>
	//* 293  538:pop             
	//* 294  539:goto            675
	//* 295  542:iload           6
	//* 296  544:istore          8
	//* 297  546:iload           5
	//* 298  548:istore          7
	//* 299  550:aload_1         
	//* 300  551:iload           6
	//* 301  553:invokevirtual   #35  <Method java.nio.Buffer ByteBuffer.position(int)>
	//* 302  556:pop             
	//* 303  557:return          
	//* 304  558:aload_1         
	//* 305  559:invokevirtual   #24  <Method int ByteBuffer.position()>
	//* 306  562:istore          6
	//* 307  564:iload           5
	//* 308  566:iload           8
	//* 309  568:aload_1         
	//* 310  569:invokevirtual   #24  <Method int ByteBuffer.position()>
	//* 311  572:isub            
	//* 312  573:iconst_1        
	//* 313  574:iadd            
	//* 314  575:invokestatic    #58  <Method int Math.max(int, int)>
	//* 315  578:istore          7
	//* 316  580:aload_0         
	//* 317  581:iload           5
	//* 318  583:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//* 319  588:istore_3        
	//* 320  589:new             #60  <Class StringBuilder>
	//* 321  592:dup             
	//* 322  593:bipush          37
	//* 323  595:invokespecial   #63  <Method void StringBuilder(int)>
	//* 324  598:astore_0        
	//* 325  599:aload_0         
	//* 326  600:ldc1            #65  <String "Failed writing ">
	//* 327  602:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 328  605:pop             
	//* 329  606:aload_0         
	//* 330  607:iload_3         
	//* 331  608:invokevirtual   #72  <Method StringBuilder StringBuilder.append(char)>
	//* 332  611:pop             
	//* 333  612:aload_0         
	//* 334  613:ldc1            #74  <String " at index ">
	//* 335  615:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 336  618:pop             
	//* 337  619:aload_0         
	//* 338  620:iload           6
	//* 339  622:iload           7
	//* 340  624:iadd            
	//* 341  625:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//* 342  628:pop             
	//* 343  629:new             #79  <Class ArrayIndexOutOfBoundsException>
	//* 344  632:dup             
	//* 345  633:aload_0         
	//* 346  634:invokevirtual   #83  <Method String StringBuilder.toString()>
	//* 347  637:invokespecial   #86  <Method void ArrayIndexOutOfBoundsException(String)>
	//* 348  640:athrow          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 349  641:astore          12
		{
			i = k;
	//  350  643:iload           7
	//  351  645:istore          5
		}
		  goto _L5
_L22:
		if(i >= j1) goto _L7; else goto _L6
_L6:
		l = j;
		k = i;
		c = charsequence.charAt(i);
		if(c >= '\200') goto _L9; else goto _L8
_L8:
		l = j;
		k = i;
		bytebuffer.put(j, (byte)c);
		  goto _L10
_L9:
		if(c >= '\u0800') goto _L12; else goto _L11
_L11:
		l = j + 1;
		byte0 = (byte)(c >>> 6 | 0xc0);
		k = l;
		bytebuffer.put(j, byte0);
		k = l;
		bytebuffer.put(l, (byte)(c & 0x3f | 0x80));
		j = l;
		  goto _L10
_L19:
		l = k;
		  goto _L5
_L12:
		if(c >= '\uD800' && '\uDFFF' >= c) goto _L14; else goto _L13
_L14:
		k = i + 1;
		if(k == j1) goto _L16; else goto _L15
_L15:
		i = j;
		c1 = charsequence.charAt(k);
		i = j;
		if(Character.isSurrogatePair(c, c1)) goto _L18; else goto _L17
_L17:
		i = k;
		  goto _L16
_L18:
		i = j;
		k1 = Character.toCodePoint(c, c1);
		l = j + 1;
		byte0 = (byte)(k1 >>> 18 | 0xf0);
		i = l;
		bytebuffer.put(j, byte0);
		i1 = l + 1;
		byte0 = (byte)(k1 >>> 12 & 0x3f | 0x80);
		i = i1;
		bytebuffer.put(l, byte0);
		j = i1 + 1;
		byte0 = (byte)(k1 >>> 6 & 0x3f | 0x80);
		i = j;
		bytebuffer.put(i1, byte0);
		i = j;
		bytebuffer.put(j, (byte)(k1 & 0x3f | 0x80));
		i = k;
		  goto _L10
_L20:
		l = i;
		i = k;
		  goto _L5
_L16:
		l = j;
		k = i;
		throw new zzxp(i, j1);
_L13:
		i1 = j + 1;
		byte0 = (byte)(c >>> 12 | 0xe0);
		k = i1;
		bytebuffer.put(j, byte0);
		j = i1 + 1;
		byte0 = (byte)(c >>> 6 & 0x3f | 0x80);
		l = j;
		k = i;
		bytebuffer.put(i1, byte0);
		l = j;
		k = i;
		bytebuffer.put(j, (byte)(c & 0x3f | 0x80));
		  goto _L10
_L7:
		l = j;
		k = i;
		bytebuffer.position(j);
		return;
_L5:
		j = bytebuffer.position();
		k = Math.max(i, (l - bytebuffer.position()) + 1);
		c = charsequence.charAt(i);
		charsequence = ((CharSequence) (new StringBuilder(37)));
		((StringBuilder) (charsequence)).append("Failed writing ");
		((StringBuilder) (charsequence)).append(c);
		((StringBuilder) (charsequence)).append(" at index ");
		((StringBuilder) (charsequence)).append(j + k);
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//* 352  647:goto            558
		IndexOutOfBoundsException indexoutofboundsexception1;
		indexoutofboundsexception1;
	//  353  650:astore          12
		  goto _L19
	//* 354  652:goto            219
		indexoutofboundsexception1;
	//  355  655:astore          12
		  goto _L20
	//* 356  657:goto            421
		indexoutofboundsexception1;
	//  357  660:astore          12
		  goto _L20
	//* 358  662:goto            421
_L4:
		j += i;
	//  359  665:iload           6
	//  360  667:iload           5
	//  361  669:iadd            
	//  362  670:istore          6
		continue; /* Loop/switch isn't completed */
	//  363  672:goto            106
_L10:
		i++;
	//  364  675:iload           5
	//  365  677:iconst_1        
	//  366  678:iadd            
	//  367  679:istore          5
		j++;
	//  368  681:iload           6
	//  369  683:iconst_1        
	//  370  684:iadd            
	//  371  685:istore          6
		if(true) goto _L22; else goto _L21
	//  372  687:goto            106
_L21:
	}

	abstract int zzb(int i, byte abyte0[], int j, int k);

	abstract int zzb(CharSequence charsequence, byte abyte0[], int i, int j);

	abstract void zzb(CharSequence charsequence, ByteBuffer bytebuffer);

	final boolean zzf(byte abyte0[], int i, int j)
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

	abstract String zzh(byte abyte0[], int i, int j);
}
