// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

class PathParser
{
	public static class PathDataNode
	{

		private static void addCommand(Path path, float af[], char c1, char c2, float af1[])
		{
			char c3 = '\002';
		//    0    0:iconst_2        
		//    1    1:istore          18
			float f10 = af[0];
		//    2    3:aload_1         
		//    3    4:iconst_0        
		//    4    5:faload          
		//    5    6:fstore          11
			float f12 = af[1];
		//    6    8:aload_1         
		//    7    9:iconst_1        
		//    8   10:faload          
		//    9   11:fstore          12
			float f14 = af[2];
		//   10   13:aload_1         
		//   11   14:iconst_2        
		//   12   15:faload          
		//   13   16:fstore          13
			float f15 = af[3];
		//   14   18:aload_1         
		//   15   19:iconst_3        
		//   16   20:faload          
		//   17   21:fstore          14
			float f = af[4];
		//   18   23:aload_1         
		//   19   24:iconst_4        
		//   20   25:faload          
		//   21   26:fstore          5
			float f2 = af[5];
		//   22   28:aload_1         
		//   23   29:iconst_5        
		//   24   30:faload          
		//   25   31:fstore          6
			byte byte0 = ((byte) (c3));
		//   26   33:iload           18
		//   27   35:istore          17
			float f9 = f10;
		//   28   37:fload           11
		//   29   39:fstore          10
			float f8 = f12;
		//   30   41:fload           12
		//   31   43:fstore          9
			float f4 = f14;
		//   32   45:fload           13
		//   33   47:fstore          7
			float f6 = f15;
		//   34   49:fload           14
		//   35   51:fstore          8
			switch(c2)
		//*  36   53:iload_3         
			{
		//*  37   54:tableswitch     65 122: default 300
		//		               65 447
		//		               66 467
		//		               67 402
		//		               68 467
		//		               69 467
		//		               70 467
		//		               71 467
		//		               72 380
		//		               73 467
		//		               74 467
		//		               75 467
		//		               76 358
		//		               77 358
		//		               78 467
		//		               79 467
		//		               80 467
		//		               81 425
		//		               82 467
		//		               83 425
		//		               84 358
		//		               85 467
		//		               86 380
		//		               87 467
		//		               88 467
		//		               89 467
		//		               90 323
		//		               91 467
		//		               92 467
		//		               93 467
		//		               94 467
		//		               95 467
		//		               96 467
		//		               97 447
		//		               98 467
		//		               99 402
		//		               100 467
		//		               101 467
		//		               102 467
		//		               103 467
		//		               104 380
		//		               105 467
		//		               106 467
		//		               107 467
		//		               108 358
		//		               109 358
		//		               110 467
		//		               111 467
		//		               112 467
		//		               113 425
		//		               114 467
		//		               115 425
		//		               116 358
		//		               117 467
		//		               118 380
		//		               119 467
		//		               120 467
		//		               121 467
		//		               122 323
			default:
				byte0 = ((byte) (c3));
		//   38  300:iload           18
		//   39  302:istore          17
				f9 = f10;
		//   40  304:fload           11
		//   41  306:fstore          10
				f8 = f12;
		//   42  308:fload           12
		//   43  310:fstore          9
				f4 = f14;
		//   44  312:fload           13
		//   45  314:fstore          7
				f6 = f15;
		//   46  316:fload           14
		//   47  318:fstore          8
				break;

		//*  48  320:goto            467
			case 90: // 'Z'
			case 122: // 'z'
				path.close();
		//   49  323:aload_0         
		//   50  324:invokevirtual   #33  <Method void Path.close()>
				f9 = f;
		//   51  327:fload           5
		//   52  329:fstore          10
				f8 = f2;
		//   53  331:fload           6
		//   54  333:fstore          9
				f4 = f;
		//   55  335:fload           5
		//   56  337:fstore          7
				f6 = f2;
		//   57  339:fload           6
		//   58  341:fstore          8
				path.moveTo(f9, f8);
		//   59  343:aload_0         
		//   60  344:fload           10
		//   61  346:fload           9
		//   62  348:invokevirtual   #37  <Method void Path.moveTo(float, float)>
				byte0 = ((byte) (c3));
		//   63  351:iload           18
		//   64  353:istore          17
				break;

		//*  65  355:goto            467
			case 76: // 'L'
			case 77: // 'M'
			case 84: // 'T'
			case 108: // 'l'
			case 109: // 'm'
			case 116: // 't'
				byte0 = 2;
		//   66  358:iconst_2        
		//   67  359:istore          17
				f9 = f10;
		//   68  361:fload           11
		//   69  363:fstore          10
				f8 = f12;
		//   70  365:fload           12
		//   71  367:fstore          9
				f4 = f14;
		//   72  369:fload           13
		//   73  371:fstore          7
				f6 = f15;
		//   74  373:fload           14
		//   75  375:fstore          8
				break;

		//*  76  377:goto            467
			case 72: // 'H'
			case 86: // 'V'
			case 104: // 'h'
			case 118: // 'v'
				byte0 = 1;
		//   77  380:iconst_1        
		//   78  381:istore          17
				f9 = f10;
		//   79  383:fload           11
		//   80  385:fstore          10
				f8 = f12;
		//   81  387:fload           12
		//   82  389:fstore          9
				f4 = f14;
		//   83  391:fload           13
		//   84  393:fstore          7
				f6 = f15;
		//   85  395:fload           14
		//   86  397:fstore          8
				break;

		//*  87  399:goto            467
			case 67: // 'C'
			case 99: // 'c'
				byte0 = 6;
		//   88  402:bipush          6
		//   89  404:istore          17
				f9 = f10;
		//   90  406:fload           11
		//   91  408:fstore          10
				f8 = f12;
		//   92  410:fload           12
		//   93  412:fstore          9
				f4 = f14;
		//   94  414:fload           13
		//   95  416:fstore          7
				f6 = f15;
		//   96  418:fload           14
		//   97  420:fstore          8
				break;

		//*  98  422:goto            467
			case 81: // 'Q'
			case 83: // 'S'
			case 113: // 'q'
			case 115: // 's'
				byte0 = 4;
		//   99  425:iconst_4        
		//  100  426:istore          17
				f9 = f10;
		//  101  428:fload           11
		//  102  430:fstore          10
				f8 = f12;
		//  103  432:fload           12
		//  104  434:fstore          9
				f4 = f14;
		//  105  436:fload           13
		//  106  438:fstore          7
				f6 = f15;
		//  107  440:fload           14
		//  108  442:fstore          8
				break;

		//* 109  444:goto            467
			case 65: // 'A'
			case 97: // 'a'
				byte0 = 7;
		//  110  447:bipush          7
		//  111  449:istore          17
				f6 = f15;
		//  112  451:fload           14
		//  113  453:fstore          8
				f4 = f14;
		//  114  455:fload           13
		//  115  457:fstore          7
				f8 = f12;
		//  116  459:fload           12
		//  117  461:fstore          9
				f9 = f10;
		//  118  463:fload           11
		//  119  465:fstore          10
				break;

			case 66: // 'B'
			case 68: // 'D'
			case 69: // 'E'
			case 70: // 'F'
			case 71: // 'G'
			case 73: // 'I'
			case 74: // 'J'
			case 75: // 'K'
			case 78: // 'N'
			case 79: // 'O'
			case 80: // 'P'
			case 82: // 'R'
			case 85: // 'U'
			case 87: // 'W'
			case 88: // 'X'
			case 89: // 'Y'
			case 91: // '['
			case 92: // '\\'
			case 93: // ']'
			case 94: // '^'
			case 95: // '_'
			case 96: // '`'
			case 98: // 'b'
			case 100: // 'd'
			case 101: // 'e'
			case 102: // 'f'
			case 103: // 'g'
			case 105: // 'i'
			case 106: // 'j'
			case 107: // 'k'
			case 110: // 'n'
			case 111: // 'o'
			case 112: // 'p'
			case 114: // 'r'
			case 117: // 'u'
			case 119: // 'w'
			case 120: // 'x'
			case 121: // 'y'
				break;
			}
			boolean flag = false;
		//  120  467:iconst_0        
		//  121  468:istore          19
			c3 = c1;
		//  122  470:iload_2         
		//  123  471:istore          18
			c1 = ((char) (flag));
		//  124  473:iload           19
		//  125  475:istore_2        
			f14 = f2;
		//  126  476:fload           6
		//  127  478:fstore          13
			f15 = f;
		//  128  480:fload           5
		//  129  482:fstore          14
			float f16 = f6;
		//  130  484:fload           8
		//  131  486:fstore          15
			float f17 = f4;
		//  132  488:fload           7
		//  133  490:fstore          16
			while(c1 < af1.length) 
		//* 134  492:iload_2         
		//* 135  493:aload           4
		//* 136  495:arraylength     
		//* 137  496:icmpge          2395
			{
				float f1 = f9;
		//  138  499:fload           10
		//  139  501:fstore          5
				float f3 = f8;
		//  140  503:fload           9
		//  141  505:fstore          6
				float f5 = f17;
		//  142  507:fload           16
		//  143  509:fstore          7
				float f7 = f16;
		//  144  511:fload           15
		//  145  513:fstore          8
				float f11 = f15;
		//  146  515:fload           14
		//  147  517:fstore          11
				float f13 = f14;
		//  148  519:fload           13
		//  149  521:fstore          12
				switch(c2)
		//* 150  523:iload_3         
				{
		//* 151  524:tableswitch     65 118: default 756
		//		               65 2224
		//		               66 2360
		//		               67 1348
		//		               68 2360
		//		               69 2360
		//		               70 2360
		//		               71 2360
		//		               72 1122
		//		               73 2360
		//		               74 2360
		//		               75 2360
		//		               76 1026
		//		               77 879
		//		               78 2360
		//		               79 2360
		//		               80 2360
		//		               81 1778
		//		               82 2360
		//		               83 1566
		//		               84 1964
		//		               85 2360
		//		               86 1210
		//		               87 2360
		//		               88 2360
		//		               89 2360
		//		               90 2360
		//		               91 2360
		//		               92 2360
		//		               93 2360
		//		               94 2360
		//		               95 2360
		//		               96 2360
		//		               97 2073
		//		               98 2360
		//		               99 1253
		//		               100 2360
		//		               101 2360
		//		               102 2360
		//		               103 2360
		//		               104 1077
		//		               105 2360
		//		               106 2360
		//		               107 2360
		//		               108 969
		//		               109 783
		//		               110 2360
		//		               111 2360
		//		               112 2360
		//		               113 1695
		//		               114 2360
		//		               115 1431
		//		               116 1849
		//		               117 2360
		//		               118 1165
				default:
					f1 = f9;
		//  152  756:fload           10
		//  153  758:fstore          5
					f3 = f8;
		//  154  760:fload           9
		//  155  762:fstore          6
					f5 = f17;
		//  156  764:fload           16
		//  157  766:fstore          7
					f7 = f16;
		//  158  768:fload           15
		//  159  770:fstore          8
					f11 = f15;
		//  160  772:fload           14
		//  161  774:fstore          11
					f13 = f14;
		//  162  776:fload           13
		//  163  778:fstore          12
					break;
		//  164  780:goto            2360

				case 66: // 'B'
				case 68: // 'D'
				case 69: // 'E'
				case 70: // 'F'
				case 71: // 'G'
				case 73: // 'I'
				case 74: // 'J'
				case 75: // 'K'
				case 78: // 'N'
				case 79: // 'O'
				case 80: // 'P'
				case 82: // 'R'
				case 85: // 'U'
				case 87: // 'W'
				case 88: // 'X'
				case 89: // 'Y'
				case 90: // 'Z'
				case 91: // '['
				case 92: // '\\'
				case 93: // ']'
				case 94: // '^'
				case 95: // '_'
				case 96: // '`'
				case 98: // 'b'
				case 100: // 'd'
				case 101: // 'e'
				case 102: // 'f'
				case 103: // 'g'
				case 105: // 'i'
				case 106: // 'j'
				case 107: // 'k'
				case 110: // 'n'
				case 111: // 'o'
				case 112: // 'p'
				case 114: // 'r'
				case 117: // 'u'
					break;

				case 109: // 'm'
					f1 = f9 + af1[c1 + 0];
		//  165  783:fload           10
		//  166  785:aload           4
		//  167  787:iload_2         
		//  168  788:iconst_0        
		//  169  789:iadd            
		//  170  790:faload          
		//  171  791:fadd            
		//  172  792:fstore          5
					f3 = f8 + af1[c1 + 1];
		//  173  794:fload           9
		//  174  796:aload           4
		//  175  798:iload_2         
		//  176  799:iconst_1        
		//  177  800:iadd            
		//  178  801:faload          
		//  179  802:fadd            
		//  180  803:fstore          6
					if(c1 > 0)
		//* 181  805:iload_2         
		//* 182  806:ifle            844
					{
						path.rLineTo(af1[c1 + 0], af1[c1 + 1]);
		//  183  809:aload_0         
		//  184  810:aload           4
		//  185  812:iload_2         
		//  186  813:iconst_0        
		//  187  814:iadd            
		//  188  815:faload          
		//  189  816:aload           4
		//  190  818:iload_2         
		//  191  819:iconst_1        
		//  192  820:iadd            
		//  193  821:faload          
		//  194  822:invokevirtual   #40  <Method void Path.rLineTo(float, float)>
						f5 = f17;
		//  195  825:fload           16
		//  196  827:fstore          7
						f7 = f16;
		//  197  829:fload           15
		//  198  831:fstore          8
						f11 = f15;
		//  199  833:fload           14
		//  200  835:fstore          11
						f13 = f14;
		//  201  837:fload           13
		//  202  839:fstore          12
					} else
		//* 203  841:goto            2360
					{
						path.rMoveTo(af1[c1 + 0], af1[c1 + 1]);
		//  204  844:aload_0         
		//  205  845:aload           4
		//  206  847:iload_2         
		//  207  848:iconst_0        
		//  208  849:iadd            
		//  209  850:faload          
		//  210  851:aload           4
		//  211  853:iload_2         
		//  212  854:iconst_1        
		//  213  855:iadd            
		//  214  856:faload          
		//  215  857:invokevirtual   #43  <Method void Path.rMoveTo(float, float)>
						f11 = f1;
		//  216  860:fload           5
		//  217  862:fstore          11
						f13 = f3;
		//  218  864:fload           6
		//  219  866:fstore          12
						f5 = f17;
		//  220  868:fload           16
		//  221  870:fstore          7
						f7 = f16;
		//  222  872:fload           15
		//  223  874:fstore          8
					}
					break;
		//  224  876:goto            2360

				case 77: // 'M'
					f1 = af1[c1 + 0];
		//  225  879:aload           4
		//  226  881:iload_2         
		//  227  882:iconst_0        
		//  228  883:iadd            
		//  229  884:faload          
		//  230  885:fstore          5
					f3 = af1[c1 + 1];
		//  231  887:aload           4
		//  232  889:iload_2         
		//  233  890:iconst_1        
		//  234  891:iadd            
		//  235  892:faload          
		//  236  893:fstore          6
					if(c1 > 0)
		//* 237  895:iload_2         
		//* 238  896:ifle            934
					{
						path.lineTo(af1[c1 + 0], af1[c1 + 1]);
		//  239  899:aload_0         
		//  240  900:aload           4
		//  241  902:iload_2         
		//  242  903:iconst_0        
		//  243  904:iadd            
		//  244  905:faload          
		//  245  906:aload           4
		//  246  908:iload_2         
		//  247  909:iconst_1        
		//  248  910:iadd            
		//  249  911:faload          
		//  250  912:invokevirtual   #46  <Method void Path.lineTo(float, float)>
						f5 = f17;
		//  251  915:fload           16
		//  252  917:fstore          7
						f7 = f16;
		//  253  919:fload           15
		//  254  921:fstore          8
						f11 = f15;
		//  255  923:fload           14
		//  256  925:fstore          11
						f13 = f14;
		//  257  927:fload           13
		//  258  929:fstore          12
					} else
		//* 259  931:goto            2360
					{
						path.moveTo(af1[c1 + 0], af1[c1 + 1]);
		//  260  934:aload_0         
		//  261  935:aload           4
		//  262  937:iload_2         
		//  263  938:iconst_0        
		//  264  939:iadd            
		//  265  940:faload          
		//  266  941:aload           4
		//  267  943:iload_2         
		//  268  944:iconst_1        
		//  269  945:iadd            
		//  270  946:faload          
		//  271  947:invokevirtual   #37  <Method void Path.moveTo(float, float)>
						f11 = f1;
		//  272  950:fload           5
		//  273  952:fstore          11
						f13 = f3;
		//  274  954:fload           6
		//  275  956:fstore          12
						f5 = f17;
		//  276  958:fload           16
		//  277  960:fstore          7
						f7 = f16;
		//  278  962:fload           15
		//  279  964:fstore          8
					}
					break;
		//  280  966:goto            2360

				case 108: // 'l'
					path.rLineTo(af1[c1 + 0], af1[c1 + 1]);
		//  281  969:aload_0         
		//  282  970:aload           4
		//  283  972:iload_2         
		//  284  973:iconst_0        
		//  285  974:iadd            
		//  286  975:faload          
		//  287  976:aload           4
		//  288  978:iload_2         
		//  289  979:iconst_1        
		//  290  980:iadd            
		//  291  981:faload          
		//  292  982:invokevirtual   #40  <Method void Path.rLineTo(float, float)>
					f1 = f9 + af1[c1 + 0];
		//  293  985:fload           10
		//  294  987:aload           4
		//  295  989:iload_2         
		//  296  990:iconst_0        
		//  297  991:iadd            
		//  298  992:faload          
		//  299  993:fadd            
		//  300  994:fstore          5
					f3 = f8 + af1[c1 + 1];
		//  301  996:fload           9
		//  302  998:aload           4
		//  303 1000:iload_2         
		//  304 1001:iconst_1        
		//  305 1002:iadd            
		//  306 1003:faload          
		//  307 1004:fadd            
		//  308 1005:fstore          6
					f5 = f17;
		//  309 1007:fload           16
		//  310 1009:fstore          7
					f7 = f16;
		//  311 1011:fload           15
		//  312 1013:fstore          8
					f11 = f15;
		//  313 1015:fload           14
		//  314 1017:fstore          11
					f13 = f14;
		//  315 1019:fload           13
		//  316 1021:fstore          12
					break;
		//  317 1023:goto            2360

				case 76: // 'L'
					path.lineTo(af1[c1 + 0], af1[c1 + 1]);
		//  318 1026:aload_0         
		//  319 1027:aload           4
		//  320 1029:iload_2         
		//  321 1030:iconst_0        
		//  322 1031:iadd            
		//  323 1032:faload          
		//  324 1033:aload           4
		//  325 1035:iload_2         
		//  326 1036:iconst_1        
		//  327 1037:iadd            
		//  328 1038:faload          
		//  329 1039:invokevirtual   #46  <Method void Path.lineTo(float, float)>
					f1 = af1[c1 + 0];
		//  330 1042:aload           4
		//  331 1044:iload_2         
		//  332 1045:iconst_0        
		//  333 1046:iadd            
		//  334 1047:faload          
		//  335 1048:fstore          5
					f3 = af1[c1 + 1];
		//  336 1050:aload           4
		//  337 1052:iload_2         
		//  338 1053:iconst_1        
		//  339 1054:iadd            
		//  340 1055:faload          
		//  341 1056:fstore          6
					f5 = f17;
		//  342 1058:fload           16
		//  343 1060:fstore          7
					f7 = f16;
		//  344 1062:fload           15
		//  345 1064:fstore          8
					f11 = f15;
		//  346 1066:fload           14
		//  347 1068:fstore          11
					f13 = f14;
		//  348 1070:fload           13
		//  349 1072:fstore          12
					break;
		//  350 1074:goto            2360

				case 104: // 'h'
					path.rLineTo(af1[c1 + 0], 0.0F);
		//  351 1077:aload_0         
		//  352 1078:aload           4
		//  353 1080:iload_2         
		//  354 1081:iconst_0        
		//  355 1082:iadd            
		//  356 1083:faload          
		//  357 1084:fconst_0        
		//  358 1085:invokevirtual   #40  <Method void Path.rLineTo(float, float)>
					f1 = f9 + af1[c1 + 0];
		//  359 1088:fload           10
		//  360 1090:aload           4
		//  361 1092:iload_2         
		//  362 1093:iconst_0        
		//  363 1094:iadd            
		//  364 1095:faload          
		//  365 1096:fadd            
		//  366 1097:fstore          5
					f3 = f8;
		//  367 1099:fload           9
		//  368 1101:fstore          6
					f5 = f17;
		//  369 1103:fload           16
		//  370 1105:fstore          7
					f7 = f16;
		//  371 1107:fload           15
		//  372 1109:fstore          8
					f11 = f15;
		//  373 1111:fload           14
		//  374 1113:fstore          11
					f13 = f14;
		//  375 1115:fload           13
		//  376 1117:fstore          12
					break;
		//  377 1119:goto            2360

				case 72: // 'H'
					path.lineTo(af1[c1 + 0], f8);
		//  378 1122:aload_0         
		//  379 1123:aload           4
		//  380 1125:iload_2         
		//  381 1126:iconst_0        
		//  382 1127:iadd            
		//  383 1128:faload          
		//  384 1129:fload           9
		//  385 1131:invokevirtual   #46  <Method void Path.lineTo(float, float)>
					f1 = af1[c1 + 0];
		//  386 1134:aload           4
		//  387 1136:iload_2         
		//  388 1137:iconst_0        
		//  389 1138:iadd            
		//  390 1139:faload          
		//  391 1140:fstore          5
					f3 = f8;
		//  392 1142:fload           9
		//  393 1144:fstore          6
					f5 = f17;
		//  394 1146:fload           16
		//  395 1148:fstore          7
					f7 = f16;
		//  396 1150:fload           15
		//  397 1152:fstore          8
					f11 = f15;
		//  398 1154:fload           14
		//  399 1156:fstore          11
					f13 = f14;
		//  400 1158:fload           13
		//  401 1160:fstore          12
					break;
		//  402 1162:goto            2360

				case 118: // 'v'
					path.rLineTo(0.0F, af1[c1 + 0]);
		//  403 1165:aload_0         
		//  404 1166:fconst_0        
		//  405 1167:aload           4
		//  406 1169:iload_2         
		//  407 1170:iconst_0        
		//  408 1171:iadd            
		//  409 1172:faload          
		//  410 1173:invokevirtual   #40  <Method void Path.rLineTo(float, float)>
					f3 = f8 + af1[c1 + 0];
		//  411 1176:fload           9
		//  412 1178:aload           4
		//  413 1180:iload_2         
		//  414 1181:iconst_0        
		//  415 1182:iadd            
		//  416 1183:faload          
		//  417 1184:fadd            
		//  418 1185:fstore          6
					f1 = f9;
		//  419 1187:fload           10
		//  420 1189:fstore          5
					f5 = f17;
		//  421 1191:fload           16
		//  422 1193:fstore          7
					f7 = f16;
		//  423 1195:fload           15
		//  424 1197:fstore          8
					f11 = f15;
		//  425 1199:fload           14
		//  426 1201:fstore          11
					f13 = f14;
		//  427 1203:fload           13
		//  428 1205:fstore          12
					break;
		//  429 1207:goto            2360

				case 86: // 'V'
					path.lineTo(f9, af1[c1 + 0]);
		//  430 1210:aload_0         
		//  431 1211:fload           10
		//  432 1213:aload           4
		//  433 1215:iload_2         
		//  434 1216:iconst_0        
		//  435 1217:iadd            
		//  436 1218:faload          
		//  437 1219:invokevirtual   #46  <Method void Path.lineTo(float, float)>
					f3 = af1[c1 + 0];
		//  438 1222:aload           4
		//  439 1224:iload_2         
		//  440 1225:iconst_0        
		//  441 1226:iadd            
		//  442 1227:faload          
		//  443 1228:fstore          6
					f1 = f9;
		//  444 1230:fload           10
		//  445 1232:fstore          5
					f5 = f17;
		//  446 1234:fload           16
		//  447 1236:fstore          7
					f7 = f16;
		//  448 1238:fload           15
		//  449 1240:fstore          8
					f11 = f15;
		//  450 1242:fload           14
		//  451 1244:fstore          11
					f13 = f14;
		//  452 1246:fload           13
		//  453 1248:fstore          12
					break;
		//  454 1250:goto            2360

				case 99: // 'c'
					path.rCubicTo(af1[c1 + 0], af1[c1 + 1], af1[c1 + 2], af1[c1 + 3], af1[c1 + 4], af1[c1 + 5]);
		//  455 1253:aload_0         
		//  456 1254:aload           4
		//  457 1256:iload_2         
		//  458 1257:iconst_0        
		//  459 1258:iadd            
		//  460 1259:faload          
		//  461 1260:aload           4
		//  462 1262:iload_2         
		//  463 1263:iconst_1        
		//  464 1264:iadd            
		//  465 1265:faload          
		//  466 1266:aload           4
		//  467 1268:iload_2         
		//  468 1269:iconst_2        
		//  469 1270:iadd            
		//  470 1271:faload          
		//  471 1272:aload           4
		//  472 1274:iload_2         
		//  473 1275:iconst_3        
		//  474 1276:iadd            
		//  475 1277:faload          
		//  476 1278:aload           4
		//  477 1280:iload_2         
		//  478 1281:iconst_4        
		//  479 1282:iadd            
		//  480 1283:faload          
		//  481 1284:aload           4
		//  482 1286:iload_2         
		//  483 1287:iconst_5        
		//  484 1288:iadd            
		//  485 1289:faload          
		//  486 1290:invokevirtual   #50  <Method void Path.rCubicTo(float, float, float, float, float, float)>
					f5 = f9 + af1[c1 + 2];
		//  487 1293:fload           10
		//  488 1295:aload           4
		//  489 1297:iload_2         
		//  490 1298:iconst_2        
		//  491 1299:iadd            
		//  492 1300:faload          
		//  493 1301:fadd            
		//  494 1302:fstore          7
					f7 = f8 + af1[c1 + 3];
		//  495 1304:fload           9
		//  496 1306:aload           4
		//  497 1308:iload_2         
		//  498 1309:iconst_3        
		//  499 1310:iadd            
		//  500 1311:faload          
		//  501 1312:fadd            
		//  502 1313:fstore          8
					f1 = f9 + af1[c1 + 4];
		//  503 1315:fload           10
		//  504 1317:aload           4
		//  505 1319:iload_2         
		//  506 1320:iconst_4        
		//  507 1321:iadd            
		//  508 1322:faload          
		//  509 1323:fadd            
		//  510 1324:fstore          5
					f3 = f8 + af1[c1 + 5];
		//  511 1326:fload           9
		//  512 1328:aload           4
		//  513 1330:iload_2         
		//  514 1331:iconst_5        
		//  515 1332:iadd            
		//  516 1333:faload          
		//  517 1334:fadd            
		//  518 1335:fstore          6
					f11 = f15;
		//  519 1337:fload           14
		//  520 1339:fstore          11
					f13 = f14;
		//  521 1341:fload           13
		//  522 1343:fstore          12
					break;
		//  523 1345:goto            2360

				case 67: // 'C'
					path.cubicTo(af1[c1 + 0], af1[c1 + 1], af1[c1 + 2], af1[c1 + 3], af1[c1 + 4], af1[c1 + 5]);
		//  524 1348:aload_0         
		//  525 1349:aload           4
		//  526 1351:iload_2         
		//  527 1352:iconst_0        
		//  528 1353:iadd            
		//  529 1354:faload          
		//  530 1355:aload           4
		//  531 1357:iload_2         
		//  532 1358:iconst_1        
		//  533 1359:iadd            
		//  534 1360:faload          
		//  535 1361:aload           4
		//  536 1363:iload_2         
		//  537 1364:iconst_2        
		//  538 1365:iadd            
		//  539 1366:faload          
		//  540 1367:aload           4
		//  541 1369:iload_2         
		//  542 1370:iconst_3        
		//  543 1371:iadd            
		//  544 1372:faload          
		//  545 1373:aload           4
		//  546 1375:iload_2         
		//  547 1376:iconst_4        
		//  548 1377:iadd            
		//  549 1378:faload          
		//  550 1379:aload           4
		//  551 1381:iload_2         
		//  552 1382:iconst_5        
		//  553 1383:iadd            
		//  554 1384:faload          
		//  555 1385:invokevirtual   #53  <Method void Path.cubicTo(float, float, float, float, float, float)>
					f1 = af1[c1 + 4];
		//  556 1388:aload           4
		//  557 1390:iload_2         
		//  558 1391:iconst_4        
		//  559 1392:iadd            
		//  560 1393:faload          
		//  561 1394:fstore          5
					f3 = af1[c1 + 5];
		//  562 1396:aload           4
		//  563 1398:iload_2         
		//  564 1399:iconst_5        
		//  565 1400:iadd            
		//  566 1401:faload          
		//  567 1402:fstore          6
					f5 = af1[c1 + 2];
		//  568 1404:aload           4
		//  569 1406:iload_2         
		//  570 1407:iconst_2        
		//  571 1408:iadd            
		//  572 1409:faload          
		//  573 1410:fstore          7
					f7 = af1[c1 + 3];
		//  574 1412:aload           4
		//  575 1414:iload_2         
		//  576 1415:iconst_3        
		//  577 1416:iadd            
		//  578 1417:faload          
		//  579 1418:fstore          8
					f11 = f15;
		//  580 1420:fload           14
		//  581 1422:fstore          11
					f13 = f14;
		//  582 1424:fload           13
		//  583 1426:fstore          12
					break;
		//  584 1428:goto            2360

				case 115: // 's'
					f1 = 0.0F;
		//  585 1431:fconst_0        
		//  586 1432:fstore          5
					f3 = 0.0F;
		//  587 1434:fconst_0        
		//  588 1435:fstore          6
					if(c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S')
		//* 589 1437:iload           18
		//* 590 1439:bipush          99
		//* 591 1441:icmpeq          1465
		//* 592 1444:iload           18
		//* 593 1446:bipush          115
		//* 594 1448:icmpeq          1465
		//* 595 1451:iload           18
		//* 596 1453:bipush          67
		//* 597 1455:icmpeq          1465
		//* 598 1458:iload           18
		//* 599 1460:bipush          83
		//* 600 1462:icmpne          1479
					{
						f1 = f9 - f17;
		//  601 1465:fload           10
		//  602 1467:fload           16
		//  603 1469:fsub            
		//  604 1470:fstore          5
						f3 = f8 - f16;
		//  605 1472:fload           9
		//  606 1474:fload           15
		//  607 1476:fsub            
		//  608 1477:fstore          6
					}
					path.rCubicTo(f1, f3, af1[c1 + 0], af1[c1 + 1], af1[c1 + 2], af1[c1 + 3]);
		//  609 1479:aload_0         
		//  610 1480:fload           5
		//  611 1482:fload           6
		//  612 1484:aload           4
		//  613 1486:iload_2         
		//  614 1487:iconst_0        
		//  615 1488:iadd            
		//  616 1489:faload          
		//  617 1490:aload           4
		//  618 1492:iload_2         
		//  619 1493:iconst_1        
		//  620 1494:iadd            
		//  621 1495:faload          
		//  622 1496:aload           4
		//  623 1498:iload_2         
		//  624 1499:iconst_2        
		//  625 1500:iadd            
		//  626 1501:faload          
		//  627 1502:aload           4
		//  628 1504:iload_2         
		//  629 1505:iconst_3        
		//  630 1506:iadd            
		//  631 1507:faload          
		//  632 1508:invokevirtual   #50  <Method void Path.rCubicTo(float, float, float, float, float, float)>
					f5 = f9 + af1[c1 + 0];
		//  633 1511:fload           10
		//  634 1513:aload           4
		//  635 1515:iload_2         
		//  636 1516:iconst_0        
		//  637 1517:iadd            
		//  638 1518:faload          
		//  639 1519:fadd            
		//  640 1520:fstore          7
					f7 = f8 + af1[c1 + 1];
		//  641 1522:fload           9
		//  642 1524:aload           4
		//  643 1526:iload_2         
		//  644 1527:iconst_1        
		//  645 1528:iadd            
		//  646 1529:faload          
		//  647 1530:fadd            
		//  648 1531:fstore          8
					f1 = f9 + af1[c1 + 2];
		//  649 1533:fload           10
		//  650 1535:aload           4
		//  651 1537:iload_2         
		//  652 1538:iconst_2        
		//  653 1539:iadd            
		//  654 1540:faload          
		//  655 1541:fadd            
		//  656 1542:fstore          5
					f3 = f8 + af1[c1 + 3];
		//  657 1544:fload           9
		//  658 1546:aload           4
		//  659 1548:iload_2         
		//  660 1549:iconst_3        
		//  661 1550:iadd            
		//  662 1551:faload          
		//  663 1552:fadd            
		//  664 1553:fstore          6
					f11 = f15;
		//  665 1555:fload           14
		//  666 1557:fstore          11
					f13 = f14;
		//  667 1559:fload           13
		//  668 1561:fstore          12
					break;
		//  669 1563:goto            2360

				case 83: // 'S'
					f3 = f9;
		//  670 1566:fload           10
		//  671 1568:fstore          6
					f1 = f8;
		//  672 1570:fload           9
		//  673 1572:fstore          5
					if(c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S')
		//* 674 1574:iload           18
		//* 675 1576:bipush          99
		//* 676 1578:icmpeq          1602
		//* 677 1581:iload           18
		//* 678 1583:bipush          115
		//* 679 1585:icmpeq          1602
		//* 680 1588:iload           18
		//* 681 1590:bipush          67
		//* 682 1592:icmpeq          1602
		//* 683 1595:iload           18
		//* 684 1597:bipush          83
		//* 685 1599:icmpne          1620
					{
						f3 = 2.0F * f9 - f17;
		//  686 1602:fconst_2        
		//  687 1603:fload           10
		//  688 1605:fmul            
		//  689 1606:fload           16
		//  690 1608:fsub            
		//  691 1609:fstore          6
						f1 = 2.0F * f8 - f16;
		//  692 1611:fconst_2        
		//  693 1612:fload           9
		//  694 1614:fmul            
		//  695 1615:fload           15
		//  696 1617:fsub            
		//  697 1618:fstore          5
					}
					path.cubicTo(f3, f1, af1[c1 + 0], af1[c1 + 1], af1[c1 + 2], af1[c1 + 3]);
		//  698 1620:aload_0         
		//  699 1621:fload           6
		//  700 1623:fload           5
		//  701 1625:aload           4
		//  702 1627:iload_2         
		//  703 1628:iconst_0        
		//  704 1629:iadd            
		//  705 1630:faload          
		//  706 1631:aload           4
		//  707 1633:iload_2         
		//  708 1634:iconst_1        
		//  709 1635:iadd            
		//  710 1636:faload          
		//  711 1637:aload           4
		//  712 1639:iload_2         
		//  713 1640:iconst_2        
		//  714 1641:iadd            
		//  715 1642:faload          
		//  716 1643:aload           4
		//  717 1645:iload_2         
		//  718 1646:iconst_3        
		//  719 1647:iadd            
		//  720 1648:faload          
		//  721 1649:invokevirtual   #53  <Method void Path.cubicTo(float, float, float, float, float, float)>
					f5 = af1[c1 + 0];
		//  722 1652:aload           4
		//  723 1654:iload_2         
		//  724 1655:iconst_0        
		//  725 1656:iadd            
		//  726 1657:faload          
		//  727 1658:fstore          7
					f7 = af1[c1 + 1];
		//  728 1660:aload           4
		//  729 1662:iload_2         
		//  730 1663:iconst_1        
		//  731 1664:iadd            
		//  732 1665:faload          
		//  733 1666:fstore          8
					f1 = af1[c1 + 2];
		//  734 1668:aload           4
		//  735 1670:iload_2         
		//  736 1671:iconst_2        
		//  737 1672:iadd            
		//  738 1673:faload          
		//  739 1674:fstore          5
					f3 = af1[c1 + 3];
		//  740 1676:aload           4
		//  741 1678:iload_2         
		//  742 1679:iconst_3        
		//  743 1680:iadd            
		//  744 1681:faload          
		//  745 1682:fstore          6
					f11 = f15;
		//  746 1684:fload           14
		//  747 1686:fstore          11
					f13 = f14;
		//  748 1688:fload           13
		//  749 1690:fstore          12
					break;
		//  750 1692:goto            2360

				case 113: // 'q'
					path.rQuadTo(af1[c1 + 0], af1[c1 + 1], af1[c1 + 2], af1[c1 + 3]);
		//  751 1695:aload_0         
		//  752 1696:aload           4
		//  753 1698:iload_2         
		//  754 1699:iconst_0        
		//  755 1700:iadd            
		//  756 1701:faload          
		//  757 1702:aload           4
		//  758 1704:iload_2         
		//  759 1705:iconst_1        
		//  760 1706:iadd            
		//  761 1707:faload          
		//  762 1708:aload           4
		//  763 1710:iload_2         
		//  764 1711:iconst_2        
		//  765 1712:iadd            
		//  766 1713:faload          
		//  767 1714:aload           4
		//  768 1716:iload_2         
		//  769 1717:iconst_3        
		//  770 1718:iadd            
		//  771 1719:faload          
		//  772 1720:invokevirtual   #57  <Method void Path.rQuadTo(float, float, float, float)>
					f5 = f9 + af1[c1 + 0];
		//  773 1723:fload           10
		//  774 1725:aload           4
		//  775 1727:iload_2         
		//  776 1728:iconst_0        
		//  777 1729:iadd            
		//  778 1730:faload          
		//  779 1731:fadd            
		//  780 1732:fstore          7
					f7 = f8 + af1[c1 + 1];
		//  781 1734:fload           9
		//  782 1736:aload           4
		//  783 1738:iload_2         
		//  784 1739:iconst_1        
		//  785 1740:iadd            
		//  786 1741:faload          
		//  787 1742:fadd            
		//  788 1743:fstore          8
					f1 = f9 + af1[c1 + 2];
		//  789 1745:fload           10
		//  790 1747:aload           4
		//  791 1749:iload_2         
		//  792 1750:iconst_2        
		//  793 1751:iadd            
		//  794 1752:faload          
		//  795 1753:fadd            
		//  796 1754:fstore          5
					f3 = f8 + af1[c1 + 3];
		//  797 1756:fload           9
		//  798 1758:aload           4
		//  799 1760:iload_2         
		//  800 1761:iconst_3        
		//  801 1762:iadd            
		//  802 1763:faload          
		//  803 1764:fadd            
		//  804 1765:fstore          6
					f11 = f15;
		//  805 1767:fload           14
		//  806 1769:fstore          11
					f13 = f14;
		//  807 1771:fload           13
		//  808 1773:fstore          12
					break;
		//  809 1775:goto            2360

				case 81: // 'Q'
					path.quadTo(af1[c1 + 0], af1[c1 + 1], af1[c1 + 2], af1[c1 + 3]);
		//  810 1778:aload_0         
		//  811 1779:aload           4
		//  812 1781:iload_2         
		//  813 1782:iconst_0        
		//  814 1783:iadd            
		//  815 1784:faload          
		//  816 1785:aload           4
		//  817 1787:iload_2         
		//  818 1788:iconst_1        
		//  819 1789:iadd            
		//  820 1790:faload          
		//  821 1791:aload           4
		//  822 1793:iload_2         
		//  823 1794:iconst_2        
		//  824 1795:iadd            
		//  825 1796:faload          
		//  826 1797:aload           4
		//  827 1799:iload_2         
		//  828 1800:iconst_3        
		//  829 1801:iadd            
		//  830 1802:faload          
		//  831 1803:invokevirtual   #60  <Method void Path.quadTo(float, float, float, float)>
					f5 = af1[c1 + 0];
		//  832 1806:aload           4
		//  833 1808:iload_2         
		//  834 1809:iconst_0        
		//  835 1810:iadd            
		//  836 1811:faload          
		//  837 1812:fstore          7
					f7 = af1[c1 + 1];
		//  838 1814:aload           4
		//  839 1816:iload_2         
		//  840 1817:iconst_1        
		//  841 1818:iadd            
		//  842 1819:faload          
		//  843 1820:fstore          8
					f1 = af1[c1 + 2];
		//  844 1822:aload           4
		//  845 1824:iload_2         
		//  846 1825:iconst_2        
		//  847 1826:iadd            
		//  848 1827:faload          
		//  849 1828:fstore          5
					f3 = af1[c1 + 3];
		//  850 1830:aload           4
		//  851 1832:iload_2         
		//  852 1833:iconst_3        
		//  853 1834:iadd            
		//  854 1835:faload          
		//  855 1836:fstore          6
					f11 = f15;
		//  856 1838:fload           14
		//  857 1840:fstore          11
					f13 = f14;
		//  858 1842:fload           13
		//  859 1844:fstore          12
					break;
		//  860 1846:goto            2360

				case 116: // 't'
					f3 = 0.0F;
		//  861 1849:fconst_0        
		//  862 1850:fstore          6
					f1 = 0.0F;
		//  863 1852:fconst_0        
		//  864 1853:fstore          5
					if(c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T')
		//* 865 1855:iload           18
		//* 866 1857:bipush          113
		//* 867 1859:icmpeq          1883
		//* 868 1862:iload           18
		//* 869 1864:bipush          116
		//* 870 1866:icmpeq          1883
		//* 871 1869:iload           18
		//* 872 1871:bipush          81
		//* 873 1873:icmpeq          1883
		//* 874 1876:iload           18
		//* 875 1878:bipush          84
		//* 876 1880:icmpne          1897
					{
						f3 = f9 - f17;
		//  877 1883:fload           10
		//  878 1885:fload           16
		//  879 1887:fsub            
		//  880 1888:fstore          6
						f1 = f8 - f16;
		//  881 1890:fload           9
		//  882 1892:fload           15
		//  883 1894:fsub            
		//  884 1895:fstore          5
					}
					path.rQuadTo(f3, f1, af1[c1 + 0], af1[c1 + 1]);
		//  885 1897:aload_0         
		//  886 1898:fload           6
		//  887 1900:fload           5
		//  888 1902:aload           4
		//  889 1904:iload_2         
		//  890 1905:iconst_0        
		//  891 1906:iadd            
		//  892 1907:faload          
		//  893 1908:aload           4
		//  894 1910:iload_2         
		//  895 1911:iconst_1        
		//  896 1912:iadd            
		//  897 1913:faload          
		//  898 1914:invokevirtual   #57  <Method void Path.rQuadTo(float, float, float, float)>
					f5 = f9 + f3;
		//  899 1917:fload           10
		//  900 1919:fload           6
		//  901 1921:fadd            
		//  902 1922:fstore          7
					f7 = f8 + f1;
		//  903 1924:fload           9
		//  904 1926:fload           5
		//  905 1928:fadd            
		//  906 1929:fstore          8
					f1 = f9 + af1[c1 + 0];
		//  907 1931:fload           10
		//  908 1933:aload           4
		//  909 1935:iload_2         
		//  910 1936:iconst_0        
		//  911 1937:iadd            
		//  912 1938:faload          
		//  913 1939:fadd            
		//  914 1940:fstore          5
					f3 = f8 + af1[c1 + 1];
		//  915 1942:fload           9
		//  916 1944:aload           4
		//  917 1946:iload_2         
		//  918 1947:iconst_1        
		//  919 1948:iadd            
		//  920 1949:faload          
		//  921 1950:fadd            
		//  922 1951:fstore          6
					f11 = f15;
		//  923 1953:fload           14
		//  924 1955:fstore          11
					f13 = f14;
		//  925 1957:fload           13
		//  926 1959:fstore          12
					break;
		//  927 1961:goto            2360

				case 84: // 'T'
					f3 = f9;
		//  928 1964:fload           10
		//  929 1966:fstore          6
					f1 = f8;
		//  930 1968:fload           9
		//  931 1970:fstore          5
					if(c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T')
		//* 932 1972:iload           18
		//* 933 1974:bipush          113
		//* 934 1976:icmpeq          2000
		//* 935 1979:iload           18
		//* 936 1981:bipush          116
		//* 937 1983:icmpeq          2000
		//* 938 1986:iload           18
		//* 939 1988:bipush          81
		//* 940 1990:icmpeq          2000
		//* 941 1993:iload           18
		//* 942 1995:bipush          84
		//* 943 1997:icmpne          2018
					{
						f3 = 2.0F * f9 - f17;
		//  944 2000:fconst_2        
		//  945 2001:fload           10
		//  946 2003:fmul            
		//  947 2004:fload           16
		//  948 2006:fsub            
		//  949 2007:fstore          6
						f1 = 2.0F * f8 - f16;
		//  950 2009:fconst_2        
		//  951 2010:fload           9
		//  952 2012:fmul            
		//  953 2013:fload           15
		//  954 2015:fsub            
		//  955 2016:fstore          5
					}
					path.quadTo(f3, f1, af1[c1 + 0], af1[c1 + 1]);
		//  956 2018:aload_0         
		//  957 2019:fload           6
		//  958 2021:fload           5
		//  959 2023:aload           4
		//  960 2025:iload_2         
		//  961 2026:iconst_0        
		//  962 2027:iadd            
		//  963 2028:faload          
		//  964 2029:aload           4
		//  965 2031:iload_2         
		//  966 2032:iconst_1        
		//  967 2033:iadd            
		//  968 2034:faload          
		//  969 2035:invokevirtual   #60  <Method void Path.quadTo(float, float, float, float)>
					f5 = f3;
		//  970 2038:fload           6
		//  971 2040:fstore          7
					f7 = f1;
		//  972 2042:fload           5
		//  973 2044:fstore          8
					f1 = af1[c1 + 0];
		//  974 2046:aload           4
		//  975 2048:iload_2         
		//  976 2049:iconst_0        
		//  977 2050:iadd            
		//  978 2051:faload          
		//  979 2052:fstore          5
					f3 = af1[c1 + 1];
		//  980 2054:aload           4
		//  981 2056:iload_2         
		//  982 2057:iconst_1        
		//  983 2058:iadd            
		//  984 2059:faload          
		//  985 2060:fstore          6
					f11 = f15;
		//  986 2062:fload           14
		//  987 2064:fstore          11
					f13 = f14;
		//  988 2066:fload           13
		//  989 2068:fstore          12
					break;
		//  990 2070:goto            2360

				case 97: // 'a'
					f1 = af1[c1 + 5];
		//  991 2073:aload           4
		//  992 2075:iload_2         
		//  993 2076:iconst_5        
		//  994 2077:iadd            
		//  995 2078:faload          
		//  996 2079:fstore          5
					f3 = af1[c1 + 6];
		//  997 2081:aload           4
		//  998 2083:iload_2         
		//  999 2084:bipush          6
		// 1000 2086:iadd            
		// 1001 2087:faload          
		// 1002 2088:fstore          6
					f5 = af1[c1 + 0];
		// 1003 2090:aload           4
		// 1004 2092:iload_2         
		// 1005 2093:iconst_0        
		// 1006 2094:iadd            
		// 1007 2095:faload          
		// 1008 2096:fstore          7
					f7 = af1[c1 + 1];
		// 1009 2098:aload           4
		// 1010 2100:iload_2         
		// 1011 2101:iconst_1        
		// 1012 2102:iadd            
		// 1013 2103:faload          
		// 1014 2104:fstore          8
					f11 = af1[c1 + 2];
		// 1015 2106:aload           4
		// 1016 2108:iload_2         
		// 1017 2109:iconst_2        
		// 1018 2110:iadd            
		// 1019 2111:faload          
		// 1020 2112:fstore          11
					boolean flag1;
					if(af1[c1 + 3] != 0.0F)
		//*1021 2114:aload           4
		//*1022 2116:iload_2         
		//*1023 2117:iconst_3        
		//*1024 2118:iadd            
		//*1025 2119:faload          
		//*1026 2120:fconst_0        
		//*1027 2121:fcmpl           
		//*1028 2122:ifeq            2131
						flag1 = true;
		// 1029 2125:iconst_1        
		// 1030 2126:istore          20
					else
		//*1031 2128:goto            2134
						flag1 = false;
		// 1032 2131:iconst_0        
		// 1033 2132:istore          20
					boolean flag3;
					if(af1[c1 + 4] != 0.0F)
		//*1034 2134:aload           4
		//*1035 2136:iload_2         
		//*1036 2137:iconst_4        
		//*1037 2138:iadd            
		//*1038 2139:faload          
		//*1039 2140:fconst_0        
		//*1040 2141:fcmpl           
		//*1041 2142:ifeq            2151
						flag3 = true;
		// 1042 2145:iconst_1        
		// 1043 2146:istore          21
					else
		//*1044 2148:goto            2154
						flag3 = false;
		// 1045 2151:iconst_0        
		// 1046 2152:istore          21
					drawArc(path, f9, f8, f1 + f9, f3 + f8, f5, f7, f11, flag1, flag3);
		// 1047 2154:aload_0         
		// 1048 2155:fload           10
		// 1049 2157:fload           9
		// 1050 2159:fload           5
		// 1051 2161:fload           10
		// 1052 2163:fadd            
		// 1053 2164:fload           6
		// 1054 2166:fload           9
		// 1055 2168:fadd            
		// 1056 2169:fload           7
		// 1057 2171:fload           8
		// 1058 2173:fload           11
		// 1059 2175:iload           20
		// 1060 2177:iload           21
		// 1061 2179:invokestatic    #64  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
					f1 = f9 + af1[c1 + 5];
		// 1062 2182:fload           10
		// 1063 2184:aload           4
		// 1064 2186:iload_2         
		// 1065 2187:iconst_5        
		// 1066 2188:iadd            
		// 1067 2189:faload          
		// 1068 2190:fadd            
		// 1069 2191:fstore          5
					f3 = f8 + af1[c1 + 6];
		// 1070 2193:fload           9
		// 1071 2195:aload           4
		// 1072 2197:iload_2         
		// 1073 2198:bipush          6
		// 1074 2200:iadd            
		// 1075 2201:faload          
		// 1076 2202:fadd            
		// 1077 2203:fstore          6
					f5 = f1;
		// 1078 2205:fload           5
		// 1079 2207:fstore          7
					f7 = f3;
		// 1080 2209:fload           6
		// 1081 2211:fstore          8
					f11 = f15;
		// 1082 2213:fload           14
		// 1083 2215:fstore          11
					f13 = f14;
		// 1084 2217:fload           13
		// 1085 2219:fstore          12
					break;
		// 1086 2221:goto            2360

				case 65: // 'A'
					f1 = af1[c1 + 5];
		// 1087 2224:aload           4
		// 1088 2226:iload_2         
		// 1089 2227:iconst_5        
		// 1090 2228:iadd            
		// 1091 2229:faload          
		// 1092 2230:fstore          5
					f3 = af1[c1 + 6];
		// 1093 2232:aload           4
		// 1094 2234:iload_2         
		// 1095 2235:bipush          6
		// 1096 2237:iadd            
		// 1097 2238:faload          
		// 1098 2239:fstore          6
					f5 = af1[c1 + 0];
		// 1099 2241:aload           4
		// 1100 2243:iload_2         
		// 1101 2244:iconst_0        
		// 1102 2245:iadd            
		// 1103 2246:faload          
		// 1104 2247:fstore          7
					f7 = af1[c1 + 1];
		// 1105 2249:aload           4
		// 1106 2251:iload_2         
		// 1107 2252:iconst_1        
		// 1108 2253:iadd            
		// 1109 2254:faload          
		// 1110 2255:fstore          8
					f11 = af1[c1 + 2];
		// 1111 2257:aload           4
		// 1112 2259:iload_2         
		// 1113 2260:iconst_2        
		// 1114 2261:iadd            
		// 1115 2262:faload          
		// 1116 2263:fstore          11
					boolean flag2;
					if(af1[c1 + 3] != 0.0F)
		//*1117 2265:aload           4
		//*1118 2267:iload_2         
		//*1119 2268:iconst_3        
		//*1120 2269:iadd            
		//*1121 2270:faload          
		//*1122 2271:fconst_0        
		//*1123 2272:fcmpl           
		//*1124 2273:ifeq            2282
						flag2 = true;
		// 1125 2276:iconst_1        
		// 1126 2277:istore          20
					else
		//*1127 2279:goto            2285
						flag2 = false;
		// 1128 2282:iconst_0        
		// 1129 2283:istore          20
					boolean flag4;
					if(af1[c1 + 4] != 0.0F)
		//*1130 2285:aload           4
		//*1131 2287:iload_2         
		//*1132 2288:iconst_4        
		//*1133 2289:iadd            
		//*1134 2290:faload          
		//*1135 2291:fconst_0        
		//*1136 2292:fcmpl           
		//*1137 2293:ifeq            2302
						flag4 = true;
		// 1138 2296:iconst_1        
		// 1139 2297:istore          21
					else
		//*1140 2299:goto            2305
						flag4 = false;
		// 1141 2302:iconst_0        
		// 1142 2303:istore          21
					drawArc(path, f9, f8, f1, f3, f5, f7, f11, flag2, flag4);
		// 1143 2305:aload_0         
		// 1144 2306:fload           10
		// 1145 2308:fload           9
		// 1146 2310:fload           5
		// 1147 2312:fload           6
		// 1148 2314:fload           7
		// 1149 2316:fload           8
		// 1150 2318:fload           11
		// 1151 2320:iload           20
		// 1152 2322:iload           21
		// 1153 2324:invokestatic    #64  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
					f1 = af1[c1 + 5];
		// 1154 2327:aload           4
		// 1155 2329:iload_2         
		// 1156 2330:iconst_5        
		// 1157 2331:iadd            
		// 1158 2332:faload          
		// 1159 2333:fstore          5
					f3 = af1[c1 + 6];
		// 1160 2335:aload           4
		// 1161 2337:iload_2         
		// 1162 2338:bipush          6
		// 1163 2340:iadd            
		// 1164 2341:faload          
		// 1165 2342:fstore          6
					f5 = f1;
		// 1166 2344:fload           5
		// 1167 2346:fstore          7
					f7 = f3;
		// 1168 2348:fload           6
		// 1169 2350:fstore          8
					f13 = f14;
		// 1170 2352:fload           13
		// 1171 2354:fstore          12
					f11 = f15;
		// 1172 2356:fload           14
		// 1173 2358:fstore          11
					break;
				}
				c3 = c2;
		// 1174 2360:iload_3         
		// 1175 2361:istore          18
				c1 += ((char) (byte0));
		// 1176 2363:iload_2         
		// 1177 2364:iload           17
		// 1178 2366:iadd            
		// 1179 2367:istore_2        
				f9 = f1;
		// 1180 2368:fload           5
		// 1181 2370:fstore          10
				f8 = f3;
		// 1182 2372:fload           6
		// 1183 2374:fstore          9
				f17 = f5;
		// 1184 2376:fload           7
		// 1185 2378:fstore          16
				f16 = f7;
		// 1186 2380:fload           8
		// 1187 2382:fstore          15
				f15 = f11;
		// 1188 2384:fload           11
		// 1189 2386:fstore          14
				f14 = f13;
		// 1190 2388:fload           12
		// 1191 2390:fstore          13
			}
		//*1192 2392:goto            492
			af[0] = f9;
		// 1193 2395:aload_1         
		// 1194 2396:iconst_0        
		// 1195 2397:fload           10
		// 1196 2399:fastore         
			af[1] = f8;
		// 1197 2400:aload_1         
		// 1198 2401:iconst_1        
		// 1199 2402:fload           9
		// 1200 2404:fastore         
			af[2] = f17;
		// 1201 2405:aload_1         
		// 1202 2406:iconst_2        
		// 1203 2407:fload           16
		// 1204 2409:fastore         
			af[3] = f16;
		// 1205 2410:aload_1         
		// 1206 2411:iconst_3        
		// 1207 2412:fload           15
		// 1208 2414:fastore         
			af[4] = f15;
		// 1209 2415:aload_1         
		// 1210 2416:iconst_4        
		// 1211 2417:fload           14
		// 1212 2419:fastore         
			af[5] = f14;
		// 1213 2420:aload_1         
		// 1214 2421:iconst_5        
		// 1215 2422:fload           13
		// 1216 2424:fastore         
		// 1217 2425:return          
		}

		private static void arcToBezier(Path path, double d1, double d2, double d3, double d4, double d5, double d6, double d7, 
				double d8, double d9)
		{
			int j = (int)Math.ceil(Math.abs((4D * d9) / 3.1415926535897931D));
		//    0    0:ldc2w           #67  <Double 4D>
		//    1    3:dload           17
		//    2    5:dmul            
		//    3    6:ldc2w           #69  <Double 3.1415926535897931D>
		//    4    9:ddiv            
		//    5   10:invokestatic    #76  <Method double Math.abs(double)>
		//    6   13:invokestatic    #79  <Method double Math.ceil(double)>
		//    7   16:d2i             
		//    8   17:istore          38
			double d10 = d8;
		//    9   19:dload           15
		//   10   21:dstore          19
			double d18 = Math.cos(d7);
		//   11   23:dload           13
		//   12   25:invokestatic    #82  <Method double Math.cos(double)>
		//   13   28:dstore          29
			double d19 = Math.sin(d7);
		//   14   30:dload           13
		//   15   32:invokestatic    #85  <Method double Math.sin(double)>
		//   16   35:dstore          31
			d7 = Math.cos(d10);
		//   17   37:dload           19
		//   18   39:invokestatic    #82  <Method double Math.cos(double)>
		//   19   42:dstore          13
			d8 = Math.sin(d10);
		//   20   44:dload           19
		//   21   46:invokestatic    #85  <Method double Math.sin(double)>
		//   22   49:dstore          15
			double d12 = -d3 * d18 * d8 - d4 * d19 * d7;
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
			double d14 = -d3 * d19 * d8 + d4 * d18 * d7;
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
			double d20 = d9 / (double)j;
		//   49   91:dload           17
		//   50   93:iload           38
		//   51   95:i2d             
		//   52   96:ddiv            
		//   53   97:dstore          33
			int i = 0;
		//   54   99:iconst_0        
		//   55  100:istore          37
			d8 = d6;
		//   56  102:dload           11
		//   57  104:dstore          15
			d7 = d5;
		//   58  106:dload           9
		//   59  108:dstore          13
			d6 = d14;
		//   60  110:dload           23
		//   61  112:dstore          11
			d5 = d12;
		//   62  114:dload           21
		//   63  116:dstore          9
			d9 = d10;
		//   64  118:dload           19
		//   65  120:dstore          17
			for(; i < j; i++)
		//*  66  122:iload           37
		//*  67  124:iload           38
		//*  68  126:icmpge          378
			{
				double d17 = d9 + d20;
		//   69  129:dload           17
		//   70  131:dload           33
		//   71  133:dadd            
		//   72  134:dstore          27
				double d15 = Math.sin(d17);
		//   73  136:dload           27
		//   74  138:invokestatic    #85  <Method double Math.sin(double)>
		//   75  141:dstore          23
				double d21 = Math.cos(d17);
		//   76  143:dload           27
		//   77  145:invokestatic    #82  <Method double Math.cos(double)>
		//   78  148:dstore          35
				double d16 = (d3 * d18 * d21 + d1) - d4 * d19 * d15;
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
				double d13 = d3 * d19 * d21 + d2 + d4 * d18 * d15;
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
				double d11 = -d3 * d18 * d15 - d4 * d19 * d21;
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
				d15 = -d3 * d19 * d15 + d4 * d18 * d21;
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
				d21 = Math.tan((d17 - d9) / 2D);
		//  133  232:dload           27
		//  134  234:dload           17
		//  135  236:dsub            
		//  136  237:ldc2w           #86  <Double 2D>
		//  137  240:ddiv            
		//  138  241:invokestatic    #90  <Method double Math.tan(double)>
		//  139  244:dstore          35
				d9 = (Math.sin(d17 - d9) * (Math.sqrt(3D * d21 * d21 + 4D) - 1.0D)) / 3D;
		//  140  246:dload           27
		//  141  248:dload           17
		//  142  250:dsub            
		//  143  251:invokestatic    #85  <Method double Math.sin(double)>
		//  144  254:ldc2w           #91  <Double 3D>
		//  145  257:dload           35
		//  146  259:dmul            
		//  147  260:dload           35
		//  148  262:dmul            
		//  149  263:ldc2w           #67  <Double 4D>
		//  150  266:dadd            
		//  151  267:invokestatic    #95  <Method double Math.sqrt(double)>
		//  152  270:dconst_1        
		//  153  271:dsub            
		//  154  272:dmul            
		//  155  273:ldc2w           #91  <Double 3D>
		//  156  276:ddiv            
		//  157  277:dstore          17
				path.rCubicTo((float)(d7 + d9 * d5) - (float)d7, (float)(d8 + d9 * d6) - (float)d8, (float)(d16 - d9 * d11) - (float)d7, (float)(d13 - d9 * d15) - (float)d8, (float)d16 - (float)d7, (float)d13 - (float)d8);
		//  158  279:aload_0         
		//  159  280:dload           13
		//  160  282:dload           17
		//  161  284:dload           9
		//  162  286:dmul            
		//  163  287:dadd            
		//  164  288:d2f             
		//  165  289:dload           13
		//  166  291:d2f             
		//  167  292:fsub            
		//  168  293:dload           15
		//  169  295:dload           17
		//  170  297:dload           11
		//  171  299:dmul            
		//  172  300:dadd            
		//  173  301:d2f             
		//  174  302:dload           15
		//  175  304:d2f             
		//  176  305:fsub            
		//  177  306:dload           25
		//  178  308:dload           17
		//  179  310:dload           19
		//  180  312:dmul            
		//  181  313:dsub            
		//  182  314:d2f             
		//  183  315:dload           13
		//  184  317:d2f             
		//  185  318:fsub            
		//  186  319:dload           21
		//  187  321:dload           17
		//  188  323:dload           23
		//  189  325:dmul            
		//  190  326:dsub            
		//  191  327:d2f             
		//  192  328:dload           15
		//  193  330:d2f             
		//  194  331:fsub            
		//  195  332:dload           25
		//  196  334:d2f             
		//  197  335:dload           13
		//  198  337:d2f             
		//  199  338:fsub            
		//  200  339:dload           21
		//  201  341:d2f             
		//  202  342:dload           15
		//  203  344:d2f             
		//  204  345:fsub            
		//  205  346:invokevirtual   #50  <Method void Path.rCubicTo(float, float, float, float, float, float)>
				d9 = d17;
		//  206  349:dload           27
		//  207  351:dstore          17
				d7 = d16;
		//  208  353:dload           25
		//  209  355:dstore          13
				d8 = d13;
		//  210  357:dload           21
		//  211  359:dstore          15
				d5 = d11;
		//  212  361:dload           19
		//  213  363:dstore          9
				d6 = d15;
		//  214  365:dload           23
		//  215  367:dstore          11
			}

		//  216  369:iload           37
		//  217  371:iconst_1        
		//  218  372:iadd            
		//  219  373:istore          37
		//* 220  375:goto            122
		//  221  378:return          
		}

		private static void drawArc(Path path, float f, float f1, float f2, float f3, float f4, float f5, float f6, 
				boolean flag, boolean flag1)
		{
			double d5 = Math.toRadians(f6);
		//    0    0:fload           7
		//    1    2:f2d             
		//    2    3:invokestatic    #98  <Method double Math.toRadians(double)>
		//    3    6:dstore          18
			double d6 = Math.cos(d5);
		//    4    8:dload           18
		//    5   10:invokestatic    #82  <Method double Math.cos(double)>
		//    6   13:dstore          20
			double d7 = Math.sin(d5);
		//    7   15:dload           18
		//    8   17:invokestatic    #85  <Method double Math.sin(double)>
		//    9   20:dstore          22
			double d8 = ((double)f * d6 + (double)f1 * d7) / (double)f4;
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
			double d9 = ((double)(-f) * d7 + (double)f1 * d6) / (double)f5;
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
			double d1 = ((double)f2 * d6 + (double)f3 * d7) / (double)f4;
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
			double d4 = ((double)(-f2) * d7 + (double)f3 * d6) / (double)f5;
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
			double d11 = d8 - d1;
		//   64   94:dload           24
		//   65   96:dload           10
		//   66   98:dsub            
		//   67   99:dstore          30
			double d10 = d9 - d4;
		//   68  101:dload           26
		//   69  103:dload           16
		//   70  105:dsub            
		//   71  106:dstore          28
			double d3 = (d8 + d1) / 2D;
		//   72  108:dload           24
		//   73  110:dload           10
		//   74  112:dadd            
		//   75  113:ldc2w           #86  <Double 2D>
		//   76  116:ddiv            
		//   77  117:dstore          14
			double d2 = (d9 + d4) / 2D;
		//   78  119:dload           26
		//   79  121:dload           16
		//   80  123:dadd            
		//   81  124:ldc2w           #86  <Double 2D>
		//   82  127:ddiv            
		//   83  128:dstore          12
			double d12 = d11 * d11 + d10 * d10;
		//   84  130:dload           30
		//   85  132:dload           30
		//   86  134:dmul            
		//   87  135:dload           28
		//   88  137:dload           28
		//   89  139:dmul            
		//   90  140:dadd            
		//   91  141:dstore          32
			if(d12 == 0.0D)
		//*  92  143:dload           32
		//*  93  145:dconst_0        
		//*  94  146:dcmpl           
		//*  95  147:ifne            159
			{
				Log.w("PathParser", " Points are coincident");
		//   96  150:ldc1            #100 <String "PathParser">
		//   97  152:ldc1            #102 <String " Points are coincident">
		//   98  154:invokestatic    #108 <Method int Log.w(String, String)>
		//   99  157:pop             
				return;
		//  100  158:return          
			}
			double d13 = 1.0D / d12 - 0.25D;
		//  101  159:dconst_1        
		//  102  160:dload           32
		//  103  162:ddiv            
		//  104  163:ldc2w           #109 <Double 0.25D>
		//  105  166:dsub            
		//  106  167:dstore          34
			if(d13 < 0.0D)
		//* 107  169:dload           34
		//* 108  171:dconst_0        
		//* 109  172:dcmpg           
		//* 110  173:ifge            240
			{
				Log.w("PathParser", (new StringBuilder()).append("Points are too far apart ").append(d12).toString());
		//  111  176:ldc1            #100 <String "PathParser">
		//  112  178:new             #112 <Class StringBuilder>
		//  113  181:dup             
		//  114  182:invokespecial   #113 <Method void StringBuilder()>
		//  115  185:ldc1            #115 <String "Points are too far apart ">
		//  116  187:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//  117  190:dload           32
		//  118  192:invokevirtual   #122 <Method StringBuilder StringBuilder.append(double)>
		//  119  195:invokevirtual   #126 <Method String StringBuilder.toString()>
		//  120  198:invokestatic    #108 <Method int Log.w(String, String)>
		//  121  201:pop             
				float f7 = (float)(Math.sqrt(d12) / 1.9999899999999999D);
		//  122  202:dload           32
		//  123  204:invokestatic    #95  <Method double Math.sqrt(double)>
		//  124  207:ldc2w           #127 <Double 1.9999899999999999D>
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
		//  142  236:invokestatic    #64  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
				return;
		//  143  239:return          
			}
			d12 = Math.sqrt(d13);
		//  144  240:dload           34
		//  145  242:invokestatic    #95  <Method double Math.sqrt(double)>
		//  146  245:dstore          32
			d11 = d12 * d11;
		//  147  247:dload           32
		//  148  249:dload           30
		//  149  251:dmul            
		//  150  252:dstore          30
			d10 = d12 * d10;
		//  151  254:dload           32
		//  152  256:dload           28
		//  153  258:dmul            
		//  154  259:dstore          28
			if(flag == flag1)
		//* 155  261:iload           8
		//* 156  263:iload           9
		//* 157  265:icmpne          285
			{
				d3 -= d10;
		//  158  268:dload           14
		//  159  270:dload           28
		//  160  272:dsub            
		//  161  273:dstore          14
				d2 += d11;
		//  162  275:dload           12
		//  163  277:dload           30
		//  164  279:dadd            
		//  165  280:dstore          12
			} else
		//* 166  282:goto            299
			{
				d3 += d10;
		//  167  285:dload           14
		//  168  287:dload           28
		//  169  289:dadd            
		//  170  290:dstore          14
				d2 -= d11;
		//  171  292:dload           12
		//  172  294:dload           30
		//  173  296:dsub            
		//  174  297:dstore          12
			}
			d8 = Math.atan2(d9 - d2, d8 - d3);
		//  175  299:dload           26
		//  176  301:dload           12
		//  177  303:dsub            
		//  178  304:dload           24
		//  179  306:dload           14
		//  180  308:dsub            
		//  181  309:invokestatic    #132 <Method double Math.atan2(double, double)>
		//  182  312:dstore          24
			d4 = Math.atan2(d4 - d2, d1 - d3) - d8;
		//  183  314:dload           16
		//  184  316:dload           12
		//  185  318:dsub            
		//  186  319:dload           10
		//  187  321:dload           14
		//  188  323:dsub            
		//  189  324:invokestatic    #132 <Method double Math.atan2(double, double)>
		//  190  327:dload           24
		//  191  329:dsub            
		//  192  330:dstore          16
			if(d4 >= 0.0D)
		//* 193  332:dload           16
		//* 194  334:dconst_0        
		//* 195  335:dcmpl           
		//* 196  336:iflt            345
				flag = true;
		//  197  339:iconst_1        
		//  198  340:istore          8
			else
		//* 199  342:goto            348
				flag = false;
		//  200  345:iconst_0        
		//  201  346:istore          8
			d1 = d4;
		//  202  348:dload           16
		//  203  350:dstore          10
			if(flag1 != flag)
		//* 204  352:iload           9
		//* 205  354:iload           8
		//* 206  356:icmpeq          385
				if(d4 > 0.0D)
		//* 207  359:dload           16
		//* 208  361:dconst_0        
		//* 209  362:dcmpl           
		//* 210  363:ifle            377
					d1 = d4 - 6.2831853071795862D;
		//  211  366:dload           16
		//  212  368:ldc2w           #133 <Double 6.2831853071795862D>
		//  213  371:dsub            
		//  214  372:dstore          10
				else
		//* 215  374:goto            385
					d1 = d4 + 6.2831853071795862D;
		//  216  377:dload           16
		//  217  379:ldc2w           #133 <Double 6.2831853071795862D>
		//  218  382:dadd            
		//  219  383:dstore          10
			d3 *= f4;
		//  220  385:dload           14
		//  221  387:fload           5
		//  222  389:f2d             
		//  223  390:dmul            
		//  224  391:dstore          14
			d2 *= f5;
		//  225  393:dload           12
		//  226  395:fload           6
		//  227  397:f2d             
		//  228  398:dmul            
		//  229  399:dstore          12
			arcToBezier(path, d3 * d6 - d2 * d7, d3 * d7 + d2 * d6, f4, f5, f, f1, d5, d8, d1);
		//  230  401:aload_0         
		//  231  402:dload           14
		//  232  404:dload           20
		//  233  406:dmul            
		//  234  407:dload           12
		//  235  409:dload           22
		//  236  411:dmul            
		//  237  412:dsub            
		//  238  413:dload           14
		//  239  415:dload           22
		//  240  417:dmul            
		//  241  418:dload           12
		//  242  420:dload           20
		//  243  422:dmul            
		//  244  423:dadd            
		//  245  424:fload           5
		//  246  426:f2d             
		//  247  427:fload           6
		//  248  429:f2d             
		//  249  430:fload_1         
		//  250  431:f2d             
		//  251  432:fload_2         
		//  252  433:f2d             
		//  253  434:dload           18
		//  254  436:dload           24
		//  255  438:dload           10
		//  256  440:invokestatic    #136 <Method void arcToBezier(Path, double, double, double, double, double, double, double, double, double)>
		//  257  443:return          
		}

		public static void nodesToPath(PathDataNode apathdatanode[], Path path)
		{
			float af[] = new float[6];
		//    0    0:bipush          6
		//    1    2:newarray        float[]
		//    2    4:astore          4
			char c1 = 'm';
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
				addCommand(path, af, c1, apathdatanode[i].type, apathdatanode[i].params);
		//   11   17:aload_1         
		//   12   18:aload           4
		//   13   20:iload_2         
		//   14   21:aload_0         
		//   15   22:iload_3         
		//   16   23:aaload          
		//   17   24:getfield        #18  <Field char type>
		//   18   27:aload_0         
		//   19   28:iload_3         
		//   20   29:aaload          
		//   21   30:getfield        #20  <Field float[] params>
		//   22   33:invokestatic    #140 <Method void addCommand(Path, float[], char, char, float[])>
				c1 = apathdatanode[i].type;
		//   23   36:aload_0         
		//   24   37:iload_3         
		//   25   38:aaload          
		//   26   39:getfield        #18  <Field char type>
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
			for(int i = 0; i < pathdatanode.params.length; i++)
		//*   0    0:iconst_0        
		//*   1    1:istore          4
		//*   2    3:iload           4
		//*   3    5:aload_1         
		//*   4    6:getfield        #20  <Field float[] params>
		//*   5    9:arraylength     
		//*   6   10:icmpge          50
				params[i] = pathdatanode.params[i] * (1.0F - f) + pathdatanode1.params[i] * f;
		//    7   13:aload_0         
		//    8   14:getfield        #20  <Field float[] params>
		//    9   17:iload           4
		//   10   19:aload_1         
		//   11   20:getfield        #20  <Field float[] params>
		//   12   23:iload           4
		//   13   25:faload          
		//   14   26:fconst_1        
		//   15   27:fload_3         
		//   16   28:fsub            
		//   17   29:fmul            
		//   18   30:aload_2         
		//   19   31:getfield        #20  <Field float[] params>
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

		float params[];
		char type;

		PathDataNode(char c1, float af[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			type = c1;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field char type>
			params = af;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field float[] params>
		//    8   14:return          
		}

		PathDataNode(PathDataNode pathdatanode)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			type = pathdatanode.type;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #18  <Field char type>
		//    5    9:putfield        #18  <Field char type>
			params = PathParser.a(pathdatanode.params, 0, pathdatanode.params.length);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #20  <Field float[] params>
		//    9   17:iconst_0        
		//   10   18:aload_1         
		//   11   19:getfield        #20  <Field float[] params>
		//   12   22:arraylength     
		//   13   23:invokestatic    #26  <Method float[] PathParser.a(float[], int, int)>
		//   14   26:putfield        #20  <Field float[] params>
		//   15   29:return          
		}
	}

	static class e
	{

		boolean a;
		int e;

		e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	PathParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	private static int a(String s, int i)
	{
		for(; i < s.length(); i++)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #23  <Method int String.length()>
	//*   3    5:icmpge          59
		{
			char c1 = s.charAt(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #27  <Method char String.charAt(int)>
	//    7   13:istore_2        
			if(((c1 - 65) * (c1 - 90) <= 0 || (c1 - 97) * (c1 - 122) <= 0) && c1 != 'e' && c1 != 'E')
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

	private static float[] a(String s)
	{
		int i;
		int j;
		int k;
		int l;
		if(s.charAt(0) == 'z')
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #27  <Method char String.charAt(int)>
	//*   3    5:bipush          122
	//*   4    7:icmpne          15
			i = 1;
	//    5   10:iconst_1        
	//    6   11:istore_1        
		else
	//*   7   12:goto            17
			i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_1        
		if(s.charAt(0) == 'Z')
	//*  10   17:aload_0         
	//*  11   18:iconst_0        
	//*  12   19:invokevirtual   #27  <Method char String.charAt(int)>
	//*  13   22:bipush          90
	//*  14   24:icmpne          32
			j = 1;
	//   15   27:iconst_1        
	//   16   28:istore_2        
		else
	//*  17   29:goto            34
			j = 0;
	//   18   32:iconst_0        
	//   19   33:istore_2        
		if(i | j)
	//*  20   34:iload_1         
	//*  21   35:iload_2         
	//*  22   36:ior             
	//*  23   37:ifeq            44
			return new float[0];
	//   24   40:iconst_0        
	//   25   41:newarray        float[]
	//   26   43:areturn         
		int i1;
		float af[];
		e e1;
		try
		{
			af = new float[s.length()];
	//   27   44:aload_0         
	//   28   45:invokevirtual   #23  <Method int String.length()>
	//   29   48:newarray        float[]
	//   30   50:astore          6
		}
	//*  31   52:iconst_0        
	//*  32   53:istore_2        
	//*  33   54:iconst_1        
	//*  34   55:istore_1        
	//*  35   56:new             #9   <Class PathParser$e>
	//*  36   59:dup             
	//*  37   60:invokespecial   #31  <Method void PathParser$e()>
	//*  38   63:astore          7
	//*  39   65:aload_0         
	//*  40   66:invokevirtual   #23  <Method int String.length()>
	//*  41   69:istore          5
	//*  42   71:iload_1         
	//*  43   72:iload           5
	//*  44   74:icmpge          133
	//*  45   77:aload_0         
	//*  46   78:iload_1         
	//*  47   79:aload           7
	//*  48   81:invokestatic    #34  <Method void e(String, int, PathParser$e)>
	//*  49   84:aload           7
	//*  50   86:getfield        #37  <Field int PathParser$e.e>
	//*  51   89:istore          4
	//*  52   91:iload_2         
	//*  53   92:istore_3        
	//*  54   93:iload_1         
	//*  55   94:iload           4
	//*  56   96:icmpge          117
	//*  57   99:iload_2         
	//*  58  100:iconst_1        
	//*  59  101:iadd            
	//*  60  102:istore_3        
	//*  61  103:aload           6
	//*  62  105:iload_2         
	//*  63  106:aload_0         
	//*  64  107:iload_1         
	//*  65  108:iload           4
	//*  66  110:invokevirtual   #41  <Method String String.substring(int, int)>
	//*  67  113:invokestatic    #47  <Method float Float.parseFloat(String)>
	//*  68  116:fastore         
	//*  69  117:aload           7
	//*  70  119:getfield        #50  <Field boolean PathParser$e.a>
	//*  71  122:ifeq            181
	//*  72  125:iload           4
	//*  73  127:istore_1        
	//*  74  128:iload_3         
	//*  75  129:istore_2        
	//*  76  130:goto            71
	//*  77  133:aload           6
	//*  78  135:iconst_0        
	//*  79  136:iload_2         
	//*  80  137:invokestatic    #53  <Method float[] a(float[], int, int)>
	//*  81  140:astore          6
	//*  82  142:aload           6
	//*  83  144:areturn         
		catch(NumberFormatException numberformatexception)
	//*  84  145:astore          6
		{
			throw new RuntimeException((new StringBuilder()).append("error in parsing \"").append(s).append("\"").toString(), ((Throwable) (numberformatexception)));
	//   85  147:new             #55  <Class RuntimeException>
	//   86  150:dup             
	//   87  151:new             #57  <Class StringBuilder>
	//   88  154:dup             
	//   89  155:invokespecial   #58  <Method void StringBuilder()>
	//   90  158:ldc1            #60  <String "error in parsing \"">
	//   91  160:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   92  163:aload_0         
	//   93  164:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   94  167:ldc1            #66  <String "\"">
	//   95  169:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   96  172:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   97  175:aload           6
	//   98  177:invokespecial   #73  <Method void RuntimeException(String, Throwable)>
	//   99  180:athrow          
		}
		j = 0;
		i = 1;
		e1 = new e();
		i1 = s.length();
_L3:
		if(i >= i1) goto _L2; else goto _L1
_L1:
		e(s, i, e1);
		l = e1.e;
		k = j;
		if(i >= l)
			break MISSING_BLOCK_LABEL_117;
		k = j + 1;
		af[j] = Float.parseFloat(s.substring(i, l));
		if(e1.a)
		{
			i = l;
			j = k;
		} else
		{
			i = l + 1;
	//  100  181:iload           4
	//  101  183:iconst_1        
	//  102  184:iadd            
	//  103  185:istore_1        
			j = k;
	//  104  186:iload_3         
	//  105  187:istore_2        
		}
		if(true) goto _L3; else goto _L2
	//  106  188:goto            71
_L2:
		af = a(af, 0, j);
		return af;
	}

	static float[] a(float af[], int i, int j)
	{
		if(i > j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          13
			throw new IllegalArgumentException();
	//    3    5:new             #75  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #76  <Method void IllegalArgumentException()>
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
	//   15   25:new             #78  <Class ArrayIndexOutOfBoundsException>
	//   16   28:dup             
	//   17   29:invokespecial   #79  <Method void ArrayIndexOutOfBoundsException()>
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
	//   27   41:invokestatic    #85  <Method int Math.min(int, int)>
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
	//   37   56:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
			return af1;
	//   38   59:aload           4
	//   39   61:areturn         
		}
	}

	private static void b(ArrayList arraylist, char c1, float af[])
	{
		arraylist.add(((Object) (new PathDataNode(c1, af))));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class PathParser$PathDataNode>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #96  <Method void PathParser$PathDataNode(char, float[])>
	//    6   10:invokevirtual   #102 <Method boolean ArrayList.add(Object)>
	//    7   13:pop             
	//    8   14:return          
	}

	public static PathDataNode[] b(PathDataNode apathdatanode[])
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
	//   16   22:new             #6   <Class PathParser$PathDataNode>
	//   17   25:dup             
	//   18   26:aload_0         
	//   19   27:iload_1         
	//   20   28:aaload          
	//   21   29:invokespecial   #108 <Method void PathParser$PathDataNode(PathParser$PathDataNode)>
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

	public static PathDataNode[] c(String s)
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
	//    8   10:new             #98  <Class ArrayList>
	//    9   13:dup             
	//   10   14:invokespecial   #111 <Method void ArrayList()>
	//   11   17:astore_3        
		for(; j < s.length(); j++)
	//*  12   18:iload_2         
	//*  13   19:aload_0         
	//*  14   20:invokevirtual   #23  <Method int String.length()>
	//*  15   23:icmpge          79
		{
			j = a(s, j);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:invokestatic    #113 <Method int a(String, int)>
	//   19   31:istore_2        
			String s1 = s.substring(i, j).trim();
	//   20   32:aload_0         
	//   21   33:iload_1         
	//   22   34:iload_2         
	//   23   35:invokevirtual   #41  <Method String String.substring(int, int)>
	//   24   38:invokevirtual   #116 <Method String String.trim()>
	//   25   41:astore          4
			if(s1.length() > 0)
	//*  26   43:aload           4
	//*  27   45:invokevirtual   #23  <Method int String.length()>
	//*  28   48:ifle            70
			{
				float af[] = a(s1);
	//   29   51:aload           4
	//   30   53:invokestatic    #118 <Method float[] a(String)>
	//   31   56:astore          5
				b(arraylist, s1.charAt(0), af);
	//   32   58:aload_3         
	//   33   59:aload           4
	//   34   61:iconst_0        
	//   35   62:invokevirtual   #27  <Method char String.charAt(int)>
	//   36   65:aload           5
	//   37   67:invokestatic    #120 <Method void b(ArrayList, char, float[])>
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
	//*  52   88:invokevirtual   #23  <Method int String.length()>
	//*  53   91:icmpge          106
			b(arraylist, s.charAt(i), new float[0]);
	//   54   94:aload_3         
	//   55   95:aload_0         
	//   56   96:iload_1         
	//   57   97:invokevirtual   #27  <Method char String.charAt(int)>
	//   58  100:iconst_0        
	//   59  101:newarray        float[]
	//   60  103:invokestatic    #120 <Method void b(ArrayList, char, float[])>
		return (PathDataNode[])arraylist.toArray(((Object []) (new PathDataNode[arraylist.size()])));
	//   61  106:aload_3         
	//   62  107:aload_3         
	//   63  108:invokevirtual   #123 <Method int ArrayList.size()>
	//   64  111:anewarray       PathDataNode[]
	//   65  114:invokevirtual   #127 <Method Object[] ArrayList.toArray(Object[])>
	//   66  117:checkcast       #129 <Class PathParser$PathDataNode[]>
	//   67  120:areturn         
	}

	public static boolean d(PathDataNode apathdatanode[], PathDataNode apathdatanode1[])
	{
		if(apathdatanode == null || apathdatanode1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
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
		for(int i = 0; i < apathdatanode.length; i++)
	//*  13   19:iconst_0        
	//*  14   20:istore_2        
	//*  15   21:iload_2         
	//*  16   22:aload_0         
	//*  17   23:arraylength     
	//*  18   24:icmpge          68
			if(apathdatanode[i].type != apathdatanode1[i].type || apathdatanode[i].params.length != apathdatanode1[i].params.length)
	//*  19   27:aload_0         
	//*  20   28:iload_2         
	//*  21   29:aaload          
	//*  22   30:getfield        #135 <Field char PathParser$PathDataNode.type>
	//*  23   33:aload_1         
	//*  24   34:iload_2         
	//*  25   35:aaload          
	//*  26   36:getfield        #135 <Field char PathParser$PathDataNode.type>
	//*  27   39:icmpne          59
	//*  28   42:aload_0         
	//*  29   43:iload_2         
	//*  30   44:aaload          
	//*  31   45:getfield        #139 <Field float[] PathParser$PathDataNode.params>
	//*  32   48:arraylength     
	//*  33   49:aload_1         
	//*  34   50:iload_2         
	//*  35   51:aaload          
	//*  36   52:getfield        #139 <Field float[] PathParser$PathDataNode.params>
	//*  37   55:arraylength     
	//*  38   56:icmpeq          61
				return false;
	//   39   59:iconst_0        
	//   40   60:ireturn         

	//   41   61:iload_2         
	//   42   62:iconst_1        
	//   43   63:iadd            
	//   44   64:istore_2        
	//*  45   65:goto            21
		return true;
	//   46   68:iconst_1        
	//   47   69:ireturn         
	}

	private static void e(String s, int i, e e1)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore          6
		boolean flag3 = false;
	//    2    3:iconst_0        
	//    3    4:istore          7
		e1.a = false;
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:putfield        #50  <Field boolean PathParser$e.a>
		boolean flag2 = false;
	//    7   11:iconst_0        
	//    8   12:istore          5
		boolean flag4 = false;
	//    9   14:iconst_0        
	//   10   15:istore          8
		do
		{
			if(j >= s.length())
				break;
	//   11   17:iload           6
	//   12   19:aload_0         
	//   13   20:invokevirtual   #23  <Method int String.length()>
	//   14   23:icmpge          243
			boolean flag6 = false;
	//   15   26:iconst_0        
	//   16   27:istore          10
			boolean flag;
			boolean flag1;
			boolean flag5;
			switch(s.charAt(j))
	//*  17   29:aload_0         
	//*  18   30:iload           6
	//*  19   32:invokevirtual   #27  <Method char String.charAt(int)>
			{
	//*  20   35:lookupswitch    6: default 92
	//	               32: 106
	//	               44: 106
	//	               45: 119
	//	               46: 170
	//	               69: 206
	//	               101: 206
			default:
				flag = flag3;
	//   21   92:iload           7
	//   22   94:istore_3        
				flag5 = flag2;
	//   23   95:iload           5
	//   24   97:istore          9
				flag1 = flag6;
	//   25   99:iload           10
	//   26  101:istore          4
				break;

	//*  27  103:goto            216
			case 32: // ' '
			case 44: // ','
				flag = true;
	//   28  106:iconst_1        
	//   29  107:istore_3        
				flag5 = flag2;
	//   30  108:iload           5
	//   31  110:istore          9
				flag1 = flag6;
	//   32  112:iload           10
	//   33  114:istore          4
				break;

	//*  34  116:goto            216
			case 45: // '-'
				flag = flag3;
	//   35  119:iload           7
	//   36  121:istore_3        
				flag5 = flag2;
	//   37  122:iload           5
	//   38  124:istore          9
				flag1 = flag6;
	//   39  126:iload           10
	//   40  128:istore          4
				if(j != i)
	//*  41  130:iload           6
	//*  42  132:iload_1         
	//*  43  133:icmpeq          216
				{
					flag = flag3;
	//   44  136:iload           7
	//   45  138:istore_3        
					flag5 = flag2;
	//   46  139:iload           5
	//   47  141:istore          9
					flag1 = flag6;
	//   48  143:iload           10
	//   49  145:istore          4
					if(!flag4)
	//*  50  147:iload           8
	//*  51  149:ifne            216
					{
						flag = true;
	//   52  152:iconst_1        
	//   53  153:istore_3        
						e1.a = true;
	//   54  154:aload_2         
	//   55  155:iconst_1        
	//   56  156:putfield        #50  <Field boolean PathParser$e.a>
						flag5 = flag2;
	//   57  159:iload           5
	//   58  161:istore          9
						flag1 = flag6;
	//   59  163:iload           10
	//   60  165:istore          4
					}
				}
				break;

	//*  61  167:goto            216
			case 46: // '.'
				if(!flag2)
	//*  62  170:iload           5
	//*  63  172:ifne            188
				{
					flag5 = true;
	//   64  175:iconst_1        
	//   65  176:istore          9
					flag = flag3;
	//   66  178:iload           7
	//   67  180:istore_3        
					flag1 = flag6;
	//   68  181:iload           10
	//   69  183:istore          4
				} else
	//*  70  185:goto            216
				{
					flag = true;
	//   71  188:iconst_1        
	//   72  189:istore_3        
					e1.a = true;
	//   73  190:aload_2         
	//   74  191:iconst_1        
	//   75  192:putfield        #50  <Field boolean PathParser$e.a>
					flag5 = flag2;
	//   76  195:iload           5
	//   77  197:istore          9
					flag1 = flag6;
	//   78  199:iload           10
	//   79  201:istore          4
				}
				break;

	//*  80  203:goto            216
			case 69: // 'E'
			case 101: // 'e'
				flag1 = true;
	//   81  206:iconst_1        
	//   82  207:istore          4
				flag5 = flag2;
	//   83  209:iload           5
	//   84  211:istore          9
				flag = flag3;
	//   85  213:iload           7
	//   86  215:istore_3        
				break;
			}
			if(flag)
	//*  87  216:iload_3         
	//*  88  217:ifeq            223
				break;
	//   89  220:goto            243
			j++;
	//   90  223:iload           6
	//   91  225:iconst_1        
	//   92  226:iadd            
	//   93  227:istore          6
			flag3 = flag;
	//   94  229:iload_3         
	//   95  230:istore          7
			flag2 = flag5;
	//   96  232:iload           9
	//   97  234:istore          5
			flag4 = flag1;
	//   98  236:iload           4
	//   99  238:istore          8
		} while(true);
	//  100  240:goto            17
		e1.e = j;
	//  101  243:aload_2         
	//  102  244:iload           6
	//  103  246:putfield        #37  <Field int PathParser$e.e>
	//  104  249:return          
	}

	public static void e(PathDataNode apathdatanode[], PathDataNode apathdatanode1[])
	{
		for(int i = 0; i < apathdatanode1.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:icmpge          63
		{
			apathdatanode[i].type = apathdatanode1[i].type;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:aaload          
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:getfield        #135 <Field char PathParser$PathDataNode.type>
	//   13   17:putfield        #135 <Field char PathParser$PathDataNode.type>
			for(int j = 0; j < apathdatanode1[i].params.length; j++)
	//*  14   20:iconst_0        
	//*  15   21:istore_3        
	//*  16   22:iload_3         
	//*  17   23:aload_1         
	//*  18   24:iload_2         
	//*  19   25:aaload          
	//*  20   26:getfield        #139 <Field float[] PathParser$PathDataNode.params>
	//*  21   29:arraylength     
	//*  22   30:icmpge          56
				apathdatanode[i].params[j] = apathdatanode1[i].params[j];
	//   23   33:aload_0         
	//   24   34:iload_2         
	//   25   35:aaload          
	//   26   36:getfield        #139 <Field float[] PathParser$PathDataNode.params>
	//   27   39:iload_3         
	//   28   40:aload_1         
	//   29   41:iload_2         
	//   30   42:aaload          
	//   31   43:getfield        #139 <Field float[] PathParser$PathDataNode.params>
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
