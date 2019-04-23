// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class apr
{

	private static long a(byte abyte0[], int i)
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
	//   42   55:ldc2w           #7   <Long 0xffffffffL>
	//   43   58:land            
	//   44   59:lreturn         
	}

	private static long a(byte abyte0[], int i, int j)
	{
		return a(abyte0, i) >> j & 0x3ffffffL;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #12  <Method long a(byte[], int)>
	//    3    5:iload_2         
	//    4    6:lshr            
	//    5    7:ldc2w           #13  <Long 0x3ffffffL>
	//    6   10:land            
	//    7   11:lreturn         
	}

	private static void a(byte abyte0[], long l, int i)
	{
		for(int j = 0; j < 4;)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iconst_4        
	//*   4    6:icmpge          36
		{
			abyte0[i + j] = (byte)(int)(255L & l);
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iadd            
	//    9   14:ldc2w           #16  <Long 255L>
	//   10   17:lload_1         
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

	static byte[] a(byte abyte0[], byte abyte1[])
	{
		if(abyte0.length == 32)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:bipush          32
	//*   3    4:icmpne          901
		{
			long l6 = a(abyte0, 0, 0) & 0x3ffffffL;
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:iconst_0        
	//    7   10:invokestatic    #20  <Method long a(byte[], int, int)>
	//    8   13:ldc2w           #13  <Long 0x3ffffffL>
	//    9   16:land            
	//   10   17:lstore          16
			long l7 = a(abyte0, 3, 2) & 0x3ffff03L;
	//   11   19:aload_0         
	//   12   20:iconst_3        
	//   13   21:iconst_2        
	//   14   22:invokestatic    #20  <Method long a(byte[], int, int)>
	//   15   25:ldc2w           #21  <Long 0x3ffff03L>
	//   16   28:land            
	//   17   29:lstore          18
			long l8 = a(abyte0, 6, 4) & 0x3ffc0ffL;
	//   18   31:aload_0         
	//   19   32:bipush          6
	//   20   34:iconst_4        
	//   21   35:invokestatic    #20  <Method long a(byte[], int, int)>
	//   22   38:ldc2w           #23  <Long 0x3ffc0ffL>
	//   23   41:land            
	//   24   42:lstore          20
			long l9 = a(abyte0, 9, 6) & 0x3f03fffL;
	//   25   44:aload_0         
	//   26   45:bipush          9
	//   27   47:bipush          6
	//   28   49:invokestatic    #20  <Method long a(byte[], int, int)>
	//   29   52:ldc2w           #25  <Long 0x3f03fffL>
	//   30   55:land            
	//   31   56:lstore          22
			long l10 = a(abyte0, 12, 8) & 0xfffffL;
	//   32   58:aload_0         
	//   33   59:bipush          12
	//   34   61:bipush          8
	//   35   63:invokestatic    #20  <Method long a(byte[], int, int)>
	//   36   66:ldc2w           #27  <Long 0xfffffL>
	//   37   69:land            
	//   38   70:lstore          24
			long l11 = l8 * 5L;
	//   39   72:lload           20
	//   40   74:ldc2w           #29  <Long 5L>
	//   41   77:lmul            
	//   42   78:lstore          26
			long l12 = l9 * 5L;
	//   43   80:lload           22
	//   44   82:ldc2w           #29  <Long 5L>
	//   45   85:lmul            
	//   46   86:lstore          28
			long l13 = l10 * 5L;
	//   47   88:lload           24
	//   48   90:ldc2w           #29  <Long 5L>
	//   49   93:lmul            
	//   50   94:lstore          30
			byte abyte2[] = new byte[17];
	//   51   96:bipush          17
	//   52   98:newarray        byte[]
	//   53  100:astore          38
			long l5 = 0L;
	//   54  102:lconst_0        
	//   55  103:lstore          14
			long l4 = 0L;
	//   56  105:lconst_0        
	//   57  106:lstore          12
			long l = l4;
	//   58  108:lload           12
	//   59  110:lstore          4
			long l1 = l;
	//   60  112:lload           4
	//   61  114:lstore          6
			long l2 = l1;
	//   62  116:lload           6
	//   63  118:lstore          8
			int i = 0;
	//   64  120:iconst_0        
	//   65  121:istore_2        
			long l3 = l;
	//   66  122:lload           4
	//   67  124:lstore          10
			l = l5;
	//   68  126:lload           14
	//   69  128:lstore          4
			while(i < abyte1.length) 
	//*  70  130:iload_2         
	//*  71  131:aload_1         
	//*  72  132:arraylength     
	//*  73  133:icmpge          507
			{
				int j = Math.min(16, abyte1.length - i);
	//   74  136:bipush          16
	//   75  138:aload_1         
	//   76  139:arraylength     
	//   77  140:iload_2         
	//   78  141:isub            
	//   79  142:invokestatic    #36  <Method int Math.min(int, int)>
	//   80  145:istore_3        
				System.arraycopy(((Object) (abyte1)), i, ((Object) (abyte2)), 0, j);
	//   81  146:aload_1         
	//   82  147:iload_2         
	//   83  148:aload           38
	//   84  150:iconst_0        
	//   85  151:iload_3         
	//   86  152:invokestatic    #42  <Method void System.arraycopy(Object, int, Object, int, int)>
				abyte2[j] = 1;
	//   87  155:aload           38
	//   88  157:iload_3         
	//   89  158:iconst_1        
	//   90  159:bastore         
				if(j != 16)
	//*  91  160:iload_3         
	//*  92  161:bipush          16
	//*  93  163:icmpeq          177
					Arrays.fill(abyte2, j + 1, 17, (byte)0);
	//   94  166:aload           38
	//   95  168:iload_3         
	//   96  169:iconst_1        
	//   97  170:iadd            
	//   98  171:bipush          17
	//   99  173:iconst_0        
	//  100  174:invokestatic    #48  <Method void Arrays.fill(byte[], int, int, byte)>
				l2 += a(abyte2, 0, 0);
	//  101  177:lload           8
	//  102  179:aload           38
	//  103  181:iconst_0        
	//  104  182:iconst_0        
	//  105  183:invokestatic    #20  <Method long a(byte[], int, int)>
	//  106  186:ladd            
	//  107  187:lstore          8
				l += a(abyte2, 3, 2);
	//  108  189:lload           4
	//  109  191:aload           38
	//  110  193:iconst_3        
	//  111  194:iconst_2        
	//  112  195:invokestatic    #20  <Method long a(byte[], int, int)>
	//  113  198:ladd            
	//  114  199:lstore          4
				l4 += a(abyte2, 6, 4);
	//  115  201:lload           12
	//  116  203:aload           38
	//  117  205:bipush          6
	//  118  207:iconst_4        
	//  119  208:invokestatic    #20  <Method long a(byte[], int, int)>
	//  120  211:ladd            
	//  121  212:lstore          12
				long l14 = l3 + a(abyte2, 9, 6);
	//  122  214:lload           10
	//  123  216:aload           38
	//  124  218:bipush          9
	//  125  220:bipush          6
	//  126  222:invokestatic    #20  <Method long a(byte[], int, int)>
	//  127  225:ladd            
	//  128  226:lstore          32
				long l16 = l1 + (a(abyte2, 12, 8) | (long)(abyte2[16] << 24));
	//  129  228:lload           6
	//  130  230:aload           38
	//  131  232:bipush          12
	//  132  234:bipush          8
	//  133  236:invokestatic    #20  <Method long a(byte[], int, int)>
	//  134  239:aload           38
	//  135  241:bipush          16
	//  136  243:baload          
	//  137  244:bipush          24
	//  138  246:ishl            
	//  139  247:i2l             
	//  140  248:lor             
	//  141  249:ladd            
	//  142  250:lstore          36
				long l15 = l2 * l6 + l * l13 + l4 * l12 + l14 * l11 + l16 * (l7 * 5L);
	//  143  252:lload           8
	//  144  254:lload           16
	//  145  256:lmul            
	//  146  257:lload           4
	//  147  259:lload           30
	//  148  261:lmul            
	//  149  262:ladd            
	//  150  263:lload           12
	//  151  265:lload           28
	//  152  267:lmul            
	//  153  268:ladd            
	//  154  269:lload           32
	//  155  271:lload           26
	//  156  273:lmul            
	//  157  274:ladd            
	//  158  275:lload           36
	//  159  277:lload           18
	//  160  279:ldc2w           #29  <Long 5L>
	//  161  282:lmul            
	//  162  283:lmul            
	//  163  284:ladd            
	//  164  285:lstore          34
				l5 = l2 * l7 + l * l6 + l4 * l13 + l14 * l12 + l16 * l11 + (l15 >> 26);
	//  165  287:lload           8
	//  166  289:lload           18
	//  167  291:lmul            
	//  168  292:lload           4
	//  169  294:lload           16
	//  170  296:lmul            
	//  171  297:ladd            
	//  172  298:lload           12
	//  173  300:lload           30
	//  174  302:lmul            
	//  175  303:ladd            
	//  176  304:lload           32
	//  177  306:lload           28
	//  178  308:lmul            
	//  179  309:ladd            
	//  180  310:lload           36
	//  181  312:lload           26
	//  182  314:lmul            
	//  183  315:ladd            
	//  184  316:lload           34
	//  185  318:bipush          26
	//  186  320:lshr            
	//  187  321:ladd            
	//  188  322:lstore          14
				l3 = l2 * l8 + l * l7 + l4 * l6 + l14 * l13 + l16 * l12 + (l5 >> 26);
	//  189  324:lload           8
	//  190  326:lload           20
	//  191  328:lmul            
	//  192  329:lload           4
	//  193  331:lload           18
	//  194  333:lmul            
	//  195  334:ladd            
	//  196  335:lload           12
	//  197  337:lload           16
	//  198  339:lmul            
	//  199  340:ladd            
	//  200  341:lload           32
	//  201  343:lload           30
	//  202  345:lmul            
	//  203  346:ladd            
	//  204  347:lload           36
	//  205  349:lload           28
	//  206  351:lmul            
	//  207  352:ladd            
	//  208  353:lload           14
	//  209  355:bipush          26
	//  210  357:lshr            
	//  211  358:ladd            
	//  212  359:lstore          10
				l1 = l2 * l9 + l * l8 + l4 * l7 + l14 * l6 + l16 * l13 + (l3 >> 26);
	//  213  361:lload           8
	//  214  363:lload           22
	//  215  365:lmul            
	//  216  366:lload           4
	//  217  368:lload           20
	//  218  370:lmul            
	//  219  371:ladd            
	//  220  372:lload           12
	//  221  374:lload           18
	//  222  376:lmul            
	//  223  377:ladd            
	//  224  378:lload           32
	//  225  380:lload           16
	//  226  382:lmul            
	//  227  383:ladd            
	//  228  384:lload           36
	//  229  386:lload           30
	//  230  388:lmul            
	//  231  389:ladd            
	//  232  390:lload           10
	//  233  392:bipush          26
	//  234  394:lshr            
	//  235  395:ladd            
	//  236  396:lstore          6
				l2 = l2 * l10 + l * l9 + l4 * l8 + l14 * l7 + l16 * l6 + (l1 >> 26);
	//  237  398:lload           8
	//  238  400:lload           24
	//  239  402:lmul            
	//  240  403:lload           4
	//  241  405:lload           22
	//  242  407:lmul            
	//  243  408:ladd            
	//  244  409:lload           12
	//  245  411:lload           20
	//  246  413:lmul            
	//  247  414:ladd            
	//  248  415:lload           32
	//  249  417:lload           18
	//  250  419:lmul            
	//  251  420:ladd            
	//  252  421:lload           36
	//  253  423:lload           16
	//  254  425:lmul            
	//  255  426:ladd            
	//  256  427:lload           6
	//  257  429:bipush          26
	//  258  431:lshr            
	//  259  432:ladd            
	//  260  433:lstore          8
				l14 = (l15 & 0x3ffffffL) + (l2 >> 26) * 5L;
	//  261  435:lload           34
	//  262  437:ldc2w           #13  <Long 0x3ffffffL>
	//  263  440:land            
	//  264  441:lload           8
	//  265  443:bipush          26
	//  266  445:lshr            
	//  267  446:ldc2w           #29  <Long 5L>
	//  268  449:lmul            
	//  269  450:ladd            
	//  270  451:lstore          32
				l = (l5 & 0x3ffffffL) + (l14 >> 26);
	//  271  453:lload           14
	//  272  455:ldc2w           #13  <Long 0x3ffffffL>
	//  273  458:land            
	//  274  459:lload           32
	//  275  461:bipush          26
	//  276  463:lshr            
	//  277  464:ladd            
	//  278  465:lstore          4
				i += 16;
	//  279  467:iload_2         
	//  280  468:bipush          16
	//  281  470:iadd            
	//  282  471:istore_2        
				l4 = l3 & 0x3ffffffL;
	//  283  472:lload           10
	//  284  474:ldc2w           #13  <Long 0x3ffffffL>
	//  285  477:land            
	//  286  478:lstore          12
				l3 = l1 & 0x3ffffffL;
	//  287  480:lload           6
	//  288  482:ldc2w           #13  <Long 0x3ffffffL>
	//  289  485:land            
	//  290  486:lstore          10
				l1 = l2 & 0x3ffffffL;
	//  291  488:lload           8
	//  292  490:ldc2w           #13  <Long 0x3ffffffL>
	//  293  493:land            
	//  294  494:lstore          6
				l2 = l14 & 0x3ffffffL;
	//  295  496:lload           32
	//  296  498:ldc2w           #13  <Long 0x3ffffffL>
	//  297  501:land            
	//  298  502:lstore          8
			}
	//* 299  504:goto            130
			l5 = l4 + (l >> 26);
	//  300  507:lload           12
	//  301  509:lload           4
	//  302  511:bipush          26
	//  303  513:lshr            
	//  304  514:ladd            
	//  305  515:lstore          14
			l4 = l5 & 0x3ffffffL;
	//  306  517:lload           14
	//  307  519:ldc2w           #13  <Long 0x3ffffffL>
	//  308  522:land            
	//  309  523:lstore          12
			l5 = l3 + (l5 >> 26);
	//  310  525:lload           10
	//  311  527:lload           14
	//  312  529:bipush          26
	//  313  531:lshr            
	//  314  532:ladd            
	//  315  533:lstore          14
			l3 = l5 & 0x3ffffffL;
	//  316  535:lload           14
	//  317  537:ldc2w           #13  <Long 0x3ffffffL>
	//  318  540:land            
	//  319  541:lstore          10
			l5 = l1 + (l5 >> 26);
	//  320  543:lload           6
	//  321  545:lload           14
	//  322  547:bipush          26
	//  323  549:lshr            
	//  324  550:ladd            
	//  325  551:lstore          14
			l1 = l5 & 0x3ffffffL;
	//  326  553:lload           14
	//  327  555:ldc2w           #13  <Long 0x3ffffffL>
	//  328  558:land            
	//  329  559:lstore          6
			l2 += (l5 >> 26) * 5L;
	//  330  561:lload           8
	//  331  563:lload           14
	//  332  565:bipush          26
	//  333  567:lshr            
	//  334  568:ldc2w           #29  <Long 5L>
	//  335  571:lmul            
	//  336  572:ladd            
	//  337  573:lstore          8
			l6 = l2 & 0x3ffffffL;
	//  338  575:lload           8
	//  339  577:ldc2w           #13  <Long 0x3ffffffL>
	//  340  580:land            
	//  341  581:lstore          16
			l9 = (l & 0x3ffffffL) + (l2 >> 26);
	//  342  583:lload           4
	//  343  585:ldc2w           #13  <Long 0x3ffffffL>
	//  344  588:land            
	//  345  589:lload           8
	//  346  591:bipush          26
	//  347  593:lshr            
	//  348  594:ladd            
	//  349  595:lstore          22
			l7 = l6 + 5L;
	//  350  597:lload           16
	//  351  599:ldc2w           #29  <Long 5L>
	//  352  602:ladd            
	//  353  603:lstore          18
			l11 = (l7 >> 26) + l9;
	//  354  605:lload           18
	//  355  607:bipush          26
	//  356  609:lshr            
	//  357  610:lload           22
	//  358  612:ladd            
	//  359  613:lstore          26
			l10 = l4 + (l11 >> 26);
	//  360  615:lload           12
	//  361  617:lload           26
	//  362  619:bipush          26
	//  363  621:lshr            
	//  364  622:ladd            
	//  365  623:lstore          24
			l8 = l3 + (l10 >> 26);
	//  366  625:lload           10
	//  367  627:lload           24
	//  368  629:bipush          26
	//  369  631:lshr            
	//  370  632:ladd            
	//  371  633:lstore          20
			l = (l1 + (l8 >> 26)) - 0x4000000L;
	//  372  635:lload           6
	//  373  637:lload           20
	//  374  639:bipush          26
	//  375  641:lshr            
	//  376  642:ladd            
	//  377  643:ldc2w           #49  <Long 0x4000000L>
	//  378  646:lsub            
	//  379  647:lstore          4
			l2 = l >> 63;
	//  380  649:lload           4
	//  381  651:bipush          63
	//  382  653:lshr            
	//  383  654:lstore          8
			l5 = ~l2;
	//  384  656:lload           8
	//  385  658:ldc2w           #51  <Long -1L>
	//  386  661:lxor            
	//  387  662:lstore          14
			l9 = l11 & 0x3ffffffL & l5 | l9 & l2;
	//  388  664:lload           26
	//  389  666:ldc2w           #13  <Long 0x3ffffffL>
	//  390  669:land            
	//  391  670:lload           14
	//  392  672:land            
	//  393  673:lload           22
	//  394  675:lload           8
	//  395  677:land            
	//  396  678:lor             
	//  397  679:lstore          22
			l4 = l10 & 0x3ffffffL & l5 | l4 & l2;
	//  398  681:lload           24
	//  399  683:ldc2w           #13  <Long 0x3ffffffL>
	//  400  686:land            
	//  401  687:lload           14
	//  402  689:land            
	//  403  690:lload           12
	//  404  692:lload           8
	//  405  694:land            
	//  406  695:lor             
	//  407  696:lstore          12
			l3 = l8 & 0x3ffffffL & l5 | l3 & l2;
	//  408  698:lload           20
	//  409  700:ldc2w           #13  <Long 0x3ffffffL>
	//  410  703:land            
	//  411  704:lload           14
	//  412  706:land            
	//  413  707:lload           10
	//  414  709:lload           8
	//  415  711:land            
	//  416  712:lor             
	//  417  713:lstore          10
			l6 = ((l9 << 26 | (l6 & l2 | l7 & 0x3ffffffL & l5)) & 0xffffffffL) + a(abyte0, 16);
	//  418  715:lload           22
	//  419  717:bipush          26
	//  420  719:lshl            
	//  421  720:lload           16
	//  422  722:lload           8
	//  423  724:land            
	//  424  725:lload           18
	//  425  727:ldc2w           #13  <Long 0x3ffffffL>
	//  426  730:land            
	//  427  731:lload           14
	//  428  733:land            
	//  429  734:lor             
	//  430  735:lor             
	//  431  736:ldc2w           #7   <Long 0xffffffffL>
	//  432  739:land            
	//  433  740:aload_0         
	//  434  741:bipush          16
	//  435  743:invokestatic    #12  <Method long a(byte[], int)>
	//  436  746:ladd            
	//  437  747:lstore          16
			l7 = ((l9 >> 6 | l4 << 20) & 0xffffffffL) + a(abyte0, 20) + (l6 >> 32);
	//  438  749:lload           22
	//  439  751:bipush          6
	//  440  753:lshr            
	//  441  754:lload           12
	//  442  756:bipush          20
	//  443  758:lshl            
	//  444  759:lor             
	//  445  760:ldc2w           #7   <Long 0xffffffffL>
	//  446  763:land            
	//  447  764:aload_0         
	//  448  765:bipush          20
	//  449  767:invokestatic    #12  <Method long a(byte[], int)>
	//  450  770:ladd            
	//  451  771:lload           16
	//  452  773:bipush          32
	//  453  775:lshr            
	//  454  776:ladd            
	//  455  777:lstore          18
			l4 = ((l4 >> 12 | l3 << 14) & 0xffffffffL) + a(abyte0, 24) + (l7 >> 32);
	//  456  779:lload           12
	//  457  781:bipush          12
	//  458  783:lshr            
	//  459  784:lload           10
	//  460  786:bipush          14
	//  461  788:lshl            
	//  462  789:lor             
	//  463  790:ldc2w           #7   <Long 0xffffffffL>
	//  464  793:land            
	//  465  794:aload_0         
	//  466  795:bipush          24
	//  467  797:invokestatic    #12  <Method long a(byte[], int)>
	//  468  800:ladd            
	//  469  801:lload           18
	//  470  803:bipush          32
	//  471  805:lshr            
	//  472  806:ladd            
	//  473  807:lstore          12
			l8 = a(abyte0, 28);
	//  474  809:aload_0         
	//  475  810:bipush          28
	//  476  812:invokestatic    #12  <Method long a(byte[], int)>
	//  477  815:lstore          20
			abyte0 = new byte[16];
	//  478  817:bipush          16
	//  479  819:newarray        byte[]
	//  480  821:astore_0        
			a(abyte0, l6 & 0xffffffffL, 0);
	//  481  822:aload_0         
	//  482  823:lload           16
	//  483  825:ldc2w           #7   <Long 0xffffffffL>
	//  484  828:land            
	//  485  829:iconst_0        
	//  486  830:invokestatic    #54  <Method void a(byte[], long, int)>
			a(abyte0, l7 & 0xffffffffL, 4);
	//  487  833:aload_0         
	//  488  834:lload           18
	//  489  836:ldc2w           #7   <Long 0xffffffffL>
	//  490  839:land            
	//  491  840:iconst_4        
	//  492  841:invokestatic    #54  <Method void a(byte[], long, int)>
			a(abyte0, l4 & 0xffffffffL, 8);
	//  493  844:aload_0         
	//  494  845:lload           12
	//  495  847:ldc2w           #7   <Long 0xffffffffL>
	//  496  850:land            
	//  497  851:bipush          8
	//  498  853:invokestatic    #54  <Method void a(byte[], long, int)>
			a(abyte0, ((l3 >> 18 | (l & l5 | l1 & l2) << 8) & 0xffffffffL) + l8 + (l4 >> 32) & 0xffffffffL, 12);
	//  499  856:aload_0         
	//  500  857:lload           10
	//  501  859:bipush          18
	//  502  861:lshr            
	//  503  862:lload           4
	//  504  864:lload           14
	//  505  866:land            
	//  506  867:lload           6
	//  507  869:lload           8
	//  508  871:land            
	//  509  872:lor             
	//  510  873:bipush          8
	//  511  875:lshl            
	//  512  876:lor             
	//  513  877:ldc2w           #7   <Long 0xffffffffL>
	//  514  880:land            
	//  515  881:lload           20
	//  516  883:ladd            
	//  517  884:lload           12
	//  518  886:bipush          32
	//  519  888:lshr            
	//  520  889:ladd            
	//  521  890:ldc2w           #7   <Long 0xffffffffL>
	//  522  893:land            
	//  523  894:bipush          12
	//  524  896:invokestatic    #54  <Method void a(byte[], long, int)>
			return abyte0;
	//  525  899:aload_0         
	//  526  900:areturn         
		} else
		{
			throw new IllegalArgumentException("The key length in bytes must be 32.");
	//  527  901:new             #56  <Class IllegalArgumentException>
	//  528  904:dup             
	//  529  905:ldc1            #58  <String "The key length in bytes must be 32.">
	//  530  907:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//  531  910:athrow          
		}
	}
}
