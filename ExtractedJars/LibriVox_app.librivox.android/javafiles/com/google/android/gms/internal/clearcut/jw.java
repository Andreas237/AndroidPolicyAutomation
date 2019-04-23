// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class jw
{

	private static int a(byte abyte0[], int i)
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
		return (abyte0[i + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16);
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
	//   41   54:ireturn         
	}

	private static long a(long l, long l1, long l2)
	{
		l = (l ^ l1) * l2;
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:lxor            
	//    3    3:lload           4
	//    4    5:lmul            
	//    5    6:lstore_0        
		l = (l ^ l >>> 47 ^ l1) * l2;
	//    6    7:lload_0         
	//    7    8:lload_0         
	//    8    9:bipush          47
	//    9   11:lushr           
	//   10   12:lxor            
	//   11   13:lload_2         
	//   12   14:lxor            
	//   13   15:lload           4
	//   14   17:lmul            
	//   15   18:lstore_0        
		return (l ^ l >>> 47) * l2;
	//   16   19:lload_0         
	//   17   20:lload_0         
	//   18   21:bipush          47
	//   19   23:lushr           
	//   20   24:lxor            
	//   21   25:lload           4
	//   22   27:lmul            
	//   23   28:lreturn         
	}

	public static long a(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		if(i >= 0 && i <= abyte0.length)
	//*   3    3:iload_1         
	//*   4    4:iflt            1035
	//*   5    7:iload_1         
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:icmpgt          1035
		{
			if(i <= 32)
	//*   9   13:iload_1         
	//*  10   14:bipush          32
	//*  11   16:icmpgt          329
				if(i <= 16)
	//*  12   19:iload_1         
	//*  13   20:bipush          16
	//*  14   22:icmpgt          225
				{
					if(i >= 8)
	//*  15   25:iload_1         
	//*  16   26:bipush          8
	//*  17   28:icmplt          96
					{
						long l1 = (long)(i << 1) - 0xd06fbfb1L;
	//   18   31:iload_1         
	//   19   32:iconst_1        
	//   20   33:ishl            
	//   21   34:i2l             
	//   22   35:ldc2w           #10  <Long 0xd06fbfb1L>
	//   23   38:lsub            
	//   24   39:lstore          5
						long l7 = b(abyte0, 0) - 0xd06fbfb1L;
	//   25   41:aload_0         
	//   26   42:iconst_0        
	//   27   43:invokestatic    #15  <Method long b(byte[], int)>
	//   28   46:ldc2w           #10  <Long 0xd06fbfb1L>
	//   29   49:lsub            
	//   30   50:lstore          7
						long l11 = b(abyte0, (i + 0) - 8);
	//   31   52:aload_0         
	//   32   53:iload_1         
	//   33   54:iconst_0        
	//   34   55:iadd            
	//   35   56:bipush          8
	//   36   58:isub            
	//   37   59:invokestatic    #15  <Method long b(byte[], int)>
	//   38   62:lstore          9
						return a(Long.rotateRight(l11, 37) * l1 + l7, (Long.rotateRight(l7, 25) + l11) * l1, l1);
	//   39   64:lload           9
	//   40   66:bipush          37
	//   41   68:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//   42   71:lload           5
	//   43   73:lmul            
	//   44   74:lload           7
	//   45   76:ladd            
	//   46   77:lload           7
	//   47   79:bipush          25
	//   48   81:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//   49   84:lload           9
	//   50   86:ladd            
	//   51   87:lload           5
	//   52   89:lmul            
	//   53   90:lload           5
	//   54   92:invokestatic    #23  <Method long a(long, long, long)>
	//   55   95:lreturn         
					}
					if(i >= 4)
	//*  56   96:iload_1         
	//*  57   97:iconst_4        
	//*  58   98:icmplt          146
					{
						long l2 = i << 1;
	//   59  101:iload_1         
	//   60  102:iconst_1        
	//   61  103:ishl            
	//   62  104:i2l             
	//   63  105:lstore          5
						return a((((long)a(abyte0, 0) & 0xffffffffL) << 3) + (long)i, (long)a(abyte0, (i + 0) - 4) & 0xffffffffL, l2 - 0xd06fbfb1L);
	//   64  107:aload_0         
	//   65  108:iconst_0        
	//   66  109:invokestatic    #25  <Method int a(byte[], int)>
	//   67  112:i2l             
	//   68  113:ldc2w           #26  <Long 0xffffffffL>
	//   69  116:land            
	//   70  117:iconst_3        
	//   71  118:lshl            
	//   72  119:iload_1         
	//   73  120:i2l             
	//   74  121:ladd            
	//   75  122:aload_0         
	//   76  123:iload_1         
	//   77  124:iconst_0        
	//   78  125:iadd            
	//   79  126:iconst_4        
	//   80  127:isub            
	//   81  128:invokestatic    #25  <Method int a(byte[], int)>
	//   82  131:i2l             
	//   83  132:ldc2w           #26  <Long 0xffffffffL>
	//   84  135:land            
	//   85  136:lload           5
	//   86  138:ldc2w           #10  <Long 0xd06fbfb1L>
	//   87  141:lsub            
	//   88  142:invokestatic    #23  <Method long a(long, long, long)>
	//   89  145:lreturn         
					}
					if(i > 0)
	//*  90  146:iload_1         
	//*  91  147:ifle            221
					{
						byte byte0 = abyte0[0];
	//   92  150:aload_0         
	//   93  151:iconst_0        
	//   94  152:baload          
	//   95  153:istore_2        
						byte byte1 = abyte0[(i >> 1) + 0];
	//   96  154:aload_0         
	//   97  155:iload_1         
	//   98  156:iconst_1        
	//   99  157:ishr            
	//  100  158:iconst_0        
	//  101  159:iadd            
	//  102  160:baload          
	//  103  161:istore_3        
						byte byte2 = abyte0[(i - 1) + 0];
	//  104  162:aload_0         
	//  105  163:iload_1         
	//  106  164:iconst_1        
	//  107  165:isub            
	//  108  166:iconst_0        
	//  109  167:iadd            
	//  110  168:baload          
	//  111  169:istore          4
						long l3 = (long)((byte0 & 0xff) + ((byte1 & 0xff) << 8)) * 0x2f90404fL ^ (long)(i + ((byte2 & 0xff) << 2)) * 0x97cb3127L;
	//  112  171:iload_2         
	//  113  172:sipush          255
	//  114  175:iand            
	//  115  176:iload_3         
	//  116  177:sipush          255
	//  117  180:iand            
	//  118  181:bipush          8
	//  119  183:ishl            
	//  120  184:iadd            
	//  121  185:i2l             
	//  122  186:ldc2w           #28  <Long 0x2f90404fL>
	//  123  189:lmul            
	//  124  190:iload_1         
	//  125  191:iload           4
	//  126  193:sipush          255
	//  127  196:iand            
	//  128  197:iconst_2        
	//  129  198:ishl            
	//  130  199:iadd            
	//  131  200:i2l             
	//  132  201:ldc2w           #30  <Long 0x97cb3127L>
	//  133  204:lmul            
	//  134  205:lxor            
	//  135  206:lstore          5
						return (l3 ^ l3 >>> 47) * 0x2f90404fL;
	//  136  208:lload           5
	//  137  210:lload           5
	//  138  212:bipush          47
	//  139  214:lushr           
	//  140  215:lxor            
	//  141  216:ldc2w           #28  <Long 0x2f90404fL>
	//  142  219:lmul            
	//  143  220:lreturn         
					} else
					{
						return 0x2f90404fL;
	//  144  221:ldc2w           #28  <Long 0x2f90404fL>
	//  145  224:lreturn         
					}
				} else
				{
					long l4 = (long)(i << 1) - 0xd06fbfb1L;
	//  146  225:iload_1         
	//  147  226:iconst_1        
	//  148  227:ishl            
	//  149  228:i2l             
	//  150  229:ldc2w           #10  <Long 0xd06fbfb1L>
	//  151  232:lsub            
	//  152  233:lstore          5
					long l8 = b(abyte0, 0) * 0xbe98f273L;
	//  153  235:aload_0         
	//  154  236:iconst_0        
	//  155  237:invokestatic    #15  <Method long b(byte[], int)>
	//  156  240:ldc2w           #32  <Long 0xbe98f273L>
	//  157  243:lmul            
	//  158  244:lstore          7
					long l12 = b(abyte0, 8);
	//  159  246:aload_0         
	//  160  247:bipush          8
	//  161  249:invokestatic    #15  <Method long b(byte[], int)>
	//  162  252:lstore          9
					i += 0;
	//  163  254:iload_1         
	//  164  255:iconst_0        
	//  165  256:iadd            
	//  166  257:istore_1        
					long l15 = b(abyte0, i - 8) * l4;
	//  167  258:aload_0         
	//  168  259:iload_1         
	//  169  260:bipush          8
	//  170  262:isub            
	//  171  263:invokestatic    #15  <Method long b(byte[], int)>
	//  172  266:lload           5
	//  173  268:lmul            
	//  174  269:lstore          11
					long l18 = b(abyte0, i - 16);
	//  175  271:aload_0         
	//  176  272:iload_1         
	//  177  273:bipush          16
	//  178  275:isub            
	//  179  276:invokestatic    #15  <Method long b(byte[], int)>
	//  180  279:lstore          13
					return a(Long.rotateRight(l8 + l12, 43) + Long.rotateRight(l15, 30) + l18 * 0x2f90404fL, l8 + Long.rotateRight(l12 - 0xd06fbfb1L, 18) + l15, l4);
	//  181  281:lload           7
	//  182  283:lload           9
	//  183  285:ladd            
	//  184  286:bipush          43
	//  185  288:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  186  291:lload           11
	//  187  293:bipush          30
	//  188  295:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  189  298:ladd            
	//  190  299:lload           13
	//  191  301:ldc2w           #28  <Long 0x2f90404fL>
	//  192  304:lmul            
	//  193  305:ladd            
	//  194  306:lload           7
	//  195  308:lload           9
	//  196  310:ldc2w           #10  <Long 0xd06fbfb1L>
	//  197  313:lsub            
	//  198  314:bipush          18
	//  199  316:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  200  319:ladd            
	//  201  320:lload           11
	//  202  322:ladd            
	//  203  323:lload           5
	//  204  325:invokestatic    #23  <Method long a(long, long, long)>
	//  205  328:lreturn         
				}
			if(i <= 64)
	//* 206  329:iload_1         
	//* 207  330:bipush          64
	//* 208  332:icmpgt          534
			{
				long l5 = (long)(i << 1) - 0xd06fbfb1L;
	//  209  335:iload_1         
	//  210  336:iconst_1        
	//  211  337:ishl            
	//  212  338:i2l             
	//  213  339:ldc2w           #10  <Long 0xd06fbfb1L>
	//  214  342:lsub            
	//  215  343:lstore          5
				long l9 = b(abyte0, 0) * 0x2f90404fL;
	//  216  345:aload_0         
	//  217  346:iconst_0        
	//  218  347:invokestatic    #15  <Method long b(byte[], int)>
	//  219  350:ldc2w           #28  <Long 0x2f90404fL>
	//  220  353:lmul            
	//  221  354:lstore          7
				long l16 = b(abyte0, 8);
	//  222  356:aload_0         
	//  223  357:bipush          8
	//  224  359:invokestatic    #15  <Method long b(byte[], int)>
	//  225  362:lstore          11
				i += 0;
	//  226  364:iload_1         
	//  227  365:iconst_0        
	//  228  366:iadd            
	//  229  367:istore_1        
				long l19 = b(abyte0, i - 8) * l5;
	//  230  368:aload_0         
	//  231  369:iload_1         
	//  232  370:bipush          8
	//  233  372:isub            
	//  234  373:invokestatic    #15  <Method long b(byte[], int)>
	//  235  376:lload           5
	//  236  378:lmul            
	//  237  379:lstore          13
				long l13 = b(abyte0, i - 16);
	//  238  381:aload_0         
	//  239  382:iload_1         
	//  240  383:bipush          16
	//  241  385:isub            
	//  242  386:invokestatic    #15  <Method long b(byte[], int)>
	//  243  389:lstore          9
				l13 = Long.rotateRight(l9 + l16, 43) + Long.rotateRight(l19, 30) + l13 * 0x2f90404fL;
	//  244  391:lload           7
	//  245  393:lload           11
	//  246  395:ladd            
	//  247  396:bipush          43
	//  248  398:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  249  401:lload           13
	//  250  403:bipush          30
	//  251  405:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  252  408:ladd            
	//  253  409:lload           9
	//  254  411:ldc2w           #28  <Long 0x2f90404fL>
	//  255  414:lmul            
	//  256  415:ladd            
	//  257  416:lstore          9
				l16 = a(l13, Long.rotateRight(0x2f90404fL + l16, 18) + l9 + l19, l5);
	//  258  418:lload           9
	//  259  420:ldc2w           #28  <Long 0x2f90404fL>
	//  260  423:lload           11
	//  261  425:ladd            
	//  262  426:bipush          18
	//  263  428:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  264  431:lload           7
	//  265  433:ladd            
	//  266  434:lload           13
	//  267  436:ladd            
	//  268  437:lload           5
	//  269  439:invokestatic    #23  <Method long a(long, long, long)>
	//  270  442:lstore          11
				l19 = b(abyte0, 16) * l5;
	//  271  444:aload_0         
	//  272  445:bipush          16
	//  273  447:invokestatic    #15  <Method long b(byte[], int)>
	//  274  450:lload           5
	//  275  452:lmul            
	//  276  453:lstore          13
				long l21 = b(abyte0, 24);
	//  277  455:aload_0         
	//  278  456:bipush          24
	//  279  458:invokestatic    #15  <Method long b(byte[], int)>
	//  280  461:lstore          15
				l13 = (l13 + b(abyte0, i - 32)) * l5;
	//  281  463:lload           9
	//  282  465:aload_0         
	//  283  466:iload_1         
	//  284  467:bipush          32
	//  285  469:isub            
	//  286  470:invokestatic    #15  <Method long b(byte[], int)>
	//  287  473:ladd            
	//  288  474:lload           5
	//  289  476:lmul            
	//  290  477:lstore          9
				return a((l16 + b(abyte0, i - 24)) * l5 + (Long.rotateRight(l19 + l21, 43) + Long.rotateRight(l13, 30)), l19 + Long.rotateRight(l21 + l9, 18) + l13, l5);
	//  291  479:lload           11
	//  292  481:aload_0         
	//  293  482:iload_1         
	//  294  483:bipush          24
	//  295  485:isub            
	//  296  486:invokestatic    #15  <Method long b(byte[], int)>
	//  297  489:ladd            
	//  298  490:lload           5
	//  299  492:lmul            
	//  300  493:lload           13
	//  301  495:lload           15
	//  302  497:ladd            
	//  303  498:bipush          43
	//  304  500:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  305  503:lload           9
	//  306  505:bipush          30
	//  307  507:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  308  510:ladd            
	//  309  511:ladd            
	//  310  512:lload           13
	//  311  514:lload           15
	//  312  516:lload           7
	//  313  518:ladd            
	//  314  519:bipush          18
	//  315  521:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  316  524:ladd            
	//  317  525:lload           9
	//  318  527:ladd            
	//  319  528:lload           5
	//  320  530:invokestatic    #23  <Method long a(long, long, long)>
	//  321  533:lreturn         
			}
			long l10 = 0x4e64b6d4L;
	//  322  534:ldc2w           #34  <Long 0x4e64b6d4L>
	//  323  537:lstore          7
			long l6 = 0x856d0526L;
	//  324  539:ldc2w           #36  <Long 0x856d0526L>
	//  325  542:lstore          5
			long al[] = new long[2];
	//  326  544:iconst_2        
	//  327  545:newarray        long[]
	//  328  547:astore          17
			long al1[] = new long[2];
	//  329  549:iconst_2        
	//  330  550:newarray        long[]
	//  331  552:astore          18
			long l14 = b(abyte0, 0) + 0xca458ffL;
	//  332  554:aload_0         
	//  333  555:iconst_0        
	//  334  556:invokestatic    #15  <Method long b(byte[], int)>
	//  335  559:ldc2w           #38  <Long 0xca458ffL>
	//  336  562:ladd            
	//  337  563:lstore          9
			i--;
	//  338  565:iload_1         
	//  339  566:iconst_1        
	//  340  567:isub            
	//  341  568:istore_1        
			int j = (i / 64 << 6) + 0;
	//  342  569:iload_1         
	//  343  570:bipush          64
	//  344  572:idiv            
	//  345  573:bipush          6
	//  346  575:ishl            
	//  347  576:iconst_0        
	//  348  577:iadd            
	//  349  578:istore_2        
			i &= 0x3f;
	//  350  579:iload_1         
	//  351  580:bipush          63
	//  352  582:iand            
	//  353  583:istore_1        
			int l = (j + i) - 63;
	//  354  584:iload_2         
	//  355  585:iload_1         
	//  356  586:iadd            
	//  357  587:bipush          63
	//  358  589:isub            
	//  359  590:istore          4
			int k = 0;
	//  360  592:iconst_0        
	//  361  593:istore_3        
			do
			{
				l14 = Long.rotateRight(l14 + l10 + al[0] + b(abyte0, k + 8), 37);
	//  362  594:lload           9
	//  363  596:lload           7
	//  364  598:ladd            
	//  365  599:aload           17
	//  366  601:iconst_0        
	//  367  602:laload          
	//  368  603:ladd            
	//  369  604:aload_0         
	//  370  605:iload_3         
	//  371  606:bipush          8
	//  372  608:iadd            
	//  373  609:invokestatic    #15  <Method long b(byte[], int)>
	//  374  612:ladd            
	//  375  613:bipush          37
	//  376  615:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  377  618:lstore          9
				long l17 = Long.rotateRight(l10 + al[1] + b(abyte0, k + 48), 42);
	//  378  620:lload           7
	//  379  622:aload           17
	//  380  624:iconst_1        
	//  381  625:laload          
	//  382  626:ladd            
	//  383  627:aload_0         
	//  384  628:iload_3         
	//  385  629:bipush          48
	//  386  631:iadd            
	//  387  632:invokestatic    #15  <Method long b(byte[], int)>
	//  388  635:ladd            
	//  389  636:bipush          42
	//  390  638:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  391  641:lstore          11
				l10 = l14 * 0xbe98f273L ^ al1[1];
	//  392  643:lload           9
	//  393  645:ldc2w           #32  <Long 0xbe98f273L>
	//  394  648:lmul            
	//  395  649:aload           18
	//  396  651:iconst_1        
	//  397  652:laload          
	//  398  653:lxor            
	//  399  654:lstore          7
				l14 = l17 * 0xbe98f273L + (al[0] + b(abyte0, k + 40));
	//  400  656:lload           11
	//  401  658:ldc2w           #32  <Long 0xbe98f273L>
	//  402  661:lmul            
	//  403  662:aload           17
	//  404  664:iconst_0        
	//  405  665:laload          
	//  406  666:aload_0         
	//  407  667:iload_3         
	//  408  668:bipush          40
	//  409  670:iadd            
	//  410  671:invokestatic    #15  <Method long b(byte[], int)>
	//  411  674:ladd            
	//  412  675:ladd            
	//  413  676:lstore          9
				l17 = Long.rotateRight(l6 + al1[0], 33) * 0xbe98f273L;
	//  414  678:lload           5
	//  415  680:aload           18
	//  416  682:iconst_0        
	//  417  683:laload          
	//  418  684:ladd            
	//  419  685:bipush          33
	//  420  687:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  421  690:ldc2w           #32  <Long 0xbe98f273L>
	//  422  693:lmul            
	//  423  694:lstore          11
				a(abyte0, k, al[1] * 0xbe98f273L, l10 + al1[0], al);
	//  424  696:aload_0         
	//  425  697:iload_3         
	//  426  698:aload           17
	//  427  700:iconst_1        
	//  428  701:laload          
	//  429  702:ldc2w           #32  <Long 0xbe98f273L>
	//  430  705:lmul            
	//  431  706:lload           7
	//  432  708:aload           18
	//  433  710:iconst_0        
	//  434  711:laload          
	//  435  712:ladd            
	//  436  713:aload           17
	//  437  715:invokestatic    #42  <Method void a(byte[], int, long, long, long[])>
				a(abyte0, k + 32, l17 + al1[1], l14 + b(abyte0, k + 16), al1);
	//  438  718:aload_0         
	//  439  719:iload_3         
	//  440  720:bipush          32
	//  441  722:iadd            
	//  442  723:lload           11
	//  443  725:aload           18
	//  444  727:iconst_1        
	//  445  728:laload          
	//  446  729:ladd            
	//  447  730:lload           9
	//  448  732:aload_0         
	//  449  733:iload_3         
	//  450  734:bipush          16
	//  451  736:iadd            
	//  452  737:invokestatic    #15  <Method long b(byte[], int)>
	//  453  740:ladd            
	//  454  741:aload           18
	//  455  743:invokestatic    #42  <Method void a(byte[], int, long, long, long[])>
				k += 64;
	//  456  746:iload_3         
	//  457  747:bipush          64
	//  458  749:iadd            
	//  459  750:istore_3        
				if(k == j)
	//* 460  751:iload_3         
	//* 461  752:iload_2         
	//* 462  753:icmpne          1020
				{
					l6 = 0xbe98f273L + ((255L & l10) << 1);
	//  463  756:ldc2w           #32  <Long 0xbe98f273L>
	//  464  759:ldc2w           #43  <Long 255L>
	//  465  762:lload           7
	//  466  764:land            
	//  467  765:iconst_1        
	//  468  766:lshl            
	//  469  767:ladd            
	//  470  768:lstore          5
					al1[0] = al1[0] + (long)i;
	//  471  770:aload           18
	//  472  772:iconst_0        
	//  473  773:aload           18
	//  474  775:iconst_0        
	//  475  776:laload          
	//  476  777:iload_1         
	//  477  778:i2l             
	//  478  779:ladd            
	//  479  780:lastore         
					al[0] = al[0] + al1[0];
	//  480  781:aload           17
	//  481  783:iconst_0        
	//  482  784:aload           17
	//  483  786:iconst_0        
	//  484  787:laload          
	//  485  788:aload           18
	//  486  790:iconst_0        
	//  487  791:laload          
	//  488  792:ladd            
	//  489  793:lastore         
					al1[0] = al1[0] + al[0];
	//  490  794:aload           18
	//  491  796:iconst_0        
	//  492  797:aload           18
	//  493  799:iconst_0        
	//  494  800:laload          
	//  495  801:aload           17
	//  496  803:iconst_0        
	//  497  804:laload          
	//  498  805:ladd            
	//  499  806:lastore         
					l17 = Long.rotateRight(l17 + l14 + al[0] + b(abyte0, l + 8), 37);
	//  500  807:lload           11
	//  501  809:lload           9
	//  502  811:ladd            
	//  503  812:aload           17
	//  504  814:iconst_0        
	//  505  815:laload          
	//  506  816:ladd            
	//  507  817:aload_0         
	//  508  818:iload           4
	//  509  820:bipush          8
	//  510  822:iadd            
	//  511  823:invokestatic    #15  <Method long b(byte[], int)>
	//  512  826:ladd            
	//  513  827:bipush          37
	//  514  829:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  515  832:lstore          11
					long l20 = Long.rotateRight(l14 + al[1] + b(abyte0, l + 48), 42);
	//  516  834:lload           9
	//  517  836:aload           17
	//  518  838:iconst_1        
	//  519  839:laload          
	//  520  840:ladd            
	//  521  841:aload_0         
	//  522  842:iload           4
	//  523  844:bipush          48
	//  524  846:iadd            
	//  525  847:invokestatic    #15  <Method long b(byte[], int)>
	//  526  850:ladd            
	//  527  851:bipush          42
	//  528  853:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  529  856:lstore          13
					l14 = l17 * l6 ^ al1[1] * 9L;
	//  530  858:lload           11
	//  531  860:lload           5
	//  532  862:lmul            
	//  533  863:aload           18
	//  534  865:iconst_1        
	//  535  866:laload          
	//  536  867:ldc2w           #45  <Long 9L>
	//  537  870:lmul            
	//  538  871:lxor            
	//  539  872:lstore          9
					l17 = l20 * l6 + (al[0] * 9L + b(abyte0, l + 40));
	//  540  874:lload           13
	//  541  876:lload           5
	//  542  878:lmul            
	//  543  879:aload           17
	//  544  881:iconst_0        
	//  545  882:laload          
	//  546  883:ldc2w           #45  <Long 9L>
	//  547  886:lmul            
	//  548  887:aload_0         
	//  549  888:iload           4
	//  550  890:bipush          40
	//  551  892:iadd            
	//  552  893:invokestatic    #15  <Method long b(byte[], int)>
	//  553  896:ladd            
	//  554  897:ladd            
	//  555  898:lstore          11
					l10 = Long.rotateRight(l10 + al1[0], 33) * l6;
	//  556  900:lload           7
	//  557  902:aload           18
	//  558  904:iconst_0        
	//  559  905:laload          
	//  560  906:ladd            
	//  561  907:bipush          33
	//  562  909:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//  563  912:lload           5
	//  564  914:lmul            
	//  565  915:lstore          7
					a(abyte0, l, al[1] * l6, l14 + al1[0], al);
	//  566  917:aload_0         
	//  567  918:iload           4
	//  568  920:aload           17
	//  569  922:iconst_1        
	//  570  923:laload          
	//  571  924:lload           5
	//  572  926:lmul            
	//  573  927:lload           9
	//  574  929:aload           18
	//  575  931:iconst_0        
	//  576  932:laload          
	//  577  933:ladd            
	//  578  934:aload           17
	//  579  936:invokestatic    #42  <Method void a(byte[], int, long, long, long[])>
					a(abyte0, l + 32, al1[1] + l10, l17 + b(abyte0, l + 16), al1);
	//  580  939:aload_0         
	//  581  940:iload           4
	//  582  942:bipush          32
	//  583  944:iadd            
	//  584  945:aload           18
	//  585  947:iconst_1        
	//  586  948:laload          
	//  587  949:lload           7
	//  588  951:ladd            
	//  589  952:lload           11
	//  590  954:aload_0         
	//  591  955:iload           4
	//  592  957:bipush          16
	//  593  959:iadd            
	//  594  960:invokestatic    #15  <Method long b(byte[], int)>
	//  595  963:ladd            
	//  596  964:aload           18
	//  597  966:invokestatic    #42  <Method void a(byte[], int, long, long, long[])>
					return a(a(al[0], al1[0], l6) + (l17 ^ l17 >>> 47) * 0x97cb3127L + l14, a(al[1], al1[1], l6) + l10, l6);
	//  598  969:aload           17
	//  599  971:iconst_0        
	//  600  972:laload          
	//  601  973:aload           18
	//  602  975:iconst_0        
	//  603  976:laload          
	//  604  977:lload           5
	//  605  979:invokestatic    #23  <Method long a(long, long, long)>
	//  606  982:lload           11
	//  607  984:lload           11
	//  608  986:bipush          47
	//  609  988:lushr           
	//  610  989:lxor            
	//  611  990:ldc2w           #30  <Long 0x97cb3127L>
	//  612  993:lmul            
	//  613  994:ladd            
	//  614  995:lload           9
	//  615  997:ladd            
	//  616  998:aload           17
	//  617 1000:iconst_1        
	//  618 1001:laload          
	//  619 1002:aload           18
	//  620 1004:iconst_1        
	//  621 1005:laload          
	//  622 1006:lload           5
	//  623 1008:invokestatic    #23  <Method long a(long, long, long)>
	//  624 1011:lload           7
	//  625 1013:ladd            
	//  626 1014:lload           5
	//  627 1016:invokestatic    #23  <Method long a(long, long, long)>
	//  628 1019:lreturn         
				}
				l6 = l10;
	//  629 1020:lload           7
	//  630 1022:lstore          5
				l10 = l14;
	//  631 1024:lload           9
	//  632 1026:lstore          7
				l14 = l17;
	//  633 1028:lload           11
	//  634 1030:lstore          9
			} while(true);
	//  635 1032:goto            594
		} else
		{
			abyte0 = ((byte []) (new StringBuilder(67)));
	//  636 1035:new             #48  <Class StringBuilder>
	//  637 1038:dup             
	//  638 1039:bipush          67
	//  639 1041:invokespecial   #52  <Method void StringBuilder(int)>
	//  640 1044:astore_0        
			((StringBuilder) (abyte0)).append("Out of bound index with offput: 0 and length: ");
	//  641 1045:aload_0         
	//  642 1046:ldc1            #54  <String "Out of bound index with offput: 0 and length: ">
	//  643 1048:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  644 1051:pop             
			((StringBuilder) (abyte0)).append(i);
	//  645 1052:aload_0         
	//  646 1053:iload_1         
	//  647 1054:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//  648 1057:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (abyte0)).toString());
	//  649 1058:new             #63  <Class IndexOutOfBoundsException>
	//  650 1061:dup             
	//  651 1062:aload_0         
	//  652 1063:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  653 1066:invokespecial   #70  <Method void IndexOutOfBoundsException(String)>
	//  654 1069:athrow          
		}
	}

	private static void a(byte abyte0[], int i, long l, long l1, long al[])
	{
		long l5 = b(abyte0, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #15  <Method long b(byte[], int)>
	//    3    5:lstore          13
		long l3 = b(abyte0, i + 8);
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:bipush          8
	//    7   11:iadd            
	//    8   12:invokestatic    #15  <Method long b(byte[], int)>
	//    9   15:lstore          9
		long l4 = b(abyte0, i + 16);
	//   10   17:aload_0         
	//   11   18:iload_1         
	//   12   19:bipush          16
	//   13   21:iadd            
	//   14   22:invokestatic    #15  <Method long b(byte[], int)>
	//   15   25:lstore          11
		long l2 = b(abyte0, i + 24);
	//   16   27:aload_0         
	//   17   28:iload_1         
	//   18   29:bipush          24
	//   19   31:iadd            
	//   20   32:invokestatic    #15  <Method long b(byte[], int)>
	//   21   35:lstore          7
		l += l5;
	//   22   37:lload_2         
	//   23   38:lload           13
	//   24   40:ladd            
	//   25   41:lstore_2        
		l1 = Long.rotateRight(l1 + l + l2, 21);
	//   26   42:lload           4
	//   27   44:lload_2         
	//   28   45:ladd            
	//   29   46:lload           7
	//   30   48:ladd            
	//   31   49:bipush          21
	//   32   51:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//   33   54:lstore          4
		l3 = l3 + l + l4;
	//   34   56:lload           9
	//   35   58:lload_2         
	//   36   59:ladd            
	//   37   60:lload           11
	//   38   62:ladd            
	//   39   63:lstore          9
		l4 = Long.rotateRight(l3, 44);
	//   40   65:lload           9
	//   41   67:bipush          44
	//   42   69:invokestatic    #21  <Method long Long.rotateRight(long, int)>
	//   43   72:lstore          11
		al[0] = l3 + l2;
	//   44   74:aload           6
	//   45   76:iconst_0        
	//   46   77:lload           9
	//   47   79:lload           7
	//   48   81:ladd            
	//   49   82:lastore         
		al[1] = l1 + l4 + l;
	//   50   83:aload           6
	//   51   85:iconst_1        
	//   52   86:lload           4
	//   53   88:lload           11
	//   54   90:ladd            
	//   55   91:lload_2         
	//   56   92:ladd            
	//   57   93:lastore         
	//   58   94:return          
	}

	private static long b(byte abyte0[], int i)
	{
		abyte0 = ((byte []) (ByteBuffer.wrap(abyte0, i, 8)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:invokestatic    #76  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    4    7:astore_0        
		((ByteBuffer) (abyte0)).order(ByteOrder.LITTLE_ENDIAN);
	//    5    8:aload_0         
	//    6    9:getstatic       #82  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    7   12:invokevirtual   #86  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    8   15:pop             
		return ((ByteBuffer) (abyte0)).getLong();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #90  <Method long ByteBuffer.getLong()>
	//   11   20:lreturn         
	}
}
