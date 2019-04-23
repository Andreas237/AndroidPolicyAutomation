// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azn
	implements azk
{

	private azn(azh azh1)
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

	azn(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azn(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.aN = ((azh) (abyte0)).aR ^ a.aN;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.aR>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.aN>
	//    9   17:ixor            
	//   10   18:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field azh a>
	//   13   25:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & ~a.br;
	//   14   26:aload_1         
	//   15   27:aload_1         
	//   16   28:getfield        #29  <Field int azh.aN>
	//   17   31:aload_0         
	//   18   32:getfield        #12  <Field azh a>
	//   19   35:getfield        #32  <Field int azh.br>
	//   20   38:iconst_m1       
	//   21   39:ixor            
	//   22   40:iand            
	//   23   41:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//   24   44:aload_0         
	//   25   45:getfield        #12  <Field azh a>
	//   26   48:astore_1        
		abyte0.aN = ((azh) (abyte0)).C ^ a.aN;
	//   27   49:aload_1         
	//   28   50:aload_1         
	//   29   51:getfield        #35  <Field int azh.C>
	//   30   54:aload_0         
	//   31   55:getfield        #12  <Field azh a>
	//   32   58:getfield        #29  <Field int azh.aN>
	//   33   61:ixor            
	//   34   62:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//   35   65:aload_0         
	//   36   66:getfield        #12  <Field azh a>
	//   37   69:astore_1        
		abyte0.ao = ((azh) (abyte0)).aN ^ a.ao;
	//   38   70:aload_1         
	//   39   71:aload_1         
	//   40   72:getfield        #29  <Field int azh.aN>
	//   41   75:aload_0         
	//   42   76:getfield        #12  <Field azh a>
	//   43   79:getfield        #38  <Field int azh.ao>
	//   44   82:ixor            
	//   45   83:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//   46   86:aload_0         
	//   47   87:getfield        #12  <Field azh a>
	//   48   90:astore_1        
		abyte0.ao = ((azh) (abyte0)).bt & ~a.ao;
	//   49   91:aload_1         
	//   50   92:aload_1         
	//   51   93:getfield        #41  <Field int azh.bt>
	//   52   96:aload_0         
	//   53   97:getfield        #12  <Field azh a>
	//   54  100:getfield        #38  <Field int azh.ao>
	//   55  103:iconst_m1       
	//   56  104:ixor            
	//   57  105:iand            
	//   58  106:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//   59  109:aload_0         
	//   60  110:getfield        #12  <Field azh a>
	//   61  113:astore_1        
		abyte0.ao = ((azh) (abyte0)).cv ^ a.ao;
	//   62  114:aload_1         
	//   63  115:aload_1         
	//   64  116:getfield        #44  <Field int azh.cv>
	//   65  119:aload_0         
	//   66  120:getfield        #12  <Field azh a>
	//   67  123:getfield        #38  <Field int azh.ao>
	//   68  126:ixor            
	//   69  127:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//   70  130:aload_0         
	//   71  131:getfield        #12  <Field azh a>
	//   72  134:astore_1        
		abyte0.U = ((azh) (abyte0)).ao ^ a.U;
	//   73  135:aload_1         
	//   74  136:aload_1         
	//   75  137:getfield        #38  <Field int azh.ao>
	//   76  140:aload_0         
	//   77  141:getfield        #12  <Field azh a>
	//   78  144:getfield        #47  <Field int azh.U>
	//   79  147:ixor            
	//   80  148:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	//   81  151:aload_0         
	//   82  152:getfield        #12  <Field azh a>
	//   83  155:astore_1        
		abyte0.ao = ((azh) (abyte0)).U & ~a.ci;
	//   84  156:aload_1         
	//   85  157:aload_1         
	//   86  158:getfield        #47  <Field int azh.U>
	//   87  161:aload_0         
	//   88  162:getfield        #12  <Field azh a>
	//   89  165:getfield        #50  <Field int azh.ci>
	//   90  168:iconst_m1       
	//   91  169:ixor            
	//   92  170:iand            
	//   93  171:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//   94  174:aload_0         
	//   95  175:getfield        #12  <Field azh a>
	//   96  178:astore_1        
		abyte0.cv = ((azh) (abyte0)).M & a.ao;
	//   97  179:aload_1         
	//   98  180:aload_1         
	//   99  181:getfield        #53  <Field int azh.M>
	//  100  184:aload_0         
	//  101  185:getfield        #12  <Field azh a>
	//  102  188:getfield        #38  <Field int azh.ao>
	//  103  191:iand            
	//  104  192:putfield        #44  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	//  105  195:aload_0         
	//  106  196:getfield        #12  <Field azh a>
	//  107  199:astore_1        
		abyte0.bt = ((azh) (abyte0)).M & ~a.U;
	//  108  200:aload_1         
	//  109  201:aload_1         
	//  110  202:getfield        #53  <Field int azh.M>
	//  111  205:aload_0         
	//  112  206:getfield        #12  <Field azh a>
	//  113  209:getfield        #47  <Field int azh.U>
	//  114  212:iconst_m1       
	//  115  213:ixor            
	//  116  214:iand            
	//  117  215:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	//  118  218:aload_0         
	//  119  219:getfield        #12  <Field azh a>
	//  120  222:astore_1        
		abyte0.aN = ((azh) (abyte0)).M & a.U;
	//  121  223:aload_1         
	//  122  224:aload_1         
	//  123  225:getfield        #53  <Field int azh.M>
	//  124  228:aload_0         
	//  125  229:getfield        #12  <Field azh a>
	//  126  232:getfield        #47  <Field int azh.U>
	//  127  235:iand            
	//  128  236:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  129  239:aload_0         
	//  130  240:getfield        #12  <Field azh a>
	//  131  243:astore_1        
		abyte0.C = ((azh) (abyte0)).U & a.ci;
	//  132  244:aload_1         
	//  133  245:aload_1         
	//  134  246:getfield        #47  <Field int azh.U>
	//  135  249:aload_0         
	//  136  250:getfield        #12  <Field azh a>
	//  137  253:getfield        #50  <Field int azh.ci>
	//  138  256:iand            
	//  139  257:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	//  140  260:aload_0         
	//  141  261:getfield        #12  <Field azh a>
	//  142  264:astore_1        
		abyte0.aR = ((azh) (abyte0)).ci & ~a.C;
	//  143  265:aload_1         
	//  144  266:aload_1         
	//  145  267:getfield        #50  <Field int azh.ci>
	//  146  270:aload_0         
	//  147  271:getfield        #12  <Field azh a>
	//  148  274:getfield        #35  <Field int azh.C>
	//  149  277:iconst_m1       
	//  150  278:ixor            
	//  151  279:iand            
	//  152  280:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	//  153  283:aload_0         
	//  154  284:getfield        #12  <Field azh a>
	//  155  287:astore_1        
		abyte0.bB = ((azh) (abyte0)).C ^ a.bB;
	//  156  288:aload_1         
	//  157  289:aload_1         
	//  158  290:getfield        #35  <Field int azh.C>
	//  159  293:aload_0         
	//  160  294:getfield        #12  <Field azh a>
	//  161  297:getfield        #56  <Field int azh.bB>
	//  162  300:ixor            
	//  163  301:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	//  164  304:aload_0         
	//  165  305:getfield        #12  <Field azh a>
	//  166  308:astore_1        
		abyte0.aN = ((azh) (abyte0)).C ^ a.aN;
	//  167  309:aload_1         
	//  168  310:aload_1         
	//  169  311:getfield        #35  <Field int azh.C>
	//  170  314:aload_0         
	//  171  315:getfield        #12  <Field azh a>
	//  172  318:getfield        #29  <Field int azh.aN>
	//  173  321:ixor            
	//  174  322:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  175  325:aload_0         
	//  176  326:getfield        #12  <Field azh a>
	//  177  329:astore_1        
		abyte0.H = ((azh) (abyte0)).ay & a.aN;
	//  178  330:aload_1         
	//  179  331:aload_1         
	//  180  332:getfield        #59  <Field int azh.ay>
	//  181  335:aload_0         
	//  182  336:getfield        #12  <Field azh a>
	//  183  339:getfield        #29  <Field int azh.aN>
	//  184  342:iand            
	//  185  343:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	//  186  346:aload_0         
	//  187  347:getfield        #12  <Field azh a>
	//  188  350:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN | a.ay;
	//  189  351:aload_1         
	//  190  352:aload_1         
	//  191  353:getfield        #29  <Field int azh.aN>
	//  192  356:aload_0         
	//  193  357:getfield        #12  <Field azh a>
	//  194  360:getfield        #59  <Field int azh.ay>
	//  195  363:ior             
	//  196  364:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  197  367:aload_0         
	//  198  368:getfield        #12  <Field azh a>
	//  199  371:astore_1        
		abyte0.cD = ((azh) (abyte0)).M & a.C;
	//  200  372:aload_1         
	//  201  373:aload_1         
	//  202  374:getfield        #53  <Field int azh.M>
	//  203  377:aload_0         
	//  204  378:getfield        #12  <Field azh a>
	//  205  381:getfield        #35  <Field int azh.C>
	//  206  384:iand            
	//  207  385:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	//  208  388:aload_0         
	//  209  389:getfield        #12  <Field azh a>
	//  210  392:astore_1        
		abyte0.cD = ((azh) (abyte0)).U ^ a.cD;
	//  211  393:aload_1         
	//  212  394:aload_1         
	//  213  395:getfield        #47  <Field int azh.U>
	//  214  398:aload_0         
	//  215  399:getfield        #12  <Field azh a>
	//  216  402:getfield        #65  <Field int azh.cD>
	//  217  405:ixor            
	//  218  406:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	//  219  409:aload_0         
	//  220  410:getfield        #12  <Field azh a>
	//  221  413:astore_1        
		abyte0.cD = ((azh) (abyte0)).cD | a.ay;
	//  222  414:aload_1         
	//  223  415:aload_1         
	//  224  416:getfield        #65  <Field int azh.cD>
	//  225  419:aload_0         
	//  226  420:getfield        #12  <Field azh a>
	//  227  423:getfield        #59  <Field int azh.ay>
	//  228  426:ior             
	//  229  427:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	//  230  430:aload_0         
	//  231  431:getfield        #12  <Field azh a>
	//  232  434:astore_1        
		abyte0.cr = ((azh) (abyte0)).C ^ a.cr;
	//  233  435:aload_1         
	//  234  436:aload_1         
	//  235  437:getfield        #35  <Field int azh.C>
	//  236  440:aload_0         
	//  237  441:getfield        #12  <Field azh a>
	//  238  444:getfield        #68  <Field int azh.cr>
	//  239  447:ixor            
	//  240  448:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	//  241  451:aload_0         
	//  242  452:getfield        #12  <Field azh a>
	//  243  455:astore_1        
		abyte0.aw = ((azh) (abyte0)).ay & a.cr;
	//  244  456:aload_1         
	//  245  457:aload_1         
	//  246  458:getfield        #59  <Field int azh.ay>
	//  247  461:aload_0         
	//  248  462:getfield        #12  <Field azh a>
	//  249  465:getfield        #68  <Field int azh.cr>
	//  250  468:iand            
	//  251  469:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  252  472:aload_0         
	//  253  473:getfield        #12  <Field azh a>
	//  254  476:astore_1        
		abyte0.aw = ((azh) (abyte0)).bB ^ a.aw;
	//  255  477:aload_1         
	//  256  478:aload_1         
	//  257  479:getfield        #56  <Field int azh.bB>
	//  258  482:aload_0         
	//  259  483:getfield        #12  <Field azh a>
	//  260  486:getfield        #71  <Field int azh.aw>
	//  261  489:ixor            
	//  262  490:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  263  493:aload_0         
	//  264  494:getfield        #12  <Field azh a>
	//  265  497:astore_1        
		abyte0.aH = ((azh) (abyte0)).cr | a.ay;
	//  266  498:aload_1         
	//  267  499:aload_1         
	//  268  500:getfield        #68  <Field int azh.cr>
	//  269  503:aload_0         
	//  270  504:getfield        #12  <Field azh a>
	//  271  507:getfield        #59  <Field int azh.ay>
	//  272  510:ior             
	//  273  511:putfield        #74  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  274  514:aload_0         
	//  275  515:getfield        #12  <Field azh a>
	//  276  518:astore_1        
		abyte0.aH = ((azh) (abyte0)).bB ^ a.aH;
	//  277  519:aload_1         
	//  278  520:aload_1         
	//  279  521:getfield        #56  <Field int azh.bB>
	//  280  524:aload_0         
	//  281  525:getfield        #12  <Field azh a>
	//  282  528:getfield        #74  <Field int azh.aH>
	//  283  531:ixor            
	//  284  532:putfield        #74  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  285  535:aload_0         
	//  286  536:getfield        #12  <Field azh a>
	//  287  539:astore_1        
		abyte0.ag = ((azh) (abyte0)).U ^ a.ag;
	//  288  540:aload_1         
	//  289  541:aload_1         
	//  290  542:getfield        #47  <Field int azh.U>
	//  291  545:aload_0         
	//  292  546:getfield        #12  <Field azh a>
	//  293  549:getfield        #77  <Field int azh.ag>
	//  294  552:ixor            
	//  295  553:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  296  556:aload_0         
	//  297  557:getfield        #12  <Field azh a>
	//  298  560:astore_1        
		abyte0.ag = ((azh) (abyte0)).ay & a.ag;
	//  299  561:aload_1         
	//  300  562:aload_1         
	//  301  563:getfield        #59  <Field int azh.ay>
	//  302  566:aload_0         
	//  303  567:getfield        #12  <Field azh a>
	//  304  570:getfield        #77  <Field int azh.ag>
	//  305  573:iand            
	//  306  574:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  307  577:aload_0         
	//  308  578:getfield        #12  <Field azh a>
	//  309  581:astore_1        
		abyte0.ag = ((azh) (abyte0)).cr ^ a.ag;
	//  310  582:aload_1         
	//  311  583:aload_1         
	//  312  584:getfield        #68  <Field int azh.cr>
	//  313  587:aload_0         
	//  314  588:getfield        #12  <Field azh a>
	//  315  591:getfield        #77  <Field int azh.ag>
	//  316  594:ixor            
	//  317  595:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  318  598:aload_0         
	//  319  599:getfield        #12  <Field azh a>
	//  320  602:astore_1        
		abyte0.ag = ((azh) (abyte0)).ag & ~a.E;
	//  321  603:aload_1         
	//  322  604:aload_1         
	//  323  605:getfield        #77  <Field int azh.ag>
	//  324  608:aload_0         
	//  325  609:getfield        #12  <Field azh a>
	//  326  612:getfield        #80  <Field int azh.E>
	//  327  615:iconst_m1       
	//  328  616:ixor            
	//  329  617:iand            
	//  330  618:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  331  621:aload_0         
	//  332  622:getfield        #12  <Field azh a>
	//  333  625:astore_1        
		abyte0.cr = ((azh) (abyte0)).U | a.ci;
	//  334  626:aload_1         
	//  335  627:aload_1         
	//  336  628:getfield        #47  <Field int azh.U>
	//  337  631:aload_0         
	//  338  632:getfield        #12  <Field azh a>
	//  339  635:getfield        #50  <Field int azh.ci>
	//  340  638:ior             
	//  341  639:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	//  342  642:aload_0         
	//  343  643:getfield        #12  <Field azh a>
	//  344  646:astore_1        
		abyte0.bB = ((azh) (abyte0)).M & ~a.cr;
	//  345  647:aload_1         
	//  346  648:aload_1         
	//  347  649:getfield        #53  <Field int azh.M>
	//  348  652:aload_0         
	//  349  653:getfield        #12  <Field azh a>
	//  350  656:getfield        #68  <Field int azh.cr>
	//  351  659:iconst_m1       
	//  352  660:ixor            
	//  353  661:iand            
	//  354  662:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	//  355  665:aload_0         
	//  356  666:getfield        #12  <Field azh a>
	//  357  669:astore_1        
		abyte0.bB = ((azh) (abyte0)).ci ^ a.bB;
	//  358  670:aload_1         
	//  359  671:aload_1         
	//  360  672:getfield        #50  <Field int azh.ci>
	//  361  675:aload_0         
	//  362  676:getfield        #12  <Field azh a>
	//  363  679:getfield        #56  <Field int azh.bB>
	//  364  682:ixor            
	//  365  683:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	//  366  686:aload_0         
	//  367  687:getfield        #12  <Field azh a>
	//  368  690:astore_1        
		abyte0.bB = ((azh) (abyte0)).ay & a.bB;
	//  369  691:aload_1         
	//  370  692:aload_1         
	//  371  693:getfield        #59  <Field int azh.ay>
	//  372  696:aload_0         
	//  373  697:getfield        #12  <Field azh a>
	//  374  700:getfield        #56  <Field int azh.bB>
	//  375  703:iand            
	//  376  704:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	//  377  707:aload_0         
	//  378  708:getfield        #12  <Field azh a>
	//  379  711:astore_1        
		abyte0.cF = ((azh) (abyte0)).M & a.cr;
	//  380  712:aload_1         
	//  381  713:aload_1         
	//  382  714:getfield        #53  <Field int azh.M>
	//  383  717:aload_0         
	//  384  718:getfield        #12  <Field azh a>
	//  385  721:getfield        #68  <Field int azh.cr>
	//  386  724:iand            
	//  387  725:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  388  728:aload_0         
	//  389  729:getfield        #12  <Field azh a>
	//  390  732:astore_1        
		abyte0.cF = ((azh) (abyte0)).aR ^ a.cF;
	//  391  733:aload_1         
	//  392  734:aload_1         
	//  393  735:getfield        #26  <Field int azh.aR>
	//  394  738:aload_0         
	//  395  739:getfield        #12  <Field azh a>
	//  396  742:getfield        #83  <Field int azh.cF>
	//  397  745:ixor            
	//  398  746:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  399  749:aload_0         
	//  400  750:getfield        #12  <Field azh a>
	//  401  753:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ay | a.cF;
	//  402  754:aload_1         
	//  403  755:aload_1         
	//  404  756:getfield        #59  <Field int azh.ay>
	//  405  759:aload_0         
	//  406  760:getfield        #12  <Field azh a>
	//  407  763:getfield        #83  <Field int azh.cF>
	//  408  766:ior             
	//  409  767:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	//  410  770:aload_0         
	//  411  771:getfield        #12  <Field azh a>
	//  412  774:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bp ^ a.aQ;
	//  413  775:aload_1         
	//  414  776:aload_1         
	//  415  777:getfield        #89  <Field int azh.bp>
	//  416  780:aload_0         
	//  417  781:getfield        #12  <Field azh a>
	//  418  784:getfield        #86  <Field int azh.aQ>
	//  419  787:ixor            
	//  420  788:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	//  421  791:aload_0         
	//  422  792:getfield        #12  <Field azh a>
	//  423  795:astore_1        
		abyte0.bB = ((azh) (abyte0)).cF ^ a.bB;
	//  424  796:aload_1         
	//  425  797:aload_1         
	//  426  798:getfield        #83  <Field int azh.cF>
	//  427  801:aload_0         
	//  428  802:getfield        #12  <Field azh a>
	//  429  805:getfield        #56  <Field int azh.bB>
	//  430  808:ixor            
	//  431  809:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	//  432  812:aload_0         
	//  433  813:getfield        #12  <Field azh a>
	//  434  816:astore_1        
		abyte0.bB = ((azh) (abyte0)).bB & ~a.E;
	//  435  817:aload_1         
	//  436  818:aload_1         
	//  437  819:getfield        #56  <Field int azh.bB>
	//  438  822:aload_0         
	//  439  823:getfield        #12  <Field azh a>
	//  440  826:getfield        #80  <Field int azh.E>
	//  441  829:iconst_m1       
	//  442  830:ixor            
	//  443  831:iand            
	//  444  832:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	//  445  835:aload_0         
	//  446  836:getfield        #12  <Field azh a>
	//  447  839:astore_1        
		abyte0.cF = ((azh) (abyte0)).M & a.cr;
	//  448  840:aload_1         
	//  449  841:aload_1         
	//  450  842:getfield        #53  <Field int azh.M>
	//  451  845:aload_0         
	//  452  846:getfield        #12  <Field azh a>
	//  453  849:getfield        #68  <Field int azh.cr>
	//  454  852:iand            
	//  455  853:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  456  856:aload_0         
	//  457  857:getfield        #12  <Field azh a>
	//  458  860:astore_1        
		abyte0.cr = ((azh) (abyte0)).cr & ~a.ci;
	//  459  861:aload_1         
	//  460  862:aload_1         
	//  461  863:getfield        #68  <Field int azh.cr>
	//  462  866:aload_0         
	//  463  867:getfield        #12  <Field azh a>
	//  464  870:getfield        #50  <Field int azh.ci>
	//  465  873:iconst_m1       
	//  466  874:ixor            
	//  467  875:iand            
	//  468  876:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	//  469  879:aload_0         
	//  470  880:getfield        #12  <Field azh a>
	//  471  883:astore_1        
		abyte0.cF = ((azh) (abyte0)).cr ^ a.cF;
	//  472  884:aload_1         
	//  473  885:aload_1         
	//  474  886:getfield        #68  <Field int azh.cr>
	//  475  889:aload_0         
	//  476  890:getfield        #12  <Field azh a>
	//  477  893:getfield        #83  <Field int azh.cF>
	//  478  896:ixor            
	//  479  897:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  480  900:aload_0         
	//  481  901:getfield        #12  <Field azh a>
	//  482  904:astore_1        
		abyte0.cF = ((azh) (abyte0)).ay | a.cF;
	//  483  905:aload_1         
	//  484  906:aload_1         
	//  485  907:getfield        #59  <Field int azh.ay>
	//  486  910:aload_0         
	//  487  911:getfield        #12  <Field azh a>
	//  488  914:getfield        #83  <Field int azh.cF>
	//  489  917:ior             
	//  490  918:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  491  921:aload_0         
	//  492  922:getfield        #12  <Field azh a>
	//  493  925:astore_1        
		abyte0.bp = ((azh) (abyte0)).M & ~a.cr;
	//  494  926:aload_1         
	//  495  927:aload_1         
	//  496  928:getfield        #53  <Field int azh.M>
	//  497  931:aload_0         
	//  498  932:getfield        #12  <Field azh a>
	//  499  935:getfield        #68  <Field int azh.cr>
	//  500  938:iconst_m1       
	//  501  939:ixor            
	//  502  940:iand            
	//  503  941:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  504  944:aload_0         
	//  505  945:getfield        #12  <Field azh a>
	//  506  948:astore_1        
		abyte0.bp = ((azh) (abyte0)).ao ^ a.bp;
	//  507  949:aload_1         
	//  508  950:aload_1         
	//  509  951:getfield        #38  <Field int azh.ao>
	//  510  954:aload_0         
	//  511  955:getfield        #12  <Field azh a>
	//  512  958:getfield        #89  <Field int azh.bp>
	//  513  961:ixor            
	//  514  962:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  515  965:aload_0         
	//  516  966:getfield        #12  <Field azh a>
	//  517  969:astore_1        
		abyte0.bp = ((azh) (abyte0)).bp & ~a.ay;
	//  518  970:aload_1         
	//  519  971:aload_1         
	//  520  972:getfield        #89  <Field int azh.bp>
	//  521  975:aload_0         
	//  522  976:getfield        #12  <Field azh a>
	//  523  979:getfield        #59  <Field int azh.ay>
	//  524  982:iconst_m1       
	//  525  983:ixor            
	//  526  984:iand            
	//  527  985:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  528  988:aload_0         
	//  529  989:getfield        #12  <Field azh a>
	//  530  992:astore_1        
		abyte0.aV = ((azh) (abyte0)).ci & ~a.U;
	//  531  993:aload_1         
	//  532  994:aload_1         
	//  533  995:getfield        #50  <Field int azh.ci>
	//  534  998:aload_0         
	//  535  999:getfield        #12  <Field azh a>
	//  536 1002:getfield        #47  <Field int azh.U>
	//  537 1005:iconst_m1       
	//  538 1006:ixor            
	//  539 1007:iand            
	//  540 1008:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  541 1011:aload_0         
	//  542 1012:getfield        #12  <Field azh a>
	//  543 1015:astore_1        
		abyte0.g = ((azh) (abyte0)).aV ^ a.g;
	//  544 1016:aload_1         
	//  545 1017:aload_1         
	//  546 1018:getfield        #92  <Field int azh.aV>
	//  547 1021:aload_0         
	//  548 1022:getfield        #12  <Field azh a>
	//  549 1025:getfield        #95  <Field int azh.g>
	//  550 1028:ixor            
	//  551 1029:putfield        #95  <Field int azh.g>
		abyte0 = ((byte []) (a));
	//  552 1032:aload_0         
	//  553 1033:getfield        #12  <Field azh a>
	//  554 1036:astore_1        
		abyte0.av = ((azh) (abyte0)).g & ~a.ay;
	//  555 1037:aload_1         
	//  556 1038:aload_1         
	//  557 1039:getfield        #95  <Field int azh.g>
	//  558 1042:aload_0         
	//  559 1043:getfield        #12  <Field azh a>
	//  560 1046:getfield        #59  <Field int azh.ay>
	//  561 1049:iconst_m1       
	//  562 1050:ixor            
	//  563 1051:iand            
	//  564 1052:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  565 1055:aload_0         
	//  566 1056:getfield        #12  <Field azh a>
	//  567 1059:astore_1        
		abyte0.av = ((azh) (abyte0)).bt ^ a.av;
	//  568 1060:aload_1         
	//  569 1061:aload_1         
	//  570 1062:getfield        #41  <Field int azh.bt>
	//  571 1065:aload_0         
	//  572 1066:getfield        #12  <Field azh a>
	//  573 1069:getfield        #98  <Field int azh.av>
	//  574 1072:ixor            
	//  575 1073:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  576 1076:aload_0         
	//  577 1077:getfield        #12  <Field azh a>
	//  578 1080:astore_1        
		abyte0.av = ((azh) (abyte0)).E | a.av;
	//  579 1081:aload_1         
	//  580 1082:aload_1         
	//  581 1083:getfield        #80  <Field int azh.E>
	//  582 1086:aload_0         
	//  583 1087:getfield        #12  <Field azh a>
	//  584 1090:getfield        #98  <Field int azh.av>
	//  585 1093:ior             
	//  586 1094:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  587 1097:aload_0         
	//  588 1098:getfield        #12  <Field azh a>
	//  589 1101:astore_1        
		abyte0.av = ((azh) (abyte0)).aQ ^ a.av;
	//  590 1102:aload_1         
	//  591 1103:aload_1         
	//  592 1104:getfield        #86  <Field int azh.aQ>
	//  593 1107:aload_0         
	//  594 1108:getfield        #12  <Field azh a>
	//  595 1111:getfield        #98  <Field int azh.av>
	//  596 1114:ixor            
	//  597 1115:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  598 1118:aload_0         
	//  599 1119:getfield        #12  <Field azh a>
	//  600 1122:astore_1        
		abyte0.aQ = ((azh) (abyte0)).g & ~a.ay;
	//  601 1123:aload_1         
	//  602 1124:aload_1         
	//  603 1125:getfield        #95  <Field int azh.g>
	//  604 1128:aload_0         
	//  605 1129:getfield        #12  <Field azh a>
	//  606 1132:getfield        #59  <Field int azh.ay>
	//  607 1135:iconst_m1       
	//  608 1136:ixor            
	//  609 1137:iand            
	//  610 1138:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	//  611 1141:aload_0         
	//  612 1142:getfield        #12  <Field azh a>
	//  613 1145:astore_1        
		abyte0.aQ = ((azh) (abyte0)).U ^ a.aQ;
	//  614 1146:aload_1         
	//  615 1147:aload_1         
	//  616 1148:getfield        #47  <Field int azh.U>
	//  617 1151:aload_0         
	//  618 1152:getfield        #12  <Field azh a>
	//  619 1155:getfield        #86  <Field int azh.aQ>
	//  620 1158:ixor            
	//  621 1159:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	//  622 1162:aload_0         
	//  623 1163:getfield        #12  <Field azh a>
	//  624 1166:astore_1        
		abyte0.aQ = ((azh) (abyte0)).E | a.aQ;
	//  625 1167:aload_1         
	//  626 1168:aload_1         
	//  627 1169:getfield        #80  <Field int azh.E>
	//  628 1172:aload_0         
	//  629 1173:getfield        #12  <Field azh a>
	//  630 1176:getfield        #86  <Field int azh.aQ>
	//  631 1179:ior             
	//  632 1180:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	//  633 1183:aload_0         
	//  634 1184:getfield        #12  <Field azh a>
	//  635 1187:astore_1        
		abyte0.bt = ((azh) (abyte0)).M & a.aV;
	//  636 1188:aload_1         
	//  637 1189:aload_1         
	//  638 1190:getfield        #53  <Field int azh.M>
	//  639 1193:aload_0         
	//  640 1194:getfield        #12  <Field azh a>
	//  641 1197:getfield        #92  <Field int azh.aV>
	//  642 1200:iand            
	//  643 1201:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	//  644 1204:aload_0         
	//  645 1205:getfield        #12  <Field azh a>
	//  646 1208:astore_1        
		abyte0.bt = ((azh) (abyte0)).cr ^ a.bt;
	//  647 1209:aload_1         
	//  648 1210:aload_1         
	//  649 1211:getfield        #68  <Field int azh.cr>
	//  650 1214:aload_0         
	//  651 1215:getfield        #12  <Field azh a>
	//  652 1218:getfield        #41  <Field int azh.bt>
	//  653 1221:ixor            
	//  654 1222:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	//  655 1225:aload_0         
	//  656 1226:getfield        #12  <Field azh a>
	//  657 1229:astore_1        
		abyte0.bp = ((azh) (abyte0)).bt ^ a.bp;
	//  658 1230:aload_1         
	//  659 1231:aload_1         
	//  660 1232:getfield        #41  <Field int azh.bt>
	//  661 1235:aload_0         
	//  662 1236:getfield        #12  <Field azh a>
	//  663 1239:getfield        #89  <Field int azh.bp>
	//  664 1242:ixor            
	//  665 1243:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  666 1246:aload_0         
	//  667 1247:getfield        #12  <Field azh a>
	//  668 1250:astore_1        
		abyte0.bp = ((azh) (abyte0)).E | a.bp;
	//  669 1251:aload_1         
	//  670 1252:aload_1         
	//  671 1253:getfield        #80  <Field int azh.E>
	//  672 1256:aload_0         
	//  673 1257:getfield        #12  <Field azh a>
	//  674 1260:getfield        #89  <Field int azh.bp>
	//  675 1263:ior             
	//  676 1264:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  677 1267:aload_0         
	//  678 1268:getfield        #12  <Field azh a>
	//  679 1271:astore_1        
		abyte0.cr = ((azh) (abyte0)).U ^ a.ci;
	//  680 1272:aload_1         
	//  681 1273:aload_1         
	//  682 1274:getfield        #47  <Field int azh.U>
	//  683 1277:aload_0         
	//  684 1278:getfield        #12  <Field azh a>
	//  685 1281:getfield        #50  <Field int azh.ci>
	//  686 1284:ixor            
	//  687 1285:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	//  688 1288:aload_0         
	//  689 1289:getfield        #12  <Field azh a>
	//  690 1292:astore_1        
		abyte0.cv = ((azh) (abyte0)).cr ^ a.cv;
	//  691 1293:aload_1         
	//  692 1294:aload_1         
	//  693 1295:getfield        #68  <Field int azh.cr>
	//  694 1298:aload_0         
	//  695 1299:getfield        #12  <Field azh a>
	//  696 1302:getfield        #44  <Field int azh.cv>
	//  697 1305:ixor            
	//  698 1306:putfield        #44  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	//  699 1309:aload_0         
	//  700 1310:getfield        #12  <Field azh a>
	//  701 1313:astore_1        
		abyte0.cD = ((azh) (abyte0)).cv ^ a.cD;
	//  702 1314:aload_1         
	//  703 1315:aload_1         
	//  704 1316:getfield        #44  <Field int azh.cv>
	//  705 1319:aload_0         
	//  706 1320:getfield        #12  <Field azh a>
	//  707 1323:getfield        #65  <Field int azh.cD>
	//  708 1326:ixor            
	//  709 1327:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	//  710 1330:aload_0         
	//  711 1331:getfield        #12  <Field azh a>
	//  712 1334:astore_1        
		abyte0.ag = ((azh) (abyte0)).cD ^ a.ag;
	//  713 1335:aload_1         
	//  714 1336:aload_1         
	//  715 1337:getfield        #65  <Field int azh.cD>
	//  716 1340:aload_0         
	//  717 1341:getfield        #12  <Field azh a>
	//  718 1344:getfield        #77  <Field int azh.ag>
	//  719 1347:ixor            
	//  720 1348:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  721 1351:aload_0         
	//  722 1352:getfield        #12  <Field azh a>
	//  723 1355:astore_1        
		abyte0.cD = ((azh) (abyte0)).M & ~a.cr;
	//  724 1356:aload_1         
	//  725 1357:aload_1         
	//  726 1358:getfield        #53  <Field int azh.M>
	//  727 1361:aload_0         
	//  728 1362:getfield        #12  <Field azh a>
	//  729 1365:getfield        #68  <Field int azh.cr>
	//  730 1368:iconst_m1       
	//  731 1369:ixor            
	//  732 1370:iand            
	//  733 1371:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	//  734 1374:aload_0         
	//  735 1375:getfield        #12  <Field azh a>
	//  736 1378:astore_1        
		abyte0.cD = ((azh) (abyte0)).aR ^ a.cD;
	//  737 1379:aload_1         
	//  738 1380:aload_1         
	//  739 1381:getfield        #26  <Field int azh.aR>
	//  740 1384:aload_0         
	//  741 1385:getfield        #12  <Field azh a>
	//  742 1388:getfield        #65  <Field int azh.cD>
	//  743 1391:ixor            
	//  744 1392:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	//  745 1395:aload_0         
	//  746 1396:getfield        #12  <Field azh a>
	//  747 1399:astore_1        
		abyte0.cF = ((azh) (abyte0)).cD ^ a.cF;
	//  748 1400:aload_1         
	//  749 1401:aload_1         
	//  750 1402:getfield        #65  <Field int azh.cD>
	//  751 1405:aload_0         
	//  752 1406:getfield        #12  <Field azh a>
	//  753 1409:getfield        #83  <Field int azh.cF>
	//  754 1412:ixor            
	//  755 1413:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  756 1416:aload_0         
	//  757 1417:getfield        #12  <Field azh a>
	//  758 1420:astore_1        
		abyte0.bp = ((azh) (abyte0)).cF ^ a.bp;
	//  759 1421:aload_1         
	//  760 1422:aload_1         
	//  761 1423:getfield        #83  <Field int azh.cF>
	//  762 1426:aload_0         
	//  763 1427:getfield        #12  <Field azh a>
	//  764 1430:getfield        #89  <Field int azh.bp>
	//  765 1433:ixor            
	//  766 1434:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  767 1437:aload_0         
	//  768 1438:getfield        #12  <Field azh a>
	//  769 1441:astore_1        
		abyte0.cF = ((azh) (abyte0)).M & ~a.cr;
	//  770 1442:aload_1         
	//  771 1443:aload_1         
	//  772 1444:getfield        #53  <Field int azh.M>
	//  773 1447:aload_0         
	//  774 1448:getfield        #12  <Field azh a>
	//  775 1451:getfield        #68  <Field int azh.cr>
	//  776 1454:iconst_m1       
	//  777 1455:ixor            
	//  778 1456:iand            
	//  779 1457:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  780 1460:aload_0         
	//  781 1461:getfield        #12  <Field azh a>
	//  782 1464:astore_1        
		abyte0.cF = ((azh) (abyte0)).ao ^ a.cF;
	//  783 1465:aload_1         
	//  784 1466:aload_1         
	//  785 1467:getfield        #38  <Field int azh.ao>
	//  786 1470:aload_0         
	//  787 1471:getfield        #12  <Field azh a>
	//  788 1474:getfield        #83  <Field int azh.cF>
	//  789 1477:ixor            
	//  790 1478:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  791 1481:aload_0         
	//  792 1482:getfield        #12  <Field azh a>
	//  793 1485:astore_1        
		abyte0.cF = ((azh) (abyte0)).ay & a.cF;
	//  794 1486:aload_1         
	//  795 1487:aload_1         
	//  796 1488:getfield        #59  <Field int azh.ay>
	//  797 1491:aload_0         
	//  798 1492:getfield        #12  <Field azh a>
	//  799 1495:getfield        #83  <Field int azh.cF>
	//  800 1498:iand            
	//  801 1499:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  802 1502:aload_0         
	//  803 1503:getfield        #12  <Field azh a>
	//  804 1506:astore_1        
		abyte0.cF = ((azh) (abyte0)).g ^ a.cF;
	//  805 1507:aload_1         
	//  806 1508:aload_1         
	//  807 1509:getfield        #95  <Field int azh.g>
	//  808 1512:aload_0         
	//  809 1513:getfield        #12  <Field azh a>
	//  810 1516:getfield        #83  <Field int azh.cF>
	//  811 1519:ixor            
	//  812 1520:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  813 1523:aload_0         
	//  814 1524:getfield        #12  <Field azh a>
	//  815 1527:astore_1        
		abyte0.cF = ((azh) (abyte0)).cF & ~a.E;
	//  816 1528:aload_1         
	//  817 1529:aload_1         
	//  818 1530:getfield        #83  <Field int azh.cF>
	//  819 1533:aload_0         
	//  820 1534:getfield        #12  <Field azh a>
	//  821 1537:getfield        #80  <Field int azh.E>
	//  822 1540:iconst_m1       
	//  823 1541:ixor            
	//  824 1542:iand            
	//  825 1543:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  826 1546:aload_0         
	//  827 1547:getfield        #12  <Field azh a>
	//  828 1550:astore_1        
		abyte0.cF = ((azh) (abyte0)).aw ^ a.cF;
	//  829 1551:aload_1         
	//  830 1552:aload_1         
	//  831 1553:getfield        #71  <Field int azh.aw>
	//  832 1556:aload_0         
	//  833 1557:getfield        #12  <Field azh a>
	//  834 1560:getfield        #83  <Field int azh.cF>
	//  835 1563:ixor            
	//  836 1564:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  837 1567:aload_0         
	//  838 1568:getfield        #12  <Field azh a>
	//  839 1571:astore_1        
		abyte0.cF = ((azh) (abyte0)).ac & ~a.cF;
	//  840 1572:aload_1         
	//  841 1573:aload_1         
	//  842 1574:getfield        #101 <Field int azh.ac>
	//  843 1577:aload_0         
	//  844 1578:getfield        #12  <Field azh a>
	//  845 1581:getfield        #83  <Field int azh.cF>
	//  846 1584:iconst_m1       
	//  847 1585:ixor            
	//  848 1586:iand            
	//  849 1587:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	//  850 1590:aload_0         
	//  851 1591:getfield        #12  <Field azh a>
	//  852 1594:astore_1        
		abyte0.aw = ((azh) (abyte0)).M & a.cr;
	//  853 1595:aload_1         
	//  854 1596:aload_1         
	//  855 1597:getfield        #53  <Field int azh.M>
	//  856 1600:aload_0         
	//  857 1601:getfield        #12  <Field azh a>
	//  858 1604:getfield        #68  <Field int azh.cr>
	//  859 1607:iand            
	//  860 1608:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  861 1611:aload_0         
	//  862 1612:getfield        #12  <Field azh a>
	//  863 1615:astore_1        
		abyte0.aw = ((azh) (abyte0)).ao ^ a.aw;
	//  864 1616:aload_1         
	//  865 1617:aload_1         
	//  866 1618:getfield        #38  <Field int azh.ao>
	//  867 1621:aload_0         
	//  868 1622:getfield        #12  <Field azh a>
	//  869 1625:getfield        #71  <Field int azh.aw>
	//  870 1628:ixor            
	//  871 1629:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  872 1632:aload_0         
	//  873 1633:getfield        #12  <Field azh a>
	//  874 1636:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & ~a.ay;
	//  875 1637:aload_1         
	//  876 1638:aload_1         
	//  877 1639:getfield        #71  <Field int azh.aw>
	//  878 1642:aload_0         
	//  879 1643:getfield        #12  <Field azh a>
	//  880 1646:getfield        #59  <Field int azh.ay>
	//  881 1649:iconst_m1       
	//  882 1650:ixor            
	//  883 1651:iand            
	//  884 1652:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  885 1655:aload_0         
	//  886 1656:getfield        #12  <Field azh a>
	//  887 1659:astore_1        
		abyte0.aw = ((azh) (abyte0)).C ^ a.aw;
	//  888 1660:aload_1         
	//  889 1661:aload_1         
	//  890 1662:getfield        #35  <Field int azh.C>
	//  891 1665:aload_0         
	//  892 1666:getfield        #12  <Field azh a>
	//  893 1669:getfield        #71  <Field int azh.aw>
	//  894 1672:ixor            
	//  895 1673:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  896 1676:aload_0         
	//  897 1677:getfield        #12  <Field azh a>
	//  898 1680:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & ~a.E;
	//  899 1681:aload_1         
	//  900 1682:aload_1         
	//  901 1683:getfield        #71  <Field int azh.aw>
	//  902 1686:aload_0         
	//  903 1687:getfield        #12  <Field azh a>
	//  904 1690:getfield        #80  <Field int azh.E>
	//  905 1693:iconst_m1       
	//  906 1694:ixor            
	//  907 1695:iand            
	//  908 1696:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  909 1699:aload_0         
	//  910 1700:getfield        #12  <Field azh a>
	//  911 1703:astore_1        
		abyte0.aw = ((azh) (abyte0)).aH ^ a.aw;
	//  912 1704:aload_1         
	//  913 1705:aload_1         
	//  914 1706:getfield        #74  <Field int azh.aH>
	//  915 1709:aload_0         
	//  916 1710:getfield        #12  <Field azh a>
	//  917 1713:getfield        #71  <Field int azh.aw>
	//  918 1716:ixor            
	//  919 1717:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  920 1720:aload_0         
	//  921 1721:getfield        #12  <Field azh a>
	//  922 1724:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & a.ac;
	//  923 1725:aload_1         
	//  924 1726:aload_1         
	//  925 1727:getfield        #71  <Field int azh.aw>
	//  926 1730:aload_0         
	//  927 1731:getfield        #12  <Field azh a>
	//  928 1734:getfield        #101 <Field int azh.ac>
	//  929 1737:iand            
	//  930 1738:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  931 1741:aload_0         
	//  932 1742:getfield        #12  <Field azh a>
	//  933 1745:astore_1        
		abyte0.aw = ((azh) (abyte0)).bp ^ a.aw;
	//  934 1746:aload_1         
	//  935 1747:aload_1         
	//  936 1748:getfield        #89  <Field int azh.bp>
	//  937 1751:aload_0         
	//  938 1752:getfield        #12  <Field azh a>
	//  939 1755:getfield        #71  <Field int azh.aw>
	//  940 1758:ixor            
	//  941 1759:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  942 1762:aload_0         
	//  943 1763:getfield        #12  <Field azh a>
	//  944 1766:astore_1        
		abyte0.bz = ((azh) (abyte0)).aw ^ a.bz;
	//  945 1767:aload_1         
	//  946 1768:aload_1         
	//  947 1769:getfield        #71  <Field int azh.aw>
	//  948 1772:aload_0         
	//  949 1773:getfield        #12  <Field azh a>
	//  950 1776:getfield        #104 <Field int azh.bz>
	//  951 1779:ixor            
	//  952 1780:putfield        #104 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  953 1783:aload_0         
	//  954 1784:getfield        #12  <Field azh a>
	//  955 1787:astore_1        
		abyte0.bN = ((azh) (abyte0)).bN & a.bz;
	//  956 1788:aload_1         
	//  957 1789:aload_1         
	//  958 1790:getfield        #107 <Field int azh.bN>
	//  959 1793:aload_0         
	//  960 1794:getfield        #12  <Field azh a>
	//  961 1797:getfield        #104 <Field int azh.bz>
	//  962 1800:iand            
	//  963 1801:putfield        #107 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	//  964 1804:aload_0         
	//  965 1805:getfield        #12  <Field azh a>
	//  966 1808:astore_1        
		abyte0.bN = ((azh) (abyte0)).aa ^ a.bN;
	//  967 1809:aload_1         
	//  968 1810:aload_1         
	//  969 1811:getfield        #110 <Field int azh.aa>
	//  970 1814:aload_0         
	//  971 1815:getfield        #12  <Field azh a>
	//  972 1818:getfield        #107 <Field int azh.bN>
	//  973 1821:ixor            
	//  974 1822:putfield        #107 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	//  975 1825:aload_0         
	//  976 1826:getfield        #12  <Field azh a>
	//  977 1829:astore_1        
		abyte0.aa = ((azh) (abyte0)).bz & a.bw;
	//  978 1830:aload_1         
	//  979 1831:aload_1         
	//  980 1832:getfield        #104 <Field int azh.bz>
	//  981 1835:aload_0         
	//  982 1836:getfield        #12  <Field azh a>
	//  983 1839:getfield        #113 <Field int azh.bw>
	//  984 1842:iand            
	//  985 1843:putfield        #110 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	//  986 1846:aload_0         
	//  987 1847:getfield        #12  <Field azh a>
	//  988 1850:astore_1        
		abyte0.aa = ((azh) (abyte0)).aM ^ a.aa;
	//  989 1851:aload_1         
	//  990 1852:aload_1         
	//  991 1853:getfield        #116 <Field int azh.aM>
	//  992 1856:aload_0         
	//  993 1857:getfield        #12  <Field azh a>
	//  994 1860:getfield        #110 <Field int azh.aa>
	//  995 1863:ixor            
	//  996 1864:putfield        #110 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	//  997 1867:aload_0         
	//  998 1868:getfield        #12  <Field azh a>
	//  999 1871:astore_1        
		abyte0.X = ((azh) (abyte0)).bz & a.X;
	// 1000 1872:aload_1         
	// 1001 1873:aload_1         
	// 1002 1874:getfield        #104 <Field int azh.bz>
	// 1003 1877:aload_0         
	// 1004 1878:getfield        #12  <Field azh a>
	// 1005 1881:getfield        #119 <Field int azh.X>
	// 1006 1884:iand            
	// 1007 1885:putfield        #119 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1008 1888:aload_0         
	// 1009 1889:getfield        #12  <Field azh a>
	// 1010 1892:astore_1        
		abyte0.X = ((azh) (abyte0)).i ^ a.X;
	// 1011 1893:aload_1         
	// 1012 1894:aload_1         
	// 1013 1895:getfield        #122 <Field int azh.i>
	// 1014 1898:aload_0         
	// 1015 1899:getfield        #12  <Field azh a>
	// 1016 1902:getfield        #119 <Field int azh.X>
	// 1017 1905:ixor            
	// 1018 1906:putfield        #119 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1019 1909:aload_0         
	// 1020 1910:getfield        #12  <Field azh a>
	// 1021 1913:astore_1        
		abyte0.X = ((azh) (abyte0)).cf & a.X;
	// 1022 1914:aload_1         
	// 1023 1915:aload_1         
	// 1024 1916:getfield        #125 <Field int azh.cf>
	// 1025 1919:aload_0         
	// 1026 1920:getfield        #12  <Field azh a>
	// 1027 1923:getfield        #119 <Field int azh.X>
	// 1028 1926:iand            
	// 1029 1927:putfield        #119 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1030 1930:aload_0         
	// 1031 1931:getfield        #12  <Field azh a>
	// 1032 1934:astore_1        
		abyte0.ai = ((azh) (abyte0)).bz | a.ai;
	// 1033 1935:aload_1         
	// 1034 1936:aload_1         
	// 1035 1937:getfield        #104 <Field int azh.bz>
	// 1036 1940:aload_0         
	// 1037 1941:getfield        #12  <Field azh a>
	// 1038 1944:getfield        #128 <Field int azh.ai>
	// 1039 1947:ior             
	// 1040 1948:putfield        #128 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 1041 1951:aload_0         
	// 1042 1952:getfield        #12  <Field azh a>
	// 1043 1955:astore_1        
		abyte0.ai = ((azh) (abyte0)).bw ^ a.ai;
	// 1044 1956:aload_1         
	// 1045 1957:aload_1         
	// 1046 1958:getfield        #113 <Field int azh.bw>
	// 1047 1961:aload_0         
	// 1048 1962:getfield        #12  <Field azh a>
	// 1049 1965:getfield        #128 <Field int azh.ai>
	// 1050 1968:ixor            
	// 1051 1969:putfield        #128 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 1052 1972:aload_0         
	// 1053 1973:getfield        #12  <Field azh a>
	// 1054 1976:astore_1        
		abyte0.X = ((azh) (abyte0)).ai ^ a.X;
	// 1055 1977:aload_1         
	// 1056 1978:aload_1         
	// 1057 1979:getfield        #128 <Field int azh.ai>
	// 1058 1982:aload_0         
	// 1059 1983:getfield        #12  <Field azh a>
	// 1060 1986:getfield        #119 <Field int azh.X>
	// 1061 1989:ixor            
	// 1062 1990:putfield        #119 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1063 1993:aload_0         
	// 1064 1994:getfield        #12  <Field azh a>
	// 1065 1997:astore_1        
		abyte0.X = ((azh) (abyte0)).X ^ a.M;
	// 1066 1998:aload_1         
	// 1067 1999:aload_1         
	// 1068 2000:getfield        #119 <Field int azh.X>
	// 1069 2003:aload_0         
	// 1070 2004:getfield        #12  <Field azh a>
	// 1071 2007:getfield        #53  <Field int azh.M>
	// 1072 2010:ixor            
	// 1073 2011:putfield        #119 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1074 2014:aload_0         
	// 1075 2015:getfield        #12  <Field azh a>
	// 1076 2018:astore_1        
		abyte0.ai = ((azh) (abyte0)).X & a.am;
	// 1077 2019:aload_1         
	// 1078 2020:aload_1         
	// 1079 2021:getfield        #119 <Field int azh.X>
	// 1080 2024:aload_0         
	// 1081 2025:getfield        #12  <Field azh a>
	// 1082 2028:getfield        #131 <Field int azh.am>
	// 1083 2031:iand            
	// 1084 2032:putfield        #128 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 1085 2035:aload_0         
	// 1086 2036:getfield        #12  <Field azh a>
	// 1087 2039:astore_1        
		abyte0.bw = ((azh) (abyte0)).am & ~a.ai;
	// 1088 2040:aload_1         
	// 1089 2041:aload_1         
	// 1090 2042:getfield        #131 <Field int azh.am>
	// 1091 2045:aload_0         
	// 1092 2046:getfield        #12  <Field azh a>
	// 1093 2049:getfield        #128 <Field int azh.ai>
	// 1094 2052:iconst_m1       
	// 1095 2053:ixor            
	// 1096 2054:iand            
	// 1097 2055:putfield        #113 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1098 2058:aload_0         
	// 1099 2059:getfield        #12  <Field azh a>
	// 1100 2062:astore_1        
		abyte0.i = ((azh) (abyte0)).X & ~a.am;
	// 1101 2063:aload_1         
	// 1102 2064:aload_1         
	// 1103 2065:getfield        #119 <Field int azh.X>
	// 1104 2068:aload_0         
	// 1105 2069:getfield        #12  <Field azh a>
	// 1106 2072:getfield        #131 <Field int azh.am>
	// 1107 2075:iconst_m1       
	// 1108 2076:ixor            
	// 1109 2077:iand            
	// 1110 2078:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 1111 2081:aload_0         
	// 1112 2082:getfield        #12  <Field azh a>
	// 1113 2085:astore_1        
		abyte0.aM = ((azh) (abyte0)).o & a.X;
	// 1114 2086:aload_1         
	// 1115 2087:aload_1         
	// 1116 2088:getfield        #134 <Field int azh.o>
	// 1117 2091:aload_0         
	// 1118 2092:getfield        #12  <Field azh a>
	// 1119 2095:getfield        #119 <Field int azh.X>
	// 1120 2098:iand            
	// 1121 2099:putfield        #116 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 1122 2102:aload_0         
	// 1123 2103:getfield        #12  <Field azh a>
	// 1124 2106:astore_1        
		abyte0.aw = ((azh) (abyte0)).X ^ a.am;
	// 1125 2107:aload_1         
	// 1126 2108:aload_1         
	// 1127 2109:getfield        #119 <Field int azh.X>
	// 1128 2112:aload_0         
	// 1129 2113:getfield        #12  <Field azh a>
	// 1130 2116:getfield        #131 <Field int azh.am>
	// 1131 2119:ixor            
	// 1132 2120:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1133 2123:aload_0         
	// 1134 2124:getfield        #12  <Field azh a>
	// 1135 2127:astore_1        
		abyte0.bp = ((azh) (abyte0)).am | a.X;
	// 1136 2128:aload_1         
	// 1137 2129:aload_1         
	// 1138 2130:getfield        #131 <Field int azh.am>
	// 1139 2133:aload_0         
	// 1140 2134:getfield        #12  <Field azh a>
	// 1141 2137:getfield        #119 <Field int azh.X>
	// 1142 2140:ior             
	// 1143 2141:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1144 2144:aload_0         
	// 1145 2145:getfield        #12  <Field azh a>
	// 1146 2148:astore_1        
		abyte0.aH = ((azh) (abyte0)).am & ~a.X;
	// 1147 2149:aload_1         
	// 1148 2150:aload_1         
	// 1149 2151:getfield        #131 <Field int azh.am>
	// 1150 2154:aload_0         
	// 1151 2155:getfield        #12  <Field azh a>
	// 1152 2158:getfield        #119 <Field int azh.X>
	// 1153 2161:iconst_m1       
	// 1154 2162:ixor            
	// 1155 2163:iand            
	// 1156 2164:putfield        #74  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 1157 2167:aload_0         
	// 1158 2168:getfield        #12  <Field azh a>
	// 1159 2171:astore_1        
		abyte0.by = ((azh) (abyte0)).bz & ~a.by;
	// 1160 2172:aload_1         
	// 1161 2173:aload_1         
	// 1162 2174:getfield        #104 <Field int azh.bz>
	// 1163 2177:aload_0         
	// 1164 2178:getfield        #12  <Field azh a>
	// 1165 2181:getfield        #137 <Field int azh.by>
	// 1166 2184:iconst_m1       
	// 1167 2185:ixor            
	// 1168 2186:iand            
	// 1169 2187:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1170 2190:aload_0         
	// 1171 2191:getfield        #12  <Field azh a>
	// 1172 2194:astore_1        
		abyte0.by = ((azh) (abyte0)).d ^ a.by;
	// 1173 2195:aload_1         
	// 1174 2196:aload_1         
	// 1175 2197:getfield        #140 <Field int azh.d>
	// 1176 2200:aload_0         
	// 1177 2201:getfield        #12  <Field azh a>
	// 1178 2204:getfield        #137 <Field int azh.by>
	// 1179 2207:ixor            
	// 1180 2208:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1181 2211:aload_0         
	// 1182 2212:getfield        #12  <Field azh a>
	// 1183 2215:astore_1        
		abyte0.by = ((azh) (abyte0)).cf & ~a.by;
	// 1184 2216:aload_1         
	// 1185 2217:aload_1         
	// 1186 2218:getfield        #125 <Field int azh.cf>
	// 1187 2221:aload_0         
	// 1188 2222:getfield        #12  <Field azh a>
	// 1189 2225:getfield        #137 <Field int azh.by>
	// 1190 2228:iconst_m1       
	// 1191 2229:ixor            
	// 1192 2230:iand            
	// 1193 2231:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1194 2234:aload_0         
	// 1195 2235:getfield        #12  <Field azh a>
	// 1196 2238:astore_1        
		abyte0.by = ((azh) (abyte0)).bN ^ a.by;
	// 1197 2239:aload_1         
	// 1198 2240:aload_1         
	// 1199 2241:getfield        #107 <Field int azh.bN>
	// 1200 2244:aload_0         
	// 1201 2245:getfield        #12  <Field azh a>
	// 1202 2248:getfield        #137 <Field int azh.by>
	// 1203 2251:ixor            
	// 1204 2252:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1205 2255:aload_0         
	// 1206 2256:getfield        #12  <Field azh a>
	// 1207 2259:astore_1        
		abyte0.y = ((azh) (abyte0)).by ^ a.y;
	// 1208 2260:aload_1         
	// 1209 2261:aload_1         
	// 1210 2262:getfield        #137 <Field int azh.by>
	// 1211 2265:aload_0         
	// 1212 2266:getfield        #12  <Field azh a>
	// 1213 2269:getfield        #143 <Field int azh.y>
	// 1214 2272:ixor            
	// 1215 2273:putfield        #143 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 1216 2276:aload_0         
	// 1217 2277:getfield        #12  <Field azh a>
	// 1218 2280:astore_1        
		abyte0.by = ((azh) (abyte0)).y | a.aI;
	// 1219 2281:aload_1         
	// 1220 2282:aload_1         
	// 1221 2283:getfield        #143 <Field int azh.y>
	// 1222 2286:aload_0         
	// 1223 2287:getfield        #12  <Field azh a>
	// 1224 2290:getfield        #146 <Field int azh.aI>
	// 1225 2293:ior             
	// 1226 2294:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1227 2297:aload_0         
	// 1228 2298:getfield        #12  <Field azh a>
	// 1229 2301:astore_1        
		abyte0.by = ((azh) (abyte0)).aI ^ a.by;
	// 1230 2302:aload_1         
	// 1231 2303:aload_1         
	// 1232 2304:getfield        #146 <Field int azh.aI>
	// 1233 2307:aload_0         
	// 1234 2308:getfield        #12  <Field azh a>
	// 1235 2311:getfield        #137 <Field int azh.by>
	// 1236 2314:ixor            
	// 1237 2315:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1238 2318:aload_0         
	// 1239 2319:getfield        #12  <Field azh a>
	// 1240 2322:astore_1        
		abyte0.by = ((azh) (abyte0)).by & ~a.S;
	// 1241 2323:aload_1         
	// 1242 2324:aload_1         
	// 1243 2325:getfield        #137 <Field int azh.by>
	// 1244 2328:aload_0         
	// 1245 2329:getfield        #12  <Field azh a>
	// 1246 2332:getfield        #149 <Field int azh.S>
	// 1247 2335:iconst_m1       
	// 1248 2336:ixor            
	// 1249 2337:iand            
	// 1250 2338:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1251 2341:aload_0         
	// 1252 2342:getfield        #12  <Field azh a>
	// 1253 2345:astore_1        
		abyte0.bN = ~((azh) (abyte0)).y;
	// 1254 2346:aload_1         
	// 1255 2347:aload_1         
	// 1256 2348:getfield        #143 <Field int azh.y>
	// 1257 2351:iconst_m1       
	// 1258 2352:ixor            
	// 1259 2353:putfield        #107 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 1260 2356:aload_0         
	// 1261 2357:getfield        #12  <Field azh a>
	// 1262 2360:astore_1        
		abyte0.d = ((azh) (abyte0)).aI & ~a.y;
	// 1263 2361:aload_1         
	// 1264 2362:aload_1         
	// 1265 2363:getfield        #146 <Field int azh.aI>
	// 1266 2366:aload_0         
	// 1267 2367:getfield        #12  <Field azh a>
	// 1268 2370:getfield        #143 <Field int azh.y>
	// 1269 2373:iconst_m1       
	// 1270 2374:ixor            
	// 1271 2375:iand            
	// 1272 2376:putfield        #140 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 1273 2379:aload_0         
	// 1274 2380:getfield        #12  <Field azh a>
	// 1275 2383:astore_1        
		abyte0.d = ((azh) (abyte0)).S | a.d;
	// 1276 2384:aload_1         
	// 1277 2385:aload_1         
	// 1278 2386:getfield        #149 <Field int azh.S>
	// 1279 2389:aload_0         
	// 1280 2390:getfield        #12  <Field azh a>
	// 1281 2393:getfield        #140 <Field int azh.d>
	// 1282 2396:ior             
	// 1283 2397:putfield        #140 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 1284 2400:aload_0         
	// 1285 2401:getfield        #12  <Field azh a>
	// 1286 2404:astore_1        
		abyte0.ao = ((azh) (abyte0)).aI ^ a.y;
	// 1287 2405:aload_1         
	// 1288 2406:aload_1         
	// 1289 2407:getfield        #146 <Field int azh.aI>
	// 1290 2410:aload_0         
	// 1291 2411:getfield        #12  <Field azh a>
	// 1292 2414:getfield        #143 <Field int azh.y>
	// 1293 2417:ixor            
	// 1294 2418:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1295 2421:aload_0         
	// 1296 2422:getfield        #12  <Field azh a>
	// 1297 2425:astore_1        
		abyte0.g = ((azh) (abyte0)).ao & a.S;
	// 1298 2426:aload_1         
	// 1299 2427:aload_1         
	// 1300 2428:getfield        #38  <Field int azh.ao>
	// 1301 2431:aload_0         
	// 1302 2432:getfield        #12  <Field azh a>
	// 1303 2435:getfield        #149 <Field int azh.S>
	// 1304 2438:iand            
	// 1305 2439:putfield        #95  <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 1306 2442:aload_0         
	// 1307 2443:getfield        #12  <Field azh a>
	// 1308 2446:astore_1        
		abyte0.cD = ((azh) (abyte0)).y | a.aI;
	// 1309 2447:aload_1         
	// 1310 2448:aload_1         
	// 1311 2449:getfield        #143 <Field int azh.y>
	// 1312 2452:aload_0         
	// 1313 2453:getfield        #12  <Field azh a>
	// 1314 2456:getfield        #146 <Field int azh.aI>
	// 1315 2459:ior             
	// 1316 2460:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 1317 2463:aload_0         
	// 1318 2464:getfield        #12  <Field azh a>
	// 1319 2467:astore_1        
		abyte0.bU = ((azh) (abyte0)).bU & a.bz;
	// 1320 2468:aload_1         
	// 1321 2469:aload_1         
	// 1322 2470:getfield        #152 <Field int azh.bU>
	// 1323 2473:aload_0         
	// 1324 2474:getfield        #12  <Field azh a>
	// 1325 2477:getfield        #104 <Field int azh.bz>
	// 1326 2480:iand            
	// 1327 2481:putfield        #152 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1328 2484:aload_0         
	// 1329 2485:getfield        #12  <Field azh a>
	// 1330 2488:astore_1        
		abyte0.bU = ((azh) (abyte0)).cm ^ a.bU;
	// 1331 2489:aload_1         
	// 1332 2490:aload_1         
	// 1333 2491:getfield        #155 <Field int azh.cm>
	// 1334 2494:aload_0         
	// 1335 2495:getfield        #12  <Field azh a>
	// 1336 2498:getfield        #152 <Field int azh.bU>
	// 1337 2501:ixor            
	// 1338 2502:putfield        #152 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1339 2505:aload_0         
	// 1340 2506:getfield        #12  <Field azh a>
	// 1341 2509:astore_1        
		abyte0.bU = ((azh) (abyte0)).cf & ~a.bU;
	// 1342 2510:aload_1         
	// 1343 2511:aload_1         
	// 1344 2512:getfield        #125 <Field int azh.cf>
	// 1345 2515:aload_0         
	// 1346 2516:getfield        #12  <Field azh a>
	// 1347 2519:getfield        #152 <Field int azh.bU>
	// 1348 2522:iconst_m1       
	// 1349 2523:ixor            
	// 1350 2524:iand            
	// 1351 2525:putfield        #152 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1352 2528:aload_0         
	// 1353 2529:getfield        #12  <Field azh a>
	// 1354 2532:astore_1        
		abyte0.an = ((azh) (abyte0)).bz & ~a.an;
	// 1355 2533:aload_1         
	// 1356 2534:aload_1         
	// 1357 2535:getfield        #104 <Field int azh.bz>
	// 1358 2538:aload_0         
	// 1359 2539:getfield        #12  <Field azh a>
	// 1360 2542:getfield        #158 <Field int azh.an>
	// 1361 2545:iconst_m1       
	// 1362 2546:ixor            
	// 1363 2547:iand            
	// 1364 2548:putfield        #158 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1365 2551:aload_0         
	// 1366 2552:getfield        #12  <Field azh a>
	// 1367 2555:astore_1        
		abyte0.an = ((azh) (abyte0)).r ^ a.an;
	// 1368 2556:aload_1         
	// 1369 2557:aload_1         
	// 1370 2558:getfield        #161 <Field int azh.r>
	// 1371 2561:aload_0         
	// 1372 2562:getfield        #12  <Field azh a>
	// 1373 2565:getfield        #158 <Field int azh.an>
	// 1374 2568:ixor            
	// 1375 2569:putfield        #158 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1376 2572:aload_0         
	// 1377 2573:getfield        #12  <Field azh a>
	// 1378 2576:astore_1        
		abyte0.bU = ((azh) (abyte0)).an ^ a.bU;
	// 1379 2577:aload_1         
	// 1380 2578:aload_1         
	// 1381 2579:getfield        #158 <Field int azh.an>
	// 1382 2582:aload_0         
	// 1383 2583:getfield        #12  <Field azh a>
	// 1384 2586:getfield        #152 <Field int azh.bU>
	// 1385 2589:ixor            
	// 1386 2590:putfield        #152 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1387 2593:aload_0         
	// 1388 2594:getfield        #12  <Field azh a>
	// 1389 2597:astore_1        
		abyte0.aP = ((azh) (abyte0)).bU ^ a.aP;
	// 1390 2598:aload_1         
	// 1391 2599:aload_1         
	// 1392 2600:getfield        #152 <Field int azh.bU>
	// 1393 2603:aload_0         
	// 1394 2604:getfield        #12  <Field azh a>
	// 1395 2607:getfield        #164 <Field int azh.aP>
	// 1396 2610:ixor            
	// 1397 2611:putfield        #164 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1398 2614:aload_0         
	// 1399 2615:getfield        #12  <Field azh a>
	// 1400 2618:astore_1        
		abyte0.bU = ((azh) (abyte0)).aP & ~a.bs;
	// 1401 2619:aload_1         
	// 1402 2620:aload_1         
	// 1403 2621:getfield        #164 <Field int azh.aP>
	// 1404 2624:aload_0         
	// 1405 2625:getfield        #12  <Field azh a>
	// 1406 2628:getfield        #167 <Field int azh.bs>
	// 1407 2631:iconst_m1       
	// 1408 2632:ixor            
	// 1409 2633:iand            
	// 1410 2634:putfield        #152 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1411 2637:aload_0         
	// 1412 2638:getfield        #12  <Field azh a>
	// 1413 2641:astore_1        
		abyte0.an = ((azh) (abyte0)).aP & ~a.bs;
	// 1414 2642:aload_1         
	// 1415 2643:aload_1         
	// 1416 2644:getfield        #164 <Field int azh.aP>
	// 1417 2647:aload_0         
	// 1418 2648:getfield        #12  <Field azh a>
	// 1419 2651:getfield        #167 <Field int azh.bs>
	// 1420 2654:iconst_m1       
	// 1421 2655:ixor            
	// 1422 2656:iand            
	// 1423 2657:putfield        #158 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1424 2660:aload_0         
	// 1425 2661:getfield        #12  <Field azh a>
	// 1426 2664:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bQ & a.bz;
	// 1427 2665:aload_1         
	// 1428 2666:aload_1         
	// 1429 2667:getfield        #170 <Field int azh.bQ>
	// 1430 2670:aload_0         
	// 1431 2671:getfield        #12  <Field azh a>
	// 1432 2674:getfield        #104 <Field int azh.bz>
	// 1433 2677:iand            
	// 1434 2678:putfield        #170 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 1435 2681:aload_0         
	// 1436 2682:getfield        #12  <Field azh a>
	// 1437 2685:astore_1        
		abyte0.bQ = ((azh) (abyte0)).cj ^ a.bQ;
	// 1438 2686:aload_1         
	// 1439 2687:aload_1         
	// 1440 2688:getfield        #173 <Field int azh.cj>
	// 1441 2691:aload_0         
	// 1442 2692:getfield        #12  <Field azh a>
	// 1443 2695:getfield        #170 <Field int azh.bQ>
	// 1444 2698:ixor            
	// 1445 2699:putfield        #170 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 1446 2702:aload_0         
	// 1447 2703:getfield        #12  <Field azh a>
	// 1448 2706:astore_1        
		abyte0.bQ = ((azh) (abyte0)).cf & ~a.bQ;
	// 1449 2707:aload_1         
	// 1450 2708:aload_1         
	// 1451 2709:getfield        #125 <Field int azh.cf>
	// 1452 2712:aload_0         
	// 1453 2713:getfield        #12  <Field azh a>
	// 1454 2716:getfield        #170 <Field int azh.bQ>
	// 1455 2719:iconst_m1       
	// 1456 2720:ixor            
	// 1457 2721:iand            
	// 1458 2722:putfield        #170 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 1459 2725:aload_0         
	// 1460 2726:getfield        #12  <Field azh a>
	// 1461 2729:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aa ^ a.bQ;
	// 1462 2730:aload_1         
	// 1463 2731:aload_1         
	// 1464 2732:getfield        #110 <Field int azh.aa>
	// 1465 2735:aload_0         
	// 1466 2736:getfield        #12  <Field azh a>
	// 1467 2739:getfield        #170 <Field int azh.bQ>
	// 1468 2742:ixor            
	// 1469 2743:putfield        #170 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 1470 2746:aload_0         
	// 1471 2747:getfield        #12  <Field azh a>
	// 1472 2750:astore_1        
		abyte0.Q = ((azh) (abyte0)).bQ ^ a.Q;
	// 1473 2751:aload_1         
	// 1474 2752:aload_1         
	// 1475 2753:getfield        #170 <Field int azh.bQ>
	// 1476 2756:aload_0         
	// 1477 2757:getfield        #12  <Field azh a>
	// 1478 2760:getfield        #176 <Field int azh.Q>
	// 1479 2763:ixor            
	// 1480 2764:putfield        #176 <Field int azh.Q>
		abyte0 = ((byte []) (a));
	// 1481 2767:aload_0         
	// 1482 2768:getfield        #12  <Field azh a>
	// 1483 2771:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bu & ~a.Q;
	// 1484 2772:aload_1         
	// 1485 2773:aload_1         
	// 1486 2774:getfield        #179 <Field int azh.bu>
	// 1487 2777:aload_0         
	// 1488 2778:getfield        #12  <Field azh a>
	// 1489 2781:getfield        #176 <Field int azh.Q>
	// 1490 2784:iconst_m1       
	// 1491 2785:ixor            
	// 1492 2786:iand            
	// 1493 2787:putfield        #170 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 1494 2790:aload_0         
	// 1495 2791:getfield        #12  <Field azh a>
	// 1496 2794:astore_1        
		abyte0.aa = ~((azh) (abyte0)).Q;
	// 1497 2795:aload_1         
	// 1498 2796:aload_1         
	// 1499 2797:getfield        #176 <Field int azh.Q>
	// 1500 2800:iconst_m1       
	// 1501 2801:ixor            
	// 1502 2802:putfield        #110 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 1503 2805:aload_0         
	// 1504 2806:getfield        #12  <Field azh a>
	// 1505 2809:astore_1        
		abyte0.cj = ((azh) (abyte0)).M & ~a.cr;
	// 1506 2810:aload_1         
	// 1507 2811:aload_1         
	// 1508 2812:getfield        #53  <Field int azh.M>
	// 1509 2815:aload_0         
	// 1510 2816:getfield        #12  <Field azh a>
	// 1511 2819:getfield        #68  <Field int azh.cr>
	// 1512 2822:iconst_m1       
	// 1513 2823:ixor            
	// 1514 2824:iand            
	// 1515 2825:putfield        #173 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1516 2828:aload_0         
	// 1517 2829:getfield        #12  <Field azh a>
	// 1518 2832:astore_1        
		abyte0.cj = ((azh) (abyte0)).ci ^ a.cj;
	// 1519 2833:aload_1         
	// 1520 2834:aload_1         
	// 1521 2835:getfield        #50  <Field int azh.ci>
	// 1522 2838:aload_0         
	// 1523 2839:getfield        #12  <Field azh a>
	// 1524 2842:getfield        #173 <Field int azh.cj>
	// 1525 2845:ixor            
	// 1526 2846:putfield        #173 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1527 2849:aload_0         
	// 1528 2850:getfield        #12  <Field azh a>
	// 1529 2853:astore_1        
		abyte0.cj = ((azh) (abyte0)).cj | a.ay;
	// 1530 2854:aload_1         
	// 1531 2855:aload_1         
	// 1532 2856:getfield        #173 <Field int azh.cj>
	// 1533 2859:aload_0         
	// 1534 2860:getfield        #12  <Field azh a>
	// 1535 2863:getfield        #59  <Field int azh.ay>
	// 1536 2866:ior             
	// 1537 2867:putfield        #173 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1538 2870:aload_0         
	// 1539 2871:getfield        #12  <Field azh a>
	// 1540 2874:astore_1        
		abyte0.cj = ((azh) (abyte0)).bt ^ a.cj;
	// 1541 2875:aload_1         
	// 1542 2876:aload_1         
	// 1543 2877:getfield        #41  <Field int azh.bt>
	// 1544 2880:aload_0         
	// 1545 2881:getfield        #12  <Field azh a>
	// 1546 2884:getfield        #173 <Field int azh.cj>
	// 1547 2887:ixor            
	// 1548 2888:putfield        #173 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1549 2891:aload_0         
	// 1550 2892:getfield        #12  <Field azh a>
	// 1551 2895:astore_1        
		abyte0.bB = ((azh) (abyte0)).cj ^ a.bB;
	// 1552 2896:aload_1         
	// 1553 2897:aload_1         
	// 1554 2898:getfield        #173 <Field int azh.cj>
	// 1555 2901:aload_0         
	// 1556 2902:getfield        #12  <Field azh a>
	// 1557 2905:getfield        #56  <Field int azh.bB>
	// 1558 2908:ixor            
	// 1559 2909:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 1560 2912:aload_0         
	// 1561 2913:getfield        #12  <Field azh a>
	// 1562 2916:astore_1        
		abyte0.cF = ((azh) (abyte0)).bB ^ a.cF;
	// 1563 2917:aload_1         
	// 1564 2918:aload_1         
	// 1565 2919:getfield        #56  <Field int azh.bB>
	// 1566 2922:aload_0         
	// 1567 2923:getfield        #12  <Field azh a>
	// 1568 2926:getfield        #83  <Field int azh.cF>
	// 1569 2929:ixor            
	// 1570 2930:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	// 1571 2933:aload_0         
	// 1572 2934:getfield        #12  <Field azh a>
	// 1573 2937:astore_1        
		abyte0.br = ((azh) (abyte0)).cF ^ a.br;
	// 1574 2938:aload_1         
	// 1575 2939:aload_1         
	// 1576 2940:getfield        #83  <Field int azh.cF>
	// 1577 2943:aload_0         
	// 1578 2944:getfield        #12  <Field azh a>
	// 1579 2947:getfield        #32  <Field int azh.br>
	// 1580 2950:ixor            
	// 1581 2951:putfield        #32  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 1582 2954:aload_0         
	// 1583 2955:getfield        #12  <Field azh a>
	// 1584 2958:astore_1        
		abyte0.cB = ((azh) (abyte0)).cB & ~a.br;
	// 1585 2959:aload_1         
	// 1586 2960:aload_1         
	// 1587 2961:getfield        #182 <Field int azh.cB>
	// 1588 2964:aload_0         
	// 1589 2965:getfield        #12  <Field azh a>
	// 1590 2968:getfield        #32  <Field int azh.br>
	// 1591 2971:iconst_m1       
	// 1592 2972:ixor            
	// 1593 2973:iand            
	// 1594 2974:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 1595 2977:aload_0         
	// 1596 2978:getfield        #12  <Field azh a>
	// 1597 2981:astore_1        
		abyte0.cB = ((azh) (abyte0)).cx ^ a.cB;
	// 1598 2982:aload_1         
	// 1599 2983:aload_1         
	// 1600 2984:getfield        #185 <Field int azh.cx>
	// 1601 2987:aload_0         
	// 1602 2988:getfield        #12  <Field azh a>
	// 1603 2991:getfield        #182 <Field int azh.cB>
	// 1604 2994:ixor            
	// 1605 2995:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 1606 2998:aload_0         
	// 1607 2999:getfield        #12  <Field azh a>
	// 1608 3002:astore_1        
		abyte0.cx = ((azh) (abyte0)).br | a.aK;
	// 1609 3003:aload_1         
	// 1610 3004:aload_1         
	// 1611 3005:getfield        #32  <Field int azh.br>
	// 1612 3008:aload_0         
	// 1613 3009:getfield        #12  <Field azh a>
	// 1614 3012:getfield        #188 <Field int azh.aK>
	// 1615 3015:ior             
	// 1616 3016:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 1617 3019:aload_0         
	// 1618 3020:getfield        #12  <Field azh a>
	// 1619 3023:astore_1        
		abyte0.cx = ((azh) (abyte0)).bv ^ a.cx;
	// 1620 3024:aload_1         
	// 1621 3025:aload_1         
	// 1622 3026:getfield        #191 <Field int azh.bv>
	// 1623 3029:aload_0         
	// 1624 3030:getfield        #12  <Field azh a>
	// 1625 3033:getfield        #185 <Field int azh.cx>
	// 1626 3036:ixor            
	// 1627 3037:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 1628 3040:aload_0         
	// 1629 3041:getfield        #12  <Field azh a>
	// 1630 3044:astore_1        
		abyte0.cx = ((azh) (abyte0)).aT & ~a.cx;
	// 1631 3045:aload_1         
	// 1632 3046:aload_1         
	// 1633 3047:getfield        #194 <Field int azh.aT>
	// 1634 3050:aload_0         
	// 1635 3051:getfield        #12  <Field azh a>
	// 1636 3054:getfield        #185 <Field int azh.cx>
	// 1637 3057:iconst_m1       
	// 1638 3058:ixor            
	// 1639 3059:iand            
	// 1640 3060:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 1641 3063:aload_0         
	// 1642 3064:getfield        #12  <Field azh a>
	// 1643 3067:astore_1        
		abyte0.cx = ((azh) (abyte0)).a ^ a.cx;
	// 1644 3068:aload_1         
	// 1645 3069:aload_1         
	// 1646 3070:getfield        #196 <Field int azh.a>
	// 1647 3073:aload_0         
	// 1648 3074:getfield        #12  <Field azh a>
	// 1649 3077:getfield        #185 <Field int azh.cx>
	// 1650 3080:ixor            
	// 1651 3081:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 1652 3084:aload_0         
	// 1653 3085:getfield        #12  <Field azh a>
	// 1654 3088:astore_1        
		abyte0.cx = ((azh) (abyte0)).cx | a.aF;
	// 1655 3089:aload_1         
	// 1656 3090:aload_1         
	// 1657 3091:getfield        #185 <Field int azh.cx>
	// 1658 3094:aload_0         
	// 1659 3095:getfield        #12  <Field azh a>
	// 1660 3098:getfield        #199 <Field int azh.aF>
	// 1661 3101:ior             
	// 1662 3102:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 1663 3105:aload_0         
	// 1664 3106:getfield        #12  <Field azh a>
	// 1665 3109:astore_1        
		abyte0.aS = ((azh) (abyte0)).aS & ~a.br;
	// 1666 3110:aload_1         
	// 1667 3111:aload_1         
	// 1668 3112:getfield        #202 <Field int azh.aS>
	// 1669 3115:aload_0         
	// 1670 3116:getfield        #12  <Field azh a>
	// 1671 3119:getfield        #32  <Field int azh.br>
	// 1672 3122:iconst_m1       
	// 1673 3123:ixor            
	// 1674 3124:iand            
	// 1675 3125:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 1676 3128:aload_0         
	// 1677 3129:getfield        #12  <Field azh a>
	// 1678 3132:astore_1        
		abyte0.aS = ((azh) (abyte0)).bI ^ a.aS;
	// 1679 3133:aload_1         
	// 1680 3134:aload_1         
	// 1681 3135:getfield        #205 <Field int azh.bI>
	// 1682 3138:aload_0         
	// 1683 3139:getfield        #12  <Field azh a>
	// 1684 3142:getfield        #202 <Field int azh.aS>
	// 1685 3145:ixor            
	// 1686 3146:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 1687 3149:aload_0         
	// 1688 3150:getfield        #12  <Field azh a>
	// 1689 3153:astore_1        
		abyte0.aS = ((azh) (abyte0)).aT & ~a.aS;
	// 1690 3154:aload_1         
	// 1691 3155:aload_1         
	// 1692 3156:getfield        #194 <Field int azh.aT>
	// 1693 3159:aload_0         
	// 1694 3160:getfield        #12  <Field azh a>
	// 1695 3163:getfield        #202 <Field int azh.aS>
	// 1696 3166:iconst_m1       
	// 1697 3167:ixor            
	// 1698 3168:iand            
	// 1699 3169:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 1700 3172:aload_0         
	// 1701 3173:getfield        #12  <Field azh a>
	// 1702 3176:astore_1        
		abyte0.bM = ((azh) (abyte0)).br & ~a.bM;
	// 1703 3177:aload_1         
	// 1704 3178:aload_1         
	// 1705 3179:getfield        #32  <Field int azh.br>
	// 1706 3182:aload_0         
	// 1707 3183:getfield        #12  <Field azh a>
	// 1708 3186:getfield        #208 <Field int azh.bM>
	// 1709 3189:iconst_m1       
	// 1710 3190:ixor            
	// 1711 3191:iand            
	// 1712 3192:putfield        #208 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 1713 3195:aload_0         
	// 1714 3196:getfield        #12  <Field azh a>
	// 1715 3199:astore_1        
		abyte0.bM = ((azh) (abyte0)).ch ^ a.bM;
	// 1716 3200:aload_1         
	// 1717 3201:aload_1         
	// 1718 3202:getfield        #211 <Field int azh.ch>
	// 1719 3205:aload_0         
	// 1720 3206:getfield        #12  <Field azh a>
	// 1721 3209:getfield        #208 <Field int azh.bM>
	// 1722 3212:ixor            
	// 1723 3213:putfield        #208 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 1724 3216:aload_0         
	// 1725 3217:getfield        #12  <Field azh a>
	// 1726 3220:astore_1        
		abyte0.bI = ((azh) (abyte0)).aK & ~a.br;
	// 1727 3221:aload_1         
	// 1728 3222:aload_1         
	// 1729 3223:getfield        #188 <Field int azh.aK>
	// 1730 3226:aload_0         
	// 1731 3227:getfield        #12  <Field azh a>
	// 1732 3230:getfield        #32  <Field int azh.br>
	// 1733 3233:iconst_m1       
	// 1734 3234:ixor            
	// 1735 3235:iand            
	// 1736 3236:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 1737 3239:aload_0         
	// 1738 3240:getfield        #12  <Field azh a>
	// 1739 3243:astore_1        
		abyte0.bI = ((azh) (abyte0)).ch ^ a.bI;
	// 1740 3244:aload_1         
	// 1741 3245:aload_1         
	// 1742 3246:getfield        #211 <Field int azh.ch>
	// 1743 3249:aload_0         
	// 1744 3250:getfield        #12  <Field azh a>
	// 1745 3253:getfield        #205 <Field int azh.bI>
	// 1746 3256:ixor            
	// 1747 3257:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 1748 3260:aload_0         
	// 1749 3261:getfield        #12  <Field azh a>
	// 1750 3264:astore_1        
		abyte0.aO = ((azh) (abyte0)).br | a.aO;
	// 1751 3265:aload_1         
	// 1752 3266:aload_1         
	// 1753 3267:getfield        #32  <Field int azh.br>
	// 1754 3270:aload_0         
	// 1755 3271:getfield        #12  <Field azh a>
	// 1756 3274:getfield        #214 <Field int azh.aO>
	// 1757 3277:ior             
	// 1758 3278:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1759 3281:aload_0         
	// 1760 3282:getfield        #12  <Field azh a>
	// 1761 3285:astore_1        
		abyte0.aO = ((azh) (abyte0)).cy ^ a.aO;
	// 1762 3286:aload_1         
	// 1763 3287:aload_1         
	// 1764 3288:getfield        #217 <Field int azh.cy>
	// 1765 3291:aload_0         
	// 1766 3292:getfield        #12  <Field azh a>
	// 1767 3295:getfield        #214 <Field int azh.aO>
	// 1768 3298:ixor            
	// 1769 3299:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1770 3302:aload_0         
	// 1771 3303:getfield        #12  <Field azh a>
	// 1772 3306:astore_1        
		abyte0.aO = ((azh) (abyte0)).aT & ~a.aO;
	// 1773 3307:aload_1         
	// 1774 3308:aload_1         
	// 1775 3309:getfield        #194 <Field int azh.aT>
	// 1776 3312:aload_0         
	// 1777 3313:getfield        #12  <Field azh a>
	// 1778 3316:getfield        #214 <Field int azh.aO>
	// 1779 3319:iconst_m1       
	// 1780 3320:ixor            
	// 1781 3321:iand            
	// 1782 3322:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1783 3325:aload_0         
	// 1784 3326:getfield        #12  <Field azh a>
	// 1785 3329:astore_1        
		abyte0.aO = ((azh) (abyte0)).bM ^ a.aO;
	// 1786 3330:aload_1         
	// 1787 3331:aload_1         
	// 1788 3332:getfield        #208 <Field int azh.bM>
	// 1789 3335:aload_0         
	// 1790 3336:getfield        #12  <Field azh a>
	// 1791 3339:getfield        #214 <Field int azh.aO>
	// 1792 3342:ixor            
	// 1793 3343:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1794 3346:aload_0         
	// 1795 3347:getfield        #12  <Field azh a>
	// 1796 3350:astore_1        
		abyte0.W = ((azh) (abyte0)).br | a.W;
	// 1797 3351:aload_1         
	// 1798 3352:aload_1         
	// 1799 3353:getfield        #32  <Field int azh.br>
	// 1800 3356:aload_0         
	// 1801 3357:getfield        #12  <Field azh a>
	// 1802 3360:getfield        #220 <Field int azh.W>
	// 1803 3363:ior             
	// 1804 3364:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1805 3367:aload_0         
	// 1806 3368:getfield        #12  <Field azh a>
	// 1807 3371:astore_1        
		abyte0.W = ((azh) (abyte0)).R ^ a.W;
	// 1808 3372:aload_1         
	// 1809 3373:aload_1         
	// 1810 3374:getfield        #223 <Field int azh.R>
	// 1811 3377:aload_0         
	// 1812 3378:getfield        #12  <Field azh a>
	// 1813 3381:getfield        #220 <Field int azh.W>
	// 1814 3384:ixor            
	// 1815 3385:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1816 3388:aload_0         
	// 1817 3389:getfield        #12  <Field azh a>
	// 1818 3392:astore_1        
		abyte0.W = ((azh) (abyte0)).W & a.aT;
	// 1819 3393:aload_1         
	// 1820 3394:aload_1         
	// 1821 3395:getfield        #220 <Field int azh.W>
	// 1822 3398:aload_0         
	// 1823 3399:getfield        #12  <Field azh a>
	// 1824 3402:getfield        #194 <Field int azh.aT>
	// 1825 3405:iand            
	// 1826 3406:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1827 3409:aload_0         
	// 1828 3410:getfield        #12  <Field azh a>
	// 1829 3413:astore_1        
		abyte0.W = ((azh) (abyte0)).bI ^ a.W;
	// 1830 3414:aload_1         
	// 1831 3415:aload_1         
	// 1832 3416:getfield        #205 <Field int azh.bI>
	// 1833 3419:aload_0         
	// 1834 3420:getfield        #12  <Field azh a>
	// 1835 3423:getfield        #220 <Field int azh.W>
	// 1836 3426:ixor            
	// 1837 3427:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1838 3430:aload_0         
	// 1839 3431:getfield        #12  <Field azh a>
	// 1840 3434:astore_1        
		abyte0.W = ((azh) (abyte0)).W | a.aF;
	// 1841 3435:aload_1         
	// 1842 3436:aload_1         
	// 1843 3437:getfield        #220 <Field int azh.W>
	// 1844 3440:aload_0         
	// 1845 3441:getfield        #12  <Field azh a>
	// 1846 3444:getfield        #199 <Field int azh.aF>
	// 1847 3447:ior             
	// 1848 3448:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1849 3451:aload_0         
	// 1850 3452:getfield        #12  <Field azh a>
	// 1851 3455:astore_1        
		abyte0.W = ((azh) (abyte0)).aO ^ a.W;
	// 1852 3456:aload_1         
	// 1853 3457:aload_1         
	// 1854 3458:getfield        #214 <Field int azh.aO>
	// 1855 3461:aload_0         
	// 1856 3462:getfield        #12  <Field azh a>
	// 1857 3465:getfield        #220 <Field int azh.W>
	// 1858 3468:ixor            
	// 1859 3469:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1860 3472:aload_0         
	// 1861 3473:getfield        #12  <Field azh a>
	// 1862 3476:astore_1        
		abyte0.bC = ((azh) (abyte0)).W ^ a.bC;
	// 1863 3477:aload_1         
	// 1864 3478:aload_1         
	// 1865 3479:getfield        #220 <Field int azh.W>
	// 1866 3482:aload_0         
	// 1867 3483:getfield        #12  <Field azh a>
	// 1868 3486:getfield        #226 <Field int azh.bC>
	// 1869 3489:ixor            
	// 1870 3490:putfield        #226 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 1871 3493:aload_0         
	// 1872 3494:getfield        #12  <Field azh a>
	// 1873 3497:astore_1        
		abyte0.W = ((azh) (abyte0)).bC & ~a.X;
	// 1874 3498:aload_1         
	// 1875 3499:aload_1         
	// 1876 3500:getfield        #226 <Field int azh.bC>
	// 1877 3503:aload_0         
	// 1878 3504:getfield        #12  <Field azh a>
	// 1879 3507:getfield        #119 <Field int azh.X>
	// 1880 3510:iconst_m1       
	// 1881 3511:ixor            
	// 1882 3512:iand            
	// 1883 3513:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1884 3516:aload_0         
	// 1885 3517:getfield        #12  <Field azh a>
	// 1886 3520:astore_1        
		abyte0.W = ((azh) (abyte0)).aH ^ a.W;
	// 1887 3521:aload_1         
	// 1888 3522:aload_1         
	// 1889 3523:getfield        #74  <Field int azh.aH>
	// 1890 3526:aload_0         
	// 1891 3527:getfield        #12  <Field azh a>
	// 1892 3530:getfield        #220 <Field int azh.W>
	// 1893 3533:ixor            
	// 1894 3534:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1895 3537:aload_0         
	// 1896 3538:getfield        #12  <Field azh a>
	// 1897 3541:astore_1        
		abyte0.W = ((azh) (abyte0)).o & a.W;
	// 1898 3542:aload_1         
	// 1899 3543:aload_1         
	// 1900 3544:getfield        #134 <Field int azh.o>
	// 1901 3547:aload_0         
	// 1902 3548:getfield        #12  <Field azh a>
	// 1903 3551:getfield        #220 <Field int azh.W>
	// 1904 3554:iand            
	// 1905 3555:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1906 3558:aload_0         
	// 1907 3559:getfield        #12  <Field azh a>
	// 1908 3562:astore_1        
		abyte0.aO = ((azh) (abyte0)).bC & ~a.X;
	// 1909 3563:aload_1         
	// 1910 3564:aload_1         
	// 1911 3565:getfield        #226 <Field int azh.bC>
	// 1912 3568:aload_0         
	// 1913 3569:getfield        #12  <Field azh a>
	// 1914 3572:getfield        #119 <Field int azh.X>
	// 1915 3575:iconst_m1       
	// 1916 3576:ixor            
	// 1917 3577:iand            
	// 1918 3578:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1919 3581:aload_0         
	// 1920 3582:getfield        #12  <Field azh a>
	// 1921 3585:astore_1        
		abyte0.aO = ((azh) (abyte0)).X ^ a.aO;
	// 1922 3586:aload_1         
	// 1923 3587:aload_1         
	// 1924 3588:getfield        #119 <Field int azh.X>
	// 1925 3591:aload_0         
	// 1926 3592:getfield        #12  <Field azh a>
	// 1927 3595:getfield        #214 <Field int azh.aO>
	// 1928 3598:ixor            
	// 1929 3599:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1930 3602:aload_0         
	// 1931 3603:getfield        #12  <Field azh a>
	// 1932 3606:astore_1        
		abyte0.W = ((azh) (abyte0)).aO ^ a.W;
	// 1933 3607:aload_1         
	// 1934 3608:aload_1         
	// 1935 3609:getfield        #214 <Field int azh.aO>
	// 1936 3612:aload_0         
	// 1937 3613:getfield        #12  <Field azh a>
	// 1938 3616:getfield        #220 <Field int azh.W>
	// 1939 3619:ixor            
	// 1940 3620:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1941 3623:aload_0         
	// 1942 3624:getfield        #12  <Field azh a>
	// 1943 3627:astore_1        
		abyte0.bI = ((azh) (abyte0)).bC & a.ai;
	// 1944 3628:aload_1         
	// 1945 3629:aload_1         
	// 1946 3630:getfield        #226 <Field int azh.bC>
	// 1947 3633:aload_0         
	// 1948 3634:getfield        #12  <Field azh a>
	// 1949 3637:getfield        #128 <Field int azh.ai>
	// 1950 3640:iand            
	// 1951 3641:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 1952 3644:aload_0         
	// 1953 3645:getfield        #12  <Field azh a>
	// 1954 3648:astore_1        
		abyte0.bI = ((azh) (abyte0)).aw ^ a.bI;
	// 1955 3649:aload_1         
	// 1956 3650:aload_1         
	// 1957 3651:getfield        #71  <Field int azh.aw>
	// 1958 3654:aload_0         
	// 1959 3655:getfield        #12  <Field azh a>
	// 1960 3658:getfield        #205 <Field int azh.bI>
	// 1961 3661:ixor            
	// 1962 3662:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 1963 3665:aload_0         
	// 1964 3666:getfield        #12  <Field azh a>
	// 1965 3669:astore_1        
		abyte0.aM = ((azh) (abyte0)).bI ^ a.aM;
	// 1966 3670:aload_1         
	// 1967 3671:aload_1         
	// 1968 3672:getfield        #205 <Field int azh.bI>
	// 1969 3675:aload_0         
	// 1970 3676:getfield        #12  <Field azh a>
	// 1971 3679:getfield        #116 <Field int azh.aM>
	// 1972 3682:ixor            
	// 1973 3683:putfield        #116 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 1974 3686:aload_0         
	// 1975 3687:getfield        #12  <Field azh a>
	// 1976 3690:astore_1        
		abyte0.R = ((azh) (abyte0)).bC & ~a.ai;
	// 1977 3691:aload_1         
	// 1978 3692:aload_1         
	// 1979 3693:getfield        #226 <Field int azh.bC>
	// 1980 3696:aload_0         
	// 1981 3697:getfield        #12  <Field azh a>
	// 1982 3700:getfield        #128 <Field int azh.ai>
	// 1983 3703:iconst_m1       
	// 1984 3704:ixor            
	// 1985 3705:iand            
	// 1986 3706:putfield        #223 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 1987 3709:aload_0         
	// 1988 3710:getfield        #12  <Field azh a>
	// 1989 3713:astore_1        
		abyte0.bM = ((azh) (abyte0)).R & ~a.o;
	// 1990 3714:aload_1         
	// 1991 3715:aload_1         
	// 1992 3716:getfield        #223 <Field int azh.R>
	// 1993 3719:aload_0         
	// 1994 3720:getfield        #12  <Field azh a>
	// 1995 3723:getfield        #134 <Field int azh.o>
	// 1996 3726:iconst_m1       
	// 1997 3727:ixor            
	// 1998 3728:iand            
	// 1999 3729:putfield        #208 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 2000 3732:aload_0         
	// 2001 3733:getfield        #12  <Field azh a>
	// 2002 3736:astore_1        
		abyte0.bM = ((azh) (abyte0)).bI ^ a.bM;
	// 2003 3737:aload_1         
	// 2004 3738:aload_1         
	// 2005 3739:getfield        #205 <Field int azh.bI>
	// 2006 3742:aload_0         
	// 2007 3743:getfield        #12  <Field azh a>
	// 2008 3746:getfield        #208 <Field int azh.bM>
	// 2009 3749:ixor            
	// 2010 3750:putfield        #208 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 2011 3753:aload_0         
	// 2012 3754:getfield        #12  <Field azh a>
	// 2013 3757:astore_1        
		abyte0.R = ((azh) (abyte0)).o | a.R;
	// 2014 3758:aload_1         
	// 2015 3759:aload_1         
	// 2016 3760:getfield        #134 <Field int azh.o>
	// 2017 3763:aload_0         
	// 2018 3764:getfield        #12  <Field azh a>
	// 2019 3767:getfield        #223 <Field int azh.R>
	// 2020 3770:ior             
	// 2021 3771:putfield        #223 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 2022 3774:aload_0         
	// 2023 3775:getfield        #12  <Field azh a>
	// 2024 3778:astore_1        
		abyte0.R = ((azh) (abyte0)).aO ^ a.R;
	// 2025 3779:aload_1         
	// 2026 3780:aload_1         
	// 2027 3781:getfield        #214 <Field int azh.aO>
	// 2028 3784:aload_0         
	// 2029 3785:getfield        #12  <Field azh a>
	// 2030 3788:getfield        #223 <Field int azh.R>
	// 2031 3791:ixor            
	// 2032 3792:putfield        #223 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 2033 3795:aload_0         
	// 2034 3796:getfield        #12  <Field azh a>
	// 2035 3799:astore_1        
		abyte0.aO = ((azh) (abyte0)).bC & ~a.bp;
	// 2036 3800:aload_1         
	// 2037 3801:aload_1         
	// 2038 3802:getfield        #226 <Field int azh.bC>
	// 2039 3805:aload_0         
	// 2040 3806:getfield        #12  <Field azh a>
	// 2041 3809:getfield        #89  <Field int azh.bp>
	// 2042 3812:iconst_m1       
	// 2043 3813:ixor            
	// 2044 3814:iand            
	// 2045 3815:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2046 3818:aload_0         
	// 2047 3819:getfield        #12  <Field azh a>
	// 2048 3822:astore_1        
		abyte0.aO = ((azh) (abyte0)).bp ^ a.aO;
	// 2049 3823:aload_1         
	// 2050 3824:aload_1         
	// 2051 3825:getfield        #89  <Field int azh.bp>
	// 2052 3828:aload_0         
	// 2053 3829:getfield        #12  <Field azh a>
	// 2054 3832:getfield        #214 <Field int azh.aO>
	// 2055 3835:ixor            
	// 2056 3836:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2057 3839:aload_0         
	// 2058 3840:getfield        #12  <Field azh a>
	// 2059 3843:astore_1        
		abyte0.aO = ((azh) (abyte0)).aO | a.o;
	// 2060 3844:aload_1         
	// 2061 3845:aload_1         
	// 2062 3846:getfield        #214 <Field int azh.aO>
	// 2063 3849:aload_0         
	// 2064 3850:getfield        #12  <Field azh a>
	// 2065 3853:getfield        #134 <Field int azh.o>
	// 2066 3856:ior             
	// 2067 3857:putfield        #214 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2068 3860:aload_0         
	// 2069 3861:getfield        #12  <Field azh a>
	// 2070 3864:astore_1        
		abyte0.bI = ((azh) (abyte0)).bC & a.bp;
	// 2071 3865:aload_1         
	// 2072 3866:aload_1         
	// 2073 3867:getfield        #226 <Field int azh.bC>
	// 2074 3870:aload_0         
	// 2075 3871:getfield        #12  <Field azh a>
	// 2076 3874:getfield        #89  <Field int azh.bp>
	// 2077 3877:iand            
	// 2078 3878:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2079 3881:aload_0         
	// 2080 3882:getfield        #12  <Field azh a>
	// 2081 3885:astore_1        
		abyte0.bI = ((azh) (abyte0)).i ^ a.bI;
	// 2082 3886:aload_1         
	// 2083 3887:aload_1         
	// 2084 3888:getfield        #122 <Field int azh.i>
	// 2085 3891:aload_0         
	// 2086 3892:getfield        #12  <Field azh a>
	// 2087 3895:getfield        #205 <Field int azh.bI>
	// 2088 3898:ixor            
	// 2089 3899:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2090 3902:aload_0         
	// 2091 3903:getfield        #12  <Field azh a>
	// 2092 3906:astore_1        
		abyte0.cy = ((azh) (abyte0)).bC & a.X;
	// 2093 3907:aload_1         
	// 2094 3908:aload_1         
	// 2095 3909:getfield        #226 <Field int azh.bC>
	// 2096 3912:aload_0         
	// 2097 3913:getfield        #12  <Field azh a>
	// 2098 3916:getfield        #119 <Field int azh.X>
	// 2099 3919:iand            
	// 2100 3920:putfield        #217 <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 2101 3923:aload_0         
	// 2102 3924:getfield        #12  <Field azh a>
	// 2103 3927:astore_1        
		abyte0.cy = ((azh) (abyte0)).aw ^ a.cy;
	// 2104 3928:aload_1         
	// 2105 3929:aload_1         
	// 2106 3930:getfield        #71  <Field int azh.aw>
	// 2107 3933:aload_0         
	// 2108 3934:getfield        #12  <Field azh a>
	// 2109 3937:getfield        #217 <Field int azh.cy>
	// 2110 3940:ixor            
	// 2111 3941:putfield        #217 <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 2112 3944:aload_0         
	// 2113 3945:getfield        #12  <Field azh a>
	// 2114 3948:astore_1        
		abyte0.aw = ((azh) (abyte0)).bC & ~a.am;
	// 2115 3949:aload_1         
	// 2116 3950:aload_1         
	// 2117 3951:getfield        #226 <Field int azh.bC>
	// 2118 3954:aload_0         
	// 2119 3955:getfield        #12  <Field azh a>
	// 2120 3958:getfield        #131 <Field int azh.am>
	// 2121 3961:iconst_m1       
	// 2122 3962:ixor            
	// 2123 3963:iand            
	// 2124 3964:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 2125 3967:aload_0         
	// 2126 3968:getfield        #12  <Field azh a>
	// 2127 3971:astore_1        
		abyte0.aw = ((azh) (abyte0)).am ^ a.aw;
	// 2128 3972:aload_1         
	// 2129 3973:aload_1         
	// 2130 3974:getfield        #131 <Field int azh.am>
	// 2131 3977:aload_0         
	// 2132 3978:getfield        #12  <Field azh a>
	// 2133 3981:getfield        #71  <Field int azh.aw>
	// 2134 3984:ixor            
	// 2135 3985:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 2136 3988:aload_0         
	// 2137 3989:getfield        #12  <Field azh a>
	// 2138 3992:astore_1        
		abyte0.ch = ((azh) (abyte0)).bC & ~a.am;
	// 2139 3993:aload_1         
	// 2140 3994:aload_1         
	// 2141 3995:getfield        #226 <Field int azh.bC>
	// 2142 3998:aload_0         
	// 2143 3999:getfield        #12  <Field azh a>
	// 2144 4002:getfield        #131 <Field int azh.am>
	// 2145 4005:iconst_m1       
	// 2146 4006:ixor            
	// 2147 4007:iand            
	// 2148 4008:putfield        #211 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2149 4011:aload_0         
	// 2150 4012:getfield        #12  <Field azh a>
	// 2151 4015:astore_1        
		abyte0.ch = ((azh) (abyte0)).ch & ~a.o;
	// 2152 4016:aload_1         
	// 2153 4017:aload_1         
	// 2154 4018:getfield        #211 <Field int azh.ch>
	// 2155 4021:aload_0         
	// 2156 4022:getfield        #12  <Field azh a>
	// 2157 4025:getfield        #134 <Field int azh.o>
	// 2158 4028:iconst_m1       
	// 2159 4029:ixor            
	// 2160 4030:iand            
	// 2161 4031:putfield        #211 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2162 4034:aload_0         
	// 2163 4035:getfield        #12  <Field azh a>
	// 2164 4038:astore_1        
		abyte0.ch = ((azh) (abyte0)).aw ^ a.ch;
	// 2165 4039:aload_1         
	// 2166 4040:aload_1         
	// 2167 4041:getfield        #71  <Field int azh.aw>
	// 2168 4044:aload_0         
	// 2169 4045:getfield        #12  <Field azh a>
	// 2170 4048:getfield        #211 <Field int azh.ch>
	// 2171 4051:ixor            
	// 2172 4052:putfield        #211 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2173 4055:aload_0         
	// 2174 4056:getfield        #12  <Field azh a>
	// 2175 4059:astore_1        
		abyte0.aw = ((azh) (abyte0)).bC & a.ai;
	// 2176 4060:aload_1         
	// 2177 4061:aload_1         
	// 2178 4062:getfield        #226 <Field int azh.bC>
	// 2179 4065:aload_0         
	// 2180 4066:getfield        #12  <Field azh a>
	// 2181 4069:getfield        #128 <Field int azh.ai>
	// 2182 4072:iand            
	// 2183 4073:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 2184 4076:aload_0         
	// 2185 4077:getfield        #12  <Field azh a>
	// 2186 4080:astore_1        
		abyte0.a = ((azh) (abyte0)).bC & a.aH;
	// 2187 4081:aload_1         
	// 2188 4082:aload_1         
	// 2189 4083:getfield        #226 <Field int azh.bC>
	// 2190 4086:aload_0         
	// 2191 4087:getfield        #12  <Field azh a>
	// 2192 4090:getfield        #74  <Field int azh.aH>
	// 2193 4093:iand            
	// 2194 4094:putfield        #196 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 2195 4097:aload_0         
	// 2196 4098:getfield        #12  <Field azh a>
	// 2197 4101:astore_1        
		abyte0.a = ((azh) (abyte0)).am ^ a.a;
	// 2198 4102:aload_1         
	// 2199 4103:aload_1         
	// 2200 4104:getfield        #131 <Field int azh.am>
	// 2201 4107:aload_0         
	// 2202 4108:getfield        #12  <Field azh a>
	// 2203 4111:getfield        #196 <Field int azh.a>
	// 2204 4114:ixor            
	// 2205 4115:putfield        #196 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 2206 4118:aload_0         
	// 2207 4119:getfield        #12  <Field azh a>
	// 2208 4122:astore_1        
		abyte0.bv = ((azh) (abyte0)).bC & ~a.ai;
	// 2209 4123:aload_1         
	// 2210 4124:aload_1         
	// 2211 4125:getfield        #226 <Field int azh.bC>
	// 2212 4128:aload_0         
	// 2213 4129:getfield        #12  <Field azh a>
	// 2214 4132:getfield        #128 <Field int azh.ai>
	// 2215 4135:iconst_m1       
	// 2216 4136:ixor            
	// 2217 4137:iand            
	// 2218 4138:putfield        #191 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2219 4141:aload_0         
	// 2220 4142:getfield        #12  <Field azh a>
	// 2221 4145:astore_1        
		abyte0.bv = ((azh) (abyte0)).aH ^ a.bv;
	// 2222 4146:aload_1         
	// 2223 4147:aload_1         
	// 2224 4148:getfield        #74  <Field int azh.aH>
	// 2225 4151:aload_0         
	// 2226 4152:getfield        #12  <Field azh a>
	// 2227 4155:getfield        #191 <Field int azh.bv>
	// 2228 4158:ixor            
	// 2229 4159:putfield        #191 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2230 4162:aload_0         
	// 2231 4163:getfield        #12  <Field azh a>
	// 2232 4166:astore_1        
		abyte0.cF = ((azh) (abyte0)).bC & a.i;
	// 2233 4167:aload_1         
	// 2234 4168:aload_1         
	// 2235 4169:getfield        #226 <Field int azh.bC>
	// 2236 4172:aload_0         
	// 2237 4173:getfield        #12  <Field azh a>
	// 2238 4176:getfield        #122 <Field int azh.i>
	// 2239 4179:iand            
	// 2240 4180:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	// 2241 4183:aload_0         
	// 2242 4184:getfield        #12  <Field azh a>
	// 2243 4187:astore_1        
		abyte0.bB = ((azh) (abyte0)).bC & a.am;
	// 2244 4188:aload_1         
	// 2245 4189:aload_1         
	// 2246 4190:getfield        #226 <Field int azh.bC>
	// 2247 4193:aload_0         
	// 2248 4194:getfield        #12  <Field azh a>
	// 2249 4197:getfield        #131 <Field int azh.am>
	// 2250 4200:iand            
	// 2251 4201:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 2252 4204:aload_0         
	// 2253 4205:getfield        #12  <Field azh a>
	// 2254 4208:astore_1        
		abyte0.bB = ((azh) (abyte0)).i ^ a.bB;
	// 2255 4209:aload_1         
	// 2256 4210:aload_1         
	// 2257 4211:getfield        #122 <Field int azh.i>
	// 2258 4214:aload_0         
	// 2259 4215:getfield        #12  <Field azh a>
	// 2260 4218:getfield        #56  <Field int azh.bB>
	// 2261 4221:ixor            
	// 2262 4222:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 2263 4225:aload_0         
	// 2264 4226:getfield        #12  <Field azh a>
	// 2265 4229:astore_1        
		abyte0.bB = ((azh) (abyte0)).bB & ~a.o;
	// 2266 4230:aload_1         
	// 2267 4231:aload_1         
	// 2268 4232:getfield        #56  <Field int azh.bB>
	// 2269 4235:aload_0         
	// 2270 4236:getfield        #12  <Field azh a>
	// 2271 4239:getfield        #134 <Field int azh.o>
	// 2272 4242:iconst_m1       
	// 2273 4243:ixor            
	// 2274 4244:iand            
	// 2275 4245:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 2276 4248:aload_0         
	// 2277 4249:getfield        #12  <Field azh a>
	// 2278 4252:astore_1        
		abyte0.bB = ((azh) (abyte0)).cy ^ a.bB;
	// 2279 4253:aload_1         
	// 2280 4254:aload_1         
	// 2281 4255:getfield        #217 <Field int azh.cy>
	// 2282 4258:aload_0         
	// 2283 4259:getfield        #12  <Field azh a>
	// 2284 4262:getfield        #56  <Field int azh.bB>
	// 2285 4265:ixor            
	// 2286 4266:putfield        #56  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 2287 4269:aload_0         
	// 2288 4270:getfield        #12  <Field azh a>
	// 2289 4273:astore_1        
		abyte0.cy = ((azh) (abyte0)).X ^ a.bC;
	// 2290 4274:aload_1         
	// 2291 4275:aload_1         
	// 2292 4276:getfield        #119 <Field int azh.X>
	// 2293 4279:aload_0         
	// 2294 4280:getfield        #12  <Field azh a>
	// 2295 4283:getfield        #226 <Field int azh.bC>
	// 2296 4286:ixor            
	// 2297 4287:putfield        #217 <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 2298 4290:aload_0         
	// 2299 4291:getfield        #12  <Field azh a>
	// 2300 4294:astore_1        
		abyte0.cy = ((azh) (abyte0)).cy ^ a.o;
	// 2301 4295:aload_1         
	// 2302 4296:aload_1         
	// 2303 4297:getfield        #217 <Field int azh.cy>
	// 2304 4300:aload_0         
	// 2305 4301:getfield        #12  <Field azh a>
	// 2306 4304:getfield        #134 <Field int azh.o>
	// 2307 4307:ixor            
	// 2308 4308:putfield        #217 <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 2309 4311:aload_0         
	// 2310 4312:getfield        #12  <Field azh a>
	// 2311 4315:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw ^ a.bC;
	// 2312 4316:aload_1         
	// 2313 4317:aload_1         
	// 2314 4318:getfield        #113 <Field int azh.bw>
	// 2315 4321:aload_0         
	// 2316 4322:getfield        #12  <Field azh a>
	// 2317 4325:getfield        #226 <Field int azh.bC>
	// 2318 4328:ixor            
	// 2319 4329:putfield        #113 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2320 4332:aload_0         
	// 2321 4333:getfield        #12  <Field azh a>
	// 2322 4336:astore_1        
		abyte0.bw = ((azh) (abyte0)).o & ~a.bw;
	// 2323 4337:aload_1         
	// 2324 4338:aload_1         
	// 2325 4339:getfield        #134 <Field int azh.o>
	// 2326 4342:aload_0         
	// 2327 4343:getfield        #12  <Field azh a>
	// 2328 4346:getfield        #113 <Field int azh.bw>
	// 2329 4349:iconst_m1       
	// 2330 4350:ixor            
	// 2331 4351:iand            
	// 2332 4352:putfield        #113 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2333 4355:aload_0         
	// 2334 4356:getfield        #12  <Field azh a>
	// 2335 4359:astore_1        
		abyte0.bw = ((azh) (abyte0)).aw ^ a.bw;
	// 2336 4360:aload_1         
	// 2337 4361:aload_1         
	// 2338 4362:getfield        #71  <Field int azh.aw>
	// 2339 4365:aload_0         
	// 2340 4366:getfield        #12  <Field azh a>
	// 2341 4369:getfield        #113 <Field int azh.bw>
	// 2342 4372:ixor            
	// 2343 4373:putfield        #113 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2344 4376:aload_0         
	// 2345 4377:getfield        #12  <Field azh a>
	// 2346 4380:astore_1        
		abyte0.bp = ((azh) (abyte0)).bC & ~a.bp;
	// 2347 4381:aload_1         
	// 2348 4382:aload_1         
	// 2349 4383:getfield        #226 <Field int azh.bC>
	// 2350 4386:aload_0         
	// 2351 4387:getfield        #12  <Field azh a>
	// 2352 4390:getfield        #89  <Field int azh.bp>
	// 2353 4393:iconst_m1       
	// 2354 4394:ixor            
	// 2355 4395:iand            
	// 2356 4396:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 2357 4399:aload_0         
	// 2358 4400:getfield        #12  <Field azh a>
	// 2359 4403:astore_1        
		abyte0.bp = ((azh) (abyte0)).o | a.bp;
	// 2360 4404:aload_1         
	// 2361 4405:aload_1         
	// 2362 4406:getfield        #134 <Field int azh.o>
	// 2363 4409:aload_0         
	// 2364 4410:getfield        #12  <Field azh a>
	// 2365 4413:getfield        #89  <Field int azh.bp>
	// 2366 4416:ior             
	// 2367 4417:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 2368 4420:aload_0         
	// 2369 4421:getfield        #12  <Field azh a>
	// 2370 4424:astore_1        
		abyte0.bp = ((azh) (abyte0)).a ^ a.bp;
	// 2371 4425:aload_1         
	// 2372 4426:aload_1         
	// 2373 4427:getfield        #196 <Field int azh.a>
	// 2374 4430:aload_0         
	// 2375 4431:getfield        #12  <Field azh a>
	// 2376 4434:getfield        #89  <Field int azh.bp>
	// 2377 4437:ixor            
	// 2378 4438:putfield        #89  <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 2379 4441:aload_0         
	// 2380 4442:getfield        #12  <Field azh a>
	// 2381 4445:astore_1        
		abyte0.ai = ((azh) (abyte0)).bC & a.ai;
	// 2382 4446:aload_1         
	// 2383 4447:aload_1         
	// 2384 4448:getfield        #226 <Field int azh.bC>
	// 2385 4451:aload_0         
	// 2386 4452:getfield        #12  <Field azh a>
	// 2387 4455:getfield        #128 <Field int azh.ai>
	// 2388 4458:iand            
	// 2389 4459:putfield        #128 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 2390 4462:aload_0         
	// 2391 4463:getfield        #12  <Field azh a>
	// 2392 4466:astore_1        
		abyte0.ai = ((azh) (abyte0)).am ^ a.ai;
	// 2393 4467:aload_1         
	// 2394 4468:aload_1         
	// 2395 4469:getfield        #131 <Field int azh.am>
	// 2396 4472:aload_0         
	// 2397 4473:getfield        #12  <Field azh a>
	// 2398 4476:getfield        #128 <Field int azh.ai>
	// 2399 4479:ixor            
	// 2400 4480:putfield        #128 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 2401 4483:aload_0         
	// 2402 4484:getfield        #12  <Field azh a>
	// 2403 4487:astore_1        
		abyte0.ai = ((azh) (abyte0)).o & a.ai;
	// 2404 4488:aload_1         
	// 2405 4489:aload_1         
	// 2406 4490:getfield        #134 <Field int azh.o>
	// 2407 4493:aload_0         
	// 2408 4494:getfield        #12  <Field azh a>
	// 2409 4497:getfield        #128 <Field int azh.ai>
	// 2410 4500:iand            
	// 2411 4501:putfield        #128 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 2412 4504:aload_0         
	// 2413 4505:getfield        #12  <Field azh a>
	// 2414 4508:astore_1        
		abyte0.ai = ((azh) (abyte0)).aw ^ a.ai;
	// 2415 4509:aload_1         
	// 2416 4510:aload_1         
	// 2417 4511:getfield        #71  <Field int azh.aw>
	// 2418 4514:aload_0         
	// 2419 4515:getfield        #12  <Field azh a>
	// 2420 4518:getfield        #128 <Field int azh.ai>
	// 2421 4521:ixor            
	// 2422 4522:putfield        #128 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 2423 4525:aload_0         
	// 2424 4526:getfield        #12  <Field azh a>
	// 2425 4529:astore_1        
		abyte0.aK = ((azh) (abyte0)).aK ^ a.br;
	// 2426 4530:aload_1         
	// 2427 4531:aload_1         
	// 2428 4532:getfield        #188 <Field int azh.aK>
	// 2429 4535:aload_0         
	// 2430 4536:getfield        #12  <Field azh a>
	// 2431 4539:getfield        #32  <Field int azh.br>
	// 2432 4542:ixor            
	// 2433 4543:putfield        #188 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2434 4546:aload_0         
	// 2435 4547:getfield        #12  <Field azh a>
	// 2436 4550:astore_1        
		abyte0.aS = ((azh) (abyte0)).aK ^ a.aS;
	// 2437 4551:aload_1         
	// 2438 4552:aload_1         
	// 2439 4553:getfield        #188 <Field int azh.aK>
	// 2440 4556:aload_0         
	// 2441 4557:getfield        #12  <Field azh a>
	// 2442 4560:getfield        #202 <Field int azh.aS>
	// 2443 4563:ixor            
	// 2444 4564:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2445 4567:aload_0         
	// 2446 4568:getfield        #12  <Field azh a>
	// 2447 4571:astore_1        
		abyte0.aK = ((azh) (abyte0)).br | a.cz;
	// 2448 4572:aload_1         
	// 2449 4573:aload_1         
	// 2450 4574:getfield        #32  <Field int azh.br>
	// 2451 4577:aload_0         
	// 2452 4578:getfield        #12  <Field azh a>
	// 2453 4581:getfield        #229 <Field int azh.cz>
	// 2454 4584:ior             
	// 2455 4585:putfield        #188 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2456 4588:aload_0         
	// 2457 4589:getfield        #12  <Field azh a>
	// 2458 4592:astore_1        
		abyte0.aK = ((azh) (abyte0)).s ^ a.aK;
	// 2459 4593:aload_1         
	// 2460 4594:aload_1         
	// 2461 4595:getfield        #232 <Field int azh.s>
	// 2462 4598:aload_0         
	// 2463 4599:getfield        #12  <Field azh a>
	// 2464 4602:getfield        #188 <Field int azh.aK>
	// 2465 4605:ixor            
	// 2466 4606:putfield        #188 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2467 4609:aload_0         
	// 2468 4610:getfield        #12  <Field azh a>
	// 2469 4613:astore_1        
		abyte0.bL = ((azh) (abyte0)).aK ^ a.bL;
	// 2470 4614:aload_1         
	// 2471 4615:aload_1         
	// 2472 4616:getfield        #188 <Field int azh.aK>
	// 2473 4619:aload_0         
	// 2474 4620:getfield        #12  <Field azh a>
	// 2475 4623:getfield        #235 <Field int azh.bL>
	// 2476 4626:ixor            
	// 2477 4627:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2478 4630:aload_0         
	// 2479 4631:getfield        #12  <Field azh a>
	// 2480 4634:astore_1        
		abyte0.bL = ((azh) (abyte0)).bL & ~a.aF;
	// 2481 4635:aload_1         
	// 2482 4636:aload_1         
	// 2483 4637:getfield        #235 <Field int azh.bL>
	// 2484 4640:aload_0         
	// 2485 4641:getfield        #12  <Field azh a>
	// 2486 4644:getfield        #199 <Field int azh.aF>
	// 2487 4647:iconst_m1       
	// 2488 4648:ixor            
	// 2489 4649:iand            
	// 2490 4650:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2491 4653:aload_0         
	// 2492 4654:getfield        #12  <Field azh a>
	// 2493 4657:astore_1        
		abyte0.aK = ((azh) (abyte0)).cA & ~a.br;
	// 2494 4658:aload_1         
	// 2495 4659:aload_1         
	// 2496 4660:getfield        #238 <Field int azh.cA>
	// 2497 4663:aload_0         
	// 2498 4664:getfield        #12  <Field azh a>
	// 2499 4667:getfield        #32  <Field int azh.br>
	// 2500 4670:iconst_m1       
	// 2501 4671:ixor            
	// 2502 4672:iand            
	// 2503 4673:putfield        #188 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2504 4676:aload_0         
	// 2505 4677:getfield        #12  <Field azh a>
	// 2506 4680:astore_1        
		abyte0.aK = ((azh) (abyte0)).cC ^ a.aK;
	// 2507 4681:aload_1         
	// 2508 4682:aload_1         
	// 2509 4683:getfield        #241 <Field int azh.cC>
	// 2510 4686:aload_0         
	// 2511 4687:getfield        #12  <Field azh a>
	// 2512 4690:getfield        #188 <Field int azh.aK>
	// 2513 4693:ixor            
	// 2514 4694:putfield        #188 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2515 4697:aload_0         
	// 2516 4698:getfield        #12  <Field azh a>
	// 2517 4701:astore_1        
		abyte0.ci = ((azh) (abyte0)).aK ^ a.ci;
	// 2518 4702:aload_1         
	// 2519 4703:aload_1         
	// 2520 4704:getfield        #188 <Field int azh.aK>
	// 2521 4707:aload_0         
	// 2522 4708:getfield        #12  <Field azh a>
	// 2523 4711:getfield        #50  <Field int azh.ci>
	// 2524 4714:ixor            
	// 2525 4715:putfield        #50  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2526 4718:aload_0         
	// 2527 4719:getfield        #12  <Field azh a>
	// 2528 4722:astore_1        
		abyte0.aK = ~((azh) (abyte0)).ci;
	// 2529 4723:aload_1         
	// 2530 4724:aload_1         
	// 2531 4725:getfield        #50  <Field int azh.ci>
	// 2532 4728:iconst_m1       
	// 2533 4729:ixor            
	// 2534 4730:putfield        #188 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2535 4733:aload_0         
	// 2536 4734:getfield        #12  <Field azh a>
	// 2537 4737:astore_1        
		abyte0.s = ((azh) (abyte0)).aJ & a.br;
	// 2538 4738:aload_1         
	// 2539 4739:aload_1         
	// 2540 4740:getfield        #244 <Field int azh.aJ>
	// 2541 4743:aload_0         
	// 2542 4744:getfield        #12  <Field azh a>
	// 2543 4747:getfield        #32  <Field int azh.br>
	// 2544 4750:iand            
	// 2545 4751:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2546 4754:aload_0         
	// 2547 4755:getfield        #12  <Field azh a>
	// 2548 4758:astore_1        
		abyte0.s = ((azh) (abyte0)).af ^ a.s;
	// 2549 4759:aload_1         
	// 2550 4760:aload_1         
	// 2551 4761:getfield        #247 <Field int azh.af>
	// 2552 4764:aload_0         
	// 2553 4765:getfield        #12  <Field azh a>
	// 2554 4768:getfield        #232 <Field int azh.s>
	// 2555 4771:ixor            
	// 2556 4772:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2557 4775:aload_0         
	// 2558 4776:getfield        #12  <Field azh a>
	// 2559 4779:astore_1        
		abyte0.I = ((azh) (abyte0)).s ^ a.I;
	// 2560 4780:aload_1         
	// 2561 4781:aload_1         
	// 2562 4782:getfield        #232 <Field int azh.s>
	// 2563 4785:aload_0         
	// 2564 4786:getfield        #12  <Field azh a>
	// 2565 4789:getfield        #249 <Field int azh.I>
	// 2566 4792:ixor            
	// 2567 4793:putfield        #249 <Field int azh.I>
		abyte0 = ((byte []) (a));
	// 2568 4796:aload_0         
	// 2569 4797:getfield        #12  <Field azh a>
	// 2570 4800:astore_1        
		abyte0.s = ((azh) (abyte0)).I & ~a.bu;
	// 2571 4801:aload_1         
	// 2572 4802:aload_1         
	// 2573 4803:getfield        #249 <Field int azh.I>
	// 2574 4806:aload_0         
	// 2575 4807:getfield        #12  <Field azh a>
	// 2576 4810:getfield        #179 <Field int azh.bu>
	// 2577 4813:iconst_m1       
	// 2578 4814:ixor            
	// 2579 4815:iand            
	// 2580 4816:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2581 4819:aload_0         
	// 2582 4820:getfield        #12  <Field azh a>
	// 2583 4823:astore_1        
		abyte0.a = ((azh) (abyte0)).bu & ~a.I;
	// 2584 4824:aload_1         
	// 2585 4825:aload_1         
	// 2586 4826:getfield        #179 <Field int azh.bu>
	// 2587 4829:aload_0         
	// 2588 4830:getfield        #12  <Field azh a>
	// 2589 4833:getfield        #249 <Field int azh.I>
	// 2590 4836:iconst_m1       
	// 2591 4837:ixor            
	// 2592 4838:iand            
	// 2593 4839:putfield        #196 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 2594 4842:aload_0         
	// 2595 4843:getfield        #12  <Field azh a>
	// 2596 4846:astore_1        
		abyte0.i = ((azh) (abyte0)).I & a.bu;
	// 2597 4847:aload_1         
	// 2598 4848:aload_1         
	// 2599 4849:getfield        #249 <Field int azh.I>
	// 2600 4852:aload_0         
	// 2601 4853:getfield        #12  <Field azh a>
	// 2602 4856:getfield        #179 <Field int azh.bu>
	// 2603 4859:iand            
	// 2604 4860:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 2605 4863:aload_0         
	// 2606 4864:getfield        #12  <Field azh a>
	// 2607 4867:astore_1        
		abyte0.cj = ((azh) (abyte0)).bu & ~a.i;
	// 2608 4868:aload_1         
	// 2609 4869:aload_1         
	// 2610 4870:getfield        #179 <Field int azh.bu>
	// 2611 4873:aload_0         
	// 2612 4874:getfield        #12  <Field azh a>
	// 2613 4877:getfield        #122 <Field int azh.i>
	// 2614 4880:iconst_m1       
	// 2615 4881:ixor            
	// 2616 4882:iand            
	// 2617 4883:putfield        #173 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 2618 4886:aload_0         
	// 2619 4887:getfield        #12  <Field azh a>
	// 2620 4890:astore_1        
		abyte0.bt = ((azh) (abyte0)).I ^ a.bu;
	// 2621 4891:aload_1         
	// 2622 4892:aload_1         
	// 2623 4893:getfield        #249 <Field int azh.I>
	// 2624 4896:aload_0         
	// 2625 4897:getfield        #12  <Field azh a>
	// 2626 4900:getfield        #179 <Field int azh.bu>
	// 2627 4903:ixor            
	// 2628 4904:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 2629 4907:aload_0         
	// 2630 4908:getfield        #12  <Field azh a>
	// 2631 4911:astore_1        
		abyte0.r = ((azh) (abyte0)).bt & a.Q;
	// 2632 4912:aload_1         
	// 2633 4913:aload_1         
	// 2634 4914:getfield        #41  <Field int azh.bt>
	// 2635 4917:aload_0         
	// 2636 4918:getfield        #12  <Field azh a>
	// 2637 4921:getfield        #176 <Field int azh.Q>
	// 2638 4924:iand            
	// 2639 4925:putfield        #161 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 2640 4928:aload_0         
	// 2641 4929:getfield        #12  <Field azh a>
	// 2642 4932:astore_1        
		abyte0.cm = ~((azh) (abyte0)).I;
	// 2643 4933:aload_1         
	// 2644 4934:aload_1         
	// 2645 4935:getfield        #249 <Field int azh.I>
	// 2646 4938:iconst_m1       
	// 2647 4939:ixor            
	// 2648 4940:putfield        #155 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 2649 4943:aload_0         
	// 2650 4944:getfield        #12  <Field azh a>
	// 2651 4947:astore_1        
		abyte0.aR = ((azh) (abyte0)).I | a.bu;
	// 2652 4948:aload_1         
	// 2653 4949:aload_1         
	// 2654 4950:getfield        #249 <Field int azh.I>
	// 2655 4953:aload_0         
	// 2656 4954:getfield        #12  <Field azh a>
	// 2657 4957:getfield        #179 <Field int azh.bu>
	// 2658 4960:ior             
	// 2659 4961:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 2660 4964:aload_0         
	// 2661 4965:getfield        #12  <Field azh a>
	// 2662 4968:astore_1        
		abyte0.cv = ((azh) (abyte0)).aR & ~a.bu;
	// 2663 4969:aload_1         
	// 2664 4970:aload_1         
	// 2665 4971:getfield        #26  <Field int azh.aR>
	// 2666 4974:aload_0         
	// 2667 4975:getfield        #12  <Field azh a>
	// 2668 4978:getfield        #179 <Field int azh.bu>
	// 2669 4981:iconst_m1       
	// 2670 4982:ixor            
	// 2671 4983:iand            
	// 2672 4984:putfield        #44  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	// 2673 4987:aload_0         
	// 2674 4988:getfield        #12  <Field azh a>
	// 2675 4991:astore_1        
		abyte0.cb = ((azh) (abyte0)).br | a.cb;
	// 2676 4992:aload_1         
	// 2677 4993:aload_1         
	// 2678 4994:getfield        #32  <Field int azh.br>
	// 2679 4997:aload_0         
	// 2680 4998:getfield        #12  <Field azh a>
	// 2681 5001:getfield        #252 <Field int azh.cb>
	// 2682 5004:ior             
	// 2683 5005:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2684 5008:aload_0         
	// 2685 5009:getfield        #12  <Field azh a>
	// 2686 5012:astore_1        
		abyte0.cb = ((azh) (abyte0)).bk ^ a.cb;
	// 2687 5013:aload_1         
	// 2688 5014:aload_1         
	// 2689 5015:getfield        #255 <Field int azh.bk>
	// 2690 5018:aload_0         
	// 2691 5019:getfield        #12  <Field azh a>
	// 2692 5022:getfield        #252 <Field int azh.cb>
	// 2693 5025:ixor            
	// 2694 5026:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2695 5029:aload_0         
	// 2696 5030:getfield        #12  <Field azh a>
	// 2697 5033:astore_1        
		abyte0.cb = ((azh) (abyte0)).cb & a.aT;
	// 2698 5034:aload_1         
	// 2699 5035:aload_1         
	// 2700 5036:getfield        #252 <Field int azh.cb>
	// 2701 5039:aload_0         
	// 2702 5040:getfield        #12  <Field azh a>
	// 2703 5043:getfield        #194 <Field int azh.aT>
	// 2704 5046:iand            
	// 2705 5047:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2706 5050:aload_0         
	// 2707 5051:getfield        #12  <Field azh a>
	// 2708 5054:astore_1        
		abyte0.cA = ((azh) (abyte0)).br & ~a.cA;
	// 2709 5055:aload_1         
	// 2710 5056:aload_1         
	// 2711 5057:getfield        #32  <Field int azh.br>
	// 2712 5060:aload_0         
	// 2713 5061:getfield        #12  <Field azh a>
	// 2714 5064:getfield        #238 <Field int azh.cA>
	// 2715 5067:iconst_m1       
	// 2716 5068:ixor            
	// 2717 5069:iand            
	// 2718 5070:putfield        #238 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 2719 5073:aload_0         
	// 2720 5074:getfield        #12  <Field azh a>
	// 2721 5077:astore_1        
		abyte0.cA = ((azh) (abyte0)).cC ^ a.cA;
	// 2722 5078:aload_1         
	// 2723 5079:aload_1         
	// 2724 5080:getfield        #241 <Field int azh.cC>
	// 2725 5083:aload_0         
	// 2726 5084:getfield        #12  <Field azh a>
	// 2727 5087:getfield        #238 <Field int azh.cA>
	// 2728 5090:ixor            
	// 2729 5091:putfield        #238 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 2730 5094:aload_0         
	// 2731 5095:getfield        #12  <Field azh a>
	// 2732 5098:astore_1        
		abyte0.be = ((azh) (abyte0)).cA ^ a.be;
	// 2733 5099:aload_1         
	// 2734 5100:aload_1         
	// 2735 5101:getfield        #238 <Field int azh.cA>
	// 2736 5104:aload_0         
	// 2737 5105:getfield        #12  <Field azh a>
	// 2738 5108:getfield        #258 <Field int azh.be>
	// 2739 5111:ixor            
	// 2740 5112:putfield        #258 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 2741 5115:aload_0         
	// 2742 5116:getfield        #12  <Field azh a>
	// 2743 5119:astore_1        
		abyte0.cA = ((azh) (abyte0)).be & a.bs;
	// 2744 5120:aload_1         
	// 2745 5121:aload_1         
	// 2746 5122:getfield        #258 <Field int azh.be>
	// 2747 5125:aload_0         
	// 2748 5126:getfield        #12  <Field azh a>
	// 2749 5129:getfield        #167 <Field int azh.bs>
	// 2750 5132:iand            
	// 2751 5133:putfield        #238 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 2752 5136:aload_0         
	// 2753 5137:getfield        #12  <Field azh a>
	// 2754 5140:astore_1        
		abyte0.cC = ((azh) (abyte0)).be & ~a.aP;
	// 2755 5141:aload_1         
	// 2756 5142:aload_1         
	// 2757 5143:getfield        #258 <Field int azh.be>
	// 2758 5146:aload_0         
	// 2759 5147:getfield        #12  <Field azh a>
	// 2760 5150:getfield        #164 <Field int azh.aP>
	// 2761 5153:iconst_m1       
	// 2762 5154:ixor            
	// 2763 5155:iand            
	// 2764 5156:putfield        #241 <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 2765 5159:aload_0         
	// 2766 5160:getfield        #12  <Field azh a>
	// 2767 5163:astore_1        
		abyte0.ck = ((azh) (abyte0)).br | a.ck;
	// 2768 5164:aload_1         
	// 2769 5165:aload_1         
	// 2770 5166:getfield        #32  <Field int azh.br>
	// 2771 5169:aload_0         
	// 2772 5170:getfield        #12  <Field azh a>
	// 2773 5173:getfield        #261 <Field int azh.ck>
	// 2774 5176:ior             
	// 2775 5177:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 2776 5180:aload_0         
	// 2777 5181:getfield        #12  <Field azh a>
	// 2778 5184:astore_1        
		abyte0.ck = ((azh) (abyte0)).cg ^ a.ck;
	// 2779 5185:aload_1         
	// 2780 5186:aload_1         
	// 2781 5187:getfield        #264 <Field int azh.cg>
	// 2782 5190:aload_0         
	// 2783 5191:getfield        #12  <Field azh a>
	// 2784 5194:getfield        #261 <Field int azh.ck>
	// 2785 5197:ixor            
	// 2786 5198:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 2787 5201:aload_0         
	// 2788 5202:getfield        #12  <Field azh a>
	// 2789 5205:astore_1        
		abyte0.bO = ((azh) (abyte0)).ck ^ a.bO;
	// 2790 5206:aload_1         
	// 2791 5207:aload_1         
	// 2792 5208:getfield        #261 <Field int azh.ck>
	// 2793 5211:aload_0         
	// 2794 5212:getfield        #12  <Field azh a>
	// 2795 5215:getfield        #267 <Field int azh.bO>
	// 2796 5218:ixor            
	// 2797 5219:putfield        #267 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2798 5222:aload_0         
	// 2799 5223:getfield        #12  <Field azh a>
	// 2800 5226:astore_1        
		abyte0.bL = ((azh) (abyte0)).bO ^ a.bL;
	// 2801 5227:aload_1         
	// 2802 5228:aload_1         
	// 2803 5229:getfield        #267 <Field int azh.bO>
	// 2804 5232:aload_0         
	// 2805 5233:getfield        #12  <Field azh a>
	// 2806 5236:getfield        #235 <Field int azh.bL>
	// 2807 5239:ixor            
	// 2808 5240:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2809 5243:aload_0         
	// 2810 5244:getfield        #12  <Field azh a>
	// 2811 5247:astore_1        
		abyte0.u = ((azh) (abyte0)).bL ^ a.u;
	// 2812 5248:aload_1         
	// 2813 5249:aload_1         
	// 2814 5250:getfield        #235 <Field int azh.bL>
	// 2815 5253:aload_0         
	// 2816 5254:getfield        #12  <Field azh a>
	// 2817 5257:getfield        #270 <Field int azh.u>
	// 2818 5260:ixor            
	// 2819 5261:putfield        #270 <Field int azh.u>
		abyte0 = ((byte []) (a));
	// 2820 5264:aload_0         
	// 2821 5265:getfield        #12  <Field azh a>
	// 2822 5268:astore_1        
		abyte0.t = ((azh) (abyte0)).t & a.br;
	// 2823 5269:aload_1         
	// 2824 5270:aload_1         
	// 2825 5271:getfield        #273 <Field int azh.t>
	// 2826 5274:aload_0         
	// 2827 5275:getfield        #12  <Field azh a>
	// 2828 5278:getfield        #32  <Field int azh.br>
	// 2829 5281:iand            
	// 2830 5282:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2831 5285:aload_0         
	// 2832 5286:getfield        #12  <Field azh a>
	// 2833 5289:astore_1        
		abyte0.t = ((azh) (abyte0)).cz ^ a.t;
	// 2834 5290:aload_1         
	// 2835 5291:aload_1         
	// 2836 5292:getfield        #229 <Field int azh.cz>
	// 2837 5295:aload_0         
	// 2838 5296:getfield        #12  <Field azh a>
	// 2839 5299:getfield        #273 <Field int azh.t>
	// 2840 5302:ixor            
	// 2841 5303:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2842 5306:aload_0         
	// 2843 5307:getfield        #12  <Field azh a>
	// 2844 5310:astore_1        
		abyte0.t = ((azh) (abyte0)).aT & ~a.t;
	// 2845 5311:aload_1         
	// 2846 5312:aload_1         
	// 2847 5313:getfield        #194 <Field int azh.aT>
	// 2848 5316:aload_0         
	// 2849 5317:getfield        #12  <Field azh a>
	// 2850 5320:getfield        #273 <Field int azh.t>
	// 2851 5323:iconst_m1       
	// 2852 5324:ixor            
	// 2853 5325:iand            
	// 2854 5326:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2855 5329:aload_0         
	// 2856 5330:getfield        #12  <Field azh a>
	// 2857 5333:astore_1        
		abyte0.t = ((azh) (abyte0)).cB ^ a.t;
	// 2858 5334:aload_1         
	// 2859 5335:aload_1         
	// 2860 5336:getfield        #182 <Field int azh.cB>
	// 2861 5339:aload_0         
	// 2862 5340:getfield        #12  <Field azh a>
	// 2863 5343:getfield        #273 <Field int azh.t>
	// 2864 5346:ixor            
	// 2865 5347:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2866 5350:aload_0         
	// 2867 5351:getfield        #12  <Field azh a>
	// 2868 5354:astore_1        
		abyte0.t = ((azh) (abyte0)).t & ~a.aF;
	// 2869 5355:aload_1         
	// 2870 5356:aload_1         
	// 2871 5357:getfield        #273 <Field int azh.t>
	// 2872 5360:aload_0         
	// 2873 5361:getfield        #12  <Field azh a>
	// 2874 5364:getfield        #199 <Field int azh.aF>
	// 2875 5367:iconst_m1       
	// 2876 5368:ixor            
	// 2877 5369:iand            
	// 2878 5370:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2879 5373:aload_0         
	// 2880 5374:getfield        #12  <Field azh a>
	// 2881 5377:astore_1        
		abyte0.t = ((azh) (abyte0)).aS ^ a.t;
	// 2882 5378:aload_1         
	// 2883 5379:aload_1         
	// 2884 5380:getfield        #202 <Field int azh.aS>
	// 2885 5383:aload_0         
	// 2886 5384:getfield        #12  <Field azh a>
	// 2887 5387:getfield        #273 <Field int azh.t>
	// 2888 5390:ixor            
	// 2889 5391:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2890 5394:aload_0         
	// 2891 5395:getfield        #12  <Field azh a>
	// 2892 5398:astore_1        
		abyte0.bF = ((azh) (abyte0)).t ^ a.bF;
	// 2893 5399:aload_1         
	// 2894 5400:aload_1         
	// 2895 5401:getfield        #273 <Field int azh.t>
	// 2896 5404:aload_0         
	// 2897 5405:getfield        #12  <Field azh a>
	// 2898 5408:getfield        #276 <Field int azh.bF>
	// 2899 5411:ixor            
	// 2900 5412:putfield        #276 <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 2901 5415:aload_0         
	// 2902 5416:getfield        #12  <Field azh a>
	// 2903 5419:astore_1        
		abyte0.t = ((azh) (abyte0)).bF & a.y;
	// 2904 5420:aload_1         
	// 2905 5421:aload_1         
	// 2906 5422:getfield        #276 <Field int azh.bF>
	// 2907 5425:aload_0         
	// 2908 5426:getfield        #12  <Field azh a>
	// 2909 5429:getfield        #143 <Field int azh.y>
	// 2910 5432:iand            
	// 2911 5433:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2912 5436:aload_0         
	// 2913 5437:getfield        #12  <Field azh a>
	// 2914 5440:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & ~a.br;
	// 2915 5441:aload_1         
	// 2916 5442:aload_1         
	// 2917 5443:getfield        #264 <Field int azh.cg>
	// 2918 5446:aload_0         
	// 2919 5447:getfield        #12  <Field azh a>
	// 2920 5450:getfield        #32  <Field int azh.br>
	// 2921 5453:iconst_m1       
	// 2922 5454:ixor            
	// 2923 5455:iand            
	// 2924 5456:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 2925 5459:aload_0         
	// 2926 5460:getfield        #12  <Field azh a>
	// 2927 5463:astore_1        
		abyte0.cg = ((azh) (abyte0)).as ^ a.cg;
	// 2928 5464:aload_1         
	// 2929 5465:aload_1         
	// 2930 5466:getfield        #279 <Field int azh.as>
	// 2931 5469:aload_0         
	// 2932 5470:getfield        #12  <Field azh a>
	// 2933 5473:getfield        #264 <Field int azh.cg>
	// 2934 5476:ixor            
	// 2935 5477:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 2936 5480:aload_0         
	// 2937 5481:getfield        #12  <Field azh a>
	// 2938 5484:astore_1        
		abyte0.cb = ((azh) (abyte0)).cg ^ a.cb;
	// 2939 5485:aload_1         
	// 2940 5486:aload_1         
	// 2941 5487:getfield        #264 <Field int azh.cg>
	// 2942 5490:aload_0         
	// 2943 5491:getfield        #12  <Field azh a>
	// 2944 5494:getfield        #252 <Field int azh.cb>
	// 2945 5497:ixor            
	// 2946 5498:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2947 5501:aload_0         
	// 2948 5502:getfield        #12  <Field azh a>
	// 2949 5505:astore_1        
		abyte0.cx = ((azh) (abyte0)).cb ^ a.cx;
	// 2950 5506:aload_1         
	// 2951 5507:aload_1         
	// 2952 5508:getfield        #252 <Field int azh.cb>
	// 2953 5511:aload_0         
	// 2954 5512:getfield        #12  <Field azh a>
	// 2955 5515:getfield        #185 <Field int azh.cx>
	// 2956 5518:ixor            
	// 2957 5519:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 2958 5522:aload_0         
	// 2959 5523:getfield        #12  <Field azh a>
	// 2960 5526:astore_1        
		abyte0.cx = ((azh) (abyte0)).cx ^ a.U;
	// 2961 5527:aload_1         
	// 2962 5528:aload_1         
	// 2963 5529:getfield        #185 <Field int azh.cx>
	// 2964 5532:aload_0         
	// 2965 5533:getfield        #12  <Field azh a>
	// 2966 5536:getfield        #47  <Field int azh.U>
	// 2967 5539:ixor            
	// 2968 5540:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 2969 5543:aload_0         
	// 2970 5544:getfield        #12  <Field azh a>
	// 2971 5547:astore_1        
		abyte0.cb = ((azh) (abyte0)).cx | a.S;
	// 2972 5548:aload_1         
	// 2973 5549:aload_1         
	// 2974 5550:getfield        #185 <Field int azh.cx>
	// 2975 5553:aload_0         
	// 2976 5554:getfield        #12  <Field azh a>
	// 2977 5557:getfield        #149 <Field int azh.S>
	// 2978 5560:ior             
	// 2979 5561:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2980 5564:aload_0         
	// 2981 5565:getfield        #12  <Field azh a>
	// 2982 5568:astore_1        
		abyte0.cg = ((azh) (abyte0)).cx & a.S;
	// 2983 5569:aload_1         
	// 2984 5570:aload_1         
	// 2985 5571:getfield        #185 <Field int azh.cx>
	// 2986 5574:aload_0         
	// 2987 5575:getfield        #12  <Field azh a>
	// 2988 5578:getfield        #149 <Field int azh.S>
	// 2989 5581:iand            
	// 2990 5582:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 2991 5585:aload_0         
	// 2992 5586:getfield        #12  <Field azh a>
	// 2993 5589:astore_1        
		abyte0.as = ~((azh) (abyte0)).cx;
	// 2994 5590:aload_1         
	// 2995 5591:aload_1         
	// 2996 5592:getfield        #185 <Field int azh.cx>
	// 2997 5595:iconst_m1       
	// 2998 5596:ixor            
	// 2999 5597:putfield        #279 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 3000 5600:aload_0         
	// 3001 5601:getfield        #12  <Field azh a>
	// 3002 5604:astore_1        
		abyte0.aJ = ((azh) (abyte0)).br | a.aJ;
	// 3003 5605:aload_1         
	// 3004 5606:aload_1         
	// 3005 5607:getfield        #32  <Field int azh.br>
	// 3006 5610:aload_0         
	// 3007 5611:getfield        #12  <Field azh a>
	// 3008 5614:getfield        #244 <Field int azh.aJ>
	// 3009 5617:ior             
	// 3010 5618:putfield        #244 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 3011 5621:aload_0         
	// 3012 5622:getfield        #12  <Field azh a>
	// 3013 5625:astore_1        
		abyte0.aJ = ((azh) (abyte0)).af ^ a.aJ;
	// 3014 5626:aload_1         
	// 3015 5627:aload_1         
	// 3016 5628:getfield        #247 <Field int azh.af>
	// 3017 5631:aload_0         
	// 3018 5632:getfield        #12  <Field azh a>
	// 3019 5635:getfield        #244 <Field int azh.aJ>
	// 3020 5638:ixor            
	// 3021 5639:putfield        #244 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 3022 5642:aload_0         
	// 3023 5643:getfield        #12  <Field azh a>
	// 3024 5646:astore_1        
		abyte0.bT = ((azh) (abyte0)).aJ ^ a.bT;
	// 3025 5647:aload_1         
	// 3026 5648:aload_1         
	// 3027 5649:getfield        #244 <Field int azh.aJ>
	// 3028 5652:aload_0         
	// 3029 5653:getfield        #12  <Field azh a>
	// 3030 5656:getfield        #282 <Field int azh.bT>
	// 3031 5659:ixor            
	// 3032 5660:putfield        #282 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 3033 5663:aload_0         
	// 3034 5664:getfield        #12  <Field azh a>
	// 3035 5667:astore_1        
		abyte0.aJ = ~((azh) (abyte0)).bT;
	// 3036 5668:aload_1         
	// 3037 5669:aload_1         
	// 3038 5670:getfield        #282 <Field int azh.bT>
	// 3039 5673:iconst_m1       
	// 3040 5674:ixor            
	// 3041 5675:putfield        #244 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 3042 5678:aload_0         
	// 3043 5679:getfield        #12  <Field azh a>
	// 3044 5682:astore_1        
		abyte0.cr = ((azh) (abyte0)).M & a.cr;
	// 3045 5683:aload_1         
	// 3046 5684:aload_1         
	// 3047 5685:getfield        #53  <Field int azh.M>
	// 3048 5688:aload_0         
	// 3049 5689:getfield        #12  <Field azh a>
	// 3050 5692:getfield        #68  <Field int azh.cr>
	// 3051 5695:iand            
	// 3052 5696:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3053 5699:aload_0         
	// 3054 5700:getfield        #12  <Field azh a>
	// 3055 5703:astore_1        
		abyte0.cr = ((azh) (abyte0)).aV ^ a.cr;
	// 3056 5704:aload_1         
	// 3057 5705:aload_1         
	// 3058 5706:getfield        #92  <Field int azh.aV>
	// 3059 5709:aload_0         
	// 3060 5710:getfield        #12  <Field azh a>
	// 3061 5713:getfield        #68  <Field int azh.cr>
	// 3062 5716:ixor            
	// 3063 5717:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3064 5720:aload_0         
	// 3065 5721:getfield        #12  <Field azh a>
	// 3066 5724:astore_1        
		abyte0.cr = ((azh) (abyte0)).ay & a.cr;
	// 3067 5725:aload_1         
	// 3068 5726:aload_1         
	// 3069 5727:getfield        #59  <Field int azh.ay>
	// 3070 5730:aload_0         
	// 3071 5731:getfield        #12  <Field azh a>
	// 3072 5734:getfield        #68  <Field int azh.cr>
	// 3073 5737:iand            
	// 3074 5738:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3075 5741:aload_0         
	// 3076 5742:getfield        #12  <Field azh a>
	// 3077 5745:astore_1        
		abyte0.U = ((azh) (abyte0)).M & ~a.U;
	// 3078 5746:aload_1         
	// 3079 5747:aload_1         
	// 3080 5748:getfield        #53  <Field int azh.M>
	// 3081 5751:aload_0         
	// 3082 5752:getfield        #12  <Field azh a>
	// 3083 5755:getfield        #47  <Field int azh.U>
	// 3084 5758:iconst_m1       
	// 3085 5759:ixor            
	// 3086 5760:iand            
	// 3087 5761:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 3088 5764:aload_0         
	// 3089 5765:getfield        #12  <Field azh a>
	// 3090 5768:astore_1        
		abyte0.U = ((azh) (abyte0)).C ^ a.U;
	// 3091 5769:aload_1         
	// 3092 5770:aload_1         
	// 3093 5771:getfield        #35  <Field int azh.C>
	// 3094 5774:aload_0         
	// 3095 5775:getfield        #12  <Field azh a>
	// 3096 5778:getfield        #47  <Field int azh.U>
	// 3097 5781:ixor            
	// 3098 5782:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 3099 5785:aload_0         
	// 3100 5786:getfield        #12  <Field azh a>
	// 3101 5789:astore_1        
		abyte0.cr = ((azh) (abyte0)).U ^ a.cr;
	// 3102 5790:aload_1         
	// 3103 5791:aload_1         
	// 3104 5792:getfield        #47  <Field int azh.U>
	// 3105 5795:aload_0         
	// 3106 5796:getfield        #12  <Field azh a>
	// 3107 5799:getfield        #68  <Field int azh.cr>
	// 3108 5802:ixor            
	// 3109 5803:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3110 5806:aload_0         
	// 3111 5807:getfield        #12  <Field azh a>
	// 3112 5810:astore_1        
		abyte0.cr = ((azh) (abyte0)).E | a.cr;
	// 3113 5811:aload_1         
	// 3114 5812:aload_1         
	// 3115 5813:getfield        #80  <Field int azh.E>
	// 3116 5816:aload_0         
	// 3117 5817:getfield        #12  <Field azh a>
	// 3118 5820:getfield        #68  <Field int azh.cr>
	// 3119 5823:ior             
	// 3120 5824:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3121 5827:aload_0         
	// 3122 5828:getfield        #12  <Field azh a>
	// 3123 5831:astore_1        
		abyte0.H = ((azh) (abyte0)).U ^ a.H;
	// 3124 5832:aload_1         
	// 3125 5833:aload_1         
	// 3126 5834:getfield        #47  <Field int azh.U>
	// 3127 5837:aload_0         
	// 3128 5838:getfield        #12  <Field azh a>
	// 3129 5841:getfield        #62  <Field int azh.H>
	// 3130 5844:ixor            
	// 3131 5845:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 3132 5848:aload_0         
	// 3133 5849:getfield        #12  <Field azh a>
	// 3134 5852:astore_1        
		abyte0.cr = ((azh) (abyte0)).H ^ a.cr;
	// 3135 5853:aload_1         
	// 3136 5854:aload_1         
	// 3137 5855:getfield        #62  <Field int azh.H>
	// 3138 5858:aload_0         
	// 3139 5859:getfield        #12  <Field azh a>
	// 3140 5862:getfield        #68  <Field int azh.cr>
	// 3141 5865:ixor            
	// 3142 5866:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3143 5869:aload_0         
	// 3144 5870:getfield        #12  <Field azh a>
	// 3145 5873:astore_1        
		abyte0.cr = ((azh) (abyte0)).ac & ~a.cr;
	// 3146 5874:aload_1         
	// 3147 5875:aload_1         
	// 3148 5876:getfield        #101 <Field int azh.ac>
	// 3149 5879:aload_0         
	// 3150 5880:getfield        #12  <Field azh a>
	// 3151 5883:getfield        #68  <Field int azh.cr>
	// 3152 5886:iconst_m1       
	// 3153 5887:ixor            
	// 3154 5888:iand            
	// 3155 5889:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3156 5892:aload_0         
	// 3157 5893:getfield        #12  <Field azh a>
	// 3158 5896:astore_1        
		abyte0.cr = ((azh) (abyte0)).ag ^ a.cr;
	// 3159 5897:aload_1         
	// 3160 5898:aload_1         
	// 3161 5899:getfield        #77  <Field int azh.ag>
	// 3162 5902:aload_0         
	// 3163 5903:getfield        #12  <Field azh a>
	// 3164 5906:getfield        #68  <Field int azh.cr>
	// 3165 5909:ixor            
	// 3166 5910:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3167 5913:aload_0         
	// 3168 5914:getfield        #12  <Field azh a>
	// 3169 5917:astore_1        
		abyte0.j = ((azh) (abyte0)).cr ^ a.j;
	// 3170 5918:aload_1         
	// 3171 5919:aload_1         
	// 3172 5920:getfield        #68  <Field int azh.cr>
	// 3173 5923:aload_0         
	// 3174 5924:getfield        #12  <Field azh a>
	// 3175 5927:getfield        #285 <Field int azh.j>
	// 3176 5930:ixor            
	// 3177 5931:putfield        #285 <Field int azh.j>
		abyte0 = ((byte []) (a));
	// 3178 5934:aload_0         
	// 3179 5935:getfield        #12  <Field azh a>
	// 3180 5938:astore_1        
		abyte0.cr = ((azh) (abyte0)).j | a.aL;
	// 3181 5939:aload_1         
	// 3182 5940:aload_1         
	// 3183 5941:getfield        #285 <Field int azh.j>
	// 3184 5944:aload_0         
	// 3185 5945:getfield        #12  <Field azh a>
	// 3186 5948:getfield        #288 <Field int azh.aL>
	// 3187 5951:ior             
	// 3188 5952:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3189 5955:aload_0         
	// 3190 5956:getfield        #12  <Field azh a>
	// 3191 5959:astore_1        
		abyte0.ag = ((azh) (abyte0)).bl | a.cr;
	// 3192 5960:aload_1         
	// 3193 5961:aload_1         
	// 3194 5962:getfield        #291 <Field int azh.bl>
	// 3195 5965:aload_0         
	// 3196 5966:getfield        #12  <Field azh a>
	// 3197 5969:getfield        #68  <Field int azh.cr>
	// 3198 5972:ior             
	// 3199 5973:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 3200 5976:aload_0         
	// 3201 5977:getfield        #12  <Field azh a>
	// 3202 5980:astore_1        
		abyte0.ag = ((azh) (abyte0)).j ^ a.ag;
	// 3203 5981:aload_1         
	// 3204 5982:aload_1         
	// 3205 5983:getfield        #285 <Field int azh.j>
	// 3206 5986:aload_0         
	// 3207 5987:getfield        #12  <Field azh a>
	// 3208 5990:getfield        #77  <Field int azh.ag>
	// 3209 5993:ixor            
	// 3210 5994:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 3211 5997:aload_0         
	// 3212 5998:getfield        #12  <Field azh a>
	// 3213 6001:astore_1        
		abyte0.H = ((azh) (abyte0)).cr & a.bi;
	// 3214 6002:aload_1         
	// 3215 6003:aload_1         
	// 3216 6004:getfield        #68  <Field int azh.cr>
	// 3217 6007:aload_0         
	// 3218 6008:getfield        #12  <Field azh a>
	// 3219 6011:getfield        #294 <Field int azh.bi>
	// 3220 6014:iand            
	// 3221 6015:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 3222 6018:aload_0         
	// 3223 6019:getfield        #12  <Field azh a>
	// 3224 6022:astore_1        
		abyte0.cr = ((azh) (abyte0)).bi & ~a.cr;
	// 3225 6023:aload_1         
	// 3226 6024:aload_1         
	// 3227 6025:getfield        #294 <Field int azh.bi>
	// 3228 6028:aload_0         
	// 3229 6029:getfield        #12  <Field azh a>
	// 3230 6032:getfield        #68  <Field int azh.cr>
	// 3231 6035:iconst_m1       
	// 3232 6036:ixor            
	// 3233 6037:iand            
	// 3234 6038:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3235 6041:aload_0         
	// 3236 6042:getfield        #12  <Field azh a>
	// 3237 6045:astore_1        
		abyte0.cr = ((azh) (abyte0)).ag ^ a.cr;
	// 3238 6046:aload_1         
	// 3239 6047:aload_1         
	// 3240 6048:getfield        #77  <Field int azh.ag>
	// 3241 6051:aload_0         
	// 3242 6052:getfield        #12  <Field azh a>
	// 3243 6055:getfield        #68  <Field int azh.cr>
	// 3244 6058:ixor            
	// 3245 6059:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3246 6062:aload_0         
	// 3247 6063:getfield        #12  <Field azh a>
	// 3248 6066:astore_1        
		abyte0.ag = ((azh) (abyte0)).aL & ~a.j;
	// 3249 6067:aload_1         
	// 3250 6068:aload_1         
	// 3251 6069:getfield        #288 <Field int azh.aL>
	// 3252 6072:aload_0         
	// 3253 6073:getfield        #12  <Field azh a>
	// 3254 6076:getfield        #285 <Field int azh.j>
	// 3255 6079:iconst_m1       
	// 3256 6080:ixor            
	// 3257 6081:iand            
	// 3258 6082:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 3259 6085:aload_0         
	// 3260 6086:getfield        #12  <Field azh a>
	// 3261 6089:astore_1        
		abyte0.C = ((azh) (abyte0)).aL & ~a.ag;
	// 3262 6090:aload_1         
	// 3263 6091:aload_1         
	// 3264 6092:getfield        #288 <Field int azh.aL>
	// 3265 6095:aload_0         
	// 3266 6096:getfield        #12  <Field azh a>
	// 3267 6099:getfield        #77  <Field int azh.ag>
	// 3268 6102:iconst_m1       
	// 3269 6103:ixor            
	// 3270 6104:iand            
	// 3271 6105:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 3272 6108:aload_0         
	// 3273 6109:getfield        #12  <Field azh a>
	// 3274 6112:astore_1        
		abyte0.bD = ((azh) (abyte0)).ag ^ a.bD;
	// 3275 6113:aload_1         
	// 3276 6114:aload_1         
	// 3277 6115:getfield        #77  <Field int azh.ag>
	// 3278 6118:aload_0         
	// 3279 6119:getfield        #12  <Field azh a>
	// 3280 6122:getfield        #297 <Field int azh.bD>
	// 3281 6125:ixor            
	// 3282 6126:putfield        #297 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 3283 6129:aload_0         
	// 3284 6130:getfield        #12  <Field azh a>
	// 3285 6133:astore_1        
		abyte0.bD = ((azh) (abyte0)).bD & ~a.bi;
	// 3286 6134:aload_1         
	// 3287 6135:aload_1         
	// 3288 6136:getfield        #297 <Field int azh.bD>
	// 3289 6139:aload_0         
	// 3290 6140:getfield        #12  <Field azh a>
	// 3291 6143:getfield        #294 <Field int azh.bi>
	// 3292 6146:iconst_m1       
	// 3293 6147:ixor            
	// 3294 6148:iand            
	// 3295 6149:putfield        #297 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 3296 6152:aload_0         
	// 3297 6153:getfield        #12  <Field azh a>
	// 3298 6156:astore_1        
		abyte0.bD = ((azh) (abyte0)).cc ^ a.bD;
	// 3299 6157:aload_1         
	// 3300 6158:aload_1         
	// 3301 6159:getfield        #300 <Field int azh.cc>
	// 3302 6162:aload_0         
	// 3303 6163:getfield        #12  <Field azh a>
	// 3304 6166:getfield        #297 <Field int azh.bD>
	// 3305 6169:ixor            
	// 3306 6170:putfield        #297 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 3307 6173:aload_0         
	// 3308 6174:getfield        #12  <Field azh a>
	// 3309 6177:astore_1        
		abyte0.bo = ((azh) (abyte0)).ag ^ a.bo;
	// 3310 6178:aload_1         
	// 3311 6179:aload_1         
	// 3312 6180:getfield        #77  <Field int azh.ag>
	// 3313 6183:aload_0         
	// 3314 6184:getfield        #12  <Field azh a>
	// 3315 6187:getfield        #303 <Field int azh.bo>
	// 3316 6190:ixor            
	// 3317 6191:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3318 6194:aload_0         
	// 3319 6195:getfield        #12  <Field azh a>
	// 3320 6198:astore_1        
		abyte0.M = ((azh) (abyte0)).j & ~a.aL;
	// 3321 6199:aload_1         
	// 3322 6200:aload_1         
	// 3323 6201:getfield        #285 <Field int azh.j>
	// 3324 6204:aload_0         
	// 3325 6205:getfield        #12  <Field azh a>
	// 3326 6208:getfield        #288 <Field int azh.aL>
	// 3327 6211:iconst_m1       
	// 3328 6212:ixor            
	// 3329 6213:iand            
	// 3330 6214:putfield        #53  <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 3331 6217:aload_0         
	// 3332 6218:getfield        #12  <Field azh a>
	// 3333 6221:astore_1        
		abyte0.ay = ((azh) (abyte0)).bi & ~a.M;
	// 3334 6222:aload_1         
	// 3335 6223:aload_1         
	// 3336 6224:getfield        #294 <Field int azh.bi>
	// 3337 6227:aload_0         
	// 3338 6228:getfield        #12  <Field azh a>
	// 3339 6231:getfield        #53  <Field int azh.M>
	// 3340 6234:iconst_m1       
	// 3341 6235:ixor            
	// 3342 6236:iand            
	// 3343 6237:putfield        #59  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3344 6240:aload_0         
	// 3345 6241:getfield        #12  <Field azh a>
	// 3346 6244:astore_1        
		abyte0.ay = ((azh) (abyte0)).bo ^ a.ay;
	// 3347 6245:aload_1         
	// 3348 6246:aload_1         
	// 3349 6247:getfield        #303 <Field int azh.bo>
	// 3350 6250:aload_0         
	// 3351 6251:getfield        #12  <Field azh a>
	// 3352 6254:getfield        #59  <Field int azh.ay>
	// 3353 6257:ixor            
	// 3354 6258:putfield        #59  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3355 6261:aload_0         
	// 3356 6262:getfield        #12  <Field azh a>
	// 3357 6265:astore_1        
		abyte0.J = ((azh) (abyte0)).ay ^ a.J;
	// 3358 6266:aload_1         
	// 3359 6267:aload_1         
	// 3360 6268:getfield        #59  <Field int azh.ay>
	// 3361 6271:aload_0         
	// 3362 6272:getfield        #12  <Field azh a>
	// 3363 6275:getfield        #306 <Field int azh.J>
	// 3364 6278:ixor            
	// 3365 6279:putfield        #306 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 3366 6282:aload_0         
	// 3367 6283:getfield        #12  <Field azh a>
	// 3368 6286:astore_1        
		abyte0.bX = ((azh) (abyte0)).M ^ a.bX;
	// 3369 6287:aload_1         
	// 3370 6288:aload_1         
	// 3371 6289:getfield        #53  <Field int azh.M>
	// 3372 6292:aload_0         
	// 3373 6293:getfield        #12  <Field azh a>
	// 3374 6296:getfield        #309 <Field int azh.bX>
	// 3375 6299:ixor            
	// 3376 6300:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 3377 6303:aload_0         
	// 3378 6304:getfield        #12  <Field azh a>
	// 3379 6307:astore_1        
		abyte0.bX = ((azh) (abyte0)).bi & ~a.bX;
	// 3380 6308:aload_1         
	// 3381 6309:aload_1         
	// 3382 6310:getfield        #294 <Field int azh.bi>
	// 3383 6313:aload_0         
	// 3384 6314:getfield        #12  <Field azh a>
	// 3385 6317:getfield        #309 <Field int azh.bX>
	// 3386 6320:iconst_m1       
	// 3387 6321:ixor            
	// 3388 6322:iand            
	// 3389 6323:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 3390 6326:aload_0         
	// 3391 6327:getfield        #12  <Field azh a>
	// 3392 6330:astore_1        
		abyte0.bX = ((azh) (abyte0)).C ^ a.bX;
	// 3393 6331:aload_1         
	// 3394 6332:aload_1         
	// 3395 6333:getfield        #35  <Field int azh.C>
	// 3396 6336:aload_0         
	// 3397 6337:getfield        #12  <Field azh a>
	// 3398 6340:getfield        #309 <Field int azh.bX>
	// 3399 6343:ixor            
	// 3400 6344:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 3401 6347:aload_0         
	// 3402 6348:getfield        #12  <Field azh a>
	// 3403 6351:astore_1        
		abyte0.bX = ((azh) (abyte0)).bE & ~a.bX;
	// 3404 6352:aload_1         
	// 3405 6353:aload_1         
	// 3406 6354:getfield        #312 <Field int azh.bE>
	// 3407 6357:aload_0         
	// 3408 6358:getfield        #12  <Field azh a>
	// 3409 6361:getfield        #309 <Field int azh.bX>
	// 3410 6364:iconst_m1       
	// 3411 6365:ixor            
	// 3412 6366:iand            
	// 3413 6367:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 3414 6370:aload_0         
	// 3415 6371:getfield        #12  <Field azh a>
	// 3416 6374:astore_1        
		abyte0.C = ((azh) (abyte0)).aL | a.M;
	// 3417 6375:aload_1         
	// 3418 6376:aload_1         
	// 3419 6377:getfield        #288 <Field int azh.aL>
	// 3420 6380:aload_0         
	// 3421 6381:getfield        #12  <Field azh a>
	// 3422 6384:getfield        #53  <Field int azh.M>
	// 3423 6387:ior             
	// 3424 6388:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 3425 6391:aload_0         
	// 3426 6392:getfield        #12  <Field azh a>
	// 3427 6395:astore_1        
		abyte0.ay = ((azh) (abyte0)).j ^ a.aL;
	// 3428 6396:aload_1         
	// 3429 6397:aload_1         
	// 3430 6398:getfield        #285 <Field int azh.j>
	// 3431 6401:aload_0         
	// 3432 6402:getfield        #12  <Field azh a>
	// 3433 6405:getfield        #288 <Field int azh.aL>
	// 3434 6408:ixor            
	// 3435 6409:putfield        #59  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3436 6412:aload_0         
	// 3437 6413:getfield        #12  <Field azh a>
	// 3438 6416:astore_1        
		abyte0.bo = ((azh) (abyte0)).ay & ~a.bl;
	// 3439 6417:aload_1         
	// 3440 6418:aload_1         
	// 3441 6419:getfield        #59  <Field int azh.ay>
	// 3442 6422:aload_0         
	// 3443 6423:getfield        #12  <Field azh a>
	// 3444 6426:getfield        #291 <Field int azh.bl>
	// 3445 6429:iconst_m1       
	// 3446 6430:ixor            
	// 3447 6431:iand            
	// 3448 6432:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3449 6435:aload_0         
	// 3450 6436:getfield        #12  <Field azh a>
	// 3451 6439:astore_1        
		abyte0.bo = ((azh) (abyte0)).ay ^ a.bo;
	// 3452 6440:aload_1         
	// 3453 6441:aload_1         
	// 3454 6442:getfield        #59  <Field int azh.ay>
	// 3455 6445:aload_0         
	// 3456 6446:getfield        #12  <Field azh a>
	// 3457 6449:getfield        #303 <Field int azh.bo>
	// 3458 6452:ixor            
	// 3459 6453:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3460 6456:aload_0         
	// 3461 6457:getfield        #12  <Field azh a>
	// 3462 6460:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & a.bi;
	// 3463 6461:aload_1         
	// 3464 6462:aload_1         
	// 3465 6463:getfield        #303 <Field int azh.bo>
	// 3466 6466:aload_0         
	// 3467 6467:getfield        #12  <Field azh a>
	// 3468 6470:getfield        #294 <Field int azh.bi>
	// 3469 6473:iand            
	// 3470 6474:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3471 6477:aload_0         
	// 3472 6478:getfield        #12  <Field azh a>
	// 3473 6481:astore_1        
		abyte0.bo = ((azh) (abyte0)).cc ^ a.bo;
	// 3474 6482:aload_1         
	// 3475 6483:aload_1         
	// 3476 6484:getfield        #300 <Field int azh.cc>
	// 3477 6487:aload_0         
	// 3478 6488:getfield        #12  <Field azh a>
	// 3479 6491:getfield        #303 <Field int azh.bo>
	// 3480 6494:ixor            
	// 3481 6495:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3482 6498:aload_0         
	// 3483 6499:getfield        #12  <Field azh a>
	// 3484 6502:astore_1        
		abyte0.bo = ((azh) (abyte0)).bE & ~a.bo;
	// 3485 6503:aload_1         
	// 3486 6504:aload_1         
	// 3487 6505:getfield        #312 <Field int azh.bE>
	// 3488 6508:aload_0         
	// 3489 6509:getfield        #12  <Field azh a>
	// 3490 6512:getfield        #303 <Field int azh.bo>
	// 3491 6515:iconst_m1       
	// 3492 6516:ixor            
	// 3493 6517:iand            
	// 3494 6518:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3495 6521:aload_0         
	// 3496 6522:getfield        #12  <Field azh a>
	// 3497 6525:astore_1        
		abyte0.bo = ((azh) (abyte0)).cr ^ a.bo;
	// 3498 6526:aload_1         
	// 3499 6527:aload_1         
	// 3500 6528:getfield        #68  <Field int azh.cr>
	// 3501 6531:aload_0         
	// 3502 6532:getfield        #12  <Field azh a>
	// 3503 6535:getfield        #303 <Field int azh.bo>
	// 3504 6538:ixor            
	// 3505 6539:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3506 6542:aload_0         
	// 3507 6543:getfield        #12  <Field azh a>
	// 3508 6546:astore_1        
		abyte0.bo = ((azh) (abyte0)).al | a.bo;
	// 3509 6547:aload_1         
	// 3510 6548:aload_1         
	// 3511 6549:getfield        #315 <Field int azh.al>
	// 3512 6552:aload_0         
	// 3513 6553:getfield        #12  <Field azh a>
	// 3514 6556:getfield        #303 <Field int azh.bo>
	// 3515 6559:ior             
	// 3516 6560:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3517 6563:aload_0         
	// 3518 6564:getfield        #12  <Field azh a>
	// 3519 6567:astore_1        
		abyte0.bf = ((azh) (abyte0)).ay ^ a.bf;
	// 3520 6568:aload_1         
	// 3521 6569:aload_1         
	// 3522 6570:getfield        #59  <Field int azh.ay>
	// 3523 6573:aload_0         
	// 3524 6574:getfield        #12  <Field azh a>
	// 3525 6577:getfield        #318 <Field int azh.bf>
	// 3526 6580:ixor            
	// 3527 6581:putfield        #318 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3528 6584:aload_0         
	// 3529 6585:getfield        #12  <Field azh a>
	// 3530 6588:astore_1        
		abyte0.cr = ((azh) (abyte0)).bf & ~a.bi;
	// 3531 6589:aload_1         
	// 3532 6590:aload_1         
	// 3533 6591:getfield        #318 <Field int azh.bf>
	// 3534 6594:aload_0         
	// 3535 6595:getfield        #12  <Field azh a>
	// 3536 6598:getfield        #294 <Field int azh.bi>
	// 3537 6601:iconst_m1       
	// 3538 6602:ixor            
	// 3539 6603:iand            
	// 3540 6604:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3541 6607:aload_0         
	// 3542 6608:getfield        #12  <Field azh a>
	// 3543 6611:astore_1        
		abyte0.cr = ((azh) (abyte0)).bf ^ a.cr;
	// 3544 6612:aload_1         
	// 3545 6613:aload_1         
	// 3546 6614:getfield        #318 <Field int azh.bf>
	// 3547 6617:aload_0         
	// 3548 6618:getfield        #12  <Field azh a>
	// 3549 6621:getfield        #68  <Field int azh.cr>
	// 3550 6624:ixor            
	// 3551 6625:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 3552 6628:aload_0         
	// 3553 6629:getfield        #12  <Field azh a>
	// 3554 6632:astore_1        
		abyte0.cc = ((azh) (abyte0)).bf & a.bi;
	// 3555 6633:aload_1         
	// 3556 6634:aload_1         
	// 3557 6635:getfield        #318 <Field int azh.bf>
	// 3558 6638:aload_0         
	// 3559 6639:getfield        #12  <Field azh a>
	// 3560 6642:getfield        #294 <Field int azh.bi>
	// 3561 6645:iand            
	// 3562 6646:putfield        #300 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 3563 6649:aload_0         
	// 3564 6650:getfield        #12  <Field azh a>
	// 3565 6653:astore_1        
		abyte0.bf = ((azh) (abyte0)).bi & ~a.bf;
	// 3566 6654:aload_1         
	// 3567 6655:aload_1         
	// 3568 6656:getfield        #294 <Field int azh.bi>
	// 3569 6659:aload_0         
	// 3570 6660:getfield        #12  <Field azh a>
	// 3571 6663:getfield        #318 <Field int azh.bf>
	// 3572 6666:iconst_m1       
	// 3573 6667:ixor            
	// 3574 6668:iand            
	// 3575 6669:putfield        #318 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3576 6672:aload_0         
	// 3577 6673:getfield        #12  <Field azh a>
	// 3578 6676:astore_1        
		abyte0.bf = ((azh) (abyte0)).ag ^ a.bf;
	// 3579 6677:aload_1         
	// 3580 6678:aload_1         
	// 3581 6679:getfield        #77  <Field int azh.ag>
	// 3582 6682:aload_0         
	// 3583 6683:getfield        #12  <Field azh a>
	// 3584 6686:getfield        #318 <Field int azh.bf>
	// 3585 6689:ixor            
	// 3586 6690:putfield        #318 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3587 6693:aload_0         
	// 3588 6694:getfield        #12  <Field azh a>
	// 3589 6697:astore_1        
		abyte0.ag = ((azh) (abyte0)).bl | a.ay;
	// 3590 6698:aload_1         
	// 3591 6699:aload_1         
	// 3592 6700:getfield        #291 <Field int azh.bl>
	// 3593 6703:aload_0         
	// 3594 6704:getfield        #12  <Field azh a>
	// 3595 6707:getfield        #59  <Field int azh.ay>
	// 3596 6710:ior             
	// 3597 6711:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 3598 6714:aload_0         
	// 3599 6715:getfield        #12  <Field azh a>
	// 3600 6718:astore_1        
		abyte0.ag = ((azh) (abyte0)).M ^ a.ag;
	// 3601 6719:aload_1         
	// 3602 6720:aload_1         
	// 3603 6721:getfield        #53  <Field int azh.M>
	// 3604 6724:aload_0         
	// 3605 6725:getfield        #12  <Field azh a>
	// 3606 6728:getfield        #77  <Field int azh.ag>
	// 3607 6731:ixor            
	// 3608 6732:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 3609 6735:aload_0         
	// 3610 6736:getfield        #12  <Field azh a>
	// 3611 6739:astore_1        
		abyte0.ag = ((azh) (abyte0)).bi & ~a.ag;
	// 3612 6740:aload_1         
	// 3613 6741:aload_1         
	// 3614 6742:getfield        #294 <Field int azh.bi>
	// 3615 6745:aload_0         
	// 3616 6746:getfield        #12  <Field azh a>
	// 3617 6749:getfield        #77  <Field int azh.ag>
	// 3618 6752:iconst_m1       
	// 3619 6753:ixor            
	// 3620 6754:iand            
	// 3621 6755:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 3622 6758:aload_0         
	// 3623 6759:getfield        #12  <Field azh a>
	// 3624 6762:astore_1        
		abyte0.M = ((azh) (abyte0)).ay ^ a.bl;
	// 3625 6763:aload_1         
	// 3626 6764:aload_1         
	// 3627 6765:getfield        #59  <Field int azh.ay>
	// 3628 6768:aload_0         
	// 3629 6769:getfield        #12  <Field azh a>
	// 3630 6772:getfield        #291 <Field int azh.bl>
	// 3631 6775:ixor            
	// 3632 6776:putfield        #53  <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 3633 6779:aload_0         
	// 3634 6780:getfield        #12  <Field azh a>
	// 3635 6783:astore_1        
		abyte0.H = ((azh) (abyte0)).M ^ a.H;
	// 3636 6784:aload_1         
	// 3637 6785:aload_1         
	// 3638 6786:getfield        #53  <Field int azh.M>
	// 3639 6789:aload_0         
	// 3640 6790:getfield        #12  <Field azh a>
	// 3641 6793:getfield        #62  <Field int azh.H>
	// 3642 6796:ixor            
	// 3643 6797:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 3644 6800:aload_0         
	// 3645 6801:getfield        #12  <Field azh a>
	// 3646 6804:astore_1        
		abyte0.bX = ((azh) (abyte0)).H ^ a.bX;
	// 3647 6805:aload_1         
	// 3648 6806:aload_1         
	// 3649 6807:getfield        #62  <Field int azh.H>
	// 3650 6810:aload_0         
	// 3651 6811:getfield        #12  <Field azh a>
	// 3652 6814:getfield        #309 <Field int azh.bX>
	// 3653 6817:ixor            
	// 3654 6818:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 3655 6821:aload_0         
	// 3656 6822:getfield        #12  <Field azh a>
	// 3657 6825:astore_1        
		abyte0.bo = ((azh) (abyte0)).bX ^ a.bo;
	// 3658 6826:aload_1         
	// 3659 6827:aload_1         
	// 3660 6828:getfield        #309 <Field int azh.bX>
	// 3661 6831:aload_0         
	// 3662 6832:getfield        #12  <Field azh a>
	// 3663 6835:getfield        #303 <Field int azh.bo>
	// 3664 6838:ixor            
	// 3665 6839:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3666 6842:aload_0         
	// 3667 6843:getfield        #12  <Field azh a>
	// 3668 6846:astore_1        
		abyte0.A = ((azh) (abyte0)).bo ^ a.A;
	// 3669 6847:aload_1         
	// 3670 6848:aload_1         
	// 3671 6849:getfield        #303 <Field int azh.bo>
	// 3672 6852:aload_0         
	// 3673 6853:getfield        #12  <Field azh a>
	// 3674 6856:getfield        #321 <Field int azh.A>
	// 3675 6859:ixor            
	// 3676 6860:putfield        #321 <Field int azh.A>
		abyte0 = ((byte []) (a));
	// 3677 6863:aload_0         
	// 3678 6864:getfield        #12  <Field azh a>
	// 3679 6867:astore_1        
		abyte0.bo = ((azh) (abyte0)).bF & ~a.A;
	// 3680 6868:aload_1         
	// 3681 6869:aload_1         
	// 3682 6870:getfield        #276 <Field int azh.bF>
	// 3683 6873:aload_0         
	// 3684 6874:getfield        #12  <Field azh a>
	// 3685 6877:getfield        #321 <Field int azh.A>
	// 3686 6880:iconst_m1       
	// 3687 6881:ixor            
	// 3688 6882:iand            
	// 3689 6883:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3690 6886:aload_0         
	// 3691 6887:getfield        #12  <Field azh a>
	// 3692 6890:astore_1        
		abyte0.H = ((azh) (abyte0)).A & a.aR;
	// 3693 6891:aload_1         
	// 3694 6892:aload_1         
	// 3695 6893:getfield        #321 <Field int azh.A>
	// 3696 6896:aload_0         
	// 3697 6897:getfield        #12  <Field azh a>
	// 3698 6900:getfield        #26  <Field int azh.aR>
	// 3699 6903:iand            
	// 3700 6904:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 3701 6907:aload_0         
	// 3702 6908:getfield        #12  <Field azh a>
	// 3703 6911:astore_1        
		abyte0.M = ((azh) (abyte0)).A & a.s;
	// 3704 6912:aload_1         
	// 3705 6913:aload_1         
	// 3706 6914:getfield        #321 <Field int azh.A>
	// 3707 6917:aload_0         
	// 3708 6918:getfield        #12  <Field azh a>
	// 3709 6921:getfield        #232 <Field int azh.s>
	// 3710 6924:iand            
	// 3711 6925:putfield        #53  <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 3712 6928:aload_0         
	// 3713 6929:getfield        #12  <Field azh a>
	// 3714 6932:astore_1        
		abyte0.M = ((azh) (abyte0)).cv ^ a.M;
	// 3715 6933:aload_1         
	// 3716 6934:aload_1         
	// 3717 6935:getfield        #44  <Field int azh.cv>
	// 3718 6938:aload_0         
	// 3719 6939:getfield        #12  <Field azh a>
	// 3720 6942:getfield        #53  <Field int azh.M>
	// 3721 6945:ixor            
	// 3722 6946:putfield        #53  <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 3723 6949:aload_0         
	// 3724 6950:getfield        #12  <Field azh a>
	// 3725 6953:astore_1        
		abyte0.aV = ((azh) (abyte0)).A & a.I;
	// 3726 6954:aload_1         
	// 3727 6955:aload_1         
	// 3728 6956:getfield        #321 <Field int azh.A>
	// 3729 6959:aload_0         
	// 3730 6960:getfield        #12  <Field azh a>
	// 3731 6963:getfield        #249 <Field int azh.I>
	// 3732 6966:iand            
	// 3733 6967:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 3734 6970:aload_0         
	// 3735 6971:getfield        #12  <Field azh a>
	// 3736 6974:astore_1        
		abyte0.aV = ((azh) (abyte0)).bt ^ a.aV;
	// 3737 6975:aload_1         
	// 3738 6976:aload_1         
	// 3739 6977:getfield        #41  <Field int azh.bt>
	// 3740 6980:aload_0         
	// 3741 6981:getfield        #12  <Field azh a>
	// 3742 6984:getfield        #92  <Field int azh.aV>
	// 3743 6987:ixor            
	// 3744 6988:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 3745 6991:aload_0         
	// 3746 6992:getfield        #12  <Field azh a>
	// 3747 6995:astore_1        
		abyte0.aV = ((azh) (abyte0)).aV & a.Q;
	// 3748 6996:aload_1         
	// 3749 6997:aload_1         
	// 3750 6998:getfield        #92  <Field int azh.aV>
	// 3751 7001:aload_0         
	// 3752 7002:getfield        #12  <Field azh a>
	// 3753 7005:getfield        #176 <Field int azh.Q>
	// 3754 7008:iand            
	// 3755 7009:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 3756 7012:aload_0         
	// 3757 7013:getfield        #12  <Field azh a>
	// 3758 7016:astore_1        
		abyte0.af = ((azh) (abyte0)).A ^ a.bF;
	// 3759 7017:aload_1         
	// 3760 7018:aload_1         
	// 3761 7019:getfield        #321 <Field int azh.A>
	// 3762 7022:aload_0         
	// 3763 7023:getfield        #12  <Field azh a>
	// 3764 7026:getfield        #276 <Field int azh.bF>
	// 3765 7029:ixor            
	// 3766 7030:putfield        #247 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 3767 7033:aload_0         
	// 3768 7034:getfield        #12  <Field azh a>
	// 3769 7037:astore_1        
		abyte0.aS = ((azh) (abyte0)).A & a.bu;
	// 3770 7038:aload_1         
	// 3771 7039:aload_1         
	// 3772 7040:getfield        #321 <Field int azh.A>
	// 3773 7043:aload_0         
	// 3774 7044:getfield        #12  <Field azh a>
	// 3775 7047:getfield        #179 <Field int azh.bu>
	// 3776 7050:iand            
	// 3777 7051:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 3778 7054:aload_0         
	// 3779 7055:getfield        #12  <Field azh a>
	// 3780 7058:astore_1        
		abyte0.aS = ((azh) (abyte0)).I ^ a.aS;
	// 3781 7059:aload_1         
	// 3782 7060:aload_1         
	// 3783 7061:getfield        #249 <Field int azh.I>
	// 3784 7064:aload_0         
	// 3785 7065:getfield        #12  <Field azh a>
	// 3786 7068:getfield        #202 <Field int azh.aS>
	// 3787 7071:ixor            
	// 3788 7072:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 3789 7075:aload_0         
	// 3790 7076:getfield        #12  <Field azh a>
	// 3791 7079:astore_1        
		abyte0.cB = ((azh) (abyte0)).aS & ~a.Q;
	// 3792 7080:aload_1         
	// 3793 7081:aload_1         
	// 3794 7082:getfield        #202 <Field int azh.aS>
	// 3795 7085:aload_0         
	// 3796 7086:getfield        #12  <Field azh a>
	// 3797 7089:getfield        #176 <Field int azh.Q>
	// 3798 7092:iconst_m1       
	// 3799 7093:ixor            
	// 3800 7094:iand            
	// 3801 7095:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 3802 7098:aload_0         
	// 3803 7099:getfield        #12  <Field azh a>
	// 3804 7102:astore_1        
		abyte0.cz = ((azh) (abyte0)).A & ~a.I;
	// 3805 7103:aload_1         
	// 3806 7104:aload_1         
	// 3807 7105:getfield        #321 <Field int azh.A>
	// 3808 7108:aload_0         
	// 3809 7109:getfield        #12  <Field azh a>
	// 3810 7112:getfield        #249 <Field int azh.I>
	// 3811 7115:iconst_m1       
	// 3812 7116:ixor            
	// 3813 7117:iand            
	// 3814 7118:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 3815 7121:aload_0         
	// 3816 7122:getfield        #12  <Field azh a>
	// 3817 7125:astore_1        
		abyte0.cz = ((azh) (abyte0)).s ^ a.cz;
	// 3818 7126:aload_1         
	// 3819 7127:aload_1         
	// 3820 7128:getfield        #232 <Field int azh.s>
	// 3821 7131:aload_0         
	// 3822 7132:getfield        #12  <Field azh a>
	// 3823 7135:getfield        #229 <Field int azh.cz>
	// 3824 7138:ixor            
	// 3825 7139:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 3826 7142:aload_0         
	// 3827 7143:getfield        #12  <Field azh a>
	// 3828 7146:astore_1        
		abyte0.cz = ((azh) (abyte0)).cz & ~a.Q;
	// 3829 7147:aload_1         
	// 3830 7148:aload_1         
	// 3831 7149:getfield        #229 <Field int azh.cz>
	// 3832 7152:aload_0         
	// 3833 7153:getfield        #12  <Field azh a>
	// 3834 7156:getfield        #176 <Field int azh.Q>
	// 3835 7159:iconst_m1       
	// 3836 7160:ixor            
	// 3837 7161:iand            
	// 3838 7162:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 3839 7165:aload_0         
	// 3840 7166:getfield        #12  <Field azh a>
	// 3841 7169:astore_1        
		abyte0.cv = ((azh) (abyte0)).A & ~a.cv;
	// 3842 7170:aload_1         
	// 3843 7171:aload_1         
	// 3844 7172:getfield        #321 <Field int azh.A>
	// 3845 7175:aload_0         
	// 3846 7176:getfield        #12  <Field azh a>
	// 3847 7179:getfield        #44  <Field int azh.cv>
	// 3848 7182:iconst_m1       
	// 3849 7183:ixor            
	// 3850 7184:iand            
	// 3851 7185:putfield        #44  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	// 3852 7188:aload_0         
	// 3853 7189:getfield        #12  <Field azh a>
	// 3854 7192:astore_1        
		abyte0.cv = ((azh) (abyte0)).a ^ a.cv;
	// 3855 7193:aload_1         
	// 3856 7194:aload_1         
	// 3857 7195:getfield        #196 <Field int azh.a>
	// 3858 7198:aload_0         
	// 3859 7199:getfield        #12  <Field azh a>
	// 3860 7202:getfield        #44  <Field int azh.cv>
	// 3861 7205:ixor            
	// 3862 7206:putfield        #44  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	// 3863 7209:aload_0         
	// 3864 7210:getfield        #12  <Field azh a>
	// 3865 7213:astore_1        
		abyte0.cv = ((azh) (abyte0)).cv & ~a.Q;
	// 3866 7214:aload_1         
	// 3867 7215:aload_1         
	// 3868 7216:getfield        #44  <Field int azh.cv>
	// 3869 7219:aload_0         
	// 3870 7220:getfield        #12  <Field azh a>
	// 3871 7223:getfield        #176 <Field int azh.Q>
	// 3872 7226:iconst_m1       
	// 3873 7227:ixor            
	// 3874 7228:iand            
	// 3875 7229:putfield        #44  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	// 3876 7232:aload_0         
	// 3877 7233:getfield        #12  <Field azh a>
	// 3878 7236:astore_1        
		abyte0.s = ((azh) (abyte0)).A & ~a.i;
	// 3879 7237:aload_1         
	// 3880 7238:aload_1         
	// 3881 7239:getfield        #321 <Field int azh.A>
	// 3882 7242:aload_0         
	// 3883 7243:getfield        #12  <Field azh a>
	// 3884 7246:getfield        #122 <Field int azh.i>
	// 3885 7249:iconst_m1       
	// 3886 7250:ixor            
	// 3887 7251:iand            
	// 3888 7252:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 3889 7255:aload_0         
	// 3890 7256:getfield        #12  <Field azh a>
	// 3891 7259:astore_1        
		abyte0.s = ((azh) (abyte0)).aR ^ a.s;
	// 3892 7260:aload_1         
	// 3893 7261:aload_1         
	// 3894 7262:getfield        #26  <Field int azh.aR>
	// 3895 7265:aload_0         
	// 3896 7266:getfield        #12  <Field azh a>
	// 3897 7269:getfield        #232 <Field int azh.s>
	// 3898 7272:ixor            
	// 3899 7273:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 3900 7276:aload_0         
	// 3901 7277:getfield        #12  <Field azh a>
	// 3902 7280:astore_1        
		abyte0.bL = ((azh) (abyte0)).A & a.bu;
	// 3903 7281:aload_1         
	// 3904 7282:aload_1         
	// 3905 7283:getfield        #321 <Field int azh.A>
	// 3906 7286:aload_0         
	// 3907 7287:getfield        #12  <Field azh a>
	// 3908 7290:getfield        #179 <Field int azh.bu>
	// 3909 7293:iand            
	// 3910 7294:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3911 7297:aload_0         
	// 3912 7298:getfield        #12  <Field azh a>
	// 3913 7301:astore_1        
		abyte0.cB = ((azh) (abyte0)).bL ^ a.cB;
	// 3914 7302:aload_1         
	// 3915 7303:aload_1         
	// 3916 7304:getfield        #235 <Field int azh.bL>
	// 3917 7307:aload_0         
	// 3918 7308:getfield        #12  <Field azh a>
	// 3919 7311:getfield        #182 <Field int azh.cB>
	// 3920 7314:ixor            
	// 3921 7315:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 3922 7318:aload_0         
	// 3923 7319:getfield        #12  <Field azh a>
	// 3924 7322:astore_1        
		abyte0.bL = ((azh) (abyte0)).A & ~a.cj;
	// 3925 7323:aload_1         
	// 3926 7324:aload_1         
	// 3927 7325:getfield        #321 <Field int azh.A>
	// 3928 7328:aload_0         
	// 3929 7329:getfield        #12  <Field azh a>
	// 3930 7332:getfield        #173 <Field int azh.cj>
	// 3931 7335:iconst_m1       
	// 3932 7336:ixor            
	// 3933 7337:iand            
	// 3934 7338:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3935 7341:aload_0         
	// 3936 7342:getfield        #12  <Field azh a>
	// 3937 7345:astore_1        
		abyte0.bL = ((azh) (abyte0)).bt ^ a.bL;
	// 3938 7346:aload_1         
	// 3939 7347:aload_1         
	// 3940 7348:getfield        #41  <Field int azh.bt>
	// 3941 7351:aload_0         
	// 3942 7352:getfield        #12  <Field azh a>
	// 3943 7355:getfield        #235 <Field int azh.bL>
	// 3944 7358:ixor            
	// 3945 7359:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3946 7362:aload_0         
	// 3947 7363:getfield        #12  <Field azh a>
	// 3948 7366:astore_1        
		abyte0.bO = ((azh) (abyte0)).Q | a.bL;
	// 3949 7367:aload_1         
	// 3950 7368:aload_1         
	// 3951 7369:getfield        #176 <Field int azh.Q>
	// 3952 7372:aload_0         
	// 3953 7373:getfield        #12  <Field azh a>
	// 3954 7376:getfield        #235 <Field int azh.bL>
	// 3955 7379:ior             
	// 3956 7380:putfield        #267 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3957 7383:aload_0         
	// 3958 7384:getfield        #12  <Field azh a>
	// 3959 7387:astore_1        
		abyte0.ck = ((azh) (abyte0)).A & ~a.I;
	// 3960 7388:aload_1         
	// 3961 7389:aload_1         
	// 3962 7390:getfield        #321 <Field int azh.A>
	// 3963 7393:aload_0         
	// 3964 7394:getfield        #12  <Field azh a>
	// 3965 7397:getfield        #249 <Field int azh.I>
	// 3966 7400:iconst_m1       
	// 3967 7401:ixor            
	// 3968 7402:iand            
	// 3969 7403:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 3970 7406:aload_0         
	// 3971 7407:getfield        #12  <Field azh a>
	// 3972 7410:astore_1        
		abyte0.ck = ((azh) (abyte0)).bu ^ a.ck;
	// 3973 7411:aload_1         
	// 3974 7412:aload_1         
	// 3975 7413:getfield        #179 <Field int azh.bu>
	// 3976 7416:aload_0         
	// 3977 7417:getfield        #12  <Field azh a>
	// 3978 7420:getfield        #261 <Field int azh.ck>
	// 3979 7423:ixor            
	// 3980 7424:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 3981 7427:aload_0         
	// 3982 7428:getfield        #12  <Field azh a>
	// 3983 7431:astore_1        
		abyte0.bk = ((azh) (abyte0)).Q | a.ck;
	// 3984 7432:aload_1         
	// 3985 7433:aload_1         
	// 3986 7434:getfield        #176 <Field int azh.Q>
	// 3987 7437:aload_0         
	// 3988 7438:getfield        #12  <Field azh a>
	// 3989 7441:getfield        #261 <Field int azh.ck>
	// 3990 7444:ior             
	// 3991 7445:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3992 7448:aload_0         
	// 3993 7449:getfield        #12  <Field azh a>
	// 3994 7452:astore_1        
		abyte0.ck = ((azh) (abyte0)).Q | a.ck;
	// 3995 7453:aload_1         
	// 3996 7454:aload_1         
	// 3997 7455:getfield        #176 <Field int azh.Q>
	// 3998 7458:aload_0         
	// 3999 7459:getfield        #12  <Field azh a>
	// 4000 7462:getfield        #261 <Field int azh.ck>
	// 4001 7465:ior             
	// 4002 7466:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 4003 7469:aload_0         
	// 4004 7470:getfield        #12  <Field azh a>
	// 4005 7473:astore_1        
		abyte0.a = ((azh) (abyte0)).A & a.a;
	// 4006 7474:aload_1         
	// 4007 7475:aload_1         
	// 4008 7476:getfield        #321 <Field int azh.A>
	// 4009 7479:aload_0         
	// 4010 7480:getfield        #12  <Field azh a>
	// 4011 7483:getfield        #196 <Field int azh.a>
	// 4012 7486:iand            
	// 4013 7487:putfield        #196 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 4014 7490:aload_0         
	// 4015 7491:getfield        #12  <Field azh a>
	// 4016 7494:astore_1        
		abyte0.a = ((azh) (abyte0)).Q | a.a;
	// 4017 7495:aload_1         
	// 4018 7496:aload_1         
	// 4019 7497:getfield        #176 <Field int azh.Q>
	// 4020 7500:aload_0         
	// 4021 7501:getfield        #12  <Field azh a>
	// 4022 7504:getfield        #196 <Field int azh.a>
	// 4023 7507:ior             
	// 4024 7508:putfield        #196 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 4025 7511:aload_0         
	// 4026 7512:getfield        #12  <Field azh a>
	// 4027 7515:astore_1        
		abyte0.ct = ((azh) (abyte0)).A & a.bF;
	// 4028 7516:aload_1         
	// 4029 7517:aload_1         
	// 4030 7518:getfield        #321 <Field int azh.A>
	// 4031 7521:aload_0         
	// 4032 7522:getfield        #12  <Field azh a>
	// 4033 7525:getfield        #276 <Field int azh.bF>
	// 4034 7528:iand            
	// 4035 7529:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 4036 7532:aload_0         
	// 4037 7533:getfield        #12  <Field azh a>
	// 4038 7536:astore_1        
		abyte0.at = ((azh) (abyte0)).bF & ~a.ct;
	// 4039 7537:aload_1         
	// 4040 7538:aload_1         
	// 4041 7539:getfield        #276 <Field int azh.bF>
	// 4042 7542:aload_0         
	// 4043 7543:getfield        #12  <Field azh a>
	// 4044 7546:getfield        #324 <Field int azh.ct>
	// 4045 7549:iconst_m1       
	// 4046 7550:ixor            
	// 4047 7551:iand            
	// 4048 7552:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 4049 7555:aload_0         
	// 4050 7556:getfield        #12  <Field azh a>
	// 4051 7559:astore_1        
		abyte0.ba = ((azh) (abyte0)).bb & a.ct;
	// 4052 7560:aload_1         
	// 4053 7561:aload_1         
	// 4054 7562:getfield        #330 <Field int azh.bb>
	// 4055 7565:aload_0         
	// 4056 7566:getfield        #12  <Field azh a>
	// 4057 7569:getfield        #324 <Field int azh.ct>
	// 4058 7572:iand            
	// 4059 7573:putfield        #333 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 4060 7576:aload_0         
	// 4061 7577:getfield        #12  <Field azh a>
	// 4062 7580:astore_1        
		abyte0.bx = ((azh) (abyte0)).A | a.bF;
	// 4063 7581:aload_1         
	// 4064 7582:aload_1         
	// 4065 7583:getfield        #321 <Field int azh.A>
	// 4066 7586:aload_0         
	// 4067 7587:getfield        #12  <Field azh a>
	// 4068 7590:getfield        #276 <Field int azh.bF>
	// 4069 7593:ior             
	// 4070 7594:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4071 7597:aload_0         
	// 4072 7598:getfield        #12  <Field azh a>
	// 4073 7601:astore_1        
		abyte0.aX = ((azh) (abyte0)).bx & ~a.bF;
	// 4074 7602:aload_1         
	// 4075 7603:aload_1         
	// 4076 7604:getfield        #336 <Field int azh.bx>
	// 4077 7607:aload_0         
	// 4078 7608:getfield        #12  <Field azh a>
	// 4079 7611:getfield        #276 <Field int azh.bF>
	// 4080 7614:iconst_m1       
	// 4081 7615:ixor            
	// 4082 7616:iand            
	// 4083 7617:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 4084 7620:aload_0         
	// 4085 7621:getfield        #12  <Field azh a>
	// 4086 7624:astore_1        
		abyte0.bJ = ((azh) (abyte0)).A & ~a.bF;
	// 4087 7625:aload_1         
	// 4088 7626:aload_1         
	// 4089 7627:getfield        #321 <Field int azh.A>
	// 4090 7630:aload_0         
	// 4091 7631:getfield        #12  <Field azh a>
	// 4092 7634:getfield        #276 <Field int azh.bF>
	// 4093 7637:iconst_m1       
	// 4094 7638:ixor            
	// 4095 7639:iand            
	// 4096 7640:putfield        #342 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4097 7643:aload_0         
	// 4098 7644:getfield        #12  <Field azh a>
	// 4099 7647:astore_1        
		abyte0.bR = ((azh) (abyte0)).bb & a.bJ;
	// 4100 7648:aload_1         
	// 4101 7649:aload_1         
	// 4102 7650:getfield        #330 <Field int azh.bb>
	// 4103 7653:aload_0         
	// 4104 7654:getfield        #12  <Field azh a>
	// 4105 7657:getfield        #342 <Field int azh.bJ>
	// 4106 7660:iand            
	// 4107 7661:putfield        #345 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 4108 7664:aload_0         
	// 4109 7665:getfield        #12  <Field azh a>
	// 4110 7668:astore_1        
		abyte0.bY = ((azh) (abyte0)).bb & a.bJ;
	// 4111 7669:aload_1         
	// 4112 7670:aload_1         
	// 4113 7671:getfield        #330 <Field int azh.bb>
	// 4114 7674:aload_0         
	// 4115 7675:getfield        #12  <Field azh a>
	// 4116 7678:getfield        #342 <Field int azh.bJ>
	// 4117 7681:iand            
	// 4118 7682:putfield        #348 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4119 7685:aload_0         
	// 4120 7686:getfield        #12  <Field azh a>
	// 4121 7689:astore_1        
		abyte0.ca = ((azh) (abyte0)).A & ~a.cj;
	// 4122 7690:aload_1         
	// 4123 7691:aload_1         
	// 4124 7692:getfield        #321 <Field int azh.A>
	// 4125 7695:aload_0         
	// 4126 7696:getfield        #12  <Field azh a>
	// 4127 7699:getfield        #173 <Field int azh.cj>
	// 4128 7702:iconst_m1       
	// 4129 7703:ixor            
	// 4130 7704:iand            
	// 4131 7705:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4132 7708:aload_0         
	// 4133 7709:getfield        #12  <Field azh a>
	// 4134 7712:astore_1        
		abyte0.ca = ((azh) (abyte0)).aR ^ a.ca;
	// 4135 7713:aload_1         
	// 4136 7714:aload_1         
	// 4137 7715:getfield        #26  <Field int azh.aR>
	// 4138 7718:aload_0         
	// 4139 7719:getfield        #12  <Field azh a>
	// 4140 7722:getfield        #351 <Field int azh.ca>
	// 4141 7725:ixor            
	// 4142 7726:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4143 7729:aload_0         
	// 4144 7730:getfield        #12  <Field azh a>
	// 4145 7733:astore_1        
		abyte0.a = ((azh) (abyte0)).ca ^ a.a;
	// 4146 7734:aload_1         
	// 4147 7735:aload_1         
	// 4148 7736:getfield        #351 <Field int azh.ca>
	// 4149 7739:aload_0         
	// 4150 7740:getfield        #12  <Field azh a>
	// 4151 7743:getfield        #196 <Field int azh.a>
	// 4152 7746:ixor            
	// 4153 7747:putfield        #196 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 4154 7750:aload_0         
	// 4155 7751:getfield        #12  <Field azh a>
	// 4156 7754:astore_1        
		abyte0.bO = ((azh) (abyte0)).ca ^ a.bO;
	// 4157 7755:aload_1         
	// 4158 7756:aload_1         
	// 4159 7757:getfield        #351 <Field int azh.ca>
	// 4160 7760:aload_0         
	// 4161 7761:getfield        #12  <Field azh a>
	// 4162 7764:getfield        #267 <Field int azh.bO>
	// 4163 7767:ixor            
	// 4164 7768:putfield        #267 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 4165 7771:aload_0         
	// 4166 7772:getfield        #12  <Field azh a>
	// 4167 7775:astore_1        
		abyte0.ca = ((azh) (abyte0)).A & ~a.aR;
	// 4168 7776:aload_1         
	// 4169 7777:aload_1         
	// 4170 7778:getfield        #321 <Field int azh.A>
	// 4171 7781:aload_0         
	// 4172 7782:getfield        #12  <Field azh a>
	// 4173 7785:getfield        #26  <Field int azh.aR>
	// 4174 7788:iconst_m1       
	// 4175 7789:ixor            
	// 4176 7790:iand            
	// 4177 7791:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4178 7794:aload_0         
	// 4179 7795:getfield        #12  <Field azh a>
	// 4180 7798:astore_1        
		abyte0.ca = ((azh) (abyte0)).aR ^ a.ca;
	// 4181 7799:aload_1         
	// 4182 7800:aload_1         
	// 4183 7801:getfield        #26  <Field int azh.aR>
	// 4184 7804:aload_0         
	// 4185 7805:getfield        #12  <Field azh a>
	// 4186 7808:getfield        #351 <Field int azh.ca>
	// 4187 7811:ixor            
	// 4188 7812:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4189 7815:aload_0         
	// 4190 7816:getfield        #12  <Field azh a>
	// 4191 7819:astore_1        
		abyte0.ca = ((azh) (abyte0)).Q | a.ca;
	// 4192 7820:aload_1         
	// 4193 7821:aload_1         
	// 4194 7822:getfield        #176 <Field int azh.Q>
	// 4195 7825:aload_0         
	// 4196 7826:getfield        #12  <Field azh a>
	// 4197 7829:getfield        #351 <Field int azh.ca>
	// 4198 7832:ior             
	// 4199 7833:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4200 7836:aload_0         
	// 4201 7837:getfield        #12  <Field azh a>
	// 4202 7840:astore_1        
		abyte0.ca = ((azh) (abyte0)).H ^ a.ca;
	// 4203 7841:aload_1         
	// 4204 7842:aload_1         
	// 4205 7843:getfield        #62  <Field int azh.H>
	// 4206 7846:aload_0         
	// 4207 7847:getfield        #12  <Field azh a>
	// 4208 7850:getfield        #351 <Field int azh.ca>
	// 4209 7853:ixor            
	// 4210 7854:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4211 7857:aload_0         
	// 4212 7858:getfield        #12  <Field azh a>
	// 4213 7861:astore_1        
		abyte0.H = ((azh) (abyte0)).A & ~a.cj;
	// 4214 7862:aload_1         
	// 4215 7863:aload_1         
	// 4216 7864:getfield        #321 <Field int azh.A>
	// 4217 7867:aload_0         
	// 4218 7868:getfield        #12  <Field azh a>
	// 4219 7871:getfield        #173 <Field int azh.cj>
	// 4220 7874:iconst_m1       
	// 4221 7875:ixor            
	// 4222 7876:iand            
	// 4223 7877:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 4224 7880:aload_0         
	// 4225 7881:getfield        #12  <Field azh a>
	// 4226 7884:astore_1        
		abyte0.au = ((azh) (abyte0)).Q | a.H;
	// 4227 7885:aload_1         
	// 4228 7886:aload_1         
	// 4229 7887:getfield        #176 <Field int azh.Q>
	// 4230 7890:aload_0         
	// 4231 7891:getfield        #12  <Field azh a>
	// 4232 7894:getfield        #62  <Field int azh.H>
	// 4233 7897:ior             
	// 4234 7898:putfield        #354 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4235 7901:aload_0         
	// 4236 7902:getfield        #12  <Field azh a>
	// 4237 7905:astore_1        
		abyte0.au = ((azh) (abyte0)).bL ^ a.au;
	// 4238 7906:aload_1         
	// 4239 7907:aload_1         
	// 4240 7908:getfield        #235 <Field int azh.bL>
	// 4241 7911:aload_0         
	// 4242 7912:getfield        #12  <Field azh a>
	// 4243 7915:getfield        #354 <Field int azh.au>
	// 4244 7918:ixor            
	// 4245 7919:putfield        #354 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4246 7922:aload_0         
	// 4247 7923:getfield        #12  <Field azh a>
	// 4248 7926:astore_1        
		abyte0.bk = ((azh) (abyte0)).H ^ a.bk;
	// 4249 7927:aload_1         
	// 4250 7928:aload_1         
	// 4251 7929:getfield        #62  <Field int azh.H>
	// 4252 7932:aload_0         
	// 4253 7933:getfield        #12  <Field azh a>
	// 4254 7936:getfield        #255 <Field int azh.bk>
	// 4255 7939:ixor            
	// 4256 7940:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 4257 7943:aload_0         
	// 4258 7944:getfield        #12  <Field azh a>
	// 4259 7947:astore_1        
		abyte0.H = ((azh) (abyte0)).A & ~a.bt;
	// 4260 7948:aload_1         
	// 4261 7949:aload_1         
	// 4262 7950:getfield        #321 <Field int azh.A>
	// 4263 7953:aload_0         
	// 4264 7954:getfield        #12  <Field azh a>
	// 4265 7957:getfield        #41  <Field int azh.bt>
	// 4266 7960:iconst_m1       
	// 4267 7961:ixor            
	// 4268 7962:iand            
	// 4269 7963:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 4270 7966:aload_0         
	// 4271 7967:getfield        #12  <Field azh a>
	// 4272 7970:astore_1        
		abyte0.bL = ((azh) (abyte0)).H & ~a.Q;
	// 4273 7971:aload_1         
	// 4274 7972:aload_1         
	// 4275 7973:getfield        #62  <Field int azh.H>
	// 4276 7976:aload_0         
	// 4277 7977:getfield        #12  <Field azh a>
	// 4278 7980:getfield        #176 <Field int azh.Q>
	// 4279 7983:iconst_m1       
	// 4280 7984:ixor            
	// 4281 7985:iand            
	// 4282 7986:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4283 7989:aload_0         
	// 4284 7990:getfield        #12  <Field azh a>
	// 4285 7993:astore_1        
		abyte0.bL = ((azh) (abyte0)).s ^ a.bL;
	// 4286 7994:aload_1         
	// 4287 7995:aload_1         
	// 4288 7996:getfield        #232 <Field int azh.s>
	// 4289 7999:aload_0         
	// 4290 8000:getfield        #12  <Field azh a>
	// 4291 8003:getfield        #235 <Field int azh.bL>
	// 4292 8006:ixor            
	// 4293 8007:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4294 8010:aload_0         
	// 4295 8011:getfield        #12  <Field azh a>
	// 4296 8014:astore_1        
		abyte0.r = ((azh) (abyte0)).H ^ a.r;
	// 4297 8015:aload_1         
	// 4298 8016:aload_1         
	// 4299 8017:getfield        #62  <Field int azh.H>
	// 4300 8020:aload_0         
	// 4301 8021:getfield        #12  <Field azh a>
	// 4302 8024:getfield        #161 <Field int azh.r>
	// 4303 8027:ixor            
	// 4304 8028:putfield        #161 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 4305 8031:aload_0         
	// 4306 8032:getfield        #12  <Field azh a>
	// 4307 8035:astore_1        
		abyte0.H = ((azh) (abyte0)).A & ~a.bu;
	// 4308 8036:aload_1         
	// 4309 8037:aload_1         
	// 4310 8038:getfield        #321 <Field int azh.A>
	// 4311 8041:aload_0         
	// 4312 8042:getfield        #12  <Field azh a>
	// 4313 8045:getfield        #179 <Field int azh.bu>
	// 4314 8048:iconst_m1       
	// 4315 8049:ixor            
	// 4316 8050:iand            
	// 4317 8051:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 4318 8054:aload_0         
	// 4319 8055:getfield        #12  <Field azh a>
	// 4320 8058:astore_1        
		abyte0.H = ((azh) (abyte0)).bu ^ a.H;
	// 4321 8059:aload_1         
	// 4322 8060:aload_1         
	// 4323 8061:getfield        #179 <Field int azh.bu>
	// 4324 8064:aload_0         
	// 4325 8065:getfield        #12  <Field azh a>
	// 4326 8068:getfield        #62  <Field int azh.H>
	// 4327 8071:ixor            
	// 4328 8072:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 4329 8075:aload_0         
	// 4330 8076:getfield        #12  <Field azh a>
	// 4331 8079:astore_1        
		abyte0.H = ((azh) (abyte0)).H & ~a.Q;
	// 4332 8080:aload_1         
	// 4333 8081:aload_1         
	// 4334 8082:getfield        #62  <Field int azh.H>
	// 4335 8085:aload_0         
	// 4336 8086:getfield        #12  <Field azh a>
	// 4337 8089:getfield        #176 <Field int azh.Q>
	// 4338 8092:iconst_m1       
	// 4339 8093:ixor            
	// 4340 8094:iand            
	// 4341 8095:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 4342 8098:aload_0         
	// 4343 8099:getfield        #12  <Field azh a>
	// 4344 8102:astore_1        
		abyte0.H = ((azh) (abyte0)).aS ^ a.H;
	// 4345 8103:aload_1         
	// 4346 8104:aload_1         
	// 4347 8105:getfield        #202 <Field int azh.aS>
	// 4348 8108:aload_0         
	// 4349 8109:getfield        #12  <Field azh a>
	// 4350 8112:getfield        #62  <Field int azh.H>
	// 4351 8115:ixor            
	// 4352 8116:putfield        #62  <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 4353 8119:aload_0         
	// 4354 8120:getfield        #12  <Field azh a>
	// 4355 8123:astore_1        
		abyte0.aS = ((azh) (abyte0)).A & ~a.I;
	// 4356 8124:aload_1         
	// 4357 8125:aload_1         
	// 4358 8126:getfield        #321 <Field int azh.A>
	// 4359 8129:aload_0         
	// 4360 8130:getfield        #12  <Field azh a>
	// 4361 8133:getfield        #249 <Field int azh.I>
	// 4362 8136:iconst_m1       
	// 4363 8137:ixor            
	// 4364 8138:iand            
	// 4365 8139:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 4366 8142:aload_0         
	// 4367 8143:getfield        #12  <Field azh a>
	// 4368 8146:astore_1        
		abyte0.aS = ((azh) (abyte0)).bt ^ a.aS;
	// 4369 8147:aload_1         
	// 4370 8148:aload_1         
	// 4371 8149:getfield        #41  <Field int azh.bt>
	// 4372 8152:aload_0         
	// 4373 8153:getfield        #12  <Field azh a>
	// 4374 8156:getfield        #202 <Field int azh.aS>
	// 4375 8159:ixor            
	// 4376 8160:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 4377 8163:aload_0         
	// 4378 8164:getfield        #12  <Field azh a>
	// 4379 8167:astore_1        
		abyte0.ck = ((azh) (abyte0)).aS ^ a.ck;
	// 4380 8168:aload_1         
	// 4381 8169:aload_1         
	// 4382 8170:getfield        #202 <Field int azh.aS>
	// 4383 8173:aload_0         
	// 4384 8174:getfield        #12  <Field azh a>
	// 4385 8177:getfield        #261 <Field int azh.ck>
	// 4386 8180:ixor            
	// 4387 8181:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 4388 8184:aload_0         
	// 4389 8185:getfield        #12  <Field azh a>
	// 4390 8188:astore_1        
		abyte0.Q = ((azh) (abyte0)).aS & ~a.Q;
	// 4391 8189:aload_1         
	// 4392 8190:aload_1         
	// 4393 8191:getfield        #202 <Field int azh.aS>
	// 4394 8194:aload_0         
	// 4395 8195:getfield        #12  <Field azh a>
	// 4396 8198:getfield        #176 <Field int azh.Q>
	// 4397 8201:iconst_m1       
	// 4398 8202:ixor            
	// 4399 8203:iand            
	// 4400 8204:putfield        #176 <Field int azh.Q>
		abyte0 = ((byte []) (a));
	// 4401 8207:aload_0         
	// 4402 8208:getfield        #12  <Field azh a>
	// 4403 8211:astore_1        
		abyte0.Q = ((azh) (abyte0)).M ^ a.Q;
	// 4404 8212:aload_1         
	// 4405 8213:aload_1         
	// 4406 8214:getfield        #53  <Field int azh.M>
	// 4407 8217:aload_0         
	// 4408 8218:getfield        #12  <Field azh a>
	// 4409 8221:getfield        #176 <Field int azh.Q>
	// 4410 8224:ixor            
	// 4411 8225:putfield        #176 <Field int azh.Q>
		abyte0 = ((byte []) (a));
	// 4412 8228:aload_0         
	// 4413 8229:getfield        #12  <Field azh a>
	// 4414 8232:astore_1        
		abyte0.cv = ((azh) (abyte0)).aS ^ a.cv;
	// 4415 8233:aload_1         
	// 4416 8234:aload_1         
	// 4417 8235:getfield        #202 <Field int azh.aS>
	// 4418 8238:aload_0         
	// 4419 8239:getfield        #12  <Field azh a>
	// 4420 8242:getfield        #44  <Field int azh.cv>
	// 4421 8245:ixor            
	// 4422 8246:putfield        #44  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	// 4423 8249:aload_0         
	// 4424 8250:getfield        #12  <Field azh a>
	// 4425 8253:astore_1        
		abyte0.aR = ((azh) (abyte0)).A & a.aR;
	// 4426 8254:aload_1         
	// 4427 8255:aload_1         
	// 4428 8256:getfield        #321 <Field int azh.A>
	// 4429 8259:aload_0         
	// 4430 8260:getfield        #12  <Field azh a>
	// 4431 8263:getfield        #26  <Field int azh.aR>
	// 4432 8266:iand            
	// 4433 8267:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4434 8270:aload_0         
	// 4435 8271:getfield        #12  <Field azh a>
	// 4436 8274:astore_1        
		abyte0.aR = ((azh) (abyte0)).i ^ a.aR;
	// 4437 8275:aload_1         
	// 4438 8276:aload_1         
	// 4439 8277:getfield        #122 <Field int azh.i>
	// 4440 8280:aload_0         
	// 4441 8281:getfield        #12  <Field azh a>
	// 4442 8284:getfield        #26  <Field int azh.aR>
	// 4443 8287:ixor            
	// 4444 8288:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4445 8291:aload_0         
	// 4446 8292:getfield        #12  <Field azh a>
	// 4447 8295:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aR ^ a.bQ;
	// 4448 8296:aload_1         
	// 4449 8297:aload_1         
	// 4450 8298:getfield        #26  <Field int azh.aR>
	// 4451 8301:aload_0         
	// 4452 8302:getfield        #12  <Field azh a>
	// 4453 8305:getfield        #170 <Field int azh.bQ>
	// 4454 8308:ixor            
	// 4455 8309:putfield        #170 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 4456 8312:aload_0         
	// 4457 8313:getfield        #12  <Field azh a>
	// 4458 8316:astore_1        
		abyte0.aR = ((azh) (abyte0)).j & ~a.bl;
	// 4459 8317:aload_1         
	// 4460 8318:aload_1         
	// 4461 8319:getfield        #285 <Field int azh.j>
	// 4462 8322:aload_0         
	// 4463 8323:getfield        #12  <Field azh a>
	// 4464 8326:getfield        #291 <Field int azh.bl>
	// 4465 8329:iconst_m1       
	// 4466 8330:ixor            
	// 4467 8331:iand            
	// 4468 8332:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4469 8335:aload_0         
	// 4470 8336:getfield        #12  <Field azh a>
	// 4471 8339:astore_1        
		abyte0.i = ((azh) (abyte0)).aR & a.bi;
	// 4472 8340:aload_1         
	// 4473 8341:aload_1         
	// 4474 8342:getfield        #26  <Field int azh.aR>
	// 4475 8345:aload_0         
	// 4476 8346:getfield        #12  <Field azh a>
	// 4477 8349:getfield        #294 <Field int azh.bi>
	// 4478 8352:iand            
	// 4479 8353:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 4480 8356:aload_0         
	// 4481 8357:getfield        #12  <Field azh a>
	// 4482 8360:astore_1        
		abyte0.i = ((azh) (abyte0)).bE & a.i;
	// 4483 8361:aload_1         
	// 4484 8362:aload_1         
	// 4485 8363:getfield        #312 <Field int azh.bE>
	// 4486 8366:aload_0         
	// 4487 8367:getfield        #12  <Field azh a>
	// 4488 8370:getfield        #122 <Field int azh.i>
	// 4489 8373:iand            
	// 4490 8374:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 4491 8377:aload_0         
	// 4492 8378:getfield        #12  <Field azh a>
	// 4493 8381:astore_1        
		abyte0.i = ((azh) (abyte0)).cr ^ a.i;
	// 4494 8382:aload_1         
	// 4495 8383:aload_1         
	// 4496 8384:getfield        #68  <Field int azh.cr>
	// 4497 8387:aload_0         
	// 4498 8388:getfield        #12  <Field azh a>
	// 4499 8391:getfield        #122 <Field int azh.i>
	// 4500 8394:ixor            
	// 4501 8395:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 4502 8398:aload_0         
	// 4503 8399:getfield        #12  <Field azh a>
	// 4504 8402:astore_1        
		abyte0.i = ((azh) (abyte0)).al | a.i;
	// 4505 8403:aload_1         
	// 4506 8404:aload_1         
	// 4507 8405:getfield        #315 <Field int azh.al>
	// 4508 8408:aload_0         
	// 4509 8409:getfield        #12  <Field azh a>
	// 4510 8412:getfield        #122 <Field int azh.i>
	// 4511 8415:ior             
	// 4512 8416:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 4513 8419:aload_0         
	// 4514 8420:getfield        #12  <Field azh a>
	// 4515 8423:astore_1        
		abyte0.cr = ((azh) (abyte0)).j & a.aL;
	// 4516 8424:aload_1         
	// 4517 8425:aload_1         
	// 4518 8426:getfield        #285 <Field int azh.j>
	// 4519 8429:aload_0         
	// 4520 8430:getfield        #12  <Field azh a>
	// 4521 8433:getfield        #288 <Field int azh.aL>
	// 4522 8436:iand            
	// 4523 8437:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 4524 8440:aload_0         
	// 4525 8441:getfield        #12  <Field azh a>
	// 4526 8444:astore_1        
		abyte0.K = ((azh) (abyte0)).cr ^ a.K;
	// 4527 8445:aload_1         
	// 4528 8446:aload_1         
	// 4529 8447:getfield        #68  <Field int azh.cr>
	// 4530 8450:aload_0         
	// 4531 8451:getfield        #12  <Field azh a>
	// 4532 8454:getfield        #357 <Field int azh.K>
	// 4533 8457:ixor            
	// 4534 8458:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4535 8461:aload_0         
	// 4536 8462:getfield        #12  <Field azh a>
	// 4537 8465:astore_1        
		abyte0.K = ((azh) (abyte0)).K & a.bi;
	// 4538 8466:aload_1         
	// 4539 8467:aload_1         
	// 4540 8468:getfield        #357 <Field int azh.K>
	// 4541 8471:aload_0         
	// 4542 8472:getfield        #12  <Field azh a>
	// 4543 8475:getfield        #294 <Field int azh.bi>
	// 4544 8478:iand            
	// 4545 8479:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4546 8482:aload_0         
	// 4547 8483:getfield        #12  <Field azh a>
	// 4548 8486:astore_1        
		abyte0.cr = ((azh) (abyte0)).j & ~a.bl;
	// 4549 8487:aload_1         
	// 4550 8488:aload_1         
	// 4551 8489:getfield        #285 <Field int azh.j>
	// 4552 8492:aload_0         
	// 4553 8493:getfield        #12  <Field azh a>
	// 4554 8496:getfield        #291 <Field int azh.bl>
	// 4555 8499:iconst_m1       
	// 4556 8500:ixor            
	// 4557 8501:iand            
	// 4558 8502:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 4559 8505:aload_0         
	// 4560 8506:getfield        #12  <Field azh a>
	// 4561 8509:astore_1        
		abyte0.cr = ((azh) (abyte0)).ay ^ a.cr;
	// 4562 8510:aload_1         
	// 4563 8511:aload_1         
	// 4564 8512:getfield        #59  <Field int azh.ay>
	// 4565 8515:aload_0         
	// 4566 8516:getfield        #12  <Field azh a>
	// 4567 8519:getfield        #68  <Field int azh.cr>
	// 4568 8522:ixor            
	// 4569 8523:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 4570 8526:aload_0         
	// 4571 8527:getfield        #12  <Field azh a>
	// 4572 8530:astore_1        
		abyte0.ag = ((azh) (abyte0)).cr ^ a.ag;
	// 4573 8531:aload_1         
	// 4574 8532:aload_1         
	// 4575 8533:getfield        #68  <Field int azh.cr>
	// 4576 8536:aload_0         
	// 4577 8537:getfield        #12  <Field azh a>
	// 4578 8540:getfield        #77  <Field int azh.ag>
	// 4579 8543:ixor            
	// 4580 8544:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 4581 8547:aload_0         
	// 4582 8548:getfield        #12  <Field azh a>
	// 4583 8551:astore_1        
		abyte0.ag = ((azh) (abyte0)).bE & ~a.ag;
	// 4584 8552:aload_1         
	// 4585 8553:aload_1         
	// 4586 8554:getfield        #312 <Field int azh.bE>
	// 4587 8557:aload_0         
	// 4588 8558:getfield        #12  <Field azh a>
	// 4589 8561:getfield        #77  <Field int azh.ag>
	// 4590 8564:iconst_m1       
	// 4591 8565:ixor            
	// 4592 8566:iand            
	// 4593 8567:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 4594 8570:aload_0         
	// 4595 8571:getfield        #12  <Field azh a>
	// 4596 8574:astore_1        
		abyte0.ag = ((azh) (abyte0)).bf ^ a.ag;
	// 4597 8575:aload_1         
	// 4598 8576:aload_1         
	// 4599 8577:getfield        #318 <Field int azh.bf>
	// 4600 8580:aload_0         
	// 4601 8581:getfield        #12  <Field azh a>
	// 4602 8584:getfield        #77  <Field int azh.ag>
	// 4603 8587:ixor            
	// 4604 8588:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 4605 8591:aload_0         
	// 4606 8592:getfield        #12  <Field azh a>
	// 4607 8595:astore_1        
		abyte0.ag = ((azh) (abyte0)).al & a.ag;
	// 4608 8596:aload_1         
	// 4609 8597:aload_1         
	// 4610 8598:getfield        #315 <Field int azh.al>
	// 4611 8601:aload_0         
	// 4612 8602:getfield        #12  <Field azh a>
	// 4613 8605:getfield        #77  <Field int azh.ag>
	// 4614 8608:iand            
	// 4615 8609:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 4616 8612:aload_0         
	// 4617 8613:getfield        #12  <Field azh a>
	// 4618 8616:astore_1        
		abyte0.ag = ((azh) (abyte0)).bX ^ a.ag;
	// 4619 8617:aload_1         
	// 4620 8618:aload_1         
	// 4621 8619:getfield        #309 <Field int azh.bX>
	// 4622 8622:aload_0         
	// 4623 8623:getfield        #12  <Field azh a>
	// 4624 8626:getfield        #77  <Field int azh.ag>
	// 4625 8629:ixor            
	// 4626 8630:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 4627 8633:aload_0         
	// 4628 8634:getfield        #12  <Field azh a>
	// 4629 8637:astore_1        
		abyte0.E = ((azh) (abyte0)).ag ^ a.E;
	// 4630 8638:aload_1         
	// 4631 8639:aload_1         
	// 4632 8640:getfield        #77  <Field int azh.ag>
	// 4633 8643:aload_0         
	// 4634 8644:getfield        #12  <Field azh a>
	// 4635 8647:getfield        #80  <Field int azh.E>
	// 4636 8650:ixor            
	// 4637 8651:putfield        #80  <Field int azh.E>
		abyte0 = ((byte []) (a));
	// 4638 8654:aload_0         
	// 4639 8655:getfield        #12  <Field azh a>
	// 4640 8658:astore_1        
		abyte0.ag = ((azh) (abyte0)).S ^ a.E;
	// 4641 8659:aload_1         
	// 4642 8660:aload_1         
	// 4643 8661:getfield        #149 <Field int azh.S>
	// 4644 8664:aload_0         
	// 4645 8665:getfield        #12  <Field azh a>
	// 4646 8668:getfield        #80  <Field int azh.E>
	// 4647 8671:ixor            
	// 4648 8672:putfield        #77  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 4649 8675:aload_0         
	// 4650 8676:getfield        #12  <Field azh a>
	// 4651 8679:astore_1        
		abyte0.bX = ((azh) (abyte0)).S & a.E;
	// 4652 8680:aload_1         
	// 4653 8681:aload_1         
	// 4654 8682:getfield        #149 <Field int azh.S>
	// 4655 8685:aload_0         
	// 4656 8686:getfield        #12  <Field azh a>
	// 4657 8689:getfield        #80  <Field int azh.E>
	// 4658 8692:iand            
	// 4659 8693:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 4660 8696:aload_0         
	// 4661 8697:getfield        #12  <Field azh a>
	// 4662 8700:astore_1        
		abyte0.bf = ((azh) (abyte0)).S & ~a.E;
	// 4663 8701:aload_1         
	// 4664 8702:aload_1         
	// 4665 8703:getfield        #149 <Field int azh.S>
	// 4666 8706:aload_0         
	// 4667 8707:getfield        #12  <Field azh a>
	// 4668 8710:getfield        #80  <Field int azh.E>
	// 4669 8713:iconst_m1       
	// 4670 8714:ixor            
	// 4671 8715:iand            
	// 4672 8716:putfield        #318 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 4673 8719:aload_0         
	// 4674 8720:getfield        #12  <Field azh a>
	// 4675 8723:astore_1        
		abyte0.cr = ((azh) (abyte0)).E | a.bf;
	// 4676 8724:aload_1         
	// 4677 8725:aload_1         
	// 4678 8726:getfield        #80  <Field int azh.E>
	// 4679 8729:aload_0         
	// 4680 8730:getfield        #12  <Field azh a>
	// 4681 8733:getfield        #318 <Field int azh.bf>
	// 4682 8736:ior             
	// 4683 8737:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 4684 8740:aload_0         
	// 4685 8741:getfield        #12  <Field azh a>
	// 4686 8744:astore_1        
		abyte0.cr = ((azh) (abyte0)).cr & ~a.cx;
	// 4687 8745:aload_1         
	// 4688 8746:aload_1         
	// 4689 8747:getfield        #68  <Field int azh.cr>
	// 4690 8750:aload_0         
	// 4691 8751:getfield        #12  <Field azh a>
	// 4692 8754:getfield        #185 <Field int azh.cx>
	// 4693 8757:iconst_m1       
	// 4694 8758:ixor            
	// 4695 8759:iand            
	// 4696 8760:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 4697 8763:aload_0         
	// 4698 8764:getfield        #12  <Field azh a>
	// 4699 8767:astore_1        
		abyte0.ay = ((azh) (abyte0)).E & ~a.S;
	// 4700 8768:aload_1         
	// 4701 8769:aload_1         
	// 4702 8770:getfield        #80  <Field int azh.E>
	// 4703 8773:aload_0         
	// 4704 8774:getfield        #12  <Field azh a>
	// 4705 8777:getfield        #149 <Field int azh.S>
	// 4706 8780:iconst_m1       
	// 4707 8781:ixor            
	// 4708 8782:iand            
	// 4709 8783:putfield        #59  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4710 8786:aload_0         
	// 4711 8787:getfield        #12  <Field azh a>
	// 4712 8790:astore_1        
		abyte0.aS = ((azh) (abyte0)).E & ~a.ay;
	// 4713 8791:aload_1         
	// 4714 8792:aload_1         
	// 4715 8793:getfield        #80  <Field int azh.E>
	// 4716 8796:aload_0         
	// 4717 8797:getfield        #12  <Field azh a>
	// 4718 8800:getfield        #59  <Field int azh.ay>
	// 4719 8803:iconst_m1       
	// 4720 8804:ixor            
	// 4721 8805:iand            
	// 4722 8806:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 4723 8809:aload_0         
	// 4724 8810:getfield        #12  <Field azh a>
	// 4725 8813:astore_1        
		abyte0.M = ((azh) (abyte0)).aS & ~a.cx;
	// 4726 8814:aload_1         
	// 4727 8815:aload_1         
	// 4728 8816:getfield        #202 <Field int azh.aS>
	// 4729 8819:aload_0         
	// 4730 8820:getfield        #12  <Field azh a>
	// 4731 8823:getfield        #185 <Field int azh.cx>
	// 4732 8826:iconst_m1       
	// 4733 8827:ixor            
	// 4734 8828:iand            
	// 4735 8829:putfield        #53  <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 4736 8832:aload_0         
	// 4737 8833:getfield        #12  <Field azh a>
	// 4738 8836:astore_1        
		abyte0.bt = ((azh) (abyte0)).cx | a.aS;
	// 4739 8837:aload_1         
	// 4740 8838:aload_1         
	// 4741 8839:getfield        #185 <Field int azh.cx>
	// 4742 8842:aload_0         
	// 4743 8843:getfield        #12  <Field azh a>
	// 4744 8846:getfield        #202 <Field int azh.aS>
	// 4745 8849:ior             
	// 4746 8850:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 4747 8853:aload_0         
	// 4748 8854:getfield        #12  <Field azh a>
	// 4749 8857:astore_1        
		abyte0.s = ((azh) (abyte0)).S | a.E;
	// 4750 8858:aload_1         
	// 4751 8859:aload_1         
	// 4752 8860:getfield        #149 <Field int azh.S>
	// 4753 8863:aload_0         
	// 4754 8864:getfield        #12  <Field azh a>
	// 4755 8867:getfield        #80  <Field int azh.E>
	// 4756 8870:ior             
	// 4757 8871:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 4758 8874:aload_0         
	// 4759 8875:getfield        #12  <Field azh a>
	// 4760 8878:astore_1        
		abyte0.bh = ~((azh) (abyte0)).E;
	// 4761 8879:aload_1         
	// 4762 8880:aload_1         
	// 4763 8881:getfield        #80  <Field int azh.E>
	// 4764 8884:iconst_m1       
	// 4765 8885:ixor            
	// 4766 8886:putfield        #360 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4767 8889:aload_0         
	// 4768 8890:getfield        #12  <Field azh a>
	// 4769 8893:astore_1        
		abyte0.ar = ((azh) (abyte0)).bl | a.j;
	// 4770 8894:aload_1         
	// 4771 8895:aload_1         
	// 4772 8896:getfield        #291 <Field int azh.bl>
	// 4773 8899:aload_0         
	// 4774 8900:getfield        #12  <Field azh a>
	// 4775 8903:getfield        #285 <Field int azh.j>
	// 4776 8906:ior             
	// 4777 8907:putfield        #363 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 4778 8910:aload_0         
	// 4779 8911:getfield        #12  <Field azh a>
	// 4780 8914:astore_1        
		abyte0.ar = ((azh) (abyte0)).C ^ a.ar;
	// 4781 8915:aload_1         
	// 4782 8916:aload_1         
	// 4783 8917:getfield        #35  <Field int azh.C>
	// 4784 8920:aload_0         
	// 4785 8921:getfield        #12  <Field azh a>
	// 4786 8924:getfield        #363 <Field int azh.ar>
	// 4787 8927:ixor            
	// 4788 8928:putfield        #363 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 4789 8931:aload_0         
	// 4790 8932:getfield        #12  <Field azh a>
	// 4791 8935:astore_1        
		abyte0.C = ((azh) (abyte0)).bi | a.ar;
	// 4792 8936:aload_1         
	// 4793 8937:aload_1         
	// 4794 8938:getfield        #294 <Field int azh.bi>
	// 4795 8941:aload_0         
	// 4796 8942:getfield        #12  <Field azh a>
	// 4797 8945:getfield        #363 <Field int azh.ar>
	// 4798 8948:ior             
	// 4799 8949:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 4800 8952:aload_0         
	// 4801 8953:getfield        #12  <Field azh a>
	// 4802 8956:astore_1        
		abyte0.C = ((azh) (abyte0)).aR ^ a.C;
	// 4803 8957:aload_1         
	// 4804 8958:aload_1         
	// 4805 8959:getfield        #26  <Field int azh.aR>
	// 4806 8962:aload_0         
	// 4807 8963:getfield        #12  <Field azh a>
	// 4808 8966:getfield        #35  <Field int azh.C>
	// 4809 8969:ixor            
	// 4810 8970:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 4811 8973:aload_0         
	// 4812 8974:getfield        #12  <Field azh a>
	// 4813 8977:astore_1        
		abyte0.C = ((azh) (abyte0)).bE & a.C;
	// 4814 8978:aload_1         
	// 4815 8979:aload_1         
	// 4816 8980:getfield        #312 <Field int azh.bE>
	// 4817 8983:aload_0         
	// 4818 8984:getfield        #12  <Field azh a>
	// 4819 8987:getfield        #35  <Field int azh.C>
	// 4820 8990:iand            
	// 4821 8991:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 4822 8994:aload_0         
	// 4823 8995:getfield        #12  <Field azh a>
	// 4824 8998:astore_1        
		abyte0.C = ((azh) (abyte0)).bD ^ a.C;
	// 4825 8999:aload_1         
	// 4826 9000:aload_1         
	// 4827 9001:getfield        #297 <Field int azh.bD>
	// 4828 9004:aload_0         
	// 4829 9005:getfield        #12  <Field azh a>
	// 4830 9008:getfield        #35  <Field int azh.C>
	// 4831 9011:ixor            
	// 4832 9012:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 4833 9015:aload_0         
	// 4834 9016:getfield        #12  <Field azh a>
	// 4835 9019:astore_1        
		abyte0.i = ((azh) (abyte0)).C ^ a.i;
	// 4836 9020:aload_1         
	// 4837 9021:aload_1         
	// 4838 9022:getfield        #35  <Field int azh.C>
	// 4839 9025:aload_0         
	// 4840 9026:getfield        #12  <Field azh a>
	// 4841 9029:getfield        #122 <Field int azh.i>
	// 4842 9032:ixor            
	// 4843 9033:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 4844 9036:aload_0         
	// 4845 9037:getfield        #12  <Field azh a>
	// 4846 9040:astore_1        
		abyte0.O = ((azh) (abyte0)).i ^ a.O;
	// 4847 9041:aload_1         
	// 4848 9042:aload_1         
	// 4849 9043:getfield        #122 <Field int azh.i>
	// 4850 9046:aload_0         
	// 4851 9047:getfield        #12  <Field azh a>
	// 4852 9050:getfield        #366 <Field int azh.O>
	// 4853 9053:ixor            
	// 4854 9054:putfield        #366 <Field int azh.O>
		abyte0 = ((byte []) (a));
	// 4855 9057:aload_0         
	// 4856 9058:getfield        #12  <Field azh a>
	// 4857 9061:astore_1        
		abyte0.i = ~((azh) (abyte0)).O;
	// 4858 9062:aload_1         
	// 4859 9063:aload_1         
	// 4860 9064:getfield        #366 <Field int azh.O>
	// 4861 9067:iconst_m1       
	// 4862 9068:ixor            
	// 4863 9069:putfield        #122 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 4864 9072:aload_0         
	// 4865 9073:getfield        #12  <Field azh a>
	// 4866 9076:astore_1        
		abyte0.K = ((azh) (abyte0)).ar ^ a.K;
	// 4867 9077:aload_1         
	// 4868 9078:aload_1         
	// 4869 9079:getfield        #363 <Field int azh.ar>
	// 4870 9082:aload_0         
	// 4871 9083:getfield        #12  <Field azh a>
	// 4872 9086:getfield        #357 <Field int azh.K>
	// 4873 9089:ixor            
	// 4874 9090:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4875 9093:aload_0         
	// 4876 9094:getfield        #12  <Field azh a>
	// 4877 9097:astore_1        
		abyte0.K = ((azh) (abyte0)).bE & a.K;
	// 4878 9098:aload_1         
	// 4879 9099:aload_1         
	// 4880 9100:getfield        #312 <Field int azh.bE>
	// 4881 9103:aload_0         
	// 4882 9104:getfield        #12  <Field azh a>
	// 4883 9107:getfield        #357 <Field int azh.K>
	// 4884 9110:iand            
	// 4885 9111:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4886 9114:aload_0         
	// 4887 9115:getfield        #12  <Field azh a>
	// 4888 9118:astore_1        
		abyte0.cc = ((azh) (abyte0)).ar ^ a.cc;
	// 4889 9119:aload_1         
	// 4890 9120:aload_1         
	// 4891 9121:getfield        #363 <Field int azh.ar>
	// 4892 9124:aload_0         
	// 4893 9125:getfield        #12  <Field azh a>
	// 4894 9128:getfield        #300 <Field int azh.cc>
	// 4895 9131:ixor            
	// 4896 9132:putfield        #300 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 4897 9135:aload_0         
	// 4898 9136:getfield        #12  <Field azh a>
	// 4899 9139:astore_1        
		abyte0.K = ((azh) (abyte0)).cc ^ a.K;
	// 4900 9140:aload_1         
	// 4901 9141:aload_1         
	// 4902 9142:getfield        #300 <Field int azh.cc>
	// 4903 9145:aload_0         
	// 4904 9146:getfield        #12  <Field azh a>
	// 4905 9149:getfield        #357 <Field int azh.K>
	// 4906 9152:ixor            
	// 4907 9153:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4908 9156:aload_0         
	// 4909 9157:getfield        #12  <Field azh a>
	// 4910 9160:astore_1        
		abyte0.K = ((azh) (abyte0)).K & ~a.al;
	// 4911 9161:aload_1         
	// 4912 9162:aload_1         
	// 4913 9163:getfield        #357 <Field int azh.K>
	// 4914 9166:aload_0         
	// 4915 9167:getfield        #12  <Field azh a>
	// 4916 9170:getfield        #315 <Field int azh.al>
	// 4917 9173:iconst_m1       
	// 4918 9174:ixor            
	// 4919 9175:iand            
	// 4920 9176:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4921 9179:aload_0         
	// 4922 9180:getfield        #12  <Field azh a>
	// 4923 9183:astore_1        
		abyte0.K = ((azh) (abyte0)).J ^ a.K;
	// 4924 9184:aload_1         
	// 4925 9185:aload_1         
	// 4926 9186:getfield        #306 <Field int azh.J>
	// 4927 9189:aload_0         
	// 4928 9190:getfield        #12  <Field azh a>
	// 4929 9193:getfield        #357 <Field int azh.K>
	// 4930 9196:ixor            
	// 4931 9197:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4932 9200:aload_0         
	// 4933 9201:getfield        #12  <Field azh a>
	// 4934 9204:astore_1        
		abyte0.m = ((azh) (abyte0)).K ^ a.m;
	// 4935 9205:aload_1         
	// 4936 9206:aload_1         
	// 4937 9207:getfield        #357 <Field int azh.K>
	// 4938 9210:aload_0         
	// 4939 9211:getfield        #12  <Field azh a>
	// 4940 9214:getfield        #369 <Field int azh.m>
	// 4941 9217:ixor            
	// 4942 9218:putfield        #369 <Field int azh.m>
		abyte0 = ((byte []) (a));
	// 4943 9221:aload_0         
	// 4944 9222:getfield        #12  <Field azh a>
	// 4945 9225:astore_1        
		abyte0.K = ((azh) (abyte0)).u & ~a.m;
	// 4946 9226:aload_1         
	// 4947 9227:aload_1         
	// 4948 9228:getfield        #270 <Field int azh.u>
	// 4949 9231:aload_0         
	// 4950 9232:getfield        #12  <Field azh a>
	// 4951 9235:getfield        #369 <Field int azh.m>
	// 4952 9238:iconst_m1       
	// 4953 9239:ixor            
	// 4954 9240:iand            
	// 4955 9241:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4956 9244:aload_0         
	// 4957 9245:getfield        #12  <Field azh a>
	// 4958 9248:astore_1        
		abyte0.J = ((azh) (abyte0)).K & ~a.bs;
	// 4959 9249:aload_1         
	// 4960 9250:aload_1         
	// 4961 9251:getfield        #357 <Field int azh.K>
	// 4962 9254:aload_0         
	// 4963 9255:getfield        #12  <Field azh a>
	// 4964 9258:getfield        #167 <Field int azh.bs>
	// 4965 9261:iconst_m1       
	// 4966 9262:ixor            
	// 4967 9263:iand            
	// 4968 9264:putfield        #306 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 4969 9267:aload_0         
	// 4970 9268:getfield        #12  <Field azh a>
	// 4971 9271:astore_1        
		abyte0.cc = ((azh) (abyte0)).m ^ a.u;
	// 4972 9272:aload_1         
	// 4973 9273:aload_1         
	// 4974 9274:getfield        #369 <Field int azh.m>
	// 4975 9277:aload_0         
	// 4976 9278:getfield        #12  <Field azh a>
	// 4977 9281:getfield        #270 <Field int azh.u>
	// 4978 9284:ixor            
	// 4979 9285:putfield        #300 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 4980 9288:aload_0         
	// 4981 9289:getfield        #12  <Field azh a>
	// 4982 9292:astore_1        
		abyte0.ar = ((azh) (abyte0)).m & ~a.u;
	// 4983 9293:aload_1         
	// 4984 9294:aload_1         
	// 4985 9295:getfield        #369 <Field int azh.m>
	// 4986 9298:aload_0         
	// 4987 9299:getfield        #12  <Field azh a>
	// 4988 9302:getfield        #270 <Field int azh.u>
	// 4989 9305:iconst_m1       
	// 4990 9306:ixor            
	// 4991 9307:iand            
	// 4992 9308:putfield        #363 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 4993 9311:aload_0         
	// 4994 9312:getfield        #12  <Field azh a>
	// 4995 9315:astore_1        
		abyte0.C = ((azh) (abyte0)).ar | a.u;
	// 4996 9316:aload_1         
	// 4997 9317:aload_1         
	// 4998 9318:getfield        #363 <Field int azh.ar>
	// 4999 9321:aload_0         
	// 5000 9322:getfield        #12  <Field azh a>
	// 5001 9325:getfield        #270 <Field int azh.u>
	// 5002 9328:ior             
	// 5003 9329:putfield        #35  <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 5004 9332:aload_0         
	// 5005 9333:getfield        #12  <Field azh a>
	// 5006 9336:astore_1        
		abyte0.bD = ~((azh) (abyte0)).m;
	// 5007 9337:aload_1         
	// 5008 9338:aload_1         
	// 5009 9339:getfield        #369 <Field int azh.m>
	// 5010 9342:iconst_m1       
	// 5011 9343:ixor            
	// 5012 9344:putfield        #297 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 5013 9347:aload_0         
	// 5014 9348:getfield        #12  <Field azh a>
	// 5015 9351:astore_1        
		abyte0.aR = ((azh) (abyte0)).u & a.m;
	// 5016 9352:aload_1         
	// 5017 9353:aload_1         
	// 5018 9354:getfield        #270 <Field int azh.u>
	// 5019 9357:aload_0         
	// 5020 9358:getfield        #12  <Field azh a>
	// 5021 9361:getfield        #369 <Field int azh.m>
	// 5022 9364:iand            
	// 5023 9365:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 5024 9368:aload_0         
	// 5025 9369:getfield        #12  <Field azh a>
	// 5026 9372:astore_1        
		abyte0.aN = ((azh) (abyte0)).U ^ a.aN;
	// 5027 9373:aload_1         
	// 5028 9374:aload_1         
	// 5029 9375:getfield        #47  <Field int azh.U>
	// 5030 9378:aload_0         
	// 5031 9379:getfield        #12  <Field azh a>
	// 5032 9382:getfield        #29  <Field int azh.aN>
	// 5033 9385:ixor            
	// 5034 9386:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5035 9389:aload_0         
	// 5036 9390:getfield        #12  <Field azh a>
	// 5037 9393:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aN ^ a.aQ;
	// 5038 9394:aload_1         
	// 5039 9395:aload_1         
	// 5040 9396:getfield        #29  <Field int azh.aN>
	// 5041 9399:aload_0         
	// 5042 9400:getfield        #12  <Field azh a>
	// 5043 9403:getfield        #86  <Field int azh.aQ>
	// 5044 9406:ixor            
	// 5045 9407:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 5046 9410:aload_0         
	// 5047 9411:getfield        #12  <Field azh a>
	// 5048 9414:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ac & a.aQ;
	// 5049 9415:aload_1         
	// 5050 9416:aload_1         
	// 5051 9417:getfield        #101 <Field int azh.ac>
	// 5052 9420:aload_0         
	// 5053 9421:getfield        #12  <Field azh a>
	// 5054 9424:getfield        #86  <Field int azh.aQ>
	// 5055 9427:iand            
	// 5056 9428:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 5057 9431:aload_0         
	// 5058 9432:getfield        #12  <Field azh a>
	// 5059 9435:astore_1        
		abyte0.aQ = ((azh) (abyte0)).av ^ a.aQ;
	// 5060 9436:aload_1         
	// 5061 9437:aload_1         
	// 5062 9438:getfield        #98  <Field int azh.av>
	// 5063 9441:aload_0         
	// 5064 9442:getfield        #12  <Field azh a>
	// 5065 9445:getfield        #86  <Field int azh.aQ>
	// 5066 9448:ixor            
	// 5067 9449:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 5068 9452:aload_0         
	// 5069 9453:getfield        #12  <Field azh a>
	// 5070 9456:astore_1        
		abyte0.aj = ((azh) (abyte0)).aQ ^ a.aj;
	// 5071 9457:aload_1         
	// 5072 9458:aload_1         
	// 5073 9459:getfield        #86  <Field int azh.aQ>
	// 5074 9462:aload_0         
	// 5075 9463:getfield        #12  <Field azh a>
	// 5076 9466:getfield        #372 <Field int azh.aj>
	// 5077 9469:ixor            
	// 5078 9470:putfield        #372 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 5079 9473:aload_0         
	// 5080 9474:getfield        #12  <Field azh a>
	// 5081 9477:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aj & ~a.aW;
	// 5082 9478:aload_1         
	// 5083 9479:aload_1         
	// 5084 9480:getfield        #372 <Field int azh.aj>
	// 5085 9483:aload_0         
	// 5086 9484:getfield        #12  <Field azh a>
	// 5087 9487:getfield        #375 <Field int azh.aW>
	// 5088 9490:iconst_m1       
	// 5089 9491:ixor            
	// 5090 9492:iand            
	// 5091 9493:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 5092 9496:aload_0         
	// 5093 9497:getfield        #12  <Field azh a>
	// 5094 9500:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bG ^ a.aQ;
	// 5095 9501:aload_1         
	// 5096 9502:aload_1         
	// 5097 9503:getfield        #378 <Field int azh.bG>
	// 5098 9506:aload_0         
	// 5099 9507:getfield        #12  <Field azh a>
	// 5100 9510:getfield        #86  <Field int azh.aQ>
	// 5101 9513:ixor            
	// 5102 9514:putfield        #86  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 5103 9517:aload_0         
	// 5104 9518:getfield        #12  <Field azh a>
	// 5105 9521:astore_1        
		abyte0.av = ((azh) (abyte0)).aj & ~a.N;
	// 5106 9522:aload_1         
	// 5107 9523:aload_1         
	// 5108 9524:getfield        #372 <Field int azh.aj>
	// 5109 9527:aload_0         
	// 5110 9528:getfield        #12  <Field azh a>
	// 5111 9531:getfield        #381 <Field int azh.N>
	// 5112 9534:iconst_m1       
	// 5113 9535:ixor            
	// 5114 9536:iand            
	// 5115 9537:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5116 9540:aload_0         
	// 5117 9541:getfield        #12  <Field azh a>
	// 5118 9544:astore_1        
		abyte0.av = ((azh) (abyte0)).b ^ a.av;
	// 5119 9545:aload_1         
	// 5120 9546:aload_1         
	// 5121 9547:getfield        #384 <Field int azh.b>
	// 5122 9550:aload_0         
	// 5123 9551:getfield        #12  <Field azh a>
	// 5124 9554:getfield        #98  <Field int azh.av>
	// 5125 9557:ixor            
	// 5126 9558:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5127 9561:aload_0         
	// 5128 9562:getfield        #12  <Field azh a>
	// 5129 9565:astore_1        
		abyte0.av = ((azh) (abyte0)).av & ~a.p;
	// 5130 9566:aload_1         
	// 5131 9567:aload_1         
	// 5132 9568:getfield        #98  <Field int azh.av>
	// 5133 9571:aload_0         
	// 5134 9572:getfield        #12  <Field azh a>
	// 5135 9575:getfield        #387 <Field int azh.p>
	// 5136 9578:iconst_m1       
	// 5137 9579:ixor            
	// 5138 9580:iand            
	// 5139 9581:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5140 9584:aload_0         
	// 5141 9585:getfield        #12  <Field azh a>
	// 5142 9588:astore_1        
		abyte0.av = ((azh) (abyte0)).aD ^ a.av;
	// 5143 9589:aload_1         
	// 5144 9590:aload_1         
	// 5145 9591:getfield        #390 <Field int azh.aD>
	// 5146 9594:aload_0         
	// 5147 9595:getfield        #12  <Field azh a>
	// 5148 9598:getfield        #98  <Field int azh.av>
	// 5149 9601:ixor            
	// 5150 9602:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5151 9605:aload_0         
	// 5152 9606:getfield        #12  <Field azh a>
	// 5153 9609:astore_1        
		abyte0.aN = ((azh) (abyte0)).aj & ~a.N;
	// 5154 9610:aload_1         
	// 5155 9611:aload_1         
	// 5156 9612:getfield        #372 <Field int azh.aj>
	// 5157 9615:aload_0         
	// 5158 9616:getfield        #12  <Field azh a>
	// 5159 9619:getfield        #381 <Field int azh.N>
	// 5160 9622:iconst_m1       
	// 5161 9623:ixor            
	// 5162 9624:iand            
	// 5163 9625:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5164 9628:aload_0         
	// 5165 9629:getfield        #12  <Field azh a>
	// 5166 9632:astore_1        
		abyte0.aN = ((azh) (abyte0)).N ^ a.aN;
	// 5167 9633:aload_1         
	// 5168 9634:aload_1         
	// 5169 9635:getfield        #381 <Field int azh.N>
	// 5170 9638:aload_0         
	// 5171 9639:getfield        #12  <Field azh a>
	// 5172 9642:getfield        #29  <Field int azh.aN>
	// 5173 9645:ixor            
	// 5174 9646:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5175 9649:aload_0         
	// 5176 9650:getfield        #12  <Field azh a>
	// 5177 9653:astore_1        
		abyte0.aN = ((azh) (abyte0)).F | a.aN;
	// 5178 9654:aload_1         
	// 5179 9655:aload_1         
	// 5180 9656:getfield        #393 <Field int azh.F>
	// 5181 9659:aload_0         
	// 5182 9660:getfield        #12  <Field azh a>
	// 5183 9663:getfield        #29  <Field int azh.aN>
	// 5184 9666:ior             
	// 5185 9667:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5186 9670:aload_0         
	// 5187 9671:getfield        #12  <Field azh a>
	// 5188 9674:astore_1        
		abyte0.U = ((azh) (abyte0)).aj & a.bG;
	// 5189 9675:aload_1         
	// 5190 9676:aload_1         
	// 5191 9677:getfield        #372 <Field int azh.aj>
	// 5192 9680:aload_0         
	// 5193 9681:getfield        #12  <Field azh a>
	// 5194 9684:getfield        #378 <Field int azh.bG>
	// 5195 9687:iand            
	// 5196 9688:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 5197 9691:aload_0         
	// 5198 9692:getfield        #12  <Field azh a>
	// 5199 9695:astore_1        
		abyte0.U = ((azh) (abyte0)).N ^ a.U;
	// 5200 9696:aload_1         
	// 5201 9697:aload_1         
	// 5202 9698:getfield        #381 <Field int azh.N>
	// 5203 9701:aload_0         
	// 5204 9702:getfield        #12  <Field azh a>
	// 5205 9705:getfield        #47  <Field int azh.U>
	// 5206 9708:ixor            
	// 5207 9709:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 5208 9712:aload_0         
	// 5209 9713:getfield        #12  <Field azh a>
	// 5210 9716:astore_1        
		abyte0.aU = ((azh) (abyte0)).aj & a.cp;
	// 5211 9717:aload_1         
	// 5212 9718:aload_1         
	// 5213 9719:getfield        #372 <Field int azh.aj>
	// 5214 9722:aload_0         
	// 5215 9723:getfield        #12  <Field azh a>
	// 5216 9726:getfield        #396 <Field int azh.cp>
	// 5217 9729:iand            
	// 5218 9730:putfield        #399 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 5219 9733:aload_0         
	// 5220 9734:getfield        #12  <Field azh a>
	// 5221 9737:astore_1        
		abyte0.aU = ((azh) (abyte0)).bZ ^ a.aU;
	// 5222 9738:aload_1         
	// 5223 9739:aload_1         
	// 5224 9740:getfield        #402 <Field int azh.bZ>
	// 5225 9743:aload_0         
	// 5226 9744:getfield        #12  <Field azh a>
	// 5227 9747:getfield        #399 <Field int azh.aU>
	// 5228 9750:ixor            
	// 5229 9751:putfield        #399 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 5230 9754:aload_0         
	// 5231 9755:getfield        #12  <Field azh a>
	// 5232 9758:astore_1        
		abyte0.bj = ((azh) (abyte0)).aU ^ a.bj;
	// 5233 9759:aload_1         
	// 5234 9760:aload_1         
	// 5235 9761:getfield        #399 <Field int azh.aU>
	// 5236 9764:aload_0         
	// 5237 9765:getfield        #12  <Field azh a>
	// 5238 9768:getfield        #405 <Field int azh.bj>
	// 5239 9771:ixor            
	// 5240 9772:putfield        #405 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5241 9775:aload_0         
	// 5242 9776:getfield        #12  <Field azh a>
	// 5243 9779:astore_1        
		abyte0.aU = ((azh) (abyte0)).aj & ~a.bG;
	// 5244 9780:aload_1         
	// 5245 9781:aload_1         
	// 5246 9782:getfield        #372 <Field int azh.aj>
	// 5247 9785:aload_0         
	// 5248 9786:getfield        #12  <Field azh a>
	// 5249 9789:getfield        #378 <Field int azh.bG>
	// 5250 9792:iconst_m1       
	// 5251 9793:ixor            
	// 5252 9794:iand            
	// 5253 9795:putfield        #399 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 5254 9798:aload_0         
	// 5255 9799:getfield        #12  <Field azh a>
	// 5256 9802:astore_1        
		abyte0.aU = ((azh) (abyte0)).b ^ a.aU;
	// 5257 9803:aload_1         
	// 5258 9804:aload_1         
	// 5259 9805:getfield        #384 <Field int azh.b>
	// 5260 9808:aload_0         
	// 5261 9809:getfield        #12  <Field azh a>
	// 5262 9812:getfield        #399 <Field int azh.aU>
	// 5263 9815:ixor            
	// 5264 9816:putfield        #399 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 5265 9819:aload_0         
	// 5266 9820:getfield        #12  <Field azh a>
	// 5267 9823:astore_1        
		abyte0.aq = ((azh) (abyte0)).aj & a.cp;
	// 5268 9824:aload_1         
	// 5269 9825:aload_1         
	// 5270 9826:getfield        #372 <Field int azh.aj>
	// 5271 9829:aload_0         
	// 5272 9830:getfield        #12  <Field azh a>
	// 5273 9833:getfield        #396 <Field int azh.cp>
	// 5274 9836:iand            
	// 5275 9837:putfield        #408 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5276 9840:aload_0         
	// 5277 9841:getfield        #12  <Field azh a>
	// 5278 9844:astore_1        
		abyte0.aN = ((azh) (abyte0)).aq ^ a.aN;
	// 5279 9845:aload_1         
	// 5280 9846:aload_1         
	// 5281 9847:getfield        #408 <Field int azh.aq>
	// 5282 9850:aload_0         
	// 5283 9851:getfield        #12  <Field azh a>
	// 5284 9854:getfield        #29  <Field int azh.aN>
	// 5285 9857:ixor            
	// 5286 9858:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5287 9861:aload_0         
	// 5288 9862:getfield        #12  <Field azh a>
	// 5289 9865:astore_1        
		abyte0.aN = ((azh) (abyte0)).x & a.aN;
	// 5290 9866:aload_1         
	// 5291 9867:aload_1         
	// 5292 9868:getfield        #411 <Field int azh.x>
	// 5293 9871:aload_0         
	// 5294 9872:getfield        #12  <Field azh a>
	// 5295 9875:getfield        #29  <Field int azh.aN>
	// 5296 9878:iand            
	// 5297 9879:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5298 9882:aload_0         
	// 5299 9883:getfield        #12  <Field azh a>
	// 5300 9886:astore_1        
		abyte0.aq = ((azh) (abyte0)).aj & ~a.cE;
	// 5301 9887:aload_1         
	// 5302 9888:aload_1         
	// 5303 9889:getfield        #372 <Field int azh.aj>
	// 5304 9892:aload_0         
	// 5305 9893:getfield        #12  <Field azh a>
	// 5306 9896:getfield        #414 <Field int azh.cE>
	// 5307 9899:iconst_m1       
	// 5308 9900:ixor            
	// 5309 9901:iand            
	// 5310 9902:putfield        #408 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5311 9905:aload_0         
	// 5312 9906:getfield        #12  <Field azh a>
	// 5313 9909:astore_1        
		abyte0.aq = ((azh) (abyte0)).p | a.aq;
	// 5314 9910:aload_1         
	// 5315 9911:aload_1         
	// 5316 9912:getfield        #387 <Field int azh.p>
	// 5317 9915:aload_0         
	// 5318 9916:getfield        #12  <Field azh a>
	// 5319 9919:getfield        #408 <Field int azh.aq>
	// 5320 9922:ior             
	// 5321 9923:putfield        #408 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5322 9926:aload_0         
	// 5323 9927:getfield        #12  <Field azh a>
	// 5324 9930:astore_1        
		abyte0.aq = ((azh) (abyte0)).U ^ a.aq;
	// 5325 9931:aload_1         
	// 5326 9932:aload_1         
	// 5327 9933:getfield        #47  <Field int azh.U>
	// 5328 9936:aload_0         
	// 5329 9937:getfield        #12  <Field azh a>
	// 5330 9940:getfield        #408 <Field int azh.aq>
	// 5331 9943:ixor            
	// 5332 9944:putfield        #408 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5333 9947:aload_0         
	// 5334 9948:getfield        #12  <Field azh a>
	// 5335 9951:astore_1        
		abyte0.U = ((azh) (abyte0)).aj & ~a.aW;
	// 5336 9952:aload_1         
	// 5337 9953:aload_1         
	// 5338 9954:getfield        #372 <Field int azh.aj>
	// 5339 9957:aload_0         
	// 5340 9958:getfield        #12  <Field azh a>
	// 5341 9961:getfield        #375 <Field int azh.aW>
	// 5342 9964:iconst_m1       
	// 5343 9965:ixor            
	// 5344 9966:iand            
	// 5345 9967:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 5346 9970:aload_0         
	// 5347 9971:getfield        #12  <Field azh a>
	// 5348 9974:astore_1        
		abyte0.U = ((azh) (abyte0)).bZ ^ a.U;
	// 5349 9975:aload_1         
	// 5350 9976:aload_1         
	// 5351 9977:getfield        #402 <Field int azh.bZ>
	// 5352 9980:aload_0         
	// 5353 9981:getfield        #12  <Field azh a>
	// 5354 9984:getfield        #47  <Field int azh.U>
	// 5355 9987:ixor            
	// 5356 9988:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 5357 9991:aload_0         
	// 5358 9992:getfield        #12  <Field azh a>
	// 5359 9995:astore_1        
		abyte0.n = ((azh) (abyte0)).aj & a.cp;
	// 5360 9996:aload_1         
	// 5361 9997:aload_1         
	// 5362 9998:getfield        #372 <Field int azh.aj>
	// 5363 10001:aload_0         
	// 5364 10002:getfield        #12  <Field azh a>
	// 5365 10005:getfield        #396 <Field int azh.cp>
	// 5366 10008:iand            
	// 5367 10009:putfield        #417 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 5368 10012:aload_0         
	// 5369 10013:getfield        #12  <Field azh a>
	// 5370 10016:astore_1        
		abyte0.n = ((azh) (abyte0)).aW ^ a.n;
	// 5371 10017:aload_1         
	// 5372 10018:aload_1         
	// 5373 10019:getfield        #375 <Field int azh.aW>
	// 5374 10022:aload_0         
	// 5375 10023:getfield        #12  <Field azh a>
	// 5376 10026:getfield        #417 <Field int azh.n>
	// 5377 10029:ixor            
	// 5378 10030:putfield        #417 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 5379 10033:aload_0         
	// 5380 10034:getfield        #12  <Field azh a>
	// 5381 10037:astore_1        
		abyte0.n = ((azh) (abyte0)).F | a.n;
	// 5382 10038:aload_1         
	// 5383 10039:aload_1         
	// 5384 10040:getfield        #393 <Field int azh.F>
	// 5385 10043:aload_0         
	// 5386 10044:getfield        #12  <Field azh a>
	// 5387 10047:getfield        #417 <Field int azh.n>
	// 5388 10050:ior             
	// 5389 10051:putfield        #417 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 5390 10054:aload_0         
	// 5391 10055:getfield        #12  <Field azh a>
	// 5392 10058:astore_1        
		abyte0.bV = ((azh) (abyte0)).aj & ~a.bV;
	// 5393 10059:aload_1         
	// 5394 10060:aload_1         
	// 5395 10061:getfield        #372 <Field int azh.aj>
	// 5396 10064:aload_0         
	// 5397 10065:getfield        #12  <Field azh a>
	// 5398 10068:getfield        #420 <Field int azh.bV>
	// 5399 10071:iconst_m1       
	// 5400 10072:ixor            
	// 5401 10073:iand            
	// 5402 10074:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5403 10077:aload_0         
	// 5404 10078:getfield        #12  <Field azh a>
	// 5405 10081:astore_1        
		abyte0.bV = ((azh) (abyte0)).bA ^ a.bV;
	// 5406 10082:aload_1         
	// 5407 10083:aload_1         
	// 5408 10084:getfield        #423 <Field int azh.bA>
	// 5409 10087:aload_0         
	// 5410 10088:getfield        #12  <Field azh a>
	// 5411 10091:getfield        #420 <Field int azh.bV>
	// 5412 10094:ixor            
	// 5413 10095:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5414 10098:aload_0         
	// 5415 10099:getfield        #12  <Field azh a>
	// 5416 10102:astore_1        
		abyte0.cd = ((azh) (abyte0)).bV ^ a.cd;
	// 5417 10103:aload_1         
	// 5418 10104:aload_1         
	// 5419 10105:getfield        #420 <Field int azh.bV>
	// 5420 10108:aload_0         
	// 5421 10109:getfield        #12  <Field azh a>
	// 5422 10112:getfield        #426 <Field int azh.cd>
	// 5423 10115:ixor            
	// 5424 10116:putfield        #426 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5425 10119:aload_0         
	// 5426 10120:getfield        #12  <Field azh a>
	// 5427 10123:astore_1        
		abyte0.bV = ((azh) (abyte0)).cd & a.aI;
	// 5428 10124:aload_1         
	// 5429 10125:aload_1         
	// 5430 10126:getfield        #426 <Field int azh.cd>
	// 5431 10129:aload_0         
	// 5432 10130:getfield        #12  <Field azh a>
	// 5433 10133:getfield        #146 <Field int azh.aI>
	// 5434 10136:iand            
	// 5435 10137:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5436 10140:aload_0         
	// 5437 10141:getfield        #12  <Field azh a>
	// 5438 10144:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.y;
	// 5439 10145:aload_1         
	// 5440 10146:aload_1         
	// 5441 10147:getfield        #420 <Field int azh.bV>
	// 5442 10150:aload_0         
	// 5443 10151:getfield        #12  <Field azh a>
	// 5444 10154:getfield        #143 <Field int azh.y>
	// 5445 10157:iconst_m1       
	// 5446 10158:ixor            
	// 5447 10159:iand            
	// 5448 10160:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5449 10163:aload_0         
	// 5450 10164:getfield        #12  <Field azh a>
	// 5451 10167:astore_1        
		abyte0.bV = ((azh) (abyte0)).aI ^ a.bV;
	// 5452 10168:aload_1         
	// 5453 10169:aload_1         
	// 5454 10170:getfield        #146 <Field int azh.aI>
	// 5455 10173:aload_0         
	// 5456 10174:getfield        #12  <Field azh a>
	// 5457 10177:getfield        #420 <Field int azh.bV>
	// 5458 10180:ixor            
	// 5459 10181:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5460 10184:aload_0         
	// 5461 10185:getfield        #12  <Field azh a>
	// 5462 10188:astore_1        
		abyte0.g = ((azh) (abyte0)).bV ^ a.g;
	// 5463 10189:aload_1         
	// 5464 10190:aload_1         
	// 5465 10191:getfield        #420 <Field int azh.bV>
	// 5466 10194:aload_0         
	// 5467 10195:getfield        #12  <Field azh a>
	// 5468 10198:getfield        #95  <Field int azh.g>
	// 5469 10201:ixor            
	// 5470 10202:putfield        #95  <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 5471 10205:aload_0         
	// 5472 10206:getfield        #12  <Field azh a>
	// 5473 10209:astore_1        
		abyte0.bA = ((azh) (abyte0)).aI & ~a.cd;
	// 5474 10210:aload_1         
	// 5475 10211:aload_1         
	// 5476 10212:getfield        #146 <Field int azh.aI>
	// 5477 10215:aload_0         
	// 5478 10216:getfield        #12  <Field azh a>
	// 5479 10219:getfield        #426 <Field int azh.cd>
	// 5480 10222:iconst_m1       
	// 5481 10223:ixor            
	// 5482 10224:iand            
	// 5483 10225:putfield        #423 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 5484 10228:aload_0         
	// 5485 10229:getfield        #12  <Field azh a>
	// 5486 10232:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA & ~a.y;
	// 5487 10233:aload_1         
	// 5488 10234:aload_1         
	// 5489 10235:getfield        #423 <Field int azh.bA>
	// 5490 10238:aload_0         
	// 5491 10239:getfield        #12  <Field azh a>
	// 5492 10242:getfield        #143 <Field int azh.y>
	// 5493 10245:iconst_m1       
	// 5494 10246:ixor            
	// 5495 10247:iand            
	// 5496 10248:putfield        #423 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 5497 10251:aload_0         
	// 5498 10252:getfield        #12  <Field azh a>
	// 5499 10255:astore_1        
		abyte0.bA = ((azh) (abyte0)).aI ^ a.bA;
	// 5500 10256:aload_1         
	// 5501 10257:aload_1         
	// 5502 10258:getfield        #146 <Field int azh.aI>
	// 5503 10261:aload_0         
	// 5504 10262:getfield        #12  <Field azh a>
	// 5505 10265:getfield        #423 <Field int azh.bA>
	// 5506 10268:ixor            
	// 5507 10269:putfield        #423 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 5508 10272:aload_0         
	// 5509 10273:getfield        #12  <Field azh a>
	// 5510 10276:astore_1        
		abyte0.bH = ((azh) (abyte0)).cd & ~a.aI;
	// 5511 10277:aload_1         
	// 5512 10278:aload_1         
	// 5513 10279:getfield        #426 <Field int azh.cd>
	// 5514 10282:aload_0         
	// 5515 10283:getfield        #12  <Field azh a>
	// 5516 10286:getfield        #146 <Field int azh.aI>
	// 5517 10289:iconst_m1       
	// 5518 10290:ixor            
	// 5519 10291:iand            
	// 5520 10292:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 5521 10295:aload_0         
	// 5522 10296:getfield        #12  <Field azh a>
	// 5523 10299:astore_1        
		abyte0.bm = ((azh) (abyte0)).bH & ~a.y;
	// 5524 10300:aload_1         
	// 5525 10301:aload_1         
	// 5526 10302:getfield        #429 <Field int azh.bH>
	// 5527 10305:aload_0         
	// 5528 10306:getfield        #12  <Field azh a>
	// 5529 10309:getfield        #143 <Field int azh.y>
	// 5530 10312:iconst_m1       
	// 5531 10313:ixor            
	// 5532 10314:iand            
	// 5533 10315:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5534 10318:aload_0         
	// 5535 10319:getfield        #12  <Field azh a>
	// 5536 10322:astore_1        
		abyte0.bm = ((azh) (abyte0)).bH ^ a.bm;
	// 5537 10323:aload_1         
	// 5538 10324:aload_1         
	// 5539 10325:getfield        #429 <Field int azh.bH>
	// 5540 10328:aload_0         
	// 5541 10329:getfield        #12  <Field azh a>
	// 5542 10332:getfield        #432 <Field int azh.bm>
	// 5543 10335:ixor            
	// 5544 10336:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5545 10339:aload_0         
	// 5546 10340:getfield        #12  <Field azh a>
	// 5547 10343:astore_1        
		abyte0.by = ((azh) (abyte0)).bm ^ a.by;
	// 5548 10344:aload_1         
	// 5549 10345:aload_1         
	// 5550 10346:getfield        #432 <Field int azh.bm>
	// 5551 10349:aload_0         
	// 5552 10350:getfield        #12  <Field azh a>
	// 5553 10353:getfield        #137 <Field int azh.by>
	// 5554 10356:ixor            
	// 5555 10357:putfield        #137 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5556 10360:aload_0         
	// 5557 10361:getfield        #12  <Field azh a>
	// 5558 10364:astore_1        
		abyte0.bm = ((azh) (abyte0)).y | a.bH;
	// 5559 10365:aload_1         
	// 5560 10366:aload_1         
	// 5561 10367:getfield        #143 <Field int azh.y>
	// 5562 10370:aload_0         
	// 5563 10371:getfield        #12  <Field azh a>
	// 5564 10374:getfield        #429 <Field int azh.bH>
	// 5565 10377:ior             
	// 5566 10378:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5567 10381:aload_0         
	// 5568 10382:getfield        #12  <Field azh a>
	// 5569 10385:astore_1        
		abyte0.bm = ((azh) (abyte0)).aI ^ a.bm;
	// 5570 10386:aload_1         
	// 5571 10387:aload_1         
	// 5572 10388:getfield        #146 <Field int azh.aI>
	// 5573 10391:aload_0         
	// 5574 10392:getfield        #12  <Field azh a>
	// 5575 10395:getfield        #432 <Field int azh.bm>
	// 5576 10398:ixor            
	// 5577 10399:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5578 10402:aload_0         
	// 5579 10403:getfield        #12  <Field azh a>
	// 5580 10406:astore_1        
		abyte0.bH = ((azh) (abyte0)).y | a.bH;
	// 5581 10407:aload_1         
	// 5582 10408:aload_1         
	// 5583 10409:getfield        #143 <Field int azh.y>
	// 5584 10412:aload_0         
	// 5585 10413:getfield        #12  <Field azh a>
	// 5586 10416:getfield        #429 <Field int azh.bH>
	// 5587 10419:ior             
	// 5588 10420:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 5589 10423:aload_0         
	// 5590 10424:getfield        #12  <Field azh a>
	// 5591 10427:astore_1        
		abyte0.aB = ((azh) (abyte0)).cd | a.aI;
	// 5592 10428:aload_1         
	// 5593 10429:aload_1         
	// 5594 10430:getfield        #426 <Field int azh.cd>
	// 5595 10433:aload_0         
	// 5596 10434:getfield        #12  <Field azh a>
	// 5597 10437:getfield        #146 <Field int azh.aI>
	// 5598 10440:ior             
	// 5599 10441:putfield        #435 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 5600 10444:aload_0         
	// 5601 10445:getfield        #12  <Field azh a>
	// 5602 10448:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB ^ a.y;
	// 5603 10449:aload_1         
	// 5604 10450:aload_1         
	// 5605 10451:getfield        #435 <Field int azh.aB>
	// 5606 10454:aload_0         
	// 5607 10455:getfield        #12  <Field azh a>
	// 5608 10458:getfield        #143 <Field int azh.y>
	// 5609 10461:ixor            
	// 5610 10462:putfield        #435 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 5611 10465:aload_0         
	// 5612 10466:getfield        #12  <Field azh a>
	// 5613 10469:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB & a.S;
	// 5614 10470:aload_1         
	// 5615 10471:aload_1         
	// 5616 10472:getfield        #435 <Field int azh.aB>
	// 5617 10475:aload_0         
	// 5618 10476:getfield        #12  <Field azh a>
	// 5619 10479:getfield        #149 <Field int azh.S>
	// 5620 10482:iand            
	// 5621 10483:putfield        #435 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 5622 10486:aload_0         
	// 5623 10487:getfield        #12  <Field azh a>
	// 5624 10490:astore_1        
		abyte0.bc = ((azh) (abyte0)).cd & ~a.y;
	// 5625 10491:aload_1         
	// 5626 10492:aload_1         
	// 5627 10493:getfield        #426 <Field int azh.cd>
	// 5628 10496:aload_0         
	// 5629 10497:getfield        #12  <Field azh a>
	// 5630 10500:getfield        #143 <Field int azh.y>
	// 5631 10503:iconst_m1       
	// 5632 10504:ixor            
	// 5633 10505:iand            
	// 5634 10506:putfield        #438 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 5635 10509:aload_0         
	// 5636 10510:getfield        #12  <Field azh a>
	// 5637 10513:astore_1        
		abyte0.bc = ((azh) (abyte0)).aI ^ a.bc;
	// 5638 10514:aload_1         
	// 5639 10515:aload_1         
	// 5640 10516:getfield        #146 <Field int azh.aI>
	// 5641 10519:aload_0         
	// 5642 10520:getfield        #12  <Field azh a>
	// 5643 10523:getfield        #438 <Field int azh.bc>
	// 5644 10526:ixor            
	// 5645 10527:putfield        #438 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 5646 10530:aload_0         
	// 5647 10531:getfield        #12  <Field azh a>
	// 5648 10534:astore_1        
		abyte0.bW = ((azh) (abyte0)).S | a.bc;
	// 5649 10535:aload_1         
	// 5650 10536:aload_1         
	// 5651 10537:getfield        #149 <Field int azh.S>
	// 5652 10540:aload_0         
	// 5653 10541:getfield        #12  <Field azh a>
	// 5654 10544:getfield        #438 <Field int azh.bc>
	// 5655 10547:ior             
	// 5656 10548:putfield        #441 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 5657 10551:aload_0         
	// 5658 10552:getfield        #12  <Field azh a>
	// 5659 10555:astore_1        
		abyte0.bW = ((azh) (abyte0)).bV ^ a.bW;
	// 5660 10556:aload_1         
	// 5661 10557:aload_1         
	// 5662 10558:getfield        #420 <Field int azh.bV>
	// 5663 10561:aload_0         
	// 5664 10562:getfield        #12  <Field azh a>
	// 5665 10565:getfield        #441 <Field int azh.bW>
	// 5666 10568:ixor            
	// 5667 10569:putfield        #441 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 5668 10572:aload_0         
	// 5669 10573:getfield        #12  <Field azh a>
	// 5670 10576:astore_1        
		abyte0.bV = ((azh) (abyte0)).bc & ~a.S;
	// 5671 10577:aload_1         
	// 5672 10578:aload_1         
	// 5673 10579:getfield        #438 <Field int azh.bc>
	// 5674 10582:aload_0         
	// 5675 10583:getfield        #12  <Field azh a>
	// 5676 10586:getfield        #149 <Field int azh.S>
	// 5677 10589:iconst_m1       
	// 5678 10590:ixor            
	// 5679 10591:iand            
	// 5680 10592:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5681 10595:aload_0         
	// 5682 10596:getfield        #12  <Field azh a>
	// 5683 10599:astore_1        
		abyte0.bV = ((azh) (abyte0)).aI ^ a.bV;
	// 5684 10600:aload_1         
	// 5685 10601:aload_1         
	// 5686 10602:getfield        #146 <Field int azh.aI>
	// 5687 10605:aload_0         
	// 5688 10606:getfield        #12  <Field azh a>
	// 5689 10609:getfield        #420 <Field int azh.bV>
	// 5690 10612:ixor            
	// 5691 10613:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5692 10616:aload_0         
	// 5693 10617:getfield        #12  <Field azh a>
	// 5694 10620:astore_1        
		abyte0.aB = ((azh) (abyte0)).bc ^ a.aB;
	// 5695 10621:aload_1         
	// 5696 10622:aload_1         
	// 5697 10623:getfield        #438 <Field int azh.bc>
	// 5698 10626:aload_0         
	// 5699 10627:getfield        #12  <Field azh a>
	// 5700 10630:getfield        #435 <Field int azh.aB>
	// 5701 10633:ixor            
	// 5702 10634:putfield        #435 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 5703 10637:aload_0         
	// 5704 10638:getfield        #12  <Field azh a>
	// 5705 10641:astore_1        
		abyte0.bc = ~((azh) (abyte0)).cd;
	// 5706 10642:aload_1         
	// 5707 10643:aload_1         
	// 5708 10644:getfield        #426 <Field int azh.cd>
	// 5709 10647:iconst_m1       
	// 5710 10648:ixor            
	// 5711 10649:putfield        #438 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 5712 10652:aload_0         
	// 5713 10653:getfield        #12  <Field azh a>
	// 5714 10656:astore_1        
		abyte0.aC = ((azh) (abyte0)).cd ^ a.aI;
	// 5715 10657:aload_1         
	// 5716 10658:aload_1         
	// 5717 10659:getfield        #426 <Field int azh.cd>
	// 5718 10662:aload_0         
	// 5719 10663:getfield        #12  <Field azh a>
	// 5720 10666:getfield        #146 <Field int azh.aI>
	// 5721 10669:ixor            
	// 5722 10670:putfield        #444 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5723 10673:aload_0         
	// 5724 10674:getfield        #12  <Field azh a>
	// 5725 10677:astore_1        
		abyte0.cD = ((azh) (abyte0)).aC ^ a.cD;
	// 5726 10678:aload_1         
	// 5727 10679:aload_1         
	// 5728 10680:getfield        #444 <Field int azh.aC>
	// 5729 10683:aload_0         
	// 5730 10684:getfield        #12  <Field azh a>
	// 5731 10687:getfield        #65  <Field int azh.cD>
	// 5732 10690:ixor            
	// 5733 10691:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 5734 10694:aload_0         
	// 5735 10695:getfield        #12  <Field azh a>
	// 5736 10698:astore_1        
		abyte0.ah = ((azh) (abyte0)).S | a.cD;
	// 5737 10699:aload_1         
	// 5738 10700:aload_1         
	// 5739 10701:getfield        #149 <Field int azh.S>
	// 5740 10704:aload_0         
	// 5741 10705:getfield        #12  <Field azh a>
	// 5742 10708:getfield        #65  <Field int azh.cD>
	// 5743 10711:ior             
	// 5744 10712:putfield        #447 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 5745 10715:aload_0         
	// 5746 10716:getfield        #12  <Field azh a>
	// 5747 10719:astore_1        
		abyte0.ah = ((azh) (abyte0)).bH ^ a.ah;
	// 5748 10720:aload_1         
	// 5749 10721:aload_1         
	// 5750 10722:getfield        #429 <Field int azh.bH>
	// 5751 10725:aload_0         
	// 5752 10726:getfield        #12  <Field azh a>
	// 5753 10729:getfield        #447 <Field int azh.ah>
	// 5754 10732:ixor            
	// 5755 10733:putfield        #447 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 5756 10736:aload_0         
	// 5757 10737:getfield        #12  <Field azh a>
	// 5758 10740:astore_1        
		abyte0.cD = ((azh) (abyte0)).cD & ~a.S;
	// 5759 10741:aload_1         
	// 5760 10742:aload_1         
	// 5761 10743:getfield        #65  <Field int azh.cD>
	// 5762 10746:aload_0         
	// 5763 10747:getfield        #12  <Field azh a>
	// 5764 10750:getfield        #149 <Field int azh.S>
	// 5765 10753:iconst_m1       
	// 5766 10754:ixor            
	// 5767 10755:iand            
	// 5768 10756:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 5769 10759:aload_0         
	// 5770 10760:getfield        #12  <Field azh a>
	// 5771 10763:astore_1        
		abyte0.bH = ((azh) (abyte0)).y | a.aC;
	// 5772 10764:aload_1         
	// 5773 10765:aload_1         
	// 5774 10766:getfield        #143 <Field int azh.y>
	// 5775 10769:aload_0         
	// 5776 10770:getfield        #12  <Field azh a>
	// 5777 10773:getfield        #444 <Field int azh.aC>
	// 5778 10776:ior             
	// 5779 10777:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 5780 10780:aload_0         
	// 5781 10781:getfield        #12  <Field azh a>
	// 5782 10784:astore_1        
		abyte0.bH = ((azh) (abyte0)).cd ^ a.bH;
	// 5783 10785:aload_1         
	// 5784 10786:aload_1         
	// 5785 10787:getfield        #426 <Field int azh.cd>
	// 5786 10790:aload_0         
	// 5787 10791:getfield        #12  <Field azh a>
	// 5788 10794:getfield        #429 <Field int azh.bH>
	// 5789 10797:ixor            
	// 5790 10798:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 5791 10801:aload_0         
	// 5792 10802:getfield        #12  <Field azh a>
	// 5793 10805:astore_1        
		abyte0.q = ((azh) (abyte0)).S | a.bH;
	// 5794 10806:aload_1         
	// 5795 10807:aload_1         
	// 5796 10808:getfield        #149 <Field int azh.S>
	// 5797 10811:aload_0         
	// 5798 10812:getfield        #12  <Field azh a>
	// 5799 10815:getfield        #429 <Field int azh.bH>
	// 5800 10818:ior             
	// 5801 10819:putfield        #450 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 5802 10822:aload_0         
	// 5803 10823:getfield        #12  <Field azh a>
	// 5804 10826:astore_1        
		abyte0.q = ((azh) (abyte0)).aI ^ a.q;
	// 5805 10827:aload_1         
	// 5806 10828:aload_1         
	// 5807 10829:getfield        #146 <Field int azh.aI>
	// 5808 10832:aload_0         
	// 5809 10833:getfield        #12  <Field azh a>
	// 5810 10836:getfield        #450 <Field int azh.q>
	// 5811 10839:ixor            
	// 5812 10840:putfield        #450 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 5813 10843:aload_0         
	// 5814 10844:getfield        #12  <Field azh a>
	// 5815 10847:astore_1        
		abyte0.bH = ((azh) (abyte0)).S | a.bH;
	// 5816 10848:aload_1         
	// 5817 10849:aload_1         
	// 5818 10850:getfield        #149 <Field int azh.S>
	// 5819 10853:aload_0         
	// 5820 10854:getfield        #12  <Field azh a>
	// 5821 10857:getfield        #429 <Field int azh.bH>
	// 5822 10860:ior             
	// 5823 10861:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 5824 10864:aload_0         
	// 5825 10865:getfield        #12  <Field azh a>
	// 5826 10868:astore_1        
		abyte0.bH = ((azh) (abyte0)).bm ^ a.bH;
	// 5827 10869:aload_1         
	// 5828 10870:aload_1         
	// 5829 10871:getfield        #432 <Field int azh.bm>
	// 5830 10874:aload_0         
	// 5831 10875:getfield        #12  <Field azh a>
	// 5832 10878:getfield        #429 <Field int azh.bH>
	// 5833 10881:ixor            
	// 5834 10882:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 5835 10885:aload_0         
	// 5836 10886:getfield        #12  <Field azh a>
	// 5837 10889:astore_1        
		abyte0.bm = ((azh) (abyte0)).y | a.aC;
	// 5838 10890:aload_1         
	// 5839 10891:aload_1         
	// 5840 10892:getfield        #143 <Field int azh.y>
	// 5841 10895:aload_0         
	// 5842 10896:getfield        #12  <Field azh a>
	// 5843 10899:getfield        #444 <Field int azh.aC>
	// 5844 10902:ior             
	// 5845 10903:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5846 10906:aload_0         
	// 5847 10907:getfield        #12  <Field azh a>
	// 5848 10910:astore_1        
		abyte0.bm = ((azh) (abyte0)).aI ^ a.bm;
	// 5849 10911:aload_1         
	// 5850 10912:aload_1         
	// 5851 10913:getfield        #146 <Field int azh.aI>
	// 5852 10916:aload_0         
	// 5853 10917:getfield        #12  <Field azh a>
	// 5854 10920:getfield        #432 <Field int azh.bm>
	// 5855 10923:ixor            
	// 5856 10924:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5857 10927:aload_0         
	// 5858 10928:getfield        #12  <Field azh a>
	// 5859 10931:astore_1        
		abyte0.aI = ((azh) (abyte0)).bm & ~a.S;
	// 5860 10932:aload_1         
	// 5861 10933:aload_1         
	// 5862 10934:getfield        #432 <Field int azh.bm>
	// 5863 10937:aload_0         
	// 5864 10938:getfield        #12  <Field azh a>
	// 5865 10941:getfield        #149 <Field int azh.S>
	// 5866 10944:iconst_m1       
	// 5867 10945:ixor            
	// 5868 10946:iand            
	// 5869 10947:putfield        #146 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 5870 10950:aload_0         
	// 5871 10951:getfield        #12  <Field azh a>
	// 5872 10954:astore_1        
		abyte0.aI = ((azh) (abyte0)).bm ^ a.aI;
	// 5873 10955:aload_1         
	// 5874 10956:aload_1         
	// 5875 10957:getfield        #432 <Field int azh.bm>
	// 5876 10960:aload_0         
	// 5877 10961:getfield        #12  <Field azh a>
	// 5878 10964:getfield        #146 <Field int azh.aI>
	// 5879 10967:ixor            
	// 5880 10968:putfield        #146 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 5881 10971:aload_0         
	// 5882 10972:getfield        #12  <Field azh a>
	// 5883 10975:astore_1        
		abyte0.bm = ((azh) (abyte0)).aC ^ a.y;
	// 5884 10976:aload_1         
	// 5885 10977:aload_1         
	// 5886 10978:getfield        #444 <Field int azh.aC>
	// 5887 10981:aload_0         
	// 5888 10982:getfield        #12  <Field azh a>
	// 5889 10985:getfield        #143 <Field int azh.y>
	// 5890 10988:ixor            
	// 5891 10989:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5892 10992:aload_0         
	// 5893 10993:getfield        #12  <Field azh a>
	// 5894 10996:astore_1        
		abyte0.d = ((azh) (abyte0)).bm ^ a.d;
	// 5895 10997:aload_1         
	// 5896 10998:aload_1         
	// 5897 10999:getfield        #432 <Field int azh.bm>
	// 5898 11002:aload_0         
	// 5899 11003:getfield        #12  <Field azh a>
	// 5900 11006:getfield        #140 <Field int azh.d>
	// 5901 11009:ixor            
	// 5902 11010:putfield        #140 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 5903 11013:aload_0         
	// 5904 11014:getfield        #12  <Field azh a>
	// 5905 11017:astore_1        
		abyte0.bm = ((azh) (abyte0)).aC & ~a.y;
	// 5906 11018:aload_1         
	// 5907 11019:aload_1         
	// 5908 11020:getfield        #444 <Field int azh.aC>
	// 5909 11023:aload_0         
	// 5910 11024:getfield        #12  <Field azh a>
	// 5911 11027:getfield        #143 <Field int azh.y>
	// 5912 11030:iconst_m1       
	// 5913 11031:ixor            
	// 5914 11032:iand            
	// 5915 11033:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5916 11036:aload_0         
	// 5917 11037:getfield        #12  <Field azh a>
	// 5918 11040:astore_1        
		abyte0.bm = ((azh) (abyte0)).cd ^ a.bm;
	// 5919 11041:aload_1         
	// 5920 11042:aload_1         
	// 5921 11043:getfield        #426 <Field int azh.cd>
	// 5922 11046:aload_0         
	// 5923 11047:getfield        #12  <Field azh a>
	// 5924 11050:getfield        #432 <Field int azh.bm>
	// 5925 11053:ixor            
	// 5926 11054:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5927 11057:aload_0         
	// 5928 11058:getfield        #12  <Field azh a>
	// 5929 11061:astore_1        
		abyte0.cD = ((azh) (abyte0)).bm ^ a.cD;
	// 5930 11062:aload_1         
	// 5931 11063:aload_1         
	// 5932 11064:getfield        #432 <Field int azh.bm>
	// 5933 11067:aload_0         
	// 5934 11068:getfield        #12  <Field azh a>
	// 5935 11071:getfield        #65  <Field int azh.cD>
	// 5936 11074:ixor            
	// 5937 11075:putfield        #65  <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 5938 11078:aload_0         
	// 5939 11079:getfield        #12  <Field azh a>
	// 5940 11082:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC & a.S;
	// 5941 11083:aload_1         
	// 5942 11084:aload_1         
	// 5943 11085:getfield        #444 <Field int azh.aC>
	// 5944 11088:aload_0         
	// 5945 11089:getfield        #12  <Field azh a>
	// 5946 11092:getfield        #149 <Field int azh.S>
	// 5947 11095:iand            
	// 5948 11096:putfield        #444 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5949 11099:aload_0         
	// 5950 11100:getfield        #12  <Field azh a>
	// 5951 11103:astore_1        
		abyte0.aC = ((azh) (abyte0)).ao ^ a.aC;
	// 5952 11104:aload_1         
	// 5953 11105:aload_1         
	// 5954 11106:getfield        #38  <Field int azh.ao>
	// 5955 11109:aload_0         
	// 5956 11110:getfield        #12  <Field azh a>
	// 5957 11113:getfield        #444 <Field int azh.aC>
	// 5958 11116:ixor            
	// 5959 11117:putfield        #444 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5960 11120:aload_0         
	// 5961 11121:getfield        #12  <Field azh a>
	// 5962 11124:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd & ~a.S;
	// 5963 11125:aload_1         
	// 5964 11126:aload_1         
	// 5965 11127:getfield        #426 <Field int azh.cd>
	// 5966 11130:aload_0         
	// 5967 11131:getfield        #12  <Field azh a>
	// 5968 11134:getfield        #149 <Field int azh.S>
	// 5969 11137:iconst_m1       
	// 5970 11138:ixor            
	// 5971 11139:iand            
	// 5972 11140:putfield        #426 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5973 11143:aload_0         
	// 5974 11144:getfield        #12  <Field azh a>
	// 5975 11147:astore_1        
		abyte0.cd = ((azh) (abyte0)).bA ^ a.cd;
	// 5976 11148:aload_1         
	// 5977 11149:aload_1         
	// 5978 11150:getfield        #423 <Field int azh.bA>
	// 5979 11153:aload_0         
	// 5980 11154:getfield        #12  <Field azh a>
	// 5981 11157:getfield        #426 <Field int azh.cd>
	// 5982 11160:ixor            
	// 5983 11161:putfield        #426 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5984 11164:aload_0         
	// 5985 11165:getfield        #12  <Field azh a>
	// 5986 11168:astore_1        
		abyte0.bS = ((azh) (abyte0)).aj & ~a.bS;
	// 5987 11169:aload_1         
	// 5988 11170:aload_1         
	// 5989 11171:getfield        #372 <Field int azh.aj>
	// 5990 11174:aload_0         
	// 5991 11175:getfield        #12  <Field azh a>
	// 5992 11178:getfield        #453 <Field int azh.bS>
	// 5993 11181:iconst_m1       
	// 5994 11182:ixor            
	// 5995 11183:iand            
	// 5996 11184:putfield        #453 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5997 11187:aload_0         
	// 5998 11188:getfield        #12  <Field azh a>
	// 5999 11191:astore_1        
		abyte0.bS = ((azh) (abyte0)).cq ^ a.bS;
	// 6000 11192:aload_1         
	// 6001 11193:aload_1         
	// 6002 11194:getfield        #456 <Field int azh.cq>
	// 6003 11197:aload_0         
	// 6004 11198:getfield        #12  <Field azh a>
	// 6005 11201:getfield        #453 <Field int azh.bS>
	// 6006 11204:ixor            
	// 6007 11205:putfield        #453 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 6008 11208:aload_0         
	// 6009 11209:getfield        #12  <Field azh a>
	// 6010 11212:astore_1        
		abyte0.c = ((azh) (abyte0)).bS ^ a.c;
	// 6011 11213:aload_1         
	// 6012 11214:aload_1         
	// 6013 11215:getfield        #453 <Field int azh.bS>
	// 6014 11218:aload_0         
	// 6015 11219:getfield        #12  <Field azh a>
	// 6016 11222:getfield        #459 <Field int azh.c>
	// 6017 11225:ixor            
	// 6018 11226:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 6019 11229:aload_0         
	// 6020 11230:getfield        #12  <Field azh a>
	// 6021 11233:astore_1        
		abyte0.bS = ((azh) (abyte0)).bb & a.c;
	// 6022 11234:aload_1         
	// 6023 11235:aload_1         
	// 6024 11236:getfield        #330 <Field int azh.bb>
	// 6025 11239:aload_0         
	// 6026 11240:getfield        #12  <Field azh a>
	// 6027 11243:getfield        #459 <Field int azh.c>
	// 6028 11246:iand            
	// 6029 11247:putfield        #453 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 6030 11250:aload_0         
	// 6031 11251:getfield        #12  <Field azh a>
	// 6032 11254:astore_1        
		abyte0.bS = ((azh) (abyte0)).af ^ a.bS;
	// 6033 11255:aload_1         
	// 6034 11256:aload_1         
	// 6035 11257:getfield        #247 <Field int azh.af>
	// 6036 11260:aload_0         
	// 6037 11261:getfield        #12  <Field azh a>
	// 6038 11264:getfield        #453 <Field int azh.bS>
	// 6039 11267:ixor            
	// 6040 11268:putfield        #453 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 6041 11271:aload_0         
	// 6042 11272:getfield        #12  <Field azh a>
	// 6043 11275:astore_1        
		abyte0.cq = ((azh) (abyte0)).bF & a.c;
	// 6044 11276:aload_1         
	// 6045 11277:aload_1         
	// 6046 11278:getfield        #276 <Field int azh.bF>
	// 6047 11281:aload_0         
	// 6048 11282:getfield        #12  <Field azh a>
	// 6049 11285:getfield        #459 <Field int azh.c>
	// 6050 11288:iand            
	// 6051 11289:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 6052 11292:aload_0         
	// 6053 11293:getfield        #12  <Field azh a>
	// 6054 11296:astore_1        
		abyte0.aX = ((azh) (abyte0)).c | a.aX;
	// 6055 11297:aload_1         
	// 6056 11298:aload_1         
	// 6057 11299:getfield        #459 <Field int azh.c>
	// 6058 11302:aload_0         
	// 6059 11303:getfield        #12  <Field azh a>
	// 6060 11306:getfield        #339 <Field int azh.aX>
	// 6061 11309:ior             
	// 6062 11310:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6063 11313:aload_0         
	// 6064 11314:getfield        #12  <Field azh a>
	// 6065 11317:astore_1        
		abyte0.aX = ((azh) (abyte0)).bo ^ a.aX;
	// 6066 11318:aload_1         
	// 6067 11319:aload_1         
	// 6068 11320:getfield        #303 <Field int azh.bo>
	// 6069 11323:aload_0         
	// 6070 11324:getfield        #12  <Field azh a>
	// 6071 11327:getfield        #339 <Field int azh.aX>
	// 6072 11330:ixor            
	// 6073 11331:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6074 11334:aload_0         
	// 6075 11335:getfield        #12  <Field azh a>
	// 6076 11338:astore_1        
		abyte0.bA = ((azh) (abyte0)).c & ~a.y;
	// 6077 11339:aload_1         
	// 6078 11340:aload_1         
	// 6079 11341:getfield        #459 <Field int azh.c>
	// 6080 11344:aload_0         
	// 6081 11345:getfield        #12  <Field azh a>
	// 6082 11348:getfield        #143 <Field int azh.y>
	// 6083 11351:iconst_m1       
	// 6084 11352:ixor            
	// 6085 11353:iand            
	// 6086 11354:putfield        #423 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6087 11357:aload_0         
	// 6088 11358:getfield        #12  <Field azh a>
	// 6089 11361:astore_1        
		abyte0.ao = ((azh) (abyte0)).bA ^ a.bF;
	// 6090 11362:aload_1         
	// 6091 11363:aload_1         
	// 6092 11364:getfield        #423 <Field int azh.bA>
	// 6093 11367:aload_0         
	// 6094 11368:getfield        #12  <Field azh a>
	// 6095 11371:getfield        #276 <Field int azh.bF>
	// 6096 11374:ixor            
	// 6097 11375:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6098 11378:aload_0         
	// 6099 11379:getfield        #12  <Field azh a>
	// 6100 11382:astore_1        
		abyte0.bm = ((azh) (abyte0)).bF & a.bA;
	// 6101 11383:aload_1         
	// 6102 11384:aload_1         
	// 6103 11385:getfield        #276 <Field int azh.bF>
	// 6104 11388:aload_0         
	// 6105 11389:getfield        #12  <Field azh a>
	// 6106 11392:getfield        #423 <Field int azh.bA>
	// 6107 11395:iand            
	// 6108 11396:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6109 11399:aload_0         
	// 6110 11400:getfield        #12  <Field azh a>
	// 6111 11403:astore_1        
		abyte0.bm = ((azh) (abyte0)).bA ^ a.bm;
	// 6112 11404:aload_1         
	// 6113 11405:aload_1         
	// 6114 11406:getfield        #423 <Field int azh.bA>
	// 6115 11409:aload_0         
	// 6116 11410:getfield        #12  <Field azh a>
	// 6117 11413:getfield        #432 <Field int azh.bm>
	// 6118 11416:ixor            
	// 6119 11417:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6120 11420:aload_0         
	// 6121 11421:getfield        #12  <Field azh a>
	// 6122 11424:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & a.bT;
	// 6123 11425:aload_1         
	// 6124 11426:aload_1         
	// 6125 11427:getfield        #432 <Field int azh.bm>
	// 6126 11430:aload_0         
	// 6127 11431:getfield        #12  <Field azh a>
	// 6128 11434:getfield        #282 <Field int azh.bT>
	// 6129 11437:iand            
	// 6130 11438:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6131 11441:aload_0         
	// 6132 11442:getfield        #12  <Field azh a>
	// 6133 11445:astore_1        
		abyte0.bA = ((azh) (abyte0)).bx & ~a.c;
	// 6134 11446:aload_1         
	// 6135 11447:aload_1         
	// 6136 11448:getfield        #336 <Field int azh.bx>
	// 6137 11451:aload_0         
	// 6138 11452:getfield        #12  <Field azh a>
	// 6139 11455:getfield        #459 <Field int azh.c>
	// 6140 11458:iconst_m1       
	// 6141 11459:ixor            
	// 6142 11460:iand            
	// 6143 11461:putfield        #423 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6144 11464:aload_0         
	// 6145 11465:getfield        #12  <Field azh a>
	// 6146 11468:astore_1        
		abyte0.bA = ((azh) (abyte0)).bJ ^ a.bA;
	// 6147 11469:aload_1         
	// 6148 11470:aload_1         
	// 6149 11471:getfield        #342 <Field int azh.bJ>
	// 6150 11474:aload_0         
	// 6151 11475:getfield        #12  <Field azh a>
	// 6152 11478:getfield        #423 <Field int azh.bA>
	// 6153 11481:ixor            
	// 6154 11482:putfield        #423 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6155 11485:aload_0         
	// 6156 11486:getfield        #12  <Field azh a>
	// 6157 11489:astore_1        
		abyte0.ax = ((azh) (abyte0)).c | a.at;
	// 6158 11490:aload_1         
	// 6159 11491:aload_1         
	// 6160 11492:getfield        #459 <Field int azh.c>
	// 6161 11495:aload_0         
	// 6162 11496:getfield        #12  <Field azh a>
	// 6163 11499:getfield        #327 <Field int azh.at>
	// 6164 11502:ior             
	// 6165 11503:putfield        #462 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6166 11506:aload_0         
	// 6167 11507:getfield        #12  <Field azh a>
	// 6168 11510:astore_1        
		abyte0.ax = ((azh) (abyte0)).k & ~a.ax;
	// 6169 11511:aload_1         
	// 6170 11512:aload_1         
	// 6171 11513:getfield        #465 <Field int azh.k>
	// 6172 11516:aload_0         
	// 6173 11517:getfield        #12  <Field azh a>
	// 6174 11520:getfield        #462 <Field int azh.ax>
	// 6175 11523:iconst_m1       
	// 6176 11524:ixor            
	// 6177 11525:iand            
	// 6178 11526:putfield        #462 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6179 11529:aload_0         
	// 6180 11530:getfield        #12  <Field azh a>
	// 6181 11533:astore_1        
		abyte0.ct = ((azh) (abyte0)).ct ^ a.c;
	// 6182 11534:aload_1         
	// 6183 11535:aload_1         
	// 6184 11536:getfield        #324 <Field int azh.ct>
	// 6185 11539:aload_0         
	// 6186 11540:getfield        #12  <Field azh a>
	// 6187 11543:getfield        #459 <Field int azh.c>
	// 6188 11546:ixor            
	// 6189 11547:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 6190 11550:aload_0         
	// 6191 11551:getfield        #12  <Field azh a>
	// 6192 11554:astore_1        
		abyte0.ba = ((azh) (abyte0)).ct ^ a.ba;
	// 6193 11555:aload_1         
	// 6194 11556:aload_1         
	// 6195 11557:getfield        #324 <Field int azh.ct>
	// 6196 11560:aload_0         
	// 6197 11561:getfield        #12  <Field azh a>
	// 6198 11564:getfield        #333 <Field int azh.ba>
	// 6199 11567:ixor            
	// 6200 11568:putfield        #333 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 6201 11571:aload_0         
	// 6202 11572:getfield        #12  <Field azh a>
	// 6203 11575:astore_1        
		abyte0.ba = ((azh) (abyte0)).k & ~a.ba;
	// 6204 11576:aload_1         
	// 6205 11577:aload_1         
	// 6206 11578:getfield        #465 <Field int azh.k>
	// 6207 11581:aload_0         
	// 6208 11582:getfield        #12  <Field azh a>
	// 6209 11585:getfield        #333 <Field int azh.ba>
	// 6210 11588:iconst_m1       
	// 6211 11589:ixor            
	// 6212 11590:iand            
	// 6213 11591:putfield        #333 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 6214 11594:aload_0         
	// 6215 11595:getfield        #12  <Field azh a>
	// 6216 11598:astore_1        
		abyte0.ba = ((azh) (abyte0)).bS ^ a.ba;
	// 6217 11599:aload_1         
	// 6218 11600:aload_1         
	// 6219 11601:getfield        #453 <Field int azh.bS>
	// 6220 11604:aload_0         
	// 6221 11605:getfield        #12  <Field azh a>
	// 6222 11608:getfield        #333 <Field int azh.ba>
	// 6223 11611:ixor            
	// 6224 11612:putfield        #333 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 6225 11615:aload_0         
	// 6226 11616:getfield        #12  <Field azh a>
	// 6227 11619:astore_1        
		abyte0.bS = ((azh) (abyte0)).c | a.bx;
	// 6228 11620:aload_1         
	// 6229 11621:aload_1         
	// 6230 11622:getfield        #459 <Field int azh.c>
	// 6231 11625:aload_0         
	// 6232 11626:getfield        #12  <Field azh a>
	// 6233 11629:getfield        #336 <Field int azh.bx>
	// 6234 11632:ior             
	// 6235 11633:putfield        #453 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 6236 11636:aload_0         
	// 6237 11637:getfield        #12  <Field azh a>
	// 6238 11640:astore_1        
		abyte0.bS = ((azh) (abyte0)).bx ^ a.bS;
	// 6239 11641:aload_1         
	// 6240 11642:aload_1         
	// 6241 11643:getfield        #336 <Field int azh.bx>
	// 6242 11646:aload_0         
	// 6243 11647:getfield        #12  <Field azh a>
	// 6244 11650:getfield        #453 <Field int azh.bS>
	// 6245 11653:ixor            
	// 6246 11654:putfield        #453 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 6247 11657:aload_0         
	// 6248 11658:getfield        #12  <Field azh a>
	// 6249 11661:astore_1        
		abyte0.bR = ((azh) (abyte0)).bS ^ a.bR;
	// 6250 11662:aload_1         
	// 6251 11663:aload_1         
	// 6252 11664:getfield        #453 <Field int azh.bS>
	// 6253 11667:aload_0         
	// 6254 11668:getfield        #12  <Field azh a>
	// 6255 11671:getfield        #345 <Field int azh.bR>
	// 6256 11674:ixor            
	// 6257 11675:putfield        #345 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 6258 11678:aload_0         
	// 6259 11679:getfield        #12  <Field azh a>
	// 6260 11682:astore_1        
		abyte0.bR = ((azh) (abyte0)).k & a.bR;
	// 6261 11683:aload_1         
	// 6262 11684:aload_1         
	// 6263 11685:getfield        #465 <Field int azh.k>
	// 6264 11688:aload_0         
	// 6265 11689:getfield        #12  <Field azh a>
	// 6266 11692:getfield        #345 <Field int azh.bR>
	// 6267 11695:iand            
	// 6268 11696:putfield        #345 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 6269 11699:aload_0         
	// 6270 11700:getfield        #12  <Field azh a>
	// 6271 11703:astore_1        
		abyte0.ct = ((azh) (abyte0)).c | a.y;
	// 6272 11704:aload_1         
	// 6273 11705:aload_1         
	// 6274 11706:getfield        #459 <Field int azh.c>
	// 6275 11709:aload_0         
	// 6276 11710:getfield        #12  <Field azh a>
	// 6277 11713:getfield        #143 <Field int azh.y>
	// 6278 11716:ior             
	// 6279 11717:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 6280 11720:aload_0         
	// 6281 11721:getfield        #12  <Field azh a>
	// 6282 11724:astore_1        
		abyte0.cn = ((azh) (abyte0)).bF & ~a.ct;
	// 6283 11725:aload_1         
	// 6284 11726:aload_1         
	// 6285 11727:getfield        #276 <Field int azh.bF>
	// 6286 11730:aload_0         
	// 6287 11731:getfield        #12  <Field azh a>
	// 6288 11734:getfield        #324 <Field int azh.ct>
	// 6289 11737:iconst_m1       
	// 6290 11738:ixor            
	// 6291 11739:iand            
	// 6292 11740:putfield        #468 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6293 11743:aload_0         
	// 6294 11744:getfield        #12  <Field azh a>
	// 6295 11747:astore_1        
		abyte0.cn = ((azh) (abyte0)).ct ^ a.cn;
	// 6296 11748:aload_1         
	// 6297 11749:aload_1         
	// 6298 11750:getfield        #324 <Field int azh.ct>
	// 6299 11753:aload_0         
	// 6300 11754:getfield        #12  <Field azh a>
	// 6301 11757:getfield        #468 <Field int azh.cn>
	// 6302 11760:ixor            
	// 6303 11761:putfield        #468 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6304 11764:aload_0         
	// 6305 11765:getfield        #12  <Field azh a>
	// 6306 11768:astore_1        
		abyte0.cn = ((azh) (abyte0)).bT | a.cn;
	// 6307 11769:aload_1         
	// 6308 11770:aload_1         
	// 6309 11771:getfield        #282 <Field int azh.bT>
	// 6310 11774:aload_0         
	// 6311 11775:getfield        #12  <Field azh a>
	// 6312 11778:getfield        #468 <Field int azh.cn>
	// 6313 11781:ior             
	// 6314 11782:putfield        #468 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6315 11785:aload_0         
	// 6316 11786:getfield        #12  <Field azh a>
	// 6317 11789:astore_1        
		abyte0.bm = ((azh) (abyte0)).ct ^ a.bm;
	// 6318 11790:aload_1         
	// 6319 11791:aload_1         
	// 6320 11792:getfield        #324 <Field int azh.ct>
	// 6321 11795:aload_0         
	// 6322 11796:getfield        #12  <Field azh a>
	// 6323 11799:getfield        #432 <Field int azh.bm>
	// 6324 11802:ixor            
	// 6325 11803:putfield        #432 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6326 11806:aload_0         
	// 6327 11807:getfield        #12  <Field azh a>
	// 6328 11810:astore_1        
		abyte0.bq = ((azh) (abyte0)).bF & a.ct;
	// 6329 11811:aload_1         
	// 6330 11812:aload_1         
	// 6331 11813:getfield        #276 <Field int azh.bF>
	// 6332 11816:aload_0         
	// 6333 11817:getfield        #12  <Field azh a>
	// 6334 11820:getfield        #324 <Field int azh.ct>
	// 6335 11823:iand            
	// 6336 11824:putfield        #471 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6337 11827:aload_0         
	// 6338 11828:getfield        #12  <Field azh a>
	// 6339 11831:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bT | a.ct;
	// 6340 11832:aload_1         
	// 6341 11833:aload_1         
	// 6342 11834:getfield        #282 <Field int azh.bT>
	// 6343 11837:aload_0         
	// 6344 11838:getfield        #12  <Field azh a>
	// 6345 11841:getfield        #324 <Field int azh.ct>
	// 6346 11844:ior             
	// 6347 11845:putfield        #474 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6348 11848:aload_0         
	// 6349 11849:getfield        #12  <Field azh a>
	// 6350 11852:astore_1        
		abyte0.z = ((azh) (abyte0)).bF & a.ct;
	// 6351 11853:aload_1         
	// 6352 11854:aload_1         
	// 6353 11855:getfield        #276 <Field int azh.bF>
	// 6354 11858:aload_0         
	// 6355 11859:getfield        #12  <Field azh a>
	// 6356 11862:getfield        #324 <Field int azh.ct>
	// 6357 11865:iand            
	// 6358 11866:putfield        #477 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6359 11869:aload_0         
	// 6360 11870:getfield        #12  <Field azh a>
	// 6361 11873:astore_1        
		abyte0.z = ((azh) (abyte0)).y ^ a.z;
	// 6362 11874:aload_1         
	// 6363 11875:aload_1         
	// 6364 11876:getfield        #143 <Field int azh.y>
	// 6365 11879:aload_0         
	// 6366 11880:getfield        #12  <Field azh a>
	// 6367 11883:getfield        #477 <Field int azh.z>
	// 6368 11886:ixor            
	// 6369 11887:putfield        #477 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6370 11890:aload_0         
	// 6371 11891:getfield        #12  <Field azh a>
	// 6372 11894:astore_1        
		abyte0.cn = ((azh) (abyte0)).z ^ a.cn;
	// 6373 11895:aload_1         
	// 6374 11896:aload_1         
	// 6375 11897:getfield        #477 <Field int azh.z>
	// 6376 11900:aload_0         
	// 6377 11901:getfield        #12  <Field azh a>
	// 6378 11904:getfield        #468 <Field int azh.cn>
	// 6379 11907:ixor            
	// 6380 11908:putfield        #468 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6381 11911:aload_0         
	// 6382 11912:getfield        #12  <Field azh a>
	// 6383 11915:astore_1        
		abyte0.cn = ((azh) (abyte0)).cn & ~a.O;
	// 6384 11916:aload_1         
	// 6385 11917:aload_1         
	// 6386 11918:getfield        #468 <Field int azh.cn>
	// 6387 11921:aload_0         
	// 6388 11922:getfield        #12  <Field azh a>
	// 6389 11925:getfield        #366 <Field int azh.O>
	// 6390 11928:iconst_m1       
	// 6391 11929:ixor            
	// 6392 11930:iand            
	// 6393 11931:putfield        #468 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6394 11934:aload_0         
	// 6395 11935:getfield        #12  <Field azh a>
	// 6396 11938:astore_1        
		abyte0.ct = ((azh) (abyte0)).ct & ~a.y;
	// 6397 11939:aload_1         
	// 6398 11940:aload_1         
	// 6399 11941:getfield        #324 <Field int azh.ct>
	// 6400 11944:aload_0         
	// 6401 11945:getfield        #12  <Field azh a>
	// 6402 11948:getfield        #143 <Field int azh.y>
	// 6403 11951:iconst_m1       
	// 6404 11952:ixor            
	// 6405 11953:iand            
	// 6406 11954:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 6407 11957:aload_0         
	// 6408 11958:getfield        #12  <Field azh a>
	// 6409 11961:astore_1        
		abyte0.z = ((azh) (abyte0)).bo & ~a.c;
	// 6410 11962:aload_1         
	// 6411 11963:aload_1         
	// 6412 11964:getfield        #303 <Field int azh.bo>
	// 6413 11967:aload_0         
	// 6414 11968:getfield        #12  <Field azh a>
	// 6415 11971:getfield        #459 <Field int azh.c>
	// 6416 11974:iconst_m1       
	// 6417 11975:ixor            
	// 6418 11976:iand            
	// 6419 11977:putfield        #477 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6420 11980:aload_0         
	// 6421 11981:getfield        #12  <Field azh a>
	// 6422 11984:astore_1        
		abyte0.z = ((azh) (abyte0)).af ^ a.z;
	// 6423 11985:aload_1         
	// 6424 11986:aload_1         
	// 6425 11987:getfield        #247 <Field int azh.af>
	// 6426 11990:aload_0         
	// 6427 11991:getfield        #12  <Field azh a>
	// 6428 11994:getfield        #477 <Field int azh.z>
	// 6429 11997:ixor            
	// 6430 11998:putfield        #477 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6431 12001:aload_0         
	// 6432 12002:getfield        #12  <Field azh a>
	// 6433 12005:astore_1        
		abyte0.bP = ((azh) (abyte0)).bb & ~a.z;
	// 6434 12006:aload_1         
	// 6435 12007:aload_1         
	// 6436 12008:getfield        #330 <Field int azh.bb>
	// 6437 12011:aload_0         
	// 6438 12012:getfield        #12  <Field azh a>
	// 6439 12015:getfield        #477 <Field int azh.z>
	// 6440 12018:iconst_m1       
	// 6441 12019:ixor            
	// 6442 12020:iand            
	// 6443 12021:putfield        #480 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 6444 12024:aload_0         
	// 6445 12025:getfield        #12  <Field azh a>
	// 6446 12028:astore_1        
		abyte0.az = ((azh) (abyte0)).bb & a.z;
	// 6447 12029:aload_1         
	// 6448 12030:aload_1         
	// 6449 12031:getfield        #330 <Field int azh.bb>
	// 6450 12034:aload_0         
	// 6451 12035:getfield        #12  <Field azh a>
	// 6452 12038:getfield        #477 <Field int azh.z>
	// 6453 12041:iand            
	// 6454 12042:putfield        #483 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 6455 12045:aload_0         
	// 6456 12046:getfield        #12  <Field azh a>
	// 6457 12049:astore_1        
		abyte0.bd = ~((azh) (abyte0)).c;
	// 6458 12050:aload_1         
	// 6459 12051:aload_1         
	// 6460 12052:getfield        #459 <Field int azh.c>
	// 6461 12055:iconst_m1       
	// 6462 12056:ixor            
	// 6463 12057:putfield        #486 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 6464 12060:aload_0         
	// 6465 12061:getfield        #12  <Field azh a>
	// 6466 12064:astore_1        
		abyte0.cG = ((azh) (abyte0)).c | a.bx;
	// 6467 12065:aload_1         
	// 6468 12066:aload_1         
	// 6469 12067:getfield        #459 <Field int azh.c>
	// 6470 12070:aload_0         
	// 6471 12071:getfield        #12  <Field azh a>
	// 6472 12074:getfield        #336 <Field int azh.bx>
	// 6473 12077:ior             
	// 6474 12078:putfield        #489 <Field int azh.cG>
		abyte0 = ((byte []) (a));
	// 6475 12081:aload_0         
	// 6476 12082:getfield        #12  <Field azh a>
	// 6477 12085:astore_1        
		abyte0.cG = ((azh) (abyte0)).at ^ a.cG;
	// 6478 12086:aload_1         
	// 6479 12087:aload_1         
	// 6480 12088:getfield        #327 <Field int azh.at>
	// 6481 12091:aload_0         
	// 6482 12092:getfield        #12  <Field azh a>
	// 6483 12095:getfield        #489 <Field int azh.cG>
	// 6484 12098:ixor            
	// 6485 12099:putfield        #489 <Field int azh.cG>
		abyte0 = ((byte []) (a));
	// 6486 12102:aload_0         
	// 6487 12103:getfield        #12  <Field azh a>
	// 6488 12106:astore_1        
		abyte0.cG = ((azh) (abyte0)).bb & a.cG;
	// 6489 12107:aload_1         
	// 6490 12108:aload_1         
	// 6491 12109:getfield        #330 <Field int azh.bb>
	// 6492 12112:aload_0         
	// 6493 12113:getfield        #12  <Field azh a>
	// 6494 12116:getfield        #489 <Field int azh.cG>
	// 6495 12119:iand            
	// 6496 12120:putfield        #489 <Field int azh.cG>
		abyte0 = ((byte []) (a));
	// 6497 12123:aload_0         
	// 6498 12124:getfield        #12  <Field azh a>
	// 6499 12127:astore_1        
		abyte0.cG = ((azh) (abyte0)).aX ^ a.cG;
	// 6500 12128:aload_1         
	// 6501 12129:aload_1         
	// 6502 12130:getfield        #339 <Field int azh.aX>
	// 6503 12133:aload_0         
	// 6504 12134:getfield        #12  <Field azh a>
	// 6505 12137:getfield        #489 <Field int azh.cG>
	// 6506 12140:ixor            
	// 6507 12141:putfield        #489 <Field int azh.cG>
		abyte0 = ((byte []) (a));
	// 6508 12144:aload_0         
	// 6509 12145:getfield        #12  <Field azh a>
	// 6510 12148:astore_1        
		abyte0.aX = ((azh) (abyte0)).c | a.bF;
	// 6511 12149:aload_1         
	// 6512 12150:aload_1         
	// 6513 12151:getfield        #459 <Field int azh.c>
	// 6514 12154:aload_0         
	// 6515 12155:getfield        #12  <Field azh a>
	// 6516 12158:getfield        #276 <Field int azh.bF>
	// 6517 12161:ior             
	// 6518 12162:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6519 12165:aload_0         
	// 6520 12166:getfield        #12  <Field azh a>
	// 6521 12169:astore_1        
		abyte0.aX = ((azh) (abyte0)).bx ^ a.aX;
	// 6522 12170:aload_1         
	// 6523 12171:aload_1         
	// 6524 12172:getfield        #336 <Field int azh.bx>
	// 6525 12175:aload_0         
	// 6526 12176:getfield        #12  <Field azh a>
	// 6527 12179:getfield        #339 <Field int azh.aX>
	// 6528 12182:ixor            
	// 6529 12183:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6530 12186:aload_0         
	// 6531 12187:getfield        #12  <Field azh a>
	// 6532 12190:astore_1        
		abyte0.co = ((azh) (abyte0)).bb & ~a.aX;
	// 6533 12191:aload_1         
	// 6534 12192:aload_1         
	// 6535 12193:getfield        #330 <Field int azh.bb>
	// 6536 12196:aload_0         
	// 6537 12197:getfield        #12  <Field azh a>
	// 6538 12200:getfield        #339 <Field int azh.aX>
	// 6539 12203:iconst_m1       
	// 6540 12204:ixor            
	// 6541 12205:iand            
	// 6542 12206:putfield        #492 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 6543 12209:aload_0         
	// 6544 12210:getfield        #12  <Field azh a>
	// 6545 12213:astore_1        
		abyte0.ak = ((azh) (abyte0)).y & ~a.c;
	// 6546 12214:aload_1         
	// 6547 12215:aload_1         
	// 6548 12216:getfield        #143 <Field int azh.y>
	// 6549 12219:aload_0         
	// 6550 12220:getfield        #12  <Field azh a>
	// 6551 12223:getfield        #459 <Field int azh.c>
	// 6552 12226:iconst_m1       
	// 6553 12227:ixor            
	// 6554 12228:iand            
	// 6555 12229:putfield        #495 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 6556 12232:aload_0         
	// 6557 12233:getfield        #12  <Field azh a>
	// 6558 12236:astore_1        
		abyte0.cH = ((azh) (abyte0)).bF & a.ak;
	// 6559 12237:aload_1         
	// 6560 12238:aload_1         
	// 6561 12239:getfield        #276 <Field int azh.bF>
	// 6562 12242:aload_0         
	// 6563 12243:getfield        #12  <Field azh a>
	// 6564 12246:getfield        #495 <Field int azh.ak>
	// 6565 12249:iand            
	// 6566 12250:putfield        #498 <Field int azh.cH>
		abyte0 = ((byte []) (a));
	// 6567 12253:aload_0         
	// 6568 12254:getfield        #12  <Field azh a>
	// 6569 12257:astore_1        
		abyte0.cH = ((azh) (abyte0)).cH & ~a.bT;
	// 6570 12258:aload_1         
	// 6571 12259:aload_1         
	// 6572 12260:getfield        #498 <Field int azh.cH>
	// 6573 12263:aload_0         
	// 6574 12264:getfield        #12  <Field azh a>
	// 6575 12267:getfield        #282 <Field int azh.bT>
	// 6576 12270:iconst_m1       
	// 6577 12271:ixor            
	// 6578 12272:iand            
	// 6579 12273:putfield        #498 <Field int azh.cH>
		abyte0 = ((byte []) (a));
	// 6580 12276:aload_0         
	// 6581 12277:getfield        #12  <Field azh a>
	// 6582 12280:astore_1        
		abyte0.cI = ((azh) (abyte0)).bT | a.ak;
	// 6583 12281:aload_1         
	// 6584 12282:aload_1         
	// 6585 12283:getfield        #282 <Field int azh.bT>
	// 6586 12286:aload_0         
	// 6587 12287:getfield        #12  <Field azh a>
	// 6588 12290:getfield        #495 <Field int azh.ak>
	// 6589 12293:ior             
	// 6590 12294:putfield        #501 <Field int azh.cI>
		abyte0 = ((byte []) (a));
	// 6591 12297:aload_0         
	// 6592 12298:getfield        #12  <Field azh a>
	// 6593 12301:astore_1        
		abyte0.cI = ((azh) (abyte0)).ao ^ a.cI;
	// 6594 12302:aload_1         
	// 6595 12303:aload_1         
	// 6596 12304:getfield        #38  <Field int azh.ao>
	// 6597 12307:aload_0         
	// 6598 12308:getfield        #12  <Field azh a>
	// 6599 12311:getfield        #501 <Field int azh.cI>
	// 6600 12314:ixor            
	// 6601 12315:putfield        #501 <Field int azh.cI>
		abyte0 = ((byte []) (a));
	// 6602 12318:aload_0         
	// 6603 12319:getfield        #12  <Field azh a>
	// 6604 12322:astore_1        
		abyte0.ao = ((azh) (abyte0)).bF & a.ak;
	// 6605 12323:aload_1         
	// 6606 12324:aload_1         
	// 6607 12325:getfield        #276 <Field int azh.bF>
	// 6608 12328:aload_0         
	// 6609 12329:getfield        #12  <Field azh a>
	// 6610 12332:getfield        #495 <Field int azh.ak>
	// 6611 12335:iand            
	// 6612 12336:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6613 12339:aload_0         
	// 6614 12340:getfield        #12  <Field azh a>
	// 6615 12343:astore_1        
		abyte0.ak = ((azh) (abyte0)).ak & a.bT;
	// 6616 12344:aload_1         
	// 6617 12345:aload_1         
	// 6618 12346:getfield        #495 <Field int azh.ak>
	// 6619 12349:aload_0         
	// 6620 12350:getfield        #12  <Field azh a>
	// 6621 12353:getfield        #282 <Field int azh.bT>
	// 6622 12356:iand            
	// 6623 12357:putfield        #495 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 6624 12360:aload_0         
	// 6625 12361:getfield        #12  <Field azh a>
	// 6626 12364:astore_1        
		abyte0.cJ = ((azh) (abyte0)).bJ & ~a.c;
	// 6627 12365:aload_1         
	// 6628 12366:aload_1         
	// 6629 12367:getfield        #342 <Field int azh.bJ>
	// 6630 12370:aload_0         
	// 6631 12371:getfield        #12  <Field azh a>
	// 6632 12374:getfield        #459 <Field int azh.c>
	// 6633 12377:iconst_m1       
	// 6634 12378:ixor            
	// 6635 12379:iand            
	// 6636 12380:putfield        #504 <Field int azh.cJ>
		abyte0 = ((byte []) (a));
	// 6637 12383:aload_0         
	// 6638 12384:getfield        #12  <Field azh a>
	// 6639 12387:astore_1        
		abyte0.cJ = ((azh) (abyte0)).k & ~a.cJ;
	// 6640 12388:aload_1         
	// 6641 12389:aload_1         
	// 6642 12390:getfield        #465 <Field int azh.k>
	// 6643 12393:aload_0         
	// 6644 12394:getfield        #12  <Field azh a>
	// 6645 12397:getfield        #504 <Field int azh.cJ>
	// 6646 12400:iconst_m1       
	// 6647 12401:ixor            
	// 6648 12402:iand            
	// 6649 12403:putfield        #504 <Field int azh.cJ>
		abyte0 = ((byte []) (a));
	// 6650 12406:aload_0         
	// 6651 12407:getfield        #12  <Field azh a>
	// 6652 12410:astore_1        
		abyte0.cK = ((azh) (abyte0)).c ^ a.y;
	// 6653 12411:aload_1         
	// 6654 12412:aload_1         
	// 6655 12413:getfield        #459 <Field int azh.c>
	// 6656 12416:aload_0         
	// 6657 12417:getfield        #12  <Field azh a>
	// 6658 12420:getfield        #143 <Field int azh.y>
	// 6659 12423:ixor            
	// 6660 12424:putfield        #507 <Field int azh.cK>
		abyte0 = ((byte []) (a));
	// 6661 12427:aload_0         
	// 6662 12428:getfield        #12  <Field azh a>
	// 6663 12431:astore_1        
		abyte0.cL = ((azh) (abyte0)).cK & ~a.bT;
	// 6664 12432:aload_1         
	// 6665 12433:aload_1         
	// 6666 12434:getfield        #507 <Field int azh.cK>
	// 6667 12437:aload_0         
	// 6668 12438:getfield        #12  <Field azh a>
	// 6669 12441:getfield        #282 <Field int azh.bT>
	// 6670 12444:iconst_m1       
	// 6671 12445:ixor            
	// 6672 12446:iand            
	// 6673 12447:putfield        #510 <Field int azh.cL>
		abyte0 = ((byte []) (a));
	// 6674 12450:aload_0         
	// 6675 12451:getfield        #12  <Field azh a>
	// 6676 12454:astore_1        
		abyte0.cM = ((azh) (abyte0)).bF & ~a.cK;
	// 6677 12455:aload_1         
	// 6678 12456:aload_1         
	// 6679 12457:getfield        #276 <Field int azh.bF>
	// 6680 12460:aload_0         
	// 6681 12461:getfield        #12  <Field azh a>
	// 6682 12464:getfield        #507 <Field int azh.cK>
	// 6683 12467:iconst_m1       
	// 6684 12468:ixor            
	// 6685 12469:iand            
	// 6686 12470:putfield        #513 <Field int azh.cM>
		abyte0 = ((byte []) (a));
	// 6687 12473:aload_0         
	// 6688 12474:getfield        #12  <Field azh a>
	// 6689 12477:astore_1        
		abyte0.cM = ((azh) (abyte0)).y ^ a.cM;
	// 6690 12478:aload_1         
	// 6691 12479:aload_1         
	// 6692 12480:getfield        #143 <Field int azh.y>
	// 6693 12483:aload_0         
	// 6694 12484:getfield        #12  <Field azh a>
	// 6695 12487:getfield        #513 <Field int azh.cM>
	// 6696 12490:ixor            
	// 6697 12491:putfield        #513 <Field int azh.cM>
		abyte0 = ((byte []) (a));
	// 6698 12494:aload_0         
	// 6699 12495:getfield        #12  <Field azh a>
	// 6700 12498:astore_1        
		abyte0.ak = ((azh) (abyte0)).cM ^ a.ak;
	// 6701 12499:aload_1         
	// 6702 12500:aload_1         
	// 6703 12501:getfield        #513 <Field int azh.cM>
	// 6704 12504:aload_0         
	// 6705 12505:getfield        #12  <Field azh a>
	// 6706 12508:getfield        #495 <Field int azh.ak>
	// 6707 12511:ixor            
	// 6708 12512:putfield        #495 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 6709 12515:aload_0         
	// 6710 12516:getfield        #12  <Field azh a>
	// 6711 12519:astore_1        
		abyte0.ak = ((azh) (abyte0)).O | a.ak;
	// 6712 12520:aload_1         
	// 6713 12521:aload_1         
	// 6714 12522:getfield        #366 <Field int azh.O>
	// 6715 12525:aload_0         
	// 6716 12526:getfield        #12  <Field azh a>
	// 6717 12529:getfield        #495 <Field int azh.ak>
	// 6718 12532:ior             
	// 6719 12533:putfield        #495 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 6720 12536:aload_0         
	// 6721 12537:getfield        #12  <Field azh a>
	// 6722 12540:astore_1        
		abyte0.ak = ((azh) (abyte0)).bm ^ a.ak;
	// 6723 12541:aload_1         
	// 6724 12542:aload_1         
	// 6725 12543:getfield        #432 <Field int azh.bm>
	// 6726 12546:aload_0         
	// 6727 12547:getfield        #12  <Field azh a>
	// 6728 12550:getfield        #495 <Field int azh.ak>
	// 6729 12553:ixor            
	// 6730 12554:putfield        #495 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 6731 12557:aload_0         
	// 6732 12558:getfield        #12  <Field azh a>
	// 6733 12561:astore_1        
		abyte0.ao = ((azh) (abyte0)).cK ^ a.ao;
	// 6734 12562:aload_1         
	// 6735 12563:aload_1         
	// 6736 12564:getfield        #507 <Field int azh.cK>
	// 6737 12567:aload_0         
	// 6738 12568:getfield        #12  <Field azh a>
	// 6739 12571:getfield        #38  <Field int azh.ao>
	// 6740 12574:ixor            
	// 6741 12575:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6742 12578:aload_0         
	// 6743 12579:getfield        #12  <Field azh a>
	// 6744 12582:astore_1        
		abyte0.cL = ((azh) (abyte0)).ao ^ a.cL;
	// 6745 12583:aload_1         
	// 6746 12584:aload_1         
	// 6747 12585:getfield        #38  <Field int azh.ao>
	// 6748 12588:aload_0         
	// 6749 12589:getfield        #12  <Field azh a>
	// 6750 12592:getfield        #510 <Field int azh.cL>
	// 6751 12595:ixor            
	// 6752 12596:putfield        #510 <Field int azh.cL>
		abyte0 = ((byte []) (a));
	// 6753 12599:aload_0         
	// 6754 12600:getfield        #12  <Field azh a>
	// 6755 12603:astore_1        
		abyte0.cL = ((azh) (abyte0)).cL & ~a.O;
	// 6756 12604:aload_1         
	// 6757 12605:aload_1         
	// 6758 12606:getfield        #510 <Field int azh.cL>
	// 6759 12609:aload_0         
	// 6760 12610:getfield        #12  <Field azh a>
	// 6761 12613:getfield        #366 <Field int azh.O>
	// 6762 12616:iconst_m1       
	// 6763 12617:ixor            
	// 6764 12618:iand            
	// 6765 12619:putfield        #510 <Field int azh.cL>
		abyte0 = ((byte []) (a));
	// 6766 12622:aload_0         
	// 6767 12623:getfield        #12  <Field azh a>
	// 6768 12626:astore_1        
		abyte0.ao = ((azh) (abyte0)).bx & ~a.c;
	// 6769 12627:aload_1         
	// 6770 12628:aload_1         
	// 6771 12629:getfield        #336 <Field int azh.bx>
	// 6772 12632:aload_0         
	// 6773 12633:getfield        #12  <Field azh a>
	// 6774 12636:getfield        #459 <Field int azh.c>
	// 6775 12639:iconst_m1       
	// 6776 12640:ixor            
	// 6777 12641:iand            
	// 6778 12642:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6779 12645:aload_0         
	// 6780 12646:getfield        #12  <Field azh a>
	// 6781 12649:astore_1        
		abyte0.ao = ((azh) (abyte0)).af ^ a.ao;
	// 6782 12650:aload_1         
	// 6783 12651:aload_1         
	// 6784 12652:getfield        #247 <Field int azh.af>
	// 6785 12655:aload_0         
	// 6786 12656:getfield        #12  <Field azh a>
	// 6787 12659:getfield        #38  <Field int azh.ao>
	// 6788 12662:ixor            
	// 6789 12663:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6790 12666:aload_0         
	// 6791 12667:getfield        #12  <Field azh a>
	// 6792 12670:astore_1        
		abyte0.ao = ((azh) (abyte0)).bb & a.ao;
	// 6793 12671:aload_1         
	// 6794 12672:aload_1         
	// 6795 12673:getfield        #330 <Field int azh.bb>
	// 6796 12676:aload_0         
	// 6797 12677:getfield        #12  <Field azh a>
	// 6798 12680:getfield        #38  <Field int azh.ao>
	// 6799 12683:iand            
	// 6800 12684:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6801 12687:aload_0         
	// 6802 12688:getfield        #12  <Field azh a>
	// 6803 12691:astore_1        
		abyte0.ao = ((azh) (abyte0)).z ^ a.ao;
	// 6804 12692:aload_1         
	// 6805 12693:aload_1         
	// 6806 12694:getfield        #477 <Field int azh.z>
	// 6807 12697:aload_0         
	// 6808 12698:getfield        #12  <Field azh a>
	// 6809 12701:getfield        #38  <Field int azh.ao>
	// 6810 12704:ixor            
	// 6811 12705:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6812 12708:aload_0         
	// 6813 12709:getfield        #12  <Field azh a>
	// 6814 12712:astore_1        
		abyte0.ax = ((azh) (abyte0)).ao ^ a.ax;
	// 6815 12713:aload_1         
	// 6816 12714:aload_1         
	// 6817 12715:getfield        #38  <Field int azh.ao>
	// 6818 12718:aload_0         
	// 6819 12719:getfield        #12  <Field azh a>
	// 6820 12722:getfield        #462 <Field int azh.ax>
	// 6821 12725:ixor            
	// 6822 12726:putfield        #462 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6823 12729:aload_0         
	// 6824 12730:getfield        #12  <Field azh a>
	// 6825 12733:astore_1        
		abyte0.ax = ((azh) (abyte0)).I | a.ax;
	// 6826 12734:aload_1         
	// 6827 12735:aload_1         
	// 6828 12736:getfield        #249 <Field int azh.I>
	// 6829 12739:aload_0         
	// 6830 12740:getfield        #12  <Field azh a>
	// 6831 12743:getfield        #462 <Field int azh.ax>
	// 6832 12746:ior             
	// 6833 12747:putfield        #462 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6834 12750:aload_0         
	// 6835 12751:getfield        #12  <Field azh a>
	// 6836 12754:astore_1        
		abyte0.af = ((azh) (abyte0)).af & ~a.c;
	// 6837 12755:aload_1         
	// 6838 12756:aload_1         
	// 6839 12757:getfield        #247 <Field int azh.af>
	// 6840 12760:aload_0         
	// 6841 12761:getfield        #12  <Field azh a>
	// 6842 12764:getfield        #459 <Field int azh.c>
	// 6843 12767:iconst_m1       
	// 6844 12768:ixor            
	// 6845 12769:iand            
	// 6846 12770:putfield        #247 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 6847 12773:aload_0         
	// 6848 12774:getfield        #12  <Field azh a>
	// 6849 12777:astore_1        
		abyte0.az = ((azh) (abyte0)).af ^ a.az;
	// 6850 12778:aload_1         
	// 6851 12779:aload_1         
	// 6852 12780:getfield        #247 <Field int azh.af>
	// 6853 12783:aload_0         
	// 6854 12784:getfield        #12  <Field azh a>
	// 6855 12787:getfield        #483 <Field int azh.az>
	// 6856 12790:ixor            
	// 6857 12791:putfield        #483 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 6858 12794:aload_0         
	// 6859 12795:getfield        #12  <Field azh a>
	// 6860 12798:astore_1        
		abyte0.at = ((azh) (abyte0)).c | a.at;
	// 6861 12799:aload_1         
	// 6862 12800:aload_1         
	// 6863 12801:getfield        #459 <Field int azh.c>
	// 6864 12804:aload_0         
	// 6865 12805:getfield        #12  <Field azh a>
	// 6866 12808:getfield        #327 <Field int azh.at>
	// 6867 12811:ior             
	// 6868 12812:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6869 12815:aload_0         
	// 6870 12816:getfield        #12  <Field azh a>
	// 6871 12819:astore_1        
		abyte0.at = ((azh) (abyte0)).bF ^ a.at;
	// 6872 12820:aload_1         
	// 6873 12821:aload_1         
	// 6874 12822:getfield        #276 <Field int azh.bF>
	// 6875 12825:aload_0         
	// 6876 12826:getfield        #12  <Field azh a>
	// 6877 12829:getfield        #327 <Field int azh.at>
	// 6878 12832:ixor            
	// 6879 12833:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6880 12836:aload_0         
	// 6881 12837:getfield        #12  <Field azh a>
	// 6882 12840:astore_1        
		abyte0.ao = ((azh) (abyte0)).at | a.bb;
	// 6883 12841:aload_1         
	// 6884 12842:aload_1         
	// 6885 12843:getfield        #327 <Field int azh.at>
	// 6886 12846:aload_0         
	// 6887 12847:getfield        #12  <Field azh a>
	// 6888 12850:getfield        #330 <Field int azh.bb>
	// 6889 12853:ior             
	// 6890 12854:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6891 12857:aload_0         
	// 6892 12858:getfield        #12  <Field azh a>
	// 6893 12861:astore_1        
		abyte0.ao = ((azh) (abyte0)).z ^ a.ao;
	// 6894 12862:aload_1         
	// 6895 12863:aload_1         
	// 6896 12864:getfield        #477 <Field int azh.z>
	// 6897 12867:aload_0         
	// 6898 12868:getfield        #12  <Field azh a>
	// 6899 12871:getfield        #38  <Field int azh.ao>
	// 6900 12874:ixor            
	// 6901 12875:putfield        #38  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6902 12878:aload_0         
	// 6903 12879:getfield        #12  <Field azh a>
	// 6904 12882:astore_1        
		abyte0.cJ = ((azh) (abyte0)).ao ^ a.cJ;
	// 6905 12883:aload_1         
	// 6906 12884:aload_1         
	// 6907 12885:getfield        #38  <Field int azh.ao>
	// 6908 12888:aload_0         
	// 6909 12889:getfield        #12  <Field azh a>
	// 6910 12892:getfield        #504 <Field int azh.cJ>
	// 6911 12895:ixor            
	// 6912 12896:putfield        #504 <Field int azh.cJ>
		abyte0 = ((byte []) (a));
	// 6913 12899:aload_0         
	// 6914 12900:getfield        #12  <Field azh a>
	// 6915 12903:astore_1        
		abyte0.ax = ((azh) (abyte0)).cJ ^ a.ax;
	// 6916 12904:aload_1         
	// 6917 12905:aload_1         
	// 6918 12906:getfield        #504 <Field int azh.cJ>
	// 6919 12909:aload_0         
	// 6920 12910:getfield        #12  <Field azh a>
	// 6921 12913:getfield        #462 <Field int azh.ax>
	// 6922 12916:ixor            
	// 6923 12917:putfield        #462 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6924 12920:aload_0         
	// 6925 12921:getfield        #12  <Field azh a>
	// 6926 12924:astore_1        
		abyte0.T = ((azh) (abyte0)).ax ^ a.T;
	// 6927 12925:aload_1         
	// 6928 12926:aload_1         
	// 6929 12927:getfield        #462 <Field int azh.ax>
	// 6930 12930:aload_0         
	// 6931 12931:getfield        #12  <Field azh a>
	// 6932 12934:getfield        #516 <Field int azh.T>
	// 6933 12937:ixor            
	// 6934 12938:putfield        #516 <Field int azh.T>
		abyte0 = ((byte []) (a));
	// 6935 12941:aload_0         
	// 6936 12942:getfield        #12  <Field azh a>
	// 6937 12945:astore_1        
		abyte0.bP = ((azh) (abyte0)).at ^ a.bP;
	// 6938 12946:aload_1         
	// 6939 12947:aload_1         
	// 6940 12948:getfield        #327 <Field int azh.at>
	// 6941 12951:aload_0         
	// 6942 12952:getfield        #12  <Field azh a>
	// 6943 12955:getfield        #480 <Field int azh.bP>
	// 6944 12958:ixor            
	// 6945 12959:putfield        #480 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 6946 12962:aload_0         
	// 6947 12963:getfield        #12  <Field azh a>
	// 6948 12966:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx & ~a.c;
	// 6949 12967:aload_1         
	// 6950 12968:aload_1         
	// 6951 12969:getfield        #336 <Field int azh.bx>
	// 6952 12972:aload_0         
	// 6953 12973:getfield        #12  <Field azh a>
	// 6954 12976:getfield        #459 <Field int azh.c>
	// 6955 12979:iconst_m1       
	// 6956 12980:ixor            
	// 6957 12981:iand            
	// 6958 12982:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6959 12985:aload_0         
	// 6960 12986:getfield        #12  <Field azh a>
	// 6961 12989:astore_1        
		abyte0.bx = ((azh) (abyte0)).bF ^ a.bx;
	// 6962 12990:aload_1         
	// 6963 12991:aload_1         
	// 6964 12992:getfield        #276 <Field int azh.bF>
	// 6965 12995:aload_0         
	// 6966 12996:getfield        #12  <Field azh a>
	// 6967 12999:getfield        #336 <Field int azh.bx>
	// 6968 13002:ixor            
	// 6969 13003:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6970 13006:aload_0         
	// 6971 13007:getfield        #12  <Field azh a>
	// 6972 13010:astore_1        
		abyte0.co = ((azh) (abyte0)).bx ^ a.co;
	// 6973 13011:aload_1         
	// 6974 13012:aload_1         
	// 6975 13013:getfield        #336 <Field int azh.bx>
	// 6976 13016:aload_0         
	// 6977 13017:getfield        #12  <Field azh a>
	// 6978 13020:getfield        #492 <Field int azh.co>
	// 6979 13023:ixor            
	// 6980 13024:putfield        #492 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 6981 13027:aload_0         
	// 6982 13028:getfield        #12  <Field azh a>
	// 6983 13031:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx & ~a.bb;
	// 6984 13032:aload_1         
	// 6985 13033:aload_1         
	// 6986 13034:getfield        #336 <Field int azh.bx>
	// 6987 13037:aload_0         
	// 6988 13038:getfield        #12  <Field azh a>
	// 6989 13041:getfield        #330 <Field int azh.bb>
	// 6990 13044:iconst_m1       
	// 6991 13045:ixor            
	// 6992 13046:iand            
	// 6993 13047:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6994 13050:aload_0         
	// 6995 13051:getfield        #12  <Field azh a>
	// 6996 13054:astore_1        
		abyte0.bx = ((azh) (abyte0)).aX ^ a.bx;
	// 6997 13055:aload_1         
	// 6998 13056:aload_1         
	// 6999 13057:getfield        #339 <Field int azh.aX>
	// 7000 13060:aload_0         
	// 7001 13061:getfield        #12  <Field azh a>
	// 7002 13064:getfield        #336 <Field int azh.bx>
	// 7003 13067:ixor            
	// 7004 13068:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7005 13071:aload_0         
	// 7006 13072:getfield        #12  <Field azh a>
	// 7007 13075:astore_1        
		abyte0.bR = ((azh) (abyte0)).bx ^ a.bR;
	// 7008 13076:aload_1         
	// 7009 13077:aload_1         
	// 7010 13078:getfield        #336 <Field int azh.bx>
	// 7011 13081:aload_0         
	// 7012 13082:getfield        #12  <Field azh a>
	// 7013 13085:getfield        #345 <Field int azh.bR>
	// 7014 13088:ixor            
	// 7015 13089:putfield        #345 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7016 13092:aload_0         
	// 7017 13093:getfield        #12  <Field azh a>
	// 7018 13096:astore_1        
		abyte0.bR = ((azh) (abyte0)).I | a.bR;
	// 7019 13097:aload_1         
	// 7020 13098:aload_1         
	// 7021 13099:getfield        #249 <Field int azh.I>
	// 7022 13102:aload_0         
	// 7023 13103:getfield        #12  <Field azh a>
	// 7024 13106:getfield        #345 <Field int azh.bR>
	// 7025 13109:ior             
	// 7026 13110:putfield        #345 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7027 13113:aload_0         
	// 7028 13114:getfield        #12  <Field azh a>
	// 7029 13117:astore_1        
		abyte0.bx = ((azh) (abyte0)).c & a.y;
	// 7030 13118:aload_1         
	// 7031 13119:aload_1         
	// 7032 13120:getfield        #459 <Field int azh.c>
	// 7033 13123:aload_0         
	// 7034 13124:getfield        #12  <Field azh a>
	// 7035 13127:getfield        #143 <Field int azh.y>
	// 7036 13130:iand            
	// 7037 13131:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7038 13134:aload_0         
	// 7039 13135:getfield        #12  <Field azh a>
	// 7040 13138:astore_1        
		abyte0.aX = ((azh) (abyte0)).bT | a.bx;
	// 7041 13139:aload_1         
	// 7042 13140:aload_1         
	// 7043 13141:getfield        #282 <Field int azh.bT>
	// 7044 13144:aload_0         
	// 7045 13145:getfield        #12  <Field azh a>
	// 7046 13148:getfield        #336 <Field int azh.bx>
	// 7047 13151:ior             
	// 7048 13152:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7049 13155:aload_0         
	// 7050 13156:getfield        #12  <Field azh a>
	// 7051 13159:astore_1        
		abyte0.aX = ((azh) (abyte0)).t ^ a.aX;
	// 7052 13160:aload_1         
	// 7053 13161:aload_1         
	// 7054 13162:getfield        #273 <Field int azh.t>
	// 7055 13165:aload_0         
	// 7056 13166:getfield        #12  <Field azh a>
	// 7057 13169:getfield        #339 <Field int azh.aX>
	// 7058 13172:ixor            
	// 7059 13173:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7060 13176:aload_0         
	// 7061 13177:getfield        #12  <Field azh a>
	// 7062 13180:astore_1        
		abyte0.aX = ((azh) (abyte0)).O | a.aX;
	// 7063 13181:aload_1         
	// 7064 13182:aload_1         
	// 7065 13183:getfield        #366 <Field int azh.O>
	// 7066 13186:aload_0         
	// 7067 13187:getfield        #12  <Field azh a>
	// 7068 13190:getfield        #339 <Field int azh.aX>
	// 7069 13193:ior             
	// 7070 13194:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7071 13197:aload_0         
	// 7072 13198:getfield        #12  <Field azh a>
	// 7073 13201:astore_1        
		abyte0.bq = ((azh) (abyte0)).bx ^ a.bq;
	// 7074 13202:aload_1         
	// 7075 13203:aload_1         
	// 7076 13204:getfield        #336 <Field int azh.bx>
	// 7077 13207:aload_0         
	// 7078 13208:getfield        #12  <Field azh a>
	// 7079 13211:getfield        #471 <Field int azh.bq>
	// 7080 13214:ixor            
	// 7081 13215:putfield        #471 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 7082 13218:aload_0         
	// 7083 13219:getfield        #12  <Field azh a>
	// 7084 13222:astore_1        
		abyte0.t = ((azh) (abyte0)).bF & a.bx;
	// 7085 13223:aload_1         
	// 7086 13224:aload_1         
	// 7087 13225:getfield        #276 <Field int azh.bF>
	// 7088 13228:aload_0         
	// 7089 13229:getfield        #12  <Field azh a>
	// 7090 13232:getfield        #336 <Field int azh.bx>
	// 7091 13235:iand            
	// 7092 13236:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7093 13239:aload_0         
	// 7094 13240:getfield        #12  <Field azh a>
	// 7095 13243:astore_1        
		abyte0.at = ((azh) (abyte0)).O | a.t;
	// 7096 13244:aload_1         
	// 7097 13245:aload_1         
	// 7098 13246:getfield        #366 <Field int azh.O>
	// 7099 13249:aload_0         
	// 7100 13250:getfield        #12  <Field azh a>
	// 7101 13253:getfield        #273 <Field int azh.t>
	// 7102 13256:ior             
	// 7103 13257:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7104 13260:aload_0         
	// 7105 13261:getfield        #12  <Field azh a>
	// 7106 13264:astore_1        
		abyte0.aX = ((azh) (abyte0)).t ^ a.aX;
	// 7107 13265:aload_1         
	// 7108 13266:aload_1         
	// 7109 13267:getfield        #273 <Field int azh.t>
	// 7110 13270:aload_0         
	// 7111 13271:getfield        #12  <Field azh a>
	// 7112 13274:getfield        #339 <Field int azh.aX>
	// 7113 13277:ixor            
	// 7114 13278:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7115 13281:aload_0         
	// 7116 13282:getfield        #12  <Field azh a>
	// 7117 13285:astore_1        
		abyte0.t = ((azh) (abyte0)).bF & ~a.bx;
	// 7118 13286:aload_1         
	// 7119 13287:aload_1         
	// 7120 13288:getfield        #276 <Field int azh.bF>
	// 7121 13291:aload_0         
	// 7122 13292:getfield        #12  <Field azh a>
	// 7123 13295:getfield        #336 <Field int azh.bx>
	// 7124 13298:iconst_m1       
	// 7125 13299:ixor            
	// 7126 13300:iand            
	// 7127 13301:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7128 13304:aload_0         
	// 7129 13305:getfield        #12  <Field azh a>
	// 7130 13308:astore_1        
		abyte0.t = ((azh) (abyte0)).c ^ a.t;
	// 7131 13309:aload_1         
	// 7132 13310:aload_1         
	// 7133 13311:getfield        #459 <Field int azh.c>
	// 7134 13314:aload_0         
	// 7135 13315:getfield        #12  <Field azh a>
	// 7136 13318:getfield        #273 <Field int azh.t>
	// 7137 13321:ixor            
	// 7138 13322:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7139 13325:aload_0         
	// 7140 13326:getfield        #12  <Field azh a>
	// 7141 13329:astore_1        
		abyte0.t = ((azh) (abyte0)).t & ~a.bT;
	// 7142 13330:aload_1         
	// 7143 13331:aload_1         
	// 7144 13332:getfield        #273 <Field int azh.t>
	// 7145 13335:aload_0         
	// 7146 13336:getfield        #12  <Field azh a>
	// 7147 13339:getfield        #282 <Field int azh.bT>
	// 7148 13342:iconst_m1       
	// 7149 13343:ixor            
	// 7150 13344:iand            
	// 7151 13345:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7152 13348:aload_0         
	// 7153 13349:getfield        #12  <Field azh a>
	// 7154 13352:astore_1        
		abyte0.t = ((azh) (abyte0)).bq ^ a.t;
	// 7155 13353:aload_1         
	// 7156 13354:aload_1         
	// 7157 13355:getfield        #471 <Field int azh.bq>
	// 7158 13358:aload_0         
	// 7159 13359:getfield        #12  <Field azh a>
	// 7160 13362:getfield        #273 <Field int azh.t>
	// 7161 13365:ixor            
	// 7162 13366:putfield        #273 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7163 13369:aload_0         
	// 7164 13370:getfield        #12  <Field azh a>
	// 7165 13373:astore_1        
		abyte0.bq = ((azh) (abyte0)).bF & ~a.bx;
	// 7166 13374:aload_1         
	// 7167 13375:aload_1         
	// 7168 13376:getfield        #276 <Field int azh.bF>
	// 7169 13379:aload_0         
	// 7170 13380:getfield        #12  <Field azh a>
	// 7171 13383:getfield        #336 <Field int azh.bx>
	// 7172 13386:iconst_m1       
	// 7173 13387:ixor            
	// 7174 13388:iand            
	// 7175 13389:putfield        #471 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 7176 13392:aload_0         
	// 7177 13393:getfield        #12  <Field azh a>
	// 7178 13396:astore_1        
		abyte0.bq = ((azh) (abyte0)).bT | a.bq;
	// 7179 13397:aload_1         
	// 7180 13398:aload_1         
	// 7181 13399:getfield        #282 <Field int azh.bT>
	// 7182 13402:aload_0         
	// 7183 13403:getfield        #12  <Field azh a>
	// 7184 13406:getfield        #471 <Field int azh.bq>
	// 7185 13409:ior             
	// 7186 13410:putfield        #471 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 7187 13413:aload_0         
	// 7188 13414:getfield        #12  <Field azh a>
	// 7189 13417:astore_1        
		abyte0.bq = ((azh) (abyte0)).cK ^ a.bq;
	// 7190 13418:aload_1         
	// 7191 13419:aload_1         
	// 7192 13420:getfield        #507 <Field int azh.cK>
	// 7193 13423:aload_0         
	// 7194 13424:getfield        #12  <Field azh a>
	// 7195 13427:getfield        #471 <Field int azh.bq>
	// 7196 13430:ixor            
	// 7197 13431:putfield        #471 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 7198 13434:aload_0         
	// 7199 13435:getfield        #12  <Field azh a>
	// 7200 13438:astore_1        
		abyte0.at = ((azh) (abyte0)).bq ^ a.at;
	// 7201 13439:aload_1         
	// 7202 13440:aload_1         
	// 7203 13441:getfield        #471 <Field int azh.bq>
	// 7204 13444:aload_0         
	// 7205 13445:getfield        #12  <Field azh a>
	// 7206 13448:getfield        #327 <Field int azh.at>
	// 7207 13451:ixor            
	// 7208 13452:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7209 13455:aload_0         
	// 7210 13456:getfield        #12  <Field azh a>
	// 7211 13459:astore_1        
		abyte0.cq = ((azh) (abyte0)).bx ^ a.cq;
	// 7212 13460:aload_1         
	// 7213 13461:aload_1         
	// 7214 13462:getfield        #336 <Field int azh.bx>
	// 7215 13465:aload_0         
	// 7216 13466:getfield        #12  <Field azh a>
	// 7217 13469:getfield        #456 <Field int azh.cq>
	// 7218 13472:ixor            
	// 7219 13473:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7220 13476:aload_0         
	// 7221 13477:getfield        #12  <Field azh a>
	// 7222 13480:astore_1        
		abyte0.bq = ((azh) (abyte0)).bF & ~a.bx;
	// 7223 13481:aload_1         
	// 7224 13482:aload_1         
	// 7225 13483:getfield        #276 <Field int azh.bF>
	// 7226 13486:aload_0         
	// 7227 13487:getfield        #12  <Field azh a>
	// 7228 13490:getfield        #336 <Field int azh.bx>
	// 7229 13493:iconst_m1       
	// 7230 13494:ixor            
	// 7231 13495:iand            
	// 7232 13496:putfield        #471 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 7233 13499:aload_0         
	// 7234 13500:getfield        #12  <Field azh a>
	// 7235 13503:astore_1        
		abyte0.bq = ((azh) (abyte0)).y ^ a.bq;
	// 7236 13504:aload_1         
	// 7237 13505:aload_1         
	// 7238 13506:getfield        #143 <Field int azh.y>
	// 7239 13509:aload_0         
	// 7240 13510:getfield        #12  <Field azh a>
	// 7241 13513:getfield        #471 <Field int azh.bq>
	// 7242 13516:ixor            
	// 7243 13517:putfield        #471 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 7244 13520:aload_0         
	// 7245 13521:getfield        #12  <Field azh a>
	// 7246 13524:astore_1        
		abyte0.cH = ((azh) (abyte0)).bq ^ a.cH;
	// 7247 13525:aload_1         
	// 7248 13526:aload_1         
	// 7249 13527:getfield        #471 <Field int azh.bq>
	// 7250 13530:aload_0         
	// 7251 13531:getfield        #12  <Field azh a>
	// 7252 13534:getfield        #498 <Field int azh.cH>
	// 7253 13537:ixor            
	// 7254 13538:putfield        #498 <Field int azh.cH>
		abyte0 = ((byte []) (a));
	// 7255 13541:aload_0         
	// 7256 13542:getfield        #12  <Field azh a>
	// 7257 13545:astore_1        
		abyte0.cH = ((azh) (abyte0)).cH & ~a.O;
	// 7258 13546:aload_1         
	// 7259 13547:aload_1         
	// 7260 13548:getfield        #498 <Field int azh.cH>
	// 7261 13551:aload_0         
	// 7262 13552:getfield        #12  <Field azh a>
	// 7263 13555:getfield        #366 <Field int azh.O>
	// 7264 13558:iconst_m1       
	// 7265 13559:ixor            
	// 7266 13560:iand            
	// 7267 13561:putfield        #498 <Field int azh.cH>
		abyte0 = ((byte []) (a));
	// 7268 13564:aload_0         
	// 7269 13565:getfield        #12  <Field azh a>
	// 7270 13568:astore_1        
		abyte0.cH = ((azh) (abyte0)).cI ^ a.cH;
	// 7271 13569:aload_1         
	// 7272 13570:aload_1         
	// 7273 13571:getfield        #501 <Field int azh.cI>
	// 7274 13574:aload_0         
	// 7275 13575:getfield        #12  <Field azh a>
	// 7276 13578:getfield        #498 <Field int azh.cH>
	// 7277 13581:ixor            
	// 7278 13582:putfield        #498 <Field int azh.cH>
		abyte0 = ((byte []) (a));
	// 7279 13585:aload_0         
	// 7280 13586:getfield        #12  <Field azh a>
	// 7281 13589:astore_1        
		abyte0.bx = ((azh) (abyte0)).y & ~a.bx;
	// 7282 13590:aload_1         
	// 7283 13591:aload_1         
	// 7284 13592:getfield        #143 <Field int azh.y>
	// 7285 13595:aload_0         
	// 7286 13596:getfield        #12  <Field azh a>
	// 7287 13599:getfield        #336 <Field int azh.bx>
	// 7288 13602:iconst_m1       
	// 7289 13603:ixor            
	// 7290 13604:iand            
	// 7291 13605:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7292 13608:aload_0         
	// 7293 13609:getfield        #12  <Field azh a>
	// 7294 13612:astore_1        
		abyte0.bx = ((azh) (abyte0)).bF & ~a.bx;
	// 7295 13613:aload_1         
	// 7296 13614:aload_1         
	// 7297 13615:getfield        #276 <Field int azh.bF>
	// 7298 13618:aload_0         
	// 7299 13619:getfield        #12  <Field azh a>
	// 7300 13622:getfield        #336 <Field int azh.bx>
	// 7301 13625:iconst_m1       
	// 7302 13626:ixor            
	// 7303 13627:iand            
	// 7304 13628:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7305 13631:aload_0         
	// 7306 13632:getfield        #12  <Field azh a>
	// 7307 13635:astore_1        
		abyte0.bx = ((azh) (abyte0)).ct ^ a.bx;
	// 7308 13636:aload_1         
	// 7309 13637:aload_1         
	// 7310 13638:getfield        #324 <Field int azh.ct>
	// 7311 13641:aload_0         
	// 7312 13642:getfield        #12  <Field azh a>
	// 7313 13645:getfield        #336 <Field int azh.bx>
	// 7314 13648:ixor            
	// 7315 13649:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7316 13652:aload_0         
	// 7317 13653:getfield        #12  <Field azh a>
	// 7318 13656:astore_1        
		abyte0.bx = ((azh) (abyte0)).bT & ~a.bx;
	// 7319 13657:aload_1         
	// 7320 13658:aload_1         
	// 7321 13659:getfield        #282 <Field int azh.bT>
	// 7322 13662:aload_0         
	// 7323 13663:getfield        #12  <Field azh a>
	// 7324 13666:getfield        #336 <Field int azh.bx>
	// 7325 13669:iconst_m1       
	// 7326 13670:ixor            
	// 7327 13671:iand            
	// 7328 13672:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7329 13675:aload_0         
	// 7330 13676:getfield        #12  <Field azh a>
	// 7331 13679:astore_1        
		abyte0.ct = ((azh) (abyte0)).bF & a.c;
	// 7332 13680:aload_1         
	// 7333 13681:aload_1         
	// 7334 13682:getfield        #276 <Field int azh.bF>
	// 7335 13685:aload_0         
	// 7336 13686:getfield        #12  <Field azh a>
	// 7337 13689:getfield        #459 <Field int azh.c>
	// 7338 13692:iand            
	// 7339 13693:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 7340 13696:aload_0         
	// 7341 13697:getfield        #12  <Field azh a>
	// 7342 13700:astore_1        
		abyte0.ct = ((azh) (abyte0)).c ^ a.ct;
	// 7343 13701:aload_1         
	// 7344 13702:aload_1         
	// 7345 13703:getfield        #459 <Field int azh.c>
	// 7346 13706:aload_0         
	// 7347 13707:getfield        #12  <Field azh a>
	// 7348 13710:getfield        #324 <Field int azh.ct>
	// 7349 13713:ixor            
	// 7350 13714:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 7351 13717:aload_0         
	// 7352 13718:getfield        #12  <Field azh a>
	// 7353 13721:astore_1        
		abyte0.ct = ((azh) (abyte0)).ct & ~a.bT;
	// 7354 13722:aload_1         
	// 7355 13723:aload_1         
	// 7356 13724:getfield        #324 <Field int azh.ct>
	// 7357 13727:aload_0         
	// 7358 13728:getfield        #12  <Field azh a>
	// 7359 13731:getfield        #282 <Field int azh.bT>
	// 7360 13734:iconst_m1       
	// 7361 13735:ixor            
	// 7362 13736:iand            
	// 7363 13737:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 7364 13740:aload_0         
	// 7365 13741:getfield        #12  <Field azh a>
	// 7366 13744:astore_1        
		abyte0.ct = ((azh) (abyte0)).cq ^ a.ct;
	// 7367 13745:aload_1         
	// 7368 13746:aload_1         
	// 7369 13747:getfield        #456 <Field int azh.cq>
	// 7370 13750:aload_0         
	// 7371 13751:getfield        #12  <Field azh a>
	// 7372 13754:getfield        #324 <Field int azh.ct>
	// 7373 13757:ixor            
	// 7374 13758:putfield        #324 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 7375 13761:aload_0         
	// 7376 13762:getfield        #12  <Field azh a>
	// 7377 13765:astore_1        
		abyte0.cq = ((azh) (abyte0)).bF & ~a.c;
	// 7378 13766:aload_1         
	// 7379 13767:aload_1         
	// 7380 13768:getfield        #276 <Field int azh.bF>
	// 7381 13771:aload_0         
	// 7382 13772:getfield        #12  <Field azh a>
	// 7383 13775:getfield        #459 <Field int azh.c>
	// 7384 13778:iconst_m1       
	// 7385 13779:ixor            
	// 7386 13780:iand            
	// 7387 13781:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7388 13784:aload_0         
	// 7389 13785:getfield        #12  <Field azh a>
	// 7390 13788:astore_1        
		abyte0.cq = ((azh) (abyte0)).bF ^ a.cq;
	// 7391 13789:aload_1         
	// 7392 13790:aload_1         
	// 7393 13791:getfield        #276 <Field int azh.bF>
	// 7394 13794:aload_0         
	// 7395 13795:getfield        #12  <Field azh a>
	// 7396 13798:getfield        #456 <Field int azh.cq>
	// 7397 13801:ixor            
	// 7398 13802:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7399 13805:aload_0         
	// 7400 13806:getfield        #12  <Field azh a>
	// 7401 13809:astore_1        
		abyte0.y = ((azh) (abyte0)).cq & ~a.bb;
	// 7402 13810:aload_1         
	// 7403 13811:aload_1         
	// 7404 13812:getfield        #456 <Field int azh.cq>
	// 7405 13815:aload_0         
	// 7406 13816:getfield        #12  <Field azh a>
	// 7407 13819:getfield        #330 <Field int azh.bb>
	// 7408 13822:iconst_m1       
	// 7409 13823:ixor            
	// 7410 13824:iand            
	// 7411 13825:putfield        #143 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 7412 13828:aload_0         
	// 7413 13829:getfield        #12  <Field azh a>
	// 7414 13832:astore_1        
		abyte0.y = ((azh) (abyte0)).bS ^ a.y;
	// 7415 13833:aload_1         
	// 7416 13834:aload_1         
	// 7417 13835:getfield        #453 <Field int azh.bS>
	// 7418 13838:aload_0         
	// 7419 13839:getfield        #12  <Field azh a>
	// 7420 13842:getfield        #143 <Field int azh.y>
	// 7421 13845:ixor            
	// 7422 13846:putfield        #143 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 7423 13849:aload_0         
	// 7424 13850:getfield        #12  <Field azh a>
	// 7425 13853:astore_1        
		abyte0.y = ((azh) (abyte0)).k & ~a.y;
	// 7426 13854:aload_1         
	// 7427 13855:aload_1         
	// 7428 13856:getfield        #465 <Field int azh.k>
	// 7429 13859:aload_0         
	// 7430 13860:getfield        #12  <Field azh a>
	// 7431 13863:getfield        #143 <Field int azh.y>
	// 7432 13866:iconst_m1       
	// 7433 13867:ixor            
	// 7434 13868:iand            
	// 7435 13869:putfield        #143 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 7436 13872:aload_0         
	// 7437 13873:getfield        #12  <Field azh a>
	// 7438 13876:astore_1        
		abyte0.y = ((azh) (abyte0)).cG ^ a.y;
	// 7439 13877:aload_1         
	// 7440 13878:aload_1         
	// 7441 13879:getfield        #489 <Field int azh.cG>
	// 7442 13882:aload_0         
	// 7443 13883:getfield        #12  <Field azh a>
	// 7444 13886:getfield        #143 <Field int azh.y>
	// 7445 13889:ixor            
	// 7446 13890:putfield        #143 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 7447 13893:aload_0         
	// 7448 13894:getfield        #12  <Field azh a>
	// 7449 13897:astore_1        
		abyte0.bR = ((azh) (abyte0)).y ^ a.bR;
	// 7450 13898:aload_1         
	// 7451 13899:aload_1         
	// 7452 13900:getfield        #143 <Field int azh.y>
	// 7453 13903:aload_0         
	// 7454 13904:getfield        #12  <Field azh a>
	// 7455 13907:getfield        #345 <Field int azh.bR>
	// 7456 13910:ixor            
	// 7457 13911:putfield        #345 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7458 13914:aload_0         
	// 7459 13915:getfield        #12  <Field azh a>
	// 7460 13918:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR ^ a.N;
	// 7461 13919:aload_1         
	// 7462 13920:aload_1         
	// 7463 13921:getfield        #345 <Field int azh.bR>
	// 7464 13924:aload_0         
	// 7465 13925:getfield        #12  <Field azh a>
	// 7466 13928:getfield        #381 <Field int azh.N>
	// 7467 13931:ixor            
	// 7468 13932:putfield        #345 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7469 13935:aload_0         
	// 7470 13936:getfield        #12  <Field azh a>
	// 7471 13939:astore_1        
		abyte0.cq = ((azh) (abyte0)).bb & a.cq;
	// 7472 13940:aload_1         
	// 7473 13941:aload_1         
	// 7474 13942:getfield        #330 <Field int azh.bb>
	// 7475 13945:aload_0         
	// 7476 13946:getfield        #12  <Field azh a>
	// 7477 13949:getfield        #456 <Field int azh.cq>
	// 7478 13952:iand            
	// 7479 13953:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7480 13956:aload_0         
	// 7481 13957:getfield        #12  <Field azh a>
	// 7482 13960:astore_1        
		abyte0.cq = ((azh) (abyte0)).bA ^ a.cq;
	// 7483 13961:aload_1         
	// 7484 13962:aload_1         
	// 7485 13963:getfield        #423 <Field int azh.bA>
	// 7486 13966:aload_0         
	// 7487 13967:getfield        #12  <Field azh a>
	// 7488 13970:getfield        #456 <Field int azh.cq>
	// 7489 13973:ixor            
	// 7490 13974:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7491 13977:aload_0         
	// 7492 13978:getfield        #12  <Field azh a>
	// 7493 13981:astore_1        
		abyte0.cq = ((azh) (abyte0)).k & a.cq;
	// 7494 13982:aload_1         
	// 7495 13983:aload_1         
	// 7496 13984:getfield        #465 <Field int azh.k>
	// 7497 13987:aload_0         
	// 7498 13988:getfield        #12  <Field azh a>
	// 7499 13991:getfield        #456 <Field int azh.cq>
	// 7500 13994:iand            
	// 7501 13995:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7502 13998:aload_0         
	// 7503 13999:getfield        #12  <Field azh a>
	// 7504 14002:astore_1        
		abyte0.cq = ((azh) (abyte0)).co ^ a.cq;
	// 7505 14003:aload_1         
	// 7506 14004:aload_1         
	// 7507 14005:getfield        #492 <Field int azh.co>
	// 7508 14008:aload_0         
	// 7509 14009:getfield        #12  <Field azh a>
	// 7510 14012:getfield        #456 <Field int azh.cq>
	// 7511 14015:ixor            
	// 7512 14016:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7513 14019:aload_0         
	// 7514 14020:getfield        #12  <Field azh a>
	// 7515 14023:astore_1        
		abyte0.cq = ((azh) (abyte0)).cq & ~a.I;
	// 7516 14024:aload_1         
	// 7517 14025:aload_1         
	// 7518 14026:getfield        #456 <Field int azh.cq>
	// 7519 14029:aload_0         
	// 7520 14030:getfield        #12  <Field azh a>
	// 7521 14033:getfield        #249 <Field int azh.I>
	// 7522 14036:iconst_m1       
	// 7523 14037:ixor            
	// 7524 14038:iand            
	// 7525 14039:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7526 14042:aload_0         
	// 7527 14043:getfield        #12  <Field azh a>
	// 7528 14046:astore_1        
		abyte0.cq = ((azh) (abyte0)).ba ^ a.cq;
	// 7529 14047:aload_1         
	// 7530 14048:aload_1         
	// 7531 14049:getfield        #333 <Field int azh.ba>
	// 7532 14052:aload_0         
	// 7533 14053:getfield        #12  <Field azh a>
	// 7534 14056:getfield        #456 <Field int azh.cq>
	// 7535 14059:ixor            
	// 7536 14060:putfield        #456 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 7537 14063:aload_0         
	// 7538 14064:getfield        #12  <Field azh a>
	// 7539 14067:astore_1        
		abyte0.ae = ((azh) (abyte0)).cq ^ a.ae;
	// 7540 14068:aload_1         
	// 7541 14069:aload_1         
	// 7542 14070:getfield        #456 <Field int azh.cq>
	// 7543 14073:aload_0         
	// 7544 14074:getfield        #12  <Field azh a>
	// 7545 14077:getfield        #519 <Field int azh.ae>
	// 7546 14080:ixor            
	// 7547 14081:putfield        #519 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 7548 14084:aload_0         
	// 7549 14085:getfield        #12  <Field azh a>
	// 7550 14088:astore_1        
		abyte0.ae = ~((azh) (abyte0)).ae;
	// 7551 14089:aload_1         
	// 7552 14090:aload_1         
	// 7553 14091:getfield        #519 <Field int azh.ae>
	// 7554 14094:iconst_m1       
	// 7555 14095:ixor            
	// 7556 14096:putfield        #519 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 7557 14099:aload_0         
	// 7558 14100:getfield        #12  <Field azh a>
	// 7559 14103:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & ~a.c;
	// 7560 14104:aload_1         
	// 7561 14105:aload_1         
	// 7562 14106:getfield        #303 <Field int azh.bo>
	// 7563 14109:aload_0         
	// 7564 14110:getfield        #12  <Field azh a>
	// 7565 14113:getfield        #459 <Field int azh.c>
	// 7566 14116:iconst_m1       
	// 7567 14117:ixor            
	// 7568 14118:iand            
	// 7569 14119:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7570 14122:aload_0         
	// 7571 14123:getfield        #12  <Field azh a>
	// 7572 14126:astore_1        
		abyte0.bo = ((azh) (abyte0)).A ^ a.bo;
	// 7573 14127:aload_1         
	// 7574 14128:aload_1         
	// 7575 14129:getfield        #321 <Field int azh.A>
	// 7576 14132:aload_0         
	// 7577 14133:getfield        #12  <Field azh a>
	// 7578 14136:getfield        #303 <Field int azh.bo>
	// 7579 14139:ixor            
	// 7580 14140:putfield        #303 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7581 14143:aload_0         
	// 7582 14144:getfield        #12  <Field azh a>
	// 7583 14147:astore_1        
		abyte0.bY = ((azh) (abyte0)).bo ^ a.bY;
	// 7584 14148:aload_1         
	// 7585 14149:aload_1         
	// 7586 14150:getfield        #303 <Field int azh.bo>
	// 7587 14153:aload_0         
	// 7588 14154:getfield        #12  <Field azh a>
	// 7589 14157:getfield        #348 <Field int azh.bY>
	// 7590 14160:ixor            
	// 7591 14161:putfield        #348 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 7592 14164:aload_0         
	// 7593 14165:getfield        #12  <Field azh a>
	// 7594 14168:astore_1        
		abyte0.bY = ((azh) (abyte0)).k & ~a.bY;
	// 7595 14169:aload_1         
	// 7596 14170:aload_1         
	// 7597 14171:getfield        #465 <Field int azh.k>
	// 7598 14174:aload_0         
	// 7599 14175:getfield        #12  <Field azh a>
	// 7600 14178:getfield        #348 <Field int azh.bY>
	// 7601 14181:iconst_m1       
	// 7602 14182:ixor            
	// 7603 14183:iand            
	// 7604 14184:putfield        #348 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 7605 14187:aload_0         
	// 7606 14188:getfield        #12  <Field azh a>
	// 7607 14191:astore_1        
		abyte0.bY = ((azh) (abyte0)).bP ^ a.bY;
	// 7608 14192:aload_1         
	// 7609 14193:aload_1         
	// 7610 14194:getfield        #480 <Field int azh.bP>
	// 7611 14197:aload_0         
	// 7612 14198:getfield        #12  <Field azh a>
	// 7613 14201:getfield        #348 <Field int azh.bY>
	// 7614 14204:ixor            
	// 7615 14205:putfield        #348 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 7616 14208:aload_0         
	// 7617 14209:getfield        #12  <Field azh a>
	// 7618 14212:astore_1        
		abyte0.bP = ((azh) (abyte0)).bF & a.c;
	// 7619 14213:aload_1         
	// 7620 14214:aload_1         
	// 7621 14215:getfield        #276 <Field int azh.bF>
	// 7622 14218:aload_0         
	// 7623 14219:getfield        #12  <Field azh a>
	// 7624 14222:getfield        #459 <Field int azh.c>
	// 7625 14225:iand            
	// 7626 14226:putfield        #480 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 7627 14229:aload_0         
	// 7628 14230:getfield        #12  <Field azh a>
	// 7629 14233:astore_1        
		abyte0.bP = ((azh) (abyte0)).cK ^ a.bP;
	// 7630 14234:aload_1         
	// 7631 14235:aload_1         
	// 7632 14236:getfield        #507 <Field int azh.cK>
	// 7633 14239:aload_0         
	// 7634 14240:getfield        #12  <Field azh a>
	// 7635 14243:getfield        #480 <Field int azh.bP>
	// 7636 14246:ixor            
	// 7637 14247:putfield        #480 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 7638 14250:aload_0         
	// 7639 14251:getfield        #12  <Field azh a>
	// 7640 14254:astore_1        
		abyte0.bx = ((azh) (abyte0)).bP ^ a.bx;
	// 7641 14255:aload_1         
	// 7642 14256:aload_1         
	// 7643 14257:getfield        #480 <Field int azh.bP>
	// 7644 14260:aload_0         
	// 7645 14261:getfield        #12  <Field azh a>
	// 7646 14264:getfield        #336 <Field int azh.bx>
	// 7647 14267:ixor            
	// 7648 14268:putfield        #336 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7649 14271:aload_0         
	// 7650 14272:getfield        #12  <Field azh a>
	// 7651 14275:astore_1        
		abyte0.cn = ((azh) (abyte0)).bx ^ a.cn;
	// 7652 14276:aload_1         
	// 7653 14277:aload_1         
	// 7654 14278:getfield        #336 <Field int azh.bx>
	// 7655 14281:aload_0         
	// 7656 14282:getfield        #12  <Field azh a>
	// 7657 14285:getfield        #468 <Field int azh.cn>
	// 7658 14288:ixor            
	// 7659 14289:putfield        #468 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 7660 14292:aload_0         
	// 7661 14293:getfield        #12  <Field azh a>
	// 7662 14296:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bP ^ a.aZ;
	// 7663 14297:aload_1         
	// 7664 14298:aload_1         
	// 7665 14299:getfield        #480 <Field int azh.bP>
	// 7666 14302:aload_0         
	// 7667 14303:getfield        #12  <Field azh a>
	// 7668 14306:getfield        #474 <Field int azh.aZ>
	// 7669 14309:ixor            
	// 7670 14310:putfield        #474 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7671 14313:aload_0         
	// 7672 14314:getfield        #12  <Field azh a>
	// 7673 14317:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & ~a.O;
	// 7674 14318:aload_1         
	// 7675 14319:aload_1         
	// 7676 14320:getfield        #474 <Field int azh.aZ>
	// 7677 14323:aload_0         
	// 7678 14324:getfield        #12  <Field azh a>
	// 7679 14327:getfield        #366 <Field int azh.O>
	// 7680 14330:iconst_m1       
	// 7681 14331:ixor            
	// 7682 14332:iand            
	// 7683 14333:putfield        #474 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7684 14336:aload_0         
	// 7685 14337:getfield        #12  <Field azh a>
	// 7686 14340:astore_1        
		abyte0.aZ = ((azh) (abyte0)).ct ^ a.aZ;
	// 7687 14341:aload_1         
	// 7688 14342:aload_1         
	// 7689 14343:getfield        #324 <Field int azh.ct>
	// 7690 14346:aload_0         
	// 7691 14347:getfield        #12  <Field azh a>
	// 7692 14350:getfield        #474 <Field int azh.aZ>
	// 7693 14353:ixor            
	// 7694 14354:putfield        #474 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7695 14357:aload_0         
	// 7696 14358:getfield        #12  <Field azh a>
	// 7697 14361:astore_1        
		abyte0.bT = ((azh) (abyte0)).bP & ~a.bT;
	// 7698 14362:aload_1         
	// 7699 14363:aload_1         
	// 7700 14364:getfield        #480 <Field int azh.bP>
	// 7701 14367:aload_0         
	// 7702 14368:getfield        #12  <Field azh a>
	// 7703 14371:getfield        #282 <Field int azh.bT>
	// 7704 14374:iconst_m1       
	// 7705 14375:ixor            
	// 7706 14376:iand            
	// 7707 14377:putfield        #282 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 7708 14380:aload_0         
	// 7709 14381:getfield        #12  <Field azh a>
	// 7710 14384:astore_1        
		abyte0.bT = ((azh) (abyte0)).cM ^ a.bT;
	// 7711 14385:aload_1         
	// 7712 14386:aload_1         
	// 7713 14387:getfield        #513 <Field int azh.cM>
	// 7714 14390:aload_0         
	// 7715 14391:getfield        #12  <Field azh a>
	// 7716 14394:getfield        #282 <Field int azh.bT>
	// 7717 14397:ixor            
	// 7718 14398:putfield        #282 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 7719 14401:aload_0         
	// 7720 14402:getfield        #12  <Field azh a>
	// 7721 14405:astore_1        
		abyte0.bT = ((azh) (abyte0)).O | a.bT;
	// 7722 14406:aload_1         
	// 7723 14407:aload_1         
	// 7724 14408:getfield        #366 <Field int azh.O>
	// 7725 14411:aload_0         
	// 7726 14412:getfield        #12  <Field azh a>
	// 7727 14415:getfield        #282 <Field int azh.bT>
	// 7728 14418:ior             
	// 7729 14419:putfield        #282 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 7730 14422:aload_0         
	// 7731 14423:getfield        #12  <Field azh a>
	// 7732 14426:astore_1        
		abyte0.bT = ((azh) (abyte0)).t ^ a.bT;
	// 7733 14427:aload_1         
	// 7734 14428:aload_1         
	// 7735 14429:getfield        #273 <Field int azh.t>
	// 7736 14432:aload_0         
	// 7737 14433:getfield        #12  <Field azh a>
	// 7738 14436:getfield        #282 <Field int azh.bT>
	// 7739 14439:ixor            
	// 7740 14440:putfield        #282 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 7741 14443:aload_0         
	// 7742 14444:getfield        #12  <Field azh a>
	// 7743 14447:astore_1        
		abyte0.c = ((azh) (abyte0)).bJ ^ a.c;
	// 7744 14448:aload_1         
	// 7745 14449:aload_1         
	// 7746 14450:getfield        #342 <Field int azh.bJ>
	// 7747 14453:aload_0         
	// 7748 14454:getfield        #12  <Field azh a>
	// 7749 14457:getfield        #459 <Field int azh.c>
	// 7750 14460:ixor            
	// 7751 14461:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7752 14464:aload_0         
	// 7753 14465:getfield        #12  <Field azh a>
	// 7754 14468:astore_1        
		abyte0.c = ((azh) (abyte0)).bb & ~a.c;
	// 7755 14469:aload_1         
	// 7756 14470:aload_1         
	// 7757 14471:getfield        #330 <Field int azh.bb>
	// 7758 14474:aload_0         
	// 7759 14475:getfield        #12  <Field azh a>
	// 7760 14478:getfield        #459 <Field int azh.c>
	// 7761 14481:iconst_m1       
	// 7762 14482:ixor            
	// 7763 14483:iand            
	// 7764 14484:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7765 14487:aload_0         
	// 7766 14488:getfield        #12  <Field azh a>
	// 7767 14491:astore_1        
		abyte0.c = ((azh) (abyte0)).af ^ a.c;
	// 7768 14492:aload_1         
	// 7769 14493:aload_1         
	// 7770 14494:getfield        #247 <Field int azh.af>
	// 7771 14497:aload_0         
	// 7772 14498:getfield        #12  <Field azh a>
	// 7773 14501:getfield        #459 <Field int azh.c>
	// 7774 14504:ixor            
	// 7775 14505:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7776 14508:aload_0         
	// 7777 14509:getfield        #12  <Field azh a>
	// 7778 14512:astore_1        
		abyte0.c = ((azh) (abyte0)).k & a.c;
	// 7779 14513:aload_1         
	// 7780 14514:aload_1         
	// 7781 14515:getfield        #465 <Field int azh.k>
	// 7782 14518:aload_0         
	// 7783 14519:getfield        #12  <Field azh a>
	// 7784 14522:getfield        #459 <Field int azh.c>
	// 7785 14525:iand            
	// 7786 14526:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7787 14529:aload_0         
	// 7788 14530:getfield        #12  <Field azh a>
	// 7789 14533:astore_1        
		abyte0.c = ((azh) (abyte0)).az ^ a.c;
	// 7790 14534:aload_1         
	// 7791 14535:aload_1         
	// 7792 14536:getfield        #483 <Field int azh.az>
	// 7793 14539:aload_0         
	// 7794 14540:getfield        #12  <Field azh a>
	// 7795 14543:getfield        #459 <Field int azh.c>
	// 7796 14546:ixor            
	// 7797 14547:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7798 14550:aload_0         
	// 7799 14551:getfield        #12  <Field azh a>
	// 7800 14554:astore_1        
		abyte0.c = ((azh) (abyte0)).I | a.c;
	// 7801 14555:aload_1         
	// 7802 14556:aload_1         
	// 7803 14557:getfield        #249 <Field int azh.I>
	// 7804 14560:aload_0         
	// 7805 14561:getfield        #12  <Field azh a>
	// 7806 14564:getfield        #459 <Field int azh.c>
	// 7807 14567:ior             
	// 7808 14568:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7809 14571:aload_0         
	// 7810 14572:getfield        #12  <Field azh a>
	// 7811 14575:astore_1        
		abyte0.c = ((azh) (abyte0)).bY ^ a.c;
	// 7812 14576:aload_1         
	// 7813 14577:aload_1         
	// 7814 14578:getfield        #348 <Field int azh.bY>
	// 7815 14581:aload_0         
	// 7816 14582:getfield        #12  <Field azh a>
	// 7817 14585:getfield        #459 <Field int azh.c>
	// 7818 14588:ixor            
	// 7819 14589:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7820 14592:aload_0         
	// 7821 14593:getfield        #12  <Field azh a>
	// 7822 14596:astore_1        
		abyte0.bE = ((azh) (abyte0)).c ^ a.bE;
	// 7823 14597:aload_1         
	// 7824 14598:aload_1         
	// 7825 14599:getfield        #459 <Field int azh.c>
	// 7826 14602:aload_0         
	// 7827 14603:getfield        #12  <Field azh a>
	// 7828 14606:getfield        #312 <Field int azh.bE>
	// 7829 14609:ixor            
	// 7830 14610:putfield        #312 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 7831 14613:aload_0         
	// 7832 14614:getfield        #12  <Field azh a>
	// 7833 14617:astore_1        
		abyte0.bG = ((azh) (abyte0)).aj & ~a.bG;
	// 7834 14618:aload_1         
	// 7835 14619:aload_1         
	// 7836 14620:getfield        #372 <Field int azh.aj>
	// 7837 14623:aload_0         
	// 7838 14624:getfield        #12  <Field azh a>
	// 7839 14627:getfield        #378 <Field int azh.bG>
	// 7840 14630:iconst_m1       
	// 7841 14631:ixor            
	// 7842 14632:iand            
	// 7843 14633:putfield        #378 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 7844 14636:aload_0         
	// 7845 14637:getfield        #12  <Field azh a>
	// 7846 14640:astore_1        
		abyte0.aD = ((azh) (abyte0)).aj & ~a.aD;
	// 7847 14641:aload_1         
	// 7848 14642:aload_1         
	// 7849 14643:getfield        #372 <Field int azh.aj>
	// 7850 14646:aload_0         
	// 7851 14647:getfield        #12  <Field azh a>
	// 7852 14650:getfield        #390 <Field int azh.aD>
	// 7853 14653:iconst_m1       
	// 7854 14654:ixor            
	// 7855 14655:iand            
	// 7856 14656:putfield        #390 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7857 14659:aload_0         
	// 7858 14660:getfield        #12  <Field azh a>
	// 7859 14663:astore_1        
		abyte0.aD = ((azh) (abyte0)).h ^ a.aD;
	// 7860 14664:aload_1         
	// 7861 14665:aload_1         
	// 7862 14666:getfield        #522 <Field int azh.h>
	// 7863 14669:aload_0         
	// 7864 14670:getfield        #12  <Field azh a>
	// 7865 14673:getfield        #390 <Field int azh.aD>
	// 7866 14676:ixor            
	// 7867 14677:putfield        #390 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7868 14680:aload_0         
	// 7869 14681:getfield        #12  <Field azh a>
	// 7870 14684:astore_1        
		abyte0.aD = ((azh) (abyte0)).F | a.aD;
	// 7871 14685:aload_1         
	// 7872 14686:aload_1         
	// 7873 14687:getfield        #393 <Field int azh.F>
	// 7874 14690:aload_0         
	// 7875 14691:getfield        #12  <Field azh a>
	// 7876 14694:getfield        #390 <Field int azh.aD>
	// 7877 14697:ior             
	// 7878 14698:putfield        #390 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7879 14701:aload_0         
	// 7880 14702:getfield        #12  <Field azh a>
	// 7881 14705:astore_1        
		abyte0.aD = ((azh) (abyte0)).aU ^ a.aD;
	// 7882 14706:aload_1         
	// 7883 14707:aload_1         
	// 7884 14708:getfield        #399 <Field int azh.aU>
	// 7885 14711:aload_0         
	// 7886 14712:getfield        #12  <Field azh a>
	// 7887 14715:getfield        #390 <Field int azh.aD>
	// 7888 14718:ixor            
	// 7889 14719:putfield        #390 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7890 14722:aload_0         
	// 7891 14723:getfield        #12  <Field azh a>
	// 7892 14726:astore_1        
		abyte0.aD = ((azh) (abyte0)).x & ~a.aD;
	// 7893 14727:aload_1         
	// 7894 14728:aload_1         
	// 7895 14729:getfield        #411 <Field int azh.x>
	// 7896 14732:aload_0         
	// 7897 14733:getfield        #12  <Field azh a>
	// 7898 14736:getfield        #390 <Field int azh.aD>
	// 7899 14739:iconst_m1       
	// 7900 14740:ixor            
	// 7901 14741:iand            
	// 7902 14742:putfield        #390 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7903 14745:aload_0         
	// 7904 14746:getfield        #12  <Field azh a>
	// 7905 14749:astore_1        
		abyte0.aU = ((azh) (abyte0)).aj & ~a.h;
	// 7906 14750:aload_1         
	// 7907 14751:aload_1         
	// 7908 14752:getfield        #372 <Field int azh.aj>
	// 7909 14755:aload_0         
	// 7910 14756:getfield        #12  <Field azh a>
	// 7911 14759:getfield        #522 <Field int azh.h>
	// 7912 14762:iconst_m1       
	// 7913 14763:ixor            
	// 7914 14764:iand            
	// 7915 14765:putfield        #399 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7916 14768:aload_0         
	// 7917 14769:getfield        #12  <Field azh a>
	// 7918 14772:astore_1        
		abyte0.c = ((azh) (abyte0)).aU & ~a.p;
	// 7919 14773:aload_1         
	// 7920 14774:aload_1         
	// 7921 14775:getfield        #399 <Field int azh.aU>
	// 7922 14778:aload_0         
	// 7923 14779:getfield        #12  <Field azh a>
	// 7924 14782:getfield        #387 <Field int azh.p>
	// 7925 14785:iconst_m1       
	// 7926 14786:ixor            
	// 7927 14787:iand            
	// 7928 14788:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7929 14791:aload_0         
	// 7930 14792:getfield        #12  <Field azh a>
	// 7931 14795:astore_1        
		abyte0.c = ((azh) (abyte0)).aj ^ a.c;
	// 7932 14796:aload_1         
	// 7933 14797:aload_1         
	// 7934 14798:getfield        #372 <Field int azh.aj>
	// 7935 14801:aload_0         
	// 7936 14802:getfield        #12  <Field azh a>
	// 7937 14805:getfield        #459 <Field int azh.c>
	// 7938 14808:ixor            
	// 7939 14809:putfield        #459 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7940 14812:aload_0         
	// 7941 14813:getfield        #12  <Field azh a>
	// 7942 14816:astore_1        
		abyte0.n = ((azh) (abyte0)).c ^ a.n;
	// 7943 14817:aload_1         
	// 7944 14818:aload_1         
	// 7945 14819:getfield        #459 <Field int azh.c>
	// 7946 14822:aload_0         
	// 7947 14823:getfield        #12  <Field azh a>
	// 7948 14826:getfield        #417 <Field int azh.n>
	// 7949 14829:ixor            
	// 7950 14830:putfield        #417 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7951 14833:aload_0         
	// 7952 14834:getfield        #12  <Field azh a>
	// 7953 14837:astore_1        
		abyte0.n = ((azh) (abyte0)).x & ~a.n;
	// 7954 14838:aload_1         
	// 7955 14839:aload_1         
	// 7956 14840:getfield        #411 <Field int azh.x>
	// 7957 14843:aload_0         
	// 7958 14844:getfield        #12  <Field azh a>
	// 7959 14847:getfield        #417 <Field int azh.n>
	// 7960 14850:iconst_m1       
	// 7961 14851:ixor            
	// 7962 14852:iand            
	// 7963 14853:putfield        #417 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7964 14856:aload_0         
	// 7965 14857:getfield        #12  <Field azh a>
	// 7966 14860:astore_1        
		abyte0.aU = ((azh) (abyte0)).p | a.aU;
	// 7967 14861:aload_1         
	// 7968 14862:aload_1         
	// 7969 14863:getfield        #387 <Field int azh.p>
	// 7970 14866:aload_0         
	// 7971 14867:getfield        #12  <Field azh a>
	// 7972 14870:getfield        #399 <Field int azh.aU>
	// 7973 14873:ior             
	// 7974 14874:putfield        #399 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7975 14877:aload_0         
	// 7976 14878:getfield        #12  <Field azh a>
	// 7977 14881:astore_1        
		abyte0.b = ((azh) (abyte0)).aj & a.b;
	// 7978 14882:aload_1         
	// 7979 14883:aload_1         
	// 7980 14884:getfield        #372 <Field int azh.aj>
	// 7981 14887:aload_0         
	// 7982 14888:getfield        #12  <Field azh a>
	// 7983 14891:getfield        #384 <Field int azh.b>
	// 7984 14894:iand            
	// 7985 14895:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 7986 14898:aload_0         
	// 7987 14899:getfield        #12  <Field azh a>
	// 7988 14902:astore_1        
		abyte0.b = ((azh) (abyte0)).N ^ a.b;
	// 7989 14903:aload_1         
	// 7990 14904:aload_1         
	// 7991 14905:getfield        #381 <Field int azh.N>
	// 7992 14908:aload_0         
	// 7993 14909:getfield        #12  <Field azh a>
	// 7994 14912:getfield        #384 <Field int azh.b>
	// 7995 14915:ixor            
	// 7996 14916:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 7997 14919:aload_0         
	// 7998 14920:getfield        #12  <Field azh a>
	// 7999 14923:astore_1        
		abyte0.b = ((azh) (abyte0)).b & a.p;
	// 8000 14924:aload_1         
	// 8001 14925:aload_1         
	// 8002 14926:getfield        #384 <Field int azh.b>
	// 8003 14929:aload_0         
	// 8004 14930:getfield        #12  <Field azh a>
	// 8005 14933:getfield        #387 <Field int azh.p>
	// 8006 14936:iand            
	// 8007 14937:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 8008 14940:aload_0         
	// 8009 14941:getfield        #12  <Field azh a>
	// 8010 14944:astore_1        
		abyte0.N = ((azh) (abyte0)).aj & ~a.bZ;
	// 8011 14945:aload_1         
	// 8012 14946:aload_1         
	// 8013 14947:getfield        #372 <Field int azh.aj>
	// 8014 14950:aload_0         
	// 8015 14951:getfield        #12  <Field azh a>
	// 8016 14954:getfield        #402 <Field int azh.bZ>
	// 8017 14957:iconst_m1       
	// 8018 14958:ixor            
	// 8019 14959:iand            
	// 8020 14960:putfield        #381 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 8021 14963:aload_0         
	// 8022 14964:getfield        #12  <Field azh a>
	// 8023 14967:astore_1        
		abyte0.N = ((azh) (abyte0)).h ^ a.N;
	// 8024 14968:aload_1         
	// 8025 14969:aload_1         
	// 8026 14970:getfield        #522 <Field int azh.h>
	// 8027 14973:aload_0         
	// 8028 14974:getfield        #12  <Field azh a>
	// 8029 14977:getfield        #381 <Field int azh.N>
	// 8030 14980:ixor            
	// 8031 14981:putfield        #381 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 8032 14984:aload_0         
	// 8033 14985:getfield        #12  <Field azh a>
	// 8034 14988:astore_1        
		abyte0.N = ((azh) (abyte0)).p | a.N;
	// 8035 14989:aload_1         
	// 8036 14990:aload_1         
	// 8037 14991:getfield        #387 <Field int azh.p>
	// 8038 14994:aload_0         
	// 8039 14995:getfield        #12  <Field azh a>
	// 8040 14998:getfield        #381 <Field int azh.N>
	// 8041 15001:ior             
	// 8042 15002:putfield        #381 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 8043 15005:aload_0         
	// 8044 15006:getfield        #12  <Field azh a>
	// 8045 15009:astore_1        
		abyte0.N = ((azh) (abyte0)).aQ ^ a.N;
	// 8046 15010:aload_1         
	// 8047 15011:aload_1         
	// 8048 15012:getfield        #86  <Field int azh.aQ>
	// 8049 15015:aload_0         
	// 8050 15016:getfield        #12  <Field azh a>
	// 8051 15019:getfield        #381 <Field int azh.N>
	// 8052 15022:ixor            
	// 8053 15023:putfield        #381 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 8054 15026:aload_0         
	// 8055 15027:getfield        #12  <Field azh a>
	// 8056 15030:astore_1        
		abyte0.N = ((azh) (abyte0)).F | a.N;
	// 8057 15031:aload_1         
	// 8058 15032:aload_1         
	// 8059 15033:getfield        #393 <Field int azh.F>
	// 8060 15036:aload_0         
	// 8061 15037:getfield        #12  <Field azh a>
	// 8062 15040:getfield        #381 <Field int azh.N>
	// 8063 15043:ior             
	// 8064 15044:putfield        #381 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 8065 15047:aload_0         
	// 8066 15048:getfield        #12  <Field azh a>
	// 8067 15051:astore_1        
		abyte0.N = ((azh) (abyte0)).aq ^ a.N;
	// 8068 15052:aload_1         
	// 8069 15053:aload_1         
	// 8070 15054:getfield        #408 <Field int azh.aq>
	// 8071 15057:aload_0         
	// 8072 15058:getfield        #12  <Field azh a>
	// 8073 15061:getfield        #381 <Field int azh.N>
	// 8074 15064:ixor            
	// 8075 15065:putfield        #381 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 8076 15068:aload_0         
	// 8077 15069:getfield        #12  <Field azh a>
	// 8078 15072:astore_1        
		abyte0.aD = ((azh) (abyte0)).N ^ a.aD;
	// 8079 15073:aload_1         
	// 8080 15074:aload_1         
	// 8081 15075:getfield        #381 <Field int azh.N>
	// 8082 15078:aload_0         
	// 8083 15079:getfield        #12  <Field azh a>
	// 8084 15082:getfield        #390 <Field int azh.aD>
	// 8085 15085:ixor            
	// 8086 15086:putfield        #390 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 8087 15089:aload_0         
	// 8088 15090:getfield        #12  <Field azh a>
	// 8089 15093:astore_1        
		abyte0.Y = ((azh) (abyte0)).aD ^ a.Y;
	// 8090 15094:aload_1         
	// 8091 15095:aload_1         
	// 8092 15096:getfield        #390 <Field int azh.aD>
	// 8093 15099:aload_0         
	// 8094 15100:getfield        #12  <Field azh a>
	// 8095 15103:getfield        #525 <Field int azh.Y>
	// 8096 15106:ixor            
	// 8097 15107:putfield        #525 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 8098 15110:aload_0         
	// 8099 15111:getfield        #12  <Field azh a>
	// 8100 15114:astore_1        
		abyte0.aD = ~((azh) (abyte0)).Y;
	// 8101 15115:aload_1         
	// 8102 15116:aload_1         
	// 8103 15117:getfield        #525 <Field int azh.Y>
	// 8104 15120:iconst_m1       
	// 8105 15121:ixor            
	// 8106 15122:putfield        #390 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 8107 15125:aload_0         
	// 8108 15126:getfield        #12  <Field azh a>
	// 8109 15129:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ ^ a.aj;
	// 8110 15130:aload_1         
	// 8111 15131:aload_1         
	// 8112 15132:getfield        #402 <Field int azh.bZ>
	// 8113 15135:aload_0         
	// 8114 15136:getfield        #12  <Field azh a>
	// 8115 15139:getfield        #372 <Field int azh.aj>
	// 8116 15142:ixor            
	// 8117 15143:putfield        #402 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 8118 15146:aload_0         
	// 8119 15147:getfield        #12  <Field azh a>
	// 8120 15150:astore_1        
		abyte0.aU = ((azh) (abyte0)).bZ ^ a.aU;
	// 8121 15151:aload_1         
	// 8122 15152:aload_1         
	// 8123 15153:getfield        #402 <Field int azh.bZ>
	// 8124 15156:aload_0         
	// 8125 15157:getfield        #12  <Field azh a>
	// 8126 15160:getfield        #399 <Field int azh.aU>
	// 8127 15163:ixor            
	// 8128 15164:putfield        #399 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 8129 15167:aload_0         
	// 8130 15168:getfield        #12  <Field azh a>
	// 8131 15171:astore_1        
		abyte0.bg = ((azh) (abyte0)).aj & ~a.bg;
	// 8132 15172:aload_1         
	// 8133 15173:aload_1         
	// 8134 15174:getfield        #372 <Field int azh.aj>
	// 8135 15177:aload_0         
	// 8136 15178:getfield        #12  <Field azh a>
	// 8137 15181:getfield        #528 <Field int azh.bg>
	// 8138 15184:iconst_m1       
	// 8139 15185:ixor            
	// 8140 15186:iand            
	// 8141 15187:putfield        #528 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8142 15190:aload_0         
	// 8143 15191:getfield        #12  <Field azh a>
	// 8144 15194:astore_1        
		abyte0.bg = ((azh) (abyte0)).aA ^ a.bg;
	// 8145 15195:aload_1         
	// 8146 15196:aload_1         
	// 8147 15197:getfield        #531 <Field int azh.aA>
	// 8148 15200:aload_0         
	// 8149 15201:getfield        #12  <Field azh a>
	// 8150 15204:getfield        #528 <Field int azh.bg>
	// 8151 15207:ixor            
	// 8152 15208:putfield        #528 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8153 15211:aload_0         
	// 8154 15212:getfield        #12  <Field azh a>
	// 8155 15215:astore_1        
		abyte0.w = ((azh) (abyte0)).bg ^ a.w;
	// 8156 15216:aload_1         
	// 8157 15217:aload_1         
	// 8158 15218:getfield        #528 <Field int azh.bg>
	// 8159 15221:aload_0         
	// 8160 15222:getfield        #12  <Field azh a>
	// 8161 15225:getfield        #534 <Field int azh.w>
	// 8162 15228:ixor            
	// 8163 15229:putfield        #534 <Field int azh.w>
		abyte0 = ((byte []) (a));
	// 8164 15232:aload_0         
	// 8165 15233:getfield        #12  <Field azh a>
	// 8166 15236:astore_1        
		abyte0.cF = ((azh) (abyte0)).w & ~a.cF;
	// 8167 15237:aload_1         
	// 8168 15238:aload_1         
	// 8169 15239:getfield        #534 <Field int azh.w>
	// 8170 15242:aload_0         
	// 8171 15243:getfield        #12  <Field azh a>
	// 8172 15246:getfield        #83  <Field int azh.cF>
	// 8173 15249:iconst_m1       
	// 8174 15250:ixor            
	// 8175 15251:iand            
	// 8176 15252:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	// 8177 15255:aload_0         
	// 8178 15256:getfield        #12  <Field azh a>
	// 8179 15259:astore_1        
		abyte0.cF = ((azh) (abyte0)).bM ^ a.cF;
	// 8180 15260:aload_1         
	// 8181 15261:aload_1         
	// 8182 15262:getfield        #208 <Field int azh.bM>
	// 8183 15265:aload_0         
	// 8184 15266:getfield        #12  <Field azh a>
	// 8185 15269:getfield        #83  <Field int azh.cF>
	// 8186 15272:ixor            
	// 8187 15273:putfield        #83  <Field int azh.cF>
		abyte0 = ((byte []) (a));
	// 8188 15276:aload_0         
	// 8189 15277:getfield        #12  <Field azh a>
	// 8190 15280:astore_1        
		abyte0.aM = ((azh) (abyte0)).w & ~a.aM;
	// 8191 15281:aload_1         
	// 8192 15282:aload_1         
	// 8193 15283:getfield        #534 <Field int azh.w>
	// 8194 15286:aload_0         
	// 8195 15287:getfield        #12  <Field azh a>
	// 8196 15290:getfield        #116 <Field int azh.aM>
	// 8197 15293:iconst_m1       
	// 8198 15294:ixor            
	// 8199 15295:iand            
	// 8200 15296:putfield        #116 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8201 15299:aload_0         
	// 8202 15300:getfield        #12  <Field azh a>
	// 8203 15303:astore_1        
		abyte0.aM = ((azh) (abyte0)).aO ^ a.aM;
	// 8204 15304:aload_1         
	// 8205 15305:aload_1         
	// 8206 15306:getfield        #214 <Field int azh.aO>
	// 8207 15309:aload_0         
	// 8208 15310:getfield        #12  <Field azh a>
	// 8209 15313:getfield        #116 <Field int azh.aM>
	// 8210 15316:ixor            
	// 8211 15317:putfield        #116 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8212 15320:aload_0         
	// 8213 15321:getfield        #12  <Field azh a>
	// 8214 15324:astore_1        
		abyte0.aM = ((azh) (abyte0)).E & a.aM;
	// 8215 15325:aload_1         
	// 8216 15326:aload_1         
	// 8217 15327:getfield        #80  <Field int azh.E>
	// 8218 15330:aload_0         
	// 8219 15331:getfield        #12  <Field azh a>
	// 8220 15334:getfield        #116 <Field int azh.aM>
	// 8221 15337:iand            
	// 8222 15338:putfield        #116 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8223 15341:aload_0         
	// 8224 15342:getfield        #12  <Field azh a>
	// 8225 15345:astore_1        
		abyte0.W = ((azh) (abyte0)).w & a.W;
	// 8226 15346:aload_1         
	// 8227 15347:aload_1         
	// 8228 15348:getfield        #534 <Field int azh.w>
	// 8229 15351:aload_0         
	// 8230 15352:getfield        #12  <Field azh a>
	// 8231 15355:getfield        #220 <Field int azh.W>
	// 8232 15358:iand            
	// 8233 15359:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8234 15362:aload_0         
	// 8235 15363:getfield        #12  <Field azh a>
	// 8236 15366:astore_1        
		abyte0.W = ((azh) (abyte0)).bw ^ a.W;
	// 8237 15367:aload_1         
	// 8238 15368:aload_1         
	// 8239 15369:getfield        #113 <Field int azh.bw>
	// 8240 15372:aload_0         
	// 8241 15373:getfield        #12  <Field azh a>
	// 8242 15376:getfield        #220 <Field int azh.W>
	// 8243 15379:ixor            
	// 8244 15380:putfield        #220 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8245 15383:aload_0         
	// 8246 15384:getfield        #12  <Field azh a>
	// 8247 15387:astore_1        
		abyte0.aM = ((azh) (abyte0)).W ^ a.aM;
	// 8248 15388:aload_1         
	// 8249 15389:aload_1         
	// 8250 15390:getfield        #220 <Field int azh.W>
	// 8251 15393:aload_0         
	// 8252 15394:getfield        #12  <Field azh a>
	// 8253 15397:getfield        #116 <Field int azh.aM>
	// 8254 15400:ixor            
	// 8255 15401:putfield        #116 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8256 15404:aload_0         
	// 8257 15405:getfield        #12  <Field azh a>
	// 8258 15408:astore_1        
		abyte0.ad = ((azh) (abyte0)).aM ^ a.ad;
	// 8259 15409:aload_1         
	// 8260 15410:aload_1         
	// 8261 15411:getfield        #116 <Field int azh.aM>
	// 8262 15414:aload_0         
	// 8263 15415:getfield        #12  <Field azh a>
	// 8264 15418:getfield        #537 <Field int azh.ad>
	// 8265 15421:ixor            
	// 8266 15422:putfield        #537 <Field int azh.ad>
		abyte0 = ((byte []) (a));
	// 8267 15425:aload_0         
	// 8268 15426:getfield        #12  <Field azh a>
	// 8269 15429:astore_1        
		abyte0.ad = ~((azh) (abyte0)).ad;
	// 8270 15430:aload_1         
	// 8271 15431:aload_1         
	// 8272 15432:getfield        #537 <Field int azh.ad>
	// 8273 15435:iconst_m1       
	// 8274 15436:ixor            
	// 8275 15437:putfield        #537 <Field int azh.ad>
		abyte0 = ((byte []) (a));
	// 8276 15440:aload_0         
	// 8277 15441:getfield        #12  <Field azh a>
	// 8278 15444:astore_1        
		abyte0.bv = ((azh) (abyte0)).w & a.bv;
	// 8279 15445:aload_1         
	// 8280 15446:aload_1         
	// 8281 15447:getfield        #534 <Field int azh.w>
	// 8282 15450:aload_0         
	// 8283 15451:getfield        #12  <Field azh a>
	// 8284 15454:getfield        #191 <Field int azh.bv>
	// 8285 15457:iand            
	// 8286 15458:putfield        #191 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 8287 15461:aload_0         
	// 8288 15462:getfield        #12  <Field azh a>
	// 8289 15465:astore_1        
		abyte0.bv = ((azh) (abyte0)).bp ^ a.bv;
	// 8290 15466:aload_1         
	// 8291 15467:aload_1         
	// 8292 15468:getfield        #89  <Field int azh.bp>
	// 8293 15471:aload_0         
	// 8294 15472:getfield        #12  <Field azh a>
	// 8295 15475:getfield        #191 <Field int azh.bv>
	// 8296 15478:ixor            
	// 8297 15479:putfield        #191 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 8298 15482:aload_0         
	// 8299 15483:getfield        #12  <Field azh a>
	// 8300 15486:astore_1        
		abyte0.aH = ((azh) (abyte0)).w & a.aH;
	// 8301 15487:aload_1         
	// 8302 15488:aload_1         
	// 8303 15489:getfield        #534 <Field int azh.w>
	// 8304 15492:aload_0         
	// 8305 15493:getfield        #12  <Field azh a>
	// 8306 15496:getfield        #74  <Field int azh.aH>
	// 8307 15499:iand            
	// 8308 15500:putfield        #74  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8309 15503:aload_0         
	// 8310 15504:getfield        #12  <Field azh a>
	// 8311 15507:astore_1        
		abyte0.aH = ((azh) (abyte0)).R ^ a.aH;
	// 8312 15508:aload_1         
	// 8313 15509:aload_1         
	// 8314 15510:getfield        #223 <Field int azh.R>
	// 8315 15513:aload_0         
	// 8316 15514:getfield        #12  <Field azh a>
	// 8317 15517:getfield        #74  <Field int azh.aH>
	// 8318 15520:ixor            
	// 8319 15521:putfield        #74  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8320 15524:aload_0         
	// 8321 15525:getfield        #12  <Field azh a>
	// 8322 15528:astore_1        
		abyte0.aH = ((azh) (abyte0)).E & ~a.aH;
	// 8323 15529:aload_1         
	// 8324 15530:aload_1         
	// 8325 15531:getfield        #80  <Field int azh.E>
	// 8326 15534:aload_0         
	// 8327 15535:getfield        #12  <Field azh a>
	// 8328 15538:getfield        #74  <Field int azh.aH>
	// 8329 15541:iconst_m1       
	// 8330 15542:ixor            
	// 8331 15543:iand            
	// 8332 15544:putfield        #74  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8333 15547:aload_0         
	// 8334 15548:getfield        #12  <Field azh a>
	// 8335 15551:astore_1        
		abyte0.aH = ((azh) (abyte0)).cF ^ a.aH;
	// 8336 15552:aload_1         
	// 8337 15553:aload_1         
	// 8338 15554:getfield        #83  <Field int azh.cF>
	// 8339 15557:aload_0         
	// 8340 15558:getfield        #12  <Field azh a>
	// 8341 15561:getfield        #74  <Field int azh.aH>
	// 8342 15564:ixor            
	// 8343 15565:putfield        #74  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8344 15568:aload_0         
	// 8345 15569:getfield        #12  <Field azh a>
	// 8346 15572:astore_1        
		abyte0.D = ((azh) (abyte0)).aH ^ a.D;
	// 8347 15573:aload_1         
	// 8348 15574:aload_1         
	// 8349 15575:getfield        #74  <Field int azh.aH>
	// 8350 15578:aload_0         
	// 8351 15579:getfield        #12  <Field azh a>
	// 8352 15582:getfield        #540 <Field int azh.D>
	// 8353 15585:ixor            
	// 8354 15586:putfield        #540 <Field int azh.D>
		abyte0 = ((byte []) (a));
	// 8355 15589:aload_0         
	// 8356 15590:getfield        #12  <Field azh a>
	// 8357 15593:astore_1        
		abyte0.ch = ((azh) (abyte0)).w & ~a.ch;
	// 8358 15594:aload_1         
	// 8359 15595:aload_1         
	// 8360 15596:getfield        #534 <Field int azh.w>
	// 8361 15599:aload_0         
	// 8362 15600:getfield        #12  <Field azh a>
	// 8363 15603:getfield        #211 <Field int azh.ch>
	// 8364 15606:iconst_m1       
	// 8365 15607:ixor            
	// 8366 15608:iand            
	// 8367 15609:putfield        #211 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8368 15612:aload_0         
	// 8369 15613:getfield        #12  <Field azh a>
	// 8370 15616:astore_1        
		abyte0.ch = ((azh) (abyte0)).cy ^ a.ch;
	// 8371 15617:aload_1         
	// 8372 15618:aload_1         
	// 8373 15619:getfield        #217 <Field int azh.cy>
	// 8374 15622:aload_0         
	// 8375 15623:getfield        #12  <Field azh a>
	// 8376 15626:getfield        #211 <Field int azh.ch>
	// 8377 15629:ixor            
	// 8378 15630:putfield        #211 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8379 15633:aload_0         
	// 8380 15634:getfield        #12  <Field azh a>
	// 8381 15637:astore_1        
		abyte0.aw = ((azh) (abyte0)).w & ~a.aw;
	// 8382 15638:aload_1         
	// 8383 15639:aload_1         
	// 8384 15640:getfield        #534 <Field int azh.w>
	// 8385 15643:aload_0         
	// 8386 15644:getfield        #12  <Field azh a>
	// 8387 15647:getfield        #71  <Field int azh.aw>
	// 8388 15650:iconst_m1       
	// 8389 15651:ixor            
	// 8390 15652:iand            
	// 8391 15653:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8392 15656:aload_0         
	// 8393 15657:getfield        #12  <Field azh a>
	// 8394 15660:astore_1        
		abyte0.aw = ((azh) (abyte0)).ai ^ a.aw;
	// 8395 15661:aload_1         
	// 8396 15662:aload_1         
	// 8397 15663:getfield        #128 <Field int azh.ai>
	// 8398 15666:aload_0         
	// 8399 15667:getfield        #12  <Field azh a>
	// 8400 15670:getfield        #71  <Field int azh.aw>
	// 8401 15673:ixor            
	// 8402 15674:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8403 15677:aload_0         
	// 8404 15678:getfield        #12  <Field azh a>
	// 8405 15681:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & a.E;
	// 8406 15682:aload_1         
	// 8407 15683:aload_1         
	// 8408 15684:getfield        #71  <Field int azh.aw>
	// 8409 15687:aload_0         
	// 8410 15688:getfield        #12  <Field azh a>
	// 8411 15691:getfield        #80  <Field int azh.E>
	// 8412 15694:iand            
	// 8413 15695:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8414 15698:aload_0         
	// 8415 15699:getfield        #12  <Field azh a>
	// 8416 15702:astore_1        
		abyte0.aw = ((azh) (abyte0)).ch ^ a.aw;
	// 8417 15703:aload_1         
	// 8418 15704:aload_1         
	// 8419 15705:getfield        #211 <Field int azh.ch>
	// 8420 15708:aload_0         
	// 8421 15709:getfield        #12  <Field azh a>
	// 8422 15712:getfield        #71  <Field int azh.aw>
	// 8423 15715:ixor            
	// 8424 15716:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8425 15719:aload_0         
	// 8426 15720:getfield        #12  <Field azh a>
	// 8427 15723:astore_1        
		abyte0.bi = ((azh) (abyte0)).aw ^ a.bi;
	// 8428 15724:aload_1         
	// 8429 15725:aload_1         
	// 8430 15726:getfield        #71  <Field int azh.aw>
	// 8431 15729:aload_0         
	// 8432 15730:getfield        #12  <Field azh a>
	// 8433 15733:getfield        #294 <Field int azh.bi>
	// 8434 15736:ixor            
	// 8435 15737:putfield        #294 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8436 15740:aload_0         
	// 8437 15741:getfield        #12  <Field azh a>
	// 8438 15744:astore_1        
		abyte0.bI = ((azh) (abyte0)).w & a.bI;
	// 8439 15745:aload_1         
	// 8440 15746:aload_1         
	// 8441 15747:getfield        #534 <Field int azh.w>
	// 8442 15750:aload_0         
	// 8443 15751:getfield        #12  <Field azh a>
	// 8444 15754:getfield        #205 <Field int azh.bI>
	// 8445 15757:iand            
	// 8446 15758:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8447 15761:aload_0         
	// 8448 15762:getfield        #12  <Field azh a>
	// 8449 15765:astore_1        
		abyte0.bI = ((azh) (abyte0)).bB ^ a.bI;
	// 8450 15766:aload_1         
	// 8451 15767:aload_1         
	// 8452 15768:getfield        #56  <Field int azh.bB>
	// 8453 15771:aload_0         
	// 8454 15772:getfield        #12  <Field azh a>
	// 8455 15775:getfield        #205 <Field int azh.bI>
	// 8456 15778:ixor            
	// 8457 15779:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8458 15782:aload_0         
	// 8459 15783:getfield        #12  <Field azh a>
	// 8460 15786:astore_1        
		abyte0.bI = ((azh) (abyte0)).E & ~a.bI;
	// 8461 15787:aload_1         
	// 8462 15788:aload_1         
	// 8463 15789:getfield        #80  <Field int azh.E>
	// 8464 15792:aload_0         
	// 8465 15793:getfield        #12  <Field azh a>
	// 8466 15796:getfield        #205 <Field int azh.bI>
	// 8467 15799:iconst_m1       
	// 8468 15800:ixor            
	// 8469 15801:iand            
	// 8470 15802:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8471 15805:aload_0         
	// 8472 15806:getfield        #12  <Field azh a>
	// 8473 15809:astore_1        
		abyte0.bI = ((azh) (abyte0)).bv ^ a.bI;
	// 8474 15810:aload_1         
	// 8475 15811:aload_1         
	// 8476 15812:getfield        #191 <Field int azh.bv>
	// 8477 15815:aload_0         
	// 8478 15816:getfield        #12  <Field azh a>
	// 8479 15819:getfield        #205 <Field int azh.bI>
	// 8480 15822:ixor            
	// 8481 15823:putfield        #205 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8482 15826:aload_0         
	// 8483 15827:getfield        #12  <Field azh a>
	// 8484 15830:astore_1        
		abyte0.Z = ((azh) (abyte0)).bI ^ a.Z;
	// 8485 15831:aload_1         
	// 8486 15832:aload_1         
	// 8487 15833:getfield        #205 <Field int azh.bI>
	// 8488 15836:aload_0         
	// 8489 15837:getfield        #12  <Field azh a>
	// 8490 15840:getfield        #543 <Field int azh.Z>
	// 8491 15843:ixor            
	// 8492 15844:putfield        #543 <Field int azh.Z>
		abyte0 = ((byte []) (a));
	// 8493 15847:aload_0         
	// 8494 15848:getfield        #12  <Field azh a>
	// 8495 15851:astore_1        
		abyte0.Z = ~((azh) (abyte0)).Z;
	// 8496 15852:aload_1         
	// 8497 15853:aload_1         
	// 8498 15854:getfield        #543 <Field int azh.Z>
	// 8499 15857:iconst_m1       
	// 8500 15858:ixor            
	// 8501 15859:putfield        #543 <Field int azh.Z>
		abyte0 = ((byte []) (a));
	// 8502 15862:aload_0         
	// 8503 15863:getfield        #12  <Field azh a>
	// 8504 15866:astore_1        
		abyte0.aY = ((azh) (abyte0)).aj & a.aY;
	// 8505 15867:aload_1         
	// 8506 15868:aload_1         
	// 8507 15869:getfield        #372 <Field int azh.aj>
	// 8508 15872:aload_0         
	// 8509 15873:getfield        #12  <Field azh a>
	// 8510 15876:getfield        #546 <Field int azh.aY>
	// 8511 15879:iand            
	// 8512 15880:putfield        #546 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 8513 15883:aload_0         
	// 8514 15884:getfield        #12  <Field azh a>
	// 8515 15887:astore_1        
		abyte0.aY = ((azh) (abyte0)).B ^ a.aY;
	// 8516 15888:aload_1         
	// 8517 15889:aload_1         
	// 8518 15890:getfield        #549 <Field int azh.B>
	// 8519 15893:aload_0         
	// 8520 15894:getfield        #12  <Field azh a>
	// 8521 15897:getfield        #546 <Field int azh.aY>
	// 8522 15900:ixor            
	// 8523 15901:putfield        #546 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 8524 15904:aload_0         
	// 8525 15905:getfield        #12  <Field azh a>
	// 8526 15908:astore_1        
		abyte0.e = ((azh) (abyte0)).aY ^ a.e;
	// 8527 15909:aload_1         
	// 8528 15910:aload_1         
	// 8529 15911:getfield        #546 <Field int azh.aY>
	// 8530 15914:aload_0         
	// 8531 15915:getfield        #12  <Field azh a>
	// 8532 15918:getfield        #552 <Field int azh.e>
	// 8533 15921:ixor            
	// 8534 15922:putfield        #552 <Field int azh.e>
		abyte0 = ((byte []) (a));
	// 8535 15925:aload_0         
	// 8536 15926:getfield        #12  <Field azh a>
	// 8537 15929:astore_1        
		abyte0.ca = ((azh) (abyte0)).e & ~a.ca;
	// 8538 15930:aload_1         
	// 8539 15931:aload_1         
	// 8540 15932:getfield        #552 <Field int azh.e>
	// 8541 15935:aload_0         
	// 8542 15936:getfield        #12  <Field azh a>
	// 8543 15939:getfield        #351 <Field int azh.ca>
	// 8544 15942:iconst_m1       
	// 8545 15943:ixor            
	// 8546 15944:iand            
	// 8547 15945:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 8548 15948:aload_0         
	// 8549 15949:getfield        #12  <Field azh a>
	// 8550 15952:astore_1        
		abyte0.ca = ((azh) (abyte0)).au ^ a.ca;
	// 8551 15953:aload_1         
	// 8552 15954:aload_1         
	// 8553 15955:getfield        #354 <Field int azh.au>
	// 8554 15958:aload_0         
	// 8555 15959:getfield        #12  <Field azh a>
	// 8556 15962:getfield        #351 <Field int azh.ca>
	// 8557 15965:ixor            
	// 8558 15966:putfield        #351 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 8559 15969:aload_0         
	// 8560 15970:getfield        #12  <Field azh a>
	// 8561 15973:astore_1        
		abyte0.r = ((azh) (abyte0)).e & a.r;
	// 8562 15974:aload_1         
	// 8563 15975:aload_1         
	// 8564 15976:getfield        #552 <Field int azh.e>
	// 8565 15979:aload_0         
	// 8566 15980:getfield        #12  <Field azh a>
	// 8567 15983:getfield        #161 <Field int azh.r>
	// 8568 15986:iand            
	// 8569 15987:putfield        #161 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8570 15990:aload_0         
	// 8571 15991:getfield        #12  <Field azh a>
	// 8572 15994:astore_1        
		abyte0.r = ((azh) (abyte0)).Q ^ a.r;
	// 8573 15995:aload_1         
	// 8574 15996:aload_1         
	// 8575 15997:getfield        #176 <Field int azh.Q>
	// 8576 16000:aload_0         
	// 8577 16001:getfield        #12  <Field azh a>
	// 8578 16004:getfield        #161 <Field int azh.r>
	// 8579 16007:ixor            
	// 8580 16008:putfield        #161 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8581 16011:aload_0         
	// 8582 16012:getfield        #12  <Field azh a>
	// 8583 16015:astore_1        
		abyte0.r = ((azh) (abyte0)).Y | a.r;
	// 8584 16016:aload_1         
	// 8585 16017:aload_1         
	// 8586 16018:getfield        #525 <Field int azh.Y>
	// 8587 16021:aload_0         
	// 8588 16022:getfield        #12  <Field azh a>
	// 8589 16025:getfield        #161 <Field int azh.r>
	// 8590 16028:ior             
	// 8591 16029:putfield        #161 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8592 16032:aload_0         
	// 8593 16033:getfield        #12  <Field azh a>
	// 8594 16036:astore_1        
		abyte0.bk = ((azh) (abyte0)).e & ~a.bk;
	// 8595 16037:aload_1         
	// 8596 16038:aload_1         
	// 8597 16039:getfield        #552 <Field int azh.e>
	// 8598 16042:aload_0         
	// 8599 16043:getfield        #12  <Field azh a>
	// 8600 16046:getfield        #255 <Field int azh.bk>
	// 8601 16049:iconst_m1       
	// 8602 16050:ixor            
	// 8603 16051:iand            
	// 8604 16052:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 8605 16055:aload_0         
	// 8606 16056:getfield        #12  <Field azh a>
	// 8607 16059:astore_1        
		abyte0.bk = ((azh) (abyte0)).bQ ^ a.bk;
	// 8608 16060:aload_1         
	// 8609 16061:aload_1         
	// 8610 16062:getfield        #170 <Field int azh.bQ>
	// 8611 16065:aload_0         
	// 8612 16066:getfield        #12  <Field azh a>
	// 8613 16069:getfield        #255 <Field int azh.bk>
	// 8614 16072:ixor            
	// 8615 16073:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 8616 16076:aload_0         
	// 8617 16077:getfield        #12  <Field azh a>
	// 8618 16080:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & ~a.Y;
	// 8619 16081:aload_1         
	// 8620 16082:aload_1         
	// 8621 16083:getfield        #255 <Field int azh.bk>
	// 8622 16086:aload_0         
	// 8623 16087:getfield        #12  <Field azh a>
	// 8624 16090:getfield        #525 <Field int azh.Y>
	// 8625 16093:iconst_m1       
	// 8626 16094:ixor            
	// 8627 16095:iand            
	// 8628 16096:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 8629 16099:aload_0         
	// 8630 16100:getfield        #12  <Field azh a>
	// 8631 16103:astore_1        
		abyte0.bO = ((azh) (abyte0)).e & ~a.bO;
	// 8632 16104:aload_1         
	// 8633 16105:aload_1         
	// 8634 16106:getfield        #552 <Field int azh.e>
	// 8635 16109:aload_0         
	// 8636 16110:getfield        #12  <Field azh a>
	// 8637 16113:getfield        #267 <Field int azh.bO>
	// 8638 16116:iconst_m1       
	// 8639 16117:ixor            
	// 8640 16118:iand            
	// 8641 16119:putfield        #267 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 8642 16122:aload_0         
	// 8643 16123:getfield        #12  <Field azh a>
	// 8644 16126:astore_1        
		abyte0.bO = ((azh) (abyte0)).cv ^ a.bO;
	// 8645 16127:aload_1         
	// 8646 16128:aload_1         
	// 8647 16129:getfield        #44  <Field int azh.cv>
	// 8648 16132:aload_0         
	// 8649 16133:getfield        #12  <Field azh a>
	// 8650 16136:getfield        #267 <Field int azh.bO>
	// 8651 16139:ixor            
	// 8652 16140:putfield        #267 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 8653 16143:aload_0         
	// 8654 16144:getfield        #12  <Field azh a>
	// 8655 16147:astore_1        
		abyte0.r = ((azh) (abyte0)).bO ^ a.r;
	// 8656 16148:aload_1         
	// 8657 16149:aload_1         
	// 8658 16150:getfield        #267 <Field int azh.bO>
	// 8659 16153:aload_0         
	// 8660 16154:getfield        #12  <Field azh a>
	// 8661 16157:getfield        #161 <Field int azh.r>
	// 8662 16160:ixor            
	// 8663 16161:putfield        #161 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8664 16164:aload_0         
	// 8665 16165:getfield        #12  <Field azh a>
	// 8666 16168:astore_1        
		abyte0.h = ((azh) (abyte0)).r ^ a.h;
	// 8667 16169:aload_1         
	// 8668 16170:aload_1         
	// 8669 16171:getfield        #161 <Field int azh.r>
	// 8670 16174:aload_0         
	// 8671 16175:getfield        #12  <Field azh a>
	// 8672 16178:getfield        #522 <Field int azh.h>
	// 8673 16181:ixor            
	// 8674 16182:putfield        #522 <Field int azh.h>
		abyte0 = ((byte []) (a));
	// 8675 16185:aload_0         
	// 8676 16186:getfield        #12  <Field azh a>
	// 8677 16189:astore_1        
		abyte0.h = ~((azh) (abyte0)).h;
	// 8678 16190:aload_1         
	// 8679 16191:aload_1         
	// 8680 16192:getfield        #522 <Field int azh.h>
	// 8681 16195:iconst_m1       
	// 8682 16196:ixor            
	// 8683 16197:putfield        #522 <Field int azh.h>
		abyte0 = ((byte []) (a));
	// 8684 16200:aload_0         
	// 8685 16201:getfield        #12  <Field azh a>
	// 8686 16204:astore_1        
		abyte0.aV = ((azh) (abyte0)).e & ~a.aV;
	// 8687 16205:aload_1         
	// 8688 16206:aload_1         
	// 8689 16207:getfield        #552 <Field int azh.e>
	// 8690 16210:aload_0         
	// 8691 16211:getfield        #12  <Field azh a>
	// 8692 16214:getfield        #92  <Field int azh.aV>
	// 8693 16217:iconst_m1       
	// 8694 16218:ixor            
	// 8695 16219:iand            
	// 8696 16220:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8697 16223:aload_0         
	// 8698 16224:getfield        #12  <Field azh a>
	// 8699 16227:astore_1        
		abyte0.aV = ((azh) (abyte0)).H ^ a.aV;
	// 8700 16228:aload_1         
	// 8701 16229:aload_1         
	// 8702 16230:getfield        #62  <Field int azh.H>
	// 8703 16233:aload_0         
	// 8704 16234:getfield        #12  <Field azh a>
	// 8705 16237:getfield        #92  <Field int azh.aV>
	// 8706 16240:ixor            
	// 8707 16241:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8708 16244:aload_0         
	// 8709 16245:getfield        #12  <Field azh a>
	// 8710 16248:astore_1        
		abyte0.bL = ((azh) (abyte0)).e & a.bL;
	// 8711 16249:aload_1         
	// 8712 16250:aload_1         
	// 8713 16251:getfield        #552 <Field int azh.e>
	// 8714 16254:aload_0         
	// 8715 16255:getfield        #12  <Field azh a>
	// 8716 16258:getfield        #235 <Field int azh.bL>
	// 8717 16261:iand            
	// 8718 16262:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8719 16265:aload_0         
	// 8720 16266:getfield        #12  <Field azh a>
	// 8721 16269:astore_1        
		abyte0.bL = ((azh) (abyte0)).cj ^ a.bL;
	// 8722 16270:aload_1         
	// 8723 16271:aload_1         
	// 8724 16272:getfield        #173 <Field int azh.cj>
	// 8725 16275:aload_0         
	// 8726 16276:getfield        #12  <Field azh a>
	// 8727 16279:getfield        #235 <Field int azh.bL>
	// 8728 16282:ixor            
	// 8729 16283:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8730 16286:aload_0         
	// 8731 16287:getfield        #12  <Field azh a>
	// 8732 16290:astore_1        
		abyte0.bL = ((azh) (abyte0)).Y | a.bL;
	// 8733 16291:aload_1         
	// 8734 16292:aload_1         
	// 8735 16293:getfield        #525 <Field int azh.Y>
	// 8736 16296:aload_0         
	// 8737 16297:getfield        #12  <Field azh a>
	// 8738 16300:getfield        #235 <Field int azh.bL>
	// 8739 16303:ior             
	// 8740 16304:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8741 16307:aload_0         
	// 8742 16308:getfield        #12  <Field azh a>
	// 8743 16311:astore_1        
		abyte0.bL = ((azh) (abyte0)).ca ^ a.bL;
	// 8744 16312:aload_1         
	// 8745 16313:aload_1         
	// 8746 16314:getfield        #351 <Field int azh.ca>
	// 8747 16317:aload_0         
	// 8748 16318:getfield        #12  <Field azh a>
	// 8749 16321:getfield        #235 <Field int azh.bL>
	// 8750 16324:ixor            
	// 8751 16325:putfield        #235 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8752 16328:aload_0         
	// 8753 16329:getfield        #12  <Field azh a>
	// 8754 16332:astore_1        
		abyte0.cf = ((azh) (abyte0)).bL ^ a.cf;
	// 8755 16333:aload_1         
	// 8756 16334:aload_1         
	// 8757 16335:getfield        #235 <Field int azh.bL>
	// 8758 16338:aload_0         
	// 8759 16339:getfield        #12  <Field azh a>
	// 8760 16342:getfield        #125 <Field int azh.cf>
	// 8761 16345:ixor            
	// 8762 16346:putfield        #125 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 8763 16349:aload_0         
	// 8764 16350:getfield        #12  <Field azh a>
	// 8765 16353:astore_1        
		abyte0.cf = ~((azh) (abyte0)).cf;
	// 8766 16354:aload_1         
	// 8767 16355:aload_1         
	// 8768 16356:getfield        #125 <Field int azh.cf>
	// 8769 16359:iconst_m1       
	// 8770 16360:ixor            
	// 8771 16361:putfield        #125 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 8772 16364:aload_0         
	// 8773 16365:getfield        #12  <Field azh a>
	// 8774 16368:astore_1        
		abyte0.cz = ((azh) (abyte0)).e & ~a.cz;
	// 8775 16369:aload_1         
	// 8776 16370:aload_1         
	// 8777 16371:getfield        #552 <Field int azh.e>
	// 8778 16374:aload_0         
	// 8779 16375:getfield        #12  <Field azh a>
	// 8780 16378:getfield        #229 <Field int azh.cz>
	// 8781 16381:iconst_m1       
	// 8782 16382:ixor            
	// 8783 16383:iand            
	// 8784 16384:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 8785 16387:aload_0         
	// 8786 16388:getfield        #12  <Field azh a>
	// 8787 16391:astore_1        
		abyte0.cz = ((azh) (abyte0)).a ^ a.cz;
	// 8788 16392:aload_1         
	// 8789 16393:aload_1         
	// 8790 16394:getfield        #196 <Field int azh.a>
	// 8791 16397:aload_0         
	// 8792 16398:getfield        #12  <Field azh a>
	// 8793 16401:getfield        #229 <Field int azh.cz>
	// 8794 16404:ixor            
	// 8795 16405:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 8796 16408:aload_0         
	// 8797 16409:getfield        #12  <Field azh a>
	// 8798 16412:astore_1        
		abyte0.bk = ((azh) (abyte0)).cz ^ a.bk;
	// 8799 16413:aload_1         
	// 8800 16414:aload_1         
	// 8801 16415:getfield        #229 <Field int azh.cz>
	// 8802 16418:aload_0         
	// 8803 16419:getfield        #12  <Field azh a>
	// 8804 16422:getfield        #255 <Field int azh.bk>
	// 8805 16425:ixor            
	// 8806 16426:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 8807 16429:aload_0         
	// 8808 16430:getfield        #12  <Field azh a>
	// 8809 16433:astore_1        
		abyte0.V = ((azh) (abyte0)).bk ^ a.V;
	// 8810 16434:aload_1         
	// 8811 16435:aload_1         
	// 8812 16436:getfield        #255 <Field int azh.bk>
	// 8813 16439:aload_0         
	// 8814 16440:getfield        #12  <Field azh a>
	// 8815 16443:getfield        #555 <Field int azh.V>
	// 8816 16446:ixor            
	// 8817 16447:putfield        #555 <Field int azh.V>
		abyte0 = ((byte []) (a));
	// 8818 16450:aload_0         
	// 8819 16451:getfield        #12  <Field azh a>
	// 8820 16454:astore_1        
		abyte0.cB = ((azh) (abyte0)).e & a.cB;
	// 8821 16455:aload_1         
	// 8822 16456:aload_1         
	// 8823 16457:getfield        #552 <Field int azh.e>
	// 8824 16460:aload_0         
	// 8825 16461:getfield        #12  <Field azh a>
	// 8826 16464:getfield        #182 <Field int azh.cB>
	// 8827 16467:iand            
	// 8828 16468:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8829 16471:aload_0         
	// 8830 16472:getfield        #12  <Field azh a>
	// 8831 16475:astore_1        
		abyte0.cB = ((azh) (abyte0)).ck ^ a.cB;
	// 8832 16476:aload_1         
	// 8833 16477:aload_1         
	// 8834 16478:getfield        #261 <Field int azh.ck>
	// 8835 16481:aload_0         
	// 8836 16482:getfield        #12  <Field azh a>
	// 8837 16485:getfield        #182 <Field int azh.cB>
	// 8838 16488:ixor            
	// 8839 16489:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8840 16492:aload_0         
	// 8841 16493:getfield        #12  <Field azh a>
	// 8842 16496:astore_1        
		abyte0.cB = ((azh) (abyte0)).Y | a.cB;
	// 8843 16497:aload_1         
	// 8844 16498:aload_1         
	// 8845 16499:getfield        #525 <Field int azh.Y>
	// 8846 16502:aload_0         
	// 8847 16503:getfield        #12  <Field azh a>
	// 8848 16506:getfield        #182 <Field int azh.cB>
	// 8849 16509:ior             
	// 8850 16510:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8851 16513:aload_0         
	// 8852 16514:getfield        #12  <Field azh a>
	// 8853 16517:astore_1        
		abyte0.cB = ((azh) (abyte0)).aV ^ a.cB;
	// 8854 16518:aload_1         
	// 8855 16519:aload_1         
	// 8856 16520:getfield        #92  <Field int azh.aV>
	// 8857 16523:aload_0         
	// 8858 16524:getfield        #12  <Field azh a>
	// 8859 16527:getfield        #182 <Field int azh.cB>
	// 8860 16530:ixor            
	// 8861 16531:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8862 16534:aload_0         
	// 8863 16535:getfield        #12  <Field azh a>
	// 8864 16538:astore_1        
		abyte0.v = ((azh) (abyte0)).cB ^ a.v;
	// 8865 16539:aload_1         
	// 8866 16540:aload_1         
	// 8867 16541:getfield        #182 <Field int azh.cB>
	// 8868 16544:aload_0         
	// 8869 16545:getfield        #12  <Field azh a>
	// 8870 16548:getfield        #558 <Field int azh.v>
	// 8871 16551:ixor            
	// 8872 16552:putfield        #558 <Field int azh.v>
		abyte0 = ((byte []) (a));
	// 8873 16555:aload_0         
	// 8874 16556:getfield        #12  <Field azh a>
	// 8875 16559:astore_1        
		abyte0.cB = ((azh) (abyte0)).aj & ~a.aW;
	// 8876 16560:aload_1         
	// 8877 16561:aload_1         
	// 8878 16562:getfield        #372 <Field int azh.aj>
	// 8879 16565:aload_0         
	// 8880 16566:getfield        #12  <Field azh a>
	// 8881 16569:getfield        #375 <Field int azh.aW>
	// 8882 16572:iconst_m1       
	// 8883 16573:ixor            
	// 8884 16574:iand            
	// 8885 16575:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8886 16578:aload_0         
	// 8887 16579:getfield        #12  <Field azh a>
	// 8888 16582:astore_1        
		abyte0.cB = ((azh) (abyte0)).aW ^ a.cB;
	// 8889 16583:aload_1         
	// 8890 16584:aload_1         
	// 8891 16585:getfield        #375 <Field int azh.aW>
	// 8892 16588:aload_0         
	// 8893 16589:getfield        #12  <Field azh a>
	// 8894 16592:getfield        #182 <Field int azh.cB>
	// 8895 16595:ixor            
	// 8896 16596:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8897 16599:aload_0         
	// 8898 16600:getfield        #12  <Field azh a>
	// 8899 16603:astore_1        
		abyte0.cu = ((azh) (abyte0)).cB ^ a.cu;
	// 8900 16604:aload_1         
	// 8901 16605:aload_1         
	// 8902 16606:getfield        #182 <Field int azh.cB>
	// 8903 16609:aload_0         
	// 8904 16610:getfield        #12  <Field azh a>
	// 8905 16613:getfield        #561 <Field int azh.cu>
	// 8906 16616:ixor            
	// 8907 16617:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 8908 16620:aload_0         
	// 8909 16621:getfield        #12  <Field azh a>
	// 8910 16624:astore_1        
		abyte0.cu = ((azh) (abyte0)).cu & ~a.F;
	// 8911 16625:aload_1         
	// 8912 16626:aload_1         
	// 8913 16627:getfield        #561 <Field int azh.cu>
	// 8914 16630:aload_0         
	// 8915 16631:getfield        #12  <Field azh a>
	// 8916 16634:getfield        #393 <Field int azh.F>
	// 8917 16637:iconst_m1       
	// 8918 16638:ixor            
	// 8919 16639:iand            
	// 8920 16640:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 8921 16643:aload_0         
	// 8922 16644:getfield        #12  <Field azh a>
	// 8923 16647:astore_1        
		abyte0.cu = ((azh) (abyte0)).av ^ a.cu;
	// 8924 16648:aload_1         
	// 8925 16649:aload_1         
	// 8926 16650:getfield        #98  <Field int azh.av>
	// 8927 16653:aload_0         
	// 8928 16654:getfield        #12  <Field azh a>
	// 8929 16657:getfield        #561 <Field int azh.cu>
	// 8930 16660:ixor            
	// 8931 16661:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 8932 16664:aload_0         
	// 8933 16665:getfield        #12  <Field azh a>
	// 8934 16668:astore_1        
		abyte0.cu = ((azh) (abyte0)).x & ~a.cu;
	// 8935 16669:aload_1         
	// 8936 16670:aload_1         
	// 8937 16671:getfield        #411 <Field int azh.x>
	// 8938 16674:aload_0         
	// 8939 16675:getfield        #12  <Field azh a>
	// 8940 16678:getfield        #561 <Field int azh.cu>
	// 8941 16681:iconst_m1       
	// 8942 16682:ixor            
	// 8943 16683:iand            
	// 8944 16684:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 8945 16687:aload_0         
	// 8946 16688:getfield        #12  <Field azh a>
	// 8947 16691:astore_1        
		abyte0.b = ((azh) (abyte0)).cB ^ a.b;
	// 8948 16692:aload_1         
	// 8949 16693:aload_1         
	// 8950 16694:getfield        #182 <Field int azh.cB>
	// 8951 16697:aload_0         
	// 8952 16698:getfield        #12  <Field azh a>
	// 8953 16701:getfield        #384 <Field int azh.b>
	// 8954 16704:ixor            
	// 8955 16705:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 8956 16708:aload_0         
	// 8957 16709:getfield        #12  <Field azh a>
	// 8958 16712:astore_1        
		abyte0.b = ((azh) (abyte0)).F | a.b;
	// 8959 16713:aload_1         
	// 8960 16714:aload_1         
	// 8961 16715:getfield        #393 <Field int azh.F>
	// 8962 16718:aload_0         
	// 8963 16719:getfield        #12  <Field azh a>
	// 8964 16722:getfield        #384 <Field int azh.b>
	// 8965 16725:ior             
	// 8966 16726:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 8967 16729:aload_0         
	// 8968 16730:getfield        #12  <Field azh a>
	// 8969 16733:astore_1        
		abyte0.b = ((azh) (abyte0)).bj ^ a.b;
	// 8970 16734:aload_1         
	// 8971 16735:aload_1         
	// 8972 16736:getfield        #405 <Field int azh.bj>
	// 8973 16739:aload_0         
	// 8974 16740:getfield        #12  <Field azh a>
	// 8975 16743:getfield        #384 <Field int azh.b>
	// 8976 16746:ixor            
	// 8977 16747:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 8978 16750:aload_0         
	// 8979 16751:getfield        #12  <Field azh a>
	// 8980 16754:astore_1        
		abyte0.cu = ((azh) (abyte0)).b ^ a.cu;
	// 8981 16755:aload_1         
	// 8982 16756:aload_1         
	// 8983 16757:getfield        #384 <Field int azh.b>
	// 8984 16760:aload_0         
	// 8985 16761:getfield        #12  <Field azh a>
	// 8986 16764:getfield        #561 <Field int azh.cu>
	// 8987 16767:ixor            
	// 8988 16768:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 8989 16771:aload_0         
	// 8990 16772:getfield        #12  <Field azh a>
	// 8991 16775:astore_1        
		abyte0.ac = ((azh) (abyte0)).cu ^ a.ac;
	// 8992 16776:aload_1         
	// 8993 16777:aload_1         
	// 8994 16778:getfield        #561 <Field int azh.cu>
	// 8995 16781:aload_0         
	// 8996 16782:getfield        #12  <Field azh a>
	// 8997 16785:getfield        #101 <Field int azh.ac>
	// 8998 16788:ixor            
	// 8999 16789:putfield        #101 <Field int azh.ac>
		abyte0 = ((byte []) (a));
	// 9000 16792:aload_0         
	// 9001 16793:getfield        #12  <Field azh a>
	// 9002 16796:astore_1        
		abyte0.cu = ((azh) (abyte0)).S ^ a.ac;
	// 9003 16797:aload_1         
	// 9004 16798:aload_1         
	// 9005 16799:getfield        #149 <Field int azh.S>
	// 9006 16802:aload_0         
	// 9007 16803:getfield        #12  <Field azh a>
	// 9008 16806:getfield        #101 <Field int azh.ac>
	// 9009 16809:ixor            
	// 9010 16810:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 9011 16813:aload_0         
	// 9012 16814:getfield        #12  <Field azh a>
	// 9013 16817:astore_1        
		abyte0.b = ((azh) (abyte0)).ac | a.s;
	// 9014 16818:aload_1         
	// 9015 16819:aload_1         
	// 9016 16820:getfield        #101 <Field int azh.ac>
	// 9017 16823:aload_0         
	// 9018 16824:getfield        #12  <Field azh a>
	// 9019 16827:getfield        #232 <Field int azh.s>
	// 9020 16830:ior             
	// 9021 16831:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 9022 16834:aload_0         
	// 9023 16835:getfield        #12  <Field azh a>
	// 9024 16838:astore_1        
		abyte0.b = ((azh) (abyte0)).ag ^ a.b;
	// 9025 16839:aload_1         
	// 9026 16840:aload_1         
	// 9027 16841:getfield        #77  <Field int azh.ag>
	// 9028 16844:aload_0         
	// 9029 16845:getfield        #12  <Field azh a>
	// 9030 16848:getfield        #384 <Field int azh.b>
	// 9031 16851:ixor            
	// 9032 16852:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 9033 16855:aload_0         
	// 9034 16856:getfield        #12  <Field azh a>
	// 9035 16859:astore_1        
		abyte0.b = ((azh) (abyte0)).cx | a.b;
	// 9036 16860:aload_1         
	// 9037 16861:aload_1         
	// 9038 16862:getfield        #185 <Field int azh.cx>
	// 9039 16865:aload_0         
	// 9040 16866:getfield        #12  <Field azh a>
	// 9041 16869:getfield        #384 <Field int azh.b>
	// 9042 16872:ior             
	// 9043 16873:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 9044 16876:aload_0         
	// 9045 16877:getfield        #12  <Field azh a>
	// 9046 16880:astore_1        
		abyte0.bj = ((azh) (abyte0)).ac | a.E;
	// 9047 16881:aload_1         
	// 9048 16882:aload_1         
	// 9049 16883:getfield        #101 <Field int azh.ac>
	// 9050 16886:aload_0         
	// 9051 16887:getfield        #12  <Field azh a>
	// 9052 16890:getfield        #80  <Field int azh.E>
	// 9053 16893:ior             
	// 9054 16894:putfield        #405 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9055 16897:aload_0         
	// 9056 16898:getfield        #12  <Field azh a>
	// 9057 16901:astore_1        
		abyte0.bj = ((azh) (abyte0)).ag ^ a.bj;
	// 9058 16902:aload_1         
	// 9059 16903:aload_1         
	// 9060 16904:getfield        #77  <Field int azh.ag>
	// 9061 16907:aload_0         
	// 9062 16908:getfield        #12  <Field azh a>
	// 9063 16911:getfield        #405 <Field int azh.bj>
	// 9064 16914:ixor            
	// 9065 16915:putfield        #405 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9066 16918:aload_0         
	// 9067 16919:getfield        #12  <Field azh a>
	// 9068 16922:astore_1        
		abyte0.M = ((azh) (abyte0)).bj ^ a.M;
	// 9069 16923:aload_1         
	// 9070 16924:aload_1         
	// 9071 16925:getfield        #405 <Field int azh.bj>
	// 9072 16928:aload_0         
	// 9073 16929:getfield        #12  <Field azh a>
	// 9074 16932:getfield        #53  <Field int azh.M>
	// 9075 16935:ixor            
	// 9076 16936:putfield        #53  <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 9077 16939:aload_0         
	// 9078 16940:getfield        #12  <Field azh a>
	// 9079 16943:astore_1        
		abyte0.bj = ((azh) (abyte0)).ay & ~a.ac;
	// 9080 16944:aload_1         
	// 9081 16945:aload_1         
	// 9082 16946:getfield        #59  <Field int azh.ay>
	// 9083 16949:aload_0         
	// 9084 16950:getfield        #12  <Field azh a>
	// 9085 16953:getfield        #101 <Field int azh.ac>
	// 9086 16956:iconst_m1       
	// 9087 16957:ixor            
	// 9088 16958:iand            
	// 9089 16959:putfield        #405 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9090 16962:aload_0         
	// 9091 16963:getfield        #12  <Field azh a>
	// 9092 16966:astore_1        
		abyte0.cr = ((azh) (abyte0)).bj ^ a.cr;
	// 9093 16967:aload_1         
	// 9094 16968:aload_1         
	// 9095 16969:getfield        #405 <Field int azh.bj>
	// 9096 16972:aload_0         
	// 9097 16973:getfield        #12  <Field azh a>
	// 9098 16976:getfield        #68  <Field int azh.cr>
	// 9099 16979:ixor            
	// 9100 16980:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 9101 16983:aload_0         
	// 9102 16984:getfield        #12  <Field azh a>
	// 9103 16987:astore_1        
		abyte0.cr = ((azh) (abyte0)).ci | a.cr;
	// 9104 16988:aload_1         
	// 9105 16989:aload_1         
	// 9106 16990:getfield        #50  <Field int azh.ci>
	// 9107 16993:aload_0         
	// 9108 16994:getfield        #12  <Field azh a>
	// 9109 16997:getfield        #68  <Field int azh.cr>
	// 9110 17000:ior             
	// 9111 17001:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 9112 17004:aload_0         
	// 9113 17005:getfield        #12  <Field azh a>
	// 9114 17008:astore_1        
		abyte0.av = ((azh) (abyte0)).ac | a.ay;
	// 9115 17009:aload_1         
	// 9116 17010:aload_1         
	// 9117 17011:getfield        #101 <Field int azh.ac>
	// 9118 17014:aload_0         
	// 9119 17015:getfield        #12  <Field azh a>
	// 9120 17018:getfield        #59  <Field int azh.ay>
	// 9121 17021:ior             
	// 9122 17022:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9123 17025:aload_0         
	// 9124 17026:getfield        #12  <Field azh a>
	// 9125 17029:astore_1        
		abyte0.av = ((azh) (abyte0)).E ^ a.av;
	// 9126 17030:aload_1         
	// 9127 17031:aload_1         
	// 9128 17032:getfield        #80  <Field int azh.E>
	// 9129 17035:aload_0         
	// 9130 17036:getfield        #12  <Field azh a>
	// 9131 17039:getfield        #98  <Field int azh.av>
	// 9132 17042:ixor            
	// 9133 17043:putfield        #98  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9134 17046:aload_0         
	// 9135 17047:getfield        #12  <Field azh a>
	// 9136 17050:astore_1        
		abyte0.aW = ((azh) (abyte0)).ag & ~a.ac;
	// 9137 17051:aload_1         
	// 9138 17052:aload_1         
	// 9139 17053:getfield        #77  <Field int azh.ag>
	// 9140 17056:aload_0         
	// 9141 17057:getfield        #12  <Field azh a>
	// 9142 17060:getfield        #101 <Field int azh.ac>
	// 9143 17063:iconst_m1       
	// 9144 17064:ixor            
	// 9145 17065:iand            
	// 9146 17066:putfield        #375 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 9147 17069:aload_0         
	// 9148 17070:getfield        #12  <Field azh a>
	// 9149 17073:astore_1        
		abyte0.s = ((azh) (abyte0)).ac | a.s;
	// 9150 17074:aload_1         
	// 9151 17075:aload_1         
	// 9152 17076:getfield        #101 <Field int azh.ac>
	// 9153 17079:aload_0         
	// 9154 17080:getfield        #12  <Field azh a>
	// 9155 17083:getfield        #232 <Field int azh.s>
	// 9156 17086:ior             
	// 9157 17087:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9158 17090:aload_0         
	// 9159 17091:getfield        #12  <Field azh a>
	// 9160 17094:astore_1        
		abyte0.s = ((azh) (abyte0)).S ^ a.s;
	// 9161 17095:aload_1         
	// 9162 17096:aload_1         
	// 9163 17097:getfield        #149 <Field int azh.S>
	// 9164 17100:aload_0         
	// 9165 17101:getfield        #12  <Field azh a>
	// 9166 17104:getfield        #232 <Field int azh.s>
	// 9167 17107:ixor            
	// 9168 17108:putfield        #232 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9169 17111:aload_0         
	// 9170 17112:getfield        #12  <Field azh a>
	// 9171 17115:astore_1        
		abyte0.aV = ((azh) (abyte0)).cx | a.s;
	// 9172 17116:aload_1         
	// 9173 17117:aload_1         
	// 9174 17118:getfield        #185 <Field int azh.cx>
	// 9175 17121:aload_0         
	// 9176 17122:getfield        #12  <Field azh a>
	// 9177 17125:getfield        #232 <Field int azh.s>
	// 9178 17128:ior             
	// 9179 17129:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9180 17132:aload_0         
	// 9181 17133:getfield        #12  <Field azh a>
	// 9182 17136:astore_1        
		abyte0.cb = ((azh) (abyte0)).s ^ a.cb;
	// 9183 17137:aload_1         
	// 9184 17138:aload_1         
	// 9185 17139:getfield        #232 <Field int azh.s>
	// 9186 17142:aload_0         
	// 9187 17143:getfield        #12  <Field azh a>
	// 9188 17146:getfield        #252 <Field int azh.cb>
	// 9189 17149:ixor            
	// 9190 17150:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9191 17153:aload_0         
	// 9192 17154:getfield        #12  <Field azh a>
	// 9193 17157:astore_1        
		abyte0.cb = ((azh) (abyte0)).ci | a.cb;
	// 9194 17158:aload_1         
	// 9195 17159:aload_1         
	// 9196 17160:getfield        #50  <Field int azh.ci>
	// 9197 17163:aload_0         
	// 9198 17164:getfield        #12  <Field azh a>
	// 9199 17167:getfield        #252 <Field int azh.cb>
	// 9200 17170:ior             
	// 9201 17171:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9202 17174:aload_0         
	// 9203 17175:getfield        #12  <Field azh a>
	// 9204 17178:astore_1        
		abyte0.Y = ((azh) (abyte0)).bX & ~a.ac;
	// 9205 17179:aload_1         
	// 9206 17180:aload_1         
	// 9207 17181:getfield        #309 <Field int azh.bX>
	// 9208 17184:aload_0         
	// 9209 17185:getfield        #12  <Field azh a>
	// 9210 17188:getfield        #101 <Field int azh.ac>
	// 9211 17191:iconst_m1       
	// 9212 17192:ixor            
	// 9213 17193:iand            
	// 9214 17194:putfield        #525 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 9215 17197:aload_0         
	// 9216 17198:getfield        #12  <Field azh a>
	// 9217 17201:astore_1        
		abyte0.Y = ((azh) (abyte0)).Y & ~a.cx;
	// 9218 17202:aload_1         
	// 9219 17203:aload_1         
	// 9220 17204:getfield        #525 <Field int azh.Y>
	// 9221 17207:aload_0         
	// 9222 17208:getfield        #12  <Field azh a>
	// 9223 17211:getfield        #185 <Field int azh.cx>
	// 9224 17214:iconst_m1       
	// 9225 17215:ixor            
	// 9226 17216:iand            
	// 9227 17217:putfield        #525 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 9228 17220:aload_0         
	// 9229 17221:getfield        #12  <Field azh a>
	// 9230 17224:astore_1        
		abyte0.Y = ((azh) (abyte0)).ci | a.Y;
	// 9231 17225:aload_1         
	// 9232 17226:aload_1         
	// 9233 17227:getfield        #50  <Field int azh.ci>
	// 9234 17230:aload_0         
	// 9235 17231:getfield        #12  <Field azh a>
	// 9236 17234:getfield        #525 <Field int azh.Y>
	// 9237 17237:ior             
	// 9238 17238:putfield        #525 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 9239 17241:aload_0         
	// 9240 17242:getfield        #12  <Field azh a>
	// 9241 17245:astore_1        
		abyte0.ck = ((azh) (abyte0)).ac | a.E;
	// 9242 17246:aload_1         
	// 9243 17247:aload_1         
	// 9244 17248:getfield        #101 <Field int azh.ac>
	// 9245 17251:aload_0         
	// 9246 17252:getfield        #12  <Field azh a>
	// 9247 17255:getfield        #80  <Field int azh.E>
	// 9248 17258:ior             
	// 9249 17259:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 9250 17262:aload_0         
	// 9251 17263:getfield        #12  <Field azh a>
	// 9252 17266:astore_1        
		abyte0.ck = ((azh) (abyte0)).aS ^ a.ck;
	// 9253 17267:aload_1         
	// 9254 17268:aload_1         
	// 9255 17269:getfield        #202 <Field int azh.aS>
	// 9256 17272:aload_0         
	// 9257 17273:getfield        #12  <Field azh a>
	// 9258 17276:getfield        #261 <Field int azh.ck>
	// 9259 17279:ixor            
	// 9260 17280:putfield        #261 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 9261 17283:aload_0         
	// 9262 17284:getfield        #12  <Field azh a>
	// 9263 17287:astore_1        
		abyte0.aS = ((azh) (abyte0)).ay & ~a.ac;
	// 9264 17288:aload_1         
	// 9265 17289:aload_1         
	// 9266 17290:getfield        #59  <Field int azh.ay>
	// 9267 17293:aload_0         
	// 9268 17294:getfield        #12  <Field azh a>
	// 9269 17297:getfield        #101 <Field int azh.ac>
	// 9270 17300:iconst_m1       
	// 9271 17301:ixor            
	// 9272 17302:iand            
	// 9273 17303:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9274 17306:aload_0         
	// 9275 17307:getfield        #12  <Field azh a>
	// 9276 17310:astore_1        
		abyte0.aS = ((azh) (abyte0)).ay ^ a.aS;
	// 9277 17311:aload_1         
	// 9278 17312:aload_1         
	// 9279 17313:getfield        #59  <Field int azh.ay>
	// 9280 17316:aload_0         
	// 9281 17317:getfield        #12  <Field azh a>
	// 9282 17320:getfield        #202 <Field int azh.aS>
	// 9283 17323:ixor            
	// 9284 17324:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9285 17327:aload_0         
	// 9286 17328:getfield        #12  <Field azh a>
	// 9287 17331:astore_1        
		abyte0.aS = ((azh) (abyte0)).cx | a.aS;
	// 9288 17332:aload_1         
	// 9289 17333:aload_1         
	// 9290 17334:getfield        #185 <Field int azh.cx>
	// 9291 17337:aload_0         
	// 9292 17338:getfield        #12  <Field azh a>
	// 9293 17341:getfield        #202 <Field int azh.aS>
	// 9294 17344:ior             
	// 9295 17345:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9296 17348:aload_0         
	// 9297 17349:getfield        #12  <Field azh a>
	// 9298 17352:astore_1        
		abyte0.bk = ((azh) (abyte0)).E & ~a.ac;
	// 9299 17353:aload_1         
	// 9300 17354:aload_1         
	// 9301 17355:getfield        #80  <Field int azh.E>
	// 9302 17358:aload_0         
	// 9303 17359:getfield        #12  <Field azh a>
	// 9304 17362:getfield        #101 <Field int azh.ac>
	// 9305 17365:iconst_m1       
	// 9306 17366:ixor            
	// 9307 17367:iand            
	// 9308 17368:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9309 17371:aload_0         
	// 9310 17372:getfield        #12  <Field azh a>
	// 9311 17375:astore_1        
		abyte0.aS = ((azh) (abyte0)).bk ^ a.aS;
	// 9312 17376:aload_1         
	// 9313 17377:aload_1         
	// 9314 17378:getfield        #255 <Field int azh.bk>
	// 9315 17381:aload_0         
	// 9316 17382:getfield        #12  <Field azh a>
	// 9317 17385:getfield        #202 <Field int azh.aS>
	// 9318 17388:ixor            
	// 9319 17389:putfield        #202 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9320 17392:aload_0         
	// 9321 17393:getfield        #12  <Field azh a>
	// 9322 17396:astore_1        
		abyte0.bk = ((azh) (abyte0)).ac | a.E;
	// 9323 17397:aload_1         
	// 9324 17398:aload_1         
	// 9325 17399:getfield        #101 <Field int azh.ac>
	// 9326 17402:aload_0         
	// 9327 17403:getfield        #12  <Field azh a>
	// 9328 17406:getfield        #80  <Field int azh.E>
	// 9329 17409:ior             
	// 9330 17410:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9331 17413:aload_0         
	// 9332 17414:getfield        #12  <Field azh a>
	// 9333 17417:astore_1        
		abyte0.bk = ((azh) (abyte0)).E ^ a.bk;
	// 9334 17418:aload_1         
	// 9335 17419:aload_1         
	// 9336 17420:getfield        #80  <Field int azh.E>
	// 9337 17423:aload_0         
	// 9338 17424:getfield        #12  <Field azh a>
	// 9339 17427:getfield        #255 <Field int azh.bk>
	// 9340 17430:ixor            
	// 9341 17431:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9342 17434:aload_0         
	// 9343 17435:getfield        #12  <Field azh a>
	// 9344 17438:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & ~a.cx;
	// 9345 17439:aload_1         
	// 9346 17440:aload_1         
	// 9347 17441:getfield        #255 <Field int azh.bk>
	// 9348 17444:aload_0         
	// 9349 17445:getfield        #12  <Field azh a>
	// 9350 17448:getfield        #185 <Field int azh.cx>
	// 9351 17451:iconst_m1       
	// 9352 17452:ixor            
	// 9353 17453:iand            
	// 9354 17454:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9355 17457:aload_0         
	// 9356 17458:getfield        #12  <Field azh a>
	// 9357 17461:astore_1        
		abyte0.bk = ((azh) (abyte0)).aW ^ a.bk;
	// 9358 17462:aload_1         
	// 9359 17463:aload_1         
	// 9360 17464:getfield        #375 <Field int azh.aW>
	// 9361 17467:aload_0         
	// 9362 17468:getfield        #12  <Field azh a>
	// 9363 17471:getfield        #255 <Field int azh.bk>
	// 9364 17474:ixor            
	// 9365 17475:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9366 17478:aload_0         
	// 9367 17479:getfield        #12  <Field azh a>
	// 9368 17482:astore_1        
		abyte0.aW = ((azh) (abyte0)).bf & ~a.ac;
	// 9369 17483:aload_1         
	// 9370 17484:aload_1         
	// 9371 17485:getfield        #318 <Field int azh.bf>
	// 9372 17488:aload_0         
	// 9373 17489:getfield        #12  <Field azh a>
	// 9374 17492:getfield        #101 <Field int azh.ac>
	// 9375 17495:iconst_m1       
	// 9376 17496:ixor            
	// 9377 17497:iand            
	// 9378 17498:putfield        #375 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 9379 17501:aload_0         
	// 9380 17502:getfield        #12  <Field azh a>
	// 9381 17505:astore_1        
		abyte0.aW = ((azh) (abyte0)).bf ^ a.aW;
	// 9382 17506:aload_1         
	// 9383 17507:aload_1         
	// 9384 17508:getfield        #318 <Field int azh.bf>
	// 9385 17511:aload_0         
	// 9386 17512:getfield        #12  <Field azh a>
	// 9387 17515:getfield        #375 <Field int azh.aW>
	// 9388 17518:ixor            
	// 9389 17519:putfield        #375 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 9390 17522:aload_0         
	// 9391 17523:getfield        #12  <Field azh a>
	// 9392 17526:astore_1        
		abyte0.cz = ((azh) (abyte0)).cx | a.aW;
	// 9393 17527:aload_1         
	// 9394 17528:aload_1         
	// 9395 17529:getfield        #185 <Field int azh.cx>
	// 9396 17532:aload_0         
	// 9397 17533:getfield        #12  <Field azh a>
	// 9398 17536:getfield        #375 <Field int azh.aW>
	// 9399 17539:ior             
	// 9400 17540:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 9401 17543:aload_0         
	// 9402 17544:getfield        #12  <Field azh a>
	// 9403 17547:astore_1        
		abyte0.cz = ((azh) (abyte0)).cu ^ a.cz;
	// 9404 17548:aload_1         
	// 9405 17549:aload_1         
	// 9406 17550:getfield        #561 <Field int azh.cu>
	// 9407 17553:aload_0         
	// 9408 17554:getfield        #12  <Field azh a>
	// 9409 17557:getfield        #229 <Field int azh.cz>
	// 9410 17560:ixor            
	// 9411 17561:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 9412 17564:aload_0         
	// 9413 17565:getfield        #12  <Field azh a>
	// 9414 17568:astore_1        
		abyte0.cu = ((azh) (abyte0)).S & ~a.ac;
	// 9415 17569:aload_1         
	// 9416 17570:aload_1         
	// 9417 17571:getfield        #149 <Field int azh.S>
	// 9418 17574:aload_0         
	// 9419 17575:getfield        #12  <Field azh a>
	// 9420 17578:getfield        #101 <Field int azh.ac>
	// 9421 17581:iconst_m1       
	// 9422 17582:ixor            
	// 9423 17583:iand            
	// 9424 17584:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 9425 17587:aload_0         
	// 9426 17588:getfield        #12  <Field azh a>
	// 9427 17591:astore_1        
		abyte0.cu = ((azh) (abyte0)).E ^ a.cu;
	// 9428 17592:aload_1         
	// 9429 17593:aload_1         
	// 9430 17594:getfield        #80  <Field int azh.E>
	// 9431 17597:aload_0         
	// 9432 17598:getfield        #12  <Field azh a>
	// 9433 17601:getfield        #561 <Field int azh.cu>
	// 9434 17604:ixor            
	// 9435 17605:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 9436 17608:aload_0         
	// 9437 17609:getfield        #12  <Field azh a>
	// 9438 17612:astore_1        
		abyte0.b = ((azh) (abyte0)).cu ^ a.b;
	// 9439 17613:aload_1         
	// 9440 17614:aload_1         
	// 9441 17615:getfield        #561 <Field int azh.cu>
	// 9442 17618:aload_0         
	// 9443 17619:getfield        #12  <Field azh a>
	// 9444 17622:getfield        #384 <Field int azh.b>
	// 9445 17625:ixor            
	// 9446 17626:putfield        #384 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 9447 17629:aload_0         
	// 9448 17630:getfield        #12  <Field azh a>
	// 9449 17633:astore_1        
		abyte0.Y = ((azh) (abyte0)).b ^ a.Y;
	// 9450 17634:aload_1         
	// 9451 17635:aload_1         
	// 9452 17636:getfield        #384 <Field int azh.b>
	// 9453 17639:aload_0         
	// 9454 17640:getfield        #12  <Field azh a>
	// 9455 17643:getfield        #525 <Field int azh.Y>
	// 9456 17646:ixor            
	// 9457 17647:putfield        #525 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 9458 17650:aload_0         
	// 9459 17651:getfield        #12  <Field azh a>
	// 9460 17654:astore_1        
		abyte0.cu = ((azh) (abyte0)).cx & a.cu;
	// 9461 17655:aload_1         
	// 9462 17656:aload_1         
	// 9463 17657:getfield        #185 <Field int azh.cx>
	// 9464 17660:aload_0         
	// 9465 17661:getfield        #12  <Field azh a>
	// 9466 17664:getfield        #561 <Field int azh.cu>
	// 9467 17667:iand            
	// 9468 17668:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 9469 17671:aload_0         
	// 9470 17672:getfield        #12  <Field azh a>
	// 9471 17675:astore_1        
		abyte0.cu = ((azh) (abyte0)).bj ^ a.cu;
	// 9472 17676:aload_1         
	// 9473 17677:aload_1         
	// 9474 17678:getfield        #405 <Field int azh.bj>
	// 9475 17681:aload_0         
	// 9476 17682:getfield        #12  <Field azh a>
	// 9477 17685:getfield        #561 <Field int azh.cu>
	// 9478 17688:ixor            
	// 9479 17689:putfield        #561 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 9480 17692:aload_0         
	// 9481 17693:getfield        #12  <Field azh a>
	// 9482 17696:astore_1        
		abyte0.cb = ((azh) (abyte0)).cu ^ a.cb;
	// 9483 17697:aload_1         
	// 9484 17698:aload_1         
	// 9485 17699:getfield        #561 <Field int azh.cu>
	// 9486 17702:aload_0         
	// 9487 17703:getfield        #12  <Field azh a>
	// 9488 17706:getfield        #252 <Field int azh.cb>
	// 9489 17709:ixor            
	// 9490 17710:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9491 17713:aload_0         
	// 9492 17714:getfield        #12  <Field azh a>
	// 9493 17717:astore_1        
		abyte0.cb = ((azh) (abyte0)).cb & ~a.X;
	// 9494 17718:aload_1         
	// 9495 17719:aload_1         
	// 9496 17720:getfield        #252 <Field int azh.cb>
	// 9497 17723:aload_0         
	// 9498 17724:getfield        #12  <Field azh a>
	// 9499 17727:getfield        #119 <Field int azh.X>
	// 9500 17730:iconst_m1       
	// 9501 17731:ixor            
	// 9502 17732:iand            
	// 9503 17733:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9504 17736:aload_0         
	// 9505 17737:getfield        #12  <Field azh a>
	// 9506 17740:astore_1        
		abyte0.S = ((azh) (abyte0)).ac | a.S;
	// 9507 17741:aload_1         
	// 9508 17742:aload_1         
	// 9509 17743:getfield        #101 <Field int azh.ac>
	// 9510 17746:aload_0         
	// 9511 17747:getfield        #12  <Field azh a>
	// 9512 17750:getfield        #149 <Field int azh.S>
	// 9513 17753:ior             
	// 9514 17754:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9515 17757:aload_0         
	// 9516 17758:getfield        #12  <Field azh a>
	// 9517 17761:astore_1        
		abyte0.S = ((azh) (abyte0)).ay ^ a.S;
	// 9518 17762:aload_1         
	// 9519 17763:aload_1         
	// 9520 17764:getfield        #59  <Field int azh.ay>
	// 9521 17767:aload_0         
	// 9522 17768:getfield        #12  <Field azh a>
	// 9523 17771:getfield        #149 <Field int azh.S>
	// 9524 17774:ixor            
	// 9525 17775:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9526 17778:aload_0         
	// 9527 17779:getfield        #12  <Field azh a>
	// 9528 17782:astore_1        
		abyte0.aV = ((azh) (abyte0)).S ^ a.aV;
	// 9529 17783:aload_1         
	// 9530 17784:aload_1         
	// 9531 17785:getfield        #149 <Field int azh.S>
	// 9532 17788:aload_0         
	// 9533 17789:getfield        #12  <Field azh a>
	// 9534 17792:getfield        #92  <Field int azh.aV>
	// 9535 17795:ixor            
	// 9536 17796:putfield        #92  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9537 17799:aload_0         
	// 9538 17800:getfield        #12  <Field azh a>
	// 9539 17803:astore_1        
		abyte0.S = ((azh) (abyte0)).ac | a.ay;
	// 9540 17804:aload_1         
	// 9541 17805:aload_1         
	// 9542 17806:getfield        #101 <Field int azh.ac>
	// 9543 17809:aload_0         
	// 9544 17810:getfield        #12  <Field azh a>
	// 9545 17813:getfield        #59  <Field int azh.ay>
	// 9546 17816:ior             
	// 9547 17817:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9548 17820:aload_0         
	// 9549 17821:getfield        #12  <Field azh a>
	// 9550 17824:astore_1        
		abyte0.S = ((azh) (abyte0)).S & ~a.cx;
	// 9551 17825:aload_1         
	// 9552 17826:aload_1         
	// 9553 17827:getfield        #149 <Field int azh.S>
	// 9554 17830:aload_0         
	// 9555 17831:getfield        #12  <Field azh a>
	// 9556 17834:getfield        #185 <Field int azh.cx>
	// 9557 17837:iconst_m1       
	// 9558 17838:ixor            
	// 9559 17839:iand            
	// 9560 17840:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9561 17843:aload_0         
	// 9562 17844:getfield        #12  <Field azh a>
	// 9563 17847:astore_1        
		abyte0.S = ((azh) (abyte0)).s ^ a.S;
	// 9564 17848:aload_1         
	// 9565 17849:aload_1         
	// 9566 17850:getfield        #232 <Field int azh.s>
	// 9567 17853:aload_0         
	// 9568 17854:getfield        #12  <Field azh a>
	// 9569 17857:getfield        #149 <Field int azh.S>
	// 9570 17860:ixor            
	// 9571 17861:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9572 17864:aload_0         
	// 9573 17865:getfield        #12  <Field azh a>
	// 9574 17868:astore_1        
		abyte0.S = ((azh) (abyte0)).ci | a.S;
	// 9575 17869:aload_1         
	// 9576 17870:aload_1         
	// 9577 17871:getfield        #50  <Field int azh.ci>
	// 9578 17874:aload_0         
	// 9579 17875:getfield        #12  <Field azh a>
	// 9580 17878:getfield        #149 <Field int azh.S>
	// 9581 17881:ior             
	// 9582 17882:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9583 17885:aload_0         
	// 9584 17886:getfield        #12  <Field azh a>
	// 9585 17889:astore_1        
		abyte0.S = ((azh) (abyte0)).bk ^ a.S;
	// 9586 17890:aload_1         
	// 9587 17891:aload_1         
	// 9588 17892:getfield        #255 <Field int azh.bk>
	// 9589 17895:aload_0         
	// 9590 17896:getfield        #12  <Field azh a>
	// 9591 17899:getfield        #149 <Field int azh.S>
	// 9592 17902:ixor            
	// 9593 17903:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9594 17906:aload_0         
	// 9595 17907:getfield        #12  <Field azh a>
	// 9596 17910:astore_1        
		abyte0.cb = ((azh) (abyte0)).S ^ a.cb;
	// 9597 17911:aload_1         
	// 9598 17912:aload_1         
	// 9599 17913:getfield        #149 <Field int azh.S>
	// 9600 17916:aload_0         
	// 9601 17917:getfield        #12  <Field azh a>
	// 9602 17920:getfield        #252 <Field int azh.cb>
	// 9603 17923:ixor            
	// 9604 17924:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9605 17927:aload_0         
	// 9606 17928:getfield        #12  <Field azh a>
	// 9607 17931:astore_1        
		abyte0.cb = ((azh) (abyte0)).cb ^ a.aj;
	// 9608 17932:aload_1         
	// 9609 17933:aload_1         
	// 9610 17934:getfield        #252 <Field int azh.cb>
	// 9611 17937:aload_0         
	// 9612 17938:getfield        #12  <Field azh a>
	// 9613 17941:getfield        #372 <Field int azh.aj>
	// 9614 17944:ixor            
	// 9615 17945:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9616 17948:aload_0         
	// 9617 17949:getfield        #12  <Field azh a>
	// 9618 17952:astore_1        
		abyte0.cb = ~((azh) (abyte0)).cb;
	// 9619 17953:aload_1         
	// 9620 17954:aload_1         
	// 9621 17955:getfield        #252 <Field int azh.cb>
	// 9622 17958:iconst_m1       
	// 9623 17959:ixor            
	// 9624 17960:putfield        #252 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9625 17963:aload_0         
	// 9626 17964:getfield        #12  <Field azh a>
	// 9627 17967:astore_1        
		abyte0.S = ~((azh) (abyte0)).ac;
	// 9628 17968:aload_1         
	// 9629 17969:aload_1         
	// 9630 17970:getfield        #101 <Field int azh.ac>
	// 9631 17973:iconst_m1       
	// 9632 17974:ixor            
	// 9633 17975:putfield        #149 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9634 17978:aload_0         
	// 9635 17979:getfield        #12  <Field azh a>
	// 9636 17982:astore_1        
		abyte0.bk = ((azh) (abyte0)).ay & ~a.ac;
	// 9637 17983:aload_1         
	// 9638 17984:aload_1         
	// 9639 17985:getfield        #59  <Field int azh.ay>
	// 9640 17988:aload_0         
	// 9641 17989:getfield        #12  <Field azh a>
	// 9642 17992:getfield        #101 <Field int azh.ac>
	// 9643 17995:iconst_m1       
	// 9644 17996:ixor            
	// 9645 17997:iand            
	// 9646 17998:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9647 18001:aload_0         
	// 9648 18002:getfield        #12  <Field azh a>
	// 9649 18005:astore_1        
		abyte0.bk = ((azh) (abyte0)).bX ^ a.bk;
	// 9650 18006:aload_1         
	// 9651 18007:aload_1         
	// 9652 18008:getfield        #309 <Field int azh.bX>
	// 9653 18011:aload_0         
	// 9654 18012:getfield        #12  <Field azh a>
	// 9655 18015:getfield        #255 <Field int azh.bk>
	// 9656 18018:ixor            
	// 9657 18019:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9658 18022:aload_0         
	// 9659 18023:getfield        #12  <Field azh a>
	// 9660 18026:astore_1        
		abyte0.bX = ((azh) (abyte0)).cx | a.bk;
	// 9661 18027:aload_1         
	// 9662 18028:aload_1         
	// 9663 18029:getfield        #185 <Field int azh.cx>
	// 9664 18032:aload_0         
	// 9665 18033:getfield        #12  <Field azh a>
	// 9666 18036:getfield        #255 <Field int azh.bk>
	// 9667 18039:ior             
	// 9668 18040:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9669 18043:aload_0         
	// 9670 18044:getfield        #12  <Field azh a>
	// 9671 18047:astore_1        
		abyte0.bX = ((azh) (abyte0)).aW ^ a.bX;
	// 9672 18048:aload_1         
	// 9673 18049:aload_1         
	// 9674 18050:getfield        #375 <Field int azh.aW>
	// 9675 18053:aload_0         
	// 9676 18054:getfield        #12  <Field azh a>
	// 9677 18057:getfield        #309 <Field int azh.bX>
	// 9678 18060:ixor            
	// 9679 18061:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9680 18064:aload_0         
	// 9681 18065:getfield        #12  <Field azh a>
	// 9682 18068:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX & ~a.ci;
	// 9683 18069:aload_1         
	// 9684 18070:aload_1         
	// 9685 18071:getfield        #309 <Field int azh.bX>
	// 9686 18074:aload_0         
	// 9687 18075:getfield        #12  <Field azh a>
	// 9688 18078:getfield        #50  <Field int azh.ci>
	// 9689 18081:iconst_m1       
	// 9690 18082:ixor            
	// 9691 18083:iand            
	// 9692 18084:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9693 18087:aload_0         
	// 9694 18088:getfield        #12  <Field azh a>
	// 9695 18091:astore_1        
		abyte0.bX = ((azh) (abyte0)).M ^ a.bX;
	// 9696 18092:aload_1         
	// 9697 18093:aload_1         
	// 9698 18094:getfield        #53  <Field int azh.M>
	// 9699 18097:aload_0         
	// 9700 18098:getfield        #12  <Field azh a>
	// 9701 18101:getfield        #309 <Field int azh.bX>
	// 9702 18104:ixor            
	// 9703 18105:putfield        #309 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9704 18108:aload_0         
	// 9705 18109:getfield        #12  <Field azh a>
	// 9706 18112:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & ~a.cx;
	// 9707 18113:aload_1         
	// 9708 18114:aload_1         
	// 9709 18115:getfield        #255 <Field int azh.bk>
	// 9710 18118:aload_0         
	// 9711 18119:getfield        #12  <Field azh a>
	// 9712 18122:getfield        #185 <Field int azh.cx>
	// 9713 18125:iconst_m1       
	// 9714 18126:ixor            
	// 9715 18127:iand            
	// 9716 18128:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9717 18131:aload_0         
	// 9718 18132:getfield        #12  <Field azh a>
	// 9719 18135:astore_1        
		abyte0.bk = ((azh) (abyte0)).ck ^ a.bk;
	// 9720 18136:aload_1         
	// 9721 18137:aload_1         
	// 9722 18138:getfield        #261 <Field int azh.ck>
	// 9723 18141:aload_0         
	// 9724 18142:getfield        #12  <Field azh a>
	// 9725 18145:getfield        #255 <Field int azh.bk>
	// 9726 18148:ixor            
	// 9727 18149:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9728 18152:aload_0         
	// 9729 18153:getfield        #12  <Field azh a>
	// 9730 18156:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & ~a.ci;
	// 9731 18157:aload_1         
	// 9732 18158:aload_1         
	// 9733 18159:getfield        #255 <Field int azh.bk>
	// 9734 18162:aload_0         
	// 9735 18163:getfield        #12  <Field azh a>
	// 9736 18166:getfield        #50  <Field int azh.ci>
	// 9737 18169:iconst_m1       
	// 9738 18170:ixor            
	// 9739 18171:iand            
	// 9740 18172:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9741 18175:aload_0         
	// 9742 18176:getfield        #12  <Field azh a>
	// 9743 18179:astore_1        
		abyte0.bk = ((azh) (abyte0)).cz ^ a.bk;
	// 9744 18180:aload_1         
	// 9745 18181:aload_1         
	// 9746 18182:getfield        #229 <Field int azh.cz>
	// 9747 18185:aload_0         
	// 9748 18186:getfield        #12  <Field azh a>
	// 9749 18189:getfield        #255 <Field int azh.bk>
	// 9750 18192:ixor            
	// 9751 18193:putfield        #255 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9752 18196:aload_0         
	// 9753 18197:getfield        #12  <Field azh a>
	// 9754 18200:astore_1        
		abyte0.cz = ((azh) (abyte0)).bf & ~a.ac;
	// 9755 18201:aload_1         
	// 9756 18202:aload_1         
	// 9757 18203:getfield        #318 <Field int azh.bf>
	// 9758 18206:aload_0         
	// 9759 18207:getfield        #12  <Field azh a>
	// 9760 18210:getfield        #101 <Field int azh.ac>
	// 9761 18213:iconst_m1       
	// 9762 18214:ixor            
	// 9763 18215:iand            
	// 9764 18216:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 9765 18219:aload_0         
	// 9766 18220:getfield        #12  <Field azh a>
	// 9767 18223:astore_1        
		abyte0.cz = ((azh) (abyte0)).ag ^ a.cz;
	// 9768 18224:aload_1         
	// 9769 18225:aload_1         
	// 9770 18226:getfield        #77  <Field int azh.ag>
	// 9771 18229:aload_0         
	// 9772 18230:getfield        #12  <Field azh a>
	// 9773 18233:getfield        #229 <Field int azh.cz>
	// 9774 18236:ixor            
	// 9775 18237:putfield        #229 <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 9776 18240:aload_0         
	// 9777 18241:getfield        #12  <Field azh a>
	// 9778 18244:astore_1        
		abyte0.cg = ((azh) (abyte0)).cz ^ a.cg;
	// 9779 18245:aload_1         
	// 9780 18246:aload_1         
	// 9781 18247:getfield        #229 <Field int azh.cz>
	// 9782 18250:aload_0         
	// 9783 18251:getfield        #12  <Field azh a>
	// 9784 18254:getfield        #264 <Field int azh.cg>
	// 9785 18257:ixor            
	// 9786 18258:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9787 18261:aload_0         
	// 9788 18262:getfield        #12  <Field azh a>
	// 9789 18265:astore_1        
		abyte0.cg = ((azh) (abyte0)).ci | a.cg;
	// 9790 18266:aload_1         
	// 9791 18267:aload_1         
	// 9792 18268:getfield        #50  <Field int azh.ci>
	// 9793 18271:aload_0         
	// 9794 18272:getfield        #12  <Field azh a>
	// 9795 18275:getfield        #264 <Field int azh.cg>
	// 9796 18278:ior             
	// 9797 18279:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9798 18282:aload_0         
	// 9799 18283:getfield        #12  <Field azh a>
	// 9800 18286:astore_1        
		abyte0.cg = ((azh) (abyte0)).aS ^ a.cg;
	// 9801 18287:aload_1         
	// 9802 18288:aload_1         
	// 9803 18289:getfield        #202 <Field int azh.aS>
	// 9804 18292:aload_0         
	// 9805 18293:getfield        #12  <Field azh a>
	// 9806 18296:getfield        #264 <Field int azh.cg>
	// 9807 18299:ixor            
	// 9808 18300:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9809 18303:aload_0         
	// 9810 18304:getfield        #12  <Field azh a>
	// 9811 18307:astore_1        
		abyte0.cg = ((azh) (abyte0)).X | a.cg;
	// 9812 18308:aload_1         
	// 9813 18309:aload_1         
	// 9814 18310:getfield        #119 <Field int azh.X>
	// 9815 18313:aload_0         
	// 9816 18314:getfield        #12  <Field azh a>
	// 9817 18317:getfield        #264 <Field int azh.cg>
	// 9818 18320:ior             
	// 9819 18321:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9820 18324:aload_0         
	// 9821 18325:getfield        #12  <Field azh a>
	// 9822 18328:astore_1        
		abyte0.cg = ((azh) (abyte0)).bX ^ a.cg;
	// 9823 18329:aload_1         
	// 9824 18330:aload_1         
	// 9825 18331:getfield        #309 <Field int azh.bX>
	// 9826 18334:aload_0         
	// 9827 18335:getfield        #12  <Field azh a>
	// 9828 18338:getfield        #264 <Field int azh.cg>
	// 9829 18341:ixor            
	// 9830 18342:putfield        #264 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9831 18345:aload_0         
	// 9832 18346:getfield        #12  <Field azh a>
	// 9833 18349:astore_1        
		abyte0.j = ((azh) (abyte0)).cg ^ a.j;
	// 9834 18350:aload_1         
	// 9835 18351:aload_1         
	// 9836 18352:getfield        #264 <Field int azh.cg>
	// 9837 18355:aload_0         
	// 9838 18356:getfield        #12  <Field azh a>
	// 9839 18359:getfield        #285 <Field int azh.j>
	// 9840 18362:ixor            
	// 9841 18363:putfield        #285 <Field int azh.j>
		abyte0 = ((byte []) (a));
	// 9842 18366:aload_0         
	// 9843 18367:getfield        #12  <Field azh a>
	// 9844 18370:astore_1        
		abyte0.cx = ((azh) (abyte0)).cz & ~a.cx;
	// 9845 18371:aload_1         
	// 9846 18372:aload_1         
	// 9847 18373:getfield        #229 <Field int azh.cz>
	// 9848 18376:aload_0         
	// 9849 18377:getfield        #12  <Field azh a>
	// 9850 18380:getfield        #185 <Field int azh.cx>
	// 9851 18383:iconst_m1       
	// 9852 18384:ixor            
	// 9853 18385:iand            
	// 9854 18386:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 9855 18389:aload_0         
	// 9856 18390:getfield        #12  <Field azh a>
	// 9857 18393:astore_1        
		abyte0.cx = ((azh) (abyte0)).av ^ a.cx;
	// 9858 18394:aload_1         
	// 9859 18395:aload_1         
	// 9860 18396:getfield        #98  <Field int azh.av>
	// 9861 18399:aload_0         
	// 9862 18400:getfield        #12  <Field azh a>
	// 9863 18403:getfield        #185 <Field int azh.cx>
	// 9864 18406:ixor            
	// 9865 18407:putfield        #185 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 9866 18410:aload_0         
	// 9867 18411:getfield        #12  <Field azh a>
	// 9868 18414:astore_1        
		abyte0.cr = ((azh) (abyte0)).cx ^ a.cr;
	// 9869 18415:aload_1         
	// 9870 18416:aload_1         
	// 9871 18417:getfield        #185 <Field int azh.cx>
	// 9872 18420:aload_0         
	// 9873 18421:getfield        #12  <Field azh a>
	// 9874 18424:getfield        #68  <Field int azh.cr>
	// 9875 18427:ixor            
	// 9876 18428:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 9877 18431:aload_0         
	// 9878 18432:getfield        #12  <Field azh a>
	// 9879 18435:astore_1        
		abyte0.cr = ((azh) (abyte0)).cr & ~a.X;
	// 9880 18436:aload_1         
	// 9881 18437:aload_1         
	// 9882 18438:getfield        #68  <Field int azh.cr>
	// 9883 18441:aload_0         
	// 9884 18442:getfield        #12  <Field azh a>
	// 9885 18445:getfield        #119 <Field int azh.X>
	// 9886 18448:iconst_m1       
	// 9887 18449:ixor            
	// 9888 18450:iand            
	// 9889 18451:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 9890 18454:aload_0         
	// 9891 18455:getfield        #12  <Field azh a>
	// 9892 18458:astore_1        
		abyte0.cr = ((azh) (abyte0)).bk ^ a.cr;
	// 9893 18459:aload_1         
	// 9894 18460:aload_1         
	// 9895 18461:getfield        #255 <Field int azh.bk>
	// 9896 18464:aload_0         
	// 9897 18465:getfield        #12  <Field azh a>
	// 9898 18468:getfield        #68  <Field int azh.cr>
	// 9899 18471:ixor            
	// 9900 18472:putfield        #68  <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 9901 18475:aload_0         
	// 9902 18476:getfield        #12  <Field azh a>
	// 9903 18479:astore_1        
		abyte0.br = ((azh) (abyte0)).cr ^ a.br;
	// 9904 18480:aload_1         
	// 9905 18481:aload_1         
	// 9906 18482:getfield        #68  <Field int azh.cr>
	// 9907 18485:aload_0         
	// 9908 18486:getfield        #12  <Field azh a>
	// 9909 18489:getfield        #32  <Field int azh.br>
	// 9910 18492:ixor            
	// 9911 18493:putfield        #32  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 9912 18496:aload_0         
	// 9913 18497:getfield        #12  <Field azh a>
	// 9914 18500:astore_1        
		abyte0.ay = ((azh) (abyte0)).ac | a.ay;
	// 9915 18501:aload_1         
	// 9916 18502:aload_1         
	// 9917 18503:getfield        #101 <Field int azh.ac>
	// 9918 18506:aload_0         
	// 9919 18507:getfield        #12  <Field azh a>
	// 9920 18510:getfield        #59  <Field int azh.ay>
	// 9921 18513:ior             
	// 9922 18514:putfield        #59  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 9923 18517:aload_0         
	// 9924 18518:getfield        #12  <Field azh a>
	// 9925 18521:astore_1        
		abyte0.ay = ((azh) (abyte0)).bf ^ a.ay;
	// 9926 18522:aload_1         
	// 9927 18523:aload_1         
	// 9928 18524:getfield        #318 <Field int azh.bf>
	// 9929 18527:aload_0         
	// 9930 18528:getfield        #12  <Field azh a>
	// 9931 18531:getfield        #59  <Field int azh.ay>
	// 9932 18534:ixor            
	// 9933 18535:putfield        #59  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 9934 18538:aload_0         
	// 9935 18539:getfield        #12  <Field azh a>
	// 9936 18542:astore_1        
		abyte0.bt = ((azh) (abyte0)).ay ^ a.bt;
	// 9937 18543:aload_1         
	// 9938 18544:aload_1         
	// 9939 18545:getfield        #59  <Field int azh.ay>
	// 9940 18548:aload_0         
	// 9941 18549:getfield        #12  <Field azh a>
	// 9942 18552:getfield        #41  <Field int azh.bt>
	// 9943 18555:ixor            
	// 9944 18556:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9945 18559:aload_0         
	// 9946 18560:getfield        #12  <Field azh a>
	// 9947 18563:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt & ~a.ci;
	// 9948 18564:aload_1         
	// 9949 18565:aload_1         
	// 9950 18566:getfield        #41  <Field int azh.bt>
	// 9951 18569:aload_0         
	// 9952 18570:getfield        #12  <Field azh a>
	// 9953 18573:getfield        #50  <Field int azh.ci>
	// 9954 18576:iconst_m1       
	// 9955 18577:ixor            
	// 9956 18578:iand            
	// 9957 18579:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9958 18582:aload_0         
	// 9959 18583:getfield        #12  <Field azh a>
	// 9960 18586:astore_1        
		abyte0.bt = ((azh) (abyte0)).aV ^ a.bt;
	// 9961 18587:aload_1         
	// 9962 18588:aload_1         
	// 9963 18589:getfield        #92  <Field int azh.aV>
	// 9964 18592:aload_0         
	// 9965 18593:getfield        #12  <Field azh a>
	// 9966 18596:getfield        #41  <Field int azh.bt>
	// 9967 18599:ixor            
	// 9968 18600:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9969 18603:aload_0         
	// 9970 18604:getfield        #12  <Field azh a>
	// 9971 18607:astore_1        
		abyte0.bt = ((azh) (abyte0)).X | a.bt;
	// 9972 18608:aload_1         
	// 9973 18609:aload_1         
	// 9974 18610:getfield        #119 <Field int azh.X>
	// 9975 18613:aload_0         
	// 9976 18614:getfield        #12  <Field azh a>
	// 9977 18617:getfield        #41  <Field int azh.bt>
	// 9978 18620:ior             
	// 9979 18621:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9980 18624:aload_0         
	// 9981 18625:getfield        #12  <Field azh a>
	// 9982 18628:astore_1        
		abyte0.bt = ((azh) (abyte0)).Y ^ a.bt;
	// 9983 18629:aload_1         
	// 9984 18630:aload_1         
	// 9985 18631:getfield        #525 <Field int azh.Y>
	// 9986 18634:aload_0         
	// 9987 18635:getfield        #12  <Field azh a>
	// 9988 18638:getfield        #41  <Field int azh.bt>
	// 9989 18641:ixor            
	// 9990 18642:putfield        #41  <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9991 18645:aload_0         
	// 9992 18646:getfield        #12  <Field azh a>
	// 9993 18649:astore_1        
		abyte0.bz = ((azh) (abyte0)).bt ^ a.bz;
	// 9994 18650:aload_1         
	// 9995 18651:aload_1         
	// 9996 18652:getfield        #41  <Field int azh.bt>
	// 9997 18655:aload_0         
	// 9998 18656:getfield        #12  <Field azh a>
	// 9999 18659:getfield        #104 <Field int azh.bz>
	// 10000 18662:ixor            
	// 10001 18663:putfield        #104 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 10002 18666:aload_0         
	// 10003 18667:getfield        #12  <Field azh a>
	// 10004 18670:astore_1        
		abyte0.bz = ~((azh) (abyte0)).bz;
	// 10005 18671:aload_1         
	// 10006 18672:aload_1         
	// 10007 18673:getfield        #104 <Field int azh.bz>
	// 10008 18676:iconst_m1       
	// 10009 18677:ixor            
	// 10010 18678:putfield        #104 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 10011 18681:aload_0         
	// 10012 18682:getfield        #12  <Field azh a>
	// 10013 18685:astore_1        
		abyte0.cB = ((azh) (abyte0)).p | a.cB;
	// 10014 18686:aload_1         
	// 10015 18687:aload_1         
	// 10016 18688:getfield        #387 <Field int azh.p>
	// 10017 18691:aload_0         
	// 10018 18692:getfield        #12  <Field azh a>
	// 10019 18695:getfield        #182 <Field int azh.cB>
	// 10020 18698:ior             
	// 10021 18699:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 10022 18702:aload_0         
	// 10023 18703:getfield        #12  <Field azh a>
	// 10024 18706:astore_1        
		abyte0.cB = ((azh) (abyte0)).cB & ~a.F;
	// 10025 18707:aload_1         
	// 10026 18708:aload_1         
	// 10027 18709:getfield        #182 <Field int azh.cB>
	// 10028 18712:aload_0         
	// 10029 18713:getfield        #12  <Field azh a>
	// 10030 18716:getfield        #393 <Field int azh.F>
	// 10031 18719:iconst_m1       
	// 10032 18720:ixor            
	// 10033 18721:iand            
	// 10034 18722:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 10035 18725:aload_0         
	// 10036 18726:getfield        #12  <Field azh a>
	// 10037 18729:astore_1        
		abyte0.cB = ((azh) (abyte0)).aU ^ a.cB;
	// 10038 18730:aload_1         
	// 10039 18731:aload_1         
	// 10040 18732:getfield        #399 <Field int azh.aU>
	// 10041 18735:aload_0         
	// 10042 18736:getfield        #12  <Field azh a>
	// 10043 18739:getfield        #182 <Field int azh.cB>
	// 10044 18742:ixor            
	// 10045 18743:putfield        #182 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 10046 18746:aload_0         
	// 10047 18747:getfield        #12  <Field azh a>
	// 10048 18750:astore_1        
		abyte0.n = ((azh) (abyte0)).cB ^ a.n;
	// 10049 18751:aload_1         
	// 10050 18752:aload_1         
	// 10051 18753:getfield        #182 <Field int azh.cB>
	// 10052 18756:aload_0         
	// 10053 18757:getfield        #12  <Field azh a>
	// 10054 18760:getfield        #417 <Field int azh.n>
	// 10055 18763:ixor            
	// 10056 18764:putfield        #417 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10057 18767:aload_0         
	// 10058 18768:getfield        #12  <Field azh a>
	// 10059 18771:astore_1        
		abyte0.G = ((azh) (abyte0)).n ^ a.G;
	// 10060 18772:aload_1         
	// 10061 18773:aload_1         
	// 10062 18774:getfield        #417 <Field int azh.n>
	// 10063 18777:aload_0         
	// 10064 18778:getfield        #12  <Field azh a>
	// 10065 18781:getfield        #564 <Field int azh.G>
	// 10066 18784:ixor            
	// 10067 18785:putfield        #564 <Field int azh.G>
		abyte0 = ((byte []) (a));
	// 10068 18788:aload_0         
	// 10069 18789:getfield        #12  <Field azh a>
	// 10070 18792:astore_1        
		abyte0.cL = ((azh) (abyte0)).G | a.cL;
	// 10071 18793:aload_1         
	// 10072 18794:aload_1         
	// 10073 18795:getfield        #564 <Field int azh.G>
	// 10074 18798:aload_0         
	// 10075 18799:getfield        #12  <Field azh a>
	// 10076 18802:getfield        #510 <Field int azh.cL>
	// 10077 18805:ior             
	// 10078 18806:putfield        #510 <Field int azh.cL>
		abyte0 = ((byte []) (a));
	// 10079 18809:aload_0         
	// 10080 18810:getfield        #12  <Field azh a>
	// 10081 18813:astore_1        
		abyte0.cL = ((azh) (abyte0)).bT ^ a.cL;
	// 10082 18814:aload_1         
	// 10083 18815:aload_1         
	// 10084 18816:getfield        #282 <Field int azh.bT>
	// 10085 18819:aload_0         
	// 10086 18820:getfield        #12  <Field azh a>
	// 10087 18823:getfield        #510 <Field int azh.cL>
	// 10088 18826:ixor            
	// 10089 18827:putfield        #510 <Field int azh.cL>
		abyte0 = ((byte []) (a));
	// 10090 18830:aload_0         
	// 10091 18831:getfield        #12  <Field azh a>
	// 10092 18834:astore_1        
		abyte0.L = ((azh) (abyte0)).cL ^ a.L;
	// 10093 18835:aload_1         
	// 10094 18836:aload_1         
	// 10095 18837:getfield        #510 <Field int azh.cL>
	// 10096 18840:aload_0         
	// 10097 18841:getfield        #12  <Field azh a>
	// 10098 18844:getfield        #567 <Field int azh.L>
	// 10099 18847:ixor            
	// 10100 18848:putfield        #567 <Field int azh.L>
		abyte0 = ((byte []) (a));
	// 10101 18851:aload_0         
	// 10102 18852:getfield        #12  <Field azh a>
	// 10103 18855:astore_1        
		abyte0.bH = ((azh) (abyte0)).G & ~a.bH;
	// 10104 18856:aload_1         
	// 10105 18857:aload_1         
	// 10106 18858:getfield        #564 <Field int azh.G>
	// 10107 18861:aload_0         
	// 10108 18862:getfield        #12  <Field azh a>
	// 10109 18865:getfield        #429 <Field int azh.bH>
	// 10110 18868:iconst_m1       
	// 10111 18869:ixor            
	// 10112 18870:iand            
	// 10113 18871:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10114 18874:aload_0         
	// 10115 18875:getfield        #12  <Field azh a>
	// 10116 18878:astore_1        
		abyte0.bH = ((azh) (abyte0)).g ^ a.bH;
	// 10117 18879:aload_1         
	// 10118 18880:aload_1         
	// 10119 18881:getfield        #95  <Field int azh.g>
	// 10120 18884:aload_0         
	// 10121 18885:getfield        #12  <Field azh a>
	// 10122 18888:getfield        #429 <Field int azh.bH>
	// 10123 18891:ixor            
	// 10124 18892:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10125 18895:aload_0         
	// 10126 18896:getfield        #12  <Field azh a>
	// 10127 18899:astore_1        
		abyte0.bH = ((azh) (abyte0)).ci & ~a.bH;
	// 10128 18900:aload_1         
	// 10129 18901:aload_1         
	// 10130 18902:getfield        #50  <Field int azh.ci>
	// 10131 18905:aload_0         
	// 10132 18906:getfield        #12  <Field azh a>
	// 10133 18909:getfield        #429 <Field int azh.bH>
	// 10134 18912:iconst_m1       
	// 10135 18913:ixor            
	// 10136 18914:iand            
	// 10137 18915:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10138 18918:aload_0         
	// 10139 18919:getfield        #12  <Field azh a>
	// 10140 18922:astore_1        
		abyte0.bW = ((azh) (abyte0)).G & a.bW;
	// 10141 18923:aload_1         
	// 10142 18924:aload_1         
	// 10143 18925:getfield        #564 <Field int azh.G>
	// 10144 18928:aload_0         
	// 10145 18929:getfield        #12  <Field azh a>
	// 10146 18932:getfield        #441 <Field int azh.bW>
	// 10147 18935:iand            
	// 10148 18936:putfield        #441 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 10149 18939:aload_0         
	// 10150 18940:getfield        #12  <Field azh a>
	// 10151 18943:astore_1        
		abyte0.bW = ((azh) (abyte0)).aB ^ a.bW;
	// 10152 18944:aload_1         
	// 10153 18945:aload_1         
	// 10154 18946:getfield        #435 <Field int azh.aB>
	// 10155 18949:aload_0         
	// 10156 18950:getfield        #12  <Field azh a>
	// 10157 18953:getfield        #441 <Field int azh.bW>
	// 10158 18956:ixor            
	// 10159 18957:putfield        #441 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 10160 18960:aload_0         
	// 10161 18961:getfield        #12  <Field azh a>
	// 10162 18964:astore_1        
		abyte0.bW = ((azh) (abyte0)).bW & ~a.ci;
	// 10163 18965:aload_1         
	// 10164 18966:aload_1         
	// 10165 18967:getfield        #441 <Field int azh.bW>
	// 10166 18970:aload_0         
	// 10167 18971:getfield        #12  <Field azh a>
	// 10168 18974:getfield        #50  <Field int azh.ci>
	// 10169 18977:iconst_m1       
	// 10170 18978:ixor            
	// 10171 18979:iand            
	// 10172 18980:putfield        #441 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 10173 18983:aload_0         
	// 10174 18984:getfield        #12  <Field azh a>
	// 10175 18987:astore_1        
		abyte0.cd = ((azh) (abyte0)).G & a.cd;
	// 10176 18988:aload_1         
	// 10177 18989:aload_1         
	// 10178 18990:getfield        #564 <Field int azh.G>
	// 10179 18993:aload_0         
	// 10180 18994:getfield        #12  <Field azh a>
	// 10181 18997:getfield        #426 <Field int azh.cd>
	// 10182 19000:iand            
	// 10183 19001:putfield        #426 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 10184 19004:aload_0         
	// 10185 19005:getfield        #12  <Field azh a>
	// 10186 19008:astore_1        
		abyte0.cd = ((azh) (abyte0)).ci | a.cd;
	// 10187 19009:aload_1         
	// 10188 19010:aload_1         
	// 10189 19011:getfield        #50  <Field int azh.ci>
	// 10190 19014:aload_0         
	// 10191 19015:getfield        #12  <Field azh a>
	// 10192 19018:getfield        #426 <Field int azh.cd>
	// 10193 19021:ior             
	// 10194 19022:putfield        #426 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 10195 19025:aload_0         
	// 10196 19026:getfield        #12  <Field azh a>
	// 10197 19029:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ | a.G;
	// 10198 19030:aload_1         
	// 10199 19031:aload_1         
	// 10200 19032:getfield        #474 <Field int azh.aZ>
	// 10201 19035:aload_0         
	// 10202 19036:getfield        #12  <Field azh a>
	// 10203 19039:getfield        #564 <Field int azh.G>
	// 10204 19042:ior             
	// 10205 19043:putfield        #474 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 10206 19046:aload_0         
	// 10207 19047:getfield        #12  <Field azh a>
	// 10208 19050:astore_1        
		abyte0.aZ = ((azh) (abyte0)).cn ^ a.aZ;
	// 10209 19051:aload_1         
	// 10210 19052:aload_1         
	// 10211 19053:getfield        #468 <Field int azh.cn>
	// 10212 19056:aload_0         
	// 10213 19057:getfield        #12  <Field azh a>
	// 10214 19060:getfield        #474 <Field int azh.aZ>
	// 10215 19063:ixor            
	// 10216 19064:putfield        #474 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 10217 19067:aload_0         
	// 10218 19068:getfield        #12  <Field azh a>
	// 10219 19071:astore_1        
		abyte0.aL = ((azh) (abyte0)).aZ ^ a.aL;
	// 10220 19072:aload_1         
	// 10221 19073:aload_1         
	// 10222 19074:getfield        #474 <Field int azh.aZ>
	// 10223 19077:aload_0         
	// 10224 19078:getfield        #12  <Field azh a>
	// 10225 19081:getfield        #288 <Field int azh.aL>
	// 10226 19084:ixor            
	// 10227 19085:putfield        #288 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 10228 19088:aload_0         
	// 10229 19089:getfield        #12  <Field azh a>
	// 10230 19092:astore_1        
		abyte0.aI = ((azh) (abyte0)).G & ~a.aI;
	// 10231 19093:aload_1         
	// 10232 19094:aload_1         
	// 10233 19095:getfield        #564 <Field int azh.G>
	// 10234 19098:aload_0         
	// 10235 19099:getfield        #12  <Field azh a>
	// 10236 19102:getfield        #146 <Field int azh.aI>
	// 10237 19105:iconst_m1       
	// 10238 19106:ixor            
	// 10239 19107:iand            
	// 10240 19108:putfield        #146 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 10241 19111:aload_0         
	// 10242 19112:getfield        #12  <Field azh a>
	// 10243 19115:astore_1        
		abyte0.aI = ((azh) (abyte0)).d ^ a.aI;
	// 10244 19116:aload_1         
	// 10245 19117:aload_1         
	// 10246 19118:getfield        #140 <Field int azh.d>
	// 10247 19121:aload_0         
	// 10248 19122:getfield        #12  <Field azh a>
	// 10249 19125:getfield        #146 <Field int azh.aI>
	// 10250 19128:ixor            
	// 10251 19129:putfield        #146 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 10252 19132:aload_0         
	// 10253 19133:getfield        #12  <Field azh a>
	// 10254 19136:astore_1        
		abyte0.bW = ((azh) (abyte0)).aI ^ a.bW;
	// 10255 19137:aload_1         
	// 10256 19138:aload_1         
	// 10257 19139:getfield        #146 <Field int azh.aI>
	// 10258 19142:aload_0         
	// 10259 19143:getfield        #12  <Field azh a>
	// 10260 19146:getfield        #441 <Field int azh.bW>
	// 10261 19149:ixor            
	// 10262 19150:putfield        #441 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 10263 19153:aload_0         
	// 10264 19154:getfield        #12  <Field azh a>
	// 10265 19157:astore_1        
		abyte0.aF = ((azh) (abyte0)).bW ^ a.aF;
	// 10266 19158:aload_1         
	// 10267 19159:aload_1         
	// 10268 19160:getfield        #441 <Field int azh.bW>
	// 10269 19163:aload_0         
	// 10270 19164:getfield        #12  <Field azh a>
	// 10271 19167:getfield        #199 <Field int azh.aF>
	// 10272 19170:ixor            
	// 10273 19171:putfield        #199 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 10274 19174:aload_0         
	// 10275 19175:getfield        #12  <Field azh a>
	// 10276 19178:astore_1        
		abyte0.aF = ~((azh) (abyte0)).aF;
	// 10277 19179:aload_1         
	// 10278 19180:aload_1         
	// 10279 19181:getfield        #199 <Field int azh.aF>
	// 10280 19184:iconst_m1       
	// 10281 19185:ixor            
	// 10282 19186:putfield        #199 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 10283 19189:aload_0         
	// 10284 19190:getfield        #12  <Field azh a>
	// 10285 19193:astore_1        
		abyte0.bH = ((azh) (abyte0)).aI ^ a.bH;
	// 10286 19194:aload_1         
	// 10287 19195:aload_1         
	// 10288 19196:getfield        #146 <Field int azh.aI>
	// 10289 19199:aload_0         
	// 10290 19200:getfield        #12  <Field azh a>
	// 10291 19203:getfield        #429 <Field int azh.bH>
	// 10292 19206:ixor            
	// 10293 19207:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10294 19210:aload_0         
	// 10295 19211:getfield        #12  <Field azh a>
	// 10296 19214:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH ^ a.F;
	// 10297 19215:aload_1         
	// 10298 19216:aload_1         
	// 10299 19217:getfield        #429 <Field int azh.bH>
	// 10300 19220:aload_0         
	// 10301 19221:getfield        #12  <Field azh a>
	// 10302 19224:getfield        #393 <Field int azh.F>
	// 10303 19227:ixor            
	// 10304 19228:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10305 19231:aload_0         
	// 10306 19232:getfield        #12  <Field azh a>
	// 10307 19235:astore_1        
		abyte0.bH = ~((azh) (abyte0)).bH;
	// 10308 19236:aload_1         
	// 10309 19237:aload_1         
	// 10310 19238:getfield        #429 <Field int azh.bH>
	// 10311 19241:iconst_m1       
	// 10312 19242:ixor            
	// 10313 19243:putfield        #429 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10314 19246:aload_0         
	// 10315 19247:getfield        #12  <Field azh a>
	// 10316 19250:astore_1        
		abyte0.ah = ((azh) (abyte0)).G & a.ah;
	// 10317 19251:aload_1         
	// 10318 19252:aload_1         
	// 10319 19253:getfield        #564 <Field int azh.G>
	// 10320 19256:aload_0         
	// 10321 19257:getfield        #12  <Field azh a>
	// 10322 19260:getfield        #447 <Field int azh.ah>
	// 10323 19263:iand            
	// 10324 19264:putfield        #447 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 10325 19267:aload_0         
	// 10326 19268:getfield        #12  <Field azh a>
	// 10327 19271:astore_1        
		abyte0.ah = ((azh) (abyte0)).cD ^ a.ah;
	// 10328 19272:aload_1         
	// 10329 19273:aload_1         
	// 10330 19274:getfield        #65  <Field int azh.cD>
	// 10331 19277:aload_0         
	// 10332 19278:getfield        #12  <Field azh a>
	// 10333 19281:getfield        #447 <Field int azh.ah>
	// 10334 19284:ixor            
	// 10335 19285:putfield        #447 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 10336 19288:aload_0         
	// 10337 19289:getfield        #12  <Field azh a>
	// 10338 19292:astore_1        
		abyte0.cd = ((azh) (abyte0)).ah ^ a.cd;
	// 10339 19293:aload_1         
	// 10340 19294:aload_1         
	// 10341 19295:getfield        #447 <Field int azh.ah>
	// 10342 19298:aload_0         
	// 10343 19299:getfield        #12  <Field azh a>
	// 10344 19302:getfield        #426 <Field int azh.cd>
	// 10345 19305:ixor            
	// 10346 19306:putfield        #426 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 10347 19309:aload_0         
	// 10348 19310:getfield        #12  <Field azh a>
	// 10349 19313:astore_1        
		abyte0.P = ((azh) (abyte0)).cd ^ a.P;
	// 10350 19314:aload_1         
	// 10351 19315:aload_1         
	// 10352 19316:getfield        #426 <Field int azh.cd>
	// 10353 19319:aload_0         
	// 10354 19320:getfield        #12  <Field azh a>
	// 10355 19323:getfield        #570 <Field int azh.P>
	// 10356 19326:ixor            
	// 10357 19327:putfield        #570 <Field int azh.P>
		abyte0 = ((byte []) (a));
	// 10358 19330:aload_0         
	// 10359 19331:getfield        #12  <Field azh a>
	// 10360 19334:astore_1        
		abyte0.ak = ((azh) (abyte0)).ak & ~a.G;
	// 10361 19335:aload_1         
	// 10362 19336:aload_1         
	// 10363 19337:getfield        #495 <Field int azh.ak>
	// 10364 19340:aload_0         
	// 10365 19341:getfield        #12  <Field azh a>
	// 10366 19344:getfield        #564 <Field int azh.G>
	// 10367 19347:iconst_m1       
	// 10368 19348:ixor            
	// 10369 19349:iand            
	// 10370 19350:putfield        #495 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 10371 19353:aload_0         
	// 10372 19354:getfield        #12  <Field azh a>
	// 10373 19357:astore_1        
		abyte0.ak = ((azh) (abyte0)).cH ^ a.ak;
	// 10374 19358:aload_1         
	// 10375 19359:aload_1         
	// 10376 19360:getfield        #498 <Field int azh.cH>
	// 10377 19363:aload_0         
	// 10378 19364:getfield        #12  <Field azh a>
	// 10379 19367:getfield        #495 <Field int azh.ak>
	// 10380 19370:ixor            
	// 10381 19371:putfield        #495 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 10382 19374:aload_0         
	// 10383 19375:getfield        #12  <Field azh a>
	// 10384 19378:astore_1        
		abyte0.ap = ((azh) (abyte0)).ak ^ a.ap;
	// 10385 19379:aload_1         
	// 10386 19380:aload_1         
	// 10387 19381:getfield        #495 <Field int azh.ak>
	// 10388 19384:aload_0         
	// 10389 19385:getfield        #12  <Field azh a>
	// 10390 19388:getfield        #573 <Field int azh.ap>
	// 10391 19391:ixor            
	// 10392 19392:putfield        #573 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10393 19395:aload_0         
	// 10394 19396:getfield        #12  <Field azh a>
	// 10395 19399:astore_1        
		abyte0.q = ((azh) (abyte0)).G & ~a.q;
	// 10396 19400:aload_1         
	// 10397 19401:aload_1         
	// 10398 19402:getfield        #564 <Field int azh.G>
	// 10399 19405:aload_0         
	// 10400 19406:getfield        #12  <Field azh a>
	// 10401 19409:getfield        #450 <Field int azh.q>
	// 10402 19412:iconst_m1       
	// 10403 19413:ixor            
	// 10404 19414:iand            
	// 10405 19415:putfield        #450 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 10406 19418:aload_0         
	// 10407 19419:getfield        #12  <Field azh a>
	// 10408 19422:astore_1        
		abyte0.q = ((azh) (abyte0)).by ^ a.q;
	// 10409 19423:aload_1         
	// 10410 19424:aload_1         
	// 10411 19425:getfield        #137 <Field int azh.by>
	// 10412 19428:aload_0         
	// 10413 19429:getfield        #12  <Field azh a>
	// 10414 19432:getfield        #450 <Field int azh.q>
	// 10415 19435:ixor            
	// 10416 19436:putfield        #450 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 10417 19439:aload_0         
	// 10418 19440:getfield        #12  <Field azh a>
	// 10419 19443:astore_1        
		abyte0.ci = ((azh) (abyte0)).q & ~a.ci;
	// 10420 19444:aload_1         
	// 10421 19445:aload_1         
	// 10422 19446:getfield        #450 <Field int azh.q>
	// 10423 19449:aload_0         
	// 10424 19450:getfield        #12  <Field azh a>
	// 10425 19453:getfield        #50  <Field int azh.ci>
	// 10426 19456:iconst_m1       
	// 10427 19457:ixor            
	// 10428 19458:iand            
	// 10429 19459:putfield        #50  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 10430 19462:aload_0         
	// 10431 19463:getfield        #12  <Field azh a>
	// 10432 19466:astore_1        
		abyte0.bV = ((azh) (abyte0)).G & ~a.bV;
	// 10433 19467:aload_1         
	// 10434 19468:aload_1         
	// 10435 19469:getfield        #564 <Field int azh.G>
	// 10436 19472:aload_0         
	// 10437 19473:getfield        #12  <Field azh a>
	// 10438 19476:getfield        #420 <Field int azh.bV>
	// 10439 19479:iconst_m1       
	// 10440 19480:ixor            
	// 10441 19481:iand            
	// 10442 19482:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10443 19485:aload_0         
	// 10444 19486:getfield        #12  <Field azh a>
	// 10445 19489:astore_1        
		abyte0.bV = ((azh) (abyte0)).aC ^ a.bV;
	// 10446 19490:aload_1         
	// 10447 19491:aload_1         
	// 10448 19492:getfield        #444 <Field int azh.aC>
	// 10449 19495:aload_0         
	// 10450 19496:getfield        #12  <Field azh a>
	// 10451 19499:getfield        #420 <Field int azh.bV>
	// 10452 19502:ixor            
	// 10453 19503:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10454 19506:aload_0         
	// 10455 19507:getfield        #12  <Field azh a>
	// 10456 19510:astore_1        
		abyte0.ci = ((azh) (abyte0)).bV ^ a.ci;
	// 10457 19511:aload_1         
	// 10458 19512:aload_1         
	// 10459 19513:getfield        #420 <Field int azh.bV>
	// 10460 19516:aload_0         
	// 10461 19517:getfield        #12  <Field azh a>
	// 10462 19520:getfield        #50  <Field int azh.ci>
	// 10463 19523:ixor            
	// 10464 19524:putfield        #50  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 10465 19527:aload_0         
	// 10466 19528:getfield        #12  <Field azh a>
	// 10467 19531:astore_1        
		abyte0.aG = ((azh) (abyte0)).ci ^ a.aG;
	// 10468 19532:aload_1         
	// 10469 19533:aload_1         
	// 10470 19534:getfield        #50  <Field int azh.ci>
	// 10471 19537:aload_0         
	// 10472 19538:getfield        #12  <Field azh a>
	// 10473 19541:getfield        #576 <Field int azh.aG>
	// 10474 19544:ixor            
	// 10475 19545:putfield        #576 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 10476 19548:aload_0         
	// 10477 19549:getfield        #12  <Field azh a>
	// 10478 19552:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.G;
	// 10479 19553:aload_1         
	// 10480 19554:aload_1         
	// 10481 19555:getfield        #339 <Field int azh.aX>
	// 10482 19558:aload_0         
	// 10483 19559:getfield        #12  <Field azh a>
	// 10484 19562:getfield        #564 <Field int azh.G>
	// 10485 19565:iconst_m1       
	// 10486 19566:ixor            
	// 10487 19567:iand            
	// 10488 19568:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10489 19571:aload_0         
	// 10490 19572:getfield        #12  <Field azh a>
	// 10491 19575:astore_1        
		abyte0.aX = ((azh) (abyte0)).at ^ a.aX;
	// 10492 19576:aload_1         
	// 10493 19577:aload_1         
	// 10494 19578:getfield        #327 <Field int azh.at>
	// 10495 19581:aload_0         
	// 10496 19582:getfield        #12  <Field azh a>
	// 10497 19585:getfield        #339 <Field int azh.aX>
	// 10498 19588:ixor            
	// 10499 19589:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10500 19592:aload_0         
	// 10501 19593:getfield        #12  <Field azh a>
	// 10502 19596:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX ^ a.p;
	// 10503 19597:aload_1         
	// 10504 19598:aload_1         
	// 10505 19599:getfield        #339 <Field int azh.aX>
	// 10506 19602:aload_0         
	// 10507 19603:getfield        #12  <Field azh a>
	// 10508 19606:getfield        #387 <Field int azh.p>
	// 10509 19609:ixor            
	// 10510 19610:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10511 19613:aload_0         
	// 10512 19614:getfield        #12  <Field azh a>
	// 10513 19617:astore_1        
		abyte0.aX = ~((azh) (abyte0)).aX;
	// 10514 19618:aload_1         
	// 10515 19619:aload_1         
	// 10516 19620:getfield        #339 <Field int azh.aX>
	// 10517 19623:iconst_m1       
	// 10518 19624:ixor            
	// 10519 19625:putfield        #339 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10520 19628:aload_0         
	// 10521 19629:getfield        #12  <Field azh a>
	// 10522 19632:astore_1        
		abyte0.cp = ((azh) (abyte0)).aj & a.cp;
	// 10523 19633:aload_1         
	// 10524 19634:aload_1         
	// 10525 19635:getfield        #372 <Field int azh.aj>
	// 10526 19638:aload_0         
	// 10527 19639:getfield        #12  <Field azh a>
	// 10528 19642:getfield        #396 <Field int azh.cp>
	// 10529 19645:iand            
	// 10530 19646:putfield        #396 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10531 19649:aload_0         
	// 10532 19650:getfield        #12  <Field azh a>
	// 10533 19653:astore_1        
		abyte0.cp = ((azh) (abyte0)).cE ^ a.cp;
	// 10534 19654:aload_1         
	// 10535 19655:aload_1         
	// 10536 19656:getfield        #414 <Field int azh.cE>
	// 10537 19659:aload_0         
	// 10538 19660:getfield        #12  <Field azh a>
	// 10539 19663:getfield        #396 <Field int azh.cp>
	// 10540 19666:ixor            
	// 10541 19667:putfield        #396 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10542 19670:aload_0         
	// 10543 19671:getfield        #12  <Field azh a>
	// 10544 19674:astore_1        
		abyte0.cE = ((azh) (abyte0)).cp & ~a.p;
	// 10545 19675:aload_1         
	// 10546 19676:aload_1         
	// 10547 19677:getfield        #396 <Field int azh.cp>
	// 10548 19680:aload_0         
	// 10549 19681:getfield        #12  <Field azh a>
	// 10550 19684:getfield        #387 <Field int azh.p>
	// 10551 19687:iconst_m1       
	// 10552 19688:ixor            
	// 10553 19689:iand            
	// 10554 19690:putfield        #414 <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 10555 19693:aload_0         
	// 10556 19694:getfield        #12  <Field azh a>
	// 10557 19697:astore_1        
		abyte0.cE = ((azh) (abyte0)).bG ^ a.cE;
	// 10558 19698:aload_1         
	// 10559 19699:aload_1         
	// 10560 19700:getfield        #378 <Field int azh.bG>
	// 10561 19703:aload_0         
	// 10562 19704:getfield        #12  <Field azh a>
	// 10563 19707:getfield        #414 <Field int azh.cE>
	// 10564 19710:ixor            
	// 10565 19711:putfield        #414 <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 10566 19714:aload_0         
	// 10567 19715:getfield        #12  <Field azh a>
	// 10568 19718:astore_1        
		abyte0.F = ((azh) (abyte0)).cE & ~a.F;
	// 10569 19719:aload_1         
	// 10570 19720:aload_1         
	// 10571 19721:getfield        #414 <Field int azh.cE>
	// 10572 19724:aload_0         
	// 10573 19725:getfield        #12  <Field azh a>
	// 10574 19728:getfield        #393 <Field int azh.F>
	// 10575 19731:iconst_m1       
	// 10576 19732:ixor            
	// 10577 19733:iand            
	// 10578 19734:putfield        #393 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 10579 19737:aload_0         
	// 10580 19738:getfield        #12  <Field azh a>
	// 10581 19741:astore_1        
		abyte0.cp = ((azh) (abyte0)).p | a.cp;
	// 10582 19742:aload_1         
	// 10583 19743:aload_1         
	// 10584 19744:getfield        #387 <Field int azh.p>
	// 10585 19747:aload_0         
	// 10586 19748:getfield        #12  <Field azh a>
	// 10587 19751:getfield        #396 <Field int azh.cp>
	// 10588 19754:ior             
	// 10589 19755:putfield        #396 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10590 19758:aload_0         
	// 10591 19759:getfield        #12  <Field azh a>
	// 10592 19762:astore_1        
		abyte0.cp = ((azh) (abyte0)).U ^ a.cp;
	// 10593 19763:aload_1         
	// 10594 19764:aload_1         
	// 10595 19765:getfield        #47  <Field int azh.U>
	// 10596 19768:aload_0         
	// 10597 19769:getfield        #12  <Field azh a>
	// 10598 19772:getfield        #396 <Field int azh.cp>
	// 10599 19775:ixor            
	// 10600 19776:putfield        #396 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10601 19779:aload_0         
	// 10602 19780:getfield        #12  <Field azh a>
	// 10603 19783:astore_1        
		abyte0.F = ((azh) (abyte0)).cp ^ a.F;
	// 10604 19784:aload_1         
	// 10605 19785:aload_1         
	// 10606 19786:getfield        #396 <Field int azh.cp>
	// 10607 19789:aload_0         
	// 10608 19790:getfield        #12  <Field azh a>
	// 10609 19793:getfield        #393 <Field int azh.F>
	// 10610 19796:ixor            
	// 10611 19797:putfield        #393 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 10612 19800:aload_0         
	// 10613 19801:getfield        #12  <Field azh a>
	// 10614 19804:astore_1        
		abyte0.aN = ((azh) (abyte0)).F ^ a.aN;
	// 10615 19805:aload_1         
	// 10616 19806:aload_1         
	// 10617 19807:getfield        #393 <Field int azh.F>
	// 10618 19810:aload_0         
	// 10619 19811:getfield        #12  <Field azh a>
	// 10620 19814:getfield        #29  <Field int azh.aN>
	// 10621 19817:ixor            
	// 10622 19818:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 10623 19821:aload_0         
	// 10624 19822:getfield        #12  <Field azh a>
	// 10625 19825:astore_1        
		abyte0.bK = ((azh) (abyte0)).aN ^ a.bK;
	// 10626 19826:aload_1         
	// 10627 19827:aload_1         
	// 10628 19828:getfield        #29  <Field int azh.aN>
	// 10629 19831:aload_0         
	// 10630 19832:getfield        #12  <Field azh a>
	// 10631 19835:getfield        #579 <Field int azh.bK>
	// 10632 19838:ixor            
	// 10633 19839:putfield        #579 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10634 19842:aload_0         
	// 10635 19843:getfield        #12  <Field azh a>
	// 10636 19846:astore_1        
		abyte0.aN = ((azh) (abyte0)).be & ~a.bK;
	// 10637 19847:aload_1         
	// 10638 19848:aload_1         
	// 10639 19849:getfield        #258 <Field int azh.be>
	// 10640 19852:aload_0         
	// 10641 19853:getfield        #12  <Field azh a>
	// 10642 19856:getfield        #579 <Field int azh.bK>
	// 10643 19859:iconst_m1       
	// 10644 19860:ixor            
	// 10645 19861:iand            
	// 10646 19862:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 10647 19865:aload_0         
	// 10648 19866:getfield        #12  <Field azh a>
	// 10649 19869:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR & ~a.bK;
	// 10650 19870:aload_1         
	// 10651 19871:aload_1         
	// 10652 19872:getfield        #26  <Field int azh.aR>
	// 10653 19875:aload_0         
	// 10654 19876:getfield        #12  <Field azh a>
	// 10655 19879:getfield        #579 <Field int azh.bK>
	// 10656 19882:iconst_m1       
	// 10657 19883:ixor            
	// 10658 19884:iand            
	// 10659 19885:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10660 19888:aload_0         
	// 10661 19889:getfield        #12  <Field azh a>
	// 10662 19892:astore_1        
		abyte0.aR = ((azh) (abyte0)).u ^ a.aR;
	// 10663 19893:aload_1         
	// 10664 19894:aload_1         
	// 10665 19895:getfield        #270 <Field int azh.u>
	// 10666 19898:aload_0         
	// 10667 19899:getfield        #12  <Field azh a>
	// 10668 19902:getfield        #26  <Field int azh.aR>
	// 10669 19905:ixor            
	// 10670 19906:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10671 19909:aload_0         
	// 10672 19910:getfield        #12  <Field azh a>
	// 10673 19913:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR & a.bs;
	// 10674 19914:aload_1         
	// 10675 19915:aload_1         
	// 10676 19916:getfield        #26  <Field int azh.aR>
	// 10677 19919:aload_0         
	// 10678 19920:getfield        #12  <Field azh a>
	// 10679 19923:getfield        #167 <Field int azh.bs>
	// 10680 19926:iand            
	// 10681 19927:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10682 19930:aload_0         
	// 10683 19931:getfield        #12  <Field azh a>
	// 10684 19934:astore_1        
		abyte0.F = ((azh) (abyte0)).aP & a.bK;
	// 10685 19935:aload_1         
	// 10686 19936:aload_1         
	// 10687 19937:getfield        #164 <Field int azh.aP>
	// 10688 19940:aload_0         
	// 10689 19941:getfield        #12  <Field azh a>
	// 10690 19944:getfield        #579 <Field int azh.bK>
	// 10691 19947:iand            
	// 10692 19948:putfield        #393 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 10693 19951:aload_0         
	// 10694 19952:getfield        #12  <Field azh a>
	// 10695 19955:astore_1        
		abyte0.cp = ((azh) (abyte0)).F & ~a.bs;
	// 10696 19956:aload_1         
	// 10697 19957:aload_1         
	// 10698 19958:getfield        #393 <Field int azh.F>
	// 10699 19961:aload_0         
	// 10700 19962:getfield        #12  <Field azh a>
	// 10701 19965:getfield        #167 <Field int azh.bs>
	// 10702 19968:iconst_m1       
	// 10703 19969:ixor            
	// 10704 19970:iand            
	// 10705 19971:putfield        #396 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10706 19974:aload_0         
	// 10707 19975:getfield        #12  <Field azh a>
	// 10708 19978:astore_1        
		abyte0.cp = ((azh) (abyte0)).be & a.cp;
	// 10709 19979:aload_1         
	// 10710 19980:aload_1         
	// 10711 19981:getfield        #258 <Field int azh.be>
	// 10712 19984:aload_0         
	// 10713 19985:getfield        #12  <Field azh a>
	// 10714 19988:getfield        #396 <Field int azh.cp>
	// 10715 19991:iand            
	// 10716 19992:putfield        #396 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10717 19995:aload_0         
	// 10718 19996:getfield        #12  <Field azh a>
	// 10719 19999:astore_1        
		abyte0.cp = ((azh) (abyte0)).bC & ~a.cp;
	// 10720 20000:aload_1         
	// 10721 20001:aload_1         
	// 10722 20002:getfield        #226 <Field int azh.bC>
	// 10723 20005:aload_0         
	// 10724 20006:getfield        #12  <Field azh a>
	// 10725 20009:getfield        #396 <Field int azh.cp>
	// 10726 20012:iconst_m1       
	// 10727 20013:ixor            
	// 10728 20014:iand            
	// 10729 20015:putfield        #396 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10730 20018:aload_0         
	// 10731 20019:getfield        #12  <Field azh a>
	// 10732 20022:astore_1        
		abyte0.U = ((azh) (abyte0)).C & ~a.bK;
	// 10733 20023:aload_1         
	// 10734 20024:aload_1         
	// 10735 20025:getfield        #35  <Field int azh.C>
	// 10736 20028:aload_0         
	// 10737 20029:getfield        #12  <Field azh a>
	// 10738 20032:getfield        #579 <Field int azh.bK>
	// 10739 20035:iconst_m1       
	// 10740 20036:ixor            
	// 10741 20037:iand            
	// 10742 20038:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 10743 20041:aload_0         
	// 10744 20042:getfield        #12  <Field azh a>
	// 10745 20045:astore_1        
		abyte0.U = ((azh) (abyte0)).u ^ a.U;
	// 10746 20046:aload_1         
	// 10747 20047:aload_1         
	// 10748 20048:getfield        #270 <Field int azh.u>
	// 10749 20051:aload_0         
	// 10750 20052:getfield        #12  <Field azh a>
	// 10751 20055:getfield        #47  <Field int azh.U>
	// 10752 20058:ixor            
	// 10753 20059:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 10754 20062:aload_0         
	// 10755 20063:getfield        #12  <Field azh a>
	// 10756 20066:astore_1        
		abyte0.p = ((azh) (abyte0)).bs | a.bK;
	// 10757 20067:aload_1         
	// 10758 20068:aload_1         
	// 10759 20069:getfield        #167 <Field int azh.bs>
	// 10760 20072:aload_0         
	// 10761 20073:getfield        #12  <Field azh a>
	// 10762 20076:getfield        #579 <Field int azh.bK>
	// 10763 20079:ior             
	// 10764 20080:putfield        #387 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 10765 20083:aload_0         
	// 10766 20084:getfield        #12  <Field azh a>
	// 10767 20087:astore_1        
		abyte0.cE = ((azh) (abyte0)).p & ~a.be;
	// 10768 20088:aload_1         
	// 10769 20089:aload_1         
	// 10770 20090:getfield        #387 <Field int azh.p>
	// 10771 20093:aload_0         
	// 10772 20094:getfield        #12  <Field azh a>
	// 10773 20097:getfield        #258 <Field int azh.be>
	// 10774 20100:iconst_m1       
	// 10775 20101:ixor            
	// 10776 20102:iand            
	// 10777 20103:putfield        #414 <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 10778 20106:aload_0         
	// 10779 20107:getfield        #12  <Field azh a>
	// 10780 20110:astore_1        
		abyte0.p = ((azh) (abyte0)).p | a.be;
	// 10781 20111:aload_1         
	// 10782 20112:aload_1         
	// 10783 20113:getfield        #387 <Field int azh.p>
	// 10784 20116:aload_0         
	// 10785 20117:getfield        #12  <Field azh a>
	// 10786 20120:getfield        #258 <Field int azh.be>
	// 10787 20123:ior             
	// 10788 20124:putfield        #387 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 10789 20127:aload_0         
	// 10790 20128:getfield        #12  <Field azh a>
	// 10791 20131:astore_1        
		abyte0.bG = ((azh) (abyte0)).u & ~a.bK;
	// 10792 20132:aload_1         
	// 10793 20133:aload_1         
	// 10794 20134:getfield        #270 <Field int azh.u>
	// 10795 20137:aload_0         
	// 10796 20138:getfield        #12  <Field azh a>
	// 10797 20141:getfield        #579 <Field int azh.bK>
	// 10798 20144:iconst_m1       
	// 10799 20145:ixor            
	// 10800 20146:iand            
	// 10801 20147:putfield        #378 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 10802 20150:aload_0         
	// 10803 20151:getfield        #12  <Field azh a>
	// 10804 20154:astore_1        
		abyte0.bG = ((azh) (abyte0)).ar ^ a.bG;
	// 10805 20155:aload_1         
	// 10806 20156:aload_1         
	// 10807 20157:getfield        #363 <Field int azh.ar>
	// 10808 20160:aload_0         
	// 10809 20161:getfield        #12  <Field azh a>
	// 10810 20164:getfield        #378 <Field int azh.bG>
	// 10811 20167:ixor            
	// 10812 20168:putfield        #378 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 10813 20171:aload_0         
	// 10814 20172:getfield        #12  <Field azh a>
	// 10815 20175:astore_1        
		abyte0.bG = ((azh) (abyte0)).bs & ~a.bG;
	// 10816 20176:aload_1         
	// 10817 20177:aload_1         
	// 10818 20178:getfield        #167 <Field int azh.bs>
	// 10819 20181:aload_0         
	// 10820 20182:getfield        #12  <Field azh a>
	// 10821 20185:getfield        #378 <Field int azh.bG>
	// 10822 20188:iconst_m1       
	// 10823 20189:ixor            
	// 10824 20190:iand            
	// 10825 20191:putfield        #378 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 10826 20194:aload_0         
	// 10827 20195:getfield        #12  <Field azh a>
	// 10828 20198:astore_1        
		abyte0.aj = ((azh) (abyte0)).m & ~a.bK;
	// 10829 20199:aload_1         
	// 10830 20200:aload_1         
	// 10831 20201:getfield        #369 <Field int azh.m>
	// 10832 20204:aload_0         
	// 10833 20205:getfield        #12  <Field azh a>
	// 10834 20208:getfield        #579 <Field int azh.bK>
	// 10835 20211:iconst_m1       
	// 10836 20212:ixor            
	// 10837 20213:iand            
	// 10838 20214:putfield        #372 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 10839 20217:aload_0         
	// 10840 20218:getfield        #12  <Field azh a>
	// 10841 20221:astore_1        
		abyte0.aj = ((azh) (abyte0)).u ^ a.aj;
	// 10842 20222:aload_1         
	// 10843 20223:aload_1         
	// 10844 20224:getfield        #270 <Field int azh.u>
	// 10845 20227:aload_0         
	// 10846 20228:getfield        #12  <Field azh a>
	// 10847 20231:getfield        #372 <Field int azh.aj>
	// 10848 20234:ixor            
	// 10849 20235:putfield        #372 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 10850 20238:aload_0         
	// 10851 20239:getfield        #12  <Field azh a>
	// 10852 20242:astore_1        
		abyte0.aj = ((azh) (abyte0)).bs | a.aj;
	// 10853 20243:aload_1         
	// 10854 20244:aload_1         
	// 10855 20245:getfield        #167 <Field int azh.bs>
	// 10856 20248:aload_0         
	// 10857 20249:getfield        #12  <Field azh a>
	// 10858 20252:getfield        #372 <Field int azh.aj>
	// 10859 20255:ior             
	// 10860 20256:putfield        #372 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 10861 20259:aload_0         
	// 10862 20260:getfield        #12  <Field azh a>
	// 10863 20263:astore_1        
		abyte0.aj = ((azh) (abyte0)).cc ^ a.aj;
	// 10864 20264:aload_1         
	// 10865 20265:aload_1         
	// 10866 20266:getfield        #300 <Field int azh.cc>
	// 10867 20269:aload_0         
	// 10868 20270:getfield        #12  <Field azh a>
	// 10869 20273:getfield        #372 <Field int azh.aj>
	// 10870 20276:ixor            
	// 10871 20277:putfield        #372 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 10872 20280:aload_0         
	// 10873 20281:getfield        #12  <Field azh a>
	// 10874 20284:astore_1        
		abyte0.aj = ((azh) (abyte0)).e & ~a.aj;
	// 10875 20285:aload_1         
	// 10876 20286:aload_1         
	// 10877 20287:getfield        #552 <Field int azh.e>
	// 10878 20290:aload_0         
	// 10879 20291:getfield        #12  <Field azh a>
	// 10880 20294:getfield        #372 <Field int azh.aj>
	// 10881 20297:iconst_m1       
	// 10882 20298:ixor            
	// 10883 20299:iand            
	// 10884 20300:putfield        #372 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 10885 20303:aload_0         
	// 10886 20304:getfield        #12  <Field azh a>
	// 10887 20307:astore_1        
		abyte0.at = ((azh) (abyte0)).bK | a.u;
	// 10888 20308:aload_1         
	// 10889 20309:aload_1         
	// 10890 20310:getfield        #579 <Field int azh.bK>
	// 10891 20313:aload_0         
	// 10892 20314:getfield        #12  <Field azh a>
	// 10893 20317:getfield        #270 <Field int azh.u>
	// 10894 20320:ior             
	// 10895 20321:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10896 20324:aload_0         
	// 10897 20325:getfield        #12  <Field azh a>
	// 10898 20328:astore_1        
		abyte0.at = ((azh) (abyte0)).cc ^ a.at;
	// 10899 20329:aload_1         
	// 10900 20330:aload_1         
	// 10901 20331:getfield        #300 <Field int azh.cc>
	// 10902 20334:aload_0         
	// 10903 20335:getfield        #12  <Field azh a>
	// 10904 20338:getfield        #327 <Field int azh.at>
	// 10905 20341:ixor            
	// 10906 20342:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10907 20345:aload_0         
	// 10908 20346:getfield        #12  <Field azh a>
	// 10909 20349:astore_1        
		abyte0.ci = ((azh) (abyte0)).at & ~a.bs;
	// 10910 20350:aload_1         
	// 10911 20351:aload_1         
	// 10912 20352:getfield        #327 <Field int azh.at>
	// 10913 20355:aload_0         
	// 10914 20356:getfield        #12  <Field azh a>
	// 10915 20359:getfield        #167 <Field int azh.bs>
	// 10916 20362:iconst_m1       
	// 10917 20363:ixor            
	// 10918 20364:iand            
	// 10919 20365:putfield        #50  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 10920 20368:aload_0         
	// 10921 20369:getfield        #12  <Field azh a>
	// 10922 20372:astore_1        
		abyte0.ci = ((azh) (abyte0)).U ^ a.ci;
	// 10923 20373:aload_1         
	// 10924 20374:aload_1         
	// 10925 20375:getfield        #47  <Field int azh.U>
	// 10926 20378:aload_0         
	// 10927 20379:getfield        #12  <Field azh a>
	// 10928 20382:getfield        #50  <Field int azh.ci>
	// 10929 20385:ixor            
	// 10930 20386:putfield        #50  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 10931 20389:aload_0         
	// 10932 20390:getfield        #12  <Field azh a>
	// 10933 20393:astore_1        
		abyte0.aR = ((azh) (abyte0)).at ^ a.aR;
	// 10934 20394:aload_1         
	// 10935 20395:aload_1         
	// 10936 20396:getfield        #327 <Field int azh.at>
	// 10937 20399:aload_0         
	// 10938 20400:getfield        #12  <Field azh a>
	// 10939 20403:getfield        #26  <Field int azh.aR>
	// 10940 20406:ixor            
	// 10941 20407:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10942 20410:aload_0         
	// 10943 20411:getfield        #12  <Field azh a>
	// 10944 20414:astore_1        
		abyte0.aj = ((azh) (abyte0)).aR ^ a.aj;
	// 10945 20415:aload_1         
	// 10946 20416:aload_1         
	// 10947 20417:getfield        #26  <Field int azh.aR>
	// 10948 20420:aload_0         
	// 10949 20421:getfield        #12  <Field azh a>
	// 10950 20424:getfield        #372 <Field int azh.aj>
	// 10951 20427:ixor            
	// 10952 20428:putfield        #372 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 10953 20431:aload_0         
	// 10954 20432:getfield        #12  <Field azh a>
	// 10955 20435:astore_1        
		abyte0.aR = ((azh) (abyte0)).aP & ~a.bK;
	// 10956 20436:aload_1         
	// 10957 20437:aload_1         
	// 10958 20438:getfield        #164 <Field int azh.aP>
	// 10959 20441:aload_0         
	// 10960 20442:getfield        #12  <Field azh a>
	// 10961 20445:getfield        #579 <Field int azh.bK>
	// 10962 20448:iconst_m1       
	// 10963 20449:ixor            
	// 10964 20450:iand            
	// 10965 20451:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10966 20454:aload_0         
	// 10967 20455:getfield        #12  <Field azh a>
	// 10968 20458:astore_1        
		abyte0.at = ((azh) (abyte0)).aR & ~a.bs;
	// 10969 20459:aload_1         
	// 10970 20460:aload_1         
	// 10971 20461:getfield        #26  <Field int azh.aR>
	// 10972 20464:aload_0         
	// 10973 20465:getfield        #12  <Field azh a>
	// 10974 20468:getfield        #167 <Field int azh.bs>
	// 10975 20471:iconst_m1       
	// 10976 20472:ixor            
	// 10977 20473:iand            
	// 10978 20474:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10979 20477:aload_0         
	// 10980 20478:getfield        #12  <Field azh a>
	// 10981 20481:astore_1        
		abyte0.at = ((azh) (abyte0)).F ^ a.at;
	// 10982 20482:aload_1         
	// 10983 20483:aload_1         
	// 10984 20484:getfield        #393 <Field int azh.F>
	// 10985 20487:aload_0         
	// 10986 20488:getfield        #12  <Field azh a>
	// 10987 20491:getfield        #327 <Field int azh.at>
	// 10988 20494:ixor            
	// 10989 20495:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10990 20498:aload_0         
	// 10991 20499:getfield        #12  <Field azh a>
	// 10992 20502:astore_1        
		abyte0.aN = ((azh) (abyte0)).at ^ a.aN;
	// 10993 20503:aload_1         
	// 10994 20504:aload_1         
	// 10995 20505:getfield        #327 <Field int azh.at>
	// 10996 20508:aload_0         
	// 10997 20509:getfield        #12  <Field azh a>
	// 10998 20512:getfield        #29  <Field int azh.aN>
	// 10999 20515:ixor            
	// 11000 20516:putfield        #29  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 11001 20519:aload_0         
	// 11002 20520:getfield        #12  <Field azh a>
	// 11003 20523:astore_1        
		abyte0.at = ((azh) (abyte0)).be & a.aR;
	// 11004 20524:aload_1         
	// 11005 20525:aload_1         
	// 11006 20526:getfield        #258 <Field int azh.be>
	// 11007 20529:aload_0         
	// 11008 20530:getfield        #12  <Field azh a>
	// 11009 20533:getfield        #26  <Field int azh.aR>
	// 11010 20536:iand            
	// 11011 20537:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 11012 20540:aload_0         
	// 11013 20541:getfield        #12  <Field azh a>
	// 11014 20544:astore_1        
		abyte0.U = ((azh) (abyte0)).aR & ~a.bs;
	// 11015 20545:aload_1         
	// 11016 20546:aload_1         
	// 11017 20547:getfield        #26  <Field int azh.aR>
	// 11018 20550:aload_0         
	// 11019 20551:getfield        #12  <Field azh a>
	// 11020 20554:getfield        #167 <Field int azh.bs>
	// 11021 20557:iconst_m1       
	// 11022 20558:ixor            
	// 11023 20559:iand            
	// 11024 20560:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11025 20563:aload_0         
	// 11026 20564:getfield        #12  <Field azh a>
	// 11027 20567:astore_1        
		abyte0.cC = ((azh) (abyte0)).U ^ a.cC;
	// 11028 20568:aload_1         
	// 11029 20569:aload_1         
	// 11030 20570:getfield        #47  <Field int azh.U>
	// 11031 20573:aload_0         
	// 11032 20574:getfield        #12  <Field azh a>
	// 11033 20577:getfield        #241 <Field int azh.cC>
	// 11034 20580:ixor            
	// 11035 20581:putfield        #241 <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 11036 20584:aload_0         
	// 11037 20585:getfield        #12  <Field azh a>
	// 11038 20588:astore_1        
		abyte0.cC = ((azh) (abyte0)).bC & a.cC;
	// 11039 20589:aload_1         
	// 11040 20590:aload_1         
	// 11041 20591:getfield        #226 <Field int azh.bC>
	// 11042 20594:aload_0         
	// 11043 20595:getfield        #12  <Field azh a>
	// 11044 20598:getfield        #241 <Field int azh.cC>
	// 11045 20601:iand            
	// 11046 20602:putfield        #241 <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 11047 20605:aload_0         
	// 11048 20606:getfield        #12  <Field azh a>
	// 11049 20609:astore_1        
		abyte0.cC = ((azh) (abyte0)).cE ^ a.cC;
	// 11050 20610:aload_1         
	// 11051 20611:aload_1         
	// 11052 20612:getfield        #414 <Field int azh.cE>
	// 11053 20615:aload_0         
	// 11054 20616:getfield        #12  <Field azh a>
	// 11055 20619:getfield        #241 <Field int azh.cC>
	// 11056 20622:ixor            
	// 11057 20623:putfield        #241 <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 11058 20626:aload_0         
	// 11059 20627:getfield        #12  <Field azh a>
	// 11060 20630:astore_1        
		abyte0.cC = ((azh) (abyte0)).cC & ~a.am;
	// 11061 20631:aload_1         
	// 11062 20632:aload_1         
	// 11063 20633:getfield        #241 <Field int azh.cC>
	// 11064 20636:aload_0         
	// 11065 20637:getfield        #12  <Field azh a>
	// 11066 20640:getfield        #131 <Field int azh.am>
	// 11067 20643:iconst_m1       
	// 11068 20644:ixor            
	// 11069 20645:iand            
	// 11070 20646:putfield        #241 <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 11071 20649:aload_0         
	// 11072 20650:getfield        #12  <Field azh a>
	// 11073 20653:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR ^ a.bs;
	// 11074 20654:aload_1         
	// 11075 20655:aload_1         
	// 11076 20656:getfield        #26  <Field int azh.aR>
	// 11077 20659:aload_0         
	// 11078 20660:getfield        #12  <Field azh a>
	// 11079 20663:getfield        #167 <Field int azh.bs>
	// 11080 20666:ixor            
	// 11081 20667:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11082 20670:aload_0         
	// 11083 20671:getfield        #12  <Field azh a>
	// 11084 20674:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR ^ a.be;
	// 11085 20675:aload_1         
	// 11086 20676:aload_1         
	// 11087 20677:getfield        #26  <Field int azh.aR>
	// 11088 20680:aload_0         
	// 11089 20681:getfield        #12  <Field azh a>
	// 11090 20684:getfield        #258 <Field int azh.be>
	// 11091 20687:ixor            
	// 11092 20688:putfield        #26  <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11093 20691:aload_0         
	// 11094 20692:getfield        #12  <Field azh a>
	// 11095 20695:astore_1        
		abyte0.cE = ((azh) (abyte0)).bK | a.cc;
	// 11096 20696:aload_1         
	// 11097 20697:aload_1         
	// 11098 20698:getfield        #579 <Field int azh.bK>
	// 11099 20701:aload_0         
	// 11100 20702:getfield        #12  <Field azh a>
	// 11101 20705:getfield        #300 <Field int azh.cc>
	// 11102 20708:ior             
	// 11103 20709:putfield        #414 <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 11104 20712:aload_0         
	// 11105 20713:getfield        #12  <Field azh a>
	// 11106 20716:astore_1        
		abyte0.cE = ((azh) (abyte0)).u ^ a.cE;
	// 11107 20717:aload_1         
	// 11108 20718:aload_1         
	// 11109 20719:getfield        #270 <Field int azh.u>
	// 11110 20722:aload_0         
	// 11111 20723:getfield        #12  <Field azh a>
	// 11112 20726:getfield        #414 <Field int azh.cE>
	// 11113 20729:ixor            
	// 11114 20730:putfield        #414 <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 11115 20733:aload_0         
	// 11116 20734:getfield        #12  <Field azh a>
	// 11117 20737:astore_1        
		abyte0.U = ((azh) (abyte0)).bK | a.u;
	// 11118 20738:aload_1         
	// 11119 20739:aload_1         
	// 11120 20740:getfield        #579 <Field int azh.bK>
	// 11121 20743:aload_0         
	// 11122 20744:getfield        #12  <Field azh a>
	// 11123 20747:getfield        #270 <Field int azh.u>
	// 11124 20750:ior             
	// 11125 20751:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11126 20754:aload_0         
	// 11127 20755:getfield        #12  <Field azh a>
	// 11128 20758:astore_1        
		abyte0.U = ((azh) (abyte0)).K ^ a.U;
	// 11129 20759:aload_1         
	// 11130 20760:aload_1         
	// 11131 20761:getfield        #357 <Field int azh.K>
	// 11132 20764:aload_0         
	// 11133 20765:getfield        #12  <Field azh a>
	// 11134 20768:getfield        #47  <Field int azh.U>
	// 11135 20771:ixor            
	// 11136 20772:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11137 20775:aload_0         
	// 11138 20776:getfield        #12  <Field azh a>
	// 11139 20779:astore_1        
		abyte0.U = ((azh) (abyte0)).U & ~a.bs;
	// 11140 20780:aload_1         
	// 11141 20781:aload_1         
	// 11142 20782:getfield        #47  <Field int azh.U>
	// 11143 20785:aload_0         
	// 11144 20786:getfield        #12  <Field azh a>
	// 11145 20789:getfield        #167 <Field int azh.bs>
	// 11146 20792:iconst_m1       
	// 11147 20793:ixor            
	// 11148 20794:iand            
	// 11149 20795:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11150 20798:aload_0         
	// 11151 20799:getfield        #12  <Field azh a>
	// 11152 20802:astore_1        
		abyte0.bV = ((azh) (abyte0)).bK | a.m;
	// 11153 20803:aload_1         
	// 11154 20804:aload_1         
	// 11155 20805:getfield        #579 <Field int azh.bK>
	// 11156 20808:aload_0         
	// 11157 20809:getfield        #12  <Field azh a>
	// 11158 20812:getfield        #369 <Field int azh.m>
	// 11159 20815:ior             
	// 11160 20816:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11161 20819:aload_0         
	// 11162 20820:getfield        #12  <Field azh a>
	// 11163 20823:astore_1        
		abyte0.bV = ((azh) (abyte0)).u ^ a.bV;
	// 11164 20824:aload_1         
	// 11165 20825:aload_1         
	// 11166 20826:getfield        #270 <Field int azh.u>
	// 11167 20829:aload_0         
	// 11168 20830:getfield        #12  <Field azh a>
	// 11169 20833:getfield        #420 <Field int azh.bV>
	// 11170 20836:ixor            
	// 11171 20837:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11172 20840:aload_0         
	// 11173 20841:getfield        #12  <Field azh a>
	// 11174 20844:astore_1        
		abyte0.bV = ((azh) (abyte0)).bs & ~a.bV;
	// 11175 20845:aload_1         
	// 11176 20846:aload_1         
	// 11177 20847:getfield        #167 <Field int azh.bs>
	// 11178 20850:aload_0         
	// 11179 20851:getfield        #12  <Field azh a>
	// 11180 20854:getfield        #420 <Field int azh.bV>
	// 11181 20857:iconst_m1       
	// 11182 20858:ixor            
	// 11183 20859:iand            
	// 11184 20860:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11185 20863:aload_0         
	// 11186 20864:getfield        #12  <Field azh a>
	// 11187 20867:astore_1        
		abyte0.bV = ((azh) (abyte0)).cc ^ a.bV;
	// 11188 20868:aload_1         
	// 11189 20869:aload_1         
	// 11190 20870:getfield        #300 <Field int azh.cc>
	// 11191 20873:aload_0         
	// 11192 20874:getfield        #12  <Field azh a>
	// 11193 20877:getfield        #420 <Field int azh.bV>
	// 11194 20880:ixor            
	// 11195 20881:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11196 20884:aload_0         
	// 11197 20885:getfield        #12  <Field azh a>
	// 11198 20888:astore_1        
		abyte0.bV = ((azh) (abyte0)).e & a.bV;
	// 11199 20889:aload_1         
	// 11200 20890:aload_1         
	// 11201 20891:getfield        #552 <Field int azh.e>
	// 11202 20894:aload_0         
	// 11203 20895:getfield        #12  <Field azh a>
	// 11204 20898:getfield        #420 <Field int azh.bV>
	// 11205 20901:iand            
	// 11206 20902:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11207 20905:aload_0         
	// 11208 20906:getfield        #12  <Field azh a>
	// 11209 20909:astore_1        
		abyte0.aC = ((azh) (abyte0)).bK & ~a.bs;
	// 11210 20910:aload_1         
	// 11211 20911:aload_1         
	// 11212 20912:getfield        #579 <Field int azh.bK>
	// 11213 20915:aload_0         
	// 11214 20916:getfield        #12  <Field azh a>
	// 11215 20919:getfield        #167 <Field int azh.bs>
	// 11216 20922:iconst_m1       
	// 11217 20923:ixor            
	// 11218 20924:iand            
	// 11219 20925:putfield        #444 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 11220 20928:aload_0         
	// 11221 20929:getfield        #12  <Field azh a>
	// 11222 20932:astore_1        
		abyte0.aC = ((azh) (abyte0)).F ^ a.aC;
	// 11223 20933:aload_1         
	// 11224 20934:aload_1         
	// 11225 20935:getfield        #393 <Field int azh.F>
	// 11226 20938:aload_0         
	// 11227 20939:getfield        #12  <Field azh a>
	// 11228 20942:getfield        #444 <Field int azh.aC>
	// 11229 20945:ixor            
	// 11230 20946:putfield        #444 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 11231 20949:aload_0         
	// 11232 20950:getfield        #12  <Field azh a>
	// 11233 20953:astore_1        
		abyte0.K = ((azh) (abyte0)).K & ~a.bK;
	// 11234 20954:aload_1         
	// 11235 20955:aload_1         
	// 11236 20956:getfield        #357 <Field int azh.K>
	// 11237 20959:aload_0         
	// 11238 20960:getfield        #12  <Field azh a>
	// 11239 20963:getfield        #579 <Field int azh.bK>
	// 11240 20966:iconst_m1       
	// 11241 20967:ixor            
	// 11242 20968:iand            
	// 11243 20969:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 11244 20972:aload_0         
	// 11245 20973:getfield        #12  <Field azh a>
	// 11246 20976:astore_1        
		abyte0.K = ((azh) (abyte0)).bs | a.K;
	// 11247 20977:aload_1         
	// 11248 20978:aload_1         
	// 11249 20979:getfield        #167 <Field int azh.bs>
	// 11250 20982:aload_0         
	// 11251 20983:getfield        #12  <Field azh a>
	// 11252 20986:getfield        #357 <Field int azh.K>
	// 11253 20989:ior             
	// 11254 20990:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 11255 20993:aload_0         
	// 11256 20994:getfield        #12  <Field azh a>
	// 11257 20997:astore_1        
		abyte0.K = ((azh) (abyte0)).cE ^ a.K;
	// 11258 20998:aload_1         
	// 11259 20999:aload_1         
	// 11260 21000:getfield        #414 <Field int azh.cE>
	// 11261 21003:aload_0         
	// 11262 21004:getfield        #12  <Field azh a>
	// 11263 21007:getfield        #357 <Field int azh.K>
	// 11264 21010:ixor            
	// 11265 21011:putfield        #357 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 11266 21014:aload_0         
	// 11267 21015:getfield        #12  <Field azh a>
	// 11268 21018:astore_1        
		abyte0.bV = ((azh) (abyte0)).K ^ a.bV;
	// 11269 21019:aload_1         
	// 11270 21020:aload_1         
	// 11271 21021:getfield        #357 <Field int azh.K>
	// 11272 21024:aload_0         
	// 11273 21025:getfield        #12  <Field azh a>
	// 11274 21028:getfield        #420 <Field int azh.bV>
	// 11275 21031:ixor            
	// 11276 21032:putfield        #420 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11277 21035:aload_0         
	// 11278 21036:getfield        #12  <Field azh a>
	// 11279 21039:astore_1        
		abyte0.cc = ((azh) (abyte0)).bK | a.cc;
	// 11280 21040:aload_1         
	// 11281 21041:aload_1         
	// 11282 21042:getfield        #579 <Field int azh.bK>
	// 11283 21045:aload_0         
	// 11284 21046:getfield        #12  <Field azh a>
	// 11285 21049:getfield        #300 <Field int azh.cc>
	// 11286 21052:ior             
	// 11287 21053:putfield        #300 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 11288 21056:aload_0         
	// 11289 21057:getfield        #12  <Field azh a>
	// 11290 21060:astore_1        
		abyte0.cc = ((azh) (abyte0)).m ^ a.cc;
	// 11291 21061:aload_1         
	// 11292 21062:aload_1         
	// 11293 21063:getfield        #369 <Field int azh.m>
	// 11294 21066:aload_0         
	// 11295 21067:getfield        #12  <Field azh a>
	// 11296 21070:getfield        #300 <Field int azh.cc>
	// 11297 21073:ixor            
	// 11298 21074:putfield        #300 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 11299 21077:aload_0         
	// 11300 21078:getfield        #12  <Field azh a>
	// 11301 21081:astore_1        
		abyte0.U = ((azh) (abyte0)).cc ^ a.U;
	// 11302 21082:aload_1         
	// 11303 21083:aload_1         
	// 11304 21084:getfield        #300 <Field int azh.cc>
	// 11305 21087:aload_0         
	// 11306 21088:getfield        #12  <Field azh a>
	// 11307 21091:getfield        #47  <Field int azh.U>
	// 11308 21094:ixor            
	// 11309 21095:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11310 21098:aload_0         
	// 11311 21099:getfield        #12  <Field azh a>
	// 11312 21102:astore_1        
		abyte0.U = ((azh) (abyte0)).e & a.U;
	// 11313 21103:aload_1         
	// 11314 21104:aload_1         
	// 11315 21105:getfield        #552 <Field int azh.e>
	// 11316 21108:aload_0         
	// 11317 21109:getfield        #12  <Field azh a>
	// 11318 21112:getfield        #47  <Field int azh.U>
	// 11319 21115:iand            
	// 11320 21116:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11321 21119:aload_0         
	// 11322 21120:getfield        #12  <Field azh a>
	// 11323 21123:astore_1        
		abyte0.U = ((azh) (abyte0)).ci ^ a.U;
	// 11324 21124:aload_1         
	// 11325 21125:aload_1         
	// 11326 21126:getfield        #50  <Field int azh.ci>
	// 11327 21129:aload_0         
	// 11328 21130:getfield        #12  <Field azh a>
	// 11329 21133:getfield        #47  <Field int azh.U>
	// 11330 21136:ixor            
	// 11331 21137:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11332 21140:aload_0         
	// 11333 21141:getfield        #12  <Field azh a>
	// 11334 21144:astore_1        
		abyte0.ci = ((azh) (abyte0)).U & a.bu;
	// 11335 21145:aload_1         
	// 11336 21146:aload_1         
	// 11337 21147:getfield        #47  <Field int azh.U>
	// 11338 21150:aload_0         
	// 11339 21151:getfield        #12  <Field azh a>
	// 11340 21154:getfield        #179 <Field int azh.bu>
	// 11341 21157:iand            
	// 11342 21158:putfield        #50  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11343 21161:aload_0         
	// 11344 21162:getfield        #12  <Field azh a>
	// 11345 21165:astore_1        
		abyte0.ci = ((azh) (abyte0)).aj ^ a.ci;
	// 11346 21166:aload_1         
	// 11347 21167:aload_1         
	// 11348 21168:getfield        #372 <Field int azh.aj>
	// 11349 21171:aload_0         
	// 11350 21172:getfield        #12  <Field azh a>
	// 11351 21175:getfield        #50  <Field int azh.ci>
	// 11352 21178:ixor            
	// 11353 21179:putfield        #50  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11354 21182:aload_0         
	// 11355 21183:getfield        #12  <Field azh a>
	// 11356 21186:astore_1        
		abyte0.l = ((azh) (abyte0)).ci ^ a.l;
	// 11357 21187:aload_1         
	// 11358 21188:aload_1         
	// 11359 21189:getfield        #50  <Field int azh.ci>
	// 11360 21192:aload_0         
	// 11361 21193:getfield        #12  <Field azh a>
	// 11362 21196:getfield        #582 <Field int azh.l>
	// 11363 21199:ixor            
	// 11364 21200:putfield        #582 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 11365 21203:aload_0         
	// 11366 21204:getfield        #12  <Field azh a>
	// 11367 21207:astore_1        
		abyte0.U = ((azh) (abyte0)).bu | a.U;
	// 11368 21208:aload_1         
	// 11369 21209:aload_1         
	// 11370 21210:getfield        #179 <Field int azh.bu>
	// 11371 21213:aload_0         
	// 11372 21214:getfield        #12  <Field azh a>
	// 11373 21217:getfield        #47  <Field int azh.U>
	// 11374 21220:ior             
	// 11375 21221:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11376 21224:aload_0         
	// 11377 21225:getfield        #12  <Field azh a>
	// 11378 21228:astore_1        
		abyte0.U = ((azh) (abyte0)).aj ^ a.U;
	// 11379 21229:aload_1         
	// 11380 21230:aload_1         
	// 11381 21231:getfield        #372 <Field int azh.aj>
	// 11382 21234:aload_0         
	// 11383 21235:getfield        #12  <Field azh a>
	// 11384 21238:getfield        #47  <Field int azh.U>
	// 11385 21241:ixor            
	// 11386 21242:putfield        #47  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11387 21245:aload_0         
	// 11388 21246:getfield        #12  <Field azh a>
	// 11389 21249:astore_1        
		abyte0.aT = ((azh) (abyte0)).U ^ a.aT;
	// 11390 21250:aload_1         
	// 11391 21251:aload_1         
	// 11392 21252:getfield        #47  <Field int azh.U>
	// 11393 21255:aload_0         
	// 11394 21256:getfield        #12  <Field azh a>
	// 11395 21259:getfield        #194 <Field int azh.aT>
	// 11396 21262:ixor            
	// 11397 21263:putfield        #194 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 11398 21266:aload_0         
	// 11399 21267:getfield        #12  <Field azh a>
	// 11400 21270:astore_1        
		abyte0.bG = ((azh) (abyte0)).cc ^ a.bG;
	// 11401 21271:aload_1         
	// 11402 21272:aload_1         
	// 11403 21273:getfield        #300 <Field int azh.cc>
	// 11404 21276:aload_0         
	// 11405 21277:getfield        #12  <Field azh a>
	// 11406 21280:getfield        #378 <Field int azh.bG>
	// 11407 21283:ixor            
	// 11408 21284:putfield        #378 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 11409 21287:aload_0         
	// 11410 21288:getfield        #12  <Field azh a>
	// 11411 21291:astore_1        
		abyte0.bG = ((azh) (abyte0)).e & ~a.bG;
	// 11412 21292:aload_1         
	// 11413 21293:aload_1         
	// 11414 21294:getfield        #552 <Field int azh.e>
	// 11415 21297:aload_0         
	// 11416 21298:getfield        #12  <Field azh a>
	// 11417 21301:getfield        #378 <Field int azh.bG>
	// 11418 21304:iconst_m1       
	// 11419 21305:ixor            
	// 11420 21306:iand            
	// 11421 21307:putfield        #378 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 11422 21310:aload_0         
	// 11423 21311:getfield        #12  <Field azh a>
	// 11424 21314:astore_1        
		abyte0.cc = ((azh) (abyte0)).bs | a.bK;
	// 11425 21315:aload_1         
	// 11426 21316:aload_1         
	// 11427 21317:getfield        #167 <Field int azh.bs>
	// 11428 21320:aload_0         
	// 11429 21321:getfield        #12  <Field azh a>
	// 11430 21324:getfield        #579 <Field int azh.bK>
	// 11431 21327:ior             
	// 11432 21328:putfield        #300 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 11433 21331:aload_0         
	// 11434 21332:getfield        #12  <Field azh a>
	// 11435 21335:astore_1        
		abyte0.U = ~((azh) (abyte0)).bK;
	// 11436 21336:aload_1         
	// 11437 21337:aload_1         
	// 11438 21338:getfield        #579 <Field int azh.bK>
	// 11439 21341:iconst_m1       
	// 11440 21342:ixor            
	// 11441 21343:putfield        #47  <Field int azh.U>
	// 11442 21346:return          
	}

	private final azh a;
}
