// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.pdf.ByteBuffer;

public class CCITTG4Encoder
{

	public CCITTG4Encoder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		bit = 8;
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:putfield        #60  <Field int bit>
		outBuf = new ByteBuffer(1024);
	//    5   10:aload_0         
	//    6   11:new             #62  <Class ByteBuffer>
	//    7   14:dup             
	//    8   15:sipush          1024
	//    9   18:invokespecial   #64  <Method void ByteBuffer(int)>
	//   10   21:putfield        #66  <Field ByteBuffer outBuf>
		int ai[] = {
			8, 53, 0
		};
	//   11   24:iconst_3        
	//   12   25:newarray        int[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:bipush          8
	//   16   31:iastore         
	//   17   32:dup             
	//   18   33:iconst_1        
	//   19   34:bipush          53
	//   20   36:iastore         
	//   21   37:dup             
	//   22   38:iconst_2        
	//   23   39:iconst_0        
	//   24   40:iastore         
	//   25   41:astore_2        
		int ai1[] = {
			6, 7, 1
		};
	//   26   42:iconst_3        
	//   27   43:newarray        int[]
	//   28   45:dup             
	//   29   46:iconst_0        
	//   30   47:bipush          6
	//   31   49:iastore         
	//   32   50:dup             
	//   33   51:iconst_1        
	//   34   52:bipush          7
	//   35   54:iastore         
	//   36   55:dup             
	//   37   56:iconst_2        
	//   38   57:iconst_1        
	//   39   58:iastore         
	//   40   59:astore_3        
		int ai2[] = {
			4, 7, 2
		};
	//   41   60:iconst_3        
	//   42   61:newarray        int[]
	//   43   63:dup             
	//   44   64:iconst_0        
	//   45   65:iconst_4        
	//   46   66:iastore         
	//   47   67:dup             
	//   48   68:iconst_1        
	//   49   69:bipush          7
	//   50   71:iastore         
	//   51   72:dup             
	//   52   73:iconst_2        
	//   53   74:iconst_2        
	//   54   75:iastore         
	//   55   76:astore          4
		int ai3[] = {
			4, 8, 3
		};
	//   56   78:iconst_3        
	//   57   79:newarray        int[]
	//   58   81:dup             
	//   59   82:iconst_0        
	//   60   83:iconst_4        
	//   61   84:iastore         
	//   62   85:dup             
	//   63   86:iconst_1        
	//   64   87:bipush          8
	//   65   89:iastore         
	//   66   90:dup             
	//   67   91:iconst_2        
	//   68   92:iconst_3        
	//   69   93:iastore         
	//   70   94:astore          5
		int ai4[] = {
			4, 11, 4
		};
	//   71   96:iconst_3        
	//   72   97:newarray        int[]
	//   73   99:dup             
	//   74  100:iconst_0        
	//   75  101:iconst_4        
	//   76  102:iastore         
	//   77  103:dup             
	//   78  104:iconst_1        
	//   79  105:bipush          11
	//   80  107:iastore         
	//   81  108:dup             
	//   82  109:iconst_2        
	//   83  110:iconst_4        
	//   84  111:iastore         
	//   85  112:astore          6
		int ai5[] = {
			4, 12, 5
		};
	//   86  114:iconst_3        
	//   87  115:newarray        int[]
	//   88  117:dup             
	//   89  118:iconst_0        
	//   90  119:iconst_4        
	//   91  120:iastore         
	//   92  121:dup             
	//   93  122:iconst_1        
	//   94  123:bipush          12
	//   95  125:iastore         
	//   96  126:dup             
	//   97  127:iconst_2        
	//   98  128:iconst_5        
	//   99  129:iastore         
	//  100  130:astore          7
		int ai6[] = {
			4, 14, 6
		};
	//  101  132:iconst_3        
	//  102  133:newarray        int[]
	//  103  135:dup             
	//  104  136:iconst_0        
	//  105  137:iconst_4        
	//  106  138:iastore         
	//  107  139:dup             
	//  108  140:iconst_1        
	//  109  141:bipush          14
	//  110  143:iastore         
	//  111  144:dup             
	//  112  145:iconst_2        
	//  113  146:bipush          6
	//  114  148:iastore         
	//  115  149:astore          8
		int ai7[] = {
			5, 20, 9
		};
	//  116  151:iconst_3        
	//  117  152:newarray        int[]
	//  118  154:dup             
	//  119  155:iconst_0        
	//  120  156:iconst_5        
	//  121  157:iastore         
	//  122  158:dup             
	//  123  159:iconst_1        
	//  124  160:bipush          20
	//  125  162:iastore         
	//  126  163:dup             
	//  127  164:iconst_2        
	//  128  165:bipush          9
	//  129  167:iastore         
	//  130  168:astore          9
		int ai8[] = {
			5, 7, 10
		};
	//  131  170:iconst_3        
	//  132  171:newarray        int[]
	//  133  173:dup             
	//  134  174:iconst_0        
	//  135  175:iconst_5        
	//  136  176:iastore         
	//  137  177:dup             
	//  138  178:iconst_1        
	//  139  179:bipush          7
	//  140  181:iastore         
	//  141  182:dup             
	//  142  183:iconst_2        
	//  143  184:bipush          10
	//  144  186:iastore         
	//  145  187:astore          10
		int ai9[] = {
			5, 8, 11
		};
	//  146  189:iconst_3        
	//  147  190:newarray        int[]
	//  148  192:dup             
	//  149  193:iconst_0        
	//  150  194:iconst_5        
	//  151  195:iastore         
	//  152  196:dup             
	//  153  197:iconst_1        
	//  154  198:bipush          8
	//  155  200:iastore         
	//  156  201:dup             
	//  157  202:iconst_2        
	//  158  203:bipush          11
	//  159  205:iastore         
	//  160  206:astore          11
		int ai10[] = {
			6, 3, 13
		};
	//  161  208:iconst_3        
	//  162  209:newarray        int[]
	//  163  211:dup             
	//  164  212:iconst_0        
	//  165  213:bipush          6
	//  166  215:iastore         
	//  167  216:dup             
	//  168  217:iconst_1        
	//  169  218:iconst_3        
	//  170  219:iastore         
	//  171  220:dup             
	//  172  221:iconst_2        
	//  173  222:bipush          13
	//  174  224:iastore         
	//  175  225:astore          12
		int ai11[] = {
			6, 52, 14
		};
	//  176  227:iconst_3        
	//  177  228:newarray        int[]
	//  178  230:dup             
	//  179  231:iconst_0        
	//  180  232:bipush          6
	//  181  234:iastore         
	//  182  235:dup             
	//  183  236:iconst_1        
	//  184  237:bipush          52
	//  185  239:iastore         
	//  186  240:dup             
	//  187  241:iconst_2        
	//  188  242:bipush          14
	//  189  244:iastore         
	//  190  245:astore          13
		int ai12[] = {
			6, 53, 15
		};
	//  191  247:iconst_3        
	//  192  248:newarray        int[]
	//  193  250:dup             
	//  194  251:iconst_0        
	//  195  252:bipush          6
	//  196  254:iastore         
	//  197  255:dup             
	//  198  256:iconst_1        
	//  199  257:bipush          53
	//  200  259:iastore         
	//  201  260:dup             
	//  202  261:iconst_2        
	//  203  262:bipush          15
	//  204  264:iastore         
	//  205  265:astore          14
		int ai13[] = {
			6, 42, 16
		};
	//  206  267:iconst_3        
	//  207  268:newarray        int[]
	//  208  270:dup             
	//  209  271:iconst_0        
	//  210  272:bipush          6
	//  211  274:iastore         
	//  212  275:dup             
	//  213  276:iconst_1        
	//  214  277:bipush          42
	//  215  279:iastore         
	//  216  280:dup             
	//  217  281:iconst_2        
	//  218  282:bipush          16
	//  219  284:iastore         
	//  220  285:astore          15
		int ai14[] = {
			6, 43, 17
		};
	//  221  287:iconst_3        
	//  222  288:newarray        int[]
	//  223  290:dup             
	//  224  291:iconst_0        
	//  225  292:bipush          6
	//  226  294:iastore         
	//  227  295:dup             
	//  228  296:iconst_1        
	//  229  297:bipush          43
	//  230  299:iastore         
	//  231  300:dup             
	//  232  301:iconst_2        
	//  233  302:bipush          17
	//  234  304:iastore         
	//  235  305:astore          16
		int ai15[] = {
			7, 39, 18
		};
	//  236  307:iconst_3        
	//  237  308:newarray        int[]
	//  238  310:dup             
	//  239  311:iconst_0        
	//  240  312:bipush          7
	//  241  314:iastore         
	//  242  315:dup             
	//  243  316:iconst_1        
	//  244  317:bipush          39
	//  245  319:iastore         
	//  246  320:dup             
	//  247  321:iconst_2        
	//  248  322:bipush          18
	//  249  324:iastore         
	//  250  325:astore          17
		int ai16[] = {
			7, 12, 19
		};
	//  251  327:iconst_3        
	//  252  328:newarray        int[]
	//  253  330:dup             
	//  254  331:iconst_0        
	//  255  332:bipush          7
	//  256  334:iastore         
	//  257  335:dup             
	//  258  336:iconst_1        
	//  259  337:bipush          12
	//  260  339:iastore         
	//  261  340:dup             
	//  262  341:iconst_2        
	//  263  342:bipush          19
	//  264  344:iastore         
	//  265  345:astore          18
		int ai17[] = {
			7, 8, 20
		};
	//  266  347:iconst_3        
	//  267  348:newarray        int[]
	//  268  350:dup             
	//  269  351:iconst_0        
	//  270  352:bipush          7
	//  271  354:iastore         
	//  272  355:dup             
	//  273  356:iconst_1        
	//  274  357:bipush          8
	//  275  359:iastore         
	//  276  360:dup             
	//  277  361:iconst_2        
	//  278  362:bipush          20
	//  279  364:iastore         
	//  280  365:astore          19
		int ai18[] = {
			7, 3, 22
		};
	//  281  367:iconst_3        
	//  282  368:newarray        int[]
	//  283  370:dup             
	//  284  371:iconst_0        
	//  285  372:bipush          7
	//  286  374:iastore         
	//  287  375:dup             
	//  288  376:iconst_1        
	//  289  377:iconst_3        
	//  290  378:iastore         
	//  291  379:dup             
	//  292  380:iconst_2        
	//  293  381:bipush          22
	//  294  383:iastore         
	//  295  384:astore          20
		int ai19[] = {
			7, 4, 23
		};
	//  296  386:iconst_3        
	//  297  387:newarray        int[]
	//  298  389:dup             
	//  299  390:iconst_0        
	//  300  391:bipush          7
	//  301  393:iastore         
	//  302  394:dup             
	//  303  395:iconst_1        
	//  304  396:iconst_4        
	//  305  397:iastore         
	//  306  398:dup             
	//  307  399:iconst_2        
	//  308  400:bipush          23
	//  309  402:iastore         
	//  310  403:astore          21
		int ai20[] = {
			7, 40, 24
		};
	//  311  405:iconst_3        
	//  312  406:newarray        int[]
	//  313  408:dup             
	//  314  409:iconst_0        
	//  315  410:bipush          7
	//  316  412:iastore         
	//  317  413:dup             
	//  318  414:iconst_1        
	//  319  415:bipush          40
	//  320  417:iastore         
	//  321  418:dup             
	//  322  419:iconst_2        
	//  323  420:bipush          24
	//  324  422:iastore         
	//  325  423:astore          22
		int ai21[] = {
			7, 43, 25
		};
	//  326  425:iconst_3        
	//  327  426:newarray        int[]
	//  328  428:dup             
	//  329  429:iconst_0        
	//  330  430:bipush          7
	//  331  432:iastore         
	//  332  433:dup             
	//  333  434:iconst_1        
	//  334  435:bipush          43
	//  335  437:iastore         
	//  336  438:dup             
	//  337  439:iconst_2        
	//  338  440:bipush          25
	//  339  442:iastore         
	//  340  443:astore          23
		int ai22[] = {
			7, 19, 26
		};
	//  341  445:iconst_3        
	//  342  446:newarray        int[]
	//  343  448:dup             
	//  344  449:iconst_0        
	//  345  450:bipush          7
	//  346  452:iastore         
	//  347  453:dup             
	//  348  454:iconst_1        
	//  349  455:bipush          19
	//  350  457:iastore         
	//  351  458:dup             
	//  352  459:iconst_2        
	//  353  460:bipush          26
	//  354  462:iastore         
	//  355  463:astore          24
		int ai23[] = {
			7, 36, 27
		};
	//  356  465:iconst_3        
	//  357  466:newarray        int[]
	//  358  468:dup             
	//  359  469:iconst_0        
	//  360  470:bipush          7
	//  361  472:iastore         
	//  362  473:dup             
	//  363  474:iconst_1        
	//  364  475:bipush          36
	//  365  477:iastore         
	//  366  478:dup             
	//  367  479:iconst_2        
	//  368  480:bipush          27
	//  369  482:iastore         
	//  370  483:astore          25
		int ai24[] = {
			7, 24, 28
		};
	//  371  485:iconst_3        
	//  372  486:newarray        int[]
	//  373  488:dup             
	//  374  489:iconst_0        
	//  375  490:bipush          7
	//  376  492:iastore         
	//  377  493:dup             
	//  378  494:iconst_1        
	//  379  495:bipush          24
	//  380  497:iastore         
	//  381  498:dup             
	//  382  499:iconst_2        
	//  383  500:bipush          28
	//  384  502:iastore         
	//  385  503:astore          26
		int ai25[] = {
			8, 3, 30
		};
	//  386  505:iconst_3        
	//  387  506:newarray        int[]
	//  388  508:dup             
	//  389  509:iconst_0        
	//  390  510:bipush          8
	//  391  512:iastore         
	//  392  513:dup             
	//  393  514:iconst_1        
	//  394  515:iconst_3        
	//  395  516:iastore         
	//  396  517:dup             
	//  397  518:iconst_2        
	//  398  519:bipush          30
	//  399  521:iastore         
	//  400  522:astore          27
		int ai26[] = {
			8, 26, 31
		};
	//  401  524:iconst_3        
	//  402  525:newarray        int[]
	//  403  527:dup             
	//  404  528:iconst_0        
	//  405  529:bipush          8
	//  406  531:iastore         
	//  407  532:dup             
	//  408  533:iconst_1        
	//  409  534:bipush          26
	//  410  536:iastore         
	//  411  537:dup             
	//  412  538:iconst_2        
	//  413  539:bipush          31
	//  414  541:iastore         
	//  415  542:astore          28
		int ai27[] = {
			8, 27, 32
		};
	//  416  544:iconst_3        
	//  417  545:newarray        int[]
	//  418  547:dup             
	//  419  548:iconst_0        
	//  420  549:bipush          8
	//  421  551:iastore         
	//  422  552:dup             
	//  423  553:iconst_1        
	//  424  554:bipush          27
	//  425  556:iastore         
	//  426  557:dup             
	//  427  558:iconst_2        
	//  428  559:bipush          32
	//  429  561:iastore         
	//  430  562:astore          29
		int ai28[] = {
			8, 18, 33
		};
	//  431  564:iconst_3        
	//  432  565:newarray        int[]
	//  433  567:dup             
	//  434  568:iconst_0        
	//  435  569:bipush          8
	//  436  571:iastore         
	//  437  572:dup             
	//  438  573:iconst_1        
	//  439  574:bipush          18
	//  440  576:iastore         
	//  441  577:dup             
	//  442  578:iconst_2        
	//  443  579:bipush          33
	//  444  581:iastore         
	//  445  582:astore          30
		int ai29[] = {
			8, 19, 34
		};
	//  446  584:iconst_3        
	//  447  585:newarray        int[]
	//  448  587:dup             
	//  449  588:iconst_0        
	//  450  589:bipush          8
	//  451  591:iastore         
	//  452  592:dup             
	//  453  593:iconst_1        
	//  454  594:bipush          19
	//  455  596:iastore         
	//  456  597:dup             
	//  457  598:iconst_2        
	//  458  599:bipush          34
	//  459  601:iastore         
	//  460  602:astore          31
		int ai30[] = {
			8, 20, 35
		};
	//  461  604:iconst_3        
	//  462  605:newarray        int[]
	//  463  607:dup             
	//  464  608:iconst_0        
	//  465  609:bipush          8
	//  466  611:iastore         
	//  467  612:dup             
	//  468  613:iconst_1        
	//  469  614:bipush          20
	//  470  616:iastore         
	//  471  617:dup             
	//  472  618:iconst_2        
	//  473  619:bipush          35
	//  474  621:iastore         
	//  475  622:astore          32
		int ai31[] = {
			8, 21, 36
		};
	//  476  624:iconst_3        
	//  477  625:newarray        int[]
	//  478  627:dup             
	//  479  628:iconst_0        
	//  480  629:bipush          8
	//  481  631:iastore         
	//  482  632:dup             
	//  483  633:iconst_1        
	//  484  634:bipush          21
	//  485  636:iastore         
	//  486  637:dup             
	//  487  638:iconst_2        
	//  488  639:bipush          36
	//  489  641:iastore         
	//  490  642:astore          33
		int ai32[] = {
			8, 22, 37
		};
	//  491  644:iconst_3        
	//  492  645:newarray        int[]
	//  493  647:dup             
	//  494  648:iconst_0        
	//  495  649:bipush          8
	//  496  651:iastore         
	//  497  652:dup             
	//  498  653:iconst_1        
	//  499  654:bipush          22
	//  500  656:iastore         
	//  501  657:dup             
	//  502  658:iconst_2        
	//  503  659:bipush          37
	//  504  661:iastore         
	//  505  662:astore          34
		int ai33[] = {
			8, 23, 38
		};
	//  506  664:iconst_3        
	//  507  665:newarray        int[]
	//  508  667:dup             
	//  509  668:iconst_0        
	//  510  669:bipush          8
	//  511  671:iastore         
	//  512  672:dup             
	//  513  673:iconst_1        
	//  514  674:bipush          23
	//  515  676:iastore         
	//  516  677:dup             
	//  517  678:iconst_2        
	//  518  679:bipush          38
	//  519  681:iastore         
	//  520  682:astore          35
		int ai34[] = {
			8, 40, 39
		};
	//  521  684:iconst_3        
	//  522  685:newarray        int[]
	//  523  687:dup             
	//  524  688:iconst_0        
	//  525  689:bipush          8
	//  526  691:iastore         
	//  527  692:dup             
	//  528  693:iconst_1        
	//  529  694:bipush          40
	//  530  696:iastore         
	//  531  697:dup             
	//  532  698:iconst_2        
	//  533  699:bipush          39
	//  534  701:iastore         
	//  535  702:astore          36
		int ai35[] = {
			8, 41, 40
		};
	//  536  704:iconst_3        
	//  537  705:newarray        int[]
	//  538  707:dup             
	//  539  708:iconst_0        
	//  540  709:bipush          8
	//  541  711:iastore         
	//  542  712:dup             
	//  543  713:iconst_1        
	//  544  714:bipush          41
	//  545  716:iastore         
	//  546  717:dup             
	//  547  718:iconst_2        
	//  548  719:bipush          40
	//  549  721:iastore         
	//  550  722:astore          37
		int ai36[] = {
			8, 42, 41
		};
	//  551  724:iconst_3        
	//  552  725:newarray        int[]
	//  553  727:dup             
	//  554  728:iconst_0        
	//  555  729:bipush          8
	//  556  731:iastore         
	//  557  732:dup             
	//  558  733:iconst_1        
	//  559  734:bipush          42
	//  560  736:iastore         
	//  561  737:dup             
	//  562  738:iconst_2        
	//  563  739:bipush          41
	//  564  741:iastore         
	//  565  742:astore          38
		int ai37[] = {
			8, 43, 42
		};
	//  566  744:iconst_3        
	//  567  745:newarray        int[]
	//  568  747:dup             
	//  569  748:iconst_0        
	//  570  749:bipush          8
	//  571  751:iastore         
	//  572  752:dup             
	//  573  753:iconst_1        
	//  574  754:bipush          43
	//  575  756:iastore         
	//  576  757:dup             
	//  577  758:iconst_2        
	//  578  759:bipush          42
	//  579  761:iastore         
	//  580  762:astore          39
		int ai38[] = {
			8, 44, 43
		};
	//  581  764:iconst_3        
	//  582  765:newarray        int[]
	//  583  767:dup             
	//  584  768:iconst_0        
	//  585  769:bipush          8
	//  586  771:iastore         
	//  587  772:dup             
	//  588  773:iconst_1        
	//  589  774:bipush          44
	//  590  776:iastore         
	//  591  777:dup             
	//  592  778:iconst_2        
	//  593  779:bipush          43
	//  594  781:iastore         
	//  595  782:astore          40
		int ai39[] = {
			8, 4, 45
		};
	//  596  784:iconst_3        
	//  597  785:newarray        int[]
	//  598  787:dup             
	//  599  788:iconst_0        
	//  600  789:bipush          8
	//  601  791:iastore         
	//  602  792:dup             
	//  603  793:iconst_1        
	//  604  794:iconst_4        
	//  605  795:iastore         
	//  606  796:dup             
	//  607  797:iconst_2        
	//  608  798:bipush          45
	//  609  800:iastore         
	//  610  801:astore          41
		int ai40[] = {
			8, 5, 46
		};
	//  611  803:iconst_3        
	//  612  804:newarray        int[]
	//  613  806:dup             
	//  614  807:iconst_0        
	//  615  808:bipush          8
	//  616  810:iastore         
	//  617  811:dup             
	//  618  812:iconst_1        
	//  619  813:iconst_5        
	//  620  814:iastore         
	//  621  815:dup             
	//  622  816:iconst_2        
	//  623  817:bipush          46
	//  624  819:iastore         
	//  625  820:astore          42
		int ai41[] = {
			8, 10, 47
		};
	//  626  822:iconst_3        
	//  627  823:newarray        int[]
	//  628  825:dup             
	//  629  826:iconst_0        
	//  630  827:bipush          8
	//  631  829:iastore         
	//  632  830:dup             
	//  633  831:iconst_1        
	//  634  832:bipush          10
	//  635  834:iastore         
	//  636  835:dup             
	//  637  836:iconst_2        
	//  638  837:bipush          47
	//  639  839:iastore         
	//  640  840:astore          43
		int ai42[] = {
			8, 11, 48
		};
	//  641  842:iconst_3        
	//  642  843:newarray        int[]
	//  643  845:dup             
	//  644  846:iconst_0        
	//  645  847:bipush          8
	//  646  849:iastore         
	//  647  850:dup             
	//  648  851:iconst_1        
	//  649  852:bipush          11
	//  650  854:iastore         
	//  651  855:dup             
	//  652  856:iconst_2        
	//  653  857:bipush          48
	//  654  859:iastore         
	//  655  860:astore          44
		int ai43[] = {
			8, 82, 49
		};
	//  656  862:iconst_3        
	//  657  863:newarray        int[]
	//  658  865:dup             
	//  659  866:iconst_0        
	//  660  867:bipush          8
	//  661  869:iastore         
	//  662  870:dup             
	//  663  871:iconst_1        
	//  664  872:bipush          82
	//  665  874:iastore         
	//  666  875:dup             
	//  667  876:iconst_2        
	//  668  877:bipush          49
	//  669  879:iastore         
	//  670  880:astore          45
		int ai44[] = {
			8, 83, 50
		};
	//  671  882:iconst_3        
	//  672  883:newarray        int[]
	//  673  885:dup             
	//  674  886:iconst_0        
	//  675  887:bipush          8
	//  676  889:iastore         
	//  677  890:dup             
	//  678  891:iconst_1        
	//  679  892:bipush          83
	//  680  894:iastore         
	//  681  895:dup             
	//  682  896:iconst_2        
	//  683  897:bipush          50
	//  684  899:iastore         
	//  685  900:astore          46
		int ai45[] = {
			8, 84, 51
		};
	//  686  902:iconst_3        
	//  687  903:newarray        int[]
	//  688  905:dup             
	//  689  906:iconst_0        
	//  690  907:bipush          8
	//  691  909:iastore         
	//  692  910:dup             
	//  693  911:iconst_1        
	//  694  912:bipush          84
	//  695  914:iastore         
	//  696  915:dup             
	//  697  916:iconst_2        
	//  698  917:bipush          51
	//  699  919:iastore         
	//  700  920:astore          47
		int ai46[] = {
			8, 85, 52
		};
	//  701  922:iconst_3        
	//  702  923:newarray        int[]
	//  703  925:dup             
	//  704  926:iconst_0        
	//  705  927:bipush          8
	//  706  929:iastore         
	//  707  930:dup             
	//  708  931:iconst_1        
	//  709  932:bipush          85
	//  710  934:iastore         
	//  711  935:dup             
	//  712  936:iconst_2        
	//  713  937:bipush          52
	//  714  939:iastore         
	//  715  940:astore          48
		int ai47[] = {
			8, 36, 53
		};
	//  716  942:iconst_3        
	//  717  943:newarray        int[]
	//  718  945:dup             
	//  719  946:iconst_0        
	//  720  947:bipush          8
	//  721  949:iastore         
	//  722  950:dup             
	//  723  951:iconst_1        
	//  724  952:bipush          36
	//  725  954:iastore         
	//  726  955:dup             
	//  727  956:iconst_2        
	//  728  957:bipush          53
	//  729  959:iastore         
	//  730  960:astore          49
		int ai48[] = {
			8, 37, 54
		};
	//  731  962:iconst_3        
	//  732  963:newarray        int[]
	//  733  965:dup             
	//  734  966:iconst_0        
	//  735  967:bipush          8
	//  736  969:iastore         
	//  737  970:dup             
	//  738  971:iconst_1        
	//  739  972:bipush          37
	//  740  974:iastore         
	//  741  975:dup             
	//  742  976:iconst_2        
	//  743  977:bipush          54
	//  744  979:iastore         
	//  745  980:astore          50
		int ai49[] = {
			8, 88, 55
		};
	//  746  982:iconst_3        
	//  747  983:newarray        int[]
	//  748  985:dup             
	//  749  986:iconst_0        
	//  750  987:bipush          8
	//  751  989:iastore         
	//  752  990:dup             
	//  753  991:iconst_1        
	//  754  992:bipush          88
	//  755  994:iastore         
	//  756  995:dup             
	//  757  996:iconst_2        
	//  758  997:bipush          55
	//  759  999:iastore         
	//  760 1000:astore          51
		int ai50[] = {
			8, 89, 56
		};
	//  761 1002:iconst_3        
	//  762 1003:newarray        int[]
	//  763 1005:dup             
	//  764 1006:iconst_0        
	//  765 1007:bipush          8
	//  766 1009:iastore         
	//  767 1010:dup             
	//  768 1011:iconst_1        
	//  769 1012:bipush          89
	//  770 1014:iastore         
	//  771 1015:dup             
	//  772 1016:iconst_2        
	//  773 1017:bipush          56
	//  774 1019:iastore         
	//  775 1020:astore          52
		int ai51[] = {
			8, 90, 57
		};
	//  776 1022:iconst_3        
	//  777 1023:newarray        int[]
	//  778 1025:dup             
	//  779 1026:iconst_0        
	//  780 1027:bipush          8
	//  781 1029:iastore         
	//  782 1030:dup             
	//  783 1031:iconst_1        
	//  784 1032:bipush          90
	//  785 1034:iastore         
	//  786 1035:dup             
	//  787 1036:iconst_2        
	//  788 1037:bipush          57
	//  789 1039:iastore         
	//  790 1040:astore          53
		int ai52[] = {
			8, 91, 58
		};
	//  791 1042:iconst_3        
	//  792 1043:newarray        int[]
	//  793 1045:dup             
	//  794 1046:iconst_0        
	//  795 1047:bipush          8
	//  796 1049:iastore         
	//  797 1050:dup             
	//  798 1051:iconst_1        
	//  799 1052:bipush          91
	//  800 1054:iastore         
	//  801 1055:dup             
	//  802 1056:iconst_2        
	//  803 1057:bipush          58
	//  804 1059:iastore         
	//  805 1060:astore          54
		int ai53[] = {
			8, 74, 59
		};
	//  806 1062:iconst_3        
	//  807 1063:newarray        int[]
	//  808 1065:dup             
	//  809 1066:iconst_0        
	//  810 1067:bipush          8
	//  811 1069:iastore         
	//  812 1070:dup             
	//  813 1071:iconst_1        
	//  814 1072:bipush          74
	//  815 1074:iastore         
	//  816 1075:dup             
	//  817 1076:iconst_2        
	//  818 1077:bipush          59
	//  819 1079:iastore         
	//  820 1080:astore          55
		int ai54[] = {
			8, 75, 60
		};
	//  821 1082:iconst_3        
	//  822 1083:newarray        int[]
	//  823 1085:dup             
	//  824 1086:iconst_0        
	//  825 1087:bipush          8
	//  826 1089:iastore         
	//  827 1090:dup             
	//  828 1091:iconst_1        
	//  829 1092:bipush          75
	//  830 1094:iastore         
	//  831 1095:dup             
	//  832 1096:iconst_2        
	//  833 1097:bipush          60
	//  834 1099:iastore         
	//  835 1100:astore          56
		int ai55[] = {
			8, 50, 61
		};
	//  836 1102:iconst_3        
	//  837 1103:newarray        int[]
	//  838 1105:dup             
	//  839 1106:iconst_0        
	//  840 1107:bipush          8
	//  841 1109:iastore         
	//  842 1110:dup             
	//  843 1111:iconst_1        
	//  844 1112:bipush          50
	//  845 1114:iastore         
	//  846 1115:dup             
	//  847 1116:iconst_2        
	//  848 1117:bipush          61
	//  849 1119:iastore         
	//  850 1120:astore          57
		int ai56[] = {
			8, 51, 62
		};
	//  851 1122:iconst_3        
	//  852 1123:newarray        int[]
	//  853 1125:dup             
	//  854 1126:iconst_0        
	//  855 1127:bipush          8
	//  856 1129:iastore         
	//  857 1130:dup             
	//  858 1131:iconst_1        
	//  859 1132:bipush          51
	//  860 1134:iastore         
	//  861 1135:dup             
	//  862 1136:iconst_2        
	//  863 1137:bipush          62
	//  864 1139:iastore         
	//  865 1140:astore          58
		int ai57[] = {
			8, 52, 63
		};
	//  866 1142:iconst_3        
	//  867 1143:newarray        int[]
	//  868 1145:dup             
	//  869 1146:iconst_0        
	//  870 1147:bipush          8
	//  871 1149:iastore         
	//  872 1150:dup             
	//  873 1151:iconst_1        
	//  874 1152:bipush          52
	//  875 1154:iastore         
	//  876 1155:dup             
	//  877 1156:iconst_2        
	//  878 1157:bipush          63
	//  879 1159:iastore         
	//  880 1160:astore          59
		int ai58[] = {
			5, 18, 128
		};
	//  881 1162:iconst_3        
	//  882 1163:newarray        int[]
	//  883 1165:dup             
	//  884 1166:iconst_0        
	//  885 1167:iconst_5        
	//  886 1168:iastore         
	//  887 1169:dup             
	//  888 1170:iconst_1        
	//  889 1171:bipush          18
	//  890 1173:iastore         
	//  891 1174:dup             
	//  892 1175:iconst_2        
	//  893 1176:sipush          128
	//  894 1179:iastore         
	//  895 1180:astore          60
		int ai59[] = {
			6, 23, 192
		};
	//  896 1182:iconst_3        
	//  897 1183:newarray        int[]
	//  898 1185:dup             
	//  899 1186:iconst_0        
	//  900 1187:bipush          6
	//  901 1189:iastore         
	//  902 1190:dup             
	//  903 1191:iconst_1        
	//  904 1192:bipush          23
	//  905 1194:iastore         
	//  906 1195:dup             
	//  907 1196:iconst_2        
	//  908 1197:sipush          192
	//  909 1200:iastore         
	//  910 1201:astore          61
		int ai60[] = {
			8, 54, 320
		};
	//  911 1203:iconst_3        
	//  912 1204:newarray        int[]
	//  913 1206:dup             
	//  914 1207:iconst_0        
	//  915 1208:bipush          8
	//  916 1210:iastore         
	//  917 1211:dup             
	//  918 1212:iconst_1        
	//  919 1213:bipush          54
	//  920 1215:iastore         
	//  921 1216:dup             
	//  922 1217:iconst_2        
	//  923 1218:sipush          320
	//  924 1221:iastore         
	//  925 1222:astore          62
		int ai61[] = {
			8, 55, 384
		};
	//  926 1224:iconst_3        
	//  927 1225:newarray        int[]
	//  928 1227:dup             
	//  929 1228:iconst_0        
	//  930 1229:bipush          8
	//  931 1231:iastore         
	//  932 1232:dup             
	//  933 1233:iconst_1        
	//  934 1234:bipush          55
	//  935 1236:iastore         
	//  936 1237:dup             
	//  937 1238:iconst_2        
	//  938 1239:sipush          384
	//  939 1242:iastore         
	//  940 1243:astore          63
		int ai62[] = {
			8, 100, 448
		};
	//  941 1245:iconst_3        
	//  942 1246:newarray        int[]
	//  943 1248:dup             
	//  944 1249:iconst_0        
	//  945 1250:bipush          8
	//  946 1252:iastore         
	//  947 1253:dup             
	//  948 1254:iconst_1        
	//  949 1255:bipush          100
	//  950 1257:iastore         
	//  951 1258:dup             
	//  952 1259:iconst_2        
	//  953 1260:sipush          448
	//  954 1263:iastore         
	//  955 1264:astore          64
		int ai63[] = {
			8, 101, 512
		};
	//  956 1266:iconst_3        
	//  957 1267:newarray        int[]
	//  958 1269:dup             
	//  959 1270:iconst_0        
	//  960 1271:bipush          8
	//  961 1273:iastore         
	//  962 1274:dup             
	//  963 1275:iconst_1        
	//  964 1276:bipush          101
	//  965 1278:iastore         
	//  966 1279:dup             
	//  967 1280:iconst_2        
	//  968 1281:sipush          512
	//  969 1284:iastore         
	//  970 1285:astore          65
		int ai64[] = {
			8, 104, 576
		};
	//  971 1287:iconst_3        
	//  972 1288:newarray        int[]
	//  973 1290:dup             
	//  974 1291:iconst_0        
	//  975 1292:bipush          8
	//  976 1294:iastore         
	//  977 1295:dup             
	//  978 1296:iconst_1        
	//  979 1297:bipush          104
	//  980 1299:iastore         
	//  981 1300:dup             
	//  982 1301:iconst_2        
	//  983 1302:sipush          576
	//  984 1305:iastore         
	//  985 1306:astore          66
		int ai65[] = {
			8, 103, 640
		};
	//  986 1308:iconst_3        
	//  987 1309:newarray        int[]
	//  988 1311:dup             
	//  989 1312:iconst_0        
	//  990 1313:bipush          8
	//  991 1315:iastore         
	//  992 1316:dup             
	//  993 1317:iconst_1        
	//  994 1318:bipush          103
	//  995 1320:iastore         
	//  996 1321:dup             
	//  997 1322:iconst_2        
	//  998 1323:sipush          640
	//  999 1326:iastore         
	// 1000 1327:astore          67
		int ai66[] = {
			9, 205, 768
		};
	// 1001 1329:iconst_3        
	// 1002 1330:newarray        int[]
	// 1003 1332:dup             
	// 1004 1333:iconst_0        
	// 1005 1334:bipush          9
	// 1006 1336:iastore         
	// 1007 1337:dup             
	// 1008 1338:iconst_1        
	// 1009 1339:sipush          205
	// 1010 1342:iastore         
	// 1011 1343:dup             
	// 1012 1344:iconst_2        
	// 1013 1345:sipush          768
	// 1014 1348:iastore         
	// 1015 1349:astore          68
		int ai67[] = {
			9, 211, 896
		};
	// 1016 1351:iconst_3        
	// 1017 1352:newarray        int[]
	// 1018 1354:dup             
	// 1019 1355:iconst_0        
	// 1020 1356:bipush          9
	// 1021 1358:iastore         
	// 1022 1359:dup             
	// 1023 1360:iconst_1        
	// 1024 1361:sipush          211
	// 1025 1364:iastore         
	// 1026 1365:dup             
	// 1027 1366:iconst_2        
	// 1028 1367:sipush          896
	// 1029 1370:iastore         
	// 1030 1371:astore          69
		int ai68[] = {
			9, 212, 960
		};
	// 1031 1373:iconst_3        
	// 1032 1374:newarray        int[]
	// 1033 1376:dup             
	// 1034 1377:iconst_0        
	// 1035 1378:bipush          9
	// 1036 1380:iastore         
	// 1037 1381:dup             
	// 1038 1382:iconst_1        
	// 1039 1383:sipush          212
	// 1040 1386:iastore         
	// 1041 1387:dup             
	// 1042 1388:iconst_2        
	// 1043 1389:sipush          960
	// 1044 1392:iastore         
	// 1045 1393:astore          70
		int ai69[] = {
			9, 213, 1024
		};
	// 1046 1395:iconst_3        
	// 1047 1396:newarray        int[]
	// 1048 1398:dup             
	// 1049 1399:iconst_0        
	// 1050 1400:bipush          9
	// 1051 1402:iastore         
	// 1052 1403:dup             
	// 1053 1404:iconst_1        
	// 1054 1405:sipush          213
	// 1055 1408:iastore         
	// 1056 1409:dup             
	// 1057 1410:iconst_2        
	// 1058 1411:sipush          1024
	// 1059 1414:iastore         
	// 1060 1415:astore          71
		int ai70[] = {
			9, 214, 1088
		};
	// 1061 1417:iconst_3        
	// 1062 1418:newarray        int[]
	// 1063 1420:dup             
	// 1064 1421:iconst_0        
	// 1065 1422:bipush          9
	// 1066 1424:iastore         
	// 1067 1425:dup             
	// 1068 1426:iconst_1        
	// 1069 1427:sipush          214
	// 1070 1430:iastore         
	// 1071 1431:dup             
	// 1072 1432:iconst_2        
	// 1073 1433:sipush          1088
	// 1074 1436:iastore         
	// 1075 1437:astore          72
		int ai71[] = {
			9, 215, 1152
		};
	// 1076 1439:iconst_3        
	// 1077 1440:newarray        int[]
	// 1078 1442:dup             
	// 1079 1443:iconst_0        
	// 1080 1444:bipush          9
	// 1081 1446:iastore         
	// 1082 1447:dup             
	// 1083 1448:iconst_1        
	// 1084 1449:sipush          215
	// 1085 1452:iastore         
	// 1086 1453:dup             
	// 1087 1454:iconst_2        
	// 1088 1455:sipush          1152
	// 1089 1458:iastore         
	// 1090 1459:astore          73
		int ai72[] = {
			9, 217, 1280
		};
	// 1091 1461:iconst_3        
	// 1092 1462:newarray        int[]
	// 1093 1464:dup             
	// 1094 1465:iconst_0        
	// 1095 1466:bipush          9
	// 1096 1468:iastore         
	// 1097 1469:dup             
	// 1098 1470:iconst_1        
	// 1099 1471:sipush          217
	// 1100 1474:iastore         
	// 1101 1475:dup             
	// 1102 1476:iconst_2        
	// 1103 1477:sipush          1280
	// 1104 1480:iastore         
	// 1105 1481:astore          74
		int ai73[] = {
			9, 219, 1408
		};
	// 1106 1483:iconst_3        
	// 1107 1484:newarray        int[]
	// 1108 1486:dup             
	// 1109 1487:iconst_0        
	// 1110 1488:bipush          9
	// 1111 1490:iastore         
	// 1112 1491:dup             
	// 1113 1492:iconst_1        
	// 1114 1493:sipush          219
	// 1115 1496:iastore         
	// 1116 1497:dup             
	// 1117 1498:iconst_2        
	// 1118 1499:sipush          1408
	// 1119 1502:iastore         
	// 1120 1503:astore          75
		int ai74[] = {
			9, 152, 1472
		};
	// 1121 1505:iconst_3        
	// 1122 1506:newarray        int[]
	// 1123 1508:dup             
	// 1124 1509:iconst_0        
	// 1125 1510:bipush          9
	// 1126 1512:iastore         
	// 1127 1513:dup             
	// 1128 1514:iconst_1        
	// 1129 1515:sipush          152
	// 1130 1518:iastore         
	// 1131 1519:dup             
	// 1132 1520:iconst_2        
	// 1133 1521:sipush          1472
	// 1134 1524:iastore         
	// 1135 1525:astore          76
		int ai75[] = {
			9, 153, 1536
		};
	// 1136 1527:iconst_3        
	// 1137 1528:newarray        int[]
	// 1138 1530:dup             
	// 1139 1531:iconst_0        
	// 1140 1532:bipush          9
	// 1141 1534:iastore         
	// 1142 1535:dup             
	// 1143 1536:iconst_1        
	// 1144 1537:sipush          153
	// 1145 1540:iastore         
	// 1146 1541:dup             
	// 1147 1542:iconst_2        
	// 1148 1543:sipush          1536
	// 1149 1546:iastore         
	// 1150 1547:astore          77
		int ai76[] = {
			6, 24, 1664
		};
	// 1151 1549:iconst_3        
	// 1152 1550:newarray        int[]
	// 1153 1552:dup             
	// 1154 1553:iconst_0        
	// 1155 1554:bipush          6
	// 1156 1556:iastore         
	// 1157 1557:dup             
	// 1158 1558:iconst_1        
	// 1159 1559:bipush          24
	// 1160 1561:iastore         
	// 1161 1562:dup             
	// 1162 1563:iconst_2        
	// 1163 1564:sipush          1664
	// 1164 1567:iastore         
	// 1165 1568:astore          78
		int ai77[] = {
			11, 8, 1792
		};
	// 1166 1570:iconst_3        
	// 1167 1571:newarray        int[]
	// 1168 1573:dup             
	// 1169 1574:iconst_0        
	// 1170 1575:bipush          11
	// 1171 1577:iastore         
	// 1172 1578:dup             
	// 1173 1579:iconst_1        
	// 1174 1580:bipush          8
	// 1175 1582:iastore         
	// 1176 1583:dup             
	// 1177 1584:iconst_2        
	// 1178 1585:sipush          1792
	// 1179 1588:iastore         
	// 1180 1589:astore          79
		int ai78[] = {
			11, 12, 1856
		};
	// 1181 1591:iconst_3        
	// 1182 1592:newarray        int[]
	// 1183 1594:dup             
	// 1184 1595:iconst_0        
	// 1185 1596:bipush          11
	// 1186 1598:iastore         
	// 1187 1599:dup             
	// 1188 1600:iconst_1        
	// 1189 1601:bipush          12
	// 1190 1603:iastore         
	// 1191 1604:dup             
	// 1192 1605:iconst_2        
	// 1193 1606:sipush          1856
	// 1194 1609:iastore         
	// 1195 1610:astore          80
		int ai79[] = {
			11, 13, 1920
		};
	// 1196 1612:iconst_3        
	// 1197 1613:newarray        int[]
	// 1198 1615:dup             
	// 1199 1616:iconst_0        
	// 1200 1617:bipush          11
	// 1201 1619:iastore         
	// 1202 1620:dup             
	// 1203 1621:iconst_1        
	// 1204 1622:bipush          13
	// 1205 1624:iastore         
	// 1206 1625:dup             
	// 1207 1626:iconst_2        
	// 1208 1627:sipush          1920
	// 1209 1630:iastore         
	// 1210 1631:astore          81
		int ai80[] = {
			12, 19, 2048
		};
	// 1211 1633:iconst_3        
	// 1212 1634:newarray        int[]
	// 1213 1636:dup             
	// 1214 1637:iconst_0        
	// 1215 1638:bipush          12
	// 1216 1640:iastore         
	// 1217 1641:dup             
	// 1218 1642:iconst_1        
	// 1219 1643:bipush          19
	// 1220 1645:iastore         
	// 1221 1646:dup             
	// 1222 1647:iconst_2        
	// 1223 1648:sipush          2048
	// 1224 1651:iastore         
	// 1225 1652:astore          82
		int ai81[] = {
			12, 21, 2176
		};
	// 1226 1654:iconst_3        
	// 1227 1655:newarray        int[]
	// 1228 1657:dup             
	// 1229 1658:iconst_0        
	// 1230 1659:bipush          12
	// 1231 1661:iastore         
	// 1232 1662:dup             
	// 1233 1663:iconst_1        
	// 1234 1664:bipush          21
	// 1235 1666:iastore         
	// 1236 1667:dup             
	// 1237 1668:iconst_2        
	// 1238 1669:sipush          2176
	// 1239 1672:iastore         
	// 1240 1673:astore          83
		int ai82[] = {
			12, 22, 2240
		};
	// 1241 1675:iconst_3        
	// 1242 1676:newarray        int[]
	// 1243 1678:dup             
	// 1244 1679:iconst_0        
	// 1245 1680:bipush          12
	// 1246 1682:iastore         
	// 1247 1683:dup             
	// 1248 1684:iconst_1        
	// 1249 1685:bipush          22
	// 1250 1687:iastore         
	// 1251 1688:dup             
	// 1252 1689:iconst_2        
	// 1253 1690:sipush          2240
	// 1254 1693:iastore         
	// 1255 1694:astore          84
		int ai83[] = {
			12, 23, 2304
		};
	// 1256 1696:iconst_3        
	// 1257 1697:newarray        int[]
	// 1258 1699:dup             
	// 1259 1700:iconst_0        
	// 1260 1701:bipush          12
	// 1261 1703:iastore         
	// 1262 1704:dup             
	// 1263 1705:iconst_1        
	// 1264 1706:bipush          23
	// 1265 1708:iastore         
	// 1266 1709:dup             
	// 1267 1710:iconst_2        
	// 1268 1711:sipush          2304
	// 1269 1714:iastore         
	// 1270 1715:astore          85
		int ai84[] = {
			12, 28, 2368
		};
	// 1271 1717:iconst_3        
	// 1272 1718:newarray        int[]
	// 1273 1720:dup             
	// 1274 1721:iconst_0        
	// 1275 1722:bipush          12
	// 1276 1724:iastore         
	// 1277 1725:dup             
	// 1278 1726:iconst_1        
	// 1279 1727:bipush          28
	// 1280 1729:iastore         
	// 1281 1730:dup             
	// 1282 1731:iconst_2        
	// 1283 1732:sipush          2368
	// 1284 1735:iastore         
	// 1285 1736:astore          86
		int ai85[] = {
			12, 29, 2432
		};
	// 1286 1738:iconst_3        
	// 1287 1739:newarray        int[]
	// 1288 1741:dup             
	// 1289 1742:iconst_0        
	// 1290 1743:bipush          12
	// 1291 1745:iastore         
	// 1292 1746:dup             
	// 1293 1747:iconst_1        
	// 1294 1748:bipush          29
	// 1295 1750:iastore         
	// 1296 1751:dup             
	// 1297 1752:iconst_2        
	// 1298 1753:sipush          2432
	// 1299 1756:iastore         
	// 1300 1757:astore          87
		int ai86[] = {
			12, 30, 2496
		};
	// 1301 1759:iconst_3        
	// 1302 1760:newarray        int[]
	// 1303 1762:dup             
	// 1304 1763:iconst_0        
	// 1305 1764:bipush          12
	// 1306 1766:iastore         
	// 1307 1767:dup             
	// 1308 1768:iconst_1        
	// 1309 1769:bipush          30
	// 1310 1771:iastore         
	// 1311 1772:dup             
	// 1312 1773:iconst_2        
	// 1313 1774:sipush          2496
	// 1314 1777:iastore         
	// 1315 1778:astore          88
		int ai87[] = {
			12, 31, 2560
		};
	// 1316 1780:iconst_3        
	// 1317 1781:newarray        int[]
	// 1318 1783:dup             
	// 1319 1784:iconst_0        
	// 1320 1785:bipush          12
	// 1321 1787:iastore         
	// 1322 1788:dup             
	// 1323 1789:iconst_1        
	// 1324 1790:bipush          31
	// 1325 1792:iastore         
	// 1326 1793:dup             
	// 1327 1794:iconst_2        
	// 1328 1795:sipush          2560
	// 1329 1798:iastore         
	// 1330 1799:astore          89
		int ai88[] = {
			12, 1, -1
		};
	// 1331 1801:iconst_3        
	// 1332 1802:newarray        int[]
	// 1333 1804:dup             
	// 1334 1805:iconst_0        
	// 1335 1806:bipush          12
	// 1336 1808:iastore         
	// 1337 1809:dup             
	// 1338 1810:iconst_1        
	// 1339 1811:iconst_1        
	// 1340 1812:iastore         
	// 1341 1813:dup             
	// 1342 1814:iconst_2        
	// 1343 1815:iconst_m1       
	// 1344 1816:iastore         
	// 1345 1817:astore          90
		int ai89[] = {
			9, 1, -2
		};
	// 1346 1819:iconst_3        
	// 1347 1820:newarray        int[]
	// 1348 1822:dup             
	// 1349 1823:iconst_0        
	// 1350 1824:bipush          9
	// 1351 1826:iastore         
	// 1352 1827:dup             
	// 1353 1828:iconst_1        
	// 1354 1829:iconst_1        
	// 1355 1830:iastore         
	// 1356 1831:dup             
	// 1357 1832:iconst_2        
	// 1358 1833:bipush          -2
	// 1359 1835:iastore         
	// 1360 1836:astore          91
		int ai90[] = {
			10, 1, -2
		};
	// 1361 1838:iconst_3        
	// 1362 1839:newarray        int[]
	// 1363 1841:dup             
	// 1364 1842:iconst_0        
	// 1365 1843:bipush          10
	// 1366 1845:iastore         
	// 1367 1846:dup             
	// 1368 1847:iconst_1        
	// 1369 1848:iconst_1        
	// 1370 1849:iastore         
	// 1371 1850:dup             
	// 1372 1851:iconst_2        
	// 1373 1852:bipush          -2
	// 1374 1854:iastore         
	// 1375 1855:astore          92
		int ai91[] = {
			11, 1, -2
		};
	// 1376 1857:iconst_3        
	// 1377 1858:newarray        int[]
	// 1378 1860:dup             
	// 1379 1861:iconst_0        
	// 1380 1862:bipush          11
	// 1381 1864:iastore         
	// 1382 1865:dup             
	// 1383 1866:iconst_1        
	// 1384 1867:iconst_1        
	// 1385 1868:iastore         
	// 1386 1869:dup             
	// 1387 1870:iconst_2        
	// 1388 1871:bipush          -2
	// 1389 1873:iastore         
	// 1390 1874:astore          93
		int ai92[] = {
			12, 0, -2
		};
	// 1391 1876:iconst_3        
	// 1392 1877:newarray        int[]
	// 1393 1879:dup             
	// 1394 1880:iconst_0        
	// 1395 1881:bipush          12
	// 1396 1883:iastore         
	// 1397 1884:dup             
	// 1398 1885:iconst_1        
	// 1399 1886:iconst_0        
	// 1400 1887:iastore         
	// 1401 1888:dup             
	// 1402 1889:iconst_2        
	// 1403 1890:bipush          -2
	// 1404 1892:iastore         
	// 1405 1893:astore          94
		TIFFFaxWhiteCodes = (new int[][] {
			ai, ai1, ai2, ai3, ai4, ai5, ai6, new int[] {
				4, 15, 7
			}, new int[] {
				5, 19, 8
			}, ai7, 
			ai8, ai9, new int[] {
				6, 8, 12
			}, ai10, ai11, ai12, ai13, ai14, ai15, ai16, 
			ai17, new int[] {
				7, 23, 21
			}, ai18, ai19, ai20, ai21, ai22, ai23, ai24, new int[] {
				8, 2, 29
			}, 
			ai25, ai26, ai27, ai28, ai29, ai30, ai31, ai32, ai33, ai34, 
			ai35, ai36, ai37, ai38, new int[] {
				8, 45, 44
			}, ai39, ai40, ai41, ai42, ai43, 
			ai44, ai45, ai46, ai47, ai48, ai49, ai50, ai51, ai52, ai53, 
			ai54, ai55, ai56, ai57, new int[] {
				5, 27, 64
			}, ai58, ai59, new int[] {
				7, 55, 256
			}, ai60, ai61, 
			ai62, ai63, ai64, ai65, new int[] {
				9, 204, 704
			}, ai66, new int[] {
				9, 210, 832
			}, ai67, ai68, ai69, 
			ai70, ai71, new int[] {
				9, 216, 1216
			}, ai72, new int[] {
				9, 218, 1344
			}, ai73, ai74, ai75, new int[] {
				9, 154, 1600
			}, ai76, 
			new int[] {
				9, 155, 1728
			}, ai77, ai78, ai79, new int[] {
				12, 18, 1984
			}, ai80, new int[] {
				12, 20, 2112
			}, ai81, ai82, ai83, 
			ai84, ai85, ai86, ai87, ai88, ai89, ai90, ai91, ai92
		});
	// 1406 1895:aload_0         
	// 1407 1896:bipush          109
	// 1408 1898:anewarray       int[][]
	// 1409 1901:dup             
	// 1410 1902:iconst_0        
	// 1411 1903:aload_2         
	// 1412 1904:aastore         
	// 1413 1905:dup             
	// 1414 1906:iconst_1        
	// 1415 1907:aload_3         
	// 1416 1908:aastore         
	// 1417 1909:dup             
	// 1418 1910:iconst_2        
	// 1419 1911:aload           4
	// 1420 1913:aastore         
	// 1421 1914:dup             
	// 1422 1915:iconst_3        
	// 1423 1916:aload           5
	// 1424 1918:aastore         
	// 1425 1919:dup             
	// 1426 1920:iconst_4        
	// 1427 1921:aload           6
	// 1428 1923:aastore         
	// 1429 1924:dup             
	// 1430 1925:iconst_5        
	// 1431 1926:aload           7
	// 1432 1928:aastore         
	// 1433 1929:dup             
	// 1434 1930:bipush          6
	// 1435 1932:aload           8
	// 1436 1934:aastore         
	// 1437 1935:dup             
	// 1438 1936:bipush          7
	// 1439 1938:iconst_3        
	// 1440 1939:newarray        int[]
	// 1441 1941:dup             
	// 1442 1942:iconst_0        
	// 1443 1943:iconst_4        
	// 1444 1944:iastore         
	// 1445 1945:dup             
	// 1446 1946:iconst_1        
	// 1447 1947:bipush          15
	// 1448 1949:iastore         
	// 1449 1950:dup             
	// 1450 1951:iconst_2        
	// 1451 1952:bipush          7
	// 1452 1954:iastore         
	// 1453 1955:aastore         
	// 1454 1956:dup             
	// 1455 1957:bipush          8
	// 1456 1959:iconst_3        
	// 1457 1960:newarray        int[]
	// 1458 1962:dup             
	// 1459 1963:iconst_0        
	// 1460 1964:iconst_5        
	// 1461 1965:iastore         
	// 1462 1966:dup             
	// 1463 1967:iconst_1        
	// 1464 1968:bipush          19
	// 1465 1970:iastore         
	// 1466 1971:dup             
	// 1467 1972:iconst_2        
	// 1468 1973:bipush          8
	// 1469 1975:iastore         
	// 1470 1976:aastore         
	// 1471 1977:dup             
	// 1472 1978:bipush          9
	// 1473 1980:aload           9
	// 1474 1982:aastore         
	// 1475 1983:dup             
	// 1476 1984:bipush          10
	// 1477 1986:aload           10
	// 1478 1988:aastore         
	// 1479 1989:dup             
	// 1480 1990:bipush          11
	// 1481 1992:aload           11
	// 1482 1994:aastore         
	// 1483 1995:dup             
	// 1484 1996:bipush          12
	// 1485 1998:iconst_3        
	// 1486 1999:newarray        int[]
	// 1487 2001:dup             
	// 1488 2002:iconst_0        
	// 1489 2003:bipush          6
	// 1490 2005:iastore         
	// 1491 2006:dup             
	// 1492 2007:iconst_1        
	// 1493 2008:bipush          8
	// 1494 2010:iastore         
	// 1495 2011:dup             
	// 1496 2012:iconst_2        
	// 1497 2013:bipush          12
	// 1498 2015:iastore         
	// 1499 2016:aastore         
	// 1500 2017:dup             
	// 1501 2018:bipush          13
	// 1502 2020:aload           12
	// 1503 2022:aastore         
	// 1504 2023:dup             
	// 1505 2024:bipush          14
	// 1506 2026:aload           13
	// 1507 2028:aastore         
	// 1508 2029:dup             
	// 1509 2030:bipush          15
	// 1510 2032:aload           14
	// 1511 2034:aastore         
	// 1512 2035:dup             
	// 1513 2036:bipush          16
	// 1514 2038:aload           15
	// 1515 2040:aastore         
	// 1516 2041:dup             
	// 1517 2042:bipush          17
	// 1518 2044:aload           16
	// 1519 2046:aastore         
	// 1520 2047:dup             
	// 1521 2048:bipush          18
	// 1522 2050:aload           17
	// 1523 2052:aastore         
	// 1524 2053:dup             
	// 1525 2054:bipush          19
	// 1526 2056:aload           18
	// 1527 2058:aastore         
	// 1528 2059:dup             
	// 1529 2060:bipush          20
	// 1530 2062:aload           19
	// 1531 2064:aastore         
	// 1532 2065:dup             
	// 1533 2066:bipush          21
	// 1534 2068:iconst_3        
	// 1535 2069:newarray        int[]
	// 1536 2071:dup             
	// 1537 2072:iconst_0        
	// 1538 2073:bipush          7
	// 1539 2075:iastore         
	// 1540 2076:dup             
	// 1541 2077:iconst_1        
	// 1542 2078:bipush          23
	// 1543 2080:iastore         
	// 1544 2081:dup             
	// 1545 2082:iconst_2        
	// 1546 2083:bipush          21
	// 1547 2085:iastore         
	// 1548 2086:aastore         
	// 1549 2087:dup             
	// 1550 2088:bipush          22
	// 1551 2090:aload           20
	// 1552 2092:aastore         
	// 1553 2093:dup             
	// 1554 2094:bipush          23
	// 1555 2096:aload           21
	// 1556 2098:aastore         
	// 1557 2099:dup             
	// 1558 2100:bipush          24
	// 1559 2102:aload           22
	// 1560 2104:aastore         
	// 1561 2105:dup             
	// 1562 2106:bipush          25
	// 1563 2108:aload           23
	// 1564 2110:aastore         
	// 1565 2111:dup             
	// 1566 2112:bipush          26
	// 1567 2114:aload           24
	// 1568 2116:aastore         
	// 1569 2117:dup             
	// 1570 2118:bipush          27
	// 1571 2120:aload           25
	// 1572 2122:aastore         
	// 1573 2123:dup             
	// 1574 2124:bipush          28
	// 1575 2126:aload           26
	// 1576 2128:aastore         
	// 1577 2129:dup             
	// 1578 2130:bipush          29
	// 1579 2132:iconst_3        
	// 1580 2133:newarray        int[]
	// 1581 2135:dup             
	// 1582 2136:iconst_0        
	// 1583 2137:bipush          8
	// 1584 2139:iastore         
	// 1585 2140:dup             
	// 1586 2141:iconst_1        
	// 1587 2142:iconst_2        
	// 1588 2143:iastore         
	// 1589 2144:dup             
	// 1590 2145:iconst_2        
	// 1591 2146:bipush          29
	// 1592 2148:iastore         
	// 1593 2149:aastore         
	// 1594 2150:dup             
	// 1595 2151:bipush          30
	// 1596 2153:aload           27
	// 1597 2155:aastore         
	// 1598 2156:dup             
	// 1599 2157:bipush          31
	// 1600 2159:aload           28
	// 1601 2161:aastore         
	// 1602 2162:dup             
	// 1603 2163:bipush          32
	// 1604 2165:aload           29
	// 1605 2167:aastore         
	// 1606 2168:dup             
	// 1607 2169:bipush          33
	// 1608 2171:aload           30
	// 1609 2173:aastore         
	// 1610 2174:dup             
	// 1611 2175:bipush          34
	// 1612 2177:aload           31
	// 1613 2179:aastore         
	// 1614 2180:dup             
	// 1615 2181:bipush          35
	// 1616 2183:aload           32
	// 1617 2185:aastore         
	// 1618 2186:dup             
	// 1619 2187:bipush          36
	// 1620 2189:aload           33
	// 1621 2191:aastore         
	// 1622 2192:dup             
	// 1623 2193:bipush          37
	// 1624 2195:aload           34
	// 1625 2197:aastore         
	// 1626 2198:dup             
	// 1627 2199:bipush          38
	// 1628 2201:aload           35
	// 1629 2203:aastore         
	// 1630 2204:dup             
	// 1631 2205:bipush          39
	// 1632 2207:aload           36
	// 1633 2209:aastore         
	// 1634 2210:dup             
	// 1635 2211:bipush          40
	// 1636 2213:aload           37
	// 1637 2215:aastore         
	// 1638 2216:dup             
	// 1639 2217:bipush          41
	// 1640 2219:aload           38
	// 1641 2221:aastore         
	// 1642 2222:dup             
	// 1643 2223:bipush          42
	// 1644 2225:aload           39
	// 1645 2227:aastore         
	// 1646 2228:dup             
	// 1647 2229:bipush          43
	// 1648 2231:aload           40
	// 1649 2233:aastore         
	// 1650 2234:dup             
	// 1651 2235:bipush          44
	// 1652 2237:iconst_3        
	// 1653 2238:newarray        int[]
	// 1654 2240:dup             
	// 1655 2241:iconst_0        
	// 1656 2242:bipush          8
	// 1657 2244:iastore         
	// 1658 2245:dup             
	// 1659 2246:iconst_1        
	// 1660 2247:bipush          45
	// 1661 2249:iastore         
	// 1662 2250:dup             
	// 1663 2251:iconst_2        
	// 1664 2252:bipush          44
	// 1665 2254:iastore         
	// 1666 2255:aastore         
	// 1667 2256:dup             
	// 1668 2257:bipush          45
	// 1669 2259:aload           41
	// 1670 2261:aastore         
	// 1671 2262:dup             
	// 1672 2263:bipush          46
	// 1673 2265:aload           42
	// 1674 2267:aastore         
	// 1675 2268:dup             
	// 1676 2269:bipush          47
	// 1677 2271:aload           43
	// 1678 2273:aastore         
	// 1679 2274:dup             
	// 1680 2275:bipush          48
	// 1681 2277:aload           44
	// 1682 2279:aastore         
	// 1683 2280:dup             
	// 1684 2281:bipush          49
	// 1685 2283:aload           45
	// 1686 2285:aastore         
	// 1687 2286:dup             
	// 1688 2287:bipush          50
	// 1689 2289:aload           46
	// 1690 2291:aastore         
	// 1691 2292:dup             
	// 1692 2293:bipush          51
	// 1693 2295:aload           47
	// 1694 2297:aastore         
	// 1695 2298:dup             
	// 1696 2299:bipush          52
	// 1697 2301:aload           48
	// 1698 2303:aastore         
	// 1699 2304:dup             
	// 1700 2305:bipush          53
	// 1701 2307:aload           49
	// 1702 2309:aastore         
	// 1703 2310:dup             
	// 1704 2311:bipush          54
	// 1705 2313:aload           50
	// 1706 2315:aastore         
	// 1707 2316:dup             
	// 1708 2317:bipush          55
	// 1709 2319:aload           51
	// 1710 2321:aastore         
	// 1711 2322:dup             
	// 1712 2323:bipush          56
	// 1713 2325:aload           52
	// 1714 2327:aastore         
	// 1715 2328:dup             
	// 1716 2329:bipush          57
	// 1717 2331:aload           53
	// 1718 2333:aastore         
	// 1719 2334:dup             
	// 1720 2335:bipush          58
	// 1721 2337:aload           54
	// 1722 2339:aastore         
	// 1723 2340:dup             
	// 1724 2341:bipush          59
	// 1725 2343:aload           55
	// 1726 2345:aastore         
	// 1727 2346:dup             
	// 1728 2347:bipush          60
	// 1729 2349:aload           56
	// 1730 2351:aastore         
	// 1731 2352:dup             
	// 1732 2353:bipush          61
	// 1733 2355:aload           57
	// 1734 2357:aastore         
	// 1735 2358:dup             
	// 1736 2359:bipush          62
	// 1737 2361:aload           58
	// 1738 2363:aastore         
	// 1739 2364:dup             
	// 1740 2365:bipush          63
	// 1741 2367:aload           59
	// 1742 2369:aastore         
	// 1743 2370:dup             
	// 1744 2371:bipush          64
	// 1745 2373:iconst_3        
	// 1746 2374:newarray        int[]
	// 1747 2376:dup             
	// 1748 2377:iconst_0        
	// 1749 2378:iconst_5        
	// 1750 2379:iastore         
	// 1751 2380:dup             
	// 1752 2381:iconst_1        
	// 1753 2382:bipush          27
	// 1754 2384:iastore         
	// 1755 2385:dup             
	// 1756 2386:iconst_2        
	// 1757 2387:bipush          64
	// 1758 2389:iastore         
	// 1759 2390:aastore         
	// 1760 2391:dup             
	// 1761 2392:bipush          65
	// 1762 2394:aload           60
	// 1763 2396:aastore         
	// 1764 2397:dup             
	// 1765 2398:bipush          66
	// 1766 2400:aload           61
	// 1767 2402:aastore         
	// 1768 2403:dup             
	// 1769 2404:bipush          67
	// 1770 2406:iconst_3        
	// 1771 2407:newarray        int[]
	// 1772 2409:dup             
	// 1773 2410:iconst_0        
	// 1774 2411:bipush          7
	// 1775 2413:iastore         
	// 1776 2414:dup             
	// 1777 2415:iconst_1        
	// 1778 2416:bipush          55
	// 1779 2418:iastore         
	// 1780 2419:dup             
	// 1781 2420:iconst_2        
	// 1782 2421:sipush          256
	// 1783 2424:iastore         
	// 1784 2425:aastore         
	// 1785 2426:dup             
	// 1786 2427:bipush          68
	// 1787 2429:aload           62
	// 1788 2431:aastore         
	// 1789 2432:dup             
	// 1790 2433:bipush          69
	// 1791 2435:aload           63
	// 1792 2437:aastore         
	// 1793 2438:dup             
	// 1794 2439:bipush          70
	// 1795 2441:aload           64
	// 1796 2443:aastore         
	// 1797 2444:dup             
	// 1798 2445:bipush          71
	// 1799 2447:aload           65
	// 1800 2449:aastore         
	// 1801 2450:dup             
	// 1802 2451:bipush          72
	// 1803 2453:aload           66
	// 1804 2455:aastore         
	// 1805 2456:dup             
	// 1806 2457:bipush          73
	// 1807 2459:aload           67
	// 1808 2461:aastore         
	// 1809 2462:dup             
	// 1810 2463:bipush          74
	// 1811 2465:iconst_3        
	// 1812 2466:newarray        int[]
	// 1813 2468:dup             
	// 1814 2469:iconst_0        
	// 1815 2470:bipush          9
	// 1816 2472:iastore         
	// 1817 2473:dup             
	// 1818 2474:iconst_1        
	// 1819 2475:sipush          204
	// 1820 2478:iastore         
	// 1821 2479:dup             
	// 1822 2480:iconst_2        
	// 1823 2481:sipush          704
	// 1824 2484:iastore         
	// 1825 2485:aastore         
	// 1826 2486:dup             
	// 1827 2487:bipush          75
	// 1828 2489:aload           68
	// 1829 2491:aastore         
	// 1830 2492:dup             
	// 1831 2493:bipush          76
	// 1832 2495:iconst_3        
	// 1833 2496:newarray        int[]
	// 1834 2498:dup             
	// 1835 2499:iconst_0        
	// 1836 2500:bipush          9
	// 1837 2502:iastore         
	// 1838 2503:dup             
	// 1839 2504:iconst_1        
	// 1840 2505:sipush          210
	// 1841 2508:iastore         
	// 1842 2509:dup             
	// 1843 2510:iconst_2        
	// 1844 2511:sipush          832
	// 1845 2514:iastore         
	// 1846 2515:aastore         
	// 1847 2516:dup             
	// 1848 2517:bipush          77
	// 1849 2519:aload           69
	// 1850 2521:aastore         
	// 1851 2522:dup             
	// 1852 2523:bipush          78
	// 1853 2525:aload           70
	// 1854 2527:aastore         
	// 1855 2528:dup             
	// 1856 2529:bipush          79
	// 1857 2531:aload           71
	// 1858 2533:aastore         
	// 1859 2534:dup             
	// 1860 2535:bipush          80
	// 1861 2537:aload           72
	// 1862 2539:aastore         
	// 1863 2540:dup             
	// 1864 2541:bipush          81
	// 1865 2543:aload           73
	// 1866 2545:aastore         
	// 1867 2546:dup             
	// 1868 2547:bipush          82
	// 1869 2549:iconst_3        
	// 1870 2550:newarray        int[]
	// 1871 2552:dup             
	// 1872 2553:iconst_0        
	// 1873 2554:bipush          9
	// 1874 2556:iastore         
	// 1875 2557:dup             
	// 1876 2558:iconst_1        
	// 1877 2559:sipush          216
	// 1878 2562:iastore         
	// 1879 2563:dup             
	// 1880 2564:iconst_2        
	// 1881 2565:sipush          1216
	// 1882 2568:iastore         
	// 1883 2569:aastore         
	// 1884 2570:dup             
	// 1885 2571:bipush          83
	// 1886 2573:aload           74
	// 1887 2575:aastore         
	// 1888 2576:dup             
	// 1889 2577:bipush          84
	// 1890 2579:iconst_3        
	// 1891 2580:newarray        int[]
	// 1892 2582:dup             
	// 1893 2583:iconst_0        
	// 1894 2584:bipush          9
	// 1895 2586:iastore         
	// 1896 2587:dup             
	// 1897 2588:iconst_1        
	// 1898 2589:sipush          218
	// 1899 2592:iastore         
	// 1900 2593:dup             
	// 1901 2594:iconst_2        
	// 1902 2595:sipush          1344
	// 1903 2598:iastore         
	// 1904 2599:aastore         
	// 1905 2600:dup             
	// 1906 2601:bipush          85
	// 1907 2603:aload           75
	// 1908 2605:aastore         
	// 1909 2606:dup             
	// 1910 2607:bipush          86
	// 1911 2609:aload           76
	// 1912 2611:aastore         
	// 1913 2612:dup             
	// 1914 2613:bipush          87
	// 1915 2615:aload           77
	// 1916 2617:aastore         
	// 1917 2618:dup             
	// 1918 2619:bipush          88
	// 1919 2621:iconst_3        
	// 1920 2622:newarray        int[]
	// 1921 2624:dup             
	// 1922 2625:iconst_0        
	// 1923 2626:bipush          9
	// 1924 2628:iastore         
	// 1925 2629:dup             
	// 1926 2630:iconst_1        
	// 1927 2631:sipush          154
	// 1928 2634:iastore         
	// 1929 2635:dup             
	// 1930 2636:iconst_2        
	// 1931 2637:sipush          1600
	// 1932 2640:iastore         
	// 1933 2641:aastore         
	// 1934 2642:dup             
	// 1935 2643:bipush          89
	// 1936 2645:aload           78
	// 1937 2647:aastore         
	// 1938 2648:dup             
	// 1939 2649:bipush          90
	// 1940 2651:iconst_3        
	// 1941 2652:newarray        int[]
	// 1942 2654:dup             
	// 1943 2655:iconst_0        
	// 1944 2656:bipush          9
	// 1945 2658:iastore         
	// 1946 2659:dup             
	// 1947 2660:iconst_1        
	// 1948 2661:sipush          155
	// 1949 2664:iastore         
	// 1950 2665:dup             
	// 1951 2666:iconst_2        
	// 1952 2667:sipush          1728
	// 1953 2670:iastore         
	// 1954 2671:aastore         
	// 1955 2672:dup             
	// 1956 2673:bipush          91
	// 1957 2675:aload           79
	// 1958 2677:aastore         
	// 1959 2678:dup             
	// 1960 2679:bipush          92
	// 1961 2681:aload           80
	// 1962 2683:aastore         
	// 1963 2684:dup             
	// 1964 2685:bipush          93
	// 1965 2687:aload           81
	// 1966 2689:aastore         
	// 1967 2690:dup             
	// 1968 2691:bipush          94
	// 1969 2693:iconst_3        
	// 1970 2694:newarray        int[]
	// 1971 2696:dup             
	// 1972 2697:iconst_0        
	// 1973 2698:bipush          12
	// 1974 2700:iastore         
	// 1975 2701:dup             
	// 1976 2702:iconst_1        
	// 1977 2703:bipush          18
	// 1978 2705:iastore         
	// 1979 2706:dup             
	// 1980 2707:iconst_2        
	// 1981 2708:sipush          1984
	// 1982 2711:iastore         
	// 1983 2712:aastore         
	// 1984 2713:dup             
	// 1985 2714:bipush          95
	// 1986 2716:aload           82
	// 1987 2718:aastore         
	// 1988 2719:dup             
	// 1989 2720:bipush          96
	// 1990 2722:iconst_3        
	// 1991 2723:newarray        int[]
	// 1992 2725:dup             
	// 1993 2726:iconst_0        
	// 1994 2727:bipush          12
	// 1995 2729:iastore         
	// 1996 2730:dup             
	// 1997 2731:iconst_1        
	// 1998 2732:bipush          20
	// 1999 2734:iastore         
	// 2000 2735:dup             
	// 2001 2736:iconst_2        
	// 2002 2737:sipush          2112
	// 2003 2740:iastore         
	// 2004 2741:aastore         
	// 2005 2742:dup             
	// 2006 2743:bipush          97
	// 2007 2745:aload           83
	// 2008 2747:aastore         
	// 2009 2748:dup             
	// 2010 2749:bipush          98
	// 2011 2751:aload           84
	// 2012 2753:aastore         
	// 2013 2754:dup             
	// 2014 2755:bipush          99
	// 2015 2757:aload           85
	// 2016 2759:aastore         
	// 2017 2760:dup             
	// 2018 2761:bipush          100
	// 2019 2763:aload           86
	// 2020 2765:aastore         
	// 2021 2766:dup             
	// 2022 2767:bipush          101
	// 2023 2769:aload           87
	// 2024 2771:aastore         
	// 2025 2772:dup             
	// 2026 2773:bipush          102
	// 2027 2775:aload           88
	// 2028 2777:aastore         
	// 2029 2778:dup             
	// 2030 2779:bipush          103
	// 2031 2781:aload           89
	// 2032 2783:aastore         
	// 2033 2784:dup             
	// 2034 2785:bipush          104
	// 2035 2787:aload           90
	// 2036 2789:aastore         
	// 2037 2790:dup             
	// 2038 2791:bipush          105
	// 2039 2793:aload           91
	// 2040 2795:aastore         
	// 2041 2796:dup             
	// 2042 2797:bipush          106
	// 2043 2799:aload           92
	// 2044 2801:aastore         
	// 2045 2802:dup             
	// 2046 2803:bipush          107
	// 2047 2805:aload           93
	// 2048 2807:aastore         
	// 2049 2808:dup             
	// 2050 2809:bipush          108
	// 2051 2811:aload           94
	// 2052 2813:aastore         
	// 2053 2814:putfield        #69  <Field int[][] TIFFFaxWhiteCodes>
		ai = (new int[] {
			10, 8, 18
		});
	// 2054 2817:iconst_3        
	// 2055 2818:newarray        int[]
	// 2056 2820:dup             
	// 2057 2821:iconst_0        
	// 2058 2822:bipush          10
	// 2059 2824:iastore         
	// 2060 2825:dup             
	// 2061 2826:iconst_1        
	// 2062 2827:bipush          8
	// 2063 2829:iastore         
	// 2064 2830:dup             
	// 2065 2831:iconst_2        
	// 2066 2832:bipush          18
	// 2067 2834:iastore         
	// 2068 2835:astore_2        
		ai1 = (new int[] {
			12, 204, 28
		});
	// 2069 2836:iconst_3        
	// 2070 2837:newarray        int[]
	// 2071 2839:dup             
	// 2072 2840:iconst_0        
	// 2073 2841:bipush          12
	// 2074 2843:iastore         
	// 2075 2844:dup             
	// 2076 2845:iconst_1        
	// 2077 2846:sipush          204
	// 2078 2849:iastore         
	// 2079 2850:dup             
	// 2080 2851:iconst_2        
	// 2081 2852:bipush          28
	// 2082 2854:iastore         
	// 2083 2855:astore_3        
		ai2 = (new int[] {
			12, 107, 33
		});
	// 2084 2856:iconst_3        
	// 2085 2857:newarray        int[]
	// 2086 2859:dup             
	// 2087 2860:iconst_0        
	// 2088 2861:bipush          12
	// 2089 2863:iastore         
	// 2090 2864:dup             
	// 2091 2865:iconst_1        
	// 2092 2866:bipush          107
	// 2093 2868:iastore         
	// 2094 2869:dup             
	// 2095 2870:iconst_2        
	// 2096 2871:bipush          33
	// 2097 2873:iastore         
	// 2098 2874:astore          4
		ai3 = (new int[] {
			12, 85, 45
		});
	// 2099 2876:iconst_3        
	// 2100 2877:newarray        int[]
	// 2101 2879:dup             
	// 2102 2880:iconst_0        
	// 2103 2881:bipush          12
	// 2104 2883:iastore         
	// 2105 2884:dup             
	// 2106 2885:iconst_1        
	// 2107 2886:bipush          85
	// 2108 2888:iastore         
	// 2109 2889:dup             
	// 2110 2890:iconst_2        
	// 2111 2891:bipush          45
	// 2112 2893:iastore         
	// 2113 2894:astore          5
		ai4 = (new int[] {
			10, 15, 64
		});
	// 2114 2896:iconst_3        
	// 2115 2897:newarray        int[]
	// 2116 2899:dup             
	// 2117 2900:iconst_0        
	// 2118 2901:bipush          10
	// 2119 2903:iastore         
	// 2120 2904:dup             
	// 2121 2905:iconst_1        
	// 2122 2906:bipush          15
	// 2123 2908:iastore         
	// 2124 2909:dup             
	// 2125 2910:iconst_2        
	// 2126 2911:bipush          64
	// 2127 2913:iastore         
	// 2128 2914:astore          6
		ai5 = (new int[] {
			12, 200, 128
		});
	// 2129 2916:iconst_3        
	// 2130 2917:newarray        int[]
	// 2131 2919:dup             
	// 2132 2920:iconst_0        
	// 2133 2921:bipush          12
	// 2134 2923:iastore         
	// 2135 2924:dup             
	// 2136 2925:iconst_1        
	// 2137 2926:sipush          200
	// 2138 2929:iastore         
	// 2139 2930:dup             
	// 2140 2931:iconst_2        
	// 2141 2932:sipush          128
	// 2142 2935:iastore         
	// 2143 2936:astore          7
		ai6 = (new int[] {
			13, 116, 1024
		});
	// 2144 2938:iconst_3        
	// 2145 2939:newarray        int[]
	// 2146 2941:dup             
	// 2147 2942:iconst_0        
	// 2148 2943:bipush          13
	// 2149 2945:iastore         
	// 2150 2946:dup             
	// 2151 2947:iconst_1        
	// 2152 2948:bipush          116
	// 2153 2950:iastore         
	// 2154 2951:dup             
	// 2155 2952:iconst_2        
	// 2156 2953:sipush          1024
	// 2157 2956:iastore         
	// 2158 2957:astore          8
		ai7 = (new int[] {
			13, 85, 1472
		});
	// 2159 2959:iconst_3        
	// 2160 2960:newarray        int[]
	// 2161 2962:dup             
	// 2162 2963:iconst_0        
	// 2163 2964:bipush          13
	// 2164 2966:iastore         
	// 2165 2967:dup             
	// 2166 2968:iconst_1        
	// 2167 2969:bipush          85
	// 2168 2971:iastore         
	// 2169 2972:dup             
	// 2170 2973:iconst_2        
	// 2171 2974:sipush          1472
	// 2172 2977:iastore         
	// 2173 2978:astore          9
		ai8 = (new int[] {
			11, 13, 1920
		});
	// 2174 2980:iconst_3        
	// 2175 2981:newarray        int[]
	// 2176 2983:dup             
	// 2177 2984:iconst_0        
	// 2178 2985:bipush          11
	// 2179 2987:iastore         
	// 2180 2988:dup             
	// 2181 2989:iconst_1        
	// 2182 2990:bipush          13
	// 2183 2992:iastore         
	// 2184 2993:dup             
	// 2185 2994:iconst_2        
	// 2186 2995:sipush          1920
	// 2187 2998:iastore         
	// 2188 2999:astore          10
		ai9 = (new int[] {
			12, 21, 2176
		});
	// 2189 3001:iconst_3        
	// 2190 3002:newarray        int[]
	// 2191 3004:dup             
	// 2192 3005:iconst_0        
	// 2193 3006:bipush          12
	// 2194 3008:iastore         
	// 2195 3009:dup             
	// 2196 3010:iconst_1        
	// 2197 3011:bipush          21
	// 2198 3013:iastore         
	// 2199 3014:dup             
	// 2200 3015:iconst_2        
	// 2201 3016:sipush          2176
	// 2202 3019:iastore         
	// 2203 3020:astore          11
		ai10 = (new int[] {
			12, 28, 2368
		});
	// 2204 3022:iconst_3        
	// 2205 3023:newarray        int[]
	// 2206 3025:dup             
	// 2207 3026:iconst_0        
	// 2208 3027:bipush          12
	// 2209 3029:iastore         
	// 2210 3030:dup             
	// 2211 3031:iconst_1        
	// 2212 3032:bipush          28
	// 2213 3034:iastore         
	// 2214 3035:dup             
	// 2215 3036:iconst_2        
	// 2216 3037:sipush          2368
	// 2217 3040:iastore         
	// 2218 3041:astore          12
		TIFFFaxBlackCodes = (new int[][] {
			new int[] {
				10, 55, 0
			}, new int[] {
				3, 2, 1
			}, new int[] {
				2, 3, 2
			}, new int[] {
				2, 2, 3
			}, new int[] {
				3, 3, 4
			}, new int[] {
				4, 3, 5
			}, new int[] {
				4, 2, 6
			}, new int[] {
				5, 3, 7
			}, new int[] {
				6, 5, 8
			}, new int[] {
				6, 4, 9
			}, new int[] {
				7, 4, 10
			}, new int[] {
				7, 5, 11
			}, new int[] {
				7, 7, 12
			}, new int[] {
				8, 4, 13
			}, new int[] {
				8, 7, 14
			}, new int[] {
				9, 24, 15
			}, new int[] {
				10, 23, 16
			}, new int[] {
				10, 24, 17
			}, ai, new int[] {
				11, 103, 19
			}, new int[] {
				11, 104, 20
			}, new int[] {
				11, 108, 21
			}, new int[] {
				11, 55, 22
			}, new int[] {
				11, 40, 23
			}, new int[] {
				11, 23, 24
			}, new int[] {
				11, 24, 25
			}, new int[] {
				12, 202, 26
			}, new int[] {
				12, 203, 27
			}, ai1, new int[] {
				12, 205, 29
			}, new int[] {
				12, 104, 30
			}, new int[] {
				12, 105, 31
			}, new int[] {
				12, 106, 32
			}, ai2, new int[] {
				12, 210, 34
			}, new int[] {
				12, 211, 35
			}, new int[] {
				12, 212, 36
			}, new int[] {
				12, 213, 37
			}, new int[] {
				12, 214, 38
			}, new int[] {
				12, 215, 39
			}, new int[] {
				12, 108, 40
			}, new int[] {
				12, 109, 41
			}, new int[] {
				12, 218, 42
			}, new int[] {
				12, 219, 43
			}, new int[] {
				12, 84, 44
			}, ai3, new int[] {
				12, 86, 46
			}, new int[] {
				12, 87, 47
			}, new int[] {
				12, 100, 48
			}, new int[] {
				12, 101, 49
			}, new int[] {
				12, 82, 50
			}, new int[] {
				12, 83, 51
			}, new int[] {
				12, 36, 52
			}, new int[] {
				12, 55, 53
			}, new int[] {
				12, 56, 54
			}, new int[] {
				12, 39, 55
			}, new int[] {
				12, 40, 56
			}, new int[] {
				12, 88, 57
			}, new int[] {
				12, 89, 58
			}, new int[] {
				12, 43, 59
			}, new int[] {
				12, 44, 60
			}, new int[] {
				12, 90, 61
			}, new int[] {
				12, 102, 62
			}, new int[] {
				12, 103, 63
			}, ai4, ai5, new int[] {
				12, 201, 192
			}, new int[] {
				12, 91, 256
			}, new int[] {
				12, 51, 320
			}, new int[] {
				12, 52, 384
			}, new int[] {
				12, 53, 448
			}, new int[] {
				13, 108, 512
			}, new int[] {
				13, 109, 576
			}, new int[] {
				13, 74, 640
			}, new int[] {
				13, 75, 704
			}, new int[] {
				13, 76, 768
			}, new int[] {
				13, 77, 832
			}, new int[] {
				13, 114, 896
			}, new int[] {
				13, 115, 960
			}, ai6, new int[] {
				13, 117, 1088
			}, new int[] {
				13, 118, 1152
			}, new int[] {
				13, 119, 1216
			}, new int[] {
				13, 82, 1280
			}, new int[] {
				13, 83, 1344
			}, new int[] {
				13, 84, 1408
			}, ai7, new int[] {
				13, 90, 1536
			}, new int[] {
				13, 91, 1600
			}, new int[] {
				13, 100, 1664
			}, new int[] {
				13, 101, 1728
			}, new int[] {
				11, 8, 1792
			}, new int[] {
				11, 12, 1856
			}, ai8, new int[] {
				12, 18, 1984
			}, new int[] {
				12, 19, 2048
			}, new int[] {
				12, 20, 2112
			}, ai9, new int[] {
				12, 22, 2240
			}, new int[] {
				12, 23, 2304
			}, ai10, new int[] {
				12, 29, 2432
			}, new int[] {
				12, 30, 2496
			}, new int[] {
				12, 31, 2560
			}, new int[] {
				12, 1, -1
			}, new int[] {
				9, 1, -2
			}, new int[] {
				10, 1, -2
			}, new int[] {
				11, 1, -2
			}, new int[] {
				12, 0, -2
			}
		});
	// 2219 3043:aload_0         
	// 2220 3044:bipush          109
	// 2221 3046:anewarray       int[][]
	// 2222 3049:dup             
	// 2223 3050:iconst_0        
	// 2224 3051:iconst_3        
	// 2225 3052:newarray        int[]
	// 2226 3054:dup             
	// 2227 3055:iconst_0        
	// 2228 3056:bipush          10
	// 2229 3058:iastore         
	// 2230 3059:dup             
	// 2231 3060:iconst_1        
	// 2232 3061:bipush          55
	// 2233 3063:iastore         
	// 2234 3064:dup             
	// 2235 3065:iconst_2        
	// 2236 3066:iconst_0        
	// 2237 3067:iastore         
	// 2238 3068:aastore         
	// 2239 3069:dup             
	// 2240 3070:iconst_1        
	// 2241 3071:iconst_3        
	// 2242 3072:newarray        int[]
	// 2243 3074:dup             
	// 2244 3075:iconst_0        
	// 2245 3076:iconst_3        
	// 2246 3077:iastore         
	// 2247 3078:dup             
	// 2248 3079:iconst_1        
	// 2249 3080:iconst_2        
	// 2250 3081:iastore         
	// 2251 3082:dup             
	// 2252 3083:iconst_2        
	// 2253 3084:iconst_1        
	// 2254 3085:iastore         
	// 2255 3086:aastore         
	// 2256 3087:dup             
	// 2257 3088:iconst_2        
	// 2258 3089:iconst_3        
	// 2259 3090:newarray        int[]
	// 2260 3092:dup             
	// 2261 3093:iconst_0        
	// 2262 3094:iconst_2        
	// 2263 3095:iastore         
	// 2264 3096:dup             
	// 2265 3097:iconst_1        
	// 2266 3098:iconst_3        
	// 2267 3099:iastore         
	// 2268 3100:dup             
	// 2269 3101:iconst_2        
	// 2270 3102:iconst_2        
	// 2271 3103:iastore         
	// 2272 3104:aastore         
	// 2273 3105:dup             
	// 2274 3106:iconst_3        
	// 2275 3107:iconst_3        
	// 2276 3108:newarray        int[]
	// 2277 3110:dup             
	// 2278 3111:iconst_0        
	// 2279 3112:iconst_2        
	// 2280 3113:iastore         
	// 2281 3114:dup             
	// 2282 3115:iconst_1        
	// 2283 3116:iconst_2        
	// 2284 3117:iastore         
	// 2285 3118:dup             
	// 2286 3119:iconst_2        
	// 2287 3120:iconst_3        
	// 2288 3121:iastore         
	// 2289 3122:aastore         
	// 2290 3123:dup             
	// 2291 3124:iconst_4        
	// 2292 3125:iconst_3        
	// 2293 3126:newarray        int[]
	// 2294 3128:dup             
	// 2295 3129:iconst_0        
	// 2296 3130:iconst_3        
	// 2297 3131:iastore         
	// 2298 3132:dup             
	// 2299 3133:iconst_1        
	// 2300 3134:iconst_3        
	// 2301 3135:iastore         
	// 2302 3136:dup             
	// 2303 3137:iconst_2        
	// 2304 3138:iconst_4        
	// 2305 3139:iastore         
	// 2306 3140:aastore         
	// 2307 3141:dup             
	// 2308 3142:iconst_5        
	// 2309 3143:iconst_3        
	// 2310 3144:newarray        int[]
	// 2311 3146:dup             
	// 2312 3147:iconst_0        
	// 2313 3148:iconst_4        
	// 2314 3149:iastore         
	// 2315 3150:dup             
	// 2316 3151:iconst_1        
	// 2317 3152:iconst_3        
	// 2318 3153:iastore         
	// 2319 3154:dup             
	// 2320 3155:iconst_2        
	// 2321 3156:iconst_5        
	// 2322 3157:iastore         
	// 2323 3158:aastore         
	// 2324 3159:dup             
	// 2325 3160:bipush          6
	// 2326 3162:iconst_3        
	// 2327 3163:newarray        int[]
	// 2328 3165:dup             
	// 2329 3166:iconst_0        
	// 2330 3167:iconst_4        
	// 2331 3168:iastore         
	// 2332 3169:dup             
	// 2333 3170:iconst_1        
	// 2334 3171:iconst_2        
	// 2335 3172:iastore         
	// 2336 3173:dup             
	// 2337 3174:iconst_2        
	// 2338 3175:bipush          6
	// 2339 3177:iastore         
	// 2340 3178:aastore         
	// 2341 3179:dup             
	// 2342 3180:bipush          7
	// 2343 3182:iconst_3        
	// 2344 3183:newarray        int[]
	// 2345 3185:dup             
	// 2346 3186:iconst_0        
	// 2347 3187:iconst_5        
	// 2348 3188:iastore         
	// 2349 3189:dup             
	// 2350 3190:iconst_1        
	// 2351 3191:iconst_3        
	// 2352 3192:iastore         
	// 2353 3193:dup             
	// 2354 3194:iconst_2        
	// 2355 3195:bipush          7
	// 2356 3197:iastore         
	// 2357 3198:aastore         
	// 2358 3199:dup             
	// 2359 3200:bipush          8
	// 2360 3202:iconst_3        
	// 2361 3203:newarray        int[]
	// 2362 3205:dup             
	// 2363 3206:iconst_0        
	// 2364 3207:bipush          6
	// 2365 3209:iastore         
	// 2366 3210:dup             
	// 2367 3211:iconst_1        
	// 2368 3212:iconst_5        
	// 2369 3213:iastore         
	// 2370 3214:dup             
	// 2371 3215:iconst_2        
	// 2372 3216:bipush          8
	// 2373 3218:iastore         
	// 2374 3219:aastore         
	// 2375 3220:dup             
	// 2376 3221:bipush          9
	// 2377 3223:iconst_3        
	// 2378 3224:newarray        int[]
	// 2379 3226:dup             
	// 2380 3227:iconst_0        
	// 2381 3228:bipush          6
	// 2382 3230:iastore         
	// 2383 3231:dup             
	// 2384 3232:iconst_1        
	// 2385 3233:iconst_4        
	// 2386 3234:iastore         
	// 2387 3235:dup             
	// 2388 3236:iconst_2        
	// 2389 3237:bipush          9
	// 2390 3239:iastore         
	// 2391 3240:aastore         
	// 2392 3241:dup             
	// 2393 3242:bipush          10
	// 2394 3244:iconst_3        
	// 2395 3245:newarray        int[]
	// 2396 3247:dup             
	// 2397 3248:iconst_0        
	// 2398 3249:bipush          7
	// 2399 3251:iastore         
	// 2400 3252:dup             
	// 2401 3253:iconst_1        
	// 2402 3254:iconst_4        
	// 2403 3255:iastore         
	// 2404 3256:dup             
	// 2405 3257:iconst_2        
	// 2406 3258:bipush          10
	// 2407 3260:iastore         
	// 2408 3261:aastore         
	// 2409 3262:dup             
	// 2410 3263:bipush          11
	// 2411 3265:iconst_3        
	// 2412 3266:newarray        int[]
	// 2413 3268:dup             
	// 2414 3269:iconst_0        
	// 2415 3270:bipush          7
	// 2416 3272:iastore         
	// 2417 3273:dup             
	// 2418 3274:iconst_1        
	// 2419 3275:iconst_5        
	// 2420 3276:iastore         
	// 2421 3277:dup             
	// 2422 3278:iconst_2        
	// 2423 3279:bipush          11
	// 2424 3281:iastore         
	// 2425 3282:aastore         
	// 2426 3283:dup             
	// 2427 3284:bipush          12
	// 2428 3286:iconst_3        
	// 2429 3287:newarray        int[]
	// 2430 3289:dup             
	// 2431 3290:iconst_0        
	// 2432 3291:bipush          7
	// 2433 3293:iastore         
	// 2434 3294:dup             
	// 2435 3295:iconst_1        
	// 2436 3296:bipush          7
	// 2437 3298:iastore         
	// 2438 3299:dup             
	// 2439 3300:iconst_2        
	// 2440 3301:bipush          12
	// 2441 3303:iastore         
	// 2442 3304:aastore         
	// 2443 3305:dup             
	// 2444 3306:bipush          13
	// 2445 3308:iconst_3        
	// 2446 3309:newarray        int[]
	// 2447 3311:dup             
	// 2448 3312:iconst_0        
	// 2449 3313:bipush          8
	// 2450 3315:iastore         
	// 2451 3316:dup             
	// 2452 3317:iconst_1        
	// 2453 3318:iconst_4        
	// 2454 3319:iastore         
	// 2455 3320:dup             
	// 2456 3321:iconst_2        
	// 2457 3322:bipush          13
	// 2458 3324:iastore         
	// 2459 3325:aastore         
	// 2460 3326:dup             
	// 2461 3327:bipush          14
	// 2462 3329:iconst_3        
	// 2463 3330:newarray        int[]
	// 2464 3332:dup             
	// 2465 3333:iconst_0        
	// 2466 3334:bipush          8
	// 2467 3336:iastore         
	// 2468 3337:dup             
	// 2469 3338:iconst_1        
	// 2470 3339:bipush          7
	// 2471 3341:iastore         
	// 2472 3342:dup             
	// 2473 3343:iconst_2        
	// 2474 3344:bipush          14
	// 2475 3346:iastore         
	// 2476 3347:aastore         
	// 2477 3348:dup             
	// 2478 3349:bipush          15
	// 2479 3351:iconst_3        
	// 2480 3352:newarray        int[]
	// 2481 3354:dup             
	// 2482 3355:iconst_0        
	// 2483 3356:bipush          9
	// 2484 3358:iastore         
	// 2485 3359:dup             
	// 2486 3360:iconst_1        
	// 2487 3361:bipush          24
	// 2488 3363:iastore         
	// 2489 3364:dup             
	// 2490 3365:iconst_2        
	// 2491 3366:bipush          15
	// 2492 3368:iastore         
	// 2493 3369:aastore         
	// 2494 3370:dup             
	// 2495 3371:bipush          16
	// 2496 3373:iconst_3        
	// 2497 3374:newarray        int[]
	// 2498 3376:dup             
	// 2499 3377:iconst_0        
	// 2500 3378:bipush          10
	// 2501 3380:iastore         
	// 2502 3381:dup             
	// 2503 3382:iconst_1        
	// 2504 3383:bipush          23
	// 2505 3385:iastore         
	// 2506 3386:dup             
	// 2507 3387:iconst_2        
	// 2508 3388:bipush          16
	// 2509 3390:iastore         
	// 2510 3391:aastore         
	// 2511 3392:dup             
	// 2512 3393:bipush          17
	// 2513 3395:iconst_3        
	// 2514 3396:newarray        int[]
	// 2515 3398:dup             
	// 2516 3399:iconst_0        
	// 2517 3400:bipush          10
	// 2518 3402:iastore         
	// 2519 3403:dup             
	// 2520 3404:iconst_1        
	// 2521 3405:bipush          24
	// 2522 3407:iastore         
	// 2523 3408:dup             
	// 2524 3409:iconst_2        
	// 2525 3410:bipush          17
	// 2526 3412:iastore         
	// 2527 3413:aastore         
	// 2528 3414:dup             
	// 2529 3415:bipush          18
	// 2530 3417:aload_2         
	// 2531 3418:aastore         
	// 2532 3419:dup             
	// 2533 3420:bipush          19
	// 2534 3422:iconst_3        
	// 2535 3423:newarray        int[]
	// 2536 3425:dup             
	// 2537 3426:iconst_0        
	// 2538 3427:bipush          11
	// 2539 3429:iastore         
	// 2540 3430:dup             
	// 2541 3431:iconst_1        
	// 2542 3432:bipush          103
	// 2543 3434:iastore         
	// 2544 3435:dup             
	// 2545 3436:iconst_2        
	// 2546 3437:bipush          19
	// 2547 3439:iastore         
	// 2548 3440:aastore         
	// 2549 3441:dup             
	// 2550 3442:bipush          20
	// 2551 3444:iconst_3        
	// 2552 3445:newarray        int[]
	// 2553 3447:dup             
	// 2554 3448:iconst_0        
	// 2555 3449:bipush          11
	// 2556 3451:iastore         
	// 2557 3452:dup             
	// 2558 3453:iconst_1        
	// 2559 3454:bipush          104
	// 2560 3456:iastore         
	// 2561 3457:dup             
	// 2562 3458:iconst_2        
	// 2563 3459:bipush          20
	// 2564 3461:iastore         
	// 2565 3462:aastore         
	// 2566 3463:dup             
	// 2567 3464:bipush          21
	// 2568 3466:iconst_3        
	// 2569 3467:newarray        int[]
	// 2570 3469:dup             
	// 2571 3470:iconst_0        
	// 2572 3471:bipush          11
	// 2573 3473:iastore         
	// 2574 3474:dup             
	// 2575 3475:iconst_1        
	// 2576 3476:bipush          108
	// 2577 3478:iastore         
	// 2578 3479:dup             
	// 2579 3480:iconst_2        
	// 2580 3481:bipush          21
	// 2581 3483:iastore         
	// 2582 3484:aastore         
	// 2583 3485:dup             
	// 2584 3486:bipush          22
	// 2585 3488:iconst_3        
	// 2586 3489:newarray        int[]
	// 2587 3491:dup             
	// 2588 3492:iconst_0        
	// 2589 3493:bipush          11
	// 2590 3495:iastore         
	// 2591 3496:dup             
	// 2592 3497:iconst_1        
	// 2593 3498:bipush          55
	// 2594 3500:iastore         
	// 2595 3501:dup             
	// 2596 3502:iconst_2        
	// 2597 3503:bipush          22
	// 2598 3505:iastore         
	// 2599 3506:aastore         
	// 2600 3507:dup             
	// 2601 3508:bipush          23
	// 2602 3510:iconst_3        
	// 2603 3511:newarray        int[]
	// 2604 3513:dup             
	// 2605 3514:iconst_0        
	// 2606 3515:bipush          11
	// 2607 3517:iastore         
	// 2608 3518:dup             
	// 2609 3519:iconst_1        
	// 2610 3520:bipush          40
	// 2611 3522:iastore         
	// 2612 3523:dup             
	// 2613 3524:iconst_2        
	// 2614 3525:bipush          23
	// 2615 3527:iastore         
	// 2616 3528:aastore         
	// 2617 3529:dup             
	// 2618 3530:bipush          24
	// 2619 3532:iconst_3        
	// 2620 3533:newarray        int[]
	// 2621 3535:dup             
	// 2622 3536:iconst_0        
	// 2623 3537:bipush          11
	// 2624 3539:iastore         
	// 2625 3540:dup             
	// 2626 3541:iconst_1        
	// 2627 3542:bipush          23
	// 2628 3544:iastore         
	// 2629 3545:dup             
	// 2630 3546:iconst_2        
	// 2631 3547:bipush          24
	// 2632 3549:iastore         
	// 2633 3550:aastore         
	// 2634 3551:dup             
	// 2635 3552:bipush          25
	// 2636 3554:iconst_3        
	// 2637 3555:newarray        int[]
	// 2638 3557:dup             
	// 2639 3558:iconst_0        
	// 2640 3559:bipush          11
	// 2641 3561:iastore         
	// 2642 3562:dup             
	// 2643 3563:iconst_1        
	// 2644 3564:bipush          24
	// 2645 3566:iastore         
	// 2646 3567:dup             
	// 2647 3568:iconst_2        
	// 2648 3569:bipush          25
	// 2649 3571:iastore         
	// 2650 3572:aastore         
	// 2651 3573:dup             
	// 2652 3574:bipush          26
	// 2653 3576:iconst_3        
	// 2654 3577:newarray        int[]
	// 2655 3579:dup             
	// 2656 3580:iconst_0        
	// 2657 3581:bipush          12
	// 2658 3583:iastore         
	// 2659 3584:dup             
	// 2660 3585:iconst_1        
	// 2661 3586:sipush          202
	// 2662 3589:iastore         
	// 2663 3590:dup             
	// 2664 3591:iconst_2        
	// 2665 3592:bipush          26
	// 2666 3594:iastore         
	// 2667 3595:aastore         
	// 2668 3596:dup             
	// 2669 3597:bipush          27
	// 2670 3599:iconst_3        
	// 2671 3600:newarray        int[]
	// 2672 3602:dup             
	// 2673 3603:iconst_0        
	// 2674 3604:bipush          12
	// 2675 3606:iastore         
	// 2676 3607:dup             
	// 2677 3608:iconst_1        
	// 2678 3609:sipush          203
	// 2679 3612:iastore         
	// 2680 3613:dup             
	// 2681 3614:iconst_2        
	// 2682 3615:bipush          27
	// 2683 3617:iastore         
	// 2684 3618:aastore         
	// 2685 3619:dup             
	// 2686 3620:bipush          28
	// 2687 3622:aload_3         
	// 2688 3623:aastore         
	// 2689 3624:dup             
	// 2690 3625:bipush          29
	// 2691 3627:iconst_3        
	// 2692 3628:newarray        int[]
	// 2693 3630:dup             
	// 2694 3631:iconst_0        
	// 2695 3632:bipush          12
	// 2696 3634:iastore         
	// 2697 3635:dup             
	// 2698 3636:iconst_1        
	// 2699 3637:sipush          205
	// 2700 3640:iastore         
	// 2701 3641:dup             
	// 2702 3642:iconst_2        
	// 2703 3643:bipush          29
	// 2704 3645:iastore         
	// 2705 3646:aastore         
	// 2706 3647:dup             
	// 2707 3648:bipush          30
	// 2708 3650:iconst_3        
	// 2709 3651:newarray        int[]
	// 2710 3653:dup             
	// 2711 3654:iconst_0        
	// 2712 3655:bipush          12
	// 2713 3657:iastore         
	// 2714 3658:dup             
	// 2715 3659:iconst_1        
	// 2716 3660:bipush          104
	// 2717 3662:iastore         
	// 2718 3663:dup             
	// 2719 3664:iconst_2        
	// 2720 3665:bipush          30
	// 2721 3667:iastore         
	// 2722 3668:aastore         
	// 2723 3669:dup             
	// 2724 3670:bipush          31
	// 2725 3672:iconst_3        
	// 2726 3673:newarray        int[]
	// 2727 3675:dup             
	// 2728 3676:iconst_0        
	// 2729 3677:bipush          12
	// 2730 3679:iastore         
	// 2731 3680:dup             
	// 2732 3681:iconst_1        
	// 2733 3682:bipush          105
	// 2734 3684:iastore         
	// 2735 3685:dup             
	// 2736 3686:iconst_2        
	// 2737 3687:bipush          31
	// 2738 3689:iastore         
	// 2739 3690:aastore         
	// 2740 3691:dup             
	// 2741 3692:bipush          32
	// 2742 3694:iconst_3        
	// 2743 3695:newarray        int[]
	// 2744 3697:dup             
	// 2745 3698:iconst_0        
	// 2746 3699:bipush          12
	// 2747 3701:iastore         
	// 2748 3702:dup             
	// 2749 3703:iconst_1        
	// 2750 3704:bipush          106
	// 2751 3706:iastore         
	// 2752 3707:dup             
	// 2753 3708:iconst_2        
	// 2754 3709:bipush          32
	// 2755 3711:iastore         
	// 2756 3712:aastore         
	// 2757 3713:dup             
	// 2758 3714:bipush          33
	// 2759 3716:aload           4
	// 2760 3718:aastore         
	// 2761 3719:dup             
	// 2762 3720:bipush          34
	// 2763 3722:iconst_3        
	// 2764 3723:newarray        int[]
	// 2765 3725:dup             
	// 2766 3726:iconst_0        
	// 2767 3727:bipush          12
	// 2768 3729:iastore         
	// 2769 3730:dup             
	// 2770 3731:iconst_1        
	// 2771 3732:sipush          210
	// 2772 3735:iastore         
	// 2773 3736:dup             
	// 2774 3737:iconst_2        
	// 2775 3738:bipush          34
	// 2776 3740:iastore         
	// 2777 3741:aastore         
	// 2778 3742:dup             
	// 2779 3743:bipush          35
	// 2780 3745:iconst_3        
	// 2781 3746:newarray        int[]
	// 2782 3748:dup             
	// 2783 3749:iconst_0        
	// 2784 3750:bipush          12
	// 2785 3752:iastore         
	// 2786 3753:dup             
	// 2787 3754:iconst_1        
	// 2788 3755:sipush          211
	// 2789 3758:iastore         
	// 2790 3759:dup             
	// 2791 3760:iconst_2        
	// 2792 3761:bipush          35
	// 2793 3763:iastore         
	// 2794 3764:aastore         
	// 2795 3765:dup             
	// 2796 3766:bipush          36
	// 2797 3768:iconst_3        
	// 2798 3769:newarray        int[]
	// 2799 3771:dup             
	// 2800 3772:iconst_0        
	// 2801 3773:bipush          12
	// 2802 3775:iastore         
	// 2803 3776:dup             
	// 2804 3777:iconst_1        
	// 2805 3778:sipush          212
	// 2806 3781:iastore         
	// 2807 3782:dup             
	// 2808 3783:iconst_2        
	// 2809 3784:bipush          36
	// 2810 3786:iastore         
	// 2811 3787:aastore         
	// 2812 3788:dup             
	// 2813 3789:bipush          37
	// 2814 3791:iconst_3        
	// 2815 3792:newarray        int[]
	// 2816 3794:dup             
	// 2817 3795:iconst_0        
	// 2818 3796:bipush          12
	// 2819 3798:iastore         
	// 2820 3799:dup             
	// 2821 3800:iconst_1        
	// 2822 3801:sipush          213
	// 2823 3804:iastore         
	// 2824 3805:dup             
	// 2825 3806:iconst_2        
	// 2826 3807:bipush          37
	// 2827 3809:iastore         
	// 2828 3810:aastore         
	// 2829 3811:dup             
	// 2830 3812:bipush          38
	// 2831 3814:iconst_3        
	// 2832 3815:newarray        int[]
	// 2833 3817:dup             
	// 2834 3818:iconst_0        
	// 2835 3819:bipush          12
	// 2836 3821:iastore         
	// 2837 3822:dup             
	// 2838 3823:iconst_1        
	// 2839 3824:sipush          214
	// 2840 3827:iastore         
	// 2841 3828:dup             
	// 2842 3829:iconst_2        
	// 2843 3830:bipush          38
	// 2844 3832:iastore         
	// 2845 3833:aastore         
	// 2846 3834:dup             
	// 2847 3835:bipush          39
	// 2848 3837:iconst_3        
	// 2849 3838:newarray        int[]
	// 2850 3840:dup             
	// 2851 3841:iconst_0        
	// 2852 3842:bipush          12
	// 2853 3844:iastore         
	// 2854 3845:dup             
	// 2855 3846:iconst_1        
	// 2856 3847:sipush          215
	// 2857 3850:iastore         
	// 2858 3851:dup             
	// 2859 3852:iconst_2        
	// 2860 3853:bipush          39
	// 2861 3855:iastore         
	// 2862 3856:aastore         
	// 2863 3857:dup             
	// 2864 3858:bipush          40
	// 2865 3860:iconst_3        
	// 2866 3861:newarray        int[]
	// 2867 3863:dup             
	// 2868 3864:iconst_0        
	// 2869 3865:bipush          12
	// 2870 3867:iastore         
	// 2871 3868:dup             
	// 2872 3869:iconst_1        
	// 2873 3870:bipush          108
	// 2874 3872:iastore         
	// 2875 3873:dup             
	// 2876 3874:iconst_2        
	// 2877 3875:bipush          40
	// 2878 3877:iastore         
	// 2879 3878:aastore         
	// 2880 3879:dup             
	// 2881 3880:bipush          41
	// 2882 3882:iconst_3        
	// 2883 3883:newarray        int[]
	// 2884 3885:dup             
	// 2885 3886:iconst_0        
	// 2886 3887:bipush          12
	// 2887 3889:iastore         
	// 2888 3890:dup             
	// 2889 3891:iconst_1        
	// 2890 3892:bipush          109
	// 2891 3894:iastore         
	// 2892 3895:dup             
	// 2893 3896:iconst_2        
	// 2894 3897:bipush          41
	// 2895 3899:iastore         
	// 2896 3900:aastore         
	// 2897 3901:dup             
	// 2898 3902:bipush          42
	// 2899 3904:iconst_3        
	// 2900 3905:newarray        int[]
	// 2901 3907:dup             
	// 2902 3908:iconst_0        
	// 2903 3909:bipush          12
	// 2904 3911:iastore         
	// 2905 3912:dup             
	// 2906 3913:iconst_1        
	// 2907 3914:sipush          218
	// 2908 3917:iastore         
	// 2909 3918:dup             
	// 2910 3919:iconst_2        
	// 2911 3920:bipush          42
	// 2912 3922:iastore         
	// 2913 3923:aastore         
	// 2914 3924:dup             
	// 2915 3925:bipush          43
	// 2916 3927:iconst_3        
	// 2917 3928:newarray        int[]
	// 2918 3930:dup             
	// 2919 3931:iconst_0        
	// 2920 3932:bipush          12
	// 2921 3934:iastore         
	// 2922 3935:dup             
	// 2923 3936:iconst_1        
	// 2924 3937:sipush          219
	// 2925 3940:iastore         
	// 2926 3941:dup             
	// 2927 3942:iconst_2        
	// 2928 3943:bipush          43
	// 2929 3945:iastore         
	// 2930 3946:aastore         
	// 2931 3947:dup             
	// 2932 3948:bipush          44
	// 2933 3950:iconst_3        
	// 2934 3951:newarray        int[]
	// 2935 3953:dup             
	// 2936 3954:iconst_0        
	// 2937 3955:bipush          12
	// 2938 3957:iastore         
	// 2939 3958:dup             
	// 2940 3959:iconst_1        
	// 2941 3960:bipush          84
	// 2942 3962:iastore         
	// 2943 3963:dup             
	// 2944 3964:iconst_2        
	// 2945 3965:bipush          44
	// 2946 3967:iastore         
	// 2947 3968:aastore         
	// 2948 3969:dup             
	// 2949 3970:bipush          45
	// 2950 3972:aload           5
	// 2951 3974:aastore         
	// 2952 3975:dup             
	// 2953 3976:bipush          46
	// 2954 3978:iconst_3        
	// 2955 3979:newarray        int[]
	// 2956 3981:dup             
	// 2957 3982:iconst_0        
	// 2958 3983:bipush          12
	// 2959 3985:iastore         
	// 2960 3986:dup             
	// 2961 3987:iconst_1        
	// 2962 3988:bipush          86
	// 2963 3990:iastore         
	// 2964 3991:dup             
	// 2965 3992:iconst_2        
	// 2966 3993:bipush          46
	// 2967 3995:iastore         
	// 2968 3996:aastore         
	// 2969 3997:dup             
	// 2970 3998:bipush          47
	// 2971 4000:iconst_3        
	// 2972 4001:newarray        int[]
	// 2973 4003:dup             
	// 2974 4004:iconst_0        
	// 2975 4005:bipush          12
	// 2976 4007:iastore         
	// 2977 4008:dup             
	// 2978 4009:iconst_1        
	// 2979 4010:bipush          87
	// 2980 4012:iastore         
	// 2981 4013:dup             
	// 2982 4014:iconst_2        
	// 2983 4015:bipush          47
	// 2984 4017:iastore         
	// 2985 4018:aastore         
	// 2986 4019:dup             
	// 2987 4020:bipush          48
	// 2988 4022:iconst_3        
	// 2989 4023:newarray        int[]
	// 2990 4025:dup             
	// 2991 4026:iconst_0        
	// 2992 4027:bipush          12
	// 2993 4029:iastore         
	// 2994 4030:dup             
	// 2995 4031:iconst_1        
	// 2996 4032:bipush          100
	// 2997 4034:iastore         
	// 2998 4035:dup             
	// 2999 4036:iconst_2        
	// 3000 4037:bipush          48
	// 3001 4039:iastore         
	// 3002 4040:aastore         
	// 3003 4041:dup             
	// 3004 4042:bipush          49
	// 3005 4044:iconst_3        
	// 3006 4045:newarray        int[]
	// 3007 4047:dup             
	// 3008 4048:iconst_0        
	// 3009 4049:bipush          12
	// 3010 4051:iastore         
	// 3011 4052:dup             
	// 3012 4053:iconst_1        
	// 3013 4054:bipush          101
	// 3014 4056:iastore         
	// 3015 4057:dup             
	// 3016 4058:iconst_2        
	// 3017 4059:bipush          49
	// 3018 4061:iastore         
	// 3019 4062:aastore         
	// 3020 4063:dup             
	// 3021 4064:bipush          50
	// 3022 4066:iconst_3        
	// 3023 4067:newarray        int[]
	// 3024 4069:dup             
	// 3025 4070:iconst_0        
	// 3026 4071:bipush          12
	// 3027 4073:iastore         
	// 3028 4074:dup             
	// 3029 4075:iconst_1        
	// 3030 4076:bipush          82
	// 3031 4078:iastore         
	// 3032 4079:dup             
	// 3033 4080:iconst_2        
	// 3034 4081:bipush          50
	// 3035 4083:iastore         
	// 3036 4084:aastore         
	// 3037 4085:dup             
	// 3038 4086:bipush          51
	// 3039 4088:iconst_3        
	// 3040 4089:newarray        int[]
	// 3041 4091:dup             
	// 3042 4092:iconst_0        
	// 3043 4093:bipush          12
	// 3044 4095:iastore         
	// 3045 4096:dup             
	// 3046 4097:iconst_1        
	// 3047 4098:bipush          83
	// 3048 4100:iastore         
	// 3049 4101:dup             
	// 3050 4102:iconst_2        
	// 3051 4103:bipush          51
	// 3052 4105:iastore         
	// 3053 4106:aastore         
	// 3054 4107:dup             
	// 3055 4108:bipush          52
	// 3056 4110:iconst_3        
	// 3057 4111:newarray        int[]
	// 3058 4113:dup             
	// 3059 4114:iconst_0        
	// 3060 4115:bipush          12
	// 3061 4117:iastore         
	// 3062 4118:dup             
	// 3063 4119:iconst_1        
	// 3064 4120:bipush          36
	// 3065 4122:iastore         
	// 3066 4123:dup             
	// 3067 4124:iconst_2        
	// 3068 4125:bipush          52
	// 3069 4127:iastore         
	// 3070 4128:aastore         
	// 3071 4129:dup             
	// 3072 4130:bipush          53
	// 3073 4132:iconst_3        
	// 3074 4133:newarray        int[]
	// 3075 4135:dup             
	// 3076 4136:iconst_0        
	// 3077 4137:bipush          12
	// 3078 4139:iastore         
	// 3079 4140:dup             
	// 3080 4141:iconst_1        
	// 3081 4142:bipush          55
	// 3082 4144:iastore         
	// 3083 4145:dup             
	// 3084 4146:iconst_2        
	// 3085 4147:bipush          53
	// 3086 4149:iastore         
	// 3087 4150:aastore         
	// 3088 4151:dup             
	// 3089 4152:bipush          54
	// 3090 4154:iconst_3        
	// 3091 4155:newarray        int[]
	// 3092 4157:dup             
	// 3093 4158:iconst_0        
	// 3094 4159:bipush          12
	// 3095 4161:iastore         
	// 3096 4162:dup             
	// 3097 4163:iconst_1        
	// 3098 4164:bipush          56
	// 3099 4166:iastore         
	// 3100 4167:dup             
	// 3101 4168:iconst_2        
	// 3102 4169:bipush          54
	// 3103 4171:iastore         
	// 3104 4172:aastore         
	// 3105 4173:dup             
	// 3106 4174:bipush          55
	// 3107 4176:iconst_3        
	// 3108 4177:newarray        int[]
	// 3109 4179:dup             
	// 3110 4180:iconst_0        
	// 3111 4181:bipush          12
	// 3112 4183:iastore         
	// 3113 4184:dup             
	// 3114 4185:iconst_1        
	// 3115 4186:bipush          39
	// 3116 4188:iastore         
	// 3117 4189:dup             
	// 3118 4190:iconst_2        
	// 3119 4191:bipush          55
	// 3120 4193:iastore         
	// 3121 4194:aastore         
	// 3122 4195:dup             
	// 3123 4196:bipush          56
	// 3124 4198:iconst_3        
	// 3125 4199:newarray        int[]
	// 3126 4201:dup             
	// 3127 4202:iconst_0        
	// 3128 4203:bipush          12
	// 3129 4205:iastore         
	// 3130 4206:dup             
	// 3131 4207:iconst_1        
	// 3132 4208:bipush          40
	// 3133 4210:iastore         
	// 3134 4211:dup             
	// 3135 4212:iconst_2        
	// 3136 4213:bipush          56
	// 3137 4215:iastore         
	// 3138 4216:aastore         
	// 3139 4217:dup             
	// 3140 4218:bipush          57
	// 3141 4220:iconst_3        
	// 3142 4221:newarray        int[]
	// 3143 4223:dup             
	// 3144 4224:iconst_0        
	// 3145 4225:bipush          12
	// 3146 4227:iastore         
	// 3147 4228:dup             
	// 3148 4229:iconst_1        
	// 3149 4230:bipush          88
	// 3150 4232:iastore         
	// 3151 4233:dup             
	// 3152 4234:iconst_2        
	// 3153 4235:bipush          57
	// 3154 4237:iastore         
	// 3155 4238:aastore         
	// 3156 4239:dup             
	// 3157 4240:bipush          58
	// 3158 4242:iconst_3        
	// 3159 4243:newarray        int[]
	// 3160 4245:dup             
	// 3161 4246:iconst_0        
	// 3162 4247:bipush          12
	// 3163 4249:iastore         
	// 3164 4250:dup             
	// 3165 4251:iconst_1        
	// 3166 4252:bipush          89
	// 3167 4254:iastore         
	// 3168 4255:dup             
	// 3169 4256:iconst_2        
	// 3170 4257:bipush          58
	// 3171 4259:iastore         
	// 3172 4260:aastore         
	// 3173 4261:dup             
	// 3174 4262:bipush          59
	// 3175 4264:iconst_3        
	// 3176 4265:newarray        int[]
	// 3177 4267:dup             
	// 3178 4268:iconst_0        
	// 3179 4269:bipush          12
	// 3180 4271:iastore         
	// 3181 4272:dup             
	// 3182 4273:iconst_1        
	// 3183 4274:bipush          43
	// 3184 4276:iastore         
	// 3185 4277:dup             
	// 3186 4278:iconst_2        
	// 3187 4279:bipush          59
	// 3188 4281:iastore         
	// 3189 4282:aastore         
	// 3190 4283:dup             
	// 3191 4284:bipush          60
	// 3192 4286:iconst_3        
	// 3193 4287:newarray        int[]
	// 3194 4289:dup             
	// 3195 4290:iconst_0        
	// 3196 4291:bipush          12
	// 3197 4293:iastore         
	// 3198 4294:dup             
	// 3199 4295:iconst_1        
	// 3200 4296:bipush          44
	// 3201 4298:iastore         
	// 3202 4299:dup             
	// 3203 4300:iconst_2        
	// 3204 4301:bipush          60
	// 3205 4303:iastore         
	// 3206 4304:aastore         
	// 3207 4305:dup             
	// 3208 4306:bipush          61
	// 3209 4308:iconst_3        
	// 3210 4309:newarray        int[]
	// 3211 4311:dup             
	// 3212 4312:iconst_0        
	// 3213 4313:bipush          12
	// 3214 4315:iastore         
	// 3215 4316:dup             
	// 3216 4317:iconst_1        
	// 3217 4318:bipush          90
	// 3218 4320:iastore         
	// 3219 4321:dup             
	// 3220 4322:iconst_2        
	// 3221 4323:bipush          61
	// 3222 4325:iastore         
	// 3223 4326:aastore         
	// 3224 4327:dup             
	// 3225 4328:bipush          62
	// 3226 4330:iconst_3        
	// 3227 4331:newarray        int[]
	// 3228 4333:dup             
	// 3229 4334:iconst_0        
	// 3230 4335:bipush          12
	// 3231 4337:iastore         
	// 3232 4338:dup             
	// 3233 4339:iconst_1        
	// 3234 4340:bipush          102
	// 3235 4342:iastore         
	// 3236 4343:dup             
	// 3237 4344:iconst_2        
	// 3238 4345:bipush          62
	// 3239 4347:iastore         
	// 3240 4348:aastore         
	// 3241 4349:dup             
	// 3242 4350:bipush          63
	// 3243 4352:iconst_3        
	// 3244 4353:newarray        int[]
	// 3245 4355:dup             
	// 3246 4356:iconst_0        
	// 3247 4357:bipush          12
	// 3248 4359:iastore         
	// 3249 4360:dup             
	// 3250 4361:iconst_1        
	// 3251 4362:bipush          103
	// 3252 4364:iastore         
	// 3253 4365:dup             
	// 3254 4366:iconst_2        
	// 3255 4367:bipush          63
	// 3256 4369:iastore         
	// 3257 4370:aastore         
	// 3258 4371:dup             
	// 3259 4372:bipush          64
	// 3260 4374:aload           6
	// 3261 4376:aastore         
	// 3262 4377:dup             
	// 3263 4378:bipush          65
	// 3264 4380:aload           7
	// 3265 4382:aastore         
	// 3266 4383:dup             
	// 3267 4384:bipush          66
	// 3268 4386:iconst_3        
	// 3269 4387:newarray        int[]
	// 3270 4389:dup             
	// 3271 4390:iconst_0        
	// 3272 4391:bipush          12
	// 3273 4393:iastore         
	// 3274 4394:dup             
	// 3275 4395:iconst_1        
	// 3276 4396:sipush          201
	// 3277 4399:iastore         
	// 3278 4400:dup             
	// 3279 4401:iconst_2        
	// 3280 4402:sipush          192
	// 3281 4405:iastore         
	// 3282 4406:aastore         
	// 3283 4407:dup             
	// 3284 4408:bipush          67
	// 3285 4410:iconst_3        
	// 3286 4411:newarray        int[]
	// 3287 4413:dup             
	// 3288 4414:iconst_0        
	// 3289 4415:bipush          12
	// 3290 4417:iastore         
	// 3291 4418:dup             
	// 3292 4419:iconst_1        
	// 3293 4420:bipush          91
	// 3294 4422:iastore         
	// 3295 4423:dup             
	// 3296 4424:iconst_2        
	// 3297 4425:sipush          256
	// 3298 4428:iastore         
	// 3299 4429:aastore         
	// 3300 4430:dup             
	// 3301 4431:bipush          68
	// 3302 4433:iconst_3        
	// 3303 4434:newarray        int[]
	// 3304 4436:dup             
	// 3305 4437:iconst_0        
	// 3306 4438:bipush          12
	// 3307 4440:iastore         
	// 3308 4441:dup             
	// 3309 4442:iconst_1        
	// 3310 4443:bipush          51
	// 3311 4445:iastore         
	// 3312 4446:dup             
	// 3313 4447:iconst_2        
	// 3314 4448:sipush          320
	// 3315 4451:iastore         
	// 3316 4452:aastore         
	// 3317 4453:dup             
	// 3318 4454:bipush          69
	// 3319 4456:iconst_3        
	// 3320 4457:newarray        int[]
	// 3321 4459:dup             
	// 3322 4460:iconst_0        
	// 3323 4461:bipush          12
	// 3324 4463:iastore         
	// 3325 4464:dup             
	// 3326 4465:iconst_1        
	// 3327 4466:bipush          52
	// 3328 4468:iastore         
	// 3329 4469:dup             
	// 3330 4470:iconst_2        
	// 3331 4471:sipush          384
	// 3332 4474:iastore         
	// 3333 4475:aastore         
	// 3334 4476:dup             
	// 3335 4477:bipush          70
	// 3336 4479:iconst_3        
	// 3337 4480:newarray        int[]
	// 3338 4482:dup             
	// 3339 4483:iconst_0        
	// 3340 4484:bipush          12
	// 3341 4486:iastore         
	// 3342 4487:dup             
	// 3343 4488:iconst_1        
	// 3344 4489:bipush          53
	// 3345 4491:iastore         
	// 3346 4492:dup             
	// 3347 4493:iconst_2        
	// 3348 4494:sipush          448
	// 3349 4497:iastore         
	// 3350 4498:aastore         
	// 3351 4499:dup             
	// 3352 4500:bipush          71
	// 3353 4502:iconst_3        
	// 3354 4503:newarray        int[]
	// 3355 4505:dup             
	// 3356 4506:iconst_0        
	// 3357 4507:bipush          13
	// 3358 4509:iastore         
	// 3359 4510:dup             
	// 3360 4511:iconst_1        
	// 3361 4512:bipush          108
	// 3362 4514:iastore         
	// 3363 4515:dup             
	// 3364 4516:iconst_2        
	// 3365 4517:sipush          512
	// 3366 4520:iastore         
	// 3367 4521:aastore         
	// 3368 4522:dup             
	// 3369 4523:bipush          72
	// 3370 4525:iconst_3        
	// 3371 4526:newarray        int[]
	// 3372 4528:dup             
	// 3373 4529:iconst_0        
	// 3374 4530:bipush          13
	// 3375 4532:iastore         
	// 3376 4533:dup             
	// 3377 4534:iconst_1        
	// 3378 4535:bipush          109
	// 3379 4537:iastore         
	// 3380 4538:dup             
	// 3381 4539:iconst_2        
	// 3382 4540:sipush          576
	// 3383 4543:iastore         
	// 3384 4544:aastore         
	// 3385 4545:dup             
	// 3386 4546:bipush          73
	// 3387 4548:iconst_3        
	// 3388 4549:newarray        int[]
	// 3389 4551:dup             
	// 3390 4552:iconst_0        
	// 3391 4553:bipush          13
	// 3392 4555:iastore         
	// 3393 4556:dup             
	// 3394 4557:iconst_1        
	// 3395 4558:bipush          74
	// 3396 4560:iastore         
	// 3397 4561:dup             
	// 3398 4562:iconst_2        
	// 3399 4563:sipush          640
	// 3400 4566:iastore         
	// 3401 4567:aastore         
	// 3402 4568:dup             
	// 3403 4569:bipush          74
	// 3404 4571:iconst_3        
	// 3405 4572:newarray        int[]
	// 3406 4574:dup             
	// 3407 4575:iconst_0        
	// 3408 4576:bipush          13
	// 3409 4578:iastore         
	// 3410 4579:dup             
	// 3411 4580:iconst_1        
	// 3412 4581:bipush          75
	// 3413 4583:iastore         
	// 3414 4584:dup             
	// 3415 4585:iconst_2        
	// 3416 4586:sipush          704
	// 3417 4589:iastore         
	// 3418 4590:aastore         
	// 3419 4591:dup             
	// 3420 4592:bipush          75
	// 3421 4594:iconst_3        
	// 3422 4595:newarray        int[]
	// 3423 4597:dup             
	// 3424 4598:iconst_0        
	// 3425 4599:bipush          13
	// 3426 4601:iastore         
	// 3427 4602:dup             
	// 3428 4603:iconst_1        
	// 3429 4604:bipush          76
	// 3430 4606:iastore         
	// 3431 4607:dup             
	// 3432 4608:iconst_2        
	// 3433 4609:sipush          768
	// 3434 4612:iastore         
	// 3435 4613:aastore         
	// 3436 4614:dup             
	// 3437 4615:bipush          76
	// 3438 4617:iconst_3        
	// 3439 4618:newarray        int[]
	// 3440 4620:dup             
	// 3441 4621:iconst_0        
	// 3442 4622:bipush          13
	// 3443 4624:iastore         
	// 3444 4625:dup             
	// 3445 4626:iconst_1        
	// 3446 4627:bipush          77
	// 3447 4629:iastore         
	// 3448 4630:dup             
	// 3449 4631:iconst_2        
	// 3450 4632:sipush          832
	// 3451 4635:iastore         
	// 3452 4636:aastore         
	// 3453 4637:dup             
	// 3454 4638:bipush          77
	// 3455 4640:iconst_3        
	// 3456 4641:newarray        int[]
	// 3457 4643:dup             
	// 3458 4644:iconst_0        
	// 3459 4645:bipush          13
	// 3460 4647:iastore         
	// 3461 4648:dup             
	// 3462 4649:iconst_1        
	// 3463 4650:bipush          114
	// 3464 4652:iastore         
	// 3465 4653:dup             
	// 3466 4654:iconst_2        
	// 3467 4655:sipush          896
	// 3468 4658:iastore         
	// 3469 4659:aastore         
	// 3470 4660:dup             
	// 3471 4661:bipush          78
	// 3472 4663:iconst_3        
	// 3473 4664:newarray        int[]
	// 3474 4666:dup             
	// 3475 4667:iconst_0        
	// 3476 4668:bipush          13
	// 3477 4670:iastore         
	// 3478 4671:dup             
	// 3479 4672:iconst_1        
	// 3480 4673:bipush          115
	// 3481 4675:iastore         
	// 3482 4676:dup             
	// 3483 4677:iconst_2        
	// 3484 4678:sipush          960
	// 3485 4681:iastore         
	// 3486 4682:aastore         
	// 3487 4683:dup             
	// 3488 4684:bipush          79
	// 3489 4686:aload           8
	// 3490 4688:aastore         
	// 3491 4689:dup             
	// 3492 4690:bipush          80
	// 3493 4692:iconst_3        
	// 3494 4693:newarray        int[]
	// 3495 4695:dup             
	// 3496 4696:iconst_0        
	// 3497 4697:bipush          13
	// 3498 4699:iastore         
	// 3499 4700:dup             
	// 3500 4701:iconst_1        
	// 3501 4702:bipush          117
	// 3502 4704:iastore         
	// 3503 4705:dup             
	// 3504 4706:iconst_2        
	// 3505 4707:sipush          1088
	// 3506 4710:iastore         
	// 3507 4711:aastore         
	// 3508 4712:dup             
	// 3509 4713:bipush          81
	// 3510 4715:iconst_3        
	// 3511 4716:newarray        int[]
	// 3512 4718:dup             
	// 3513 4719:iconst_0        
	// 3514 4720:bipush          13
	// 3515 4722:iastore         
	// 3516 4723:dup             
	// 3517 4724:iconst_1        
	// 3518 4725:bipush          118
	// 3519 4727:iastore         
	// 3520 4728:dup             
	// 3521 4729:iconst_2        
	// 3522 4730:sipush          1152
	// 3523 4733:iastore         
	// 3524 4734:aastore         
	// 3525 4735:dup             
	// 3526 4736:bipush          82
	// 3527 4738:iconst_3        
	// 3528 4739:newarray        int[]
	// 3529 4741:dup             
	// 3530 4742:iconst_0        
	// 3531 4743:bipush          13
	// 3532 4745:iastore         
	// 3533 4746:dup             
	// 3534 4747:iconst_1        
	// 3535 4748:bipush          119
	// 3536 4750:iastore         
	// 3537 4751:dup             
	// 3538 4752:iconst_2        
	// 3539 4753:sipush          1216
	// 3540 4756:iastore         
	// 3541 4757:aastore         
	// 3542 4758:dup             
	// 3543 4759:bipush          83
	// 3544 4761:iconst_3        
	// 3545 4762:newarray        int[]
	// 3546 4764:dup             
	// 3547 4765:iconst_0        
	// 3548 4766:bipush          13
	// 3549 4768:iastore         
	// 3550 4769:dup             
	// 3551 4770:iconst_1        
	// 3552 4771:bipush          82
	// 3553 4773:iastore         
	// 3554 4774:dup             
	// 3555 4775:iconst_2        
	// 3556 4776:sipush          1280
	// 3557 4779:iastore         
	// 3558 4780:aastore         
	// 3559 4781:dup             
	// 3560 4782:bipush          84
	// 3561 4784:iconst_3        
	// 3562 4785:newarray        int[]
	// 3563 4787:dup             
	// 3564 4788:iconst_0        
	// 3565 4789:bipush          13
	// 3566 4791:iastore         
	// 3567 4792:dup             
	// 3568 4793:iconst_1        
	// 3569 4794:bipush          83
	// 3570 4796:iastore         
	// 3571 4797:dup             
	// 3572 4798:iconst_2        
	// 3573 4799:sipush          1344
	// 3574 4802:iastore         
	// 3575 4803:aastore         
	// 3576 4804:dup             
	// 3577 4805:bipush          85
	// 3578 4807:iconst_3        
	// 3579 4808:newarray        int[]
	// 3580 4810:dup             
	// 3581 4811:iconst_0        
	// 3582 4812:bipush          13
	// 3583 4814:iastore         
	// 3584 4815:dup             
	// 3585 4816:iconst_1        
	// 3586 4817:bipush          84
	// 3587 4819:iastore         
	// 3588 4820:dup             
	// 3589 4821:iconst_2        
	// 3590 4822:sipush          1408
	// 3591 4825:iastore         
	// 3592 4826:aastore         
	// 3593 4827:dup             
	// 3594 4828:bipush          86
	// 3595 4830:aload           9
	// 3596 4832:aastore         
	// 3597 4833:dup             
	// 3598 4834:bipush          87
	// 3599 4836:iconst_3        
	// 3600 4837:newarray        int[]
	// 3601 4839:dup             
	// 3602 4840:iconst_0        
	// 3603 4841:bipush          13
	// 3604 4843:iastore         
	// 3605 4844:dup             
	// 3606 4845:iconst_1        
	// 3607 4846:bipush          90
	// 3608 4848:iastore         
	// 3609 4849:dup             
	// 3610 4850:iconst_2        
	// 3611 4851:sipush          1536
	// 3612 4854:iastore         
	// 3613 4855:aastore         
	// 3614 4856:dup             
	// 3615 4857:bipush          88
	// 3616 4859:iconst_3        
	// 3617 4860:newarray        int[]
	// 3618 4862:dup             
	// 3619 4863:iconst_0        
	// 3620 4864:bipush          13
	// 3621 4866:iastore         
	// 3622 4867:dup             
	// 3623 4868:iconst_1        
	// 3624 4869:bipush          91
	// 3625 4871:iastore         
	// 3626 4872:dup             
	// 3627 4873:iconst_2        
	// 3628 4874:sipush          1600
	// 3629 4877:iastore         
	// 3630 4878:aastore         
	// 3631 4879:dup             
	// 3632 4880:bipush          89
	// 3633 4882:iconst_3        
	// 3634 4883:newarray        int[]
	// 3635 4885:dup             
	// 3636 4886:iconst_0        
	// 3637 4887:bipush          13
	// 3638 4889:iastore         
	// 3639 4890:dup             
	// 3640 4891:iconst_1        
	// 3641 4892:bipush          100
	// 3642 4894:iastore         
	// 3643 4895:dup             
	// 3644 4896:iconst_2        
	// 3645 4897:sipush          1664
	// 3646 4900:iastore         
	// 3647 4901:aastore         
	// 3648 4902:dup             
	// 3649 4903:bipush          90
	// 3650 4905:iconst_3        
	// 3651 4906:newarray        int[]
	// 3652 4908:dup             
	// 3653 4909:iconst_0        
	// 3654 4910:bipush          13
	// 3655 4912:iastore         
	// 3656 4913:dup             
	// 3657 4914:iconst_1        
	// 3658 4915:bipush          101
	// 3659 4917:iastore         
	// 3660 4918:dup             
	// 3661 4919:iconst_2        
	// 3662 4920:sipush          1728
	// 3663 4923:iastore         
	// 3664 4924:aastore         
	// 3665 4925:dup             
	// 3666 4926:bipush          91
	// 3667 4928:iconst_3        
	// 3668 4929:newarray        int[]
	// 3669 4931:dup             
	// 3670 4932:iconst_0        
	// 3671 4933:bipush          11
	// 3672 4935:iastore         
	// 3673 4936:dup             
	// 3674 4937:iconst_1        
	// 3675 4938:bipush          8
	// 3676 4940:iastore         
	// 3677 4941:dup             
	// 3678 4942:iconst_2        
	// 3679 4943:sipush          1792
	// 3680 4946:iastore         
	// 3681 4947:aastore         
	// 3682 4948:dup             
	// 3683 4949:bipush          92
	// 3684 4951:iconst_3        
	// 3685 4952:newarray        int[]
	// 3686 4954:dup             
	// 3687 4955:iconst_0        
	// 3688 4956:bipush          11
	// 3689 4958:iastore         
	// 3690 4959:dup             
	// 3691 4960:iconst_1        
	// 3692 4961:bipush          12
	// 3693 4963:iastore         
	// 3694 4964:dup             
	// 3695 4965:iconst_2        
	// 3696 4966:sipush          1856
	// 3697 4969:iastore         
	// 3698 4970:aastore         
	// 3699 4971:dup             
	// 3700 4972:bipush          93
	// 3701 4974:aload           10
	// 3702 4976:aastore         
	// 3703 4977:dup             
	// 3704 4978:bipush          94
	// 3705 4980:iconst_3        
	// 3706 4981:newarray        int[]
	// 3707 4983:dup             
	// 3708 4984:iconst_0        
	// 3709 4985:bipush          12
	// 3710 4987:iastore         
	// 3711 4988:dup             
	// 3712 4989:iconst_1        
	// 3713 4990:bipush          18
	// 3714 4992:iastore         
	// 3715 4993:dup             
	// 3716 4994:iconst_2        
	// 3717 4995:sipush          1984
	// 3718 4998:iastore         
	// 3719 4999:aastore         
	// 3720 5000:dup             
	// 3721 5001:bipush          95
	// 3722 5003:iconst_3        
	// 3723 5004:newarray        int[]
	// 3724 5006:dup             
	// 3725 5007:iconst_0        
	// 3726 5008:bipush          12
	// 3727 5010:iastore         
	// 3728 5011:dup             
	// 3729 5012:iconst_1        
	// 3730 5013:bipush          19
	// 3731 5015:iastore         
	// 3732 5016:dup             
	// 3733 5017:iconst_2        
	// 3734 5018:sipush          2048
	// 3735 5021:iastore         
	// 3736 5022:aastore         
	// 3737 5023:dup             
	// 3738 5024:bipush          96
	// 3739 5026:iconst_3        
	// 3740 5027:newarray        int[]
	// 3741 5029:dup             
	// 3742 5030:iconst_0        
	// 3743 5031:bipush          12
	// 3744 5033:iastore         
	// 3745 5034:dup             
	// 3746 5035:iconst_1        
	// 3747 5036:bipush          20
	// 3748 5038:iastore         
	// 3749 5039:dup             
	// 3750 5040:iconst_2        
	// 3751 5041:sipush          2112
	// 3752 5044:iastore         
	// 3753 5045:aastore         
	// 3754 5046:dup             
	// 3755 5047:bipush          97
	// 3756 5049:aload           11
	// 3757 5051:aastore         
	// 3758 5052:dup             
	// 3759 5053:bipush          98
	// 3760 5055:iconst_3        
	// 3761 5056:newarray        int[]
	// 3762 5058:dup             
	// 3763 5059:iconst_0        
	// 3764 5060:bipush          12
	// 3765 5062:iastore         
	// 3766 5063:dup             
	// 3767 5064:iconst_1        
	// 3768 5065:bipush          22
	// 3769 5067:iastore         
	// 3770 5068:dup             
	// 3771 5069:iconst_2        
	// 3772 5070:sipush          2240
	// 3773 5073:iastore         
	// 3774 5074:aastore         
	// 3775 5075:dup             
	// 3776 5076:bipush          99
	// 3777 5078:iconst_3        
	// 3778 5079:newarray        int[]
	// 3779 5081:dup             
	// 3780 5082:iconst_0        
	// 3781 5083:bipush          12
	// 3782 5085:iastore         
	// 3783 5086:dup             
	// 3784 5087:iconst_1        
	// 3785 5088:bipush          23
	// 3786 5090:iastore         
	// 3787 5091:dup             
	// 3788 5092:iconst_2        
	// 3789 5093:sipush          2304
	// 3790 5096:iastore         
	// 3791 5097:aastore         
	// 3792 5098:dup             
	// 3793 5099:bipush          100
	// 3794 5101:aload           12
	// 3795 5103:aastore         
	// 3796 5104:dup             
	// 3797 5105:bipush          101
	// 3798 5107:iconst_3        
	// 3799 5108:newarray        int[]
	// 3800 5110:dup             
	// 3801 5111:iconst_0        
	// 3802 5112:bipush          12
	// 3803 5114:iastore         
	// 3804 5115:dup             
	// 3805 5116:iconst_1        
	// 3806 5117:bipush          29
	// 3807 5119:iastore         
	// 3808 5120:dup             
	// 3809 5121:iconst_2        
	// 3810 5122:sipush          2432
	// 3811 5125:iastore         
	// 3812 5126:aastore         
	// 3813 5127:dup             
	// 3814 5128:bipush          102
	// 3815 5130:iconst_3        
	// 3816 5131:newarray        int[]
	// 3817 5133:dup             
	// 3818 5134:iconst_0        
	// 3819 5135:bipush          12
	// 3820 5137:iastore         
	// 3821 5138:dup             
	// 3822 5139:iconst_1        
	// 3823 5140:bipush          30
	// 3824 5142:iastore         
	// 3825 5143:dup             
	// 3826 5144:iconst_2        
	// 3827 5145:sipush          2496
	// 3828 5148:iastore         
	// 3829 5149:aastore         
	// 3830 5150:dup             
	// 3831 5151:bipush          103
	// 3832 5153:iconst_3        
	// 3833 5154:newarray        int[]
	// 3834 5156:dup             
	// 3835 5157:iconst_0        
	// 3836 5158:bipush          12
	// 3837 5160:iastore         
	// 3838 5161:dup             
	// 3839 5162:iconst_1        
	// 3840 5163:bipush          31
	// 3841 5165:iastore         
	// 3842 5166:dup             
	// 3843 5167:iconst_2        
	// 3844 5168:sipush          2560
	// 3845 5171:iastore         
	// 3846 5172:aastore         
	// 3847 5173:dup             
	// 3848 5174:bipush          104
	// 3849 5176:iconst_3        
	// 3850 5177:newarray        int[]
	// 3851 5179:dup             
	// 3852 5180:iconst_0        
	// 3853 5181:bipush          12
	// 3854 5183:iastore         
	// 3855 5184:dup             
	// 3856 5185:iconst_1        
	// 3857 5186:iconst_1        
	// 3858 5187:iastore         
	// 3859 5188:dup             
	// 3860 5189:iconst_2        
	// 3861 5190:iconst_m1       
	// 3862 5191:iastore         
	// 3863 5192:aastore         
	// 3864 5193:dup             
	// 3865 5194:bipush          105
	// 3866 5196:iconst_3        
	// 3867 5197:newarray        int[]
	// 3868 5199:dup             
	// 3869 5200:iconst_0        
	// 3870 5201:bipush          9
	// 3871 5203:iastore         
	// 3872 5204:dup             
	// 3873 5205:iconst_1        
	// 3874 5206:iconst_1        
	// 3875 5207:iastore         
	// 3876 5208:dup             
	// 3877 5209:iconst_2        
	// 3878 5210:bipush          -2
	// 3879 5212:iastore         
	// 3880 5213:aastore         
	// 3881 5214:dup             
	// 3882 5215:bipush          106
	// 3883 5217:iconst_3        
	// 3884 5218:newarray        int[]
	// 3885 5220:dup             
	// 3886 5221:iconst_0        
	// 3887 5222:bipush          10
	// 3888 5224:iastore         
	// 3889 5225:dup             
	// 3890 5226:iconst_1        
	// 3891 5227:iconst_1        
	// 3892 5228:iastore         
	// 3893 5229:dup             
	// 3894 5230:iconst_2        
	// 3895 5231:bipush          -2
	// 3896 5233:iastore         
	// 3897 5234:aastore         
	// 3898 5235:dup             
	// 3899 5236:bipush          107
	// 3900 5238:iconst_3        
	// 3901 5239:newarray        int[]
	// 3902 5241:dup             
	// 3903 5242:iconst_0        
	// 3904 5243:bipush          11
	// 3905 5245:iastore         
	// 3906 5246:dup             
	// 3907 5247:iconst_1        
	// 3908 5248:iconst_1        
	// 3909 5249:iastore         
	// 3910 5250:dup             
	// 3911 5251:iconst_2        
	// 3912 5252:bipush          -2
	// 3913 5254:iastore         
	// 3914 5255:aastore         
	// 3915 5256:dup             
	// 3916 5257:bipush          108
	// 3917 5259:iconst_3        
	// 3918 5260:newarray        int[]
	// 3919 5262:dup             
	// 3920 5263:iconst_0        
	// 3921 5264:bipush          12
	// 3922 5266:iastore         
	// 3923 5267:dup             
	// 3924 5268:iconst_1        
	// 3925 5269:iconst_0        
	// 3926 5270:iastore         
	// 3927 5271:dup             
	// 3928 5272:iconst_2        
	// 3929 5273:bipush          -2
	// 3930 5275:iastore         
	// 3931 5276:aastore         
	// 3932 5277:putfield        #71  <Field int[][] TIFFFaxBlackCodes>
	// 3933 5280:aload_0         
	// 3934 5281:iconst_3        
	// 3935 5282:newarray        int[]
	// 3936 5284:dup             
	// 3937 5285:iconst_0        
	// 3938 5286:iconst_3        
	// 3939 5287:iastore         
	// 3940 5288:dup             
	// 3941 5289:iconst_1        
	// 3942 5290:iconst_1        
	// 3943 5291:iastore         
	// 3944 5292:dup             
	// 3945 5293:iconst_2        
	// 3946 5294:iconst_0        
	// 3947 5295:iastore         
	// 3948 5296:putfield        #73  <Field int[] horizcode>
	// 3949 5299:aload_0         
	// 3950 5300:iconst_3        
	// 3951 5301:newarray        int[]
	// 3952 5303:dup             
	// 3953 5304:iconst_0        
	// 3954 5305:iconst_4        
	// 3955 5306:iastore         
	// 3956 5307:dup             
	// 3957 5308:iconst_1        
	// 3958 5309:iconst_1        
	// 3959 5310:iastore         
	// 3960 5311:dup             
	// 3961 5312:iconst_2        
	// 3962 5313:iconst_0        
	// 3963 5314:iastore         
	// 3964 5315:putfield        #75  <Field int[] passcode>
		ai = (new int[] {
			6, 3, 0
		});
	// 3965 5318:iconst_3        
	// 3966 5319:newarray        int[]
	// 3967 5321:dup             
	// 3968 5322:iconst_0        
	// 3969 5323:bipush          6
	// 3970 5325:iastore         
	// 3971 5326:dup             
	// 3972 5327:iconst_1        
	// 3973 5328:iconst_3        
	// 3974 5329:iastore         
	// 3975 5330:dup             
	// 3976 5331:iconst_2        
	// 3977 5332:iconst_0        
	// 3978 5333:iastore         
	// 3979 5334:astore_2        
		vcodes = (new int[][] {
			new int[] {
				7, 3, 0
			}, ai, new int[] {
				3, 3, 0
			}, new int[] {
				1, 1, 0
			}, new int[] {
				3, 2, 0
			}, new int[] {
				6, 2, 0
			}, new int[] {
				7, 2, 0
			}
		});
	// 3980 5335:aload_0         
	// 3981 5336:bipush          7
	// 3982 5338:anewarray       int[][]
	// 3983 5341:dup             
	// 3984 5342:iconst_0        
	// 3985 5343:iconst_3        
	// 3986 5344:newarray        int[]
	// 3987 5346:dup             
	// 3988 5347:iconst_0        
	// 3989 5348:bipush          7
	// 3990 5350:iastore         
	// 3991 5351:dup             
	// 3992 5352:iconst_1        
	// 3993 5353:iconst_3        
	// 3994 5354:iastore         
	// 3995 5355:dup             
	// 3996 5356:iconst_2        
	// 3997 5357:iconst_0        
	// 3998 5358:iastore         
	// 3999 5359:aastore         
	// 4000 5360:dup             
	// 4001 5361:iconst_1        
	// 4002 5362:aload_2         
	// 4003 5363:aastore         
	// 4004 5364:dup             
	// 4005 5365:iconst_2        
	// 4006 5366:iconst_3        
	// 4007 5367:newarray        int[]
	// 4008 5369:dup             
	// 4009 5370:iconst_0        
	// 4010 5371:iconst_3        
	// 4011 5372:iastore         
	// 4012 5373:dup             
	// 4013 5374:iconst_1        
	// 4014 5375:iconst_3        
	// 4015 5376:iastore         
	// 4016 5377:dup             
	// 4017 5378:iconst_2        
	// 4018 5379:iconst_0        
	// 4019 5380:iastore         
	// 4020 5381:aastore         
	// 4021 5382:dup             
	// 4022 5383:iconst_3        
	// 4023 5384:iconst_3        
	// 4024 5385:newarray        int[]
	// 4025 5387:dup             
	// 4026 5388:iconst_0        
	// 4027 5389:iconst_1        
	// 4028 5390:iastore         
	// 4029 5391:dup             
	// 4030 5392:iconst_1        
	// 4031 5393:iconst_1        
	// 4032 5394:iastore         
	// 4033 5395:dup             
	// 4034 5396:iconst_2        
	// 4035 5397:iconst_0        
	// 4036 5398:iastore         
	// 4037 5399:aastore         
	// 4038 5400:dup             
	// 4039 5401:iconst_4        
	// 4040 5402:iconst_3        
	// 4041 5403:newarray        int[]
	// 4042 5405:dup             
	// 4043 5406:iconst_0        
	// 4044 5407:iconst_3        
	// 4045 5408:iastore         
	// 4046 5409:dup             
	// 4047 5410:iconst_1        
	// 4048 5411:iconst_2        
	// 4049 5412:iastore         
	// 4050 5413:dup             
	// 4051 5414:iconst_2        
	// 4052 5415:iconst_0        
	// 4053 5416:iastore         
	// 4054 5417:aastore         
	// 4055 5418:dup             
	// 4056 5419:iconst_5        
	// 4057 5420:iconst_3        
	// 4058 5421:newarray        int[]
	// 4059 5423:dup             
	// 4060 5424:iconst_0        
	// 4061 5425:bipush          6
	// 4062 5427:iastore         
	// 4063 5428:dup             
	// 4064 5429:iconst_1        
	// 4065 5430:iconst_2        
	// 4066 5431:iastore         
	// 4067 5432:dup             
	// 4068 5433:iconst_2        
	// 4069 5434:iconst_0        
	// 4070 5435:iastore         
	// 4071 5436:aastore         
	// 4072 5437:dup             
	// 4073 5438:bipush          6
	// 4074 5440:iconst_3        
	// 4075 5441:newarray        int[]
	// 4076 5443:dup             
	// 4077 5444:iconst_0        
	// 4078 5445:bipush          7
	// 4079 5447:iastore         
	// 4080 5448:dup             
	// 4081 5449:iconst_1        
	// 4082 5450:iconst_2        
	// 4083 5451:iastore         
	// 4084 5452:dup             
	// 4085 5453:iconst_2        
	// 4086 5454:iconst_0        
	// 4087 5455:iastore         
	// 4088 5456:aastore         
	// 4089 5457:putfield        #77  <Field int[][] vcodes>
	// 4090 5460:aload_0         
	// 4091 5461:bipush          9
	// 4092 5463:newarray        int[]
	// 4093 5465:dup             
	// 4094 5466:iconst_0        
	// 4095 5467:iconst_0        
	// 4096 5468:iastore         
	// 4097 5469:dup             
	// 4098 5470:iconst_1        
	// 4099 5471:iconst_1        
	// 4100 5472:iastore         
	// 4101 5473:dup             
	// 4102 5474:iconst_2        
	// 4103 5475:iconst_3        
	// 4104 5476:iastore         
	// 4105 5477:dup             
	// 4106 5478:iconst_3        
	// 4107 5479:bipush          7
	// 4108 5481:iastore         
	// 4109 5482:dup             
	// 4110 5483:iconst_4        
	// 4111 5484:bipush          15
	// 4112 5486:iastore         
	// 4113 5487:dup             
	// 4114 5488:iconst_5        
	// 4115 5489:bipush          31
	// 4116 5491:iastore         
	// 4117 5492:dup             
	// 4118 5493:bipush          6
	// 4119 5495:bipush          63
	// 4120 5497:iastore         
	// 4121 5498:dup             
	// 4122 5499:bipush          7
	// 4123 5501:bipush          127
	// 4124 5503:iastore         
	// 4125 5504:dup             
	// 4126 5505:bipush          8
	// 4127 5507:sipush          255
	// 4128 5510:iastore         
	// 4129 5511:putfield        #79  <Field int[] msbmask>
		rowpixels = i;
	// 4130 5514:aload_0         
	// 4131 5515:iload_1         
	// 4132 5516:putfield        #81  <Field int rowpixels>
		rowbytes = (rowpixels + 7) / 8;
	// 4133 5519:aload_0         
	// 4134 5520:aload_0         
	// 4135 5521:getfield        #81  <Field int rowpixels>
	// 4136 5524:bipush          7
	// 4137 5526:iadd            
	// 4138 5527:bipush          8
	// 4139 5529:idiv            
	// 4140 5530:putfield        #83  <Field int rowbytes>
		refline = new byte[rowbytes];
	// 4141 5533:aload_0         
	// 4142 5534:aload_0         
	// 4143 5535:getfield        #83  <Field int rowbytes>
	// 4144 5538:newarray        byte[]
	// 4145 5540:putfield        #85  <Field byte[] refline>
	// 4146 5543:return          
	}

	private void Fax3Encode2DRow()
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i;
		int j;
		if(pixel(dataBp, offsetData, 0) != 0)
	//*   2    2:aload_0         
	//*   3    3:aload_0         
	//*   4    4:getfield        #88  <Field byte[] dataBp>
	//*   5    7:aload_0         
	//*   6    8:getfield        #90  <Field int offsetData>
	//*   7   11:iconst_0        
	//*   8   12:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//*   9   15:ifeq            174
			i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_1        
		else
	//*  12   20:aload_0         
	//*  13   21:aload_0         
	//*  14   22:getfield        #85  <Field byte[] refline>
	//*  15   25:iconst_0        
	//*  16   26:iconst_0        
	//*  17   27:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//*  18   30:ifeq            195
	//*  19   33:iconst_0        
	//*  20   34:istore_2        
	//*  21   35:aload_0         
	//*  22   36:getfield        #85  <Field byte[] refline>
	//*  23   39:iconst_0        
	//*  24   40:iload_2         
	//*  25   41:aload_0         
	//*  26   42:getfield        #81  <Field int rowpixels>
	//*  27   45:aload_0         
	//*  28   46:aload_0         
	//*  29   47:getfield        #85  <Field byte[] refline>
	//*  30   50:iconst_0        
	//*  31   51:iload_2         
	//*  32   52:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//*  33   55:invokestatic    #98  <Method int finddiff2(byte[], int, int, int, int)>
	//*  34   58:istore          4
	//*  35   60:iload           4
	//*  36   62:iload_1         
	//*  37   63:icmplt          253
	//*  38   66:iload_2         
	//*  39   67:iload_1         
	//*  40   68:isub            
	//*  41   69:istore_2        
	//*  42   70:bipush          -3
	//*  43   72:iload_2         
	//*  44   73:icmpgt          81
	//*  45   76:iload_2         
	//*  46   77:iconst_3        
	//*  47   78:icmple          238
	//*  48   81:aload_0         
	//*  49   82:getfield        #88  <Field byte[] dataBp>
	//*  50   85:aload_0         
	//*  51   86:getfield        #90  <Field int offsetData>
	//*  52   89:iload_1         
	//*  53   90:aload_0         
	//*  54   91:getfield        #81  <Field int rowpixels>
	//*  55   94:aload_0         
	//*  56   95:aload_0         
	//*  57   96:getfield        #88  <Field byte[] dataBp>
	//*  58   99:aload_0         
	//*  59  100:getfield        #90  <Field int offsetData>
	//*  60  103:iload_1         
	//*  61  104:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//*  62  107:invokestatic    #98  <Method int finddiff2(byte[], int, int, int, int)>
	//*  63  110:istore_2        
	//*  64  111:aload_0         
	//*  65  112:aload_0         
	//*  66  113:getfield        #73  <Field int[] horizcode>
	//*  67  116:invokespecial   #102 <Method void putcode(int[])>
	//*  68  119:iload_3         
	//*  69  120:iload_1         
	//*  70  121:iadd            
	//*  71  122:ifeq            141
	//*  72  125:aload_0         
	//*  73  126:aload_0         
	//*  74  127:getfield        #88  <Field byte[] dataBp>
	//*  75  130:aload_0         
	//*  76  131:getfield        #90  <Field int offsetData>
	//*  77  134:iload_3         
	//*  78  135:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//*  79  138:ifne            213
	//*  80  141:aload_0         
	//*  81  142:iload_1         
	//*  82  143:iload_3         
	//*  83  144:isub            
	//*  84  145:aload_0         
	//*  85  146:getfield        #69  <Field int[][] TIFFFaxWhiteCodes>
	//*  86  149:invokespecial   #106 <Method void putspan(int, int[][])>
	//*  87  152:aload_0         
	//*  88  153:iload_2         
	//*  89  154:iload_1         
	//*  90  155:isub            
	//*  91  156:aload_0         
	//*  92  157:getfield        #71  <Field int[][] TIFFFaxBlackCodes>
	//*  93  160:invokespecial   #106 <Method void putspan(int, int[][])>
	//*  94  163:iload_2         
	//*  95  164:istore_1        
	//*  96  165:iload_1         
	//*  97  166:aload_0         
	//*  98  167:getfield        #81  <Field int rowpixels>
	//*  99  170:icmplt          267
	//* 100  173:return          
			i = finddiff(dataBp, offsetData, 0, rowpixels, 0);
	//  101  174:aload_0         
	//  102  175:getfield        #88  <Field byte[] dataBp>
	//  103  178:aload_0         
	//  104  179:getfield        #90  <Field int offsetData>
	//  105  182:iconst_0        
	//  106  183:aload_0         
	//  107  184:getfield        #81  <Field int rowpixels>
	//  108  187:iconst_0        
	//  109  188:invokestatic    #109 <Method int finddiff(byte[], int, int, int, int)>
	//  110  191:istore_1        
		if(pixel(refline, 0, 0) != 0)
			j = 0;
		else
	//* 111  192:goto            20
			j = finddiff(refline, 0, 0, rowpixels, 0);
	//  112  195:aload_0         
	//  113  196:getfield        #85  <Field byte[] refline>
	//  114  199:iconst_0        
	//  115  200:iconst_0        
	//  116  201:aload_0         
	//  117  202:getfield        #81  <Field int rowpixels>
	//  118  205:iconst_0        
	//  119  206:invokestatic    #109 <Method int finddiff(byte[], int, int, int, int)>
	//  120  209:istore_2        
		do
		{
			int l = finddiff2(refline, 0, j, rowpixels, pixel(refline, 0, j));
			if(l >= i)
			{
				j -= i;
				if(-3 > j || j > 3)
				{
					j = finddiff2(dataBp, offsetData, i, rowpixels, pixel(dataBp, offsetData, i));
					putcode(horizcode);
					if(k + i == 0 || pixel(dataBp, offsetData, k) == 0)
					{
						putspan(i - k, TIFFFaxWhiteCodes);
						putspan(j - i, TIFFFaxBlackCodes);
					} else
	//* 121  210:goto            35
					{
						putspan(i - k, TIFFFaxBlackCodes);
	//  122  213:aload_0         
	//  123  214:iload_1         
	//  124  215:iload_3         
	//  125  216:isub            
	//  126  217:aload_0         
	//  127  218:getfield        #71  <Field int[][] TIFFFaxBlackCodes>
	//  128  221:invokespecial   #106 <Method void putspan(int, int[][])>
						putspan(j - i, TIFFFaxWhiteCodes);
	//  129  224:aload_0         
	//  130  225:iload_2         
	//  131  226:iload_1         
	//  132  227:isub            
	//  133  228:aload_0         
	//  134  229:getfield        #69  <Field int[][] TIFFFaxWhiteCodes>
	//  135  232:invokespecial   #106 <Method void putspan(int, int[][])>
					}
					i = j;
				} else
	//* 136  235:goto            163
				{
					putcode(vcodes[j + 3]);
	//  137  238:aload_0         
	//  138  239:aload_0         
	//  139  240:getfield        #77  <Field int[][] vcodes>
	//  140  243:iload_2         
	//  141  244:iconst_3        
	//  142  245:iadd            
	//  143  246:aaload          
	//  144  247:invokespecial   #102 <Method void putcode(int[])>
				}
			} else
	//* 145  250:goto            165
			{
				putcode(passcode);
	//  146  253:aload_0         
	//  147  254:aload_0         
	//  148  255:getfield        #75  <Field int[] passcode>
	//  149  258:invokespecial   #102 <Method void putcode(int[])>
				i = l;
	//  150  261:iload           4
	//  151  263:istore_1        
			}
			if(i >= rowpixels)
				return;
	//* 152  264:goto            165
			j = finddiff(dataBp, offsetData, i, rowpixels, pixel(dataBp, offsetData, i));
	//  153  267:aload_0         
	//  154  268:getfield        #88  <Field byte[] dataBp>
	//  155  271:aload_0         
	//  156  272:getfield        #90  <Field int offsetData>
	//  157  275:iload_1         
	//  158  276:aload_0         
	//  159  277:getfield        #81  <Field int rowpixels>
	//  160  280:aload_0         
	//  161  281:aload_0         
	//  162  282:getfield        #88  <Field byte[] dataBp>
	//  163  285:aload_0         
	//  164  286:getfield        #90  <Field int offsetData>
	//  165  289:iload_1         
	//  166  290:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//  167  293:invokestatic    #109 <Method int finddiff(byte[], int, int, int, int)>
	//  168  296:istore_2        
			k = finddiff(refline, 0, i, rowpixels, pixel(dataBp, offsetData, i) ^ 1);
	//  169  297:aload_0         
	//  170  298:getfield        #85  <Field byte[] refline>
	//  171  301:iconst_0        
	//  172  302:iload_1         
	//  173  303:aload_0         
	//  174  304:getfield        #81  <Field int rowpixels>
	//  175  307:aload_0         
	//  176  308:aload_0         
	//  177  309:getfield        #88  <Field byte[] dataBp>
	//  178  312:aload_0         
	//  179  313:getfield        #90  <Field int offsetData>
	//  180  316:iload_1         
	//  181  317:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//  182  320:iconst_1        
	//  183  321:ixor            
	//  184  322:invokestatic    #109 <Method int finddiff(byte[], int, int, int, int)>
	//  185  325:istore_3        
			l = finddiff(refline, 0, k, rowpixels, pixel(dataBp, offsetData, i));
	//  186  326:aload_0         
	//  187  327:getfield        #85  <Field byte[] refline>
	//  188  330:iconst_0        
	//  189  331:iload_3         
	//  190  332:aload_0         
	//  191  333:getfield        #81  <Field int rowpixels>
	//  192  336:aload_0         
	//  193  337:aload_0         
	//  194  338:getfield        #88  <Field byte[] dataBp>
	//  195  341:aload_0         
	//  196  342:getfield        #90  <Field int offsetData>
	//  197  345:iload_1         
	//  198  346:invokespecial   #94  <Method int pixel(byte[], int, int)>
	//  199  349:invokestatic    #109 <Method int finddiff(byte[], int, int, int, int)>
	//  200  352:istore          4
			k = i;
	//  201  354:iload_1         
	//  202  355:istore_3        
			i = j;
	//  203  356:iload_2         
	//  204  357:istore_1        
			j = l;
	//  205  358:iload           4
	//  206  360:istore_2        
		} while(true);
	//  207  361:goto            35
	}

	private void Fax4PostEncode()
	{
		putBits(1, 12);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:bipush          12
	//    3    4:invokespecial   #114 <Method void putBits(int, int)>
		putBits(1, 12);
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:bipush          12
	//    7   11:invokespecial   #114 <Method void putBits(int, int)>
		if(bit != 8)
	//*   8   14:aload_0         
	//*   9   15:getfield        #60  <Field int bit>
	//*  10   18:bipush          8
	//*  11   20:icmpeq          47
		{
			outBuf.append((byte)data);
	//   12   23:aload_0         
	//   13   24:getfield        #66  <Field ByteBuffer outBuf>
	//   14   27:aload_0         
	//   15   28:getfield        #116 <Field int data>
	//   16   31:int2byte        
	//   17   32:invokevirtual   #120 <Method ByteBuffer ByteBuffer.append(byte)>
	//   18   35:pop             
			data = 0;
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:putfield        #116 <Field int data>
			bit = 8;
	//   22   41:aload_0         
	//   23   42:bipush          8
	//   24   44:putfield        #60  <Field int bit>
		}
	//   25   47:return          
	}

	public static byte[] compress(byte abyte0[], int i, int j)
	{
		CCITTG4Encoder ccittg4encoder = new CCITTG4Encoder(i);
	//    0    0:new             #2   <Class CCITTG4Encoder>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:invokespecial   #123 <Method void CCITTG4Encoder(int)>
	//    4    8:astore_3        
		ccittg4encoder.fax4Encode(abyte0, 0, ccittg4encoder.rowbytes * j);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:aload_3         
	//    9   13:getfield        #83  <Field int rowbytes>
	//   10   16:iload_2         
	//   11   17:imul            
	//   12   18:invokevirtual   #127 <Method void fax4Encode(byte[], int, int)>
		return ccittg4encoder.close();
	//   13   21:aload_3         
	//   14   22:invokevirtual   #131 <Method byte[] close()>
	//   15   25:areturn         
	}

	private static int find0span(byte abyte0[], int i, int j, int k)
	{
		int l;
		k -= j;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:isub            
	//    3    3:istore_3        
		l = i + (j >> 3);
	//    4    4:iload_1         
	//    5    5:iload_2         
	//    6    6:iconst_3        
	//    7    7:ishr            
	//    8    8:iadd            
	//    9    9:istore          4
		if(k <= 0) goto _L2; else goto _L1
	//   10   11:iload_3         
	//   11   12:ifle            114
_L1:
		int j1 = j & 7;
	//   12   15:iload_2         
	//   13   16:bipush          7
	//   14   18:iand            
	//   15   19:istore          5
		if(j1 == 0) goto _L2; else goto _L3
	//   16   21:iload           5
	//   17   23:ifeq            114
_L3:
		j = ((int) (zeroruns[abyte0[l] << j1 & 0xff]));
	//   18   26:getstatic       #51  <Field byte[] zeroruns>
	//   19   29:aload_0         
	//   20   30:iload           4
	//   21   32:baload          
	//   22   33:iload           5
	//   23   35:ishl            
	//   24   36:sipush          255
	//   25   39:iand            
	//   26   40:baload          
	//   27   41:istore_2        
		i = j;
	//   28   42:iload_2         
	//   29   43:istore_1        
		if(j > 8 - j1)
	//*  30   44:iload_2         
	//*  31   45:bipush          8
	//*  32   47:iload           5
	//*  33   49:isub            
	//*  34   50:icmple          59
			i = 8 - j1;
	//   35   53:bipush          8
	//   36   55:iload           5
	//   37   57:isub            
	//   38   58:istore_1        
		j = i;
	//   39   59:iload_1         
	//   40   60:istore_2        
		if(i > k)
	//*  41   61:iload_1         
	//*  42   62:iload_3         
	//*  43   63:icmple          68
			j = k;
	//   44   66:iload_3         
	//   45   67:istore_2        
		if(j1 + j < 8)
	//*  46   68:iload           5
	//*  47   70:iload_2         
	//*  48   71:iadd            
	//*  49   72:bipush          8
	//*  50   74:icmpge          79
			return j;
	//   51   77:iload_2         
	//   52   78:ireturn         
		i = k - j;
	//   53   79:iload_3         
	//   54   80:iload_2         
	//   55   81:isub            
	//   56   82:istore_1        
		k = l + 1;
	//   57   83:iload           4
	//   58   85:iconst_1        
	//   59   86:iadd            
	//   60   87:istore_3        
_L5:
		if(i < 8)
			break; /* Loop/switch isn't completed */
	//   61   88:iload_1         
	//   62   89:bipush          8
	//   63   91:icmplt          141
		if(abyte0[k] != 0)
	//*  64   94:aload_0         
	//*  65   95:iload_3         
	//*  66   96:baload          
	//*  67   97:ifeq            124
			return zeroruns[abyte0[k] & 0xff] + j;
	//   68  100:getstatic       #51  <Field byte[] zeroruns>
	//   69  103:aload_0         
	//   70  104:iload_3         
	//   71  105:baload          
	//   72  106:sipush          255
	//   73  109:iand            
	//   74  110:baload          
	//   75  111:iload_2         
	//   76  112:iadd            
	//   77  113:ireturn         
	//*  78  114:iconst_0        
	//*  79  115:istore_2        
	//*  80  116:iload_3         
	//*  81  117:istore_1        
	//*  82  118:iload           4
	//*  83  120:istore_3        
	//*  84  121:goto            88
		j += 8;
	//   85  124:iload_2         
	//   86  125:bipush          8
	//   87  127:iadd            
	//   88  128:istore_2        
		i -= 8;
	//   89  129:iload_1         
	//   90  130:bipush          8
	//   91  132:isub            
	//   92  133:istore_1        
		k++;
	//   93  134:iload_3         
	//   94  135:iconst_1        
	//   95  136:iadd            
	//   96  137:istore_3        
		continue; /* Loop/switch isn't completed */
	//   97  138:goto            88
_L2:
		j = 0;
		i = k;
		k = l;
		continue; /* Loop/switch isn't completed */
		if(true) goto _L5; else goto _L4
_L4:
		int i1 = j;
	//   98  141:iload_2         
	//   99  142:istore          4
		if(i > 0)
	//* 100  144:iload_1         
	//* 101  145:ifle            177
		{
			i1 = ((int) (zeroruns[abyte0[k] & 0xff]));
	//  102  148:getstatic       #51  <Field byte[] zeroruns>
	//  103  151:aload_0         
	//  104  152:iload_3         
	//  105  153:baload          
	//  106  154:sipush          255
	//  107  157:iand            
	//  108  158:baload          
	//  109  159:istore          4
			k = i1;
	//  110  161:iload           4
	//  111  163:istore_3        
			if(i1 > i)
	//* 112  164:iload           4
	//* 113  166:iload_1         
	//* 114  167:icmple          172
				k = i;
	//  115  170:iload_1         
	//  116  171:istore_3        
			i1 = j + k;
	//  117  172:iload_2         
	//  118  173:iload_3         
	//  119  174:iadd            
	//  120  175:istore          4
		}
		return i1;
	//  121  177:iload           4
	//  122  179:ireturn         
	}

	private static int find1span(byte abyte0[], int i, int j, int k)
	{
		int l;
		k -= j;
	//    0    0:iload_3         
	//    1    1:iload_2         
	//    2    2:isub            
	//    3    3:istore_3        
		l = i + (j >> 3);
	//    4    4:iload_1         
	//    5    5:iload_2         
	//    6    6:iconst_3        
	//    7    7:ishr            
	//    8    8:iadd            
	//    9    9:istore          4
		if(k <= 0) goto _L2; else goto _L1
	//   10   11:iload_3         
	//   11   12:ifle            115
_L1:
		int j1 = j & 7;
	//   12   15:iload_2         
	//   13   16:bipush          7
	//   14   18:iand            
	//   15   19:istore          5
		if(j1 == 0) goto _L2; else goto _L3
	//   16   21:iload           5
	//   17   23:ifeq            115
_L3:
		j = ((int) (oneruns[abyte0[l] << j1 & 0xff]));
	//   18   26:getstatic       #53  <Field byte[] oneruns>
	//   19   29:aload_0         
	//   20   30:iload           4
	//   21   32:baload          
	//   22   33:iload           5
	//   23   35:ishl            
	//   24   36:sipush          255
	//   25   39:iand            
	//   26   40:baload          
	//   27   41:istore_2        
		i = j;
	//   28   42:iload_2         
	//   29   43:istore_1        
		if(j > 8 - j1)
	//*  30   44:iload_2         
	//*  31   45:bipush          8
	//*  32   47:iload           5
	//*  33   49:isub            
	//*  34   50:icmple          59
			i = 8 - j1;
	//   35   53:bipush          8
	//   36   55:iload           5
	//   37   57:isub            
	//   38   58:istore_1        
		j = i;
	//   39   59:iload_1         
	//   40   60:istore_2        
		if(i > k)
	//*  41   61:iload_1         
	//*  42   62:iload_3         
	//*  43   63:icmple          68
			j = k;
	//   44   66:iload_3         
	//   45   67:istore_2        
		if(j1 + j < 8)
	//*  46   68:iload           5
	//*  47   70:iload_2         
	//*  48   71:iadd            
	//*  49   72:bipush          8
	//*  50   74:icmpge          79
			return j;
	//   51   77:iload_2         
	//   52   78:ireturn         
		i = k - j;
	//   53   79:iload_3         
	//   54   80:iload_2         
	//   55   81:isub            
	//   56   82:istore_1        
		k = l + 1;
	//   57   83:iload           4
	//   58   85:iconst_1        
	//   59   86:iadd            
	//   60   87:istore_3        
_L5:
		if(i < 8)
			break; /* Loop/switch isn't completed */
	//   61   88:iload_1         
	//   62   89:bipush          8
	//   63   91:icmplt          142
		if(abyte0[k] != -1)
	//*  64   94:aload_0         
	//*  65   95:iload_3         
	//*  66   96:baload          
	//*  67   97:iconst_m1       
	//*  68   98:icmpeq          125
			return oneruns[abyte0[k] & 0xff] + j;
	//   69  101:getstatic       #53  <Field byte[] oneruns>
	//   70  104:aload_0         
	//   71  105:iload_3         
	//   72  106:baload          
	//   73  107:sipush          255
	//   74  110:iand            
	//   75  111:baload          
	//   76  112:iload_2         
	//   77  113:iadd            
	//   78  114:ireturn         
	//*  79  115:iconst_0        
	//*  80  116:istore_2        
	//*  81  117:iload_3         
	//*  82  118:istore_1        
	//*  83  119:iload           4
	//*  84  121:istore_3        
	//*  85  122:goto            88
		j += 8;
	//   86  125:iload_2         
	//   87  126:bipush          8
	//   88  128:iadd            
	//   89  129:istore_2        
		i -= 8;
	//   90  130:iload_1         
	//   91  131:bipush          8
	//   92  133:isub            
	//   93  134:istore_1        
		k++;
	//   94  135:iload_3         
	//   95  136:iconst_1        
	//   96  137:iadd            
	//   97  138:istore_3        
		continue; /* Loop/switch isn't completed */
	//   98  139:goto            88
_L2:
		j = 0;
		i = k;
		k = l;
		continue; /* Loop/switch isn't completed */
		if(true) goto _L5; else goto _L4
_L4:
		int i1 = j;
	//   99  142:iload_2         
	//  100  143:istore          4
		if(i > 0)
	//* 101  145:iload_1         
	//* 102  146:ifle            178
		{
			i1 = ((int) (oneruns[abyte0[k] & 0xff]));
	//  103  149:getstatic       #53  <Field byte[] oneruns>
	//  104  152:aload_0         
	//  105  153:iload_3         
	//  106  154:baload          
	//  107  155:sipush          255
	//  108  158:iand            
	//  109  159:baload          
	//  110  160:istore          4
			k = i1;
	//  111  162:iload           4
	//  112  164:istore_3        
			if(i1 > i)
	//* 113  165:iload           4
	//* 114  167:iload_1         
	//* 115  168:icmple          173
				k = i;
	//  116  171:iload_1         
	//  117  172:istore_3        
			i1 = j + k;
	//  118  173:iload_2         
	//  119  174:iload_3         
	//  120  175:iadd            
	//  121  176:istore          4
		}
		return i1;
	//  122  178:iload           4
	//  123  180:ireturn         
	}

	private static int finddiff(byte abyte0[], int i, int j, int k, int l)
	{
		if(l != 0)
	//*   0    0:iload           4
	//*   1    2:ifeq            17
			i = find1span(abyte0, i, j, k);
	//    2    5:aload_0         
	//    3    6:iload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:invokestatic    #136 <Method int find1span(byte[], int, int, int)>
	//    7   12:istore_1        
		else
	//*   8   13:iload_1         
	//*   9   14:iload_2         
	//*  10   15:iadd            
	//*  11   16:ireturn         
			i = find0span(abyte0, i, j, k);
	//   12   17:aload_0         
	//   13   18:iload_1         
	//   14   19:iload_2         
	//   15   20:iload_3         
	//   16   21:invokestatic    #138 <Method int find0span(byte[], int, int, int)>
	//   17   24:istore_1        
		return i + j;
	//*  18   25:goto            13
	}

	private static int finddiff2(byte abyte0[], int i, int j, int k, int l)
	{
		int i1 = k;
	//    0    0:iload_3         
	//    1    1:istore          5
		if(j < k)
	//*   2    3:iload_2         
	//*   3    4:iload_3         
	//*   4    5:icmpge          19
			i1 = finddiff(abyte0, i, j, k, l);
	//    5    8:aload_0         
	//    6    9:iload_1         
	//    7   10:iload_2         
	//    8   11:iload_3         
	//    9   12:iload           4
	//   10   14:invokestatic    #109 <Method int finddiff(byte[], int, int, int, int)>
	//   11   17:istore          5
		return i1;
	//   12   19:iload           5
	//   13   21:ireturn         
	}

	private int pixel(byte abyte0[], int i, int j)
	{
		if(j >= rowpixels)
	//*   0    0:iload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #81  <Field int rowpixels>
	//*   3    5:icmplt          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return (abyte0[(j >> 3) + i] & 0xff) >> 7 - (j & 7) & 1;
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:iconst_3        
	//    9   13:ishr            
	//   10   14:iload_2         
	//   11   15:iadd            
	//   12   16:baload          
	//   13   17:sipush          255
	//   14   20:iand            
	//   15   21:bipush          7
	//   16   23:iload_3         
	//   17   24:bipush          7
	//   18   26:iand            
	//   19   27:isub            
	//   20   28:ishr            
	//   21   29:iconst_1        
	//   22   30:iand            
	//   23   31:ireturn         
	}

	private void putBits(int i, int j)
	{
		for(; j > bit; bit = 8)
	//*   0    0:iload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #60  <Field int bit>
	//*   3    5:icmple          59
		{
			data = data | i >> j - bit;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field int data>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #60  <Field int bit>
	//   11   19:isub            
	//   12   20:ishr            
	//   13   21:ior             
	//   14   22:putfield        #116 <Field int data>
			j -= bit;
	//   15   25:iload_2         
	//   16   26:aload_0         
	//   17   27:getfield        #60  <Field int bit>
	//   18   30:isub            
	//   19   31:istore_2        
			outBuf.append((byte)data);
	//   20   32:aload_0         
	//   21   33:getfield        #66  <Field ByteBuffer outBuf>
	//   22   36:aload_0         
	//   23   37:getfield        #116 <Field int data>
	//   24   40:int2byte        
	//   25   41:invokevirtual   #120 <Method ByteBuffer ByteBuffer.append(byte)>
	//   26   44:pop             
			data = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #116 <Field int data>
		}

	//   30   50:aload_0         
	//   31   51:bipush          8
	//   32   53:putfield        #60  <Field int bit>
	//*  33   56:goto            0
		data = data | (msbmask[j] & i) << bit - j;
	//   34   59:aload_0         
	//   35   60:aload_0         
	//   36   61:getfield        #116 <Field int data>
	//   37   64:aload_0         
	//   38   65:getfield        #79  <Field int[] msbmask>
	//   39   68:iload_2         
	//   40   69:iaload          
	//   41   70:iload_1         
	//   42   71:iand            
	//   43   72:aload_0         
	//   44   73:getfield        #60  <Field int bit>
	//   45   76:iload_2         
	//   46   77:isub            
	//   47   78:ishl            
	//   48   79:ior             
	//   49   80:putfield        #116 <Field int data>
		bit = bit - j;
	//   50   83:aload_0         
	//   51   84:aload_0         
	//   52   85:getfield        #60  <Field int bit>
	//   53   88:iload_2         
	//   54   89:isub            
	//   55   90:putfield        #60  <Field int bit>
		if(bit == 0)
	//*  56   93:aload_0         
	//*  57   94:getfield        #60  <Field int bit>
	//*  58   97:ifne            124
		{
			outBuf.append((byte)data);
	//   59  100:aload_0         
	//   60  101:getfield        #66  <Field ByteBuffer outBuf>
	//   61  104:aload_0         
	//   62  105:getfield        #116 <Field int data>
	//   63  108:int2byte        
	//   64  109:invokevirtual   #120 <Method ByteBuffer ByteBuffer.append(byte)>
	//   65  112:pop             
			data = 0;
	//   66  113:aload_0         
	//   67  114:iconst_0        
	//   68  115:putfield        #116 <Field int data>
			bit = 8;
	//   69  118:aload_0         
	//   70  119:bipush          8
	//   71  121:putfield        #60  <Field int bit>
		}
	//   72  124:return          
	}

	private void putcode(int ai[])
	{
		putBits(ai[1], ai[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iaload          
	//    4    4:aload_1         
	//    5    5:iconst_0        
	//    6    6:iaload          
	//    7    7:invokespecial   #114 <Method void putBits(int, int)>
	//    8   10:return          
	}

	private void putspan(int i, int ai[][])
	{
		int ai1[];
		for(; i >= 2624; i -= ai1[2])
	//*   0    0:iload_1         
	//*   1    1:sipush          2624
	//*   2    4:icmplt          35
		{
			ai1 = ai[103];
	//    3    7:aload_2         
	//    4    8:bipush          103
	//    5   10:aaload          
	//    6   11:astore          4
			putBits(ai1[1], ai1[0]);
	//    7   13:aload_0         
	//    8   14:aload           4
	//    9   16:iconst_1        
	//   10   17:iaload          
	//   11   18:aload           4
	//   12   20:iconst_0        
	//   13   21:iaload          
	//   14   22:invokespecial   #114 <Method void putBits(int, int)>
		}

	//   15   25:iload_1         
	//   16   26:aload           4
	//   17   28:iconst_2        
	//   18   29:iaload          
	//   19   30:isub            
	//   20   31:istore_1        
	//*  21   32:goto            0
		int j = i;
	//   22   35:iload_1         
	//   23   36:istore_3        
		if(i >= 64)
	//*  24   37:iload_1         
	//*  25   38:bipush          64
	//*  26   40:icmplt          73
		{
			int ai2[] = ai[(i >> 6) + 63];
	//   27   43:aload_2         
	//   28   44:iload_1         
	//   29   45:bipush          6
	//   30   47:ishr            
	//   31   48:bipush          63
	//   32   50:iadd            
	//   33   51:aaload          
	//   34   52:astore          4
			putBits(ai2[1], ai2[0]);
	//   35   54:aload_0         
	//   36   55:aload           4
	//   37   57:iconst_1        
	//   38   58:iaload          
	//   39   59:aload           4
	//   40   61:iconst_0        
	//   41   62:iaload          
	//   42   63:invokespecial   #114 <Method void putBits(int, int)>
			j = i - ai2[2];
	//   43   66:iload_1         
	//   44   67:aload           4
	//   45   69:iconst_2        
	//   46   70:iaload          
	//   47   71:isub            
	//   48   72:istore_3        
		}
		putBits(ai[j][1], ai[j][0]);
	//   49   73:aload_0         
	//   50   74:aload_2         
	//   51   75:iload_3         
	//   52   76:aaload          
	//   53   77:iconst_1        
	//   54   78:iaload          
	//   55   79:aload_2         
	//   56   80:iload_3         
	//   57   81:aaload          
	//   58   82:iconst_0        
	//   59   83:iaload          
	//   60   84:invokespecial   #114 <Method void putBits(int, int)>
	//   61   87:return          
	}

	public byte[] close()
	{
		Fax4PostEncode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #140 <Method void Fax4PostEncode()>
		return outBuf.toByteArray();
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field ByteBuffer outBuf>
	//    4    8:invokevirtual   #143 <Method byte[] ByteBuffer.toByteArray()>
	//    5   11:areturn         
	}

	public void fax4Encode(byte abyte0[], int i)
	{
		fax4Encode(abyte0, 0, rowbytes * i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:getfield        #83  <Field int rowbytes>
	//    5    7:iload_2         
	//    6    8:imul            
	//    7    9:invokevirtual   #127 <Method void fax4Encode(byte[], int, int)>
	//    8   12:return          
	}

	public void fax4Encode(byte abyte0[], int i, int j)
	{
		dataBp = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field byte[] dataBp>
		offsetData = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #90  <Field int offsetData>
		for(sizeData = j; sizeData > 0; sizeData = sizeData - rowbytes)
	//*   6   10:aload_0         
	//*   7   11:iload_3         
	//*   8   12:putfield        #146 <Field int sizeData>
	//*   9   15:aload_0         
	//*  10   16:getfield        #146 <Field int sizeData>
	//*  11   19:ifle            75
		{
			Fax3Encode2DRow();
	//   12   22:aload_0         
	//   13   23:invokespecial   #148 <Method void Fax3Encode2DRow()>
			System.arraycopy(((Object) (dataBp)), offsetData, ((Object) (refline)), 0, rowbytes);
	//   14   26:aload_0         
	//   15   27:getfield        #88  <Field byte[] dataBp>
	//   16   30:aload_0         
	//   17   31:getfield        #90  <Field int offsetData>
	//   18   34:aload_0         
	//   19   35:getfield        #85  <Field byte[] refline>
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:getfield        #83  <Field int rowbytes>
	//   23   43:invokestatic    #154 <Method void System.arraycopy(Object, int, Object, int, int)>
			offsetData = offsetData + rowbytes;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #90  <Field int offsetData>
	//   27   51:aload_0         
	//   28   52:getfield        #83  <Field int rowbytes>
	//   29   55:iadd            
	//   30   56:putfield        #90  <Field int offsetData>
		}

	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #146 <Field int sizeData>
	//   34   64:aload_0         
	//   35   65:getfield        #83  <Field int rowbytes>
	//   36   68:isub            
	//   37   69:putfield        #146 <Field int sizeData>
	//*  38   72:goto            15
	//   39   75:return          
	}

	private static final int CODE = 1;
	private static final int EOL = 1;
	private static final int G3CODE_EOF = -3;
	private static final int G3CODE_EOL = -1;
	private static final int G3CODE_INCOMP = -4;
	private static final int G3CODE_INVALID = -2;
	private static final int LENGTH = 0;
	private static final int RUNLEN = 2;
	private static byte oneruns[] = {
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 
		3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
		4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 
		5, 5, 6, 6, 7, 8
	};
	private static byte zeroruns[] = {
		8, 7, 6, 6, 5, 5, 5, 5, 4, 4, 
		4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 
		3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
		3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0
	};
	private int TIFFFaxBlackCodes[][];
	private int TIFFFaxWhiteCodes[][];
	private int bit;
	private int data;
	private byte dataBp[];
	private int horizcode[] = {
		3, 1, 0
	};
	private int msbmask[] = {
		0, 1, 3, 7, 15, 31, 63, 127, 255
	};
	private int offsetData;
	private ByteBuffer outBuf;
	private int passcode[] = {
		4, 1, 0
	};
	private byte refline[];
	private int rowbytes;
	private int rowpixels;
	private int sizeData;
	private int vcodes[][];

	static 
	{
	//    0    0:sipush          256
	//    1    3:newarray        byte[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #44  <Int 8>
	//    5    9:bastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #45  <Int 7>
	//    9   14:bastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #46  <Int 6>
	//   13   19:bastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #46  <Int 6>
	//   17   24:bastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #47  <Int 5>
	//   21   29:bastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #47  <Int 5>
	//   25   34:bastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #47  <Int 5>
	//   29   40:bastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #47  <Int 5>
	//   33   46:bastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #48  <Int 4>
	//   37   52:bastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #48  <Int 4>
	//   41   58:bastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #48  <Int 4>
	//   45   64:bastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #48  <Int 4>
	//   49   70:bastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #48  <Int 4>
	//   53   76:bastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #48  <Int 4>
	//   57   82:bastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #48  <Int 4>
	//   61   88:bastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #48  <Int 4>
	//   65   94:bastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #49  <Int 3>
	//   69  100:bastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #49  <Int 3>
	//   73  106:bastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #49  <Int 3>
	//   77  112:bastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #49  <Int 3>
	//   81  118:bastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #49  <Int 3>
	//   85  124:bastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #49  <Int 3>
	//   89  130:bastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #49  <Int 3>
	//   93  136:bastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #49  <Int 3>
	//   97  142:bastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #49  <Int 3>
	//  101  148:bastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #49  <Int 3>
	//  105  154:bastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #49  <Int 3>
	//  109  160:bastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #49  <Int 3>
	//  113  166:bastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #49  <Int 3>
	//  117  172:bastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #49  <Int 3>
	//  121  178:bastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #49  <Int 3>
	//  125  184:bastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #49  <Int 3>
	//  129  190:bastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #20  <Int 2>
	//  133  196:bastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #20  <Int 2>
	//  137  202:bastore         
	//  138  203:dup             
	//  139  204:bipush          34
	//  140  206:ldc1            #20  <Int 2>
	//  141  208:bastore         
	//  142  209:dup             
	//  143  210:bipush          35
	//  144  212:ldc1            #20  <Int 2>
	//  145  214:bastore         
	//  146  215:dup             
	//  147  216:bipush          36
	//  148  218:ldc1            #20  <Int 2>
	//  149  220:bastore         
	//  150  221:dup             
	//  151  222:bipush          37
	//  152  224:ldc1            #20  <Int 2>
	//  153  226:bastore         
	//  154  227:dup             
	//  155  228:bipush          38
	//  156  230:ldc1            #20  <Int 2>
	//  157  232:bastore         
	//  158  233:dup             
	//  159  234:bipush          39
	//  160  236:ldc1            #20  <Int 2>
	//  161  238:bastore         
	//  162  239:dup             
	//  163  240:bipush          40
	//  164  242:ldc1            #20  <Int 2>
	//  165  244:bastore         
	//  166  245:dup             
	//  167  246:bipush          41
	//  168  248:ldc1            #20  <Int 2>
	//  169  250:bastore         
	//  170  251:dup             
	//  171  252:bipush          42
	//  172  254:ldc1            #20  <Int 2>
	//  173  256:bastore         
	//  174  257:dup             
	//  175  258:bipush          43
	//  176  260:ldc1            #20  <Int 2>
	//  177  262:bastore         
	//  178  263:dup             
	//  179  264:bipush          44
	//  180  266:ldc1            #20  <Int 2>
	//  181  268:bastore         
	//  182  269:dup             
	//  183  270:bipush          45
	//  184  272:ldc1            #20  <Int 2>
	//  185  274:bastore         
	//  186  275:dup             
	//  187  276:bipush          46
	//  188  278:ldc1            #20  <Int 2>
	//  189  280:bastore         
	//  190  281:dup             
	//  191  282:bipush          47
	//  192  284:ldc1            #20  <Int 2>
	//  193  286:bastore         
	//  194  287:dup             
	//  195  288:bipush          48
	//  196  290:ldc1            #20  <Int 2>
	//  197  292:bastore         
	//  198  293:dup             
	//  199  294:bipush          49
	//  200  296:ldc1            #20  <Int 2>
	//  201  298:bastore         
	//  202  299:dup             
	//  203  300:bipush          50
	//  204  302:ldc1            #20  <Int 2>
	//  205  304:bastore         
	//  206  305:dup             
	//  207  306:bipush          51
	//  208  308:ldc1            #20  <Int 2>
	//  209  310:bastore         
	//  210  311:dup             
	//  211  312:bipush          52
	//  212  314:ldc1            #20  <Int 2>
	//  213  316:bastore         
	//  214  317:dup             
	//  215  318:bipush          53
	//  216  320:ldc1            #20  <Int 2>
	//  217  322:bastore         
	//  218  323:dup             
	//  219  324:bipush          54
	//  220  326:ldc1            #20  <Int 2>
	//  221  328:bastore         
	//  222  329:dup             
	//  223  330:bipush          55
	//  224  332:ldc1            #20  <Int 2>
	//  225  334:bastore         
	//  226  335:dup             
	//  227  336:bipush          56
	//  228  338:ldc1            #20  <Int 2>
	//  229  340:bastore         
	//  230  341:dup             
	//  231  342:bipush          57
	//  232  344:ldc1            #20  <Int 2>
	//  233  346:bastore         
	//  234  347:dup             
	//  235  348:bipush          58
	//  236  350:ldc1            #20  <Int 2>
	//  237  352:bastore         
	//  238  353:dup             
	//  239  354:bipush          59
	//  240  356:ldc1            #20  <Int 2>
	//  241  358:bastore         
	//  242  359:dup             
	//  243  360:bipush          60
	//  244  362:ldc1            #20  <Int 2>
	//  245  364:bastore         
	//  246  365:dup             
	//  247  366:bipush          61
	//  248  368:ldc1            #20  <Int 2>
	//  249  370:bastore         
	//  250  371:dup             
	//  251  372:bipush          62
	//  252  374:ldc1            #20  <Int 2>
	//  253  376:bastore         
	//  254  377:dup             
	//  255  378:bipush          63
	//  256  380:ldc1            #20  <Int 2>
	//  257  382:bastore         
	//  258  383:dup             
	//  259  384:bipush          64
	//  260  386:ldc1            #7   <Int 1>
	//  261  388:bastore         
	//  262  389:dup             
	//  263  390:bipush          65
	//  264  392:ldc1            #7   <Int 1>
	//  265  394:bastore         
	//  266  395:dup             
	//  267  396:bipush          66
	//  268  398:ldc1            #7   <Int 1>
	//  269  400:bastore         
	//  270  401:dup             
	//  271  402:bipush          67
	//  272  404:ldc1            #7   <Int 1>
	//  273  406:bastore         
	//  274  407:dup             
	//  275  408:bipush          68
	//  276  410:ldc1            #7   <Int 1>
	//  277  412:bastore         
	//  278  413:dup             
	//  279  414:bipush          69
	//  280  416:ldc1            #7   <Int 1>
	//  281  418:bastore         
	//  282  419:dup             
	//  283  420:bipush          70
	//  284  422:ldc1            #7   <Int 1>
	//  285  424:bastore         
	//  286  425:dup             
	//  287  426:bipush          71
	//  288  428:ldc1            #7   <Int 1>
	//  289  430:bastore         
	//  290  431:dup             
	//  291  432:bipush          72
	//  292  434:ldc1            #7   <Int 1>
	//  293  436:bastore         
	//  294  437:dup             
	//  295  438:bipush          73
	//  296  440:ldc1            #7   <Int 1>
	//  297  442:bastore         
	//  298  443:dup             
	//  299  444:bipush          74
	//  300  446:ldc1            #7   <Int 1>
	//  301  448:bastore         
	//  302  449:dup             
	//  303  450:bipush          75
	//  304  452:ldc1            #7   <Int 1>
	//  305  454:bastore         
	//  306  455:dup             
	//  307  456:bipush          76
	//  308  458:ldc1            #7   <Int 1>
	//  309  460:bastore         
	//  310  461:dup             
	//  311  462:bipush          77
	//  312  464:ldc1            #7   <Int 1>
	//  313  466:bastore         
	//  314  467:dup             
	//  315  468:bipush          78
	//  316  470:ldc1            #7   <Int 1>
	//  317  472:bastore         
	//  318  473:dup             
	//  319  474:bipush          79
	//  320  476:ldc1            #7   <Int 1>
	//  321  478:bastore         
	//  322  479:dup             
	//  323  480:bipush          80
	//  324  482:ldc1            #7   <Int 1>
	//  325  484:bastore         
	//  326  485:dup             
	//  327  486:bipush          81
	//  328  488:ldc1            #7   <Int 1>
	//  329  490:bastore         
	//  330  491:dup             
	//  331  492:bipush          82
	//  332  494:ldc1            #7   <Int 1>
	//  333  496:bastore         
	//  334  497:dup             
	//  335  498:bipush          83
	//  336  500:ldc1            #7   <Int 1>
	//  337  502:bastore         
	//  338  503:dup             
	//  339  504:bipush          84
	//  340  506:ldc1            #7   <Int 1>
	//  341  508:bastore         
	//  342  509:dup             
	//  343  510:bipush          85
	//  344  512:ldc1            #7   <Int 1>
	//  345  514:bastore         
	//  346  515:dup             
	//  347  516:bipush          86
	//  348  518:ldc1            #7   <Int 1>
	//  349  520:bastore         
	//  350  521:dup             
	//  351  522:bipush          87
	//  352  524:ldc1            #7   <Int 1>
	//  353  526:bastore         
	//  354  527:dup             
	//  355  528:bipush          88
	//  356  530:ldc1            #7   <Int 1>
	//  357  532:bastore         
	//  358  533:dup             
	//  359  534:bipush          89
	//  360  536:ldc1            #7   <Int 1>
	//  361  538:bastore         
	//  362  539:dup             
	//  363  540:bipush          90
	//  364  542:ldc1            #7   <Int 1>
	//  365  544:bastore         
	//  366  545:dup             
	//  367  546:bipush          91
	//  368  548:ldc1            #7   <Int 1>
	//  369  550:bastore         
	//  370  551:dup             
	//  371  552:bipush          92
	//  372  554:ldc1            #7   <Int 1>
	//  373  556:bastore         
	//  374  557:dup             
	//  375  558:bipush          93
	//  376  560:ldc1            #7   <Int 1>
	//  377  562:bastore         
	//  378  563:dup             
	//  379  564:bipush          94
	//  380  566:ldc1            #7   <Int 1>
	//  381  568:bastore         
	//  382  569:dup             
	//  383  570:bipush          95
	//  384  572:ldc1            #7   <Int 1>
	//  385  574:bastore         
	//  386  575:dup             
	//  387  576:bipush          96
	//  388  578:ldc1            #7   <Int 1>
	//  389  580:bastore         
	//  390  581:dup             
	//  391  582:bipush          97
	//  392  584:ldc1            #7   <Int 1>
	//  393  586:bastore         
	//  394  587:dup             
	//  395  588:bipush          98
	//  396  590:ldc1            #7   <Int 1>
	//  397  592:bastore         
	//  398  593:dup             
	//  399  594:bipush          99
	//  400  596:ldc1            #7   <Int 1>
	//  401  598:bastore         
	//  402  599:dup             
	//  403  600:bipush          100
	//  404  602:ldc1            #7   <Int 1>
	//  405  604:bastore         
	//  406  605:dup             
	//  407  606:bipush          101
	//  408  608:ldc1            #7   <Int 1>
	//  409  610:bastore         
	//  410  611:dup             
	//  411  612:bipush          102
	//  412  614:ldc1            #7   <Int 1>
	//  413  616:bastore         
	//  414  617:dup             
	//  415  618:bipush          103
	//  416  620:ldc1            #7   <Int 1>
	//  417  622:bastore         
	//  418  623:dup             
	//  419  624:bipush          104
	//  420  626:ldc1            #7   <Int 1>
	//  421  628:bastore         
	//  422  629:dup             
	//  423  630:bipush          105
	//  424  632:ldc1            #7   <Int 1>
	//  425  634:bastore         
	//  426  635:dup             
	//  427  636:bipush          106
	//  428  638:ldc1            #7   <Int 1>
	//  429  640:bastore         
	//  430  641:dup             
	//  431  642:bipush          107
	//  432  644:ldc1            #7   <Int 1>
	//  433  646:bastore         
	//  434  647:dup             
	//  435  648:bipush          108
	//  436  650:ldc1            #7   <Int 1>
	//  437  652:bastore         
	//  438  653:dup             
	//  439  654:bipush          109
	//  440  656:ldc1            #7   <Int 1>
	//  441  658:bastore         
	//  442  659:dup             
	//  443  660:bipush          110
	//  444  662:ldc1            #7   <Int 1>
	//  445  664:bastore         
	//  446  665:dup             
	//  447  666:bipush          111
	//  448  668:ldc1            #7   <Int 1>
	//  449  670:bastore         
	//  450  671:dup             
	//  451  672:bipush          112
	//  452  674:ldc1            #7   <Int 1>
	//  453  676:bastore         
	//  454  677:dup             
	//  455  678:bipush          113
	//  456  680:ldc1            #7   <Int 1>
	//  457  682:bastore         
	//  458  683:dup             
	//  459  684:bipush          114
	//  460  686:ldc1            #7   <Int 1>
	//  461  688:bastore         
	//  462  689:dup             
	//  463  690:bipush          115
	//  464  692:ldc1            #7   <Int 1>
	//  465  694:bastore         
	//  466  695:dup             
	//  467  696:bipush          116
	//  468  698:ldc1            #7   <Int 1>
	//  469  700:bastore         
	//  470  701:dup             
	//  471  702:bipush          117
	//  472  704:ldc1            #7   <Int 1>
	//  473  706:bastore         
	//  474  707:dup             
	//  475  708:bipush          118
	//  476  710:ldc1            #7   <Int 1>
	//  477  712:bastore         
	//  478  713:dup             
	//  479  714:bipush          119
	//  480  716:ldc1            #7   <Int 1>
	//  481  718:bastore         
	//  482  719:dup             
	//  483  720:bipush          120
	//  484  722:ldc1            #7   <Int 1>
	//  485  724:bastore         
	//  486  725:dup             
	//  487  726:bipush          121
	//  488  728:ldc1            #7   <Int 1>
	//  489  730:bastore         
	//  490  731:dup             
	//  491  732:bipush          122
	//  492  734:ldc1            #7   <Int 1>
	//  493  736:bastore         
	//  494  737:dup             
	//  495  738:bipush          123
	//  496  740:ldc1            #7   <Int 1>
	//  497  742:bastore         
	//  498  743:dup             
	//  499  744:bipush          124
	//  500  746:ldc1            #7   <Int 1>
	//  501  748:bastore         
	//  502  749:dup             
	//  503  750:bipush          125
	//  504  752:ldc1            #7   <Int 1>
	//  505  754:bastore         
	//  506  755:dup             
	//  507  756:bipush          126
	//  508  758:ldc1            #7   <Int 1>
	//  509  760:bastore         
	//  510  761:dup             
	//  511  762:bipush          127
	//  512  764:ldc1            #7   <Int 1>
	//  513  766:bastore         
	//  514  767:dup             
	//  515  768:sipush          128
	//  516  771:ldc1            #18  <Int 0>
	//  517  773:bastore         
	//  518  774:dup             
	//  519  775:sipush          129
	//  520  778:ldc1            #18  <Int 0>
	//  521  780:bastore         
	//  522  781:dup             
	//  523  782:sipush          130
	//  524  785:ldc1            #18  <Int 0>
	//  525  787:bastore         
	//  526  788:dup             
	//  527  789:sipush          131
	//  528  792:ldc1            #18  <Int 0>
	//  529  794:bastore         
	//  530  795:dup             
	//  531  796:sipush          132
	//  532  799:ldc1            #18  <Int 0>
	//  533  801:bastore         
	//  534  802:dup             
	//  535  803:sipush          133
	//  536  806:ldc1            #18  <Int 0>
	//  537  808:bastore         
	//  538  809:dup             
	//  539  810:sipush          134
	//  540  813:ldc1            #18  <Int 0>
	//  541  815:bastore         
	//  542  816:dup             
	//  543  817:sipush          135
	//  544  820:ldc1            #18  <Int 0>
	//  545  822:bastore         
	//  546  823:dup             
	//  547  824:sipush          136
	//  548  827:ldc1            #18  <Int 0>
	//  549  829:bastore         
	//  550  830:dup             
	//  551  831:sipush          137
	//  552  834:ldc1            #18  <Int 0>
	//  553  836:bastore         
	//  554  837:dup             
	//  555  838:sipush          138
	//  556  841:ldc1            #18  <Int 0>
	//  557  843:bastore         
	//  558  844:dup             
	//  559  845:sipush          139
	//  560  848:ldc1            #18  <Int 0>
	//  561  850:bastore         
	//  562  851:dup             
	//  563  852:sipush          140
	//  564  855:ldc1            #18  <Int 0>
	//  565  857:bastore         
	//  566  858:dup             
	//  567  859:sipush          141
	//  568  862:ldc1            #18  <Int 0>
	//  569  864:bastore         
	//  570  865:dup             
	//  571  866:sipush          142
	//  572  869:ldc1            #18  <Int 0>
	//  573  871:bastore         
	//  574  872:dup             
	//  575  873:sipush          143
	//  576  876:ldc1            #18  <Int 0>
	//  577  878:bastore         
	//  578  879:dup             
	//  579  880:sipush          144
	//  580  883:ldc1            #18  <Int 0>
	//  581  885:bastore         
	//  582  886:dup             
	//  583  887:sipush          145
	//  584  890:ldc1            #18  <Int 0>
	//  585  892:bastore         
	//  586  893:dup             
	//  587  894:sipush          146
	//  588  897:ldc1            #18  <Int 0>
	//  589  899:bastore         
	//  590  900:dup             
	//  591  901:sipush          147
	//  592  904:ldc1            #18  <Int 0>
	//  593  906:bastore         
	//  594  907:dup             
	//  595  908:sipush          148
	//  596  911:ldc1            #18  <Int 0>
	//  597  913:bastore         
	//  598  914:dup             
	//  599  915:sipush          149
	//  600  918:ldc1            #18  <Int 0>
	//  601  920:bastore         
	//  602  921:dup             
	//  603  922:sipush          150
	//  604  925:ldc1            #18  <Int 0>
	//  605  927:bastore         
	//  606  928:dup             
	//  607  929:sipush          151
	//  608  932:ldc1            #18  <Int 0>
	//  609  934:bastore         
	//  610  935:dup             
	//  611  936:sipush          152
	//  612  939:ldc1            #18  <Int 0>
	//  613  941:bastore         
	//  614  942:dup             
	//  615  943:sipush          153
	//  616  946:ldc1            #18  <Int 0>
	//  617  948:bastore         
	//  618  949:dup             
	//  619  950:sipush          154
	//  620  953:ldc1            #18  <Int 0>
	//  621  955:bastore         
	//  622  956:dup             
	//  623  957:sipush          155
	//  624  960:ldc1            #18  <Int 0>
	//  625  962:bastore         
	//  626  963:dup             
	//  627  964:sipush          156
	//  628  967:ldc1            #18  <Int 0>
	//  629  969:bastore         
	//  630  970:dup             
	//  631  971:sipush          157
	//  632  974:ldc1            #18  <Int 0>
	//  633  976:bastore         
	//  634  977:dup             
	//  635  978:sipush          158
	//  636  981:ldc1            #18  <Int 0>
	//  637  983:bastore         
	//  638  984:dup             
	//  639  985:sipush          159
	//  640  988:ldc1            #18  <Int 0>
	//  641  990:bastore         
	//  642  991:dup             
	//  643  992:sipush          160
	//  644  995:ldc1            #18  <Int 0>
	//  645  997:bastore         
	//  646  998:dup             
	//  647  999:sipush          161
	//  648 1002:ldc1            #18  <Int 0>
	//  649 1004:bastore         
	//  650 1005:dup             
	//  651 1006:sipush          162
	//  652 1009:ldc1            #18  <Int 0>
	//  653 1011:bastore         
	//  654 1012:dup             
	//  655 1013:sipush          163
	//  656 1016:ldc1            #18  <Int 0>
	//  657 1018:bastore         
	//  658 1019:dup             
	//  659 1020:sipush          164
	//  660 1023:ldc1            #18  <Int 0>
	//  661 1025:bastore         
	//  662 1026:dup             
	//  663 1027:sipush          165
	//  664 1030:ldc1            #18  <Int 0>
	//  665 1032:bastore         
	//  666 1033:dup             
	//  667 1034:sipush          166
	//  668 1037:ldc1            #18  <Int 0>
	//  669 1039:bastore         
	//  670 1040:dup             
	//  671 1041:sipush          167
	//  672 1044:ldc1            #18  <Int 0>
	//  673 1046:bastore         
	//  674 1047:dup             
	//  675 1048:sipush          168
	//  676 1051:ldc1            #18  <Int 0>
	//  677 1053:bastore         
	//  678 1054:dup             
	//  679 1055:sipush          169
	//  680 1058:ldc1            #18  <Int 0>
	//  681 1060:bastore         
	//  682 1061:dup             
	//  683 1062:sipush          170
	//  684 1065:ldc1            #18  <Int 0>
	//  685 1067:bastore         
	//  686 1068:dup             
	//  687 1069:sipush          171
	//  688 1072:ldc1            #18  <Int 0>
	//  689 1074:bastore         
	//  690 1075:dup             
	//  691 1076:sipush          172
	//  692 1079:ldc1            #18  <Int 0>
	//  693 1081:bastore         
	//  694 1082:dup             
	//  695 1083:sipush          173
	//  696 1086:ldc1            #18  <Int 0>
	//  697 1088:bastore         
	//  698 1089:dup             
	//  699 1090:sipush          174
	//  700 1093:ldc1            #18  <Int 0>
	//  701 1095:bastore         
	//  702 1096:dup             
	//  703 1097:sipush          175
	//  704 1100:ldc1            #18  <Int 0>
	//  705 1102:bastore         
	//  706 1103:dup             
	//  707 1104:sipush          176
	//  708 1107:ldc1            #18  <Int 0>
	//  709 1109:bastore         
	//  710 1110:dup             
	//  711 1111:sipush          177
	//  712 1114:ldc1            #18  <Int 0>
	//  713 1116:bastore         
	//  714 1117:dup             
	//  715 1118:sipush          178
	//  716 1121:ldc1            #18  <Int 0>
	//  717 1123:bastore         
	//  718 1124:dup             
	//  719 1125:sipush          179
	//  720 1128:ldc1            #18  <Int 0>
	//  721 1130:bastore         
	//  722 1131:dup             
	//  723 1132:sipush          180
	//  724 1135:ldc1            #18  <Int 0>
	//  725 1137:bastore         
	//  726 1138:dup             
	//  727 1139:sipush          181
	//  728 1142:ldc1            #18  <Int 0>
	//  729 1144:bastore         
	//  730 1145:dup             
	//  731 1146:sipush          182
	//  732 1149:ldc1            #18  <Int 0>
	//  733 1151:bastore         
	//  734 1152:dup             
	//  735 1153:sipush          183
	//  736 1156:ldc1            #18  <Int 0>
	//  737 1158:bastore         
	//  738 1159:dup             
	//  739 1160:sipush          184
	//  740 1163:ldc1            #18  <Int 0>
	//  741 1165:bastore         
	//  742 1166:dup             
	//  743 1167:sipush          185
	//  744 1170:ldc1            #18  <Int 0>
	//  745 1172:bastore         
	//  746 1173:dup             
	//  747 1174:sipush          186
	//  748 1177:ldc1            #18  <Int 0>
	//  749 1179:bastore         
	//  750 1180:dup             
	//  751 1181:sipush          187
	//  752 1184:ldc1            #18  <Int 0>
	//  753 1186:bastore         
	//  754 1187:dup             
	//  755 1188:sipush          188
	//  756 1191:ldc1            #18  <Int 0>
	//  757 1193:bastore         
	//  758 1194:dup             
	//  759 1195:sipush          189
	//  760 1198:ldc1            #18  <Int 0>
	//  761 1200:bastore         
	//  762 1201:dup             
	//  763 1202:sipush          190
	//  764 1205:ldc1            #18  <Int 0>
	//  765 1207:bastore         
	//  766 1208:dup             
	//  767 1209:sipush          191
	//  768 1212:ldc1            #18  <Int 0>
	//  769 1214:bastore         
	//  770 1215:dup             
	//  771 1216:sipush          192
	//  772 1219:ldc1            #18  <Int 0>
	//  773 1221:bastore         
	//  774 1222:dup             
	//  775 1223:sipush          193
	//  776 1226:ldc1            #18  <Int 0>
	//  777 1228:bastore         
	//  778 1229:dup             
	//  779 1230:sipush          194
	//  780 1233:ldc1            #18  <Int 0>
	//  781 1235:bastore         
	//  782 1236:dup             
	//  783 1237:sipush          195
	//  784 1240:ldc1            #18  <Int 0>
	//  785 1242:bastore         
	//  786 1243:dup             
	//  787 1244:sipush          196
	//  788 1247:ldc1            #18  <Int 0>
	//  789 1249:bastore         
	//  790 1250:dup             
	//  791 1251:sipush          197
	//  792 1254:ldc1            #18  <Int 0>
	//  793 1256:bastore         
	//  794 1257:dup             
	//  795 1258:sipush          198
	//  796 1261:ldc1            #18  <Int 0>
	//  797 1263:bastore         
	//  798 1264:dup             
	//  799 1265:sipush          199
	//  800 1268:ldc1            #18  <Int 0>
	//  801 1270:bastore         
	//  802 1271:dup             
	//  803 1272:sipush          200
	//  804 1275:ldc1            #18  <Int 0>
	//  805 1277:bastore         
	//  806 1278:dup             
	//  807 1279:sipush          201
	//  808 1282:ldc1            #18  <Int 0>
	//  809 1284:bastore         
	//  810 1285:dup             
	//  811 1286:sipush          202
	//  812 1289:ldc1            #18  <Int 0>
	//  813 1291:bastore         
	//  814 1292:dup             
	//  815 1293:sipush          203
	//  816 1296:ldc1            #18  <Int 0>
	//  817 1298:bastore         
	//  818 1299:dup             
	//  819 1300:sipush          204
	//  820 1303:ldc1            #18  <Int 0>
	//  821 1305:bastore         
	//  822 1306:dup             
	//  823 1307:sipush          205
	//  824 1310:ldc1            #18  <Int 0>
	//  825 1312:bastore         
	//  826 1313:dup             
	//  827 1314:sipush          206
	//  828 1317:ldc1            #18  <Int 0>
	//  829 1319:bastore         
	//  830 1320:dup             
	//  831 1321:sipush          207
	//  832 1324:ldc1            #18  <Int 0>
	//  833 1326:bastore         
	//  834 1327:dup             
	//  835 1328:sipush          208
	//  836 1331:ldc1            #18  <Int 0>
	//  837 1333:bastore         
	//  838 1334:dup             
	//  839 1335:sipush          209
	//  840 1338:ldc1            #18  <Int 0>
	//  841 1340:bastore         
	//  842 1341:dup             
	//  843 1342:sipush          210
	//  844 1345:ldc1            #18  <Int 0>
	//  845 1347:bastore         
	//  846 1348:dup             
	//  847 1349:sipush          211
	//  848 1352:ldc1            #18  <Int 0>
	//  849 1354:bastore         
	//  850 1355:dup             
	//  851 1356:sipush          212
	//  852 1359:ldc1            #18  <Int 0>
	//  853 1361:bastore         
	//  854 1362:dup             
	//  855 1363:sipush          213
	//  856 1366:ldc1            #18  <Int 0>
	//  857 1368:bastore         
	//  858 1369:dup             
	//  859 1370:sipush          214
	//  860 1373:ldc1            #18  <Int 0>
	//  861 1375:bastore         
	//  862 1376:dup             
	//  863 1377:sipush          215
	//  864 1380:ldc1            #18  <Int 0>
	//  865 1382:bastore         
	//  866 1383:dup             
	//  867 1384:sipush          216
	//  868 1387:ldc1            #18  <Int 0>
	//  869 1389:bastore         
	//  870 1390:dup             
	//  871 1391:sipush          217
	//  872 1394:ldc1            #18  <Int 0>
	//  873 1396:bastore         
	//  874 1397:dup             
	//  875 1398:sipush          218
	//  876 1401:ldc1            #18  <Int 0>
	//  877 1403:bastore         
	//  878 1404:dup             
	//  879 1405:sipush          219
	//  880 1408:ldc1            #18  <Int 0>
	//  881 1410:bastore         
	//  882 1411:dup             
	//  883 1412:sipush          220
	//  884 1415:ldc1            #18  <Int 0>
	//  885 1417:bastore         
	//  886 1418:dup             
	//  887 1419:sipush          221
	//  888 1422:ldc1            #18  <Int 0>
	//  889 1424:bastore         
	//  890 1425:dup             
	//  891 1426:sipush          222
	//  892 1429:ldc1            #18  <Int 0>
	//  893 1431:bastore         
	//  894 1432:dup             
	//  895 1433:sipush          223
	//  896 1436:ldc1            #18  <Int 0>
	//  897 1438:bastore         
	//  898 1439:dup             
	//  899 1440:sipush          224
	//  900 1443:ldc1            #18  <Int 0>
	//  901 1445:bastore         
	//  902 1446:dup             
	//  903 1447:sipush          225
	//  904 1450:ldc1            #18  <Int 0>
	//  905 1452:bastore         
	//  906 1453:dup             
	//  907 1454:sipush          226
	//  908 1457:ldc1            #18  <Int 0>
	//  909 1459:bastore         
	//  910 1460:dup             
	//  911 1461:sipush          227
	//  912 1464:ldc1            #18  <Int 0>
	//  913 1466:bastore         
	//  914 1467:dup             
	//  915 1468:sipush          228
	//  916 1471:ldc1            #18  <Int 0>
	//  917 1473:bastore         
	//  918 1474:dup             
	//  919 1475:sipush          229
	//  920 1478:ldc1            #18  <Int 0>
	//  921 1480:bastore         
	//  922 1481:dup             
	//  923 1482:sipush          230
	//  924 1485:ldc1            #18  <Int 0>
	//  925 1487:bastore         
	//  926 1488:dup             
	//  927 1489:sipush          231
	//  928 1492:ldc1            #18  <Int 0>
	//  929 1494:bastore         
	//  930 1495:dup             
	//  931 1496:sipush          232
	//  932 1499:ldc1            #18  <Int 0>
	//  933 1501:bastore         
	//  934 1502:dup             
	//  935 1503:sipush          233
	//  936 1506:ldc1            #18  <Int 0>
	//  937 1508:bastore         
	//  938 1509:dup             
	//  939 1510:sipush          234
	//  940 1513:ldc1            #18  <Int 0>
	//  941 1515:bastore         
	//  942 1516:dup             
	//  943 1517:sipush          235
	//  944 1520:ldc1            #18  <Int 0>
	//  945 1522:bastore         
	//  946 1523:dup             
	//  947 1524:sipush          236
	//  948 1527:ldc1            #18  <Int 0>
	//  949 1529:bastore         
	//  950 1530:dup             
	//  951 1531:sipush          237
	//  952 1534:ldc1            #18  <Int 0>
	//  953 1536:bastore         
	//  954 1537:dup             
	//  955 1538:sipush          238
	//  956 1541:ldc1            #18  <Int 0>
	//  957 1543:bastore         
	//  958 1544:dup             
	//  959 1545:sipush          239
	//  960 1548:ldc1            #18  <Int 0>
	//  961 1550:bastore         
	//  962 1551:dup             
	//  963 1552:sipush          240
	//  964 1555:ldc1            #18  <Int 0>
	//  965 1557:bastore         
	//  966 1558:dup             
	//  967 1559:sipush          241
	//  968 1562:ldc1            #18  <Int 0>
	//  969 1564:bastore         
	//  970 1565:dup             
	//  971 1566:sipush          242
	//  972 1569:ldc1            #18  <Int 0>
	//  973 1571:bastore         
	//  974 1572:dup             
	//  975 1573:sipush          243
	//  976 1576:ldc1            #18  <Int 0>
	//  977 1578:bastore         
	//  978 1579:dup             
	//  979 1580:sipush          244
	//  980 1583:ldc1            #18  <Int 0>
	//  981 1585:bastore         
	//  982 1586:dup             
	//  983 1587:sipush          245
	//  984 1590:ldc1            #18  <Int 0>
	//  985 1592:bastore         
	//  986 1593:dup             
	//  987 1594:sipush          246
	//  988 1597:ldc1            #18  <Int 0>
	//  989 1599:bastore         
	//  990 1600:dup             
	//  991 1601:sipush          247
	//  992 1604:ldc1            #18  <Int 0>
	//  993 1606:bastore         
	//  994 1607:dup             
	//  995 1608:sipush          248
	//  996 1611:ldc1            #18  <Int 0>
	//  997 1613:bastore         
	//  998 1614:dup             
	//  999 1615:sipush          249
	// 1000 1618:ldc1            #18  <Int 0>
	// 1001 1620:bastore         
	// 1002 1621:dup             
	// 1003 1622:sipush          250
	// 1004 1625:ldc1            #18  <Int 0>
	// 1005 1627:bastore         
	// 1006 1628:dup             
	// 1007 1629:sipush          251
	// 1008 1632:ldc1            #18  <Int 0>
	// 1009 1634:bastore         
	// 1010 1635:dup             
	// 1011 1636:sipush          252
	// 1012 1639:ldc1            #18  <Int 0>
	// 1013 1641:bastore         
	// 1014 1642:dup             
	// 1015 1643:sipush          253
	// 1016 1646:ldc1            #18  <Int 0>
	// 1017 1648:bastore         
	// 1018 1649:dup             
	// 1019 1650:sipush          254
	// 1020 1653:ldc1            #18  <Int 0>
	// 1021 1655:bastore         
	// 1022 1656:dup             
	// 1023 1657:sipush          255
	// 1024 1660:ldc1            #18  <Int 0>
	// 1025 1662:bastore         
	// 1026 1663:putstatic       #51  <Field byte[] zeroruns>
	// 1027 1666:sipush          256
	// 1028 1669:newarray        byte[]
	// 1029 1671:dup             
	// 1030 1672:iconst_0        
	// 1031 1673:ldc1            #18  <Int 0>
	// 1032 1675:bastore         
	// 1033 1676:dup             
	// 1034 1677:iconst_1        
	// 1035 1678:ldc1            #18  <Int 0>
	// 1036 1680:bastore         
	// 1037 1681:dup             
	// 1038 1682:iconst_2        
	// 1039 1683:ldc1            #18  <Int 0>
	// 1040 1685:bastore         
	// 1041 1686:dup             
	// 1042 1687:iconst_3        
	// 1043 1688:ldc1            #18  <Int 0>
	// 1044 1690:bastore         
	// 1045 1691:dup             
	// 1046 1692:iconst_4        
	// 1047 1693:ldc1            #18  <Int 0>
	// 1048 1695:bastore         
	// 1049 1696:dup             
	// 1050 1697:iconst_5        
	// 1051 1698:ldc1            #18  <Int 0>
	// 1052 1700:bastore         
	// 1053 1701:dup             
	// 1054 1702:bipush          6
	// 1055 1704:ldc1            #18  <Int 0>
	// 1056 1706:bastore         
	// 1057 1707:dup             
	// 1058 1708:bipush          7
	// 1059 1710:ldc1            #18  <Int 0>
	// 1060 1712:bastore         
	// 1061 1713:dup             
	// 1062 1714:bipush          8
	// 1063 1716:ldc1            #18  <Int 0>
	// 1064 1718:bastore         
	// 1065 1719:dup             
	// 1066 1720:bipush          9
	// 1067 1722:ldc1            #18  <Int 0>
	// 1068 1724:bastore         
	// 1069 1725:dup             
	// 1070 1726:bipush          10
	// 1071 1728:ldc1            #18  <Int 0>
	// 1072 1730:bastore         
	// 1073 1731:dup             
	// 1074 1732:bipush          11
	// 1075 1734:ldc1            #18  <Int 0>
	// 1076 1736:bastore         
	// 1077 1737:dup             
	// 1078 1738:bipush          12
	// 1079 1740:ldc1            #18  <Int 0>
	// 1080 1742:bastore         
	// 1081 1743:dup             
	// 1082 1744:bipush          13
	// 1083 1746:ldc1            #18  <Int 0>
	// 1084 1748:bastore         
	// 1085 1749:dup             
	// 1086 1750:bipush          14
	// 1087 1752:ldc1            #18  <Int 0>
	// 1088 1754:bastore         
	// 1089 1755:dup             
	// 1090 1756:bipush          15
	// 1091 1758:ldc1            #18  <Int 0>
	// 1092 1760:bastore         
	// 1093 1761:dup             
	// 1094 1762:bipush          16
	// 1095 1764:ldc1            #18  <Int 0>
	// 1096 1766:bastore         
	// 1097 1767:dup             
	// 1098 1768:bipush          17
	// 1099 1770:ldc1            #18  <Int 0>
	// 1100 1772:bastore         
	// 1101 1773:dup             
	// 1102 1774:bipush          18
	// 1103 1776:ldc1            #18  <Int 0>
	// 1104 1778:bastore         
	// 1105 1779:dup             
	// 1106 1780:bipush          19
	// 1107 1782:ldc1            #18  <Int 0>
	// 1108 1784:bastore         
	// 1109 1785:dup             
	// 1110 1786:bipush          20
	// 1111 1788:ldc1            #18  <Int 0>
	// 1112 1790:bastore         
	// 1113 1791:dup             
	// 1114 1792:bipush          21
	// 1115 1794:ldc1            #18  <Int 0>
	// 1116 1796:bastore         
	// 1117 1797:dup             
	// 1118 1798:bipush          22
	// 1119 1800:ldc1            #18  <Int 0>
	// 1120 1802:bastore         
	// 1121 1803:dup             
	// 1122 1804:bipush          23
	// 1123 1806:ldc1            #18  <Int 0>
	// 1124 1808:bastore         
	// 1125 1809:dup             
	// 1126 1810:bipush          24
	// 1127 1812:ldc1            #18  <Int 0>
	// 1128 1814:bastore         
	// 1129 1815:dup             
	// 1130 1816:bipush          25
	// 1131 1818:ldc1            #18  <Int 0>
	// 1132 1820:bastore         
	// 1133 1821:dup             
	// 1134 1822:bipush          26
	// 1135 1824:ldc1            #18  <Int 0>
	// 1136 1826:bastore         
	// 1137 1827:dup             
	// 1138 1828:bipush          27
	// 1139 1830:ldc1            #18  <Int 0>
	// 1140 1832:bastore         
	// 1141 1833:dup             
	// 1142 1834:bipush          28
	// 1143 1836:ldc1            #18  <Int 0>
	// 1144 1838:bastore         
	// 1145 1839:dup             
	// 1146 1840:bipush          29
	// 1147 1842:ldc1            #18  <Int 0>
	// 1148 1844:bastore         
	// 1149 1845:dup             
	// 1150 1846:bipush          30
	// 1151 1848:ldc1            #18  <Int 0>
	// 1152 1850:bastore         
	// 1153 1851:dup             
	// 1154 1852:bipush          31
	// 1155 1854:ldc1            #18  <Int 0>
	// 1156 1856:bastore         
	// 1157 1857:dup             
	// 1158 1858:bipush          32
	// 1159 1860:ldc1            #18  <Int 0>
	// 1160 1862:bastore         
	// 1161 1863:dup             
	// 1162 1864:bipush          33
	// 1163 1866:ldc1            #18  <Int 0>
	// 1164 1868:bastore         
	// 1165 1869:dup             
	// 1166 1870:bipush          34
	// 1167 1872:ldc1            #18  <Int 0>
	// 1168 1874:bastore         
	// 1169 1875:dup             
	// 1170 1876:bipush          35
	// 1171 1878:ldc1            #18  <Int 0>
	// 1172 1880:bastore         
	// 1173 1881:dup             
	// 1174 1882:bipush          36
	// 1175 1884:ldc1            #18  <Int 0>
	// 1176 1886:bastore         
	// 1177 1887:dup             
	// 1178 1888:bipush          37
	// 1179 1890:ldc1            #18  <Int 0>
	// 1180 1892:bastore         
	// 1181 1893:dup             
	// 1182 1894:bipush          38
	// 1183 1896:ldc1            #18  <Int 0>
	// 1184 1898:bastore         
	// 1185 1899:dup             
	// 1186 1900:bipush          39
	// 1187 1902:ldc1            #18  <Int 0>
	// 1188 1904:bastore         
	// 1189 1905:dup             
	// 1190 1906:bipush          40
	// 1191 1908:ldc1            #18  <Int 0>
	// 1192 1910:bastore         
	// 1193 1911:dup             
	// 1194 1912:bipush          41
	// 1195 1914:ldc1            #18  <Int 0>
	// 1196 1916:bastore         
	// 1197 1917:dup             
	// 1198 1918:bipush          42
	// 1199 1920:ldc1            #18  <Int 0>
	// 1200 1922:bastore         
	// 1201 1923:dup             
	// 1202 1924:bipush          43
	// 1203 1926:ldc1            #18  <Int 0>
	// 1204 1928:bastore         
	// 1205 1929:dup             
	// 1206 1930:bipush          44
	// 1207 1932:ldc1            #18  <Int 0>
	// 1208 1934:bastore         
	// 1209 1935:dup             
	// 1210 1936:bipush          45
	// 1211 1938:ldc1            #18  <Int 0>
	// 1212 1940:bastore         
	// 1213 1941:dup             
	// 1214 1942:bipush          46
	// 1215 1944:ldc1            #18  <Int 0>
	// 1216 1946:bastore         
	// 1217 1947:dup             
	// 1218 1948:bipush          47
	// 1219 1950:ldc1            #18  <Int 0>
	// 1220 1952:bastore         
	// 1221 1953:dup             
	// 1222 1954:bipush          48
	// 1223 1956:ldc1            #18  <Int 0>
	// 1224 1958:bastore         
	// 1225 1959:dup             
	// 1226 1960:bipush          49
	// 1227 1962:ldc1            #18  <Int 0>
	// 1228 1964:bastore         
	// 1229 1965:dup             
	// 1230 1966:bipush          50
	// 1231 1968:ldc1            #18  <Int 0>
	// 1232 1970:bastore         
	// 1233 1971:dup             
	// 1234 1972:bipush          51
	// 1235 1974:ldc1            #18  <Int 0>
	// 1236 1976:bastore         
	// 1237 1977:dup             
	// 1238 1978:bipush          52
	// 1239 1980:ldc1            #18  <Int 0>
	// 1240 1982:bastore         
	// 1241 1983:dup             
	// 1242 1984:bipush          53
	// 1243 1986:ldc1            #18  <Int 0>
	// 1244 1988:bastore         
	// 1245 1989:dup             
	// 1246 1990:bipush          54
	// 1247 1992:ldc1            #18  <Int 0>
	// 1248 1994:bastore         
	// 1249 1995:dup             
	// 1250 1996:bipush          55
	// 1251 1998:ldc1            #18  <Int 0>
	// 1252 2000:bastore         
	// 1253 2001:dup             
	// 1254 2002:bipush          56
	// 1255 2004:ldc1            #18  <Int 0>
	// 1256 2006:bastore         
	// 1257 2007:dup             
	// 1258 2008:bipush          57
	// 1259 2010:ldc1            #18  <Int 0>
	// 1260 2012:bastore         
	// 1261 2013:dup             
	// 1262 2014:bipush          58
	// 1263 2016:ldc1            #18  <Int 0>
	// 1264 2018:bastore         
	// 1265 2019:dup             
	// 1266 2020:bipush          59
	// 1267 2022:ldc1            #18  <Int 0>
	// 1268 2024:bastore         
	// 1269 2025:dup             
	// 1270 2026:bipush          60
	// 1271 2028:ldc1            #18  <Int 0>
	// 1272 2030:bastore         
	// 1273 2031:dup             
	// 1274 2032:bipush          61
	// 1275 2034:ldc1            #18  <Int 0>
	// 1276 2036:bastore         
	// 1277 2037:dup             
	// 1278 2038:bipush          62
	// 1279 2040:ldc1            #18  <Int 0>
	// 1280 2042:bastore         
	// 1281 2043:dup             
	// 1282 2044:bipush          63
	// 1283 2046:ldc1            #18  <Int 0>
	// 1284 2048:bastore         
	// 1285 2049:dup             
	// 1286 2050:bipush          64
	// 1287 2052:ldc1            #18  <Int 0>
	// 1288 2054:bastore         
	// 1289 2055:dup             
	// 1290 2056:bipush          65
	// 1291 2058:ldc1            #18  <Int 0>
	// 1292 2060:bastore         
	// 1293 2061:dup             
	// 1294 2062:bipush          66
	// 1295 2064:ldc1            #18  <Int 0>
	// 1296 2066:bastore         
	// 1297 2067:dup             
	// 1298 2068:bipush          67
	// 1299 2070:ldc1            #18  <Int 0>
	// 1300 2072:bastore         
	// 1301 2073:dup             
	// 1302 2074:bipush          68
	// 1303 2076:ldc1            #18  <Int 0>
	// 1304 2078:bastore         
	// 1305 2079:dup             
	// 1306 2080:bipush          69
	// 1307 2082:ldc1            #18  <Int 0>
	// 1308 2084:bastore         
	// 1309 2085:dup             
	// 1310 2086:bipush          70
	// 1311 2088:ldc1            #18  <Int 0>
	// 1312 2090:bastore         
	// 1313 2091:dup             
	// 1314 2092:bipush          71
	// 1315 2094:ldc1            #18  <Int 0>
	// 1316 2096:bastore         
	// 1317 2097:dup             
	// 1318 2098:bipush          72
	// 1319 2100:ldc1            #18  <Int 0>
	// 1320 2102:bastore         
	// 1321 2103:dup             
	// 1322 2104:bipush          73
	// 1323 2106:ldc1            #18  <Int 0>
	// 1324 2108:bastore         
	// 1325 2109:dup             
	// 1326 2110:bipush          74
	// 1327 2112:ldc1            #18  <Int 0>
	// 1328 2114:bastore         
	// 1329 2115:dup             
	// 1330 2116:bipush          75
	// 1331 2118:ldc1            #18  <Int 0>
	// 1332 2120:bastore         
	// 1333 2121:dup             
	// 1334 2122:bipush          76
	// 1335 2124:ldc1            #18  <Int 0>
	// 1336 2126:bastore         
	// 1337 2127:dup             
	// 1338 2128:bipush          77
	// 1339 2130:ldc1            #18  <Int 0>
	// 1340 2132:bastore         
	// 1341 2133:dup             
	// 1342 2134:bipush          78
	// 1343 2136:ldc1            #18  <Int 0>
	// 1344 2138:bastore         
	// 1345 2139:dup             
	// 1346 2140:bipush          79
	// 1347 2142:ldc1            #18  <Int 0>
	// 1348 2144:bastore         
	// 1349 2145:dup             
	// 1350 2146:bipush          80
	// 1351 2148:ldc1            #18  <Int 0>
	// 1352 2150:bastore         
	// 1353 2151:dup             
	// 1354 2152:bipush          81
	// 1355 2154:ldc1            #18  <Int 0>
	// 1356 2156:bastore         
	// 1357 2157:dup             
	// 1358 2158:bipush          82
	// 1359 2160:ldc1            #18  <Int 0>
	// 1360 2162:bastore         
	// 1361 2163:dup             
	// 1362 2164:bipush          83
	// 1363 2166:ldc1            #18  <Int 0>
	// 1364 2168:bastore         
	// 1365 2169:dup             
	// 1366 2170:bipush          84
	// 1367 2172:ldc1            #18  <Int 0>
	// 1368 2174:bastore         
	// 1369 2175:dup             
	// 1370 2176:bipush          85
	// 1371 2178:ldc1            #18  <Int 0>
	// 1372 2180:bastore         
	// 1373 2181:dup             
	// 1374 2182:bipush          86
	// 1375 2184:ldc1            #18  <Int 0>
	// 1376 2186:bastore         
	// 1377 2187:dup             
	// 1378 2188:bipush          87
	// 1379 2190:ldc1            #18  <Int 0>
	// 1380 2192:bastore         
	// 1381 2193:dup             
	// 1382 2194:bipush          88
	// 1383 2196:ldc1            #18  <Int 0>
	// 1384 2198:bastore         
	// 1385 2199:dup             
	// 1386 2200:bipush          89
	// 1387 2202:ldc1            #18  <Int 0>
	// 1388 2204:bastore         
	// 1389 2205:dup             
	// 1390 2206:bipush          90
	// 1391 2208:ldc1            #18  <Int 0>
	// 1392 2210:bastore         
	// 1393 2211:dup             
	// 1394 2212:bipush          91
	// 1395 2214:ldc1            #18  <Int 0>
	// 1396 2216:bastore         
	// 1397 2217:dup             
	// 1398 2218:bipush          92
	// 1399 2220:ldc1            #18  <Int 0>
	// 1400 2222:bastore         
	// 1401 2223:dup             
	// 1402 2224:bipush          93
	// 1403 2226:ldc1            #18  <Int 0>
	// 1404 2228:bastore         
	// 1405 2229:dup             
	// 1406 2230:bipush          94
	// 1407 2232:ldc1            #18  <Int 0>
	// 1408 2234:bastore         
	// 1409 2235:dup             
	// 1410 2236:bipush          95
	// 1411 2238:ldc1            #18  <Int 0>
	// 1412 2240:bastore         
	// 1413 2241:dup             
	// 1414 2242:bipush          96
	// 1415 2244:ldc1            #18  <Int 0>
	// 1416 2246:bastore         
	// 1417 2247:dup             
	// 1418 2248:bipush          97
	// 1419 2250:ldc1            #18  <Int 0>
	// 1420 2252:bastore         
	// 1421 2253:dup             
	// 1422 2254:bipush          98
	// 1423 2256:ldc1            #18  <Int 0>
	// 1424 2258:bastore         
	// 1425 2259:dup             
	// 1426 2260:bipush          99
	// 1427 2262:ldc1            #18  <Int 0>
	// 1428 2264:bastore         
	// 1429 2265:dup             
	// 1430 2266:bipush          100
	// 1431 2268:ldc1            #18  <Int 0>
	// 1432 2270:bastore         
	// 1433 2271:dup             
	// 1434 2272:bipush          101
	// 1435 2274:ldc1            #18  <Int 0>
	// 1436 2276:bastore         
	// 1437 2277:dup             
	// 1438 2278:bipush          102
	// 1439 2280:ldc1            #18  <Int 0>
	// 1440 2282:bastore         
	// 1441 2283:dup             
	// 1442 2284:bipush          103
	// 1443 2286:ldc1            #18  <Int 0>
	// 1444 2288:bastore         
	// 1445 2289:dup             
	// 1446 2290:bipush          104
	// 1447 2292:ldc1            #18  <Int 0>
	// 1448 2294:bastore         
	// 1449 2295:dup             
	// 1450 2296:bipush          105
	// 1451 2298:ldc1            #18  <Int 0>
	// 1452 2300:bastore         
	// 1453 2301:dup             
	// 1454 2302:bipush          106
	// 1455 2304:ldc1            #18  <Int 0>
	// 1456 2306:bastore         
	// 1457 2307:dup             
	// 1458 2308:bipush          107
	// 1459 2310:ldc1            #18  <Int 0>
	// 1460 2312:bastore         
	// 1461 2313:dup             
	// 1462 2314:bipush          108
	// 1463 2316:ldc1            #18  <Int 0>
	// 1464 2318:bastore         
	// 1465 2319:dup             
	// 1466 2320:bipush          109
	// 1467 2322:ldc1            #18  <Int 0>
	// 1468 2324:bastore         
	// 1469 2325:dup             
	// 1470 2326:bipush          110
	// 1471 2328:ldc1            #18  <Int 0>
	// 1472 2330:bastore         
	// 1473 2331:dup             
	// 1474 2332:bipush          111
	// 1475 2334:ldc1            #18  <Int 0>
	// 1476 2336:bastore         
	// 1477 2337:dup             
	// 1478 2338:bipush          112
	// 1479 2340:ldc1            #18  <Int 0>
	// 1480 2342:bastore         
	// 1481 2343:dup             
	// 1482 2344:bipush          113
	// 1483 2346:ldc1            #18  <Int 0>
	// 1484 2348:bastore         
	// 1485 2349:dup             
	// 1486 2350:bipush          114
	// 1487 2352:ldc1            #18  <Int 0>
	// 1488 2354:bastore         
	// 1489 2355:dup             
	// 1490 2356:bipush          115
	// 1491 2358:ldc1            #18  <Int 0>
	// 1492 2360:bastore         
	// 1493 2361:dup             
	// 1494 2362:bipush          116
	// 1495 2364:ldc1            #18  <Int 0>
	// 1496 2366:bastore         
	// 1497 2367:dup             
	// 1498 2368:bipush          117
	// 1499 2370:ldc1            #18  <Int 0>
	// 1500 2372:bastore         
	// 1501 2373:dup             
	// 1502 2374:bipush          118
	// 1503 2376:ldc1            #18  <Int 0>
	// 1504 2378:bastore         
	// 1505 2379:dup             
	// 1506 2380:bipush          119
	// 1507 2382:ldc1            #18  <Int 0>
	// 1508 2384:bastore         
	// 1509 2385:dup             
	// 1510 2386:bipush          120
	// 1511 2388:ldc1            #18  <Int 0>
	// 1512 2390:bastore         
	// 1513 2391:dup             
	// 1514 2392:bipush          121
	// 1515 2394:ldc1            #18  <Int 0>
	// 1516 2396:bastore         
	// 1517 2397:dup             
	// 1518 2398:bipush          122
	// 1519 2400:ldc1            #18  <Int 0>
	// 1520 2402:bastore         
	// 1521 2403:dup             
	// 1522 2404:bipush          123
	// 1523 2406:ldc1            #18  <Int 0>
	// 1524 2408:bastore         
	// 1525 2409:dup             
	// 1526 2410:bipush          124
	// 1527 2412:ldc1            #18  <Int 0>
	// 1528 2414:bastore         
	// 1529 2415:dup             
	// 1530 2416:bipush          125
	// 1531 2418:ldc1            #18  <Int 0>
	// 1532 2420:bastore         
	// 1533 2421:dup             
	// 1534 2422:bipush          126
	// 1535 2424:ldc1            #18  <Int 0>
	// 1536 2426:bastore         
	// 1537 2427:dup             
	// 1538 2428:bipush          127
	// 1539 2430:ldc1            #18  <Int 0>
	// 1540 2432:bastore         
	// 1541 2433:dup             
	// 1542 2434:sipush          128
	// 1543 2437:ldc1            #7   <Int 1>
	// 1544 2439:bastore         
	// 1545 2440:dup             
	// 1546 2441:sipush          129
	// 1547 2444:ldc1            #7   <Int 1>
	// 1548 2446:bastore         
	// 1549 2447:dup             
	// 1550 2448:sipush          130
	// 1551 2451:ldc1            #7   <Int 1>
	// 1552 2453:bastore         
	// 1553 2454:dup             
	// 1554 2455:sipush          131
	// 1555 2458:ldc1            #7   <Int 1>
	// 1556 2460:bastore         
	// 1557 2461:dup             
	// 1558 2462:sipush          132
	// 1559 2465:ldc1            #7   <Int 1>
	// 1560 2467:bastore         
	// 1561 2468:dup             
	// 1562 2469:sipush          133
	// 1563 2472:ldc1            #7   <Int 1>
	// 1564 2474:bastore         
	// 1565 2475:dup             
	// 1566 2476:sipush          134
	// 1567 2479:ldc1            #7   <Int 1>
	// 1568 2481:bastore         
	// 1569 2482:dup             
	// 1570 2483:sipush          135
	// 1571 2486:ldc1            #7   <Int 1>
	// 1572 2488:bastore         
	// 1573 2489:dup             
	// 1574 2490:sipush          136
	// 1575 2493:ldc1            #7   <Int 1>
	// 1576 2495:bastore         
	// 1577 2496:dup             
	// 1578 2497:sipush          137
	// 1579 2500:ldc1            #7   <Int 1>
	// 1580 2502:bastore         
	// 1581 2503:dup             
	// 1582 2504:sipush          138
	// 1583 2507:ldc1            #7   <Int 1>
	// 1584 2509:bastore         
	// 1585 2510:dup             
	// 1586 2511:sipush          139
	// 1587 2514:ldc1            #7   <Int 1>
	// 1588 2516:bastore         
	// 1589 2517:dup             
	// 1590 2518:sipush          140
	// 1591 2521:ldc1            #7   <Int 1>
	// 1592 2523:bastore         
	// 1593 2524:dup             
	// 1594 2525:sipush          141
	// 1595 2528:ldc1            #7   <Int 1>
	// 1596 2530:bastore         
	// 1597 2531:dup             
	// 1598 2532:sipush          142
	// 1599 2535:ldc1            #7   <Int 1>
	// 1600 2537:bastore         
	// 1601 2538:dup             
	// 1602 2539:sipush          143
	// 1603 2542:ldc1            #7   <Int 1>
	// 1604 2544:bastore         
	// 1605 2545:dup             
	// 1606 2546:sipush          144
	// 1607 2549:ldc1            #7   <Int 1>
	// 1608 2551:bastore         
	// 1609 2552:dup             
	// 1610 2553:sipush          145
	// 1611 2556:ldc1            #7   <Int 1>
	// 1612 2558:bastore         
	// 1613 2559:dup             
	// 1614 2560:sipush          146
	// 1615 2563:ldc1            #7   <Int 1>
	// 1616 2565:bastore         
	// 1617 2566:dup             
	// 1618 2567:sipush          147
	// 1619 2570:ldc1            #7   <Int 1>
	// 1620 2572:bastore         
	// 1621 2573:dup             
	// 1622 2574:sipush          148
	// 1623 2577:ldc1            #7   <Int 1>
	// 1624 2579:bastore         
	// 1625 2580:dup             
	// 1626 2581:sipush          149
	// 1627 2584:ldc1            #7   <Int 1>
	// 1628 2586:bastore         
	// 1629 2587:dup             
	// 1630 2588:sipush          150
	// 1631 2591:ldc1            #7   <Int 1>
	// 1632 2593:bastore         
	// 1633 2594:dup             
	// 1634 2595:sipush          151
	// 1635 2598:ldc1            #7   <Int 1>
	// 1636 2600:bastore         
	// 1637 2601:dup             
	// 1638 2602:sipush          152
	// 1639 2605:ldc1            #7   <Int 1>
	// 1640 2607:bastore         
	// 1641 2608:dup             
	// 1642 2609:sipush          153
	// 1643 2612:ldc1            #7   <Int 1>
	// 1644 2614:bastore         
	// 1645 2615:dup             
	// 1646 2616:sipush          154
	// 1647 2619:ldc1            #7   <Int 1>
	// 1648 2621:bastore         
	// 1649 2622:dup             
	// 1650 2623:sipush          155
	// 1651 2626:ldc1            #7   <Int 1>
	// 1652 2628:bastore         
	// 1653 2629:dup             
	// 1654 2630:sipush          156
	// 1655 2633:ldc1            #7   <Int 1>
	// 1656 2635:bastore         
	// 1657 2636:dup             
	// 1658 2637:sipush          157
	// 1659 2640:ldc1            #7   <Int 1>
	// 1660 2642:bastore         
	// 1661 2643:dup             
	// 1662 2644:sipush          158
	// 1663 2647:ldc1            #7   <Int 1>
	// 1664 2649:bastore         
	// 1665 2650:dup             
	// 1666 2651:sipush          159
	// 1667 2654:ldc1            #7   <Int 1>
	// 1668 2656:bastore         
	// 1669 2657:dup             
	// 1670 2658:sipush          160
	// 1671 2661:ldc1            #7   <Int 1>
	// 1672 2663:bastore         
	// 1673 2664:dup             
	// 1674 2665:sipush          161
	// 1675 2668:ldc1            #7   <Int 1>
	// 1676 2670:bastore         
	// 1677 2671:dup             
	// 1678 2672:sipush          162
	// 1679 2675:ldc1            #7   <Int 1>
	// 1680 2677:bastore         
	// 1681 2678:dup             
	// 1682 2679:sipush          163
	// 1683 2682:ldc1            #7   <Int 1>
	// 1684 2684:bastore         
	// 1685 2685:dup             
	// 1686 2686:sipush          164
	// 1687 2689:ldc1            #7   <Int 1>
	// 1688 2691:bastore         
	// 1689 2692:dup             
	// 1690 2693:sipush          165
	// 1691 2696:ldc1            #7   <Int 1>
	// 1692 2698:bastore         
	// 1693 2699:dup             
	// 1694 2700:sipush          166
	// 1695 2703:ldc1            #7   <Int 1>
	// 1696 2705:bastore         
	// 1697 2706:dup             
	// 1698 2707:sipush          167
	// 1699 2710:ldc1            #7   <Int 1>
	// 1700 2712:bastore         
	// 1701 2713:dup             
	// 1702 2714:sipush          168
	// 1703 2717:ldc1            #7   <Int 1>
	// 1704 2719:bastore         
	// 1705 2720:dup             
	// 1706 2721:sipush          169
	// 1707 2724:ldc1            #7   <Int 1>
	// 1708 2726:bastore         
	// 1709 2727:dup             
	// 1710 2728:sipush          170
	// 1711 2731:ldc1            #7   <Int 1>
	// 1712 2733:bastore         
	// 1713 2734:dup             
	// 1714 2735:sipush          171
	// 1715 2738:ldc1            #7   <Int 1>
	// 1716 2740:bastore         
	// 1717 2741:dup             
	// 1718 2742:sipush          172
	// 1719 2745:ldc1            #7   <Int 1>
	// 1720 2747:bastore         
	// 1721 2748:dup             
	// 1722 2749:sipush          173
	// 1723 2752:ldc1            #7   <Int 1>
	// 1724 2754:bastore         
	// 1725 2755:dup             
	// 1726 2756:sipush          174
	// 1727 2759:ldc1            #7   <Int 1>
	// 1728 2761:bastore         
	// 1729 2762:dup             
	// 1730 2763:sipush          175
	// 1731 2766:ldc1            #7   <Int 1>
	// 1732 2768:bastore         
	// 1733 2769:dup             
	// 1734 2770:sipush          176
	// 1735 2773:ldc1            #7   <Int 1>
	// 1736 2775:bastore         
	// 1737 2776:dup             
	// 1738 2777:sipush          177
	// 1739 2780:ldc1            #7   <Int 1>
	// 1740 2782:bastore         
	// 1741 2783:dup             
	// 1742 2784:sipush          178
	// 1743 2787:ldc1            #7   <Int 1>
	// 1744 2789:bastore         
	// 1745 2790:dup             
	// 1746 2791:sipush          179
	// 1747 2794:ldc1            #7   <Int 1>
	// 1748 2796:bastore         
	// 1749 2797:dup             
	// 1750 2798:sipush          180
	// 1751 2801:ldc1            #7   <Int 1>
	// 1752 2803:bastore         
	// 1753 2804:dup             
	// 1754 2805:sipush          181
	// 1755 2808:ldc1            #7   <Int 1>
	// 1756 2810:bastore         
	// 1757 2811:dup             
	// 1758 2812:sipush          182
	// 1759 2815:ldc1            #7   <Int 1>
	// 1760 2817:bastore         
	// 1761 2818:dup             
	// 1762 2819:sipush          183
	// 1763 2822:ldc1            #7   <Int 1>
	// 1764 2824:bastore         
	// 1765 2825:dup             
	// 1766 2826:sipush          184
	// 1767 2829:ldc1            #7   <Int 1>
	// 1768 2831:bastore         
	// 1769 2832:dup             
	// 1770 2833:sipush          185
	// 1771 2836:ldc1            #7   <Int 1>
	// 1772 2838:bastore         
	// 1773 2839:dup             
	// 1774 2840:sipush          186
	// 1775 2843:ldc1            #7   <Int 1>
	// 1776 2845:bastore         
	// 1777 2846:dup             
	// 1778 2847:sipush          187
	// 1779 2850:ldc1            #7   <Int 1>
	// 1780 2852:bastore         
	// 1781 2853:dup             
	// 1782 2854:sipush          188
	// 1783 2857:ldc1            #7   <Int 1>
	// 1784 2859:bastore         
	// 1785 2860:dup             
	// 1786 2861:sipush          189
	// 1787 2864:ldc1            #7   <Int 1>
	// 1788 2866:bastore         
	// 1789 2867:dup             
	// 1790 2868:sipush          190
	// 1791 2871:ldc1            #7   <Int 1>
	// 1792 2873:bastore         
	// 1793 2874:dup             
	// 1794 2875:sipush          191
	// 1795 2878:ldc1            #7   <Int 1>
	// 1796 2880:bastore         
	// 1797 2881:dup             
	// 1798 2882:sipush          192
	// 1799 2885:ldc1            #20  <Int 2>
	// 1800 2887:bastore         
	// 1801 2888:dup             
	// 1802 2889:sipush          193
	// 1803 2892:ldc1            #20  <Int 2>
	// 1804 2894:bastore         
	// 1805 2895:dup             
	// 1806 2896:sipush          194
	// 1807 2899:ldc1            #20  <Int 2>
	// 1808 2901:bastore         
	// 1809 2902:dup             
	// 1810 2903:sipush          195
	// 1811 2906:ldc1            #20  <Int 2>
	// 1812 2908:bastore         
	// 1813 2909:dup             
	// 1814 2910:sipush          196
	// 1815 2913:ldc1            #20  <Int 2>
	// 1816 2915:bastore         
	// 1817 2916:dup             
	// 1818 2917:sipush          197
	// 1819 2920:ldc1            #20  <Int 2>
	// 1820 2922:bastore         
	// 1821 2923:dup             
	// 1822 2924:sipush          198
	// 1823 2927:ldc1            #20  <Int 2>
	// 1824 2929:bastore         
	// 1825 2930:dup             
	// 1826 2931:sipush          199
	// 1827 2934:ldc1            #20  <Int 2>
	// 1828 2936:bastore         
	// 1829 2937:dup             
	// 1830 2938:sipush          200
	// 1831 2941:ldc1            #20  <Int 2>
	// 1832 2943:bastore         
	// 1833 2944:dup             
	// 1834 2945:sipush          201
	// 1835 2948:ldc1            #20  <Int 2>
	// 1836 2950:bastore         
	// 1837 2951:dup             
	// 1838 2952:sipush          202
	// 1839 2955:ldc1            #20  <Int 2>
	// 1840 2957:bastore         
	// 1841 2958:dup             
	// 1842 2959:sipush          203
	// 1843 2962:ldc1            #20  <Int 2>
	// 1844 2964:bastore         
	// 1845 2965:dup             
	// 1846 2966:sipush          204
	// 1847 2969:ldc1            #20  <Int 2>
	// 1848 2971:bastore         
	// 1849 2972:dup             
	// 1850 2973:sipush          205
	// 1851 2976:ldc1            #20  <Int 2>
	// 1852 2978:bastore         
	// 1853 2979:dup             
	// 1854 2980:sipush          206
	// 1855 2983:ldc1            #20  <Int 2>
	// 1856 2985:bastore         
	// 1857 2986:dup             
	// 1858 2987:sipush          207
	// 1859 2990:ldc1            #20  <Int 2>
	// 1860 2992:bastore         
	// 1861 2993:dup             
	// 1862 2994:sipush          208
	// 1863 2997:ldc1            #20  <Int 2>
	// 1864 2999:bastore         
	// 1865 3000:dup             
	// 1866 3001:sipush          209
	// 1867 3004:ldc1            #20  <Int 2>
	// 1868 3006:bastore         
	// 1869 3007:dup             
	// 1870 3008:sipush          210
	// 1871 3011:ldc1            #20  <Int 2>
	// 1872 3013:bastore         
	// 1873 3014:dup             
	// 1874 3015:sipush          211
	// 1875 3018:ldc1            #20  <Int 2>
	// 1876 3020:bastore         
	// 1877 3021:dup             
	// 1878 3022:sipush          212
	// 1879 3025:ldc1            #20  <Int 2>
	// 1880 3027:bastore         
	// 1881 3028:dup             
	// 1882 3029:sipush          213
	// 1883 3032:ldc1            #20  <Int 2>
	// 1884 3034:bastore         
	// 1885 3035:dup             
	// 1886 3036:sipush          214
	// 1887 3039:ldc1            #20  <Int 2>
	// 1888 3041:bastore         
	// 1889 3042:dup             
	// 1890 3043:sipush          215
	// 1891 3046:ldc1            #20  <Int 2>
	// 1892 3048:bastore         
	// 1893 3049:dup             
	// 1894 3050:sipush          216
	// 1895 3053:ldc1            #20  <Int 2>
	// 1896 3055:bastore         
	// 1897 3056:dup             
	// 1898 3057:sipush          217
	// 1899 3060:ldc1            #20  <Int 2>
	// 1900 3062:bastore         
	// 1901 3063:dup             
	// 1902 3064:sipush          218
	// 1903 3067:ldc1            #20  <Int 2>
	// 1904 3069:bastore         
	// 1905 3070:dup             
	// 1906 3071:sipush          219
	// 1907 3074:ldc1            #20  <Int 2>
	// 1908 3076:bastore         
	// 1909 3077:dup             
	// 1910 3078:sipush          220
	// 1911 3081:ldc1            #20  <Int 2>
	// 1912 3083:bastore         
	// 1913 3084:dup             
	// 1914 3085:sipush          221
	// 1915 3088:ldc1            #20  <Int 2>
	// 1916 3090:bastore         
	// 1917 3091:dup             
	// 1918 3092:sipush          222
	// 1919 3095:ldc1            #20  <Int 2>
	// 1920 3097:bastore         
	// 1921 3098:dup             
	// 1922 3099:sipush          223
	// 1923 3102:ldc1            #20  <Int 2>
	// 1924 3104:bastore         
	// 1925 3105:dup             
	// 1926 3106:sipush          224
	// 1927 3109:ldc1            #49  <Int 3>
	// 1928 3111:bastore         
	// 1929 3112:dup             
	// 1930 3113:sipush          225
	// 1931 3116:ldc1            #49  <Int 3>
	// 1932 3118:bastore         
	// 1933 3119:dup             
	// 1934 3120:sipush          226
	// 1935 3123:ldc1            #49  <Int 3>
	// 1936 3125:bastore         
	// 1937 3126:dup             
	// 1938 3127:sipush          227
	// 1939 3130:ldc1            #49  <Int 3>
	// 1940 3132:bastore         
	// 1941 3133:dup             
	// 1942 3134:sipush          228
	// 1943 3137:ldc1            #49  <Int 3>
	// 1944 3139:bastore         
	// 1945 3140:dup             
	// 1946 3141:sipush          229
	// 1947 3144:ldc1            #49  <Int 3>
	// 1948 3146:bastore         
	// 1949 3147:dup             
	// 1950 3148:sipush          230
	// 1951 3151:ldc1            #49  <Int 3>
	// 1952 3153:bastore         
	// 1953 3154:dup             
	// 1954 3155:sipush          231
	// 1955 3158:ldc1            #49  <Int 3>
	// 1956 3160:bastore         
	// 1957 3161:dup             
	// 1958 3162:sipush          232
	// 1959 3165:ldc1            #49  <Int 3>
	// 1960 3167:bastore         
	// 1961 3168:dup             
	// 1962 3169:sipush          233
	// 1963 3172:ldc1            #49  <Int 3>
	// 1964 3174:bastore         
	// 1965 3175:dup             
	// 1966 3176:sipush          234
	// 1967 3179:ldc1            #49  <Int 3>
	// 1968 3181:bastore         
	// 1969 3182:dup             
	// 1970 3183:sipush          235
	// 1971 3186:ldc1            #49  <Int 3>
	// 1972 3188:bastore         
	// 1973 3189:dup             
	// 1974 3190:sipush          236
	// 1975 3193:ldc1            #49  <Int 3>
	// 1976 3195:bastore         
	// 1977 3196:dup             
	// 1978 3197:sipush          237
	// 1979 3200:ldc1            #49  <Int 3>
	// 1980 3202:bastore         
	// 1981 3203:dup             
	// 1982 3204:sipush          238
	// 1983 3207:ldc1            #49  <Int 3>
	// 1984 3209:bastore         
	// 1985 3210:dup             
	// 1986 3211:sipush          239
	// 1987 3214:ldc1            #49  <Int 3>
	// 1988 3216:bastore         
	// 1989 3217:dup             
	// 1990 3218:sipush          240
	// 1991 3221:ldc1            #48  <Int 4>
	// 1992 3223:bastore         
	// 1993 3224:dup             
	// 1994 3225:sipush          241
	// 1995 3228:ldc1            #48  <Int 4>
	// 1996 3230:bastore         
	// 1997 3231:dup             
	// 1998 3232:sipush          242
	// 1999 3235:ldc1            #48  <Int 4>
	// 2000 3237:bastore         
	// 2001 3238:dup             
	// 2002 3239:sipush          243
	// 2003 3242:ldc1            #48  <Int 4>
	// 2004 3244:bastore         
	// 2005 3245:dup             
	// 2006 3246:sipush          244
	// 2007 3249:ldc1            #48  <Int 4>
	// 2008 3251:bastore         
	// 2009 3252:dup             
	// 2010 3253:sipush          245
	// 2011 3256:ldc1            #48  <Int 4>
	// 2012 3258:bastore         
	// 2013 3259:dup             
	// 2014 3260:sipush          246
	// 2015 3263:ldc1            #48  <Int 4>
	// 2016 3265:bastore         
	// 2017 3266:dup             
	// 2018 3267:sipush          247
	// 2019 3270:ldc1            #48  <Int 4>
	// 2020 3272:bastore         
	// 2021 3273:dup             
	// 2022 3274:sipush          248
	// 2023 3277:ldc1            #47  <Int 5>
	// 2024 3279:bastore         
	// 2025 3280:dup             
	// 2026 3281:sipush          249
	// 2027 3284:ldc1            #47  <Int 5>
	// 2028 3286:bastore         
	// 2029 3287:dup             
	// 2030 3288:sipush          250
	// 2031 3291:ldc1            #47  <Int 5>
	// 2032 3293:bastore         
	// 2033 3294:dup             
	// 2034 3295:sipush          251
	// 2035 3298:ldc1            #47  <Int 5>
	// 2036 3300:bastore         
	// 2037 3301:dup             
	// 2038 3302:sipush          252
	// 2039 3305:ldc1            #46  <Int 6>
	// 2040 3307:bastore         
	// 2041 3308:dup             
	// 2042 3309:sipush          253
	// 2043 3312:ldc1            #46  <Int 6>
	// 2044 3314:bastore         
	// 2045 3315:dup             
	// 2046 3316:sipush          254
	// 2047 3319:ldc1            #45  <Int 7>
	// 2048 3321:bastore         
	// 2049 3322:dup             
	// 2050 3323:sipush          255
	// 2051 3326:ldc1            #44  <Int 8>
	// 2052 3328:bastore         
	// 2053 3329:putstatic       #53  <Field byte[] oneruns>
	//*2054 3332:return          
	}
}
