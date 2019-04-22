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
		//		               65: 270
		//		               67: 263
		//		               72: 257
		//		               76: 251
		//		               77: 251
		//		               81: 245
		//		               83: 245
		//		               84: 251
		//		               86: 257
		//		               90: 210
		//		               97: 270
		//		               99: 263
		//		               104: 257
		//		               108: 251
		//		               109: 251
		//		               113: 245
		//		               115: 245
		//		               116: 251
		//		               118: 257
		//		               122: 210
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
		//   83  311:icmpge          2229
			f7 = 0.0F;
		//   84  314:fconst_0        
		//   85  315:fstore          11
			c1;
		//   86  317:iload_3         
			JVM INSTR lookupswitch 18: default 472
		//		               65: 2075
		//		               67: 1959
		//		               72: 1932
		//		               76: 1881
		//		               77: 1803
		//		               81: 1708
		//		               83: 1538
		//		               84: 1405
		//		               86: 1371
		//		               97: 1220
		//		               99: 1085
		//		               104: 1056
		//		               108: 1004
		//		               109: 926
		//		               113: 810
		//		               115: 637
		//		               116: 504
		//		               118: 475;
		//   87  318:lookupswitch    18: default 472
		//		               65: 2075
		//		               67: 1959
		//		               72: 1932
		//		               76: 1881
		//		               77: 1803
		//		               81: 1708
		//		               83: 1538
		//		               84: 1405
		//		               86: 1371
		//		               97: 1220
		//		               99: 1085
		//		               104: 1056
		//		               108: 1004
		//		               109: 926
		//		               113: 810
		//		               115: 637
		//		               116: 504
		//		               118: 475
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
			break; /* Loop/switch isn't completed */
		//   88  472:goto            2218
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
		//  105  501:goto            2218
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
		//  176  634:goto            2218
_L17:
			if(i != 99 && i != 115 && i != 67 && i != 83)
		//* 177  637:iload           15
		//* 178  639:bipush          99
		//* 179  641:icmpeq          677
		//* 180  644:iload           15
		//* 181  646:bipush          115
		//* 182  648:icmpeq          677
		//* 183  651:iload           15
		//* 184  653:bipush          67
		//* 185  655:icmpeq          677
		//* 186  658:iload           15
		//* 187  660:bipush          83
		//* 188  662:icmpne          668
		//* 189  665:goto            677
			{
				f2 = 0.0F;
		//  190  668:fconst_0        
		//  191  669:fstore          7
				f3 = 0.0F;
		//  192  671:fconst_0        
		//  193  672:fstore          8
			} else
		//* 194  674:goto            691
			{
				f3 = f - f3;
		//  195  677:fload           5
		//  196  679:fload           8
		//  197  681:fsub            
		//  198  682:fstore          8
				f2 = f1 - f2;
		//  199  684:fload           6
		//  200  686:fload           7
		//  201  688:fsub            
		//  202  689:fstore          7
			}
			i = c + 0;
		//  203  691:iload_2         
		//  204  692:iconst_0        
		//  205  693:iadd            
		//  206  694:istore          15
			f7 = af1[i];
		//  207  696:aload           4
		//  208  698:iload           15
		//  209  700:faload          
		//  210  701:fstore          11
			int k = c + 1;
		//  211  703:iload_2         
		//  212  704:iconst_1        
		//  213  705:iadd            
		//  214  706:istore          16
			float f13 = af1[k];
		//  215  708:aload           4
		//  216  710:iload           16
		//  217  712:faload          
		//  218  713:fstore          12
			int l3 = c + 2;
		//  219  715:iload_2         
		//  220  716:iconst_2        
		//  221  717:iadd            
		//  222  718:istore          17
			float f20 = af1[l3];
		//  223  720:aload           4
		//  224  722:iload           17
		//  225  724:faload          
		//  226  725:fstore          13
			int l5 = c + 3;
		//  227  727:iload_2         
		//  228  728:iconst_3        
		//  229  729:iadd            
		//  230  730:istore          18
			path.rCubicTo(f2, f3, f7, f13, f20, af1[l5]);
		//  231  732:aload_0         
		//  232  733:fload           7
		//  233  735:fload           8
		//  234  737:fload           11
		//  235  739:fload           12
		//  236  741:fload           13
		//  237  743:aload           4
		//  238  745:iload           18
		//  239  747:faload          
		//  240  748:invokevirtual   #52  <Method void Path.rCubicTo(float, float, float, float, float, float)>
			f2 = af1[i];
		//  241  751:aload           4
		//  242  753:iload           15
		//  243  755:faload          
		//  244  756:fstore          7
			f3 = af1[k];
		//  245  758:aload           4
		//  246  760:iload           16
		//  247  762:faload          
		//  248  763:fstore          8
			f7 = f1 + af1[l3];
		//  249  765:fload           6
		//  250  767:aload           4
		//  251  769:iload           17
		//  252  771:faload          
		//  253  772:fadd            
		//  254  773:fstore          11
			f13 = f + af1[l5];
		//  255  775:fload           5
		//  256  777:aload           4
		//  257  779:iload           18
		//  258  781:faload          
		//  259  782:fadd            
		//  260  783:fstore          12
			f2 += f1;
		//  261  785:fload           7
		//  262  787:fload           6
		//  263  789:fadd            
		//  264  790:fstore          7
			f3 += f;
		//  265  792:fload           8
		//  266  794:fload           5
		//  267  796:fadd            
		//  268  797:fstore          8
			f = f13;
		//  269  799:fload           12
		//  270  801:fstore          5
			f1 = f7;
		//  271  803:fload           11
		//  272  805:fstore          6
			break; /* Loop/switch isn't completed */
		//  273  807:goto            2218
_L16:
			i = c + 0;
		//  274  810:iload_2         
		//  275  811:iconst_0        
		//  276  812:iadd            
		//  277  813:istore          15
			f2 = af1[i];
		//  278  815:aload           4
		//  279  817:iload           15
		//  280  819:faload          
		//  281  820:fstore          7
			int l = c + 1;
		//  282  822:iload_2         
		//  283  823:iconst_1        
		//  284  824:iadd            
		//  285  825:istore          16
			f3 = af1[l];
		//  286  827:aload           4
		//  287  829:iload           16
		//  288  831:faload          
		//  289  832:fstore          8
			int i4 = c + 2;
		//  290  834:iload_2         
		//  291  835:iconst_2        
		//  292  836:iadd            
		//  293  837:istore          17
			f7 = af1[i4];
		//  294  839:aload           4
		//  295  841:iload           17
		//  296  843:faload          
		//  297  844:fstore          11
			int i6 = c + 3;
		//  298  846:iload_2         
		//  299  847:iconst_3        
		//  300  848:iadd            
		//  301  849:istore          18
			path1.rQuadTo(f2, f3, f7, af1[i6]);
		//  302  851:aload           21
		//  303  853:fload           7
		//  304  855:fload           8
		//  305  857:fload           11
		//  306  859:aload           4
		//  307  861:iload           18
		//  308  863:faload          
		//  309  864:invokevirtual   #48  <Method void Path.rQuadTo(float, float, float, float)>
			f2 = af1[i];
		//  310  867:aload           4
		//  311  869:iload           15
		//  312  871:faload          
		//  313  872:fstore          7
			f3 = af1[l];
		//  314  874:aload           4
		//  315  876:iload           16
		//  316  878:faload          
		//  317  879:fstore          8
			f7 = f1 + af1[i4];
		//  318  881:fload           6
		//  319  883:aload           4
		//  320  885:iload           17
		//  321  887:faload          
		//  322  888:fadd            
		//  323  889:fstore          11
			float f14 = f + af1[i6];
		//  324  891:fload           5
		//  325  893:aload           4
		//  326  895:iload           18
		//  327  897:faload          
		//  328  898:fadd            
		//  329  899:fstore          12
			f2 += f1;
		//  330  901:fload           7
		//  331  903:fload           6
		//  332  905:fadd            
		//  333  906:fstore          7
			f3 += f;
		//  334  908:fload           8
		//  335  910:fload           5
		//  336  912:fadd            
		//  337  913:fstore          8
			f = f14;
		//  338  915:fload           12
		//  339  917:fstore          5
			f1 = f7;
		//  340  919:fload           11
		//  341  921:fstore          6
			break; /* Loop/switch isn't completed */
		//  342  923:goto            2218
_L15:
			i = c + 0;
		//  343  926:iload_2         
		//  344  927:iconst_0        
		//  345  928:iadd            
		//  346  929:istore          15
			f1 += af1[i];
		//  347  931:fload           6
		//  348  933:aload           4
		//  349  935:iload           15
		//  350  937:faload          
		//  351  938:fadd            
		//  352  939:fstore          6
			int i1 = c + 1;
		//  353  941:iload_2         
		//  354  942:iconst_1        
		//  355  943:iadd            
		//  356  944:istore          16
			f += af1[i1];
		//  357  946:fload           5
		//  358  948:aload           4
		//  359  950:iload           16
		//  360  952:faload          
		//  361  953:fadd            
		//  362  954:fstore          5
			if(c > 0)
		//* 363  956:iload_2         
		//* 364  957:ifle            978
			{
				path1.rLineTo(af1[i], af1[i1]);
		//  365  960:aload           21
		//  366  962:aload           4
		//  367  964:iload           15
		//  368  966:faload          
		//  369  967:aload           4
		//  370  969:iload           16
		//  371  971:faload          
		//  372  972:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			} else
		//* 373  975:goto            2218
			{
				path1.rMoveTo(af1[i], af1[i1]);
		//  374  978:aload           21
		//  375  980:aload           4
		//  376  982:iload           15
		//  377  984:faload          
		//  378  985:aload           4
		//  379  987:iload           16
		//  380  989:faload          
		//  381  990:invokevirtual   #55  <Method void Path.rMoveTo(float, float)>
				f5 = f;
		//  382  993:fload           5
		//  383  995:fstore          10
				f4 = f1;
		//  384  997:fload           6
		//  385  999:fstore          9
			}
			break; /* Loop/switch isn't completed */
		//  386 1001:goto            2218
_L14:
			i = c + 0;
		//  387 1004:iload_2         
		//  388 1005:iconst_0        
		//  389 1006:iadd            
		//  390 1007:istore          15
			f7 = af1[i];
		//  391 1009:aload           4
		//  392 1011:iload           15
		//  393 1013:faload          
		//  394 1014:fstore          11
			int j1 = c + 1;
		//  395 1016:iload_2         
		//  396 1017:iconst_1        
		//  397 1018:iadd            
		//  398 1019:istore          16
			path1.rLineTo(f7, af1[j1]);
		//  399 1021:aload           21
		//  400 1023:fload           11
		//  401 1025:aload           4
		//  402 1027:iload           16
		//  403 1029:faload          
		//  404 1030:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			f1 += af1[i];
		//  405 1033:fload           6
		//  406 1035:aload           4
		//  407 1037:iload           15
		//  408 1039:faload          
		//  409 1040:fadd            
		//  410 1041:fstore          6
			f += af1[j1];
		//  411 1043:fload           5
		//  412 1045:aload           4
		//  413 1047:iload           16
		//  414 1049:faload          
		//  415 1050:fadd            
		//  416 1051:fstore          5
			break; /* Loop/switch isn't completed */
		//  417 1053:goto            2218
_L13:
			i = c + 0;
		//  418 1056:iload_2         
		//  419 1057:iconst_0        
		//  420 1058:iadd            
		//  421 1059:istore          15
			path1.rLineTo(af1[i], 0.0F);
		//  422 1061:aload           21
		//  423 1063:aload           4
		//  424 1065:iload           15
		//  425 1067:faload          
		//  426 1068:fconst_0        
		//  427 1069:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
			f1 += af1[i];
		//  428 1072:fload           6
		//  429 1074:aload           4
		//  430 1076:iload           15
		//  431 1078:faload          
		//  432 1079:fadd            
		//  433 1080:fstore          6
			break; /* Loop/switch isn't completed */
		//  434 1082:goto            2218
_L12:
			f2 = af1[c + 0];
		//  435 1085:aload           4
		//  436 1087:iload_2         
		//  437 1088:iconst_0        
		//  438 1089:iadd            
		//  439 1090:faload          
		//  440 1091:fstore          7
			f3 = af1[c + 1];
		//  441 1093:aload           4
		//  442 1095:iload_2         
		//  443 1096:iconst_1        
		//  444 1097:iadd            
		//  445 1098:faload          
		//  446 1099:fstore          8
			i = c + 2;
		//  447 1101:iload_2         
		//  448 1102:iconst_2        
		//  449 1103:iadd            
		//  450 1104:istore          15
			f7 = af1[i];
		//  451 1106:aload           4
		//  452 1108:iload           15
		//  453 1110:faload          
		//  454 1111:fstore          11
			int k1 = c + 3;
		//  455 1113:iload_2         
		//  456 1114:iconst_3        
		//  457 1115:iadd            
		//  458 1116:istore          16
			float f15 = af1[k1];
		//  459 1118:aload           4
		//  460 1120:iload           16
		//  461 1122:faload          
		//  462 1123:fstore          12
			int j4 = c + 4;
		//  463 1125:iload_2         
		//  464 1126:iconst_4        
		//  465 1127:iadd            
		//  466 1128:istore          17
			float f21 = af1[j4];
		//  467 1130:aload           4
		//  468 1132:iload           17
		//  469 1134:faload          
		//  470 1135:fstore          13
			int j6 = c + 5;
		//  471 1137:iload_2         
		//  472 1138:iconst_5        
		//  473 1139:iadd            
		//  474 1140:istore          18
			path.rCubicTo(f2, f3, f7, f15, f21, af1[j6]);
		//  475 1142:aload_0         
		//  476 1143:fload           7
		//  477 1145:fload           8
		//  478 1147:fload           11
		//  479 1149:fload           12
		//  480 1151:fload           13
		//  481 1153:aload           4
		//  482 1155:iload           18
		//  483 1157:faload          
		//  484 1158:invokevirtual   #52  <Method void Path.rCubicTo(float, float, float, float, float, float)>
			f2 = af1[i];
		//  485 1161:aload           4
		//  486 1163:iload           15
		//  487 1165:faload          
		//  488 1166:fstore          7
			f3 = af1[k1];
		//  489 1168:aload           4
		//  490 1170:iload           16
		//  491 1172:faload          
		//  492 1173:fstore          8
			f7 = f1 + af1[j4];
		//  493 1175:fload           6
		//  494 1177:aload           4
		//  495 1179:iload           17
		//  496 1181:faload          
		//  497 1182:fadd            
		//  498 1183:fstore          11
			f15 = f + af1[j6];
		//  499 1185:fload           5
		//  500 1187:aload           4
		//  501 1189:iload           18
		//  502 1191:faload          
		//  503 1192:fadd            
		//  504 1193:fstore          12
			f2 += f1;
		//  505 1195:fload           7
		//  506 1197:fload           6
		//  507 1199:fadd            
		//  508 1200:fstore          7
			f3 += f;
		//  509 1202:fload           8
		//  510 1204:fload           5
		//  511 1206:fadd            
		//  512 1207:fstore          8
			f = f15;
		//  513 1209:fload           12
		//  514 1211:fstore          5
			f1 = f7;
		//  515 1213:fload           11
		//  516 1215:fstore          6
			break; /* Loop/switch isn't completed */
		//  517 1217:goto            2218
_L11:
			i = c + 5;
		//  518 1220:iload_2         
		//  519 1221:iconst_5        
		//  520 1222:iadd            
		//  521 1223:istore          15
			f2 = af1[i];
		//  522 1225:aload           4
		//  523 1227:iload           15
		//  524 1229:faload          
		//  525 1230:fstore          7
			int l1 = c + 6;
		//  526 1232:iload_2         
		//  527 1233:bipush          6
		//  528 1235:iadd            
		//  529 1236:istore          16
			f3 = af1[l1];
		//  530 1238:aload           4
		//  531 1240:iload           16
		//  532 1242:faload          
		//  533 1243:fstore          8
			f7 = af1[c + 0];
		//  534 1245:aload           4
		//  535 1247:iload_2         
		//  536 1248:iconst_0        
		//  537 1249:iadd            
		//  538 1250:faload          
		//  539 1251:fstore          11
			float f16 = af1[c + 1];
		//  540 1253:aload           4
		//  541 1255:iload_2         
		//  542 1256:iconst_1        
		//  543 1257:iadd            
		//  544 1258:faload          
		//  545 1259:fstore          12
			float f22 = af1[c + 2];
		//  546 1261:aload           4
		//  547 1263:iload_2         
		//  548 1264:iconst_2        
		//  549 1265:iadd            
		//  550 1266:faload          
		//  551 1267:fstore          13
			boolean flag1;
			if(af1[c + 3] != 0.0F)
		//* 552 1269:aload           4
		//* 553 1271:iload_2         
		//* 554 1272:iconst_3        
		//* 555 1273:iadd            
		//* 556 1274:faload          
		//* 557 1275:fconst_0        
		//* 558 1276:fcmpl           
		//* 559 1277:ifeq            1286
				flag1 = true;
		//  560 1280:iconst_1        
		//  561 1281:istore          19
			else
		//* 562 1283:goto            1289
				flag1 = false;
		//  563 1286:iconst_0        
		//  564 1287:istore          19
			boolean flag3;
			if(af1[c + 4] != 0.0F)
		//* 565 1289:aload           4
		//* 566 1291:iload_2         
		//* 567 1292:iconst_4        
		//* 568 1293:iadd            
		//* 569 1294:faload          
		//* 570 1295:fconst_0        
		//* 571 1296:fcmpl           
		//* 572 1297:ifeq            1306
				flag3 = true;
		//  573 1300:iconst_1        
		//  574 1301:istore          20
			else
		//* 575 1303:goto            1309
				flag3 = false;
		//  576 1306:iconst_0        
		//  577 1307:istore          20
			drawArc(path, f1, f, f2 + f1, f3 + f, f7, f16, f22, flag1, flag3);
		//  578 1309:aload_0         
		//  579 1310:fload           6
		//  580 1312:fload           5
		//  581 1314:fload           7
		//  582 1316:fload           6
		//  583 1318:fadd            
		//  584 1319:fload           8
		//  585 1321:fload           5
		//  586 1323:fadd            
		//  587 1324:fload           11
		//  588 1326:fload           12
		//  589 1328:fload           13
		//  590 1330:iload           19
		//  591 1332:iload           20
		//  592 1334:invokestatic    #59  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
			f1 += af1[i];
		//  593 1337:fload           6
		//  594 1339:aload           4
		//  595 1341:iload           15
		//  596 1343:faload          
		//  597 1344:fadd            
		//  598 1345:fstore          6
			f += af1[l1];
		//  599 1347:fload           5
		//  600 1349:aload           4
		//  601 1351:iload           16
		//  602 1353:faload          
		//  603 1354:fadd            
		//  604 1355:fstore          5
			f3 = f;
		//  605 1357:fload           5
		//  606 1359:fstore          8
			f2 = f1;
		//  607 1361:fload           6
		//  608 1363:fstore          7
			path1 = path;
		//  609 1365:aload_0         
		//  610 1366:astore          21
			break; /* Loop/switch isn't completed */
		//  611 1368:goto            2218
_L10:
			i = c + 0;
		//  612 1371:iload_2         
		//  613 1372:iconst_0        
		//  614 1373:iadd            
		//  615 1374:istore          15
			f = af1[i];
		//  616 1376:aload           4
		//  617 1378:iload           15
		//  618 1380:faload          
		//  619 1381:fstore          5
			path1 = path;
		//  620 1383:aload_0         
		//  621 1384:astore          21
			path1.lineTo(f1, f);
		//  622 1386:aload           21
		//  623 1388:fload           6
		//  624 1390:fload           5
		//  625 1392:invokevirtual   #62  <Method void Path.lineTo(float, float)>
			f = af1[i];
		//  626 1395:aload           4
		//  627 1397:iload           15
		//  628 1399:faload          
		//  629 1400:fstore          5
			break; /* Loop/switch isn't completed */
		//  630 1402:goto            2218
_L9:
			float f17;
			int i2;
			f7 = f;
		//  631 1405:fload           5
		//  632 1407:fstore          11
			f17 = f1;
		//  633 1409:fload           6
		//  634 1411:fstore          12
			i2 = ((int) (c));
		//  635 1413:iload_2         
		//  636 1414:istore          16
			if(i == 113 || i == 116 || i == 81) goto _L21; else goto _L20
		//  637 1416:iload           15
		//  638 1418:bipush          113
		//  639 1420:icmpeq          1452
		//  640 1423:iload           15
		//  641 1425:bipush          116
		//  642 1427:icmpeq          1452
		//  643 1430:iload           15
		//  644 1432:bipush          81
		//  645 1434:icmpeq          1452
_L20:
			f1 = f17;
		//  646 1437:fload           12
		//  647 1439:fstore          6
			f = f7;
		//  648 1441:fload           11
		//  649 1443:fstore          5
			if(i != 84) goto _L22; else goto _L21
		//  650 1445:iload           15
		//  651 1447:bipush          84
		//  652 1449:icmpne          1470
_L21:
			f = f7 * 2.0F - f3;
		//  653 1452:fload           11
		//  654 1454:fconst_2        
		//  655 1455:fmul            
		//  656 1456:fload           8
		//  657 1458:fsub            
		//  658 1459:fstore          5
			f1 = f17 * 2.0F - f2;
		//  659 1461:fload           12
		//  660 1463:fconst_2        
		//  661 1464:fmul            
		//  662 1465:fload           7
		//  663 1467:fsub            
		//  664 1468:fstore          6
_L22:
			i = i2 + 0;
		//  665 1470:iload           16
		//  666 1472:iconst_0        
		//  667 1473:iadd            
		//  668 1474:istore          15
			f2 = af1[i];
		//  669 1476:aload           4
		//  670 1478:iload           15
		//  671 1480:faload          
		//  672 1481:fstore          7
			i2++;
		//  673 1483:iload           16
		//  674 1485:iconst_1        
		//  675 1486:iadd            
		//  676 1487:istore          16
			path1.quadTo(f1, f, f2, af1[i2]);
		//  677 1489:aload           21
		//  678 1491:fload           6
		//  679 1493:fload           5
		//  680 1495:fload           7
		//  681 1497:aload           4
		//  682 1499:iload           16
		//  683 1501:faload          
		//  684 1502:invokevirtual   #65  <Method void Path.quadTo(float, float, float, float)>
			float f18 = af1[i];
		//  685 1505:aload           4
		//  686 1507:iload           15
		//  687 1509:faload          
		//  688 1510:fstore          12
			float f8 = af1[i2];
		//  689 1512:aload           4
		//  690 1514:iload           16
		//  691 1516:faload          
		//  692 1517:fstore          11
			f2 = f1;
		//  693 1519:fload           6
		//  694 1521:fstore          7
			f3 = f;
		//  695 1523:fload           5
		//  696 1525:fstore          8
			f = f8;
		//  697 1527:fload           11
		//  698 1529:fstore          5
			f1 = f18;
		//  699 1531:fload           12
		//  700 1533:fstore          6
			break; /* Loop/switch isn't completed */
		//  701 1535:goto            2218
_L8:
			int j2 = ((int) (c));
		//  702 1538:iload_2         
		//  703 1539:istore          16
			if(i != 99 && i != 115 && i != 67 && i != 83)
		//* 704 1541:iload           15
		//* 705 1543:bipush          99
		//* 706 1545:icmpeq          1587
		//* 707 1548:iload           15
		//* 708 1550:bipush          115
		//* 709 1552:icmpeq          1587
		//* 710 1555:iload           15
		//* 711 1557:bipush          67
		//* 712 1559:icmpeq          1587
		//* 713 1562:iload           15
		//* 714 1564:bipush          83
		//* 715 1566:icmpne          1572
		//* 716 1569:goto            1587
			{
				f2 = f;
		//  717 1572:fload           5
		//  718 1574:fstore          7
				f = f1;
		//  719 1576:fload           6
		//  720 1578:fstore          5
				f1 = f2;
		//  721 1580:fload           7
		//  722 1582:fstore          6
			} else
		//* 723 1584:goto            1613
			{
				f = f * 2.0F - f3;
		//  724 1587:fload           5
		//  725 1589:fconst_2        
		//  726 1590:fmul            
		//  727 1591:fload           8
		//  728 1593:fsub            
		//  729 1594:fstore          5
				f2 = f1 * 2.0F - f2;
		//  730 1596:fload           6
		//  731 1598:fconst_2        
		//  732 1599:fmul            
		//  733 1600:fload           7
		//  734 1602:fsub            
		//  735 1603:fstore          7
				f1 = f;
		//  736 1605:fload           5
		//  737 1607:fstore          6
				f = f2;
		//  738 1609:fload           7
		//  739 1611:fstore          5
			}
			i = j2 + 0;
		//  740 1613:iload           16
		//  741 1615:iconst_0        
		//  742 1616:iadd            
		//  743 1617:istore          15
			f2 = af1[i];
		//  744 1619:aload           4
		//  745 1621:iload           15
		//  746 1623:faload          
		//  747 1624:fstore          7
			int k4 = j2 + 1;
		//  748 1626:iload           16
		//  749 1628:iconst_1        
		//  750 1629:iadd            
		//  751 1630:istore          17
			f3 = af1[k4];
		//  752 1632:aload           4
		//  753 1634:iload           17
		//  754 1636:faload          
		//  755 1637:fstore          8
			int k6 = j2 + 2;
		//  756 1639:iload           16
		//  757 1641:iconst_2        
		//  758 1642:iadd            
		//  759 1643:istore          18
			float f9 = af1[k6];
		//  760 1645:aload           4
		//  761 1647:iload           18
		//  762 1649:faload          
		//  763 1650:fstore          11
			j2 += 3;
		//  764 1652:iload           16
		//  765 1654:iconst_3        
		//  766 1655:iadd            
		//  767 1656:istore          16
			path.cubicTo(f, f1, f2, f3, f9, af1[j2]);
		//  768 1658:aload_0         
		//  769 1659:fload           5
		//  770 1661:fload           6
		//  771 1663:fload           7
		//  772 1665:fload           8
		//  773 1667:fload           11
		//  774 1669:aload           4
		//  775 1671:iload           16
		//  776 1673:faload          
		//  777 1674:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
			f2 = af1[i];
		//  778 1677:aload           4
		//  779 1679:iload           15
		//  780 1681:faload          
		//  781 1682:fstore          7
			f3 = af1[k4];
		//  782 1684:aload           4
		//  783 1686:iload           17
		//  784 1688:faload          
		//  785 1689:fstore          8
			f1 = af1[k6];
		//  786 1691:aload           4
		//  787 1693:iload           18
		//  788 1695:faload          
		//  789 1696:fstore          6
			f = af1[j2];
		//  790 1698:aload           4
		//  791 1700:iload           16
		//  792 1702:faload          
		//  793 1703:fstore          5
			break; /* Loop/switch isn't completed */
		//  794 1705:goto            2218
_L7:
			i = ((int) (c));
		//  795 1708:iload_2         
		//  796 1709:istore          15
			int k2 = i + 0;
		//  797 1711:iload           15
		//  798 1713:iconst_0        
		//  799 1714:iadd            
		//  800 1715:istore          16
			f = af1[k2];
		//  801 1717:aload           4
		//  802 1719:iload           16
		//  803 1721:faload          
		//  804 1722:fstore          5
			int l4 = i + 1;
		//  805 1724:iload           15
		//  806 1726:iconst_1        
		//  807 1727:iadd            
		//  808 1728:istore          17
			f1 = af1[l4];
		//  809 1730:aload           4
		//  810 1732:iload           17
		//  811 1734:faload          
		//  812 1735:fstore          6
			int l6 = i + 2;
		//  813 1737:iload           15
		//  814 1739:iconst_2        
		//  815 1740:iadd            
		//  816 1741:istore          18
			f2 = af1[l6];
		//  817 1743:aload           4
		//  818 1745:iload           18
		//  819 1747:faload          
		//  820 1748:fstore          7
			i += 3;
		//  821 1750:iload           15
		//  822 1752:iconst_3        
		//  823 1753:iadd            
		//  824 1754:istore          15
			path1.quadTo(f, f1, f2, af1[i]);
		//  825 1756:aload           21
		//  826 1758:fload           5
		//  827 1760:fload           6
		//  828 1762:fload           7
		//  829 1764:aload           4
		//  830 1766:iload           15
		//  831 1768:faload          
		//  832 1769:invokevirtual   #65  <Method void Path.quadTo(float, float, float, float)>
			f2 = af1[k2];
		//  833 1772:aload           4
		//  834 1774:iload           16
		//  835 1776:faload          
		//  836 1777:fstore          7
			f3 = af1[l4];
		//  837 1779:aload           4
		//  838 1781:iload           17
		//  839 1783:faload          
		//  840 1784:fstore          8
			f1 = af1[l6];
		//  841 1786:aload           4
		//  842 1788:iload           18
		//  843 1790:faload          
		//  844 1791:fstore          6
			f = af1[i];
		//  845 1793:aload           4
		//  846 1795:iload           15
		//  847 1797:faload          
		//  848 1798:fstore          5
			break; /* Loop/switch isn't completed */
		//  849 1800:goto            2218
_L6:
			i = ((int) (c));
		//  850 1803:iload_2         
		//  851 1804:istore          15
			int l2 = i + 0;
		//  852 1806:iload           15
		//  853 1808:iconst_0        
		//  854 1809:iadd            
		//  855 1810:istore          16
			f1 = af1[l2];
		//  856 1812:aload           4
		//  857 1814:iload           16
		//  858 1816:faload          
		//  859 1817:fstore          6
			int i5 = i + 1;
		//  860 1819:iload           15
		//  861 1821:iconst_1        
		//  862 1822:iadd            
		//  863 1823:istore          17
			f = af1[i5];
		//  864 1825:aload           4
		//  865 1827:iload           17
		//  866 1829:faload          
		//  867 1830:fstore          5
			if(i > 0)
		//* 868 1832:iload           15
		//* 869 1834:ifle            1855
			{
				path1.lineTo(af1[l2], af1[i5]);
		//  870 1837:aload           21
		//  871 1839:aload           4
		//  872 1841:iload           16
		//  873 1843:faload          
		//  874 1844:aload           4
		//  875 1846:iload           17
		//  876 1848:faload          
		//  877 1849:invokevirtual   #62  <Method void Path.lineTo(float, float)>
			} else
		//* 878 1852:goto            2218
			{
				path1.moveTo(af1[l2], af1[i5]);
		//  879 1855:aload           21
		//  880 1857:aload           4
		//  881 1859:iload           16
		//  882 1861:faload          
		//  883 1862:aload           4
		//  884 1864:iload           17
		//  885 1866:faload          
		//  886 1867:invokevirtual   #41  <Method void Path.moveTo(float, float)>
				f5 = f;
		//  887 1870:fload           5
		//  888 1872:fstore          10
				f4 = f1;
		//  889 1874:fload           6
		//  890 1876:fstore          9
			}
			break; /* Loop/switch isn't completed */
		//  891 1878:goto            2218
_L5:
			i = ((int) (c));
		//  892 1881:iload_2         
		//  893 1882:istore          15
			int i3 = i + 0;
		//  894 1884:iload           15
		//  895 1886:iconst_0        
		//  896 1887:iadd            
		//  897 1888:istore          16
			f = af1[i3];
		//  898 1890:aload           4
		//  899 1892:iload           16
		//  900 1894:faload          
		//  901 1895:fstore          5
			i++;
		//  902 1897:iload           15
		//  903 1899:iconst_1        
		//  904 1900:iadd            
		//  905 1901:istore          15
			path1.lineTo(f, af1[i]);
		//  906 1903:aload           21
		//  907 1905:fload           5
		//  908 1907:aload           4
		//  909 1909:iload           15
		//  910 1911:faload          
		//  911 1912:invokevirtual   #62  <Method void Path.lineTo(float, float)>
			f1 = af1[i3];
		//  912 1915:aload           4
		//  913 1917:iload           16
		//  914 1919:faload          
		//  915 1920:fstore          6
			f = af1[i];
		//  916 1922:aload           4
		//  917 1924:iload           15
		//  918 1926:faload          
		//  919 1927:fstore          5
			break; /* Loop/switch isn't completed */
		//  920 1929:goto            2218
_L4:
			i = c + 0;
		//  921 1932:iload_2         
		//  922 1933:iconst_0        
		//  923 1934:iadd            
		//  924 1935:istore          15
			path1.lineTo(af1[i], f);
		//  925 1937:aload           21
		//  926 1939:aload           4
		//  927 1941:iload           15
		//  928 1943:faload          
		//  929 1944:fload           5
		//  930 1946:invokevirtual   #62  <Method void Path.lineTo(float, float)>
			f1 = af1[i];
		//  931 1949:aload           4
		//  932 1951:iload           15
		//  933 1953:faload          
		//  934 1954:fstore          6
			break; /* Loop/switch isn't completed */
		//  935 1956:goto            2218
_L3:
			i = ((int) (c));
		//  936 1959:iload_2         
		//  937 1960:istore          15
			f = af1[i + 0];
		//  938 1962:aload           4
		//  939 1964:iload           15
		//  940 1966:iconst_0        
		//  941 1967:iadd            
		//  942 1968:faload          
		//  943 1969:fstore          5
			f1 = af1[i + 1];
		//  944 1971:aload           4
		//  945 1973:iload           15
		//  946 1975:iconst_1        
		//  947 1976:iadd            
		//  948 1977:faload          
		//  949 1978:fstore          6
			int j3 = i + 2;
		//  950 1980:iload           15
		//  951 1982:iconst_2        
		//  952 1983:iadd            
		//  953 1984:istore          16
			f2 = af1[j3];
		//  954 1986:aload           4
		//  955 1988:iload           16
		//  956 1990:faload          
		//  957 1991:fstore          7
			int j5 = i + 3;
		//  958 1993:iload           15
		//  959 1995:iconst_3        
		//  960 1996:iadd            
		//  961 1997:istore          17
			f3 = af1[j5];
		//  962 1999:aload           4
		//  963 2001:iload           17
		//  964 2003:faload          
		//  965 2004:fstore          8
			int i7 = i + 4;
		//  966 2006:iload           15
		//  967 2008:iconst_4        
		//  968 2009:iadd            
		//  969 2010:istore          18
			float f10 = af1[i7];
		//  970 2012:aload           4
		//  971 2014:iload           18
		//  972 2016:faload          
		//  973 2017:fstore          11
			i += 5;
		//  974 2019:iload           15
		//  975 2021:iconst_5        
		//  976 2022:iadd            
		//  977 2023:istore          15
			path.cubicTo(f, f1, f2, f3, f10, af1[i]);
		//  978 2025:aload_0         
		//  979 2026:fload           5
		//  980 2028:fload           6
		//  981 2030:fload           7
		//  982 2032:fload           8
		//  983 2034:fload           11
		//  984 2036:aload           4
		//  985 2038:iload           15
		//  986 2040:faload          
		//  987 2041:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
			f1 = af1[i7];
		//  988 2044:aload           4
		//  989 2046:iload           18
		//  990 2048:faload          
		//  991 2049:fstore          6
			f = af1[i];
		//  992 2051:aload           4
		//  993 2053:iload           15
		//  994 2055:faload          
		//  995 2056:fstore          5
			f2 = af1[j3];
		//  996 2058:aload           4
		//  997 2060:iload           16
		//  998 2062:faload          
		//  999 2063:fstore          7
			f3 = af1[j5];
		// 1000 2065:aload           4
		// 1001 2067:iload           17
		// 1002 2069:faload          
		// 1003 2070:fstore          8
			break; /* Loop/switch isn't completed */
		// 1004 2072:goto            2218
_L2:
			i = ((int) (c));
		// 1005 2075:iload_2         
		// 1006 2076:istore          15
			int k3 = i + 5;
		// 1007 2078:iload           15
		// 1008 2080:iconst_5        
		// 1009 2081:iadd            
		// 1010 2082:istore          16
			f2 = af1[k3];
		// 1011 2084:aload           4
		// 1012 2086:iload           16
		// 1013 2088:faload          
		// 1014 2089:fstore          7
			int k5 = i + 6;
		// 1015 2091:iload           15
		// 1016 2093:bipush          6
		// 1017 2095:iadd            
		// 1018 2096:istore          17
			f3 = af1[k5];
		// 1019 2098:aload           4
		// 1020 2100:iload           17
		// 1021 2102:faload          
		// 1022 2103:fstore          8
			float f11 = af1[i + 0];
		// 1023 2105:aload           4
		// 1024 2107:iload           15
		// 1025 2109:iconst_0        
		// 1026 2110:iadd            
		// 1027 2111:faload          
		// 1028 2112:fstore          11
			float f19 = af1[i + 1];
		// 1029 2114:aload           4
		// 1030 2116:iload           15
		// 1031 2118:iconst_1        
		// 1032 2119:iadd            
		// 1033 2120:faload          
		// 1034 2121:fstore          12
			float f23 = af1[i + 2];
		// 1035 2123:aload           4
		// 1036 2125:iload           15
		// 1037 2127:iconst_2        
		// 1038 2128:iadd            
		// 1039 2129:faload          
		// 1040 2130:fstore          13
			boolean flag2;
			if(af1[i + 3] != 0.0F)
		//*1041 2132:aload           4
		//*1042 2134:iload           15
		//*1043 2136:iconst_3        
		//*1044 2137:iadd            
		//*1045 2138:faload          
		//*1046 2139:fconst_0        
		//*1047 2140:fcmpl           
		//*1048 2141:ifeq            2150
				flag2 = true;
		// 1049 2144:iconst_1        
		// 1050 2145:istore          19
			else
		//*1051 2147:goto            2153
				flag2 = false;
		// 1052 2150:iconst_0        
		// 1053 2151:istore          19
			boolean flag4;
			if(af1[i + 4] != 0.0F)
		//*1054 2153:aload           4
		//*1055 2155:iload           15
		//*1056 2157:iconst_4        
		//*1057 2158:iadd            
		//*1058 2159:faload          
		//*1059 2160:fconst_0        
		//*1060 2161:fcmpl           
		//*1061 2162:ifeq            2171
				flag4 = true;
		// 1062 2165:iconst_1        
		// 1063 2166:istore          20
			else
		//*1064 2168:goto            2174
				flag4 = false;
		// 1065 2171:iconst_0        
		// 1066 2172:istore          20
			drawArc(path, f1, f, f2, f3, f11, f19, f23, flag2, flag4);
		// 1067 2174:aload_0         
		// 1068 2175:fload           6
		// 1069 2177:fload           5
		// 1070 2179:fload           7
		// 1071 2181:fload           8
		// 1072 2183:fload           11
		// 1073 2185:fload           12
		// 1074 2187:fload           13
		// 1075 2189:iload           19
		// 1076 2191:iload           20
		// 1077 2193:invokestatic    #59  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
			f1 = af1[k3];
		// 1078 2196:aload           4
		// 1079 2198:iload           16
		// 1080 2200:faload          
		// 1081 2201:fstore          6
			f = af1[k5];
		// 1082 2203:aload           4
		// 1083 2205:iload           17
		// 1084 2207:faload          
		// 1085 2208:fstore          5
			f3 = f;
		// 1086 2210:fload           5
		// 1087 2212:fstore          8
			f2 = f1;
		// 1088 2214:fload           6
		// 1089 2216:fstore          7
			c += ((char) (byte0));
		// 1090 2218:iload_2         
		// 1091 2219:iload           14
		// 1092 2221:iadd            
		// 1093 2222:istore_2        
			i = ((int) (c1));
		// 1094 2223:iload_3         
		// 1095 2224:istore          15
			if(true) goto _L24; else goto _L23
		// 1096 2226:goto            307
_L23:
			af[0] = f1;
		// 1097 2229:aload_1         
		// 1098 2230:iconst_0        
		// 1099 2231:fload           6
		// 1100 2233:fastore         
			af[1] = f;
		// 1101 2234:aload_1         
		// 1102 2235:iconst_1        
		// 1103 2236:fload           5
		// 1104 2238:fastore         
			af[2] = f2;
		// 1105 2239:aload_1         
		// 1106 2240:iconst_2        
		// 1107 2241:fload           7
		// 1108 2243:fastore         
			af[3] = f3;
		// 1109 2244:aload_1         
		// 1110 2245:iconst_3        
		// 1111 2246:fload           8
		// 1112 2248:fastore         
			af[4] = f4;
		// 1113 2249:aload_1         
		// 1114 2250:iconst_4        
		// 1115 2251:fload           9
		// 1116 2253:fastore         
			af[5] = f5;
		// 1117 2254:aload_1         
		// 1118 2255:iconst_5        
		// 1119 2256:fload           10
		// 1120 2258:fastore         
			return;
		// 1121 2259:return          
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
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore          4
			do
			{
				float af[] = pathdatanode.mParams;
		//    2    3:aload_1         
		//    3    4:getfield        #24  <Field float[] mParams>
		//    4    7:astore          5
				if(i < af.length)
		//*   5    9:iload           4
		//*   6   11:aload           5
		//*   7   13:arraylength     
		//*   8   14:icmpge          52
				{
					mParams[i] = af[i] * (1.0F - f) + pathdatanode1.mParams[i] * f;
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
			pathdatanode = ((PathDataNode) (pathdatanode.mParams));
		//    6   12:aload_1         
		//    7   13:getfield        #24  <Field float[] mParams>
		//    8   16:astore_1        
			mParams = PathParser.copyOfRange(((float []) (pathdatanode)), 0, pathdatanode.length);
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


	private static void addNode(ArrayList arraylist, char c, float af[])
	{
		arraylist.add(((Object) (new PathDataNode(c, af))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class PathParser$PathDataNode>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #20  <Method void PathParser$PathDataNode(char, float[])>
	//    6   10:invokevirtual   #26  <Method boolean ArrayList.add(Object)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static boolean canMorph(PathDataNode apathdatanode[], PathDataNode apathdatanode1[])
	{
		if(apathdatanode != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          72
		{
			if(apathdatanode1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
				return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
			if(apathdatanode.length != apathdatanode1.length)
	//*   6   10:aload_0         
	//*   7   11:arraylength     
	//*   8   12:aload_1         
	//*   9   13:arraylength     
	//*  10   14:icmpeq          19
				return false;
	//   11   17:iconst_0        
	//   12   18:ireturn         
			for(int i = 0; i < apathdatanode.length;)
	//*  13   19:iconst_0        
	//*  14   20:istore_2        
	//*  15   21:iload_2         
	//*  16   22:aload_0         
	//*  17   23:arraylength     
	//*  18   24:icmpge          70
				if(apathdatanode[i].mType == apathdatanode1[i].mType)
	//*  19   27:aload_0         
	//*  20   28:iload_2         
	//*  21   29:aaload          
	//*  22   30:getfield        #35  <Field char PathParser$PathDataNode.mType>
	//*  23   33:aload_1         
	//*  24   34:iload_2         
	//*  25   35:aaload          
	//*  26   36:getfield        #35  <Field char PathParser$PathDataNode.mType>
	//*  27   39:icmpne          68
				{
					if(apathdatanode[i].mParams.length != apathdatanode1[i].mParams.length)
	//*  28   42:aload_0         
	//*  29   43:iload_2         
	//*  30   44:aaload          
	//*  31   45:getfield        #39  <Field float[] PathParser$PathDataNode.mParams>
	//*  32   48:arraylength     
	//*  33   49:aload_1         
	//*  34   50:iload_2         
	//*  35   51:aaload          
	//*  36   52:getfield        #39  <Field float[] PathParser$PathDataNode.mParams>
	//*  37   55:arraylength     
	//*  38   56:icmpeq          61
						return false;
	//   39   59:iconst_0        
	//   40   60:ireturn         
					i++;
	//   41   61:iload_2         
	//   42   62:iconst_1        
	//   43   63:iadd            
	//   44   64:istore_2        
				} else
	//*  45   65:goto            21
				{
					return false;
	//   46   68:iconst_0        
	//   47   69:ireturn         
				}

			return true;
	//   48   70:iconst_1        
	//   49   71:ireturn         
		} else
		{
			return false;
	//   50   72:iconst_0        
	//   51   73:ireturn         
		}
	}

	static float[] copyOfRange(float af[], int i, int j)
	{
		if(i <= j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpgt          54
		{
			int k = af.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_3        
			if(i >= 0 && i <= k)
	//*   6    8:iload_1         
	//*   7    9:iflt            46
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpgt          46
			{
				j -= i;
	//   11   17:iload_2         
	//   12   18:iload_1         
	//   13   19:isub            
	//   14   20:istore_2        
				k = Math.min(j, k - i);
	//   15   21:iload_2         
	//   16   22:iload_3         
	//   17   23:iload_1         
	//   18   24:isub            
	//   19   25:invokestatic    #47  <Method int Math.min(int, int)>
	//   20   28:istore_3        
				float af1[] = new float[j];
	//   21   29:iload_2         
	//   22   30:newarray        float[]
	//   23   32:astore          4
				System.arraycopy(((Object) (af)), i, ((Object) (af1)), 0, k);
	//   24   34:aload_0         
	//   25   35:iload_1         
	//   26   36:aload           4
	//   27   38:iconst_0        
	//   28   39:iload_3         
	//   29   40:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
				return af1;
	//   30   43:aload           4
	//   31   45:areturn         
			} else
			{
				throw new ArrayIndexOutOfBoundsException();
	//   32   46:new             #55  <Class ArrayIndexOutOfBoundsException>
	//   33   49:dup             
	//   34   50:invokespecial   #58  <Method void ArrayIndexOutOfBoundsException()>
	//   35   53:athrow          
			}
		} else
		{
			throw new IllegalArgumentException();
	//   36   54:new             #60  <Class IllegalArgumentException>
	//   37   57:dup             
	//   38   58:invokespecial   #61  <Method void IllegalArgumentException()>
	//   39   61:athrow          
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
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #22  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #64  <Method void ArrayList()>
	//    7   13:astore_3        
		int j = 1;
	//    8   14:iconst_1        
	//    9   15:istore_2        
		int i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_1        
		for(; j < s.length(); j++)
	//*  12   18:iload_2         
	//*  13   19:aload_0         
	//*  14   20:invokevirtual   #70  <Method int String.length()>
	//*  15   23:icmpge          79
		{
			j = nextStart(s, j);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:invokestatic    #74  <Method int nextStart(String, int)>
	//   19   31:istore_2        
			String s1 = s.substring(i, j).trim();
	//   20   32:aload_0         
	//   21   33:iload_1         
	//   22   34:iload_2         
	//   23   35:invokevirtual   #78  <Method String String.substring(int, int)>
	//   24   38:invokevirtual   #82  <Method String String.trim()>
	//   25   41:astore          4
			if(s1.length() > 0)
	//*  26   43:aload           4
	//*  27   45:invokevirtual   #70  <Method int String.length()>
	//*  28   48:ifle            70
			{
				float af[] = getFloats(s1);
	//   29   51:aload           4
	//   30   53:invokestatic    #86  <Method float[] getFloats(String)>
	//   31   56:astore          5
				addNode(arraylist, s1.charAt(0), af);
	//   32   58:aload_3         
	//   33   59:aload           4
	//   34   61:iconst_0        
	//   35   62:invokevirtual   #90  <Method char String.charAt(int)>
	//   36   65:aload           5
	//   37   67:invokestatic    #92  <Method void addNode(ArrayList, char, float[])>
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
	//*  52   88:invokevirtual   #70  <Method int String.length()>
	//*  53   91:icmpge          106
			addNode(arraylist, s.charAt(i), new float[0]);
	//   54   94:aload_3         
	//   55   95:aload_0         
	//   56   96:iload_1         
	//   57   97:invokevirtual   #90  <Method char String.charAt(int)>
	//   58  100:iconst_0        
	//   59  101:newarray        float[]
	//   60  103:invokestatic    #92  <Method void addNode(ArrayList, char, float[])>
		return (PathDataNode[])arraylist.toArray(((Object []) (new PathDataNode[arraylist.size()])));
	//   61  106:aload_3         
	//   62  107:aload_3         
	//   63  108:invokevirtual   #95  <Method int ArrayList.size()>
	//   64  111:anewarray       PathDataNode[]
	//   65  114:invokevirtual   #99  <Method Object[] ArrayList.toArray(Object[])>
	//   66  117:checkcast       #101 <Class PathParser$PathDataNode[]>
	//   67  120:areturn         
	}

	public static Path createPathFromPathData(String s)
	{
		Path path = new Path();
	//    0    0:new             #107 <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void Path()>
	//    3    7:astore_1        
		PathDataNode apathdatanode[] = createNodesFromPathData(s);
	//    4    8:aload_0         
	//    5    9:invokestatic    #110 <Method PathParser$PathDataNode[] createNodesFromPathData(String)>
	//    6   12:astore_2        
		if(apathdatanode != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          59
		{
			try
			{
				PathDataNode.nodesToPath(apathdatanode, path);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokestatic    #114 <Method void PathParser$PathDataNode.nodesToPath(PathParser$PathDataNode[], Path)>
			}
	//*  12   22:aload_1         
	//*  13   23:areturn         
			catch(RuntimeException runtimeexception)
	//*  14   24:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   15   25:new             #116 <Class StringBuilder>
	//   16   28:dup             
	//   17   29:invokespecial   #117 <Method void StringBuilder()>
	//   18   32:astore_2        
				stringbuilder.append("Error in parsing ");
	//   19   33:aload_2         
	//   20   34:ldc1            #119 <String "Error in parsing ">
	//   21   36:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
				stringbuilder.append(s);
	//   23   40:aload_2         
	//   24   41:aload_0         
	//   25   42:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   26   45:pop             
				throw new RuntimeException(stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   27   46:new             #105 <Class RuntimeException>
	//   28   49:dup             
	//   29   50:aload_2         
	//   30   51:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   31   54:aload_1         
	//   32   55:invokespecial   #129 <Method void RuntimeException(String, Throwable)>
	//   33   58:athrow          
			}
			return path;
		} else
		{
			return null;
	//   34   59:aconst_null     
	//   35   60:areturn         
		}
	}

	public static PathDataNode[] deepCopyNodes(PathDataNode apathdatanode[])
	{
		if(apathdatanode == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		PathDataNode apathdatanode1[] = new PathDataNode[apathdatanode.length];
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:anewarray       PathDataNode[]
	//    7   11:astore_2        
		for(int i = 0; i < apathdatanode.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:aload_0         
	//*  12   16:arraylength     
	//*  13   17:icmpge          40
			apathdatanode1[i] = new PathDataNode(apathdatanode[i]);
	//   14   20:aload_2         
	//   15   21:iload_1         
	//   16   22:new             #9   <Class PathParser$PathDataNode>
	//   17   25:dup             
	//   18   26:aload_0         
	//   19   27:iload_1         
	//   20   28:aaload          
	//   21   29:invokespecial   #134 <Method void PathParser$PathDataNode(PathParser$PathDataNode)>
	//   22   32:aastore         

	//   23   33:iload_1         
	//   24   34:iconst_1        
	//   25   35:iadd            
	//   26   36:istore_1        
	//*  27   37:goto            14
		return apathdatanode1;
	//   28   40:aload_2         
	//   29   41:areturn         
	}

	private static void extract(String s, int i, ExtractFloatResult extractfloatresult)
	{
		boolean flag;
		boolean flag1;
		int j;
		boolean flag2;
		extractfloatresult.mEndWithNegOrDot = false;
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:putfield        #140 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
		j = i;
	//    3    5:iload_1         
	//    4    6:istore          5
		flag = false;
	//    5    8:iconst_0        
	//    6    9:istore_3        
		flag2 = false;
	//    7   10:iconst_0        
	//    8   11:istore          6
		flag1 = false;
	//    9   13:iconst_0        
	//   10   14:istore          4
_L9:
		char c;
		if(j >= s.length())
			break; /* Loop/switch isn't completed */
	//   11   16:iload           5
	//   12   18:aload_0         
	//   13   19:invokevirtual   #70  <Method int String.length()>
	//   14   22:icmpge          168
		c = s.charAt(j);
	//   15   25:aload_0         
	//   16   26:iload           5
	//   17   28:invokevirtual   #90  <Method char String.charAt(int)>
	//   18   31:istore          7
		if(c == ' ') goto _L2; else goto _L1
	//   19   33:iload           7
	//   20   35:bipush          32
	//   21   37:icmpeq          146
_L1:
		if(c == 'E' || c == 'e') goto _L4; else goto _L3
	//   22   40:iload           7
	//   23   42:bipush          69
	//   24   44:icmpeq          141
	//   25   47:iload           7
	//   26   49:bipush          101
	//   27   51:icmpeq          141
_L3:
		c;
	//   28   54:iload           7
		JVM INSTR tableswitch 44 46: default 84
	//	               44 146
	//	               45 113
	//	               46 87;
	//   29   56:tableswitch     44 46: default 84
	//	               44 146
	//	               45 113
	//	               46 87
		   goto _L5 _L2 _L6 _L7
	//*  30   84:goto            136
_L7:
		if(!flag2)
	//*  31   87:iload           6
	//*  32   89:ifne            100
		{
			flag = false;
	//   33   92:iconst_0        
	//   34   93:istore_3        
			flag2 = true;
	//   35   94:iconst_1        
	//   36   95:istore          6
		} else
	//*  37   97:goto            151
		{
			extractfloatresult.mEndWithNegOrDot = true;
	//   38  100:aload_2         
	//   39  101:iconst_1        
	//   40  102:putfield        #140 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
			flag = false;
	//   41  105:iconst_0        
	//   42  106:istore_3        
			flag1 = true;
	//   43  107:iconst_1        
	//   44  108:istore          4
		}
		break; /* Loop/switch isn't completed */
	//   45  110:goto            151
_L6:
		if(j != i && !flag)
	//*  46  113:iload           5
	//*  47  115:iload_1         
	//*  48  116:icmpeq          136
	//*  49  119:iload_3         
	//*  50  120:ifne            136
		{
			extractfloatresult.mEndWithNegOrDot = true;
	//   51  123:aload_2         
	//   52  124:iconst_1        
	//   53  125:putfield        #140 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
			flag = false;
	//   54  128:iconst_0        
	//   55  129:istore_3        
			flag1 = true;
	//   56  130:iconst_1        
	//   57  131:istore          4
			break; /* Loop/switch isn't completed */
	//   58  133:goto            151
		}
_L5:
		flag = false;
	//   59  136:iconst_0        
	//   60  137:istore_3        
		break; /* Loop/switch isn't completed */
	//   61  138:goto            151
_L4:
		flag = true;
	//   62  141:iconst_1        
	//   63  142:istore_3        
		break; /* Loop/switch isn't completed */
	//   64  143:goto            151
_L2:
		flag = false;
	//   65  146:iconst_0        
	//   66  147:istore_3        
		flag1 = true;
	//   67  148:iconst_1        
	//   68  149:istore          4
		if(flag1)
	//*  69  151:iload           4
	//*  70  153:ifeq            159
			break; /* Loop/switch isn't completed */
	//   71  156:goto            168
		j++;
	//   72  159:iload           5
	//   73  161:iconst_1        
	//   74  162:iadd            
	//   75  163:istore          5
		if(true) goto _L9; else goto _L8
	//   76  165:goto            16
_L8:
		extractfloatresult.mEndPosition = j;
	//   77  168:aload_2         
	//   78  169:iload           5
	//   79  171:putfield        #144 <Field int PathParser$ExtractFloatResult.mEndPosition>
		return;
	//   80  174:return          
	}

	private static float[] getFloats(String s)
	{
		if(s.charAt(0) != 'z' && s.charAt(0) != 'Z') goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #90  <Method char String.charAt(int)>
	//    3    5:bipush          122
	//    4    7:icmpeq          173
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #90  <Method char String.charAt(int)>
	//    8   15:bipush          90
	//    9   17:icmpne          23
	//*  10   20:goto            173
_L2:
		int i;
		int j;
		int k;
		int l;
		int i1;
		float af[];
		ExtractFloatResult extractfloatresult;
		try
		{
			af = new float[s.length()];
	//   11   23:aload_0         
	//   12   24:invokevirtual   #70  <Method int String.length()>
	//   13   27:newarray        float[]
	//   14   29:astore          6
			extractfloatresult = new ExtractFloatResult();
	//   15   31:new             #6   <Class PathParser$ExtractFloatResult>
	//   16   34:dup             
	//   17   35:invokespecial   #147 <Method void PathParser$ExtractFloatResult()>
	//   18   38:astore          7
			i1 = s.length();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #70  <Method int String.length()>
	//   21   44:istore          5
		}
	//*  22   46:iconst_1        
	//*  23   47:istore_1        
	//*  24   48:iconst_0        
	//*  25   49:istore_3        
	//*  26   50:iload_1         
	//*  27   51:iload           5
	//*  28   53:icmpge          112
	//*  29   56:aload_0         
	//*  30   57:iload_1         
	//*  31   58:aload           7
	//*  32   60:invokestatic    #149 <Method void extract(String, int, PathParser$ExtractFloatResult)>
	//*  33   63:aload           7
	//*  34   65:getfield        #144 <Field int PathParser$ExtractFloatResult.mEndPosition>
	//*  35   68:istore          4
	//*  36   70:iload_3         
	//*  37   71:istore_2        
	//*  38   72:iload_1         
	//*  39   73:iload           4
	//*  40   75:icmpge          96
	//*  41   78:aload           6
	//*  42   80:iload_3         
	//*  43   81:aload_0         
	//*  44   82:iload_1         
	//*  45   83:iload           4
	//*  46   85:invokevirtual   #78  <Method String String.substring(int, int)>
	//*  47   88:invokestatic    #155 <Method float Float.parseFloat(String)>
	//*  48   91:fastore         
	//*  49   92:iload_3         
	//*  50   93:iconst_1        
	//*  51   94:iadd            
	//*  52   95:istore_2        
	//*  53   96:aload           7
	//*  54   98:getfield        #140 <Field boolean PathParser$ExtractFloatResult.mEndWithNegOrDot>
	//*  55  101:ifeq            177
	//*  56  104:iload           4
	//*  57  106:istore_1        
	//*  58  107:iload_2         
	//*  59  108:istore_3        
	//*  60  109:goto            50
	//*  61  112:aload           6
	//*  62  114:iconst_0        
	//*  63  115:iload_3         
	//*  64  116:invokestatic    #157 <Method float[] copyOfRange(float[], int, int)>
	//*  65  119:astore          6
	//*  66  121:aload           6
	//*  67  123:areturn         
		catch(NumberFormatException numberformatexception)
	//*  68  124:astore          6
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   69  126:new             #116 <Class StringBuilder>
	//   70  129:dup             
	//   71  130:invokespecial   #117 <Method void StringBuilder()>
	//   72  133:astore          7
			stringbuilder.append("error in parsing \"");
	//   73  135:aload           7
	//   74  137:ldc1            #159 <String "error in parsing \"">
	//   75  139:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   76  142:pop             
			stringbuilder.append(s);
	//   77  143:aload           7
	//   78  145:aload_0         
	//   79  146:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   80  149:pop             
			stringbuilder.append("\"");
	//   81  150:aload           7
	//   82  152:ldc1            #161 <String "\"">
	//   83  154:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   84  157:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (numberformatexception)));
	//   85  158:new             #105 <Class RuntimeException>
	//   86  161:dup             
	//   87  162:aload           7
	//   88  164:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   89  167:aload           6
	//   90  169:invokespecial   #129 <Method void RuntimeException(String, Throwable)>
	//   91  172:athrow          
		}
		i = 1;
		k = 0;
_L5:
		if(i >= i1) goto _L4; else goto _L3
_L3:
		extract(s, i, extractfloatresult);
		l = extractfloatresult.mEndPosition;
		j = k;
		if(i >= l)
			break MISSING_BLOCK_LABEL_96;
		af[k] = Float.parseFloat(s.substring(i, l));
		j = k + 1;
		if(extractfloatresult.mEndWithNegOrDot)
		{
			i = l;
			k = j;
		} else
	//*  92  173:iconst_0        
	//*  93  174:newarray        float[]
	//*  94  176:areturn         
		{
			i = l + 1;
	//   95  177:iload           4
	//   96  179:iconst_1        
	//   97  180:iadd            
	//   98  181:istore_1        
			k = j;
	//   99  182:iload_2         
	//  100  183:istore_3        
		}
		if(true) goto _L5; else goto _L4
	//  101  184:goto            50
_L4:
		af = copyOfRange(af, 0, k);
		return af;
_L1:
		return new float[0];
	}

	private static int nextStart(String s, int i)
	{
		for(; i < s.length(); i++)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #70  <Method int String.length()>
	//*   3    5:icmpge          59
		{
			char c = s.charAt(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #90  <Method char String.charAt(int)>
	//    7   13:istore_2        
			if(((c - 65) * (c - 90) <= 0 || (c - 97) * (c - 122) <= 0) && c != 'e' && c != 'E')
	//*   8   14:iload_2         
	//*   9   15:bipush          65
	//*  10   17:isub            
	//*  11   18:iload_2         
	//*  12   19:bipush          90
	//*  13   21:isub            
	//*  14   22:imul            
	//*  15   23:ifle            38
	//*  16   26:iload_2         
	//*  17   27:bipush          97
	//*  18   29:isub            
	//*  19   30:iload_2         
	//*  20   31:bipush          122
	//*  21   33:isub            
	//*  22   34:imul            
	//*  23   35:ifgt            52
	//*  24   38:iload_2         
	//*  25   39:bipush          101
	//*  26   41:icmpeq          52
	//*  27   44:iload_2         
	//*  28   45:bipush          69
	//*  29   47:icmpeq          52
				return i;
	//   30   50:iload_1         
	//   31   51:ireturn         
		}

	//   32   52:iload_1         
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:istore_1        
	//*  36   56:goto            0
		return i;
	//   37   59:iload_1         
	//   38   60:ireturn         
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
	//   12   14:getfield        #35  <Field char PathParser$PathDataNode.mType>
	//   13   17:putfield        #35  <Field char PathParser$PathDataNode.mType>
			for(int j = 0; j < apathdatanode1[i].mParams.length; j++)
	//*  14   20:iconst_0        
	//*  15   21:istore_3        
	//*  16   22:iload_3         
	//*  17   23:aload_1         
	//*  18   24:iload_2         
	//*  19   25:aaload          
	//*  20   26:getfield        #39  <Field float[] PathParser$PathDataNode.mParams>
	//*  21   29:arraylength     
	//*  22   30:icmpge          56
				apathdatanode[i].mParams[j] = apathdatanode1[i].mParams[j];
	//   23   33:aload_0         
	//   24   34:iload_2         
	//   25   35:aaload          
	//   26   36:getfield        #39  <Field float[] PathParser$PathDataNode.mParams>
	//   27   39:iload_3         
	//   28   40:aload_1         
	//   29   41:iload_2         
	//   30   42:aaload          
	//   31   43:getfield        #39  <Field float[] PathParser$PathDataNode.mParams>
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
}
