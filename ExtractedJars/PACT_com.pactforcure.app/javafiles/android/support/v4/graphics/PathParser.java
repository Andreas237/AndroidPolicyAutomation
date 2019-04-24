// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public class PathParser
{
	private static class ExtractFloatResult
	{

		int mEndPosition;
		boolean mEndWithNegOrDot;

		ExtractFloatResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class PathDataNode
	{

		private static void addCommand(Path path, float af[], char c, char c1, float af1[])
		{
			float f;
			float f1;
			float f2;
			float f3;
			float f4;
			float f5;
			byte byte0;
			byte0 = 2;
		//    0    0:iconst_2        
		//    1    1:istore          14
			f = af[0];
		//    2    3:aload_1         
		//    3    4:iconst_0        
		//    4    5:faload          
		//    5    6:fstore          5
			f1 = af[1];
		//    6    8:aload_1         
		//    7    9:iconst_1        
		//    8   10:faload          
		//    9   11:fstore          6
			f3 = af[2];
		//   10   13:aload_1         
		//   11   14:iconst_2        
		//   12   15:faload          
		//   13   16:fstore          8
			f5 = af[3];
		//   14   18:aload_1         
		//   15   19:iconst_3        
		//   16   20:faload          
		//   17   21:fstore          10
			f2 = af[4];
		//   18   23:aload_1         
		//   19   24:iconst_4        
		//   20   25:faload          
		//   21   26:fstore          7
			f4 = af[5];
		//   22   28:aload_1         
		//   23   29:iconst_5        
		//   24   30:faload          
		//   25   31:fstore          9
			c1;
		//   26   33:iload_3         
			JVM INSTR lookupswitch 20: default 204
		//		               65: 483
		//		               67: 470
		//		               72: 464
		//		               76: 458
		//		               77: 458
		//		               81: 477
		//		               83: 477
		//		               84: 458
		//		               86: 464
		//		               90: 427
		//		               97: 483
		//		               99: 470
		//		               104: 464
		//		               108: 458
		//		               109: 458
		//		               113: 477
		//		               115: 477
		//		               116: 458
		//		               118: 464
		//		               122: 427;
		//   27   34:lookupswitch    20: default 204
		//		               65: 483
		//		               67: 470
		//		               72: 464
		//		               76: 458
		//		               77: 458
		//		               81: 477
		//		               83: 477
		//		               84: 458
		//		               86: 464
		//		               90: 427
		//		               97: 483
		//		               99: 470
		//		               104: 464
		//		               108: 458
		//		               109: 458
		//		               113: 477
		//		               115: 477
		//		               116: 458
		//		               118: 464
		//		               122: 427
			   goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L6 _L5 _L4 _L7 _L2 _L3 _L4 _L5 _L5 _L6 _L6 _L5 _L4 _L7
_L1:
			float f6;
			float f7;
			float f8;
			char c2;
			boolean flag = false;
		//   28  204:iconst_0        
		//   29  205:istore          16
			c2 = c;
		//   30  207:iload_2         
		//   31  208:istore          15
			c = ((char) (flag));
		//   32  210:iload           16
		//   33  212:istore_2        
			f6 = f4;
		//   34  213:fload           9
		//   35  215:fstore          11
			f4 = f2;
		//   36  217:fload           7
		//   37  219:fstore          9
			f7 = f5;
		//   38  221:fload           10
		//   39  223:fstore          12
			f8 = f3;
		//   40  225:fload           8
		//   41  227:fstore          13
_L29:
			if(c >= af1.length) goto _L9; else goto _L8
		//   42  229:iload_2         
		//   43  230:aload           4
		//   44  232:arraylength     
		//   45  233:icmpge          1998
_L8:
			c1;
		//   46  236:iload_3         
			JVM INSTR lookupswitch 18: default 392
		//		               65: 1863
		//		               67: 1003
		//		               72: 805
		//		               76: 721
		//		               77: 582
		//		               81: 1417
		//		               83: 1213
		//		               84: 1603
		//		               86: 877
		//		               97: 1716
		//		               99: 912
		//		               104: 768
		//		               108: 668
		//		               109: 490
		//		               113: 1338
		//		               115: 1082
		//		               116: 1484
		//		               118: 840;
		//   47  237:lookupswitch    18: default 392
		//		               65: 1863
		//		               67: 1003
		//		               72: 805
		//		               76: 721
		//		               77: 582
		//		               81: 1417
		//		               83: 1213
		//		               84: 1603
		//		               86: 877
		//		               97: 1716
		//		               99: 912
		//		               104: 768
		//		               108: 668
		//		               109: 490
		//		               113: 1338
		//		               115: 1082
		//		               116: 1484
		//		               118: 840
			   goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L10:
			f5 = f6;
		//   48  392:fload           11
		//   49  394:fstore          10
			f3 = f7;
		//   50  396:fload           12
		//   51  398:fstore          8
			f2 = f8;
		//   52  400:fload           13
		//   53  402:fstore          7
_L30:
			c2 = c1;
		//   54  404:iload_3         
		//   55  405:istore          15
			c += ((char) (byte0));
		//   56  407:iload_2         
		//   57  408:iload           14
		//   58  410:iadd            
		//   59  411:istore_2        
			f8 = f2;
		//   60  412:fload           7
		//   61  414:fstore          13
			f7 = f3;
		//   62  416:fload           8
		//   63  418:fstore          12
			f6 = f5;
		//   64  420:fload           10
		//   65  422:fstore          11
			  goto _L29
		//*  66  424:goto            229
_L7:
			path.close();
		//   67  427:aload_0         
		//   68  428:invokevirtual   #37  <Method void Path.close()>
			f = f2;
		//   69  431:fload           7
		//   70  433:fstore          5
			f1 = f4;
		//   71  435:fload           9
		//   72  437:fstore          6
			f3 = f2;
		//   73  439:fload           7
		//   74  441:fstore          8
			f5 = f4;
		//   75  443:fload           9
		//   76  445:fstore          10
			path.moveTo(f, f1);
		//   77  447:aload_0         
		//   78  448:fload           5
		//   79  450:fload           6
		//   80  452:invokevirtual   #41  <Method void Path.moveTo(float, float)>
			continue; /* Loop/switch isn't completed */
		//   81  455:goto            204
_L5:
			byte0 = 2;
		//   82  458:iconst_2        
		//   83  459:istore          14
			continue; /* Loop/switch isn't completed */
		//   84  461:goto            204
_L4:
			byte0 = 1;
		//   85  464:iconst_1        
		//   86  465:istore          14
			continue; /* Loop/switch isn't completed */
		//   87  467:goto            204
_L3:
			byte0 = 6;
		//   88  470:bipush          6
		//   89  472:istore          14
			continue; /* Loop/switch isn't completed */
		//   90  474:goto            204
_L6:
			byte0 = 4;
		//   91  477:iconst_4        
		//   92  478:istore          14
			continue; /* Loop/switch isn't completed */
		//   93  480:goto            204
_L2:
			byte0 = 7;
		//   94  483:bipush          7
		//   95  485:istore          14
			continue; /* Loop/switch isn't completed */
		//   96  487:goto            204
_L24:
			f += af1[c + 0];
		//   97  490:fload           5
		//   98  492:aload           4
		//   99  494:iload_2         
		//  100  495:iconst_0        
		//  101  496:iadd            
		//  102  497:faload          
		//  103  498:fadd            
		//  104  499:fstore          5
			f1 += af1[c + 1];
		//  105  501:fload           6
		//  106  503:aload           4
		//  107  505:iload_2         
		//  108  506:iconst_1        
		//  109  507:iadd            
		//  110  508:faload          
		//  111  509:fadd            
		//  112  510:fstore          6
			if(c > 0)
		//* 113  512:iload_2         
		//* 114  513:ifle            547
			{
				path.rLineTo(af1[c + 0], af1[c + 1]);
		//  115  516:aload_0         
		//  116  517:aload           4
		//  117  519:iload_2         
		//  118  520:iconst_0        
		//  119  521:iadd            
		//  120  522:faload          
		//  121  523:aload           4
		//  122  525:iload_2         
		//  123  526:iconst_1        
		//  124  527:iadd            
		//  125  528:faload          
		//  126  529:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
				f2 = f8;
		//  127  532:fload           13
		//  128  534:fstore          7
				f3 = f7;
		//  129  536:fload           12
		//  130  538:fstore          8
				f5 = f6;
		//  131  540:fload           11
		//  132  542:fstore          10
			} else
		//* 133  544:goto            404
			{
				path.rMoveTo(af1[c + 0], af1[c + 1]);
		//  134  547:aload_0         
		//  135  548:aload           4
		//  136  550:iload_2         
		//  137  551:iconst_0        
		//  138  552:iadd            
		//  139  553:faload          
		//  140  554:aload           4
		//  141  556:iload_2         
		//  142  557:iconst_1        
		//  143  558:iadd            
		//  144  559:faload          
		//  145  560:invokevirtual   #47  <Method void Path.rMoveTo(float, float)>
				f4 = f;
		//  146  563:fload           5
		//  147  565:fstore          9
				f5 = f1;
		//  148  567:fload           6
		//  149  569:fstore          10
				f2 = f8;
		//  150  571:fload           13
		//  151  573:fstore          7
				f3 = f7;
		//  152  575:fload           12
		//  153  577:fstore          8
			}
			  goto _L30
		//* 154  579:goto            404
_L15:
			f = af1[c + 0];
		//  155  582:aload           4
		//  156  584:iload_2         
		//  157  585:iconst_0        
		//  158  586:iadd            
		//  159  587:faload          
		//  160  588:fstore          5
			f1 = af1[c + 1];
		//  161  590:aload           4
		//  162  592:iload_2         
		//  163  593:iconst_1        
		//  164  594:iadd            
		//  165  595:faload          
		//  166  596:fstore          6
			if(c > 0)
		//* 167  598:iload_2         
		//* 168  599:ifle            633
			{
				path.lineTo(af1[c + 0], af1[c + 1]);
		//  169  602:aload_0         
		//  170  603:aload           4
		//  171  605:iload_2         
		//  172  606:iconst_0        
		//  173  607:iadd            
		//  174  608:faload          
		//  175  609:aload           4
		//  176  611:iload_2         
		//  177  612:iconst_1        
		//  178  613:iadd            
		//  179  614:faload          
		//  180  615:invokevirtual   #50  <Method void Path.lineTo(float, float)>
				f2 = f8;
		//  181  618:fload           13
		//  182  620:fstore          7
				f3 = f7;
		//  183  622:fload           12
		//  184  624:fstore          8
				f5 = f6;
		//  185  626:fload           11
		//  186  628:fstore          10
			} else
		//* 187  630:goto            404
			{
				path.moveTo(af1[c + 0], af1[c + 1]);
		//  188  633:aload_0         
		//  189  634:aload           4
		//  190  636:iload_2         
		//  191  637:iconst_0        
		//  192  638:iadd            
		//  193  639:faload          
		//  194  640:aload           4
		//  195  642:iload_2         
		//  196  643:iconst_1        
		//  197  644:iadd            
		//  198  645:faload          
		//  199  646:invokevirtual   #41  <Method void Path.moveTo(float, float)>
				f4 = f;
		//  200  649:fload           5
		//  201  651:fstore          9
				f5 = f1;
		//  202  653:fload           6
		//  203  655:fstore          10
				f2 = f8;
		//  204  657:fload           13
		//  205  659:fstore          7
				f3 = f7;
		//  206  661:fload           12
		//  207  663:fstore          8
			}
			  goto _L30
		//* 208  665:goto            404
_L23:
			path.rLineTo(af1[c + 0], af1[c + 1]);
		//  209  668:aload_0         
		//  210  669:aload           4
		//  211  671:iload_2         
		//  212  672:iconst_0        
		//  213  673:iadd            
		//  214  674:faload          
		//  215  675:aload           4
		//  216  677:iload_2         
		//  217  678:iconst_1        
		//  218  679:iadd            
		//  219  680:faload          
		//  220  681:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			f += af1[c + 0];
		//  221  684:fload           5
		//  222  686:aload           4
		//  223  688:iload_2         
		//  224  689:iconst_0        
		//  225  690:iadd            
		//  226  691:faload          
		//  227  692:fadd            
		//  228  693:fstore          5
			f1 += af1[c + 1];
		//  229  695:fload           6
		//  230  697:aload           4
		//  231  699:iload_2         
		//  232  700:iconst_1        
		//  233  701:iadd            
		//  234  702:faload          
		//  235  703:fadd            
		//  236  704:fstore          6
			f2 = f8;
		//  237  706:fload           13
		//  238  708:fstore          7
			f3 = f7;
		//  239  710:fload           12
		//  240  712:fstore          8
			f5 = f6;
		//  241  714:fload           11
		//  242  716:fstore          10
			  goto _L30
		//* 243  718:goto            404
_L14:
			path.lineTo(af1[c + 0], af1[c + 1]);
		//  244  721:aload_0         
		//  245  722:aload           4
		//  246  724:iload_2         
		//  247  725:iconst_0        
		//  248  726:iadd            
		//  249  727:faload          
		//  250  728:aload           4
		//  251  730:iload_2         
		//  252  731:iconst_1        
		//  253  732:iadd            
		//  254  733:faload          
		//  255  734:invokevirtual   #50  <Method void Path.lineTo(float, float)>
			f = af1[c + 0];
		//  256  737:aload           4
		//  257  739:iload_2         
		//  258  740:iconst_0        
		//  259  741:iadd            
		//  260  742:faload          
		//  261  743:fstore          5
			f1 = af1[c + 1];
		//  262  745:aload           4
		//  263  747:iload_2         
		//  264  748:iconst_1        
		//  265  749:iadd            
		//  266  750:faload          
		//  267  751:fstore          6
			f2 = f8;
		//  268  753:fload           13
		//  269  755:fstore          7
			f3 = f7;
		//  270  757:fload           12
		//  271  759:fstore          8
			f5 = f6;
		//  272  761:fload           11
		//  273  763:fstore          10
			  goto _L30
		//* 274  765:goto            404
_L22:
			path.rLineTo(af1[c + 0], 0.0F);
		//  275  768:aload_0         
		//  276  769:aload           4
		//  277  771:iload_2         
		//  278  772:iconst_0        
		//  279  773:iadd            
		//  280  774:faload          
		//  281  775:fconst_0        
		//  282  776:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			f += af1[c + 0];
		//  283  779:fload           5
		//  284  781:aload           4
		//  285  783:iload_2         
		//  286  784:iconst_0        
		//  287  785:iadd            
		//  288  786:faload          
		//  289  787:fadd            
		//  290  788:fstore          5
			f2 = f8;
		//  291  790:fload           13
		//  292  792:fstore          7
			f3 = f7;
		//  293  794:fload           12
		//  294  796:fstore          8
			f5 = f6;
		//  295  798:fload           11
		//  296  800:fstore          10
			  goto _L30
		//* 297  802:goto            404
_L13:
			path.lineTo(af1[c + 0], f1);
		//  298  805:aload_0         
		//  299  806:aload           4
		//  300  808:iload_2         
		//  301  809:iconst_0        
		//  302  810:iadd            
		//  303  811:faload          
		//  304  812:fload           6
		//  305  814:invokevirtual   #50  <Method void Path.lineTo(float, float)>
			f = af1[c + 0];
		//  306  817:aload           4
		//  307  819:iload_2         
		//  308  820:iconst_0        
		//  309  821:iadd            
		//  310  822:faload          
		//  311  823:fstore          5
			f2 = f8;
		//  312  825:fload           13
		//  313  827:fstore          7
			f3 = f7;
		//  314  829:fload           12
		//  315  831:fstore          8
			f5 = f6;
		//  316  833:fload           11
		//  317  835:fstore          10
			  goto _L30
		//* 318  837:goto            404
_L28:
			path.rLineTo(0.0F, af1[c + 0]);
		//  319  840:aload_0         
		//  320  841:fconst_0        
		//  321  842:aload           4
		//  322  844:iload_2         
		//  323  845:iconst_0        
		//  324  846:iadd            
		//  325  847:faload          
		//  326  848:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			f1 += af1[c + 0];
		//  327  851:fload           6
		//  328  853:aload           4
		//  329  855:iload_2         
		//  330  856:iconst_0        
		//  331  857:iadd            
		//  332  858:faload          
		//  333  859:fadd            
		//  334  860:fstore          6
			f2 = f8;
		//  335  862:fload           13
		//  336  864:fstore          7
			f3 = f7;
		//  337  866:fload           12
		//  338  868:fstore          8
			f5 = f6;
		//  339  870:fload           11
		//  340  872:fstore          10
			  goto _L30
		//* 341  874:goto            404
_L19:
			path.lineTo(f, af1[c + 0]);
		//  342  877:aload_0         
		//  343  878:fload           5
		//  344  880:aload           4
		//  345  882:iload_2         
		//  346  883:iconst_0        
		//  347  884:iadd            
		//  348  885:faload          
		//  349  886:invokevirtual   #50  <Method void Path.lineTo(float, float)>
			f1 = af1[c + 0];
		//  350  889:aload           4
		//  351  891:iload_2         
		//  352  892:iconst_0        
		//  353  893:iadd            
		//  354  894:faload          
		//  355  895:fstore          6
			f2 = f8;
		//  356  897:fload           13
		//  357  899:fstore          7
			f3 = f7;
		//  358  901:fload           12
		//  359  903:fstore          8
			f5 = f6;
		//  360  905:fload           11
		//  361  907:fstore          10
			  goto _L30
		//* 362  909:goto            404
_L21:
			path.rCubicTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3], af1[c + 4], af1[c + 5]);
		//  363  912:aload_0         
		//  364  913:aload           4
		//  365  915:iload_2         
		//  366  916:iconst_0        
		//  367  917:iadd            
		//  368  918:faload          
		//  369  919:aload           4
		//  370  921:iload_2         
		//  371  922:iconst_1        
		//  372  923:iadd            
		//  373  924:faload          
		//  374  925:aload           4
		//  375  927:iload_2         
		//  376  928:iconst_2        
		//  377  929:iadd            
		//  378  930:faload          
		//  379  931:aload           4
		//  380  933:iload_2         
		//  381  934:iconst_3        
		//  382  935:iadd            
		//  383  936:faload          
		//  384  937:aload           4
		//  385  939:iload_2         
		//  386  940:iconst_4        
		//  387  941:iadd            
		//  388  942:faload          
		//  389  943:aload           4
		//  390  945:iload_2         
		//  391  946:iconst_5        
		//  392  947:iadd            
		//  393  948:faload          
		//  394  949:invokevirtual   #54  <Method void Path.rCubicTo(float, float, float, float, float, float)>
			f2 = f + af1[c + 2];
		//  395  952:fload           5
		//  396  954:aload           4
		//  397  956:iload_2         
		//  398  957:iconst_2        
		//  399  958:iadd            
		//  400  959:faload          
		//  401  960:fadd            
		//  402  961:fstore          7
			f3 = f1 + af1[c + 3];
		//  403  963:fload           6
		//  404  965:aload           4
		//  405  967:iload_2         
		//  406  968:iconst_3        
		//  407  969:iadd            
		//  408  970:faload          
		//  409  971:fadd            
		//  410  972:fstore          8
			f += af1[c + 4];
		//  411  974:fload           5
		//  412  976:aload           4
		//  413  978:iload_2         
		//  414  979:iconst_4        
		//  415  980:iadd            
		//  416  981:faload          
		//  417  982:fadd            
		//  418  983:fstore          5
			f1 += af1[c + 5];
		//  419  985:fload           6
		//  420  987:aload           4
		//  421  989:iload_2         
		//  422  990:iconst_5        
		//  423  991:iadd            
		//  424  992:faload          
		//  425  993:fadd            
		//  426  994:fstore          6
			f5 = f6;
		//  427  996:fload           11
		//  428  998:fstore          10
			  goto _L30
		//* 429 1000:goto            404
_L12:
			path.cubicTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3], af1[c + 4], af1[c + 5]);
		//  430 1003:aload_0         
		//  431 1004:aload           4
		//  432 1006:iload_2         
		//  433 1007:iconst_0        
		//  434 1008:iadd            
		//  435 1009:faload          
		//  436 1010:aload           4
		//  437 1012:iload_2         
		//  438 1013:iconst_1        
		//  439 1014:iadd            
		//  440 1015:faload          
		//  441 1016:aload           4
		//  442 1018:iload_2         
		//  443 1019:iconst_2        
		//  444 1020:iadd            
		//  445 1021:faload          
		//  446 1022:aload           4
		//  447 1024:iload_2         
		//  448 1025:iconst_3        
		//  449 1026:iadd            
		//  450 1027:faload          
		//  451 1028:aload           4
		//  452 1030:iload_2         
		//  453 1031:iconst_4        
		//  454 1032:iadd            
		//  455 1033:faload          
		//  456 1034:aload           4
		//  457 1036:iload_2         
		//  458 1037:iconst_5        
		//  459 1038:iadd            
		//  460 1039:faload          
		//  461 1040:invokevirtual   #57  <Method void Path.cubicTo(float, float, float, float, float, float)>
			f = af1[c + 4];
		//  462 1043:aload           4
		//  463 1045:iload_2         
		//  464 1046:iconst_4        
		//  465 1047:iadd            
		//  466 1048:faload          
		//  467 1049:fstore          5
			f1 = af1[c + 5];
		//  468 1051:aload           4
		//  469 1053:iload_2         
		//  470 1054:iconst_5        
		//  471 1055:iadd            
		//  472 1056:faload          
		//  473 1057:fstore          6
			f2 = af1[c + 2];
		//  474 1059:aload           4
		//  475 1061:iload_2         
		//  476 1062:iconst_2        
		//  477 1063:iadd            
		//  478 1064:faload          
		//  479 1065:fstore          7
			f3 = af1[c + 3];
		//  480 1067:aload           4
		//  481 1069:iload_2         
		//  482 1070:iconst_3        
		//  483 1071:iadd            
		//  484 1072:faload          
		//  485 1073:fstore          8
			f5 = f6;
		//  486 1075:fload           11
		//  487 1077:fstore          10
			  goto _L30
		//* 488 1079:goto            404
_L26:
			f2 = 0.0F;
		//  489 1082:fconst_0        
		//  490 1083:fstore          7
			f3 = 0.0F;
		//  491 1085:fconst_0        
		//  492 1086:fstore          8
			if(c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S')
		//* 493 1088:iload           15
		//* 494 1090:bipush          99
		//* 495 1092:icmpeq          1116
		//* 496 1095:iload           15
		//* 497 1097:bipush          115
		//* 498 1099:icmpeq          1116
		//* 499 1102:iload           15
		//* 500 1104:bipush          67
		//* 501 1106:icmpeq          1116
		//* 502 1109:iload           15
		//* 503 1111:bipush          83
		//* 504 1113:icmpne          1130
			{
				f2 = f - f8;
		//  505 1116:fload           5
		//  506 1118:fload           13
		//  507 1120:fsub            
		//  508 1121:fstore          7
				f3 = f1 - f7;
		//  509 1123:fload           6
		//  510 1125:fload           12
		//  511 1127:fsub            
		//  512 1128:fstore          8
			}
			path.rCubicTo(f2, f3, af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		//  513 1130:aload_0         
		//  514 1131:fload           7
		//  515 1133:fload           8
		//  516 1135:aload           4
		//  517 1137:iload_2         
		//  518 1138:iconst_0        
		//  519 1139:iadd            
		//  520 1140:faload          
		//  521 1141:aload           4
		//  522 1143:iload_2         
		//  523 1144:iconst_1        
		//  524 1145:iadd            
		//  525 1146:faload          
		//  526 1147:aload           4
		//  527 1149:iload_2         
		//  528 1150:iconst_2        
		//  529 1151:iadd            
		//  530 1152:faload          
		//  531 1153:aload           4
		//  532 1155:iload_2         
		//  533 1156:iconst_3        
		//  534 1157:iadd            
		//  535 1158:faload          
		//  536 1159:invokevirtual   #54  <Method void Path.rCubicTo(float, float, float, float, float, float)>
			f2 = f + af1[c + 0];
		//  537 1162:fload           5
		//  538 1164:aload           4
		//  539 1166:iload_2         
		//  540 1167:iconst_0        
		//  541 1168:iadd            
		//  542 1169:faload          
		//  543 1170:fadd            
		//  544 1171:fstore          7
			f3 = f1 + af1[c + 1];
		//  545 1173:fload           6
		//  546 1175:aload           4
		//  547 1177:iload_2         
		//  548 1178:iconst_1        
		//  549 1179:iadd            
		//  550 1180:faload          
		//  551 1181:fadd            
		//  552 1182:fstore          8
			f += af1[c + 2];
		//  553 1184:fload           5
		//  554 1186:aload           4
		//  555 1188:iload_2         
		//  556 1189:iconst_2        
		//  557 1190:iadd            
		//  558 1191:faload          
		//  559 1192:fadd            
		//  560 1193:fstore          5
			f1 += af1[c + 3];
		//  561 1195:fload           6
		//  562 1197:aload           4
		//  563 1199:iload_2         
		//  564 1200:iconst_3        
		//  565 1201:iadd            
		//  566 1202:faload          
		//  567 1203:fadd            
		//  568 1204:fstore          6
			f5 = f6;
		//  569 1206:fload           11
		//  570 1208:fstore          10
			  goto _L30
		//* 571 1210:goto            404
_L17:
			f3 = f;
		//  572 1213:fload           5
		//  573 1215:fstore          8
			f2 = f1;
		//  574 1217:fload           6
		//  575 1219:fstore          7
			if(c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S')
		//* 576 1221:iload           15
		//* 577 1223:bipush          99
		//* 578 1225:icmpeq          1249
		//* 579 1228:iload           15
		//* 580 1230:bipush          115
		//* 581 1232:icmpeq          1249
		//* 582 1235:iload           15
		//* 583 1237:bipush          67
		//* 584 1239:icmpeq          1249
		//* 585 1242:iload           15
		//* 586 1244:bipush          83
		//* 587 1246:icmpne          1267
			{
				f3 = 2.0F * f - f8;
		//  588 1249:fconst_2        
		//  589 1250:fload           5
		//  590 1252:fmul            
		//  591 1253:fload           13
		//  592 1255:fsub            
		//  593 1256:fstore          8
				f2 = 2.0F * f1 - f7;
		//  594 1258:fconst_2        
		//  595 1259:fload           6
		//  596 1261:fmul            
		//  597 1262:fload           12
		//  598 1264:fsub            
		//  599 1265:fstore          7
			}
			path.cubicTo(f3, f2, af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		//  600 1267:aload_0         
		//  601 1268:fload           8
		//  602 1270:fload           7
		//  603 1272:aload           4
		//  604 1274:iload_2         
		//  605 1275:iconst_0        
		//  606 1276:iadd            
		//  607 1277:faload          
		//  608 1278:aload           4
		//  609 1280:iload_2         
		//  610 1281:iconst_1        
		//  611 1282:iadd            
		//  612 1283:faload          
		//  613 1284:aload           4
		//  614 1286:iload_2         
		//  615 1287:iconst_2        
		//  616 1288:iadd            
		//  617 1289:faload          
		//  618 1290:aload           4
		//  619 1292:iload_2         
		//  620 1293:iconst_3        
		//  621 1294:iadd            
		//  622 1295:faload          
		//  623 1296:invokevirtual   #57  <Method void Path.cubicTo(float, float, float, float, float, float)>
			f2 = af1[c + 0];
		//  624 1299:aload           4
		//  625 1301:iload_2         
		//  626 1302:iconst_0        
		//  627 1303:iadd            
		//  628 1304:faload          
		//  629 1305:fstore          7
			f3 = af1[c + 1];
		//  630 1307:aload           4
		//  631 1309:iload_2         
		//  632 1310:iconst_1        
		//  633 1311:iadd            
		//  634 1312:faload          
		//  635 1313:fstore          8
			f = af1[c + 2];
		//  636 1315:aload           4
		//  637 1317:iload_2         
		//  638 1318:iconst_2        
		//  639 1319:iadd            
		//  640 1320:faload          
		//  641 1321:fstore          5
			f1 = af1[c + 3];
		//  642 1323:aload           4
		//  643 1325:iload_2         
		//  644 1326:iconst_3        
		//  645 1327:iadd            
		//  646 1328:faload          
		//  647 1329:fstore          6
			f5 = f6;
		//  648 1331:fload           11
		//  649 1333:fstore          10
			  goto _L30
		//* 650 1335:goto            404
_L25:
			path.rQuadTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		//  651 1338:aload_0         
		//  652 1339:aload           4
		//  653 1341:iload_2         
		//  654 1342:iconst_0        
		//  655 1343:iadd            
		//  656 1344:faload          
		//  657 1345:aload           4
		//  658 1347:iload_2         
		//  659 1348:iconst_1        
		//  660 1349:iadd            
		//  661 1350:faload          
		//  662 1351:aload           4
		//  663 1353:iload_2         
		//  664 1354:iconst_2        
		//  665 1355:iadd            
		//  666 1356:faload          
		//  667 1357:aload           4
		//  668 1359:iload_2         
		//  669 1360:iconst_3        
		//  670 1361:iadd            
		//  671 1362:faload          
		//  672 1363:invokevirtual   #61  <Method void Path.rQuadTo(float, float, float, float)>
			f2 = f + af1[c + 0];
		//  673 1366:fload           5
		//  674 1368:aload           4
		//  675 1370:iload_2         
		//  676 1371:iconst_0        
		//  677 1372:iadd            
		//  678 1373:faload          
		//  679 1374:fadd            
		//  680 1375:fstore          7
			f3 = f1 + af1[c + 1];
		//  681 1377:fload           6
		//  682 1379:aload           4
		//  683 1381:iload_2         
		//  684 1382:iconst_1        
		//  685 1383:iadd            
		//  686 1384:faload          
		//  687 1385:fadd            
		//  688 1386:fstore          8
			f += af1[c + 2];
		//  689 1388:fload           5
		//  690 1390:aload           4
		//  691 1392:iload_2         
		//  692 1393:iconst_2        
		//  693 1394:iadd            
		//  694 1395:faload          
		//  695 1396:fadd            
		//  696 1397:fstore          5
			f1 += af1[c + 3];
		//  697 1399:fload           6
		//  698 1401:aload           4
		//  699 1403:iload_2         
		//  700 1404:iconst_3        
		//  701 1405:iadd            
		//  702 1406:faload          
		//  703 1407:fadd            
		//  704 1408:fstore          6
			f5 = f6;
		//  705 1410:fload           11
		//  706 1412:fstore          10
			  goto _L30
		//* 707 1414:goto            404
_L16:
			path.quadTo(af1[c + 0], af1[c + 1], af1[c + 2], af1[c + 3]);
		//  708 1417:aload_0         
		//  709 1418:aload           4
		//  710 1420:iload_2         
		//  711 1421:iconst_0        
		//  712 1422:iadd            
		//  713 1423:faload          
		//  714 1424:aload           4
		//  715 1426:iload_2         
		//  716 1427:iconst_1        
		//  717 1428:iadd            
		//  718 1429:faload          
		//  719 1430:aload           4
		//  720 1432:iload_2         
		//  721 1433:iconst_2        
		//  722 1434:iadd            
		//  723 1435:faload          
		//  724 1436:aload           4
		//  725 1438:iload_2         
		//  726 1439:iconst_3        
		//  727 1440:iadd            
		//  728 1441:faload          
		//  729 1442:invokevirtual   #64  <Method void Path.quadTo(float, float, float, float)>
			f2 = af1[c + 0];
		//  730 1445:aload           4
		//  731 1447:iload_2         
		//  732 1448:iconst_0        
		//  733 1449:iadd            
		//  734 1450:faload          
		//  735 1451:fstore          7
			f3 = af1[c + 1];
		//  736 1453:aload           4
		//  737 1455:iload_2         
		//  738 1456:iconst_1        
		//  739 1457:iadd            
		//  740 1458:faload          
		//  741 1459:fstore          8
			f = af1[c + 2];
		//  742 1461:aload           4
		//  743 1463:iload_2         
		//  744 1464:iconst_2        
		//  745 1465:iadd            
		//  746 1466:faload          
		//  747 1467:fstore          5
			f1 = af1[c + 3];
		//  748 1469:aload           4
		//  749 1471:iload_2         
		//  750 1472:iconst_3        
		//  751 1473:iadd            
		//  752 1474:faload          
		//  753 1475:fstore          6
			f5 = f6;
		//  754 1477:fload           11
		//  755 1479:fstore          10
			  goto _L30
		//* 756 1481:goto            404
_L27:
			f3 = 0.0F;
		//  757 1484:fconst_0        
		//  758 1485:fstore          8
			f2 = 0.0F;
		//  759 1487:fconst_0        
		//  760 1488:fstore          7
			if(c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T')
		//* 761 1490:iload           15
		//* 762 1492:bipush          113
		//* 763 1494:icmpeq          1518
		//* 764 1497:iload           15
		//* 765 1499:bipush          116
		//* 766 1501:icmpeq          1518
		//* 767 1504:iload           15
		//* 768 1506:bipush          81
		//* 769 1508:icmpeq          1518
		//* 770 1511:iload           15
		//* 771 1513:bipush          84
		//* 772 1515:icmpne          1532
			{
				f3 = f - f8;
		//  773 1518:fload           5
		//  774 1520:fload           13
		//  775 1522:fsub            
		//  776 1523:fstore          8
				f2 = f1 - f7;
		//  777 1525:fload           6
		//  778 1527:fload           12
		//  779 1529:fsub            
		//  780 1530:fstore          7
			}
			path.rQuadTo(f3, f2, af1[c + 0], af1[c + 1]);
		//  781 1532:aload_0         
		//  782 1533:fload           8
		//  783 1535:fload           7
		//  784 1537:aload           4
		//  785 1539:iload_2         
		//  786 1540:iconst_0        
		//  787 1541:iadd            
		//  788 1542:faload          
		//  789 1543:aload           4
		//  790 1545:iload_2         
		//  791 1546:iconst_1        
		//  792 1547:iadd            
		//  793 1548:faload          
		//  794 1549:invokevirtual   #61  <Method void Path.rQuadTo(float, float, float, float)>
			f3 = f + f3;
		//  795 1552:fload           5
		//  796 1554:fload           8
		//  797 1556:fadd            
		//  798 1557:fstore          8
			f5 = f1 + f2;
		//  799 1559:fload           6
		//  800 1561:fload           7
		//  801 1563:fadd            
		//  802 1564:fstore          10
			f += af1[c + 0];
		//  803 1566:fload           5
		//  804 1568:aload           4
		//  805 1570:iload_2         
		//  806 1571:iconst_0        
		//  807 1572:iadd            
		//  808 1573:faload          
		//  809 1574:fadd            
		//  810 1575:fstore          5
			f1 += af1[c + 1];
		//  811 1577:fload           6
		//  812 1579:aload           4
		//  813 1581:iload_2         
		//  814 1582:iconst_1        
		//  815 1583:iadd            
		//  816 1584:faload          
		//  817 1585:fadd            
		//  818 1586:fstore          6
			f2 = f3;
		//  819 1588:fload           8
		//  820 1590:fstore          7
			f3 = f5;
		//  821 1592:fload           10
		//  822 1594:fstore          8
			f5 = f6;
		//  823 1596:fload           11
		//  824 1598:fstore          10
			  goto _L30
		//* 825 1600:goto            404
_L18:
			f3 = f;
		//  826 1603:fload           5
		//  827 1605:fstore          8
			f2 = f1;
		//  828 1607:fload           6
		//  829 1609:fstore          7
			if(c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T')
		//* 830 1611:iload           15
		//* 831 1613:bipush          113
		//* 832 1615:icmpeq          1639
		//* 833 1618:iload           15
		//* 834 1620:bipush          116
		//* 835 1622:icmpeq          1639
		//* 836 1625:iload           15
		//* 837 1627:bipush          81
		//* 838 1629:icmpeq          1639
		//* 839 1632:iload           15
		//* 840 1634:bipush          84
		//* 841 1636:icmpne          1657
			{
				f3 = 2.0F * f - f8;
		//  842 1639:fconst_2        
		//  843 1640:fload           5
		//  844 1642:fmul            
		//  845 1643:fload           13
		//  846 1645:fsub            
		//  847 1646:fstore          8
				f2 = 2.0F * f1 - f7;
		//  848 1648:fconst_2        
		//  849 1649:fload           6
		//  850 1651:fmul            
		//  851 1652:fload           12
		//  852 1654:fsub            
		//  853 1655:fstore          7
			}
			path.quadTo(f3, f2, af1[c + 0], af1[c + 1]);
		//  854 1657:aload_0         
		//  855 1658:fload           8
		//  856 1660:fload           7
		//  857 1662:aload           4
		//  858 1664:iload_2         
		//  859 1665:iconst_0        
		//  860 1666:iadd            
		//  861 1667:faload          
		//  862 1668:aload           4
		//  863 1670:iload_2         
		//  864 1671:iconst_1        
		//  865 1672:iadd            
		//  866 1673:faload          
		//  867 1674:invokevirtual   #64  <Method void Path.quadTo(float, float, float, float)>
			f = f2;
		//  868 1677:fload           7
		//  869 1679:fstore          5
			f7 = af1[c + 0];
		//  870 1681:aload           4
		//  871 1683:iload_2         
		//  872 1684:iconst_0        
		//  873 1685:iadd            
		//  874 1686:faload          
		//  875 1687:fstore          12
			f1 = af1[c + 1];
		//  876 1689:aload           4
		//  877 1691:iload_2         
		//  878 1692:iconst_1        
		//  879 1693:iadd            
		//  880 1694:faload          
		//  881 1695:fstore          6
			f2 = f3;
		//  882 1697:fload           8
		//  883 1699:fstore          7
			f3 = f;
		//  884 1701:fload           5
		//  885 1703:fstore          8
			f5 = f6;
		//  886 1705:fload           11
		//  887 1707:fstore          10
			f = f7;
		//  888 1709:fload           12
		//  889 1711:fstore          5
			  goto _L30
		//* 890 1713:goto            404
_L20:
			f2 = af1[c + 5];
		//  891 1716:aload           4
		//  892 1718:iload_2         
		//  893 1719:iconst_5        
		//  894 1720:iadd            
		//  895 1721:faload          
		//  896 1722:fstore          7
			f3 = af1[c + 6];
		//  897 1724:aload           4
		//  898 1726:iload_2         
		//  899 1727:bipush          6
		//  900 1729:iadd            
		//  901 1730:faload          
		//  902 1731:fstore          8
			f5 = af1[c + 0];
		//  903 1733:aload           4
		//  904 1735:iload_2         
		//  905 1736:iconst_0        
		//  906 1737:iadd            
		//  907 1738:faload          
		//  908 1739:fstore          10
			f7 = af1[c + 1];
		//  909 1741:aload           4
		//  910 1743:iload_2         
		//  911 1744:iconst_1        
		//  912 1745:iadd            
		//  913 1746:faload          
		//  914 1747:fstore          12
			f8 = af1[c + 2];
		//  915 1749:aload           4
		//  916 1751:iload_2         
		//  917 1752:iconst_2        
		//  918 1753:iadd            
		//  919 1754:faload          
		//  920 1755:fstore          13
			boolean flag1;
			boolean flag3;
			if(af1[c + 3] != 0.0F)
		//* 921 1757:aload           4
		//* 922 1759:iload_2         
		//* 923 1760:iconst_3        
		//* 924 1761:iadd            
		//* 925 1762:faload          
		//* 926 1763:fconst_0        
		//* 927 1764:fcmpl           
		//* 928 1765:ifeq            1851
				flag1 = true;
		//  929 1768:iconst_1        
		//  930 1769:istore          17
			else
		//* 931 1771:aload           4
		//* 932 1773:iload_2         
		//* 933 1774:iconst_4        
		//* 934 1775:iadd            
		//* 935 1776:faload          
		//* 936 1777:fconst_0        
		//* 937 1778:fcmpl           
		//* 938 1779:ifeq            1857
		//* 939 1782:iconst_1        
		//* 940 1783:istore          18
		//* 941 1785:aload_0         
		//* 942 1786:fload           5
		//* 943 1788:fload           6
		//* 944 1790:fload           7
		//* 945 1792:fload           5
		//* 946 1794:fadd            
		//* 947 1795:fload           8
		//* 948 1797:fload           6
		//* 949 1799:fadd            
		//* 950 1800:fload           10
		//* 951 1802:fload           12
		//* 952 1804:fload           13
		//* 953 1806:iload           17
		//* 954 1808:iload           18
		//* 955 1810:invokestatic    #68  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
		//* 956 1813:fload           5
		//* 957 1815:aload           4
		//* 958 1817:iload_2         
		//* 959 1818:iconst_5        
		//* 960 1819:iadd            
		//* 961 1820:faload          
		//* 962 1821:fadd            
		//* 963 1822:fstore          5
		//* 964 1824:fload           6
		//* 965 1826:aload           4
		//* 966 1828:iload_2         
		//* 967 1829:bipush          6
		//* 968 1831:iadd            
		//* 969 1832:faload          
		//* 970 1833:fadd            
		//* 971 1834:fstore          6
		//* 972 1836:fload           5
		//* 973 1838:fstore          7
		//* 974 1840:fload           6
		//* 975 1842:fstore          8
		//* 976 1844:fload           11
		//* 977 1846:fstore          10
		//* 978 1848:goto            404
				flag1 = false;
		//  979 1851:iconst_0        
		//  980 1852:istore          17
			if(af1[c + 4] != 0.0F)
				flag3 = true;
			else
		//* 981 1854:goto            1771
				flag3 = false;
		//  982 1857:iconst_0        
		//  983 1858:istore          18
			drawArc(path, f, f1, f2 + f, f3 + f1, f5, f7, f8, flag1, flag3);
			f += af1[c + 5];
			f1 += af1[c + 6];
			f2 = f;
			f3 = f1;
			f5 = f6;
			  goto _L30
		//* 984 1860:goto            1785
_L11:
			f2 = af1[c + 5];
		//  985 1863:aload           4
		//  986 1865:iload_2         
		//  987 1866:iconst_5        
		//  988 1867:iadd            
		//  989 1868:faload          
		//  990 1869:fstore          7
			f3 = af1[c + 6];
		//  991 1871:aload           4
		//  992 1873:iload_2         
		//  993 1874:bipush          6
		//  994 1876:iadd            
		//  995 1877:faload          
		//  996 1878:fstore          8
			f5 = af1[c + 0];
		//  997 1880:aload           4
		//  998 1882:iload_2         
		//  999 1883:iconst_0        
		// 1000 1884:iadd            
		// 1001 1885:faload          
		// 1002 1886:fstore          10
			f7 = af1[c + 1];
		// 1003 1888:aload           4
		// 1004 1890:iload_2         
		// 1005 1891:iconst_1        
		// 1006 1892:iadd            
		// 1007 1893:faload          
		// 1008 1894:fstore          12
			f8 = af1[c + 2];
		// 1009 1896:aload           4
		// 1010 1898:iload_2         
		// 1011 1899:iconst_2        
		// 1012 1900:iadd            
		// 1013 1901:faload          
		// 1014 1902:fstore          13
			boolean flag2;
			boolean flag4;
			if(af1[c + 3] != 0.0F)
		//*1015 1904:aload           4
		//*1016 1906:iload_2         
		//*1017 1907:iconst_3        
		//*1018 1908:iadd            
		//*1019 1909:faload          
		//*1020 1910:fconst_0        
		//*1021 1911:fcmpl           
		//*1022 1912:ifeq            1986
				flag2 = true;
		// 1023 1915:iconst_1        
		// 1024 1916:istore          17
			else
		//*1025 1918:aload           4
		//*1026 1920:iload_2         
		//*1027 1921:iconst_4        
		//*1028 1922:iadd            
		//*1029 1923:faload          
		//*1030 1924:fconst_0        
		//*1031 1925:fcmpl           
		//*1032 1926:ifeq            1992
		//*1033 1929:iconst_1        
		//*1034 1930:istore          18
		//*1035 1932:aload_0         
		//*1036 1933:fload           5
		//*1037 1935:fload           6
		//*1038 1937:fload           7
		//*1039 1939:fload           8
		//*1040 1941:fload           10
		//*1041 1943:fload           12
		//*1042 1945:fload           13
		//*1043 1947:iload           17
		//*1044 1949:iload           18
		//*1045 1951:invokestatic    #68  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
		//*1046 1954:aload           4
		//*1047 1956:iload_2         
		//*1048 1957:iconst_5        
		//*1049 1958:iadd            
		//*1050 1959:faload          
		//*1051 1960:fstore          5
		//*1052 1962:aload           4
		//*1053 1964:iload_2         
		//*1054 1965:bipush          6
		//*1055 1967:iadd            
		//*1056 1968:faload          
		//*1057 1969:fstore          6
		//*1058 1971:fload           5
		//*1059 1973:fstore          7
		//*1060 1975:fload           6
		//*1061 1977:fstore          8
		//*1062 1979:fload           11
		//*1063 1981:fstore          10
		//*1064 1983:goto            404
				flag2 = false;
		// 1065 1986:iconst_0        
		// 1066 1987:istore          17
			if(af1[c + 4] != 0.0F)
				flag4 = true;
			else
		//*1067 1989:goto            1918
				flag4 = false;
		// 1068 1992:iconst_0        
		// 1069 1993:istore          18
			drawArc(path, f, f1, f2, f3, f5, f7, f8, flag2, flag4);
			f = af1[c + 5];
			f1 = af1[c + 6];
			f2 = f;
			f3 = f1;
			f5 = f6;
			  goto _L30
		//*1070 1995:goto            1932
_L9:
			af[0] = f;
		// 1071 1998:aload_1         
		// 1072 1999:iconst_0        
		// 1073 2000:fload           5
		// 1074 2002:fastore         
			af[1] = f1;
		// 1075 2003:aload_1         
		// 1076 2004:iconst_1        
		// 1077 2005:fload           6
		// 1078 2007:fastore         
			af[2] = f8;
		// 1079 2008:aload_1         
		// 1080 2009:iconst_2        
		// 1081 2010:fload           13
		// 1082 2012:fastore         
			af[3] = f7;
		// 1083 2013:aload_1         
		// 1084 2014:iconst_3        
		// 1085 2015:fload           12
		// 1086 2017:fastore         
			af[4] = f4;
		// 1087 2018:aload_1         
		// 1088 2019:iconst_4        
		// 1089 2020:fload           9
		// 1090 2022:fastore         
			af[5] = f6;
		// 1091 2023:aload_1         
		// 1092 2024:iconst_5        
		// 1093 2025:fload           11
		// 1094 2027:fastore         
			return;
		// 1095 2028:return          
			if(true) goto _L1; else goto _L31
_L31:
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
			double d9 = d7;
		//    9   19:dload           15
		//   10   21:dstore          19
			double d17 = Math.cos(d6);
		//   11   23:dload           13
		//   12   25:invokestatic    #86  <Method double Math.cos(double)>
		//   13   28:dstore          29
			double d18 = Math.sin(d6);
		//   14   30:dload           13
		//   15   32:invokestatic    #89  <Method double Math.sin(double)>
		//   16   35:dstore          31
			d6 = Math.cos(d9);
		//   17   37:dload           19
		//   18   39:invokestatic    #86  <Method double Math.cos(double)>
		//   19   42:dstore          13
			d7 = Math.sin(d9);
		//   20   44:dload           19
		//   21   46:invokestatic    #89  <Method double Math.sin(double)>
		//   22   49:dstore          15
			double d11 = -d2 * d17 * d7 - d3 * d18 * d6;
		//   23   51:dload           5
		//   24   53:dneg            
		//   25   54:dload           29
		//   26   56:dmul            
		//   27   57:dload           15
		//   28   59:dmul            
		//   29   60:dload           7
		//   30   62:dload           31
		//   31   64:dmul            
		//   32   65:dload           13
		//   33   67:dmul            
		//   34   68:dsub            
		//   35   69:dstore          21
			double d13 = -d2 * d18 * d7 + d3 * d17 * d6;
		//   36   71:dload           5
		//   37   73:dneg            
		//   38   74:dload           31
		//   39   76:dmul            
		//   40   77:dload           15
		//   41   79:dmul            
		//   42   80:dload           7
		//   43   82:dload           29
		//   44   84:dmul            
		//   45   85:dload           13
		//   46   87:dmul            
		//   47   88:dadd            
		//   48   89:dstore          23
			double d19 = d8 / (double)j;
		//   49   91:dload           17
		//   50   93:iload           38
		//   51   95:i2d             
		//   52   96:ddiv            
		//   53   97:dstore          33
			int i = 0;
		//   54   99:iconst_0        
		//   55  100:istore          37
			d7 = d5;
		//   56  102:dload           11
		//   57  104:dstore          15
			d6 = d4;
		//   58  106:dload           9
		//   59  108:dstore          13
			d8 = d9;
		//   60  110:dload           19
		//   61  112:dstore          17
			d5 = d13;
		//   62  114:dload           23
		//   63  116:dstore          11
			d4 = d11;
		//   64  118:dload           21
		//   65  120:dstore          9
			for(; i < j; i++)
		//*  66  122:iload           37
		//*  67  124:iload           38
		//*  68  126:icmpge          360
			{
				double d16 = d8 + d19;
		//   69  129:dload           17
		//   70  131:dload           33
		//   71  133:dadd            
		//   72  134:dstore          27
				double d14 = Math.sin(d16);
		//   73  136:dload           27
		//   74  138:invokestatic    #89  <Method double Math.sin(double)>
		//   75  141:dstore          23
				double d20 = Math.cos(d16);
		//   76  143:dload           27
		//   77  145:invokestatic    #86  <Method double Math.cos(double)>
		//   78  148:dstore          35
				double d15 = (d2 * d17 * d20 + d) - d3 * d18 * d14;
		//   79  150:dload           5
		//   80  152:dload           29
		//   81  154:dmul            
		//   82  155:dload           35
		//   83  157:dmul            
		//   84  158:dload_1         
		//   85  159:dadd            
		//   86  160:dload           7
		//   87  162:dload           31
		//   88  164:dmul            
		//   89  165:dload           23
		//   90  167:dmul            
		//   91  168:dsub            
		//   92  169:dstore          25
				double d12 = d2 * d18 * d20 + d1 + d3 * d17 * d14;
		//   93  171:dload           5
		//   94  173:dload           31
		//   95  175:dmul            
		//   96  176:dload           35
		//   97  178:dmul            
		//   98  179:dload_3         
		//   99  180:dadd            
		//  100  181:dload           7
		//  101  183:dload           29
		//  102  185:dmul            
		//  103  186:dload           23
		//  104  188:dmul            
		//  105  189:dadd            
		//  106  190:dstore          21
				double d10 = -d2 * d17 * d14 - d3 * d18 * d20;
		//  107  192:dload           5
		//  108  194:dneg            
		//  109  195:dload           29
		//  110  197:dmul            
		//  111  198:dload           23
		//  112  200:dmul            
		//  113  201:dload           7
		//  114  203:dload           31
		//  115  205:dmul            
		//  116  206:dload           35
		//  117  208:dmul            
		//  118  209:dsub            
		//  119  210:dstore          19
				d14 = -d2 * d18 * d14 + d3 * d17 * d20;
		//  120  212:dload           5
		//  121  214:dneg            
		//  122  215:dload           31
		//  123  217:dmul            
		//  124  218:dload           23
		//  125  220:dmul            
		//  126  221:dload           7
		//  127  223:dload           29
		//  128  225:dmul            
		//  129  226:dload           35
		//  130  228:dmul            
		//  131  229:dadd            
		//  132  230:dstore          23
				d20 = Math.tan((d16 - d8) / 2D);
		//  133  232:dload           27
		//  134  234:dload           17
		//  135  236:dsub            
		//  136  237:ldc2w           #90  <Double 2D>
		//  137  240:ddiv            
		//  138  241:invokestatic    #94  <Method double Math.tan(double)>
		//  139  244:dstore          35
				d8 = (Math.sin(d16 - d8) * (Math.sqrt(4D + 3D * d20 * d20) - 1.0D)) / 3D;
		//  140  246:dload           27
		//  141  248:dload           17
		//  142  250:dsub            
		//  143  251:invokestatic    #89  <Method double Math.sin(double)>
		//  144  254:ldc2w           #71  <Double 4D>
		//  145  257:ldc2w           #95  <Double 3D>
		//  146  260:dload           35
		//  147  262:dmul            
		//  148  263:dload           35
		//  149  265:dmul            
		//  150  266:dadd            
		//  151  267:invokestatic    #99  <Method double Math.sqrt(double)>
		//  152  270:dconst_1        
		//  153  271:dsub            
		//  154  272:dmul            
		//  155  273:ldc2w           #95  <Double 3D>
		//  156  276:ddiv            
		//  157  277:dstore          17
				path.rLineTo(0.0F, 0.0F);
		//  158  279:aload_0         
		//  159  280:fconst_0        
		//  160  281:fconst_0        
		//  161  282:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
				path.cubicTo((float)(d6 + d8 * d4), (float)(d7 + d8 * d5), (float)(d15 - d8 * d10), (float)(d12 - d8 * d14), (float)d15, (float)d12);
		//  162  285:aload_0         
		//  163  286:dload           13
		//  164  288:dload           17
		//  165  290:dload           9
		//  166  292:dmul            
		//  167  293:dadd            
		//  168  294:d2f             
		//  169  295:dload           15
		//  170  297:dload           17
		//  171  299:dload           11
		//  172  301:dmul            
		//  173  302:dadd            
		//  174  303:d2f             
		//  175  304:dload           25
		//  176  306:dload           17
		//  177  308:dload           19
		//  178  310:dmul            
		//  179  311:dsub            
		//  180  312:d2f             
		//  181  313:dload           21
		//  182  315:dload           17
		//  183  317:dload           23
		//  184  319:dmul            
		//  185  320:dsub            
		//  186  321:d2f             
		//  187  322:dload           25
		//  188  324:d2f             
		//  189  325:dload           21
		//  190  327:d2f             
		//  191  328:invokevirtual   #57  <Method void Path.cubicTo(float, float, float, float, float, float)>
				d8 = d16;
		//  192  331:dload           27
		//  193  333:dstore          17
				d6 = d15;
		//  194  335:dload           25
		//  195  337:dstore          13
				d7 = d12;
		//  196  339:dload           21
		//  197  341:dstore          15
				d4 = d10;
		//  198  343:dload           19
		//  199  345:dstore          9
				d5 = d14;
		//  200  347:dload           23
		//  201  349:dstore          11
			}

		//  202  351:iload           37
		//  203  353:iconst_1        
		//  204  354:iadd            
		//  205  355:istore          37
		//* 206  357:goto            122
		//  207  360:return          
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
			d10 = d11 * d10;
		//  147  247:dload           32
		//  148  249:dload           30
		//  149  251:dmul            
		//  150  252:dstore          30
			d9 = d11 * d9;
		//  151  254:dload           32
		//  152  256:dload           28
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
				d1 += d10;
		//  162  275:dload           12
		//  163  277:dload           30
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
		//* 203  351:dload           14
		//* 204  353:fload           5
		//* 205  355:f2d             
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
				d2 += d9;
		//  241  410:dload           14
		//  242  412:dload           28
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
			d2 *= f4;
			d1 *= f5;
			arcToBezier(path, d2 * d5 - d1 * d6, d2 * d6 + d1 * d5, f4, f5, f, f1, d4, d7, d);
		//* 257  441:goto            351
		}

		public static void nodesToPath(PathDataNode apathdatanode[], Path path)
		{
			float af[] = new float[6];
		//    0    0:bipush          6
		//    1    2:newarray        float[]
		//    2    4:astore          4
			char c = 'm';
		//    3    6:bipush          109
		//    4    8:istore_2        
			for(int i = 0; i < apathdatanode.length; i++)
		//*   5    9:iconst_0        
		//*   6   10:istore_3        
		//*   7   11:iload_3         
		//*   8   12:aload_0         
		//*   9   13:arraylength     
		//*  10   14:icmpge          50
			{
				addCommand(path, af, c, apathdatanode[i].mType, apathdatanode[i].mParams);
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
				c = apathdatanode[i].mType;
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

		public void interpolatePathDataNode(PathDataNode pathdatanode, PathDataNode pathdatanode1, float f)
		{
			for(int i = 0; i < pathdatanode.mParams.length; i++)
		//*   0    0:iconst_0        
		//*   1    1:istore          4
		//*   2    3:iload           4
		//*   3    5:aload_1         
		//*   4    6:getfield        #24  <Field float[] mParams>
		//*   5    9:arraylength     
		//*   6   10:icmpge          50
				mParams[i] = pathdatanode.mParams[i] * (1.0F - f) + pathdatanode1.mParams[i] * f;
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

		PathDataNode(char c, float af[])
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

		PathDataNode(PathDataNode pathdatanode)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mType = pathdatanode.mType;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #22  <Field char mType>
		//    5    9:putfield        #22  <Field char mType>
			mParams = PathParser.copyOfRange(pathdatanode.mParams, 0, pathdatanode.mParams.length);
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


	public PathParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	private static void addNode(ArrayList arraylist, char c, float af[])
	{
		arraylist.add(((Object) (new PathDataNode(c, af))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class PathParser$PathDataNode>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #28  <Method void PathParser$PathDataNode(char, float[])>
	//    6   10:invokevirtual   #34  <Method boolean ArrayList.add(Object)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static boolean canMorph(PathDataNode apathdatanode[], PathDataNode apathdatanode1[])
	{
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
_L2:
		return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		if(apathdatanode == null || apathdatanode1 == null || apathdatanode.length != apathdatanode1.length) goto _L2; else goto _L1
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:aload_1         
	//    9   13:arraylength     
	//   10   14:icmpne          8
_L1:
		int i = 0;
	//   11   17:iconst_0        
	//   12   18:istore_2        
label0:
		do
		{
label1:
			{
				if(i >= apathdatanode.length)
					break label1;
	//   13   19:iload_2         
	//   14   20:aload_0         
	//   15   21:arraylength     
	//   16   22:icmpge          64
				if(apathdatanode[i].mType != apathdatanode1[i].mType || apathdatanode[i].mParams.length != apathdatanode1[i].mParams.length)
					break label0;
	//   17   25:aload_0         
	//   18   26:iload_2         
	//   19   27:aaload          
	//   20   28:getfield        #42  <Field char PathParser$PathDataNode.mType>
	//   21   31:aload_1         
	//   22   32:iload_2         
	//   23   33:aaload          
	//   24   34:getfield        #42  <Field char PathParser$PathDataNode.mType>
	//   25   37:icmpne          8
	//   26   40:aload_0         
	//   27   41:iload_2         
	//   28   42:aaload          
	//   29   43:getfield        #46  <Field float[] PathParser$PathDataNode.mParams>
	//   30   46:arraylength     
	//   31   47:aload_1         
	//   32   48:iload_2         
	//   33   49:aaload          
	//   34   50:getfield        #46  <Field float[] PathParser$PathDataNode.mParams>
	//   35   53:arraylength     
	//   36   54:icmpne          8
				i++;
	//   37   57:iload_2         
	//   38   58:iconst_1        
	//   39   59:iadd            
	//   40   60:istore_2        
			}
		} while(true);
	//   41   61:goto            19
		if(true) goto _L2; else goto _L3
_L3:
		return true;
	//   42   64:iconst_1        
	//   43   65:ireturn         
	}

	static float[] copyOfRange(float af[], int i, int j)
	{
		if(i > j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          13
			throw new IllegalArgumentException();
	//    3    5:new             #50  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void IllegalArgumentException()>
	//    6   12:athrow          
		int k = af.length;
	//    7   13:aload_0         
	//    8   14:arraylength     
	//    9   15:istore_3        
		if(i < 0 || i > k)
	//*  10   16:iload_1         
	//*  11   17:iflt            25
	//*  12   20:iload_1         
	//*  13   21:iload_3         
	//*  14   22:icmple          33
		{
			throw new ArrayIndexOutOfBoundsException();
	//   15   25:new             #53  <Class ArrayIndexOutOfBoundsException>
	//   16   28:dup             
	//   17   29:invokespecial   #54  <Method void ArrayIndexOutOfBoundsException()>
	//   18   32:athrow          
		} else
		{
			j -= i;
	//   19   33:iload_2         
	//   20   34:iload_1         
	//   21   35:isub            
	//   22   36:istore_2        
			k = Math.min(j, k - i);
	//   23   37:iload_2         
	//   24   38:iload_3         
	//   25   39:iload_1         
	//   26   40:isub            
	//   27   41:invokestatic    #60  <Method int Math.min(int, int)>
	//   28   44:istore_3        
			float af1[] = new float[j];
	//   29   45:iload_2         
	//   30   46:newarray        float[]
	//   31   48:astore          4
			System.arraycopy(((Object) (af)), i, ((Object) (af1)), 0, k);
	//   32   50:aload_0         
	//   33   51:iload_1         
	//   34   52:aload           4
	//   35   54:iconst_0        
	//   36   55:iload_3         
	//   37   56:invokestatic    #66  <Method void System.arraycopy(Object, int, Object, int, int)>
			return af1;
	//   38   59:aload           4
	//   39   61:areturn         
		}
	}

	public static PathDataNode[] createNodesFromPathData(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		int j = 1;
	//    6    8:iconst_1        
	//    7    9:istore_2        
		ArrayList arraylist = new ArrayList();
	//    8   10:new             #30  <Class ArrayList>
	//    9   13:dup             
	//   10   14:invokespecial   #69  <Method void ArrayList()>
	//   11   17:astore_3        
		for(; j < s.length(); j++)
	//*  12   18:iload_2         
	//*  13   19:aload_0         
	//*  14   20:invokevirtual   #75  <Method int String.length()>
	//*  15   23:icmpge          79
		{
			j = nextStart(s, j);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:invokestatic    #79  <Method int nextStart(String, int)>
	//   19   31:istore_2        
			String s1 = s.substring(i, j).trim();
	//   20   32:aload_0         
	//   21   33:iload_1         
	//   22   34:iload_2         
	//   23   35:invokevirtual   #83  <Method String String.substring(int, int)>
	//   24   38:invokevirtual   #87  <Method String String.trim()>
	//   25   41:astore          4
			if(s1.length() > 0)
	//*  26   43:aload           4
	//*  27   45:invokevirtual   #75  <Method int String.length()>
	//*  28   48:ifle            70
			{
				float af[] = getFloats(s1);
	//   29   51:aload           4
	//   30   53:invokestatic    #91  <Method float[] getFloats(String)>
	//   31   56:astore          5
				addNode(arraylist, s1.charAt(0), af);
	//   32   58:aload_3         
	//   33   59:aload           4
	//   34   61:iconst_0        
	//   35   62:invokevirtual   #95  <Method char String.charAt(int)>
	//   36   65:aload           5
	//   37   67:invokestatic    #97  <Method void addNode(ArrayList, char, float[])>
			}
			i = j;
	//   38   70:iload_2         
	//   39   71:istore_1        
		}

	//   40   72:iload_2         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:istore_2        
	//*  44   76:goto            18
		if(j - i == 1 && i < s.length())
	//*  45   79:iload_2         
	//*  46   80:iload_1         
	//*  47   81:isub            
	//*  48   82:iconst_1        
	//*  49   83:icmpne          106
	//*  50   86:iload_1         
	//*  51   87:aload_0         
	//*  52   88:invokevirtual   #75  <Method int String.length()>
	//*  53   91:icmpge          106
			addNode(arraylist, s.charAt(i), new float[0]);
	//   54   94:aload_3         
	//   55   95:aload_0         
	//   56   96:iload_1         
	//   57   97:invokevirtual   #95  <Method char String.charAt(int)>
	//   58  100:iconst_0        
	//   59  101:newarray        float[]
	//   60  103:invokestatic    #97  <Method void addNode(ArrayList, char, float[])>
		return (PathDataNode[])arraylist.toArray(((Object []) (new PathDataNode[arraylist.size()])));
	//   61  106:aload_3         
	//   62  107:aload_3         
	//   63  108:invokevirtual   #100 <Method int ArrayList.size()>
	//   64  111:anewarray       PathDataNode[]
	//   65  114:invokevirtual   #104 <Method Object[] ArrayList.toArray(Object[])>
	//   66  117:checkcast       #106 <Class PathParser$PathDataNode[]>
	//   67  120:areturn         
	}

	public static Path createPathFromPathData(String s)
	{
		Path path = new Path();
	//    0    0:new             #112 <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #113 <Method void Path()>
	//    3    7:astore_1        
		PathDataNode apathdatanode[] = createNodesFromPathData(s);
	//    4    8:aload_0         
	//    5    9:invokestatic    #115 <Method PathParser$PathDataNode[] createNodesFromPathData(String)>
	//    6   12:astore_2        
		if(apathdatanode != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          53
		{
			try
			{
				PathDataNode.nodesToPath(apathdatanode, path);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokestatic    #119 <Method void PathParser$PathDataNode.nodesToPath(PathParser$PathDataNode[], Path)>
			}
	//*  12   22:aload_1         
	//*  13   23:areturn         
			catch(RuntimeException runtimeexception)
	//*  14   24:astore_1        
			{
				throw new RuntimeException((new StringBuilder()).append("Error in parsing ").append(s).toString(), ((Throwable) (runtimeexception)));
	//   15   25:new             #110 <Class RuntimeException>
	//   16   28:dup             
	//   17   29:new             #121 <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #122 <Method void StringBuilder()>
	//   20   36:ldc1            #124 <String "Error in parsing ">
	//   21   38:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:aload_0         
	//   23   42:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   25   48:aload_1         
	//   26   49:invokespecial   #134 <Method void RuntimeException(String, Throwable)>
	//   27   52:athrow          
			}
			return path;
		} else
		{
			return null;
	//   28   53:aconst_null     
	//   29   54:areturn         
		}
	}

	public static PathDataNode[] deepCopyNodes(PathDataNode apathdatanode[])
	{
		if(apathdatanode != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		PathDataNode apathdatanode1[] = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
_L4:
		return apathdatanode1;
	//    4    6:aload_2         
	//    5    7:areturn         
_L2:
		PathDataNode apathdatanode2[] = new PathDataNode[apathdatanode.length];
	//    6    8:aload_0         
	//    7    9:arraylength     
	//    8   10:anewarray       PathDataNode[]
	//    9   13:astore_3        
		int i = 0;
	//   10   14:iconst_0        
	//   11   15:istore_1        
		do
		{
			apathdatanode1 = apathdatanode2;
	//   12   16:aload_3         
	//   13   17:astore_2        
			if(i >= apathdatanode.length)
				continue;
	//   14   18:iload_1         
	//   15   19:aload_0         
	//   16   20:arraylength     
	//   17   21:icmpge          6
			apathdatanode2[i] = new PathDataNode(apathdatanode[i]);
	//   18   24:aload_3         
	//   19   25:iload_1         
	//   20   26:new             #9   <Class PathParser$PathDataNode>
	//   21   29:dup             
	//   22   30:aload_0         
	//   23   31:iload_1         
	//   24   32:aaload          
	//   25   33:invokespecial   #139 <Method void PathParser$PathDataNode(PathParser$PathDataNode)>
	//   26   36:aastore         
			i++;
	//   27   37:iload_1         
	//   28   38:iconst_1        
	//   29   39:iadd            
	//   30   40:istore_1        
		} while(true);
	//   31   41:goto            16
		if(true) goto _L4; else goto _L3
_L3:
	}

	private static void extract(String s, int i, ExtractFloatResult extractfloatresult)
	{
		boolean flag2;
		int j;
		boolean flag3;
		boolean flag4;
		j = i;
	//    0    0:iload_1         
	//    1    1:istore          6
		flag3 = false;
	//    2    3:iconst_0        
	//    3    4:istore          7
		extractfloatresult.mEndWithNegOrDot = false;
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:putfield        #145 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
		flag2 = false;
	//    7   11:iconst_0        
	//    8   12:istore          5
		flag4 = false;
	//    9   14:iconst_0        
	//   10   15:istore          8
_L11:
		if(j >= s.length()) goto _L2; else goto _L1
	//   11   17:iload           6
	//   12   19:aload_0         
	//   13   20:invokevirtual   #75  <Method int String.length()>
	//   14   23:icmpge          107
_L1:
		boolean flag6 = false;
	//   15   26:iconst_0        
	//   16   27:istore          10
		s.charAt(j);
	//   17   29:aload_0         
	//   18   30:iload           6
	//   19   32:invokevirtual   #95  <Method char String.charAt(int)>
		JVM INSTR lookupswitch 6: default 92
	//	               32: 114
	//	               44: 114
	//	               45: 127
	//	               46: 178
	//	               69: 214
	//	               101: 214;
	//   20   35:lookupswitch    6: default 92
	//	               32: 114
	//	               44: 114
	//	               45: 127
	//	               46: 178
	//	               69: 214
	//	               101: 214
		   goto _L3 _L4 _L4 _L5 _L6 _L7 _L7
_L3:
		boolean flag;
		boolean flag1;
		boolean flag5;
		flag5 = flag2;
	//   21   92:iload           5
	//   22   94:istore          9
		flag1 = flag6;
	//   23   96:iload           10
	//   24   98:istore          4
		flag = flag3;
	//   25  100:iload           7
	//   26  102:istore_3        
_L9:
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   27  103:iload_3         
	//   28  104:ifeq            227
_L2:
		extractfloatresult.mEndPosition = j;
	//   29  107:aload_2         
	//   30  108:iload           6
	//   31  110:putfield        #149 <Field int PathParser$ExtractFloatResult.mEndPosition>
		return;
	//   32  113:return          
_L4:
		flag = true;
	//   33  114:iconst_1        
	//   34  115:istore_3        
		flag1 = flag6;
	//   35  116:iload           10
	//   36  118:istore          4
		flag5 = flag2;
	//   37  120:iload           5
	//   38  122:istore          9
		continue; /* Loop/switch isn't completed */
	//   39  124:goto            103
_L5:
		flag = flag3;
	//   40  127:iload           7
	//   41  129:istore_3        
		flag1 = flag6;
	//   42  130:iload           10
	//   43  132:istore          4
		flag5 = flag2;
	//   44  134:iload           5
	//   45  136:istore          9
		if(j != i)
	//*  46  138:iload           6
	//*  47  140:iload_1         
	//*  48  141:icmpeq          103
		{
			flag = flag3;
	//   49  144:iload           7
	//   50  146:istore_3        
			flag1 = flag6;
	//   51  147:iload           10
	//   52  149:istore          4
			flag5 = flag2;
	//   53  151:iload           5
	//   54  153:istore          9
			if(!flag4)
	//*  55  155:iload           8
	//*  56  157:ifne            103
			{
				flag = true;
	//   57  160:iconst_1        
	//   58  161:istore_3        
				extractfloatresult.mEndWithNegOrDot = true;
	//   59  162:aload_2         
	//   60  163:iconst_1        
	//   61  164:putfield        #145 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
				flag1 = flag6;
	//   62  167:iload           10
	//   63  169:istore          4
				flag5 = flag2;
	//   64  171:iload           5
	//   65  173:istore          9
			}
		}
		continue; /* Loop/switch isn't completed */
	//   66  175:goto            103
_L6:
		if(!flag2)
	//*  67  178:iload           5
	//*  68  180:ifne            196
		{
			flag5 = true;
	//   69  183:iconst_1        
	//   70  184:istore          9
			flag = flag3;
	//   71  186:iload           7
	//   72  188:istore_3        
			flag1 = flag6;
	//   73  189:iload           10
	//   74  191:istore          4
		} else
	//*  75  193:goto            103
		{
			flag = true;
	//   76  196:iconst_1        
	//   77  197:istore_3        
			extractfloatresult.mEndWithNegOrDot = true;
	//   78  198:aload_2         
	//   79  199:iconst_1        
	//   80  200:putfield        #145 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
			flag1 = flag6;
	//   81  203:iload           10
	//   82  205:istore          4
			flag5 = flag2;
	//   83  207:iload           5
	//   84  209:istore          9
		}
		continue; /* Loop/switch isn't completed */
	//   85  211:goto            103
_L7:
		flag1 = true;
	//   86  214:iconst_1        
	//   87  215:istore          4
		flag = flag3;
	//   88  217:iload           7
	//   89  219:istore_3        
		flag5 = flag2;
	//   90  220:iload           5
	//   91  222:istore          9
		if(true) goto _L9; else goto _L8
	//   92  224:goto            103
_L8:
		j++;
	//   93  227:iload           6
	//   94  229:iconst_1        
	//   95  230:iadd            
	//   96  231:istore          6
		flag3 = flag;
	//   97  233:iload_3         
	//   98  234:istore          7
		flag4 = flag1;
	//   99  236:iload           4
	//  100  238:istore          8
		flag2 = flag5;
	//  101  240:iload           9
	//  102  242:istore          5
		if(true) goto _L11; else goto _L10
	//  103  244:goto            17
_L10:
	}

	private static float[] getFloats(String s)
	{
		int j;
		int k;
		if(s.charAt(0) == 'z' || s.charAt(0) == 'Z')
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #95  <Method char String.charAt(int)>
	//*   3    5:bipush          122
	//*   4    7:icmpeq          20
	//*   5   10:aload_0         
	//*   6   11:iconst_0        
	//*   7   12:invokevirtual   #95  <Method char String.charAt(int)>
	//*   8   15:bipush          90
	//*   9   17:icmpne          24
			return new float[0];
	//   10   20:iconst_0        
	//   11   21:newarray        float[]
	//   12   23:areturn         
		int i;
		int l;
		int i1;
		float af[];
		ExtractFloatResult extractfloatresult;
		try
		{
			af = new float[s.length()];
	//   13   24:aload_0         
	//   14   25:invokevirtual   #75  <Method int String.length()>
	//   15   28:newarray        float[]
	//   16   30:astore          6
		}
	//*  17   32:iconst_1        
	//*  18   33:istore_2        
	//*  19   34:new             #6   <Class PathParser$ExtractFloatResult>
	//*  20   37:dup             
	//*  21   38:invokespecial   #152 <Method void PathParser$ExtractFloatResult()>
	//*  22   41:astore          7
	//*  23   43:aload_0         
	//*  24   44:invokevirtual   #75  <Method int String.length()>
	//*  25   47:istore          5
	//*  26   49:iconst_0        
	//*  27   50:istore_1        
	//*  28   51:iload_2         
	//*  29   52:iload           5
	//*  30   54:icmpge          109
	//*  31   57:aload_0         
	//*  32   58:iload_2         
	//*  33   59:aload           7
	//*  34   61:invokestatic    #154 <Method void extract(String, int, PathParser$ExtractFloatResult)>
	//*  35   64:aload           7
	//*  36   66:getfield        #149 <Field int PathParser$ExtractFloatResult.mEndPosition>
	//*  37   69:istore_3        
	//*  38   70:iload_2         
	//*  39   71:iload_3         
	//*  40   72:icmpge          157
	//*  41   75:iload_1         
	//*  42   76:iconst_1        
	//*  43   77:iadd            
	//*  44   78:istore          4
	//*  45   80:aload           6
	//*  46   82:iload_1         
	//*  47   83:aload_0         
	//*  48   84:iload_2         
	//*  49   85:iload_3         
	//*  50   86:invokevirtual   #83  <Method String String.substring(int, int)>
	//*  51   89:invokestatic    #160 <Method float Float.parseFloat(String)>
	//*  52   92:fastore         
	//*  53   93:iload           4
	//*  54   95:istore_1        
	//*  55   96:aload           7
	//*  56   98:getfield        #145 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
	//*  57  101:ifeq            160
	//*  58  104:iload_3         
	//*  59  105:istore_2        
	//*  60  106:goto            51
	//*  61  109:aload           6
	//*  62  111:iconst_0        
	//*  63  112:iload_1         
	//*  64  113:invokestatic    #162 <Method float[] copyOfRange(float[], int, int)>
	//*  65  116:astore          6
	//*  66  118:aload           6
	//*  67  120:areturn         
		catch(NumberFormatException numberformatexception)
	//*  68  121:astore          6
		{
			throw new RuntimeException((new StringBuilder()).append("error in parsing \"").append(s).append("\"").toString(), ((Throwable) (numberformatexception)));
	//   69  123:new             #110 <Class RuntimeException>
	//   70  126:dup             
	//   71  127:new             #121 <Class StringBuilder>
	//   72  130:dup             
	//   73  131:invokespecial   #122 <Method void StringBuilder()>
	//   74  134:ldc1            #164 <String "error in parsing \"">
	//   75  136:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   76  139:aload_0         
	//   77  140:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   78  143:ldc1            #166 <String "\"">
	//   79  145:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   80  148:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   81  151:aload           6
	//   82  153:invokespecial   #134 <Method void RuntimeException(String, Throwable)>
	//   83  156:athrow          
		}
		j = 1;
		extractfloatresult = new ExtractFloatResult();
		i1 = s.length();
		i = 0;
_L3:
		if(j >= i1) goto _L2; else goto _L1
_L1:
		extract(s, j, extractfloatresult);
		k = extractfloatresult.mEndPosition;
		if(j >= k)
			break MISSING_BLOCK_LABEL_96;
		l = i + 1;
		af[i] = Float.parseFloat(s.substring(j, k));
		i = l;
		if(extractfloatresult.mEndWithNegOrDot)
			j = k;
		else
	//*  84  157:goto            96
			j = k + 1;
	//   85  160:iload_3         
	//   86  161:iconst_1        
	//   87  162:iadd            
	//   88  163:istore_2        
		if(true) goto _L3; else goto _L2
	//   89  164:goto            51
_L2:
		af = copyOfRange(af, 0, i);
		return af;
	}

	private static int nextStart(String s, int i)
	{
		do
		{
label0:
			{
				if(i < s.length())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #75  <Method int String.length()>
	//*   3    5:icmpge          50
				{
					char c = s.charAt(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #95  <Method char String.charAt(int)>
	//    7   13:istore_2        
					if((c - 65) * (c - 90) > 0 && (c - 97) * (c - 122) > 0 || c == 'e' || c == 'E')
						break label0;
	//    8   14:iload_2         
	//    9   15:bipush          65
	//   10   17:isub            
	//   11   18:iload_2         
	//   12   19:bipush          90
	//   13   21:isub            
	//   14   22:imul            
	//   15   23:ifle            38
	//   16   26:iload_2         
	//   17   27:bipush          97
	//   18   29:isub            
	//   19   30:iload_2         
	//   20   31:bipush          122
	//   21   33:isub            
	//   22   34:imul            
	//   23   35:ifgt            52
	//   24   38:iload_2         
	//   25   39:bipush          101
	//   26   41:icmpeq          52
	//   27   44:iload_2         
	//   28   45:bipush          69
	//   29   47:icmpeq          52
				}
				return i;
	//   30   50:iload_1         
	//   31   51:ireturn         
			}
			i++;
	//   32   52:iload_1         
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:istore_1        
		} while(true);
	//   36   56:goto            0
	}

	public static void updateNodes(PathDataNode apathdatanode[], PathDataNode apathdatanode1[])
	{
		for(int i = 0; i < apathdatanode1.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:icmpge          63
		{
			apathdatanode[i].mType = apathdatanode1[i].mType;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:aaload          
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:getfield        #42  <Field char PathParser$PathDataNode.mType>
	//   13   17:putfield        #42  <Field char PathParser$PathDataNode.mType>
			for(int j = 0; j < apathdatanode1[i].mParams.length; j++)
	//*  14   20:iconst_0        
	//*  15   21:istore_3        
	//*  16   22:iload_3         
	//*  17   23:aload_1         
	//*  18   24:iload_2         
	//*  19   25:aaload          
	//*  20   26:getfield        #46  <Field float[] PathParser$PathDataNode.mParams>
	//*  21   29:arraylength     
	//*  22   30:icmpge          56
				apathdatanode[i].mParams[j] = apathdatanode1[i].mParams[j];
	//   23   33:aload_0         
	//   24   34:iload_2         
	//   25   35:aaload          
	//   26   36:getfield        #46  <Field float[] PathParser$PathDataNode.mParams>
	//   27   39:iload_3         
	//   28   40:aload_1         
	//   29   41:iload_2         
	//   30   42:aaload          
	//   31   43:getfield        #46  <Field float[] PathParser$PathDataNode.mParams>
	//   32   46:iload_3         
	//   33   47:faload          
	//   34   48:fastore         

	//   35   49:iload_3         
	//   36   50:iconst_1        
	//   37   51:iadd            
	//   38   52:istore_3        
		}

	//   39   53:goto            22
	//   40   56:iload_2         
	//   41   57:iconst_1        
	//   42   58:iadd            
	//   43   59:istore_2        
	//*  44   60:goto            2
	//   45   63:return          
	}

	private static final String LOGTAG = "PathParser";
}
