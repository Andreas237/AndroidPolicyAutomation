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
		byte byte0;
		int i;
		Path path1;
		path1 = path;
	//    0    0:aload_0         
	//    1    1:astore          21
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
		f2 = af[2];
	//   10   13:aload_1         
	//   11   14:iconst_2        
	//   12   15:faload          
	//   13   16:fstore          7
		f3 = af[3];
	//   14   18:aload_1         
	//   15   19:iconst_3        
	//   16   20:faload          
	//   17   21:fstore          8
		f5 = af[4];
	//   18   23:aload_1         
	//   19   24:iconst_4        
	//   20   25:faload          
	//   21   26:fstore          10
		f4 = af[5];
	//   22   28:aload_1         
	//   23   29:iconst_5        
	//   24   30:faload          
	//   25   31:fstore          9
		switch(c1)
	//*  26   33:iload_3         
		{
	//*  27   34:lookupswitch    20: default 204
	//	               65: 270
	//	               67: 263
	//	               72: 257
	//	               76: 251
	//	               77: 251
	//	               81: 245
	//	               83: 245
	//	               84: 251
	//	               86: 257
	//	               90: 210
	//	               97: 270
	//	               99: 263
	//	               104: 257
	//	               108: 251
	//	               109: 251
	//	               113: 245
	//	               115: 245
	//	               116: 251
	//	               118: 257
	//	               122: 210
		default:
			byte0 = 2;
	//   28  204:iconst_2        
	//   29  205:istore          14
			break;

	//*  30  207:goto            274
		case 90: // 'Z'
		case 122: // 'z'
			path.close();
	//   31  210:aload_0         
	//   32  211:invokevirtual   #37  <Method void Path.close()>
			path1.moveTo(f5, f4);
	//   33  214:aload           21
	//   34  216:fload           10
	//   35  218:fload           9
	//   36  220:invokevirtual   #41  <Method void Path.moveTo(float, float)>
			f = f5;
	//   37  223:fload           10
	//   38  225:fstore          5
			f2 = f;
	//   39  227:fload           5
	//   40  229:fstore          7
			f1 = f4;
	//   41  231:fload           9
	//   42  233:fstore          6
			f3 = f1;
	//   43  235:fload           6
	//   44  237:fstore          8
			byte0 = 2;
	//   45  239:iconst_2        
	//   46  240:istore          14
			break;

	//*  47  242:goto            274
		case 81: // 'Q'
		case 83: // 'S'
		case 113: // 'q'
		case 115: // 's'
			byte0 = 4;
	//   48  245:iconst_4        
	//   49  246:istore          14
			break;

	//*  50  248:goto            274
		case 76: // 'L'
		case 77: // 'M'
		case 84: // 'T'
		case 108: // 'l'
		case 109: // 'm'
		case 116: // 't'
			byte0 = 2;
	//   51  251:iconst_2        
	//   52  252:istore          14
			break;

	//*  53  254:goto            274
		case 72: // 'H'
		case 86: // 'V'
		case 104: // 'h'
		case 118: // 'v'
			byte0 = 1;
	//   54  257:iconst_1        
	//   55  258:istore          14
			break;

	//*  56  260:goto            274
		case 67: // 'C'
		case 99: // 'c'
			byte0 = 6;
	//   57  263:bipush          6
	//   58  265:istore          14
			break;

	//*  59  267:goto            274
		case 65: // 'A'
		case 97: // 'a'
			byte0 = 7;
	//   60  270:bipush          7
	//   61  272:istore          14
			break;
		}
		float f6 = f1;
	//   62  274:fload           6
	//   63  276:fstore          11
		f1 = f5;
	//   64  278:fload           10
	//   65  280:fstore          6
		boolean flag = false;
	//   66  282:iconst_0        
	//   67  283:istore          16
		i = ((int) (c));
	//   68  285:iload_2         
	//   69  286:istore          15
		f5 = f4;
	//   70  288:fload           9
	//   71  290:fstore          10
		f4 = f1;
	//   72  292:fload           6
	//   73  294:fstore          9
		c = ((char) (flag));
	//   74  296:iload           16
	//   75  298:istore_2        
		f1 = f;
	//   76  299:fload           5
	//   77  301:fstore          6
		f = f6;
	//   78  303:fload           11
	//   79  305:fstore          5
_L24:
		float f7;
		if(c >= af1.length)
			break; /* Loop/switch isn't completed */
	//   80  307:iload_2         
	//   81  308:aload           4
	//   82  310:arraylength     
	//   83  311:icmpge          2230
		f7 = 0.0F;
	//   84  314:fconst_0        
	//   85  315:fstore          11
		c1;
	//   86  317:iload_3         
		JVM INSTR lookupswitch 18: default 472
	//	               65: 2076
	//	               67: 1960
	//	               72: 1933
	//	               76: 1882
	//	               77: 1804
	//	               81: 1709
	//	               83: 1539
	//	               84: 1406
	//	               86: 1372
	//	               97: 1221
	//	               99: 1086
	//	               104: 1057
	//	               108: 1005
	//	               109: 927
	//	               113: 811
	//	               115: 637
	//	               116: 504
	//	               118: 475;
	//   87  318:lookupswitch    18: default 472
	//	               65: 2076
	//	               67: 1960
	//	               72: 1933
	//	               76: 1882
	//	               77: 1804
	//	               81: 1709
	//	               83: 1539
	//	               84: 1406
	//	               86: 1372
	//	               97: 1221
	//	               99: 1086
	//	               104: 1057
	//	               108: 1005
	//	               109: 927
	//	               113: 811
	//	               115: 637
	//	               116: 504
	//	               118: 475
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
		break; /* Loop/switch isn't completed */
	//   88  472:goto            2219
_L19:
		i = c + 0;
	//   89  475:iload_2         
	//   90  476:iconst_0        
	//   91  477:iadd            
	//   92  478:istore          15
		path1.rLineTo(0.0F, af1[i]);
	//   93  480:aload           21
	//   94  482:fconst_0        
	//   95  483:aload           4
	//   96  485:iload           15
	//   97  487:faload          
	//   98  488:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		f += af1[i];
	//   99  491:fload           5
	//  100  493:aload           4
	//  101  495:iload           15
	//  102  497:faload          
	//  103  498:fadd            
	//  104  499:fstore          5
		break; /* Loop/switch isn't completed */
	//  105  501:goto            2219
_L18:
		if(i != 113 && i != 116 && i != 81 && i != 84)
	//* 106  504:iload           15
	//* 107  506:bipush          113
	//* 108  508:icmpeq          545
	//* 109  511:iload           15
	//* 110  513:bipush          116
	//* 111  515:icmpeq          545
	//* 112  518:iload           15
	//* 113  520:bipush          81
	//* 114  522:icmpeq          545
	//* 115  525:iload           15
	//* 116  527:bipush          84
	//* 117  529:icmpne          535
	//* 118  532:goto            545
		{
			f3 = 0.0F;
	//  119  535:fconst_0        
	//  120  536:fstore          8
			f2 = f7;
	//  121  538:fload           11
	//  122  540:fstore          7
		} else
	//* 123  542:goto            559
		{
			f2 = f1 - f2;
	//  124  545:fload           6
	//  125  547:fload           7
	//  126  549:fsub            
	//  127  550:fstore          7
			f3 = f - f3;
	//  128  552:fload           5
	//  129  554:fload           8
	//  130  556:fsub            
	//  131  557:fstore          8
		}
		i = c + 0;
	//  132  559:iload_2         
	//  133  560:iconst_0        
	//  134  561:iadd            
	//  135  562:istore          15
		f7 = af1[i];
	//  136  564:aload           4
	//  137  566:iload           15
	//  138  568:faload          
	//  139  569:fstore          11
		int j = c + 1;
	//  140  571:iload_2         
	//  141  572:iconst_1        
	//  142  573:iadd            
	//  143  574:istore          16
		path1.rQuadTo(f2, f3, f7, af1[j]);
	//  144  576:aload           21
	//  145  578:fload           7
	//  146  580:fload           8
	//  147  582:fload           11
	//  148  584:aload           4
	//  149  586:iload           16
	//  150  588:faload          
	//  151  589:invokevirtual   #48  <Method void Path.rQuadTo(float, float, float, float)>
		f7 = f1 + af1[i];
	//  152  592:fload           6
	//  153  594:aload           4
	//  154  596:iload           15
	//  155  598:faload          
	//  156  599:fadd            
	//  157  600:fstore          11
		float f12 = f + af1[j];
	//  158  602:fload           5
	//  159  604:aload           4
	//  160  606:iload           16
	//  161  608:faload          
	//  162  609:fadd            
	//  163  610:fstore          12
		f3 += f;
	//  164  612:fload           8
	//  165  614:fload           5
	//  166  616:fadd            
	//  167  617:fstore          8
		f2 += f1;
	//  168  619:fload           7
	//  169  621:fload           6
	//  170  623:fadd            
	//  171  624:fstore          7
		f = f12;
	//  172  626:fload           12
	//  173  628:fstore          5
		f1 = f7;
	//  174  630:fload           11
	//  175  632:fstore          6
		break; /* Loop/switch isn't completed */
	//  176  634:goto            2219
_L17:
		if(i != 99 && i != 115 && i != 67 && i != 83)
	//* 177  637:iload           15
	//* 178  639:bipush          99
	//* 179  641:icmpeq          678
	//* 180  644:iload           15
	//* 181  646:bipush          115
	//* 182  648:icmpeq          678
	//* 183  651:iload           15
	//* 184  653:bipush          67
	//* 185  655:icmpeq          678
	//* 186  658:iload           15
	//* 187  660:bipush          83
	//* 188  662:icmpne          668
	//* 189  665:goto            678
		{
			f2 = 0.0F;
	//  190  668:fconst_0        
	//  191  669:fstore          7
			f3 = f2;
	//  192  671:fload           7
	//  193  673:fstore          8
		} else
	//* 194  675:goto            692
		{
			f3 = f - f3;
	//  195  678:fload           5
	//  196  680:fload           8
	//  197  682:fsub            
	//  198  683:fstore          8
			f2 = f1 - f2;
	//  199  685:fload           6
	//  200  687:fload           7
	//  201  689:fsub            
	//  202  690:fstore          7
		}
		i = c + 0;
	//  203  692:iload_2         
	//  204  693:iconst_0        
	//  205  694:iadd            
	//  206  695:istore          15
		f7 = af1[i];
	//  207  697:aload           4
	//  208  699:iload           15
	//  209  701:faload          
	//  210  702:fstore          11
		int k = c + 1;
	//  211  704:iload_2         
	//  212  705:iconst_1        
	//  213  706:iadd            
	//  214  707:istore          16
		float f13 = af1[k];
	//  215  709:aload           4
	//  216  711:iload           16
	//  217  713:faload          
	//  218  714:fstore          12
		int l3 = c + 2;
	//  219  716:iload_2         
	//  220  717:iconst_2        
	//  221  718:iadd            
	//  222  719:istore          17
		float f20 = af1[l3];
	//  223  721:aload           4
	//  224  723:iload           17
	//  225  725:faload          
	//  226  726:fstore          13
		int l5 = c + 3;
	//  227  728:iload_2         
	//  228  729:iconst_3        
	//  229  730:iadd            
	//  230  731:istore          18
		path.rCubicTo(f2, f3, f7, f13, f20, af1[l5]);
	//  231  733:aload_0         
	//  232  734:fload           7
	//  233  736:fload           8
	//  234  738:fload           11
	//  235  740:fload           12
	//  236  742:fload           13
	//  237  744:aload           4
	//  238  746:iload           18
	//  239  748:faload          
	//  240  749:invokevirtual   #52  <Method void Path.rCubicTo(float, float, float, float, float, float)>
		f2 = af1[i];
	//  241  752:aload           4
	//  242  754:iload           15
	//  243  756:faload          
	//  244  757:fstore          7
		f3 = af1[k];
	//  245  759:aload           4
	//  246  761:iload           16
	//  247  763:faload          
	//  248  764:fstore          8
		f7 = f1 + af1[l3];
	//  249  766:fload           6
	//  250  768:aload           4
	//  251  770:iload           17
	//  252  772:faload          
	//  253  773:fadd            
	//  254  774:fstore          11
		f13 = f + af1[l5];
	//  255  776:fload           5
	//  256  778:aload           4
	//  257  780:iload           18
	//  258  782:faload          
	//  259  783:fadd            
	//  260  784:fstore          12
		f2 += f1;
	//  261  786:fload           7
	//  262  788:fload           6
	//  263  790:fadd            
	//  264  791:fstore          7
		f3 += f;
	//  265  793:fload           8
	//  266  795:fload           5
	//  267  797:fadd            
	//  268  798:fstore          8
		f = f13;
	//  269  800:fload           12
	//  270  802:fstore          5
		f1 = f7;
	//  271  804:fload           11
	//  272  806:fstore          6
		break; /* Loop/switch isn't completed */
	//  273  808:goto            2219
_L16:
		i = c + 0;
	//  274  811:iload_2         
	//  275  812:iconst_0        
	//  276  813:iadd            
	//  277  814:istore          15
		f2 = af1[i];
	//  278  816:aload           4
	//  279  818:iload           15
	//  280  820:faload          
	//  281  821:fstore          7
		int l = c + 1;
	//  282  823:iload_2         
	//  283  824:iconst_1        
	//  284  825:iadd            
	//  285  826:istore          16
		f3 = af1[l];
	//  286  828:aload           4
	//  287  830:iload           16
	//  288  832:faload          
	//  289  833:fstore          8
		int i4 = c + 2;
	//  290  835:iload_2         
	//  291  836:iconst_2        
	//  292  837:iadd            
	//  293  838:istore          17
		f7 = af1[i4];
	//  294  840:aload           4
	//  295  842:iload           17
	//  296  844:faload          
	//  297  845:fstore          11
		int i6 = c + 3;
	//  298  847:iload_2         
	//  299  848:iconst_3        
	//  300  849:iadd            
	//  301  850:istore          18
		path1.rQuadTo(f2, f3, f7, af1[i6]);
	//  302  852:aload           21
	//  303  854:fload           7
	//  304  856:fload           8
	//  305  858:fload           11
	//  306  860:aload           4
	//  307  862:iload           18
	//  308  864:faload          
	//  309  865:invokevirtual   #48  <Method void Path.rQuadTo(float, float, float, float)>
		f2 = af1[i];
	//  310  868:aload           4
	//  311  870:iload           15
	//  312  872:faload          
	//  313  873:fstore          7
		f3 = af1[l];
	//  314  875:aload           4
	//  315  877:iload           16
	//  316  879:faload          
	//  317  880:fstore          8
		f7 = f1 + af1[i4];
	//  318  882:fload           6
	//  319  884:aload           4
	//  320  886:iload           17
	//  321  888:faload          
	//  322  889:fadd            
	//  323  890:fstore          11
		float f14 = f + af1[i6];
	//  324  892:fload           5
	//  325  894:aload           4
	//  326  896:iload           18
	//  327  898:faload          
	//  328  899:fadd            
	//  329  900:fstore          12
		f2 += f1;
	//  330  902:fload           7
	//  331  904:fload           6
	//  332  906:fadd            
	//  333  907:fstore          7
		f3 += f;
	//  334  909:fload           8
	//  335  911:fload           5
	//  336  913:fadd            
	//  337  914:fstore          8
		f = f14;
	//  338  916:fload           12
	//  339  918:fstore          5
		f1 = f7;
	//  340  920:fload           11
	//  341  922:fstore          6
		break; /* Loop/switch isn't completed */
	//  342  924:goto            2219
_L15:
		i = c + 0;
	//  343  927:iload_2         
	//  344  928:iconst_0        
	//  345  929:iadd            
	//  346  930:istore          15
		f1 += af1[i];
	//  347  932:fload           6
	//  348  934:aload           4
	//  349  936:iload           15
	//  350  938:faload          
	//  351  939:fadd            
	//  352  940:fstore          6
		int i1 = c + 1;
	//  353  942:iload_2         
	//  354  943:iconst_1        
	//  355  944:iadd            
	//  356  945:istore          16
		f += af1[i1];
	//  357  947:fload           5
	//  358  949:aload           4
	//  359  951:iload           16
	//  360  953:faload          
	//  361  954:fadd            
	//  362  955:fstore          5
		if(c > 0)
	//* 363  957:iload_2         
	//* 364  958:ifle            979
		{
			path1.rLineTo(af1[i], af1[i1]);
	//  365  961:aload           21
	//  366  963:aload           4
	//  367  965:iload           15
	//  368  967:faload          
	//  369  968:aload           4
	//  370  970:iload           16
	//  371  972:faload          
	//  372  973:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		} else
	//* 373  976:goto            2219
		{
			path1.rMoveTo(af1[i], af1[i1]);
	//  374  979:aload           21
	//  375  981:aload           4
	//  376  983:iload           15
	//  377  985:faload          
	//  378  986:aload           4
	//  379  988:iload           16
	//  380  990:faload          
	//  381  991:invokevirtual   #55  <Method void Path.rMoveTo(float, float)>
			f5 = f;
	//  382  994:fload           5
	//  383  996:fstore          10
			f4 = f1;
	//  384  998:fload           6
	//  385 1000:fstore          9
		}
		break; /* Loop/switch isn't completed */
	//  386 1002:goto            2219
_L14:
		i = c + 0;
	//  387 1005:iload_2         
	//  388 1006:iconst_0        
	//  389 1007:iadd            
	//  390 1008:istore          15
		f7 = af1[i];
	//  391 1010:aload           4
	//  392 1012:iload           15
	//  393 1014:faload          
	//  394 1015:fstore          11
		int j1 = c + 1;
	//  395 1017:iload_2         
	//  396 1018:iconst_1        
	//  397 1019:iadd            
	//  398 1020:istore          16
		path1.rLineTo(f7, af1[j1]);
	//  399 1022:aload           21
	//  400 1024:fload           11
	//  401 1026:aload           4
	//  402 1028:iload           16
	//  403 1030:faload          
	//  404 1031:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		f1 += af1[i];
	//  405 1034:fload           6
	//  406 1036:aload           4
	//  407 1038:iload           15
	//  408 1040:faload          
	//  409 1041:fadd            
	//  410 1042:fstore          6
		f += af1[j1];
	//  411 1044:fload           5
	//  412 1046:aload           4
	//  413 1048:iload           16
	//  414 1050:faload          
	//  415 1051:fadd            
	//  416 1052:fstore          5
		break; /* Loop/switch isn't completed */
	//  417 1054:goto            2219
_L13:
		i = c + 0;
	//  418 1057:iload_2         
	//  419 1058:iconst_0        
	//  420 1059:iadd            
	//  421 1060:istore          15
		path1.rLineTo(af1[i], 0.0F);
	//  422 1062:aload           21
	//  423 1064:aload           4
	//  424 1066:iload           15
	//  425 1068:faload          
	//  426 1069:fconst_0        
	//  427 1070:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		f1 += af1[i];
	//  428 1073:fload           6
	//  429 1075:aload           4
	//  430 1077:iload           15
	//  431 1079:faload          
	//  432 1080:fadd            
	//  433 1081:fstore          6
		break; /* Loop/switch isn't completed */
	//  434 1083:goto            2219
_L12:
		f2 = af1[c + 0];
	//  435 1086:aload           4
	//  436 1088:iload_2         
	//  437 1089:iconst_0        
	//  438 1090:iadd            
	//  439 1091:faload          
	//  440 1092:fstore          7
		f3 = af1[c + 1];
	//  441 1094:aload           4
	//  442 1096:iload_2         
	//  443 1097:iconst_1        
	//  444 1098:iadd            
	//  445 1099:faload          
	//  446 1100:fstore          8
		i = c + 2;
	//  447 1102:iload_2         
	//  448 1103:iconst_2        
	//  449 1104:iadd            
	//  450 1105:istore          15
		f7 = af1[i];
	//  451 1107:aload           4
	//  452 1109:iload           15
	//  453 1111:faload          
	//  454 1112:fstore          11
		int k1 = c + 3;
	//  455 1114:iload_2         
	//  456 1115:iconst_3        
	//  457 1116:iadd            
	//  458 1117:istore          16
		float f15 = af1[k1];
	//  459 1119:aload           4
	//  460 1121:iload           16
	//  461 1123:faload          
	//  462 1124:fstore          12
		int j4 = c + 4;
	//  463 1126:iload_2         
	//  464 1127:iconst_4        
	//  465 1128:iadd            
	//  466 1129:istore          17
		float f21 = af1[j4];
	//  467 1131:aload           4
	//  468 1133:iload           17
	//  469 1135:faload          
	//  470 1136:fstore          13
		int j6 = c + 5;
	//  471 1138:iload_2         
	//  472 1139:iconst_5        
	//  473 1140:iadd            
	//  474 1141:istore          18
		path.rCubicTo(f2, f3, f7, f15, f21, af1[j6]);
	//  475 1143:aload_0         
	//  476 1144:fload           7
	//  477 1146:fload           8
	//  478 1148:fload           11
	//  479 1150:fload           12
	//  480 1152:fload           13
	//  481 1154:aload           4
	//  482 1156:iload           18
	//  483 1158:faload          
	//  484 1159:invokevirtual   #52  <Method void Path.rCubicTo(float, float, float, float, float, float)>
		f2 = af1[i];
	//  485 1162:aload           4
	//  486 1164:iload           15
	//  487 1166:faload          
	//  488 1167:fstore          7
		f3 = af1[k1];
	//  489 1169:aload           4
	//  490 1171:iload           16
	//  491 1173:faload          
	//  492 1174:fstore          8
		f7 = f1 + af1[j4];
	//  493 1176:fload           6
	//  494 1178:aload           4
	//  495 1180:iload           17
	//  496 1182:faload          
	//  497 1183:fadd            
	//  498 1184:fstore          11
		f15 = f + af1[j6];
	//  499 1186:fload           5
	//  500 1188:aload           4
	//  501 1190:iload           18
	//  502 1192:faload          
	//  503 1193:fadd            
	//  504 1194:fstore          12
		f2 += f1;
	//  505 1196:fload           7
	//  506 1198:fload           6
	//  507 1200:fadd            
	//  508 1201:fstore          7
		f3 += f;
	//  509 1203:fload           8
	//  510 1205:fload           5
	//  511 1207:fadd            
	//  512 1208:fstore          8
		f = f15;
	//  513 1210:fload           12
	//  514 1212:fstore          5
		f1 = f7;
	//  515 1214:fload           11
	//  516 1216:fstore          6
		break; /* Loop/switch isn't completed */
	//  517 1218:goto            2219
_L11:
		i = c + 5;
	//  518 1221:iload_2         
	//  519 1222:iconst_5        
	//  520 1223:iadd            
	//  521 1224:istore          15
		f2 = af1[i];
	//  522 1226:aload           4
	//  523 1228:iload           15
	//  524 1230:faload          
	//  525 1231:fstore          7
		int l1 = c + 6;
	//  526 1233:iload_2         
	//  527 1234:bipush          6
	//  528 1236:iadd            
	//  529 1237:istore          16
		f3 = af1[l1];
	//  530 1239:aload           4
	//  531 1241:iload           16
	//  532 1243:faload          
	//  533 1244:fstore          8
		f7 = af1[c + 0];
	//  534 1246:aload           4
	//  535 1248:iload_2         
	//  536 1249:iconst_0        
	//  537 1250:iadd            
	//  538 1251:faload          
	//  539 1252:fstore          11
		float f16 = af1[c + 1];
	//  540 1254:aload           4
	//  541 1256:iload_2         
	//  542 1257:iconst_1        
	//  543 1258:iadd            
	//  544 1259:faload          
	//  545 1260:fstore          12
		float f22 = af1[c + 2];
	//  546 1262:aload           4
	//  547 1264:iload_2         
	//  548 1265:iconst_2        
	//  549 1266:iadd            
	//  550 1267:faload          
	//  551 1268:fstore          13
		boolean flag1;
		if(af1[c + 3] != 0.0F)
	//* 552 1270:aload           4
	//* 553 1272:iload_2         
	//* 554 1273:iconst_3        
	//* 555 1274:iadd            
	//* 556 1275:faload          
	//* 557 1276:fconst_0        
	//* 558 1277:fcmpl           
	//* 559 1278:ifeq            1287
			flag1 = true;
	//  560 1281:iconst_1        
	//  561 1282:istore          19
		else
	//* 562 1284:goto            1290
			flag1 = false;
	//  563 1287:iconst_0        
	//  564 1288:istore          19
		boolean flag3;
		if(af1[c + 4] != 0.0F)
	//* 565 1290:aload           4
	//* 566 1292:iload_2         
	//* 567 1293:iconst_4        
	//* 568 1294:iadd            
	//* 569 1295:faload          
	//* 570 1296:fconst_0        
	//* 571 1297:fcmpl           
	//* 572 1298:ifeq            1307
			flag3 = true;
	//  573 1301:iconst_1        
	//  574 1302:istore          20
		else
	//* 575 1304:goto            1310
			flag3 = false;
	//  576 1307:iconst_0        
	//  577 1308:istore          20
		drawArc(path, f1, f, f2 + f1, f3 + f, f7, f16, f22, flag1, flag3);
	//  578 1310:aload_0         
	//  579 1311:fload           6
	//  580 1313:fload           5
	//  581 1315:fload           7
	//  582 1317:fload           6
	//  583 1319:fadd            
	//  584 1320:fload           8
	//  585 1322:fload           5
	//  586 1324:fadd            
	//  587 1325:fload           11
	//  588 1327:fload           12
	//  589 1329:fload           13
	//  590 1331:iload           19
	//  591 1333:iload           20
	//  592 1335:invokestatic    #59  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
		f1 += af1[i];
	//  593 1338:fload           6
	//  594 1340:aload           4
	//  595 1342:iload           15
	//  596 1344:faload          
	//  597 1345:fadd            
	//  598 1346:fstore          6
		f += af1[l1];
	//  599 1348:fload           5
	//  600 1350:aload           4
	//  601 1352:iload           16
	//  602 1354:faload          
	//  603 1355:fadd            
	//  604 1356:fstore          5
		f3 = f;
	//  605 1358:fload           5
	//  606 1360:fstore          8
		f2 = f1;
	//  607 1362:fload           6
	//  608 1364:fstore          7
		path1 = path;
	//  609 1366:aload_0         
	//  610 1367:astore          21
		break; /* Loop/switch isn't completed */
	//  611 1369:goto            2219
_L10:
		i = c + 0;
	//  612 1372:iload_2         
	//  613 1373:iconst_0        
	//  614 1374:iadd            
	//  615 1375:istore          15
		f = af1[i];
	//  616 1377:aload           4
	//  617 1379:iload           15
	//  618 1381:faload          
	//  619 1382:fstore          5
		path1 = path;
	//  620 1384:aload_0         
	//  621 1385:astore          21
		path1.lineTo(f1, f);
	//  622 1387:aload           21
	//  623 1389:fload           6
	//  624 1391:fload           5
	//  625 1393:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		f = af1[i];
	//  626 1396:aload           4
	//  627 1398:iload           15
	//  628 1400:faload          
	//  629 1401:fstore          5
		break; /* Loop/switch isn't completed */
	//  630 1403:goto            2219
_L9:
		float f17;
		int i2;
		f7 = f;
	//  631 1406:fload           5
	//  632 1408:fstore          11
		f17 = f1;
	//  633 1410:fload           6
	//  634 1412:fstore          12
		i2 = ((int) (c));
	//  635 1414:iload_2         
	//  636 1415:istore          16
		if(i == 113 || i == 116 || i == 81) goto _L21; else goto _L20
	//  637 1417:iload           15
	//  638 1419:bipush          113
	//  639 1421:icmpeq          1453
	//  640 1424:iload           15
	//  641 1426:bipush          116
	//  642 1428:icmpeq          1453
	//  643 1431:iload           15
	//  644 1433:bipush          81
	//  645 1435:icmpeq          1453
_L20:
		f1 = f17;
	//  646 1438:fload           12
	//  647 1440:fstore          6
		f = f7;
	//  648 1442:fload           11
	//  649 1444:fstore          5
		if(i != 84) goto _L22; else goto _L21
	//  650 1446:iload           15
	//  651 1448:bipush          84
	//  652 1450:icmpne          1471
_L21:
		f = f7 * 2.0F - f3;
	//  653 1453:fload           11
	//  654 1455:fconst_2        
	//  655 1456:fmul            
	//  656 1457:fload           8
	//  657 1459:fsub            
	//  658 1460:fstore          5
		f1 = f17 * 2.0F - f2;
	//  659 1462:fload           12
	//  660 1464:fconst_2        
	//  661 1465:fmul            
	//  662 1466:fload           7
	//  663 1468:fsub            
	//  664 1469:fstore          6
_L22:
		i = i2 + 0;
	//  665 1471:iload           16
	//  666 1473:iconst_0        
	//  667 1474:iadd            
	//  668 1475:istore          15
		f2 = af1[i];
	//  669 1477:aload           4
	//  670 1479:iload           15
	//  671 1481:faload          
	//  672 1482:fstore          7
		i2++;
	//  673 1484:iload           16
	//  674 1486:iconst_1        
	//  675 1487:iadd            
	//  676 1488:istore          16
		path1.quadTo(f1, f, f2, af1[i2]);
	//  677 1490:aload           21
	//  678 1492:fload           6
	//  679 1494:fload           5
	//  680 1496:fload           7
	//  681 1498:aload           4
	//  682 1500:iload           16
	//  683 1502:faload          
	//  684 1503:invokevirtual   #65  <Method void Path.quadTo(float, float, float, float)>
		float f18 = af1[i];
	//  685 1506:aload           4
	//  686 1508:iload           15
	//  687 1510:faload          
	//  688 1511:fstore          12
		float f8 = af1[i2];
	//  689 1513:aload           4
	//  690 1515:iload           16
	//  691 1517:faload          
	//  692 1518:fstore          11
		f2 = f1;
	//  693 1520:fload           6
	//  694 1522:fstore          7
		f3 = f;
	//  695 1524:fload           5
	//  696 1526:fstore          8
		f = f8;
	//  697 1528:fload           11
	//  698 1530:fstore          5
		f1 = f18;
	//  699 1532:fload           12
	//  700 1534:fstore          6
		break; /* Loop/switch isn't completed */
	//  701 1536:goto            2219
_L8:
		int j2 = ((int) (c));
	//  702 1539:iload_2         
	//  703 1540:istore          16
		if(i != 99 && i != 115 && i != 67 && i != 83)
	//* 704 1542:iload           15
	//* 705 1544:bipush          99
	//* 706 1546:icmpeq          1588
	//* 707 1549:iload           15
	//* 708 1551:bipush          115
	//* 709 1553:icmpeq          1588
	//* 710 1556:iload           15
	//* 711 1558:bipush          67
	//* 712 1560:icmpeq          1588
	//* 713 1563:iload           15
	//* 714 1565:bipush          83
	//* 715 1567:icmpne          1573
	//* 716 1570:goto            1588
		{
			f2 = f;
	//  717 1573:fload           5
	//  718 1575:fstore          7
			f = f1;
	//  719 1577:fload           6
	//  720 1579:fstore          5
			f1 = f2;
	//  721 1581:fload           7
	//  722 1583:fstore          6
		} else
	//* 723 1585:goto            1614
		{
			f = f * 2.0F - f3;
	//  724 1588:fload           5
	//  725 1590:fconst_2        
	//  726 1591:fmul            
	//  727 1592:fload           8
	//  728 1594:fsub            
	//  729 1595:fstore          5
			f2 = f1 * 2.0F - f2;
	//  730 1597:fload           6
	//  731 1599:fconst_2        
	//  732 1600:fmul            
	//  733 1601:fload           7
	//  734 1603:fsub            
	//  735 1604:fstore          7
			f1 = f;
	//  736 1606:fload           5
	//  737 1608:fstore          6
			f = f2;
	//  738 1610:fload           7
	//  739 1612:fstore          5
		}
		i = j2 + 0;
	//  740 1614:iload           16
	//  741 1616:iconst_0        
	//  742 1617:iadd            
	//  743 1618:istore          15
		f2 = af1[i];
	//  744 1620:aload           4
	//  745 1622:iload           15
	//  746 1624:faload          
	//  747 1625:fstore          7
		int k4 = j2 + 1;
	//  748 1627:iload           16
	//  749 1629:iconst_1        
	//  750 1630:iadd            
	//  751 1631:istore          17
		f3 = af1[k4];
	//  752 1633:aload           4
	//  753 1635:iload           17
	//  754 1637:faload          
	//  755 1638:fstore          8
		int k6 = j2 + 2;
	//  756 1640:iload           16
	//  757 1642:iconst_2        
	//  758 1643:iadd            
	//  759 1644:istore          18
		float f9 = af1[k6];
	//  760 1646:aload           4
	//  761 1648:iload           18
	//  762 1650:faload          
	//  763 1651:fstore          11
		j2 += 3;
	//  764 1653:iload           16
	//  765 1655:iconst_3        
	//  766 1656:iadd            
	//  767 1657:istore          16
		path.cubicTo(f, f1, f2, f3, f9, af1[j2]);
	//  768 1659:aload_0         
	//  769 1660:fload           5
	//  770 1662:fload           6
	//  771 1664:fload           7
	//  772 1666:fload           8
	//  773 1668:fload           11
	//  774 1670:aload           4
	//  775 1672:iload           16
	//  776 1674:faload          
	//  777 1675:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
		f2 = af1[i];
	//  778 1678:aload           4
	//  779 1680:iload           15
	//  780 1682:faload          
	//  781 1683:fstore          7
		f3 = af1[k4];
	//  782 1685:aload           4
	//  783 1687:iload           17
	//  784 1689:faload          
	//  785 1690:fstore          8
		f1 = af1[k6];
	//  786 1692:aload           4
	//  787 1694:iload           18
	//  788 1696:faload          
	//  789 1697:fstore          6
		f = af1[j2];
	//  790 1699:aload           4
	//  791 1701:iload           16
	//  792 1703:faload          
	//  793 1704:fstore          5
		break; /* Loop/switch isn't completed */
	//  794 1706:goto            2219
_L7:
		i = ((int) (c));
	//  795 1709:iload_2         
	//  796 1710:istore          15
		int k2 = i + 0;
	//  797 1712:iload           15
	//  798 1714:iconst_0        
	//  799 1715:iadd            
	//  800 1716:istore          16
		f = af1[k2];
	//  801 1718:aload           4
	//  802 1720:iload           16
	//  803 1722:faload          
	//  804 1723:fstore          5
		int l4 = i + 1;
	//  805 1725:iload           15
	//  806 1727:iconst_1        
	//  807 1728:iadd            
	//  808 1729:istore          17
		f1 = af1[l4];
	//  809 1731:aload           4
	//  810 1733:iload           17
	//  811 1735:faload          
	//  812 1736:fstore          6
		int l6 = i + 2;
	//  813 1738:iload           15
	//  814 1740:iconst_2        
	//  815 1741:iadd            
	//  816 1742:istore          18
		f2 = af1[l6];
	//  817 1744:aload           4
	//  818 1746:iload           18
	//  819 1748:faload          
	//  820 1749:fstore          7
		i += 3;
	//  821 1751:iload           15
	//  822 1753:iconst_3        
	//  823 1754:iadd            
	//  824 1755:istore          15
		path1.quadTo(f, f1, f2, af1[i]);
	//  825 1757:aload           21
	//  826 1759:fload           5
	//  827 1761:fload           6
	//  828 1763:fload           7
	//  829 1765:aload           4
	//  830 1767:iload           15
	//  831 1769:faload          
	//  832 1770:invokevirtual   #65  <Method void Path.quadTo(float, float, float, float)>
		f2 = af1[k2];
	//  833 1773:aload           4
	//  834 1775:iload           16
	//  835 1777:faload          
	//  836 1778:fstore          7
		f3 = af1[l4];
	//  837 1780:aload           4
	//  838 1782:iload           17
	//  839 1784:faload          
	//  840 1785:fstore          8
		f1 = af1[l6];
	//  841 1787:aload           4
	//  842 1789:iload           18
	//  843 1791:faload          
	//  844 1792:fstore          6
		f = af1[i];
	//  845 1794:aload           4
	//  846 1796:iload           15
	//  847 1798:faload          
	//  848 1799:fstore          5
		break; /* Loop/switch isn't completed */
	//  849 1801:goto            2219
_L6:
		i = ((int) (c));
	//  850 1804:iload_2         
	//  851 1805:istore          15
		int l2 = i + 0;
	//  852 1807:iload           15
	//  853 1809:iconst_0        
	//  854 1810:iadd            
	//  855 1811:istore          16
		f1 = af1[l2];
	//  856 1813:aload           4
	//  857 1815:iload           16
	//  858 1817:faload          
	//  859 1818:fstore          6
		int i5 = i + 1;
	//  860 1820:iload           15
	//  861 1822:iconst_1        
	//  862 1823:iadd            
	//  863 1824:istore          17
		f = af1[i5];
	//  864 1826:aload           4
	//  865 1828:iload           17
	//  866 1830:faload          
	//  867 1831:fstore          5
		if(i > 0)
	//* 868 1833:iload           15
	//* 869 1835:ifle            1856
		{
			path1.lineTo(af1[l2], af1[i5]);
	//  870 1838:aload           21
	//  871 1840:aload           4
	//  872 1842:iload           16
	//  873 1844:faload          
	//  874 1845:aload           4
	//  875 1847:iload           17
	//  876 1849:faload          
	//  877 1850:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		} else
	//* 878 1853:goto            2219
		{
			path1.moveTo(af1[l2], af1[i5]);
	//  879 1856:aload           21
	//  880 1858:aload           4
	//  881 1860:iload           16
	//  882 1862:faload          
	//  883 1863:aload           4
	//  884 1865:iload           17
	//  885 1867:faload          
	//  886 1868:invokevirtual   #41  <Method void Path.moveTo(float, float)>
			f5 = f;
	//  887 1871:fload           5
	//  888 1873:fstore          10
			f4 = f1;
	//  889 1875:fload           6
	//  890 1877:fstore          9
		}
		break; /* Loop/switch isn't completed */
	//  891 1879:goto            2219
_L5:
		i = ((int) (c));
	//  892 1882:iload_2         
	//  893 1883:istore          15
		int i3 = i + 0;
	//  894 1885:iload           15
	//  895 1887:iconst_0        
	//  896 1888:iadd            
	//  897 1889:istore          16
		f = af1[i3];
	//  898 1891:aload           4
	//  899 1893:iload           16
	//  900 1895:faload          
	//  901 1896:fstore          5
		i++;
	//  902 1898:iload           15
	//  903 1900:iconst_1        
	//  904 1901:iadd            
	//  905 1902:istore          15
		path1.lineTo(f, af1[i]);
	//  906 1904:aload           21
	//  907 1906:fload           5
	//  908 1908:aload           4
	//  909 1910:iload           15
	//  910 1912:faload          
	//  911 1913:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		f1 = af1[i3];
	//  912 1916:aload           4
	//  913 1918:iload           16
	//  914 1920:faload          
	//  915 1921:fstore          6
		f = af1[i];
	//  916 1923:aload           4
	//  917 1925:iload           15
	//  918 1927:faload          
	//  919 1928:fstore          5
		break; /* Loop/switch isn't completed */
	//  920 1930:goto            2219
_L4:
		i = c + 0;
	//  921 1933:iload_2         
	//  922 1934:iconst_0        
	//  923 1935:iadd            
	//  924 1936:istore          15
		path1.lineTo(af1[i], f);
	//  925 1938:aload           21
	//  926 1940:aload           4
	//  927 1942:iload           15
	//  928 1944:faload          
	//  929 1945:fload           5
	//  930 1947:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		f1 = af1[i];
	//  931 1950:aload           4
	//  932 1952:iload           15
	//  933 1954:faload          
	//  934 1955:fstore          6
		break; /* Loop/switch isn't completed */
	//  935 1957:goto            2219
_L3:
		i = ((int) (c));
	//  936 1960:iload_2         
	//  937 1961:istore          15
		f = af1[i + 0];
	//  938 1963:aload           4
	//  939 1965:iload           15
	//  940 1967:iconst_0        
	//  941 1968:iadd            
	//  942 1969:faload          
	//  943 1970:fstore          5
		f1 = af1[i + 1];
	//  944 1972:aload           4
	//  945 1974:iload           15
	//  946 1976:iconst_1        
	//  947 1977:iadd            
	//  948 1978:faload          
	//  949 1979:fstore          6
		int j3 = i + 2;
	//  950 1981:iload           15
	//  951 1983:iconst_2        
	//  952 1984:iadd            
	//  953 1985:istore          16
		f2 = af1[j3];
	//  954 1987:aload           4
	//  955 1989:iload           16
	//  956 1991:faload          
	//  957 1992:fstore          7
		int j5 = i + 3;
	//  958 1994:iload           15
	//  959 1996:iconst_3        
	//  960 1997:iadd            
	//  961 1998:istore          17
		f3 = af1[j5];
	//  962 2000:aload           4
	//  963 2002:iload           17
	//  964 2004:faload          
	//  965 2005:fstore          8
		int i7 = i + 4;
	//  966 2007:iload           15
	//  967 2009:iconst_4        
	//  968 2010:iadd            
	//  969 2011:istore          18
		float f10 = af1[i7];
	//  970 2013:aload           4
	//  971 2015:iload           18
	//  972 2017:faload          
	//  973 2018:fstore          11
		i += 5;
	//  974 2020:iload           15
	//  975 2022:iconst_5        
	//  976 2023:iadd            
	//  977 2024:istore          15
		path.cubicTo(f, f1, f2, f3, f10, af1[i]);
	//  978 2026:aload_0         
	//  979 2027:fload           5
	//  980 2029:fload           6
	//  981 2031:fload           7
	//  982 2033:fload           8
	//  983 2035:fload           11
	//  984 2037:aload           4
	//  985 2039:iload           15
	//  986 2041:faload          
	//  987 2042:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
		f1 = af1[i7];
	//  988 2045:aload           4
	//  989 2047:iload           18
	//  990 2049:faload          
	//  991 2050:fstore          6
		f = af1[i];
	//  992 2052:aload           4
	//  993 2054:iload           15
	//  994 2056:faload          
	//  995 2057:fstore          5
		f2 = af1[j3];
	//  996 2059:aload           4
	//  997 2061:iload           16
	//  998 2063:faload          
	//  999 2064:fstore          7
		f3 = af1[j5];
	// 1000 2066:aload           4
	// 1001 2068:iload           17
	// 1002 2070:faload          
	// 1003 2071:fstore          8
		break; /* Loop/switch isn't completed */
	// 1004 2073:goto            2219
_L2:
		i = ((int) (c));
	// 1005 2076:iload_2         
	// 1006 2077:istore          15
		int k3 = i + 5;
	// 1007 2079:iload           15
	// 1008 2081:iconst_5        
	// 1009 2082:iadd            
	// 1010 2083:istore          16
		f2 = af1[k3];
	// 1011 2085:aload           4
	// 1012 2087:iload           16
	// 1013 2089:faload          
	// 1014 2090:fstore          7
		int k5 = i + 6;
	// 1015 2092:iload           15
	// 1016 2094:bipush          6
	// 1017 2096:iadd            
	// 1018 2097:istore          17
		f3 = af1[k5];
	// 1019 2099:aload           4
	// 1020 2101:iload           17
	// 1021 2103:faload          
	// 1022 2104:fstore          8
		float f11 = af1[i + 0];
	// 1023 2106:aload           4
	// 1024 2108:iload           15
	// 1025 2110:iconst_0        
	// 1026 2111:iadd            
	// 1027 2112:faload          
	// 1028 2113:fstore          11
		float f19 = af1[i + 1];
	// 1029 2115:aload           4
	// 1030 2117:iload           15
	// 1031 2119:iconst_1        
	// 1032 2120:iadd            
	// 1033 2121:faload          
	// 1034 2122:fstore          12
		float f23 = af1[i + 2];
	// 1035 2124:aload           4
	// 1036 2126:iload           15
	// 1037 2128:iconst_2        
	// 1038 2129:iadd            
	// 1039 2130:faload          
	// 1040 2131:fstore          13
		boolean flag2;
		if(af1[i + 3] != 0.0F)
	//*1041 2133:aload           4
	//*1042 2135:iload           15
	//*1043 2137:iconst_3        
	//*1044 2138:iadd            
	//*1045 2139:faload          
	//*1046 2140:fconst_0        
	//*1047 2141:fcmpl           
	//*1048 2142:ifeq            2151
			flag2 = true;
	// 1049 2145:iconst_1        
	// 1050 2146:istore          19
		else
	//*1051 2148:goto            2154
			flag2 = false;
	// 1052 2151:iconst_0        
	// 1053 2152:istore          19
		boolean flag4;
		if(af1[i + 4] != 0.0F)
	//*1054 2154:aload           4
	//*1055 2156:iload           15
	//*1056 2158:iconst_4        
	//*1057 2159:iadd            
	//*1058 2160:faload          
	//*1059 2161:fconst_0        
	//*1060 2162:fcmpl           
	//*1061 2163:ifeq            2172
			flag4 = true;
	// 1062 2166:iconst_1        
	// 1063 2167:istore          20
		else
	//*1064 2169:goto            2175
			flag4 = false;
	// 1065 2172:iconst_0        
	// 1066 2173:istore          20
		drawArc(path, f1, f, f2, f3, f11, f19, f23, flag2, flag4);
	// 1067 2175:aload_0         
	// 1068 2176:fload           6
	// 1069 2178:fload           5
	// 1070 2180:fload           7
	// 1071 2182:fload           8
	// 1072 2184:fload           11
	// 1073 2186:fload           12
	// 1074 2188:fload           13
	// 1075 2190:iload           19
	// 1076 2192:iload           20
	// 1077 2194:invokestatic    #59  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
		f1 = af1[k3];
	// 1078 2197:aload           4
	// 1079 2199:iload           16
	// 1080 2201:faload          
	// 1081 2202:fstore          6
		f = af1[k5];
	// 1082 2204:aload           4
	// 1083 2206:iload           17
	// 1084 2208:faload          
	// 1085 2209:fstore          5
		f3 = f;
	// 1086 2211:fload           5
	// 1087 2213:fstore          8
		f2 = f1;
	// 1088 2215:fload           6
	// 1089 2217:fstore          7
		c += ((char) (byte0));
	// 1090 2219:iload_2         
	// 1091 2220:iload           14
	// 1092 2222:iadd            
	// 1093 2223:istore_2        
		i = ((int) (c1));
	// 1094 2224:iload_3         
	// 1095 2225:istore          15
		if(true) goto _L24; else goto _L23
	// 1096 2227:goto            307
_L23:
		af[0] = f1;
	// 1097 2230:aload_1         
	// 1098 2231:iconst_0        
	// 1099 2232:fload           6
	// 1100 2234:fastore         
		af[1] = f;
	// 1101 2235:aload_1         
	// 1102 2236:iconst_1        
	// 1103 2237:fload           5
	// 1104 2239:fastore         
		af[2] = f2;
	// 1105 2240:aload_1         
	// 1106 2241:iconst_2        
	// 1107 2242:fload           7
	// 1108 2244:fastore         
		af[3] = f3;
	// 1109 2245:aload_1         
	// 1110 2246:iconst_3        
	// 1111 2247:fload           8
	// 1112 2249:fastore         
		af[4] = f4;
	// 1113 2250:aload_1         
	// 1114 2251:iconst_4        
	// 1115 2252:fload           9
	// 1116 2254:fastore         
		af[5] = f5;
	// 1117 2255:aload_1         
	// 1118 2256:iconst_5        
	// 1119 2257:fload           10
	// 1120 2259:fastore         
		return;
	// 1121 2260:return          
	}

	private static void arcToBezier(Path path, double d, double d1, double d2, double d3, double d4, double d5, double d6, 
			double d7, double d8)
	{
		int i = (int)Math.ceil(Math.abs((d8 * 4D) / 3.1415926535897931D));
	//    0    0:dload           17
	//    1    2:ldc2w           #71  <Double 4D>
	//    2    5:dmul            
	//    3    6:ldc2w           #73  <Double 3.1415926535897931D>
	//    4    9:ddiv            
	//    5   10:invokestatic    #80  <Method double Math.abs(double)>
	//    6   13:invokestatic    #83  <Method double Math.ceil(double)>
	//    7   16:d2i             
	//    8   17:istore          43
		double d12 = Math.cos(d6);
	//    9   19:dload           13
	//   10   21:invokestatic    #86  <Method double Math.cos(double)>
	//   11   24:dstore          25
		double d14 = Math.sin(d6);
	//   12   26:dload           13
	//   13   28:invokestatic    #89  <Method double Math.sin(double)>
	//   14   31:dstore          27
		double d9 = Math.cos(d7);
	//   15   33:dload           15
	//   16   35:invokestatic    #86  <Method double Math.cos(double)>
	//   17   38:dstore          19
		double d11 = Math.sin(d7);
	//   18   40:dload           15
	//   19   42:invokestatic    #89  <Method double Math.sin(double)>
	//   20   45:dstore          23
		d6 = -d2;
	//   21   47:dload           5
	//   22   49:dneg            
	//   23   50:dstore          13
		double d20 = d6 * d12;
	//   24   52:dload           13
	//   25   54:dload           25
	//   26   56:dmul            
	//   27   57:dstore          35
		double d21 = d3 * d14;
	//   28   59:dload           7
	//   29   61:dload           27
	//   30   63:dmul            
	//   31   64:dstore          37
		d6 *= d14;
	//   32   66:dload           13
	//   33   68:dload           27
	//   34   70:dmul            
	//   35   71:dstore          13
		double d22 = d3 * d12;
	//   36   73:dload           7
	//   37   75:dload           25
	//   38   77:dmul            
	//   39   78:dstore          39
		double d16 = d8 / (double)i;
	//   40   80:dload           17
	//   41   82:iload           43
	//   42   84:i2d             
	//   43   85:ddiv            
	//   44   86:dstore          29
		double d10 = d11 * d6 + d9 * d22;
	//   45   88:dload           23
	//   46   90:dload           13
	//   47   92:dmul            
	//   48   93:dload           19
	//   49   95:dload           39
	//   50   97:dmul            
	//   51   98:dadd            
	//   52   99:dstore          21
		d8 = d20 * d11 - d21 * d9;
	//   53  101:dload           35
	//   54  103:dload           23
	//   55  105:dmul            
	//   56  106:dload           37
	//   57  108:dload           19
	//   58  110:dmul            
	//   59  111:dsub            
	//   60  112:dstore          17
		int j = 0;
	//   61  114:iconst_0        
	//   62  115:istore          44
		d11 = d7;
	//   63  117:dload           15
	//   64  119:dstore          23
		d9 = d5;
	//   65  121:dload           11
	//   66  123:dstore          19
		d7 = d4;
	//   67  125:dload           9
	//   68  127:dstore          15
		d3 = d6;
	//   69  129:dload           13
	//   70  131:dstore          7
		d6 = d16;
	//   71  133:dload           29
	//   72  135:dstore          13
		d5 = d14;
	//   73  137:dload           27
	//   74  139:dstore          11
		d4 = d12;
	//   75  141:dload           25
	//   76  143:dstore          9
		do
		{
			double d15 = d2;
	//   77  145:dload           5
	//   78  147:dstore          27
			if(j < i)
	//*  79  149:iload           44
	//*  80  151:iload           43
	//*  81  153:icmpge          368
			{
				double d17 = d11 + d6;
	//   82  156:dload           23
	//   83  158:dload           13
	//   84  160:dadd            
	//   85  161:dstore          29
				double d18 = Math.sin(d17);
	//   86  163:dload           29
	//   87  165:invokestatic    #89  <Method double Math.sin(double)>
	//   88  168:dstore          31
				double d23 = Math.cos(d17);
	//   89  170:dload           29
	//   90  172:invokestatic    #86  <Method double Math.cos(double)>
	//   91  175:dstore          41
				double d13 = (d + d15 * d4 * d23) - d21 * d18;
	//   92  177:dload_1         
	//   93  178:dload           27
	//   94  180:dload           9
	//   95  182:dmul            
	//   96  183:dload           41
	//   97  185:dmul            
	//   98  186:dadd            
	//   99  187:dload           37
	//  100  189:dload           31
	//  101  191:dmul            
	//  102  192:dsub            
	//  103  193:dstore          25
				double d19 = d1 + d15 * d5 * d23 + d22 * d18;
	//  104  195:dload_3         
	//  105  196:dload           27
	//  106  198:dload           11
	//  107  200:dmul            
	//  108  201:dload           41
	//  109  203:dmul            
	//  110  204:dadd            
	//  111  205:dload           39
	//  112  207:dload           31
	//  113  209:dmul            
	//  114  210:dadd            
	//  115  211:dstore          33
				d15 = d20 * d18 - d21 * d23;
	//  116  213:dload           35
	//  117  215:dload           31
	//  118  217:dmul            
	//  119  218:dload           37
	//  120  220:dload           41
	//  121  222:dmul            
	//  122  223:dsub            
	//  123  224:dstore          27
				d18 = d18 * d3 + d23 * d22;
	//  124  226:dload           31
	//  125  228:dload           7
	//  126  230:dmul            
	//  127  231:dload           41
	//  128  233:dload           39
	//  129  235:dmul            
	//  130  236:dadd            
	//  131  237:dstore          31
				d11 = d17 - d11;
	//  132  239:dload           29
	//  133  241:dload           23
	//  134  243:dsub            
	//  135  244:dstore          23
				d23 = Math.tan(d11 / 2D);
	//  136  246:dload           23
	//  137  248:ldc2w           #90  <Double 2D>
	//  138  251:ddiv            
	//  139  252:invokestatic    #94  <Method double Math.tan(double)>
	//  140  255:dstore          41
				d11 = (Math.sin(d11) * (Math.sqrt(d23 * 3D * d23 + 4D) - 1.0D)) / 3D;
	//  141  257:dload           23
	//  142  259:invokestatic    #89  <Method double Math.sin(double)>
	//  143  262:dload           41
	//  144  264:ldc2w           #95  <Double 3D>
	//  145  267:dmul            
	//  146  268:dload           41
	//  147  270:dmul            
	//  148  271:ldc2w           #71  <Double 4D>
	//  149  274:dadd            
	//  150  275:invokestatic    #99  <Method double Math.sqrt(double)>
	//  151  278:dconst_1        
	//  152  279:dsub            
	//  153  280:dmul            
	//  154  281:ldc2w           #95  <Double 3D>
	//  155  284:ddiv            
	//  156  285:dstore          23
				path.rLineTo(0.0F, 0.0F);
	//  157  287:aload_0         
	//  158  288:fconst_0        
	//  159  289:fconst_0        
	//  160  290:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
				path.cubicTo((float)(d7 + d8 * d11), (float)(d9 + d10 * d11), (float)(d13 - d11 * d15), (float)(d19 - d11 * d18), (float)d13, (float)d19);
	//  161  293:aload_0         
	//  162  294:dload           15
	//  163  296:dload           17
	//  164  298:dload           23
	//  165  300:dmul            
	//  166  301:dadd            
	//  167  302:d2f             
	//  168  303:dload           19
	//  169  305:dload           21
	//  170  307:dload           23
	//  171  309:dmul            
	//  172  310:dadd            
	//  173  311:d2f             
	//  174  312:dload           25
	//  175  314:dload           23
	//  176  316:dload           27
	//  177  318:dmul            
	//  178  319:dsub            
	//  179  320:d2f             
	//  180  321:dload           33
	//  181  323:dload           23
	//  182  325:dload           31
	//  183  327:dmul            
	//  184  328:dsub            
	//  185  329:d2f             
	//  186  330:dload           25
	//  187  332:d2f             
	//  188  333:dload           33
	//  189  335:d2f             
	//  190  336:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
				j++;
	//  191  339:iload           44
	//  192  341:iconst_1        
	//  193  342:iadd            
	//  194  343:istore          44
				d9 = d19;
	//  195  345:dload           33
	//  196  347:dstore          19
				d11 = d17;
	//  197  349:dload           29
	//  198  351:dstore          23
				d10 = d18;
	//  199  353:dload           31
	//  200  355:dstore          21
				d8 = d15;
	//  201  357:dload           27
	//  202  359:dstore          17
				d7 = d13;
	//  203  361:dload           25
	//  204  363:dstore          15
			} else
	//* 205  365:goto            145
			{
				return;
	//  206  368:return          
			}
		} while(true);
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
		double d7 = f;
	//   10   22:fload_1         
	//   11   23:f2d             
	//   12   24:dstore          24
		double d8 = f1;
	//   13   26:fload_2         
	//   14   27:f2d             
	//   15   28:dstore          26
		double d9 = f4;
	//   16   30:fload           5
	//   17   32:f2d             
	//   18   33:dstore          28
		double d = (d7 * d5 + d8 * d6) / d9;
	//   19   35:dload           24
	//   20   37:dload           20
	//   21   39:dmul            
	//   22   40:dload           26
	//   23   42:dload           22
	//   24   44:dmul            
	//   25   45:dadd            
	//   26   46:dload           28
	//   27   48:ddiv            
	//   28   49:dstore          10
		double d1 = -f;
	//   29   51:fload_1         
	//   30   52:fneg            
	//   31   53:f2d             
	//   32   54:dstore          12
		double d10 = f5;
	//   33   56:fload           6
	//   34   58:f2d             
	//   35   59:dstore          30
		double d3 = (d1 * d6 + d8 * d5) / d10;
	//   36   61:dload           12
	//   37   63:dload           22
	//   38   65:dmul            
	//   39   66:dload           26
	//   40   68:dload           20
	//   41   70:dmul            
	//   42   71:dadd            
	//   43   72:dload           30
	//   44   74:ddiv            
	//   45   75:dstore          16
		double d2 = f2;
	//   46   77:fload_3         
	//   47   78:f2d             
	//   48   79:dstore          14
		d1 = f3;
	//   49   81:fload           4
	//   50   83:f2d             
	//   51   84:dstore          12
		double d11 = (d2 * d5 + d1 * d6) / d9;
	//   52   86:dload           14
	//   53   88:dload           20
	//   54   90:dmul            
	//   55   91:dload           12
	//   56   93:dload           22
	//   57   95:dmul            
	//   58   96:dadd            
	//   59   97:dload           28
	//   60   99:ddiv            
	//   61  100:dstore          32
		double d12 = ((double)(-f2) * d6 + d1 * d5) / d10;
	//   62  102:fload_3         
	//   63  103:fneg            
	//   64  104:f2d             
	//   65  105:dload           22
	//   66  107:dmul            
	//   67  108:dload           12
	//   68  110:dload           20
	//   69  112:dmul            
	//   70  113:dadd            
	//   71  114:dload           30
	//   72  116:ddiv            
	//   73  117:dstore          34
		double d14 = d - d11;
	//   74  119:dload           10
	//   75  121:dload           32
	//   76  123:dsub            
	//   77  124:dstore          38
		double d13 = d3 - d12;
	//   78  126:dload           16
	//   79  128:dload           34
	//   80  130:dsub            
	//   81  131:dstore          36
		d2 = (d + d11) / 2D;
	//   82  133:dload           10
	//   83  135:dload           32
	//   84  137:dadd            
	//   85  138:ldc2w           #90  <Double 2D>
	//   86  141:ddiv            
	//   87  142:dstore          14
		d1 = (d3 + d12) / 2D;
	//   88  144:dload           16
	//   89  146:dload           34
	//   90  148:dadd            
	//   91  149:ldc2w           #90  <Double 2D>
	//   92  152:ddiv            
	//   93  153:dstore          12
		double d15 = d14 * d14 + d13 * d13;
	//   94  155:dload           38
	//   95  157:dload           38
	//   96  159:dmul            
	//   97  160:dload           36
	//   98  162:dload           36
	//   99  164:dmul            
	//  100  165:dadd            
	//  101  166:dstore          40
		if(d15 == 0.0D)
	//* 102  168:dload           40
	//* 103  170:dconst_0        
	//* 104  171:dcmpl           
	//* 105  172:ifne            184
		{
			Log.w("PathParser", " Points are coincident");
	//  106  175:ldc1            #104 <String "PathParser">
	//  107  177:ldc1            #106 <String " Points are coincident">
	//  108  179:invokestatic    #112 <Method int Log.w(String, String)>
	//  109  182:pop             
			return;
	//  110  183:return          
		}
		double d16 = 1.0D / d15 - 0.25D;
	//  111  184:dconst_1        
	//  112  185:dload           40
	//  113  187:ddiv            
	//  114  188:ldc2w           #113 <Double 0.25D>
	//  115  191:dsub            
	//  116  192:dstore          42
		if(d16 < 0.0D)
	//* 117  194:dload           42
	//* 118  196:dconst_0        
	//* 119  197:dcmpg           
	//* 120  198:ifge            275
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  121  201:new             #116 <Class StringBuilder>
	//  122  204:dup             
	//  123  205:invokespecial   #117 <Method void StringBuilder()>
	//  124  208:astore          46
			stringbuilder.append("Points are too far apart ");
	//  125  210:aload           46
	//  126  212:ldc1            #119 <String "Points are too far apart ">
	//  127  214:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//  128  217:pop             
			stringbuilder.append(d15);
	//  129  218:aload           46
	//  130  220:dload           40
	//  131  222:invokevirtual   #126 <Method StringBuilder StringBuilder.append(double)>
	//  132  225:pop             
			Log.w("PathParser", stringbuilder.toString());
	//  133  226:ldc1            #104 <String "PathParser">
	//  134  228:aload           46
	//  135  230:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  136  233:invokestatic    #112 <Method int Log.w(String, String)>
	//  137  236:pop             
			float f7 = (float)(Math.sqrt(d15) / 1.9999899999999999D);
	//  138  237:dload           40
	//  139  239:invokestatic    #99  <Method double Math.sqrt(double)>
	//  140  242:ldc2w           #131 <Double 1.9999899999999999D>
	//  141  245:ddiv            
	//  142  246:d2f             
	//  143  247:fstore          44
			drawArc(path, f, f1, f2, f3, f4 * f7, f5 * f7, f6, flag, flag1);
	//  144  249:aload_0         
	//  145  250:fload_1         
	//  146  251:fload_2         
	//  147  252:fload_3         
	//  148  253:fload           4
	//  149  255:fload           5
	//  150  257:fload           44
	//  151  259:fmul            
	//  152  260:fload           6
	//  153  262:fload           44
	//  154  264:fmul            
	//  155  265:fload           7
	//  156  267:iload           8
	//  157  269:iload           9
	//  158  271:invokestatic    #59  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
			return;
	//  159  274:return          
		}
		d15 = Math.sqrt(d16);
	//  160  275:dload           42
	//  161  277:invokestatic    #99  <Method double Math.sqrt(double)>
	//  162  280:dstore          40
		d14 *= d15;
	//  163  282:dload           38
	//  164  284:dload           40
	//  165  286:dmul            
	//  166  287:dstore          38
		d13 = d15 * d13;
	//  167  289:dload           40
	//  168  291:dload           36
	//  169  293:dmul            
	//  170  294:dstore          36
		if(flag == flag1)
	//* 171  296:iload           8
	//* 172  298:iload           9
	//* 173  300:icmpne          320
		{
			d2 -= d13;
	//  174  303:dload           14
	//  175  305:dload           36
	//  176  307:dsub            
	//  177  308:dstore          14
			d1 += d14;
	//  178  310:dload           12
	//  179  312:dload           38
	//  180  314:dadd            
	//  181  315:dstore          12
		} else
	//* 182  317:goto            334
		{
			d2 += d13;
	//  183  320:dload           14
	//  184  322:dload           36
	//  185  324:dadd            
	//  186  325:dstore          14
			d1 -= d14;
	//  187  327:dload           12
	//  188  329:dload           38
	//  189  331:dsub            
	//  190  332:dstore          12
		}
		d13 = Math.atan2(d3 - d1, d - d2);
	//  191  334:dload           16
	//  192  336:dload           12
	//  193  338:dsub            
	//  194  339:dload           10
	//  195  341:dload           14
	//  196  343:dsub            
	//  197  344:invokestatic    #136 <Method double Math.atan2(double, double)>
	//  198  347:dstore          36
		d3 = Math.atan2(d12 - d1, d11 - d2) - d13;
	//  199  349:dload           34
	//  200  351:dload           12
	//  201  353:dsub            
	//  202  354:dload           32
	//  203  356:dload           14
	//  204  358:dsub            
	//  205  359:invokestatic    #136 <Method double Math.atan2(double, double)>
	//  206  362:dload           36
	//  207  364:dsub            
	//  208  365:dstore          16
		int i = d3 != 0.0D;
	//  209  367:dload           16
	//  210  369:dconst_0        
	//  211  370:dcmpl           
	//  212  371:istore          45
		if(i >= 0)
	//* 213  373:iload           45
	//* 214  375:iflt            384
			flag = true;
	//  215  378:iconst_1        
	//  216  379:istore          8
		else
	//* 217  381:goto            387
			flag = false;
	//  218  384:iconst_0        
	//  219  385:istore          8
		d = d3;
	//  220  387:dload           16
	//  221  389:dstore          10
		if(flag1 != flag)
	//* 222  391:iload           9
	//* 223  393:iload           8
	//* 224  395:icmpeq          422
			if(i > 0)
	//* 225  398:iload           45
	//* 226  400:ifle            414
				d = d3 - 6.2831853071795862D;
	//  227  403:dload           16
	//  228  405:ldc2w           #137 <Double 6.2831853071795862D>
	//  229  408:dsub            
	//  230  409:dstore          10
			else
	//* 231  411:goto            422
				d = d3 + 6.2831853071795862D;
	//  232  414:dload           16
	//  233  416:ldc2w           #137 <Double 6.2831853071795862D>
	//  234  419:dadd            
	//  235  420:dstore          10
		d2 *= d9;
	//  236  422:dload           14
	//  237  424:dload           28
	//  238  426:dmul            
	//  239  427:dstore          14
		d1 *= d10;
	//  240  429:dload           12
	//  241  431:dload           30
	//  242  433:dmul            
	//  243  434:dstore          12
		arcToBezier(path, d2 * d5 - d1 * d6, d2 * d6 + d1 * d5, d9, d10, d7, d8, d4, d13, d);
	//  244  436:aload_0         
	//  245  437:dload           14
	//  246  439:dload           20
	//  247  441:dmul            
	//  248  442:dload           12
	//  249  444:dload           22
	//  250  446:dmul            
	//  251  447:dsub            
	//  252  448:dload           14
	//  253  450:dload           22
	//  254  452:dmul            
	//  255  453:dload           12
	//  256  455:dload           20
	//  257  457:dmul            
	//  258  458:dadd            
	//  259  459:dload           28
	//  260  461:dload           30
	//  261  463:dload           24
	//  262  465:dload           26
	//  263  467:dload           18
	//  264  469:dload           36
	//  265  471:dload           10
	//  266  473:invokestatic    #140 <Method void arcToBezier(Path, double, double, double, double, double, double, double, double, double)>
	//  267  476:return          
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		do
		{
			float af[] = pathparser$pathdatanode.mParams;
	//    2    3:aload_1         
	//    3    4:getfield        #24  <Field float[] mParams>
	//    4    7:astore          5
			if(i < af.length)
	//*   5    9:iload           4
	//*   6   11:aload           5
	//*   7   13:arraylength     
	//*   8   14:icmpge          52
			{
				mParams[i] = af[i] * (1.0F - f) + pathparser$pathdatanode1.mParams[i] * f;
	//    9   17:aload_0         
	//   10   18:getfield        #24  <Field float[] mParams>
	//   11   21:iload           4
	//   12   23:aload           5
	//   13   25:iload           4
	//   14   27:faload          
	//   15   28:fconst_1        
	//   16   29:fload_3         
	//   17   30:fsub            
	//   18   31:fmul            
	//   19   32:aload_2         
	//   20   33:getfield        #24  <Field float[] mParams>
	//   21   36:iload           4
	//   22   38:faload          
	//   23   39:fload_3         
	//   24   40:fmul            
	//   25   41:fadd            
	//   26   42:fastore         
				i++;
	//   27   43:iload           4
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore          4
			} else
	//*  31   49:goto            3
			{
				return;
	//   32   52:return          
			}
		} while(true);
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
		pathparser$pathdatanode = ((PathParser$PathDataNode) (pathparser$pathdatanode.mParams));
	//    6   12:aload_1         
	//    7   13:getfield        #24  <Field float[] mParams>
	//    8   16:astore_1        
		mParams = PathParser.copyOfRange(((float []) (pathparser$pathdatanode)), 0, pathparser$pathdatanode.length);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:aload_1         
	//   13   21:arraylength     
	//   14   22:invokestatic    #30  <Method float[] PathParser.copyOfRange(float[], int, int)>
	//   15   25:putfield        #24  <Field float[] mParams>
	//   16   28:return          
	}
}
