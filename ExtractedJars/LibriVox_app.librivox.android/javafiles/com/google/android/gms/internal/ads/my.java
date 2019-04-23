// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.f;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ni, afn, xg, wx, 
//			bwk, zv, ahb, mz, 
//			nj

public final class my extends ni
{

	public my(afn afn1, nj nj1)
	{
		super(afn1, "resize");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #68  <String "resize">
	//    3    4:invokespecial   #71  <Method void ni(afn, String)>
		b = "top-right";
	//    4    7:aload_0         
	//    5    8:ldc1            #46  <String "top-right">
	//    6   10:putfield        #73  <Field String b>
		c = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #75  <Field boolean c>
		d = 0;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #77  <Field int d>
		e = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #79  <Field int e>
		f = -1;
	//   16   28:aload_0         
	//   17   29:iconst_m1       
	//   18   30:putfield        #81  <Field int f>
		g = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #83  <Field int g>
		h = 0;
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:putfield        #85  <Field int h>
		i = -1;
	//   25   43:aload_0         
	//   26   44:iconst_m1       
	//   27   45:putfield        #87  <Field int i>
	//   28   48:aload_0         
	//   29   49:new             #89  <Class Object>
	//   30   52:dup             
	//   31   53:invokespecial   #91  <Method void Object()>
	//   32   56:putfield        #93  <Field Object j>
		k = afn1;
	//   33   59:aload_0         
	//   34   60:aload_1         
	//   35   61:putfield        #95  <Field afn k>
		l = afn1.d();
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:invokeinterface #100 <Method Activity afn.d()>
	//   39   71:putfield        #102 <Field Activity l>
		p = nj1;
	//   40   74:aload_0         
	//   41   75:aload_2         
	//   42   76:putfield        #104 <Field nj p>
	//   43   79:return          
	}

	private final void b(int i1, int j1)
	{
		((ni)this).a(i1, j1 - aw.e().c(l)[0], i, f);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #110 <Method xg aw.e()>
	//    4    6:aload_0         
	//    5    7:getfield        #102 <Field Activity l>
	//    6   10:invokevirtual   #115 <Method int[] xg.c(Activity)>
	//    7   13:iconst_0        
	//    8   14:iaload          
	//    9   15:isub            
	//   10   16:aload_0         
	//   11   17:getfield        #87  <Field int i>
	//   12   20:aload_0         
	//   13   21:getfield        #81  <Field int f>
	//   14   24:invokevirtual   #118 <Method void ni.a(int, int, int, int)>
	//   15   27:return          
	}

	private final int[] b()
	{
		int i1;
label0:
		{
			int ai2[] = aw.e().b(l);
	//    0    0:invokestatic    #110 <Method xg aw.e()>
	//    1    3:aload_0         
	//    2    4:getfield        #102 <Field Activity l>
	//    3    7:invokevirtual   #121 <Method int[] xg.b(Activity)>
	//    4   10:astore          6
			int ai[] = aw.e().c(l);
	//    5   12:invokestatic    #110 <Method xg aw.e()>
	//    6   15:aload_0         
	//    7   16:getfield        #102 <Field Activity l>
	//    8   19:invokevirtual   #115 <Method int[] xg.c(Activity)>
	//    9   22:astore          5
			int i2 = ai2[0];
	//   10   24:aload           6
	//   11   26:iconst_0        
	//   12   27:iaload          
	//   13   28:istore_3        
			i1 = ai2[1];
	//   14   29:aload           6
	//   15   31:iconst_1        
	//   16   32:iaload          
	//   17   33:istore_1        
			int j1 = i;
	//   18   34:aload_0         
	//   19   35:getfield        #87  <Field int i>
	//   20   38:istore_2        
			if(j1 >= 50 && j1 <= i2)
	//*  21   39:iload_2         
	//*  22   40:bipush          50
	//*  23   42:icmplt          597
	//*  24   45:iload_2         
	//*  25   46:iload_3         
	//*  26   47:icmple          53
	//*  27   50:goto            597
			{
				int k2 = f;
	//   28   53:aload_0         
	//   29   54:getfield        #81  <Field int f>
	//   30   57:istore          4
				if(k2 >= 50 && k2 <= i1)
	//*  31   59:iload           4
	//*  32   61:bipush          50
	//*  33   63:icmplt          587
	//*  34   66:iload           4
	//*  35   68:iload_1         
	//*  36   69:icmple          75
	//*  37   72:goto            587
				{
					if(k2 == i1 && j1 == i2)
	//*  38   75:iload           4
	//*  39   77:iload_1         
	//*  40   78:icmpne          96
	//*  41   81:iload_2         
	//*  42   82:iload_3         
	//*  43   83:icmpne          96
					{
						wx.e("Cannot resize to a full-screen ad.");
	//   44   86:ldc1            #123 <String "Cannot resize to a full-screen ad.">
	//   45   88:invokestatic    #128 <Method void wx.e(String)>
						i1 = 0;
	//   46   91:iconst_0        
	//   47   92:istore_1        
						break label0;
	//   48   93:goto            604
					}
					if(c)
	//*  49   96:aload_0         
	//*  50   97:getfield        #75  <Field boolean c>
	//*  51  100:ifeq            582
					{
label1:
						{
							String s1 = b;
	//   52  103:aload_0         
	//   53  104:getfield        #73  <Field String b>
	//   54  107:astore          6
							switch(s1.hashCode())
	//*  55  109:aload           6
	//*  56  111:invokevirtual   #132 <Method int String.hashCode()>
							{
							default:
								break;

	//*  57  114:lookupswitch    6: default 172
	//	               -1364013995: 250
	//	               -1012429441: 235
	//	               -655373719: 220
	//	               1163912186: 205
	//	               1288627767: 190
	//	               1755462605: 175
	//*  58  172:goto            265
							case 1755462605: 
								if(s1.equals("top-center"))
	//*  59  175:aload           6
	//*  60  177:ldc1            #48  <String "top-center">
	//*  61  179:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  62  182:ifeq            265
								{
									i1 = 1;
	//   63  185:iconst_1        
	//   64  186:istore_1        
									break label1;
	//   65  187:goto            267
								}
								break;

							case 1288627767: 
								if(!s1.equals("bottom-center"))
									break;
	//   66  190:aload           6
	//   67  192:ldc1            #56  <String "bottom-center">
	//   68  194:invokevirtual   #136 <Method boolean String.equals(Object)>
	//   69  197:ifeq            265
								i1 = 4;
	//   70  200:iconst_4        
	//   71  201:istore_1        
								break label1;
	//   72  202:goto            267

							case 1163912186: 
								if(!s1.equals("bottom-right"))
									break;
	//   73  205:aload           6
	//   74  207:ldc1            #54  <String "bottom-right">
	//   75  209:invokevirtual   #136 <Method boolean String.equals(Object)>
	//   76  212:ifeq            265
								i1 = 5;
	//   77  215:iconst_5        
	//   78  216:istore_1        
								break label1;
	//   79  217:goto            267

							case -655373719: 
								if(!s1.equals("bottom-left"))
									break;
	//   80  220:aload           6
	//   81  222:ldc1            #52  <String "bottom-left">
	//   82  224:invokevirtual   #136 <Method boolean String.equals(Object)>
	//   83  227:ifeq            265
								i1 = 3;
	//   84  230:iconst_3        
	//   85  231:istore_1        
								break label1;
	//   86  232:goto            267

							case -1012429441: 
								if(!s1.equals("top-left"))
									break;
	//   87  235:aload           6
	//   88  237:ldc1            #44  <String "top-left">
	//   89  239:invokevirtual   #136 <Method boolean String.equals(Object)>
	//   90  242:ifeq            265
								i1 = 0;
	//   91  245:iconst_0        
	//   92  246:istore_1        
								break label1;
	//   93  247:goto            267

							case -1364013995: 
								if(!s1.equals("center"))
									break;
	//   94  250:aload           6
	//   95  252:ldc1            #50  <String "center">
	//   96  254:invokevirtual   #136 <Method boolean String.equals(Object)>
	//   97  257:ifeq            265
								i1 = 2;
	//   98  260:iconst_2        
	//   99  261:istore_1        
								break label1;
	//  100  262:goto            267
							}
							i1 = -1;
	//  101  265:iconst_m1       
	//  102  266:istore_1        
						}
						int k1;
						switch(i1)
	//* 103  267:iload_1         
						{
	//* 104  268:tableswitch     0 5: default 308
	//	               0 526
	//	               1 493
	//	               2 450
	//	               3 419
	//	               4 378
	//	               5 339
						default:
							i1 = (d + g + i) - 50;
	//  105  308:aload_0         
	//  106  309:getfield        #77  <Field int d>
	//  107  312:aload_0         
	//  108  313:getfield        #83  <Field int g>
	//  109  316:iadd            
	//  110  317:aload_0         
	//  111  318:getfield        #87  <Field int i>
	//  112  321:iadd            
	//  113  322:bipush          50
	//  114  324:isub            
	//  115  325:istore_1        
							k1 = e + h;
	//  116  326:aload_0         
	//  117  327:getfield        #79  <Field int e>
	//  118  330:aload_0         
	//  119  331:getfield        #85  <Field int h>
	//  120  334:iadd            
	//  121  335:istore_2        
							break;

	//* 122  336:goto            546
						case 5: // '\005'
							i1 = (d + g + i) - 50;
	//  123  339:aload_0         
	//  124  340:getfield        #77  <Field int d>
	//  125  343:aload_0         
	//  126  344:getfield        #83  <Field int g>
	//  127  347:iadd            
	//  128  348:aload_0         
	//  129  349:getfield        #87  <Field int i>
	//  130  352:iadd            
	//  131  353:bipush          50
	//  132  355:isub            
	//  133  356:istore_1        
							k1 = (e + h + f) - 50;
	//  134  357:aload_0         
	//  135  358:getfield        #79  <Field int e>
	//  136  361:aload_0         
	//  137  362:getfield        #85  <Field int h>
	//  138  365:iadd            
	//  139  366:aload_0         
	//  140  367:getfield        #81  <Field int f>
	//  141  370:iadd            
	//  142  371:bipush          50
	//  143  373:isub            
	//  144  374:istore_2        
							break;

	//* 145  375:goto            546
						case 4: // '\004'
							i1 = (d + g + i / 2) - 25;
	//  146  378:aload_0         
	//  147  379:getfield        #77  <Field int d>
	//  148  382:aload_0         
	//  149  383:getfield        #83  <Field int g>
	//  150  386:iadd            
	//  151  387:aload_0         
	//  152  388:getfield        #87  <Field int i>
	//  153  391:iconst_2        
	//  154  392:idiv            
	//  155  393:iadd            
	//  156  394:bipush          25
	//  157  396:isub            
	//  158  397:istore_1        
							k1 = (e + h + f) - 50;
	//  159  398:aload_0         
	//  160  399:getfield        #79  <Field int e>
	//  161  402:aload_0         
	//  162  403:getfield        #85  <Field int h>
	//  163  406:iadd            
	//  164  407:aload_0         
	//  165  408:getfield        #81  <Field int f>
	//  166  411:iadd            
	//  167  412:bipush          50
	//  168  414:isub            
	//  169  415:istore_2        
							break;

	//* 170  416:goto            546
						case 3: // '\003'
							i1 = d + g;
	//  171  419:aload_0         
	//  172  420:getfield        #77  <Field int d>
	//  173  423:aload_0         
	//  174  424:getfield        #83  <Field int g>
	//  175  427:iadd            
	//  176  428:istore_1        
							k1 = (e + h + f) - 50;
	//  177  429:aload_0         
	//  178  430:getfield        #79  <Field int e>
	//  179  433:aload_0         
	//  180  434:getfield        #85  <Field int h>
	//  181  437:iadd            
	//  182  438:aload_0         
	//  183  439:getfield        #81  <Field int f>
	//  184  442:iadd            
	//  185  443:bipush          50
	//  186  445:isub            
	//  187  446:istore_2        
							break;

	//* 188  447:goto            546
						case 2: // '\002'
							i1 = (d + g + i / 2) - 25;
	//  189  450:aload_0         
	//  190  451:getfield        #77  <Field int d>
	//  191  454:aload_0         
	//  192  455:getfield        #83  <Field int g>
	//  193  458:iadd            
	//  194  459:aload_0         
	//  195  460:getfield        #87  <Field int i>
	//  196  463:iconst_2        
	//  197  464:idiv            
	//  198  465:iadd            
	//  199  466:bipush          25
	//  200  468:isub            
	//  201  469:istore_1        
							k1 = (e + h + f / 2) - 25;
	//  202  470:aload_0         
	//  203  471:getfield        #79  <Field int e>
	//  204  474:aload_0         
	//  205  475:getfield        #85  <Field int h>
	//  206  478:iadd            
	//  207  479:aload_0         
	//  208  480:getfield        #81  <Field int f>
	//  209  483:iconst_2        
	//  210  484:idiv            
	//  211  485:iadd            
	//  212  486:bipush          25
	//  213  488:isub            
	//  214  489:istore_2        
							break;

	//* 215  490:goto            546
						case 1: // '\001'
							i1 = (d + g + i / 2) - 25;
	//  216  493:aload_0         
	//  217  494:getfield        #77  <Field int d>
	//  218  497:aload_0         
	//  219  498:getfield        #83  <Field int g>
	//  220  501:iadd            
	//  221  502:aload_0         
	//  222  503:getfield        #87  <Field int i>
	//  223  506:iconst_2        
	//  224  507:idiv            
	//  225  508:iadd            
	//  226  509:bipush          25
	//  227  511:isub            
	//  228  512:istore_1        
							k1 = e + h;
	//  229  513:aload_0         
	//  230  514:getfield        #79  <Field int e>
	//  231  517:aload_0         
	//  232  518:getfield        #85  <Field int h>
	//  233  521:iadd            
	//  234  522:istore_2        
							break;

	//* 235  523:goto            546
						case 0: // '\0'
							i1 = d + g;
	//  236  526:aload_0         
	//  237  527:getfield        #77  <Field int d>
	//  238  530:aload_0         
	//  239  531:getfield        #83  <Field int g>
	//  240  534:iadd            
	//  241  535:istore_1        
							k1 = e + h;
	//  242  536:aload_0         
	//  243  537:getfield        #79  <Field int e>
	//  244  540:aload_0         
	//  245  541:getfield        #85  <Field int h>
	//  246  544:iadd            
	//  247  545:istore_2        
							break;
						}
						if(i1 < 0 || i1 + 50 > i2 || k1 < ai[0] || k1 + 50 > ai[1])
	//* 248  546:iload_1         
	//* 249  547:iflt            577
	//* 250  550:iload_1         
	//* 251  551:bipush          50
	//* 252  553:iadd            
	//* 253  554:iload_3         
	//* 254  555:icmpgt          577
	//* 255  558:iload_2         
	//* 256  559:aload           5
	//* 257  561:iconst_0        
	//* 258  562:iaload          
	//* 259  563:icmplt          577
	//* 260  566:iload_2         
	//* 261  567:bipush          50
	//* 262  569:iadd            
	//* 263  570:aload           5
	//* 264  572:iconst_1        
	//* 265  573:iaload          
	//* 266  574:icmple          582
						{
							i1 = 0;
	//  267  577:iconst_0        
	//  268  578:istore_1        
							break label0;
	//  269  579:goto            604
						}
					}
					i1 = 1;
	//  270  582:iconst_1        
	//  271  583:istore_1        
					break label0;
	//  272  584:goto            604
				} else
				{
					wx.e("Height is too small or too large.");
	//  273  587:ldc1            #138 <String "Height is too small or too large.">
	//  274  589:invokestatic    #128 <Method void wx.e(String)>
					i1 = 0;
	//  275  592:iconst_0        
	//  276  593:istore_1        
					break label0;
	//  277  594:goto            604
				}
			}
			wx.e("Width is too small or too large.");
	//  278  597:ldc1            #140 <String "Width is too small or too large.">
	//  279  599:invokestatic    #128 <Method void wx.e(String)>
			i1 = 0;
	//  280  602:iconst_0        
	//  281  603:istore_1        
		}
		if(i1 == 0)
	//* 282  604:iload_1         
	//* 283  605:ifne            610
			return null;
	//  284  608:aconst_null     
	//  285  609:areturn         
		if(c)
	//* 286  610:aload_0         
	//* 287  611:getfield        #75  <Field boolean c>
	//* 288  614:ifeq            645
			return (new int[] {
				d + g, e + h
			});
	//  289  617:iconst_2        
	//  290  618:newarray        int[]
	//  291  620:dup             
	//  292  621:iconst_0        
	//  293  622:aload_0         
	//  294  623:getfield        #77  <Field int d>
	//  295  626:aload_0         
	//  296  627:getfield        #83  <Field int g>
	//  297  630:iadd            
	//  298  631:iastore         
	//  299  632:dup             
	//  300  633:iconst_1        
	//  301  634:aload_0         
	//  302  635:getfield        #79  <Field int e>
	//  303  638:aload_0         
	//  304  639:getfield        #85  <Field int h>
	//  305  642:iadd            
	//  306  643:iastore         
	//  307  644:areturn         
		int ai1[] = aw.e().b(l);
	//  308  645:invokestatic    #110 <Method xg aw.e()>
	//  309  648:aload_0         
	//  310  649:getfield        #102 <Field Activity l>
	//  311  652:invokevirtual   #121 <Method int[] xg.b(Activity)>
	//  312  655:astore          5
		int ai3[] = aw.e().c(l);
	//  313  657:invokestatic    #110 <Method xg aw.e()>
	//  314  660:aload_0         
	//  315  661:getfield        #102 <Field Activity l>
	//  316  664:invokevirtual   #115 <Method int[] xg.c(Activity)>
	//  317  667:astore          6
		int l1 = ai1[0];
	//  318  669:aload           5
	//  319  671:iconst_0        
	//  320  672:iaload          
	//  321  673:istore_2        
		i1 = d + g;
	//  322  674:aload_0         
	//  323  675:getfield        #77  <Field int d>
	//  324  678:aload_0         
	//  325  679:getfield        #83  <Field int g>
	//  326  682:iadd            
	//  327  683:istore_1        
		int j2 = e + h;
	//  328  684:aload_0         
	//  329  685:getfield        #79  <Field int e>
	//  330  688:aload_0         
	//  331  689:getfield        #85  <Field int h>
	//  332  692:iadd            
	//  333  693:istore_3        
		if(i1 < 0)
	//* 334  694:iload_1         
	//* 335  695:ifge            703
		{
			i1 = 0;
	//  336  698:iconst_0        
	//  337  699:istore_1        
		} else
	//* 338  700:goto            725
		{
			int l2 = i;
	//  339  703:aload_0         
	//  340  704:getfield        #87  <Field int i>
	//  341  707:istore          4
			if(i1 + l2 > l1)
	//* 342  709:iload_1         
	//* 343  710:iload           4
	//* 344  712:iadd            
	//* 345  713:iload_2         
	//* 346  714:icmple          725
				i1 = l1 - l2;
	//  347  717:iload_2         
	//  348  718:iload           4
	//  349  720:isub            
	//  350  721:istore_1        
		}
	//* 351  722:goto            725
		if(j2 < ai3[0])
	//* 352  725:iload_3         
	//* 353  726:aload           6
	//* 354  728:iconst_0        
	//* 355  729:iaload          
	//* 356  730:icmpge          741
		{
			l1 = ai3[0];
	//  357  733:aload           6
	//  358  735:iconst_0        
	//  359  736:iaload          
	//  360  737:istore_2        
		} else
	//* 361  738:goto            768
		{
			int i3 = f;
	//  362  741:aload_0         
	//  363  742:getfield        #81  <Field int f>
	//  364  745:istore          4
			l1 = j2;
	//  365  747:iload_3         
	//  366  748:istore_2        
			if(j2 + i3 > ai3[1])
	//* 367  749:iload_3         
	//* 368  750:iload           4
	//* 369  752:iadd            
	//* 370  753:aload           6
	//* 371  755:iconst_1        
	//* 372  756:iaload          
	//* 373  757:icmple          768
				l1 = ai3[1] - i3;
	//  374  760:aload           6
	//  375  762:iconst_1        
	//  376  763:iaload          
	//  377  764:iload           4
	//  378  766:isub            
	//  379  767:istore_2        
		}
		return (new int[] {
			i1, l1
		});
	//  380  768:iconst_2        
	//  381  769:newarray        int[]
	//  382  771:dup             
	//  383  772:iconst_0        
	//  384  773:iload_1         
	//  385  774:iastore         
	//  386  775:dup             
	//  387  776:iconst_1        
	//  388  777:iload_2         
	//  389  778:iastore         
	//  390  779:areturn         
	}

	public final void a(int i1, int j1)
	{
		d = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int d>
		e = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #79  <Field int e>
	//    6   10:return          
	}

	public final void a(int i1, int j1, boolean flag)
	{
		Object obj = j;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Object j>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		d = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #77  <Field int d>
		e = j1;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #79  <Field int e>
		if(q == null || !flag)
			break MISSING_BLOCK_LABEL_118;
	//   11   19:aload_0         
	//   12   20:getfield        #143 <Field PopupWindow q>
	//   13   23:ifnull          118
	//   14   26:iload_3         
	//   15   27:ifeq            118
		int ai[] = b();
	//   16   30:aload_0         
	//   17   31:invokespecial   #145 <Method int[] b()>
	//   18   34:astore          5
		if(ai == null)
			break MISSING_BLOCK_LABEL_113;
	//   19   36:aload           5
	//   20   38:ifnull          113
		PopupWindow popupwindow = q;
	//   21   41:aload_0         
	//   22   42:getfield        #143 <Field PopupWindow q>
	//   23   45:astore          6
		bwk.a();
	//   24   47:invokestatic    #150 <Method zv bwk.a()>
	//   25   50:pop             
		i1 = zv.a(((android.content.Context) (l)), ai[0]);
	//   26   51:aload_0         
	//   27   52:getfield        #102 <Field Activity l>
	//   28   55:aload           5
	//   29   57:iconst_0        
	//   30   58:iaload          
	//   31   59:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//   32   62:istore_1        
		bwk.a();
	//   33   63:invokestatic    #150 <Method zv bwk.a()>
	//   34   66:pop             
		popupwindow.update(i1, zv.a(((android.content.Context) (l)), ai[1]), q.getWidth(), q.getHeight());
	//   35   67:aload           6
	//   36   69:iload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #102 <Field Activity l>
	//   39   74:aload           5
	//   40   76:iconst_1        
	//   41   77:iaload          
	//   42   78:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//   43   81:aload_0         
	//   44   82:getfield        #143 <Field PopupWindow q>
	//   45   85:invokevirtual   #160 <Method int PopupWindow.getWidth()>
	//   46   88:aload_0         
	//   47   89:getfield        #143 <Field PopupWindow q>
	//   48   92:invokevirtual   #163 <Method int PopupWindow.getHeight()>
	//   49   95:invokevirtual   #166 <Method void PopupWindow.update(int, int, int, int)>
		b(ai[0], ai[1]);
	//   50   98:aload_0         
	//   51   99:aload           5
	//   52  101:iconst_0        
	//   53  102:iaload          
	//   54  103:aload           5
	//   55  105:iconst_1        
	//   56  106:iaload          
	//   57  107:invokespecial   #168 <Method void b(int, int)>
		break MISSING_BLOCK_LABEL_118;
	//   58  110:goto            118
		a(true);
	//   59  113:aload_0         
	//   60  114:iconst_1        
	//   61  115:invokevirtual   #171 <Method void a(boolean)>
		obj;
	//   62  118:aload           4
		JVM INSTR monitorexit ;
	//   63  120:monitorexit     
		return;
	//   64  121:return          
		Exception exception;
		exception;
	//   65  122:astore          5
		obj;
	//   66  124:aload           4
		JVM INSTR monitorexit ;
	//   67  126:monitorexit     
		throw exception;
	//   68  127:aload           5
	//   69  129:athrow          
	}

	public final void a(Map map)
	{
label0:
		{
			synchronized(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field Object j>
	//*   2    4:astore          7
	//*   3    6:aload           7
	//*   4    8:monitorenter    
			{
				if(l != null)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field Activity l>
	//    7   13:ifnonnull       26
				((ni)this).a("Not an activity context. Cannot resize.");
	//    8   16:aload_0         
	//    9   17:ldc1            #176 <String "Not an activity context. Cannot resize.">
	//   10   19:invokevirtual   #178 <Method void ni.a(String)>
			}
	//   11   22:aload           7
	//   12   24:monitorexit     
			return;
	//   13   25:return          
		}
		if(k.u() != null)
			break MISSING_BLOCK_LABEL_48;
	//   14   26:aload_0         
	//   15   27:getfield        #95  <Field afn k>
	//   16   30:invokeinterface #182 <Method ahb afn.u()>
	//   17   35:ifnonnull       48
		((ni)this).a("Webview is not yet available, size is not set.");
	//   18   38:aload_0         
	//   19   39:ldc1            #184 <String "Webview is not yet available, size is not set.">
	//   20   41:invokevirtual   #178 <Method void ni.a(String)>
		obj;
	//   21   44:aload           7
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return;
	//   23   47:return          
		if(!k.u().e())
			break MISSING_BLOCK_LABEL_73;
	//   24   48:aload_0         
	//   25   49:getfield        #95  <Field afn k>
	//   26   52:invokeinterface #182 <Method ahb afn.u()>
	//   27   57:invokevirtual   #189 <Method boolean ahb.e()>
	//   28   60:ifeq            73
		((ni)this).a("Is interstitial. Cannot resize an interstitial.");
	//   29   63:aload_0         
	//   30   64:ldc1            #191 <String "Is interstitial. Cannot resize an interstitial.">
	//   31   66:invokevirtual   #178 <Method void ni.a(String)>
		obj;
	//   32   69:aload           7
		JVM INSTR monitorexit ;
	//   33   71:monitorexit     
		return;
	//   34   72:return          
		if(!k.B())
			break MISSING_BLOCK_LABEL_95;
	//   35   73:aload_0         
	//   36   74:getfield        #95  <Field afn k>
	//   37   77:invokeinterface #194 <Method boolean afn.B()>
	//   38   82:ifeq            95
		((ni)this).a("Cannot resize an expanded banner.");
	//   39   85:aload_0         
	//   40   86:ldc1            #196 <String "Cannot resize an expanded banner.">
	//   41   88:invokevirtual   #178 <Method void ni.a(String)>
		obj;
	//   42   91:aload           7
		JVM INSTR monitorexit ;
	//   43   93:monitorexit     
		return;
	//   44   94:return          
		if(!TextUtils.isEmpty((CharSequence)map.get("width")))
	//*  45   95:aload_1         
	//*  46   96:ldc1            #198 <String "width">
	//*  47   98:invokeinterface #204 <Method Object Map.get(Object)>
	//*  48  103:checkcast       #206 <Class CharSequence>
	//*  49  106:invokestatic    #212 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  50  109:ifne            134
		{
			aw.e();
	//   51  112:invokestatic    #110 <Method xg aw.e()>
	//   52  115:pop             
			i = xg.b((String)map.get("width"));
	//   53  116:aload_0         
	//   54  117:aload_1         
	//   55  118:ldc1            #198 <String "width">
	//   56  120:invokeinterface #204 <Method Object Map.get(Object)>
	//   57  125:checkcast       #42  <Class String>
	//   58  128:invokestatic    #215 <Method int xg.b(String)>
	//   59  131:putfield        #87  <Field int i>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("height")))
	//*  60  134:aload_1         
	//*  61  135:ldc1            #217 <String "height">
	//*  62  137:invokeinterface #204 <Method Object Map.get(Object)>
	//*  63  142:checkcast       #206 <Class CharSequence>
	//*  64  145:invokestatic    #212 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  65  148:ifne            173
		{
			aw.e();
	//   66  151:invokestatic    #110 <Method xg aw.e()>
	//   67  154:pop             
			f = xg.b((String)map.get("height"));
	//   68  155:aload_0         
	//   69  156:aload_1         
	//   70  157:ldc1            #217 <String "height">
	//   71  159:invokeinterface #204 <Method Object Map.get(Object)>
	//   72  164:checkcast       #42  <Class String>
	//   73  167:invokestatic    #215 <Method int xg.b(String)>
	//   74  170:putfield        #81  <Field int f>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
	//*  75  173:aload_1         
	//*  76  174:ldc1            #219 <String "offsetX">
	//*  77  176:invokeinterface #204 <Method Object Map.get(Object)>
	//*  78  181:checkcast       #206 <Class CharSequence>
	//*  79  184:invokestatic    #212 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  80  187:ifne            212
		{
			aw.e();
	//   81  190:invokestatic    #110 <Method xg aw.e()>
	//   82  193:pop             
			g = xg.b((String)map.get("offsetX"));
	//   83  194:aload_0         
	//   84  195:aload_1         
	//   85  196:ldc1            #219 <String "offsetX">
	//   86  198:invokeinterface #204 <Method Object Map.get(Object)>
	//   87  203:checkcast       #42  <Class String>
	//   88  206:invokestatic    #215 <Method int xg.b(String)>
	//   89  209:putfield        #83  <Field int g>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
	//*  90  212:aload_1         
	//*  91  213:ldc1            #221 <String "offsetY">
	//*  92  215:invokeinterface #204 <Method Object Map.get(Object)>
	//*  93  220:checkcast       #206 <Class CharSequence>
	//*  94  223:invokestatic    #212 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  95  226:ifne            251
		{
			aw.e();
	//   96  229:invokestatic    #110 <Method xg aw.e()>
	//   97  232:pop             
			h = xg.b((String)map.get("offsetY"));
	//   98  233:aload_0         
	//   99  234:aload_1         
	//  100  235:ldc1            #221 <String "offsetY">
	//  101  237:invokeinterface #204 <Method Object Map.get(Object)>
	//  102  242:checkcast       #42  <Class String>
	//  103  245:invokestatic    #215 <Method int xg.b(String)>
	//  104  248:putfield        #85  <Field int h>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
	//* 105  251:aload_1         
	//* 106  252:ldc1            #223 <String "allowOffscreen">
	//* 107  254:invokeinterface #204 <Method Object Map.get(Object)>
	//* 108  259:checkcast       #206 <Class CharSequence>
	//* 109  262:invokestatic    #212 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 110  265:ifne            286
			c = Boolean.parseBoolean((String)map.get("allowOffscreen"));
	//  111  268:aload_0         
	//  112  269:aload_1         
	//  113  270:ldc1            #223 <String "allowOffscreen">
	//  114  272:invokeinterface #204 <Method Object Map.get(Object)>
	//  115  277:checkcast       #42  <Class String>
	//  116  280:invokestatic    #229 <Method boolean Boolean.parseBoolean(String)>
	//  117  283:putfield        #75  <Field boolean c>
		map = ((Map) ((String)map.get("customClosePosition")));
	//  118  286:aload_1         
	//  119  287:ldc1            #231 <String "customClosePosition">
	//  120  289:invokeinterface #204 <Method Object Map.get(Object)>
	//  121  294:checkcast       #42  <Class String>
	//  122  297:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (map))))
	//* 123  298:aload_1         
	//* 124  299:invokestatic    #212 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 125  302:ifne            310
			b = ((String) (map));
	//  126  305:aload_0         
	//  127  306:aload_1         
	//  128  307:putfield        #73  <Field String b>
		int i1;
		boolean flag;
		int j1;
		int k1;
		int l1;
		Object obj1;
		Object obj2;
		String s1;
		if(i >= 0 && f >= 0)
	//* 129  310:aload_0         
	//* 130  311:getfield        #87  <Field int i>
	//* 131  314:iflt            1297
	//* 132  317:aload_0         
	//* 133  318:getfield        #81  <Field int f>
	//* 134  321:iflt            1297
			i1 = 1;
	//  135  324:iconst_1        
	//  136  325:istore_2        
		else
	//* 137  326:goto            329
	//* 138  329:iload_2         
	//* 139  330:ifne            343
	//* 140  333:aload_0         
	//* 141  334:ldc1            #233 <String "Invalid width and height options. Cannot resize.">
	//* 142  336:invokevirtual   #178 <Method void ni.a(String)>
	//* 143  339:aload           7
	//* 144  341:monitorexit     
	//* 145  342:return          
	//* 146  343:aload_0         
	//* 147  344:getfield        #102 <Field Activity l>
	//* 148  347:invokevirtual   #239 <Method Window Activity.getWindow()>
	//* 149  350:astore          8
	//* 150  352:aload           8
	//* 151  354:ifnull          1280
	//* 152  357:aload           8
	//* 153  359:invokevirtual   #245 <Method View Window.getDecorView()>
	//* 154  362:ifnonnull       368
	//* 155  365:goto            1280
	//* 156  368:aload_0         
	//* 157  369:invokespecial   #145 <Method int[] b()>
	//* 158  372:astore_1        
	//* 159  373:aload_1         
	//* 160  374:ifnonnull       387
	//* 161  377:aload_0         
	//* 162  378:ldc1            #247 <String "Resize location out of screen or close button is not visible.">
	//* 163  380:invokevirtual   #178 <Method void ni.a(String)>
	//* 164  383:aload           7
	//* 165  385:monitorexit     
	//* 166  386:return          
	//* 167  387:invokestatic    #150 <Method zv bwk.a()>
	//* 168  390:pop             
	//* 169  391:aload_0         
	//* 170  392:getfield        #102 <Field Activity l>
	//* 171  395:aload_0         
	//* 172  396:getfield        #87  <Field int i>
	//* 173  399:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//* 174  402:istore_3        
	//* 175  403:invokestatic    #150 <Method zv bwk.a()>
	//* 176  406:pop             
	//* 177  407:aload_0         
	//* 178  408:getfield        #102 <Field Activity l>
	//* 179  411:aload_0         
	//* 180  412:getfield        #81  <Field int f>
	//* 181  415:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//* 182  418:istore          4
	//* 183  420:aload_0         
	//* 184  421:getfield        #95  <Field afn k>
	//* 185  424:invokeinterface #250 <Method View afn.getView()>
	//* 186  429:invokevirtual   #256 <Method android.view.ViewParent View.getParent()>
	//* 187  432:astore          9
	//* 188  434:aload           9
	//* 189  436:ifnull          1269
	//* 190  439:aload           9
	//* 191  441:instanceof      #258 <Class ViewGroup>
	//* 192  444:ifeq            1269
	//* 193  447:aload           9
	//* 194  449:checkcast       #258 <Class ViewGroup>
	//* 195  452:aload_0         
	//* 196  453:getfield        #95  <Field afn k>
	//* 197  456:invokeinterface #250 <Method View afn.getView()>
	//* 198  461:invokevirtual   #262 <Method void ViewGroup.removeView(View)>
	//* 199  464:aload_0         
	//* 200  465:getfield        #143 <Field PopupWindow q>
	//* 201  468:ifnonnull       549
	//* 202  471:aload_0         
	//* 203  472:aload           9
	//* 204  474:checkcast       #258 <Class ViewGroup>
	//* 205  477:putfield        #264 <Field ViewGroup s>
	//* 206  480:invokestatic    #110 <Method xg aw.e()>
	//* 207  483:pop             
	//* 208  484:aload_0         
	//* 209  485:getfield        #95  <Field afn k>
	//* 210  488:invokeinterface #250 <Method View afn.getView()>
	//* 211  493:invokestatic    #267 <Method android.graphics.Bitmap xg.a(View)>
	//* 212  496:astore          9
	//* 213  498:aload_0         
	//* 214  499:new             #269 <Class ImageView>
	//* 215  502:dup             
	//* 216  503:aload_0         
	//* 217  504:getfield        #102 <Field Activity l>
	//* 218  507:invokespecial   #272 <Method void ImageView(android.content.Context)>
	//* 219  510:putfield        #274 <Field ImageView n>
	//* 220  513:aload_0         
	//* 221  514:getfield        #274 <Field ImageView n>
	//* 222  517:aload           9
	//* 223  519:invokevirtual   #278 <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
	//* 224  522:aload_0         
	//* 225  523:aload_0         
	//* 226  524:getfield        #95  <Field afn k>
	//* 227  527:invokeinterface #182 <Method ahb afn.u()>
	//* 228  532:putfield        #280 <Field ahb m>
	//* 229  535:aload_0         
	//* 230  536:getfield        #264 <Field ViewGroup s>
	//* 231  539:aload_0         
	//* 232  540:getfield        #274 <Field ImageView n>
	//* 233  543:invokevirtual   #283 <Method void ViewGroup.addView(View)>
	//* 234  546:goto            556
	//* 235  549:aload_0         
	//* 236  550:getfield        #143 <Field PopupWindow q>
	//* 237  553:invokevirtual   #286 <Method void PopupWindow.dismiss()>
	//* 238  556:aload_0         
	//* 239  557:new             #288 <Class RelativeLayout>
	//* 240  560:dup             
	//* 241  561:aload_0         
	//* 242  562:getfield        #102 <Field Activity l>
	//* 243  565:invokespecial   #289 <Method void RelativeLayout(android.content.Context)>
	//* 244  568:putfield        #291 <Field RelativeLayout r>
	//* 245  571:aload_0         
	//* 246  572:getfield        #291 <Field RelativeLayout r>
	//* 247  575:iconst_0        
	//* 248  576:invokevirtual   #295 <Method void RelativeLayout.setBackgroundColor(int)>
	//* 249  579:aload_0         
	//* 250  580:getfield        #291 <Field RelativeLayout r>
	//* 251  583:new             #297 <Class android.view.ViewGroup$LayoutParams>
	//* 252  586:dup             
	//* 253  587:iload_3         
	//* 254  588:iload           4
	//* 255  590:invokespecial   #299 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//* 256  593:invokevirtual   #303 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 257  596:invokestatic    #110 <Method xg aw.e()>
	//* 258  599:pop             
	//* 259  600:aload_0         
	//* 260  601:aload_0         
	//* 261  602:getfield        #291 <Field RelativeLayout r>
	//* 262  605:iload_3         
	//* 263  606:iload           4
	//* 264  608:iconst_0        
	//* 265  609:invokestatic    #306 <Method PopupWindow xg.a(View, int, int, boolean)>
	//* 266  612:putfield        #143 <Field PopupWindow q>
	//* 267  615:aload_0         
	//* 268  616:getfield        #143 <Field PopupWindow q>
	//* 269  619:iconst_1        
	//* 270  620:invokevirtual   #309 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//* 271  623:aload_0         
	//* 272  624:getfield        #143 <Field PopupWindow q>
	//* 273  627:iconst_1        
	//* 274  628:invokevirtual   #312 <Method void PopupWindow.setTouchable(boolean)>
	//* 275  631:aload_0         
	//* 276  632:getfield        #143 <Field PopupWindow q>
	//* 277  635:astore          9
	//* 278  637:aload_0         
	//* 279  638:getfield        #75  <Field boolean c>
	//* 280  641:ifne            1302
	//* 281  644:iconst_1        
	//* 282  645:istore          6
	//* 283  647:goto            650
	//* 284  650:aload           9
	//* 285  652:iload           6
	//* 286  654:invokevirtual   #315 <Method void PopupWindow.setClippingEnabled(boolean)>
	//* 287  657:aload_0         
	//* 288  658:getfield        #291 <Field RelativeLayout r>
	//* 289  661:aload_0         
	//* 290  662:getfield        #95  <Field afn k>
	//* 291  665:invokeinterface #250 <Method View afn.getView()>
	//* 292  670:iconst_m1       
	//* 293  671:iconst_m1       
	//* 294  672:invokevirtual   #318 <Method void RelativeLayout.addView(View, int, int)>
	//* 295  675:aload_0         
	//* 296  676:new             #320 <Class LinearLayout>
	//* 297  679:dup             
	//* 298  680:aload_0         
	//* 299  681:getfield        #102 <Field Activity l>
	//* 300  684:invokespecial   #321 <Method void LinearLayout(android.content.Context)>
	//* 301  687:putfield        #323 <Field LinearLayout o>
	//* 302  690:invokestatic    #150 <Method zv bwk.a()>
	//* 303  693:pop             
	//* 304  694:aload_0         
	//* 305  695:getfield        #102 <Field Activity l>
	//* 306  698:bipush          50
	//* 307  700:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//* 308  703:istore_2        
	//* 309  704:invokestatic    #150 <Method zv bwk.a()>
	//* 310  707:pop             
	//* 311  708:new             #325 <Class android.widget.RelativeLayout$LayoutParams>
	//* 312  711:dup             
	//* 313  712:iload_2         
	//* 314  713:aload_0         
	//* 315  714:getfield        #102 <Field Activity l>
	//* 316  717:bipush          50
	//* 317  719:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//* 318  722:invokespecial   #326 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 319  725:astore          9
	//* 320  727:aload_0         
	//* 321  728:getfield        #73  <Field String b>
	//* 322  731:astore          10
	//* 323  733:aload           10
	//* 324  735:invokevirtual   #132 <Method int String.hashCode()>
	//* 325  738:lookupswitch    6: default 1308
	//	               -1364013995: 871
	//	               -1012429441: 856
	//	               -655373719: 841
	//	               1163912186: 826
	//	               1288627767: 811
	//	               1755462605: 796
	//* 326  796:aload           10
	//* 327  798:ldc1            #48  <String "top-center">
	//* 328  800:invokevirtual   #136 <Method boolean String.equals(Object)>
	//* 329  803:ifeq            1308
	//* 330  806:iconst_1        
	//* 331  807:istore_2        
	//* 332  808:goto            1310
	//* 333  811:aload           10
	//* 334  813:ldc1            #56  <String "bottom-center">
	//* 335  815:invokevirtual   #136 <Method boolean String.equals(Object)>
	//* 336  818:ifeq            1308
	//* 337  821:iconst_4        
	//* 338  822:istore_2        
	//* 339  823:goto            1310
	//* 340  826:aload           10
	//* 341  828:ldc1            #54  <String "bottom-right">
	//* 342  830:invokevirtual   #136 <Method boolean String.equals(Object)>
	//* 343  833:ifeq            1308
	//* 344  836:iconst_5        
	//* 345  837:istore_2        
	//* 346  838:goto            1310
	//* 347  841:aload           10
	//* 348  843:ldc1            #52  <String "bottom-left">
	//* 349  845:invokevirtual   #136 <Method boolean String.equals(Object)>
	//* 350  848:ifeq            1308
	//* 351  851:iconst_3        
	//* 352  852:istore_2        
	//* 353  853:goto            1310
	//* 354  856:aload           10
	//* 355  858:ldc1            #44  <String "top-left">
	//* 356  860:invokevirtual   #136 <Method boolean String.equals(Object)>
	//* 357  863:ifeq            1308
	//* 358  866:iconst_0        
	//* 359  867:istore_2        
	//* 360  868:goto            1310
	//* 361  871:aload           10
	//* 362  873:ldc1            #50  <String "center">
	//* 363  875:invokevirtual   #136 <Method boolean String.equals(Object)>
	//* 364  878:ifeq            1308
	//* 365  881:iconst_2        
	//* 366  882:istore_2        
	//* 367  883:goto            1310
	//* 368  886:aload           9
	//* 369  888:bipush          10
	//* 370  890:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 371  893:goto            991
	//* 372  896:aload           9
	//* 373  898:bipush          12
	//* 374  900:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 375  903:aload           9
	//* 376  905:bipush          11
	//* 377  907:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 378  910:goto            998
	//* 379  913:aload           9
	//* 380  915:bipush          12
	//* 381  917:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 382  920:aload           9
	//* 383  922:bipush          14
	//* 384  924:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 385  927:goto            998
	//* 386  930:aload           9
	//* 387  932:bipush          12
	//* 388  934:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 389  937:aload           9
	//* 390  939:bipush          9
	//* 391  941:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 392  944:goto            998
	//* 393  947:aload           9
	//* 394  949:bipush          13
	//* 395  951:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 396  954:goto            998
	//* 397  957:aload           9
	//* 398  959:bipush          10
	//* 399  961:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 400  964:aload           9
	//* 401  966:bipush          14
	//* 402  968:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 403  971:goto            998
	//* 404  974:aload           9
	//* 405  976:bipush          10
	//* 406  978:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 407  981:aload           9
	//* 408  983:bipush          9
	//* 409  985:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 410  988:goto            998
	//* 411  991:aload           9
	//* 412  993:bipush          11
	//* 413  995:invokevirtual   #329 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 414  998:aload_0         
	//* 415  999:getfield        #323 <Field LinearLayout o>
	//* 416 1002:new             #331 <Class mz>
	//* 417 1005:dup             
	//* 418 1006:aload_0         
	//* 419 1007:invokespecial   #334 <Method void mz(my)>
	//* 420 1010:invokevirtual   #338 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
	//* 421 1013:aload_0         
	//* 422 1014:getfield        #323 <Field LinearLayout o>
	//* 423 1017:ldc2            #340 <String "Close button">
	//* 424 1020:invokevirtual   #344 <Method void LinearLayout.setContentDescription(CharSequence)>
	//* 425 1023:aload_0         
	//* 426 1024:getfield        #291 <Field RelativeLayout r>
	//* 427 1027:aload_0         
	//* 428 1028:getfield        #323 <Field LinearLayout o>
	//* 429 1031:aload           9
	//* 430 1033:invokevirtual   #347 <Method void RelativeLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 431 1036:aload_0         
	//* 432 1037:getfield        #143 <Field PopupWindow q>
	//* 433 1040:astore          9
	//* 434 1042:aload           8
	//* 435 1044:invokevirtual   #245 <Method View Window.getDecorView()>
	//* 436 1047:astore          8
	//* 437 1049:invokestatic    #150 <Method zv bwk.a()>
	//* 438 1052:pop             
	//* 439 1053:aload_0         
	//* 440 1054:getfield        #102 <Field Activity l>
	//* 441 1057:aload_1         
	//* 442 1058:iconst_0        
	//* 443 1059:iaload          
	//* 444 1060:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//* 445 1063:istore_2        
	//* 446 1064:invokestatic    #150 <Method zv bwk.a()>
	//* 447 1067:pop             
	//* 448 1068:aload           9
	//* 449 1070:aload           8
	//* 450 1072:iconst_0        
	//* 451 1073:iload_2         
	//* 452 1074:aload_0         
	//* 453 1075:getfield        #102 <Field Activity l>
	//* 454 1078:aload_1         
	//* 455 1079:iconst_1        
	//* 456 1080:iaload          
	//* 457 1081:invokestatic    #155 <Method int zv.a(android.content.Context, int)>
	//* 458 1084:invokevirtual   #351 <Method void PopupWindow.showAtLocation(View, int, int, int)>
	//* 459 1087:aload_1         
	//* 460 1088:iconst_0        
	//* 461 1089:iaload          
	//* 462 1090:istore_2        
	//* 463 1091:aload_1         
	//* 464 1092:iconst_1        
	//* 465 1093:iaload          
	//* 466 1094:istore          5
	//* 467 1096:aload_0         
	//* 468 1097:getfield        #104 <Field nj p>
	//* 469 1100:ifnull          1123
	//* 470 1103:aload_0         
	//* 471 1104:getfield        #104 <Field nj p>
	//* 472 1107:iload_2         
	//* 473 1108:iload           5
	//* 474 1110:aload_0         
	//* 475 1111:getfield        #87  <Field int i>
	//* 476 1114:aload_0         
	//* 477 1115:getfield        #81  <Field int f>
	//* 478 1118:invokeinterface #354 <Method void nj.a(int, int, int, int)>
	//* 479 1123:aload_0         
	//* 480 1124:getfield        #95  <Field afn k>
	//* 481 1127:iload_3         
	//* 482 1128:iload           4
	//* 483 1130:invokestatic    #357 <Method ahb ahb.a(int, int)>
	//* 484 1133:invokeinterface #360 <Method void afn.a(ahb)>
	//* 485 1138:aload_0         
	//* 486 1139:aload_1         
	//* 487 1140:iconst_0        
	//* 488 1141:iaload          
	//* 489 1142:aload_1         
	//* 490 1143:iconst_1        
	//* 491 1144:iaload          
	//* 492 1145:invokespecial   #168 <Method void b(int, int)>
	//* 493 1148:aload_0         
	//* 494 1149:ldc2            #362 <String "resized">
	//* 495 1152:invokevirtual   #364 <Method void ni.c(String)>
	//* 496 1155:aload           7
	//* 497 1157:monitorexit     
	//* 498 1158:return          
	//* 499 1159:astore_1        
	//* 500 1160:aload_1         
	//* 501 1161:invokevirtual   #368 <Method String RuntimeException.getMessage()>
	//* 502 1164:invokestatic    #372 <Method String String.valueOf(Object)>
	//* 503 1167:astore_1        
	//* 504 1168:aload_1         
	//* 505 1169:invokevirtual   #375 <Method int String.length()>
	//* 506 1172:ifeq            1186
	//* 507 1175:ldc2            #377 <String "Cannot show popup window: ">
	//* 508 1178:aload_1         
	//* 509 1179:invokevirtual   #381 <Method String String.concat(String)>
	//* 510 1182:astore_1        
	//* 511 1183:goto            1197
	//* 512 1186:new             #42  <Class String>
	//* 513 1189:dup             
	//* 514 1190:ldc2            #377 <String "Cannot show popup window: ">
	//* 515 1193:invokespecial   #383 <Method void String(String)>
	//* 516 1196:astore_1        
	//* 517 1197:aload_0         
	//* 518 1198:aload_1         
	//* 519 1199:invokevirtual   #178 <Method void ni.a(String)>
	//* 520 1202:aload_0         
	//* 521 1203:getfield        #291 <Field RelativeLayout r>
	//* 522 1206:aload_0         
	//* 523 1207:getfield        #95  <Field afn k>
	//* 524 1210:invokeinterface #250 <Method View afn.getView()>
	//* 525 1215:invokevirtual   #384 <Method void RelativeLayout.removeView(View)>
	//* 526 1218:aload_0         
	//* 527 1219:getfield        #264 <Field ViewGroup s>
	//* 528 1222:ifnull          1265
	//* 529 1225:aload_0         
	//* 530 1226:getfield        #264 <Field ViewGroup s>
	//* 531 1229:aload_0         
	//* 532 1230:getfield        #274 <Field ImageView n>
	//* 533 1233:invokevirtual   #262 <Method void ViewGroup.removeView(View)>
	//* 534 1236:aload_0         
	//* 535 1237:getfield        #264 <Field ViewGroup s>
	//* 536 1240:aload_0         
	//* 537 1241:getfield        #95  <Field afn k>
	//* 538 1244:invokeinterface #250 <Method View afn.getView()>
	//* 539 1249:invokevirtual   #283 <Method void ViewGroup.addView(View)>
	//* 540 1252:aload_0         
	//* 541 1253:getfield        #95  <Field afn k>
	//* 542 1256:aload_0         
	//* 543 1257:getfield        #280 <Field ahb m>
	//* 544 1260:invokeinterface #360 <Method void afn.a(ahb)>
	//* 545 1265:aload           7
	//* 546 1267:monitorexit     
	//* 547 1268:return          
	//* 548 1269:aload_0         
	//* 549 1270:ldc2            #386 <String "Webview is detached, probably in the middle of a resize or expand.">
	//* 550 1273:invokevirtual   #178 <Method void ni.a(String)>
	//* 551 1276:aload           7
	//* 552 1278:monitorexit     
	//* 553 1279:return          
	//* 554 1280:aload_0         
	//* 555 1281:ldc2            #388 <String "Activity context is not ready, cannot get window or decor view.">
	//* 556 1284:invokevirtual   #178 <Method void ni.a(String)>
	//* 557 1287:aload           7
	//* 558 1289:monitorexit     
	//* 559 1290:return          
	//* 560 1291:astore_1        
	//* 561 1292:aload           7
	//* 562 1294:monitorexit     
	//* 563 1295:aload_1         
	//* 564 1296:athrow          
			i1 = 0;
	//  565 1297:iconst_0        
	//  566 1298:istore_2        
		if(i1 != 0)
			break MISSING_BLOCK_LABEL_343;
		((ni)this).a("Invalid width and height options. Cannot resize.");
		obj;
		JVM INSTR monitorexit ;
		return;
		obj1 = ((Object) (l.getWindow()));
		if(obj1 == null) goto _L2; else goto _L1
_L1:
		if(((Window) (obj1)).getDecorView() != null) goto _L3; else goto _L2
_L3:
		map = ((Map) (b()));
		if(map != null)
			break MISSING_BLOCK_LABEL_387;
		((ni)this).a("Resize location out of screen or close button is not visible.");
		obj;
		JVM INSTR monitorexit ;
		return;
		bwk.a();
		j1 = zv.a(((android.content.Context) (l)), i);
		bwk.a();
		k1 = zv.a(((android.content.Context) (l)), f);
		obj2 = ((Object) (k.getView().getParent()));
		if(obj2 == null) goto _L5; else goto _L4
_L4:
		if(!(obj2 instanceof ViewGroup)) goto _L5; else goto _L6
_L6:
		((ViewGroup)obj2).removeView(k.getView());
		if(q == null)
		{
			s = (ViewGroup)obj2;
			aw.e();
			obj2 = ((Object) (xg.a(k.getView())));
			n = new ImageView(((android.content.Context) (l)));
			n.setImageBitmap(((android.graphics.Bitmap) (obj2)));
			m = k.u();
			s.addView(((View) (n)));
			break MISSING_BLOCK_LABEL_556;
		}
		q.dismiss();
		r = new RelativeLayout(((android.content.Context) (l)));
		r.setBackgroundColor(0);
		r.setLayoutParams(new android.view.ViewGroup.LayoutParams(j1, k1));
		aw.e();
		q = xg.a(((View) (r)), j1, k1, false);
		q.setOutsideTouchable(true);
		q.setTouchable(true);
		obj2 = ((Object) (q));
		if(!c)
			flag = true;
		else
	//* 567 1299:goto            329
			flag = false;
	//  568 1302:iconst_0        
	//  569 1303:istore          6
		((PopupWindow) (obj2)).setClippingEnabled(flag);
		r.addView(k.getView(), -1, -1);
		o = new LinearLayout(((android.content.Context) (l)));
		bwk.a();
		i1 = zv.a(((android.content.Context) (l)), 50);
		bwk.a();
		obj2 = ((Object) (new android.widget.RelativeLayout.LayoutParams(i1, zv.a(((android.content.Context) (l)), 50))));
		s1 = b;
		s1.hashCode();
		JVM INSTR lookupswitch 6: default 1308
	//	               -1364013995: 871
	//	               -1012429441: 856
	//	               -655373719: 841
	//	               1163912186: 826
	//	               1288627767: 811
	//	               1755462605: 796;
		   goto _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L13:
		if(!s1.equals("top-center")) goto _L7; else goto _L14
_L14:
		i1 = 1;
		  goto _L15
_L12:
		if(!s1.equals("bottom-center")) goto _L7; else goto _L16
_L16:
		i1 = 4;
		  goto _L15
_L11:
		if(!s1.equals("bottom-right")) goto _L7; else goto _L17
_L17:
		i1 = 5;
		  goto _L15
_L10:
		if(!s1.equals("bottom-left")) goto _L7; else goto _L18
_L18:
		i1 = 3;
		  goto _L15
_L9:
		if(!s1.equals("top-left")) goto _L7; else goto _L19
_L19:
		i1 = 0;
		  goto _L15
_L8:
		if(!s1.equals("center")) goto _L7; else goto _L20
_L20:
		i1 = 2;
		  goto _L15
_L26:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
		  goto _L21
_L32:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
		  goto _L22
_L31:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(14);
		  goto _L22
_L30:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9);
		  goto _L22
_L29:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(13);
		  goto _L22
_L28:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(14);
		  goto _L22
_L27:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9);
		  goto _L22
_L21:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
_L22:
		o.setOnClickListener(((android.view.View.OnClickListener) (new mz(this))));
		o.setContentDescription("Close button");
		r.addView(((View) (o)), ((android.view.ViewGroup.LayoutParams) (obj2)));
		obj2 = ((Object) (q));
		obj1 = ((Object) (((Window) (obj1)).getDecorView()));
		bwk.a();
		i1 = zv.a(((android.content.Context) (l)), map[0]);
		bwk.a();
		((PopupWindow) (obj2)).showAtLocation(((View) (obj1)), 0, i1, zv.a(((android.content.Context) (l)), map[1]));
		i1 = map[0];
		l1 = map[1];
		if(p != null)
			p.a(i1, l1, i, f);
		k.a(ahb.a(j1, k1));
		b(map[0], map[1]);
		((ni)this).c("resized");
		obj;
		JVM INSTR monitorexit ;
		return;
		map;
		map = ((Map) (String.valueOf(((Object) (((RuntimeException) (map)).getMessage())))));
		if(((String) (map)).length() == 0) goto _L24; else goto _L23
_L23:
		map = ((Map) ("Cannot show popup window: ".concat(((String) (map)))));
		  goto _L25
_L24:
		map = ((Map) (new String("Cannot show popup window: ")));
_L25:
		((ni)this).a(((String) (map)));
		r.removeView(k.getView());
		if(s != null)
		{
			s.removeView(((View) (n)));
			s.addView(k.getView());
			k.a(m);
		}
		obj;
		JVM INSTR monitorexit ;
		return;
_L5:
		((ni)this).a("Webview is detached, probably in the middle of a resize or expand.");
		obj;
		JVM INSTR monitorexit ;
		return;
_L2:
		((ni)this).a("Activity context is not ready, cannot get window or decor view.");
		obj;
		JVM INSTR monitorexit ;
		return;
		map;
		obj;
		JVM INSTR monitorexit ;
		throw map;
	//* 570 1305:goto            650
_L7:
		i1 = -1;
	//  571 1308:iconst_m1       
	//  572 1309:istore_2        
_L15:
		i1;
	//  573 1310:iload_2         
		JVM INSTR tableswitch 0 5: default 1348
	//	               0 974
	//	               1 957
	//	               2 947
	//	               3 930
	//	               4 913
	//	               5 896;
	//  574 1311:tableswitch     0 5: default 1348
	//	               0 974
	//	               1 957
	//	               2 947
	//	               3 930
	//	               4 913
	//	               5 896
		   goto _L26 _L27 _L28 _L29 _L30 _L31 _L32
	//* 575 1348:goto            886
	}

	public final void a(boolean flag)
	{
		Object obj = j;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Object j>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(q == null)
			break MISSING_BLOCK_LABEL_131;
	//    5    7:aload_0         
	//    6    8:getfield        #143 <Field PopupWindow q>
	//    7   11:ifnull          131
		q.dismiss();
	//    8   14:aload_0         
	//    9   15:getfield        #143 <Field PopupWindow q>
	//   10   18:invokevirtual   #286 <Method void PopupWindow.dismiss()>
		r.removeView(k.getView());
	//   11   21:aload_0         
	//   12   22:getfield        #291 <Field RelativeLayout r>
	//   13   25:aload_0         
	//   14   26:getfield        #95  <Field afn k>
	//   15   29:invokeinterface #250 <Method View afn.getView()>
	//   16   34:invokevirtual   #384 <Method void RelativeLayout.removeView(View)>
		if(s != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #264 <Field ViewGroup s>
	//*  19   41:ifnull          84
		{
			s.removeView(((View) (n)));
	//   20   44:aload_0         
	//   21   45:getfield        #264 <Field ViewGroup s>
	//   22   48:aload_0         
	//   23   49:getfield        #274 <Field ImageView n>
	//   24   52:invokevirtual   #262 <Method void ViewGroup.removeView(View)>
			s.addView(k.getView());
	//   25   55:aload_0         
	//   26   56:getfield        #264 <Field ViewGroup s>
	//   27   59:aload_0         
	//   28   60:getfield        #95  <Field afn k>
	//   29   63:invokeinterface #250 <Method View afn.getView()>
	//   30   68:invokevirtual   #283 <Method void ViewGroup.addView(View)>
			k.a(m);
	//   31   71:aload_0         
	//   32   72:getfield        #95  <Field afn k>
	//   33   75:aload_0         
	//   34   76:getfield        #280 <Field ahb m>
	//   35   79:invokeinterface #360 <Method void afn.a(ahb)>
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_111;
	//   36   84:iload_1         
	//   37   85:ifeq            111
		((ni)this).c("default");
	//   38   88:aload_0         
	//   39   89:ldc2            #390 <String "default">
	//   40   92:invokevirtual   #364 <Method void ni.c(String)>
		if(p != null)
	//*  41   95:aload_0         
	//*  42   96:getfield        #104 <Field nj p>
	//*  43   99:ifnull          111
			p.L();
	//   44  102:aload_0         
	//   45  103:getfield        #104 <Field nj p>
	//   46  106:invokeinterface #393 <Method void nj.L()>
		q = null;
	//   47  111:aload_0         
	//   48  112:aconst_null     
	//   49  113:putfield        #143 <Field PopupWindow q>
		r = null;
	//   50  116:aload_0         
	//   51  117:aconst_null     
	//   52  118:putfield        #291 <Field RelativeLayout r>
		s = null;
	//   53  121:aload_0         
	//   54  122:aconst_null     
	//   55  123:putfield        #264 <Field ViewGroup s>
		o = null;
	//   56  126:aload_0         
	//   57  127:aconst_null     
	//   58  128:putfield        #323 <Field LinearLayout o>
		obj;
	//   59  131:aload_2         
		JVM INSTR monitorexit ;
	//   60  132:monitorexit     
		return;
	//   61  133:return          
		Exception exception;
		exception;
	//   62  134:astore_3        
		obj;
	//   63  135:aload_2         
		JVM INSTR monitorexit ;
	//   64  136:monitorexit     
		throw exception;
	//   65  137:aload_3         
	//   66  138:athrow          
	}

	public final boolean a()
	{
		Object obj = j;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Object j>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(q != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #143 <Field PopupWindow q>
	//*   7   11:ifnull          28
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:aload_2         
	//*  12   20:monitorexit     
	//*  13   21:iload_1         
	//*  14   22:ireturn         
	//*  15   23:astore_3        
	//*  16   24:aload_2         
	//*  17   25:monitorexit     
	//*  18   26:aload_3         
	//*  19   27:athrow          
			flag = false;
	//   20   28:iconst_0        
	//   21   29:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   30:goto            19
	}

	private static final Set a = com.google.android.gms.common.util.f.b(((Object []) (new String[] {
		"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
	})));
	private String b;
	private boolean c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private final Object j = new Object();
	private final afn k;
	private final Activity l;
	private ahb m;
	private ImageView n;
	private LinearLayout o;
	private nj p;
	private PopupWindow q;
	private RelativeLayout r;
	private ViewGroup s;

	static 
	{
	//    0    0:bipush          7
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #44  <String "top-left">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #46  <String "top-right">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #48  <String "top-center">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #50  <String "center">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #52  <String "bottom-left">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #54  <String "bottom-right">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #56  <String "bottom-center">
	//   29   40:aastore         
	//   30   41:invokestatic    #61  <Method Set f.b(Object[])>
	//   31   44:putstatic       #63  <Field Set a>
	//*  32   47:return          
	}
}
