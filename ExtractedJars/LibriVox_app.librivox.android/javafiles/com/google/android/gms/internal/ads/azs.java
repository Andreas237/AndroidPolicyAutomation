// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azs
	implements azk
{

	private azs(azh azh1)
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

	azs(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azs(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.ag = ((azh) (abyte0)).bV ^ a.ag;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.bV>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.ag>
	//    9   17:ixor            
	//   10   18:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field azh a>
	//   13   25:astore_1        
		abyte0.bk = ((azh) (abyte0)).ag ^ a.bk;
	//   14   26:aload_1         
	//   15   27:aload_1         
	//   16   28:getfield        #29  <Field int azh.ag>
	//   17   31:aload_0         
	//   18   32:getfield        #12  <Field azh a>
	//   19   35:getfield        #32  <Field int azh.bk>
	//   20   38:ixor            
	//   21   39:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//   22   42:aload_0         
	//   23   43:getfield        #12  <Field azh a>
	//   24   46:astore_1        
		abyte0.bk = ((azh) (abyte0)).l | a.bk;
	//   25   47:aload_1         
	//   26   48:aload_1         
	//   27   49:getfield        #35  <Field int azh.l>
	//   28   52:aload_0         
	//   29   53:getfield        #12  <Field azh a>
	//   30   56:getfield        #32  <Field int azh.bk>
	//   31   59:ior             
	//   32   60:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//   33   63:aload_0         
	//   34   64:getfield        #12  <Field azh a>
	//   35   67:astore_1        
		abyte0.bJ = ((azh) (abyte0)).J | a.bJ;
	//   36   68:aload_1         
	//   37   69:aload_1         
	//   38   70:getfield        #38  <Field int azh.J>
	//   39   73:aload_0         
	//   40   74:getfield        #12  <Field azh a>
	//   41   77:getfield        #41  <Field int azh.bJ>
	//   42   80:ior             
	//   43   81:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//   44   84:aload_0         
	//   45   85:getfield        #12  <Field azh a>
	//   46   88:astore_1        
		abyte0.bJ = ((azh) (abyte0)).at ^ a.bJ;
	//   47   89:aload_1         
	//   48   90:aload_1         
	//   49   91:getfield        #44  <Field int azh.at>
	//   50   94:aload_0         
	//   51   95:getfield        #12  <Field azh a>
	//   52   98:getfield        #41  <Field int azh.bJ>
	//   53  101:ixor            
	//   54  102:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//   55  105:aload_0         
	//   56  106:getfield        #12  <Field azh a>
	//   57  109:astore_1        
		abyte0.ay = ((azh) (abyte0)).bJ ^ a.ay;
	//   58  110:aload_1         
	//   59  111:aload_1         
	//   60  112:getfield        #41  <Field int azh.bJ>
	//   61  115:aload_0         
	//   62  116:getfield        #12  <Field azh a>
	//   63  119:getfield        #47  <Field int azh.ay>
	//   64  122:ixor            
	//   65  123:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	//   66  126:aload_0         
	//   67  127:getfield        #12  <Field azh a>
	//   68  130:astore_1        
		abyte0.U = ((azh) (abyte0)).ay ^ a.U;
	//   69  131:aload_1         
	//   70  132:aload_1         
	//   71  133:getfield        #47  <Field int azh.ay>
	//   72  136:aload_0         
	//   73  137:getfield        #12  <Field azh a>
	//   74  140:getfield        #50  <Field int azh.U>
	//   75  143:ixor            
	//   76  144:putfield        #50  <Field int azh.U>
		abyte0 = ((byte []) (a));
	//   77  147:aload_0         
	//   78  148:getfield        #12  <Field azh a>
	//   79  151:astore_1        
		abyte0.ay = ((azh) (abyte0)).a & a.U;
	//   80  152:aload_1         
	//   81  153:aload_1         
	//   82  154:getfield        #52  <Field int azh.a>
	//   83  157:aload_0         
	//   84  158:getfield        #12  <Field azh a>
	//   85  161:getfield        #50  <Field int azh.U>
	//   86  164:iand            
	//   87  165:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	//   88  168:aload_0         
	//   89  169:getfield        #12  <Field azh a>
	//   90  172:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ay ^ a.ac;
	//   91  173:aload_1         
	//   92  174:aload_1         
	//   93  175:getfield        #47  <Field int azh.ay>
	//   94  178:aload_0         
	//   95  179:getfield        #12  <Field azh a>
	//   96  182:getfield        #55  <Field int azh.ac>
	//   97  185:ixor            
	//   98  186:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//   99  189:aload_0         
	//  100  190:getfield        #12  <Field azh a>
	//  101  193:astore_1        
		abyte0.at = ((azh) (abyte0)).U ^ a.a;
	//  102  194:aload_1         
	//  103  195:aload_1         
	//  104  196:getfield        #50  <Field int azh.U>
	//  105  199:aload_0         
	//  106  200:getfield        #12  <Field azh a>
	//  107  203:getfield        #52  <Field int azh.a>
	//  108  206:ixor            
	//  109  207:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  110  210:aload_0         
	//  111  211:getfield        #12  <Field azh a>
	//  112  214:astore_1        
		abyte0.ag = ((azh) (abyte0)).at ^ a.ac;
	//  113  215:aload_1         
	//  114  216:aload_1         
	//  115  217:getfield        #44  <Field int azh.at>
	//  116  220:aload_0         
	//  117  221:getfield        #12  <Field azh a>
	//  118  224:getfield        #55  <Field int azh.ac>
	//  119  227:ixor            
	//  120  228:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  121  231:aload_0         
	//  122  232:getfield        #12  <Field azh a>
	//  123  235:astore_1        
		abyte0.bV = ((azh) (abyte0)).at & ~a.E;
	//  124  236:aload_1         
	//  125  237:aload_1         
	//  126  238:getfield        #44  <Field int azh.at>
	//  127  241:aload_0         
	//  128  242:getfield        #12  <Field azh a>
	//  129  245:getfield        #58  <Field int azh.E>
	//  130  248:iconst_m1       
	//  131  249:ixor            
	//  132  250:iand            
	//  133  251:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  134  254:aload_0         
	//  135  255:getfield        #12  <Field azh a>
	//  136  258:astore_1        
		abyte0.bV = ((azh) (abyte0)).ag ^ a.bV;
	//  137  259:aload_1         
	//  138  260:aload_1         
	//  139  261:getfield        #29  <Field int azh.ag>
	//  140  264:aload_0         
	//  141  265:getfield        #12  <Field azh a>
	//  142  268:getfield        #26  <Field int azh.bV>
	//  143  271:ixor            
	//  144  272:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  145  275:aload_0         
	//  146  276:getfield        #12  <Field azh a>
	//  147  279:astore_1        
		abyte0.an = ((azh) (abyte0)).ac & a.at;
	//  148  280:aload_1         
	//  149  281:aload_1         
	//  150  282:getfield        #55  <Field int azh.ac>
	//  151  285:aload_0         
	//  152  286:getfield        #12  <Field azh a>
	//  153  289:getfield        #44  <Field int azh.at>
	//  154  292:iand            
	//  155  293:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	//  156  296:aload_0         
	//  157  297:getfield        #12  <Field azh a>
	//  158  300:astore_1        
		abyte0.an = ((azh) (abyte0)).E & ~a.an;
	//  159  301:aload_1         
	//  160  302:aload_1         
	//  161  303:getfield        #58  <Field int azh.E>
	//  162  306:aload_0         
	//  163  307:getfield        #12  <Field azh a>
	//  164  310:getfield        #61  <Field int azh.an>
	//  165  313:iconst_m1       
	//  166  314:ixor            
	//  167  315:iand            
	//  168  316:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	//  169  319:aload_0         
	//  170  320:getfield        #12  <Field azh a>
	//  171  323:astore_1        
		abyte0.ah = ((azh) (abyte0)).U | a.a;
	//  172  324:aload_1         
	//  173  325:aload_1         
	//  174  326:getfield        #50  <Field int azh.U>
	//  175  329:aload_0         
	//  176  330:getfield        #12  <Field azh a>
	//  177  333:getfield        #52  <Field int azh.a>
	//  178  336:ior             
	//  179  337:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	//  180  340:aload_0         
	//  181  341:getfield        #12  <Field azh a>
	//  182  344:astore_1        
		abyte0.ao = ((azh) (abyte0)).ah ^ a.ao;
	//  183  345:aload_1         
	//  184  346:aload_1         
	//  185  347:getfield        #64  <Field int azh.ah>
	//  186  350:aload_0         
	//  187  351:getfield        #12  <Field azh a>
	//  188  354:getfield        #67  <Field int azh.ao>
	//  189  357:ixor            
	//  190  358:putfield        #67  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//  191  361:aload_0         
	//  192  362:getfield        #12  <Field azh a>
	//  193  365:astore_1        
		abyte0.bx = ((azh) (abyte0)).ao ^ a.bx;
	//  194  366:aload_1         
	//  195  367:aload_1         
	//  196  368:getfield        #67  <Field int azh.ao>
	//  197  371:aload_0         
	//  198  372:getfield        #12  <Field azh a>
	//  199  375:getfield        #70  <Field int azh.bx>
	//  200  378:ixor            
	//  201  379:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  202  382:aload_0         
	//  203  383:getfield        #12  <Field azh a>
	//  204  386:astore_1        
		abyte0.aV = ((azh) (abyte0)).U ^ a.aV;
	//  205  387:aload_1         
	//  206  388:aload_1         
	//  207  389:getfield        #50  <Field int azh.U>
	//  208  392:aload_0         
	//  209  393:getfield        #12  <Field azh a>
	//  210  396:getfield        #73  <Field int azh.aV>
	//  211  399:ixor            
	//  212  400:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  213  403:aload_0         
	//  214  404:getfield        #12  <Field azh a>
	//  215  407:astore_1        
		abyte0.ao = ((azh) (abyte0)).E & ~a.aV;
	//  216  408:aload_1         
	//  217  409:aload_1         
	//  218  410:getfield        #58  <Field int azh.E>
	//  219  413:aload_0         
	//  220  414:getfield        #12  <Field azh a>
	//  221  417:getfield        #73  <Field int azh.aV>
	//  222  420:iconst_m1       
	//  223  421:ixor            
	//  224  422:iand            
	//  225  423:putfield        #67  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//  226  426:aload_0         
	//  227  427:getfield        #12  <Field azh a>
	//  228  430:astore_1        
		abyte0.ah = ((azh) (abyte0)).a & ~a.U;
	//  229  431:aload_1         
	//  230  432:aload_1         
	//  231  433:getfield        #52  <Field int azh.a>
	//  232  436:aload_0         
	//  233  437:getfield        #12  <Field azh a>
	//  234  440:getfield        #50  <Field int azh.U>
	//  235  443:iconst_m1       
	//  236  444:ixor            
	//  237  445:iand            
	//  238  446:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	//  239  449:aload_0         
	//  240  450:getfield        #12  <Field azh a>
	//  241  453:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ah ^ a.bZ;
	//  242  454:aload_1         
	//  243  455:aload_1         
	//  244  456:getfield        #64  <Field int azh.ah>
	//  245  459:aload_0         
	//  246  460:getfield        #12  <Field azh a>
	//  247  463:getfield        #76  <Field int azh.bZ>
	//  248  466:ixor            
	//  249  467:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  250  470:aload_0         
	//  251  471:getfield        #12  <Field azh a>
	//  252  474:astore_1        
		abyte0.bz = ((azh) (abyte0)).bZ & a.E;
	//  253  475:aload_1         
	//  254  476:aload_1         
	//  255  477:getfield        #76  <Field int azh.bZ>
	//  256  480:aload_0         
	//  257  481:getfield        #12  <Field azh a>
	//  258  484:getfield        #58  <Field int azh.E>
	//  259  487:iand            
	//  260  488:putfield        #79  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  261  491:aload_0         
	//  262  492:getfield        #12  <Field azh a>
	//  263  495:astore_1        
		abyte0.bz = ((azh) (abyte0)).ag ^ a.bz;
	//  264  496:aload_1         
	//  265  497:aload_1         
	//  266  498:getfield        #29  <Field int azh.ag>
	//  267  501:aload_0         
	//  268  502:getfield        #12  <Field azh a>
	//  269  505:getfield        #79  <Field int azh.bz>
	//  270  508:ixor            
	//  271  509:putfield        #79  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  272  512:aload_0         
	//  273  513:getfield        #12  <Field azh a>
	//  274  516:astore_1        
		abyte0.aO = ((azh) (abyte0)).a & ~a.ah;
	//  275  517:aload_1         
	//  276  518:aload_1         
	//  277  519:getfield        #52  <Field int azh.a>
	//  278  522:aload_0         
	//  279  523:getfield        #12  <Field azh a>
	//  280  526:getfield        #64  <Field int azh.ah>
	//  281  529:iconst_m1       
	//  282  530:ixor            
	//  283  531:iand            
	//  284  532:putfield        #82  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	//  285  535:aload_0         
	//  286  536:getfield        #12  <Field azh a>
	//  287  539:astore_1        
		abyte0.bw = ((azh) (abyte0)).ac & ~a.aO;
	//  288  540:aload_1         
	//  289  541:aload_1         
	//  290  542:getfield        #55  <Field int azh.ac>
	//  291  545:aload_0         
	//  292  546:getfield        #12  <Field azh a>
	//  293  549:getfield        #82  <Field int azh.aO>
	//  294  552:iconst_m1       
	//  295  553:ixor            
	//  296  554:iand            
	//  297  555:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  298  558:aload_0         
	//  299  559:getfield        #12  <Field azh a>
	//  300  562:astore_1        
		abyte0.bw = ((azh) (abyte0)).ay ^ a.bw;
	//  301  563:aload_1         
	//  302  564:aload_1         
	//  303  565:getfield        #47  <Field int azh.ay>
	//  304  568:aload_0         
	//  305  569:getfield        #12  <Field azh a>
	//  306  572:getfield        #85  <Field int azh.bw>
	//  307  575:ixor            
	//  308  576:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  309  579:aload_0         
	//  310  580:getfield        #12  <Field azh a>
	//  311  583:astore_1        
		abyte0.bc = ((azh) (abyte0)).aO ^ a.bc;
	//  312  584:aload_1         
	//  313  585:aload_1         
	//  314  586:getfield        #82  <Field int azh.aO>
	//  315  589:aload_0         
	//  316  590:getfield        #12  <Field azh a>
	//  317  593:getfield        #88  <Field int azh.bc>
	//  318  596:ixor            
	//  319  597:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  320  600:aload_0         
	//  321  601:getfield        #12  <Field azh a>
	//  322  604:astore_1        
		abyte0.aW = ((azh) (abyte0)).bc ^ a.aW;
	//  323  605:aload_1         
	//  324  606:aload_1         
	//  325  607:getfield        #88  <Field int azh.bc>
	//  326  610:aload_0         
	//  327  611:getfield        #12  <Field azh a>
	//  328  614:getfield        #91  <Field int azh.aW>
	//  329  617:ixor            
	//  330  618:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  331  621:aload_0         
	//  332  622:getfield        #12  <Field azh a>
	//  333  625:astore_1        
		abyte0.bc = ((azh) (abyte0)).ac & ~a.ah;
	//  334  626:aload_1         
	//  335  627:aload_1         
	//  336  628:getfield        #55  <Field int azh.ac>
	//  337  631:aload_0         
	//  338  632:getfield        #12  <Field azh a>
	//  339  635:getfield        #64  <Field int azh.ah>
	//  340  638:iconst_m1       
	//  341  639:ixor            
	//  342  640:iand            
	//  343  641:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  344  644:aload_0         
	//  345  645:getfield        #12  <Field azh a>
	//  346  648:astore_1        
		abyte0.bc = ((azh) (abyte0)).ah ^ a.bc;
	//  347  649:aload_1         
	//  348  650:aload_1         
	//  349  651:getfield        #64  <Field int azh.ah>
	//  350  654:aload_0         
	//  351  655:getfield        #12  <Field azh a>
	//  352  658:getfield        #88  <Field int azh.bc>
	//  353  661:ixor            
	//  354  662:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  355  665:aload_0         
	//  356  666:getfield        #12  <Field azh a>
	//  357  669:astore_1        
		abyte0.bc = ((azh) (abyte0)).bc & a.E;
	//  358  670:aload_1         
	//  359  671:aload_1         
	//  360  672:getfield        #88  <Field int azh.bc>
	//  361  675:aload_0         
	//  362  676:getfield        #12  <Field azh a>
	//  363  679:getfield        #58  <Field int azh.E>
	//  364  682:iand            
	//  365  683:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  366  686:aload_0         
	//  367  687:getfield        #12  <Field azh a>
	//  368  690:astore_1        
		abyte0.bc = ((azh) (abyte0)).ag ^ a.bc;
	//  369  691:aload_1         
	//  370  692:aload_1         
	//  371  693:getfield        #29  <Field int azh.ag>
	//  372  696:aload_0         
	//  373  697:getfield        #12  <Field azh a>
	//  374  700:getfield        #88  <Field int azh.bc>
	//  375  703:ixor            
	//  376  704:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  377  707:aload_0         
	//  378  708:getfield        #12  <Field azh a>
	//  379  711:astore_1        
		abyte0.ay = ((azh) (abyte0)).ac & a.ah;
	//  380  712:aload_1         
	//  381  713:aload_1         
	//  382  714:getfield        #55  <Field int azh.ac>
	//  383  717:aload_0         
	//  384  718:getfield        #12  <Field azh a>
	//  385  721:getfield        #64  <Field int azh.ah>
	//  386  724:iand            
	//  387  725:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	//  388  728:aload_0         
	//  389  729:getfield        #12  <Field azh a>
	//  390  732:astore_1        
		abyte0.ao = ((azh) (abyte0)).ay ^ a.ao;
	//  391  733:aload_1         
	//  392  734:aload_1         
	//  393  735:getfield        #47  <Field int azh.ay>
	//  394  738:aload_0         
	//  395  739:getfield        #12  <Field azh a>
	//  396  742:getfield        #67  <Field int azh.ao>
	//  397  745:ixor            
	//  398  746:putfield        #67  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//  399  749:aload_0         
	//  400  750:getfield        #12  <Field azh a>
	//  401  753:astore_1        
		abyte0.ay = ((azh) (abyte0)).ac & ~a.ah;
	//  402  754:aload_1         
	//  403  755:aload_1         
	//  404  756:getfield        #55  <Field int azh.ac>
	//  405  759:aload_0         
	//  406  760:getfield        #12  <Field azh a>
	//  407  763:getfield        #64  <Field int azh.ah>
	//  408  766:iconst_m1       
	//  409  767:ixor            
	//  410  768:iand            
	//  411  769:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	//  412  772:aload_0         
	//  413  773:getfield        #12  <Field azh a>
	//  414  776:astore_1        
		abyte0.ay = ((azh) (abyte0)).U ^ a.ay;
	//  415  777:aload_1         
	//  416  778:aload_1         
	//  417  779:getfield        #50  <Field int azh.U>
	//  418  782:aload_0         
	//  419  783:getfield        #12  <Field azh a>
	//  420  786:getfield        #47  <Field int azh.ay>
	//  421  789:ixor            
	//  422  790:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	//  423  793:aload_0         
	//  424  794:getfield        #12  <Field azh a>
	//  425  797:astore_1        
		abyte0.ay = ((azh) (abyte0)).E & ~a.ay;
	//  426  798:aload_1         
	//  427  799:aload_1         
	//  428  800:getfield        #58  <Field int azh.E>
	//  429  803:aload_0         
	//  430  804:getfield        #12  <Field azh a>
	//  431  807:getfield        #47  <Field int azh.ay>
	//  432  810:iconst_m1       
	//  433  811:ixor            
	//  434  812:iand            
	//  435  813:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	//  436  816:aload_0         
	//  437  817:getfield        #12  <Field azh a>
	//  438  820:astore_1        
		abyte0.ay = ((azh) (abyte0)).bw ^ a.ay;
	//  439  821:aload_1         
	//  440  822:aload_1         
	//  441  823:getfield        #85  <Field int azh.bw>
	//  442  826:aload_0         
	//  443  827:getfield        #12  <Field azh a>
	//  444  830:getfield        #47  <Field int azh.ay>
	//  445  833:ixor            
	//  446  834:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	//  447  837:aload_0         
	//  448  838:getfield        #12  <Field azh a>
	//  449  841:astore_1        
		abyte0.bw = ((azh) (abyte0)).U & ~a.a;
	//  450  842:aload_1         
	//  451  843:aload_1         
	//  452  844:getfield        #50  <Field int azh.U>
	//  453  847:aload_0         
	//  454  848:getfield        #12  <Field azh a>
	//  455  851:getfield        #52  <Field int azh.a>
	//  456  854:iconst_m1       
	//  457  855:ixor            
	//  458  856:iand            
	//  459  857:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  460  860:aload_0         
	//  461  861:getfield        #12  <Field azh a>
	//  462  864:astore_1        
		abyte0.aC = ((azh) (abyte0)).bw | a.a;
	//  463  865:aload_1         
	//  464  866:aload_1         
	//  465  867:getfield        #85  <Field int azh.bw>
	//  466  870:aload_0         
	//  467  871:getfield        #12  <Field azh a>
	//  468  874:getfield        #52  <Field int azh.a>
	//  469  877:ior             
	//  470  878:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  471  881:aload_0         
	//  472  882:getfield        #12  <Field azh a>
	//  473  885:astore_1        
		abyte0.aC = ((azh) (abyte0)).ac & a.aC;
	//  474  886:aload_1         
	//  475  887:aload_1         
	//  476  888:getfield        #55  <Field int azh.ac>
	//  477  891:aload_0         
	//  478  892:getfield        #12  <Field azh a>
	//  479  895:getfield        #94  <Field int azh.aC>
	//  480  898:iand            
	//  481  899:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  482  902:aload_0         
	//  483  903:getfield        #12  <Field azh a>
	//  484  906:astore_1        
		abyte0.aC = ((azh) (abyte0)).at ^ a.aC;
	//  485  907:aload_1         
	//  486  908:aload_1         
	//  487  909:getfield        #44  <Field int azh.at>
	//  488  912:aload_0         
	//  489  913:getfield        #12  <Field azh a>
	//  490  916:getfield        #94  <Field int azh.aC>
	//  491  919:ixor            
	//  492  920:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  493  923:aload_0         
	//  494  924:getfield        #12  <Field azh a>
	//  495  927:astore_1        
		abyte0.aC = ((azh) (abyte0)).E & a.aC;
	//  496  928:aload_1         
	//  497  929:aload_1         
	//  498  930:getfield        #58  <Field int azh.E>
	//  499  933:aload_0         
	//  500  934:getfield        #12  <Field azh a>
	//  501  937:getfield        #94  <Field int azh.aC>
	//  502  940:iand            
	//  503  941:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  504  944:aload_0         
	//  505  945:getfield        #12  <Field azh a>
	//  506  948:astore_1        
		abyte0.aC = ((azh) (abyte0)).bJ ^ a.aC;
	//  507  949:aload_1         
	//  508  950:aload_1         
	//  509  951:getfield        #41  <Field int azh.bJ>
	//  510  954:aload_0         
	//  511  955:getfield        #12  <Field azh a>
	//  512  958:getfield        #94  <Field int azh.aC>
	//  513  961:ixor            
	//  514  962:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  515  965:aload_0         
	//  516  966:getfield        #12  <Field azh a>
	//  517  969:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ac & a.bw;
	//  518  970:aload_1         
	//  519  971:aload_1         
	//  520  972:getfield        #55  <Field int azh.ac>
	//  521  975:aload_0         
	//  522  976:getfield        #12  <Field azh a>
	//  523  979:getfield        #85  <Field int azh.bw>
	//  524  982:iand            
	//  525  983:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  526  986:aload_0         
	//  527  987:getfield        #12  <Field azh a>
	//  528  990:astore_1        
		abyte0.bJ = ((azh) (abyte0)).U ^ a.bJ;
	//  529  991:aload_1         
	//  530  992:aload_1         
	//  531  993:getfield        #50  <Field int azh.U>
	//  532  996:aload_0         
	//  533  997:getfield        #12  <Field azh a>
	//  534 1000:getfield        #41  <Field int azh.bJ>
	//  535 1003:ixor            
	//  536 1004:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  537 1007:aload_0         
	//  538 1008:getfield        #12  <Field azh a>
	//  539 1011:astore_1        
		abyte0.an = ((azh) (abyte0)).bJ ^ a.an;
	//  540 1012:aload_1         
	//  541 1013:aload_1         
	//  542 1014:getfield        #41  <Field int azh.bJ>
	//  543 1017:aload_0         
	//  544 1018:getfield        #12  <Field azh a>
	//  545 1021:getfield        #61  <Field int azh.an>
	//  546 1024:ixor            
	//  547 1025:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	//  548 1028:aload_0         
	//  549 1029:getfield        #12  <Field azh a>
	//  550 1032:astore_1        
		abyte0.at = ((azh) (abyte0)).E & ~a.bJ;
	//  551 1033:aload_1         
	//  552 1034:aload_1         
	//  553 1035:getfield        #58  <Field int azh.E>
	//  554 1038:aload_0         
	//  555 1039:getfield        #12  <Field azh a>
	//  556 1042:getfield        #41  <Field int azh.bJ>
	//  557 1045:iconst_m1       
	//  558 1046:ixor            
	//  559 1047:iand            
	//  560 1048:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  561 1051:aload_0         
	//  562 1052:getfield        #12  <Field azh a>
	//  563 1055:astore_1        
		abyte0.at = ((azh) (abyte0)).ag ^ a.at;
	//  564 1056:aload_1         
	//  565 1057:aload_1         
	//  566 1058:getfield        #29  <Field int azh.ag>
	//  567 1061:aload_0         
	//  568 1062:getfield        #12  <Field azh a>
	//  569 1065:getfield        #44  <Field int azh.at>
	//  570 1068:ixor            
	//  571 1069:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  572 1072:aload_0         
	//  573 1073:getfield        #12  <Field azh a>
	//  574 1076:astore_1        
		abyte0.ag = ((azh) (abyte0)).ac & a.bw;
	//  575 1077:aload_1         
	//  576 1078:aload_1         
	//  577 1079:getfield        #55  <Field int azh.ac>
	//  578 1082:aload_0         
	//  579 1083:getfield        #12  <Field azh a>
	//  580 1086:getfield        #85  <Field int azh.bw>
	//  581 1089:iand            
	//  582 1090:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  583 1093:aload_0         
	//  584 1094:getfield        #12  <Field azh a>
	//  585 1097:astore_1        
		abyte0.ag = ((azh) (abyte0)).ag & a.E;
	//  586 1098:aload_1         
	//  587 1099:aload_1         
	//  588 1100:getfield        #29  <Field int azh.ag>
	//  589 1103:aload_0         
	//  590 1104:getfield        #12  <Field azh a>
	//  591 1107:getfield        #58  <Field int azh.E>
	//  592 1110:iand            
	//  593 1111:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  594 1114:aload_0         
	//  595 1115:getfield        #12  <Field azh a>
	//  596 1118:astore_1        
		abyte0.ch = ((azh) (abyte0)).bw ^ a.ch;
	//  597 1119:aload_1         
	//  598 1120:aload_1         
	//  599 1121:getfield        #85  <Field int azh.bw>
	//  600 1124:aload_0         
	//  601 1125:getfield        #12  <Field azh a>
	//  602 1128:getfield        #97  <Field int azh.ch>
	//  603 1131:ixor            
	//  604 1132:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	//  605 1135:aload_0         
	//  606 1136:getfield        #12  <Field azh a>
	//  607 1139:astore_1        
		abyte0.aI = ((azh) (abyte0)).ch & ~a.E;
	//  608 1140:aload_1         
	//  609 1141:aload_1         
	//  610 1142:getfield        #97  <Field int azh.ch>
	//  611 1145:aload_0         
	//  612 1146:getfield        #12  <Field azh a>
	//  613 1149:getfield        #58  <Field int azh.E>
	//  614 1152:iconst_m1       
	//  615 1153:ixor            
	//  616 1154:iand            
	//  617 1155:putfield        #100 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	//  618 1158:aload_0         
	//  619 1159:getfield        #12  <Field azh a>
	//  620 1162:astore_1        
		abyte0.aI = ((azh) (abyte0)).aV ^ a.aI;
	//  621 1163:aload_1         
	//  622 1164:aload_1         
	//  623 1165:getfield        #73  <Field int azh.aV>
	//  624 1168:aload_0         
	//  625 1169:getfield        #12  <Field azh a>
	//  626 1172:getfield        #100 <Field int azh.aI>
	//  627 1175:ixor            
	//  628 1176:putfield        #100 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	//  629 1179:aload_0         
	//  630 1180:getfield        #12  <Field azh a>
	//  631 1183:astore_1        
		abyte0.ch = ((azh) (abyte0)).E | a.ch;
	//  632 1184:aload_1         
	//  633 1185:aload_1         
	//  634 1186:getfield        #58  <Field int azh.E>
	//  635 1189:aload_0         
	//  636 1190:getfield        #12  <Field azh a>
	//  637 1193:getfield        #97  <Field int azh.ch>
	//  638 1196:ior             
	//  639 1197:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	//  640 1200:aload_0         
	//  641 1201:getfield        #12  <Field azh a>
	//  642 1204:astore_1        
		abyte0.ch = ((azh) (abyte0)).bZ ^ a.ch;
	//  643 1205:aload_1         
	//  644 1206:aload_1         
	//  645 1207:getfield        #76  <Field int azh.bZ>
	//  646 1210:aload_0         
	//  647 1211:getfield        #12  <Field azh a>
	//  648 1214:getfield        #97  <Field int azh.ch>
	//  649 1217:ixor            
	//  650 1218:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	//  651 1221:aload_0         
	//  652 1222:getfield        #12  <Field azh a>
	//  653 1225:astore_1        
		abyte0.aV = ((azh) (abyte0)).ac & a.bw;
	//  654 1226:aload_1         
	//  655 1227:aload_1         
	//  656 1228:getfield        #55  <Field int azh.ac>
	//  657 1231:aload_0         
	//  658 1232:getfield        #12  <Field azh a>
	//  659 1235:getfield        #85  <Field int azh.bw>
	//  660 1238:iand            
	//  661 1239:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  662 1242:aload_0         
	//  663 1243:getfield        #12  <Field azh a>
	//  664 1246:astore_1        
		abyte0.aV = ((azh) (abyte0)).ah ^ a.aV;
	//  665 1247:aload_1         
	//  666 1248:aload_1         
	//  667 1249:getfield        #64  <Field int azh.ah>
	//  668 1252:aload_0         
	//  669 1253:getfield        #12  <Field azh a>
	//  670 1256:getfield        #73  <Field int azh.aV>
	//  671 1259:ixor            
	//  672 1260:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  673 1263:aload_0         
	//  674 1264:getfield        #12  <Field azh a>
	//  675 1267:astore_1        
		abyte0.aV = ((azh) (abyte0)).E | a.aV;
	//  676 1268:aload_1         
	//  677 1269:aload_1         
	//  678 1270:getfield        #58  <Field int azh.E>
	//  679 1273:aload_0         
	//  680 1274:getfield        #12  <Field azh a>
	//  681 1277:getfield        #73  <Field int azh.aV>
	//  682 1280:ior             
	//  683 1281:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  684 1284:aload_0         
	//  685 1285:getfield        #12  <Field azh a>
	//  686 1288:astore_1        
		abyte0.aV = ((azh) (abyte0)).bJ ^ a.aV;
	//  687 1289:aload_1         
	//  688 1290:aload_1         
	//  689 1291:getfield        #41  <Field int azh.bJ>
	//  690 1294:aload_0         
	//  691 1295:getfield        #12  <Field azh a>
	//  692 1298:getfield        #73  <Field int azh.aV>
	//  693 1301:ixor            
	//  694 1302:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  695 1305:aload_0         
	//  696 1306:getfield        #12  <Field azh a>
	//  697 1309:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ac & ~a.bw;
	//  698 1310:aload_1         
	//  699 1311:aload_1         
	//  700 1312:getfield        #55  <Field int azh.ac>
	//  701 1315:aload_0         
	//  702 1316:getfield        #12  <Field azh a>
	//  703 1319:getfield        #85  <Field int azh.bw>
	//  704 1322:iconst_m1       
	//  705 1323:ixor            
	//  706 1324:iand            
	//  707 1325:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  708 1328:aload_0         
	//  709 1329:getfield        #12  <Field azh a>
	//  710 1332:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bw ^ a.bJ;
	//  711 1333:aload_1         
	//  712 1334:aload_1         
	//  713 1335:getfield        #85  <Field int azh.bw>
	//  714 1338:aload_0         
	//  715 1339:getfield        #12  <Field azh a>
	//  716 1342:getfield        #41  <Field int azh.bJ>
	//  717 1345:ixor            
	//  718 1346:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  719 1349:aload_0         
	//  720 1350:getfield        #12  <Field azh a>
	//  721 1353:astore_1        
		abyte0.bJ = ((azh) (abyte0)).E & a.bJ;
	//  722 1354:aload_1         
	//  723 1355:aload_1         
	//  724 1356:getfield        #58  <Field int azh.E>
	//  725 1359:aload_0         
	//  726 1360:getfield        #12  <Field azh a>
	//  727 1363:getfield        #41  <Field int azh.bJ>
	//  728 1366:iand            
	//  729 1367:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  730 1370:aload_0         
	//  731 1371:getfield        #12  <Field azh a>
	//  732 1374:astore_1        
		abyte0.bJ = ((azh) (abyte0)).U ^ a.bJ;
	//  733 1375:aload_1         
	//  734 1376:aload_1         
	//  735 1377:getfield        #50  <Field int azh.U>
	//  736 1380:aload_0         
	//  737 1381:getfield        #12  <Field azh a>
	//  738 1384:getfield        #41  <Field int azh.bJ>
	//  739 1387:ixor            
	//  740 1388:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  741 1391:aload_0         
	//  742 1392:getfield        #12  <Field azh a>
	//  743 1395:astore_1        
		abyte0.bw = ((azh) (abyte0)).ac & a.bw;
	//  744 1396:aload_1         
	//  745 1397:aload_1         
	//  746 1398:getfield        #55  <Field int azh.ac>
	//  747 1401:aload_0         
	//  748 1402:getfield        #12  <Field azh a>
	//  749 1405:getfield        #85  <Field int azh.bw>
	//  750 1408:iand            
	//  751 1409:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  752 1412:aload_0         
	//  753 1413:getfield        #12  <Field azh a>
	//  754 1416:astore_1        
		abyte0.bw = ((azh) (abyte0)).a ^ a.bw;
	//  755 1417:aload_1         
	//  756 1418:aload_1         
	//  757 1419:getfield        #52  <Field int azh.a>
	//  758 1422:aload_0         
	//  759 1423:getfield        #12  <Field azh a>
	//  760 1426:getfield        #85  <Field int azh.bw>
	//  761 1429:ixor            
	//  762 1430:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  763 1433:aload_0         
	//  764 1434:getfield        #12  <Field azh a>
	//  765 1437:astore_1        
		abyte0.bw = ((azh) (abyte0)).E | a.bw;
	//  766 1438:aload_1         
	//  767 1439:aload_1         
	//  768 1440:getfield        #58  <Field int azh.E>
	//  769 1443:aload_0         
	//  770 1444:getfield        #12  <Field azh a>
	//  771 1447:getfield        #85  <Field int azh.bw>
	//  772 1450:ior             
	//  773 1451:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  774 1454:aload_0         
	//  775 1455:getfield        #12  <Field azh a>
	//  776 1458:astore_1        
		abyte0.bw = ((azh) (abyte0)).bZ ^ a.bw;
	//  777 1459:aload_1         
	//  778 1460:aload_1         
	//  779 1461:getfield        #76  <Field int azh.bZ>
	//  780 1464:aload_0         
	//  781 1465:getfield        #12  <Field azh a>
	//  782 1468:getfield        #85  <Field int azh.bw>
	//  783 1471:ixor            
	//  784 1472:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  785 1475:aload_0         
	//  786 1476:getfield        #12  <Field azh a>
	//  787 1479:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ac & a.U;
	//  788 1480:aload_1         
	//  789 1481:aload_1         
	//  790 1482:getfield        #55  <Field int azh.ac>
	//  791 1485:aload_0         
	//  792 1486:getfield        #12  <Field azh a>
	//  793 1489:getfield        #50  <Field int azh.U>
	//  794 1492:iand            
	//  795 1493:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  796 1496:aload_0         
	//  797 1497:getfield        #12  <Field azh a>
	//  798 1500:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aO ^ a.bZ;
	//  799 1501:aload_1         
	//  800 1502:aload_1         
	//  801 1503:getfield        #82  <Field int azh.aO>
	//  802 1506:aload_0         
	//  803 1507:getfield        #12  <Field azh a>
	//  804 1510:getfield        #76  <Field int azh.bZ>
	//  805 1513:ixor            
	//  806 1514:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  807 1517:aload_0         
	//  808 1518:getfield        #12  <Field azh a>
	//  809 1521:astore_1        
		abyte0.ag = ((azh) (abyte0)).bZ ^ a.ag;
	//  810 1522:aload_1         
	//  811 1523:aload_1         
	//  812 1524:getfield        #76  <Field int azh.bZ>
	//  813 1527:aload_0         
	//  814 1528:getfield        #12  <Field azh a>
	//  815 1531:getfield        #29  <Field int azh.ag>
	//  816 1534:ixor            
	//  817 1535:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  818 1538:aload_0         
	//  819 1539:getfield        #12  <Field azh a>
	//  820 1542:astore_1        
		abyte0.bZ = ((azh) (abyte0)).t & a.J;
	//  821 1543:aload_1         
	//  822 1544:aload_1         
	//  823 1545:getfield        #103 <Field int azh.t>
	//  824 1548:aload_0         
	//  825 1549:getfield        #12  <Field azh a>
	//  826 1552:getfield        #38  <Field int azh.J>
	//  827 1555:iand            
	//  828 1556:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  829 1559:aload_0         
	//  830 1560:getfield        #12  <Field azh a>
	//  831 1563:astore_1        
		abyte0.ci = ((azh) (abyte0)).bZ ^ a.ci;
	//  832 1564:aload_1         
	//  833 1565:aload_1         
	//  834 1566:getfield        #76  <Field int azh.bZ>
	//  835 1569:aload_0         
	//  836 1570:getfield        #12  <Field azh a>
	//  837 1573:getfield        #106 <Field int azh.ci>
	//  838 1576:ixor            
	//  839 1577:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  840 1580:aload_0         
	//  841 1581:getfield        #12  <Field azh a>
	//  842 1584:astore_1        
		abyte0.ci = ((azh) (abyte0)).af & a.ci;
	//  843 1585:aload_1         
	//  844 1586:aload_1         
	//  845 1587:getfield        #109 <Field int azh.af>
	//  846 1590:aload_0         
	//  847 1591:getfield        #12  <Field azh a>
	//  848 1594:getfield        #106 <Field int azh.ci>
	//  849 1597:iand            
	//  850 1598:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  851 1601:aload_0         
	//  852 1602:getfield        #12  <Field azh a>
	//  853 1605:astore_1        
		abyte0.ci = ((azh) (abyte0)).aP ^ a.ci;
	//  854 1606:aload_1         
	//  855 1607:aload_1         
	//  856 1608:getfield        #112 <Field int azh.aP>
	//  857 1611:aload_0         
	//  858 1612:getfield        #12  <Field azh a>
	//  859 1615:getfield        #106 <Field int azh.ci>
	//  860 1618:ixor            
	//  861 1619:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  862 1622:aload_0         
	//  863 1623:getfield        #12  <Field azh a>
	//  864 1626:astore_1        
		abyte0.bD = ((azh) (abyte0)).ci ^ a.bD;
	//  865 1627:aload_1         
	//  866 1628:aload_1         
	//  867 1629:getfield        #106 <Field int azh.ci>
	//  868 1632:aload_0         
	//  869 1633:getfield        #12  <Field azh a>
	//  870 1636:getfield        #115 <Field int azh.bD>
	//  871 1639:ixor            
	//  872 1640:putfield        #115 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  873 1643:aload_0         
	//  874 1644:getfield        #12  <Field azh a>
	//  875 1647:astore_1        
		abyte0.ci = ((azh) (abyte0)).bZ & ~a.B;
	//  876 1648:aload_1         
	//  877 1649:aload_1         
	//  878 1650:getfield        #76  <Field int azh.bZ>
	//  879 1653:aload_0         
	//  880 1654:getfield        #12  <Field azh a>
	//  881 1657:getfield        #118 <Field int azh.B>
	//  882 1660:iconst_m1       
	//  883 1661:ixor            
	//  884 1662:iand            
	//  885 1663:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  886 1666:aload_0         
	//  887 1667:getfield        #12  <Field azh a>
	//  888 1670:astore_1        
		abyte0.ci = ((azh) (abyte0)).bd ^ a.ci;
	//  889 1671:aload_1         
	//  890 1672:aload_1         
	//  891 1673:getfield        #121 <Field int azh.bd>
	//  892 1676:aload_0         
	//  893 1677:getfield        #12  <Field azh a>
	//  894 1680:getfield        #106 <Field int azh.ci>
	//  895 1683:ixor            
	//  896 1684:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  897 1687:aload_0         
	//  898 1688:getfield        #12  <Field azh a>
	//  899 1691:astore_1        
		abyte0.ci = ((azh) (abyte0)).af & ~a.ci;
	//  900 1692:aload_1         
	//  901 1693:aload_1         
	//  902 1694:getfield        #109 <Field int azh.af>
	//  903 1697:aload_0         
	//  904 1698:getfield        #12  <Field azh a>
	//  905 1701:getfield        #106 <Field int azh.ci>
	//  906 1704:iconst_m1       
	//  907 1705:ixor            
	//  908 1706:iand            
	//  909 1707:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  910 1710:aload_0         
	//  911 1711:getfield        #12  <Field azh a>
	//  912 1714:astore_1        
		abyte0.ci = ((azh) (abyte0)).bi ^ a.ci;
	//  913 1715:aload_1         
	//  914 1716:aload_1         
	//  915 1717:getfield        #124 <Field int azh.bi>
	//  916 1720:aload_0         
	//  917 1721:getfield        #12  <Field azh a>
	//  918 1724:getfield        #106 <Field int azh.ci>
	//  919 1727:ixor            
	//  920 1728:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  921 1731:aload_0         
	//  922 1732:getfield        #12  <Field azh a>
	//  923 1735:astore_1        
		abyte0.ci = ((azh) (abyte0)).d | a.ci;
	//  924 1736:aload_1         
	//  925 1737:aload_1         
	//  926 1738:getfield        #127 <Field int azh.d>
	//  927 1741:aload_0         
	//  928 1742:getfield        #12  <Field azh a>
	//  929 1745:getfield        #106 <Field int azh.ci>
	//  930 1748:ior             
	//  931 1749:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  932 1752:aload_0         
	//  933 1753:getfield        #12  <Field azh a>
	//  934 1756:astore_1        
		abyte0.ci = ((azh) (abyte0)).bU ^ a.ci;
	//  935 1757:aload_1         
	//  936 1758:aload_1         
	//  937 1759:getfield        #130 <Field int azh.bU>
	//  938 1762:aload_0         
	//  939 1763:getfield        #12  <Field azh a>
	//  940 1766:getfield        #106 <Field int azh.ci>
	//  941 1769:ixor            
	//  942 1770:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  943 1773:aload_0         
	//  944 1774:getfield        #12  <Field azh a>
	//  945 1777:astore_1        
		abyte0.ce = ((azh) (abyte0)).ci ^ a.ce;
	//  946 1778:aload_1         
	//  947 1779:aload_1         
	//  948 1780:getfield        #106 <Field int azh.ci>
	//  949 1783:aload_0         
	//  950 1784:getfield        #12  <Field azh a>
	//  951 1787:getfield        #133 <Field int azh.ce>
	//  952 1790:ixor            
	//  953 1791:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	//  954 1794:aload_0         
	//  955 1795:getfield        #12  <Field azh a>
	//  956 1798:astore_1        
		abyte0.M = ((azh) (abyte0)).ce ^ a.M;
	//  957 1799:aload_1         
	//  958 1800:aload_1         
	//  959 1801:getfield        #133 <Field int azh.ce>
	//  960 1804:aload_0         
	//  961 1805:getfield        #12  <Field azh a>
	//  962 1808:getfield        #136 <Field int azh.M>
	//  963 1811:ixor            
	//  964 1812:putfield        #136 <Field int azh.M>
		abyte0 = ((byte []) (a));
	//  965 1815:aload_0         
	//  966 1816:getfield        #12  <Field azh a>
	//  967 1819:astore_1        
		abyte0.aW = ((azh) (abyte0)).M & ~a.aW;
	//  968 1820:aload_1         
	//  969 1821:aload_1         
	//  970 1822:getfield        #136 <Field int azh.M>
	//  971 1825:aload_0         
	//  972 1826:getfield        #12  <Field azh a>
	//  973 1829:getfield        #91  <Field int azh.aW>
	//  974 1832:iconst_m1       
	//  975 1833:ixor            
	//  976 1834:iand            
	//  977 1835:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  978 1838:aload_0         
	//  979 1839:getfield        #12  <Field azh a>
	//  980 1842:astore_1        
		abyte0.aW = ((azh) (abyte0)).aV ^ a.aW;
	//  981 1843:aload_1         
	//  982 1844:aload_1         
	//  983 1845:getfield        #73  <Field int azh.aV>
	//  984 1848:aload_0         
	//  985 1849:getfield        #12  <Field azh a>
	//  986 1852:getfield        #91  <Field int azh.aW>
	//  987 1855:ixor            
	//  988 1856:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  989 1859:aload_0         
	//  990 1860:getfield        #12  <Field azh a>
	//  991 1863:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & a.ak;
	//  992 1864:aload_1         
	//  993 1865:aload_1         
	//  994 1866:getfield        #91  <Field int azh.aW>
	//  995 1869:aload_0         
	//  996 1870:getfield        #12  <Field azh a>
	//  997 1873:getfield        #139 <Field int azh.ak>
	//  998 1876:iand            
	//  999 1877:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 1000 1880:aload_0         
	// 1001 1881:getfield        #12  <Field azh a>
	// 1002 1884:astore_1        
		abyte0.ao = ((azh) (abyte0)).M & ~a.ao;
	// 1003 1885:aload_1         
	// 1004 1886:aload_1         
	// 1005 1887:getfield        #136 <Field int azh.M>
	// 1006 1890:aload_0         
	// 1007 1891:getfield        #12  <Field azh a>
	// 1008 1894:getfield        #67  <Field int azh.ao>
	// 1009 1897:iconst_m1       
	// 1010 1898:ixor            
	// 1011 1899:iand            
	// 1012 1900:putfield        #67  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1013 1903:aload_0         
	// 1014 1904:getfield        #12  <Field azh a>
	// 1015 1907:astore_1        
		abyte0.ao = ((azh) (abyte0)).an ^ a.ao;
	// 1016 1908:aload_1         
	// 1017 1909:aload_1         
	// 1018 1910:getfield        #61  <Field int azh.an>
	// 1019 1913:aload_0         
	// 1020 1914:getfield        #12  <Field azh a>
	// 1021 1917:getfield        #67  <Field int azh.ao>
	// 1022 1920:ixor            
	// 1023 1921:putfield        #67  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1024 1924:aload_0         
	// 1025 1925:getfield        #12  <Field azh a>
	// 1026 1928:astore_1        
		abyte0.an = ((azh) (abyte0)).b | a.M;
	// 1027 1929:aload_1         
	// 1028 1930:aload_1         
	// 1029 1931:getfield        #142 <Field int azh.b>
	// 1030 1934:aload_0         
	// 1031 1935:getfield        #12  <Field azh a>
	// 1032 1938:getfield        #136 <Field int azh.M>
	// 1033 1941:ior             
	// 1034 1942:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1035 1945:aload_0         
	// 1036 1946:getfield        #12  <Field azh a>
	// 1037 1949:astore_1        
		abyte0.an = ((azh) (abyte0)).bo ^ a.an;
	// 1038 1950:aload_1         
	// 1039 1951:aload_1         
	// 1040 1952:getfield        #145 <Field int azh.bo>
	// 1041 1955:aload_0         
	// 1042 1956:getfield        #12  <Field azh a>
	// 1043 1959:getfield        #61  <Field int azh.an>
	// 1044 1962:ixor            
	// 1045 1963:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1046 1966:aload_0         
	// 1047 1967:getfield        #12  <Field azh a>
	// 1048 1970:astore_1        
		abyte0.an = ((azh) (abyte0)).o | a.an;
	// 1049 1971:aload_1         
	// 1050 1972:aload_1         
	// 1051 1973:getfield        #148 <Field int azh.o>
	// 1052 1976:aload_0         
	// 1053 1977:getfield        #12  <Field azh a>
	// 1054 1980:getfield        #61  <Field int azh.an>
	// 1055 1983:ior             
	// 1056 1984:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1057 1987:aload_0         
	// 1058 1988:getfield        #12  <Field azh a>
	// 1059 1991:astore_1        
		abyte0.aV = ((azh) (abyte0)).M & a.ai;
	// 1060 1992:aload_1         
	// 1061 1993:aload_1         
	// 1062 1994:getfield        #136 <Field int azh.M>
	// 1063 1997:aload_0         
	// 1064 1998:getfield        #12  <Field azh a>
	// 1065 2001:getfield        #151 <Field int azh.ai>
	// 1066 2004:iand            
	// 1067 2005:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1068 2008:aload_0         
	// 1069 2009:getfield        #12  <Field azh a>
	// 1070 2012:astore_1        
		abyte0.aV = ((azh) (abyte0)).b ^ a.aV;
	// 1071 2013:aload_1         
	// 1072 2014:aload_1         
	// 1073 2015:getfield        #142 <Field int azh.b>
	// 1074 2018:aload_0         
	// 1075 2019:getfield        #12  <Field azh a>
	// 1076 2022:getfield        #73  <Field int azh.aV>
	// 1077 2025:ixor            
	// 1078 2026:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1079 2029:aload_0         
	// 1080 2030:getfield        #12  <Field azh a>
	// 1081 2033:astore_1        
		abyte0.aV = ((azh) (abyte0)).o | a.aV;
	// 1082 2034:aload_1         
	// 1083 2035:aload_1         
	// 1084 2036:getfield        #148 <Field int azh.o>
	// 1085 2039:aload_0         
	// 1086 2040:getfield        #12  <Field azh a>
	// 1087 2043:getfield        #73  <Field int azh.aV>
	// 1088 2046:ior             
	// 1089 2047:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1090 2050:aload_0         
	// 1091 2051:getfield        #12  <Field azh a>
	// 1092 2054:astore_1        
		abyte0.b = ((azh) (abyte0)).bP & ~a.M;
	// 1093 2055:aload_1         
	// 1094 2056:aload_1         
	// 1095 2057:getfield        #154 <Field int azh.bP>
	// 1096 2060:aload_0         
	// 1097 2061:getfield        #12  <Field azh a>
	// 1098 2064:getfield        #136 <Field int azh.M>
	// 1099 2067:iconst_m1       
	// 1100 2068:ixor            
	// 1101 2069:iand            
	// 1102 2070:putfield        #142 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 1103 2073:aload_0         
	// 1104 2074:getfield        #12  <Field azh a>
	// 1105 2077:astore_1        
		abyte0.b = ((azh) (abyte0)).az ^ a.b;
	// 1106 2078:aload_1         
	// 1107 2079:aload_1         
	// 1108 2080:getfield        #157 <Field int azh.az>
	// 1109 2083:aload_0         
	// 1110 2084:getfield        #12  <Field azh a>
	// 1111 2087:getfield        #142 <Field int azh.b>
	// 1112 2090:ixor            
	// 1113 2091:putfield        #142 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 1114 2094:aload_0         
	// 1115 2095:getfield        #12  <Field azh a>
	// 1116 2098:astore_1        
		abyte0.aV = ((azh) (abyte0)).b ^ a.aV;
	// 1117 2099:aload_1         
	// 1118 2100:aload_1         
	// 1119 2101:getfield        #142 <Field int azh.b>
	// 1120 2104:aload_0         
	// 1121 2105:getfield        #12  <Field azh a>
	// 1122 2108:getfield        #73  <Field int azh.aV>
	// 1123 2111:ixor            
	// 1124 2112:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1125 2115:aload_0         
	// 1126 2116:getfield        #12  <Field azh a>
	// 1127 2119:astore_1        
		abyte0.aV = ((azh) (abyte0)).aV & ~a.g;
	// 1128 2120:aload_1         
	// 1129 2121:aload_1         
	// 1130 2122:getfield        #73  <Field int azh.aV>
	// 1131 2125:aload_0         
	// 1132 2126:getfield        #12  <Field azh a>
	// 1133 2129:getfield        #160 <Field int azh.g>
	// 1134 2132:iconst_m1       
	// 1135 2133:ixor            
	// 1136 2134:iand            
	// 1137 2135:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1138 2138:aload_0         
	// 1139 2139:getfield        #12  <Field azh a>
	// 1140 2142:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY | a.M;
	// 1141 2143:aload_1         
	// 1142 2144:aload_1         
	// 1143 2145:getfield        #163 <Field int azh.aY>
	// 1144 2148:aload_0         
	// 1145 2149:getfield        #12  <Field azh a>
	// 1146 2152:getfield        #136 <Field int azh.M>
	// 1147 2155:ior             
	// 1148 2156:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 1149 2159:aload_0         
	// 1150 2160:getfield        #12  <Field azh a>
	// 1151 2163:astore_1        
		abyte0.aY = ((azh) (abyte0)).W ^ a.aY;
	// 1152 2164:aload_1         
	// 1153 2165:aload_1         
	// 1154 2166:getfield        #166 <Field int azh.W>
	// 1155 2169:aload_0         
	// 1156 2170:getfield        #12  <Field azh a>
	// 1157 2173:getfield        #163 <Field int azh.aY>
	// 1158 2176:ixor            
	// 1159 2177:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 1160 2180:aload_0         
	// 1161 2181:getfield        #12  <Field azh a>
	// 1162 2184:astore_1        
		abyte0.aY = ((azh) (abyte0)).o | a.aY;
	// 1163 2185:aload_1         
	// 1164 2186:aload_1         
	// 1165 2187:getfield        #148 <Field int azh.o>
	// 1166 2190:aload_0         
	// 1167 2191:getfield        #12  <Field azh a>
	// 1168 2194:getfield        #163 <Field int azh.aY>
	// 1169 2197:ior             
	// 1170 2198:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 1171 2201:aload_0         
	// 1172 2202:getfield        #12  <Field azh a>
	// 1173 2205:astore_1        
		abyte0.ay = ((azh) (abyte0)).M & a.ay;
	// 1174 2206:aload_1         
	// 1175 2207:aload_1         
	// 1176 2208:getfield        #136 <Field int azh.M>
	// 1177 2211:aload_0         
	// 1178 2212:getfield        #12  <Field azh a>
	// 1179 2215:getfield        #47  <Field int azh.ay>
	// 1180 2218:iand            
	// 1181 2219:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1182 2222:aload_0         
	// 1183 2223:getfield        #12  <Field azh a>
	// 1184 2226:astore_1        
		abyte0.ay = ((azh) (abyte0)).ch ^ a.ay;
	// 1185 2227:aload_1         
	// 1186 2228:aload_1         
	// 1187 2229:getfield        #97  <Field int azh.ch>
	// 1188 2232:aload_0         
	// 1189 2233:getfield        #12  <Field azh a>
	// 1190 2236:getfield        #47  <Field int azh.ay>
	// 1191 2239:ixor            
	// 1192 2240:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1193 2243:aload_0         
	// 1194 2244:getfield        #12  <Field azh a>
	// 1195 2247:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & ~a.M;
	// 1196 2248:aload_1         
	// 1197 2249:aload_1         
	// 1198 2250:getfield        #169 <Field int azh.aQ>
	// 1199 2253:aload_0         
	// 1200 2254:getfield        #12  <Field azh a>
	// 1201 2257:getfield        #136 <Field int azh.M>
	// 1202 2260:iconst_m1       
	// 1203 2261:ixor            
	// 1204 2262:iand            
	// 1205 2263:putfield        #169 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1206 2266:aload_0         
	// 1207 2267:getfield        #12  <Field azh a>
	// 1208 2270:astore_1        
		abyte0.aQ = ((azh) (abyte0)).az ^ a.aQ;
	// 1209 2271:aload_1         
	// 1210 2272:aload_1         
	// 1211 2273:getfield        #157 <Field int azh.az>
	// 1212 2276:aload_0         
	// 1213 2277:getfield        #12  <Field azh a>
	// 1214 2280:getfield        #169 <Field int azh.aQ>
	// 1215 2283:ixor            
	// 1216 2284:putfield        #169 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1217 2287:aload_0         
	// 1218 2288:getfield        #12  <Field azh a>
	// 1219 2291:astore_1        
		abyte0.aw = ((azh) (abyte0)).aQ ^ a.aw;
	// 1220 2292:aload_1         
	// 1221 2293:aload_1         
	// 1222 2294:getfield        #169 <Field int azh.aQ>
	// 1223 2297:aload_0         
	// 1224 2298:getfield        #12  <Field azh a>
	// 1225 2301:getfield        #172 <Field int azh.aw>
	// 1226 2304:ixor            
	// 1227 2305:putfield        #172 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1228 2308:aload_0         
	// 1229 2309:getfield        #12  <Field azh a>
	// 1230 2312:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.M;
	// 1231 2313:aload_1         
	// 1232 2314:aload_1         
	// 1233 2315:getfield        #175 <Field int azh.bm>
	// 1234 2318:aload_0         
	// 1235 2319:getfield        #12  <Field azh a>
	// 1236 2322:getfield        #136 <Field int azh.M>
	// 1237 2325:iconst_m1       
	// 1238 2326:ixor            
	// 1239 2327:iand            
	// 1240 2328:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1241 2331:aload_0         
	// 1242 2332:getfield        #12  <Field azh a>
	// 1243 2335:astore_1        
		abyte0.bm = ((azh) (abyte0)).E ^ a.bm;
	// 1244 2336:aload_1         
	// 1245 2337:aload_1         
	// 1246 2338:getfield        #58  <Field int azh.E>
	// 1247 2341:aload_0         
	// 1248 2342:getfield        #12  <Field azh a>
	// 1249 2345:getfield        #175 <Field int azh.bm>
	// 1250 2348:ixor            
	// 1251 2349:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1252 2352:aload_0         
	// 1253 2353:getfield        #12  <Field azh a>
	// 1254 2356:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.o;
	// 1255 2357:aload_1         
	// 1256 2358:aload_1         
	// 1257 2359:getfield        #175 <Field int azh.bm>
	// 1258 2362:aload_0         
	// 1259 2363:getfield        #12  <Field azh a>
	// 1260 2366:getfield        #148 <Field int azh.o>
	// 1261 2369:iconst_m1       
	// 1262 2370:ixor            
	// 1263 2371:iand            
	// 1264 2372:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1265 2375:aload_0         
	// 1266 2376:getfield        #12  <Field azh a>
	// 1267 2379:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & ~a.M;
	// 1268 2380:aload_1         
	// 1269 2381:aload_1         
	// 1270 2382:getfield        #178 <Field int azh.ap>
	// 1271 2385:aload_0         
	// 1272 2386:getfield        #12  <Field azh a>
	// 1273 2389:getfield        #136 <Field int azh.M>
	// 1274 2392:iconst_m1       
	// 1275 2393:ixor            
	// 1276 2394:iand            
	// 1277 2395:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1278 2398:aload_0         
	// 1279 2399:getfield        #12  <Field azh a>
	// 1280 2402:astore_1        
		abyte0.ap = ((azh) (abyte0)).o | a.ap;
	// 1281 2403:aload_1         
	// 1282 2404:aload_1         
	// 1283 2405:getfield        #148 <Field int azh.o>
	// 1284 2408:aload_0         
	// 1285 2409:getfield        #12  <Field azh a>
	// 1286 2412:getfield        #178 <Field int azh.ap>
	// 1287 2415:ior             
	// 1288 2416:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1289 2419:aload_0         
	// 1290 2420:getfield        #12  <Field azh a>
	// 1291 2423:astore_1        
		abyte0.bx = ((azh) (abyte0)).M & ~a.bx;
	// 1292 2424:aload_1         
	// 1293 2425:aload_1         
	// 1294 2426:getfield        #136 <Field int azh.M>
	// 1295 2429:aload_0         
	// 1296 2430:getfield        #12  <Field azh a>
	// 1297 2433:getfield        #70  <Field int azh.bx>
	// 1298 2436:iconst_m1       
	// 1299 2437:ixor            
	// 1300 2438:iand            
	// 1301 2439:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 1302 2442:aload_0         
	// 1303 2443:getfield        #12  <Field azh a>
	// 1304 2446:astore_1        
		abyte0.bx = ((azh) (abyte0)).ag ^ a.bx;
	// 1305 2447:aload_1         
	// 1306 2448:aload_1         
	// 1307 2449:getfield        #29  <Field int azh.ag>
	// 1308 2452:aload_0         
	// 1309 2453:getfield        #12  <Field azh a>
	// 1310 2456:getfield        #70  <Field int azh.bx>
	// 1311 2459:ixor            
	// 1312 2460:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 1313 2463:aload_0         
	// 1314 2464:getfield        #12  <Field azh a>
	// 1315 2467:astore_1        
		abyte0.bx = ((azh) (abyte0)).ak & ~a.bx;
	// 1316 2468:aload_1         
	// 1317 2469:aload_1         
	// 1318 2470:getfield        #139 <Field int azh.ak>
	// 1319 2473:aload_0         
	// 1320 2474:getfield        #12  <Field azh a>
	// 1321 2477:getfield        #70  <Field int azh.bx>
	// 1322 2480:iconst_m1       
	// 1323 2481:ixor            
	// 1324 2482:iand            
	// 1325 2483:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 1326 2486:aload_0         
	// 1327 2487:getfield        #12  <Field azh a>
	// 1328 2490:astore_1        
		abyte0.bx = ((azh) (abyte0)).ao ^ a.bx;
	// 1329 2491:aload_1         
	// 1330 2492:aload_1         
	// 1331 2493:getfield        #67  <Field int azh.ao>
	// 1332 2496:aload_0         
	// 1333 2497:getfield        #12  <Field azh a>
	// 1334 2500:getfield        #70  <Field int azh.bx>
	// 1335 2503:ixor            
	// 1336 2504:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 1337 2507:aload_0         
	// 1338 2508:getfield        #12  <Field azh a>
	// 1339 2511:astore_1        
		abyte0.aj = ((azh) (abyte0)).bx ^ a.aj;
	// 1340 2512:aload_1         
	// 1341 2513:aload_1         
	// 1342 2514:getfield        #70  <Field int azh.bx>
	// 1343 2517:aload_0         
	// 1344 2518:getfield        #12  <Field azh a>
	// 1345 2521:getfield        #181 <Field int azh.aj>
	// 1346 2524:ixor            
	// 1347 2525:putfield        #181 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 1348 2528:aload_0         
	// 1349 2529:getfield        #12  <Field azh a>
	// 1350 2532:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD ^ a.M;
	// 1351 2533:aload_1         
	// 1352 2534:aload_1         
	// 1353 2535:getfield        #184 <Field int azh.aD>
	// 1354 2538:aload_0         
	// 1355 2539:getfield        #12  <Field azh a>
	// 1356 2542:getfield        #136 <Field int azh.M>
	// 1357 2545:ixor            
	// 1358 2546:putfield        #184 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 1359 2549:aload_0         
	// 1360 2550:getfield        #12  <Field azh a>
	// 1361 2553:astore_1        
		abyte0.bO = ((azh) (abyte0)).aD ^ a.bO;
	// 1362 2554:aload_1         
	// 1363 2555:aload_1         
	// 1364 2556:getfield        #184 <Field int azh.aD>
	// 1365 2559:aload_0         
	// 1366 2560:getfield        #12  <Field azh a>
	// 1367 2563:getfield        #187 <Field int azh.bO>
	// 1368 2566:ixor            
	// 1369 2567:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1370 2570:aload_0         
	// 1371 2571:getfield        #12  <Field azh a>
	// 1372 2574:astore_1        
		abyte0.bJ = ((azh) (abyte0)).M & ~a.bJ;
	// 1373 2575:aload_1         
	// 1374 2576:aload_1         
	// 1375 2577:getfield        #136 <Field int azh.M>
	// 1376 2580:aload_0         
	// 1377 2581:getfield        #12  <Field azh a>
	// 1378 2584:getfield        #41  <Field int azh.bJ>
	// 1379 2587:iconst_m1       
	// 1380 2588:ixor            
	// 1381 2589:iand            
	// 1382 2590:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1383 2593:aload_0         
	// 1384 2594:getfield        #12  <Field azh a>
	// 1385 2597:astore_1        
		abyte0.bJ = ((azh) (abyte0)).at ^ a.bJ;
	// 1386 2598:aload_1         
	// 1387 2599:aload_1         
	// 1388 2600:getfield        #44  <Field int azh.at>
	// 1389 2603:aload_0         
	// 1390 2604:getfield        #12  <Field azh a>
	// 1391 2607:getfield        #41  <Field int azh.bJ>
	// 1392 2610:ixor            
	// 1393 2611:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1394 2614:aload_0         
	// 1395 2615:getfield        #12  <Field azh a>
	// 1396 2618:astore_1        
		abyte0.aW = ((azh) (abyte0)).bJ ^ a.aW;
	// 1397 2619:aload_1         
	// 1398 2620:aload_1         
	// 1399 2621:getfield        #41  <Field int azh.bJ>
	// 1400 2624:aload_0         
	// 1401 2625:getfield        #12  <Field azh a>
	// 1402 2628:getfield        #91  <Field int azh.aW>
	// 1403 2631:ixor            
	// 1404 2632:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 1405 2635:aload_0         
	// 1406 2636:getfield        #12  <Field azh a>
	// 1407 2639:astore_1        
		abyte0.j = ((azh) (abyte0)).aW ^ a.j;
	// 1408 2640:aload_1         
	// 1409 2641:aload_1         
	// 1410 2642:getfield        #91  <Field int azh.aW>
	// 1411 2645:aload_0         
	// 1412 2646:getfield        #12  <Field azh a>
	// 1413 2649:getfield        #190 <Field int azh.j>
	// 1414 2652:ixor            
	// 1415 2653:putfield        #190 <Field int azh.j>
		abyte0 = ((byte []) (a));
	// 1416 2656:aload_0         
	// 1417 2657:getfield        #12  <Field azh a>
	// 1418 2660:astore_1        
		abyte0.bp = ((azh) (abyte0)).bp & ~a.M;
	// 1419 2661:aload_1         
	// 1420 2662:aload_1         
	// 1421 2663:getfield        #193 <Field int azh.bp>
	// 1422 2666:aload_0         
	// 1423 2667:getfield        #12  <Field azh a>
	// 1424 2670:getfield        #136 <Field int azh.M>
	// 1425 2673:iconst_m1       
	// 1426 2674:ixor            
	// 1427 2675:iand            
	// 1428 2676:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1429 2679:aload_0         
	// 1430 2680:getfield        #12  <Field azh a>
	// 1431 2683:astore_1        
		abyte0.bp = ((azh) (abyte0)).bo ^ a.bp;
	// 1432 2684:aload_1         
	// 1433 2685:aload_1         
	// 1434 2686:getfield        #145 <Field int azh.bo>
	// 1435 2689:aload_0         
	// 1436 2690:getfield        #12  <Field azh a>
	// 1437 2693:getfield        #193 <Field int azh.bp>
	// 1438 2696:ixor            
	// 1439 2697:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1440 2700:aload_0         
	// 1441 2701:getfield        #12  <Field azh a>
	// 1442 2704:astore_1        
		abyte0.an = ((azh) (abyte0)).bp ^ a.an;
	// 1443 2705:aload_1         
	// 1444 2706:aload_1         
	// 1445 2707:getfield        #193 <Field int azh.bp>
	// 1446 2710:aload_0         
	// 1447 2711:getfield        #12  <Field azh a>
	// 1448 2714:getfield        #61  <Field int azh.an>
	// 1449 2717:ixor            
	// 1450 2718:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1451 2721:aload_0         
	// 1452 2722:getfield        #12  <Field azh a>
	// 1453 2725:astore_1        
		abyte0.an = ((azh) (abyte0)).an & ~a.g;
	// 1454 2726:aload_1         
	// 1455 2727:aload_1         
	// 1456 2728:getfield        #61  <Field int azh.an>
	// 1457 2731:aload_0         
	// 1458 2732:getfield        #12  <Field azh a>
	// 1459 2735:getfield        #160 <Field int azh.g>
	// 1460 2738:iconst_m1       
	// 1461 2739:ixor            
	// 1462 2740:iand            
	// 1463 2741:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1464 2744:aload_0         
	// 1465 2745:getfield        #12  <Field azh a>
	// 1466 2748:astore_1        
		abyte0.an = ((azh) (abyte0)).bO ^ a.an;
	// 1467 2749:aload_1         
	// 1468 2750:aload_1         
	// 1469 2751:getfield        #187 <Field int azh.bO>
	// 1470 2754:aload_0         
	// 1471 2755:getfield        #12  <Field azh a>
	// 1472 2758:getfield        #61  <Field int azh.an>
	// 1473 2761:ixor            
	// 1474 2762:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1475 2765:aload_0         
	// 1476 2766:getfield        #12  <Field azh a>
	// 1477 2769:astore_1        
		abyte0.aS = ((azh) (abyte0)).an ^ a.aS;
	// 1478 2770:aload_1         
	// 1479 2771:aload_1         
	// 1480 2772:getfield        #61  <Field int azh.an>
	// 1481 2775:aload_0         
	// 1482 2776:getfield        #12  <Field azh a>
	// 1483 2779:getfield        #196 <Field int azh.aS>
	// 1484 2782:ixor            
	// 1485 2783:putfield        #196 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 1486 2786:aload_0         
	// 1487 2787:getfield        #12  <Field azh a>
	// 1488 2790:astore_1        
		abyte0.an = ((azh) (abyte0)).bE | a.aS;
	// 1489 2791:aload_1         
	// 1490 2792:aload_1         
	// 1491 2793:getfield        #199 <Field int azh.bE>
	// 1492 2796:aload_0         
	// 1493 2797:getfield        #12  <Field azh a>
	// 1494 2800:getfield        #196 <Field int azh.aS>
	// 1495 2803:ior             
	// 1496 2804:putfield        #61  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1497 2807:aload_0         
	// 1498 2808:getfield        #12  <Field azh a>
	// 1499 2811:astore_1        
		abyte0.bz = ((azh) (abyte0)).M & a.bz;
	// 1500 2812:aload_1         
	// 1501 2813:aload_1         
	// 1502 2814:getfield        #136 <Field int azh.M>
	// 1503 2817:aload_0         
	// 1504 2818:getfield        #12  <Field azh a>
	// 1505 2821:getfield        #79  <Field int azh.bz>
	// 1506 2824:iand            
	// 1507 2825:putfield        #79  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 1508 2828:aload_0         
	// 1509 2829:getfield        #12  <Field azh a>
	// 1510 2832:astore_1        
		abyte0.bz = ((azh) (abyte0)).bc ^ a.bz;
	// 1511 2833:aload_1         
	// 1512 2834:aload_1         
	// 1513 2835:getfield        #88  <Field int azh.bc>
	// 1514 2838:aload_0         
	// 1515 2839:getfield        #12  <Field azh a>
	// 1516 2842:getfield        #79  <Field int azh.bz>
	// 1517 2845:ixor            
	// 1518 2846:putfield        #79  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 1519 2849:aload_0         
	// 1520 2850:getfield        #12  <Field azh a>
	// 1521 2853:astore_1        
		abyte0.bz = ((azh) (abyte0)).ak & ~a.bz;
	// 1522 2854:aload_1         
	// 1523 2855:aload_1         
	// 1524 2856:getfield        #139 <Field int azh.ak>
	// 1525 2859:aload_0         
	// 1526 2860:getfield        #12  <Field azh a>
	// 1527 2863:getfield        #79  <Field int azh.bz>
	// 1528 2866:iconst_m1       
	// 1529 2867:ixor            
	// 1530 2868:iand            
	// 1531 2869:putfield        #79  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 1532 2872:aload_0         
	// 1533 2873:getfield        #12  <Field azh a>
	// 1534 2876:astore_1        
		abyte0.aq = ((azh) (abyte0)).M & a.aq;
	// 1535 2877:aload_1         
	// 1536 2878:aload_1         
	// 1537 2879:getfield        #136 <Field int azh.M>
	// 1538 2882:aload_0         
	// 1539 2883:getfield        #12  <Field azh a>
	// 1540 2886:getfield        #202 <Field int azh.aq>
	// 1541 2889:iand            
	// 1542 2890:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 1543 2893:aload_0         
	// 1544 2894:getfield        #12  <Field azh a>
	// 1545 2897:astore_1        
		abyte0.aq = ((azh) (abyte0)).o | a.aq;
	// 1546 2898:aload_1         
	// 1547 2899:aload_1         
	// 1548 2900:getfield        #148 <Field int azh.o>
	// 1549 2903:aload_0         
	// 1550 2904:getfield        #12  <Field azh a>
	// 1551 2907:getfield        #202 <Field int azh.aq>
	// 1552 2910:ior             
	// 1553 2911:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 1554 2914:aload_0         
	// 1555 2915:getfield        #12  <Field azh a>
	// 1556 2918:astore_1        
		abyte0.aI = ((azh) (abyte0)).M & ~a.aI;
	// 1557 2919:aload_1         
	// 1558 2920:aload_1         
	// 1559 2921:getfield        #136 <Field int azh.M>
	// 1560 2924:aload_0         
	// 1561 2925:getfield        #12  <Field azh a>
	// 1562 2928:getfield        #100 <Field int azh.aI>
	// 1563 2931:iconst_m1       
	// 1564 2932:ixor            
	// 1565 2933:iand            
	// 1566 2934:putfield        #100 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1567 2937:aload_0         
	// 1568 2938:getfield        #12  <Field azh a>
	// 1569 2941:astore_1        
		abyte0.aI = ((azh) (abyte0)).aC ^ a.aI;
	// 1570 2942:aload_1         
	// 1571 2943:aload_1         
	// 1572 2944:getfield        #94  <Field int azh.aC>
	// 1573 2947:aload_0         
	// 1574 2948:getfield        #12  <Field azh a>
	// 1575 2951:getfield        #100 <Field int azh.aI>
	// 1576 2954:ixor            
	// 1577 2955:putfield        #100 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1578 2958:aload_0         
	// 1579 2959:getfield        #12  <Field azh a>
	// 1580 2962:astore_1        
		abyte0.aI = ((azh) (abyte0)).ak & a.aI;
	// 1581 2963:aload_1         
	// 1582 2964:aload_1         
	// 1583 2965:getfield        #139 <Field int azh.ak>
	// 1584 2968:aload_0         
	// 1585 2969:getfield        #12  <Field azh a>
	// 1586 2972:getfield        #100 <Field int azh.aI>
	// 1587 2975:iand            
	// 1588 2976:putfield        #100 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1589 2979:aload_0         
	// 1590 2980:getfield        #12  <Field azh a>
	// 1591 2983:astore_1        
		abyte0.aI = ((azh) (abyte0)).ay ^ a.aI;
	// 1592 2984:aload_1         
	// 1593 2985:aload_1         
	// 1594 2986:getfield        #47  <Field int azh.ay>
	// 1595 2989:aload_0         
	// 1596 2990:getfield        #12  <Field azh a>
	// 1597 2993:getfield        #100 <Field int azh.aI>
	// 1598 2996:ixor            
	// 1599 2997:putfield        #100 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1600 3000:aload_0         
	// 1601 3001:getfield        #12  <Field azh a>
	// 1602 3004:astore_1        
		abyte0.br = ((azh) (abyte0)).aI ^ a.br;
	// 1603 3005:aload_1         
	// 1604 3006:aload_1         
	// 1605 3007:getfield        #100 <Field int azh.aI>
	// 1606 3010:aload_0         
	// 1607 3011:getfield        #12  <Field azh a>
	// 1608 3014:getfield        #205 <Field int azh.br>
	// 1609 3017:ixor            
	// 1610 3018:putfield        #205 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 1611 3021:aload_0         
	// 1612 3022:getfield        #12  <Field azh a>
	// 1613 3025:astore_1        
		abyte0.bw = ((azh) (abyte0)).M & ~a.bw;
	// 1614 3026:aload_1         
	// 1615 3027:aload_1         
	// 1616 3028:getfield        #136 <Field int azh.M>
	// 1617 3031:aload_0         
	// 1618 3032:getfield        #12  <Field azh a>
	// 1619 3035:getfield        #85  <Field int azh.bw>
	// 1620 3038:iconst_m1       
	// 1621 3039:ixor            
	// 1622 3040:iand            
	// 1623 3041:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1624 3044:aload_0         
	// 1625 3045:getfield        #12  <Field azh a>
	// 1626 3048:astore_1        
		abyte0.bw = ((azh) (abyte0)).bV ^ a.bw;
	// 1627 3049:aload_1         
	// 1628 3050:aload_1         
	// 1629 3051:getfield        #26  <Field int azh.bV>
	// 1630 3054:aload_0         
	// 1631 3055:getfield        #12  <Field azh a>
	// 1632 3058:getfield        #85  <Field int azh.bw>
	// 1633 3061:ixor            
	// 1634 3062:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1635 3065:aload_0         
	// 1636 3066:getfield        #12  <Field azh a>
	// 1637 3069:astore_1        
		abyte0.bz = ((azh) (abyte0)).bw ^ a.bz;
	// 1638 3070:aload_1         
	// 1639 3071:aload_1         
	// 1640 3072:getfield        #85  <Field int azh.bw>
	// 1641 3075:aload_0         
	// 1642 3076:getfield        #12  <Field azh a>
	// 1643 3079:getfield        #79  <Field int azh.bz>
	// 1644 3082:ixor            
	// 1645 3083:putfield        #79  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 1646 3086:aload_0         
	// 1647 3087:getfield        #12  <Field azh a>
	// 1648 3090:astore_1        
		abyte0.bz = ((azh) (abyte0)).bz ^ a.l;
	// 1649 3091:aload_1         
	// 1650 3092:aload_1         
	// 1651 3093:getfield        #79  <Field int azh.bz>
	// 1652 3096:aload_0         
	// 1653 3097:getfield        #12  <Field azh a>
	// 1654 3100:getfield        #35  <Field int azh.l>
	// 1655 3103:ixor            
	// 1656 3104:putfield        #79  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 1657 3107:aload_0         
	// 1658 3108:getfield        #12  <Field azh a>
	// 1659 3111:astore_1        
		abyte0.bC = ((azh) (abyte0)).bC & ~a.M;
	// 1660 3112:aload_1         
	// 1661 3113:aload_1         
	// 1662 3114:getfield        #208 <Field int azh.bC>
	// 1663 3117:aload_0         
	// 1664 3118:getfield        #12  <Field azh a>
	// 1665 3121:getfield        #136 <Field int azh.M>
	// 1666 3124:iconst_m1       
	// 1667 3125:ixor            
	// 1668 3126:iand            
	// 1669 3127:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 1670 3130:aload_0         
	// 1671 3131:getfield        #12  <Field azh a>
	// 1672 3134:astore_1        
		abyte0.bC = ((azh) (abyte0)).E ^ a.bC;
	// 1673 3135:aload_1         
	// 1674 3136:aload_1         
	// 1675 3137:getfield        #58  <Field int azh.E>
	// 1676 3140:aload_0         
	// 1677 3141:getfield        #12  <Field azh a>
	// 1678 3144:getfield        #208 <Field int azh.bC>
	// 1679 3147:ixor            
	// 1680 3148:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 1681 3151:aload_0         
	// 1682 3152:getfield        #12  <Field azh a>
	// 1683 3155:astore_1        
		abyte0.bm = ((azh) (abyte0)).bC ^ a.bm;
	// 1684 3156:aload_1         
	// 1685 3157:aload_1         
	// 1686 3158:getfield        #208 <Field int azh.bC>
	// 1687 3161:aload_0         
	// 1688 3162:getfield        #12  <Field azh a>
	// 1689 3165:getfield        #175 <Field int azh.bm>
	// 1690 3168:ixor            
	// 1691 3169:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1692 3172:aload_0         
	// 1693 3173:getfield        #12  <Field azh a>
	// 1694 3176:astore_1        
		abyte0.bm = ((azh) (abyte0)).g | a.bm;
	// 1695 3177:aload_1         
	// 1696 3178:aload_1         
	// 1697 3179:getfield        #160 <Field int azh.g>
	// 1698 3182:aload_0         
	// 1699 3183:getfield        #12  <Field azh a>
	// 1700 3186:getfield        #175 <Field int azh.bm>
	// 1701 3189:ior             
	// 1702 3190:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1703 3193:aload_0         
	// 1704 3194:getfield        #12  <Field azh a>
	// 1705 3197:astore_1        
		abyte0.bm = ((azh) (abyte0)).aw ^ a.bm;
	// 1706 3198:aload_1         
	// 1707 3199:aload_1         
	// 1708 3200:getfield        #172 <Field int azh.aw>
	// 1709 3203:aload_0         
	// 1710 3204:getfield        #12  <Field azh a>
	// 1711 3207:getfield        #175 <Field int azh.bm>
	// 1712 3210:ixor            
	// 1713 3211:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1714 3214:aload_0         
	// 1715 3215:getfield        #12  <Field azh a>
	// 1716 3218:astore_1        
		abyte0.D = ((azh) (abyte0)).bm ^ a.D;
	// 1717 3219:aload_1         
	// 1718 3220:aload_1         
	// 1719 3221:getfield        #175 <Field int azh.bm>
	// 1720 3224:aload_0         
	// 1721 3225:getfield        #12  <Field azh a>
	// 1722 3228:getfield        #211 <Field int azh.D>
	// 1723 3231:ixor            
	// 1724 3232:putfield        #211 <Field int azh.D>
		abyte0 = ((byte []) (a));
	// 1725 3235:aload_0         
	// 1726 3236:getfield        #12  <Field azh a>
	// 1727 3239:astore_1        
		abyte0.bm = ((azh) (abyte0)).aj | a.D;
	// 1728 3240:aload_1         
	// 1729 3241:aload_1         
	// 1730 3242:getfield        #181 <Field int azh.aj>
	// 1731 3245:aload_0         
	// 1732 3246:getfield        #12  <Field azh a>
	// 1733 3249:getfield        #211 <Field int azh.D>
	// 1734 3252:ior             
	// 1735 3253:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1736 3256:aload_0         
	// 1737 3257:getfield        #12  <Field azh a>
	// 1738 3260:astore_1        
		abyte0.aw = ((azh) (abyte0)).aj | a.D;
	// 1739 3261:aload_1         
	// 1740 3262:aload_1         
	// 1741 3263:getfield        #181 <Field int azh.aj>
	// 1742 3266:aload_0         
	// 1743 3267:getfield        #12  <Field azh a>
	// 1744 3270:getfield        #211 <Field int azh.D>
	// 1745 3273:ior             
	// 1746 3274:putfield        #172 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1747 3277:aload_0         
	// 1748 3278:getfield        #12  <Field azh a>
	// 1749 3281:astore_1        
		abyte0.aw = ((azh) (abyte0)).D ^ a.aw;
	// 1750 3282:aload_1         
	// 1751 3283:aload_1         
	// 1752 3284:getfield        #211 <Field int azh.D>
	// 1753 3287:aload_0         
	// 1754 3288:getfield        #12  <Field azh a>
	// 1755 3291:getfield        #172 <Field int azh.aw>
	// 1756 3294:ixor            
	// 1757 3295:putfield        #172 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1758 3298:aload_0         
	// 1759 3299:getfield        #12  <Field azh a>
	// 1760 3302:astore_1        
		abyte0.bC = ((azh) (abyte0)).D & ~a.aj;
	// 1761 3303:aload_1         
	// 1762 3304:aload_1         
	// 1763 3305:getfield        #211 <Field int azh.D>
	// 1764 3308:aload_0         
	// 1765 3309:getfield        #12  <Field azh a>
	// 1766 3312:getfield        #181 <Field int azh.aj>
	// 1767 3315:iconst_m1       
	// 1768 3316:ixor            
	// 1769 3317:iand            
	// 1770 3318:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 1771 3321:aload_0         
	// 1772 3322:getfield        #12  <Field azh a>
	// 1773 3325:astore_1        
		abyte0.bw = ((azh) (abyte0)).D & ~a.aj;
	// 1774 3326:aload_1         
	// 1775 3327:aload_1         
	// 1776 3328:getfield        #211 <Field int azh.D>
	// 1777 3331:aload_0         
	// 1778 3332:getfield        #12  <Field azh a>
	// 1779 3335:getfield        #181 <Field int azh.aj>
	// 1780 3338:iconst_m1       
	// 1781 3339:ixor            
	// 1782 3340:iand            
	// 1783 3341:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1784 3344:aload_0         
	// 1785 3345:getfield        #12  <Field azh a>
	// 1786 3348:astore_1        
		abyte0.bV = ((azh) (abyte0)).D & ~a.aj;
	// 1787 3349:aload_1         
	// 1788 3350:aload_1         
	// 1789 3351:getfield        #211 <Field int azh.D>
	// 1790 3354:aload_0         
	// 1791 3355:getfield        #12  <Field azh a>
	// 1792 3358:getfield        #181 <Field int azh.aj>
	// 1793 3361:iconst_m1       
	// 1794 3362:ixor            
	// 1795 3363:iand            
	// 1796 3364:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1797 3367:aload_0         
	// 1798 3368:getfield        #12  <Field azh a>
	// 1799 3371:astore_1        
		abyte0.aA = ((azh) (abyte0)).aA | a.M;
	// 1800 3372:aload_1         
	// 1801 3373:aload_1         
	// 1802 3374:getfield        #214 <Field int azh.aA>
	// 1803 3377:aload_0         
	// 1804 3378:getfield        #12  <Field azh a>
	// 1805 3381:getfield        #136 <Field int azh.M>
	// 1806 3384:ior             
	// 1807 3385:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 1808 3388:aload_0         
	// 1809 3389:getfield        #12  <Field azh a>
	// 1810 3392:astore_1        
		abyte0.aA = ((azh) (abyte0)).bP ^ a.aA;
	// 1811 3393:aload_1         
	// 1812 3394:aload_1         
	// 1813 3395:getfield        #154 <Field int azh.bP>
	// 1814 3398:aload_0         
	// 1815 3399:getfield        #12  <Field azh a>
	// 1816 3402:getfield        #214 <Field int azh.aA>
	// 1817 3405:ixor            
	// 1818 3406:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 1819 3409:aload_0         
	// 1820 3410:getfield        #12  <Field azh a>
	// 1821 3413:astore_1        
		abyte0.aY = ((azh) (abyte0)).aA ^ a.aY;
	// 1822 3414:aload_1         
	// 1823 3415:aload_1         
	// 1824 3416:getfield        #214 <Field int azh.aA>
	// 1825 3419:aload_0         
	// 1826 3420:getfield        #12  <Field azh a>
	// 1827 3423:getfield        #163 <Field int azh.aY>
	// 1828 3426:ixor            
	// 1829 3427:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 1830 3430:aload_0         
	// 1831 3431:getfield        #12  <Field azh a>
	// 1832 3434:astore_1        
		abyte0.ae = ((azh) (abyte0)).ae | a.M;
	// 1833 3435:aload_1         
	// 1834 3436:aload_1         
	// 1835 3437:getfield        #217 <Field int azh.ae>
	// 1836 3440:aload_0         
	// 1837 3441:getfield        #12  <Field azh a>
	// 1838 3444:getfield        #136 <Field int azh.M>
	// 1839 3447:ior             
	// 1840 3448:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 1841 3451:aload_0         
	// 1842 3452:getfield        #12  <Field azh a>
	// 1843 3455:astore_1        
		abyte0.aq = ((azh) (abyte0)).ae ^ a.aq;
	// 1844 3456:aload_1         
	// 1845 3457:aload_1         
	// 1846 3458:getfield        #217 <Field int azh.ae>
	// 1847 3461:aload_0         
	// 1848 3462:getfield        #12  <Field azh a>
	// 1849 3465:getfield        #202 <Field int azh.aq>
	// 1850 3468:ixor            
	// 1851 3469:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 1852 3472:aload_0         
	// 1853 3473:getfield        #12  <Field azh a>
	// 1854 3476:astore_1        
		abyte0.aq = ((azh) (abyte0)).g | a.aq;
	// 1855 3477:aload_1         
	// 1856 3478:aload_1         
	// 1857 3479:getfield        #160 <Field int azh.g>
	// 1858 3482:aload_0         
	// 1859 3483:getfield        #12  <Field azh a>
	// 1860 3486:getfield        #202 <Field int azh.aq>
	// 1861 3489:ior             
	// 1862 3490:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 1863 3493:aload_0         
	// 1864 3494:getfield        #12  <Field azh a>
	// 1865 3497:astore_1        
		abyte0.aq = ((azh) (abyte0)).aY ^ a.aq;
	// 1866 3498:aload_1         
	// 1867 3499:aload_1         
	// 1868 3500:getfield        #163 <Field int azh.aY>
	// 1869 3503:aload_0         
	// 1870 3504:getfield        #12  <Field azh a>
	// 1871 3507:getfield        #202 <Field int azh.aq>
	// 1872 3510:ixor            
	// 1873 3511:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 1874 3514:aload_0         
	// 1875 3515:getfield        #12  <Field azh a>
	// 1876 3518:astore_1        
		abyte0.ad = ((azh) (abyte0)).aq ^ a.ad;
	// 1877 3519:aload_1         
	// 1878 3520:aload_1         
	// 1879 3521:getfield        #202 <Field int azh.aq>
	// 1880 3524:aload_0         
	// 1881 3525:getfield        #12  <Field azh a>
	// 1882 3528:getfield        #220 <Field int azh.ad>
	// 1883 3531:ixor            
	// 1884 3532:putfield        #220 <Field int azh.ad>
		abyte0 = ((byte []) (a));
	// 1885 3535:aload_0         
	// 1886 3536:getfield        #12  <Field azh a>
	// 1887 3539:astore_1        
		abyte0.aq = ((azh) (abyte0)).ad & ~a.N;
	// 1888 3540:aload_1         
	// 1889 3541:aload_1         
	// 1890 3542:getfield        #220 <Field int azh.ad>
	// 1891 3545:aload_0         
	// 1892 3546:getfield        #12  <Field azh a>
	// 1893 3549:getfield        #223 <Field int azh.N>
	// 1894 3552:iconst_m1       
	// 1895 3553:ixor            
	// 1896 3554:iand            
	// 1897 3555:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 1898 3558:aload_0         
	// 1899 3559:getfield        #12  <Field azh a>
	// 1900 3562:astore_1        
		abyte0.bg = ((azh) (abyte0)).bg | a.M;
	// 1901 3563:aload_1         
	// 1902 3564:aload_1         
	// 1903 3565:getfield        #226 <Field int azh.bg>
	// 1904 3568:aload_0         
	// 1905 3569:getfield        #12  <Field azh a>
	// 1906 3572:getfield        #136 <Field int azh.M>
	// 1907 3575:ior             
	// 1908 3576:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1909 3579:aload_0         
	// 1910 3580:getfield        #12  <Field azh a>
	// 1911 3583:astore_1        
		abyte0.bg = ((azh) (abyte0)).W ^ a.bg;
	// 1912 3584:aload_1         
	// 1913 3585:aload_1         
	// 1914 3586:getfield        #166 <Field int azh.W>
	// 1915 3589:aload_0         
	// 1916 3590:getfield        #12  <Field azh a>
	// 1917 3593:getfield        #226 <Field int azh.bg>
	// 1918 3596:ixor            
	// 1919 3597:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1920 3600:aload_0         
	// 1921 3601:getfield        #12  <Field azh a>
	// 1922 3604:astore_1        
		abyte0.ap = ((azh) (abyte0)).bg ^ a.ap;
	// 1923 3605:aload_1         
	// 1924 3606:aload_1         
	// 1925 3607:getfield        #226 <Field int azh.bg>
	// 1926 3610:aload_0         
	// 1927 3611:getfield        #12  <Field azh a>
	// 1928 3614:getfield        #178 <Field int azh.ap>
	// 1929 3617:ixor            
	// 1930 3618:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1931 3621:aload_0         
	// 1932 3622:getfield        #12  <Field azh a>
	// 1933 3625:astore_1        
		abyte0.aV = ((azh) (abyte0)).ap ^ a.aV;
	// 1934 3626:aload_1         
	// 1935 3627:aload_1         
	// 1936 3628:getfield        #178 <Field int azh.ap>
	// 1937 3631:aload_0         
	// 1938 3632:getfield        #12  <Field azh a>
	// 1939 3635:getfield        #73  <Field int azh.aV>
	// 1940 3638:ixor            
	// 1941 3639:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1942 3642:aload_0         
	// 1943 3643:getfield        #12  <Field azh a>
	// 1944 3646:astore_1        
		abyte0.Z = ((azh) (abyte0)).aV ^ a.Z;
	// 1945 3647:aload_1         
	// 1946 3648:aload_1         
	// 1947 3649:getfield        #73  <Field int azh.aV>
	// 1948 3652:aload_0         
	// 1949 3653:getfield        #12  <Field azh a>
	// 1950 3656:getfield        #229 <Field int azh.Z>
	// 1951 3659:ixor            
	// 1952 3660:putfield        #229 <Field int azh.Z>
		abyte0 = ((byte []) (a));
	// 1953 3663:aload_0         
	// 1954 3664:getfield        #12  <Field azh a>
	// 1955 3667:astore_1        
		abyte0.aV = ((azh) (abyte0)).br & ~a.Z;
	// 1956 3668:aload_1         
	// 1957 3669:aload_1         
	// 1958 3670:getfield        #205 <Field int azh.br>
	// 1959 3673:aload_0         
	// 1960 3674:getfield        #12  <Field azh a>
	// 1961 3677:getfield        #229 <Field int azh.Z>
	// 1962 3680:iconst_m1       
	// 1963 3681:ixor            
	// 1964 3682:iand            
	// 1965 3683:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1966 3686:aload_0         
	// 1967 3687:getfield        #12  <Field azh a>
	// 1968 3690:astore_1        
		abyte0.ap = ((azh) (abyte0)).bZ & ~a.B;
	// 1969 3691:aload_1         
	// 1970 3692:aload_1         
	// 1971 3693:getfield        #76  <Field int azh.bZ>
	// 1972 3696:aload_0         
	// 1973 3697:getfield        #12  <Field azh a>
	// 1974 3700:getfield        #118 <Field int azh.B>
	// 1975 3703:iconst_m1       
	// 1976 3704:ixor            
	// 1977 3705:iand            
	// 1978 3706:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1979 3709:aload_0         
	// 1980 3710:getfield        #12  <Field azh a>
	// 1981 3713:astore_1        
		abyte0.ap = ((azh) (abyte0)).af & a.ap;
	// 1982 3714:aload_1         
	// 1983 3715:aload_1         
	// 1984 3716:getfield        #109 <Field int azh.af>
	// 1985 3719:aload_0         
	// 1986 3720:getfield        #12  <Field azh a>
	// 1987 3723:getfield        #178 <Field int azh.ap>
	// 1988 3726:iand            
	// 1989 3727:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1990 3730:aload_0         
	// 1991 3731:getfield        #12  <Field azh a>
	// 1992 3734:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & ~a.B;
	// 1993 3735:aload_1         
	// 1994 3736:aload_1         
	// 1995 3737:getfield        #76  <Field int azh.bZ>
	// 1996 3740:aload_0         
	// 1997 3741:getfield        #12  <Field azh a>
	// 1998 3744:getfield        #118 <Field int azh.B>
	// 1999 3747:iconst_m1       
	// 2000 3748:ixor            
	// 2001 3749:iand            
	// 2002 3750:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2003 3753:aload_0         
	// 2004 3754:getfield        #12  <Field azh a>
	// 2005 3757:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aT ^ a.bZ;
	// 2006 3758:aload_1         
	// 2007 3759:aload_1         
	// 2008 3760:getfield        #232 <Field int azh.aT>
	// 2009 3763:aload_0         
	// 2010 3764:getfield        #12  <Field azh a>
	// 2011 3767:getfield        #76  <Field int azh.bZ>
	// 2012 3770:ixor            
	// 2013 3771:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2014 3774:aload_0         
	// 2015 3775:getfield        #12  <Field azh a>
	// 2016 3778:astore_1        
		abyte0.ap = ((azh) (abyte0)).bZ ^ a.ap;
	// 2017 3779:aload_1         
	// 2018 3780:aload_1         
	// 2019 3781:getfield        #76  <Field int azh.bZ>
	// 2020 3784:aload_0         
	// 2021 3785:getfield        #12  <Field azh a>
	// 2022 3788:getfield        #178 <Field int azh.ap>
	// 2023 3791:ixor            
	// 2024 3792:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2025 3795:aload_0         
	// 2026 3796:getfield        #12  <Field azh a>
	// 2027 3799:astore_1        
		abyte0.ap = ((azh) (abyte0)).d | a.ap;
	// 2028 3800:aload_1         
	// 2029 3801:aload_1         
	// 2030 3802:getfield        #127 <Field int azh.d>
	// 2031 3805:aload_0         
	// 2032 3806:getfield        #12  <Field azh a>
	// 2033 3809:getfield        #178 <Field int azh.ap>
	// 2034 3812:ior             
	// 2035 3813:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2036 3816:aload_0         
	// 2037 3817:getfield        #12  <Field azh a>
	// 2038 3820:astore_1        
		abyte0.ap = ((azh) (abyte0)).cg ^ a.ap;
	// 2039 3821:aload_1         
	// 2040 3822:aload_1         
	// 2041 3823:getfield        #235 <Field int azh.cg>
	// 2042 3826:aload_0         
	// 2043 3827:getfield        #12  <Field azh a>
	// 2044 3830:getfield        #178 <Field int azh.ap>
	// 2045 3833:ixor            
	// 2046 3834:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2047 3837:aload_0         
	// 2048 3838:getfield        #12  <Field azh a>
	// 2049 3841:astore_1        
		abyte0.bk = ((azh) (abyte0)).ap ^ a.bk;
	// 2050 3842:aload_1         
	// 2051 3843:aload_1         
	// 2052 3844:getfield        #178 <Field int azh.ap>
	// 2053 3847:aload_0         
	// 2054 3848:getfield        #12  <Field azh a>
	// 2055 3851:getfield        #32  <Field int azh.bk>
	// 2056 3854:ixor            
	// 2057 3855:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2058 3858:aload_0         
	// 2059 3859:getfield        #12  <Field azh a>
	// 2060 3862:astore_1        
		abyte0.y = ((azh) (abyte0)).bk ^ a.y;
	// 2061 3863:aload_1         
	// 2062 3864:aload_1         
	// 2063 3865:getfield        #32  <Field int azh.bk>
	// 2064 3868:aload_0         
	// 2065 3869:getfield        #12  <Field azh a>
	// 2066 3872:getfield        #238 <Field int azh.y>
	// 2067 3875:ixor            
	// 2068 3876:putfield        #238 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 2069 3879:aload_0         
	// 2070 3880:getfield        #12  <Field azh a>
	// 2071 3883:astore_1        
		abyte0.bk = ((azh) (abyte0)).bF | a.y;
	// 2072 3884:aload_1         
	// 2073 3885:aload_1         
	// 2074 3886:getfield        #241 <Field int azh.bF>
	// 2075 3889:aload_0         
	// 2076 3890:getfield        #12  <Field azh a>
	// 2077 3893:getfield        #238 <Field int azh.y>
	// 2078 3896:ior             
	// 2079 3897:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2080 3900:aload_0         
	// 2081 3901:getfield        #12  <Field azh a>
	// 2082 3904:astore_1        
		abyte0.ap = ((azh) (abyte0)).c | a.y;
	// 2083 3905:aload_1         
	// 2084 3906:aload_1         
	// 2085 3907:getfield        #244 <Field int azh.c>
	// 2086 3910:aload_0         
	// 2087 3911:getfield        #12  <Field azh a>
	// 2088 3914:getfield        #238 <Field int azh.y>
	// 2089 3917:ior             
	// 2090 3918:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2091 3921:aload_0         
	// 2092 3922:getfield        #12  <Field azh a>
	// 2093 3925:astore_1        
		abyte0.cg = ((azh) (abyte0)).ap & ~a.bT;
	// 2094 3926:aload_1         
	// 2095 3927:aload_1         
	// 2096 3928:getfield        #178 <Field int azh.ap>
	// 2097 3931:aload_0         
	// 2098 3932:getfield        #12  <Field azh a>
	// 2099 3935:getfield        #247 <Field int azh.bT>
	// 2100 3938:iconst_m1       
	// 2101 3939:ixor            
	// 2102 3940:iand            
	// 2103 3941:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 2104 3944:aload_0         
	// 2105 3945:getfield        #12  <Field azh a>
	// 2106 3948:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bF | a.ap;
	// 2107 3949:aload_1         
	// 2108 3950:aload_1         
	// 2109 3951:getfield        #241 <Field int azh.bF>
	// 2110 3954:aload_0         
	// 2111 3955:getfield        #12  <Field azh a>
	// 2112 3958:getfield        #178 <Field int azh.ap>
	// 2113 3961:ior             
	// 2114 3962:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2115 3965:aload_0         
	// 2116 3966:getfield        #12  <Field azh a>
	// 2117 3969:astore_1        
		abyte0.aT = ((azh) (abyte0)).ap & ~a.bT;
	// 2118 3970:aload_1         
	// 2119 3971:aload_1         
	// 2120 3972:getfield        #178 <Field int azh.ap>
	// 2121 3975:aload_0         
	// 2122 3976:getfield        #12  <Field azh a>
	// 2123 3979:getfield        #247 <Field int azh.bT>
	// 2124 3982:iconst_m1       
	// 2125 3983:ixor            
	// 2126 3984:iand            
	// 2127 3985:putfield        #232 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2128 3988:aload_0         
	// 2129 3989:getfield        #12  <Field azh a>
	// 2130 3992:astore_1        
		abyte0.bg = ((azh) (abyte0)).ap & ~a.c;
	// 2131 3993:aload_1         
	// 2132 3994:aload_1         
	// 2133 3995:getfield        #178 <Field int azh.ap>
	// 2134 3998:aload_0         
	// 2135 3999:getfield        #12  <Field azh a>
	// 2136 4002:getfield        #244 <Field int azh.c>
	// 2137 4005:iconst_m1       
	// 2138 4006:ixor            
	// 2139 4007:iand            
	// 2140 4008:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 2141 4011:aload_0         
	// 2142 4012:getfield        #12  <Field azh a>
	// 2143 4015:astore_1        
		abyte0.W = ((azh) (abyte0)).bT | a.ap;
	// 2144 4016:aload_1         
	// 2145 4017:aload_1         
	// 2146 4018:getfield        #247 <Field int azh.bT>
	// 2147 4021:aload_0         
	// 2148 4022:getfield        #12  <Field azh a>
	// 2149 4025:getfield        #178 <Field int azh.ap>
	// 2150 4028:ior             
	// 2151 4029:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2152 4032:aload_0         
	// 2153 4033:getfield        #12  <Field azh a>
	// 2154 4036:astore_1        
		abyte0.aY = ((azh) (abyte0)).y ^ a.c;
	// 2155 4037:aload_1         
	// 2156 4038:aload_1         
	// 2157 4039:getfield        #238 <Field int azh.y>
	// 2158 4042:aload_0         
	// 2159 4043:getfield        #12  <Field azh a>
	// 2160 4046:getfield        #244 <Field int azh.c>
	// 2161 4049:ixor            
	// 2162 4050:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2163 4053:aload_0         
	// 2164 4054:getfield        #12  <Field azh a>
	// 2165 4057:astore_1        
		abyte0.ae = ((azh) (abyte0)).bT | a.aY;
	// 2166 4058:aload_1         
	// 2167 4059:aload_1         
	// 2168 4060:getfield        #247 <Field int azh.bT>
	// 2169 4063:aload_0         
	// 2170 4064:getfield        #12  <Field azh a>
	// 2171 4067:getfield        #163 <Field int azh.aY>
	// 2172 4070:ior             
	// 2173 4071:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 2174 4074:aload_0         
	// 2175 4075:getfield        #12  <Field azh a>
	// 2176 4078:astore_1        
		abyte0.ae = ((azh) (abyte0)).y ^ a.ae;
	// 2177 4079:aload_1         
	// 2178 4080:aload_1         
	// 2179 4081:getfield        #238 <Field int azh.y>
	// 2180 4084:aload_0         
	// 2181 4085:getfield        #12  <Field azh a>
	// 2182 4088:getfield        #217 <Field int azh.ae>
	// 2183 4091:ixor            
	// 2184 4092:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 2185 4095:aload_0         
	// 2186 4096:getfield        #12  <Field azh a>
	// 2187 4099:astore_1        
		abyte0.aA = ((azh) (abyte0)).aY & ~a.bF;
	// 2188 4100:aload_1         
	// 2189 4101:aload_1         
	// 2190 4102:getfield        #163 <Field int azh.aY>
	// 2191 4105:aload_0         
	// 2192 4106:getfield        #12  <Field azh a>
	// 2193 4109:getfield        #241 <Field int azh.bF>
	// 2194 4112:iconst_m1       
	// 2195 4113:ixor            
	// 2196 4114:iand            
	// 2197 4115:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2198 4118:aload_0         
	// 2199 4119:getfield        #12  <Field azh a>
	// 2200 4122:astore_1        
		abyte0.bj = ((azh) (abyte0)).aY ^ a.bj;
	// 2201 4123:aload_1         
	// 2202 4124:aload_1         
	// 2203 4125:getfield        #163 <Field int azh.aY>
	// 2204 4128:aload_0         
	// 2205 4129:getfield        #12  <Field azh a>
	// 2206 4132:getfield        #250 <Field int azh.bj>
	// 2207 4135:ixor            
	// 2208 4136:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 2209 4139:aload_0         
	// 2210 4140:getfield        #12  <Field azh a>
	// 2211 4143:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj & ~a.bF;
	// 2212 4144:aload_1         
	// 2213 4145:aload_1         
	// 2214 4146:getfield        #250 <Field int azh.bj>
	// 2215 4149:aload_0         
	// 2216 4150:getfield        #12  <Field azh a>
	// 2217 4153:getfield        #241 <Field int azh.bF>
	// 2218 4156:iconst_m1       
	// 2219 4157:ixor            
	// 2220 4158:iand            
	// 2221 4159:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 2222 4162:aload_0         
	// 2223 4163:getfield        #12  <Field azh a>
	// 2224 4166:astore_1        
		abyte0.bj = ((azh) (abyte0)).ae ^ a.bj;
	// 2225 4167:aload_1         
	// 2226 4168:aload_1         
	// 2227 4169:getfield        #217 <Field int azh.ae>
	// 2228 4172:aload_0         
	// 2229 4173:getfield        #12  <Field azh a>
	// 2230 4176:getfield        #250 <Field int azh.bj>
	// 2231 4179:ixor            
	// 2232 4180:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 2233 4183:aload_0         
	// 2234 4184:getfield        #12  <Field azh a>
	// 2235 4187:astore_1        
		abyte0.ae = ((azh) (abyte0)).bT | a.aY;
	// 2236 4188:aload_1         
	// 2237 4189:aload_1         
	// 2238 4190:getfield        #247 <Field int azh.bT>
	// 2239 4193:aload_0         
	// 2240 4194:getfield        #12  <Field azh a>
	// 2241 4197:getfield        #163 <Field int azh.aY>
	// 2242 4200:ior             
	// 2243 4201:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 2244 4204:aload_0         
	// 2245 4205:getfield        #12  <Field azh a>
	// 2246 4208:astore_1        
		abyte0.ae = ((azh) (abyte0)).aY ^ a.ae;
	// 2247 4209:aload_1         
	// 2248 4210:aload_1         
	// 2249 4211:getfield        #163 <Field int azh.aY>
	// 2250 4214:aload_0         
	// 2251 4215:getfield        #12  <Field azh a>
	// 2252 4218:getfield        #217 <Field int azh.ae>
	// 2253 4221:ixor            
	// 2254 4222:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 2255 4225:aload_0         
	// 2256 4226:getfield        #12  <Field azh a>
	// 2257 4229:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ae ^ a.bZ;
	// 2258 4230:aload_1         
	// 2259 4231:aload_1         
	// 2260 4232:getfield        #217 <Field int azh.ae>
	// 2261 4235:aload_0         
	// 2262 4236:getfield        #12  <Field azh a>
	// 2263 4239:getfield        #76  <Field int azh.bZ>
	// 2264 4242:ixor            
	// 2265 4243:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2266 4246:aload_0         
	// 2267 4247:getfield        #12  <Field azh a>
	// 2268 4250:astore_1        
		abyte0.bZ = ((azh) (abyte0)).G | a.bZ;
	// 2269 4251:aload_1         
	// 2270 4252:aload_1         
	// 2271 4253:getfield        #253 <Field int azh.G>
	// 2272 4256:aload_0         
	// 2273 4257:getfield        #12  <Field azh a>
	// 2274 4260:getfield        #76  <Field int azh.bZ>
	// 2275 4263:ior             
	// 2276 4264:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2277 4267:aload_0         
	// 2278 4268:getfield        #12  <Field azh a>
	// 2279 4271:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bj ^ a.bZ;
	// 2280 4272:aload_1         
	// 2281 4273:aload_1         
	// 2282 4274:getfield        #250 <Field int azh.bj>
	// 2283 4277:aload_0         
	// 2284 4278:getfield        #12  <Field azh a>
	// 2285 4281:getfield        #76  <Field int azh.bZ>
	// 2286 4284:ixor            
	// 2287 4285:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2288 4288:aload_0         
	// 2289 4289:getfield        #12  <Field azh a>
	// 2290 4292:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & ~a.O;
	// 2291 4293:aload_1         
	// 2292 4294:aload_1         
	// 2293 4295:getfield        #76  <Field int azh.bZ>
	// 2294 4298:aload_0         
	// 2295 4299:getfield        #12  <Field azh a>
	// 2296 4302:getfield        #256 <Field int azh.O>
	// 2297 4305:iconst_m1       
	// 2298 4306:ixor            
	// 2299 4307:iand            
	// 2300 4308:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2301 4311:aload_0         
	// 2302 4312:getfield        #12  <Field azh a>
	// 2303 4315:astore_1        
		abyte0.bj = ((azh) (abyte0)).aY ^ a.bT;
	// 2304 4316:aload_1         
	// 2305 4317:aload_1         
	// 2306 4318:getfield        #163 <Field int azh.aY>
	// 2307 4321:aload_0         
	// 2308 4322:getfield        #12  <Field azh a>
	// 2309 4325:getfield        #247 <Field int azh.bT>
	// 2310 4328:ixor            
	// 2311 4329:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 2312 4332:aload_0         
	// 2313 4333:getfield        #12  <Field azh a>
	// 2314 4336:astore_1        
		abyte0.ae = ((azh) (abyte0)).q & a.y;
	// 2315 4337:aload_1         
	// 2316 4338:aload_1         
	// 2317 4339:getfield        #259 <Field int azh.q>
	// 2318 4342:aload_0         
	// 2319 4343:getfield        #12  <Field azh a>
	// 2320 4346:getfield        #238 <Field int azh.y>
	// 2321 4349:iand            
	// 2322 4350:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 2323 4353:aload_0         
	// 2324 4354:getfield        #12  <Field azh a>
	// 2325 4357:astore_1        
		abyte0.bP = ((azh) (abyte0)).y ^ a.G;
	// 2326 4358:aload_1         
	// 2327 4359:aload_1         
	// 2328 4360:getfield        #238 <Field int azh.y>
	// 2329 4363:aload_0         
	// 2330 4364:getfield        #12  <Field azh a>
	// 2331 4367:getfield        #253 <Field int azh.G>
	// 2332 4370:ixor            
	// 2333 4371:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 2334 4374:aload_0         
	// 2335 4375:getfield        #12  <Field azh a>
	// 2336 4378:astore_1        
		abyte0.aI = ((azh) (abyte0)).bP ^ a.q;
	// 2337 4379:aload_1         
	// 2338 4380:aload_1         
	// 2339 4381:getfield        #154 <Field int azh.bP>
	// 2340 4384:aload_0         
	// 2341 4385:getfield        #12  <Field azh a>
	// 2342 4388:getfield        #259 <Field int azh.q>
	// 2343 4391:ixor            
	// 2344 4392:putfield        #100 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 2345 4395:aload_0         
	// 2346 4396:getfield        #12  <Field azh a>
	// 2347 4399:astore_1        
		abyte0.ay = ((azh) (abyte0)).G | a.y;
	// 2348 4400:aload_1         
	// 2349 4401:aload_1         
	// 2350 4402:getfield        #253 <Field int azh.G>
	// 2351 4405:aload_0         
	// 2352 4406:getfield        #12  <Field azh a>
	// 2353 4409:getfield        #238 <Field int azh.y>
	// 2354 4412:ior             
	// 2355 4413:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2356 4416:aload_0         
	// 2357 4417:getfield        #12  <Field azh a>
	// 2358 4420:astore_1        
		abyte0.aC = ((azh) (abyte0)).q & ~a.ay;
	// 2359 4421:aload_1         
	// 2360 4422:aload_1         
	// 2361 4423:getfield        #259 <Field int azh.q>
	// 2362 4426:aload_0         
	// 2363 4427:getfield        #12  <Field azh a>
	// 2364 4430:getfield        #47  <Field int azh.ay>
	// 2365 4433:iconst_m1       
	// 2366 4434:ixor            
	// 2367 4435:iand            
	// 2368 4436:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2369 4439:aload_0         
	// 2370 4440:getfield        #12  <Field azh a>
	// 2371 4443:astore_1        
		abyte0.bY = ((azh) (abyte0)).aC ^ a.bY;
	// 2372 4444:aload_1         
	// 2373 4445:aload_1         
	// 2374 4446:getfield        #94  <Field int azh.aC>
	// 2375 4449:aload_0         
	// 2376 4450:getfield        #12  <Field azh a>
	// 2377 4453:getfield        #262 <Field int azh.bY>
	// 2378 4456:ixor            
	// 2379 4457:putfield        #262 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 2380 4460:aload_0         
	// 2381 4461:getfield        #12  <Field azh a>
	// 2382 4464:astore_1        
		abyte0.bY = ((azh) (abyte0)).i & ~a.bY;
	// 2383 4465:aload_1         
	// 2384 4466:aload_1         
	// 2385 4467:getfield        #265 <Field int azh.i>
	// 2386 4470:aload_0         
	// 2387 4471:getfield        #12  <Field azh a>
	// 2388 4474:getfield        #262 <Field int azh.bY>
	// 2389 4477:iconst_m1       
	// 2390 4478:ixor            
	// 2391 4479:iand            
	// 2392 4480:putfield        #262 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 2393 4483:aload_0         
	// 2394 4484:getfield        #12  <Field azh a>
	// 2395 4487:astore_1        
		abyte0.ay = ((azh) (abyte0)).q & ~a.ay;
	// 2396 4488:aload_1         
	// 2397 4489:aload_1         
	// 2398 4490:getfield        #259 <Field int azh.q>
	// 2399 4493:aload_0         
	// 2400 4494:getfield        #12  <Field azh a>
	// 2401 4497:getfield        #47  <Field int azh.ay>
	// 2402 4500:iconst_m1       
	// 2403 4501:ixor            
	// 2404 4502:iand            
	// 2405 4503:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2406 4506:aload_0         
	// 2407 4507:getfield        #12  <Field azh a>
	// 2408 4510:astore_1        
		abyte0.aC = ((azh) (abyte0)).y & ~a.c;
	// 2409 4511:aload_1         
	// 2410 4512:aload_1         
	// 2411 4513:getfield        #238 <Field int azh.y>
	// 2412 4516:aload_0         
	// 2413 4517:getfield        #12  <Field azh a>
	// 2414 4520:getfield        #244 <Field int azh.c>
	// 2415 4523:iconst_m1       
	// 2416 4524:ixor            
	// 2417 4525:iand            
	// 2418 4526:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2419 4529:aload_0         
	// 2420 4530:getfield        #12  <Field azh a>
	// 2421 4533:astore_1        
		abyte0.bc = ((azh) (abyte0)).aC & ~a.bT;
	// 2422 4534:aload_1         
	// 2423 4535:aload_1         
	// 2424 4536:getfield        #94  <Field int azh.aC>
	// 2425 4539:aload_0         
	// 2426 4540:getfield        #12  <Field azh a>
	// 2427 4543:getfield        #247 <Field int azh.bT>
	// 2428 4546:iconst_m1       
	// 2429 4547:ixor            
	// 2430 4548:iand            
	// 2431 4549:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2432 4552:aload_0         
	// 2433 4553:getfield        #12  <Field azh a>
	// 2434 4556:astore_1        
		abyte0.bc = ((azh) (abyte0)).bg ^ a.bc;
	// 2435 4557:aload_1         
	// 2436 4558:aload_1         
	// 2437 4559:getfield        #226 <Field int azh.bg>
	// 2438 4562:aload_0         
	// 2439 4563:getfield        #12  <Field azh a>
	// 2440 4566:getfield        #88  <Field int azh.bc>
	// 2441 4569:ixor            
	// 2442 4570:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2443 4573:aload_0         
	// 2444 4574:getfield        #12  <Field azh a>
	// 2445 4577:astore_1        
		abyte0.bc = ((azh) (abyte0)).bF | a.bc;
	// 2446 4578:aload_1         
	// 2447 4579:aload_1         
	// 2448 4580:getfield        #241 <Field int azh.bF>
	// 2449 4583:aload_0         
	// 2450 4584:getfield        #12  <Field azh a>
	// 2451 4587:getfield        #88  <Field int azh.bc>
	// 2452 4590:ior             
	// 2453 4591:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2454 4594:aload_0         
	// 2455 4595:getfield        #12  <Field azh a>
	// 2456 4598:astore_1        
		abyte0.aT = ((azh) (abyte0)).aC ^ a.aT;
	// 2457 4599:aload_1         
	// 2458 4600:aload_1         
	// 2459 4601:getfield        #94  <Field int azh.aC>
	// 2460 4604:aload_0         
	// 2461 4605:getfield        #12  <Field azh a>
	// 2462 4608:getfield        #232 <Field int azh.aT>
	// 2463 4611:ixor            
	// 2464 4612:putfield        #232 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2465 4615:aload_0         
	// 2466 4616:getfield        #12  <Field azh a>
	// 2467 4619:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & ~a.bF;
	// 2468 4620:aload_1         
	// 2469 4621:aload_1         
	// 2470 4622:getfield        #232 <Field int azh.aT>
	// 2471 4625:aload_0         
	// 2472 4626:getfield        #12  <Field azh a>
	// 2473 4629:getfield        #241 <Field int azh.bF>
	// 2474 4632:iconst_m1       
	// 2475 4633:ixor            
	// 2476 4634:iand            
	// 2477 4635:putfield        #232 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2478 4638:aload_0         
	// 2479 4639:getfield        #12  <Field azh a>
	// 2480 4642:astore_1        
		abyte0.bO = ((azh) (abyte0)).aC & ~a.bT;
	// 2481 4643:aload_1         
	// 2482 4644:aload_1         
	// 2483 4645:getfield        #94  <Field int azh.aC>
	// 2484 4648:aload_0         
	// 2485 4649:getfield        #12  <Field azh a>
	// 2486 4652:getfield        #247 <Field int azh.bT>
	// 2487 4655:iconst_m1       
	// 2488 4656:ixor            
	// 2489 4657:iand            
	// 2490 4658:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2491 4661:aload_0         
	// 2492 4662:getfield        #12  <Field azh a>
	// 2493 4665:astore_1        
		abyte0.bO = ((azh) (abyte0)).y ^ a.bO;
	// 2494 4666:aload_1         
	// 2495 4667:aload_1         
	// 2496 4668:getfield        #238 <Field int azh.y>
	// 2497 4671:aload_0         
	// 2498 4672:getfield        #12  <Field azh a>
	// 2499 4675:getfield        #187 <Field int azh.bO>
	// 2500 4678:ixor            
	// 2501 4679:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2502 4682:aload_0         
	// 2503 4683:getfield        #12  <Field azh a>
	// 2504 4686:astore_1        
		abyte0.bc = ((azh) (abyte0)).bO ^ a.bc;
	// 2505 4687:aload_1         
	// 2506 4688:aload_1         
	// 2507 4689:getfield        #187 <Field int azh.bO>
	// 2508 4692:aload_0         
	// 2509 4693:getfield        #12  <Field azh a>
	// 2510 4696:getfield        #88  <Field int azh.bc>
	// 2511 4699:ixor            
	// 2512 4700:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2513 4703:aload_0         
	// 2514 4704:getfield        #12  <Field azh a>
	// 2515 4707:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC & ~a.bT;
	// 2516 4708:aload_1         
	// 2517 4709:aload_1         
	// 2518 4710:getfield        #94  <Field int azh.aC>
	// 2519 4713:aload_0         
	// 2520 4714:getfield        #12  <Field azh a>
	// 2521 4717:getfield        #247 <Field int azh.bT>
	// 2522 4720:iconst_m1       
	// 2523 4721:ixor            
	// 2524 4722:iand            
	// 2525 4723:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2526 4726:aload_0         
	// 2527 4727:getfield        #12  <Field azh a>
	// 2528 4730:astore_1        
		abyte0.aC = ((azh) (abyte0)).aY ^ a.aC;
	// 2529 4731:aload_1         
	// 2530 4732:aload_1         
	// 2531 4733:getfield        #163 <Field int azh.aY>
	// 2532 4736:aload_0         
	// 2533 4737:getfield        #12  <Field azh a>
	// 2534 4740:getfield        #94  <Field int azh.aC>
	// 2535 4743:ixor            
	// 2536 4744:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2537 4747:aload_0         
	// 2538 4748:getfield        #12  <Field azh a>
	// 2539 4751:astore_1        
		abyte0.aX = ((azh) (abyte0)).aC ^ a.aX;
	// 2540 4752:aload_1         
	// 2541 4753:aload_1         
	// 2542 4754:getfield        #94  <Field int azh.aC>
	// 2543 4757:aload_0         
	// 2544 4758:getfield        #12  <Field azh a>
	// 2545 4761:getfield        #268 <Field int azh.aX>
	// 2546 4764:ixor            
	// 2547 4765:putfield        #268 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2548 4768:aload_0         
	// 2549 4769:getfield        #12  <Field azh a>
	// 2550 4772:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.G;
	// 2551 4773:aload_1         
	// 2552 4774:aload_1         
	// 2553 4775:getfield        #268 <Field int azh.aX>
	// 2554 4778:aload_0         
	// 2555 4779:getfield        #12  <Field azh a>
	// 2556 4782:getfield        #253 <Field int azh.G>
	// 2557 4785:iconst_m1       
	// 2558 4786:ixor            
	// 2559 4787:iand            
	// 2560 4788:putfield        #268 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2561 4791:aload_0         
	// 2562 4792:getfield        #12  <Field azh a>
	// 2563 4795:astore_1        
		abyte0.aX = ((azh) (abyte0)).bc ^ a.aX;
	// 2564 4796:aload_1         
	// 2565 4797:aload_1         
	// 2566 4798:getfield        #88  <Field int azh.bc>
	// 2567 4801:aload_0         
	// 2568 4802:getfield        #12  <Field azh a>
	// 2569 4805:getfield        #268 <Field int azh.aX>
	// 2570 4808:ixor            
	// 2571 4809:putfield        #268 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2572 4812:aload_0         
	// 2573 4813:getfield        #12  <Field azh a>
	// 2574 4816:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX | a.O;
	// 2575 4817:aload_1         
	// 2576 4818:aload_1         
	// 2577 4819:getfield        #268 <Field int azh.aX>
	// 2578 4822:aload_0         
	// 2579 4823:getfield        #12  <Field azh a>
	// 2580 4826:getfield        #256 <Field int azh.O>
	// 2581 4829:ior             
	// 2582 4830:putfield        #268 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2583 4833:aload_0         
	// 2584 4834:getfield        #12  <Field azh a>
	// 2585 4837:astore_1        
		abyte0.bc = ((azh) (abyte0)).y & a.c;
	// 2586 4838:aload_1         
	// 2587 4839:aload_1         
	// 2588 4840:getfield        #238 <Field int azh.y>
	// 2589 4843:aload_0         
	// 2590 4844:getfield        #12  <Field azh a>
	// 2591 4847:getfield        #244 <Field int azh.c>
	// 2592 4850:iand            
	// 2593 4851:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2594 4854:aload_0         
	// 2595 4855:getfield        #12  <Field azh a>
	// 2596 4858:astore_1        
		abyte0.aC = ((azh) (abyte0)).c & ~a.bc;
	// 2597 4859:aload_1         
	// 2598 4860:aload_1         
	// 2599 4861:getfield        #244 <Field int azh.c>
	// 2600 4864:aload_0         
	// 2601 4865:getfield        #12  <Field azh a>
	// 2602 4868:getfield        #88  <Field int azh.bc>
	// 2603 4871:iconst_m1       
	// 2604 4872:ixor            
	// 2605 4873:iand            
	// 2606 4874:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2607 4877:aload_0         
	// 2608 4878:getfield        #12  <Field azh a>
	// 2609 4881:astore_1        
		abyte0.aY = ((azh) (abyte0)).bT | a.aC;
	// 2610 4882:aload_1         
	// 2611 4883:aload_1         
	// 2612 4884:getfield        #247 <Field int azh.bT>
	// 2613 4887:aload_0         
	// 2614 4888:getfield        #12  <Field azh a>
	// 2615 4891:getfield        #94  <Field int azh.aC>
	// 2616 4894:ior             
	// 2617 4895:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2618 4898:aload_0         
	// 2619 4899:getfield        #12  <Field azh a>
	// 2620 4902:astore_1        
		abyte0.aY = ((azh) (abyte0)).bg ^ a.aY;
	// 2621 4903:aload_1         
	// 2622 4904:aload_1         
	// 2623 4905:getfield        #226 <Field int azh.bg>
	// 2624 4908:aload_0         
	// 2625 4909:getfield        #12  <Field azh a>
	// 2626 4912:getfield        #163 <Field int azh.aY>
	// 2627 4915:ixor            
	// 2628 4916:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2629 4919:aload_0         
	// 2630 4920:getfield        #12  <Field azh a>
	// 2631 4923:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY & ~a.bF;
	// 2632 4924:aload_1         
	// 2633 4925:aload_1         
	// 2634 4926:getfield        #163 <Field int azh.aY>
	// 2635 4929:aload_0         
	// 2636 4930:getfield        #12  <Field azh a>
	// 2637 4933:getfield        #241 <Field int azh.bF>
	// 2638 4936:iconst_m1       
	// 2639 4937:ixor            
	// 2640 4938:iand            
	// 2641 4939:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2642 4942:aload_0         
	// 2643 4943:getfield        #12  <Field azh a>
	// 2644 4946:astore_1        
		abyte0.bg = ((azh) (abyte0)).bT | a.aC;
	// 2645 4947:aload_1         
	// 2646 4948:aload_1         
	// 2647 4949:getfield        #247 <Field int azh.bT>
	// 2648 4952:aload_0         
	// 2649 4953:getfield        #12  <Field azh a>
	// 2650 4956:getfield        #94  <Field int azh.aC>
	// 2651 4959:ior             
	// 2652 4960:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 2653 4963:aload_0         
	// 2654 4964:getfield        #12  <Field azh a>
	// 2655 4967:astore_1        
		abyte0.bk = ((azh) (abyte0)).bg ^ a.bk;
	// 2656 4968:aload_1         
	// 2657 4969:aload_1         
	// 2658 4970:getfield        #226 <Field int azh.bg>
	// 2659 4973:aload_0         
	// 2660 4974:getfield        #12  <Field azh a>
	// 2661 4977:getfield        #32  <Field int azh.bk>
	// 2662 4980:ixor            
	// 2663 4981:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2664 4984:aload_0         
	// 2665 4985:getfield        #12  <Field azh a>
	// 2666 4988:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & ~a.G;
	// 2667 4989:aload_1         
	// 2668 4990:aload_1         
	// 2669 4991:getfield        #32  <Field int azh.bk>
	// 2670 4994:aload_0         
	// 2671 4995:getfield        #12  <Field azh a>
	// 2672 4998:getfield        #253 <Field int azh.G>
	// 2673 5001:iconst_m1       
	// 2674 5002:ixor            
	// 2675 5003:iand            
	// 2676 5004:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2677 5007:aload_0         
	// 2678 5008:getfield        #12  <Field azh a>
	// 2679 5011:astore_1        
		abyte0.bg = ((azh) (abyte0)).bF | a.bg;
	// 2680 5012:aload_1         
	// 2681 5013:aload_1         
	// 2682 5014:getfield        #241 <Field int azh.bF>
	// 2683 5017:aload_0         
	// 2684 5018:getfield        #12  <Field azh a>
	// 2685 5021:getfield        #226 <Field int azh.bg>
	// 2686 5024:ior             
	// 2687 5025:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 2688 5028:aload_0         
	// 2689 5029:getfield        #12  <Field azh a>
	// 2690 5032:astore_1        
		abyte0.bg = ((azh) (abyte0)).bj ^ a.bg;
	// 2691 5033:aload_1         
	// 2692 5034:aload_1         
	// 2693 5035:getfield        #250 <Field int azh.bj>
	// 2694 5038:aload_0         
	// 2695 5039:getfield        #12  <Field azh a>
	// 2696 5042:getfield        #226 <Field int azh.bg>
	// 2697 5045:ixor            
	// 2698 5046:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 2699 5049:aload_0         
	// 2700 5050:getfield        #12  <Field azh a>
	// 2701 5053:astore_1        
		abyte0.W = ((azh) (abyte0)).aC ^ a.W;
	// 2702 5054:aload_1         
	// 2703 5055:aload_1         
	// 2704 5056:getfield        #94  <Field int azh.aC>
	// 2705 5059:aload_0         
	// 2706 5060:getfield        #12  <Field azh a>
	// 2707 5063:getfield        #166 <Field int azh.W>
	// 2708 5066:ixor            
	// 2709 5067:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2710 5070:aload_0         
	// 2711 5071:getfield        #12  <Field azh a>
	// 2712 5074:astore_1        
		abyte0.aA = ((azh) (abyte0)).W ^ a.aA;
	// 2713 5075:aload_1         
	// 2714 5076:aload_1         
	// 2715 5077:getfield        #166 <Field int azh.W>
	// 2716 5080:aload_0         
	// 2717 5081:getfield        #12  <Field azh a>
	// 2718 5084:getfield        #214 <Field int azh.aA>
	// 2719 5087:ixor            
	// 2720 5088:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2721 5091:aload_0         
	// 2722 5092:getfield        #12  <Field azh a>
	// 2723 5095:astore_1        
		abyte0.aA = ((azh) (abyte0)).aA & ~a.G;
	// 2724 5096:aload_1         
	// 2725 5097:aload_1         
	// 2726 5098:getfield        #214 <Field int azh.aA>
	// 2727 5101:aload_0         
	// 2728 5102:getfield        #12  <Field azh a>
	// 2729 5105:getfield        #253 <Field int azh.G>
	// 2730 5108:iconst_m1       
	// 2731 5109:ixor            
	// 2732 5110:iand            
	// 2733 5111:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2734 5114:aload_0         
	// 2735 5115:getfield        #12  <Field azh a>
	// 2736 5118:astore_1        
		abyte0.W = ((azh) (abyte0)).W & ~a.bF;
	// 2737 5119:aload_1         
	// 2738 5120:aload_1         
	// 2739 5121:getfield        #166 <Field int azh.W>
	// 2740 5124:aload_0         
	// 2741 5125:getfield        #12  <Field azh a>
	// 2742 5128:getfield        #241 <Field int azh.bF>
	// 2743 5131:iconst_m1       
	// 2744 5132:ixor            
	// 2745 5133:iand            
	// 2746 5134:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2747 5137:aload_0         
	// 2748 5138:getfield        #12  <Field azh a>
	// 2749 5141:astore_1        
		abyte0.W = ((azh) (abyte0)).y ^ a.W;
	// 2750 5142:aload_1         
	// 2751 5143:aload_1         
	// 2752 5144:getfield        #238 <Field int azh.y>
	// 2753 5147:aload_0         
	// 2754 5148:getfield        #12  <Field azh a>
	// 2755 5151:getfield        #166 <Field int azh.W>
	// 2756 5154:ixor            
	// 2757 5155:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2758 5158:aload_0         
	// 2759 5159:getfield        #12  <Field azh a>
	// 2760 5162:astore_1        
		abyte0.aA = ((azh) (abyte0)).W ^ a.aA;
	// 2761 5163:aload_1         
	// 2762 5164:aload_1         
	// 2763 5165:getfield        #166 <Field int azh.W>
	// 2764 5168:aload_0         
	// 2765 5169:getfield        #12  <Field azh a>
	// 2766 5172:getfield        #214 <Field int azh.aA>
	// 2767 5175:ixor            
	// 2768 5176:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2769 5179:aload_0         
	// 2770 5180:getfield        #12  <Field azh a>
	// 2771 5183:astore_1        
		abyte0.aA = ((azh) (abyte0)).O | a.aA;
	// 2772 5184:aload_1         
	// 2773 5185:aload_1         
	// 2774 5186:getfield        #256 <Field int azh.O>
	// 2775 5189:aload_0         
	// 2776 5190:getfield        #12  <Field azh a>
	// 2777 5193:getfield        #214 <Field int azh.aA>
	// 2778 5196:ior             
	// 2779 5197:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2780 5200:aload_0         
	// 2781 5201:getfield        #12  <Field azh a>
	// 2782 5204:astore_1        
		abyte0.W = ((azh) (abyte0)).bc & ~a.bT;
	// 2783 5205:aload_1         
	// 2784 5206:aload_1         
	// 2785 5207:getfield        #88  <Field int azh.bc>
	// 2786 5210:aload_0         
	// 2787 5211:getfield        #12  <Field azh a>
	// 2788 5214:getfield        #247 <Field int azh.bT>
	// 2789 5217:iconst_m1       
	// 2790 5218:ixor            
	// 2791 5219:iand            
	// 2792 5220:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2793 5223:aload_0         
	// 2794 5224:getfield        #12  <Field azh a>
	// 2795 5227:astore_1        
		abyte0.W = ((azh) (abyte0)).bc ^ a.W;
	// 2796 5228:aload_1         
	// 2797 5229:aload_1         
	// 2798 5230:getfield        #88  <Field int azh.bc>
	// 2799 5233:aload_0         
	// 2800 5234:getfield        #12  <Field azh a>
	// 2801 5237:getfield        #166 <Field int azh.W>
	// 2802 5240:ixor            
	// 2803 5241:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2804 5244:aload_0         
	// 2805 5245:getfield        #12  <Field azh a>
	// 2806 5248:astore_1        
		abyte0.W = ((azh) (abyte0)).W & ~a.bF;
	// 2807 5249:aload_1         
	// 2808 5250:aload_1         
	// 2809 5251:getfield        #166 <Field int azh.W>
	// 2810 5254:aload_0         
	// 2811 5255:getfield        #12  <Field azh a>
	// 2812 5258:getfield        #241 <Field int azh.bF>
	// 2813 5261:iconst_m1       
	// 2814 5262:ixor            
	// 2815 5263:iand            
	// 2816 5264:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2817 5267:aload_0         
	// 2818 5268:getfield        #12  <Field azh a>
	// 2819 5271:astore_1        
		abyte0.cg = ((azh) (abyte0)).bc ^ a.cg;
	// 2820 5272:aload_1         
	// 2821 5273:aload_1         
	// 2822 5274:getfield        #88  <Field int azh.bc>
	// 2823 5277:aload_0         
	// 2824 5278:getfield        #12  <Field azh a>
	// 2825 5281:getfield        #235 <Field int azh.cg>
	// 2826 5284:ixor            
	// 2827 5285:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 2828 5288:aload_0         
	// 2829 5289:getfield        #12  <Field azh a>
	// 2830 5292:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg ^ a.bF;
	// 2831 5293:aload_1         
	// 2832 5294:aload_1         
	// 2833 5295:getfield        #235 <Field int azh.cg>
	// 2834 5298:aload_0         
	// 2835 5299:getfield        #12  <Field azh a>
	// 2836 5302:getfield        #241 <Field int azh.bF>
	// 2837 5305:ixor            
	// 2838 5306:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 2839 5309:aload_0         
	// 2840 5310:getfield        #12  <Field azh a>
	// 2841 5313:astore_1        
		abyte0.aC = ((azh) (abyte0)).bT | a.bc;
	// 2842 5314:aload_1         
	// 2843 5315:aload_1         
	// 2844 5316:getfield        #247 <Field int azh.bT>
	// 2845 5319:aload_0         
	// 2846 5320:getfield        #12  <Field azh a>
	// 2847 5323:getfield        #88  <Field int azh.bc>
	// 2848 5326:ior             
	// 2849 5327:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2850 5330:aload_0         
	// 2851 5331:getfield        #12  <Field azh a>
	// 2852 5334:astore_1        
		abyte0.aC = ((azh) (abyte0)).ap ^ a.aC;
	// 2853 5335:aload_1         
	// 2854 5336:aload_1         
	// 2855 5337:getfield        #178 <Field int azh.ap>
	// 2856 5340:aload_0         
	// 2857 5341:getfield        #12  <Field azh a>
	// 2858 5344:getfield        #94  <Field int azh.aC>
	// 2859 5347:ixor            
	// 2860 5348:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2861 5351:aload_0         
	// 2862 5352:getfield        #12  <Field azh a>
	// 2863 5355:astore_1        
		abyte0.aT = ((azh) (abyte0)).aC ^ a.aT;
	// 2864 5356:aload_1         
	// 2865 5357:aload_1         
	// 2866 5358:getfield        #94  <Field int azh.aC>
	// 2867 5361:aload_0         
	// 2868 5362:getfield        #12  <Field azh a>
	// 2869 5365:getfield        #232 <Field int azh.aT>
	// 2870 5368:ixor            
	// 2871 5369:putfield        #232 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2872 5372:aload_0         
	// 2873 5373:getfield        #12  <Field azh a>
	// 2874 5376:astore_1        
		abyte0.bc = ((azh) (abyte0)).bc & ~a.bT;
	// 2875 5377:aload_1         
	// 2876 5378:aload_1         
	// 2877 5379:getfield        #88  <Field int azh.bc>
	// 2878 5382:aload_0         
	// 2879 5383:getfield        #12  <Field azh a>
	// 2880 5386:getfield        #247 <Field int azh.bT>
	// 2881 5389:iconst_m1       
	// 2882 5390:ixor            
	// 2883 5391:iand            
	// 2884 5392:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2885 5395:aload_0         
	// 2886 5396:getfield        #12  <Field azh a>
	// 2887 5399:astore_1        
		abyte0.bc = ((azh) (abyte0)).y ^ a.bc;
	// 2888 5400:aload_1         
	// 2889 5401:aload_1         
	// 2890 5402:getfield        #238 <Field int azh.y>
	// 2891 5405:aload_0         
	// 2892 5406:getfield        #12  <Field azh a>
	// 2893 5409:getfield        #88  <Field int azh.bc>
	// 2894 5412:ixor            
	// 2895 5413:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2896 5416:aload_0         
	// 2897 5417:getfield        #12  <Field azh a>
	// 2898 5420:astore_1        
		abyte0.W = ((azh) (abyte0)).bc ^ a.W;
	// 2899 5421:aload_1         
	// 2900 5422:aload_1         
	// 2901 5423:getfield        #88  <Field int azh.bc>
	// 2902 5426:aload_0         
	// 2903 5427:getfield        #12  <Field azh a>
	// 2904 5430:getfield        #166 <Field int azh.W>
	// 2905 5433:ixor            
	// 2906 5434:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2907 5437:aload_0         
	// 2908 5438:getfield        #12  <Field azh a>
	// 2909 5441:astore_1        
		abyte0.W = ((azh) (abyte0)).W & ~a.G;
	// 2910 5442:aload_1         
	// 2911 5443:aload_1         
	// 2912 5444:getfield        #166 <Field int azh.W>
	// 2913 5447:aload_0         
	// 2914 5448:getfield        #12  <Field azh a>
	// 2915 5451:getfield        #253 <Field int azh.G>
	// 2916 5454:iconst_m1       
	// 2917 5455:ixor            
	// 2918 5456:iand            
	// 2919 5457:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2920 5460:aload_0         
	// 2921 5461:getfield        #12  <Field azh a>
	// 2922 5464:astore_1        
		abyte0.W = ((azh) (abyte0)).cg ^ a.W;
	// 2923 5465:aload_1         
	// 2924 5466:aload_1         
	// 2925 5467:getfield        #235 <Field int azh.cg>
	// 2926 5470:aload_0         
	// 2927 5471:getfield        #12  <Field azh a>
	// 2928 5474:getfield        #166 <Field int azh.W>
	// 2929 5477:ixor            
	// 2930 5478:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2931 5481:aload_0         
	// 2932 5482:getfield        #12  <Field azh a>
	// 2933 5485:astore_1        
		abyte0.aA = ((azh) (abyte0)).W ^ a.aA;
	// 2934 5486:aload_1         
	// 2935 5487:aload_1         
	// 2936 5488:getfield        #166 <Field int azh.W>
	// 2937 5491:aload_0         
	// 2938 5492:getfield        #12  <Field azh a>
	// 2939 5495:getfield        #214 <Field int azh.aA>
	// 2940 5498:ixor            
	// 2941 5499:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2942 5502:aload_0         
	// 2943 5503:getfield        #12  <Field azh a>
	// 2944 5506:astore_1        
		abyte0.t = ((azh) (abyte0)).aA ^ a.t;
	// 2945 5507:aload_1         
	// 2946 5508:aload_1         
	// 2947 5509:getfield        #214 <Field int azh.aA>
	// 2948 5512:aload_0         
	// 2949 5513:getfield        #12  <Field azh a>
	// 2950 5516:getfield        #103 <Field int azh.t>
	// 2951 5519:ixor            
	// 2952 5520:putfield        #103 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2953 5523:aload_0         
	// 2954 5524:getfield        #12  <Field azh a>
	// 2955 5527:astore_1        
		abyte0.aA = ((azh) (abyte0)).c & ~a.y;
	// 2956 5528:aload_1         
	// 2957 5529:aload_1         
	// 2958 5530:getfield        #244 <Field int azh.c>
	// 2959 5533:aload_0         
	// 2960 5534:getfield        #12  <Field azh a>
	// 2961 5537:getfield        #238 <Field int azh.y>
	// 2962 5540:iconst_m1       
	// 2963 5541:ixor            
	// 2964 5542:iand            
	// 2965 5543:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2966 5546:aload_0         
	// 2967 5547:getfield        #12  <Field azh a>
	// 2968 5550:astore_1        
		abyte0.ba = ((azh) (abyte0)).aA ^ a.ba;
	// 2969 5551:aload_1         
	// 2970 5552:aload_1         
	// 2971 5553:getfield        #214 <Field int azh.aA>
	// 2972 5556:aload_0         
	// 2973 5557:getfield        #12  <Field azh a>
	// 2974 5560:getfield        #271 <Field int azh.ba>
	// 2975 5563:ixor            
	// 2976 5564:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2977 5567:aload_0         
	// 2978 5568:getfield        #12  <Field azh a>
	// 2979 5571:astore_1        
		abyte0.bv = ((azh) (abyte0)).ba ^ a.bv;
	// 2980 5572:aload_1         
	// 2981 5573:aload_1         
	// 2982 5574:getfield        #271 <Field int azh.ba>
	// 2983 5577:aload_0         
	// 2984 5578:getfield        #12  <Field azh a>
	// 2985 5581:getfield        #274 <Field int azh.bv>
	// 2986 5584:ixor            
	// 2987 5585:putfield        #274 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2988 5588:aload_0         
	// 2989 5589:getfield        #12  <Field azh a>
	// 2990 5592:astore_1        
		abyte0.bv = ((azh) (abyte0)).G | a.bv;
	// 2991 5593:aload_1         
	// 2992 5594:aload_1         
	// 2993 5595:getfield        #253 <Field int azh.G>
	// 2994 5598:aload_0         
	// 2995 5599:getfield        #12  <Field azh a>
	// 2996 5602:getfield        #274 <Field int azh.bv>
	// 2997 5605:ior             
	// 2998 5606:putfield        #274 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2999 5609:aload_0         
	// 3000 5610:getfield        #12  <Field azh a>
	// 3001 5613:astore_1        
		abyte0.bv = ((azh) (abyte0)).aT ^ a.bv;
	// 3002 5614:aload_1         
	// 3003 5615:aload_1         
	// 3004 5616:getfield        #232 <Field int azh.aT>
	// 3005 5619:aload_0         
	// 3006 5620:getfield        #12  <Field azh a>
	// 3007 5623:getfield        #274 <Field int azh.bv>
	// 3008 5626:ixor            
	// 3009 5627:putfield        #274 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 3010 5630:aload_0         
	// 3011 5631:getfield        #12  <Field azh a>
	// 3012 5634:astore_1        
		abyte0.aX = ((azh) (abyte0)).bv ^ a.aX;
	// 3013 5635:aload_1         
	// 3014 5636:aload_1         
	// 3015 5637:getfield        #274 <Field int azh.bv>
	// 3016 5640:aload_0         
	// 3017 5641:getfield        #12  <Field azh a>
	// 3018 5644:getfield        #268 <Field int azh.aX>
	// 3019 5647:ixor            
	// 3020 5648:putfield        #268 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 3021 5651:aload_0         
	// 3022 5652:getfield        #12  <Field azh a>
	// 3023 5655:astore_1        
		abyte0.aL = ((azh) (abyte0)).aX ^ a.aL;
	// 3024 5656:aload_1         
	// 3025 5657:aload_1         
	// 3026 5658:getfield        #268 <Field int azh.aX>
	// 3027 5661:aload_0         
	// 3028 5662:getfield        #12  <Field azh a>
	// 3029 5665:getfield        #277 <Field int azh.aL>
	// 3030 5668:ixor            
	// 3031 5669:putfield        #277 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3032 5672:aload_0         
	// 3033 5673:getfield        #12  <Field azh a>
	// 3034 5676:astore_1        
		abyte0.aX = ((azh) (abyte0)).aL | a.aS;
	// 3035 5677:aload_1         
	// 3036 5678:aload_1         
	// 3037 5679:getfield        #277 <Field int azh.aL>
	// 3038 5682:aload_0         
	// 3039 5683:getfield        #12  <Field azh a>
	// 3040 5686:getfield        #196 <Field int azh.aS>
	// 3041 5689:ior             
	// 3042 5690:putfield        #268 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 3043 5693:aload_0         
	// 3044 5694:getfield        #12  <Field azh a>
	// 3045 5697:astore_1        
		abyte0.bv = ((azh) (abyte0)).aS & ~a.aL;
	// 3046 5698:aload_1         
	// 3047 5699:aload_1         
	// 3048 5700:getfield        #196 <Field int azh.aS>
	// 3049 5703:aload_0         
	// 3050 5704:getfield        #12  <Field azh a>
	// 3051 5707:getfield        #277 <Field int azh.aL>
	// 3052 5710:iconst_m1       
	// 3053 5711:ixor            
	// 3054 5712:iand            
	// 3055 5713:putfield        #274 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 3056 5716:aload_0         
	// 3057 5717:getfield        #12  <Field azh a>
	// 3058 5720:astore_1        
		abyte0.aT = ((azh) (abyte0)).aL | a.aS;
	// 3059 5721:aload_1         
	// 3060 5722:aload_1         
	// 3061 5723:getfield        #277 <Field int azh.aL>
	// 3062 5726:aload_0         
	// 3063 5727:getfield        #12  <Field azh a>
	// 3064 5730:getfield        #196 <Field int azh.aS>
	// 3065 5733:ior             
	// 3066 5734:putfield        #232 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3067 5737:aload_0         
	// 3068 5738:getfield        #12  <Field azh a>
	// 3069 5741:astore_1        
		abyte0.W = ((azh) (abyte0)).bE & a.aT;
	// 3070 5742:aload_1         
	// 3071 5743:aload_1         
	// 3072 5744:getfield        #199 <Field int azh.bE>
	// 3073 5747:aload_0         
	// 3074 5748:getfield        #12  <Field azh a>
	// 3075 5751:getfield        #232 <Field int azh.aT>
	// 3076 5754:iand            
	// 3077 5755:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 3078 5758:aload_0         
	// 3079 5759:getfield        #12  <Field azh a>
	// 3080 5762:astore_1        
		abyte0.W = ((azh) (abyte0)).bv ^ a.W;
	// 3081 5763:aload_1         
	// 3082 5764:aload_1         
	// 3083 5765:getfield        #274 <Field int azh.bv>
	// 3084 5768:aload_0         
	// 3085 5769:getfield        #12  <Field azh a>
	// 3086 5772:getfield        #166 <Field int azh.W>
	// 3087 5775:ixor            
	// 3088 5776:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 3089 5779:aload_0         
	// 3090 5780:getfield        #12  <Field azh a>
	// 3091 5783:astore_1        
		abyte0.W = ((azh) (abyte0)).j | a.W;
	// 3092 5784:aload_1         
	// 3093 5785:aload_1         
	// 3094 5786:getfield        #190 <Field int azh.j>
	// 3095 5789:aload_0         
	// 3096 5790:getfield        #12  <Field azh a>
	// 3097 5793:getfield        #166 <Field int azh.W>
	// 3098 5796:ior             
	// 3099 5797:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 3100 5800:aload_0         
	// 3101 5801:getfield        #12  <Field azh a>
	// 3102 5804:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & ~a.j;
	// 3103 5805:aload_1         
	// 3104 5806:aload_1         
	// 3105 5807:getfield        #232 <Field int azh.aT>
	// 3106 5810:aload_0         
	// 3107 5811:getfield        #12  <Field azh a>
	// 3108 5814:getfield        #190 <Field int azh.j>
	// 3109 5817:iconst_m1       
	// 3110 5818:ixor            
	// 3111 5819:iand            
	// 3112 5820:putfield        #232 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3113 5823:aload_0         
	// 3114 5824:getfield        #12  <Field azh a>
	// 3115 5827:astore_1        
		abyte0.cg = ((azh) (abyte0)).aS & ~a.aL;
	// 3116 5828:aload_1         
	// 3117 5829:aload_1         
	// 3118 5830:getfield        #196 <Field int azh.aS>
	// 3119 5833:aload_0         
	// 3120 5834:getfield        #12  <Field azh a>
	// 3121 5837:getfield        #277 <Field int azh.aL>
	// 3122 5840:iconst_m1       
	// 3123 5841:ixor            
	// 3124 5842:iand            
	// 3125 5843:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 3126 5846:aload_0         
	// 3127 5847:getfield        #12  <Field azh a>
	// 3128 5850:astore_1        
		abyte0.bc = ((azh) (abyte0)).aL | a.aS;
	// 3129 5851:aload_1         
	// 3130 5852:aload_1         
	// 3131 5853:getfield        #277 <Field int azh.aL>
	// 3132 5856:aload_0         
	// 3133 5857:getfield        #12  <Field azh a>
	// 3134 5860:getfield        #196 <Field int azh.aS>
	// 3135 5863:ior             
	// 3136 5864:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 3137 5867:aload_0         
	// 3138 5868:getfield        #12  <Field azh a>
	// 3139 5871:astore_1        
		abyte0.aC = ((azh) (abyte0)).aL | a.aS;
	// 3140 5872:aload_1         
	// 3141 5873:aload_1         
	// 3142 5874:getfield        #277 <Field int azh.aL>
	// 3143 5877:aload_0         
	// 3144 5878:getfield        #12  <Field azh a>
	// 3145 5881:getfield        #196 <Field int azh.aS>
	// 3146 5884:ior             
	// 3147 5885:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 3148 5888:aload_0         
	// 3149 5889:getfield        #12  <Field azh a>
	// 3150 5892:astore_1        
		abyte0.ap = ((azh) (abyte0)).aL | a.aS;
	// 3151 5893:aload_1         
	// 3152 5894:aload_1         
	// 3153 5895:getfield        #277 <Field int azh.aL>
	// 3154 5898:aload_0         
	// 3155 5899:getfield        #12  <Field azh a>
	// 3156 5902:getfield        #196 <Field int azh.aS>
	// 3157 5905:ior             
	// 3158 5906:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 3159 5909:aload_0         
	// 3160 5910:getfield        #12  <Field azh a>
	// 3161 5913:astore_1        
		abyte0.ap = ((azh) (abyte0)).aS ^ a.ap;
	// 3162 5914:aload_1         
	// 3163 5915:aload_1         
	// 3164 5916:getfield        #196 <Field int azh.aS>
	// 3165 5919:aload_0         
	// 3166 5920:getfield        #12  <Field azh a>
	// 3167 5923:getfield        #178 <Field int azh.ap>
	// 3168 5926:ixor            
	// 3169 5927:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 3170 5930:aload_0         
	// 3171 5931:getfield        #12  <Field azh a>
	// 3172 5934:astore_1        
		abyte0.aY = ((azh) (abyte0)).ba ^ a.aY;
	// 3173 5935:aload_1         
	// 3174 5936:aload_1         
	// 3175 5937:getfield        #271 <Field int azh.ba>
	// 3176 5940:aload_0         
	// 3177 5941:getfield        #12  <Field azh a>
	// 3178 5944:getfield        #163 <Field int azh.aY>
	// 3179 5947:ixor            
	// 3180 5948:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 3181 5951:aload_0         
	// 3182 5952:getfield        #12  <Field azh a>
	// 3183 5955:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY ^ a.G;
	// 3184 5956:aload_1         
	// 3185 5957:aload_1         
	// 3186 5958:getfield        #163 <Field int azh.aY>
	// 3187 5961:aload_0         
	// 3188 5962:getfield        #12  <Field azh a>
	// 3189 5965:getfield        #253 <Field int azh.G>
	// 3190 5968:ixor            
	// 3191 5969:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 3192 5972:aload_0         
	// 3193 5973:getfield        #12  <Field azh a>
	// 3194 5976:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aY ^ a.bZ;
	// 3195 5977:aload_1         
	// 3196 5978:aload_1         
	// 3197 5979:getfield        #163 <Field int azh.aY>
	// 3198 5982:aload_0         
	// 3199 5983:getfield        #12  <Field azh a>
	// 3200 5986:getfield        #76  <Field int azh.bZ>
	// 3201 5989:ixor            
	// 3202 5990:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 3203 5993:aload_0         
	// 3204 5994:getfield        #12  <Field azh a>
	// 3205 5997:astore_1        
		abyte0.L = ((azh) (abyte0)).bZ ^ a.L;
	// 3206 5998:aload_1         
	// 3207 5999:aload_1         
	// 3208 6000:getfield        #76  <Field int azh.bZ>
	// 3209 6003:aload_0         
	// 3210 6004:getfield        #12  <Field azh a>
	// 3211 6007:getfield        #280 <Field int azh.L>
	// 3212 6010:ixor            
	// 3213 6011:putfield        #280 <Field int azh.L>
		abyte0 = ((byte []) (a));
	// 3214 6014:aload_0         
	// 3215 6015:getfield        #12  <Field azh a>
	// 3216 6018:astore_1        
		abyte0.bZ = ((azh) (abyte0)).L ^ a.D;
	// 3217 6019:aload_1         
	// 3218 6020:aload_1         
	// 3219 6021:getfield        #280 <Field int azh.L>
	// 3220 6024:aload_0         
	// 3221 6025:getfield        #12  <Field azh a>
	// 3222 6028:getfield        #211 <Field int azh.D>
	// 3223 6031:ixor            
	// 3224 6032:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 3225 6035:aload_0         
	// 3226 6036:getfield        #12  <Field azh a>
	// 3227 6039:astore_1        
		abyte0.bw = ((azh) (abyte0)).bZ ^ a.bw;
	// 3228 6040:aload_1         
	// 3229 6041:aload_1         
	// 3230 6042:getfield        #76  <Field int azh.bZ>
	// 3231 6045:aload_0         
	// 3232 6046:getfield        #12  <Field azh a>
	// 3233 6049:getfield        #85  <Field int azh.bw>
	// 3234 6052:ixor            
	// 3235 6053:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 3236 6056:aload_0         
	// 3237 6057:getfield        #12  <Field azh a>
	// 3238 6060:astore_1        
		abyte0.aY = ((azh) (abyte0)).bZ & ~a.aj;
	// 3239 6061:aload_1         
	// 3240 6062:aload_1         
	// 3241 6063:getfield        #76  <Field int azh.bZ>
	// 3242 6066:aload_0         
	// 3243 6067:getfield        #12  <Field azh a>
	// 3244 6070:getfield        #181 <Field int azh.aj>
	// 3245 6073:iconst_m1       
	// 3246 6074:ixor            
	// 3247 6075:iand            
	// 3248 6076:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 3249 6079:aload_0         
	// 3250 6080:getfield        #12  <Field azh a>
	// 3251 6083:astore_1        
		abyte0.aY = ((azh) (abyte0)).L ^ a.aY;
	// 3252 6084:aload_1         
	// 3253 6085:aload_1         
	// 3254 6086:getfield        #280 <Field int azh.L>
	// 3255 6089:aload_0         
	// 3256 6090:getfield        #12  <Field azh a>
	// 3257 6093:getfield        #163 <Field int azh.aY>
	// 3258 6096:ixor            
	// 3259 6097:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 3260 6100:aload_0         
	// 3261 6101:getfield        #12  <Field azh a>
	// 3262 6104:astore_1        
		abyte0.ba = ((azh) (abyte0)).bZ ^ a.aj;
	// 3263 6105:aload_1         
	// 3264 6106:aload_1         
	// 3265 6107:getfield        #76  <Field int azh.bZ>
	// 3266 6110:aload_0         
	// 3267 6111:getfield        #12  <Field azh a>
	// 3268 6114:getfield        #181 <Field int azh.aj>
	// 3269 6117:ixor            
	// 3270 6118:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 3271 6121:aload_0         
	// 3272 6122:getfield        #12  <Field azh a>
	// 3273 6125:astore_1        
		abyte0.bj = ((azh) (abyte0)).L & a.D;
	// 3274 6126:aload_1         
	// 3275 6127:aload_1         
	// 3276 6128:getfield        #280 <Field int azh.L>
	// 3277 6131:aload_0         
	// 3278 6132:getfield        #12  <Field azh a>
	// 3279 6135:getfield        #211 <Field int azh.D>
	// 3280 6138:iand            
	// 3281 6139:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 3282 6142:aload_0         
	// 3283 6143:getfield        #12  <Field azh a>
	// 3284 6146:astore_1        
		abyte0.bm = ((azh) (abyte0)).bj ^ a.bm;
	// 3285 6147:aload_1         
	// 3286 6148:aload_1         
	// 3287 6149:getfield        #250 <Field int azh.bj>
	// 3288 6152:aload_0         
	// 3289 6153:getfield        #12  <Field azh a>
	// 3290 6156:getfield        #175 <Field int azh.bm>
	// 3291 6159:ixor            
	// 3292 6160:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 3293 6163:aload_0         
	// 3294 6164:getfield        #12  <Field azh a>
	// 3295 6167:astore_1        
		abyte0.bj = ((azh) (abyte0)).D & ~a.L;
	// 3296 6168:aload_1         
	// 3297 6169:aload_1         
	// 3298 6170:getfield        #211 <Field int azh.D>
	// 3299 6173:aload_0         
	// 3300 6174:getfield        #12  <Field azh a>
	// 3301 6177:getfield        #280 <Field int azh.L>
	// 3302 6180:iconst_m1       
	// 3303 6181:ixor            
	// 3304 6182:iand            
	// 3305 6183:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 3306 6186:aload_0         
	// 3307 6187:getfield        #12  <Field azh a>
	// 3308 6190:astore_1        
		abyte0.bO = ((azh) (abyte0)).D & ~a.bj;
	// 3309 6191:aload_1         
	// 3310 6192:aload_1         
	// 3311 6193:getfield        #211 <Field int azh.D>
	// 3312 6196:aload_0         
	// 3313 6197:getfield        #12  <Field azh a>
	// 3314 6200:getfield        #250 <Field int azh.bj>
	// 3315 6203:iconst_m1       
	// 3316 6204:ixor            
	// 3317 6205:iand            
	// 3318 6206:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3319 6209:aload_0         
	// 3320 6210:getfield        #12  <Field azh a>
	// 3321 6213:astore_1        
		abyte0.bp = ((azh) (abyte0)).bj & ~a.aj;
	// 3322 6214:aload_1         
	// 3323 6215:aload_1         
	// 3324 6216:getfield        #250 <Field int azh.bj>
	// 3325 6219:aload_0         
	// 3326 6220:getfield        #12  <Field azh a>
	// 3327 6223:getfield        #181 <Field int azh.aj>
	// 3328 6226:iconst_m1       
	// 3329 6227:ixor            
	// 3330 6228:iand            
	// 3331 6229:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 3332 6232:aload_0         
	// 3333 6233:getfield        #12  <Field azh a>
	// 3334 6236:astore_1        
		abyte0.bp = ((azh) (abyte0)).D ^ a.bp;
	// 3335 6237:aload_1         
	// 3336 6238:aload_1         
	// 3337 6239:getfield        #211 <Field int azh.D>
	// 3338 6242:aload_0         
	// 3339 6243:getfield        #12  <Field azh a>
	// 3340 6246:getfield        #193 <Field int azh.bp>
	// 3341 6249:ixor            
	// 3342 6250:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 3343 6253:aload_0         
	// 3344 6254:getfield        #12  <Field azh a>
	// 3345 6257:astore_1        
		abyte0.bo = ((azh) (abyte0)).bj ^ a.aj;
	// 3346 6258:aload_1         
	// 3347 6259:aload_1         
	// 3348 6260:getfield        #250 <Field int azh.bj>
	// 3349 6263:aload_0         
	// 3350 6264:getfield        #12  <Field azh a>
	// 3351 6267:getfield        #181 <Field int azh.aj>
	// 3352 6270:ixor            
	// 3353 6271:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3354 6274:aload_0         
	// 3355 6275:getfield        #12  <Field azh a>
	// 3356 6278:astore_1        
		abyte0.aW = ((azh) (abyte0)).bj & ~a.aj;
	// 3357 6279:aload_1         
	// 3358 6280:aload_1         
	// 3359 6281:getfield        #250 <Field int azh.bj>
	// 3360 6284:aload_0         
	// 3361 6285:getfield        #12  <Field azh a>
	// 3362 6288:getfield        #181 <Field int azh.aj>
	// 3363 6291:iconst_m1       
	// 3364 6292:ixor            
	// 3365 6293:iand            
	// 3366 6294:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 3367 6297:aload_0         
	// 3368 6298:getfield        #12  <Field azh a>
	// 3369 6301:astore_1        
		abyte0.aW = ((azh) (abyte0)).L ^ a.aW;
	// 3370 6302:aload_1         
	// 3371 6303:aload_1         
	// 3372 6304:getfield        #280 <Field int azh.L>
	// 3373 6307:aload_0         
	// 3374 6308:getfield        #12  <Field azh a>
	// 3375 6311:getfield        #91  <Field int azh.aW>
	// 3376 6314:ixor            
	// 3377 6315:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 3378 6318:aload_0         
	// 3379 6319:getfield        #12  <Field azh a>
	// 3380 6322:astore_1        
		abyte0.bJ = ((azh) (abyte0)).L & ~a.D;
	// 3381 6323:aload_1         
	// 3382 6324:aload_1         
	// 3383 6325:getfield        #280 <Field int azh.L>
	// 3384 6328:aload_0         
	// 3385 6329:getfield        #12  <Field azh a>
	// 3386 6332:getfield        #211 <Field int azh.D>
	// 3387 6335:iconst_m1       
	// 3388 6336:ixor            
	// 3389 6337:iand            
	// 3390 6338:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3391 6341:aload_0         
	// 3392 6342:getfield        #12  <Field azh a>
	// 3393 6345:astore_1        
		abyte0.bC = ((azh) (abyte0)).bJ ^ a.bC;
	// 3394 6346:aload_1         
	// 3395 6347:aload_1         
	// 3396 6348:getfield        #41  <Field int azh.bJ>
	// 3397 6351:aload_0         
	// 3398 6352:getfield        #12  <Field azh a>
	// 3399 6355:getfield        #208 <Field int azh.bC>
	// 3400 6358:ixor            
	// 3401 6359:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 3402 6362:aload_0         
	// 3403 6363:getfield        #12  <Field azh a>
	// 3404 6366:astore_1        
		abyte0.at = ((azh) (abyte0)).aj | a.bJ;
	// 3405 6367:aload_1         
	// 3406 6368:aload_1         
	// 3407 6369:getfield        #181 <Field int azh.aj>
	// 3408 6372:aload_0         
	// 3409 6373:getfield        #12  <Field azh a>
	// 3410 6376:getfield        #41  <Field int azh.bJ>
	// 3411 6379:ior             
	// 3412 6380:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 3413 6383:aload_0         
	// 3414 6384:getfield        #12  <Field azh a>
	// 3415 6387:astore_1        
		abyte0.at = ((azh) (abyte0)).bJ ^ a.at;
	// 3416 6388:aload_1         
	// 3417 6389:aload_1         
	// 3418 6390:getfield        #41  <Field int azh.bJ>
	// 3419 6393:aload_0         
	// 3420 6394:getfield        #12  <Field azh a>
	// 3421 6397:getfield        #44  <Field int azh.at>
	// 3422 6400:ixor            
	// 3423 6401:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 3424 6404:aload_0         
	// 3425 6405:getfield        #12  <Field azh a>
	// 3426 6408:astore_1        
		abyte0.aD = ((azh) (abyte0)).aj | a.bJ;
	// 3427 6409:aload_1         
	// 3428 6410:aload_1         
	// 3429 6411:getfield        #181 <Field int azh.aj>
	// 3430 6414:aload_0         
	// 3431 6415:getfield        #12  <Field azh a>
	// 3432 6418:getfield        #41  <Field int azh.bJ>
	// 3433 6421:ior             
	// 3434 6422:putfield        #184 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 3435 6425:aload_0         
	// 3436 6426:getfield        #12  <Field azh a>
	// 3437 6429:astore_1        
		abyte0.bx = ((azh) (abyte0)).bJ & ~a.aj;
	// 3438 6430:aload_1         
	// 3439 6431:aload_1         
	// 3440 6432:getfield        #41  <Field int azh.bJ>
	// 3441 6435:aload_0         
	// 3442 6436:getfield        #12  <Field azh a>
	// 3443 6439:getfield        #181 <Field int azh.aj>
	// 3444 6442:iconst_m1       
	// 3445 6443:ixor            
	// 3446 6444:iand            
	// 3447 6445:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 3448 6448:aload_0         
	// 3449 6449:getfield        #12  <Field azh a>
	// 3450 6452:astore_1        
		abyte0.bJ = ((azh) (abyte0)).D | a.bJ;
	// 3451 6453:aload_1         
	// 3452 6454:aload_1         
	// 3453 6455:getfield        #211 <Field int azh.D>
	// 3454 6458:aload_0         
	// 3455 6459:getfield        #12  <Field azh a>
	// 3456 6462:getfield        #41  <Field int azh.bJ>
	// 3457 6465:ior             
	// 3458 6466:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3459 6469:aload_0         
	// 3460 6470:getfield        #12  <Field azh a>
	// 3461 6473:astore_1        
		abyte0.ao = ((azh) (abyte0)).bJ & ~a.aj;
	// 3462 6474:aload_1         
	// 3463 6475:aload_1         
	// 3464 6476:getfield        #41  <Field int azh.bJ>
	// 3465 6479:aload_0         
	// 3466 6480:getfield        #12  <Field azh a>
	// 3467 6483:getfield        #181 <Field int azh.aj>
	// 3468 6486:iconst_m1       
	// 3469 6487:ixor            
	// 3470 6488:iand            
	// 3471 6489:putfield        #67  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 3472 6492:aload_0         
	// 3473 6493:getfield        #12  <Field azh a>
	// 3474 6496:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bJ & ~a.aj;
	// 3475 6497:aload_1         
	// 3476 6498:aload_1         
	// 3477 6499:getfield        #41  <Field int azh.bJ>
	// 3478 6502:aload_0         
	// 3479 6503:getfield        #12  <Field azh a>
	// 3480 6506:getfield        #181 <Field int azh.aj>
	// 3481 6509:iconst_m1       
	// 3482 6510:ixor            
	// 3483 6511:iand            
	// 3484 6512:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3485 6515:aload_0         
	// 3486 6516:getfield        #12  <Field azh a>
	// 3487 6519:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bO ^ a.bJ;
	// 3488 6520:aload_1         
	// 3489 6521:aload_1         
	// 3490 6522:getfield        #187 <Field int azh.bO>
	// 3491 6525:aload_0         
	// 3492 6526:getfield        #12  <Field azh a>
	// 3493 6529:getfield        #41  <Field int azh.bJ>
	// 3494 6532:ixor            
	// 3495 6533:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3496 6536:aload_0         
	// 3497 6537:getfield        #12  <Field azh a>
	// 3498 6540:astore_1        
		abyte0.ag = ((azh) (abyte0)).D | a.L;
	// 3499 6541:aload_1         
	// 3500 6542:aload_1         
	// 3501 6543:getfield        #211 <Field int azh.D>
	// 3502 6546:aload_0         
	// 3503 6547:getfield        #12  <Field azh a>
	// 3504 6550:getfield        #280 <Field int azh.L>
	// 3505 6553:ior             
	// 3506 6554:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 3507 6557:aload_0         
	// 3508 6558:getfield        #12  <Field azh a>
	// 3509 6561:astore_1        
		abyte0.ao = ((azh) (abyte0)).ag ^ a.ao;
	// 3510 6562:aload_1         
	// 3511 6563:aload_1         
	// 3512 6564:getfield        #29  <Field int azh.ag>
	// 3513 6567:aload_0         
	// 3514 6568:getfield        #12  <Field azh a>
	// 3515 6571:getfield        #67  <Field int azh.ao>
	// 3516 6574:ixor            
	// 3517 6575:putfield        #67  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 3518 6578:aload_0         
	// 3519 6579:getfield        #12  <Field azh a>
	// 3520 6582:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aj | a.ag;
	// 3521 6583:aload_1         
	// 3522 6584:aload_1         
	// 3523 6585:getfield        #181 <Field int azh.aj>
	// 3524 6588:aload_0         
	// 3525 6589:getfield        #12  <Field azh a>
	// 3526 6592:getfield        #29  <Field int azh.ag>
	// 3527 6595:ior             
	// 3528 6596:putfield        #169 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3529 6599:aload_0         
	// 3530 6600:getfield        #12  <Field azh a>
	// 3531 6603:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bZ ^ a.aQ;
	// 3532 6604:aload_1         
	// 3533 6605:aload_1         
	// 3534 6606:getfield        #76  <Field int azh.bZ>
	// 3535 6609:aload_0         
	// 3536 6610:getfield        #12  <Field azh a>
	// 3537 6613:getfield        #169 <Field int azh.aQ>
	// 3538 6616:ixor            
	// 3539 6617:putfield        #169 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3540 6620:aload_0         
	// 3541 6621:getfield        #12  <Field azh a>
	// 3542 6624:astore_1        
		abyte0.aA = ((azh) (abyte0)).aA & ~a.bF;
	// 3543 6625:aload_1         
	// 3544 6626:aload_1         
	// 3545 6627:getfield        #214 <Field int azh.aA>
	// 3546 6630:aload_0         
	// 3547 6631:getfield        #12  <Field azh a>
	// 3548 6634:getfield        #241 <Field int azh.bF>
	// 3549 6637:iconst_m1       
	// 3550 6638:ixor            
	// 3551 6639:iand            
	// 3552 6640:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3553 6643:aload_0         
	// 3554 6644:getfield        #12  <Field azh a>
	// 3555 6647:astore_1        
		abyte0.bk = ((azh) (abyte0)).aA ^ a.bk;
	// 3556 6648:aload_1         
	// 3557 6649:aload_1         
	// 3558 6650:getfield        #214 <Field int azh.aA>
	// 3559 6653:aload_0         
	// 3560 6654:getfield        #12  <Field azh a>
	// 3561 6657:getfield        #32  <Field int azh.bk>
	// 3562 6660:ixor            
	// 3563 6661:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3564 6664:aload_0         
	// 3565 6665:getfield        #12  <Field azh a>
	// 3566 6668:astore_1        
		abyte0.bk = ((azh) (abyte0)).O | a.bk;
	// 3567 6669:aload_1         
	// 3568 6670:aload_1         
	// 3569 6671:getfield        #256 <Field int azh.O>
	// 3570 6674:aload_0         
	// 3571 6675:getfield        #12  <Field azh a>
	// 3572 6678:getfield        #32  <Field int azh.bk>
	// 3573 6681:ior             
	// 3574 6682:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3575 6685:aload_0         
	// 3576 6686:getfield        #12  <Field azh a>
	// 3577 6689:astore_1        
		abyte0.aA = ((azh) (abyte0)).G | a.aA;
	// 3578 6690:aload_1         
	// 3579 6691:aload_1         
	// 3580 6692:getfield        #253 <Field int azh.G>
	// 3581 6695:aload_0         
	// 3582 6696:getfield        #12  <Field azh a>
	// 3583 6699:getfield        #214 <Field int azh.aA>
	// 3584 6702:ior             
	// 3585 6703:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3586 6706:aload_0         
	// 3587 6707:getfield        #12  <Field azh a>
	// 3588 6710:astore_1        
		abyte0.aA = ((azh) (abyte0)).bg ^ a.aA;
	// 3589 6711:aload_1         
	// 3590 6712:aload_1         
	// 3591 6713:getfield        #226 <Field int azh.bg>
	// 3592 6716:aload_0         
	// 3593 6717:getfield        #12  <Field azh a>
	// 3594 6720:getfield        #214 <Field int azh.aA>
	// 3595 6723:ixor            
	// 3596 6724:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3597 6727:aload_0         
	// 3598 6728:getfield        #12  <Field azh a>
	// 3599 6731:astore_1        
		abyte0.bk = ((azh) (abyte0)).aA ^ a.bk;
	// 3600 6732:aload_1         
	// 3601 6733:aload_1         
	// 3602 6734:getfield        #214 <Field int azh.aA>
	// 3603 6737:aload_0         
	// 3604 6738:getfield        #12  <Field azh a>
	// 3605 6741:getfield        #32  <Field int azh.bk>
	// 3606 6744:ixor            
	// 3607 6745:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3608 6748:aload_0         
	// 3609 6749:getfield        #12  <Field azh a>
	// 3610 6752:astore_1        
		abyte0.p = ((azh) (abyte0)).bk ^ a.p;
	// 3611 6753:aload_1         
	// 3612 6754:aload_1         
	// 3613 6755:getfield        #32  <Field int azh.bk>
	// 3614 6758:aload_0         
	// 3615 6759:getfield        #12  <Field azh a>
	// 3616 6762:getfield        #283 <Field int azh.p>
	// 3617 6765:ixor            
	// 3618 6766:putfield        #283 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 3619 6769:aload_0         
	// 3620 6770:getfield        #12  <Field azh a>
	// 3621 6773:astore_1        
		abyte0.bk = ((azh) (abyte0)).y & a.G;
	// 3622 6774:aload_1         
	// 3623 6775:aload_1         
	// 3624 6776:getfield        #238 <Field int azh.y>
	// 3625 6779:aload_0         
	// 3626 6780:getfield        #12  <Field azh a>
	// 3627 6783:getfield        #253 <Field int azh.G>
	// 3628 6786:iand            
	// 3629 6787:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3630 6790:aload_0         
	// 3631 6791:getfield        #12  <Field azh a>
	// 3632 6794:astore_1        
		abyte0.ae = ((azh) (abyte0)).bk ^ a.ae;
	// 3633 6795:aload_1         
	// 3634 6796:aload_1         
	// 3635 6797:getfield        #32  <Field int azh.bk>
	// 3636 6800:aload_0         
	// 3637 6801:getfield        #12  <Field azh a>
	// 3638 6804:getfield        #217 <Field int azh.ae>
	// 3639 6807:ixor            
	// 3640 6808:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3641 6811:aload_0         
	// 3642 6812:getfield        #12  <Field azh a>
	// 3643 6815:astore_1        
		abyte0.bk = ((azh) (abyte0)).q & a.bk;
	// 3644 6816:aload_1         
	// 3645 6817:aload_1         
	// 3646 6818:getfield        #259 <Field int azh.q>
	// 3647 6821:aload_0         
	// 3648 6822:getfield        #12  <Field azh a>
	// 3649 6825:getfield        #32  <Field int azh.bk>
	// 3650 6828:iand            
	// 3651 6829:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3652 6832:aload_0         
	// 3653 6833:getfield        #12  <Field azh a>
	// 3654 6836:astore_1        
		abyte0.aA = ((azh) (abyte0)).G & ~a.y;
	// 3655 6837:aload_1         
	// 3656 6838:aload_1         
	// 3657 6839:getfield        #253 <Field int azh.G>
	// 3658 6842:aload_0         
	// 3659 6843:getfield        #12  <Field azh a>
	// 3660 6846:getfield        #238 <Field int azh.y>
	// 3661 6849:iconst_m1       
	// 3662 6850:ixor            
	// 3663 6851:iand            
	// 3664 6852:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3665 6855:aload_0         
	// 3666 6856:getfield        #12  <Field azh a>
	// 3667 6859:astore_1        
		abyte0.bg = ((azh) (abyte0)).aA | a.a;
	// 3668 6860:aload_1         
	// 3669 6861:aload_1         
	// 3670 6862:getfield        #214 <Field int azh.aA>
	// 3671 6865:aload_0         
	// 3672 6866:getfield        #12  <Field azh a>
	// 3673 6869:getfield        #52  <Field int azh.a>
	// 3674 6872:ior             
	// 3675 6873:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3676 6876:aload_0         
	// 3677 6877:getfield        #12  <Field azh a>
	// 3678 6880:astore_1        
		abyte0.bg = ((azh) (abyte0)).ae ^ a.bg;
	// 3679 6881:aload_1         
	// 3680 6882:aload_1         
	// 3681 6883:getfield        #217 <Field int azh.ae>
	// 3682 6886:aload_0         
	// 3683 6887:getfield        #12  <Field azh a>
	// 3684 6890:getfield        #226 <Field int azh.bg>
	// 3685 6893:ixor            
	// 3686 6894:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3687 6897:aload_0         
	// 3688 6898:getfield        #12  <Field azh a>
	// 3689 6901:astore_1        
		abyte0.bg = ((azh) (abyte0)).i & ~a.bg;
	// 3690 6902:aload_1         
	// 3691 6903:aload_1         
	// 3692 6904:getfield        #265 <Field int azh.i>
	// 3693 6907:aload_0         
	// 3694 6908:getfield        #12  <Field azh a>
	// 3695 6911:getfield        #226 <Field int azh.bg>
	// 3696 6914:iconst_m1       
	// 3697 6915:ixor            
	// 3698 6916:iand            
	// 3699 6917:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3700 6920:aload_0         
	// 3701 6921:getfield        #12  <Field azh a>
	// 3702 6924:astore_1        
		abyte0.ae = ((azh) (abyte0)).G & ~a.aA;
	// 3703 6925:aload_1         
	// 3704 6926:aload_1         
	// 3705 6927:getfield        #253 <Field int azh.G>
	// 3706 6930:aload_0         
	// 3707 6931:getfield        #12  <Field azh a>
	// 3708 6934:getfield        #214 <Field int azh.aA>
	// 3709 6937:iconst_m1       
	// 3710 6938:ixor            
	// 3711 6939:iand            
	// 3712 6940:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3713 6943:aload_0         
	// 3714 6944:getfield        #12  <Field azh a>
	// 3715 6947:astore_1        
		abyte0.az = ((azh) (abyte0)).ae & ~a.a;
	// 3716 6948:aload_1         
	// 3717 6949:aload_1         
	// 3718 6950:getfield        #217 <Field int azh.ae>
	// 3719 6953:aload_0         
	// 3720 6954:getfield        #12  <Field azh a>
	// 3721 6957:getfield        #52  <Field int azh.a>
	// 3722 6960:iconst_m1       
	// 3723 6961:ixor            
	// 3724 6962:iand            
	// 3725 6963:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 3726 6966:aload_0         
	// 3727 6967:getfield        #12  <Field azh a>
	// 3728 6970:astore_1        
		abyte0.ch = ((azh) (abyte0)).q & ~a.ae;
	// 3729 6971:aload_1         
	// 3730 6972:aload_1         
	// 3731 6973:getfield        #259 <Field int azh.q>
	// 3732 6976:aload_0         
	// 3733 6977:getfield        #12  <Field azh a>
	// 3734 6980:getfield        #217 <Field int azh.ae>
	// 3735 6983:iconst_m1       
	// 3736 6984:ixor            
	// 3737 6985:iand            
	// 3738 6986:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 3739 6989:aload_0         
	// 3740 6990:getfield        #12  <Field azh a>
	// 3741 6993:astore_1        
		abyte0.ch = ((azh) (abyte0)).y ^ a.ch;
	// 3742 6994:aload_1         
	// 3743 6995:aload_1         
	// 3744 6996:getfield        #238 <Field int azh.y>
	// 3745 6999:aload_0         
	// 3746 7000:getfield        #12  <Field azh a>
	// 3747 7003:getfield        #97  <Field int azh.ch>
	// 3748 7006:ixor            
	// 3749 7007:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 3750 7010:aload_0         
	// 3751 7011:getfield        #12  <Field azh a>
	// 3752 7014:astore_1        
		abyte0.ae = ((azh) (abyte0)).a | a.ae;
	// 3753 7015:aload_1         
	// 3754 7016:aload_1         
	// 3755 7017:getfield        #52  <Field int azh.a>
	// 3756 7020:aload_0         
	// 3757 7021:getfield        #12  <Field azh a>
	// 3758 7024:getfield        #217 <Field int azh.ae>
	// 3759 7027:ior             
	// 3760 7028:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3761 7031:aload_0         
	// 3762 7032:getfield        #12  <Field azh a>
	// 3763 7035:astore_1        
		abyte0.ae = ((azh) (abyte0)).y ^ a.ae;
	// 3764 7036:aload_1         
	// 3765 7037:aload_1         
	// 3766 7038:getfield        #238 <Field int azh.y>
	// 3767 7041:aload_0         
	// 3768 7042:getfield        #12  <Field azh a>
	// 3769 7045:getfield        #217 <Field int azh.ae>
	// 3770 7048:ixor            
	// 3771 7049:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3772 7052:aload_0         
	// 3773 7053:getfield        #12  <Field azh a>
	// 3774 7056:astore_1        
		abyte0.ae = ((azh) (abyte0)).i & ~a.ae;
	// 3775 7057:aload_1         
	// 3776 7058:aload_1         
	// 3777 7059:getfield        #265 <Field int azh.i>
	// 3778 7062:aload_0         
	// 3779 7063:getfield        #12  <Field azh a>
	// 3780 7066:getfield        #217 <Field int azh.ae>
	// 3781 7069:iconst_m1       
	// 3782 7070:ixor            
	// 3783 7071:iand            
	// 3784 7072:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3785 7075:aload_0         
	// 3786 7076:getfield        #12  <Field azh a>
	// 3787 7079:astore_1        
		abyte0.b = ((azh) (abyte0)).q & a.aA;
	// 3788 7080:aload_1         
	// 3789 7081:aload_1         
	// 3790 7082:getfield        #259 <Field int azh.q>
	// 3791 7085:aload_0         
	// 3792 7086:getfield        #12  <Field azh a>
	// 3793 7089:getfield        #214 <Field int azh.aA>
	// 3794 7092:iand            
	// 3795 7093:putfield        #142 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3796 7096:aload_0         
	// 3797 7097:getfield        #12  <Field azh a>
	// 3798 7100:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aA ^ a.aZ;
	// 3799 7101:aload_1         
	// 3800 7102:aload_1         
	// 3801 7103:getfield        #214 <Field int azh.aA>
	// 3802 7106:aload_0         
	// 3803 7107:getfield        #12  <Field azh a>
	// 3804 7110:getfield        #286 <Field int azh.aZ>
	// 3805 7113:ixor            
	// 3806 7114:putfield        #286 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3807 7117:aload_0         
	// 3808 7118:getfield        #12  <Field azh a>
	// 3809 7121:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ | a.a;
	// 3810 7122:aload_1         
	// 3811 7123:aload_1         
	// 3812 7124:getfield        #286 <Field int azh.aZ>
	// 3813 7127:aload_0         
	// 3814 7128:getfield        #12  <Field azh a>
	// 3815 7131:getfield        #52  <Field int azh.a>
	// 3816 7134:ior             
	// 3817 7135:putfield        #286 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3818 7138:aload_0         
	// 3819 7139:getfield        #12  <Field azh a>
	// 3820 7142:astore_1        
		abyte0.aZ = ((azh) (abyte0)).ch ^ a.aZ;
	// 3821 7143:aload_1         
	// 3822 7144:aload_1         
	// 3823 7145:getfield        #97  <Field int azh.ch>
	// 3824 7148:aload_0         
	// 3825 7149:getfield        #12  <Field azh a>
	// 3826 7152:getfield        #286 <Field int azh.aZ>
	// 3827 7155:ixor            
	// 3828 7156:putfield        #286 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3829 7159:aload_0         
	// 3830 7160:getfield        #12  <Field azh a>
	// 3831 7163:astore_1        
		abyte0.ch = ((azh) (abyte0)).q & a.aA;
	// 3832 7164:aload_1         
	// 3833 7165:aload_1         
	// 3834 7166:getfield        #259 <Field int azh.q>
	// 3835 7169:aload_0         
	// 3836 7170:getfield        #12  <Field azh a>
	// 3837 7173:getfield        #214 <Field int azh.aA>
	// 3838 7176:iand            
	// 3839 7177:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 3840 7180:aload_0         
	// 3841 7181:getfield        #12  <Field azh a>
	// 3842 7184:astore_1        
		abyte0.bk = ((azh) (abyte0)).aA ^ a.bk;
	// 3843 7185:aload_1         
	// 3844 7186:aload_1         
	// 3845 7187:getfield        #214 <Field int azh.aA>
	// 3846 7190:aload_0         
	// 3847 7191:getfield        #12  <Field azh a>
	// 3848 7194:getfield        #32  <Field int azh.bk>
	// 3849 7197:ixor            
	// 3850 7198:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3851 7201:aload_0         
	// 3852 7202:getfield        #12  <Field azh a>
	// 3853 7205:astore_1        
		abyte0.ce = ((azh) (abyte0)).y & ~a.G;
	// 3854 7206:aload_1         
	// 3855 7207:aload_1         
	// 3856 7208:getfield        #238 <Field int azh.y>
	// 3857 7211:aload_0         
	// 3858 7212:getfield        #12  <Field azh a>
	// 3859 7215:getfield        #253 <Field int azh.G>
	// 3860 7218:iconst_m1       
	// 3861 7219:ixor            
	// 3862 7220:iand            
	// 3863 7221:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 3864 7224:aload_0         
	// 3865 7225:getfield        #12  <Field azh a>
	// 3866 7228:astore_1        
		abyte0.ci = ((azh) (abyte0)).q & a.ce;
	// 3867 7229:aload_1         
	// 3868 7230:aload_1         
	// 3869 7231:getfield        #259 <Field int azh.q>
	// 3870 7234:aload_0         
	// 3871 7235:getfield        #12  <Field azh a>
	// 3872 7238:getfield        #133 <Field int azh.ce>
	// 3873 7241:iand            
	// 3874 7242:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 3875 7245:aload_0         
	// 3876 7246:getfield        #12  <Field azh a>
	// 3877 7249:astore_1        
		abyte0.ci = ((azh) (abyte0)).aA ^ a.ci;
	// 3878 7250:aload_1         
	// 3879 7251:aload_1         
	// 3880 7252:getfield        #214 <Field int azh.aA>
	// 3881 7255:aload_0         
	// 3882 7256:getfield        #12  <Field azh a>
	// 3883 7259:getfield        #106 <Field int azh.ci>
	// 3884 7262:ixor            
	// 3885 7263:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 3886 7266:aload_0         
	// 3887 7267:getfield        #12  <Field azh a>
	// 3888 7270:astore_1        
		abyte0.aA = ((azh) (abyte0)).ci | a.a;
	// 3889 7271:aload_1         
	// 3890 7272:aload_1         
	// 3891 7273:getfield        #106 <Field int azh.ci>
	// 3892 7276:aload_0         
	// 3893 7277:getfield        #12  <Field azh a>
	// 3894 7280:getfield        #52  <Field int azh.a>
	// 3895 7283:ior             
	// 3896 7284:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3897 7287:aload_0         
	// 3898 7288:getfield        #12  <Field azh a>
	// 3899 7291:astore_1        
		abyte0.aA = ((azh) (abyte0)).ar ^ a.aA;
	// 3900 7292:aload_1         
	// 3901 7293:aload_1         
	// 3902 7294:getfield        #289 <Field int azh.ar>
	// 3903 7297:aload_0         
	// 3904 7298:getfield        #12  <Field azh a>
	// 3905 7301:getfield        #214 <Field int azh.aA>
	// 3906 7304:ixor            
	// 3907 7305:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3908 7308:aload_0         
	// 3909 7309:getfield        #12  <Field azh a>
	// 3910 7312:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci | a.a;
	// 3911 7313:aload_1         
	// 3912 7314:aload_1         
	// 3913 7315:getfield        #106 <Field int azh.ci>
	// 3914 7318:aload_0         
	// 3915 7319:getfield        #12  <Field azh a>
	// 3916 7322:getfield        #52  <Field int azh.a>
	// 3917 7325:ior             
	// 3918 7326:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 3919 7329:aload_0         
	// 3920 7330:getfield        #12  <Field azh a>
	// 3921 7333:astore_1        
		abyte0.ci = ((azh) (abyte0)).bk ^ a.ci;
	// 3922 7334:aload_1         
	// 3923 7335:aload_1         
	// 3924 7336:getfield        #32  <Field int azh.bk>
	// 3925 7339:aload_0         
	// 3926 7340:getfield        #12  <Field azh a>
	// 3927 7343:getfield        #106 <Field int azh.ci>
	// 3928 7346:ixor            
	// 3929 7347:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 3930 7350:aload_0         
	// 3931 7351:getfield        #12  <Field azh a>
	// 3932 7354:astore_1        
		abyte0.bg = ((azh) (abyte0)).ci ^ a.bg;
	// 3933 7355:aload_1         
	// 3934 7356:aload_1         
	// 3935 7357:getfield        #106 <Field int azh.ci>
	// 3936 7360:aload_0         
	// 3937 7361:getfield        #12  <Field azh a>
	// 3938 7364:getfield        #226 <Field int azh.bg>
	// 3939 7367:ixor            
	// 3940 7368:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3941 7371:aload_0         
	// 3942 7372:getfield        #12  <Field azh a>
	// 3943 7375:astore_1        
		abyte0.bg = ((azh) (abyte0)).bg & ~a.ak;
	// 3944 7376:aload_1         
	// 3945 7377:aload_1         
	// 3946 7378:getfield        #226 <Field int azh.bg>
	// 3947 7381:aload_0         
	// 3948 7382:getfield        #12  <Field azh a>
	// 3949 7385:getfield        #139 <Field int azh.ak>
	// 3950 7388:iconst_m1       
	// 3951 7389:ixor            
	// 3952 7390:iand            
	// 3953 7391:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3954 7394:aload_0         
	// 3955 7395:getfield        #12  <Field azh a>
	// 3956 7398:astore_1        
		abyte0.ch = ((azh) (abyte0)).ce ^ a.ch;
	// 3957 7399:aload_1         
	// 3958 7400:aload_1         
	// 3959 7401:getfield        #133 <Field int azh.ce>
	// 3960 7404:aload_0         
	// 3961 7405:getfield        #12  <Field azh a>
	// 3962 7408:getfield        #97  <Field int azh.ch>
	// 3963 7411:ixor            
	// 3964 7412:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 3965 7415:aload_0         
	// 3966 7416:getfield        #12  <Field azh a>
	// 3967 7419:astore_1        
		abyte0.ay = ((azh) (abyte0)).ce ^ a.ay;
	// 3968 7420:aload_1         
	// 3969 7421:aload_1         
	// 3970 7422:getfield        #133 <Field int azh.ce>
	// 3971 7425:aload_0         
	// 3972 7426:getfield        #12  <Field azh a>
	// 3973 7429:getfield        #47  <Field int azh.ay>
	// 3974 7432:ixor            
	// 3975 7433:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3976 7436:aload_0         
	// 3977 7437:getfield        #12  <Field azh a>
	// 3978 7440:astore_1        
		abyte0.ci = ((azh) (abyte0)).a | a.ay;
	// 3979 7441:aload_1         
	// 3980 7442:aload_1         
	// 3981 7443:getfield        #52  <Field int azh.a>
	// 3982 7446:aload_0         
	// 3983 7447:getfield        #12  <Field azh a>
	// 3984 7450:getfield        #47  <Field int azh.ay>
	// 3985 7453:ior             
	// 3986 7454:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 3987 7457:aload_0         
	// 3988 7458:getfield        #12  <Field azh a>
	// 3989 7461:astore_1        
		abyte0.ci = ((azh) (abyte0)).aI ^ a.ci;
	// 3990 7462:aload_1         
	// 3991 7463:aload_1         
	// 3992 7464:getfield        #100 <Field int azh.aI>
	// 3993 7467:aload_0         
	// 3994 7468:getfield        #12  <Field azh a>
	// 3995 7471:getfield        #106 <Field int azh.ci>
	// 3996 7474:ixor            
	// 3997 7475:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 3998 7478:aload_0         
	// 3999 7479:getfield        #12  <Field azh a>
	// 4000 7482:astore_1        
		abyte0.ae = ((azh) (abyte0)).ci ^ a.ae;
	// 4001 7483:aload_1         
	// 4002 7484:aload_1         
	// 4003 7485:getfield        #106 <Field int azh.ci>
	// 4004 7488:aload_0         
	// 4005 7489:getfield        #12  <Field azh a>
	// 4006 7492:getfield        #217 <Field int azh.ae>
	// 4007 7495:ixor            
	// 4008 7496:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 4009 7499:aload_0         
	// 4010 7500:getfield        #12  <Field azh a>
	// 4011 7503:astore_1        
		abyte0.az = ((azh) (abyte0)).ay ^ a.az;
	// 4012 7504:aload_1         
	// 4013 7505:aload_1         
	// 4014 7506:getfield        #47  <Field int azh.ay>
	// 4015 7509:aload_0         
	// 4016 7510:getfield        #12  <Field azh a>
	// 4017 7513:getfield        #157 <Field int azh.az>
	// 4018 7516:ixor            
	// 4019 7517:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 4020 7520:aload_0         
	// 4021 7521:getfield        #12  <Field azh a>
	// 4022 7524:astore_1        
		abyte0.az = ((azh) (abyte0)).i & ~a.az;
	// 4023 7525:aload_1         
	// 4024 7526:aload_1         
	// 4025 7527:getfield        #265 <Field int azh.i>
	// 4026 7530:aload_0         
	// 4027 7531:getfield        #12  <Field azh a>
	// 4028 7534:getfield        #157 <Field int azh.az>
	// 4029 7537:iconst_m1       
	// 4030 7538:ixor            
	// 4031 7539:iand            
	// 4032 7540:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 4033 7543:aload_0         
	// 4034 7544:getfield        #12  <Field azh a>
	// 4035 7547:astore_1        
		abyte0.az = ((azh) (abyte0)).aZ ^ a.az;
	// 4036 7548:aload_1         
	// 4037 7549:aload_1         
	// 4038 7550:getfield        #286 <Field int azh.aZ>
	// 4039 7553:aload_0         
	// 4040 7554:getfield        #12  <Field azh a>
	// 4041 7557:getfield        #157 <Field int azh.az>
	// 4042 7560:ixor            
	// 4043 7561:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 4044 7564:aload_0         
	// 4045 7565:getfield        #12  <Field azh a>
	// 4046 7568:astore_1        
		abyte0.ay = ((azh) (abyte0)).i & a.ay;
	// 4047 7569:aload_1         
	// 4048 7570:aload_1         
	// 4049 7571:getfield        #265 <Field int azh.i>
	// 4050 7574:aload_0         
	// 4051 7575:getfield        #12  <Field azh a>
	// 4052 7578:getfield        #47  <Field int azh.ay>
	// 4053 7581:iand            
	// 4054 7582:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4055 7585:aload_0         
	// 4056 7586:getfield        #12  <Field azh a>
	// 4057 7589:astore_1        
		abyte0.ay = ((azh) (abyte0)).av ^ a.ay;
	// 4058 7590:aload_1         
	// 4059 7591:aload_1         
	// 4060 7592:getfield        #292 <Field int azh.av>
	// 4061 7595:aload_0         
	// 4062 7596:getfield        #12  <Field azh a>
	// 4063 7599:getfield        #47  <Field int azh.ay>
	// 4064 7602:ixor            
	// 4065 7603:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4066 7606:aload_0         
	// 4067 7607:getfield        #12  <Field azh a>
	// 4068 7610:astore_1        
		abyte0.ay = ((azh) (abyte0)).ak | a.ay;
	// 4069 7611:aload_1         
	// 4070 7612:aload_1         
	// 4071 7613:getfield        #139 <Field int azh.ak>
	// 4072 7616:aload_0         
	// 4073 7617:getfield        #12  <Field azh a>
	// 4074 7620:getfield        #47  <Field int azh.ay>
	// 4075 7623:ior             
	// 4076 7624:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4077 7627:aload_0         
	// 4078 7628:getfield        #12  <Field azh a>
	// 4079 7631:astore_1        
		abyte0.ay = ((azh) (abyte0)).az ^ a.ay;
	// 4080 7632:aload_1         
	// 4081 7633:aload_1         
	// 4082 7634:getfield        #157 <Field int azh.az>
	// 4083 7637:aload_0         
	// 4084 7638:getfield        #12  <Field azh a>
	// 4085 7641:getfield        #47  <Field int azh.ay>
	// 4086 7644:ixor            
	// 4087 7645:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4088 7648:aload_0         
	// 4089 7649:getfield        #12  <Field azh a>
	// 4090 7652:astore_1        
		abyte0.P = ((azh) (abyte0)).ay ^ a.P;
	// 4091 7653:aload_1         
	// 4092 7654:aload_1         
	// 4093 7655:getfield        #47  <Field int azh.ay>
	// 4094 7658:aload_0         
	// 4095 7659:getfield        #12  <Field azh a>
	// 4096 7662:getfield        #295 <Field int azh.P>
	// 4097 7665:ixor            
	// 4098 7666:putfield        #295 <Field int azh.P>
		abyte0 = ((byte []) (a));
	// 4099 7669:aload_0         
	// 4100 7670:getfield        #12  <Field azh a>
	// 4101 7673:astore_1        
		abyte0.ce = ((azh) (abyte0)).G | a.ce;
	// 4102 7674:aload_1         
	// 4103 7675:aload_1         
	// 4104 7676:getfield        #253 <Field int azh.G>
	// 4105 7679:aload_0         
	// 4106 7680:getfield        #12  <Field azh a>
	// 4107 7683:getfield        #133 <Field int azh.ce>
	// 4108 7686:ior             
	// 4109 7687:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 4110 7690:aload_0         
	// 4111 7691:getfield        #12  <Field azh a>
	// 4112 7694:astore_1        
		abyte0.ay = ((azh) (abyte0)).ce & ~a.a;
	// 4113 7695:aload_1         
	// 4114 7696:aload_1         
	// 4115 7697:getfield        #133 <Field int azh.ce>
	// 4116 7700:aload_0         
	// 4117 7701:getfield        #12  <Field azh a>
	// 4118 7704:getfield        #52  <Field int azh.a>
	// 4119 7707:iconst_m1       
	// 4120 7708:ixor            
	// 4121 7709:iand            
	// 4122 7710:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4123 7713:aload_0         
	// 4124 7714:getfield        #12  <Field azh a>
	// 4125 7717:astore_1        
		abyte0.ay = ((azh) (abyte0)).ch ^ a.ay;
	// 4126 7718:aload_1         
	// 4127 7719:aload_1         
	// 4128 7720:getfield        #97  <Field int azh.ch>
	// 4129 7723:aload_0         
	// 4130 7724:getfield        #12  <Field azh a>
	// 4131 7727:getfield        #47  <Field int azh.ay>
	// 4132 7730:ixor            
	// 4133 7731:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4134 7734:aload_0         
	// 4135 7735:getfield        #12  <Field azh a>
	// 4136 7738:astore_1        
		abyte0.ay = ((azh) (abyte0)).i & ~a.ay;
	// 4137 7739:aload_1         
	// 4138 7740:aload_1         
	// 4139 7741:getfield        #265 <Field int azh.i>
	// 4140 7744:aload_0         
	// 4141 7745:getfield        #12  <Field azh a>
	// 4142 7748:getfield        #47  <Field int azh.ay>
	// 4143 7751:iconst_m1       
	// 4144 7752:ixor            
	// 4145 7753:iand            
	// 4146 7754:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4147 7757:aload_0         
	// 4148 7758:getfield        #12  <Field azh a>
	// 4149 7761:astore_1        
		abyte0.ay = ((azh) (abyte0)).aA ^ a.ay;
	// 4150 7762:aload_1         
	// 4151 7763:aload_1         
	// 4152 7764:getfield        #214 <Field int azh.aA>
	// 4153 7767:aload_0         
	// 4154 7768:getfield        #12  <Field azh a>
	// 4155 7771:getfield        #47  <Field int azh.ay>
	// 4156 7774:ixor            
	// 4157 7775:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4158 7778:aload_0         
	// 4159 7779:getfield        #12  <Field azh a>
	// 4160 7782:astore_1        
		abyte0.ay = ((azh) (abyte0)).ak & ~a.ay;
	// 4161 7783:aload_1         
	// 4162 7784:aload_1         
	// 4163 7785:getfield        #139 <Field int azh.ak>
	// 4164 7788:aload_0         
	// 4165 7789:getfield        #12  <Field azh a>
	// 4166 7792:getfield        #47  <Field int azh.ay>
	// 4167 7795:iconst_m1       
	// 4168 7796:ixor            
	// 4169 7797:iand            
	// 4170 7798:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4171 7801:aload_0         
	// 4172 7802:getfield        #12  <Field azh a>
	// 4173 7805:astore_1        
		abyte0.ay = ((azh) (abyte0)).ae ^ a.ay;
	// 4174 7806:aload_1         
	// 4175 7807:aload_1         
	// 4176 7808:getfield        #217 <Field int azh.ae>
	// 4177 7811:aload_0         
	// 4178 7812:getfield        #12  <Field azh a>
	// 4179 7815:getfield        #47  <Field int azh.ay>
	// 4180 7818:ixor            
	// 4181 7819:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4182 7822:aload_0         
	// 4183 7823:getfield        #12  <Field azh a>
	// 4184 7826:astore_1        
		abyte0.F = ((azh) (abyte0)).ay ^ a.F;
	// 4185 7827:aload_1         
	// 4186 7828:aload_1         
	// 4187 7829:getfield        #47  <Field int azh.ay>
	// 4188 7832:aload_0         
	// 4189 7833:getfield        #12  <Field azh a>
	// 4190 7836:getfield        #298 <Field int azh.F>
	// 4191 7839:ixor            
	// 4192 7840:putfield        #298 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 4193 7843:aload_0         
	// 4194 7844:getfield        #12  <Field azh a>
	// 4195 7847:astore_1        
		abyte0.ay = ((azh) (abyte0)).ad & a.F;
	// 4196 7848:aload_1         
	// 4197 7849:aload_1         
	// 4198 7850:getfield        #220 <Field int azh.ad>
	// 4199 7853:aload_0         
	// 4200 7854:getfield        #12  <Field azh a>
	// 4201 7857:getfield        #298 <Field int azh.F>
	// 4202 7860:iand            
	// 4203 7861:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4204 7864:aload_0         
	// 4205 7865:getfield        #12  <Field azh a>
	// 4206 7868:astore_1        
		abyte0.aA = ((azh) (abyte0)).F ^ a.N;
	// 4207 7869:aload_1         
	// 4208 7870:aload_1         
	// 4209 7871:getfield        #298 <Field int azh.F>
	// 4210 7874:aload_0         
	// 4211 7875:getfield        #12  <Field azh a>
	// 4212 7878:getfield        #223 <Field int azh.N>
	// 4213 7881:ixor            
	// 4214 7882:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 4215 7885:aload_0         
	// 4216 7886:getfield        #12  <Field azh a>
	// 4217 7889:astore_1        
		abyte0.ay = ((azh) (abyte0)).aA ^ a.ay;
	// 4218 7890:aload_1         
	// 4219 7891:aload_1         
	// 4220 7892:getfield        #214 <Field int azh.aA>
	// 4221 7895:aload_0         
	// 4222 7896:getfield        #12  <Field azh a>
	// 4223 7899:getfield        #47  <Field int azh.ay>
	// 4224 7902:ixor            
	// 4225 7903:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 4226 7906:aload_0         
	// 4227 7907:getfield        #12  <Field azh a>
	// 4228 7910:astore_1        
		abyte0.ch = ((azh) (abyte0)).ad & ~a.aA;
	// 4229 7911:aload_1         
	// 4230 7912:aload_1         
	// 4231 7913:getfield        #220 <Field int azh.ad>
	// 4232 7916:aload_0         
	// 4233 7917:getfield        #12  <Field azh a>
	// 4234 7920:getfield        #214 <Field int azh.aA>
	// 4235 7923:iconst_m1       
	// 4236 7924:ixor            
	// 4237 7925:iand            
	// 4238 7926:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4239 7929:aload_0         
	// 4240 7930:getfield        #12  <Field azh a>
	// 4241 7933:astore_1        
		abyte0.ch = ((azh) (abyte0)).F ^ a.ch;
	// 4242 7934:aload_1         
	// 4243 7935:aload_1         
	// 4244 7936:getfield        #298 <Field int azh.F>
	// 4245 7939:aload_0         
	// 4246 7940:getfield        #12  <Field azh a>
	// 4247 7943:getfield        #97  <Field int azh.ch>
	// 4248 7946:ixor            
	// 4249 7947:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4250 7950:aload_0         
	// 4251 7951:getfield        #12  <Field azh a>
	// 4252 7954:astore_1        
		abyte0.az = ((azh) (abyte0)).ad & ~a.F;
	// 4253 7955:aload_1         
	// 4254 7956:aload_1         
	// 4255 7957:getfield        #220 <Field int azh.ad>
	// 4256 7960:aload_0         
	// 4257 7961:getfield        #12  <Field azh a>
	// 4258 7964:getfield        #298 <Field int azh.F>
	// 4259 7967:iconst_m1       
	// 4260 7968:ixor            
	// 4261 7969:iand            
	// 4262 7970:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 4263 7973:aload_0         
	// 4264 7974:getfield        #12  <Field azh a>
	// 4265 7977:astore_1        
		abyte0.av = ((azh) (abyte0)).ad & ~a.F;
	// 4266 7978:aload_1         
	// 4267 7979:aload_1         
	// 4268 7980:getfield        #220 <Field int azh.ad>
	// 4269 7983:aload_0         
	// 4270 7984:getfield        #12  <Field azh a>
	// 4271 7987:getfield        #298 <Field int azh.F>
	// 4272 7990:iconst_m1       
	// 4273 7991:ixor            
	// 4274 7992:iand            
	// 4275 7993:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 4276 7996:aload_0         
	// 4277 7997:getfield        #12  <Field azh a>
	// 4278 8000:astore_1        
		abyte0.aZ = ((azh) (abyte0)).F & ~a.aj;
	// 4279 8001:aload_1         
	// 4280 8002:aload_1         
	// 4281 8003:getfield        #298 <Field int azh.F>
	// 4282 8006:aload_0         
	// 4283 8007:getfield        #12  <Field azh a>
	// 4284 8010:getfield        #181 <Field int azh.aj>
	// 4285 8013:iconst_m1       
	// 4286 8014:ixor            
	// 4287 8015:iand            
	// 4288 8016:putfield        #286 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4289 8019:aload_0         
	// 4290 8020:getfield        #12  <Field azh a>
	// 4291 8023:astore_1        
		abyte0.ci = ((azh) (abyte0)).F & ~a.aZ;
	// 4292 8024:aload_1         
	// 4293 8025:aload_1         
	// 4294 8026:getfield        #298 <Field int azh.F>
	// 4295 8029:aload_0         
	// 4296 8030:getfield        #12  <Field azh a>
	// 4297 8033:getfield        #286 <Field int azh.aZ>
	// 4298 8036:iconst_m1       
	// 4299 8037:ixor            
	// 4300 8038:iand            
	// 4301 8039:putfield        #106 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 4302 8042:aload_0         
	// 4303 8043:getfield        #12  <Field azh a>
	// 4304 8046:astore_1        
		abyte0.bk = ((azh) (abyte0)).aj & a.F;
	// 4305 8047:aload_1         
	// 4306 8048:aload_1         
	// 4307 8049:getfield        #181 <Field int azh.aj>
	// 4308 8052:aload_0         
	// 4309 8053:getfield        #12  <Field azh a>
	// 4310 8056:getfield        #298 <Field int azh.F>
	// 4311 8059:iand            
	// 4312 8060:putfield        #32  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 4313 8063:aload_0         
	// 4314 8064:getfield        #12  <Field azh a>
	// 4315 8067:astore_1        
		abyte0.ar = ((azh) (abyte0)).F & ~a.N;
	// 4316 8068:aload_1         
	// 4317 8069:aload_1         
	// 4318 8070:getfield        #298 <Field int azh.F>
	// 4319 8073:aload_0         
	// 4320 8074:getfield        #12  <Field azh a>
	// 4321 8077:getfield        #223 <Field int azh.N>
	// 4322 8080:iconst_m1       
	// 4323 8081:ixor            
	// 4324 8082:iand            
	// 4325 8083:putfield        #289 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 4326 8086:aload_0         
	// 4327 8087:getfield        #12  <Field azh a>
	// 4328 8090:astore_1        
		abyte0.bU = ((azh) (abyte0)).ad & a.ar;
	// 4329 8091:aload_1         
	// 4330 8092:aload_1         
	// 4331 8093:getfield        #220 <Field int azh.ad>
	// 4332 8096:aload_0         
	// 4333 8097:getfield        #12  <Field azh a>
	// 4334 8100:getfield        #289 <Field int azh.ar>
	// 4335 8103:iand            
	// 4336 8104:putfield        #130 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 4337 8107:aload_0         
	// 4338 8108:getfield        #12  <Field azh a>
	// 4339 8111:astore_1        
		abyte0.bi = ((azh) (abyte0)).ad & a.ar;
	// 4340 8112:aload_1         
	// 4341 8113:aload_1         
	// 4342 8114:getfield        #220 <Field int azh.ad>
	// 4343 8117:aload_0         
	// 4344 8118:getfield        #12  <Field azh a>
	// 4345 8121:getfield        #289 <Field int azh.ar>
	// 4346 8124:iand            
	// 4347 8125:putfield        #124 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 4348 8128:aload_0         
	// 4349 8129:getfield        #12  <Field azh a>
	// 4350 8132:astore_1        
		abyte0.bd = ((azh) (abyte0)).ar | a.N;
	// 4351 8133:aload_1         
	// 4352 8134:aload_1         
	// 4353 8135:getfield        #289 <Field int azh.ar>
	// 4354 8138:aload_0         
	// 4355 8139:getfield        #12  <Field azh a>
	// 4356 8142:getfield        #223 <Field int azh.N>
	// 4357 8145:ior             
	// 4358 8146:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4359 8149:aload_0         
	// 4360 8150:getfield        #12  <Field azh a>
	// 4361 8153:astore_1        
		abyte0.aP = ((azh) (abyte0)).ad & a.bd;
	// 4362 8154:aload_1         
	// 4363 8155:aload_1         
	// 4364 8156:getfield        #220 <Field int azh.ad>
	// 4365 8159:aload_0         
	// 4366 8160:getfield        #12  <Field azh a>
	// 4367 8163:getfield        #121 <Field int azh.bd>
	// 4368 8166:iand            
	// 4369 8167:putfield        #112 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 4370 8170:aload_0         
	// 4371 8171:getfield        #12  <Field azh a>
	// 4372 8174:astore_1        
		abyte0.aP = ((azh) (abyte0)).ar ^ a.aP;
	// 4373 8175:aload_1         
	// 4374 8176:aload_1         
	// 4375 8177:getfield        #289 <Field int azh.ar>
	// 4376 8180:aload_0         
	// 4377 8181:getfield        #12  <Field azh a>
	// 4378 8184:getfield        #112 <Field int azh.aP>
	// 4379 8187:ixor            
	// 4380 8188:putfield        #112 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 4381 8191:aload_0         
	// 4382 8192:getfield        #12  <Field azh a>
	// 4383 8195:astore_1        
		abyte0.bd = ((azh) (abyte0)).ad & a.bd;
	// 4384 8196:aload_1         
	// 4385 8197:aload_1         
	// 4386 8198:getfield        #220 <Field int azh.ad>
	// 4387 8201:aload_0         
	// 4388 8202:getfield        #12  <Field azh a>
	// 4389 8205:getfield        #121 <Field int azh.bd>
	// 4390 8208:iand            
	// 4391 8209:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4392 8212:aload_0         
	// 4393 8213:getfield        #12  <Field azh a>
	// 4394 8216:astore_1        
		abyte0.aO = ((azh) (abyte0)).N & a.F;
	// 4395 8217:aload_1         
	// 4396 8218:aload_1         
	// 4397 8219:getfield        #223 <Field int azh.N>
	// 4398 8222:aload_0         
	// 4399 8223:getfield        #12  <Field azh a>
	// 4400 8226:getfield        #298 <Field int azh.F>
	// 4401 8229:iand            
	// 4402 8230:putfield        #82  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 4403 8233:aload_0         
	// 4404 8234:getfield        #12  <Field azh a>
	// 4405 8237:astore_1        
		abyte0.bU = ((azh) (abyte0)).aO ^ a.bU;
	// 4406 8238:aload_1         
	// 4407 8239:aload_1         
	// 4408 8240:getfield        #82  <Field int azh.aO>
	// 4409 8243:aload_0         
	// 4410 8244:getfield        #12  <Field azh a>
	// 4411 8247:getfield        #130 <Field int azh.bU>
	// 4412 8250:ixor            
	// 4413 8251:putfield        #130 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 4414 8254:aload_0         
	// 4415 8255:getfield        #12  <Field azh a>
	// 4416 8258:astore_1        
		abyte0.ah = ((azh) (abyte0)).ad & a.aO;
	// 4417 8259:aload_1         
	// 4418 8260:aload_1         
	// 4419 8261:getfield        #220 <Field int azh.ad>
	// 4420 8264:aload_0         
	// 4421 8265:getfield        #12  <Field azh a>
	// 4422 8268:getfield        #82  <Field int azh.aO>
	// 4423 8271:iand            
	// 4424 8272:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 4425 8275:aload_0         
	// 4426 8276:getfield        #12  <Field azh a>
	// 4427 8279:astore_1        
		abyte0.av = ((azh) (abyte0)).aO ^ a.av;
	// 4428 8280:aload_1         
	// 4429 8281:aload_1         
	// 4430 8282:getfield        #82  <Field int azh.aO>
	// 4431 8285:aload_0         
	// 4432 8286:getfield        #12  <Field azh a>
	// 4433 8289:getfield        #292 <Field int azh.av>
	// 4434 8292:ixor            
	// 4435 8293:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 4436 8296:aload_0         
	// 4437 8297:getfield        #12  <Field azh a>
	// 4438 8300:astore_1        
		abyte0.aO = ((azh) (abyte0)).ad & ~a.F;
	// 4439 8301:aload_1         
	// 4440 8302:aload_1         
	// 4441 8303:getfield        #220 <Field int azh.ad>
	// 4442 8306:aload_0         
	// 4443 8307:getfield        #12  <Field azh a>
	// 4444 8310:getfield        #298 <Field int azh.F>
	// 4445 8313:iconst_m1       
	// 4446 8314:ixor            
	// 4447 8315:iand            
	// 4448 8316:putfield        #82  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 4449 8319:aload_0         
	// 4450 8320:getfield        #12  <Field azh a>
	// 4451 8323:astore_1        
		abyte0.aO = ((azh) (abyte0)).aA ^ a.aO;
	// 4452 8324:aload_1         
	// 4453 8325:aload_1         
	// 4454 8326:getfield        #214 <Field int azh.aA>
	// 4455 8329:aload_0         
	// 4456 8330:getfield        #12  <Field azh a>
	// 4457 8333:getfield        #82  <Field int azh.aO>
	// 4458 8336:ixor            
	// 4459 8337:putfield        #82  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 4460 8340:aload_0         
	// 4461 8341:getfield        #12  <Field azh a>
	// 4462 8344:astore_1        
		abyte0.au = ((azh) (abyte0)).aj & ~a.F;
	// 4463 8345:aload_1         
	// 4464 8346:aload_1         
	// 4465 8347:getfield        #181 <Field int azh.aj>
	// 4466 8350:aload_0         
	// 4467 8351:getfield        #12  <Field azh a>
	// 4468 8354:getfield        #298 <Field int azh.F>
	// 4469 8357:iconst_m1       
	// 4470 8358:ixor            
	// 4471 8359:iand            
	// 4472 8360:putfield        #301 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4473 8363:aload_0         
	// 4474 8364:getfield        #12  <Field azh a>
	// 4475 8367:astore_1        
		abyte0.C = ((azh) (abyte0)).F | a.au;
	// 4476 8368:aload_1         
	// 4477 8369:aload_1         
	// 4478 8370:getfield        #298 <Field int azh.F>
	// 4479 8373:aload_0         
	// 4480 8374:getfield        #12  <Field azh a>
	// 4481 8377:getfield        #301 <Field int azh.au>
	// 4482 8380:ior             
	// 4483 8381:putfield        #304 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 4484 8384:aload_0         
	// 4485 8385:getfield        #12  <Field azh a>
	// 4486 8388:astore_1        
		abyte0.bQ = ((azh) (abyte0)).N & ~a.F;
	// 4487 8389:aload_1         
	// 4488 8390:aload_1         
	// 4489 8391:getfield        #223 <Field int azh.N>
	// 4490 8394:aload_0         
	// 4491 8395:getfield        #12  <Field azh a>
	// 4492 8398:getfield        #298 <Field int azh.F>
	// 4493 8401:iconst_m1       
	// 4494 8402:ixor            
	// 4495 8403:iand            
	// 4496 8404:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 4497 8407:aload_0         
	// 4498 8408:getfield        #12  <Field azh a>
	// 4499 8411:astore_1        
		abyte0.aE = ((azh) (abyte0)).ad & a.bQ;
	// 4500 8412:aload_1         
	// 4501 8413:aload_1         
	// 4502 8414:getfield        #220 <Field int azh.ad>
	// 4503 8417:aload_0         
	// 4504 8418:getfield        #12  <Field azh a>
	// 4505 8421:getfield        #307 <Field int azh.bQ>
	// 4506 8424:iand            
	// 4507 8425:putfield        #310 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 4508 8428:aload_0         
	// 4509 8429:getfield        #12  <Field azh a>
	// 4510 8432:astore_1        
		abyte0.aE = ((azh) (abyte0)).aA ^ a.aE;
	// 4511 8433:aload_1         
	// 4512 8434:aload_1         
	// 4513 8435:getfield        #214 <Field int azh.aA>
	// 4514 8438:aload_0         
	// 4515 8439:getfield        #12  <Field azh a>
	// 4516 8442:getfield        #310 <Field int azh.aE>
	// 4517 8445:ixor            
	// 4518 8446:putfield        #310 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 4519 8449:aload_0         
	// 4520 8450:getfield        #12  <Field azh a>
	// 4521 8453:astore_1        
		abyte0.bn = ((azh) (abyte0)).ad & a.bQ;
	// 4522 8454:aload_1         
	// 4523 8455:aload_1         
	// 4524 8456:getfield        #220 <Field int azh.ad>
	// 4525 8459:aload_0         
	// 4526 8460:getfield        #12  <Field azh a>
	// 4527 8463:getfield        #307 <Field int azh.bQ>
	// 4528 8466:iand            
	// 4529 8467:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 4530 8470:aload_0         
	// 4531 8471:getfield        #12  <Field azh a>
	// 4532 8474:astore_1        
		abyte0.aM = ((azh) (abyte0)).N & ~a.bQ;
	// 4533 8475:aload_1         
	// 4534 8476:aload_1         
	// 4535 8477:getfield        #223 <Field int azh.N>
	// 4536 8480:aload_0         
	// 4537 8481:getfield        #12  <Field azh a>
	// 4538 8484:getfield        #307 <Field int azh.bQ>
	// 4539 8487:iconst_m1       
	// 4540 8488:ixor            
	// 4541 8489:iand            
	// 4542 8490:putfield        #316 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 4543 8493:aload_0         
	// 4544 8494:getfield        #12  <Field azh a>
	// 4545 8497:astore_1        
		abyte0.aq = ((azh) (abyte0)).aM ^ a.aq;
	// 4546 8498:aload_1         
	// 4547 8499:aload_1         
	// 4548 8500:getfield        #316 <Field int azh.aM>
	// 4549 8503:aload_0         
	// 4550 8504:getfield        #12  <Field azh a>
	// 4551 8507:getfield        #202 <Field int azh.aq>
	// 4552 8510:ixor            
	// 4553 8511:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4554 8514:aload_0         
	// 4555 8515:getfield        #12  <Field azh a>
	// 4556 8518:astore_1        
		abyte0.bS = ((azh) (abyte0)).ad & ~a.aM;
	// 4557 8519:aload_1         
	// 4558 8520:aload_1         
	// 4559 8521:getfield        #220 <Field int azh.ad>
	// 4560 8524:aload_0         
	// 4561 8525:getfield        #12  <Field azh a>
	// 4562 8528:getfield        #316 <Field int azh.aM>
	// 4563 8531:iconst_m1       
	// 4564 8532:ixor            
	// 4565 8533:iand            
	// 4566 8534:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 4567 8537:aload_0         
	// 4568 8538:getfield        #12  <Field azh a>
	// 4569 8541:astore_1        
		abyte0.bS = ((azh) (abyte0)).N ^ a.bS;
	// 4570 8542:aload_1         
	// 4571 8543:aload_1         
	// 4572 8544:getfield        #223 <Field int azh.N>
	// 4573 8547:aload_0         
	// 4574 8548:getfield        #12  <Field azh a>
	// 4575 8551:getfield        #319 <Field int azh.bS>
	// 4576 8554:ixor            
	// 4577 8555:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 4578 8558:aload_0         
	// 4579 8559:getfield        #12  <Field azh a>
	// 4580 8562:astore_1        
		abyte0.ah = ((azh) (abyte0)).aM ^ a.ah;
	// 4581 8563:aload_1         
	// 4582 8564:aload_1         
	// 4583 8565:getfield        #316 <Field int azh.aM>
	// 4584 8568:aload_0         
	// 4585 8569:getfield        #12  <Field azh a>
	// 4586 8572:getfield        #64  <Field int azh.ah>
	// 4587 8575:ixor            
	// 4588 8576:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 4589 8579:aload_0         
	// 4590 8580:getfield        #12  <Field azh a>
	// 4591 8583:astore_1        
		abyte0.bQ = ((azh) (abyte0)).ad & a.bQ;
	// 4592 8584:aload_1         
	// 4593 8585:aload_1         
	// 4594 8586:getfield        #220 <Field int azh.ad>
	// 4595 8589:aload_0         
	// 4596 8590:getfield        #12  <Field azh a>
	// 4597 8593:getfield        #307 <Field int azh.bQ>
	// 4598 8596:iand            
	// 4599 8597:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 4600 8600:aload_0         
	// 4601 8601:getfield        #12  <Field azh a>
	// 4602 8604:astore_1        
		abyte0.bQ = ((azh) (abyte0)).N ^ a.bQ;
	// 4603 8605:aload_1         
	// 4604 8606:aload_1         
	// 4605 8607:getfield        #223 <Field int azh.N>
	// 4606 8610:aload_0         
	// 4607 8611:getfield        #12  <Field azh a>
	// 4608 8614:getfield        #307 <Field int azh.bQ>
	// 4609 8617:ixor            
	// 4610 8618:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 4611 8621:aload_0         
	// 4612 8622:getfield        #12  <Field azh a>
	// 4613 8625:astore_1        
		abyte0.bf = ((azh) (abyte0)).aj ^ a.F;
	// 4614 8626:aload_1         
	// 4615 8627:aload_1         
	// 4616 8628:getfield        #181 <Field int azh.aj>
	// 4617 8631:aload_0         
	// 4618 8632:getfield        #12  <Field azh a>
	// 4619 8635:getfield        #298 <Field int azh.F>
	// 4620 8638:ixor            
	// 4621 8639:putfield        #322 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 4622 8642:aload_0         
	// 4623 8643:getfield        #12  <Field azh a>
	// 4624 8646:astore_1        
		abyte0.ca = ((azh) (abyte0)).ad & ~a.F;
	// 4625 8647:aload_1         
	// 4626 8648:aload_1         
	// 4627 8649:getfield        #220 <Field int azh.ad>
	// 4628 8652:aload_0         
	// 4629 8653:getfield        #12  <Field azh a>
	// 4630 8656:getfield        #298 <Field int azh.F>
	// 4631 8659:iconst_m1       
	// 4632 8660:ixor            
	// 4633 8661:iand            
	// 4634 8662:putfield        #325 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4635 8665:aload_0         
	// 4636 8666:getfield        #12  <Field azh a>
	// 4637 8669:astore_1        
		abyte0.ca = ((azh) (abyte0)).F ^ a.ca;
	// 4638 8670:aload_1         
	// 4639 8671:aload_1         
	// 4640 8672:getfield        #298 <Field int azh.F>
	// 4641 8675:aload_0         
	// 4642 8676:getfield        #12  <Field azh a>
	// 4643 8679:getfield        #325 <Field int azh.ca>
	// 4644 8682:ixor            
	// 4645 8683:putfield        #325 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 4646 8686:aload_0         
	// 4647 8687:getfield        #12  <Field azh a>
	// 4648 8690:astore_1        
		abyte0.aF = ((azh) (abyte0)).F | a.N;
	// 4649 8691:aload_1         
	// 4650 8692:aload_1         
	// 4651 8693:getfield        #298 <Field int azh.F>
	// 4652 8696:aload_0         
	// 4653 8697:getfield        #12  <Field azh a>
	// 4654 8700:getfield        #223 <Field int azh.N>
	// 4655 8703:ior             
	// 4656 8704:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 4657 8707:aload_0         
	// 4658 8708:getfield        #12  <Field azh a>
	// 4659 8711:astore_1        
		abyte0.az = ((azh) (abyte0)).aF ^ a.az;
	// 4660 8712:aload_1         
	// 4661 8713:aload_1         
	// 4662 8714:getfield        #328 <Field int azh.aF>
	// 4663 8717:aload_0         
	// 4664 8718:getfield        #12  <Field azh a>
	// 4665 8721:getfield        #157 <Field int azh.az>
	// 4666 8724:ixor            
	// 4667 8725:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 4668 8728:aload_0         
	// 4669 8729:getfield        #12  <Field azh a>
	// 4670 8732:astore_1        
		abyte0.cj = ((azh) (abyte0)).ad & ~a.aF;
	// 4671 8733:aload_1         
	// 4672 8734:aload_1         
	// 4673 8735:getfield        #220 <Field int azh.ad>
	// 4674 8738:aload_0         
	// 4675 8739:getfield        #12  <Field azh a>
	// 4676 8742:getfield        #328 <Field int azh.aF>
	// 4677 8745:iconst_m1       
	// 4678 8746:ixor            
	// 4679 8747:iand            
	// 4680 8748:putfield        #331 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4681 8751:aload_0         
	// 4682 8752:getfield        #12  <Field azh a>
	// 4683 8755:astore_1        
		abyte0.cj = ((azh) (abyte0)).aA ^ a.cj;
	// 4684 8756:aload_1         
	// 4685 8757:aload_1         
	// 4686 8758:getfield        #214 <Field int azh.aA>
	// 4687 8761:aload_0         
	// 4688 8762:getfield        #12  <Field azh a>
	// 4689 8765:getfield        #331 <Field int azh.cj>
	// 4690 8768:ixor            
	// 4691 8769:putfield        #331 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4692 8772:aload_0         
	// 4693 8773:getfield        #12  <Field azh a>
	// 4694 8776:astore_1        
		abyte0.bn = ((azh) (abyte0)).aF ^ a.bn;
	// 4695 8777:aload_1         
	// 4696 8778:aload_1         
	// 4697 8779:getfield        #328 <Field int azh.aF>
	// 4698 8782:aload_0         
	// 4699 8783:getfield        #12  <Field azh a>
	// 4700 8786:getfield        #313 <Field int azh.bn>
	// 4701 8789:ixor            
	// 4702 8790:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 4703 8793:aload_0         
	// 4704 8794:getfield        #12  <Field azh a>
	// 4705 8797:astore_1        
		abyte0.bi = ((azh) (abyte0)).aF ^ a.bi;
	// 4706 8798:aload_1         
	// 4707 8799:aload_1         
	// 4708 8800:getfield        #328 <Field int azh.aF>
	// 4709 8803:aload_0         
	// 4710 8804:getfield        #12  <Field azh a>
	// 4711 8807:getfield        #124 <Field int azh.bi>
	// 4712 8810:ixor            
	// 4713 8811:putfield        #124 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 4714 8814:aload_0         
	// 4715 8815:getfield        #12  <Field azh a>
	// 4716 8818:astore_1        
		abyte0.aF = ((azh) (abyte0)).ad & ~a.F;
	// 4717 8819:aload_1         
	// 4718 8820:aload_1         
	// 4719 8821:getfield        #220 <Field int azh.ad>
	// 4720 8824:aload_0         
	// 4721 8825:getfield        #12  <Field azh a>
	// 4722 8828:getfield        #298 <Field int azh.F>
	// 4723 8831:iconst_m1       
	// 4724 8832:ixor            
	// 4725 8833:iand            
	// 4726 8834:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 4727 8837:aload_0         
	// 4728 8838:getfield        #12  <Field azh a>
	// 4729 8841:astore_1        
		abyte0.aF = ((azh) (abyte0)).N ^ a.aF;
	// 4730 8842:aload_1         
	// 4731 8843:aload_1         
	// 4732 8844:getfield        #223 <Field int azh.N>
	// 4733 8847:aload_0         
	// 4734 8848:getfield        #12  <Field azh a>
	// 4735 8851:getfield        #328 <Field int azh.aF>
	// 4736 8854:ixor            
	// 4737 8855:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 4738 8858:aload_0         
	// 4739 8859:getfield        #12  <Field azh a>
	// 4740 8862:astore_1        
		abyte0.aA = ((azh) (abyte0)).q & a.ce;
	// 4741 8863:aload_1         
	// 4742 8864:aload_1         
	// 4743 8865:getfield        #259 <Field int azh.q>
	// 4744 8868:aload_0         
	// 4745 8869:getfield        #12  <Field azh a>
	// 4746 8872:getfield        #133 <Field int azh.ce>
	// 4747 8875:iand            
	// 4748 8876:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 4749 8879:aload_0         
	// 4750 8880:getfield        #12  <Field azh a>
	// 4751 8883:astore_1        
		abyte0.aA = ((azh) (abyte0)).a & a.aA;
	// 4752 8884:aload_1         
	// 4753 8885:aload_1         
	// 4754 8886:getfield        #52  <Field int azh.a>
	// 4755 8889:aload_0         
	// 4756 8890:getfield        #12  <Field azh a>
	// 4757 8893:getfield        #214 <Field int azh.aA>
	// 4758 8896:iand            
	// 4759 8897:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 4760 8900:aload_0         
	// 4761 8901:getfield        #12  <Field azh a>
	// 4762 8904:astore_1        
		abyte0.aA = ((azh) (abyte0)).aI ^ a.aA;
	// 4763 8905:aload_1         
	// 4764 8906:aload_1         
	// 4765 8907:getfield        #100 <Field int azh.aI>
	// 4766 8910:aload_0         
	// 4767 8911:getfield        #12  <Field azh a>
	// 4768 8914:getfield        #214 <Field int azh.aA>
	// 4769 8917:ixor            
	// 4770 8918:putfield        #214 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 4771 8921:aload_0         
	// 4772 8922:getfield        #12  <Field azh a>
	// 4773 8925:astore_1        
		abyte0.bI = ((azh) (abyte0)).aA ^ a.bI;
	// 4774 8926:aload_1         
	// 4775 8927:aload_1         
	// 4776 8928:getfield        #214 <Field int azh.aA>
	// 4777 8931:aload_0         
	// 4778 8932:getfield        #12  <Field azh a>
	// 4779 8935:getfield        #334 <Field int azh.bI>
	// 4780 8938:ixor            
	// 4781 8939:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 4782 8942:aload_0         
	// 4783 8943:getfield        #12  <Field azh a>
	// 4784 8946:astore_1        
		abyte0.bg = ((azh) (abyte0)).bI ^ a.bg;
	// 4785 8947:aload_1         
	// 4786 8948:aload_1         
	// 4787 8949:getfield        #334 <Field int azh.bI>
	// 4788 8952:aload_0         
	// 4789 8953:getfield        #12  <Field azh a>
	// 4790 8956:getfield        #226 <Field int azh.bg>
	// 4791 8959:ixor            
	// 4792 8960:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 4793 8963:aload_0         
	// 4794 8964:getfield        #12  <Field azh a>
	// 4795 8967:astore_1        
		abyte0.aG = ((azh) (abyte0)).bg ^ a.aG;
	// 4796 8968:aload_1         
	// 4797 8969:aload_1         
	// 4798 8970:getfield        #226 <Field int azh.bg>
	// 4799 8973:aload_0         
	// 4800 8974:getfield        #12  <Field azh a>
	// 4801 8977:getfield        #337 <Field int azh.aG>
	// 4802 8980:ixor            
	// 4803 8981:putfield        #337 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 4804 8984:aload_0         
	// 4805 8985:getfield        #12  <Field azh a>
	// 4806 8988:astore_1        
		abyte0.ce = ((azh) (abyte0)).q & a.ce;
	// 4807 8989:aload_1         
	// 4808 8990:aload_1         
	// 4809 8991:getfield        #259 <Field int azh.q>
	// 4810 8994:aload_0         
	// 4811 8995:getfield        #12  <Field azh a>
	// 4812 8998:getfield        #133 <Field int azh.ce>
	// 4813 9001:iand            
	// 4814 9002:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 4815 9005:aload_0         
	// 4816 9006:getfield        #12  <Field azh a>
	// 4817 9009:astore_1        
		abyte0.ce = ((azh) (abyte0)).bP ^ a.ce;
	// 4818 9010:aload_1         
	// 4819 9011:aload_1         
	// 4820 9012:getfield        #154 <Field int azh.bP>
	// 4821 9015:aload_0         
	// 4822 9016:getfield        #12  <Field azh a>
	// 4823 9019:getfield        #133 <Field int azh.ce>
	// 4824 9022:ixor            
	// 4825 9023:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 4826 9026:aload_0         
	// 4827 9027:getfield        #12  <Field azh a>
	// 4828 9030:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce | a.a;
	// 4829 9031:aload_1         
	// 4830 9032:aload_1         
	// 4831 9033:getfield        #133 <Field int azh.ce>
	// 4832 9036:aload_0         
	// 4833 9037:getfield        #12  <Field azh a>
	// 4834 9040:getfield        #52  <Field int azh.a>
	// 4835 9043:ior             
	// 4836 9044:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 4837 9047:aload_0         
	// 4838 9048:getfield        #12  <Field azh a>
	// 4839 9051:astore_1        
		abyte0.ce = ((azh) (abyte0)).b ^ a.ce;
	// 4840 9052:aload_1         
	// 4841 9053:aload_1         
	// 4842 9054:getfield        #142 <Field int azh.b>
	// 4843 9057:aload_0         
	// 4844 9058:getfield        #12  <Field azh a>
	// 4845 9061:getfield        #133 <Field int azh.ce>
	// 4846 9064:ixor            
	// 4847 9065:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 4848 9068:aload_0         
	// 4849 9069:getfield        #12  <Field azh a>
	// 4850 9072:astore_1        
		abyte0.bY = ((azh) (abyte0)).ce ^ a.bY;
	// 4851 9073:aload_1         
	// 4852 9074:aload_1         
	// 4853 9075:getfield        #133 <Field int azh.ce>
	// 4854 9078:aload_0         
	// 4855 9079:getfield        #12  <Field azh a>
	// 4856 9082:getfield        #262 <Field int azh.bY>
	// 4857 9085:ixor            
	// 4858 9086:putfield        #262 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4859 9089:aload_0         
	// 4860 9090:getfield        #12  <Field azh a>
	// 4861 9093:astore_1        
		abyte0.bY = ((azh) (abyte0)).ak | a.bY;
	// 4862 9094:aload_1         
	// 4863 9095:aload_1         
	// 4864 9096:getfield        #139 <Field int azh.ak>
	// 4865 9099:aload_0         
	// 4866 9100:getfield        #12  <Field azh a>
	// 4867 9103:getfield        #262 <Field int azh.bY>
	// 4868 9106:ior             
	// 4869 9107:putfield        #262 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4870 9110:aload_0         
	// 4871 9111:getfield        #12  <Field azh a>
	// 4872 9114:astore_1        
		abyte0.bY = ((azh) (abyte0)).ae ^ a.bY;
	// 4873 9115:aload_1         
	// 4874 9116:aload_1         
	// 4875 9117:getfield        #217 <Field int azh.ae>
	// 4876 9120:aload_0         
	// 4877 9121:getfield        #12  <Field azh a>
	// 4878 9124:getfield        #262 <Field int azh.bY>
	// 4879 9127:ixor            
	// 4880 9128:putfield        #262 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4881 9131:aload_0         
	// 4882 9132:getfield        #12  <Field azh a>
	// 4883 9135:astore_1        
		abyte0.bY = ((azh) (abyte0)).bY ^ a.B;
	// 4884 9136:aload_1         
	// 4885 9137:aload_1         
	// 4886 9138:getfield        #262 <Field int azh.bY>
	// 4887 9141:aload_0         
	// 4888 9142:getfield        #12  <Field azh a>
	// 4889 9145:getfield        #118 <Field int azh.B>
	// 4890 9148:ixor            
	// 4891 9149:putfield        #262 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4892 9152:aload_0         
	// 4893 9153:getfield        #12  <Field azh a>
	// 4894 9156:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & ~a.J;
	// 4895 9157:aload_1         
	// 4896 9158:aload_1         
	// 4897 9159:getfield        #340 <Field int azh.aH>
	// 4898 9162:aload_0         
	// 4899 9163:getfield        #12  <Field azh a>
	// 4900 9166:getfield        #38  <Field int azh.J>
	// 4901 9169:iconst_m1       
	// 4902 9170:ixor            
	// 4903 9171:iand            
	// 4904 9172:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 4905 9175:aload_0         
	// 4906 9176:getfield        #12  <Field azh a>
	// 4907 9179:astore_1        
		abyte0.aH = ((azh) (abyte0)).bG ^ a.aH;
	// 4908 9180:aload_1         
	// 4909 9181:aload_1         
	// 4910 9182:getfield        #343 <Field int azh.bG>
	// 4911 9185:aload_0         
	// 4912 9186:getfield        #12  <Field azh a>
	// 4913 9189:getfield        #340 <Field int azh.aH>
	// 4914 9192:ixor            
	// 4915 9193:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 4916 9196:aload_0         
	// 4917 9197:getfield        #12  <Field azh a>
	// 4918 9200:astore_1        
		abyte0.aH = ((azh) (abyte0)).R & ~a.aH;
	// 4919 9201:aload_1         
	// 4920 9202:aload_1         
	// 4921 9203:getfield        #346 <Field int azh.R>
	// 4922 9206:aload_0         
	// 4923 9207:getfield        #12  <Field azh a>
	// 4924 9210:getfield        #340 <Field int azh.aH>
	// 4925 9213:iconst_m1       
	// 4926 9214:ixor            
	// 4927 9215:iand            
	// 4928 9216:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 4929 9219:aload_0         
	// 4930 9220:getfield        #12  <Field azh a>
	// 4931 9223:astore_1        
		abyte0.aH = ((azh) (abyte0)).ax ^ a.aH;
	// 4932 9224:aload_1         
	// 4933 9225:aload_1         
	// 4934 9226:getfield        #349 <Field int azh.ax>
	// 4935 9229:aload_0         
	// 4936 9230:getfield        #12  <Field azh a>
	// 4937 9233:getfield        #340 <Field int azh.aH>
	// 4938 9236:ixor            
	// 4939 9237:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 4940 9240:aload_0         
	// 4941 9241:getfield        #12  <Field azh a>
	// 4942 9244:astore_1        
		abyte0.u = ((azh) (abyte0)).aH ^ a.u;
	// 4943 9245:aload_1         
	// 4944 9246:aload_1         
	// 4945 9247:getfield        #340 <Field int azh.aH>
	// 4946 9250:aload_0         
	// 4947 9251:getfield        #12  <Field azh a>
	// 4948 9254:getfield        #352 <Field int azh.u>
	// 4949 9257:ixor            
	// 4950 9258:putfield        #352 <Field int azh.u>
		abyte0 = ((byte []) (a));
	// 4951 9261:aload_0         
	// 4952 9262:getfield        #12  <Field azh a>
	// 4953 9265:astore_1        
		abyte0.aH = ((azh) (abyte0)).u & a.e;
	// 4954 9266:aload_1         
	// 4955 9267:aload_1         
	// 4956 9268:getfield        #352 <Field int azh.u>
	// 4957 9271:aload_0         
	// 4958 9272:getfield        #12  <Field azh a>
	// 4959 9275:getfield        #355 <Field int azh.e>
	// 4960 9278:iand            
	// 4961 9279:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 4962 9282:aload_0         
	// 4963 9283:getfield        #12  <Field azh a>
	// 4964 9286:astore_1        
		abyte0.ax = ((azh) (abyte0)).e & ~a.aH;
	// 4965 9287:aload_1         
	// 4966 9288:aload_1         
	// 4967 9289:getfield        #355 <Field int azh.e>
	// 4968 9292:aload_0         
	// 4969 9293:getfield        #12  <Field azh a>
	// 4970 9296:getfield        #340 <Field int azh.aH>
	// 4971 9299:iconst_m1       
	// 4972 9300:ixor            
	// 4973 9301:iand            
	// 4974 9302:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4975 9305:aload_0         
	// 4976 9306:getfield        #12  <Field azh a>
	// 4977 9309:astore_1        
		abyte0.R = ((azh) (abyte0)).K & a.aH;
	// 4978 9310:aload_1         
	// 4979 9311:aload_1         
	// 4980 9312:getfield        #358 <Field int azh.K>
	// 4981 9315:aload_0         
	// 4982 9316:getfield        #12  <Field azh a>
	// 4983 9319:getfield        #340 <Field int azh.aH>
	// 4984 9322:iand            
	// 4985 9323:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 4986 9326:aload_0         
	// 4987 9327:getfield        #12  <Field azh a>
	// 4988 9330:astore_1        
		abyte0.R = ((azh) (abyte0)).aH ^ a.R;
	// 4989 9331:aload_1         
	// 4990 9332:aload_1         
	// 4991 9333:getfield        #340 <Field int azh.aH>
	// 4992 9336:aload_0         
	// 4993 9337:getfield        #12  <Field azh a>
	// 4994 9340:getfield        #346 <Field int azh.R>
	// 4995 9343:ixor            
	// 4996 9344:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 4997 9347:aload_0         
	// 4998 9348:getfield        #12  <Field azh a>
	// 4999 9351:astore_1        
		abyte0.bG = ((azh) (abyte0)).K & ~a.aH;
	// 5000 9352:aload_1         
	// 5001 9353:aload_1         
	// 5002 9354:getfield        #358 <Field int azh.K>
	// 5003 9357:aload_0         
	// 5004 9358:getfield        #12  <Field azh a>
	// 5005 9361:getfield        #340 <Field int azh.aH>
	// 5006 9364:iconst_m1       
	// 5007 9365:ixor            
	// 5008 9366:iand            
	// 5009 9367:putfield        #343 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5010 9370:aload_0         
	// 5011 9371:getfield        #12  <Field azh a>
	// 5012 9374:astore_1        
		abyte0.bG = ((azh) (abyte0)).aH ^ a.bG;
	// 5013 9375:aload_1         
	// 5014 9376:aload_1         
	// 5015 9377:getfield        #340 <Field int azh.aH>
	// 5016 9380:aload_0         
	// 5017 9381:getfield        #12  <Field azh a>
	// 5018 9384:getfield        #343 <Field int azh.bG>
	// 5019 9387:ixor            
	// 5020 9388:putfield        #343 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5021 9391:aload_0         
	// 5022 9392:getfield        #12  <Field azh a>
	// 5023 9395:astore_1        
		abyte0.bG = ((azh) (abyte0)).m & a.bG;
	// 5024 9396:aload_1         
	// 5025 9397:aload_1         
	// 5026 9398:getfield        #361 <Field int azh.m>
	// 5027 9401:aload_0         
	// 5028 9402:getfield        #12  <Field azh a>
	// 5029 9405:getfield        #343 <Field int azh.bG>
	// 5030 9408:iand            
	// 5031 9409:putfield        #343 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5032 9412:aload_0         
	// 5033 9413:getfield        #12  <Field azh a>
	// 5034 9416:astore_1        
		abyte0.ae = ((azh) (abyte0)).K & ~a.aH;
	// 5035 9417:aload_1         
	// 5036 9418:aload_1         
	// 5037 9419:getfield        #358 <Field int azh.K>
	// 5038 9422:aload_0         
	// 5039 9423:getfield        #12  <Field azh a>
	// 5040 9426:getfield        #340 <Field int azh.aH>
	// 5041 9429:iconst_m1       
	// 5042 9430:ixor            
	// 5043 9431:iand            
	// 5044 9432:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5045 9435:aload_0         
	// 5046 9436:getfield        #12  <Field azh a>
	// 5047 9439:astore_1        
		abyte0.ae = ((azh) (abyte0)).ax ^ a.ae;
	// 5048 9440:aload_1         
	// 5049 9441:aload_1         
	// 5050 9442:getfield        #349 <Field int azh.ax>
	// 5051 9445:aload_0         
	// 5052 9446:getfield        #12  <Field azh a>
	// 5053 9449:getfield        #217 <Field int azh.ae>
	// 5054 9452:ixor            
	// 5055 9453:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5056 9456:aload_0         
	// 5057 9457:getfield        #12  <Field azh a>
	// 5058 9460:astore_1        
		abyte0.ae = ((azh) (abyte0)).m & ~a.ae;
	// 5059 9461:aload_1         
	// 5060 9462:aload_1         
	// 5061 9463:getfield        #361 <Field int azh.m>
	// 5062 9466:aload_0         
	// 5063 9467:getfield        #12  <Field azh a>
	// 5064 9470:getfield        #217 <Field int azh.ae>
	// 5065 9473:iconst_m1       
	// 5066 9474:ixor            
	// 5067 9475:iand            
	// 5068 9476:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5069 9479:aload_0         
	// 5070 9480:getfield        #12  <Field azh a>
	// 5071 9483:astore_1        
		abyte0.ax = ((azh) (abyte0)).K & ~a.aH;
	// 5072 9484:aload_1         
	// 5073 9485:aload_1         
	// 5074 9486:getfield        #358 <Field int azh.K>
	// 5075 9489:aload_0         
	// 5076 9490:getfield        #12  <Field azh a>
	// 5077 9493:getfield        #340 <Field int azh.aH>
	// 5078 9496:iconst_m1       
	// 5079 9497:ixor            
	// 5080 9498:iand            
	// 5081 9499:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5082 9502:aload_0         
	// 5083 9503:getfield        #12  <Field azh a>
	// 5084 9506:astore_1        
		abyte0.ce = ((azh) (abyte0)).K & a.aH;
	// 5085 9507:aload_1         
	// 5086 9508:aload_1         
	// 5087 9509:getfield        #358 <Field int azh.K>
	// 5088 9512:aload_0         
	// 5089 9513:getfield        #12  <Field azh a>
	// 5090 9516:getfield        #340 <Field int azh.aH>
	// 5091 9519:iand            
	// 5092 9520:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 5093 9523:aload_0         
	// 5094 9524:getfield        #12  <Field azh a>
	// 5095 9527:astore_1        
		abyte0.aH = ((azh) (abyte0)).K & ~a.aH;
	// 5096 9528:aload_1         
	// 5097 9529:aload_1         
	// 5098 9530:getfield        #358 <Field int azh.K>
	// 5099 9533:aload_0         
	// 5100 9534:getfield        #12  <Field azh a>
	// 5101 9537:getfield        #340 <Field int azh.aH>
	// 5102 9540:iconst_m1       
	// 5103 9541:ixor            
	// 5104 9542:iand            
	// 5105 9543:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 5106 9546:aload_0         
	// 5107 9547:getfield        #12  <Field azh a>
	// 5108 9550:astore_1        
		abyte0.b = ((azh) (abyte0)).u ^ a.e;
	// 5109 9551:aload_1         
	// 5110 9552:aload_1         
	// 5111 9553:getfield        #352 <Field int azh.u>
	// 5112 9556:aload_0         
	// 5113 9557:getfield        #12  <Field azh a>
	// 5114 9560:getfield        #355 <Field int azh.e>
	// 5115 9563:ixor            
	// 5116 9564:putfield        #142 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5117 9567:aload_0         
	// 5118 9568:getfield        #12  <Field azh a>
	// 5119 9571:astore_1        
		abyte0.bP = ((azh) (abyte0)).m & ~a.b;
	// 5120 9572:aload_1         
	// 5121 9573:aload_1         
	// 5122 9574:getfield        #361 <Field int azh.m>
	// 5123 9577:aload_0         
	// 5124 9578:getfield        #12  <Field azh a>
	// 5125 9581:getfield        #142 <Field int azh.b>
	// 5126 9584:iconst_m1       
	// 5127 9585:ixor            
	// 5128 9586:iand            
	// 5129 9587:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 5130 9590:aload_0         
	// 5131 9591:getfield        #12  <Field azh a>
	// 5132 9594:astore_1        
		abyte0.bP = ((azh) (abyte0)).R ^ a.bP;
	// 5133 9595:aload_1         
	// 5134 9596:aload_1         
	// 5135 9597:getfield        #346 <Field int azh.R>
	// 5136 9600:aload_0         
	// 5137 9601:getfield        #12  <Field azh a>
	// 5138 9604:getfield        #154 <Field int azh.bP>
	// 5139 9607:ixor            
	// 5140 9608:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 5141 9611:aload_0         
	// 5142 9612:getfield        #12  <Field azh a>
	// 5143 9615:astore_1        
		abyte0.bP = ((azh) (abyte0)).bs | a.bP;
	// 5144 9616:aload_1         
	// 5145 9617:aload_1         
	// 5146 9618:getfield        #364 <Field int azh.bs>
	// 5147 9621:aload_0         
	// 5148 9622:getfield        #12  <Field azh a>
	// 5149 9625:getfield        #154 <Field int azh.bP>
	// 5150 9628:ior             
	// 5151 9629:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 5152 9632:aload_0         
	// 5153 9633:getfield        #12  <Field azh a>
	// 5154 9636:astore_1        
		abyte0.ce = ((azh) (abyte0)).b ^ a.ce;
	// 5155 9637:aload_1         
	// 5156 9638:aload_1         
	// 5157 9639:getfield        #142 <Field int azh.b>
	// 5158 9642:aload_0         
	// 5159 9643:getfield        #12  <Field azh a>
	// 5160 9646:getfield        #133 <Field int azh.ce>
	// 5161 9649:ixor            
	// 5162 9650:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 5163 9653:aload_0         
	// 5164 9654:getfield        #12  <Field azh a>
	// 5165 9657:astore_1        
		abyte0.bG = ((azh) (abyte0)).ce ^ a.bG;
	// 5166 9658:aload_1         
	// 5167 9659:aload_1         
	// 5168 9660:getfield        #133 <Field int azh.ce>
	// 5169 9663:aload_0         
	// 5170 9664:getfield        #12  <Field azh a>
	// 5171 9667:getfield        #343 <Field int azh.bG>
	// 5172 9670:ixor            
	// 5173 9671:putfield        #343 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5174 9674:aload_0         
	// 5175 9675:getfield        #12  <Field azh a>
	// 5176 9678:astore_1        
		abyte0.ce = ((azh) (abyte0)).m & ~a.b;
	// 5177 9679:aload_1         
	// 5178 9680:aload_1         
	// 5179 9681:getfield        #361 <Field int azh.m>
	// 5180 9684:aload_0         
	// 5181 9685:getfield        #12  <Field azh a>
	// 5182 9688:getfield        #142 <Field int azh.b>
	// 5183 9691:iconst_m1       
	// 5184 9692:ixor            
	// 5185 9693:iand            
	// 5186 9694:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 5187 9697:aload_0         
	// 5188 9698:getfield        #12  <Field azh a>
	// 5189 9701:astore_1        
		abyte0.R = ((azh) (abyte0)).K & a.b;
	// 5190 9702:aload_1         
	// 5191 9703:aload_1         
	// 5192 9704:getfield        #358 <Field int azh.K>
	// 5193 9707:aload_0         
	// 5194 9708:getfield        #12  <Field azh a>
	// 5195 9711:getfield        #142 <Field int azh.b>
	// 5196 9714:iand            
	// 5197 9715:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5198 9718:aload_0         
	// 5199 9719:getfield        #12  <Field azh a>
	// 5200 9722:astore_1        
		abyte0.R = ((azh) (abyte0)).e ^ a.R;
	// 5201 9723:aload_1         
	// 5202 9724:aload_1         
	// 5203 9725:getfield        #355 <Field int azh.e>
	// 5204 9728:aload_0         
	// 5205 9729:getfield        #12  <Field azh a>
	// 5206 9732:getfield        #346 <Field int azh.R>
	// 5207 9735:ixor            
	// 5208 9736:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5209 9739:aload_0         
	// 5210 9740:getfield        #12  <Field azh a>
	// 5211 9743:astore_1        
		abyte0.ae = ((azh) (abyte0)).R ^ a.ae;
	// 5212 9744:aload_1         
	// 5213 9745:aload_1         
	// 5214 9746:getfield        #346 <Field int azh.R>
	// 5215 9749:aload_0         
	// 5216 9750:getfield        #12  <Field azh a>
	// 5217 9753:getfield        #217 <Field int azh.ae>
	// 5218 9756:ixor            
	// 5219 9757:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5220 9760:aload_0         
	// 5221 9761:getfield        #12  <Field azh a>
	// 5222 9764:astore_1        
		abyte0.R = ((azh) (abyte0)).K & a.b;
	// 5223 9765:aload_1         
	// 5224 9766:aload_1         
	// 5225 9767:getfield        #358 <Field int azh.K>
	// 5226 9770:aload_0         
	// 5227 9771:getfield        #12  <Field azh a>
	// 5228 9774:getfield        #142 <Field int azh.b>
	// 5229 9777:iand            
	// 5230 9778:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5231 9781:aload_0         
	// 5232 9782:getfield        #12  <Field azh a>
	// 5233 9785:astore_1        
		abyte0.R = ((azh) (abyte0)).u ^ a.R;
	// 5234 9786:aload_1         
	// 5235 9787:aload_1         
	// 5236 9788:getfield        #352 <Field int azh.u>
	// 5237 9791:aload_0         
	// 5238 9792:getfield        #12  <Field azh a>
	// 5239 9795:getfield        #346 <Field int azh.R>
	// 5240 9798:ixor            
	// 5241 9799:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5242 9802:aload_0         
	// 5243 9803:getfield        #12  <Field azh a>
	// 5244 9806:astore_1        
		abyte0.bg = ((azh) (abyte0)).m & ~a.R;
	// 5245 9807:aload_1         
	// 5246 9808:aload_1         
	// 5247 9809:getfield        #361 <Field int azh.m>
	// 5248 9812:aload_0         
	// 5249 9813:getfield        #12  <Field azh a>
	// 5250 9816:getfield        #346 <Field int azh.R>
	// 5251 9819:iconst_m1       
	// 5252 9820:ixor            
	// 5253 9821:iand            
	// 5254 9822:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 5255 9825:aload_0         
	// 5256 9826:getfield        #12  <Field azh a>
	// 5257 9829:astore_1        
		abyte0.bg = ((azh) (abyte0)).u ^ a.bg;
	// 5258 9830:aload_1         
	// 5259 9831:aload_1         
	// 5260 9832:getfield        #352 <Field int azh.u>
	// 5261 9835:aload_0         
	// 5262 9836:getfield        #12  <Field azh a>
	// 5263 9839:getfield        #226 <Field int azh.bg>
	// 5264 9842:ixor            
	// 5265 9843:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 5266 9846:aload_0         
	// 5267 9847:getfield        #12  <Field azh a>
	// 5268 9850:astore_1        
		abyte0.bg = ((azh) (abyte0)).bg & ~a.bs;
	// 5269 9851:aload_1         
	// 5270 9852:aload_1         
	// 5271 9853:getfield        #226 <Field int azh.bg>
	// 5272 9856:aload_0         
	// 5273 9857:getfield        #12  <Field azh a>
	// 5274 9860:getfield        #364 <Field int azh.bs>
	// 5275 9863:iconst_m1       
	// 5276 9864:ixor            
	// 5277 9865:iand            
	// 5278 9866:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 5279 9869:aload_0         
	// 5280 9870:getfield        #12  <Field azh a>
	// 5281 9873:astore_1        
		abyte0.bI = ((azh) (abyte0)).m & ~a.R;
	// 5282 9874:aload_1         
	// 5283 9875:aload_1         
	// 5284 9876:getfield        #361 <Field int azh.m>
	// 5285 9879:aload_0         
	// 5286 9880:getfield        #12  <Field azh a>
	// 5287 9883:getfield        #346 <Field int azh.R>
	// 5288 9886:iconst_m1       
	// 5289 9887:ixor            
	// 5290 9888:iand            
	// 5291 9889:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5292 9892:aload_0         
	// 5293 9893:getfield        #12  <Field azh a>
	// 5294 9896:astore_1        
		abyte0.bI = ((azh) (abyte0)).ax ^ a.bI;
	// 5295 9897:aload_1         
	// 5296 9898:aload_1         
	// 5297 9899:getfield        #349 <Field int azh.ax>
	// 5298 9902:aload_0         
	// 5299 9903:getfield        #12  <Field azh a>
	// 5300 9906:getfield        #334 <Field int azh.bI>
	// 5301 9909:ixor            
	// 5302 9910:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5303 9913:aload_0         
	// 5304 9914:getfield        #12  <Field azh a>
	// 5305 9917:astore_1        
		abyte0.bI = ((azh) (abyte0)).bs | a.bI;
	// 5306 9918:aload_1         
	// 5307 9919:aload_1         
	// 5308 9920:getfield        #364 <Field int azh.bs>
	// 5309 9923:aload_0         
	// 5310 9924:getfield        #12  <Field azh a>
	// 5311 9927:getfield        #334 <Field int azh.bI>
	// 5312 9930:ior             
	// 5313 9931:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5314 9934:aload_0         
	// 5315 9935:getfield        #12  <Field azh a>
	// 5316 9938:astore_1        
		abyte0.bI = ((azh) (abyte0)).bG ^ a.bI;
	// 5317 9939:aload_1         
	// 5318 9940:aload_1         
	// 5319 9941:getfield        #343 <Field int azh.bG>
	// 5320 9944:aload_0         
	// 5321 9945:getfield        #12  <Field azh a>
	// 5322 9948:getfield        #334 <Field int azh.bI>
	// 5323 9951:ixor            
	// 5324 9952:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5325 9955:aload_0         
	// 5326 9956:getfield        #12  <Field azh a>
	// 5327 9959:astore_1        
		abyte0.bG = ((azh) (abyte0)).u | a.e;
	// 5328 9960:aload_1         
	// 5329 9961:aload_1         
	// 5330 9962:getfield        #352 <Field int azh.u>
	// 5331 9965:aload_0         
	// 5332 9966:getfield        #12  <Field azh a>
	// 5333 9969:getfield        #355 <Field int azh.e>
	// 5334 9972:ior             
	// 5335 9973:putfield        #343 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5336 9976:aload_0         
	// 5337 9977:getfield        #12  <Field azh a>
	// 5338 9980:astore_1        
		abyte0.ax = ((azh) (abyte0)).K & a.bG;
	// 5339 9981:aload_1         
	// 5340 9982:aload_1         
	// 5341 9983:getfield        #358 <Field int azh.K>
	// 5342 9986:aload_0         
	// 5343 9987:getfield        #12  <Field azh a>
	// 5344 9990:getfield        #343 <Field int azh.bG>
	// 5345 9993:iand            
	// 5346 9994:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5347 9997:aload_0         
	// 5348 9998:getfield        #12  <Field azh a>
	// 5349 10001:astore_1        
		abyte0.ax = ((azh) (abyte0)).e ^ a.ax;
	// 5350 10002:aload_1         
	// 5351 10003:aload_1         
	// 5352 10004:getfield        #355 <Field int azh.e>
	// 5353 10007:aload_0         
	// 5354 10008:getfield        #12  <Field azh a>
	// 5355 10011:getfield        #349 <Field int azh.ax>
	// 5356 10014:ixor            
	// 5357 10015:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5358 10018:aload_0         
	// 5359 10019:getfield        #12  <Field azh a>
	// 5360 10022:astore_1        
		abyte0.ax = ((azh) (abyte0)).m | a.ax;
	// 5361 10023:aload_1         
	// 5362 10024:aload_1         
	// 5363 10025:getfield        #361 <Field int azh.m>
	// 5364 10028:aload_0         
	// 5365 10029:getfield        #12  <Field azh a>
	// 5366 10032:getfield        #349 <Field int azh.ax>
	// 5367 10035:ior             
	// 5368 10036:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5369 10039:aload_0         
	// 5370 10040:getfield        #12  <Field azh a>
	// 5371 10043:astore_1        
		abyte0.ax = ((azh) (abyte0)).R ^ a.ax;
	// 5372 10044:aload_1         
	// 5373 10045:aload_1         
	// 5374 10046:getfield        #346 <Field int azh.R>
	// 5375 10049:aload_0         
	// 5376 10050:getfield        #12  <Field azh a>
	// 5377 10053:getfield        #349 <Field int azh.ax>
	// 5378 10056:ixor            
	// 5379 10057:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5380 10060:aload_0         
	// 5381 10061:getfield        #12  <Field azh a>
	// 5382 10064:astore_1        
		abyte0.bP = ((azh) (abyte0)).ax ^ a.bP;
	// 5383 10065:aload_1         
	// 5384 10066:aload_1         
	// 5385 10067:getfield        #349 <Field int azh.ax>
	// 5386 10070:aload_0         
	// 5387 10071:getfield        #12  <Field azh a>
	// 5388 10074:getfield        #154 <Field int azh.bP>
	// 5389 10077:ixor            
	// 5390 10078:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 5391 10081:aload_0         
	// 5392 10082:getfield        #12  <Field azh a>
	// 5393 10085:astore_1        
		abyte0.ax = ((azh) (abyte0)).bu & a.bP;
	// 5394 10086:aload_1         
	// 5395 10087:aload_1         
	// 5396 10088:getfield        #367 <Field int azh.bu>
	// 5397 10091:aload_0         
	// 5398 10092:getfield        #12  <Field azh a>
	// 5399 10095:getfield        #154 <Field int azh.bP>
	// 5400 10098:iand            
	// 5401 10099:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5402 10102:aload_0         
	// 5403 10103:getfield        #12  <Field azh a>
	// 5404 10106:astore_1        
		abyte0.bP = ((azh) (abyte0)).bP | a.bu;
	// 5405 10107:aload_1         
	// 5406 10108:aload_1         
	// 5407 10109:getfield        #154 <Field int azh.bP>
	// 5408 10112:aload_0         
	// 5409 10113:getfield        #12  <Field azh a>
	// 5410 10116:getfield        #367 <Field int azh.bu>
	// 5411 10119:ior             
	// 5412 10120:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 5413 10123:aload_0         
	// 5414 10124:getfield        #12  <Field azh a>
	// 5415 10127:astore_1        
		abyte0.R = ((azh) (abyte0)).K & ~a.bG;
	// 5416 10128:aload_1         
	// 5417 10129:aload_1         
	// 5418 10130:getfield        #358 <Field int azh.K>
	// 5419 10133:aload_0         
	// 5420 10134:getfield        #12  <Field azh a>
	// 5421 10137:getfield        #343 <Field int azh.bG>
	// 5422 10140:iconst_m1       
	// 5423 10141:ixor            
	// 5424 10142:iand            
	// 5425 10143:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5426 10146:aload_0         
	// 5427 10147:getfield        #12  <Field azh a>
	// 5428 10150:astore_1        
		abyte0.R = ((azh) (abyte0)).b ^ a.R;
	// 5429 10151:aload_1         
	// 5430 10152:aload_1         
	// 5431 10153:getfield        #142 <Field int azh.b>
	// 5432 10156:aload_0         
	// 5433 10157:getfield        #12  <Field azh a>
	// 5434 10160:getfield        #346 <Field int azh.R>
	// 5435 10163:ixor            
	// 5436 10164:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5437 10167:aload_0         
	// 5438 10168:getfield        #12  <Field azh a>
	// 5439 10171:astore_1        
		abyte0.ce = ((azh) (abyte0)).R ^ a.ce;
	// 5440 10172:aload_1         
	// 5441 10173:aload_1         
	// 5442 10174:getfield        #346 <Field int azh.R>
	// 5443 10177:aload_0         
	// 5444 10178:getfield        #12  <Field azh a>
	// 5445 10181:getfield        #133 <Field int azh.ce>
	// 5446 10184:ixor            
	// 5447 10185:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 5448 10188:aload_0         
	// 5449 10189:getfield        #12  <Field azh a>
	// 5450 10192:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce & ~a.bs;
	// 5451 10193:aload_1         
	// 5452 10194:aload_1         
	// 5453 10195:getfield        #133 <Field int azh.ce>
	// 5454 10198:aload_0         
	// 5455 10199:getfield        #12  <Field azh a>
	// 5456 10202:getfield        #364 <Field int azh.bs>
	// 5457 10205:iconst_m1       
	// 5458 10206:ixor            
	// 5459 10207:iand            
	// 5460 10208:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 5461 10211:aload_0         
	// 5462 10212:getfield        #12  <Field azh a>
	// 5463 10215:astore_1        
		abyte0.ce = ((azh) (abyte0)).ae ^ a.ce;
	// 5464 10216:aload_1         
	// 5465 10217:aload_1         
	// 5466 10218:getfield        #217 <Field int azh.ae>
	// 5467 10221:aload_0         
	// 5468 10222:getfield        #12  <Field azh a>
	// 5469 10225:getfield        #133 <Field int azh.ce>
	// 5470 10228:ixor            
	// 5471 10229:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 5472 10232:aload_0         
	// 5473 10233:getfield        #12  <Field azh a>
	// 5474 10236:astore_1        
		abyte0.ae = ((azh) (abyte0)).ce & ~a.bu;
	// 5475 10237:aload_1         
	// 5476 10238:aload_1         
	// 5477 10239:getfield        #133 <Field int azh.ce>
	// 5478 10242:aload_0         
	// 5479 10243:getfield        #12  <Field azh a>
	// 5480 10246:getfield        #367 <Field int azh.bu>
	// 5481 10249:iconst_m1       
	// 5482 10250:ixor            
	// 5483 10251:iand            
	// 5484 10252:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5485 10255:aload_0         
	// 5486 10256:getfield        #12  <Field azh a>
	// 5487 10259:astore_1        
		abyte0.ae = ((azh) (abyte0)).bI ^ a.ae;
	// 5488 10260:aload_1         
	// 5489 10261:aload_1         
	// 5490 10262:getfield        #334 <Field int azh.bI>
	// 5491 10265:aload_0         
	// 5492 10266:getfield        #12  <Field azh a>
	// 5493 10269:getfield        #217 <Field int azh.ae>
	// 5494 10272:ixor            
	// 5495 10273:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5496 10276:aload_0         
	// 5497 10277:getfield        #12  <Field azh a>
	// 5498 10280:astore_1        
		abyte0.al = ((azh) (abyte0)).ae ^ a.al;
	// 5499 10281:aload_1         
	// 5500 10282:aload_1         
	// 5501 10283:getfield        #217 <Field int azh.ae>
	// 5502 10286:aload_0         
	// 5503 10287:getfield        #12  <Field azh a>
	// 5504 10290:getfield        #370 <Field int azh.al>
	// 5505 10293:ixor            
	// 5506 10294:putfield        #370 <Field int azh.al>
		abyte0 = ((byte []) (a));
	// 5507 10297:aload_0         
	// 5508 10298:getfield        #12  <Field azh a>
	// 5509 10301:astore_1        
		abyte0.ae = ((azh) (abyte0)).al & ~a.aO;
	// 5510 10302:aload_1         
	// 5511 10303:aload_1         
	// 5512 10304:getfield        #370 <Field int azh.al>
	// 5513 10307:aload_0         
	// 5514 10308:getfield        #12  <Field azh a>
	// 5515 10311:getfield        #82  <Field int azh.aO>
	// 5516 10314:iconst_m1       
	// 5517 10315:ixor            
	// 5518 10316:iand            
	// 5519 10317:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5520 10320:aload_0         
	// 5521 10321:getfield        #12  <Field azh a>
	// 5522 10324:astore_1        
		abyte0.ae = ((azh) (abyte0)).ch ^ a.ae;
	// 5523 10325:aload_1         
	// 5524 10326:aload_1         
	// 5525 10327:getfield        #97  <Field int azh.ch>
	// 5526 10330:aload_0         
	// 5527 10331:getfield        #12  <Field azh a>
	// 5528 10334:getfield        #217 <Field int azh.ae>
	// 5529 10337:ixor            
	// 5530 10338:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5531 10341:aload_0         
	// 5532 10342:getfield        #12  <Field azh a>
	// 5533 10345:astore_1        
		abyte0.ae = ((azh) (abyte0)).aL | a.ae;
	// 5534 10346:aload_1         
	// 5535 10347:aload_1         
	// 5536 10348:getfield        #277 <Field int azh.aL>
	// 5537 10351:aload_0         
	// 5538 10352:getfield        #12  <Field azh a>
	// 5539 10355:getfield        #217 <Field int azh.ae>
	// 5540 10358:ior             
	// 5541 10359:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5542 10362:aload_0         
	// 5543 10363:getfield        #12  <Field azh a>
	// 5544 10366:astore_1        
		abyte0.aM = ((azh) (abyte0)).al & ~a.aM;
	// 5545 10367:aload_1         
	// 5546 10368:aload_1         
	// 5547 10369:getfield        #370 <Field int azh.al>
	// 5548 10372:aload_0         
	// 5549 10373:getfield        #12  <Field azh a>
	// 5550 10376:getfield        #316 <Field int azh.aM>
	// 5551 10379:iconst_m1       
	// 5552 10380:ixor            
	// 5553 10381:iand            
	// 5554 10382:putfield        #316 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 5555 10385:aload_0         
	// 5556 10386:getfield        #12  <Field azh a>
	// 5557 10389:astore_1        
		abyte0.aM = ((azh) (abyte0)).bd ^ a.aM;
	// 5558 10390:aload_1         
	// 5559 10391:aload_1         
	// 5560 10392:getfield        #121 <Field int azh.bd>
	// 5561 10395:aload_0         
	// 5562 10396:getfield        #12  <Field azh a>
	// 5563 10399:getfield        #316 <Field int azh.aM>
	// 5564 10402:ixor            
	// 5565 10403:putfield        #316 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 5566 10406:aload_0         
	// 5567 10407:getfield        #12  <Field azh a>
	// 5568 10410:astore_1        
		abyte0.aP = ((azh) (abyte0)).aP | a.al;
	// 5569 10411:aload_1         
	// 5570 10412:aload_1         
	// 5571 10413:getfield        #112 <Field int azh.aP>
	// 5572 10416:aload_0         
	// 5573 10417:getfield        #12  <Field azh a>
	// 5574 10420:getfield        #370 <Field int azh.al>
	// 5575 10423:ior             
	// 5576 10424:putfield        #112 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 5577 10427:aload_0         
	// 5578 10428:getfield        #12  <Field azh a>
	// 5579 10431:astore_1        
		abyte0.aP = ((azh) (abyte0)).bS ^ a.aP;
	// 5580 10432:aload_1         
	// 5581 10433:aload_1         
	// 5582 10434:getfield        #319 <Field int azh.bS>
	// 5583 10437:aload_0         
	// 5584 10438:getfield        #12  <Field azh a>
	// 5585 10441:getfield        #112 <Field int azh.aP>
	// 5586 10444:ixor            
	// 5587 10445:putfield        #112 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 5588 10448:aload_0         
	// 5589 10449:getfield        #12  <Field azh a>
	// 5590 10452:astore_1        
		abyte0.bd = ((azh) (abyte0)).al & a.bi;
	// 5591 10453:aload_1         
	// 5592 10454:aload_1         
	// 5593 10455:getfield        #370 <Field int azh.al>
	// 5594 10458:aload_0         
	// 5595 10459:getfield        #12  <Field azh a>
	// 5596 10462:getfield        #124 <Field int azh.bi>
	// 5597 10465:iand            
	// 5598 10466:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5599 10469:aload_0         
	// 5600 10470:getfield        #12  <Field azh a>
	// 5601 10473:astore_1        
		abyte0.bd = ((azh) (abyte0)).aq ^ a.bd;
	// 5602 10474:aload_1         
	// 5603 10475:aload_1         
	// 5604 10476:getfield        #202 <Field int azh.aq>
	// 5605 10479:aload_0         
	// 5606 10480:getfield        #12  <Field azh a>
	// 5607 10483:getfield        #121 <Field int azh.bd>
	// 5608 10486:ixor            
	// 5609 10487:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5610 10490:aload_0         
	// 5611 10491:getfield        #12  <Field azh a>
	// 5612 10494:astore_1        
		abyte0.aF = ((azh) (abyte0)).al & a.aF;
	// 5613 10495:aload_1         
	// 5614 10496:aload_1         
	// 5615 10497:getfield        #370 <Field int azh.al>
	// 5616 10500:aload_0         
	// 5617 10501:getfield        #12  <Field azh a>
	// 5618 10504:getfield        #328 <Field int azh.aF>
	// 5619 10507:iand            
	// 5620 10508:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 5621 10511:aload_0         
	// 5622 10512:getfield        #12  <Field azh a>
	// 5623 10515:astore_1        
		abyte0.aF = ((azh) (abyte0)).cj ^ a.aF;
	// 5624 10516:aload_1         
	// 5625 10517:aload_1         
	// 5626 10518:getfield        #331 <Field int azh.cj>
	// 5627 10521:aload_0         
	// 5628 10522:getfield        #12  <Field azh a>
	// 5629 10525:getfield        #328 <Field int azh.aF>
	// 5630 10528:ixor            
	// 5631 10529:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 5632 10532:aload_0         
	// 5633 10533:getfield        #12  <Field azh a>
	// 5634 10536:astore_1        
		abyte0.aF = ((azh) (abyte0)).aL | a.aF;
	// 5635 10537:aload_1         
	// 5636 10538:aload_1         
	// 5637 10539:getfield        #277 <Field int azh.aL>
	// 5638 10542:aload_0         
	// 5639 10543:getfield        #12  <Field azh a>
	// 5640 10546:getfield        #328 <Field int azh.aF>
	// 5641 10549:ior             
	// 5642 10550:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 5643 10553:aload_0         
	// 5644 10554:getfield        #12  <Field azh a>
	// 5645 10557:astore_1        
		abyte0.ch = ((azh) (abyte0)).N & ~a.al;
	// 5646 10558:aload_1         
	// 5647 10559:aload_1         
	// 5648 10560:getfield        #223 <Field int azh.N>
	// 5649 10563:aload_0         
	// 5650 10564:getfield        #12  <Field azh a>
	// 5651 10567:getfield        #370 <Field int azh.al>
	// 5652 10570:iconst_m1       
	// 5653 10571:ixor            
	// 5654 10572:iand            
	// 5655 10573:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 5656 10576:aload_0         
	// 5657 10577:getfield        #12  <Field azh a>
	// 5658 10580:astore_1        
		abyte0.ch = ((azh) (abyte0)).bU ^ a.ch;
	// 5659 10581:aload_1         
	// 5660 10582:aload_1         
	// 5661 10583:getfield        #130 <Field int azh.bU>
	// 5662 10586:aload_0         
	// 5663 10587:getfield        #12  <Field azh a>
	// 5664 10590:getfield        #97  <Field int azh.ch>
	// 5665 10593:ixor            
	// 5666 10594:putfield        #97  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 5667 10597:aload_0         
	// 5668 10598:getfield        #12  <Field azh a>
	// 5669 10601:astore_1        
		abyte0.R = ((azh) (abyte0)).al & ~a.bi;
	// 5670 10602:aload_1         
	// 5671 10603:aload_1         
	// 5672 10604:getfield        #370 <Field int azh.al>
	// 5673 10607:aload_0         
	// 5674 10608:getfield        #12  <Field azh a>
	// 5675 10611:getfield        #124 <Field int azh.bi>
	// 5676 10614:iconst_m1       
	// 5677 10615:ixor            
	// 5678 10616:iand            
	// 5679 10617:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5680 10620:aload_0         
	// 5681 10621:getfield        #12  <Field azh a>
	// 5682 10624:astore_1        
		abyte0.R = ((azh) (abyte0)).aO ^ a.R;
	// 5683 10625:aload_1         
	// 5684 10626:aload_1         
	// 5685 10627:getfield        #82  <Field int azh.aO>
	// 5686 10630:aload_0         
	// 5687 10631:getfield        #12  <Field azh a>
	// 5688 10634:getfield        #346 <Field int azh.R>
	// 5689 10637:ixor            
	// 5690 10638:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5691 10641:aload_0         
	// 5692 10642:getfield        #12  <Field azh a>
	// 5693 10645:astore_1        
		abyte0.R = ((azh) (abyte0)).R & ~a.aL;
	// 5694 10646:aload_1         
	// 5695 10647:aload_1         
	// 5696 10648:getfield        #346 <Field int azh.R>
	// 5697 10651:aload_0         
	// 5698 10652:getfield        #12  <Field azh a>
	// 5699 10655:getfield        #277 <Field int azh.aL>
	// 5700 10658:iconst_m1       
	// 5701 10659:ixor            
	// 5702 10660:iand            
	// 5703 10661:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5704 10664:aload_0         
	// 5705 10665:getfield        #12  <Field azh a>
	// 5706 10668:astore_1        
		abyte0.R = ((azh) (abyte0)).bd ^ a.R;
	// 5707 10669:aload_1         
	// 5708 10670:aload_1         
	// 5709 10671:getfield        #121 <Field int azh.bd>
	// 5710 10674:aload_0         
	// 5711 10675:getfield        #12  <Field azh a>
	// 5712 10678:getfield        #346 <Field int azh.R>
	// 5713 10681:ixor            
	// 5714 10682:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5715 10685:aload_0         
	// 5716 10686:getfield        #12  <Field azh a>
	// 5717 10689:astore_1        
		abyte0.bd = ((azh) (abyte0)).al & a.bU;
	// 5718 10690:aload_1         
	// 5719 10691:aload_1         
	// 5720 10692:getfield        #370 <Field int azh.al>
	// 5721 10695:aload_0         
	// 5722 10696:getfield        #12  <Field azh a>
	// 5723 10699:getfield        #130 <Field int azh.bU>
	// 5724 10702:iand            
	// 5725 10703:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5726 10706:aload_0         
	// 5727 10707:getfield        #12  <Field azh a>
	// 5728 10710:astore_1        
		abyte0.bd = ((azh) (abyte0)).bU ^ a.bd;
	// 5729 10711:aload_1         
	// 5730 10712:aload_1         
	// 5731 10713:getfield        #130 <Field int azh.bU>
	// 5732 10716:aload_0         
	// 5733 10717:getfield        #12  <Field azh a>
	// 5734 10720:getfield        #121 <Field int azh.bd>
	// 5735 10723:ixor            
	// 5736 10724:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5737 10727:aload_0         
	// 5738 10728:getfield        #12  <Field azh a>
	// 5739 10731:astore_1        
		abyte0.bd = ((azh) (abyte0)).aL | a.bd;
	// 5740 10732:aload_1         
	// 5741 10733:aload_1         
	// 5742 10734:getfield        #277 <Field int azh.aL>
	// 5743 10737:aload_0         
	// 5744 10738:getfield        #12  <Field azh a>
	// 5745 10741:getfield        #121 <Field int azh.bd>
	// 5746 10744:ior             
	// 5747 10745:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5748 10748:aload_0         
	// 5749 10749:getfield        #12  <Field azh a>
	// 5750 10752:astore_1        
		abyte0.bd = ((azh) (abyte0)).aM ^ a.bd;
	// 5751 10753:aload_1         
	// 5752 10754:aload_1         
	// 5753 10755:getfield        #316 <Field int azh.aM>
	// 5754 10758:aload_0         
	// 5755 10759:getfield        #12  <Field azh a>
	// 5756 10762:getfield        #121 <Field int azh.bd>
	// 5757 10765:ixor            
	// 5758 10766:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5759 10769:aload_0         
	// 5760 10770:getfield        #12  <Field azh a>
	// 5761 10773:astore_1        
		abyte0.bn = ((azh) (abyte0)).al & ~a.bn;
	// 5762 10774:aload_1         
	// 5763 10775:aload_1         
	// 5764 10776:getfield        #370 <Field int azh.al>
	// 5765 10779:aload_0         
	// 5766 10780:getfield        #12  <Field azh a>
	// 5767 10783:getfield        #313 <Field int azh.bn>
	// 5768 10786:iconst_m1       
	// 5769 10787:ixor            
	// 5770 10788:iand            
	// 5771 10789:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5772 10792:aload_0         
	// 5773 10793:getfield        #12  <Field azh a>
	// 5774 10796:astore_1        
		abyte0.bn = ((azh) (abyte0)).F ^ a.bn;
	// 5775 10797:aload_1         
	// 5776 10798:aload_1         
	// 5777 10799:getfield        #298 <Field int azh.F>
	// 5778 10802:aload_0         
	// 5779 10803:getfield        #12  <Field azh a>
	// 5780 10806:getfield        #313 <Field int azh.bn>
	// 5781 10809:ixor            
	// 5782 10810:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5783 10813:aload_0         
	// 5784 10814:getfield        #12  <Field azh a>
	// 5785 10817:astore_1        
		abyte0.bn = ((azh) (abyte0)).bn & ~a.aL;
	// 5786 10818:aload_1         
	// 5787 10819:aload_1         
	// 5788 10820:getfield        #313 <Field int azh.bn>
	// 5789 10823:aload_0         
	// 5790 10824:getfield        #12  <Field azh a>
	// 5791 10827:getfield        #277 <Field int azh.aL>
	// 5792 10830:iconst_m1       
	// 5793 10831:ixor            
	// 5794 10832:iand            
	// 5795 10833:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5796 10836:aload_0         
	// 5797 10837:getfield        #12  <Field azh a>
	// 5798 10840:astore_1        
		abyte0.bn = ((azh) (abyte0)).aP ^ a.bn;
	// 5799 10841:aload_1         
	// 5800 10842:aload_1         
	// 5801 10843:getfield        #112 <Field int azh.aP>
	// 5802 10846:aload_0         
	// 5803 10847:getfield        #12  <Field azh a>
	// 5804 10850:getfield        #313 <Field int azh.bn>
	// 5805 10853:ixor            
	// 5806 10854:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5807 10857:aload_0         
	// 5808 10858:getfield        #12  <Field azh a>
	// 5809 10861:astore_1        
		abyte0.av = ((azh) (abyte0)).al & a.av;
	// 5810 10862:aload_1         
	// 5811 10863:aload_1         
	// 5812 10864:getfield        #370 <Field int azh.al>
	// 5813 10867:aload_0         
	// 5814 10868:getfield        #12  <Field azh a>
	// 5815 10871:getfield        #292 <Field int azh.av>
	// 5816 10874:iand            
	// 5817 10875:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5818 10878:aload_0         
	// 5819 10879:getfield        #12  <Field azh a>
	// 5820 10882:astore_1        
		abyte0.av = ((azh) (abyte0)).bS ^ a.av;
	// 5821 10883:aload_1         
	// 5822 10884:aload_1         
	// 5823 10885:getfield        #319 <Field int azh.bS>
	// 5824 10888:aload_0         
	// 5825 10889:getfield        #12  <Field azh a>
	// 5826 10892:getfield        #292 <Field int azh.av>
	// 5827 10895:ixor            
	// 5828 10896:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5829 10899:aload_0         
	// 5830 10900:getfield        #12  <Field azh a>
	// 5831 10903:astore_1        
		abyte0.av = ((azh) (abyte0)).av & ~a.aL;
	// 5832 10904:aload_1         
	// 5833 10905:aload_1         
	// 5834 10906:getfield        #292 <Field int azh.av>
	// 5835 10909:aload_0         
	// 5836 10910:getfield        #12  <Field azh a>
	// 5837 10913:getfield        #277 <Field int azh.aL>
	// 5838 10916:iconst_m1       
	// 5839 10917:ixor            
	// 5840 10918:iand            
	// 5841 10919:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5842 10922:aload_0         
	// 5843 10923:getfield        #12  <Field azh a>
	// 5844 10926:astore_1        
		abyte0.bS = ((azh) (abyte0)).az | a.al;
	// 5845 10927:aload_1         
	// 5846 10928:aload_1         
	// 5847 10929:getfield        #157 <Field int azh.az>
	// 5848 10932:aload_0         
	// 5849 10933:getfield        #12  <Field azh a>
	// 5850 10936:getfield        #370 <Field int azh.al>
	// 5851 10939:ior             
	// 5852 10940:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5853 10943:aload_0         
	// 5854 10944:getfield        #12  <Field azh a>
	// 5855 10947:astore_1        
		abyte0.bS = ((azh) (abyte0)).bi ^ a.bS;
	// 5856 10948:aload_1         
	// 5857 10949:aload_1         
	// 5858 10950:getfield        #124 <Field int azh.bi>
	// 5859 10953:aload_0         
	// 5860 10954:getfield        #12  <Field azh a>
	// 5861 10957:getfield        #319 <Field int azh.bS>
	// 5862 10960:ixor            
	// 5863 10961:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5864 10964:aload_0         
	// 5865 10965:getfield        #12  <Field azh a>
	// 5866 10968:astore_1        
		abyte0.bS = ((azh) (abyte0)).bS & ~a.aL;
	// 5867 10969:aload_1         
	// 5868 10970:aload_1         
	// 5869 10971:getfield        #319 <Field int azh.bS>
	// 5870 10974:aload_0         
	// 5871 10975:getfield        #12  <Field azh a>
	// 5872 10978:getfield        #277 <Field int azh.aL>
	// 5873 10981:iconst_m1       
	// 5874 10982:ixor            
	// 5875 10983:iand            
	// 5876 10984:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5877 10987:aload_0         
	// 5878 10988:getfield        #12  <Field azh a>
	// 5879 10991:astore_1        
		abyte0.bS = ((azh) (abyte0)).ch ^ a.bS;
	// 5880 10992:aload_1         
	// 5881 10993:aload_1         
	// 5882 10994:getfield        #97  <Field int azh.ch>
	// 5883 10997:aload_0         
	// 5884 10998:getfield        #12  <Field azh a>
	// 5885 11001:getfield        #319 <Field int azh.bS>
	// 5886 11004:ixor            
	// 5887 11005:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5888 11008:aload_0         
	// 5889 11009:getfield        #12  <Field azh a>
	// 5890 11012:astore_1        
		abyte0.az = ((azh) (abyte0)).al & ~a.az;
	// 5891 11013:aload_1         
	// 5892 11014:aload_1         
	// 5893 11015:getfield        #370 <Field int azh.al>
	// 5894 11018:aload_0         
	// 5895 11019:getfield        #12  <Field azh a>
	// 5896 11022:getfield        #157 <Field int azh.az>
	// 5897 11025:iconst_m1       
	// 5898 11026:ixor            
	// 5899 11027:iand            
	// 5900 11028:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 5901 11031:aload_0         
	// 5902 11032:getfield        #12  <Field azh a>
	// 5903 11035:astore_1        
		abyte0.az = ((azh) (abyte0)).ca ^ a.az;
	// 5904 11036:aload_1         
	// 5905 11037:aload_1         
	// 5906 11038:getfield        #325 <Field int azh.ca>
	// 5907 11041:aload_0         
	// 5908 11042:getfield        #12  <Field azh a>
	// 5909 11045:getfield        #157 <Field int azh.az>
	// 5910 11048:ixor            
	// 5911 11049:putfield        #157 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 5912 11052:aload_0         
	// 5913 11053:getfield        #12  <Field azh a>
	// 5914 11056:astore_1        
		abyte0.av = ((azh) (abyte0)).az ^ a.av;
	// 5915 11057:aload_1         
	// 5916 11058:aload_1         
	// 5917 11059:getfield        #157 <Field int azh.az>
	// 5918 11062:aload_0         
	// 5919 11063:getfield        #12  <Field azh a>
	// 5920 11066:getfield        #292 <Field int azh.av>
	// 5921 11069:ixor            
	// 5922 11070:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5923 11073:aload_0         
	// 5924 11074:getfield        #12  <Field azh a>
	// 5925 11077:astore_1        
		abyte0.ay = ((azh) (abyte0)).al & ~a.ay;
	// 5926 11078:aload_1         
	// 5927 11079:aload_1         
	// 5928 11080:getfield        #370 <Field int azh.al>
	// 5929 11083:aload_0         
	// 5930 11084:getfield        #12  <Field azh a>
	// 5931 11087:getfield        #47  <Field int azh.ay>
	// 5932 11090:iconst_m1       
	// 5933 11091:ixor            
	// 5934 11092:iand            
	// 5935 11093:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 5936 11096:aload_0         
	// 5937 11097:getfield        #12  <Field azh a>
	// 5938 11100:astore_1        
		abyte0.ay = ((azh) (abyte0)).ar ^ a.ay;
	// 5939 11101:aload_1         
	// 5940 11102:aload_1         
	// 5941 11103:getfield        #289 <Field int azh.ar>
	// 5942 11106:aload_0         
	// 5943 11107:getfield        #12  <Field azh a>
	// 5944 11110:getfield        #47  <Field int azh.ay>
	// 5945 11113:ixor            
	// 5946 11114:putfield        #47  <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 5947 11117:aload_0         
	// 5948 11118:getfield        #12  <Field azh a>
	// 5949 11121:astore_1        
		abyte0.ae = ((azh) (abyte0)).ay ^ a.ae;
	// 5950 11122:aload_1         
	// 5951 11123:aload_1         
	// 5952 11124:getfield        #47  <Field int azh.ay>
	// 5953 11127:aload_0         
	// 5954 11128:getfield        #12  <Field azh a>
	// 5955 11131:getfield        #217 <Field int azh.ae>
	// 5956 11134:ixor            
	// 5957 11135:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 5958 11138:aload_0         
	// 5959 11139:getfield        #12  <Field azh a>
	// 5960 11142:astore_1        
		abyte0.ca = ((azh) (abyte0)).al & a.ca;
	// 5961 11143:aload_1         
	// 5962 11144:aload_1         
	// 5963 11145:getfield        #370 <Field int azh.al>
	// 5964 11148:aload_0         
	// 5965 11149:getfield        #12  <Field azh a>
	// 5966 11152:getfield        #325 <Field int azh.ca>
	// 5967 11155:iand            
	// 5968 11156:putfield        #325 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 5969 11159:aload_0         
	// 5970 11160:getfield        #12  <Field azh a>
	// 5971 11163:astore_1        
		abyte0.ca = ((azh) (abyte0)).cj ^ a.ca;
	// 5972 11164:aload_1         
	// 5973 11165:aload_1         
	// 5974 11166:getfield        #331 <Field int azh.cj>
	// 5975 11169:aload_0         
	// 5976 11170:getfield        #12  <Field azh a>
	// 5977 11173:getfield        #325 <Field int azh.ca>
	// 5978 11176:ixor            
	// 5979 11177:putfield        #325 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 5980 11180:aload_0         
	// 5981 11181:getfield        #12  <Field azh a>
	// 5982 11184:astore_1        
		abyte0.aF = ((azh) (abyte0)).ca ^ a.aF;
	// 5983 11185:aload_1         
	// 5984 11186:aload_1         
	// 5985 11187:getfield        #325 <Field int azh.ca>
	// 5986 11190:aload_0         
	// 5987 11191:getfield        #12  <Field azh a>
	// 5988 11194:getfield        #328 <Field int azh.aF>
	// 5989 11197:ixor            
	// 5990 11198:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 5991 11201:aload_0         
	// 5992 11202:getfield        #12  <Field azh a>
	// 5993 11205:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bQ & ~a.al;
	// 5994 11206:aload_1         
	// 5995 11207:aload_1         
	// 5996 11208:getfield        #307 <Field int azh.bQ>
	// 5997 11211:aload_0         
	// 5998 11212:getfield        #12  <Field azh a>
	// 5999 11215:getfield        #370 <Field int azh.al>
	// 6000 11218:iconst_m1       
	// 6001 11219:ixor            
	// 6002 11220:iand            
	// 6003 11221:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 6004 11224:aload_0         
	// 6005 11225:getfield        #12  <Field azh a>
	// 6006 11228:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aq ^ a.bQ;
	// 6007 11229:aload_1         
	// 6008 11230:aload_1         
	// 6009 11231:getfield        #202 <Field int azh.aq>
	// 6010 11234:aload_0         
	// 6011 11235:getfield        #12  <Field azh a>
	// 6012 11238:getfield        #307 <Field int azh.bQ>
	// 6013 11241:ixor            
	// 6014 11242:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 6015 11245:aload_0         
	// 6016 11246:getfield        #12  <Field azh a>
	// 6017 11249:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aL | a.bQ;
	// 6018 11250:aload_1         
	// 6019 11251:aload_1         
	// 6020 11252:getfield        #277 <Field int azh.aL>
	// 6021 11255:aload_0         
	// 6022 11256:getfield        #12  <Field azh a>
	// 6023 11259:getfield        #307 <Field int azh.bQ>
	// 6024 11262:ior             
	// 6025 11263:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 6026 11266:aload_0         
	// 6027 11267:getfield        #12  <Field azh a>
	// 6028 11270:astore_1        
		abyte0.ah = ((azh) (abyte0)).al & ~a.ah;
	// 6029 11271:aload_1         
	// 6030 11272:aload_1         
	// 6031 11273:getfield        #370 <Field int azh.al>
	// 6032 11276:aload_0         
	// 6033 11277:getfield        #12  <Field azh a>
	// 6034 11280:getfield        #64  <Field int azh.ah>
	// 6035 11283:iconst_m1       
	// 6036 11284:ixor            
	// 6037 11285:iand            
	// 6038 11286:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6039 11289:aload_0         
	// 6040 11290:getfield        #12  <Field azh a>
	// 6041 11293:astore_1        
		abyte0.ah = ((azh) (abyte0)).aE ^ a.ah;
	// 6042 11294:aload_1         
	// 6043 11295:aload_1         
	// 6044 11296:getfield        #310 <Field int azh.aE>
	// 6045 11299:aload_0         
	// 6046 11300:getfield        #12  <Field azh a>
	// 6047 11303:getfield        #64  <Field int azh.ah>
	// 6048 11306:ixor            
	// 6049 11307:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6050 11310:aload_0         
	// 6051 11311:getfield        #12  <Field azh a>
	// 6052 11314:astore_1        
		abyte0.bQ = ((azh) (abyte0)).ah ^ a.bQ;
	// 6053 11315:aload_1         
	// 6054 11316:aload_1         
	// 6055 11317:getfield        #64  <Field int azh.ah>
	// 6056 11320:aload_0         
	// 6057 11321:getfield        #12  <Field azh a>
	// 6058 11324:getfield        #307 <Field int azh.bQ>
	// 6059 11327:ixor            
	// 6060 11328:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 6061 11331:aload_0         
	// 6062 11332:getfield        #12  <Field azh a>
	// 6063 11335:astore_1        
		abyte0.ce = ((azh) (abyte0)).bu & ~a.ce;
	// 6064 11336:aload_1         
	// 6065 11337:aload_1         
	// 6066 11338:getfield        #367 <Field int azh.bu>
	// 6067 11341:aload_0         
	// 6068 11342:getfield        #12  <Field azh a>
	// 6069 11345:getfield        #133 <Field int azh.ce>
	// 6070 11348:iconst_m1       
	// 6071 11349:ixor            
	// 6072 11350:iand            
	// 6073 11351:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6074 11354:aload_0         
	// 6075 11355:getfield        #12  <Field azh a>
	// 6076 11358:astore_1        
		abyte0.ce = ((azh) (abyte0)).bI ^ a.ce;
	// 6077 11359:aload_1         
	// 6078 11360:aload_1         
	// 6079 11361:getfield        #334 <Field int azh.bI>
	// 6080 11364:aload_0         
	// 6081 11365:getfield        #12  <Field azh a>
	// 6082 11368:getfield        #133 <Field int azh.ce>
	// 6083 11371:ixor            
	// 6084 11372:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6085 11375:aload_0         
	// 6086 11376:getfield        #12  <Field azh a>
	// 6087 11379:astore_1        
		abyte0.ab = ((azh) (abyte0)).ce ^ a.ab;
	// 6088 11380:aload_1         
	// 6089 11381:aload_1         
	// 6090 11382:getfield        #133 <Field int azh.ce>
	// 6091 11385:aload_0         
	// 6092 11386:getfield        #12  <Field azh a>
	// 6093 11389:getfield        #373 <Field int azh.ab>
	// 6094 11392:ixor            
	// 6095 11393:putfield        #373 <Field int azh.ab>
		abyte0 = ((byte []) (a));
	// 6096 11396:aload_0         
	// 6097 11397:getfield        #12  <Field azh a>
	// 6098 11400:astore_1        
		abyte0.aH = ((azh) (abyte0)).bG ^ a.aH;
	// 6099 11401:aload_1         
	// 6100 11402:aload_1         
	// 6101 11403:getfield        #343 <Field int azh.bG>
	// 6102 11406:aload_0         
	// 6103 11407:getfield        #12  <Field azh a>
	// 6104 11410:getfield        #340 <Field int azh.aH>
	// 6105 11413:ixor            
	// 6106 11414:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 6107 11417:aload_0         
	// 6108 11418:getfield        #12  <Field azh a>
	// 6109 11421:astore_1        
		abyte0.aN = ((azh) (abyte0)).aH ^ a.aN;
	// 6110 11422:aload_1         
	// 6111 11423:aload_1         
	// 6112 11424:getfield        #340 <Field int azh.aH>
	// 6113 11427:aload_0         
	// 6114 11428:getfield        #12  <Field azh a>
	// 6115 11431:getfield        #376 <Field int azh.aN>
	// 6116 11434:ixor            
	// 6117 11435:putfield        #376 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6118 11438:aload_0         
	// 6119 11439:getfield        #12  <Field azh a>
	// 6120 11442:astore_1        
		abyte0.bg = ((azh) (abyte0)).aN ^ a.bg;
	// 6121 11443:aload_1         
	// 6122 11444:aload_1         
	// 6123 11445:getfield        #376 <Field int azh.aN>
	// 6124 11448:aload_0         
	// 6125 11449:getfield        #12  <Field azh a>
	// 6126 11452:getfield        #226 <Field int azh.bg>
	// 6127 11455:ixor            
	// 6128 11456:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6129 11459:aload_0         
	// 6130 11460:getfield        #12  <Field azh a>
	// 6131 11463:astore_1        
		abyte0.bP = ((azh) (abyte0)).bg ^ a.bP;
	// 6132 11464:aload_1         
	// 6133 11465:aload_1         
	// 6134 11466:getfield        #226 <Field int azh.bg>
	// 6135 11469:aload_0         
	// 6136 11470:getfield        #12  <Field azh a>
	// 6137 11473:getfield        #154 <Field int azh.bP>
	// 6138 11476:ixor            
	// 6139 11477:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 6140 11480:aload_0         
	// 6141 11481:getfield        #12  <Field azh a>
	// 6142 11484:astore_1        
		abyte0.X = ((azh) (abyte0)).bP ^ a.X;
	// 6143 11485:aload_1         
	// 6144 11486:aload_1         
	// 6145 11487:getfield        #154 <Field int azh.bP>
	// 6146 11490:aload_0         
	// 6147 11491:getfield        #12  <Field azh a>
	// 6148 11494:getfield        #379 <Field int azh.X>
	// 6149 11497:ixor            
	// 6150 11498:putfield        #379 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 6151 11501:aload_0         
	// 6152 11502:getfield        #12  <Field azh a>
	// 6153 11505:astore_1        
		abyte0.ax = ((azh) (abyte0)).bg ^ a.ax;
	// 6154 11506:aload_1         
	// 6155 11507:aload_1         
	// 6156 11508:getfield        #226 <Field int azh.bg>
	// 6157 11511:aload_0         
	// 6158 11512:getfield        #12  <Field azh a>
	// 6159 11515:getfield        #349 <Field int azh.ax>
	// 6160 11518:ixor            
	// 6161 11519:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6162 11522:aload_0         
	// 6163 11523:getfield        #12  <Field azh a>
	// 6164 11526:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax ^ a.J;
	// 6165 11527:aload_1         
	// 6166 11528:aload_1         
	// 6167 11529:getfield        #349 <Field int azh.ax>
	// 6168 11532:aload_0         
	// 6169 11533:getfield        #12  <Field azh a>
	// 6170 11536:getfield        #38  <Field int azh.J>
	// 6171 11539:ixor            
	// 6172 11540:putfield        #349 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6173 11543:aload_0         
	// 6174 11544:getfield        #12  <Field azh a>
	// 6175 11547:astore_1        
		abyte0.bg = ((azh) (abyte0)).t & a.ax;
	// 6176 11548:aload_1         
	// 6177 11549:aload_1         
	// 6178 11550:getfield        #103 <Field int azh.t>
	// 6179 11553:aload_0         
	// 6180 11554:getfield        #12  <Field azh a>
	// 6181 11557:getfield        #349 <Field int azh.ax>
	// 6182 11560:iand            
	// 6183 11561:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6184 11564:aload_0         
	// 6185 11565:getfield        #12  <Field azh a>
	// 6186 11568:astore_1        
		abyte0.bg = ((azh) (abyte0)).ax ^ a.bg;
	// 6187 11569:aload_1         
	// 6188 11570:aload_1         
	// 6189 11571:getfield        #349 <Field int azh.ax>
	// 6190 11574:aload_0         
	// 6191 11575:getfield        #12  <Field azh a>
	// 6192 11578:getfield        #226 <Field int azh.bg>
	// 6193 11581:ixor            
	// 6194 11582:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6195 11585:aload_0         
	// 6196 11586:getfield        #12  <Field azh a>
	// 6197 11589:astore_1        
		abyte0.bP = ((azh) (abyte0)).t & a.ax;
	// 6198 11590:aload_1         
	// 6199 11591:aload_1         
	// 6200 11592:getfield        #103 <Field int azh.t>
	// 6201 11595:aload_0         
	// 6202 11596:getfield        #12  <Field azh a>
	// 6203 11599:getfield        #349 <Field int azh.ax>
	// 6204 11602:iand            
	// 6205 11603:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 6206 11606:aload_0         
	// 6207 11607:getfield        #12  <Field azh a>
	// 6208 11610:astore_1        
		abyte0.aN = ((azh) (abyte0)).t & ~a.ax;
	// 6209 11611:aload_1         
	// 6210 11612:aload_1         
	// 6211 11613:getfield        #103 <Field int azh.t>
	// 6212 11616:aload_0         
	// 6213 11617:getfield        #12  <Field azh a>
	// 6214 11620:getfield        #349 <Field int azh.ax>
	// 6215 11623:iconst_m1       
	// 6216 11624:ixor            
	// 6217 11625:iand            
	// 6218 11626:putfield        #376 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6219 11629:aload_0         
	// 6220 11630:getfield        #12  <Field azh a>
	// 6221 11633:astore_1        
		abyte0.B = ((azh) (abyte0)).B | a.J;
	// 6222 11634:aload_1         
	// 6223 11635:aload_1         
	// 6224 11636:getfield        #118 <Field int azh.B>
	// 6225 11639:aload_0         
	// 6226 11640:getfield        #12  <Field azh a>
	// 6227 11643:getfield        #38  <Field int azh.J>
	// 6228 11646:ior             
	// 6229 11647:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 6230 11650:aload_0         
	// 6231 11651:getfield        #12  <Field azh a>
	// 6232 11654:astore_1        
		abyte0.B = ((azh) (abyte0)).J ^ a.B;
	// 6233 11655:aload_1         
	// 6234 11656:aload_1         
	// 6235 11657:getfield        #38  <Field int azh.J>
	// 6236 11660:aload_0         
	// 6237 11661:getfield        #12  <Field azh a>
	// 6238 11664:getfield        #118 <Field int azh.B>
	// 6239 11667:ixor            
	// 6240 11668:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 6241 11671:aload_0         
	// 6242 11672:getfield        #12  <Field azh a>
	// 6243 11675:astore_1        
		abyte0.bA = ((azh) (abyte0)).B ^ a.bA;
	// 6244 11676:aload_1         
	// 6245 11677:aload_1         
	// 6246 11678:getfield        #118 <Field int azh.B>
	// 6247 11681:aload_0         
	// 6248 11682:getfield        #12  <Field azh a>
	// 6249 11685:getfield        #382 <Field int azh.bA>
	// 6250 11688:ixor            
	// 6251 11689:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6252 11692:aload_0         
	// 6253 11693:getfield        #12  <Field azh a>
	// 6254 11696:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA & ~a.d;
	// 6255 11697:aload_1         
	// 6256 11698:aload_1         
	// 6257 11699:getfield        #382 <Field int azh.bA>
	// 6258 11702:aload_0         
	// 6259 11703:getfield        #12  <Field azh a>
	// 6260 11706:getfield        #127 <Field int azh.d>
	// 6261 11709:iconst_m1       
	// 6262 11710:ixor            
	// 6263 11711:iand            
	// 6264 11712:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6265 11715:aload_0         
	// 6266 11716:getfield        #12  <Field azh a>
	// 6267 11719:astore_1        
		abyte0.bA = ((azh) (abyte0)).cd ^ a.bA;
	// 6268 11720:aload_1         
	// 6269 11721:aload_1         
	// 6270 11722:getfield        #385 <Field int azh.cd>
	// 6271 11725:aload_0         
	// 6272 11726:getfield        #12  <Field azh a>
	// 6273 11729:getfield        #382 <Field int azh.bA>
	// 6274 11732:ixor            
	// 6275 11733:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6276 11736:aload_0         
	// 6277 11737:getfield        #12  <Field azh a>
	// 6278 11740:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA & ~a.l;
	// 6279 11741:aload_1         
	// 6280 11742:aload_1         
	// 6281 11743:getfield        #382 <Field int azh.bA>
	// 6282 11746:aload_0         
	// 6283 11747:getfield        #12  <Field azh a>
	// 6284 11750:getfield        #35  <Field int azh.l>
	// 6285 11753:iconst_m1       
	// 6286 11754:ixor            
	// 6287 11755:iand            
	// 6288 11756:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6289 11759:aload_0         
	// 6290 11760:getfield        #12  <Field azh a>
	// 6291 11763:astore_1        
		abyte0.bA = ((azh) (abyte0)).bD ^ a.bA;
	// 6292 11764:aload_1         
	// 6293 11765:aload_1         
	// 6294 11766:getfield        #115 <Field int azh.bD>
	// 6295 11769:aload_0         
	// 6296 11770:getfield        #12  <Field azh a>
	// 6297 11773:getfield        #382 <Field int azh.bA>
	// 6298 11776:ixor            
	// 6299 11777:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6300 11780:aload_0         
	// 6301 11781:getfield        #12  <Field azh a>
	// 6302 11784:astore_1        
		abyte0.Q = ((azh) (abyte0)).bA ^ a.Q;
	// 6303 11785:aload_1         
	// 6304 11786:aload_1         
	// 6305 11787:getfield        #382 <Field int azh.bA>
	// 6306 11790:aload_0         
	// 6307 11791:getfield        #12  <Field azh a>
	// 6308 11794:getfield        #388 <Field int azh.Q>
	// 6309 11797:ixor            
	// 6310 11798:putfield        #388 <Field int azh.Q>
		abyte0 = ((byte []) (a));
	// 6311 11801:aload_0         
	// 6312 11802:getfield        #12  <Field azh a>
	// 6313 11805:astore_1        
		abyte0.r = ((azh) (abyte0)).r & ~a.Q;
	// 6314 11806:aload_1         
	// 6315 11807:aload_1         
	// 6316 11808:getfield        #391 <Field int azh.r>
	// 6317 11811:aload_0         
	// 6318 11812:getfield        #12  <Field azh a>
	// 6319 11815:getfield        #388 <Field int azh.Q>
	// 6320 11818:iconst_m1       
	// 6321 11819:ixor            
	// 6322 11820:iand            
	// 6323 11821:putfield        #391 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6324 11824:aload_0         
	// 6325 11825:getfield        #12  <Field azh a>
	// 6326 11828:astore_1        
		abyte0.r = ((azh) (abyte0)).bu & ~a.r;
	// 6327 11829:aload_1         
	// 6328 11830:aload_1         
	// 6329 11831:getfield        #367 <Field int azh.bu>
	// 6330 11834:aload_0         
	// 6331 11835:getfield        #12  <Field azh a>
	// 6332 11838:getfield        #391 <Field int azh.r>
	// 6333 11841:iconst_m1       
	// 6334 11842:ixor            
	// 6335 11843:iand            
	// 6336 11844:putfield        #391 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6337 11847:aload_0         
	// 6338 11848:getfield        #12  <Field azh a>
	// 6339 11851:astore_1        
		abyte0.bA = ((azh) (abyte0)).Q & a.bt;
	// 6340 11852:aload_1         
	// 6341 11853:aload_1         
	// 6342 11854:getfield        #388 <Field int azh.Q>
	// 6343 11857:aload_0         
	// 6344 11858:getfield        #12  <Field azh a>
	// 6345 11861:getfield        #394 <Field int azh.bt>
	// 6346 11864:iand            
	// 6347 11865:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6348 11868:aload_0         
	// 6349 11869:getfield        #12  <Field azh a>
	// 6350 11872:astore_1        
		abyte0.bA = ((azh) (abyte0)).aB ^ a.bA;
	// 6351 11873:aload_1         
	// 6352 11874:aload_1         
	// 6353 11875:getfield        #397 <Field int azh.aB>
	// 6354 11878:aload_0         
	// 6355 11879:getfield        #12  <Field azh a>
	// 6356 11882:getfield        #382 <Field int azh.bA>
	// 6357 11885:ixor            
	// 6358 11886:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6359 11889:aload_0         
	// 6360 11890:getfield        #12  <Field azh a>
	// 6361 11893:astore_1        
		abyte0.r = ((azh) (abyte0)).bA ^ a.r;
	// 6362 11894:aload_1         
	// 6363 11895:aload_1         
	// 6364 11896:getfield        #382 <Field int azh.bA>
	// 6365 11899:aload_0         
	// 6366 11900:getfield        #12  <Field azh a>
	// 6367 11903:getfield        #391 <Field int azh.r>
	// 6368 11906:ixor            
	// 6369 11907:putfield        #391 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6370 11910:aload_0         
	// 6371 11911:getfield        #12  <Field azh a>
	// 6372 11914:astore_1        
		abyte0.bH = ((azh) (abyte0)).Q & a.bH;
	// 6373 11915:aload_1         
	// 6374 11916:aload_1         
	// 6375 11917:getfield        #388 <Field int azh.Q>
	// 6376 11920:aload_0         
	// 6377 11921:getfield        #12  <Field azh a>
	// 6378 11924:getfield        #400 <Field int azh.bH>
	// 6379 11927:iand            
	// 6380 11928:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6381 11931:aload_0         
	// 6382 11932:getfield        #12  <Field azh a>
	// 6383 11935:astore_1        
		abyte0.bH = ((azh) (abyte0)).bh ^ a.bH;
	// 6384 11936:aload_1         
	// 6385 11937:aload_1         
	// 6386 11938:getfield        #403 <Field int azh.bh>
	// 6387 11941:aload_0         
	// 6388 11942:getfield        #12  <Field azh a>
	// 6389 11945:getfield        #400 <Field int azh.bH>
	// 6390 11948:ixor            
	// 6391 11949:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6392 11952:aload_0         
	// 6393 11953:getfield        #12  <Field azh a>
	// 6394 11956:astore_1        
		abyte0.bH = ((azh) (abyte0)).bu & a.bH;
	// 6395 11957:aload_1         
	// 6396 11958:aload_1         
	// 6397 11959:getfield        #367 <Field int azh.bu>
	// 6398 11962:aload_0         
	// 6399 11963:getfield        #12  <Field azh a>
	// 6400 11966:getfield        #400 <Field int azh.bH>
	// 6401 11969:iand            
	// 6402 11970:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6403 11973:aload_0         
	// 6404 11974:getfield        #12  <Field azh a>
	// 6405 11977:astore_1        
		abyte0.bA = ((azh) (abyte0)).Q & ~a.z;
	// 6406 11978:aload_1         
	// 6407 11979:aload_1         
	// 6408 11980:getfield        #388 <Field int azh.Q>
	// 6409 11983:aload_0         
	// 6410 11984:getfield        #12  <Field azh a>
	// 6411 11987:getfield        #406 <Field int azh.z>
	// 6412 11990:iconst_m1       
	// 6413 11991:ixor            
	// 6414 11992:iand            
	// 6415 11993:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6416 11996:aload_0         
	// 6417 11997:getfield        #12  <Field azh a>
	// 6418 12000:astore_1        
		abyte0.bA = ((azh) (abyte0)).am ^ a.bA;
	// 6419 12001:aload_1         
	// 6420 12002:aload_1         
	// 6421 12003:getfield        #409 <Field int azh.am>
	// 6422 12006:aload_0         
	// 6423 12007:getfield        #12  <Field azh a>
	// 6424 12010:getfield        #382 <Field int azh.bA>
	// 6425 12013:ixor            
	// 6426 12014:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6427 12017:aload_0         
	// 6428 12018:getfield        #12  <Field azh a>
	// 6429 12021:astore_1        
		abyte0.bA = ((azh) (abyte0)).bu & ~a.bA;
	// 6430 12022:aload_1         
	// 6431 12023:aload_1         
	// 6432 12024:getfield        #367 <Field int azh.bu>
	// 6433 12027:aload_0         
	// 6434 12028:getfield        #12  <Field azh a>
	// 6435 12031:getfield        #382 <Field int azh.bA>
	// 6436 12034:iconst_m1       
	// 6437 12035:ixor            
	// 6438 12036:iand            
	// 6439 12037:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6440 12040:aload_0         
	// 6441 12041:getfield        #12  <Field azh a>
	// 6442 12044:astore_1        
		abyte0.am = ((azh) (abyte0)).Q & ~a.Y;
	// 6443 12045:aload_1         
	// 6444 12046:aload_1         
	// 6445 12047:getfield        #388 <Field int azh.Q>
	// 6446 12050:aload_0         
	// 6447 12051:getfield        #12  <Field azh a>
	// 6448 12054:getfield        #412 <Field int azh.Y>
	// 6449 12057:iconst_m1       
	// 6450 12058:ixor            
	// 6451 12059:iand            
	// 6452 12060:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 6453 12063:aload_0         
	// 6454 12064:getfield        #12  <Field azh a>
	// 6455 12067:astore_1        
		abyte0.am = ((azh) (abyte0)).by ^ a.am;
	// 6456 12068:aload_1         
	// 6457 12069:aload_1         
	// 6458 12070:getfield        #415 <Field int azh.by>
	// 6459 12073:aload_0         
	// 6460 12074:getfield        #12  <Field azh a>
	// 6461 12077:getfield        #409 <Field int azh.am>
	// 6462 12080:ixor            
	// 6463 12081:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 6464 12084:aload_0         
	// 6465 12085:getfield        #12  <Field azh a>
	// 6466 12088:astore_1        
		abyte0.aR = ((azh) (abyte0)).Q & ~a.aR;
	// 6467 12089:aload_1         
	// 6468 12090:aload_1         
	// 6469 12091:getfield        #388 <Field int azh.Q>
	// 6470 12094:aload_0         
	// 6471 12095:getfield        #12  <Field azh a>
	// 6472 12098:getfield        #418 <Field int azh.aR>
	// 6473 12101:iconst_m1       
	// 6474 12102:ixor            
	// 6475 12103:iand            
	// 6476 12104:putfield        #418 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 6477 12107:aload_0         
	// 6478 12108:getfield        #12  <Field azh a>
	// 6479 12111:astore_1        
		abyte0.aR = ((azh) (abyte0)).bM ^ a.aR;
	// 6480 12112:aload_1         
	// 6481 12113:aload_1         
	// 6482 12114:getfield        #421 <Field int azh.bM>
	// 6483 12117:aload_0         
	// 6484 12118:getfield        #12  <Field azh a>
	// 6485 12121:getfield        #418 <Field int azh.aR>
	// 6486 12124:ixor            
	// 6487 12125:putfield        #418 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 6488 12128:aload_0         
	// 6489 12129:getfield        #12  <Field azh a>
	// 6490 12132:astore_1        
		abyte0.bL = ((azh) (abyte0)).Q & ~a.bL;
	// 6491 12133:aload_1         
	// 6492 12134:aload_1         
	// 6493 12135:getfield        #388 <Field int azh.Q>
	// 6494 12138:aload_0         
	// 6495 12139:getfield        #12  <Field azh a>
	// 6496 12142:getfield        #424 <Field int azh.bL>
	// 6497 12145:iconst_m1       
	// 6498 12146:ixor            
	// 6499 12147:iand            
	// 6500 12148:putfield        #424 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6501 12151:aload_0         
	// 6502 12152:getfield        #12  <Field azh a>
	// 6503 12155:astore_1        
		abyte0.bL = ((azh) (abyte0)).bR ^ a.bL;
	// 6504 12156:aload_1         
	// 6505 12157:aload_1         
	// 6506 12158:getfield        #427 <Field int azh.bR>
	// 6507 12161:aload_0         
	// 6508 12162:getfield        #12  <Field azh a>
	// 6509 12165:getfield        #424 <Field int azh.bL>
	// 6510 12168:ixor            
	// 6511 12169:putfield        #424 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6512 12172:aload_0         
	// 6513 12173:getfield        #12  <Field azh a>
	// 6514 12176:astore_1        
		abyte0.bL = ((azh) (abyte0)).bu & ~a.bL;
	// 6515 12177:aload_1         
	// 6516 12178:aload_1         
	// 6517 12179:getfield        #367 <Field int azh.bu>
	// 6518 12182:aload_0         
	// 6519 12183:getfield        #12  <Field azh a>
	// 6520 12186:getfield        #424 <Field int azh.bL>
	// 6521 12189:iconst_m1       
	// 6522 12190:ixor            
	// 6523 12191:iand            
	// 6524 12192:putfield        #424 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6525 12195:aload_0         
	// 6526 12196:getfield        #12  <Field azh a>
	// 6527 12199:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt | a.Q;
	// 6528 12200:aload_1         
	// 6529 12201:aload_1         
	// 6530 12202:getfield        #394 <Field int azh.bt>
	// 6531 12205:aload_0         
	// 6532 12206:getfield        #12  <Field azh a>
	// 6533 12209:getfield        #388 <Field int azh.Q>
	// 6534 12212:ior             
	// 6535 12213:putfield        #394 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6536 12216:aload_0         
	// 6537 12217:getfield        #12  <Field azh a>
	// 6538 12220:astore_1        
		abyte0.bt = ((azh) (abyte0)).Y ^ a.bt;
	// 6539 12221:aload_1         
	// 6540 12222:aload_1         
	// 6541 12223:getfield        #412 <Field int azh.Y>
	// 6542 12226:aload_0         
	// 6543 12227:getfield        #12  <Field azh a>
	// 6544 12230:getfield        #394 <Field int azh.bt>
	// 6545 12233:ixor            
	// 6546 12234:putfield        #394 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6547 12237:aload_0         
	// 6548 12238:getfield        #12  <Field azh a>
	// 6549 12241:astore_1        
		abyte0.bA = ((azh) (abyte0)).bt ^ a.bA;
	// 6550 12242:aload_1         
	// 6551 12243:aload_1         
	// 6552 12244:getfield        #394 <Field int azh.bt>
	// 6553 12247:aload_0         
	// 6554 12248:getfield        #12  <Field azh a>
	// 6555 12251:getfield        #382 <Field int azh.bA>
	// 6556 12254:ixor            
	// 6557 12255:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6558 12258:aload_0         
	// 6559 12259:getfield        #12  <Field azh a>
	// 6560 12262:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA & ~a.I;
	// 6561 12263:aload_1         
	// 6562 12264:aload_1         
	// 6563 12265:getfield        #382 <Field int azh.bA>
	// 6564 12268:aload_0         
	// 6565 12269:getfield        #12  <Field azh a>
	// 6566 12272:getfield        #429 <Field int azh.I>
	// 6567 12275:iconst_m1       
	// 6568 12276:ixor            
	// 6569 12277:iand            
	// 6570 12278:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6571 12281:aload_0         
	// 6572 12282:getfield        #12  <Field azh a>
	// 6573 12285:astore_1        
		abyte0.bA = ((azh) (abyte0)).r ^ a.bA;
	// 6574 12286:aload_1         
	// 6575 12287:aload_1         
	// 6576 12288:getfield        #391 <Field int azh.r>
	// 6577 12291:aload_0         
	// 6578 12292:getfield        #12  <Field azh a>
	// 6579 12295:getfield        #382 <Field int azh.bA>
	// 6580 12298:ixor            
	// 6581 12299:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6582 12302:aload_0         
	// 6583 12303:getfield        #12  <Field azh a>
	// 6584 12306:astore_1        
		abyte0.af = ((azh) (abyte0)).bA ^ a.af;
	// 6585 12307:aload_1         
	// 6586 12308:aload_1         
	// 6587 12309:getfield        #382 <Field int azh.bA>
	// 6588 12312:aload_0         
	// 6589 12313:getfield        #12  <Field azh a>
	// 6590 12316:getfield        #109 <Field int azh.af>
	// 6591 12319:ixor            
	// 6592 12320:putfield        #109 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 6593 12323:aload_0         
	// 6594 12324:getfield        #12  <Field azh a>
	// 6595 12327:astore_1        
		abyte0.bA = ((azh) (abyte0)).t & a.af;
	// 6596 12328:aload_1         
	// 6597 12329:aload_1         
	// 6598 12330:getfield        #103 <Field int azh.t>
	// 6599 12333:aload_0         
	// 6600 12334:getfield        #12  <Field azh a>
	// 6601 12337:getfield        #109 <Field int azh.af>
	// 6602 12340:iand            
	// 6603 12341:putfield        #382 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 6604 12344:aload_0         
	// 6605 12345:getfield        #12  <Field azh a>
	// 6606 12348:astore_1        
		abyte0.r = ((azh) (abyte0)).af & ~a.ax;
	// 6607 12349:aload_1         
	// 6608 12350:aload_1         
	// 6609 12351:getfield        #109 <Field int azh.af>
	// 6610 12354:aload_0         
	// 6611 12355:getfield        #12  <Field azh a>
	// 6612 12358:getfield        #349 <Field int azh.ax>
	// 6613 12361:iconst_m1       
	// 6614 12362:ixor            
	// 6615 12363:iand            
	// 6616 12364:putfield        #391 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6617 12367:aload_0         
	// 6618 12368:getfield        #12  <Field azh a>
	// 6619 12371:astore_1        
		abyte0.bt = ((azh) (abyte0)).r ^ a.t;
	// 6620 12372:aload_1         
	// 6621 12373:aload_1         
	// 6622 12374:getfield        #391 <Field int azh.r>
	// 6623 12377:aload_0         
	// 6624 12378:getfield        #12  <Field azh a>
	// 6625 12381:getfield        #103 <Field int azh.t>
	// 6626 12384:ixor            
	// 6627 12385:putfield        #394 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6628 12388:aload_0         
	// 6629 12389:getfield        #12  <Field azh a>
	// 6630 12392:astore_1        
		abyte0.r = ((azh) (abyte0)).t & a.r;
	// 6631 12393:aload_1         
	// 6632 12394:aload_1         
	// 6633 12395:getfield        #103 <Field int azh.t>
	// 6634 12398:aload_0         
	// 6635 12399:getfield        #12  <Field azh a>
	// 6636 12402:getfield        #391 <Field int azh.r>
	// 6637 12405:iand            
	// 6638 12406:putfield        #391 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6639 12409:aload_0         
	// 6640 12410:getfield        #12  <Field azh a>
	// 6641 12413:astore_1        
		abyte0.bR = ((azh) (abyte0)).ax & ~a.af;
	// 6642 12414:aload_1         
	// 6643 12415:aload_1         
	// 6644 12416:getfield        #349 <Field int azh.ax>
	// 6645 12419:aload_0         
	// 6646 12420:getfield        #12  <Field azh a>
	// 6647 12423:getfield        #109 <Field int azh.af>
	// 6648 12426:iconst_m1       
	// 6649 12427:ixor            
	// 6650 12428:iand            
	// 6651 12429:putfield        #427 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 6652 12432:aload_0         
	// 6653 12433:getfield        #12  <Field azh a>
	// 6654 12436:astore_1        
		abyte0.aN = ((azh) (abyte0)).bR ^ a.aN;
	// 6655 12437:aload_1         
	// 6656 12438:aload_1         
	// 6657 12439:getfield        #427 <Field int azh.bR>
	// 6658 12442:aload_0         
	// 6659 12443:getfield        #12  <Field azh a>
	// 6660 12446:getfield        #376 <Field int azh.aN>
	// 6661 12449:ixor            
	// 6662 12450:putfield        #376 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6663 12453:aload_0         
	// 6664 12454:getfield        #12  <Field azh a>
	// 6665 12457:astore_1        
		abyte0.bM = ((azh) (abyte0)).t & a.bR;
	// 6666 12458:aload_1         
	// 6667 12459:aload_1         
	// 6668 12460:getfield        #103 <Field int azh.t>
	// 6669 12463:aload_0         
	// 6670 12464:getfield        #12  <Field azh a>
	// 6671 12467:getfield        #427 <Field int azh.bR>
	// 6672 12470:iand            
	// 6673 12471:putfield        #421 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 6674 12474:aload_0         
	// 6675 12475:getfield        #12  <Field azh a>
	// 6676 12478:astore_1        
		abyte0.bM = ((azh) (abyte0)).bR ^ a.bM;
	// 6677 12479:aload_1         
	// 6678 12480:aload_1         
	// 6679 12481:getfield        #427 <Field int azh.bR>
	// 6680 12484:aload_0         
	// 6681 12485:getfield        #12  <Field azh a>
	// 6682 12488:getfield        #421 <Field int azh.bM>
	// 6683 12491:ixor            
	// 6684 12492:putfield        #421 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 6685 12495:aload_0         
	// 6686 12496:getfield        #12  <Field azh a>
	// 6687 12499:astore_1        
		abyte0.bP = ((azh) (abyte0)).af ^ a.bP;
	// 6688 12500:aload_1         
	// 6689 12501:aload_1         
	// 6690 12502:getfield        #109 <Field int azh.af>
	// 6691 12505:aload_0         
	// 6692 12506:getfield        #12  <Field azh a>
	// 6693 12509:getfield        #154 <Field int azh.bP>
	// 6694 12512:ixor            
	// 6695 12513:putfield        #154 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 6696 12516:aload_0         
	// 6697 12517:getfield        #12  <Field azh a>
	// 6698 12520:astore_1        
		abyte0.aB = ((azh) (abyte0)).af | a.ax;
	// 6699 12521:aload_1         
	// 6700 12522:aload_1         
	// 6701 12523:getfield        #109 <Field int azh.af>
	// 6702 12526:aload_0         
	// 6703 12527:getfield        #12  <Field azh a>
	// 6704 12530:getfield        #349 <Field int azh.ax>
	// 6705 12533:ior             
	// 6706 12534:putfield        #397 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 6707 12537:aload_0         
	// 6708 12538:getfield        #12  <Field azh a>
	// 6709 12541:astore_1        
		abyte0.bD = ((azh) (abyte0)).aB & ~a.ax;
	// 6710 12542:aload_1         
	// 6711 12543:aload_1         
	// 6712 12544:getfield        #397 <Field int azh.aB>
	// 6713 12547:aload_0         
	// 6714 12548:getfield        #12  <Field azh a>
	// 6715 12551:getfield        #349 <Field int azh.ax>
	// 6716 12554:iconst_m1       
	// 6717 12555:ixor            
	// 6718 12556:iand            
	// 6719 12557:putfield        #115 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 6720 12560:aload_0         
	// 6721 12561:getfield        #12  <Field azh a>
	// 6722 12564:astore_1        
		abyte0.cd = ((azh) (abyte0)).t & ~a.bD;
	// 6723 12565:aload_1         
	// 6724 12566:aload_1         
	// 6725 12567:getfield        #103 <Field int azh.t>
	// 6726 12570:aload_0         
	// 6727 12571:getfield        #12  <Field azh a>
	// 6728 12574:getfield        #115 <Field int azh.bD>
	// 6729 12577:iconst_m1       
	// 6730 12578:ixor            
	// 6731 12579:iand            
	// 6732 12580:putfield        #385 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 6733 12583:aload_0         
	// 6734 12584:getfield        #12  <Field azh a>
	// 6735 12587:astore_1        
		abyte0.J = ((azh) (abyte0)).t & ~a.aB;
	// 6736 12588:aload_1         
	// 6737 12589:aload_1         
	// 6738 12590:getfield        #103 <Field int azh.t>
	// 6739 12593:aload_0         
	// 6740 12594:getfield        #12  <Field azh a>
	// 6741 12597:getfield        #397 <Field int azh.aB>
	// 6742 12600:iconst_m1       
	// 6743 12601:ixor            
	// 6744 12602:iand            
	// 6745 12603:putfield        #38  <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 6746 12606:aload_0         
	// 6747 12607:getfield        #12  <Field azh a>
	// 6748 12610:astore_1        
		abyte0.J = ((azh) (abyte0)).aB ^ a.J;
	// 6749 12611:aload_1         
	// 6750 12612:aload_1         
	// 6751 12613:getfield        #397 <Field int azh.aB>
	// 6752 12616:aload_0         
	// 6753 12617:getfield        #12  <Field azh a>
	// 6754 12620:getfield        #38  <Field int azh.J>
	// 6755 12623:ixor            
	// 6756 12624:putfield        #38  <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 6757 12627:aload_0         
	// 6758 12628:getfield        #12  <Field azh a>
	// 6759 12631:astore_1        
		abyte0.aH = ((azh) (abyte0)).af & a.ax;
	// 6760 12632:aload_1         
	// 6761 12633:aload_1         
	// 6762 12634:getfield        #109 <Field int azh.af>
	// 6763 12637:aload_0         
	// 6764 12638:getfield        #12  <Field azh a>
	// 6765 12641:getfield        #349 <Field int azh.ax>
	// 6766 12644:iand            
	// 6767 12645:putfield        #340 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 6768 12648:aload_0         
	// 6769 12649:getfield        #12  <Field azh a>
	// 6770 12652:astore_1        
		abyte0.bG = ((azh) (abyte0)).t & ~a.aH;
	// 6771 12653:aload_1         
	// 6772 12654:aload_1         
	// 6773 12655:getfield        #103 <Field int azh.t>
	// 6774 12658:aload_0         
	// 6775 12659:getfield        #12  <Field azh a>
	// 6776 12662:getfield        #340 <Field int azh.aH>
	// 6777 12665:iconst_m1       
	// 6778 12666:ixor            
	// 6779 12667:iand            
	// 6780 12668:putfield        #343 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 6781 12671:aload_0         
	// 6782 12672:getfield        #12  <Field azh a>
	// 6783 12675:astore_1        
		abyte0.ce = ((azh) (abyte0)).t & a.aH;
	// 6784 12676:aload_1         
	// 6785 12677:aload_1         
	// 6786 12678:getfield        #103 <Field int azh.t>
	// 6787 12681:aload_0         
	// 6788 12682:getfield        #12  <Field azh a>
	// 6789 12685:getfield        #340 <Field int azh.aH>
	// 6790 12688:iand            
	// 6791 12689:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6792 12692:aload_0         
	// 6793 12693:getfield        #12  <Field azh a>
	// 6794 12696:astore_1        
		abyte0.ce = ((azh) (abyte0)).aH ^ a.ce;
	// 6795 12697:aload_1         
	// 6796 12698:aload_1         
	// 6797 12699:getfield        #340 <Field int azh.aH>
	// 6798 12702:aload_0         
	// 6799 12703:getfield        #12  <Field azh a>
	// 6800 12706:getfield        #133 <Field int azh.ce>
	// 6801 12709:ixor            
	// 6802 12710:putfield        #133 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6803 12713:aload_0         
	// 6804 12714:getfield        #12  <Field azh a>
	// 6805 12717:astore_1        
		abyte0.bI = ((azh) (abyte0)).ax & ~a.aH;
	// 6806 12718:aload_1         
	// 6807 12719:aload_1         
	// 6808 12720:getfield        #349 <Field int azh.ax>
	// 6809 12723:aload_0         
	// 6810 12724:getfield        #12  <Field azh a>
	// 6811 12727:getfield        #340 <Field int azh.aH>
	// 6812 12730:iconst_m1       
	// 6813 12731:ixor            
	// 6814 12732:iand            
	// 6815 12733:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6816 12736:aload_0         
	// 6817 12737:getfield        #12  <Field azh a>
	// 6818 12740:astore_1        
		abyte0.bG = ((azh) (abyte0)).bI ^ a.bG;
	// 6819 12741:aload_1         
	// 6820 12742:aload_1         
	// 6821 12743:getfield        #334 <Field int azh.bI>
	// 6822 12746:aload_0         
	// 6823 12747:getfield        #12  <Field azh a>
	// 6824 12750:getfield        #343 <Field int azh.bG>
	// 6825 12753:ixor            
	// 6826 12754:putfield        #343 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 6827 12757:aload_0         
	// 6828 12758:getfield        #12  <Field azh a>
	// 6829 12761:astore_1        
		abyte0.ah = ((azh) (abyte0)).t & ~a.bI;
	// 6830 12762:aload_1         
	// 6831 12763:aload_1         
	// 6832 12764:getfield        #103 <Field int azh.t>
	// 6833 12767:aload_0         
	// 6834 12768:getfield        #12  <Field azh a>
	// 6835 12771:getfield        #334 <Field int azh.bI>
	// 6836 12774:iconst_m1       
	// 6837 12775:ixor            
	// 6838 12776:iand            
	// 6839 12777:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6840 12780:aload_0         
	// 6841 12781:getfield        #12  <Field azh a>
	// 6842 12784:astore_1        
		abyte0.ah = ((azh) (abyte0)).bR ^ a.ah;
	// 6843 12785:aload_1         
	// 6844 12786:aload_1         
	// 6845 12787:getfield        #427 <Field int azh.bR>
	// 6846 12790:aload_0         
	// 6847 12791:getfield        #12  <Field azh a>
	// 6848 12794:getfield        #64  <Field int azh.ah>
	// 6849 12797:ixor            
	// 6850 12798:putfield        #64  <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6851 12801:aload_0         
	// 6852 12802:getfield        #12  <Field azh a>
	// 6853 12805:astore_1        
		abyte0.aE = ((azh) (abyte0)).t & ~a.bI;
	// 6854 12806:aload_1         
	// 6855 12807:aload_1         
	// 6856 12808:getfield        #103 <Field int azh.t>
	// 6857 12811:aload_0         
	// 6858 12812:getfield        #12  <Field azh a>
	// 6859 12815:getfield        #334 <Field int azh.bI>
	// 6860 12818:iconst_m1       
	// 6861 12819:ixor            
	// 6862 12820:iand            
	// 6863 12821:putfield        #310 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 6864 12824:aload_0         
	// 6865 12825:getfield        #12  <Field azh a>
	// 6866 12828:astore_1        
		abyte0.aE = ((azh) (abyte0)).aB ^ a.aE;
	// 6867 12829:aload_1         
	// 6868 12830:aload_1         
	// 6869 12831:getfield        #397 <Field int azh.aB>
	// 6870 12834:aload_0         
	// 6871 12835:getfield        #12  <Field azh a>
	// 6872 12838:getfield        #310 <Field int azh.aE>
	// 6873 12841:ixor            
	// 6874 12842:putfield        #310 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 6875 12845:aload_0         
	// 6876 12846:getfield        #12  <Field azh a>
	// 6877 12849:astore_1        
		abyte0.bI = ((azh) (abyte0)).t & ~a.bI;
	// 6878 12850:aload_1         
	// 6879 12851:aload_1         
	// 6880 12852:getfield        #103 <Field int azh.t>
	// 6881 12855:aload_0         
	// 6882 12856:getfield        #12  <Field azh a>
	// 6883 12859:getfield        #334 <Field int azh.bI>
	// 6884 12862:iconst_m1       
	// 6885 12863:ixor            
	// 6886 12864:iand            
	// 6887 12865:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6888 12868:aload_0         
	// 6889 12869:getfield        #12  <Field azh a>
	// 6890 12872:astore_1        
		abyte0.bI = ((azh) (abyte0)).bY & ~a.bI;
	// 6891 12873:aload_1         
	// 6892 12874:aload_1         
	// 6893 12875:getfield        #262 <Field int azh.bY>
	// 6894 12878:aload_0         
	// 6895 12879:getfield        #12  <Field azh a>
	// 6896 12882:getfield        #334 <Field int azh.bI>
	// 6897 12885:iconst_m1       
	// 6898 12886:ixor            
	// 6899 12887:iand            
	// 6900 12888:putfield        #334 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6901 12891:aload_0         
	// 6902 12892:getfield        #12  <Field azh a>
	// 6903 12895:astore_1        
		abyte0.aq = ((azh) (abyte0)).t & a.aH;
	// 6904 12896:aload_1         
	// 6905 12897:aload_1         
	// 6906 12898:getfield        #103 <Field int azh.t>
	// 6907 12901:aload_0         
	// 6908 12902:getfield        #12  <Field azh a>
	// 6909 12905:getfield        #340 <Field int azh.aH>
	// 6910 12908:iand            
	// 6911 12909:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 6912 12912:aload_0         
	// 6913 12913:getfield        #12  <Field azh a>
	// 6914 12916:astore_1        
		abyte0.aq = ((azh) (abyte0)).aB ^ a.aq;
	// 6915 12917:aload_1         
	// 6916 12918:aload_1         
	// 6917 12919:getfield        #397 <Field int azh.aB>
	// 6918 12922:aload_0         
	// 6919 12923:getfield        #12  <Field azh a>
	// 6920 12926:getfield        #202 <Field int azh.aq>
	// 6921 12929:ixor            
	// 6922 12930:putfield        #202 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 6923 12933:aload_0         
	// 6924 12934:getfield        #12  <Field azh a>
	// 6925 12937:astore_1        
		abyte0.ca = ((azh) (abyte0)).af ^ a.ax;
	// 6926 12938:aload_1         
	// 6927 12939:aload_1         
	// 6928 12940:getfield        #109 <Field int azh.af>
	// 6929 12943:aload_0         
	// 6930 12944:getfield        #12  <Field azh a>
	// 6931 12947:getfield        #349 <Field int azh.ax>
	// 6932 12950:ixor            
	// 6933 12951:putfield        #325 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6934 12954:aload_0         
	// 6935 12955:getfield        #12  <Field azh a>
	// 6936 12958:astore_1        
		abyte0.cj = ((azh) (abyte0)).t & a.af;
	// 6937 12959:aload_1         
	// 6938 12960:aload_1         
	// 6939 12961:getfield        #103 <Field int azh.t>
	// 6940 12964:aload_0         
	// 6941 12965:getfield        #12  <Field azh a>
	// 6942 12968:getfield        #109 <Field int azh.af>
	// 6943 12971:iand            
	// 6944 12972:putfield        #331 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 6945 12975:aload_0         
	// 6946 12976:getfield        #12  <Field azh a>
	// 6947 12979:astore_1        
		abyte0.cj = ((azh) (abyte0)).bR ^ a.cj;
	// 6948 12980:aload_1         
	// 6949 12981:aload_1         
	// 6950 12982:getfield        #427 <Field int azh.bR>
	// 6951 12985:aload_0         
	// 6952 12986:getfield        #12  <Field azh a>
	// 6953 12989:getfield        #331 <Field int azh.cj>
	// 6954 12992:ixor            
	// 6955 12993:putfield        #331 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 6956 12996:aload_0         
	// 6957 12997:getfield        #12  <Field azh a>
	// 6958 13000:astore_1        
		abyte0.z = ((azh) (abyte0)).z | a.Q;
	// 6959 13001:aload_1         
	// 6960 13002:aload_1         
	// 6961 13003:getfield        #406 <Field int azh.z>
	// 6962 13006:aload_0         
	// 6963 13007:getfield        #12  <Field azh a>
	// 6964 13010:getfield        #388 <Field int azh.Q>
	// 6965 13013:ior             
	// 6966 13014:putfield        #406 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6967 13017:aload_0         
	// 6968 13018:getfield        #12  <Field azh a>
	// 6969 13021:astore_1        
		abyte0.z = ((azh) (abyte0)).bN ^ a.z;
	// 6970 13022:aload_1         
	// 6971 13023:aload_1         
	// 6972 13024:getfield        #432 <Field int azh.bN>
	// 6973 13027:aload_0         
	// 6974 13028:getfield        #12  <Field azh a>
	// 6975 13031:getfield        #406 <Field int azh.z>
	// 6976 13034:ixor            
	// 6977 13035:putfield        #406 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6978 13038:aload_0         
	// 6979 13039:getfield        #12  <Field azh a>
	// 6980 13042:astore_1        
		abyte0.bL = ((azh) (abyte0)).z ^ a.bL;
	// 6981 13043:aload_1         
	// 6982 13044:aload_1         
	// 6983 13045:getfield        #406 <Field int azh.z>
	// 6984 13048:aload_0         
	// 6985 13049:getfield        #12  <Field azh a>
	// 6986 13052:getfield        #424 <Field int azh.bL>
	// 6987 13055:ixor            
	// 6988 13056:putfield        #424 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6989 13059:aload_0         
	// 6990 13060:getfield        #12  <Field azh a>
	// 6991 13063:astore_1        
		abyte0.as = ((azh) (abyte0)).as & ~a.Q;
	// 6992 13064:aload_1         
	// 6993 13065:aload_1         
	// 6994 13066:getfield        #435 <Field int azh.as>
	// 6995 13069:aload_0         
	// 6996 13070:getfield        #12  <Field azh a>
	// 6997 13073:getfield        #388 <Field int azh.Q>
	// 6998 13076:iconst_m1       
	// 6999 13077:ixor            
	// 7000 13078:iand            
	// 7001 13079:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7002 13082:aload_0         
	// 7003 13083:getfield        #12  <Field azh a>
	// 7004 13086:astore_1        
		abyte0.as = ((azh) (abyte0)).bu & ~a.as;
	// 7005 13087:aload_1         
	// 7006 13088:aload_1         
	// 7007 13089:getfield        #367 <Field int azh.bu>
	// 7008 13092:aload_0         
	// 7009 13093:getfield        #12  <Field azh a>
	// 7010 13096:getfield        #435 <Field int azh.as>
	// 7011 13099:iconst_m1       
	// 7012 13100:ixor            
	// 7013 13101:iand            
	// 7014 13102:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7015 13105:aload_0         
	// 7016 13106:getfield        #12  <Field azh a>
	// 7017 13109:astore_1        
		abyte0.as = ((azh) (abyte0)).aR ^ a.as;
	// 7018 13110:aload_1         
	// 7019 13111:aload_1         
	// 7020 13112:getfield        #418 <Field int azh.aR>
	// 7021 13115:aload_0         
	// 7022 13116:getfield        #12  <Field azh a>
	// 7023 13119:getfield        #435 <Field int azh.as>
	// 7024 13122:ixor            
	// 7025 13123:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7026 13126:aload_0         
	// 7027 13127:getfield        #12  <Field azh a>
	// 7028 13130:astore_1        
		abyte0.aJ = ((azh) (abyte0)).Q | a.aJ;
	// 7029 13131:aload_1         
	// 7030 13132:aload_1         
	// 7031 13133:getfield        #388 <Field int azh.Q>
	// 7032 13136:aload_0         
	// 7033 13137:getfield        #12  <Field azh a>
	// 7034 13140:getfield        #438 <Field int azh.aJ>
	// 7035 13143:ior             
	// 7036 13144:putfield        #438 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 7037 13147:aload_0         
	// 7038 13148:getfield        #12  <Field azh a>
	// 7039 13151:astore_1        
		abyte0.aJ = ((azh) (abyte0)).by ^ a.aJ;
	// 7040 13152:aload_1         
	// 7041 13153:aload_1         
	// 7042 13154:getfield        #415 <Field int azh.by>
	// 7043 13157:aload_0         
	// 7044 13158:getfield        #12  <Field azh a>
	// 7045 13161:getfield        #438 <Field int azh.aJ>
	// 7046 13164:ixor            
	// 7047 13165:putfield        #438 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 7048 13168:aload_0         
	// 7049 13169:getfield        #12  <Field azh a>
	// 7050 13172:astore_1        
		abyte0.bH = ((azh) (abyte0)).aJ ^ a.bH;
	// 7051 13173:aload_1         
	// 7052 13174:aload_1         
	// 7053 13175:getfield        #438 <Field int azh.aJ>
	// 7054 13178:aload_0         
	// 7055 13179:getfield        #12  <Field azh a>
	// 7056 13182:getfield        #400 <Field int azh.bH>
	// 7057 13185:ixor            
	// 7058 13186:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7059 13189:aload_0         
	// 7060 13190:getfield        #12  <Field azh a>
	// 7061 13193:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH & ~a.I;
	// 7062 13194:aload_1         
	// 7063 13195:aload_1         
	// 7064 13196:getfield        #400 <Field int azh.bH>
	// 7065 13199:aload_0         
	// 7066 13200:getfield        #12  <Field azh a>
	// 7067 13203:getfield        #429 <Field int azh.I>
	// 7068 13206:iconst_m1       
	// 7069 13207:ixor            
	// 7070 13208:iand            
	// 7071 13209:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7072 13212:aload_0         
	// 7073 13213:getfield        #12  <Field azh a>
	// 7074 13216:astore_1        
		abyte0.bH = ((azh) (abyte0)).bL ^ a.bH;
	// 7075 13217:aload_1         
	// 7076 13218:aload_1         
	// 7077 13219:getfield        #424 <Field int azh.bL>
	// 7078 13222:aload_0         
	// 7079 13223:getfield        #12  <Field azh a>
	// 7080 13226:getfield        #400 <Field int azh.bH>
	// 7081 13229:ixor            
	// 7082 13230:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7083 13233:aload_0         
	// 7084 13234:getfield        #12  <Field azh a>
	// 7085 13237:astore_1        
		abyte0.h = ((azh) (abyte0)).bH ^ a.h;
	// 7086 13238:aload_1         
	// 7087 13239:aload_1         
	// 7088 13240:getfield        #400 <Field int azh.bH>
	// 7089 13243:aload_0         
	// 7090 13244:getfield        #12  <Field azh a>
	// 7091 13247:getfield        #441 <Field int azh.h>
	// 7092 13250:ixor            
	// 7093 13251:putfield        #441 <Field int azh.h>
		abyte0 = ((byte []) (a));
	// 7094 13254:aload_0         
	// 7095 13255:getfield        #12  <Field azh a>
	// 7096 13258:astore_1        
		abyte0.bH = ((azh) (abyte0)).aj & ~a.h;
	// 7097 13259:aload_1         
	// 7098 13260:aload_1         
	// 7099 13261:getfield        #181 <Field int azh.aj>
	// 7100 13264:aload_0         
	// 7101 13265:getfield        #12  <Field azh a>
	// 7102 13268:getfield        #441 <Field int azh.h>
	// 7103 13271:iconst_m1       
	// 7104 13272:ixor            
	// 7105 13273:iand            
	// 7106 13274:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7107 13277:aload_0         
	// 7108 13278:getfield        #12  <Field azh a>
	// 7109 13281:astore_1        
		abyte0.bH = ((azh) (abyte0)).bk ^ a.bH;
	// 7110 13282:aload_1         
	// 7111 13283:aload_1         
	// 7112 13284:getfield        #32  <Field int azh.bk>
	// 7113 13287:aload_0         
	// 7114 13288:getfield        #12  <Field azh a>
	// 7115 13291:getfield        #400 <Field int azh.bH>
	// 7116 13294:ixor            
	// 7117 13295:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7118 13298:aload_0         
	// 7119 13299:getfield        #12  <Field azh a>
	// 7120 13302:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH & ~a.p;
	// 7121 13303:aload_1         
	// 7122 13304:aload_1         
	// 7123 13305:getfield        #400 <Field int azh.bH>
	// 7124 13308:aload_0         
	// 7125 13309:getfield        #12  <Field azh a>
	// 7126 13312:getfield        #283 <Field int azh.p>
	// 7127 13315:iconst_m1       
	// 7128 13316:ixor            
	// 7129 13317:iand            
	// 7130 13318:putfield        #400 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7131 13321:aload_0         
	// 7132 13322:getfield        #12  <Field azh a>
	// 7133 13325:astore_1        
		abyte0.bL = ((azh) (abyte0)).C & ~a.h;
	// 7134 13326:aload_1         
	// 7135 13327:aload_1         
	// 7136 13328:getfield        #304 <Field int azh.C>
	// 7137 13331:aload_0         
	// 7138 13332:getfield        #12  <Field azh a>
	// 7139 13335:getfield        #441 <Field int azh.h>
	// 7140 13338:iconst_m1       
	// 7141 13339:ixor            
	// 7142 13340:iand            
	// 7143 13341:putfield        #424 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 7144 13344:aload_0         
	// 7145 13345:getfield        #12  <Field azh a>
	// 7146 13348:astore_1        
		abyte0.bL = ((azh) (abyte0)).p | a.bL;
	// 7147 13349:aload_1         
	// 7148 13350:aload_1         
	// 7149 13351:getfield        #283 <Field int azh.p>
	// 7150 13354:aload_0         
	// 7151 13355:getfield        #12  <Field azh a>
	// 7152 13358:getfield        #424 <Field int azh.bL>
	// 7153 13361:ior             
	// 7154 13362:putfield        #424 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 7155 13365:aload_0         
	// 7156 13366:getfield        #12  <Field azh a>
	// 7157 13369:astore_1        
		abyte0.ag = ((azh) (abyte0)).ag | a.h;
	// 7158 13370:aload_1         
	// 7159 13371:aload_1         
	// 7160 13372:getfield        #29  <Field int azh.ag>
	// 7161 13375:aload_0         
	// 7162 13376:getfield        #12  <Field azh a>
	// 7163 13379:getfield        #441 <Field int azh.h>
	// 7164 13382:ior             
	// 7165 13383:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7166 13386:aload_0         
	// 7167 13387:getfield        #12  <Field azh a>
	// 7168 13390:astore_1        
		abyte0.ag = ((azh) (abyte0)).aw ^ a.ag;
	// 7169 13391:aload_1         
	// 7170 13392:aload_1         
	// 7171 13393:getfield        #172 <Field int azh.aw>
	// 7172 13396:aload_0         
	// 7173 13397:getfield        #12  <Field azh a>
	// 7174 13400:getfield        #29  <Field int azh.ag>
	// 7175 13403:ixor            
	// 7176 13404:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7177 13407:aload_0         
	// 7178 13408:getfield        #12  <Field azh a>
	// 7179 13411:astore_1        
		abyte0.ag = ((azh) (abyte0)).ab & a.ag;
	// 7180 13412:aload_1         
	// 7181 13413:aload_1         
	// 7182 13414:getfield        #373 <Field int azh.ab>
	// 7183 13417:aload_0         
	// 7184 13418:getfield        #12  <Field azh a>
	// 7185 13421:getfield        #29  <Field int azh.ag>
	// 7186 13424:iand            
	// 7187 13425:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7188 13428:aload_0         
	// 7189 13429:getfield        #12  <Field azh a>
	// 7190 13432:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & ~a.h;
	// 7191 13433:aload_1         
	// 7192 13434:aload_1         
	// 7193 13435:getfield        #91  <Field int azh.aW>
	// 7194 13438:aload_0         
	// 7195 13439:getfield        #12  <Field azh a>
	// 7196 13442:getfield        #441 <Field int azh.h>
	// 7197 13445:iconst_m1       
	// 7198 13446:ixor            
	// 7199 13447:iand            
	// 7200 13448:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7201 13451:aload_0         
	// 7202 13452:getfield        #12  <Field azh a>
	// 7203 13455:astore_1        
		abyte0.aW = ((azh) (abyte0)).aD ^ a.aW;
	// 7204 13456:aload_1         
	// 7205 13457:aload_1         
	// 7206 13458:getfield        #184 <Field int azh.aD>
	// 7207 13461:aload_0         
	// 7208 13462:getfield        #12  <Field azh a>
	// 7209 13465:getfield        #91  <Field int azh.aW>
	// 7210 13468:ixor            
	// 7211 13469:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7212 13472:aload_0         
	// 7213 13473:getfield        #12  <Field azh a>
	// 7214 13476:astore_1        
		abyte0.aD = ((azh) (abyte0)).h & ~a.C;
	// 7215 13477:aload_1         
	// 7216 13478:aload_1         
	// 7217 13479:getfield        #441 <Field int azh.h>
	// 7218 13482:aload_0         
	// 7219 13483:getfield        #12  <Field azh a>
	// 7220 13486:getfield        #304 <Field int azh.C>
	// 7221 13489:iconst_m1       
	// 7222 13490:ixor            
	// 7223 13491:iand            
	// 7224 13492:putfield        #184 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7225 13495:aload_0         
	// 7226 13496:getfield        #12  <Field azh a>
	// 7227 13499:astore_1        
		abyte0.aD = ((azh) (abyte0)).C ^ a.aD;
	// 7228 13500:aload_1         
	// 7229 13501:aload_1         
	// 7230 13502:getfield        #304 <Field int azh.C>
	// 7231 13505:aload_0         
	// 7232 13506:getfield        #12  <Field azh a>
	// 7233 13509:getfield        #184 <Field int azh.aD>
	// 7234 13512:ixor            
	// 7235 13513:putfield        #184 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7236 13516:aload_0         
	// 7237 13517:getfield        #12  <Field azh a>
	// 7238 13520:astore_1        
		abyte0.aD = ((azh) (abyte0)).p | a.aD;
	// 7239 13521:aload_1         
	// 7240 13522:aload_1         
	// 7241 13523:getfield        #283 <Field int azh.p>
	// 7242 13526:aload_0         
	// 7243 13527:getfield        #12  <Field azh a>
	// 7244 13530:getfield        #184 <Field int azh.aD>
	// 7245 13533:ior             
	// 7246 13534:putfield        #184 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7247 13537:aload_0         
	// 7248 13538:getfield        #12  <Field azh a>
	// 7249 13541:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx & ~a.h;
	// 7250 13542:aload_1         
	// 7251 13543:aload_1         
	// 7252 13544:getfield        #70  <Field int azh.bx>
	// 7253 13547:aload_0         
	// 7254 13548:getfield        #12  <Field azh a>
	// 7255 13551:getfield        #441 <Field int azh.h>
	// 7256 13554:iconst_m1       
	// 7257 13555:ixor            
	// 7258 13556:iand            
	// 7259 13557:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7260 13560:aload_0         
	// 7261 13561:getfield        #12  <Field azh a>
	// 7262 13564:astore_1        
		abyte0.bx = ((azh) (abyte0)).L ^ a.bx;
	// 7263 13565:aload_1         
	// 7264 13566:aload_1         
	// 7265 13567:getfield        #280 <Field int azh.L>
	// 7266 13570:aload_0         
	// 7267 13571:getfield        #12  <Field azh a>
	// 7268 13574:getfield        #70  <Field int azh.bx>
	// 7269 13577:ixor            
	// 7270 13578:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7271 13581:aload_0         
	// 7272 13582:getfield        #12  <Field azh a>
	// 7273 13585:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx & a.ab;
	// 7274 13586:aload_1         
	// 7275 13587:aload_1         
	// 7276 13588:getfield        #70  <Field int azh.bx>
	// 7277 13591:aload_0         
	// 7278 13592:getfield        #12  <Field azh a>
	// 7279 13595:getfield        #373 <Field int azh.ab>
	// 7280 13598:iand            
	// 7281 13599:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7282 13602:aload_0         
	// 7283 13603:getfield        #12  <Field azh a>
	// 7284 13606:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm | a.h;
	// 7285 13607:aload_1         
	// 7286 13608:aload_1         
	// 7287 13609:getfield        #175 <Field int azh.bm>
	// 7288 13612:aload_0         
	// 7289 13613:getfield        #12  <Field azh a>
	// 7290 13616:getfield        #441 <Field int azh.h>
	// 7291 13619:ior             
	// 7292 13620:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7293 13623:aload_0         
	// 7294 13624:getfield        #12  <Field azh a>
	// 7295 13627:astore_1        
		abyte0.bm = ((azh) (abyte0)).L ^ a.bm;
	// 7296 13628:aload_1         
	// 7297 13629:aload_1         
	// 7298 13630:getfield        #280 <Field int azh.L>
	// 7299 13633:aload_0         
	// 7300 13634:getfield        #12  <Field azh a>
	// 7301 13637:getfield        #175 <Field int azh.bm>
	// 7302 13640:ixor            
	// 7303 13641:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7304 13644:aload_0         
	// 7305 13645:getfield        #12  <Field azh a>
	// 7306 13648:astore_1        
		abyte0.bm = ((azh) (abyte0)).ab & ~a.bm;
	// 7307 13649:aload_1         
	// 7308 13650:aload_1         
	// 7309 13651:getfield        #373 <Field int azh.ab>
	// 7310 13654:aload_0         
	// 7311 13655:getfield        #12  <Field azh a>
	// 7312 13658:getfield        #175 <Field int azh.bm>
	// 7313 13661:iconst_m1       
	// 7314 13662:ixor            
	// 7315 13663:iand            
	// 7316 13664:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7317 13667:aload_0         
	// 7318 13668:getfield        #12  <Field azh a>
	// 7319 13671:astore_1        
		abyte0.bm = ((azh) (abyte0)).aW ^ a.bm;
	// 7320 13672:aload_1         
	// 7321 13673:aload_1         
	// 7322 13674:getfield        #91  <Field int azh.aW>
	// 7323 13677:aload_0         
	// 7324 13678:getfield        #12  <Field azh a>
	// 7325 13681:getfield        #175 <Field int azh.bm>
	// 7326 13684:ixor            
	// 7327 13685:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7328 13688:aload_0         
	// 7329 13689:getfield        #12  <Field azh a>
	// 7330 13692:astore_1        
		abyte0.bm = ((azh) (abyte0)).T & a.bm;
	// 7331 13693:aload_1         
	// 7332 13694:aload_1         
	// 7333 13695:getfield        #444 <Field int azh.T>
	// 7334 13698:aload_0         
	// 7335 13699:getfield        #12  <Field azh a>
	// 7336 13702:getfield        #175 <Field int azh.bm>
	// 7337 13705:iand            
	// 7338 13706:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7339 13709:aload_0         
	// 7340 13710:getfield        #12  <Field azh a>
	// 7341 13713:astore_1        
		abyte0.aW = ((azh) (abyte0)).bo & ~a.h;
	// 7342 13714:aload_1         
	// 7343 13715:aload_1         
	// 7344 13716:getfield        #145 <Field int azh.bo>
	// 7345 13719:aload_0         
	// 7346 13720:getfield        #12  <Field azh a>
	// 7347 13723:getfield        #441 <Field int azh.h>
	// 7348 13726:iconst_m1       
	// 7349 13727:ixor            
	// 7350 13728:iand            
	// 7351 13729:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7352 13732:aload_0         
	// 7353 13733:getfield        #12  <Field azh a>
	// 7354 13736:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & a.ab;
	// 7355 13737:aload_1         
	// 7356 13738:aload_1         
	// 7357 13739:getfield        #91  <Field int azh.aW>
	// 7358 13742:aload_0         
	// 7359 13743:getfield        #12  <Field azh a>
	// 7360 13746:getfield        #373 <Field int azh.ab>
	// 7361 13749:iand            
	// 7362 13750:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7363 13753:aload_0         
	// 7364 13754:getfield        #12  <Field azh a>
	// 7365 13757:astore_1        
		abyte0.bO = ((azh) (abyte0)).h | a.bO;
	// 7366 13758:aload_1         
	// 7367 13759:aload_1         
	// 7368 13760:getfield        #441 <Field int azh.h>
	// 7369 13763:aload_0         
	// 7370 13764:getfield        #12  <Field azh a>
	// 7371 13767:getfield        #187 <Field int azh.bO>
	// 7372 13770:ior             
	// 7373 13771:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 7374 13774:aload_0         
	// 7375 13775:getfield        #12  <Field azh a>
	// 7376 13778:astore_1        
		abyte0.bO = ((azh) (abyte0)).bJ ^ a.bO;
	// 7377 13779:aload_1         
	// 7378 13780:aload_1         
	// 7379 13781:getfield        #41  <Field int azh.bJ>
	// 7380 13784:aload_0         
	// 7381 13785:getfield        #12  <Field azh a>
	// 7382 13788:getfield        #187 <Field int azh.bO>
	// 7383 13791:ixor            
	// 7384 13792:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 7385 13795:aload_0         
	// 7386 13796:getfield        #12  <Field azh a>
	// 7387 13799:astore_1        
		abyte0.bJ = ((azh) (abyte0)).h & ~a.F;
	// 7388 13800:aload_1         
	// 7389 13801:aload_1         
	// 7390 13802:getfield        #441 <Field int azh.h>
	// 7391 13805:aload_0         
	// 7392 13806:getfield        #12  <Field azh a>
	// 7393 13809:getfield        #298 <Field int azh.F>
	// 7394 13812:iconst_m1       
	// 7395 13813:ixor            
	// 7396 13814:iand            
	// 7397 13815:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 7398 13818:aload_0         
	// 7399 13819:getfield        #12  <Field azh a>
	// 7400 13822:astore_1        
		abyte0.bJ = ((azh) (abyte0)).p | a.bJ;
	// 7401 13823:aload_1         
	// 7402 13824:aload_1         
	// 7403 13825:getfield        #283 <Field int azh.p>
	// 7404 13828:aload_0         
	// 7405 13829:getfield        #12  <Field azh a>
	// 7406 13832:getfield        #41  <Field int azh.bJ>
	// 7407 13835:ior             
	// 7408 13836:putfield        #41  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 7409 13839:aload_0         
	// 7410 13840:getfield        #12  <Field azh a>
	// 7411 13843:astore_1        
		abyte0.aY = ((azh) (abyte0)).h & a.aY;
	// 7412 13844:aload_1         
	// 7413 13845:aload_1         
	// 7414 13846:getfield        #441 <Field int azh.h>
	// 7415 13849:aload_0         
	// 7416 13850:getfield        #12  <Field azh a>
	// 7417 13853:getfield        #163 <Field int azh.aY>
	// 7418 13856:iand            
	// 7419 13857:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 7420 13860:aload_0         
	// 7421 13861:getfield        #12  <Field azh a>
	// 7422 13864:astore_1        
		abyte0.aY = ((azh) (abyte0)).L ^ a.aY;
	// 7423 13865:aload_1         
	// 7424 13866:aload_1         
	// 7425 13867:getfield        #280 <Field int azh.L>
	// 7426 13870:aload_0         
	// 7427 13871:getfield        #12  <Field azh a>
	// 7428 13874:getfield        #163 <Field int azh.aY>
	// 7429 13877:ixor            
	// 7430 13878:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 7431 13881:aload_0         
	// 7432 13882:getfield        #12  <Field azh a>
	// 7433 13885:astore_1        
		abyte0.aY = ((azh) (abyte0)).ab & ~a.aY;
	// 7434 13886:aload_1         
	// 7435 13887:aload_1         
	// 7436 13888:getfield        #373 <Field int azh.ab>
	// 7437 13891:aload_0         
	// 7438 13892:getfield        #12  <Field azh a>
	// 7439 13895:getfield        #163 <Field int azh.aY>
	// 7440 13898:iconst_m1       
	// 7441 13899:ixor            
	// 7442 13900:iand            
	// 7443 13901:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 7444 13904:aload_0         
	// 7445 13905:getfield        #12  <Field azh a>
	// 7446 13908:astore_1        
		abyte0.aw = ((azh) (abyte0)).bo & ~a.h;
	// 7447 13909:aload_1         
	// 7448 13910:aload_1         
	// 7449 13911:getfield        #145 <Field int azh.bo>
	// 7450 13914:aload_0         
	// 7451 13915:getfield        #12  <Field azh a>
	// 7452 13918:getfield        #441 <Field int azh.h>
	// 7453 13921:iconst_m1       
	// 7454 13922:ixor            
	// 7455 13923:iand            
	// 7456 13924:putfield        #172 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 7457 13927:aload_0         
	// 7458 13928:getfield        #12  <Field azh a>
	// 7459 13931:astore_1        
		abyte0.aw = ((azh) (abyte0)).ao ^ a.aw;
	// 7460 13932:aload_1         
	// 7461 13933:aload_1         
	// 7462 13934:getfield        #67  <Field int azh.ao>
	// 7463 13937:aload_0         
	// 7464 13938:getfield        #12  <Field azh a>
	// 7465 13941:getfield        #172 <Field int azh.aw>
	// 7466 13944:ixor            
	// 7467 13945:putfield        #172 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 7468 13948:aload_0         
	// 7469 13949:getfield        #12  <Field azh a>
	// 7470 13952:astore_1        
		abyte0.aw = ((azh) (abyte0)).ab & ~a.aw;
	// 7471 13953:aload_1         
	// 7472 13954:aload_1         
	// 7473 13955:getfield        #373 <Field int azh.ab>
	// 7474 13958:aload_0         
	// 7475 13959:getfield        #12  <Field azh a>
	// 7476 13962:getfield        #172 <Field int azh.aw>
	// 7477 13965:iconst_m1       
	// 7478 13966:ixor            
	// 7479 13967:iand            
	// 7480 13968:putfield        #172 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 7481 13971:aload_0         
	// 7482 13972:getfield        #12  <Field azh a>
	// 7483 13975:astore_1        
		abyte0.aw = ((azh) (abyte0)).bO ^ a.aw;
	// 7484 13976:aload_1         
	// 7485 13977:aload_1         
	// 7486 13978:getfield        #187 <Field int azh.bO>
	// 7487 13981:aload_0         
	// 7488 13982:getfield        #12  <Field azh a>
	// 7489 13985:getfield        #172 <Field int azh.aw>
	// 7490 13988:ixor            
	// 7491 13989:putfield        #172 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 7492 13992:aload_0         
	// 7493 13993:getfield        #12  <Field azh a>
	// 7494 13996:astore_1        
		abyte0.bV = ((azh) (abyte0)).h & a.bV;
	// 7495 13997:aload_1         
	// 7496 13998:aload_1         
	// 7497 13999:getfield        #441 <Field int azh.h>
	// 7498 14002:aload_0         
	// 7499 14003:getfield        #12  <Field azh a>
	// 7500 14006:getfield        #26  <Field int azh.bV>
	// 7501 14009:iand            
	// 7502 14010:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 7503 14013:aload_0         
	// 7504 14014:getfield        #12  <Field azh a>
	// 7505 14017:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & a.ab;
	// 7506 14018:aload_1         
	// 7507 14019:aload_1         
	// 7508 14020:getfield        #26  <Field int azh.bV>
	// 7509 14023:aload_0         
	// 7510 14024:getfield        #12  <Field azh a>
	// 7511 14027:getfield        #373 <Field int azh.ab>
	// 7512 14030:iand            
	// 7513 14031:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 7514 14034:aload_0         
	// 7515 14035:getfield        #12  <Field azh a>
	// 7516 14038:astore_1        
		abyte0.bO = ((azh) (abyte0)).aZ & ~a.h;
	// 7517 14039:aload_1         
	// 7518 14040:aload_1         
	// 7519 14041:getfield        #286 <Field int azh.aZ>
	// 7520 14044:aload_0         
	// 7521 14045:getfield        #12  <Field azh a>
	// 7522 14048:getfield        #441 <Field int azh.h>
	// 7523 14051:iconst_m1       
	// 7524 14052:ixor            
	// 7525 14053:iand            
	// 7526 14054:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 7527 14057:aload_0         
	// 7528 14058:getfield        #12  <Field azh a>
	// 7529 14061:astore_1        
		abyte0.bO = ((azh) (abyte0)).bO & ~a.p;
	// 7530 14062:aload_1         
	// 7531 14063:aload_1         
	// 7532 14064:getfield        #187 <Field int azh.bO>
	// 7533 14067:aload_0         
	// 7534 14068:getfield        #12  <Field azh a>
	// 7535 14071:getfield        #283 <Field int azh.p>
	// 7536 14074:iconst_m1       
	// 7537 14075:ixor            
	// 7538 14076:iand            
	// 7539 14077:putfield        #187 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 7540 14080:aload_0         
	// 7541 14081:getfield        #12  <Field azh a>
	// 7542 14084:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & ~a.h;
	// 7543 14085:aload_1         
	// 7544 14086:aload_1         
	// 7545 14087:getfield        #169 <Field int azh.aQ>
	// 7546 14090:aload_0         
	// 7547 14091:getfield        #12  <Field azh a>
	// 7548 14094:getfield        #441 <Field int azh.h>
	// 7549 14097:iconst_m1       
	// 7550 14098:ixor            
	// 7551 14099:iand            
	// 7552 14100:putfield        #169 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 7553 14103:aload_0         
	// 7554 14104:getfield        #12  <Field azh a>
	// 7555 14107:astore_1        
		abyte0.aW = ((azh) (abyte0)).aQ ^ a.aW;
	// 7556 14108:aload_1         
	// 7557 14109:aload_1         
	// 7558 14110:getfield        #169 <Field int azh.aQ>
	// 7559 14113:aload_0         
	// 7560 14114:getfield        #12  <Field azh a>
	// 7561 14117:getfield        #91  <Field int azh.aW>
	// 7562 14120:ixor            
	// 7563 14121:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7564 14124:aload_0         
	// 7565 14125:getfield        #12  <Field azh a>
	// 7566 14128:astore_1        
		abyte0.aW = ((azh) (abyte0)).T & ~a.aW;
	// 7567 14129:aload_1         
	// 7568 14130:aload_1         
	// 7569 14131:getfield        #444 <Field int azh.T>
	// 7570 14134:aload_0         
	// 7571 14135:getfield        #12  <Field azh a>
	// 7572 14138:getfield        #91  <Field int azh.aW>
	// 7573 14141:iconst_m1       
	// 7574 14142:ixor            
	// 7575 14143:iand            
	// 7576 14144:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7577 14147:aload_0         
	// 7578 14148:getfield        #12  <Field azh a>
	// 7579 14151:astore_1        
		abyte0.aW = ((azh) (abyte0)).aw ^ a.aW;
	// 7580 14152:aload_1         
	// 7581 14153:aload_1         
	// 7582 14154:getfield        #172 <Field int azh.aw>
	// 7583 14157:aload_0         
	// 7584 14158:getfield        #12  <Field azh a>
	// 7585 14161:getfield        #91  <Field int azh.aW>
	// 7586 14164:ixor            
	// 7587 14165:putfield        #91  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7588 14168:aload_0         
	// 7589 14169:getfield        #12  <Field azh a>
	// 7590 14172:astore_1        
		abyte0.c = ((azh) (abyte0)).aW ^ a.c;
	// 7591 14173:aload_1         
	// 7592 14174:aload_1         
	// 7593 14175:getfield        #91  <Field int azh.aW>
	// 7594 14178:aload_0         
	// 7595 14179:getfield        #12  <Field azh a>
	// 7596 14182:getfield        #244 <Field int azh.c>
	// 7597 14185:ixor            
	// 7598 14186:putfield        #244 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7599 14189:aload_0         
	// 7600 14190:getfield        #12  <Field azh a>
	// 7601 14193:astore_1        
		abyte0.at = ((azh) (abyte0)).at | a.h;
	// 7602 14194:aload_1         
	// 7603 14195:aload_1         
	// 7604 14196:getfield        #44  <Field int azh.at>
	// 7605 14199:aload_0         
	// 7606 14200:getfield        #12  <Field azh a>
	// 7607 14203:getfield        #441 <Field int azh.h>
	// 7608 14206:ior             
	// 7609 14207:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7610 14210:aload_0         
	// 7611 14211:getfield        #12  <Field azh a>
	// 7612 14214:astore_1        
		abyte0.at = ((azh) (abyte0)).bZ ^ a.at;
	// 7613 14215:aload_1         
	// 7614 14216:aload_1         
	// 7615 14217:getfield        #76  <Field int azh.bZ>
	// 7616 14220:aload_0         
	// 7617 14221:getfield        #12  <Field azh a>
	// 7618 14224:getfield        #44  <Field int azh.at>
	// 7619 14227:ixor            
	// 7620 14228:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7621 14231:aload_0         
	// 7622 14232:getfield        #12  <Field azh a>
	// 7623 14235:astore_1        
		abyte0.ag = ((azh) (abyte0)).at ^ a.ag;
	// 7624 14236:aload_1         
	// 7625 14237:aload_1         
	// 7626 14238:getfield        #44  <Field int azh.at>
	// 7627 14241:aload_0         
	// 7628 14242:getfield        #12  <Field azh a>
	// 7629 14245:getfield        #29  <Field int azh.ag>
	// 7630 14248:ixor            
	// 7631 14249:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7632 14252:aload_0         
	// 7633 14253:getfield        #12  <Field azh a>
	// 7634 14256:astore_1        
		abyte0.bm = ((azh) (abyte0)).ag ^ a.bm;
	// 7635 14257:aload_1         
	// 7636 14258:aload_1         
	// 7637 14259:getfield        #29  <Field int azh.ag>
	// 7638 14262:aload_0         
	// 7639 14263:getfield        #12  <Field azh a>
	// 7640 14266:getfield        #175 <Field int azh.bm>
	// 7641 14269:ixor            
	// 7642 14270:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7643 14273:aload_0         
	// 7644 14274:getfield        #12  <Field azh a>
	// 7645 14277:astore_1        
		abyte0.q = ((azh) (abyte0)).bm ^ a.q;
	// 7646 14278:aload_1         
	// 7647 14279:aload_1         
	// 7648 14280:getfield        #175 <Field int azh.bm>
	// 7649 14283:aload_0         
	// 7650 14284:getfield        #12  <Field azh a>
	// 7651 14287:getfield        #259 <Field int azh.q>
	// 7652 14290:ixor            
	// 7653 14291:putfield        #259 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 7654 14294:aload_0         
	// 7655 14295:getfield        #12  <Field azh a>
	// 7656 14298:astore_1        
		abyte0.bw = ((azh) (abyte0)).h & ~a.bw;
	// 7657 14299:aload_1         
	// 7658 14300:aload_1         
	// 7659 14301:getfield        #441 <Field int azh.h>
	// 7660 14304:aload_0         
	// 7661 14305:getfield        #12  <Field azh a>
	// 7662 14308:getfield        #85  <Field int azh.bw>
	// 7663 14311:iconst_m1       
	// 7664 14312:ixor            
	// 7665 14313:iand            
	// 7666 14314:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 7667 14317:aload_0         
	// 7668 14318:getfield        #12  <Field azh a>
	// 7669 14321:astore_1        
		abyte0.bw = ((azh) (abyte0)).L ^ a.bw;
	// 7670 14322:aload_1         
	// 7671 14323:aload_1         
	// 7672 14324:getfield        #280 <Field int azh.L>
	// 7673 14327:aload_0         
	// 7674 14328:getfield        #12  <Field azh a>
	// 7675 14331:getfield        #85  <Field int azh.bw>
	// 7676 14334:ixor            
	// 7677 14335:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 7678 14338:aload_0         
	// 7679 14339:getfield        #12  <Field azh a>
	// 7680 14342:astore_1        
		abyte0.bV = ((azh) (abyte0)).bw ^ a.bV;
	// 7681 14343:aload_1         
	// 7682 14344:aload_1         
	// 7683 14345:getfield        #85  <Field int azh.bw>
	// 7684 14348:aload_0         
	// 7685 14349:getfield        #12  <Field azh a>
	// 7686 14352:getfield        #26  <Field int azh.bV>
	// 7687 14355:ixor            
	// 7688 14356:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 7689 14359:aload_0         
	// 7690 14360:getfield        #12  <Field azh a>
	// 7691 14363:astore_1        
		abyte0.bV = ((azh) (abyte0)).T & a.bV;
	// 7692 14364:aload_1         
	// 7693 14365:aload_1         
	// 7694 14366:getfield        #444 <Field int azh.T>
	// 7695 14369:aload_0         
	// 7696 14370:getfield        #12  <Field azh a>
	// 7697 14373:getfield        #26  <Field int azh.bV>
	// 7698 14376:iand            
	// 7699 14377:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 7700 14380:aload_0         
	// 7701 14381:getfield        #12  <Field azh a>
	// 7702 14384:astore_1        
		abyte0.bo = ((azh) (abyte0)).h | a.bo;
	// 7703 14385:aload_1         
	// 7704 14386:aload_1         
	// 7705 14387:getfield        #441 <Field int azh.h>
	// 7706 14390:aload_0         
	// 7707 14391:getfield        #12  <Field azh a>
	// 7708 14394:getfield        #145 <Field int azh.bo>
	// 7709 14397:ior             
	// 7710 14398:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7711 14401:aload_0         
	// 7712 14402:getfield        #12  <Field azh a>
	// 7713 14405:astore_1        
		abyte0.bo = ((azh) (abyte0)).bj ^ a.bo;
	// 7714 14406:aload_1         
	// 7715 14407:aload_1         
	// 7716 14408:getfield        #250 <Field int azh.bj>
	// 7717 14411:aload_0         
	// 7718 14412:getfield        #12  <Field azh a>
	// 7719 14415:getfield        #145 <Field int azh.bo>
	// 7720 14418:ixor            
	// 7721 14419:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7722 14422:aload_0         
	// 7723 14423:getfield        #12  <Field azh a>
	// 7724 14426:astore_1        
		abyte0.bo = ((azh) (abyte0)).ab & ~a.bo;
	// 7725 14427:aload_1         
	// 7726 14428:aload_1         
	// 7727 14429:getfield        #373 <Field int azh.ab>
	// 7728 14432:aload_0         
	// 7729 14433:getfield        #12  <Field azh a>
	// 7730 14436:getfield        #145 <Field int azh.bo>
	// 7731 14439:iconst_m1       
	// 7732 14440:ixor            
	// 7733 14441:iand            
	// 7734 14442:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7735 14445:aload_0         
	// 7736 14446:getfield        #12  <Field azh a>
	// 7737 14449:astore_1        
		abyte0.bo = ((azh) (abyte0)).bC ^ a.bo;
	// 7738 14450:aload_1         
	// 7739 14451:aload_1         
	// 7740 14452:getfield        #208 <Field int azh.bC>
	// 7741 14455:aload_0         
	// 7742 14456:getfield        #12  <Field azh a>
	// 7743 14459:getfield        #145 <Field int azh.bo>
	// 7744 14462:ixor            
	// 7745 14463:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7746 14466:aload_0         
	// 7747 14467:getfield        #12  <Field azh a>
	// 7748 14470:astore_1        
		abyte0.bo = ((azh) (abyte0)).T & ~a.bo;
	// 7749 14471:aload_1         
	// 7750 14472:aload_1         
	// 7751 14473:getfield        #444 <Field int azh.T>
	// 7752 14476:aload_0         
	// 7753 14477:getfield        #12  <Field azh a>
	// 7754 14480:getfield        #145 <Field int azh.bo>
	// 7755 14483:iconst_m1       
	// 7756 14484:ixor            
	// 7757 14485:iand            
	// 7758 14486:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7759 14489:aload_0         
	// 7760 14490:getfield        #12  <Field azh a>
	// 7761 14493:astore_1        
		abyte0.bp = ((azh) (abyte0)).h & a.bp;
	// 7762 14494:aload_1         
	// 7763 14495:aload_1         
	// 7764 14496:getfield        #441 <Field int azh.h>
	// 7765 14499:aload_0         
	// 7766 14500:getfield        #12  <Field azh a>
	// 7767 14503:getfield        #193 <Field int azh.bp>
	// 7768 14506:iand            
	// 7769 14507:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 7770 14510:aload_0         
	// 7771 14511:getfield        #12  <Field azh a>
	// 7772 14514:astore_1        
		abyte0.bp = ((azh) (abyte0)).ba ^ a.bp;
	// 7773 14515:aload_1         
	// 7774 14516:aload_1         
	// 7775 14517:getfield        #271 <Field int azh.ba>
	// 7776 14520:aload_0         
	// 7777 14521:getfield        #12  <Field azh a>
	// 7778 14524:getfield        #193 <Field int azh.bp>
	// 7779 14527:ixor            
	// 7780 14528:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 7781 14531:aload_0         
	// 7782 14532:getfield        #12  <Field azh a>
	// 7783 14535:astore_1        
		abyte0.aY = ((azh) (abyte0)).bp ^ a.aY;
	// 7784 14536:aload_1         
	// 7785 14537:aload_1         
	// 7786 14538:getfield        #193 <Field int azh.bp>
	// 7787 14541:aload_0         
	// 7788 14542:getfield        #12  <Field azh a>
	// 7789 14545:getfield        #163 <Field int azh.aY>
	// 7790 14548:ixor            
	// 7791 14549:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 7792 14552:aload_0         
	// 7793 14553:getfield        #12  <Field azh a>
	// 7794 14556:astore_1        
		abyte0.bV = ((azh) (abyte0)).aY ^ a.bV;
	// 7795 14557:aload_1         
	// 7796 14558:aload_1         
	// 7797 14559:getfield        #163 <Field int azh.aY>
	// 7798 14562:aload_0         
	// 7799 14563:getfield        #12  <Field azh a>
	// 7800 14566:getfield        #26  <Field int azh.bV>
	// 7801 14569:ixor            
	// 7802 14570:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 7803 14573:aload_0         
	// 7804 14574:getfield        #12  <Field azh a>
	// 7805 14577:astore_1        
		abyte0.w = ((azh) (abyte0)).bV ^ a.w;
	// 7806 14578:aload_1         
	// 7807 14579:aload_1         
	// 7808 14580:getfield        #26  <Field int azh.bV>
	// 7809 14583:aload_0         
	// 7810 14584:getfield        #12  <Field azh a>
	// 7811 14587:getfield        #447 <Field int azh.w>
	// 7812 14590:ixor            
	// 7813 14591:putfield        #447 <Field int azh.w>
		abyte0 = ((byte []) (a));
	// 7814 14594:aload_0         
	// 7815 14595:getfield        #12  <Field azh a>
	// 7816 14598:astore_1        
		abyte0.ba = ((azh) (abyte0)).ba ^ a.h;
	// 7817 14599:aload_1         
	// 7818 14600:aload_1         
	// 7819 14601:getfield        #271 <Field int azh.ba>
	// 7820 14604:aload_0         
	// 7821 14605:getfield        #12  <Field azh a>
	// 7822 14608:getfield        #441 <Field int azh.h>
	// 7823 14611:ixor            
	// 7824 14612:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7825 14615:aload_0         
	// 7826 14616:getfield        #12  <Field azh a>
	// 7827 14619:astore_1        
		abyte0.bx = ((azh) (abyte0)).ba ^ a.bx;
	// 7828 14620:aload_1         
	// 7829 14621:aload_1         
	// 7830 14622:getfield        #271 <Field int azh.ba>
	// 7831 14625:aload_0         
	// 7832 14626:getfield        #12  <Field azh a>
	// 7833 14629:getfield        #70  <Field int azh.bx>
	// 7834 14632:ixor            
	// 7835 14633:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7836 14636:aload_0         
	// 7837 14637:getfield        #12  <Field azh a>
	// 7838 14640:astore_1        
		abyte0.bo = ((azh) (abyte0)).bx ^ a.bo;
	// 7839 14641:aload_1         
	// 7840 14642:aload_1         
	// 7841 14643:getfield        #70  <Field int azh.bx>
	// 7842 14646:aload_0         
	// 7843 14647:getfield        #12  <Field azh a>
	// 7844 14650:getfield        #145 <Field int azh.bo>
	// 7845 14653:ixor            
	// 7846 14654:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7847 14657:aload_0         
	// 7848 14658:getfield        #12  <Field azh a>
	// 7849 14661:astore_1        
		abyte0.e = ((azh) (abyte0)).bo ^ a.e;
	// 7850 14662:aload_1         
	// 7851 14663:aload_1         
	// 7852 14664:getfield        #145 <Field int azh.bo>
	// 7853 14667:aload_0         
	// 7854 14668:getfield        #12  <Field azh a>
	// 7855 14671:getfield        #355 <Field int azh.e>
	// 7856 14674:ixor            
	// 7857 14675:putfield        #355 <Field int azh.e>
		abyte0 = ((byte []) (a));
	// 7858 14678:aload_0         
	// 7859 14679:getfield        #12  <Field azh a>
	// 7860 14682:astore_1        
		abyte0.s = ((azh) (abyte0)).Q & a.s;
	// 7861 14683:aload_1         
	// 7862 14684:aload_1         
	// 7863 14685:getfield        #388 <Field int azh.Q>
	// 7864 14688:aload_0         
	// 7865 14689:getfield        #12  <Field azh a>
	// 7866 14692:getfield        #450 <Field int azh.s>
	// 7867 14695:iand            
	// 7868 14696:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 7869 14699:aload_0         
	// 7870 14700:getfield        #12  <Field azh a>
	// 7871 14703:astore_1        
		abyte0.s = ((azh) (abyte0)).Y ^ a.s;
	// 7872 14704:aload_1         
	// 7873 14705:aload_1         
	// 7874 14706:getfield        #412 <Field int azh.Y>
	// 7875 14709:aload_0         
	// 7876 14710:getfield        #12  <Field azh a>
	// 7877 14713:getfield        #450 <Field int azh.s>
	// 7878 14716:ixor            
	// 7879 14717:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 7880 14720:aload_0         
	// 7881 14721:getfield        #12  <Field azh a>
	// 7882 14724:astore_1        
		abyte0.s = ((azh) (abyte0)).bu & a.s;
	// 7883 14725:aload_1         
	// 7884 14726:aload_1         
	// 7885 14727:getfield        #367 <Field int azh.bu>
	// 7886 14730:aload_0         
	// 7887 14731:getfield        #12  <Field azh a>
	// 7888 14734:getfield        #450 <Field int azh.s>
	// 7889 14737:iand            
	// 7890 14738:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 7891 14741:aload_0         
	// 7892 14742:getfield        #12  <Field azh a>
	// 7893 14745:astore_1        
		abyte0.s = ((azh) (abyte0)).am ^ a.s;
	// 7894 14746:aload_1         
	// 7895 14747:aload_1         
	// 7896 14748:getfield        #409 <Field int azh.am>
	// 7897 14751:aload_0         
	// 7898 14752:getfield        #12  <Field azh a>
	// 7899 14755:getfield        #450 <Field int azh.s>
	// 7900 14758:ixor            
	// 7901 14759:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 7902 14762:aload_0         
	// 7903 14763:getfield        #12  <Field azh a>
	// 7904 14766:astore_1        
		abyte0.bK = ((azh) (abyte0)).Q & ~a.bK;
	// 7905 14767:aload_1         
	// 7906 14768:aload_1         
	// 7907 14769:getfield        #388 <Field int azh.Q>
	// 7908 14772:aload_0         
	// 7909 14773:getfield        #12  <Field azh a>
	// 7910 14776:getfield        #453 <Field int azh.bK>
	// 7911 14779:iconst_m1       
	// 7912 14780:ixor            
	// 7913 14781:iand            
	// 7914 14782:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 7915 14785:aload_0         
	// 7916 14786:getfield        #12  <Field azh a>
	// 7917 14789:astore_1        
		abyte0.bK = ((azh) (abyte0)).bB ^ a.bK;
	// 7918 14790:aload_1         
	// 7919 14791:aload_1         
	// 7920 14792:getfield        #456 <Field int azh.bB>
	// 7921 14795:aload_0         
	// 7922 14796:getfield        #12  <Field azh a>
	// 7923 14799:getfield        #453 <Field int azh.bK>
	// 7924 14802:ixor            
	// 7925 14803:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 7926 14806:aload_0         
	// 7927 14807:getfield        #12  <Field azh a>
	// 7928 14810:astore_1        
		abyte0.bK = ((azh) (abyte0)).bu & a.bK;
	// 7929 14811:aload_1         
	// 7930 14812:aload_1         
	// 7931 14813:getfield        #367 <Field int azh.bu>
	// 7932 14816:aload_0         
	// 7933 14817:getfield        #12  <Field azh a>
	// 7934 14820:getfield        #453 <Field int azh.bK>
	// 7935 14823:iand            
	// 7936 14824:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 7937 14827:aload_0         
	// 7938 14828:getfield        #12  <Field azh a>
	// 7939 14831:astore_1        
		abyte0.cc = ((azh) (abyte0)).Q & ~a.cc;
	// 7940 14832:aload_1         
	// 7941 14833:aload_1         
	// 7942 14834:getfield        #388 <Field int azh.Q>
	// 7943 14837:aload_0         
	// 7944 14838:getfield        #12  <Field azh a>
	// 7945 14841:getfield        #459 <Field int azh.cc>
	// 7946 14844:iconst_m1       
	// 7947 14845:ixor            
	// 7948 14846:iand            
	// 7949 14847:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7950 14850:aload_0         
	// 7951 14851:getfield        #12  <Field azh a>
	// 7952 14854:astore_1        
		abyte0.cc = ((azh) (abyte0)).bN ^ a.cc;
	// 7953 14855:aload_1         
	// 7954 14856:aload_1         
	// 7955 14857:getfield        #432 <Field int azh.bN>
	// 7956 14860:aload_0         
	// 7957 14861:getfield        #12  <Field azh a>
	// 7958 14864:getfield        #459 <Field int azh.cc>
	// 7959 14867:ixor            
	// 7960 14868:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7961 14871:aload_0         
	// 7962 14872:getfield        #12  <Field azh a>
	// 7963 14875:astore_1        
		abyte0.bK = ((azh) (abyte0)).cc ^ a.bK;
	// 7964 14876:aload_1         
	// 7965 14877:aload_1         
	// 7966 14878:getfield        #459 <Field int azh.cc>
	// 7967 14881:aload_0         
	// 7968 14882:getfield        #12  <Field azh a>
	// 7969 14885:getfield        #453 <Field int azh.bK>
	// 7970 14888:ixor            
	// 7971 14889:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 7972 14892:aload_0         
	// 7973 14893:getfield        #12  <Field azh a>
	// 7974 14896:astore_1        
		abyte0.bK = ((azh) (abyte0)).bK | a.I;
	// 7975 14897:aload_1         
	// 7976 14898:aload_1         
	// 7977 14899:getfield        #453 <Field int azh.bK>
	// 7978 14902:aload_0         
	// 7979 14903:getfield        #12  <Field azh a>
	// 7980 14906:getfield        #429 <Field int azh.I>
	// 7981 14909:ior             
	// 7982 14910:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 7983 14913:aload_0         
	// 7984 14914:getfield        #12  <Field azh a>
	// 7985 14917:astore_1        
		abyte0.bK = ((azh) (abyte0)).s ^ a.bK;
	// 7986 14918:aload_1         
	// 7987 14919:aload_1         
	// 7988 14920:getfield        #450 <Field int azh.s>
	// 7989 14923:aload_0         
	// 7990 14924:getfield        #12  <Field azh a>
	// 7991 14927:getfield        #453 <Field int azh.bK>
	// 7992 14930:ixor            
	// 7993 14931:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 7994 14934:aload_0         
	// 7995 14935:getfield        #12  <Field azh a>
	// 7996 14938:astore_1        
		abyte0.V = ((azh) (abyte0)).bK ^ a.V;
	// 7997 14939:aload_1         
	// 7998 14940:aload_1         
	// 7999 14941:getfield        #453 <Field int azh.bK>
	// 8000 14944:aload_0         
	// 8001 14945:getfield        #12  <Field azh a>
	// 8002 14948:getfield        #462 <Field int azh.V>
	// 8003 14951:ixor            
	// 8004 14952:putfield        #462 <Field int azh.V>
		abyte0 = ((byte []) (a));
	// 8005 14955:aload_0         
	// 8006 14956:getfield        #12  <Field azh a>
	// 8007 14959:astore_1        
		abyte0.ae = ((azh) (abyte0)).V & a.ae;
	// 8008 14960:aload_1         
	// 8009 14961:aload_1         
	// 8010 14962:getfield        #462 <Field int azh.V>
	// 8011 14965:aload_0         
	// 8012 14966:getfield        #12  <Field azh a>
	// 8013 14969:getfield        #217 <Field int azh.ae>
	// 8014 14972:iand            
	// 8015 14973:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 8016 14976:aload_0         
	// 8017 14977:getfield        #12  <Field azh a>
	// 8018 14980:astore_1        
		abyte0.ae = ((azh) (abyte0)).R ^ a.ae;
	// 8019 14981:aload_1         
	// 8020 14982:aload_1         
	// 8021 14983:getfield        #346 <Field int azh.R>
	// 8022 14986:aload_0         
	// 8023 14987:getfield        #12  <Field azh a>
	// 8024 14990:getfield        #217 <Field int azh.ae>
	// 8025 14993:ixor            
	// 8026 14994:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 8027 14997:aload_0         
	// 8028 14998:getfield        #12  <Field azh a>
	// 8029 15001:astore_1        
		abyte0.ae = ((azh) (abyte0)).ae ^ a.ai;
	// 8030 15002:aload_1         
	// 8031 15003:aload_1         
	// 8032 15004:getfield        #217 <Field int azh.ae>
	// 8033 15007:aload_0         
	// 8034 15008:getfield        #12  <Field azh a>
	// 8035 15011:getfield        #151 <Field int azh.ai>
	// 8036 15014:ixor            
	// 8037 15015:putfield        #217 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 8038 15018:aload_0         
	// 8039 15019:getfield        #12  <Field azh a>
	// 8040 15022:astore_1        
		abyte0.aF = ((azh) (abyte0)).V & ~a.aF;
	// 8041 15023:aload_1         
	// 8042 15024:aload_1         
	// 8043 15025:getfield        #462 <Field int azh.V>
	// 8044 15028:aload_0         
	// 8045 15029:getfield        #12  <Field azh a>
	// 8046 15032:getfield        #328 <Field int azh.aF>
	// 8047 15035:iconst_m1       
	// 8048 15036:ixor            
	// 8049 15037:iand            
	// 8050 15038:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 8051 15041:aload_0         
	// 8052 15042:getfield        #12  <Field azh a>
	// 8053 15045:astore_1        
		abyte0.aF = ((azh) (abyte0)).bd ^ a.aF;
	// 8054 15046:aload_1         
	// 8055 15047:aload_1         
	// 8056 15048:getfield        #121 <Field int azh.bd>
	// 8057 15051:aload_0         
	// 8058 15052:getfield        #12  <Field azh a>
	// 8059 15055:getfield        #328 <Field int azh.aF>
	// 8060 15058:ixor            
	// 8061 15059:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 8062 15062:aload_0         
	// 8063 15063:getfield        #12  <Field azh a>
	// 8064 15066:astore_1        
		abyte0.i = ((azh) (abyte0)).aF ^ a.i;
	// 8065 15067:aload_1         
	// 8066 15068:aload_1         
	// 8067 15069:getfield        #328 <Field int azh.aF>
	// 8068 15072:aload_0         
	// 8069 15073:getfield        #12  <Field azh a>
	// 8070 15076:getfield        #265 <Field int azh.i>
	// 8071 15079:ixor            
	// 8072 15080:putfield        #265 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8073 15083:aload_0         
	// 8074 15084:getfield        #12  <Field azh a>
	// 8075 15087:astore_1        
		abyte0.av = ((azh) (abyte0)).V & a.av;
	// 8076 15088:aload_1         
	// 8077 15089:aload_1         
	// 8078 15090:getfield        #462 <Field int azh.V>
	// 8079 15093:aload_0         
	// 8080 15094:getfield        #12  <Field azh a>
	// 8081 15097:getfield        #292 <Field int azh.av>
	// 8082 15100:iand            
	// 8083 15101:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8084 15104:aload_0         
	// 8085 15105:getfield        #12  <Field azh a>
	// 8086 15108:astore_1        
		abyte0.av = ((azh) (abyte0)).bn ^ a.av;
	// 8087 15109:aload_1         
	// 8088 15110:aload_1         
	// 8089 15111:getfield        #313 <Field int azh.bn>
	// 8090 15114:aload_0         
	// 8091 15115:getfield        #12  <Field azh a>
	// 8092 15118:getfield        #292 <Field int azh.av>
	// 8093 15121:ixor            
	// 8094 15122:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8095 15125:aload_0         
	// 8096 15126:getfield        #12  <Field azh a>
	// 8097 15129:astore_1        
		abyte0.bu = ((azh) (abyte0)).av ^ a.bu;
	// 8098 15130:aload_1         
	// 8099 15131:aload_1         
	// 8100 15132:getfield        #292 <Field int azh.av>
	// 8101 15135:aload_0         
	// 8102 15136:getfield        #12  <Field azh a>
	// 8103 15139:getfield        #367 <Field int azh.bu>
	// 8104 15142:ixor            
	// 8105 15143:putfield        #367 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 8106 15146:aload_0         
	// 8107 15147:getfield        #12  <Field azh a>
	// 8108 15150:astore_1        
		abyte0.bS = ((azh) (abyte0)).V & ~a.bS;
	// 8109 15151:aload_1         
	// 8110 15152:aload_1         
	// 8111 15153:getfield        #462 <Field int azh.V>
	// 8112 15156:aload_0         
	// 8113 15157:getfield        #12  <Field azh a>
	// 8114 15160:getfield        #319 <Field int azh.bS>
	// 8115 15163:iconst_m1       
	// 8116 15164:ixor            
	// 8117 15165:iand            
	// 8118 15166:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8119 15169:aload_0         
	// 8120 15170:getfield        #12  <Field azh a>
	// 8121 15173:astore_1        
		abyte0.bS = ((azh) (abyte0)).bQ ^ a.bS;
	// 8122 15174:aload_1         
	// 8123 15175:aload_1         
	// 8124 15176:getfield        #307 <Field int azh.bQ>
	// 8125 15179:aload_0         
	// 8126 15180:getfield        #12  <Field azh a>
	// 8127 15183:getfield        #319 <Field int azh.bS>
	// 8128 15186:ixor            
	// 8129 15187:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8130 15190:aload_0         
	// 8131 15191:getfield        #12  <Field azh a>
	// 8132 15194:astore_1        
		abyte0.k = ((azh) (abyte0)).bS ^ a.k;
	// 8133 15195:aload_1         
	// 8134 15196:aload_1         
	// 8135 15197:getfield        #319 <Field int azh.bS>
	// 8136 15200:aload_0         
	// 8137 15201:getfield        #12  <Field azh a>
	// 8138 15204:getfield        #465 <Field int azh.k>
	// 8139 15207:ixor            
	// 8140 15208:putfield        #465 <Field int azh.k>
		abyte0 = ((byte []) (a));
	// 8141 15211:aload_0         
	// 8142 15212:getfield        #12  <Field azh a>
	// 8143 15215:astore_1        
		abyte0.bq = ((azh) (abyte0)).Q & a.bq;
	// 8144 15216:aload_1         
	// 8145 15217:aload_1         
	// 8146 15218:getfield        #388 <Field int azh.Q>
	// 8147 15221:aload_0         
	// 8148 15222:getfield        #12  <Field azh a>
	// 8149 15225:getfield        #468 <Field int azh.bq>
	// 8150 15228:iand            
	// 8151 15229:putfield        #468 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8152 15232:aload_0         
	// 8153 15233:getfield        #12  <Field azh a>
	// 8154 15236:astore_1        
		abyte0.bq = ((azh) (abyte0)).bh ^ a.bq;
	// 8155 15237:aload_1         
	// 8156 15238:aload_1         
	// 8157 15239:getfield        #403 <Field int azh.bh>
	// 8158 15242:aload_0         
	// 8159 15243:getfield        #12  <Field azh a>
	// 8160 15246:getfield        #468 <Field int azh.bq>
	// 8161 15249:ixor            
	// 8162 15250:putfield        #468 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8163 15253:aload_0         
	// 8164 15254:getfield        #12  <Field azh a>
	// 8165 15257:astore_1        
		abyte0.bq = ((azh) (abyte0)).I | a.bq;
	// 8166 15258:aload_1         
	// 8167 15259:aload_1         
	// 8168 15260:getfield        #429 <Field int azh.I>
	// 8169 15263:aload_0         
	// 8170 15264:getfield        #12  <Field azh a>
	// 8171 15267:getfield        #468 <Field int azh.bq>
	// 8172 15270:ior             
	// 8173 15271:putfield        #468 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8174 15274:aload_0         
	// 8175 15275:getfield        #12  <Field azh a>
	// 8176 15278:astore_1        
		abyte0.bq = ((azh) (abyte0)).as ^ a.bq;
	// 8177 15279:aload_1         
	// 8178 15280:aload_1         
	// 8179 15281:getfield        #435 <Field int azh.as>
	// 8180 15284:aload_0         
	// 8181 15285:getfield        #12  <Field azh a>
	// 8182 15288:getfield        #468 <Field int azh.bq>
	// 8183 15291:ixor            
	// 8184 15292:putfield        #468 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8185 15295:aload_0         
	// 8186 15296:getfield        #12  <Field azh a>
	// 8187 15299:astore_1        
		abyte0.v = ((azh) (abyte0)).bq ^ a.v;
	// 8188 15300:aload_1         
	// 8189 15301:aload_1         
	// 8190 15302:getfield        #468 <Field int azh.bq>
	// 8191 15305:aload_0         
	// 8192 15306:getfield        #12  <Field azh a>
	// 8193 15309:getfield        #471 <Field int azh.v>
	// 8194 15312:ixor            
	// 8195 15313:putfield        #471 <Field int azh.v>
		abyte0 = ((byte []) (a));
	// 8196 15316:aload_0         
	// 8197 15317:getfield        #12  <Field azh a>
	// 8198 15320:astore_1        
		abyte0.bq = ((azh) (abyte0)).aG & ~a.v;
	// 8199 15321:aload_1         
	// 8200 15322:aload_1         
	// 8201 15323:getfield        #337 <Field int azh.aG>
	// 8202 15326:aload_0         
	// 8203 15327:getfield        #12  <Field azh a>
	// 8204 15330:getfield        #471 <Field int azh.v>
	// 8205 15333:iconst_m1       
	// 8206 15334:ixor            
	// 8207 15335:iand            
	// 8208 15336:putfield        #468 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8209 15339:aload_0         
	// 8210 15340:getfield        #12  <Field azh a>
	// 8211 15343:astore_1        
		abyte0.as = ((azh) (abyte0)).aG & a.v;
	// 8212 15344:aload_1         
	// 8213 15345:aload_1         
	// 8214 15346:getfield        #337 <Field int azh.aG>
	// 8215 15349:aload_0         
	// 8216 15350:getfield        #12  <Field azh a>
	// 8217 15353:getfield        #471 <Field int azh.v>
	// 8218 15356:iand            
	// 8219 15357:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 8220 15360:aload_0         
	// 8221 15361:getfield        #12  <Field azh a>
	// 8222 15364:astore_1        
		abyte0.as = ((azh) (abyte0)).v ^ a.as;
	// 8223 15365:aload_1         
	// 8224 15366:aload_1         
	// 8225 15367:getfield        #471 <Field int azh.v>
	// 8226 15370:aload_0         
	// 8227 15371:getfield        #12  <Field azh a>
	// 8228 15374:getfield        #435 <Field int azh.as>
	// 8229 15377:ixor            
	// 8230 15378:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 8231 15381:aload_0         
	// 8232 15382:getfield        #12  <Field azh a>
	// 8233 15385:astore_1        
		abyte0.as = ((azh) (abyte0)).D | a.as;
	// 8234 15386:aload_1         
	// 8235 15387:aload_1         
	// 8236 15388:getfield        #211 <Field int azh.D>
	// 8237 15391:aload_0         
	// 8238 15392:getfield        #12  <Field azh a>
	// 8239 15395:getfield        #435 <Field int azh.as>
	// 8240 15398:ior             
	// 8241 15399:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 8242 15402:aload_0         
	// 8243 15403:getfield        #12  <Field azh a>
	// 8244 15406:astore_1        
		abyte0.n = ((azh) (abyte0)).B ^ a.n;
	// 8245 15407:aload_1         
	// 8246 15408:aload_1         
	// 8247 15409:getfield        #118 <Field int azh.B>
	// 8248 15412:aload_0         
	// 8249 15413:getfield        #12  <Field azh a>
	// 8250 15416:getfield        #474 <Field int azh.n>
	// 8251 15419:ixor            
	// 8252 15420:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8253 15423:aload_0         
	// 8254 15424:getfield        #12  <Field azh a>
	// 8255 15427:astore_1        
		abyte0.B = ((azh) (abyte0)).n & ~a.d;
	// 8256 15428:aload_1         
	// 8257 15429:aload_1         
	// 8258 15430:getfield        #474 <Field int azh.n>
	// 8259 15433:aload_0         
	// 8260 15434:getfield        #12  <Field azh a>
	// 8261 15437:getfield        #127 <Field int azh.d>
	// 8262 15440:iconst_m1       
	// 8263 15441:ixor            
	// 8264 15442:iand            
	// 8265 15443:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8266 15446:aload_0         
	// 8267 15447:getfield        #12  <Field azh a>
	// 8268 15450:astore_1        
		abyte0.B = ((azh) (abyte0)).n ^ a.B;
	// 8269 15451:aload_1         
	// 8270 15452:aload_1         
	// 8271 15453:getfield        #474 <Field int azh.n>
	// 8272 15456:aload_0         
	// 8273 15457:getfield        #12  <Field azh a>
	// 8274 15460:getfield        #118 <Field int azh.B>
	// 8275 15463:ixor            
	// 8276 15464:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8277 15467:aload_0         
	// 8278 15468:getfield        #12  <Field azh a>
	// 8279 15471:astore_1        
		abyte0.B = ((azh) (abyte0)).l | a.B;
	// 8280 15472:aload_1         
	// 8281 15473:aload_1         
	// 8282 15474:getfield        #35  <Field int azh.l>
	// 8283 15477:aload_0         
	// 8284 15478:getfield        #12  <Field azh a>
	// 8285 15481:getfield        #118 <Field int azh.B>
	// 8286 15484:ior             
	// 8287 15485:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8288 15488:aload_0         
	// 8289 15489:getfield        #12  <Field azh a>
	// 8290 15492:astore_1        
		abyte0.B = ((azh) (abyte0)).be ^ a.B;
	// 8291 15493:aload_1         
	// 8292 15494:aload_1         
	// 8293 15495:getfield        #477 <Field int azh.be>
	// 8294 15498:aload_0         
	// 8295 15499:getfield        #12  <Field azh a>
	// 8296 15502:getfield        #118 <Field int azh.B>
	// 8297 15505:ixor            
	// 8298 15506:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8299 15509:aload_0         
	// 8300 15510:getfield        #12  <Field azh a>
	// 8301 15513:astore_1        
		abyte0.S = ((azh) (abyte0)).B ^ a.S;
	// 8302 15514:aload_1         
	// 8303 15515:aload_1         
	// 8304 15516:getfield        #118 <Field int azh.B>
	// 8305 15519:aload_0         
	// 8306 15520:getfield        #12  <Field azh a>
	// 8307 15523:getfield        #480 <Field int azh.S>
	// 8308 15526:ixor            
	// 8309 15527:putfield        #480 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 8310 15530:aload_0         
	// 8311 15531:getfield        #12  <Field azh a>
	// 8312 15534:astore_1        
		abyte0.B = ((azh) (abyte0)).S & ~a.g;
	// 8313 15535:aload_1         
	// 8314 15536:aload_1         
	// 8315 15537:getfield        #480 <Field int azh.S>
	// 8316 15540:aload_0         
	// 8317 15541:getfield        #12  <Field azh a>
	// 8318 15544:getfield        #160 <Field int azh.g>
	// 8319 15547:iconst_m1       
	// 8320 15548:ixor            
	// 8321 15549:iand            
	// 8322 15550:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8323 15553:aload_0         
	// 8324 15554:getfield        #12  <Field azh a>
	// 8325 15557:astore_1        
		abyte0.be = ((azh) (abyte0)).bs | a.S;
	// 8326 15558:aload_1         
	// 8327 15559:aload_1         
	// 8328 15560:getfield        #364 <Field int azh.bs>
	// 8329 15563:aload_0         
	// 8330 15564:getfield        #12  <Field azh a>
	// 8331 15567:getfield        #480 <Field int azh.S>
	// 8332 15570:ior             
	// 8333 15571:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 8334 15574:aload_0         
	// 8335 15575:getfield        #12  <Field azh a>
	// 8336 15578:astore_1        
		abyte0.l = ((azh) (abyte0)).bs ^ a.S;
	// 8337 15579:aload_1         
	// 8338 15580:aload_1         
	// 8339 15581:getfield        #364 <Field int azh.bs>
	// 8340 15584:aload_0         
	// 8341 15585:getfield        #12  <Field azh a>
	// 8342 15588:getfield        #480 <Field int azh.S>
	// 8343 15591:ixor            
	// 8344 15592:putfield        #35  <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 8345 15595:aload_0         
	// 8346 15596:getfield        #12  <Field azh a>
	// 8347 15599:astore_1        
		abyte0.n = ((azh) (abyte0)).g | a.l;
	// 8348 15600:aload_1         
	// 8349 15601:aload_1         
	// 8350 15602:getfield        #160 <Field int azh.g>
	// 8351 15605:aload_0         
	// 8352 15606:getfield        #12  <Field azh a>
	// 8353 15609:getfield        #35  <Field int azh.l>
	// 8354 15612:ior             
	// 8355 15613:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8356 15616:aload_0         
	// 8357 15617:getfield        #12  <Field azh a>
	// 8358 15620:astore_1        
		abyte0.n = ((azh) (abyte0)).l ^ a.n;
	// 8359 15621:aload_1         
	// 8360 15622:aload_1         
	// 8361 15623:getfield        #35  <Field int azh.l>
	// 8362 15626:aload_0         
	// 8363 15627:getfield        #12  <Field azh a>
	// 8364 15630:getfield        #474 <Field int azh.n>
	// 8365 15633:ixor            
	// 8366 15634:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8367 15637:aload_0         
	// 8368 15638:getfield        #12  <Field azh a>
	// 8369 15641:astore_1        
		abyte0.n = ((azh) (abyte0)).n & ~a.ai;
	// 8370 15642:aload_1         
	// 8371 15643:aload_1         
	// 8372 15644:getfield        #474 <Field int azh.n>
	// 8373 15647:aload_0         
	// 8374 15648:getfield        #12  <Field azh a>
	// 8375 15651:getfield        #151 <Field int azh.ai>
	// 8376 15654:iconst_m1       
	// 8377 15655:ixor            
	// 8378 15656:iand            
	// 8379 15657:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8380 15660:aload_0         
	// 8381 15661:getfield        #12  <Field azh a>
	// 8382 15664:astore_1        
		abyte0.n = ((azh) (abyte0)).aa & ~a.n;
	// 8383 15665:aload_1         
	// 8384 15666:aload_1         
	// 8385 15667:getfield        #483 <Field int azh.aa>
	// 8386 15670:aload_0         
	// 8387 15671:getfield        #12  <Field azh a>
	// 8388 15674:getfield        #474 <Field int azh.n>
	// 8389 15677:iconst_m1       
	// 8390 15678:ixor            
	// 8391 15679:iand            
	// 8392 15680:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8393 15683:aload_0         
	// 8394 15684:getfield        #12  <Field azh a>
	// 8395 15687:astore_1        
		abyte0.bh = ((azh) (abyte0)).g | a.l;
	// 8396 15688:aload_1         
	// 8397 15689:aload_1         
	// 8398 15690:getfield        #160 <Field int azh.g>
	// 8399 15693:aload_0         
	// 8400 15694:getfield        #12  <Field azh a>
	// 8401 15697:getfield        #35  <Field int azh.l>
	// 8402 15700:ior             
	// 8403 15701:putfield        #403 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 8404 15704:aload_0         
	// 8405 15705:getfield        #12  <Field azh a>
	// 8406 15708:astore_1        
		abyte0.bS = ((azh) (abyte0)).S & ~a.bs;
	// 8407 15709:aload_1         
	// 8408 15710:aload_1         
	// 8409 15711:getfield        #480 <Field int azh.S>
	// 8410 15714:aload_0         
	// 8411 15715:getfield        #12  <Field azh a>
	// 8412 15718:getfield        #364 <Field int azh.bs>
	// 8413 15721:iconst_m1       
	// 8414 15722:ixor            
	// 8415 15723:iand            
	// 8416 15724:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8417 15727:aload_0         
	// 8418 15728:getfield        #12  <Field azh a>
	// 8419 15731:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bS & ~a.g;
	// 8420 15732:aload_1         
	// 8421 15733:aload_1         
	// 8422 15734:getfield        #319 <Field int azh.bS>
	// 8423 15737:aload_0         
	// 8424 15738:getfield        #12  <Field azh a>
	// 8425 15741:getfield        #160 <Field int azh.g>
	// 8426 15744:iconst_m1       
	// 8427 15745:ixor            
	// 8428 15746:iand            
	// 8429 15747:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 8430 15750:aload_0         
	// 8431 15751:getfield        #12  <Field azh a>
	// 8432 15754:astore_1        
		abyte0.bQ = ((azh) (abyte0)).be ^ a.bQ;
	// 8433 15755:aload_1         
	// 8434 15756:aload_1         
	// 8435 15757:getfield        #477 <Field int azh.be>
	// 8436 15760:aload_0         
	// 8437 15761:getfield        #12  <Field azh a>
	// 8438 15764:getfield        #307 <Field int azh.bQ>
	// 8439 15767:ixor            
	// 8440 15768:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 8441 15771:aload_0         
	// 8442 15772:getfield        #12  <Field azh a>
	// 8443 15775:astore_1        
		abyte0.bQ = ((azh) (abyte0)).ai & ~a.bQ;
	// 8444 15776:aload_1         
	// 8445 15777:aload_1         
	// 8446 15778:getfield        #151 <Field int azh.ai>
	// 8447 15781:aload_0         
	// 8448 15782:getfield        #12  <Field azh a>
	// 8449 15785:getfield        #307 <Field int azh.bQ>
	// 8450 15788:iconst_m1       
	// 8451 15789:ixor            
	// 8452 15790:iand            
	// 8453 15791:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 8454 15794:aload_0         
	// 8455 15795:getfield        #12  <Field azh a>
	// 8456 15798:astore_1        
		abyte0.bQ = ((azh) (abyte0)).B ^ a.bQ;
	// 8457 15799:aload_1         
	// 8458 15800:aload_1         
	// 8459 15801:getfield        #118 <Field int azh.B>
	// 8460 15804:aload_0         
	// 8461 15805:getfield        #12  <Field azh a>
	// 8462 15808:getfield        #307 <Field int azh.bQ>
	// 8463 15811:ixor            
	// 8464 15812:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 8465 15815:aload_0         
	// 8466 15816:getfield        #12  <Field azh a>
	// 8467 15819:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aa & ~a.bQ;
	// 8468 15820:aload_1         
	// 8469 15821:aload_1         
	// 8470 15822:getfield        #483 <Field int azh.aa>
	// 8471 15825:aload_0         
	// 8472 15826:getfield        #12  <Field azh a>
	// 8473 15829:getfield        #307 <Field int azh.bQ>
	// 8474 15832:iconst_m1       
	// 8475 15833:ixor            
	// 8476 15834:iand            
	// 8477 15835:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 8478 15838:aload_0         
	// 8479 15839:getfield        #12  <Field azh a>
	// 8480 15842:astore_1        
		abyte0.B = ((azh) (abyte0)).bS & ~a.g;
	// 8481 15843:aload_1         
	// 8482 15844:aload_1         
	// 8483 15845:getfield        #319 <Field int azh.bS>
	// 8484 15848:aload_0         
	// 8485 15849:getfield        #12  <Field azh a>
	// 8486 15852:getfield        #160 <Field int azh.g>
	// 8487 15855:iconst_m1       
	// 8488 15856:ixor            
	// 8489 15857:iand            
	// 8490 15858:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8491 15861:aload_0         
	// 8492 15862:getfield        #12  <Field azh a>
	// 8493 15865:astore_1        
		abyte0.B = ((azh) (abyte0)).bS ^ a.B;
	// 8494 15866:aload_1         
	// 8495 15867:aload_1         
	// 8496 15868:getfield        #319 <Field int azh.bS>
	// 8497 15871:aload_0         
	// 8498 15872:getfield        #12  <Field azh a>
	// 8499 15875:getfield        #118 <Field int azh.B>
	// 8500 15878:ixor            
	// 8501 15879:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8502 15882:aload_0         
	// 8503 15883:getfield        #12  <Field azh a>
	// 8504 15886:astore_1        
		abyte0.B = ((azh) (abyte0)).B & a.ai;
	// 8505 15887:aload_1         
	// 8506 15888:aload_1         
	// 8507 15889:getfield        #118 <Field int azh.B>
	// 8508 15892:aload_0         
	// 8509 15893:getfield        #12  <Field azh a>
	// 8510 15896:getfield        #151 <Field int azh.ai>
	// 8511 15899:iand            
	// 8512 15900:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8513 15903:aload_0         
	// 8514 15904:getfield        #12  <Field azh a>
	// 8515 15907:astore_1        
		abyte0.av = ((azh) (abyte0)).bs & ~a.S;
	// 8516 15908:aload_1         
	// 8517 15909:aload_1         
	// 8518 15910:getfield        #364 <Field int azh.bs>
	// 8519 15913:aload_0         
	// 8520 15914:getfield        #12  <Field azh a>
	// 8521 15917:getfield        #480 <Field int azh.S>
	// 8522 15920:iconst_m1       
	// 8523 15921:ixor            
	// 8524 15922:iand            
	// 8525 15923:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8526 15926:aload_0         
	// 8527 15927:getfield        #12  <Field azh a>
	// 8528 15930:astore_1        
		abyte0.bn = ((azh) (abyte0)).av ^ a.g;
	// 8529 15931:aload_1         
	// 8530 15932:aload_1         
	// 8531 15933:getfield        #292 <Field int azh.av>
	// 8532 15936:aload_0         
	// 8533 15937:getfield        #12  <Field azh a>
	// 8534 15940:getfield        #160 <Field int azh.g>
	// 8535 15943:ixor            
	// 8536 15944:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 8537 15947:aload_0         
	// 8538 15948:getfield        #12  <Field azh a>
	// 8539 15951:astore_1        
		abyte0.aF = ((azh) (abyte0)).g | a.av;
	// 8540 15952:aload_1         
	// 8541 15953:aload_1         
	// 8542 15954:getfield        #160 <Field int azh.g>
	// 8543 15957:aload_0         
	// 8544 15958:getfield        #12  <Field azh a>
	// 8545 15961:getfield        #292 <Field int azh.av>
	// 8546 15964:ior             
	// 8547 15965:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 8548 15968:aload_0         
	// 8549 15969:getfield        #12  <Field azh a>
	// 8550 15972:astore_1        
		abyte0.aF = ((azh) (abyte0)).bs ^ a.aF;
	// 8551 15973:aload_1         
	// 8552 15974:aload_1         
	// 8553 15975:getfield        #364 <Field int azh.bs>
	// 8554 15978:aload_0         
	// 8555 15979:getfield        #12  <Field azh a>
	// 8556 15982:getfield        #328 <Field int azh.aF>
	// 8557 15985:ixor            
	// 8558 15986:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 8559 15989:aload_0         
	// 8560 15990:getfield        #12  <Field azh a>
	// 8561 15993:astore_1        
		abyte0.cb = ((azh) (abyte0)).aF ^ a.cb;
	// 8562 15994:aload_1         
	// 8563 15995:aload_1         
	// 8564 15996:getfield        #328 <Field int azh.aF>
	// 8565 15999:aload_0         
	// 8566 16000:getfield        #12  <Field azh a>
	// 8567 16003:getfield        #486 <Field int azh.cb>
	// 8568 16006:ixor            
	// 8569 16007:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8570 16010:aload_0         
	// 8571 16011:getfield        #12  <Field azh a>
	// 8572 16014:astore_1        
		abyte0.cb = ((azh) (abyte0)).aa & ~a.cb;
	// 8573 16015:aload_1         
	// 8574 16016:aload_1         
	// 8575 16017:getfield        #483 <Field int azh.aa>
	// 8576 16020:aload_0         
	// 8577 16021:getfield        #12  <Field azh a>
	// 8578 16024:getfield        #486 <Field int azh.cb>
	// 8579 16027:iconst_m1       
	// 8580 16028:ixor            
	// 8581 16029:iand            
	// 8582 16030:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8583 16033:aload_0         
	// 8584 16034:getfield        #12  <Field azh a>
	// 8585 16037:astore_1        
		abyte0.aF = ((azh) (abyte0)).g | a.av;
	// 8586 16038:aload_1         
	// 8587 16039:aload_1         
	// 8588 16040:getfield        #160 <Field int azh.g>
	// 8589 16043:aload_0         
	// 8590 16044:getfield        #12  <Field azh a>
	// 8591 16047:getfield        #292 <Field int azh.av>
	// 8592 16050:ior             
	// 8593 16051:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 8594 16054:aload_0         
	// 8595 16055:getfield        #12  <Field azh a>
	// 8596 16058:astore_1        
		abyte0.aF = ((azh) (abyte0)).bS ^ a.aF;
	// 8597 16059:aload_1         
	// 8598 16060:aload_1         
	// 8599 16061:getfield        #319 <Field int azh.bS>
	// 8600 16064:aload_0         
	// 8601 16065:getfield        #12  <Field azh a>
	// 8602 16068:getfield        #328 <Field int azh.aF>
	// 8603 16071:ixor            
	// 8604 16072:putfield        #328 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 8605 16075:aload_0         
	// 8606 16076:getfield        #12  <Field azh a>
	// 8607 16079:astore_1        
		abyte0.bS = ((azh) (abyte0)).S | a.av;
	// 8608 16080:aload_1         
	// 8609 16081:aload_1         
	// 8610 16082:getfield        #480 <Field int azh.S>
	// 8611 16085:aload_0         
	// 8612 16086:getfield        #12  <Field azh a>
	// 8613 16089:getfield        #292 <Field int azh.av>
	// 8614 16092:ior             
	// 8615 16093:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8616 16096:aload_0         
	// 8617 16097:getfield        #12  <Field azh a>
	// 8618 16100:astore_1        
		abyte0.bd = ((azh) (abyte0)).bS & ~a.g;
	// 8619 16101:aload_1         
	// 8620 16102:aload_1         
	// 8621 16103:getfield        #319 <Field int azh.bS>
	// 8622 16106:aload_0         
	// 8623 16107:getfield        #12  <Field azh a>
	// 8624 16110:getfield        #160 <Field int azh.g>
	// 8625 16113:iconst_m1       
	// 8626 16114:ixor            
	// 8627 16115:iand            
	// 8628 16116:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8629 16119:aload_0         
	// 8630 16120:getfield        #12  <Field azh a>
	// 8631 16123:astore_1        
		abyte0.bd = ((azh) (abyte0)).S ^ a.bd;
	// 8632 16124:aload_1         
	// 8633 16125:aload_1         
	// 8634 16126:getfield        #480 <Field int azh.S>
	// 8635 16129:aload_0         
	// 8636 16130:getfield        #12  <Field azh a>
	// 8637 16133:getfield        #121 <Field int azh.bd>
	// 8638 16136:ixor            
	// 8639 16137:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8640 16140:aload_0         
	// 8641 16141:getfield        #12  <Field azh a>
	// 8642 16144:astore_1        
		abyte0.bd = ((azh) (abyte0)).ai & ~a.bd;
	// 8643 16145:aload_1         
	// 8644 16146:aload_1         
	// 8645 16147:getfield        #151 <Field int azh.ai>
	// 8646 16150:aload_0         
	// 8647 16151:getfield        #12  <Field azh a>
	// 8648 16154:getfield        #121 <Field int azh.bd>
	// 8649 16157:iconst_m1       
	// 8650 16158:ixor            
	// 8651 16159:iand            
	// 8652 16160:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8653 16163:aload_0         
	// 8654 16164:getfield        #12  <Field azh a>
	// 8655 16167:astore_1        
		abyte0.bd = ((azh) (abyte0)).bn ^ a.bd;
	// 8656 16168:aload_1         
	// 8657 16169:aload_1         
	// 8658 16170:getfield        #313 <Field int azh.bn>
	// 8659 16173:aload_0         
	// 8660 16174:getfield        #12  <Field azh a>
	// 8661 16177:getfield        #121 <Field int azh.bd>
	// 8662 16180:ixor            
	// 8663 16181:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8664 16184:aload_0         
	// 8665 16185:getfield        #12  <Field azh a>
	// 8666 16188:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bd ^ a.bQ;
	// 8667 16189:aload_1         
	// 8668 16190:aload_1         
	// 8669 16191:getfield        #121 <Field int azh.bd>
	// 8670 16194:aload_0         
	// 8671 16195:getfield        #12  <Field azh a>
	// 8672 16198:getfield        #307 <Field int azh.bQ>
	// 8673 16201:ixor            
	// 8674 16202:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 8675 16205:aload_0         
	// 8676 16206:getfield        #12  <Field azh a>
	// 8677 16209:astore_1        
		abyte0.bh = ((azh) (abyte0)).bS ^ a.bh;
	// 8678 16210:aload_1         
	// 8679 16211:aload_1         
	// 8680 16212:getfield        #319 <Field int azh.bS>
	// 8681 16215:aload_0         
	// 8682 16216:getfield        #12  <Field azh a>
	// 8683 16219:getfield        #403 <Field int azh.bh>
	// 8684 16222:ixor            
	// 8685 16223:putfield        #403 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 8686 16226:aload_0         
	// 8687 16227:getfield        #12  <Field azh a>
	// 8688 16230:astore_1        
		abyte0.bS = ((azh) (abyte0)).ai | a.bh;
	// 8689 16231:aload_1         
	// 8690 16232:aload_1         
	// 8691 16233:getfield        #151 <Field int azh.ai>
	// 8692 16236:aload_0         
	// 8693 16237:getfield        #12  <Field azh a>
	// 8694 16240:getfield        #403 <Field int azh.bh>
	// 8695 16243:ior             
	// 8696 16244:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8697 16247:aload_0         
	// 8698 16248:getfield        #12  <Field azh a>
	// 8699 16251:astore_1        
		abyte0.bS = ((azh) (abyte0)).bn ^ a.bS;
	// 8700 16252:aload_1         
	// 8701 16253:aload_1         
	// 8702 16254:getfield        #313 <Field int azh.bn>
	// 8703 16257:aload_0         
	// 8704 16258:getfield        #12  <Field azh a>
	// 8705 16261:getfield        #319 <Field int azh.bS>
	// 8706 16264:ixor            
	// 8707 16265:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8708 16268:aload_0         
	// 8709 16269:getfield        #12  <Field azh a>
	// 8710 16272:astore_1        
		abyte0.n = ((azh) (abyte0)).bS ^ a.n;
	// 8711 16273:aload_1         
	// 8712 16274:aload_1         
	// 8713 16275:getfield        #319 <Field int azh.bS>
	// 8714 16278:aload_0         
	// 8715 16279:getfield        #12  <Field azh a>
	// 8716 16282:getfield        #474 <Field int azh.n>
	// 8717 16285:ixor            
	// 8718 16286:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8719 16289:aload_0         
	// 8720 16290:getfield        #12  <Field azh a>
	// 8721 16293:astore_1        
		abyte0.bS = ((azh) (abyte0)).av & ~a.g;
	// 8722 16294:aload_1         
	// 8723 16295:aload_1         
	// 8724 16296:getfield        #292 <Field int azh.av>
	// 8725 16299:aload_0         
	// 8726 16300:getfield        #12  <Field azh a>
	// 8727 16303:getfield        #160 <Field int azh.g>
	// 8728 16306:iconst_m1       
	// 8729 16307:ixor            
	// 8730 16308:iand            
	// 8731 16309:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8732 16312:aload_0         
	// 8733 16313:getfield        #12  <Field azh a>
	// 8734 16316:astore_1        
		abyte0.bS = ((azh) (abyte0)).av ^ a.bS;
	// 8735 16317:aload_1         
	// 8736 16318:aload_1         
	// 8737 16319:getfield        #292 <Field int azh.av>
	// 8738 16322:aload_0         
	// 8739 16323:getfield        #12  <Field azh a>
	// 8740 16326:getfield        #319 <Field int azh.bS>
	// 8741 16329:ixor            
	// 8742 16330:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8743 16333:aload_0         
	// 8744 16334:getfield        #12  <Field azh a>
	// 8745 16337:astore_1        
		abyte0.aU = ((azh) (abyte0)).bS ^ a.aU;
	// 8746 16338:aload_1         
	// 8747 16339:aload_1         
	// 8748 16340:getfield        #319 <Field int azh.bS>
	// 8749 16343:aload_0         
	// 8750 16344:getfield        #12  <Field azh a>
	// 8751 16347:getfield        #489 <Field int azh.aU>
	// 8752 16350:ixor            
	// 8753 16351:putfield        #489 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 8754 16354:aload_0         
	// 8755 16355:getfield        #12  <Field azh a>
	// 8756 16358:astore_1        
		abyte0.aU = ((azh) (abyte0)).aa & a.aU;
	// 8757 16359:aload_1         
	// 8758 16360:aload_1         
	// 8759 16361:getfield        #483 <Field int azh.aa>
	// 8760 16364:aload_0         
	// 8761 16365:getfield        #12  <Field azh a>
	// 8762 16368:getfield        #489 <Field int azh.aU>
	// 8763 16371:iand            
	// 8764 16372:putfield        #489 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 8765 16375:aload_0         
	// 8766 16376:getfield        #12  <Field azh a>
	// 8767 16379:astore_1        
		abyte0.aU = ((azh) (abyte0)).B ^ a.aU;
	// 8768 16380:aload_1         
	// 8769 16381:aload_1         
	// 8770 16382:getfield        #118 <Field int azh.B>
	// 8771 16385:aload_0         
	// 8772 16386:getfield        #12  <Field azh a>
	// 8773 16389:getfield        #489 <Field int azh.aU>
	// 8774 16392:ixor            
	// 8775 16393:putfield        #489 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 8776 16396:aload_0         
	// 8777 16397:getfield        #12  <Field azh a>
	// 8778 16400:astore_1        
		abyte0.aU = ((azh) (abyte0)).K | a.aU;
	// 8779 16401:aload_1         
	// 8780 16402:aload_1         
	// 8781 16403:getfield        #358 <Field int azh.K>
	// 8782 16406:aload_0         
	// 8783 16407:getfield        #12  <Field azh a>
	// 8784 16410:getfield        #489 <Field int azh.aU>
	// 8785 16413:ior             
	// 8786 16414:putfield        #489 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 8787 16417:aload_0         
	// 8788 16418:getfield        #12  <Field azh a>
	// 8789 16421:astore_1        
		abyte0.B = ((azh) (abyte0)).g | a.av;
	// 8790 16422:aload_1         
	// 8791 16423:aload_1         
	// 8792 16424:getfield        #160 <Field int azh.g>
	// 8793 16427:aload_0         
	// 8794 16428:getfield        #12  <Field azh a>
	// 8795 16431:getfield        #292 <Field int azh.av>
	// 8796 16434:ior             
	// 8797 16435:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8798 16438:aload_0         
	// 8799 16439:getfield        #12  <Field azh a>
	// 8800 16442:astore_1        
		abyte0.B = ((azh) (abyte0)).ai | a.B;
	// 8801 16443:aload_1         
	// 8802 16444:aload_1         
	// 8803 16445:getfield        #151 <Field int azh.ai>
	// 8804 16448:aload_0         
	// 8805 16449:getfield        #12  <Field azh a>
	// 8806 16452:getfield        #118 <Field int azh.B>
	// 8807 16455:ior             
	// 8808 16456:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8809 16459:aload_0         
	// 8810 16460:getfield        #12  <Field azh a>
	// 8811 16463:astore_1        
		abyte0.B = ((azh) (abyte0)).g ^ a.B;
	// 8812 16464:aload_1         
	// 8813 16465:aload_1         
	// 8814 16466:getfield        #160 <Field int azh.g>
	// 8815 16469:aload_0         
	// 8816 16470:getfield        #12  <Field azh a>
	// 8817 16473:getfield        #118 <Field int azh.B>
	// 8818 16476:ixor            
	// 8819 16477:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8820 16480:aload_0         
	// 8821 16481:getfield        #12  <Field azh a>
	// 8822 16484:astore_1        
		abyte0.B = ((azh) (abyte0)).aa & a.B;
	// 8823 16485:aload_1         
	// 8824 16486:aload_1         
	// 8825 16487:getfield        #483 <Field int azh.aa>
	// 8826 16490:aload_0         
	// 8827 16491:getfield        #12  <Field azh a>
	// 8828 16494:getfield        #118 <Field int azh.B>
	// 8829 16497:iand            
	// 8830 16498:putfield        #118 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8831 16501:aload_0         
	// 8832 16502:getfield        #12  <Field azh a>
	// 8833 16505:astore_1        
		abyte0.bS = ((azh) (abyte0)).g | a.av;
	// 8834 16506:aload_1         
	// 8835 16507:aload_1         
	// 8836 16508:getfield        #160 <Field int azh.g>
	// 8837 16511:aload_0         
	// 8838 16512:getfield        #12  <Field azh a>
	// 8839 16515:getfield        #292 <Field int azh.av>
	// 8840 16518:ior             
	// 8841 16519:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8842 16522:aload_0         
	// 8843 16523:getfield        #12  <Field azh a>
	// 8844 16526:astore_1        
		abyte0.bS = ((azh) (abyte0)).be ^ a.bS;
	// 8845 16527:aload_1         
	// 8846 16528:aload_1         
	// 8847 16529:getfield        #477 <Field int azh.be>
	// 8848 16532:aload_0         
	// 8849 16533:getfield        #12  <Field azh a>
	// 8850 16536:getfield        #319 <Field int azh.bS>
	// 8851 16539:ixor            
	// 8852 16540:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 8853 16543:aload_0         
	// 8854 16544:getfield        #12  <Field azh a>
	// 8855 16547:astore_1        
		abyte0.cf = ((azh) (abyte0)).bS ^ a.cf;
	// 8856 16548:aload_1         
	// 8857 16549:aload_1         
	// 8858 16550:getfield        #319 <Field int azh.bS>
	// 8859 16553:aload_0         
	// 8860 16554:getfield        #12  <Field azh a>
	// 8861 16557:getfield        #492 <Field int azh.cf>
	// 8862 16560:ixor            
	// 8863 16561:putfield        #492 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 8864 16564:aload_0         
	// 8865 16565:getfield        #12  <Field azh a>
	// 8866 16568:astore_1        
		abyte0.cb = ((azh) (abyte0)).cf ^ a.cb;
	// 8867 16569:aload_1         
	// 8868 16570:aload_1         
	// 8869 16571:getfield        #492 <Field int azh.cf>
	// 8870 16574:aload_0         
	// 8871 16575:getfield        #12  <Field azh a>
	// 8872 16578:getfield        #486 <Field int azh.cb>
	// 8873 16581:ixor            
	// 8874 16582:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8875 16585:aload_0         
	// 8876 16586:getfield        #12  <Field azh a>
	// 8877 16589:astore_1        
		abyte0.cb = ((azh) (abyte0)).cb & ~a.K;
	// 8878 16590:aload_1         
	// 8879 16591:aload_1         
	// 8880 16592:getfield        #486 <Field int azh.cb>
	// 8881 16595:aload_0         
	// 8882 16596:getfield        #12  <Field azh a>
	// 8883 16599:getfield        #358 <Field int azh.K>
	// 8884 16602:iconst_m1       
	// 8885 16603:ixor            
	// 8886 16604:iand            
	// 8887 16605:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8888 16608:aload_0         
	// 8889 16609:getfield        #12  <Field azh a>
	// 8890 16612:astore_1        
		abyte0.cb = ((azh) (abyte0)).n ^ a.cb;
	// 8891 16613:aload_1         
	// 8892 16614:aload_1         
	// 8893 16615:getfield        #474 <Field int azh.n>
	// 8894 16618:aload_0         
	// 8895 16619:getfield        #12  <Field azh a>
	// 8896 16622:getfield        #486 <Field int azh.cb>
	// 8897 16625:ixor            
	// 8898 16626:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8899 16629:aload_0         
	// 8900 16630:getfield        #12  <Field azh a>
	// 8901 16633:astore_1        
		abyte0.f = ((azh) (abyte0)).cb ^ a.f;
	// 8902 16634:aload_1         
	// 8903 16635:aload_1         
	// 8904 16636:getfield        #486 <Field int azh.cb>
	// 8905 16639:aload_0         
	// 8906 16640:getfield        #12  <Field azh a>
	// 8907 16643:getfield        #495 <Field int azh.f>
	// 8908 16646:ixor            
	// 8909 16647:putfield        #495 <Field int azh.f>
		abyte0 = ((byte []) (a));
	// 8910 16650:aload_0         
	// 8911 16651:getfield        #12  <Field azh a>
	// 8912 16654:astore_1        
		abyte0.cb = ((azh) (abyte0)).f ^ a.v;
	// 8913 16655:aload_1         
	// 8914 16656:aload_1         
	// 8915 16657:getfield        #495 <Field int azh.f>
	// 8916 16660:aload_0         
	// 8917 16661:getfield        #12  <Field azh a>
	// 8918 16664:getfield        #471 <Field int azh.v>
	// 8919 16667:ixor            
	// 8920 16668:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8921 16671:aload_0         
	// 8922 16672:getfield        #12  <Field azh a>
	// 8923 16675:astore_1        
		abyte0.n = ((azh) (abyte0)).aG & ~a.cb;
	// 8924 16676:aload_1         
	// 8925 16677:aload_1         
	// 8926 16678:getfield        #337 <Field int azh.aG>
	// 8927 16681:aload_0         
	// 8928 16682:getfield        #12  <Field azh a>
	// 8929 16685:getfield        #486 <Field int azh.cb>
	// 8930 16688:iconst_m1       
	// 8931 16689:ixor            
	// 8932 16690:iand            
	// 8933 16691:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8934 16694:aload_0         
	// 8935 16695:getfield        #12  <Field azh a>
	// 8936 16698:astore_1        
		abyte0.n = ((azh) (abyte0)).D | a.n;
	// 8937 16699:aload_1         
	// 8938 16700:aload_1         
	// 8939 16701:getfield        #211 <Field int azh.D>
	// 8940 16704:aload_0         
	// 8941 16705:getfield        #12  <Field azh a>
	// 8942 16708:getfield        #474 <Field int azh.n>
	// 8943 16711:ior             
	// 8944 16712:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8945 16715:aload_0         
	// 8946 16716:getfield        #12  <Field azh a>
	// 8947 16719:astore_1        
		abyte0.cf = ((azh) (abyte0)).aG & a.cb;
	// 8948 16720:aload_1         
	// 8949 16721:aload_1         
	// 8950 16722:getfield        #337 <Field int azh.aG>
	// 8951 16725:aload_0         
	// 8952 16726:getfield        #12  <Field azh a>
	// 8953 16729:getfield        #486 <Field int azh.cb>
	// 8954 16732:iand            
	// 8955 16733:putfield        #492 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 8956 16736:aload_0         
	// 8957 16737:getfield        #12  <Field azh a>
	// 8958 16740:astore_1        
		abyte0.be = ((azh) (abyte0)).aG & ~a.cb;
	// 8959 16741:aload_1         
	// 8960 16742:aload_1         
	// 8961 16743:getfield        #337 <Field int azh.aG>
	// 8962 16746:aload_0         
	// 8963 16747:getfield        #12  <Field azh a>
	// 8964 16750:getfield        #486 <Field int azh.cb>
	// 8965 16753:iconst_m1       
	// 8966 16754:ixor            
	// 8967 16755:iand            
	// 8968 16756:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 8969 16759:aload_0         
	// 8970 16760:getfield        #12  <Field azh a>
	// 8971 16763:astore_1        
		abyte0.bn = ((azh) (abyte0)).aG & ~a.f;
	// 8972 16764:aload_1         
	// 8973 16765:aload_1         
	// 8974 16766:getfield        #337 <Field int azh.aG>
	// 8975 16769:aload_0         
	// 8976 16770:getfield        #12  <Field azh a>
	// 8977 16773:getfield        #495 <Field int azh.f>
	// 8978 16776:iconst_m1       
	// 8979 16777:ixor            
	// 8980 16778:iand            
	// 8981 16779:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 8982 16782:aload_0         
	// 8983 16783:getfield        #12  <Field azh a>
	// 8984 16786:astore_1        
		abyte0.bd = ((azh) (abyte0)).f ^ a.br;
	// 8985 16787:aload_1         
	// 8986 16788:aload_1         
	// 8987 16789:getfield        #495 <Field int azh.f>
	// 8988 16792:aload_0         
	// 8989 16793:getfield        #12  <Field azh a>
	// 8990 16796:getfield        #205 <Field int azh.br>
	// 8991 16799:ixor            
	// 8992 16800:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8993 16803:aload_0         
	// 8994 16804:getfield        #12  <Field azh a>
	// 8995 16807:astore_1        
		abyte0.bd = ((azh) (abyte0)).bY | a.bd;
	// 8996 16808:aload_1         
	// 8997 16809:aload_1         
	// 8998 16810:getfield        #262 <Field int azh.bY>
	// 8999 16813:aload_0         
	// 9000 16814:getfield        #12  <Field azh a>
	// 9001 16817:getfield        #121 <Field int azh.bd>
	// 9002 16820:ior             
	// 9003 16821:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9004 16824:aload_0         
	// 9005 16825:getfield        #12  <Field azh a>
	// 9006 16828:astore_1        
		abyte0.R = ((azh) (abyte0)).Z ^ a.f;
	// 9007 16829:aload_1         
	// 9008 16830:aload_1         
	// 9009 16831:getfield        #229 <Field int azh.Z>
	// 9010 16834:aload_0         
	// 9011 16835:getfield        #12  <Field azh a>
	// 9012 16838:getfield        #495 <Field int azh.f>
	// 9013 16841:ixor            
	// 9014 16842:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9015 16845:aload_0         
	// 9016 16846:getfield        #12  <Field azh a>
	// 9017 16849:astore_1        
		abyte0.bK = ((azh) (abyte0)).R & ~a.bY;
	// 9018 16850:aload_1         
	// 9019 16851:aload_1         
	// 9020 16852:getfield        #346 <Field int azh.R>
	// 9021 16855:aload_0         
	// 9022 16856:getfield        #12  <Field azh a>
	// 9023 16859:getfield        #262 <Field int azh.bY>
	// 9024 16862:iconst_m1       
	// 9025 16863:ixor            
	// 9026 16864:iand            
	// 9027 16865:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 9028 16868:aload_0         
	// 9029 16869:getfield        #12  <Field azh a>
	// 9030 16872:astore_1        
		abyte0.s = ((azh) (abyte0)).R ^ a.br;
	// 9031 16873:aload_1         
	// 9032 16874:aload_1         
	// 9033 16875:getfield        #346 <Field int azh.R>
	// 9034 16878:aload_0         
	// 9035 16879:getfield        #12  <Field azh a>
	// 9036 16882:getfield        #205 <Field int azh.br>
	// 9037 16885:ixor            
	// 9038 16886:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9039 16889:aload_0         
	// 9040 16890:getfield        #12  <Field azh a>
	// 9041 16893:astore_1        
		abyte0.cc = ((azh) (abyte0)).f & ~a.v;
	// 9042 16894:aload_1         
	// 9043 16895:aload_1         
	// 9044 16896:getfield        #495 <Field int azh.f>
	// 9045 16899:aload_0         
	// 9046 16900:getfield        #12  <Field azh a>
	// 9047 16903:getfield        #471 <Field int azh.v>
	// 9048 16906:iconst_m1       
	// 9049 16907:ixor            
	// 9050 16908:iand            
	// 9051 16909:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9052 16912:aload_0         
	// 9053 16913:getfield        #12  <Field azh a>
	// 9054 16916:astore_1        
		abyte0.cc = ((azh) (abyte0)).aG & a.cc;
	// 9055 16917:aload_1         
	// 9056 16918:aload_1         
	// 9057 16919:getfield        #337 <Field int azh.aG>
	// 9058 16922:aload_0         
	// 9059 16923:getfield        #12  <Field azh a>
	// 9060 16926:getfield        #459 <Field int azh.cc>
	// 9061 16929:iand            
	// 9062 16930:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9063 16933:aload_0         
	// 9064 16934:getfield        #12  <Field azh a>
	// 9065 16937:astore_1        
		abyte0.bN = ((azh) (abyte0)).Z & a.f;
	// 9066 16938:aload_1         
	// 9067 16939:aload_1         
	// 9068 16940:getfield        #229 <Field int azh.Z>
	// 9069 16943:aload_0         
	// 9070 16944:getfield        #12  <Field azh a>
	// 9071 16947:getfield        #495 <Field int azh.f>
	// 9072 16950:iand            
	// 9073 16951:putfield        #432 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 9074 16954:aload_0         
	// 9075 16955:getfield        #12  <Field azh a>
	// 9076 16958:astore_1        
		abyte0.bB = ((azh) (abyte0)).br & a.bN;
	// 9077 16959:aload_1         
	// 9078 16960:aload_1         
	// 9079 16961:getfield        #205 <Field int azh.br>
	// 9080 16964:aload_0         
	// 9081 16965:getfield        #12  <Field azh a>
	// 9082 16968:getfield        #432 <Field int azh.bN>
	// 9083 16971:iand            
	// 9084 16972:putfield        #456 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9085 16975:aload_0         
	// 9086 16976:getfield        #12  <Field azh a>
	// 9087 16979:astore_1        
		abyte0.bB = ((azh) (abyte0)).bN ^ a.bB;
	// 9088 16980:aload_1         
	// 9089 16981:aload_1         
	// 9090 16982:getfield        #432 <Field int azh.bN>
	// 9091 16985:aload_0         
	// 9092 16986:getfield        #12  <Field azh a>
	// 9093 16989:getfield        #456 <Field int azh.bB>
	// 9094 16992:ixor            
	// 9095 16993:putfield        #456 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9096 16996:aload_0         
	// 9097 16997:getfield        #12  <Field azh a>
	// 9098 17000:astore_1        
		abyte0.bB = ((azh) (abyte0)).bY | a.bB;
	// 9099 17001:aload_1         
	// 9100 17002:aload_1         
	// 9101 17003:getfield        #262 <Field int azh.bY>
	// 9102 17006:aload_0         
	// 9103 17007:getfield        #12  <Field azh a>
	// 9104 17010:getfield        #456 <Field int azh.bB>
	// 9105 17013:ior             
	// 9106 17014:putfield        #456 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9107 17017:aload_0         
	// 9108 17018:getfield        #12  <Field azh a>
	// 9109 17021:astore_1        
		abyte0.am = ((azh) (abyte0)).f & ~a.bN;
	// 9110 17022:aload_1         
	// 9111 17023:aload_1         
	// 9112 17024:getfield        #495 <Field int azh.f>
	// 9113 17027:aload_0         
	// 9114 17028:getfield        #12  <Field azh a>
	// 9115 17031:getfield        #432 <Field int azh.bN>
	// 9116 17034:iconst_m1       
	// 9117 17035:ixor            
	// 9118 17036:iand            
	// 9119 17037:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9120 17040:aload_0         
	// 9121 17041:getfield        #12  <Field azh a>
	// 9122 17044:astore_1        
		abyte0.bo = ((azh) (abyte0)).br & ~a.am;
	// 9123 17045:aload_1         
	// 9124 17046:aload_1         
	// 9125 17047:getfield        #205 <Field int azh.br>
	// 9126 17050:aload_0         
	// 9127 17051:getfield        #12  <Field azh a>
	// 9128 17054:getfield        #409 <Field int azh.am>
	// 9129 17057:iconst_m1       
	// 9130 17058:ixor            
	// 9131 17059:iand            
	// 9132 17060:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 9133 17063:aload_0         
	// 9134 17064:getfield        #12  <Field azh a>
	// 9135 17067:astore_1        
		abyte0.bo = ((azh) (abyte0)).R ^ a.bo;
	// 9136 17068:aload_1         
	// 9137 17069:aload_1         
	// 9138 17070:getfield        #346 <Field int azh.R>
	// 9139 17073:aload_0         
	// 9140 17074:getfield        #12  <Field azh a>
	// 9141 17077:getfield        #145 <Field int azh.bo>
	// 9142 17080:ixor            
	// 9143 17081:putfield        #145 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 9144 17084:aload_0         
	// 9145 17085:getfield        #12  <Field azh a>
	// 9146 17088:astore_1        
		abyte0.bx = ((azh) (abyte0)).am ^ a.br;
	// 9147 17089:aload_1         
	// 9148 17090:aload_1         
	// 9149 17091:getfield        #409 <Field int azh.am>
	// 9150 17094:aload_0         
	// 9151 17095:getfield        #12  <Field azh a>
	// 9152 17098:getfield        #205 <Field int azh.br>
	// 9153 17101:ixor            
	// 9154 17102:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9155 17105:aload_0         
	// 9156 17106:getfield        #12  <Field azh a>
	// 9157 17109:astore_1        
		abyte0.ba = ((azh) (abyte0)).bY & ~a.bx;
	// 9158 17110:aload_1         
	// 9159 17111:aload_1         
	// 9160 17112:getfield        #262 <Field int azh.bY>
	// 9161 17115:aload_0         
	// 9162 17116:getfield        #12  <Field azh a>
	// 9163 17119:getfield        #70  <Field int azh.bx>
	// 9164 17122:iconst_m1       
	// 9165 17123:ixor            
	// 9166 17124:iand            
	// 9167 17125:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 9168 17128:aload_0         
	// 9169 17129:getfield        #12  <Field azh a>
	// 9170 17132:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx ^ a.bY;
	// 9171 17133:aload_1         
	// 9172 17134:aload_1         
	// 9173 17135:getfield        #70  <Field int azh.bx>
	// 9174 17138:aload_0         
	// 9175 17139:getfield        #12  <Field azh a>
	// 9176 17142:getfield        #262 <Field int azh.bY>
	// 9177 17145:ixor            
	// 9178 17146:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9179 17149:aload_0         
	// 9180 17150:getfield        #12  <Field azh a>
	// 9181 17153:astore_1        
		abyte0.bV = ((azh) (abyte0)).bN ^ a.br;
	// 9182 17154:aload_1         
	// 9183 17155:aload_1         
	// 9184 17156:getfield        #432 <Field int azh.bN>
	// 9185 17159:aload_0         
	// 9186 17160:getfield        #12  <Field azh a>
	// 9187 17163:getfield        #205 <Field int azh.br>
	// 9188 17166:ixor            
	// 9189 17167:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9190 17170:aload_0         
	// 9191 17171:getfield        #12  <Field azh a>
	// 9192 17174:astore_1        
		abyte0.aY = ((azh) (abyte0)).br & a.bN;
	// 9193 17175:aload_1         
	// 9194 17176:aload_1         
	// 9195 17177:getfield        #205 <Field int azh.br>
	// 9196 17180:aload_0         
	// 9197 17181:getfield        #12  <Field azh a>
	// 9198 17184:getfield        #432 <Field int azh.bN>
	// 9199 17187:iand            
	// 9200 17188:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9201 17191:aload_0         
	// 9202 17192:getfield        #12  <Field azh a>
	// 9203 17195:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY & ~a.bY;
	// 9204 17196:aload_1         
	// 9205 17197:aload_1         
	// 9206 17198:getfield        #163 <Field int azh.aY>
	// 9207 17201:aload_0         
	// 9208 17202:getfield        #12  <Field azh a>
	// 9209 17205:getfield        #262 <Field int azh.bY>
	// 9210 17208:iconst_m1       
	// 9211 17209:ixor            
	// 9212 17210:iand            
	// 9213 17211:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9214 17214:aload_0         
	// 9215 17215:getfield        #12  <Field azh a>
	// 9216 17218:astore_1        
		abyte0.bp = ((azh) (abyte0)).br & ~a.bN;
	// 9217 17219:aload_1         
	// 9218 17220:aload_1         
	// 9219 17221:getfield        #205 <Field int azh.br>
	// 9220 17224:aload_0         
	// 9221 17225:getfield        #12  <Field azh a>
	// 9222 17228:getfield        #432 <Field int azh.bN>
	// 9223 17231:iconst_m1       
	// 9224 17232:ixor            
	// 9225 17233:iand            
	// 9226 17234:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 9227 17237:aload_0         
	// 9228 17238:getfield        #12  <Field azh a>
	// 9229 17241:astore_1        
		abyte0.bC = ((azh) (abyte0)).br & ~a.f;
	// 9230 17242:aload_1         
	// 9231 17243:aload_1         
	// 9232 17244:getfield        #205 <Field int azh.br>
	// 9233 17247:aload_0         
	// 9234 17248:getfield        #12  <Field azh a>
	// 9235 17251:getfield        #495 <Field int azh.f>
	// 9236 17254:iconst_m1       
	// 9237 17255:ixor            
	// 9238 17256:iand            
	// 9239 17257:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 9240 17260:aload_0         
	// 9241 17261:getfield        #12  <Field azh a>
	// 9242 17264:astore_1        
		abyte0.bC = ((azh) (abyte0)).R ^ a.bC;
	// 9243 17265:aload_1         
	// 9244 17266:aload_1         
	// 9245 17267:getfield        #346 <Field int azh.R>
	// 9246 17270:aload_0         
	// 9247 17271:getfield        #12  <Field azh a>
	// 9248 17274:getfield        #208 <Field int azh.bC>
	// 9249 17277:ixor            
	// 9250 17278:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 9251 17281:aload_0         
	// 9252 17282:getfield        #12  <Field azh a>
	// 9253 17285:astore_1        
		abyte0.bC = ((azh) (abyte0)).bC & a.bY;
	// 9254 17286:aload_1         
	// 9255 17287:aload_1         
	// 9256 17288:getfield        #208 <Field int azh.bC>
	// 9257 17291:aload_0         
	// 9258 17292:getfield        #12  <Field azh a>
	// 9259 17295:getfield        #262 <Field int azh.bY>
	// 9260 17298:iand            
	// 9261 17299:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 9262 17302:aload_0         
	// 9263 17303:getfield        #12  <Field azh a>
	// 9264 17306:astore_1        
		abyte0.R = ((azh) (abyte0)).f & a.v;
	// 9265 17307:aload_1         
	// 9266 17308:aload_1         
	// 9267 17309:getfield        #495 <Field int azh.f>
	// 9268 17312:aload_0         
	// 9269 17313:getfield        #12  <Field azh a>
	// 9270 17316:getfield        #471 <Field int azh.v>
	// 9271 17319:iand            
	// 9272 17320:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9273 17323:aload_0         
	// 9274 17324:getfield        #12  <Field azh a>
	// 9275 17327:astore_1        
		abyte0.bj = ((azh) (abyte0)).aG & ~a.R;
	// 9276 17328:aload_1         
	// 9277 17329:aload_1         
	// 9278 17330:getfield        #337 <Field int azh.aG>
	// 9279 17333:aload_0         
	// 9280 17334:getfield        #12  <Field azh a>
	// 9281 17337:getfield        #346 <Field int azh.R>
	// 9282 17340:iconst_m1       
	// 9283 17341:ixor            
	// 9284 17342:iand            
	// 9285 17343:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9286 17346:aload_0         
	// 9287 17347:getfield        #12  <Field azh a>
	// 9288 17350:astore_1        
		abyte0.bj = ((azh) (abyte0)).R ^ a.bj;
	// 9289 17351:aload_1         
	// 9290 17352:aload_1         
	// 9291 17353:getfield        #346 <Field int azh.R>
	// 9292 17356:aload_0         
	// 9293 17357:getfield        #12  <Field azh a>
	// 9294 17360:getfield        #250 <Field int azh.bj>
	// 9295 17363:ixor            
	// 9296 17364:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9297 17367:aload_0         
	// 9298 17368:getfield        #12  <Field azh a>
	// 9299 17371:astore_1        
		abyte0.bn = ((azh) (abyte0)).R ^ a.bn;
	// 9300 17372:aload_1         
	// 9301 17373:aload_1         
	// 9302 17374:getfield        #346 <Field int azh.R>
	// 9303 17377:aload_0         
	// 9304 17378:getfield        #12  <Field azh a>
	// 9305 17381:getfield        #313 <Field int azh.bn>
	// 9306 17384:ixor            
	// 9307 17385:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9308 17388:aload_0         
	// 9309 17389:getfield        #12  <Field azh a>
	// 9310 17392:astore_1        
		abyte0.bn = ((azh) (abyte0)).bn & ~a.D;
	// 9311 17393:aload_1         
	// 9312 17394:aload_1         
	// 9313 17395:getfield        #313 <Field int azh.bn>
	// 9314 17398:aload_0         
	// 9315 17399:getfield        #12  <Field azh a>
	// 9316 17402:getfield        #211 <Field int azh.D>
	// 9317 17405:iconst_m1       
	// 9318 17406:ixor            
	// 9319 17407:iand            
	// 9320 17408:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9321 17411:aload_0         
	// 9322 17412:getfield        #12  <Field azh a>
	// 9323 17415:astore_1        
		abyte0.be = ((azh) (abyte0)).R ^ a.be;
	// 9324 17416:aload_1         
	// 9325 17417:aload_1         
	// 9326 17418:getfield        #346 <Field int azh.R>
	// 9327 17421:aload_0         
	// 9328 17422:getfield        #12  <Field azh a>
	// 9329 17425:getfield        #477 <Field int azh.be>
	// 9330 17428:ixor            
	// 9331 17429:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 9332 17432:aload_0         
	// 9333 17433:getfield        #12  <Field azh a>
	// 9334 17436:astore_1        
		abyte0.be = ((azh) (abyte0)).D | a.be;
	// 9335 17437:aload_1         
	// 9336 17438:aload_1         
	// 9337 17439:getfield        #211 <Field int azh.D>
	// 9338 17442:aload_0         
	// 9339 17443:getfield        #12  <Field azh a>
	// 9340 17446:getfield        #477 <Field int azh.be>
	// 9341 17449:ior             
	// 9342 17450:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 9343 17453:aload_0         
	// 9344 17454:getfield        #12  <Field azh a>
	// 9345 17457:astore_1        
		abyte0.cf = ((azh) (abyte0)).R ^ a.cf;
	// 9346 17458:aload_1         
	// 9347 17459:aload_1         
	// 9348 17460:getfield        #346 <Field int azh.R>
	// 9349 17463:aload_0         
	// 9350 17464:getfield        #12  <Field azh a>
	// 9351 17467:getfield        #492 <Field int azh.cf>
	// 9352 17470:ixor            
	// 9353 17471:putfield        #492 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9354 17474:aload_0         
	// 9355 17475:getfield        #12  <Field azh a>
	// 9356 17478:astore_1        
		abyte0.bw = ((azh) (abyte0)).D & ~a.cf;
	// 9357 17479:aload_1         
	// 9358 17480:aload_1         
	// 9359 17481:getfield        #211 <Field int azh.D>
	// 9360 17484:aload_0         
	// 9361 17485:getfield        #12  <Field azh a>
	// 9362 17488:getfield        #492 <Field int azh.cf>
	// 9363 17491:iconst_m1       
	// 9364 17492:ixor            
	// 9365 17493:iand            
	// 9366 17494:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 9367 17497:aload_0         
	// 9368 17498:getfield        #12  <Field azh a>
	// 9369 17501:astore_1        
		abyte0.bw = ((azh) (abyte0)).bj ^ a.bw;
	// 9370 17502:aload_1         
	// 9371 17503:aload_1         
	// 9372 17504:getfield        #250 <Field int azh.bj>
	// 9373 17507:aload_0         
	// 9374 17508:getfield        #12  <Field azh a>
	// 9375 17511:getfield        #85  <Field int azh.bw>
	// 9376 17514:ixor            
	// 9377 17515:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 9378 17518:aload_0         
	// 9379 17519:getfield        #12  <Field azh a>
	// 9380 17522:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & ~a.L;
	// 9381 17523:aload_1         
	// 9382 17524:aload_1         
	// 9383 17525:getfield        #85  <Field int azh.bw>
	// 9384 17528:aload_0         
	// 9385 17529:getfield        #12  <Field azh a>
	// 9386 17532:getfield        #280 <Field int azh.L>
	// 9387 17535:iconst_m1       
	// 9388 17536:ixor            
	// 9389 17537:iand            
	// 9390 17538:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 9391 17541:aload_0         
	// 9392 17542:getfield        #12  <Field azh a>
	// 9393 17545:astore_1        
		abyte0.cf = ((azh) (abyte0)).D & a.cf;
	// 9394 17546:aload_1         
	// 9395 17547:aload_1         
	// 9396 17548:getfield        #211 <Field int azh.D>
	// 9397 17551:aload_0         
	// 9398 17552:getfield        #12  <Field azh a>
	// 9399 17555:getfield        #492 <Field int azh.cf>
	// 9400 17558:iand            
	// 9401 17559:putfield        #492 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9402 17562:aload_0         
	// 9403 17563:getfield        #12  <Field azh a>
	// 9404 17566:astore_1        
		abyte0.R = ((azh) (abyte0)).R & ~a.D;
	// 9405 17567:aload_1         
	// 9406 17568:aload_1         
	// 9407 17569:getfield        #346 <Field int azh.R>
	// 9408 17572:aload_0         
	// 9409 17573:getfield        #12  <Field azh a>
	// 9410 17576:getfield        #211 <Field int azh.D>
	// 9411 17579:iconst_m1       
	// 9412 17580:ixor            
	// 9413 17581:iand            
	// 9414 17582:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9415 17585:aload_0         
	// 9416 17586:getfield        #12  <Field azh a>
	// 9417 17589:astore_1        
		abyte0.bm = ((azh) (abyte0)).aG & a.f;
	// 9418 17590:aload_1         
	// 9419 17591:aload_1         
	// 9420 17592:getfield        #337 <Field int azh.aG>
	// 9421 17595:aload_0         
	// 9422 17596:getfield        #12  <Field azh a>
	// 9423 17599:getfield        #495 <Field int azh.f>
	// 9424 17602:iand            
	// 9425 17603:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9426 17606:aload_0         
	// 9427 17607:getfield        #12  <Field azh a>
	// 9428 17610:astore_1        
		abyte0.bm = ((azh) (abyte0)).cb ^ a.bm;
	// 9429 17611:aload_1         
	// 9430 17612:aload_1         
	// 9431 17613:getfield        #486 <Field int azh.cb>
	// 9432 17616:aload_0         
	// 9433 17617:getfield        #12  <Field azh a>
	// 9434 17620:getfield        #175 <Field int azh.bm>
	// 9435 17623:ixor            
	// 9436 17624:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9437 17627:aload_0         
	// 9438 17628:getfield        #12  <Field azh a>
	// 9439 17631:astore_1        
		abyte0.bn = ((azh) (abyte0)).bm ^ a.bn;
	// 9440 17632:aload_1         
	// 9441 17633:aload_1         
	// 9442 17634:getfield        #175 <Field int azh.bm>
	// 9443 17637:aload_0         
	// 9444 17638:getfield        #12  <Field azh a>
	// 9445 17641:getfield        #313 <Field int azh.bn>
	// 9446 17644:ixor            
	// 9447 17645:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9448 17648:aload_0         
	// 9449 17649:getfield        #12  <Field azh a>
	// 9450 17652:astore_1        
		abyte0.bw = ((azh) (abyte0)).bn ^ a.bw;
	// 9451 17653:aload_1         
	// 9452 17654:aload_1         
	// 9453 17655:getfield        #313 <Field int azh.bn>
	// 9454 17658:aload_0         
	// 9455 17659:getfield        #12  <Field azh a>
	// 9456 17662:getfield        #85  <Field int azh.bw>
	// 9457 17665:ixor            
	// 9458 17666:putfield        #85  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 9459 17669:aload_0         
	// 9460 17670:getfield        #12  <Field azh a>
	// 9461 17673:astore_1        
		abyte0.bn = ((azh) (abyte0)).f & ~a.Z;
	// 9462 17674:aload_1         
	// 9463 17675:aload_1         
	// 9464 17676:getfield        #495 <Field int azh.f>
	// 9465 17679:aload_0         
	// 9466 17680:getfield        #12  <Field azh a>
	// 9467 17683:getfield        #229 <Field int azh.Z>
	// 9468 17686:iconst_m1       
	// 9469 17687:ixor            
	// 9470 17688:iand            
	// 9471 17689:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9472 17692:aload_0         
	// 9473 17693:getfield        #12  <Field azh a>
	// 9474 17696:astore_1        
		abyte0.bm = ((azh) (abyte0)).bn & a.bY;
	// 9475 17697:aload_1         
	// 9476 17698:aload_1         
	// 9477 17699:getfield        #313 <Field int azh.bn>
	// 9478 17702:aload_0         
	// 9479 17703:getfield        #12  <Field azh a>
	// 9480 17706:getfield        #262 <Field int azh.bY>
	// 9481 17709:iand            
	// 9482 17710:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9483 17713:aload_0         
	// 9484 17714:getfield        #12  <Field azh a>
	// 9485 17717:astore_1        
		abyte0.bm = ((azh) (abyte0)).s ^ a.bm;
	// 9486 17718:aload_1         
	// 9487 17719:aload_1         
	// 9488 17720:getfield        #450 <Field int azh.s>
	// 9489 17723:aload_0         
	// 9490 17724:getfield        #12  <Field azh a>
	// 9491 17727:getfield        #175 <Field int azh.bm>
	// 9492 17730:ixor            
	// 9493 17731:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9494 17734:aload_0         
	// 9495 17735:getfield        #12  <Field azh a>
	// 9496 17738:astore_1        
		abyte0.s = ((azh) (abyte0)).br & a.bn;
	// 9497 17739:aload_1         
	// 9498 17740:aload_1         
	// 9499 17741:getfield        #205 <Field int azh.br>
	// 9500 17744:aload_0         
	// 9501 17745:getfield        #12  <Field azh a>
	// 9502 17748:getfield        #313 <Field int azh.bn>
	// 9503 17751:iand            
	// 9504 17752:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9505 17755:aload_0         
	// 9506 17756:getfield        #12  <Field azh a>
	// 9507 17759:astore_1        
		abyte0.bK = ((azh) (abyte0)).bn ^ a.bK;
	// 9508 17760:aload_1         
	// 9509 17761:aload_1         
	// 9510 17762:getfield        #313 <Field int azh.bn>
	// 9511 17765:aload_0         
	// 9512 17766:getfield        #12  <Field azh a>
	// 9513 17769:getfield        #453 <Field int azh.bK>
	// 9514 17772:ixor            
	// 9515 17773:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 9516 17776:aload_0         
	// 9517 17777:getfield        #12  <Field azh a>
	// 9518 17780:astore_1        
		abyte0.bK = ((azh) (abyte0)).bK & a.ax;
	// 9519 17781:aload_1         
	// 9520 17782:aload_1         
	// 9521 17783:getfield        #453 <Field int azh.bK>
	// 9522 17786:aload_0         
	// 9523 17787:getfield        #12  <Field azh a>
	// 9524 17790:getfield        #349 <Field int azh.ax>
	// 9525 17793:iand            
	// 9526 17794:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 9527 17797:aload_0         
	// 9528 17798:getfield        #12  <Field azh a>
	// 9529 17801:astore_1        
		abyte0.bp = ((azh) (abyte0)).bn ^ a.bp;
	// 9530 17802:aload_1         
	// 9531 17803:aload_1         
	// 9532 17804:getfield        #313 <Field int azh.bn>
	// 9533 17807:aload_0         
	// 9534 17808:getfield        #12  <Field azh a>
	// 9535 17811:getfield        #193 <Field int azh.bp>
	// 9536 17814:ixor            
	// 9537 17815:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 9538 17818:aload_0         
	// 9539 17819:getfield        #12  <Field azh a>
	// 9540 17822:astore_1        
		abyte0.bp = ((azh) (abyte0)).bp & a.bY;
	// 9541 17823:aload_1         
	// 9542 17824:aload_1         
	// 9543 17825:getfield        #193 <Field int azh.bp>
	// 9544 17828:aload_0         
	// 9545 17829:getfield        #12  <Field azh a>
	// 9546 17832:getfield        #262 <Field int azh.bY>
	// 9547 17835:iand            
	// 9548 17836:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 9549 17839:aload_0         
	// 9550 17840:getfield        #12  <Field azh a>
	// 9551 17843:astore_1        
		abyte0.bn = ((azh) (abyte0)).br & a.f;
	// 9552 17844:aload_1         
	// 9553 17845:aload_1         
	// 9554 17846:getfield        #205 <Field int azh.br>
	// 9555 17849:aload_0         
	// 9556 17850:getfield        #12  <Field azh a>
	// 9557 17853:getfield        #495 <Field int azh.f>
	// 9558 17856:iand            
	// 9559 17857:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9560 17860:aload_0         
	// 9561 17861:getfield        #12  <Field azh a>
	// 9562 17864:astore_1        
		abyte0.bn = ((azh) (abyte0)).am ^ a.bn;
	// 9563 17865:aload_1         
	// 9564 17866:aload_1         
	// 9565 17867:getfield        #409 <Field int azh.am>
	// 9566 17870:aload_0         
	// 9567 17871:getfield        #12  <Field azh a>
	// 9568 17874:getfield        #313 <Field int azh.bn>
	// 9569 17877:ixor            
	// 9570 17878:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9571 17881:aload_0         
	// 9572 17882:getfield        #12  <Field azh a>
	// 9573 17885:astore_1        
		abyte0.cb = ((azh) (abyte0)).br & a.f;
	// 9574 17886:aload_1         
	// 9575 17887:aload_1         
	// 9576 17888:getfield        #205 <Field int azh.br>
	// 9577 17891:aload_0         
	// 9578 17892:getfield        #12  <Field azh a>
	// 9579 17895:getfield        #495 <Field int azh.f>
	// 9580 17898:iand            
	// 9581 17899:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9582 17902:aload_0         
	// 9583 17903:getfield        #12  <Field azh a>
	// 9584 17906:astore_1        
		abyte0.cb = ((azh) (abyte0)).bN ^ a.cb;
	// 9585 17907:aload_1         
	// 9586 17908:aload_1         
	// 9587 17909:getfield        #432 <Field int azh.bN>
	// 9588 17912:aload_0         
	// 9589 17913:getfield        #12  <Field azh a>
	// 9590 17916:getfield        #486 <Field int azh.cb>
	// 9591 17919:ixor            
	// 9592 17920:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9593 17923:aload_0         
	// 9594 17924:getfield        #12  <Field azh a>
	// 9595 17927:astore_1        
		abyte0.bC = ((azh) (abyte0)).cb ^ a.bC;
	// 9596 17928:aload_1         
	// 9597 17929:aload_1         
	// 9598 17930:getfield        #486 <Field int azh.cb>
	// 9599 17933:aload_0         
	// 9600 17934:getfield        #12  <Field azh a>
	// 9601 17937:getfield        #208 <Field int azh.bC>
	// 9602 17940:ixor            
	// 9603 17941:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 9604 17944:aload_0         
	// 9605 17945:getfield        #12  <Field azh a>
	// 9606 17948:astore_1        
		abyte0.bC = ((azh) (abyte0)).ax & ~a.bC;
	// 9607 17949:aload_1         
	// 9608 17950:aload_1         
	// 9609 17951:getfield        #349 <Field int azh.ax>
	// 9610 17954:aload_0         
	// 9611 17955:getfield        #12  <Field azh a>
	// 9612 17958:getfield        #208 <Field int azh.bC>
	// 9613 17961:iconst_m1       
	// 9614 17962:ixor            
	// 9615 17963:iand            
	// 9616 17964:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 9617 17967:aload_0         
	// 9618 17968:getfield        #12  <Field azh a>
	// 9619 17971:astore_1        
		abyte0.cb = ((azh) (abyte0)).f | a.v;
	// 9620 17972:aload_1         
	// 9621 17973:aload_1         
	// 9622 17974:getfield        #495 <Field int azh.f>
	// 9623 17977:aload_0         
	// 9624 17978:getfield        #12  <Field azh a>
	// 9625 17981:getfield        #471 <Field int azh.v>
	// 9626 17984:ior             
	// 9627 17985:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9628 17988:aload_0         
	// 9629 17989:getfield        #12  <Field azh a>
	// 9630 17992:astore_1        
		abyte0.cc = ((azh) (abyte0)).cb ^ a.cc;
	// 9631 17993:aload_1         
	// 9632 17994:aload_1         
	// 9633 17995:getfield        #486 <Field int azh.cb>
	// 9634 17998:aload_0         
	// 9635 17999:getfield        #12  <Field azh a>
	// 9636 18002:getfield        #459 <Field int azh.cc>
	// 9637 18005:ixor            
	// 9638 18006:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9639 18009:aload_0         
	// 9640 18010:getfield        #12  <Field azh a>
	// 9641 18013:astore_1        
		abyte0.n = ((azh) (abyte0)).cc ^ a.n;
	// 9642 18014:aload_1         
	// 9643 18015:aload_1         
	// 9644 18016:getfield        #459 <Field int azh.cc>
	// 9645 18019:aload_0         
	// 9646 18020:getfield        #12  <Field azh a>
	// 9647 18023:getfield        #474 <Field int azh.n>
	// 9648 18026:ixor            
	// 9649 18027:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9650 18030:aload_0         
	// 9651 18031:getfield        #12  <Field azh a>
	// 9652 18034:astore_1        
		abyte0.cc = ((azh) (abyte0)).cb & ~a.v;
	// 9653 18035:aload_1         
	// 9654 18036:aload_1         
	// 9655 18037:getfield        #486 <Field int azh.cb>
	// 9656 18040:aload_0         
	// 9657 18041:getfield        #12  <Field azh a>
	// 9658 18044:getfield        #471 <Field int azh.v>
	// 9659 18047:iconst_m1       
	// 9660 18048:ixor            
	// 9661 18049:iand            
	// 9662 18050:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9663 18053:aload_0         
	// 9664 18054:getfield        #12  <Field azh a>
	// 9665 18057:astore_1        
		abyte0.cc = ((azh) (abyte0)).aG & ~a.cc;
	// 9666 18058:aload_1         
	// 9667 18059:aload_1         
	// 9668 18060:getfield        #337 <Field int azh.aG>
	// 9669 18063:aload_0         
	// 9670 18064:getfield        #12  <Field azh a>
	// 9671 18067:getfield        #459 <Field int azh.cc>
	// 9672 18070:iconst_m1       
	// 9673 18071:ixor            
	// 9674 18072:iand            
	// 9675 18073:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9676 18076:aload_0         
	// 9677 18077:getfield        #12  <Field azh a>
	// 9678 18080:astore_1        
		abyte0.ag = ((azh) (abyte0)).D | a.cb;
	// 9679 18081:aload_1         
	// 9680 18082:aload_1         
	// 9681 18083:getfield        #211 <Field int azh.D>
	// 9682 18086:aload_0         
	// 9683 18087:getfield        #12  <Field azh a>
	// 9684 18090:getfield        #486 <Field int azh.cb>
	// 9685 18093:ior             
	// 9686 18094:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 9687 18097:aload_0         
	// 9688 18098:getfield        #12  <Field azh a>
	// 9689 18101:astore_1        
		abyte0.ag = ((azh) (abyte0)).bj ^ a.ag;
	// 9690 18102:aload_1         
	// 9691 18103:aload_1         
	// 9692 18104:getfield        #250 <Field int azh.bj>
	// 9693 18107:aload_0         
	// 9694 18108:getfield        #12  <Field azh a>
	// 9695 18111:getfield        #29  <Field int azh.ag>
	// 9696 18114:ixor            
	// 9697 18115:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 9698 18118:aload_0         
	// 9699 18119:getfield        #12  <Field azh a>
	// 9700 18122:astore_1        
		abyte0.ag = ((azh) (abyte0)).ag & ~a.L;
	// 9701 18123:aload_1         
	// 9702 18124:aload_1         
	// 9703 18125:getfield        #29  <Field int azh.ag>
	// 9704 18128:aload_0         
	// 9705 18129:getfield        #12  <Field azh a>
	// 9706 18132:getfield        #280 <Field int azh.L>
	// 9707 18135:iconst_m1       
	// 9708 18136:ixor            
	// 9709 18137:iand            
	// 9710 18138:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 9711 18141:aload_0         
	// 9712 18142:getfield        #12  <Field azh a>
	// 9713 18145:astore_1        
		abyte0.cb = ((azh) (abyte0)).aG & a.cb;
	// 9714 18146:aload_1         
	// 9715 18147:aload_1         
	// 9716 18148:getfield        #337 <Field int azh.aG>
	// 9717 18151:aload_0         
	// 9718 18152:getfield        #12  <Field azh a>
	// 9719 18155:getfield        #486 <Field int azh.cb>
	// 9720 18158:iand            
	// 9721 18159:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9722 18162:aload_0         
	// 9723 18163:getfield        #12  <Field azh a>
	// 9724 18166:astore_1        
		abyte0.cf = ((azh) (abyte0)).cb ^ a.cf;
	// 9725 18167:aload_1         
	// 9726 18168:aload_1         
	// 9727 18169:getfield        #486 <Field int azh.cb>
	// 9728 18172:aload_0         
	// 9729 18173:getfield        #12  <Field azh a>
	// 9730 18176:getfield        #492 <Field int azh.cf>
	// 9731 18179:ixor            
	// 9732 18180:putfield        #492 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9733 18183:aload_0         
	// 9734 18184:getfield        #12  <Field azh a>
	// 9735 18187:astore_1        
		abyte0.cf = ((azh) (abyte0)).cf | a.L;
	// 9736 18188:aload_1         
	// 9737 18189:aload_1         
	// 9738 18190:getfield        #492 <Field int azh.cf>
	// 9739 18193:aload_0         
	// 9740 18194:getfield        #12  <Field azh a>
	// 9741 18197:getfield        #280 <Field int azh.L>
	// 9742 18200:ior             
	// 9743 18201:putfield        #492 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9744 18204:aload_0         
	// 9745 18205:getfield        #12  <Field azh a>
	// 9746 18208:astore_1        
		abyte0.R = ((azh) (abyte0)).cb ^ a.R;
	// 9747 18209:aload_1         
	// 9748 18210:aload_1         
	// 9749 18211:getfield        #486 <Field int azh.cb>
	// 9750 18214:aload_0         
	// 9751 18215:getfield        #12  <Field azh a>
	// 9752 18218:getfield        #346 <Field int azh.R>
	// 9753 18221:ixor            
	// 9754 18222:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9755 18225:aload_0         
	// 9756 18226:getfield        #12  <Field azh a>
	// 9757 18229:astore_1        
		abyte0.R = ((azh) (abyte0)).R & ~a.L;
	// 9758 18230:aload_1         
	// 9759 18231:aload_1         
	// 9760 18232:getfield        #346 <Field int azh.R>
	// 9761 18235:aload_0         
	// 9762 18236:getfield        #12  <Field azh a>
	// 9763 18239:getfield        #280 <Field int azh.L>
	// 9764 18242:iconst_m1       
	// 9765 18243:ixor            
	// 9766 18244:iand            
	// 9767 18245:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9768 18248:aload_0         
	// 9769 18249:getfield        #12  <Field azh a>
	// 9770 18252:astore_1        
		abyte0.R = ((azh) (abyte0)).n ^ a.R;
	// 9771 18253:aload_1         
	// 9772 18254:aload_1         
	// 9773 18255:getfield        #474 <Field int azh.n>
	// 9774 18258:aload_0         
	// 9775 18259:getfield        #12  <Field azh a>
	// 9776 18262:getfield        #346 <Field int azh.R>
	// 9777 18265:ixor            
	// 9778 18266:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9779 18269:aload_0         
	// 9780 18270:getfield        #12  <Field azh a>
	// 9781 18273:astore_1        
		abyte0.n = ((azh) (abyte0)).R & ~a.br;
	// 9782 18274:aload_1         
	// 9783 18275:aload_1         
	// 9784 18276:getfield        #346 <Field int azh.R>
	// 9785 18279:aload_0         
	// 9786 18280:getfield        #12  <Field azh a>
	// 9787 18283:getfield        #205 <Field int azh.br>
	// 9788 18286:iconst_m1       
	// 9789 18287:ixor            
	// 9790 18288:iand            
	// 9791 18289:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9792 18292:aload_0         
	// 9793 18293:getfield        #12  <Field azh a>
	// 9794 18296:astore_1        
		abyte0.R = ((azh) (abyte0)).br & ~a.R;
	// 9795 18297:aload_1         
	// 9796 18298:aload_1         
	// 9797 18299:getfield        #205 <Field int azh.br>
	// 9798 18302:aload_0         
	// 9799 18303:getfield        #12  <Field azh a>
	// 9800 18306:getfield        #346 <Field int azh.R>
	// 9801 18309:iconst_m1       
	// 9802 18310:ixor            
	// 9803 18311:iand            
	// 9804 18312:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9805 18315:aload_0         
	// 9806 18316:getfield        #12  <Field azh a>
	// 9807 18319:astore_1        
		abyte0.cb = ((azh) (abyte0)).Z | a.f;
	// 9808 18320:aload_1         
	// 9809 18321:aload_1         
	// 9810 18322:getfield        #229 <Field int azh.Z>
	// 9811 18325:aload_0         
	// 9812 18326:getfield        #12  <Field azh a>
	// 9813 18329:getfield        #495 <Field int azh.f>
	// 9814 18332:ior             
	// 9815 18333:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9816 18336:aload_0         
	// 9817 18337:getfield        #12  <Field azh a>
	// 9818 18340:astore_1        
		abyte0.bj = ((azh) (abyte0)).cb & ~a.f;
	// 9819 18341:aload_1         
	// 9820 18342:aload_1         
	// 9821 18343:getfield        #486 <Field int azh.cb>
	// 9822 18346:aload_0         
	// 9823 18347:getfield        #12  <Field azh a>
	// 9824 18350:getfield        #495 <Field int azh.f>
	// 9825 18353:iconst_m1       
	// 9826 18354:ixor            
	// 9827 18355:iand            
	// 9828 18356:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9829 18359:aload_0         
	// 9830 18360:getfield        #12  <Field azh a>
	// 9831 18363:astore_1        
		abyte0.aV = ((azh) (abyte0)).bj ^ a.aV;
	// 9832 18364:aload_1         
	// 9833 18365:aload_1         
	// 9834 18366:getfield        #250 <Field int azh.bj>
	// 9835 18369:aload_0         
	// 9836 18370:getfield        #12  <Field azh a>
	// 9837 18373:getfield        #73  <Field int azh.aV>
	// 9838 18376:ixor            
	// 9839 18377:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9840 18380:aload_0         
	// 9841 18381:getfield        #12  <Field azh a>
	// 9842 18384:astore_1        
		abyte0.aV = ((azh) (abyte0)).bY & ~a.aV;
	// 9843 18385:aload_1         
	// 9844 18386:aload_1         
	// 9845 18387:getfield        #262 <Field int azh.bY>
	// 9846 18390:aload_0         
	// 9847 18391:getfield        #12  <Field azh a>
	// 9848 18394:getfield        #73  <Field int azh.aV>
	// 9849 18397:iconst_m1       
	// 9850 18398:ixor            
	// 9851 18399:iand            
	// 9852 18400:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9853 18403:aload_0         
	// 9854 18404:getfield        #12  <Field azh a>
	// 9855 18407:astore_1        
		abyte0.aV = ((azh) (abyte0)).bn ^ a.aV;
	// 9856 18408:aload_1         
	// 9857 18409:aload_1         
	// 9858 18410:getfield        #313 <Field int azh.bn>
	// 9859 18413:aload_0         
	// 9860 18414:getfield        #12  <Field azh a>
	// 9861 18417:getfield        #73  <Field int azh.aV>
	// 9862 18420:ixor            
	// 9863 18421:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9864 18424:aload_0         
	// 9865 18425:getfield        #12  <Field azh a>
	// 9866 18428:astore_1        
		abyte0.aV = ((azh) (abyte0)).ax & ~a.aV;
	// 9867 18429:aload_1         
	// 9868 18430:aload_1         
	// 9869 18431:getfield        #349 <Field int azh.ax>
	// 9870 18434:aload_0         
	// 9871 18435:getfield        #12  <Field azh a>
	// 9872 18438:getfield        #73  <Field int azh.aV>
	// 9873 18441:iconst_m1       
	// 9874 18442:ixor            
	// 9875 18443:iand            
	// 9876 18444:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9877 18447:aload_0         
	// 9878 18448:getfield        #12  <Field azh a>
	// 9879 18451:astore_1        
		abyte0.bn = ((azh) (abyte0)).br & ~a.bj;
	// 9880 18452:aload_1         
	// 9881 18453:aload_1         
	// 9882 18454:getfield        #205 <Field int azh.br>
	// 9883 18457:aload_0         
	// 9884 18458:getfield        #12  <Field azh a>
	// 9885 18461:getfield        #250 <Field int azh.bj>
	// 9886 18464:iconst_m1       
	// 9887 18465:ixor            
	// 9888 18466:iand            
	// 9889 18467:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9890 18470:aload_0         
	// 9891 18471:getfield        #12  <Field azh a>
	// 9892 18474:astore_1        
		abyte0.bn = ((azh) (abyte0)).bN ^ a.bn;
	// 9893 18475:aload_1         
	// 9894 18476:aload_1         
	// 9895 18477:getfield        #432 <Field int azh.bN>
	// 9896 18480:aload_0         
	// 9897 18481:getfield        #12  <Field azh a>
	// 9898 18484:getfield        #313 <Field int azh.bn>
	// 9899 18487:ixor            
	// 9900 18488:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9901 18491:aload_0         
	// 9902 18492:getfield        #12  <Field azh a>
	// 9903 18495:astore_1        
		abyte0.bn = ((azh) (abyte0)).bY & ~a.bn;
	// 9904 18496:aload_1         
	// 9905 18497:aload_1         
	// 9906 18498:getfield        #262 <Field int azh.bY>
	// 9907 18501:aload_0         
	// 9908 18502:getfield        #12  <Field azh a>
	// 9909 18505:getfield        #313 <Field int azh.bn>
	// 9910 18508:iconst_m1       
	// 9911 18509:ixor            
	// 9912 18510:iand            
	// 9913 18511:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9914 18514:aload_0         
	// 9915 18515:getfield        #12  <Field azh a>
	// 9916 18518:astore_1        
		abyte0.at = ((azh) (abyte0)).bY & ~a.bj;
	// 9917 18519:aload_1         
	// 9918 18520:aload_1         
	// 9919 18521:getfield        #262 <Field int azh.bY>
	// 9920 18524:aload_0         
	// 9921 18525:getfield        #12  <Field azh a>
	// 9922 18528:getfield        #250 <Field int azh.bj>
	// 9923 18531:iconst_m1       
	// 9924 18532:ixor            
	// 9925 18533:iand            
	// 9926 18534:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9927 18537:aload_0         
	// 9928 18538:getfield        #12  <Field azh a>
	// 9929 18541:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ax & ~a.bj;
	// 9930 18542:aload_1         
	// 9931 18543:aload_1         
	// 9932 18544:getfield        #349 <Field int azh.ax>
	// 9933 18547:aload_0         
	// 9934 18548:getfield        #12  <Field azh a>
	// 9935 18551:getfield        #250 <Field int azh.bj>
	// 9936 18554:iconst_m1       
	// 9937 18555:ixor            
	// 9938 18556:iand            
	// 9939 18557:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9940 18560:aload_0         
	// 9941 18561:getfield        #12  <Field azh a>
	// 9942 18564:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bx ^ a.bZ;
	// 9943 18565:aload_1         
	// 9944 18566:aload_1         
	// 9945 18567:getfield        #70  <Field int azh.bx>
	// 9946 18570:aload_0         
	// 9947 18571:getfield        #12  <Field azh a>
	// 9948 18574:getfield        #76  <Field int azh.bZ>
	// 9949 18577:ixor            
	// 9950 18578:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9951 18581:aload_0         
	// 9952 18582:getfield        #12  <Field azh a>
	// 9953 18585:astore_1        
		abyte0.s = ((azh) (abyte0)).cb ^ a.s;
	// 9954 18586:aload_1         
	// 9955 18587:aload_1         
	// 9956 18588:getfield        #486 <Field int azh.cb>
	// 9957 18591:aload_0         
	// 9958 18592:getfield        #12  <Field azh a>
	// 9959 18595:getfield        #450 <Field int azh.s>
	// 9960 18598:ixor            
	// 9961 18599:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9962 18602:aload_0         
	// 9963 18603:getfield        #12  <Field azh a>
	// 9964 18606:astore_1        
		abyte0.at = ((azh) (abyte0)).s ^ a.at;
	// 9965 18607:aload_1         
	// 9966 18608:aload_1         
	// 9967 18609:getfield        #450 <Field int azh.s>
	// 9968 18612:aload_0         
	// 9969 18613:getfield        #12  <Field azh a>
	// 9970 18616:getfield        #44  <Field int azh.at>
	// 9971 18619:ixor            
	// 9972 18620:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9973 18623:aload_0         
	// 9974 18624:getfield        #12  <Field azh a>
	// 9975 18627:astore_1        
		abyte0.s = ((azh) (abyte0)).br & a.cb;
	// 9976 18628:aload_1         
	// 9977 18629:aload_1         
	// 9978 18630:getfield        #205 <Field int azh.br>
	// 9979 18633:aload_0         
	// 9980 18634:getfield        #12  <Field azh a>
	// 9981 18637:getfield        #486 <Field int azh.cb>
	// 9982 18640:iand            
	// 9983 18641:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9984 18644:aload_0         
	// 9985 18645:getfield        #12  <Field azh a>
	// 9986 18648:astore_1        
		abyte0.s = ((azh) (abyte0)).bj ^ a.s;
	// 9987 18649:aload_1         
	// 9988 18650:aload_1         
	// 9989 18651:getfield        #250 <Field int azh.bj>
	// 9990 18654:aload_0         
	// 9991 18655:getfield        #12  <Field azh a>
	// 9992 18658:getfield        #450 <Field int azh.s>
	// 9993 18661:ixor            
	// 9994 18662:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9995 18665:aload_0         
	// 9996 18666:getfield        #12  <Field azh a>
	// 9997 18669:astore_1        
		abyte0.bn = ((azh) (abyte0)).s ^ a.bn;
	// 9998 18670:aload_1         
	// 9999 18671:aload_1         
	// 10000 18672:getfield        #450 <Field int azh.s>
	// 10001 18675:aload_0         
	// 10002 18676:getfield        #12  <Field azh a>
	// 10003 18679:getfield        #313 <Field int azh.bn>
	// 10004 18682:ixor            
	// 10005 18683:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 10006 18686:aload_0         
	// 10007 18687:getfield        #12  <Field azh a>
	// 10008 18690:astore_1        
		abyte0.aV = ((azh) (abyte0)).bn ^ a.aV;
	// 10009 18691:aload_1         
	// 10010 18692:aload_1         
	// 10011 18693:getfield        #313 <Field int azh.bn>
	// 10012 18696:aload_0         
	// 10013 18697:getfield        #12  <Field azh a>
	// 10014 18700:getfield        #73  <Field int azh.aV>
	// 10015 18703:ixor            
	// 10016 18704:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10017 18707:aload_0         
	// 10018 18708:getfield        #12  <Field azh a>
	// 10019 18711:astore_1        
		abyte0.bn = ((azh) (abyte0)).br & a.cb;
	// 10020 18712:aload_1         
	// 10021 18713:aload_1         
	// 10022 18714:getfield        #205 <Field int azh.br>
	// 10023 18717:aload_0         
	// 10024 18718:getfield        #12  <Field azh a>
	// 10025 18721:getfield        #486 <Field int azh.cb>
	// 10026 18724:iand            
	// 10027 18725:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 10028 18728:aload_0         
	// 10029 18729:getfield        #12  <Field azh a>
	// 10030 18732:astore_1        
		abyte0.bn = ((azh) (abyte0)).f ^ a.bn;
	// 10031 18733:aload_1         
	// 10032 18734:aload_1         
	// 10033 18735:getfield        #495 <Field int azh.f>
	// 10034 18738:aload_0         
	// 10035 18739:getfield        #12  <Field azh a>
	// 10036 18742:getfield        #313 <Field int azh.bn>
	// 10037 18745:ixor            
	// 10038 18746:putfield        #313 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 10039 18749:aload_0         
	// 10040 18750:getfield        #12  <Field azh a>
	// 10041 18753:astore_1        
		abyte0.bp = ((azh) (abyte0)).bn ^ a.bp;
	// 10042 18754:aload_1         
	// 10043 18755:aload_1         
	// 10044 18756:getfield        #313 <Field int azh.bn>
	// 10045 18759:aload_0         
	// 10046 18760:getfield        #12  <Field azh a>
	// 10047 18763:getfield        #193 <Field int azh.bp>
	// 10048 18766:ixor            
	// 10049 18767:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 10050 18770:aload_0         
	// 10051 18771:getfield        #12  <Field azh a>
	// 10052 18774:astore_1        
		abyte0.bK = ((azh) (abyte0)).bp ^ a.bK;
	// 10053 18775:aload_1         
	// 10054 18776:aload_1         
	// 10055 18777:getfield        #193 <Field int azh.bp>
	// 10056 18780:aload_0         
	// 10057 18781:getfield        #12  <Field azh a>
	// 10058 18784:getfield        #453 <Field int azh.bK>
	// 10059 18787:ixor            
	// 10060 18788:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10061 18791:aload_0         
	// 10062 18792:getfield        #12  <Field azh a>
	// 10063 18795:astore_1        
		abyte0.bK = ((azh) (abyte0)).H & ~a.bK;
	// 10064 18796:aload_1         
	// 10065 18797:aload_1         
	// 10066 18798:getfield        #498 <Field int azh.H>
	// 10067 18801:aload_0         
	// 10068 18802:getfield        #12  <Field azh a>
	// 10069 18805:getfield        #453 <Field int azh.bK>
	// 10070 18808:iconst_m1       
	// 10071 18809:ixor            
	// 10072 18810:iand            
	// 10073 18811:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10074 18814:aload_0         
	// 10075 18815:getfield        #12  <Field azh a>
	// 10076 18818:astore_1        
		abyte0.bK = ((azh) (abyte0)).bZ ^ a.bK;
	// 10077 18819:aload_1         
	// 10078 18820:aload_1         
	// 10079 18821:getfield        #76  <Field int azh.bZ>
	// 10080 18824:aload_0         
	// 10081 18825:getfield        #12  <Field azh a>
	// 10082 18828:getfield        #453 <Field int azh.bK>
	// 10083 18831:ixor            
	// 10084 18832:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10085 18835:aload_0         
	// 10086 18836:getfield        #12  <Field azh a>
	// 10087 18839:astore_1        
		abyte0.u = ((azh) (abyte0)).bK ^ a.u;
	// 10088 18840:aload_1         
	// 10089 18841:aload_1         
	// 10090 18842:getfield        #453 <Field int azh.bK>
	// 10091 18845:aload_0         
	// 10092 18846:getfield        #12  <Field azh a>
	// 10093 18849:getfield        #352 <Field int azh.u>
	// 10094 18852:ixor            
	// 10095 18853:putfield        #352 <Field int azh.u>
		abyte0 = ((byte []) (a));
	// 10096 18856:aload_0         
	// 10097 18857:getfield        #12  <Field azh a>
	// 10098 18860:astore_1        
		abyte0.bK = ((azh) (abyte0)).e & a.u;
	// 10099 18861:aload_1         
	// 10100 18862:aload_1         
	// 10101 18863:getfield        #355 <Field int azh.e>
	// 10102 18866:aload_0         
	// 10103 18867:getfield        #12  <Field azh a>
	// 10104 18870:getfield        #352 <Field int azh.u>
	// 10105 18873:iand            
	// 10106 18874:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10107 18877:aload_0         
	// 10108 18878:getfield        #12  <Field azh a>
	// 10109 18881:astore_1        
		abyte0.bK = ((azh) (abyte0)).u & ~a.bK;
	// 10110 18882:aload_1         
	// 10111 18883:aload_1         
	// 10112 18884:getfield        #352 <Field int azh.u>
	// 10113 18887:aload_0         
	// 10114 18888:getfield        #12  <Field azh a>
	// 10115 18891:getfield        #453 <Field int azh.bK>
	// 10116 18894:iconst_m1       
	// 10117 18895:ixor            
	// 10118 18896:iand            
	// 10119 18897:putfield        #453 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10120 18900:aload_0         
	// 10121 18901:getfield        #12  <Field azh a>
	// 10122 18904:astore_1        
		abyte0.bZ = ((azh) (abyte0)).e | a.u;
	// 10123 18905:aload_1         
	// 10124 18906:aload_1         
	// 10125 18907:getfield        #355 <Field int azh.e>
	// 10126 18910:aload_0         
	// 10127 18911:getfield        #12  <Field azh a>
	// 10128 18914:getfield        #352 <Field int azh.u>
	// 10129 18917:ior             
	// 10130 18918:putfield        #76  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 10131 18921:aload_0         
	// 10132 18922:getfield        #12  <Field azh a>
	// 10133 18925:astore_1        
		abyte0.bp = ((azh) (abyte0)).bZ & ~a.u;
	// 10134 18926:aload_1         
	// 10135 18927:aload_1         
	// 10136 18928:getfield        #76  <Field int azh.bZ>
	// 10137 18931:aload_0         
	// 10138 18932:getfield        #12  <Field azh a>
	// 10139 18935:getfield        #352 <Field int azh.u>
	// 10140 18938:iconst_m1       
	// 10141 18939:ixor            
	// 10142 18940:iand            
	// 10143 18941:putfield        #193 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 10144 18944:aload_0         
	// 10145 18945:getfield        #12  <Field azh a>
	// 10146 18948:astore_1        
		abyte0.s = ((azh) (abyte0)).e ^ a.u;
	// 10147 18949:aload_1         
	// 10148 18950:aload_1         
	// 10149 18951:getfield        #355 <Field int azh.e>
	// 10150 18954:aload_0         
	// 10151 18955:getfield        #12  <Field azh a>
	// 10152 18958:getfield        #352 <Field int azh.u>
	// 10153 18961:ixor            
	// 10154 18962:putfield        #450 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 10155 18965:aload_0         
	// 10156 18966:getfield        #12  <Field azh a>
	// 10157 18969:astore_1        
		abyte0.bj = ((azh) (abyte0)).u & ~a.e;
	// 10158 18970:aload_1         
	// 10159 18971:aload_1         
	// 10160 18972:getfield        #352 <Field int azh.u>
	// 10161 18975:aload_0         
	// 10162 18976:getfield        #12  <Field azh a>
	// 10163 18979:getfield        #355 <Field int azh.e>
	// 10164 18982:iconst_m1       
	// 10165 18983:ixor            
	// 10166 18984:iand            
	// 10167 18985:putfield        #250 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10168 18988:aload_0         
	// 10169 18989:getfield        #12  <Field azh a>
	// 10170 18992:astore_1        
		abyte0.bx = ((azh) (abyte0)).e & ~a.u;
	// 10171 18993:aload_1         
	// 10172 18994:aload_1         
	// 10173 18995:getfield        #355 <Field int azh.e>
	// 10174 18998:aload_0         
	// 10175 18999:getfield        #12  <Field azh a>
	// 10176 19002:getfield        #352 <Field int azh.u>
	// 10177 19005:iconst_m1       
	// 10178 19006:ixor            
	// 10179 19007:iand            
	// 10180 19008:putfield        #70  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 10181 19011:aload_0         
	// 10182 19012:getfield        #12  <Field azh a>
	// 10183 19015:astore_1        
		abyte0.bd = ((azh) (abyte0)).bn ^ a.bd;
	// 10184 19016:aload_1         
	// 10185 19017:aload_1         
	// 10186 19018:getfield        #313 <Field int azh.bn>
	// 10187 19021:aload_0         
	// 10188 19022:getfield        #12  <Field azh a>
	// 10189 19025:getfield        #121 <Field int azh.bd>
	// 10190 19028:ixor            
	// 10191 19029:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10192 19032:aload_0         
	// 10193 19033:getfield        #12  <Field azh a>
	// 10194 19036:astore_1        
		abyte0.bC = ((azh) (abyte0)).bd ^ a.bC;
	// 10195 19037:aload_1         
	// 10196 19038:aload_1         
	// 10197 19039:getfield        #121 <Field int azh.bd>
	// 10198 19042:aload_0         
	// 10199 19043:getfield        #12  <Field azh a>
	// 10200 19046:getfield        #208 <Field int azh.bC>
	// 10201 19049:ixor            
	// 10202 19050:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 10203 19053:aload_0         
	// 10204 19054:getfield        #12  <Field azh a>
	// 10205 19057:astore_1        
		abyte0.bC = ((azh) (abyte0)).H & ~a.bC;
	// 10206 19058:aload_1         
	// 10207 19059:aload_1         
	// 10208 19060:getfield        #498 <Field int azh.H>
	// 10209 19063:aload_0         
	// 10210 19064:getfield        #12  <Field azh a>
	// 10211 19067:getfield        #208 <Field int azh.bC>
	// 10212 19070:iconst_m1       
	// 10213 19071:ixor            
	// 10214 19072:iand            
	// 10215 19073:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 10216 19076:aload_0         
	// 10217 19077:getfield        #12  <Field azh a>
	// 10218 19080:astore_1        
		abyte0.bC = ((azh) (abyte0)).aV ^ a.bC;
	// 10219 19081:aload_1         
	// 10220 19082:aload_1         
	// 10221 19083:getfield        #73  <Field int azh.aV>
	// 10222 19086:aload_0         
	// 10223 19087:getfield        #12  <Field azh a>
	// 10224 19090:getfield        #208 <Field int azh.bC>
	// 10225 19093:ixor            
	// 10226 19094:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 10227 19097:aload_0         
	// 10228 19098:getfield        #12  <Field azh a>
	// 10229 19101:astore_1        
		abyte0.bC = ((azh) (abyte0)).bC ^ a.g;
	// 10230 19102:aload_1         
	// 10231 19103:aload_1         
	// 10232 19104:getfield        #208 <Field int azh.bC>
	// 10233 19107:aload_0         
	// 10234 19108:getfield        #12  <Field azh a>
	// 10235 19111:getfield        #160 <Field int azh.g>
	// 10236 19114:ixor            
	// 10237 19115:putfield        #208 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 10238 19118:aload_0         
	// 10239 19119:getfield        #12  <Field azh a>
	// 10240 19122:astore_1        
		abyte0.aV = ((azh) (abyte0)).bC & ~a.ae;
	// 10241 19123:aload_1         
	// 10242 19124:aload_1         
	// 10243 19125:getfield        #208 <Field int azh.bC>
	// 10244 19128:aload_0         
	// 10245 19129:getfield        #12  <Field azh a>
	// 10246 19132:getfield        #217 <Field int azh.ae>
	// 10247 19135:iconst_m1       
	// 10248 19136:ixor            
	// 10249 19137:iand            
	// 10250 19138:putfield        #73  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10251 19141:aload_0         
	// 10252 19142:getfield        #12  <Field azh a>
	// 10253 19145:astore_1        
		abyte0.bd = ((azh) (abyte0)).bC & a.ae;
	// 10254 19146:aload_1         
	// 10255 19147:aload_1         
	// 10256 19148:getfield        #208 <Field int azh.bC>
	// 10257 19151:aload_0         
	// 10258 19152:getfield        #12  <Field azh a>
	// 10259 19155:getfield        #217 <Field int azh.ae>
	// 10260 19158:iand            
	// 10261 19159:putfield        #121 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10262 19162:aload_0         
	// 10263 19163:getfield        #12  <Field azh a>
	// 10264 19166:astore_1        
		abyte0.cb = ((azh) (abyte0)).br & a.cb;
	// 10265 19167:aload_1         
	// 10266 19168:aload_1         
	// 10267 19169:getfield        #205 <Field int azh.br>
	// 10268 19172:aload_0         
	// 10269 19173:getfield        #12  <Field azh a>
	// 10270 19176:getfield        #486 <Field int azh.cb>
	// 10271 19179:iand            
	// 10272 19180:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10273 19183:aload_0         
	// 10274 19184:getfield        #12  <Field azh a>
	// 10275 19187:astore_1        
		abyte0.cb = ((azh) (abyte0)).Z ^ a.cb;
	// 10276 19188:aload_1         
	// 10277 19189:aload_1         
	// 10278 19190:getfield        #229 <Field int azh.Z>
	// 10279 19193:aload_0         
	// 10280 19194:getfield        #12  <Field azh a>
	// 10281 19197:getfield        #486 <Field int azh.cb>
	// 10282 19200:ixor            
	// 10283 19201:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10284 19204:aload_0         
	// 10285 19205:getfield        #12  <Field azh a>
	// 10286 19208:astore_1        
		abyte0.aY = ((azh) (abyte0)).cb ^ a.aY;
	// 10287 19209:aload_1         
	// 10288 19210:aload_1         
	// 10289 19211:getfield        #486 <Field int azh.cb>
	// 10290 19214:aload_0         
	// 10291 19215:getfield        #12  <Field azh a>
	// 10292 19218:getfield        #163 <Field int azh.aY>
	// 10293 19221:ixor            
	// 10294 19222:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10295 19225:aload_0         
	// 10296 19226:getfield        #12  <Field azh a>
	// 10297 19229:astore_1        
		abyte0.aY = ((azh) (abyte0)).ax & ~a.aY;
	// 10298 19230:aload_1         
	// 10299 19231:aload_1         
	// 10300 19232:getfield        #349 <Field int azh.ax>
	// 10301 19235:aload_0         
	// 10302 19236:getfield        #12  <Field azh a>
	// 10303 19239:getfield        #163 <Field int azh.aY>
	// 10304 19242:iconst_m1       
	// 10305 19243:ixor            
	// 10306 19244:iand            
	// 10307 19245:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10308 19248:aload_0         
	// 10309 19249:getfield        #12  <Field azh a>
	// 10310 19252:astore_1        
		abyte0.aY = ((azh) (abyte0)).bm ^ a.aY;
	// 10311 19253:aload_1         
	// 10312 19254:aload_1         
	// 10313 19255:getfield        #175 <Field int azh.bm>
	// 10314 19258:aload_0         
	// 10315 19259:getfield        #12  <Field azh a>
	// 10316 19262:getfield        #163 <Field int azh.aY>
	// 10317 19265:ixor            
	// 10318 19266:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10319 19269:aload_0         
	// 10320 19270:getfield        #12  <Field azh a>
	// 10321 19273:astore_1        
		abyte0.bm = ((azh) (abyte0)).Z & ~a.f;
	// 10322 19274:aload_1         
	// 10323 19275:aload_1         
	// 10324 19276:getfield        #229 <Field int azh.Z>
	// 10325 19279:aload_0         
	// 10326 19280:getfield        #12  <Field azh a>
	// 10327 19283:getfield        #495 <Field int azh.f>
	// 10328 19286:iconst_m1       
	// 10329 19287:ixor            
	// 10330 19288:iand            
	// 10331 19289:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10332 19292:aload_0         
	// 10333 19293:getfield        #12  <Field azh a>
	// 10334 19296:astore_1        
		abyte0.bm = ((azh) (abyte0)).br & a.bm;
	// 10335 19297:aload_1         
	// 10336 19298:aload_1         
	// 10337 19299:getfield        #205 <Field int azh.br>
	// 10338 19302:aload_0         
	// 10339 19303:getfield        #12  <Field azh a>
	// 10340 19306:getfield        #175 <Field int azh.bm>
	// 10341 19309:iand            
	// 10342 19310:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10343 19313:aload_0         
	// 10344 19314:getfield        #12  <Field azh a>
	// 10345 19317:astore_1        
		abyte0.bm = ((azh) (abyte0)).f ^ a.bm;
	// 10346 19318:aload_1         
	// 10347 19319:aload_1         
	// 10348 19320:getfield        #495 <Field int azh.f>
	// 10349 19323:aload_0         
	// 10350 19324:getfield        #12  <Field azh a>
	// 10351 19327:getfield        #175 <Field int azh.bm>
	// 10352 19330:ixor            
	// 10353 19331:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10354 19334:aload_0         
	// 10355 19335:getfield        #12  <Field azh a>
	// 10356 19338:astore_1        
		abyte0.bm = ((azh) (abyte0)).bY & a.bm;
	// 10357 19339:aload_1         
	// 10358 19340:aload_1         
	// 10359 19341:getfield        #262 <Field int azh.bY>
	// 10360 19344:aload_0         
	// 10361 19345:getfield        #12  <Field azh a>
	// 10362 19348:getfield        #175 <Field int azh.bm>
	// 10363 19351:iand            
	// 10364 19352:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10365 19355:aload_0         
	// 10366 19356:getfield        #12  <Field azh a>
	// 10367 19359:astore_1        
		abyte0.bm = ((azh) (abyte0)).bo ^ a.bm;
	// 10368 19360:aload_1         
	// 10369 19361:aload_1         
	// 10370 19362:getfield        #145 <Field int azh.bo>
	// 10371 19365:aload_0         
	// 10372 19366:getfield        #12  <Field azh a>
	// 10373 19369:getfield        #175 <Field int azh.bm>
	// 10374 19372:ixor            
	// 10375 19373:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10376 19376:aload_0         
	// 10377 19377:getfield        #12  <Field azh a>
	// 10378 19380:astore_1        
		abyte0.bm = ((azh) (abyte0)).ax & a.bm;
	// 10379 19381:aload_1         
	// 10380 19382:aload_1         
	// 10381 19383:getfield        #349 <Field int azh.ax>
	// 10382 19386:aload_0         
	// 10383 19387:getfield        #12  <Field azh a>
	// 10384 19390:getfield        #175 <Field int azh.bm>
	// 10385 19393:iand            
	// 10386 19394:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10387 19397:aload_0         
	// 10388 19398:getfield        #12  <Field azh a>
	// 10389 19401:astore_1        
		abyte0.bm = ((azh) (abyte0)).at ^ a.bm;
	// 10390 19402:aload_1         
	// 10391 19403:aload_1         
	// 10392 19404:getfield        #44  <Field int azh.at>
	// 10393 19407:aload_0         
	// 10394 19408:getfield        #12  <Field azh a>
	// 10395 19411:getfield        #175 <Field int azh.bm>
	// 10396 19414:ixor            
	// 10397 19415:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10398 19418:aload_0         
	// 10399 19419:getfield        #12  <Field azh a>
	// 10400 19422:astore_1        
		abyte0.at = ((azh) (abyte0)).v & ~a.f;
	// 10401 19423:aload_1         
	// 10402 19424:aload_1         
	// 10403 19425:getfield        #471 <Field int azh.v>
	// 10404 19428:aload_0         
	// 10405 19429:getfield        #12  <Field azh a>
	// 10406 19432:getfield        #495 <Field int azh.f>
	// 10407 19435:iconst_m1       
	// 10408 19436:ixor            
	// 10409 19437:iand            
	// 10410 19438:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10411 19441:aload_0         
	// 10412 19442:getfield        #12  <Field azh a>
	// 10413 19445:astore_1        
		abyte0.bq = ((azh) (abyte0)).at ^ a.bq;
	// 10414 19446:aload_1         
	// 10415 19447:aload_1         
	// 10416 19448:getfield        #44  <Field int azh.at>
	// 10417 19451:aload_0         
	// 10418 19452:getfield        #12  <Field azh a>
	// 10419 19455:getfield        #468 <Field int azh.bq>
	// 10420 19458:ixor            
	// 10421 19459:putfield        #468 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 10422 19462:aload_0         
	// 10423 19463:getfield        #12  <Field azh a>
	// 10424 19466:astore_1        
		abyte0.be = ((azh) (abyte0)).bq ^ a.be;
	// 10425 19467:aload_1         
	// 10426 19468:aload_1         
	// 10427 19469:getfield        #468 <Field int azh.bq>
	// 10428 19472:aload_0         
	// 10429 19473:getfield        #12  <Field azh a>
	// 10430 19476:getfield        #477 <Field int azh.be>
	// 10431 19479:ixor            
	// 10432 19480:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 10433 19483:aload_0         
	// 10434 19484:getfield        #12  <Field azh a>
	// 10435 19487:astore_1        
		abyte0.ag = ((azh) (abyte0)).be ^ a.ag;
	// 10436 19488:aload_1         
	// 10437 19489:aload_1         
	// 10438 19490:getfield        #477 <Field int azh.be>
	// 10439 19493:aload_0         
	// 10440 19494:getfield        #12  <Field azh a>
	// 10441 19497:getfield        #29  <Field int azh.ag>
	// 10442 19500:ixor            
	// 10443 19501:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10444 19504:aload_0         
	// 10445 19505:getfield        #12  <Field azh a>
	// 10446 19508:astore_1        
		abyte0.be = ((azh) (abyte0)).ag | a.br;
	// 10447 19509:aload_1         
	// 10448 19510:aload_1         
	// 10449 19511:getfield        #29  <Field int azh.ag>
	// 10450 19514:aload_0         
	// 10451 19515:getfield        #12  <Field azh a>
	// 10452 19518:getfield        #205 <Field int azh.br>
	// 10453 19521:ior             
	// 10454 19522:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 10455 19525:aload_0         
	// 10456 19526:getfield        #12  <Field azh a>
	// 10457 19529:astore_1        
		abyte0.be = ((azh) (abyte0)).bw ^ a.be;
	// 10458 19530:aload_1         
	// 10459 19531:aload_1         
	// 10460 19532:getfield        #85  <Field int azh.bw>
	// 10461 19535:aload_0         
	// 10462 19536:getfield        #12  <Field azh a>
	// 10463 19539:getfield        #477 <Field int azh.be>
	// 10464 19542:ixor            
	// 10465 19543:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 10466 19546:aload_0         
	// 10467 19547:getfield        #12  <Field azh a>
	// 10468 19550:astore_1        
		abyte0.be = ((azh) (abyte0)).be ^ a.aa;
	// 10469 19551:aload_1         
	// 10470 19552:aload_1         
	// 10471 19553:getfield        #477 <Field int azh.be>
	// 10472 19556:aload_0         
	// 10473 19557:getfield        #12  <Field azh a>
	// 10474 19560:getfield        #483 <Field int azh.aa>
	// 10475 19563:ixor            
	// 10476 19564:putfield        #477 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 10477 19567:aload_0         
	// 10478 19568:getfield        #12  <Field azh a>
	// 10479 19571:astore_1        
		abyte0.bq = ((azh) (abyte0)).ae & ~a.be;
	// 10480 19572:aload_1         
	// 10481 19573:aload_1         
	// 10482 19574:getfield        #217 <Field int azh.ae>
	// 10483 19577:aload_0         
	// 10484 19578:getfield        #12  <Field azh a>
	// 10485 19581:getfield        #477 <Field int azh.be>
	// 10486 19584:iconst_m1       
	// 10487 19585:ixor            
	// 10488 19586:iand            
	// 10489 19587:putfield        #468 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 10490 19590:aload_0         
	// 10491 19591:getfield        #12  <Field azh a>
	// 10492 19594:astore_1        
		abyte0.ag = ((azh) (abyte0)).br & a.ag;
	// 10493 19595:aload_1         
	// 10494 19596:aload_1         
	// 10495 19597:getfield        #205 <Field int azh.br>
	// 10496 19600:aload_0         
	// 10497 19601:getfield        #12  <Field azh a>
	// 10498 19604:getfield        #29  <Field int azh.ag>
	// 10499 19607:iand            
	// 10500 19608:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10501 19611:aload_0         
	// 10502 19612:getfield        #12  <Field azh a>
	// 10503 19615:astore_1        
		abyte0.ag = ((azh) (abyte0)).bw ^ a.ag;
	// 10504 19616:aload_1         
	// 10505 19617:aload_1         
	// 10506 19618:getfield        #85  <Field int azh.bw>
	// 10507 19621:aload_0         
	// 10508 19622:getfield        #12  <Field azh a>
	// 10509 19625:getfield        #29  <Field int azh.ag>
	// 10510 19628:ixor            
	// 10511 19629:putfield        #29  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10512 19632:aload_0         
	// 10513 19633:getfield        #12  <Field azh a>
	// 10514 19636:astore_1        
		abyte0.ak = ((azh) (abyte0)).ag ^ a.ak;
	// 10515 19637:aload_1         
	// 10516 19638:aload_1         
	// 10517 19639:getfield        #29  <Field int azh.ag>
	// 10518 19642:aload_0         
	// 10519 19643:getfield        #12  <Field azh a>
	// 10520 19646:getfield        #139 <Field int azh.ak>
	// 10521 19649:ixor            
	// 10522 19650:putfield        #139 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 10523 19653:aload_0         
	// 10524 19654:getfield        #12  <Field azh a>
	// 10525 19657:astore_1        
		abyte0.cc = ((azh) (abyte0)).at ^ a.cc;
	// 10526 19658:aload_1         
	// 10527 19659:aload_1         
	// 10528 19660:getfield        #44  <Field int azh.at>
	// 10529 19663:aload_0         
	// 10530 19664:getfield        #12  <Field azh a>
	// 10531 19667:getfield        #459 <Field int azh.cc>
	// 10532 19670:ixor            
	// 10533 19671:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10534 19674:aload_0         
	// 10535 19675:getfield        #12  <Field azh a>
	// 10536 19678:astore_1        
		abyte0.as = ((azh) (abyte0)).cc ^ a.as;
	// 10537 19679:aload_1         
	// 10538 19680:aload_1         
	// 10539 19681:getfield        #459 <Field int azh.cc>
	// 10540 19684:aload_0         
	// 10541 19685:getfield        #12  <Field azh a>
	// 10542 19688:getfield        #435 <Field int azh.as>
	// 10543 19691:ixor            
	// 10544 19692:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 10545 19695:aload_0         
	// 10546 19696:getfield        #12  <Field azh a>
	// 10547 19699:astore_1        
		abyte0.cf = ((azh) (abyte0)).as ^ a.cf;
	// 10548 19700:aload_1         
	// 10549 19701:aload_1         
	// 10550 19702:getfield        #435 <Field int azh.as>
	// 10551 19705:aload_0         
	// 10552 19706:getfield        #12  <Field azh a>
	// 10553 19709:getfield        #492 <Field int azh.cf>
	// 10554 19712:ixor            
	// 10555 19713:putfield        #492 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10556 19716:aload_0         
	// 10557 19717:getfield        #12  <Field azh a>
	// 10558 19720:astore_1        
		abyte0.R = ((azh) (abyte0)).cf ^ a.R;
	// 10559 19721:aload_1         
	// 10560 19722:aload_1         
	// 10561 19723:getfield        #492 <Field int azh.cf>
	// 10562 19726:aload_0         
	// 10563 19727:getfield        #12  <Field azh a>
	// 10564 19730:getfield        #346 <Field int azh.R>
	// 10565 19733:ixor            
	// 10566 19734:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 10567 19737:aload_0         
	// 10568 19738:getfield        #12  <Field azh a>
	// 10569 19741:astore_1        
		abyte0.I = ((azh) (abyte0)).R ^ a.I;
	// 10570 19742:aload_1         
	// 10571 19743:aload_1         
	// 10572 19744:getfield        #346 <Field int azh.R>
	// 10573 19747:aload_0         
	// 10574 19748:getfield        #12  <Field azh a>
	// 10575 19751:getfield        #429 <Field int azh.I>
	// 10576 19754:ixor            
	// 10577 19755:putfield        #429 <Field int azh.I>
		abyte0 = ((byte []) (a));
	// 10578 19758:aload_0         
	// 10579 19759:getfield        #12  <Field azh a>
	// 10580 19762:astore_1        
		abyte0.R = ((azh) (abyte0)).k & ~a.I;
	// 10581 19763:aload_1         
	// 10582 19764:aload_1         
	// 10583 19765:getfield        #465 <Field int azh.k>
	// 10584 19768:aload_0         
	// 10585 19769:getfield        #12  <Field azh a>
	// 10586 19772:getfield        #429 <Field int azh.I>
	// 10587 19775:iconst_m1       
	// 10588 19776:ixor            
	// 10589 19777:iand            
	// 10590 19778:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 10591 19781:aload_0         
	// 10592 19782:getfield        #12  <Field azh a>
	// 10593 19785:astore_1        
		abyte0.R = ((azh) (abyte0)).R & a.c;
	// 10594 19786:aload_1         
	// 10595 19787:aload_1         
	// 10596 19788:getfield        #346 <Field int azh.R>
	// 10597 19791:aload_0         
	// 10598 19792:getfield        #12  <Field azh a>
	// 10599 19795:getfield        #244 <Field int azh.c>
	// 10600 19798:iand            
	// 10601 19799:putfield        #346 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 10602 19802:aload_0         
	// 10603 19803:getfield        #12  <Field azh a>
	// 10604 19806:astore_1        
		abyte0.as = ((azh) (abyte0)).k & a.I;
	// 10605 19807:aload_1         
	// 10606 19808:aload_1         
	// 10607 19809:getfield        #465 <Field int azh.k>
	// 10608 19812:aload_0         
	// 10609 19813:getfield        #12  <Field azh a>
	// 10610 19816:getfield        #429 <Field int azh.I>
	// 10611 19819:iand            
	// 10612 19820:putfield        #435 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 10613 19823:aload_0         
	// 10614 19824:getfield        #12  <Field azh a>
	// 10615 19827:astore_1        
		abyte0.cc = ((azh) (abyte0)).k & ~a.I;
	// 10616 19828:aload_1         
	// 10617 19829:aload_1         
	// 10618 19830:getfield        #465 <Field int azh.k>
	// 10619 19833:aload_0         
	// 10620 19834:getfield        #12  <Field azh a>
	// 10621 19837:getfield        #429 <Field int azh.I>
	// 10622 19840:iconst_m1       
	// 10623 19841:ixor            
	// 10624 19842:iand            
	// 10625 19843:putfield        #459 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10626 19846:aload_0         
	// 10627 19847:getfield        #12  <Field azh a>
	// 10628 19850:astore_1        
		abyte0.at = ((azh) (abyte0)).k & ~a.I;
	// 10629 19851:aload_1         
	// 10630 19852:aload_1         
	// 10631 19853:getfield        #465 <Field int azh.k>
	// 10632 19856:aload_0         
	// 10633 19857:getfield        #12  <Field azh a>
	// 10634 19860:getfield        #429 <Field int azh.I>
	// 10635 19863:iconst_m1       
	// 10636 19864:ixor            
	// 10637 19865:iand            
	// 10638 19866:putfield        #44  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10639 19869:aload_0         
	// 10640 19870:getfield        #12  <Field azh a>
	// 10641 19873:astore_1        
		abyte0.n = ((azh) (abyte0)).cf ^ a.n;
	// 10642 19874:aload_1         
	// 10643 19875:aload_1         
	// 10644 19876:getfield        #492 <Field int azh.cf>
	// 10645 19879:aload_0         
	// 10646 19880:getfield        #12  <Field azh a>
	// 10647 19883:getfield        #474 <Field int azh.n>
	// 10648 19886:ixor            
	// 10649 19887:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10650 19890:aload_0         
	// 10651 19891:getfield        #12  <Field azh a>
	// 10652 19894:astore_1        
		abyte0.bT = ((azh) (abyte0)).n ^ a.bT;
	// 10653 19895:aload_1         
	// 10654 19896:aload_1         
	// 10655 19897:getfield        #474 <Field int azh.n>
	// 10656 19900:aload_0         
	// 10657 19901:getfield        #12  <Field azh a>
	// 10658 19904:getfield        #247 <Field int azh.bT>
	// 10659 19907:ixor            
	// 10660 19908:putfield        #247 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 10661 19911:aload_0         
	// 10662 19912:getfield        #12  <Field azh a>
	// 10663 19915:astore_1        
		abyte0.n = ((azh) (abyte0)).br & ~a.f;
	// 10664 19916:aload_1         
	// 10665 19917:aload_1         
	// 10666 19918:getfield        #205 <Field int azh.br>
	// 10667 19921:aload_0         
	// 10668 19922:getfield        #12  <Field azh a>
	// 10669 19925:getfield        #495 <Field int azh.f>
	// 10670 19928:iconst_m1       
	// 10671 19929:ixor            
	// 10672 19930:iand            
	// 10673 19931:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10674 19934:aload_0         
	// 10675 19935:getfield        #12  <Field azh a>
	// 10676 19938:astore_1        
		abyte0.n = ((azh) (abyte0)).bN ^ a.n;
	// 10677 19939:aload_1         
	// 10678 19940:aload_1         
	// 10679 19941:getfield        #432 <Field int azh.bN>
	// 10680 19944:aload_0         
	// 10681 19945:getfield        #12  <Field azh a>
	// 10682 19948:getfield        #474 <Field int azh.n>
	// 10683 19951:ixor            
	// 10684 19952:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10685 19955:aload_0         
	// 10686 19956:getfield        #12  <Field azh a>
	// 10687 19959:astore_1        
		abyte0.n = ((azh) (abyte0)).bY & ~a.n;
	// 10688 19960:aload_1         
	// 10689 19961:aload_1         
	// 10690 19962:getfield        #262 <Field int azh.bY>
	// 10691 19965:aload_0         
	// 10692 19966:getfield        #12  <Field azh a>
	// 10693 19969:getfield        #474 <Field int azh.n>
	// 10694 19972:iconst_m1       
	// 10695 19973:ixor            
	// 10696 19974:iand            
	// 10697 19975:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10698 19978:aload_0         
	// 10699 19979:getfield        #12  <Field azh a>
	// 10700 19982:astore_1        
		abyte0.n = ((azh) (abyte0)).bV ^ a.n;
	// 10701 19983:aload_1         
	// 10702 19984:aload_1         
	// 10703 19985:getfield        #26  <Field int azh.bV>
	// 10704 19988:aload_0         
	// 10705 19989:getfield        #12  <Field azh a>
	// 10706 19992:getfield        #474 <Field int azh.n>
	// 10707 19995:ixor            
	// 10708 19996:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10709 19999:aload_0         
	// 10710 20000:getfield        #12  <Field azh a>
	// 10711 20003:astore_1        
		abyte0.n = ((azh) (abyte0)).ax & ~a.n;
	// 10712 20004:aload_1         
	// 10713 20005:aload_1         
	// 10714 20006:getfield        #349 <Field int azh.ax>
	// 10715 20009:aload_0         
	// 10716 20010:getfield        #12  <Field azh a>
	// 10717 20013:getfield        #474 <Field int azh.n>
	// 10718 20016:iconst_m1       
	// 10719 20017:ixor            
	// 10720 20018:iand            
	// 10721 20019:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10722 20022:aload_0         
	// 10723 20023:getfield        #12  <Field azh a>
	// 10724 20026:astore_1        
		abyte0.n = ((azh) (abyte0)).bB ^ a.n;
	// 10725 20027:aload_1         
	// 10726 20028:aload_1         
	// 10727 20029:getfield        #456 <Field int azh.bB>
	// 10728 20032:aload_0         
	// 10729 20033:getfield        #12  <Field azh a>
	// 10730 20036:getfield        #474 <Field int azh.n>
	// 10731 20039:ixor            
	// 10732 20040:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10733 20043:aload_0         
	// 10734 20044:getfield        #12  <Field azh a>
	// 10735 20047:astore_1        
		abyte0.n = ((azh) (abyte0)).H & a.n;
	// 10736 20048:aload_1         
	// 10737 20049:aload_1         
	// 10738 20050:getfield        #498 <Field int azh.H>
	// 10739 20053:aload_0         
	// 10740 20054:getfield        #12  <Field azh a>
	// 10741 20057:getfield        #474 <Field int azh.n>
	// 10742 20060:iand            
	// 10743 20061:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10744 20064:aload_0         
	// 10745 20065:getfield        #12  <Field azh a>
	// 10746 20068:astore_1        
		abyte0.n = ((azh) (abyte0)).aY ^ a.n;
	// 10747 20069:aload_1         
	// 10748 20070:aload_1         
	// 10749 20071:getfield        #163 <Field int azh.aY>
	// 10750 20074:aload_0         
	// 10751 20075:getfield        #12  <Field azh a>
	// 10752 20078:getfield        #474 <Field int azh.n>
	// 10753 20081:ixor            
	// 10754 20082:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10755 20085:aload_0         
	// 10756 20086:getfield        #12  <Field azh a>
	// 10757 20089:astore_1        
		abyte0.bF = ((azh) (abyte0)).n ^ a.bF;
	// 10758 20090:aload_1         
	// 10759 20091:aload_1         
	// 10760 20092:getfield        #474 <Field int azh.n>
	// 10761 20095:aload_0         
	// 10762 20096:getfield        #12  <Field azh a>
	// 10763 20099:getfield        #241 <Field int azh.bF>
	// 10764 20102:ixor            
	// 10765 20103:putfield        #241 <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10766 20106:aload_0         
	// 10767 20107:getfield        #12  <Field azh a>
	// 10768 20110:astore_1        
		abyte0.n = ((azh) (abyte0)).bT | a.bF;
	// 10769 20111:aload_1         
	// 10770 20112:aload_1         
	// 10771 20113:getfield        #247 <Field int azh.bT>
	// 10772 20116:aload_0         
	// 10773 20117:getfield        #12  <Field azh a>
	// 10774 20120:getfield        #241 <Field int azh.bF>
	// 10775 20123:ior             
	// 10776 20124:putfield        #474 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10777 20127:aload_0         
	// 10778 20128:getfield        #12  <Field azh a>
	// 10779 20131:astore_1        
		abyte0.aY = ((azh) (abyte0)).br & ~a.f;
	// 10780 20132:aload_1         
	// 10781 20133:aload_1         
	// 10782 20134:getfield        #205 <Field int azh.br>
	// 10783 20137:aload_0         
	// 10784 20138:getfield        #12  <Field azh a>
	// 10785 20141:getfield        #495 <Field int azh.f>
	// 10786 20144:iconst_m1       
	// 10787 20145:ixor            
	// 10788 20146:iand            
	// 10789 20147:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10790 20150:aload_0         
	// 10791 20151:getfield        #12  <Field azh a>
	// 10792 20154:astore_1        
		abyte0.aY = ((azh) (abyte0)).am ^ a.aY;
	// 10793 20155:aload_1         
	// 10794 20156:aload_1         
	// 10795 20157:getfield        #409 <Field int azh.am>
	// 10796 20160:aload_0         
	// 10797 20161:getfield        #12  <Field azh a>
	// 10798 20164:getfield        #163 <Field int azh.aY>
	// 10799 20167:ixor            
	// 10800 20168:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10801 20171:aload_0         
	// 10802 20172:getfield        #12  <Field azh a>
	// 10803 20175:astore_1        
		abyte0.ba = ((azh) (abyte0)).aY ^ a.ba;
	// 10804 20176:aload_1         
	// 10805 20177:aload_1         
	// 10806 20178:getfield        #163 <Field int azh.aY>
	// 10807 20181:aload_0         
	// 10808 20182:getfield        #12  <Field azh a>
	// 10809 20185:getfield        #271 <Field int azh.ba>
	// 10810 20188:ixor            
	// 10811 20189:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10812 20192:aload_0         
	// 10813 20193:getfield        #12  <Field azh a>
	// 10814 20196:astore_1        
		abyte0.ba = ((azh) (abyte0)).ax & ~a.ba;
	// 10815 20197:aload_1         
	// 10816 20198:aload_1         
	// 10817 20199:getfield        #349 <Field int azh.ax>
	// 10818 20202:aload_0         
	// 10819 20203:getfield        #12  <Field azh a>
	// 10820 20206:getfield        #271 <Field int azh.ba>
	// 10821 20209:iconst_m1       
	// 10822 20210:ixor            
	// 10823 20211:iand            
	// 10824 20212:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10825 20215:aload_0         
	// 10826 20216:getfield        #12  <Field azh a>
	// 10827 20219:astore_1        
		abyte0.ba = ((azh) (abyte0)).cb ^ a.ba;
	// 10828 20220:aload_1         
	// 10829 20221:aload_1         
	// 10830 20222:getfield        #486 <Field int azh.cb>
	// 10831 20225:aload_0         
	// 10832 20226:getfield        #12  <Field azh a>
	// 10833 20229:getfield        #271 <Field int azh.ba>
	// 10834 20232:ixor            
	// 10835 20233:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10836 20236:aload_0         
	// 10837 20237:getfield        #12  <Field azh a>
	// 10838 20240:astore_1        
		abyte0.ba = ((azh) (abyte0)).H & ~a.ba;
	// 10839 20241:aload_1         
	// 10840 20242:aload_1         
	// 10841 20243:getfield        #498 <Field int azh.H>
	// 10842 20246:aload_0         
	// 10843 20247:getfield        #12  <Field azh a>
	// 10844 20250:getfield        #271 <Field int azh.ba>
	// 10845 20253:iconst_m1       
	// 10846 20254:ixor            
	// 10847 20255:iand            
	// 10848 20256:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10849 20259:aload_0         
	// 10850 20260:getfield        #12  <Field azh a>
	// 10851 20263:astore_1        
		abyte0.ba = ((azh) (abyte0)).bm ^ a.ba;
	// 10852 20264:aload_1         
	// 10853 20265:aload_1         
	// 10854 20266:getfield        #175 <Field int azh.bm>
	// 10855 20269:aload_0         
	// 10856 20270:getfield        #12  <Field azh a>
	// 10857 20273:getfield        #271 <Field int azh.ba>
	// 10858 20276:ixor            
	// 10859 20277:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10860 20280:aload_0         
	// 10861 20281:getfield        #12  <Field azh a>
	// 10862 20284:astore_1        
		abyte0.U = ((azh) (abyte0)).ba ^ a.U;
	// 10863 20285:aload_1         
	// 10864 20286:aload_1         
	// 10865 20287:getfield        #271 <Field int azh.ba>
	// 10866 20290:aload_0         
	// 10867 20291:getfield        #12  <Field azh a>
	// 10868 20294:getfield        #50  <Field int azh.U>
	// 10869 20297:ixor            
	// 10870 20298:putfield        #50  <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 10871 20301:aload_0         
	// 10872 20302:getfield        #12  <Field azh a>
	// 10873 20305:astore_1        
		abyte0.bS = ((azh) (abyte0)).aa & a.bS;
	// 10874 20306:aload_1         
	// 10875 20307:aload_1         
	// 10876 20308:getfield        #483 <Field int azh.aa>
	// 10877 20311:aload_0         
	// 10878 20312:getfield        #12  <Field azh a>
	// 10879 20315:getfield        #319 <Field int azh.bS>
	// 10880 20318:iand            
	// 10881 20319:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10882 20322:aload_0         
	// 10883 20323:getfield        #12  <Field azh a>
	// 10884 20326:astore_1        
		abyte0.av = ((azh) (abyte0)).g | a.av;
	// 10885 20327:aload_1         
	// 10886 20328:aload_1         
	// 10887 20329:getfield        #160 <Field int azh.g>
	// 10888 20332:aload_0         
	// 10889 20333:getfield        #12  <Field azh a>
	// 10890 20336:getfield        #292 <Field int azh.av>
	// 10891 20339:ior             
	// 10892 20340:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10893 20343:aload_0         
	// 10894 20344:getfield        #12  <Field azh a>
	// 10895 20347:astore_1        
		abyte0.av = ((azh) (abyte0)).l ^ a.av;
	// 10896 20348:aload_1         
	// 10897 20349:aload_1         
	// 10898 20350:getfield        #35  <Field int azh.l>
	// 10899 20353:aload_0         
	// 10900 20354:getfield        #12  <Field azh a>
	// 10901 20357:getfield        #292 <Field int azh.av>
	// 10902 20360:ixor            
	// 10903 20361:putfield        #292 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10904 20364:aload_0         
	// 10905 20365:getfield        #12  <Field azh a>
	// 10906 20368:astore_1        
		abyte0.l = ((azh) (abyte0)).ai & a.av;
	// 10907 20369:aload_1         
	// 10908 20370:aload_1         
	// 10909 20371:getfield        #151 <Field int azh.ai>
	// 10910 20374:aload_0         
	// 10911 20375:getfield        #12  <Field azh a>
	// 10912 20378:getfield        #292 <Field int azh.av>
	// 10913 20381:iand            
	// 10914 20382:putfield        #35  <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 10915 20385:aload_0         
	// 10916 20386:getfield        #12  <Field azh a>
	// 10917 20389:astore_1        
		abyte0.l = ((azh) (abyte0)).bh ^ a.l;
	// 10918 20390:aload_1         
	// 10919 20391:aload_1         
	// 10920 20392:getfield        #403 <Field int azh.bh>
	// 10921 20395:aload_0         
	// 10922 20396:getfield        #12  <Field azh a>
	// 10923 20399:getfield        #35  <Field int azh.l>
	// 10924 20402:ixor            
	// 10925 20403:putfield        #35  <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 10926 20406:aload_0         
	// 10927 20407:getfield        #12  <Field azh a>
	// 10928 20410:astore_1        
		abyte0.bS = ((azh) (abyte0)).l ^ a.bS;
	// 10929 20411:aload_1         
	// 10930 20412:aload_1         
	// 10931 20413:getfield        #35  <Field int azh.l>
	// 10932 20416:aload_0         
	// 10933 20417:getfield        #12  <Field azh a>
	// 10934 20420:getfield        #319 <Field int azh.bS>
	// 10935 20423:ixor            
	// 10936 20424:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10937 20427:aload_0         
	// 10938 20428:getfield        #12  <Field azh a>
	// 10939 20431:astore_1        
		abyte0.bS = ((azh) (abyte0)).bS | a.K;
	// 10940 20432:aload_1         
	// 10941 20433:aload_1         
	// 10942 20434:getfield        #319 <Field int azh.bS>
	// 10943 20437:aload_0         
	// 10944 20438:getfield        #12  <Field azh a>
	// 10945 20441:getfield        #358 <Field int azh.K>
	// 10946 20444:ior             
	// 10947 20445:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10948 20448:aload_0         
	// 10949 20449:getfield        #12  <Field azh a>
	// 10950 20452:astore_1        
		abyte0.bS = ((azh) (abyte0)).bQ ^ a.bS;
	// 10951 20453:aload_1         
	// 10952 20454:aload_1         
	// 10953 20455:getfield        #307 <Field int azh.bQ>
	// 10954 20458:aload_0         
	// 10955 20459:getfield        #12  <Field azh a>
	// 10956 20462:getfield        #319 <Field int azh.bS>
	// 10957 20465:ixor            
	// 10958 20466:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10959 20469:aload_0         
	// 10960 20470:getfield        #12  <Field azh a>
	// 10961 20473:astore_1        
		abyte0.bl = ((azh) (abyte0)).bS ^ a.bl;
	// 10962 20474:aload_1         
	// 10963 20475:aload_1         
	// 10964 20476:getfield        #319 <Field int azh.bS>
	// 10965 20479:aload_0         
	// 10966 20480:getfield        #12  <Field azh a>
	// 10967 20483:getfield        #501 <Field int azh.bl>
	// 10968 20486:ixor            
	// 10969 20487:putfield        #501 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 10970 20490:aload_0         
	// 10971 20491:getfield        #12  <Field azh a>
	// 10972 20494:astore_1        
		abyte0.bS = ((azh) (abyte0)).bl & ~a.aS;
	// 10973 20495:aload_1         
	// 10974 20496:aload_1         
	// 10975 20497:getfield        #501 <Field int azh.bl>
	// 10976 20500:aload_0         
	// 10977 20501:getfield        #12  <Field azh a>
	// 10978 20504:getfield        #196 <Field int azh.aS>
	// 10979 20507:iconst_m1       
	// 10980 20508:ixor            
	// 10981 20509:iand            
	// 10982 20510:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10983 20513:aload_0         
	// 10984 20514:getfield        #12  <Field azh a>
	// 10985 20517:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aL | a.bS;
	// 10986 20518:aload_1         
	// 10987 20519:aload_1         
	// 10988 20520:getfield        #277 <Field int azh.aL>
	// 10989 20523:aload_0         
	// 10990 20524:getfield        #12  <Field azh a>
	// 10991 20527:getfield        #319 <Field int azh.bS>
	// 10992 20530:ior             
	// 10993 20531:putfield        #307 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 10994 20534:aload_0         
	// 10995 20535:getfield        #12  <Field azh a>
	// 10996 20538:astore_1        
		abyte0.l = ((azh) (abyte0)).bl & ~a.bS;
	// 10997 20539:aload_1         
	// 10998 20540:aload_1         
	// 10999 20541:getfield        #501 <Field int azh.bl>
	// 11000 20544:aload_0         
	// 11001 20545:getfield        #12  <Field azh a>
	// 11002 20548:getfield        #319 <Field int azh.bS>
	// 11003 20551:iconst_m1       
	// 11004 20552:ixor            
	// 11005 20553:iand            
	// 11006 20554:putfield        #35  <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 11007 20557:aload_0         
	// 11008 20558:getfield        #12  <Field azh a>
	// 11009 20561:astore_1        
		abyte0.bh = ((azh) (abyte0)).aL | a.l;
	// 11010 20562:aload_1         
	// 11011 20563:aload_1         
	// 11012 20564:getfield        #277 <Field int azh.aL>
	// 11013 20567:aload_0         
	// 11014 20568:getfield        #12  <Field azh a>
	// 11015 20571:getfield        #35  <Field int azh.l>
	// 11016 20574:ior             
	// 11017 20575:putfield        #403 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 11018 20578:aload_0         
	// 11019 20579:getfield        #12  <Field azh a>
	// 11020 20582:astore_1        
		abyte0.ba = ((azh) (abyte0)).aL | a.l;
	// 11021 20583:aload_1         
	// 11022 20584:aload_1         
	// 11023 20585:getfield        #277 <Field int azh.aL>
	// 11024 20588:aload_0         
	// 11025 20589:getfield        #12  <Field azh a>
	// 11026 20592:getfield        #35  <Field int azh.l>
	// 11027 20595:ior             
	// 11028 20596:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11029 20599:aload_0         
	// 11030 20600:getfield        #12  <Field azh a>
	// 11031 20603:astore_1        
		abyte0.ba = ((azh) (abyte0)).bS ^ a.ba;
	// 11032 20604:aload_1         
	// 11033 20605:aload_1         
	// 11034 20606:getfield        #319 <Field int azh.bS>
	// 11035 20609:aload_0         
	// 11036 20610:getfield        #12  <Field azh a>
	// 11037 20613:getfield        #271 <Field int azh.ba>
	// 11038 20616:ixor            
	// 11039 20617:putfield        #271 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11040 20620:aload_0         
	// 11041 20621:getfield        #12  <Field azh a>
	// 11042 20624:astore_1        
		abyte0.bm = ((azh) (abyte0)).bE & ~a.ba;
	// 11043 20625:aload_1         
	// 11044 20626:aload_1         
	// 11045 20627:getfield        #199 <Field int azh.bE>
	// 11046 20630:aload_0         
	// 11047 20631:getfield        #12  <Field azh a>
	// 11048 20634:getfield        #271 <Field int azh.ba>
	// 11049 20637:iconst_m1       
	// 11050 20638:ixor            
	// 11051 20639:iand            
	// 11052 20640:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 11053 20643:aload_0         
	// 11054 20644:getfield        #12  <Field azh a>
	// 11055 20647:astore_1        
		abyte0.aX = ((azh) (abyte0)).bS ^ a.aX;
	// 11056 20648:aload_1         
	// 11057 20649:aload_1         
	// 11058 20650:getfield        #319 <Field int azh.bS>
	// 11059 20653:aload_0         
	// 11060 20654:getfield        #12  <Field azh a>
	// 11061 20657:getfield        #268 <Field int azh.aX>
	// 11062 20660:ixor            
	// 11063 20661:putfield        #268 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 11064 20664:aload_0         
	// 11065 20665:getfield        #12  <Field azh a>
	// 11066 20668:astore_1        
		abyte0.bS = ((azh) (abyte0)).aX & a.bE;
	// 11067 20669:aload_1         
	// 11068 20670:aload_1         
	// 11069 20671:getfield        #268 <Field int azh.aX>
	// 11070 20674:aload_0         
	// 11071 20675:getfield        #12  <Field azh a>
	// 11072 20678:getfield        #199 <Field int azh.bE>
	// 11073 20681:iand            
	// 11074 20682:putfield        #319 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 11075 20685:aload_0         
	// 11076 20686:getfield        #12  <Field azh a>
	// 11077 20689:astore_1        
		abyte0.cb = ((azh) (abyte0)).bl & ~a.aL;
	// 11078 20690:aload_1         
	// 11079 20691:aload_1         
	// 11080 20692:getfield        #501 <Field int azh.bl>
	// 11081 20695:aload_0         
	// 11082 20696:getfield        #12  <Field azh a>
	// 11083 20699:getfield        #277 <Field int azh.aL>
	// 11084 20702:iconst_m1       
	// 11085 20703:ixor            
	// 11086 20704:iand            
	// 11087 20705:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 11088 20708:aload_0         
	// 11089 20709:getfield        #12  <Field azh a>
	// 11090 20712:astore_1        
		abyte0.cb = ((azh) (abyte0)).aS ^ a.cb;
	// 11091 20713:aload_1         
	// 11092 20714:aload_1         
	// 11093 20715:getfield        #196 <Field int azh.aS>
	// 11094 20718:aload_0         
	// 11095 20719:getfield        #12  <Field azh a>
	// 11096 20722:getfield        #486 <Field int azh.cb>
	// 11097 20725:ixor            
	// 11098 20726:putfield        #486 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 11099 20729:aload_0         
	// 11100 20730:getfield        #12  <Field azh a>
	// 11101 20733:astore_1        
		abyte0.aY = ((azh) (abyte0)).aS ^ a.bl;
	// 11102 20734:aload_1         
	// 11103 20735:aload_1         
	// 11104 20736:getfield        #196 <Field int azh.aS>
	// 11105 20739:aload_0         
	// 11106 20740:getfield        #12  <Field azh a>
	// 11107 20743:getfield        #501 <Field int azh.bl>
	// 11108 20746:ixor            
	// 11109 20747:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 11110 20750:aload_0         
	// 11111 20751:getfield        #12  <Field azh a>
	// 11112 20754:astore_1        
		abyte0.aC = ((azh) (abyte0)).aY ^ a.aC;
	// 11113 20755:aload_1         
	// 11114 20756:aload_1         
	// 11115 20757:getfield        #163 <Field int azh.aY>
	// 11116 20760:aload_0         
	// 11117 20761:getfield        #12  <Field azh a>
	// 11118 20764:getfield        #94  <Field int azh.aC>
	// 11119 20767:ixor            
	// 11120 20768:putfield        #94  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 11121 20771:aload_0         
	// 11122 20772:getfield        #12  <Field azh a>
	// 11123 20775:astore_1        
		abyte0.am = ((azh) (abyte0)).aC & ~a.bE;
	// 11124 20776:aload_1         
	// 11125 20777:aload_1         
	// 11126 20778:getfield        #94  <Field int azh.aC>
	// 11127 20781:aload_0         
	// 11128 20782:getfield        #12  <Field azh a>
	// 11129 20785:getfield        #199 <Field int azh.bE>
	// 11130 20788:iconst_m1       
	// 11131 20789:ixor            
	// 11132 20790:iand            
	// 11133 20791:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11134 20794:aload_0         
	// 11135 20795:getfield        #12  <Field azh a>
	// 11136 20798:astore_1        
		abyte0.am = ((azh) (abyte0)).bv ^ a.am;
	// 11137 20799:aload_1         
	// 11138 20800:aload_1         
	// 11139 20801:getfield        #274 <Field int azh.bv>
	// 11140 20804:aload_0         
	// 11141 20805:getfield        #12  <Field azh a>
	// 11142 20808:getfield        #409 <Field int azh.am>
	// 11143 20811:ixor            
	// 11144 20812:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11145 20815:aload_0         
	// 11146 20816:getfield        #12  <Field azh a>
	// 11147 20819:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.j;
	// 11148 20820:aload_1         
	// 11149 20821:aload_1         
	// 11150 20822:getfield        #409 <Field int azh.am>
	// 11151 20825:aload_0         
	// 11152 20826:getfield        #12  <Field azh a>
	// 11153 20829:getfield        #190 <Field int azh.j>
	// 11154 20832:iconst_m1       
	// 11155 20833:ixor            
	// 11156 20834:iand            
	// 11157 20835:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11158 20838:aload_0         
	// 11159 20839:getfield        #12  <Field azh a>
	// 11160 20842:astore_1        
		abyte0.aY = ((azh) (abyte0)).aL | a.aY;
	// 11161 20843:aload_1         
	// 11162 20844:aload_1         
	// 11163 20845:getfield        #277 <Field int azh.aL>
	// 11164 20848:aload_0         
	// 11165 20849:getfield        #12  <Field azh a>
	// 11166 20852:getfield        #163 <Field int azh.aY>
	// 11167 20855:ior             
	// 11168 20856:putfield        #163 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 11169 20859:aload_0         
	// 11170 20860:getfield        #12  <Field azh a>
	// 11171 20863:astore_1        
		abyte0.bm = ((azh) (abyte0)).aY ^ a.bm;
	// 11172 20864:aload_1         
	// 11173 20865:aload_1         
	// 11174 20866:getfield        #163 <Field int azh.aY>
	// 11175 20869:aload_0         
	// 11176 20870:getfield        #12  <Field azh a>
	// 11177 20873:getfield        #175 <Field int azh.bm>
	// 11178 20876:ixor            
	// 11179 20877:putfield        #175 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 11180 20880:aload_0         
	// 11181 20881:getfield        #12  <Field azh a>
	// 11182 20884:astore_1        
		abyte0.bv = ((azh) (abyte0)).bl | a.aS;
	// 11183 20885:aload_1         
	// 11184 20886:aload_1         
	// 11185 20887:getfield        #501 <Field int azh.bl>
	// 11186 20890:aload_0         
	// 11187 20891:getfield        #12  <Field azh a>
	// 11188 20894:getfield        #196 <Field int azh.aS>
	// 11189 20897:ior             
	// 11190 20898:putfield        #274 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11191 20901:aload_0         
	// 11192 20902:getfield        #12  <Field azh a>
	// 11193 20905:astore_1        
		abyte0.bB = ((azh) (abyte0)).aS & ~a.bl;
	// 11194 20906:aload_1         
	// 11195 20907:aload_1         
	// 11196 20908:getfield        #196 <Field int azh.aS>
	// 11197 20911:aload_0         
	// 11198 20912:getfield        #12  <Field azh a>
	// 11199 20915:getfield        #501 <Field int azh.bl>
	// 11200 20918:iconst_m1       
	// 11201 20919:ixor            
	// 11202 20920:iand            
	// 11203 20921:putfield        #456 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 11204 20924:aload_0         
	// 11205 20925:getfield        #12  <Field azh a>
	// 11206 20928:astore_1        
		abyte0.bV = ((azh) (abyte0)).bB & a.bE;
	// 11207 20929:aload_1         
	// 11208 20930:aload_1         
	// 11209 20931:getfield        #456 <Field int azh.bB>
	// 11210 20934:aload_0         
	// 11211 20935:getfield        #12  <Field azh a>
	// 11212 20938:getfield        #199 <Field int azh.bE>
	// 11213 20941:iand            
	// 11214 20942:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11215 20945:aload_0         
	// 11216 20946:getfield        #12  <Field azh a>
	// 11217 20949:astore_1        
		abyte0.bV = ((azh) (abyte0)).aS ^ a.bV;
	// 11218 20950:aload_1         
	// 11219 20951:aload_1         
	// 11220 20952:getfield        #196 <Field int azh.aS>
	// 11221 20955:aload_0         
	// 11222 20956:getfield        #12  <Field azh a>
	// 11223 20959:getfield        #26  <Field int azh.bV>
	// 11224 20962:ixor            
	// 11225 20963:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11226 20966:aload_0         
	// 11227 20967:getfield        #12  <Field azh a>
	// 11228 20970:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.j;
	// 11229 20971:aload_1         
	// 11230 20972:aload_1         
	// 11231 20973:getfield        #26  <Field int azh.bV>
	// 11232 20976:aload_0         
	// 11233 20977:getfield        #12  <Field azh a>
	// 11234 20980:getfield        #190 <Field int azh.j>
	// 11235 20983:iconst_m1       
	// 11236 20984:ixor            
	// 11237 20985:iand            
	// 11238 20986:putfield        #26  <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11239 20989:aload_0         
	// 11240 20990:getfield        #12  <Field azh a>
	// 11241 20993:astore_1        
		abyte0.bN = ((azh) (abyte0)).bB & ~a.aL;
	// 11242 20994:aload_1         
	// 11243 20995:aload_1         
	// 11244 20996:getfield        #456 <Field int azh.bB>
	// 11245 20999:aload_0         
	// 11246 21000:getfield        #12  <Field azh a>
	// 11247 21003:getfield        #277 <Field int azh.aL>
	// 11248 21006:iconst_m1       
	// 11249 21007:ixor            
	// 11250 21008:iand            
	// 11251 21009:putfield        #432 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 11252 21012:aload_0         
	// 11253 21013:getfield        #12  <Field azh a>
	// 11254 21016:astore_1        
		abyte0.bN = ((azh) (abyte0)).bE & ~a.bN;
	// 11255 21017:aload_1         
	// 11256 21018:aload_1         
	// 11257 21019:getfield        #199 <Field int azh.bE>
	// 11258 21022:aload_0         
	// 11259 21023:getfield        #12  <Field azh a>
	// 11260 21026:getfield        #432 <Field int azh.bN>
	// 11261 21029:iconst_m1       
	// 11262 21030:ixor            
	// 11263 21031:iand            
	// 11264 21032:putfield        #432 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 11265 21035:aload_0         
	// 11266 21036:getfield        #12  <Field azh a>
	// 11267 21039:astore_1        
		abyte0.bN = ((azh) (abyte0)).aC ^ a.bN;
	// 11268 21040:aload_1         
	// 11269 21041:aload_1         
	// 11270 21042:getfield        #94  <Field int azh.aC>
	// 11271 21045:aload_0         
	// 11272 21046:getfield        #12  <Field azh a>
	// 11273 21049:getfield        #432 <Field int azh.bN>
	// 11274 21052:ixor            
	// 11275 21053:putfield        #432 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 11276 21056:aload_0         
	// 11277 21057:getfield        #12  <Field azh a>
	// 11278 21060:astore_1        
		abyte0.W = ((azh) (abyte0)).bN ^ a.W;
	// 11279 21061:aload_1         
	// 11280 21062:aload_1         
	// 11281 21063:getfield        #432 <Field int azh.bN>
	// 11282 21066:aload_0         
	// 11283 21067:getfield        #12  <Field azh a>
	// 11284 21070:getfield        #166 <Field int azh.W>
	// 11285 21073:ixor            
	// 11286 21074:putfield        #166 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 11287 21077:aload_0         
	// 11288 21078:getfield        #12  <Field azh a>
	// 11289 21081:astore_1        
		abyte0.bc = ((azh) (abyte0)).bB ^ a.bc;
	// 11290 21082:aload_1         
	// 11291 21083:aload_1         
	// 11292 21084:getfield        #456 <Field int azh.bB>
	// 11293 21087:aload_0         
	// 11294 21088:getfield        #12  <Field azh a>
	// 11295 21091:getfield        #88  <Field int azh.bc>
	// 11296 21094:ixor            
	// 11297 21095:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 11298 21098:aload_0         
	// 11299 21099:getfield        #12  <Field azh a>
	// 11300 21102:astore_1        
		abyte0.bc = ((azh) (abyte0)).bE & ~a.bc;
	// 11301 21103:aload_1         
	// 11302 21104:aload_1         
	// 11303 21105:getfield        #199 <Field int azh.bE>
	// 11304 21108:aload_0         
	// 11305 21109:getfield        #12  <Field azh a>
	// 11306 21112:getfield        #88  <Field int azh.bc>
	// 11307 21115:iconst_m1       
	// 11308 21116:ixor            
	// 11309 21117:iand            
	// 11310 21118:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 11311 21121:aload_0         
	// 11312 21122:getfield        #12  <Field azh a>
	// 11313 21125:astore_1        
		abyte0.bc = ((azh) (abyte0)).ap ^ a.bc;
	// 11314 21126:aload_1         
	// 11315 21127:aload_1         
	// 11316 21128:getfield        #178 <Field int azh.ap>
	// 11317 21131:aload_0         
	// 11318 21132:getfield        #12  <Field azh a>
	// 11319 21135:getfield        #88  <Field int azh.bc>
	// 11320 21138:ixor            
	// 11321 21139:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 11322 21142:aload_0         
	// 11323 21143:getfield        #12  <Field azh a>
	// 11324 21146:astore_1        
		abyte0.bc = ((azh) (abyte0)).bc & ~a.j;
	// 11325 21147:aload_1         
	// 11326 21148:aload_1         
	// 11327 21149:getfield        #88  <Field int azh.bc>
	// 11328 21152:aload_0         
	// 11329 21153:getfield        #12  <Field azh a>
	// 11330 21156:getfield        #190 <Field int azh.j>
	// 11331 21159:iconst_m1       
	// 11332 21160:ixor            
	// 11333 21161:iand            
	// 11334 21162:putfield        #88  <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 11335 21165:aload_0         
	// 11336 21166:getfield        #12  <Field azh a>
	// 11337 21169:astore_1        
		abyte0.bh = ((azh) (abyte0)).bB ^ a.bh;
	// 11338 21170:aload_1         
	// 11339 21171:aload_1         
	// 11340 21172:getfield        #456 <Field int azh.bB>
	// 11341 21175:aload_0         
	// 11342 21176:getfield        #12  <Field azh a>
	// 11343 21179:getfield        #403 <Field int azh.bh>
	// 11344 21182:ixor            
	// 11345 21183:putfield        #403 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 11346 21186:aload_0         
	// 11347 21187:getfield        #12  <Field azh a>
	// 11348 21190:astore_1        
		abyte0.ap = ((azh) (abyte0)).aL | a.bB;
	// 11349 21191:aload_1         
	// 11350 21192:aload_1         
	// 11351 21193:getfield        #277 <Field int azh.aL>
	// 11352 21196:aload_0         
	// 11353 21197:getfield        #12  <Field azh a>
	// 11354 21200:getfield        #456 <Field int azh.bB>
	// 11355 21203:ior             
	// 11356 21204:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11357 21207:aload_0         
	// 11358 21208:getfield        #12  <Field azh a>
	// 11359 21211:astore_1        
		abyte0.ap = ((azh) (abyte0)).bv ^ a.ap;
	// 11360 21212:aload_1         
	// 11361 21213:aload_1         
	// 11362 21214:getfield        #274 <Field int azh.bv>
	// 11363 21217:aload_0         
	// 11364 21218:getfield        #12  <Field azh a>
	// 11365 21221:getfield        #178 <Field int azh.ap>
	// 11366 21224:ixor            
	// 11367 21225:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11368 21228:aload_0         
	// 11369 21229:getfield        #12  <Field azh a>
	// 11370 21232:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & a.bE;
	// 11371 21233:aload_1         
	// 11372 21234:aload_1         
	// 11373 21235:getfield        #178 <Field int azh.ap>
	// 11374 21238:aload_0         
	// 11375 21239:getfield        #12  <Field azh a>
	// 11376 21242:getfield        #199 <Field int azh.bE>
	// 11377 21245:iand            
	// 11378 21246:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11379 21249:aload_0         
	// 11380 21250:getfield        #12  <Field azh a>
	// 11381 21253:astore_1        
		abyte0.ap = ((azh) (abyte0)).ba ^ a.ap;
	// 11382 21254:aload_1         
	// 11383 21255:aload_1         
	// 11384 21256:getfield        #271 <Field int azh.ba>
	// 11385 21259:aload_0         
	// 11386 21260:getfield        #12  <Field azh a>
	// 11387 21263:getfield        #178 <Field int azh.ap>
	// 11388 21266:ixor            
	// 11389 21267:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11390 21270:aload_0         
	// 11391 21271:getfield        #12  <Field azh a>
	// 11392 21274:astore_1        
		abyte0.am = ((azh) (abyte0)).ap ^ a.am;
	// 11393 21275:aload_1         
	// 11394 21276:aload_1         
	// 11395 21277:getfield        #178 <Field int azh.ap>
	// 11396 21280:aload_0         
	// 11397 21281:getfield        #12  <Field azh a>
	// 11398 21284:getfield        #409 <Field int azh.am>
	// 11399 21287:ixor            
	// 11400 21288:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11401 21291:aload_0         
	// 11402 21292:getfield        #12  <Field azh a>
	// 11403 21295:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.al;
	// 11404 21296:aload_1         
	// 11405 21297:aload_1         
	// 11406 21298:getfield        #409 <Field int azh.am>
	// 11407 21301:aload_0         
	// 11408 21302:getfield        #12  <Field azh a>
	// 11409 21305:getfield        #370 <Field int azh.al>
	// 11410 21308:iconst_m1       
	// 11411 21309:ixor            
	// 11412 21310:iand            
	// 11413 21311:putfield        #409 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11414 21314:aload_0         
	// 11415 21315:getfield        #12  <Field azh a>
	// 11416 21318:astore_1        
		abyte0.ap = ((azh) (abyte0)).aL | a.bB;
	// 11417 21319:aload_1         
	// 11418 21320:aload_1         
	// 11419 21321:getfield        #277 <Field int azh.aL>
	// 11420 21324:aload_0         
	// 11421 21325:getfield        #12  <Field azh a>
	// 11422 21328:getfield        #456 <Field int azh.bB>
	// 11423 21331:ior             
	// 11424 21332:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11425 21335:aload_0         
	// 11426 21336:getfield        #12  <Field azh a>
	// 11427 21339:astore_1        
		abyte0.ap = ((azh) (abyte0)).bE & ~a.ap;
	// 11428 21340:aload_1         
	// 11429 21341:aload_1         
	// 11430 21342:getfield        #199 <Field int azh.bE>
	// 11431 21345:aload_0         
	// 11432 21346:getfield        #12  <Field azh a>
	// 11433 21349:getfield        #178 <Field int azh.ap>
	// 11434 21352:iconst_m1       
	// 11435 21353:ixor            
	// 11436 21354:iand            
	// 11437 21355:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11438 21358:aload_0         
	// 11439 21359:getfield        #12  <Field azh a>
	// 11440 21362:astore_1        
		abyte0.ap = ((azh) (abyte0)).bh ^ a.ap;
	// 11441 21363:aload_1         
	// 11442 21364:aload_1         
	// 11443 21365:getfield        #403 <Field int azh.bh>
	// 11444 21368:aload_0         
	// 11445 21369:getfield        #12  <Field azh a>
	// 11446 21372:getfield        #178 <Field int azh.ap>
	// 11447 21375:ixor            
	// 11448 21376:putfield        #178 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11449 21379:aload_0         
	// 11450 21380:getfield        #12  <Field azh a>
	// 11451 21383:astore_1        
		abyte0.bB = ((azh) (abyte0)).bl | a.bB;
	// 11452 21384:aload_1         
	// 11453 21385:aload_1         
	// 11454 21386:getfield        #501 <Field int azh.bl>
	// 11455 21389:aload_0         
	// 11456 21390:getfield        #12  <Field azh a>
	// 11457 21393:getfield        #456 <Field int azh.bB>
	// 11458 21396:ior             
	// 11459 21397:putfield        #456 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 11460 21400:aload_0         
	// 11461 21401:getfield        #12  <Field azh a>
	// 11462 21404:astore_1        
		abyte0.cg = ((azh) (abyte0)).bB ^ a.cg;
	// 11463 21405:aload_1         
	// 11464 21406:aload_1         
	// 11465 21407:getfield        #456 <Field int azh.bB>
	// 11466 21410:aload_0         
	// 11467 21411:getfield        #12  <Field azh a>
	// 11468 21414:getfield        #235 <Field int azh.cg>
	// 11469 21417:ixor            
	// 11470 21418:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 11471 21421:aload_0         
	// 11472 21422:getfield        #12  <Field azh a>
	// 11473 21425:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & ~a.bE;
	// 11474 21426:aload_1         
	// 11475 21427:aload_1         
	// 11476 21428:getfield        #235 <Field int azh.cg>
	// 11477 21431:aload_0         
	// 11478 21432:getfield        #12  <Field azh a>
	// 11479 21435:getfield        #199 <Field int azh.bE>
	// 11480 21438:iconst_m1       
	// 11481 21439:ixor            
	// 11482 21440:iand            
	// 11483 21441:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 11484 21444:aload_0         
	// 11485 21445:getfield        #12  <Field azh a>
	// 11486 21448:astore_1        
		abyte0.cg = ((azh) (abyte0)).aX ^ a.cg;
	// 11487 21449:aload_1         
	// 11488 21450:aload_1         
	// 11489 21451:getfield        #268 <Field int azh.aX>
	// 11490 21454:aload_0         
	// 11491 21455:getfield        #12  <Field azh a>
	// 11492 21458:getfield        #235 <Field int azh.cg>
	// 11493 21461:ixor            
	// 11494 21462:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 11495 21465:aload_0         
	// 11496 21466:getfield        #12  <Field azh a>
	// 11497 21469:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & ~a.j;
	// 11498 21470:aload_1         
	// 11499 21471:aload_1         
	// 11500 21472:getfield        #235 <Field int azh.cg>
	// 11501 21475:aload_0         
	// 11502 21476:getfield        #12  <Field azh a>
	// 11503 21479:getfield        #190 <Field int azh.j>
	// 11504 21482:iconst_m1       
	// 11505 21483:ixor            
	// 11506 21484:iand            
	// 11507 21485:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 11508 21488:aload_0         
	// 11509 21489:getfield        #12  <Field azh a>
	// 11510 21492:astore_1        
		abyte0.cg = ((azh) (abyte0)).ap ^ a.cg;
	// 11511 21493:aload_1         
	// 11512 21494:aload_1         
	// 11513 21495:getfield        #178 <Field int azh.ap>
	// 11514 21498:aload_0         
	// 11515 21499:getfield        #12  <Field azh a>
	// 11516 21502:getfield        #235 <Field int azh.cg>
	// 11517 21505:ixor            
	// 11518 21506:putfield        #235 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 11519 21509:aload_0         
	// 11520 21510:getfield        #12  <Field azh a>
	// 11521 21513:astore_1        
		abyte0.cg = ((azh) (abyte0)).al & a.cg;
	// 11522 21514:aload_1         
	// 11523 21515:aload_1         
	// 11524 21516:getfield        #370 <Field int azh.al>
	// 11525 21519:aload_0         
	// 11526 21520:getfield        #12  <Field azh a>
	// 11527 21523:getfield        #235 <Field int azh.cg>
	// 11528 21526:iand            
	// 11529 21527:putfield        #235 <Field int azh.cg>
	// 11530 21530:return          
	}

	private final azh a;
}
