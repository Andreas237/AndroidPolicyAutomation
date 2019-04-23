// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azu
	implements azk
{

	private azu(azh azh1)
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

	azu(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azu(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.ck = ((azh) (abyte0)).bD ^ a.ck;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.bD>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.ck>
	//    9   17:ixor            
	//   10   18:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field azh a>
	//   13   25:astore_1        
		abyte0.ck = ((azh) (abyte0)).ak & ~a.ck;
	//   14   26:aload_1         
	//   15   27:aload_1         
	//   16   28:getfield        #32  <Field int azh.ak>
	//   17   31:aload_0         
	//   18   32:getfield        #12  <Field azh a>
	//   19   35:getfield        #29  <Field int azh.ck>
	//   20   38:iconst_m1       
	//   21   39:ixor            
	//   22   40:iand            
	//   23   41:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//   24   44:aload_0         
	//   25   45:getfield        #12  <Field azh a>
	//   26   48:astore_1        
		abyte0.aS = ((azh) (abyte0)).aU ^ a.aS;
	//   27   49:aload_1         
	//   28   50:aload_1         
	//   29   51:getfield        #35  <Field int azh.aU>
	//   30   54:aload_0         
	//   31   55:getfield        #12  <Field azh a>
	//   32   58:getfield        #38  <Field int azh.aS>
	//   33   61:ixor            
	//   34   62:putfield        #38  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//   35   65:aload_0         
	//   36   66:getfield        #12  <Field azh a>
	//   37   69:astore_1        
		abyte0.ci = ((azh) (abyte0)).aS ^ a.ci;
	//   38   70:aload_1         
	//   39   71:aload_1         
	//   40   72:getfield        #38  <Field int azh.aS>
	//   41   75:aload_0         
	//   42   76:getfield        #12  <Field azh a>
	//   43   79:getfield        #41  <Field int azh.ci>
	//   44   82:ixor            
	//   45   83:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//   46   86:aload_0         
	//   47   87:getfield        #12  <Field azh a>
	//   48   90:astore_1        
		abyte0.aq = ((azh) (abyte0)).ci ^ a.aq;
	//   49   91:aload_1         
	//   50   92:aload_1         
	//   51   93:getfield        #41  <Field int azh.ci>
	//   52   96:aload_0         
	//   53   97:getfield        #12  <Field azh a>
	//   54  100:getfield        #44  <Field int azh.aq>
	//   55  103:ixor            
	//   56  104:putfield        #44  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	//   57  107:aload_0         
	//   58  108:getfield        #12  <Field azh a>
	//   59  111:astore_1        
		abyte0.ck = ((azh) (abyte0)).aq ^ a.ck;
	//   60  112:aload_1         
	//   61  113:aload_1         
	//   62  114:getfield        #44  <Field int azh.aq>
	//   63  117:aload_0         
	//   64  118:getfield        #12  <Field azh a>
	//   65  121:getfield        #29  <Field int azh.ck>
	//   66  124:ixor            
	//   67  125:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//   68  128:aload_0         
	//   69  129:getfield        #12  <Field azh a>
	//   70  132:astore_1        
		abyte0.aG = ((azh) (abyte0)).ck ^ a.aG;
	//   71  133:aload_1         
	//   72  134:aload_1         
	//   73  135:getfield        #29  <Field int azh.ck>
	//   74  138:aload_0         
	//   75  139:getfield        #12  <Field azh a>
	//   76  142:getfield        #47  <Field int azh.aG>
	//   77  145:ixor            
	//   78  146:putfield        #47  <Field int azh.aG>
		abyte0 = ((byte []) (a));
	//   79  149:aload_0         
	//   80  150:getfield        #12  <Field azh a>
	//   81  153:astore_1        
		abyte0.bU = ((azh) (abyte0)).aG ^ a.bU;
	//   82  154:aload_1         
	//   83  155:aload_1         
	//   84  156:getfield        #47  <Field int azh.aG>
	//   85  159:aload_0         
	//   86  160:getfield        #12  <Field azh a>
	//   87  163:getfield        #50  <Field int azh.bU>
	//   88  166:ixor            
	//   89  167:putfield        #50  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//   90  170:aload_0         
	//   91  171:getfield        #12  <Field azh a>
	//   92  174:astore_1        
		abyte0.ck = ((azh) (abyte0)).D | a.bU;
	//   93  175:aload_1         
	//   94  176:aload_1         
	//   95  177:getfield        #53  <Field int azh.D>
	//   96  180:aload_0         
	//   97  181:getfield        #12  <Field azh a>
	//   98  184:getfield        #50  <Field int azh.bU>
	//   99  187:ior             
	//  100  188:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  101  191:aload_0         
	//  102  192:getfield        #12  <Field azh a>
	//  103  195:astore_1        
		abyte0.aq = ((azh) (abyte0)).L ^ a.aG;
	//  104  196:aload_1         
	//  105  197:aload_1         
	//  106  198:getfield        #56  <Field int azh.L>
	//  107  201:aload_0         
	//  108  202:getfield        #12  <Field azh a>
	//  109  205:getfield        #47  <Field int azh.aG>
	//  110  208:ixor            
	//  111  209:putfield        #44  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	//  112  212:aload_0         
	//  113  213:getfield        #12  <Field azh a>
	//  114  216:astore_1        
		abyte0.bV = ((azh) (abyte0)).aq ^ a.bV;
	//  115  217:aload_1         
	//  116  218:aload_1         
	//  117  219:getfield        #44  <Field int azh.aq>
	//  118  222:aload_0         
	//  119  223:getfield        #12  <Field azh a>
	//  120  226:getfield        #59  <Field int azh.bV>
	//  121  229:ixor            
	//  122  230:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  123  233:aload_0         
	//  124  234:getfield        #12  <Field azh a>
	//  125  237:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.D;
	//  126  238:aload_1         
	//  127  239:aload_1         
	//  128  240:getfield        #59  <Field int azh.bV>
	//  129  243:aload_0         
	//  130  244:getfield        #12  <Field azh a>
	//  131  247:getfield        #53  <Field int azh.D>
	//  132  250:iconst_m1       
	//  133  251:ixor            
	//  134  252:iand            
	//  135  253:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  136  256:aload_0         
	//  137  257:getfield        #12  <Field azh a>
	//  138  260:astore_1        
		abyte0.ci = ((azh) (abyte0)).v | a.aq;
	//  139  261:aload_1         
	//  140  262:aload_1         
	//  141  263:getfield        #62  <Field int azh.v>
	//  142  266:aload_0         
	//  143  267:getfield        #12  <Field azh a>
	//  144  270:getfield        #44  <Field int azh.aq>
	//  145  273:ior             
	//  146  274:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  147  277:aload_0         
	//  148  278:getfield        #12  <Field azh a>
	//  149  281:astore_1        
		abyte0.ci = ((azh) (abyte0)).aq ^ a.ci;
	//  150  282:aload_1         
	//  151  283:aload_1         
	//  152  284:getfield        #44  <Field int azh.aq>
	//  153  287:aload_0         
	//  154  288:getfield        #12  <Field azh a>
	//  155  291:getfield        #41  <Field int azh.ci>
	//  156  294:ixor            
	//  157  295:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  158  298:aload_0         
	//  159  299:getfield        #12  <Field azh a>
	//  160  302:astore_1        
		abyte0.ci = ((azh) (abyte0)).D | a.ci;
	//  161  303:aload_1         
	//  162  304:aload_1         
	//  163  305:getfield        #53  <Field int azh.D>
	//  164  308:aload_0         
	//  165  309:getfield        #12  <Field azh a>
	//  166  312:getfield        #41  <Field int azh.ci>
	//  167  315:ior             
	//  168  316:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  169  319:aload_0         
	//  170  320:getfield        #12  <Field azh a>
	//  171  323:astore_1        
		abyte0.aS = ((azh) (abyte0)).L & ~a.aG;
	//  172  324:aload_1         
	//  173  325:aload_1         
	//  174  326:getfield        #56  <Field int azh.L>
	//  175  329:aload_0         
	//  176  330:getfield        #12  <Field azh a>
	//  177  333:getfield        #47  <Field int azh.aG>
	//  178  336:iconst_m1       
	//  179  337:ixor            
	//  180  338:iand            
	//  181  339:putfield        #38  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  182  342:aload_0         
	//  183  343:getfield        #12  <Field azh a>
	//  184  346:astore_1        
		abyte0.bD = ((azh) (abyte0)).aS | a.aG;
	//  185  347:aload_1         
	//  186  348:aload_1         
	//  187  349:getfield        #38  <Field int azh.aS>
	//  188  352:aload_0         
	//  189  353:getfield        #12  <Field azh a>
	//  190  356:getfield        #47  <Field int azh.aG>
	//  191  359:ior             
	//  192  360:putfield        #26  <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  193  363:aload_0         
	//  194  364:getfield        #12  <Field azh a>
	//  195  367:astore_1        
		abyte0.bD = ((azh) (abyte0)).bD & ~a.v;
	//  196  368:aload_1         
	//  197  369:aload_1         
	//  198  370:getfield        #26  <Field int azh.bD>
	//  199  373:aload_0         
	//  200  374:getfield        #12  <Field azh a>
	//  201  377:getfield        #62  <Field int azh.v>
	//  202  380:iconst_m1       
	//  203  381:ixor            
	//  204  382:iand            
	//  205  383:putfield        #26  <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  206  386:aload_0         
	//  207  387:getfield        #12  <Field azh a>
	//  208  390:astore_1        
		abyte0.bD = ((azh) (abyte0)).aG ^ a.bD;
	//  209  391:aload_1         
	//  210  392:aload_1         
	//  211  393:getfield        #47  <Field int azh.aG>
	//  212  396:aload_0         
	//  213  397:getfield        #12  <Field azh a>
	//  214  400:getfield        #26  <Field int azh.bD>
	//  215  403:ixor            
	//  216  404:putfield        #26  <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  217  407:aload_0         
	//  218  408:getfield        #12  <Field azh a>
	//  219  411:astore_1        
		abyte0.bv = ((azh) (abyte0)).aS ^ a.bv;
	//  220  412:aload_1         
	//  221  413:aload_1         
	//  222  414:getfield        #38  <Field int azh.aS>
	//  223  417:aload_0         
	//  224  418:getfield        #12  <Field azh a>
	//  225  421:getfield        #65  <Field int azh.bv>
	//  226  424:ixor            
	//  227  425:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  228  428:aload_0         
	//  229  429:getfield        #12  <Field azh a>
	//  230  432:astore_1        
		abyte0.ci = ((azh) (abyte0)).bv ^ a.ci;
	//  231  433:aload_1         
	//  232  434:aload_1         
	//  233  435:getfield        #65  <Field int azh.bv>
	//  234  438:aload_0         
	//  235  439:getfield        #12  <Field azh a>
	//  236  442:getfield        #41  <Field int azh.ci>
	//  237  445:ixor            
	//  238  446:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  239  449:aload_0         
	//  240  450:getfield        #12  <Field azh a>
	//  241  453:astore_1        
		abyte0.bv = ((azh) (abyte0)).v | a.aS;
	//  242  454:aload_1         
	//  243  455:aload_1         
	//  244  456:getfield        #62  <Field int azh.v>
	//  245  459:aload_0         
	//  246  460:getfield        #12  <Field azh a>
	//  247  463:getfield        #38  <Field int azh.aS>
	//  248  466:ior             
	//  249  467:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  250  470:aload_0         
	//  251  471:getfield        #12  <Field azh a>
	//  252  474:astore_1        
		abyte0.bv = ((azh) (abyte0)).aG ^ a.bv;
	//  253  475:aload_1         
	//  254  476:aload_1         
	//  255  477:getfield        #47  <Field int azh.aG>
	//  256  480:aload_0         
	//  257  481:getfield        #12  <Field azh a>
	//  258  484:getfield        #65  <Field int azh.bv>
	//  259  487:ixor            
	//  260  488:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  261  491:aload_0         
	//  262  492:getfield        #12  <Field azh a>
	//  263  495:astore_1        
		abyte0.bv = ((azh) (abyte0)).D & a.bv;
	//  264  496:aload_1         
	//  265  497:aload_1         
	//  266  498:getfield        #53  <Field int azh.D>
	//  267  501:aload_0         
	//  268  502:getfield        #12  <Field azh a>
	//  269  505:getfield        #65  <Field int azh.bv>
	//  270  508:iand            
	//  271  509:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  272  512:aload_0         
	//  273  513:getfield        #12  <Field azh a>
	//  274  516:astore_1        
		abyte0.R = ((azh) (abyte0)).aS & ~a.v;
	//  275  517:aload_1         
	//  276  518:aload_1         
	//  277  519:getfield        #38  <Field int azh.aS>
	//  278  522:aload_0         
	//  279  523:getfield        #12  <Field azh a>
	//  280  526:getfield        #62  <Field int azh.v>
	//  281  529:iconst_m1       
	//  282  530:ixor            
	//  283  531:iand            
	//  284  532:putfield        #68  <Field int azh.R>
		abyte0 = ((byte []) (a));
	//  285  535:aload_0         
	//  286  536:getfield        #12  <Field azh a>
	//  287  539:astore_1        
		abyte0.R = ((azh) (abyte0)).aq ^ a.R;
	//  288  540:aload_1         
	//  289  541:aload_1         
	//  290  542:getfield        #44  <Field int azh.aq>
	//  291  545:aload_0         
	//  292  546:getfield        #12  <Field azh a>
	//  293  549:getfield        #68  <Field int azh.R>
	//  294  552:ixor            
	//  295  553:putfield        #68  <Field int azh.R>
		abyte0 = ((byte []) (a));
	//  296  556:aload_0         
	//  297  557:getfield        #12  <Field azh a>
	//  298  560:astore_1        
		abyte0.aq = ((azh) (abyte0)).D | a.R;
	//  299  561:aload_1         
	//  300  562:aload_1         
	//  301  563:getfield        #53  <Field int azh.D>
	//  302  566:aload_0         
	//  303  567:getfield        #12  <Field azh a>
	//  304  570:getfield        #68  <Field int azh.R>
	//  305  573:ior             
	//  306  574:putfield        #44  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	//  307  577:aload_0         
	//  308  578:getfield        #12  <Field azh a>
	//  309  581:astore_1        
		abyte0.bv = ((azh) (abyte0)).R ^ a.bv;
	//  310  582:aload_1         
	//  311  583:aload_1         
	//  312  584:getfield        #68  <Field int azh.R>
	//  313  587:aload_0         
	//  314  588:getfield        #12  <Field azh a>
	//  315  591:getfield        #65  <Field int azh.bv>
	//  316  594:ixor            
	//  317  595:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  318  598:aload_0         
	//  319  599:getfield        #12  <Field azh a>
	//  320  602:astore_1        
		abyte0.bV = ((azh) (abyte0)).R ^ a.bV;
	//  321  603:aload_1         
	//  322  604:aload_1         
	//  323  605:getfield        #68  <Field int azh.R>
	//  324  608:aload_0         
	//  325  609:getfield        #12  <Field azh a>
	//  326  612:getfield        #59  <Field int azh.bV>
	//  327  615:ixor            
	//  328  616:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  329  619:aload_0         
	//  330  620:getfield        #12  <Field azh a>
	//  331  623:astore_1        
		abyte0.bV = ((azh) (abyte0)).f & ~a.bV;
	//  332  624:aload_1         
	//  333  625:aload_1         
	//  334  626:getfield        #71  <Field int azh.f>
	//  335  629:aload_0         
	//  336  630:getfield        #12  <Field azh a>
	//  337  633:getfield        #59  <Field int azh.bV>
	//  338  636:iconst_m1       
	//  339  637:ixor            
	//  340  638:iand            
	//  341  639:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  342  642:aload_0         
	//  343  643:getfield        #12  <Field azh a>
	//  344  646:astore_1        
		abyte0.bV = ((azh) (abyte0)).ci ^ a.bV;
	//  345  647:aload_1         
	//  346  648:aload_1         
	//  347  649:getfield        #41  <Field int azh.ci>
	//  348  652:aload_0         
	//  349  653:getfield        #12  <Field azh a>
	//  350  656:getfield        #59  <Field int azh.bV>
	//  351  659:ixor            
	//  352  660:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  353  663:aload_0         
	//  354  664:getfield        #12  <Field azh a>
	//  355  667:astore_1        
		abyte0.ci = ((azh) (abyte0)).br & a.bV;
	//  356  668:aload_1         
	//  357  669:aload_1         
	//  358  670:getfield        #74  <Field int azh.br>
	//  359  673:aload_0         
	//  360  674:getfield        #12  <Field azh a>
	//  361  677:getfield        #59  <Field int azh.bV>
	//  362  680:iand            
	//  363  681:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  364  684:aload_0         
	//  365  685:getfield        #12  <Field azh a>
	//  366  688:astore_1        
		abyte0.bV = ((azh) (abyte0)).br | a.bV;
	//  367  689:aload_1         
	//  368  690:aload_1         
	//  369  691:getfield        #74  <Field int azh.br>
	//  370  694:aload_0         
	//  371  695:getfield        #12  <Field azh a>
	//  372  698:getfield        #59  <Field int azh.bV>
	//  373  701:ior             
	//  374  702:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  375  705:aload_0         
	//  376  706:getfield        #12  <Field azh a>
	//  377  709:astore_1        
		abyte0.R = ((azh) (abyte0)).L | a.aG;
	//  378  710:aload_1         
	//  379  711:aload_1         
	//  380  712:getfield        #56  <Field int azh.L>
	//  381  715:aload_0         
	//  382  716:getfield        #12  <Field azh a>
	//  383  719:getfield        #47  <Field int azh.aG>
	//  384  722:ior             
	//  385  723:putfield        #68  <Field int azh.R>
		abyte0 = ((byte []) (a));
	//  386  726:aload_0         
	//  387  727:getfield        #12  <Field azh a>
	//  388  730:astore_1        
		abyte0.d = ((azh) (abyte0)).D | a.R;
	//  389  731:aload_1         
	//  390  732:aload_1         
	//  391  733:getfield        #53  <Field int azh.D>
	//  392  736:aload_0         
	//  393  737:getfield        #12  <Field azh a>
	//  394  740:getfield        #68  <Field int azh.R>
	//  395  743:ior             
	//  396  744:putfield        #77  <Field int azh.d>
		abyte0 = ((byte []) (a));
	//  397  747:aload_0         
	//  398  748:getfield        #12  <Field azh a>
	//  399  751:astore_1        
		abyte0.d = ((azh) (abyte0)).bU ^ a.d;
	//  400  752:aload_1         
	//  401  753:aload_1         
	//  402  754:getfield        #50  <Field int azh.bU>
	//  403  757:aload_0         
	//  404  758:getfield        #12  <Field azh a>
	//  405  761:getfield        #77  <Field int azh.d>
	//  406  764:ixor            
	//  407  765:putfield        #77  <Field int azh.d>
		abyte0 = ((byte []) (a));
	//  408  768:aload_0         
	//  409  769:getfield        #12  <Field azh a>
	//  410  772:astore_1        
		abyte0.d = ((azh) (abyte0)).f & ~a.d;
	//  411  773:aload_1         
	//  412  774:aload_1         
	//  413  775:getfield        #71  <Field int azh.f>
	//  414  778:aload_0         
	//  415  779:getfield        #12  <Field azh a>
	//  416  782:getfield        #77  <Field int azh.d>
	//  417  785:iconst_m1       
	//  418  786:ixor            
	//  419  787:iand            
	//  420  788:putfield        #77  <Field int azh.d>
		abyte0 = ((byte []) (a));
	//  421  791:aload_0         
	//  422  792:getfield        #12  <Field azh a>
	//  423  795:astore_1        
		abyte0.d = ((azh) (abyte0)).bv ^ a.d;
	//  424  796:aload_1         
	//  425  797:aload_1         
	//  426  798:getfield        #65  <Field int azh.bv>
	//  427  801:aload_0         
	//  428  802:getfield        #12  <Field azh a>
	//  429  805:getfield        #77  <Field int azh.d>
	//  430  808:ixor            
	//  431  809:putfield        #77  <Field int azh.d>
		abyte0 = ((byte []) (a));
	//  432  812:aload_0         
	//  433  813:getfield        #12  <Field azh a>
	//  434  816:astore_1        
		abyte0.bv = ((azh) (abyte0)).R ^ a.v;
	//  435  817:aload_1         
	//  436  818:aload_1         
	//  437  819:getfield        #68  <Field int azh.R>
	//  438  822:aload_0         
	//  439  823:getfield        #12  <Field azh a>
	//  440  826:getfield        #62  <Field int azh.v>
	//  441  829:ixor            
	//  442  830:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  443  833:aload_0         
	//  444  834:getfield        #12  <Field azh a>
	//  445  837:astore_1        
		abyte0.aq = ((azh) (abyte0)).bv ^ a.aq;
	//  446  838:aload_1         
	//  447  839:aload_1         
	//  448  840:getfield        #65  <Field int azh.bv>
	//  449  843:aload_0         
	//  450  844:getfield        #12  <Field azh a>
	//  451  847:getfield        #44  <Field int azh.aq>
	//  452  850:ixor            
	//  453  851:putfield        #44  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	//  454  854:aload_0         
	//  455  855:getfield        #12  <Field azh a>
	//  456  858:astore_1        
		abyte0.aM = ((azh) (abyte0)).R ^ a.aM;
	//  457  859:aload_1         
	//  458  860:aload_1         
	//  459  861:getfield        #68  <Field int azh.R>
	//  460  864:aload_0         
	//  461  865:getfield        #12  <Field azh a>
	//  462  868:getfield        #80  <Field int azh.aM>
	//  463  871:ixor            
	//  464  872:putfield        #80  <Field int azh.aM>
		abyte0 = ((byte []) (a));
	//  465  875:aload_0         
	//  466  876:getfield        #12  <Field azh a>
	//  467  879:astore_1        
		abyte0.aM = ((azh) (abyte0)).aM & ~a.D;
	//  468  880:aload_1         
	//  469  881:aload_1         
	//  470  882:getfield        #80  <Field int azh.aM>
	//  471  885:aload_0         
	//  472  886:getfield        #12  <Field azh a>
	//  473  889:getfield        #53  <Field int azh.D>
	//  474  892:iconst_m1       
	//  475  893:ixor            
	//  476  894:iand            
	//  477  895:putfield        #80  <Field int azh.aM>
		abyte0 = ((byte []) (a));
	//  478  898:aload_0         
	//  479  899:getfield        #12  <Field azh a>
	//  480  902:astore_1        
		abyte0.R = ((azh) (abyte0)).aG & ~a.L;
	//  481  903:aload_1         
	//  482  904:aload_1         
	//  483  905:getfield        #47  <Field int azh.aG>
	//  484  908:aload_0         
	//  485  909:getfield        #12  <Field azh a>
	//  486  912:getfield        #56  <Field int azh.L>
	//  487  915:iconst_m1       
	//  488  916:ixor            
	//  489  917:iand            
	//  490  918:putfield        #68  <Field int azh.R>
		abyte0 = ((byte []) (a));
	//  491  921:aload_0         
	//  492  922:getfield        #12  <Field azh a>
	//  493  925:astore_1        
		abyte0.bv = ((azh) (abyte0)).R & ~a.v;
	//  494  926:aload_1         
	//  495  927:aload_1         
	//  496  928:getfield        #68  <Field int azh.R>
	//  497  931:aload_0         
	//  498  932:getfield        #12  <Field azh a>
	//  499  935:getfield        #62  <Field int azh.v>
	//  500  938:iconst_m1       
	//  501  939:ixor            
	//  502  940:iand            
	//  503  941:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  504  944:aload_0         
	//  505  945:getfield        #12  <Field azh a>
	//  506  948:astore_1        
		abyte0.bv = ((azh) (abyte0)).aS ^ a.bv;
	//  507  949:aload_1         
	//  508  950:aload_1         
	//  509  951:getfield        #38  <Field int azh.aS>
	//  510  954:aload_0         
	//  511  955:getfield        #12  <Field azh a>
	//  512  958:getfield        #65  <Field int azh.bv>
	//  513  961:ixor            
	//  514  962:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  515  965:aload_0         
	//  516  966:getfield        #12  <Field azh a>
	//  517  969:astore_1        
		abyte0.ck = ((azh) (abyte0)).bv ^ a.ck;
	//  518  970:aload_1         
	//  519  971:aload_1         
	//  520  972:getfield        #65  <Field int azh.bv>
	//  521  975:aload_0         
	//  522  976:getfield        #12  <Field azh a>
	//  523  979:getfield        #29  <Field int azh.ck>
	//  524  982:ixor            
	//  525  983:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  526  986:aload_0         
	//  527  987:getfield        #12  <Field azh a>
	//  528  990:astore_1        
		abyte0.ck = ((azh) (abyte0)).f & a.ck;
	//  529  991:aload_1         
	//  530  992:aload_1         
	//  531  993:getfield        #71  <Field int azh.f>
	//  532  996:aload_0         
	//  533  997:getfield        #12  <Field azh a>
	//  534 1000:getfield        #29  <Field int azh.ck>
	//  535 1003:iand            
	//  536 1004:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  537 1007:aload_0         
	//  538 1008:getfield        #12  <Field azh a>
	//  539 1011:astore_1        
		abyte0.R = ((azh) (abyte0)).aG & ~a.R;
	//  540 1012:aload_1         
	//  541 1013:aload_1         
	//  542 1014:getfield        #47  <Field int azh.aG>
	//  543 1017:aload_0         
	//  544 1018:getfield        #12  <Field azh a>
	//  545 1021:getfield        #68  <Field int azh.R>
	//  546 1024:iconst_m1       
	//  547 1025:ixor            
	//  548 1026:iand            
	//  549 1027:putfield        #68  <Field int azh.R>
		abyte0 = ((byte []) (a));
	//  550 1030:aload_0         
	//  551 1031:getfield        #12  <Field azh a>
	//  552 1034:astore_1        
		abyte0.R = ((azh) (abyte0)).v | a.R;
	//  553 1035:aload_1         
	//  554 1036:aload_1         
	//  555 1037:getfield        #62  <Field int azh.v>
	//  556 1040:aload_0         
	//  557 1041:getfield        #12  <Field azh a>
	//  558 1044:getfield        #68  <Field int azh.R>
	//  559 1047:ior             
	//  560 1048:putfield        #68  <Field int azh.R>
		abyte0 = ((byte []) (a));
	//  561 1051:aload_0         
	//  562 1052:getfield        #12  <Field azh a>
	//  563 1055:astore_1        
		abyte0.aM = ((azh) (abyte0)).R ^ a.aM;
	//  564 1056:aload_1         
	//  565 1057:aload_1         
	//  566 1058:getfield        #68  <Field int azh.R>
	//  567 1061:aload_0         
	//  568 1062:getfield        #12  <Field azh a>
	//  569 1065:getfield        #80  <Field int azh.aM>
	//  570 1068:ixor            
	//  571 1069:putfield        #80  <Field int azh.aM>
		abyte0 = ((byte []) (a));
	//  572 1072:aload_0         
	//  573 1073:getfield        #12  <Field azh a>
	//  574 1076:astore_1        
		abyte0.aM = ((azh) (abyte0)).f & a.aM;
	//  575 1077:aload_1         
	//  576 1078:aload_1         
	//  577 1079:getfield        #71  <Field int azh.f>
	//  578 1082:aload_0         
	//  579 1083:getfield        #12  <Field azh a>
	//  580 1086:getfield        #80  <Field int azh.aM>
	//  581 1089:iand            
	//  582 1090:putfield        #80  <Field int azh.aM>
		abyte0 = ((byte []) (a));
	//  583 1093:aload_0         
	//  584 1094:getfield        #12  <Field azh a>
	//  585 1097:astore_1        
		abyte0.aM = ((azh) (abyte0)).aq ^ a.aM;
	//  586 1098:aload_1         
	//  587 1099:aload_1         
	//  588 1100:getfield        #44  <Field int azh.aq>
	//  589 1103:aload_0         
	//  590 1104:getfield        #12  <Field azh a>
	//  591 1107:getfield        #80  <Field int azh.aM>
	//  592 1110:ixor            
	//  593 1111:putfield        #80  <Field int azh.aM>
		abyte0 = ((byte []) (a));
	//  594 1114:aload_0         
	//  595 1115:getfield        #12  <Field azh a>
	//  596 1118:astore_1        
		abyte0.ci = ((azh) (abyte0)).aM ^ a.ci;
	//  597 1119:aload_1         
	//  598 1120:aload_1         
	//  599 1121:getfield        #80  <Field int azh.aM>
	//  600 1124:aload_0         
	//  601 1125:getfield        #12  <Field azh a>
	//  602 1128:getfield        #41  <Field int azh.ci>
	//  603 1131:ixor            
	//  604 1132:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  605 1135:aload_0         
	//  606 1136:getfield        #12  <Field azh a>
	//  607 1139:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci ^ a.ak;
	//  608 1140:aload_1         
	//  609 1141:aload_1         
	//  610 1142:getfield        #41  <Field int azh.ci>
	//  611 1145:aload_0         
	//  612 1146:getfield        #12  <Field azh a>
	//  613 1149:getfield        #32  <Field int azh.ak>
	//  614 1152:ixor            
	//  615 1153:putfield        #41  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  616 1156:aload_0         
	//  617 1157:getfield        #12  <Field azh a>
	//  618 1160:astore_1        
		abyte0.bV = ((azh) (abyte0)).aM ^ a.bV;
	//  619 1161:aload_1         
	//  620 1162:aload_1         
	//  621 1163:getfield        #80  <Field int azh.aM>
	//  622 1166:aload_0         
	//  623 1167:getfield        #12  <Field azh a>
	//  624 1170:getfield        #59  <Field int azh.bV>
	//  625 1173:ixor            
	//  626 1174:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  627 1177:aload_0         
	//  628 1178:getfield        #12  <Field azh a>
	//  629 1181:astore_1        
		abyte0.be = ((azh) (abyte0)).bV ^ a.be;
	//  630 1182:aload_1         
	//  631 1183:aload_1         
	//  632 1184:getfield        #59  <Field int azh.bV>
	//  633 1187:aload_0         
	//  634 1188:getfield        #12  <Field azh a>
	//  635 1191:getfield        #83  <Field int azh.be>
	//  636 1194:ixor            
	//  637 1195:putfield        #83  <Field int azh.be>
		abyte0 = ((byte []) (a));
	//  638 1198:aload_0         
	//  639 1199:getfield        #12  <Field azh a>
	//  640 1202:astore_1        
		abyte0.bV = ((azh) (abyte0)).v | a.aG;
	//  641 1203:aload_1         
	//  642 1204:aload_1         
	//  643 1205:getfield        #62  <Field int azh.v>
	//  644 1208:aload_0         
	//  645 1209:getfield        #12  <Field azh a>
	//  646 1212:getfield        #47  <Field int azh.aG>
	//  647 1215:ior             
	//  648 1216:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  649 1219:aload_0         
	//  650 1220:getfield        #12  <Field azh a>
	//  651 1223:astore_1        
		abyte0.bV = ((azh) (abyte0)).aG ^ a.bV;
	//  652 1224:aload_1         
	//  653 1225:aload_1         
	//  654 1226:getfield        #47  <Field int azh.aG>
	//  655 1229:aload_0         
	//  656 1230:getfield        #12  <Field azh a>
	//  657 1233:getfield        #59  <Field int azh.bV>
	//  658 1236:ixor            
	//  659 1237:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  660 1240:aload_0         
	//  661 1241:getfield        #12  <Field azh a>
	//  662 1244:astore_1        
		abyte0.bV = ((azh) (abyte0)).D | a.bV;
	//  663 1245:aload_1         
	//  664 1246:aload_1         
	//  665 1247:getfield        #53  <Field int azh.D>
	//  666 1250:aload_0         
	//  667 1251:getfield        #12  <Field azh a>
	//  668 1254:getfield        #59  <Field int azh.bV>
	//  669 1257:ior             
	//  670 1258:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  671 1261:aload_0         
	//  672 1262:getfield        #12  <Field azh a>
	//  673 1265:astore_1        
		abyte0.bV = ((azh) (abyte0)).bD ^ a.bV;
	//  674 1266:aload_1         
	//  675 1267:aload_1         
	//  676 1268:getfield        #26  <Field int azh.bD>
	//  677 1271:aload_0         
	//  678 1272:getfield        #12  <Field azh a>
	//  679 1275:getfield        #59  <Field int azh.bV>
	//  680 1278:ixor            
	//  681 1279:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  682 1282:aload_0         
	//  683 1283:getfield        #12  <Field azh a>
	//  684 1286:astore_1        
		abyte0.ck = ((azh) (abyte0)).bV ^ a.ck;
	//  685 1287:aload_1         
	//  686 1288:aload_1         
	//  687 1289:getfield        #59  <Field int azh.bV>
	//  688 1292:aload_0         
	//  689 1293:getfield        #12  <Field azh a>
	//  690 1296:getfield        #29  <Field int azh.ck>
	//  691 1299:ixor            
	//  692 1300:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  693 1303:aload_0         
	//  694 1304:getfield        #12  <Field azh a>
	//  695 1307:astore_1        
		abyte0.bV = ((azh) (abyte0)).br & a.ck;
	//  696 1308:aload_1         
	//  697 1309:aload_1         
	//  698 1310:getfield        #74  <Field int azh.br>
	//  699 1313:aload_0         
	//  700 1314:getfield        #12  <Field azh a>
	//  701 1317:getfield        #29  <Field int azh.ck>
	//  702 1320:iand            
	//  703 1321:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  704 1324:aload_0         
	//  705 1325:getfield        #12  <Field azh a>
	//  706 1328:astore_1        
		abyte0.bV = ((azh) (abyte0)).d ^ a.bV;
	//  707 1329:aload_1         
	//  708 1330:aload_1         
	//  709 1331:getfield        #77  <Field int azh.d>
	//  710 1334:aload_0         
	//  711 1335:getfield        #12  <Field azh a>
	//  712 1338:getfield        #59  <Field int azh.bV>
	//  713 1341:ixor            
	//  714 1342:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  715 1345:aload_0         
	//  716 1346:getfield        #12  <Field azh a>
	//  717 1349:astore_1        
		abyte0.bT = ((azh) (abyte0)).bV ^ a.bT;
	//  718 1350:aload_1         
	//  719 1351:aload_1         
	//  720 1352:getfield        #59  <Field int azh.bV>
	//  721 1355:aload_0         
	//  722 1356:getfield        #12  <Field azh a>
	//  723 1359:getfield        #86  <Field int azh.bT>
	//  724 1362:ixor            
	//  725 1363:putfield        #86  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	//  726 1366:aload_0         
	//  727 1367:getfield        #12  <Field azh a>
	//  728 1370:astore_1        
		abyte0.ck = ((azh) (abyte0)).br | a.ck;
	//  729 1371:aload_1         
	//  730 1372:aload_1         
	//  731 1373:getfield        #74  <Field int azh.br>
	//  732 1376:aload_0         
	//  733 1377:getfield        #12  <Field azh a>
	//  734 1380:getfield        #29  <Field int azh.ck>
	//  735 1383:ior             
	//  736 1384:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  737 1387:aload_0         
	//  738 1388:getfield        #12  <Field azh a>
	//  739 1391:astore_1        
		abyte0.ck = ((azh) (abyte0)).d ^ a.ck;
	//  740 1392:aload_1         
	//  741 1393:aload_1         
	//  742 1394:getfield        #77  <Field int azh.d>
	//  743 1397:aload_0         
	//  744 1398:getfield        #12  <Field azh a>
	//  745 1401:getfield        #29  <Field int azh.ck>
	//  746 1404:ixor            
	//  747 1405:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  748 1408:aload_0         
	//  749 1409:getfield        #12  <Field azh a>
	//  750 1412:astore_1        
		abyte0.I = ((azh) (abyte0)).ck ^ a.I;
	//  751 1413:aload_1         
	//  752 1414:aload_1         
	//  753 1415:getfield        #29  <Field int azh.ck>
	//  754 1418:aload_0         
	//  755 1419:getfield        #12  <Field azh a>
	//  756 1422:getfield        #88  <Field int azh.I>
	//  757 1425:ixor            
	//  758 1426:putfield        #88  <Field int azh.I>
		abyte0 = ((byte []) (a));
	//  759 1429:aload_0         
	//  760 1430:getfield        #12  <Field azh a>
	//  761 1433:astore_1        
		abyte0.aU = ((azh) (abyte0)).aU & ~a.i;
	//  762 1434:aload_1         
	//  763 1435:aload_1         
	//  764 1436:getfield        #35  <Field int azh.aU>
	//  765 1439:aload_0         
	//  766 1440:getfield        #12  <Field azh a>
	//  767 1443:getfield        #91  <Field int azh.i>
	//  768 1446:iconst_m1       
	//  769 1447:ixor            
	//  770 1448:iand            
	//  771 1449:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	//  772 1452:aload_0         
	//  773 1453:getfield        #12  <Field azh a>
	//  774 1456:astore_1        
		abyte0.aU = ((azh) (abyte0)).by ^ a.aU;
	//  775 1457:aload_1         
	//  776 1458:aload_1         
	//  777 1459:getfield        #94  <Field int azh.by>
	//  778 1462:aload_0         
	//  779 1463:getfield        #12  <Field azh a>
	//  780 1466:getfield        #35  <Field int azh.aU>
	//  781 1469:ixor            
	//  782 1470:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	//  783 1473:aload_0         
	//  784 1474:getfield        #12  <Field azh a>
	//  785 1477:astore_1        
		abyte0.by = ((azh) (abyte0)).a & a.G;
	//  786 1478:aload_1         
	//  787 1479:aload_1         
	//  788 1480:getfield        #96  <Field int azh.a>
	//  789 1483:aload_0         
	//  790 1484:getfield        #12  <Field azh a>
	//  791 1487:getfield        #99  <Field int azh.G>
	//  792 1490:iand            
	//  793 1491:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	//  794 1494:aload_0         
	//  795 1495:getfield        #12  <Field azh a>
	//  796 1498:astore_1        
		abyte0.cj = ((azh) (abyte0)).by ^ a.cj;
	//  797 1499:aload_1         
	//  798 1500:aload_1         
	//  799 1501:getfield        #94  <Field int azh.by>
	//  800 1504:aload_0         
	//  801 1505:getfield        #12  <Field azh a>
	//  802 1508:getfield        #102 <Field int azh.cj>
	//  803 1511:ixor            
	//  804 1512:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	//  805 1515:aload_0         
	//  806 1516:getfield        #12  <Field azh a>
	//  807 1519:astore_1        
		abyte0.bO = ((azh) (abyte0)).cj ^ a.bO;
	//  808 1520:aload_1         
	//  809 1521:aload_1         
	//  810 1522:getfield        #102 <Field int azh.cj>
	//  811 1525:aload_0         
	//  812 1526:getfield        #12  <Field azh a>
	//  813 1529:getfield        #105 <Field int azh.bO>
	//  814 1532:ixor            
	//  815 1533:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	//  816 1536:aload_0         
	//  817 1537:getfield        #12  <Field azh a>
	//  818 1540:astore_1        
		abyte0.bO = ((azh) (abyte0)).y & a.bO;
	//  819 1541:aload_1         
	//  820 1542:aload_1         
	//  821 1543:getfield        #108 <Field int azh.y>
	//  822 1546:aload_0         
	//  823 1547:getfield        #12  <Field azh a>
	//  824 1550:getfield        #105 <Field int azh.bO>
	//  825 1553:iand            
	//  826 1554:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	//  827 1557:aload_0         
	//  828 1558:getfield        #12  <Field azh a>
	//  829 1561:astore_1        
		abyte0.bO = ((azh) (abyte0)).aU ^ a.bO;
	//  830 1562:aload_1         
	//  831 1563:aload_1         
	//  832 1564:getfield        #35  <Field int azh.aU>
	//  833 1567:aload_0         
	//  834 1568:getfield        #12  <Field azh a>
	//  835 1571:getfield        #105 <Field int azh.bO>
	//  836 1574:ixor            
	//  837 1575:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	//  838 1578:aload_0         
	//  839 1579:getfield        #12  <Field azh a>
	//  840 1582:astore_1        
		abyte0.bO = ((azh) (abyte0)).bO & a.ak;
	//  841 1583:aload_1         
	//  842 1584:aload_1         
	//  843 1585:getfield        #105 <Field int azh.bO>
	//  844 1588:aload_0         
	//  845 1589:getfield        #12  <Field azh a>
	//  846 1592:getfield        #32  <Field int azh.ak>
	//  847 1595:iand            
	//  848 1596:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	//  849 1599:aload_0         
	//  850 1600:getfield        #12  <Field azh a>
	//  851 1603:astore_1        
		abyte0.aU = ((azh) (abyte0)).i & ~a.by;
	//  852 1604:aload_1         
	//  853 1605:aload_1         
	//  854 1606:getfield        #91  <Field int azh.i>
	//  855 1609:aload_0         
	//  856 1610:getfield        #12  <Field azh a>
	//  857 1613:getfield        #94  <Field int azh.by>
	//  858 1616:iconst_m1       
	//  859 1617:ixor            
	//  860 1618:iand            
	//  861 1619:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	//  862 1622:aload_0         
	//  863 1623:getfield        #12  <Field azh a>
	//  864 1626:astore_1        
		abyte0.aU = ((azh) (abyte0)).af ^ a.aU;
	//  865 1627:aload_1         
	//  866 1628:aload_1         
	//  867 1629:getfield        #111 <Field int azh.af>
	//  868 1632:aload_0         
	//  869 1633:getfield        #12  <Field azh a>
	//  870 1636:getfield        #35  <Field int azh.aU>
	//  871 1639:ixor            
	//  872 1640:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	//  873 1643:aload_0         
	//  874 1644:getfield        #12  <Field azh a>
	//  875 1647:astore_1        
		abyte0.af = ((azh) (abyte0)).i & a.by;
	//  876 1648:aload_1         
	//  877 1649:aload_1         
	//  878 1650:getfield        #91  <Field int azh.i>
	//  879 1653:aload_0         
	//  880 1654:getfield        #12  <Field azh a>
	//  881 1657:getfield        #94  <Field int azh.by>
	//  882 1660:iand            
	//  883 1661:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	//  884 1664:aload_0         
	//  885 1665:getfield        #12  <Field azh a>
	//  886 1668:astore_1        
		abyte0.af = ((azh) (abyte0)).aI ^ a.af;
	//  887 1669:aload_1         
	//  888 1670:aload_1         
	//  889 1671:getfield        #114 <Field int azh.aI>
	//  890 1674:aload_0         
	//  891 1675:getfield        #12  <Field azh a>
	//  892 1678:getfield        #111 <Field int azh.af>
	//  893 1681:ixor            
	//  894 1682:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	//  895 1685:aload_0         
	//  896 1686:getfield        #12  <Field azh a>
	//  897 1689:astore_1        
		abyte0.af = ((azh) (abyte0)).y & ~a.af;
	//  898 1690:aload_1         
	//  899 1691:aload_1         
	//  900 1692:getfield        #108 <Field int azh.y>
	//  901 1695:aload_0         
	//  902 1696:getfield        #12  <Field azh a>
	//  903 1699:getfield        #111 <Field int azh.af>
	//  904 1702:iconst_m1       
	//  905 1703:ixor            
	//  906 1704:iand            
	//  907 1705:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	//  908 1708:aload_0         
	//  909 1709:getfield        #12  <Field azh a>
	//  910 1712:astore_1        
		abyte0.af = ((azh) (abyte0)).aU ^ a.af;
	//  911 1713:aload_1         
	//  912 1714:aload_1         
	//  913 1715:getfield        #35  <Field int azh.aU>
	//  914 1718:aload_0         
	//  915 1719:getfield        #12  <Field azh a>
	//  916 1722:getfield        #111 <Field int azh.af>
	//  917 1725:ixor            
	//  918 1726:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	//  919 1729:aload_0         
	//  920 1730:getfield        #12  <Field azh a>
	//  921 1733:astore_1        
		abyte0.aO = ((azh) (abyte0)).af ^ a.aO;
	//  922 1734:aload_1         
	//  923 1735:aload_1         
	//  924 1736:getfield        #111 <Field int azh.af>
	//  925 1739:aload_0         
	//  926 1740:getfield        #12  <Field azh a>
	//  927 1743:getfield        #117 <Field int azh.aO>
	//  928 1746:ixor            
	//  929 1747:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	//  930 1750:aload_0         
	//  931 1751:getfield        #12  <Field azh a>
	//  932 1754:astore_1        
		abyte0.P = ((azh) (abyte0)).aO ^ a.P;
	//  933 1755:aload_1         
	//  934 1756:aload_1         
	//  935 1757:getfield        #117 <Field int azh.aO>
	//  936 1760:aload_0         
	//  937 1761:getfield        #12  <Field azh a>
	//  938 1764:getfield        #120 <Field int azh.P>
	//  939 1767:ixor            
	//  940 1768:putfield        #120 <Field int azh.P>
		abyte0 = ((byte []) (a));
	//  941 1771:aload_0         
	//  942 1772:getfield        #12  <Field azh a>
	//  943 1775:astore_1        
		abyte0.X = ((azh) (abyte0)).P & ~a.X;
	//  944 1776:aload_1         
	//  945 1777:aload_1         
	//  946 1778:getfield        #120 <Field int azh.P>
	//  947 1781:aload_0         
	//  948 1782:getfield        #12  <Field azh a>
	//  949 1785:getfield        #123 <Field int azh.X>
	//  950 1788:iconst_m1       
	//  951 1789:ixor            
	//  952 1790:iand            
	//  953 1791:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	//  954 1794:aload_0         
	//  955 1795:getfield        #12  <Field azh a>
	//  956 1798:astore_1        
		abyte0.X = ((azh) (abyte0)).aN ^ a.X;
	//  957 1799:aload_1         
	//  958 1800:aload_1         
	//  959 1801:getfield        #126 <Field int azh.aN>
	//  960 1804:aload_0         
	//  961 1805:getfield        #12  <Field azh a>
	//  962 1808:getfield        #123 <Field int azh.X>
	//  963 1811:ixor            
	//  964 1812:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	//  965 1815:aload_0         
	//  966 1816:getfield        #12  <Field azh a>
	//  967 1819:astore_1        
		abyte0.K = ((azh) (abyte0)).X ^ a.K;
	//  968 1820:aload_1         
	//  969 1821:aload_1         
	//  970 1822:getfield        #123 <Field int azh.X>
	//  971 1825:aload_0         
	//  972 1826:getfield        #12  <Field azh a>
	//  973 1829:getfield        #129 <Field int azh.K>
	//  974 1832:ixor            
	//  975 1833:putfield        #129 <Field int azh.K>
		abyte0 = ((byte []) (a));
	//  976 1836:aload_0         
	//  977 1837:getfield        #12  <Field azh a>
	//  978 1840:astore_1        
		abyte0.aB = ((azh) (abyte0)).P & a.aB;
	//  979 1841:aload_1         
	//  980 1842:aload_1         
	//  981 1843:getfield        #120 <Field int azh.P>
	//  982 1846:aload_0         
	//  983 1847:getfield        #12  <Field azh a>
	//  984 1850:getfield        #132 <Field int azh.aB>
	//  985 1853:iand            
	//  986 1854:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	//  987 1857:aload_0         
	//  988 1858:getfield        #12  <Field azh a>
	//  989 1861:astore_1        
		abyte0.aB = ((azh) (abyte0)).ch ^ a.aB;
	//  990 1862:aload_1         
	//  991 1863:aload_1         
	//  992 1864:getfield        #135 <Field int azh.ch>
	//  993 1867:aload_0         
	//  994 1868:getfield        #12  <Field azh a>
	//  995 1871:getfield        #132 <Field int azh.aB>
	//  996 1874:ixor            
	//  997 1875:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	//  998 1878:aload_0         
	//  999 1879:getfield        #12  <Field azh a>
	// 1000 1882:astore_1        
		abyte0.bb = ((azh) (abyte0)).aB ^ a.bb;
	// 1001 1883:aload_1         
	// 1002 1884:aload_1         
	// 1003 1885:getfield        #132 <Field int azh.aB>
	// 1004 1888:aload_0         
	// 1005 1889:getfield        #12  <Field azh a>
	// 1006 1892:getfield        #138 <Field int azh.bb>
	// 1007 1895:ixor            
	// 1008 1896:putfield        #138 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 1009 1899:aload_0         
	// 1010 1900:getfield        #12  <Field azh a>
	// 1011 1903:astore_1        
		abyte0.cd = ((azh) (abyte0)).P & ~a.cd;
	// 1012 1904:aload_1         
	// 1013 1905:aload_1         
	// 1014 1906:getfield        #120 <Field int azh.P>
	// 1015 1909:aload_0         
	// 1016 1910:getfield        #12  <Field azh a>
	// 1017 1913:getfield        #141 <Field int azh.cd>
	// 1018 1916:iconst_m1       
	// 1019 1917:ixor            
	// 1020 1918:iand            
	// 1021 1919:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1022 1922:aload_0         
	// 1023 1923:getfield        #12  <Field azh a>
	// 1024 1926:astore_1        
		abyte0.cd = ((azh) (abyte0)).ah ^ a.cd;
	// 1025 1927:aload_1         
	// 1026 1928:aload_1         
	// 1027 1929:getfield        #144 <Field int azh.ah>
	// 1028 1932:aload_0         
	// 1029 1933:getfield        #12  <Field azh a>
	// 1030 1936:getfield        #141 <Field int azh.cd>
	// 1031 1939:ixor            
	// 1032 1940:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1033 1943:aload_0         
	// 1034 1944:getfield        #12  <Field azh a>
	// 1035 1947:astore_1        
		abyte0.o = ((azh) (abyte0)).cd ^ a.o;
	// 1036 1948:aload_1         
	// 1037 1949:aload_1         
	// 1038 1950:getfield        #141 <Field int azh.cd>
	// 1039 1953:aload_0         
	// 1040 1954:getfield        #12  <Field azh a>
	// 1041 1957:getfield        #147 <Field int azh.o>
	// 1042 1960:ixor            
	// 1043 1961:putfield        #147 <Field int azh.o>
		abyte0 = ((byte []) (a));
	// 1044 1964:aload_0         
	// 1045 1965:getfield        #12  <Field azh a>
	// 1046 1968:astore_1        
		abyte0.ay = ((azh) (abyte0)).P & ~a.ay;
	// 1047 1969:aload_1         
	// 1048 1970:aload_1         
	// 1049 1971:getfield        #120 <Field int azh.P>
	// 1050 1974:aload_0         
	// 1051 1975:getfield        #12  <Field azh a>
	// 1052 1978:getfield        #150 <Field int azh.ay>
	// 1053 1981:iconst_m1       
	// 1054 1982:ixor            
	// 1055 1983:iand            
	// 1056 1984:putfield        #150 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1057 1987:aload_0         
	// 1058 1988:getfield        #12  <Field azh a>
	// 1059 1991:astore_1        
		abyte0.ay = ((azh) (abyte0)).bM ^ a.ay;
	// 1060 1992:aload_1         
	// 1061 1993:aload_1         
	// 1062 1994:getfield        #153 <Field int azh.bM>
	// 1063 1997:aload_0         
	// 1064 1998:getfield        #12  <Field azh a>
	// 1065 2001:getfield        #150 <Field int azh.ay>
	// 1066 2004:ixor            
	// 1067 2005:putfield        #150 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1068 2008:aload_0         
	// 1069 2009:getfield        #12  <Field azh a>
	// 1070 2012:astore_1        
		abyte0.ay = ((azh) (abyte0)).ay ^ a.a;
	// 1071 2013:aload_1         
	// 1072 2014:aload_1         
	// 1073 2015:getfield        #150 <Field int azh.ay>
	// 1074 2018:aload_0         
	// 1075 2019:getfield        #12  <Field azh a>
	// 1076 2022:getfield        #96  <Field int azh.a>
	// 1077 2025:ixor            
	// 1078 2026:putfield        #150 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1079 2029:aload_0         
	// 1080 2030:getfield        #12  <Field azh a>
	// 1081 2033:astore_1        
		abyte0.by = ((azh) (abyte0)).i & ~a.by;
	// 1082 2034:aload_1         
	// 1083 2035:aload_1         
	// 1084 2036:getfield        #91  <Field int azh.i>
	// 1085 2039:aload_0         
	// 1086 2040:getfield        #12  <Field azh a>
	// 1087 2043:getfield        #94  <Field int azh.by>
	// 1088 2046:iconst_m1       
	// 1089 2047:ixor            
	// 1090 2048:iand            
	// 1091 2049:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1092 2052:aload_0         
	// 1093 2053:getfield        #12  <Field azh a>
	// 1094 2056:astore_1        
		abyte0.by = ((azh) (abyte0)).bR ^ a.by;
	// 1095 2057:aload_1         
	// 1096 2058:aload_1         
	// 1097 2059:getfield        #156 <Field int azh.bR>
	// 1098 2062:aload_0         
	// 1099 2063:getfield        #12  <Field azh a>
	// 1100 2066:getfield        #94  <Field int azh.by>
	// 1101 2069:ixor            
	// 1102 2070:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1103 2073:aload_0         
	// 1104 2074:getfield        #12  <Field azh a>
	// 1105 2077:astore_1        
		abyte0.by = ((azh) (abyte0)).y & ~a.by;
	// 1106 2078:aload_1         
	// 1107 2079:aload_1         
	// 1108 2080:getfield        #108 <Field int azh.y>
	// 1109 2083:aload_0         
	// 1110 2084:getfield        #12  <Field azh a>
	// 1111 2087:getfield        #94  <Field int azh.by>
	// 1112 2090:iconst_m1       
	// 1113 2091:ixor            
	// 1114 2092:iand            
	// 1115 2093:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1116 2096:aload_0         
	// 1117 2097:getfield        #12  <Field azh a>
	// 1118 2100:astore_1        
		abyte0.by = ((azh) (abyte0)).bW ^ a.by;
	// 1119 2101:aload_1         
	// 1120 2102:aload_1         
	// 1121 2103:getfield        #159 <Field int azh.bW>
	// 1122 2106:aload_0         
	// 1123 2107:getfield        #12  <Field azh a>
	// 1124 2110:getfield        #94  <Field int azh.by>
	// 1125 2113:ixor            
	// 1126 2114:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1127 2117:aload_0         
	// 1128 2118:getfield        #12  <Field azh a>
	// 1129 2121:astore_1        
		abyte0.bO = ((azh) (abyte0)).by ^ a.bO;
	// 1130 2122:aload_1         
	// 1131 2123:aload_1         
	// 1132 2124:getfield        #94  <Field int azh.by>
	// 1133 2127:aload_0         
	// 1134 2128:getfield        #12  <Field azh a>
	// 1135 2131:getfield        #105 <Field int azh.bO>
	// 1136 2134:ixor            
	// 1137 2135:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1138 2138:aload_0         
	// 1139 2139:getfield        #12  <Field azh a>
	// 1140 2142:astore_1        
		abyte0.F = ((azh) (abyte0)).bO ^ a.F;
	// 1141 2143:aload_1         
	// 1142 2144:aload_1         
	// 1143 2145:getfield        #105 <Field int azh.bO>
	// 1144 2148:aload_0         
	// 1145 2149:getfield        #12  <Field azh a>
	// 1146 2152:getfield        #162 <Field int azh.F>
	// 1147 2155:ixor            
	// 1148 2156:putfield        #162 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 1149 2159:aload_0         
	// 1150 2160:getfield        #12  <Field azh a>
	// 1151 2163:astore_1        
		abyte0.bO = ((azh) (abyte0)).N ^ a.F;
	// 1152 2164:aload_1         
	// 1153 2165:aload_1         
	// 1154 2166:getfield        #165 <Field int azh.N>
	// 1155 2169:aload_0         
	// 1156 2170:getfield        #12  <Field azh a>
	// 1157 2173:getfield        #162 <Field int azh.F>
	// 1158 2176:ixor            
	// 1159 2177:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1160 2180:aload_0         
	// 1161 2181:getfield        #12  <Field azh a>
	// 1162 2184:astore_1        
		abyte0.bW = ((azh) (abyte0)).V & ~a.bO;
	// 1163 2185:aload_1         
	// 1164 2186:aload_1         
	// 1165 2187:getfield        #168 <Field int azh.V>
	// 1166 2190:aload_0         
	// 1167 2191:getfield        #12  <Field azh a>
	// 1168 2194:getfield        #105 <Field int azh.bO>
	// 1169 2197:iconst_m1       
	// 1170 2198:ixor            
	// 1171 2199:iand            
	// 1172 2200:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1173 2203:aload_0         
	// 1174 2204:getfield        #12  <Field azh a>
	// 1175 2207:astore_1        
		abyte0.bR = ((azh) (abyte0)).V & a.bO;
	// 1176 2208:aload_1         
	// 1177 2209:aload_1         
	// 1178 2210:getfield        #168 <Field int azh.V>
	// 1179 2213:aload_0         
	// 1180 2214:getfield        #12  <Field azh a>
	// 1181 2217:getfield        #105 <Field int azh.bO>
	// 1182 2220:iand            
	// 1183 2221:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1184 2224:aload_0         
	// 1185 2225:getfield        #12  <Field azh a>
	// 1186 2228:astore_1        
		abyte0.bR = ((azh) (abyte0)).bO ^ a.bR;
	// 1187 2229:aload_1         
	// 1188 2230:aload_1         
	// 1189 2231:getfield        #105 <Field int azh.bO>
	// 1190 2234:aload_0         
	// 1191 2235:getfield        #12  <Field azh a>
	// 1192 2238:getfield        #156 <Field int azh.bR>
	// 1193 2241:ixor            
	// 1194 2242:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1195 2245:aload_0         
	// 1196 2246:getfield        #12  <Field azh a>
	// 1197 2249:astore_1        
		abyte0.bM = ((azh) (abyte0)).V & ~a.bO;
	// 1198 2250:aload_1         
	// 1199 2251:aload_1         
	// 1200 2252:getfield        #168 <Field int azh.V>
	// 1201 2255:aload_0         
	// 1202 2256:getfield        #12  <Field azh a>
	// 1203 2259:getfield        #105 <Field int azh.bO>
	// 1204 2262:iconst_m1       
	// 1205 2263:ixor            
	// 1206 2264:iand            
	// 1207 2265:putfield        #153 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 1208 2268:aload_0         
	// 1209 2269:getfield        #12  <Field azh a>
	// 1210 2272:astore_1        
		abyte0.bM = ((azh) (abyte0)).bO ^ a.bM;
	// 1211 2273:aload_1         
	// 1212 2274:aload_1         
	// 1213 2275:getfield        #105 <Field int azh.bO>
	// 1214 2278:aload_0         
	// 1215 2279:getfield        #12  <Field azh a>
	// 1216 2282:getfield        #153 <Field int azh.bM>
	// 1217 2285:ixor            
	// 1218 2286:putfield        #153 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 1219 2289:aload_0         
	// 1220 2290:getfield        #12  <Field azh a>
	// 1221 2293:astore_1        
		abyte0.bO = ((azh) (abyte0)).ad & ~a.bM;
	// 1222 2294:aload_1         
	// 1223 2295:aload_1         
	// 1224 2296:getfield        #171 <Field int azh.ad>
	// 1225 2299:aload_0         
	// 1226 2300:getfield        #12  <Field azh a>
	// 1227 2303:getfield        #153 <Field int azh.bM>
	// 1228 2306:iconst_m1       
	// 1229 2307:ixor            
	// 1230 2308:iand            
	// 1231 2309:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1232 2312:aload_0         
	// 1233 2313:getfield        #12  <Field azh a>
	// 1234 2316:astore_1        
		abyte0.bM = ((azh) (abyte0)).bM ^ a.ad;
	// 1235 2317:aload_1         
	// 1236 2318:aload_1         
	// 1237 2319:getfield        #153 <Field int azh.bM>
	// 1238 2322:aload_0         
	// 1239 2323:getfield        #12  <Field azh a>
	// 1240 2326:getfield        #171 <Field int azh.ad>
	// 1241 2329:ixor            
	// 1242 2330:putfield        #153 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 1243 2333:aload_0         
	// 1244 2334:getfield        #12  <Field azh a>
	// 1245 2337:astore_1        
		abyte0.cd = ((azh) (abyte0)).F & ~a.N;
	// 1246 2338:aload_1         
	// 1247 2339:aload_1         
	// 1248 2340:getfield        #162 <Field int azh.F>
	// 1249 2343:aload_0         
	// 1250 2344:getfield        #12  <Field azh a>
	// 1251 2347:getfield        #165 <Field int azh.N>
	// 1252 2350:iconst_m1       
	// 1253 2351:ixor            
	// 1254 2352:iand            
	// 1255 2353:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1256 2356:aload_0         
	// 1257 2357:getfield        #12  <Field azh a>
	// 1258 2360:astore_1        
		abyte0.bm = ((azh) (abyte0)).cd ^ a.bm;
	// 1259 2361:aload_1         
	// 1260 2362:aload_1         
	// 1261 2363:getfield        #141 <Field int azh.cd>
	// 1262 2366:aload_0         
	// 1263 2367:getfield        #12  <Field azh a>
	// 1264 2370:getfield        #174 <Field int azh.bm>
	// 1265 2373:ixor            
	// 1266 2374:putfield        #174 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1267 2377:aload_0         
	// 1268 2378:getfield        #12  <Field azh a>
	// 1269 2381:astore_1        
		abyte0.ah = ((azh) (abyte0)).ad & ~a.bm;
	// 1270 2382:aload_1         
	// 1271 2383:aload_1         
	// 1272 2384:getfield        #171 <Field int azh.ad>
	// 1273 2387:aload_0         
	// 1274 2388:getfield        #12  <Field azh a>
	// 1275 2391:getfield        #174 <Field int azh.bm>
	// 1276 2394:iconst_m1       
	// 1277 2395:ixor            
	// 1278 2396:iand            
	// 1279 2397:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 1280 2400:aload_0         
	// 1281 2401:getfield        #12  <Field azh a>
	// 1282 2404:astore_1        
		abyte0.aB = ((azh) (abyte0)).F & ~a.cd;
	// 1283 2405:aload_1         
	// 1284 2406:aload_1         
	// 1285 2407:getfield        #162 <Field int azh.F>
	// 1286 2410:aload_0         
	// 1287 2411:getfield        #12  <Field azh a>
	// 1288 2414:getfield        #141 <Field int azh.cd>
	// 1289 2417:iconst_m1       
	// 1290 2418:ixor            
	// 1291 2419:iand            
	// 1292 2420:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1293 2423:aload_0         
	// 1294 2424:getfield        #12  <Field azh a>
	// 1295 2427:astore_1        
		abyte0.ch = ((azh) (abyte0)).V & ~a.aB;
	// 1296 2428:aload_1         
	// 1297 2429:aload_1         
	// 1298 2430:getfield        #168 <Field int azh.V>
	// 1299 2433:aload_0         
	// 1300 2434:getfield        #12  <Field azh a>
	// 1301 2437:getfield        #132 <Field int azh.aB>
	// 1302 2440:iconst_m1       
	// 1303 2441:ixor            
	// 1304 2442:iand            
	// 1305 2443:putfield        #135 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 1306 2446:aload_0         
	// 1307 2447:getfield        #12  <Field azh a>
	// 1308 2450:astore_1        
		abyte0.ch = ((azh) (abyte0)).F ^ a.ch;
	// 1309 2451:aload_1         
	// 1310 2452:aload_1         
	// 1311 2453:getfield        #162 <Field int azh.F>
	// 1312 2456:aload_0         
	// 1313 2457:getfield        #12  <Field azh a>
	// 1314 2460:getfield        #135 <Field int azh.ch>
	// 1315 2463:ixor            
	// 1316 2464:putfield        #135 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 1317 2467:aload_0         
	// 1318 2468:getfield        #12  <Field azh a>
	// 1319 2471:astore_1        
		abyte0.aB = ((azh) (abyte0)).V & ~a.aB;
	// 1320 2472:aload_1         
	// 1321 2473:aload_1         
	// 1322 2474:getfield        #168 <Field int azh.V>
	// 1323 2477:aload_0         
	// 1324 2478:getfield        #12  <Field azh a>
	// 1325 2481:getfield        #132 <Field int azh.aB>
	// 1326 2484:iconst_m1       
	// 1327 2485:ixor            
	// 1328 2486:iand            
	// 1329 2487:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1330 2490:aload_0         
	// 1331 2491:getfield        #12  <Field azh a>
	// 1332 2494:astore_1        
		abyte0.X = ((azh) (abyte0)).V & ~a.F;
	// 1333 2495:aload_1         
	// 1334 2496:aload_1         
	// 1335 2497:getfield        #168 <Field int azh.V>
	// 1336 2500:aload_0         
	// 1337 2501:getfield        #12  <Field azh a>
	// 1338 2504:getfield        #162 <Field int azh.F>
	// 1339 2507:iconst_m1       
	// 1340 2508:ixor            
	// 1341 2509:iand            
	// 1342 2510:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1343 2513:aload_0         
	// 1344 2514:getfield        #12  <Field azh a>
	// 1345 2517:astore_1        
		abyte0.aN = ((azh) (abyte0)).V & ~a.F;
	// 1346 2518:aload_1         
	// 1347 2519:aload_1         
	// 1348 2520:getfield        #168 <Field int azh.V>
	// 1349 2523:aload_0         
	// 1350 2524:getfield        #12  <Field azh a>
	// 1351 2527:getfield        #162 <Field int azh.F>
	// 1352 2530:iconst_m1       
	// 1353 2531:ixor            
	// 1354 2532:iand            
	// 1355 2533:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1356 2536:aload_0         
	// 1357 2537:getfield        #12  <Field azh a>
	// 1358 2540:astore_1        
		abyte0.aN = ((azh) (abyte0)).N ^ a.aN;
	// 1359 2541:aload_1         
	// 1360 2542:aload_1         
	// 1361 2543:getfield        #165 <Field int azh.N>
	// 1362 2546:aload_0         
	// 1363 2547:getfield        #12  <Field azh a>
	// 1364 2550:getfield        #126 <Field int azh.aN>
	// 1365 2553:ixor            
	// 1366 2554:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1367 2557:aload_0         
	// 1368 2558:getfield        #12  <Field azh a>
	// 1369 2561:astore_1        
		abyte0.aN = ((azh) (abyte0)).ad | a.aN;
	// 1370 2562:aload_1         
	// 1371 2563:aload_1         
	// 1372 2564:getfield        #171 <Field int azh.ad>
	// 1373 2567:aload_0         
	// 1374 2568:getfield        #12  <Field azh a>
	// 1375 2571:getfield        #126 <Field int azh.aN>
	// 1376 2574:ior             
	// 1377 2575:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1378 2578:aload_0         
	// 1379 2579:getfield        #12  <Field azh a>
	// 1380 2582:astore_1        
		abyte0.aO = ((azh) (abyte0)).V & ~a.F;
	// 1381 2583:aload_1         
	// 1382 2584:aload_1         
	// 1383 2585:getfield        #168 <Field int azh.V>
	// 1384 2588:aload_0         
	// 1385 2589:getfield        #12  <Field azh a>
	// 1386 2592:getfield        #162 <Field int azh.F>
	// 1387 2595:iconst_m1       
	// 1388 2596:ixor            
	// 1389 2597:iand            
	// 1390 2598:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1391 2601:aload_0         
	// 1392 2602:getfield        #12  <Field azh a>
	// 1393 2605:astore_1        
		abyte0.af = ((azh) (abyte0)).N & a.F;
	// 1394 2606:aload_1         
	// 1395 2607:aload_1         
	// 1396 2608:getfield        #165 <Field int azh.N>
	// 1397 2611:aload_0         
	// 1398 2612:getfield        #12  <Field azh a>
	// 1399 2615:getfield        #162 <Field int azh.F>
	// 1400 2618:iand            
	// 1401 2619:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 1402 2622:aload_0         
	// 1403 2623:getfield        #12  <Field azh a>
	// 1404 2626:astore_1        
		abyte0.aU = ((azh) (abyte0)).af & ~a.ad;
	// 1405 2627:aload_1         
	// 1406 2628:aload_1         
	// 1407 2629:getfield        #111 <Field int azh.af>
	// 1408 2632:aload_0         
	// 1409 2633:getfield        #12  <Field azh a>
	// 1410 2636:getfield        #171 <Field int azh.ad>
	// 1411 2639:iconst_m1       
	// 1412 2640:ixor            
	// 1413 2641:iand            
	// 1414 2642:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 1415 2645:aload_0         
	// 1416 2646:getfield        #12  <Field azh a>
	// 1417 2649:astore_1        
		abyte0.aU = ((azh) (abyte0)).bW ^ a.aU;
	// 1418 2650:aload_1         
	// 1419 2651:aload_1         
	// 1420 2652:getfield        #159 <Field int azh.bW>
	// 1421 2655:aload_0         
	// 1422 2656:getfield        #12  <Field azh a>
	// 1423 2659:getfield        #35  <Field int azh.aU>
	// 1424 2662:ixor            
	// 1425 2663:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 1426 2666:aload_0         
	// 1427 2667:getfield        #12  <Field azh a>
	// 1428 2670:astore_1        
		abyte0.aU = ((azh) (abyte0)).al | a.aU;
	// 1429 2671:aload_1         
	// 1430 2672:aload_1         
	// 1431 2673:getfield        #177 <Field int azh.al>
	// 1432 2676:aload_0         
	// 1433 2677:getfield        #12  <Field azh a>
	// 1434 2680:getfield        #35  <Field int azh.aU>
	// 1435 2683:ior             
	// 1436 2684:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 1437 2687:aload_0         
	// 1438 2688:getfield        #12  <Field azh a>
	// 1439 2691:astore_1        
		abyte0.X = ((azh) (abyte0)).af ^ a.X;
	// 1440 2692:aload_1         
	// 1441 2693:aload_1         
	// 1442 2694:getfield        #111 <Field int azh.af>
	// 1443 2697:aload_0         
	// 1444 2698:getfield        #12  <Field azh a>
	// 1445 2701:getfield        #123 <Field int azh.X>
	// 1446 2704:ixor            
	// 1447 2705:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1448 2708:aload_0         
	// 1449 2709:getfield        #12  <Field azh a>
	// 1450 2712:astore_1        
		abyte0.aI = ((azh) (abyte0)).X & ~a.ad;
	// 1451 2713:aload_1         
	// 1452 2714:aload_1         
	// 1453 2715:getfield        #123 <Field int azh.X>
	// 1454 2718:aload_0         
	// 1455 2719:getfield        #12  <Field azh a>
	// 1456 2722:getfield        #171 <Field int azh.ad>
	// 1457 2725:iconst_m1       
	// 1458 2726:ixor            
	// 1459 2727:iand            
	// 1460 2728:putfield        #114 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1461 2731:aload_0         
	// 1462 2732:getfield        #12  <Field azh a>
	// 1463 2735:astore_1        
		abyte0.aI = ((azh) (abyte0)).bm ^ a.aI;
	// 1464 2736:aload_1         
	// 1465 2737:aload_1         
	// 1466 2738:getfield        #174 <Field int azh.bm>
	// 1467 2741:aload_0         
	// 1468 2742:getfield        #12  <Field azh a>
	// 1469 2745:getfield        #114 <Field int azh.aI>
	// 1470 2748:ixor            
	// 1471 2749:putfield        #114 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1472 2752:aload_0         
	// 1473 2753:getfield        #12  <Field azh a>
	// 1474 2756:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI & ~a.al;
	// 1475 2757:aload_1         
	// 1476 2758:aload_1         
	// 1477 2759:getfield        #114 <Field int azh.aI>
	// 1478 2762:aload_0         
	// 1479 2763:getfield        #12  <Field azh a>
	// 1480 2766:getfield        #177 <Field int azh.al>
	// 1481 2769:iconst_m1       
	// 1482 2770:ixor            
	// 1483 2771:iand            
	// 1484 2772:putfield        #114 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1485 2775:aload_0         
	// 1486 2776:getfield        #12  <Field azh a>
	// 1487 2779:astore_1        
		abyte0.X = ((azh) (abyte0)).X & a.ad;
	// 1488 2780:aload_1         
	// 1489 2781:aload_1         
	// 1490 2782:getfield        #123 <Field int azh.X>
	// 1491 2785:aload_0         
	// 1492 2786:getfield        #12  <Field azh a>
	// 1493 2789:getfield        #171 <Field int azh.ad>
	// 1494 2792:iand            
	// 1495 2793:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1496 2796:aload_0         
	// 1497 2797:getfield        #12  <Field azh a>
	// 1498 2800:astore_1        
		abyte0.X = ((azh) (abyte0)).ar ^ a.X;
	// 1499 2801:aload_1         
	// 1500 2802:aload_1         
	// 1501 2803:getfield        #180 <Field int azh.ar>
	// 1502 2806:aload_0         
	// 1503 2807:getfield        #12  <Field azh a>
	// 1504 2810:getfield        #123 <Field int azh.X>
	// 1505 2813:ixor            
	// 1506 2814:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1507 2817:aload_0         
	// 1508 2818:getfield        #12  <Field azh a>
	// 1509 2821:astore_1        
		abyte0.X = ((azh) (abyte0)).X & ~a.al;
	// 1510 2822:aload_1         
	// 1511 2823:aload_1         
	// 1512 2824:getfield        #123 <Field int azh.X>
	// 1513 2827:aload_0         
	// 1514 2828:getfield        #12  <Field azh a>
	// 1515 2831:getfield        #177 <Field int azh.al>
	// 1516 2834:iconst_m1       
	// 1517 2835:ixor            
	// 1518 2836:iand            
	// 1519 2837:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1520 2840:aload_0         
	// 1521 2841:getfield        #12  <Field azh a>
	// 1522 2844:astore_1        
		abyte0.X = ((azh) (abyte0)).ah ^ a.X;
	// 1523 2845:aload_1         
	// 1524 2846:aload_1         
	// 1525 2847:getfield        #144 <Field int azh.ah>
	// 1526 2850:aload_0         
	// 1527 2851:getfield        #12  <Field azh a>
	// 1528 2854:getfield        #123 <Field int azh.X>
	// 1529 2857:ixor            
	// 1530 2858:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1531 2861:aload_0         
	// 1532 2862:getfield        #12  <Field azh a>
	// 1533 2865:astore_1        
		abyte0.X = ((azh) (abyte0)).aL & a.X;
	// 1534 2866:aload_1         
	// 1535 2867:aload_1         
	// 1536 2868:getfield        #183 <Field int azh.aL>
	// 1537 2871:aload_0         
	// 1538 2872:getfield        #12  <Field azh a>
	// 1539 2875:getfield        #123 <Field int azh.X>
	// 1540 2878:iand            
	// 1541 2879:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1542 2882:aload_0         
	// 1543 2883:getfield        #12  <Field azh a>
	// 1544 2886:astore_1        
		abyte0.ah = ((azh) (abyte0)).V & a.af;
	// 1545 2887:aload_1         
	// 1546 2888:aload_1         
	// 1547 2889:getfield        #168 <Field int azh.V>
	// 1548 2892:aload_0         
	// 1549 2893:getfield        #12  <Field azh a>
	// 1550 2896:getfield        #111 <Field int azh.af>
	// 1551 2899:iand            
	// 1552 2900:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 1553 2903:aload_0         
	// 1554 2904:getfield        #12  <Field azh a>
	// 1555 2907:astore_1        
		abyte0.ah = ((azh) (abyte0)).N ^ a.ah;
	// 1556 2908:aload_1         
	// 1557 2909:aload_1         
	// 1558 2910:getfield        #165 <Field int azh.N>
	// 1559 2913:aload_0         
	// 1560 2914:getfield        #12  <Field azh a>
	// 1561 2917:getfield        #144 <Field int azh.ah>
	// 1562 2920:ixor            
	// 1563 2921:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 1564 2924:aload_0         
	// 1565 2925:getfield        #12  <Field azh a>
	// 1566 2928:astore_1        
		abyte0.ar = ((azh) (abyte0)).ah & a.ad;
	// 1567 2929:aload_1         
	// 1568 2930:aload_1         
	// 1569 2931:getfield        #144 <Field int azh.ah>
	// 1570 2934:aload_0         
	// 1571 2935:getfield        #12  <Field azh a>
	// 1572 2938:getfield        #171 <Field int azh.ad>
	// 1573 2941:iand            
	// 1574 2942:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1575 2945:aload_0         
	// 1576 2946:getfield        #12  <Field azh a>
	// 1577 2949:astore_1        
		abyte0.ah = ((azh) (abyte0)).ah & a.ad;
	// 1578 2950:aload_1         
	// 1579 2951:aload_1         
	// 1580 2952:getfield        #144 <Field int azh.ah>
	// 1581 2955:aload_0         
	// 1582 2956:getfield        #12  <Field azh a>
	// 1583 2959:getfield        #171 <Field int azh.ad>
	// 1584 2962:iand            
	// 1585 2963:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 1586 2966:aload_0         
	// 1587 2967:getfield        #12  <Field azh a>
	// 1588 2970:astore_1        
		abyte0.af = ((azh) (abyte0)).V & a.af;
	// 1589 2971:aload_1         
	// 1590 2972:aload_1         
	// 1591 2973:getfield        #168 <Field int azh.V>
	// 1592 2976:aload_0         
	// 1593 2977:getfield        #12  <Field azh a>
	// 1594 2980:getfield        #111 <Field int azh.af>
	// 1595 2983:iand            
	// 1596 2984:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 1597 2987:aload_0         
	// 1598 2988:getfield        #12  <Field azh a>
	// 1599 2991:astore_1        
		abyte0.bm = ((azh) (abyte0)).N & ~a.F;
	// 1600 2992:aload_1         
	// 1601 2993:aload_1         
	// 1602 2994:getfield        #165 <Field int azh.N>
	// 1603 2997:aload_0         
	// 1604 2998:getfield        #12  <Field azh a>
	// 1605 3001:getfield        #162 <Field int azh.F>
	// 1606 3004:iconst_m1       
	// 1607 3005:ixor            
	// 1608 3006:iand            
	// 1609 3007:putfield        #174 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1610 3010:aload_0         
	// 1611 3011:getfield        #12  <Field azh a>
	// 1612 3014:astore_1        
		abyte0.cj = ((azh) (abyte0)).ad & ~a.bm;
	// 1613 3015:aload_1         
	// 1614 3016:aload_1         
	// 1615 3017:getfield        #171 <Field int azh.ad>
	// 1616 3020:aload_0         
	// 1617 3021:getfield        #12  <Field azh a>
	// 1618 3024:getfield        #174 <Field int azh.bm>
	// 1619 3027:iconst_m1       
	// 1620 3028:ixor            
	// 1621 3029:iand            
	// 1622 3030:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1623 3033:aload_0         
	// 1624 3034:getfield        #12  <Field azh a>
	// 1625 3037:astore_1        
		abyte0.cj = ((azh) (abyte0)).bR ^ a.cj;
	// 1626 3038:aload_1         
	// 1627 3039:aload_1         
	// 1628 3040:getfield        #156 <Field int azh.bR>
	// 1629 3043:aload_0         
	// 1630 3044:getfield        #12  <Field azh a>
	// 1631 3047:getfield        #102 <Field int azh.cj>
	// 1632 3050:ixor            
	// 1633 3051:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1634 3054:aload_0         
	// 1635 3055:getfield        #12  <Field azh a>
	// 1636 3058:astore_1        
		abyte0.aU = ((azh) (abyte0)).cj ^ a.aU;
	// 1637 3059:aload_1         
	// 1638 3060:aload_1         
	// 1639 3061:getfield        #102 <Field int azh.cj>
	// 1640 3064:aload_0         
	// 1641 3065:getfield        #12  <Field azh a>
	// 1642 3068:getfield        #35  <Field int azh.aU>
	// 1643 3071:ixor            
	// 1644 3072:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 1645 3075:aload_0         
	// 1646 3076:getfield        #12  <Field azh a>
	// 1647 3079:astore_1        
		abyte0.cj = ((azh) (abyte0)).V & ~a.bm;
	// 1648 3080:aload_1         
	// 1649 3081:aload_1         
	// 1650 3082:getfield        #168 <Field int azh.V>
	// 1651 3085:aload_0         
	// 1652 3086:getfield        #12  <Field azh a>
	// 1653 3089:getfield        #174 <Field int azh.bm>
	// 1654 3092:iconst_m1       
	// 1655 3093:ixor            
	// 1656 3094:iand            
	// 1657 3095:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1658 3098:aload_0         
	// 1659 3099:getfield        #12  <Field azh a>
	// 1660 3102:astore_1        
		abyte0.cj = ((azh) (abyte0)).cd ^ a.cj;
	// 1661 3103:aload_1         
	// 1662 3104:aload_1         
	// 1663 3105:getfield        #141 <Field int azh.cd>
	// 1664 3108:aload_0         
	// 1665 3109:getfield        #12  <Field azh a>
	// 1666 3112:getfield        #102 <Field int azh.cj>
	// 1667 3115:ixor            
	// 1668 3116:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 1669 3119:aload_0         
	// 1670 3120:getfield        #12  <Field azh a>
	// 1671 3123:astore_1        
		abyte0.bO = ((azh) (abyte0)).cj ^ a.bO;
	// 1672 3124:aload_1         
	// 1673 3125:aload_1         
	// 1674 3126:getfield        #102 <Field int azh.cj>
	// 1675 3129:aload_0         
	// 1676 3130:getfield        #12  <Field azh a>
	// 1677 3133:getfield        #105 <Field int azh.bO>
	// 1678 3136:ixor            
	// 1679 3137:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1680 3140:aload_0         
	// 1681 3141:getfield        #12  <Field azh a>
	// 1682 3144:astore_1        
		abyte0.bg = ((azh) (abyte0)).bO ^ a.bg;
	// 1683 3145:aload_1         
	// 1684 3146:aload_1         
	// 1685 3147:getfield        #105 <Field int azh.bO>
	// 1686 3150:aload_0         
	// 1687 3151:getfield        #12  <Field azh a>
	// 1688 3154:getfield        #186 <Field int azh.bg>
	// 1689 3157:ixor            
	// 1690 3158:putfield        #186 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1691 3161:aload_0         
	// 1692 3162:getfield        #12  <Field azh a>
	// 1693 3165:astore_1        
		abyte0.X = ((azh) (abyte0)).bg ^ a.X;
	// 1694 3166:aload_1         
	// 1695 3167:aload_1         
	// 1696 3168:getfield        #186 <Field int azh.bg>
	// 1697 3171:aload_0         
	// 1698 3172:getfield        #12  <Field azh a>
	// 1699 3175:getfield        #123 <Field int azh.X>
	// 1700 3178:ixor            
	// 1701 3179:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1702 3182:aload_0         
	// 1703 3183:getfield        #12  <Field azh a>
	// 1704 3186:astore_1        
		abyte0.ae = ((azh) (abyte0)).X ^ a.ae;
	// 1705 3187:aload_1         
	// 1706 3188:aload_1         
	// 1707 3189:getfield        #123 <Field int azh.X>
	// 1708 3192:aload_0         
	// 1709 3193:getfield        #12  <Field azh a>
	// 1710 3196:getfield        #189 <Field int azh.ae>
	// 1711 3199:ixor            
	// 1712 3200:putfield        #189 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 1713 3203:aload_0         
	// 1714 3204:getfield        #12  <Field azh a>
	// 1715 3207:astore_1        
		abyte0.bm = ((azh) (abyte0)).V & a.bm;
	// 1716 3208:aload_1         
	// 1717 3209:aload_1         
	// 1718 3210:getfield        #168 <Field int azh.V>
	// 1719 3213:aload_0         
	// 1720 3214:getfield        #12  <Field azh a>
	// 1721 3217:getfield        #174 <Field int azh.bm>
	// 1722 3220:iand            
	// 1723 3221:putfield        #174 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1724 3224:aload_0         
	// 1725 3225:getfield        #12  <Field azh a>
	// 1726 3228:astore_1        
		abyte0.X = ((azh) (abyte0)).F | a.N;
	// 1727 3229:aload_1         
	// 1728 3230:aload_1         
	// 1729 3231:getfield        #162 <Field int azh.F>
	// 1730 3234:aload_0         
	// 1731 3235:getfield        #12  <Field azh a>
	// 1732 3238:getfield        #165 <Field int azh.N>
	// 1733 3241:ior             
	// 1734 3242:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1735 3245:aload_0         
	// 1736 3246:getfield        #12  <Field azh a>
	// 1737 3249:astore_1        
		abyte0.aB = ((azh) (abyte0)).X ^ a.aB;
	// 1738 3250:aload_1         
	// 1739 3251:aload_1         
	// 1740 3252:getfield        #123 <Field int azh.X>
	// 1741 3255:aload_0         
	// 1742 3256:getfield        #12  <Field azh a>
	// 1743 3259:getfield        #132 <Field int azh.aB>
	// 1744 3262:ixor            
	// 1745 3263:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1746 3266:aload_0         
	// 1747 3267:getfield        #12  <Field azh a>
	// 1748 3270:astore_1        
		abyte0.aN = ((azh) (abyte0)).aB ^ a.aN;
	// 1749 3271:aload_1         
	// 1750 3272:aload_1         
	// 1751 3273:getfield        #132 <Field int azh.aB>
	// 1752 3276:aload_0         
	// 1753 3277:getfield        #12  <Field azh a>
	// 1754 3280:getfield        #126 <Field int azh.aN>
	// 1755 3283:ixor            
	// 1756 3284:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1757 3287:aload_0         
	// 1758 3288:getfield        #12  <Field azh a>
	// 1759 3291:astore_1        
		abyte0.aN = ((azh) (abyte0)).al | a.aN;
	// 1760 3292:aload_1         
	// 1761 3293:aload_1         
	// 1762 3294:getfield        #177 <Field int azh.al>
	// 1763 3297:aload_0         
	// 1764 3298:getfield        #12  <Field azh a>
	// 1765 3301:getfield        #126 <Field int azh.aN>
	// 1766 3304:ior             
	// 1767 3305:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1768 3308:aload_0         
	// 1769 3309:getfield        #12  <Field azh a>
	// 1770 3312:astore_1        
		abyte0.aN = ((azh) (abyte0)).bM ^ a.aN;
	// 1771 3313:aload_1         
	// 1772 3314:aload_1         
	// 1773 3315:getfield        #153 <Field int azh.bM>
	// 1774 3318:aload_0         
	// 1775 3319:getfield        #12  <Field azh a>
	// 1776 3322:getfield        #126 <Field int azh.aN>
	// 1777 3325:ixor            
	// 1778 3326:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1779 3329:aload_0         
	// 1780 3330:getfield        #12  <Field azh a>
	// 1781 3333:astore_1        
		abyte0.ar = ((azh) (abyte0)).aB ^ a.ar;
	// 1782 3334:aload_1         
	// 1783 3335:aload_1         
	// 1784 3336:getfield        #132 <Field int azh.aB>
	// 1785 3339:aload_0         
	// 1786 3340:getfield        #12  <Field azh a>
	// 1787 3343:getfield        #180 <Field int azh.ar>
	// 1788 3346:ixor            
	// 1789 3347:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1790 3350:aload_0         
	// 1791 3351:getfield        #12  <Field azh a>
	// 1792 3354:astore_1        
		abyte0.aB = ((azh) (abyte0)).V & ~a.X;
	// 1793 3355:aload_1         
	// 1794 3356:aload_1         
	// 1795 3357:getfield        #168 <Field int azh.V>
	// 1796 3360:aload_0         
	// 1797 3361:getfield        #12  <Field azh a>
	// 1798 3364:getfield        #123 <Field int azh.X>
	// 1799 3367:iconst_m1       
	// 1800 3368:ixor            
	// 1801 3369:iand            
	// 1802 3370:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1803 3373:aload_0         
	// 1804 3374:getfield        #12  <Field azh a>
	// 1805 3377:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB & a.ad;
	// 1806 3378:aload_1         
	// 1807 3379:aload_1         
	// 1808 3380:getfield        #132 <Field int azh.aB>
	// 1809 3383:aload_0         
	// 1810 3384:getfield        #12  <Field azh a>
	// 1811 3387:getfield        #171 <Field int azh.ad>
	// 1812 3390:iand            
	// 1813 3391:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1814 3394:aload_0         
	// 1815 3395:getfield        #12  <Field azh a>
	// 1816 3398:astore_1        
		abyte0.aB = ((azh) (abyte0)).bm ^ a.aB;
	// 1817 3399:aload_1         
	// 1818 3400:aload_1         
	// 1819 3401:getfield        #174 <Field int azh.bm>
	// 1820 3404:aload_0         
	// 1821 3405:getfield        #12  <Field azh a>
	// 1822 3408:getfield        #132 <Field int azh.aB>
	// 1823 3411:ixor            
	// 1824 3412:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1825 3415:aload_0         
	// 1826 3416:getfield        #12  <Field azh a>
	// 1827 3419:astore_1        
		abyte0.aI = ((azh) (abyte0)).aB ^ a.aI;
	// 1828 3420:aload_1         
	// 1829 3421:aload_1         
	// 1830 3422:getfield        #132 <Field int azh.aB>
	// 1831 3425:aload_0         
	// 1832 3426:getfield        #12  <Field azh a>
	// 1833 3429:getfield        #114 <Field int azh.aI>
	// 1834 3432:ixor            
	// 1835 3433:putfield        #114 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1836 3436:aload_0         
	// 1837 3437:getfield        #12  <Field azh a>
	// 1838 3440:astore_1        
		abyte0.aI = ((azh) (abyte0)).aL & ~a.aI;
	// 1839 3441:aload_1         
	// 1840 3442:aload_1         
	// 1841 3443:getfield        #183 <Field int azh.aL>
	// 1842 3446:aload_0         
	// 1843 3447:getfield        #12  <Field azh a>
	// 1844 3450:getfield        #114 <Field int azh.aI>
	// 1845 3453:iconst_m1       
	// 1846 3454:ixor            
	// 1847 3455:iand            
	// 1848 3456:putfield        #114 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1849 3459:aload_0         
	// 1850 3460:getfield        #12  <Field azh a>
	// 1851 3463:astore_1        
		abyte0.aI = ((azh) (abyte0)).aU ^ a.aI;
	// 1852 3464:aload_1         
	// 1853 3465:aload_1         
	// 1854 3466:getfield        #35  <Field int azh.aU>
	// 1855 3469:aload_0         
	// 1856 3470:getfield        #12  <Field azh a>
	// 1857 3473:getfield        #114 <Field int azh.aI>
	// 1858 3476:ixor            
	// 1859 3477:putfield        #114 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1860 3480:aload_0         
	// 1861 3481:getfield        #12  <Field azh a>
	// 1862 3484:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI ^ a.i;
	// 1863 3485:aload_1         
	// 1864 3486:aload_1         
	// 1865 3487:getfield        #114 <Field int azh.aI>
	// 1866 3490:aload_0         
	// 1867 3491:getfield        #12  <Field azh a>
	// 1868 3494:getfield        #91  <Field int azh.i>
	// 1869 3497:ixor            
	// 1870 3498:putfield        #114 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1871 3501:aload_0         
	// 1872 3502:getfield        #12  <Field azh a>
	// 1873 3505:astore_1        
		abyte0.aU = ((azh) (abyte0)).aI & ~a.ay;
	// 1874 3506:aload_1         
	// 1875 3507:aload_1         
	// 1876 3508:getfield        #114 <Field int azh.aI>
	// 1877 3511:aload_0         
	// 1878 3512:getfield        #12  <Field azh a>
	// 1879 3515:getfield        #150 <Field int azh.ay>
	// 1880 3518:iconst_m1       
	// 1881 3519:ixor            
	// 1882 3520:iand            
	// 1883 3521:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 1884 3524:aload_0         
	// 1885 3525:getfield        #12  <Field azh a>
	// 1886 3528:astore_1        
		abyte0.ba = ((azh) (abyte0)).X ^ a.ba;
	// 1887 3529:aload_1         
	// 1888 3530:aload_1         
	// 1889 3531:getfield        #123 <Field int azh.X>
	// 1890 3534:aload_0         
	// 1891 3535:getfield        #12  <Field azh a>
	// 1892 3538:getfield        #192 <Field int azh.ba>
	// 1893 3541:ixor            
	// 1894 3542:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 1895 3545:aload_0         
	// 1896 3546:getfield        #12  <Field azh a>
	// 1897 3549:astore_1        
		abyte0.ah = ((azh) (abyte0)).ba ^ a.ah;
	// 1898 3550:aload_1         
	// 1899 3551:aload_1         
	// 1900 3552:getfield        #192 <Field int azh.ba>
	// 1901 3555:aload_0         
	// 1902 3556:getfield        #12  <Field azh a>
	// 1903 3559:getfield        #144 <Field int azh.ah>
	// 1904 3562:ixor            
	// 1905 3563:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 1906 3566:aload_0         
	// 1907 3567:getfield        #12  <Field azh a>
	// 1908 3570:astore_1        
		abyte0.ba = ((azh) (abyte0)).V & ~a.X;
	// 1909 3571:aload_1         
	// 1910 3572:aload_1         
	// 1911 3573:getfield        #168 <Field int azh.V>
	// 1912 3576:aload_0         
	// 1913 3577:getfield        #12  <Field azh a>
	// 1914 3580:getfield        #123 <Field int azh.X>
	// 1915 3583:iconst_m1       
	// 1916 3584:ixor            
	// 1917 3585:iand            
	// 1918 3586:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 1919 3589:aload_0         
	// 1920 3590:getfield        #12  <Field azh a>
	// 1921 3593:astore_1        
		abyte0.ba = ((azh) (abyte0)).cd ^ a.ba;
	// 1922 3594:aload_1         
	// 1923 3595:aload_1         
	// 1924 3596:getfield        #141 <Field int azh.cd>
	// 1925 3599:aload_0         
	// 1926 3600:getfield        #12  <Field azh a>
	// 1927 3603:getfield        #192 <Field int azh.ba>
	// 1928 3606:ixor            
	// 1929 3607:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 1930 3610:aload_0         
	// 1931 3611:getfield        #12  <Field azh a>
	// 1932 3614:astore_1        
		abyte0.af = ((azh) (abyte0)).X ^ a.af;
	// 1933 3615:aload_1         
	// 1934 3616:aload_1         
	// 1935 3617:getfield        #123 <Field int azh.X>
	// 1936 3620:aload_0         
	// 1937 3621:getfield        #12  <Field azh a>
	// 1938 3624:getfield        #111 <Field int azh.af>
	// 1939 3627:ixor            
	// 1940 3628:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 1941 3631:aload_0         
	// 1942 3632:getfield        #12  <Field azh a>
	// 1943 3635:astore_1        
		abyte0.af = ((azh) (abyte0)).ad & ~a.af;
	// 1944 3636:aload_1         
	// 1945 3637:aload_1         
	// 1946 3638:getfield        #171 <Field int azh.ad>
	// 1947 3641:aload_0         
	// 1948 3642:getfield        #12  <Field azh a>
	// 1949 3645:getfield        #111 <Field int azh.af>
	// 1950 3648:iconst_m1       
	// 1951 3649:ixor            
	// 1952 3650:iand            
	// 1953 3651:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 1954 3654:aload_0         
	// 1955 3655:getfield        #12  <Field azh a>
	// 1956 3658:astore_1        
		abyte0.af = ((azh) (abyte0)).bW ^ a.af;
	// 1957 3659:aload_1         
	// 1958 3660:aload_1         
	// 1959 3661:getfield        #159 <Field int azh.bW>
	// 1960 3664:aload_0         
	// 1961 3665:getfield        #12  <Field azh a>
	// 1962 3668:getfield        #111 <Field int azh.af>
	// 1963 3671:ixor            
	// 1964 3672:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 1965 3675:aload_0         
	// 1966 3676:getfield        #12  <Field azh a>
	// 1967 3679:astore_1        
		abyte0.aO = ((azh) (abyte0)).X ^ a.aO;
	// 1968 3680:aload_1         
	// 1969 3681:aload_1         
	// 1970 3682:getfield        #123 <Field int azh.X>
	// 1971 3685:aload_0         
	// 1972 3686:getfield        #12  <Field azh a>
	// 1973 3689:getfield        #117 <Field int azh.aO>
	// 1974 3692:ixor            
	// 1975 3693:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1976 3696:aload_0         
	// 1977 3697:getfield        #12  <Field azh a>
	// 1978 3700:astore_1        
		abyte0.X = ((azh) (abyte0)).ad & ~a.aO;
	// 1979 3701:aload_1         
	// 1980 3702:aload_1         
	// 1981 3703:getfield        #171 <Field int azh.ad>
	// 1982 3706:aload_0         
	// 1983 3707:getfield        #12  <Field azh a>
	// 1984 3710:getfield        #117 <Field int azh.aO>
	// 1985 3713:iconst_m1       
	// 1986 3714:ixor            
	// 1987 3715:iand            
	// 1988 3716:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 1989 3719:aload_0         
	// 1990 3720:getfield        #12  <Field azh a>
	// 1991 3723:astore_1        
		abyte0.X = ((azh) (abyte0)).ch ^ a.X;
	// 1992 3724:aload_1         
	// 1993 3725:aload_1         
	// 1994 3726:getfield        #135 <Field int azh.ch>
	// 1995 3729:aload_0         
	// 1996 3730:getfield        #12  <Field azh a>
	// 1997 3733:getfield        #123 <Field int azh.X>
	// 1998 3736:ixor            
	// 1999 3737:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2000 3740:aload_0         
	// 2001 3741:getfield        #12  <Field azh a>
	// 2002 3744:astore_1        
		abyte0.X = ((azh) (abyte0)).al | a.X;
	// 2003 3745:aload_1         
	// 2004 3746:aload_1         
	// 2005 3747:getfield        #177 <Field int azh.al>
	// 2006 3750:aload_0         
	// 2007 3751:getfield        #12  <Field azh a>
	// 2008 3754:getfield        #123 <Field int azh.X>
	// 2009 3757:ior             
	// 2010 3758:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2011 3761:aload_0         
	// 2012 3762:getfield        #12  <Field azh a>
	// 2013 3765:astore_1        
		abyte0.X = ((azh) (abyte0)).af ^ a.X;
	// 2014 3766:aload_1         
	// 2015 3767:aload_1         
	// 2016 3768:getfield        #111 <Field int azh.af>
	// 2017 3771:aload_0         
	// 2018 3772:getfield        #12  <Field azh a>
	// 2019 3775:getfield        #123 <Field int azh.X>
	// 2020 3778:ixor            
	// 2021 3779:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2022 3782:aload_0         
	// 2023 3783:getfield        #12  <Field azh a>
	// 2024 3786:astore_1        
		abyte0.X = ((azh) (abyte0)).aL & a.X;
	// 2025 3787:aload_1         
	// 2026 3788:aload_1         
	// 2027 3789:getfield        #183 <Field int azh.aL>
	// 2028 3792:aload_0         
	// 2029 3793:getfield        #12  <Field azh a>
	// 2030 3796:getfield        #123 <Field int azh.X>
	// 2031 3799:iand            
	// 2032 3800:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2033 3803:aload_0         
	// 2034 3804:getfield        #12  <Field azh a>
	// 2035 3807:astore_1        
		abyte0.aO = ((azh) (abyte0)).ad & ~a.aO;
	// 2036 3808:aload_1         
	// 2037 3809:aload_1         
	// 2038 3810:getfield        #171 <Field int azh.ad>
	// 2039 3813:aload_0         
	// 2040 3814:getfield        #12  <Field azh a>
	// 2041 3817:getfield        #117 <Field int azh.aO>
	// 2042 3820:iconst_m1       
	// 2043 3821:ixor            
	// 2044 3822:iand            
	// 2045 3823:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2046 3826:aload_0         
	// 2047 3827:getfield        #12  <Field azh a>
	// 2048 3830:astore_1        
		abyte0.aO = ((azh) (abyte0)).ba ^ a.aO;
	// 2049 3831:aload_1         
	// 2050 3832:aload_1         
	// 2051 3833:getfield        #192 <Field int azh.ba>
	// 2052 3836:aload_0         
	// 2053 3837:getfield        #12  <Field azh a>
	// 2054 3840:getfield        #117 <Field int azh.aO>
	// 2055 3843:ixor            
	// 2056 3844:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2057 3847:aload_0         
	// 2058 3848:getfield        #12  <Field azh a>
	// 2059 3851:astore_1        
		abyte0.aO = ((azh) (abyte0)).aO & ~a.al;
	// 2060 3852:aload_1         
	// 2061 3853:aload_1         
	// 2062 3854:getfield        #117 <Field int azh.aO>
	// 2063 3857:aload_0         
	// 2064 3858:getfield        #12  <Field azh a>
	// 2065 3861:getfield        #177 <Field int azh.al>
	// 2066 3864:iconst_m1       
	// 2067 3865:ixor            
	// 2068 3866:iand            
	// 2069 3867:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2070 3870:aload_0         
	// 2071 3871:getfield        #12  <Field azh a>
	// 2072 3874:astore_1        
		abyte0.aO = ((azh) (abyte0)).ah ^ a.aO;
	// 2073 3875:aload_1         
	// 2074 3876:aload_1         
	// 2075 3877:getfield        #144 <Field int azh.ah>
	// 2076 3880:aload_0         
	// 2077 3881:getfield        #12  <Field azh a>
	// 2078 3884:getfield        #117 <Field int azh.aO>
	// 2079 3887:ixor            
	// 2080 3888:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2081 3891:aload_0         
	// 2082 3892:getfield        #12  <Field azh a>
	// 2083 3895:astore_1        
		abyte0.aO = ((azh) (abyte0)).aL & ~a.aO;
	// 2084 3896:aload_1         
	// 2085 3897:aload_1         
	// 2086 3898:getfield        #183 <Field int azh.aL>
	// 2087 3901:aload_0         
	// 2088 3902:getfield        #12  <Field azh a>
	// 2089 3905:getfield        #117 <Field int azh.aO>
	// 2090 3908:iconst_m1       
	// 2091 3909:ixor            
	// 2092 3910:iand            
	// 2093 3911:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2094 3914:aload_0         
	// 2095 3915:getfield        #12  <Field azh a>
	// 2096 3918:astore_1        
		abyte0.aO = ((azh) (abyte0)).aN ^ a.aO;
	// 2097 3919:aload_1         
	// 2098 3920:aload_1         
	// 2099 3921:getfield        #126 <Field int azh.aN>
	// 2100 3924:aload_0         
	// 2101 3925:getfield        #12  <Field azh a>
	// 2102 3928:getfield        #117 <Field int azh.aO>
	// 2103 3931:ixor            
	// 2104 3932:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2105 3935:aload_0         
	// 2106 3936:getfield        #12  <Field azh a>
	// 2107 3939:astore_1        
		abyte0.k = ((azh) (abyte0)).aO ^ a.k;
	// 2108 3940:aload_1         
	// 2109 3941:aload_1         
	// 2110 3942:getfield        #117 <Field int azh.aO>
	// 2111 3945:aload_0         
	// 2112 3946:getfield        #12  <Field azh a>
	// 2113 3949:getfield        #195 <Field int azh.k>
	// 2114 3952:ixor            
	// 2115 3953:putfield        #195 <Field int azh.k>
		abyte0 = ((byte []) (a));
	// 2116 3956:aload_0         
	// 2117 3957:getfield        #12  <Field azh a>
	// 2118 3960:astore_1        
		abyte0.aO = ((azh) (abyte0)).ad & a.F;
	// 2119 3961:aload_1         
	// 2120 3962:aload_1         
	// 2121 3963:getfield        #171 <Field int azh.ad>
	// 2122 3966:aload_0         
	// 2123 3967:getfield        #12  <Field azh a>
	// 2124 3970:getfield        #162 <Field int azh.F>
	// 2125 3973:iand            
	// 2126 3974:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2127 3977:aload_0         
	// 2128 3978:getfield        #12  <Field azh a>
	// 2129 3981:astore_1        
		abyte0.aO = ((azh) (abyte0)).bR ^ a.aO;
	// 2130 3982:aload_1         
	// 2131 3983:aload_1         
	// 2132 3984:getfield        #156 <Field int azh.bR>
	// 2133 3987:aload_0         
	// 2134 3988:getfield        #12  <Field azh a>
	// 2135 3991:getfield        #117 <Field int azh.aO>
	// 2136 3994:ixor            
	// 2137 3995:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2138 3998:aload_0         
	// 2139 3999:getfield        #12  <Field azh a>
	// 2140 4002:astore_1        
		abyte0.aO = ((azh) (abyte0)).al | a.aO;
	// 2141 4003:aload_1         
	// 2142 4004:aload_1         
	// 2143 4005:getfield        #177 <Field int azh.al>
	// 2144 4008:aload_0         
	// 2145 4009:getfield        #12  <Field azh a>
	// 2146 4012:getfield        #117 <Field int azh.aO>
	// 2147 4015:ior             
	// 2148 4016:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2149 4019:aload_0         
	// 2150 4020:getfield        #12  <Field azh a>
	// 2151 4023:astore_1        
		abyte0.aO = ((azh) (abyte0)).ar ^ a.aO;
	// 2152 4024:aload_1         
	// 2153 4025:aload_1         
	// 2154 4026:getfield        #180 <Field int azh.ar>
	// 2155 4029:aload_0         
	// 2156 4030:getfield        #12  <Field azh a>
	// 2157 4033:getfield        #117 <Field int azh.aO>
	// 2158 4036:ixor            
	// 2159 4037:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2160 4040:aload_0         
	// 2161 4041:getfield        #12  <Field azh a>
	// 2162 4044:astore_1        
		abyte0.X = ((azh) (abyte0)).aO ^ a.X;
	// 2163 4045:aload_1         
	// 2164 4046:aload_1         
	// 2165 4047:getfield        #117 <Field int azh.aO>
	// 2166 4050:aload_0         
	// 2167 4051:getfield        #12  <Field azh a>
	// 2168 4054:getfield        #123 <Field int azh.X>
	// 2169 4057:ixor            
	// 2170 4058:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2171 4061:aload_0         
	// 2172 4062:getfield        #12  <Field azh a>
	// 2173 4065:astore_1        
		abyte0.bu = ((azh) (abyte0)).X ^ a.bu;
	// 2174 4066:aload_1         
	// 2175 4067:aload_1         
	// 2176 4068:getfield        #123 <Field int azh.X>
	// 2177 4071:aload_0         
	// 2178 4072:getfield        #12  <Field azh a>
	// 2179 4075:getfield        #198 <Field int azh.bu>
	// 2180 4078:ixor            
	// 2181 4079:putfield        #198 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 2182 4082:aload_0         
	// 2183 4083:getfield        #12  <Field azh a>
	// 2184 4086:astore_1        
		abyte0.J = ((azh) (abyte0)).a | a.J;
	// 2185 4087:aload_1         
	// 2186 4088:aload_1         
	// 2187 4089:getfield        #96  <Field int azh.a>
	// 2188 4092:aload_0         
	// 2189 4093:getfield        #12  <Field azh a>
	// 2190 4096:getfield        #201 <Field int azh.J>
	// 2191 4099:ior             
	// 2192 4100:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2193 4103:aload_0         
	// 2194 4104:getfield        #12  <Field azh a>
	// 2195 4107:astore_1        
		abyte0.J = ((azh) (abyte0)).aa ^ a.J;
	// 2196 4108:aload_1         
	// 2197 4109:aload_1         
	// 2198 4110:getfield        #204 <Field int azh.aa>
	// 2199 4113:aload_0         
	// 2200 4114:getfield        #12  <Field azh a>
	// 2201 4117:getfield        #201 <Field int azh.J>
	// 2202 4120:ixor            
	// 2203 4121:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2204 4124:aload_0         
	// 2205 4125:getfield        #12  <Field azh a>
	// 2206 4128:astore_1        
		abyte0.bo = ((azh) (abyte0)).J ^ a.bo;
	// 2207 4129:aload_1         
	// 2208 4130:aload_1         
	// 2209 4131:getfield        #201 <Field int azh.J>
	// 2210 4134:aload_0         
	// 2211 4135:getfield        #12  <Field azh a>
	// 2212 4138:getfield        #207 <Field int azh.bo>
	// 2213 4141:ixor            
	// 2214 4142:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 2215 4145:aload_0         
	// 2216 4146:getfield        #12  <Field azh a>
	// 2217 4149:astore_1        
		abyte0.aj = ((azh) (abyte0)).bo ^ a.aj;
	// 2218 4150:aload_1         
	// 2219 4151:aload_1         
	// 2220 4152:getfield        #207 <Field int azh.bo>
	// 2221 4155:aload_0         
	// 2222 4156:getfield        #12  <Field azh a>
	// 2223 4159:getfield        #210 <Field int azh.aj>
	// 2224 4162:ixor            
	// 2225 4163:putfield        #210 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 2226 4166:aload_0         
	// 2227 4167:getfield        #12  <Field azh a>
	// 2228 4170:astore_1        
		abyte0.bo = ((azh) (abyte0)).aj | a.h;
	// 2229 4171:aload_1         
	// 2230 4172:aload_1         
	// 2231 4173:getfield        #210 <Field int azh.aj>
	// 2232 4176:aload_0         
	// 2233 4177:getfield        #12  <Field azh a>
	// 2234 4180:getfield        #213 <Field int azh.h>
	// 2235 4183:ior             
	// 2236 4184:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 2237 4187:aload_0         
	// 2238 4188:getfield        #12  <Field azh a>
	// 2239 4191:astore_1        
		abyte0.bo = ((azh) (abyte0)).h ^ a.bo;
	// 2240 4192:aload_1         
	// 2241 4193:aload_1         
	// 2242 4194:getfield        #213 <Field int azh.h>
	// 2243 4197:aload_0         
	// 2244 4198:getfield        #12  <Field azh a>
	// 2245 4201:getfield        #207 <Field int azh.bo>
	// 2246 4204:ixor            
	// 2247 4205:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 2248 4208:aload_0         
	// 2249 4209:getfield        #12  <Field azh a>
	// 2250 4212:astore_1        
		abyte0.bo = ((azh) (abyte0)).p & a.bo;
	// 2251 4213:aload_1         
	// 2252 4214:aload_1         
	// 2253 4215:getfield        #216 <Field int azh.p>
	// 2254 4218:aload_0         
	// 2255 4219:getfield        #12  <Field azh a>
	// 2256 4222:getfield        #207 <Field int azh.bo>
	// 2257 4225:iand            
	// 2258 4226:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 2259 4229:aload_0         
	// 2260 4230:getfield        #12  <Field azh a>
	// 2261 4233:astore_1        
		abyte0.bo = ((azh) (abyte0)).aj ^ a.bo;
	// 2262 4234:aload_1         
	// 2263 4235:aload_1         
	// 2264 4236:getfield        #210 <Field int azh.aj>
	// 2265 4239:aload_0         
	// 2266 4240:getfield        #12  <Field azh a>
	// 2267 4243:getfield        #207 <Field int azh.bo>
	// 2268 4246:ixor            
	// 2269 4247:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 2270 4250:aload_0         
	// 2271 4251:getfield        #12  <Field azh a>
	// 2272 4254:astore_1        
		abyte0.J = ((azh) (abyte0)).am & ~a.aj;
	// 2273 4255:aload_1         
	// 2274 4256:aload_1         
	// 2275 4257:getfield        #219 <Field int azh.am>
	// 2276 4260:aload_0         
	// 2277 4261:getfield        #12  <Field azh a>
	// 2278 4264:getfield        #210 <Field int azh.aj>
	// 2279 4267:iconst_m1       
	// 2280 4268:ixor            
	// 2281 4269:iand            
	// 2282 4270:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2283 4273:aload_0         
	// 2284 4274:getfield        #12  <Field azh a>
	// 2285 4277:astore_1        
		abyte0.J = ((azh) (abyte0)).n ^ a.J;
	// 2286 4278:aload_1         
	// 2287 4279:aload_1         
	// 2288 4280:getfield        #222 <Field int azh.n>
	// 2289 4283:aload_0         
	// 2290 4284:getfield        #12  <Field azh a>
	// 2291 4287:getfield        #201 <Field int azh.J>
	// 2292 4290:ixor            
	// 2293 4291:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2294 4294:aload_0         
	// 2295 4295:getfield        #12  <Field azh a>
	// 2296 4298:astore_1        
		abyte0.aa = ((azh) (abyte0)).D & ~a.aj;
	// 2297 4299:aload_1         
	// 2298 4300:aload_1         
	// 2299 4301:getfield        #53  <Field int azh.D>
	// 2300 4304:aload_0         
	// 2301 4305:getfield        #12  <Field azh a>
	// 2302 4308:getfield        #210 <Field int azh.aj>
	// 2303 4311:iconst_m1       
	// 2304 4312:ixor            
	// 2305 4313:iand            
	// 2306 4314:putfield        #204 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 2307 4317:aload_0         
	// 2308 4318:getfield        #12  <Field azh a>
	// 2309 4321:astore_1        
		abyte0.aa = ((azh) (abyte0)).am ^ a.aa;
	// 2310 4322:aload_1         
	// 2311 4323:aload_1         
	// 2312 4324:getfield        #219 <Field int azh.am>
	// 2313 4327:aload_0         
	// 2314 4328:getfield        #12  <Field azh a>
	// 2315 4331:getfield        #204 <Field int azh.aa>
	// 2316 4334:ixor            
	// 2317 4335:putfield        #204 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 2318 4338:aload_0         
	// 2319 4339:getfield        #12  <Field azh a>
	// 2320 4342:astore_1        
		abyte0.X = ((azh) (abyte0)).ab & a.aa;
	// 2321 4343:aload_1         
	// 2322 4344:aload_1         
	// 2323 4345:getfield        #225 <Field int azh.ab>
	// 2324 4348:aload_0         
	// 2325 4349:getfield        #12  <Field azh a>
	// 2326 4352:getfield        #204 <Field int azh.aa>
	// 2327 4355:iand            
	// 2328 4356:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2329 4359:aload_0         
	// 2330 4360:getfield        #12  <Field azh a>
	// 2331 4363:astore_1        
		abyte0.aO = ((azh) (abyte0)).ab & ~a.aa;
	// 2332 4364:aload_1         
	// 2333 4365:aload_1         
	// 2334 4366:getfield        #225 <Field int azh.ab>
	// 2335 4369:aload_0         
	// 2336 4370:getfield        #12  <Field azh a>
	// 2337 4373:getfield        #204 <Field int azh.aa>
	// 2338 4376:iconst_m1       
	// 2339 4377:ixor            
	// 2340 4378:iand            
	// 2341 4379:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2342 4382:aload_0         
	// 2343 4383:getfield        #12  <Field azh a>
	// 2344 4386:astore_1        
		abyte0.ar = ((azh) (abyte0)).am & ~a.aj;
	// 2345 4387:aload_1         
	// 2346 4388:aload_1         
	// 2347 4389:getfield        #219 <Field int azh.am>
	// 2348 4392:aload_0         
	// 2349 4393:getfield        #12  <Field azh a>
	// 2350 4396:getfield        #210 <Field int azh.aj>
	// 2351 4399:iconst_m1       
	// 2352 4400:ixor            
	// 2353 4401:iand            
	// 2354 4402:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2355 4405:aload_0         
	// 2356 4406:getfield        #12  <Field azh a>
	// 2357 4409:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & ~a.ab;
	// 2358 4410:aload_1         
	// 2359 4411:aload_1         
	// 2360 4412:getfield        #180 <Field int azh.ar>
	// 2361 4415:aload_0         
	// 2362 4416:getfield        #12  <Field azh a>
	// 2363 4419:getfield        #225 <Field int azh.ab>
	// 2364 4422:iconst_m1       
	// 2365 4423:ixor            
	// 2366 4424:iand            
	// 2367 4425:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2368 4428:aload_0         
	// 2369 4429:getfield        #12  <Field azh a>
	// 2370 4432:astore_1        
		abyte0.ar = ((azh) (abyte0)).h & ~a.ar;
	// 2371 4433:aload_1         
	// 2372 4434:aload_1         
	// 2373 4435:getfield        #213 <Field int azh.h>
	// 2374 4438:aload_0         
	// 2375 4439:getfield        #12  <Field azh a>
	// 2376 4442:getfield        #180 <Field int azh.ar>
	// 2377 4445:iconst_m1       
	// 2378 4446:ixor            
	// 2379 4447:iand            
	// 2380 4448:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2381 4451:aload_0         
	// 2382 4452:getfield        #12  <Field azh a>
	// 2383 4455:astore_1        
		abyte0.bR = ((azh) (abyte0)).N & ~a.aj;
	// 2384 4456:aload_1         
	// 2385 4457:aload_1         
	// 2386 4458:getfield        #165 <Field int azh.N>
	// 2387 4461:aload_0         
	// 2388 4462:getfield        #12  <Field azh a>
	// 2389 4465:getfield        #210 <Field int azh.aj>
	// 2390 4468:iconst_m1       
	// 2391 4469:ixor            
	// 2392 4470:iand            
	// 2393 4471:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 2394 4474:aload_0         
	// 2395 4475:getfield        #12  <Field azh a>
	// 2396 4478:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR & ~a.F;
	// 2397 4479:aload_1         
	// 2398 4480:aload_1         
	// 2399 4481:getfield        #156 <Field int azh.bR>
	// 2400 4484:aload_0         
	// 2401 4485:getfield        #12  <Field azh a>
	// 2402 4488:getfield        #162 <Field int azh.F>
	// 2403 4491:iconst_m1       
	// 2404 4492:ixor            
	// 2405 4493:iand            
	// 2406 4494:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 2407 4497:aload_0         
	// 2408 4498:getfield        #12  <Field azh a>
	// 2409 4501:astore_1        
		abyte0.aN = ((azh) (abyte0)).aj | a.bI;
	// 2410 4502:aload_1         
	// 2411 4503:aload_1         
	// 2412 4504:getfield        #210 <Field int azh.aj>
	// 2413 4507:aload_0         
	// 2414 4508:getfield        #12  <Field azh a>
	// 2415 4511:getfield        #228 <Field int azh.bI>
	// 2416 4514:ior             
	// 2417 4515:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2418 4518:aload_0         
	// 2419 4519:getfield        #12  <Field azh a>
	// 2420 4522:astore_1        
		abyte0.aN = ((azh) (abyte0)).bw ^ a.aN;
	// 2421 4523:aload_1         
	// 2422 4524:aload_1         
	// 2423 4525:getfield        #231 <Field int azh.bw>
	// 2424 4528:aload_0         
	// 2425 4529:getfield        #12  <Field azh a>
	// 2426 4532:getfield        #126 <Field int azh.aN>
	// 2427 4535:ixor            
	// 2428 4536:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2429 4539:aload_0         
	// 2430 4540:getfield        #12  <Field azh a>
	// 2431 4543:astore_1        
		abyte0.ah = ((azh) (abyte0)).an & ~a.aj;
	// 2432 4544:aload_1         
	// 2433 4545:aload_1         
	// 2434 4546:getfield        #234 <Field int azh.an>
	// 2435 4549:aload_0         
	// 2436 4550:getfield        #12  <Field azh a>
	// 2437 4553:getfield        #210 <Field int azh.aj>
	// 2438 4556:iconst_m1       
	// 2439 4557:ixor            
	// 2440 4558:iand            
	// 2441 4559:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 2442 4562:aload_0         
	// 2443 4563:getfield        #12  <Field azh a>
	// 2444 4566:astore_1        
		abyte0.ah = ((azh) (abyte0)).bH ^ a.ah;
	// 2445 4567:aload_1         
	// 2446 4568:aload_1         
	// 2447 4569:getfield        #237 <Field int azh.bH>
	// 2448 4572:aload_0         
	// 2449 4573:getfield        #12  <Field azh a>
	// 2450 4576:getfield        #144 <Field int azh.ah>
	// 2451 4579:ixor            
	// 2452 4580:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 2453 4583:aload_0         
	// 2454 4584:getfield        #12  <Field azh a>
	// 2455 4587:astore_1        
		abyte0.ah = ((azh) (abyte0)).p & ~a.ah;
	// 2456 4588:aload_1         
	// 2457 4589:aload_1         
	// 2458 4590:getfield        #216 <Field int azh.p>
	// 2459 4593:aload_0         
	// 2460 4594:getfield        #12  <Field azh a>
	// 2461 4597:getfield        #144 <Field int azh.ah>
	// 2462 4600:iconst_m1       
	// 2463 4601:ixor            
	// 2464 4602:iand            
	// 2465 4603:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 2466 4606:aload_0         
	// 2467 4607:getfield        #12  <Field azh a>
	// 2468 4610:astore_1        
		abyte0.ba = ((azh) (abyte0)).n & ~a.aj;
	// 2469 4611:aload_1         
	// 2470 4612:aload_1         
	// 2471 4613:getfield        #222 <Field int azh.n>
	// 2472 4616:aload_0         
	// 2473 4617:getfield        #12  <Field azh a>
	// 2474 4620:getfield        #210 <Field int azh.aj>
	// 2475 4623:iconst_m1       
	// 2476 4624:ixor            
	// 2477 4625:iand            
	// 2478 4626:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2479 4629:aload_0         
	// 2480 4630:getfield        #12  <Field azh a>
	// 2481 4633:astore_1        
		abyte0.ba = ((azh) (abyte0)).L ^ a.ba;
	// 2482 4634:aload_1         
	// 2483 4635:aload_1         
	// 2484 4636:getfield        #56  <Field int azh.L>
	// 2485 4639:aload_0         
	// 2486 4640:getfield        #12  <Field azh a>
	// 2487 4643:getfield        #192 <Field int azh.ba>
	// 2488 4646:ixor            
	// 2489 4647:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2490 4650:aload_0         
	// 2491 4651:getfield        #12  <Field azh a>
	// 2492 4654:astore_1        
		abyte0.ba = ((azh) (abyte0)).ab & ~a.ba;
	// 2493 4655:aload_1         
	// 2494 4656:aload_1         
	// 2495 4657:getfield        #225 <Field int azh.ab>
	// 2496 4660:aload_0         
	// 2497 4661:getfield        #12  <Field azh a>
	// 2498 4664:getfield        #192 <Field int azh.ba>
	// 2499 4667:iconst_m1       
	// 2500 4668:ixor            
	// 2501 4669:iand            
	// 2502 4670:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2503 4673:aload_0         
	// 2504 4674:getfield        #12  <Field azh a>
	// 2505 4677:astore_1        
		abyte0.ba = ((azh) (abyte0)).J ^ a.ba;
	// 2506 4678:aload_1         
	// 2507 4679:aload_1         
	// 2508 4680:getfield        #201 <Field int azh.J>
	// 2509 4683:aload_0         
	// 2510 4684:getfield        #12  <Field azh a>
	// 2511 4687:getfield        #192 <Field int azh.ba>
	// 2512 4690:ixor            
	// 2513 4691:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2514 4694:aload_0         
	// 2515 4695:getfield        #12  <Field azh a>
	// 2516 4698:astore_1        
		abyte0.ba = ((azh) (abyte0)).h & a.ba;
	// 2517 4699:aload_1         
	// 2518 4700:aload_1         
	// 2519 4701:getfield        #213 <Field int azh.h>
	// 2520 4704:aload_0         
	// 2521 4705:getfield        #12  <Field azh a>
	// 2522 4708:getfield        #192 <Field int azh.ba>
	// 2523 4711:iand            
	// 2524 4712:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2525 4715:aload_0         
	// 2526 4716:getfield        #12  <Field azh a>
	// 2527 4719:astore_1        
		abyte0.J = ((azh) (abyte0)).aj | a.L;
	// 2528 4720:aload_1         
	// 2529 4721:aload_1         
	// 2530 4722:getfield        #210 <Field int azh.aj>
	// 2531 4725:aload_0         
	// 2532 4726:getfield        #12  <Field azh a>
	// 2533 4729:getfield        #56  <Field int azh.L>
	// 2534 4732:ior             
	// 2535 4733:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2536 4736:aload_0         
	// 2537 4737:getfield        #12  <Field azh a>
	// 2538 4740:astore_1        
		abyte0.J = ((azh) (abyte0)).b ^ a.J;
	// 2539 4741:aload_1         
	// 2540 4742:aload_1         
	// 2541 4743:getfield        #240 <Field int azh.b>
	// 2542 4746:aload_0         
	// 2543 4747:getfield        #12  <Field azh a>
	// 2544 4750:getfield        #201 <Field int azh.J>
	// 2545 4753:ixor            
	// 2546 4754:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2547 4757:aload_0         
	// 2548 4758:getfield        #12  <Field azh a>
	// 2549 4761:astore_1        
		abyte0.X = ((azh) (abyte0)).J ^ a.X;
	// 2550 4762:aload_1         
	// 2551 4763:aload_1         
	// 2552 4764:getfield        #201 <Field int azh.J>
	// 2553 4767:aload_0         
	// 2554 4768:getfield        #12  <Field azh a>
	// 2555 4771:getfield        #123 <Field int azh.X>
	// 2556 4774:ixor            
	// 2557 4775:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2558 4778:aload_0         
	// 2559 4779:getfield        #12  <Field azh a>
	// 2560 4782:astore_1        
		abyte0.J = ((azh) (abyte0)).am & ~a.aj;
	// 2561 4783:aload_1         
	// 2562 4784:aload_1         
	// 2563 4785:getfield        #219 <Field int azh.am>
	// 2564 4788:aload_0         
	// 2565 4789:getfield        #12  <Field azh a>
	// 2566 4792:getfield        #210 <Field int azh.aj>
	// 2567 4795:iconst_m1       
	// 2568 4796:ixor            
	// 2569 4797:iand            
	// 2570 4798:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2571 4801:aload_0         
	// 2572 4802:getfield        #12  <Field azh a>
	// 2573 4805:astore_1        
		abyte0.J = ((azh) (abyte0)).L ^ a.J;
	// 2574 4806:aload_1         
	// 2575 4807:aload_1         
	// 2576 4808:getfield        #56  <Field int azh.L>
	// 2577 4811:aload_0         
	// 2578 4812:getfield        #12  <Field azh a>
	// 2579 4815:getfield        #201 <Field int azh.J>
	// 2580 4818:ixor            
	// 2581 4819:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2582 4822:aload_0         
	// 2583 4823:getfield        #12  <Field azh a>
	// 2584 4826:astore_1        
		abyte0.J = ((azh) (abyte0)).ab & ~a.J;
	// 2585 4827:aload_1         
	// 2586 4828:aload_1         
	// 2587 4829:getfield        #225 <Field int azh.ab>
	// 2588 4832:aload_0         
	// 2589 4833:getfield        #12  <Field azh a>
	// 2590 4836:getfield        #201 <Field int azh.J>
	// 2591 4839:iconst_m1       
	// 2592 4840:ixor            
	// 2593 4841:iand            
	// 2594 4842:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 2595 4845:aload_0         
	// 2596 4846:getfield        #12  <Field azh a>
	// 2597 4849:astore_1        
		abyte0.af = ((azh) (abyte0)).N & ~a.aj;
	// 2598 4850:aload_1         
	// 2599 4851:aload_1         
	// 2600 4852:getfield        #165 <Field int azh.N>
	// 2601 4855:aload_0         
	// 2602 4856:getfield        #12  <Field azh a>
	// 2603 4859:getfield        #210 <Field int azh.aj>
	// 2604 4862:iconst_m1       
	// 2605 4863:ixor            
	// 2606 4864:iand            
	// 2607 4865:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 2608 4868:aload_0         
	// 2609 4869:getfield        #12  <Field azh a>
	// 2610 4872:astore_1        
		abyte0.af = ((azh) (abyte0)).an ^ a.af;
	// 2611 4873:aload_1         
	// 2612 4874:aload_1         
	// 2613 4875:getfield        #234 <Field int azh.an>
	// 2614 4878:aload_0         
	// 2615 4879:getfield        #12  <Field azh a>
	// 2616 4882:getfield        #111 <Field int azh.af>
	// 2617 4885:ixor            
	// 2618 4886:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 2619 4889:aload_0         
	// 2620 4890:getfield        #12  <Field azh a>
	// 2621 4893:astore_1        
		abyte0.af = ((azh) (abyte0)).af & a.p;
	// 2622 4894:aload_1         
	// 2623 4895:aload_1         
	// 2624 4896:getfield        #111 <Field int azh.af>
	// 2625 4899:aload_0         
	// 2626 4900:getfield        #12  <Field azh a>
	// 2627 4903:getfield        #216 <Field int azh.p>
	// 2628 4906:iand            
	// 2629 4907:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 2630 4910:aload_0         
	// 2631 4911:getfield        #12  <Field azh a>
	// 2632 4914:astore_1        
		abyte0.af = ((azh) (abyte0)).bL ^ a.af;
	// 2633 4915:aload_1         
	// 2634 4916:aload_1         
	// 2635 4917:getfield        #243 <Field int azh.bL>
	// 2636 4920:aload_0         
	// 2637 4921:getfield        #12  <Field azh a>
	// 2638 4924:getfield        #111 <Field int azh.af>
	// 2639 4927:ixor            
	// 2640 4928:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 2641 4931:aload_0         
	// 2642 4932:getfield        #12  <Field azh a>
	// 2643 4935:astore_1        
		abyte0.an = ((azh) (abyte0)).aj | a.bw;
	// 2644 4936:aload_1         
	// 2645 4937:aload_1         
	// 2646 4938:getfield        #210 <Field int azh.aj>
	// 2647 4941:aload_0         
	// 2648 4942:getfield        #12  <Field azh a>
	// 2649 4945:getfield        #231 <Field int azh.bw>
	// 2650 4948:ior             
	// 2651 4949:putfield        #234 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 2652 4952:aload_0         
	// 2653 4953:getfield        #12  <Field azh a>
	// 2654 4956:astore_1        
		abyte0.an = ((azh) (abyte0)).h ^ a.an;
	// 2655 4957:aload_1         
	// 2656 4958:aload_1         
	// 2657 4959:getfield        #213 <Field int azh.h>
	// 2658 4962:aload_0         
	// 2659 4963:getfield        #12  <Field azh a>
	// 2660 4966:getfield        #234 <Field int azh.an>
	// 2661 4969:ixor            
	// 2662 4970:putfield        #234 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 2663 4973:aload_0         
	// 2664 4974:getfield        #12  <Field azh a>
	// 2665 4977:astore_1        
		abyte0.ch = ((azh) (abyte0)).p | a.an;
	// 2666 4978:aload_1         
	// 2667 4979:aload_1         
	// 2668 4980:getfield        #216 <Field int azh.p>
	// 2669 4983:aload_0         
	// 2670 4984:getfield        #12  <Field azh a>
	// 2671 4987:getfield        #234 <Field int azh.an>
	// 2672 4990:ior             
	// 2673 4991:putfield        #135 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2674 4994:aload_0         
	// 2675 4995:getfield        #12  <Field azh a>
	// 2676 4998:astore_1        
		abyte0.ch = ((azh) (abyte0)).bL ^ a.ch;
	// 2677 4999:aload_1         
	// 2678 5000:aload_1         
	// 2679 5001:getfield        #243 <Field int azh.bL>
	// 2680 5004:aload_0         
	// 2681 5005:getfield        #12  <Field azh a>
	// 2682 5008:getfield        #135 <Field int azh.ch>
	// 2683 5011:ixor            
	// 2684 5012:putfield        #135 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2685 5015:aload_0         
	// 2686 5016:getfield        #12  <Field azh a>
	// 2687 5019:astore_1        
		abyte0.ch = ((azh) (abyte0)).ch & ~a.F;
	// 2688 5020:aload_1         
	// 2689 5021:aload_1         
	// 2690 5022:getfield        #135 <Field int azh.ch>
	// 2691 5025:aload_0         
	// 2692 5026:getfield        #12  <Field azh a>
	// 2693 5029:getfield        #162 <Field int azh.F>
	// 2694 5032:iconst_m1       
	// 2695 5033:ixor            
	// 2696 5034:iand            
	// 2697 5035:putfield        #135 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2698 5038:aload_0         
	// 2699 5039:getfield        #12  <Field azh a>
	// 2700 5042:astore_1        
		abyte0.an = ((azh) (abyte0)).an & ~a.p;
	// 2701 5043:aload_1         
	// 2702 5044:aload_1         
	// 2703 5045:getfield        #234 <Field int azh.an>
	// 2704 5048:aload_0         
	// 2705 5049:getfield        #12  <Field azh a>
	// 2706 5052:getfield        #216 <Field int azh.p>
	// 2707 5055:iconst_m1       
	// 2708 5056:ixor            
	// 2709 5057:iand            
	// 2710 5058:putfield        #234 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 2711 5061:aload_0         
	// 2712 5062:getfield        #12  <Field azh a>
	// 2713 5065:astore_1        
		abyte0.bI = ((azh) (abyte0)).bI & ~a.aj;
	// 2714 5066:aload_1         
	// 2715 5067:aload_1         
	// 2716 5068:getfield        #228 <Field int azh.bI>
	// 2717 5071:aload_0         
	// 2718 5072:getfield        #12  <Field azh a>
	// 2719 5075:getfield        #210 <Field int azh.aj>
	// 2720 5078:iconst_m1       
	// 2721 5079:ixor            
	// 2722 5080:iand            
	// 2723 5081:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2724 5084:aload_0         
	// 2725 5085:getfield        #12  <Field azh a>
	// 2726 5088:astore_1        
		abyte0.bI = ((azh) (abyte0)).N ^ a.bI;
	// 2727 5089:aload_1         
	// 2728 5090:aload_1         
	// 2729 5091:getfield        #165 <Field int azh.N>
	// 2730 5094:aload_0         
	// 2731 5095:getfield        #12  <Field azh a>
	// 2732 5098:getfield        #228 <Field int azh.bI>
	// 2733 5101:ixor            
	// 2734 5102:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2735 5105:aload_0         
	// 2736 5106:getfield        #12  <Field azh a>
	// 2737 5109:astore_1        
		abyte0.bI = ((azh) (abyte0)).p & ~a.bI;
	// 2738 5110:aload_1         
	// 2739 5111:aload_1         
	// 2740 5112:getfield        #216 <Field int azh.p>
	// 2741 5115:aload_0         
	// 2742 5116:getfield        #12  <Field azh a>
	// 2743 5119:getfield        #228 <Field int azh.bI>
	// 2744 5122:iconst_m1       
	// 2745 5123:ixor            
	// 2746 5124:iand            
	// 2747 5125:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2748 5128:aload_0         
	// 2749 5129:getfield        #12  <Field azh a>
	// 2750 5132:astore_1        
		abyte0.bI = ((azh) (abyte0)).aN ^ a.bI;
	// 2751 5133:aload_1         
	// 2752 5134:aload_1         
	// 2753 5135:getfield        #126 <Field int azh.aN>
	// 2754 5138:aload_0         
	// 2755 5139:getfield        #12  <Field azh a>
	// 2756 5142:getfield        #228 <Field int azh.bI>
	// 2757 5145:ixor            
	// 2758 5146:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2759 5149:aload_0         
	// 2760 5150:getfield        #12  <Field azh a>
	// 2761 5153:astore_1        
		abyte0.bI = ((azh) (abyte0)).F | a.bI;
	// 2762 5154:aload_1         
	// 2763 5155:aload_1         
	// 2764 5156:getfield        #162 <Field int azh.F>
	// 2765 5159:aload_0         
	// 2766 5160:getfield        #12  <Field azh a>
	// 2767 5163:getfield        #228 <Field int azh.bI>
	// 2768 5166:ior             
	// 2769 5167:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2770 5170:aload_0         
	// 2771 5171:getfield        #12  <Field azh a>
	// 2772 5174:astore_1        
		abyte0.aN = ((azh) (abyte0)).aj | a.bN;
	// 2773 5175:aload_1         
	// 2774 5176:aload_1         
	// 2775 5177:getfield        #210 <Field int azh.aj>
	// 2776 5180:aload_0         
	// 2777 5181:getfield        #12  <Field azh a>
	// 2778 5184:getfield        #246 <Field int azh.bN>
	// 2779 5187:ior             
	// 2780 5188:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2781 5191:aload_0         
	// 2782 5192:getfield        #12  <Field azh a>
	// 2783 5195:astore_1        
		abyte0.aN = ((azh) (abyte0)).am ^ a.aN;
	// 2784 5196:aload_1         
	// 2785 5197:aload_1         
	// 2786 5198:getfield        #219 <Field int azh.am>
	// 2787 5201:aload_0         
	// 2788 5202:getfield        #12  <Field azh a>
	// 2789 5205:getfield        #126 <Field int azh.aN>
	// 2790 5208:ixor            
	// 2791 5209:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2792 5212:aload_0         
	// 2793 5213:getfield        #12  <Field azh a>
	// 2794 5216:astore_1        
		abyte0.bW = ((azh) (abyte0)).L ^ a.aj;
	// 2795 5217:aload_1         
	// 2796 5218:aload_1         
	// 2797 5219:getfield        #56  <Field int azh.L>
	// 2798 5222:aload_0         
	// 2799 5223:getfield        #12  <Field azh a>
	// 2800 5226:getfield        #210 <Field int azh.aj>
	// 2801 5229:ixor            
	// 2802 5230:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 2803 5233:aload_0         
	// 2804 5234:getfield        #12  <Field azh a>
	// 2805 5237:astore_1        
		abyte0.W = ((azh) (abyte0)).aj | a.W;
	// 2806 5238:aload_1         
	// 2807 5239:aload_1         
	// 2808 5240:getfield        #210 <Field int azh.aj>
	// 2809 5243:aload_0         
	// 2810 5244:getfield        #12  <Field azh a>
	// 2811 5247:getfield        #249 <Field int azh.W>
	// 2812 5250:ior             
	// 2813 5251:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2814 5254:aload_0         
	// 2815 5255:getfield        #12  <Field azh a>
	// 2816 5258:astore_1        
		abyte0.W = ((azh) (abyte0)).h ^ a.W;
	// 2817 5259:aload_1         
	// 2818 5260:aload_1         
	// 2819 5261:getfield        #213 <Field int azh.h>
	// 2820 5264:aload_0         
	// 2821 5265:getfield        #12  <Field azh a>
	// 2822 5268:getfield        #249 <Field int azh.W>
	// 2823 5271:ixor            
	// 2824 5272:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2825 5275:aload_0         
	// 2826 5276:getfield        #12  <Field azh a>
	// 2827 5279:astore_1        
		abyte0.bN = ((azh) (abyte0)).aj | a.bN;
	// 2828 5280:aload_1         
	// 2829 5281:aload_1         
	// 2830 5282:getfield        #210 <Field int azh.aj>
	// 2831 5285:aload_0         
	// 2832 5286:getfield        #12  <Field azh a>
	// 2833 5289:getfield        #246 <Field int azh.bN>
	// 2834 5292:ior             
	// 2835 5293:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2836 5296:aload_0         
	// 2837 5297:getfield        #12  <Field azh a>
	// 2838 5300:astore_1        
		abyte0.bN = ((azh) (abyte0)).n ^ a.bN;
	// 2839 5301:aload_1         
	// 2840 5302:aload_1         
	// 2841 5303:getfield        #222 <Field int azh.n>
	// 2842 5306:aload_0         
	// 2843 5307:getfield        #12  <Field azh a>
	// 2844 5310:getfield        #246 <Field int azh.bN>
	// 2845 5313:ixor            
	// 2846 5314:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2847 5317:aload_0         
	// 2848 5318:getfield        #12  <Field azh a>
	// 2849 5321:astore_1        
		abyte0.aO = ((azh) (abyte0)).bN ^ a.aO;
	// 2850 5322:aload_1         
	// 2851 5323:aload_1         
	// 2852 5324:getfield        #246 <Field int azh.bN>
	// 2853 5327:aload_0         
	// 2854 5328:getfield        #12  <Field azh a>
	// 2855 5331:getfield        #117 <Field int azh.aO>
	// 2856 5334:ixor            
	// 2857 5335:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2858 5338:aload_0         
	// 2859 5339:getfield        #12  <Field azh a>
	// 2860 5342:astore_1        
		abyte0.bN = ((azh) (abyte0)).bL & ~a.aj;
	// 2861 5343:aload_1         
	// 2862 5344:aload_1         
	// 2863 5345:getfield        #243 <Field int azh.bL>
	// 2864 5348:aload_0         
	// 2865 5349:getfield        #12  <Field azh a>
	// 2866 5352:getfield        #210 <Field int azh.aj>
	// 2867 5355:iconst_m1       
	// 2868 5356:ixor            
	// 2869 5357:iand            
	// 2870 5358:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2871 5361:aload_0         
	// 2872 5362:getfield        #12  <Field azh a>
	// 2873 5365:astore_1        
		abyte0.bN = ((azh) (abyte0)).bL ^ a.bN;
	// 2874 5366:aload_1         
	// 2875 5367:aload_1         
	// 2876 5368:getfield        #243 <Field int azh.bL>
	// 2877 5371:aload_0         
	// 2878 5372:getfield        #12  <Field azh a>
	// 2879 5375:getfield        #246 <Field int azh.bN>
	// 2880 5378:ixor            
	// 2881 5379:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2882 5382:aload_0         
	// 2883 5383:getfield        #12  <Field azh a>
	// 2884 5386:astore_1        
		abyte0.bN = ((azh) (abyte0)).bN & ~a.p;
	// 2885 5387:aload_1         
	// 2886 5388:aload_1         
	// 2887 5389:getfield        #246 <Field int azh.bN>
	// 2888 5392:aload_0         
	// 2889 5393:getfield        #12  <Field azh a>
	// 2890 5396:getfield        #216 <Field int azh.p>
	// 2891 5399:iconst_m1       
	// 2892 5400:ixor            
	// 2893 5401:iand            
	// 2894 5402:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2895 5405:aload_0         
	// 2896 5406:getfield        #12  <Field azh a>
	// 2897 5409:astore_1        
		abyte0.bN = ((azh) (abyte0)).F | a.bN;
	// 2898 5410:aload_1         
	// 2899 5411:aload_1         
	// 2900 5412:getfield        #162 <Field int azh.F>
	// 2901 5415:aload_0         
	// 2902 5416:getfield        #12  <Field azh a>
	// 2903 5419:getfield        #246 <Field int azh.bN>
	// 2904 5422:ior             
	// 2905 5423:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2906 5426:aload_0         
	// 2907 5427:getfield        #12  <Field azh a>
	// 2908 5430:astore_1        
		abyte0.cd = ((azh) (abyte0)).D & ~a.aj;
	// 2909 5431:aload_1         
	// 2910 5432:aload_1         
	// 2911 5433:getfield        #53  <Field int azh.D>
	// 2912 5436:aload_0         
	// 2913 5437:getfield        #12  <Field azh a>
	// 2914 5440:getfield        #210 <Field int azh.aj>
	// 2915 5443:iconst_m1       
	// 2916 5444:ixor            
	// 2917 5445:iand            
	// 2918 5446:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 2919 5449:aload_0         
	// 2920 5450:getfield        #12  <Field azh a>
	// 2921 5453:astore_1        
		abyte0.cd = ((azh) (abyte0)).B ^ a.cd;
	// 2922 5454:aload_1         
	// 2923 5455:aload_1         
	// 2924 5456:getfield        #252 <Field int azh.B>
	// 2925 5459:aload_0         
	// 2926 5460:getfield        #12  <Field azh a>
	// 2927 5463:getfield        #141 <Field int azh.cd>
	// 2928 5466:ixor            
	// 2929 5467:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 2930 5470:aload_0         
	// 2931 5471:getfield        #12  <Field azh a>
	// 2932 5474:astore_1        
		abyte0.cd = ((azh) (abyte0)).ab & ~a.cd;
	// 2933 5475:aload_1         
	// 2934 5476:aload_1         
	// 2935 5477:getfield        #225 <Field int azh.ab>
	// 2936 5480:aload_0         
	// 2937 5481:getfield        #12  <Field azh a>
	// 2938 5484:getfield        #141 <Field int azh.cd>
	// 2939 5487:iconst_m1       
	// 2940 5488:ixor            
	// 2941 5489:iand            
	// 2942 5490:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 2943 5493:aload_0         
	// 2944 5494:getfield        #12  <Field azh a>
	// 2945 5497:astore_1        
		abyte0.B = ((azh) (abyte0)).D ^ a.aj;
	// 2946 5498:aload_1         
	// 2947 5499:aload_1         
	// 2948 5500:getfield        #53  <Field int azh.D>
	// 2949 5503:aload_0         
	// 2950 5504:getfield        #12  <Field azh a>
	// 2951 5507:getfield        #210 <Field int azh.aj>
	// 2952 5510:ixor            
	// 2953 5511:putfield        #252 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 2954 5514:aload_0         
	// 2955 5515:getfield        #12  <Field azh a>
	// 2956 5518:astore_1        
		abyte0.aC = ((azh) (abyte0)).B ^ a.aC;
	// 2957 5519:aload_1         
	// 2958 5520:aload_1         
	// 2959 5521:getfield        #252 <Field int azh.B>
	// 2960 5524:aload_0         
	// 2961 5525:getfield        #12  <Field azh a>
	// 2962 5528:getfield        #255 <Field int azh.aC>
	// 2963 5531:ixor            
	// 2964 5532:putfield        #255 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2965 5535:aload_0         
	// 2966 5536:getfield        #12  <Field azh a>
	// 2967 5539:astore_1        
		abyte0.ba = ((azh) (abyte0)).aC ^ a.ba;
	// 2968 5540:aload_1         
	// 2969 5541:aload_1         
	// 2970 5542:getfield        #255 <Field int azh.aC>
	// 2971 5545:aload_0         
	// 2972 5546:getfield        #12  <Field azh a>
	// 2973 5549:getfield        #192 <Field int azh.ba>
	// 2974 5552:ixor            
	// 2975 5553:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2976 5556:aload_0         
	// 2977 5557:getfield        #12  <Field azh a>
	// 2978 5560:astore_1        
		abyte0.bL = ((azh) (abyte0)).aj | a.bL;
	// 2979 5561:aload_1         
	// 2980 5562:aload_1         
	// 2981 5563:getfield        #210 <Field int azh.aj>
	// 2982 5566:aload_0         
	// 2983 5567:getfield        #12  <Field azh a>
	// 2984 5570:getfield        #243 <Field int azh.bL>
	// 2985 5573:ior             
	// 2986 5574:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2987 5577:aload_0         
	// 2988 5578:getfield        #12  <Field azh a>
	// 2989 5581:astore_1        
		abyte0.bL = ((azh) (abyte0)).av ^ a.bL;
	// 2990 5582:aload_1         
	// 2991 5583:aload_1         
	// 2992 5584:getfield        #258 <Field int azh.av>
	// 2993 5587:aload_0         
	// 2994 5588:getfield        #12  <Field azh a>
	// 2995 5591:getfield        #243 <Field int azh.bL>
	// 2996 5594:ixor            
	// 2997 5595:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2998 5598:aload_0         
	// 2999 5599:getfield        #12  <Field azh a>
	// 3000 5602:astore_1        
		abyte0.bL = ((azh) (abyte0)).F | a.bL;
	// 3001 5603:aload_1         
	// 3002 5604:aload_1         
	// 3003 5605:getfield        #162 <Field int azh.F>
	// 3004 5608:aload_0         
	// 3005 5609:getfield        #12  <Field azh a>
	// 3006 5612:getfield        #243 <Field int azh.bL>
	// 3007 5615:ior             
	// 3008 5616:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3009 5619:aload_0         
	// 3010 5620:getfield        #12  <Field azh a>
	// 3011 5623:astore_1        
		abyte0.bL = ((azh) (abyte0)).W ^ a.bL;
	// 3012 5624:aload_1         
	// 3013 5625:aload_1         
	// 3014 5626:getfield        #249 <Field int azh.W>
	// 3015 5629:aload_0         
	// 3016 5630:getfield        #12  <Field azh a>
	// 3017 5633:getfield        #243 <Field int azh.bL>
	// 3018 5636:ixor            
	// 3019 5637:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3020 5640:aload_0         
	// 3021 5641:getfield        #12  <Field azh a>
	// 3022 5644:astore_1        
		abyte0.bL = ((azh) (abyte0)).x | a.bL;
	// 3023 5645:aload_1         
	// 3024 5646:aload_1         
	// 3025 5647:getfield        #261 <Field int azh.x>
	// 3026 5650:aload_0         
	// 3027 5651:getfield        #12  <Field azh a>
	// 3028 5654:getfield        #243 <Field int azh.bL>
	// 3029 5657:ior             
	// 3030 5658:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3031 5661:aload_0         
	// 3032 5662:getfield        #12  <Field azh a>
	// 3033 5665:astore_1        
		abyte0.bc = ((azh) (abyte0)).bc & ~a.aj;
	// 3034 5666:aload_1         
	// 3035 5667:aload_1         
	// 3036 5668:getfield        #264 <Field int azh.bc>
	// 3037 5671:aload_0         
	// 3038 5672:getfield        #12  <Field azh a>
	// 3039 5675:getfield        #210 <Field int azh.aj>
	// 3040 5678:iconst_m1       
	// 3041 5679:ixor            
	// 3042 5680:iand            
	// 3043 5681:putfield        #264 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 3044 5684:aload_0         
	// 3045 5685:getfield        #12  <Field azh a>
	// 3046 5688:astore_1        
		abyte0.bc = ((azh) (abyte0)).L ^ a.bc;
	// 3047 5689:aload_1         
	// 3048 5690:aload_1         
	// 3049 5691:getfield        #56  <Field int azh.L>
	// 3050 5694:aload_0         
	// 3051 5695:getfield        #12  <Field azh a>
	// 3052 5698:getfield        #264 <Field int azh.bc>
	// 3053 5701:ixor            
	// 3054 5702:putfield        #264 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 3055 5705:aload_0         
	// 3056 5706:getfield        #12  <Field azh a>
	// 3057 5709:astore_1        
		abyte0.bc = ((azh) (abyte0)).ab & ~a.bc;
	// 3058 5710:aload_1         
	// 3059 5711:aload_1         
	// 3060 5712:getfield        #225 <Field int azh.ab>
	// 3061 5715:aload_0         
	// 3062 5716:getfield        #12  <Field azh a>
	// 3063 5719:getfield        #264 <Field int azh.bc>
	// 3064 5722:iconst_m1       
	// 3065 5723:ixor            
	// 3066 5724:iand            
	// 3067 5725:putfield        #264 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 3068 5728:aload_0         
	// 3069 5729:getfield        #12  <Field azh a>
	// 3070 5732:astore_1        
		abyte0.bc = ((azh) (abyte0)).bW ^ a.bc;
	// 3071 5733:aload_1         
	// 3072 5734:aload_1         
	// 3073 5735:getfield        #159 <Field int azh.bW>
	// 3074 5738:aload_0         
	// 3075 5739:getfield        #12  <Field azh a>
	// 3076 5742:getfield        #264 <Field int azh.bc>
	// 3077 5745:ixor            
	// 3078 5746:putfield        #264 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 3079 5749:aload_0         
	// 3080 5750:getfield        #12  <Field azh a>
	// 3081 5753:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH ^ a.aj;
	// 3082 5754:aload_1         
	// 3083 5755:aload_1         
	// 3084 5756:getfield        #237 <Field int azh.bH>
	// 3085 5759:aload_0         
	// 3086 5760:getfield        #12  <Field azh a>
	// 3087 5763:getfield        #210 <Field int azh.aj>
	// 3088 5766:ixor            
	// 3089 5767:putfield        #237 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 3090 5770:aload_0         
	// 3091 5771:getfield        #12  <Field azh a>
	// 3092 5774:astore_1        
		abyte0.ah = ((azh) (abyte0)).bH ^ a.ah;
	// 3093 5775:aload_1         
	// 3094 5776:aload_1         
	// 3095 5777:getfield        #237 <Field int azh.bH>
	// 3096 5780:aload_0         
	// 3097 5781:getfield        #12  <Field azh a>
	// 3098 5784:getfield        #144 <Field int azh.ah>
	// 3099 5787:ixor            
	// 3100 5788:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 3101 5791:aload_0         
	// 3102 5792:getfield        #12  <Field azh a>
	// 3103 5795:astore_1        
		abyte0.bI = ((azh) (abyte0)).ah ^ a.bI;
	// 3104 5796:aload_1         
	// 3105 5797:aload_1         
	// 3106 5798:getfield        #144 <Field int azh.ah>
	// 3107 5801:aload_0         
	// 3108 5802:getfield        #12  <Field azh a>
	// 3109 5805:getfield        #228 <Field int azh.bI>
	// 3110 5808:ixor            
	// 3111 5809:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 3112 5812:aload_0         
	// 3113 5813:getfield        #12  <Field azh a>
	// 3114 5816:astore_1        
		abyte0.bL = ((azh) (abyte0)).bI ^ a.bL;
	// 3115 5817:aload_1         
	// 3116 5818:aload_1         
	// 3117 5819:getfield        #228 <Field int azh.bI>
	// 3118 5822:aload_0         
	// 3119 5823:getfield        #12  <Field azh a>
	// 3120 5826:getfield        #243 <Field int azh.bL>
	// 3121 5829:ixor            
	// 3122 5830:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3123 5833:aload_0         
	// 3124 5834:getfield        #12  <Field azh a>
	// 3125 5837:astore_1        
		abyte0.Y = ((azh) (abyte0)).bL ^ a.Y;
	// 3126 5838:aload_1         
	// 3127 5839:aload_1         
	// 3128 5840:getfield        #243 <Field int azh.bL>
	// 3129 5843:aload_0         
	// 3130 5844:getfield        #12  <Field azh a>
	// 3131 5847:getfield        #267 <Field int azh.Y>
	// 3132 5850:ixor            
	// 3133 5851:putfield        #267 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 3134 5854:aload_0         
	// 3135 5855:getfield        #12  <Field azh a>
	// 3136 5858:astore_1        
		abyte0.bL = ((azh) (abyte0)).Y | a.I;
	// 3137 5859:aload_1         
	// 3138 5860:aload_1         
	// 3139 5861:getfield        #267 <Field int azh.Y>
	// 3140 5864:aload_0         
	// 3141 5865:getfield        #12  <Field azh a>
	// 3142 5868:getfield        #88  <Field int azh.I>
	// 3143 5871:ior             
	// 3144 5872:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3145 5875:aload_0         
	// 3146 5876:getfield        #12  <Field azh a>
	// 3147 5879:astore_1        
		abyte0.bI = ((azh) (abyte0)).Y | a.I;
	// 3148 5880:aload_1         
	// 3149 5881:aload_1         
	// 3150 5882:getfield        #267 <Field int azh.Y>
	// 3151 5885:aload_0         
	// 3152 5886:getfield        #12  <Field azh a>
	// 3153 5889:getfield        #88  <Field int azh.I>
	// 3154 5892:ior             
	// 3155 5893:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 3156 5896:aload_0         
	// 3157 5897:getfield        #12  <Field azh a>
	// 3158 5900:astore_1        
		abyte0.ah = ((azh) (abyte0)).Y | a.I;
	// 3159 5901:aload_1         
	// 3160 5902:aload_1         
	// 3161 5903:getfield        #267 <Field int azh.Y>
	// 3162 5906:aload_0         
	// 3163 5907:getfield        #12  <Field azh a>
	// 3164 5910:getfield        #88  <Field int azh.I>
	// 3165 5913:ior             
	// 3166 5914:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 3167 5917:aload_0         
	// 3168 5918:getfield        #12  <Field azh a>
	// 3169 5921:astore_1        
		abyte0.bH = ((azh) (abyte0)).I & ~a.Y;
	// 3170 5922:aload_1         
	// 3171 5923:aload_1         
	// 3172 5924:getfield        #88  <Field int azh.I>
	// 3173 5927:aload_0         
	// 3174 5928:getfield        #12  <Field azh a>
	// 3175 5931:getfield        #267 <Field int azh.Y>
	// 3176 5934:iconst_m1       
	// 3177 5935:ixor            
	// 3178 5936:iand            
	// 3179 5937:putfield        #237 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 3180 5940:aload_0         
	// 3181 5941:getfield        #12  <Field azh a>
	// 3182 5944:astore_1        
		abyte0.aA = ((azh) (abyte0)).aA ^ a.aj;
	// 3183 5945:aload_1         
	// 3184 5946:aload_1         
	// 3185 5947:getfield        #270 <Field int azh.aA>
	// 3186 5950:aload_0         
	// 3187 5951:getfield        #12  <Field azh a>
	// 3188 5954:getfield        #210 <Field int azh.aj>
	// 3189 5957:ixor            
	// 3190 5958:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3191 5961:aload_0         
	// 3192 5962:getfield        #12  <Field azh a>
	// 3193 5965:astore_1        
		abyte0.bW = ((azh) (abyte0)).ab & a.aA;
	// 3194 5966:aload_1         
	// 3195 5967:aload_1         
	// 3196 5968:getfield        #225 <Field int azh.ab>
	// 3197 5971:aload_0         
	// 3198 5972:getfield        #12  <Field azh a>
	// 3199 5975:getfield        #270 <Field int azh.aA>
	// 3200 5978:iand            
	// 3201 5979:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3202 5982:aload_0         
	// 3203 5983:getfield        #12  <Field azh a>
	// 3204 5986:astore_1        
		abyte0.bW = ((azh) (abyte0)).aN ^ a.bW;
	// 3205 5987:aload_1         
	// 3206 5988:aload_1         
	// 3207 5989:getfield        #126 <Field int azh.aN>
	// 3208 5992:aload_0         
	// 3209 5993:getfield        #12  <Field azh a>
	// 3210 5996:getfield        #159 <Field int azh.bW>
	// 3211 5999:ixor            
	// 3212 6000:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3213 6003:aload_0         
	// 3214 6004:getfield        #12  <Field azh a>
	// 3215 6007:astore_1        
		abyte0.aN = ((azh) (abyte0)).h & ~a.bW;
	// 3216 6008:aload_1         
	// 3217 6009:aload_1         
	// 3218 6010:getfield        #213 <Field int azh.h>
	// 3219 6013:aload_0         
	// 3220 6014:getfield        #12  <Field azh a>
	// 3221 6017:getfield        #159 <Field int azh.bW>
	// 3222 6020:iconst_m1       
	// 3223 6021:ixor            
	// 3224 6022:iand            
	// 3225 6023:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3226 6026:aload_0         
	// 3227 6027:getfield        #12  <Field azh a>
	// 3228 6030:astore_1        
		abyte0.aN = ((azh) (abyte0)).bW ^ a.aN;
	// 3229 6031:aload_1         
	// 3230 6032:aload_1         
	// 3231 6033:getfield        #159 <Field int azh.bW>
	// 3232 6036:aload_0         
	// 3233 6037:getfield        #12  <Field azh a>
	// 3234 6040:getfield        #126 <Field int azh.aN>
	// 3235 6043:ixor            
	// 3236 6044:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3237 6047:aload_0         
	// 3238 6048:getfield        #12  <Field azh a>
	// 3239 6051:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & ~a.T;
	// 3240 6052:aload_1         
	// 3241 6053:aload_1         
	// 3242 6054:getfield        #126 <Field int azh.aN>
	// 3243 6057:aload_0         
	// 3244 6058:getfield        #12  <Field azh a>
	// 3245 6061:getfield        #273 <Field int azh.T>
	// 3246 6064:iconst_m1       
	// 3247 6065:ixor            
	// 3248 6066:iand            
	// 3249 6067:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3250 6070:aload_0         
	// 3251 6071:getfield        #12  <Field azh a>
	// 3252 6074:astore_1        
		abyte0.bW = ((azh) (abyte0)).ab & a.aA;
	// 3253 6075:aload_1         
	// 3254 6076:aload_1         
	// 3255 6077:getfield        #225 <Field int azh.ab>
	// 3256 6080:aload_0         
	// 3257 6081:getfield        #12  <Field azh a>
	// 3258 6084:getfield        #270 <Field int azh.aA>
	// 3259 6087:iand            
	// 3260 6088:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3261 6091:aload_0         
	// 3262 6092:getfield        #12  <Field azh a>
	// 3263 6095:astore_1        
		abyte0.bW = ((azh) (abyte0)).B ^ a.bW;
	// 3264 6096:aload_1         
	// 3265 6097:aload_1         
	// 3266 6098:getfield        #252 <Field int azh.B>
	// 3267 6101:aload_0         
	// 3268 6102:getfield        #12  <Field azh a>
	// 3269 6105:getfield        #159 <Field int azh.bW>
	// 3270 6108:ixor            
	// 3271 6109:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3272 6112:aload_0         
	// 3273 6113:getfield        #12  <Field azh a>
	// 3274 6116:astore_1        
		abyte0.bW = ((azh) (abyte0)).h & a.bW;
	// 3275 6117:aload_1         
	// 3276 6118:aload_1         
	// 3277 6119:getfield        #213 <Field int azh.h>
	// 3278 6122:aload_0         
	// 3279 6123:getfield        #12  <Field azh a>
	// 3280 6126:getfield        #159 <Field int azh.bW>
	// 3281 6129:iand            
	// 3282 6130:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3283 6133:aload_0         
	// 3284 6134:getfield        #12  <Field azh a>
	// 3285 6137:astore_1        
		abyte0.bW = ((azh) (abyte0)).bc ^ a.bW;
	// 3286 6138:aload_1         
	// 3287 6139:aload_1         
	// 3288 6140:getfield        #264 <Field int azh.bc>
	// 3289 6143:aload_0         
	// 3290 6144:getfield        #12  <Field azh a>
	// 3291 6147:getfield        #159 <Field int azh.bW>
	// 3292 6150:ixor            
	// 3293 6151:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3294 6154:aload_0         
	// 3295 6155:getfield        #12  <Field azh a>
	// 3296 6158:astore_1        
		abyte0.aN = ((azh) (abyte0)).bW ^ a.aN;
	// 3297 6159:aload_1         
	// 3298 6160:aload_1         
	// 3299 6161:getfield        #159 <Field int azh.bW>
	// 3300 6164:aload_0         
	// 3301 6165:getfield        #12  <Field azh a>
	// 3302 6168:getfield        #126 <Field int azh.aN>
	// 3303 6171:ixor            
	// 3304 6172:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3305 6175:aload_0         
	// 3306 6176:getfield        #12  <Field azh a>
	// 3307 6179:astore_1        
		abyte0.c = ((azh) (abyte0)).aN ^ a.c;
	// 3308 6180:aload_1         
	// 3309 6181:aload_1         
	// 3310 6182:getfield        #126 <Field int azh.aN>
	// 3311 6185:aload_0         
	// 3312 6186:getfield        #12  <Field azh a>
	// 3313 6189:getfield        #276 <Field int azh.c>
	// 3314 6192:ixor            
	// 3315 6193:putfield        #276 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 3316 6196:aload_0         
	// 3317 6197:getfield        #12  <Field azh a>
	// 3318 6200:astore_1        
		abyte0.aA = ((azh) (abyte0)).aA | a.ab;
	// 3319 6201:aload_1         
	// 3320 6202:aload_1         
	// 3321 6203:getfield        #270 <Field int azh.aA>
	// 3322 6206:aload_0         
	// 3323 6207:getfield        #12  <Field azh a>
	// 3324 6210:getfield        #225 <Field int azh.ab>
	// 3325 6213:ior             
	// 3326 6214:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3327 6217:aload_0         
	// 3328 6218:getfield        #12  <Field azh a>
	// 3329 6221:astore_1        
		abyte0.aA = ((azh) (abyte0)).h & ~a.aA;
	// 3330 6222:aload_1         
	// 3331 6223:aload_1         
	// 3332 6224:getfield        #213 <Field int azh.h>
	// 3333 6227:aload_0         
	// 3334 6228:getfield        #12  <Field azh a>
	// 3335 6231:getfield        #270 <Field int azh.aA>
	// 3336 6234:iconst_m1       
	// 3337 6235:ixor            
	// 3338 6236:iand            
	// 3339 6237:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3340 6240:aload_0         
	// 3341 6241:getfield        #12  <Field azh a>
	// 3342 6244:astore_1        
		abyte0.aN = ((azh) (abyte0)).aj | a.bw;
	// 3343 6245:aload_1         
	// 3344 6246:aload_1         
	// 3345 6247:getfield        #210 <Field int azh.aj>
	// 3346 6250:aload_0         
	// 3347 6251:getfield        #12  <Field azh a>
	// 3348 6254:getfield        #231 <Field int azh.bw>
	// 3349 6257:ior             
	// 3350 6258:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3351 6261:aload_0         
	// 3352 6262:getfield        #12  <Field azh a>
	// 3353 6265:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & ~a.F;
	// 3354 6266:aload_1         
	// 3355 6267:aload_1         
	// 3356 6268:getfield        #126 <Field int azh.aN>
	// 3357 6271:aload_0         
	// 3358 6272:getfield        #12  <Field azh a>
	// 3359 6275:getfield        #162 <Field int azh.F>
	// 3360 6278:iconst_m1       
	// 3361 6279:ixor            
	// 3362 6280:iand            
	// 3363 6281:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3364 6284:aload_0         
	// 3365 6285:getfield        #12  <Field azh a>
	// 3366 6288:astore_1        
		abyte0.aN = ((azh) (abyte0)).bo ^ a.aN;
	// 3367 6289:aload_1         
	// 3368 6290:aload_1         
	// 3369 6291:getfield        #207 <Field int azh.bo>
	// 3370 6294:aload_0         
	// 3371 6295:getfield        #12  <Field azh a>
	// 3372 6298:getfield        #126 <Field int azh.aN>
	// 3373 6301:ixor            
	// 3374 6302:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3375 6305:aload_0         
	// 3376 6306:getfield        #12  <Field azh a>
	// 3377 6309:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & ~a.x;
	// 3378 6310:aload_1         
	// 3379 6311:aload_1         
	// 3380 6312:getfield        #126 <Field int azh.aN>
	// 3381 6315:aload_0         
	// 3382 6316:getfield        #12  <Field azh a>
	// 3383 6319:getfield        #261 <Field int azh.x>
	// 3384 6322:iconst_m1       
	// 3385 6323:ixor            
	// 3386 6324:iand            
	// 3387 6325:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3388 6328:aload_0         
	// 3389 6329:getfield        #12  <Field azh a>
	// 3390 6332:astore_1        
		abyte0.bo = ((azh) (abyte0)).aj | a.am;
	// 3391 6333:aload_1         
	// 3392 6334:aload_1         
	// 3393 6335:getfield        #210 <Field int azh.aj>
	// 3394 6338:aload_0         
	// 3395 6339:getfield        #12  <Field azh a>
	// 3396 6342:getfield        #219 <Field int azh.am>
	// 3397 6345:ior             
	// 3398 6346:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3399 6349:aload_0         
	// 3400 6350:getfield        #12  <Field azh a>
	// 3401 6353:astore_1        
		abyte0.bo = ((azh) (abyte0)).D ^ a.bo;
	// 3402 6354:aload_1         
	// 3403 6355:aload_1         
	// 3404 6356:getfield        #53  <Field int azh.D>
	// 3405 6359:aload_0         
	// 3406 6360:getfield        #12  <Field azh a>
	// 3407 6363:getfield        #207 <Field int azh.bo>
	// 3408 6366:ixor            
	// 3409 6367:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3410 6370:aload_0         
	// 3411 6371:getfield        #12  <Field azh a>
	// 3412 6374:astore_1        
		abyte0.J = ((azh) (abyte0)).bo ^ a.J;
	// 3413 6375:aload_1         
	// 3414 6376:aload_1         
	// 3415 6377:getfield        #207 <Field int azh.bo>
	// 3416 6380:aload_0         
	// 3417 6381:getfield        #12  <Field azh a>
	// 3418 6384:getfield        #201 <Field int azh.J>
	// 3419 6387:ixor            
	// 3420 6388:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 3421 6391:aload_0         
	// 3422 6392:getfield        #12  <Field azh a>
	// 3423 6395:astore_1        
		abyte0.ar = ((azh) (abyte0)).J ^ a.ar;
	// 3424 6396:aload_1         
	// 3425 6397:aload_1         
	// 3426 6398:getfield        #201 <Field int azh.J>
	// 3427 6401:aload_0         
	// 3428 6402:getfield        #12  <Field azh a>
	// 3429 6405:getfield        #180 <Field int azh.ar>
	// 3430 6408:ixor            
	// 3431 6409:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3432 6412:aload_0         
	// 3433 6413:getfield        #12  <Field azh a>
	// 3434 6416:astore_1        
		abyte0.aP = ((azh) (abyte0)).bo ^ a.aP;
	// 3435 6417:aload_1         
	// 3436 6418:aload_1         
	// 3437 6419:getfield        #207 <Field int azh.bo>
	// 3438 6422:aload_0         
	// 3439 6423:getfield        #12  <Field azh a>
	// 3440 6426:getfield        #279 <Field int azh.aP>
	// 3441 6429:ixor            
	// 3442 6430:putfield        #279 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 3443 6433:aload_0         
	// 3444 6434:getfield        #12  <Field azh a>
	// 3445 6437:astore_1        
		abyte0.aP = ((azh) (abyte0)).h & ~a.aP;
	// 3446 6438:aload_1         
	// 3447 6439:aload_1         
	// 3448 6440:getfield        #213 <Field int azh.h>
	// 3449 6443:aload_0         
	// 3450 6444:getfield        #12  <Field azh a>
	// 3451 6447:getfield        #279 <Field int azh.aP>
	// 3452 6450:iconst_m1       
	// 3453 6451:ixor            
	// 3454 6452:iand            
	// 3455 6453:putfield        #279 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 3456 6456:aload_0         
	// 3457 6457:getfield        #12  <Field azh a>
	// 3458 6460:astore_1        
		abyte0.aP = ((azh) (abyte0)).aO ^ a.aP;
	// 3459 6461:aload_1         
	// 3460 6462:aload_1         
	// 3461 6463:getfield        #117 <Field int azh.aO>
	// 3462 6466:aload_0         
	// 3463 6467:getfield        #12  <Field azh a>
	// 3464 6470:getfield        #279 <Field int azh.aP>
	// 3465 6473:ixor            
	// 3466 6474:putfield        #279 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 3467 6477:aload_0         
	// 3468 6478:getfield        #12  <Field azh a>
	// 3469 6481:astore_1        
		abyte0.aO = ((azh) (abyte0)).aj | a.bw;
	// 3470 6482:aload_1         
	// 3471 6483:aload_1         
	// 3472 6484:getfield        #210 <Field int azh.aj>
	// 3473 6487:aload_0         
	// 3474 6488:getfield        #12  <Field azh a>
	// 3475 6491:getfield        #231 <Field int azh.bw>
	// 3476 6494:ior             
	// 3477 6495:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3478 6498:aload_0         
	// 3479 6499:getfield        #12  <Field azh a>
	// 3480 6502:astore_1        
		abyte0.aO = ((azh) (abyte0)).bw ^ a.aO;
	// 3481 6503:aload_1         
	// 3482 6504:aload_1         
	// 3483 6505:getfield        #231 <Field int azh.bw>
	// 3484 6508:aload_0         
	// 3485 6509:getfield        #12  <Field azh a>
	// 3486 6512:getfield        #117 <Field int azh.aO>
	// 3487 6515:ixor            
	// 3488 6516:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3489 6519:aload_0         
	// 3490 6520:getfield        #12  <Field azh a>
	// 3491 6523:astore_1        
		abyte0.bR = ((azh) (abyte0)).aO ^ a.bR;
	// 3492 6524:aload_1         
	// 3493 6525:aload_1         
	// 3494 6526:getfield        #117 <Field int azh.aO>
	// 3495 6529:aload_0         
	// 3496 6530:getfield        #12  <Field azh a>
	// 3497 6533:getfield        #156 <Field int azh.bR>
	// 3498 6536:ixor            
	// 3499 6537:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3500 6540:aload_0         
	// 3501 6541:getfield        #12  <Field azh a>
	// 3502 6544:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR | a.x;
	// 3503 6545:aload_1         
	// 3504 6546:aload_1         
	// 3505 6547:getfield        #156 <Field int azh.bR>
	// 3506 6550:aload_0         
	// 3507 6551:getfield        #12  <Field azh a>
	// 3508 6554:getfield        #261 <Field int azh.x>
	// 3509 6557:ior             
	// 3510 6558:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3511 6561:aload_0         
	// 3512 6562:getfield        #12  <Field azh a>
	// 3513 6565:astore_1        
		abyte0.aO = ((azh) (abyte0)).aj | a.D;
	// 3514 6566:aload_1         
	// 3515 6567:aload_1         
	// 3516 6568:getfield        #210 <Field int azh.aj>
	// 3517 6571:aload_0         
	// 3518 6572:getfield        #12  <Field azh a>
	// 3519 6575:getfield        #53  <Field int azh.D>
	// 3520 6578:ior             
	// 3521 6579:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3522 6582:aload_0         
	// 3523 6583:getfield        #12  <Field azh a>
	// 3524 6586:astore_1        
		abyte0.aO = ((azh) (abyte0)).ab & ~a.aO;
	// 3525 6587:aload_1         
	// 3526 6588:aload_1         
	// 3527 6589:getfield        #225 <Field int azh.ab>
	// 3528 6592:aload_0         
	// 3529 6593:getfield        #12  <Field azh a>
	// 3530 6596:getfield        #117 <Field int azh.aO>
	// 3531 6599:iconst_m1       
	// 3532 6600:ixor            
	// 3533 6601:iand            
	// 3534 6602:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3535 6605:aload_0         
	// 3536 6606:getfield        #12  <Field azh a>
	// 3537 6609:astore_1        
		abyte0.aO = ((azh) (abyte0)).n ^ a.aO;
	// 3538 6610:aload_1         
	// 3539 6611:aload_1         
	// 3540 6612:getfield        #222 <Field int azh.n>
	// 3541 6615:aload_0         
	// 3542 6616:getfield        #12  <Field azh a>
	// 3543 6619:getfield        #117 <Field int azh.aO>
	// 3544 6622:ixor            
	// 3545 6623:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3546 6626:aload_0         
	// 3547 6627:getfield        #12  <Field azh a>
	// 3548 6630:astore_1        
		abyte0.aO = ((azh) (abyte0)).h & ~a.aO;
	// 3549 6631:aload_1         
	// 3550 6632:aload_1         
	// 3551 6633:getfield        #213 <Field int azh.h>
	// 3552 6636:aload_0         
	// 3553 6637:getfield        #12  <Field azh a>
	// 3554 6640:getfield        #117 <Field int azh.aO>
	// 3555 6643:iconst_m1       
	// 3556 6644:ixor            
	// 3557 6645:iand            
	// 3558 6646:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3559 6649:aload_0         
	// 3560 6650:getfield        #12  <Field azh a>
	// 3561 6653:astore_1        
		abyte0.aO = ((azh) (abyte0)).L ^ a.aO;
	// 3562 6654:aload_1         
	// 3563 6655:aload_1         
	// 3564 6656:getfield        #56  <Field int azh.L>
	// 3565 6659:aload_0         
	// 3566 6660:getfield        #12  <Field azh a>
	// 3567 6663:getfield        #117 <Field int azh.aO>
	// 3568 6666:ixor            
	// 3569 6667:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3570 6670:aload_0         
	// 3571 6671:getfield        #12  <Field azh a>
	// 3572 6674:astore_1        
		abyte0.aO = ((azh) (abyte0)).aO | a.T;
	// 3573 6675:aload_1         
	// 3574 6676:aload_1         
	// 3575 6677:getfield        #117 <Field int azh.aO>
	// 3576 6680:aload_0         
	// 3577 6681:getfield        #12  <Field azh a>
	// 3578 6684:getfield        #273 <Field int azh.T>
	// 3579 6687:ior             
	// 3580 6688:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3581 6691:aload_0         
	// 3582 6692:getfield        #12  <Field azh a>
	// 3583 6695:astore_1        
		abyte0.aO = ((azh) (abyte0)).ba ^ a.aO;
	// 3584 6696:aload_1         
	// 3585 6697:aload_1         
	// 3586 6698:getfield        #192 <Field int azh.ba>
	// 3587 6701:aload_0         
	// 3588 6702:getfield        #12  <Field azh a>
	// 3589 6705:getfield        #117 <Field int azh.aO>
	// 3590 6708:ixor            
	// 3591 6709:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3592 6712:aload_0         
	// 3593 6713:getfield        #12  <Field azh a>
	// 3594 6716:astore_1        
		abyte0.w = ((azh) (abyte0)).aO ^ a.w;
	// 3595 6717:aload_1         
	// 3596 6718:aload_1         
	// 3597 6719:getfield        #117 <Field int azh.aO>
	// 3598 6722:aload_0         
	// 3599 6723:getfield        #12  <Field azh a>
	// 3600 6726:getfield        #282 <Field int azh.w>
	// 3601 6729:ixor            
	// 3602 6730:putfield        #282 <Field int azh.w>
		abyte0 = ((byte []) (a));
	// 3603 6733:aload_0         
	// 3604 6734:getfield        #12  <Field azh a>
	// 3605 6737:astore_1        
		abyte0.aO = ((azh) (abyte0)).o & ~a.w;
	// 3606 6738:aload_1         
	// 3607 6739:aload_1         
	// 3608 6740:getfield        #147 <Field int azh.o>
	// 3609 6743:aload_0         
	// 3610 6744:getfield        #12  <Field azh a>
	// 3611 6747:getfield        #282 <Field int azh.w>
	// 3612 6750:iconst_m1       
	// 3613 6751:ixor            
	// 3614 6752:iand            
	// 3615 6753:putfield        #117 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3616 6756:aload_0         
	// 3617 6757:getfield        #12  <Field azh a>
	// 3618 6760:astore_1        
		abyte0.ba = ((azh) (abyte0)).w ^ a.o;
	// 3619 6761:aload_1         
	// 3620 6762:aload_1         
	// 3621 6763:getfield        #282 <Field int azh.w>
	// 3622 6766:aload_0         
	// 3623 6767:getfield        #12  <Field azh a>
	// 3624 6770:getfield        #147 <Field int azh.o>
	// 3625 6773:ixor            
	// 3626 6774:putfield        #192 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 3627 6777:aload_0         
	// 3628 6778:getfield        #12  <Field azh a>
	// 3629 6781:astore_1        
		abyte0.n = ((azh) (abyte0)).ab & ~a.aj;
	// 3630 6782:aload_1         
	// 3631 6783:aload_1         
	// 3632 6784:getfield        #225 <Field int azh.ab>
	// 3633 6787:aload_0         
	// 3634 6788:getfield        #12  <Field azh a>
	// 3635 6791:getfield        #210 <Field int azh.aj>
	// 3636 6794:iconst_m1       
	// 3637 6795:ixor            
	// 3638 6796:iand            
	// 3639 6797:putfield        #222 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3640 6800:aload_0         
	// 3641 6801:getfield        #12  <Field azh a>
	// 3642 6804:astore_1        
		abyte0.n = ((azh) (abyte0)).aa ^ a.n;
	// 3643 6805:aload_1         
	// 3644 6806:aload_1         
	// 3645 6807:getfield        #204 <Field int azh.aa>
	// 3646 6810:aload_0         
	// 3647 6811:getfield        #12  <Field azh a>
	// 3648 6814:getfield        #222 <Field int azh.n>
	// 3649 6817:ixor            
	// 3650 6818:putfield        #222 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3651 6821:aload_0         
	// 3652 6822:getfield        #12  <Field azh a>
	// 3653 6825:astore_1        
		abyte0.aA = ((azh) (abyte0)).n ^ a.aA;
	// 3654 6826:aload_1         
	// 3655 6827:aload_1         
	// 3656 6828:getfield        #222 <Field int azh.n>
	// 3657 6831:aload_0         
	// 3658 6832:getfield        #12  <Field azh a>
	// 3659 6835:getfield        #270 <Field int azh.aA>
	// 3660 6838:ixor            
	// 3661 6839:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3662 6842:aload_0         
	// 3663 6843:getfield        #12  <Field azh a>
	// 3664 6846:astore_1        
		abyte0.aA = ((azh) (abyte0)).T | a.aA;
	// 3665 6847:aload_1         
	// 3666 6848:aload_1         
	// 3667 6849:getfield        #273 <Field int azh.T>
	// 3668 6852:aload_0         
	// 3669 6853:getfield        #12  <Field azh a>
	// 3670 6856:getfield        #270 <Field int azh.aA>
	// 3671 6859:ior             
	// 3672 6860:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3673 6863:aload_0         
	// 3674 6864:getfield        #12  <Field azh a>
	// 3675 6867:astore_1        
		abyte0.aA = ((azh) (abyte0)).ar ^ a.aA;
	// 3676 6868:aload_1         
	// 3677 6869:aload_1         
	// 3678 6870:getfield        #180 <Field int azh.ar>
	// 3679 6873:aload_0         
	// 3680 6874:getfield        #12  <Field azh a>
	// 3681 6877:getfield        #270 <Field int azh.aA>
	// 3682 6880:ixor            
	// 3683 6881:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3684 6884:aload_0         
	// 3685 6885:getfield        #12  <Field azh a>
	// 3686 6888:astore_1        
		abyte0.e = ((azh) (abyte0)).aA ^ a.e;
	// 3687 6889:aload_1         
	// 3688 6890:aload_1         
	// 3689 6891:getfield        #270 <Field int azh.aA>
	// 3690 6894:aload_0         
	// 3691 6895:getfield        #12  <Field azh a>
	// 3692 6898:getfield        #285 <Field int azh.e>
	// 3693 6901:ixor            
	// 3694 6902:putfield        #285 <Field int azh.e>
		abyte0 = ((byte []) (a));
	// 3695 6905:aload_0         
	// 3696 6906:getfield        #12  <Field azh a>
	// 3697 6909:astore_1        
		abyte0.aA = ((azh) (abyte0)).e & ~a.Y;
	// 3698 6910:aload_1         
	// 3699 6911:aload_1         
	// 3700 6912:getfield        #285 <Field int azh.e>
	// 3701 6915:aload_0         
	// 3702 6916:getfield        #12  <Field azh a>
	// 3703 6919:getfield        #267 <Field int azh.Y>
	// 3704 6922:iconst_m1       
	// 3705 6923:ixor            
	// 3706 6924:iand            
	// 3707 6925:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3708 6928:aload_0         
	// 3709 6929:getfield        #12  <Field azh a>
	// 3710 6932:astore_1        
		abyte0.ar = ((azh) (abyte0)).e & ~a.I;
	// 3711 6933:aload_1         
	// 3712 6934:aload_1         
	// 3713 6935:getfield        #285 <Field int azh.e>
	// 3714 6938:aload_0         
	// 3715 6939:getfield        #12  <Field azh a>
	// 3716 6942:getfield        #88  <Field int azh.I>
	// 3717 6945:iconst_m1       
	// 3718 6946:ixor            
	// 3719 6947:iand            
	// 3720 6948:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3721 6951:aload_0         
	// 3722 6952:getfield        #12  <Field azh a>
	// 3723 6955:astore_1        
		abyte0.n = ((azh) (abyte0)).ar & ~a.Y;
	// 3724 6956:aload_1         
	// 3725 6957:aload_1         
	// 3726 6958:getfield        #180 <Field int azh.ar>
	// 3727 6961:aload_0         
	// 3728 6962:getfield        #12  <Field azh a>
	// 3729 6965:getfield        #267 <Field int azh.Y>
	// 3730 6968:iconst_m1       
	// 3731 6969:ixor            
	// 3732 6970:iand            
	// 3733 6971:putfield        #222 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3734 6974:aload_0         
	// 3735 6975:getfield        #12  <Field azh a>
	// 3736 6978:astore_1        
		abyte0.aa = ((azh) (abyte0)).ar & ~a.Y;
	// 3737 6979:aload_1         
	// 3738 6980:aload_1         
	// 3739 6981:getfield        #180 <Field int azh.ar>
	// 3740 6984:aload_0         
	// 3741 6985:getfield        #12  <Field azh a>
	// 3742 6988:getfield        #267 <Field int azh.Y>
	// 3743 6991:iconst_m1       
	// 3744 6992:ixor            
	// 3745 6993:iand            
	// 3746 6994:putfield        #204 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 3747 6997:aload_0         
	// 3748 6998:getfield        #12  <Field azh a>
	// 3749 7001:astore_1        
		abyte0.bo = ((azh) (abyte0)).ar & ~a.Y;
	// 3750 7002:aload_1         
	// 3751 7003:aload_1         
	// 3752 7004:getfield        #180 <Field int azh.ar>
	// 3753 7007:aload_0         
	// 3754 7008:getfield        #12  <Field azh a>
	// 3755 7011:getfield        #267 <Field int azh.Y>
	// 3756 7014:iconst_m1       
	// 3757 7015:ixor            
	// 3758 7016:iand            
	// 3759 7017:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3760 7020:aload_0         
	// 3761 7021:getfield        #12  <Field azh a>
	// 3762 7024:astore_1        
		abyte0.J = ((azh) (abyte0)).Y | a.e;
	// 3763 7025:aload_1         
	// 3764 7026:aload_1         
	// 3765 7027:getfield        #267 <Field int azh.Y>
	// 3766 7030:aload_0         
	// 3767 7031:getfield        #12  <Field azh a>
	// 3768 7034:getfield        #285 <Field int azh.e>
	// 3769 7037:ior             
	// 3770 7038:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 3771 7041:aload_0         
	// 3772 7042:getfield        #12  <Field azh a>
	// 3773 7045:astore_1        
		abyte0.J = ((azh) (abyte0)).e ^ a.J;
	// 3774 7046:aload_1         
	// 3775 7047:aload_1         
	// 3776 7048:getfield        #285 <Field int azh.e>
	// 3777 7051:aload_0         
	// 3778 7052:getfield        #12  <Field azh a>
	// 3779 7055:getfield        #201 <Field int azh.J>
	// 3780 7058:ixor            
	// 3781 7059:putfield        #201 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 3782 7062:aload_0         
	// 3783 7063:getfield        #12  <Field azh a>
	// 3784 7066:astore_1        
		abyte0.bW = ((azh) (abyte0)).I ^ a.e;
	// 3785 7067:aload_1         
	// 3786 7068:aload_1         
	// 3787 7069:getfield        #88  <Field int azh.I>
	// 3788 7072:aload_0         
	// 3789 7073:getfield        #12  <Field azh a>
	// 3790 7076:getfield        #285 <Field int azh.e>
	// 3791 7079:ixor            
	// 3792 7080:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3793 7083:aload_0         
	// 3794 7084:getfield        #12  <Field azh a>
	// 3795 7087:astore_1        
		abyte0.bc = ((azh) (abyte0)).bW & ~a.Y;
	// 3796 7088:aload_1         
	// 3797 7089:aload_1         
	// 3798 7090:getfield        #159 <Field int azh.bW>
	// 3799 7093:aload_0         
	// 3800 7094:getfield        #12  <Field azh a>
	// 3801 7097:getfield        #267 <Field int azh.Y>
	// 3802 7100:iconst_m1       
	// 3803 7101:ixor            
	// 3804 7102:iand            
	// 3805 7103:putfield        #264 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 3806 7106:aload_0         
	// 3807 7107:getfield        #12  <Field azh a>
	// 3808 7110:astore_1        
		abyte0.aA = ((azh) (abyte0)).bW ^ a.aA;
	// 3809 7111:aload_1         
	// 3810 7112:aload_1         
	// 3811 7113:getfield        #159 <Field int azh.bW>
	// 3812 7116:aload_0         
	// 3813 7117:getfield        #12  <Field azh a>
	// 3814 7120:getfield        #270 <Field int azh.aA>
	// 3815 7123:ixor            
	// 3816 7124:putfield        #270 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3817 7127:aload_0         
	// 3818 7128:getfield        #12  <Field azh a>
	// 3819 7131:astore_1        
		abyte0.B = ((azh) (abyte0)).bW & ~a.Y;
	// 3820 7132:aload_1         
	// 3821 7133:aload_1         
	// 3822 7134:getfield        #159 <Field int azh.bW>
	// 3823 7137:aload_0         
	// 3824 7138:getfield        #12  <Field azh a>
	// 3825 7141:getfield        #267 <Field int azh.Y>
	// 3826 7144:iconst_m1       
	// 3827 7145:ixor            
	// 3828 7146:iand            
	// 3829 7147:putfield        #252 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 3830 7150:aload_0         
	// 3831 7151:getfield        #12  <Field azh a>
	// 3832 7154:astore_1        
		abyte0.bW = ((azh) (abyte0)).Y | a.bW;
	// 3833 7155:aload_1         
	// 3834 7156:aload_1         
	// 3835 7157:getfield        #267 <Field int azh.Y>
	// 3836 7160:aload_0         
	// 3837 7161:getfield        #12  <Field azh a>
	// 3838 7164:getfield        #159 <Field int azh.bW>
	// 3839 7167:ior             
	// 3840 7168:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3841 7171:aload_0         
	// 3842 7172:getfield        #12  <Field azh a>
	// 3843 7175:astore_1        
		abyte0.bW = ((azh) (abyte0)).I ^ a.bW;
	// 3844 7176:aload_1         
	// 3845 7177:aload_1         
	// 3846 7178:getfield        #88  <Field int azh.I>
	// 3847 7181:aload_0         
	// 3848 7182:getfield        #12  <Field azh a>
	// 3849 7185:getfield        #159 <Field int azh.bW>
	// 3850 7188:ixor            
	// 3851 7189:putfield        #159 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3852 7192:aload_0         
	// 3853 7193:getfield        #12  <Field azh a>
	// 3854 7196:astore_1        
		abyte0.ah = ((azh) (abyte0)).e ^ a.ah;
	// 3855 7197:aload_1         
	// 3856 7198:aload_1         
	// 3857 7199:getfield        #285 <Field int azh.e>
	// 3858 7202:aload_0         
	// 3859 7203:getfield        #12  <Field azh a>
	// 3860 7206:getfield        #144 <Field int azh.ah>
	// 3861 7209:ixor            
	// 3862 7210:putfield        #144 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 3863 7213:aload_0         
	// 3864 7214:getfield        #12  <Field azh a>
	// 3865 7217:astore_1        
		abyte0.av = ((azh) (abyte0)).Y | a.e;
	// 3866 7218:aload_1         
	// 3867 7219:aload_1         
	// 3868 7220:getfield        #267 <Field int azh.Y>
	// 3869 7223:aload_0         
	// 3870 7224:getfield        #12  <Field azh a>
	// 3871 7227:getfield        #285 <Field int azh.e>
	// 3872 7230:ior             
	// 3873 7231:putfield        #258 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 3874 7234:aload_0         
	// 3875 7235:getfield        #12  <Field azh a>
	// 3876 7238:astore_1        
		abyte0.av = ((azh) (abyte0)).ar ^ a.av;
	// 3877 7239:aload_1         
	// 3878 7240:aload_1         
	// 3879 7241:getfield        #180 <Field int azh.ar>
	// 3880 7244:aload_0         
	// 3881 7245:getfield        #12  <Field azh a>
	// 3882 7248:getfield        #258 <Field int azh.av>
	// 3883 7251:ixor            
	// 3884 7252:putfield        #258 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 3885 7255:aload_0         
	// 3886 7256:getfield        #12  <Field azh a>
	// 3887 7259:astore_1        
		abyte0.aC = ((azh) (abyte0)).e ^ a.Y;
	// 3888 7260:aload_1         
	// 3889 7261:aload_1         
	// 3890 7262:getfield        #285 <Field int azh.e>
	// 3891 7265:aload_0         
	// 3892 7266:getfield        #12  <Field azh a>
	// 3893 7269:getfield        #267 <Field int azh.Y>
	// 3894 7272:ixor            
	// 3895 7273:putfield        #255 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 3896 7276:aload_0         
	// 3897 7277:getfield        #12  <Field azh a>
	// 3898 7280:astore_1        
		abyte0.aB = ((azh) (abyte0)).e & ~a.Y;
	// 3899 7281:aload_1         
	// 3900 7282:aload_1         
	// 3901 7283:getfield        #285 <Field int azh.e>
	// 3902 7286:aload_0         
	// 3903 7287:getfield        #12  <Field azh a>
	// 3904 7290:getfield        #267 <Field int azh.Y>
	// 3905 7293:iconst_m1       
	// 3906 7294:ixor            
	// 3907 7295:iand            
	// 3908 7296:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3909 7299:aload_0         
	// 3910 7300:getfield        #12  <Field azh a>
	// 3911 7303:astore_1        
		abyte0.bm = ((azh) (abyte0)).e & ~a.Y;
	// 3912 7304:aload_1         
	// 3913 7305:aload_1         
	// 3914 7306:getfield        #285 <Field int azh.e>
	// 3915 7309:aload_0         
	// 3916 7310:getfield        #12  <Field azh a>
	// 3917 7313:getfield        #267 <Field int azh.Y>
	// 3918 7316:iconst_m1       
	// 3919 7317:ixor            
	// 3920 7318:iand            
	// 3921 7319:putfield        #174 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 3922 7322:aload_0         
	// 3923 7323:getfield        #12  <Field azh a>
	// 3924 7326:astore_1        
		abyte0.bM = ((azh) (abyte0)).I | a.e;
	// 3925 7327:aload_1         
	// 3926 7328:aload_1         
	// 3927 7329:getfield        #88  <Field int azh.I>
	// 3928 7332:aload_0         
	// 3929 7333:getfield        #12  <Field azh a>
	// 3930 7336:getfield        #285 <Field int azh.e>
	// 3931 7339:ior             
	// 3932 7340:putfield        #153 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3933 7343:aload_0         
	// 3934 7344:getfield        #12  <Field azh a>
	// 3935 7347:astore_1        
		abyte0.bH = ((azh) (abyte0)).bM ^ a.bH;
	// 3936 7348:aload_1         
	// 3937 7349:aload_1         
	// 3938 7350:getfield        #153 <Field int azh.bM>
	// 3939 7353:aload_0         
	// 3940 7354:getfield        #12  <Field azh a>
	// 3941 7357:getfield        #237 <Field int azh.bH>
	// 3942 7360:ixor            
	// 3943 7361:putfield        #237 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 3944 7364:aload_0         
	// 3945 7365:getfield        #12  <Field azh a>
	// 3946 7368:astore_1        
		abyte0.bg = ((azh) (abyte0)).Y | a.bM;
	// 3947 7369:aload_1         
	// 3948 7370:aload_1         
	// 3949 7371:getfield        #267 <Field int azh.Y>
	// 3950 7374:aload_0         
	// 3951 7375:getfield        #12  <Field azh a>
	// 3952 7378:getfield        #153 <Field int azh.bM>
	// 3953 7381:ior             
	// 3954 7382:putfield        #186 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3955 7385:aload_0         
	// 3956 7386:getfield        #12  <Field azh a>
	// 3957 7389:astore_1        
		abyte0.bg = ((azh) (abyte0)).ar ^ a.bg;
	// 3958 7390:aload_1         
	// 3959 7391:aload_1         
	// 3960 7392:getfield        #180 <Field int azh.ar>
	// 3961 7395:aload_0         
	// 3962 7396:getfield        #12  <Field azh a>
	// 3963 7399:getfield        #186 <Field int azh.bg>
	// 3964 7402:ixor            
	// 3965 7403:putfield        #186 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3966 7406:aload_0         
	// 3967 7407:getfield        #12  <Field azh a>
	// 3968 7410:astore_1        
		abyte0.bo = ((azh) (abyte0)).bM ^ a.bo;
	// 3969 7411:aload_1         
	// 3970 7412:aload_1         
	// 3971 7413:getfield        #153 <Field int azh.bM>
	// 3972 7416:aload_0         
	// 3973 7417:getfield        #12  <Field azh a>
	// 3974 7420:getfield        #207 <Field int azh.bo>
	// 3975 7423:ixor            
	// 3976 7424:putfield        #207 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3977 7427:aload_0         
	// 3978 7428:getfield        #12  <Field azh a>
	// 3979 7431:astore_1        
		abyte0.bm = ((azh) (abyte0)).bM ^ a.bm;
	// 3980 7432:aload_1         
	// 3981 7433:aload_1         
	// 3982 7434:getfield        #153 <Field int azh.bM>
	// 3983 7437:aload_0         
	// 3984 7438:getfield        #12  <Field azh a>
	// 3985 7441:getfield        #174 <Field int azh.bm>
	// 3986 7444:ixor            
	// 3987 7445:putfield        #174 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 3988 7448:aload_0         
	// 3989 7449:getfield        #12  <Field azh a>
	// 3990 7452:astore_1        
		abyte0.ar = ((azh) (abyte0)).bM & ~a.e;
	// 3991 7453:aload_1         
	// 3992 7454:aload_1         
	// 3993 7455:getfield        #153 <Field int azh.bM>
	// 3994 7458:aload_0         
	// 3995 7459:getfield        #12  <Field azh a>
	// 3996 7462:getfield        #285 <Field int azh.e>
	// 3997 7465:iconst_m1       
	// 3998 7466:ixor            
	// 3999 7467:iand            
	// 4000 7468:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 4001 7471:aload_0         
	// 4002 7472:getfield        #12  <Field azh a>
	// 4003 7475:astore_1        
		abyte0.bL = ((azh) (abyte0)).ar ^ a.bL;
	// 4004 7476:aload_1         
	// 4005 7477:aload_1         
	// 4006 7478:getfield        #180 <Field int azh.ar>
	// 4007 7481:aload_0         
	// 4008 7482:getfield        #12  <Field azh a>
	// 4009 7485:getfield        #243 <Field int azh.bL>
	// 4010 7488:ixor            
	// 4011 7489:putfield        #243 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4012 7492:aload_0         
	// 4013 7493:getfield        #12  <Field azh a>
	// 4014 7496:astore_1        
		abyte0.ar = ((azh) (abyte0)).Y | a.bM;
	// 4015 7497:aload_1         
	// 4016 7498:aload_1         
	// 4017 7499:getfield        #267 <Field int azh.Y>
	// 4018 7502:aload_0         
	// 4019 7503:getfield        #12  <Field azh a>
	// 4020 7506:getfield        #153 <Field int azh.bM>
	// 4021 7509:ior             
	// 4022 7510:putfield        #180 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 4023 7513:aload_0         
	// 4024 7514:getfield        #12  <Field azh a>
	// 4025 7517:astore_1        
		abyte0.bO = ((azh) (abyte0)).Y | a.e;
	// 4026 7518:aload_1         
	// 4027 7519:aload_1         
	// 4028 7520:getfield        #267 <Field int azh.Y>
	// 4029 7523:aload_0         
	// 4030 7524:getfield        #12  <Field azh a>
	// 4031 7527:getfield        #285 <Field int azh.e>
	// 4032 7530:ior             
	// 4033 7531:putfield        #105 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 4034 7534:aload_0         
	// 4035 7535:getfield        #12  <Field azh a>
	// 4036 7538:astore_1        
		abyte0.cj = ((azh) (abyte0)).I & ~a.e;
	// 4037 7539:aload_1         
	// 4038 7540:aload_1         
	// 4039 7541:getfield        #88  <Field int azh.I>
	// 4040 7544:aload_0         
	// 4041 7545:getfield        #12  <Field azh a>
	// 4042 7548:getfield        #285 <Field int azh.e>
	// 4043 7551:iconst_m1       
	// 4044 7552:ixor            
	// 4045 7553:iand            
	// 4046 7554:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4047 7557:aload_0         
	// 4048 7558:getfield        #12  <Field azh a>
	// 4049 7561:astore_1        
		abyte0.ck = ((azh) (abyte0)).cj & ~a.Y;
	// 4050 7562:aload_1         
	// 4051 7563:aload_1         
	// 4052 7564:getfield        #102 <Field int azh.cj>
	// 4053 7567:aload_0         
	// 4054 7568:getfield        #12  <Field azh a>
	// 4055 7571:getfield        #267 <Field int azh.Y>
	// 4056 7574:iconst_m1       
	// 4057 7575:ixor            
	// 4058 7576:iand            
	// 4059 7577:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 4060 7580:aload_0         
	// 4061 7581:getfield        #12  <Field azh a>
	// 4062 7584:astore_1        
		abyte0.ck = ((azh) (abyte0)).I ^ a.ck;
	// 4063 7585:aload_1         
	// 4064 7586:aload_1         
	// 4065 7587:getfield        #88  <Field int azh.I>
	// 4066 7590:aload_0         
	// 4067 7591:getfield        #12  <Field azh a>
	// 4068 7594:getfield        #29  <Field int azh.ck>
	// 4069 7597:ixor            
	// 4070 7598:putfield        #29  <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 4071 7601:aload_0         
	// 4072 7602:getfield        #12  <Field azh a>
	// 4073 7605:astore_1        
		abyte0.aB = ((azh) (abyte0)).cj ^ a.aB;
	// 4074 7606:aload_1         
	// 4075 7607:aload_1         
	// 4076 7608:getfield        #102 <Field int azh.cj>
	// 4077 7611:aload_0         
	// 4078 7612:getfield        #12  <Field azh a>
	// 4079 7615:getfield        #132 <Field int azh.aB>
	// 4080 7618:ixor            
	// 4081 7619:putfield        #132 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4082 7622:aload_0         
	// 4083 7623:getfield        #12  <Field azh a>
	// 4084 7626:astore_1        
		abyte0.d = ((azh) (abyte0)).cj & ~a.Y;
	// 4085 7627:aload_1         
	// 4086 7628:aload_1         
	// 4087 7629:getfield        #102 <Field int azh.cj>
	// 4088 7632:aload_0         
	// 4089 7633:getfield        #12  <Field azh a>
	// 4090 7636:getfield        #267 <Field int azh.Y>
	// 4091 7639:iconst_m1       
	// 4092 7640:ixor            
	// 4093 7641:iand            
	// 4094 7642:putfield        #77  <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 4095 7645:aload_0         
	// 4096 7646:getfield        #12  <Field azh a>
	// 4097 7649:astore_1        
		abyte0.d = ((azh) (abyte0)).bM ^ a.d;
	// 4098 7650:aload_1         
	// 4099 7651:aload_1         
	// 4100 7652:getfield        #153 <Field int azh.bM>
	// 4101 7655:aload_0         
	// 4102 7656:getfield        #12  <Field azh a>
	// 4103 7659:getfield        #77  <Field int azh.d>
	// 4104 7662:ixor            
	// 4105 7663:putfield        #77  <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 4106 7666:aload_0         
	// 4107 7667:getfield        #12  <Field azh a>
	// 4108 7670:astore_1        
		abyte0.B = ((azh) (abyte0)).cj ^ a.B;
	// 4109 7671:aload_1         
	// 4110 7672:aload_1         
	// 4111 7673:getfield        #102 <Field int azh.cj>
	// 4112 7676:aload_0         
	// 4113 7677:getfield        #12  <Field azh a>
	// 4114 7680:getfield        #252 <Field int azh.B>
	// 4115 7683:ixor            
	// 4116 7684:putfield        #252 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 4117 7687:aload_0         
	// 4118 7688:getfield        #12  <Field azh a>
	// 4119 7691:astore_1        
		abyte0.cj = ((azh) (abyte0)).I & a.e;
	// 4120 7692:aload_1         
	// 4121 7693:aload_1         
	// 4122 7694:getfield        #88  <Field int azh.I>
	// 4123 7697:aload_0         
	// 4124 7698:getfield        #12  <Field azh a>
	// 4125 7701:getfield        #285 <Field int azh.e>
	// 4126 7704:iand            
	// 4127 7705:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4128 7708:aload_0         
	// 4129 7709:getfield        #12  <Field azh a>
	// 4130 7712:astore_1        
		abyte0.bc = ((azh) (abyte0)).cj ^ a.bc;
	// 4131 7713:aload_1         
	// 4132 7714:aload_1         
	// 4133 7715:getfield        #102 <Field int azh.cj>
	// 4134 7718:aload_0         
	// 4135 7719:getfield        #12  <Field azh a>
	// 4136 7722:getfield        #264 <Field int azh.bc>
	// 4137 7725:ixor            
	// 4138 7726:putfield        #264 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4139 7729:aload_0         
	// 4140 7730:getfield        #12  <Field azh a>
	// 4141 7733:astore_1        
		abyte0.bI = ((azh) (abyte0)).cj ^ a.bI;
	// 4142 7734:aload_1         
	// 4143 7735:aload_1         
	// 4144 7736:getfield        #102 <Field int azh.cj>
	// 4145 7739:aload_0         
	// 4146 7740:getfield        #12  <Field azh a>
	// 4147 7743:getfield        #228 <Field int azh.bI>
	// 4148 7746:ixor            
	// 4149 7747:putfield        #228 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 4150 7750:aload_0         
	// 4151 7751:getfield        #12  <Field azh a>
	// 4152 7754:astore_1        
		abyte0.aa = ((azh) (abyte0)).cj ^ a.aa;
	// 4153 7755:aload_1         
	// 4154 7756:aload_1         
	// 4155 7757:getfield        #102 <Field int azh.cj>
	// 4156 7760:aload_0         
	// 4157 7761:getfield        #12  <Field azh a>
	// 4158 7764:getfield        #204 <Field int azh.aa>
	// 4159 7767:ixor            
	// 4160 7768:putfield        #204 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 4161 7771:aload_0         
	// 4162 7772:getfield        #12  <Field azh a>
	// 4163 7775:astore_1        
		abyte0.bV = ((azh) (abyte0)).Y | a.cj;
	// 4164 7776:aload_1         
	// 4165 7777:aload_1         
	// 4166 7778:getfield        #267 <Field int azh.Y>
	// 4167 7781:aload_0         
	// 4168 7782:getfield        #12  <Field azh a>
	// 4169 7785:getfield        #102 <Field int azh.cj>
	// 4170 7788:ior             
	// 4171 7789:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4172 7792:aload_0         
	// 4173 7793:getfield        #12  <Field azh a>
	// 4174 7796:astore_1        
		abyte0.bV = ((azh) (abyte0)).I ^ a.bV;
	// 4175 7797:aload_1         
	// 4176 7798:aload_1         
	// 4177 7799:getfield        #88  <Field int azh.I>
	// 4178 7802:aload_0         
	// 4179 7803:getfield        #12  <Field azh a>
	// 4180 7806:getfield        #59  <Field int azh.bV>
	// 4181 7809:ixor            
	// 4182 7810:putfield        #59  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4183 7813:aload_0         
	// 4184 7814:getfield        #12  <Field azh a>
	// 4185 7817:astore_1        
		abyte0.cj = ((azh) (abyte0)).e & ~a.cj;
	// 4186 7818:aload_1         
	// 4187 7819:aload_1         
	// 4188 7820:getfield        #285 <Field int azh.e>
	// 4189 7823:aload_0         
	// 4190 7824:getfield        #12  <Field azh a>
	// 4191 7827:getfield        #102 <Field int azh.cj>
	// 4192 7830:iconst_m1       
	// 4193 7831:ixor            
	// 4194 7832:iand            
	// 4195 7833:putfield        #102 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4196 7836:aload_0         
	// 4197 7837:getfield        #12  <Field azh a>
	// 4198 7840:astore_1        
		abyte0.bD = ((azh) (abyte0)).bw & ~a.aj;
	// 4199 7841:aload_1         
	// 4200 7842:aload_1         
	// 4201 7843:getfield        #231 <Field int azh.bw>
	// 4202 7846:aload_0         
	// 4203 7847:getfield        #12  <Field azh a>
	// 4204 7850:getfield        #210 <Field int azh.aj>
	// 4205 7853:iconst_m1       
	// 4206 7854:ixor            
	// 4207 7855:iand            
	// 4208 7856:putfield        #26  <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 4209 7859:aload_0         
	// 4210 7860:getfield        #12  <Field azh a>
	// 4211 7863:astore_1        
		abyte0.bD = ((azh) (abyte0)).N ^ a.bD;
	// 4212 7864:aload_1         
	// 4213 7865:aload_1         
	// 4214 7866:getfield        #165 <Field int azh.N>
	// 4215 7869:aload_0         
	// 4216 7870:getfield        #12  <Field azh a>
	// 4217 7873:getfield        #26  <Field int azh.bD>
	// 4218 7876:ixor            
	// 4219 7877:putfield        #26  <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 4220 7880:aload_0         
	// 4221 7881:getfield        #12  <Field azh a>
	// 4222 7884:astore_1        
		abyte0.bh = ((azh) (abyte0)).bD ^ a.bh;
	// 4223 7885:aload_1         
	// 4224 7886:aload_1         
	// 4225 7887:getfield        #26  <Field int azh.bD>
	// 4226 7890:aload_0         
	// 4227 7891:getfield        #12  <Field azh a>
	// 4228 7894:getfield        #288 <Field int azh.bh>
	// 4229 7897:ixor            
	// 4230 7898:putfield        #288 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4231 7901:aload_0         
	// 4232 7902:getfield        #12  <Field azh a>
	// 4233 7905:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh & ~a.F;
	// 4234 7906:aload_1         
	// 4235 7907:aload_1         
	// 4236 7908:getfield        #288 <Field int azh.bh>
	// 4237 7911:aload_0         
	// 4238 7912:getfield        #12  <Field azh a>
	// 4239 7915:getfield        #162 <Field int azh.F>
	// 4240 7918:iconst_m1       
	// 4241 7919:ixor            
	// 4242 7920:iand            
	// 4243 7921:putfield        #288 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4244 7924:aload_0         
	// 4245 7925:getfield        #12  <Field azh a>
	// 4246 7928:astore_1        
		abyte0.bh = ((azh) (abyte0)).af ^ a.bh;
	// 4247 7929:aload_1         
	// 4248 7930:aload_1         
	// 4249 7931:getfield        #111 <Field int azh.af>
	// 4250 7934:aload_0         
	// 4251 7935:getfield        #12  <Field azh a>
	// 4252 7938:getfield        #288 <Field int azh.bh>
	// 4253 7941:ixor            
	// 4254 7942:putfield        #288 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4255 7945:aload_0         
	// 4256 7946:getfield        #12  <Field azh a>
	// 4257 7949:astore_1        
		abyte0.bh = ((azh) (abyte0)).x | a.bh;
	// 4258 7950:aload_1         
	// 4259 7951:aload_1         
	// 4260 7952:getfield        #261 <Field int azh.x>
	// 4261 7955:aload_0         
	// 4262 7956:getfield        #12  <Field azh a>
	// 4263 7959:getfield        #288 <Field int azh.bh>
	// 4264 7962:ior             
	// 4265 7963:putfield        #288 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4266 7966:aload_0         
	// 4267 7967:getfield        #12  <Field azh a>
	// 4268 7970:astore_1        
		abyte0.an = ((azh) (abyte0)).bD ^ a.an;
	// 4269 7971:aload_1         
	// 4270 7972:aload_1         
	// 4271 7973:getfield        #26  <Field int azh.bD>
	// 4272 7976:aload_0         
	// 4273 7977:getfield        #12  <Field azh a>
	// 4274 7980:getfield        #234 <Field int azh.an>
	// 4275 7983:ixor            
	// 4276 7984:putfield        #234 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4277 7987:aload_0         
	// 4278 7988:getfield        #12  <Field azh a>
	// 4279 7991:astore_1        
		abyte0.ch = ((azh) (abyte0)).an ^ a.ch;
	// 4280 7992:aload_1         
	// 4281 7993:aload_1         
	// 4282 7994:getfield        #234 <Field int azh.an>
	// 4283 7997:aload_0         
	// 4284 7998:getfield        #12  <Field azh a>
	// 4285 8001:getfield        #135 <Field int azh.ch>
	// 4286 8004:ixor            
	// 4287 8005:putfield        #135 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4288 8008:aload_0         
	// 4289 8009:getfield        #12  <Field azh a>
	// 4290 8012:astore_1        
		abyte0.bR = ((azh) (abyte0)).ch ^ a.bR;
	// 4291 8013:aload_1         
	// 4292 8014:aload_1         
	// 4293 8015:getfield        #135 <Field int azh.ch>
	// 4294 8018:aload_0         
	// 4295 8019:getfield        #12  <Field azh a>
	// 4296 8022:getfield        #156 <Field int azh.bR>
	// 4297 8025:ixor            
	// 4298 8026:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 4299 8029:aload_0         
	// 4300 8030:getfield        #12  <Field azh a>
	// 4301 8033:astore_1        
		abyte0.bs = ((azh) (abyte0)).bR ^ a.bs;
	// 4302 8034:aload_1         
	// 4303 8035:aload_1         
	// 4304 8036:getfield        #156 <Field int azh.bR>
	// 4305 8039:aload_0         
	// 4306 8040:getfield        #12  <Field azh a>
	// 4307 8043:getfield        #291 <Field int azh.bs>
	// 4308 8046:ixor            
	// 4309 8047:putfield        #291 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 4310 8050:aload_0         
	// 4311 8051:getfield        #12  <Field azh a>
	// 4312 8054:astore_1        
		abyte0.bR = ((azh) (abyte0)).e & ~a.bs;
	// 4313 8055:aload_1         
	// 4314 8056:aload_1         
	// 4315 8057:getfield        #285 <Field int azh.e>
	// 4316 8060:aload_0         
	// 4317 8061:getfield        #12  <Field azh a>
	// 4318 8064:getfield        #291 <Field int azh.bs>
	// 4319 8067:iconst_m1       
	// 4320 8068:ixor            
	// 4321 8069:iand            
	// 4322 8070:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 4323 8073:aload_0         
	// 4324 8074:getfield        #12  <Field azh a>
	// 4325 8077:astore_1        
		abyte0.ch = ((azh) (abyte0)).ae & ~a.bs;
	// 4326 8078:aload_1         
	// 4327 8079:aload_1         
	// 4328 8080:getfield        #189 <Field int azh.ae>
	// 4329 8083:aload_0         
	// 4330 8084:getfield        #12  <Field azh a>
	// 4331 8087:getfield        #291 <Field int azh.bs>
	// 4332 8090:iconst_m1       
	// 4333 8091:ixor            
	// 4334 8092:iand            
	// 4335 8093:putfield        #135 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4336 8096:aload_0         
	// 4337 8097:getfield        #12  <Field azh a>
	// 4338 8100:astore_1        
		abyte0.b = ((azh) (abyte0)).b & ~a.aj;
	// 4339 8101:aload_1         
	// 4340 8102:aload_1         
	// 4341 8103:getfield        #240 <Field int azh.b>
	// 4342 8106:aload_0         
	// 4343 8107:getfield        #12  <Field azh a>
	// 4344 8110:getfield        #210 <Field int azh.aj>
	// 4345 8113:iconst_m1       
	// 4346 8114:ixor            
	// 4347 8115:iand            
	// 4348 8116:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 4349 8119:aload_0         
	// 4350 8120:getfield        #12  <Field azh a>
	// 4351 8123:astore_1        
		abyte0.b = ((azh) (abyte0)).am ^ a.b;
	// 4352 8124:aload_1         
	// 4353 8125:aload_1         
	// 4354 8126:getfield        #219 <Field int azh.am>
	// 4355 8129:aload_0         
	// 4356 8130:getfield        #12  <Field azh a>
	// 4357 8133:getfield        #240 <Field int azh.b>
	// 4358 8136:ixor            
	// 4359 8137:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 4360 8140:aload_0         
	// 4361 8141:getfield        #12  <Field azh a>
	// 4362 8144:astore_1        
		abyte0.cd = ((azh) (abyte0)).b ^ a.cd;
	// 4363 8145:aload_1         
	// 4364 8146:aload_1         
	// 4365 8147:getfield        #240 <Field int azh.b>
	// 4366 8150:aload_0         
	// 4367 8151:getfield        #12  <Field azh a>
	// 4368 8154:getfield        #141 <Field int azh.cd>
	// 4369 8157:ixor            
	// 4370 8158:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4371 8161:aload_0         
	// 4372 8162:getfield        #12  <Field azh a>
	// 4373 8165:astore_1        
		abyte0.cd = ((azh) (abyte0)).h & a.cd;
	// 4374 8166:aload_1         
	// 4375 8167:aload_1         
	// 4376 8168:getfield        #213 <Field int azh.h>
	// 4377 8171:aload_0         
	// 4378 8172:getfield        #12  <Field azh a>
	// 4379 8175:getfield        #141 <Field int azh.cd>
	// 4380 8178:iand            
	// 4381 8179:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4382 8182:aload_0         
	// 4383 8183:getfield        #12  <Field azh a>
	// 4384 8186:astore_1        
		abyte0.cd = ((azh) (abyte0)).X ^ a.cd;
	// 4385 8187:aload_1         
	// 4386 8188:aload_1         
	// 4387 8189:getfield        #123 <Field int azh.X>
	// 4388 8192:aload_0         
	// 4389 8193:getfield        #12  <Field azh a>
	// 4390 8196:getfield        #141 <Field int azh.cd>
	// 4391 8199:ixor            
	// 4392 8200:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4393 8203:aload_0         
	// 4394 8204:getfield        #12  <Field azh a>
	// 4395 8207:astore_1        
		abyte0.cd = ((azh) (abyte0)).T | a.cd;
	// 4396 8208:aload_1         
	// 4397 8209:aload_1         
	// 4398 8210:getfield        #273 <Field int azh.T>
	// 4399 8213:aload_0         
	// 4400 8214:getfield        #12  <Field azh a>
	// 4401 8217:getfield        #141 <Field int azh.cd>
	// 4402 8220:ior             
	// 4403 8221:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4404 8224:aload_0         
	// 4405 8225:getfield        #12  <Field azh a>
	// 4406 8228:astore_1        
		abyte0.cd = ((azh) (abyte0)).aP ^ a.cd;
	// 4407 8229:aload_1         
	// 4408 8230:aload_1         
	// 4409 8231:getfield        #279 <Field int azh.aP>
	// 4410 8234:aload_0         
	// 4411 8235:getfield        #12  <Field azh a>
	// 4412 8238:getfield        #141 <Field int azh.cd>
	// 4413 8241:ixor            
	// 4414 8242:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4415 8245:aload_0         
	// 4416 8246:getfield        #12  <Field azh a>
	// 4417 8249:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd ^ a.q;
	// 4418 8250:aload_1         
	// 4419 8251:aload_1         
	// 4420 8252:getfield        #141 <Field int azh.cd>
	// 4421 8255:aload_0         
	// 4422 8256:getfield        #12  <Field azh a>
	// 4423 8259:getfield        #294 <Field int azh.q>
	// 4424 8262:ixor            
	// 4425 8263:putfield        #141 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4426 8266:aload_0         
	// 4427 8267:getfield        #12  <Field azh a>
	// 4428 8270:astore_1        
		abyte0.aP = ((azh) (abyte0)).ay | a.cd;
	// 4429 8271:aload_1         
	// 4430 8272:aload_1         
	// 4431 8273:getfield        #150 <Field int azh.ay>
	// 4432 8276:aload_0         
	// 4433 8277:getfield        #12  <Field azh a>
	// 4434 8280:getfield        #141 <Field int azh.cd>
	// 4435 8283:ior             
	// 4436 8284:putfield        #279 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 4437 8287:aload_0         
	// 4438 8288:getfield        #12  <Field azh a>
	// 4439 8291:astore_1        
		abyte0.X = ((azh) (abyte0)).cd & ~a.ay;
	// 4440 8292:aload_1         
	// 4441 8293:aload_1         
	// 4442 8294:getfield        #141 <Field int azh.cd>
	// 4443 8297:aload_0         
	// 4444 8298:getfield        #12  <Field azh a>
	// 4445 8301:getfield        #150 <Field int azh.ay>
	// 4446 8304:iconst_m1       
	// 4447 8305:ixor            
	// 4448 8306:iand            
	// 4449 8307:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 4450 8310:aload_0         
	// 4451 8311:getfield        #12  <Field azh a>
	// 4452 8314:astore_1        
		abyte0.b = ((azh) (abyte0)).aI | a.cd;
	// 4453 8315:aload_1         
	// 4454 8316:aload_1         
	// 4455 8317:getfield        #114 <Field int azh.aI>
	// 4456 8320:aload_0         
	// 4457 8321:getfield        #12  <Field azh a>
	// 4458 8324:getfield        #141 <Field int azh.cd>
	// 4459 8327:ior             
	// 4460 8328:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 4461 8331:aload_0         
	// 4462 8332:getfield        #12  <Field azh a>
	// 4463 8335:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & ~a.aj;
	// 4464 8336:aload_1         
	// 4465 8337:aload_1         
	// 4466 8338:getfield        #231 <Field int azh.bw>
	// 4467 8341:aload_0         
	// 4468 8342:getfield        #12  <Field azh a>
	// 4469 8345:getfield        #210 <Field int azh.aj>
	// 4470 8348:iconst_m1       
	// 4471 8349:ixor            
	// 4472 8350:iand            
	// 4473 8351:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4474 8354:aload_0         
	// 4475 8355:getfield        #12  <Field azh a>
	// 4476 8358:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & ~a.p;
	// 4477 8359:aload_1         
	// 4478 8360:aload_1         
	// 4479 8361:getfield        #231 <Field int azh.bw>
	// 4480 8364:aload_0         
	// 4481 8365:getfield        #12  <Field azh a>
	// 4482 8368:getfield        #216 <Field int azh.p>
	// 4483 8371:iconst_m1       
	// 4484 8372:ixor            
	// 4485 8373:iand            
	// 4486 8374:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4487 8377:aload_0         
	// 4488 8378:getfield        #12  <Field azh a>
	// 4489 8381:astore_1        
		abyte0.bw = ((azh) (abyte0)).aj ^ a.bw;
	// 4490 8382:aload_1         
	// 4491 8383:aload_1         
	// 4492 8384:getfield        #210 <Field int azh.aj>
	// 4493 8387:aload_0         
	// 4494 8388:getfield        #12  <Field azh a>
	// 4495 8391:getfield        #231 <Field int azh.bw>
	// 4496 8394:ixor            
	// 4497 8395:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4498 8398:aload_0         
	// 4499 8399:getfield        #12  <Field azh a>
	// 4500 8402:astore_1        
		abyte0.bw = ((azh) (abyte0)).F | a.bw;
	// 4501 8403:aload_1         
	// 4502 8404:aload_1         
	// 4503 8405:getfield        #162 <Field int azh.F>
	// 4504 8408:aload_0         
	// 4505 8409:getfield        #12  <Field azh a>
	// 4506 8412:getfield        #231 <Field int azh.bw>
	// 4507 8415:ior             
	// 4508 8416:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4509 8419:aload_0         
	// 4510 8420:getfield        #12  <Field azh a>
	// 4511 8423:astore_1        
		abyte0.bw = ((azh) (abyte0)).aZ ^ a.bw;
	// 4512 8424:aload_1         
	// 4513 8425:aload_1         
	// 4514 8426:getfield        #297 <Field int azh.aZ>
	// 4515 8429:aload_0         
	// 4516 8430:getfield        #12  <Field azh a>
	// 4517 8433:getfield        #231 <Field int azh.bw>
	// 4518 8436:ixor            
	// 4519 8437:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4520 8440:aload_0         
	// 4521 8441:getfield        #12  <Field azh a>
	// 4522 8444:astore_1        
		abyte0.aN = ((azh) (abyte0)).bw ^ a.aN;
	// 4523 8445:aload_1         
	// 4524 8446:aload_1         
	// 4525 8447:getfield        #231 <Field int azh.bw>
	// 4526 8450:aload_0         
	// 4527 8451:getfield        #12  <Field azh a>
	// 4528 8454:getfield        #126 <Field int azh.aN>
	// 4529 8457:ixor            
	// 4530 8458:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4531 8461:aload_0         
	// 4532 8462:getfield        #12  <Field azh a>
	// 4533 8465:astore_1        
		abyte0.G = ((azh) (abyte0)).aN ^ a.G;
	// 4534 8466:aload_1         
	// 4535 8467:aload_1         
	// 4536 8468:getfield        #126 <Field int azh.aN>
	// 4537 8471:aload_0         
	// 4538 8472:getfield        #12  <Field azh a>
	// 4539 8475:getfield        #99  <Field int azh.G>
	// 4540 8478:ixor            
	// 4541 8479:putfield        #99  <Field int azh.G>
		abyte0 = ((byte []) (a));
	// 4542 8482:aload_0         
	// 4543 8483:getfield        #12  <Field azh a>
	// 4544 8486:astore_1        
		abyte0.aN = ((azh) (abyte0)).N & ~a.aj;
	// 4545 8487:aload_1         
	// 4546 8488:aload_1         
	// 4547 8489:getfield        #165 <Field int azh.N>
	// 4548 8492:aload_0         
	// 4549 8493:getfield        #12  <Field azh a>
	// 4550 8496:getfield        #210 <Field int azh.aj>
	// 4551 8499:iconst_m1       
	// 4552 8500:ixor            
	// 4553 8501:iand            
	// 4554 8502:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4555 8505:aload_0         
	// 4556 8506:getfield        #12  <Field azh a>
	// 4557 8509:astore_1        
		abyte0.aN = ((azh) (abyte0)).h ^ a.aN;
	// 4558 8510:aload_1         
	// 4559 8511:aload_1         
	// 4560 8512:getfield        #213 <Field int azh.h>
	// 4561 8515:aload_0         
	// 4562 8516:getfield        #12  <Field azh a>
	// 4563 8519:getfield        #126 <Field int azh.aN>
	// 4564 8522:ixor            
	// 4565 8523:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4566 8526:aload_0         
	// 4567 8527:getfield        #12  <Field azh a>
	// 4568 8530:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & ~a.p;
	// 4569 8531:aload_1         
	// 4570 8532:aload_1         
	// 4571 8533:getfield        #126 <Field int azh.aN>
	// 4572 8536:aload_0         
	// 4573 8537:getfield        #12  <Field azh a>
	// 4574 8540:getfield        #216 <Field int azh.p>
	// 4575 8543:iconst_m1       
	// 4576 8544:ixor            
	// 4577 8545:iand            
	// 4578 8546:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4579 8549:aload_0         
	// 4580 8550:getfield        #12  <Field azh a>
	// 4581 8553:astore_1        
		abyte0.aN = ((azh) (abyte0)).W ^ a.aN;
	// 4582 8554:aload_1         
	// 4583 8555:aload_1         
	// 4584 8556:getfield        #249 <Field int azh.W>
	// 4585 8559:aload_0         
	// 4586 8560:getfield        #12  <Field azh a>
	// 4587 8563:getfield        #126 <Field int azh.aN>
	// 4588 8566:ixor            
	// 4589 8567:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4590 8570:aload_0         
	// 4591 8571:getfield        #12  <Field azh a>
	// 4592 8574:astore_1        
		abyte0.bN = ((azh) (abyte0)).aN ^ a.bN;
	// 4593 8575:aload_1         
	// 4594 8576:aload_1         
	// 4595 8577:getfield        #126 <Field int azh.aN>
	// 4596 8580:aload_0         
	// 4597 8581:getfield        #12  <Field azh a>
	// 4598 8584:getfield        #246 <Field int azh.bN>
	// 4599 8587:ixor            
	// 4600 8588:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 4601 8591:aload_0         
	// 4602 8592:getfield        #12  <Field azh a>
	// 4603 8595:astore_1        
		abyte0.bh = ((azh) (abyte0)).bN ^ a.bh;
	// 4604 8596:aload_1         
	// 4605 8597:aload_1         
	// 4606 8598:getfield        #246 <Field int azh.bN>
	// 4607 8601:aload_0         
	// 4608 8602:getfield        #12  <Field azh a>
	// 4609 8605:getfield        #288 <Field int azh.bh>
	// 4610 8608:ixor            
	// 4611 8609:putfield        #288 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4612 8612:aload_0         
	// 4613 8613:getfield        #12  <Field azh a>
	// 4614 8616:astore_1        
		abyte0.ac = ((azh) (abyte0)).bh ^ a.ac;
	// 4615 8617:aload_1         
	// 4616 8618:aload_1         
	// 4617 8619:getfield        #288 <Field int azh.bh>
	// 4618 8622:aload_0         
	// 4619 8623:getfield        #12  <Field azh a>
	// 4620 8626:getfield        #300 <Field int azh.ac>
	// 4621 8629:ixor            
	// 4622 8630:putfield        #300 <Field int azh.ac>
		abyte0 = ((byte []) (a));
	// 4623 8633:aload_0         
	// 4624 8634:getfield        #12  <Field azh a>
	// 4625 8637:astore_1        
		abyte0.bh = ((azh) (abyte0)).ac | a.ci;
	// 4626 8638:aload_1         
	// 4627 8639:aload_1         
	// 4628 8640:getfield        #300 <Field int azh.ac>
	// 4629 8643:aload_0         
	// 4630 8644:getfield        #12  <Field azh a>
	// 4631 8647:getfield        #41  <Field int azh.ci>
	// 4632 8650:ior             
	// 4633 8651:putfield        #288 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4634 8654:aload_0         
	// 4635 8655:getfield        #12  <Field azh a>
	// 4636 8658:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & ~a.a;
	// 4637 8659:aload_1         
	// 4638 8660:aload_1         
	// 4639 8661:getfield        #303 <Field int azh.bZ>
	// 4640 8664:aload_0         
	// 4641 8665:getfield        #12  <Field azh a>
	// 4642 8668:getfield        #96  <Field int azh.a>
	// 4643 8671:iconst_m1       
	// 4644 8672:ixor            
	// 4645 8673:iand            
	// 4646 8674:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4647 8677:aload_0         
	// 4648 8678:getfield        #12  <Field azh a>
	// 4649 8681:astore_1        
		abyte0.bZ = ((azh) (abyte0)).r ^ a.bZ;
	// 4650 8682:aload_1         
	// 4651 8683:aload_1         
	// 4652 8684:getfield        #306 <Field int azh.r>
	// 4653 8687:aload_0         
	// 4654 8688:getfield        #12  <Field azh a>
	// 4655 8691:getfield        #303 <Field int azh.bZ>
	// 4656 8694:ixor            
	// 4657 8695:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4658 8698:aload_0         
	// 4659 8699:getfield        #12  <Field azh a>
	// 4660 8702:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ak & a.bZ;
	// 4661 8703:aload_1         
	// 4662 8704:aload_1         
	// 4663 8705:getfield        #32  <Field int azh.ak>
	// 4664 8708:aload_0         
	// 4665 8709:getfield        #12  <Field azh a>
	// 4666 8712:getfield        #303 <Field int azh.bZ>
	// 4667 8715:iand            
	// 4668 8716:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4669 8719:aload_0         
	// 4670 8720:getfield        #12  <Field azh a>
	// 4671 8723:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ao ^ a.bZ;
	// 4672 8724:aload_1         
	// 4673 8725:aload_1         
	// 4674 8726:getfield        #309 <Field int azh.ao>
	// 4675 8729:aload_0         
	// 4676 8730:getfield        #12  <Field azh a>
	// 4677 8733:getfield        #303 <Field int azh.bZ>
	// 4678 8736:ixor            
	// 4679 8737:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4680 8740:aload_0         
	// 4681 8741:getfield        #12  <Field azh a>
	// 4682 8744:astore_1        
		abyte0.j = ((azh) (abyte0)).bZ ^ a.j;
	// 4683 8745:aload_1         
	// 4684 8746:aload_1         
	// 4685 8747:getfield        #303 <Field int azh.bZ>
	// 4686 8750:aload_0         
	// 4687 8751:getfield        #12  <Field azh a>
	// 4688 8754:getfield        #312 <Field int azh.j>
	// 4689 8757:ixor            
	// 4690 8758:putfield        #312 <Field int azh.j>
		abyte0 = ((byte []) (a));
	// 4691 8761:aload_0         
	// 4692 8762:getfield        #12  <Field azh a>
	// 4693 8765:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bS ^ a.j;
	// 4694 8766:aload_1         
	// 4695 8767:aload_1         
	// 4696 8768:getfield        #315 <Field int azh.bS>
	// 4697 8771:aload_0         
	// 4698 8772:getfield        #12  <Field azh a>
	// 4699 8775:getfield        #312 <Field int azh.j>
	// 4700 8778:ixor            
	// 4701 8779:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4702 8782:aload_0         
	// 4703 8783:getfield        #12  <Field azh a>
	// 4704 8786:astore_1        
		abyte0.ao = ((azh) (abyte0)).j & ~a.bE;
	// 4705 8787:aload_1         
	// 4706 8788:aload_1         
	// 4707 8789:getfield        #312 <Field int azh.j>
	// 4708 8792:aload_0         
	// 4709 8793:getfield        #12  <Field azh a>
	// 4710 8796:getfield        #318 <Field int azh.bE>
	// 4711 8799:iconst_m1       
	// 4712 8800:ixor            
	// 4713 8801:iand            
	// 4714 8802:putfield        #309 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 4715 8805:aload_0         
	// 4716 8806:getfield        #12  <Field azh a>
	// 4717 8809:astore_1        
		abyte0.r = ((azh) (abyte0)).aL & a.ao;
	// 4718 8810:aload_1         
	// 4719 8811:aload_1         
	// 4720 8812:getfield        #183 <Field int azh.aL>
	// 4721 8815:aload_0         
	// 4722 8816:getfield        #12  <Field azh a>
	// 4723 8819:getfield        #309 <Field int azh.ao>
	// 4724 8822:iand            
	// 4725 8823:putfield        #306 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 4726 8826:aload_0         
	// 4727 8827:getfield        #12  <Field azh a>
	// 4728 8830:astore_1        
		abyte0.ao = ((azh) (abyte0)).aL & ~a.ao;
	// 4729 8831:aload_1         
	// 4730 8832:aload_1         
	// 4731 8833:getfield        #183 <Field int azh.aL>
	// 4732 8836:aload_0         
	// 4733 8837:getfield        #12  <Field azh a>
	// 4734 8840:getfield        #309 <Field int azh.ao>
	// 4735 8843:iconst_m1       
	// 4736 8844:ixor            
	// 4737 8845:iand            
	// 4738 8846:putfield        #309 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 4739 8849:aload_0         
	// 4740 8850:getfield        #12  <Field azh a>
	// 4741 8853:astore_1        
		abyte0.ao = ((azh) (abyte0)).cb ^ a.ao;
	// 4742 8854:aload_1         
	// 4743 8855:aload_1         
	// 4744 8856:getfield        #321 <Field int azh.cb>
	// 4745 8859:aload_0         
	// 4746 8860:getfield        #12  <Field azh a>
	// 4747 8863:getfield        #309 <Field int azh.ao>
	// 4748 8866:ixor            
	// 4749 8867:putfield        #309 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 4750 8870:aload_0         
	// 4751 8871:getfield        #12  <Field azh a>
	// 4752 8874:astore_1        
		abyte0.ao = ((azh) (abyte0)).bi & a.ao;
	// 4753 8875:aload_1         
	// 4754 8876:aload_1         
	// 4755 8877:getfield        #324 <Field int azh.bi>
	// 4756 8880:aload_0         
	// 4757 8881:getfield        #12  <Field azh a>
	// 4758 8884:getfield        #309 <Field int azh.ao>
	// 4759 8887:iand            
	// 4760 8888:putfield        #309 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 4761 8891:aload_0         
	// 4762 8892:getfield        #12  <Field azh a>
	// 4763 8895:astore_1        
		abyte0.bN = ((azh) (abyte0)).j & ~a.bl;
	// 4764 8896:aload_1         
	// 4765 8897:aload_1         
	// 4766 8898:getfield        #312 <Field int azh.j>
	// 4767 8901:aload_0         
	// 4768 8902:getfield        #12  <Field azh a>
	// 4769 8905:getfield        #327 <Field int azh.bl>
	// 4770 8908:iconst_m1       
	// 4771 8909:ixor            
	// 4772 8910:iand            
	// 4773 8911:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 4774 8914:aload_0         
	// 4775 8915:getfield        #12  <Field azh a>
	// 4776 8918:astore_1        
		abyte0.bN = ((azh) (abyte0)).bE ^ a.bN;
	// 4777 8919:aload_1         
	// 4778 8920:aload_1         
	// 4779 8921:getfield        #318 <Field int azh.bE>
	// 4780 8924:aload_0         
	// 4781 8925:getfield        #12  <Field azh a>
	// 4782 8928:getfield        #246 <Field int azh.bN>
	// 4783 8931:ixor            
	// 4784 8932:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 4785 8935:aload_0         
	// 4786 8936:getfield        #12  <Field azh a>
	// 4787 8939:astore_1        
		abyte0.bN = ((azh) (abyte0)).aL & a.bN;
	// 4788 8940:aload_1         
	// 4789 8941:aload_1         
	// 4790 8942:getfield        #183 <Field int azh.aL>
	// 4791 8945:aload_0         
	// 4792 8946:getfield        #12  <Field azh a>
	// 4793 8949:getfield        #246 <Field int azh.bN>
	// 4794 8952:iand            
	// 4795 8953:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 4796 8956:aload_0         
	// 4797 8957:getfield        #12  <Field azh a>
	// 4798 8960:astore_1        
		abyte0.aN = ((azh) (abyte0)).j & ~a.bE;
	// 4799 8961:aload_1         
	// 4800 8962:aload_1         
	// 4801 8963:getfield        #312 <Field int azh.j>
	// 4802 8966:aload_0         
	// 4803 8967:getfield        #12  <Field azh a>
	// 4804 8970:getfield        #318 <Field int azh.bE>
	// 4805 8973:iconst_m1       
	// 4806 8974:ixor            
	// 4807 8975:iand            
	// 4808 8976:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4809 8979:aload_0         
	// 4810 8980:getfield        #12  <Field azh a>
	// 4811 8983:astore_1        
		abyte0.aN = ((azh) (abyte0)).bl ^ a.aN;
	// 4812 8984:aload_1         
	// 4813 8985:aload_1         
	// 4814 8986:getfield        #327 <Field int azh.bl>
	// 4815 8989:aload_0         
	// 4816 8990:getfield        #12  <Field azh a>
	// 4817 8993:getfield        #126 <Field int azh.aN>
	// 4818 8996:ixor            
	// 4819 8997:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4820 9000:aload_0         
	// 4821 9001:getfield        #12  <Field azh a>
	// 4822 9004:astore_1        
		abyte0.W = ((azh) (abyte0)).aL & a.aN;
	// 4823 9005:aload_1         
	// 4824 9006:aload_1         
	// 4825 9007:getfield        #183 <Field int azh.aL>
	// 4826 9010:aload_0         
	// 4827 9011:getfield        #12  <Field azh a>
	// 4828 9014:getfield        #126 <Field int azh.aN>
	// 4829 9017:iand            
	// 4830 9018:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 4831 9021:aload_0         
	// 4832 9022:getfield        #12  <Field azh a>
	// 4833 9025:astore_1        
		abyte0.W = ((azh) (abyte0)).bZ ^ a.W;
	// 4834 9026:aload_1         
	// 4835 9027:aload_1         
	// 4836 9028:getfield        #303 <Field int azh.bZ>
	// 4837 9031:aload_0         
	// 4838 9032:getfield        #12  <Field azh a>
	// 4839 9035:getfield        #249 <Field int azh.W>
	// 4840 9038:ixor            
	// 4841 9039:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 4842 9042:aload_0         
	// 4843 9043:getfield        #12  <Field azh a>
	// 4844 9046:astore_1        
		abyte0.ao = ((azh) (abyte0)).W ^ a.ao;
	// 4845 9047:aload_1         
	// 4846 9048:aload_1         
	// 4847 9049:getfield        #249 <Field int azh.W>
	// 4848 9052:aload_0         
	// 4849 9053:getfield        #12  <Field azh a>
	// 4850 9056:getfield        #309 <Field int azh.ao>
	// 4851 9059:ixor            
	// 4852 9060:putfield        #309 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 4853 9063:aload_0         
	// 4854 9064:getfield        #12  <Field azh a>
	// 4855 9067:astore_1        
		abyte0.W = ((azh) (abyte0)).aL | a.aN;
	// 4856 9068:aload_1         
	// 4857 9069:aload_1         
	// 4858 9070:getfield        #183 <Field int azh.aL>
	// 4859 9073:aload_0         
	// 4860 9074:getfield        #12  <Field azh a>
	// 4861 9077:getfield        #126 <Field int azh.aN>
	// 4862 9080:ior             
	// 4863 9081:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 4864 9084:aload_0         
	// 4865 9085:getfield        #12  <Field azh a>
	// 4866 9088:astore_1        
		abyte0.W = ((azh) (abyte0)).bi & a.W;
	// 4867 9089:aload_1         
	// 4868 9090:aload_1         
	// 4869 9091:getfield        #324 <Field int azh.bi>
	// 4870 9094:aload_0         
	// 4871 9095:getfield        #12  <Field azh a>
	// 4872 9098:getfield        #249 <Field int azh.W>
	// 4873 9101:iand            
	// 4874 9102:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 4875 9105:aload_0         
	// 4876 9106:getfield        #12  <Field azh a>
	// 4877 9109:astore_1        
		abyte0.bZ = ((azh) (abyte0)).j & a.bE;
	// 4878 9110:aload_1         
	// 4879 9111:aload_1         
	// 4880 9112:getfield        #312 <Field int azh.j>
	// 4881 9115:aload_0         
	// 4882 9116:getfield        #12  <Field azh a>
	// 4883 9119:getfield        #318 <Field int azh.bE>
	// 4884 9122:iand            
	// 4885 9123:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4886 9126:aload_0         
	// 4887 9127:getfield        #12  <Field azh a>
	// 4888 9130:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aD ^ a.bZ;
	// 4889 9131:aload_1         
	// 4890 9132:aload_1         
	// 4891 9133:getfield        #330 <Field int azh.aD>
	// 4892 9136:aload_0         
	// 4893 9137:getfield        #12  <Field azh a>
	// 4894 9140:getfield        #303 <Field int azh.bZ>
	// 4895 9143:ixor            
	// 4896 9144:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4897 9147:aload_0         
	// 4898 9148:getfield        #12  <Field azh a>
	// 4899 9151:astore_1        
		abyte0.bw = ((azh) (abyte0)).aL & a.bZ;
	// 4900 9152:aload_1         
	// 4901 9153:aload_1         
	// 4902 9154:getfield        #183 <Field int azh.aL>
	// 4903 9157:aload_0         
	// 4904 9158:getfield        #12  <Field azh a>
	// 4905 9161:getfield        #303 <Field int azh.bZ>
	// 4906 9164:iand            
	// 4907 9165:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4908 9168:aload_0         
	// 4909 9169:getfield        #12  <Field azh a>
	// 4910 9172:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aL & a.bZ;
	// 4911 9173:aload_1         
	// 4912 9174:aload_1         
	// 4913 9175:getfield        #183 <Field int azh.aL>
	// 4914 9178:aload_0         
	// 4915 9179:getfield        #12  <Field azh a>
	// 4916 9182:getfield        #303 <Field int azh.bZ>
	// 4917 9185:iand            
	// 4918 9186:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4919 9189:aload_0         
	// 4920 9190:getfield        #12  <Field azh a>
	// 4921 9193:astore_1        
		abyte0.aZ = ((azh) (abyte0)).j & a.bE;
	// 4922 9194:aload_1         
	// 4923 9195:aload_1         
	// 4924 9196:getfield        #312 <Field int azh.j>
	// 4925 9199:aload_0         
	// 4926 9200:getfield        #12  <Field azh a>
	// 4927 9203:getfield        #318 <Field int azh.bE>
	// 4928 9206:iand            
	// 4929 9207:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4930 9210:aload_0         
	// 4931 9211:getfield        #12  <Field azh a>
	// 4932 9214:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bl ^ a.aZ;
	// 4933 9215:aload_1         
	// 4934 9216:aload_1         
	// 4935 9217:getfield        #327 <Field int azh.bl>
	// 4936 9220:aload_0         
	// 4937 9221:getfield        #12  <Field azh a>
	// 4938 9224:getfield        #297 <Field int azh.aZ>
	// 4939 9227:ixor            
	// 4940 9228:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4941 9231:aload_0         
	// 4942 9232:getfield        #12  <Field azh a>
	// 4943 9235:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aL & ~a.aZ;
	// 4944 9236:aload_1         
	// 4945 9237:aload_1         
	// 4946 9238:getfield        #183 <Field int azh.aL>
	// 4947 9241:aload_0         
	// 4948 9242:getfield        #12  <Field azh a>
	// 4949 9245:getfield        #297 <Field int azh.aZ>
	// 4950 9248:iconst_m1       
	// 4951 9249:ixor            
	// 4952 9250:iand            
	// 4953 9251:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4954 9254:aload_0         
	// 4955 9255:getfield        #12  <Field azh a>
	// 4956 9258:astore_1        
		abyte0.am = ((azh) (abyte0)).j & ~a.bE;
	// 4957 9259:aload_1         
	// 4958 9260:aload_1         
	// 4959 9261:getfield        #312 <Field int azh.j>
	// 4960 9264:aload_0         
	// 4961 9265:getfield        #12  <Field azh a>
	// 4962 9268:getfield        #318 <Field int azh.bE>
	// 4963 9271:iconst_m1       
	// 4964 9272:ixor            
	// 4965 9273:iand            
	// 4966 9274:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 4967 9277:aload_0         
	// 4968 9278:getfield        #12  <Field azh a>
	// 4969 9281:astore_1        
		abyte0.am = ((azh) (abyte0)).aD ^ a.am;
	// 4970 9282:aload_1         
	// 4971 9283:aload_1         
	// 4972 9284:getfield        #330 <Field int azh.aD>
	// 4973 9287:aload_0         
	// 4974 9288:getfield        #12  <Field azh a>
	// 4975 9291:getfield        #219 <Field int azh.am>
	// 4976 9294:ixor            
	// 4977 9295:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 4978 9298:aload_0         
	// 4979 9299:getfield        #12  <Field azh a>
	// 4980 9302:astore_1        
		abyte0.bZ = ((azh) (abyte0)).am ^ a.bZ;
	// 4981 9303:aload_1         
	// 4982 9304:aload_1         
	// 4983 9305:getfield        #219 <Field int azh.am>
	// 4984 9308:aload_0         
	// 4985 9309:getfield        #12  <Field azh a>
	// 4986 9312:getfield        #303 <Field int azh.bZ>
	// 4987 9315:ixor            
	// 4988 9316:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4989 9319:aload_0         
	// 4990 9320:getfield        #12  <Field azh a>
	// 4991 9323:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bi & ~a.bZ;
	// 4992 9324:aload_1         
	// 4993 9325:aload_1         
	// 4994 9326:getfield        #324 <Field int azh.bi>
	// 4995 9329:aload_0         
	// 4996 9330:getfield        #12  <Field azh a>
	// 4997 9333:getfield        #303 <Field int azh.bZ>
	// 4998 9336:iconst_m1       
	// 4999 9337:ixor            
	// 5000 9338:iand            
	// 5001 9339:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5002 9342:aload_0         
	// 5003 9343:getfield        #12  <Field azh a>
	// 5004 9346:astore_1        
		abyte0.am = ((azh) (abyte0)).j & ~a.bE;
	// 5005 9347:aload_1         
	// 5006 9348:aload_1         
	// 5007 9349:getfield        #312 <Field int azh.j>
	// 5008 9352:aload_0         
	// 5009 9353:getfield        #12  <Field azh a>
	// 5010 9356:getfield        #318 <Field int azh.bE>
	// 5011 9359:iconst_m1       
	// 5012 9360:ixor            
	// 5013 9361:iand            
	// 5014 9362:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 5015 9365:aload_0         
	// 5016 9366:getfield        #12  <Field azh a>
	// 5017 9369:astore_1        
		abyte0.am = ((azh) (abyte0)).cb ^ a.am;
	// 5018 9370:aload_1         
	// 5019 9371:aload_1         
	// 5020 9372:getfield        #321 <Field int azh.cb>
	// 5021 9375:aload_0         
	// 5022 9376:getfield        #12  <Field azh a>
	// 5023 9379:getfield        #219 <Field int azh.am>
	// 5024 9382:ixor            
	// 5025 9383:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 5026 9386:aload_0         
	// 5027 9387:getfield        #12  <Field azh a>
	// 5028 9390:astore_1        
		abyte0.am = ((azh) (abyte0)).aL & a.am;
	// 5029 9391:aload_1         
	// 5030 9392:aload_1         
	// 5031 9393:getfield        #183 <Field int azh.aL>
	// 5032 9396:aload_0         
	// 5033 9397:getfield        #12  <Field azh a>
	// 5034 9400:getfield        #219 <Field int azh.am>
	// 5035 9403:iand            
	// 5036 9404:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 5037 9407:aload_0         
	// 5038 9408:getfield        #12  <Field azh a>
	// 5039 9411:astore_1        
		abyte0.am = ((azh) (abyte0)).bi & ~a.am;
	// 5040 9412:aload_1         
	// 5041 9413:aload_1         
	// 5042 9414:getfield        #324 <Field int azh.bi>
	// 5043 9417:aload_0         
	// 5044 9418:getfield        #12  <Field azh a>
	// 5045 9421:getfield        #219 <Field int azh.am>
	// 5046 9424:iconst_m1       
	// 5047 9425:ixor            
	// 5048 9426:iand            
	// 5049 9427:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 5050 9430:aload_0         
	// 5051 9431:getfield        #12  <Field azh a>
	// 5052 9434:astore_1        
		abyte0.aD = ((azh) (abyte0)).cb ^ a.j;
	// 5053 9435:aload_1         
	// 5054 9436:aload_1         
	// 5055 9437:getfield        #321 <Field int azh.cb>
	// 5056 9440:aload_0         
	// 5057 9441:getfield        #12  <Field azh a>
	// 5058 9444:getfield        #312 <Field int azh.j>
	// 5059 9447:ixor            
	// 5060 9448:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5061 9451:aload_0         
	// 5062 9452:getfield        #12  <Field azh a>
	// 5063 9455:astore_1        
		abyte0.bN = ((azh) (abyte0)).aD ^ a.bN;
	// 5064 9456:aload_1         
	// 5065 9457:aload_1         
	// 5066 9458:getfield        #330 <Field int azh.aD>
	// 5067 9461:aload_0         
	// 5068 9462:getfield        #12  <Field azh a>
	// 5069 9465:getfield        #246 <Field int azh.bN>
	// 5070 9468:ixor            
	// 5071 9469:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5072 9472:aload_0         
	// 5073 9473:getfield        #12  <Field azh a>
	// 5074 9476:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD & ~a.aL;
	// 5075 9477:aload_1         
	// 5076 9478:aload_1         
	// 5077 9479:getfield        #330 <Field int azh.aD>
	// 5078 9482:aload_0         
	// 5079 9483:getfield        #12  <Field azh a>
	// 5080 9486:getfield        #183 <Field int azh.aL>
	// 5081 9489:iconst_m1       
	// 5082 9490:ixor            
	// 5083 9491:iand            
	// 5084 9492:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5085 9495:aload_0         
	// 5086 9496:getfield        #12  <Field azh a>
	// 5087 9499:astore_1        
		abyte0.aK = ((azh) (abyte0)).j & ~a.aK;
	// 5088 9500:aload_1         
	// 5089 9501:aload_1         
	// 5090 9502:getfield        #312 <Field int azh.j>
	// 5091 9505:aload_0         
	// 5092 9506:getfield        #12  <Field azh a>
	// 5093 9509:getfield        #333 <Field int azh.aK>
	// 5094 9512:iconst_m1       
	// 5095 9513:ixor            
	// 5096 9514:iand            
	// 5097 9515:putfield        #333 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5098 9518:aload_0         
	// 5099 9519:getfield        #12  <Field azh a>
	// 5100 9522:astore_1        
		abyte0.aK = ((azh) (abyte0)).cb ^ a.aK;
	// 5101 9523:aload_1         
	// 5102 9524:aload_1         
	// 5103 9525:getfield        #321 <Field int azh.cb>
	// 5104 9528:aload_0         
	// 5105 9529:getfield        #12  <Field azh a>
	// 5106 9532:getfield        #333 <Field int azh.aK>
	// 5107 9535:ixor            
	// 5108 9536:putfield        #333 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5109 9539:aload_0         
	// 5110 9540:getfield        #12  <Field azh a>
	// 5111 9543:astore_1        
		abyte0.aD = ((azh) (abyte0)).aK ^ a.aD;
	// 5112 9544:aload_1         
	// 5113 9545:aload_1         
	// 5114 9546:getfield        #333 <Field int azh.aK>
	// 5115 9549:aload_0         
	// 5116 9550:getfield        #12  <Field azh a>
	// 5117 9553:getfield        #330 <Field int azh.aD>
	// 5118 9556:ixor            
	// 5119 9557:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5120 9560:aload_0         
	// 5121 9561:getfield        #12  <Field azh a>
	// 5122 9564:astore_1        
		abyte0.aD = ((azh) (abyte0)).bi & a.aD;
	// 5123 9565:aload_1         
	// 5124 9566:aload_1         
	// 5125 9567:getfield        #324 <Field int azh.bi>
	// 5126 9570:aload_0         
	// 5127 9571:getfield        #12  <Field azh a>
	// 5128 9574:getfield        #330 <Field int azh.aD>
	// 5129 9577:iand            
	// 5130 9578:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5131 9581:aload_0         
	// 5132 9582:getfield        #12  <Field azh a>
	// 5133 9585:astore_1        
		abyte0.aD = ((azh) (abyte0)).bN ^ a.aD;
	// 5134 9586:aload_1         
	// 5135 9587:aload_1         
	// 5136 9588:getfield        #246 <Field int azh.bN>
	// 5137 9591:aload_0         
	// 5138 9592:getfield        #12  <Field azh a>
	// 5139 9595:getfield        #330 <Field int azh.aD>
	// 5140 9598:ixor            
	// 5141 9599:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5142 9602:aload_0         
	// 5143 9603:getfield        #12  <Field azh a>
	// 5144 9606:astore_1        
		abyte0.aD = ((azh) (abyte0)).al | a.aD;
	// 5145 9607:aload_1         
	// 5146 9608:aload_1         
	// 5147 9609:getfield        #177 <Field int azh.al>
	// 5148 9612:aload_0         
	// 5149 9613:getfield        #12  <Field azh a>
	// 5150 9616:getfield        #330 <Field int azh.aD>
	// 5151 9619:ior             
	// 5152 9620:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5153 9623:aload_0         
	// 5154 9624:getfield        #12  <Field azh a>
	// 5155 9627:astore_1        
		abyte0.bN = ((azh) (abyte0)).bE ^ a.j;
	// 5156 9628:aload_1         
	// 5157 9629:aload_1         
	// 5158 9630:getfield        #318 <Field int azh.bE>
	// 5159 9633:aload_0         
	// 5160 9634:getfield        #12  <Field azh a>
	// 5161 9637:getfield        #312 <Field int azh.j>
	// 5162 9640:ixor            
	// 5163 9641:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5164 9644:aload_0         
	// 5165 9645:getfield        #12  <Field azh a>
	// 5166 9648:astore_1        
		abyte0.bN = ((azh) (abyte0)).aL & a.bN;
	// 5167 9649:aload_1         
	// 5168 9650:aload_1         
	// 5169 9651:getfield        #183 <Field int azh.aL>
	// 5170 9654:aload_0         
	// 5171 9655:getfield        #12  <Field azh a>
	// 5172 9658:getfield        #246 <Field int azh.bN>
	// 5173 9661:iand            
	// 5174 9662:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5175 9665:aload_0         
	// 5176 9666:getfield        #12  <Field azh a>
	// 5177 9669:astore_1        
		abyte0.bN = ((azh) (abyte0)).aK ^ a.bN;
	// 5178 9670:aload_1         
	// 5179 9671:aload_1         
	// 5180 9672:getfield        #333 <Field int azh.aK>
	// 5181 9675:aload_0         
	// 5182 9676:getfield        #12  <Field azh a>
	// 5183 9679:getfield        #246 <Field int azh.bN>
	// 5184 9682:ixor            
	// 5185 9683:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5186 9686:aload_0         
	// 5187 9687:getfield        #12  <Field azh a>
	// 5188 9690:astore_1        
		abyte0.aK = ((azh) (abyte0)).j & ~a.as;
	// 5189 9691:aload_1         
	// 5190 9692:aload_1         
	// 5191 9693:getfield        #312 <Field int azh.j>
	// 5192 9696:aload_0         
	// 5193 9697:getfield        #12  <Field azh a>
	// 5194 9700:getfield        #336 <Field int azh.as>
	// 5195 9703:iconst_m1       
	// 5196 9704:ixor            
	// 5197 9705:iand            
	// 5198 9706:putfield        #333 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5199 9709:aload_0         
	// 5200 9710:getfield        #12  <Field azh a>
	// 5201 9713:astore_1        
		abyte0.r = ((azh) (abyte0)).aK ^ a.r;
	// 5202 9714:aload_1         
	// 5203 9715:aload_1         
	// 5204 9716:getfield        #333 <Field int azh.aK>
	// 5205 9719:aload_0         
	// 5206 9720:getfield        #12  <Field azh a>
	// 5207 9723:getfield        #306 <Field int azh.r>
	// 5208 9726:ixor            
	// 5209 9727:putfield        #306 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5210 9730:aload_0         
	// 5211 9731:getfield        #12  <Field azh a>
	// 5212 9734:astore_1        
		abyte0.bZ = ((azh) (abyte0)).r ^ a.bZ;
	// 5213 9735:aload_1         
	// 5214 9736:aload_1         
	// 5215 9737:getfield        #306 <Field int azh.r>
	// 5216 9740:aload_0         
	// 5217 9741:getfield        #12  <Field azh a>
	// 5218 9744:getfield        #303 <Field int azh.bZ>
	// 5219 9747:ixor            
	// 5220 9748:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5221 9751:aload_0         
	// 5222 9752:getfield        #12  <Field azh a>
	// 5223 9755:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & a.al;
	// 5224 9756:aload_1         
	// 5225 9757:aload_1         
	// 5226 9758:getfield        #303 <Field int azh.bZ>
	// 5227 9761:aload_0         
	// 5228 9762:getfield        #12  <Field azh a>
	// 5229 9765:getfield        #177 <Field int azh.al>
	// 5230 9768:iand            
	// 5231 9769:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5232 9772:aload_0         
	// 5233 9773:getfield        #12  <Field azh a>
	// 5234 9776:astore_1        
		abyte0.bS = ((azh) (abyte0)).j & ~a.bS;
	// 5235 9777:aload_1         
	// 5236 9778:aload_1         
	// 5237 9779:getfield        #312 <Field int azh.j>
	// 5238 9782:aload_0         
	// 5239 9783:getfield        #12  <Field azh a>
	// 5240 9786:getfield        #315 <Field int azh.bS>
	// 5241 9789:iconst_m1       
	// 5242 9790:ixor            
	// 5243 9791:iand            
	// 5244 9792:putfield        #315 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5245 9795:aload_0         
	// 5246 9796:getfield        #12  <Field azh a>
	// 5247 9799:astore_1        
		abyte0.bS = ((azh) (abyte0)).as ^ a.bS;
	// 5248 9800:aload_1         
	// 5249 9801:aload_1         
	// 5250 9802:getfield        #336 <Field int azh.as>
	// 5251 9805:aload_0         
	// 5252 9806:getfield        #12  <Field azh a>
	// 5253 9809:getfield        #315 <Field int azh.bS>
	// 5254 9812:ixor            
	// 5255 9813:putfield        #315 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5256 9816:aload_0         
	// 5257 9817:getfield        #12  <Field azh a>
	// 5258 9820:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bS ^ a.bJ;
	// 5259 9821:aload_1         
	// 5260 9822:aload_1         
	// 5261 9823:getfield        #315 <Field int azh.bS>
	// 5262 9826:aload_0         
	// 5263 9827:getfield        #12  <Field azh a>
	// 5264 9830:getfield        #339 <Field int azh.bJ>
	// 5265 9833:ixor            
	// 5266 9834:putfield        #339 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5267 9837:aload_0         
	// 5268 9838:getfield        #12  <Field azh a>
	// 5269 9841:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bi & ~a.bJ;
	// 5270 9842:aload_1         
	// 5271 9843:aload_1         
	// 5272 9844:getfield        #324 <Field int azh.bi>
	// 5273 9847:aload_0         
	// 5274 9848:getfield        #12  <Field azh a>
	// 5275 9851:getfield        #339 <Field int azh.bJ>
	// 5276 9854:iconst_m1       
	// 5277 9855:ixor            
	// 5278 9856:iand            
	// 5279 9857:putfield        #339 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5280 9860:aload_0         
	// 5281 9861:getfield        #12  <Field azh a>
	// 5282 9864:astore_1        
		abyte0.bJ = ((azh) (abyte0)).al & ~a.bJ;
	// 5283 9865:aload_1         
	// 5284 9866:aload_1         
	// 5285 9867:getfield        #177 <Field int azh.al>
	// 5286 9870:aload_0         
	// 5287 9871:getfield        #12  <Field azh a>
	// 5288 9874:getfield        #339 <Field int azh.bJ>
	// 5289 9877:iconst_m1       
	// 5290 9878:ixor            
	// 5291 9879:iand            
	// 5292 9880:putfield        #339 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5293 9883:aload_0         
	// 5294 9884:getfield        #12  <Field azh a>
	// 5295 9887:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ao ^ a.bJ;
	// 5296 9888:aload_1         
	// 5297 9889:aload_1         
	// 5298 9890:getfield        #309 <Field int azh.ao>
	// 5299 9893:aload_0         
	// 5300 9894:getfield        #12  <Field azh a>
	// 5301 9897:getfield        #339 <Field int azh.bJ>
	// 5302 9900:ixor            
	// 5303 9901:putfield        #339 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5304 9904:aload_0         
	// 5305 9905:getfield        #12  <Field azh a>
	// 5306 9908:astore_1        
		abyte0.O = ((azh) (abyte0)).bJ ^ a.O;
	// 5307 9909:aload_1         
	// 5308 9910:aload_1         
	// 5309 9911:getfield        #339 <Field int azh.bJ>
	// 5310 9914:aload_0         
	// 5311 9915:getfield        #12  <Field azh a>
	// 5312 9918:getfield        #342 <Field int azh.O>
	// 5313 9921:ixor            
	// 5314 9922:putfield        #342 <Field int azh.O>
		abyte0 = ((byte []) (a));
	// 5315 9925:aload_0         
	// 5316 9926:getfield        #12  <Field azh a>
	// 5317 9929:astore_1        
		abyte0.bw = ((azh) (abyte0)).bS ^ a.bw;
	// 5318 9930:aload_1         
	// 5319 9931:aload_1         
	// 5320 9932:getfield        #315 <Field int azh.bS>
	// 5321 9935:aload_0         
	// 5322 9936:getfield        #12  <Field azh a>
	// 5323 9939:getfield        #231 <Field int azh.bw>
	// 5324 9942:ixor            
	// 5325 9943:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5326 9946:aload_0         
	// 5327 9947:getfield        #12  <Field azh a>
	// 5328 9950:astore_1        
		abyte0.bw = ((azh) (abyte0)).bi & a.bw;
	// 5329 9951:aload_1         
	// 5330 9952:aload_1         
	// 5331 9953:getfield        #324 <Field int azh.bi>
	// 5332 9956:aload_0         
	// 5333 9957:getfield        #12  <Field azh a>
	// 5334 9960:getfield        #231 <Field int azh.bw>
	// 5335 9963:iand            
	// 5336 9964:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5337 9967:aload_0         
	// 5338 9968:getfield        #12  <Field azh a>
	// 5339 9971:astore_1        
		abyte0.bw = ((azh) (abyte0)).bN ^ a.bw;
	// 5340 9972:aload_1         
	// 5341 9973:aload_1         
	// 5342 9974:getfield        #246 <Field int azh.bN>
	// 5343 9977:aload_0         
	// 5344 9978:getfield        #12  <Field azh a>
	// 5345 9981:getfield        #231 <Field int azh.bw>
	// 5346 9984:ixor            
	// 5347 9985:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5348 9988:aload_0         
	// 5349 9989:getfield        #12  <Field azh a>
	// 5350 9992:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & a.al;
	// 5351 9993:aload_1         
	// 5352 9994:aload_1         
	// 5353 9995:getfield        #231 <Field int azh.bw>
	// 5354 9998:aload_0         
	// 5355 9999:getfield        #12  <Field azh a>
	// 5356 10002:getfield        #177 <Field int azh.al>
	// 5357 10005:iand            
	// 5358 10006:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5359 10009:aload_0         
	// 5360 10010:getfield        #12  <Field azh a>
	// 5361 10013:astore_1        
		abyte0.bN = ((azh) (abyte0)).j & a.bE;
	// 5362 10014:aload_1         
	// 5363 10015:aload_1         
	// 5364 10016:getfield        #312 <Field int azh.j>
	// 5365 10019:aload_0         
	// 5366 10020:getfield        #12  <Field azh a>
	// 5367 10023:getfield        #318 <Field int azh.bE>
	// 5368 10026:iand            
	// 5369 10027:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5370 10030:aload_0         
	// 5371 10031:getfield        #12  <Field azh a>
	// 5372 10034:astore_1        
		abyte0.bN = ((azh) (abyte0)).bE ^ a.bN;
	// 5373 10035:aload_1         
	// 5374 10036:aload_1         
	// 5375 10037:getfield        #318 <Field int azh.bE>
	// 5376 10040:aload_0         
	// 5377 10041:getfield        #12  <Field azh a>
	// 5378 10044:getfield        #246 <Field int azh.bN>
	// 5379 10047:ixor            
	// 5380 10048:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5381 10051:aload_0         
	// 5382 10052:getfield        #12  <Field azh a>
	// 5383 10055:astore_1        
		abyte0.bN = ((azh) (abyte0)).aL & ~a.bN;
	// 5384 10056:aload_1         
	// 5385 10057:aload_1         
	// 5386 10058:getfield        #183 <Field int azh.aL>
	// 5387 10061:aload_0         
	// 5388 10062:getfield        #12  <Field azh a>
	// 5389 10065:getfield        #246 <Field int azh.bN>
	// 5390 10068:iconst_m1       
	// 5391 10069:ixor            
	// 5392 10070:iand            
	// 5393 10071:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5394 10074:aload_0         
	// 5395 10075:getfield        #12  <Field azh a>
	// 5396 10078:astore_1        
		abyte0.bN = ((azh) (abyte0)).aN ^ a.bN;
	// 5397 10079:aload_1         
	// 5398 10080:aload_1         
	// 5399 10081:getfield        #126 <Field int azh.aN>
	// 5400 10084:aload_0         
	// 5401 10085:getfield        #12  <Field azh a>
	// 5402 10088:getfield        #246 <Field int azh.bN>
	// 5403 10091:ixor            
	// 5404 10092:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5405 10095:aload_0         
	// 5406 10096:getfield        #12  <Field azh a>
	// 5407 10099:astore_1        
		abyte0.am = ((azh) (abyte0)).bN ^ a.am;
	// 5408 10100:aload_1         
	// 5409 10101:aload_1         
	// 5410 10102:getfield        #246 <Field int azh.bN>
	// 5411 10105:aload_0         
	// 5412 10106:getfield        #12  <Field azh a>
	// 5413 10109:getfield        #219 <Field int azh.am>
	// 5414 10112:ixor            
	// 5415 10113:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 5416 10116:aload_0         
	// 5417 10117:getfield        #12  <Field azh a>
	// 5418 10120:astore_1        
		abyte0.bw = ((azh) (abyte0)).am ^ a.bw;
	// 5419 10121:aload_1         
	// 5420 10122:aload_1         
	// 5421 10123:getfield        #219 <Field int azh.am>
	// 5422 10126:aload_0         
	// 5423 10127:getfield        #12  <Field azh a>
	// 5424 10130:getfield        #231 <Field int azh.bw>
	// 5425 10133:ixor            
	// 5426 10134:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5427 10137:aload_0         
	// 5428 10138:getfield        #12  <Field azh a>
	// 5429 10141:astore_1        
		abyte0.E = ((azh) (abyte0)).bw ^ a.E;
	// 5430 10142:aload_1         
	// 5431 10143:aload_1         
	// 5432 10144:getfield        #231 <Field int azh.bw>
	// 5433 10147:aload_0         
	// 5434 10148:getfield        #12  <Field azh a>
	// 5435 10151:getfield        #345 <Field int azh.E>
	// 5436 10154:ixor            
	// 5437 10155:putfield        #345 <Field int azh.E>
		abyte0 = ((byte []) (a));
	// 5438 10158:aload_0         
	// 5439 10159:getfield        #12  <Field azh a>
	// 5440 10162:astore_1        
		abyte0.bw = ((azh) (abyte0)).E & ~a.w;
	// 5441 10163:aload_1         
	// 5442 10164:aload_1         
	// 5443 10165:getfield        #345 <Field int azh.E>
	// 5444 10168:aload_0         
	// 5445 10169:getfield        #12  <Field azh a>
	// 5446 10172:getfield        #282 <Field int azh.w>
	// 5447 10175:iconst_m1       
	// 5448 10176:ixor            
	// 5449 10177:iand            
	// 5450 10178:putfield        #231 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5451 10181:aload_0         
	// 5452 10182:getfield        #12  <Field azh a>
	// 5453 10185:astore_1        
		abyte0.bN = ((azh) (abyte0)).E & ~a.bw;
	// 5454 10186:aload_1         
	// 5455 10187:aload_1         
	// 5456 10188:getfield        #345 <Field int azh.E>
	// 5457 10191:aload_0         
	// 5458 10192:getfield        #12  <Field azh a>
	// 5459 10195:getfield        #231 <Field int azh.bw>
	// 5460 10198:iconst_m1       
	// 5461 10199:ixor            
	// 5462 10200:iand            
	// 5463 10201:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5464 10204:aload_0         
	// 5465 10205:getfield        #12  <Field azh a>
	// 5466 10208:astore_1        
		abyte0.bN = ((azh) (abyte0)).bN ^ a.o;
	// 5467 10209:aload_1         
	// 5468 10210:aload_1         
	// 5469 10211:getfield        #246 <Field int azh.bN>
	// 5470 10214:aload_0         
	// 5471 10215:getfield        #12  <Field azh a>
	// 5472 10218:getfield        #147 <Field int azh.o>
	// 5473 10221:ixor            
	// 5474 10222:putfield        #246 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 5475 10225:aload_0         
	// 5476 10226:getfield        #12  <Field azh a>
	// 5477 10229:astore_1        
		abyte0.aN = ((azh) (abyte0)).ci | a.E;
	// 5478 10230:aload_1         
	// 5479 10231:aload_1         
	// 5480 10232:getfield        #41  <Field int azh.ci>
	// 5481 10235:aload_0         
	// 5482 10236:getfield        #12  <Field azh a>
	// 5483 10239:getfield        #345 <Field int azh.E>
	// 5484 10242:ior             
	// 5485 10243:putfield        #126 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5486 10246:aload_0         
	// 5487 10247:getfield        #12  <Field azh a>
	// 5488 10250:astore_1        
		abyte0.bS = ((azh) (abyte0)).ac | a.aN;
	// 5489 10251:aload_1         
	// 5490 10252:aload_1         
	// 5491 10253:getfield        #300 <Field int azh.ac>
	// 5492 10256:aload_0         
	// 5493 10257:getfield        #12  <Field azh a>
	// 5494 10260:getfield        #126 <Field int azh.aN>
	// 5495 10263:ior             
	// 5496 10264:putfield        #315 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5497 10267:aload_0         
	// 5498 10268:getfield        #12  <Field azh a>
	// 5499 10271:astore_1        
		abyte0.bJ = ((azh) (abyte0)).E & ~a.ci;
	// 5500 10272:aload_1         
	// 5501 10273:aload_1         
	// 5502 10274:getfield        #345 <Field int azh.E>
	// 5503 10277:aload_0         
	// 5504 10278:getfield        #12  <Field azh a>
	// 5505 10281:getfield        #41  <Field int azh.ci>
	// 5506 10284:iconst_m1       
	// 5507 10285:ixor            
	// 5508 10286:iand            
	// 5509 10287:putfield        #339 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5510 10290:aload_0         
	// 5511 10291:getfield        #12  <Field azh a>
	// 5512 10294:astore_1        
		abyte0.ao = ((azh) (abyte0)).E & ~a.bJ;
	// 5513 10295:aload_1         
	// 5514 10296:aload_1         
	// 5515 10297:getfield        #345 <Field int azh.E>
	// 5516 10300:aload_0         
	// 5517 10301:getfield        #12  <Field azh a>
	// 5518 10304:getfield        #339 <Field int azh.bJ>
	// 5519 10307:iconst_m1       
	// 5520 10308:ixor            
	// 5521 10309:iand            
	// 5522 10310:putfield        #309 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 5523 10313:aload_0         
	// 5524 10314:getfield        #12  <Field azh a>
	// 5525 10317:astore_1        
		abyte0.as = ((azh) (abyte0)).o & ~a.E;
	// 5526 10318:aload_1         
	// 5527 10319:aload_1         
	// 5528 10320:getfield        #147 <Field int azh.o>
	// 5529 10323:aload_0         
	// 5530 10324:getfield        #12  <Field azh a>
	// 5531 10327:getfield        #345 <Field int azh.E>
	// 5532 10330:iconst_m1       
	// 5533 10331:ixor            
	// 5534 10332:iand            
	// 5535 10333:putfield        #336 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5536 10336:aload_0         
	// 5537 10337:getfield        #12  <Field azh a>
	// 5538 10340:astore_1        
		abyte0.r = ((azh) (abyte0)).E & a.w;
	// 5539 10341:aload_1         
	// 5540 10342:aload_1         
	// 5541 10343:getfield        #345 <Field int azh.E>
	// 5542 10346:aload_0         
	// 5543 10347:getfield        #12  <Field azh a>
	// 5544 10350:getfield        #282 <Field int azh.w>
	// 5545 10353:iand            
	// 5546 10354:putfield        #306 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5547 10357:aload_0         
	// 5548 10358:getfield        #12  <Field azh a>
	// 5549 10361:astore_1        
		abyte0.as = ((azh) (abyte0)).r ^ a.as;
	// 5550 10362:aload_1         
	// 5551 10363:aload_1         
	// 5552 10364:getfield        #306 <Field int azh.r>
	// 5553 10367:aload_0         
	// 5554 10368:getfield        #12  <Field azh a>
	// 5555 10371:getfield        #336 <Field int azh.as>
	// 5556 10374:ixor            
	// 5557 10375:putfield        #336 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5558 10378:aload_0         
	// 5559 10379:getfield        #12  <Field azh a>
	// 5560 10382:astore_1        
		abyte0.aK = ((azh) (abyte0)).o & a.r;
	// 5561 10383:aload_1         
	// 5562 10384:aload_1         
	// 5563 10385:getfield        #147 <Field int azh.o>
	// 5564 10388:aload_0         
	// 5565 10389:getfield        #12  <Field azh a>
	// 5566 10392:getfield        #306 <Field int azh.r>
	// 5567 10395:iand            
	// 5568 10396:putfield        #333 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5569 10399:aload_0         
	// 5570 10400:getfield        #12  <Field azh a>
	// 5571 10403:astore_1        
		abyte0.cb = ((azh) (abyte0)).ci ^ a.E;
	// 5572 10404:aload_1         
	// 5573 10405:aload_1         
	// 5574 10406:getfield        #41  <Field int azh.ci>
	// 5575 10409:aload_0         
	// 5576 10410:getfield        #12  <Field azh a>
	// 5577 10413:getfield        #345 <Field int azh.E>
	// 5578 10416:ixor            
	// 5579 10417:putfield        #321 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5580 10420:aload_0         
	// 5581 10421:getfield        #12  <Field azh a>
	// 5582 10424:astore_1        
		abyte0.an = ((azh) (abyte0)).o & a.E;
	// 5583 10425:aload_1         
	// 5584 10426:aload_1         
	// 5585 10427:getfield        #147 <Field int azh.o>
	// 5586 10430:aload_0         
	// 5587 10431:getfield        #12  <Field azh a>
	// 5588 10434:getfield        #345 <Field int azh.E>
	// 5589 10437:iand            
	// 5590 10438:putfield        #234 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 5591 10441:aload_0         
	// 5592 10442:getfield        #12  <Field azh a>
	// 5593 10445:astore_1        
		abyte0.an = ((azh) (abyte0)).bw ^ a.an;
	// 5594 10446:aload_1         
	// 5595 10447:aload_1         
	// 5596 10448:getfield        #231 <Field int azh.bw>
	// 5597 10451:aload_0         
	// 5598 10452:getfield        #12  <Field azh a>
	// 5599 10455:getfield        #234 <Field int azh.an>
	// 5600 10458:ixor            
	// 5601 10459:putfield        #234 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 5602 10462:aload_0         
	// 5603 10463:getfield        #12  <Field azh a>
	// 5604 10466:astore_1        
		abyte0.bD = ((azh) (abyte0)).o & a.E;
	// 5605 10467:aload_1         
	// 5606 10468:aload_1         
	// 5607 10469:getfield        #147 <Field int azh.o>
	// 5608 10472:aload_0         
	// 5609 10473:getfield        #12  <Field azh a>
	// 5610 10476:getfield        #345 <Field int azh.E>
	// 5611 10479:iand            
	// 5612 10480:putfield        #26  <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 5613 10483:aload_0         
	// 5614 10484:getfield        #12  <Field azh a>
	// 5615 10487:astore_1        
		abyte0.bD = ((azh) (abyte0)).r ^ a.bD;
	// 5616 10488:aload_1         
	// 5617 10489:aload_1         
	// 5618 10490:getfield        #306 <Field int azh.r>
	// 5619 10493:aload_0         
	// 5620 10494:getfield        #12  <Field azh a>
	// 5621 10497:getfield        #26  <Field int azh.bD>
	// 5622 10500:ixor            
	// 5623 10501:putfield        #26  <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 5624 10504:aload_0         
	// 5625 10505:getfield        #12  <Field azh a>
	// 5626 10508:astore_1        
		abyte0.r = ((azh) (abyte0)).w & ~a.E;
	// 5627 10509:aload_1         
	// 5628 10510:aload_1         
	// 5629 10511:getfield        #282 <Field int azh.w>
	// 5630 10514:aload_0         
	// 5631 10515:getfield        #12  <Field azh a>
	// 5632 10518:getfield        #345 <Field int azh.E>
	// 5633 10521:iconst_m1       
	// 5634 10522:ixor            
	// 5635 10523:iand            
	// 5636 10524:putfield        #306 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5637 10527:aload_0         
	// 5638 10528:getfield        #12  <Field azh a>
	// 5639 10531:astore_1        
		abyte0.af = ((azh) (abyte0)).r | a.E;
	// 5640 10532:aload_1         
	// 5641 10533:aload_1         
	// 5642 10534:getfield        #306 <Field int azh.r>
	// 5643 10537:aload_0         
	// 5644 10538:getfield        #12  <Field azh a>
	// 5645 10541:getfield        #345 <Field int azh.E>
	// 5646 10544:ior             
	// 5647 10545:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 5648 10548:aload_0         
	// 5649 10549:getfield        #12  <Field azh a>
	// 5650 10552:astore_1        
		abyte0.af = ((azh) (abyte0)).af ^ a.o;
	// 5651 10553:aload_1         
	// 5652 10554:aload_1         
	// 5653 10555:getfield        #111 <Field int azh.af>
	// 5654 10558:aload_0         
	// 5655 10559:getfield        #12  <Field azh a>
	// 5656 10562:getfield        #147 <Field int azh.o>
	// 5657 10565:ixor            
	// 5658 10566:putfield        #111 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 5659 10569:aload_0         
	// 5660 10570:getfield        #12  <Field azh a>
	// 5661 10573:astore_1        
		abyte0.aK = ((azh) (abyte0)).r ^ a.aK;
	// 5662 10574:aload_1         
	// 5663 10575:aload_1         
	// 5664 10576:getfield        #306 <Field int azh.r>
	// 5665 10579:aload_0         
	// 5666 10580:getfield        #12  <Field azh a>
	// 5667 10583:getfield        #333 <Field int azh.aK>
	// 5668 10586:ixor            
	// 5669 10587:putfield        #333 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5670 10590:aload_0         
	// 5671 10591:getfield        #12  <Field azh a>
	// 5672 10594:astore_1        
		abyte0.aM = ((azh) (abyte0)).o & a.E;
	// 5673 10595:aload_1         
	// 5674 10596:aload_1         
	// 5675 10597:getfield        #147 <Field int azh.o>
	// 5676 10600:aload_0         
	// 5677 10601:getfield        #12  <Field azh a>
	// 5678 10604:getfield        #345 <Field int azh.E>
	// 5679 10607:iand            
	// 5680 10608:putfield        #80  <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 5681 10611:aload_0         
	// 5682 10612:getfield        #12  <Field azh a>
	// 5683 10615:astore_1        
		abyte0.aM = ((azh) (abyte0)).r ^ a.aM;
	// 5684 10616:aload_1         
	// 5685 10617:aload_1         
	// 5686 10618:getfield        #306 <Field int azh.r>
	// 5687 10621:aload_0         
	// 5688 10622:getfield        #12  <Field azh a>
	// 5689 10625:getfield        #80  <Field int azh.aM>
	// 5690 10628:ixor            
	// 5691 10629:putfield        #80  <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 5692 10632:aload_0         
	// 5693 10633:getfield        #12  <Field azh a>
	// 5694 10636:astore_1        
		abyte0.r = ((azh) (abyte0)).o & ~a.E;
	// 5695 10637:aload_1         
	// 5696 10638:aload_1         
	// 5697 10639:getfield        #147 <Field int azh.o>
	// 5698 10642:aload_0         
	// 5699 10643:getfield        #12  <Field azh a>
	// 5700 10646:getfield        #345 <Field int azh.E>
	// 5701 10649:iconst_m1       
	// 5702 10650:ixor            
	// 5703 10651:iand            
	// 5704 10652:putfield        #306 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5705 10655:aload_0         
	// 5706 10656:getfield        #12  <Field azh a>
	// 5707 10659:astore_1        
		abyte0.r = ((azh) (abyte0)).bw ^ a.r;
	// 5708 10660:aload_1         
	// 5709 10661:aload_1         
	// 5710 10662:getfield        #231 <Field int azh.bw>
	// 5711 10665:aload_0         
	// 5712 10666:getfield        #12  <Field azh a>
	// 5713 10669:getfield        #306 <Field int azh.r>
	// 5714 10672:ixor            
	// 5715 10673:putfield        #306 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5716 10676:aload_0         
	// 5717 10677:getfield        #12  <Field azh a>
	// 5718 10680:astore_1        
		abyte0.aq = ((azh) (abyte0)).o & ~a.E;
	// 5719 10681:aload_1         
	// 5720 10682:aload_1         
	// 5721 10683:getfield        #147 <Field int azh.o>
	// 5722 10686:aload_0         
	// 5723 10687:getfield        #12  <Field azh a>
	// 5724 10690:getfield        #345 <Field int azh.E>
	// 5725 10693:iconst_m1       
	// 5726 10694:ixor            
	// 5727 10695:iand            
	// 5728 10696:putfield        #44  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5729 10699:aload_0         
	// 5730 10700:getfield        #12  <Field azh a>
	// 5731 10703:astore_1        
		abyte0.R = ((azh) (abyte0)).ci & ~a.E;
	// 5732 10704:aload_1         
	// 5733 10705:aload_1         
	// 5734 10706:getfield        #41  <Field int azh.ci>
	// 5735 10709:aload_0         
	// 5736 10710:getfield        #12  <Field azh a>
	// 5737 10713:getfield        #345 <Field int azh.E>
	// 5738 10716:iconst_m1       
	// 5739 10717:ixor            
	// 5740 10718:iand            
	// 5741 10719:putfield        #68  <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5742 10722:aload_0         
	// 5743 10723:getfield        #12  <Field azh a>
	// 5744 10726:astore_1        
		abyte0.bv = ((azh) (abyte0)).E | a.R;
	// 5745 10727:aload_1         
	// 5746 10728:aload_1         
	// 5747 10729:getfield        #345 <Field int azh.E>
	// 5748 10732:aload_0         
	// 5749 10733:getfield        #12  <Field azh a>
	// 5750 10736:getfield        #68  <Field int azh.R>
	// 5751 10739:ior             
	// 5752 10740:putfield        #65  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 5753 10743:aload_0         
	// 5754 10744:getfield        #12  <Field azh a>
	// 5755 10747:astore_1        
		abyte0.aS = ((azh) (abyte0)).w ^ a.E;
	// 5756 10748:aload_1         
	// 5757 10749:aload_1         
	// 5758 10750:getfield        #282 <Field int azh.w>
	// 5759 10753:aload_0         
	// 5760 10754:getfield        #12  <Field azh a>
	// 5761 10757:getfield        #345 <Field int azh.E>
	// 5762 10760:ixor            
	// 5763 10761:putfield        #38  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 5764 10764:aload_0         
	// 5765 10765:getfield        #12  <Field azh a>
	// 5766 10768:astore_1        
		abyte0.bU = ((azh) (abyte0)).o & ~a.aS;
	// 5767 10769:aload_1         
	// 5768 10770:aload_1         
	// 5769 10771:getfield        #147 <Field int azh.o>
	// 5770 10774:aload_0         
	// 5771 10775:getfield        #12  <Field azh a>
	// 5772 10778:getfield        #38  <Field int azh.aS>
	// 5773 10781:iconst_m1       
	// 5774 10782:ixor            
	// 5775 10783:iand            
	// 5776 10784:putfield        #50  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 5777 10787:aload_0         
	// 5778 10788:getfield        #12  <Field azh a>
	// 5779 10791:astore_1        
		abyte0.bU = ((azh) (abyte0)).aS ^ a.bU;
	// 5780 10792:aload_1         
	// 5781 10793:aload_1         
	// 5782 10794:getfield        #38  <Field int azh.aS>
	// 5783 10797:aload_0         
	// 5784 10798:getfield        #12  <Field azh a>
	// 5785 10801:getfield        #50  <Field int azh.bU>
	// 5786 10804:ixor            
	// 5787 10805:putfield        #50  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 5788 10808:aload_0         
	// 5789 10809:getfield        #12  <Field azh a>
	// 5790 10812:astore_1        
		abyte0.aJ = ((azh) (abyte0)).o & a.aS;
	// 5791 10813:aload_1         
	// 5792 10814:aload_1         
	// 5793 10815:getfield        #147 <Field int azh.o>
	// 5794 10818:aload_0         
	// 5795 10819:getfield        #12  <Field azh a>
	// 5796 10822:getfield        #38  <Field int azh.aS>
	// 5797 10825:iand            
	// 5798 10826:putfield        #348 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 5799 10829:aload_0         
	// 5800 10830:getfield        #12  <Field azh a>
	// 5801 10833:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aS ^ a.aJ;
	// 5802 10834:aload_1         
	// 5803 10835:aload_1         
	// 5804 10836:getfield        #38  <Field int azh.aS>
	// 5805 10839:aload_0         
	// 5806 10840:getfield        #12  <Field azh a>
	// 5807 10843:getfield        #348 <Field int azh.aJ>
	// 5808 10846:ixor            
	// 5809 10847:putfield        #348 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 5810 10850:aload_0         
	// 5811 10851:getfield        #12  <Field azh a>
	// 5812 10854:astore_1        
		abyte0.aq = ((azh) (abyte0)).aS ^ a.aq;
	// 5813 10855:aload_1         
	// 5814 10856:aload_1         
	// 5815 10857:getfield        #38  <Field int azh.aS>
	// 5816 10860:aload_0         
	// 5817 10861:getfield        #12  <Field azh a>
	// 5818 10864:getfield        #44  <Field int azh.aq>
	// 5819 10867:ixor            
	// 5820 10868:putfield        #44  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5821 10871:aload_0         
	// 5822 10872:getfield        #12  <Field azh a>
	// 5823 10875:astore_1        
		abyte0.bQ = ((azh) (abyte0)).o & a.aS;
	// 5824 10876:aload_1         
	// 5825 10877:aload_1         
	// 5826 10878:getfield        #147 <Field int azh.o>
	// 5827 10881:aload_0         
	// 5828 10882:getfield        #12  <Field azh a>
	// 5829 10885:getfield        #38  <Field int azh.aS>
	// 5830 10888:iand            
	// 5831 10889:putfield        #351 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5832 10892:aload_0         
	// 5833 10893:getfield        #12  <Field azh a>
	// 5834 10896:astore_1        
		abyte0.bQ = ((azh) (abyte0)).E ^ a.bQ;
	// 5835 10897:aload_1         
	// 5836 10898:aload_1         
	// 5837 10899:getfield        #345 <Field int azh.E>
	// 5838 10902:aload_0         
	// 5839 10903:getfield        #12  <Field azh a>
	// 5840 10906:getfield        #351 <Field int azh.bQ>
	// 5841 10909:ixor            
	// 5842 10910:putfield        #351 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5843 10913:aload_0         
	// 5844 10914:getfield        #12  <Field azh a>
	// 5845 10917:astore_1        
		abyte0.bj = ((azh) (abyte0)).o & a.E;
	// 5846 10918:aload_1         
	// 5847 10919:aload_1         
	// 5848 10920:getfield        #147 <Field int azh.o>
	// 5849 10923:aload_0         
	// 5850 10924:getfield        #12  <Field azh a>
	// 5851 10927:getfield        #345 <Field int azh.E>
	// 5852 10930:iand            
	// 5853 10931:putfield        #354 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5854 10934:aload_0         
	// 5855 10935:getfield        #12  <Field azh a>
	// 5856 10938:astore_1        
		abyte0.bj = ((azh) (abyte0)).w ^ a.bj;
	// 5857 10939:aload_1         
	// 5858 10940:aload_1         
	// 5859 10941:getfield        #282 <Field int azh.w>
	// 5860 10944:aload_0         
	// 5861 10945:getfield        #12  <Field azh a>
	// 5862 10948:getfield        #354 <Field int azh.bj>
	// 5863 10951:ixor            
	// 5864 10952:putfield        #354 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5865 10955:aload_0         
	// 5866 10956:getfield        #12  <Field azh a>
	// 5867 10959:astore_1        
		abyte0.bx = ((azh) (abyte0)).ci & a.E;
	// 5868 10960:aload_1         
	// 5869 10961:aload_1         
	// 5870 10962:getfield        #41  <Field int azh.ci>
	// 5871 10965:aload_0         
	// 5872 10966:getfield        #12  <Field azh a>
	// 5873 10969:getfield        #345 <Field int azh.E>
	// 5874 10972:iand            
	// 5875 10973:putfield        #357 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 5876 10976:aload_0         
	// 5877 10977:getfield        #12  <Field azh a>
	// 5878 10980:astore_1        
		abyte0.aD = ((azh) (abyte0)).am ^ a.aD;
	// 5879 10981:aload_1         
	// 5880 10982:aload_1         
	// 5881 10983:getfield        #219 <Field int azh.am>
	// 5882 10986:aload_0         
	// 5883 10987:getfield        #12  <Field azh a>
	// 5884 10990:getfield        #330 <Field int azh.aD>
	// 5885 10993:ixor            
	// 5886 10994:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5887 10997:aload_0         
	// 5888 10998:getfield        #12  <Field azh a>
	// 5889 11001:astore_1        
		abyte0.A = ((azh) (abyte0)).aD ^ a.A;
	// 5890 11002:aload_1         
	// 5891 11003:aload_1         
	// 5892 11004:getfield        #330 <Field int azh.aD>
	// 5893 11007:aload_0         
	// 5894 11008:getfield        #12  <Field azh a>
	// 5895 11011:getfield        #360 <Field int azh.A>
	// 5896 11014:ixor            
	// 5897 11015:putfield        #360 <Field int azh.A>
		abyte0 = ((byte []) (a));
	// 5898 11018:aload_0         
	// 5899 11019:getfield        #12  <Field azh a>
	// 5900 11022:astore_1        
		abyte0.aH = ((azh) (abyte0)).j & a.aH;
	// 5901 11023:aload_1         
	// 5902 11024:aload_1         
	// 5903 11025:getfield        #312 <Field int azh.j>
	// 5904 11028:aload_0         
	// 5905 11029:getfield        #12  <Field azh a>
	// 5906 11032:getfield        #363 <Field int azh.aH>
	// 5907 11035:iand            
	// 5908 11036:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 5909 11039:aload_0         
	// 5910 11040:getfield        #12  <Field azh a>
	// 5911 11043:astore_1        
		abyte0.aH = ((azh) (abyte0)).bE ^ a.aH;
	// 5912 11044:aload_1         
	// 5913 11045:aload_1         
	// 5914 11046:getfield        #318 <Field int azh.bE>
	// 5915 11049:aload_0         
	// 5916 11050:getfield        #12  <Field azh a>
	// 5917 11053:getfield        #363 <Field int azh.aH>
	// 5918 11056:ixor            
	// 5919 11057:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 5920 11060:aload_0         
	// 5921 11061:getfield        #12  <Field azh a>
	// 5922 11064:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aH ^ a.aZ;
	// 5923 11065:aload_1         
	// 5924 11066:aload_1         
	// 5925 11067:getfield        #363 <Field int azh.aH>
	// 5926 11070:aload_0         
	// 5927 11071:getfield        #12  <Field azh a>
	// 5928 11074:getfield        #297 <Field int azh.aZ>
	// 5929 11077:ixor            
	// 5930 11078:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5931 11081:aload_0         
	// 5932 11082:getfield        #12  <Field azh a>
	// 5933 11085:astore_1        
		abyte0.W = ((azh) (abyte0)).aZ ^ a.W;
	// 5934 11086:aload_1         
	// 5935 11087:aload_1         
	// 5936 11088:getfield        #297 <Field int azh.aZ>
	// 5937 11091:aload_0         
	// 5938 11092:getfield        #12  <Field azh a>
	// 5939 11095:getfield        #249 <Field int azh.W>
	// 5940 11098:ixor            
	// 5941 11099:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 5942 11102:aload_0         
	// 5943 11103:getfield        #12  <Field azh a>
	// 5944 11106:astore_1        
		abyte0.bZ = ((azh) (abyte0)).W ^ a.bZ;
	// 5945 11107:aload_1         
	// 5946 11108:aload_1         
	// 5947 11109:getfield        #249 <Field int azh.W>
	// 5948 11112:aload_0         
	// 5949 11113:getfield        #12  <Field azh a>
	// 5950 11116:getfield        #303 <Field int azh.bZ>
	// 5951 11119:ixor            
	// 5952 11120:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5953 11123:aload_0         
	// 5954 11124:getfield        #12  <Field azh a>
	// 5955 11127:astore_1        
		abyte0.m = ((azh) (abyte0)).bZ ^ a.m;
	// 5956 11128:aload_1         
	// 5957 11129:aload_1         
	// 5958 11130:getfield        #303 <Field int azh.bZ>
	// 5959 11133:aload_0         
	// 5960 11134:getfield        #12  <Field azh a>
	// 5961 11137:getfield        #366 <Field int azh.m>
	// 5962 11140:ixor            
	// 5963 11141:putfield        #366 <Field int azh.m>
		abyte0 = ((byte []) (a));
	// 5964 11144:aload_0         
	// 5965 11145:getfield        #12  <Field azh a>
	// 5966 11148:astore_1        
		abyte0.bR = ((azh) (abyte0)).m & ~a.bR;
	// 5967 11149:aload_1         
	// 5968 11150:aload_1         
	// 5969 11151:getfield        #366 <Field int azh.m>
	// 5970 11154:aload_0         
	// 5971 11155:getfield        #12  <Field azh a>
	// 5972 11158:getfield        #156 <Field int azh.bR>
	// 5973 11161:iconst_m1       
	// 5974 11162:ixor            
	// 5975 11163:iand            
	// 5976 11164:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 5977 11167:aload_0         
	// 5978 11168:getfield        #12  <Field azh a>
	// 5979 11171:astore_1        
		abyte0.q = ((azh) (abyte0)).q & a.a;
	// 5980 11172:aload_1         
	// 5981 11173:aload_1         
	// 5982 11174:getfield        #294 <Field int azh.q>
	// 5983 11177:aload_0         
	// 5984 11178:getfield        #12  <Field azh a>
	// 5985 11181:getfield        #96  <Field int azh.a>
	// 5986 11184:iand            
	// 5987 11185:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 5988 11188:aload_0         
	// 5989 11189:getfield        #12  <Field azh a>
	// 5990 11192:astore_1        
		abyte0.q = ((azh) (abyte0)).ap ^ a.q;
	// 5991 11193:aload_1         
	// 5992 11194:aload_1         
	// 5993 11195:getfield        #369 <Field int azh.ap>
	// 5994 11198:aload_0         
	// 5995 11199:getfield        #12  <Field azh a>
	// 5996 11202:getfield        #294 <Field int azh.q>
	// 5997 11205:ixor            
	// 5998 11206:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 5999 11209:aload_0         
	// 6000 11210:getfield        #12  <Field azh a>
	// 6001 11213:astore_1        
		abyte0.q = ((azh) (abyte0)).i | a.q;
	// 6002 11214:aload_1         
	// 6003 11215:aload_1         
	// 6004 11216:getfield        #91  <Field int azh.i>
	// 6005 11219:aload_0         
	// 6006 11220:getfield        #12  <Field azh a>
	// 6007 11223:getfield        #294 <Field int azh.q>
	// 6008 11226:ior             
	// 6009 11227:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 6010 11230:aload_0         
	// 6011 11231:getfield        #12  <Field azh a>
	// 6012 11234:astore_1        
		abyte0.aY = ((azh) (abyte0)).q ^ a.aY;
	// 6013 11235:aload_1         
	// 6014 11236:aload_1         
	// 6015 11237:getfield        #294 <Field int azh.q>
	// 6016 11240:aload_0         
	// 6017 11241:getfield        #12  <Field azh a>
	// 6018 11244:getfield        #372 <Field int azh.aY>
	// 6019 11247:ixor            
	// 6020 11248:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 6021 11251:aload_0         
	// 6022 11252:getfield        #12  <Field azh a>
	// 6023 11255:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY & ~a.ak;
	// 6024 11256:aload_1         
	// 6025 11257:aload_1         
	// 6026 11258:getfield        #372 <Field int azh.aY>
	// 6027 11261:aload_0         
	// 6028 11262:getfield        #12  <Field azh a>
	// 6029 11265:getfield        #32  <Field int azh.ak>
	// 6030 11268:iconst_m1       
	// 6031 11269:ixor            
	// 6032 11270:iand            
	// 6033 11271:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 6034 11274:aload_0         
	// 6035 11275:getfield        #12  <Field azh a>
	// 6036 11278:astore_1        
		abyte0.aY = ((azh) (abyte0)).by ^ a.aY;
	// 6037 11279:aload_1         
	// 6038 11280:aload_1         
	// 6039 11281:getfield        #94  <Field int azh.by>
	// 6040 11284:aload_0         
	// 6041 11285:getfield        #12  <Field azh a>
	// 6042 11288:getfield        #372 <Field int azh.aY>
	// 6043 11291:ixor            
	// 6044 11292:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 6045 11295:aload_0         
	// 6046 11296:getfield        #12  <Field azh a>
	// 6047 11299:astore_1        
		abyte0.bY = ((azh) (abyte0)).aY ^ a.bY;
	// 6048 11300:aload_1         
	// 6049 11301:aload_1         
	// 6050 11302:getfield        #372 <Field int azh.aY>
	// 6051 11305:aload_0         
	// 6052 11306:getfield        #12  <Field azh a>
	// 6053 11309:getfield        #375 <Field int azh.bY>
	// 6054 11312:ixor            
	// 6055 11313:putfield        #375 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 6056 11316:aload_0         
	// 6057 11317:getfield        #12  <Field azh a>
	// 6058 11320:astore_1        
		abyte0.aY = ((azh) (abyte0)).bY & ~a.cf;
	// 6059 11321:aload_1         
	// 6060 11322:aload_1         
	// 6061 11323:getfield        #375 <Field int azh.bY>
	// 6062 11326:aload_0         
	// 6063 11327:getfield        #12  <Field azh a>
	// 6064 11330:getfield        #378 <Field int azh.cf>
	// 6065 11333:iconst_m1       
	// 6066 11334:ixor            
	// 6067 11335:iand            
	// 6068 11336:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 6069 11339:aload_0         
	// 6070 11340:getfield        #12  <Field azh a>
	// 6071 11343:astore_1        
		abyte0.by = ((azh) (abyte0)).t | a.aY;
	// 6072 11344:aload_1         
	// 6073 11345:aload_1         
	// 6074 11346:getfield        #381 <Field int azh.t>
	// 6075 11349:aload_0         
	// 6076 11350:getfield        #12  <Field azh a>
	// 6077 11353:getfield        #372 <Field int azh.aY>
	// 6078 11356:ior             
	// 6079 11357:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 6080 11360:aload_0         
	// 6081 11361:getfield        #12  <Field azh a>
	// 6082 11364:astore_1        
		abyte0.aY = ((azh) (abyte0)).t | a.aY;
	// 6083 11365:aload_1         
	// 6084 11366:aload_1         
	// 6085 11367:getfield        #381 <Field int azh.t>
	// 6086 11370:aload_0         
	// 6087 11371:getfield        #12  <Field azh a>
	// 6088 11374:getfield        #372 <Field int azh.aY>
	// 6089 11377:ior             
	// 6090 11378:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 6091 11381:aload_0         
	// 6092 11382:getfield        #12  <Field azh a>
	// 6093 11385:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bY & a.aQ;
	// 6094 11386:aload_1         
	// 6095 11387:aload_1         
	// 6096 11388:getfield        #375 <Field int azh.bY>
	// 6097 11391:aload_0         
	// 6098 11392:getfield        #12  <Field azh a>
	// 6099 11395:getfield        #384 <Field int azh.aQ>
	// 6100 11398:iand            
	// 6101 11399:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 6102 11402:aload_0         
	// 6103 11403:getfield        #12  <Field azh a>
	// 6104 11406:astore_1        
		abyte0.aQ = ((azh) (abyte0)).cl ^ a.aQ;
	// 6105 11407:aload_1         
	// 6106 11408:aload_1         
	// 6107 11409:getfield        #387 <Field int azh.cl>
	// 6108 11412:aload_0         
	// 6109 11413:getfield        #12  <Field azh a>
	// 6110 11416:getfield        #384 <Field int azh.aQ>
	// 6111 11419:ixor            
	// 6112 11420:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 6113 11423:aload_0         
	// 6114 11424:getfield        #12  <Field azh a>
	// 6115 11427:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ax & ~a.aQ;
	// 6116 11428:aload_1         
	// 6117 11429:aload_1         
	// 6118 11430:getfield        #390 <Field int azh.ax>
	// 6119 11433:aload_0         
	// 6120 11434:getfield        #12  <Field azh a>
	// 6121 11437:getfield        #384 <Field int azh.aQ>
	// 6122 11440:iconst_m1       
	// 6123 11441:ixor            
	// 6124 11442:iand            
	// 6125 11443:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 6126 11446:aload_0         
	// 6127 11447:getfield        #12  <Field azh a>
	// 6128 11450:astore_1        
		abyte0.ce = ((azh) (abyte0)).bY & ~a.ce;
	// 6129 11451:aload_1         
	// 6130 11452:aload_1         
	// 6131 11453:getfield        #375 <Field int azh.bY>
	// 6132 11456:aload_0         
	// 6133 11457:getfield        #12  <Field azh a>
	// 6134 11460:getfield        #393 <Field int azh.ce>
	// 6135 11463:iconst_m1       
	// 6136 11464:ixor            
	// 6137 11465:iand            
	// 6138 11466:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6139 11469:aload_0         
	// 6140 11470:getfield        #12  <Field azh a>
	// 6141 11473:astore_1        
		abyte0.ce = ((azh) (abyte0)).cn ^ a.ce;
	// 6142 11474:aload_1         
	// 6143 11475:aload_1         
	// 6144 11476:getfield        #396 <Field int azh.cn>
	// 6145 11479:aload_0         
	// 6146 11480:getfield        #12  <Field azh a>
	// 6147 11483:getfield        #393 <Field int azh.ce>
	// 6148 11486:ixor            
	// 6149 11487:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6150 11490:aload_0         
	// 6151 11491:getfield        #12  <Field azh a>
	// 6152 11494:astore_1        
		abyte0.cn = ((azh) (abyte0)).bY & ~a.cf;
	// 6153 11495:aload_1         
	// 6154 11496:aload_1         
	// 6155 11497:getfield        #375 <Field int azh.bY>
	// 6156 11500:aload_0         
	// 6157 11501:getfield        #12  <Field azh a>
	// 6158 11504:getfield        #378 <Field int azh.cf>
	// 6159 11507:iconst_m1       
	// 6160 11508:ixor            
	// 6161 11509:iand            
	// 6162 11510:putfield        #396 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6163 11513:aload_0         
	// 6164 11514:getfield        #12  <Field azh a>
	// 6165 11517:astore_1        
		abyte0.cn = ((azh) (abyte0)).cf ^ a.cn;
	// 6166 11518:aload_1         
	// 6167 11519:aload_1         
	// 6168 11520:getfield        #378 <Field int azh.cf>
	// 6169 11523:aload_0         
	// 6170 11524:getfield        #12  <Field azh a>
	// 6171 11527:getfield        #396 <Field int azh.cn>
	// 6172 11530:ixor            
	// 6173 11531:putfield        #396 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6174 11534:aload_0         
	// 6175 11535:getfield        #12  <Field azh a>
	// 6176 11538:astore_1        
		abyte0.cn = ((azh) (abyte0)).t & a.cn;
	// 6177 11539:aload_1         
	// 6178 11540:aload_1         
	// 6179 11541:getfield        #381 <Field int azh.t>
	// 6180 11544:aload_0         
	// 6181 11545:getfield        #12  <Field azh a>
	// 6182 11548:getfield        #396 <Field int azh.cn>
	// 6183 11551:iand            
	// 6184 11552:putfield        #396 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6185 11555:aload_0         
	// 6186 11556:getfield        #12  <Field azh a>
	// 6187 11559:astore_1        
		abyte0.aW = ((azh) (abyte0)).bY & ~a.aW;
	// 6188 11560:aload_1         
	// 6189 11561:aload_1         
	// 6190 11562:getfield        #375 <Field int azh.bY>
	// 6191 11565:aload_0         
	// 6192 11566:getfield        #12  <Field azh a>
	// 6193 11569:getfield        #399 <Field int azh.aW>
	// 6194 11572:iconst_m1       
	// 6195 11573:ixor            
	// 6196 11574:iand            
	// 6197 11575:putfield        #399 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6198 11578:aload_0         
	// 6199 11579:getfield        #12  <Field azh a>
	// 6200 11582:astore_1        
		abyte0.aW = ((azh) (abyte0)).bk ^ a.aW;
	// 6201 11583:aload_1         
	// 6202 11584:aload_1         
	// 6203 11585:getfield        #402 <Field int azh.bk>
	// 6204 11588:aload_0         
	// 6205 11589:getfield        #12  <Field azh a>
	// 6206 11592:getfield        #399 <Field int azh.aW>
	// 6207 11595:ixor            
	// 6208 11596:putfield        #399 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6209 11599:aload_0         
	// 6210 11600:getfield        #12  <Field azh a>
	// 6211 11603:astore_1        
		abyte0.aW = ((azh) (abyte0)).ax & ~a.aW;
	// 6212 11604:aload_1         
	// 6213 11605:aload_1         
	// 6214 11606:getfield        #390 <Field int azh.ax>
	// 6215 11609:aload_0         
	// 6216 11610:getfield        #12  <Field azh a>
	// 6217 11613:getfield        #399 <Field int azh.aW>
	// 6218 11616:iconst_m1       
	// 6219 11617:ixor            
	// 6220 11618:iand            
	// 6221 11619:putfield        #399 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6222 11622:aload_0         
	// 6223 11623:getfield        #12  <Field azh a>
	// 6224 11626:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX & ~a.bY;
	// 6225 11627:aload_1         
	// 6226 11628:aload_1         
	// 6227 11629:getfield        #405 <Field int azh.bX>
	// 6228 11632:aload_0         
	// 6229 11633:getfield        #12  <Field azh a>
	// 6230 11636:getfield        #375 <Field int azh.bY>
	// 6231 11639:iconst_m1       
	// 6232 11640:ixor            
	// 6233 11641:iand            
	// 6234 11642:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 6235 11645:aload_0         
	// 6236 11646:getfield        #12  <Field azh a>
	// 6237 11649:astore_1        
		abyte0.bk = ((azh) (abyte0)).bY & ~a.t;
	// 6238 11650:aload_1         
	// 6239 11651:aload_1         
	// 6240 11652:getfield        #375 <Field int azh.bY>
	// 6241 11655:aload_0         
	// 6242 11656:getfield        #12  <Field azh a>
	// 6243 11659:getfield        #381 <Field int azh.t>
	// 6244 11662:iconst_m1       
	// 6245 11663:ixor            
	// 6246 11664:iand            
	// 6247 11665:putfield        #402 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6248 11668:aload_0         
	// 6249 11669:getfield        #12  <Field azh a>
	// 6250 11672:astore_1        
		abyte0.cl = ((azh) (abyte0)).bY & a.cf;
	// 6251 11673:aload_1         
	// 6252 11674:aload_1         
	// 6253 11675:getfield        #375 <Field int azh.bY>
	// 6254 11678:aload_0         
	// 6255 11679:getfield        #12  <Field azh a>
	// 6256 11682:getfield        #378 <Field int azh.cf>
	// 6257 11685:iand            
	// 6258 11686:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 6259 11689:aload_0         
	// 6260 11690:getfield        #12  <Field azh a>
	// 6261 11693:astore_1        
		abyte0.q = ((azh) (abyte0)).bY & ~a.az;
	// 6262 11694:aload_1         
	// 6263 11695:aload_1         
	// 6264 11696:getfield        #375 <Field int azh.bY>
	// 6265 11699:aload_0         
	// 6266 11700:getfield        #12  <Field azh a>
	// 6267 11703:getfield        #408 <Field int azh.az>
	// 6268 11706:iconst_m1       
	// 6269 11707:ixor            
	// 6270 11708:iand            
	// 6271 11709:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 6272 11712:aload_0         
	// 6273 11713:getfield        #12  <Field azh a>
	// 6274 11716:astore_1        
		abyte0.q = ((azh) (abyte0)).aX ^ a.q;
	// 6275 11717:aload_1         
	// 6276 11718:aload_1         
	// 6277 11719:getfield        #411 <Field int azh.aX>
	// 6278 11722:aload_0         
	// 6279 11723:getfield        #12  <Field azh a>
	// 6280 11726:getfield        #294 <Field int azh.q>
	// 6281 11729:ixor            
	// 6282 11730:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 6283 11733:aload_0         
	// 6284 11734:getfield        #12  <Field azh a>
	// 6285 11737:astore_1        
		abyte0.i = ((azh) (abyte0)).bY & a.ca;
	// 6286 11738:aload_1         
	// 6287 11739:aload_1         
	// 6288 11740:getfield        #375 <Field int azh.bY>
	// 6289 11743:aload_0         
	// 6290 11744:getfield        #12  <Field azh a>
	// 6291 11747:getfield        #414 <Field int azh.ca>
	// 6292 11750:iand            
	// 6293 11751:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 6294 11754:aload_0         
	// 6295 11755:getfield        #12  <Field azh a>
	// 6296 11758:astore_1        
		abyte0.i = ((azh) (abyte0)).bP ^ a.i;
	// 6297 11759:aload_1         
	// 6298 11760:aload_1         
	// 6299 11761:getfield        #417 <Field int azh.bP>
	// 6300 11764:aload_0         
	// 6301 11765:getfield        #12  <Field azh a>
	// 6302 11768:getfield        #91  <Field int azh.i>
	// 6303 11771:ixor            
	// 6304 11772:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 6305 11775:aload_0         
	// 6306 11776:getfield        #12  <Field azh a>
	// 6307 11779:astore_1        
		abyte0.i = ((azh) (abyte0)).ax & ~a.i;
	// 6308 11780:aload_1         
	// 6309 11781:aload_1         
	// 6310 11782:getfield        #390 <Field int azh.ax>
	// 6311 11785:aload_0         
	// 6312 11786:getfield        #12  <Field azh a>
	// 6313 11789:getfield        #91  <Field int azh.i>
	// 6314 11792:iconst_m1       
	// 6315 11793:ixor            
	// 6316 11794:iand            
	// 6317 11795:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 6318 11798:aload_0         
	// 6319 11799:getfield        #12  <Field azh a>
	// 6320 11802:astore_1        
		abyte0.C = ((azh) (abyte0)).bY & ~a.C;
	// 6321 11803:aload_1         
	// 6322 11804:aload_1         
	// 6323 11805:getfield        #375 <Field int azh.bY>
	// 6324 11808:aload_0         
	// 6325 11809:getfield        #12  <Field azh a>
	// 6326 11812:getfield        #420 <Field int azh.C>
	// 6327 11815:iconst_m1       
	// 6328 11816:ixor            
	// 6329 11817:iand            
	// 6330 11818:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6331 11821:aload_0         
	// 6332 11822:getfield        #12  <Field azh a>
	// 6333 11825:astore_1        
		abyte0.C = ((azh) (abyte0)).au ^ a.C;
	// 6334 11826:aload_1         
	// 6335 11827:aload_1         
	// 6336 11828:getfield        #423 <Field int azh.au>
	// 6337 11831:aload_0         
	// 6338 11832:getfield        #12  <Field azh a>
	// 6339 11835:getfield        #420 <Field int azh.C>
	// 6340 11838:ixor            
	// 6341 11839:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6342 11842:aload_0         
	// 6343 11843:getfield        #12  <Field azh a>
	// 6344 11846:astore_1        
		abyte0.C = ((azh) (abyte0)).ax & ~a.C;
	// 6345 11847:aload_1         
	// 6346 11848:aload_1         
	// 6347 11849:getfield        #390 <Field int azh.ax>
	// 6348 11852:aload_0         
	// 6349 11853:getfield        #12  <Field azh a>
	// 6350 11856:getfield        #420 <Field int azh.C>
	// 6351 11859:iconst_m1       
	// 6352 11860:ixor            
	// 6353 11861:iand            
	// 6354 11862:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6355 11865:aload_0         
	// 6356 11866:getfield        #12  <Field azh a>
	// 6357 11869:astore_1        
		abyte0.C = ((azh) (abyte0)).ce ^ a.C;
	// 6358 11870:aload_1         
	// 6359 11871:aload_1         
	// 6360 11872:getfield        #393 <Field int azh.ce>
	// 6361 11875:aload_0         
	// 6362 11876:getfield        #12  <Field azh a>
	// 6363 11879:getfield        #420 <Field int azh.C>
	// 6364 11882:ixor            
	// 6365 11883:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6366 11886:aload_0         
	// 6367 11887:getfield        #12  <Field azh a>
	// 6368 11890:astore_1        
		abyte0.ce = ((azh) (abyte0)).bY & a.cf;
	// 6369 11891:aload_1         
	// 6370 11892:aload_1         
	// 6371 11893:getfield        #375 <Field int azh.bY>
	// 6372 11896:aload_0         
	// 6373 11897:getfield        #12  <Field azh a>
	// 6374 11900:getfield        #378 <Field int azh.cf>
	// 6375 11903:iand            
	// 6376 11904:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6377 11907:aload_0         
	// 6378 11908:getfield        #12  <Field azh a>
	// 6379 11911:astore_1        
		abyte0.ce = ((azh) (abyte0)).cf ^ a.ce;
	// 6380 11912:aload_1         
	// 6381 11913:aload_1         
	// 6382 11914:getfield        #378 <Field int azh.cf>
	// 6383 11917:aload_0         
	// 6384 11918:getfield        #12  <Field azh a>
	// 6385 11921:getfield        #393 <Field int azh.ce>
	// 6386 11924:ixor            
	// 6387 11925:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6388 11928:aload_0         
	// 6389 11929:getfield        #12  <Field azh a>
	// 6390 11932:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce & ~a.t;
	// 6391 11933:aload_1         
	// 6392 11934:aload_1         
	// 6393 11935:getfield        #393 <Field int azh.ce>
	// 6394 11938:aload_0         
	// 6395 11939:getfield        #12  <Field azh a>
	// 6396 11942:getfield        #381 <Field int azh.t>
	// 6397 11945:iconst_m1       
	// 6398 11946:ixor            
	// 6399 11947:iand            
	// 6400 11948:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6401 11951:aload_0         
	// 6402 11952:getfield        #12  <Field azh a>
	// 6403 11955:astore_1        
		abyte0.au = ((azh) (abyte0)).ag | a.bY;
	// 6404 11956:aload_1         
	// 6405 11957:aload_1         
	// 6406 11958:getfield        #426 <Field int azh.ag>
	// 6407 11961:aload_0         
	// 6408 11962:getfield        #12  <Field azh a>
	// 6409 11965:getfield        #375 <Field int azh.bY>
	// 6410 11968:ior             
	// 6411 11969:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6412 11972:aload_0         
	// 6413 11973:getfield        #12  <Field azh a>
	// 6414 11976:astore_1        
		abyte0.au = ((azh) (abyte0)).aX ^ a.au;
	// 6415 11977:aload_1         
	// 6416 11978:aload_1         
	// 6417 11979:getfield        #411 <Field int azh.aX>
	// 6418 11982:aload_0         
	// 6419 11983:getfield        #12  <Field azh a>
	// 6420 11986:getfield        #423 <Field int azh.au>
	// 6421 11989:ixor            
	// 6422 11990:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6423 11993:aload_0         
	// 6424 11994:getfield        #12  <Field azh a>
	// 6425 11997:astore_1        
		abyte0.i = ((azh) (abyte0)).au ^ a.i;
	// 6426 11998:aload_1         
	// 6427 11999:aload_1         
	// 6428 12000:getfield        #423 <Field int azh.au>
	// 6429 12003:aload_0         
	// 6430 12004:getfield        #12  <Field azh a>
	// 6431 12007:getfield        #91  <Field int azh.i>
	// 6432 12010:ixor            
	// 6433 12011:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 6434 12014:aload_0         
	// 6435 12015:getfield        #12  <Field azh a>
	// 6436 12018:astore_1        
		abyte0.au = ((azh) (abyte0)).bY & a.aX;
	// 6437 12019:aload_1         
	// 6438 12020:aload_1         
	// 6439 12021:getfield        #375 <Field int azh.bY>
	// 6440 12024:aload_0         
	// 6441 12025:getfield        #12  <Field azh a>
	// 6442 12028:getfield        #411 <Field int azh.aX>
	// 6443 12031:iand            
	// 6444 12032:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6445 12035:aload_0         
	// 6446 12036:getfield        #12  <Field azh a>
	// 6447 12039:astore_1        
		abyte0.au = ((azh) (abyte0)).cg ^ a.au;
	// 6448 12040:aload_1         
	// 6449 12041:aload_1         
	// 6450 12042:getfield        #429 <Field int azh.cg>
	// 6451 12045:aload_0         
	// 6452 12046:getfield        #12  <Field azh a>
	// 6453 12049:getfield        #423 <Field int azh.au>
	// 6454 12052:ixor            
	// 6455 12053:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6456 12056:aload_0         
	// 6457 12057:getfield        #12  <Field azh a>
	// 6458 12060:astore_1        
		abyte0.au = ((azh) (abyte0)).ax & a.au;
	// 6459 12061:aload_1         
	// 6460 12062:aload_1         
	// 6461 12063:getfield        #390 <Field int azh.ax>
	// 6462 12066:aload_0         
	// 6463 12067:getfield        #12  <Field azh a>
	// 6464 12070:getfield        #423 <Field int azh.au>
	// 6465 12073:iand            
	// 6466 12074:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6467 12077:aload_0         
	// 6468 12078:getfield        #12  <Field azh a>
	// 6469 12081:astore_1        
		abyte0.au = ((azh) (abyte0)).bt ^ a.au;
	// 6470 12082:aload_1         
	// 6471 12083:aload_1         
	// 6472 12084:getfield        #432 <Field int azh.bt>
	// 6473 12087:aload_0         
	// 6474 12088:getfield        #12  <Field azh a>
	// 6475 12091:getfield        #423 <Field int azh.au>
	// 6476 12094:ixor            
	// 6477 12095:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6478 12098:aload_0         
	// 6479 12099:getfield        #12  <Field azh a>
	// 6480 12102:astore_1        
		abyte0.au = ((azh) (abyte0)).br & ~a.au;
	// 6481 12103:aload_1         
	// 6482 12104:aload_1         
	// 6483 12105:getfield        #74  <Field int azh.br>
	// 6484 12108:aload_0         
	// 6485 12109:getfield        #12  <Field azh a>
	// 6486 12112:getfield        #423 <Field int azh.au>
	// 6487 12115:iconst_m1       
	// 6488 12116:ixor            
	// 6489 12117:iand            
	// 6490 12118:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6491 12121:aload_0         
	// 6492 12122:getfield        #12  <Field azh a>
	// 6493 12125:astore_1        
		abyte0.au = ((azh) (abyte0)).C ^ a.au;
	// 6494 12126:aload_1         
	// 6495 12127:aload_1         
	// 6496 12128:getfield        #420 <Field int azh.C>
	// 6497 12131:aload_0         
	// 6498 12132:getfield        #12  <Field azh a>
	// 6499 12135:getfield        #423 <Field int azh.au>
	// 6500 12138:ixor            
	// 6501 12139:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6502 12142:aload_0         
	// 6503 12143:getfield        #12  <Field azh a>
	// 6504 12146:astore_1        
		abyte0.U = ((azh) (abyte0)).au ^ a.U;
	// 6505 12147:aload_1         
	// 6506 12148:aload_1         
	// 6507 12149:getfield        #423 <Field int azh.au>
	// 6508 12152:aload_0         
	// 6509 12153:getfield        #12  <Field azh a>
	// 6510 12156:getfield        #435 <Field int azh.U>
	// 6511 12159:ixor            
	// 6512 12160:putfield        #435 <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 6513 12163:aload_0         
	// 6514 12164:getfield        #12  <Field azh a>
	// 6515 12167:astore_1        
		abyte0.aV = ((azh) (abyte0)).bY & ~a.aV;
	// 6516 12168:aload_1         
	// 6517 12169:aload_1         
	// 6518 12170:getfield        #375 <Field int azh.bY>
	// 6519 12173:aload_0         
	// 6520 12174:getfield        #12  <Field azh a>
	// 6521 12177:getfield        #438 <Field int azh.aV>
	// 6522 12180:iconst_m1       
	// 6523 12181:ixor            
	// 6524 12182:iand            
	// 6525 12183:putfield        #438 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 6526 12186:aload_0         
	// 6527 12187:getfield        #12  <Field azh a>
	// 6528 12190:astore_1        
		abyte0.aV = ((azh) (abyte0)).ag ^ a.aV;
	// 6529 12191:aload_1         
	// 6530 12192:aload_1         
	// 6531 12193:getfield        #426 <Field int azh.ag>
	// 6532 12196:aload_0         
	// 6533 12197:getfield        #12  <Field azh a>
	// 6534 12200:getfield        #438 <Field int azh.aV>
	// 6535 12203:ixor            
	// 6536 12204:putfield        #438 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 6537 12207:aload_0         
	// 6538 12208:getfield        #12  <Field azh a>
	// 6539 12211:astore_1        
		abyte0.aV = ((azh) (abyte0)).ax & a.aV;
	// 6540 12212:aload_1         
	// 6541 12213:aload_1         
	// 6542 12214:getfield        #390 <Field int azh.ax>
	// 6543 12217:aload_0         
	// 6544 12218:getfield        #12  <Field azh a>
	// 6545 12221:getfield        #438 <Field int azh.aV>
	// 6546 12224:iand            
	// 6547 12225:putfield        #438 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 6548 12228:aload_0         
	// 6549 12229:getfield        #12  <Field azh a>
	// 6550 12232:astore_1        
		abyte0.aV = ((azh) (abyte0)).q ^ a.aV;
	// 6551 12233:aload_1         
	// 6552 12234:aload_1         
	// 6553 12235:getfield        #294 <Field int azh.q>
	// 6554 12238:aload_0         
	// 6555 12239:getfield        #12  <Field azh a>
	// 6556 12242:getfield        #438 <Field int azh.aV>
	// 6557 12245:ixor            
	// 6558 12246:putfield        #438 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 6559 12249:aload_0         
	// 6560 12250:getfield        #12  <Field azh a>
	// 6561 12253:astore_1        
		abyte0.bA = ((azh) (abyte0)).bY & ~a.bA;
	// 6562 12254:aload_1         
	// 6563 12255:aload_1         
	// 6564 12256:getfield        #375 <Field int azh.bY>
	// 6565 12259:aload_0         
	// 6566 12260:getfield        #12  <Field azh a>
	// 6567 12263:getfield        #441 <Field int azh.bA>
	// 6568 12266:iconst_m1       
	// 6569 12267:ixor            
	// 6570 12268:iand            
	// 6571 12269:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6572 12272:aload_0         
	// 6573 12273:getfield        #12  <Field azh a>
	// 6574 12276:astore_1        
		abyte0.bA = ((azh) (abyte0)).cg ^ a.bA;
	// 6575 12277:aload_1         
	// 6576 12278:aload_1         
	// 6577 12279:getfield        #429 <Field int azh.cg>
	// 6578 12282:aload_0         
	// 6579 12283:getfield        #12  <Field azh a>
	// 6580 12286:getfield        #441 <Field int azh.bA>
	// 6581 12289:ixor            
	// 6582 12290:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6583 12293:aload_0         
	// 6584 12294:getfield        #12  <Field azh a>
	// 6585 12297:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bA ^ a.aQ;
	// 6586 12298:aload_1         
	// 6587 12299:aload_1         
	// 6588 12300:getfield        #441 <Field int azh.bA>
	// 6589 12303:aload_0         
	// 6590 12304:getfield        #12  <Field azh a>
	// 6591 12307:getfield        #384 <Field int azh.aQ>
	// 6592 12310:ixor            
	// 6593 12311:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 6594 12314:aload_0         
	// 6595 12315:getfield        #12  <Field azh a>
	// 6596 12318:astore_1        
		abyte0.ca = ((azh) (abyte0)).bY & a.ca;
	// 6597 12319:aload_1         
	// 6598 12320:aload_1         
	// 6599 12321:getfield        #375 <Field int azh.bY>
	// 6600 12324:aload_0         
	// 6601 12325:getfield        #12  <Field azh a>
	// 6602 12328:getfield        #414 <Field int azh.ca>
	// 6603 12331:iand            
	// 6604 12332:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6605 12335:aload_0         
	// 6606 12336:getfield        #12  <Field azh a>
	// 6607 12339:astore_1        
		abyte0.ca = ((azh) (abyte0)).cc ^ a.ca;
	// 6608 12340:aload_1         
	// 6609 12341:aload_1         
	// 6610 12342:getfield        #444 <Field int azh.cc>
	// 6611 12345:aload_0         
	// 6612 12346:getfield        #12  <Field azh a>
	// 6613 12349:getfield        #414 <Field int azh.ca>
	// 6614 12352:ixor            
	// 6615 12353:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6616 12356:aload_0         
	// 6617 12357:getfield        #12  <Field azh a>
	// 6618 12360:astore_1        
		abyte0.ca = ((azh) (abyte0)).br & ~a.ca;
	// 6619 12361:aload_1         
	// 6620 12362:aload_1         
	// 6621 12363:getfield        #74  <Field int azh.br>
	// 6622 12366:aload_0         
	// 6623 12367:getfield        #12  <Field azh a>
	// 6624 12370:getfield        #414 <Field int azh.ca>
	// 6625 12373:iconst_m1       
	// 6626 12374:ixor            
	// 6627 12375:iand            
	// 6628 12376:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6629 12379:aload_0         
	// 6630 12380:getfield        #12  <Field azh a>
	// 6631 12383:astore_1        
		abyte0.ca = ((azh) (abyte0)).aQ ^ a.ca;
	// 6632 12384:aload_1         
	// 6633 12385:aload_1         
	// 6634 12386:getfield        #384 <Field int azh.aQ>
	// 6635 12389:aload_0         
	// 6636 12390:getfield        #12  <Field azh a>
	// 6637 12393:getfield        #414 <Field int azh.ca>
	// 6638 12396:ixor            
	// 6639 12397:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6640 12400:aload_0         
	// 6641 12401:getfield        #12  <Field azh a>
	// 6642 12404:astore_1        
		abyte0.u = ((azh) (abyte0)).ca ^ a.u;
	// 6643 12405:aload_1         
	// 6644 12406:aload_1         
	// 6645 12407:getfield        #414 <Field int azh.ca>
	// 6646 12410:aload_0         
	// 6647 12411:getfield        #12  <Field azh a>
	// 6648 12414:getfield        #447 <Field int azh.u>
	// 6649 12417:ixor            
	// 6650 12418:putfield        #447 <Field int azh.u>
		abyte0 = ((byte []) (a));
	// 6651 12421:aload_0         
	// 6652 12422:getfield        #12  <Field azh a>
	// 6653 12425:astore_1        
		abyte0.ca = ((azh) (abyte0)).u | a.e;
	// 6654 12426:aload_1         
	// 6655 12427:aload_1         
	// 6656 12428:getfield        #447 <Field int azh.u>
	// 6657 12431:aload_0         
	// 6658 12432:getfield        #12  <Field azh a>
	// 6659 12435:getfield        #285 <Field int azh.e>
	// 6660 12438:ior             
	// 6661 12439:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6662 12442:aload_0         
	// 6663 12443:getfield        #12  <Field azh a>
	// 6664 12446:astore_1        
		abyte0.aQ = ((azh) (abyte0)).u & ~a.bs;
	// 6665 12447:aload_1         
	// 6666 12448:aload_1         
	// 6667 12449:getfield        #447 <Field int azh.u>
	// 6668 12452:aload_0         
	// 6669 12453:getfield        #12  <Field azh a>
	// 6670 12456:getfield        #291 <Field int azh.bs>
	// 6671 12459:iconst_m1       
	// 6672 12460:ixor            
	// 6673 12461:iand            
	// 6674 12462:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 6675 12465:aload_0         
	// 6676 12466:getfield        #12  <Field azh a>
	// 6677 12469:astore_1        
		abyte0.cc = ((azh) (abyte0)).u ^ a.e;
	// 6678 12470:aload_1         
	// 6679 12471:aload_1         
	// 6680 12472:getfield        #447 <Field int azh.u>
	// 6681 12475:aload_0         
	// 6682 12476:getfield        #12  <Field azh a>
	// 6683 12479:getfield        #285 <Field int azh.e>
	// 6684 12482:ixor            
	// 6685 12483:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6686 12486:aload_0         
	// 6687 12487:getfield        #12  <Field azh a>
	// 6688 12490:astore_1        
		abyte0.bA = ((azh) (abyte0)).cc & ~a.bs;
	// 6689 12491:aload_1         
	// 6690 12492:aload_1         
	// 6691 12493:getfield        #444 <Field int azh.cc>
	// 6692 12496:aload_0         
	// 6693 12497:getfield        #12  <Field azh a>
	// 6694 12500:getfield        #291 <Field int azh.bs>
	// 6695 12503:iconst_m1       
	// 6696 12504:ixor            
	// 6697 12505:iand            
	// 6698 12506:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6699 12509:aload_0         
	// 6700 12510:getfield        #12  <Field azh a>
	// 6701 12513:astore_1        
		abyte0.bA = ((azh) (abyte0)).u ^ a.bA;
	// 6702 12514:aload_1         
	// 6703 12515:aload_1         
	// 6704 12516:getfield        #447 <Field int azh.u>
	// 6705 12519:aload_0         
	// 6706 12520:getfield        #12  <Field azh a>
	// 6707 12523:getfield        #441 <Field int azh.bA>
	// 6708 12526:ixor            
	// 6709 12527:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6710 12530:aload_0         
	// 6711 12531:getfield        #12  <Field azh a>
	// 6712 12534:astore_1        
		abyte0.bA = ((azh) (abyte0)).m & ~a.bA;
	// 6713 12535:aload_1         
	// 6714 12536:aload_1         
	// 6715 12537:getfield        #366 <Field int azh.m>
	// 6716 12540:aload_0         
	// 6717 12541:getfield        #12  <Field azh a>
	// 6718 12544:getfield        #441 <Field int azh.bA>
	// 6719 12547:iconst_m1       
	// 6720 12548:ixor            
	// 6721 12549:iand            
	// 6722 12550:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6723 12553:aload_0         
	// 6724 12554:getfield        #12  <Field azh a>
	// 6725 12557:astore_1        
		abyte0.cg = ((azh) (abyte0)).cc & ~a.bs;
	// 6726 12558:aload_1         
	// 6727 12559:aload_1         
	// 6728 12560:getfield        #444 <Field int azh.cc>
	// 6729 12563:aload_0         
	// 6730 12564:getfield        #12  <Field azh a>
	// 6731 12567:getfield        #291 <Field int azh.bs>
	// 6732 12570:iconst_m1       
	// 6733 12571:ixor            
	// 6734 12572:iand            
	// 6735 12573:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6736 12576:aload_0         
	// 6737 12577:getfield        #12  <Field azh a>
	// 6738 12580:astore_1        
		abyte0.cg = ((azh) (abyte0)).ca ^ a.cg;
	// 6739 12581:aload_1         
	// 6740 12582:aload_1         
	// 6741 12583:getfield        #414 <Field int azh.ca>
	// 6742 12586:aload_0         
	// 6743 12587:getfield        #12  <Field azh a>
	// 6744 12590:getfield        #429 <Field int azh.cg>
	// 6745 12593:ixor            
	// 6746 12594:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6747 12597:aload_0         
	// 6748 12598:getfield        #12  <Field azh a>
	// 6749 12601:astore_1        
		abyte0.cg = ((azh) (abyte0)).m & ~a.cg;
	// 6750 12602:aload_1         
	// 6751 12603:aload_1         
	// 6752 12604:getfield        #366 <Field int azh.m>
	// 6753 12607:aload_0         
	// 6754 12608:getfield        #12  <Field azh a>
	// 6755 12611:getfield        #429 <Field int azh.cg>
	// 6756 12614:iconst_m1       
	// 6757 12615:ixor            
	// 6758 12616:iand            
	// 6759 12617:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6760 12620:aload_0         
	// 6761 12621:getfield        #12  <Field azh a>
	// 6762 12624:astore_1        
		abyte0.ca = ((azh) (abyte0)).cc & ~a.bs;
	// 6763 12625:aload_1         
	// 6764 12626:aload_1         
	// 6765 12627:getfield        #444 <Field int azh.cc>
	// 6766 12630:aload_0         
	// 6767 12631:getfield        #12  <Field azh a>
	// 6768 12634:getfield        #291 <Field int azh.bs>
	// 6769 12637:iconst_m1       
	// 6770 12638:ixor            
	// 6771 12639:iand            
	// 6772 12640:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6773 12643:aload_0         
	// 6774 12644:getfield        #12  <Field azh a>
	// 6775 12647:astore_1        
		abyte0.ca = ((azh) (abyte0)).e ^ a.ca;
	// 6776 12648:aload_1         
	// 6777 12649:aload_1         
	// 6778 12650:getfield        #285 <Field int azh.e>
	// 6779 12653:aload_0         
	// 6780 12654:getfield        #12  <Field azh a>
	// 6781 12657:getfield        #414 <Field int azh.ca>
	// 6782 12660:ixor            
	// 6783 12661:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6784 12664:aload_0         
	// 6785 12665:getfield        #12  <Field azh a>
	// 6786 12668:astore_1        
		abyte0.bR = ((azh) (abyte0)).ca ^ a.bR;
	// 6787 12669:aload_1         
	// 6788 12670:aload_1         
	// 6789 12671:getfield        #414 <Field int azh.ca>
	// 6790 12674:aload_0         
	// 6791 12675:getfield        #12  <Field azh a>
	// 6792 12678:getfield        #156 <Field int azh.bR>
	// 6793 12681:ixor            
	// 6794 12682:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 6795 12685:aload_0         
	// 6796 12686:getfield        #12  <Field azh a>
	// 6797 12689:astore_1        
		abyte0.aQ = ((azh) (abyte0)).cc ^ a.aQ;
	// 6798 12690:aload_1         
	// 6799 12691:aload_1         
	// 6800 12692:getfield        #444 <Field int azh.cc>
	// 6801 12695:aload_0         
	// 6802 12696:getfield        #12  <Field azh a>
	// 6803 12699:getfield        #384 <Field int azh.aQ>
	// 6804 12702:ixor            
	// 6805 12703:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 6806 12706:aload_0         
	// 6807 12707:getfield        #12  <Field azh a>
	// 6808 12710:astore_1        
		abyte0.aQ = ((azh) (abyte0)).m & a.aQ;
	// 6809 12711:aload_1         
	// 6810 12712:aload_1         
	// 6811 12713:getfield        #366 <Field int azh.m>
	// 6812 12716:aload_0         
	// 6813 12717:getfield        #12  <Field azh a>
	// 6814 12720:getfield        #384 <Field int azh.aQ>
	// 6815 12723:iand            
	// 6816 12724:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 6817 12727:aload_0         
	// 6818 12728:getfield        #12  <Field azh a>
	// 6819 12731:astore_1        
		abyte0.ca = ((azh) (abyte0)).bs | a.cc;
	// 6820 12732:aload_1         
	// 6821 12733:aload_1         
	// 6822 12734:getfield        #291 <Field int azh.bs>
	// 6823 12737:aload_0         
	// 6824 12738:getfield        #12  <Field azh a>
	// 6825 12741:getfield        #444 <Field int azh.cc>
	// 6826 12744:ior             
	// 6827 12745:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6828 12748:aload_0         
	// 6829 12749:getfield        #12  <Field azh a>
	// 6830 12752:astore_1        
		abyte0.ca = ((azh) (abyte0)).u ^ a.ca;
	// 6831 12753:aload_1         
	// 6832 12754:aload_1         
	// 6833 12755:getfield        #447 <Field int azh.u>
	// 6834 12758:aload_0         
	// 6835 12759:getfield        #12  <Field azh a>
	// 6836 12762:getfield        #414 <Field int azh.ca>
	// 6837 12765:ixor            
	// 6838 12766:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6839 12769:aload_0         
	// 6840 12770:getfield        #12  <Field azh a>
	// 6841 12773:astore_1        
		abyte0.cg = ((azh) (abyte0)).ca ^ a.cg;
	// 6842 12774:aload_1         
	// 6843 12775:aload_1         
	// 6844 12776:getfield        #414 <Field int azh.ca>
	// 6845 12779:aload_0         
	// 6846 12780:getfield        #12  <Field azh a>
	// 6847 12783:getfield        #429 <Field int azh.cg>
	// 6848 12786:ixor            
	// 6849 12787:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6850 12790:aload_0         
	// 6851 12791:getfield        #12  <Field azh a>
	// 6852 12794:astore_1        
		abyte0.ca = ((azh) (abyte0)).bs | a.cc;
	// 6853 12795:aload_1         
	// 6854 12796:aload_1         
	// 6855 12797:getfield        #291 <Field int azh.bs>
	// 6856 12800:aload_0         
	// 6857 12801:getfield        #12  <Field azh a>
	// 6858 12804:getfield        #444 <Field int azh.cc>
	// 6859 12807:ior             
	// 6860 12808:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6861 12811:aload_0         
	// 6862 12812:getfield        #12  <Field azh a>
	// 6863 12815:astore_1        
		abyte0.ca = ((azh) (abyte0)).cc ^ a.ca;
	// 6864 12816:aload_1         
	// 6865 12817:aload_1         
	// 6866 12818:getfield        #444 <Field int azh.cc>
	// 6867 12821:aload_0         
	// 6868 12822:getfield        #12  <Field azh a>
	// 6869 12825:getfield        #414 <Field int azh.ca>
	// 6870 12828:ixor            
	// 6871 12829:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6872 12832:aload_0         
	// 6873 12833:getfield        #12  <Field azh a>
	// 6874 12836:astore_1        
		abyte0.cc = ((azh) (abyte0)).ca & a.m;
	// 6875 12837:aload_1         
	// 6876 12838:aload_1         
	// 6877 12839:getfield        #414 <Field int azh.ca>
	// 6878 12842:aload_0         
	// 6879 12843:getfield        #12  <Field azh a>
	// 6880 12846:getfield        #366 <Field int azh.m>
	// 6881 12849:iand            
	// 6882 12850:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6883 12853:aload_0         
	// 6884 12854:getfield        #12  <Field azh a>
	// 6885 12857:astore_1        
		abyte0.ca = ((azh) (abyte0)).ca & ~a.m;
	// 6886 12858:aload_1         
	// 6887 12859:aload_1         
	// 6888 12860:getfield        #414 <Field int azh.ca>
	// 6889 12863:aload_0         
	// 6890 12864:getfield        #12  <Field azh a>
	// 6891 12867:getfield        #366 <Field int azh.m>
	// 6892 12870:iconst_m1       
	// 6893 12871:ixor            
	// 6894 12872:iand            
	// 6895 12873:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6896 12876:aload_0         
	// 6897 12877:getfield        #12  <Field azh a>
	// 6898 12880:astore_1        
		abyte0.q = ((azh) (abyte0)).e & ~a.u;
	// 6899 12881:aload_1         
	// 6900 12882:aload_1         
	// 6901 12883:getfield        #285 <Field int azh.e>
	// 6902 12886:aload_0         
	// 6903 12887:getfield        #12  <Field azh a>
	// 6904 12890:getfield        #447 <Field int azh.u>
	// 6905 12893:iconst_m1       
	// 6906 12894:ixor            
	// 6907 12895:iand            
	// 6908 12896:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 6909 12899:aload_0         
	// 6910 12900:getfield        #12  <Field azh a>
	// 6911 12903:astore_1        
		abyte0.ag = ((azh) (abyte0)).bs | a.q;
	// 6912 12904:aload_1         
	// 6913 12905:aload_1         
	// 6914 12906:getfield        #291 <Field int azh.bs>
	// 6915 12909:aload_0         
	// 6916 12910:getfield        #12  <Field azh a>
	// 6917 12913:getfield        #294 <Field int azh.q>
	// 6918 12916:ior             
	// 6919 12917:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 6920 12920:aload_0         
	// 6921 12921:getfield        #12  <Field azh a>
	// 6922 12924:astore_1        
		abyte0.au = ((azh) (abyte0)).m & ~a.q;
	// 6923 12925:aload_1         
	// 6924 12926:aload_1         
	// 6925 12927:getfield        #366 <Field int azh.m>
	// 6926 12930:aload_0         
	// 6927 12931:getfield        #12  <Field azh a>
	// 6928 12934:getfield        #294 <Field int azh.q>
	// 6929 12937:iconst_m1       
	// 6930 12938:ixor            
	// 6931 12939:iand            
	// 6932 12940:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6933 12943:aload_0         
	// 6934 12944:getfield        #12  <Field azh a>
	// 6935 12947:astore_1        
		abyte0.cc = ((azh) (abyte0)).q ^ a.cc;
	// 6936 12948:aload_1         
	// 6937 12949:aload_1         
	// 6938 12950:getfield        #294 <Field int azh.q>
	// 6939 12953:aload_0         
	// 6940 12954:getfield        #12  <Field azh a>
	// 6941 12957:getfield        #444 <Field int azh.cc>
	// 6942 12960:ixor            
	// 6943 12961:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6944 12964:aload_0         
	// 6945 12965:getfield        #12  <Field azh a>
	// 6946 12968:astore_1        
		abyte0.cc = ((azh) (abyte0)).K | a.cc;
	// 6947 12969:aload_1         
	// 6948 12970:aload_1         
	// 6949 12971:getfield        #129 <Field int azh.K>
	// 6950 12974:aload_0         
	// 6951 12975:getfield        #12  <Field azh a>
	// 6952 12978:getfield        #444 <Field int azh.cc>
	// 6953 12981:ior             
	// 6954 12982:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6955 12985:aload_0         
	// 6956 12986:getfield        #12  <Field azh a>
	// 6957 12989:astore_1        
		abyte0.C = ((azh) (abyte0)).q & ~a.bs;
	// 6958 12990:aload_1         
	// 6959 12991:aload_1         
	// 6960 12992:getfield        #294 <Field int azh.q>
	// 6961 12995:aload_0         
	// 6962 12996:getfield        #12  <Field azh a>
	// 6963 12999:getfield        #291 <Field int azh.bs>
	// 6964 13002:iconst_m1       
	// 6965 13003:ixor            
	// 6966 13004:iand            
	// 6967 13005:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6968 13008:aload_0         
	// 6969 13009:getfield        #12  <Field azh a>
	// 6970 13012:astore_1        
		abyte0.bt = ((azh) (abyte0)).bs | a.u;
	// 6971 13013:aload_1         
	// 6972 13014:aload_1         
	// 6973 13015:getfield        #291 <Field int azh.bs>
	// 6974 13018:aload_0         
	// 6975 13019:getfield        #12  <Field azh a>
	// 6976 13022:getfield        #447 <Field int azh.u>
	// 6977 13025:ior             
	// 6978 13026:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6979 13029:aload_0         
	// 6980 13030:getfield        #12  <Field azh a>
	// 6981 13033:astore_1        
		abyte0.bP = ((azh) (abyte0)).e & a.u;
	// 6982 13034:aload_1         
	// 6983 13035:aload_1         
	// 6984 13036:getfield        #285 <Field int azh.e>
	// 6985 13039:aload_0         
	// 6986 13040:getfield        #12  <Field azh a>
	// 6987 13043:getfield        #447 <Field int azh.u>
	// 6988 13046:iand            
	// 6989 13047:putfield        #417 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 6990 13050:aload_0         
	// 6991 13051:getfield        #12  <Field azh a>
	// 6992 13054:astore_1        
		abyte0.bt = ((azh) (abyte0)).bP ^ a.bt;
	// 6993 13055:aload_1         
	// 6994 13056:aload_1         
	// 6995 13057:getfield        #417 <Field int azh.bP>
	// 6996 13060:aload_0         
	// 6997 13061:getfield        #12  <Field azh a>
	// 6998 13064:getfield        #432 <Field int azh.bt>
	// 6999 13067:ixor            
	// 7000 13068:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7001 13071:aload_0         
	// 7002 13072:getfield        #12  <Field azh a>
	// 7003 13075:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bt ^ a.aQ;
	// 7004 13076:aload_1         
	// 7005 13077:aload_1         
	// 7006 13078:getfield        #432 <Field int azh.bt>
	// 7007 13081:aload_0         
	// 7008 13082:getfield        #12  <Field azh a>
	// 7009 13085:getfield        #384 <Field int azh.aQ>
	// 7010 13088:ixor            
	// 7011 13089:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 7012 13092:aload_0         
	// 7013 13093:getfield        #12  <Field azh a>
	// 7014 13096:astore_1        
		abyte0.cc = ((azh) (abyte0)).aQ ^ a.cc;
	// 7015 13097:aload_1         
	// 7016 13098:aload_1         
	// 7017 13099:getfield        #384 <Field int azh.aQ>
	// 7018 13102:aload_0         
	// 7019 13103:getfield        #12  <Field azh a>
	// 7020 13106:getfield        #444 <Field int azh.cc>
	// 7021 13109:ixor            
	// 7022 13110:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7023 13113:aload_0         
	// 7024 13114:getfield        #12  <Field azh a>
	// 7025 13117:astore_1        
		abyte0.aQ = ((azh) (abyte0)).u & ~a.e;
	// 7026 13118:aload_1         
	// 7027 13119:aload_1         
	// 7028 13120:getfield        #447 <Field int azh.u>
	// 7029 13123:aload_0         
	// 7030 13124:getfield        #12  <Field azh a>
	// 7031 13127:getfield        #285 <Field int azh.e>
	// 7032 13130:iconst_m1       
	// 7033 13131:ixor            
	// 7034 13132:iand            
	// 7035 13133:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 7036 13136:aload_0         
	// 7037 13137:getfield        #12  <Field azh a>
	// 7038 13140:astore_1        
		abyte0.bt = ((azh) (abyte0)).aQ & ~a.bs;
	// 7039 13141:aload_1         
	// 7040 13142:aload_1         
	// 7041 13143:getfield        #384 <Field int azh.aQ>
	// 7042 13146:aload_0         
	// 7043 13147:getfield        #12  <Field azh a>
	// 7044 13150:getfield        #291 <Field int azh.bs>
	// 7045 13153:iconst_m1       
	// 7046 13154:ixor            
	// 7047 13155:iand            
	// 7048 13156:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7049 13159:aload_0         
	// 7050 13160:getfield        #12  <Field azh a>
	// 7051 13163:astore_1        
		abyte0.bt = ((azh) (abyte0)).q ^ a.bt;
	// 7052 13164:aload_1         
	// 7053 13165:aload_1         
	// 7054 13166:getfield        #294 <Field int azh.q>
	// 7055 13169:aload_0         
	// 7056 13170:getfield        #12  <Field azh a>
	// 7057 13173:getfield        #432 <Field int azh.bt>
	// 7058 13176:ixor            
	// 7059 13177:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7060 13180:aload_0         
	// 7061 13181:getfield        #12  <Field azh a>
	// 7062 13184:astore_1        
		abyte0.au = ((azh) (abyte0)).bt ^ a.au;
	// 7063 13185:aload_1         
	// 7064 13186:aload_1         
	// 7065 13187:getfield        #432 <Field int azh.bt>
	// 7066 13190:aload_0         
	// 7067 13191:getfield        #12  <Field azh a>
	// 7068 13194:getfield        #423 <Field int azh.au>
	// 7069 13197:ixor            
	// 7070 13198:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7071 13201:aload_0         
	// 7072 13202:getfield        #12  <Field azh a>
	// 7073 13205:astore_1        
		abyte0.au = ((azh) (abyte0)).K | a.au;
	// 7074 13206:aload_1         
	// 7075 13207:aload_1         
	// 7076 13208:getfield        #129 <Field int azh.K>
	// 7077 13211:aload_0         
	// 7078 13212:getfield        #12  <Field azh a>
	// 7079 13215:getfield        #423 <Field int azh.au>
	// 7080 13218:ior             
	// 7081 13219:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7082 13222:aload_0         
	// 7083 13223:getfield        #12  <Field azh a>
	// 7084 13226:astore_1        
		abyte0.au = ((azh) (abyte0)).cg ^ a.au;
	// 7085 13227:aload_1         
	// 7086 13228:aload_1         
	// 7087 13229:getfield        #429 <Field int azh.cg>
	// 7088 13232:aload_0         
	// 7089 13233:getfield        #12  <Field azh a>
	// 7090 13236:getfield        #423 <Field int azh.au>
	// 7091 13239:ixor            
	// 7092 13240:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7093 13243:aload_0         
	// 7094 13244:getfield        #12  <Field azh a>
	// 7095 13247:astore_1        
		abyte0.cg = ((azh) (abyte0)).bu & ~a.au;
	// 7096 13248:aload_1         
	// 7097 13249:aload_1         
	// 7098 13250:getfield        #198 <Field int azh.bu>
	// 7099 13253:aload_0         
	// 7100 13254:getfield        #12  <Field azh a>
	// 7101 13257:getfield        #423 <Field int azh.au>
	// 7102 13260:iconst_m1       
	// 7103 13261:ixor            
	// 7104 13262:iand            
	// 7105 13263:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7106 13266:aload_0         
	// 7107 13267:getfield        #12  <Field azh a>
	// 7108 13270:astore_1        
		abyte0.au = ((azh) (abyte0)).au & ~a.bu;
	// 7109 13271:aload_1         
	// 7110 13272:aload_1         
	// 7111 13273:getfield        #423 <Field int azh.au>
	// 7112 13276:aload_0         
	// 7113 13277:getfield        #12  <Field azh a>
	// 7114 13280:getfield        #198 <Field int azh.bu>
	// 7115 13283:iconst_m1       
	// 7116 13284:ixor            
	// 7117 13285:iand            
	// 7118 13286:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7119 13289:aload_0         
	// 7120 13290:getfield        #12  <Field azh a>
	// 7121 13293:astore_1        
		abyte0.bt = ((azh) (abyte0)).m & ~a.aQ;
	// 7122 13294:aload_1         
	// 7123 13295:aload_1         
	// 7124 13296:getfield        #366 <Field int azh.m>
	// 7125 13299:aload_0         
	// 7126 13300:getfield        #12  <Field azh a>
	// 7127 13303:getfield        #384 <Field int azh.aQ>
	// 7128 13306:iconst_m1       
	// 7129 13307:ixor            
	// 7130 13308:iand            
	// 7131 13309:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7132 13312:aload_0         
	// 7133 13313:getfield        #12  <Field azh a>
	// 7134 13316:astore_1        
		abyte0.bt = ((azh) (abyte0)).C ^ a.bt;
	// 7135 13317:aload_1         
	// 7136 13318:aload_1         
	// 7137 13319:getfield        #420 <Field int azh.C>
	// 7138 13322:aload_0         
	// 7139 13323:getfield        #12  <Field azh a>
	// 7140 13326:getfield        #432 <Field int azh.bt>
	// 7141 13329:ixor            
	// 7142 13330:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7143 13333:aload_0         
	// 7144 13334:getfield        #12  <Field azh a>
	// 7145 13337:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt & ~a.K;
	// 7146 13338:aload_1         
	// 7147 13339:aload_1         
	// 7148 13340:getfield        #432 <Field int azh.bt>
	// 7149 13343:aload_0         
	// 7150 13344:getfield        #12  <Field azh a>
	// 7151 13347:getfield        #129 <Field int azh.K>
	// 7152 13350:iconst_m1       
	// 7153 13351:ixor            
	// 7154 13352:iand            
	// 7155 13353:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7156 13356:aload_0         
	// 7157 13357:getfield        #12  <Field azh a>
	// 7158 13360:astore_1        
		abyte0.ag = ((azh) (abyte0)).aQ ^ a.ag;
	// 7159 13361:aload_1         
	// 7160 13362:aload_1         
	// 7161 13363:getfield        #384 <Field int azh.aQ>
	// 7162 13366:aload_0         
	// 7163 13367:getfield        #12  <Field azh a>
	// 7164 13370:getfield        #426 <Field int azh.ag>
	// 7165 13373:ixor            
	// 7166 13374:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7167 13377:aload_0         
	// 7168 13378:getfield        #12  <Field azh a>
	// 7169 13381:astore_1        
		abyte0.bA = ((azh) (abyte0)).ag ^ a.bA;
	// 7170 13382:aload_1         
	// 7171 13383:aload_1         
	// 7172 13384:getfield        #426 <Field int azh.ag>
	// 7173 13387:aload_0         
	// 7174 13388:getfield        #12  <Field azh a>
	// 7175 13391:getfield        #441 <Field int azh.bA>
	// 7176 13394:ixor            
	// 7177 13395:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7178 13398:aload_0         
	// 7179 13399:getfield        #12  <Field azh a>
	// 7180 13402:astore_1        
		abyte0.bt = ((azh) (abyte0)).bA ^ a.bt;
	// 7181 13403:aload_1         
	// 7182 13404:aload_1         
	// 7183 13405:getfield        #441 <Field int azh.bA>
	// 7184 13408:aload_0         
	// 7185 13409:getfield        #12  <Field azh a>
	// 7186 13412:getfield        #432 <Field int azh.bt>
	// 7187 13415:ixor            
	// 7188 13416:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7189 13419:aload_0         
	// 7190 13420:getfield        #12  <Field azh a>
	// 7191 13423:astore_1        
		abyte0.bA = ((azh) (abyte0)).bu | a.bt;
	// 7192 13424:aload_1         
	// 7193 13425:aload_1         
	// 7194 13426:getfield        #198 <Field int azh.bu>
	// 7195 13429:aload_0         
	// 7196 13430:getfield        #12  <Field azh a>
	// 7197 13433:getfield        #432 <Field int azh.bt>
	// 7198 13436:ior             
	// 7199 13437:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7200 13440:aload_0         
	// 7201 13441:getfield        #12  <Field azh a>
	// 7202 13444:astore_1        
		abyte0.bA = ((azh) (abyte0)).cc ^ a.bA;
	// 7203 13445:aload_1         
	// 7204 13446:aload_1         
	// 7205 13447:getfield        #444 <Field int azh.cc>
	// 7206 13450:aload_0         
	// 7207 13451:getfield        #12  <Field azh a>
	// 7208 13454:getfield        #441 <Field int azh.bA>
	// 7209 13457:ixor            
	// 7210 13458:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7211 13461:aload_0         
	// 7212 13462:getfield        #12  <Field azh a>
	// 7213 13465:astore_1        
		abyte0.l = ((azh) (abyte0)).bA ^ a.l;
	// 7214 13466:aload_1         
	// 7215 13467:aload_1         
	// 7216 13468:getfield        #441 <Field int azh.bA>
	// 7217 13471:aload_0         
	// 7218 13472:getfield        #12  <Field azh a>
	// 7219 13475:getfield        #450 <Field int azh.l>
	// 7220 13478:ixor            
	// 7221 13479:putfield        #450 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 7222 13482:aload_0         
	// 7223 13483:getfield        #12  <Field azh a>
	// 7224 13486:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt & a.bu;
	// 7225 13487:aload_1         
	// 7226 13488:aload_1         
	// 7227 13489:getfield        #432 <Field int azh.bt>
	// 7228 13492:aload_0         
	// 7229 13493:getfield        #12  <Field azh a>
	// 7230 13496:getfield        #198 <Field int azh.bu>
	// 7231 13499:iand            
	// 7232 13500:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7233 13503:aload_0         
	// 7234 13504:getfield        #12  <Field azh a>
	// 7235 13507:astore_1        
		abyte0.bt = ((azh) (abyte0)).cc ^ a.bt;
	// 7236 13508:aload_1         
	// 7237 13509:aload_1         
	// 7238 13510:getfield        #444 <Field int azh.cc>
	// 7239 13513:aload_0         
	// 7240 13514:getfield        #12  <Field azh a>
	// 7241 13517:getfield        #432 <Field int azh.bt>
	// 7242 13520:ixor            
	// 7243 13521:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7244 13524:aload_0         
	// 7245 13525:getfield        #12  <Field azh a>
	// 7246 13528:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt ^ a.ax;
	// 7247 13529:aload_1         
	// 7248 13530:aload_1         
	// 7249 13531:getfield        #432 <Field int azh.bt>
	// 7250 13534:aload_0         
	// 7251 13535:getfield        #12  <Field azh a>
	// 7252 13538:getfield        #390 <Field int azh.ax>
	// 7253 13541:ixor            
	// 7254 13542:putfield        #432 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7255 13545:aload_0         
	// 7256 13546:getfield        #12  <Field azh a>
	// 7257 13549:astore_1        
		abyte0.ca = ((azh) (abyte0)).aQ ^ a.ca;
	// 7258 13550:aload_1         
	// 7259 13551:aload_1         
	// 7260 13552:getfield        #384 <Field int azh.aQ>
	// 7261 13555:aload_0         
	// 7262 13556:getfield        #12  <Field azh a>
	// 7263 13559:getfield        #414 <Field int azh.ca>
	// 7264 13562:ixor            
	// 7265 13563:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 7266 13566:aload_0         
	// 7267 13567:getfield        #12  <Field azh a>
	// 7268 13570:astore_1        
		abyte0.ca = ((azh) (abyte0)).K | a.ca;
	// 7269 13571:aload_1         
	// 7270 13572:aload_1         
	// 7271 13573:getfield        #129 <Field int azh.K>
	// 7272 13576:aload_0         
	// 7273 13577:getfield        #12  <Field azh a>
	// 7274 13580:getfield        #414 <Field int azh.ca>
	// 7275 13583:ior             
	// 7276 13584:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 7277 13587:aload_0         
	// 7278 13588:getfield        #12  <Field azh a>
	// 7279 13591:astore_1        
		abyte0.ca = ((azh) (abyte0)).bR ^ a.ca;
	// 7280 13592:aload_1         
	// 7281 13593:aload_1         
	// 7282 13594:getfield        #156 <Field int azh.bR>
	// 7283 13597:aload_0         
	// 7284 13598:getfield        #12  <Field azh a>
	// 7285 13601:getfield        #414 <Field int azh.ca>
	// 7286 13604:ixor            
	// 7287 13605:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 7288 13608:aload_0         
	// 7289 13609:getfield        #12  <Field azh a>
	// 7290 13612:astore_1        
		abyte0.au = ((azh) (abyte0)).ca ^ a.au;
	// 7291 13613:aload_1         
	// 7292 13614:aload_1         
	// 7293 13615:getfield        #414 <Field int azh.ca>
	// 7294 13618:aload_0         
	// 7295 13619:getfield        #12  <Field azh a>
	// 7296 13622:getfield        #423 <Field int azh.au>
	// 7297 13625:ixor            
	// 7298 13626:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7299 13629:aload_0         
	// 7300 13630:getfield        #12  <Field azh a>
	// 7301 13633:astore_1        
		abyte0.ab = ((azh) (abyte0)).au ^ a.ab;
	// 7302 13634:aload_1         
	// 7303 13635:aload_1         
	// 7304 13636:getfield        #423 <Field int azh.au>
	// 7305 13639:aload_0         
	// 7306 13640:getfield        #12  <Field azh a>
	// 7307 13643:getfield        #225 <Field int azh.ab>
	// 7308 13646:ixor            
	// 7309 13647:putfield        #225 <Field int azh.ab>
		abyte0 = ((byte []) (a));
	// 7310 13650:aload_0         
	// 7311 13651:getfield        #12  <Field azh a>
	// 7312 13654:astore_1        
		abyte0.cg = ((azh) (abyte0)).ca ^ a.cg;
	// 7313 13655:aload_1         
	// 7314 13656:aload_1         
	// 7315 13657:getfield        #414 <Field int azh.ca>
	// 7316 13660:aload_0         
	// 7317 13661:getfield        #12  <Field azh a>
	// 7318 13664:getfield        #429 <Field int azh.cg>
	// 7319 13667:ixor            
	// 7320 13668:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7321 13671:aload_0         
	// 7322 13672:getfield        #12  <Field azh a>
	// 7323 13675:astore_1        
		abyte0.al = ((azh) (abyte0)).cg ^ a.al;
	// 7324 13676:aload_1         
	// 7325 13677:aload_1         
	// 7326 13678:getfield        #429 <Field int azh.cg>
	// 7327 13681:aload_0         
	// 7328 13682:getfield        #12  <Field azh a>
	// 7329 13685:getfield        #177 <Field int azh.al>
	// 7330 13688:ixor            
	// 7331 13689:putfield        #177 <Field int azh.al>
		abyte0 = ((byte []) (a));
	// 7332 13692:aload_0         
	// 7333 13693:getfield        #12  <Field azh a>
	// 7334 13696:astore_1        
		abyte0.aX = ((azh) (abyte0)).bY & ~a.aX;
	// 7335 13697:aload_1         
	// 7336 13698:aload_1         
	// 7337 13699:getfield        #375 <Field int azh.bY>
	// 7338 13702:aload_0         
	// 7339 13703:getfield        #12  <Field azh a>
	// 7340 13706:getfield        #411 <Field int azh.aX>
	// 7341 13709:iconst_m1       
	// 7342 13710:ixor            
	// 7343 13711:iand            
	// 7344 13712:putfield        #411 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7345 13715:aload_0         
	// 7346 13716:getfield        #12  <Field azh a>
	// 7347 13719:astore_1        
		abyte0.aX = ((azh) (abyte0)).aE ^ a.aX;
	// 7348 13720:aload_1         
	// 7349 13721:aload_1         
	// 7350 13722:getfield        #453 <Field int azh.aE>
	// 7351 13725:aload_0         
	// 7352 13726:getfield        #12  <Field azh a>
	// 7353 13729:getfield        #411 <Field int azh.aX>
	// 7354 13732:ixor            
	// 7355 13733:putfield        #411 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7356 13736:aload_0         
	// 7357 13737:getfield        #12  <Field azh a>
	// 7358 13740:astore_1        
		abyte0.aW = ((azh) (abyte0)).aX ^ a.aW;
	// 7359 13741:aload_1         
	// 7360 13742:aload_1         
	// 7361 13743:getfield        #411 <Field int azh.aX>
	// 7362 13746:aload_0         
	// 7363 13747:getfield        #12  <Field azh a>
	// 7364 13750:getfield        #399 <Field int azh.aW>
	// 7365 13753:ixor            
	// 7366 13754:putfield        #399 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7367 13757:aload_0         
	// 7368 13758:getfield        #12  <Field azh a>
	// 7369 13761:astore_1        
		abyte0.aW = ((azh) (abyte0)).br & ~a.aW;
	// 7370 13762:aload_1         
	// 7371 13763:aload_1         
	// 7372 13764:getfield        #74  <Field int azh.br>
	// 7373 13767:aload_0         
	// 7374 13768:getfield        #12  <Field azh a>
	// 7375 13771:getfield        #399 <Field int azh.aW>
	// 7376 13774:iconst_m1       
	// 7377 13775:ixor            
	// 7378 13776:iand            
	// 7379 13777:putfield        #399 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7380 13780:aload_0         
	// 7381 13781:getfield        #12  <Field azh a>
	// 7382 13784:astore_1        
		abyte0.aW = ((azh) (abyte0)).aV ^ a.aW;
	// 7383 13785:aload_1         
	// 7384 13786:aload_1         
	// 7385 13787:getfield        #438 <Field int azh.aV>
	// 7386 13790:aload_0         
	// 7387 13791:getfield        #12  <Field azh a>
	// 7388 13794:getfield        #399 <Field int azh.aW>
	// 7389 13797:ixor            
	// 7390 13798:putfield        #399 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7391 13801:aload_0         
	// 7392 13802:getfield        #12  <Field azh a>
	// 7393 13805:astore_1        
		abyte0.bC = ((azh) (abyte0)).aW ^ a.bC;
	// 7394 13806:aload_1         
	// 7395 13807:aload_1         
	// 7396 13808:getfield        #399 <Field int azh.aW>
	// 7397 13811:aload_0         
	// 7398 13812:getfield        #12  <Field azh a>
	// 7399 13815:getfield        #456 <Field int azh.bC>
	// 7400 13818:ixor            
	// 7401 13819:putfield        #456 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 7402 13822:aload_0         
	// 7403 13823:getfield        #12  <Field azh a>
	// 7404 13826:astore_1        
		abyte0.aW = ((azh) (abyte0)).bC | a.aO;
	// 7405 13827:aload_1         
	// 7406 13828:aload_1         
	// 7407 13829:getfield        #456 <Field int azh.bC>
	// 7408 13832:aload_0         
	// 7409 13833:getfield        #12  <Field azh a>
	// 7410 13836:getfield        #117 <Field int azh.aO>
	// 7411 13839:ior             
	// 7412 13840:putfield        #399 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7413 13843:aload_0         
	// 7414 13844:getfield        #12  <Field azh a>
	// 7415 13847:astore_1        
		abyte0.aV = ((azh) (abyte0)).bC & ~a.bs;
	// 7416 13848:aload_1         
	// 7417 13849:aload_1         
	// 7418 13850:getfield        #456 <Field int azh.bC>
	// 7419 13853:aload_0         
	// 7420 13854:getfield        #12  <Field azh a>
	// 7421 13857:getfield        #291 <Field int azh.bs>
	// 7422 13860:iconst_m1       
	// 7423 13861:ixor            
	// 7424 13862:iand            
	// 7425 13863:putfield        #438 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 7426 13866:aload_0         
	// 7427 13867:getfield        #12  <Field azh a>
	// 7428 13870:astore_1        
		abyte0.aX = ((azh) (abyte0)).bC & ~a.bs;
	// 7429 13871:aload_1         
	// 7430 13872:aload_1         
	// 7431 13873:getfield        #456 <Field int azh.bC>
	// 7432 13876:aload_0         
	// 7433 13877:getfield        #12  <Field azh a>
	// 7434 13880:getfield        #291 <Field int azh.bs>
	// 7435 13883:iconst_m1       
	// 7436 13884:ixor            
	// 7437 13885:iand            
	// 7438 13886:putfield        #411 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7439 13889:aload_0         
	// 7440 13890:getfield        #12  <Field azh a>
	// 7441 13893:astore_1        
		abyte0.aE = ((azh) (abyte0)).aX & a.ae;
	// 7442 13894:aload_1         
	// 7443 13895:aload_1         
	// 7444 13896:getfield        #411 <Field int azh.aX>
	// 7445 13899:aload_0         
	// 7446 13900:getfield        #12  <Field azh a>
	// 7447 13903:getfield        #189 <Field int azh.ae>
	// 7448 13906:iand            
	// 7449 13907:putfield        #453 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 7450 13910:aload_0         
	// 7451 13911:getfield        #12  <Field azh a>
	// 7452 13914:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & a.ae;
	// 7453 13915:aload_1         
	// 7454 13916:aload_1         
	// 7455 13917:getfield        #411 <Field int azh.aX>
	// 7456 13920:aload_0         
	// 7457 13921:getfield        #12  <Field azh a>
	// 7458 13924:getfield        #189 <Field int azh.ae>
	// 7459 13927:iand            
	// 7460 13928:putfield        #411 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7461 13931:aload_0         
	// 7462 13932:getfield        #12  <Field azh a>
	// 7463 13935:astore_1        
		abyte0.cg = ((azh) (abyte0)).ae | a.bC;
	// 7464 13936:aload_1         
	// 7465 13937:aload_1         
	// 7466 13938:getfield        #189 <Field int azh.ae>
	// 7467 13941:aload_0         
	// 7468 13942:getfield        #12  <Field azh a>
	// 7469 13945:getfield        #456 <Field int azh.bC>
	// 7470 13948:ior             
	// 7471 13949:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7472 13952:aload_0         
	// 7473 13953:getfield        #12  <Field azh a>
	// 7474 13956:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & ~a.K;
	// 7475 13957:aload_1         
	// 7476 13958:aload_1         
	// 7477 13959:getfield        #429 <Field int azh.cg>
	// 7478 13962:aload_0         
	// 7479 13963:getfield        #12  <Field azh a>
	// 7480 13966:getfield        #129 <Field int azh.K>
	// 7481 13969:iconst_m1       
	// 7482 13970:ixor            
	// 7483 13971:iand            
	// 7484 13972:putfield        #429 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7485 13975:aload_0         
	// 7486 13976:getfield        #12  <Field azh a>
	// 7487 13979:astore_1        
		abyte0.ca = ((azh) (abyte0)).bs | a.bC;
	// 7488 13980:aload_1         
	// 7489 13981:aload_1         
	// 7490 13982:getfield        #291 <Field int azh.bs>
	// 7491 13985:aload_0         
	// 7492 13986:getfield        #12  <Field azh a>
	// 7493 13989:getfield        #456 <Field int azh.bC>
	// 7494 13992:ior             
	// 7495 13993:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 7496 13996:aload_0         
	// 7497 13997:getfield        #12  <Field azh a>
	// 7498 14000:astore_1        
		abyte0.au = ((azh) (abyte0)).ae & ~a.ca;
	// 7499 14001:aload_1         
	// 7500 14002:aload_1         
	// 7501 14003:getfield        #189 <Field int azh.ae>
	// 7502 14006:aload_0         
	// 7503 14007:getfield        #12  <Field azh a>
	// 7504 14010:getfield        #414 <Field int azh.ca>
	// 7505 14013:iconst_m1       
	// 7506 14014:ixor            
	// 7507 14015:iand            
	// 7508 14016:putfield        #423 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7509 14019:aload_0         
	// 7510 14020:getfield        #12  <Field azh a>
	// 7511 14023:astore_1        
		abyte0.ca = ((azh) (abyte0)).ae & a.ca;
	// 7512 14024:aload_1         
	// 7513 14025:aload_1         
	// 7514 14026:getfield        #189 <Field int azh.ae>
	// 7515 14029:aload_0         
	// 7516 14030:getfield        #12  <Field azh a>
	// 7517 14033:getfield        #414 <Field int azh.ca>
	// 7518 14036:iand            
	// 7519 14037:putfield        #414 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 7520 14040:aload_0         
	// 7521 14041:getfield        #12  <Field azh a>
	// 7522 14044:astore_1        
		abyte0.az = ((azh) (abyte0)).bY & a.az;
	// 7523 14045:aload_1         
	// 7524 14046:aload_1         
	// 7525 14047:getfield        #375 <Field int azh.bY>
	// 7526 14050:aload_0         
	// 7527 14051:getfield        #12  <Field azh a>
	// 7528 14054:getfield        #408 <Field int azh.az>
	// 7529 14057:iand            
	// 7530 14058:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7531 14061:aload_0         
	// 7532 14062:getfield        #12  <Field azh a>
	// 7533 14065:astore_1        
		abyte0.az = ((azh) (abyte0)).bd ^ a.az;
	// 7534 14066:aload_1         
	// 7535 14067:aload_1         
	// 7536 14068:getfield        #459 <Field int azh.bd>
	// 7537 14071:aload_0         
	// 7538 14072:getfield        #12  <Field azh a>
	// 7539 14075:getfield        #408 <Field int azh.az>
	// 7540 14078:ixor            
	// 7541 14079:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7542 14082:aload_0         
	// 7543 14083:getfield        #12  <Field azh a>
	// 7544 14086:astore_1        
		abyte0.az = ((azh) (abyte0)).ax & ~a.az;
	// 7545 14087:aload_1         
	// 7546 14088:aload_1         
	// 7547 14089:getfield        #390 <Field int azh.ax>
	// 7548 14092:aload_0         
	// 7549 14093:getfield        #12  <Field azh a>
	// 7550 14096:getfield        #408 <Field int azh.az>
	// 7551 14099:iconst_m1       
	// 7552 14100:ixor            
	// 7553 14101:iand            
	// 7554 14102:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7555 14105:aload_0         
	// 7556 14106:getfield        #12  <Field azh a>
	// 7557 14109:astore_1        
		abyte0.az = ((azh) (abyte0)).bX ^ a.az;
	// 7558 14110:aload_1         
	// 7559 14111:aload_1         
	// 7560 14112:getfield        #405 <Field int azh.bX>
	// 7561 14115:aload_0         
	// 7562 14116:getfield        #12  <Field azh a>
	// 7563 14119:getfield        #408 <Field int azh.az>
	// 7564 14122:ixor            
	// 7565 14123:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7566 14126:aload_0         
	// 7567 14127:getfield        #12  <Field azh a>
	// 7568 14130:astore_1        
		abyte0.az = ((azh) (abyte0)).br & ~a.az;
	// 7569 14131:aload_1         
	// 7570 14132:aload_1         
	// 7571 14133:getfield        #74  <Field int azh.br>
	// 7572 14136:aload_0         
	// 7573 14137:getfield        #12  <Field azh a>
	// 7574 14140:getfield        #408 <Field int azh.az>
	// 7575 14143:iconst_m1       
	// 7576 14144:ixor            
	// 7577 14145:iand            
	// 7578 14146:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7579 14149:aload_0         
	// 7580 14150:getfield        #12  <Field azh a>
	// 7581 14153:astore_1        
		abyte0.az = ((azh) (abyte0)).i ^ a.az;
	// 7582 14154:aload_1         
	// 7583 14155:aload_1         
	// 7584 14156:getfield        #91  <Field int azh.i>
	// 7585 14159:aload_0         
	// 7586 14160:getfield        #12  <Field azh a>
	// 7587 14163:getfield        #408 <Field int azh.az>
	// 7588 14166:ixor            
	// 7589 14167:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7590 14170:aload_0         
	// 7591 14171:getfield        #12  <Field azh a>
	// 7592 14174:astore_1        
		abyte0.bF = ((azh) (abyte0)).az ^ a.bF;
	// 7593 14175:aload_1         
	// 7594 14176:aload_1         
	// 7595 14177:getfield        #408 <Field int azh.az>
	// 7596 14180:aload_0         
	// 7597 14181:getfield        #12  <Field azh a>
	// 7598 14184:getfield        #462 <Field int azh.bF>
	// 7599 14187:ixor            
	// 7600 14188:putfield        #462 <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 7601 14191:aload_0         
	// 7602 14192:getfield        #12  <Field azh a>
	// 7603 14195:astore_1        
		abyte0.az = ((azh) (abyte0)).bF & ~a.c;
	// 7604 14196:aload_1         
	// 7605 14197:aload_1         
	// 7606 14198:getfield        #462 <Field int azh.bF>
	// 7607 14201:aload_0         
	// 7608 14202:getfield        #12  <Field azh a>
	// 7609 14205:getfield        #276 <Field int azh.c>
	// 7610 14208:iconst_m1       
	// 7611 14209:ixor            
	// 7612 14210:iand            
	// 7613 14211:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7614 14214:aload_0         
	// 7615 14215:getfield        #12  <Field azh a>
	// 7616 14218:astore_1        
		abyte0.az = ((azh) (abyte0)).az & ~a.bT;
	// 7617 14219:aload_1         
	// 7618 14220:aload_1         
	// 7619 14221:getfield        #408 <Field int azh.az>
	// 7620 14224:aload_0         
	// 7621 14225:getfield        #12  <Field azh a>
	// 7622 14228:getfield        #86  <Field int azh.bT>
	// 7623 14231:iconst_m1       
	// 7624 14232:ixor            
	// 7625 14233:iand            
	// 7626 14234:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7627 14237:aload_0         
	// 7628 14238:getfield        #12  <Field azh a>
	// 7629 14241:astore_1        
		abyte0.i = ((azh) (abyte0)).bF | a.A;
	// 7630 14242:aload_1         
	// 7631 14243:aload_1         
	// 7632 14244:getfield        #462 <Field int azh.bF>
	// 7633 14247:aload_0         
	// 7634 14248:getfield        #12  <Field azh a>
	// 7635 14251:getfield        #360 <Field int azh.A>
	// 7636 14254:ior             
	// 7637 14255:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7638 14258:aload_0         
	// 7639 14259:getfield        #12  <Field azh a>
	// 7640 14262:astore_1        
		abyte0.bX = ((azh) (abyte0)).c | a.i;
	// 7641 14263:aload_1         
	// 7642 14264:aload_1         
	// 7643 14265:getfield        #276 <Field int azh.c>
	// 7644 14268:aload_0         
	// 7645 14269:getfield        #12  <Field azh a>
	// 7646 14272:getfield        #91  <Field int azh.i>
	// 7647 14275:ior             
	// 7648 14276:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7649 14279:aload_0         
	// 7650 14280:getfield        #12  <Field azh a>
	// 7651 14283:astore_1        
		abyte0.bX = ((azh) (abyte0)).i ^ a.bX;
	// 7652 14284:aload_1         
	// 7653 14285:aload_1         
	// 7654 14286:getfield        #91  <Field int azh.i>
	// 7655 14289:aload_0         
	// 7656 14290:getfield        #12  <Field azh a>
	// 7657 14293:getfield        #405 <Field int azh.bX>
	// 7658 14296:ixor            
	// 7659 14297:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7660 14300:aload_0         
	// 7661 14301:getfield        #12  <Field azh a>
	// 7662 14304:astore_1        
		abyte0.bX = ((azh) (abyte0)).I & a.bX;
	// 7663 14305:aload_1         
	// 7664 14306:aload_1         
	// 7665 14307:getfield        #88  <Field int azh.I>
	// 7666 14310:aload_0         
	// 7667 14311:getfield        #12  <Field azh a>
	// 7668 14314:getfield        #405 <Field int azh.bX>
	// 7669 14317:iand            
	// 7670 14318:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7671 14321:aload_0         
	// 7672 14322:getfield        #12  <Field azh a>
	// 7673 14325:astore_1        
		abyte0.bd = ((azh) (abyte0)).i & ~a.c;
	// 7674 14326:aload_1         
	// 7675 14327:aload_1         
	// 7676 14328:getfield        #91  <Field int azh.i>
	// 7677 14331:aload_0         
	// 7678 14332:getfield        #12  <Field azh a>
	// 7679 14335:getfield        #276 <Field int azh.c>
	// 7680 14338:iconst_m1       
	// 7681 14339:ixor            
	// 7682 14340:iand            
	// 7683 14341:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 7684 14344:aload_0         
	// 7685 14345:getfield        #12  <Field azh a>
	// 7686 14348:astore_1        
		abyte0.bd = ((azh) (abyte0)).bF ^ a.bd;
	// 7687 14349:aload_1         
	// 7688 14350:aload_1         
	// 7689 14351:getfield        #462 <Field int azh.bF>
	// 7690 14354:aload_0         
	// 7691 14355:getfield        #12  <Field azh a>
	// 7692 14358:getfield        #459 <Field int azh.bd>
	// 7693 14361:ixor            
	// 7694 14362:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 7695 14365:aload_0         
	// 7696 14366:getfield        #12  <Field azh a>
	// 7697 14369:astore_1        
		abyte0.bR = ((azh) (abyte0)).I & a.bd;
	// 7698 14370:aload_1         
	// 7699 14371:aload_1         
	// 7700 14372:getfield        #88  <Field int azh.I>
	// 7701 14375:aload_0         
	// 7702 14376:getfield        #12  <Field azh a>
	// 7703 14379:getfield        #459 <Field int azh.bd>
	// 7704 14382:iand            
	// 7705 14383:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7706 14386:aload_0         
	// 7707 14387:getfield        #12  <Field azh a>
	// 7708 14390:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd & ~a.I;
	// 7709 14391:aload_1         
	// 7710 14392:aload_1         
	// 7711 14393:getfield        #459 <Field int azh.bd>
	// 7712 14396:aload_0         
	// 7713 14397:getfield        #12  <Field azh a>
	// 7714 14400:getfield        #88  <Field int azh.I>
	// 7715 14403:iconst_m1       
	// 7716 14404:ixor            
	// 7717 14405:iand            
	// 7718 14406:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 7719 14409:aload_0         
	// 7720 14410:getfield        #12  <Field azh a>
	// 7721 14413:astore_1        
		abyte0.aQ = ((azh) (abyte0)).i & ~a.c;
	// 7722 14414:aload_1         
	// 7723 14415:aload_1         
	// 7724 14416:getfield        #91  <Field int azh.i>
	// 7725 14419:aload_0         
	// 7726 14420:getfield        #12  <Field azh a>
	// 7727 14423:getfield        #276 <Field int azh.c>
	// 7728 14426:iconst_m1       
	// 7729 14427:ixor            
	// 7730 14428:iand            
	// 7731 14429:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 7732 14432:aload_0         
	// 7733 14433:getfield        #12  <Field azh a>
	// 7734 14436:astore_1        
		abyte0.cc = ((azh) (abyte0)).i & ~a.c;
	// 7735 14437:aload_1         
	// 7736 14438:aload_1         
	// 7737 14439:getfield        #91  <Field int azh.i>
	// 7738 14442:aload_0         
	// 7739 14443:getfield        #12  <Field azh a>
	// 7740 14446:getfield        #276 <Field int azh.c>
	// 7741 14449:iconst_m1       
	// 7742 14450:ixor            
	// 7743 14451:iand            
	// 7744 14452:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7745 14455:aload_0         
	// 7746 14456:getfield        #12  <Field azh a>
	// 7747 14459:astore_1        
		abyte0.bA = ((azh) (abyte0)).i & ~a.A;
	// 7748 14460:aload_1         
	// 7749 14461:aload_1         
	// 7750 14462:getfield        #91  <Field int azh.i>
	// 7751 14465:aload_0         
	// 7752 14466:getfield        #12  <Field azh a>
	// 7753 14469:getfield        #360 <Field int azh.A>
	// 7754 14472:iconst_m1       
	// 7755 14473:ixor            
	// 7756 14474:iand            
	// 7757 14475:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7758 14478:aload_0         
	// 7759 14479:getfield        #12  <Field azh a>
	// 7760 14482:astore_1        
		abyte0.ag = ((azh) (abyte0)).c | a.bA;
	// 7761 14483:aload_1         
	// 7762 14484:aload_1         
	// 7763 14485:getfield        #276 <Field int azh.c>
	// 7764 14488:aload_0         
	// 7765 14489:getfield        #12  <Field azh a>
	// 7766 14492:getfield        #441 <Field int azh.bA>
	// 7767 14495:ior             
	// 7768 14496:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7769 14499:aload_0         
	// 7770 14500:getfield        #12  <Field azh a>
	// 7771 14503:astore_1        
		abyte0.ag = ((azh) (abyte0)).bF ^ a.ag;
	// 7772 14504:aload_1         
	// 7773 14505:aload_1         
	// 7774 14506:getfield        #462 <Field int azh.bF>
	// 7775 14509:aload_0         
	// 7776 14510:getfield        #12  <Field azh a>
	// 7777 14513:getfield        #426 <Field int azh.ag>
	// 7778 14516:ixor            
	// 7779 14517:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7780 14520:aload_0         
	// 7781 14521:getfield        #12  <Field azh a>
	// 7782 14524:astore_1        
		abyte0.bA = ((azh) (abyte0)).c | a.bA;
	// 7783 14525:aload_1         
	// 7784 14526:aload_1         
	// 7785 14527:getfield        #276 <Field int azh.c>
	// 7786 14530:aload_0         
	// 7787 14531:getfield        #12  <Field azh a>
	// 7788 14534:getfield        #441 <Field int azh.bA>
	// 7789 14537:ior             
	// 7790 14538:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7791 14541:aload_0         
	// 7792 14542:getfield        #12  <Field azh a>
	// 7793 14545:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA | a.I;
	// 7794 14546:aload_1         
	// 7795 14547:aload_1         
	// 7796 14548:getfield        #441 <Field int azh.bA>
	// 7797 14551:aload_0         
	// 7798 14552:getfield        #12  <Field azh a>
	// 7799 14555:getfield        #88  <Field int azh.I>
	// 7800 14558:ior             
	// 7801 14559:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7802 14562:aload_0         
	// 7803 14563:getfield        #12  <Field azh a>
	// 7804 14566:astore_1        
		abyte0.C = ((azh) (abyte0)).bF & ~a.A;
	// 7805 14567:aload_1         
	// 7806 14568:aload_1         
	// 7807 14569:getfield        #462 <Field int azh.bF>
	// 7808 14572:aload_0         
	// 7809 14573:getfield        #12  <Field azh a>
	// 7810 14576:getfield        #360 <Field int azh.A>
	// 7811 14579:iconst_m1       
	// 7812 14580:ixor            
	// 7813 14581:iand            
	// 7814 14582:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 7815 14585:aload_0         
	// 7816 14586:getfield        #12  <Field azh a>
	// 7817 14589:astore_1        
		abyte0.q = ((azh) (abyte0)).C & ~a.c;
	// 7818 14590:aload_1         
	// 7819 14591:aload_1         
	// 7820 14592:getfield        #420 <Field int azh.C>
	// 7821 14595:aload_0         
	// 7822 14596:getfield        #12  <Field azh a>
	// 7823 14599:getfield        #276 <Field int azh.c>
	// 7824 14602:iconst_m1       
	// 7825 14603:ixor            
	// 7826 14604:iand            
	// 7827 14605:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 7828 14608:aload_0         
	// 7829 14609:getfield        #12  <Field azh a>
	// 7830 14612:astore_1        
		abyte0.q = ((azh) (abyte0)).A ^ a.q;
	// 7831 14613:aload_1         
	// 7832 14614:aload_1         
	// 7833 14615:getfield        #360 <Field int azh.A>
	// 7834 14618:aload_0         
	// 7835 14619:getfield        #12  <Field azh a>
	// 7836 14622:getfield        #294 <Field int azh.q>
	// 7837 14625:ixor            
	// 7838 14626:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 7839 14629:aload_0         
	// 7840 14630:getfield        #12  <Field azh a>
	// 7841 14633:astore_1        
		abyte0.C = ((azh) (abyte0)).C & ~a.c;
	// 7842 14634:aload_1         
	// 7843 14635:aload_1         
	// 7844 14636:getfield        #420 <Field int azh.C>
	// 7845 14639:aload_0         
	// 7846 14640:getfield        #12  <Field azh a>
	// 7847 14643:getfield        #276 <Field int azh.c>
	// 7848 14646:iconst_m1       
	// 7849 14647:ixor            
	// 7850 14648:iand            
	// 7851 14649:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 7852 14652:aload_0         
	// 7853 14653:getfield        #12  <Field azh a>
	// 7854 14656:astore_1        
		abyte0.bP = ((azh) (abyte0)).bF & ~a.c;
	// 7855 14657:aload_1         
	// 7856 14658:aload_1         
	// 7857 14659:getfield        #462 <Field int azh.bF>
	// 7858 14662:aload_0         
	// 7859 14663:getfield        #12  <Field azh a>
	// 7860 14666:getfield        #276 <Field int azh.c>
	// 7861 14669:iconst_m1       
	// 7862 14670:ixor            
	// 7863 14671:iand            
	// 7864 14672:putfield        #417 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 7865 14675:aload_0         
	// 7866 14676:getfield        #12  <Field azh a>
	// 7867 14679:astore_1        
		abyte0.ap = ((azh) (abyte0)).bF ^ a.A;
	// 7868 14680:aload_1         
	// 7869 14681:aload_1         
	// 7870 14682:getfield        #462 <Field int azh.bF>
	// 7871 14685:aload_0         
	// 7872 14686:getfield        #12  <Field azh a>
	// 7873 14689:getfield        #360 <Field int azh.A>
	// 7874 14692:ixor            
	// 7875 14693:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7876 14696:aload_0         
	// 7877 14697:getfield        #12  <Field azh a>
	// 7878 14700:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ap & ~a.c;
	// 7879 14701:aload_1         
	// 7880 14702:aload_1         
	// 7881 14703:getfield        #369 <Field int azh.ap>
	// 7882 14706:aload_0         
	// 7883 14707:getfield        #12  <Field azh a>
	// 7884 14710:getfield        #276 <Field int azh.c>
	// 7885 14713:iconst_m1       
	// 7886 14714:ixor            
	// 7887 14715:iand            
	// 7888 14716:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 7889 14719:aload_0         
	// 7890 14720:getfield        #12  <Field azh a>
	// 7891 14723:astore_1        
		abyte0.W = ((azh) (abyte0)).I | a.bZ;
	// 7892 14724:aload_1         
	// 7893 14725:aload_1         
	// 7894 14726:getfield        #88  <Field int azh.I>
	// 7895 14729:aload_0         
	// 7896 14730:getfield        #12  <Field azh a>
	// 7897 14733:getfield        #303 <Field int azh.bZ>
	// 7898 14736:ior             
	// 7899 14737:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7900 14740:aload_0         
	// 7901 14741:getfield        #12  <Field azh a>
	// 7902 14744:astore_1        
		abyte0.W = ((azh) (abyte0)).ag ^ a.W;
	// 7903 14745:aload_1         
	// 7904 14746:aload_1         
	// 7905 14747:getfield        #426 <Field int azh.ag>
	// 7906 14750:aload_0         
	// 7907 14751:getfield        #12  <Field azh a>
	// 7908 14754:getfield        #249 <Field int azh.W>
	// 7909 14757:ixor            
	// 7910 14758:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7911 14761:aload_0         
	// 7912 14762:getfield        #12  <Field azh a>
	// 7913 14765:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & ~a.I;
	// 7914 14766:aload_1         
	// 7915 14767:aload_1         
	// 7916 14768:getfield        #303 <Field int azh.bZ>
	// 7917 14771:aload_0         
	// 7918 14772:getfield        #12  <Field azh a>
	// 7919 14775:getfield        #88  <Field int azh.I>
	// 7920 14778:iconst_m1       
	// 7921 14779:ixor            
	// 7922 14780:iand            
	// 7923 14781:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 7924 14784:aload_0         
	// 7925 14785:getfield        #12  <Field azh a>
	// 7926 14788:astore_1        
		abyte0.bZ = ((azh) (abyte0)).q ^ a.bZ;
	// 7927 14789:aload_1         
	// 7928 14790:aload_1         
	// 7929 14791:getfield        #294 <Field int azh.q>
	// 7930 14794:aload_0         
	// 7931 14795:getfield        #12  <Field azh a>
	// 7932 14798:getfield        #303 <Field int azh.bZ>
	// 7933 14801:ixor            
	// 7934 14802:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 7935 14805:aload_0         
	// 7936 14806:getfield        #12  <Field azh a>
	// 7937 14809:astore_1        
		abyte0.cc = ((azh) (abyte0)).ap ^ a.cc;
	// 7938 14810:aload_1         
	// 7939 14811:aload_1         
	// 7940 14812:getfield        #369 <Field int azh.ap>
	// 7941 14815:aload_0         
	// 7942 14816:getfield        #12  <Field azh a>
	// 7943 14819:getfield        #444 <Field int azh.cc>
	// 7944 14822:ixor            
	// 7945 14823:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7946 14826:aload_0         
	// 7947 14827:getfield        #12  <Field azh a>
	// 7948 14830:astore_1        
		abyte0.cc = ((azh) (abyte0)).cc & ~a.I;
	// 7949 14831:aload_1         
	// 7950 14832:aload_1         
	// 7951 14833:getfield        #444 <Field int azh.cc>
	// 7952 14836:aload_0         
	// 7953 14837:getfield        #12  <Field azh a>
	// 7954 14840:getfield        #88  <Field int azh.I>
	// 7955 14843:iconst_m1       
	// 7956 14844:ixor            
	// 7957 14845:iand            
	// 7958 14846:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7959 14849:aload_0         
	// 7960 14850:getfield        #12  <Field azh a>
	// 7961 14853:astore_1        
		abyte0.cc = ((azh) (abyte0)).ag ^ a.cc;
	// 7962 14854:aload_1         
	// 7963 14855:aload_1         
	// 7964 14856:getfield        #426 <Field int azh.ag>
	// 7965 14859:aload_0         
	// 7966 14860:getfield        #12  <Field azh a>
	// 7967 14863:getfield        #444 <Field int azh.cc>
	// 7968 14866:ixor            
	// 7969 14867:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7970 14870:aload_0         
	// 7971 14871:getfield        #12  <Field azh a>
	// 7972 14874:astore_1        
		abyte0.cc = ((azh) (abyte0)).cc | a.bb;
	// 7973 14875:aload_1         
	// 7974 14876:aload_1         
	// 7975 14877:getfield        #444 <Field int azh.cc>
	// 7976 14880:aload_0         
	// 7977 14881:getfield        #12  <Field azh a>
	// 7978 14884:getfield        #138 <Field int azh.bb>
	// 7979 14887:ior             
	// 7980 14888:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7981 14891:aload_0         
	// 7982 14892:getfield        #12  <Field azh a>
	// 7983 14895:astore_1        
		abyte0.bd = ((azh) (abyte0)).ap ^ a.bd;
	// 7984 14896:aload_1         
	// 7985 14897:aload_1         
	// 7986 14898:getfield        #369 <Field int azh.ap>
	// 7987 14901:aload_0         
	// 7988 14902:getfield        #12  <Field azh a>
	// 7989 14905:getfield        #459 <Field int azh.bd>
	// 7990 14908:ixor            
	// 7991 14909:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 7992 14912:aload_0         
	// 7993 14913:getfield        #12  <Field azh a>
	// 7994 14916:astore_1        
		abyte0.C = ((azh) (abyte0)).ap ^ a.C;
	// 7995 14917:aload_1         
	// 7996 14918:aload_1         
	// 7997 14919:getfield        #369 <Field int azh.ap>
	// 7998 14922:aload_0         
	// 7999 14923:getfield        #12  <Field azh a>
	// 8000 14926:getfield        #420 <Field int azh.C>
	// 8001 14929:ixor            
	// 8002 14930:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 8003 14933:aload_0         
	// 8004 14934:getfield        #12  <Field azh a>
	// 8005 14937:astore_1        
		abyte0.q = ((azh) (abyte0)).I & a.C;
	// 8006 14938:aload_1         
	// 8007 14939:aload_1         
	// 8008 14940:getfield        #88  <Field int azh.I>
	// 8009 14943:aload_0         
	// 8010 14944:getfield        #12  <Field azh a>
	// 8011 14947:getfield        #420 <Field int azh.C>
	// 8012 14950:iand            
	// 8013 14951:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 8014 14954:aload_0         
	// 8015 14955:getfield        #12  <Field azh a>
	// 8016 14958:astore_1        
		abyte0.q = ((azh) (abyte0)).bb | a.q;
	// 8017 14959:aload_1         
	// 8018 14960:aload_1         
	// 8019 14961:getfield        #138 <Field int azh.bb>
	// 8020 14964:aload_0         
	// 8021 14965:getfield        #12  <Field azh a>
	// 8022 14968:getfield        #294 <Field int azh.q>
	// 8023 14971:ior             
	// 8024 14972:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 8025 14975:aload_0         
	// 8026 14976:getfield        #12  <Field azh a>
	// 8027 14979:astore_1        
		abyte0.q = ((azh) (abyte0)).W ^ a.q;
	// 8028 14980:aload_1         
	// 8029 14981:aload_1         
	// 8030 14982:getfield        #249 <Field int azh.W>
	// 8031 14985:aload_0         
	// 8032 14986:getfield        #12  <Field azh a>
	// 8033 14989:getfield        #294 <Field int azh.q>
	// 8034 14992:ixor            
	// 8035 14993:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 8036 14996:aload_0         
	// 8037 14997:getfield        #12  <Field azh a>
	// 8038 15000:astore_1        
		abyte0.C = ((azh) (abyte0)).I & ~a.C;
	// 8039 15001:aload_1         
	// 8040 15002:aload_1         
	// 8041 15003:getfield        #88  <Field int azh.I>
	// 8042 15006:aload_0         
	// 8043 15007:getfield        #12  <Field azh a>
	// 8044 15010:getfield        #420 <Field int azh.C>
	// 8045 15013:iconst_m1       
	// 8046 15014:ixor            
	// 8047 15015:iand            
	// 8048 15016:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 8049 15019:aload_0         
	// 8050 15020:getfield        #12  <Field azh a>
	// 8051 15023:astore_1        
		abyte0.C = ((azh) (abyte0)).ag ^ a.C;
	// 8052 15024:aload_1         
	// 8053 15025:aload_1         
	// 8054 15026:getfield        #426 <Field int azh.ag>
	// 8055 15029:aload_0         
	// 8056 15030:getfield        #12  <Field azh a>
	// 8057 15033:getfield        #420 <Field int azh.C>
	// 8058 15036:ixor            
	// 8059 15037:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 8060 15040:aload_0         
	// 8061 15041:getfield        #12  <Field azh a>
	// 8062 15044:astore_1        
		abyte0.cc = ((azh) (abyte0)).C ^ a.cc;
	// 8063 15045:aload_1         
	// 8064 15046:aload_1         
	// 8065 15047:getfield        #420 <Field int azh.C>
	// 8066 15050:aload_0         
	// 8067 15051:getfield        #12  <Field azh a>
	// 8068 15054:getfield        #444 <Field int azh.cc>
	// 8069 15057:ixor            
	// 8070 15058:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 8071 15061:aload_0         
	// 8072 15062:getfield        #12  <Field azh a>
	// 8073 15065:astore_1        
		abyte0.C = ((azh) (abyte0)).bF & ~a.c;
	// 8074 15066:aload_1         
	// 8075 15067:aload_1         
	// 8076 15068:getfield        #462 <Field int azh.bF>
	// 8077 15071:aload_0         
	// 8078 15072:getfield        #12  <Field azh a>
	// 8079 15075:getfield        #276 <Field int azh.c>
	// 8080 15078:iconst_m1       
	// 8081 15079:ixor            
	// 8082 15080:iand            
	// 8083 15081:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 8084 15084:aload_0         
	// 8085 15085:getfield        #12  <Field azh a>
	// 8086 15088:astore_1        
		abyte0.C = ((azh) (abyte0)).bF ^ a.C;
	// 8087 15089:aload_1         
	// 8088 15090:aload_1         
	// 8089 15091:getfield        #462 <Field int azh.bF>
	// 8090 15094:aload_0         
	// 8091 15095:getfield        #12  <Field azh a>
	// 8092 15098:getfield        #420 <Field int azh.C>
	// 8093 15101:ixor            
	// 8094 15102:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 8095 15105:aload_0         
	// 8096 15106:getfield        #12  <Field azh a>
	// 8097 15109:astore_1        
		abyte0.ag = ((azh) (abyte0)).C & ~a.I;
	// 8098 15110:aload_1         
	// 8099 15111:aload_1         
	// 8100 15112:getfield        #420 <Field int azh.C>
	// 8101 15115:aload_0         
	// 8102 15116:getfield        #12  <Field azh a>
	// 8103 15119:getfield        #88  <Field int azh.I>
	// 8104 15122:iconst_m1       
	// 8105 15123:ixor            
	// 8106 15124:iand            
	// 8107 15125:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8108 15128:aload_0         
	// 8109 15129:getfield        #12  <Field azh a>
	// 8110 15132:astore_1        
		abyte0.bX = ((azh) (abyte0)).C ^ a.bX;
	// 8111 15133:aload_1         
	// 8112 15134:aload_1         
	// 8113 15135:getfield        #420 <Field int azh.C>
	// 8114 15138:aload_0         
	// 8115 15139:getfield        #12  <Field azh a>
	// 8116 15142:getfield        #405 <Field int azh.bX>
	// 8117 15145:ixor            
	// 8118 15146:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 8119 15149:aload_0         
	// 8120 15150:getfield        #12  <Field azh a>
	// 8121 15153:astore_1        
		abyte0.W = ((azh) (abyte0)).c | a.bF;
	// 8122 15154:aload_1         
	// 8123 15155:aload_1         
	// 8124 15156:getfield        #276 <Field int azh.c>
	// 8125 15159:aload_0         
	// 8126 15160:getfield        #12  <Field azh a>
	// 8127 15163:getfield        #462 <Field int azh.bF>
	// 8128 15166:ior             
	// 8129 15167:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8130 15170:aload_0         
	// 8131 15171:getfield        #12  <Field azh a>
	// 8132 15174:astore_1        
		abyte0.W = ((azh) (abyte0)).i ^ a.W;
	// 8133 15175:aload_1         
	// 8134 15176:aload_1         
	// 8135 15177:getfield        #91  <Field int azh.i>
	// 8136 15180:aload_0         
	// 8137 15181:getfield        #12  <Field azh a>
	// 8138 15184:getfield        #249 <Field int azh.W>
	// 8139 15187:ixor            
	// 8140 15188:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8141 15191:aload_0         
	// 8142 15192:getfield        #12  <Field azh a>
	// 8143 15195:astore_1        
		abyte0.W = ((azh) (abyte0)).W | a.I;
	// 8144 15196:aload_1         
	// 8145 15197:aload_1         
	// 8146 15198:getfield        #249 <Field int azh.W>
	// 8147 15201:aload_0         
	// 8148 15202:getfield        #12  <Field azh a>
	// 8149 15205:getfield        #88  <Field int azh.I>
	// 8150 15208:ior             
	// 8151 15209:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8152 15212:aload_0         
	// 8153 15213:getfield        #12  <Field azh a>
	// 8154 15216:astore_1        
		abyte0.W = ((azh) (abyte0)).c ^ a.W;
	// 8155 15217:aload_1         
	// 8156 15218:aload_1         
	// 8157 15219:getfield        #276 <Field int azh.c>
	// 8158 15222:aload_0         
	// 8159 15223:getfield        #12  <Field azh a>
	// 8160 15226:getfield        #249 <Field int azh.W>
	// 8161 15229:ixor            
	// 8162 15230:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8163 15233:aload_0         
	// 8164 15234:getfield        #12  <Field azh a>
	// 8165 15237:astore_1        
		abyte0.W = ((azh) (abyte0)).bb | a.W;
	// 8166 15238:aload_1         
	// 8167 15239:aload_1         
	// 8168 15240:getfield        #138 <Field int azh.bb>
	// 8169 15243:aload_0         
	// 8170 15244:getfield        #12  <Field azh a>
	// 8171 15247:getfield        #249 <Field int azh.W>
	// 8172 15250:ior             
	// 8173 15251:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8174 15254:aload_0         
	// 8175 15255:getfield        #12  <Field azh a>
	// 8176 15258:astore_1        
		abyte0.W = ((azh) (abyte0)).bd ^ a.W;
	// 8177 15259:aload_1         
	// 8178 15260:aload_1         
	// 8179 15261:getfield        #459 <Field int azh.bd>
	// 8180 15264:aload_0         
	// 8181 15265:getfield        #12  <Field azh a>
	// 8182 15268:getfield        #249 <Field int azh.W>
	// 8183 15271:ixor            
	// 8184 15272:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8185 15275:aload_0         
	// 8186 15276:getfield        #12  <Field azh a>
	// 8187 15279:astore_1        
		abyte0.bd = ((azh) (abyte0)).bF & a.A;
	// 8188 15280:aload_1         
	// 8189 15281:aload_1         
	// 8190 15282:getfield        #462 <Field int azh.bF>
	// 8191 15285:aload_0         
	// 8192 15286:getfield        #12  <Field azh a>
	// 8193 15289:getfield        #360 <Field int azh.A>
	// 8194 15292:iand            
	// 8195 15293:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8196 15296:aload_0         
	// 8197 15297:getfield        #12  <Field azh a>
	// 8198 15300:astore_1        
		abyte0.i = ((azh) (abyte0)).A & ~a.bd;
	// 8199 15301:aload_1         
	// 8200 15302:aload_1         
	// 8201 15303:getfield        #360 <Field int azh.A>
	// 8202 15306:aload_0         
	// 8203 15307:getfield        #12  <Field azh a>
	// 8204 15310:getfield        #459 <Field int azh.bd>
	// 8205 15313:iconst_m1       
	// 8206 15314:ixor            
	// 8207 15315:iand            
	// 8208 15316:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8209 15319:aload_0         
	// 8210 15320:getfield        #12  <Field azh a>
	// 8211 15323:astore_1        
		abyte0.i = ((azh) (abyte0)).c | a.i;
	// 8212 15324:aload_1         
	// 8213 15325:aload_1         
	// 8214 15326:getfield        #276 <Field int azh.c>
	// 8215 15329:aload_0         
	// 8216 15330:getfield        #12  <Field azh a>
	// 8217 15333:getfield        #91  <Field int azh.i>
	// 8218 15336:ior             
	// 8219 15337:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8220 15340:aload_0         
	// 8221 15341:getfield        #12  <Field azh a>
	// 8222 15344:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bd ^ a.c;
	// 8223 15345:aload_1         
	// 8224 15346:aload_1         
	// 8225 15347:getfield        #459 <Field int azh.bd>
	// 8226 15350:aload_0         
	// 8227 15351:getfield        #12  <Field azh a>
	// 8228 15354:getfield        #276 <Field int azh.c>
	// 8229 15357:ixor            
	// 8230 15358:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8231 15361:aload_0         
	// 8232 15362:getfield        #12  <Field azh a>
	// 8233 15365:astore_1        
		abyte0.bR = ((azh) (abyte0)).aZ ^ a.bR;
	// 8234 15366:aload_1         
	// 8235 15367:aload_1         
	// 8236 15368:getfield        #297 <Field int azh.aZ>
	// 8237 15371:aload_0         
	// 8238 15372:getfield        #12  <Field azh a>
	// 8239 15375:getfield        #156 <Field int azh.bR>
	// 8240 15378:ixor            
	// 8241 15379:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8242 15382:aload_0         
	// 8243 15383:getfield        #12  <Field azh a>
	// 8244 15386:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR & ~a.bb;
	// 8245 15387:aload_1         
	// 8246 15388:aload_1         
	// 8247 15389:getfield        #156 <Field int azh.bR>
	// 8248 15392:aload_0         
	// 8249 15393:getfield        #12  <Field azh a>
	// 8250 15396:getfield        #138 <Field int azh.bb>
	// 8251 15399:iconst_m1       
	// 8252 15400:ixor            
	// 8253 15401:iand            
	// 8254 15402:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8255 15405:aload_0         
	// 8256 15406:getfield        #12  <Field azh a>
	// 8257 15409:astore_1        
		abyte0.ag = ((azh) (abyte0)).bd ^ a.ag;
	// 8258 15410:aload_1         
	// 8259 15411:aload_1         
	// 8260 15412:getfield        #459 <Field int azh.bd>
	// 8261 15415:aload_0         
	// 8262 15416:getfield        #12  <Field azh a>
	// 8263 15419:getfield        #426 <Field int azh.ag>
	// 8264 15422:ixor            
	// 8265 15423:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8266 15426:aload_0         
	// 8267 15427:getfield        #12  <Field azh a>
	// 8268 15430:astore_1        
		abyte0.ag = ((azh) (abyte0)).ag & ~a.bb;
	// 8269 15431:aload_1         
	// 8270 15432:aload_1         
	// 8271 15433:getfield        #426 <Field int azh.ag>
	// 8272 15436:aload_0         
	// 8273 15437:getfield        #12  <Field azh a>
	// 8274 15440:getfield        #138 <Field int azh.bb>
	// 8275 15443:iconst_m1       
	// 8276 15444:ixor            
	// 8277 15445:iand            
	// 8278 15446:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8279 15449:aload_0         
	// 8280 15450:getfield        #12  <Field azh a>
	// 8281 15453:astore_1        
		abyte0.bd = ((azh) (abyte0)).A & ~a.bF;
	// 8282 15454:aload_1         
	// 8283 15455:aload_1         
	// 8284 15456:getfield        #360 <Field int azh.A>
	// 8285 15459:aload_0         
	// 8286 15460:getfield        #12  <Field azh a>
	// 8287 15463:getfield        #462 <Field int azh.bF>
	// 8288 15466:iconst_m1       
	// 8289 15467:ixor            
	// 8290 15468:iand            
	// 8291 15469:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8292 15472:aload_0         
	// 8293 15473:getfield        #12  <Field azh a>
	// 8294 15476:astore_1        
		abyte0.aH = ((azh) (abyte0)).bd & ~a.I;
	// 8295 15477:aload_1         
	// 8296 15478:aload_1         
	// 8297 15479:getfield        #459 <Field int azh.bd>
	// 8298 15482:aload_0         
	// 8299 15483:getfield        #12  <Field azh a>
	// 8300 15486:getfield        #88  <Field int azh.I>
	// 8301 15489:iconst_m1       
	// 8302 15490:ixor            
	// 8303 15491:iand            
	// 8304 15492:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8305 15495:aload_0         
	// 8306 15496:getfield        #12  <Field azh a>
	// 8307 15499:astore_1        
		abyte0.aH = ((azh) (abyte0)).C ^ a.aH;
	// 8308 15500:aload_1         
	// 8309 15501:aload_1         
	// 8310 15502:getfield        #420 <Field int azh.C>
	// 8311 15505:aload_0         
	// 8312 15506:getfield        #12  <Field azh a>
	// 8313 15509:getfield        #363 <Field int azh.aH>
	// 8314 15512:ixor            
	// 8315 15513:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8316 15516:aload_0         
	// 8317 15517:getfield        #12  <Field azh a>
	// 8318 15520:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & ~a.bb;
	// 8319 15521:aload_1         
	// 8320 15522:aload_1         
	// 8321 15523:getfield        #363 <Field int azh.aH>
	// 8322 15526:aload_0         
	// 8323 15527:getfield        #12  <Field azh a>
	// 8324 15530:getfield        #138 <Field int azh.bb>
	// 8325 15533:iconst_m1       
	// 8326 15534:ixor            
	// 8327 15535:iand            
	// 8328 15536:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8329 15539:aload_0         
	// 8330 15540:getfield        #12  <Field azh a>
	// 8331 15543:astore_1        
		abyte0.aH = ((azh) (abyte0)).bX ^ a.aH;
	// 8332 15544:aload_1         
	// 8333 15545:aload_1         
	// 8334 15546:getfield        #405 <Field int azh.bX>
	// 8335 15549:aload_0         
	// 8336 15550:getfield        #12  <Field azh a>
	// 8337 15553:getfield        #363 <Field int azh.aH>
	// 8338 15556:ixor            
	// 8339 15557:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8340 15560:aload_0         
	// 8341 15561:getfield        #12  <Field azh a>
	// 8342 15564:astore_1        
		abyte0.aH = ((azh) (abyte0)).k & ~a.aH;
	// 8343 15565:aload_1         
	// 8344 15566:aload_1         
	// 8345 15567:getfield        #195 <Field int azh.k>
	// 8346 15570:aload_0         
	// 8347 15571:getfield        #12  <Field azh a>
	// 8348 15574:getfield        #363 <Field int azh.aH>
	// 8349 15577:iconst_m1       
	// 8350 15578:ixor            
	// 8351 15579:iand            
	// 8352 15580:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8353 15583:aload_0         
	// 8354 15584:getfield        #12  <Field azh a>
	// 8355 15587:astore_1        
		abyte0.bX = ((azh) (abyte0)).bd & ~a.c;
	// 8356 15588:aload_1         
	// 8357 15589:aload_1         
	// 8358 15590:getfield        #459 <Field int azh.bd>
	// 8359 15593:aload_0         
	// 8360 15594:getfield        #12  <Field azh a>
	// 8361 15597:getfield        #276 <Field int azh.c>
	// 8362 15600:iconst_m1       
	// 8363 15601:ixor            
	// 8364 15602:iand            
	// 8365 15603:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 8366 15606:aload_0         
	// 8367 15607:getfield        #12  <Field azh a>
	// 8368 15610:astore_1        
		abyte0.bA = ((azh) (abyte0)).bX ^ a.bA;
	// 8369 15611:aload_1         
	// 8370 15612:aload_1         
	// 8371 15613:getfield        #405 <Field int azh.bX>
	// 8372 15616:aload_0         
	// 8373 15617:getfield        #12  <Field azh a>
	// 8374 15620:getfield        #441 <Field int azh.bA>
	// 8375 15623:ixor            
	// 8376 15624:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8377 15627:aload_0         
	// 8378 15628:getfield        #12  <Field azh a>
	// 8379 15631:astore_1        
		abyte0.bA = ((azh) (abyte0)).k & a.bA;
	// 8380 15632:aload_1         
	// 8381 15633:aload_1         
	// 8382 15634:getfield        #195 <Field int azh.k>
	// 8383 15637:aload_0         
	// 8384 15638:getfield        #12  <Field azh a>
	// 8385 15641:getfield        #441 <Field int azh.bA>
	// 8386 15644:iand            
	// 8387 15645:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8388 15648:aload_0         
	// 8389 15649:getfield        #12  <Field azh a>
	// 8390 15652:astore_1        
		abyte0.bA = ((azh) (abyte0)).cc ^ a.bA;
	// 8391 15653:aload_1         
	// 8392 15654:aload_1         
	// 8393 15655:getfield        #444 <Field int azh.cc>
	// 8394 15658:aload_0         
	// 8395 15659:getfield        #12  <Field azh a>
	// 8396 15662:getfield        #441 <Field int azh.bA>
	// 8397 15665:ixor            
	// 8398 15666:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8399 15669:aload_0         
	// 8400 15670:getfield        #12  <Field azh a>
	// 8401 15673:astore_1        
		abyte0.T = ((azh) (abyte0)).bA ^ a.T;
	// 8402 15674:aload_1         
	// 8403 15675:aload_1         
	// 8404 15676:getfield        #441 <Field int azh.bA>
	// 8405 15679:aload_0         
	// 8406 15680:getfield        #12  <Field azh a>
	// 8407 15683:getfield        #273 <Field int azh.T>
	// 8408 15686:ixor            
	// 8409 15687:putfield        #273 <Field int azh.T>
		abyte0 = ((byte []) (a));
	// 8410 15690:aload_0         
	// 8411 15691:getfield        #12  <Field azh a>
	// 8412 15694:astore_1        
		abyte0.i = ((azh) (abyte0)).bd ^ a.i;
	// 8413 15695:aload_1         
	// 8414 15696:aload_1         
	// 8415 15697:getfield        #459 <Field int azh.bd>
	// 8416 15700:aload_0         
	// 8417 15701:getfield        #12  <Field azh a>
	// 8418 15704:getfield        #91  <Field int azh.i>
	// 8419 15707:ixor            
	// 8420 15708:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8421 15711:aload_0         
	// 8422 15712:getfield        #12  <Field azh a>
	// 8423 15715:astore_1        
		abyte0.i = ((azh) (abyte0)).I & ~a.i;
	// 8424 15716:aload_1         
	// 8425 15717:aload_1         
	// 8426 15718:getfield        #88  <Field int azh.I>
	// 8427 15721:aload_0         
	// 8428 15722:getfield        #12  <Field azh a>
	// 8429 15725:getfield        #91  <Field int azh.i>
	// 8430 15728:iconst_m1       
	// 8431 15729:ixor            
	// 8432 15730:iand            
	// 8433 15731:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8434 15734:aload_0         
	// 8435 15735:getfield        #12  <Field azh a>
	// 8436 15738:astore_1        
		abyte0.i = ((azh) (abyte0)).ap ^ a.i;
	// 8437 15739:aload_1         
	// 8438 15740:aload_1         
	// 8439 15741:getfield        #369 <Field int azh.ap>
	// 8440 15744:aload_0         
	// 8441 15745:getfield        #12  <Field azh a>
	// 8442 15748:getfield        #91  <Field int azh.i>
	// 8443 15751:ixor            
	// 8444 15752:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8445 15755:aload_0         
	// 8446 15756:getfield        #12  <Field azh a>
	// 8447 15759:astore_1        
		abyte0.bR = ((azh) (abyte0)).i ^ a.bR;
	// 8448 15760:aload_1         
	// 8449 15761:aload_1         
	// 8450 15762:getfield        #91  <Field int azh.i>
	// 8451 15765:aload_0         
	// 8452 15766:getfield        #12  <Field azh a>
	// 8453 15769:getfield        #156 <Field int azh.bR>
	// 8454 15772:ixor            
	// 8455 15773:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8456 15776:aload_0         
	// 8457 15777:getfield        #12  <Field azh a>
	// 8458 15780:astore_1        
		abyte0.aH = ((azh) (abyte0)).bR ^ a.aH;
	// 8459 15781:aload_1         
	// 8460 15782:aload_1         
	// 8461 15783:getfield        #156 <Field int azh.bR>
	// 8462 15786:aload_0         
	// 8463 15787:getfield        #12  <Field azh a>
	// 8464 15790:getfield        #363 <Field int azh.aH>
	// 8465 15793:ixor            
	// 8466 15794:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8467 15797:aload_0         
	// 8468 15798:getfield        #12  <Field azh a>
	// 8469 15801:astore_1        
		abyte0.N = ((azh) (abyte0)).aH ^ a.N;
	// 8470 15802:aload_1         
	// 8471 15803:aload_1         
	// 8472 15804:getfield        #363 <Field int azh.aH>
	// 8473 15807:aload_0         
	// 8474 15808:getfield        #12  <Field azh a>
	// 8475 15811:getfield        #165 <Field int azh.N>
	// 8476 15814:ixor            
	// 8477 15815:putfield        #165 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 8478 15818:aload_0         
	// 8479 15819:getfield        #12  <Field azh a>
	// 8480 15822:astore_1        
		abyte0.aH = ((azh) (abyte0)).N & a.al;
	// 8481 15823:aload_1         
	// 8482 15824:aload_1         
	// 8483 15825:getfield        #165 <Field int azh.N>
	// 8484 15828:aload_0         
	// 8485 15829:getfield        #12  <Field azh a>
	// 8486 15832:getfield        #177 <Field int azh.al>
	// 8487 15835:iand            
	// 8488 15836:putfield        #363 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8489 15839:aload_0         
	// 8490 15840:getfield        #12  <Field azh a>
	// 8491 15843:astore_1        
		abyte0.bR = ((azh) (abyte0)).N & ~a.al;
	// 8492 15844:aload_1         
	// 8493 15845:aload_1         
	// 8494 15846:getfield        #165 <Field int azh.N>
	// 8495 15849:aload_0         
	// 8496 15850:getfield        #12  <Field azh a>
	// 8497 15853:getfield        #177 <Field int azh.al>
	// 8498 15856:iconst_m1       
	// 8499 15857:ixor            
	// 8500 15858:iand            
	// 8501 15859:putfield        #156 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8502 15862:aload_0         
	// 8503 15863:getfield        #12  <Field azh a>
	// 8504 15866:astore_1        
		abyte0.i = ((azh) (abyte0)).N & ~a.al;
	// 8505 15867:aload_1         
	// 8506 15868:aload_1         
	// 8507 15869:getfield        #165 <Field int azh.N>
	// 8508 15872:aload_0         
	// 8509 15873:getfield        #12  <Field azh a>
	// 8510 15876:getfield        #177 <Field int azh.al>
	// 8511 15879:iconst_m1       
	// 8512 15880:ixor            
	// 8513 15881:iand            
	// 8514 15882:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8515 15885:aload_0         
	// 8516 15886:getfield        #12  <Field azh a>
	// 8517 15889:astore_1        
		abyte0.i = ((azh) (abyte0)).al ^ a.i;
	// 8518 15890:aload_1         
	// 8519 15891:aload_1         
	// 8520 15892:getfield        #177 <Field int azh.al>
	// 8521 15895:aload_0         
	// 8522 15896:getfield        #12  <Field azh a>
	// 8523 15899:getfield        #91  <Field int azh.i>
	// 8524 15902:ixor            
	// 8525 15903:putfield        #91  <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8526 15906:aload_0         
	// 8527 15907:getfield        #12  <Field azh a>
	// 8528 15910:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bd ^ a.aQ;
	// 8529 15911:aload_1         
	// 8530 15912:aload_1         
	// 8531 15913:getfield        #459 <Field int azh.bd>
	// 8532 15916:aload_0         
	// 8533 15917:getfield        #12  <Field azh a>
	// 8534 15920:getfield        #384 <Field int azh.aQ>
	// 8535 15923:ixor            
	// 8536 15924:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8537 15927:aload_0         
	// 8538 15928:getfield        #12  <Field azh a>
	// 8539 15931:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & ~a.I;
	// 8540 15932:aload_1         
	// 8541 15933:aload_1         
	// 8542 15934:getfield        #384 <Field int azh.aQ>
	// 8543 15937:aload_0         
	// 8544 15938:getfield        #12  <Field azh a>
	// 8545 15941:getfield        #88  <Field int azh.I>
	// 8546 15944:iconst_m1       
	// 8547 15945:ixor            
	// 8548 15946:iand            
	// 8549 15947:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8550 15950:aload_0         
	// 8551 15951:getfield        #12  <Field azh a>
	// 8552 15954:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aZ ^ a.aQ;
	// 8553 15955:aload_1         
	// 8554 15956:aload_1         
	// 8555 15957:getfield        #297 <Field int azh.aZ>
	// 8556 15960:aload_0         
	// 8557 15961:getfield        #12  <Field azh a>
	// 8558 15964:getfield        #384 <Field int azh.aQ>
	// 8559 15967:ixor            
	// 8560 15968:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8561 15971:aload_0         
	// 8562 15972:getfield        #12  <Field azh a>
	// 8563 15975:astore_1        
		abyte0.ag = ((azh) (abyte0)).aQ ^ a.ag;
	// 8564 15976:aload_1         
	// 8565 15977:aload_1         
	// 8566 15978:getfield        #384 <Field int azh.aQ>
	// 8567 15981:aload_0         
	// 8568 15982:getfield        #12  <Field azh a>
	// 8569 15985:getfield        #426 <Field int azh.ag>
	// 8570 15988:ixor            
	// 8571 15989:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8572 15992:aload_0         
	// 8573 15993:getfield        #12  <Field azh a>
	// 8574 15996:astore_1        
		abyte0.ag = ((azh) (abyte0)).k & ~a.ag;
	// 8575 15997:aload_1         
	// 8576 15998:aload_1         
	// 8577 15999:getfield        #195 <Field int azh.k>
	// 8578 16002:aload_0         
	// 8579 16003:getfield        #12  <Field azh a>
	// 8580 16006:getfield        #426 <Field int azh.ag>
	// 8581 16009:iconst_m1       
	// 8582 16010:ixor            
	// 8583 16011:iand            
	// 8584 16012:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8585 16015:aload_0         
	// 8586 16016:getfield        #12  <Field azh a>
	// 8587 16019:astore_1        
		abyte0.ag = ((azh) (abyte0)).W ^ a.ag;
	// 8588 16020:aload_1         
	// 8589 16021:aload_1         
	// 8590 16022:getfield        #249 <Field int azh.W>
	// 8591 16025:aload_0         
	// 8592 16026:getfield        #12  <Field azh a>
	// 8593 16029:getfield        #426 <Field int azh.ag>
	// 8594 16032:ixor            
	// 8595 16033:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8596 16036:aload_0         
	// 8597 16037:getfield        #12  <Field azh a>
	// 8598 16040:astore_1        
		abyte0.H = ((azh) (abyte0)).ag ^ a.H;
	// 8599 16041:aload_1         
	// 8600 16042:aload_1         
	// 8601 16043:getfield        #426 <Field int azh.ag>
	// 8602 16046:aload_0         
	// 8603 16047:getfield        #12  <Field azh a>
	// 8604 16050:getfield        #465 <Field int azh.H>
	// 8605 16053:ixor            
	// 8606 16054:putfield        #465 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 8607 16057:aload_0         
	// 8608 16058:getfield        #12  <Field azh a>
	// 8609 16061:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd ^ a.c;
	// 8610 16062:aload_1         
	// 8611 16063:aload_1         
	// 8612 16064:getfield        #459 <Field int azh.bd>
	// 8613 16067:aload_0         
	// 8614 16068:getfield        #12  <Field azh a>
	// 8615 16071:getfield        #276 <Field int azh.c>
	// 8616 16074:ixor            
	// 8617 16075:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8618 16078:aload_0         
	// 8619 16079:getfield        #12  <Field azh a>
	// 8620 16082:astore_1        
		abyte0.bd = ((azh) (abyte0)).I & ~a.bd;
	// 8621 16083:aload_1         
	// 8622 16084:aload_1         
	// 8623 16085:getfield        #88  <Field int azh.I>
	// 8624 16088:aload_0         
	// 8625 16089:getfield        #12  <Field azh a>
	// 8626 16092:getfield        #459 <Field int azh.bd>
	// 8627 16095:iconst_m1       
	// 8628 16096:ixor            
	// 8629 16097:iand            
	// 8630 16098:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8631 16101:aload_0         
	// 8632 16102:getfield        #12  <Field azh a>
	// 8633 16105:astore_1        
		abyte0.bd = ((azh) (abyte0)).c ^ a.bd;
	// 8634 16106:aload_1         
	// 8635 16107:aload_1         
	// 8636 16108:getfield        #276 <Field int azh.c>
	// 8637 16111:aload_0         
	// 8638 16112:getfield        #12  <Field azh a>
	// 8639 16115:getfield        #459 <Field int azh.bd>
	// 8640 16118:ixor            
	// 8641 16119:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8642 16122:aload_0         
	// 8643 16123:getfield        #12  <Field azh a>
	// 8644 16126:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd | a.bb;
	// 8645 16127:aload_1         
	// 8646 16128:aload_1         
	// 8647 16129:getfield        #459 <Field int azh.bd>
	// 8648 16132:aload_0         
	// 8649 16133:getfield        #12  <Field azh a>
	// 8650 16136:getfield        #138 <Field int azh.bb>
	// 8651 16139:ior             
	// 8652 16140:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8653 16143:aload_0         
	// 8654 16144:getfield        #12  <Field azh a>
	// 8655 16147:astore_1        
		abyte0.bd = ((azh) (abyte0)).bZ ^ a.bd;
	// 8656 16148:aload_1         
	// 8657 16149:aload_1         
	// 8658 16150:getfield        #303 <Field int azh.bZ>
	// 8659 16153:aload_0         
	// 8660 16154:getfield        #12  <Field azh a>
	// 8661 16157:getfield        #459 <Field int azh.bd>
	// 8662 16160:ixor            
	// 8663 16161:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8664 16164:aload_0         
	// 8665 16165:getfield        #12  <Field azh a>
	// 8666 16168:astore_1        
		abyte0.bd = ((azh) (abyte0)).k & a.bd;
	// 8667 16169:aload_1         
	// 8668 16170:aload_1         
	// 8669 16171:getfield        #195 <Field int azh.k>
	// 8670 16174:aload_0         
	// 8671 16175:getfield        #12  <Field azh a>
	// 8672 16178:getfield        #459 <Field int azh.bd>
	// 8673 16181:iand            
	// 8674 16182:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8675 16185:aload_0         
	// 8676 16186:getfield        #12  <Field azh a>
	// 8677 16189:astore_1        
		abyte0.bd = ((azh) (abyte0)).q ^ a.bd;
	// 8678 16190:aload_1         
	// 8679 16191:aload_1         
	// 8680 16192:getfield        #294 <Field int azh.q>
	// 8681 16195:aload_0         
	// 8682 16196:getfield        #12  <Field azh a>
	// 8683 16199:getfield        #459 <Field int azh.bd>
	// 8684 16202:ixor            
	// 8685 16203:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8686 16206:aload_0         
	// 8687 16207:getfield        #12  <Field azh a>
	// 8688 16210:astore_1        
		abyte0.bE = ((azh) (abyte0)).bd ^ a.bE;
	// 8689 16211:aload_1         
	// 8690 16212:aload_1         
	// 8691 16213:getfield        #459 <Field int azh.bd>
	// 8692 16216:aload_0         
	// 8693 16217:getfield        #12  <Field azh a>
	// 8694 16220:getfield        #318 <Field int azh.bE>
	// 8695 16223:ixor            
	// 8696 16224:putfield        #318 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 8697 16227:aload_0         
	// 8698 16228:getfield        #12  <Field azh a>
	// 8699 16231:astore_1        
		abyte0.a = ((azh) (abyte0)).bf & ~a.a;
	// 8700 16232:aload_1         
	// 8701 16233:aload_1         
	// 8702 16234:getfield        #468 <Field int azh.bf>
	// 8703 16237:aload_0         
	// 8704 16238:getfield        #12  <Field azh a>
	// 8705 16241:getfield        #96  <Field int azh.a>
	// 8706 16244:iconst_m1       
	// 8707 16245:ixor            
	// 8708 16246:iand            
	// 8709 16247:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 8710 16250:aload_0         
	// 8711 16251:getfield        #12  <Field azh a>
	// 8712 16254:astore_1        
		abyte0.a = ((azh) (abyte0)).bB ^ a.a;
	// 8713 16255:aload_1         
	// 8714 16256:aload_1         
	// 8715 16257:getfield        #471 <Field int azh.bB>
	// 8716 16260:aload_0         
	// 8717 16261:getfield        #12  <Field azh a>
	// 8718 16264:getfield        #96  <Field int azh.a>
	// 8719 16267:ixor            
	// 8720 16268:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 8721 16271:aload_0         
	// 8722 16272:getfield        #12  <Field azh a>
	// 8723 16275:astore_1        
		abyte0.a = ((azh) (abyte0)).ak & ~a.a;
	// 8724 16276:aload_1         
	// 8725 16277:aload_1         
	// 8726 16278:getfield        #32  <Field int azh.ak>
	// 8727 16281:aload_0         
	// 8728 16282:getfield        #12  <Field azh a>
	// 8729 16285:getfield        #96  <Field int azh.a>
	// 8730 16288:iconst_m1       
	// 8731 16289:ixor            
	// 8732 16290:iand            
	// 8733 16291:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 8734 16294:aload_0         
	// 8735 16295:getfield        #12  <Field azh a>
	// 8736 16298:astore_1        
		abyte0.a = ((azh) (abyte0)).at ^ a.a;
	// 8737 16299:aload_1         
	// 8738 16300:aload_1         
	// 8739 16301:getfield        #474 <Field int azh.at>
	// 8740 16304:aload_0         
	// 8741 16305:getfield        #12  <Field azh a>
	// 8742 16308:getfield        #96  <Field int azh.a>
	// 8743 16311:ixor            
	// 8744 16312:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 8745 16315:aload_0         
	// 8746 16316:getfield        #12  <Field azh a>
	// 8747 16319:astore_1        
		abyte0.bz = ((azh) (abyte0)).a ^ a.bz;
	// 8748 16320:aload_1         
	// 8749 16321:aload_1         
	// 8750 16322:getfield        #96  <Field int azh.a>
	// 8751 16325:aload_0         
	// 8752 16326:getfield        #12  <Field azh a>
	// 8753 16329:getfield        #477 <Field int azh.bz>
	// 8754 16332:ixor            
	// 8755 16333:putfield        #477 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 8756 16336:aload_0         
	// 8757 16337:getfield        #12  <Field azh a>
	// 8758 16340:astore_1        
		abyte0.cl = ((azh) (abyte0)).bz ^ a.cl;
	// 8759 16341:aload_1         
	// 8760 16342:aload_1         
	// 8761 16343:getfield        #477 <Field int azh.bz>
	// 8762 16346:aload_0         
	// 8763 16347:getfield        #12  <Field azh a>
	// 8764 16350:getfield        #387 <Field int azh.cl>
	// 8765 16353:ixor            
	// 8766 16354:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 8767 16357:aload_0         
	// 8768 16358:getfield        #12  <Field azh a>
	// 8769 16361:astore_1        
		abyte0.cl = ((azh) (abyte0)).cl | a.t;
	// 8770 16362:aload_1         
	// 8771 16363:aload_1         
	// 8772 16364:getfield        #387 <Field int azh.cl>
	// 8773 16367:aload_0         
	// 8774 16368:getfield        #12  <Field azh a>
	// 8775 16371:getfield        #381 <Field int azh.t>
	// 8776 16374:ior             
	// 8777 16375:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 8778 16378:aload_0         
	// 8779 16379:getfield        #12  <Field azh a>
	// 8780 16382:astore_1        
		abyte0.a = ((azh) (abyte0)).bY & a.bz;
	// 8781 16383:aload_1         
	// 8782 16384:aload_1         
	// 8783 16385:getfield        #375 <Field int azh.bY>
	// 8784 16388:aload_0         
	// 8785 16389:getfield        #12  <Field azh a>
	// 8786 16392:getfield        #477 <Field int azh.bz>
	// 8787 16395:iand            
	// 8788 16396:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 8789 16399:aload_0         
	// 8790 16400:getfield        #12  <Field azh a>
	// 8791 16403:astore_1        
		abyte0.at = ((azh) (abyte0)).cf & a.bz;
	// 8792 16404:aload_1         
	// 8793 16405:aload_1         
	// 8794 16406:getfield        #378 <Field int azh.cf>
	// 8795 16409:aload_0         
	// 8796 16410:getfield        #12  <Field azh a>
	// 8797 16413:getfield        #477 <Field int azh.bz>
	// 8798 16416:iand            
	// 8799 16417:putfield        #474 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 8800 16420:aload_0         
	// 8801 16421:getfield        #12  <Field azh a>
	// 8802 16424:astore_1        
		abyte0.ak = ((azh) (abyte0)).bz & ~a.at;
	// 8803 16425:aload_1         
	// 8804 16426:aload_1         
	// 8805 16427:getfield        #477 <Field int azh.bz>
	// 8806 16430:aload_0         
	// 8807 16431:getfield        #12  <Field azh a>
	// 8808 16434:getfield        #474 <Field int azh.at>
	// 8809 16437:iconst_m1       
	// 8810 16438:ixor            
	// 8811 16439:iand            
	// 8812 16440:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 8813 16443:aload_0         
	// 8814 16444:getfield        #12  <Field azh a>
	// 8815 16447:astore_1        
		abyte0.bB = ((azh) (abyte0)).bY & ~a.ak;
	// 8816 16448:aload_1         
	// 8817 16449:aload_1         
	// 8818 16450:getfield        #375 <Field int azh.bY>
	// 8819 16453:aload_0         
	// 8820 16454:getfield        #12  <Field azh a>
	// 8821 16457:getfield        #32  <Field int azh.ak>
	// 8822 16460:iconst_m1       
	// 8823 16461:ixor            
	// 8824 16462:iand            
	// 8825 16463:putfield        #471 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 8826 16466:aload_0         
	// 8827 16467:getfield        #12  <Field azh a>
	// 8828 16470:astore_1        
		abyte0.bB = ((azh) (abyte0)).ak ^ a.bB;
	// 8829 16471:aload_1         
	// 8830 16472:aload_1         
	// 8831 16473:getfield        #32  <Field int azh.ak>
	// 8832 16476:aload_0         
	// 8833 16477:getfield        #12  <Field azh a>
	// 8834 16480:getfield        #471 <Field int azh.bB>
	// 8835 16483:ixor            
	// 8836 16484:putfield        #471 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 8837 16487:aload_0         
	// 8838 16488:getfield        #12  <Field azh a>
	// 8839 16491:astore_1        
		abyte0.bB = ((azh) (abyte0)).bB | a.t;
	// 8840 16492:aload_1         
	// 8841 16493:aload_1         
	// 8842 16494:getfield        #471 <Field int azh.bB>
	// 8843 16497:aload_0         
	// 8844 16498:getfield        #12  <Field azh a>
	// 8845 16501:getfield        #381 <Field int azh.t>
	// 8846 16504:ior             
	// 8847 16505:putfield        #471 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 8848 16508:aload_0         
	// 8849 16509:getfield        #12  <Field azh a>
	// 8850 16512:astore_1        
		abyte0.ak = ((azh) (abyte0)).bY & ~a.at;
	// 8851 16513:aload_1         
	// 8852 16514:aload_1         
	// 8853 16515:getfield        #375 <Field int azh.bY>
	// 8854 16518:aload_0         
	// 8855 16519:getfield        #12  <Field azh a>
	// 8856 16522:getfield        #474 <Field int azh.at>
	// 8857 16525:iconst_m1       
	// 8858 16526:ixor            
	// 8859 16527:iand            
	// 8860 16528:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 8861 16531:aload_0         
	// 8862 16532:getfield        #12  <Field azh a>
	// 8863 16535:astore_1        
		abyte0.ak = ((azh) (abyte0)).at ^ a.ak;
	// 8864 16536:aload_1         
	// 8865 16537:aload_1         
	// 8866 16538:getfield        #474 <Field int azh.at>
	// 8867 16541:aload_0         
	// 8868 16542:getfield        #12  <Field azh a>
	// 8869 16545:getfield        #32  <Field int azh.ak>
	// 8870 16548:ixor            
	// 8871 16549:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 8872 16552:aload_0         
	// 8873 16553:getfield        #12  <Field azh a>
	// 8874 16556:astore_1        
		abyte0.ak = ((azh) (abyte0)).ak & ~a.t;
	// 8875 16557:aload_1         
	// 8876 16558:aload_1         
	// 8877 16559:getfield        #32  <Field int azh.ak>
	// 8878 16562:aload_0         
	// 8879 16563:getfield        #12  <Field azh a>
	// 8880 16566:getfield        #381 <Field int azh.t>
	// 8881 16569:iconst_m1       
	// 8882 16570:ixor            
	// 8883 16571:iand            
	// 8884 16572:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 8885 16575:aload_0         
	// 8886 16576:getfield        #12  <Field azh a>
	// 8887 16579:astore_1        
		abyte0.bf = ((azh) (abyte0)).t & ~a.at;
	// 8888 16580:aload_1         
	// 8889 16581:aload_1         
	// 8890 16582:getfield        #381 <Field int azh.t>
	// 8891 16585:aload_0         
	// 8892 16586:getfield        #12  <Field azh a>
	// 8893 16589:getfield        #474 <Field int azh.at>
	// 8894 16592:iconst_m1       
	// 8895 16593:ixor            
	// 8896 16594:iand            
	// 8897 16595:putfield        #468 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 8898 16598:aload_0         
	// 8899 16599:getfield        #12  <Field azh a>
	// 8900 16602:astore_1        
		abyte0.bd = ((azh) (abyte0)).bY & ~a.at;
	// 8901 16603:aload_1         
	// 8902 16604:aload_1         
	// 8903 16605:getfield        #375 <Field int azh.bY>
	// 8904 16608:aload_0         
	// 8905 16609:getfield        #12  <Field azh a>
	// 8906 16612:getfield        #474 <Field int azh.at>
	// 8907 16615:iconst_m1       
	// 8908 16616:ixor            
	// 8909 16617:iand            
	// 8910 16618:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8911 16621:aload_0         
	// 8912 16622:getfield        #12  <Field azh a>
	// 8913 16625:astore_1        
		abyte0.q = ((azh) (abyte0)).t & a.at;
	// 8914 16626:aload_1         
	// 8915 16627:aload_1         
	// 8916 16628:getfield        #381 <Field int azh.t>
	// 8917 16631:aload_0         
	// 8918 16632:getfield        #12  <Field azh a>
	// 8919 16635:getfield        #474 <Field int azh.at>
	// 8920 16638:iand            
	// 8921 16639:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 8922 16642:aload_0         
	// 8923 16643:getfield        #12  <Field azh a>
	// 8924 16646:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bY & ~a.at;
	// 8925 16647:aload_1         
	// 8926 16648:aload_1         
	// 8927 16649:getfield        #375 <Field int azh.bY>
	// 8928 16652:aload_0         
	// 8929 16653:getfield        #12  <Field azh a>
	// 8930 16656:getfield        #474 <Field int azh.at>
	// 8931 16659:iconst_m1       
	// 8932 16660:ixor            
	// 8933 16661:iand            
	// 8934 16662:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 8935 16665:aload_0         
	// 8936 16666:getfield        #12  <Field azh a>
	// 8937 16669:astore_1        
		abyte0.ag = ((azh) (abyte0)).bY & a.at;
	// 8938 16670:aload_1         
	// 8939 16671:aload_1         
	// 8940 16672:getfield        #375 <Field int azh.bY>
	// 8941 16675:aload_0         
	// 8942 16676:getfield        #12  <Field azh a>
	// 8943 16679:getfield        #474 <Field int azh.at>
	// 8944 16682:iand            
	// 8945 16683:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8946 16686:aload_0         
	// 8947 16687:getfield        #12  <Field azh a>
	// 8948 16690:astore_1        
		abyte0.ag = ((azh) (abyte0)).bz ^ a.ag;
	// 8949 16691:aload_1         
	// 8950 16692:aload_1         
	// 8951 16693:getfield        #477 <Field int azh.bz>
	// 8952 16696:aload_0         
	// 8953 16697:getfield        #12  <Field azh a>
	// 8954 16700:getfield        #426 <Field int azh.ag>
	// 8955 16703:ixor            
	// 8956 16704:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8957 16707:aload_0         
	// 8958 16708:getfield        #12  <Field azh a>
	// 8959 16711:astore_1        
		abyte0.aY = ((azh) (abyte0)).ag ^ a.aY;
	// 8960 16712:aload_1         
	// 8961 16713:aload_1         
	// 8962 16714:getfield        #426 <Field int azh.ag>
	// 8963 16717:aload_0         
	// 8964 16718:getfield        #12  <Field azh a>
	// 8965 16721:getfield        #372 <Field int azh.aY>
	// 8966 16724:ixor            
	// 8967 16725:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 8968 16728:aload_0         
	// 8969 16729:getfield        #12  <Field azh a>
	// 8970 16732:astore_1        
		abyte0.aY = ((azh) (abyte0)).bn & a.aY;
	// 8971 16733:aload_1         
	// 8972 16734:aload_1         
	// 8973 16735:getfield        #480 <Field int azh.bn>
	// 8974 16738:aload_0         
	// 8975 16739:getfield        #12  <Field azh a>
	// 8976 16742:getfield        #372 <Field int azh.aY>
	// 8977 16745:iand            
	// 8978 16746:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 8979 16749:aload_0         
	// 8980 16750:getfield        #12  <Field azh a>
	// 8981 16753:astore_1        
		abyte0.ak = ((azh) (abyte0)).ag ^ a.ak;
	// 8982 16754:aload_1         
	// 8983 16755:aload_1         
	// 8984 16756:getfield        #426 <Field int azh.ag>
	// 8985 16759:aload_0         
	// 8986 16760:getfield        #12  <Field azh a>
	// 8987 16763:getfield        #32  <Field int azh.ak>
	// 8988 16766:ixor            
	// 8989 16767:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 8990 16770:aload_0         
	// 8991 16771:getfield        #12  <Field azh a>
	// 8992 16774:astore_1        
		abyte0.W = ((azh) (abyte0)).bz & ~a.cf;
	// 8993 16775:aload_1         
	// 8994 16776:aload_1         
	// 8995 16777:getfield        #477 <Field int azh.bz>
	// 8996 16780:aload_0         
	// 8997 16781:getfield        #12  <Field azh a>
	// 8998 16784:getfield        #378 <Field int azh.cf>
	// 8999 16787:iconst_m1       
	// 9000 16788:ixor            
	// 9001 16789:iand            
	// 9002 16790:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9003 16793:aload_0         
	// 9004 16794:getfield        #12  <Field azh a>
	// 9005 16797:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bY & a.W;
	// 9006 16798:aload_1         
	// 9007 16799:aload_1         
	// 9008 16800:getfield        #375 <Field int azh.bY>
	// 9009 16803:aload_0         
	// 9010 16804:getfield        #12  <Field azh a>
	// 9011 16807:getfield        #249 <Field int azh.W>
	// 9012 16810:iand            
	// 9013 16811:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9014 16814:aload_0         
	// 9015 16815:getfield        #12  <Field azh a>
	// 9016 16818:astore_1        
		abyte0.aQ = ((azh) (abyte0)).W ^ a.aQ;
	// 9017 16819:aload_1         
	// 9018 16820:aload_1         
	// 9019 16821:getfield        #249 <Field int azh.W>
	// 9020 16824:aload_0         
	// 9021 16825:getfield        #12  <Field azh a>
	// 9022 16828:getfield        #384 <Field int azh.aQ>
	// 9023 16831:ixor            
	// 9024 16832:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9025 16835:aload_0         
	// 9026 16836:getfield        #12  <Field azh a>
	// 9027 16839:astore_1        
		abyte0.bf = ((azh) (abyte0)).aQ ^ a.bf;
	// 9028 16840:aload_1         
	// 9029 16841:aload_1         
	// 9030 16842:getfield        #384 <Field int azh.aQ>
	// 9031 16845:aload_0         
	// 9032 16846:getfield        #12  <Field azh a>
	// 9033 16849:getfield        #468 <Field int azh.bf>
	// 9034 16852:ixor            
	// 9035 16853:putfield        #468 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 9036 16856:aload_0         
	// 9037 16857:getfield        #12  <Field azh a>
	// 9038 16860:astore_1        
		abyte0.bf = ((azh) (abyte0)).bn & ~a.bf;
	// 9039 16861:aload_1         
	// 9040 16862:aload_1         
	// 9041 16863:getfield        #480 <Field int azh.bn>
	// 9042 16866:aload_0         
	// 9043 16867:getfield        #12  <Field azh a>
	// 9044 16870:getfield        #468 <Field int azh.bf>
	// 9045 16873:iconst_m1       
	// 9046 16874:ixor            
	// 9047 16875:iand            
	// 9048 16876:putfield        #468 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 9049 16879:aload_0         
	// 9050 16880:getfield        #12  <Field azh a>
	// 9051 16883:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & ~a.t;
	// 9052 16884:aload_1         
	// 9053 16885:aload_1         
	// 9054 16886:getfield        #384 <Field int azh.aQ>
	// 9055 16889:aload_0         
	// 9056 16890:getfield        #12  <Field azh a>
	// 9057 16893:getfield        #381 <Field int azh.t>
	// 9058 16896:iconst_m1       
	// 9059 16897:ixor            
	// 9060 16898:iand            
	// 9061 16899:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9062 16902:aload_0         
	// 9063 16903:getfield        #12  <Field azh a>
	// 9064 16906:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bY & a.W;
	// 9065 16907:aload_1         
	// 9066 16908:aload_1         
	// 9067 16909:getfield        #375 <Field int azh.bY>
	// 9068 16912:aload_0         
	// 9069 16913:getfield        #12  <Field azh a>
	// 9070 16916:getfield        #249 <Field int azh.W>
	// 9071 16919:iand            
	// 9072 16920:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9073 16923:aload_0         
	// 9074 16924:getfield        #12  <Field azh a>
	// 9075 16927:astore_1        
		abyte0.aZ = ((azh) (abyte0)).cf ^ a.aZ;
	// 9076 16928:aload_1         
	// 9077 16929:aload_1         
	// 9078 16930:getfield        #378 <Field int azh.cf>
	// 9079 16933:aload_0         
	// 9080 16934:getfield        #12  <Field azh a>
	// 9081 16937:getfield        #297 <Field int azh.aZ>
	// 9082 16940:ixor            
	// 9083 16941:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9084 16944:aload_0         
	// 9085 16945:getfield        #12  <Field azh a>
	// 9086 16948:astore_1        
		abyte0.by = ((azh) (abyte0)).aZ ^ a.by;
	// 9087 16949:aload_1         
	// 9088 16950:aload_1         
	// 9089 16951:getfield        #297 <Field int azh.aZ>
	// 9090 16954:aload_0         
	// 9091 16955:getfield        #12  <Field azh a>
	// 9092 16958:getfield        #94  <Field int azh.by>
	// 9093 16961:ixor            
	// 9094 16962:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9095 16965:aload_0         
	// 9096 16966:getfield        #12  <Field azh a>
	// 9097 16969:astore_1        
		abyte0.by = ((azh) (abyte0)).bn & ~a.by;
	// 9098 16970:aload_1         
	// 9099 16971:aload_1         
	// 9100 16972:getfield        #480 <Field int azh.bn>
	// 9101 16975:aload_0         
	// 9102 16976:getfield        #12  <Field azh a>
	// 9103 16979:getfield        #94  <Field int azh.by>
	// 9104 16982:iconst_m1       
	// 9105 16983:ixor            
	// 9106 16984:iand            
	// 9107 16985:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9108 16988:aload_0         
	// 9109 16989:getfield        #12  <Field azh a>
	// 9110 16992:astore_1        
		abyte0.by = ((azh) (abyte0)).aQ ^ a.by;
	// 9111 16993:aload_1         
	// 9112 16994:aload_1         
	// 9113 16995:getfield        #384 <Field int azh.aQ>
	// 9114 16998:aload_0         
	// 9115 16999:getfield        #12  <Field azh a>
	// 9116 17002:getfield        #94  <Field int azh.by>
	// 9117 17005:ixor            
	// 9118 17006:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9119 17009:aload_0         
	// 9120 17010:getfield        #12  <Field azh a>
	// 9121 17013:astore_1        
		abyte0.by = ((azh) (abyte0)).ax & ~a.by;
	// 9122 17014:aload_1         
	// 9123 17015:aload_1         
	// 9124 17016:getfield        #390 <Field int azh.ax>
	// 9125 17019:aload_0         
	// 9126 17020:getfield        #12  <Field azh a>
	// 9127 17023:getfield        #94  <Field int azh.by>
	// 9128 17026:iconst_m1       
	// 9129 17027:ixor            
	// 9130 17028:iand            
	// 9131 17029:putfield        #94  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9132 17032:aload_0         
	// 9133 17033:getfield        #12  <Field azh a>
	// 9134 17036:astore_1        
		abyte0.a = ((azh) (abyte0)).W ^ a.a;
	// 9135 17037:aload_1         
	// 9136 17038:aload_1         
	// 9137 17039:getfield        #249 <Field int azh.W>
	// 9138 17042:aload_0         
	// 9139 17043:getfield        #12  <Field azh a>
	// 9140 17046:getfield        #96  <Field int azh.a>
	// 9141 17049:ixor            
	// 9142 17050:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 9143 17053:aload_0         
	// 9144 17054:getfield        #12  <Field azh a>
	// 9145 17057:astore_1        
		abyte0.cl = ((azh) (abyte0)).a ^ a.cl;
	// 9146 17058:aload_1         
	// 9147 17059:aload_1         
	// 9148 17060:getfield        #96  <Field int azh.a>
	// 9149 17063:aload_0         
	// 9150 17064:getfield        #12  <Field azh a>
	// 9151 17067:getfield        #387 <Field int azh.cl>
	// 9152 17070:ixor            
	// 9153 17071:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9154 17074:aload_0         
	// 9155 17075:getfield        #12  <Field azh a>
	// 9156 17078:astore_1        
		abyte0.cl = ((azh) (abyte0)).bn & ~a.cl;
	// 9157 17079:aload_1         
	// 9158 17080:aload_1         
	// 9159 17081:getfield        #480 <Field int azh.bn>
	// 9160 17084:aload_0         
	// 9161 17085:getfield        #12  <Field azh a>
	// 9162 17088:getfield        #387 <Field int azh.cl>
	// 9163 17091:iconst_m1       
	// 9164 17092:ixor            
	// 9165 17093:iand            
	// 9166 17094:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9167 17097:aload_0         
	// 9168 17098:getfield        #12  <Field azh a>
	// 9169 17101:astore_1        
		abyte0.a = ((azh) (abyte0)).bY & a.W;
	// 9170 17102:aload_1         
	// 9171 17103:aload_1         
	// 9172 17104:getfield        #375 <Field int azh.bY>
	// 9173 17107:aload_0         
	// 9174 17108:getfield        #12  <Field azh a>
	// 9175 17111:getfield        #249 <Field int azh.W>
	// 9176 17114:iand            
	// 9177 17115:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 9178 17118:aload_0         
	// 9179 17119:getfield        #12  <Field azh a>
	// 9180 17122:astore_1        
		abyte0.a = ((azh) (abyte0)).at ^ a.a;
	// 9181 17123:aload_1         
	// 9182 17124:aload_1         
	// 9183 17125:getfield        #474 <Field int azh.at>
	// 9184 17128:aload_0         
	// 9185 17129:getfield        #12  <Field azh a>
	// 9186 17132:getfield        #96  <Field int azh.a>
	// 9187 17135:ixor            
	// 9188 17136:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 9189 17139:aload_0         
	// 9190 17140:getfield        #12  <Field azh a>
	// 9191 17143:astore_1        
		abyte0.q = ((azh) (abyte0)).a ^ a.q;
	// 9192 17144:aload_1         
	// 9193 17145:aload_1         
	// 9194 17146:getfield        #96  <Field int azh.a>
	// 9195 17149:aload_0         
	// 9196 17150:getfield        #12  <Field azh a>
	// 9197 17153:getfield        #294 <Field int azh.q>
	// 9198 17156:ixor            
	// 9199 17157:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 9200 17160:aload_0         
	// 9201 17161:getfield        #12  <Field azh a>
	// 9202 17164:astore_1        
		abyte0.q = ((azh) (abyte0)).bn & ~a.q;
	// 9203 17165:aload_1         
	// 9204 17166:aload_1         
	// 9205 17167:getfield        #480 <Field int azh.bn>
	// 9206 17170:aload_0         
	// 9207 17171:getfield        #12  <Field azh a>
	// 9208 17174:getfield        #294 <Field int azh.q>
	// 9209 17177:iconst_m1       
	// 9210 17178:ixor            
	// 9211 17179:iand            
	// 9212 17180:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 9213 17183:aload_0         
	// 9214 17184:getfield        #12  <Field azh a>
	// 9215 17187:astore_1        
		abyte0.q = ((azh) (abyte0)).ak ^ a.q;
	// 9216 17188:aload_1         
	// 9217 17189:aload_1         
	// 9218 17190:getfield        #32  <Field int azh.ak>
	// 9219 17193:aload_0         
	// 9220 17194:getfield        #12  <Field azh a>
	// 9221 17197:getfield        #294 <Field int azh.q>
	// 9222 17200:ixor            
	// 9223 17201:putfield        #294 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 9224 17204:aload_0         
	// 9225 17205:getfield        #12  <Field azh a>
	// 9226 17208:astore_1        
		abyte0.ak = ((azh) (abyte0)).t & ~a.a;
	// 9227 17209:aload_1         
	// 9228 17210:aload_1         
	// 9229 17211:getfield        #381 <Field int azh.t>
	// 9230 17214:aload_0         
	// 9231 17215:getfield        #12  <Field azh a>
	// 9232 17218:getfield        #96  <Field int azh.a>
	// 9233 17221:iconst_m1       
	// 9234 17222:ixor            
	// 9235 17223:iand            
	// 9236 17224:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 9237 17227:aload_0         
	// 9238 17228:getfield        #12  <Field azh a>
	// 9239 17231:astore_1        
		abyte0.ak = ((azh) (abyte0)).ag ^ a.ak;
	// 9240 17232:aload_1         
	// 9241 17233:aload_1         
	// 9242 17234:getfield        #426 <Field int azh.ag>
	// 9243 17237:aload_0         
	// 9244 17238:getfield        #12  <Field azh a>
	// 9245 17241:getfield        #32  <Field int azh.ak>
	// 9246 17244:ixor            
	// 9247 17245:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 9248 17248:aload_0         
	// 9249 17249:getfield        #12  <Field azh a>
	// 9250 17252:astore_1        
		abyte0.cl = ((azh) (abyte0)).ak ^ a.cl;
	// 9251 17253:aload_1         
	// 9252 17254:aload_1         
	// 9253 17255:getfield        #32  <Field int azh.ak>
	// 9254 17258:aload_0         
	// 9255 17259:getfield        #12  <Field azh a>
	// 9256 17262:getfield        #387 <Field int azh.cl>
	// 9257 17265:ixor            
	// 9258 17266:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9259 17269:aload_0         
	// 9260 17270:getfield        #12  <Field azh a>
	// 9261 17273:astore_1        
		abyte0.cl = ((azh) (abyte0)).ax & a.cl;
	// 9262 17274:aload_1         
	// 9263 17275:aload_1         
	// 9264 17276:getfield        #390 <Field int azh.ax>
	// 9265 17279:aload_0         
	// 9266 17280:getfield        #12  <Field azh a>
	// 9267 17283:getfield        #387 <Field int azh.cl>
	// 9268 17286:iand            
	// 9269 17287:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9270 17290:aload_0         
	// 9271 17291:getfield        #12  <Field azh a>
	// 9272 17294:astore_1        
		abyte0.ak = ((azh) (abyte0)).bz & ~a.t;
	// 9273 17295:aload_1         
	// 9274 17296:aload_1         
	// 9275 17297:getfield        #477 <Field int azh.bz>
	// 9276 17300:aload_0         
	// 9277 17301:getfield        #12  <Field azh a>
	// 9278 17304:getfield        #381 <Field int azh.t>
	// 9279 17307:iconst_m1       
	// 9280 17308:ixor            
	// 9281 17309:iand            
	// 9282 17310:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 9283 17313:aload_0         
	// 9284 17314:getfield        #12  <Field azh a>
	// 9285 17317:astore_1        
		abyte0.ag = ((azh) (abyte0)).cf ^ a.bz;
	// 9286 17318:aload_1         
	// 9287 17319:aload_1         
	// 9288 17320:getfield        #378 <Field int azh.cf>
	// 9289 17323:aload_0         
	// 9290 17324:getfield        #12  <Field azh a>
	// 9291 17327:getfield        #477 <Field int azh.bz>
	// 9292 17330:ixor            
	// 9293 17331:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 9294 17334:aload_0         
	// 9295 17335:getfield        #12  <Field azh a>
	// 9296 17338:astore_1        
		abyte0.at = ((azh) (abyte0)).bY & ~a.ag;
	// 9297 17339:aload_1         
	// 9298 17340:aload_1         
	// 9299 17341:getfield        #375 <Field int azh.bY>
	// 9300 17344:aload_0         
	// 9301 17345:getfield        #12  <Field azh a>
	// 9302 17348:getfield        #426 <Field int azh.ag>
	// 9303 17351:iconst_m1       
	// 9304 17352:ixor            
	// 9305 17353:iand            
	// 9306 17354:putfield        #474 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9307 17357:aload_0         
	// 9308 17358:getfield        #12  <Field azh a>
	// 9309 17361:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ag ^ a.bY;
	// 9310 17362:aload_1         
	// 9311 17363:aload_1         
	// 9312 17364:getfield        #426 <Field int azh.ag>
	// 9313 17367:aload_0         
	// 9314 17368:getfield        #12  <Field azh a>
	// 9315 17371:getfield        #375 <Field int azh.bY>
	// 9316 17374:ixor            
	// 9317 17375:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9318 17378:aload_0         
	// 9319 17379:getfield        #12  <Field azh a>
	// 9320 17382:astore_1        
		abyte0.bB = ((azh) (abyte0)).aQ ^ a.bB;
	// 9321 17383:aload_1         
	// 9322 17384:aload_1         
	// 9323 17385:getfield        #384 <Field int azh.aQ>
	// 9324 17388:aload_0         
	// 9325 17389:getfield        #12  <Field azh a>
	// 9326 17392:getfield        #471 <Field int azh.bB>
	// 9327 17395:ixor            
	// 9328 17396:putfield        #471 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9329 17399:aload_0         
	// 9330 17400:getfield        #12  <Field azh a>
	// 9331 17403:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bY & ~a.ag;
	// 9332 17404:aload_1         
	// 9333 17405:aload_1         
	// 9334 17406:getfield        #375 <Field int azh.bY>
	// 9335 17409:aload_0         
	// 9336 17410:getfield        #12  <Field azh a>
	// 9337 17413:getfield        #426 <Field int azh.ag>
	// 9338 17416:iconst_m1       
	// 9339 17417:ixor            
	// 9340 17418:iand            
	// 9341 17419:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9342 17422:aload_0         
	// 9343 17423:getfield        #12  <Field azh a>
	// 9344 17426:astore_1        
		abyte0.aQ = ((azh) (abyte0)).W ^ a.aQ;
	// 9345 17427:aload_1         
	// 9346 17428:aload_1         
	// 9347 17429:getfield        #249 <Field int azh.W>
	// 9348 17432:aload_0         
	// 9349 17433:getfield        #12  <Field azh a>
	// 9350 17436:getfield        #384 <Field int azh.aQ>
	// 9351 17439:ixor            
	// 9352 17440:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9353 17443:aload_0         
	// 9354 17444:getfield        #12  <Field azh a>
	// 9355 17447:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ ^ a.t;
	// 9356 17448:aload_1         
	// 9357 17449:aload_1         
	// 9358 17450:getfield        #384 <Field int azh.aQ>
	// 9359 17453:aload_0         
	// 9360 17454:getfield        #12  <Field azh a>
	// 9361 17457:getfield        #381 <Field int azh.t>
	// 9362 17460:ixor            
	// 9363 17461:putfield        #384 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9364 17464:aload_0         
	// 9365 17465:getfield        #12  <Field azh a>
	// 9366 17468:astore_1        
		abyte0.bd = ((azh) (abyte0)).ag ^ a.bd;
	// 9367 17469:aload_1         
	// 9368 17470:aload_1         
	// 9369 17471:getfield        #426 <Field int azh.ag>
	// 9370 17474:aload_0         
	// 9371 17475:getfield        #12  <Field azh a>
	// 9372 17478:getfield        #459 <Field int azh.bd>
	// 9373 17481:ixor            
	// 9374 17482:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9375 17485:aload_0         
	// 9376 17486:getfield        #12  <Field azh a>
	// 9377 17489:astore_1        
		abyte0.ce = ((azh) (abyte0)).bd ^ a.ce;
	// 9378 17490:aload_1         
	// 9379 17491:aload_1         
	// 9380 17492:getfield        #459 <Field int azh.bd>
	// 9381 17495:aload_0         
	// 9382 17496:getfield        #12  <Field azh a>
	// 9383 17499:getfield        #393 <Field int azh.ce>
	// 9384 17502:ixor            
	// 9385 17503:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9386 17506:aload_0         
	// 9387 17507:getfield        #12  <Field azh a>
	// 9388 17510:astore_1        
		abyte0.aY = ((azh) (abyte0)).ce ^ a.aY;
	// 9389 17511:aload_1         
	// 9390 17512:aload_1         
	// 9391 17513:getfield        #393 <Field int azh.ce>
	// 9392 17516:aload_0         
	// 9393 17517:getfield        #12  <Field azh a>
	// 9394 17520:getfield        #372 <Field int azh.aY>
	// 9395 17523:ixor            
	// 9396 17524:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9397 17527:aload_0         
	// 9398 17528:getfield        #12  <Field azh a>
	// 9399 17531:astore_1        
		abyte0.aY = ((azh) (abyte0)).ax & ~a.aY;
	// 9400 17532:aload_1         
	// 9401 17533:aload_1         
	// 9402 17534:getfield        #390 <Field int azh.ax>
	// 9403 17537:aload_0         
	// 9404 17538:getfield        #12  <Field azh a>
	// 9405 17541:getfield        #372 <Field int azh.aY>
	// 9406 17544:iconst_m1       
	// 9407 17545:ixor            
	// 9408 17546:iand            
	// 9409 17547:putfield        #372 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9410 17550:aload_0         
	// 9411 17551:getfield        #12  <Field azh a>
	// 9412 17554:astore_1        
		abyte0.ce = ((azh) (abyte0)).t & ~a.bz;
	// 9413 17555:aload_1         
	// 9414 17556:aload_1         
	// 9415 17557:getfield        #381 <Field int azh.t>
	// 9416 17560:aload_0         
	// 9417 17561:getfield        #12  <Field azh a>
	// 9418 17564:getfield        #477 <Field int azh.bz>
	// 9419 17567:iconst_m1       
	// 9420 17568:ixor            
	// 9421 17569:iand            
	// 9422 17570:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9423 17573:aload_0         
	// 9424 17574:getfield        #12  <Field azh a>
	// 9425 17577:astore_1        
		abyte0.ce = ((azh) (abyte0)).a ^ a.ce;
	// 9426 17578:aload_1         
	// 9427 17579:aload_1         
	// 9428 17580:getfield        #96  <Field int azh.a>
	// 9429 17583:aload_0         
	// 9430 17584:getfield        #12  <Field azh a>
	// 9431 17587:getfield        #393 <Field int azh.ce>
	// 9432 17590:ixor            
	// 9433 17591:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9434 17594:aload_0         
	// 9435 17595:getfield        #12  <Field azh a>
	// 9436 17598:astore_1        
		abyte0.ce = ((azh) (abyte0)).bn & a.ce;
	// 9437 17599:aload_1         
	// 9438 17600:aload_1         
	// 9439 17601:getfield        #480 <Field int azh.bn>
	// 9440 17604:aload_0         
	// 9441 17605:getfield        #12  <Field azh a>
	// 9442 17608:getfield        #393 <Field int azh.ce>
	// 9443 17611:iand            
	// 9444 17612:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9445 17615:aload_0         
	// 9446 17616:getfield        #12  <Field azh a>
	// 9447 17619:astore_1        
		abyte0.a = ((azh) (abyte0)).bz | a.cf;
	// 9448 17620:aload_1         
	// 9449 17621:aload_1         
	// 9450 17622:getfield        #477 <Field int azh.bz>
	// 9451 17625:aload_0         
	// 9452 17626:getfield        #12  <Field azh a>
	// 9453 17629:getfield        #378 <Field int azh.cf>
	// 9454 17632:ior             
	// 9455 17633:putfield        #96  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 9456 17636:aload_0         
	// 9457 17637:getfield        #12  <Field azh a>
	// 9458 17640:astore_1        
		abyte0.bZ = ((azh) (abyte0)).a ^ a.bZ;
	// 9459 17641:aload_1         
	// 9460 17642:aload_1         
	// 9461 17643:getfield        #96  <Field int azh.a>
	// 9462 17646:aload_0         
	// 9463 17647:getfield        #12  <Field azh a>
	// 9464 17650:getfield        #303 <Field int azh.bZ>
	// 9465 17653:ixor            
	// 9466 17654:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9467 17657:aload_0         
	// 9468 17658:getfield        #12  <Field azh a>
	// 9469 17661:astore_1        
		abyte0.ak = ((azh) (abyte0)).bZ ^ a.ak;
	// 9470 17662:aload_1         
	// 9471 17663:aload_1         
	// 9472 17664:getfield        #303 <Field int azh.bZ>
	// 9473 17667:aload_0         
	// 9474 17668:getfield        #12  <Field azh a>
	// 9475 17671:getfield        #32  <Field int azh.ak>
	// 9476 17674:ixor            
	// 9477 17675:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 9478 17678:aload_0         
	// 9479 17679:getfield        #12  <Field azh a>
	// 9480 17682:astore_1        
		abyte0.ce = ((azh) (abyte0)).ak ^ a.ce;
	// 9481 17683:aload_1         
	// 9482 17684:aload_1         
	// 9483 17685:getfield        #32  <Field int azh.ak>
	// 9484 17688:aload_0         
	// 9485 17689:getfield        #12  <Field azh a>
	// 9486 17692:getfield        #393 <Field int azh.ce>
	// 9487 17695:ixor            
	// 9488 17696:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9489 17699:aload_0         
	// 9490 17700:getfield        #12  <Field azh a>
	// 9491 17703:astore_1        
		abyte0.cl = ((azh) (abyte0)).ce ^ a.cl;
	// 9492 17704:aload_1         
	// 9493 17705:aload_1         
	// 9494 17706:getfield        #393 <Field int azh.ce>
	// 9495 17709:aload_0         
	// 9496 17710:getfield        #12  <Field azh a>
	// 9497 17713:getfield        #387 <Field int azh.cl>
	// 9498 17716:ixor            
	// 9499 17717:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9500 17720:aload_0         
	// 9501 17721:getfield        #12  <Field azh a>
	// 9502 17724:astore_1        
		abyte0.y = ((azh) (abyte0)).cl ^ a.y;
	// 9503 17725:aload_1         
	// 9504 17726:aload_1         
	// 9505 17727:getfield        #387 <Field int azh.cl>
	// 9506 17730:aload_0         
	// 9507 17731:getfield        #12  <Field azh a>
	// 9508 17734:getfield        #108 <Field int azh.y>
	// 9509 17737:ixor            
	// 9510 17738:putfield        #108 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 9511 17741:aload_0         
	// 9512 17742:getfield        #12  <Field azh a>
	// 9513 17745:astore_1        
		abyte0.cl = ((azh) (abyte0)).y & ~a.aI;
	// 9514 17746:aload_1         
	// 9515 17747:aload_1         
	// 9516 17748:getfield        #108 <Field int azh.y>
	// 9517 17751:aload_0         
	// 9518 17752:getfield        #12  <Field azh a>
	// 9519 17755:getfield        #114 <Field int azh.aI>
	// 9520 17758:iconst_m1       
	// 9521 17759:ixor            
	// 9522 17760:iand            
	// 9523 17761:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9524 17764:aload_0         
	// 9525 17765:getfield        #12  <Field azh a>
	// 9526 17768:astore_1        
		abyte0.cl = ((azh) (abyte0)).y ^ a.cl;
	// 9527 17769:aload_1         
	// 9528 17770:aload_1         
	// 9529 17771:getfield        #108 <Field int azh.y>
	// 9530 17774:aload_0         
	// 9531 17775:getfield        #12  <Field azh a>
	// 9532 17778:getfield        #387 <Field int azh.cl>
	// 9533 17781:ixor            
	// 9534 17782:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9535 17785:aload_0         
	// 9536 17786:getfield        #12  <Field azh a>
	// 9537 17789:astore_1        
		abyte0.cl = ((azh) (abyte0)).ay | a.cl;
	// 9538 17790:aload_1         
	// 9539 17791:aload_1         
	// 9540 17792:getfield        #150 <Field int azh.ay>
	// 9541 17795:aload_0         
	// 9542 17796:getfield        #12  <Field azh a>
	// 9543 17799:getfield        #387 <Field int azh.cl>
	// 9544 17802:ior             
	// 9545 17803:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 9546 17806:aload_0         
	// 9547 17807:getfield        #12  <Field azh a>
	// 9548 17810:astore_1        
		abyte0.ce = ((azh) (abyte0)).y ^ a.c;
	// 9549 17811:aload_1         
	// 9550 17812:aload_1         
	// 9551 17813:getfield        #108 <Field int azh.y>
	// 9552 17816:aload_0         
	// 9553 17817:getfield        #12  <Field azh a>
	// 9554 17820:getfield        #276 <Field int azh.c>
	// 9555 17823:ixor            
	// 9556 17824:putfield        #393 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9557 17827:aload_0         
	// 9558 17828:getfield        #12  <Field azh a>
	// 9559 17831:astore_1        
		abyte0.ak = ((azh) (abyte0)).bF & a.ce;
	// 9560 17832:aload_1         
	// 9561 17833:aload_1         
	// 9562 17834:getfield        #462 <Field int azh.bF>
	// 9563 17837:aload_0         
	// 9564 17838:getfield        #12  <Field azh a>
	// 9565 17841:getfield        #393 <Field int azh.ce>
	// 9566 17844:iand            
	// 9567 17845:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 9568 17848:aload_0         
	// 9569 17849:getfield        #12  <Field azh a>
	// 9570 17852:astore_1        
		abyte0.ak = ((azh) (abyte0)).c ^ a.ak;
	// 9571 17853:aload_1         
	// 9572 17854:aload_1         
	// 9573 17855:getfield        #276 <Field int azh.c>
	// 9574 17858:aload_0         
	// 9575 17859:getfield        #12  <Field azh a>
	// 9576 17862:getfield        #32  <Field int azh.ak>
	// 9577 17865:ixor            
	// 9578 17866:putfield        #32  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 9579 17869:aload_0         
	// 9580 17870:getfield        #12  <Field azh a>
	// 9581 17873:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ce ^ a.bF;
	// 9582 17874:aload_1         
	// 9583 17875:aload_1         
	// 9584 17876:getfield        #393 <Field int azh.ce>
	// 9585 17879:aload_0         
	// 9586 17880:getfield        #12  <Field azh a>
	// 9587 17883:getfield        #462 <Field int azh.bF>
	// 9588 17886:ixor            
	// 9589 17887:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9590 17890:aload_0         
	// 9591 17891:getfield        #12  <Field azh a>
	// 9592 17894:astore_1        
		abyte0.bd = ((azh) (abyte0)).bT | a.ce;
	// 9593 17895:aload_1         
	// 9594 17896:aload_1         
	// 9595 17897:getfield        #86  <Field int azh.bT>
	// 9596 17900:aload_0         
	// 9597 17901:getfield        #12  <Field azh a>
	// 9598 17904:getfield        #393 <Field int azh.ce>
	// 9599 17907:ior             
	// 9600 17908:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9601 17911:aload_0         
	// 9602 17912:getfield        #12  <Field azh a>
	// 9603 17915:astore_1        
		abyte0.ag = ((azh) (abyte0)).bF & a.ce;
	// 9604 17916:aload_1         
	// 9605 17917:aload_1         
	// 9606 17918:getfield        #462 <Field int azh.bF>
	// 9607 17921:aload_0         
	// 9608 17922:getfield        #12  <Field azh a>
	// 9609 17925:getfield        #393 <Field int azh.ce>
	// 9610 17928:iand            
	// 9611 17929:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 9612 17932:aload_0         
	// 9613 17933:getfield        #12  <Field azh a>
	// 9614 17936:astore_1        
		abyte0.W = ((azh) (abyte0)).bF & a.y;
	// 9615 17937:aload_1         
	// 9616 17938:aload_1         
	// 9617 17939:getfield        #462 <Field int azh.bF>
	// 9618 17942:aload_0         
	// 9619 17943:getfield        #12  <Field azh a>
	// 9620 17946:getfield        #108 <Field int azh.y>
	// 9621 17949:iand            
	// 9622 17950:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9623 17953:aload_0         
	// 9624 17954:getfield        #12  <Field azh a>
	// 9625 17957:astore_1        
		abyte0.aZ = ((azh) (abyte0)).c | a.y;
	// 9626 17958:aload_1         
	// 9627 17959:aload_1         
	// 9628 17960:getfield        #276 <Field int azh.c>
	// 9629 17963:aload_0         
	// 9630 17964:getfield        #12  <Field azh a>
	// 9631 17967:getfield        #108 <Field int azh.y>
	// 9632 17970:ior             
	// 9633 17971:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9634 17974:aload_0         
	// 9635 17975:getfield        #12  <Field azh a>
	// 9636 17978:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bF & ~a.aZ;
	// 9637 17979:aload_1         
	// 9638 17980:aload_1         
	// 9639 17981:getfield        #462 <Field int azh.bF>
	// 9640 17984:aload_0         
	// 9641 17985:getfield        #12  <Field azh a>
	// 9642 17988:getfield        #297 <Field int azh.aZ>
	// 9643 17991:iconst_m1       
	// 9644 17992:ixor            
	// 9645 17993:iand            
	// 9646 17994:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9647 17997:aload_0         
	// 9648 17998:getfield        #12  <Field azh a>
	// 9649 18001:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & ~a.bT;
	// 9650 18002:aload_1         
	// 9651 18003:aload_1         
	// 9652 18004:getfield        #297 <Field int azh.aZ>
	// 9653 18007:aload_0         
	// 9654 18008:getfield        #12  <Field azh a>
	// 9655 18011:getfield        #86  <Field int azh.bT>
	// 9656 18014:iconst_m1       
	// 9657 18015:ixor            
	// 9658 18016:iand            
	// 9659 18017:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9660 18020:aload_0         
	// 9661 18021:getfield        #12  <Field azh a>
	// 9662 18024:astore_1        
		abyte0.ap = ((azh) (abyte0)).y & a.c;
	// 9663 18025:aload_1         
	// 9664 18026:aload_1         
	// 9665 18027:getfield        #108 <Field int azh.y>
	// 9666 18030:aload_0         
	// 9667 18031:getfield        #12  <Field azh a>
	// 9668 18034:getfield        #276 <Field int azh.c>
	// 9669 18037:iand            
	// 9670 18038:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9671 18041:aload_0         
	// 9672 18042:getfield        #12  <Field azh a>
	// 9673 18045:astore_1        
		abyte0.bA = ((azh) (abyte0)).bF & a.ap;
	// 9674 18046:aload_1         
	// 9675 18047:aload_1         
	// 9676 18048:getfield        #462 <Field int azh.bF>
	// 9677 18051:aload_0         
	// 9678 18052:getfield        #12  <Field azh a>
	// 9679 18055:getfield        #369 <Field int azh.ap>
	// 9680 18058:iand            
	// 9681 18059:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 9682 18062:aload_0         
	// 9683 18063:getfield        #12  <Field azh a>
	// 9684 18066:astore_1        
		abyte0.bA = ((azh) (abyte0)).ap ^ a.bA;
	// 9685 18067:aload_1         
	// 9686 18068:aload_1         
	// 9687 18069:getfield        #369 <Field int azh.ap>
	// 9688 18072:aload_0         
	// 9689 18073:getfield        #12  <Field azh a>
	// 9690 18076:getfield        #441 <Field int azh.bA>
	// 9691 18079:ixor            
	// 9692 18080:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 9693 18083:aload_0         
	// 9694 18084:getfield        #12  <Field azh a>
	// 9695 18087:astore_1        
		abyte0.bd = ((azh) (abyte0)).bA ^ a.bd;
	// 9696 18088:aload_1         
	// 9697 18089:aload_1         
	// 9698 18090:getfield        #441 <Field int azh.bA>
	// 9699 18093:aload_0         
	// 9700 18094:getfield        #12  <Field azh a>
	// 9701 18097:getfield        #459 <Field int azh.bd>
	// 9702 18100:ixor            
	// 9703 18101:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9704 18104:aload_0         
	// 9705 18105:getfield        #12  <Field azh a>
	// 9706 18108:astore_1        
		abyte0.bd = ((azh) (abyte0)).O & ~a.bd;
	// 9707 18109:aload_1         
	// 9708 18110:aload_1         
	// 9709 18111:getfield        #342 <Field int azh.O>
	// 9710 18114:aload_0         
	// 9711 18115:getfield        #12  <Field azh a>
	// 9712 18118:getfield        #459 <Field int azh.bd>
	// 9713 18121:iconst_m1       
	// 9714 18122:ixor            
	// 9715 18123:iand            
	// 9716 18124:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9717 18127:aload_0         
	// 9718 18128:getfield        #12  <Field azh a>
	// 9719 18131:astore_1        
		abyte0.bd = ((azh) (abyte0)).G | a.bd;
	// 9720 18132:aload_1         
	// 9721 18133:aload_1         
	// 9722 18134:getfield        #99  <Field int azh.G>
	// 9723 18137:aload_0         
	// 9724 18138:getfield        #12  <Field azh a>
	// 9725 18141:getfield        #459 <Field int azh.bd>
	// 9726 18144:ior             
	// 9727 18145:putfield        #459 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9728 18148:aload_0         
	// 9729 18149:getfield        #12  <Field azh a>
	// 9730 18152:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA & ~a.bT;
	// 9731 18153:aload_1         
	// 9732 18154:aload_1         
	// 9733 18155:getfield        #441 <Field int azh.bA>
	// 9734 18158:aload_0         
	// 9735 18159:getfield        #12  <Field azh a>
	// 9736 18162:getfield        #86  <Field int azh.bT>
	// 9737 18165:iconst_m1       
	// 9738 18166:ixor            
	// 9739 18167:iand            
	// 9740 18168:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 9741 18171:aload_0         
	// 9742 18172:getfield        #12  <Field azh a>
	// 9743 18175:astore_1        
		abyte0.cc = ((azh) (abyte0)).bT | a.ap;
	// 9744 18176:aload_1         
	// 9745 18177:aload_1         
	// 9746 18178:getfield        #86  <Field int azh.bT>
	// 9747 18181:aload_0         
	// 9748 18182:getfield        #12  <Field azh a>
	// 9749 18185:getfield        #369 <Field int azh.ap>
	// 9750 18188:ior             
	// 9751 18189:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9752 18192:aload_0         
	// 9753 18193:getfield        #12  <Field azh a>
	// 9754 18196:astore_1        
		abyte0.cc = ((azh) (abyte0)).bZ ^ a.cc;
	// 9755 18197:aload_1         
	// 9756 18198:aload_1         
	// 9757 18199:getfield        #303 <Field int azh.bZ>
	// 9758 18202:aload_0         
	// 9759 18203:getfield        #12  <Field azh a>
	// 9760 18206:getfield        #444 <Field int azh.cc>
	// 9761 18209:ixor            
	// 9762 18210:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9763 18213:aload_0         
	// 9764 18214:getfield        #12  <Field azh a>
	// 9765 18217:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & ~a.bT;
	// 9766 18218:aload_1         
	// 9767 18219:aload_1         
	// 9768 18220:getfield        #369 <Field int azh.ap>
	// 9769 18223:aload_0         
	// 9770 18224:getfield        #12  <Field azh a>
	// 9771 18227:getfield        #86  <Field int azh.bT>
	// 9772 18230:iconst_m1       
	// 9773 18231:ixor            
	// 9774 18232:iand            
	// 9775 18233:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9776 18236:aload_0         
	// 9777 18237:getfield        #12  <Field azh a>
	// 9778 18240:astore_1        
		abyte0.ap = ((azh) (abyte0)).ak ^ a.ap;
	// 9779 18241:aload_1         
	// 9780 18242:aload_1         
	// 9781 18243:getfield        #32  <Field int azh.ak>
	// 9782 18246:aload_0         
	// 9783 18247:getfield        #12  <Field azh a>
	// 9784 18250:getfield        #369 <Field int azh.ap>
	// 9785 18253:ixor            
	// 9786 18254:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9787 18257:aload_0         
	// 9788 18258:getfield        #12  <Field azh a>
	// 9789 18261:astore_1        
		abyte0.ap = ((azh) (abyte0)).O & ~a.ap;
	// 9790 18262:aload_1         
	// 9791 18263:aload_1         
	// 9792 18264:getfield        #342 <Field int azh.O>
	// 9793 18267:aload_0         
	// 9794 18268:getfield        #12  <Field azh a>
	// 9795 18271:getfield        #369 <Field int azh.ap>
	// 9796 18274:iconst_m1       
	// 9797 18275:ixor            
	// 9798 18276:iand            
	// 9799 18277:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9800 18280:aload_0         
	// 9801 18281:getfield        #12  <Field azh a>
	// 9802 18284:astore_1        
		abyte0.bZ = ((azh) (abyte0)).y & ~a.cd;
	// 9803 18285:aload_1         
	// 9804 18286:aload_1         
	// 9805 18287:getfield        #108 <Field int azh.y>
	// 9806 18290:aload_0         
	// 9807 18291:getfield        #12  <Field azh a>
	// 9808 18294:getfield        #141 <Field int azh.cd>
	// 9809 18297:iconst_m1       
	// 9810 18298:ixor            
	// 9811 18299:iand            
	// 9812 18300:putfield        #303 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9813 18303:aload_0         
	// 9814 18304:getfield        #12  <Field azh a>
	// 9815 18307:astore_1        
		abyte0.bX = ((azh) (abyte0)).bZ ^ a.aI;
	// 9816 18308:aload_1         
	// 9817 18309:aload_1         
	// 9818 18310:getfield        #303 <Field int azh.bZ>
	// 9819 18313:aload_0         
	// 9820 18314:getfield        #12  <Field azh a>
	// 9821 18317:getfield        #114 <Field int azh.aI>
	// 9822 18320:ixor            
	// 9823 18321:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9824 18324:aload_0         
	// 9825 18325:getfield        #12  <Field azh a>
	// 9826 18328:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX & ~a.ay;
	// 9827 18329:aload_1         
	// 9828 18330:aload_1         
	// 9829 18331:getfield        #405 <Field int azh.bX>
	// 9830 18334:aload_0         
	// 9831 18335:getfield        #12  <Field azh a>
	// 9832 18338:getfield        #150 <Field int azh.ay>
	// 9833 18341:iconst_m1       
	// 9834 18342:ixor            
	// 9835 18343:iand            
	// 9836 18344:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9837 18347:aload_0         
	// 9838 18348:getfield        #12  <Field azh a>
	// 9839 18351:astore_1        
		abyte0.C = ((azh) (abyte0)).aI | a.bZ;
	// 9840 18352:aload_1         
	// 9841 18353:aload_1         
	// 9842 18354:getfield        #114 <Field int azh.aI>
	// 9843 18357:aload_0         
	// 9844 18358:getfield        #12  <Field azh a>
	// 9845 18361:getfield        #303 <Field int azh.bZ>
	// 9846 18364:ior             
	// 9847 18365:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 9848 18368:aload_0         
	// 9849 18369:getfield        #12  <Field azh a>
	// 9850 18372:astore_1        
		abyte0.C = ((azh) (abyte0)).bZ ^ a.C;
	// 9851 18373:aload_1         
	// 9852 18374:aload_1         
	// 9853 18375:getfield        #303 <Field int azh.bZ>
	// 9854 18378:aload_0         
	// 9855 18379:getfield        #12  <Field azh a>
	// 9856 18382:getfield        #420 <Field int azh.C>
	// 9857 18385:ixor            
	// 9858 18386:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 9859 18389:aload_0         
	// 9860 18390:getfield        #12  <Field azh a>
	// 9861 18393:astore_1        
		abyte0.bX = ((azh) (abyte0)).C ^ a.bX;
	// 9862 18394:aload_1         
	// 9863 18395:aload_1         
	// 9864 18396:getfield        #420 <Field int azh.C>
	// 9865 18399:aload_0         
	// 9866 18400:getfield        #12  <Field azh a>
	// 9867 18403:getfield        #405 <Field int azh.bX>
	// 9868 18406:ixor            
	// 9869 18407:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9870 18410:aload_0         
	// 9871 18411:getfield        #12  <Field azh a>
	// 9872 18414:astore_1        
		abyte0.C = ((azh) (abyte0)).bZ & ~a.aI;
	// 9873 18415:aload_1         
	// 9874 18416:aload_1         
	// 9875 18417:getfield        #303 <Field int azh.bZ>
	// 9876 18420:aload_0         
	// 9877 18421:getfield        #12  <Field azh a>
	// 9878 18424:getfield        #114 <Field int azh.aI>
	// 9879 18427:iconst_m1       
	// 9880 18428:ixor            
	// 9881 18429:iand            
	// 9882 18430:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 9883 18433:aload_0         
	// 9884 18434:getfield        #12  <Field azh a>
	// 9885 18437:astore_1        
		abyte0.aD = ((azh) (abyte0)).cd | a.bZ;
	// 9886 18438:aload_1         
	// 9887 18439:aload_1         
	// 9888 18440:getfield        #141 <Field int azh.cd>
	// 9889 18443:aload_0         
	// 9890 18444:getfield        #12  <Field azh a>
	// 9891 18447:getfield        #303 <Field int azh.bZ>
	// 9892 18450:ior             
	// 9893 18451:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 9894 18454:aload_0         
	// 9895 18455:getfield        #12  <Field azh a>
	// 9896 18458:astore_1        
		abyte0.am = ((azh) (abyte0)).aD & ~a.aI;
	// 9897 18459:aload_1         
	// 9898 18460:aload_1         
	// 9899 18461:getfield        #330 <Field int azh.aD>
	// 9900 18464:aload_0         
	// 9901 18465:getfield        #12  <Field azh a>
	// 9902 18468:getfield        #114 <Field int azh.aI>
	// 9903 18471:iconst_m1       
	// 9904 18472:ixor            
	// 9905 18473:iand            
	// 9906 18474:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9907 18477:aload_0         
	// 9908 18478:getfield        #12  <Field azh a>
	// 9909 18481:astore_1        
		abyte0.s = ((azh) (abyte0)).aD ^ a.aI;
	// 9910 18482:aload_1         
	// 9911 18483:aload_1         
	// 9912 18484:getfield        #330 <Field int azh.aD>
	// 9913 18487:aload_0         
	// 9914 18488:getfield        #12  <Field azh a>
	// 9915 18491:getfield        #114 <Field int azh.aI>
	// 9916 18494:ixor            
	// 9917 18495:putfield        #483 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9918 18498:aload_0         
	// 9919 18499:getfield        #12  <Field azh a>
	// 9920 18502:astore_1        
		abyte0.bp = ((azh) (abyte0)).ay | a.s;
	// 9921 18503:aload_1         
	// 9922 18504:aload_1         
	// 9923 18505:getfield        #150 <Field int azh.ay>
	// 9924 18508:aload_0         
	// 9925 18509:getfield        #12  <Field azh a>
	// 9926 18512:getfield        #483 <Field int azh.s>
	// 9927 18515:ior             
	// 9928 18516:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 9929 18519:aload_0         
	// 9930 18520:getfield        #12  <Field azh a>
	// 9931 18523:astore_1        
		abyte0.bp = ((azh) (abyte0)).am ^ a.bp;
	// 9932 18524:aload_1         
	// 9933 18525:aload_1         
	// 9934 18526:getfield        #219 <Field int azh.am>
	// 9935 18529:aload_0         
	// 9936 18530:getfield        #12  <Field azh a>
	// 9937 18533:getfield        #486 <Field int azh.bp>
	// 9938 18536:ixor            
	// 9939 18537:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 9940 18540:aload_0         
	// 9941 18541:getfield        #12  <Field azh a>
	// 9942 18544:astore_1        
		abyte0.bp = ((azh) (abyte0)).bp & ~a.G;
	// 9943 18545:aload_1         
	// 9944 18546:aload_1         
	// 9945 18547:getfield        #486 <Field int azh.bp>
	// 9946 18550:aload_0         
	// 9947 18551:getfield        #12  <Field azh a>
	// 9948 18554:getfield        #99  <Field int azh.G>
	// 9949 18557:iconst_m1       
	// 9950 18558:ixor            
	// 9951 18559:iand            
	// 9952 18560:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 9953 18563:aload_0         
	// 9954 18564:getfield        #12  <Field azh a>
	// 9955 18567:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD & ~a.aI;
	// 9956 18568:aload_1         
	// 9957 18569:aload_1         
	// 9958 18570:getfield        #330 <Field int azh.aD>
	// 9959 18573:aload_0         
	// 9960 18574:getfield        #12  <Field azh a>
	// 9961 18577:getfield        #114 <Field int azh.aI>
	// 9962 18580:iconst_m1       
	// 9963 18581:ixor            
	// 9964 18582:iand            
	// 9965 18583:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 9966 18586:aload_0         
	// 9967 18587:getfield        #12  <Field azh a>
	// 9968 18590:astore_1        
		abyte0.bK = ((azh) (abyte0)).y & ~a.aI;
	// 9969 18591:aload_1         
	// 9970 18592:aload_1         
	// 9971 18593:getfield        #108 <Field int azh.y>
	// 9972 18596:aload_0         
	// 9973 18597:getfield        #12  <Field azh a>
	// 9974 18600:getfield        #114 <Field int azh.aI>
	// 9975 18603:iconst_m1       
	// 9976 18604:ixor            
	// 9977 18605:iand            
	// 9978 18606:putfield        #489 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 9979 18609:aload_0         
	// 9980 18610:getfield        #12  <Field azh a>
	// 9981 18613:astore_1        
		abyte0.aR = ((azh) (abyte0)).aI | a.y;
	// 9982 18614:aload_1         
	// 9983 18615:aload_1         
	// 9984 18616:getfield        #114 <Field int azh.aI>
	// 9985 18619:aload_0         
	// 9986 18620:getfield        #12  <Field azh a>
	// 9987 18623:getfield        #108 <Field int azh.y>
	// 9988 18626:ior             
	// 9989 18627:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 9990 18630:aload_0         
	// 9991 18631:getfield        #12  <Field azh a>
	// 9992 18634:astore_1        
		abyte0.aT = ((azh) (abyte0)).y & ~a.aI;
	// 9993 18635:aload_1         
	// 9994 18636:aload_1         
	// 9995 18637:getfield        #108 <Field int azh.y>
	// 9996 18640:aload_0         
	// 9997 18641:getfield        #12  <Field azh a>
	// 9998 18644:getfield        #114 <Field int azh.aI>
	// 9999 18647:iconst_m1       
	// 10000 18648:ixor            
	// 10001 18649:iand            
	// 10002 18650:putfield        #495 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10003 18653:aload_0         
	// 10004 18654:getfield        #12  <Field azh a>
	// 10005 18657:astore_1        
		abyte0.aw = ((azh) (abyte0)).c & ~a.y;
	// 10006 18658:aload_1         
	// 10007 18659:aload_1         
	// 10008 18660:getfield        #276 <Field int azh.c>
	// 10009 18663:aload_0         
	// 10010 18664:getfield        #12  <Field azh a>
	// 10011 18667:getfield        #108 <Field int azh.y>
	// 10012 18670:iconst_m1       
	// 10013 18671:ixor            
	// 10014 18672:iand            
	// 10015 18673:putfield        #498 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10016 18676:aload_0         
	// 10017 18677:getfield        #12  <Field azh a>
	// 10018 18680:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aw ^ a.aZ;
	// 10019 18681:aload_1         
	// 10020 18682:aload_1         
	// 10021 18683:getfield        #498 <Field int azh.aw>
	// 10022 18686:aload_0         
	// 10023 18687:getfield        #12  <Field azh a>
	// 10024 18690:getfield        #297 <Field int azh.aZ>
	// 10025 18693:ixor            
	// 10026 18694:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 10027 18697:aload_0         
	// 10028 18698:getfield        #12  <Field azh a>
	// 10029 18701:astore_1        
		abyte0.ap = ((azh) (abyte0)).aZ ^ a.ap;
	// 10030 18702:aload_1         
	// 10031 18703:aload_1         
	// 10032 18704:getfield        #297 <Field int azh.aZ>
	// 10033 18707:aload_0         
	// 10034 18708:getfield        #12  <Field azh a>
	// 10035 18711:getfield        #369 <Field int azh.ap>
	// 10036 18714:ixor            
	// 10037 18715:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10038 18718:aload_0         
	// 10039 18719:getfield        #12  <Field azh a>
	// 10040 18722:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & ~a.G;
	// 10041 18723:aload_1         
	// 10042 18724:aload_1         
	// 10043 18725:getfield        #369 <Field int azh.ap>
	// 10044 18728:aload_0         
	// 10045 18729:getfield        #12  <Field azh a>
	// 10046 18732:getfield        #99  <Field int azh.G>
	// 10047 18735:iconst_m1       
	// 10048 18736:ixor            
	// 10049 18737:iand            
	// 10050 18738:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10051 18741:aload_0         
	// 10052 18742:getfield        #12  <Field azh a>
	// 10053 18745:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bF & a.aw;
	// 10054 18746:aload_1         
	// 10055 18747:aload_1         
	// 10056 18748:getfield        #462 <Field int azh.bF>
	// 10057 18751:aload_0         
	// 10058 18752:getfield        #12  <Field azh a>
	// 10059 18755:getfield        #498 <Field int azh.aw>
	// 10060 18758:iand            
	// 10061 18759:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 10062 18762:aload_0         
	// 10063 18763:getfield        #12  <Field azh a>
	// 10064 18766:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & ~a.bT;
	// 10065 18767:aload_1         
	// 10066 18768:aload_1         
	// 10067 18769:getfield        #297 <Field int azh.aZ>
	// 10068 18772:aload_0         
	// 10069 18773:getfield        #12  <Field azh a>
	// 10070 18776:getfield        #86  <Field int azh.bT>
	// 10071 18779:iconst_m1       
	// 10072 18780:ixor            
	// 10073 18781:iand            
	// 10074 18782:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 10075 18785:aload_0         
	// 10076 18786:getfield        #12  <Field azh a>
	// 10077 18789:astore_1        
		abyte0.bq = ((azh) (abyte0)).bT & a.aw;
	// 10078 18790:aload_1         
	// 10079 18791:aload_1         
	// 10080 18792:getfield        #86  <Field int azh.bT>
	// 10081 18795:aload_0         
	// 10082 18796:getfield        #12  <Field azh a>
	// 10083 18799:getfield        #498 <Field int azh.aw>
	// 10084 18802:iand            
	// 10085 18803:putfield        #501 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 10086 18806:aload_0         
	// 10087 18807:getfield        #12  <Field azh a>
	// 10088 18810:astore_1        
		abyte0.aw = ((azh) (abyte0)).c & ~a.aw;
	// 10089 18811:aload_1         
	// 10090 18812:aload_1         
	// 10091 18813:getfield        #276 <Field int azh.c>
	// 10092 18816:aload_0         
	// 10093 18817:getfield        #12  <Field azh a>
	// 10094 18820:getfield        #498 <Field int azh.aw>
	// 10095 18823:iconst_m1       
	// 10096 18824:ixor            
	// 10097 18825:iand            
	// 10098 18826:putfield        #498 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10099 18829:aload_0         
	// 10100 18830:getfield        #12  <Field azh a>
	// 10101 18833:astore_1        
		abyte0.ag = ((azh) (abyte0)).aw ^ a.ag;
	// 10102 18834:aload_1         
	// 10103 18835:aload_1         
	// 10104 18836:getfield        #498 <Field int azh.aw>
	// 10105 18839:aload_0         
	// 10106 18840:getfield        #12  <Field azh a>
	// 10107 18843:getfield        #426 <Field int azh.ag>
	// 10108 18846:ixor            
	// 10109 18847:putfield        #426 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10110 18850:aload_0         
	// 10111 18851:getfield        #12  <Field azh a>
	// 10112 18854:astore_1        
		abyte0.z = ((azh) (abyte0)).bF & ~a.aw;
	// 10113 18855:aload_1         
	// 10114 18856:aload_1         
	// 10115 18857:getfield        #462 <Field int azh.bF>
	// 10116 18860:aload_0         
	// 10117 18861:getfield        #12  <Field azh a>
	// 10118 18864:getfield        #498 <Field int azh.aw>
	// 10119 18867:iconst_m1       
	// 10120 18868:ixor            
	// 10121 18869:iand            
	// 10122 18870:putfield        #504 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 10123 18873:aload_0         
	// 10124 18874:getfield        #12  <Field azh a>
	// 10125 18877:astore_1        
		abyte0.z = ((azh) (abyte0)).ce ^ a.z;
	// 10126 18878:aload_1         
	// 10127 18879:aload_1         
	// 10128 18880:getfield        #393 <Field int azh.ce>
	// 10129 18883:aload_0         
	// 10130 18884:getfield        #12  <Field azh a>
	// 10131 18887:getfield        #504 <Field int azh.z>
	// 10132 18890:ixor            
	// 10133 18891:putfield        #504 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 10134 18894:aload_0         
	// 10135 18895:getfield        #12  <Field azh a>
	// 10136 18898:astore_1        
		abyte0.z = ((azh) (abyte0)).bT | a.z;
	// 10137 18899:aload_1         
	// 10138 18900:aload_1         
	// 10139 18901:getfield        #86  <Field int azh.bT>
	// 10140 18904:aload_0         
	// 10141 18905:getfield        #12  <Field azh a>
	// 10142 18908:getfield        #504 <Field int azh.z>
	// 10143 18911:ior             
	// 10144 18912:putfield        #504 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 10145 18915:aload_0         
	// 10146 18916:getfield        #12  <Field azh a>
	// 10147 18919:astore_1        
		abyte0.W = ((azh) (abyte0)).aw ^ a.W;
	// 10148 18920:aload_1         
	// 10149 18921:aload_1         
	// 10150 18922:getfield        #498 <Field int azh.aw>
	// 10151 18925:aload_0         
	// 10152 18926:getfield        #12  <Field azh a>
	// 10153 18929:getfield        #249 <Field int azh.W>
	// 10154 18932:ixor            
	// 10155 18933:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 10156 18936:aload_0         
	// 10157 18937:getfield        #12  <Field azh a>
	// 10158 18940:astore_1        
		abyte0.aw = ((azh) (abyte0)).bF & ~a.y;
	// 10159 18941:aload_1         
	// 10160 18942:aload_1         
	// 10161 18943:getfield        #462 <Field int azh.bF>
	// 10162 18946:aload_0         
	// 10163 18947:getfield        #12  <Field azh a>
	// 10164 18950:getfield        #108 <Field int azh.y>
	// 10165 18953:iconst_m1       
	// 10166 18954:ixor            
	// 10167 18955:iand            
	// 10168 18956:putfield        #498 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10169 18959:aload_0         
	// 10170 18960:getfield        #12  <Field azh a>
	// 10171 18963:astore_1        
		abyte0.bA = ((azh) (abyte0)).aw ^ a.bA;
	// 10172 18964:aload_1         
	// 10173 18965:aload_1         
	// 10174 18966:getfield        #498 <Field int azh.aw>
	// 10175 18969:aload_0         
	// 10176 18970:getfield        #12  <Field azh a>
	// 10177 18973:getfield        #441 <Field int azh.bA>
	// 10178 18976:ixor            
	// 10179 18977:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10180 18980:aload_0         
	// 10181 18981:getfield        #12  <Field azh a>
	// 10182 18984:astore_1        
		abyte0.bA = ((azh) (abyte0)).O & ~a.bA;
	// 10183 18985:aload_1         
	// 10184 18986:aload_1         
	// 10185 18987:getfield        #342 <Field int azh.O>
	// 10186 18990:aload_0         
	// 10187 18991:getfield        #12  <Field azh a>
	// 10188 18994:getfield        #441 <Field int azh.bA>
	// 10189 18997:iconst_m1       
	// 10190 18998:ixor            
	// 10191 18999:iand            
	// 10192 19000:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10193 19003:aload_0         
	// 10194 19004:getfield        #12  <Field azh a>
	// 10195 19007:astore_1        
		abyte0.bA = ((azh) (abyte0)).cc ^ a.bA;
	// 10196 19008:aload_1         
	// 10197 19009:aload_1         
	// 10198 19010:getfield        #444 <Field int azh.cc>
	// 10199 19013:aload_0         
	// 10200 19014:getfield        #12  <Field azh a>
	// 10201 19017:getfield        #441 <Field int azh.bA>
	// 10202 19020:ixor            
	// 10203 19021:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10204 19024:aload_0         
	// 10205 19025:getfield        #12  <Field azh a>
	// 10206 19028:astore_1        
		abyte0.ap = ((azh) (abyte0)).bA ^ a.ap;
	// 10207 19029:aload_1         
	// 10208 19030:aload_1         
	// 10209 19031:getfield        #441 <Field int azh.bA>
	// 10210 19034:aload_0         
	// 10211 19035:getfield        #12  <Field azh a>
	// 10212 19038:getfield        #369 <Field int azh.ap>
	// 10213 19041:ixor            
	// 10214 19042:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10215 19045:aload_0         
	// 10216 19046:getfield        #12  <Field azh a>
	// 10217 19049:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap ^ a.t;
	// 10218 19050:aload_1         
	// 10219 19051:aload_1         
	// 10220 19052:getfield        #369 <Field int azh.ap>
	// 10221 19055:aload_0         
	// 10222 19056:getfield        #12  <Field azh a>
	// 10223 19059:getfield        #381 <Field int azh.t>
	// 10224 19062:ixor            
	// 10225 19063:putfield        #369 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10226 19066:aload_0         
	// 10227 19067:getfield        #12  <Field azh a>
	// 10228 19070:astore_1        
		abyte0.bA = ((azh) (abyte0)).ap & ~a.bt;
	// 10229 19071:aload_1         
	// 10230 19072:aload_1         
	// 10231 19073:getfield        #369 <Field int azh.ap>
	// 10232 19076:aload_0         
	// 10233 19077:getfield        #12  <Field azh a>
	// 10234 19080:getfield        #432 <Field int azh.bt>
	// 10235 19083:iconst_m1       
	// 10236 19084:ixor            
	// 10237 19085:iand            
	// 10238 19086:putfield        #441 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10239 19089:aload_0         
	// 10240 19090:getfield        #12  <Field azh a>
	// 10241 19093:astore_1        
		abyte0.cc = ((azh) (abyte0)).ap & a.bt;
	// 10242 19094:aload_1         
	// 10243 19095:aload_1         
	// 10244 19096:getfield        #369 <Field int azh.ap>
	// 10245 19099:aload_0         
	// 10246 19100:getfield        #12  <Field azh a>
	// 10247 19103:getfield        #432 <Field int azh.bt>
	// 10248 19106:iand            
	// 10249 19107:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10250 19110:aload_0         
	// 10251 19111:getfield        #12  <Field azh a>
	// 10252 19114:astore_1        
		abyte0.cc = ((azh) (abyte0)).bt ^ a.cc;
	// 10253 19115:aload_1         
	// 10254 19116:aload_1         
	// 10255 19117:getfield        #432 <Field int azh.bt>
	// 10256 19120:aload_0         
	// 10257 19121:getfield        #12  <Field azh a>
	// 10258 19124:getfield        #444 <Field int azh.cc>
	// 10259 19127:ixor            
	// 10260 19128:putfield        #444 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10261 19131:aload_0         
	// 10262 19132:getfield        #12  <Field azh a>
	// 10263 19135:astore_1        
		abyte0.aw = ((azh) (abyte0)).ap & a.bt;
	// 10264 19136:aload_1         
	// 10265 19137:aload_1         
	// 10266 19138:getfield        #369 <Field int azh.ap>
	// 10267 19141:aload_0         
	// 10268 19142:getfield        #12  <Field azh a>
	// 10269 19145:getfield        #432 <Field int azh.bt>
	// 10270 19148:iand            
	// 10271 19149:putfield        #498 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10272 19152:aload_0         
	// 10273 19153:getfield        #12  <Field azh a>
	// 10274 19156:astore_1        
		abyte0.bG = ((azh) (abyte0)).ap & ~a.bt;
	// 10275 19157:aload_1         
	// 10276 19158:aload_1         
	// 10277 19159:getfield        #369 <Field int azh.ap>
	// 10278 19162:aload_0         
	// 10279 19163:getfield        #12  <Field azh a>
	// 10280 19166:getfield        #432 <Field int azh.bt>
	// 10281 19169:iconst_m1       
	// 10282 19170:ixor            
	// 10283 19171:iand            
	// 10284 19172:putfield        #507 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 10285 19175:aload_0         
	// 10286 19176:getfield        #12  <Field azh a>
	// 10287 19179:astore_1        
		abyte0.bG = ((azh) (abyte0)).bt ^ a.bG;
	// 10288 19180:aload_1         
	// 10289 19181:aload_1         
	// 10290 19182:getfield        #432 <Field int azh.bt>
	// 10291 19185:aload_0         
	// 10292 19186:getfield        #12  <Field azh a>
	// 10293 19189:getfield        #507 <Field int azh.bG>
	// 10294 19192:ixor            
	// 10295 19193:putfield        #507 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 10296 19196:aload_0         
	// 10297 19197:getfield        #12  <Field azh a>
	// 10298 19200:astore_1        
		abyte0.cp = ((azh) (abyte0)).ap & a.bt;
	// 10299 19201:aload_1         
	// 10300 19202:aload_1         
	// 10301 19203:getfield        #369 <Field int azh.ap>
	// 10302 19206:aload_0         
	// 10303 19207:getfield        #12  <Field azh a>
	// 10304 19210:getfield        #432 <Field int azh.bt>
	// 10305 19213:iand            
	// 10306 19214:putfield        #510 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10307 19217:aload_0         
	// 10308 19218:getfield        #12  <Field azh a>
	// 10309 19221:astore_1        
		abyte0.aF = ((azh) (abyte0)).y ^ a.cd;
	// 10310 19222:aload_1         
	// 10311 19223:aload_1         
	// 10312 19224:getfield        #108 <Field int azh.y>
	// 10313 19227:aload_0         
	// 10314 19228:getfield        #12  <Field azh a>
	// 10315 19231:getfield        #141 <Field int azh.cd>
	// 10316 19234:ixor            
	// 10317 19235:putfield        #513 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 10318 19238:aload_0         
	// 10319 19239:getfield        #12  <Field azh a>
	// 10320 19242:astore_1        
		abyte0.aT = ((azh) (abyte0)).aF ^ a.aT;
	// 10321 19243:aload_1         
	// 10322 19244:aload_1         
	// 10323 19245:getfield        #513 <Field int azh.aF>
	// 10324 19248:aload_0         
	// 10325 19249:getfield        #12  <Field azh a>
	// 10326 19252:getfield        #495 <Field int azh.aT>
	// 10327 19255:ixor            
	// 10328 19256:putfield        #495 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10329 19259:aload_0         
	// 10330 19260:getfield        #12  <Field azh a>
	// 10331 19263:astore_1        
		abyte0.co = ((azh) (abyte0)).aT & ~a.ay;
	// 10332 19264:aload_1         
	// 10333 19265:aload_1         
	// 10334 19266:getfield        #495 <Field int azh.aT>
	// 10335 19269:aload_0         
	// 10336 19270:getfield        #12  <Field azh a>
	// 10337 19273:getfield        #150 <Field int azh.ay>
	// 10338 19276:iconst_m1       
	// 10339 19277:ixor            
	// 10340 19278:iand            
	// 10341 19279:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 10342 19282:aload_0         
	// 10343 19283:getfield        #12  <Field azh a>
	// 10344 19286:astore_1        
		abyte0.co = ((azh) (abyte0)).G | a.co;
	// 10345 19287:aload_1         
	// 10346 19288:aload_1         
	// 10347 19289:getfield        #99  <Field int azh.G>
	// 10348 19292:aload_0         
	// 10349 19293:getfield        #12  <Field azh a>
	// 10350 19296:getfield        #516 <Field int azh.co>
	// 10351 19299:ior             
	// 10352 19300:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 10353 19303:aload_0         
	// 10354 19304:getfield        #12  <Field azh a>
	// 10355 19307:astore_1        
		abyte0.aF = ((azh) (abyte0)).aF ^ a.aI;
	// 10356 19308:aload_1         
	// 10357 19309:aload_1         
	// 10358 19310:getfield        #513 <Field int azh.aF>
	// 10359 19313:aload_0         
	// 10360 19314:getfield        #12  <Field azh a>
	// 10361 19317:getfield        #114 <Field int azh.aI>
	// 10362 19320:ixor            
	// 10363 19321:putfield        #513 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 10364 19324:aload_0         
	// 10365 19325:getfield        #12  <Field azh a>
	// 10366 19328:astore_1        
		abyte0.X = ((azh) (abyte0)).aF ^ a.X;
	// 10367 19329:aload_1         
	// 10368 19330:aload_1         
	// 10369 19331:getfield        #513 <Field int azh.aF>
	// 10370 19334:aload_0         
	// 10371 19335:getfield        #12  <Field azh a>
	// 10372 19338:getfield        #123 <Field int azh.X>
	// 10373 19341:ixor            
	// 10374 19342:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 10375 19345:aload_0         
	// 10376 19346:getfield        #12  <Field azh a>
	// 10377 19349:astore_1        
		abyte0.aF = ((azh) (abyte0)).cd & ~a.y;
	// 10378 19350:aload_1         
	// 10379 19351:aload_1         
	// 10380 19352:getfield        #141 <Field int azh.cd>
	// 10381 19355:aload_0         
	// 10382 19356:getfield        #12  <Field azh a>
	// 10383 19359:getfield        #108 <Field int azh.y>
	// 10384 19362:iconst_m1       
	// 10385 19363:ixor            
	// 10386 19364:iand            
	// 10387 19365:putfield        #513 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 10388 19368:aload_0         
	// 10389 19369:getfield        #12  <Field azh a>
	// 10390 19372:astore_1        
		abyte0.cm = ((azh) (abyte0)).aI | a.aF;
	// 10391 19373:aload_1         
	// 10392 19374:aload_1         
	// 10393 19375:getfield        #114 <Field int azh.aI>
	// 10394 19378:aload_0         
	// 10395 19379:getfield        #12  <Field azh a>
	// 10396 19382:getfield        #513 <Field int azh.aF>
	// 10397 19385:ior             
	// 10398 19386:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10399 19389:aload_0         
	// 10400 19390:getfield        #12  <Field azh a>
	// 10401 19393:astore_1        
		abyte0.aP = ((azh) (abyte0)).cm ^ a.aP;
	// 10402 19394:aload_1         
	// 10403 19395:aload_1         
	// 10404 19396:getfield        #519 <Field int azh.cm>
	// 10405 19399:aload_0         
	// 10406 19400:getfield        #12  <Field azh a>
	// 10407 19403:getfield        #279 <Field int azh.aP>
	// 10408 19406:ixor            
	// 10409 19407:putfield        #279 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 10410 19410:aload_0         
	// 10411 19411:getfield        #12  <Field azh a>
	// 10412 19414:astore_1        
		abyte0.cm = ((azh) (abyte0)).aP & ~a.G;
	// 10413 19415:aload_1         
	// 10414 19416:aload_1         
	// 10415 19417:getfield        #279 <Field int azh.aP>
	// 10416 19420:aload_0         
	// 10417 19421:getfield        #12  <Field azh a>
	// 10418 19424:getfield        #99  <Field int azh.G>
	// 10419 19427:iconst_m1       
	// 10420 19428:ixor            
	// 10421 19429:iand            
	// 10422 19430:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10423 19433:aload_0         
	// 10424 19434:getfield        #12  <Field azh a>
	// 10425 19437:astore_1        
		abyte0.cm = ((azh) (abyte0)).aP ^ a.cm;
	// 10426 19438:aload_1         
	// 10427 19439:aload_1         
	// 10428 19440:getfield        #279 <Field int azh.aP>
	// 10429 19443:aload_0         
	// 10430 19444:getfield        #12  <Field azh a>
	// 10431 19447:getfield        #519 <Field int azh.cm>
	// 10432 19450:ixor            
	// 10433 19451:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10434 19454:aload_0         
	// 10435 19455:getfield        #12  <Field azh a>
	// 10436 19458:astore_1        
		abyte0.cm = ((azh) (abyte0)).ci & ~a.cm;
	// 10437 19459:aload_1         
	// 10438 19460:aload_1         
	// 10439 19461:getfield        #41  <Field int azh.ci>
	// 10440 19464:aload_0         
	// 10441 19465:getfield        #12  <Field azh a>
	// 10442 19468:getfield        #519 <Field int azh.cm>
	// 10443 19471:iconst_m1       
	// 10444 19472:ixor            
	// 10445 19473:iand            
	// 10446 19474:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10447 19477:aload_0         
	// 10448 19478:getfield        #12  <Field azh a>
	// 10449 19481:astore_1        
		abyte0.bK = ((azh) (abyte0)).aF ^ a.bK;
	// 10450 19482:aload_1         
	// 10451 19483:aload_1         
	// 10452 19484:getfield        #513 <Field int azh.aF>
	// 10453 19487:aload_0         
	// 10454 19488:getfield        #12  <Field azh a>
	// 10455 19491:getfield        #489 <Field int azh.bK>
	// 10456 19494:ixor            
	// 10457 19495:putfield        #489 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10458 19498:aload_0         
	// 10459 19499:getfield        #12  <Field azh a>
	// 10460 19502:astore_1        
		abyte0.cl = ((azh) (abyte0)).bK ^ a.cl;
	// 10461 19503:aload_1         
	// 10462 19504:aload_1         
	// 10463 19505:getfield        #489 <Field int azh.bK>
	// 10464 19508:aload_0         
	// 10465 19509:getfield        #12  <Field azh a>
	// 10466 19512:getfield        #387 <Field int azh.cl>
	// 10467 19515:ixor            
	// 10468 19516:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 10469 19519:aload_0         
	// 10470 19520:getfield        #12  <Field azh a>
	// 10471 19523:astore_1        
		abyte0.cl = ((azh) (abyte0)).G | a.cl;
	// 10472 19524:aload_1         
	// 10473 19525:aload_1         
	// 10474 19526:getfield        #99  <Field int azh.G>
	// 10475 19529:aload_0         
	// 10476 19530:getfield        #12  <Field azh a>
	// 10477 19533:getfield        #387 <Field int azh.cl>
	// 10478 19536:ior             
	// 10479 19537:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 10480 19540:aload_0         
	// 10481 19541:getfield        #12  <Field azh a>
	// 10482 19544:astore_1        
		abyte0.cl = ((azh) (abyte0)).X ^ a.cl;
	// 10483 19545:aload_1         
	// 10484 19546:aload_1         
	// 10485 19547:getfield        #123 <Field int azh.X>
	// 10486 19550:aload_0         
	// 10487 19551:getfield        #12  <Field azh a>
	// 10488 19554:getfield        #387 <Field int azh.cl>
	// 10489 19557:ixor            
	// 10490 19558:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 10491 19561:aload_0         
	// 10492 19562:getfield        #12  <Field azh a>
	// 10493 19565:astore_1        
		abyte0.cm = ((azh) (abyte0)).cl ^ a.cm;
	// 10494 19566:aload_1         
	// 10495 19567:aload_1         
	// 10496 19568:getfield        #387 <Field int azh.cl>
	// 10497 19571:aload_0         
	// 10498 19572:getfield        #12  <Field azh a>
	// 10499 19575:getfield        #519 <Field int azh.cm>
	// 10500 19578:ixor            
	// 10501 19579:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10502 19582:aload_0         
	// 10503 19583:getfield        #12  <Field azh a>
	// 10504 19586:astore_1        
		abyte0.P = ((azh) (abyte0)).cm ^ a.P;
	// 10505 19587:aload_1         
	// 10506 19588:aload_1         
	// 10507 19589:getfield        #519 <Field int azh.cm>
	// 10508 19592:aload_0         
	// 10509 19593:getfield        #12  <Field azh a>
	// 10510 19596:getfield        #120 <Field int azh.P>
	// 10511 19599:ixor            
	// 10512 19600:putfield        #120 <Field int azh.P>
		abyte0 = ((byte []) (a));
	// 10513 19603:aload_0         
	// 10514 19604:getfield        #12  <Field azh a>
	// 10515 19607:astore_1        
		abyte0.bK = ((azh) (abyte0)).ay & ~a.bK;
	// 10516 19608:aload_1         
	// 10517 19609:aload_1         
	// 10518 19610:getfield        #150 <Field int azh.ay>
	// 10519 19613:aload_0         
	// 10520 19614:getfield        #12  <Field azh a>
	// 10521 19617:getfield        #489 <Field int azh.bK>
	// 10522 19620:iconst_m1       
	// 10523 19621:ixor            
	// 10524 19622:iand            
	// 10525 19623:putfield        #489 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10526 19626:aload_0         
	// 10527 19627:getfield        #12  <Field azh a>
	// 10528 19630:astore_1        
		abyte0.bK = ((azh) (abyte0)).G | a.bK;
	// 10529 19631:aload_1         
	// 10530 19632:aload_1         
	// 10531 19633:getfield        #99  <Field int azh.G>
	// 10532 19636:aload_0         
	// 10533 19637:getfield        #12  <Field azh a>
	// 10534 19640:getfield        #489 <Field int azh.bK>
	// 10535 19643:ior             
	// 10536 19644:putfield        #489 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10537 19647:aload_0         
	// 10538 19648:getfield        #12  <Field azh a>
	// 10539 19651:astore_1        
		abyte0.aD = ((azh) (abyte0)).aF ^ a.aD;
	// 10540 19652:aload_1         
	// 10541 19653:aload_1         
	// 10542 19654:getfield        #513 <Field int azh.aF>
	// 10543 19657:aload_0         
	// 10544 19658:getfield        #12  <Field azh a>
	// 10545 19661:getfield        #330 <Field int azh.aD>
	// 10546 19664:ixor            
	// 10547 19665:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 10548 19668:aload_0         
	// 10549 19669:getfield        #12  <Field azh a>
	// 10550 19672:astore_1        
		abyte0.cm = ((azh) (abyte0)).aF ^ a.aI;
	// 10551 19673:aload_1         
	// 10552 19674:aload_1         
	// 10553 19675:getfield        #513 <Field int azh.aF>
	// 10554 19678:aload_0         
	// 10555 19679:getfield        #12  <Field azh a>
	// 10556 19682:getfield        #114 <Field int azh.aI>
	// 10557 19685:ixor            
	// 10558 19686:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10559 19689:aload_0         
	// 10560 19690:getfield        #12  <Field azh a>
	// 10561 19693:astore_1        
		abyte0.cm = ((azh) (abyte0)).ay & ~a.cm;
	// 10562 19694:aload_1         
	// 10563 19695:aload_1         
	// 10564 19696:getfield        #150 <Field int azh.ay>
	// 10565 19699:aload_0         
	// 10566 19700:getfield        #12  <Field azh a>
	// 10567 19703:getfield        #519 <Field int azh.cm>
	// 10568 19706:iconst_m1       
	// 10569 19707:ixor            
	// 10570 19708:iand            
	// 10571 19709:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10572 19712:aload_0         
	// 10573 19713:getfield        #12  <Field azh a>
	// 10574 19716:astore_1        
		abyte0.cm = ((azh) (abyte0)).aT ^ a.cm;
	// 10575 19717:aload_1         
	// 10576 19718:aload_1         
	// 10577 19719:getfield        #495 <Field int azh.aT>
	// 10578 19722:aload_0         
	// 10579 19723:getfield        #12  <Field azh a>
	// 10580 19726:getfield        #519 <Field int azh.cm>
	// 10581 19729:ixor            
	// 10582 19730:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10583 19733:aload_0         
	// 10584 19734:getfield        #12  <Field azh a>
	// 10585 19737:astore_1        
		abyte0.bK = ((azh) (abyte0)).cm ^ a.bK;
	// 10586 19738:aload_1         
	// 10587 19739:aload_1         
	// 10588 19740:getfield        #519 <Field int azh.cm>
	// 10589 19743:aload_0         
	// 10590 19744:getfield        #12  <Field azh a>
	// 10591 19747:getfield        #489 <Field int azh.bK>
	// 10592 19750:ixor            
	// 10593 19751:putfield        #489 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10594 19754:aload_0         
	// 10595 19755:getfield        #12  <Field azh a>
	// 10596 19758:astore_1        
		abyte0.C = ((azh) (abyte0)).aF ^ a.C;
	// 10597 19759:aload_1         
	// 10598 19760:aload_1         
	// 10599 19761:getfield        #513 <Field int azh.aF>
	// 10600 19764:aload_0         
	// 10601 19765:getfield        #12  <Field azh a>
	// 10602 19768:getfield        #420 <Field int azh.C>
	// 10603 19771:ixor            
	// 10604 19772:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 10605 19775:aload_0         
	// 10606 19776:getfield        #12  <Field azh a>
	// 10607 19779:astore_1        
		abyte0.aU = ((azh) (abyte0)).C ^ a.aU;
	// 10608 19780:aload_1         
	// 10609 19781:aload_1         
	// 10610 19782:getfield        #420 <Field int azh.C>
	// 10611 19785:aload_0         
	// 10612 19786:getfield        #12  <Field azh a>
	// 10613 19789:getfield        #35  <Field int azh.aU>
	// 10614 19792:ixor            
	// 10615 19793:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 10616 19796:aload_0         
	// 10617 19797:getfield        #12  <Field azh a>
	// 10618 19800:astore_1        
		abyte0.co = ((azh) (abyte0)).aU ^ a.co;
	// 10619 19801:aload_1         
	// 10620 19802:aload_1         
	// 10621 19803:getfield        #35  <Field int azh.aU>
	// 10622 19806:aload_0         
	// 10623 19807:getfield        #12  <Field azh a>
	// 10624 19810:getfield        #516 <Field int azh.co>
	// 10625 19813:ixor            
	// 10626 19814:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 10627 19817:aload_0         
	// 10628 19818:getfield        #12  <Field azh a>
	// 10629 19821:astore_1        
		abyte0.aF = ((azh) (abyte0)).cd & ~a.aF;
	// 10630 19822:aload_1         
	// 10631 19823:aload_1         
	// 10632 19824:getfield        #141 <Field int azh.cd>
	// 10633 19827:aload_0         
	// 10634 19828:getfield        #12  <Field azh a>
	// 10635 19831:getfield        #513 <Field int azh.aF>
	// 10636 19834:iconst_m1       
	// 10637 19835:ixor            
	// 10638 19836:iand            
	// 10639 19837:putfield        #513 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 10640 19840:aload_0         
	// 10641 19841:getfield        #12  <Field azh a>
	// 10642 19844:astore_1        
		abyte0.b = ((azh) (abyte0)).aF ^ a.b;
	// 10643 19845:aload_1         
	// 10644 19846:aload_1         
	// 10645 19847:getfield        #513 <Field int azh.aF>
	// 10646 19850:aload_0         
	// 10647 19851:getfield        #12  <Field azh a>
	// 10648 19854:getfield        #240 <Field int azh.b>
	// 10649 19857:ixor            
	// 10650 19858:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 10651 19861:aload_0         
	// 10652 19862:getfield        #12  <Field azh a>
	// 10653 19865:astore_1        
		abyte0.b = ((azh) (abyte0)).ay & a.b;
	// 10654 19866:aload_1         
	// 10655 19867:aload_1         
	// 10656 19868:getfield        #150 <Field int azh.ay>
	// 10657 19871:aload_0         
	// 10658 19872:getfield        #12  <Field azh a>
	// 10659 19875:getfield        #240 <Field int azh.b>
	// 10660 19878:iand            
	// 10661 19879:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 10662 19882:aload_0         
	// 10663 19883:getfield        #12  <Field azh a>
	// 10664 19886:astore_1        
		abyte0.b = ((azh) (abyte0)).am ^ a.b;
	// 10665 19887:aload_1         
	// 10666 19888:aload_1         
	// 10667 19889:getfield        #219 <Field int azh.am>
	// 10668 19892:aload_0         
	// 10669 19893:getfield        #12  <Field azh a>
	// 10670 19896:getfield        #240 <Field int azh.b>
	// 10671 19899:ixor            
	// 10672 19900:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 10673 19903:aload_0         
	// 10674 19904:getfield        #12  <Field azh a>
	// 10675 19907:astore_1        
		abyte0.bp = ((azh) (abyte0)).b ^ a.bp;
	// 10676 19908:aload_1         
	// 10677 19909:aload_1         
	// 10678 19910:getfield        #240 <Field int azh.b>
	// 10679 19913:aload_0         
	// 10680 19914:getfield        #12  <Field azh a>
	// 10681 19917:getfield        #486 <Field int azh.bp>
	// 10682 19920:ixor            
	// 10683 19921:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 10684 19924:aload_0         
	// 10685 19925:getfield        #12  <Field azh a>
	// 10686 19928:astore_1        
		abyte0.bp = ((azh) (abyte0)).bp & ~a.ci;
	// 10687 19929:aload_1         
	// 10688 19930:aload_1         
	// 10689 19931:getfield        #486 <Field int azh.bp>
	// 10690 19934:aload_0         
	// 10691 19935:getfield        #12  <Field azh a>
	// 10692 19938:getfield        #41  <Field int azh.ci>
	// 10693 19941:iconst_m1       
	// 10694 19942:ixor            
	// 10695 19943:iand            
	// 10696 19944:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 10697 19947:aload_0         
	// 10698 19948:getfield        #12  <Field azh a>
	// 10699 19951:astore_1        
		abyte0.bp = ((azh) (abyte0)).bK ^ a.bp;
	// 10700 19952:aload_1         
	// 10701 19953:aload_1         
	// 10702 19954:getfield        #489 <Field int azh.bK>
	// 10703 19957:aload_0         
	// 10704 19958:getfield        #12  <Field azh a>
	// 10705 19961:getfield        #486 <Field int azh.bp>
	// 10706 19964:ixor            
	// 10707 19965:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 10708 19968:aload_0         
	// 10709 19969:getfield        #12  <Field azh a>
	// 10710 19972:astore_1        
		abyte0.bY = ((azh) (abyte0)).bp ^ a.bY;
	// 10711 19973:aload_1         
	// 10712 19974:aload_1         
	// 10713 19975:getfield        #486 <Field int azh.bp>
	// 10714 19978:aload_0         
	// 10715 19979:getfield        #12  <Field azh a>
	// 10716 19982:getfield        #375 <Field int azh.bY>
	// 10717 19985:ixor            
	// 10718 19986:putfield        #375 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 10719 19989:aload_0         
	// 10720 19990:getfield        #12  <Field azh a>
	// 10721 19993:astore_1        
		abyte0.bp = ((azh) (abyte0)).bt & ~a.bY;
	// 10722 19994:aload_1         
	// 10723 19995:aload_1         
	// 10724 19996:getfield        #432 <Field int azh.bt>
	// 10725 19999:aload_0         
	// 10726 20000:getfield        #12  <Field azh a>
	// 10727 20003:getfield        #375 <Field int azh.bY>
	// 10728 20006:iconst_m1       
	// 10729 20007:ixor            
	// 10730 20008:iand            
	// 10731 20009:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 10732 20012:aload_0         
	// 10733 20013:getfield        #12  <Field azh a>
	// 10734 20016:astore_1        
		abyte0.aw = ((azh) (abyte0)).bp ^ a.aw;
	// 10735 20017:aload_1         
	// 10736 20018:aload_1         
	// 10737 20019:getfield        #486 <Field int azh.bp>
	// 10738 20022:aload_0         
	// 10739 20023:getfield        #12  <Field azh a>
	// 10740 20026:getfield        #498 <Field int azh.aw>
	// 10741 20029:ixor            
	// 10742 20030:putfield        #498 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10743 20033:aload_0         
	// 10744 20034:getfield        #12  <Field azh a>
	// 10745 20037:astore_1        
		abyte0.bp = ((azh) (abyte0)).bY ^ a.bt;
	// 10746 20038:aload_1         
	// 10747 20039:aload_1         
	// 10748 20040:getfield        #375 <Field int azh.bY>
	// 10749 20043:aload_0         
	// 10750 20044:getfield        #12  <Field azh a>
	// 10751 20047:getfield        #432 <Field int azh.bt>
	// 10752 20050:ixor            
	// 10753 20051:putfield        #486 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 10754 20054:aload_0         
	// 10755 20055:getfield        #12  <Field azh a>
	// 10756 20058:astore_1        
		abyte0.b = ((azh) (abyte0)).ap & a.bp;
	// 10757 20059:aload_1         
	// 10758 20060:aload_1         
	// 10759 20061:getfield        #369 <Field int azh.ap>
	// 10760 20064:aload_0         
	// 10761 20065:getfield        #12  <Field azh a>
	// 10762 20068:getfield        #486 <Field int azh.bp>
	// 10763 20071:iand            
	// 10764 20072:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 10765 20075:aload_0         
	// 10766 20076:getfield        #12  <Field azh a>
	// 10767 20079:astore_1        
		abyte0.b = ((azh) (abyte0)).bY ^ a.b;
	// 10768 20080:aload_1         
	// 10769 20081:aload_1         
	// 10770 20082:getfield        #375 <Field int azh.bY>
	// 10771 20085:aload_0         
	// 10772 20086:getfield        #12  <Field azh a>
	// 10773 20089:getfield        #240 <Field int azh.b>
	// 10774 20092:ixor            
	// 10775 20093:putfield        #240 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 10776 20096:aload_0         
	// 10777 20097:getfield        #12  <Field azh a>
	// 10778 20100:astore_1        
		abyte0.am = ((azh) (abyte0)).ap & a.bp;
	// 10779 20101:aload_1         
	// 10780 20102:aload_1         
	// 10781 20103:getfield        #369 <Field int azh.ap>
	// 10782 20106:aload_0         
	// 10783 20107:getfield        #12  <Field azh a>
	// 10784 20110:getfield        #486 <Field int azh.bp>
	// 10785 20113:iand            
	// 10786 20114:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 10787 20117:aload_0         
	// 10788 20118:getfield        #12  <Field azh a>
	// 10789 20121:astore_1        
		abyte0.am = ((azh) (abyte0)).bt ^ a.am;
	// 10790 20122:aload_1         
	// 10791 20123:aload_1         
	// 10792 20124:getfield        #432 <Field int azh.bt>
	// 10793 20127:aload_0         
	// 10794 20128:getfield        #12  <Field azh a>
	// 10795 20131:getfield        #219 <Field int azh.am>
	// 10796 20134:ixor            
	// 10797 20135:putfield        #219 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 10798 20138:aload_0         
	// 10799 20139:getfield        #12  <Field azh a>
	// 10800 20142:astore_1        
		abyte0.aU = ((azh) (abyte0)).ap & a.bp;
	// 10801 20143:aload_1         
	// 10802 20144:aload_1         
	// 10803 20145:getfield        #369 <Field int azh.ap>
	// 10804 20148:aload_0         
	// 10805 20149:getfield        #12  <Field azh a>
	// 10806 20152:getfield        #486 <Field int azh.bp>
	// 10807 20155:iand            
	// 10808 20156:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 10809 20159:aload_0         
	// 10810 20160:getfield        #12  <Field azh a>
	// 10811 20163:astore_1        
		abyte0.C = ((azh) (abyte0)).H & ~a.bY;
	// 10812 20164:aload_1         
	// 10813 20165:aload_1         
	// 10814 20166:getfield        #465 <Field int azh.H>
	// 10815 20169:aload_0         
	// 10816 20170:getfield        #12  <Field azh a>
	// 10817 20173:getfield        #375 <Field int azh.bY>
	// 10818 20176:iconst_m1       
	// 10819 20177:ixor            
	// 10820 20178:iand            
	// 10821 20179:putfield        #420 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 10822 20182:aload_0         
	// 10823 20183:getfield        #12  <Field azh a>
	// 10824 20186:astore_1        
		abyte0.cm = ((azh) (abyte0)).bY & a.bt;
	// 10825 20187:aload_1         
	// 10826 20188:aload_1         
	// 10827 20189:getfield        #375 <Field int azh.bY>
	// 10828 20192:aload_0         
	// 10829 20193:getfield        #12  <Field azh a>
	// 10830 20196:getfield        #432 <Field int azh.bt>
	// 10831 20199:iand            
	// 10832 20200:putfield        #519 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 10833 20203:aload_0         
	// 10834 20204:getfield        #12  <Field azh a>
	// 10835 20207:astore_1        
		abyte0.aT = ((azh) (abyte0)).ap & ~a.cm;
	// 10836 20208:aload_1         
	// 10837 20209:aload_1         
	// 10838 20210:getfield        #369 <Field int azh.ap>
	// 10839 20213:aload_0         
	// 10840 20214:getfield        #12  <Field azh a>
	// 10841 20217:getfield        #519 <Field int azh.cm>
	// 10842 20220:iconst_m1       
	// 10843 20221:ixor            
	// 10844 20222:iand            
	// 10845 20223:putfield        #495 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10846 20226:aload_0         
	// 10847 20227:getfield        #12  <Field azh a>
	// 10848 20230:astore_1        
		abyte0.cl = ((azh) (abyte0)).bt & ~a.cm;
	// 10849 20231:aload_1         
	// 10850 20232:aload_1         
	// 10851 20233:getfield        #432 <Field int azh.bt>
	// 10852 20236:aload_0         
	// 10853 20237:getfield        #12  <Field azh a>
	// 10854 20240:getfield        #519 <Field int azh.cm>
	// 10855 20243:iconst_m1       
	// 10856 20244:ixor            
	// 10857 20245:iand            
	// 10858 20246:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 10859 20249:aload_0         
	// 10860 20250:getfield        #12  <Field azh a>
	// 10861 20253:astore_1        
		abyte0.cl = ((azh) (abyte0)).ap & ~a.cl;
	// 10862 20254:aload_1         
	// 10863 20255:aload_1         
	// 10864 20256:getfield        #369 <Field int azh.ap>
	// 10865 20259:aload_0         
	// 10866 20260:getfield        #12  <Field azh a>
	// 10867 20263:getfield        #387 <Field int azh.cl>
	// 10868 20266:iconst_m1       
	// 10869 20267:ixor            
	// 10870 20268:iand            
	// 10871 20269:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 10872 20272:aload_0         
	// 10873 20273:getfield        #12  <Field azh a>
	// 10874 20276:astore_1        
		abyte0.X = ((azh) (abyte0)).H & a.bY;
	// 10875 20277:aload_1         
	// 10876 20278:aload_1         
	// 10877 20279:getfield        #465 <Field int azh.H>
	// 10878 20282:aload_0         
	// 10879 20283:getfield        #12  <Field azh a>
	// 10880 20286:getfield        #375 <Field int azh.bY>
	// 10881 20289:iand            
	// 10882 20290:putfield        #123 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 10883 20293:aload_0         
	// 10884 20294:getfield        #12  <Field azh a>
	// 10885 20297:astore_1        
		abyte0.aP = ((azh) (abyte0)).bY | a.bt;
	// 10886 20298:aload_1         
	// 10887 20299:aload_1         
	// 10888 20300:getfield        #375 <Field int azh.bY>
	// 10889 20303:aload_0         
	// 10890 20304:getfield        #12  <Field azh a>
	// 10891 20307:getfield        #432 <Field int azh.bt>
	// 10892 20310:ior             
	// 10893 20311:putfield        #279 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 10894 20314:aload_0         
	// 10895 20315:getfield        #12  <Field azh a>
	// 10896 20318:astore_1        
		abyte0.ai = ((azh) (abyte0)).ap & a.aP;
	// 10897 20319:aload_1         
	// 10898 20320:aload_1         
	// 10899 20321:getfield        #369 <Field int azh.ap>
	// 10900 20324:aload_0         
	// 10901 20325:getfield        #12  <Field azh a>
	// 10902 20328:getfield        #279 <Field int azh.aP>
	// 10903 20331:iand            
	// 10904 20332:putfield        #522 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 10905 20335:aload_0         
	// 10906 20336:getfield        #12  <Field azh a>
	// 10907 20339:astore_1        
		abyte0.ai = ((azh) (abyte0)).bp ^ a.ai;
	// 10908 20340:aload_1         
	// 10909 20341:aload_1         
	// 10910 20342:getfield        #486 <Field int azh.bp>
	// 10911 20345:aload_0         
	// 10912 20346:getfield        #12  <Field azh a>
	// 10913 20349:getfield        #522 <Field int azh.ai>
	// 10914 20352:ixor            
	// 10915 20353:putfield        #522 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 10916 20356:aload_0         
	// 10917 20357:getfield        #12  <Field azh a>
	// 10918 20360:astore_1        
		abyte0.cp = ((azh) (abyte0)).aP ^ a.cp;
	// 10919 20361:aload_1         
	// 10920 20362:aload_1         
	// 10921 20363:getfield        #279 <Field int azh.aP>
	// 10922 20366:aload_0         
	// 10923 20367:getfield        #12  <Field azh a>
	// 10924 20370:getfield        #510 <Field int azh.cp>
	// 10925 20373:ixor            
	// 10926 20374:putfield        #510 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 10927 20377:aload_0         
	// 10928 20378:getfield        #12  <Field azh a>
	// 10929 20381:astore_1        
		abyte0.g = ((azh) (abyte0)).ap & ~a.aP;
	// 10930 20382:aload_1         
	// 10931 20383:aload_1         
	// 10932 20384:getfield        #369 <Field int azh.ap>
	// 10933 20387:aload_0         
	// 10934 20388:getfield        #12  <Field azh a>
	// 10935 20391:getfield        #279 <Field int azh.aP>
	// 10936 20394:iconst_m1       
	// 10937 20395:ixor            
	// 10938 20396:iand            
	// 10939 20397:putfield        #525 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 10940 20400:aload_0         
	// 10941 20401:getfield        #12  <Field azh a>
	// 10942 20404:astore_1        
		abyte0.cq = ((azh) (abyte0)).ap & a.aP;
	// 10943 20405:aload_1         
	// 10944 20406:aload_1         
	// 10945 20407:getfield        #369 <Field int azh.ap>
	// 10946 20410:aload_0         
	// 10947 20411:getfield        #12  <Field azh a>
	// 10948 20414:getfield        #279 <Field int azh.aP>
	// 10949 20417:iand            
	// 10950 20418:putfield        #528 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 10951 20421:aload_0         
	// 10952 20422:getfield        #12  <Field azh a>
	// 10953 20425:astore_1        
		abyte0.cq = ((azh) (abyte0)).bt ^ a.cq;
	// 10954 20426:aload_1         
	// 10955 20427:aload_1         
	// 10956 20428:getfield        #432 <Field int azh.bt>
	// 10957 20431:aload_0         
	// 10958 20432:getfield        #12  <Field azh a>
	// 10959 20435:getfield        #528 <Field int azh.cq>
	// 10960 20438:ixor            
	// 10961 20439:putfield        #528 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 10962 20442:aload_0         
	// 10963 20443:getfield        #12  <Field azh a>
	// 10964 20446:astore_1        
		abyte0.cr = ((azh) (abyte0)).aP ^ a.ap;
	// 10965 20447:aload_1         
	// 10966 20448:aload_1         
	// 10967 20449:getfield        #279 <Field int azh.aP>
	// 10968 20452:aload_0         
	// 10969 20453:getfield        #12  <Field azh a>
	// 10970 20456:getfield        #369 <Field int azh.ap>
	// 10971 20459:ixor            
	// 10972 20460:putfield        #531 <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 10973 20463:aload_0         
	// 10974 20464:getfield        #12  <Field azh a>
	// 10975 20467:astore_1        
		abyte0.aT = ((azh) (abyte0)).aP ^ a.aT;
	// 10976 20468:aload_1         
	// 10977 20469:aload_1         
	// 10978 20470:getfield        #279 <Field int azh.aP>
	// 10979 20473:aload_0         
	// 10980 20474:getfield        #12  <Field azh a>
	// 10981 20477:getfield        #495 <Field int azh.aT>
	// 10982 20480:ixor            
	// 10983 20481:putfield        #495 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10984 20484:aload_0         
	// 10985 20485:getfield        #12  <Field azh a>
	// 10986 20488:astore_1        
		abyte0.cs = ((azh) (abyte0)).aP & ~a.bt;
	// 10987 20489:aload_1         
	// 10988 20490:aload_1         
	// 10989 20491:getfield        #279 <Field int azh.aP>
	// 10990 20494:aload_0         
	// 10991 20495:getfield        #12  <Field azh a>
	// 10992 20498:getfield        #432 <Field int azh.bt>
	// 10993 20501:iconst_m1       
	// 10994 20502:ixor            
	// 10995 20503:iand            
	// 10996 20504:putfield        #534 <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 10997 20507:aload_0         
	// 10998 20508:getfield        #12  <Field azh a>
	// 10999 20511:astore_1        
		abyte0.cs = ((azh) (abyte0)).ap & ~a.cs;
	// 11000 20512:aload_1         
	// 11001 20513:aload_1         
	// 11002 20514:getfield        #369 <Field int azh.ap>
	// 11003 20517:aload_0         
	// 11004 20518:getfield        #12  <Field azh a>
	// 11005 20521:getfield        #534 <Field int azh.cs>
	// 11006 20524:iconst_m1       
	// 11007 20525:ixor            
	// 11008 20526:iand            
	// 11009 20527:putfield        #534 <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 11010 20530:aload_0         
	// 11011 20531:getfield        #12  <Field azh a>
	// 11012 20534:astore_1        
		abyte0.ct = ((azh) (abyte0)).ap & ~a.aP;
	// 11013 20535:aload_1         
	// 11014 20536:aload_1         
	// 11015 20537:getfield        #369 <Field int azh.ap>
	// 11016 20540:aload_0         
	// 11017 20541:getfield        #12  <Field azh a>
	// 11018 20544:getfield        #279 <Field int azh.aP>
	// 11019 20547:iconst_m1       
	// 11020 20548:ixor            
	// 11021 20549:iand            
	// 11022 20550:putfield        #537 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 11023 20553:aload_0         
	// 11024 20554:getfield        #12  <Field azh a>
	// 11025 20557:astore_1        
		abyte0.ct = ((azh) (abyte0)).bY ^ a.ct;
	// 11026 20558:aload_1         
	// 11027 20559:aload_1         
	// 11028 20560:getfield        #375 <Field int azh.bY>
	// 11029 20563:aload_0         
	// 11030 20564:getfield        #12  <Field azh a>
	// 11031 20567:getfield        #537 <Field int azh.ct>
	// 11032 20570:ixor            
	// 11033 20571:putfield        #537 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 11034 20574:aload_0         
	// 11035 20575:getfield        #12  <Field azh a>
	// 11036 20578:astore_1        
		abyte0.cu = ((azh) (abyte0)).bY & ~a.bt;
	// 11037 20579:aload_1         
	// 11038 20580:aload_1         
	// 11039 20581:getfield        #375 <Field int azh.bY>
	// 11040 20584:aload_0         
	// 11041 20585:getfield        #12  <Field azh a>
	// 11042 20588:getfield        #432 <Field int azh.bt>
	// 11043 20591:iconst_m1       
	// 11044 20592:ixor            
	// 11045 20593:iand            
	// 11046 20594:putfield        #540 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 11047 20597:aload_0         
	// 11048 20598:getfield        #12  <Field azh a>
	// 11049 20601:astore_1        
		abyte0.aU = ((azh) (abyte0)).cu ^ a.aU;
	// 11050 20602:aload_1         
	// 11051 20603:aload_1         
	// 11052 20604:getfield        #540 <Field int azh.cu>
	// 11053 20607:aload_0         
	// 11054 20608:getfield        #12  <Field azh a>
	// 11055 20611:getfield        #35  <Field int azh.aU>
	// 11056 20614:ixor            
	// 11057 20615:putfield        #35  <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 11058 20618:aload_0         
	// 11059 20619:getfield        #12  <Field azh a>
	// 11060 20622:astore_1        
		abyte0.cv = ((azh) (abyte0)).ap & a.cu;
	// 11061 20623:aload_1         
	// 11062 20624:aload_1         
	// 11063 20625:getfield        #369 <Field int azh.ap>
	// 11064 20628:aload_0         
	// 11065 20629:getfield        #12  <Field azh a>
	// 11066 20632:getfield        #540 <Field int azh.cu>
	// 11067 20635:iand            
	// 11068 20636:putfield        #543 <Field int azh.cv>
		abyte0 = ((byte []) (a));
	// 11069 20639:aload_0         
	// 11070 20640:getfield        #12  <Field azh a>
	// 11071 20643:astore_1        
		abyte0.cl = ((azh) (abyte0)).cu ^ a.cl;
	// 11072 20644:aload_1         
	// 11073 20645:aload_1         
	// 11074 20646:getfield        #540 <Field int azh.cu>
	// 11075 20649:aload_0         
	// 11076 20650:getfield        #12  <Field azh a>
	// 11077 20653:getfield        #387 <Field int azh.cl>
	// 11078 20656:ixor            
	// 11079 20657:putfield        #387 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 11080 20660:aload_0         
	// 11081 20661:getfield        #12  <Field azh a>
	// 11082 20664:astore_1        
		abyte0.cu = ((azh) (abyte0)).ap & a.cu;
	// 11083 20665:aload_1         
	// 11084 20666:aload_1         
	// 11085 20667:getfield        #369 <Field int azh.ap>
	// 11086 20670:aload_0         
	// 11087 20671:getfield        #12  <Field azh a>
	// 11088 20674:getfield        #540 <Field int azh.cu>
	// 11089 20677:iand            
	// 11090 20678:putfield        #540 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 11091 20681:aload_0         
	// 11092 20682:getfield        #12  <Field azh a>
	// 11093 20685:astore_1        
		abyte0.cu = ((azh) (abyte0)).aP ^ a.cu;
	// 11094 20686:aload_1         
	// 11095 20687:aload_1         
	// 11096 20688:getfield        #279 <Field int azh.aP>
	// 11097 20691:aload_0         
	// 11098 20692:getfield        #12  <Field azh a>
	// 11099 20695:getfield        #540 <Field int azh.cu>
	// 11100 20698:ixor            
	// 11101 20699:putfield        #540 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 11102 20702:aload_0         
	// 11103 20703:getfield        #12  <Field azh a>
	// 11104 20706:astore_1        
		abyte0.aR = ((azh) (abyte0)).aF ^ a.aR;
	// 11105 20707:aload_1         
	// 11106 20708:aload_1         
	// 11107 20709:getfield        #513 <Field int azh.aF>
	// 11108 20712:aload_0         
	// 11109 20713:getfield        #12  <Field azh a>
	// 11110 20716:getfield        #492 <Field int azh.aR>
	// 11111 20719:ixor            
	// 11112 20720:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11113 20723:aload_0         
	// 11114 20724:getfield        #12  <Field azh a>
	// 11115 20727:astore_1        
		abyte0.aF = ((azh) (abyte0)).aR & ~a.ay;
	// 11116 20728:aload_1         
	// 11117 20729:aload_1         
	// 11118 20730:getfield        #492 <Field int azh.aR>
	// 11119 20733:aload_0         
	// 11120 20734:getfield        #12  <Field azh a>
	// 11121 20737:getfield        #150 <Field int azh.ay>
	// 11122 20740:iconst_m1       
	// 11123 20741:ixor            
	// 11124 20742:iand            
	// 11125 20743:putfield        #513 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 11126 20746:aload_0         
	// 11127 20747:getfield        #12  <Field azh a>
	// 11128 20750:astore_1        
		abyte0.aF = ((azh) (abyte0)).aD ^ a.aF;
	// 11129 20751:aload_1         
	// 11130 20752:aload_1         
	// 11131 20753:getfield        #330 <Field int azh.aD>
	// 11132 20756:aload_0         
	// 11133 20757:getfield        #12  <Field azh a>
	// 11134 20760:getfield        #513 <Field int azh.aF>
	// 11135 20763:ixor            
	// 11136 20764:putfield        #513 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 11137 20767:aload_0         
	// 11138 20768:getfield        #12  <Field azh a>
	// 11139 20771:astore_1        
		abyte0.aF = ((azh) (abyte0)).G | a.aF;
	// 11140 20772:aload_1         
	// 11141 20773:aload_1         
	// 11142 20774:getfield        #99  <Field int azh.G>
	// 11143 20777:aload_0         
	// 11144 20778:getfield        #12  <Field azh a>
	// 11145 20781:getfield        #513 <Field int azh.aF>
	// 11146 20784:ior             
	// 11147 20785:putfield        #513 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 11148 20788:aload_0         
	// 11149 20789:getfield        #12  <Field azh a>
	// 11150 20792:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR & ~a.ay;
	// 11151 20793:aload_1         
	// 11152 20794:aload_1         
	// 11153 20795:getfield        #492 <Field int azh.aR>
	// 11154 20798:aload_0         
	// 11155 20799:getfield        #12  <Field azh a>
	// 11156 20802:getfield        #150 <Field int azh.ay>
	// 11157 20805:iconst_m1       
	// 11158 20806:ixor            
	// 11159 20807:iand            
	// 11160 20808:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11161 20811:aload_0         
	// 11162 20812:getfield        #12  <Field azh a>
	// 11163 20815:astore_1        
		abyte0.aR = ((azh) (abyte0)).aI ^ a.aR;
	// 11164 20816:aload_1         
	// 11165 20817:aload_1         
	// 11166 20818:getfield        #114 <Field int azh.aI>
	// 11167 20821:aload_0         
	// 11168 20822:getfield        #12  <Field azh a>
	// 11169 20825:getfield        #492 <Field int azh.aR>
	// 11170 20828:ixor            
	// 11171 20829:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11172 20832:aload_0         
	// 11173 20833:getfield        #12  <Field azh a>
	// 11174 20836:astore_1        
		abyte0.aR = ((azh) (abyte0)).G | a.aR;
	// 11175 20837:aload_1         
	// 11176 20838:aload_1         
	// 11177 20839:getfield        #99  <Field int azh.G>
	// 11178 20842:aload_0         
	// 11179 20843:getfield        #12  <Field azh a>
	// 11180 20846:getfield        #492 <Field int azh.aR>
	// 11181 20849:ior             
	// 11182 20850:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11183 20853:aload_0         
	// 11184 20854:getfield        #12  <Field azh a>
	// 11185 20857:astore_1        
		abyte0.aR = ((azh) (abyte0)).bX ^ a.aR;
	// 11186 20858:aload_1         
	// 11187 20859:aload_1         
	// 11188 20860:getfield        #405 <Field int azh.bX>
	// 11189 20863:aload_0         
	// 11190 20864:getfield        #12  <Field azh a>
	// 11191 20867:getfield        #492 <Field int azh.aR>
	// 11192 20870:ixor            
	// 11193 20871:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11194 20874:aload_0         
	// 11195 20875:getfield        #12  <Field azh a>
	// 11196 20878:astore_1        
		abyte0.aR = ((azh) (abyte0)).ci & a.aR;
	// 11197 20879:aload_1         
	// 11198 20880:aload_1         
	// 11199 20881:getfield        #41  <Field int azh.ci>
	// 11200 20884:aload_0         
	// 11201 20885:getfield        #12  <Field azh a>
	// 11202 20888:getfield        #492 <Field int azh.aR>
	// 11203 20891:iand            
	// 11204 20892:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11205 20895:aload_0         
	// 11206 20896:getfield        #12  <Field azh a>
	// 11207 20899:astore_1        
		abyte0.aR = ((azh) (abyte0)).co ^ a.aR;
	// 11208 20900:aload_1         
	// 11209 20901:aload_1         
	// 11210 20902:getfield        #516 <Field int azh.co>
	// 11211 20905:aload_0         
	// 11212 20906:getfield        #12  <Field azh a>
	// 11213 20909:getfield        #492 <Field int azh.aR>
	// 11214 20912:ixor            
	// 11215 20913:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11216 20916:aload_0         
	// 11217 20917:getfield        #12  <Field azh a>
	// 11218 20920:astore_1        
		abyte0.aG = ((azh) (abyte0)).aR ^ a.aG;
	// 11219 20921:aload_1         
	// 11220 20922:aload_1         
	// 11221 20923:getfield        #492 <Field int azh.aR>
	// 11222 20926:aload_0         
	// 11223 20927:getfield        #12  <Field azh a>
	// 11224 20930:getfield        #47  <Field int azh.aG>
	// 11225 20933:ixor            
	// 11226 20934:putfield        #47  <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 11227 20937:aload_0         
	// 11228 20938:getfield        #12  <Field azh a>
	// 11229 20941:astore_1        
		abyte0.aR = ((azh) (abyte0)).y & ~a.c;
	// 11230 20942:aload_1         
	// 11231 20943:aload_1         
	// 11232 20944:getfield        #108 <Field int azh.y>
	// 11233 20947:aload_0         
	// 11234 20948:getfield        #12  <Field azh a>
	// 11235 20951:getfield        #276 <Field int azh.c>
	// 11236 20954:iconst_m1       
	// 11237 20955:ixor            
	// 11238 20956:iand            
	// 11239 20957:putfield        #492 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 11240 20960:aload_0         
	// 11241 20961:getfield        #12  <Field azh a>
	// 11242 20964:astore_1        
		abyte0.co = ((azh) (abyte0)).bF & a.aR;
	// 11243 20965:aload_1         
	// 11244 20966:aload_1         
	// 11245 20967:getfield        #462 <Field int azh.bF>
	// 11246 20970:aload_0         
	// 11247 20971:getfield        #12  <Field azh a>
	// 11248 20974:getfield        #492 <Field int azh.aR>
	// 11249 20977:iand            
	// 11250 20978:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 11251 20981:aload_0         
	// 11252 20982:getfield        #12  <Field azh a>
	// 11253 20985:astore_1        
		abyte0.co = ((azh) (abyte0)).aR ^ a.co;
	// 11254 20986:aload_1         
	// 11255 20987:aload_1         
	// 11256 20988:getfield        #492 <Field int azh.aR>
	// 11257 20991:aload_0         
	// 11258 20992:getfield        #12  <Field azh a>
	// 11259 20995:getfield        #516 <Field int azh.co>
	// 11260 20998:ixor            
	// 11261 20999:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 11262 21002:aload_0         
	// 11263 21003:getfield        #12  <Field azh a>
	// 11264 21006:astore_1        
		abyte0.bX = ((azh) (abyte0)).O & ~a.co;
	// 11265 21007:aload_1         
	// 11266 21008:aload_1         
	// 11267 21009:getfield        #342 <Field int azh.O>
	// 11268 21012:aload_0         
	// 11269 21013:getfield        #12  <Field azh a>
	// 11270 21016:getfield        #516 <Field int azh.co>
	// 11271 21019:iconst_m1       
	// 11272 21020:ixor            
	// 11273 21021:iand            
	// 11274 21022:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 11275 21025:aload_0         
	// 11276 21026:getfield        #12  <Field azh a>
	// 11277 21029:astore_1        
		abyte0.aD = ((azh) (abyte0)).bT | a.aR;
	// 11278 21030:aload_1         
	// 11279 21031:aload_1         
	// 11280 21032:getfield        #86  <Field int azh.bT>
	// 11281 21035:aload_0         
	// 11282 21036:getfield        #12  <Field azh a>
	// 11283 21039:getfield        #492 <Field int azh.aR>
	// 11284 21042:ior             
	// 11285 21043:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11286 21046:aload_0         
	// 11287 21047:getfield        #12  <Field azh a>
	// 11288 21050:astore_1        
		abyte0.aD = ((azh) (abyte0)).W ^ a.aD;
	// 11289 21051:aload_1         
	// 11290 21052:aload_1         
	// 11291 21053:getfield        #249 <Field int azh.W>
	// 11292 21056:aload_0         
	// 11293 21057:getfield        #12  <Field azh a>
	// 11294 21060:getfield        #330 <Field int azh.aD>
	// 11295 21063:ixor            
	// 11296 21064:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11297 21067:aload_0         
	// 11298 21068:getfield        #12  <Field azh a>
	// 11299 21071:astore_1        
		abyte0.aD = ((azh) (abyte0)).O & a.aD;
	// 11300 21072:aload_1         
	// 11301 21073:aload_1         
	// 11302 21074:getfield        #342 <Field int azh.O>
	// 11303 21077:aload_0         
	// 11304 21078:getfield        #12  <Field azh a>
	// 11305 21081:getfield        #330 <Field int azh.aD>
	// 11306 21084:iand            
	// 11307 21085:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11308 21088:aload_0         
	// 11309 21089:getfield        #12  <Field azh a>
	// 11310 21092:astore_1        
		abyte0.aD = ((azh) (abyte0)).co ^ a.aD;
	// 11311 21093:aload_1         
	// 11312 21094:aload_1         
	// 11313 21095:getfield        #516 <Field int azh.co>
	// 11314 21098:aload_0         
	// 11315 21099:getfield        #12  <Field azh a>
	// 11316 21102:getfield        #330 <Field int azh.aD>
	// 11317 21105:ixor            
	// 11318 21106:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11319 21109:aload_0         
	// 11320 21110:getfield        #12  <Field azh a>
	// 11321 21113:astore_1        
		abyte0.aD = ((azh) (abyte0)).G | a.aD;
	// 11322 21114:aload_1         
	// 11323 21115:aload_1         
	// 11324 21116:getfield        #99  <Field int azh.G>
	// 11325 21119:aload_0         
	// 11326 21120:getfield        #12  <Field azh a>
	// 11327 21123:getfield        #330 <Field int azh.aD>
	// 11328 21126:ior             
	// 11329 21127:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11330 21130:aload_0         
	// 11331 21131:getfield        #12  <Field azh a>
	// 11332 21134:astore_1        
		abyte0.co = ((azh) (abyte0)).bF & ~a.aR;
	// 11333 21135:aload_1         
	// 11334 21136:aload_1         
	// 11335 21137:getfield        #462 <Field int azh.bF>
	// 11336 21140:aload_0         
	// 11337 21141:getfield        #12  <Field azh a>
	// 11338 21144:getfield        #492 <Field int azh.aR>
	// 11339 21147:iconst_m1       
	// 11340 21148:ixor            
	// 11341 21149:iand            
	// 11342 21150:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 11343 21153:aload_0         
	// 11344 21154:getfield        #12  <Field azh a>
	// 11345 21157:astore_1        
		abyte0.W = ((azh) (abyte0)).c | a.aR;
	// 11346 21158:aload_1         
	// 11347 21159:aload_1         
	// 11348 21160:getfield        #276 <Field int azh.c>
	// 11349 21163:aload_0         
	// 11350 21164:getfield        #12  <Field azh a>
	// 11351 21167:getfield        #492 <Field int azh.aR>
	// 11352 21170:ior             
	// 11353 21171:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 11354 21174:aload_0         
	// 11355 21175:getfield        #12  <Field azh a>
	// 11356 21178:astore_1        
		abyte0.cw = ((azh) (abyte0)).W ^ a.bF;
	// 11357 21179:aload_1         
	// 11358 21180:aload_1         
	// 11359 21181:getfield        #249 <Field int azh.W>
	// 11360 21184:aload_0         
	// 11361 21185:getfield        #12  <Field azh a>
	// 11362 21188:getfield        #462 <Field int azh.bF>
	// 11363 21191:ixor            
	// 11364 21192:putfield        #546 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 11365 21195:aload_0         
	// 11366 21196:getfield        #12  <Field azh a>
	// 11367 21199:astore_1        
		abyte0.aZ = ((azh) (abyte0)).cw ^ a.aZ;
	// 11368 21200:aload_1         
	// 11369 21201:aload_1         
	// 11370 21202:getfield        #546 <Field int azh.cw>
	// 11371 21205:aload_0         
	// 11372 21206:getfield        #12  <Field azh a>
	// 11373 21209:getfield        #297 <Field int azh.aZ>
	// 11374 21212:ixor            
	// 11375 21213:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 11376 21216:aload_0         
	// 11377 21217:getfield        #12  <Field azh a>
	// 11378 21220:astore_1        
		abyte0.aZ = ((azh) (abyte0)).O & a.aZ;
	// 11379 21221:aload_1         
	// 11380 21222:aload_1         
	// 11381 21223:getfield        #342 <Field int azh.O>
	// 11382 21226:aload_0         
	// 11383 21227:getfield        #12  <Field azh a>
	// 11384 21230:getfield        #297 <Field int azh.aZ>
	// 11385 21233:iand            
	// 11386 21234:putfield        #297 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 11387 21237:aload_0         
	// 11388 21238:getfield        #12  <Field azh a>
	// 11389 21241:astore_1        
		abyte0.co = ((azh) (abyte0)).W ^ a.co;
	// 11390 21242:aload_1         
	// 11391 21243:aload_1         
	// 11392 21244:getfield        #249 <Field int azh.W>
	// 11393 21247:aload_0         
	// 11394 21248:getfield        #12  <Field azh a>
	// 11395 21251:getfield        #516 <Field int azh.co>
	// 11396 21254:ixor            
	// 11397 21255:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 11398 21258:aload_0         
	// 11399 21259:getfield        #12  <Field azh a>
	// 11400 21262:astore_1        
		abyte0.co = ((azh) (abyte0)).co & ~a.bT;
	// 11401 21263:aload_1         
	// 11402 21264:aload_1         
	// 11403 21265:getfield        #516 <Field int azh.co>
	// 11404 21268:aload_0         
	// 11405 21269:getfield        #12  <Field azh a>
	// 11406 21272:getfield        #86  <Field int azh.bT>
	// 11407 21275:iconst_m1       
	// 11408 21276:ixor            
	// 11409 21277:iand            
	// 11410 21278:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 11411 21281:aload_0         
	// 11412 21282:getfield        #12  <Field azh a>
	// 11413 21285:astore_1        
		abyte0.co = ((azh) (abyte0)).ag ^ a.co;
	// 11414 21286:aload_1         
	// 11415 21287:aload_1         
	// 11416 21288:getfield        #426 <Field int azh.ag>
	// 11417 21291:aload_0         
	// 11418 21292:getfield        #12  <Field azh a>
	// 11419 21295:getfield        #516 <Field int azh.co>
	// 11420 21298:ixor            
	// 11421 21299:putfield        #516 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 11422 21302:aload_0         
	// 11423 21303:getfield        #12  <Field azh a>
	// 11424 21306:astore_1        
		abyte0.az = ((azh) (abyte0)).W ^ a.az;
	// 11425 21307:aload_1         
	// 11426 21308:aload_1         
	// 11427 21309:getfield        #249 <Field int azh.W>
	// 11428 21312:aload_0         
	// 11429 21313:getfield        #12  <Field azh a>
	// 11430 21316:getfield        #408 <Field int azh.az>
	// 11431 21319:ixor            
	// 11432 21320:putfield        #408 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 11433 21323:aload_0         
	// 11434 21324:getfield        #12  <Field azh a>
	// 11435 21327:astore_1        
		abyte0.W = ((azh) (abyte0)).bF & ~a.aR;
	// 11436 21328:aload_1         
	// 11437 21329:aload_1         
	// 11438 21330:getfield        #462 <Field int azh.bF>
	// 11439 21333:aload_0         
	// 11440 21334:getfield        #12  <Field azh a>
	// 11441 21337:getfield        #492 <Field int azh.aR>
	// 11442 21340:iconst_m1       
	// 11443 21341:ixor            
	// 11444 21342:iand            
	// 11445 21343:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 11446 21346:aload_0         
	// 11447 21347:getfield        #12  <Field azh a>
	// 11448 21350:astore_1        
		abyte0.W = ((azh) (abyte0)).aR ^ a.W;
	// 11449 21351:aload_1         
	// 11450 21352:aload_1         
	// 11451 21353:getfield        #492 <Field int azh.aR>
	// 11452 21356:aload_0         
	// 11453 21357:getfield        #12  <Field azh a>
	// 11454 21360:getfield        #249 <Field int azh.W>
	// 11455 21363:ixor            
	// 11456 21364:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 11457 21367:aload_0         
	// 11458 21368:getfield        #12  <Field azh a>
	// 11459 21371:astore_1        
		abyte0.W = ((azh) (abyte0)).W & a.bT;
	// 11460 21372:aload_1         
	// 11461 21373:aload_1         
	// 11462 21374:getfield        #249 <Field int azh.W>
	// 11463 21377:aload_0         
	// 11464 21378:getfield        #12  <Field azh a>
	// 11465 21381:getfield        #86  <Field int azh.bT>
	// 11466 21384:iand            
	// 11467 21385:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 11468 21388:aload_0         
	// 11469 21389:getfield        #12  <Field azh a>
	// 11470 21392:astore_1        
		abyte0.W = ((azh) (abyte0)).ce ^ a.W;
	// 11471 21393:aload_1         
	// 11472 21394:aload_1         
	// 11473 21395:getfield        #393 <Field int azh.ce>
	// 11474 21398:aload_0         
	// 11475 21399:getfield        #12  <Field azh a>
	// 11476 21402:getfield        #249 <Field int azh.W>
	// 11477 21405:ixor            
	// 11478 21406:putfield        #249 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 11479 21409:aload_0         
	// 11480 21410:getfield        #12  <Field azh a>
	// 11481 21413:astore_1        
		abyte0.bX = ((azh) (abyte0)).W ^ a.bX;
	// 11482 21414:aload_1         
	// 11483 21415:aload_1         
	// 11484 21416:getfield        #249 <Field int azh.W>
	// 11485 21419:aload_0         
	// 11486 21420:getfield        #12  <Field azh a>
	// 11487 21423:getfield        #405 <Field int azh.bX>
	// 11488 21426:ixor            
	// 11489 21427:putfield        #405 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 11490 21430:aload_0         
	// 11491 21431:getfield        #12  <Field azh a>
	// 11492 21434:astore_1        
		abyte0.aD = ((azh) (abyte0)).bX ^ a.aD;
	// 11493 21435:aload_1         
	// 11494 21436:aload_1         
	// 11495 21437:getfield        #405 <Field int azh.bX>
	// 11496 21440:aload_0         
	// 11497 21441:getfield        #12  <Field azh a>
	// 11498 21444:getfield        #330 <Field int azh.aD>
	// 11499 21447:ixor            
	// 11500 21448:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11501 21451:aload_0         
	// 11502 21452:getfield        #12  <Field azh a>
	// 11503 21455:astore_1        
		abyte0.p = ((azh) (abyte0)).aD ^ a.p;
	// 11504 21456:aload_1         
	// 11505 21457:aload_1         
	// 11506 21458:getfield        #330 <Field int azh.aD>
	// 11507 21461:aload_0         
	// 11508 21462:getfield        #12  <Field azh a>
	// 11509 21465:getfield        #216 <Field int azh.p>
	// 11510 21468:ixor            
	// 11511 21469:putfield        #216 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 11512 21472:aload_0         
	// 11513 21473:getfield        #12  <Field azh a>
	// 11514 21476:astore_1        
		abyte0.aD = ((azh) (abyte0)).y & ~a.aI;
	// 11515 21477:aload_1         
	// 11516 21478:aload_1         
	// 11517 21479:getfield        #108 <Field int azh.y>
	// 11518 21482:aload_0         
	// 11519 21483:getfield        #12  <Field azh a>
	// 11520 21486:getfield        #114 <Field int azh.aI>
	// 11521 21489:iconst_m1       
	// 11522 21490:ixor            
	// 11523 21491:iand            
	// 11524 21492:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11525 21495:aload_0         
	// 11526 21496:getfield        #12  <Field azh a>
	// 11527 21499:astore_1        
		abyte0.aD = ((azh) (abyte0)).bZ ^ a.aD;
	// 11528 21500:aload_1         
	// 11529 21501:aload_1         
	// 11530 21502:getfield        #303 <Field int azh.bZ>
	// 11531 21505:aload_0         
	// 11532 21506:getfield        #12  <Field azh a>
	// 11533 21509:getfield        #330 <Field int azh.aD>
	// 11534 21512:ixor            
	// 11535 21513:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11536 21516:aload_0         
	// 11537 21517:getfield        #12  <Field azh a>
	// 11538 21520:astore_1        
		abyte0.aD = ((azh) (abyte0)).ay | a.aD;
	// 11539 21521:aload_1         
	// 11540 21522:aload_1         
	// 11541 21523:getfield        #150 <Field int azh.ay>
	// 11542 21526:aload_0         
	// 11543 21527:getfield        #12  <Field azh a>
	// 11544 21530:getfield        #330 <Field int azh.aD>
	// 11545 21533:ior             
	// 11546 21534:putfield        #330 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 11547 21537:aload_0         
	// 11548 21538:getfield        #12  <Field azh a>
	// 11549 21541:astore_1        
		abyte0.aD = ((azh) (abyte0)).s ^ a.aD;
	// 11550 21542:aload_1         
	// 11551 21543:aload_1         
	// 11552 21544:getfield        #483 <Field int azh.s>
	// 11553 21547:aload_0         
	// 11554 21548:getfield        #12  <Field azh a>
	// 11555 21551:getfield        #330 <Field int azh.aD>
	// 11556 21554:ixor            
	// 11557 21555:putfield        #330 <Field int azh.aD>
	// 11558 21558:return          
	}

	private final azh a;
}
