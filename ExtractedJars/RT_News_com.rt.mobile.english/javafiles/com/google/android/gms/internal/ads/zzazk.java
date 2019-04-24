// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzazk
{

	private static long zza(byte abyte0[], int i, int j)
	{
		return zzd(abyte0, i) >> j & 0x3ffffffL;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #10  <Method long zzd(byte[], int)>
	//    3    5:iload_2         
	//    4    6:lshr            
	//    5    7:ldc2w           #11  <Long 0x3ffffffL>
	//    6   10:land            
	//    7   11:lreturn         
	}

	private static void zza(byte abyte0[], long l, int i)
	{
		for(int j = 0; j < 4;)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iconst_4        
	//*   4    6:icmpge          36
		{
			abyte0[i + j] = (byte)(int)(l & 255L);
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iadd            
	//    9   14:lload_1         
	//   10   15:ldc2w           #15  <Long 255L>
	//   11   18:land            
	//   12   19:l2i             
	//   13   20:int2byte        
	//   14   21:bastore         
			j++;
	//   15   22:iload           4
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore          4
			l >>= 8;
	//   19   28:lload_1         
	//   20   29:bipush          8
	//   21   31:lshr            
	//   22   32:lstore_1        
		}

	//*  23   33:goto            3
	//   24   36:return          
	}

	private static long zzd(byte abyte0[], int i)
	{
		byte byte0 = abyte0[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:istore_2        
		byte byte1 = abyte0[i + 1];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:iconst_1        
	//    7    7:iadd            
	//    8    8:baload          
	//    9    9:istore_3        
		byte byte2 = abyte0[i + 2];
	//   10   10:aload_0         
	//   11   11:iload_1         
	//   12   12:iconst_2        
	//   13   13:iadd            
	//   14   14:baload          
	//   15   15:istore          4
		return (long)((abyte0[i + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16)) & 0xffffffffL;
	//   16   17:aload_0         
	//   17   18:iload_1         
	//   18   19:iconst_3        
	//   19   20:iadd            
	//   20   21:baload          
	//   21   22:sipush          255
	//   22   25:iand            
	//   23   26:bipush          24
	//   24   28:ishl            
	//   25   29:iload_2         
	//   26   30:sipush          255
	//   27   33:iand            
	//   28   34:iload_3         
	//   29   35:sipush          255
	//   30   38:iand            
	//   31   39:bipush          8
	//   32   41:ishl            
	//   33   42:ior             
	//   34   43:iload           4
	//   35   45:sipush          255
	//   36   48:iand            
	//   37   49:bipush          16
	//   38   51:ishl            
	//   39   52:ior             
	//   40   53:ior             
	//   41   54:i2l             
	//   42   55:ldc2w           #17  <Long 0xffffffffL>
	//   43   58:land            
	//   44   59:lreturn         
	}

	static byte[] zze(byte abyte0[], byte abyte1[])
	{
		if(abyte0.length != 32)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:bipush          32
	//*   3    4:icmpeq          17
			throw new IllegalArgumentException("The key length in bytes must be 32.");
	//    4    7:new             #22  <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc1            #24  <String "The key length in bytes must be 32.">
	//    7   13:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		long l6 = zza(abyte0, 0, 0) & 0x3ffffffL;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:invokestatic    #30  <Method long zza(byte[], int, int)>
	//   13   23:ldc2w           #11  <Long 0x3ffffffL>
	//   14   26:land            
	//   15   27:lstore          16
		long l7 = zza(abyte0, 3, 2) & 0x3ffff03L;
	//   16   29:aload_0         
	//   17   30:iconst_3        
	//   18   31:iconst_2        
	//   19   32:invokestatic    #30  <Method long zza(byte[], int, int)>
	//   20   35:ldc2w           #31  <Long 0x3ffff03L>
	//   21   38:land            
	//   22   39:lstore          18
		long l8 = zza(abyte0, 6, 4) & 0x3ffc0ffL;
	//   23   41:aload_0         
	//   24   42:bipush          6
	//   25   44:iconst_4        
	//   26   45:invokestatic    #30  <Method long zza(byte[], int, int)>
	//   27   48:ldc2w           #33  <Long 0x3ffc0ffL>
	//   28   51:land            
	//   29   52:lstore          20
		long l9 = zza(abyte0, 9, 6) & 0x3f03fffL;
	//   30   54:aload_0         
	//   31   55:bipush          9
	//   32   57:bipush          6
	//   33   59:invokestatic    #30  <Method long zza(byte[], int, int)>
	//   34   62:ldc2w           #35  <Long 0x3f03fffL>
	//   35   65:land            
	//   36   66:lstore          22
		long l10 = zza(abyte0, 12, 8) & 0xfffffL;
	//   37   68:aload_0         
	//   38   69:bipush          12
	//   39   71:bipush          8
	//   40   73:invokestatic    #30  <Method long zza(byte[], int, int)>
	//   41   76:ldc2w           #37  <Long 0xfffffL>
	//   42   79:land            
	//   43   80:lstore          24
		long l11 = l8 * 5L;
	//   44   82:lload           20
	//   45   84:ldc2w           #39  <Long 5L>
	//   46   87:lmul            
	//   47   88:lstore          26
		long l12 = l9 * 5L;
	//   48   90:lload           22
	//   49   92:ldc2w           #39  <Long 5L>
	//   50   95:lmul            
	//   51   96:lstore          28
		long l13 = l10 * 5L;
	//   52   98:lload           24
	//   53  100:ldc2w           #39  <Long 5L>
	//   54  103:lmul            
	//   55  104:lstore          30
		byte abyte2[] = new byte[17];
	//   56  106:bipush          17
	//   57  108:newarray        byte[]
	//   58  110:astore          38
		long l5 = 0L;
	//   59  112:lconst_0        
	//   60  113:lstore          14
		int i = 0;
	//   61  115:iconst_0        
	//   62  116:istore_2        
		long l4 = 0L;
	//   63  117:lconst_0        
	//   64  118:lstore          12
		long l = l4;
	//   65  120:lload           12
	//   66  122:lstore          4
		long l1 = l;
	//   67  124:lload           4
	//   68  126:lstore          6
		long l2 = l1;
	//   69  128:lload           6
	//   70  130:lstore          8
		long l3 = l;
	//   71  132:lload           4
	//   72  134:lstore          10
		l = l5;
	//   73  136:lload           14
	//   74  138:lstore          4
		while(i < abyte1.length) 
	//*  75  140:iload_2         
	//*  76  141:aload_1         
	//*  77  142:arraylength     
	//*  78  143:icmpge          517
		{
			int j = Math.min(16, abyte1.length - i);
	//   79  146:bipush          16
	//   80  148:aload_1         
	//   81  149:arraylength     
	//   82  150:iload_2         
	//   83  151:isub            
	//   84  152:invokestatic    #46  <Method int Math.min(int, int)>
	//   85  155:istore_3        
			System.arraycopy(((Object) (abyte1)), i, ((Object) (abyte2)), 0, j);
	//   86  156:aload_1         
	//   87  157:iload_2         
	//   88  158:aload           38
	//   89  160:iconst_0        
	//   90  161:iload_3         
	//   91  162:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
			abyte2[j] = 1;
	//   92  165:aload           38
	//   93  167:iload_3         
	//   94  168:iconst_1        
	//   95  169:bastore         
			if(j != 16)
	//*  96  170:iload_3         
	//*  97  171:bipush          16
	//*  98  173:icmpeq          187
				Arrays.fill(abyte2, j + 1, 17, (byte)0);
	//   99  176:aload           38
	//  100  178:iload_3         
	//  101  179:iconst_1        
	//  102  180:iadd            
	//  103  181:bipush          17
	//  104  183:iconst_0        
	//  105  184:invokestatic    #58  <Method void Arrays.fill(byte[], int, int, byte)>
			l2 += zza(abyte2, 0, 0);
	//  106  187:lload           8
	//  107  189:aload           38
	//  108  191:iconst_0        
	//  109  192:iconst_0        
	//  110  193:invokestatic    #30  <Method long zza(byte[], int, int)>
	//  111  196:ladd            
	//  112  197:lstore          8
			l5 = l + zza(abyte2, 3, 2);
	//  113  199:lload           4
	//  114  201:aload           38
	//  115  203:iconst_3        
	//  116  204:iconst_2        
	//  117  205:invokestatic    #30  <Method long zza(byte[], int, int)>
	//  118  208:ladd            
	//  119  209:lstore          14
			long l14 = l4 + zza(abyte2, 6, 4);
	//  120  211:lload           12
	//  121  213:aload           38
	//  122  215:bipush          6
	//  123  217:iconst_4        
	//  124  218:invokestatic    #30  <Method long zza(byte[], int, int)>
	//  125  221:ladd            
	//  126  222:lstore          32
			long l15 = l3 + zza(abyte2, 9, 6);
	//  127  224:lload           10
	//  128  226:aload           38
	//  129  228:bipush          9
	//  130  230:bipush          6
	//  131  232:invokestatic    #30  <Method long zza(byte[], int, int)>
	//  132  235:ladd            
	//  133  236:lstore          34
			long l16 = l1 + (zza(abyte2, 12, 8) | (long)(abyte2[16] << 24));
	//  134  238:lload           6
	//  135  240:aload           38
	//  136  242:bipush          12
	//  137  244:bipush          8
	//  138  246:invokestatic    #30  <Method long zza(byte[], int, int)>
	//  139  249:aload           38
	//  140  251:bipush          16
	//  141  253:baload          
	//  142  254:bipush          24
	//  143  256:ishl            
	//  144  257:i2l             
	//  145  258:lor             
	//  146  259:ladd            
	//  147  260:lstore          36
			l1 = l2 * l6 + l5 * l13 + l14 * l12 + l15 * l11 + l16 * (l7 * 5L);
	//  148  262:lload           8
	//  149  264:lload           16
	//  150  266:lmul            
	//  151  267:lload           14
	//  152  269:lload           30
	//  153  271:lmul            
	//  154  272:ladd            
	//  155  273:lload           32
	//  156  275:lload           28
	//  157  277:lmul            
	//  158  278:ladd            
	//  159  279:lload           34
	//  160  281:lload           26
	//  161  283:lmul            
	//  162  284:ladd            
	//  163  285:lload           36
	//  164  287:lload           18
	//  165  289:ldc2w           #39  <Long 5L>
	//  166  292:lmul            
	//  167  293:lmul            
	//  168  294:ladd            
	//  169  295:lstore          6
			l = l2 * l7 + l5 * l6 + l14 * l13 + l15 * l12 + l16 * l11 + (l1 >> 26);
	//  170  297:lload           8
	//  171  299:lload           18
	//  172  301:lmul            
	//  173  302:lload           14
	//  174  304:lload           16
	//  175  306:lmul            
	//  176  307:ladd            
	//  177  308:lload           32
	//  178  310:lload           30
	//  179  312:lmul            
	//  180  313:ladd            
	//  181  314:lload           34
	//  182  316:lload           28
	//  183  318:lmul            
	//  184  319:ladd            
	//  185  320:lload           36
	//  186  322:lload           26
	//  187  324:lmul            
	//  188  325:ladd            
	//  189  326:lload           6
	//  190  328:bipush          26
	//  191  330:lshr            
	//  192  331:ladd            
	//  193  332:lstore          4
			l4 = l2 * l8 + l5 * l7 + l14 * l6 + l15 * l13 + l16 * l12 + (l >> 26);
	//  194  334:lload           8
	//  195  336:lload           20
	//  196  338:lmul            
	//  197  339:lload           14
	//  198  341:lload           18
	//  199  343:lmul            
	//  200  344:ladd            
	//  201  345:lload           32
	//  202  347:lload           16
	//  203  349:lmul            
	//  204  350:ladd            
	//  205  351:lload           34
	//  206  353:lload           30
	//  207  355:lmul            
	//  208  356:ladd            
	//  209  357:lload           36
	//  210  359:lload           28
	//  211  361:lmul            
	//  212  362:ladd            
	//  213  363:lload           4
	//  214  365:bipush          26
	//  215  367:lshr            
	//  216  368:ladd            
	//  217  369:lstore          12
			l3 = l2 * l9 + l5 * l8 + l14 * l7 + l15 * l6 + l16 * l13 + (l4 >> 26);
	//  218  371:lload           8
	//  219  373:lload           22
	//  220  375:lmul            
	//  221  376:lload           14
	//  222  378:lload           20
	//  223  380:lmul            
	//  224  381:ladd            
	//  225  382:lload           32
	//  226  384:lload           18
	//  227  386:lmul            
	//  228  387:ladd            
	//  229  388:lload           34
	//  230  390:lload           16
	//  231  392:lmul            
	//  232  393:ladd            
	//  233  394:lload           36
	//  234  396:lload           30
	//  235  398:lmul            
	//  236  399:ladd            
	//  237  400:lload           12
	//  238  402:bipush          26
	//  239  404:lshr            
	//  240  405:ladd            
	//  241  406:lstore          10
			l2 = l2 * l10 + l5 * l9 + l14 * l8 + l15 * l7 + l16 * l6 + (l3 >> 26);
	//  242  408:lload           8
	//  243  410:lload           24
	//  244  412:lmul            
	//  245  413:lload           14
	//  246  415:lload           22
	//  247  417:lmul            
	//  248  418:ladd            
	//  249  419:lload           32
	//  250  421:lload           20
	//  251  423:lmul            
	//  252  424:ladd            
	//  253  425:lload           34
	//  254  427:lload           18
	//  255  429:lmul            
	//  256  430:ladd            
	//  257  431:lload           36
	//  258  433:lload           16
	//  259  435:lmul            
	//  260  436:ladd            
	//  261  437:lload           10
	//  262  439:bipush          26
	//  263  441:lshr            
	//  264  442:ladd            
	//  265  443:lstore          8
			l5 = (l1 & 0x3ffffffL) + (l2 >> 26) * 5L;
	//  266  445:lload           6
	//  267  447:ldc2w           #11  <Long 0x3ffffffL>
	//  268  450:land            
	//  269  451:lload           8
	//  270  453:bipush          26
	//  271  455:lshr            
	//  272  456:ldc2w           #39  <Long 5L>
	//  273  459:lmul            
	//  274  460:ladd            
	//  275  461:lstore          14
			i += 16;
	//  276  463:iload_2         
	//  277  464:bipush          16
	//  278  466:iadd            
	//  279  467:istore_2        
			l1 = l2 & 0x3ffffffL;
	//  280  468:lload           8
	//  281  470:ldc2w           #11  <Long 0x3ffffffL>
	//  282  473:land            
	//  283  474:lstore          6
			l4 &= 0x3ffffffL;
	//  284  476:lload           12
	//  285  478:ldc2w           #11  <Long 0x3ffffffL>
	//  286  481:land            
	//  287  482:lstore          12
			l2 = l5 & 0x3ffffffL;
	//  288  484:lload           14
	//  289  486:ldc2w           #11  <Long 0x3ffffffL>
	//  290  489:land            
	//  291  490:lstore          8
			l = (l & 0x3ffffffL) + (l5 >> 26);
	//  292  492:lload           4
	//  293  494:ldc2w           #11  <Long 0x3ffffffL>
	//  294  497:land            
	//  295  498:lload           14
	//  296  500:bipush          26
	//  297  502:lshr            
	//  298  503:ladd            
	//  299  504:lstore          4
			l3 &= 0x3ffffffL;
	//  300  506:lload           10
	//  301  508:ldc2w           #11  <Long 0x3ffffffL>
	//  302  511:land            
	//  303  512:lstore          10
		}
	//* 304  514:goto            140
		l5 = l4 + (l >> 26);
	//  305  517:lload           12
	//  306  519:lload           4
	//  307  521:bipush          26
	//  308  523:lshr            
	//  309  524:ladd            
	//  310  525:lstore          14
		l4 = l5 & 0x3ffffffL;
	//  311  527:lload           14
	//  312  529:ldc2w           #11  <Long 0x3ffffffL>
	//  313  532:land            
	//  314  533:lstore          12
		l5 = l3 + (l5 >> 26);
	//  315  535:lload           10
	//  316  537:lload           14
	//  317  539:bipush          26
	//  318  541:lshr            
	//  319  542:ladd            
	//  320  543:lstore          14
		l3 = l5 & 0x3ffffffL;
	//  321  545:lload           14
	//  322  547:ldc2w           #11  <Long 0x3ffffffL>
	//  323  550:land            
	//  324  551:lstore          10
		l5 = l1 + (l5 >> 26);
	//  325  553:lload           6
	//  326  555:lload           14
	//  327  557:bipush          26
	//  328  559:lshr            
	//  329  560:ladd            
	//  330  561:lstore          14
		l1 = l5 & 0x3ffffffL;
	//  331  563:lload           14
	//  332  565:ldc2w           #11  <Long 0x3ffffffL>
	//  333  568:land            
	//  334  569:lstore          6
		l2 += (l5 >> 26) * 5L;
	//  335  571:lload           8
	//  336  573:lload           14
	//  337  575:bipush          26
	//  338  577:lshr            
	//  339  578:ldc2w           #39  <Long 5L>
	//  340  581:lmul            
	//  341  582:ladd            
	//  342  583:lstore          8
		l6 = l2 & 0x3ffffffL;
	//  343  585:lload           8
	//  344  587:ldc2w           #11  <Long 0x3ffffffL>
	//  345  590:land            
	//  346  591:lstore          16
		l9 = (l & 0x3ffffffL) + (l2 >> 26);
	//  347  593:lload           4
	//  348  595:ldc2w           #11  <Long 0x3ffffffL>
	//  349  598:land            
	//  350  599:lload           8
	//  351  601:bipush          26
	//  352  603:lshr            
	//  353  604:ladd            
	//  354  605:lstore          22
		l7 = l6 + 5L;
	//  355  607:lload           16
	//  356  609:ldc2w           #39  <Long 5L>
	//  357  612:ladd            
	//  358  613:lstore          18
		l11 = l9 + (l7 >> 26);
	//  359  615:lload           22
	//  360  617:lload           18
	//  361  619:bipush          26
	//  362  621:lshr            
	//  363  622:ladd            
	//  364  623:lstore          26
		l10 = l4 + (l11 >> 26);
	//  365  625:lload           12
	//  366  627:lload           26
	//  367  629:bipush          26
	//  368  631:lshr            
	//  369  632:ladd            
	//  370  633:lstore          24
		l8 = l3 + (l10 >> 26);
	//  371  635:lload           10
	//  372  637:lload           24
	//  373  639:bipush          26
	//  374  641:lshr            
	//  375  642:ladd            
	//  376  643:lstore          20
		l = (l1 + (l8 >> 26)) - 0x4000000L;
	//  377  645:lload           6
	//  378  647:lload           20
	//  379  649:bipush          26
	//  380  651:lshr            
	//  381  652:ladd            
	//  382  653:ldc2w           #59  <Long 0x4000000L>
	//  383  656:lsub            
	//  384  657:lstore          4
		l2 = l >> 63;
	//  385  659:lload           4
	//  386  661:bipush          63
	//  387  663:lshr            
	//  388  664:lstore          8
		l5 = ~l2;
	//  389  666:lload           8
	//  390  668:ldc2w           #61  <Long -1L>
	//  391  671:lxor            
	//  392  672:lstore          14
		l9 = l9 & l2 | l11 & 0x3ffffffL & l5;
	//  393  674:lload           22
	//  394  676:lload           8
	//  395  678:land            
	//  396  679:lload           26
	//  397  681:ldc2w           #11  <Long 0x3ffffffL>
	//  398  684:land            
	//  399  685:lload           14
	//  400  687:land            
	//  401  688:lor             
	//  402  689:lstore          22
		l4 = l4 & l2 | l10 & 0x3ffffffL & l5;
	//  403  691:lload           12
	//  404  693:lload           8
	//  405  695:land            
	//  406  696:lload           24
	//  407  698:ldc2w           #11  <Long 0x3ffffffL>
	//  408  701:land            
	//  409  702:lload           14
	//  410  704:land            
	//  411  705:lor             
	//  412  706:lstore          12
		l3 = l3 & l2 | l8 & 0x3ffffffL & l5;
	//  413  708:lload           10
	//  414  710:lload           8
	//  415  712:land            
	//  416  713:lload           20
	//  417  715:ldc2w           #11  <Long 0x3ffffffL>
	//  418  718:land            
	//  419  719:lload           14
	//  420  721:land            
	//  421  722:lor             
	//  422  723:lstore          10
		l6 = ((l6 & l2 | l7 & 0x3ffffffL & l5 | l9 << 26) & 0xffffffffL) + zzd(abyte0, 16);
	//  423  725:lload           16
	//  424  727:lload           8
	//  425  729:land            
	//  426  730:lload           18
	//  427  732:ldc2w           #11  <Long 0x3ffffffL>
	//  428  735:land            
	//  429  736:lload           14
	//  430  738:land            
	//  431  739:lor             
	//  432  740:lload           22
	//  433  742:bipush          26
	//  434  744:lshl            
	//  435  745:lor             
	//  436  746:ldc2w           #17  <Long 0xffffffffL>
	//  437  749:land            
	//  438  750:aload_0         
	//  439  751:bipush          16
	//  440  753:invokestatic    #10  <Method long zzd(byte[], int)>
	//  441  756:ladd            
	//  442  757:lstore          16
		l7 = ((l9 >> 6 | l4 << 20) & 0xffffffffL) + zzd(abyte0, 20) + (l6 >> 32);
	//  443  759:lload           22
	//  444  761:bipush          6
	//  445  763:lshr            
	//  446  764:lload           12
	//  447  766:bipush          20
	//  448  768:lshl            
	//  449  769:lor             
	//  450  770:ldc2w           #17  <Long 0xffffffffL>
	//  451  773:land            
	//  452  774:aload_0         
	//  453  775:bipush          20
	//  454  777:invokestatic    #10  <Method long zzd(byte[], int)>
	//  455  780:ladd            
	//  456  781:lload           16
	//  457  783:bipush          32
	//  458  785:lshr            
	//  459  786:ladd            
	//  460  787:lstore          18
		l4 = ((l4 >> 12 | l3 << 14) & 0xffffffffL) + zzd(abyte0, 24) + (l7 >> 32);
	//  461  789:lload           12
	//  462  791:bipush          12
	//  463  793:lshr            
	//  464  794:lload           10
	//  465  796:bipush          14
	//  466  798:lshl            
	//  467  799:lor             
	//  468  800:ldc2w           #17  <Long 0xffffffffL>
	//  469  803:land            
	//  470  804:aload_0         
	//  471  805:bipush          24
	//  472  807:invokestatic    #10  <Method long zzd(byte[], int)>
	//  473  810:ladd            
	//  474  811:lload           18
	//  475  813:bipush          32
	//  476  815:lshr            
	//  477  816:ladd            
	//  478  817:lstore          12
		l8 = zzd(abyte0, 28);
	//  479  819:aload_0         
	//  480  820:bipush          28
	//  481  822:invokestatic    #10  <Method long zzd(byte[], int)>
	//  482  825:lstore          20
		abyte0 = new byte[16];
	//  483  827:bipush          16
	//  484  829:newarray        byte[]
	//  485  831:astore_0        
		zza(abyte0, l6 & 0xffffffffL, 0);
	//  486  832:aload_0         
	//  487  833:lload           16
	//  488  835:ldc2w           #17  <Long 0xffffffffL>
	//  489  838:land            
	//  490  839:iconst_0        
	//  491  840:invokestatic    #64  <Method void zza(byte[], long, int)>
		zza(abyte0, l7 & 0xffffffffL, 4);
	//  492  843:aload_0         
	//  493  844:lload           18
	//  494  846:ldc2w           #17  <Long 0xffffffffL>
	//  495  849:land            
	//  496  850:iconst_4        
	//  497  851:invokestatic    #64  <Method void zza(byte[], long, int)>
		zza(abyte0, l4 & 0xffffffffL, 8);
	//  498  854:aload_0         
	//  499  855:lload           12
	//  500  857:ldc2w           #17  <Long 0xffffffffL>
	//  501  860:land            
	//  502  861:bipush          8
	//  503  863:invokestatic    #64  <Method void zza(byte[], long, int)>
		zza(abyte0, ((l3 >> 18 | (l1 & l2 | l & l5) << 8) & 0xffffffffL) + l8 + (l4 >> 32) & 0xffffffffL, 12);
	//  504  866:aload_0         
	//  505  867:lload           10
	//  506  869:bipush          18
	//  507  871:lshr            
	//  508  872:lload           6
	//  509  874:lload           8
	//  510  876:land            
	//  511  877:lload           4
	//  512  879:lload           14
	//  513  881:land            
	//  514  882:lor             
	//  515  883:bipush          8
	//  516  885:lshl            
	//  517  886:lor             
	//  518  887:ldc2w           #17  <Long 0xffffffffL>
	//  519  890:land            
	//  520  891:lload           20
	//  521  893:ladd            
	//  522  894:lload           12
	//  523  896:bipush          32
	//  524  898:lshr            
	//  525  899:ladd            
	//  526  900:ldc2w           #17  <Long 0xffffffffL>
	//  527  903:land            
	//  528  904:bipush          12
	//  529  906:invokestatic    #64  <Method void zza(byte[], long, int)>
		return abyte0;
	//  530  909:aload_0         
	//  531  910:areturn         
	}
}
