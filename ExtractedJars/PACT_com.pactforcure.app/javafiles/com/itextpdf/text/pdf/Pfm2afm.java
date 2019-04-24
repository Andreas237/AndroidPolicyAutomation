// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			RandomAccessFileOrArray

public final class Pfm2afm
{

	private Pfm2afm(RandomAccessFileOrArray randomaccessfileorarray, OutputStream outputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        int[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:iconst_0        
	//    8   13:iastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iconst_0        
	//   12   17:iastore         
	//   13   18:dup             
	//   14   19:iconst_2        
	//   15   20:iconst_0        
	//   16   21:iastore         
	//   17   22:dup             
	//   18   23:iconst_3        
	//   19   24:iconst_0        
	//   20   25:iastore         
	//   21   26:dup             
	//   22   27:iconst_4        
	//   23   28:sipush          197
	//   24   31:iastore         
	//   25   32:dup             
	//   26   33:iconst_5        
	//   27   34:sipush          198
	//   28   37:iastore         
	//   29   38:dup             
	//   30   39:bipush          6
	//   31   41:sipush          199
	//   32   44:iastore         
	//   33   45:dup             
	//   34   46:bipush          7
	//   35   48:iconst_0        
	//   36   49:iastore         
	//   37   50:dup             
	//   38   51:bipush          8
	//   39   53:sipush          202
	//   40   56:iastore         
	//   41   57:dup             
	//   42   58:bipush          9
	//   43   60:iconst_0        
	//   44   61:iastore         
	//   45   62:dup             
	//   46   63:bipush          10
	//   47   65:sipush          205
	//   48   68:iastore         
	//   49   69:dup             
	//   50   70:bipush          11
	//   51   72:sipush          206
	//   52   75:iastore         
	//   53   76:dup             
	//   54   77:bipush          12
	//   55   79:sipush          207
	//   56   82:iastore         
	//   57   83:dup             
	//   58   84:bipush          13
	//   59   86:iconst_0        
	//   60   87:iastore         
	//   61   88:dup             
	//   62   89:bipush          14
	//   63   91:iconst_0        
	//   64   92:iastore         
	//   65   93:dup             
	//   66   94:bipush          15
	//   67   96:iconst_0        
	//   68   97:iastore         
	//   69   98:dup             
	//   70   99:bipush          16
	//   71  101:iconst_0        
	//   72  102:iastore         
	//   73  103:dup             
	//   74  104:bipush          17
	//   75  106:iconst_0        
	//   76  107:iastore         
	//   77  108:dup             
	//   78  109:bipush          18
	//   79  111:iconst_0        
	//   80  112:iastore         
	//   81  113:dup             
	//   82  114:bipush          19
	//   83  116:iconst_0        
	//   84  117:iastore         
	//   85  118:dup             
	//   86  119:bipush          20
	//   87  121:iconst_0        
	//   88  122:iastore         
	//   89  123:dup             
	//   90  124:bipush          21
	//   91  126:iconst_0        
	//   92  127:iastore         
	//   93  128:dup             
	//   94  129:bipush          22
	//   95  131:iconst_0        
	//   96  132:iastore         
	//   97  133:dup             
	//   98  134:bipush          23
	//   99  136:iconst_0        
	//  100  137:iastore         
	//  101  138:dup             
	//  102  139:bipush          24
	//  103  141:iconst_0        
	//  104  142:iastore         
	//  105  143:dup             
	//  106  144:bipush          25
	//  107  146:iconst_0        
	//  108  147:iastore         
	//  109  148:dup             
	//  110  149:bipush          26
	//  111  151:iconst_0        
	//  112  152:iastore         
	//  113  153:dup             
	//  114  154:bipush          27
	//  115  156:iconst_0        
	//  116  157:iastore         
	//  117  158:dup             
	//  118  159:bipush          28
	//  119  161:iconst_0        
	//  120  162:iastore         
	//  121  163:dup             
	//  122  164:bipush          29
	//  123  166:iconst_0        
	//  124  167:iastore         
	//  125  168:dup             
	//  126  169:bipush          30
	//  127  171:iconst_0        
	//  128  172:iastore         
	//  129  173:dup             
	//  130  174:bipush          31
	//  131  176:iconst_0        
	//  132  177:iastore         
	//  133  178:dup             
	//  134  179:bipush          32
	//  135  181:bipush          32
	//  136  183:iastore         
	//  137  184:dup             
	//  138  185:bipush          33
	//  139  187:bipush          33
	//  140  189:iastore         
	//  141  190:dup             
	//  142  191:bipush          34
	//  143  193:bipush          34
	//  144  195:iastore         
	//  145  196:dup             
	//  146  197:bipush          35
	//  147  199:bipush          35
	//  148  201:iastore         
	//  149  202:dup             
	//  150  203:bipush          36
	//  151  205:bipush          36
	//  152  207:iastore         
	//  153  208:dup             
	//  154  209:bipush          37
	//  155  211:bipush          37
	//  156  213:iastore         
	//  157  214:dup             
	//  158  215:bipush          38
	//  159  217:bipush          38
	//  160  219:iastore         
	//  161  220:dup             
	//  162  221:bipush          39
	//  163  223:sipush          169
	//  164  226:iastore         
	//  165  227:dup             
	//  166  228:bipush          40
	//  167  230:bipush          40
	//  168  232:iastore         
	//  169  233:dup             
	//  170  234:bipush          41
	//  171  236:bipush          41
	//  172  238:iastore         
	//  173  239:dup             
	//  174  240:bipush          42
	//  175  242:bipush          42
	//  176  244:iastore         
	//  177  245:dup             
	//  178  246:bipush          43
	//  179  248:bipush          43
	//  180  250:iastore         
	//  181  251:dup             
	//  182  252:bipush          44
	//  183  254:bipush          44
	//  184  256:iastore         
	//  185  257:dup             
	//  186  258:bipush          45
	//  187  260:bipush          45
	//  188  262:iastore         
	//  189  263:dup             
	//  190  264:bipush          46
	//  191  266:bipush          46
	//  192  268:iastore         
	//  193  269:dup             
	//  194  270:bipush          47
	//  195  272:bipush          47
	//  196  274:iastore         
	//  197  275:dup             
	//  198  276:bipush          48
	//  199  278:bipush          48
	//  200  280:iastore         
	//  201  281:dup             
	//  202  282:bipush          49
	//  203  284:bipush          49
	//  204  286:iastore         
	//  205  287:dup             
	//  206  288:bipush          50
	//  207  290:bipush          50
	//  208  292:iastore         
	//  209  293:dup             
	//  210  294:bipush          51
	//  211  296:bipush          51
	//  212  298:iastore         
	//  213  299:dup             
	//  214  300:bipush          52
	//  215  302:bipush          52
	//  216  304:iastore         
	//  217  305:dup             
	//  218  306:bipush          53
	//  219  308:bipush          53
	//  220  310:iastore         
	//  221  311:dup             
	//  222  312:bipush          54
	//  223  314:bipush          54
	//  224  316:iastore         
	//  225  317:dup             
	//  226  318:bipush          55
	//  227  320:bipush          55
	//  228  322:iastore         
	//  229  323:dup             
	//  230  324:bipush          56
	//  231  326:bipush          56
	//  232  328:iastore         
	//  233  329:dup             
	//  234  330:bipush          57
	//  235  332:bipush          57
	//  236  334:iastore         
	//  237  335:dup             
	//  238  336:bipush          58
	//  239  338:bipush          58
	//  240  340:iastore         
	//  241  341:dup             
	//  242  342:bipush          59
	//  243  344:bipush          59
	//  244  346:iastore         
	//  245  347:dup             
	//  246  348:bipush          60
	//  247  350:bipush          60
	//  248  352:iastore         
	//  249  353:dup             
	//  250  354:bipush          61
	//  251  356:bipush          61
	//  252  358:iastore         
	//  253  359:dup             
	//  254  360:bipush          62
	//  255  362:bipush          62
	//  256  364:iastore         
	//  257  365:dup             
	//  258  366:bipush          63
	//  259  368:bipush          63
	//  260  370:iastore         
	//  261  371:dup             
	//  262  372:bipush          64
	//  263  374:bipush          64
	//  264  376:iastore         
	//  265  377:dup             
	//  266  378:bipush          65
	//  267  380:bipush          65
	//  268  382:iastore         
	//  269  383:dup             
	//  270  384:bipush          66
	//  271  386:bipush          66
	//  272  388:iastore         
	//  273  389:dup             
	//  274  390:bipush          67
	//  275  392:bipush          67
	//  276  394:iastore         
	//  277  395:dup             
	//  278  396:bipush          68
	//  279  398:bipush          68
	//  280  400:iastore         
	//  281  401:dup             
	//  282  402:bipush          69
	//  283  404:bipush          69
	//  284  406:iastore         
	//  285  407:dup             
	//  286  408:bipush          70
	//  287  410:bipush          70
	//  288  412:iastore         
	//  289  413:dup             
	//  290  414:bipush          71
	//  291  416:bipush          71
	//  292  418:iastore         
	//  293  419:dup             
	//  294  420:bipush          72
	//  295  422:bipush          72
	//  296  424:iastore         
	//  297  425:dup             
	//  298  426:bipush          73
	//  299  428:bipush          73
	//  300  430:iastore         
	//  301  431:dup             
	//  302  432:bipush          74
	//  303  434:bipush          74
	//  304  436:iastore         
	//  305  437:dup             
	//  306  438:bipush          75
	//  307  440:bipush          75
	//  308  442:iastore         
	//  309  443:dup             
	//  310  444:bipush          76
	//  311  446:bipush          76
	//  312  448:iastore         
	//  313  449:dup             
	//  314  450:bipush          77
	//  315  452:bipush          77
	//  316  454:iastore         
	//  317  455:dup             
	//  318  456:bipush          78
	//  319  458:bipush          78
	//  320  460:iastore         
	//  321  461:dup             
	//  322  462:bipush          79
	//  323  464:bipush          79
	//  324  466:iastore         
	//  325  467:dup             
	//  326  468:bipush          80
	//  327  470:bipush          80
	//  328  472:iastore         
	//  329  473:dup             
	//  330  474:bipush          81
	//  331  476:bipush          81
	//  332  478:iastore         
	//  333  479:dup             
	//  334  480:bipush          82
	//  335  482:bipush          82
	//  336  484:iastore         
	//  337  485:dup             
	//  338  486:bipush          83
	//  339  488:bipush          83
	//  340  490:iastore         
	//  341  491:dup             
	//  342  492:bipush          84
	//  343  494:bipush          84
	//  344  496:iastore         
	//  345  497:dup             
	//  346  498:bipush          85
	//  347  500:bipush          85
	//  348  502:iastore         
	//  349  503:dup             
	//  350  504:bipush          86
	//  351  506:bipush          86
	//  352  508:iastore         
	//  353  509:dup             
	//  354  510:bipush          87
	//  355  512:bipush          87
	//  356  514:iastore         
	//  357  515:dup             
	//  358  516:bipush          88
	//  359  518:bipush          88
	//  360  520:iastore         
	//  361  521:dup             
	//  362  522:bipush          89
	//  363  524:bipush          89
	//  364  526:iastore         
	//  365  527:dup             
	//  366  528:bipush          90
	//  367  530:bipush          90
	//  368  532:iastore         
	//  369  533:dup             
	//  370  534:bipush          91
	//  371  536:bipush          91
	//  372  538:iastore         
	//  373  539:dup             
	//  374  540:bipush          92
	//  375  542:bipush          92
	//  376  544:iastore         
	//  377  545:dup             
	//  378  546:bipush          93
	//  379  548:bipush          93
	//  380  550:iastore         
	//  381  551:dup             
	//  382  552:bipush          94
	//  383  554:bipush          94
	//  384  556:iastore         
	//  385  557:dup             
	//  386  558:bipush          95
	//  387  560:bipush          95
	//  388  562:iastore         
	//  389  563:dup             
	//  390  564:bipush          96
	//  391  566:sipush          193
	//  392  569:iastore         
	//  393  570:dup             
	//  394  571:bipush          97
	//  395  573:bipush          97
	//  396  575:iastore         
	//  397  576:dup             
	//  398  577:bipush          98
	//  399  579:bipush          98
	//  400  581:iastore         
	//  401  582:dup             
	//  402  583:bipush          99
	//  403  585:bipush          99
	//  404  587:iastore         
	//  405  588:dup             
	//  406  589:bipush          100
	//  407  591:bipush          100
	//  408  593:iastore         
	//  409  594:dup             
	//  410  595:bipush          101
	//  411  597:bipush          101
	//  412  599:iastore         
	//  413  600:dup             
	//  414  601:bipush          102
	//  415  603:bipush          102
	//  416  605:iastore         
	//  417  606:dup             
	//  418  607:bipush          103
	//  419  609:bipush          103
	//  420  611:iastore         
	//  421  612:dup             
	//  422  613:bipush          104
	//  423  615:bipush          104
	//  424  617:iastore         
	//  425  618:dup             
	//  426  619:bipush          105
	//  427  621:bipush          105
	//  428  623:iastore         
	//  429  624:dup             
	//  430  625:bipush          106
	//  431  627:bipush          106
	//  432  629:iastore         
	//  433  630:dup             
	//  434  631:bipush          107
	//  435  633:bipush          107
	//  436  635:iastore         
	//  437  636:dup             
	//  438  637:bipush          108
	//  439  639:bipush          108
	//  440  641:iastore         
	//  441  642:dup             
	//  442  643:bipush          109
	//  443  645:bipush          109
	//  444  647:iastore         
	//  445  648:dup             
	//  446  649:bipush          110
	//  447  651:bipush          110
	//  448  653:iastore         
	//  449  654:dup             
	//  450  655:bipush          111
	//  451  657:bipush          111
	//  452  659:iastore         
	//  453  660:dup             
	//  454  661:bipush          112
	//  455  663:bipush          112
	//  456  665:iastore         
	//  457  666:dup             
	//  458  667:bipush          113
	//  459  669:bipush          113
	//  460  671:iastore         
	//  461  672:dup             
	//  462  673:bipush          114
	//  463  675:bipush          114
	//  464  677:iastore         
	//  465  678:dup             
	//  466  679:bipush          115
	//  467  681:bipush          115
	//  468  683:iastore         
	//  469  684:dup             
	//  470  685:bipush          116
	//  471  687:bipush          116
	//  472  689:iastore         
	//  473  690:dup             
	//  474  691:bipush          117
	//  475  693:bipush          117
	//  476  695:iastore         
	//  477  696:dup             
	//  478  697:bipush          118
	//  479  699:bipush          118
	//  480  701:iastore         
	//  481  702:dup             
	//  482  703:bipush          119
	//  483  705:bipush          119
	//  484  707:iastore         
	//  485  708:dup             
	//  486  709:bipush          120
	//  487  711:bipush          120
	//  488  713:iastore         
	//  489  714:dup             
	//  490  715:bipush          121
	//  491  717:bipush          121
	//  492  719:iastore         
	//  493  720:dup             
	//  494  721:bipush          122
	//  495  723:bipush          122
	//  496  725:iastore         
	//  497  726:dup             
	//  498  727:bipush          123
	//  499  729:bipush          123
	//  500  731:iastore         
	//  501  732:dup             
	//  502  733:bipush          124
	//  503  735:bipush          124
	//  504  737:iastore         
	//  505  738:dup             
	//  506  739:bipush          125
	//  507  741:bipush          125
	//  508  743:iastore         
	//  509  744:dup             
	//  510  745:bipush          126
	//  511  747:bipush          126
	//  512  749:iastore         
	//  513  750:dup             
	//  514  751:bipush          127
	//  515  753:bipush          127
	//  516  755:iastore         
	//  517  756:dup             
	//  518  757:sipush          128
	//  519  760:sipush          128
	//  520  763:iastore         
	//  521  764:dup             
	//  522  765:sipush          129
	//  523  768:iconst_0        
	//  524  769:iastore         
	//  525  770:dup             
	//  526  771:sipush          130
	//  527  774:sipush          184
	//  528  777:iastore         
	//  529  778:dup             
	//  530  779:sipush          131
	//  531  782:sipush          166
	//  532  785:iastore         
	//  533  786:dup             
	//  534  787:sipush          132
	//  535  790:sipush          185
	//  536  793:iastore         
	//  537  794:dup             
	//  538  795:sipush          133
	//  539  798:sipush          188
	//  540  801:iastore         
	//  541  802:dup             
	//  542  803:sipush          134
	//  543  806:sipush          178
	//  544  809:iastore         
	//  545  810:dup             
	//  546  811:sipush          135
	//  547  814:sipush          179
	//  548  817:iastore         
	//  549  818:dup             
	//  550  819:sipush          136
	//  551  822:sipush          195
	//  552  825:iastore         
	//  553  826:dup             
	//  554  827:sipush          137
	//  555  830:sipush          189
	//  556  833:iastore         
	//  557  834:dup             
	//  558  835:sipush          138
	//  559  838:iconst_0        
	//  560  839:iastore         
	//  561  840:dup             
	//  562  841:sipush          139
	//  563  844:sipush          172
	//  564  847:iastore         
	//  565  848:dup             
	//  566  849:sipush          140
	//  567  852:sipush          234
	//  568  855:iastore         
	//  569  856:dup             
	//  570  857:sipush          141
	//  571  860:iconst_0        
	//  572  861:iastore         
	//  573  862:dup             
	//  574  863:sipush          142
	//  575  866:iconst_0        
	//  576  867:iastore         
	//  577  868:dup             
	//  578  869:sipush          143
	//  579  872:iconst_0        
	//  580  873:iastore         
	//  581  874:dup             
	//  582  875:sipush          144
	//  583  878:iconst_0        
	//  584  879:iastore         
	//  585  880:dup             
	//  586  881:sipush          145
	//  587  884:bipush          96
	//  588  886:iastore         
	//  589  887:dup             
	//  590  888:sipush          146
	//  591  891:iconst_0        
	//  592  892:iastore         
	//  593  893:dup             
	//  594  894:sipush          147
	//  595  897:sipush          170
	//  596  900:iastore         
	//  597  901:dup             
	//  598  902:sipush          148
	//  599  905:sipush          186
	//  600  908:iastore         
	//  601  909:dup             
	//  602  910:sipush          149
	//  603  913:sipush          183
	//  604  916:iastore         
	//  605  917:dup             
	//  606  918:sipush          150
	//  607  921:sipush          177
	//  608  924:iastore         
	//  609  925:dup             
	//  610  926:sipush          151
	//  611  929:sipush          208
	//  612  932:iastore         
	//  613  933:dup             
	//  614  934:sipush          152
	//  615  937:sipush          196
	//  616  940:iastore         
	//  617  941:dup             
	//  618  942:sipush          153
	//  619  945:iconst_0        
	//  620  946:iastore         
	//  621  947:dup             
	//  622  948:sipush          154
	//  623  951:iconst_0        
	//  624  952:iastore         
	//  625  953:dup             
	//  626  954:sipush          155
	//  627  957:sipush          173
	//  628  960:iastore         
	//  629  961:dup             
	//  630  962:sipush          156
	//  631  965:sipush          250
	//  632  968:iastore         
	//  633  969:dup             
	//  634  970:sipush          157
	//  635  973:iconst_0        
	//  636  974:iastore         
	//  637  975:dup             
	//  638  976:sipush          158
	//  639  979:iconst_0        
	//  640  980:iastore         
	//  641  981:dup             
	//  642  982:sipush          159
	//  643  985:iconst_0        
	//  644  986:iastore         
	//  645  987:dup             
	//  646  988:sipush          160
	//  647  991:iconst_0        
	//  648  992:iastore         
	//  649  993:dup             
	//  650  994:sipush          161
	//  651  997:sipush          161
	//  652 1000:iastore         
	//  653 1001:dup             
	//  654 1002:sipush          162
	//  655 1005:sipush          162
	//  656 1008:iastore         
	//  657 1009:dup             
	//  658 1010:sipush          163
	//  659 1013:sipush          163
	//  660 1016:iastore         
	//  661 1017:dup             
	//  662 1018:sipush          164
	//  663 1021:sipush          168
	//  664 1024:iastore         
	//  665 1025:dup             
	//  666 1026:sipush          165
	//  667 1029:sipush          165
	//  668 1032:iastore         
	//  669 1033:dup             
	//  670 1034:sipush          166
	//  671 1037:iconst_0        
	//  672 1038:iastore         
	//  673 1039:dup             
	//  674 1040:sipush          167
	//  675 1043:sipush          167
	//  676 1046:iastore         
	//  677 1047:dup             
	//  678 1048:sipush          168
	//  679 1051:sipush          200
	//  680 1054:iastore         
	//  681 1055:dup             
	//  682 1056:sipush          169
	//  683 1059:iconst_0        
	//  684 1060:iastore         
	//  685 1061:dup             
	//  686 1062:sipush          170
	//  687 1065:sipush          227
	//  688 1068:iastore         
	//  689 1069:dup             
	//  690 1070:sipush          171
	//  691 1073:sipush          171
	//  692 1076:iastore         
	//  693 1077:dup             
	//  694 1078:sipush          172
	//  695 1081:iconst_0        
	//  696 1082:iastore         
	//  697 1083:dup             
	//  698 1084:sipush          173
	//  699 1087:iconst_0        
	//  700 1088:iastore         
	//  701 1089:dup             
	//  702 1090:sipush          174
	//  703 1093:iconst_0        
	//  704 1094:iastore         
	//  705 1095:dup             
	//  706 1096:sipush          175
	//  707 1099:sipush          197
	//  708 1102:iastore         
	//  709 1103:dup             
	//  710 1104:sipush          176
	//  711 1107:iconst_0        
	//  712 1108:iastore         
	//  713 1109:dup             
	//  714 1110:sipush          177
	//  715 1113:iconst_0        
	//  716 1114:iastore         
	//  717 1115:dup             
	//  718 1116:sipush          178
	//  719 1119:iconst_0        
	//  720 1120:iastore         
	//  721 1121:dup             
	//  722 1122:sipush          179
	//  723 1125:iconst_0        
	//  724 1126:iastore         
	//  725 1127:dup             
	//  726 1128:sipush          180
	//  727 1131:sipush          194
	//  728 1134:iastore         
	//  729 1135:dup             
	//  730 1136:sipush          181
	//  731 1139:iconst_0        
	//  732 1140:iastore         
	//  733 1141:dup             
	//  734 1142:sipush          182
	//  735 1145:sipush          182
	//  736 1148:iastore         
	//  737 1149:dup             
	//  738 1150:sipush          183
	//  739 1153:sipush          180
	//  740 1156:iastore         
	//  741 1157:dup             
	//  742 1158:sipush          184
	//  743 1161:sipush          203
	//  744 1164:iastore         
	//  745 1165:dup             
	//  746 1166:sipush          185
	//  747 1169:iconst_0        
	//  748 1170:iastore         
	//  749 1171:dup             
	//  750 1172:sipush          186
	//  751 1175:sipush          235
	//  752 1178:iastore         
	//  753 1179:dup             
	//  754 1180:sipush          187
	//  755 1183:sipush          187
	//  756 1186:iastore         
	//  757 1187:dup             
	//  758 1188:sipush          188
	//  759 1191:iconst_0        
	//  760 1192:iastore         
	//  761 1193:dup             
	//  762 1194:sipush          189
	//  763 1197:iconst_0        
	//  764 1198:iastore         
	//  765 1199:dup             
	//  766 1200:sipush          190
	//  767 1203:iconst_0        
	//  768 1204:iastore         
	//  769 1205:dup             
	//  770 1206:sipush          191
	//  771 1209:sipush          191
	//  772 1212:iastore         
	//  773 1213:dup             
	//  774 1214:sipush          192
	//  775 1217:iconst_0        
	//  776 1218:iastore         
	//  777 1219:dup             
	//  778 1220:sipush          193
	//  779 1223:iconst_0        
	//  780 1224:iastore         
	//  781 1225:dup             
	//  782 1226:sipush          194
	//  783 1229:iconst_0        
	//  784 1230:iastore         
	//  785 1231:dup             
	//  786 1232:sipush          195
	//  787 1235:iconst_0        
	//  788 1236:iastore         
	//  789 1237:dup             
	//  790 1238:sipush          196
	//  791 1241:iconst_0        
	//  792 1242:iastore         
	//  793 1243:dup             
	//  794 1244:sipush          197
	//  795 1247:iconst_0        
	//  796 1248:iastore         
	//  797 1249:dup             
	//  798 1250:sipush          198
	//  799 1253:sipush          225
	//  800 1256:iastore         
	//  801 1257:dup             
	//  802 1258:sipush          199
	//  803 1261:iconst_0        
	//  804 1262:iastore         
	//  805 1263:dup             
	//  806 1264:sipush          200
	//  807 1267:iconst_0        
	//  808 1268:iastore         
	//  809 1269:dup             
	//  810 1270:sipush          201
	//  811 1273:iconst_0        
	//  812 1274:iastore         
	//  813 1275:dup             
	//  814 1276:sipush          202
	//  815 1279:iconst_0        
	//  816 1280:iastore         
	//  817 1281:dup             
	//  818 1282:sipush          203
	//  819 1285:iconst_0        
	//  820 1286:iastore         
	//  821 1287:dup             
	//  822 1288:sipush          204
	//  823 1291:iconst_0        
	//  824 1292:iastore         
	//  825 1293:dup             
	//  826 1294:sipush          205
	//  827 1297:iconst_0        
	//  828 1298:iastore         
	//  829 1299:dup             
	//  830 1300:sipush          206
	//  831 1303:iconst_0        
	//  832 1304:iastore         
	//  833 1305:dup             
	//  834 1306:sipush          207
	//  835 1309:iconst_0        
	//  836 1310:iastore         
	//  837 1311:dup             
	//  838 1312:sipush          208
	//  839 1315:iconst_0        
	//  840 1316:iastore         
	//  841 1317:dup             
	//  842 1318:sipush          209
	//  843 1321:iconst_0        
	//  844 1322:iastore         
	//  845 1323:dup             
	//  846 1324:sipush          210
	//  847 1327:iconst_0        
	//  848 1328:iastore         
	//  849 1329:dup             
	//  850 1330:sipush          211
	//  851 1333:iconst_0        
	//  852 1334:iastore         
	//  853 1335:dup             
	//  854 1336:sipush          212
	//  855 1339:iconst_0        
	//  856 1340:iastore         
	//  857 1341:dup             
	//  858 1342:sipush          213
	//  859 1345:iconst_0        
	//  860 1346:iastore         
	//  861 1347:dup             
	//  862 1348:sipush          214
	//  863 1351:iconst_0        
	//  864 1352:iastore         
	//  865 1353:dup             
	//  866 1354:sipush          215
	//  867 1357:iconst_0        
	//  868 1358:iastore         
	//  869 1359:dup             
	//  870 1360:sipush          216
	//  871 1363:sipush          233
	//  872 1366:iastore         
	//  873 1367:dup             
	//  874 1368:sipush          217
	//  875 1371:iconst_0        
	//  876 1372:iastore         
	//  877 1373:dup             
	//  878 1374:sipush          218
	//  879 1377:iconst_0        
	//  880 1378:iastore         
	//  881 1379:dup             
	//  882 1380:sipush          219
	//  883 1383:iconst_0        
	//  884 1384:iastore         
	//  885 1385:dup             
	//  886 1386:sipush          220
	//  887 1389:iconst_0        
	//  888 1390:iastore         
	//  889 1391:dup             
	//  890 1392:sipush          221
	//  891 1395:iconst_0        
	//  892 1396:iastore         
	//  893 1397:dup             
	//  894 1398:sipush          222
	//  895 1401:iconst_0        
	//  896 1402:iastore         
	//  897 1403:dup             
	//  898 1404:sipush          223
	//  899 1407:sipush          251
	//  900 1410:iastore         
	//  901 1411:dup             
	//  902 1412:sipush          224
	//  903 1415:iconst_0        
	//  904 1416:iastore         
	//  905 1417:dup             
	//  906 1418:sipush          225
	//  907 1421:iconst_0        
	//  908 1422:iastore         
	//  909 1423:dup             
	//  910 1424:sipush          226
	//  911 1427:iconst_0        
	//  912 1428:iastore         
	//  913 1429:dup             
	//  914 1430:sipush          227
	//  915 1433:iconst_0        
	//  916 1434:iastore         
	//  917 1435:dup             
	//  918 1436:sipush          228
	//  919 1439:iconst_0        
	//  920 1440:iastore         
	//  921 1441:dup             
	//  922 1442:sipush          229
	//  923 1445:iconst_0        
	//  924 1446:iastore         
	//  925 1447:dup             
	//  926 1448:sipush          230
	//  927 1451:sipush          241
	//  928 1454:iastore         
	//  929 1455:dup             
	//  930 1456:sipush          231
	//  931 1459:iconst_0        
	//  932 1460:iastore         
	//  933 1461:dup             
	//  934 1462:sipush          232
	//  935 1465:iconst_0        
	//  936 1466:iastore         
	//  937 1467:dup             
	//  938 1468:sipush          233
	//  939 1471:iconst_0        
	//  940 1472:iastore         
	//  941 1473:dup             
	//  942 1474:sipush          234
	//  943 1477:iconst_0        
	//  944 1478:iastore         
	//  945 1479:dup             
	//  946 1480:sipush          235
	//  947 1483:iconst_0        
	//  948 1484:iastore         
	//  949 1485:dup             
	//  950 1486:sipush          236
	//  951 1489:iconst_0        
	//  952 1490:iastore         
	//  953 1491:dup             
	//  954 1492:sipush          237
	//  955 1495:iconst_0        
	//  956 1496:iastore         
	//  957 1497:dup             
	//  958 1498:sipush          238
	//  959 1501:iconst_0        
	//  960 1502:iastore         
	//  961 1503:dup             
	//  962 1504:sipush          239
	//  963 1507:iconst_0        
	//  964 1508:iastore         
	//  965 1509:dup             
	//  966 1510:sipush          240
	//  967 1513:iconst_0        
	//  968 1514:iastore         
	//  969 1515:dup             
	//  970 1516:sipush          241
	//  971 1519:iconst_0        
	//  972 1520:iastore         
	//  973 1521:dup             
	//  974 1522:sipush          242
	//  975 1525:iconst_0        
	//  976 1526:iastore         
	//  977 1527:dup             
	//  978 1528:sipush          243
	//  979 1531:iconst_0        
	//  980 1532:iastore         
	//  981 1533:dup             
	//  982 1534:sipush          244
	//  983 1537:iconst_0        
	//  984 1538:iastore         
	//  985 1539:dup             
	//  986 1540:sipush          245
	//  987 1543:iconst_0        
	//  988 1544:iastore         
	//  989 1545:dup             
	//  990 1546:sipush          246
	//  991 1549:iconst_0        
	//  992 1550:iastore         
	//  993 1551:dup             
	//  994 1552:sipush          247
	//  995 1555:iconst_0        
	//  996 1556:iastore         
	//  997 1557:dup             
	//  998 1558:sipush          248
	//  999 1561:sipush          249
	// 1000 1564:iastore         
	// 1001 1565:dup             
	// 1002 1566:sipush          249
	// 1003 1569:iconst_0        
	// 1004 1570:iastore         
	// 1005 1571:dup             
	// 1006 1572:sipush          250
	// 1007 1575:iconst_0        
	// 1008 1576:iastore         
	// 1009 1577:dup             
	// 1010 1578:sipush          251
	// 1011 1581:iconst_0        
	// 1012 1582:iastore         
	// 1013 1583:dup             
	// 1014 1584:sipush          252
	// 1015 1587:iconst_0        
	// 1016 1588:iastore         
	// 1017 1589:dup             
	// 1018 1590:sipush          253
	// 1019 1593:iconst_0        
	// 1020 1594:iastore         
	// 1021 1595:dup             
	// 1022 1596:sipush          254
	// 1023 1599:iconst_0        
	// 1024 1600:iastore         
	// 1025 1601:dup             
	// 1026 1602:sipush          255
	// 1027 1605:iconst_0        
	// 1028 1606:iastore         
	// 1029 1607:putfield        #68  <Field int[] Win2PSStd>
	// 1030 1610:aload_0         
	// 1031 1611:sipush          256
	// 1032 1614:newarray        int[]
	// 1033 1616:dup             
	// 1034 1617:iconst_0        
	// 1035 1618:iconst_0        
	// 1036 1619:iastore         
	// 1037 1620:dup             
	// 1038 1621:iconst_1        
	// 1039 1622:iconst_0        
	// 1040 1623:iastore         
	// 1041 1624:dup             
	// 1042 1625:iconst_2        
	// 1043 1626:iconst_0        
	// 1044 1627:iastore         
	// 1045 1628:dup             
	// 1046 1629:iconst_3        
	// 1047 1630:iconst_0        
	// 1048 1631:iastore         
	// 1049 1632:dup             
	// 1050 1633:iconst_4        
	// 1051 1634:iconst_2        
	// 1052 1635:iastore         
	// 1053 1636:dup             
	// 1054 1637:iconst_5        
	// 1055 1638:iconst_2        
	// 1056 1639:iastore         
	// 1057 1640:dup             
	// 1058 1641:bipush          6
	// 1059 1643:iconst_2        
	// 1060 1644:iastore         
	// 1061 1645:dup             
	// 1062 1646:bipush          7
	// 1063 1648:iconst_0        
	// 1064 1649:iastore         
	// 1065 1650:dup             
	// 1066 1651:bipush          8
	// 1067 1653:iconst_2        
	// 1068 1654:iastore         
	// 1069 1655:dup             
	// 1070 1656:bipush          9
	// 1071 1658:iconst_0        
	// 1072 1659:iastore         
	// 1073 1660:dup             
	// 1074 1661:bipush          10
	// 1075 1663:iconst_2        
	// 1076 1664:iastore         
	// 1077 1665:dup             
	// 1078 1666:bipush          11
	// 1079 1668:iconst_2        
	// 1080 1669:iastore         
	// 1081 1670:dup             
	// 1082 1671:bipush          12
	// 1083 1673:iconst_2        
	// 1084 1674:iastore         
	// 1085 1675:dup             
	// 1086 1676:bipush          13
	// 1087 1678:iconst_0        
	// 1088 1679:iastore         
	// 1089 1680:dup             
	// 1090 1681:bipush          14
	// 1091 1683:iconst_0        
	// 1092 1684:iastore         
	// 1093 1685:dup             
	// 1094 1686:bipush          15
	// 1095 1688:iconst_0        
	// 1096 1689:iastore         
	// 1097 1690:dup             
	// 1098 1691:bipush          16
	// 1099 1693:iconst_0        
	// 1100 1694:iastore         
	// 1101 1695:dup             
	// 1102 1696:bipush          17
	// 1103 1698:iconst_0        
	// 1104 1699:iastore         
	// 1105 1700:dup             
	// 1106 1701:bipush          18
	// 1107 1703:iconst_0        
	// 1108 1704:iastore         
	// 1109 1705:dup             
	// 1110 1706:bipush          19
	// 1111 1708:iconst_0        
	// 1112 1709:iastore         
	// 1113 1710:dup             
	// 1114 1711:bipush          20
	// 1115 1713:iconst_0        
	// 1116 1714:iastore         
	// 1117 1715:dup             
	// 1118 1716:bipush          21
	// 1119 1718:iconst_0        
	// 1120 1719:iastore         
	// 1121 1720:dup             
	// 1122 1721:bipush          22
	// 1123 1723:iconst_0        
	// 1124 1724:iastore         
	// 1125 1725:dup             
	// 1126 1726:bipush          23
	// 1127 1728:iconst_0        
	// 1128 1729:iastore         
	// 1129 1730:dup             
	// 1130 1731:bipush          24
	// 1131 1733:iconst_0        
	// 1132 1734:iastore         
	// 1133 1735:dup             
	// 1134 1736:bipush          25
	// 1135 1738:iconst_0        
	// 1136 1739:iastore         
	// 1137 1740:dup             
	// 1138 1741:bipush          26
	// 1139 1743:iconst_0        
	// 1140 1744:iastore         
	// 1141 1745:dup             
	// 1142 1746:bipush          27
	// 1143 1748:iconst_0        
	// 1144 1749:iastore         
	// 1145 1750:dup             
	// 1146 1751:bipush          28
	// 1147 1753:iconst_0        
	// 1148 1754:iastore         
	// 1149 1755:dup             
	// 1150 1756:bipush          29
	// 1151 1758:iconst_0        
	// 1152 1759:iastore         
	// 1153 1760:dup             
	// 1154 1761:bipush          30
	// 1155 1763:iconst_0        
	// 1156 1764:iastore         
	// 1157 1765:dup             
	// 1158 1766:bipush          31
	// 1159 1768:iconst_0        
	// 1160 1769:iastore         
	// 1161 1770:dup             
	// 1162 1771:bipush          32
	// 1163 1773:iconst_1        
	// 1164 1774:iastore         
	// 1165 1775:dup             
	// 1166 1776:bipush          33
	// 1167 1778:iconst_1        
	// 1168 1779:iastore         
	// 1169 1780:dup             
	// 1170 1781:bipush          34
	// 1171 1783:iconst_1        
	// 1172 1784:iastore         
	// 1173 1785:dup             
	// 1174 1786:bipush          35
	// 1175 1788:iconst_1        
	// 1176 1789:iastore         
	// 1177 1790:dup             
	// 1178 1791:bipush          36
	// 1179 1793:iconst_1        
	// 1180 1794:iastore         
	// 1181 1795:dup             
	// 1182 1796:bipush          37
	// 1183 1798:iconst_1        
	// 1184 1799:iastore         
	// 1185 1800:dup             
	// 1186 1801:bipush          38
	// 1187 1803:iconst_1        
	// 1188 1804:iastore         
	// 1189 1805:dup             
	// 1190 1806:bipush          39
	// 1191 1808:iconst_1        
	// 1192 1809:iastore         
	// 1193 1810:dup             
	// 1194 1811:bipush          40
	// 1195 1813:iconst_1        
	// 1196 1814:iastore         
	// 1197 1815:dup             
	// 1198 1816:bipush          41
	// 1199 1818:iconst_1        
	// 1200 1819:iastore         
	// 1201 1820:dup             
	// 1202 1821:bipush          42
	// 1203 1823:iconst_1        
	// 1204 1824:iastore         
	// 1205 1825:dup             
	// 1206 1826:bipush          43
	// 1207 1828:iconst_1        
	// 1208 1829:iastore         
	// 1209 1830:dup             
	// 1210 1831:bipush          44
	// 1211 1833:iconst_1        
	// 1212 1834:iastore         
	// 1213 1835:dup             
	// 1214 1836:bipush          45
	// 1215 1838:iconst_1        
	// 1216 1839:iastore         
	// 1217 1840:dup             
	// 1218 1841:bipush          46
	// 1219 1843:iconst_1        
	// 1220 1844:iastore         
	// 1221 1845:dup             
	// 1222 1846:bipush          47
	// 1223 1848:iconst_1        
	// 1224 1849:iastore         
	// 1225 1850:dup             
	// 1226 1851:bipush          48
	// 1227 1853:iconst_1        
	// 1228 1854:iastore         
	// 1229 1855:dup             
	// 1230 1856:bipush          49
	// 1231 1858:iconst_1        
	// 1232 1859:iastore         
	// 1233 1860:dup             
	// 1234 1861:bipush          50
	// 1235 1863:iconst_1        
	// 1236 1864:iastore         
	// 1237 1865:dup             
	// 1238 1866:bipush          51
	// 1239 1868:iconst_1        
	// 1240 1869:iastore         
	// 1241 1870:dup             
	// 1242 1871:bipush          52
	// 1243 1873:iconst_1        
	// 1244 1874:iastore         
	// 1245 1875:dup             
	// 1246 1876:bipush          53
	// 1247 1878:iconst_1        
	// 1248 1879:iastore         
	// 1249 1880:dup             
	// 1250 1881:bipush          54
	// 1251 1883:iconst_1        
	// 1252 1884:iastore         
	// 1253 1885:dup             
	// 1254 1886:bipush          55
	// 1255 1888:iconst_1        
	// 1256 1889:iastore         
	// 1257 1890:dup             
	// 1258 1891:bipush          56
	// 1259 1893:iconst_1        
	// 1260 1894:iastore         
	// 1261 1895:dup             
	// 1262 1896:bipush          57
	// 1263 1898:iconst_1        
	// 1264 1899:iastore         
	// 1265 1900:dup             
	// 1266 1901:bipush          58
	// 1267 1903:iconst_1        
	// 1268 1904:iastore         
	// 1269 1905:dup             
	// 1270 1906:bipush          59
	// 1271 1908:iconst_1        
	// 1272 1909:iastore         
	// 1273 1910:dup             
	// 1274 1911:bipush          60
	// 1275 1913:iconst_1        
	// 1276 1914:iastore         
	// 1277 1915:dup             
	// 1278 1916:bipush          61
	// 1279 1918:iconst_1        
	// 1280 1919:iastore         
	// 1281 1920:dup             
	// 1282 1921:bipush          62
	// 1283 1923:iconst_1        
	// 1284 1924:iastore         
	// 1285 1925:dup             
	// 1286 1926:bipush          63
	// 1287 1928:iconst_1        
	// 1288 1929:iastore         
	// 1289 1930:dup             
	// 1290 1931:bipush          64
	// 1291 1933:iconst_1        
	// 1292 1934:iastore         
	// 1293 1935:dup             
	// 1294 1936:bipush          65
	// 1295 1938:iconst_1        
	// 1296 1939:iastore         
	// 1297 1940:dup             
	// 1298 1941:bipush          66
	// 1299 1943:iconst_1        
	// 1300 1944:iastore         
	// 1301 1945:dup             
	// 1302 1946:bipush          67
	// 1303 1948:iconst_1        
	// 1304 1949:iastore         
	// 1305 1950:dup             
	// 1306 1951:bipush          68
	// 1307 1953:iconst_1        
	// 1308 1954:iastore         
	// 1309 1955:dup             
	// 1310 1956:bipush          69
	// 1311 1958:iconst_1        
	// 1312 1959:iastore         
	// 1313 1960:dup             
	// 1314 1961:bipush          70
	// 1315 1963:iconst_1        
	// 1316 1964:iastore         
	// 1317 1965:dup             
	// 1318 1966:bipush          71
	// 1319 1968:iconst_1        
	// 1320 1969:iastore         
	// 1321 1970:dup             
	// 1322 1971:bipush          72
	// 1323 1973:iconst_1        
	// 1324 1974:iastore         
	// 1325 1975:dup             
	// 1326 1976:bipush          73
	// 1327 1978:iconst_1        
	// 1328 1979:iastore         
	// 1329 1980:dup             
	// 1330 1981:bipush          74
	// 1331 1983:iconst_1        
	// 1332 1984:iastore         
	// 1333 1985:dup             
	// 1334 1986:bipush          75
	// 1335 1988:iconst_1        
	// 1336 1989:iastore         
	// 1337 1990:dup             
	// 1338 1991:bipush          76
	// 1339 1993:iconst_1        
	// 1340 1994:iastore         
	// 1341 1995:dup             
	// 1342 1996:bipush          77
	// 1343 1998:iconst_1        
	// 1344 1999:iastore         
	// 1345 2000:dup             
	// 1346 2001:bipush          78
	// 1347 2003:iconst_1        
	// 1348 2004:iastore         
	// 1349 2005:dup             
	// 1350 2006:bipush          79
	// 1351 2008:iconst_1        
	// 1352 2009:iastore         
	// 1353 2010:dup             
	// 1354 2011:bipush          80
	// 1355 2013:iconst_1        
	// 1356 2014:iastore         
	// 1357 2015:dup             
	// 1358 2016:bipush          81
	// 1359 2018:iconst_1        
	// 1360 2019:iastore         
	// 1361 2020:dup             
	// 1362 2021:bipush          82
	// 1363 2023:iconst_1        
	// 1364 2024:iastore         
	// 1365 2025:dup             
	// 1366 2026:bipush          83
	// 1367 2028:iconst_1        
	// 1368 2029:iastore         
	// 1369 2030:dup             
	// 1370 2031:bipush          84
	// 1371 2033:iconst_1        
	// 1372 2034:iastore         
	// 1373 2035:dup             
	// 1374 2036:bipush          85
	// 1375 2038:iconst_1        
	// 1376 2039:iastore         
	// 1377 2040:dup             
	// 1378 2041:bipush          86
	// 1379 2043:iconst_1        
	// 1380 2044:iastore         
	// 1381 2045:dup             
	// 1382 2046:bipush          87
	// 1383 2048:iconst_1        
	// 1384 2049:iastore         
	// 1385 2050:dup             
	// 1386 2051:bipush          88
	// 1387 2053:iconst_1        
	// 1388 2054:iastore         
	// 1389 2055:dup             
	// 1390 2056:bipush          89
	// 1391 2058:iconst_1        
	// 1392 2059:iastore         
	// 1393 2060:dup             
	// 1394 2061:bipush          90
	// 1395 2063:iconst_1        
	// 1396 2064:iastore         
	// 1397 2065:dup             
	// 1398 2066:bipush          91
	// 1399 2068:iconst_1        
	// 1400 2069:iastore         
	// 1401 2070:dup             
	// 1402 2071:bipush          92
	// 1403 2073:iconst_1        
	// 1404 2074:iastore         
	// 1405 2075:dup             
	// 1406 2076:bipush          93
	// 1407 2078:iconst_1        
	// 1408 2079:iastore         
	// 1409 2080:dup             
	// 1410 2081:bipush          94
	// 1411 2083:iconst_1        
	// 1412 2084:iastore         
	// 1413 2085:dup             
	// 1414 2086:bipush          95
	// 1415 2088:iconst_1        
	// 1416 2089:iastore         
	// 1417 2090:dup             
	// 1418 2091:bipush          96
	// 1419 2093:iconst_1        
	// 1420 2094:iastore         
	// 1421 2095:dup             
	// 1422 2096:bipush          97
	// 1423 2098:iconst_1        
	// 1424 2099:iastore         
	// 1425 2100:dup             
	// 1426 2101:bipush          98
	// 1427 2103:iconst_1        
	// 1428 2104:iastore         
	// 1429 2105:dup             
	// 1430 2106:bipush          99
	// 1431 2108:iconst_1        
	// 1432 2109:iastore         
	// 1433 2110:dup             
	// 1434 2111:bipush          100
	// 1435 2113:iconst_1        
	// 1436 2114:iastore         
	// 1437 2115:dup             
	// 1438 2116:bipush          101
	// 1439 2118:iconst_1        
	// 1440 2119:iastore         
	// 1441 2120:dup             
	// 1442 2121:bipush          102
	// 1443 2123:iconst_1        
	// 1444 2124:iastore         
	// 1445 2125:dup             
	// 1446 2126:bipush          103
	// 1447 2128:iconst_1        
	// 1448 2129:iastore         
	// 1449 2130:dup             
	// 1450 2131:bipush          104
	// 1451 2133:iconst_1        
	// 1452 2134:iastore         
	// 1453 2135:dup             
	// 1454 2136:bipush          105
	// 1455 2138:iconst_1        
	// 1456 2139:iastore         
	// 1457 2140:dup             
	// 1458 2141:bipush          106
	// 1459 2143:iconst_1        
	// 1460 2144:iastore         
	// 1461 2145:dup             
	// 1462 2146:bipush          107
	// 1463 2148:iconst_1        
	// 1464 2149:iastore         
	// 1465 2150:dup             
	// 1466 2151:bipush          108
	// 1467 2153:iconst_1        
	// 1468 2154:iastore         
	// 1469 2155:dup             
	// 1470 2156:bipush          109
	// 1471 2158:iconst_1        
	// 1472 2159:iastore         
	// 1473 2160:dup             
	// 1474 2161:bipush          110
	// 1475 2163:iconst_1        
	// 1476 2164:iastore         
	// 1477 2165:dup             
	// 1478 2166:bipush          111
	// 1479 2168:iconst_1        
	// 1480 2169:iastore         
	// 1481 2170:dup             
	// 1482 2171:bipush          112
	// 1483 2173:iconst_1        
	// 1484 2174:iastore         
	// 1485 2175:dup             
	// 1486 2176:bipush          113
	// 1487 2178:iconst_1        
	// 1488 2179:iastore         
	// 1489 2180:dup             
	// 1490 2181:bipush          114
	// 1491 2183:iconst_1        
	// 1492 2184:iastore         
	// 1493 2185:dup             
	// 1494 2186:bipush          115
	// 1495 2188:iconst_1        
	// 1496 2189:iastore         
	// 1497 2190:dup             
	// 1498 2191:bipush          116
	// 1499 2193:iconst_1        
	// 1500 2194:iastore         
	// 1501 2195:dup             
	// 1502 2196:bipush          117
	// 1503 2198:iconst_1        
	// 1504 2199:iastore         
	// 1505 2200:dup             
	// 1506 2201:bipush          118
	// 1507 2203:iconst_1        
	// 1508 2204:iastore         
	// 1509 2205:dup             
	// 1510 2206:bipush          119
	// 1511 2208:iconst_1        
	// 1512 2209:iastore         
	// 1513 2210:dup             
	// 1514 2211:bipush          120
	// 1515 2213:iconst_1        
	// 1516 2214:iastore         
	// 1517 2215:dup             
	// 1518 2216:bipush          121
	// 1519 2218:iconst_1        
	// 1520 2219:iastore         
	// 1521 2220:dup             
	// 1522 2221:bipush          122
	// 1523 2223:iconst_1        
	// 1524 2224:iastore         
	// 1525 2225:dup             
	// 1526 2226:bipush          123
	// 1527 2228:iconst_1        
	// 1528 2229:iastore         
	// 1529 2230:dup             
	// 1530 2231:bipush          124
	// 1531 2233:iconst_1        
	// 1532 2234:iastore         
	// 1533 2235:dup             
	// 1534 2236:bipush          125
	// 1535 2238:iconst_1        
	// 1536 2239:iastore         
	// 1537 2240:dup             
	// 1538 2241:bipush          126
	// 1539 2243:iconst_1        
	// 1540 2244:iastore         
	// 1541 2245:dup             
	// 1542 2246:bipush          127
	// 1543 2248:iconst_2        
	// 1544 2249:iastore         
	// 1545 2250:dup             
	// 1546 2251:sipush          128
	// 1547 2254:iconst_0        
	// 1548 2255:iastore         
	// 1549 2256:dup             
	// 1550 2257:sipush          129
	// 1551 2260:iconst_0        
	// 1552 2261:iastore         
	// 1553 2262:dup             
	// 1554 2263:sipush          130
	// 1555 2266:iconst_2        
	// 1556 2267:iastore         
	// 1557 2268:dup             
	// 1558 2269:sipush          131
	// 1559 2272:iconst_0        
	// 1560 2273:iastore         
	// 1561 2274:dup             
	// 1562 2275:sipush          132
	// 1563 2278:iconst_2        
	// 1564 2279:iastore         
	// 1565 2280:dup             
	// 1566 2281:sipush          133
	// 1567 2284:iconst_2        
	// 1568 2285:iastore         
	// 1569 2286:dup             
	// 1570 2287:sipush          134
	// 1571 2290:iconst_2        
	// 1572 2291:iastore         
	// 1573 2292:dup             
	// 1574 2293:sipush          135
	// 1575 2296:iconst_2        
	// 1576 2297:iastore         
	// 1577 2298:dup             
	// 1578 2299:sipush          136
	// 1579 2302:iconst_2        
	// 1580 2303:iastore         
	// 1581 2304:dup             
	// 1582 2305:sipush          137
	// 1583 2308:iconst_2        
	// 1584 2309:iastore         
	// 1585 2310:dup             
	// 1586 2311:sipush          138
	// 1587 2314:iconst_2        
	// 1588 2315:iastore         
	// 1589 2316:dup             
	// 1590 2317:sipush          139
	// 1591 2320:iconst_2        
	// 1592 2321:iastore         
	// 1593 2322:dup             
	// 1594 2323:sipush          140
	// 1595 2326:iconst_2        
	// 1596 2327:iastore         
	// 1597 2328:dup             
	// 1598 2329:sipush          141
	// 1599 2332:iconst_0        
	// 1600 2333:iastore         
	// 1601 2334:dup             
	// 1602 2335:sipush          142
	// 1603 2338:iconst_0        
	// 1604 2339:iastore         
	// 1605 2340:dup             
	// 1606 2341:sipush          143
	// 1607 2344:iconst_0        
	// 1608 2345:iastore         
	// 1609 2346:dup             
	// 1610 2347:sipush          144
	// 1611 2350:iconst_0        
	// 1612 2351:iastore         
	// 1613 2352:dup             
	// 1614 2353:sipush          145
	// 1615 2356:iconst_3        
	// 1616 2357:iastore         
	// 1617 2358:dup             
	// 1618 2359:sipush          146
	// 1619 2362:iconst_3        
	// 1620 2363:iastore         
	// 1621 2364:dup             
	// 1622 2365:sipush          147
	// 1623 2368:iconst_2        
	// 1624 2369:iastore         
	// 1625 2370:dup             
	// 1626 2371:sipush          148
	// 1627 2374:iconst_2        
	// 1628 2375:iastore         
	// 1629 2376:dup             
	// 1630 2377:sipush          149
	// 1631 2380:iconst_2        
	// 1632 2381:iastore         
	// 1633 2382:dup             
	// 1634 2383:sipush          150
	// 1635 2386:iconst_2        
	// 1636 2387:iastore         
	// 1637 2388:dup             
	// 1638 2389:sipush          151
	// 1639 2392:iconst_2        
	// 1640 2393:iastore         
	// 1641 2394:dup             
	// 1642 2395:sipush          152
	// 1643 2398:iconst_2        
	// 1644 2399:iastore         
	// 1645 2400:dup             
	// 1646 2401:sipush          153
	// 1647 2404:iconst_2        
	// 1648 2405:iastore         
	// 1649 2406:dup             
	// 1650 2407:sipush          154
	// 1651 2410:iconst_2        
	// 1652 2411:iastore         
	// 1653 2412:dup             
	// 1654 2413:sipush          155
	// 1655 2416:iconst_2        
	// 1656 2417:iastore         
	// 1657 2418:dup             
	// 1658 2419:sipush          156
	// 1659 2422:iconst_2        
	// 1660 2423:iastore         
	// 1661 2424:dup             
	// 1662 2425:sipush          157
	// 1663 2428:iconst_0        
	// 1664 2429:iastore         
	// 1665 2430:dup             
	// 1666 2431:sipush          158
	// 1667 2434:iconst_0        
	// 1668 2435:iastore         
	// 1669 2436:dup             
	// 1670 2437:sipush          159
	// 1671 2440:iconst_2        
	// 1672 2441:iastore         
	// 1673 2442:dup             
	// 1674 2443:sipush          160
	// 1675 2446:iconst_1        
	// 1676 2447:iastore         
	// 1677 2448:dup             
	// 1678 2449:sipush          161
	// 1679 2452:iconst_1        
	// 1680 2453:iastore         
	// 1681 2454:dup             
	// 1682 2455:sipush          162
	// 1683 2458:iconst_1        
	// 1684 2459:iastore         
	// 1685 2460:dup             
	// 1686 2461:sipush          163
	// 1687 2464:iconst_1        
	// 1688 2465:iastore         
	// 1689 2466:dup             
	// 1690 2467:sipush          164
	// 1691 2470:iconst_1        
	// 1692 2471:iastore         
	// 1693 2472:dup             
	// 1694 2473:sipush          165
	// 1695 2476:iconst_1        
	// 1696 2477:iastore         
	// 1697 2478:dup             
	// 1698 2479:sipush          166
	// 1699 2482:iconst_1        
	// 1700 2483:iastore         
	// 1701 2484:dup             
	// 1702 2485:sipush          167
	// 1703 2488:iconst_1        
	// 1704 2489:iastore         
	// 1705 2490:dup             
	// 1706 2491:sipush          168
	// 1707 2494:iconst_1        
	// 1708 2495:iastore         
	// 1709 2496:dup             
	// 1710 2497:sipush          169
	// 1711 2500:iconst_1        
	// 1712 2501:iastore         
	// 1713 2502:dup             
	// 1714 2503:sipush          170
	// 1715 2506:iconst_1        
	// 1716 2507:iastore         
	// 1717 2508:dup             
	// 1718 2509:sipush          171
	// 1719 2512:iconst_1        
	// 1720 2513:iastore         
	// 1721 2514:dup             
	// 1722 2515:sipush          172
	// 1723 2518:iconst_1        
	// 1724 2519:iastore         
	// 1725 2520:dup             
	// 1726 2521:sipush          173
	// 1727 2524:iconst_1        
	// 1728 2525:iastore         
	// 1729 2526:dup             
	// 1730 2527:sipush          174
	// 1731 2530:iconst_1        
	// 1732 2531:iastore         
	// 1733 2532:dup             
	// 1734 2533:sipush          175
	// 1735 2536:iconst_1        
	// 1736 2537:iastore         
	// 1737 2538:dup             
	// 1738 2539:sipush          176
	// 1739 2542:iconst_1        
	// 1740 2543:iastore         
	// 1741 2544:dup             
	// 1742 2545:sipush          177
	// 1743 2548:iconst_1        
	// 1744 2549:iastore         
	// 1745 2550:dup             
	// 1746 2551:sipush          178
	// 1747 2554:iconst_1        
	// 1748 2555:iastore         
	// 1749 2556:dup             
	// 1750 2557:sipush          179
	// 1751 2560:iconst_1        
	// 1752 2561:iastore         
	// 1753 2562:dup             
	// 1754 2563:sipush          180
	// 1755 2566:iconst_1        
	// 1756 2567:iastore         
	// 1757 2568:dup             
	// 1758 2569:sipush          181
	// 1759 2572:iconst_1        
	// 1760 2573:iastore         
	// 1761 2574:dup             
	// 1762 2575:sipush          182
	// 1763 2578:iconst_1        
	// 1764 2579:iastore         
	// 1765 2580:dup             
	// 1766 2581:sipush          183
	// 1767 2584:iconst_1        
	// 1768 2585:iastore         
	// 1769 2586:dup             
	// 1770 2587:sipush          184
	// 1771 2590:iconst_1        
	// 1772 2591:iastore         
	// 1773 2592:dup             
	// 1774 2593:sipush          185
	// 1775 2596:iconst_1        
	// 1776 2597:iastore         
	// 1777 2598:dup             
	// 1778 2599:sipush          186
	// 1779 2602:iconst_1        
	// 1780 2603:iastore         
	// 1781 2604:dup             
	// 1782 2605:sipush          187
	// 1783 2608:iconst_1        
	// 1784 2609:iastore         
	// 1785 2610:dup             
	// 1786 2611:sipush          188
	// 1787 2614:iconst_1        
	// 1788 2615:iastore         
	// 1789 2616:dup             
	// 1790 2617:sipush          189
	// 1791 2620:iconst_1        
	// 1792 2621:iastore         
	// 1793 2622:dup             
	// 1794 2623:sipush          190
	// 1795 2626:iconst_1        
	// 1796 2627:iastore         
	// 1797 2628:dup             
	// 1798 2629:sipush          191
	// 1799 2632:iconst_1        
	// 1800 2633:iastore         
	// 1801 2634:dup             
	// 1802 2635:sipush          192
	// 1803 2638:iconst_1        
	// 1804 2639:iastore         
	// 1805 2640:dup             
	// 1806 2641:sipush          193
	// 1807 2644:iconst_1        
	// 1808 2645:iastore         
	// 1809 2646:dup             
	// 1810 2647:sipush          194
	// 1811 2650:iconst_1        
	// 1812 2651:iastore         
	// 1813 2652:dup             
	// 1814 2653:sipush          195
	// 1815 2656:iconst_1        
	// 1816 2657:iastore         
	// 1817 2658:dup             
	// 1818 2659:sipush          196
	// 1819 2662:iconst_1        
	// 1820 2663:iastore         
	// 1821 2664:dup             
	// 1822 2665:sipush          197
	// 1823 2668:iconst_1        
	// 1824 2669:iastore         
	// 1825 2670:dup             
	// 1826 2671:sipush          198
	// 1827 2674:iconst_1        
	// 1828 2675:iastore         
	// 1829 2676:dup             
	// 1830 2677:sipush          199
	// 1831 2680:iconst_1        
	// 1832 2681:iastore         
	// 1833 2682:dup             
	// 1834 2683:sipush          200
	// 1835 2686:iconst_1        
	// 1836 2687:iastore         
	// 1837 2688:dup             
	// 1838 2689:sipush          201
	// 1839 2692:iconst_1        
	// 1840 2693:iastore         
	// 1841 2694:dup             
	// 1842 2695:sipush          202
	// 1843 2698:iconst_1        
	// 1844 2699:iastore         
	// 1845 2700:dup             
	// 1846 2701:sipush          203
	// 1847 2704:iconst_1        
	// 1848 2705:iastore         
	// 1849 2706:dup             
	// 1850 2707:sipush          204
	// 1851 2710:iconst_1        
	// 1852 2711:iastore         
	// 1853 2712:dup             
	// 1854 2713:sipush          205
	// 1855 2716:iconst_1        
	// 1856 2717:iastore         
	// 1857 2718:dup             
	// 1858 2719:sipush          206
	// 1859 2722:iconst_1        
	// 1860 2723:iastore         
	// 1861 2724:dup             
	// 1862 2725:sipush          207
	// 1863 2728:iconst_1        
	// 1864 2729:iastore         
	// 1865 2730:dup             
	// 1866 2731:sipush          208
	// 1867 2734:iconst_1        
	// 1868 2735:iastore         
	// 1869 2736:dup             
	// 1870 2737:sipush          209
	// 1871 2740:iconst_1        
	// 1872 2741:iastore         
	// 1873 2742:dup             
	// 1874 2743:sipush          210
	// 1875 2746:iconst_1        
	// 1876 2747:iastore         
	// 1877 2748:dup             
	// 1878 2749:sipush          211
	// 1879 2752:iconst_1        
	// 1880 2753:iastore         
	// 1881 2754:dup             
	// 1882 2755:sipush          212
	// 1883 2758:iconst_1        
	// 1884 2759:iastore         
	// 1885 2760:dup             
	// 1886 2761:sipush          213
	// 1887 2764:iconst_1        
	// 1888 2765:iastore         
	// 1889 2766:dup             
	// 1890 2767:sipush          214
	// 1891 2770:iconst_1        
	// 1892 2771:iastore         
	// 1893 2772:dup             
	// 1894 2773:sipush          215
	// 1895 2776:iconst_1        
	// 1896 2777:iastore         
	// 1897 2778:dup             
	// 1898 2779:sipush          216
	// 1899 2782:iconst_1        
	// 1900 2783:iastore         
	// 1901 2784:dup             
	// 1902 2785:sipush          217
	// 1903 2788:iconst_1        
	// 1904 2789:iastore         
	// 1905 2790:dup             
	// 1906 2791:sipush          218
	// 1907 2794:iconst_1        
	// 1908 2795:iastore         
	// 1909 2796:dup             
	// 1910 2797:sipush          219
	// 1911 2800:iconst_1        
	// 1912 2801:iastore         
	// 1913 2802:dup             
	// 1914 2803:sipush          220
	// 1915 2806:iconst_1        
	// 1916 2807:iastore         
	// 1917 2808:dup             
	// 1918 2809:sipush          221
	// 1919 2812:iconst_1        
	// 1920 2813:iastore         
	// 1921 2814:dup             
	// 1922 2815:sipush          222
	// 1923 2818:iconst_1        
	// 1924 2819:iastore         
	// 1925 2820:dup             
	// 1926 2821:sipush          223
	// 1927 2824:iconst_1        
	// 1928 2825:iastore         
	// 1929 2826:dup             
	// 1930 2827:sipush          224
	// 1931 2830:iconst_1        
	// 1932 2831:iastore         
	// 1933 2832:dup             
	// 1934 2833:sipush          225
	// 1935 2836:iconst_1        
	// 1936 2837:iastore         
	// 1937 2838:dup             
	// 1938 2839:sipush          226
	// 1939 2842:iconst_1        
	// 1940 2843:iastore         
	// 1941 2844:dup             
	// 1942 2845:sipush          227
	// 1943 2848:iconst_1        
	// 1944 2849:iastore         
	// 1945 2850:dup             
	// 1946 2851:sipush          228
	// 1947 2854:iconst_1        
	// 1948 2855:iastore         
	// 1949 2856:dup             
	// 1950 2857:sipush          229
	// 1951 2860:iconst_1        
	// 1952 2861:iastore         
	// 1953 2862:dup             
	// 1954 2863:sipush          230
	// 1955 2866:iconst_1        
	// 1956 2867:iastore         
	// 1957 2868:dup             
	// 1958 2869:sipush          231
	// 1959 2872:iconst_1        
	// 1960 2873:iastore         
	// 1961 2874:dup             
	// 1962 2875:sipush          232
	// 1963 2878:iconst_1        
	// 1964 2879:iastore         
	// 1965 2880:dup             
	// 1966 2881:sipush          233
	// 1967 2884:iconst_1        
	// 1968 2885:iastore         
	// 1969 2886:dup             
	// 1970 2887:sipush          234
	// 1971 2890:iconst_1        
	// 1972 2891:iastore         
	// 1973 2892:dup             
	// 1974 2893:sipush          235
	// 1975 2896:iconst_1        
	// 1976 2897:iastore         
	// 1977 2898:dup             
	// 1978 2899:sipush          236
	// 1979 2902:iconst_1        
	// 1980 2903:iastore         
	// 1981 2904:dup             
	// 1982 2905:sipush          237
	// 1983 2908:iconst_1        
	// 1984 2909:iastore         
	// 1985 2910:dup             
	// 1986 2911:sipush          238
	// 1987 2914:iconst_1        
	// 1988 2915:iastore         
	// 1989 2916:dup             
	// 1990 2917:sipush          239
	// 1991 2920:iconst_1        
	// 1992 2921:iastore         
	// 1993 2922:dup             
	// 1994 2923:sipush          240
	// 1995 2926:iconst_1        
	// 1996 2927:iastore         
	// 1997 2928:dup             
	// 1998 2929:sipush          241
	// 1999 2932:iconst_1        
	// 2000 2933:iastore         
	// 2001 2934:dup             
	// 2002 2935:sipush          242
	// 2003 2938:iconst_1        
	// 2004 2939:iastore         
	// 2005 2940:dup             
	// 2006 2941:sipush          243
	// 2007 2944:iconst_1        
	// 2008 2945:iastore         
	// 2009 2946:dup             
	// 2010 2947:sipush          244
	// 2011 2950:iconst_1        
	// 2012 2951:iastore         
	// 2013 2952:dup             
	// 2014 2953:sipush          245
	// 2015 2956:iconst_1        
	// 2016 2957:iastore         
	// 2017 2958:dup             
	// 2018 2959:sipush          246
	// 2019 2962:iconst_1        
	// 2020 2963:iastore         
	// 2021 2964:dup             
	// 2022 2965:sipush          247
	// 2023 2968:iconst_1        
	// 2024 2969:iastore         
	// 2025 2970:dup             
	// 2026 2971:sipush          248
	// 2027 2974:iconst_1        
	// 2028 2975:iastore         
	// 2029 2976:dup             
	// 2030 2977:sipush          249
	// 2031 2980:iconst_1        
	// 2032 2981:iastore         
	// 2033 2982:dup             
	// 2034 2983:sipush          250
	// 2035 2986:iconst_1        
	// 2036 2987:iastore         
	// 2037 2988:dup             
	// 2038 2989:sipush          251
	// 2039 2992:iconst_1        
	// 2040 2993:iastore         
	// 2041 2994:dup             
	// 2042 2995:sipush          252
	// 2043 2998:iconst_1        
	// 2044 2999:iastore         
	// 2045 3000:dup             
	// 2046 3001:sipush          253
	// 2047 3004:iconst_1        
	// 2048 3005:iastore         
	// 2049 3006:dup             
	// 2050 3007:sipush          254
	// 2051 3010:iconst_1        
	// 2052 3011:iastore         
	// 2053 3012:dup             
	// 2054 3013:sipush          255
	// 2055 3016:iconst_1        
	// 2056 3017:iastore         
	// 2057 3018:putfield        #70  <Field int[] WinClass>
	// 2058 3021:aload_0         
	// 2059 3022:sipush          256
	// 2060 3025:anewarray       String[]
	// 2061 3028:dup             
	// 2062 3029:iconst_0        
	// 2063 3030:ldc1            #74  <String "W00">
	// 2064 3032:aastore         
	// 2065 3033:dup             
	// 2066 3034:iconst_1        
	// 2067 3035:ldc1            #76  <String "W01">
	// 2068 3037:aastore         
	// 2069 3038:dup             
	// 2070 3039:iconst_2        
	// 2071 3040:ldc1            #78  <String "W02">
	// 2072 3042:aastore         
	// 2073 3043:dup             
	// 2074 3044:iconst_3        
	// 2075 3045:ldc1            #80  <String "W03">
	// 2076 3047:aastore         
	// 2077 3048:dup             
	// 2078 3049:iconst_4        
	// 2079 3050:ldc1            #82  <String "macron">
	// 2080 3052:aastore         
	// 2081 3053:dup             
	// 2082 3054:iconst_5        
	// 2083 3055:ldc1            #84  <String "breve">
	// 2084 3057:aastore         
	// 2085 3058:dup             
	// 2086 3059:bipush          6
	// 2087 3061:ldc1            #86  <String "dotaccent">
	// 2088 3063:aastore         
	// 2089 3064:dup             
	// 2090 3065:bipush          7
	// 2091 3067:ldc1            #88  <String "W07">
	// 2092 3069:aastore         
	// 2093 3070:dup             
	// 2094 3071:bipush          8
	// 2095 3073:ldc1            #90  <String "ring">
	// 2096 3075:aastore         
	// 2097 3076:dup             
	// 2098 3077:bipush          9
	// 2099 3079:ldc1            #92  <String "W09">
	// 2100 3081:aastore         
	// 2101 3082:dup             
	// 2102 3083:bipush          10
	// 2103 3085:ldc1            #94  <String "W0a">
	// 2104 3087:aastore         
	// 2105 3088:dup             
	// 2106 3089:bipush          11
	// 2107 3091:ldc1            #96  <String "W0b">
	// 2108 3093:aastore         
	// 2109 3094:dup             
	// 2110 3095:bipush          12
	// 2111 3097:ldc1            #98  <String "W0c">
	// 2112 3099:aastore         
	// 2113 3100:dup             
	// 2114 3101:bipush          13
	// 2115 3103:ldc1            #100 <String "W0d">
	// 2116 3105:aastore         
	// 2117 3106:dup             
	// 2118 3107:bipush          14
	// 2119 3109:ldc1            #102 <String "W0e">
	// 2120 3111:aastore         
	// 2121 3112:dup             
	// 2122 3113:bipush          15
	// 2123 3115:ldc1            #104 <String "W0f">
	// 2124 3117:aastore         
	// 2125 3118:dup             
	// 2126 3119:bipush          16
	// 2127 3121:ldc1            #106 <String "hungarumlaut">
	// 2128 3123:aastore         
	// 2129 3124:dup             
	// 2130 3125:bipush          17
	// 2131 3127:ldc1            #108 <String "ogonek">
	// 2132 3129:aastore         
	// 2133 3130:dup             
	// 2134 3131:bipush          18
	// 2135 3133:ldc1            #110 <String "caron">
	// 2136 3135:aastore         
	// 2137 3136:dup             
	// 2138 3137:bipush          19
	// 2139 3139:ldc1            #112 <String "W13">
	// 2140 3141:aastore         
	// 2141 3142:dup             
	// 2142 3143:bipush          20
	// 2143 3145:ldc1            #114 <String "W14">
	// 2144 3147:aastore         
	// 2145 3148:dup             
	// 2146 3149:bipush          21
	// 2147 3151:ldc1            #116 <String "W15">
	// 2148 3153:aastore         
	// 2149 3154:dup             
	// 2150 3155:bipush          22
	// 2151 3157:ldc1            #118 <String "W16">
	// 2152 3159:aastore         
	// 2153 3160:dup             
	// 2154 3161:bipush          23
	// 2155 3163:ldc1            #120 <String "W17">
	// 2156 3165:aastore         
	// 2157 3166:dup             
	// 2158 3167:bipush          24
	// 2159 3169:ldc1            #122 <String "W18">
	// 2160 3171:aastore         
	// 2161 3172:dup             
	// 2162 3173:bipush          25
	// 2163 3175:ldc1            #124 <String "W19">
	// 2164 3177:aastore         
	// 2165 3178:dup             
	// 2166 3179:bipush          26
	// 2167 3181:ldc1            #126 <String "W1a">
	// 2168 3183:aastore         
	// 2169 3184:dup             
	// 2170 3185:bipush          27
	// 2171 3187:ldc1            #128 <String "W1b">
	// 2172 3189:aastore         
	// 2173 3190:dup             
	// 2174 3191:bipush          28
	// 2175 3193:ldc1            #130 <String "W1c">
	// 2176 3195:aastore         
	// 2177 3196:dup             
	// 2178 3197:bipush          29
	// 2179 3199:ldc1            #132 <String "W1d">
	// 2180 3201:aastore         
	// 2181 3202:dup             
	// 2182 3203:bipush          30
	// 2183 3205:ldc1            #134 <String "W1e">
	// 2184 3207:aastore         
	// 2185 3208:dup             
	// 2186 3209:bipush          31
	// 2187 3211:ldc1            #136 <String "W1f">
	// 2188 3213:aastore         
	// 2189 3214:dup             
	// 2190 3215:bipush          32
	// 2191 3217:ldc1            #138 <String "space">
	// 2192 3219:aastore         
	// 2193 3220:dup             
	// 2194 3221:bipush          33
	// 2195 3223:ldc1            #140 <String "exclam">
	// 2196 3225:aastore         
	// 2197 3226:dup             
	// 2198 3227:bipush          34
	// 2199 3229:ldc1            #142 <String "quotedbl">
	// 2200 3231:aastore         
	// 2201 3232:dup             
	// 2202 3233:bipush          35
	// 2203 3235:ldc1            #144 <String "numbersign">
	// 2204 3237:aastore         
	// 2205 3238:dup             
	// 2206 3239:bipush          36
	// 2207 3241:ldc1            #146 <String "dollar">
	// 2208 3243:aastore         
	// 2209 3244:dup             
	// 2210 3245:bipush          37
	// 2211 3247:ldc1            #148 <String "percent">
	// 2212 3249:aastore         
	// 2213 3250:dup             
	// 2214 3251:bipush          38
	// 2215 3253:ldc1            #150 <String "ampersand">
	// 2216 3255:aastore         
	// 2217 3256:dup             
	// 2218 3257:bipush          39
	// 2219 3259:ldc1            #152 <String "quotesingle">
	// 2220 3261:aastore         
	// 2221 3262:dup             
	// 2222 3263:bipush          40
	// 2223 3265:ldc1            #154 <String "parenleft">
	// 2224 3267:aastore         
	// 2225 3268:dup             
	// 2226 3269:bipush          41
	// 2227 3271:ldc1            #156 <String "parenright">
	// 2228 3273:aastore         
	// 2229 3274:dup             
	// 2230 3275:bipush          42
	// 2231 3277:ldc1            #158 <String "asterisk">
	// 2232 3279:aastore         
	// 2233 3280:dup             
	// 2234 3281:bipush          43
	// 2235 3283:ldc1            #160 <String "plus">
	// 2236 3285:aastore         
	// 2237 3286:dup             
	// 2238 3287:bipush          44
	// 2239 3289:ldc1            #162 <String "comma">
	// 2240 3291:aastore         
	// 2241 3292:dup             
	// 2242 3293:bipush          45
	// 2243 3295:ldc1            #164 <String "hyphen">
	// 2244 3297:aastore         
	// 2245 3298:dup             
	// 2246 3299:bipush          46
	// 2247 3301:ldc1            #166 <String "period">
	// 2248 3303:aastore         
	// 2249 3304:dup             
	// 2250 3305:bipush          47
	// 2251 3307:ldc1            #168 <String "slash">
	// 2252 3309:aastore         
	// 2253 3310:dup             
	// 2254 3311:bipush          48
	// 2255 3313:ldc1            #170 <String "zero">
	// 2256 3315:aastore         
	// 2257 3316:dup             
	// 2258 3317:bipush          49
	// 2259 3319:ldc1            #172 <String "one">
	// 2260 3321:aastore         
	// 2261 3322:dup             
	// 2262 3323:bipush          50
	// 2263 3325:ldc1            #174 <String "two">
	// 2264 3327:aastore         
	// 2265 3328:dup             
	// 2266 3329:bipush          51
	// 2267 3331:ldc1            #176 <String "three">
	// 2268 3333:aastore         
	// 2269 3334:dup             
	// 2270 3335:bipush          52
	// 2271 3337:ldc1            #178 <String "four">
	// 2272 3339:aastore         
	// 2273 3340:dup             
	// 2274 3341:bipush          53
	// 2275 3343:ldc1            #180 <String "five">
	// 2276 3345:aastore         
	// 2277 3346:dup             
	// 2278 3347:bipush          54
	// 2279 3349:ldc1            #182 <String "six">
	// 2280 3351:aastore         
	// 2281 3352:dup             
	// 2282 3353:bipush          55
	// 2283 3355:ldc1            #184 <String "seven">
	// 2284 3357:aastore         
	// 2285 3358:dup             
	// 2286 3359:bipush          56
	// 2287 3361:ldc1            #186 <String "eight">
	// 2288 3363:aastore         
	// 2289 3364:dup             
	// 2290 3365:bipush          57
	// 2291 3367:ldc1            #188 <String "nine">
	// 2292 3369:aastore         
	// 2293 3370:dup             
	// 2294 3371:bipush          58
	// 2295 3373:ldc1            #190 <String "colon">
	// 2296 3375:aastore         
	// 2297 3376:dup             
	// 2298 3377:bipush          59
	// 2299 3379:ldc1            #192 <String "semicolon">
	// 2300 3381:aastore         
	// 2301 3382:dup             
	// 2302 3383:bipush          60
	// 2303 3385:ldc1            #194 <String "less">
	// 2304 3387:aastore         
	// 2305 3388:dup             
	// 2306 3389:bipush          61
	// 2307 3391:ldc1            #196 <String "equal">
	// 2308 3393:aastore         
	// 2309 3394:dup             
	// 2310 3395:bipush          62
	// 2311 3397:ldc1            #198 <String "greater">
	// 2312 3399:aastore         
	// 2313 3400:dup             
	// 2314 3401:bipush          63
	// 2315 3403:ldc1            #200 <String "question">
	// 2316 3405:aastore         
	// 2317 3406:dup             
	// 2318 3407:bipush          64
	// 2319 3409:ldc1            #202 <String "at">
	// 2320 3411:aastore         
	// 2321 3412:dup             
	// 2322 3413:bipush          65
	// 2323 3415:ldc1            #204 <String "A">
	// 2324 3417:aastore         
	// 2325 3418:dup             
	// 2326 3419:bipush          66
	// 2327 3421:ldc1            #205 <String "B">
	// 2328 3423:aastore         
	// 2329 3424:dup             
	// 2330 3425:bipush          67
	// 2331 3427:ldc1            #207 <String "C">
	// 2332 3429:aastore         
	// 2333 3430:dup             
	// 2334 3431:bipush          68
	// 2335 3433:ldc1            #209 <String "D">
	// 2336 3435:aastore         
	// 2337 3436:dup             
	// 2338 3437:bipush          69
	// 2339 3439:ldc1            #211 <String "E">
	// 2340 3441:aastore         
	// 2341 3442:dup             
	// 2342 3443:bipush          70
	// 2343 3445:ldc1            #213 <String "F">
	// 2344 3447:aastore         
	// 2345 3448:dup             
	// 2346 3449:bipush          71
	// 2347 3451:ldc1            #215 <String "G">
	// 2348 3453:aastore         
	// 2349 3454:dup             
	// 2350 3455:bipush          72
	// 2351 3457:ldc1            #217 <String "H">
	// 2352 3459:aastore         
	// 2353 3460:dup             
	// 2354 3461:bipush          73
	// 2355 3463:ldc1            #218 <String "I">
	// 2356 3465:aastore         
	// 2357 3466:dup             
	// 2358 3467:bipush          74
	// 2359 3469:ldc1            #220 <String "J">
	// 2360 3471:aastore         
	// 2361 3472:dup             
	// 2362 3473:bipush          75
	// 2363 3475:ldc1            #222 <String "K">
	// 2364 3477:aastore         
	// 2365 3478:dup             
	// 2366 3479:bipush          76
	// 2367 3481:ldc1            #224 <String "L">
	// 2368 3483:aastore         
	// 2369 3484:dup             
	// 2370 3485:bipush          77
	// 2371 3487:ldc1            #226 <String "M">
	// 2372 3489:aastore         
	// 2373 3490:dup             
	// 2374 3491:bipush          78
	// 2375 3493:ldc1            #228 <String "N">
	// 2376 3495:aastore         
	// 2377 3496:dup             
	// 2378 3497:bipush          79
	// 2379 3499:ldc1            #230 <String "O">
	// 2380 3501:aastore         
	// 2381 3502:dup             
	// 2382 3503:bipush          80
	// 2383 3505:ldc1            #232 <String "P">
	// 2384 3507:aastore         
	// 2385 3508:dup             
	// 2386 3509:bipush          81
	// 2387 3511:ldc1            #234 <String "Q">
	// 2388 3513:aastore         
	// 2389 3514:dup             
	// 2390 3515:bipush          82
	// 2391 3517:ldc1            #236 <String "R">
	// 2392 3519:aastore         
	// 2393 3520:dup             
	// 2394 3521:bipush          83
	// 2395 3523:ldc1            #237 <String "S">
	// 2396 3525:aastore         
	// 2397 3526:dup             
	// 2398 3527:bipush          84
	// 2399 3529:ldc1            #239 <String "T">
	// 2400 3531:aastore         
	// 2401 3532:dup             
	// 2402 3533:bipush          85
	// 2403 3535:ldc1            #241 <String "U">
	// 2404 3537:aastore         
	// 2405 3538:dup             
	// 2406 3539:bipush          86
	// 2407 3541:ldc1            #243 <String "V">
	// 2408 3543:aastore         
	// 2409 3544:dup             
	// 2410 3545:bipush          87
	// 2411 3547:ldc1            #245 <String "W">
	// 2412 3549:aastore         
	// 2413 3550:dup             
	// 2414 3551:bipush          88
	// 2415 3553:ldc1            #247 <String "X">
	// 2416 3555:aastore         
	// 2417 3556:dup             
	// 2418 3557:bipush          89
	// 2419 3559:ldc1            #249 <String "Y">
	// 2420 3561:aastore         
	// 2421 3562:dup             
	// 2422 3563:bipush          90
	// 2423 3565:ldc1            #250 <String "Z">
	// 2424 3567:aastore         
	// 2425 3568:dup             
	// 2426 3569:bipush          91
	// 2427 3571:ldc1            #252 <String "bracketleft">
	// 2428 3573:aastore         
	// 2429 3574:dup             
	// 2430 3575:bipush          92
	// 2431 3577:ldc1            #254 <String "backslash">
	// 2432 3579:aastore         
	// 2433 3580:dup             
	// 2434 3581:bipush          93
	// 2435 3583:ldc2            #256 <String "bracketright">
	// 2436 3586:aastore         
	// 2437 3587:dup             
	// 2438 3588:bipush          94
	// 2439 3590:ldc2            #258 <String "asciicircum">
	// 2440 3593:aastore         
	// 2441 3594:dup             
	// 2442 3595:bipush          95
	// 2443 3597:ldc2            #260 <String "underscore">
	// 2444 3600:aastore         
	// 2445 3601:dup             
	// 2446 3602:bipush          96
	// 2447 3604:ldc2            #262 <String "grave">
	// 2448 3607:aastore         
	// 2449 3608:dup             
	// 2450 3609:bipush          97
	// 2451 3611:ldc2            #264 <String "a">
	// 2452 3614:aastore         
	// 2453 3615:dup             
	// 2454 3616:bipush          98
	// 2455 3618:ldc2            #266 <String "b">
	// 2456 3621:aastore         
	// 2457 3622:dup             
	// 2458 3623:bipush          99
	// 2459 3625:ldc2            #268 <String "c">
	// 2460 3628:aastore         
	// 2461 3629:dup             
	// 2462 3630:bipush          100
	// 2463 3632:ldc2            #270 <String "d">
	// 2464 3635:aastore         
	// 2465 3636:dup             
	// 2466 3637:bipush          101
	// 2467 3639:ldc2            #272 <String "e">
	// 2468 3642:aastore         
	// 2469 3643:dup             
	// 2470 3644:bipush          102
	// 2471 3646:ldc2            #274 <String "f">
	// 2472 3649:aastore         
	// 2473 3650:dup             
	// 2474 3651:bipush          103
	// 2475 3653:ldc2            #276 <String "g">
	// 2476 3656:aastore         
	// 2477 3657:dup             
	// 2478 3658:bipush          104
	// 2479 3660:ldc2            #278 <String "h">
	// 2480 3663:aastore         
	// 2481 3664:dup             
	// 2482 3665:bipush          105
	// 2483 3667:ldc2            #280 <String "i">
	// 2484 3670:aastore         
	// 2485 3671:dup             
	// 2486 3672:bipush          106
	// 2487 3674:ldc2            #282 <String "j">
	// 2488 3677:aastore         
	// 2489 3678:dup             
	// 2490 3679:bipush          107
	// 2491 3681:ldc2            #284 <String "k">
	// 2492 3684:aastore         
	// 2493 3685:dup             
	// 2494 3686:bipush          108
	// 2495 3688:ldc2            #286 <String "l">
	// 2496 3691:aastore         
	// 2497 3692:dup             
	// 2498 3693:bipush          109
	// 2499 3695:ldc2            #288 <String "m">
	// 2500 3698:aastore         
	// 2501 3699:dup             
	// 2502 3700:bipush          110
	// 2503 3702:ldc2            #290 <String "n">
	// 2504 3705:aastore         
	// 2505 3706:dup             
	// 2506 3707:bipush          111
	// 2507 3709:ldc2            #292 <String "o">
	// 2508 3712:aastore         
	// 2509 3713:dup             
	// 2510 3714:bipush          112
	// 2511 3716:ldc2            #294 <String "p">
	// 2512 3719:aastore         
	// 2513 3720:dup             
	// 2514 3721:bipush          113
	// 2515 3723:ldc2            #296 <String "q">
	// 2516 3726:aastore         
	// 2517 3727:dup             
	// 2518 3728:bipush          114
	// 2519 3730:ldc2            #298 <String "r">
	// 2520 3733:aastore         
	// 2521 3734:dup             
	// 2522 3735:bipush          115
	// 2523 3737:ldc2            #300 <String "s">
	// 2524 3740:aastore         
	// 2525 3741:dup             
	// 2526 3742:bipush          116
	// 2527 3744:ldc2            #302 <String "t">
	// 2528 3747:aastore         
	// 2529 3748:dup             
	// 2530 3749:bipush          117
	// 2531 3751:ldc2            #304 <String "u">
	// 2532 3754:aastore         
	// 2533 3755:dup             
	// 2534 3756:bipush          118
	// 2535 3758:ldc2            #306 <String "v">
	// 2536 3761:aastore         
	// 2537 3762:dup             
	// 2538 3763:bipush          119
	// 2539 3765:ldc2            #308 <String "w">
	// 2540 3768:aastore         
	// 2541 3769:dup             
	// 2542 3770:bipush          120
	// 2543 3772:ldc2            #310 <String "x">
	// 2544 3775:aastore         
	// 2545 3776:dup             
	// 2546 3777:bipush          121
	// 2547 3779:ldc2            #312 <String "y">
	// 2548 3782:aastore         
	// 2549 3783:dup             
	// 2550 3784:bipush          122
	// 2551 3786:ldc2            #314 <String "z">
	// 2552 3789:aastore         
	// 2553 3790:dup             
	// 2554 3791:bipush          123
	// 2555 3793:ldc2            #316 <String "braceleft">
	// 2556 3796:aastore         
	// 2557 3797:dup             
	// 2558 3798:bipush          124
	// 2559 3800:ldc2            #318 <String "bar">
	// 2560 3803:aastore         
	// 2561 3804:dup             
	// 2562 3805:bipush          125
	// 2563 3807:ldc2            #320 <String "braceright">
	// 2564 3810:aastore         
	// 2565 3811:dup             
	// 2566 3812:bipush          126
	// 2567 3814:ldc2            #322 <String "asciitilde">
	// 2568 3817:aastore         
	// 2569 3818:dup             
	// 2570 3819:bipush          127
	// 2571 3821:ldc2            #324 <String "W7f">
	// 2572 3824:aastore         
	// 2573 3825:dup             
	// 2574 3826:sipush          128
	// 2575 3829:ldc2            #326 <String "euro">
	// 2576 3832:aastore         
	// 2577 3833:dup             
	// 2578 3834:sipush          129
	// 2579 3837:ldc2            #328 <String "W81">
	// 2580 3840:aastore         
	// 2581 3841:dup             
	// 2582 3842:sipush          130
	// 2583 3845:ldc2            #330 <String "quotesinglbase">
	// 2584 3848:aastore         
	// 2585 3849:dup             
	// 2586 3850:sipush          131
	// 2587 3853:ldc2            #332 <String "florin">
	// 2588 3856:aastore         
	// 2589 3857:dup             
	// 2590 3858:sipush          132
	// 2591 3861:ldc2            #334 <String "quotedblbase">
	// 2592 3864:aastore         
	// 2593 3865:dup             
	// 2594 3866:sipush          133
	// 2595 3869:ldc2            #336 <String "ellipsis">
	// 2596 3872:aastore         
	// 2597 3873:dup             
	// 2598 3874:sipush          134
	// 2599 3877:ldc2            #338 <String "dagger">
	// 2600 3880:aastore         
	// 2601 3881:dup             
	// 2602 3882:sipush          135
	// 2603 3885:ldc2            #340 <String "daggerdbl">
	// 2604 3888:aastore         
	// 2605 3889:dup             
	// 2606 3890:sipush          136
	// 2607 3893:ldc2            #342 <String "circumflex">
	// 2608 3896:aastore         
	// 2609 3897:dup             
	// 2610 3898:sipush          137
	// 2611 3901:ldc2            #344 <String "perthousand">
	// 2612 3904:aastore         
	// 2613 3905:dup             
	// 2614 3906:sipush          138
	// 2615 3909:ldc2            #346 <String "Scaron">
	// 2616 3912:aastore         
	// 2617 3913:dup             
	// 2618 3914:sipush          139
	// 2619 3917:ldc2            #348 <String "guilsinglleft">
	// 2620 3920:aastore         
	// 2621 3921:dup             
	// 2622 3922:sipush          140
	// 2623 3925:ldc2            #350 <String "OE">
	// 2624 3928:aastore         
	// 2625 3929:dup             
	// 2626 3930:sipush          141
	// 2627 3933:ldc2            #352 <String "W8d">
	// 2628 3936:aastore         
	// 2629 3937:dup             
	// 2630 3938:sipush          142
	// 2631 3941:ldc2            #354 <String "Zcaron">
	// 2632 3944:aastore         
	// 2633 3945:dup             
	// 2634 3946:sipush          143
	// 2635 3949:ldc2            #356 <String "W8f">
	// 2636 3952:aastore         
	// 2637 3953:dup             
	// 2638 3954:sipush          144
	// 2639 3957:ldc2            #358 <String "W90">
	// 2640 3960:aastore         
	// 2641 3961:dup             
	// 2642 3962:sipush          145
	// 2643 3965:ldc2            #360 <String "quoteleft">
	// 2644 3968:aastore         
	// 2645 3969:dup             
	// 2646 3970:sipush          146
	// 2647 3973:ldc2            #362 <String "quoteright">
	// 2648 3976:aastore         
	// 2649 3977:dup             
	// 2650 3978:sipush          147
	// 2651 3981:ldc2            #364 <String "quotedblleft">
	// 2652 3984:aastore         
	// 2653 3985:dup             
	// 2654 3986:sipush          148
	// 2655 3989:ldc2            #366 <String "quotedblright">
	// 2656 3992:aastore         
	// 2657 3993:dup             
	// 2658 3994:sipush          149
	// 2659 3997:ldc2            #368 <String "bullet">
	// 2660 4000:aastore         
	// 2661 4001:dup             
	// 2662 4002:sipush          150
	// 2663 4005:ldc2            #370 <String "endash">
	// 2664 4008:aastore         
	// 2665 4009:dup             
	// 2666 4010:sipush          151
	// 2667 4013:ldc2            #372 <String "emdash">
	// 2668 4016:aastore         
	// 2669 4017:dup             
	// 2670 4018:sipush          152
	// 2671 4021:ldc2            #374 <String "tilde">
	// 2672 4024:aastore         
	// 2673 4025:dup             
	// 2674 4026:sipush          153
	// 2675 4029:ldc2            #376 <String "trademark">
	// 2676 4032:aastore         
	// 2677 4033:dup             
	// 2678 4034:sipush          154
	// 2679 4037:ldc2            #378 <String "scaron">
	// 2680 4040:aastore         
	// 2681 4041:dup             
	// 2682 4042:sipush          155
	// 2683 4045:ldc2            #380 <String "guilsinglright">
	// 2684 4048:aastore         
	// 2685 4049:dup             
	// 2686 4050:sipush          156
	// 2687 4053:ldc2            #382 <String "oe">
	// 2688 4056:aastore         
	// 2689 4057:dup             
	// 2690 4058:sipush          157
	// 2691 4061:ldc2            #384 <String "W9d">
	// 2692 4064:aastore         
	// 2693 4065:dup             
	// 2694 4066:sipush          158
	// 2695 4069:ldc2            #386 <String "zcaron">
	// 2696 4072:aastore         
	// 2697 4073:dup             
	// 2698 4074:sipush          159
	// 2699 4077:ldc2            #388 <String "Ydieresis">
	// 2700 4080:aastore         
	// 2701 4081:dup             
	// 2702 4082:sipush          160
	// 2703 4085:ldc2            #390 <String "reqspace">
	// 2704 4088:aastore         
	// 2705 4089:dup             
	// 2706 4090:sipush          161
	// 2707 4093:ldc2            #392 <String "exclamdown">
	// 2708 4096:aastore         
	// 2709 4097:dup             
	// 2710 4098:sipush          162
	// 2711 4101:ldc2            #394 <String "cent">
	// 2712 4104:aastore         
	// 2713 4105:dup             
	// 2714 4106:sipush          163
	// 2715 4109:ldc2            #396 <String "sterling">
	// 2716 4112:aastore         
	// 2717 4113:dup             
	// 2718 4114:sipush          164
	// 2719 4117:ldc2            #398 <String "currency">
	// 2720 4120:aastore         
	// 2721 4121:dup             
	// 2722 4122:sipush          165
	// 2723 4125:ldc2            #400 <String "yen">
	// 2724 4128:aastore         
	// 2725 4129:dup             
	// 2726 4130:sipush          166
	// 2727 4133:ldc2            #402 <String "brokenbar">
	// 2728 4136:aastore         
	// 2729 4137:dup             
	// 2730 4138:sipush          167
	// 2731 4141:ldc2            #404 <String "section">
	// 2732 4144:aastore         
	// 2733 4145:dup             
	// 2734 4146:sipush          168
	// 2735 4149:ldc2            #406 <String "dieresis">
	// 2736 4152:aastore         
	// 2737 4153:dup             
	// 2738 4154:sipush          169
	// 2739 4157:ldc2            #407 <String "copyright">
	// 2740 4160:aastore         
	// 2741 4161:dup             
	// 2742 4162:sipush          170
	// 2743 4165:ldc2            #409 <String "ordfeminine">
	// 2744 4168:aastore         
	// 2745 4169:dup             
	// 2746 4170:sipush          171
	// 2747 4173:ldc2            #411 <String "guillemotleft">
	// 2748 4176:aastore         
	// 2749 4177:dup             
	// 2750 4178:sipush          172
	// 2751 4181:ldc2            #413 <String "logicalnot">
	// 2752 4184:aastore         
	// 2753 4185:dup             
	// 2754 4186:sipush          173
	// 2755 4189:ldc2            #415 <String "syllable">
	// 2756 4192:aastore         
	// 2757 4193:dup             
	// 2758 4194:sipush          174
	// 2759 4197:ldc2            #417 <String "registered">
	// 2760 4200:aastore         
	// 2761 4201:dup             
	// 2762 4202:sipush          175
	// 2763 4205:ldc1            #82  <String "macron">
	// 2764 4207:aastore         
	// 2765 4208:dup             
	// 2766 4209:sipush          176
	// 2767 4212:ldc2            #419 <String "degree">
	// 2768 4215:aastore         
	// 2769 4216:dup             
	// 2770 4217:sipush          177
	// 2771 4220:ldc2            #421 <String "plusminus">
	// 2772 4223:aastore         
	// 2773 4224:dup             
	// 2774 4225:sipush          178
	// 2775 4228:ldc2            #423 <String "twosuperior">
	// 2776 4231:aastore         
	// 2777 4232:dup             
	// 2778 4233:sipush          179
	// 2779 4236:ldc2            #425 <String "threesuperior">
	// 2780 4239:aastore         
	// 2781 4240:dup             
	// 2782 4241:sipush          180
	// 2783 4244:ldc2            #427 <String "acute">
	// 2784 4247:aastore         
	// 2785 4248:dup             
	// 2786 4249:sipush          181
	// 2787 4252:ldc2            #429 <String "mu">
	// 2788 4255:aastore         
	// 2789 4256:dup             
	// 2790 4257:sipush          182
	// 2791 4260:ldc2            #431 <String "paragraph">
	// 2792 4263:aastore         
	// 2793 4264:dup             
	// 2794 4265:sipush          183
	// 2795 4268:ldc2            #433 <String "periodcentered">
	// 2796 4271:aastore         
	// 2797 4272:dup             
	// 2798 4273:sipush          184
	// 2799 4276:ldc2            #435 <String "cedilla">
	// 2800 4279:aastore         
	// 2801 4280:dup             
	// 2802 4281:sipush          185
	// 2803 4284:ldc2            #437 <String "onesuperior">
	// 2804 4287:aastore         
	// 2805 4288:dup             
	// 2806 4289:sipush          186
	// 2807 4292:ldc2            #439 <String "ordmasculine">
	// 2808 4295:aastore         
	// 2809 4296:dup             
	// 2810 4297:sipush          187
	// 2811 4300:ldc2            #441 <String "guillemotright">
	// 2812 4303:aastore         
	// 2813 4304:dup             
	// 2814 4305:sipush          188
	// 2815 4308:ldc2            #443 <String "onequarter">
	// 2816 4311:aastore         
	// 2817 4312:dup             
	// 2818 4313:sipush          189
	// 2819 4316:ldc2            #445 <String "onehalf">
	// 2820 4319:aastore         
	// 2821 4320:dup             
	// 2822 4321:sipush          190
	// 2823 4324:ldc2            #447 <String "threequarters">
	// 2824 4327:aastore         
	// 2825 4328:dup             
	// 2826 4329:sipush          191
	// 2827 4332:ldc2            #449 <String "questiondown">
	// 2828 4335:aastore         
	// 2829 4336:dup             
	// 2830 4337:sipush          192
	// 2831 4340:ldc2            #451 <String "Agrave">
	// 2832 4343:aastore         
	// 2833 4344:dup             
	// 2834 4345:sipush          193
	// 2835 4348:ldc2            #453 <String "Aacute">
	// 2836 4351:aastore         
	// 2837 4352:dup             
	// 2838 4353:sipush          194
	// 2839 4356:ldc2            #455 <String "Acircumflex">
	// 2840 4359:aastore         
	// 2841 4360:dup             
	// 2842 4361:sipush          195
	// 2843 4364:ldc2            #457 <String "Atilde">
	// 2844 4367:aastore         
	// 2845 4368:dup             
	// 2846 4369:sipush          196
	// 2847 4372:ldc2            #459 <String "Adieresis">
	// 2848 4375:aastore         
	// 2849 4376:dup             
	// 2850 4377:sipush          197
	// 2851 4380:ldc2            #461 <String "Aring">
	// 2852 4383:aastore         
	// 2853 4384:dup             
	// 2854 4385:sipush          198
	// 2855 4388:ldc2            #463 <String "AE">
	// 2856 4391:aastore         
	// 2857 4392:dup             
	// 2858 4393:sipush          199
	// 2859 4396:ldc2            #465 <String "Ccedilla">
	// 2860 4399:aastore         
	// 2861 4400:dup             
	// 2862 4401:sipush          200
	// 2863 4404:ldc2            #467 <String "Egrave">
	// 2864 4407:aastore         
	// 2865 4408:dup             
	// 2866 4409:sipush          201
	// 2867 4412:ldc2            #469 <String "Eacute">
	// 2868 4415:aastore         
	// 2869 4416:dup             
	// 2870 4417:sipush          202
	// 2871 4420:ldc2            #471 <String "Ecircumflex">
	// 2872 4423:aastore         
	// 2873 4424:dup             
	// 2874 4425:sipush          203
	// 2875 4428:ldc2            #473 <String "Edieresis">
	// 2876 4431:aastore         
	// 2877 4432:dup             
	// 2878 4433:sipush          204
	// 2879 4436:ldc2            #475 <String "Igrave">
	// 2880 4439:aastore         
	// 2881 4440:dup             
	// 2882 4441:sipush          205
	// 2883 4444:ldc2            #477 <String "Iacute">
	// 2884 4447:aastore         
	// 2885 4448:dup             
	// 2886 4449:sipush          206
	// 2887 4452:ldc2            #479 <String "Icircumflex">
	// 2888 4455:aastore         
	// 2889 4456:dup             
	// 2890 4457:sipush          207
	// 2891 4460:ldc2            #481 <String "Idieresis">
	// 2892 4463:aastore         
	// 2893 4464:dup             
	// 2894 4465:sipush          208
	// 2895 4468:ldc2            #483 <String "Eth">
	// 2896 4471:aastore         
	// 2897 4472:dup             
	// 2898 4473:sipush          209
	// 2899 4476:ldc2            #485 <String "Ntilde">
	// 2900 4479:aastore         
	// 2901 4480:dup             
	// 2902 4481:sipush          210
	// 2903 4484:ldc2            #487 <String "Ograve">
	// 2904 4487:aastore         
	// 2905 4488:dup             
	// 2906 4489:sipush          211
	// 2907 4492:ldc2            #489 <String "Oacute">
	// 2908 4495:aastore         
	// 2909 4496:dup             
	// 2910 4497:sipush          212
	// 2911 4500:ldc2            #491 <String "Ocircumflex">
	// 2912 4503:aastore         
	// 2913 4504:dup             
	// 2914 4505:sipush          213
	// 2915 4508:ldc2            #493 <String "Otilde">
	// 2916 4511:aastore         
	// 2917 4512:dup             
	// 2918 4513:sipush          214
	// 2919 4516:ldc2            #495 <String "Odieresis">
	// 2920 4519:aastore         
	// 2921 4520:dup             
	// 2922 4521:sipush          215
	// 2923 4524:ldc2            #497 <String "multiply">
	// 2924 4527:aastore         
	// 2925 4528:dup             
	// 2926 4529:sipush          216
	// 2927 4532:ldc2            #499 <String "Oslash">
	// 2928 4535:aastore         
	// 2929 4536:dup             
	// 2930 4537:sipush          217
	// 2931 4540:ldc2            #501 <String "Ugrave">
	// 2932 4543:aastore         
	// 2933 4544:dup             
	// 2934 4545:sipush          218
	// 2935 4548:ldc2            #503 <String "Uacute">
	// 2936 4551:aastore         
	// 2937 4552:dup             
	// 2938 4553:sipush          219
	// 2939 4556:ldc2            #505 <String "Ucircumflex">
	// 2940 4559:aastore         
	// 2941 4560:dup             
	// 2942 4561:sipush          220
	// 2943 4564:ldc2            #507 <String "Udieresis">
	// 2944 4567:aastore         
	// 2945 4568:dup             
	// 2946 4569:sipush          221
	// 2947 4572:ldc2            #509 <String "Yacute">
	// 2948 4575:aastore         
	// 2949 4576:dup             
	// 2950 4577:sipush          222
	// 2951 4580:ldc2            #511 <String "Thorn">
	// 2952 4583:aastore         
	// 2953 4584:dup             
	// 2954 4585:sipush          223
	// 2955 4588:ldc2            #513 <String "germandbls">
	// 2956 4591:aastore         
	// 2957 4592:dup             
	// 2958 4593:sipush          224
	// 2959 4596:ldc2            #515 <String "agrave">
	// 2960 4599:aastore         
	// 2961 4600:dup             
	// 2962 4601:sipush          225
	// 2963 4604:ldc2            #517 <String "aacute">
	// 2964 4607:aastore         
	// 2965 4608:dup             
	// 2966 4609:sipush          226
	// 2967 4612:ldc2            #519 <String "acircumflex">
	// 2968 4615:aastore         
	// 2969 4616:dup             
	// 2970 4617:sipush          227
	// 2971 4620:ldc2            #521 <String "atilde">
	// 2972 4623:aastore         
	// 2973 4624:dup             
	// 2974 4625:sipush          228
	// 2975 4628:ldc2            #523 <String "adieresis">
	// 2976 4631:aastore         
	// 2977 4632:dup             
	// 2978 4633:sipush          229
	// 2979 4636:ldc2            #525 <String "aring">
	// 2980 4639:aastore         
	// 2981 4640:dup             
	// 2982 4641:sipush          230
	// 2983 4644:ldc2            #527 <String "ae">
	// 2984 4647:aastore         
	// 2985 4648:dup             
	// 2986 4649:sipush          231
	// 2987 4652:ldc2            #529 <String "ccedilla">
	// 2988 4655:aastore         
	// 2989 4656:dup             
	// 2990 4657:sipush          232
	// 2991 4660:ldc2            #531 <String "egrave">
	// 2992 4663:aastore         
	// 2993 4664:dup             
	// 2994 4665:sipush          233
	// 2995 4668:ldc2            #533 <String "eacute">
	// 2996 4671:aastore         
	// 2997 4672:dup             
	// 2998 4673:sipush          234
	// 2999 4676:ldc2            #535 <String "ecircumflex">
	// 3000 4679:aastore         
	// 3001 4680:dup             
	// 3002 4681:sipush          235
	// 3003 4684:ldc2            #537 <String "edieresis">
	// 3004 4687:aastore         
	// 3005 4688:dup             
	// 3006 4689:sipush          236
	// 3007 4692:ldc2            #539 <String "igrave">
	// 3008 4695:aastore         
	// 3009 4696:dup             
	// 3010 4697:sipush          237
	// 3011 4700:ldc2            #541 <String "iacute">
	// 3012 4703:aastore         
	// 3013 4704:dup             
	// 3014 4705:sipush          238
	// 3015 4708:ldc2            #543 <String "icircumflex">
	// 3016 4711:aastore         
	// 3017 4712:dup             
	// 3018 4713:sipush          239
	// 3019 4716:ldc2            #545 <String "idieresis">
	// 3020 4719:aastore         
	// 3021 4720:dup             
	// 3022 4721:sipush          240
	// 3023 4724:ldc2            #547 <String "eth">
	// 3024 4727:aastore         
	// 3025 4728:dup             
	// 3026 4729:sipush          241
	// 3027 4732:ldc2            #549 <String "ntilde">
	// 3028 4735:aastore         
	// 3029 4736:dup             
	// 3030 4737:sipush          242
	// 3031 4740:ldc2            #551 <String "ograve">
	// 3032 4743:aastore         
	// 3033 4744:dup             
	// 3034 4745:sipush          243
	// 3035 4748:ldc2            #553 <String "oacute">
	// 3036 4751:aastore         
	// 3037 4752:dup             
	// 3038 4753:sipush          244
	// 3039 4756:ldc2            #555 <String "ocircumflex">
	// 3040 4759:aastore         
	// 3041 4760:dup             
	// 3042 4761:sipush          245
	// 3043 4764:ldc2            #557 <String "otilde">
	// 3044 4767:aastore         
	// 3045 4768:dup             
	// 3046 4769:sipush          246
	// 3047 4772:ldc2            #559 <String "odieresis">
	// 3048 4775:aastore         
	// 3049 4776:dup             
	// 3050 4777:sipush          247
	// 3051 4780:ldc2            #561 <String "divide">
	// 3052 4783:aastore         
	// 3053 4784:dup             
	// 3054 4785:sipush          248
	// 3055 4788:ldc2            #563 <String "oslash">
	// 3056 4791:aastore         
	// 3057 4792:dup             
	// 3058 4793:sipush          249
	// 3059 4796:ldc2            #565 <String "ugrave">
	// 3060 4799:aastore         
	// 3061 4800:dup             
	// 3062 4801:sipush          250
	// 3063 4804:ldc2            #567 <String "uacute">
	// 3064 4807:aastore         
	// 3065 4808:dup             
	// 3066 4809:sipush          251
	// 3067 4812:ldc2            #569 <String "ucircumflex">
	// 3068 4815:aastore         
	// 3069 4816:dup             
	// 3070 4817:sipush          252
	// 3071 4820:ldc2            #571 <String "udieresis">
	// 3072 4823:aastore         
	// 3073 4824:dup             
	// 3074 4825:sipush          253
	// 3075 4828:ldc2            #573 <String "yacute">
	// 3076 4831:aastore         
	// 3077 4832:dup             
	// 3078 4833:sipush          254
	// 3079 4836:ldc2            #575 <String "thorn">
	// 3080 4839:aastore         
	// 3081 4840:dup             
	// 3082 4841:sipush          255
	// 3083 4844:ldc2            #577 <String "ydieresis">
	// 3084 4847:aastore         
	// 3085 4848:putfield        #579 <Field String[] WinChars>
		in = randomaccessfileorarray;
	// 3086 4851:aload_0         
	// 3087 4852:aload_1         
	// 3088 4853:putfield        #581 <Field RandomAccessFileOrArray in>
		out = new PrintWriter(((java.io.Writer) (new OutputStreamWriter(outputstream, "ISO-8859-1"))));
	// 3089 4856:aload_0         
	// 3090 4857:new             #583 <Class PrintWriter>
	// 3091 4860:dup             
	// 3092 4861:new             #585 <Class OutputStreamWriter>
	// 3093 4864:dup             
	// 3094 4865:aload_2         
	// 3095 4866:ldc2            #587 <String "ISO-8859-1">
	// 3096 4869:invokespecial   #590 <Method void OutputStreamWriter(OutputStream, String)>
	// 3097 4872:invokespecial   #593 <Method void PrintWriter(java.io.Writer)>
	// 3098 4875:putfield        #595 <Field PrintWriter out>
	// 3099 4878:return          
	}

	public static void convert(RandomAccessFileOrArray randomaccessfileorarray, OutputStream outputstream)
		throws IOException
	{
		randomaccessfileorarray = ((RandomAccessFileOrArray) (new Pfm2afm(randomaccessfileorarray, outputstream)));
	//    0    0:new             #2   <Class Pfm2afm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #600 <Method void Pfm2afm(RandomAccessFileOrArray, OutputStream)>
	//    5    9:astore_0        
		((Pfm2afm) (randomaccessfileorarray)).openpfm();
	//    6   10:aload_0         
	//    7   11:invokespecial   #603 <Method void openpfm()>
		((Pfm2afm) (randomaccessfileorarray)).putheader();
	//    8   14:aload_0         
	//    9   15:invokespecial   #606 <Method void putheader()>
		((Pfm2afm) (randomaccessfileorarray)).putchartab();
	//   10   18:aload_0         
	//   11   19:invokespecial   #609 <Method void putchartab()>
		((Pfm2afm) (randomaccessfileorarray)).putkerntab();
	//   12   22:aload_0         
	//   13   23:invokespecial   #612 <Method void putkerntab()>
		((Pfm2afm) (randomaccessfileorarray)).puttrailer();
	//   14   26:aload_0         
	//   15   27:invokespecial   #615 <Method void puttrailer()>
		((Pfm2afm) (randomaccessfileorarray)).out.flush();
	//   16   30:aload_0         
	//   17   31:getfield        #595 <Field PrintWriter out>
	//   18   34:invokevirtual   #618 <Method void PrintWriter.flush()>
	//   19   37:return          
	}

	private void openpfm()
		throws IOException
	{
		in.seek(0L);
	//    0    0:aload_0         
	//    1    1:getfield        #581 <Field RandomAccessFileOrArray in>
	//    2    4:lconst_0        
	//    3    5:invokevirtual   #624 <Method void RandomAccessFileOrArray.seek(long)>
		vers = in.readShortLE();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #581 <Field RandomAccessFileOrArray in>
	//    7   13:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//    8   16:putfield        #630 <Field short vers>
		h_len = in.readIntLE();
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #581 <Field RandomAccessFileOrArray in>
	//   12   24:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//   13   27:putfield        #636 <Field int h_len>
		copyright = readString(60);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:bipush          60
	//   17   34:invokespecial   #640 <Method String readString(int)>
	//   18   37:putfield        #642 <Field String copyright>
		type = in.readShortLE();
	//   19   40:aload_0         
	//   20   41:aload_0         
	//   21   42:getfield        #581 <Field RandomAccessFileOrArray in>
	//   22   45:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   23   48:putfield        #644 <Field short type>
		points = in.readShortLE();
	//   24   51:aload_0         
	//   25   52:aload_0         
	//   26   53:getfield        #581 <Field RandomAccessFileOrArray in>
	//   27   56:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   28   59:putfield        #646 <Field short points>
		verres = in.readShortLE();
	//   29   62:aload_0         
	//   30   63:aload_0         
	//   31   64:getfield        #581 <Field RandomAccessFileOrArray in>
	//   32   67:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   33   70:putfield        #648 <Field short verres>
		horres = in.readShortLE();
	//   34   73:aload_0         
	//   35   74:aload_0         
	//   36   75:getfield        #581 <Field RandomAccessFileOrArray in>
	//   37   78:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   38   81:putfield        #650 <Field short horres>
		ascent = in.readShortLE();
	//   39   84:aload_0         
	//   40   85:aload_0         
	//   41   86:getfield        #581 <Field RandomAccessFileOrArray in>
	//   42   89:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   43   92:putfield        #652 <Field short ascent>
		intleading = in.readShortLE();
	//   44   95:aload_0         
	//   45   96:aload_0         
	//   46   97:getfield        #581 <Field RandomAccessFileOrArray in>
	//   47  100:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   48  103:putfield        #654 <Field short intleading>
		extleading = in.readShortLE();
	//   49  106:aload_0         
	//   50  107:aload_0         
	//   51  108:getfield        #581 <Field RandomAccessFileOrArray in>
	//   52  111:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   53  114:putfield        #656 <Field short extleading>
		italic = (byte)in.read();
	//   54  117:aload_0         
	//   55  118:aload_0         
	//   56  119:getfield        #581 <Field RandomAccessFileOrArray in>
	//   57  122:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//   58  125:int2byte        
	//   59  126:putfield        #661 <Field byte italic>
		uline = (byte)in.read();
	//   60  129:aload_0         
	//   61  130:aload_0         
	//   62  131:getfield        #581 <Field RandomAccessFileOrArray in>
	//   63  134:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//   64  137:int2byte        
	//   65  138:putfield        #663 <Field byte uline>
		overs = (byte)in.read();
	//   66  141:aload_0         
	//   67  142:aload_0         
	//   68  143:getfield        #581 <Field RandomAccessFileOrArray in>
	//   69  146:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//   70  149:int2byte        
	//   71  150:putfield        #665 <Field byte overs>
		weight = in.readShortLE();
	//   72  153:aload_0         
	//   73  154:aload_0         
	//   74  155:getfield        #581 <Field RandomAccessFileOrArray in>
	//   75  158:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   76  161:putfield        #667 <Field short weight>
		charset = (byte)in.read();
	//   77  164:aload_0         
	//   78  165:aload_0         
	//   79  166:getfield        #581 <Field RandomAccessFileOrArray in>
	//   80  169:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//   81  172:int2byte        
	//   82  173:putfield        #669 <Field byte charset>
		pixwidth = in.readShortLE();
	//   83  176:aload_0         
	//   84  177:aload_0         
	//   85  178:getfield        #581 <Field RandomAccessFileOrArray in>
	//   86  181:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   87  184:putfield        #671 <Field short pixwidth>
		pixheight = in.readShortLE();
	//   88  187:aload_0         
	//   89  188:aload_0         
	//   90  189:getfield        #581 <Field RandomAccessFileOrArray in>
	//   91  192:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   92  195:putfield        #673 <Field short pixheight>
		kind = (byte)in.read();
	//   93  198:aload_0         
	//   94  199:aload_0         
	//   95  200:getfield        #581 <Field RandomAccessFileOrArray in>
	//   96  203:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//   97  206:int2byte        
	//   98  207:putfield        #675 <Field byte kind>
		avgwidth = in.readShortLE();
	//   99  210:aload_0         
	//  100  211:aload_0         
	//  101  212:getfield        #581 <Field RandomAccessFileOrArray in>
	//  102  215:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  103  218:putfield        #677 <Field short avgwidth>
		maxwidth = in.readShortLE();
	//  104  221:aload_0         
	//  105  222:aload_0         
	//  106  223:getfield        #581 <Field RandomAccessFileOrArray in>
	//  107  226:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  108  229:putfield        #679 <Field short maxwidth>
		firstchar = in.read();
	//  109  232:aload_0         
	//  110  233:aload_0         
	//  111  234:getfield        #581 <Field RandomAccessFileOrArray in>
	//  112  237:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//  113  240:putfield        #681 <Field int firstchar>
		lastchar = in.read();
	//  114  243:aload_0         
	//  115  244:aload_0         
	//  116  245:getfield        #581 <Field RandomAccessFileOrArray in>
	//  117  248:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//  118  251:putfield        #683 <Field int lastchar>
		defchar = (byte)in.read();
	//  119  254:aload_0         
	//  120  255:aload_0         
	//  121  256:getfield        #581 <Field RandomAccessFileOrArray in>
	//  122  259:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//  123  262:int2byte        
	//  124  263:putfield        #685 <Field byte defchar>
		brkchar = (byte)in.read();
	//  125  266:aload_0         
	//  126  267:aload_0         
	//  127  268:getfield        #581 <Field RandomAccessFileOrArray in>
	//  128  271:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//  129  274:int2byte        
	//  130  275:putfield        #687 <Field byte brkchar>
		widthby = in.readShortLE();
	//  131  278:aload_0         
	//  132  279:aload_0         
	//  133  280:getfield        #581 <Field RandomAccessFileOrArray in>
	//  134  283:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  135  286:putfield        #689 <Field short widthby>
		device = in.readIntLE();
	//  136  289:aload_0         
	//  137  290:aload_0         
	//  138  291:getfield        #581 <Field RandomAccessFileOrArray in>
	//  139  294:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  140  297:putfield        #691 <Field int device>
		face = in.readIntLE();
	//  141  300:aload_0         
	//  142  301:aload_0         
	//  143  302:getfield        #581 <Field RandomAccessFileOrArray in>
	//  144  305:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  145  308:putfield        #693 <Field int face>
		bits = in.readIntLE();
	//  146  311:aload_0         
	//  147  312:aload_0         
	//  148  313:getfield        #581 <Field RandomAccessFileOrArray in>
	//  149  316:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  150  319:putfield        #695 <Field int bits>
		bitoff = in.readIntLE();
	//  151  322:aload_0         
	//  152  323:aload_0         
	//  153  324:getfield        #581 <Field RandomAccessFileOrArray in>
	//  154  327:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  155  330:putfield        #697 <Field int bitoff>
		extlen = in.readShortLE();
	//  156  333:aload_0         
	//  157  334:aload_0         
	//  158  335:getfield        #581 <Field RandomAccessFileOrArray in>
	//  159  338:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  160  341:putfield        #699 <Field short extlen>
		psext = in.readIntLE();
	//  161  344:aload_0         
	//  162  345:aload_0         
	//  163  346:getfield        #581 <Field RandomAccessFileOrArray in>
	//  164  349:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  165  352:putfield        #701 <Field int psext>
		chartab = in.readIntLE();
	//  166  355:aload_0         
	//  167  356:aload_0         
	//  168  357:getfield        #581 <Field RandomAccessFileOrArray in>
	//  169  360:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  170  363:putfield        #703 <Field int chartab>
		res1 = in.readIntLE();
	//  171  366:aload_0         
	//  172  367:aload_0         
	//  173  368:getfield        #581 <Field RandomAccessFileOrArray in>
	//  174  371:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  175  374:putfield        #705 <Field int res1>
		kernpairs = in.readIntLE();
	//  176  377:aload_0         
	//  177  378:aload_0         
	//  178  379:getfield        #581 <Field RandomAccessFileOrArray in>
	//  179  382:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  180  385:putfield        #707 <Field int kernpairs>
		res2 = in.readIntLE();
	//  181  388:aload_0         
	//  182  389:aload_0         
	//  183  390:getfield        #581 <Field RandomAccessFileOrArray in>
	//  184  393:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  185  396:putfield        #709 <Field int res2>
		fontname = in.readIntLE();
	//  186  399:aload_0         
	//  187  400:aload_0         
	//  188  401:getfield        #581 <Field RandomAccessFileOrArray in>
	//  189  404:invokevirtual   #634 <Method int RandomAccessFileOrArray.readIntLE()>
	//  190  407:putfield        #711 <Field int fontname>
		if((long)h_len != in.length() || extlen != 30 || fontname < 75 || fontname > 512)
	//* 191  410:aload_0         
	//* 192  411:getfield        #636 <Field int h_len>
	//* 193  414:i2l             
	//* 194  415:aload_0         
	//* 195  416:getfield        #581 <Field RandomAccessFileOrArray in>
	//* 196  419:invokevirtual   #715 <Method long RandomAccessFileOrArray.length()>
	//* 197  422:lcmp            
	//* 198  423:ifne            454
	//* 199  426:aload_0         
	//* 200  427:getfield        #699 <Field short extlen>
	//* 201  430:bipush          30
	//* 202  432:icmpne          454
	//* 203  435:aload_0         
	//* 204  436:getfield        #711 <Field int fontname>
	//* 205  439:bipush          75
	//* 206  441:icmplt          454
	//* 207  444:aload_0         
	//* 208  445:getfield        #711 <Field int fontname>
	//* 209  448:sipush          512
	//* 210  451:icmple          472
		{
			throw new IOException(MessageLocalization.getComposedMessage("not.a.valid.pfm.file", new Object[0]));
	//  211  454:new             #63  <Class IOException>
	//  212  457:dup             
	//  213  458:ldc2            #717 <String "not.a.valid.pfm.file">
	//  214  461:iconst_0        
	//  215  462:anewarray       Object[]
	//  216  465:invokestatic    #723 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  217  468:invokespecial   #726 <Method void IOException(String)>
	//  218  471:athrow          
		} else
		{
			in.seek(psext + 14);
	//  219  472:aload_0         
	//  220  473:getfield        #581 <Field RandomAccessFileOrArray in>
	//  221  476:aload_0         
	//  222  477:getfield        #701 <Field int psext>
	//  223  480:bipush          14
	//  224  482:iadd            
	//  225  483:i2l             
	//  226  484:invokevirtual   #624 <Method void RandomAccessFileOrArray.seek(long)>
			capheight = in.readShortLE();
	//  227  487:aload_0         
	//  228  488:aload_0         
	//  229  489:getfield        #581 <Field RandomAccessFileOrArray in>
	//  230  492:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  231  495:putfield        #728 <Field short capheight>
			xheight = in.readShortLE();
	//  232  498:aload_0         
	//  233  499:aload_0         
	//  234  500:getfield        #581 <Field RandomAccessFileOrArray in>
	//  235  503:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  236  506:putfield        #730 <Field short xheight>
			ascender = in.readShortLE();
	//  237  509:aload_0         
	//  238  510:aload_0         
	//  239  511:getfield        #581 <Field RandomAccessFileOrArray in>
	//  240  514:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  241  517:putfield        #732 <Field short ascender>
			descender = in.readShortLE();
	//  242  520:aload_0         
	//  243  521:aload_0         
	//  244  522:getfield        #581 <Field RandomAccessFileOrArray in>
	//  245  525:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//  246  528:putfield        #734 <Field short descender>
			return;
	//  247  531:return          
		}
	}

	private void outchar(int i, int j, String s)
	{
		out.print("C ");
	//    0    0:aload_0         
	//    1    1:getfield        #595 <Field PrintWriter out>
	//    2    4:ldc2            #738 <String "C ">
	//    3    7:invokevirtual   #741 <Method void PrintWriter.print(String)>
		outval(i);
	//    4   10:aload_0         
	//    5   11:iload_1         
	//    6   12:invokespecial   #745 <Method void outval(int)>
		out.print(" ; WX ");
	//    7   15:aload_0         
	//    8   16:getfield        #595 <Field PrintWriter out>
	//    9   19:ldc2            #747 <String " ; WX ">
	//   10   22:invokevirtual   #741 <Method void PrintWriter.print(String)>
		outval(j);
	//   11   25:aload_0         
	//   12   26:iload_2         
	//   13   27:invokespecial   #745 <Method void outval(int)>
		if(s != null)
	//*  14   30:aload_3         
	//*  15   31:ifnull          52
		{
			out.print(" ; N ");
	//   16   34:aload_0         
	//   17   35:getfield        #595 <Field PrintWriter out>
	//   18   38:ldc2            #749 <String " ; N ">
	//   19   41:invokevirtual   #741 <Method void PrintWriter.print(String)>
			out.print(s);
	//   20   44:aload_0         
	//   21   45:getfield        #595 <Field PrintWriter out>
	//   22   48:aload_3         
	//   23   49:invokevirtual   #741 <Method void PrintWriter.print(String)>
		}
		out.print(" ;\n");
	//   24   52:aload_0         
	//   25   53:getfield        #595 <Field PrintWriter out>
	//   26   56:ldc2            #751 <String " ;\n">
	//   27   59:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//   28   62:return          
	}

	private void outval(int i)
	{
		out.print(' ');
	//    0    0:aload_0         
	//    1    1:getfield        #595 <Field PrintWriter out>
	//    2    4:bipush          32
	//    3    6:invokevirtual   #754 <Method void PrintWriter.print(char)>
		out.print(i);
	//    4    9:aload_0         
	//    5   10:getfield        #595 <Field PrintWriter out>
	//    6   13:iload_1         
	//    7   14:invokevirtual   #756 <Method void PrintWriter.print(int)>
	//    8   17:return          
	}

	private void putchartab()
		throws IOException
	{
		int j1 = (lastchar - firstchar) + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #683 <Field int lastchar>
	//    2    4:aload_0         
	//    3    5:getfield        #681 <Field int firstchar>
	//    4    8:isub            
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:istore_2        
		int ai[] = new int[j1];
	//    8   12:iload_2         
	//    9   13:newarray        int[]
	//   10   15:astore_3        
		in.seek(chartab);
	//   11   16:aload_0         
	//   12   17:getfield        #581 <Field RandomAccessFileOrArray in>
	//   13   20:aload_0         
	//   14   21:getfield        #703 <Field int chartab>
	//   15   24:i2l             
	//   16   25:invokevirtual   #624 <Method void RandomAccessFileOrArray.seek(long)>
		for(int i = 0; i < j1; i++)
	//*  17   28:iconst_0        
	//*  18   29:istore_1        
	//*  19   30:iload_1         
	//*  20   31:iload_2         
	//*  21   32:icmpge          52
			ai[i] = in.readUnsignedShortLE();
	//   22   35:aload_3         
	//   23   36:iload_1         
	//   24   37:aload_0         
	//   25   38:getfield        #581 <Field RandomAccessFileOrArray in>
	//   26   41:invokevirtual   #759 <Method int RandomAccessFileOrArray.readUnsignedShortLE()>
	//   27   44:iastore         

	//   28   45:iload_1         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_1        
	//*  32   49:goto            30
		int ai1[] = new int[256];
	//   33   52:sipush          256
	//   34   55:newarray        int[]
	//   35   57:astore          4
		if(charset == 0)
	//*  36   59:aload_0         
	//*  37   60:getfield        #669 <Field byte charset>
	//*  38   63:ifne            105
		{
			for(int j = firstchar; j <= lastchar; j++)
	//*  39   66:aload_0         
	//*  40   67:getfield        #681 <Field int firstchar>
	//*  41   70:istore_1        
	//*  42   71:iload_1         
	//*  43   72:aload_0         
	//*  44   73:getfield        #683 <Field int lastchar>
	//*  45   76:icmpgt          105
				if(Win2PSStd[j] != 0)
	//*  46   79:aload_0         
	//*  47   80:getfield        #68  <Field int[] Win2PSStd>
	//*  48   83:iload_1         
	//*  49   84:iaload          
	//*  50   85:ifeq            98
					ai1[Win2PSStd[j]] = j;
	//   51   88:aload           4
	//   52   90:aload_0         
	//   53   91:getfield        #68  <Field int[] Win2PSStd>
	//   54   94:iload_1         
	//   55   95:iaload          
	//   56   96:iload_1         
	//   57   97:iastore         

	//   58   98:iload_1         
	//   59   99:iconst_1        
	//   60  100:iadd            
	//   61  101:istore_1        
		}
	//*  62  102:goto            71
		out.print("StartCharMetrics");
	//   63  105:aload_0         
	//   64  106:getfield        #595 <Field PrintWriter out>
	//   65  109:ldc2            #761 <String "StartCharMetrics">
	//   66  112:invokevirtual   #741 <Method void PrintWriter.print(String)>
		outval(j1);
	//   67  115:aload_0         
	//   68  116:iload_2         
	//   69  117:invokespecial   #745 <Method void outval(int)>
		out.print('\n');
	//   70  120:aload_0         
	//   71  121:getfield        #595 <Field PrintWriter out>
	//   72  124:bipush          10
	//   73  126:invokevirtual   #754 <Method void PrintWriter.print(char)>
		if(charset != 0)
	//*  74  129:aload_0         
	//*  75  130:getfield        #669 <Field byte charset>
	//*  76  133:ifeq            181
		{
			for(int k = firstchar; k <= lastchar; k++)
	//*  77  136:aload_0         
	//*  78  137:getfield        #681 <Field int firstchar>
	//*  79  140:istore_1        
	//*  80  141:iload_1         
	//*  81  142:aload_0         
	//*  82  143:getfield        #683 <Field int lastchar>
	//*  83  146:icmpgt          284
				if(ai[k - firstchar] != 0)
	//*  84  149:aload_3         
	//*  85  150:iload_1         
	//*  86  151:aload_0         
	//*  87  152:getfield        #681 <Field int firstchar>
	//*  88  155:isub            
	//*  89  156:iaload          
	//*  90  157:ifeq            174
					outchar(k, ai[k - firstchar], ((String) (null)));
	//   91  160:aload_0         
	//   92  161:iload_1         
	//   93  162:aload_3         
	//   94  163:iload_1         
	//   95  164:aload_0         
	//   96  165:getfield        #681 <Field int firstchar>
	//   97  168:isub            
	//   98  169:iaload          
	//   99  170:aconst_null     
	//  100  171:invokespecial   #763 <Method void outchar(int, int, String)>

	//  101  174:iload_1         
	//  102  175:iconst_1        
	//  103  176:iadd            
	//  104  177:istore_1        
		} else
	//* 105  178:goto            141
		{
			for(int l = 0; l < 256; l++)
	//* 106  181:iconst_0        
	//* 107  182:istore_1        
	//* 108  183:iload_1         
	//* 109  184:sipush          256
	//* 110  187:icmpge          234
			{
				int k1 = ai1[l];
	//  111  190:aload           4
	//  112  192:iload_1         
	//  113  193:iaload          
	//  114  194:istore_2        
				if(k1 != 0)
	//* 115  195:iload_2         
	//* 116  196:ifeq            227
				{
					outchar(l, ai[k1 - firstchar], WinChars[k1]);
	//  117  199:aload_0         
	//  118  200:iload_1         
	//  119  201:aload_3         
	//  120  202:iload_2         
	//  121  203:aload_0         
	//  122  204:getfield        #681 <Field int firstchar>
	//  123  207:isub            
	//  124  208:iaload          
	//  125  209:aload_0         
	//  126  210:getfield        #579 <Field String[] WinChars>
	//  127  213:iload_2         
	//  128  214:aaload          
	//  129  215:invokespecial   #763 <Method void outchar(int, int, String)>
					ai[k1 - firstchar] = 0;
	//  130  218:aload_3         
	//  131  219:iload_2         
	//  132  220:aload_0         
	//  133  221:getfield        #681 <Field int firstchar>
	//  134  224:isub            
	//  135  225:iconst_0        
	//  136  226:iastore         
				}
			}

	//  137  227:iload_1         
	//  138  228:iconst_1        
	//  139  229:iadd            
	//  140  230:istore_1        
	//* 141  231:goto            183
			for(int i1 = firstchar; i1 <= lastchar; i1++)
	//* 142  234:aload_0         
	//* 143  235:getfield        #681 <Field int firstchar>
	//* 144  238:istore_1        
	//* 145  239:iload_1         
	//* 146  240:aload_0         
	//* 147  241:getfield        #683 <Field int lastchar>
	//* 148  244:icmpgt          284
				if(ai[i1 - firstchar] != 0)
	//* 149  247:aload_3         
	//* 150  248:iload_1         
	//* 151  249:aload_0         
	//* 152  250:getfield        #681 <Field int firstchar>
	//* 153  253:isub            
	//* 154  254:iaload          
	//* 155  255:ifeq            277
					outchar(-1, ai[i1 - firstchar], WinChars[i1]);
	//  156  258:aload_0         
	//  157  259:iconst_m1       
	//  158  260:aload_3         
	//  159  261:iload_1         
	//  160  262:aload_0         
	//  161  263:getfield        #681 <Field int firstchar>
	//  162  266:isub            
	//  163  267:iaload          
	//  164  268:aload_0         
	//  165  269:getfield        #579 <Field String[] WinChars>
	//  166  272:iload_1         
	//  167  273:aaload          
	//  168  274:invokespecial   #763 <Method void outchar(int, int, String)>

	//  169  277:iload_1         
	//  170  278:iconst_1        
	//  171  279:iadd            
	//  172  280:istore_1        
		}
	//* 173  281:goto            239
		out.print("EndCharMetrics\n");
	//  174  284:aload_0         
	//  175  285:getfield        #595 <Field PrintWriter out>
	//  176  288:ldc2            #765 <String "EndCharMetrics\n">
	//  177  291:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//  178  294:return          
	}

	private void putheader()
		throws IOException
	{
		out.print("StartFontMetrics 2.0\n");
	//    0    0:aload_0         
	//    1    1:getfield        #595 <Field PrintWriter out>
	//    2    4:ldc2            #767 <String "StartFontMetrics 2.0\n">
	//    3    7:invokevirtual   #741 <Method void PrintWriter.print(String)>
		if(copyright.length() > 0)
	//*   4   10:aload_0         
	//*   5   11:getfield        #642 <Field String copyright>
	//*   6   14:invokevirtual   #769 <Method int String.length()>
	//*   7   17:ifle            55
			out.print((new StringBuilder()).append("Comment ").append(copyright).append('\n').toString());
	//    8   20:aload_0         
	//    9   21:getfield        #595 <Field PrintWriter out>
	//   10   24:new             #771 <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #772 <Method void StringBuilder()>
	//   13   31:ldc2            #774 <String "Comment ">
	//   14   34:invokevirtual   #778 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload_0         
	//   16   38:getfield        #642 <Field String copyright>
	//   17   41:invokevirtual   #778 <Method StringBuilder StringBuilder.append(String)>
	//   18   44:bipush          10
	//   19   46:invokevirtual   #781 <Method StringBuilder StringBuilder.append(char)>
	//   20   49:invokevirtual   #785 <Method String StringBuilder.toString()>
	//   21   52:invokevirtual   #741 <Method void PrintWriter.print(String)>
		out.print("FontName ");
	//   22   55:aload_0         
	//   23   56:getfield        #595 <Field PrintWriter out>
	//   24   59:ldc2            #787 <String "FontName ">
	//   25   62:invokevirtual   #741 <Method void PrintWriter.print(String)>
		in.seek(fontname);
	//   26   65:aload_0         
	//   27   66:getfield        #581 <Field RandomAccessFileOrArray in>
	//   28   69:aload_0         
	//   29   70:getfield        #711 <Field int fontname>
	//   30   73:i2l             
	//   31   74:invokevirtual   #624 <Method void RandomAccessFileOrArray.seek(long)>
		String s = readString();
	//   32   77:aload_0         
	//   33   78:invokespecial   #789 <Method String readString()>
	//   34   81:astore_1        
		out.print(s);
	//   35   82:aload_0         
	//   36   83:getfield        #595 <Field PrintWriter out>
	//   37   86:aload_1         
	//   38   87:invokevirtual   #741 <Method void PrintWriter.print(String)>
		out.print("\nEncodingScheme ");
	//   39   90:aload_0         
	//   40   91:getfield        #595 <Field PrintWriter out>
	//   41   94:ldc2            #791 <String "\nEncodingScheme ">
	//   42   97:invokevirtual   #741 <Method void PrintWriter.print(String)>
		if(charset != 0)
	//*  43  100:aload_0         
	//*  44  101:getfield        #669 <Field byte charset>
	//*  45  104:ifeq            466
			out.print("FontSpecific\n");
	//   46  107:aload_0         
	//   47  108:getfield        #595 <Field PrintWriter out>
	//   48  111:ldc2            #793 <String "FontSpecific\n">
	//   49  114:invokevirtual   #741 <Method void PrintWriter.print(String)>
		else
	//*  50  117:aload_0         
	//*  51  118:getfield        #595 <Field PrintWriter out>
	//*  52  121:new             #771 <Class StringBuilder>
	//*  53  124:dup             
	//*  54  125:invokespecial   #772 <Method void StringBuilder()>
	//*  55  128:ldc2            #795 <String "FullName ">
	//*  56  131:invokevirtual   #778 <Method StringBuilder StringBuilder.append(String)>
	//*  57  134:aload_1         
	//*  58  135:bipush          45
	//*  59  137:bipush          32
	//*  60  139:invokevirtual   #799 <Method String String.replace(char, char)>
	//*  61  142:invokevirtual   #778 <Method StringBuilder StringBuilder.append(String)>
	//*  62  145:invokevirtual   #785 <Method String StringBuilder.toString()>
	//*  63  148:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//*  64  151:aload_0         
	//*  65  152:getfield        #693 <Field int face>
	//*  66  155:ifeq            200
	//*  67  158:aload_0         
	//*  68  159:getfield        #581 <Field RandomAccessFileOrArray in>
	//*  69  162:aload_0         
	//*  70  163:getfield        #693 <Field int face>
	//*  71  166:i2l             
	//*  72  167:invokevirtual   #624 <Method void RandomAccessFileOrArray.seek(long)>
	//*  73  170:aload_0         
	//*  74  171:getfield        #595 <Field PrintWriter out>
	//*  75  174:new             #771 <Class StringBuilder>
	//*  76  177:dup             
	//*  77  178:invokespecial   #772 <Method void StringBuilder()>
	//*  78  181:ldc2            #801 <String "\nFamilyName ">
	//*  79  184:invokevirtual   #778 <Method StringBuilder StringBuilder.append(String)>
	//*  80  187:aload_0         
	//*  81  188:invokespecial   #789 <Method String readString()>
	//*  82  191:invokevirtual   #778 <Method StringBuilder StringBuilder.append(String)>
	//*  83  194:invokevirtual   #785 <Method String StringBuilder.toString()>
	//*  84  197:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//*  85  200:aload_0         
	//*  86  201:getfield        #595 <Field PrintWriter out>
	//*  87  204:ldc2            #803 <String "\nWeight ">
	//*  88  207:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//*  89  210:aload_0         
	//*  90  211:getfield        #667 <Field short weight>
	//*  91  214:sipush          475
	//*  92  217:icmpgt          233
	//*  93  220:aload_1         
	//*  94  221:invokevirtual   #806 <Method String String.toLowerCase()>
	//*  95  224:ldc2            #808 <String "bold">
	//*  96  227:invokevirtual   #812 <Method int String.indexOf(String)>
	//*  97  230:iflt            479
	//*  98  233:aload_0         
	//*  99  234:getfield        #595 <Field PrintWriter out>
	//* 100  237:ldc2            #814 <String "Bold">
	//* 101  240:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 102  243:aload_0         
	//* 103  244:getfield        #595 <Field PrintWriter out>
	//* 104  247:ldc2            #816 <String "\nItalicAngle ">
	//* 105  250:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 106  253:aload_0         
	//* 107  254:getfield        #661 <Field byte italic>
	//* 108  257:ifne            273
	//* 109  260:aload_1         
	//* 110  261:invokevirtual   #806 <Method String String.toLowerCase()>
	//* 111  264:ldc2            #817 <String "italic">
	//* 112  267:invokevirtual   #812 <Method int String.indexOf(String)>
	//* 113  270:iflt            561
	//* 114  273:aload_0         
	//* 115  274:getfield        #595 <Field PrintWriter out>
	//* 116  277:ldc2            #819 <String "-12.00">
	//* 117  280:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 118  283:aload_0         
	//* 119  284:getfield        #595 <Field PrintWriter out>
	//* 120  287:ldc2            #821 <String "\nIsFixedPitch ">
	//* 121  290:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 122  293:aload_0         
	//* 123  294:getfield        #675 <Field byte kind>
	//* 124  297:iconst_1        
	//* 125  298:iand            
	//* 126  299:ifeq            313
	//* 127  302:aload_0         
	//* 128  303:getfield        #677 <Field short avgwidth>
	//* 129  306:aload_0         
	//* 130  307:getfield        #679 <Field short maxwidth>
	//* 131  310:icmpne          574
	//* 132  313:aload_0         
	//* 133  314:getfield        #595 <Field PrintWriter out>
	//* 134  317:ldc2            #823 <String "true">
	//* 135  320:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 136  323:aload_0         
	//* 137  324:iconst_1        
	//* 138  325:putfield        #825 <Field boolean isMono>
	//* 139  328:aload_0         
	//* 140  329:getfield        #595 <Field PrintWriter out>
	//* 141  332:ldc2            #827 <String "\nFontBBox">
	//* 142  335:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 143  338:aload_0         
	//* 144  339:getfield        #825 <Field boolean isMono>
	//* 145  342:ifeq            592
	//* 146  345:aload_0         
	//* 147  346:bipush          -20
	//* 148  348:invokespecial   #745 <Method void outval(int)>
	//* 149  351:aload_0         
	//* 150  352:aload_0         
	//* 151  353:getfield        #734 <Field short descender>
	//* 152  356:iconst_5        
	//* 153  357:iadd            
	//* 154  358:ineg            
	//* 155  359:invokespecial   #745 <Method void outval(int)>
	//* 156  362:aload_0         
	//* 157  363:aload_0         
	//* 158  364:getfield        #679 <Field short maxwidth>
	//* 159  367:bipush          10
	//* 160  369:iadd            
	//* 161  370:invokespecial   #745 <Method void outval(int)>
	//* 162  373:aload_0         
	//* 163  374:aload_0         
	//* 164  375:getfield        #652 <Field short ascent>
	//* 165  378:iconst_5        
	//* 166  379:iadd            
	//* 167  380:invokespecial   #745 <Method void outval(int)>
	//* 168  383:aload_0         
	//* 169  384:getfield        #595 <Field PrintWriter out>
	//* 170  387:ldc2            #829 <String "\nCapHeight">
	//* 171  390:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 172  393:aload_0         
	//* 173  394:aload_0         
	//* 174  395:getfield        #728 <Field short capheight>
	//* 175  398:invokespecial   #745 <Method void outval(int)>
	//* 176  401:aload_0         
	//* 177  402:getfield        #595 <Field PrintWriter out>
	//* 178  405:ldc2            #831 <String "\nXHeight">
	//* 179  408:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 180  411:aload_0         
	//* 181  412:aload_0         
	//* 182  413:getfield        #730 <Field short xheight>
	//* 183  416:invokespecial   #745 <Method void outval(int)>
	//* 184  419:aload_0         
	//* 185  420:getfield        #595 <Field PrintWriter out>
	//* 186  423:ldc2            #833 <String "\nDescender">
	//* 187  426:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 188  429:aload_0         
	//* 189  430:aload_0         
	//* 190  431:getfield        #734 <Field short descender>
	//* 191  434:ineg            
	//* 192  435:invokespecial   #745 <Method void outval(int)>
	//* 193  438:aload_0         
	//* 194  439:getfield        #595 <Field PrintWriter out>
	//* 195  442:ldc2            #835 <String "\nAscender">
	//* 196  445:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//* 197  448:aload_0         
	//* 198  449:aload_0         
	//* 199  450:getfield        #732 <Field short ascender>
	//* 200  453:invokespecial   #745 <Method void outval(int)>
	//* 201  456:aload_0         
	//* 202  457:getfield        #595 <Field PrintWriter out>
	//* 203  460:bipush          10
	//* 204  462:invokevirtual   #754 <Method void PrintWriter.print(char)>
	//* 205  465:return          
			out.print("AdobeStandardEncoding\n");
	//  206  466:aload_0         
	//  207  467:getfield        #595 <Field PrintWriter out>
	//  208  470:ldc2            #837 <String "AdobeStandardEncoding\n">
	//  209  473:invokevirtual   #741 <Method void PrintWriter.print(String)>
		out.print((new StringBuilder()).append("FullName ").append(s.replace('-', ' ')).toString());
		if(face != 0)
		{
			in.seek(face);
			out.print((new StringBuilder()).append("\nFamilyName ").append(readString()).toString());
		}
		out.print("\nWeight ");
		if(weight > 475 || s.toLowerCase().indexOf("bold") >= 0)
			out.print("Bold");
		else
	//* 210  476:goto            117
		if(weight < 325 && weight != 0 || s.toLowerCase().indexOf("light") >= 0)
	//* 211  479:aload_0         
	//* 212  480:getfield        #667 <Field short weight>
	//* 213  483:sipush          325
	//* 214  486:icmpge          496
	//* 215  489:aload_0         
	//* 216  490:getfield        #667 <Field short weight>
	//* 217  493:ifne            509
	//* 218  496:aload_1         
	//* 219  497:invokevirtual   #806 <Method String String.toLowerCase()>
	//* 220  500:ldc2            #839 <String "light">
	//* 221  503:invokevirtual   #812 <Method int String.indexOf(String)>
	//* 222  506:iflt            522
			out.print("Light");
	//  223  509:aload_0         
	//  224  510:getfield        #595 <Field PrintWriter out>
	//  225  513:ldc2            #841 <String "Light">
	//  226  516:invokevirtual   #741 <Method void PrintWriter.print(String)>
		else
	//* 227  519:goto            243
		if(s.toLowerCase().indexOf("black") >= 0)
	//* 228  522:aload_1         
	//* 229  523:invokevirtual   #806 <Method String String.toLowerCase()>
	//* 230  526:ldc2            #843 <String "black">
	//* 231  529:invokevirtual   #812 <Method int String.indexOf(String)>
	//* 232  532:iflt            548
			out.print("Black");
	//  233  535:aload_0         
	//  234  536:getfield        #595 <Field PrintWriter out>
	//  235  539:ldc2            #845 <String "Black">
	//  236  542:invokevirtual   #741 <Method void PrintWriter.print(String)>
		else
	//* 237  545:goto            243
			out.print("Medium");
	//  238  548:aload_0         
	//  239  549:getfield        #595 <Field PrintWriter out>
	//  240  552:ldc2            #847 <String "Medium">
	//  241  555:invokevirtual   #741 <Method void PrintWriter.print(String)>
		out.print("\nItalicAngle ");
		if(italic != 0 || s.toLowerCase().indexOf("italic") >= 0)
			out.print("-12.00");
		else
	//* 242  558:goto            243
			out.print("0");
	//  243  561:aload_0         
	//  244  562:getfield        #595 <Field PrintWriter out>
	//  245  565:ldc2            #849 <String "0">
	//  246  568:invokevirtual   #741 <Method void PrintWriter.print(String)>
		out.print("\nIsFixedPitch ");
		if((kind & 1) == 0 || avgwidth == maxwidth)
		{
			out.print("true");
			isMono = true;
		} else
	//* 247  571:goto            283
		{
			out.print("false");
	//  248  574:aload_0         
	//  249  575:getfield        #595 <Field PrintWriter out>
	//  250  578:ldc2            #851 <String "false">
	//  251  581:invokevirtual   #741 <Method void PrintWriter.print(String)>
			isMono = false;
	//  252  584:aload_0         
	//  253  585:iconst_0        
	//  254  586:putfield        #825 <Field boolean isMono>
		}
		out.print("\nFontBBox");
		if(isMono)
			outval(-20);
		else
	//* 255  589:goto            328
			outval(-100);
	//  256  592:aload_0         
	//  257  593:bipush          -100
	//  258  595:invokespecial   #745 <Method void outval(int)>
		outval(-(descender + 5));
		outval(maxwidth + 10);
		outval(ascent + 5);
		out.print("\nCapHeight");
		outval(((int) (capheight)));
		out.print("\nXHeight");
		outval(((int) (xheight)));
		out.print("\nDescender");
		outval(-descender);
		out.print("\nAscender");
		outval(((int) (ascender)));
		out.print('\n');
	//* 259  598:goto            351
	}

	private void putkerntab()
		throws IOException
	{
		if(kernpairs != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #707 <Field int kernpairs>
	//*   2    4:ifne            8
	//*   3    7:return          
		{
			in.seek(kernpairs);
	//    4    8:aload_0         
	//    5    9:getfield        #581 <Field RandomAccessFileOrArray in>
	//    6   12:aload_0         
	//    7   13:getfield        #707 <Field int kernpairs>
	//    8   16:i2l             
	//    9   17:invokevirtual   #624 <Method void RandomAccessFileOrArray.seek(long)>
			int i = in.readUnsignedShortLE();
	//   10   20:aload_0         
	//   11   21:getfield        #581 <Field RandomAccessFileOrArray in>
	//   12   24:invokevirtual   #759 <Method int RandomAccessFileOrArray.readUnsignedShortLE()>
	//   13   27:istore_1        
			int k = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
			int ai[] = new int[i * 3];
	//   16   30:iload_1         
	//   17   31:iconst_3        
	//   18   32:imul            
	//   19   33:newarray        int[]
	//   20   35:astore          5
			i = 0;
	//   21   37:iconst_0        
	//   22   38:istore_1        
			do
			{
				if(i >= ai.length)
					break;
	//   23   39:iload_1         
	//   24   40:aload           5
	//   25   42:arraylength     
	//   26   43:icmpge          110
				int i1 = i + 1;
	//   27   46:iload_1         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore          4
				ai[i] = in.read();
	//   31   51:aload           5
	//   32   53:iload_1         
	//   33   54:aload_0         
	//   34   55:getfield        #581 <Field RandomAccessFileOrArray in>
	//   35   58:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//   36   61:iastore         
				int l = i1 + 1;
	//   37   62:iload           4
	//   38   64:iconst_1        
	//   39   65:iadd            
	//   40   66:istore_3        
				ai[i1] = in.read();
	//   41   67:aload           5
	//   42   69:iload           4
	//   43   71:aload_0         
	//   44   72:getfield        #581 <Field RandomAccessFileOrArray in>
	//   45   75:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//   46   78:iastore         
				i = l + 1;
	//   47   79:iload_3         
	//   48   80:iconst_1        
	//   49   81:iadd            
	//   50   82:istore_1        
				i1 = ((int) (in.readShortLE()));
	//   51   83:aload_0         
	//   52   84:getfield        #581 <Field RandomAccessFileOrArray in>
	//   53   87:invokevirtual   #628 <Method short RandomAccessFileOrArray.readShortLE()>
	//   54   90:istore          4
				ai[l] = i1;
	//   55   92:aload           5
	//   56   94:iload_3         
	//   57   95:iload           4
	//   58   97:iastore         
				if(i1 != 0)
	//*  59   98:iload           4
	//*  60  100:ifeq            246
					k++;
	//   61  103:iload_2         
	//   62  104:iconst_1        
	//   63  105:iadd            
	//   64  106:istore_2        
			} while(true);
	//   65  107:goto            39
			if(k != 0)
	//*  66  110:iload_2         
	//*  67  111:ifeq            7
			{
				out.print("StartKernData\nStartKernPairs");
	//   68  114:aload_0         
	//   69  115:getfield        #595 <Field PrintWriter out>
	//   70  118:ldc2            #853 <String "StartKernData\nStartKernPairs">
	//   71  121:invokevirtual   #741 <Method void PrintWriter.print(String)>
				outval(k);
	//   72  124:aload_0         
	//   73  125:iload_2         
	//   74  126:invokespecial   #745 <Method void outval(int)>
				out.print('\n');
	//   75  129:aload_0         
	//   76  130:getfield        #595 <Field PrintWriter out>
	//   77  133:bipush          10
	//   78  135:invokevirtual   #754 <Method void PrintWriter.print(char)>
				for(int j = 0; j < ai.length; j += 3)
	//*  79  138:iconst_0        
	//*  80  139:istore_1        
	//*  81  140:iload_1         
	//*  82  141:aload           5
	//*  83  143:arraylength     
	//*  84  144:icmpge          235
					if(ai[j + 2] != 0)
	//*  85  147:aload           5
	//*  86  149:iload_1         
	//*  87  150:iconst_2        
	//*  88  151:iadd            
	//*  89  152:iaload          
	//*  90  153:ifeq            228
					{
						out.print("KPX ");
	//   91  156:aload_0         
	//   92  157:getfield        #595 <Field PrintWriter out>
	//   93  160:ldc2            #855 <String "KPX ">
	//   94  163:invokevirtual   #741 <Method void PrintWriter.print(String)>
						out.print(WinChars[ai[j]]);
	//   95  166:aload_0         
	//   96  167:getfield        #595 <Field PrintWriter out>
	//   97  170:aload_0         
	//   98  171:getfield        #579 <Field String[] WinChars>
	//   99  174:aload           5
	//  100  176:iload_1         
	//  101  177:iaload          
	//  102  178:aaload          
	//  103  179:invokevirtual   #741 <Method void PrintWriter.print(String)>
						out.print(' ');
	//  104  182:aload_0         
	//  105  183:getfield        #595 <Field PrintWriter out>
	//  106  186:bipush          32
	//  107  188:invokevirtual   #754 <Method void PrintWriter.print(char)>
						out.print(WinChars[ai[j + 1]]);
	//  108  191:aload_0         
	//  109  192:getfield        #595 <Field PrintWriter out>
	//  110  195:aload_0         
	//  111  196:getfield        #579 <Field String[] WinChars>
	//  112  199:aload           5
	//  113  201:iload_1         
	//  114  202:iconst_1        
	//  115  203:iadd            
	//  116  204:iaload          
	//  117  205:aaload          
	//  118  206:invokevirtual   #741 <Method void PrintWriter.print(String)>
						outval(ai[j + 2]);
	//  119  209:aload_0         
	//  120  210:aload           5
	//  121  212:iload_1         
	//  122  213:iconst_2        
	//  123  214:iadd            
	//  124  215:iaload          
	//  125  216:invokespecial   #745 <Method void outval(int)>
						out.print('\n');
	//  126  219:aload_0         
	//  127  220:getfield        #595 <Field PrintWriter out>
	//  128  223:bipush          10
	//  129  225:invokevirtual   #754 <Method void PrintWriter.print(char)>
					}

	//  130  228:iload_1         
	//  131  229:iconst_3        
	//  132  230:iadd            
	//  133  231:istore_1        
	//* 134  232:goto            140
				out.print("EndKernPairs\nEndKernData\n");
	//  135  235:aload_0         
	//  136  236:getfield        #595 <Field PrintWriter out>
	//  137  239:ldc2            #857 <String "EndKernPairs\nEndKernData\n">
	//  138  242:invokevirtual   #741 <Method void PrintWriter.print(String)>
				return;
	//  139  245:return          
			}
		}
	//* 140  246:goto            39
	}

	private void puttrailer()
	{
		out.print("EndFontMetrics\n");
	//    0    0:aload_0         
	//    1    1:getfield        #595 <Field PrintWriter out>
	//    2    4:ldc2            #859 <String "EndFontMetrics\n">
	//    3    7:invokevirtual   #741 <Method void PrintWriter.print(String)>
	//    4   10:return          
	}

	private String readString()
		throws IOException
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #861 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #862 <Method void StringBuffer()>
	//    3    7:astore_2        
		do
		{
			int i = in.read();
	//    4    8:aload_0         
	//    5    9:getfield        #581 <Field RandomAccessFileOrArray in>
	//    6   12:invokevirtual   #659 <Method int RandomAccessFileOrArray.read()>
	//    7   15:istore_1        
			if(i <= 0)
	//*   8   16:iload_1         
	//*   9   17:ifgt            25
				return stringbuffer.toString();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #863 <Method String StringBuffer.toString()>
	//   12   24:areturn         
			stringbuffer.append((char)i);
	//   13   25:aload_2         
	//   14   26:iload_1         
	//   15   27:int2char        
	//   16   28:invokevirtual   #866 <Method StringBuffer StringBuffer.append(char)>
	//   17   31:pop             
		} while(true);
	//   18   32:goto            8
	}

	private String readString(int i)
		throws IOException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		in.readFully(abyte0);
	//    3    4:aload_0         
	//    4    5:getfield        #581 <Field RandomAccessFileOrArray in>
	//    5    8:aload_2         
	//    6    9:invokevirtual   #870 <Method void RandomAccessFileOrArray.readFully(byte[])>
		i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_1        
		do
		{
			if(i >= abyte0.length || abyte0[i] == 0)
	//*   9   14:iload_1         
	//*  10   15:aload_2         
	//*  11   16:arraylength     
	//*  12   17:icmpge          26
	//*  13   20:aload_2         
	//*  14   21:iload_1         
	//*  15   22:baload          
	//*  16   23:ifne            40
				return new String(abyte0, 0, i, "ISO-8859-1");
	//   17   26:new             #72  <Class String>
	//   18   29:dup             
	//   19   30:aload_2         
	//   20   31:iconst_0        
	//   21   32:iload_1         
	//   22   33:ldc2            #587 <String "ISO-8859-1">
	//   23   36:invokespecial   #873 <Method void String(byte[], int, int, String)>
	//   24   39:areturn         
			i++;
	//   25   40:iload_1         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_1        
		} while(true);
	//   29   44:goto            14
	}

	private int Win2PSStd[] = {
		0, 0, 0, 0, 197, 198, 199, 0, 202, 0, 
		205, 206, 207, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 32, 33, 34, 35, 36, 37, 38, 169, 
		40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 
		50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 
		60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 
		70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 
		80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 
		90, 91, 92, 93, 94, 95, 193, 97, 98, 99, 
		100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 
		110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 
		120, 121, 122, 123, 124, 125, 126, 127, 128, 0, 
		184, 166, 185, 188, 178, 179, 195, 189, 0, 172, 
		234, 0, 0, 0, 0, 96, 0, 170, 186, 183, 
		177, 208, 196, 0, 0, 173, 250, 0, 0, 0, 
		0, 161, 162, 163, 168, 165, 0, 167, 200, 0, 
		227, 171, 0, 0, 0, 197, 0, 0, 0, 0, 
		194, 0, 182, 180, 203, 0, 235, 187, 0, 0, 
		0, 191, 0, 0, 0, 0, 0, 0, 225, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 233, 0, 0, 0, 
		0, 0, 0, 251, 0, 0, 0, 0, 0, 0, 
		241, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 249, 0, 
		0, 0, 0, 0, 0, 0
	};
	private String WinChars[] = {
		"W00", "W01", "W02", "W03", "macron", "breve", "dotaccent", "W07", "ring", "W09", 
		"W0a", "W0b", "W0c", "W0d", "W0e", "W0f", "hungarumlaut", "ogonek", "caron", "W13", 
		"W14", "W15", "W16", "W17", "W18", "W19", "W1a", "W1b", "W1c", "W1d", 
		"W1e", "W1f", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quotesingle", 
		"parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", 
		"two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", 
		"less", "equal", "greater", "question", "at", "A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
		"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "grave", "a", "b", "c", 
		"d", "e", "f", "g", "h", "i", "j", "k", "l", "m", 
		"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", 
		"x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "W7f", "euro", "W81", 
		"quotesinglbase", "florin", "quotedblbase", "ellipsis", "dagger", "daggerdbl", "circumflex", "perthousand", "Scaron", "guilsinglleft", 
		"OE", "W8d", "Zcaron", "W8f", "W90", "quoteleft", "quoteright", "quotedblleft", "quotedblright", "bullet", 
		"endash", "emdash", "tilde", "trademark", "scaron", "guilsinglright", "oe", "W9d", "zcaron", "Ydieresis", 
		"reqspace", "exclamdown", "cent", "sterling", "currency", "yen", "brokenbar", "section", "dieresis", "copyright", 
		"ordfeminine", "guillemotleft", "logicalnot", "syllable", "registered", "macron", "degree", "plusminus", "twosuperior", "threesuperior", 
		"acute", "mu", "paragraph", "periodcentered", "cedilla", "onesuperior", "ordmasculine", "guillemotright", "onequarter", "onehalf", 
		"threequarters", "questiondown", "Agrave", "Aacute", "Acircumflex", "Atilde", "Adieresis", "Aring", "AE", "Ccedilla", 
		"Egrave", "Eacute", "Ecircumflex", "Edieresis", "Igrave", "Iacute", "Icircumflex", "Idieresis", "Eth", "Ntilde", 
		"Ograve", "Oacute", "Ocircumflex", "Otilde", "Odieresis", "multiply", "Oslash", "Ugrave", "Uacute", "Ucircumflex", 
		"Udieresis", "Yacute", "Thorn", "germandbls", "agrave", "aacute", "acircumflex", "atilde", "adieresis", "aring", 
		"ae", "ccedilla", "egrave", "eacute", "ecircumflex", "edieresis", "igrave", "iacute", "icircumflex", "idieresis", 
		"eth", "ntilde", "ograve", "oacute", "ocircumflex", "otilde", "odieresis", "divide", "oslash", "ugrave", 
		"uacute", "ucircumflex", "udieresis", "yacute", "thorn", "ydieresis"
	};
	private int WinClass[] = {
		0, 0, 0, 0, 2, 2, 2, 0, 2, 0, 
		2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 2, 0, 0, 
		2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 0, 0, 0, 0, 3, 3, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1
	};
	private short ascender;
	private short ascent;
	private short avgwidth;
	private int bitoff;
	private int bits;
	private byte brkchar;
	private short capheight;
	private byte charset;
	private int chartab;
	private String copyright;
	private byte defchar;
	private short descender;
	private int device;
	private short extleading;
	private short extlen;
	private int face;
	private int firstchar;
	private int fontname;
	private int h_len;
	private short horres;
	private RandomAccessFileOrArray in;
	private short intleading;
	private boolean isMono;
	private byte italic;
	private int kernpairs;
	private byte kind;
	private int lastchar;
	private short maxwidth;
	private PrintWriter out;
	private byte overs;
	private short pixheight;
	private short pixwidth;
	private short points;
	private int psext;
	private int res1;
	private int res2;
	private short type;
	private byte uline;
	private short verres;
	private short vers;
	private short weight;
	private short widthby;
	private short xheight;
}
