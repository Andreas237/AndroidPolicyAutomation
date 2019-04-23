// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azo
	implements azk
{

	private azo(azh azh1)
	{
		a = azh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field azh a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	azo(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azo(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.aj = ((azh) (abyte0)).bK & ~a.aP;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.bK>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.aP>
	//    9   17:iconst_m1       
	//   10   18:ixor            
	//   11   19:iand            
	//   12   20:putfield        #32  <Field int azh.aj>
		abyte0 = ((byte []) (a));
	//   13   23:aload_0         
	//   14   24:getfield        #12  <Field azh a>
	//   15   27:astore_1        
		abyte0.ci = ((azh) (abyte0)).bK & ~a.aj;
	//   16   28:aload_1         
	//   17   29:aload_1         
	//   18   30:getfield        #26  <Field int azh.bK>
	//   19   33:aload_0         
	//   20   34:getfield        #12  <Field azh a>
	//   21   37:getfield        #32  <Field int azh.aj>
	//   22   40:iconst_m1       
	//   23   41:ixor            
	//   24   42:iand            
	//   25   43:putfield        #35  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//   26   46:aload_0         
	//   27   47:getfield        #12  <Field azh a>
	//   28   50:astore_1        
		abyte0.m = ((azh) (abyte0)).bs | a.ci;
	//   29   51:aload_1         
	//   30   52:aload_1         
	//   31   53:getfield        #38  <Field int azh.bs>
	//   32   56:aload_0         
	//   33   57:getfield        #12  <Field azh a>
	//   34   60:getfield        #35  <Field int azh.ci>
	//   35   63:ior             
	//   36   64:putfield        #41  <Field int azh.m>
		abyte0 = ((byte []) (a));
	//   37   67:aload_0         
	//   38   68:getfield        #12  <Field azh a>
	//   39   71:astore_1        
		abyte0.m = ((azh) (abyte0)).m & ~a.be;
	//   40   72:aload_1         
	//   41   73:aload_1         
	//   42   74:getfield        #41  <Field int azh.m>
	//   43   77:aload_0         
	//   44   78:getfield        #12  <Field azh a>
	//   45   81:getfield        #44  <Field int azh.be>
	//   46   84:iconst_m1       
	//   47   85:ixor            
	//   48   86:iand            
	//   49   87:putfield        #41  <Field int azh.m>
		abyte0 = ((byte []) (a));
	//   50   90:aload_0         
	//   51   91:getfield        #12  <Field azh a>
	//   52   94:astore_1        
		abyte0.bU = ((azh) (abyte0)).aj ^ a.bU;
	//   53   95:aload_1         
	//   54   96:aload_1         
	//   55   97:getfield        #32  <Field int azh.aj>
	//   56  100:aload_0         
	//   57  101:getfield        #12  <Field azh a>
	//   58  104:getfield        #47  <Field int azh.bU>
	//   59  107:ixor            
	//   60  108:putfield        #47  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//   61  111:aload_0         
	//   62  112:getfield        #12  <Field azh a>
	//   63  115:astore_1        
		abyte0.m = ((azh) (abyte0)).bU ^ a.m;
	//   64  116:aload_1         
	//   65  117:aload_1         
	//   66  118:getfield        #47  <Field int azh.bU>
	//   67  121:aload_0         
	//   68  122:getfield        #12  <Field azh a>
	//   69  125:getfield        #41  <Field int azh.m>
	//   70  128:ixor            
	//   71  129:putfield        #41  <Field int azh.m>
		abyte0 = ((byte []) (a));
	//   72  132:aload_0         
	//   73  133:getfield        #12  <Field azh a>
	//   74  136:astore_1        
		abyte0.cp = ((azh) (abyte0)).m ^ a.cp;
	//   75  137:aload_1         
	//   76  138:aload_1         
	//   77  139:getfield        #41  <Field int azh.m>
	//   78  142:aload_0         
	//   79  143:getfield        #12  <Field azh a>
	//   80  146:getfield        #50  <Field int azh.cp>
	//   81  149:ixor            
	//   82  150:putfield        #50  <Field int azh.cp>
		abyte0 = ((byte []) (a));
	//   83  153:aload_0         
	//   84  154:getfield        #12  <Field azh a>
	//   85  157:astore_1        
		abyte0.cA = ((azh) (abyte0)).bU ^ a.cA;
	//   86  158:aload_1         
	//   87  159:aload_1         
	//   88  160:getfield        #47  <Field int azh.bU>
	//   89  163:aload_0         
	//   90  164:getfield        #12  <Field azh a>
	//   91  167:getfield        #53  <Field int azh.cA>
	//   92  170:ixor            
	//   93  171:putfield        #53  <Field int azh.cA>
		abyte0 = ((byte []) (a));
	//   94  174:aload_0         
	//   95  175:getfield        #12  <Field azh a>
	//   96  178:astore_1        
		abyte0.cA = ((azh) (abyte0)).bC & a.cA;
	//   97  179:aload_1         
	//   98  180:aload_1         
	//   99  181:getfield        #56  <Field int azh.bC>
	//  100  184:aload_0         
	//  101  185:getfield        #12  <Field azh a>
	//  102  188:getfield        #53  <Field int azh.cA>
	//  103  191:iand            
	//  104  192:putfield        #53  <Field int azh.cA>
		abyte0 = ((byte []) (a));
	//  105  195:aload_0         
	//  106  196:getfield        #12  <Field azh a>
	//  107  199:astore_1        
		abyte0.cA = ((azh) (abyte0)).aR ^ a.cA;
	//  108  200:aload_1         
	//  109  201:aload_1         
	//  110  202:getfield        #59  <Field int azh.aR>
	//  111  205:aload_0         
	//  112  206:getfield        #12  <Field azh a>
	//  113  209:getfield        #53  <Field int azh.cA>
	//  114  212:ixor            
	//  115  213:putfield        #53  <Field int azh.cA>
		abyte0 = ((byte []) (a));
	//  116  216:aload_0         
	//  117  217:getfield        #12  <Field azh a>
	//  118  220:astore_1        
		abyte0.aR = ((azh) (abyte0)).aj ^ a.bs;
	//  119  221:aload_1         
	//  120  222:aload_1         
	//  121  223:getfield        #32  <Field int azh.aj>
	//  122  226:aload_0         
	//  123  227:getfield        #12  <Field azh a>
	//  124  230:getfield        #38  <Field int azh.bs>
	//  125  233:ixor            
	//  126  234:putfield        #59  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	//  127  237:aload_0         
	//  128  238:getfield        #12  <Field azh a>
	//  129  241:astore_1        
		abyte0.aR = ((azh) (abyte0)).be & a.aR;
	//  130  242:aload_1         
	//  131  243:aload_1         
	//  132  244:getfield        #44  <Field int azh.be>
	//  133  247:aload_0         
	//  134  248:getfield        #12  <Field azh a>
	//  135  251:getfield        #59  <Field int azh.aR>
	//  136  254:iand            
	//  137  255:putfield        #59  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	//  138  258:aload_0         
	//  139  259:getfield        #12  <Field azh a>
	//  140  262:astore_1        
		abyte0.aR = ((azh) (abyte0)).aC ^ a.aR;
	//  141  263:aload_1         
	//  142  264:aload_1         
	//  143  265:getfield        #62  <Field int azh.aC>
	//  144  268:aload_0         
	//  145  269:getfield        #12  <Field azh a>
	//  146  272:getfield        #59  <Field int azh.aR>
	//  147  275:ixor            
	//  148  276:putfield        #59  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	//  149  279:aload_0         
	//  150  280:getfield        #12  <Field azh a>
	//  151  283:astore_1        
		abyte0.aC = ((azh) (abyte0)).bC & a.aR;
	//  152  284:aload_1         
	//  153  285:aload_1         
	//  154  286:getfield        #56  <Field int azh.bC>
	//  155  289:aload_0         
	//  156  290:getfield        #12  <Field azh a>
	//  157  293:getfield        #59  <Field int azh.aR>
	//  158  296:iand            
	//  159  297:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  160  300:aload_0         
	//  161  301:getfield        #12  <Field azh a>
	//  162  304:astore_1        
		abyte0.aC = ((azh) (abyte0)).aR ^ a.aC;
	//  163  305:aload_1         
	//  164  306:aload_1         
	//  165  307:getfield        #59  <Field int azh.aR>
	//  166  310:aload_0         
	//  167  311:getfield        #12  <Field azh a>
	//  168  314:getfield        #62  <Field int azh.aC>
	//  169  317:ixor            
	//  170  318:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  171  321:aload_0         
	//  172  322:getfield        #12  <Field azh a>
	//  173  325:astore_1        
		abyte0.aC = ((azh) (abyte0)).am | a.aC;
	//  174  326:aload_1         
	//  175  327:aload_1         
	//  176  328:getfield        #65  <Field int azh.am>
	//  177  331:aload_0         
	//  178  332:getfield        #12  <Field azh a>
	//  179  335:getfield        #62  <Field int azh.aC>
	//  180  338:ior             
	//  181  339:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  182  342:aload_0         
	//  183  343:getfield        #12  <Field azh a>
	//  184  346:astore_1        
		abyte0.aC = ((azh) (abyte0)).cA ^ a.aC;
	//  185  347:aload_1         
	//  186  348:aload_1         
	//  187  349:getfield        #53  <Field int azh.cA>
	//  188  352:aload_0         
	//  189  353:getfield        #12  <Field azh a>
	//  190  356:getfield        #62  <Field int azh.aC>
	//  191  359:ixor            
	//  192  360:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  193  363:aload_0         
	//  194  364:getfield        #12  <Field azh a>
	//  195  367:astore_1        
		abyte0.x = ((azh) (abyte0)).aC ^ a.x;
	//  196  368:aload_1         
	//  197  369:aload_1         
	//  198  370:getfield        #62  <Field int azh.aC>
	//  199  373:aload_0         
	//  200  374:getfield        #12  <Field azh a>
	//  201  377:getfield        #68  <Field int azh.x>
	//  202  380:ixor            
	//  203  381:putfield        #68  <Field int azh.x>
		abyte0 = ((byte []) (a));
	//  204  384:aload_0         
	//  205  385:getfield        #12  <Field azh a>
	//  206  388:astore_1        
		abyte0.aC = ((azh) (abyte0)).bs | a.aj;
	//  207  389:aload_1         
	//  208  390:aload_1         
	//  209  391:getfield        #38  <Field int azh.bs>
	//  210  394:aload_0         
	//  211  395:getfield        #12  <Field azh a>
	//  212  398:getfield        #32  <Field int azh.aj>
	//  213  401:ior             
	//  214  402:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  215  405:aload_0         
	//  216  406:getfield        #12  <Field azh a>
	//  217  409:astore_1        
		abyte0.aC = ((azh) (abyte0)).bK ^ a.aC;
	//  218  410:aload_1         
	//  219  411:aload_1         
	//  220  412:getfield        #26  <Field int azh.bK>
	//  221  415:aload_0         
	//  222  416:getfield        #12  <Field azh a>
	//  223  419:getfield        #62  <Field int azh.aC>
	//  224  422:ixor            
	//  225  423:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  226  426:aload_0         
	//  227  427:getfield        #12  <Field azh a>
	//  228  430:astore_1        
		abyte0.at = ((azh) (abyte0)).aC ^ a.at;
	//  229  431:aload_1         
	//  230  432:aload_1         
	//  231  433:getfield        #62  <Field int azh.aC>
	//  232  436:aload_0         
	//  233  437:getfield        #12  <Field azh a>
	//  234  440:getfield        #71  <Field int azh.at>
	//  235  443:ixor            
	//  236  444:putfield        #71  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  237  447:aload_0         
	//  238  448:getfield        #12  <Field azh a>
	//  239  451:astore_1        
		abyte0.at = ((azh) (abyte0)).bC & ~a.at;
	//  240  452:aload_1         
	//  241  453:aload_1         
	//  242  454:getfield        #56  <Field int azh.bC>
	//  243  457:aload_0         
	//  244  458:getfield        #12  <Field azh a>
	//  245  461:getfield        #71  <Field int azh.at>
	//  246  464:iconst_m1       
	//  247  465:ixor            
	//  248  466:iand            
	//  249  467:putfield        #71  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  250  470:aload_0         
	//  251  471:getfield        #12  <Field azh a>
	//  252  474:astore_1        
		abyte0.at = ((azh) (abyte0)).aN ^ a.at;
	//  253  475:aload_1         
	//  254  476:aload_1         
	//  255  477:getfield        #74  <Field int azh.aN>
	//  256  480:aload_0         
	//  257  481:getfield        #12  <Field azh a>
	//  258  484:getfield        #71  <Field int azh.at>
	//  259  487:ixor            
	//  260  488:putfield        #71  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  261  491:aload_0         
	//  262  492:getfield        #12  <Field azh a>
	//  263  495:astore_1        
		abyte0.at = ((azh) (abyte0)).at & ~a.am;
	//  264  496:aload_1         
	//  265  497:aload_1         
	//  266  498:getfield        #71  <Field int azh.at>
	//  267  501:aload_0         
	//  268  502:getfield        #12  <Field azh a>
	//  269  505:getfield        #65  <Field int azh.am>
	//  270  508:iconst_m1       
	//  271  509:ixor            
	//  272  510:iand            
	//  273  511:putfield        #71  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  274  514:aload_0         
	//  275  515:getfield        #12  <Field azh a>
	//  276  518:astore_1        
		abyte0.aN = ((azh) (abyte0)).aj & ~a.bs;
	//  277  519:aload_1         
	//  278  520:aload_1         
	//  279  521:getfield        #32  <Field int azh.aj>
	//  280  524:aload_0         
	//  281  525:getfield        #12  <Field azh a>
	//  282  528:getfield        #38  <Field int azh.bs>
	//  283  531:iconst_m1       
	//  284  532:ixor            
	//  285  533:iand            
	//  286  534:putfield        #74  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  287  537:aload_0         
	//  288  538:getfield        #12  <Field azh a>
	//  289  541:astore_1        
		abyte0.aN = ((azh) (abyte0)).aP ^ a.aN;
	//  290  542:aload_1         
	//  291  543:aload_1         
	//  292  544:getfield        #29  <Field int azh.aP>
	//  293  547:aload_0         
	//  294  548:getfield        #12  <Field azh a>
	//  295  551:getfield        #74  <Field int azh.aN>
	//  296  554:ixor            
	//  297  555:putfield        #74  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  298  558:aload_0         
	//  299  559:getfield        #12  <Field azh a>
	//  300  562:astore_1        
		abyte0.aN = ((azh) (abyte0)).be & ~a.aN;
	//  301  563:aload_1         
	//  302  564:aload_1         
	//  303  565:getfield        #44  <Field int azh.be>
	//  304  568:aload_0         
	//  305  569:getfield        #12  <Field azh a>
	//  306  572:getfield        #74  <Field int azh.aN>
	//  307  575:iconst_m1       
	//  308  576:ixor            
	//  309  577:iand            
	//  310  578:putfield        #74  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  311  581:aload_0         
	//  312  582:getfield        #12  <Field azh a>
	//  313  585:astore_1        
		abyte0.aC = ((azh) (abyte0)).bs | a.aj;
	//  314  586:aload_1         
	//  315  587:aload_1         
	//  316  588:getfield        #38  <Field int azh.bs>
	//  317  591:aload_0         
	//  318  592:getfield        #12  <Field azh a>
	//  319  595:getfield        #32  <Field int azh.aj>
	//  320  598:ior             
	//  321  599:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  322  602:aload_0         
	//  323  603:getfield        #12  <Field azh a>
	//  324  606:astore_1        
		abyte0.aC = ((azh) (abyte0)).F ^ a.aC;
	//  325  607:aload_1         
	//  326  608:aload_1         
	//  327  609:getfield        #77  <Field int azh.F>
	//  328  612:aload_0         
	//  329  613:getfield        #12  <Field azh a>
	//  330  616:getfield        #62  <Field int azh.aC>
	//  331  619:ixor            
	//  332  620:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  333  623:aload_0         
	//  334  624:getfield        #12  <Field azh a>
	//  335  627:astore_1        
		abyte0.aC = ((azh) (abyte0)).be & ~a.aC;
	//  336  628:aload_1         
	//  337  629:aload_1         
	//  338  630:getfield        #44  <Field int azh.be>
	//  339  633:aload_0         
	//  340  634:getfield        #12  <Field azh a>
	//  341  637:getfield        #62  <Field int azh.aC>
	//  342  640:iconst_m1       
	//  343  641:ixor            
	//  344  642:iand            
	//  345  643:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  346  646:aload_0         
	//  347  647:getfield        #12  <Field azh a>
	//  348  650:astore_1        
		abyte0.C = ((azh) (abyte0)).C & ~a.bK;
	//  349  651:aload_1         
	//  350  652:aload_1         
	//  351  653:getfield        #80  <Field int azh.C>
	//  352  656:aload_0         
	//  353  657:getfield        #12  <Field azh a>
	//  354  660:getfield        #26  <Field int azh.bK>
	//  355  663:iconst_m1       
	//  356  664:ixor            
	//  357  665:iand            
	//  358  666:putfield        #80  <Field int azh.C>
		abyte0 = ((byte []) (a));
	//  359  669:aload_0         
	//  360  670:getfield        #12  <Field azh a>
	//  361  673:astore_1        
		abyte0.C = ((azh) (abyte0)).ar ^ a.C;
	//  362  674:aload_1         
	//  363  675:aload_1         
	//  364  676:getfield        #83  <Field int azh.ar>
	//  365  679:aload_0         
	//  366  680:getfield        #12  <Field azh a>
	//  367  683:getfield        #80  <Field int azh.C>
	//  368  686:ixor            
	//  369  687:putfield        #80  <Field int azh.C>
		abyte0 = ((byte []) (a));
	//  370  690:aload_0         
	//  371  691:getfield        #12  <Field azh a>
	//  372  694:astore_1        
		abyte0.J = ((azh) (abyte0)).C ^ a.J;
	//  373  695:aload_1         
	//  374  696:aload_1         
	//  375  697:getfield        #80  <Field int azh.C>
	//  376  700:aload_0         
	//  377  701:getfield        #12  <Field azh a>
	//  378  704:getfield        #86  <Field int azh.J>
	//  379  707:ixor            
	//  380  708:putfield        #86  <Field int azh.J>
		abyte0 = ((byte []) (a));
	//  381  711:aload_0         
	//  382  712:getfield        #12  <Field azh a>
	//  383  715:astore_1        
		abyte0.bG = ((azh) (abyte0)).J ^ a.bG;
	//  384  716:aload_1         
	//  385  717:aload_1         
	//  386  718:getfield        #86  <Field int azh.J>
	//  387  721:aload_0         
	//  388  722:getfield        #12  <Field azh a>
	//  389  725:getfield        #89  <Field int azh.bG>
	//  390  728:ixor            
	//  391  729:putfield        #89  <Field int azh.bG>
		abyte0 = ((byte []) (a));
	//  392  732:aload_0         
	//  393  733:getfield        #12  <Field azh a>
	//  394  736:astore_1        
		abyte0.J = ((azh) (abyte0)).bu | a.bG;
	//  395  737:aload_1         
	//  396  738:aload_1         
	//  397  739:getfield        #92  <Field int azh.bu>
	//  398  742:aload_0         
	//  399  743:getfield        #12  <Field azh a>
	//  400  746:getfield        #89  <Field int azh.bG>
	//  401  749:ior             
	//  402  750:putfield        #86  <Field int azh.J>
		abyte0 = ((byte []) (a));
	//  403  753:aload_0         
	//  404  754:getfield        #12  <Field azh a>
	//  405  757:astore_1        
		abyte0.J = ((azh) (abyte0)).bV ^ a.J;
	//  406  758:aload_1         
	//  407  759:aload_1         
	//  408  760:getfield        #95  <Field int azh.bV>
	//  409  763:aload_0         
	//  410  764:getfield        #12  <Field azh a>
	//  411  767:getfield        #86  <Field int azh.J>
	//  412  770:ixor            
	//  413  771:putfield        #86  <Field int azh.J>
		abyte0 = ((byte []) (a));
	//  414  774:aload_0         
	//  415  775:getfield        #12  <Field azh a>
	//  416  778:astore_1        
		abyte0.al = ((azh) (abyte0)).J ^ a.al;
	//  417  779:aload_1         
	//  418  780:aload_1         
	//  419  781:getfield        #86  <Field int azh.J>
	//  420  784:aload_0         
	//  421  785:getfield        #12  <Field azh a>
	//  422  788:getfield        #98  <Field int azh.al>
	//  423  791:ixor            
	//  424  792:putfield        #98  <Field int azh.al>
		abyte0 = ((byte []) (a));
	//  425  795:aload_0         
	//  426  796:getfield        #12  <Field azh a>
	//  427  799:astore_1        
		abyte0.bG = ((azh) (abyte0)).bu & a.bG;
	//  428  800:aload_1         
	//  429  801:aload_1         
	//  430  802:getfield        #92  <Field int azh.bu>
	//  431  805:aload_0         
	//  432  806:getfield        #12  <Field azh a>
	//  433  809:getfield        #89  <Field int azh.bG>
	//  434  812:iand            
	//  435  813:putfield        #89  <Field int azh.bG>
		abyte0 = ((byte []) (a));
	//  436  816:aload_0         
	//  437  817:getfield        #12  <Field azh a>
	//  438  820:astore_1        
		abyte0.bG = ((azh) (abyte0)).bV ^ a.bG;
	//  439  821:aload_1         
	//  440  822:aload_1         
	//  441  823:getfield        #95  <Field int azh.bV>
	//  442  826:aload_0         
	//  443  827:getfield        #12  <Field azh a>
	//  444  830:getfield        #89  <Field int azh.bG>
	//  445  833:ixor            
	//  446  834:putfield        #89  <Field int azh.bG>
		abyte0 = ((byte []) (a));
	//  447  837:aload_0         
	//  448  838:getfield        #12  <Field azh a>
	//  449  841:astore_1        
		abyte0.ab = ((azh) (abyte0)).bG ^ a.ab;
	//  450  842:aload_1         
	//  451  843:aload_1         
	//  452  844:getfield        #89  <Field int azh.bG>
	//  453  847:aload_0         
	//  454  848:getfield        #12  <Field azh a>
	//  455  851:getfield        #101 <Field int azh.ab>
	//  456  854:ixor            
	//  457  855:putfield        #101 <Field int azh.ab>
		abyte0 = ((byte []) (a));
	//  458  858:aload_0         
	//  459  859:getfield        #12  <Field azh a>
	//  460  862:astore_1        
		abyte0.bK = ((azh) (abyte0)).aP ^ a.bK;
	//  461  863:aload_1         
	//  462  864:aload_1         
	//  463  865:getfield        #29  <Field int azh.aP>
	//  464  868:aload_0         
	//  465  869:getfield        #12  <Field azh a>
	//  466  872:getfield        #26  <Field int azh.bK>
	//  467  875:ixor            
	//  468  876:putfield        #26  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  469  879:aload_0         
	//  470  880:getfield        #12  <Field azh a>
	//  471  883:astore_1        
		abyte0.bG = ((azh) (abyte0)).bK & ~a.bs;
	//  472  884:aload_1         
	//  473  885:aload_1         
	//  474  886:getfield        #26  <Field int azh.bK>
	//  475  889:aload_0         
	//  476  890:getfield        #12  <Field azh a>
	//  477  893:getfield        #38  <Field int azh.bs>
	//  478  896:iconst_m1       
	//  479  897:ixor            
	//  480  898:iand            
	//  481  899:putfield        #89  <Field int azh.bG>
		abyte0 = ((byte []) (a));
	//  482  902:aload_0         
	//  483  903:getfield        #12  <Field azh a>
	//  484  906:astore_1        
		abyte0.bG = ((azh) (abyte0)).aj ^ a.bG;
	//  485  907:aload_1         
	//  486  908:aload_1         
	//  487  909:getfield        #32  <Field int azh.aj>
	//  488  912:aload_0         
	//  489  913:getfield        #12  <Field azh a>
	//  490  916:getfield        #89  <Field int azh.bG>
	//  491  919:ixor            
	//  492  920:putfield        #89  <Field int azh.bG>
		abyte0 = ((byte []) (a));
	//  493  923:aload_0         
	//  494  924:getfield        #12  <Field azh a>
	//  495  927:astore_1        
		abyte0.aN = ((azh) (abyte0)).bG ^ a.aN;
	//  496  928:aload_1         
	//  497  929:aload_1         
	//  498  930:getfield        #89  <Field int azh.bG>
	//  499  933:aload_0         
	//  500  934:getfield        #12  <Field azh a>
	//  501  937:getfield        #74  <Field int azh.aN>
	//  502  940:ixor            
	//  503  941:putfield        #74  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  504  944:aload_0         
	//  505  945:getfield        #12  <Field azh a>
	//  506  948:astore_1        
		abyte0.aN = ((azh) (abyte0)).bC & ~a.aN;
	//  507  949:aload_1         
	//  508  950:aload_1         
	//  509  951:getfield        #56  <Field int azh.bC>
	//  510  954:aload_0         
	//  511  955:getfield        #12  <Field azh a>
	//  512  958:getfield        #74  <Field int azh.aN>
	//  513  961:iconst_m1       
	//  514  962:ixor            
	//  515  963:iand            
	//  516  964:putfield        #74  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  517  967:aload_0         
	//  518  968:getfield        #12  <Field azh a>
	//  519  971:astore_1        
		abyte0.bG = ((azh) (abyte0)).bs | a.bK;
	//  520  972:aload_1         
	//  521  973:aload_1         
	//  522  974:getfield        #38  <Field int azh.bs>
	//  523  977:aload_0         
	//  524  978:getfield        #12  <Field azh a>
	//  525  981:getfield        #26  <Field int azh.bK>
	//  526  984:ior             
	//  527  985:putfield        #89  <Field int azh.bG>
		abyte0 = ((byte []) (a));
	//  528  988:aload_0         
	//  529  989:getfield        #12  <Field azh a>
	//  530  992:astore_1        
		abyte0.bG = ((azh) (abyte0)).bK ^ a.bG;
	//  531  993:aload_1         
	//  532  994:aload_1         
	//  533  995:getfield        #26  <Field int azh.bK>
	//  534  998:aload_0         
	//  535  999:getfield        #12  <Field azh a>
	//  536 1002:getfield        #89  <Field int azh.bG>
	//  537 1005:ixor            
	//  538 1006:putfield        #89  <Field int azh.bG>
		abyte0 = ((byte []) (a));
	//  539 1009:aload_0         
	//  540 1010:getfield        #12  <Field azh a>
	//  541 1013:astore_1        
		abyte0.aC = ((azh) (abyte0)).bG ^ a.aC;
	//  542 1014:aload_1         
	//  543 1015:aload_1         
	//  544 1016:getfield        #89  <Field int azh.bG>
	//  545 1019:aload_0         
	//  546 1020:getfield        #12  <Field azh a>
	//  547 1023:getfield        #62  <Field int azh.aC>
	//  548 1026:ixor            
	//  549 1027:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  550 1030:aload_0         
	//  551 1031:getfield        #12  <Field azh a>
	//  552 1034:astore_1        
		abyte0.aC = ((azh) (abyte0)).bC & a.aC;
	//  553 1035:aload_1         
	//  554 1036:aload_1         
	//  555 1037:getfield        #56  <Field int azh.bC>
	//  556 1040:aload_0         
	//  557 1041:getfield        #12  <Field azh a>
	//  558 1044:getfield        #62  <Field int azh.aC>
	//  559 1047:iand            
	//  560 1048:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  561 1051:aload_0         
	//  562 1052:getfield        #12  <Field azh a>
	//  563 1055:astore_1        
		abyte0.cc = ((azh) (abyte0)).bK ^ a.cc;
	//  564 1056:aload_1         
	//  565 1057:aload_1         
	//  566 1058:getfield        #26  <Field int azh.bK>
	//  567 1061:aload_0         
	//  568 1062:getfield        #12  <Field azh a>
	//  569 1065:getfield        #104 <Field int azh.cc>
	//  570 1068:ixor            
	//  571 1069:putfield        #104 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	//  572 1072:aload_0         
	//  573 1073:getfield        #12  <Field azh a>
	//  574 1076:astore_1        
		abyte0.cc = ((azh) (abyte0)).be & a.cc;
	//  575 1077:aload_1         
	//  576 1078:aload_1         
	//  577 1079:getfield        #44  <Field int azh.be>
	//  578 1082:aload_0         
	//  579 1083:getfield        #12  <Field azh a>
	//  580 1086:getfield        #104 <Field int azh.cc>
	//  581 1089:iand            
	//  582 1090:putfield        #104 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	//  583 1093:aload_0         
	//  584 1094:getfield        #12  <Field azh a>
	//  585 1097:astore_1        
		abyte0.cc = ((azh) (abyte0)).bC & a.cc;
	//  586 1098:aload_1         
	//  587 1099:aload_1         
	//  588 1100:getfield        #56  <Field int azh.bC>
	//  589 1103:aload_0         
	//  590 1104:getfield        #12  <Field azh a>
	//  591 1107:getfield        #104 <Field int azh.cc>
	//  592 1110:iand            
	//  593 1111:putfield        #104 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	//  594 1114:aload_0         
	//  595 1115:getfield        #12  <Field azh a>
	//  596 1118:astore_1        
		abyte0.cc = ((azh) (abyte0)).ci ^ a.cc;
	//  597 1119:aload_1         
	//  598 1120:aload_1         
	//  599 1121:getfield        #35  <Field int azh.ci>
	//  600 1124:aload_0         
	//  601 1125:getfield        #12  <Field azh a>
	//  602 1128:getfield        #104 <Field int azh.cc>
	//  603 1131:ixor            
	//  604 1132:putfield        #104 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	//  605 1135:aload_0         
	//  606 1136:getfield        #12  <Field azh a>
	//  607 1139:astore_1        
		abyte0.cc = ((azh) (abyte0)).am | a.cc;
	//  608 1140:aload_1         
	//  609 1141:aload_1         
	//  610 1142:getfield        #65  <Field int azh.am>
	//  611 1145:aload_0         
	//  612 1146:getfield        #12  <Field azh a>
	//  613 1149:getfield        #104 <Field int azh.cc>
	//  614 1152:ior             
	//  615 1153:putfield        #104 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	//  616 1156:aload_0         
	//  617 1157:getfield        #12  <Field azh a>
	//  618 1160:astore_1        
		abyte0.cc = ((azh) (abyte0)).cp ^ a.cc;
	//  619 1161:aload_1         
	//  620 1162:aload_1         
	//  621 1163:getfield        #50  <Field int azh.cp>
	//  622 1166:aload_0         
	//  623 1167:getfield        #12  <Field azh a>
	//  624 1170:getfield        #104 <Field int azh.cc>
	//  625 1173:ixor            
	//  626 1174:putfield        #104 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	//  627 1177:aload_0         
	//  628 1178:getfield        #12  <Field azh a>
	//  629 1181:astore_1        
		abyte0.f = ((azh) (abyte0)).cc ^ a.f;
	//  630 1182:aload_1         
	//  631 1183:aload_1         
	//  632 1184:getfield        #104 <Field int azh.cc>
	//  633 1187:aload_0         
	//  634 1188:getfield        #12  <Field azh a>
	//  635 1191:getfield        #107 <Field int azh.f>
	//  636 1194:ixor            
	//  637 1195:putfield        #107 <Field int azh.f>
		abyte0 = ((byte []) (a));
	//  638 1198:aload_0         
	//  639 1199:getfield        #12  <Field azh a>
	//  640 1202:astore_1        
		abyte0.bs = ((azh) (abyte0)).bK ^ a.bs;
	//  641 1203:aload_1         
	//  642 1204:aload_1         
	//  643 1205:getfield        #26  <Field int azh.bK>
	//  644 1208:aload_0         
	//  645 1209:getfield        #12  <Field azh a>
	//  646 1212:getfield        #38  <Field int azh.bs>
	//  647 1215:ixor            
	//  648 1216:putfield        #38  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	//  649 1219:aload_0         
	//  650 1220:getfield        #12  <Field azh a>
	//  651 1223:astore_1        
		abyte0.p = ((azh) (abyte0)).bs ^ a.p;
	//  652 1224:aload_1         
	//  653 1225:aload_1         
	//  654 1226:getfield        #38  <Field int azh.bs>
	//  655 1229:aload_0         
	//  656 1230:getfield        #12  <Field azh a>
	//  657 1233:getfield        #110 <Field int azh.p>
	//  658 1236:ixor            
	//  659 1237:putfield        #110 <Field int azh.p>
		abyte0 = ((byte []) (a));
	//  660 1240:aload_0         
	//  661 1241:getfield        #12  <Field azh a>
	//  662 1244:astore_1        
		abyte0.aN = ((azh) (abyte0)).p ^ a.aN;
	//  663 1245:aload_1         
	//  664 1246:aload_1         
	//  665 1247:getfield        #110 <Field int azh.p>
	//  666 1250:aload_0         
	//  667 1251:getfield        #12  <Field azh a>
	//  668 1254:getfield        #74  <Field int azh.aN>
	//  669 1257:ixor            
	//  670 1258:putfield        #74  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  671 1261:aload_0         
	//  672 1262:getfield        #12  <Field azh a>
	//  673 1265:astore_1        
		abyte0.cC = ((azh) (abyte0)).aN ^ a.cC;
	//  674 1266:aload_1         
	//  675 1267:aload_1         
	//  676 1268:getfield        #74  <Field int azh.aN>
	//  677 1271:aload_0         
	//  678 1272:getfield        #12  <Field azh a>
	//  679 1275:getfield        #113 <Field int azh.cC>
	//  680 1278:ixor            
	//  681 1279:putfield        #113 <Field int azh.cC>
		abyte0 = ((byte []) (a));
	//  682 1282:aload_0         
	//  683 1283:getfield        #12  <Field azh a>
	//  684 1286:astore_1        
		abyte0.bn = ((azh) (abyte0)).cC ^ a.bn;
	//  685 1287:aload_1         
	//  686 1288:aload_1         
	//  687 1289:getfield        #113 <Field int azh.cC>
	//  688 1292:aload_0         
	//  689 1293:getfield        #12  <Field azh a>
	//  690 1296:getfield        #116 <Field int azh.bn>
	//  691 1299:ixor            
	//  692 1300:putfield        #116 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	//  693 1303:aload_0         
	//  694 1304:getfield        #12  <Field azh a>
	//  695 1307:astore_1        
		abyte0.bn = ~((azh) (abyte0)).bn;
	//  696 1308:aload_1         
	//  697 1309:aload_1         
	//  698 1310:getfield        #116 <Field int azh.bn>
	//  699 1313:iconst_m1       
	//  700 1314:ixor            
	//  701 1315:putfield        #116 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	//  702 1318:aload_0         
	//  703 1319:getfield        #12  <Field azh a>
	//  704 1322:astore_1        
		abyte0.an = ((azh) (abyte0)).bK ^ a.an;
	//  705 1323:aload_1         
	//  706 1324:aload_1         
	//  707 1325:getfield        #26  <Field int azh.bK>
	//  708 1328:aload_0         
	//  709 1329:getfield        #12  <Field azh a>
	//  710 1332:getfield        #119 <Field int azh.an>
	//  711 1335:ixor            
	//  712 1336:putfield        #119 <Field int azh.an>
		abyte0 = ((byte []) (a));
	//  713 1339:aload_0         
	//  714 1340:getfield        #12  <Field azh a>
	//  715 1343:astore_1        
		abyte0.an = ((azh) (abyte0)).be & a.an;
	//  716 1344:aload_1         
	//  717 1345:aload_1         
	//  718 1346:getfield        #44  <Field int azh.be>
	//  719 1349:aload_0         
	//  720 1350:getfield        #12  <Field azh a>
	//  721 1353:getfield        #119 <Field int azh.an>
	//  722 1356:iand            
	//  723 1357:putfield        #119 <Field int azh.an>
		abyte0 = ((byte []) (a));
	//  724 1360:aload_0         
	//  725 1361:getfield        #12  <Field azh a>
	//  726 1364:astore_1        
		abyte0.an = ((azh) (abyte0)).bs ^ a.an;
	//  727 1365:aload_1         
	//  728 1366:aload_1         
	//  729 1367:getfield        #38  <Field int azh.bs>
	//  730 1370:aload_0         
	//  731 1371:getfield        #12  <Field azh a>
	//  732 1374:getfield        #119 <Field int azh.an>
	//  733 1377:ixor            
	//  734 1378:putfield        #119 <Field int azh.an>
		abyte0 = ((byte []) (a));
	//  735 1381:aload_0         
	//  736 1382:getfield        #12  <Field azh a>
	//  737 1385:astore_1        
		abyte0.aC = ((azh) (abyte0)).an ^ a.aC;
	//  738 1386:aload_1         
	//  739 1387:aload_1         
	//  740 1388:getfield        #119 <Field int azh.an>
	//  741 1391:aload_0         
	//  742 1392:getfield        #12  <Field azh a>
	//  743 1395:getfield        #62  <Field int azh.aC>
	//  744 1398:ixor            
	//  745 1399:putfield        #62  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  746 1402:aload_0         
	//  747 1403:getfield        #12  <Field azh a>
	//  748 1406:astore_1        
		abyte0.at = ((azh) (abyte0)).aC ^ a.at;
	//  749 1407:aload_1         
	//  750 1408:aload_1         
	//  751 1409:getfield        #62  <Field int azh.aC>
	//  752 1412:aload_0         
	//  753 1413:getfield        #12  <Field azh a>
	//  754 1416:getfield        #71  <Field int azh.at>
	//  755 1419:ixor            
	//  756 1420:putfield        #71  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  757 1423:aload_0         
	//  758 1424:getfield        #12  <Field azh a>
	//  759 1427:astore_1        
		abyte0.bl = ((azh) (abyte0)).at ^ a.bl;
	//  760 1428:aload_1         
	//  761 1429:aload_1         
	//  762 1430:getfield        #71  <Field int azh.at>
	//  763 1433:aload_0         
	//  764 1434:getfield        #12  <Field azh a>
	//  765 1437:getfield        #122 <Field int azh.bl>
	//  766 1440:ixor            
	//  767 1441:putfield        #122 <Field int azh.bl>
		abyte1[0] = (byte)a.aL;
	//  768 1444:aload_2         
	//  769 1445:iconst_0        
	//  770 1446:aload_0         
	//  771 1447:getfield        #12  <Field azh a>
	//  772 1450:getfield        #125 <Field int azh.aL>
	//  773 1453:int2byte        
	//  774 1454:bastore         
		abyte1[1] = (byte)(a.aL >>> 8);
	//  775 1455:aload_2         
	//  776 1456:iconst_1        
	//  777 1457:aload_0         
	//  778 1458:getfield        #12  <Field azh a>
	//  779 1461:getfield        #125 <Field int azh.aL>
	//  780 1464:bipush          8
	//  781 1466:iushr           
	//  782 1467:int2byte        
	//  783 1468:bastore         
		abyte1[2] = (byte)(a.aL >>> 16);
	//  784 1469:aload_2         
	//  785 1470:iconst_2        
	//  786 1471:aload_0         
	//  787 1472:getfield        #12  <Field azh a>
	//  788 1475:getfield        #125 <Field int azh.aL>
	//  789 1478:bipush          16
	//  790 1480:iushr           
	//  791 1481:int2byte        
	//  792 1482:bastore         
		abyte1[3] = (byte)((a.aL & 0xff000000) >>> 24);
	//  793 1483:aload_2         
	//  794 1484:iconst_3        
	//  795 1485:aload_0         
	//  796 1486:getfield        #12  <Field azh a>
	//  797 1489:getfield        #125 <Field int azh.aL>
	//  798 1492:ldc1            #126 <Int 0xff000000>
	//  799 1494:iand            
	//  800 1495:bipush          24
	//  801 1497:iushr           
	//  802 1498:int2byte        
	//  803 1499:bastore         
		abyte1[4] = (byte)a.ce;
	//  804 1500:aload_2         
	//  805 1501:iconst_4        
	//  806 1502:aload_0         
	//  807 1503:getfield        #12  <Field azh a>
	//  808 1506:getfield        #129 <Field int azh.ce>
	//  809 1509:int2byte        
	//  810 1510:bastore         
		abyte1[5] = (byte)(a.ce >>> 8);
	//  811 1511:aload_2         
	//  812 1512:iconst_5        
	//  813 1513:aload_0         
	//  814 1514:getfield        #12  <Field azh a>
	//  815 1517:getfield        #129 <Field int azh.ce>
	//  816 1520:bipush          8
	//  817 1522:iushr           
	//  818 1523:int2byte        
	//  819 1524:bastore         
		abyte1[6] = (byte)(a.ce >>> 16);
	//  820 1525:aload_2         
	//  821 1526:bipush          6
	//  822 1528:aload_0         
	//  823 1529:getfield        #12  <Field azh a>
	//  824 1532:getfield        #129 <Field int azh.ce>
	//  825 1535:bipush          16
	//  826 1537:iushr           
	//  827 1538:int2byte        
	//  828 1539:bastore         
		abyte1[7] = (byte)((a.ce & 0xff000000) >>> 24);
	//  829 1540:aload_2         
	//  830 1541:bipush          7
	//  831 1543:aload_0         
	//  832 1544:getfield        #12  <Field azh a>
	//  833 1547:getfield        #129 <Field int azh.ce>
	//  834 1550:ldc1            #126 <Int 0xff000000>
	//  835 1552:iand            
	//  836 1553:bipush          24
	//  837 1555:iushr           
	//  838 1556:int2byte        
	//  839 1557:bastore         
		abyte1[8] = (byte)a.bn;
	//  840 1558:aload_2         
	//  841 1559:bipush          8
	//  842 1561:aload_0         
	//  843 1562:getfield        #12  <Field azh a>
	//  844 1565:getfield        #116 <Field int azh.bn>
	//  845 1568:int2byte        
	//  846 1569:bastore         
		abyte1[9] = (byte)(a.bn >>> 8);
	//  847 1570:aload_2         
	//  848 1571:bipush          9
	//  849 1573:aload_0         
	//  850 1574:getfield        #12  <Field azh a>
	//  851 1577:getfield        #116 <Field int azh.bn>
	//  852 1580:bipush          8
	//  853 1582:iushr           
	//  854 1583:int2byte        
	//  855 1584:bastore         
		abyte1[10] = (byte)(a.bn >>> 16);
	//  856 1585:aload_2         
	//  857 1586:bipush          10
	//  858 1588:aload_0         
	//  859 1589:getfield        #12  <Field azh a>
	//  860 1592:getfield        #116 <Field int azh.bn>
	//  861 1595:bipush          16
	//  862 1597:iushr           
	//  863 1598:int2byte        
	//  864 1599:bastore         
		abyte1[11] = (byte)((a.bn & 0xff000000) >>> 24);
	//  865 1600:aload_2         
	//  866 1601:bipush          11
	//  867 1603:aload_0         
	//  868 1604:getfield        #12  <Field azh a>
	//  869 1607:getfield        #116 <Field int azh.bn>
	//  870 1610:ldc1            #126 <Int 0xff000000>
	//  871 1612:iand            
	//  872 1613:bipush          24
	//  873 1615:iushr           
	//  874 1616:int2byte        
	//  875 1617:bastore         
		abyte1[12] = (byte)a.bd;
	//  876 1618:aload_2         
	//  877 1619:bipush          12
	//  878 1621:aload_0         
	//  879 1622:getfield        #12  <Field azh a>
	//  880 1625:getfield        #132 <Field int azh.bd>
	//  881 1628:int2byte        
	//  882 1629:bastore         
		abyte1[13] = (byte)(a.bd >>> 8);
	//  883 1630:aload_2         
	//  884 1631:bipush          13
	//  885 1633:aload_0         
	//  886 1634:getfield        #12  <Field azh a>
	//  887 1637:getfield        #132 <Field int azh.bd>
	//  888 1640:bipush          8
	//  889 1642:iushr           
	//  890 1643:int2byte        
	//  891 1644:bastore         
		abyte1[14] = (byte)(a.bd >>> 16);
	//  892 1645:aload_2         
	//  893 1646:bipush          14
	//  894 1648:aload_0         
	//  895 1649:getfield        #12  <Field azh a>
	//  896 1652:getfield        #132 <Field int azh.bd>
	//  897 1655:bipush          16
	//  898 1657:iushr           
	//  899 1658:int2byte        
	//  900 1659:bastore         
		abyte1[15] = (byte)((a.bd & 0xff000000) >>> 24);
	//  901 1660:aload_2         
	//  902 1661:bipush          15
	//  903 1663:aload_0         
	//  904 1664:getfield        #12  <Field azh a>
	//  905 1667:getfield        #132 <Field int azh.bd>
	//  906 1670:ldc1            #126 <Int 0xff000000>
	//  907 1672:iand            
	//  908 1673:bipush          24
	//  909 1675:iushr           
	//  910 1676:int2byte        
	//  911 1677:bastore         
		abyte1[16] = (byte)a.f;
	//  912 1678:aload_2         
	//  913 1679:bipush          16
	//  914 1681:aload_0         
	//  915 1682:getfield        #12  <Field azh a>
	//  916 1685:getfield        #107 <Field int azh.f>
	//  917 1688:int2byte        
	//  918 1689:bastore         
		abyte1[17] = (byte)(a.f >>> 8);
	//  919 1690:aload_2         
	//  920 1691:bipush          17
	//  921 1693:aload_0         
	//  922 1694:getfield        #12  <Field azh a>
	//  923 1697:getfield        #107 <Field int azh.f>
	//  924 1700:bipush          8
	//  925 1702:iushr           
	//  926 1703:int2byte        
	//  927 1704:bastore         
		abyte1[18] = (byte)(a.f >>> 16);
	//  928 1705:aload_2         
	//  929 1706:bipush          18
	//  930 1708:aload_0         
	//  931 1709:getfield        #12  <Field azh a>
	//  932 1712:getfield        #107 <Field int azh.f>
	//  933 1715:bipush          16
	//  934 1717:iushr           
	//  935 1718:int2byte        
	//  936 1719:bastore         
		abyte1[19] = (byte)((a.f & 0xff000000) >>> 24);
	//  937 1720:aload_2         
	//  938 1721:bipush          19
	//  939 1723:aload_0         
	//  940 1724:getfield        #12  <Field azh a>
	//  941 1727:getfield        #107 <Field int azh.f>
	//  942 1730:ldc1            #126 <Int 0xff000000>
	//  943 1732:iand            
	//  944 1733:bipush          24
	//  945 1735:iushr           
	//  946 1736:int2byte        
	//  947 1737:bastore         
		abyte1[20] = (byte)a.e;
	//  948 1738:aload_2         
	//  949 1739:bipush          20
	//  950 1741:aload_0         
	//  951 1742:getfield        #12  <Field azh a>
	//  952 1745:getfield        #135 <Field int azh.e>
	//  953 1748:int2byte        
	//  954 1749:bastore         
		abyte1[21] = (byte)(a.e >>> 8);
	//  955 1750:aload_2         
	//  956 1751:bipush          21
	//  957 1753:aload_0         
	//  958 1754:getfield        #12  <Field azh a>
	//  959 1757:getfield        #135 <Field int azh.e>
	//  960 1760:bipush          8
	//  961 1762:iushr           
	//  962 1763:int2byte        
	//  963 1764:bastore         
		abyte1[22] = (byte)(a.e >>> 16);
	//  964 1765:aload_2         
	//  965 1766:bipush          22
	//  966 1768:aload_0         
	//  967 1769:getfield        #12  <Field azh a>
	//  968 1772:getfield        #135 <Field int azh.e>
	//  969 1775:bipush          16
	//  970 1777:iushr           
	//  971 1778:int2byte        
	//  972 1779:bastore         
		abyte1[23] = (byte)((a.e & 0xff000000) >>> 24);
	//  973 1780:aload_2         
	//  974 1781:bipush          23
	//  975 1783:aload_0         
	//  976 1784:getfield        #12  <Field azh a>
	//  977 1787:getfield        #135 <Field int azh.e>
	//  978 1790:ldc1            #126 <Int 0xff000000>
	//  979 1792:iand            
	//  980 1793:bipush          24
	//  981 1795:iushr           
	//  982 1796:int2byte        
	//  983 1797:bastore         
		abyte1[24] = (byte)a.h;
	//  984 1798:aload_2         
	//  985 1799:bipush          24
	//  986 1801:aload_0         
	//  987 1802:getfield        #12  <Field azh a>
	//  988 1805:getfield        #138 <Field int azh.h>
	//  989 1808:int2byte        
	//  990 1809:bastore         
		abyte1[25] = (byte)(a.h >>> 8);
	//  991 1810:aload_2         
	//  992 1811:bipush          25
	//  993 1813:aload_0         
	//  994 1814:getfield        #12  <Field azh a>
	//  995 1817:getfield        #138 <Field int azh.h>
	//  996 1820:bipush          8
	//  997 1822:iushr           
	//  998 1823:int2byte        
	//  999 1824:bastore         
		abyte1[26] = (byte)(a.h >>> 16);
	// 1000 1825:aload_2         
	// 1001 1826:bipush          26
	// 1002 1828:aload_0         
	// 1003 1829:getfield        #12  <Field azh a>
	// 1004 1832:getfield        #138 <Field int azh.h>
	// 1005 1835:bipush          16
	// 1006 1837:iushr           
	// 1007 1838:int2byte        
	// 1008 1839:bastore         
		abyte1[27] = (byte)((a.h & 0xff000000) >>> 24);
	// 1009 1840:aload_2         
	// 1010 1841:bipush          27
	// 1011 1843:aload_0         
	// 1012 1844:getfield        #12  <Field azh a>
	// 1013 1847:getfield        #138 <Field int azh.h>
	// 1014 1850:ldc1            #126 <Int 0xff000000>
	// 1015 1852:iand            
	// 1016 1853:bipush          24
	// 1017 1855:iushr           
	// 1018 1856:int2byte        
	// 1019 1857:bastore         
		abyte1[28] = (byte)a.bC;
	// 1020 1858:aload_2         
	// 1021 1859:bipush          28
	// 1022 1861:aload_0         
	// 1023 1862:getfield        #12  <Field azh a>
	// 1024 1865:getfield        #56  <Field int azh.bC>
	// 1025 1868:int2byte        
	// 1026 1869:bastore         
		abyte1[29] = (byte)(a.bC >>> 8);
	// 1027 1870:aload_2         
	// 1028 1871:bipush          29
	// 1029 1873:aload_0         
	// 1030 1874:getfield        #12  <Field azh a>
	// 1031 1877:getfield        #56  <Field int azh.bC>
	// 1032 1880:bipush          8
	// 1033 1882:iushr           
	// 1034 1883:int2byte        
	// 1035 1884:bastore         
		abyte1[30] = (byte)(a.bC >>> 16);
	// 1036 1885:aload_2         
	// 1037 1886:bipush          30
	// 1038 1888:aload_0         
	// 1039 1889:getfield        #12  <Field azh a>
	// 1040 1892:getfield        #56  <Field int azh.bC>
	// 1041 1895:bipush          16
	// 1042 1897:iushr           
	// 1043 1898:int2byte        
	// 1044 1899:bastore         
		abyte1[31] = (byte)((a.bC & 0xff000000) >>> 24);
	// 1045 1900:aload_2         
	// 1046 1901:bipush          31
	// 1047 1903:aload_0         
	// 1048 1904:getfield        #12  <Field azh a>
	// 1049 1907:getfield        #56  <Field int azh.bC>
	// 1050 1910:ldc1            #126 <Int 0xff000000>
	// 1051 1912:iand            
	// 1052 1913:bipush          24
	// 1053 1915:iushr           
	// 1054 1916:int2byte        
	// 1055 1917:bastore         
		abyte1[32] = (byte)a.j;
	// 1056 1918:aload_2         
	// 1057 1919:bipush          32
	// 1058 1921:aload_0         
	// 1059 1922:getfield        #12  <Field azh a>
	// 1060 1925:getfield        #141 <Field int azh.j>
	// 1061 1928:int2byte        
	// 1062 1929:bastore         
		abyte1[33] = (byte)(a.j >>> 8);
	// 1063 1930:aload_2         
	// 1064 1931:bipush          33
	// 1065 1933:aload_0         
	// 1066 1934:getfield        #12  <Field azh a>
	// 1067 1937:getfield        #141 <Field int azh.j>
	// 1068 1940:bipush          8
	// 1069 1942:iushr           
	// 1070 1943:int2byte        
	// 1071 1944:bastore         
		abyte1[34] = (byte)(a.j >>> 16);
	// 1072 1945:aload_2         
	// 1073 1946:bipush          34
	// 1074 1948:aload_0         
	// 1075 1949:getfield        #12  <Field azh a>
	// 1076 1952:getfield        #141 <Field int azh.j>
	// 1077 1955:bipush          16
	// 1078 1957:iushr           
	// 1079 1958:int2byte        
	// 1080 1959:bastore         
		abyte1[35] = (byte)((a.j & 0xff000000) >>> 24);
	// 1081 1960:aload_2         
	// 1082 1961:bipush          35
	// 1083 1963:aload_0         
	// 1084 1964:getfield        #12  <Field azh a>
	// 1085 1967:getfield        #141 <Field int azh.j>
	// 1086 1970:ldc1            #126 <Int 0xff000000>
	// 1087 1972:iand            
	// 1088 1973:bipush          24
	// 1089 1975:iushr           
	// 1090 1976:int2byte        
	// 1091 1977:bastore         
		abyte1[36] = (byte)a.cw;
	// 1092 1978:aload_2         
	// 1093 1979:bipush          36
	// 1094 1981:aload_0         
	// 1095 1982:getfield        #12  <Field azh a>
	// 1096 1985:getfield        #144 <Field int azh.cw>
	// 1097 1988:int2byte        
	// 1098 1989:bastore         
		abyte1[37] = (byte)(a.cw >>> 8);
	// 1099 1990:aload_2         
	// 1100 1991:bipush          37
	// 1101 1993:aload_0         
	// 1102 1994:getfield        #12  <Field azh a>
	// 1103 1997:getfield        #144 <Field int azh.cw>
	// 1104 2000:bipush          8
	// 1105 2002:iushr           
	// 1106 2003:int2byte        
	// 1107 2004:bastore         
		abyte1[38] = (byte)(a.cw >>> 16);
	// 1108 2005:aload_2         
	// 1109 2006:bipush          38
	// 1110 2008:aload_0         
	// 1111 2009:getfield        #12  <Field azh a>
	// 1112 2012:getfield        #144 <Field int azh.cw>
	// 1113 2015:bipush          16
	// 1114 2017:iushr           
	// 1115 2018:int2byte        
	// 1116 2019:bastore         
		abyte1[39] = (byte)((a.cw & 0xff000000) >>> 24);
	// 1117 2020:aload_2         
	// 1118 2021:bipush          39
	// 1119 2023:aload_0         
	// 1120 2024:getfield        #12  <Field azh a>
	// 1121 2027:getfield        #144 <Field int azh.cw>
	// 1122 2030:ldc1            #126 <Int 0xff000000>
	// 1123 2032:iand            
	// 1124 2033:bipush          24
	// 1125 2035:iushr           
	// 1126 2036:int2byte        
	// 1127 2037:bastore         
		abyte1[40] = (byte)a.bz;
	// 1128 2038:aload_2         
	// 1129 2039:bipush          40
	// 1130 2041:aload_0         
	// 1131 2042:getfield        #12  <Field azh a>
	// 1132 2045:getfield        #147 <Field int azh.bz>
	// 1133 2048:int2byte        
	// 1134 2049:bastore         
		abyte1[41] = (byte)(a.bz >>> 8);
	// 1135 2050:aload_2         
	// 1136 2051:bipush          41
	// 1137 2053:aload_0         
	// 1138 2054:getfield        #12  <Field azh a>
	// 1139 2057:getfield        #147 <Field int azh.bz>
	// 1140 2060:bipush          8
	// 1141 2062:iushr           
	// 1142 2063:int2byte        
	// 1143 2064:bastore         
		abyte1[42] = (byte)(a.bz >>> 16);
	// 1144 2065:aload_2         
	// 1145 2066:bipush          42
	// 1146 2068:aload_0         
	// 1147 2069:getfield        #12  <Field azh a>
	// 1148 2072:getfield        #147 <Field int azh.bz>
	// 1149 2075:bipush          16
	// 1150 2077:iushr           
	// 1151 2078:int2byte        
	// 1152 2079:bastore         
		abyte1[43] = (byte)((a.bz & 0xff000000) >>> 24);
	// 1153 2080:aload_2         
	// 1154 2081:bipush          43
	// 1155 2083:aload_0         
	// 1156 2084:getfield        #12  <Field azh a>
	// 1157 2087:getfield        #147 <Field int azh.bz>
	// 1158 2090:ldc1            #126 <Int 0xff000000>
	// 1159 2092:iand            
	// 1160 2093:bipush          24
	// 1161 2095:iushr           
	// 1162 2096:int2byte        
	// 1163 2097:bastore         
		abyte1[44] = (byte)a.k;
	// 1164 2098:aload_2         
	// 1165 2099:bipush          44
	// 1166 2101:aload_0         
	// 1167 2102:getfield        #12  <Field azh a>
	// 1168 2105:getfield        #150 <Field int azh.k>
	// 1169 2108:int2byte        
	// 1170 2109:bastore         
		abyte1[45] = (byte)(a.k >>> 8);
	// 1171 2110:aload_2         
	// 1172 2111:bipush          45
	// 1173 2113:aload_0         
	// 1174 2114:getfield        #12  <Field azh a>
	// 1175 2117:getfield        #150 <Field int azh.k>
	// 1176 2120:bipush          8
	// 1177 2122:iushr           
	// 1178 2123:int2byte        
	// 1179 2124:bastore         
		abyte1[46] = (byte)(a.k >>> 16);
	// 1180 2125:aload_2         
	// 1181 2126:bipush          46
	// 1182 2128:aload_0         
	// 1183 2129:getfield        #12  <Field azh a>
	// 1184 2132:getfield        #150 <Field int azh.k>
	// 1185 2135:bipush          16
	// 1186 2137:iushr           
	// 1187 2138:int2byte        
	// 1188 2139:bastore         
		abyte1[47] = (byte)((a.k & 0xff000000) >>> 24);
	// 1189 2140:aload_2         
	// 1190 2141:bipush          47
	// 1191 2143:aload_0         
	// 1192 2144:getfield        #12  <Field azh a>
	// 1193 2147:getfield        #150 <Field int azh.k>
	// 1194 2150:ldc1            #126 <Int 0xff000000>
	// 1195 2152:iand            
	// 1196 2153:bipush          24
	// 1197 2155:iushr           
	// 1198 2156:int2byte        
	// 1199 2157:bastore         
		abyte1[48] = (byte)a.aG;
	// 1200 2158:aload_2         
	// 1201 2159:bipush          48
	// 1202 2161:aload_0         
	// 1203 2162:getfield        #12  <Field azh a>
	// 1204 2165:getfield        #153 <Field int azh.aG>
	// 1205 2168:int2byte        
	// 1206 2169:bastore         
		abyte1[49] = (byte)(a.aG >>> 8);
	// 1207 2170:aload_2         
	// 1208 2171:bipush          49
	// 1209 2173:aload_0         
	// 1210 2174:getfield        #12  <Field azh a>
	// 1211 2177:getfield        #153 <Field int azh.aG>
	// 1212 2180:bipush          8
	// 1213 2182:iushr           
	// 1214 2183:int2byte        
	// 1215 2184:bastore         
		abyte1[50] = (byte)(a.aG >>> 16);
	// 1216 2185:aload_2         
	// 1217 2186:bipush          50
	// 1218 2188:aload_0         
	// 1219 2189:getfield        #12  <Field azh a>
	// 1220 2192:getfield        #153 <Field int azh.aG>
	// 1221 2195:bipush          16
	// 1222 2197:iushr           
	// 1223 2198:int2byte        
	// 1224 2199:bastore         
		abyte1[51] = (byte)((a.aG & 0xff000000) >>> 24);
	// 1225 2200:aload_2         
	// 1226 2201:bipush          51
	// 1227 2203:aload_0         
	// 1228 2204:getfield        #12  <Field azh a>
	// 1229 2207:getfield        #153 <Field int azh.aG>
	// 1230 2210:ldc1            #126 <Int 0xff000000>
	// 1231 2212:iand            
	// 1232 2213:bipush          24
	// 1233 2215:iushr           
	// 1234 2216:int2byte        
	// 1235 2217:bastore         
		abyte1[52] = (byte)a.bD;
	// 1236 2218:aload_2         
	// 1237 2219:bipush          52
	// 1238 2221:aload_0         
	// 1239 2222:getfield        #12  <Field azh a>
	// 1240 2225:getfield        #156 <Field int azh.bD>
	// 1241 2228:int2byte        
	// 1242 2229:bastore         
		abyte1[53] = (byte)(a.bD >>> 8);
	// 1243 2230:aload_2         
	// 1244 2231:bipush          53
	// 1245 2233:aload_0         
	// 1246 2234:getfield        #12  <Field azh a>
	// 1247 2237:getfield        #156 <Field int azh.bD>
	// 1248 2240:bipush          8
	// 1249 2242:iushr           
	// 1250 2243:int2byte        
	// 1251 2244:bastore         
		abyte1[54] = (byte)(a.bD >>> 16);
	// 1252 2245:aload_2         
	// 1253 2246:bipush          54
	// 1254 2248:aload_0         
	// 1255 2249:getfield        #12  <Field azh a>
	// 1256 2252:getfield        #156 <Field int azh.bD>
	// 1257 2255:bipush          16
	// 1258 2257:iushr           
	// 1259 2258:int2byte        
	// 1260 2259:bastore         
		abyte1[55] = (byte)((a.bD & 0xff000000) >>> 24);
	// 1261 2260:aload_2         
	// 1262 2261:bipush          55
	// 1263 2263:aload_0         
	// 1264 2264:getfield        #12  <Field azh a>
	// 1265 2267:getfield        #156 <Field int azh.bD>
	// 1266 2270:ldc1            #126 <Int 0xff000000>
	// 1267 2272:iand            
	// 1268 2273:bipush          24
	// 1269 2275:iushr           
	// 1270 2276:int2byte        
	// 1271 2277:bastore         
		abyte1[56] = (byte)a.aX;
	// 1272 2278:aload_2         
	// 1273 2279:bipush          56
	// 1274 2281:aload_0         
	// 1275 2282:getfield        #12  <Field azh a>
	// 1276 2285:getfield        #159 <Field int azh.aX>
	// 1277 2288:int2byte        
	// 1278 2289:bastore         
		abyte1[57] = (byte)(a.aX >>> 8);
	// 1279 2290:aload_2         
	// 1280 2291:bipush          57
	// 1281 2293:aload_0         
	// 1282 2294:getfield        #12  <Field azh a>
	// 1283 2297:getfield        #159 <Field int azh.aX>
	// 1284 2300:bipush          8
	// 1285 2302:iushr           
	// 1286 2303:int2byte        
	// 1287 2304:bastore         
		abyte1[58] = (byte)(a.aX >>> 16);
	// 1288 2305:aload_2         
	// 1289 2306:bipush          58
	// 1290 2308:aload_0         
	// 1291 2309:getfield        #12  <Field azh a>
	// 1292 2312:getfield        #159 <Field int azh.aX>
	// 1293 2315:bipush          16
	// 1294 2317:iushr           
	// 1295 2318:int2byte        
	// 1296 2319:bastore         
		abyte1[59] = (byte)((a.aX & 0xff000000) >>> 24);
	// 1297 2320:aload_2         
	// 1298 2321:bipush          59
	// 1299 2323:aload_0         
	// 1300 2324:getfield        #12  <Field azh a>
	// 1301 2327:getfield        #159 <Field int azh.aX>
	// 1302 2330:ldc1            #126 <Int 0xff000000>
	// 1303 2332:iand            
	// 1304 2333:bipush          24
	// 1305 2335:iushr           
	// 1306 2336:int2byte        
	// 1307 2337:bastore         
		abyte1[60] = (byte)a.o;
	// 1308 2338:aload_2         
	// 1309 2339:bipush          60
	// 1310 2341:aload_0         
	// 1311 2342:getfield        #12  <Field azh a>
	// 1312 2345:getfield        #162 <Field int azh.o>
	// 1313 2348:int2byte        
	// 1314 2349:bastore         
		abyte1[61] = (byte)(a.o >>> 8);
	// 1315 2350:aload_2         
	// 1316 2351:bipush          61
	// 1317 2353:aload_0         
	// 1318 2354:getfield        #12  <Field azh a>
	// 1319 2357:getfield        #162 <Field int azh.o>
	// 1320 2360:bipush          8
	// 1321 2362:iushr           
	// 1322 2363:int2byte        
	// 1323 2364:bastore         
		abyte1[62] = (byte)(a.o >>> 16);
	// 1324 2365:aload_2         
	// 1325 2366:bipush          62
	// 1326 2368:aload_0         
	// 1327 2369:getfield        #12  <Field azh a>
	// 1328 2372:getfield        #162 <Field int azh.o>
	// 1329 2375:bipush          16
	// 1330 2377:iushr           
	// 1331 2378:int2byte        
	// 1332 2379:bastore         
		abyte1[63] = (byte)((a.o & 0xff000000) >>> 24);
	// 1333 2380:aload_2         
	// 1334 2381:bipush          63
	// 1335 2383:aload_0         
	// 1336 2384:getfield        #12  <Field azh a>
	// 1337 2387:getfield        #162 <Field int azh.o>
	// 1338 2390:ldc1            #126 <Int 0xff000000>
	// 1339 2392:iand            
	// 1340 2393:bipush          24
	// 1341 2395:iushr           
	// 1342 2396:int2byte        
	// 1343 2397:bastore         
		abyte1[64] = (byte)a.bl;
	// 1344 2398:aload_2         
	// 1345 2399:bipush          64
	// 1346 2401:aload_0         
	// 1347 2402:getfield        #12  <Field azh a>
	// 1348 2405:getfield        #122 <Field int azh.bl>
	// 1349 2408:int2byte        
	// 1350 2409:bastore         
		abyte1[65] = (byte)(a.bl >>> 8);
	// 1351 2410:aload_2         
	// 1352 2411:bipush          65
	// 1353 2413:aload_0         
	// 1354 2414:getfield        #12  <Field azh a>
	// 1355 2417:getfield        #122 <Field int azh.bl>
	// 1356 2420:bipush          8
	// 1357 2422:iushr           
	// 1358 2423:int2byte        
	// 1359 2424:bastore         
		abyte1[66] = (byte)(a.bl >>> 16);
	// 1360 2425:aload_2         
	// 1361 2426:bipush          66
	// 1362 2428:aload_0         
	// 1363 2429:getfield        #12  <Field azh a>
	// 1364 2432:getfield        #122 <Field int azh.bl>
	// 1365 2435:bipush          16
	// 1366 2437:iushr           
	// 1367 2438:int2byte        
	// 1368 2439:bastore         
		abyte1[67] = (byte)((a.bl & 0xff000000) >>> 24);
	// 1369 2440:aload_2         
	// 1370 2441:bipush          67
	// 1371 2443:aload_0         
	// 1372 2444:getfield        #12  <Field azh a>
	// 1373 2447:getfield        #122 <Field int azh.bl>
	// 1374 2450:ldc1            #126 <Int 0xff000000>
	// 1375 2452:iand            
	// 1376 2453:bipush          24
	// 1377 2455:iushr           
	// 1378 2456:int2byte        
	// 1379 2457:bastore         
		abyte1[68] = (byte)a.bc;
	// 1380 2458:aload_2         
	// 1381 2459:bipush          68
	// 1382 2461:aload_0         
	// 1383 2462:getfield        #12  <Field azh a>
	// 1384 2465:getfield        #165 <Field int azh.bc>
	// 1385 2468:int2byte        
	// 1386 2469:bastore         
		abyte1[69] = (byte)(a.bc >>> 8);
	// 1387 2470:aload_2         
	// 1388 2471:bipush          69
	// 1389 2473:aload_0         
	// 1390 2474:getfield        #12  <Field azh a>
	// 1391 2477:getfield        #165 <Field int azh.bc>
	// 1392 2480:bipush          8
	// 1393 2482:iushr           
	// 1394 2483:int2byte        
	// 1395 2484:bastore         
		abyte1[70] = (byte)(a.bc >>> 16);
	// 1396 2485:aload_2         
	// 1397 2486:bipush          70
	// 1398 2488:aload_0         
	// 1399 2489:getfield        #12  <Field azh a>
	// 1400 2492:getfield        #165 <Field int azh.bc>
	// 1401 2495:bipush          16
	// 1402 2497:iushr           
	// 1403 2498:int2byte        
	// 1404 2499:bastore         
		abyte1[71] = (byte)((a.bc & 0xff000000) >>> 24);
	// 1405 2500:aload_2         
	// 1406 2501:bipush          71
	// 1407 2503:aload_0         
	// 1408 2504:getfield        #12  <Field azh a>
	// 1409 2507:getfield        #165 <Field int azh.bc>
	// 1410 2510:ldc1            #126 <Int 0xff000000>
	// 1411 2512:iand            
	// 1412 2513:bipush          24
	// 1413 2515:iushr           
	// 1414 2516:int2byte        
	// 1415 2517:bastore         
		abyte1[72] = (byte)a.ap;
	// 1416 2518:aload_2         
	// 1417 2519:bipush          72
	// 1418 2521:aload_0         
	// 1419 2522:getfield        #12  <Field azh a>
	// 1420 2525:getfield        #168 <Field int azh.ap>
	// 1421 2528:int2byte        
	// 1422 2529:bastore         
		abyte1[73] = (byte)(a.ap >>> 8);
	// 1423 2530:aload_2         
	// 1424 2531:bipush          73
	// 1425 2533:aload_0         
	// 1426 2534:getfield        #12  <Field azh a>
	// 1427 2537:getfield        #168 <Field int azh.ap>
	// 1428 2540:bipush          8
	// 1429 2542:iushr           
	// 1430 2543:int2byte        
	// 1431 2544:bastore         
		abyte1[74] = (byte)(a.ap >>> 16);
	// 1432 2545:aload_2         
	// 1433 2546:bipush          74
	// 1434 2548:aload_0         
	// 1435 2549:getfield        #12  <Field azh a>
	// 1436 2552:getfield        #168 <Field int azh.ap>
	// 1437 2555:bipush          16
	// 1438 2557:iushr           
	// 1439 2558:int2byte        
	// 1440 2559:bastore         
		abyte1[75] = (byte)((a.ap & 0xff000000) >>> 24);
	// 1441 2560:aload_2         
	// 1442 2561:bipush          75
	// 1443 2563:aload_0         
	// 1444 2564:getfield        #12  <Field azh a>
	// 1445 2567:getfield        #168 <Field int azh.ap>
	// 1446 2570:ldc1            #126 <Int 0xff000000>
	// 1447 2572:iand            
	// 1448 2573:bipush          24
	// 1449 2575:iushr           
	// 1450 2576:int2byte        
	// 1451 2577:bastore         
		abyte1[76] = (byte)a.bb;
	// 1452 2578:aload_2         
	// 1453 2579:bipush          76
	// 1454 2581:aload_0         
	// 1455 2582:getfield        #12  <Field azh a>
	// 1456 2585:getfield        #171 <Field int azh.bb>
	// 1457 2588:int2byte        
	// 1458 2589:bastore         
		abyte1[77] = (byte)(a.bb >>> 8);
	// 1459 2590:aload_2         
	// 1460 2591:bipush          77
	// 1461 2593:aload_0         
	// 1462 2594:getfield        #12  <Field azh a>
	// 1463 2597:getfield        #171 <Field int azh.bb>
	// 1464 2600:bipush          8
	// 1465 2602:iushr           
	// 1466 2603:int2byte        
	// 1467 2604:bastore         
		abyte1[78] = (byte)(a.bb >>> 16);
	// 1468 2605:aload_2         
	// 1469 2606:bipush          78
	// 1470 2608:aload_0         
	// 1471 2609:getfield        #12  <Field azh a>
	// 1472 2612:getfield        #171 <Field int azh.bb>
	// 1473 2615:bipush          16
	// 1474 2617:iushr           
	// 1475 2618:int2byte        
	// 1476 2619:bastore         
		abyte1[79] = (byte)((a.bb & 0xff000000) >>> 24);
	// 1477 2620:aload_2         
	// 1478 2621:bipush          79
	// 1479 2623:aload_0         
	// 1480 2624:getfield        #12  <Field azh a>
	// 1481 2627:getfield        #171 <Field int azh.bb>
	// 1482 2630:ldc1            #126 <Int 0xff000000>
	// 1483 2632:iand            
	// 1484 2633:bipush          24
	// 1485 2635:iushr           
	// 1486 2636:int2byte        
	// 1487 2637:bastore         
		abyte1[80] = (byte)a.v;
	// 1488 2638:aload_2         
	// 1489 2639:bipush          80
	// 1490 2641:aload_0         
	// 1491 2642:getfield        #12  <Field azh a>
	// 1492 2645:getfield        #174 <Field int azh.v>
	// 1493 2648:int2byte        
	// 1494 2649:bastore         
		abyte1[81] = (byte)(a.v >>> 8);
	// 1495 2650:aload_2         
	// 1496 2651:bipush          81
	// 1497 2653:aload_0         
	// 1498 2654:getfield        #12  <Field azh a>
	// 1499 2657:getfield        #174 <Field int azh.v>
	// 1500 2660:bipush          8
	// 1501 2662:iushr           
	// 1502 2663:int2byte        
	// 1503 2664:bastore         
		abyte1[82] = (byte)(a.v >>> 16);
	// 1504 2665:aload_2         
	// 1505 2666:bipush          82
	// 1506 2668:aload_0         
	// 1507 2669:getfield        #12  <Field azh a>
	// 1508 2672:getfield        #174 <Field int azh.v>
	// 1509 2675:bipush          16
	// 1510 2677:iushr           
	// 1511 2678:int2byte        
	// 1512 2679:bastore         
		abyte1[83] = (byte)((a.v & 0xff000000) >>> 24);
	// 1513 2680:aload_2         
	// 1514 2681:bipush          83
	// 1515 2683:aload_0         
	// 1516 2684:getfield        #12  <Field azh a>
	// 1517 2687:getfield        #174 <Field int azh.v>
	// 1518 2690:ldc1            #126 <Int 0xff000000>
	// 1519 2692:iand            
	// 1520 2693:bipush          24
	// 1521 2695:iushr           
	// 1522 2696:int2byte        
	// 1523 2697:bastore         
		abyte1[84] = (byte)a.u;
	// 1524 2698:aload_2         
	// 1525 2699:bipush          84
	// 1526 2701:aload_0         
	// 1527 2702:getfield        #12  <Field azh a>
	// 1528 2705:getfield        #177 <Field int azh.u>
	// 1529 2708:int2byte        
	// 1530 2709:bastore         
		abyte1[85] = (byte)(a.u >>> 8);
	// 1531 2710:aload_2         
	// 1532 2711:bipush          85
	// 1533 2713:aload_0         
	// 1534 2714:getfield        #12  <Field azh a>
	// 1535 2717:getfield        #177 <Field int azh.u>
	// 1536 2720:bipush          8
	// 1537 2722:iushr           
	// 1538 2723:int2byte        
	// 1539 2724:bastore         
		abyte1[86] = (byte)(a.u >>> 16);
	// 1540 2725:aload_2         
	// 1541 2726:bipush          86
	// 1542 2728:aload_0         
	// 1543 2729:getfield        #12  <Field azh a>
	// 1544 2732:getfield        #177 <Field int azh.u>
	// 1545 2735:bipush          16
	// 1546 2737:iushr           
	// 1547 2738:int2byte        
	// 1548 2739:bastore         
		abyte1[87] = (byte)((a.u & 0xff000000) >>> 24);
	// 1549 2740:aload_2         
	// 1550 2741:bipush          87
	// 1551 2743:aload_0         
	// 1552 2744:getfield        #12  <Field azh a>
	// 1553 2747:getfield        #177 <Field int azh.u>
	// 1554 2750:ldc1            #126 <Int 0xff000000>
	// 1555 2752:iand            
	// 1556 2753:bipush          24
	// 1557 2755:iushr           
	// 1558 2756:int2byte        
	// 1559 2757:bastore         
		abyte1[88] = (byte)a.x;
	// 1560 2758:aload_2         
	// 1561 2759:bipush          88
	// 1562 2761:aload_0         
	// 1563 2762:getfield        #12  <Field azh a>
	// 1564 2765:getfield        #68  <Field int azh.x>
	// 1565 2768:int2byte        
	// 1566 2769:bastore         
		abyte1[89] = (byte)(a.x >>> 8);
	// 1567 2770:aload_2         
	// 1568 2771:bipush          89
	// 1569 2773:aload_0         
	// 1570 2774:getfield        #12  <Field azh a>
	// 1571 2777:getfield        #68  <Field int azh.x>
	// 1572 2780:bipush          8
	// 1573 2782:iushr           
	// 1574 2783:int2byte        
	// 1575 2784:bastore         
		abyte1[90] = (byte)(a.x >>> 16);
	// 1576 2785:aload_2         
	// 1577 2786:bipush          90
	// 1578 2788:aload_0         
	// 1579 2789:getfield        #12  <Field azh a>
	// 1580 2792:getfield        #68  <Field int azh.x>
	// 1581 2795:bipush          16
	// 1582 2797:iushr           
	// 1583 2798:int2byte        
	// 1584 2799:bastore         
		abyte1[91] = (byte)((a.x & 0xff000000) >>> 24);
	// 1585 2800:aload_2         
	// 1586 2801:bipush          91
	// 1587 2803:aload_0         
	// 1588 2804:getfield        #12  <Field azh a>
	// 1589 2807:getfield        #68  <Field int azh.x>
	// 1590 2810:ldc1            #126 <Int 0xff000000>
	// 1591 2812:iand            
	// 1592 2813:bipush          24
	// 1593 2815:iushr           
	// 1594 2816:int2byte        
	// 1595 2817:bastore         
		abyte1[92] = (byte)a.w;
	// 1596 2818:aload_2         
	// 1597 2819:bipush          92
	// 1598 2821:aload_0         
	// 1599 2822:getfield        #12  <Field azh a>
	// 1600 2825:getfield        #180 <Field int azh.w>
	// 1601 2828:int2byte        
	// 1602 2829:bastore         
		abyte1[93] = (byte)(a.w >>> 8);
	// 1603 2830:aload_2         
	// 1604 2831:bipush          93
	// 1605 2833:aload_0         
	// 1606 2834:getfield        #12  <Field azh a>
	// 1607 2837:getfield        #180 <Field int azh.w>
	// 1608 2840:bipush          8
	// 1609 2842:iushr           
	// 1610 2843:int2byte        
	// 1611 2844:bastore         
		abyte1[94] = (byte)(a.w >>> 16);
	// 1612 2845:aload_2         
	// 1613 2846:bipush          94
	// 1614 2848:aload_0         
	// 1615 2849:getfield        #12  <Field azh a>
	// 1616 2852:getfield        #180 <Field int azh.w>
	// 1617 2855:bipush          16
	// 1618 2857:iushr           
	// 1619 2858:int2byte        
	// 1620 2859:bastore         
		abyte1[95] = (byte)((a.w & 0xff000000) >>> 24);
	// 1621 2860:aload_2         
	// 1622 2861:bipush          95
	// 1623 2863:aload_0         
	// 1624 2864:getfield        #12  <Field azh a>
	// 1625 2867:getfield        #180 <Field int azh.w>
	// 1626 2870:ldc1            #126 <Int 0xff000000>
	// 1627 2872:iand            
	// 1628 2873:bipush          24
	// 1629 2875:iushr           
	// 1630 2876:int2byte        
	// 1631 2877:bastore         
		abyte1[96] = (byte)a.bE;
	// 1632 2878:aload_2         
	// 1633 2879:bipush          96
	// 1634 2881:aload_0         
	// 1635 2882:getfield        #12  <Field azh a>
	// 1636 2885:getfield        #183 <Field int azh.bE>
	// 1637 2888:int2byte        
	// 1638 2889:bastore         
		abyte1[97] = (byte)(a.bE >>> 8);
	// 1639 2890:aload_2         
	// 1640 2891:bipush          97
	// 1641 2893:aload_0         
	// 1642 2894:getfield        #12  <Field azh a>
	// 1643 2897:getfield        #183 <Field int azh.bE>
	// 1644 2900:bipush          8
	// 1645 2902:iushr           
	// 1646 2903:int2byte        
	// 1647 2904:bastore         
		abyte1[98] = (byte)(a.bE >>> 16);
	// 1648 2905:aload_2         
	// 1649 2906:bipush          98
	// 1650 2908:aload_0         
	// 1651 2909:getfield        #12  <Field azh a>
	// 1652 2912:getfield        #183 <Field int azh.bE>
	// 1653 2915:bipush          16
	// 1654 2917:iushr           
	// 1655 2918:int2byte        
	// 1656 2919:bastore         
		abyte1[99] = (byte)((a.bE & 0xff000000) >>> 24);
	// 1657 2920:aload_2         
	// 1658 2921:bipush          99
	// 1659 2923:aload_0         
	// 1660 2924:getfield        #12  <Field azh a>
	// 1661 2927:getfield        #183 <Field int azh.bE>
	// 1662 2930:ldc1            #126 <Int 0xff000000>
	// 1663 2932:iand            
	// 1664 2933:bipush          24
	// 1665 2935:iushr           
	// 1666 2936:int2byte        
	// 1667 2937:bastore         
		abyte1[100] = (byte)a.bN;
	// 1668 2938:aload_2         
	// 1669 2939:bipush          100
	// 1670 2941:aload_0         
	// 1671 2942:getfield        #12  <Field azh a>
	// 1672 2945:getfield        #186 <Field int azh.bN>
	// 1673 2948:int2byte        
	// 1674 2949:bastore         
		abyte1[101] = (byte)(a.bN >>> 8);
	// 1675 2950:aload_2         
	// 1676 2951:bipush          101
	// 1677 2953:aload_0         
	// 1678 2954:getfield        #12  <Field azh a>
	// 1679 2957:getfield        #186 <Field int azh.bN>
	// 1680 2960:bipush          8
	// 1681 2962:iushr           
	// 1682 2963:int2byte        
	// 1683 2964:bastore         
		abyte1[102] = (byte)(a.bN >>> 16);
	// 1684 2965:aload_2         
	// 1685 2966:bipush          102
	// 1686 2968:aload_0         
	// 1687 2969:getfield        #12  <Field azh a>
	// 1688 2972:getfield        #186 <Field int azh.bN>
	// 1689 2975:bipush          16
	// 1690 2977:iushr           
	// 1691 2978:int2byte        
	// 1692 2979:bastore         
		abyte1[103] = (byte)((a.bN & 0xff000000) >>> 24);
	// 1693 2980:aload_2         
	// 1694 2981:bipush          103
	// 1695 2983:aload_0         
	// 1696 2984:getfield        #12  <Field azh a>
	// 1697 2987:getfield        #186 <Field int azh.bN>
	// 1698 2990:ldc1            #126 <Int 0xff000000>
	// 1699 2992:iand            
	// 1700 2993:bipush          24
	// 1701 2995:iushr           
	// 1702 2996:int2byte        
	// 1703 2997:bastore         
		abyte1[104] = (byte)a.aF;
	// 1704 2998:aload_2         
	// 1705 2999:bipush          104
	// 1706 3001:aload_0         
	// 1707 3002:getfield        #12  <Field azh a>
	// 1708 3005:getfield        #189 <Field int azh.aF>
	// 1709 3008:int2byte        
	// 1710 3009:bastore         
		abyte1[105] = (byte)(a.aF >>> 8);
	// 1711 3010:aload_2         
	// 1712 3011:bipush          105
	// 1713 3013:aload_0         
	// 1714 3014:getfield        #12  <Field azh a>
	// 1715 3017:getfield        #189 <Field int azh.aF>
	// 1716 3020:bipush          8
	// 1717 3022:iushr           
	// 1718 3023:int2byte        
	// 1719 3024:bastore         
		abyte1[106] = (byte)(a.aF >>> 16);
	// 1720 3025:aload_2         
	// 1721 3026:bipush          106
	// 1722 3028:aload_0         
	// 1723 3029:getfield        #12  <Field azh a>
	// 1724 3032:getfield        #189 <Field int azh.aF>
	// 1725 3035:bipush          16
	// 1726 3037:iushr           
	// 1727 3038:int2byte        
	// 1728 3039:bastore         
		abyte1[107] = (byte)((a.aF & 0xff000000) >>> 24);
	// 1729 3040:aload_2         
	// 1730 3041:bipush          107
	// 1731 3043:aload_0         
	// 1732 3044:getfield        #12  <Field azh a>
	// 1733 3047:getfield        #189 <Field int azh.aF>
	// 1734 3050:ldc1            #126 <Int 0xff000000>
	// 1735 3052:iand            
	// 1736 3053:bipush          24
	// 1737 3055:iushr           
	// 1738 3056:int2byte        
	// 1739 3057:bastore         
		abyte1[108] = (byte)a.A;
	// 1740 3058:aload_2         
	// 1741 3059:bipush          108
	// 1742 3061:aload_0         
	// 1743 3062:getfield        #12  <Field azh a>
	// 1744 3065:getfield        #192 <Field int azh.A>
	// 1745 3068:int2byte        
	// 1746 3069:bastore         
		abyte1[109] = (byte)(a.A >>> 8);
	// 1747 3070:aload_2         
	// 1748 3071:bipush          109
	// 1749 3073:aload_0         
	// 1750 3074:getfield        #12  <Field azh a>
	// 1751 3077:getfield        #192 <Field int azh.A>
	// 1752 3080:bipush          8
	// 1753 3082:iushr           
	// 1754 3083:int2byte        
	// 1755 3084:bastore         
		abyte1[110] = (byte)(a.A >>> 16);
	// 1756 3085:aload_2         
	// 1757 3086:bipush          110
	// 1758 3088:aload_0         
	// 1759 3089:getfield        #12  <Field azh a>
	// 1760 3092:getfield        #192 <Field int azh.A>
	// 1761 3095:bipush          16
	// 1762 3097:iushr           
	// 1763 3098:int2byte        
	// 1764 3099:bastore         
		abyte1[111] = (byte)((a.A & 0xff000000) >>> 24);
	// 1765 3100:aload_2         
	// 1766 3101:bipush          111
	// 1767 3103:aload_0         
	// 1768 3104:getfield        #12  <Field azh a>
	// 1769 3107:getfield        #192 <Field int azh.A>
	// 1770 3110:ldc1            #126 <Int 0xff000000>
	// 1771 3112:iand            
	// 1772 3113:bipush          24
	// 1773 3115:iushr           
	// 1774 3116:int2byte        
	// 1775 3117:bastore         
		abyte1[112] = (byte)a.D;
	// 1776 3118:aload_2         
	// 1777 3119:bipush          112
	// 1778 3121:aload_0         
	// 1779 3122:getfield        #12  <Field azh a>
	// 1780 3125:getfield        #195 <Field int azh.D>
	// 1781 3128:int2byte        
	// 1782 3129:bastore         
		abyte1[113] = (byte)(a.D >>> 8);
	// 1783 3130:aload_2         
	// 1784 3131:bipush          113
	// 1785 3133:aload_0         
	// 1786 3134:getfield        #12  <Field azh a>
	// 1787 3137:getfield        #195 <Field int azh.D>
	// 1788 3140:bipush          8
	// 1789 3142:iushr           
	// 1790 3143:int2byte        
	// 1791 3144:bastore         
		abyte1[114] = (byte)(a.D >>> 16);
	// 1792 3145:aload_2         
	// 1793 3146:bipush          114
	// 1794 3148:aload_0         
	// 1795 3149:getfield        #12  <Field azh a>
	// 1796 3152:getfield        #195 <Field int azh.D>
	// 1797 3155:bipush          16
	// 1798 3157:iushr           
	// 1799 3158:int2byte        
	// 1800 3159:bastore         
		abyte1[115] = (byte)((a.D & 0xff000000) >>> 24);
	// 1801 3160:aload_2         
	// 1802 3161:bipush          115
	// 1803 3163:aload_0         
	// 1804 3164:getfield        #12  <Field azh a>
	// 1805 3167:getfield        #195 <Field int azh.D>
	// 1806 3170:ldc1            #126 <Int 0xff000000>
	// 1807 3172:iand            
	// 1808 3173:bipush          24
	// 1809 3175:iushr           
	// 1810 3176:int2byte        
	// 1811 3177:bastore         
		abyte1[116] = (byte)a.U;
	// 1812 3178:aload_2         
	// 1813 3179:bipush          116
	// 1814 3181:aload_0         
	// 1815 3182:getfield        #12  <Field azh a>
	// 1816 3185:getfield        #198 <Field int azh.U>
	// 1817 3188:int2byte        
	// 1818 3189:bastore         
		abyte1[117] = (byte)(a.U >>> 8);
	// 1819 3190:aload_2         
	// 1820 3191:bipush          117
	// 1821 3193:aload_0         
	// 1822 3194:getfield        #12  <Field azh a>
	// 1823 3197:getfield        #198 <Field int azh.U>
	// 1824 3200:bipush          8
	// 1825 3202:iushr           
	// 1826 3203:int2byte        
	// 1827 3204:bastore         
		abyte1[118] = (byte)(a.U >>> 16);
	// 1828 3205:aload_2         
	// 1829 3206:bipush          118
	// 1830 3208:aload_0         
	// 1831 3209:getfield        #12  <Field azh a>
	// 1832 3212:getfield        #198 <Field int azh.U>
	// 1833 3215:bipush          16
	// 1834 3217:iushr           
	// 1835 3218:int2byte        
	// 1836 3219:bastore         
		abyte1[119] = (byte)((a.U & 0xff000000) >>> 24);
	// 1837 3220:aload_2         
	// 1838 3221:bipush          119
	// 1839 3223:aload_0         
	// 1840 3224:getfield        #12  <Field azh a>
	// 1841 3227:getfield        #198 <Field int azh.U>
	// 1842 3230:ldc1            #126 <Int 0xff000000>
	// 1843 3232:iand            
	// 1844 3233:bipush          24
	// 1845 3235:iushr           
	// 1846 3236:int2byte        
	// 1847 3237:bastore         
		abyte1[120] = (byte)a.bH;
	// 1848 3238:aload_2         
	// 1849 3239:bipush          120
	// 1850 3241:aload_0         
	// 1851 3242:getfield        #12  <Field azh a>
	// 1852 3245:getfield        #201 <Field int azh.bH>
	// 1853 3248:int2byte        
	// 1854 3249:bastore         
		abyte1[121] = (byte)(a.bH >>> 8);
	// 1855 3250:aload_2         
	// 1856 3251:bipush          121
	// 1857 3253:aload_0         
	// 1858 3254:getfield        #12  <Field azh a>
	// 1859 3257:getfield        #201 <Field int azh.bH>
	// 1860 3260:bipush          8
	// 1861 3262:iushr           
	// 1862 3263:int2byte        
	// 1863 3264:bastore         
		abyte1[122] = (byte)(a.bH >>> 16);
	// 1864 3265:aload_2         
	// 1865 3266:bipush          122
	// 1866 3268:aload_0         
	// 1867 3269:getfield        #12  <Field azh a>
	// 1868 3272:getfield        #201 <Field int azh.bH>
	// 1869 3275:bipush          16
	// 1870 3277:iushr           
	// 1871 3278:int2byte        
	// 1872 3279:bastore         
		abyte1[123] = (byte)((a.bH & 0xff000000) >>> 24);
	// 1873 3280:aload_2         
	// 1874 3281:bipush          123
	// 1875 3283:aload_0         
	// 1876 3284:getfield        #12  <Field azh a>
	// 1877 3287:getfield        #201 <Field int azh.bH>
	// 1878 3290:ldc1            #126 <Int 0xff000000>
	// 1879 3292:iand            
	// 1880 3293:bipush          24
	// 1881 3295:iushr           
	// 1882 3296:int2byte        
	// 1883 3297:bastore         
		abyte1[124] = (byte)a.bh;
	// 1884 3298:aload_2         
	// 1885 3299:bipush          124
	// 1886 3301:aload_0         
	// 1887 3302:getfield        #12  <Field azh a>
	// 1888 3305:getfield        #204 <Field int azh.bh>
	// 1889 3308:int2byte        
	// 1890 3309:bastore         
		abyte1[125] = (byte)(a.bh >>> 8);
	// 1891 3310:aload_2         
	// 1892 3311:bipush          125
	// 1893 3313:aload_0         
	// 1894 3314:getfield        #12  <Field azh a>
	// 1895 3317:getfield        #204 <Field int azh.bh>
	// 1896 3320:bipush          8
	// 1897 3322:iushr           
	// 1898 3323:int2byte        
	// 1899 3324:bastore         
		abyte1[126] = (byte)(a.bh >>> 16);
	// 1900 3325:aload_2         
	// 1901 3326:bipush          126
	// 1902 3328:aload_0         
	// 1903 3329:getfield        #12  <Field azh a>
	// 1904 3332:getfield        #204 <Field int azh.bh>
	// 1905 3335:bipush          16
	// 1906 3337:iushr           
	// 1907 3338:int2byte        
	// 1908 3339:bastore         
		abyte1[127] = (byte)((a.bh & 0xff000000) >>> 24);
	// 1909 3340:aload_2         
	// 1910 3341:bipush          127
	// 1911 3343:aload_0         
	// 1912 3344:getfield        #12  <Field azh a>
	// 1913 3347:getfield        #204 <Field int azh.bh>
	// 1914 3350:ldc1            #126 <Int 0xff000000>
	// 1915 3352:iand            
	// 1916 3353:bipush          24
	// 1917 3355:iushr           
	// 1918 3356:int2byte        
	// 1919 3357:bastore         
		abyte1[128] = (byte)a.bi;
	// 1920 3358:aload_2         
	// 1921 3359:sipush          128
	// 1922 3362:aload_0         
	// 1923 3363:getfield        #12  <Field azh a>
	// 1924 3366:getfield        #207 <Field int azh.bi>
	// 1925 3369:int2byte        
	// 1926 3370:bastore         
		abyte1[129] = (byte)(a.bi >>> 8);
	// 1927 3371:aload_2         
	// 1928 3372:sipush          129
	// 1929 3375:aload_0         
	// 1930 3376:getfield        #12  <Field azh a>
	// 1931 3379:getfield        #207 <Field int azh.bi>
	// 1932 3382:bipush          8
	// 1933 3384:iushr           
	// 1934 3385:int2byte        
	// 1935 3386:bastore         
		abyte1[130] = (byte)(a.bi >>> 16);
	// 1936 3387:aload_2         
	// 1937 3388:sipush          130
	// 1938 3391:aload_0         
	// 1939 3392:getfield        #12  <Field azh a>
	// 1940 3395:getfield        #207 <Field int azh.bi>
	// 1941 3398:bipush          16
	// 1942 3400:iushr           
	// 1943 3401:int2byte        
	// 1944 3402:bastore         
		abyte1[131] = (byte)((a.bi & 0xff000000) >>> 24);
	// 1945 3403:aload_2         
	// 1946 3404:sipush          131
	// 1947 3407:aload_0         
	// 1948 3408:getfield        #12  <Field azh a>
	// 1949 3411:getfield        #207 <Field int azh.bi>
	// 1950 3414:ldc1            #126 <Int 0xff000000>
	// 1951 3416:iand            
	// 1952 3417:bipush          24
	// 1953 3419:iushr           
	// 1954 3420:int2byte        
	// 1955 3421:bastore         
		abyte1[132] = (byte)a.G;
	// 1956 3422:aload_2         
	// 1957 3423:sipush          132
	// 1958 3426:aload_0         
	// 1959 3427:getfield        #12  <Field azh a>
	// 1960 3430:getfield        #210 <Field int azh.G>
	// 1961 3433:int2byte        
	// 1962 3434:bastore         
		abyte1[133] = (byte)(a.G >>> 8);
	// 1963 3435:aload_2         
	// 1964 3436:sipush          133
	// 1965 3439:aload_0         
	// 1966 3440:getfield        #12  <Field azh a>
	// 1967 3443:getfield        #210 <Field int azh.G>
	// 1968 3446:bipush          8
	// 1969 3448:iushr           
	// 1970 3449:int2byte        
	// 1971 3450:bastore         
		abyte1[134] = (byte)(a.G >>> 16);
	// 1972 3451:aload_2         
	// 1973 3452:sipush          134
	// 1974 3455:aload_0         
	// 1975 3456:getfield        #12  <Field azh a>
	// 1976 3459:getfield        #210 <Field int azh.G>
	// 1977 3462:bipush          16
	// 1978 3464:iushr           
	// 1979 3465:int2byte        
	// 1980 3466:bastore         
		abyte1[135] = (byte)((a.G & 0xff000000) >>> 24);
	// 1981 3467:aload_2         
	// 1982 3468:sipush          135
	// 1983 3471:aload_0         
	// 1984 3472:getfield        #12  <Field azh a>
	// 1985 3475:getfield        #210 <Field int azh.G>
	// 1986 3478:ldc1            #126 <Int 0xff000000>
	// 1987 3480:iand            
	// 1988 3481:bipush          24
	// 1989 3483:iushr           
	// 1990 3484:int2byte        
	// 1991 3485:bastore         
		abyte1[136] = (byte)a.aT;
	// 1992 3486:aload_2         
	// 1993 3487:sipush          136
	// 1994 3490:aload_0         
	// 1995 3491:getfield        #12  <Field azh a>
	// 1996 3494:getfield        #213 <Field int azh.aT>
	// 1997 3497:int2byte        
	// 1998 3498:bastore         
		abyte1[137] = (byte)(a.aT >>> 8);
	// 1999 3499:aload_2         
	// 2000 3500:sipush          137
	// 2001 3503:aload_0         
	// 2002 3504:getfield        #12  <Field azh a>
	// 2003 3507:getfield        #213 <Field int azh.aT>
	// 2004 3510:bipush          8
	// 2005 3512:iushr           
	// 2006 3513:int2byte        
	// 2007 3514:bastore         
		abyte1[138] = (byte)(a.aT >>> 16);
	// 2008 3515:aload_2         
	// 2009 3516:sipush          138
	// 2010 3519:aload_0         
	// 2011 3520:getfield        #12  <Field azh a>
	// 2012 3523:getfield        #213 <Field int azh.aT>
	// 2013 3526:bipush          16
	// 2014 3528:iushr           
	// 2015 3529:int2byte        
	// 2016 3530:bastore         
		abyte1[139] = (byte)((a.aT & 0xff000000) >>> 24);
	// 2017 3531:aload_2         
	// 2018 3532:sipush          139
	// 2019 3535:aload_0         
	// 2020 3536:getfield        #12  <Field azh a>
	// 2021 3539:getfield        #213 <Field int azh.aT>
	// 2022 3542:ldc1            #126 <Int 0xff000000>
	// 2023 3544:iand            
	// 2024 3545:bipush          24
	// 2025 3547:iushr           
	// 2026 3548:int2byte        
	// 2027 3549:bastore         
		abyte1[140] = (byte)a.cm;
	// 2028 3550:aload_2         
	// 2029 3551:sipush          140
	// 2030 3554:aload_0         
	// 2031 3555:getfield        #12  <Field azh a>
	// 2032 3558:getfield        #216 <Field int azh.cm>
	// 2033 3561:int2byte        
	// 2034 3562:bastore         
		abyte1[141] = (byte)(a.cm >>> 8);
	// 2035 3563:aload_2         
	// 2036 3564:sipush          141
	// 2037 3567:aload_0         
	// 2038 3568:getfield        #12  <Field azh a>
	// 2039 3571:getfield        #216 <Field int azh.cm>
	// 2040 3574:bipush          8
	// 2041 3576:iushr           
	// 2042 3577:int2byte        
	// 2043 3578:bastore         
		abyte1[142] = (byte)(a.cm >>> 16);
	// 2044 3579:aload_2         
	// 2045 3580:sipush          142
	// 2046 3583:aload_0         
	// 2047 3584:getfield        #12  <Field azh a>
	// 2048 3587:getfield        #216 <Field int azh.cm>
	// 2049 3590:bipush          16
	// 2050 3592:iushr           
	// 2051 3593:int2byte        
	// 2052 3594:bastore         
		abyte1[143] = (byte)((a.cm & 0xff000000) >>> 24);
	// 2053 3595:aload_2         
	// 2054 3596:sipush          143
	// 2055 3599:aload_0         
	// 2056 3600:getfield        #12  <Field azh a>
	// 2057 3603:getfield        #216 <Field int azh.cm>
	// 2058 3606:ldc1            #126 <Int 0xff000000>
	// 2059 3608:iand            
	// 2060 3609:bipush          24
	// 2061 3611:iushr           
	// 2062 3612:int2byte        
	// 2063 3613:bastore         
		abyte1[144] = (byte)a.L;
	// 2064 3614:aload_2         
	// 2065 3615:sipush          144
	// 2066 3618:aload_0         
	// 2067 3619:getfield        #12  <Field azh a>
	// 2068 3622:getfield        #219 <Field int azh.L>
	// 2069 3625:int2byte        
	// 2070 3626:bastore         
		abyte1[145] = (byte)(a.L >>> 8);
	// 2071 3627:aload_2         
	// 2072 3628:sipush          145
	// 2073 3631:aload_0         
	// 2074 3632:getfield        #12  <Field azh a>
	// 2075 3635:getfield        #219 <Field int azh.L>
	// 2076 3638:bipush          8
	// 2077 3640:iushr           
	// 2078 3641:int2byte        
	// 2079 3642:bastore         
		abyte1[146] = (byte)(a.L >>> 16);
	// 2080 3643:aload_2         
	// 2081 3644:sipush          146
	// 2082 3647:aload_0         
	// 2083 3648:getfield        #12  <Field azh a>
	// 2084 3651:getfield        #219 <Field int azh.L>
	// 2085 3654:bipush          16
	// 2086 3656:iushr           
	// 2087 3657:int2byte        
	// 2088 3658:bastore         
		abyte1[147] = (byte)((a.L & 0xff000000) >>> 24);
	// 2089 3659:aload_2         
	// 2090 3660:sipush          147
	// 2091 3663:aload_0         
	// 2092 3664:getfield        #12  <Field azh a>
	// 2093 3667:getfield        #219 <Field int azh.L>
	// 2094 3670:ldc1            #126 <Int 0xff000000>
	// 2095 3672:iand            
	// 2096 3673:bipush          24
	// 2097 3675:iushr           
	// 2098 3676:int2byte        
	// 2099 3677:bastore         
		abyte1[148] = (byte)a.cl;
	// 2100 3678:aload_2         
	// 2101 3679:sipush          148
	// 2102 3682:aload_0         
	// 2103 3683:getfield        #12  <Field azh a>
	// 2104 3686:getfield        #222 <Field int azh.cl>
	// 2105 3689:int2byte        
	// 2106 3690:bastore         
		abyte1[149] = (byte)(a.cl >>> 8);
	// 2107 3691:aload_2         
	// 2108 3692:sipush          149
	// 2109 3695:aload_0         
	// 2110 3696:getfield        #12  <Field azh a>
	// 2111 3699:getfield        #222 <Field int azh.cl>
	// 2112 3702:bipush          8
	// 2113 3704:iushr           
	// 2114 3705:int2byte        
	// 2115 3706:bastore         
		abyte1[150] = (byte)(a.cl >>> 16);
	// 2116 3707:aload_2         
	// 2117 3708:sipush          150
	// 2118 3711:aload_0         
	// 2119 3712:getfield        #12  <Field azh a>
	// 2120 3715:getfield        #222 <Field int azh.cl>
	// 2121 3718:bipush          16
	// 2122 3720:iushr           
	// 2123 3721:int2byte        
	// 2124 3722:bastore         
		abyte1[151] = (byte)((a.cl & 0xff000000) >>> 24);
	// 2125 3723:aload_2         
	// 2126 3724:sipush          151
	// 2127 3727:aload_0         
	// 2128 3728:getfield        #12  <Field azh a>
	// 2129 3731:getfield        #222 <Field int azh.cl>
	// 2130 3734:ldc1            #126 <Int 0xff000000>
	// 2131 3736:iand            
	// 2132 3737:bipush          24
	// 2133 3739:iushr           
	// 2134 3740:int2byte        
	// 2135 3741:bastore         
		abyte1[152] = (byte)a.bR;
	// 2136 3742:aload_2         
	// 2137 3743:sipush          152
	// 2138 3746:aload_0         
	// 2139 3747:getfield        #12  <Field azh a>
	// 2140 3750:getfield        #225 <Field int azh.bR>
	// 2141 3753:int2byte        
	// 2142 3754:bastore         
		abyte1[153] = (byte)(a.bR >>> 8);
	// 2143 3755:aload_2         
	// 2144 3756:sipush          153
	// 2145 3759:aload_0         
	// 2146 3760:getfield        #12  <Field azh a>
	// 2147 3763:getfield        #225 <Field int azh.bR>
	// 2148 3766:bipush          8
	// 2149 3768:iushr           
	// 2150 3769:int2byte        
	// 2151 3770:bastore         
		abyte1[154] = (byte)(a.bR >>> 16);
	// 2152 3771:aload_2         
	// 2153 3772:sipush          154
	// 2154 3775:aload_0         
	// 2155 3776:getfield        #12  <Field azh a>
	// 2156 3779:getfield        #225 <Field int azh.bR>
	// 2157 3782:bipush          16
	// 2158 3784:iushr           
	// 2159 3785:int2byte        
	// 2160 3786:bastore         
		abyte1[155] = (byte)((a.bR & 0xff000000) >>> 24);
	// 2161 3787:aload_2         
	// 2162 3788:sipush          155
	// 2163 3791:aload_0         
	// 2164 3792:getfield        #12  <Field azh a>
	// 2165 3795:getfield        #225 <Field int azh.bR>
	// 2166 3798:ldc1            #126 <Int 0xff000000>
	// 2167 3800:iand            
	// 2168 3801:bipush          24
	// 2169 3803:iushr           
	// 2170 3804:int2byte        
	// 2171 3805:bastore         
		abyte1[156] = (byte)a.X;
	// 2172 3806:aload_2         
	// 2173 3807:sipush          156
	// 2174 3810:aload_0         
	// 2175 3811:getfield        #12  <Field azh a>
	// 2176 3814:getfield        #228 <Field int azh.X>
	// 2177 3817:int2byte        
	// 2178 3818:bastore         
		abyte1[157] = (byte)(a.X >>> 8);
	// 2179 3819:aload_2         
	// 2180 3820:sipush          157
	// 2181 3823:aload_0         
	// 2182 3824:getfield        #12  <Field azh a>
	// 2183 3827:getfield        #228 <Field int azh.X>
	// 2184 3830:bipush          8
	// 2185 3832:iushr           
	// 2186 3833:int2byte        
	// 2187 3834:bastore         
		abyte1[158] = (byte)(a.X >>> 16);
	// 2188 3835:aload_2         
	// 2189 3836:sipush          158
	// 2190 3839:aload_0         
	// 2191 3840:getfield        #12  <Field azh a>
	// 2192 3843:getfield        #228 <Field int azh.X>
	// 2193 3846:bipush          16
	// 2194 3848:iushr           
	// 2195 3849:int2byte        
	// 2196 3850:bastore         
		abyte1[159] = (byte)((a.X & 0xff000000) >>> 24);
	// 2197 3851:aload_2         
	// 2198 3852:sipush          159
	// 2199 3855:aload_0         
	// 2200 3856:getfield        #12  <Field azh a>
	// 2201 3859:getfield        #228 <Field int azh.X>
	// 2202 3862:ldc1            #126 <Int 0xff000000>
	// 2203 3864:iand            
	// 2204 3865:bipush          24
	// 2205 3867:iushr           
	// 2206 3868:int2byte        
	// 2207 3869:bastore         
		abyte1[160] = (byte)a.P;
	// 2208 3870:aload_2         
	// 2209 3871:sipush          160
	// 2210 3874:aload_0         
	// 2211 3875:getfield        #12  <Field azh a>
	// 2212 3878:getfield        #231 <Field int azh.P>
	// 2213 3881:int2byte        
	// 2214 3882:bastore         
		abyte1[161] = (byte)(a.P >>> 8);
	// 2215 3883:aload_2         
	// 2216 3884:sipush          161
	// 2217 3887:aload_0         
	// 2218 3888:getfield        #12  <Field azh a>
	// 2219 3891:getfield        #231 <Field int azh.P>
	// 2220 3894:bipush          8
	// 2221 3896:iushr           
	// 2222 3897:int2byte        
	// 2223 3898:bastore         
		abyte1[162] = (byte)(a.P >>> 16);
	// 2224 3899:aload_2         
	// 2225 3900:sipush          162
	// 2226 3903:aload_0         
	// 2227 3904:getfield        #12  <Field azh a>
	// 2228 3907:getfield        #231 <Field int azh.P>
	// 2229 3910:bipush          16
	// 2230 3912:iushr           
	// 2231 3913:int2byte        
	// 2232 3914:bastore         
		abyte1[163] = (byte)((a.P & 0xff000000) >>> 24);
	// 2233 3915:aload_2         
	// 2234 3916:sipush          163
	// 2235 3919:aload_0         
	// 2236 3920:getfield        #12  <Field azh a>
	// 2237 3923:getfield        #231 <Field int azh.P>
	// 2238 3926:ldc1            #126 <Int 0xff000000>
	// 2239 3928:iand            
	// 2240 3929:bipush          24
	// 2241 3931:iushr           
	// 2242 3932:int2byte        
	// 2243 3933:bastore         
		abyte1[164] = (byte)a.i;
	// 2244 3934:aload_2         
	// 2245 3935:sipush          164
	// 2246 3938:aload_0         
	// 2247 3939:getfield        #12  <Field azh a>
	// 2248 3942:getfield        #234 <Field int azh.i>
	// 2249 3945:int2byte        
	// 2250 3946:bastore         
		abyte1[165] = (byte)(a.i >>> 8);
	// 2251 3947:aload_2         
	// 2252 3948:sipush          165
	// 2253 3951:aload_0         
	// 2254 3952:getfield        #12  <Field azh a>
	// 2255 3955:getfield        #234 <Field int azh.i>
	// 2256 3958:bipush          8
	// 2257 3960:iushr           
	// 2258 3961:int2byte        
	// 2259 3962:bastore         
		abyte1[166] = (byte)(a.i >>> 16);
	// 2260 3963:aload_2         
	// 2261 3964:sipush          166
	// 2262 3967:aload_0         
	// 2263 3968:getfield        #12  <Field azh a>
	// 2264 3971:getfield        #234 <Field int azh.i>
	// 2265 3974:bipush          16
	// 2266 3976:iushr           
	// 2267 3977:int2byte        
	// 2268 3978:bastore         
		abyte1[167] = (byte)((a.i & 0xff000000) >>> 24);
	// 2269 3979:aload_2         
	// 2270 3980:sipush          167
	// 2271 3983:aload_0         
	// 2272 3984:getfield        #12  <Field azh a>
	// 2273 3987:getfield        #234 <Field int azh.i>
	// 2274 3990:ldc1            #126 <Int 0xff000000>
	// 2275 3992:iand            
	// 2276 3993:bipush          24
	// 2277 3995:iushr           
	// 2278 3996:int2byte        
	// 2279 3997:bastore         
		abyte1[168] = (byte)a.ae;
	// 2280 3998:aload_2         
	// 2281 3999:sipush          168
	// 2282 4002:aload_0         
	// 2283 4003:getfield        #12  <Field azh a>
	// 2284 4006:getfield        #237 <Field int azh.ae>
	// 2285 4009:int2byte        
	// 2286 4010:bastore         
		abyte1[169] = (byte)(a.ae >>> 8);
	// 2287 4011:aload_2         
	// 2288 4012:sipush          169
	// 2289 4015:aload_0         
	// 2290 4016:getfield        #12  <Field azh a>
	// 2291 4019:getfield        #237 <Field int azh.ae>
	// 2292 4022:bipush          8
	// 2293 4024:iushr           
	// 2294 4025:int2byte        
	// 2295 4026:bastore         
		abyte1[170] = (byte)(a.ae >>> 16);
	// 2296 4027:aload_2         
	// 2297 4028:sipush          170
	// 2298 4031:aload_0         
	// 2299 4032:getfield        #12  <Field azh a>
	// 2300 4035:getfield        #237 <Field int azh.ae>
	// 2301 4038:bipush          16
	// 2302 4040:iushr           
	// 2303 4041:int2byte        
	// 2304 4042:bastore         
		abyte1[171] = (byte)((a.ae & 0xff000000) >>> 24);
	// 2305 4043:aload_2         
	// 2306 4044:sipush          171
	// 2307 4047:aload_0         
	// 2308 4048:getfield        #12  <Field azh a>
	// 2309 4051:getfield        #237 <Field int azh.ae>
	// 2310 4054:ldc1            #126 <Int 0xff000000>
	// 2311 4056:iand            
	// 2312 4057:bipush          24
	// 2313 4059:iushr           
	// 2314 4060:int2byte        
	// 2315 4061:bastore         
		abyte1[172] = (byte)a.aa;
	// 2316 4062:aload_2         
	// 2317 4063:sipush          172
	// 2318 4066:aload_0         
	// 2319 4067:getfield        #12  <Field azh a>
	// 2320 4070:getfield        #240 <Field int azh.aa>
	// 2321 4073:int2byte        
	// 2322 4074:bastore         
		abyte1[173] = (byte)(a.aa >>> 8);
	// 2323 4075:aload_2         
	// 2324 4076:sipush          173
	// 2325 4079:aload_0         
	// 2326 4080:getfield        #12  <Field azh a>
	// 2327 4083:getfield        #240 <Field int azh.aa>
	// 2328 4086:bipush          8
	// 2329 4088:iushr           
	// 2330 4089:int2byte        
	// 2331 4090:bastore         
		abyte1[174] = (byte)(a.aa >>> 16);
	// 2332 4091:aload_2         
	// 2333 4092:sipush          174
	// 2334 4095:aload_0         
	// 2335 4096:getfield        #12  <Field azh a>
	// 2336 4099:getfield        #240 <Field int azh.aa>
	// 2337 4102:bipush          16
	// 2338 4104:iushr           
	// 2339 4105:int2byte        
	// 2340 4106:bastore         
		abyte1[175] = (byte)((a.aa & 0xff000000) >>> 24);
	// 2341 4107:aload_2         
	// 2342 4108:sipush          175
	// 2343 4111:aload_0         
	// 2344 4112:getfield        #12  <Field azh a>
	// 2345 4115:getfield        #240 <Field int azh.aa>
	// 2346 4118:ldc1            #126 <Int 0xff000000>
	// 2347 4120:iand            
	// 2348 4121:bipush          24
	// 2349 4123:iushr           
	// 2350 4124:int2byte        
	// 2351 4125:bastore         
		abyte1[176] = (byte)a.T;
	// 2352 4126:aload_2         
	// 2353 4127:sipush          176
	// 2354 4130:aload_0         
	// 2355 4131:getfield        #12  <Field azh a>
	// 2356 4134:getfield        #243 <Field int azh.T>
	// 2357 4137:int2byte        
	// 2358 4138:bastore         
		abyte1[177] = (byte)(a.T >>> 8);
	// 2359 4139:aload_2         
	// 2360 4140:sipush          177
	// 2361 4143:aload_0         
	// 2362 4144:getfield        #12  <Field azh a>
	// 2363 4147:getfield        #243 <Field int azh.T>
	// 2364 4150:bipush          8
	// 2365 4152:iushr           
	// 2366 4153:int2byte        
	// 2367 4154:bastore         
		abyte1[178] = (byte)(a.T >>> 16);
	// 2368 4155:aload_2         
	// 2369 4156:sipush          178
	// 2370 4159:aload_0         
	// 2371 4160:getfield        #12  <Field azh a>
	// 2372 4163:getfield        #243 <Field int azh.T>
	// 2373 4166:bipush          16
	// 2374 4168:iushr           
	// 2375 4169:int2byte        
	// 2376 4170:bastore         
		abyte1[179] = (byte)((a.T & 0xff000000) >>> 24);
	// 2377 4171:aload_2         
	// 2378 4172:sipush          179
	// 2379 4175:aload_0         
	// 2380 4176:getfield        #12  <Field azh a>
	// 2381 4179:getfield        #243 <Field int azh.T>
	// 2382 4182:ldc1            #126 <Int 0xff000000>
	// 2383 4184:iand            
	// 2384 4185:bipush          24
	// 2385 4187:iushr           
	// 2386 4188:int2byte        
	// 2387 4189:bastore         
		abyte1[180] = (byte)a.aP;
	// 2388 4190:aload_2         
	// 2389 4191:sipush          180
	// 2390 4194:aload_0         
	// 2391 4195:getfield        #12  <Field azh a>
	// 2392 4198:getfield        #29  <Field int azh.aP>
	// 2393 4201:int2byte        
	// 2394 4202:bastore         
		abyte1[181] = (byte)(a.aP >>> 8);
	// 2395 4203:aload_2         
	// 2396 4204:sipush          181
	// 2397 4207:aload_0         
	// 2398 4208:getfield        #12  <Field azh a>
	// 2399 4211:getfield        #29  <Field int azh.aP>
	// 2400 4214:bipush          8
	// 2401 4216:iushr           
	// 2402 4217:int2byte        
	// 2403 4218:bastore         
		abyte1[182] = (byte)(a.aP >>> 16);
	// 2404 4219:aload_2         
	// 2405 4220:sipush          182
	// 2406 4223:aload_0         
	// 2407 4224:getfield        #12  <Field azh a>
	// 2408 4227:getfield        #29  <Field int azh.aP>
	// 2409 4230:bipush          16
	// 2410 4232:iushr           
	// 2411 4233:int2byte        
	// 2412 4234:bastore         
		abyte1[183] = (byte)((a.aP & 0xff000000) >>> 24);
	// 2413 4235:aload_2         
	// 2414 4236:sipush          183
	// 2415 4239:aload_0         
	// 2416 4240:getfield        #12  <Field azh a>
	// 2417 4243:getfield        #29  <Field int azh.aP>
	// 2418 4246:ldc1            #126 <Int 0xff000000>
	// 2419 4248:iand            
	// 2420 4249:bipush          24
	// 2421 4251:iushr           
	// 2422 4252:int2byte        
	// 2423 4253:bastore         
		abyte1[184] = (byte)a.V;
	// 2424 4254:aload_2         
	// 2425 4255:sipush          184
	// 2426 4258:aload_0         
	// 2427 4259:getfield        #12  <Field azh a>
	// 2428 4262:getfield        #246 <Field int azh.V>
	// 2429 4265:int2byte        
	// 2430 4266:bastore         
		abyte1[185] = (byte)(a.V >>> 8);
	// 2431 4267:aload_2         
	// 2432 4268:sipush          185
	// 2433 4271:aload_0         
	// 2434 4272:getfield        #12  <Field azh a>
	// 2435 4275:getfield        #246 <Field int azh.V>
	// 2436 4278:bipush          8
	// 2437 4280:iushr           
	// 2438 4281:int2byte        
	// 2439 4282:bastore         
		abyte1[186] = (byte)(a.V >>> 16);
	// 2440 4283:aload_2         
	// 2441 4284:sipush          186
	// 2442 4287:aload_0         
	// 2443 4288:getfield        #12  <Field azh a>
	// 2444 4291:getfield        #246 <Field int azh.V>
	// 2445 4294:bipush          16
	// 2446 4296:iushr           
	// 2447 4297:int2byte        
	// 2448 4298:bastore         
		abyte1[187] = (byte)((a.V & 0xff000000) >>> 24);
	// 2449 4299:aload_2         
	// 2450 4300:sipush          187
	// 2451 4303:aload_0         
	// 2452 4304:getfield        #12  <Field azh a>
	// 2453 4307:getfield        #246 <Field int azh.V>
	// 2454 4310:ldc1            #126 <Int 0xff000000>
	// 2455 4312:iand            
	// 2456 4313:bipush          24
	// 2457 4315:iushr           
	// 2458 4316:int2byte        
	// 2459 4317:bastore         
		abyte1[188] = (byte)a.as;
	// 2460 4318:aload_2         
	// 2461 4319:sipush          188
	// 2462 4322:aload_0         
	// 2463 4323:getfield        #12  <Field azh a>
	// 2464 4326:getfield        #249 <Field int azh.as>
	// 2465 4329:int2byte        
	// 2466 4330:bastore         
		abyte1[189] = (byte)(a.as >>> 8);
	// 2467 4331:aload_2         
	// 2468 4332:sipush          189
	// 2469 4335:aload_0         
	// 2470 4336:getfield        #12  <Field azh a>
	// 2471 4339:getfield        #249 <Field int azh.as>
	// 2472 4342:bipush          8
	// 2473 4344:iushr           
	// 2474 4345:int2byte        
	// 2475 4346:bastore         
		abyte1[190] = (byte)(a.as >>> 16);
	// 2476 4347:aload_2         
	// 2477 4348:sipush          190
	// 2478 4351:aload_0         
	// 2479 4352:getfield        #12  <Field azh a>
	// 2480 4355:getfield        #249 <Field int azh.as>
	// 2481 4358:bipush          16
	// 2482 4360:iushr           
	// 2483 4361:int2byte        
	// 2484 4362:bastore         
		abyte1[191] = (byte)((a.as & 0xff000000) >>> 24);
	// 2485 4363:aload_2         
	// 2486 4364:sipush          191
	// 2487 4367:aload_0         
	// 2488 4368:getfield        #12  <Field azh a>
	// 2489 4371:getfield        #249 <Field int azh.as>
	// 2490 4374:ldc1            #126 <Int 0xff000000>
	// 2491 4376:iand            
	// 2492 4377:bipush          24
	// 2493 4379:iushr           
	// 2494 4380:int2byte        
	// 2495 4381:bastore         
		abyte1[192] = (byte)a.l;
	// 2496 4382:aload_2         
	// 2497 4383:sipush          192
	// 2498 4386:aload_0         
	// 2499 4387:getfield        #12  <Field azh a>
	// 2500 4390:getfield        #252 <Field int azh.l>
	// 2501 4393:int2byte        
	// 2502 4394:bastore         
		abyte1[193] = (byte)(a.l >>> 8);
	// 2503 4395:aload_2         
	// 2504 4396:sipush          193
	// 2505 4399:aload_0         
	// 2506 4400:getfield        #12  <Field azh a>
	// 2507 4403:getfield        #252 <Field int azh.l>
	// 2508 4406:bipush          8
	// 2509 4408:iushr           
	// 2510 4409:int2byte        
	// 2511 4410:bastore         
		abyte1[194] = (byte)(a.l >>> 16);
	// 2512 4411:aload_2         
	// 2513 4412:sipush          194
	// 2514 4415:aload_0         
	// 2515 4416:getfield        #12  <Field azh a>
	// 2516 4419:getfield        #252 <Field int azh.l>
	// 2517 4422:bipush          16
	// 2518 4424:iushr           
	// 2519 4425:int2byte        
	// 2520 4426:bastore         
		abyte1[195] = (byte)((a.l & 0xff000000) >>> 24);
	// 2521 4427:aload_2         
	// 2522 4428:sipush          195
	// 2523 4431:aload_0         
	// 2524 4432:getfield        #12  <Field azh a>
	// 2525 4435:getfield        #252 <Field int azh.l>
	// 2526 4438:ldc1            #126 <Int 0xff000000>
	// 2527 4440:iand            
	// 2528 4441:bipush          24
	// 2529 4443:iushr           
	// 2530 4444:int2byte        
	// 2531 4445:bastore         
		abyte1[196] = (byte)a.aJ;
	// 2532 4446:aload_2         
	// 2533 4447:sipush          196
	// 2534 4450:aload_0         
	// 2535 4451:getfield        #12  <Field azh a>
	// 2536 4454:getfield        #255 <Field int azh.aJ>
	// 2537 4457:int2byte        
	// 2538 4458:bastore         
		abyte1[197] = (byte)(a.aJ >>> 8);
	// 2539 4459:aload_2         
	// 2540 4460:sipush          197
	// 2541 4463:aload_0         
	// 2542 4464:getfield        #12  <Field azh a>
	// 2543 4467:getfield        #255 <Field int azh.aJ>
	// 2544 4470:bipush          8
	// 2545 4472:iushr           
	// 2546 4473:int2byte        
	// 2547 4474:bastore         
		abyte1[198] = (byte)(a.aJ >>> 16);
	// 2548 4475:aload_2         
	// 2549 4476:sipush          198
	// 2550 4479:aload_0         
	// 2551 4480:getfield        #12  <Field azh a>
	// 2552 4483:getfield        #255 <Field int azh.aJ>
	// 2553 4486:bipush          16
	// 2554 4488:iushr           
	// 2555 4489:int2byte        
	// 2556 4490:bastore         
		abyte1[199] = (byte)((a.aJ & 0xff000000) >>> 24);
	// 2557 4491:aload_2         
	// 2558 4492:sipush          199
	// 2559 4495:aload_0         
	// 2560 4496:getfield        #12  <Field azh a>
	// 2561 4499:getfield        #255 <Field int azh.aJ>
	// 2562 4502:ldc1            #126 <Int 0xff000000>
	// 2563 4504:iand            
	// 2564 4505:bipush          24
	// 2565 4507:iushr           
	// 2566 4508:int2byte        
	// 2567 4509:bastore         
		abyte1[200] = (byte)a.Z;
	// 2568 4510:aload_2         
	// 2569 4511:sipush          200
	// 2570 4514:aload_0         
	// 2571 4515:getfield        #12  <Field azh a>
	// 2572 4518:getfield        #258 <Field int azh.Z>
	// 2573 4521:int2byte        
	// 2574 4522:bastore         
		abyte1[201] = (byte)(a.Z >>> 8);
	// 2575 4523:aload_2         
	// 2576 4524:sipush          201
	// 2577 4527:aload_0         
	// 2578 4528:getfield        #12  <Field azh a>
	// 2579 4531:getfield        #258 <Field int azh.Z>
	// 2580 4534:bipush          8
	// 2581 4536:iushr           
	// 2582 4537:int2byte        
	// 2583 4538:bastore         
		abyte1[202] = (byte)(a.Z >>> 16);
	// 2584 4539:aload_2         
	// 2585 4540:sipush          202
	// 2586 4543:aload_0         
	// 2587 4544:getfield        #12  <Field azh a>
	// 2588 4547:getfield        #258 <Field int azh.Z>
	// 2589 4550:bipush          16
	// 2590 4552:iushr           
	// 2591 4553:int2byte        
	// 2592 4554:bastore         
		abyte1[203] = (byte)((a.Z & 0xff000000) >>> 24);
	// 2593 4555:aload_2         
	// 2594 4556:sipush          203
	// 2595 4559:aload_0         
	// 2596 4560:getfield        #12  <Field azh a>
	// 2597 4563:getfield        #258 <Field int azh.Z>
	// 2598 4566:ldc1            #126 <Int 0xff000000>
	// 2599 4568:iand            
	// 2600 4569:bipush          24
	// 2601 4571:iushr           
	// 2602 4572:int2byte        
	// 2603 4573:bastore         
		abyte1[204] = (byte)a.aD;
	// 2604 4574:aload_2         
	// 2605 4575:sipush          204
	// 2606 4578:aload_0         
	// 2607 4579:getfield        #12  <Field azh a>
	// 2608 4582:getfield        #261 <Field int azh.aD>
	// 2609 4585:int2byte        
	// 2610 4586:bastore         
		abyte1[205] = (byte)(a.aD >>> 8);
	// 2611 4587:aload_2         
	// 2612 4588:sipush          205
	// 2613 4591:aload_0         
	// 2614 4592:getfield        #12  <Field azh a>
	// 2615 4595:getfield        #261 <Field int azh.aD>
	// 2616 4598:bipush          8
	// 2617 4600:iushr           
	// 2618 4601:int2byte        
	// 2619 4602:bastore         
		abyte1[206] = (byte)(a.aD >>> 16);
	// 2620 4603:aload_2         
	// 2621 4604:sipush          206
	// 2622 4607:aload_0         
	// 2623 4608:getfield        #12  <Field azh a>
	// 2624 4611:getfield        #261 <Field int azh.aD>
	// 2625 4614:bipush          16
	// 2626 4616:iushr           
	// 2627 4617:int2byte        
	// 2628 4618:bastore         
		abyte1[207] = (byte)((a.aD & 0xff000000) >>> 24);
	// 2629 4619:aload_2         
	// 2630 4620:sipush          207
	// 2631 4623:aload_0         
	// 2632 4624:getfield        #12  <Field azh a>
	// 2633 4627:getfield        #261 <Field int azh.aD>
	// 2634 4630:ldc1            #126 <Int 0xff000000>
	// 2635 4632:iand            
	// 2636 4633:bipush          24
	// 2637 4635:iushr           
	// 2638 4636:int2byte        
	// 2639 4637:bastore         
		abyte1[208] = (byte)a.ab;
	// 2640 4638:aload_2         
	// 2641 4639:sipush          208
	// 2642 4642:aload_0         
	// 2643 4643:getfield        #12  <Field azh a>
	// 2644 4646:getfield        #101 <Field int azh.ab>
	// 2645 4649:int2byte        
	// 2646 4650:bastore         
		abyte1[209] = (byte)(a.ab >>> 8);
	// 2647 4651:aload_2         
	// 2648 4652:sipush          209
	// 2649 4655:aload_0         
	// 2650 4656:getfield        #12  <Field azh a>
	// 2651 4659:getfield        #101 <Field int azh.ab>
	// 2652 4662:bipush          8
	// 2653 4664:iushr           
	// 2654 4665:int2byte        
	// 2655 4666:bastore         
		abyte1[210] = (byte)(a.ab >>> 16);
	// 2656 4667:aload_2         
	// 2657 4668:sipush          210
	// 2658 4671:aload_0         
	// 2659 4672:getfield        #12  <Field azh a>
	// 2660 4675:getfield        #101 <Field int azh.ab>
	// 2661 4678:bipush          16
	// 2662 4680:iushr           
	// 2663 4681:int2byte        
	// 2664 4682:bastore         
		abyte1[211] = (byte)((a.ab & 0xff000000) >>> 24);
	// 2665 4683:aload_2         
	// 2666 4684:sipush          211
	// 2667 4687:aload_0         
	// 2668 4688:getfield        #12  <Field azh a>
	// 2669 4691:getfield        #101 <Field int azh.ab>
	// 2670 4694:ldc1            #126 <Int 0xff000000>
	// 2671 4696:iand            
	// 2672 4697:bipush          24
	// 2673 4699:iushr           
	// 2674 4700:int2byte        
	// 2675 4701:bastore         
		abyte1[212] = (byte)a.be;
	// 2676 4702:aload_2         
	// 2677 4703:sipush          212
	// 2678 4706:aload_0         
	// 2679 4707:getfield        #12  <Field azh a>
	// 2680 4710:getfield        #44  <Field int azh.be>
	// 2681 4713:int2byte        
	// 2682 4714:bastore         
		abyte1[213] = (byte)(a.be >>> 8);
	// 2683 4715:aload_2         
	// 2684 4716:sipush          213
	// 2685 4719:aload_0         
	// 2686 4720:getfield        #12  <Field azh a>
	// 2687 4723:getfield        #44  <Field int azh.be>
	// 2688 4726:bipush          8
	// 2689 4728:iushr           
	// 2690 4729:int2byte        
	// 2691 4730:bastore         
		abyte1[214] = (byte)(a.be >>> 16);
	// 2692 4731:aload_2         
	// 2693 4732:sipush          214
	// 2694 4735:aload_0         
	// 2695 4736:getfield        #12  <Field azh a>
	// 2696 4739:getfield        #44  <Field int azh.be>
	// 2697 4742:bipush          16
	// 2698 4744:iushr           
	// 2699 4745:int2byte        
	// 2700 4746:bastore         
		abyte1[215] = (byte)((a.be & 0xff000000) >>> 24);
	// 2701 4747:aload_2         
	// 2702 4748:sipush          215
	// 2703 4751:aload_0         
	// 2704 4752:getfield        #12  <Field azh a>
	// 2705 4755:getfield        #44  <Field int azh.be>
	// 2706 4758:ldc1            #126 <Int 0xff000000>
	// 2707 4760:iand            
	// 2708 4761:bipush          24
	// 2709 4763:iushr           
	// 2710 4764:int2byte        
	// 2711 4765:bastore         
		abyte1[216] = (byte)a.ad;
	// 2712 4766:aload_2         
	// 2713 4767:sipush          216
	// 2714 4770:aload_0         
	// 2715 4771:getfield        #12  <Field azh a>
	// 2716 4774:getfield        #264 <Field int azh.ad>
	// 2717 4777:int2byte        
	// 2718 4778:bastore         
		abyte1[217] = (byte)(a.ad >>> 8);
	// 2719 4779:aload_2         
	// 2720 4780:sipush          217
	// 2721 4783:aload_0         
	// 2722 4784:getfield        #12  <Field azh a>
	// 2723 4787:getfield        #264 <Field int azh.ad>
	// 2724 4790:bipush          8
	// 2725 4792:iushr           
	// 2726 4793:int2byte        
	// 2727 4794:bastore         
		abyte1[218] = (byte)(a.ad >>> 16);
	// 2728 4795:aload_2         
	// 2729 4796:sipush          218
	// 2730 4799:aload_0         
	// 2731 4800:getfield        #12  <Field azh a>
	// 2732 4803:getfield        #264 <Field int azh.ad>
	// 2733 4806:bipush          16
	// 2734 4808:iushr           
	// 2735 4809:int2byte        
	// 2736 4810:bastore         
		abyte1[219] = (byte)((a.ad & 0xff000000) >>> 24);
	// 2737 4811:aload_2         
	// 2738 4812:sipush          219
	// 2739 4815:aload_0         
	// 2740 4816:getfield        #12  <Field azh a>
	// 2741 4819:getfield        #264 <Field int azh.ad>
	// 2742 4822:ldc1            #126 <Int 0xff000000>
	// 2743 4824:iand            
	// 2744 4825:bipush          24
	// 2745 4827:iushr           
	// 2746 4828:int2byte        
	// 2747 4829:bastore         
		abyte1[220] = (byte)a.S;
	// 2748 4830:aload_2         
	// 2749 4831:sipush          220
	// 2750 4834:aload_0         
	// 2751 4835:getfield        #12  <Field azh a>
	// 2752 4838:getfield        #267 <Field int azh.S>
	// 2753 4841:int2byte        
	// 2754 4842:bastore         
		abyte1[221] = (byte)(a.S >>> 8);
	// 2755 4843:aload_2         
	// 2756 4844:sipush          221
	// 2757 4847:aload_0         
	// 2758 4848:getfield        #12  <Field azh a>
	// 2759 4851:getfield        #267 <Field int azh.S>
	// 2760 4854:bipush          8
	// 2761 4856:iushr           
	// 2762 4857:int2byte        
	// 2763 4858:bastore         
		abyte1[222] = (byte)(a.S >>> 16);
	// 2764 4859:aload_2         
	// 2765 4860:sipush          222
	// 2766 4863:aload_0         
	// 2767 4864:getfield        #12  <Field azh a>
	// 2768 4867:getfield        #267 <Field int azh.S>
	// 2769 4870:bipush          16
	// 2770 4872:iushr           
	// 2771 4873:int2byte        
	// 2772 4874:bastore         
		abyte1[223] = (byte)((a.S & 0xff000000) >>> 24);
	// 2773 4875:aload_2         
	// 2774 4876:sipush          223
	// 2775 4879:aload_0         
	// 2776 4880:getfield        #12  <Field azh a>
	// 2777 4883:getfield        #267 <Field int azh.S>
	// 2778 4886:ldc1            #126 <Int 0xff000000>
	// 2779 4888:iand            
	// 2780 4889:bipush          24
	// 2781 4891:iushr           
	// 2782 4892:int2byte        
	// 2783 4893:bastore         
		abyte1[224] = (byte)a.cf;
	// 2784 4894:aload_2         
	// 2785 4895:sipush          224
	// 2786 4898:aload_0         
	// 2787 4899:getfield        #12  <Field azh a>
	// 2788 4902:getfield        #270 <Field int azh.cf>
	// 2789 4905:int2byte        
	// 2790 4906:bastore         
		abyte1[225] = (byte)(a.cf >>> 8);
	// 2791 4907:aload_2         
	// 2792 4908:sipush          225
	// 2793 4911:aload_0         
	// 2794 4912:getfield        #12  <Field azh a>
	// 2795 4915:getfield        #270 <Field int azh.cf>
	// 2796 4918:bipush          8
	// 2797 4920:iushr           
	// 2798 4921:int2byte        
	// 2799 4922:bastore         
		abyte1[226] = (byte)(a.cf >>> 16);
	// 2800 4923:aload_2         
	// 2801 4924:sipush          226
	// 2802 4927:aload_0         
	// 2803 4928:getfield        #12  <Field azh a>
	// 2804 4931:getfield        #270 <Field int azh.cf>
	// 2805 4934:bipush          16
	// 2806 4936:iushr           
	// 2807 4937:int2byte        
	// 2808 4938:bastore         
		abyte1[227] = (byte)((a.cf & 0xff000000) >>> 24);
	// 2809 4939:aload_2         
	// 2810 4940:sipush          227
	// 2811 4943:aload_0         
	// 2812 4944:getfield        #12  <Field azh a>
	// 2813 4947:getfield        #270 <Field int azh.cf>
	// 2814 4950:ldc1            #126 <Int 0xff000000>
	// 2815 4952:iand            
	// 2816 4953:bipush          24
	// 2817 4955:iushr           
	// 2818 4956:int2byte        
	// 2819 4957:bastore         
		abyte1[228] = (byte)a.bF;
	// 2820 4958:aload_2         
	// 2821 4959:sipush          228
	// 2822 4962:aload_0         
	// 2823 4963:getfield        #12  <Field azh a>
	// 2824 4966:getfield        #273 <Field int azh.bF>
	// 2825 4969:int2byte        
	// 2826 4970:bastore         
		abyte1[229] = (byte)(a.bF >>> 8);
	// 2827 4971:aload_2         
	// 2828 4972:sipush          229
	// 2829 4975:aload_0         
	// 2830 4976:getfield        #12  <Field azh a>
	// 2831 4979:getfield        #273 <Field int azh.bF>
	// 2832 4982:bipush          8
	// 2833 4984:iushr           
	// 2834 4985:int2byte        
	// 2835 4986:bastore         
		abyte1[230] = (byte)(a.bF >>> 16);
	// 2836 4987:aload_2         
	// 2837 4988:sipush          230
	// 2838 4991:aload_0         
	// 2839 4992:getfield        #12  <Field azh a>
	// 2840 4995:getfield        #273 <Field int azh.bF>
	// 2841 4998:bipush          16
	// 2842 5000:iushr           
	// 2843 5001:int2byte        
	// 2844 5002:bastore         
		abyte1[231] = (byte)((a.bF & 0xff000000) >>> 24);
	// 2845 5003:aload_2         
	// 2846 5004:sipush          231
	// 2847 5007:aload_0         
	// 2848 5008:getfield        #12  <Field azh a>
	// 2849 5011:getfield        #273 <Field int azh.bF>
	// 2850 5014:ldc1            #126 <Int 0xff000000>
	// 2851 5016:iand            
	// 2852 5017:bipush          24
	// 2853 5019:iushr           
	// 2854 5020:int2byte        
	// 2855 5021:bastore         
		abyte1[232] = (byte)a.br;
	// 2856 5022:aload_2         
	// 2857 5023:sipush          232
	// 2858 5026:aload_0         
	// 2859 5027:getfield        #12  <Field azh a>
	// 2860 5030:getfield        #276 <Field int azh.br>
	// 2861 5033:int2byte        
	// 2862 5034:bastore         
		abyte1[233] = (byte)(a.br >>> 8);
	// 2863 5035:aload_2         
	// 2864 5036:sipush          233
	// 2865 5039:aload_0         
	// 2866 5040:getfield        #12  <Field azh a>
	// 2867 5043:getfield        #276 <Field int azh.br>
	// 2868 5046:bipush          8
	// 2869 5048:iushr           
	// 2870 5049:int2byte        
	// 2871 5050:bastore         
		abyte1[234] = (byte)(a.br >>> 16);
	// 2872 5051:aload_2         
	// 2873 5052:sipush          234
	// 2874 5055:aload_0         
	// 2875 5056:getfield        #12  <Field azh a>
	// 2876 5059:getfield        #276 <Field int azh.br>
	// 2877 5062:bipush          16
	// 2878 5064:iushr           
	// 2879 5065:int2byte        
	// 2880 5066:bastore         
		abyte1[235] = (byte)((a.br & 0xff000000) >>> 24);
	// 2881 5067:aload_2         
	// 2882 5068:sipush          235
	// 2883 5071:aload_0         
	// 2884 5072:getfield        #12  <Field azh a>
	// 2885 5075:getfield        #276 <Field int azh.br>
	// 2886 5078:ldc1            #126 <Int 0xff000000>
	// 2887 5080:iand            
	// 2888 5081:bipush          24
	// 2889 5083:iushr           
	// 2890 5084:int2byte        
	// 2891 5085:bastore         
		abyte1[236] = (byte)a.cs;
	// 2892 5086:aload_2         
	// 2893 5087:sipush          236
	// 2894 5090:aload_0         
	// 2895 5091:getfield        #12  <Field azh a>
	// 2896 5094:getfield        #279 <Field int azh.cs>
	// 2897 5097:int2byte        
	// 2898 5098:bastore         
		abyte1[237] = (byte)(a.cs >>> 8);
	// 2899 5099:aload_2         
	// 2900 5100:sipush          237
	// 2901 5103:aload_0         
	// 2902 5104:getfield        #12  <Field azh a>
	// 2903 5107:getfield        #279 <Field int azh.cs>
	// 2904 5110:bipush          8
	// 2905 5112:iushr           
	// 2906 5113:int2byte        
	// 2907 5114:bastore         
		abyte1[238] = (byte)(a.cs >>> 16);
	// 2908 5115:aload_2         
	// 2909 5116:sipush          238
	// 2910 5119:aload_0         
	// 2911 5120:getfield        #12  <Field azh a>
	// 2912 5123:getfield        #279 <Field int azh.cs>
	// 2913 5126:bipush          16
	// 2914 5128:iushr           
	// 2915 5129:int2byte        
	// 2916 5130:bastore         
		abyte1[239] = (byte)((a.cs & 0xff000000) >>> 24);
	// 2917 5131:aload_2         
	// 2918 5132:sipush          239
	// 2919 5135:aload_0         
	// 2920 5136:getfield        #12  <Field azh a>
	// 2921 5139:getfield        #279 <Field int azh.cs>
	// 2922 5142:ldc1            #126 <Int 0xff000000>
	// 2923 5144:iand            
	// 2924 5145:bipush          24
	// 2925 5147:iushr           
	// 2926 5148:int2byte        
	// 2927 5149:bastore         
		abyte1[240] = (byte)a.cb;
	// 2928 5150:aload_2         
	// 2929 5151:sipush          240
	// 2930 5154:aload_0         
	// 2931 5155:getfield        #12  <Field azh a>
	// 2932 5158:getfield        #282 <Field int azh.cb>
	// 2933 5161:int2byte        
	// 2934 5162:bastore         
		abyte1[241] = (byte)(a.cb >>> 8);
	// 2935 5163:aload_2         
	// 2936 5164:sipush          241
	// 2937 5167:aload_0         
	// 2938 5168:getfield        #12  <Field azh a>
	// 2939 5171:getfield        #282 <Field int azh.cb>
	// 2940 5174:bipush          8
	// 2941 5176:iushr           
	// 2942 5177:int2byte        
	// 2943 5178:bastore         
		abyte1[242] = (byte)(a.cb >>> 16);
	// 2944 5179:aload_2         
	// 2945 5180:sipush          242
	// 2946 5183:aload_0         
	// 2947 5184:getfield        #12  <Field azh a>
	// 2948 5187:getfield        #282 <Field int azh.cb>
	// 2949 5190:bipush          16
	// 2950 5192:iushr           
	// 2951 5193:int2byte        
	// 2952 5194:bastore         
		abyte1[243] = (byte)((a.cb & 0xff000000) >>> 24);
	// 2953 5195:aload_2         
	// 2954 5196:sipush          243
	// 2955 5199:aload_0         
	// 2956 5200:getfield        #12  <Field azh a>
	// 2957 5203:getfield        #282 <Field int azh.cb>
	// 2958 5206:ldc1            #126 <Int 0xff000000>
	// 2959 5208:iand            
	// 2960 5209:bipush          24
	// 2961 5211:iushr           
	// 2962 5212:int2byte        
	// 2963 5213:bastore         
		abyte1[244] = (byte)a.aE;
	// 2964 5214:aload_2         
	// 2965 5215:sipush          244
	// 2966 5218:aload_0         
	// 2967 5219:getfield        #12  <Field azh a>
	// 2968 5222:getfield        #285 <Field int azh.aE>
	// 2969 5225:int2byte        
	// 2970 5226:bastore         
		abyte1[245] = (byte)(a.aE >>> 8);
	// 2971 5227:aload_2         
	// 2972 5228:sipush          245
	// 2973 5231:aload_0         
	// 2974 5232:getfield        #12  <Field azh a>
	// 2975 5235:getfield        #285 <Field int azh.aE>
	// 2976 5238:bipush          8
	// 2977 5240:iushr           
	// 2978 5241:int2byte        
	// 2979 5242:bastore         
		abyte1[246] = (byte)(a.aE >>> 16);
	// 2980 5243:aload_2         
	// 2981 5244:sipush          246
	// 2982 5247:aload_0         
	// 2983 5248:getfield        #12  <Field azh a>
	// 2984 5251:getfield        #285 <Field int azh.aE>
	// 2985 5254:bipush          16
	// 2986 5256:iushr           
	// 2987 5257:int2byte        
	// 2988 5258:bastore         
		abyte1[247] = (byte)((a.aE & 0xff000000) >>> 24);
	// 2989 5259:aload_2         
	// 2990 5260:sipush          247
	// 2991 5263:aload_0         
	// 2992 5264:getfield        #12  <Field azh a>
	// 2993 5267:getfield        #285 <Field int azh.aE>
	// 2994 5270:ldc1            #126 <Int 0xff000000>
	// 2995 5272:iand            
	// 2996 5273:bipush          24
	// 2997 5275:iushr           
	// 2998 5276:int2byte        
	// 2999 5277:bastore         
		abyte1[248] = (byte)a.al;
	// 3000 5278:aload_2         
	// 3001 5279:sipush          248
	// 3002 5282:aload_0         
	// 3003 5283:getfield        #12  <Field azh a>
	// 3004 5286:getfield        #98  <Field int azh.al>
	// 3005 5289:int2byte        
	// 3006 5290:bastore         
		abyte1[249] = (byte)(a.al >>> 8);
	// 3007 5291:aload_2         
	// 3008 5292:sipush          249
	// 3009 5295:aload_0         
	// 3010 5296:getfield        #12  <Field azh a>
	// 3011 5299:getfield        #98  <Field int azh.al>
	// 3012 5302:bipush          8
	// 3013 5304:iushr           
	// 3014 5305:int2byte        
	// 3015 5306:bastore         
		abyte1[250] = (byte)(a.al >>> 16);
	// 3016 5307:aload_2         
	// 3017 5308:sipush          250
	// 3018 5311:aload_0         
	// 3019 5312:getfield        #12  <Field azh a>
	// 3020 5315:getfield        #98  <Field int azh.al>
	// 3021 5318:bipush          16
	// 3022 5320:iushr           
	// 3023 5321:int2byte        
	// 3024 5322:bastore         
		abyte1[251] = (byte)((a.al & 0xff000000) >>> 24);
	// 3025 5323:aload_2         
	// 3026 5324:sipush          251
	// 3027 5327:aload_0         
	// 3028 5328:getfield        #12  <Field azh a>
	// 3029 5331:getfield        #98  <Field int azh.al>
	// 3030 5334:ldc1            #126 <Int 0xff000000>
	// 3031 5336:iand            
	// 3032 5337:bipush          24
	// 3033 5339:iushr           
	// 3034 5340:int2byte        
	// 3035 5341:bastore         
		abyte1[252] = (byte)a.aK;
	// 3036 5342:aload_2         
	// 3037 5343:sipush          252
	// 3038 5346:aload_0         
	// 3039 5347:getfield        #12  <Field azh a>
	// 3040 5350:getfield        #288 <Field int azh.aK>
	// 3041 5353:int2byte        
	// 3042 5354:bastore         
		abyte1[253] = (byte)(a.aK >>> 8);
	// 3043 5355:aload_2         
	// 3044 5356:sipush          253
	// 3045 5359:aload_0         
	// 3046 5360:getfield        #12  <Field azh a>
	// 3047 5363:getfield        #288 <Field int azh.aK>
	// 3048 5366:bipush          8
	// 3049 5368:iushr           
	// 3050 5369:int2byte        
	// 3051 5370:bastore         
		abyte1[254] = (byte)(a.aK >>> 16);
	// 3052 5371:aload_2         
	// 3053 5372:sipush          254
	// 3054 5375:aload_0         
	// 3055 5376:getfield        #12  <Field azh a>
	// 3056 5379:getfield        #288 <Field int azh.aK>
	// 3057 5382:bipush          16
	// 3058 5384:iushr           
	// 3059 5385:int2byte        
	// 3060 5386:bastore         
		abyte1[255] = (byte)((a.aK & 0xff000000) >>> 24);
	// 3061 5387:aload_2         
	// 3062 5388:sipush          255
	// 3063 5391:aload_0         
	// 3064 5392:getfield        #12  <Field azh a>
	// 3065 5395:getfield        #288 <Field int azh.aK>
	// 3066 5398:ldc1            #126 <Int 0xff000000>
	// 3067 5400:iand            
	// 3068 5401:bipush          24
	// 3069 5403:iushr           
	// 3070 5404:int2byte        
	// 3071 5405:bastore         
	// 3072 5406:return          
	}

	private final azh a;
}
