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
		float f6;
		float f12;
		float f15;
		float f20;
		f6 = af[0];
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:faload          
	//    3    3:fstore          11
		f12 = af[1];
	//    4    5:aload_1         
	//    5    6:iconst_1        
	//    6    7:faload          
	//    7    8:fstore          12
		f15 = af[2];
	//    8   10:aload_1         
	//    9   11:iconst_2        
	//   10   12:faload          
	//   11   13:fstore          13
		f20 = af[3];
	//   12   15:aload_1         
	//   13   16:iconst_3        
	//   14   17:faload          
	//   15   18:fstore          14
		f5 = af[4];
	//   16   20:aload_1         
	//   17   21:iconst_4        
	//   18   22:faload          
	//   19   23:fstore          10
		f4 = af[5];
	//   20   25:aload_1         
	//   21   26:iconst_5        
	//   22   27:faload          
	//   23   28:fstore          9
		f = f6;
	//   24   30:fload           11
	//   25   32:fstore          5
		f1 = f12;
	//   26   34:fload           12
	//   27   36:fstore          6
		f2 = f15;
	//   28   38:fload           13
	//   29   40:fstore          7
		f3 = f20;
	//   30   42:fload           14
	//   31   44:fstore          8
		c1;
	//   32   46:iload_3         
		JVM INSTR lookupswitch 20: default 216
	//	               65: 320
	//	               67: 313
	//	               72: 291
	//	               76: 232
	//	               77: 232
	//	               81: 269
	//	               83: 269
	//	               84: 232
	//	               86: 291
	//	               90: 238
	//	               97: 320
	//	               99: 313
	//	               104: 291
	//	               108: 232
	//	               109: 232
	//	               113: 269
	//	               115: 269
	//	               116: 232
	//	               118: 291
	//	               122: 238;
	//   33   47:lookupswitch    20: default 216
	//	               65: 320
	//	               67: 313
	//	               72: 291
	//	               76: 232
	//	               77: 232
	//	               81: 269
	//	               83: 269
	//	               84: 232
	//	               86: 291
	//	               90: 238
	//	               97: 320
	//	               99: 313
	//	               104: 291
	//	               108: 232
	//	               109: 232
	//	               113: 269
	//	               115: 269
	//	               116: 232
	//	               118: 291
	//	               122: 238
		   goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L6 _L5 _L4 _L7 _L2 _L3 _L4 _L5 _L5 _L6 _L6 _L5 _L4 _L7
_L1:
		f3 = f20;
	//   34  216:fload           14
	//   35  218:fstore          8
		f2 = f15;
	//   36  220:fload           13
	//   37  222:fstore          7
		f1 = f12;
	//   38  224:fload           12
	//   39  226:fstore          6
		f = f6;
	//   40  228:fload           11
	//   41  230:fstore          5
_L5:
		byte byte0;
		byte0 = 2;
	//   42  232:iconst_2        
	//   43  233:istore          15
		break; /* Loop/switch isn't completed */
	//   44  235:goto            340
_L7:
		path.close();
	//   45  238:aload_0         
	//   46  239:invokevirtual   #37  <Method void Path.close()>
		path.moveTo(f5, f4);
	//   47  242:aload_0         
	//   48  243:fload           10
	//   49  245:fload           9
	//   50  247:invokevirtual   #41  <Method void Path.moveTo(float, float)>
		f = f5;
	//   51  250:fload           10
	//   52  252:fstore          5
		f2 = f;
	//   53  254:fload           5
	//   54  256:fstore          7
		f1 = f4;
	//   55  258:fload           9
	//   56  260:fstore          6
		f3 = f1;
	//   57  262:fload           6
	//   58  264:fstore          8
		if(true) goto _L5; else goto _L8
	//   59  266:goto            232
_L6:
		byte0 = 4;
	//   60  269:iconst_4        
	//   61  270:istore          15
		f = f6;
	//   62  272:fload           11
	//   63  274:fstore          5
		f1 = f12;
	//   64  276:fload           12
	//   65  278:fstore          6
		f2 = f15;
	//   66  280:fload           13
	//   67  282:fstore          7
		f3 = f20;
	//   68  284:fload           14
	//   69  286:fstore          8
		  goto _L8
	//*  70  288:goto            340
_L4:
		byte0 = 1;
	//   71  291:iconst_1        
	//   72  292:istore          15
		f = f6;
	//   73  294:fload           11
	//   74  296:fstore          5
		f1 = f12;
	//   75  298:fload           12
	//   76  300:fstore          6
		f2 = f15;
	//   77  302:fload           13
	//   78  304:fstore          7
		f3 = f20;
	//   79  306:fload           14
	//   80  308:fstore          8
		  goto _L8
	//*  81  310:goto            340
_L3:
		byte0 = 6;
	//   82  313:bipush          6
	//   83  315:istore          15
		  goto _L9
	//*  84  317:goto            324
_L2:
		byte0 = 7;
	//   85  320:bipush          7
	//   86  322:istore          15
_L9:
		f3 = f20;
	//   87  324:fload           14
	//   88  326:fstore          8
		f2 = f15;
	//   89  328:fload           13
	//   90  330:fstore          7
		f1 = f12;
	//   91  332:fload           12
	//   92  334:fstore          6
		f = f6;
	//   93  336:fload           11
	//   94  338:fstore          5
_L8:
		int i;
		f6 = f1;
	//   95  340:fload           6
	//   96  342:fstore          11
		boolean flag = false;
	//   97  344:iconst_0        
	//   98  345:istore          17
		i = ((int) (c));
	//   99  347:iload_2         
	//  100  348:istore          16
		c = ((char) (flag));
	//  101  350:iload           17
	//  102  352:istore_2        
		f1 = f;
	//  103  353:fload           5
	//  104  355:fstore          6
		f = f6;
	//  105  357:fload           11
	//  106  359:fstore          5
_L35:
		if(c >= af1.length)
			break; /* Loop/switch isn't completed */
	//  107  361:iload_2         
	//  108  362:aload           4
	//  109  364:arraylength     
	//  110  365:icmpge          2214
		f12 = 0.0F;
	//  111  368:fconst_0        
	//  112  369:fstore          12
		f6 = 0.0F;
	//  113  371:fconst_0        
	//  114  372:fstore          11
		c1;
	//  115  374:iload_3         
		JVM INSTR lookupswitch 18: default 528
	//	               65: 2060
	//	               67: 1944
	//	               72: 1918
	//	               76: 1868
	//	               77: 1792
	//	               81: 1686
	//	               83: 1520
	//	               84: 1388
	//	               86: 1362
	//	               97: 1222
	//	               99: 1103
	//	               104: 1075
	//	               108: 1024
	//	               109: 948
	//	               113: 849
	//	               115: 691
	//	               116: 559
	//	               118: 531;
	//  116  375:lookupswitch    18: default 528
	//	               65: 2060
	//	               67: 1944
	//	               72: 1918
	//	               76: 1868
	//	               77: 1792
	//	               81: 1686
	//	               83: 1520
	//	               84: 1388
	//	               86: 1362
	//	               97: 1222
	//	               99: 1103
	//	               104: 1075
	//	               108: 1024
	//	               109: 948
	//	               113: 849
	//	               115: 691
	//	               116: 559
	//	               118: 531
		   goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L10:
		break; /* Loop/switch isn't completed */
	//  117  528:goto            2203
_L28:
		i = c + 0;
	//  118  531:iload_2         
	//  119  532:iconst_0        
	//  120  533:iadd            
	//  121  534:istore          16
		path.rLineTo(0.0F, af1[i]);
	//  122  536:aload_0         
	//  123  537:fconst_0        
	//  124  538:aload           4
	//  125  540:iload           16
	//  126  542:faload          
	//  127  543:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		f += af1[i];
	//  128  546:fload           5
	//  129  548:aload           4
	//  130  550:iload           16
	//  131  552:faload          
	//  132  553:fadd            
	//  133  554:fstore          5
		break; /* Loop/switch isn't completed */
	//  134  556:goto            528
_L27:
		if(i != 113 && i != 116 && i != 81 && i != 84)
	//* 135  559:iload           16
	//* 136  561:bipush          113
	//* 137  563:icmpeq          600
	//* 138  566:iload           16
	//* 139  568:bipush          116
	//* 140  570:icmpeq          600
	//* 141  573:iload           16
	//* 142  575:bipush          81
	//* 143  577:icmpeq          600
	//* 144  580:iload           16
	//* 145  582:bipush          84
	//* 146  584:icmpne          590
	//* 147  587:goto            600
		{
			f3 = 0.0F;
	//  148  590:fconst_0        
	//  149  591:fstore          8
			f2 = f6;
	//  150  593:fload           11
	//  151  595:fstore          7
		} else
	//* 152  597:goto            614
		{
			f2 = f1 - f2;
	//  153  600:fload           6
	//  154  602:fload           7
	//  155  604:fsub            
	//  156  605:fstore          7
			f3 = f - f3;
	//  157  607:fload           5
	//  158  609:fload           8
	//  159  611:fsub            
	//  160  612:fstore          8
		}
		i = c + 0;
	//  161  614:iload_2         
	//  162  615:iconst_0        
	//  163  616:iadd            
	//  164  617:istore          16
		f6 = af1[i];
	//  165  619:aload           4
	//  166  621:iload           16
	//  167  623:faload          
	//  168  624:fstore          11
		int j = c + 1;
	//  169  626:iload_2         
	//  170  627:iconst_1        
	//  171  628:iadd            
	//  172  629:istore          17
		path.rQuadTo(f2, f3, f6, af1[j]);
	//  173  631:aload_0         
	//  174  632:fload           7
	//  175  634:fload           8
	//  176  636:fload           11
	//  177  638:aload           4
	//  178  640:iload           17
	//  179  642:faload          
	//  180  643:invokevirtual   #48  <Method void Path.rQuadTo(float, float, float, float)>
		f6 = f1 + af1[i];
	//  181  646:fload           6
	//  182  648:aload           4
	//  183  650:iload           16
	//  184  652:faload          
	//  185  653:fadd            
	//  186  654:fstore          11
		f12 = f + af1[j];
	//  187  656:fload           5
	//  188  658:aload           4
	//  189  660:iload           17
	//  190  662:faload          
	//  191  663:fadd            
	//  192  664:fstore          12
		f3 += f;
	//  193  666:fload           8
	//  194  668:fload           5
	//  195  670:fadd            
	//  196  671:fstore          8
		f2 += f1;
	//  197  673:fload           7
	//  198  675:fload           6
	//  199  677:fadd            
	//  200  678:fstore          7
		f = f12;
	//  201  680:fload           12
	//  202  682:fstore          5
		f1 = f6;
	//  203  684:fload           11
	//  204  686:fstore          6
		break; /* Loop/switch isn't completed */
	//  205  688:goto            528
_L26:
		if(i != 99 && i != 115 && i != 67 && i != 83)
	//* 206  691:iload           16
	//* 207  693:bipush          99
	//* 208  695:icmpeq          732
	//* 209  698:iload           16
	//* 210  700:bipush          115
	//* 211  702:icmpeq          732
	//* 212  705:iload           16
	//* 213  707:bipush          67
	//* 214  709:icmpeq          732
	//* 215  712:iload           16
	//* 216  714:bipush          83
	//* 217  716:icmpne          722
	//* 218  719:goto            732
		{
			f3 = 0.0F;
	//  219  722:fconst_0        
	//  220  723:fstore          8
			f2 = f12;
	//  221  725:fload           12
	//  222  727:fstore          7
		} else
	//* 223  729:goto            746
		{
			f3 = f - f3;
	//  224  732:fload           5
	//  225  734:fload           8
	//  226  736:fsub            
	//  227  737:fstore          8
			f2 = f1 - f2;
	//  228  739:fload           6
	//  229  741:fload           7
	//  230  743:fsub            
	//  231  744:fstore          7
		}
		i = c + 0;
	//  232  746:iload_2         
	//  233  747:iconst_0        
	//  234  748:iadd            
	//  235  749:istore          16
		f6 = af1[i];
	//  236  751:aload           4
	//  237  753:iload           16
	//  238  755:faload          
	//  239  756:fstore          11
		int k = c + 1;
	//  240  758:iload_2         
	//  241  759:iconst_1        
	//  242  760:iadd            
	//  243  761:istore          17
		f12 = af1[k];
	//  244  763:aload           4
	//  245  765:iload           17
	//  246  767:faload          
	//  247  768:fstore          12
		int l3 = c + 2;
	//  248  770:iload_2         
	//  249  771:iconst_2        
	//  250  772:iadd            
	//  251  773:istore          18
		float f16 = af1[l3];
	//  252  775:aload           4
	//  253  777:iload           18
	//  254  779:faload          
	//  255  780:fstore          13
		int l5 = c + 3;
	//  256  782:iload_2         
	//  257  783:iconst_3        
	//  258  784:iadd            
	//  259  785:istore          19
		path.rCubicTo(f2, f3, f6, f12, f16, af1[l5]);
	//  260  787:aload_0         
	//  261  788:fload           7
	//  262  790:fload           8
	//  263  792:fload           11
	//  264  794:fload           12
	//  265  796:fload           13
	//  266  798:aload           4
	//  267  800:iload           19
	//  268  802:faload          
	//  269  803:invokevirtual   #52  <Method void Path.rCubicTo(float, float, float, float, float, float)>
		f2 = af1[i] + f1;
	//  270  806:aload           4
	//  271  808:iload           16
	//  272  810:faload          
	//  273  811:fload           6
	//  274  813:fadd            
	//  275  814:fstore          7
		f3 = af1[k] + f;
	//  276  816:aload           4
	//  277  818:iload           17
	//  278  820:faload          
	//  279  821:fload           5
	//  280  823:fadd            
	//  281  824:fstore          8
		f1 += af1[l3];
	//  282  826:fload           6
	//  283  828:aload           4
	//  284  830:iload           18
	//  285  832:faload          
	//  286  833:fadd            
	//  287  834:fstore          6
		f += af1[l5];
	//  288  836:fload           5
	//  289  838:aload           4
	//  290  840:iload           19
	//  291  842:faload          
	//  292  843:fadd            
	//  293  844:fstore          5
		break; /* Loop/switch isn't completed */
	//  294  846:goto            1219
_L25:
		i = c + 0;
	//  295  849:iload_2         
	//  296  850:iconst_0        
	//  297  851:iadd            
	//  298  852:istore          16
		f2 = af1[i];
	//  299  854:aload           4
	//  300  856:iload           16
	//  301  858:faload          
	//  302  859:fstore          7
		int l = c + 1;
	//  303  861:iload_2         
	//  304  862:iconst_1        
	//  305  863:iadd            
	//  306  864:istore          17
		f3 = af1[l];
	//  307  866:aload           4
	//  308  868:iload           17
	//  309  870:faload          
	//  310  871:fstore          8
		int i4 = c + 2;
	//  311  873:iload_2         
	//  312  874:iconst_2        
	//  313  875:iadd            
	//  314  876:istore          18
		f6 = af1[i4];
	//  315  878:aload           4
	//  316  880:iload           18
	//  317  882:faload          
	//  318  883:fstore          11
		int i6 = c + 3;
	//  319  885:iload_2         
	//  320  886:iconst_3        
	//  321  887:iadd            
	//  322  888:istore          19
		path.rQuadTo(f2, f3, f6, af1[i6]);
	//  323  890:aload_0         
	//  324  891:fload           7
	//  325  893:fload           8
	//  326  895:fload           11
	//  327  897:aload           4
	//  328  899:iload           19
	//  329  901:faload          
	//  330  902:invokevirtual   #48  <Method void Path.rQuadTo(float, float, float, float)>
		f2 = af1[i] + f1;
	//  331  905:aload           4
	//  332  907:iload           16
	//  333  909:faload          
	//  334  910:fload           6
	//  335  912:fadd            
	//  336  913:fstore          7
		f3 = af1[l] + f;
	//  337  915:aload           4
	//  338  917:iload           17
	//  339  919:faload          
	//  340  920:fload           5
	//  341  922:fadd            
	//  342  923:fstore          8
		f1 += af1[i4];
	//  343  925:fload           6
	//  344  927:aload           4
	//  345  929:iload           18
	//  346  931:faload          
	//  347  932:fadd            
	//  348  933:fstore          6
		f += af1[i6];
	//  349  935:fload           5
	//  350  937:aload           4
	//  351  939:iload           19
	//  352  941:faload          
	//  353  942:fadd            
	//  354  943:fstore          5
		break; /* Loop/switch isn't completed */
	//  355  945:goto            1219
_L24:
		i = c + 0;
	//  356  948:iload_2         
	//  357  949:iconst_0        
	//  358  950:iadd            
	//  359  951:istore          16
		f1 += af1[i];
	//  360  953:fload           6
	//  361  955:aload           4
	//  362  957:iload           16
	//  363  959:faload          
	//  364  960:fadd            
	//  365  961:fstore          6
		int i1 = c + 1;
	//  366  963:iload_2         
	//  367  964:iconst_1        
	//  368  965:iadd            
	//  369  966:istore          17
		f += af1[i1];
	//  370  968:fload           5
	//  371  970:aload           4
	//  372  972:iload           17
	//  373  974:faload          
	//  374  975:fadd            
	//  375  976:fstore          5
		if(c > 0)
	//* 376  978:iload_2         
	//* 377  979:ifle            999
		{
			path.rLineTo(af1[i], af1[i1]);
	//  378  982:aload_0         
	//  379  983:aload           4
	//  380  985:iload           16
	//  381  987:faload          
	//  382  988:aload           4
	//  383  990:iload           17
	//  384  992:faload          
	//  385  993:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		} else
	//* 386  996:goto            528
		{
			path.rMoveTo(af1[i], af1[i1]);
	//  387  999:aload_0         
	//  388 1000:aload           4
	//  389 1002:iload           16
	//  390 1004:faload          
	//  391 1005:aload           4
	//  392 1007:iload           17
	//  393 1009:faload          
	//  394 1010:invokevirtual   #55  <Method void Path.rMoveTo(float, float)>
			f4 = f;
	//  395 1013:fload           5
	//  396 1015:fstore          9
			f5 = f1;
	//  397 1017:fload           6
	//  398 1019:fstore          10
		}
		break; /* Loop/switch isn't completed */
	//  399 1021:goto            528
_L23:
		i = c + 0;
	//  400 1024:iload_2         
	//  401 1025:iconst_0        
	//  402 1026:iadd            
	//  403 1027:istore          16
		f6 = af1[i];
	//  404 1029:aload           4
	//  405 1031:iload           16
	//  406 1033:faload          
	//  407 1034:fstore          11
		int j1 = c + 1;
	//  408 1036:iload_2         
	//  409 1037:iconst_1        
	//  410 1038:iadd            
	//  411 1039:istore          17
		path.rLineTo(f6, af1[j1]);
	//  412 1041:aload_0         
	//  413 1042:fload           11
	//  414 1044:aload           4
	//  415 1046:iload           17
	//  416 1048:faload          
	//  417 1049:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		f1 += af1[i];
	//  418 1052:fload           6
	//  419 1054:aload           4
	//  420 1056:iload           16
	//  421 1058:faload          
	//  422 1059:fadd            
	//  423 1060:fstore          6
		f += af1[j1];
	//  424 1062:fload           5
	//  425 1064:aload           4
	//  426 1066:iload           17
	//  427 1068:faload          
	//  428 1069:fadd            
	//  429 1070:fstore          5
		break; /* Loop/switch isn't completed */
	//  430 1072:goto            528
_L22:
		i = c + 0;
	//  431 1075:iload_2         
	//  432 1076:iconst_0        
	//  433 1077:iadd            
	//  434 1078:istore          16
		path.rLineTo(af1[i], 0.0F);
	//  435 1080:aload_0         
	//  436 1081:aload           4
	//  437 1083:iload           16
	//  438 1085:faload          
	//  439 1086:fconst_0        
	//  440 1087:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
		f1 += af1[i];
	//  441 1090:fload           6
	//  442 1092:aload           4
	//  443 1094:iload           16
	//  444 1096:faload          
	//  445 1097:fadd            
	//  446 1098:fstore          6
		break; /* Loop/switch isn't completed */
	//  447 1100:goto            528
_L21:
		f2 = af1[c + 0];
	//  448 1103:aload           4
	//  449 1105:iload_2         
	//  450 1106:iconst_0        
	//  451 1107:iadd            
	//  452 1108:faload          
	//  453 1109:fstore          7
		f3 = af1[c + 1];
	//  454 1111:aload           4
	//  455 1113:iload_2         
	//  456 1114:iconst_1        
	//  457 1115:iadd            
	//  458 1116:faload          
	//  459 1117:fstore          8
		i = c + 2;
	//  460 1119:iload_2         
	//  461 1120:iconst_2        
	//  462 1121:iadd            
	//  463 1122:istore          16
		f6 = af1[i];
	//  464 1124:aload           4
	//  465 1126:iload           16
	//  466 1128:faload          
	//  467 1129:fstore          11
		int k1 = c + 3;
	//  468 1131:iload_2         
	//  469 1132:iconst_3        
	//  470 1133:iadd            
	//  471 1134:istore          17
		f12 = af1[k1];
	//  472 1136:aload           4
	//  473 1138:iload           17
	//  474 1140:faload          
	//  475 1141:fstore          12
		int j4 = c + 4;
	//  476 1143:iload_2         
	//  477 1144:iconst_4        
	//  478 1145:iadd            
	//  479 1146:istore          18
		float f17 = af1[j4];
	//  480 1148:aload           4
	//  481 1150:iload           18
	//  482 1152:faload          
	//  483 1153:fstore          13
		int j6 = c + 5;
	//  484 1155:iload_2         
	//  485 1156:iconst_5        
	//  486 1157:iadd            
	//  487 1158:istore          19
		path.rCubicTo(f2, f3, f6, f12, f17, af1[j6]);
	//  488 1160:aload_0         
	//  489 1161:fload           7
	//  490 1163:fload           8
	//  491 1165:fload           11
	//  492 1167:fload           12
	//  493 1169:fload           13
	//  494 1171:aload           4
	//  495 1173:iload           19
	//  496 1175:faload          
	//  497 1176:invokevirtual   #52  <Method void Path.rCubicTo(float, float, float, float, float, float)>
		f2 = af1[i] + f1;
	//  498 1179:aload           4
	//  499 1181:iload           16
	//  500 1183:faload          
	//  501 1184:fload           6
	//  502 1186:fadd            
	//  503 1187:fstore          7
		f3 = af1[k1] + f;
	//  504 1189:aload           4
	//  505 1191:iload           17
	//  506 1193:faload          
	//  507 1194:fload           5
	//  508 1196:fadd            
	//  509 1197:fstore          8
		f1 += af1[j4];
	//  510 1199:fload           6
	//  511 1201:aload           4
	//  512 1203:iload           18
	//  513 1205:faload          
	//  514 1206:fadd            
	//  515 1207:fstore          6
		f += af1[j6];
	//  516 1209:fload           5
	//  517 1211:aload           4
	//  518 1213:iload           19
	//  519 1215:faload          
	//  520 1216:fadd            
	//  521 1217:fstore          5
		break; /* Loop/switch isn't completed */
	//  522 1219:goto            528
_L20:
		i = c + 5;
	//  523 1222:iload_2         
	//  524 1223:iconst_5        
	//  525 1224:iadd            
	//  526 1225:istore          16
		f2 = af1[i];
	//  527 1227:aload           4
	//  528 1229:iload           16
	//  529 1231:faload          
	//  530 1232:fstore          7
		int l1 = c + 6;
	//  531 1234:iload_2         
	//  532 1235:bipush          6
	//  533 1237:iadd            
	//  534 1238:istore          17
		f3 = af1[l1];
	//  535 1240:aload           4
	//  536 1242:iload           17
	//  537 1244:faload          
	//  538 1245:fstore          8
		f6 = af1[c + 0];
	//  539 1247:aload           4
	//  540 1249:iload_2         
	//  541 1250:iconst_0        
	//  542 1251:iadd            
	//  543 1252:faload          
	//  544 1253:fstore          11
		f12 = af1[c + 1];
	//  545 1255:aload           4
	//  546 1257:iload_2         
	//  547 1258:iconst_1        
	//  548 1259:iadd            
	//  549 1260:faload          
	//  550 1261:fstore          12
		float f18 = af1[c + 2];
	//  551 1263:aload           4
	//  552 1265:iload_2         
	//  553 1266:iconst_2        
	//  554 1267:iadd            
	//  555 1268:faload          
	//  556 1269:fstore          13
		boolean flag1;
		if(af1[c + 3] != 0.0F)
	//* 557 1271:aload           4
	//* 558 1273:iload_2         
	//* 559 1274:iconst_3        
	//* 560 1275:iadd            
	//* 561 1276:faload          
	//* 562 1277:fconst_0        
	//* 563 1278:fcmpl           
	//* 564 1279:ifeq            1288
			flag1 = true;
	//  565 1282:iconst_1        
	//  566 1283:istore          20
		else
	//* 567 1285:goto            1291
			flag1 = false;
	//  568 1288:iconst_0        
	//  569 1289:istore          20
		boolean flag3;
		if(af1[c + 4] != 0.0F)
	//* 570 1291:aload           4
	//* 571 1293:iload_2         
	//* 572 1294:iconst_4        
	//* 573 1295:iadd            
	//* 574 1296:faload          
	//* 575 1297:fconst_0        
	//* 576 1298:fcmpl           
	//* 577 1299:ifeq            1308
			flag3 = true;
	//  578 1302:iconst_1        
	//  579 1303:istore          21
		else
	//* 580 1305:goto            1311
			flag3 = false;
	//  581 1308:iconst_0        
	//  582 1309:istore          21
		drawArc(path, f1, f, f2 + f1, f3 + f, f6, f12, f18, flag1, flag3);
	//  583 1311:aload_0         
	//  584 1312:fload           6
	//  585 1314:fload           5
	//  586 1316:fload           7
	//  587 1318:fload           6
	//  588 1320:fadd            
	//  589 1321:fload           8
	//  590 1323:fload           5
	//  591 1325:fadd            
	//  592 1326:fload           11
	//  593 1328:fload           12
	//  594 1330:fload           13
	//  595 1332:iload           20
	//  596 1334:iload           21
	//  597 1336:invokestatic    #59  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
		f1 += af1[i];
	//  598 1339:fload           6
	//  599 1341:aload           4
	//  600 1343:iload           16
	//  601 1345:faload          
	//  602 1346:fadd            
	//  603 1347:fstore          6
		f += af1[l1];
	//  604 1349:fload           5
	//  605 1351:aload           4
	//  606 1353:iload           17
	//  607 1355:faload          
	//  608 1356:fadd            
	//  609 1357:fstore          5
		  goto _L29
	//* 610 1359:goto            2195
_L19:
		i = c + 0;
	//  611 1362:iload_2         
	//  612 1363:iconst_0        
	//  613 1364:iadd            
	//  614 1365:istore          16
		path.lineTo(f1, af1[i]);
	//  615 1367:aload_0         
	//  616 1368:fload           6
	//  617 1370:aload           4
	//  618 1372:iload           16
	//  619 1374:faload          
	//  620 1375:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		f = af1[i];
	//  621 1378:aload           4
	//  622 1380:iload           16
	//  623 1382:faload          
	//  624 1383:fstore          5
		break; /* Loop/switch isn't completed */
	//  625 1385:goto            2203
_L18:
		int i2;
		f6 = f;
	//  626 1388:fload           5
	//  627 1390:fstore          11
		f12 = f1;
	//  628 1392:fload           6
	//  629 1394:fstore          12
		i2 = ((int) (c));
	//  630 1396:iload_2         
	//  631 1397:istore          17
		if(i == 113 || i == 116 || i == 81) goto _L31; else goto _L30
	//  632 1399:iload           16
	//  633 1401:bipush          113
	//  634 1403:icmpeq          1435
	//  635 1406:iload           16
	//  636 1408:bipush          116
	//  637 1410:icmpeq          1435
	//  638 1413:iload           16
	//  639 1415:bipush          81
	//  640 1417:icmpeq          1435
_L30:
		f1 = f12;
	//  641 1420:fload           12
	//  642 1422:fstore          6
		f = f6;
	//  643 1424:fload           11
	//  644 1426:fstore          5
		if(i != 84) goto _L32; else goto _L31
	//  645 1428:iload           16
	//  646 1430:bipush          84
	//  647 1432:icmpne          1453
_L31:
		f = 2.0F * f6 - f3;
	//  648 1435:fconst_2        
	//  649 1436:fload           11
	//  650 1438:fmul            
	//  651 1439:fload           8
	//  652 1441:fsub            
	//  653 1442:fstore          5
		f1 = 2.0F * f12 - f2;
	//  654 1444:fconst_2        
	//  655 1445:fload           12
	//  656 1447:fmul            
	//  657 1448:fload           7
	//  658 1450:fsub            
	//  659 1451:fstore          6
_L32:
		i = i2 + 0;
	//  660 1453:iload           17
	//  661 1455:iconst_0        
	//  662 1456:iadd            
	//  663 1457:istore          16
		f2 = af1[i];
	//  664 1459:aload           4
	//  665 1461:iload           16
	//  666 1463:faload          
	//  667 1464:fstore          7
		i2++;
	//  668 1466:iload           17
	//  669 1468:iconst_1        
	//  670 1469:iadd            
	//  671 1470:istore          17
		path.quadTo(f1, f, f2, af1[i2]);
	//  672 1472:aload_0         
	//  673 1473:fload           6
	//  674 1475:fload           5
	//  675 1477:fload           7
	//  676 1479:aload           4
	//  677 1481:iload           17
	//  678 1483:faload          
	//  679 1484:invokevirtual   #65  <Method void Path.quadTo(float, float, float, float)>
		float f7 = af1[i];
	//  680 1487:aload           4
	//  681 1489:iload           16
	//  682 1491:faload          
	//  683 1492:fstore          11
		float f13 = af1[i2];
	//  684 1494:aload           4
	//  685 1496:iload           17
	//  686 1498:faload          
	//  687 1499:fstore          12
		f2 = f1;
	//  688 1501:fload           6
	//  689 1503:fstore          7
		f3 = f;
	//  690 1505:fload           5
	//  691 1507:fstore          8
		f = f13;
	//  692 1509:fload           12
	//  693 1511:fstore          5
		f1 = f7;
	//  694 1513:fload           11
	//  695 1515:fstore          6
		break; /* Loop/switch isn't completed */
	//  696 1517:goto            2203
_L17:
		int j2 = ((int) (c));
	//  697 1520:iload_2         
	//  698 1521:istore          17
		if(i != 99 && i != 115 && i != 67 && i != 83)
	//* 699 1523:iload           16
	//* 700 1525:bipush          99
	//* 701 1527:icmpeq          1569
	//* 702 1530:iload           16
	//* 703 1532:bipush          115
	//* 704 1534:icmpeq          1569
	//* 705 1537:iload           16
	//* 706 1539:bipush          67
	//* 707 1541:icmpeq          1569
	//* 708 1544:iload           16
	//* 709 1546:bipush          83
	//* 710 1548:icmpne          1554
	//* 711 1551:goto            1569
		{
			f2 = f;
	//  712 1554:fload           5
	//  713 1556:fstore          7
			f = f1;
	//  714 1558:fload           6
	//  715 1560:fstore          5
			f1 = f2;
	//  716 1562:fload           7
	//  717 1564:fstore          6
		} else
	//* 718 1566:goto            1591
		{
			f2 = 2.0F * f1 - f2;
	//  719 1569:fconst_2        
	//  720 1570:fload           6
	//  721 1572:fmul            
	//  722 1573:fload           7
	//  723 1575:fsub            
	//  724 1576:fstore          7
			f1 = 2.0F * f - f3;
	//  725 1578:fconst_2        
	//  726 1579:fload           5
	//  727 1581:fmul            
	//  728 1582:fload           8
	//  729 1584:fsub            
	//  730 1585:fstore          6
			f = f2;
	//  731 1587:fload           7
	//  732 1589:fstore          5
		}
		i = j2 + 0;
	//  733 1591:iload           17
	//  734 1593:iconst_0        
	//  735 1594:iadd            
	//  736 1595:istore          16
		f2 = af1[i];
	//  737 1597:aload           4
	//  738 1599:iload           16
	//  739 1601:faload          
	//  740 1602:fstore          7
		int k4 = j2 + 1;
	//  741 1604:iload           17
	//  742 1606:iconst_1        
	//  743 1607:iadd            
	//  744 1608:istore          18
		f3 = af1[k4];
	//  745 1610:aload           4
	//  746 1612:iload           18
	//  747 1614:faload          
	//  748 1615:fstore          8
		int k6 = j2 + 2;
	//  749 1617:iload           17
	//  750 1619:iconst_2        
	//  751 1620:iadd            
	//  752 1621:istore          19
		float f8 = af1[k6];
	//  753 1623:aload           4
	//  754 1625:iload           19
	//  755 1627:faload          
	//  756 1628:fstore          11
		j2 += 3;
	//  757 1630:iload           17
	//  758 1632:iconst_3        
	//  759 1633:iadd            
	//  760 1634:istore          17
		path.cubicTo(f, f1, f2, f3, f8, af1[j2]);
	//  761 1636:aload_0         
	//  762 1637:fload           5
	//  763 1639:fload           6
	//  764 1641:fload           7
	//  765 1643:fload           8
	//  766 1645:fload           11
	//  767 1647:aload           4
	//  768 1649:iload           17
	//  769 1651:faload          
	//  770 1652:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
		f3 = af1[i];
	//  771 1655:aload           4
	//  772 1657:iload           16
	//  773 1659:faload          
	//  774 1660:fstore          8
		f2 = af1[k4];
	//  775 1662:aload           4
	//  776 1664:iload           18
	//  777 1666:faload          
	//  778 1667:fstore          7
		f1 = af1[k6];
	//  779 1669:aload           4
	//  780 1671:iload           19
	//  781 1673:faload          
	//  782 1674:fstore          6
		f = af1[j2];
	//  783 1676:aload           4
	//  784 1678:iload           17
	//  785 1680:faload          
	//  786 1681:fstore          5
		  goto _L33
	//* 787 1683:goto            1777
_L16:
		i = ((int) (c));
	//  788 1686:iload_2         
	//  789 1687:istore          16
		int k2 = i + 0;
	//  790 1689:iload           16
	//  791 1691:iconst_0        
	//  792 1692:iadd            
	//  793 1693:istore          17
		f = af1[k2];
	//  794 1695:aload           4
	//  795 1697:iload           17
	//  796 1699:faload          
	//  797 1700:fstore          5
		int l4 = i + 1;
	//  798 1702:iload           16
	//  799 1704:iconst_1        
	//  800 1705:iadd            
	//  801 1706:istore          18
		f1 = af1[l4];
	//  802 1708:aload           4
	//  803 1710:iload           18
	//  804 1712:faload          
	//  805 1713:fstore          6
		int l6 = i + 2;
	//  806 1715:iload           16
	//  807 1717:iconst_2        
	//  808 1718:iadd            
	//  809 1719:istore          19
		f2 = af1[l6];
	//  810 1721:aload           4
	//  811 1723:iload           19
	//  812 1725:faload          
	//  813 1726:fstore          7
		i += 3;
	//  814 1728:iload           16
	//  815 1730:iconst_3        
	//  816 1731:iadd            
	//  817 1732:istore          16
		path.quadTo(f, f1, f2, af1[i]);
	//  818 1734:aload_0         
	//  819 1735:fload           5
	//  820 1737:fload           6
	//  821 1739:fload           7
	//  822 1741:aload           4
	//  823 1743:iload           16
	//  824 1745:faload          
	//  825 1746:invokevirtual   #65  <Method void Path.quadTo(float, float, float, float)>
		f3 = af1[k2];
	//  826 1749:aload           4
	//  827 1751:iload           17
	//  828 1753:faload          
	//  829 1754:fstore          8
		f2 = af1[l4];
	//  830 1756:aload           4
	//  831 1758:iload           18
	//  832 1760:faload          
	//  833 1761:fstore          7
		f1 = af1[l6];
	//  834 1763:aload           4
	//  835 1765:iload           19
	//  836 1767:faload          
	//  837 1768:fstore          6
		f = af1[i];
	//  838 1770:aload           4
	//  839 1772:iload           16
	//  840 1774:faload          
	//  841 1775:fstore          5
_L33:
		float f9 = f2;
	//  842 1777:fload           7
	//  843 1779:fstore          11
		f2 = f3;
	//  844 1781:fload           8
	//  845 1783:fstore          7
		f3 = f9;
	//  846 1785:fload           11
	//  847 1787:fstore          8
		break; /* Loop/switch isn't completed */
	//  848 1789:goto            2203
_L15:
		i = ((int) (c));
	//  849 1792:iload_2         
	//  850 1793:istore          16
		int l2 = i + 0;
	//  851 1795:iload           16
	//  852 1797:iconst_0        
	//  853 1798:iadd            
	//  854 1799:istore          17
		f1 = af1[l2];
	//  855 1801:aload           4
	//  856 1803:iload           17
	//  857 1805:faload          
	//  858 1806:fstore          6
		int i5 = i + 1;
	//  859 1808:iload           16
	//  860 1810:iconst_1        
	//  861 1811:iadd            
	//  862 1812:istore          18
		f = af1[i5];
	//  863 1814:aload           4
	//  864 1816:iload           18
	//  865 1818:faload          
	//  866 1819:fstore          5
		if(i > 0)
	//* 867 1821:iload           16
	//* 868 1823:ifle            1843
		{
			path.lineTo(af1[l2], af1[i5]);
	//  869 1826:aload_0         
	//  870 1827:aload           4
	//  871 1829:iload           17
	//  872 1831:faload          
	//  873 1832:aload           4
	//  874 1834:iload           18
	//  875 1836:faload          
	//  876 1837:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		} else
	//* 877 1840:goto            2203
		{
			path.moveTo(af1[l2], af1[i5]);
	//  878 1843:aload_0         
	//  879 1844:aload           4
	//  880 1846:iload           17
	//  881 1848:faload          
	//  882 1849:aload           4
	//  883 1851:iload           18
	//  884 1853:faload          
	//  885 1854:invokevirtual   #41  <Method void Path.moveTo(float, float)>
			f4 = f;
	//  886 1857:fload           5
	//  887 1859:fstore          9
			f5 = f1;
	//  888 1861:fload           6
	//  889 1863:fstore          10
		}
		break; /* Loop/switch isn't completed */
	//  890 1865:goto            2203
_L14:
		i = ((int) (c));
	//  891 1868:iload_2         
	//  892 1869:istore          16
		int i3 = i + 0;
	//  893 1871:iload           16
	//  894 1873:iconst_0        
	//  895 1874:iadd            
	//  896 1875:istore          17
		f = af1[i3];
	//  897 1877:aload           4
	//  898 1879:iload           17
	//  899 1881:faload          
	//  900 1882:fstore          5
		i++;
	//  901 1884:iload           16
	//  902 1886:iconst_1        
	//  903 1887:iadd            
	//  904 1888:istore          16
		path.lineTo(f, af1[i]);
	//  905 1890:aload_0         
	//  906 1891:fload           5
	//  907 1893:aload           4
	//  908 1895:iload           16
	//  909 1897:faload          
	//  910 1898:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		f1 = af1[i3];
	//  911 1901:aload           4
	//  912 1903:iload           17
	//  913 1905:faload          
	//  914 1906:fstore          6
		f = af1[i];
	//  915 1908:aload           4
	//  916 1910:iload           16
	//  917 1912:faload          
	//  918 1913:fstore          5
		break; /* Loop/switch isn't completed */
	//  919 1915:goto            2203
_L13:
		i = c + 0;
	//  920 1918:iload_2         
	//  921 1919:iconst_0        
	//  922 1920:iadd            
	//  923 1921:istore          16
		path.lineTo(af1[i], f);
	//  924 1923:aload_0         
	//  925 1924:aload           4
	//  926 1926:iload           16
	//  927 1928:faload          
	//  928 1929:fload           5
	//  929 1931:invokevirtual   #62  <Method void Path.lineTo(float, float)>
		f1 = af1[i];
	//  930 1934:aload           4
	//  931 1936:iload           16
	//  932 1938:faload          
	//  933 1939:fstore          6
		break; /* Loop/switch isn't completed */
	//  934 1941:goto            2203
_L12:
		i = ((int) (c));
	//  935 1944:iload_2         
	//  936 1945:istore          16
		f = af1[i + 0];
	//  937 1947:aload           4
	//  938 1949:iload           16
	//  939 1951:iconst_0        
	//  940 1952:iadd            
	//  941 1953:faload          
	//  942 1954:fstore          5
		f1 = af1[i + 1];
	//  943 1956:aload           4
	//  944 1958:iload           16
	//  945 1960:iconst_1        
	//  946 1961:iadd            
	//  947 1962:faload          
	//  948 1963:fstore          6
		int j3 = i + 2;
	//  949 1965:iload           16
	//  950 1967:iconst_2        
	//  951 1968:iadd            
	//  952 1969:istore          17
		f2 = af1[j3];
	//  953 1971:aload           4
	//  954 1973:iload           17
	//  955 1975:faload          
	//  956 1976:fstore          7
		int j5 = i + 3;
	//  957 1978:iload           16
	//  958 1980:iconst_3        
	//  959 1981:iadd            
	//  960 1982:istore          18
		f3 = af1[j5];
	//  961 1984:aload           4
	//  962 1986:iload           18
	//  963 1988:faload          
	//  964 1989:fstore          8
		int i7 = i + 4;
	//  965 1991:iload           16
	//  966 1993:iconst_4        
	//  967 1994:iadd            
	//  968 1995:istore          19
		float f10 = af1[i7];
	//  969 1997:aload           4
	//  970 1999:iload           19
	//  971 2001:faload          
	//  972 2002:fstore          11
		i += 5;
	//  973 2004:iload           16
	//  974 2006:iconst_5        
	//  975 2007:iadd            
	//  976 2008:istore          16
		path.cubicTo(f, f1, f2, f3, f10, af1[i]);
	//  977 2010:aload_0         
	//  978 2011:fload           5
	//  979 2013:fload           6
	//  980 2015:fload           7
	//  981 2017:fload           8
	//  982 2019:fload           11
	//  983 2021:aload           4
	//  984 2023:iload           16
	//  985 2025:faload          
	//  986 2026:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
		f1 = af1[i7];
	//  987 2029:aload           4
	//  988 2031:iload           19
	//  989 2033:faload          
	//  990 2034:fstore          6
		f = af1[i];
	//  991 2036:aload           4
	//  992 2038:iload           16
	//  993 2040:faload          
	//  994 2041:fstore          5
		f2 = af1[j3];
	//  995 2043:aload           4
	//  996 2045:iload           17
	//  997 2047:faload          
	//  998 2048:fstore          7
		f3 = af1[j5];
	//  999 2050:aload           4
	// 1000 2052:iload           18
	// 1001 2054:faload          
	// 1002 2055:fstore          8
		break; /* Loop/switch isn't completed */
	// 1003 2057:goto            2203
_L11:
		i = ((int) (c));
	// 1004 2060:iload_2         
	// 1005 2061:istore          16
		int k3 = i + 5;
	// 1006 2063:iload           16
	// 1007 2065:iconst_5        
	// 1008 2066:iadd            
	// 1009 2067:istore          17
		f2 = af1[k3];
	// 1010 2069:aload           4
	// 1011 2071:iload           17
	// 1012 2073:faload          
	// 1013 2074:fstore          7
		int k5 = i + 6;
	// 1014 2076:iload           16
	// 1015 2078:bipush          6
	// 1016 2080:iadd            
	// 1017 2081:istore          18
		f3 = af1[k5];
	// 1018 2083:aload           4
	// 1019 2085:iload           18
	// 1020 2087:faload          
	// 1021 2088:fstore          8
		float f11 = af1[i + 0];
	// 1022 2090:aload           4
	// 1023 2092:iload           16
	// 1024 2094:iconst_0        
	// 1025 2095:iadd            
	// 1026 2096:faload          
	// 1027 2097:fstore          11
		float f14 = af1[i + 1];
	// 1028 2099:aload           4
	// 1029 2101:iload           16
	// 1030 2103:iconst_1        
	// 1031 2104:iadd            
	// 1032 2105:faload          
	// 1033 2106:fstore          12
		float f19 = af1[i + 2];
	// 1034 2108:aload           4
	// 1035 2110:iload           16
	// 1036 2112:iconst_2        
	// 1037 2113:iadd            
	// 1038 2114:faload          
	// 1039 2115:fstore          13
		boolean flag2;
		if(af1[i + 3] != 0.0F)
	//*1040 2117:aload           4
	//*1041 2119:iload           16
	//*1042 2121:iconst_3        
	//*1043 2122:iadd            
	//*1044 2123:faload          
	//*1045 2124:fconst_0        
	//*1046 2125:fcmpl           
	//*1047 2126:ifeq            2135
			flag2 = true;
	// 1048 2129:iconst_1        
	// 1049 2130:istore          20
		else
	//*1050 2132:goto            2138
			flag2 = false;
	// 1051 2135:iconst_0        
	// 1052 2136:istore          20
		boolean flag4;
		if(af1[i + 4] != 0.0F)
	//*1053 2138:aload           4
	//*1054 2140:iload           16
	//*1055 2142:iconst_4        
	//*1056 2143:iadd            
	//*1057 2144:faload          
	//*1058 2145:fconst_0        
	//*1059 2146:fcmpl           
	//*1060 2147:ifeq            2156
			flag4 = true;
	// 1061 2150:iconst_1        
	// 1062 2151:istore          21
		else
	//*1063 2153:goto            2159
			flag4 = false;
	// 1064 2156:iconst_0        
	// 1065 2157:istore          21
		drawArc(path, f1, f, f2, f3, f11, f14, f19, flag2, flag4);
	// 1066 2159:aload_0         
	// 1067 2160:fload           6
	// 1068 2162:fload           5
	// 1069 2164:fload           7
	// 1070 2166:fload           8
	// 1071 2168:fload           11
	// 1072 2170:fload           12
	// 1073 2172:fload           13
	// 1074 2174:iload           20
	// 1075 2176:iload           21
	// 1076 2178:invokestatic    #59  <Method void drawArc(Path, float, float, float, float, float, float, float, boolean, boolean)>
		f1 = af1[k3];
	// 1077 2181:aload           4
	// 1078 2183:iload           17
	// 1079 2185:faload          
	// 1080 2186:fstore          6
		f = af1[k5];
	// 1081 2188:aload           4
	// 1082 2190:iload           18
	// 1083 2192:faload          
	// 1084 2193:fstore          5
_L29:
		f3 = f;
	// 1085 2195:fload           5
	// 1086 2197:fstore          8
		f2 = f1;
	// 1087 2199:fload           6
	// 1088 2201:fstore          7
		c += ((char) (byte0));
	// 1089 2203:iload_2         
	// 1090 2204:iload           15
	// 1091 2206:iadd            
	// 1092 2207:istore_2        
		i = ((int) (c1));
	// 1093 2208:iload_3         
	// 1094 2209:istore          16
		if(true) goto _L35; else goto _L34
	// 1095 2211:goto            361
_L34:
		af[0] = f1;
	// 1096 2214:aload_1         
	// 1097 2215:iconst_0        
	// 1098 2216:fload           6
	// 1099 2218:fastore         
		af[1] = f;
	// 1100 2219:aload_1         
	// 1101 2220:iconst_1        
	// 1102 2221:fload           5
	// 1103 2223:fastore         
		af[2] = f2;
	// 1104 2224:aload_1         
	// 1105 2225:iconst_2        
	// 1106 2226:fload           7
	// 1107 2228:fastore         
		af[3] = f3;
	// 1108 2229:aload_1         
	// 1109 2230:iconst_3        
	// 1110 2231:fload           8
	// 1111 2233:fastore         
		af[4] = f5;
	// 1112 2234:aload_1         
	// 1113 2235:iconst_4        
	// 1114 2236:fload           10
	// 1115 2238:fastore         
		af[5] = f4;
	// 1116 2239:aload_1         
	// 1117 2240:iconst_5        
	// 1118 2241:fload           9
	// 1119 2243:fastore         
		return;
	// 1120 2244:return          
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
		double d13 = Math.cos(d6);
	//    9   19:dload           13
	//   10   21:invokestatic    #86  <Method double Math.cos(double)>
	//   11   24:dstore          27
		double d17 = Math.sin(d6);
	//   12   26:dload           13
	//   13   28:invokestatic    #89  <Method double Math.sin(double)>
	//   14   31:dstore          31
		double d9 = Math.cos(d7);
	//   15   33:dload           15
	//   16   35:invokestatic    #86  <Method double Math.cos(double)>
	//   17   38:dstore          19
		double d10 = Math.sin(d7);
	//   18   40:dload           15
	//   19   42:invokestatic    #89  <Method double Math.sin(double)>
	//   20   45:dstore          21
		d6 = -d2;
	//   21   47:dload           5
	//   22   49:dneg            
	//   23   50:dstore          13
		double d22 = d6 * d13;
	//   24   52:dload           13
	//   25   54:dload           27
	//   26   56:dmul            
	//   27   57:dstore          37
		double d23 = d3 * d17;
	//   28   59:dload           7
	//   29   61:dload           31
	//   30   63:dmul            
	//   31   64:dstore          39
		d6 *= d17;
	//   32   66:dload           13
	//   33   68:dload           31
	//   34   70:dmul            
	//   35   71:dstore          13
		double d15 = d3 * d13;
	//   36   73:dload           7
	//   37   75:dload           27
	//   38   77:dmul            
	//   39   78:dstore          29
		double d19 = d8 / (double)i;
	//   40   80:dload           17
	//   41   82:iload           43
	//   42   84:i2d             
	//   43   85:ddiv            
	//   44   86:dstore          33
		int j = 0;
	//   45   88:iconst_0        
	//   46   89:istore          44
		double d11 = d10 * d6 + d9 * d15;
	//   47   91:dload           21
	//   48   93:dload           13
	//   49   95:dmul            
	//   50   96:dload           19
	//   51   98:dload           29
	//   52  100:dmul            
	//   53  101:dadd            
	//   54  102:dstore          23
		d9 = d22 * d10 - d23 * d9;
	//   55  104:dload           37
	//   56  106:dload           21
	//   57  108:dmul            
	//   58  109:dload           39
	//   59  111:dload           19
	//   60  113:dmul            
	//   61  114:dsub            
	//   62  115:dstore          19
		d10 = d5;
	//   63  117:dload           11
	//   64  119:dstore          21
		d8 = d4;
	//   65  121:dload           9
	//   66  123:dstore          17
		double d12 = d7;
	//   67  125:dload           15
	//   68  127:dstore          25
		d3 = d17;
	//   69  129:dload           31
	//   70  131:dstore          7
		d4 = d13;
	//   71  133:dload           27
	//   72  135:dstore          9
		d7 = d6;
	//   73  137:dload           13
	//   74  139:dstore          15
		d6 = d19;
	//   75  141:dload           33
	//   76  143:dstore          13
		d5 = d15;
	//   77  145:dload           29
	//   78  147:dstore          11
		do
		{
			double d16 = d2;
	//   79  149:dload           5
	//   80  151:dstore          29
			if(j < i)
	//*  81  153:iload           44
	//*  82  155:iload           43
	//*  83  157:icmpge          372
			{
				double d14 = d12 + d6;
	//   84  160:dload           25
	//   85  162:dload           13
	//   86  164:dadd            
	//   87  165:dstore          27
				double d20 = Math.sin(d14);
	//   88  167:dload           27
	//   89  169:invokestatic    #89  <Method double Math.sin(double)>
	//   90  172:dstore          33
				double d24 = Math.cos(d14);
	//   91  174:dload           27
	//   92  176:invokestatic    #86  <Method double Math.cos(double)>
	//   93  179:dstore          41
				double d18 = (d + d16 * d4 * d24) - d23 * d20;
	//   94  181:dload_1         
	//   95  182:dload           29
	//   96  184:dload           9
	//   97  186:dmul            
	//   98  187:dload           41
	//   99  189:dmul            
	//  100  190:dadd            
	//  101  191:dload           39
	//  102  193:dload           33
	//  103  195:dmul            
	//  104  196:dsub            
	//  105  197:dstore          31
				double d21 = d1 + d16 * d3 * d24 + d5 * d20;
	//  106  199:dload_3         
	//  107  200:dload           29
	//  108  202:dload           7
	//  109  204:dmul            
	//  110  205:dload           41
	//  111  207:dmul            
	//  112  208:dadd            
	//  113  209:dload           11
	//  114  211:dload           33
	//  115  213:dmul            
	//  116  214:dadd            
	//  117  215:dstore          35
				d16 = d22 * d20 - d23 * d24;
	//  118  217:dload           37
	//  119  219:dload           33
	//  120  221:dmul            
	//  121  222:dload           39
	//  122  224:dload           41
	//  123  226:dmul            
	//  124  227:dsub            
	//  125  228:dstore          29
				d20 = d20 * d7 + d24 * d5;
	//  126  230:dload           33
	//  127  232:dload           15
	//  128  234:dmul            
	//  129  235:dload           41
	//  130  237:dload           11
	//  131  239:dmul            
	//  132  240:dadd            
	//  133  241:dstore          33
				d12 = d14 - d12;
	//  134  243:dload           27
	//  135  245:dload           25
	//  136  247:dsub            
	//  137  248:dstore          25
				d24 = Math.tan(d12 / 2D);
	//  138  250:dload           25
	//  139  252:ldc2w           #90  <Double 2D>
	//  140  255:ddiv            
	//  141  256:invokestatic    #94  <Method double Math.tan(double)>
	//  142  259:dstore          41
				d12 = (Math.sin(d12) * (Math.sqrt(4D + 3D * d24 * d24) - 1.0D)) / 3D;
	//  143  261:dload           25
	//  144  263:invokestatic    #89  <Method double Math.sin(double)>
	//  145  266:ldc2w           #71  <Double 4D>
	//  146  269:ldc2w           #95  <Double 3D>
	//  147  272:dload           41
	//  148  274:dmul            
	//  149  275:dload           41
	//  150  277:dmul            
	//  151  278:dadd            
	//  152  279:invokestatic    #99  <Method double Math.sqrt(double)>
	//  153  282:dconst_1        
	//  154  283:dsub            
	//  155  284:dmul            
	//  156  285:ldc2w           #95  <Double 3D>
	//  157  288:ddiv            
	//  158  289:dstore          25
				path.rLineTo(0.0F, 0.0F);
	//  159  291:aload_0         
	//  160  292:fconst_0        
	//  161  293:fconst_0        
	//  162  294:invokevirtual   #44  <Method void Path.rLineTo(float, float)>
				path.cubicTo((float)(d8 + d9 * d12), (float)(d10 + d11 * d12), (float)(d18 - d12 * d16), (float)(d21 - d12 * d20), (float)d18, (float)d21);
	//  163  297:aload_0         
	//  164  298:dload           17
	//  165  300:dload           19
	//  166  302:dload           25
	//  167  304:dmul            
	//  168  305:dadd            
	//  169  306:d2f             
	//  170  307:dload           21
	//  171  309:dload           23
	//  172  311:dload           25
	//  173  313:dmul            
	//  174  314:dadd            
	//  175  315:d2f             
	//  176  316:dload           31
	//  177  318:dload           25
	//  178  320:dload           29
	//  179  322:dmul            
	//  180  323:dsub            
	//  181  324:d2f             
	//  182  325:dload           35
	//  183  327:dload           25
	//  184  329:dload           33
	//  185  331:dmul            
	//  186  332:dsub            
	//  187  333:d2f             
	//  188  334:dload           31
	//  189  336:d2f             
	//  190  337:dload           35
	//  191  339:d2f             
	//  192  340:invokevirtual   #68  <Method void Path.cubicTo(float, float, float, float, float, float)>
				j++;
	//  193  343:iload           44
	//  194  345:iconst_1        
	//  195  346:iadd            
	//  196  347:istore          44
				d10 = d21;
	//  197  349:dload           35
	//  198  351:dstore          21
				d8 = d18;
	//  199  353:dload           31
	//  200  355:dstore          17
				d11 = d20;
	//  201  357:dload           33
	//  202  359:dstore          23
				d9 = d16;
	//  203  361:dload           29
	//  204  363:dstore          19
				d12 = d14;
	//  205  365:dload           27
	//  206  367:dstore          25
			} else
	//* 207  369:goto            149
			{
				return;
	//  208  372:return          
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
	//  124  208:astore          45
			stringbuilder.append("Points are too far apart ");
	//  125  210:aload           45
	//  126  212:ldc1            #119 <String "Points are too far apart ">
	//  127  214:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//  128  217:pop             
			stringbuilder.append(d15);
	//  129  218:aload           45
	//  130  220:dload           40
	//  131  222:invokevirtual   #126 <Method StringBuilder StringBuilder.append(double)>
	//  132  225:pop             
			Log.w("PathParser", stringbuilder.toString());
	//  133  226:ldc1            #104 <String "PathParser">
	//  134  228:aload           45
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
		if(d3 >= 0.0D)
	//* 209  367:dload           16
	//* 210  369:dconst_0        
	//* 211  370:dcmpl           
	//* 212  371:iflt            380
			flag = true;
	//  213  374:iconst_1        
	//  214  375:istore          8
		else
	//* 215  377:goto            383
			flag = false;
	//  216  380:iconst_0        
	//  217  381:istore          8
		d = d3;
	//  218  383:dload           16
	//  219  385:dstore          10
		if(flag1 != flag)
	//* 220  387:iload           9
	//* 221  389:iload           8
	//* 222  391:icmpeq          420
			if(d3 > 0.0D)
	//* 223  394:dload           16
	//* 224  396:dconst_0        
	//* 225  397:dcmpl           
	//* 226  398:ifle            412
				d = d3 - 6.2831853071795862D;
	//  227  401:dload           16
	//  228  403:ldc2w           #137 <Double 6.2831853071795862D>
	//  229  406:dsub            
	//  230  407:dstore          10
			else
	//* 231  409:goto            420
				d = d3 + 6.2831853071795862D;
	//  232  412:dload           16
	//  233  414:ldc2w           #137 <Double 6.2831853071795862D>
	//  234  417:dadd            
	//  235  418:dstore          10
		d2 *= d9;
	//  236  420:dload           14
	//  237  422:dload           28
	//  238  424:dmul            
	//  239  425:dstore          14
		d1 *= d10;
	//  240  427:dload           12
	//  241  429:dload           30
	//  242  431:dmul            
	//  243  432:dstore          12
		arcToBezier(path, d2 * d5 - d1 * d6, d2 * d6 + d1 * d5, d9, d10, d7, d8, d4, d13, d);
	//  244  434:aload_0         
	//  245  435:dload           14
	//  246  437:dload           20
	//  247  439:dmul            
	//  248  440:dload           12
	//  249  442:dload           22
	//  250  444:dmul            
	//  251  445:dsub            
	//  252  446:dload           14
	//  253  448:dload           22
	//  254  450:dmul            
	//  255  451:dload           12
	//  256  453:dload           20
	//  257  455:dmul            
	//  258  456:dadd            
	//  259  457:dload           28
	//  260  459:dload           30
	//  261  461:dload           24
	//  262  463:dload           26
	//  263  465:dload           18
	//  264  467:dload           36
	//  265  469:dload           10
	//  266  471:invokestatic    #140 <Method void arcToBezier(Path, double, double, double, double, double, double, double, double, double)>
	//  267  474:return          
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
