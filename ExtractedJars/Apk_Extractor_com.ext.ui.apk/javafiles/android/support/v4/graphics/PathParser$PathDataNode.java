// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Path;
import android.util.Log;

// Referenced classes of package android.support.v4.graphics:
//			PathParser

public static class PathParser$PathDataNode
{

	private static void addCommand(Path path, float af[], char c, char c1, float af1[])
	{
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		f5 = af[0];
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:faload          
	//    3    3:fstore          10
		f4 = af[1];
	//    4    5:aload_1         
	//    5    6:iconst_1        
	//    6    7:faload          
	//    7    8:fstore          9
		f3 = af[2];
	//    8   10:aload_1         
	//    9   11:iconst_2        
	//   10   12:faload          
	//   11   13:fstore          8
		f2 = af[3];
	//   12   15:aload_1         
	//   13   16:iconst_3        
	//   14   17:faload          
	//   15   18:fstore          7
		f = af[4];
	//   16   20:aload_1         
	//   17   21:iconst_4        
	//   18   22:faload          
	//   19   23:fstore          5
		f1 = af[5];
	//   20   25:aload_1         
	//   21   26:iconst_5        
	//   22   27:faload          
	//   23   28:fstore          6
		c1;
	//   24   30:iload_3         
		JVM INSTR lookupswitch 20: default 200
	//	               65: 478
	//	               67: 465
	//	               72: 459
	//	               76: 453
	//	               77: 453
	//	               81: 472
	//	               83: 472
	//	               84: 453
	//	               86: 459
	//	               90: 419
	//	               97: 478
	//	               99: 465
	//	               104: 459
	//	               108: 453
	//	               109: 453
	//	               113: 472
	//	               115: 472
	//	               116: 453
	//	               118: 459
	//	               122: 419;
	//   25   31:lookupswitch    20: default 200
	//	               65: 478
	//	               67: 465
	//	               72: 459
	//	               76: 453
	//	               77: 453
	//	               81: 472
	//	               83: 472
	//	               84: 453
	//	               86: 459
	//	               90: 419
	//	               97: 478
	//	               99: 465
	//	               104: 459
	//	               108: 453
	//	               109: 453
	//	               113: 472
	//	               115: 472
	//	               116: 453
	//	               118: 459
	//	               122: 419
		   goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L6 _L5 _L4 _L7 _L2 _L3 _L4 _L5 _L5 _L6 _L6 _L5 _L4 _L7
_L1:
		byte byte0 = 2;
	//   26  200:iconst_2        
	//   27  201:istore          14
_L32:
		char c2;
		boolean flag = false;
	//   28  203:iconst_0        
	//   29  204:istore          16
		c2 = c;
	//   30  206:iload_2         
	//   31  207:istore          15
		c = ((char) (flag));
	//   32  209:iload           16
	//   33  211:istore_2        
_L29:
		if(c >= af1.length) goto _L9; else goto _L8
	//   34  212:iload_2         
	//   35  213:aload           4
	//   36  215:arraylength     
	//   37  216:icmpge          2217
_L8:
		c1;
	//   38  219:iload_3         
		JVM INSTR lookupswitch 18: default 376
	//	               65: 2074
	//	               67: 1122
	//	               72: 876
	//	               76: 776
	//	               77: 593
	//	               81: 1602
	//	               83: 1366
	//	               84: 1810
	//	               86: 960
	//	               97: 1919
	//	               99: 1003
	//	               104: 827
	//	               108: 707
	//	               109: 485
	//	               113: 1495
	//	               115: 1209
	//	               116: 1677
	//	               118: 915;
	//   39  220:lookupswitch    18: default 376
	//	               65: 2074
	//	               67: 1122
	//	               72: 876
	//	               76: 776
	//	               77: 593
	//	               81: 1602
	//	               83: 1366
	//	               84: 1810
	//	               86: 960
	//	               97: 1919
	//	               99: 1003
	//	               104: 827
	//	               108: 707
	//	               109: 485
	//	               113: 1495
	//	               115: 1209
	//	               116: 1677
	//	               118: 915
		   goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L10:
		float f6 = f1;
	//   40  376:fload           6
	//   41  378:fstore          11
		f1 = f2;
	//   42  380:fload           7
	//   43  382:fstore          6
		f2 = f;
	//   44  384:fload           5
	//   45  386:fstore          7
		f = f6;
	//   46  388:fload           11
	//   47  390:fstore          5
_L30:
		c += ((char) (byte0));
	//   48  392:iload_2         
	//   49  393:iload           14
	//   50  395:iadd            
	//   51  396:istore_2        
		float f7 = f2;
	//   52  397:fload           7
	//   53  399:fstore          11
		c2 = c1;
	//   54  401:iload_3         
	//   55  402:istore          15
		f2 = f1;
	//   56  404:fload           6
	//   57  406:fstore          7
		f1 = f;
	//   58  408:fload           5
	//   59  410:fstore          6
		f = f7;
	//   60  412:fload           11
	//   61  414:fstore          5
		  goto _L29
	//*  62  416:goto            212
_L7:
		path.close();
	//   63  419:aload_0         
	//   64  420:invokevirtual   #37  <Method void Path.close()>
		path.moveTo(f, f1);
	//   65  423:aload_0         
	//   66  424:fload           5
	//   67  426:fload           6
	//   68  428:invokevirtual   #41  <Method void Path.moveTo(float, float)>
		f2 = f1;
	//   69  431:fload           6
	//   70  433:fstore          7
		f3 = f;
	//   71  435:fload           5
	//   72  437:fstore          8
		f4 = f1;
	//   73  439:fload           6
	//   74  441:fstore          9
		f5 = f;
	//   75  443:fload           5
	//   76  445:fstore          10
		byte0 = 2;
	//   77  447:iconst_2        
	//   78  448:istore          14
		continue; /* Loop/switch isn't completed */
	//   79  450:goto            203
_L5:
		byte0 = 2;
	//   80  453:iconst_2        
	//   81  454:istore          14
		continue; /* Loop/switch isn't completed */
	//   82  456:goto            203
_L4:
		byte0 = 1;
	//   83  459:iconst_1        
	//   84  460:istore          14
		continue; /* Loop/switch isn't completed */
	//   85  462:goto            203
_L3:
		byte0 = 6;
	//   86  465:bipush          6
	//   87  467:istore          14
		continue; /* Loop/switch isn't completed */
	//   88  469:goto            203
_L6:
		byte0 = 4;
	//   89  472:iconst_4        
	//   90  473:istore          14
		continue; /* Loop/switch isn't completed */
	//   91  475:goto            203
_L2:
		byte0 = 7;
	//   92  478:bipush          7
	//   93  480:istore          14
		continue; /* Loop/switch isn't completed */
	//   94  482:goto            203
_L24:
		f5 += af1[c + 0];
	//   95  485:fload           10
	//   96  487:aload           4
	//   97  489:iload_2         
	//   98  490:iconst_0        
	//   99  491:iadd            
	//  100  492:faload          
	//  101  493:fadd            
	//  102  494:fstore          10
		f4 = af1[c + 1] + f4;
	//  103  496:aload           4
	//  104  498:iload_2         
	//  105  499:iconst_1        
	//  106  500:iadd            
	//  107  501:faload          
	//  108  502:fload           9
	//  109  504:fadd            
	//  110  505:fstore          9
		if(c > 0)
	//* 111  507:iload_2         
	//* 112  508:ifle            546
		{
			path.rLineTo(af1[c + 0], af1[c + 1]);
	//  113  511:aload_0         
	//  114  512:aload           4
	//  115  514:iload_2         
	//  116  515:iconst_0        
	//  117  516:iadd            
	//  118  517:faload          
	//  119  518:aload           4
	//  120  520:iload_2         
	//  121  521:iconst_1        
	//  122  522:iadd            
	//  123  523:faload          
	//  124  524:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			float f8 = f;
	//  125  527:fload           5
	//  126  529:fstore          11
			f = f1;
	//  127  531:fload           6
	//  128  533:fstore          5
			f1 = f2;
	//  129  535:fload           7
	//  130  537:fstore          6
			f2 = f8;
	//  131  539:fload           11
	//  132  541:fstore          7
		} else
	//* 133  543:goto            392
		{
			path.rMoveTo(af1[c + 0], af1[c + 1]);
	//  134  546:aload_0         
	//  135  547:aload           4
	//  136  549:iload_2         
	//  137  550:iconst_0        
	//  138  551:iadd            
	//  139  552:faload          
	//  140  553:aload           4
	//  141  555:iload_2         
	//  142  556:iconst_1        
	//  143  557:iadd            
	//  144  558:faload          
	//  145  559:invokevirtual   #47  <Method void Path.rMoveTo(float, float)>
			float f22 = f4;
	//  146  562:fload           9
	//  147  564:fstore          12
			float f9 = f5;
	//  148  566:fload           10
	//  149  568:fstore          11
			f1 = f2;
	//  150  570:fload           7
	//  151  572:fstore          6
			f = f4;
	//  152  574:fload           9
	//  153  576:fstore          5
			f2 = f5;
	//  154  578:fload           10
	//  155  580:fstore          7
			f4 = f22;
	//  156  582:fload           12
	//  157  584:fstore          9
			f5 = f9;
	//  158  586:fload           11
	//  159  588:fstore          10
		}
		  goto _L30
	//* 160  590:goto            392
_L15:
		f4 = af1[c + 0];
	//  161  593:aload           4
	//  162  595:iload_2         
	//  163  596:iconst_0        
	//  164  597:iadd            
	//  165  598:faload          
	//  166  599:fstore          9
		f5 = af1[c + 1];
	//  167  601:aload           4
	//  168  603:iload_2         
	//  169  604:iconst_1        
	//  170  605:iadd            
	//  171  606:faload          
	//  172  607:fstore          10
		if(c > 0)
	//* 173  609:iload_2         
	//* 174  610:ifle            660
		{
			path.lineTo(af1[c + 0], af1[c + 1]);
	//  175  613:aload_0         
	//  176  614:aload           4
	//  177  616:iload_2         
	//  178  617:iconst_0        
	//  179  618:iadd            
	//  180  619:faload          
	//  181  620:aload           4
	//  182  622:iload_2         
	//  183  623:iconst_1        
	//  184  624:iadd            
	//  185  625:faload          
	//  186  626:invokevirtual   #50  <Method void Path.lineTo(float, float)>
			float f10 = f4;
	//  187  629:fload           9
	//  188  631:fstore          11
			f4 = f;
	//  189  633:fload           5
	//  190  635:fstore          9
			f = f1;
	//  191  637:fload           6
	//  192  639:fstore          5
			f1 = f2;
	//  193  641:fload           7
	//  194  643:fstore          6
			f2 = f4;
	//  195  645:fload           9
	//  196  647:fstore          7
			f4 = f5;
	//  197  649:fload           10
	//  198  651:fstore          9
			f5 = f10;
	//  199  653:fload           11
	//  200  655:fstore          10
		} else
	//* 201  657:goto            392
		{
			path.moveTo(af1[c + 0], af1[c + 1]);
	//  202  660:aload_0         
	//  203  661:aload           4
	//  204  663:iload_2         
	//  205  664:iconst_0        
	//  206  665:iadd            
	//  207  666:faload          
	//  208  667:aload           4
	//  209  669:iload_2         
	//  210  670:iconst_1        
	//  211  671:iadd            
	//  212  672:faload          
	//  213  673:invokevirtual   #41  <Method void Path.moveTo(float, float)>
			float f23 = f5;
	//  214  676:fload           10
	//  215  678:fstore          12
			float f11 = f4;
	//  216  680:fload           9
	//  217  682:fstore          11
			f1 = f2;
	//  218  684:fload           7
	//  219  686:fstore          6
			f = f5;
	//  220  688:fload           10
	//  221  690:fstore          5
			f2 = f4;
	//  222  692:fload           9
	//  223  694:fstore          7
			f4 = f23;
	//  224  696:fload           12
	//  225  698:fstore          9
			f5 = f11;
	//  226  700:fload           11
	//  227  702:fstore          10
		}
		  goto _L30
	//* 228  704:goto            392
_L23:
		path.rLineTo(af1[c + 0], af1[c + 1]);
	//  229  707:aload_0         
	//  230  708:aload           4
	//  231  710:iload_2         
	//  232  711:iconst_0        
	//  233  712:iadd            
	//  234  713:faload          
	//  235  714:aload           4
	//  236  716:iload_2         
	//  237  717:iconst_1        
	//  238  718:iadd            
	//  239  719:faload          
	//  240  720:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		float f24 = af1[c + 0];
	//  241  723:aload           4
	//  242  725:iload_2         
	//  243  726:iconst_0        
	//  244  727:iadd            
	//  245  728:faload          
	//  246  729:fstore          12
		float f12 = af1[c + 1];
	//  247  731:aload           4
	//  248  733:iload_2         
	//  249  734:iconst_1        
	//  250  735:iadd            
	//  251  736:faload          
	//  252  737:fstore          11
		f12 += f4;
	//  253  739:fload           11
	//  254  741:fload           9
	//  255  743:fadd            
	//  256  744:fstore          11
		f5 += f24;
	//  257  746:fload           10
	//  258  748:fload           12
	//  259  750:fadd            
	//  260  751:fstore          10
		f4 = f;
	//  261  753:fload           5
	//  262  755:fstore          9
		f = f1;
	//  263  757:fload           6
	//  264  759:fstore          5
		f1 = f2;
	//  265  761:fload           7
	//  266  763:fstore          6
		f2 = f4;
	//  267  765:fload           9
	//  268  767:fstore          7
		f4 = f12;
	//  269  769:fload           11
	//  270  771:fstore          9
		  goto _L30
	//* 271  773:goto            392
_L14:
		path.lineTo(af1[c + 0], af1[c + 1]);
	//  272  776:aload_0         
	//  273  777:aload           4
	//  274  779:iload_2         
	//  275  780:iconst_0        
	//  276  781:iadd            
	//  277  782:faload          
	//  278  783:aload           4
	//  279  785:iload_2         
	//  280  786:iconst_1        
	//  281  787:iadd            
	//  282  788:faload          
	//  283  789:invokevirtual   #50  <Method void Path.lineTo(float, float)>
		f5 = af1[c + 0];
	//  284  792:aload           4
	//  285  794:iload_2         
	//  286  795:iconst_0        
	//  287  796:iadd            
	//  288  797:faload          
	//  289  798:fstore          10
		f4 = af1[c + 1];
	//  290  800:aload           4
	//  291  802:iload_2         
	//  292  803:iconst_1        
	//  293  804:iadd            
	//  294  805:faload          
	//  295  806:fstore          9
		float f13 = f;
	//  296  808:fload           5
	//  297  810:fstore          11
		f = f1;
	//  298  812:fload           6
	//  299  814:fstore          5
		f1 = f2;
	//  300  816:fload           7
	//  301  818:fstore          6
		f2 = f13;
	//  302  820:fload           11
	//  303  822:fstore          7
		  goto _L30
	//* 304  824:goto            392
_L22:
		path.rLineTo(af1[c + 0], 0.0F);
	//  305  827:aload_0         
	//  306  828:aload           4
	//  307  830:iload_2         
	//  308  831:iconst_0        
	//  309  832:iadd            
	//  310  833:faload          
	//  311  834:fconst_0        
	//  312  835:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		float f14 = af1[c + 0];
	//  313  838:aload           4
	//  314  840:iload_2         
	//  315  841:iconst_0        
	//  316  842:iadd            
	//  317  843:faload          
	//  318  844:fstore          11
		f14 = f5 + f14;
	//  319  846:fload           10
	//  320  848:fload           11
	//  321  850:fadd            
	//  322  851:fstore          11
		f5 = f;
	//  323  853:fload           5
	//  324  855:fstore          10
		f = f1;
	//  325  857:fload           6
	//  326  859:fstore          5
		f1 = f2;
	//  327  861:fload           7
	//  328  863:fstore          6
		f2 = f5;
	//  329  865:fload           10
	//  330  867:fstore          7
		f5 = f14;
	//  331  869:fload           11
	//  332  871:fstore          10
		  goto _L30
	//* 333  873:goto            392
_L13:
		path.lineTo(af1[c + 0], f4);
	//  334  876:aload_0         
	//  335  877:aload           4
	//  336  879:iload_2         
	//  337  880:iconst_0        
	//  338  881:iadd            
	//  339  882:faload          
	//  340  883:fload           9
	//  341  885:invokevirtual   #50  <Method void Path.lineTo(float, float)>
		f5 = af1[c + 0];
	//  342  888:aload           4
	//  343  890:iload_2         
	//  344  891:iconst_0        
	//  345  892:iadd            
	//  346  893:faload          
	//  347  894:fstore          10
		float f15 = f;
	//  348  896:fload           5
	//  349  898:fstore          11
		f = f1;
	//  350  900:fload           6
	//  351  902:fstore          5
		f1 = f2;
	//  352  904:fload           7
	//  353  906:fstore          6
		f2 = f15;
	//  354  908:fload           11
	//  355  910:fstore          7
		  goto _L30
	//* 356  912:goto            392
_L28:
		path.rLineTo(0.0F, af1[c + 0]);
	//  357  915:aload_0         
	//  358  916:fconst_0        
	//  359  917:aload           4
	//  360  919:iload_2         
	//  361  920:iconst_0        
	//  362  921:iadd            
	//  363  922:faload          
	//  364  923:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		float f25 = af1[c + 0];
	//  365  926:aload           4
	//  366  928:iload_2         
	//  367  929:iconst_0        
	//  368  930:iadd            
	//  369  931:faload          
	//  370  932:fstore          12
		float f16 = f;
	//  371  934:fload           5
	//  372  936:fstore          11
		f4 = f25 + f4;
	//  373  938:fload           12
	//  374  940:fload           9
	//  375  942:fadd            
	//  376  943:fstore          9
		f = f1;
	//  377  945:fload           6
	//  378  947:fstore          5
		f1 = f2;
	//  379  949:fload           7
	//  380  951:fstore          6
		f2 = f16;
	//  381  953:fload           11
	//  382  955:fstore          7
		  goto _L30
	//* 383  957:goto            392
_L19:
		path.lineTo(f5, af1[c + 0]);
	//  384  960:aload_0         
	//  385  961:fload           10
	//  386  963:aload           4
	//  387  965:iload_2         
	//  388  966:iconst_0        
	//  389  967:iadd            
	//  390  968:faload          
	//  391  969:invokevirtual   #50  <Method void Path.lineTo(float, float)>
		float f17 = af1[c + 0];
	//  392  972:aload           4
	//  393  974:iload_2         
	//  394  975:iconst_0        
	//  395  976:iadd            
	//  396  977:faload          
	//  397  978:fstore          11
		f4 = f;
	//  398  980:fload           5
	//  399  982:fstore          9
		f = f1;
	//  400  984:fload           6
	//  401  986:fstore          5
		f1 = f2;
	//  402  988:fload           7
	//  403  990:fstore          6
		f2 = f4;
	//  404  992:fload           9
	//  405  994:fstore          7
		f4 = f17;
	//  406  996:fload           11
	//  407  998:fstore          9
		  goto _L30
	//* 408 1000:goto            392
_L21:
		path.rCubicTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3], af1[c + 4], af1[c + 5]);
	//  409 1003:aload_0         
	//  410 1004:aload           4
	//  411 1006:iload_2         
	//  412 1007:iconst_0        
	//  413 1008:iadd            
	//  414 1009:faload          
	//  415 1010:aload           4
	//  416 1012:iload_2         
	//  417 1013:iconst_1        
	//  418 1014:iadd            
	//  419 1015:faload          
	//  420 1016:aload           4
	//  421 1018:iload_2         
	//  422 1019:iconst_2        
	//  423 1020:iadd            
	//  424 1021:faload          
	//  425 1022:aload           4
	//  426 1024:iload_2         
	//  427 1025:iconst_3        
	//  428 1026:iadd            
	//  429 1027:faload          
	//  430 1028:aload           4
	//  431 1030:iload_2         
	//  432 1031:iconst_4        
	//  433 1032:iadd            
	//  434 1033:faload          
	//  435 1034:aload           4
	//  436 1036:iload_2         
	//  437 1037:iconst_5        
	//  438 1038:iadd            
	//  439 1039:faload          
	//  440 1040:invokevirtual   #54  <Method void Path.rCubicTo(float, float, float, float, float, float)>
		f3 = af1[c + 2];
	//  441 1043:aload           4
	//  442 1045:iload_2         
	//  443 1046:iconst_2        
	//  444 1047:iadd            
	//  445 1048:faload          
	//  446 1049:fstore          8
		float f26 = af1[c + 3];
	//  447 1051:aload           4
	//  448 1053:iload_2         
	//  449 1054:iconst_3        
	//  450 1055:iadd            
	//  451 1056:faload          
	//  452 1057:fstore          12
		f2 = af1[c + 4];
	//  453 1059:aload           4
	//  454 1061:iload_2         
	//  455 1062:iconst_4        
	//  456 1063:iadd            
	//  457 1064:faload          
	//  458 1065:fstore          7
		float f18 = af1[c + 5];
	//  459 1067:aload           4
	//  460 1069:iload_2         
	//  461 1070:iconst_5        
	//  462 1071:iadd            
	//  463 1072:faload          
	//  464 1073:fstore          11
		f3 = f5 + f3;
	//  465 1075:fload           10
	//  466 1077:fload           8
	//  467 1079:fadd            
	//  468 1080:fstore          8
		f18 += f4;
	//  469 1082:fload           11
	//  470 1084:fload           9
	//  471 1086:fadd            
	//  472 1087:fstore          11
		f5 += f2;
	//  473 1089:fload           10
	//  474 1091:fload           7
	//  475 1093:fadd            
	//  476 1094:fstore          10
		f2 = f;
	//  477 1096:fload           5
	//  478 1098:fstore          7
		f4 = f26 + f4;
	//  479 1100:fload           12
	//  480 1102:fload           9
	//  481 1104:fadd            
	//  482 1105:fstore          9
		f = f1;
	//  483 1107:fload           6
	//  484 1109:fstore          5
		f1 = f4;
	//  485 1111:fload           9
	//  486 1113:fstore          6
		f4 = f18;
	//  487 1115:fload           11
	//  488 1117:fstore          9
		  goto _L30
	//* 489 1119:goto            392
_L12:
		path.cubicTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3], af1[c + 4], af1[c + 5]);
	//  490 1122:aload_0         
	//  491 1123:aload           4
	//  492 1125:iload_2         
	//  493 1126:iconst_0        
	//  494 1127:iadd            
	//  495 1128:faload          
	//  496 1129:aload           4
	//  497 1131:iload_2         
	//  498 1132:iconst_1        
	//  499 1133:iadd            
	//  500 1134:faload          
	//  501 1135:aload           4
	//  502 1137:iload_2         
	//  503 1138:iconst_2        
	//  504 1139:iadd            
	//  505 1140:faload          
	//  506 1141:aload           4
	//  507 1143:iload_2         
	//  508 1144:iconst_3        
	//  509 1145:iadd            
	//  510 1146:faload          
	//  511 1147:aload           4
	//  512 1149:iload_2         
	//  513 1150:iconst_4        
	//  514 1151:iadd            
	//  515 1152:faload          
	//  516 1153:aload           4
	//  517 1155:iload_2         
	//  518 1156:iconst_5        
	//  519 1157:iadd            
	//  520 1158:faload          
	//  521 1159:invokevirtual   #57  <Method void Path.cubicTo(float, float, float, float, float, float)>
		f5 = af1[c + 4];
	//  522 1162:aload           4
	//  523 1164:iload_2         
	//  524 1165:iconst_4        
	//  525 1166:iadd            
	//  526 1167:faload          
	//  527 1168:fstore          10
		f4 = af1[c + 5];
	//  528 1170:aload           4
	//  529 1172:iload_2         
	//  530 1173:iconst_5        
	//  531 1174:iadd            
	//  532 1175:faload          
	//  533 1176:fstore          9
		f3 = af1[c + 2];
	//  534 1178:aload           4
	//  535 1180:iload_2         
	//  536 1181:iconst_2        
	//  537 1182:iadd            
	//  538 1183:faload          
	//  539 1184:fstore          8
		float f19 = af1[c + 3];
	//  540 1186:aload           4
	//  541 1188:iload_2         
	//  542 1189:iconst_3        
	//  543 1190:iadd            
	//  544 1191:faload          
	//  545 1192:fstore          11
		f2 = f;
	//  546 1194:fload           5
	//  547 1196:fstore          7
		f = f1;
	//  548 1198:fload           6
	//  549 1200:fstore          5
		f1 = f19;
	//  550 1202:fload           11
	//  551 1204:fstore          6
		  goto _L30
	//* 552 1206:goto            392
_L26:
		float f21;
		float f27;
		float f28;
		boolean flag1;
		boolean flag2;
		if(c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S')
	//* 553 1209:iload           15
	//* 554 1211:bipush          99
	//* 555 1213:icmpeq          1237
	//* 556 1216:iload           15
	//* 557 1218:bipush          115
	//* 558 1220:icmpeq          1237
	//* 559 1223:iload           15
	//* 560 1225:bipush          67
	//* 561 1227:icmpeq          1237
	//* 562 1230:iload           15
	//* 563 1232:bipush          83
	//* 564 1234:icmpne          2264
		{
			float f20 = f5 - f3;
	//  565 1237:fload           10
	//  566 1239:fload           8
	//  567 1241:fsub            
	//  568 1242:fstore          11
			f3 = f4 - f2;
	//  569 1244:fload           9
	//  570 1246:fload           7
	//  571 1248:fsub            
	//  572 1249:fstore          8
			f2 = f20;
	//  573 1251:fload           11
	//  574 1253:fstore          7
		} else
	//* 575 1255:aload_0         
	//* 576 1256:fload           7
	//* 577 1258:fload           8
	//* 578 1260:aload           4
	//* 579 1262:iload_2         
	//* 580 1263:iconst_0        
	//* 581 1264:iadd            
	//* 582 1265:faload          
	//* 583 1266:aload           4
	//* 584 1268:iload_2         
	//* 585 1269:iconst_1        
	//* 586 1270:iadd            
	//* 587 1271:faload          
	//* 588 1272:aload           4
	//* 589 1274:iload_2         
	//* 590 1275:iconst_2        
	//* 591 1276:iadd            
	//* 592 1277:faload          
	//* 593 1278:aload           4
	//* 594 1280:iload_2         
	//* 595 1281:iconst_3        
	//* 596 1282:iadd            
	//* 597 1283:faload          
	//* 598 1284:invokevirtual   #54  <Method void Path.rCubicTo(float, float, float, float, float, float)>
	//* 599 1287:aload           4
	//* 600 1289:iload_2         
	//* 601 1290:iconst_0        
	//* 602 1291:iadd            
	//* 603 1292:faload          
	//* 604 1293:fstore          8
	//* 605 1295:aload           4
	//* 606 1297:iload_2         
	//* 607 1298:iconst_1        
	//* 608 1299:iadd            
	//* 609 1300:faload          
	//* 610 1301:fstore          12
	//* 611 1303:aload           4
	//* 612 1305:iload_2         
	//* 613 1306:iconst_2        
	//* 614 1307:iadd            
	//* 615 1308:faload          
	//* 616 1309:fstore          7
	//* 617 1311:aload           4
	//* 618 1313:iload_2         
	//* 619 1314:iconst_3        
	//* 620 1315:iadd            
	//* 621 1316:faload          
	//* 622 1317:fstore          11
	//* 623 1319:fload           10
	//* 624 1321:fload           8
	//* 625 1323:fadd            
	//* 626 1324:fstore          8
	//* 627 1326:fload           11
	//* 628 1328:fload           9
	//* 629 1330:fadd            
	//* 630 1331:fstore          11
	//* 631 1333:fload           10
	//* 632 1335:fload           7
	//* 633 1337:fadd            
	//* 634 1338:fstore          10
	//* 635 1340:fload           5
	//* 636 1342:fstore          7
	//* 637 1344:fload           12
	//* 638 1346:fload           9
	//* 639 1348:fadd            
	//* 640 1349:fstore          9
	//* 641 1351:fload           6
	//* 642 1353:fstore          5
	//* 643 1355:fload           9
	//* 644 1357:fstore          6
	//* 645 1359:fload           11
	//* 646 1361:fstore          9
	//* 647 1363:goto            392
	//* 648 1366:iload           15
	//* 649 1368:bipush          99
	//* 650 1370:icmpeq          1394
	//* 651 1373:iload           15
	//* 652 1375:bipush          115
	//* 653 1377:icmpeq          1394
	//* 654 1380:iload           15
	//* 655 1382:bipush          67
	//* 656 1384:icmpeq          1394
	//* 657 1387:iload           15
	//* 658 1389:bipush          83
	//* 659 1391:icmpne          2257
	//* 660 1394:fconst_2        
	//* 661 1395:fload           10
	//* 662 1397:fmul            
	//* 663 1398:fload           8
	//* 664 1400:fsub            
	//* 665 1401:fstore          8
	//* 666 1403:fconst_2        
	//* 667 1404:fload           9
	//* 668 1406:fmul            
	//* 669 1407:fload           7
	//* 670 1409:fsub            
	//* 671 1410:fstore          9
	//* 672 1412:fload           8
	//* 673 1414:fstore          7
	//* 674 1416:aload_0         
	//* 675 1417:fload           7
	//* 676 1419:fload           9
	//* 677 1421:aload           4
	//* 678 1423:iload_2         
	//* 679 1424:iconst_0        
	//* 680 1425:iadd            
	//* 681 1426:faload          
	//* 682 1427:aload           4
	//* 683 1429:iload_2         
	//* 684 1430:iconst_1        
	//* 685 1431:iadd            
	//* 686 1432:faload          
	//* 687 1433:aload           4
	//* 688 1435:iload_2         
	//* 689 1436:iconst_2        
	//* 690 1437:iadd            
	//* 691 1438:faload          
	//* 692 1439:aload           4
	//* 693 1441:iload_2         
	//* 694 1442:iconst_3        
	//* 695 1443:iadd            
	//* 696 1444:faload          
	//* 697 1445:invokevirtual   #57  <Method void Path.cubicTo(float, float, float, float, float, float)>
	//* 698 1448:aload           4
	//* 699 1450:iload_2         
	//* 700 1451:iconst_0        
	//* 701 1452:iadd            
	//* 702 1453:faload          
	//* 703 1454:fstore          8
	//* 704 1456:aload           4
	//* 705 1458:iload_2         
	//* 706 1459:iconst_1        
	//* 707 1460:iadd            
	//* 708 1461:faload          
	//* 709 1462:fstore          11
	//* 710 1464:aload           4
	//* 711 1466:iload_2         
	//* 712 1467:iconst_2        
	//* 713 1468:iadd            
	//* 714 1469:faload          
	//* 715 1470:fstore          10
	//* 716 1472:aload           4
	//* 717 1474:iload_2         
	//* 718 1475:iconst_3        
	//* 719 1476:iadd            
	//* 720 1477:faload          
	//* 721 1478:fstore          9
	//* 722 1480:fload           5
	//* 723 1482:fstore          7
	//* 724 1484:fload           6
	//* 725 1486:fstore          5
	//* 726 1488:fload           11
	//* 727 1490:fstore          6
	//* 728 1492:goto            392
	//* 729 1495:aload_0         
	//* 730 1496:aload           4
	//* 731 1498:iload_2         
	//* 732 1499:iconst_0        
	//* 733 1500:iadd            
	//* 734 1501:faload          
	//* 735 1502:aload           4
	//* 736 1504:iload_2         
	//* 737 1505:iconst_1        
	//* 738 1506:iadd            
	//* 739 1507:faload          
	//* 740 1508:aload           4
	//* 741 1510:iload_2         
	//* 742 1511:iconst_2        
	//* 743 1512:iadd            
	//* 744 1513:faload          
	//* 745 1514:aload           4
	//* 746 1516:iload_2         
	//* 747 1517:iconst_3        
	//* 748 1518:iadd            
	//* 749 1519:faload          
	//* 750 1520:invokevirtual   #61  <Method void Path.rQuadTo(float, float, float, float)>
	//* 751 1523:aload           4
	//* 752 1525:iload_2         
	//* 753 1526:iconst_0        
	//* 754 1527:iadd            
	//* 755 1528:faload          
	//* 756 1529:fstore          8
	//* 757 1531:aload           4
	//* 758 1533:iload_2         
	//* 759 1534:iconst_1        
	//* 760 1535:iadd            
	//* 761 1536:faload          
	//* 762 1537:fstore          12
	//* 763 1539:aload           4
	//* 764 1541:iload_2         
	//* 765 1542:iconst_2        
	//* 766 1543:iadd            
	//* 767 1544:faload          
	//* 768 1545:fstore          7
	//* 769 1547:aload           4
	//* 770 1549:iload_2         
	//* 771 1550:iconst_3        
	//* 772 1551:iadd            
	//* 773 1552:faload          
	//* 774 1553:fstore          11
	//* 775 1555:fload           10
	//* 776 1557:fload           8
	//* 777 1559:fadd            
	//* 778 1560:fstore          8
	//* 779 1562:fload           11
	//* 780 1564:fload           9
	//* 781 1566:fadd            
	//* 782 1567:fstore          11
	//* 783 1569:fload           10
	//* 784 1571:fload           7
	//* 785 1573:fadd            
	//* 786 1574:fstore          10
	//* 787 1576:fload           5
	//* 788 1578:fstore          7
	//* 789 1580:fload           12
	//* 790 1582:fload           9
	//* 791 1584:fadd            
	//* 792 1585:fstore          9
	//* 793 1587:fload           6
	//* 794 1589:fstore          5
	//* 795 1591:fload           9
	//* 796 1593:fstore          6
	//* 797 1595:fload           11
	//* 798 1597:fstore          9
	//* 799 1599:goto            392
	//* 800 1602:aload_0         
	//* 801 1603:aload           4
	//* 802 1605:iload_2         
	//* 803 1606:iconst_0        
	//* 804 1607:iadd            
	//* 805 1608:faload          
	//* 806 1609:aload           4
	//* 807 1611:iload_2         
	//* 808 1612:iconst_1        
	//* 809 1613:iadd            
	//* 810 1614:faload          
	//* 811 1615:aload           4
	//* 812 1617:iload_2         
	//* 813 1618:iconst_2        
	//* 814 1619:iadd            
	//* 815 1620:faload          
	//* 816 1621:aload           4
	//* 817 1623:iload_2         
	//* 818 1624:iconst_3        
	//* 819 1625:iadd            
	//* 820 1626:faload          
	//* 821 1627:invokevirtual   #64  <Method void Path.quadTo(float, float, float, float)>
	//* 822 1630:aload           4
	//* 823 1632:iload_2         
	//* 824 1633:iconst_0        
	//* 825 1634:iadd            
	//* 826 1635:faload          
	//* 827 1636:fstore          8
	//* 828 1638:aload           4
	//* 829 1640:iload_2         
	//* 830 1641:iconst_1        
	//* 831 1642:iadd            
	//* 832 1643:faload          
	//* 833 1644:fstore          11
	//* 834 1646:aload           4
	//* 835 1648:iload_2         
	//* 836 1649:iconst_2        
	//* 837 1650:iadd            
	//* 838 1651:faload          
	//* 839 1652:fstore          10
	//* 840 1654:aload           4
	//* 841 1656:iload_2         
	//* 842 1657:iconst_3        
	//* 843 1658:iadd            
	//* 844 1659:faload          
	//* 845 1660:fstore          9
	//* 846 1662:fload           5
	//* 847 1664:fstore          7
	//* 848 1666:fload           6
	//* 849 1668:fstore          5
	//* 850 1670:fload           11
	//* 851 1672:fstore          6
	//* 852 1674:goto            392
	//* 853 1677:iload           15
	//* 854 1679:bipush          113
	//* 855 1681:icmpeq          1705
	//* 856 1684:iload           15
	//* 857 1686:bipush          116
	//* 858 1688:icmpeq          1705
	//* 859 1691:iload           15
	//* 860 1693:bipush          81
	//* 861 1695:icmpeq          1705
	//* 862 1698:iload           15
	//* 863 1700:bipush          84
	//* 864 1702:icmpne          2248
	//* 865 1705:fload           10
	//* 866 1707:fload           8
	//* 867 1709:fsub            
	//* 868 1710:fstore          8
	//* 869 1712:fload           9
	//* 870 1714:fload           7
	//* 871 1716:fsub            
	//* 872 1717:fstore          7
	//* 873 1719:aload_0         
	//* 874 1720:fload           8
	//* 875 1722:fload           7
	//* 876 1724:aload           4
	//* 877 1726:iload_2         
	//* 878 1727:iconst_0        
	//* 879 1728:iadd            
	//* 880 1729:faload          
	//* 881 1730:aload           4
	//* 882 1732:iload_2         
	//* 883 1733:iconst_1        
	//* 884 1734:iadd            
	//* 885 1735:faload          
	//* 886 1736:invokevirtual   #61  <Method void Path.rQuadTo(float, float, float, float)>
	//* 887 1739:aload           4
	//* 888 1741:iload_2         
	//* 889 1742:iconst_0        
	//* 890 1743:iadd            
	//* 891 1744:faload          
	//* 892 1745:fstore          13
	//* 893 1747:aload           4
	//* 894 1749:iload_2         
	//* 895 1750:iconst_1        
	//* 896 1751:iadd            
	//* 897 1752:faload          
	//* 898 1753:fstore          12
	//* 899 1755:fload           10
	//* 900 1757:fload           8
	//* 901 1759:fadd            
	//* 902 1760:fstore          11
	//* 903 1762:fload           12
	//* 904 1764:fload           9
	//* 905 1766:fadd            
	//* 906 1767:fstore          12
	//* 907 1769:fload           10
	//* 908 1771:fload           13
	//* 909 1773:fadd            
	//* 910 1774:fstore          10
	//* 911 1776:fload           5
	//* 912 1778:fstore          8
	//* 913 1780:fload           7
	//* 914 1782:fload           9
	//* 915 1784:fadd            
	//* 916 1785:fstore          7
	//* 917 1787:fload           6
	//* 918 1789:fstore          5
	//* 919 1791:fload           7
	//* 920 1793:fstore          6
	//* 921 1795:fload           8
	//* 922 1797:fstore          7
	//* 923 1799:fload           11
	//* 924 1801:fstore          8
	//* 925 1803:fload           12
	//* 926 1805:fstore          9
	//* 927 1807:goto            392
	//* 928 1810:iload           15
	//* 929 1812:bipush          113
	//* 930 1814:icmpeq          1846
	//* 931 1817:iload           15
	//* 932 1819:bipush          116
	//* 933 1821:icmpeq          1846
	//* 934 1824:iload           15
	//* 935 1826:bipush          81
	//* 936 1828:icmpeq          1846
	//* 937 1831:fload           9
	//* 938 1833:fstore          12
	//* 939 1835:fload           10
	//* 940 1837:fstore          11
	//* 941 1839:iload           15
	//* 942 1841:bipush          84
	//* 943 1843:icmpne          1864
	//* 944 1846:fconst_2        
	//* 945 1847:fload           10
	//* 946 1849:fmul            
	//* 947 1850:fload           8
	//* 948 1852:fsub            
	//* 949 1853:fstore          11
	//* 950 1855:fconst_2        
	//* 951 1856:fload           9
	//* 952 1858:fmul            
	//* 953 1859:fload           7
	//* 954 1861:fsub            
	//* 955 1862:fstore          12
	//* 956 1864:aload_0         
	//* 957 1865:fload           11
	//* 958 1867:fload           12
	//* 959 1869:aload           4
	//* 960 1871:iload_2         
	//* 961 1872:iconst_0        
	//* 962 1873:iadd            
	//* 963 1874:faload          
	//* 964 1875:aload           4
	//* 965 1877:iload_2         
	//* 966 1878:iconst_1        
	//* 967 1879:iadd            
	//* 968 1880:faload          
	//* 969 1881:invokevirtual   #64  <Method void Path.quadTo(float, float, float, float)>
	//* 970 1884:aload           4
	//* 971 1886:iload_2         
	//* 972 1887:iconst_0        
	//* 973 1888:iadd            
	//* 974 1889:faload          
	//* 975 1890:fstore          10
	//* 976 1892:aload           4
	//* 977 1894:iload_2         
	//* 978 1895:iconst_1        
	//* 979 1896:iadd            
	//* 980 1897:faload          
	//* 981 1898:fstore          9
	//* 982 1900:fload           11
	//* 983 1902:fstore          8
	//* 984 1904:fload           5
	//* 985 1906:fstore          7
	//* 986 1908:fload           6
	//* 987 1910:fstore          5
	//* 988 1912:fload           12
	//* 989 1914:fstore          6
	//* 990 1916:goto            392
	//* 991 1919:aload           4
	//* 992 1921:iload_2         
	//* 993 1922:iconst_5        
	//* 994 1923:iadd            
	//* 995 1924:faload          
	//* 996 1925:fstore          7
	//* 997 1927:aload           4
	//* 998 1929:iload_2         
	//* 999 1930:bipush          6
	//*1000 1932:iadd            
	//*1001 1933:faload          
	//*1002 1934:fstore          8
	//*1003 1936:aload           4
	//*1004 1938:iload_2         
	//*1005 1939:iconst_0        
	//*1006 1940:iadd            
	//*1007 1941:faload          
	//*1008 1942:fstore          11
	//*1009 1944:aload           4
	//*1010 1946:iload_2         
	//*1011 1947:iconst_1        
	//*1012 1948:iadd            
	//*1013 1949:faload          
	//*1014 1950:fstore          12
	//*1015 1952:aload           4
	//*1016 1954:iload_2         
	//*1017 1955:iconst_2        
	//*1018 1956:iadd            
	//*1019 1957:faload          
	//*1020 1958:fstore          13
	//*1021 1960:aload           4
	//*1022 1962:iload_2         
	//*1023 1963:iconst_3        
	//*1024 1964:iadd            
	//*1025 1965:faload          
	//*1026 1966:fconst_0        
	//*1027 1967:fcmpl           
	//*1028 1968:ifeq            2062
	//*1029 1971:iconst_1        
	//*1030 1972:istore          17
	//*1031 1974:aload           4
	//*1032 1976:iload_2         
	//*1033 1977:iconst_4        
	//*1034 1978:iadd            
	//*1035 1979:faload          
	//*1036 1980:fconst_0        
	//*1037 1981:fcmpl           
	//*1038 1982:ifeq            2068
	//*1039 1985:iconst_1        
	//*1040 1986:istore          18
	//*1041 1988:aload_0         
	//*1042 1989:fload           10
	//*1043 1991:fload           9
	//*1044 1993:fload           7
	//*1045 1995:fload           10
	//*1046 1997:fadd            
	//*1047 1998:fload           8
	//*1048 2000:fload           9
	//*1049 2002:fadd            
	//*1050 2003:fload           11
	//*1051 2005:fload           12
	//*1052 2007:fload           13
	//*1053 2009:iload           17
	//*1054 2011:iload           18
	//*1055 2013:invokestatic    #68  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
	//*1056 2016:fload           10
	//*1057 2018:aload           4
	//*1058 2020:iload_2         
	//*1059 2021:iconst_5        
	//*1060 2022:iadd            
	//*1061 2023:faload          
	//*1062 2024:fadd            
	//*1063 2025:fstore          10
	//*1064 2027:aload           4
	//*1065 2029:iload_2         
	//*1066 2030:bipush          6
	//*1067 2032:iadd            
	//*1068 2033:faload          
	//*1069 2034:fload           9
	//*1070 2036:fadd            
	//*1071 2037:fstore          11
	//*1072 2039:fload           5
	//*1073 2041:fstore          7
	//*1074 2043:fload           10
	//*1075 2045:fstore          8
	//*1076 2047:fload           11
	//*1077 2049:fstore          9
	//*1078 2051:fload           6
	//*1079 2053:fstore          5
	//*1080 2055:fload           11
	//*1081 2057:fstore          6
	//*1082 2059:goto            392
	//*1083 2062:iconst_0        
	//*1084 2063:istore          17
	//*1085 2065:goto            1974
	//*1086 2068:iconst_0        
	//*1087 2069:istore          18
	//*1088 2071:goto            1988
	//*1089 2074:aload           4
	//*1090 2076:iload_2         
	//*1091 2077:iconst_5        
	//*1092 2078:iadd            
	//*1093 2079:faload          
	//*1094 2080:fstore          7
	//*1095 2082:aload           4
	//*1096 2084:iload_2         
	//*1097 2085:bipush          6
	//*1098 2087:iadd            
	//*1099 2088:faload          
	//*1100 2089:fstore          8
	//*1101 2091:aload           4
	//*1102 2093:iload_2         
	//*1103 2094:iconst_0        
	//*1104 2095:iadd            
	//*1105 2096:faload          
	//*1106 2097:fstore          11
	//*1107 2099:aload           4
	//*1108 2101:iload_2         
	//*1109 2102:iconst_1        
	//*1110 2103:iadd            
	//*1111 2104:faload          
	//*1112 2105:fstore          12
	//*1113 2107:aload           4
	//*1114 2109:iload_2         
	//*1115 2110:iconst_2        
	//*1116 2111:iadd            
	//*1117 2112:faload          
	//*1118 2113:fstore          13
	//*1119 2115:aload           4
	//*1120 2117:iload_2         
	//*1121 2118:iconst_3        
	//*1122 2119:iadd            
	//*1123 2120:faload          
	//*1124 2121:fconst_0        
	//*1125 2122:fcmpl           
	//*1126 2123:ifeq            2205
	//*1127 2126:iconst_1        
	//*1128 2127:istore          17
	//*1129 2129:aload           4
	//*1130 2131:iload_2         
	//*1131 2132:iconst_4        
	//*1132 2133:iadd            
	//*1133 2134:faload          
	//*1134 2135:fconst_0        
	//*1135 2136:fcmpl           
	//*1136 2137:ifeq            2211
	//*1137 2140:iconst_1        
	//*1138 2141:istore          18
	//*1139 2143:aload_0         
	//*1140 2144:fload           10
	//*1141 2146:fload           9
	//*1142 2148:fload           7
	//*1143 2150:fload           8
	//*1144 2152:fload           11
	//*1145 2154:fload           12
	//*1146 2156:fload           13
	//*1147 2158:iload           17
	//*1148 2160:iload           18
	//*1149 2162:invokestatic    #68  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
	//*1150 2165:aload           4
	//*1151 2167:iload_2         
	//*1152 2168:iconst_5        
	//*1153 2169:iadd            
	//*1154 2170:faload          
	//*1155 2171:fstore          10
	//*1156 2173:aload           4
	//*1157 2175:iload_2         
	//*1158 2176:bipush          6
	//*1159 2178:iadd            
	//*1160 2179:faload          
	//*1161 2180:fstore          11
	//*1162 2182:fload           5
	//*1163 2184:fstore          7
	//*1164 2186:fload           10
	//*1165 2188:fstore          8
	//*1166 2190:fload           11
	//*1167 2192:fstore          9
	//*1168 2194:fload           6
	//*1169 2196:fstore          5
	//*1170 2198:fload           11
	//*1171 2200:fstore          6
	//*1172 2202:goto            392
	//*1173 2205:iconst_0        
	//*1174 2206:istore          17
	//*1175 2208:goto            2129
	//*1176 2211:iconst_0        
	//*1177 2212:istore          18
	//*1178 2214:goto            2143
	//*1179 2217:aload_1         
	//*1180 2218:iconst_0        
	//*1181 2219:fload           10
	//*1182 2221:fastore         
	//*1183 2222:aload_1         
	//*1184 2223:iconst_1        
	//*1185 2224:fload           9
	//*1186 2226:fastore         
	//*1187 2227:aload_1         
	//*1188 2228:iconst_2        
	//*1189 2229:fload           8
	//*1190 2231:fastore         
	//*1191 2232:aload_1         
	//*1192 2233:iconst_3        
	//*1193 2234:fload           7
	//*1194 2236:fastore         
	//*1195 2237:aload_1         
	//*1196 2238:iconst_4        
	//*1197 2239:fload           5
	//*1198 2241:fastore         
	//*1199 2242:aload_1         
	//*1200 2243:iconst_5        
	//*1201 2244:fload           6
	//*1202 2246:fastore         
	//*1203 2247:return          
	//*1204 2248:fconst_0        
	//*1205 2249:fstore          7
	//*1206 2251:fconst_0        
	//*1207 2252:fstore          8
	//*1208 2254:goto            1719
	//*1209 2257:fload           10
	//*1210 2259:fstore          7
	//*1211 2261:goto            1416
		{
			f3 = 0.0F;
	// 1212 2264:fconst_0        
	// 1213 2265:fstore          8
			f2 = 0.0F;
	// 1214 2267:fconst_0        
	// 1215 2268:fstore          7
		}
		path.rCubicTo(f2, f3, af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		f3 = af1[c + 0];
		f27 = af1[c + 1];
		f2 = af1[c + 2];
		f21 = af1[c + 3];
		f3 = f5 + f3;
		f21 += f4;
		f5 += f2;
		f2 = f;
		f4 = f27 + f4;
		f = f1;
		f1 = f4;
		f4 = f21;
		  goto _L30
_L17:
		if(c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S')
		{
			f3 = 2.0F * f5 - f3;
			f4 = 2.0F * f4 - f2;
			f2 = f3;
		} else
		{
			f2 = f5;
		}
		path.cubicTo(f2, f4, af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		f3 = af1[c + 0];
		f21 = af1[c + 1];
		f5 = af1[c + 2];
		f4 = af1[c + 3];
		f2 = f;
		f = f1;
		f1 = f21;
		  goto _L30
_L25:
		path.rQuadTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		f3 = af1[c + 0];
		f27 = af1[c + 1];
		f2 = af1[c + 2];
		f21 = af1[c + 3];
		f3 = f5 + f3;
		f21 += f4;
		f5 += f2;
		f2 = f;
		f4 = f27 + f4;
		f = f1;
		f1 = f4;
		f4 = f21;
		  goto _L30
_L16:
		path.quadTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		f3 = af1[c + 0];
		f21 = af1[c + 1];
		f5 = af1[c + 2];
		f4 = af1[c + 3];
		f2 = f;
		f = f1;
		f1 = f21;
		  goto _L30
_L27:
		if(c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T')
		{
			f3 = f5 - f3;
			f2 = f4 - f2;
		} else
		{
			f2 = 0.0F;
			f3 = 0.0F;
		}
		path.rQuadTo(f3, f2, af1[c + 0], af1[c + 1]);
		f28 = af1[c + 0];
		f27 = af1[c + 1];
		f21 = f5 + f3;
		f27 += f4;
		f5 += f28;
		f3 = f;
		f2 += f4;
		f = f1;
		f1 = f2;
		f2 = f3;
		f3 = f21;
		f4 = f27;
		  goto _L30
_L18:
label0:
		{
			if(c2 != 'q' && c2 != 't' && c2 != 'Q')
			{
				f27 = f4;
				f21 = f5;
				if(c2 != 'T')
					break label0;
			}
			f21 = 2.0F * f5 - f3;
			f27 = 2.0F * f4 - f2;
		}
		path.quadTo(f21, f27, af1[c + 0], af1[c + 1]);
		f5 = af1[c + 0];
		f4 = af1[c + 1];
		f3 = f21;
		f2 = f;
		f = f1;
		f1 = f27;
		  goto _L30
_L20:
		f2 = af1[c + 5];
		f3 = af1[c + 6];
		f21 = af1[c + 0];
		f27 = af1[c + 1];
		f28 = af1[c + 2];
		if(af1[c + 3] != 0.0F)
			flag1 = true;
		else
			flag1 = false;
		if(af1[c + 4] != 0.0F)
			flag2 = true;
		else
			flag2 = false;
		drawArc(path, f5, f4, f2 + f5, f3 + f4, f21, f27, f28, flag1, flag2);
		f5 += af1[c + 5];
		f21 = af1[c + 6] + f4;
		f2 = f;
		f3 = f5;
		f4 = f21;
		f = f1;
		f1 = f21;
		  goto _L30
_L11:
		f2 = af1[c + 5];
		f3 = af1[c + 6];
		f21 = af1[c + 0];
		f27 = af1[c + 1];
		f28 = af1[c + 2];
		if(af1[c + 3] != 0.0F)
			flag1 = true;
		else
			flag1 = false;
		if(af1[c + 4] != 0.0F)
			flag2 = true;
		else
			flag2 = false;
		drawArc(path, f5, f4, f2, f3, f21, f27, f28, flag1, flag2);
		f5 = af1[c + 5];
		f21 = af1[c + 6];
		f2 = f;
		f3 = f5;
		f4 = f21;
		f = f1;
		f1 = f21;
		  goto _L30
_L9:
		af[0] = f5;
		af[1] = f4;
		af[2] = f3;
		af[3] = f2;
		af[4] = f;
		af[5] = f1;
		return;
		if(true) goto _L32; else goto _L31
_L31:
	//*1216 2270:goto            1255
	}

	private static void arcToBezier(Path path, double d, double d1, double d2, double d3, double d4, double d5, double d6, 
			double d7, double d8)
	{
		int j = (int)Math.ceil(Math.abs((4D * d8) / 3.1415926535897931D));
	//    0    0:ldc2w           #71  <Double 4D>
	//    1    3:dload           17
	//    2    5:dmul            
	//    3    6:ldc2w           #73  <Double 3.1415926535897931D>
	//    4    9:ddiv            
	//    5   10:invokestatic    #80  <Method double Math.abs(double)>
	//    6   13:invokestatic    #83  <Method double Math.ceil(double)>
	//    7   16:d2i             
	//    8   17:istore          38
		double d17 = Math.cos(d6);
	//    9   19:dload           13
	//   10   21:invokestatic    #86  <Method double Math.cos(double)>
	//   11   24:dstore          29
		double d18 = Math.sin(d6);
	//   12   26:dload           13
	//   13   28:invokestatic    #89  <Method double Math.sin(double)>
	//   14   31:dstore          31
		d6 = Math.cos(d7);
	//   15   33:dload           15
	//   16   35:invokestatic    #86  <Method double Math.cos(double)>
	//   17   38:dstore          13
		double d11 = Math.sin(d7);
	//   18   40:dload           15
	//   19   42:invokestatic    #89  <Method double Math.sin(double)>
	//   20   45:dstore          21
		double d13 = -d2;
	//   21   47:dload           5
	//   22   49:dneg            
	//   23   50:dstore          23
		double d9 = -d2;
	//   24   52:dload           5
	//   25   54:dneg            
	//   26   55:dstore          19
		double d19 = d8 / (double)j;
	//   27   57:dload           17
	//   28   59:iload           38
	//   29   61:i2d             
	//   30   62:ddiv            
	//   31   63:dstore          33
		int i = 0;
	//   32   65:iconst_0        
	//   33   66:istore          37
		d9 = d11 * (d9 * d18) + d6 * (d3 * d17);
	//   34   68:dload           21
	//   35   70:dload           19
	//   36   72:dload           31
	//   37   74:dmul            
	//   38   75:dmul            
	//   39   76:dload           13
	//   40   78:dload           7
	//   41   80:dload           29
	//   42   82:dmul            
	//   43   83:dmul            
	//   44   84:dadd            
	//   45   85:dstore          19
		d11 = d13 * d17 * d11 - d3 * d18 * d6;
	//   46   87:dload           23
	//   47   89:dload           29
	//   48   91:dmul            
	//   49   92:dload           21
	//   50   94:dmul            
	//   51   95:dload           7
	//   52   97:dload           31
	//   53   99:dmul            
	//   54  100:dload           13
	//   55  102:dmul            
	//   56  103:dsub            
	//   57  104:dstore          21
		d8 = d7;
	//   58  106:dload           15
	//   59  108:dstore          17
		d7 = d5;
	//   60  110:dload           11
	//   61  112:dstore          15
		d6 = d4;
	//   62  114:dload           9
	//   63  116:dstore          13
		d5 = d11;
	//   64  118:dload           21
	//   65  120:dstore          11
		double d14;
		for(d4 = d9; i < j; d4 = d14)
	//*  66  122:dload           19
	//*  67  124:dstore          9
	//*  68  126:iload           37
	//*  69  128:iload           38
	//*  70  130:icmpge          368
		{
			double d15 = d8 + d19;
	//   71  133:dload           17
	//   72  135:dload           33
	//   73  137:dadd            
	//   74  138:dstore          25
			d14 = Math.sin(d15);
	//   75  140:dload           25
	//   76  142:invokestatic    #89  <Method double Math.sin(double)>
	//   77  145:dstore          23
			double d20 = Math.cos(d15);
	//   78  147:dload           25
	//   79  149:invokestatic    #86  <Method double Math.cos(double)>
	//   80  152:dstore          35
			double d10 = (d2 * d17 * d20 + d) - d3 * d18 * d14;
	//   81  154:dload           5
	//   82  156:dload           29
	//   83  158:dmul            
	//   84  159:dload           35
	//   85  161:dmul            
	//   86  162:dload_1         
	//   87  163:dadd            
	//   88  164:dload           7
	//   89  166:dload           31
	//   90  168:dmul            
	//   91  169:dload           23
	//   92  171:dmul            
	//   93  172:dsub            
	//   94  173:dstore          19
			double d12 = d3 * d17 * d14 + (d2 * d18 * d20 + d1);
	//   95  175:dload           7
	//   96  177:dload           29
	//   97  179:dmul            
	//   98  180:dload           23
	//   99  182:dmul            
	//  100  183:dload           5
	//  101  185:dload           31
	//  102  187:dmul            
	//  103  188:dload           35
	//  104  190:dmul            
	//  105  191:dload_3         
	//  106  192:dadd            
	//  107  193:dadd            
	//  108  194:dstore          21
			double d16 = -d2 * d17 * d14 - d3 * d18 * d20;
	//  109  196:dload           5
	//  110  198:dneg            
	//  111  199:dload           29
	//  112  201:dmul            
	//  113  202:dload           23
	//  114  204:dmul            
	//  115  205:dload           7
	//  116  207:dload           31
	//  117  209:dmul            
	//  118  210:dload           35
	//  119  212:dmul            
	//  120  213:dsub            
	//  121  214:dstore          27
			d14 = d20 * (d3 * d17) + d14 * (-d2 * d18);
	//  122  216:dload           35
	//  123  218:dload           7
	//  124  220:dload           29
	//  125  222:dmul            
	//  126  223:dmul            
	//  127  224:dload           23
	//  128  226:dload           5
	//  129  228:dneg            
	//  130  229:dload           31
	//  131  231:dmul            
	//  132  232:dmul            
	//  133  233:dadd            
	//  134  234:dstore          23
			d20 = Math.tan((d15 - d8) / 2D);
	//  135  236:dload           25
	//  136  238:dload           17
	//  137  240:dsub            
	//  138  241:ldc2w           #90  <Double 2D>
	//  139  244:ddiv            
	//  140  245:invokestatic    #94  <Method double Math.tan(double)>
	//  141  248:dstore          35
			d8 = Math.sin(d15 - d8);
	//  142  250:dload           25
	//  143  252:dload           17
	//  144  254:dsub            
	//  145  255:invokestatic    #89  <Method double Math.sin(double)>
	//  146  258:dstore          17
			d8 = ((Math.sqrt(d20 * (3D * d20) + 4D) - 1.0D) * d8) / 3D;
	//  147  260:dload           35
	//  148  262:ldc2w           #95  <Double 3D>
	//  149  265:dload           35
	//  150  267:dmul            
	//  151  268:dmul            
	//  152  269:ldc2w           #71  <Double 4D>
	//  153  272:dadd            
	//  154  273:invokestatic    #99  <Method double Math.sqrt(double)>
	//  155  276:dconst_1        
	//  156  277:dsub            
	//  157  278:dload           17
	//  158  280:dmul            
	//  159  281:ldc2w           #95  <Double 3D>
	//  160  284:ddiv            
	//  161  285:dstore          17
			path.rLineTo(0.0F, 0.0F);
	//  162  287:aload_0         
	//  163  288:fconst_0        
	//  164  289:fconst_0        
	//  165  290:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			path.cubicTo((float)(d5 * d8 + d6), (float)(d7 + d4 * d8), (float)(d10 - d8 * d16), (float)(d12 - d8 * d14), (float)d10, (float)d12);
	//  166  293:aload_0         
	//  167  294:dload           11
	//  168  296:dload           17
	//  169  298:dmul            
	//  170  299:dload           13
	//  171  301:dadd            
	//  172  302:d2f             
	//  173  303:dload           15
	//  174  305:dload           9
	//  175  307:dload           17
	//  176  309:dmul            
	//  177  310:dadd            
	//  178  311:d2f             
	//  179  312:dload           19
	//  180  314:dload           17
	//  181  316:dload           27
	//  182  318:dmul            
	//  183  319:dsub            
	//  184  320:d2f             
	//  185  321:dload           21
	//  186  323:dload           17
	//  187  325:dload           23
	//  188  327:dmul            
	//  189  328:dsub            
	//  190  329:d2f             
	//  191  330:dload           19
	//  192  332:d2f             
	//  193  333:dload           21
	//  194  335:d2f             
	//  195  336:invokevirtual   #57  <Method void Path.cubicTo(float, float, float, float, float, float)>
			i++;
	//  196  339:iload           37
	//  197  341:iconst_1        
	//  198  342:iadd            
	//  199  343:istore          37
			d5 = d16;
	//  200  345:dload           27
	//  201  347:dstore          11
			d8 = d15;
	//  202  349:dload           25
	//  203  351:dstore          17
			d7 = d12;
	//  204  353:dload           21
	//  205  355:dstore          15
			d6 = d10;
	//  206  357:dload           19
	//  207  359:dstore          13
		}

	//  208  361:dload           23
	//  209  363:dstore          9
	//* 210  365:goto            126
	//  211  368:return          
	}

	private static void drawArc(Path path, float f, float f1, float f2, float f3, float f4, float f5, float f6, 
			boolean flag, boolean flag1)
	{
		double d4 = Math.toRadians(f6);
	//    0    0:fload           7
	//    1    2:f2d             
	//    2    3:invokestatic    #102 <Method double Math.toRadians(double)>
	//    3    6:dstore          18
		double d5 = Math.cos(d4);
	//    4    8:dload           18
	//    5   10:invokestatic    #86  <Method double Math.cos(double)>
	//    6   13:dstore          20
		double d6 = Math.sin(d4);
	//    7   15:dload           18
	//    8   17:invokestatic    #89  <Method double Math.sin(double)>
	//    9   20:dstore          22
		double d7 = ((double)f * d5 + (double)f1 * d6) / (double)f4;
	//   10   22:fload_1         
	//   11   23:f2d             
	//   12   24:dload           20
	//   13   26:dmul            
	//   14   27:fload_2         
	//   15   28:f2d             
	//   16   29:dload           22
	//   17   31:dmul            
	//   18   32:dadd            
	//   19   33:fload           5
	//   20   35:f2d             
	//   21   36:ddiv            
	//   22   37:dstore          24
		double d8 = ((double)(-f) * d6 + (double)f1 * d5) / (double)f5;
	//   23   39:fload_1         
	//   24   40:fneg            
	//   25   41:f2d             
	//   26   42:dload           22
	//   27   44:dmul            
	//   28   45:fload_2         
	//   29   46:f2d             
	//   30   47:dload           20
	//   31   49:dmul            
	//   32   50:dadd            
	//   33   51:fload           6
	//   34   53:f2d             
	//   35   54:ddiv            
	//   36   55:dstore          26
		double d = ((double)f2 * d5 + (double)f3 * d6) / (double)f4;
	//   37   57:fload_3         
	//   38   58:f2d             
	//   39   59:dload           20
	//   40   61:dmul            
	//   41   62:fload           4
	//   42   64:f2d             
	//   43   65:dload           22
	//   44   67:dmul            
	//   45   68:dadd            
	//   46   69:fload           5
	//   47   71:f2d             
	//   48   72:ddiv            
	//   49   73:dstore          10
		double d3 = ((double)(-f2) * d6 + (double)f3 * d5) / (double)f5;
	//   50   75:fload_3         
	//   51   76:fneg            
	//   52   77:f2d             
	//   53   78:dload           22
	//   54   80:dmul            
	//   55   81:fload           4
	//   56   83:f2d             
	//   57   84:dload           20
	//   58   86:dmul            
	//   59   87:dadd            
	//   60   88:fload           6
	//   61   90:f2d             
	//   62   91:ddiv            
	//   63   92:dstore          16
		double d10 = d7 - d;
	//   64   94:dload           24
	//   65   96:dload           10
	//   66   98:dsub            
	//   67   99:dstore          30
		double d9 = d8 - d3;
	//   68  101:dload           26
	//   69  103:dload           16
	//   70  105:dsub            
	//   71  106:dstore          28
		double d2 = (d7 + d) / 2D;
	//   72  108:dload           24
	//   73  110:dload           10
	//   74  112:dadd            
	//   75  113:ldc2w           #90  <Double 2D>
	//   76  116:ddiv            
	//   77  117:dstore          14
		double d1 = (d8 + d3) / 2D;
	//   78  119:dload           26
	//   79  121:dload           16
	//   80  123:dadd            
	//   81  124:ldc2w           #90  <Double 2D>
	//   82  127:ddiv            
	//   83  128:dstore          12
		double d11 = d10 * d10 + d9 * d9;
	//   84  130:dload           30
	//   85  132:dload           30
	//   86  134:dmul            
	//   87  135:dload           28
	//   88  137:dload           28
	//   89  139:dmul            
	//   90  140:dadd            
	//   91  141:dstore          32
		if(d11 == 0.0D)
	//*  92  143:dload           32
	//*  93  145:dconst_0        
	//*  94  146:dcmpl           
	//*  95  147:ifne            159
		{
			Log.w("PathParser", " Points are coincident");
	//   96  150:ldc1            #104 <String "PathParser">
	//   97  152:ldc1            #106 <String " Points are coincident">
	//   98  154:invokestatic    #112 <Method int Log.w(String, String)>
	//   99  157:pop             
			return;
	//  100  158:return          
		}
		double d12 = 1.0D / d11 - 0.25D;
	//  101  159:dconst_1        
	//  102  160:dload           32
	//  103  162:ddiv            
	//  104  163:ldc2w           #113 <Double 0.25D>
	//  105  166:dsub            
	//  106  167:dstore          34
		if(d12 < 0.0D)
	//* 107  169:dload           34
	//* 108  171:dconst_0        
	//* 109  172:dcmpg           
	//* 110  173:ifge            240
		{
			Log.w("PathParser", (new StringBuilder()).append("Points are too far apart ").append(d11).toString());
	//  111  176:ldc1            #104 <String "PathParser">
	//  112  178:new             #116 <Class StringBuilder>
	//  113  181:dup             
	//  114  182:invokespecial   #117 <Method void StringBuilder()>
	//  115  185:ldc1            #119 <String "Points are too far apart ">
	//  116  187:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//  117  190:dload           32
	//  118  192:invokevirtual   #126 <Method StringBuilder StringBuilder.append(double)>
	//  119  195:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  120  198:invokestatic    #112 <Method int Log.w(String, String)>
	//  121  201:pop             
			float f7 = (float)(Math.sqrt(d11) / 1.9999899999999999D);
	//  122  202:dload           32
	//  123  204:invokestatic    #99  <Method double Math.sqrt(double)>
	//  124  207:ldc2w           #131 <Double 1.9999899999999999D>
	//  125  210:ddiv            
	//  126  211:d2f             
	//  127  212:fstore          36
			drawArc(path, f, f1, f2, f3, f4 * f7, f5 * f7, f6, flag, flag1);
	//  128  214:aload_0         
	//  129  215:fload_1         
	//  130  216:fload_2         
	//  131  217:fload_3         
	//  132  218:fload           4
	//  133  220:fload           5
	//  134  222:fload           36
	//  135  224:fmul            
	//  136  225:fload           6
	//  137  227:fload           36
	//  138  229:fmul            
	//  139  230:fload           7
	//  140  232:iload           8
	//  141  234:iload           9
	//  142  236:invokestatic    #68  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
			return;
	//  143  239:return          
		}
		d11 = Math.sqrt(d12);
	//  144  240:dload           34
	//  145  242:invokestatic    #99  <Method double Math.sqrt(double)>
	//  146  245:dstore          32
		d10 *= d11;
	//  147  247:dload           30
	//  148  249:dload           32
	//  149  251:dmul            
	//  150  252:dstore          30
		d9 *= d11;
	//  151  254:dload           28
	//  152  256:dload           32
	//  153  258:dmul            
	//  154  259:dstore          28
		if(flag == flag1)
	//* 155  261:iload           8
	//* 156  263:iload           9
	//* 157  265:icmpne          410
		{
			d2 -= d9;
	//  158  268:dload           14
	//  159  270:dload           28
	//  160  272:dsub            
	//  161  273:dstore          14
			d1 = d10 + d1;
	//  162  275:dload           30
	//  163  277:dload           12
	//  164  279:dadd            
	//  165  280:dstore          12
		} else
	//* 166  282:dload           26
	//* 167  284:dload           12
	//* 168  286:dsub            
	//* 169  287:dload           24
	//* 170  289:dload           14
	//* 171  291:dsub            
	//* 172  292:invokestatic    #136 <Method double Math.atan2(double, double)>
	//* 173  295:dstore          24
	//* 174  297:dload           16
	//* 175  299:dload           12
	//* 176  301:dsub            
	//* 177  302:dload           10
	//* 178  304:dload           14
	//* 179  306:dsub            
	//* 180  307:invokestatic    #136 <Method double Math.atan2(double, double)>
	//* 181  310:dload           24
	//* 182  312:dsub            
	//* 183  313:dstore          16
	//* 184  315:dload           16
	//* 185  317:dconst_0        
	//* 186  318:dcmpl           
	//* 187  319:iflt            427
	//* 188  322:iconst_1        
	//* 189  323:istore          8
	//* 190  325:dload           16
	//* 191  327:dstore          10
	//* 192  329:iload           9
	//* 193  331:iload           8
	//* 194  333:icmpeq          351
	//* 195  336:dload           16
	//* 196  338:dconst_0        
	//* 197  339:dcmpl           
	//* 198  340:ifle            433
	//* 199  343:dload           16
	//* 200  345:ldc2w           #137 <Double 6.2831853071795862D>
	//* 201  348:dsub            
	//* 202  349:dstore          10
	//* 203  351:fload           5
	//* 204  353:f2d             
	//* 205  354:dload           14
	//* 206  356:dmul            
	//* 207  357:dstore          14
	//* 208  359:dload           12
	//* 209  361:fload           6
	//* 210  363:f2d             
	//* 211  364:dmul            
	//* 212  365:dstore          12
	//* 213  367:aload_0         
	//* 214  368:dload           14
	//* 215  370:dload           20
	//* 216  372:dmul            
	//* 217  373:dload           12
	//* 218  375:dload           22
	//* 219  377:dmul            
	//* 220  378:dsub            
	//* 221  379:dload           14
	//* 222  381:dload           22
	//* 223  383:dmul            
	//* 224  384:dload           12
	//* 225  386:dload           20
	//* 226  388:dmul            
	//* 227  389:dadd            
	//* 228  390:fload           5
	//* 229  392:f2d             
	//* 230  393:fload           6
	//* 231  395:f2d             
	//* 232  396:fload_1         
	//* 233  397:f2d             
	//* 234  398:fload_2         
	//* 235  399:f2d             
	//* 236  400:dload           18
	//* 237  402:dload           24
	//* 238  404:dload           10
	//* 239  406:invokestatic    #140 <Method void arcToBezier(Path, double, double, double, double, double, double, double, double, double)>
	//* 240  409:return          
		{
			d2 = d9 + d2;
	//  241  410:dload           28
	//  242  412:dload           14
	//  243  414:dadd            
	//  244  415:dstore          14
			d1 -= d10;
	//  245  417:dload           12
	//  246  419:dload           30
	//  247  421:dsub            
	//  248  422:dstore          12
		}
		d7 = Math.atan2(d8 - d1, d7 - d2);
		d3 = Math.atan2(d3 - d1, d - d2) - d7;
		if(d3 >= 0.0D)
			flag = true;
		else
	//* 249  424:goto            282
			flag = false;
	//  250  427:iconst_0        
	//  251  428:istore          8
		d = d3;
		if(flag1 != flag)
			if(d3 > 0.0D)
				d = d3 - 6.2831853071795862D;
			else
	//* 252  430:goto            325
				d = d3 + 6.2831853071795862D;
	//  253  433:dload           16
	//  254  435:ldc2w           #137 <Double 6.2831853071795862D>
	//  255  438:dadd            
	//  256  439:dstore          10
		d2 = (double)f4 * d2;
		d1 *= f5;
		arcToBezier(path, d2 * d5 - d1 * d6, d2 * d6 + d1 * d5, f4, f5, f, f1, d4, d7, d);
	//* 257  441:goto            351
	}

	public static void nodesToPath(PathParser$PathDataNode apathparser$pathdatanode[], Path path)
	{
		float af[] = new float[6];
	//    0    0:bipush          6
	//    1    2:newarray        float[]
	//    2    4:astore          4
		char c = 'm';
	//    3    6:bipush          109
	//    4    8:istore_2        
		for(int i = 0; i < apathparser$pathdatanode.length; i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:arraylength     
	//*  10   14:icmpge          50
		{
			addCommand(path, af, c, apathparser$pathdatanode[i].mType, apathparser$pathdatanode[i].mParams);
	//   11   17:aload_1         
	//   12   18:aload           4
	//   13   20:iload_2         
	//   14   21:aload_0         
	//   15   22:iload_3         
	//   16   23:aaload          
	//   17   24:getfield        #22  <Field char mType>
	//   18   27:aload_0         
	//   19   28:iload_3         
	//   20   29:aaload          
	//   21   30:getfield        #24  <Field float[] mParams>
	//   22   33:invokestatic    #144 <Method void addCommand(Path, float[], char, char, float[])>
			c = apathparser$pathdatanode[i].mType;
	//   23   36:aload_0         
	//   24   37:iload_3         
	//   25   38:aaload          
	//   26   39:getfield        #22  <Field char mType>
	//   27   42:istore_2        
		}

	//   28   43:iload_3         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_3        
	//*  32   47:goto            11
	//   33   50:return          
	}

	public void interpolatePathDataNode(PathParser$PathDataNode pathparser$pathdatanode, PathParser$PathDataNode pathparser$pathdatanode1, float f)
	{
		for(int i = 0; i < pathparser$pathdatanode.mParams.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_1         
	//*   4    6:getfield        #24  <Field float[] mParams>
	//*   5    9:arraylength     
	//*   6   10:icmpge          50
			mParams[i] = pathparser$pathdatanode.mParams[i] * (1.0F - f) + pathparser$pathdatanode1.mParams[i] * f;
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field float[] mParams>
	//    9   17:iload           4
	//   10   19:aload_1         
	//   11   20:getfield        #24  <Field float[] mParams>
	//   12   23:iload           4
	//   13   25:faload          
	//   14   26:fconst_1        
	//   15   27:fload_3         
	//   16   28:fsub            
	//   17   29:fmul            
	//   18   30:aload_2         
	//   19   31:getfield        #24  <Field float[] mParams>
	//   20   34:iload           4
	//   21   36:faload          
	//   22   37:fload_3         
	//   23   38:fmul            
	//   24   39:fadd            
	//   25   40:fastore         

	//   26   41:iload           4
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore          4
	//*  30   47:goto            3
	//   31   50:return          
	}

	public float mParams[];
	public char mType;

	PathParser$PathDataNode(char c, float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mType = c;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field char mType>
		mParams = af;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field float[] mParams>
	//    8   14:return          
	}

	PathParser$PathDataNode(PathParser$PathDataNode pathparser$pathdatanode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mType = pathparser$pathdatanode.mType;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #22  <Field char mType>
	//    5    9:putfield        #22  <Field char mType>
		mParams = PathParser.copyOfRange(pathparser$pathdatanode.mParams, 0, pathparser$pathdatanode.mParams.length);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #24  <Field float[] mParams>
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:getfield        #24  <Field float[] mParams>
	//   12   22:arraylength     
	//   13   23:invokestatic    #30  <Method float[] PathParser.copyOfRange(float[], int, int)>
	//   14   26:putfield        #24  <Field float[] mParams>
	//   15   29:return          
	}
}
