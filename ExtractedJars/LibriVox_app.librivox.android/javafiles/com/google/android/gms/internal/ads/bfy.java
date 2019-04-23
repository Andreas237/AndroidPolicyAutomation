// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Stack;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bgb, bgi, bfo, bnf, 
//			bga, bgc, bdj

final class bfy
	implements bgb
{

	bfy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:newarray        byte[]
	//    5    9:putfield        #25  <Field byte[] a>
	//    6   12:aload_0         
	//    7   13:new             #27  <Class Stack>
	//    8   16:dup             
	//    9   17:invokespecial   #28  <Method void Stack()>
	//   10   20:putfield        #30  <Field Stack b>
	//   11   23:aload_0         
	//   12   24:new             #32  <Class bgi>
	//   13   27:dup             
	//   14   28:invokespecial   #33  <Method void bgi()>
	//   15   31:putfield        #35  <Field bgi c>
	//   16   34:return          
	}

	private final long a(bfo bfo1, int i)
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field byte[] a>
	//    2    4:astore          6
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		bfo1.b(abyte0, 0, i);
	//    5    8:aload_1         
	//    6    9:aload           6
	//    7   11:iconst_0        
	//    8   12:iload_2         
	//    9   13:invokeinterface #42  <Method void bfo.b(byte[], int, int)>
		long l = 0L;
	//   10   18:lconst_0        
	//   11   19:lstore          4
		for(; j < i; j++)
	//*  12   21:iload_3         
	//*  13   22:iload_2         
	//*  14   23:icmpge          52
			l = l << 8 | (long)(a[j] & 0xff);
	//   15   26:lload           4
	//   16   28:bipush          8
	//   17   30:lshl            
	//   18   31:aload_0         
	//   19   32:getfield        #25  <Field byte[] a>
	//   20   35:iload_3         
	//   21   36:baload          
	//   22   37:sipush          255
	//   23   40:iand            
	//   24   41:i2l             
	//   25   42:lor             
	//   26   43:lstore          4

	//   27   45:iload_3         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_3        
	//*  31   49:goto            21
		return l;
	//   32   52:lload           4
	//   33   54:lreturn         
	}

	public final void a()
	{
		e = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #44  <Field int e>
		b.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field Stack b>
	//    5    9:invokevirtual   #47  <Method void Stack.clear()>
		c.a();
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field bgi c>
	//    8   16:invokevirtual   #49  <Method void bgi.a()>
	//    9   19:return          
	}

	public final void a(bgc bgc1)
	{
		d = bgc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field bgc d>
	//    3    5:return          
	}

	public final boolean a(bfo bfo1)
	{
		boolean flag;
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field bgc d>
	//*   2    4:ifnull          13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          6
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          6
		bnf.b(flag);
	//    8   16:iload           6
	//    9   18:invokestatic    #58  <Method void bnf.b(boolean)>
		do
		{
			if(!b.isEmpty() && bfo1.b() >= bga.a((bga)b.peek()))
	//*  10   21:aload_0         
	//*  11   22:getfield        #30  <Field Stack b>
	//*  12   25:invokevirtual   #62  <Method boolean Stack.isEmpty()>
	//*  13   28:ifne            78
	//*  14   31:aload_1         
	//*  15   32:invokeinterface #65  <Method long bfo.b()>
	//*  16   37:aload_0         
	//*  17   38:getfield        #30  <Field Stack b>
	//*  18   41:invokevirtual   #69  <Method Object Stack.peek()>
	//*  19   44:checkcast       #71  <Class bga>
	//*  20   47:invokestatic    #74  <Method long bga.a(bga)>
	//*  21   50:lcmp            
	//*  22   51:iflt            78
			{
				d.c(bga.b((bga)b.pop()));
	//   23   54:aload_0         
	//   24   55:getfield        #52  <Field bgc d>
	//   25   58:aload_0         
	//   26   59:getfield        #30  <Field Stack b>
	//   27   62:invokevirtual   #77  <Method Object Stack.pop()>
	//   28   65:checkcast       #71  <Class bga>
	//   29   68:invokestatic    #80  <Method int bga.b(bga)>
	//   30   71:invokeinterface #85  <Method void bgc.c(int)>
				return true;
	//   31   76:iconst_1        
	//   32   77:ireturn         
			}
			if(e == 0)
	//*  33   78:aload_0         
	//*  34   79:getfield        #44  <Field int e>
	//*  35   82:ifne            228
			{
				long l6 = c.a(bfo1, true, false, 4);
	//   36   85:aload_0         
	//   37   86:getfield        #35  <Field bgi c>
	//   38   89:aload_1         
	//   39   90:iconst_1        
	//   40   91:iconst_0        
	//   41   92:iconst_4        
	//   42   93:invokevirtual   #88  <Method long bgi.a(bfo, boolean, boolean, int)>
	//   43   96:lstore          9
				long l1 = l6;
	//   44   98:lload           9
	//   45  100:lstore          7
				if(l6 == -2L)
	//*  46  102:lload           9
	//*  47  104:ldc2w           #89  <Long -2L>
	//*  48  107:lcmp            
	//*  49  108:ifne            205
				{
					bfo1.a();
	//   50  111:aload_1         
	//   51  112:invokeinterface #91  <Method void bfo.a()>
					do
					{
						bfo1.c(a, 0, 4);
	//   52  117:aload_1         
	//   53  118:aload_0         
	//   54  119:getfield        #25  <Field byte[] a>
	//   55  122:iconst_0        
	//   56  123:iconst_4        
	//   57  124:invokeinterface #93  <Method void bfo.c(byte[], int, int)>
						int i = bgi.a(((int) (a[0])));
	//   58  129:aload_0         
	//   59  130:getfield        #25  <Field byte[] a>
	//   60  133:iconst_0        
	//   61  134:baload          
	//   62  135:invokestatic    #96  <Method int bgi.a(int)>
	//   63  138:istore          4
						if(i != -1 && i <= 4)
	//*  64  140:iload           4
	//*  65  142:iconst_m1       
	//*  66  143:icmpeq          195
	//*  67  146:iload           4
	//*  68  148:iconst_4        
	//*  69  149:icmpgt          195
						{
							int i1 = (int)bgi.a(a, i, false);
	//   70  152:aload_0         
	//   71  153:getfield        #25  <Field byte[] a>
	//   72  156:iload           4
	//   73  158:iconst_0        
	//   74  159:invokestatic    #99  <Method long bgi.a(byte[], int, boolean)>
	//   75  162:l2i             
	//   76  163:istore          5
							if(d.b(i1))
	//*  77  165:aload_0         
	//*  78  166:getfield        #52  <Field bgc d>
	//*  79  169:iload           5
	//*  80  171:invokeinterface #102 <Method boolean bgc.b(int)>
	//*  81  176:ifeq            195
							{
								bfo1.b(i);
	//   82  179:aload_1         
	//   83  180:iload           4
	//   84  182:invokeinterface #104 <Method void bfo.b(int)>
								l1 = i1;
	//   85  187:iload           5
	//   86  189:i2l             
	//   87  190:lstore          7
								break;
	//   88  192:goto            205
							}
						}
						bfo1.b(1);
	//   89  195:aload_1         
	//   90  196:iconst_1        
	//   91  197:invokeinterface #104 <Method void bfo.b(int)>
					} while(true);
	//   92  202:goto            117
				}
				if(l1 == -1L)
	//*  93  205:lload           7
	//*  94  207:ldc2w           #105 <Long -1L>
	//*  95  210:lcmp            
	//*  96  211:ifne            216
					return false;
	//   97  214:iconst_0        
	//   98  215:ireturn         
				f = (int)l1;
	//   99  216:aload_0         
	//  100  217:lload           7
	//  101  219:l2i             
	//  102  220:putfield        #108 <Field int f>
				e = 1;
	//  103  223:aload_0         
	//  104  224:iconst_1        
	//  105  225:putfield        #44  <Field int e>
			}
			if(e == 1)
	//* 106  228:aload_0         
	//* 107  229:getfield        #44  <Field int e>
	//* 108  232:iconst_1        
	//* 109  233:icmpne          257
			{
				g = c.a(bfo1, false, true, 8);
	//  110  236:aload_0         
	//  111  237:aload_0         
	//  112  238:getfield        #35  <Field bgi c>
	//  113  241:aload_1         
	//  114  242:iconst_0        
	//  115  243:iconst_1        
	//  116  244:bipush          8
	//  117  246:invokevirtual   #88  <Method long bgi.a(bfo, boolean, boolean, int)>
	//  118  249:putfield        #110 <Field long g>
				e = 2;
	//  119  252:aload_0         
	//  120  253:iconst_2        
	//  121  254:putfield        #44  <Field int e>
			}
			int j = d.a(f);
	//  122  257:aload_0         
	//  123  258:getfield        #52  <Field bgc d>
	//  124  261:aload_0         
	//  125  262:getfield        #108 <Field int f>
	//  126  265:invokeinterface #111 <Method int bgc.a(int)>
	//  127  270:istore          4
			switch(j)
	//* 128  272:iload           4
			{
	//* 129  274:tableswitch     0 5: default 312
	//	               0 772
	//	               1 707
	//	               2 628
	//	               3 505
	//	               4 479
	//	               5 348
			default:
				bfo1 = ((bfo) (new StringBuilder(32)));
	//  130  312:new             #113 <Class StringBuilder>
	//  131  315:dup             
	//  132  316:bipush          32
	//  133  318:invokespecial   #115 <Method void StringBuilder(int)>
	//  134  321:astore_1        
				((StringBuilder) (bfo1)).append("Invalid element type ");
	//  135  322:aload_1         
	//  136  323:ldc1            #117 <String "Invalid element type ">
	//  137  325:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  138  328:pop             
				((StringBuilder) (bfo1)).append(j);
	//  139  329:aload_1         
	//  140  330:iload           4
	//  141  332:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//  142  335:pop             
				throw new bdj(((StringBuilder) (bfo1)).toString());
	//  143  336:new             #126 <Class bdj>
	//  144  339:dup             
	//  145  340:aload_1         
	//  146  341:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  147  344:invokespecial   #133 <Method void bdj(String)>
	//  148  347:athrow          

			case 5: // '\005'
				long l2 = g;
	//  149  348:aload_0         
	//  150  349:getfield        #110 <Field long g>
	//  151  352:lstore          7
				if(l2 != 4L && l2 != 8L)
	//* 152  354:lload           7
	//* 153  356:ldc2w           #134 <Long 4L>
	//* 154  359:lcmp            
	//* 155  360:ifeq            411
	//* 156  363:lload           7
	//* 157  365:ldc2w           #136 <Long 8L>
	//* 158  368:lcmp            
	//* 159  369:ifne            375
	//* 160  372:goto            411
				{
					bfo1 = ((bfo) (new StringBuilder(40)));
	//  161  375:new             #113 <Class StringBuilder>
	//  162  378:dup             
	//  163  379:bipush          40
	//  164  381:invokespecial   #115 <Method void StringBuilder(int)>
	//  165  384:astore_1        
					((StringBuilder) (bfo1)).append("Invalid float size: ");
	//  166  385:aload_1         
	//  167  386:ldc1            #139 <String "Invalid float size: ">
	//  168  388:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  169  391:pop             
					((StringBuilder) (bfo1)).append(l2);
	//  170  392:aload_1         
	//  171  393:lload           7
	//  172  395:invokevirtual   #142 <Method StringBuilder StringBuilder.append(long)>
	//  173  398:pop             
					throw new bdj(((StringBuilder) (bfo1)).toString());
	//  174  399:new             #126 <Class bdj>
	//  175  402:dup             
	//  176  403:aload_1         
	//  177  404:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  178  407:invokespecial   #133 <Method void bdj(String)>
	//  179  410:athrow          
				}
				bgc bgc1 = d;
	//  180  411:aload_0         
	//  181  412:getfield        #52  <Field bgc d>
	//  182  415:astore          11
				int k = f;
	//  183  417:aload_0         
	//  184  418:getfield        #108 <Field int f>
	//  185  421:istore          4
				int j1 = (int)g;
	//  186  423:aload_0         
	//  187  424:getfield        #110 <Field long g>
	//  188  427:l2i             
	//  189  428:istore          5
				l2 = a(bfo1, j1);
	//  190  430:aload_0         
	//  191  431:aload_1         
	//  192  432:iload           5
	//  193  434:invokespecial   #144 <Method long a(bfo, int)>
	//  194  437:lstore          7
				double d1;
				if(j1 == 4)
	//* 195  439:iload           5
	//* 196  441:iconst_4        
	//* 197  442:icmpne          456
					d1 = Float.intBitsToFloat((int)l2);
	//  198  445:lload           7
	//  199  447:l2i             
	//  200  448:invokestatic    #150 <Method float Float.intBitsToFloat(int)>
	//  201  451:f2d             
	//  202  452:dstore_2        
				else
	//* 203  453:goto            462
					d1 = Double.longBitsToDouble(l2);
	//  204  456:lload           7
	//  205  458:invokestatic    #156 <Method double Double.longBitsToDouble(long)>
	//  206  461:dstore_2        
				bgc1.a(k, d1);
	//  207  462:aload           11
	//  208  464:iload           4
	//  209  466:dload_2         
	//  210  467:invokeinterface #159 <Method void bgc.a(int, double)>
				e = 0;
	//  211  472:aload_0         
	//  212  473:iconst_0        
	//  213  474:putfield        #44  <Field int e>
				return true;
	//  214  477:iconst_1        
	//  215  478:ireturn         

			case 4: // '\004'
				d.a(f, (int)g, bfo1);
	//  216  479:aload_0         
	//  217  480:getfield        #52  <Field bgc d>
	//  218  483:aload_0         
	//  219  484:getfield        #108 <Field int f>
	//  220  487:aload_0         
	//  221  488:getfield        #110 <Field long g>
	//  222  491:l2i             
	//  223  492:aload_1         
	//  224  493:invokeinterface #162 <Method void bgc.a(int, int, bfo)>
				e = 0;
	//  225  498:aload_0         
	//  226  499:iconst_0        
	//  227  500:putfield        #44  <Field int e>
				return true;
	//  228  503:iconst_1        
	//  229  504:ireturn         

			case 3: // '\003'
				long l3 = g;
	//  230  505:aload_0         
	//  231  506:getfield        #110 <Field long g>
	//  232  509:lstore          7
				if(l3 <= 0x7fffffffL)
	//* 233  511:lload           7
	//* 234  513:ldc2w           #163 <Long 0x7fffffffL>
	//* 235  516:lcmp            
	//* 236  517:ifgt            592
				{
					bgc bgc2 = d;
	//  237  520:aload_0         
	//  238  521:getfield        #52  <Field bgc d>
	//  239  524:astore          11
					int l = f;
	//  240  526:aload_0         
	//  241  527:getfield        #108 <Field int f>
	//  242  530:istore          4
					int k1 = (int)l3;
	//  243  532:lload           7
	//  244  534:l2i             
	//  245  535:istore          5
					if(k1 == 0)
	//* 246  537:iload           5
	//* 247  539:ifne            548
					{
						bfo1 = "";
	//  248  542:ldc1            #166 <String "">
	//  249  544:astore_1        
					} else
	//* 250  545:goto            575
					{
						byte abyte0[] = new byte[k1];
	//  251  548:iload           5
	//  252  550:newarray        byte[]
	//  253  552:astore          12
						bfo1.b(abyte0, 0, k1);
	//  254  554:aload_1         
	//  255  555:aload           12
	//  256  557:iconst_0        
	//  257  558:iload           5
	//  258  560:invokeinterface #42  <Method void bfo.b(byte[], int, int)>
						bfo1 = ((bfo) (new String(abyte0)));
	//  259  565:new             #168 <Class String>
	//  260  568:dup             
	//  261  569:aload           12
	//  262  571:invokespecial   #171 <Method void String(byte[])>
	//  263  574:astore_1        
					}
					bgc2.a(l, ((String) (bfo1)));
	//  264  575:aload           11
	//  265  577:iload           4
	//  266  579:aload_1         
	//  267  580:invokeinterface #174 <Method void bgc.a(int, String)>
					e = 0;
	//  268  585:aload_0         
	//  269  586:iconst_0        
	//  270  587:putfield        #44  <Field int e>
					return true;
	//  271  590:iconst_1        
	//  272  591:ireturn         
				} else
				{
					bfo1 = ((bfo) (new StringBuilder(41)));
	//  273  592:new             #113 <Class StringBuilder>
	//  274  595:dup             
	//  275  596:bipush          41
	//  276  598:invokespecial   #115 <Method void StringBuilder(int)>
	//  277  601:astore_1        
					((StringBuilder) (bfo1)).append("String element size: ");
	//  278  602:aload_1         
	//  279  603:ldc1            #176 <String "String element size: ">
	//  280  605:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  281  608:pop             
					((StringBuilder) (bfo1)).append(l3);
	//  282  609:aload_1         
	//  283  610:lload           7
	//  284  612:invokevirtual   #142 <Method StringBuilder StringBuilder.append(long)>
	//  285  615:pop             
					throw new bdj(((StringBuilder) (bfo1)).toString());
	//  286  616:new             #126 <Class bdj>
	//  287  619:dup             
	//  288  620:aload_1         
	//  289  621:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  290  624:invokespecial   #133 <Method void bdj(String)>
	//  291  627:athrow          
				}

			case 2: // '\002'
				long l4 = g;
	//  292  628:aload_0         
	//  293  629:getfield        #110 <Field long g>
	//  294  632:lstore          7
				if(l4 <= 8L)
	//* 295  634:lload           7
	//* 296  636:ldc2w           #136 <Long 8L>
	//* 297  639:lcmp            
	//* 298  640:ifgt            671
				{
					d.a(f, a(bfo1, (int)l4));
	//  299  643:aload_0         
	//  300  644:getfield        #52  <Field bgc d>
	//  301  647:aload_0         
	//  302  648:getfield        #108 <Field int f>
	//  303  651:aload_0         
	//  304  652:aload_1         
	//  305  653:lload           7
	//  306  655:l2i             
	//  307  656:invokespecial   #144 <Method long a(bfo, int)>
	//  308  659:invokeinterface #179 <Method void bgc.a(int, long)>
					e = 0;
	//  309  664:aload_0         
	//  310  665:iconst_0        
	//  311  666:putfield        #44  <Field int e>
					return true;
	//  312  669:iconst_1        
	//  313  670:ireturn         
				} else
				{
					bfo1 = ((bfo) (new StringBuilder(42)));
	//  314  671:new             #113 <Class StringBuilder>
	//  315  674:dup             
	//  316  675:bipush          42
	//  317  677:invokespecial   #115 <Method void StringBuilder(int)>
	//  318  680:astore_1        
					((StringBuilder) (bfo1)).append("Invalid integer size: ");
	//  319  681:aload_1         
	//  320  682:ldc1            #181 <String "Invalid integer size: ">
	//  321  684:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  322  687:pop             
					((StringBuilder) (bfo1)).append(l4);
	//  323  688:aload_1         
	//  324  689:lload           7
	//  325  691:invokevirtual   #142 <Method StringBuilder StringBuilder.append(long)>
	//  326  694:pop             
					throw new bdj(((StringBuilder) (bfo1)).toString());
	//  327  695:new             #126 <Class bdj>
	//  328  698:dup             
	//  329  699:aload_1         
	//  330  700:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  331  703:invokespecial   #133 <Method void bdj(String)>
	//  332  706:athrow          
				}

			case 1: // '\001'
				long l5 = bfo1.b();
	//  333  707:aload_1         
	//  334  708:invokeinterface #65  <Method long bfo.b()>
	//  335  713:lstore          7
				long l7 = g;
	//  336  715:aload_0         
	//  337  716:getfield        #110 <Field long g>
	//  338  719:lstore          9
				b.add(((Object) (new bga(f, l7 + l5, ((bfz) (null))))));
	//  339  721:aload_0         
	//  340  722:getfield        #30  <Field Stack b>
	//  341  725:new             #71  <Class bga>
	//  342  728:dup             
	//  343  729:aload_0         
	//  344  730:getfield        #108 <Field int f>
	//  345  733:lload           9
	//  346  735:lload           7
	//  347  737:ladd            
	//  348  738:aconst_null     
	//  349  739:invokespecial   #184 <Method void bga(int, long, bfz)>
	//  350  742:invokevirtual   #188 <Method boolean Stack.add(Object)>
	//  351  745:pop             
				d.a(f, l5, g);
	//  352  746:aload_0         
	//  353  747:getfield        #52  <Field bgc d>
	//  354  750:aload_0         
	//  355  751:getfield        #108 <Field int f>
	//  356  754:lload           7
	//  357  756:aload_0         
	//  358  757:getfield        #110 <Field long g>
	//  359  760:invokeinterface #191 <Method void bgc.a(int, long, long)>
				e = 0;
	//  360  765:aload_0         
	//  361  766:iconst_0        
	//  362  767:putfield        #44  <Field int e>
				return true;
	//  363  770:iconst_1        
	//  364  771:ireturn         

			case 0: // '\0'
				bfo1.b((int)g);
	//  365  772:aload_1         
	//  366  773:aload_0         
	//  367  774:getfield        #110 <Field long g>
	//  368  777:l2i             
	//  369  778:invokeinterface #104 <Method void bfo.b(int)>
				e = 0;
	//  370  783:aload_0         
	//  371  784:iconst_0        
	//  372  785:putfield        #44  <Field int e>
				break;
			}
		} while(true);
	//* 373  788:goto            21
	}

	private final byte a[] = new byte[8];
	private final Stack b = new Stack();
	private final bgi c = new bgi();
	private bgc d;
	private int e;
	private int f;
	private long g;
}
