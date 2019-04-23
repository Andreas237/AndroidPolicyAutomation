// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			blz, blx, zzfs, bnw, 
//			bmc, bdn, bjo, bjm, 
//			bly, bmd

public final class blw extends blz
{

	public blw()
	{
		this(((bmd) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #19  <Method void blw(bmd)>
	//    3    5:return          
	}

	private blw(bmd bmd)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void blz()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field bmd b>
		c = new AtomicReference(((Object) (new blx())));
	//    5    9:aload_0         
	//    6   10:new             #25  <Class AtomicReference>
	//    7   13:dup             
	//    8   14:new             #27  <Class blx>
	//    9   17:dup             
	//   10   18:invokespecial   #28  <Method void blx()>
	//   11   21:invokespecial   #31  <Method void AtomicReference(Object)>
	//   12   24:putfield        #33  <Field AtomicReference c>
	//   13   27:return          
	}

	private static int a(int i, int j)
	{
		if(i == -1)
	//*   0    0:iload_0         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          14
			return j != -1 ? -1 : 0;
	//    3    5:iload_1         
	//    4    6:iconst_m1       
	//    5    7:icmpne          12
	//    6   10:iconst_0        
	//    7   11:ireturn         
	//    8   12:iconst_m1       
	//    9   13:ireturn         
		if(j == -1)
	//*  10   14:iload_1         
	//*  11   15:iconst_m1       
	//*  12   16:icmpne          21
			return 1;
	//   13   19:iconst_1        
	//   14   20:ireturn         
		else
			return i - j;
	//   15   21:iload_0         
	//   16   22:iload_1         
	//   17   23:isub            
	//   18   24:ireturn         
	}

	private static boolean a(zzfs zzfs1, String s)
	{
		return s != null && TextUtils.equals(((CharSequence) (s)), ((CharSequence) (bnw.b(zzfs1.s))));
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field String zzfs.s>
	//    5    9:invokestatic    #46  <Method String bnw.b(String)>
	//    6   12:invokestatic    #52  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private static boolean b(int i, boolean flag)
	{
		i &= 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iand            
	//    3    3:istore_0        
		return i == 3 || flag && i == 2;
	//    4    4:iload_0         
	//    5    5:iconst_3        
	//    6    6:icmpeq          23
	//    7    9:iload_1         
	//    8   10:ifeq            21
	//    9   13:iload_0         
	//   10   14:iconst_2        
	//   11   15:icmpne          21
	//   12   18:goto            23
	//   13   21:iconst_0        
	//   14   22:ireturn         
	//   15   23:iconst_1        
	//   16   24:ireturn         
	}

	protected final bmc[] a(bdn abdn[], bjo abjo[], int ai[][][])
	{
		int i;
		int j;
		int l4;
		int j5;
		bmc abmc[];
		blx blx1;
		int k1 = abdn.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          8
		abmc = new bmc[k1];
	//    3    4:iload           8
	//    4    6:anewarray       bmc[]
	//    5    9:astore          29
		blx1 = (blx)c.get();
	//    6   11:aload_0         
	//    7   12:getfield        #33  <Field AtomicReference c>
	//    8   15:invokevirtual   #60  <Method Object AtomicReference.get()>
	//    9   18:checkcast       #27  <Class blx>
	//   10   21:astore          31
		i = 0;
	//   11   23:iconst_0        
	//   12   24:istore          4
		j = 0;
	//   13   26:iconst_0        
	//   14   27:istore          5
		int k;
		for(; i < k1; i = k + 1)
	//*  15   29:iload           4
	//*  16   31:iload           8
	//*  17   33:icmpge          1136
		{
label0:
			{
label1:
				{
label2:
					{
						if(2 != abdn[i].a())
							break label0;
	//   18   36:iconst_2        
	//   19   37:aload_1         
	//   20   38:iload           4
	//   21   40:aaload          
	//   22   41:invokeinterface #65  <Method int bdn.a()>
	//   23   46:icmpne          1123
						if(j != 0)
							break label2;
	//   24   49:iload           5
	//   25   51:ifne            1099
						bjo bjo3 = abjo[i];
	//   26   54:aload_2         
	//   27   55:iload           4
	//   28   57:aaload          
	//   29   58:astore          33
						int ai4[][] = ai[i];
	//   30   60:aload_3         
	//   31   61:iload           4
	//   32   63:aaload          
	//   33   64:astore          36
						int k8 = blx1.e;
	//   34   66:aload           31
	//   35   68:getfield        #69  <Field int blx.e>
	//   36   71:istore          19
						int l8 = blx1.f;
	//   37   73:aload           31
	//   38   75:getfield        #72  <Field int blx.f>
	//   39   78:istore          20
						int i1 = blx1.g;
	//   40   80:aload           31
	//   41   82:getfield        #75  <Field int blx.g>
	//   42   85:istore          7
						k = blx1.j;
	//   43   87:aload           31
	//   44   89:getfield        #78  <Field int blx.j>
	//   45   92:istore          6
						j = blx1.k;
	//   46   94:aload           31
	//   47   96:getfield        #81  <Field int blx.k>
	//   48   99:istore          5
						boolean flag6 = blx1.l;
	//   49  101:aload           31
	//   50  103:getfield        #85  <Field boolean blx.l>
	//   51  106:istore          24
						boolean flag8 = blx1.h;
	//   52  108:aload           31
	//   53  110:getfield        #88  <Field boolean blx.h>
	//   54  113:istore          25
						boolean flag12 = blx1.i;
	//   55  115:aload           31
	//   56  117:getfield        #91  <Field boolean blx.i>
	//   57  120:istore          28
						int i5 = 0;
	//   58  122:iconst_0        
	//   59  123:istore          12
						int j7 = 0;
	//   60  125:iconst_0        
	//   61  126:istore          16
						Object obj = null;
	//   62  128:aconst_null     
	//   63  129:astore          30
						int k5 = 0;
	//   64  131:iconst_0        
	//   65  132:istore          13
						int k4 = -1;
	//   66  134:iconst_m1       
	//   67  135:istore          11
						int k3 = -1;
	//   68  137:iconst_m1       
	//   69  138:istore          10
						int k2 = i;
	//   70  140:iload           4
	//   71  142:istore          9
						bmc abmc1[] = abmc;
	//   72  144:aload           29
	//   73  146:astore          32
						while(j7 < bjo3.b) 
	//*  74  148:iload           16
	//*  75  150:aload           33
	//*  76  152:getfield        #95  <Field int bjo.b>
	//*  77  155:icmpge          1040
						{
							bjm bjm2;
							ArrayList arraylist;
label3:
							{
label4:
								{
									bjm2 = bjo3.a(j7);
	//   78  158:aload           33
	//   79  160:iload           16
	//   80  162:invokevirtual   #98  <Method bjm bjo.a(int)>
	//   81  165:astore          34
									arraylist = new ArrayList(bjm2.a);
	//   82  167:new             #100 <Class ArrayList>
	//   83  170:dup             
	//   84  171:aload           34
	//   85  173:getfield        #104 <Field int bjm.a>
	//   86  176:invokespecial   #107 <Method void ArrayList(int)>
	//   87  179:astore          37
									for(i = 0; i < bjm2.a; i++)
	//*  88  181:iconst_0        
	//*  89  182:istore          4
	//*  90  184:iload           4
	//*  91  186:aload           34
	//*  92  188:getfield        #104 <Field int bjm.a>
	//*  93  191:icmpge          214
										arraylist.add(((Object) (Integer.valueOf(i))));
	//   94  194:aload           37
	//   95  196:iload           4
	//   96  198:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//   97  201:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   98  204:pop             

	//   99  205:iload           4
	//  100  207:iconst_1        
	//  101  208:iadd            
	//  102  209:istore          4
	//* 103  211:goto            184
									int i6 = 0x7fffffff;
	//  104  214:ldc1            #118 <Int 0x7fffffff>
	//  105  216:istore          14
									if(k == 0x7fffffff || j == 0x7fffffff)
	//* 106  218:iload           6
	//* 107  220:ldc1            #118 <Int 0x7fffffff>
	//* 108  222:icmpeq          648
	//* 109  225:iload           5
	//* 110  227:ldc1            #118 <Int 0x7fffffff>
	//* 111  229:icmpne          235
										break label4;
	//  112  232:goto            648
									int l6 = 0;
	//  113  235:iconst_0        
	//  114  236:istore          15
									i = k;
	//  115  238:iload           6
	//  116  240:istore          4
									for(k = l6; k < bjm2.a;)
	//* 117  242:iload           15
	//* 118  244:istore          6
	//* 119  246:iload           6
	//* 120  248:aload           34
	//* 121  250:getfield        #104 <Field int bjm.a>
	//* 122  253:icmpge          510
									{
label5:
										{
label6:
											{
												int k7;
												int i8;
												int i9;
												zzfs zzfs1;
label7:
												{
													zzfs1 = bjm2.a(k);
	//  123  256:aload           34
	//  124  258:iload           6
	//  125  260:invokevirtual   #121 <Method zzfs bjm.a(int)>
	//  126  263:astore          35
													if(zzfs1.i <= 0 || zzfs1.j <= 0)
														break label6;
	//  127  265:aload           35
	//  128  267:getfield        #123 <Field int zzfs.i>
	//  129  270:ifle            493
	//  130  273:aload           35
	//  131  275:getfield        #124 <Field int zzfs.j>
	//  132  278:ifle            493
													i8 = zzfs1.i;
	//  133  281:aload           35
	//  134  283:getfield        #123 <Field int zzfs.i>
	//  135  286:istore          18
													i9 = zzfs1.j;
	//  136  288:aload           35
	//  137  290:getfield        #124 <Field int zzfs.j>
	//  138  293:istore          21
													if(flag6)
	//* 139  295:iload           24
	//* 140  297:ifeq            350
													{
														if(i8 > i9)
	//* 141  300:iload           18
	//* 142  302:iload           21
	//* 143  304:icmple          313
															l6 = 1;
	//  144  307:iconst_1        
	//  145  308:istore          15
														else
	//* 146  310:goto            316
															l6 = 0;
	//  147  313:iconst_0        
	//  148  314:istore          15
														if(i > j)
	//* 149  316:iload           4
	//* 150  318:iload           5
	//* 151  320:icmple          329
															k7 = 1;
	//  152  323:iconst_1        
	//  153  324:istore          17
														else
	//* 154  326:goto            332
															k7 = 0;
	//  155  329:iconst_0        
	//  156  330:istore          17
														if(l6 != k7)
	//* 157  332:iload           15
	//* 158  334:iload           17
	//* 159  336:icmpeq          350
														{
															l6 = i;
	//  160  339:iload           4
	//  161  341:istore          15
															k7 = j;
	//  162  343:iload           5
	//  163  345:istore          17
															break label7;
	//  164  347:goto            358
														}
													}
													k7 = i;
	//  165  350:iload           4
	//  166  352:istore          17
													l6 = j;
	//  167  354:iload           5
	//  168  356:istore          15
												}
												int j9 = i8 * l6;
	//  169  358:iload           18
	//  170  360:iload           15
	//  171  362:imul            
	//  172  363:istore          22
												int k9 = i9 * k7;
	//  173  365:iload           21
	//  174  367:iload           17
	//  175  369:imul            
	//  176  370:istore          23
												if(j9 >= k9)
	//* 177  372:iload           22
	//* 178  374:iload           23
	//* 179  376:icmplt          400
													abmc = ((bmc []) (new Point(k7, bnw.a(k9, i8))));
	//  180  379:new             #126 <Class Point>
	//  181  382:dup             
	//  182  383:iload           17
	//  183  385:iload           23
	//  184  387:iload           18
	//  185  389:invokestatic    #128 <Method int bnw.a(int, int)>
	//  186  392:invokespecial   #131 <Method void Point(int, int)>
	//  187  395:astore          29
												else
	//* 188  397:goto            418
													abmc = ((bmc []) (new Point(bnw.a(j9, i9), l6)));
	//  189  400:new             #126 <Class Point>
	//  190  403:dup             
	//  191  404:iload           22
	//  192  406:iload           21
	//  193  408:invokestatic    #128 <Method int bnw.a(int, int)>
	//  194  411:iload           15
	//  195  413:invokespecial   #131 <Method void Point(int, int)>
	//  196  416:astore          29
												k7 = zzfs1.i * zzfs1.j;
	//  197  418:aload           35
	//  198  420:getfield        #123 <Field int zzfs.i>
	//  199  423:aload           35
	//  200  425:getfield        #124 <Field int zzfs.j>
	//  201  428:imul            
	//  202  429:istore          17
												l6 = i6;
	//  203  431:iload           14
	//  204  433:istore          15
												if(zzfs1.i >= (int)((float)((Point) (abmc)).x * 0.98F))
	//* 205  435:aload           35
	//* 206  437:getfield        #123 <Field int zzfs.i>
	//* 207  440:aload           29
	//* 208  442:getfield        #134 <Field int Point.x>
	//* 209  445:i2f             
	//* 210  446:ldc1            #135 <Float 0.98F>
	//* 211  448:fmul            
	//* 212  449:f2i             
	//* 213  450:icmplt          497
												{
													l6 = i6;
	//  214  453:iload           14
	//  215  455:istore          15
													if(zzfs1.j >= (int)((float)((Point) (abmc)).y * 0.98F))
	//* 216  457:aload           35
	//* 217  459:getfield        #124 <Field int zzfs.j>
	//* 218  462:aload           29
	//* 219  464:getfield        #138 <Field int Point.y>
	//* 220  467:i2f             
	//* 221  468:ldc1            #135 <Float 0.98F>
	//* 222  470:fmul            
	//* 223  471:f2i             
	//* 224  472:icmplt          497
													{
														l6 = i6;
	//  225  475:iload           14
	//  226  477:istore          15
														if(k7 < i6)
	//* 227  479:iload           17
	//* 228  481:iload           14
	//* 229  483:icmpge          497
															l6 = k7;
	//  230  486:iload           17
	//  231  488:istore          15
													}
												}
												break label5;
	//  232  490:goto            497
											}
											l6 = i6;
	//  233  493:iload           14
	//  234  495:istore          15
										}
										k++;
	//  235  497:iload           6
	//  236  499:iconst_1        
	//  237  500:iadd            
	//  238  501:istore          6
										i6 = l6;
	//  239  503:iload           15
	//  240  505:istore          14
									}

	//* 241  507:goto            246
									boolean flag9 = flag6;
	//  242  510:iload           24
	//  243  512:istore          26
									l6 = j;
	//  244  514:iload           5
	//  245  516:istore          15
									boolean flag11 = flag8;
	//  246  518:iload           25
	//  247  520:istore          27
									int l7 = i;
	//  248  522:iload           4
	//  249  524:istore          17
									abmc = ((bmc []) (obj));
	//  250  526:aload           30
	//  251  528:astore          29
									flag8 = flag11;
	//  252  530:iload           27
	//  253  532:istore          25
									flag6 = flag9;
	//  254  534:iload           26
	//  255  536:istore          24
									j = l6;
	//  256  538:iload           15
	//  257  540:istore          5
									i = l7;
	//  258  542:iload           17
	//  259  544:istore          4
									k = i1;
	//  260  546:iload           7
	//  261  548:istore          6
									if(i6 != 0x7fffffff)
	//* 262  550:iload           14
	//* 263  552:ldc1            #118 <Int 0x7fffffff>
	//* 264  554:icmpeq          660
									{
										int j8 = arraylist.size() - 1;
	//  265  557:aload           37
	//  266  559:invokevirtual   #141 <Method int ArrayList.size()>
	//  267  562:iconst_1        
	//  268  563:isub            
	//  269  564:istore          18
										do
										{
											abmc = ((bmc []) (obj));
	//  270  566:aload           30
	//  271  568:astore          29
											flag8 = flag11;
	//  272  570:iload           27
	//  273  572:istore          25
											flag6 = flag9;
	//  274  574:iload           26
	//  275  576:istore          24
											j = l6;
	//  276  578:iload           15
	//  277  580:istore          5
											i = l7;
	//  278  582:iload           17
	//  279  584:istore          4
											k = i1;
	//  280  586:iload           7
	//  281  588:istore          6
											if(j8 < 0)
												break;
	//  282  590:iload           18
	//  283  592:iflt            660
											i = bjm2.a(((Integer)arraylist.get(j8)).intValue()).a();
	//  284  595:aload           34
	//  285  597:aload           37
	//  286  599:iload           18
	//  287  601:invokevirtual   #144 <Method Object ArrayList.get(int)>
	//  288  604:checkcast       #109 <Class Integer>
	//  289  607:invokevirtual   #147 <Method int Integer.intValue()>
	//  290  610:invokevirtual   #121 <Method zzfs bjm.a(int)>
	//  291  613:invokevirtual   #148 <Method int zzfs.a()>
	//  292  616:istore          4
											if(i == -1 || i > i6)
	//* 293  618:iload           4
	//* 294  620:iconst_m1       
	//* 295  621:icmpeq          631
	//* 296  624:iload           4
	//* 297  626:iload           14
	//* 298  628:icmple          639
												arraylist.remove(j8);
	//  299  631:aload           37
	//  300  633:iload           18
	//  301  635:invokevirtual   #151 <Method Object ArrayList.remove(int)>
	//  302  638:pop             
											j8--;
	//  303  639:iload           18
	//  304  641:iconst_1        
	//  305  642:isub            
	//  306  643:istore          18
										} while(true);
	//  307  645:goto            566
									}
									break label3;
								}
								abmc = ((bmc []) (obj));
	//  308  648:aload           30
	//  309  650:astore          29
								i = k;
	//  310  652:iload           6
	//  311  654:istore          4
								k = i1;
	//  312  656:iload           7
	//  313  658:istore          6
							}
							int ai2[] = ai4[j7];
	//  314  660:aload           36
	//  315  662:iload           16
	//  316  664:aaload          
	//  317  665:astore          35
							i1 = k4;
	//  318  667:iload           11
	//  319  669:istore          7
							int j6 = 0;
	//  320  671:iconst_0        
	//  321  672:istore          14
							k4 = i5;
	//  322  674:iload           12
	//  323  676:istore          11
							i5 = k3;
	//  324  678:iload           10
	//  325  680:istore          12
							k3 = j6;
	//  326  682:iload           14
	//  327  684:istore          10
							obj = ((Object) (bjm2));
	//  328  686:aload           34
	//  329  688:astore          30
							int ai1[] = ai2;
	//  330  690:aload           35
	//  331  692:astore          34
							for(; k3 < ((bjm) (obj)).a; k3++)
	//* 332  694:iload           10
	//* 333  696:aload           30
	//* 334  698:getfield        #104 <Field int bjm.a>
	//* 335  701:icmpge          1003
							{
								if(!b(ai1[k3], flag12))
									continue;
	//  336  704:aload           34
	//  337  706:iload           10
	//  338  708:iaload          
	//  339  709:iload           28
	//  340  711:invokestatic    #153 <Method boolean b(int, boolean)>
	//  341  714:ifeq            994
								zzfs zzfs2 = ((bjm) (obj)).a(k3);
	//  342  717:aload           30
	//  343  719:iload           10
	//  344  721:invokevirtual   #121 <Method zzfs bjm.a(int)>
	//  345  724:astore          35
								boolean flag5;
								if(((List) (arraylist)).contains(((Object) (Integer.valueOf(k3)))) && (zzfs2.i == -1 || zzfs2.i <= k8) && (zzfs2.j == -1 || zzfs2.j <= l8) && (zzfs2.b == -1 || zzfs2.b <= k))
	//* 346  726:aload           37
	//* 347  728:iload           10
	//* 348  730:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//* 349  733:invokeinterface #158 <Method boolean List.contains(Object)>
	//* 350  738:ifeq            807
	//* 351  741:aload           35
	//* 352  743:getfield        #123 <Field int zzfs.i>
	//* 353  746:iconst_m1       
	//* 354  747:icmpeq          760
	//* 355  750:aload           35
	//* 356  752:getfield        #123 <Field int zzfs.i>
	//* 357  755:iload           19
	//* 358  757:icmpgt          807
	//* 359  760:aload           35
	//* 360  762:getfield        #124 <Field int zzfs.j>
	//* 361  765:iconst_m1       
	//* 362  766:icmpeq          779
	//* 363  769:aload           35
	//* 364  771:getfield        #124 <Field int zzfs.j>
	//* 365  774:iload           20
	//* 366  776:icmpgt          807
	//* 367  779:aload           35
	//* 368  781:getfield        #159 <Field int zzfs.b>
	//* 369  784:iconst_m1       
	//* 370  785:icmpeq          801
	//* 371  788:aload           35
	//* 372  790:getfield        #159 <Field int zzfs.b>
	//* 373  793:iload           6
	//* 374  795:icmpgt          807
	//* 375  798:goto            801
									flag5 = true;
	//  376  801:iconst_1        
	//  377  802:istore          17
								else
	//* 378  804:goto            810
									flag5 = false;
	//  379  807:iconst_0        
	//  380  808:istore          17
								if(!flag5 && !flag8)
	//* 381  810:iload           17
	//* 382  812:ifne            826
	//* 383  815:iload           25
	//* 384  817:ifeq            823
									continue;
	//  385  820:goto            826
	//* 386  823:goto            994
								int i7;
								if(flag5)
	//* 387  826:iload           17
	//* 388  828:ifeq            837
									i7 = 2;
	//  389  831:iconst_2        
	//  390  832:istore          15
								else
	//* 391  834:goto            840
									i7 = 1;
	//  392  837:iconst_1        
	//  393  838:istore          15
								boolean flag10 = b(ai1[k3], false);
	//  394  840:aload           34
	//  395  842:iload           10
	//  396  844:iaload          
	//  397  845:iconst_0        
	//  398  846:invokestatic    #153 <Method boolean b(int, boolean)>
	//  399  849:istore          26
								j6 = i7;
	//  400  851:iload           15
	//  401  853:istore          14
								if(flag10)
	//* 402  855:iload           26
	//* 403  857:ifeq            868
									j6 = i7 + 1000;
	//  404  860:iload           15
	//  405  862:sipush          1000
	//  406  865:iadd            
	//  407  866:istore          14
								if(j6 > k5)
	//* 408  868:iload           14
	//* 409  870:iload           13
	//* 410  872:icmple          881
									i7 = 1;
	//  411  875:iconst_1        
	//  412  876:istore          15
								else
	//* 413  878:goto            884
									i7 = 0;
	//  414  881:iconst_0        
	//  415  882:istore          15
								if(j6 == k5)
	//* 416  884:iload           14
	//* 417  886:iload           13
	//* 418  888:icmpne          960
								{
									if(zzfs2.a() != i1)
	//* 419  891:aload           35
	//* 420  893:invokevirtual   #148 <Method int zzfs.a()>
	//* 421  896:iload           7
	//* 422  898:icmpeq          916
										i7 = a(zzfs2.a(), i1);
	//  423  901:aload           35
	//  424  903:invokevirtual   #148 <Method int zzfs.a()>
	//  425  906:iload           7
	//  426  908:invokestatic    #160 <Method int a(int, int)>
	//  427  911:istore          15
									else
	//* 428  913:goto            928
										i7 = a(zzfs2.b, i5);
	//  429  916:aload           35
	//  430  918:getfield        #159 <Field int zzfs.b>
	//  431  921:iload           12
	//  432  923:invokestatic    #160 <Method int a(int, int)>
	//  433  926:istore          15
									if(!flag10 || !flag5 ? i7 < 0 : i7 > 0)
	//* 434  928:iload           26
	//* 435  930:ifeq            946
	//* 436  933:iload           17
	//* 437  935:ifeq            946
	//* 438  938:iload           15
	//* 439  940:ifle            957
	//* 440  943:goto            951
	//* 441  946:iload           15
	//* 442  948:ifge            957
										i7 = 1;
	//  443  951:iconst_1        
	//  444  952:istore          15
									else
	//* 445  954:goto            960
										i7 = 0;
	//  446  957:iconst_0        
	//  447  958:istore          15
								}
								if(i7 != 0)
	//* 448  960:iload           15
	//* 449  962:ifeq            994
								{
									i5 = zzfs2.b;
	//  450  965:aload           35
	//  451  967:getfield        #159 <Field int zzfs.b>
	//  452  970:istore          12
									i1 = zzfs2.a();
	//  453  972:aload           35
	//  454  974:invokevirtual   #148 <Method int zzfs.a()>
	//  455  977:istore          7
									k5 = j6;
	//  456  979:iload           14
	//  457  981:istore          13
									k4 = k3;
	//  458  983:iload           10
	//  459  985:istore          11
									abmc = ((bmc []) (obj));
	//  460  987:aload           30
	//  461  989:astore          29
								}
							}

	//  462  991:goto            994
	//  463  994:iload           10
	//  464  996:iconst_1        
	//  465  997:iadd            
	//  466  998:istore          10
	//* 467 1000:goto            694
							j6 = k;
	//  468 1003:iload           6
	//  469 1005:istore          14
							j7++;
	//  470 1007:iload           16
	//  471 1009:iconst_1        
	//  472 1010:iadd            
	//  473 1011:istore          16
							k3 = i5;
	//  474 1013:iload           12
	//  475 1015:istore          10
							i5 = k4;
	//  476 1017:iload           11
	//  477 1019:istore          12
							k4 = i1;
	//  478 1021:iload           7
	//  479 1023:istore          11
							obj = ((Object) (abmc));
	//  480 1025:aload           29
	//  481 1027:astore          30
							k = i;
	//  482 1029:iload           4
	//  483 1031:istore          6
							i1 = j6;
	//  484 1033:iload           14
	//  485 1035:istore          7
						}
	//* 486 1037:goto            148
						abmc = abmc1;
	//  487 1040:aload           32
	//  488 1042:astore          29
						k = k2;
	//  489 1044:iload           9
	//  490 1046:istore          6
						if(obj == null)
	//* 491 1048:aload           30
	//* 492 1050:ifnonnull       1059
							obj = null;
	//  493 1053:aconst_null     
	//  494 1054:astore          30
						else
	//* 495 1056:goto            1072
							obj = ((Object) (new bly(((bjm) (obj)), i5)));
	//  496 1059:new             #162 <Class bly>
	//  497 1062:dup             
	//  498 1063:aload           30
	//  499 1065:iload           12
	//  500 1067:invokespecial   #165 <Method void bly(bjm, int)>
	//  501 1070:astore          30
						abmc[k] = ((/*<invalid signature>*/java.lang.Object) (obj));
	//  502 1072:aload           29
	//  503 1074:iload           6
	//  504 1076:aload           30
	//  505 1078:aastore         
						if(abmc[k] != null)
	//* 506 1079:aload           29
	//* 507 1081:iload           6
	//* 508 1083:aaload          
	//* 509 1084:ifnull          1093
							i = 1;
	//  510 1087:iconst_1        
	//  511 1088:istore          4
						else
	//* 512 1090:goto            1107
							i = 0;
	//  513 1093:iconst_0        
	//  514 1094:istore          4
						break label1;
	//  515 1096:goto            1107
					}
					k = i;
	//  516 1099:iload           4
	//  517 1101:istore          6
					i = j;
	//  518 1103:iload           5
	//  519 1105:istore          4
				}
				j = abjo[k].b;
	//  520 1107:aload_2         
	//  521 1108:iload           6
	//  522 1110:aaload          
	//  523 1111:getfield        #95  <Field int bjo.b>
	//  524 1114:istore          5
				j = i;
	//  525 1116:iload           4
	//  526 1118:istore          5
				continue;
	//  527 1120:goto            1127
			}
			k = i;
	//  528 1123:iload           4
	//  529 1125:istore          6
		}

	//  530 1127:iload           6
	//  531 1129:iconst_1        
	//  532 1130:iadd            
	//  533 1131:istore          4
	//* 534 1133:goto            29
		i = k1;
	//  535 1136:iload           8
	//  536 1138:istore          4
		l4 = 0;
	//  537 1140:iconst_0        
	//  538 1141:istore          11
		j = 0;
	//  539 1143:iconst_0        
	//  540 1144:istore          5
		j5 = 0;
	//  541 1146:iconst_0        
	//  542 1147:istore          12
_L11:
		if(l4 >= i)
			break; /* Loop/switch isn't completed */
	//  543 1149:iload           11
	//  544 1151:iload           4
	//  545 1153:icmpge          2214
		abdn[l4].a();
	//  546 1156:aload_1         
	//  547 1157:iload           11
	//  548 1159:aaload          
	//  549 1160:invokeinterface #65  <Method int bdn.a()>
		JVM INSTR tableswitch 1 3: default 1192
	//	               1 1652
	//	               2 1649
	//	               3 1236;
	//  550 1165:tableswitch     1 3: default 1192
	//	               1 1652
	//	               2 1649
	//	               3 1236
		   goto _L1 _L2 _L3 _L4
_L3:
		break; /* Loop/switch isn't completed */
	//* 551 1192:aload_1         
	//* 552 1193:iload           11
	//* 553 1195:aaload          
	//* 554 1196:invokeinterface #65  <Method int bdn.a()>
	//* 555 1201:pop             
	//* 556 1202:aload_2         
	//* 557 1203:iload           11
	//* 558 1205:aaload          
	//* 559 1206:astore          33
	//* 560 1208:aload_3         
	//* 561 1209:iload           11
	//* 562 1211:aaload          
	//* 563 1212:astore          34
	//* 564 1214:aload           31
	//* 565 1216:getfield        #91  <Field boolean blx.i>
	//* 566 1219:istore          24
	//* 567 1221:aconst_null     
	//* 568 1222:astore          30
	//* 569 1224:iconst_0        
	//* 570 1225:istore          13
	//* 571 1227:iconst_0        
	//* 572 1228:istore          6
	//* 573 1230:iconst_0        
	//* 574 1231:istore          7
	//* 575 1233:goto            1988
_L4:
		if(j5 != 0)
			break; /* Loop/switch isn't completed */
	//  576 1236:iload           12
	//  577 1238:ifne            1646
		bjo1 = abjo[l4];
	//  578 1241:aload_2         
	//  579 1242:iload           11
	//  580 1244:aaload          
	//  581 1245:astore          32
		ai3 = ai[l4];
	//  582 1247:aload_3         
	//  583 1248:iload           11
	//  584 1250:aaload          
	//  585 1251:astore          35
		flag7 = blx1.i;
	//  586 1253:aload           31
	//  587 1255:getfield        #91  <Field boolean blx.i>
	//  588 1258:istore          24
		l3 = 0;
	//  589 1260:iconst_0        
	//  590 1261:istore          10
		obj1 = null;
	//  591 1263:aconst_null     
	//  592 1264:astore          30
		l = 0;
	//  593 1266:iconst_0        
	//  594 1267:istore          6
		j1 = 0;
	//  595 1269:iconst_0        
	//  596 1270:istore          7
_L9:
		if(l3 >= bjo1.b)
			break; /* Loop/switch isn't completed */
	//  597 1272:iload           10
	//  598 1274:aload           32
	//  599 1276:getfield        #95  <Field int bjo.b>
	//  600 1279:icmpge          1583
		obj3 = ((Object) (bjo1.a(l3)));
	//  601 1282:aload           32
	//  602 1284:iload           10
	//  603 1286:invokevirtual   #98  <Method bjm bjo.a(int)>
	//  604 1289:astore          34
		ai5 = ai3[l3];
	//  605 1291:aload           35
	//  606 1293:iload           10
	//  607 1295:aaload          
	//  608 1296:astore          36
		l1 = l;
	//  609 1298:iload           6
	//  610 1300:istore          8
		boolean flag = false;
	//  611 1302:iconst_0        
	//  612 1303:istore          9
		l = j1;
	//  613 1305:iload           7
	//  614 1307:istore          6
		j1 = ((int) (flag));
	//  615 1309:iload           9
	//  616 1311:istore          7
		j5 = i;
	//  617 1313:iload           4
	//  618 1315:istore          12
_L7:
		if(j1 >= ((bjm) (obj3)).a) goto _L6; else goto _L5
	//  619 1317:iload           7
	//  620 1319:aload           34
	//  621 1321:getfield        #104 <Field int bjm.a>
	//  622 1324:icmpge          1562
_L5:
		if(b(ai5[j1], flag7))
	//* 623 1327:aload           36
	//* 624 1329:iload           7
	//* 625 1331:iaload          
	//* 626 1332:iload           24
	//* 627 1334:invokestatic    #153 <Method boolean b(int, boolean)>
	//* 628 1337:ifeq            1529
		{
			zzfs zzfs4 = ((bjm) (obj3)).a(j1);
	//  629 1340:aload           34
	//  630 1342:iload           7
	//  631 1344:invokevirtual   #121 <Method zzfs bjm.a(int)>
	//  632 1347:astore          37
			if((zzfs4.r & 1) != 0)
	//* 633 1349:aload           37
	//* 634 1351:getfield        #168 <Field int zzfs.r>
	//* 635 1354:iconst_1        
	//* 636 1355:iand            
	//* 637 1356:ifeq            1365
				i = 1;
	//  638 1359:iconst_1        
	//  639 1360:istore          4
			else
	//* 640 1362:goto            1368
				i = 0;
	//  641 1365:iconst_0        
	//  642 1366:istore          4
			boolean flag1;
			if((zzfs4.r & 2) != 0)
	//* 643 1368:aload           37
	//* 644 1370:getfield        #168 <Field int zzfs.r>
	//* 645 1373:iconst_2        
	//* 646 1374:iand            
	//* 647 1375:ifeq            1384
				flag1 = true;
	//  648 1378:iconst_1        
	//  649 1379:istore          9
			else
	//* 650 1381:goto            1387
				flag1 = false;
	//  651 1384:iconst_0        
	//  652 1385:istore          9
			if(a(zzfs4, ((String) (null))))
	//* 653 1387:aload           37
	//* 654 1389:aconst_null     
	//* 655 1390:invokestatic    #170 <Method boolean a(zzfs, String)>
	//* 656 1393:ifeq            1425
			{
				if(i != 0)
	//* 657 1396:iload           4
	//* 658 1398:ifeq            1408
					i = 6;
	//  659 1401:bipush          6
	//  660 1403:istore          4
				else
	//* 661 1405:goto            1471
				if(!flag1)
	//* 662 1408:iload           9
	//* 663 1410:ifne            1419
					i = 5;
	//  664 1413:iconst_5        
	//  665 1414:istore          4
				else
	//* 666 1416:goto            1471
					i = 4;
	//  667 1419:iconst_4        
	//  668 1420:istore          4
			} else
	//* 669 1422:goto            1471
			if(i != 0)
	//* 670 1425:iload           4
	//* 671 1427:ifeq            1436
			{
				i = 3;
	//  672 1430:iconst_3        
	//  673 1431:istore          4
			} else
	//* 674 1433:goto            1471
			{
				obj2 = obj1;
	//  675 1436:aload           30
	//  676 1438:astore          33
				i = l1;
	//  677 1440:iload           8
	//  678 1442:istore          4
				l5 = l;
	//  679 1444:iload           6
	//  680 1446:istore          13
				if(!flag1)
					break MISSING_BLOCK_LABEL_1541;
	//  681 1448:iload           9
	//  682 1450:ifeq            1541
				if(a(zzfs4, ((String) (null))))
	//* 683 1453:aload           37
	//* 684 1455:aconst_null     
	//* 685 1456:invokestatic    #170 <Method boolean a(zzfs, String)>
	//* 686 1459:ifeq            1468
					i = 2;
	//  687 1462:iconst_2        
	//  688 1463:istore          4
				else
	//* 689 1465:goto            1471
					i = 1;
	//  690 1468:iconst_1        
	//  691 1469:istore          4
			}
			int l2 = i;
	//  692 1471:iload           4
	//  693 1473:istore          9
			if(b(ai5[j1], false))
	//* 694 1475:aload           36
	//* 695 1477:iload           7
	//* 696 1479:iaload          
	//* 697 1480:iconst_0        
	//* 698 1481:invokestatic    #153 <Method boolean b(int, boolean)>
	//* 699 1484:ifeq            1495
				l2 = i + 1000;
	//  700 1487:iload           4
	//  701 1489:sipush          1000
	//  702 1492:iadd            
	//  703 1493:istore          9
			obj2 = obj1;
	//  704 1495:aload           30
	//  705 1497:astore          33
			i = l1;
	//  706 1499:iload           8
	//  707 1501:istore          4
			l5 = l;
	//  708 1503:iload           6
	//  709 1505:istore          13
			if(l2 > l)
	//* 710 1507:iload           9
	//* 711 1509:iload           6
	//* 712 1511:icmple          1541
			{
				i = j1;
	//  713 1514:iload           7
	//  714 1516:istore          4
				obj2 = obj3;
	//  715 1518:aload           34
	//  716 1520:astore          33
				l5 = l2;
	//  717 1522:iload           9
	//  718 1524:istore          13
			}
		} else
	//* 719 1526:goto            1541
		{
			l5 = l;
	//  720 1529:iload           6
	//  721 1531:istore          13
			i = l1;
	//  722 1533:iload           8
	//  723 1535:istore          4
			obj2 = obj1;
	//  724 1537:aload           30
	//  725 1539:astore          33
		}
		j1++;
	//  726 1541:iload           7
	//  727 1543:iconst_1        
	//  728 1544:iadd            
	//  729 1545:istore          7
		obj1 = obj2;
	//  730 1547:aload           33
	//  731 1549:astore          30
		l1 = i;
	//  732 1551:iload           4
	//  733 1553:istore          8
		l = l5;
	//  734 1555:iload           13
	//  735 1557:istore          6
		  goto _L7
	//* 736 1559:goto            1317
_L6:
		l3++;
	//  737 1562:iload           10
	//  738 1564:iconst_1        
	//  739 1565:iadd            
	//  740 1566:istore          10
		j1 = l;
	//  741 1568:iload           6
	//  742 1570:istore          7
		i = j5;
	//  743 1572:iload           12
	//  744 1574:istore          4
		l = l1;
	//  745 1576:iload           8
	//  746 1578:istore          6
		if(true) goto _L9; else goto _L8
	//  747 1580:goto            1272
_L8:
		j1 = i;
	//  748 1583:iload           4
	//  749 1585:istore          7
		if(obj1 == null)
	//* 750 1587:aload           30
	//* 751 1589:ifnonnull       1598
			obj1 = null;
	//  752 1592:aconst_null     
	//  753 1593:astore          30
		else
	//* 754 1595:goto            1611
			obj1 = ((Object) (new bly(((bjm) (obj1)), l)));
	//  755 1598:new             #162 <Class bly>
	//  756 1601:dup             
	//  757 1602:aload           30
	//  758 1604:iload           6
	//  759 1606:invokespecial   #165 <Method void bly(bjm, int)>
	//  760 1609:astore          30
		abmc[l4] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	//  761 1611:aload           29
	//  762 1613:iload           11
	//  763 1615:aload           30
	//  764 1617:aastore         
		if(abmc[l4] != null)
	//* 765 1618:aload           29
	//* 766 1620:iload           11
	//* 767 1622:aaload          
	//* 768 1623:ifnull          1632
			i = 1;
	//  769 1626:iconst_1        
	//  770 1627:istore          4
		else
	//* 771 1629:goto            1635
			i = 0;
	//  772 1632:iconst_0        
	//  773 1633:istore          4
		j5 = i;
	//  774 1635:iload           4
	//  775 1637:istore          12
		i = j1;
	//  776 1639:iload           7
	//  777 1641:istore          4
		break; /* Loop/switch isn't completed */
	//  778 1643:goto            2205
	//* 779 1646:goto            2205
	//* 780 1649:goto            2205
_L2:
		l5 = i;
	//  781 1652:iload           4
	//  782 1654:istore          13
		if(j == 0)
	//* 783 1656:iload           5
	//* 784 1658:ifne            1985
		{
			bjo bjo2 = abjo[l4];
	//  785 1661:aload_2         
	//  786 1662:iload           11
	//  787 1664:aaload          
	//  788 1665:astore          32
			obj1 = ((Object) (ai[l4]));
	//  789 1667:aload_3         
	//  790 1668:iload           11
	//  791 1670:aaload          
	//  792 1671:astore          30
			flag7 = blx1.i;
	//  793 1673:aload           31
	//  794 1675:getfield        #91  <Field boolean blx.i>
	//  795 1678:istore          24
			j = 0;
	//  796 1680:iconst_0        
	//  797 1681:istore          5
			i = -1;
	//  798 1683:iconst_m1       
	//  799 1684:istore          4
			l = -1;
	//  800 1686:iconst_m1       
	//  801 1687:istore          6
			j1 = 0;
	//  802 1689:iconst_0        
	//  803 1690:istore          7
			while(j < bjo2.b) 
	//* 804 1692:iload           5
	//* 805 1694:aload           32
	//* 806 1696:getfield        #95  <Field int bjo.b>
	//* 807 1699:icmpge          1920
			{
				obj2 = ((Object) (bjo2.a(j)));
	//  808 1702:aload           32
	//  809 1704:iload           5
	//  810 1706:invokevirtual   #98  <Method bjm bjo.a(int)>
	//  811 1709:astore          33
				obj3 = ((Object) (obj1[j]));
	//  812 1711:aload           30
	//  813 1713:iload           5
	//  814 1715:aaload          
	//  815 1716:astore          34
				int i2 = l;
	//  816 1718:iload           6
	//  817 1720:istore          8
				boolean flag4 = false;
	//  818 1722:iconst_0        
	//  819 1723:istore          10
				l = j1;
	//  820 1725:iload           7
	//  821 1727:istore          6
				int i3 = i;
	//  822 1729:iload           4
	//  823 1731:istore          9
				for(j1 = ((int) (flag4)); j1 < ((bjm) (obj2)).a;)
	//* 824 1733:iload           10
	//* 825 1735:istore          7
	//* 826 1737:iload           7
	//* 827 1739:aload           33
	//* 828 1741:getfield        #104 <Field int bjm.a>
	//* 829 1744:icmpge          1899
				{
					if(b(obj3[j1], flag7))
	//* 830 1747:aload           34
	//* 831 1749:iload           7
	//* 832 1751:iaload          
	//* 833 1752:iload           24
	//* 834 1754:invokestatic    #153 <Method boolean b(int, boolean)>
	//* 835 1757:ifeq            1882
					{
						zzfs zzfs3 = ((bjm) (obj2)).a(j1);
	//  836 1760:aload           33
	//  837 1762:iload           7
	//  838 1764:invokevirtual   #121 <Method zzfs bjm.a(int)>
	//  839 1767:astore          35
						int k6 = obj3[j1];
	//  840 1769:aload           34
	//  841 1771:iload           7
	//  842 1773:iaload          
	//  843 1774:istore          14
						if((zzfs3.r & 1) != 0)
	//* 844 1776:aload           35
	//* 845 1778:getfield        #168 <Field int zzfs.r>
	//* 846 1781:iconst_1        
	//* 847 1782:iand            
	//* 848 1783:ifeq            1792
							i = 1;
	//  849 1786:iconst_1        
	//  850 1787:istore          4
						else
	//* 851 1789:goto            1795
							i = 0;
	//  852 1792:iconst_0        
	//  853 1793:istore          4
						if(a(zzfs3, ((String) (null))))
	//* 854 1795:aload           35
	//* 855 1797:aconst_null     
	//* 856 1798:invokestatic    #170 <Method boolean a(zzfs, String)>
	//* 857 1801:ifeq            1821
						{
							if(i != 0)
	//* 858 1804:iload           4
	//* 859 1806:ifeq            1815
								i = 4;
	//  860 1809:iconst_4        
	//  861 1810:istore          4
							else
	//* 862 1812:goto            1835
								i = 3;
	//  863 1815:iconst_3        
	//  864 1816:istore          4
						} else
	//* 865 1818:goto            1835
						if(i != 0)
	//* 866 1821:iload           4
	//* 867 1823:ifeq            1832
							i = 2;
	//  868 1826:iconst_2        
	//  869 1827:istore          4
						else
	//* 870 1829:goto            1835
							i = 1;
	//  871 1832:iconst_1        
	//  872 1833:istore          4
						int i4 = i;
	//  873 1835:iload           4
	//  874 1837:istore          10
						if(b(k6, false))
	//* 875 1839:iload           14
	//* 876 1841:iconst_0        
	//* 877 1842:invokestatic    #153 <Method boolean b(int, boolean)>
	//* 878 1845:ifeq            1856
							i4 = i + 1000;
	//  879 1848:iload           4
	//  880 1850:sipush          1000
	//  881 1853:iadd            
	//  882 1854:istore          10
						i = l;
	//  883 1856:iload           6
	//  884 1858:istore          4
						if(i4 > l)
	//* 885 1860:iload           10
	//* 886 1862:iload           6
	//* 887 1864:icmple          1886
						{
							i3 = j;
	//  888 1867:iload           5
	//  889 1869:istore          9
							i2 = j1;
	//  890 1871:iload           7
	//  891 1873:istore          8
							i = i4;
	//  892 1875:iload           10
	//  893 1877:istore          4
						}
					} else
	//* 894 1879:goto            1886
					{
						i = l;
	//  895 1882:iload           6
	//  896 1884:istore          4
					}
					j1++;
	//  897 1886:iload           7
	//  898 1888:iconst_1        
	//  899 1889:iadd            
	//  900 1890:istore          7
					l = i;
	//  901 1892:iload           4
	//  902 1894:istore          6
				}

	//* 903 1896:goto            1737
				j++;
	//  904 1899:iload           5
	//  905 1901:iconst_1        
	//  906 1902:iadd            
	//  907 1903:istore          5
				i = i3;
	//  908 1905:iload           9
	//  909 1907:istore          4
				j1 = l;
	//  910 1909:iload           6
	//  911 1911:istore          7
				l = i2;
	//  912 1913:iload           8
	//  913 1915:istore          6
			}
	//* 914 1917:goto            1692
			if(i == -1)
	//* 915 1920:iload           4
	//* 916 1922:iconst_m1       
	//* 917 1923:icmpne          1932
				obj1 = null;
	//  918 1926:aconst_null     
	//  919 1927:astore          30
			else
	//* 920 1929:goto            1950
				obj1 = ((Object) (new bly(bjo2.a(i), l)));
	//  921 1932:new             #162 <Class bly>
	//  922 1935:dup             
	//  923 1936:aload           32
	//  924 1938:iload           4
	//  925 1940:invokevirtual   #98  <Method bjm bjo.a(int)>
	//  926 1943:iload           6
	//  927 1945:invokespecial   #165 <Method void bly(bjm, int)>
	//  928 1948:astore          30
			abmc[l4] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	//  929 1950:aload           29
	//  930 1952:iload           11
	//  931 1954:aload           30
	//  932 1956:aastore         
			if(abmc[l4] != null)
	//* 933 1957:aload           29
	//* 934 1959:iload           11
	//* 935 1961:aaload          
	//* 936 1962:ifnull          1971
				i = 1;
	//  937 1965:iconst_1        
	//  938 1966:istore          4
			else
	//* 939 1968:goto            1974
				i = 0;
	//  940 1971:iconst_0        
	//  941 1972:istore          4
			j = i;
	//  942 1974:iload           4
	//  943 1976:istore          5
			i = l5;
	//  944 1978:iload           13
	//  945 1980:istore          4
		}
		break; /* Loop/switch isn't completed */
	//  946 1982:goto            2205
_L1:
		abdn[l4].a();
		Object obj2 = ((Object) (abjo[l4]));
		Object obj3 = ((Object) (ai[l4]));
		boolean flag7 = blx1.i;
		Object obj1 = null;
		int l5 = 0;
		int l = 0;
		int l1;
		int l3;
		bjo bjo1;
		int ai3[][];
		int ai5[];
		int j1 = 0;
	//* 947 1985:goto            2205
		while(l5 < ((bjo) (obj2)).b) 
	//* 948 1988:iload           13
	//* 949 1990:aload           33
	//* 950 1992:getfield        #95  <Field int bjo.b>
	//* 951 1995:icmpge          2174
		{
			bjm bjm1 = ((bjo) (obj2)).a(l5);
	//  952 1998:aload           33
	//  953 2000:iload           13
	//  954 2002:invokevirtual   #98  <Method bjm bjo.a(int)>
	//  955 2005:astore          32
			Object obj4 = obj3[l5];
	//  956 2007:aload           34
	//  957 2009:iload           13
	//  958 2011:aaload          
	//  959 2012:astore          35
			int j2 = l;
	//  960 2014:iload           6
	//  961 2016:istore          8
			boolean flag2 = false;
	//  962 2018:iconst_0        
	//  963 2019:istore          9
			l = j1;
	//  964 2021:iload           7
	//  965 2023:istore          6
			for(j1 = ((int) (flag2)); j1 < bjm1.a;)
	//* 966 2025:iload           9
	//* 967 2027:istore          7
	//* 968 2029:iload           7
	//* 969 2031:aload           32
	//* 970 2033:getfield        #104 <Field int bjm.a>
	//* 971 2036:icmpge          2157
			{
				int j4;
				if(b(obj4[j1], flag7))
	//* 972 2039:aload           35
	//* 973 2041:iload           7
	//* 974 2043:iaload          
	//* 975 2044:iload           24
	//* 976 2046:invokestatic    #153 <Method boolean b(int, boolean)>
	//* 977 2049:ifeq            2140
				{
					boolean flag3;
					if((bjm1.a(j1).r & 1) != 0)
	//* 978 2052:aload           32
	//* 979 2054:iload           7
	//* 980 2056:invokevirtual   #121 <Method zzfs bjm.a(int)>
	//* 981 2059:getfield        #168 <Field int zzfs.r>
	//* 982 2062:iconst_1        
	//* 983 2063:iand            
	//* 984 2064:ifeq            2073
						flag3 = true;
	//  985 2067:iconst_1        
	//  986 2068:istore          9
					else
	//* 987 2070:goto            2076
						flag3 = false;
	//  988 2073:iconst_0        
	//  989 2074:istore          9
					if(flag3)
	//* 990 2076:iload           9
	//* 991 2078:ifeq            2087
						j4 = 2;
	//  992 2081:iconst_2        
	//  993 2082:istore          10
					else
	//* 994 2084:goto            2090
						j4 = 1;
	//  995 2087:iconst_1        
	//  996 2088:istore          10
					int j3 = j4;
	//  997 2090:iload           10
	//  998 2092:istore          9
					if(b(obj4[j1], false))
	//* 999 2094:aload           35
	//*1000 2096:iload           7
	//*1001 2098:iaload          
	//*1002 2099:iconst_0        
	//*1003 2100:invokestatic    #153 <Method boolean b(int, boolean)>
	//*1004 2103:ifeq            2114
						j3 = j4 + 1000;
	// 1005 2106:iload           10
	// 1006 2108:sipush          1000
	// 1007 2111:iadd            
	// 1008 2112:istore          9
					j4 = l;
	// 1009 2114:iload           6
	// 1010 2116:istore          10
					if(j3 > l)
	//*1011 2118:iload           9
	//*1012 2120:iload           6
	//*1013 2122:icmple          2144
					{
						j2 = j1;
	// 1014 2125:iload           7
	// 1015 2127:istore          8
						obj1 = ((Object) (bjm1));
	// 1016 2129:aload           32
	// 1017 2131:astore          30
						j4 = j3;
	// 1018 2133:iload           9
	// 1019 2135:istore          10
					}
				} else
	//*1020 2137:goto            2144
				{
					j4 = l;
	// 1021 2140:iload           6
	// 1022 2142:istore          10
				}
				j1++;
	// 1023 2144:iload           7
	// 1024 2146:iconst_1        
	// 1025 2147:iadd            
	// 1026 2148:istore          7
				l = j4;
	// 1027 2150:iload           10
	// 1028 2152:istore          6
			}

	//*1029 2154:goto            2029
			l5++;
	// 1030 2157:iload           13
	// 1031 2159:iconst_1        
	// 1032 2160:iadd            
	// 1033 2161:istore          13
			j1 = l;
	// 1034 2163:iload           6
	// 1035 2165:istore          7
			l = j2;
	// 1036 2167:iload           8
	// 1037 2169:istore          6
		}
	//*1038 2171:goto            1988
		if(obj1 == null)
	//*1039 2174:aload           30
	//*1040 2176:ifnonnull       2185
			obj1 = null;
	// 1041 2179:aconst_null     
	// 1042 2180:astore          30
		else
	//*1043 2182:goto            2198
			obj1 = ((Object) (new bly(((bjm) (obj1)), l)));
	// 1044 2185:new             #162 <Class bly>
	// 1045 2188:dup             
	// 1046 2189:aload           30
	// 1047 2191:iload           6
	// 1048 2193:invokespecial   #165 <Method void bly(bjm, int)>
	// 1049 2196:astore          30
		abmc[l4] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	// 1050 2198:aload           29
	// 1051 2200:iload           11
	// 1052 2202:aload           30
	// 1053 2204:aastore         
		l4++;
	// 1054 2205:iload           11
	// 1055 2207:iconst_1        
	// 1056 2208:iadd            
	// 1057 2209:istore          11
		if(true) goto _L11; else goto _L10
	// 1058 2211:goto            1149
_L10:
		return abmc;
	// 1059 2214:aload           29
	// 1060 2216:areturn         
	}

	private static final int a[] = new int[0];
	private final bmd b;
	private final AtomicReference c;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #14  <Field int[] a>
	//*   3    6:return          
	}
}
