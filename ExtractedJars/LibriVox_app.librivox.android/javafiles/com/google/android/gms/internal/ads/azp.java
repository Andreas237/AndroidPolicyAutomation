// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azp
	implements azk
{

	private azp(azh azh1)
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

	azp(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azp(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.ce = ((azh) (abyte0)).bq ^ a.ce;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.bq>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.ce>
	//    9   17:ixor            
	//   10   18:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field azh a>
	//   13   25:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce ^ a.z;
	//   14   26:aload_1         
	//   15   27:aload_1         
	//   16   28:getfield        #29  <Field int azh.ce>
	//   17   31:aload_0         
	//   18   32:getfield        #12  <Field azh a>
	//   19   35:getfield        #32  <Field int azh.z>
	//   20   38:ixor            
	//   21   39:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	//   22   42:aload_0         
	//   23   43:getfield        #12  <Field azh a>
	//   24   46:astore_1        
		abyte0.bS = ((azh) (abyte0)).ce ^ a.bS;
	//   25   47:aload_1         
	//   26   48:aload_1         
	//   27   49:getfield        #29  <Field int azh.ce>
	//   28   52:aload_0         
	//   29   53:getfield        #12  <Field azh a>
	//   30   56:getfield        #35  <Field int azh.bS>
	//   31   59:ixor            
	//   32   60:putfield        #35  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	//   33   63:aload_0         
	//   34   64:getfield        #12  <Field azh a>
	//   35   67:astore_1        
		abyte0.br = ((azh) (abyte0)).z & a.br;
	//   36   68:aload_1         
	//   37   69:aload_1         
	//   38   70:getfield        #32  <Field int azh.z>
	//   39   73:aload_0         
	//   40   74:getfield        #12  <Field azh a>
	//   41   77:getfield        #38  <Field int azh.br>
	//   42   80:iand            
	//   43   81:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	//   44   84:aload_0         
	//   45   85:getfield        #12  <Field azh a>
	//   46   88:astore_1        
		abyte0.br = ((azh) (abyte0)).bU ^ a.br;
	//   47   89:aload_1         
	//   48   90:aload_1         
	//   49   91:getfield        #41  <Field int azh.bU>
	//   50   94:aload_0         
	//   51   95:getfield        #12  <Field azh a>
	//   52   98:getfield        #38  <Field int azh.br>
	//   53  101:ixor            
	//   54  102:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	//   55  105:aload_0         
	//   56  106:getfield        #12  <Field azh a>
	//   57  109:astore_1        
		abyte0.bU = ((azh) (abyte0)).b ^ a.ad;
	//   58  110:aload_1         
	//   59  111:aload_1         
	//   60  112:getfield        #44  <Field int azh.b>
	//   61  115:aload_0         
	//   62  116:getfield        #12  <Field azh a>
	//   63  119:getfield        #47  <Field int azh.ad>
	//   64  122:ixor            
	//   65  123:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//   66  126:aload_0         
	//   67  127:getfield        #12  <Field azh a>
	//   68  130:astore_1        
		abyte0.ce = ((azh) (abyte0)).bU ^ a.N;
	//   69  131:aload_1         
	//   70  132:aload_1         
	//   71  133:getfield        #41  <Field int azh.bU>
	//   72  136:aload_0         
	//   73  137:getfield        #12  <Field azh a>
	//   74  140:getfield        #50  <Field int azh.N>
	//   75  143:ixor            
	//   76  144:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	//   77  147:aload_0         
	//   78  148:getfield        #12  <Field azh a>
	//   79  151:astore_1        
		abyte0.bq = ((azh) (abyte0)).N | a.bU;
	//   80  152:aload_1         
	//   81  153:aload_1         
	//   82  154:getfield        #50  <Field int azh.N>
	//   83  157:aload_0         
	//   84  158:getfield        #12  <Field azh a>
	//   85  161:getfield        #41  <Field int azh.bU>
	//   86  164:ior             
	//   87  165:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//   88  168:aload_0         
	//   89  169:getfield        #12  <Field azh a>
	//   90  172:astore_1        
		abyte0.bq = ((azh) (abyte0)).bU ^ a.bq;
	//   91  173:aload_1         
	//   92  174:aload_1         
	//   93  175:getfield        #41  <Field int azh.bU>
	//   94  178:aload_0         
	//   95  179:getfield        #12  <Field azh a>
	//   96  182:getfield        #26  <Field int azh.bq>
	//   97  185:ixor            
	//   98  186:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//   99  189:aload_0         
	//  100  190:getfield        #12  <Field azh a>
	//  101  193:astore_1        
		abyte0.av = ((azh) (abyte0)).bq ^ a.av;
	//  102  194:aload_1         
	//  103  195:aload_1         
	//  104  196:getfield        #26  <Field int azh.bq>
	//  105  199:aload_0         
	//  106  200:getfield        #12  <Field azh a>
	//  107  203:getfield        #53  <Field int azh.av>
	//  108  206:ixor            
	//  109  207:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  110  210:aload_0         
	//  111  211:getfield        #12  <Field azh a>
	//  112  214:astore_1        
		abyte0.bq = ((azh) (abyte0)).N | a.bU;
	//  113  215:aload_1         
	//  114  216:aload_1         
	//  115  217:getfield        #50  <Field int azh.N>
	//  116  220:aload_0         
	//  117  221:getfield        #12  <Field azh a>
	//  118  224:getfield        #41  <Field int azh.bU>
	//  119  227:ior             
	//  120  228:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  121  231:aload_0         
	//  122  232:getfield        #12  <Field azh a>
	//  123  235:astore_1        
		abyte0.bq = ((azh) (abyte0)).bq & ~a.al;
	//  124  236:aload_1         
	//  125  237:aload_1         
	//  126  238:getfield        #26  <Field int azh.bq>
	//  127  241:aload_0         
	//  128  242:getfield        #12  <Field azh a>
	//  129  245:getfield        #56  <Field int azh.al>
	//  130  248:iconst_m1       
	//  131  249:ixor            
	//  132  250:iand            
	//  133  251:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  134  254:aload_0         
	//  135  255:getfield        #12  <Field azh a>
	//  136  258:astore_1        
		abyte0.bq = ((azh) (abyte0)).bZ ^ a.bq;
	//  137  259:aload_1         
	//  138  260:aload_1         
	//  139  261:getfield        #59  <Field int azh.bZ>
	//  140  264:aload_0         
	//  141  265:getfield        #12  <Field azh a>
	//  142  268:getfield        #26  <Field int azh.bq>
	//  143  271:ixor            
	//  144  272:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  145  275:aload_0         
	//  146  276:getfield        #12  <Field azh a>
	//  147  279:astore_1        
		abyte0.bP = ((azh) (abyte0)).bq ^ a.bP;
	//  148  280:aload_1         
	//  149  281:aload_1         
	//  150  282:getfield        #26  <Field int azh.bq>
	//  151  285:aload_0         
	//  152  286:getfield        #12  <Field azh a>
	//  153  289:getfield        #62  <Field int azh.bP>
	//  154  292:ixor            
	//  155  293:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	//  156  296:aload_0         
	//  157  297:getfield        #12  <Field azh a>
	//  158  300:astore_1        
		abyte0.bq = ((azh) (abyte0)).b & ~a.N;
	//  159  301:aload_1         
	//  160  302:aload_1         
	//  161  303:getfield        #44  <Field int azh.b>
	//  162  306:aload_0         
	//  163  307:getfield        #12  <Field azh a>
	//  164  310:getfield        #50  <Field int azh.N>
	//  165  313:iconst_m1       
	//  166  314:ixor            
	//  167  315:iand            
	//  168  316:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  169  319:aload_0         
	//  170  320:getfield        #12  <Field azh a>
	//  171  323:astore_1        
		abyte0.bq = ((azh) (abyte0)).ad ^ a.bq;
	//  172  324:aload_1         
	//  173  325:aload_1         
	//  174  326:getfield        #47  <Field int azh.ad>
	//  175  329:aload_0         
	//  176  330:getfield        #12  <Field azh a>
	//  177  333:getfield        #26  <Field int azh.bq>
	//  178  336:ixor            
	//  179  337:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  180  340:aload_0         
	//  181  341:getfield        #12  <Field azh a>
	//  182  344:astore_1        
		abyte0.bq = ((azh) (abyte0)).al | a.bq;
	//  183  345:aload_1         
	//  184  346:aload_1         
	//  185  347:getfield        #56  <Field int azh.al>
	//  186  350:aload_0         
	//  187  351:getfield        #12  <Field azh a>
	//  188  354:getfield        #26  <Field int azh.bq>
	//  189  357:ior             
	//  190  358:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  191  361:aload_0         
	//  192  362:getfield        #12  <Field azh a>
	//  193  365:astore_1        
		abyte0.bq = ((azh) (abyte0)).bI ^ a.bq;
	//  194  366:aload_1         
	//  195  367:aload_1         
	//  196  368:getfield        #65  <Field int azh.bI>
	//  197  371:aload_0         
	//  198  372:getfield        #12  <Field azh a>
	//  199  375:getfield        #26  <Field int azh.bq>
	//  200  378:ixor            
	//  201  379:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  202  382:aload_0         
	//  203  383:getfield        #12  <Field azh a>
	//  204  386:astore_1        
		abyte0.bq = ((azh) (abyte0)).V | a.bq;
	//  205  387:aload_1         
	//  206  388:aload_1         
	//  207  389:getfield        #68  <Field int azh.V>
	//  208  392:aload_0         
	//  209  393:getfield        #12  <Field azh a>
	//  210  396:getfield        #26  <Field int azh.bq>
	//  211  399:ior             
	//  212  400:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  213  403:aload_0         
	//  214  404:getfield        #12  <Field azh a>
	//  215  407:astore_1        
		abyte0.bq = ((azh) (abyte0)).av ^ a.bq;
	//  216  408:aload_1         
	//  217  409:aload_1         
	//  218  410:getfield        #53  <Field int azh.av>
	//  219  413:aload_0         
	//  220  414:getfield        #12  <Field azh a>
	//  221  417:getfield        #26  <Field int azh.bq>
	//  222  420:ixor            
	//  223  421:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  224  424:aload_0         
	//  225  425:getfield        #12  <Field azh a>
	//  226  428:astore_1        
		abyte0.av = ((azh) (abyte0)).b ^ a.r;
	//  227  429:aload_1         
	//  228  430:aload_1         
	//  229  431:getfield        #44  <Field int azh.b>
	//  230  434:aload_0         
	//  231  435:getfield        #12  <Field azh a>
	//  232  438:getfield        #71  <Field int azh.r>
	//  233  441:ixor            
	//  234  442:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  235  445:aload_0         
	//  236  446:getfield        #12  <Field azh a>
	//  237  449:astore_1        
		abyte0.av = ((azh) (abyte0)).av & a.z;
	//  238  450:aload_1         
	//  239  451:aload_1         
	//  240  452:getfield        #53  <Field int azh.av>
	//  241  455:aload_0         
	//  242  456:getfield        #12  <Field azh a>
	//  243  459:getfield        #32  <Field int azh.z>
	//  244  462:iand            
	//  245  463:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  246  466:aload_0         
	//  247  467:getfield        #12  <Field azh a>
	//  248  470:astore_1        
		abyte0.av = ((azh) (abyte0)).bR ^ a.av;
	//  249  471:aload_1         
	//  250  472:aload_1         
	//  251  473:getfield        #74  <Field int azh.bR>
	//  252  476:aload_0         
	//  253  477:getfield        #12  <Field azh a>
	//  254  480:getfield        #53  <Field int azh.av>
	//  255  483:ixor            
	//  256  484:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  257  487:aload_0         
	//  258  488:getfield        #12  <Field azh a>
	//  259  491:astore_1        
		abyte0.av = ((azh) (abyte0)).al & ~a.av;
	//  260  492:aload_1         
	//  261  493:aload_1         
	//  262  494:getfield        #56  <Field int azh.al>
	//  263  497:aload_0         
	//  264  498:getfield        #12  <Field azh a>
	//  265  501:getfield        #53  <Field int azh.av>
	//  266  504:iconst_m1       
	//  267  505:ixor            
	//  268  506:iand            
	//  269  507:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  270  510:aload_0         
	//  271  511:getfield        #12  <Field azh a>
	//  272  514:astore_1        
		abyte0.av = ((azh) (abyte0)).br ^ a.av;
	//  273  515:aload_1         
	//  274  516:aload_1         
	//  275  517:getfield        #38  <Field int azh.br>
	//  276  520:aload_0         
	//  277  521:getfield        #12  <Field azh a>
	//  278  524:getfield        #53  <Field int azh.av>
	//  279  527:ixor            
	//  280  528:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  281  531:aload_0         
	//  282  532:getfield        #12  <Field azh a>
	//  283  535:astore_1        
		abyte0.aV = ((azh) (abyte0)).av ^ a.aV;
	//  284  536:aload_1         
	//  285  537:aload_1         
	//  286  538:getfield        #53  <Field int azh.av>
	//  287  541:aload_0         
	//  288  542:getfield        #12  <Field azh a>
	//  289  545:getfield        #77  <Field int azh.aV>
	//  290  548:ixor            
	//  291  549:putfield        #77  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  292  552:aload_0         
	//  293  553:getfield        #12  <Field azh a>
	//  294  556:astore_1        
		abyte0.A = ((azh) (abyte0)).aV ^ a.A;
	//  295  557:aload_1         
	//  296  558:aload_1         
	//  297  559:getfield        #77  <Field int azh.aV>
	//  298  562:aload_0         
	//  299  563:getfield        #12  <Field azh a>
	//  300  566:getfield        #80  <Field int azh.A>
	//  301  569:ixor            
	//  302  570:putfield        #80  <Field int azh.A>
		abyte0 = ((byte []) (a));
	//  303  573:aload_0         
	//  304  574:getfield        #12  <Field azh a>
	//  305  577:astore_1        
		abyte0.aV = ((azh) (abyte0)).A & ~a.Q;
	//  306  578:aload_1         
	//  307  579:aload_1         
	//  308  580:getfield        #80  <Field int azh.A>
	//  309  583:aload_0         
	//  310  584:getfield        #12  <Field azh a>
	//  311  587:getfield        #83  <Field int azh.Q>
	//  312  590:iconst_m1       
	//  313  591:ixor            
	//  314  592:iand            
	//  315  593:putfield        #77  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  316  596:aload_0         
	//  317  597:getfield        #12  <Field azh a>
	//  318  600:astore_1        
		abyte0.av = ((azh) (abyte0)).Q | a.A;
	//  319  601:aload_1         
	//  320  602:aload_1         
	//  321  603:getfield        #83  <Field int azh.Q>
	//  322  606:aload_0         
	//  323  607:getfield        #12  <Field azh a>
	//  324  610:getfield        #80  <Field int azh.A>
	//  325  613:ior             
	//  326  614:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  327  617:aload_0         
	//  328  618:getfield        #12  <Field azh a>
	//  329  621:astore_1        
		abyte0.bR = ((azh) (abyte0)).ad & a.b;
	//  330  622:aload_1         
	//  331  623:aload_1         
	//  332  624:getfield        #47  <Field int azh.ad>
	//  333  627:aload_0         
	//  334  628:getfield        #12  <Field azh a>
	//  335  631:getfield        #44  <Field int azh.b>
	//  336  634:iand            
	//  337  635:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	//  338  638:aload_0         
	//  339  639:getfield        #12  <Field azh a>
	//  340  642:astore_1        
		abyte0.bI = ((azh) (abyte0)).bR & a.al;
	//  341  643:aload_1         
	//  342  644:aload_1         
	//  343  645:getfield        #74  <Field int azh.bR>
	//  344  648:aload_0         
	//  345  649:getfield        #12  <Field azh a>
	//  346  652:getfield        #56  <Field int azh.al>
	//  347  655:iand            
	//  348  656:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  349  659:aload_0         
	//  350  660:getfield        #12  <Field azh a>
	//  351  663:astore_1        
		abyte0.bI = ((azh) (abyte0)).bL ^ a.bI;
	//  352  664:aload_1         
	//  353  665:aload_1         
	//  354  666:getfield        #86  <Field int azh.bL>
	//  355  669:aload_0         
	//  356  670:getfield        #12  <Field azh a>
	//  357  673:getfield        #65  <Field int azh.bI>
	//  358  676:ixor            
	//  359  677:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  360  680:aload_0         
	//  361  681:getfield        #12  <Field azh a>
	//  362  684:astore_1        
		abyte0.bI = ((azh) (abyte0)).bI & ~a.V;
	//  363  685:aload_1         
	//  364  686:aload_1         
	//  365  687:getfield        #65  <Field int azh.bI>
	//  366  690:aload_0         
	//  367  691:getfield        #12  <Field azh a>
	//  368  694:getfield        #68  <Field int azh.V>
	//  369  697:iconst_m1       
	//  370  698:ixor            
	//  371  699:iand            
	//  372  700:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  373  703:aload_0         
	//  374  704:getfield        #12  <Field azh a>
	//  375  707:astore_1        
		abyte0.bF = ((azh) (abyte0)).bR ^ a.bF;
	//  376  708:aload_1         
	//  377  709:aload_1         
	//  378  710:getfield        #74  <Field int azh.bR>
	//  379  713:aload_0         
	//  380  714:getfield        #12  <Field azh a>
	//  381  717:getfield        #89  <Field int azh.bF>
	//  382  720:ixor            
	//  383  721:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  384  724:aload_0         
	//  385  725:getfield        #12  <Field azh a>
	//  386  728:astore_1        
		abyte0.as = ((azh) (abyte0)).bF ^ a.as;
	//  387  729:aload_1         
	//  388  730:aload_1         
	//  389  731:getfield        #89  <Field int azh.bF>
	//  390  734:aload_0         
	//  391  735:getfield        #12  <Field azh a>
	//  392  738:getfield        #92  <Field int azh.as>
	//  393  741:ixor            
	//  394  742:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	//  395  745:aload_0         
	//  396  746:getfield        #12  <Field azh a>
	//  397  749:astore_1        
		abyte0.as = ((azh) (abyte0)).V | a.as;
	//  398  750:aload_1         
	//  399  751:aload_1         
	//  400  752:getfield        #68  <Field int azh.V>
	//  401  755:aload_0         
	//  402  756:getfield        #12  <Field azh a>
	//  403  759:getfield        #92  <Field int azh.as>
	//  404  762:ior             
	//  405  763:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	//  406  766:aload_0         
	//  407  767:getfield        #12  <Field azh a>
	//  408  770:astore_1        
		abyte0.bF = ((azh) (abyte0)).bR & ~a.N;
	//  409  771:aload_1         
	//  410  772:aload_1         
	//  411  773:getfield        #74  <Field int azh.bR>
	//  412  776:aload_0         
	//  413  777:getfield        #12  <Field azh a>
	//  414  780:getfield        #50  <Field int azh.N>
	//  415  783:iconst_m1       
	//  416  784:ixor            
	//  417  785:iand            
	//  418  786:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  419  789:aload_0         
	//  420  790:getfield        #12  <Field azh a>
	//  421  793:astore_1        
		abyte0.bF = ((azh) (abyte0)).bU ^ a.bF;
	//  422  794:aload_1         
	//  423  795:aload_1         
	//  424  796:getfield        #41  <Field int azh.bU>
	//  425  799:aload_0         
	//  426  800:getfield        #12  <Field azh a>
	//  427  803:getfield        #89  <Field int azh.bF>
	//  428  806:ixor            
	//  429  807:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  430  810:aload_0         
	//  431  811:getfield        #12  <Field azh a>
	//  432  814:astore_1        
		abyte0.bF = ((azh) (abyte0)).al | a.bF;
	//  433  815:aload_1         
	//  434  816:aload_1         
	//  435  817:getfield        #56  <Field int azh.al>
	//  436  820:aload_0         
	//  437  821:getfield        #12  <Field azh a>
	//  438  824:getfield        #89  <Field int azh.bF>
	//  439  827:ior             
	//  440  828:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  441  831:aload_0         
	//  442  832:getfield        #12  <Field azh a>
	//  443  835:astore_1        
		abyte0.bF = ((azh) (abyte0)).ce ^ a.bF;
	//  444  836:aload_1         
	//  445  837:aload_1         
	//  446  838:getfield        #29  <Field int azh.ce>
	//  447  841:aload_0         
	//  448  842:getfield        #12  <Field azh a>
	//  449  845:getfield        #89  <Field int azh.bF>
	//  450  848:ixor            
	//  451  849:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  452  852:aload_0         
	//  453  853:getfield        #12  <Field azh a>
	//  454  856:astore_1        
		abyte0.aH = ((azh) (abyte0)).bF ^ a.aH;
	//  455  857:aload_1         
	//  456  858:aload_1         
	//  457  859:getfield        #89  <Field int azh.bF>
	//  458  862:aload_0         
	//  459  863:getfield        #12  <Field azh a>
	//  460  866:getfield        #95  <Field int azh.aH>
	//  461  869:ixor            
	//  462  870:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  463  873:aload_0         
	//  464  874:getfield        #12  <Field azh a>
	//  465  877:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH | a.F;
	//  466  878:aload_1         
	//  467  879:aload_1         
	//  468  880:getfield        #95  <Field int azh.aH>
	//  469  883:aload_0         
	//  470  884:getfield        #12  <Field azh a>
	//  471  887:getfield        #98  <Field int azh.F>
	//  472  890:ior             
	//  473  891:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  474  894:aload_0         
	//  475  895:getfield        #12  <Field azh a>
	//  476  898:astore_1        
		abyte0.aH = ((azh) (abyte0)).au ^ a.aH;
	//  477  899:aload_1         
	//  478  900:aload_1         
	//  479  901:getfield        #101 <Field int azh.au>
	//  480  904:aload_0         
	//  481  905:getfield        #12  <Field azh a>
	//  482  908:getfield        #95  <Field int azh.aH>
	//  483  911:ixor            
	//  484  912:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  485  915:aload_0         
	//  486  916:getfield        #12  <Field azh a>
	//  487  919:astore_1        
		abyte0.ag = ((azh) (abyte0)).aH ^ a.ag;
	//  488  920:aload_1         
	//  489  921:aload_1         
	//  490  922:getfield        #95  <Field int azh.aH>
	//  491  925:aload_0         
	//  492  926:getfield        #12  <Field azh a>
	//  493  929:getfield        #104 <Field int azh.ag>
	//  494  932:ixor            
	//  495  933:putfield        #104 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  496  936:aload_0         
	//  497  937:getfield        #12  <Field azh a>
	//  498  940:astore_1        
		abyte0.aH = ((azh) (abyte0)).Q & ~a.ag;
	//  499  941:aload_1         
	//  500  942:aload_1         
	//  501  943:getfield        #83  <Field int azh.Q>
	//  502  946:aload_0         
	//  503  947:getfield        #12  <Field azh a>
	//  504  950:getfield        #104 <Field int azh.ag>
	//  505  953:iconst_m1       
	//  506  954:ixor            
	//  507  955:iand            
	//  508  956:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  509  959:aload_0         
	//  510  960:getfield        #12  <Field azh a>
	//  511  963:astore_1        
		abyte0.au = ((azh) (abyte0)).A & ~a.ag;
	//  512  964:aload_1         
	//  513  965:aload_1         
	//  514  966:getfield        #80  <Field int azh.A>
	//  515  969:aload_0         
	//  516  970:getfield        #12  <Field azh a>
	//  517  973:getfield        #104 <Field int azh.ag>
	//  518  976:iconst_m1       
	//  519  977:ixor            
	//  520  978:iand            
	//  521  979:putfield        #101 <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  522  982:aload_0         
	//  523  983:getfield        #12  <Field azh a>
	//  524  986:astore_1        
		abyte0.bF = ((azh) (abyte0)).N | a.bR;
	//  525  987:aload_1         
	//  526  988:aload_1         
	//  527  989:getfield        #50  <Field int azh.N>
	//  528  992:aload_0         
	//  529  993:getfield        #12  <Field azh a>
	//  530  996:getfield        #74  <Field int azh.bR>
	//  531  999:ior             
	//  532 1000:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  533 1003:aload_0         
	//  534 1004:getfield        #12  <Field azh a>
	//  535 1007:astore_1        
		abyte0.bF = ((azh) (abyte0)).aN ^ a.bF;
	//  536 1008:aload_1         
	//  537 1009:aload_1         
	//  538 1010:getfield        #107 <Field int azh.aN>
	//  539 1013:aload_0         
	//  540 1014:getfield        #12  <Field azh a>
	//  541 1017:getfield        #89  <Field int azh.bF>
	//  542 1020:ixor            
	//  543 1021:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  544 1024:aload_0         
	//  545 1025:getfield        #12  <Field azh a>
	//  546 1028:astore_1        
		abyte0.aN = ((azh) (abyte0)).bR & ~a.N;
	//  547 1029:aload_1         
	//  548 1030:aload_1         
	//  549 1031:getfield        #74  <Field int azh.bR>
	//  550 1034:aload_0         
	//  551 1035:getfield        #12  <Field azh a>
	//  552 1038:getfield        #50  <Field int azh.N>
	//  553 1041:iconst_m1       
	//  554 1042:ixor            
	//  555 1043:iand            
	//  556 1044:putfield        #107 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  557 1047:aload_0         
	//  558 1048:getfield        #12  <Field azh a>
	//  559 1051:astore_1        
		abyte0.aN = ((azh) (abyte0)).bR ^ a.aN;
	//  560 1052:aload_1         
	//  561 1053:aload_1         
	//  562 1054:getfield        #74  <Field int azh.bR>
	//  563 1057:aload_0         
	//  564 1058:getfield        #12  <Field azh a>
	//  565 1061:getfield        #107 <Field int azh.aN>
	//  566 1064:ixor            
	//  567 1065:putfield        #107 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//  568 1068:aload_0         
	//  569 1069:getfield        #12  <Field azh a>
	//  570 1072:astore_1        
		abyte0.bU = ((azh) (abyte0)).aN & ~a.al;
	//  571 1073:aload_1         
	//  572 1074:aload_1         
	//  573 1075:getfield        #107 <Field int azh.aN>
	//  574 1078:aload_0         
	//  575 1079:getfield        #12  <Field azh a>
	//  576 1082:getfield        #56  <Field int azh.al>
	//  577 1085:iconst_m1       
	//  578 1086:ixor            
	//  579 1087:iand            
	//  580 1088:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//  581 1091:aload_0         
	//  582 1092:getfield        #12  <Field azh a>
	//  583 1095:astore_1        
		abyte0.bU = ((azh) (abyte0)).aL ^ a.bU;
	//  584 1096:aload_1         
	//  585 1097:aload_1         
	//  586 1098:getfield        #110 <Field int azh.aL>
	//  587 1101:aload_0         
	//  588 1102:getfield        #12  <Field azh a>
	//  589 1105:getfield        #41  <Field int azh.bU>
	//  590 1108:ixor            
	//  591 1109:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//  592 1112:aload_0         
	//  593 1113:getfield        #12  <Field azh a>
	//  594 1116:astore_1        
		abyte0.bI = ((azh) (abyte0)).bU ^ a.bI;
	//  595 1117:aload_1         
	//  596 1118:aload_1         
	//  597 1119:getfield        #41  <Field int azh.bU>
	//  598 1122:aload_0         
	//  599 1123:getfield        #12  <Field azh a>
	//  600 1126:getfield        #65  <Field int azh.bI>
	//  601 1129:ixor            
	//  602 1130:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  603 1133:aload_0         
	//  604 1134:getfield        #12  <Field azh a>
	//  605 1137:astore_1        
		abyte0.bI = ((azh) (abyte0)).bI | a.F;
	//  606 1138:aload_1         
	//  607 1139:aload_1         
	//  608 1140:getfield        #65  <Field int azh.bI>
	//  609 1143:aload_0         
	//  610 1144:getfield        #12  <Field azh a>
	//  611 1147:getfield        #98  <Field int azh.F>
	//  612 1150:ior             
	//  613 1151:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  614 1154:aload_0         
	//  615 1155:getfield        #12  <Field azh a>
	//  616 1158:astore_1        
		abyte0.bI = ((azh) (abyte0)).bq ^ a.bI;
	//  617 1159:aload_1         
	//  618 1160:aload_1         
	//  619 1161:getfield        #26  <Field int azh.bq>
	//  620 1164:aload_0         
	//  621 1165:getfield        #12  <Field azh a>
	//  622 1168:getfield        #65  <Field int azh.bI>
	//  623 1171:ixor            
	//  624 1172:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  625 1175:aload_0         
	//  626 1176:getfield        #12  <Field azh a>
	//  627 1179:astore_1        
		abyte0.ai = ((azh) (abyte0)).bI ^ a.ai;
	//  628 1180:aload_1         
	//  629 1181:aload_1         
	//  630 1182:getfield        #65  <Field int azh.bI>
	//  631 1185:aload_0         
	//  632 1186:getfield        #12  <Field azh a>
	//  633 1189:getfield        #113 <Field int azh.ai>
	//  634 1192:ixor            
	//  635 1193:putfield        #113 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	//  636 1196:aload_0         
	//  637 1197:getfield        #12  <Field azh a>
	//  638 1200:astore_1        
		abyte0.bI = ((azh) (abyte0)).g & a.ai;
	//  639 1201:aload_1         
	//  640 1202:aload_1         
	//  641 1203:getfield        #116 <Field int azh.g>
	//  642 1206:aload_0         
	//  643 1207:getfield        #12  <Field azh a>
	//  644 1210:getfield        #113 <Field int azh.ai>
	//  645 1213:iand            
	//  646 1214:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  647 1217:aload_0         
	//  648 1218:getfield        #12  <Field azh a>
	//  649 1221:astore_1        
		abyte0.bq = ((azh) (abyte0)).g & ~a.ai;
	//  650 1222:aload_1         
	//  651 1223:aload_1         
	//  652 1224:getfield        #116 <Field int azh.g>
	//  653 1227:aload_0         
	//  654 1228:getfield        #12  <Field azh a>
	//  655 1231:getfield        #113 <Field int azh.ai>
	//  656 1234:iconst_m1       
	//  657 1235:ixor            
	//  658 1236:iand            
	//  659 1237:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  660 1240:aload_0         
	//  661 1241:getfield        #12  <Field azh a>
	//  662 1244:astore_1        
		abyte0.bq = ((azh) (abyte0)).bq & a.o;
	//  663 1245:aload_1         
	//  664 1246:aload_1         
	//  665 1247:getfield        #26  <Field int azh.bq>
	//  666 1250:aload_0         
	//  667 1251:getfield        #12  <Field azh a>
	//  668 1254:getfield        #119 <Field int azh.o>
	//  669 1257:iand            
	//  670 1258:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  671 1261:aload_0         
	//  672 1262:getfield        #12  <Field azh a>
	//  673 1265:astore_1        
		abyte0.bq = ((azh) (abyte0)).ai ^ a.bq;
	//  674 1266:aload_1         
	//  675 1267:aload_1         
	//  676 1268:getfield        #113 <Field int azh.ai>
	//  677 1271:aload_0         
	//  678 1272:getfield        #12  <Field azh a>
	//  679 1275:getfield        #26  <Field int azh.bq>
	//  680 1278:ixor            
	//  681 1279:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	//  682 1282:aload_0         
	//  683 1283:getfield        #12  <Field azh a>
	//  684 1286:astore_1        
		abyte0.bh = ((azh) (abyte0)).ai ^ a.bh;
	//  685 1287:aload_1         
	//  686 1288:aload_1         
	//  687 1289:getfield        #113 <Field int azh.ai>
	//  688 1292:aload_0         
	//  689 1293:getfield        #12  <Field azh a>
	//  690 1296:getfield        #122 <Field int azh.bh>
	//  691 1299:ixor            
	//  692 1300:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  693 1303:aload_0         
	//  694 1304:getfield        #12  <Field azh a>
	//  695 1307:astore_1        
		abyte0.bU = ((azh) (abyte0)).ai & ~a.M;
	//  696 1308:aload_1         
	//  697 1309:aload_1         
	//  698 1310:getfield        #113 <Field int azh.ai>
	//  699 1313:aload_0         
	//  700 1314:getfield        #12  <Field azh a>
	//  701 1317:getfield        #125 <Field int azh.M>
	//  702 1320:iconst_m1       
	//  703 1321:ixor            
	//  704 1322:iand            
	//  705 1323:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//  706 1326:aload_0         
	//  707 1327:getfield        #12  <Field azh a>
	//  708 1330:astore_1        
		abyte0.aL = ((azh) (abyte0)).g & a.bU;
	//  709 1331:aload_1         
	//  710 1332:aload_1         
	//  711 1333:getfield        #116 <Field int azh.g>
	//  712 1336:aload_0         
	//  713 1337:getfield        #12  <Field azh a>
	//  714 1340:getfield        #41  <Field int azh.bU>
	//  715 1343:iand            
	//  716 1344:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	//  717 1347:aload_0         
	//  718 1348:getfield        #12  <Field azh a>
	//  719 1351:astore_1        
		abyte0.bU = ((azh) (abyte0)).g & a.bU;
	//  720 1352:aload_1         
	//  721 1353:aload_1         
	//  722 1354:getfield        #116 <Field int azh.g>
	//  723 1357:aload_0         
	//  724 1358:getfield        #12  <Field azh a>
	//  725 1361:getfield        #41  <Field int azh.bU>
	//  726 1364:iand            
	//  727 1365:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//  728 1368:aload_0         
	//  729 1369:getfield        #12  <Field azh a>
	//  730 1372:astore_1        
		abyte0.bU = ((azh) (abyte0)).ai ^ a.bU;
	//  731 1373:aload_1         
	//  732 1374:aload_1         
	//  733 1375:getfield        #113 <Field int azh.ai>
	//  734 1378:aload_0         
	//  735 1379:getfield        #12  <Field azh a>
	//  736 1382:getfield        #41  <Field int azh.bU>
	//  737 1385:ixor            
	//  738 1386:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//  739 1389:aload_0         
	//  740 1390:getfield        #12  <Field azh a>
	//  741 1393:astore_1        
		abyte0.cf = ((azh) (abyte0)).bU ^ a.cf;
	//  742 1394:aload_1         
	//  743 1395:aload_1         
	//  744 1396:getfield        #41  <Field int azh.bU>
	//  745 1399:aload_0         
	//  746 1400:getfield        #12  <Field azh a>
	//  747 1403:getfield        #128 <Field int azh.cf>
	//  748 1406:ixor            
	//  749 1407:putfield        #128 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	//  750 1410:aload_0         
	//  751 1411:getfield        #12  <Field azh a>
	//  752 1414:astore_1        
		abyte0.bU = ((azh) (abyte0)).bU & ~a.o;
	//  753 1415:aload_1         
	//  754 1416:aload_1         
	//  755 1417:getfield        #41  <Field int azh.bU>
	//  756 1420:aload_0         
	//  757 1421:getfield        #12  <Field azh a>
	//  758 1424:getfield        #119 <Field int azh.o>
	//  759 1427:iconst_m1       
	//  760 1428:ixor            
	//  761 1429:iand            
	//  762 1430:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//  763 1433:aload_0         
	//  764 1434:getfield        #12  <Field azh a>
	//  765 1437:astore_1        
		abyte0.bU = ((azh) (abyte0)).ai ^ a.bU;
	//  766 1438:aload_1         
	//  767 1439:aload_1         
	//  768 1440:getfield        #113 <Field int azh.ai>
	//  769 1443:aload_0         
	//  770 1444:getfield        #12  <Field azh a>
	//  771 1447:getfield        #41  <Field int azh.bU>
	//  772 1450:ixor            
	//  773 1451:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	//  774 1454:aload_0         
	//  775 1455:getfield        #12  <Field azh a>
	//  776 1458:astore_1        
		abyte0.bL = ((azh) (abyte0)).M & ~a.ai;
	//  777 1459:aload_1         
	//  778 1460:aload_1         
	//  779 1461:getfield        #125 <Field int azh.M>
	//  780 1464:aload_0         
	//  781 1465:getfield        #12  <Field azh a>
	//  782 1468:getfield        #113 <Field int azh.ai>
	//  783 1471:iconst_m1       
	//  784 1472:ixor            
	//  785 1473:iand            
	//  786 1474:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	//  787 1477:aload_0         
	//  788 1478:getfield        #12  <Field azh a>
	//  789 1481:astore_1        
		abyte0.bZ = ((azh) (abyte0)).g & a.bL;
	//  790 1482:aload_1         
	//  791 1483:aload_1         
	//  792 1484:getfield        #116 <Field int azh.g>
	//  793 1487:aload_0         
	//  794 1488:getfield        #12  <Field azh a>
	//  795 1491:getfield        #86  <Field int azh.bL>
	//  796 1494:iand            
	//  797 1495:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  798 1498:aload_0         
	//  799 1499:getfield        #12  <Field azh a>
	//  800 1502:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bL ^ a.bZ;
	//  801 1503:aload_1         
	//  802 1504:aload_1         
	//  803 1505:getfield        #86  <Field int azh.bL>
	//  804 1508:aload_0         
	//  805 1509:getfield        #12  <Field azh a>
	//  806 1512:getfield        #59  <Field int azh.bZ>
	//  807 1515:ixor            
	//  808 1516:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  809 1519:aload_0         
	//  810 1520:getfield        #12  <Field azh a>
	//  811 1523:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & ~a.o;
	//  812 1524:aload_1         
	//  813 1525:aload_1         
	//  814 1526:getfield        #59  <Field int azh.bZ>
	//  815 1529:aload_0         
	//  816 1530:getfield        #12  <Field azh a>
	//  817 1533:getfield        #119 <Field int azh.o>
	//  818 1536:iconst_m1       
	//  819 1537:ixor            
	//  820 1538:iand            
	//  821 1539:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  822 1542:aload_0         
	//  823 1543:getfield        #12  <Field azh a>
	//  824 1546:astore_1        
		abyte0.bL = ((azh) (abyte0)).g & a.bL;
	//  825 1547:aload_1         
	//  826 1548:aload_1         
	//  827 1549:getfield        #116 <Field int azh.g>
	//  828 1552:aload_0         
	//  829 1553:getfield        #12  <Field azh a>
	//  830 1556:getfield        #86  <Field int azh.bL>
	//  831 1559:iand            
	//  832 1560:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	//  833 1563:aload_0         
	//  834 1564:getfield        #12  <Field azh a>
	//  835 1567:astore_1        
		abyte0.bL = ((azh) (abyte0)).o & ~a.bL;
	//  836 1568:aload_1         
	//  837 1569:aload_1         
	//  838 1570:getfield        #119 <Field int azh.o>
	//  839 1573:aload_0         
	//  840 1574:getfield        #12  <Field azh a>
	//  841 1577:getfield        #86  <Field int azh.bL>
	//  842 1580:iconst_m1       
	//  843 1581:ixor            
	//  844 1582:iand            
	//  845 1583:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	//  846 1586:aload_0         
	//  847 1587:getfield        #12  <Field azh a>
	//  848 1590:astore_1        
		abyte0.bL = ((azh) (abyte0)).bh ^ a.bL;
	//  849 1591:aload_1         
	//  850 1592:aload_1         
	//  851 1593:getfield        #122 <Field int azh.bh>
	//  852 1596:aload_0         
	//  853 1597:getfield        #12  <Field azh a>
	//  854 1600:getfield        #86  <Field int azh.bL>
	//  855 1603:ixor            
	//  856 1604:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	//  857 1607:aload_0         
	//  858 1608:getfield        #12  <Field azh a>
	//  859 1611:astore_1        
		abyte0.bh = ((azh) (abyte0)).M | a.ai;
	//  860 1612:aload_1         
	//  861 1613:aload_1         
	//  862 1614:getfield        #125 <Field int azh.M>
	//  863 1617:aload_0         
	//  864 1618:getfield        #12  <Field azh a>
	//  865 1621:getfield        #113 <Field int azh.ai>
	//  866 1624:ior             
	//  867 1625:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  868 1628:aload_0         
	//  869 1629:getfield        #12  <Field azh a>
	//  870 1632:astore_1        
		abyte0.bc = ((azh) (abyte0)).g & ~a.bh;
	//  871 1633:aload_1         
	//  872 1634:aload_1         
	//  873 1635:getfield        #116 <Field int azh.g>
	//  874 1638:aload_0         
	//  875 1639:getfield        #12  <Field azh a>
	//  876 1642:getfield        #122 <Field int azh.bh>
	//  877 1645:iconst_m1       
	//  878 1646:ixor            
	//  879 1647:iand            
	//  880 1648:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  881 1651:aload_0         
	//  882 1652:getfield        #12  <Field azh a>
	//  883 1655:astore_1        
		abyte0.bI = ((azh) (abyte0)).bh ^ a.bI;
	//  884 1656:aload_1         
	//  885 1657:aload_1         
	//  886 1658:getfield        #122 <Field int azh.bh>
	//  887 1661:aload_0         
	//  888 1662:getfield        #12  <Field azh a>
	//  889 1665:getfield        #65  <Field int azh.bI>
	//  890 1668:ixor            
	//  891 1669:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  892 1672:aload_0         
	//  893 1673:getfield        #12  <Field azh a>
	//  894 1676:astore_1        
		abyte0.bI = ((azh) (abyte0)).o & ~a.bI;
	//  895 1677:aload_1         
	//  896 1678:aload_1         
	//  897 1679:getfield        #119 <Field int azh.o>
	//  898 1682:aload_0         
	//  899 1683:getfield        #12  <Field azh a>
	//  900 1686:getfield        #65  <Field int azh.bI>
	//  901 1689:iconst_m1       
	//  902 1690:ixor            
	//  903 1691:iand            
	//  904 1692:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  905 1695:aload_0         
	//  906 1696:getfield        #12  <Field azh a>
	//  907 1699:astore_1        
		abyte0.bC = ((azh) (abyte0)).bh & ~a.ai;
	//  908 1700:aload_1         
	//  909 1701:aload_1         
	//  910 1702:getfield        #122 <Field int azh.bh>
	//  911 1705:aload_0         
	//  912 1706:getfield        #12  <Field azh a>
	//  913 1709:getfield        #113 <Field int azh.ai>
	//  914 1712:iconst_m1       
	//  915 1713:ixor            
	//  916 1714:iand            
	//  917 1715:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	//  918 1718:aload_0         
	//  919 1719:getfield        #12  <Field azh a>
	//  920 1722:astore_1        
		abyte0.bC = ((azh) (abyte0)).g & ~a.bC;
	//  921 1723:aload_1         
	//  922 1724:aload_1         
	//  923 1725:getfield        #116 <Field int azh.g>
	//  924 1728:aload_0         
	//  925 1729:getfield        #12  <Field azh a>
	//  926 1732:getfield        #134 <Field int azh.bC>
	//  927 1735:iconst_m1       
	//  928 1736:ixor            
	//  929 1737:iand            
	//  930 1738:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	//  931 1741:aload_0         
	//  932 1742:getfield        #12  <Field azh a>
	//  933 1745:astore_1        
		abyte0.bC = ((azh) (abyte0)).bh ^ a.bC;
	//  934 1746:aload_1         
	//  935 1747:aload_1         
	//  936 1748:getfield        #122 <Field int azh.bh>
	//  937 1751:aload_0         
	//  938 1752:getfield        #12  <Field azh a>
	//  939 1755:getfield        #134 <Field int azh.bC>
	//  940 1758:ixor            
	//  941 1759:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	//  942 1762:aload_0         
	//  943 1763:getfield        #12  <Field azh a>
	//  944 1766:astore_1        
		abyte0.bh = ((azh) (abyte0)).M & a.ai;
	//  945 1767:aload_1         
	//  946 1768:aload_1         
	//  947 1769:getfield        #125 <Field int azh.M>
	//  948 1772:aload_0         
	//  949 1773:getfield        #12  <Field azh a>
	//  950 1776:getfield        #113 <Field int azh.ai>
	//  951 1779:iand            
	//  952 1780:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  953 1783:aload_0         
	//  954 1784:getfield        #12  <Field azh a>
	//  955 1787:astore_1        
		abyte0.aT = ((azh) (abyte0)).bh ^ a.g;
	//  956 1788:aload_1         
	//  957 1789:aload_1         
	//  958 1790:getfield        #122 <Field int azh.bh>
	//  959 1793:aload_0         
	//  960 1794:getfield        #12  <Field azh a>
	//  961 1797:getfield        #116 <Field int azh.g>
	//  962 1800:ixor            
	//  963 1801:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  964 1804:aload_0         
	//  965 1805:getfield        #12  <Field azh a>
	//  966 1808:astore_1        
		abyte0.aT = ((azh) (abyte0)).o | a.aT;
	//  967 1809:aload_1         
	//  968 1810:aload_1         
	//  969 1811:getfield        #119 <Field int azh.o>
	//  970 1814:aload_0         
	//  971 1815:getfield        #12  <Field azh a>
	//  972 1818:getfield        #137 <Field int azh.aT>
	//  973 1821:ior             
	//  974 1822:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  975 1825:aload_0         
	//  976 1826:getfield        #12  <Field azh a>
	//  977 1829:astore_1        
		abyte0.be = ((azh) (abyte0)).ai & ~a.bh;
	//  978 1830:aload_1         
	//  979 1831:aload_1         
	//  980 1832:getfield        #113 <Field int azh.ai>
	//  981 1835:aload_0         
	//  982 1836:getfield        #12  <Field azh a>
	//  983 1839:getfield        #122 <Field int azh.bh>
	//  984 1842:iconst_m1       
	//  985 1843:ixor            
	//  986 1844:iand            
	//  987 1845:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	//  988 1848:aload_0         
	//  989 1849:getfield        #12  <Field azh a>
	//  990 1852:astore_1        
		abyte0.bg = ((azh) (abyte0)).g & ~a.be;
	//  991 1853:aload_1         
	//  992 1854:aload_1         
	//  993 1855:getfield        #116 <Field int azh.g>
	//  994 1858:aload_0         
	//  995 1859:getfield        #12  <Field azh a>
	//  996 1862:getfield        #140 <Field int azh.be>
	//  997 1865:iconst_m1       
	//  998 1866:ixor            
	//  999 1867:iand            
	// 1000 1868:putfield        #143 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1001 1871:aload_0         
	// 1002 1872:getfield        #12  <Field azh a>
	// 1003 1875:astore_1        
		abyte0.ao = ((azh) (abyte0)).bg & a.o;
	// 1004 1876:aload_1         
	// 1005 1877:aload_1         
	// 1006 1878:getfield        #143 <Field int azh.bg>
	// 1007 1881:aload_0         
	// 1008 1882:getfield        #12  <Field azh a>
	// 1009 1885:getfield        #119 <Field int azh.o>
	// 1010 1888:iand            
	// 1011 1889:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1012 1892:aload_0         
	// 1013 1893:getfield        #12  <Field azh a>
	// 1014 1896:astore_1        
		abyte0.bg = ((azh) (abyte0)).o | a.bg;
	// 1015 1897:aload_1         
	// 1016 1898:aload_1         
	// 1017 1899:getfield        #119 <Field int azh.o>
	// 1018 1902:aload_0         
	// 1019 1903:getfield        #12  <Field azh a>
	// 1020 1906:getfield        #143 <Field int azh.bg>
	// 1021 1909:ior             
	// 1022 1910:putfield        #143 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1023 1913:aload_0         
	// 1024 1914:getfield        #12  <Field azh a>
	// 1025 1917:astore_1        
		abyte0.bg = ((azh) (abyte0)).cd ^ a.bg;
	// 1026 1918:aload_1         
	// 1027 1919:aload_1         
	// 1028 1920:getfield        #149 <Field int azh.cd>
	// 1029 1923:aload_0         
	// 1030 1924:getfield        #12  <Field azh a>
	// 1031 1927:getfield        #143 <Field int azh.bg>
	// 1032 1930:ixor            
	// 1033 1931:putfield        #143 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1034 1934:aload_0         
	// 1035 1935:getfield        #12  <Field azh a>
	// 1036 1938:astore_1        
		abyte0.be = ((azh) (abyte0)).g & ~a.be;
	// 1037 1939:aload_1         
	// 1038 1940:aload_1         
	// 1039 1941:getfield        #116 <Field int azh.g>
	// 1040 1944:aload_0         
	// 1041 1945:getfield        #12  <Field azh a>
	// 1042 1948:getfield        #140 <Field int azh.be>
	// 1043 1951:iconst_m1       
	// 1044 1952:ixor            
	// 1045 1953:iand            
	// 1046 1954:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1047 1957:aload_0         
	// 1048 1958:getfield        #12  <Field azh a>
	// 1049 1961:astore_1        
		abyte0.be = ((azh) (abyte0)).bh ^ a.be;
	// 1050 1962:aload_1         
	// 1051 1963:aload_1         
	// 1052 1964:getfield        #122 <Field int azh.bh>
	// 1053 1967:aload_0         
	// 1054 1968:getfield        #12  <Field azh a>
	// 1055 1971:getfield        #140 <Field int azh.be>
	// 1056 1974:ixor            
	// 1057 1975:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1058 1978:aload_0         
	// 1059 1979:getfield        #12  <Field azh a>
	// 1060 1982:astore_1        
		abyte0.aT = ((azh) (abyte0)).be ^ a.aT;
	// 1061 1983:aload_1         
	// 1062 1984:aload_1         
	// 1063 1985:getfield        #140 <Field int azh.be>
	// 1064 1988:aload_0         
	// 1065 1989:getfield        #12  <Field azh a>
	// 1066 1992:getfield        #137 <Field int azh.aT>
	// 1067 1995:ixor            
	// 1068 1996:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 1069 1999:aload_0         
	// 1070 2000:getfield        #12  <Field azh a>
	// 1071 2003:astore_1        
		abyte0.aO = ((azh) (abyte0)).bh ^ a.aO;
	// 1072 2004:aload_1         
	// 1073 2005:aload_1         
	// 1074 2006:getfield        #122 <Field int azh.bh>
	// 1075 2009:aload_0         
	// 1076 2010:getfield        #12  <Field azh a>
	// 1077 2013:getfield        #152 <Field int azh.aO>
	// 1078 2016:ixor            
	// 1079 2017:putfield        #152 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1080 2020:aload_0         
	// 1081 2021:getfield        #12  <Field azh a>
	// 1082 2024:astore_1        
		abyte0.aO = ((azh) (abyte0)).o & a.aO;
	// 1083 2025:aload_1         
	// 1084 2026:aload_1         
	// 1085 2027:getfield        #119 <Field int azh.o>
	// 1086 2030:aload_0         
	// 1087 2031:getfield        #12  <Field azh a>
	// 1088 2034:getfield        #152 <Field int azh.aO>
	// 1089 2037:iand            
	// 1090 2038:putfield        #152 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1091 2041:aload_0         
	// 1092 2042:getfield        #12  <Field azh a>
	// 1093 2045:astore_1        
		abyte0.aO = ((azh) (abyte0)).cd ^ a.aO;
	// 1094 2046:aload_1         
	// 1095 2047:aload_1         
	// 1096 2048:getfield        #149 <Field int azh.cd>
	// 1097 2051:aload_0         
	// 1098 2052:getfield        #12  <Field azh a>
	// 1099 2055:getfield        #152 <Field int azh.aO>
	// 1100 2058:ixor            
	// 1101 2059:putfield        #152 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1102 2062:aload_0         
	// 1103 2063:getfield        #12  <Field azh a>
	// 1104 2066:astore_1        
		abyte0.cd = ((azh) (abyte0)).M ^ a.ai;
	// 1105 2067:aload_1         
	// 1106 2068:aload_1         
	// 1107 2069:getfield        #125 <Field int azh.M>
	// 1108 2072:aload_0         
	// 1109 2073:getfield        #12  <Field azh a>
	// 1110 2076:getfield        #113 <Field int azh.ai>
	// 1111 2079:ixor            
	// 1112 2080:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1113 2083:aload_0         
	// 1114 2084:getfield        #12  <Field azh a>
	// 1115 2087:astore_1        
		abyte0.bG = ((azh) (abyte0)).g & ~a.cd;
	// 1116 2088:aload_1         
	// 1117 2089:aload_1         
	// 1118 2090:getfield        #116 <Field int azh.g>
	// 1119 2093:aload_0         
	// 1120 2094:getfield        #12  <Field azh a>
	// 1121 2097:getfield        #149 <Field int azh.cd>
	// 1122 2100:iconst_m1       
	// 1123 2101:ixor            
	// 1124 2102:iand            
	// 1125 2103:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 1126 2106:aload_0         
	// 1127 2107:getfield        #12  <Field azh a>
	// 1128 2110:astore_1        
		abyte0.bG = ((azh) (abyte0)).bh ^ a.bG;
	// 1129 2111:aload_1         
	// 1130 2112:aload_1         
	// 1131 2113:getfield        #122 <Field int azh.bh>
	// 1132 2116:aload_0         
	// 1133 2117:getfield        #12  <Field azh a>
	// 1134 2120:getfield        #155 <Field int azh.bG>
	// 1135 2123:ixor            
	// 1136 2124:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 1137 2127:aload_0         
	// 1138 2128:getfield        #12  <Field azh a>
	// 1139 2131:astore_1        
		abyte0.bI = ((azh) (abyte0)).bG ^ a.bI;
	// 1140 2132:aload_1         
	// 1141 2133:aload_1         
	// 1142 2134:getfield        #155 <Field int azh.bG>
	// 1143 2137:aload_0         
	// 1144 2138:getfield        #12  <Field azh a>
	// 1145 2141:getfield        #65  <Field int azh.bI>
	// 1146 2144:ixor            
	// 1147 2145:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 1148 2148:aload_0         
	// 1149 2149:getfield        #12  <Field azh a>
	// 1150 2152:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd ^ a.g;
	// 1151 2153:aload_1         
	// 1152 2154:aload_1         
	// 1153 2155:getfield        #149 <Field int azh.cd>
	// 1154 2158:aload_0         
	// 1155 2159:getfield        #12  <Field azh a>
	// 1156 2162:getfield        #116 <Field int azh.g>
	// 1157 2165:ixor            
	// 1158 2166:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1159 2169:aload_0         
	// 1160 2170:getfield        #12  <Field azh a>
	// 1161 2173:astore_1        
		abyte0.ao = ((azh) (abyte0)).cd ^ a.ao;
	// 1162 2174:aload_1         
	// 1163 2175:aload_1         
	// 1164 2176:getfield        #149 <Field int azh.cd>
	// 1165 2179:aload_0         
	// 1166 2180:getfield        #12  <Field azh a>
	// 1167 2183:getfield        #146 <Field int azh.ao>
	// 1168 2186:ixor            
	// 1169 2187:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1170 2190:aload_0         
	// 1171 2191:getfield        #12  <Field azh a>
	// 1172 2194:astore_1        
		abyte0.cb = ((azh) (abyte0)).aN ^ a.cb;
	// 1173 2195:aload_1         
	// 1174 2196:aload_1         
	// 1175 2197:getfield        #107 <Field int azh.aN>
	// 1176 2200:aload_0         
	// 1177 2201:getfield        #12  <Field azh a>
	// 1178 2204:getfield        #158 <Field int azh.cb>
	// 1179 2207:ixor            
	// 1180 2208:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1181 2211:aload_0         
	// 1182 2212:getfield        #12  <Field azh a>
	// 1183 2215:astore_1        
		abyte0.cb = ((azh) (abyte0)).V | a.cb;
	// 1184 2216:aload_1         
	// 1185 2217:aload_1         
	// 1186 2218:getfield        #68  <Field int azh.V>
	// 1187 2221:aload_0         
	// 1188 2222:getfield        #12  <Field azh a>
	// 1189 2225:getfield        #158 <Field int azh.cb>
	// 1190 2228:ior             
	// 1191 2229:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1192 2232:aload_0         
	// 1193 2233:getfield        #12  <Field azh a>
	// 1194 2236:astore_1        
		abyte0.cb = ((azh) (abyte0)).bf ^ a.cb;
	// 1195 2237:aload_1         
	// 1196 2238:aload_1         
	// 1197 2239:getfield        #161 <Field int azh.bf>
	// 1198 2242:aload_0         
	// 1199 2243:getfield        #12  <Field azh a>
	// 1200 2246:getfield        #158 <Field int azh.cb>
	// 1201 2249:ixor            
	// 1202 2250:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1203 2253:aload_0         
	// 1204 2254:getfield        #12  <Field azh a>
	// 1205 2257:astore_1        
		abyte0.cb = ((azh) (abyte0)).cb & ~a.F;
	// 1206 2258:aload_1         
	// 1207 2259:aload_1         
	// 1208 2260:getfield        #158 <Field int azh.cb>
	// 1209 2263:aload_0         
	// 1210 2264:getfield        #12  <Field azh a>
	// 1211 2267:getfield        #98  <Field int azh.F>
	// 1212 2270:iconst_m1       
	// 1213 2271:ixor            
	// 1214 2272:iand            
	// 1215 2273:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1216 2276:aload_0         
	// 1217 2277:getfield        #12  <Field azh a>
	// 1218 2280:astore_1        
		abyte0.cb = ((azh) (abyte0)).bP ^ a.cb;
	// 1219 2281:aload_1         
	// 1220 2282:aload_1         
	// 1221 2283:getfield        #62  <Field int azh.bP>
	// 1222 2286:aload_0         
	// 1223 2287:getfield        #12  <Field azh a>
	// 1224 2290:getfield        #158 <Field int azh.cb>
	// 1225 2293:ixor            
	// 1226 2294:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1227 2297:aload_0         
	// 1228 2298:getfield        #12  <Field azh a>
	// 1229 2301:astore_1        
		abyte0.k = ((azh) (abyte0)).cb ^ a.k;
	// 1230 2302:aload_1         
	// 1231 2303:aload_1         
	// 1232 2304:getfield        #158 <Field int azh.cb>
	// 1233 2307:aload_0         
	// 1234 2308:getfield        #12  <Field azh a>
	// 1235 2311:getfield        #164 <Field int azh.k>
	// 1236 2314:ixor            
	// 1237 2315:putfield        #164 <Field int azh.k>
		abyte0 = ((byte []) (a));
	// 1238 2318:aload_0         
	// 1239 2319:getfield        #12  <Field azh a>
	// 1240 2322:astore_1        
		abyte0.bR = ((azh) (abyte0)).ad & ~a.bR;
	// 1241 2323:aload_1         
	// 1242 2324:aload_1         
	// 1243 2325:getfield        #47  <Field int azh.ad>
	// 1244 2328:aload_0         
	// 1245 2329:getfield        #12  <Field azh a>
	// 1246 2332:getfield        #74  <Field int azh.bR>
	// 1247 2335:iconst_m1       
	// 1248 2336:ixor            
	// 1249 2337:iand            
	// 1250 2338:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1251 2341:aload_0         
	// 1252 2342:getfield        #12  <Field azh a>
	// 1253 2345:astore_1        
		abyte0.bR = ((azh) (abyte0)).N | a.bR;
	// 1254 2346:aload_1         
	// 1255 2347:aload_1         
	// 1256 2348:getfield        #50  <Field int azh.N>
	// 1257 2351:aload_0         
	// 1258 2352:getfield        #12  <Field azh a>
	// 1259 2355:getfield        #74  <Field int azh.bR>
	// 1260 2358:ior             
	// 1261 2359:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1262 2362:aload_0         
	// 1263 2363:getfield        #12  <Field azh a>
	// 1264 2366:astore_1        
		abyte0.bR = ((azh) (abyte0)).bY ^ a.bR;
	// 1265 2367:aload_1         
	// 1266 2368:aload_1         
	// 1267 2369:getfield        #167 <Field int azh.bY>
	// 1268 2372:aload_0         
	// 1269 2373:getfield        #12  <Field azh a>
	// 1270 2376:getfield        #74  <Field int azh.bR>
	// 1271 2379:ixor            
	// 1272 2380:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1273 2383:aload_0         
	// 1274 2384:getfield        #12  <Field azh a>
	// 1275 2387:astore_1        
		abyte0.bY = ((azh) (abyte0)).al & ~a.bR;
	// 1276 2388:aload_1         
	// 1277 2389:aload_1         
	// 1278 2390:getfield        #56  <Field int azh.al>
	// 1279 2393:aload_0         
	// 1280 2394:getfield        #12  <Field azh a>
	// 1281 2397:getfield        #74  <Field int azh.bR>
	// 1282 2400:iconst_m1       
	// 1283 2401:ixor            
	// 1284 2402:iand            
	// 1285 2403:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 1286 2406:aload_0         
	// 1287 2407:getfield        #12  <Field azh a>
	// 1288 2410:astore_1        
		abyte0.bY = ((azh) (abyte0)).ce ^ a.bY;
	// 1289 2411:aload_1         
	// 1290 2412:aload_1         
	// 1291 2413:getfield        #29  <Field int azh.ce>
	// 1292 2416:aload_0         
	// 1293 2417:getfield        #12  <Field azh a>
	// 1294 2420:getfield        #167 <Field int azh.bY>
	// 1295 2423:ixor            
	// 1296 2424:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 1297 2427:aload_0         
	// 1298 2428:getfield        #12  <Field azh a>
	// 1299 2431:astore_1        
		abyte0.am = ((azh) (abyte0)).bY ^ a.am;
	// 1300 2432:aload_1         
	// 1301 2433:aload_1         
	// 1302 2434:getfield        #167 <Field int azh.bY>
	// 1303 2437:aload_0         
	// 1304 2438:getfield        #12  <Field azh a>
	// 1305 2441:getfield        #170 <Field int azh.am>
	// 1306 2444:ixor            
	// 1307 2445:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 1308 2448:aload_0         
	// 1309 2449:getfield        #12  <Field azh a>
	// 1310 2452:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR & ~a.al;
	// 1311 2453:aload_1         
	// 1312 2454:aload_1         
	// 1313 2455:getfield        #74  <Field int azh.bR>
	// 1314 2458:aload_0         
	// 1315 2459:getfield        #12  <Field azh a>
	// 1316 2462:getfield        #56  <Field int azh.al>
	// 1317 2465:iconst_m1       
	// 1318 2466:ixor            
	// 1319 2467:iand            
	// 1320 2468:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1321 2471:aload_0         
	// 1322 2472:getfield        #12  <Field azh a>
	// 1323 2475:astore_1        
		abyte0.bR = ((azh) (abyte0)).bF ^ a.bR;
	// 1324 2476:aload_1         
	// 1325 2477:aload_1         
	// 1326 2478:getfield        #89  <Field int azh.bF>
	// 1327 2481:aload_0         
	// 1328 2482:getfield        #12  <Field azh a>
	// 1329 2485:getfield        #74  <Field int azh.bR>
	// 1330 2488:ixor            
	// 1331 2489:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1332 2492:aload_0         
	// 1333 2493:getfield        #12  <Field azh a>
	// 1334 2496:astore_1        
		abyte0.as = ((azh) (abyte0)).bR ^ a.as;
	// 1335 2497:aload_1         
	// 1336 2498:aload_1         
	// 1337 2499:getfield        #74  <Field int azh.bR>
	// 1338 2502:aload_0         
	// 1339 2503:getfield        #12  <Field azh a>
	// 1340 2506:getfield        #92  <Field int azh.as>
	// 1341 2509:ixor            
	// 1342 2510:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1343 2513:aload_0         
	// 1344 2514:getfield        #12  <Field azh a>
	// 1345 2517:astore_1        
		abyte0.as = ((azh) (abyte0)).as & ~a.F;
	// 1346 2518:aload_1         
	// 1347 2519:aload_1         
	// 1348 2520:getfield        #92  <Field int azh.as>
	// 1349 2523:aload_0         
	// 1350 2524:getfield        #12  <Field azh a>
	// 1351 2527:getfield        #98  <Field int azh.F>
	// 1352 2530:iconst_m1       
	// 1353 2531:ixor            
	// 1354 2532:iand            
	// 1355 2533:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1356 2536:aload_0         
	// 1357 2537:getfield        #12  <Field azh a>
	// 1358 2540:astore_1        
		abyte0.as = ((azh) (abyte0)).am ^ a.as;
	// 1359 2541:aload_1         
	// 1360 2542:aload_1         
	// 1361 2543:getfield        #170 <Field int azh.am>
	// 1362 2546:aload_0         
	// 1363 2547:getfield        #12  <Field azh a>
	// 1364 2550:getfield        #92  <Field int azh.as>
	// 1365 2553:ixor            
	// 1366 2554:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1367 2557:aload_0         
	// 1368 2558:getfield        #12  <Field azh a>
	// 1369 2561:astore_1        
		abyte0.i = ((azh) (abyte0)).as ^ a.i;
	// 1370 2562:aload_1         
	// 1371 2563:aload_1         
	// 1372 2564:getfield        #92  <Field int azh.as>
	// 1373 2567:aload_0         
	// 1374 2568:getfield        #12  <Field azh a>
	// 1375 2571:getfield        #173 <Field int azh.i>
	// 1376 2574:ixor            
	// 1377 2575:putfield        #173 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 1378 2578:aload_0         
	// 1379 2579:getfield        #12  <Field azh a>
	// 1380 2582:astore_1        
		abyte0.as = ((azh) (abyte0)).i & ~a.G;
	// 1381 2583:aload_1         
	// 1382 2584:aload_1         
	// 1383 2585:getfield        #173 <Field int azh.i>
	// 1384 2588:aload_0         
	// 1385 2589:getfield        #12  <Field azh a>
	// 1386 2592:getfield        #176 <Field int azh.G>
	// 1387 2595:iconst_m1       
	// 1388 2596:ixor            
	// 1389 2597:iand            
	// 1390 2598:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1391 2601:aload_0         
	// 1392 2602:getfield        #12  <Field azh a>
	// 1393 2605:astore_1        
		abyte0.am = ((azh) (abyte0)).i & a.G;
	// 1394 2606:aload_1         
	// 1395 2607:aload_1         
	// 1396 2608:getfield        #173 <Field int azh.i>
	// 1397 2611:aload_0         
	// 1398 2612:getfield        #12  <Field azh a>
	// 1399 2615:getfield        #176 <Field int azh.G>
	// 1400 2618:iand            
	// 1401 2619:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 1402 2622:aload_0         
	// 1403 2623:getfield        #12  <Field azh a>
	// 1404 2626:astore_1        
		abyte0.bR = ((azh) (abyte0)).am & ~a.y;
	// 1405 2627:aload_1         
	// 1406 2628:aload_1         
	// 1407 2629:getfield        #170 <Field int azh.am>
	// 1408 2632:aload_0         
	// 1409 2633:getfield        #12  <Field azh a>
	// 1410 2636:getfield        #179 <Field int azh.y>
	// 1411 2639:iconst_m1       
	// 1412 2640:ixor            
	// 1413 2641:iand            
	// 1414 2642:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 1415 2645:aload_0         
	// 1416 2646:getfield        #12  <Field azh a>
	// 1417 2649:astore_1        
		abyte0.bF = ((azh) (abyte0)).am & ~a.y;
	// 1418 2650:aload_1         
	// 1419 2651:aload_1         
	// 1420 2652:getfield        #170 <Field int azh.am>
	// 1421 2655:aload_0         
	// 1422 2656:getfield        #12  <Field azh a>
	// 1423 2659:getfield        #179 <Field int azh.y>
	// 1424 2662:iconst_m1       
	// 1425 2663:ixor            
	// 1426 2664:iand            
	// 1427 2665:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 1428 2668:aload_0         
	// 1429 2669:getfield        #12  <Field azh a>
	// 1430 2672:astore_1        
		abyte0.bY = ((azh) (abyte0)).i & a.G;
	// 1431 2673:aload_1         
	// 1432 2674:aload_1         
	// 1433 2675:getfield        #173 <Field int azh.i>
	// 1434 2678:aload_0         
	// 1435 2679:getfield        #12  <Field azh a>
	// 1436 2682:getfield        #176 <Field int azh.G>
	// 1437 2685:iand            
	// 1438 2686:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 1439 2689:aload_0         
	// 1440 2690:getfield        #12  <Field azh a>
	// 1441 2693:astore_1        
		abyte0.ce = ((azh) (abyte0)).i & ~a.G;
	// 1442 2694:aload_1         
	// 1443 2695:aload_1         
	// 1444 2696:getfield        #173 <Field int azh.i>
	// 1445 2699:aload_0         
	// 1446 2700:getfield        #12  <Field azh a>
	// 1447 2703:getfield        #176 <Field int azh.G>
	// 1448 2706:iconst_m1       
	// 1449 2707:ixor            
	// 1450 2708:iand            
	// 1451 2709:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 1452 2712:aload_0         
	// 1453 2713:getfield        #12  <Field azh a>
	// 1454 2716:astore_1        
		abyte0.ce = ((azh) (abyte0)).G ^ a.ce;
	// 1455 2717:aload_1         
	// 1456 2718:aload_1         
	// 1457 2719:getfield        #176 <Field int azh.G>
	// 1458 2722:aload_0         
	// 1459 2723:getfield        #12  <Field azh a>
	// 1460 2726:getfield        #29  <Field int azh.ce>
	// 1461 2729:ixor            
	// 1462 2730:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 1463 2733:aload_0         
	// 1464 2734:getfield        #12  <Field azh a>
	// 1465 2737:astore_1        
		abyte0.cb = ((azh) (abyte0)).i & a.G;
	// 1466 2738:aload_1         
	// 1467 2739:aload_1         
	// 1468 2740:getfield        #173 <Field int azh.i>
	// 1469 2743:aload_0         
	// 1470 2744:getfield        #12  <Field azh a>
	// 1471 2747:getfield        #176 <Field int azh.G>
	// 1472 2750:iand            
	// 1473 2751:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1474 2754:aload_0         
	// 1475 2755:getfield        #12  <Field azh a>
	// 1476 2758:astore_1        
		abyte0.bP = ((azh) (abyte0)).i & ~a.G;
	// 1477 2759:aload_1         
	// 1478 2760:aload_1         
	// 1479 2761:getfield        #173 <Field int azh.i>
	// 1480 2764:aload_0         
	// 1481 2765:getfield        #12  <Field azh a>
	// 1482 2768:getfield        #176 <Field int azh.G>
	// 1483 2771:iconst_m1       
	// 1484 2772:ixor            
	// 1485 2773:iand            
	// 1486 2774:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 1487 2777:aload_0         
	// 1488 2778:getfield        #12  <Field azh a>
	// 1489 2781:astore_1        
		abyte0.bf = ((azh) (abyte0)).j & ~a.b;
	// 1490 2782:aload_1         
	// 1491 2783:aload_1         
	// 1492 2784:getfield        #182 <Field int azh.j>
	// 1493 2787:aload_0         
	// 1494 2788:getfield        #12  <Field azh a>
	// 1495 2791:getfield        #44  <Field int azh.b>
	// 1496 2794:iconst_m1       
	// 1497 2795:ixor            
	// 1498 2796:iand            
	// 1499 2797:putfield        #161 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 1500 2800:aload_0         
	// 1501 2801:getfield        #12  <Field azh a>
	// 1502 2804:astore_1        
		abyte0.bw = ((azh) (abyte0)).bf ^ a.bw;
	// 1503 2805:aload_1         
	// 1504 2806:aload_1         
	// 1505 2807:getfield        #161 <Field int azh.bf>
	// 1506 2810:aload_0         
	// 1507 2811:getfield        #12  <Field azh a>
	// 1508 2814:getfield        #185 <Field int azh.bw>
	// 1509 2817:ixor            
	// 1510 2818:putfield        #185 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1511 2821:aload_0         
	// 1512 2822:getfield        #12  <Field azh a>
	// 1513 2825:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & ~a.al;
	// 1514 2826:aload_1         
	// 1515 2827:aload_1         
	// 1516 2828:getfield        #185 <Field int azh.bw>
	// 1517 2831:aload_0         
	// 1518 2832:getfield        #12  <Field azh a>
	// 1519 2835:getfield        #56  <Field int azh.al>
	// 1520 2838:iconst_m1       
	// 1521 2839:ixor            
	// 1522 2840:iand            
	// 1523 2841:putfield        #185 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1524 2844:aload_0         
	// 1525 2845:getfield        #12  <Field azh a>
	// 1526 2848:astore_1        
		abyte0.bw = ((azh) (abyte0)).br ^ a.bw;
	// 1527 2849:aload_1         
	// 1528 2850:aload_1         
	// 1529 2851:getfield        #38  <Field int azh.br>
	// 1530 2854:aload_0         
	// 1531 2855:getfield        #12  <Field azh a>
	// 1532 2858:getfield        #185 <Field int azh.bw>
	// 1533 2861:ixor            
	// 1534 2862:putfield        #185 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1535 2865:aload_0         
	// 1536 2866:getfield        #12  <Field azh a>
	// 1537 2869:astore_1        
		abyte0.bV = ((azh) (abyte0)).bw ^ a.bV;
	// 1538 2870:aload_1         
	// 1539 2871:aload_1         
	// 1540 2872:getfield        #185 <Field int azh.bw>
	// 1541 2875:aload_0         
	// 1542 2876:getfield        #12  <Field azh a>
	// 1543 2879:getfield        #188 <Field int azh.bV>
	// 1544 2882:ixor            
	// 1545 2883:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1546 2886:aload_0         
	// 1547 2887:getfield        #12  <Field azh a>
	// 1548 2890:astore_1        
		abyte0.E = ((azh) (abyte0)).bV ^ a.E;
	// 1549 2891:aload_1         
	// 1550 2892:aload_1         
	// 1551 2893:getfield        #188 <Field int azh.bV>
	// 1552 2896:aload_0         
	// 1553 2897:getfield        #12  <Field azh a>
	// 1554 2900:getfield        #191 <Field int azh.E>
	// 1555 2903:ixor            
	// 1556 2904:putfield        #191 <Field int azh.E>
		abyte0 = ((byte []) (a));
	// 1557 2907:aload_0         
	// 1558 2908:getfield        #12  <Field azh a>
	// 1559 2911:astore_1        
		abyte0.aL = ((azh) (abyte0)).E | a.aL;
	// 1560 2912:aload_1         
	// 1561 2913:aload_1         
	// 1562 2914:getfield        #191 <Field int azh.E>
	// 1563 2917:aload_0         
	// 1564 2918:getfield        #12  <Field azh a>
	// 1565 2921:getfield        #110 <Field int azh.aL>
	// 1566 2924:ior             
	// 1567 2925:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 1568 2928:aload_0         
	// 1569 2929:getfield        #12  <Field azh a>
	// 1570 2932:astore_1        
		abyte0.aL = ((azh) (abyte0)).bq ^ a.aL;
	// 1571 2933:aload_1         
	// 1572 2934:aload_1         
	// 1573 2935:getfield        #26  <Field int azh.bq>
	// 1574 2938:aload_0         
	// 1575 2939:getfield        #12  <Field azh a>
	// 1576 2942:getfield        #110 <Field int azh.aL>
	// 1577 2945:ixor            
	// 1578 2946:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 1579 2949:aload_0         
	// 1580 2950:getfield        #12  <Field azh a>
	// 1581 2953:astore_1        
		abyte0.bC = ((azh) (abyte0)).E | a.bC;
	// 1582 2954:aload_1         
	// 1583 2955:aload_1         
	// 1584 2956:getfield        #191 <Field int azh.E>
	// 1585 2959:aload_0         
	// 1586 2960:getfield        #12  <Field azh a>
	// 1587 2963:getfield        #134 <Field int azh.bC>
	// 1588 2966:ior             
	// 1589 2967:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 1590 2970:aload_0         
	// 1591 2971:getfield        #12  <Field azh a>
	// 1592 2974:astore_1        
		abyte0.bC = ((azh) (abyte0)).be ^ a.bC;
	// 1593 2975:aload_1         
	// 1594 2976:aload_1         
	// 1595 2977:getfield        #140 <Field int azh.be>
	// 1596 2980:aload_0         
	// 1597 2981:getfield        #12  <Field azh a>
	// 1598 2984:getfield        #134 <Field int azh.bC>
	// 1599 2987:ixor            
	// 1600 2988:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 1601 2991:aload_0         
	// 1602 2992:getfield        #12  <Field azh a>
	// 1603 2995:astore_1        
		abyte0.bZ = ((azh) (abyte0)).E | a.bZ;
	// 1604 2996:aload_1         
	// 1605 2997:aload_1         
	// 1606 2998:getfield        #191 <Field int azh.E>
	// 1607 3001:aload_0         
	// 1608 3002:getfield        #12  <Field azh a>
	// 1609 3005:getfield        #59  <Field int azh.bZ>
	// 1610 3008:ior             
	// 1611 3009:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1612 3012:aload_0         
	// 1613 3013:getfield        #12  <Field azh a>
	// 1614 3016:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aT ^ a.bZ;
	// 1615 3017:aload_1         
	// 1616 3018:aload_1         
	// 1617 3019:getfield        #137 <Field int azh.aT>
	// 1618 3022:aload_0         
	// 1619 3023:getfield        #12  <Field azh a>
	// 1620 3026:getfield        #59  <Field int azh.bZ>
	// 1621 3029:ixor            
	// 1622 3030:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1623 3033:aload_0         
	// 1624 3034:getfield        #12  <Field azh a>
	// 1625 3037:astore_1        
		abyte0.bN = ((azh) (abyte0)).E ^ a.bN;
	// 1626 3038:aload_1         
	// 1627 3039:aload_1         
	// 1628 3040:getfield        #191 <Field int azh.E>
	// 1629 3043:aload_0         
	// 1630 3044:getfield        #12  <Field azh a>
	// 1631 3047:getfield        #194 <Field int azh.bN>
	// 1632 3050:ixor            
	// 1633 3051:putfield        #194 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 1634 3054:aload_0         
	// 1635 3055:getfield        #12  <Field azh a>
	// 1636 3058:astore_1        
		abyte0.aT = ((azh) (abyte0)).a | a.E;
	// 1637 3059:aload_1         
	// 1638 3060:aload_1         
	// 1639 3061:getfield        #196 <Field int azh.a>
	// 1640 3064:aload_0         
	// 1641 3065:getfield        #12  <Field azh a>
	// 1642 3068:getfield        #191 <Field int azh.E>
	// 1643 3071:ior             
	// 1644 3072:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 1645 3075:aload_0         
	// 1646 3076:getfield        #12  <Field azh a>
	// 1647 3079:astore_1        
		abyte0.be = ((azh) (abyte0)).aT & ~a.E;
	// 1648 3080:aload_1         
	// 1649 3081:aload_1         
	// 1650 3082:getfield        #137 <Field int azh.aT>
	// 1651 3085:aload_0         
	// 1652 3086:getfield        #12  <Field azh a>
	// 1653 3089:getfield        #191 <Field int azh.E>
	// 1654 3092:iconst_m1       
	// 1655 3093:ixor            
	// 1656 3094:iand            
	// 1657 3095:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1658 3098:aload_0         
	// 1659 3099:getfield        #12  <Field azh a>
	// 1660 3102:astore_1        
		abyte0.bq = ((azh) (abyte0)).ac & ~a.be;
	// 1661 3103:aload_1         
	// 1662 3104:aload_1         
	// 1663 3105:getfield        #199 <Field int azh.ac>
	// 1664 3108:aload_0         
	// 1665 3109:getfield        #12  <Field azh a>
	// 1666 3112:getfield        #140 <Field int azh.be>
	// 1667 3115:iconst_m1       
	// 1668 3116:ixor            
	// 1669 3117:iand            
	// 1670 3118:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 1671 3121:aload_0         
	// 1672 3122:getfield        #12  <Field azh a>
	// 1673 3125:astore_1        
		abyte0.bq = ((azh) (abyte0)).a ^ a.bq;
	// 1674 3126:aload_1         
	// 1675 3127:aload_1         
	// 1676 3128:getfield        #196 <Field int azh.a>
	// 1677 3131:aload_0         
	// 1678 3132:getfield        #12  <Field azh a>
	// 1679 3135:getfield        #26  <Field int azh.bq>
	// 1680 3138:ixor            
	// 1681 3139:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 1682 3142:aload_0         
	// 1683 3143:getfield        #12  <Field azh a>
	// 1684 3146:astore_1        
		abyte0.bV = ((azh) (abyte0)).ac & ~a.aT;
	// 1685 3147:aload_1         
	// 1686 3148:aload_1         
	// 1687 3149:getfield        #199 <Field int azh.ac>
	// 1688 3152:aload_0         
	// 1689 3153:getfield        #12  <Field azh a>
	// 1690 3156:getfield        #137 <Field int azh.aT>
	// 1691 3159:iconst_m1       
	// 1692 3160:ixor            
	// 1693 3161:iand            
	// 1694 3162:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1695 3165:aload_0         
	// 1696 3166:getfield        #12  <Field azh a>
	// 1697 3169:astore_1        
		abyte0.bV = ((azh) (abyte0)).aT ^ a.bV;
	// 1698 3170:aload_1         
	// 1699 3171:aload_1         
	// 1700 3172:getfield        #137 <Field int azh.aT>
	// 1701 3175:aload_0         
	// 1702 3176:getfield        #12  <Field azh a>
	// 1703 3179:getfield        #188 <Field int azh.bV>
	// 1704 3182:ixor            
	// 1705 3183:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1706 3186:aload_0         
	// 1707 3187:getfield        #12  <Field azh a>
	// 1708 3190:astore_1        
		abyte0.bw = ((azh) (abyte0)).ac & ~a.aT;
	// 1709 3191:aload_1         
	// 1710 3192:aload_1         
	// 1711 3193:getfield        #199 <Field int azh.ac>
	// 1712 3196:aload_0         
	// 1713 3197:getfield        #12  <Field azh a>
	// 1714 3200:getfield        #137 <Field int azh.aT>
	// 1715 3203:iconst_m1       
	// 1716 3204:ixor            
	// 1717 3205:iand            
	// 1718 3206:putfield        #185 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1719 3209:aload_0         
	// 1720 3210:getfield        #12  <Field azh a>
	// 1721 3213:astore_1        
		abyte0.br = ((azh) (abyte0)).a & a.E;
	// 1722 3214:aload_1         
	// 1723 3215:aload_1         
	// 1724 3216:getfield        #196 <Field int azh.a>
	// 1725 3219:aload_0         
	// 1726 3220:getfield        #12  <Field azh a>
	// 1727 3223:getfield        #191 <Field int azh.E>
	// 1728 3226:iand            
	// 1729 3227:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 1730 3230:aload_0         
	// 1731 3231:getfield        #12  <Field azh a>
	// 1732 3234:astore_1        
		abyte0.aN = ((azh) (abyte0)).ac & a.br;
	// 1733 3235:aload_1         
	// 1734 3236:aload_1         
	// 1735 3237:getfield        #199 <Field int azh.ac>
	// 1736 3240:aload_0         
	// 1737 3241:getfield        #12  <Field azh a>
	// 1738 3244:getfield        #38  <Field int azh.br>
	// 1739 3247:iand            
	// 1740 3248:putfield        #107 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1741 3251:aload_0         
	// 1742 3252:getfield        #12  <Field azh a>
	// 1743 3255:astore_1        
		abyte0.aN = ((azh) (abyte0)).a ^ a.aN;
	// 1744 3256:aload_1         
	// 1745 3257:aload_1         
	// 1746 3258:getfield        #196 <Field int azh.a>
	// 1747 3261:aload_0         
	// 1748 3262:getfield        #12  <Field azh a>
	// 1749 3265:getfield        #107 <Field int azh.aN>
	// 1750 3268:ixor            
	// 1751 3269:putfield        #107 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 1752 3272:aload_0         
	// 1753 3273:getfield        #12  <Field azh a>
	// 1754 3276:astore_1        
		abyte0.cd = ((azh) (abyte0)).ac & a.br;
	// 1755 3277:aload_1         
	// 1756 3278:aload_1         
	// 1757 3279:getfield        #199 <Field int azh.ac>
	// 1758 3282:aload_0         
	// 1759 3283:getfield        #12  <Field azh a>
	// 1760 3286:getfield        #38  <Field int azh.br>
	// 1761 3289:iand            
	// 1762 3290:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1763 3293:aload_0         
	// 1764 3294:getfield        #12  <Field azh a>
	// 1765 3297:astore_1        
		abyte0.bG = ((azh) (abyte0)).ac & a.br;
	// 1766 3298:aload_1         
	// 1767 3299:aload_1         
	// 1768 3300:getfield        #199 <Field int azh.ac>
	// 1769 3303:aload_0         
	// 1770 3304:getfield        #12  <Field azh a>
	// 1771 3307:getfield        #38  <Field int azh.br>
	// 1772 3310:iand            
	// 1773 3311:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 1774 3314:aload_0         
	// 1775 3315:getfield        #12  <Field azh a>
	// 1776 3318:astore_1        
		abyte0.bG = ((azh) (abyte0)).E ^ a.bG;
	// 1777 3319:aload_1         
	// 1778 3320:aload_1         
	// 1779 3321:getfield        #191 <Field int azh.E>
	// 1780 3324:aload_0         
	// 1781 3325:getfield        #12  <Field azh a>
	// 1782 3328:getfield        #155 <Field int azh.bG>
	// 1783 3331:ixor            
	// 1784 3332:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 1785 3335:aload_0         
	// 1786 3336:getfield        #12  <Field azh a>
	// 1787 3339:astore_1        
		abyte0.aD = ((azh) (abyte0)).a & ~a.E;
	// 1788 3340:aload_1         
	// 1789 3341:aload_1         
	// 1790 3342:getfield        #196 <Field int azh.a>
	// 1791 3345:aload_0         
	// 1792 3346:getfield        #12  <Field azh a>
	// 1793 3349:getfield        #191 <Field int azh.E>
	// 1794 3352:iconst_m1       
	// 1795 3353:ixor            
	// 1796 3354:iand            
	// 1797 3355:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 1798 3358:aload_0         
	// 1799 3359:getfield        #12  <Field azh a>
	// 1800 3362:astore_1        
		abyte0.bw = ((azh) (abyte0)).aD ^ a.bw;
	// 1801 3363:aload_1         
	// 1802 3364:aload_1         
	// 1803 3365:getfield        #202 <Field int azh.aD>
	// 1804 3368:aload_0         
	// 1805 3369:getfield        #12  <Field azh a>
	// 1806 3372:getfield        #185 <Field int azh.bw>
	// 1807 3375:ixor            
	// 1808 3376:putfield        #185 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1809 3379:aload_0         
	// 1810 3380:getfield        #12  <Field azh a>
	// 1811 3383:astore_1        
		abyte0.bp = ((azh) (abyte0)).ac & a.aD;
	// 1812 3384:aload_1         
	// 1813 3385:aload_1         
	// 1814 3386:getfield        #199 <Field int azh.ac>
	// 1815 3389:aload_0         
	// 1816 3390:getfield        #12  <Field azh a>
	// 1817 3393:getfield        #202 <Field int azh.aD>
	// 1818 3396:iand            
	// 1819 3397:putfield        #205 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1820 3400:aload_0         
	// 1821 3401:getfield        #12  <Field azh a>
	// 1822 3404:astore_1        
		abyte0.az = ((azh) (abyte0)).aD ^ a.ac;
	// 1823 3405:aload_1         
	// 1824 3406:aload_1         
	// 1825 3407:getfield        #202 <Field int azh.aD>
	// 1826 3410:aload_0         
	// 1827 3411:getfield        #12  <Field azh a>
	// 1828 3414:getfield        #199 <Field int azh.ac>
	// 1829 3417:ixor            
	// 1830 3418:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 1831 3421:aload_0         
	// 1832 3422:getfield        #12  <Field azh a>
	// 1833 3425:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ac & a.aD;
	// 1834 3426:aload_1         
	// 1835 3427:aload_1         
	// 1836 3428:getfield        #199 <Field int azh.ac>
	// 1837 3431:aload_0         
	// 1838 3432:getfield        #12  <Field azh a>
	// 1839 3435:getfield        #202 <Field int azh.aD>
	// 1840 3438:iand            
	// 1841 3439:putfield        #211 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 1842 3442:aload_0         
	// 1843 3443:getfield        #12  <Field azh a>
	// 1844 3446:astore_1        
		abyte0.aJ = ((azh) (abyte0)).E ^ a.aJ;
	// 1845 3447:aload_1         
	// 1846 3448:aload_1         
	// 1847 3449:getfield        #191 <Field int azh.E>
	// 1848 3452:aload_0         
	// 1849 3453:getfield        #12  <Field azh a>
	// 1850 3456:getfield        #211 <Field int azh.aJ>
	// 1851 3459:ixor            
	// 1852 3460:putfield        #211 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 1853 3463:aload_0         
	// 1854 3464:getfield        #12  <Field azh a>
	// 1855 3467:astore_1        
		abyte0.aS = ((azh) (abyte0)).ac & a.aD;
	// 1856 3468:aload_1         
	// 1857 3469:aload_1         
	// 1858 3470:getfield        #199 <Field int azh.ac>
	// 1859 3473:aload_0         
	// 1860 3474:getfield        #12  <Field azh a>
	// 1861 3477:getfield        #202 <Field int azh.aD>
	// 1862 3480:iand            
	// 1863 3481:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 1864 3484:aload_0         
	// 1865 3485:getfield        #12  <Field azh a>
	// 1866 3488:astore_1        
		abyte0.ch = ((azh) (abyte0)).ac & a.aD;
	// 1867 3489:aload_1         
	// 1868 3490:aload_1         
	// 1869 3491:getfield        #199 <Field int azh.ac>
	// 1870 3494:aload_0         
	// 1871 3495:getfield        #12  <Field azh a>
	// 1872 3498:getfield        #202 <Field int azh.aD>
	// 1873 3501:iand            
	// 1874 3502:putfield        #217 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 1875 3505:aload_0         
	// 1876 3506:getfield        #12  <Field azh a>
	// 1877 3509:astore_1        
		abyte0.ch = ((azh) (abyte0)).br ^ a.ch;
	// 1878 3510:aload_1         
	// 1879 3511:aload_1         
	// 1880 3512:getfield        #38  <Field int azh.br>
	// 1881 3515:aload_0         
	// 1882 3516:getfield        #12  <Field azh a>
	// 1883 3519:getfield        #217 <Field int azh.ch>
	// 1884 3522:ixor            
	// 1885 3523:putfield        #217 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 1886 3526:aload_0         
	// 1887 3527:getfield        #12  <Field azh a>
	// 1888 3530:astore_1        
		abyte0.aD = ((azh) (abyte0)).ac & a.aD;
	// 1889 3531:aload_1         
	// 1890 3532:aload_1         
	// 1891 3533:getfield        #199 <Field int azh.ac>
	// 1892 3536:aload_0         
	// 1893 3537:getfield        #12  <Field azh a>
	// 1894 3540:getfield        #202 <Field int azh.aD>
	// 1895 3543:iand            
	// 1896 3544:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 1897 3547:aload_0         
	// 1898 3548:getfield        #12  <Field azh a>
	// 1899 3551:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh & ~a.E;
	// 1900 3552:aload_1         
	// 1901 3553:aload_1         
	// 1902 3554:getfield        #122 <Field int azh.bh>
	// 1903 3557:aload_0         
	// 1904 3558:getfield        #12  <Field azh a>
	// 1905 3561:getfield        #191 <Field int azh.E>
	// 1906 3564:iconst_m1       
	// 1907 3565:ixor            
	// 1908 3566:iand            
	// 1909 3567:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 1910 3570:aload_0         
	// 1911 3571:getfield        #12  <Field azh a>
	// 1912 3574:astore_1        
		abyte0.bh = ((azh) (abyte0)).bc ^ a.bh;
	// 1913 3575:aload_1         
	// 1914 3576:aload_1         
	// 1915 3577:getfield        #131 <Field int azh.bc>
	// 1916 3580:aload_0         
	// 1917 3581:getfield        #12  <Field azh a>
	// 1918 3584:getfield        #122 <Field int azh.bh>
	// 1919 3587:ixor            
	// 1920 3588:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 1921 3591:aload_0         
	// 1922 3592:getfield        #12  <Field azh a>
	// 1923 3595:astore_1        
		abyte0.bc = ((azh) (abyte0)).ac & a.E;
	// 1924 3596:aload_1         
	// 1925 3597:aload_1         
	// 1926 3598:getfield        #199 <Field int azh.ac>
	// 1927 3601:aload_0         
	// 1928 3602:getfield        #12  <Field azh a>
	// 1929 3605:getfield        #191 <Field int azh.E>
	// 1930 3608:iand            
	// 1931 3609:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 1932 3612:aload_0         
	// 1933 3613:getfield        #12  <Field azh a>
	// 1934 3616:astore_1        
		abyte0.bc = ((azh) (abyte0)).br ^ a.bc;
	// 1935 3617:aload_1         
	// 1936 3618:aload_1         
	// 1937 3619:getfield        #38  <Field int azh.br>
	// 1938 3622:aload_0         
	// 1939 3623:getfield        #12  <Field azh a>
	// 1940 3626:getfield        #131 <Field int azh.bc>
	// 1941 3629:ixor            
	// 1942 3630:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 1943 3633:aload_0         
	// 1944 3634:getfield        #12  <Field azh a>
	// 1945 3637:astore_1        
		abyte0.ci = ((azh) (abyte0)).E & ~a.a;
	// 1946 3638:aload_1         
	// 1947 3639:aload_1         
	// 1948 3640:getfield        #191 <Field int azh.E>
	// 1949 3643:aload_0         
	// 1950 3644:getfield        #12  <Field azh a>
	// 1951 3647:getfield        #196 <Field int azh.a>
	// 1952 3650:iconst_m1       
	// 1953 3651:ixor            
	// 1954 3652:iand            
	// 1955 3653:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1956 3656:aload_0         
	// 1957 3657:getfield        #12  <Field azh a>
	// 1958 3660:astore_1        
		abyte0.bp = ((azh) (abyte0)).ci ^ a.bp;
	// 1959 3661:aload_1         
	// 1960 3662:aload_1         
	// 1961 3663:getfield        #220 <Field int azh.ci>
	// 1962 3666:aload_0         
	// 1963 3667:getfield        #12  <Field azh a>
	// 1964 3670:getfield        #205 <Field int azh.bp>
	// 1965 3673:ixor            
	// 1966 3674:putfield        #205 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1967 3677:aload_0         
	// 1968 3678:getfield        #12  <Field azh a>
	// 1969 3681:astore_1        
		abyte0.ci = ((azh) (abyte0)).ac & a.ci;
	// 1970 3682:aload_1         
	// 1971 3683:aload_1         
	// 1972 3684:getfield        #199 <Field int azh.ac>
	// 1973 3687:aload_0         
	// 1974 3688:getfield        #12  <Field azh a>
	// 1975 3691:getfield        #220 <Field int azh.ci>
	// 1976 3694:iand            
	// 1977 3695:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1978 3698:aload_0         
	// 1979 3699:getfield        #12  <Field azh a>
	// 1980 3702:astore_1        
		abyte0.bI = ((azh) (abyte0)).E | a.bI;
	// 1981 3703:aload_1         
	// 1982 3704:aload_1         
	// 1983 3705:getfield        #191 <Field int azh.E>
	// 1984 3708:aload_0         
	// 1985 3709:getfield        #12  <Field azh a>
	// 1986 3712:getfield        #65  <Field int azh.bI>
	// 1987 3715:ior             
	// 1988 3716:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 1989 3719:aload_0         
	// 1990 3720:getfield        #12  <Field azh a>
	// 1991 3723:astore_1        
		abyte0.bI = ((azh) (abyte0)).bL ^ a.bI;
	// 1992 3724:aload_1         
	// 1993 3725:aload_1         
	// 1994 3726:getfield        #86  <Field int azh.bL>
	// 1995 3729:aload_0         
	// 1996 3730:getfield        #12  <Field azh a>
	// 1997 3733:getfield        #65  <Field int azh.bI>
	// 1998 3736:ixor            
	// 1999 3737:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2000 3740:aload_0         
	// 2001 3741:getfield        #12  <Field azh a>
	// 2002 3744:astore_1        
		abyte0.bL = ((azh) (abyte0)).ac & a.E;
	// 2003 3745:aload_1         
	// 2004 3746:aload_1         
	// 2005 3747:getfield        #199 <Field int azh.ac>
	// 2006 3750:aload_0         
	// 2007 3751:getfield        #12  <Field azh a>
	// 2008 3754:getfield        #191 <Field int azh.E>
	// 2009 3757:iand            
	// 2010 3758:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2011 3761:aload_0         
	// 2012 3762:getfield        #12  <Field azh a>
	// 2013 3765:astore_1        
		abyte0.bL = ((azh) (abyte0)).a ^ a.bL;
	// 2014 3766:aload_1         
	// 2015 3767:aload_1         
	// 2016 3768:getfield        #196 <Field int azh.a>
	// 2017 3771:aload_0         
	// 2018 3772:getfield        #12  <Field azh a>
	// 2019 3775:getfield        #86  <Field int azh.bL>
	// 2020 3778:ixor            
	// 2021 3779:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2022 3782:aload_0         
	// 2023 3783:getfield        #12  <Field azh a>
	// 2024 3786:astore_1        
		abyte0.cf = ((azh) (abyte0)).cf & ~a.E;
	// 2025 3787:aload_1         
	// 2026 3788:aload_1         
	// 2027 3789:getfield        #128 <Field int azh.cf>
	// 2028 3792:aload_0         
	// 2029 3793:getfield        #12  <Field azh a>
	// 2030 3796:getfield        #191 <Field int azh.E>
	// 2031 3799:iconst_m1       
	// 2032 3800:ixor            
	// 2033 3801:iand            
	// 2034 3802:putfield        #128 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 2035 3805:aload_0         
	// 2036 3806:getfield        #12  <Field azh a>
	// 2037 3809:astore_1        
		abyte0.cf = ((azh) (abyte0)).aO ^ a.cf;
	// 2038 3810:aload_1         
	// 2039 3811:aload_1         
	// 2040 3812:getfield        #152 <Field int azh.aO>
	// 2041 3815:aload_0         
	// 2042 3816:getfield        #12  <Field azh a>
	// 2043 3819:getfield        #128 <Field int azh.cf>
	// 2044 3822:ixor            
	// 2045 3823:putfield        #128 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 2046 3826:aload_0         
	// 2047 3827:getfield        #12  <Field azh a>
	// 2048 3830:astore_1        
		abyte0.bg = ((azh) (abyte0)).bg & ~a.E;
	// 2049 3831:aload_1         
	// 2050 3832:aload_1         
	// 2051 3833:getfield        #143 <Field int azh.bg>
	// 2052 3836:aload_0         
	// 2053 3837:getfield        #12  <Field azh a>
	// 2054 3840:getfield        #191 <Field int azh.E>
	// 2055 3843:iconst_m1       
	// 2056 3844:ixor            
	// 2057 3845:iand            
	// 2058 3846:putfield        #143 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 2059 3849:aload_0         
	// 2060 3850:getfield        #12  <Field azh a>
	// 2061 3853:astore_1        
		abyte0.bg = ((azh) (abyte0)).ao ^ a.bg;
	// 2062 3854:aload_1         
	// 2063 3855:aload_1         
	// 2064 3856:getfield        #146 <Field int azh.ao>
	// 2065 3859:aload_0         
	// 2066 3860:getfield        #12  <Field azh a>
	// 2067 3863:getfield        #143 <Field int azh.bg>
	// 2068 3866:ixor            
	// 2069 3867:putfield        #143 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 2070 3870:aload_0         
	// 2071 3871:getfield        #12  <Field azh a>
	// 2072 3874:astore_1        
		abyte0.ao = ((azh) (abyte0)).a ^ a.E;
	// 2073 3875:aload_1         
	// 2074 3876:aload_1         
	// 2075 3877:getfield        #196 <Field int azh.a>
	// 2076 3880:aload_0         
	// 2077 3881:getfield        #12  <Field azh a>
	// 2078 3884:getfield        #191 <Field int azh.E>
	// 2079 3887:ixor            
	// 2080 3888:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2081 3891:aload_0         
	// 2082 3892:getfield        #12  <Field azh a>
	// 2083 3895:astore_1        
		abyte0.aO = ((azh) (abyte0)).ac & ~a.ao;
	// 2084 3896:aload_1         
	// 2085 3897:aload_1         
	// 2086 3898:getfield        #199 <Field int azh.ac>
	// 2087 3901:aload_0         
	// 2088 3902:getfield        #12  <Field azh a>
	// 2089 3905:getfield        #146 <Field int azh.ao>
	// 2090 3908:iconst_m1       
	// 2091 3909:ixor            
	// 2092 3910:iand            
	// 2093 3911:putfield        #152 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2094 3914:aload_0         
	// 2095 3915:getfield        #12  <Field azh a>
	// 2096 3918:astore_1        
		abyte0.ci = ((azh) (abyte0)).ao ^ a.ci;
	// 2097 3919:aload_1         
	// 2098 3920:aload_1         
	// 2099 3921:getfield        #146 <Field int azh.ao>
	// 2100 3924:aload_0         
	// 2101 3925:getfield        #12  <Field azh a>
	// 2102 3928:getfield        #220 <Field int azh.ci>
	// 2103 3931:ixor            
	// 2104 3932:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2105 3935:aload_0         
	// 2106 3936:getfield        #12  <Field azh a>
	// 2107 3939:astore_1        
		abyte0.aS = ((azh) (abyte0)).ao ^ a.aS;
	// 2108 3940:aload_1         
	// 2109 3941:aload_1         
	// 2110 3942:getfield        #146 <Field int azh.ao>
	// 2111 3945:aload_0         
	// 2112 3946:getfield        #12  <Field azh a>
	// 2113 3949:getfield        #214 <Field int azh.aS>
	// 2114 3952:ixor            
	// 2115 3953:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2116 3956:aload_0         
	// 2117 3957:getfield        #12  <Field azh a>
	// 2118 3960:astore_1        
		abyte0.ao = ((azh) (abyte0)).ac & ~a.ao;
	// 2119 3961:aload_1         
	// 2120 3962:aload_1         
	// 2121 3963:getfield        #199 <Field int azh.ac>
	// 2122 3966:aload_0         
	// 2123 3967:getfield        #12  <Field azh a>
	// 2124 3970:getfield        #146 <Field int azh.ao>
	// 2125 3973:iconst_m1       
	// 2126 3974:ixor            
	// 2127 3975:iand            
	// 2128 3976:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2129 3979:aload_0         
	// 2130 3980:getfield        #12  <Field azh a>
	// 2131 3983:astore_1        
		abyte0.ao = ((azh) (abyte0)).a ^ a.ao;
	// 2132 3984:aload_1         
	// 2133 3985:aload_1         
	// 2134 3986:getfield        #196 <Field int azh.a>
	// 2135 3989:aload_0         
	// 2136 3990:getfield        #12  <Field azh a>
	// 2137 3993:getfield        #146 <Field int azh.ao>
	// 2138 3996:ixor            
	// 2139 3997:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2140 4000:aload_0         
	// 2141 4001:getfield        #12  <Field azh a>
	// 2142 4004:astore_1        
		abyte0.bU = ((azh) (abyte0)).bU & ~a.E;
	// 2143 4005:aload_1         
	// 2144 4006:aload_1         
	// 2145 4007:getfield        #41  <Field int azh.bU>
	// 2146 4010:aload_0         
	// 2147 4011:getfield        #12  <Field azh a>
	// 2148 4014:getfield        #191 <Field int azh.E>
	// 2149 4017:iconst_m1       
	// 2150 4018:ixor            
	// 2151 4019:iand            
	// 2152 4020:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2153 4023:aload_0         
	// 2154 4024:getfield        #12  <Field azh a>
	// 2155 4027:astore_1        
		abyte0.bU = ((azh) (abyte0)).aF ^ a.bU;
	// 2156 4028:aload_1         
	// 2157 4029:aload_1         
	// 2158 4030:getfield        #223 <Field int azh.aF>
	// 2159 4033:aload_0         
	// 2160 4034:getfield        #12  <Field azh a>
	// 2161 4037:getfield        #41  <Field int azh.bU>
	// 2162 4040:ixor            
	// 2163 4041:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2164 4044:aload_0         
	// 2165 4045:getfield        #12  <Field azh a>
	// 2166 4048:astore_1        
		abyte0.ap = ((azh) (abyte0)).bf ^ a.ap;
	// 2167 4049:aload_1         
	// 2168 4050:aload_1         
	// 2169 4051:getfield        #161 <Field int azh.bf>
	// 2170 4054:aload_0         
	// 2171 4055:getfield        #12  <Field azh a>
	// 2172 4058:getfield        #226 <Field int azh.ap>
	// 2173 4061:ixor            
	// 2174 4062:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2175 4065:aload_0         
	// 2176 4066:getfield        #12  <Field azh a>
	// 2177 4069:astore_1        
		abyte0.bs = ((azh) (abyte0)).ap ^ a.bs;
	// 2178 4070:aload_1         
	// 2179 4071:aload_1         
	// 2180 4072:getfield        #226 <Field int azh.ap>
	// 2181 4075:aload_0         
	// 2182 4076:getfield        #12  <Field azh a>
	// 2183 4079:getfield        #229 <Field int azh.bs>
	// 2184 4082:ixor            
	// 2185 4083:putfield        #229 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2186 4086:aload_0         
	// 2187 4087:getfield        #12  <Field azh a>
	// 2188 4090:astore_1        
		abyte0.aR = ((azh) (abyte0)).bs ^ a.aR;
	// 2189 4091:aload_1         
	// 2190 4092:aload_1         
	// 2191 4093:getfield        #229 <Field int azh.bs>
	// 2192 4096:aload_0         
	// 2193 4097:getfield        #12  <Field azh a>
	// 2194 4100:getfield        #232 <Field int azh.aR>
	// 2195 4103:ixor            
	// 2196 4104:putfield        #232 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 2197 4107:aload_0         
	// 2198 4108:getfield        #12  <Field azh a>
	// 2199 4111:astore_1        
		abyte0.aR = ((azh) (abyte0)).H & ~a.aR;
	// 2200 4112:aload_1         
	// 2201 4113:aload_1         
	// 2202 4114:getfield        #235 <Field int azh.H>
	// 2203 4117:aload_0         
	// 2204 4118:getfield        #12  <Field azh a>
	// 2205 4121:getfield        #232 <Field int azh.aR>
	// 2206 4124:iconst_m1       
	// 2207 4125:ixor            
	// 2208 4126:iand            
	// 2209 4127:putfield        #232 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 2210 4130:aload_0         
	// 2211 4131:getfield        #12  <Field azh a>
	// 2212 4134:astore_1        
		abyte0.aR = ((azh) (abyte0)).n ^ a.aR;
	// 2213 4135:aload_1         
	// 2214 4136:aload_1         
	// 2215 4137:getfield        #238 <Field int azh.n>
	// 2216 4140:aload_0         
	// 2217 4141:getfield        #12  <Field azh a>
	// 2218 4144:getfield        #232 <Field int azh.aR>
	// 2219 4147:ixor            
	// 2220 4148:putfield        #232 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 2221 4151:aload_0         
	// 2222 4152:getfield        #12  <Field azh a>
	// 2223 4155:astore_1        
		abyte0.O = ((azh) (abyte0)).aR ^ a.O;
	// 2224 4156:aload_1         
	// 2225 4157:aload_1         
	// 2226 4158:getfield        #232 <Field int azh.aR>
	// 2227 4161:aload_0         
	// 2228 4162:getfield        #12  <Field azh a>
	// 2229 4165:getfield        #241 <Field int azh.O>
	// 2230 4168:ixor            
	// 2231 4169:putfield        #241 <Field int azh.O>
		abyte0 = ((byte []) (a));
	// 2232 4172:aload_0         
	// 2233 4173:getfield        #12  <Field azh a>
	// 2234 4176:astore_1        
		abyte0.aR = ((azh) (abyte0)).y & ~a.O;
	// 2235 4177:aload_1         
	// 2236 4178:aload_1         
	// 2237 4179:getfield        #179 <Field int azh.y>
	// 2238 4182:aload_0         
	// 2239 4183:getfield        #12  <Field azh a>
	// 2240 4186:getfield        #241 <Field int azh.O>
	// 2241 4189:iconst_m1       
	// 2242 4190:ixor            
	// 2243 4191:iand            
	// 2244 4192:putfield        #232 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 2245 4195:aload_0         
	// 2246 4196:getfield        #12  <Field azh a>
	// 2247 4199:astore_1        
		abyte0.n = ((azh) (abyte0)).y & ~a.O;
	// 2248 4200:aload_1         
	// 2249 4201:aload_1         
	// 2250 4202:getfield        #179 <Field int azh.y>
	// 2251 4205:aload_0         
	// 2252 4206:getfield        #12  <Field azh a>
	// 2253 4209:getfield        #241 <Field int azh.O>
	// 2254 4212:iconst_m1       
	// 2255 4213:ixor            
	// 2256 4214:iand            
	// 2257 4215:putfield        #238 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 2258 4218:aload_0         
	// 2259 4219:getfield        #12  <Field azh a>
	// 2260 4222:astore_1        
		abyte0.bs = ((azh) (abyte0)).O | a.y;
	// 2261 4223:aload_1         
	// 2262 4224:aload_1         
	// 2263 4225:getfield        #241 <Field int azh.O>
	// 2264 4228:aload_0         
	// 2265 4229:getfield        #12  <Field azh a>
	// 2266 4232:getfield        #179 <Field int azh.y>
	// 2267 4235:ior             
	// 2268 4236:putfield        #229 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2269 4239:aload_0         
	// 2270 4240:getfield        #12  <Field azh a>
	// 2271 4243:astore_1        
		abyte0.ap = ((azh) (abyte0)).O | a.y;
	// 2272 4244:aload_1         
	// 2273 4245:aload_1         
	// 2274 4246:getfield        #241 <Field int azh.O>
	// 2275 4249:aload_0         
	// 2276 4250:getfield        #12  <Field azh a>
	// 2277 4253:getfield        #179 <Field int azh.y>
	// 2278 4256:ior             
	// 2279 4257:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2280 4260:aload_0         
	// 2281 4261:getfield        #12  <Field azh a>
	// 2282 4264:astore_1        
		abyte0.bf = ((azh) (abyte0)).r | a.b;
	// 2283 4265:aload_1         
	// 2284 4266:aload_1         
	// 2285 4267:getfield        #71  <Field int azh.r>
	// 2286 4270:aload_0         
	// 2287 4271:getfield        #12  <Field azh a>
	// 2288 4274:getfield        #44  <Field int azh.b>
	// 2289 4277:ior             
	// 2290 4278:putfield        #161 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2291 4281:aload_0         
	// 2292 4282:getfield        #12  <Field azh a>
	// 2293 4285:astore_1        
		abyte0.bf = ((azh) (abyte0)).b ^ a.bf;
	// 2294 4286:aload_1         
	// 2295 4287:aload_1         
	// 2296 4288:getfield        #44  <Field int azh.b>
	// 2297 4291:aload_0         
	// 2298 4292:getfield        #12  <Field azh a>
	// 2299 4295:getfield        #161 <Field int azh.bf>
	// 2300 4298:ixor            
	// 2301 4299:putfield        #161 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2302 4302:aload_0         
	// 2303 4303:getfield        #12  <Field azh a>
	// 2304 4306:astore_1        
		abyte0.bf = ((azh) (abyte0)).bf & a.z;
	// 2305 4307:aload_1         
	// 2306 4308:aload_1         
	// 2307 4309:getfield        #161 <Field int azh.bf>
	// 2308 4312:aload_0         
	// 2309 4313:getfield        #12  <Field azh a>
	// 2310 4316:getfield        #32  <Field int azh.z>
	// 2311 4319:iand            
	// 2312 4320:putfield        #161 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2313 4323:aload_0         
	// 2314 4324:getfield        #12  <Field azh a>
	// 2315 4327:astore_1        
		abyte0.bf = ((azh) (abyte0)).ca ^ a.bf;
	// 2316 4328:aload_1         
	// 2317 4329:aload_1         
	// 2318 4330:getfield        #244 <Field int azh.ca>
	// 2319 4333:aload_0         
	// 2320 4334:getfield        #12  <Field azh a>
	// 2321 4337:getfield        #161 <Field int azh.bf>
	// 2322 4340:ixor            
	// 2323 4341:putfield        #161 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2324 4344:aload_0         
	// 2325 4345:getfield        #12  <Field azh a>
	// 2326 4348:astore_1        
		abyte0.aM = ((azh) (abyte0)).bf ^ a.aM;
	// 2327 4349:aload_1         
	// 2328 4350:aload_1         
	// 2329 4351:getfield        #161 <Field int azh.bf>
	// 2330 4354:aload_0         
	// 2331 4355:getfield        #12  <Field azh a>
	// 2332 4358:getfield        #247 <Field int azh.aM>
	// 2333 4361:ixor            
	// 2334 4362:putfield        #247 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 2335 4365:aload_0         
	// 2336 4366:getfield        #12  <Field azh a>
	// 2337 4369:astore_1        
		abyte0.aM = ((azh) (abyte0)).H & ~a.aM;
	// 2338 4370:aload_1         
	// 2339 4371:aload_1         
	// 2340 4372:getfield        #235 <Field int azh.H>
	// 2341 4375:aload_0         
	// 2342 4376:getfield        #12  <Field azh a>
	// 2343 4379:getfield        #247 <Field int azh.aM>
	// 2344 4382:iconst_m1       
	// 2345 4383:ixor            
	// 2346 4384:iand            
	// 2347 4385:putfield        #247 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 2348 4388:aload_0         
	// 2349 4389:getfield        #12  <Field azh a>
	// 2350 4392:astore_1        
		abyte0.aM = ((azh) (abyte0)).bS ^ a.aM;
	// 2351 4393:aload_1         
	// 2352 4394:aload_1         
	// 2353 4395:getfield        #35  <Field int azh.bS>
	// 2354 4398:aload_0         
	// 2355 4399:getfield        #12  <Field azh a>
	// 2356 4402:getfield        #247 <Field int azh.aM>
	// 2357 4405:ixor            
	// 2358 4406:putfield        #247 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 2359 4409:aload_0         
	// 2360 4410:getfield        #12  <Field azh a>
	// 2361 4413:astore_1        
		abyte0.m = ((azh) (abyte0)).aM ^ a.m;
	// 2362 4414:aload_1         
	// 2363 4415:aload_1         
	// 2364 4416:getfield        #247 <Field int azh.aM>
	// 2365 4419:aload_0         
	// 2366 4420:getfield        #12  <Field azh a>
	// 2367 4423:getfield        #250 <Field int azh.m>
	// 2368 4426:ixor            
	// 2369 4427:putfield        #250 <Field int azh.m>
		abyte0 = ((byte []) (a));
	// 2370 4430:aload_0         
	// 2371 4431:getfield        #12  <Field azh a>
	// 2372 4434:astore_1        
		abyte0.ba = ((azh) (abyte0)).ba & ~a.c;
	// 2373 4435:aload_1         
	// 2374 4436:aload_1         
	// 2375 4437:getfield        #253 <Field int azh.ba>
	// 2376 4440:aload_0         
	// 2377 4441:getfield        #12  <Field azh a>
	// 2378 4444:getfield        #256 <Field int azh.c>
	// 2379 4447:iconst_m1       
	// 2380 4448:ixor            
	// 2381 4449:iand            
	// 2382 4450:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2383 4453:aload_0         
	// 2384 4454:getfield        #12  <Field azh a>
	// 2385 4457:astore_1        
		abyte0.ba = ((azh) (abyte0)).bJ ^ a.ba;
	// 2386 4458:aload_1         
	// 2387 4459:aload_1         
	// 2388 4460:getfield        #259 <Field int azh.bJ>
	// 2389 4463:aload_0         
	// 2390 4464:getfield        #12  <Field azh a>
	// 2391 4467:getfield        #253 <Field int azh.ba>
	// 2392 4470:ixor            
	// 2393 4471:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2394 4474:aload_0         
	// 2395 4475:getfield        #12  <Field azh a>
	// 2396 4478:astore_1        
		abyte0.aC = ((azh) (abyte0)).ba ^ a.aC;
	// 2397 4479:aload_1         
	// 2398 4480:aload_1         
	// 2399 4481:getfield        #253 <Field int azh.ba>
	// 2400 4484:aload_0         
	// 2401 4485:getfield        #12  <Field azh a>
	// 2402 4488:getfield        #262 <Field int azh.aC>
	// 2403 4491:ixor            
	// 2404 4492:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2405 4495:aload_0         
	// 2406 4496:getfield        #12  <Field azh a>
	// 2407 4499:astore_1        
		abyte0.aC = ((azh) (abyte0)).ae | a.aC;
	// 2408 4500:aload_1         
	// 2409 4501:aload_1         
	// 2410 4502:getfield        #265 <Field int azh.ae>
	// 2411 4505:aload_0         
	// 2412 4506:getfield        #12  <Field azh a>
	// 2413 4509:getfield        #262 <Field int azh.aC>
	// 2414 4512:ior             
	// 2415 4513:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2416 4516:aload_0         
	// 2417 4517:getfield        #12  <Field azh a>
	// 2418 4520:astore_1        
		abyte0.aC = ((azh) (abyte0)).bu ^ a.aC;
	// 2419 4521:aload_1         
	// 2420 4522:aload_1         
	// 2421 4523:getfield        #268 <Field int azh.bu>
	// 2422 4526:aload_0         
	// 2423 4527:getfield        #12  <Field azh a>
	// 2424 4530:getfield        #262 <Field int azh.aC>
	// 2425 4533:ixor            
	// 2426 4534:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2427 4537:aload_0         
	// 2428 4538:getfield        #12  <Field azh a>
	// 2429 4541:astore_1        
		abyte0.L = ((azh) (abyte0)).aC ^ a.L;
	// 2430 4542:aload_1         
	// 2431 4543:aload_1         
	// 2432 4544:getfield        #262 <Field int azh.aC>
	// 2433 4547:aload_0         
	// 2434 4548:getfield        #12  <Field azh a>
	// 2435 4551:getfield        #271 <Field int azh.L>
	// 2436 4554:ixor            
	// 2437 4555:putfield        #271 <Field int azh.L>
		abyte0 = ((byte []) (a));
	// 2438 4558:aload_0         
	// 2439 4559:getfield        #12  <Field azh a>
	// 2440 4562:astore_1        
		abyte0.aq = ((azh) (abyte0)).L & a.aq;
	// 2441 4563:aload_1         
	// 2442 4564:aload_1         
	// 2443 4565:getfield        #271 <Field int azh.L>
	// 2444 4568:aload_0         
	// 2445 4569:getfield        #12  <Field azh a>
	// 2446 4572:getfield        #274 <Field int azh.aq>
	// 2447 4575:iand            
	// 2448 4576:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 2449 4579:aload_0         
	// 2450 4580:getfield        #12  <Field azh a>
	// 2451 4583:astore_1        
		abyte0.aq = ((azh) (abyte0)).s ^ a.aq;
	// 2452 4584:aload_1         
	// 2453 4585:aload_1         
	// 2454 4586:getfield        #277 <Field int azh.s>
	// 2455 4589:aload_0         
	// 2456 4590:getfield        #12  <Field azh a>
	// 2457 4593:getfield        #274 <Field int azh.aq>
	// 2458 4596:ixor            
	// 2459 4597:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 2460 4600:aload_0         
	// 2461 4601:getfield        #12  <Field azh a>
	// 2462 4604:astore_1        
		abyte0.aq = ((azh) (abyte0)).aq | a.aj;
	// 2463 4605:aload_1         
	// 2464 4606:aload_1         
	// 2465 4607:getfield        #274 <Field int azh.aq>
	// 2466 4610:aload_0         
	// 2467 4611:getfield        #12  <Field azh a>
	// 2468 4614:getfield        #280 <Field int azh.aj>
	// 2469 4617:ior             
	// 2470 4618:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 2471 4621:aload_0         
	// 2472 4622:getfield        #12  <Field azh a>
	// 2473 4625:astore_1        
		abyte0.s = ((azh) (abyte0)).L & a.ax;
	// 2474 4626:aload_1         
	// 2475 4627:aload_1         
	// 2476 4628:getfield        #271 <Field int azh.L>
	// 2477 4631:aload_0         
	// 2478 4632:getfield        #12  <Field azh a>
	// 2479 4635:getfield        #283 <Field int azh.ax>
	// 2480 4638:iand            
	// 2481 4639:putfield        #277 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2482 4642:aload_0         
	// 2483 4643:getfield        #12  <Field azh a>
	// 2484 4646:astore_1        
		abyte0.s = ((azh) (abyte0)).an ^ a.s;
	// 2485 4647:aload_1         
	// 2486 4648:aload_1         
	// 2487 4649:getfield        #286 <Field int azh.an>
	// 2488 4652:aload_0         
	// 2489 4653:getfield        #12  <Field azh a>
	// 2490 4656:getfield        #277 <Field int azh.s>
	// 2491 4659:ixor            
	// 2492 4660:putfield        #277 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2493 4663:aload_0         
	// 2494 4664:getfield        #12  <Field azh a>
	// 2495 4667:astore_1        
		abyte0.s = ((azh) (abyte0)).bA | a.s;
	// 2496 4668:aload_1         
	// 2497 4669:aload_1         
	// 2498 4670:getfield        #289 <Field int azh.bA>
	// 2499 4673:aload_0         
	// 2500 4674:getfield        #12  <Field azh a>
	// 2501 4677:getfield        #277 <Field int azh.s>
	// 2502 4680:ior             
	// 2503 4681:putfield        #277 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2504 4684:aload_0         
	// 2505 4685:getfield        #12  <Field azh a>
	// 2506 4688:astore_1        
		abyte0.bK = ((azh) (abyte0)).L & a.bK;
	// 2507 4689:aload_1         
	// 2508 4690:aload_1         
	// 2509 4691:getfield        #271 <Field int azh.L>
	// 2510 4694:aload_0         
	// 2511 4695:getfield        #12  <Field azh a>
	// 2512 4698:getfield        #292 <Field int azh.bK>
	// 2513 4701:iand            
	// 2514 4702:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 2515 4705:aload_0         
	// 2516 4706:getfield        #12  <Field azh a>
	// 2517 4709:astore_1        
		abyte0.bK = ((azh) (abyte0)).aQ ^ a.bK;
	// 2518 4710:aload_1         
	// 2519 4711:aload_1         
	// 2520 4712:getfield        #295 <Field int azh.aQ>
	// 2521 4715:aload_0         
	// 2522 4716:getfield        #12  <Field azh a>
	// 2523 4719:getfield        #292 <Field int azh.bK>
	// 2524 4722:ixor            
	// 2525 4723:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 2526 4726:aload_0         
	// 2527 4727:getfield        #12  <Field azh a>
	// 2528 4730:astore_1        
		abyte0.aA = ((azh) (abyte0)).L & ~a.aA;
	// 2529 4731:aload_1         
	// 2530 4732:aload_1         
	// 2531 4733:getfield        #271 <Field int azh.L>
	// 2532 4736:aload_0         
	// 2533 4737:getfield        #12  <Field azh a>
	// 2534 4740:getfield        #298 <Field int azh.aA>
	// 2535 4743:iconst_m1       
	// 2536 4744:ixor            
	// 2537 4745:iand            
	// 2538 4746:putfield        #298 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2539 4749:aload_0         
	// 2540 4750:getfield        #12  <Field azh a>
	// 2541 4753:astore_1        
		abyte0.aA = ((azh) (abyte0)).by ^ a.aA;
	// 2542 4754:aload_1         
	// 2543 4755:aload_1         
	// 2544 4756:getfield        #301 <Field int azh.by>
	// 2545 4759:aload_0         
	// 2546 4760:getfield        #12  <Field azh a>
	// 2547 4763:getfield        #298 <Field int azh.aA>
	// 2548 4766:ixor            
	// 2549 4767:putfield        #298 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2550 4770:aload_0         
	// 2551 4771:getfield        #12  <Field azh a>
	// 2552 4774:astore_1        
		abyte0.aw = ((azh) (abyte0)).L & a.aw;
	// 2553 4775:aload_1         
	// 2554 4776:aload_1         
	// 2555 4777:getfield        #271 <Field int azh.L>
	// 2556 4780:aload_0         
	// 2557 4781:getfield        #12  <Field azh a>
	// 2558 4784:getfield        #304 <Field int azh.aw>
	// 2559 4787:iand            
	// 2560 4788:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 2561 4791:aload_0         
	// 2562 4792:getfield        #12  <Field azh a>
	// 2563 4795:astore_1        
		abyte0.aw = ((azh) (abyte0)).ay ^ a.aw;
	// 2564 4796:aload_1         
	// 2565 4797:aload_1         
	// 2566 4798:getfield        #307 <Field int azh.ay>
	// 2567 4801:aload_0         
	// 2568 4802:getfield        #12  <Field azh a>
	// 2569 4805:getfield        #304 <Field int azh.aw>
	// 2570 4808:ixor            
	// 2571 4809:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 2572 4812:aload_0         
	// 2573 4813:getfield        #12  <Field azh a>
	// 2574 4816:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw | a.aj;
	// 2575 4817:aload_1         
	// 2576 4818:aload_1         
	// 2577 4819:getfield        #304 <Field int azh.aw>
	// 2578 4822:aload_0         
	// 2579 4823:getfield        #12  <Field azh a>
	// 2580 4826:getfield        #280 <Field int azh.aj>
	// 2581 4829:ior             
	// 2582 4830:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 2583 4833:aload_0         
	// 2584 4834:getfield        #12  <Field azh a>
	// 2585 4837:astore_1        
		abyte0.ay = ((azh) (abyte0)).L & ~a.bo;
	// 2586 4838:aload_1         
	// 2587 4839:aload_1         
	// 2588 4840:getfield        #271 <Field int azh.L>
	// 2589 4843:aload_0         
	// 2590 4844:getfield        #12  <Field azh a>
	// 2591 4847:getfield        #310 <Field int azh.bo>
	// 2592 4850:iconst_m1       
	// 2593 4851:ixor            
	// 2594 4852:iand            
	// 2595 4853:putfield        #307 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2596 4856:aload_0         
	// 2597 4857:getfield        #12  <Field azh a>
	// 2598 4860:astore_1        
		abyte0.ay = ((azh) (abyte0)).aB ^ a.ay;
	// 2599 4861:aload_1         
	// 2600 4862:aload_1         
	// 2601 4863:getfield        #313 <Field int azh.aB>
	// 2602 4866:aload_0         
	// 2603 4867:getfield        #12  <Field azh a>
	// 2604 4870:getfield        #307 <Field int azh.ay>
	// 2605 4873:ixor            
	// 2606 4874:putfield        #307 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2607 4877:aload_0         
	// 2608 4878:getfield        #12  <Field azh a>
	// 2609 4881:astore_1        
		abyte0.s = ((azh) (abyte0)).ay ^ a.s;
	// 2610 4882:aload_1         
	// 2611 4883:aload_1         
	// 2612 4884:getfield        #307 <Field int azh.ay>
	// 2613 4887:aload_0         
	// 2614 4888:getfield        #12  <Field azh a>
	// 2615 4891:getfield        #277 <Field int azh.s>
	// 2616 4894:ixor            
	// 2617 4895:putfield        #277 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2618 4898:aload_0         
	// 2619 4899:getfield        #12  <Field azh a>
	// 2620 4902:astore_1        
		abyte0.ax = ((azh) (abyte0)).L & a.ax;
	// 2621 4903:aload_1         
	// 2622 4904:aload_1         
	// 2623 4905:getfield        #271 <Field int azh.L>
	// 2624 4908:aload_0         
	// 2625 4909:getfield        #12  <Field azh a>
	// 2626 4912:getfield        #283 <Field int azh.ax>
	// 2627 4915:iand            
	// 2628 4916:putfield        #283 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 2629 4919:aload_0         
	// 2630 4920:getfield        #12  <Field azh a>
	// 2631 4923:astore_1        
		abyte0.ax = ((azh) (abyte0)).bO ^ a.ax;
	// 2632 4924:aload_1         
	// 2633 4925:aload_1         
	// 2634 4926:getfield        #316 <Field int azh.bO>
	// 2635 4929:aload_0         
	// 2636 4930:getfield        #12  <Field azh a>
	// 2637 4933:getfield        #283 <Field int azh.ax>
	// 2638 4936:ixor            
	// 2639 4937:putfield        #283 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 2640 4940:aload_0         
	// 2641 4941:getfield        #12  <Field azh a>
	// 2642 4944:astore_1        
		abyte0.ax = ((azh) (abyte0)).bA | a.ax;
	// 2643 4945:aload_1         
	// 2644 4946:aload_1         
	// 2645 4947:getfield        #289 <Field int azh.bA>
	// 2646 4950:aload_0         
	// 2647 4951:getfield        #12  <Field azh a>
	// 2648 4954:getfield        #283 <Field int azh.ax>
	// 2649 4957:ior             
	// 2650 4958:putfield        #283 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 2651 4961:aload_0         
	// 2652 4962:getfield        #12  <Field azh a>
	// 2653 4965:astore_1        
		abyte0.bv = ((azh) (abyte0)).L & a.bv;
	// 2654 4966:aload_1         
	// 2655 4967:aload_1         
	// 2656 4968:getfield        #271 <Field int azh.L>
	// 2657 4971:aload_0         
	// 2658 4972:getfield        #12  <Field azh a>
	// 2659 4975:getfield        #319 <Field int azh.bv>
	// 2660 4978:iand            
	// 2661 4979:putfield        #319 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2662 4982:aload_0         
	// 2663 4983:getfield        #12  <Field azh a>
	// 2664 4986:astore_1        
		abyte0.bv = ((azh) (abyte0)).at ^ a.bv;
	// 2665 4987:aload_1         
	// 2666 4988:aload_1         
	// 2667 4989:getfield        #322 <Field int azh.at>
	// 2668 4992:aload_0         
	// 2669 4993:getfield        #12  <Field azh a>
	// 2670 4996:getfield        #319 <Field int azh.bv>
	// 2671 4999:ixor            
	// 2672 5000:putfield        #319 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2673 5003:aload_0         
	// 2674 5004:getfield        #12  <Field azh a>
	// 2675 5007:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv & ~a.aj;
	// 2676 5008:aload_1         
	// 2677 5009:aload_1         
	// 2678 5010:getfield        #319 <Field int azh.bv>
	// 2679 5013:aload_0         
	// 2680 5014:getfield        #12  <Field azh a>
	// 2681 5017:getfield        #280 <Field int azh.aj>
	// 2682 5020:iconst_m1       
	// 2683 5021:ixor            
	// 2684 5022:iand            
	// 2685 5023:putfield        #319 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2686 5026:aload_0         
	// 2687 5027:getfield        #12  <Field azh a>
	// 2688 5030:astore_1        
		abyte0.aG = ((azh) (abyte0)).L & ~a.aG;
	// 2689 5031:aload_1         
	// 2690 5032:aload_1         
	// 2691 5033:getfield        #271 <Field int azh.L>
	// 2692 5036:aload_0         
	// 2693 5037:getfield        #12  <Field azh a>
	// 2694 5040:getfield        #325 <Field int azh.aG>
	// 2695 5043:iconst_m1       
	// 2696 5044:ixor            
	// 2697 5045:iand            
	// 2698 5046:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2699 5049:aload_0         
	// 2700 5050:getfield        #12  <Field azh a>
	// 2701 5053:astore_1        
		abyte0.aG = ((azh) (abyte0)).ar ^ a.aG;
	// 2702 5054:aload_1         
	// 2703 5055:aload_1         
	// 2704 5056:getfield        #328 <Field int azh.ar>
	// 2705 5059:aload_0         
	// 2706 5060:getfield        #12  <Field azh a>
	// 2707 5063:getfield        #325 <Field int azh.aG>
	// 2708 5066:ixor            
	// 2709 5067:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2710 5070:aload_0         
	// 2711 5071:getfield        #12  <Field azh a>
	// 2712 5074:astore_1        
		abyte0.aq = ((azh) (abyte0)).aG ^ a.aq;
	// 2713 5075:aload_1         
	// 2714 5076:aload_1         
	// 2715 5077:getfield        #325 <Field int azh.aG>
	// 2716 5080:aload_0         
	// 2717 5081:getfield        #12  <Field azh a>
	// 2718 5084:getfield        #274 <Field int azh.aq>
	// 2719 5087:ixor            
	// 2720 5088:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 2721 5091:aload_0         
	// 2722 5092:getfield        #12  <Field azh a>
	// 2723 5095:astore_1        
		abyte0.q = ((azh) (abyte0)).aq ^ a.q;
	// 2724 5096:aload_1         
	// 2725 5097:aload_1         
	// 2726 5098:getfield        #274 <Field int azh.aq>
	// 2727 5101:aload_0         
	// 2728 5102:getfield        #12  <Field azh a>
	// 2729 5105:getfield        #331 <Field int azh.q>
	// 2730 5108:ixor            
	// 2731 5109:putfield        #331 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 2732 5112:aload_0         
	// 2733 5113:getfield        #12  <Field azh a>
	// 2734 5116:astore_1        
		abyte0.aq = ((azh) (abyte0)).G & a.q;
	// 2735 5117:aload_1         
	// 2736 5118:aload_1         
	// 2737 5119:getfield        #176 <Field int azh.G>
	// 2738 5122:aload_0         
	// 2739 5123:getfield        #12  <Field azh a>
	// 2740 5126:getfield        #331 <Field int azh.q>
	// 2741 5129:iand            
	// 2742 5130:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 2743 5133:aload_0         
	// 2744 5134:getfield        #12  <Field azh a>
	// 2745 5137:astore_1        
		abyte0.cb = ((azh) (abyte0)).aq ^ a.cb;
	// 2746 5138:aload_1         
	// 2747 5139:aload_1         
	// 2748 5140:getfield        #274 <Field int azh.aq>
	// 2749 5143:aload_0         
	// 2750 5144:getfield        #12  <Field azh a>
	// 2751 5147:getfield        #158 <Field int azh.cb>
	// 2752 5150:ixor            
	// 2753 5151:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2754 5154:aload_0         
	// 2755 5155:getfield        #12  <Field azh a>
	// 2756 5158:astore_1        
		abyte0.cb = ((azh) (abyte0)).y | a.cb;
	// 2757 5159:aload_1         
	// 2758 5160:aload_1         
	// 2759 5161:getfield        #179 <Field int azh.y>
	// 2760 5164:aload_0         
	// 2761 5165:getfield        #12  <Field azh a>
	// 2762 5168:getfield        #158 <Field int azh.cb>
	// 2763 5171:ior             
	// 2764 5172:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2765 5175:aload_0         
	// 2766 5176:getfield        #12  <Field azh a>
	// 2767 5179:astore_1        
		abyte0.aG = ((azh) (abyte0)).G & ~a.aq;
	// 2768 5180:aload_1         
	// 2769 5181:aload_1         
	// 2770 5182:getfield        #176 <Field int azh.G>
	// 2771 5185:aload_0         
	// 2772 5186:getfield        #12  <Field azh a>
	// 2773 5189:getfield        #274 <Field int azh.aq>
	// 2774 5192:iconst_m1       
	// 2775 5193:ixor            
	// 2776 5194:iand            
	// 2777 5195:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2778 5198:aload_0         
	// 2779 5199:getfield        #12  <Field azh a>
	// 2780 5202:astore_1        
		abyte0.aG = ((azh) (abyte0)).i & ~a.aG;
	// 2781 5203:aload_1         
	// 2782 5204:aload_1         
	// 2783 5205:getfield        #173 <Field int azh.i>
	// 2784 5208:aload_0         
	// 2785 5209:getfield        #12  <Field azh a>
	// 2786 5212:getfield        #325 <Field int azh.aG>
	// 2787 5215:iconst_m1       
	// 2788 5216:ixor            
	// 2789 5217:iand            
	// 2790 5218:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2791 5221:aload_0         
	// 2792 5222:getfield        #12  <Field azh a>
	// 2793 5225:astore_1        
		abyte0.aG = ((azh) (abyte0)).aq ^ a.aG;
	// 2794 5226:aload_1         
	// 2795 5227:aload_1         
	// 2796 5228:getfield        #274 <Field int azh.aq>
	// 2797 5231:aload_0         
	// 2798 5232:getfield        #12  <Field azh a>
	// 2799 5235:getfield        #325 <Field int azh.aG>
	// 2800 5238:ixor            
	// 2801 5239:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2802 5242:aload_0         
	// 2803 5243:getfield        #12  <Field azh a>
	// 2804 5246:astore_1        
		abyte0.ar = ((azh) (abyte0)).i & a.aq;
	// 2805 5247:aload_1         
	// 2806 5248:aload_1         
	// 2807 5249:getfield        #173 <Field int azh.i>
	// 2808 5252:aload_0         
	// 2809 5253:getfield        #12  <Field azh a>
	// 2810 5256:getfield        #274 <Field int azh.aq>
	// 2811 5259:iand            
	// 2812 5260:putfield        #328 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2813 5263:aload_0         
	// 2814 5264:getfield        #12  <Field azh a>
	// 2815 5267:astore_1        
		abyte0.at = ((azh) (abyte0)).i & a.q;
	// 2816 5268:aload_1         
	// 2817 5269:aload_1         
	// 2818 5270:getfield        #173 <Field int azh.i>
	// 2819 5273:aload_0         
	// 2820 5274:getfield        #12  <Field azh a>
	// 2821 5277:getfield        #331 <Field int azh.q>
	// 2822 5280:iand            
	// 2823 5281:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 2824 5284:aload_0         
	// 2825 5285:getfield        #12  <Field azh a>
	// 2826 5288:astore_1        
		abyte0.bO = ((azh) (abyte0)).at & ~a.y;
	// 2827 5289:aload_1         
	// 2828 5290:aload_1         
	// 2829 5291:getfield        #322 <Field int azh.at>
	// 2830 5294:aload_0         
	// 2831 5295:getfield        #12  <Field azh a>
	// 2832 5298:getfield        #179 <Field int azh.y>
	// 2833 5301:iconst_m1       
	// 2834 5302:ixor            
	// 2835 5303:iand            
	// 2836 5304:putfield        #316 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2837 5307:aload_0         
	// 2838 5308:getfield        #12  <Field azh a>
	// 2839 5311:astore_1        
		abyte0.bO = ((azh) (abyte0)).ce ^ a.bO;
	// 2840 5312:aload_1         
	// 2841 5313:aload_1         
	// 2842 5314:getfield        #29  <Field int azh.ce>
	// 2843 5317:aload_0         
	// 2844 5318:getfield        #12  <Field azh a>
	// 2845 5321:getfield        #316 <Field int azh.bO>
	// 2846 5324:ixor            
	// 2847 5325:putfield        #316 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2848 5328:aload_0         
	// 2849 5329:getfield        #12  <Field azh a>
	// 2850 5332:astore_1        
		abyte0.at = ((azh) (abyte0)).y | a.at;
	// 2851 5333:aload_1         
	// 2852 5334:aload_1         
	// 2853 5335:getfield        #179 <Field int azh.y>
	// 2854 5338:aload_0         
	// 2855 5339:getfield        #12  <Field azh a>
	// 2856 5342:getfield        #322 <Field int azh.at>
	// 2857 5345:ior             
	// 2858 5346:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 2859 5349:aload_0         
	// 2860 5350:getfield        #12  <Field azh a>
	// 2861 5353:astore_1        
		abyte0.ay = ((azh) (abyte0)).G & ~a.q;
	// 2862 5354:aload_1         
	// 2863 5355:aload_1         
	// 2864 5356:getfield        #176 <Field int azh.G>
	// 2865 5359:aload_0         
	// 2866 5360:getfield        #12  <Field azh a>
	// 2867 5363:getfield        #331 <Field int azh.q>
	// 2868 5366:iconst_m1       
	// 2869 5367:ixor            
	// 2870 5368:iand            
	// 2871 5369:putfield        #307 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2872 5372:aload_0         
	// 2873 5373:getfield        #12  <Field azh a>
	// 2874 5376:astore_1        
		abyte0.ay = ((azh) (abyte0)).ay ^ a.i;
	// 2875 5377:aload_1         
	// 2876 5378:aload_1         
	// 2877 5379:getfield        #307 <Field int azh.ay>
	// 2878 5382:aload_0         
	// 2879 5383:getfield        #12  <Field azh a>
	// 2880 5386:getfield        #173 <Field int azh.i>
	// 2881 5389:ixor            
	// 2882 5390:putfield        #307 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2883 5393:aload_0         
	// 2884 5394:getfield        #12  <Field azh a>
	// 2885 5397:astore_1        
		abyte0.bF = ((azh) (abyte0)).ay ^ a.bF;
	// 2886 5398:aload_1         
	// 2887 5399:aload_1         
	// 2888 5400:getfield        #307 <Field int azh.ay>
	// 2889 5403:aload_0         
	// 2890 5404:getfield        #12  <Field azh a>
	// 2891 5407:getfield        #89  <Field int azh.bF>
	// 2892 5410:ixor            
	// 2893 5411:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 2894 5414:aload_0         
	// 2895 5415:getfield        #12  <Field azh a>
	// 2896 5418:astore_1        
		abyte0.bF = ((azh) (abyte0)).bF & ~a.a;
	// 2897 5419:aload_1         
	// 2898 5420:aload_1         
	// 2899 5421:getfield        #89  <Field int azh.bF>
	// 2900 5424:aload_0         
	// 2901 5425:getfield        #12  <Field azh a>
	// 2902 5428:getfield        #196 <Field int azh.a>
	// 2903 5431:iconst_m1       
	// 2904 5432:ixor            
	// 2905 5433:iand            
	// 2906 5434:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 2907 5437:aload_0         
	// 2908 5438:getfield        #12  <Field azh a>
	// 2909 5441:astore_1        
		abyte0.aB = ((azh) (abyte0)).q & ~a.G;
	// 2910 5442:aload_1         
	// 2911 5443:aload_1         
	// 2912 5444:getfield        #331 <Field int azh.q>
	// 2913 5447:aload_0         
	// 2914 5448:getfield        #12  <Field azh a>
	// 2915 5451:getfield        #176 <Field int azh.G>
	// 2916 5454:iconst_m1       
	// 2917 5455:ixor            
	// 2918 5456:iand            
	// 2919 5457:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 2920 5460:aload_0         
	// 2921 5461:getfield        #12  <Field azh a>
	// 2922 5464:astore_1        
		abyte0.by = ((azh) (abyte0)).i & a.aB;
	// 2923 5465:aload_1         
	// 2924 5466:aload_1         
	// 2925 5467:getfield        #173 <Field int azh.i>
	// 2926 5470:aload_0         
	// 2927 5471:getfield        #12  <Field azh a>
	// 2928 5474:getfield        #313 <Field int azh.aB>
	// 2929 5477:iand            
	// 2930 5478:putfield        #301 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 2931 5481:aload_0         
	// 2932 5482:getfield        #12  <Field azh a>
	// 2933 5485:astore_1        
		abyte0.by = ((azh) (abyte0)).aq ^ a.by;
	// 2934 5486:aload_1         
	// 2935 5487:aload_1         
	// 2936 5488:getfield        #274 <Field int azh.aq>
	// 2937 5491:aload_0         
	// 2938 5492:getfield        #12  <Field azh a>
	// 2939 5495:getfield        #301 <Field int azh.by>
	// 2940 5498:ixor            
	// 2941 5499:putfield        #301 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 2942 5502:aload_0         
	// 2943 5503:getfield        #12  <Field azh a>
	// 2944 5506:astore_1        
		abyte0.by = ((azh) (abyte0)).y | a.by;
	// 2945 5507:aload_1         
	// 2946 5508:aload_1         
	// 2947 5509:getfield        #179 <Field int azh.y>
	// 2948 5512:aload_0         
	// 2949 5513:getfield        #12  <Field azh a>
	// 2950 5516:getfield        #301 <Field int azh.by>
	// 2951 5519:ior             
	// 2952 5520:putfield        #301 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 2953 5523:aload_0         
	// 2954 5524:getfield        #12  <Field azh a>
	// 2955 5527:astore_1        
		abyte0.by = ((azh) (abyte0)).aG ^ a.by;
	// 2956 5528:aload_1         
	// 2957 5529:aload_1         
	// 2958 5530:getfield        #325 <Field int azh.aG>
	// 2959 5533:aload_0         
	// 2960 5534:getfield        #12  <Field azh a>
	// 2961 5537:getfield        #301 <Field int azh.by>
	// 2962 5540:ixor            
	// 2963 5541:putfield        #301 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 2964 5544:aload_0         
	// 2965 5545:getfield        #12  <Field azh a>
	// 2966 5548:astore_1        
		abyte0.bY = ((azh) (abyte0)).aB ^ a.bY;
	// 2967 5549:aload_1         
	// 2968 5550:aload_1         
	// 2969 5551:getfield        #313 <Field int azh.aB>
	// 2970 5554:aload_0         
	// 2971 5555:getfield        #12  <Field azh a>
	// 2972 5558:getfield        #167 <Field int azh.bY>
	// 2973 5561:ixor            
	// 2974 5562:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 2975 5565:aload_0         
	// 2976 5566:getfield        #12  <Field azh a>
	// 2977 5569:astore_1        
		abyte0.aG = ((azh) (abyte0)).bY & ~a.y;
	// 2978 5570:aload_1         
	// 2979 5571:aload_1         
	// 2980 5572:getfield        #167 <Field int azh.bY>
	// 2981 5575:aload_0         
	// 2982 5576:getfield        #12  <Field azh a>
	// 2983 5579:getfield        #179 <Field int azh.y>
	// 2984 5582:iconst_m1       
	// 2985 5583:ixor            
	// 2986 5584:iand            
	// 2987 5585:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2988 5588:aload_0         
	// 2989 5589:getfield        #12  <Field azh a>
	// 2990 5592:astore_1        
		abyte0.aG = ((azh) (abyte0)).as ^ a.aG;
	// 2991 5593:aload_1         
	// 2992 5594:aload_1         
	// 2993 5595:getfield        #92  <Field int azh.as>
	// 2994 5598:aload_0         
	// 2995 5599:getfield        #12  <Field azh a>
	// 2996 5602:getfield        #325 <Field int azh.aG>
	// 2997 5605:ixor            
	// 2998 5606:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2999 5609:aload_0         
	// 3000 5610:getfield        #12  <Field azh a>
	// 3001 5613:astore_1        
		abyte0.aG = ((azh) (abyte0)).aG & ~a.a;
	// 3002 5614:aload_1         
	// 3003 5615:aload_1         
	// 3004 5616:getfield        #325 <Field int azh.aG>
	// 3005 5619:aload_0         
	// 3006 5620:getfield        #12  <Field azh a>
	// 3007 5623:getfield        #196 <Field int azh.a>
	// 3008 5626:iconst_m1       
	// 3009 5627:ixor            
	// 3010 5628:iand            
	// 3011 5629:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 3012 5632:aload_0         
	// 3013 5633:getfield        #12  <Field azh a>
	// 3014 5636:astore_1        
		abyte0.aG = ((azh) (abyte0)).bO ^ a.aG;
	// 3015 5637:aload_1         
	// 3016 5638:aload_1         
	// 3017 5639:getfield        #316 <Field int azh.bO>
	// 3018 5642:aload_0         
	// 3019 5643:getfield        #12  <Field azh a>
	// 3020 5646:getfield        #325 <Field int azh.aG>
	// 3021 5649:ixor            
	// 3022 5650:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 3023 5653:aload_0         
	// 3024 5654:getfield        #12  <Field azh a>
	// 3025 5657:astore_1        
		abyte0.bY = ((azh) (abyte0)).y & ~a.bY;
	// 3026 5658:aload_1         
	// 3027 5659:aload_1         
	// 3028 5660:getfield        #179 <Field int azh.y>
	// 3029 5663:aload_0         
	// 3030 5664:getfield        #12  <Field azh a>
	// 3031 5667:getfield        #167 <Field int azh.bY>
	// 3032 5670:iconst_m1       
	// 3033 5671:ixor            
	// 3034 5672:iand            
	// 3035 5673:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 3036 5676:aload_0         
	// 3037 5677:getfield        #12  <Field azh a>
	// 3038 5680:astore_1        
		abyte0.bY = ((azh) (abyte0)).as ^ a.bY;
	// 3039 5681:aload_1         
	// 3040 5682:aload_1         
	// 3041 5683:getfield        #92  <Field int azh.as>
	// 3042 5686:aload_0         
	// 3043 5687:getfield        #12  <Field azh a>
	// 3044 5690:getfield        #167 <Field int azh.bY>
	// 3045 5693:ixor            
	// 3046 5694:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 3047 5697:aload_0         
	// 3048 5698:getfield        #12  <Field azh a>
	// 3049 5701:astore_1        
		abyte0.bY = ((azh) (abyte0)).a | a.bY;
	// 3050 5702:aload_1         
	// 3051 5703:aload_1         
	// 3052 5704:getfield        #196 <Field int azh.a>
	// 3053 5707:aload_0         
	// 3054 5708:getfield        #12  <Field azh a>
	// 3055 5711:getfield        #167 <Field int azh.bY>
	// 3056 5714:ior             
	// 3057 5715:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 3058 5718:aload_0         
	// 3059 5719:getfield        #12  <Field azh a>
	// 3060 5722:astore_1        
		abyte0.bO = ((azh) (abyte0)).aB & ~a.a;
	// 3061 5723:aload_1         
	// 3062 5724:aload_1         
	// 3063 5725:getfield        #313 <Field int azh.aB>
	// 3064 5728:aload_0         
	// 3065 5729:getfield        #12  <Field azh a>
	// 3066 5732:getfield        #196 <Field int azh.a>
	// 3067 5735:iconst_m1       
	// 3068 5736:ixor            
	// 3069 5737:iand            
	// 3070 5738:putfield        #316 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3071 5741:aload_0         
	// 3072 5742:getfield        #12  <Field azh a>
	// 3073 5745:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB | a.y;
	// 3074 5746:aload_1         
	// 3075 5747:aload_1         
	// 3076 5748:getfield        #313 <Field int azh.aB>
	// 3077 5751:aload_0         
	// 3078 5752:getfield        #12  <Field azh a>
	// 3079 5755:getfield        #179 <Field int azh.y>
	// 3080 5758:ior             
	// 3081 5759:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3082 5762:aload_0         
	// 3083 5763:getfield        #12  <Field azh a>
	// 3084 5766:astore_1        
		abyte0.aq = ((azh) (abyte0)).q | a.G;
	// 3085 5767:aload_1         
	// 3086 5768:aload_1         
	// 3087 5769:getfield        #331 <Field int azh.q>
	// 3088 5772:aload_0         
	// 3089 5773:getfield        #12  <Field azh a>
	// 3090 5776:getfield        #176 <Field int azh.G>
	// 3091 5779:ior             
	// 3092 5780:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3093 5783:aload_0         
	// 3094 5784:getfield        #12  <Field azh a>
	// 3095 5787:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aq ^ a.i;
	// 3096 5788:aload_1         
	// 3097 5789:aload_1         
	// 3098 5790:getfield        #274 <Field int azh.aq>
	// 3099 5793:aload_0         
	// 3100 5794:getfield        #12  <Field azh a>
	// 3101 5797:getfield        #173 <Field int azh.i>
	// 3102 5800:ixor            
	// 3103 5801:putfield        #295 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3104 5804:aload_0         
	// 3105 5805:getfield        #12  <Field azh a>
	// 3106 5808:astore_1        
		abyte0.cb = ((azh) (abyte0)).aQ ^ a.cb;
	// 3107 5809:aload_1         
	// 3108 5810:aload_1         
	// 3109 5811:getfield        #295 <Field int azh.aQ>
	// 3110 5814:aload_0         
	// 3111 5815:getfield        #12  <Field azh a>
	// 3112 5818:getfield        #158 <Field int azh.cb>
	// 3113 5821:ixor            
	// 3114 5822:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 3115 5825:aload_0         
	// 3116 5826:getfield        #12  <Field azh a>
	// 3117 5829:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aq & ~a.G;
	// 3118 5830:aload_1         
	// 3119 5831:aload_1         
	// 3120 5832:getfield        #274 <Field int azh.aq>
	// 3121 5835:aload_0         
	// 3122 5836:getfield        #12  <Field azh a>
	// 3123 5839:getfield        #176 <Field int azh.G>
	// 3124 5842:iconst_m1       
	// 3125 5843:ixor            
	// 3126 5844:iand            
	// 3127 5845:putfield        #295 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3128 5848:aload_0         
	// 3129 5849:getfield        #12  <Field azh a>
	// 3130 5852:astore_1        
		abyte0.bP = ((azh) (abyte0)).aQ ^ a.bP;
	// 3131 5853:aload_1         
	// 3132 5854:aload_1         
	// 3133 5855:getfield        #295 <Field int azh.aQ>
	// 3134 5858:aload_0         
	// 3135 5859:getfield        #12  <Field azh a>
	// 3136 5862:getfield        #62  <Field int azh.bP>
	// 3137 5865:ixor            
	// 3138 5866:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3139 5869:aload_0         
	// 3140 5870:getfield        #12  <Field azh a>
	// 3141 5873:astore_1        
		abyte0.an = ((azh) (abyte0)).bP | a.y;
	// 3142 5874:aload_1         
	// 3143 5875:aload_1         
	// 3144 5876:getfield        #62  <Field int azh.bP>
	// 3145 5879:aload_0         
	// 3146 5880:getfield        #12  <Field azh a>
	// 3147 5883:getfield        #179 <Field int azh.y>
	// 3148 5886:ior             
	// 3149 5887:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3150 5890:aload_0         
	// 3151 5891:getfield        #12  <Field azh a>
	// 3152 5894:astore_1        
		abyte0.an = ((azh) (abyte0)).am ^ a.an;
	// 3153 5895:aload_1         
	// 3154 5896:aload_1         
	// 3155 5897:getfield        #170 <Field int azh.am>
	// 3156 5900:aload_0         
	// 3157 5901:getfield        #12  <Field azh a>
	// 3158 5904:getfield        #286 <Field int azh.an>
	// 3159 5907:ixor            
	// 3160 5908:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3161 5911:aload_0         
	// 3162 5912:getfield        #12  <Field azh a>
	// 3163 5915:astore_1        
		abyte0.an = ((azh) (abyte0)).an & ~a.a;
	// 3164 5916:aload_1         
	// 3165 5917:aload_1         
	// 3166 5918:getfield        #286 <Field int azh.an>
	// 3167 5921:aload_0         
	// 3168 5922:getfield        #12  <Field azh a>
	// 3169 5925:getfield        #196 <Field int azh.a>
	// 3170 5928:iconst_m1       
	// 3171 5929:ixor            
	// 3172 5930:iand            
	// 3173 5931:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3174 5934:aload_0         
	// 3175 5935:getfield        #12  <Field azh a>
	// 3176 5938:astore_1        
		abyte0.bP = ((azh) (abyte0)).bP | a.y;
	// 3177 5939:aload_1         
	// 3178 5940:aload_1         
	// 3179 5941:getfield        #62  <Field int azh.bP>
	// 3180 5944:aload_0         
	// 3181 5945:getfield        #12  <Field azh a>
	// 3182 5948:getfield        #179 <Field int azh.y>
	// 3183 5951:ior             
	// 3184 5952:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3185 5955:aload_0         
	// 3186 5956:getfield        #12  <Field azh a>
	// 3187 5959:astore_1        
		abyte0.bP = ((azh) (abyte0)).ay ^ a.bP;
	// 3188 5960:aload_1         
	// 3189 5961:aload_1         
	// 3190 5962:getfield        #307 <Field int azh.ay>
	// 3191 5965:aload_0         
	// 3192 5966:getfield        #12  <Field azh a>
	// 3193 5969:getfield        #62  <Field int azh.bP>
	// 3194 5972:ixor            
	// 3195 5973:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3196 5976:aload_0         
	// 3197 5977:getfield        #12  <Field azh a>
	// 3198 5980:astore_1        
		abyte0.bY = ((azh) (abyte0)).bP ^ a.bY;
	// 3199 5981:aload_1         
	// 3200 5982:aload_1         
	// 3201 5983:getfield        #62  <Field int azh.bP>
	// 3202 5986:aload_0         
	// 3203 5987:getfield        #12  <Field azh a>
	// 3204 5990:getfield        #167 <Field int azh.bY>
	// 3205 5993:ixor            
	// 3206 5994:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 3207 5997:aload_0         
	// 3208 5998:getfield        #12  <Field azh a>
	// 3209 6001:astore_1        
		abyte0.bP = ((azh) (abyte0)).i & ~a.aq;
	// 3210 6002:aload_1         
	// 3211 6003:aload_1         
	// 3212 6004:getfield        #173 <Field int azh.i>
	// 3213 6007:aload_0         
	// 3214 6008:getfield        #12  <Field azh a>
	// 3215 6011:getfield        #274 <Field int azh.aq>
	// 3216 6014:iconst_m1       
	// 3217 6015:ixor            
	// 3218 6016:iand            
	// 3219 6017:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3220 6020:aload_0         
	// 3221 6021:getfield        #12  <Field azh a>
	// 3222 6024:astore_1        
		abyte0.bP = ((azh) (abyte0)).aq ^ a.bP;
	// 3223 6025:aload_1         
	// 3224 6026:aload_1         
	// 3225 6027:getfield        #274 <Field int azh.aq>
	// 3226 6030:aload_0         
	// 3227 6031:getfield        #12  <Field azh a>
	// 3228 6034:getfield        #62  <Field int azh.bP>
	// 3229 6037:ixor            
	// 3230 6038:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3231 6041:aload_0         
	// 3232 6042:getfield        #12  <Field azh a>
	// 3233 6045:astore_1        
		abyte0.bP = ((azh) (abyte0)).y & ~a.bP;
	// 3234 6046:aload_1         
	// 3235 6047:aload_1         
	// 3236 6048:getfield        #179 <Field int azh.y>
	// 3237 6051:aload_0         
	// 3238 6052:getfield        #12  <Field azh a>
	// 3239 6055:getfield        #62  <Field int azh.bP>
	// 3240 6058:iconst_m1       
	// 3241 6059:ixor            
	// 3242 6060:iand            
	// 3243 6061:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3244 6064:aload_0         
	// 3245 6065:getfield        #12  <Field azh a>
	// 3246 6068:astore_1        
		abyte0.bP = ((azh) (abyte0)).ce ^ a.bP;
	// 3247 6069:aload_1         
	// 3248 6070:aload_1         
	// 3249 6071:getfield        #29  <Field int azh.ce>
	// 3250 6074:aload_0         
	// 3251 6075:getfield        #12  <Field azh a>
	// 3252 6078:getfield        #62  <Field int azh.bP>
	// 3253 6081:ixor            
	// 3254 6082:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3255 6085:aload_0         
	// 3256 6086:getfield        #12  <Field azh a>
	// 3257 6089:astore_1        
		abyte0.bO = ((azh) (abyte0)).bP ^ a.bO;
	// 3258 6090:aload_1         
	// 3259 6091:aload_1         
	// 3260 6092:getfield        #62  <Field int azh.bP>
	// 3261 6095:aload_0         
	// 3262 6096:getfield        #12  <Field azh a>
	// 3263 6099:getfield        #316 <Field int azh.bO>
	// 3264 6102:ixor            
	// 3265 6103:putfield        #316 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3266 6106:aload_0         
	// 3267 6107:getfield        #12  <Field azh a>
	// 3268 6110:astore_1        
		abyte0.bP = ((azh) (abyte0)).q ^ a.G;
	// 3269 6111:aload_1         
	// 3270 6112:aload_1         
	// 3271 6113:getfield        #331 <Field int azh.q>
	// 3272 6116:aload_0         
	// 3273 6117:getfield        #12  <Field azh a>
	// 3274 6120:getfield        #176 <Field int azh.G>
	// 3275 6123:ixor            
	// 3276 6124:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3277 6127:aload_0         
	// 3278 6128:getfield        #12  <Field azh a>
	// 3279 6131:astore_1        
		abyte0.ce = ((azh) (abyte0)).i & a.bP;
	// 3280 6132:aload_1         
	// 3281 6133:aload_1         
	// 3282 6134:getfield        #173 <Field int azh.i>
	// 3283 6137:aload_0         
	// 3284 6138:getfield        #12  <Field azh a>
	// 3285 6141:getfield        #62  <Field int azh.bP>
	// 3286 6144:iand            
	// 3287 6145:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 3288 6148:aload_0         
	// 3289 6149:getfield        #12  <Field azh a>
	// 3290 6152:astore_1        
		abyte0.ce = ((azh) (abyte0)).aQ ^ a.ce;
	// 3291 6153:aload_1         
	// 3292 6154:aload_1         
	// 3293 6155:getfield        #295 <Field int azh.aQ>
	// 3294 6158:aload_0         
	// 3295 6159:getfield        #12  <Field azh a>
	// 3296 6162:getfield        #29  <Field int azh.ce>
	// 3297 6165:ixor            
	// 3298 6166:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 3299 6169:aload_0         
	// 3300 6170:getfield        #12  <Field azh a>
	// 3301 6173:astore_1        
		abyte0.aB = ((azh) (abyte0)).ce ^ a.aB;
	// 3302 6174:aload_1         
	// 3303 6175:aload_1         
	// 3304 6176:getfield        #29  <Field int azh.ce>
	// 3305 6179:aload_0         
	// 3306 6180:getfield        #12  <Field azh a>
	// 3307 6183:getfield        #313 <Field int azh.aB>
	// 3308 6186:ixor            
	// 3309 6187:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3310 6190:aload_0         
	// 3311 6191:getfield        #12  <Field azh a>
	// 3312 6194:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB & ~a.a;
	// 3313 6195:aload_1         
	// 3314 6196:aload_1         
	// 3315 6197:getfield        #313 <Field int azh.aB>
	// 3316 6200:aload_0         
	// 3317 6201:getfield        #12  <Field azh a>
	// 3318 6204:getfield        #196 <Field int azh.a>
	// 3319 6207:iconst_m1       
	// 3320 6208:ixor            
	// 3321 6209:iand            
	// 3322 6210:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3323 6213:aload_0         
	// 3324 6214:getfield        #12  <Field azh a>
	// 3325 6217:astore_1        
		abyte0.aB = ((azh) (abyte0)).by ^ a.aB;
	// 3326 6218:aload_1         
	// 3327 6219:aload_1         
	// 3328 6220:getfield        #301 <Field int azh.by>
	// 3329 6223:aload_0         
	// 3330 6224:getfield        #12  <Field azh a>
	// 3331 6227:getfield        #313 <Field int azh.aB>
	// 3332 6230:ixor            
	// 3333 6231:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3334 6234:aload_0         
	// 3335 6235:getfield        #12  <Field azh a>
	// 3336 6238:astore_1        
		abyte0.at = ((azh) (abyte0)).bP ^ a.at;
	// 3337 6239:aload_1         
	// 3338 6240:aload_1         
	// 3339 6241:getfield        #62  <Field int azh.bP>
	// 3340 6244:aload_0         
	// 3341 6245:getfield        #12  <Field azh a>
	// 3342 6248:getfield        #322 <Field int azh.at>
	// 3343 6251:ixor            
	// 3344 6252:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 3345 6255:aload_0         
	// 3346 6256:getfield        #12  <Field azh a>
	// 3347 6259:astore_1        
		abyte0.bF = ((azh) (abyte0)).at ^ a.bF;
	// 3348 6260:aload_1         
	// 3349 6261:aload_1         
	// 3350 6262:getfield        #322 <Field int azh.at>
	// 3351 6265:aload_0         
	// 3352 6266:getfield        #12  <Field azh a>
	// 3353 6269:getfield        #89  <Field int azh.bF>
	// 3354 6272:ixor            
	// 3355 6273:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 3356 6276:aload_0         
	// 3357 6277:getfield        #12  <Field azh a>
	// 3358 6280:astore_1        
		abyte0.bR = ((azh) (abyte0)).bP ^ a.bR;
	// 3359 6281:aload_1         
	// 3360 6282:aload_1         
	// 3361 6283:getfield        #62  <Field int azh.bP>
	// 3362 6286:aload_0         
	// 3363 6287:getfield        #12  <Field azh a>
	// 3364 6290:getfield        #74  <Field int azh.bR>
	// 3365 6293:ixor            
	// 3366 6294:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3367 6297:aload_0         
	// 3368 6298:getfield        #12  <Field azh a>
	// 3369 6301:astore_1        
		abyte0.bR = ((azh) (abyte0)).a | a.bR;
	// 3370 6302:aload_1         
	// 3371 6303:aload_1         
	// 3372 6304:getfield        #196 <Field int azh.a>
	// 3373 6307:aload_0         
	// 3374 6308:getfield        #12  <Field azh a>
	// 3375 6311:getfield        #74  <Field int azh.bR>
	// 3376 6314:ior             
	// 3377 6315:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3378 6318:aload_0         
	// 3379 6319:getfield        #12  <Field azh a>
	// 3380 6322:astore_1        
		abyte0.bR = ((azh) (abyte0)).cb ^ a.bR;
	// 3381 6323:aload_1         
	// 3382 6324:aload_1         
	// 3383 6325:getfield        #158 <Field int azh.cb>
	// 3384 6328:aload_0         
	// 3385 6329:getfield        #12  <Field azh a>
	// 3386 6332:getfield        #74  <Field int azh.bR>
	// 3387 6335:ixor            
	// 3388 6336:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3389 6339:aload_0         
	// 3390 6340:getfield        #12  <Field azh a>
	// 3391 6343:astore_1        
		abyte0.ar = ((azh) (abyte0)).bP ^ a.ar;
	// 3392 6344:aload_1         
	// 3393 6345:aload_1         
	// 3394 6346:getfield        #62  <Field int azh.bP>
	// 3395 6349:aload_0         
	// 3396 6350:getfield        #12  <Field azh a>
	// 3397 6353:getfield        #328 <Field int azh.ar>
	// 3398 6356:ixor            
	// 3399 6357:putfield        #328 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3400 6360:aload_0         
	// 3401 6361:getfield        #12  <Field azh a>
	// 3402 6364:astore_1        
		abyte0.ar = ((azh) (abyte0)).y & a.ar;
	// 3403 6365:aload_1         
	// 3404 6366:aload_1         
	// 3405 6367:getfield        #179 <Field int azh.y>
	// 3406 6370:aload_0         
	// 3407 6371:getfield        #12  <Field azh a>
	// 3408 6374:getfield        #328 <Field int azh.ar>
	// 3409 6377:iand            
	// 3410 6378:putfield        #328 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3411 6381:aload_0         
	// 3412 6382:getfield        #12  <Field azh a>
	// 3413 6385:astore_1        
		abyte0.ar = ((azh) (abyte0)).as ^ a.ar;
	// 3414 6386:aload_1         
	// 3415 6387:aload_1         
	// 3416 6388:getfield        #92  <Field int azh.as>
	// 3417 6391:aload_0         
	// 3418 6392:getfield        #12  <Field azh a>
	// 3419 6395:getfield        #328 <Field int azh.ar>
	// 3420 6398:ixor            
	// 3421 6399:putfield        #328 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3422 6402:aload_0         
	// 3423 6403:getfield        #12  <Field azh a>
	// 3424 6406:astore_1        
		abyte0.an = ((azh) (abyte0)).ar ^ a.an;
	// 3425 6407:aload_1         
	// 3426 6408:aload_1         
	// 3427 6409:getfield        #328 <Field int azh.ar>
	// 3428 6412:aload_0         
	// 3429 6413:getfield        #12  <Field azh a>
	// 3430 6416:getfield        #286 <Field int azh.an>
	// 3431 6419:ixor            
	// 3432 6420:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3433 6423:aload_0         
	// 3434 6424:getfield        #12  <Field azh a>
	// 3435 6427:astore_1        
		abyte0.bl = ((azh) (abyte0)).L & a.bl;
	// 3436 6428:aload_1         
	// 3437 6429:aload_1         
	// 3438 6430:getfield        #271 <Field int azh.L>
	// 3439 6433:aload_0         
	// 3440 6434:getfield        #12  <Field azh a>
	// 3441 6437:getfield        #334 <Field int azh.bl>
	// 3442 6440:iand            
	// 3443 6441:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 3444 6444:aload_0         
	// 3445 6445:getfield        #12  <Field azh a>
	// 3446 6448:astore_1        
		abyte0.bl = ((azh) (abyte0)).bB ^ a.bl;
	// 3447 6449:aload_1         
	// 3448 6450:aload_1         
	// 3449 6451:getfield        #337 <Field int azh.bB>
	// 3450 6454:aload_0         
	// 3451 6455:getfield        #12  <Field azh a>
	// 3452 6458:getfield        #334 <Field int azh.bl>
	// 3453 6461:ixor            
	// 3454 6462:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 3455 6465:aload_0         
	// 3456 6466:getfield        #12  <Field azh a>
	// 3457 6469:astore_1        
		abyte0.ax = ((azh) (abyte0)).bl ^ a.ax;
	// 3458 6470:aload_1         
	// 3459 6471:aload_1         
	// 3460 6472:getfield        #334 <Field int azh.bl>
	// 3461 6475:aload_0         
	// 3462 6476:getfield        #12  <Field azh a>
	// 3463 6479:getfield        #283 <Field int azh.ax>
	// 3464 6482:ixor            
	// 3465 6483:putfield        #283 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3466 6486:aload_0         
	// 3467 6487:getfield        #12  <Field azh a>
	// 3468 6490:astore_1        
		abyte0.bo = ((azh) (abyte0)).L & ~a.bo;
	// 3469 6491:aload_1         
	// 3470 6492:aload_1         
	// 3471 6493:getfield        #271 <Field int azh.L>
	// 3472 6496:aload_0         
	// 3473 6497:getfield        #12  <Field azh a>
	// 3474 6500:getfield        #310 <Field int azh.bo>
	// 3475 6503:iconst_m1       
	// 3476 6504:ixor            
	// 3477 6505:iand            
	// 3478 6506:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3479 6509:aload_0         
	// 3480 6510:getfield        #12  <Field azh a>
	// 3481 6513:astore_1        
		abyte0.bo = ((azh) (abyte0)).bD ^ a.bo;
	// 3482 6514:aload_1         
	// 3483 6515:aload_1         
	// 3484 6516:getfield        #340 <Field int azh.bD>
	// 3485 6519:aload_0         
	// 3486 6520:getfield        #12  <Field azh a>
	// 3487 6523:getfield        #310 <Field int azh.bo>
	// 3488 6526:ixor            
	// 3489 6527:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3490 6530:aload_0         
	// 3491 6531:getfield        #12  <Field azh a>
	// 3492 6534:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo | a.bA;
	// 3493 6535:aload_1         
	// 3494 6536:aload_1         
	// 3495 6537:getfield        #310 <Field int azh.bo>
	// 3496 6540:aload_0         
	// 3497 6541:getfield        #12  <Field azh a>
	// 3498 6544:getfield        #289 <Field int azh.bA>
	// 3499 6547:ior             
	// 3500 6548:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3501 6551:aload_0         
	// 3502 6552:getfield        #12  <Field azh a>
	// 3503 6555:astore_1        
		abyte0.bd = ((azh) (abyte0)).L & ~a.bd;
	// 3504 6556:aload_1         
	// 3505 6557:aload_1         
	// 3506 6558:getfield        #271 <Field int azh.L>
	// 3507 6561:aload_0         
	// 3508 6562:getfield        #12  <Field azh a>
	// 3509 6565:getfield        #343 <Field int azh.bd>
	// 3510 6568:iconst_m1       
	// 3511 6569:ixor            
	// 3512 6570:iand            
	// 3513 6571:putfield        #343 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3514 6574:aload_0         
	// 3515 6575:getfield        #12  <Field azh a>
	// 3516 6578:astore_1        
		abyte0.bd = ((azh) (abyte0)).bk ^ a.bd;
	// 3517 6579:aload_1         
	// 3518 6580:aload_1         
	// 3519 6581:getfield        #346 <Field int azh.bk>
	// 3520 6584:aload_0         
	// 3521 6585:getfield        #12  <Field azh a>
	// 3522 6588:getfield        #343 <Field int azh.bd>
	// 3523 6591:ixor            
	// 3524 6592:putfield        #343 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3525 6595:aload_0         
	// 3526 6596:getfield        #12  <Field azh a>
	// 3527 6599:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd & ~a.aj;
	// 3528 6600:aload_1         
	// 3529 6601:aload_1         
	// 3530 6602:getfield        #343 <Field int azh.bd>
	// 3531 6605:aload_0         
	// 3532 6606:getfield        #12  <Field azh a>
	// 3533 6609:getfield        #280 <Field int azh.aj>
	// 3534 6612:iconst_m1       
	// 3535 6613:ixor            
	// 3536 6614:iand            
	// 3537 6615:putfield        #343 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3538 6618:aload_0         
	// 3539 6619:getfield        #12  <Field azh a>
	// 3540 6622:astore_1        
		abyte0.bd = ((azh) (abyte0)).aA ^ a.bd;
	// 3541 6623:aload_1         
	// 3542 6624:aload_1         
	// 3543 6625:getfield        #298 <Field int azh.aA>
	// 3544 6628:aload_0         
	// 3545 6629:getfield        #12  <Field azh a>
	// 3546 6632:getfield        #343 <Field int azh.bd>
	// 3547 6635:ixor            
	// 3548 6636:putfield        #343 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3549 6639:aload_0         
	// 3550 6640:getfield        #12  <Field azh a>
	// 3551 6643:astore_1        
		abyte0.w = ((azh) (abyte0)).bd ^ a.w;
	// 3552 6644:aload_1         
	// 3553 6645:aload_1         
	// 3554 6646:getfield        #343 <Field int azh.bd>
	// 3555 6649:aload_0         
	// 3556 6650:getfield        #12  <Field azh a>
	// 3557 6653:getfield        #349 <Field int azh.w>
	// 3558 6656:ixor            
	// 3559 6657:putfield        #349 <Field int azh.w>
		abyte0 = ((byte []) (a));
	// 3560 6660:aload_0         
	// 3561 6661:getfield        #12  <Field azh a>
	// 3562 6664:astore_1        
		abyte0.bh = ((azh) (abyte0)).w & ~a.bh;
	// 3563 6665:aload_1         
	// 3564 6666:aload_1         
	// 3565 6667:getfield        #349 <Field int azh.w>
	// 3566 6670:aload_0         
	// 3567 6671:getfield        #12  <Field azh a>
	// 3568 6674:getfield        #122 <Field int azh.bh>
	// 3569 6677:iconst_m1       
	// 3570 6678:ixor            
	// 3571 6679:iand            
	// 3572 6680:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3573 6683:aload_0         
	// 3574 6684:getfield        #12  <Field azh a>
	// 3575 6687:astore_1        
		abyte0.bh = ((azh) (abyte0)).bg ^ a.bh;
	// 3576 6688:aload_1         
	// 3577 6689:aload_1         
	// 3578 6690:getfield        #143 <Field int azh.bg>
	// 3579 6693:aload_0         
	// 3580 6694:getfield        #12  <Field azh a>
	// 3581 6697:getfield        #122 <Field int azh.bh>
	// 3582 6700:ixor            
	// 3583 6701:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3584 6704:aload_0         
	// 3585 6705:getfield        #12  <Field azh a>
	// 3586 6708:astore_1        
		abyte0.D = ((azh) (abyte0)).bh ^ a.D;
	// 3587 6709:aload_1         
	// 3588 6710:aload_1         
	// 3589 6711:getfield        #122 <Field int azh.bh>
	// 3590 6714:aload_0         
	// 3591 6715:getfield        #12  <Field azh a>
	// 3592 6718:getfield        #352 <Field int azh.D>
	// 3593 6721:ixor            
	// 3594 6722:putfield        #352 <Field int azh.D>
		abyte0 = ((byte []) (a));
	// 3595 6725:aload_0         
	// 3596 6726:getfield        #12  <Field azh a>
	// 3597 6729:astore_1        
		abyte0.aL = ((azh) (abyte0)).aL & a.w;
	// 3598 6730:aload_1         
	// 3599 6731:aload_1         
	// 3600 6732:getfield        #110 <Field int azh.aL>
	// 3601 6735:aload_0         
	// 3602 6736:getfield        #12  <Field azh a>
	// 3603 6739:getfield        #349 <Field int azh.w>
	// 3604 6742:iand            
	// 3605 6743:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3606 6746:aload_0         
	// 3607 6747:getfield        #12  <Field azh a>
	// 3608 6750:astore_1        
		abyte0.aL = ((azh) (abyte0)).bU ^ a.aL;
	// 3609 6751:aload_1         
	// 3610 6752:aload_1         
	// 3611 6753:getfield        #41  <Field int azh.bU>
	// 3612 6756:aload_0         
	// 3613 6757:getfield        #12  <Field azh a>
	// 3614 6760:getfield        #110 <Field int azh.aL>
	// 3615 6763:ixor            
	// 3616 6764:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3617 6767:aload_0         
	// 3618 6768:getfield        #12  <Field azh a>
	// 3619 6771:astore_1        
		abyte0.H = ((azh) (abyte0)).aL ^ a.H;
	// 3620 6772:aload_1         
	// 3621 6773:aload_1         
	// 3622 6774:getfield        #110 <Field int azh.aL>
	// 3623 6777:aload_0         
	// 3624 6778:getfield        #12  <Field azh a>
	// 3625 6781:getfield        #235 <Field int azh.H>
	// 3626 6784:ixor            
	// 3627 6785:putfield        #235 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 3628 6788:aload_0         
	// 3629 6789:getfield        #12  <Field azh a>
	// 3630 6792:astore_1        
		abyte0.bC = ((azh) (abyte0)).w & ~a.bC;
	// 3631 6793:aload_1         
	// 3632 6794:aload_1         
	// 3633 6795:getfield        #349 <Field int azh.w>
	// 3634 6798:aload_0         
	// 3635 6799:getfield        #12  <Field azh a>
	// 3636 6802:getfield        #134 <Field int azh.bC>
	// 3637 6805:iconst_m1       
	// 3638 6806:ixor            
	// 3639 6807:iand            
	// 3640 6808:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 3641 6811:aload_0         
	// 3642 6812:getfield        #12  <Field azh a>
	// 3643 6815:astore_1        
		abyte0.bC = ((azh) (abyte0)).bI ^ a.bC;
	// 3644 6816:aload_1         
	// 3645 6817:aload_1         
	// 3646 6818:getfield        #65  <Field int azh.bI>
	// 3647 6821:aload_0         
	// 3648 6822:getfield        #12  <Field azh a>
	// 3649 6825:getfield        #134 <Field int azh.bC>
	// 3650 6828:ixor            
	// 3651 6829:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 3652 6832:aload_0         
	// 3653 6833:getfield        #12  <Field azh a>
	// 3654 6836:astore_1        
		abyte0.Z = ((azh) (abyte0)).bC ^ a.Z;
	// 3655 6837:aload_1         
	// 3656 6838:aload_1         
	// 3657 6839:getfield        #134 <Field int azh.bC>
	// 3658 6842:aload_0         
	// 3659 6843:getfield        #12  <Field azh a>
	// 3660 6846:getfield        #355 <Field int azh.Z>
	// 3661 6849:ixor            
	// 3662 6850:putfield        #355 <Field int azh.Z>
		abyte0 = ((byte []) (a));
	// 3663 6853:aload_0         
	// 3664 6854:getfield        #12  <Field azh a>
	// 3665 6857:astore_1        
		abyte0.cf = ((azh) (abyte0)).w & ~a.cf;
	// 3666 6858:aload_1         
	// 3667 6859:aload_1         
	// 3668 6860:getfield        #349 <Field int azh.w>
	// 3669 6863:aload_0         
	// 3670 6864:getfield        #12  <Field azh a>
	// 3671 6867:getfield        #128 <Field int azh.cf>
	// 3672 6870:iconst_m1       
	// 3673 6871:ixor            
	// 3674 6872:iand            
	// 3675 6873:putfield        #128 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 3676 6876:aload_0         
	// 3677 6877:getfield        #12  <Field azh a>
	// 3678 6880:astore_1        
		abyte0.cf = ((azh) (abyte0)).bZ ^ a.cf;
	// 3679 6881:aload_1         
	// 3680 6882:aload_1         
	// 3681 6883:getfield        #59  <Field int azh.bZ>
	// 3682 6886:aload_0         
	// 3683 6887:getfield        #12  <Field azh a>
	// 3684 6890:getfield        #128 <Field int azh.cf>
	// 3685 6893:ixor            
	// 3686 6894:putfield        #128 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 3687 6897:aload_0         
	// 3688 6898:getfield        #12  <Field azh a>
	// 3689 6901:astore_1        
		abyte0.ad = ((azh) (abyte0)).cf ^ a.ad;
	// 3690 6902:aload_1         
	// 3691 6903:aload_1         
	// 3692 6904:getfield        #128 <Field int azh.cf>
	// 3693 6907:aload_0         
	// 3694 6908:getfield        #12  <Field azh a>
	// 3695 6911:getfield        #47  <Field int azh.ad>
	// 3696 6914:ixor            
	// 3697 6915:putfield        #47  <Field int azh.ad>
		abyte0 = ((byte []) (a));
	// 3698 6918:aload_0         
	// 3699 6919:getfield        #12  <Field azh a>
	// 3700 6922:astore_1        
		abyte0.bn = ((azh) (abyte0)).L & ~a.bn;
	// 3701 6923:aload_1         
	// 3702 6924:aload_1         
	// 3703 6925:getfield        #271 <Field int azh.L>
	// 3704 6928:aload_0         
	// 3705 6929:getfield        #12  <Field azh a>
	// 3706 6932:getfield        #358 <Field int azh.bn>
	// 3707 6935:iconst_m1       
	// 3708 6936:ixor            
	// 3709 6937:iand            
	// 3710 6938:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 3711 6941:aload_0         
	// 3712 6942:getfield        #12  <Field azh a>
	// 3713 6945:astore_1        
		abyte0.bn = ((azh) (abyte0)).bM ^ a.bn;
	// 3714 6946:aload_1         
	// 3715 6947:aload_1         
	// 3716 6948:getfield        #361 <Field int azh.bM>
	// 3717 6951:aload_0         
	// 3718 6952:getfield        #12  <Field azh a>
	// 3719 6955:getfield        #358 <Field int azh.bn>
	// 3720 6958:ixor            
	// 3721 6959:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 3722 6962:aload_0         
	// 3723 6963:getfield        #12  <Field azh a>
	// 3724 6966:astore_1        
		abyte0.bo = ((azh) (abyte0)).bn ^ a.bo;
	// 3725 6967:aload_1         
	// 3726 6968:aload_1         
	// 3727 6969:getfield        #358 <Field int azh.bn>
	// 3728 6972:aload_0         
	// 3729 6973:getfield        #12  <Field azh a>
	// 3730 6976:getfield        #310 <Field int azh.bo>
	// 3731 6979:ixor            
	// 3732 6980:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 3733 6983:aload_0         
	// 3734 6984:getfield        #12  <Field azh a>
	// 3735 6987:astore_1        
		abyte0.bn = ((azh) (abyte0)).ah & a.bo;
	// 3736 6988:aload_1         
	// 3737 6989:aload_1         
	// 3738 6990:getfield        #364 <Field int azh.ah>
	// 3739 6993:aload_0         
	// 3740 6994:getfield        #12  <Field azh a>
	// 3741 6997:getfield        #310 <Field int azh.bo>
	// 3742 7000:iand            
	// 3743 7001:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 3744 7004:aload_0         
	// 3745 7005:getfield        #12  <Field azh a>
	// 3746 7008:astore_1        
		abyte0.bn = ((azh) (abyte0)).ax ^ a.bn;
	// 3747 7009:aload_1         
	// 3748 7010:aload_1         
	// 3749 7011:getfield        #283 <Field int azh.ax>
	// 3750 7014:aload_0         
	// 3751 7015:getfield        #12  <Field azh a>
	// 3752 7018:getfield        #358 <Field int azh.bn>
	// 3753 7021:ixor            
	// 3754 7022:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 3755 7025:aload_0         
	// 3756 7026:getfield        #12  <Field azh a>
	// 3757 7029:astore_1        
		abyte0.ak = ((azh) (abyte0)).bn ^ a.ak;
	// 3758 7030:aload_1         
	// 3759 7031:aload_1         
	// 3760 7032:getfield        #358 <Field int azh.bn>
	// 3761 7035:aload_0         
	// 3762 7036:getfield        #12  <Field azh a>
	// 3763 7039:getfield        #367 <Field int azh.ak>
	// 3764 7042:ixor            
	// 3765 7043:putfield        #367 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 3766 7046:aload_0         
	// 3767 7047:getfield        #12  <Field azh a>
	// 3768 7050:astore_1        
		abyte0.bn = ((azh) (abyte0)).ch & ~a.ak;
	// 3769 7051:aload_1         
	// 3770 7052:aload_1         
	// 3771 7053:getfield        #217 <Field int azh.ch>
	// 3772 7056:aload_0         
	// 3773 7057:getfield        #12  <Field azh a>
	// 3774 7060:getfield        #367 <Field int azh.ak>
	// 3775 7063:iconst_m1       
	// 3776 7064:ixor            
	// 3777 7065:iand            
	// 3778 7066:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 3779 7069:aload_0         
	// 3780 7070:getfield        #12  <Field azh a>
	// 3781 7073:astore_1        
		abyte0.bn = ((azh) (abyte0)).ao ^ a.bn;
	// 3782 7074:aload_1         
	// 3783 7075:aload_1         
	// 3784 7076:getfield        #146 <Field int azh.ao>
	// 3785 7079:aload_0         
	// 3786 7080:getfield        #12  <Field azh a>
	// 3787 7083:getfield        #358 <Field int azh.bn>
	// 3788 7086:ixor            
	// 3789 7087:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 3790 7090:aload_0         
	// 3791 7091:getfield        #12  <Field azh a>
	// 3792 7094:astore_1        
		abyte0.bn = ((azh) (abyte0)).M & ~a.bn;
	// 3793 7095:aload_1         
	// 3794 7096:aload_1         
	// 3795 7097:getfield        #125 <Field int azh.M>
	// 3796 7100:aload_0         
	// 3797 7101:getfield        #12  <Field azh a>
	// 3798 7104:getfield        #358 <Field int azh.bn>
	// 3799 7107:iconst_m1       
	// 3800 7108:ixor            
	// 3801 7109:iand            
	// 3802 7110:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 3803 7113:aload_0         
	// 3804 7114:getfield        #12  <Field azh a>
	// 3805 7117:astore_1        
		abyte0.ao = ((azh) (abyte0)).bq & ~a.ak;
	// 3806 7118:aload_1         
	// 3807 7119:aload_1         
	// 3808 7120:getfield        #26  <Field int azh.bq>
	// 3809 7123:aload_0         
	// 3810 7124:getfield        #12  <Field azh a>
	// 3811 7127:getfield        #367 <Field int azh.ak>
	// 3812 7130:iconst_m1       
	// 3813 7131:ixor            
	// 3814 7132:iand            
	// 3815 7133:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 3816 7136:aload_0         
	// 3817 7137:getfield        #12  <Field azh a>
	// 3818 7140:astore_1        
		abyte0.ao = ((azh) (abyte0)).bG ^ a.ao;
	// 3819 7141:aload_1         
	// 3820 7142:aload_1         
	// 3821 7143:getfield        #155 <Field int azh.bG>
	// 3822 7146:aload_0         
	// 3823 7147:getfield        #12  <Field azh a>
	// 3824 7150:getfield        #146 <Field int azh.ao>
	// 3825 7153:ixor            
	// 3826 7154:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 3827 7157:aload_0         
	// 3828 7158:getfield        #12  <Field azh a>
	// 3829 7161:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & ~a.ak;
	// 3830 7162:aload_1         
	// 3831 7163:aload_1         
	// 3832 7164:getfield        #137 <Field int azh.aT>
	// 3833 7167:aload_0         
	// 3834 7168:getfield        #12  <Field azh a>
	// 3835 7171:getfield        #367 <Field int azh.ak>
	// 3836 7174:iconst_m1       
	// 3837 7175:ixor            
	// 3838 7176:iand            
	// 3839 7177:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3840 7180:aload_0         
	// 3841 7181:getfield        #12  <Field azh a>
	// 3842 7184:astore_1        
		abyte0.aT = ((azh) (abyte0)).aN ^ a.aT;
	// 3843 7185:aload_1         
	// 3844 7186:aload_1         
	// 3845 7187:getfield        #107 <Field int azh.aN>
	// 3846 7190:aload_0         
	// 3847 7191:getfield        #12  <Field azh a>
	// 3848 7194:getfield        #137 <Field int azh.aT>
	// 3849 7197:ixor            
	// 3850 7198:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3851 7201:aload_0         
	// 3852 7202:getfield        #12  <Field azh a>
	// 3853 7205:astore_1        
		abyte0.aT = ((azh) (abyte0)).M & ~a.aT;
	// 3854 7206:aload_1         
	// 3855 7207:aload_1         
	// 3856 7208:getfield        #125 <Field int azh.M>
	// 3857 7211:aload_0         
	// 3858 7212:getfield        #12  <Field azh a>
	// 3859 7215:getfield        #137 <Field int azh.aT>
	// 3860 7218:iconst_m1       
	// 3861 7219:ixor            
	// 3862 7220:iand            
	// 3863 7221:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3864 7224:aload_0         
	// 3865 7225:getfield        #12  <Field azh a>
	// 3866 7228:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aJ & ~a.ak;
	// 3867 7229:aload_1         
	// 3868 7230:aload_1         
	// 3869 7231:getfield        #211 <Field int azh.aJ>
	// 3870 7234:aload_0         
	// 3871 7235:getfield        #12  <Field azh a>
	// 3872 7238:getfield        #367 <Field int azh.ak>
	// 3873 7241:iconst_m1       
	// 3874 7242:ixor            
	// 3875 7243:iand            
	// 3876 7244:putfield        #211 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 3877 7247:aload_0         
	// 3878 7248:getfield        #12  <Field azh a>
	// 3879 7251:astore_1        
		abyte0.aJ = ((azh) (abyte0)).bq ^ a.aJ;
	// 3880 7252:aload_1         
	// 3881 7253:aload_1         
	// 3882 7254:getfield        #26  <Field int azh.bq>
	// 3883 7257:aload_0         
	// 3884 7258:getfield        #12  <Field azh a>
	// 3885 7261:getfield        #211 <Field int azh.aJ>
	// 3886 7264:ixor            
	// 3887 7265:putfield        #211 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 3888 7268:aload_0         
	// 3889 7269:getfield        #12  <Field azh a>
	// 3890 7272:astore_1        
		abyte0.aN = ((azh) (abyte0)).ak & ~a.bp;
	// 3891 7273:aload_1         
	// 3892 7274:aload_1         
	// 3893 7275:getfield        #367 <Field int azh.ak>
	// 3894 7278:aload_0         
	// 3895 7279:getfield        #12  <Field azh a>
	// 3896 7282:getfield        #205 <Field int azh.bp>
	// 3897 7285:iconst_m1       
	// 3898 7286:ixor            
	// 3899 7287:iand            
	// 3900 7288:putfield        #107 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3901 7291:aload_0         
	// 3902 7292:getfield        #12  <Field azh a>
	// 3903 7295:astore_1        
		abyte0.aN = ((azh) (abyte0)).br ^ a.aN;
	// 3904 7296:aload_1         
	// 3905 7297:aload_1         
	// 3906 7298:getfield        #38  <Field int azh.br>
	// 3907 7301:aload_0         
	// 3908 7302:getfield        #12  <Field azh a>
	// 3909 7305:getfield        #107 <Field int azh.aN>
	// 3910 7308:ixor            
	// 3911 7309:putfield        #107 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 3912 7312:aload_0         
	// 3913 7313:getfield        #12  <Field azh a>
	// 3914 7316:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.ak;
	// 3915 7317:aload_1         
	// 3916 7318:aload_1         
	// 3917 7319:getfield        #188 <Field int azh.bV>
	// 3918 7322:aload_0         
	// 3919 7323:getfield        #12  <Field azh a>
	// 3920 7326:getfield        #367 <Field int azh.ak>
	// 3921 7329:iconst_m1       
	// 3922 7330:ixor            
	// 3923 7331:iand            
	// 3924 7332:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3925 7335:aload_0         
	// 3926 7336:getfield        #12  <Field azh a>
	// 3927 7339:astore_1        
		abyte0.bV = ((azh) (abyte0)).E ^ a.bV;
	// 3928 7340:aload_1         
	// 3929 7341:aload_1         
	// 3930 7342:getfield        #191 <Field int azh.E>
	// 3931 7345:aload_0         
	// 3932 7346:getfield        #12  <Field azh a>
	// 3933 7349:getfield        #188 <Field int azh.bV>
	// 3934 7352:ixor            
	// 3935 7353:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3936 7356:aload_0         
	// 3937 7357:getfield        #12  <Field azh a>
	// 3938 7360:astore_1        
		abyte0.aT = ((azh) (abyte0)).bV ^ a.aT;
	// 3939 7361:aload_1         
	// 3940 7362:aload_1         
	// 3941 7363:getfield        #188 <Field int azh.bV>
	// 3942 7366:aload_0         
	// 3943 7367:getfield        #12  <Field azh a>
	// 3944 7370:getfield        #137 <Field int azh.aT>
	// 3945 7373:ixor            
	// 3946 7374:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3947 7377:aload_0         
	// 3948 7378:getfield        #12  <Field azh a>
	// 3949 7381:astore_1        
		abyte0.aT = ((azh) (abyte0)).U | a.aT;
	// 3950 7382:aload_1         
	// 3951 7383:aload_1         
	// 3952 7384:getfield        #370 <Field int azh.U>
	// 3953 7387:aload_0         
	// 3954 7388:getfield        #12  <Field azh a>
	// 3955 7391:getfield        #137 <Field int azh.aT>
	// 3956 7394:ior             
	// 3957 7395:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3958 7398:aload_0         
	// 3959 7399:getfield        #12  <Field azh a>
	// 3960 7402:astore_1        
		abyte0.bV = ((azh) (abyte0)).bq & ~a.ak;
	// 3961 7403:aload_1         
	// 3962 7404:aload_1         
	// 3963 7405:getfield        #26  <Field int azh.bq>
	// 3964 7408:aload_0         
	// 3965 7409:getfield        #12  <Field azh a>
	// 3966 7412:getfield        #367 <Field int azh.ak>
	// 3967 7415:iconst_m1       
	// 3968 7416:ixor            
	// 3969 7417:iand            
	// 3970 7418:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3971 7421:aload_0         
	// 3972 7422:getfield        #12  <Field azh a>
	// 3973 7425:astore_1        
		abyte0.bV = ((azh) (abyte0)).ch ^ a.bV;
	// 3974 7426:aload_1         
	// 3975 7427:aload_1         
	// 3976 7428:getfield        #217 <Field int azh.ch>
	// 3977 7431:aload_0         
	// 3978 7432:getfield        #12  <Field azh a>
	// 3979 7435:getfield        #188 <Field int azh.bV>
	// 3980 7438:ixor            
	// 3981 7439:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3982 7442:aload_0         
	// 3983 7443:getfield        #12  <Field azh a>
	// 3984 7446:astore_1        
		abyte0.bV = ((azh) (abyte0)).M & a.bV;
	// 3985 7447:aload_1         
	// 3986 7448:aload_1         
	// 3987 7449:getfield        #125 <Field int azh.M>
	// 3988 7452:aload_0         
	// 3989 7453:getfield        #12  <Field azh a>
	// 3990 7456:getfield        #188 <Field int azh.bV>
	// 3991 7459:iand            
	// 3992 7460:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3993 7463:aload_0         
	// 3994 7464:getfield        #12  <Field azh a>
	// 3995 7467:astore_1        
		abyte0.bL = ((azh) (abyte0)).ak | a.bL;
	// 3996 7468:aload_1         
	// 3997 7469:aload_1         
	// 3998 7470:getfield        #367 <Field int azh.ak>
	// 3999 7473:aload_0         
	// 4000 7474:getfield        #12  <Field azh a>
	// 4001 7477:getfield        #86  <Field int azh.bL>
	// 4002 7480:ior             
	// 4003 7481:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4004 7484:aload_0         
	// 4005 7485:getfield        #12  <Field azh a>
	// 4006 7488:astore_1        
		abyte0.bL = ((azh) (abyte0)).az ^ a.bL;
	// 4007 7489:aload_1         
	// 4008 7490:aload_1         
	// 4009 7491:getfield        #208 <Field int azh.az>
	// 4010 7494:aload_0         
	// 4011 7495:getfield        #12  <Field azh a>
	// 4012 7498:getfield        #86  <Field int azh.bL>
	// 4013 7501:ixor            
	// 4014 7502:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4015 7505:aload_0         
	// 4016 7506:getfield        #12  <Field azh a>
	// 4017 7509:astore_1        
		abyte0.bV = ((azh) (abyte0)).bL ^ a.bV;
	// 4018 7510:aload_1         
	// 4019 7511:aload_1         
	// 4020 7512:getfield        #86  <Field int azh.bL>
	// 4021 7515:aload_0         
	// 4022 7516:getfield        #12  <Field azh a>
	// 4023 7519:getfield        #188 <Field int azh.bV>
	// 4024 7522:ixor            
	// 4025 7523:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4026 7526:aload_0         
	// 4027 7527:getfield        #12  <Field azh a>
	// 4028 7530:astore_1        
		abyte0.aT = ((azh) (abyte0)).bV ^ a.aT;
	// 4029 7531:aload_1         
	// 4030 7532:aload_1         
	// 4031 7533:getfield        #188 <Field int azh.bV>
	// 4032 7536:aload_0         
	// 4033 7537:getfield        #12  <Field azh a>
	// 4034 7540:getfield        #137 <Field int azh.aT>
	// 4035 7543:ixor            
	// 4036 7544:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4037 7547:aload_0         
	// 4038 7548:getfield        #12  <Field azh a>
	// 4039 7551:astore_1        
		abyte0.l = ((azh) (abyte0)).aT ^ a.l;
	// 4040 7552:aload_1         
	// 4041 7553:aload_1         
	// 4042 7554:getfield        #137 <Field int azh.aT>
	// 4043 7557:aload_0         
	// 4044 7558:getfield        #12  <Field azh a>
	// 4045 7561:getfield        #373 <Field int azh.l>
	// 4046 7564:ixor            
	// 4047 7565:putfield        #373 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 4048 7568:aload_0         
	// 4049 7569:getfield        #12  <Field azh a>
	// 4050 7572:astore_1        
		abyte0.an = ((azh) (abyte0)).an & ~a.ak;
	// 4051 7573:aload_1         
	// 4052 7574:aload_1         
	// 4053 7575:getfield        #286 <Field int azh.an>
	// 4054 7578:aload_0         
	// 4055 7579:getfield        #12  <Field azh a>
	// 4056 7582:getfield        #367 <Field int azh.ak>
	// 4057 7585:iconst_m1       
	// 4058 7586:ixor            
	// 4059 7587:iand            
	// 4060 7588:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4061 7591:aload_0         
	// 4062 7592:getfield        #12  <Field azh a>
	// 4063 7595:astore_1        
		abyte0.an = ((azh) (abyte0)).bY ^ a.an;
	// 4064 7596:aload_1         
	// 4065 7597:aload_1         
	// 4066 7598:getfield        #167 <Field int azh.bY>
	// 4067 7601:aload_0         
	// 4068 7602:getfield        #12  <Field azh a>
	// 4069 7605:getfield        #286 <Field int azh.an>
	// 4070 7608:ixor            
	// 4071 7609:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4072 7612:aload_0         
	// 4073 7613:getfield        #12  <Field azh a>
	// 4074 7616:astore_1        
		abyte0.F = ((azh) (abyte0)).an ^ a.F;
	// 4075 7617:aload_1         
	// 4076 7618:aload_1         
	// 4077 7619:getfield        #286 <Field int azh.an>
	// 4078 7622:aload_0         
	// 4079 7623:getfield        #12  <Field azh a>
	// 4080 7626:getfield        #98  <Field int azh.F>
	// 4081 7629:ixor            
	// 4082 7630:putfield        #98  <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 4083 7633:aload_0         
	// 4084 7634:getfield        #12  <Field azh a>
	// 4085 7637:astore_1        
		abyte0.an = ((azh) (abyte0)).F | a.ad;
	// 4086 7638:aload_1         
	// 4087 7639:aload_1         
	// 4088 7640:getfield        #98  <Field int azh.F>
	// 4089 7643:aload_0         
	// 4090 7644:getfield        #12  <Field azh a>
	// 4091 7647:getfield        #47  <Field int azh.ad>
	// 4092 7650:ior             
	// 4093 7651:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4094 7654:aload_0         
	// 4095 7655:getfield        #12  <Field azh a>
	// 4096 7658:astore_1        
		abyte0.aT = ((azh) (abyte0)).an & ~a.ad;
	// 4097 7659:aload_1         
	// 4098 7660:aload_1         
	// 4099 7661:getfield        #286 <Field int azh.an>
	// 4100 7664:aload_0         
	// 4101 7665:getfield        #12  <Field azh a>
	// 4102 7668:getfield        #47  <Field int azh.ad>
	// 4103 7671:iconst_m1       
	// 4104 7672:ixor            
	// 4105 7673:iand            
	// 4106 7674:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4107 7677:aload_0         
	// 4108 7678:getfield        #12  <Field azh a>
	// 4109 7681:astore_1        
		abyte0.bV = ((azh) (abyte0)).ad & a.F;
	// 4110 7682:aload_1         
	// 4111 7683:aload_1         
	// 4112 7684:getfield        #47  <Field int azh.ad>
	// 4113 7687:aload_0         
	// 4114 7688:getfield        #12  <Field azh a>
	// 4115 7691:getfield        #98  <Field int azh.F>
	// 4116 7694:iand            
	// 4117 7695:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4118 7698:aload_0         
	// 4119 7699:getfield        #12  <Field azh a>
	// 4120 7702:astore_1        
		abyte0.bL = ((azh) (abyte0)).ad & ~a.bV;
	// 4121 7703:aload_1         
	// 4122 7704:aload_1         
	// 4123 7705:getfield        #47  <Field int azh.ad>
	// 4124 7708:aload_0         
	// 4125 7709:getfield        #12  <Field azh a>
	// 4126 7712:getfield        #188 <Field int azh.bV>
	// 4127 7715:iconst_m1       
	// 4128 7716:ixor            
	// 4129 7717:iand            
	// 4130 7718:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4131 7721:aload_0         
	// 4132 7722:getfield        #12  <Field azh a>
	// 4133 7725:astore_1        
		abyte0.az = ((azh) (abyte0)).F & ~a.ad;
	// 4134 7726:aload_1         
	// 4135 7727:aload_1         
	// 4136 7728:getfield        #98  <Field int azh.F>
	// 4137 7731:aload_0         
	// 4138 7732:getfield        #12  <Field azh a>
	// 4139 7735:getfield        #47  <Field int azh.ad>
	// 4140 7738:iconst_m1       
	// 4141 7739:ixor            
	// 4142 7740:iand            
	// 4143 7741:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 4144 7744:aload_0         
	// 4145 7745:getfield        #12  <Field azh a>
	// 4146 7748:astore_1        
		abyte0.bG = ((azh) (abyte0)).F ^ a.ad;
	// 4147 7749:aload_1         
	// 4148 7750:aload_1         
	// 4149 7751:getfield        #98  <Field int azh.F>
	// 4150 7754:aload_0         
	// 4151 7755:getfield        #12  <Field azh a>
	// 4152 7758:getfield        #47  <Field int azh.ad>
	// 4153 7761:ixor            
	// 4154 7762:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 4155 7765:aload_0         
	// 4156 7766:getfield        #12  <Field azh a>
	// 4157 7769:astore_1        
		abyte0.bM = ((azh) (abyte0)).ad & ~a.F;
	// 4158 7770:aload_1         
	// 4159 7771:aload_1         
	// 4160 7772:getfield        #47  <Field int azh.ad>
	// 4161 7775:aload_0         
	// 4162 7776:getfield        #12  <Field azh a>
	// 4163 7779:getfield        #98  <Field int azh.F>
	// 4164 7782:iconst_m1       
	// 4165 7783:ixor            
	// 4166 7784:iand            
	// 4167 7785:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4168 7788:aload_0         
	// 4169 7789:getfield        #12  <Field azh a>
	// 4170 7792:astore_1        
		abyte0.aS = ((azh) (abyte0)).aS & ~a.ak;
	// 4171 7793:aload_1         
	// 4172 7794:aload_1         
	// 4173 7795:getfield        #214 <Field int azh.aS>
	// 4174 7798:aload_0         
	// 4175 7799:getfield        #12  <Field azh a>
	// 4176 7802:getfield        #367 <Field int azh.ak>
	// 4177 7805:iconst_m1       
	// 4178 7806:ixor            
	// 4179 7807:iand            
	// 4180 7808:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 4181 7811:aload_0         
	// 4182 7812:getfield        #12  <Field azh a>
	// 4183 7815:astore_1        
		abyte0.aS = ((azh) (abyte0)).be ^ a.aS;
	// 4184 7816:aload_1         
	// 4185 7817:aload_1         
	// 4186 7818:getfield        #140 <Field int azh.be>
	// 4187 7821:aload_0         
	// 4188 7822:getfield        #12  <Field azh a>
	// 4189 7825:getfield        #214 <Field int azh.aS>
	// 4190 7828:ixor            
	// 4191 7829:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 4192 7832:aload_0         
	// 4193 7833:getfield        #12  <Field azh a>
	// 4194 7836:astore_1        
		abyte0.be = ((azh) (abyte0)).ak | a.ci;
	// 4195 7837:aload_1         
	// 4196 7838:aload_1         
	// 4197 7839:getfield        #367 <Field int azh.ak>
	// 4198 7842:aload_0         
	// 4199 7843:getfield        #12  <Field azh a>
	// 4200 7846:getfield        #220 <Field int azh.ci>
	// 4201 7849:ior             
	// 4202 7850:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4203 7853:aload_0         
	// 4204 7854:getfield        #12  <Field azh a>
	// 4205 7857:astore_1        
		abyte0.be = ((azh) (abyte0)).bw ^ a.be;
	// 4206 7858:aload_1         
	// 4207 7859:aload_1         
	// 4208 7860:getfield        #185 <Field int azh.bw>
	// 4209 7863:aload_0         
	// 4210 7864:getfield        #12  <Field azh a>
	// 4211 7867:getfield        #140 <Field int azh.be>
	// 4212 7870:ixor            
	// 4213 7871:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4214 7874:aload_0         
	// 4215 7875:getfield        #12  <Field azh a>
	// 4216 7878:astore_1        
		abyte0.be = ((azh) (abyte0)).M & ~a.be;
	// 4217 7879:aload_1         
	// 4218 7880:aload_1         
	// 4219 7881:getfield        #125 <Field int azh.M>
	// 4220 7884:aload_0         
	// 4221 7885:getfield        #12  <Field azh a>
	// 4222 7888:getfield        #140 <Field int azh.be>
	// 4223 7891:iconst_m1       
	// 4224 7892:ixor            
	// 4225 7893:iand            
	// 4226 7894:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4227 7897:aload_0         
	// 4228 7898:getfield        #12  <Field azh a>
	// 4229 7901:astore_1        
		abyte0.be = ((azh) (abyte0)).aJ ^ a.be;
	// 4230 7902:aload_1         
	// 4231 7903:aload_1         
	// 4232 7904:getfield        #211 <Field int azh.aJ>
	// 4233 7907:aload_0         
	// 4234 7908:getfield        #12  <Field azh a>
	// 4235 7911:getfield        #140 <Field int azh.be>
	// 4236 7914:ixor            
	// 4237 7915:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4238 7918:aload_0         
	// 4239 7919:getfield        #12  <Field azh a>
	// 4240 7922:astore_1        
		abyte0.aG = ((azh) (abyte0)).ak | a.aG;
	// 4241 7923:aload_1         
	// 4242 7924:aload_1         
	// 4243 7925:getfield        #367 <Field int azh.ak>
	// 4244 7928:aload_0         
	// 4245 7929:getfield        #12  <Field azh a>
	// 4246 7932:getfield        #325 <Field int azh.aG>
	// 4247 7935:ior             
	// 4248 7936:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 4249 7939:aload_0         
	// 4250 7940:getfield        #12  <Field azh a>
	// 4251 7943:astore_1        
		abyte0.aG = ((azh) (abyte0)).bF ^ a.aG;
	// 4252 7944:aload_1         
	// 4253 7945:aload_1         
	// 4254 7946:getfield        #89  <Field int azh.bF>
	// 4255 7949:aload_0         
	// 4256 7950:getfield        #12  <Field azh a>
	// 4257 7953:getfield        #325 <Field int azh.aG>
	// 4258 7956:ixor            
	// 4259 7957:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 4260 7960:aload_0         
	// 4261 7961:getfield        #12  <Field azh a>
	// 4262 7964:astore_1        
		abyte0.aG = ((azh) (abyte0)).aG ^ a.bA;
	// 4263 7965:aload_1         
	// 4264 7966:aload_1         
	// 4265 7967:getfield        #325 <Field int azh.aG>
	// 4266 7970:aload_0         
	// 4267 7971:getfield        #12  <Field azh a>
	// 4268 7974:getfield        #289 <Field int azh.bA>
	// 4269 7977:ixor            
	// 4270 7978:putfield        #325 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 4271 7981:aload_0         
	// 4272 7982:getfield        #12  <Field azh a>
	// 4273 7985:astore_1        
		abyte0.bF = ((azh) (abyte0)).ak & ~a.a;
	// 4274 7986:aload_1         
	// 4275 7987:aload_1         
	// 4276 7988:getfield        #367 <Field int azh.ak>
	// 4277 7991:aload_0         
	// 4278 7992:getfield        #12  <Field azh a>
	// 4279 7995:getfield        #196 <Field int azh.a>
	// 4280 7998:iconst_m1       
	// 4281 7999:ixor            
	// 4282 8000:iand            
	// 4283 8001:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 4284 8004:aload_0         
	// 4285 8005:getfield        #12  <Field azh a>
	// 4286 8008:astore_1        
		abyte0.bF = ((azh) (abyte0)).ch ^ a.bF;
	// 4287 8009:aload_1         
	// 4288 8010:aload_1         
	// 4289 8011:getfield        #217 <Field int azh.ch>
	// 4290 8014:aload_0         
	// 4291 8015:getfield        #12  <Field azh a>
	// 4292 8018:getfield        #89  <Field int azh.bF>
	// 4293 8021:ixor            
	// 4294 8022:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 4295 8025:aload_0         
	// 4296 8026:getfield        #12  <Field azh a>
	// 4297 8029:astore_1        
		abyte0.bF = ((azh) (abyte0)).M & a.bF;
	// 4298 8030:aload_1         
	// 4299 8031:aload_1         
	// 4300 8032:getfield        #125 <Field int azh.M>
	// 4301 8035:aload_0         
	// 4302 8036:getfield        #12  <Field azh a>
	// 4303 8039:getfield        #89  <Field int azh.bF>
	// 4304 8042:iand            
	// 4305 8043:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 4306 8046:aload_0         
	// 4307 8047:getfield        #12  <Field azh a>
	// 4308 8050:astore_1        
		abyte0.bF = ((azh) (abyte0)).aN ^ a.bF;
	// 4309 8051:aload_1         
	// 4310 8052:aload_1         
	// 4311 8053:getfield        #107 <Field int azh.aN>
	// 4312 8056:aload_0         
	// 4313 8057:getfield        #12  <Field azh a>
	// 4314 8060:getfield        #89  <Field int azh.bF>
	// 4315 8063:ixor            
	// 4316 8064:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 4317 8067:aload_0         
	// 4318 8068:getfield        #12  <Field azh a>
	// 4319 8071:astore_1        
		abyte0.bF = ((azh) (abyte0)).U | a.bF;
	// 4320 8072:aload_1         
	// 4321 8073:aload_1         
	// 4322 8074:getfield        #370 <Field int azh.U>
	// 4323 8077:aload_0         
	// 4324 8078:getfield        #12  <Field azh a>
	// 4325 8081:getfield        #89  <Field int azh.bF>
	// 4326 8084:ior             
	// 4327 8085:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 4328 8088:aload_0         
	// 4329 8089:getfield        #12  <Field azh a>
	// 4330 8092:astore_1        
		abyte0.bF = ((azh) (abyte0)).be ^ a.bF;
	// 4331 8093:aload_1         
	// 4332 8094:aload_1         
	// 4333 8095:getfield        #140 <Field int azh.be>
	// 4334 8098:aload_0         
	// 4335 8099:getfield        #12  <Field azh a>
	// 4336 8102:getfield        #89  <Field int azh.bF>
	// 4337 8105:ixor            
	// 4338 8106:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 4339 8109:aload_0         
	// 4340 8110:getfield        #12  <Field azh a>
	// 4341 8113:astore_1        
		abyte0.j = ((azh) (abyte0)).bF ^ a.j;
	// 4342 8114:aload_1         
	// 4343 8115:aload_1         
	// 4344 8116:getfield        #89  <Field int azh.bF>
	// 4345 8119:aload_0         
	// 4346 8120:getfield        #12  <Field azh a>
	// 4347 8123:getfield        #182 <Field int azh.j>
	// 4348 8126:ixor            
	// 4349 8127:putfield        #182 <Field int azh.j>
		abyte0 = ((byte []) (a));
	// 4350 8130:aload_0         
	// 4351 8131:getfield        #12  <Field azh a>
	// 4352 8134:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd & ~a.ak;
	// 4353 8135:aload_1         
	// 4354 8136:aload_1         
	// 4355 8137:getfield        #149 <Field int azh.cd>
	// 4356 8140:aload_0         
	// 4357 8141:getfield        #12  <Field azh a>
	// 4358 8144:getfield        #367 <Field int azh.ak>
	// 4359 8147:iconst_m1       
	// 4360 8148:ixor            
	// 4361 8149:iand            
	// 4362 8150:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4363 8153:aload_0         
	// 4364 8154:getfield        #12  <Field azh a>
	// 4365 8157:astore_1        
		abyte0.cd = ((azh) (abyte0)).aD ^ a.cd;
	// 4366 8158:aload_1         
	// 4367 8159:aload_1         
	// 4368 8160:getfield        #202 <Field int azh.aD>
	// 4369 8163:aload_0         
	// 4370 8164:getfield        #12  <Field azh a>
	// 4371 8167:getfield        #149 <Field int azh.cd>
	// 4372 8170:ixor            
	// 4373 8171:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4374 8174:aload_0         
	// 4375 8175:getfield        #12  <Field azh a>
	// 4376 8178:astore_1        
		abyte0.cd = ((azh) (abyte0)).M & ~a.cd;
	// 4377 8179:aload_1         
	// 4378 8180:aload_1         
	// 4379 8181:getfield        #125 <Field int azh.M>
	// 4380 8184:aload_0         
	// 4381 8185:getfield        #12  <Field azh a>
	// 4382 8188:getfield        #149 <Field int azh.cd>
	// 4383 8191:iconst_m1       
	// 4384 8192:ixor            
	// 4385 8193:iand            
	// 4386 8194:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4387 8197:aload_0         
	// 4388 8198:getfield        #12  <Field azh a>
	// 4389 8201:astore_1        
		abyte0.cd = ((azh) (abyte0)).ao ^ a.cd;
	// 4390 8202:aload_1         
	// 4391 8203:aload_1         
	// 4392 8204:getfield        #146 <Field int azh.ao>
	// 4393 8207:aload_0         
	// 4394 8208:getfield        #12  <Field azh a>
	// 4395 8211:getfield        #149 <Field int azh.cd>
	// 4396 8214:ixor            
	// 4397 8215:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4398 8218:aload_0         
	// 4399 8219:getfield        #12  <Field azh a>
	// 4400 8222:astore_1        
		abyte0.bc = ((azh) (abyte0)).ak | a.bc;
	// 4401 8223:aload_1         
	// 4402 8224:aload_1         
	// 4403 8225:getfield        #367 <Field int azh.ak>
	// 4404 8228:aload_0         
	// 4405 8229:getfield        #12  <Field azh a>
	// 4406 8232:getfield        #131 <Field int azh.bc>
	// 4407 8235:ior             
	// 4408 8236:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4409 8239:aload_0         
	// 4410 8240:getfield        #12  <Field azh a>
	// 4411 8243:astore_1        
		abyte0.bc = ((azh) (abyte0)).bp ^ a.bc;
	// 4412 8244:aload_1         
	// 4413 8245:aload_1         
	// 4414 8246:getfield        #205 <Field int azh.bp>
	// 4415 8249:aload_0         
	// 4416 8250:getfield        #12  <Field azh a>
	// 4417 8253:getfield        #131 <Field int azh.bc>
	// 4418 8256:ixor            
	// 4419 8257:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4420 8260:aload_0         
	// 4421 8261:getfield        #12  <Field azh a>
	// 4422 8264:astore_1        
		abyte0.bn = ((azh) (abyte0)).bc ^ a.bn;
	// 4423 8265:aload_1         
	// 4424 8266:aload_1         
	// 4425 8267:getfield        #131 <Field int azh.bc>
	// 4426 8270:aload_0         
	// 4427 8271:getfield        #12  <Field azh a>
	// 4428 8274:getfield        #358 <Field int azh.bn>
	// 4429 8277:ixor            
	// 4430 8278:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 4431 8281:aload_0         
	// 4432 8282:getfield        #12  <Field azh a>
	// 4433 8285:astore_1        
		abyte0.aB = ((azh) (abyte0)).ak & ~a.aB;
	// 4434 8286:aload_1         
	// 4435 8287:aload_1         
	// 4436 8288:getfield        #367 <Field int azh.ak>
	// 4437 8291:aload_0         
	// 4438 8292:getfield        #12  <Field azh a>
	// 4439 8295:getfield        #313 <Field int azh.aB>
	// 4440 8298:iconst_m1       
	// 4441 8299:ixor            
	// 4442 8300:iand            
	// 4443 8301:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4444 8304:aload_0         
	// 4445 8305:getfield        #12  <Field azh a>
	// 4446 8308:astore_1        
		abyte0.aB = ((azh) (abyte0)).bY ^ a.aB;
	// 4447 8309:aload_1         
	// 4448 8310:aload_1         
	// 4449 8311:getfield        #167 <Field int azh.bY>
	// 4450 8314:aload_0         
	// 4451 8315:getfield        #12  <Field azh a>
	// 4452 8318:getfield        #313 <Field int azh.aB>
	// 4453 8321:ixor            
	// 4454 8322:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4455 8325:aload_0         
	// 4456 8326:getfield        #12  <Field azh a>
	// 4457 8329:astore_1        
		abyte0.B = ((azh) (abyte0)).aB ^ a.B;
	// 4458 8330:aload_1         
	// 4459 8331:aload_1         
	// 4460 8332:getfield        #313 <Field int azh.aB>
	// 4461 8335:aload_0         
	// 4462 8336:getfield        #12  <Field azh a>
	// 4463 8339:getfield        #376 <Field int azh.B>
	// 4464 8342:ixor            
	// 4465 8343:putfield        #376 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 4466 8346:aload_0         
	// 4467 8347:getfield        #12  <Field azh a>
	// 4468 8350:astore_1        
		abyte0.aB = ((azh) (abyte0)).a & ~a.ak;
	// 4469 8351:aload_1         
	// 4470 8352:aload_1         
	// 4471 8353:getfield        #196 <Field int azh.a>
	// 4472 8356:aload_0         
	// 4473 8357:getfield        #12  <Field azh a>
	// 4474 8360:getfield        #367 <Field int azh.ak>
	// 4475 8363:iconst_m1       
	// 4476 8364:ixor            
	// 4477 8365:iand            
	// 4478 8366:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4479 8369:aload_0         
	// 4480 8370:getfield        #12  <Field azh a>
	// 4481 8373:astore_1        
		abyte0.aB = ((azh) (abyte0)).bN ^ a.aB;
	// 4482 8374:aload_1         
	// 4483 8375:aload_1         
	// 4484 8376:getfield        #194 <Field int azh.bN>
	// 4485 8379:aload_0         
	// 4486 8380:getfield        #12  <Field azh a>
	// 4487 8383:getfield        #313 <Field int azh.aB>
	// 4488 8386:ixor            
	// 4489 8387:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4490 8390:aload_0         
	// 4491 8391:getfield        #12  <Field azh a>
	// 4492 8394:astore_1        
		abyte0.aB = ((azh) (abyte0)).M & ~a.aB;
	// 4493 8395:aload_1         
	// 4494 8396:aload_1         
	// 4495 8397:getfield        #125 <Field int azh.M>
	// 4496 8400:aload_0         
	// 4497 8401:getfield        #12  <Field azh a>
	// 4498 8404:getfield        #313 <Field int azh.aB>
	// 4499 8407:iconst_m1       
	// 4500 8408:ixor            
	// 4501 8409:iand            
	// 4502 8410:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4503 8413:aload_0         
	// 4504 8414:getfield        #12  <Field azh a>
	// 4505 8417:astore_1        
		abyte0.bO = ((azh) (abyte0)).bO & ~a.ak;
	// 4506 8418:aload_1         
	// 4507 8419:aload_1         
	// 4508 8420:getfield        #316 <Field int azh.bO>
	// 4509 8423:aload_0         
	// 4510 8424:getfield        #12  <Field azh a>
	// 4511 8427:getfield        #367 <Field int azh.ak>
	// 4512 8430:iconst_m1       
	// 4513 8431:ixor            
	// 4514 8432:iand            
	// 4515 8433:putfield        #316 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 4516 8436:aload_0         
	// 4517 8437:getfield        #12  <Field azh a>
	// 4518 8440:astore_1        
		abyte0.bO = ((azh) (abyte0)).bR ^ a.bO;
	// 4519 8441:aload_1         
	// 4520 8442:aload_1         
	// 4521 8443:getfield        #74  <Field int azh.bR>
	// 4522 8446:aload_0         
	// 4523 8447:getfield        #12  <Field azh a>
	// 4524 8450:getfield        #316 <Field int azh.bO>
	// 4525 8453:ixor            
	// 4526 8454:putfield        #316 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 4527 8457:aload_0         
	// 4528 8458:getfield        #12  <Field azh a>
	// 4529 8461:astore_1        
		abyte0.P = ((azh) (abyte0)).bO ^ a.P;
	// 4530 8462:aload_1         
	// 4531 8463:aload_1         
	// 4532 8464:getfield        #316 <Field int azh.bO>
	// 4533 8467:aload_0         
	// 4534 8468:getfield        #12  <Field azh a>
	// 4535 8471:getfield        #379 <Field int azh.P>
	// 4536 8474:ixor            
	// 4537 8475:putfield        #379 <Field int azh.P>
		abyte0 = ((byte []) (a));
	// 4538 8478:aload_0         
	// 4539 8479:getfield        #12  <Field azh a>
	// 4540 8482:astore_1        
		abyte0.bO = ((azh) (abyte0)).H & a.P;
	// 4541 8483:aload_1         
	// 4542 8484:aload_1         
	// 4543 8485:getfield        #235 <Field int azh.H>
	// 4544 8488:aload_0         
	// 4545 8489:getfield        #12  <Field azh a>
	// 4546 8492:getfield        #379 <Field int azh.P>
	// 4547 8495:iand            
	// 4548 8496:putfield        #316 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 4549 8499:aload_0         
	// 4550 8500:getfield        #12  <Field azh a>
	// 4551 8503:astore_1        
		abyte0.bR = ((azh) (abyte0)).H & a.P;
	// 4552 8504:aload_1         
	// 4553 8505:aload_1         
	// 4554 8506:getfield        #235 <Field int azh.H>
	// 4555 8509:aload_0         
	// 4556 8510:getfield        #12  <Field azh a>
	// 4557 8513:getfield        #379 <Field int azh.P>
	// 4558 8516:iand            
	// 4559 8517:putfield        #74  <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 4560 8520:aload_0         
	// 4561 8521:getfield        #12  <Field azh a>
	// 4562 8524:astore_1        
		abyte0.bN = ((azh) (abyte0)).H & ~a.P;
	// 4563 8525:aload_1         
	// 4564 8526:aload_1         
	// 4565 8527:getfield        #235 <Field int azh.H>
	// 4566 8530:aload_0         
	// 4567 8531:getfield        #12  <Field azh a>
	// 4568 8534:getfield        #379 <Field int azh.P>
	// 4569 8537:iconst_m1       
	// 4570 8538:ixor            
	// 4571 8539:iand            
	// 4572 8540:putfield        #194 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 4573 8543:aload_0         
	// 4574 8544:getfield        #12  <Field azh a>
	// 4575 8547:astore_1        
		abyte0.bY = ((azh) (abyte0)).H & a.P;
	// 4576 8548:aload_1         
	// 4577 8549:aload_1         
	// 4578 8550:getfield        #235 <Field int azh.H>
	// 4579 8553:aload_0         
	// 4580 8554:getfield        #12  <Field azh a>
	// 4581 8557:getfield        #379 <Field int azh.P>
	// 4582 8560:iand            
	// 4583 8561:putfield        #167 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4584 8564:aload_0         
	// 4585 8565:getfield        #12  <Field azh a>
	// 4586 8568:astore_1        
		abyte0.bc = ((azh) (abyte0)).H & ~a.P;
	// 4587 8569:aload_1         
	// 4588 8570:aload_1         
	// 4589 8571:getfield        #235 <Field int azh.H>
	// 4590 8574:aload_0         
	// 4591 8575:getfield        #12  <Field azh a>
	// 4592 8578:getfield        #379 <Field int azh.P>
	// 4593 8581:iconst_m1       
	// 4594 8582:ixor            
	// 4595 8583:iand            
	// 4596 8584:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4597 8587:aload_0         
	// 4598 8588:getfield        #12  <Field azh a>
	// 4599 8591:astore_1        
		abyte0.bc = ((azh) (abyte0)).P ^ a.bc;
	// 4600 8592:aload_1         
	// 4601 8593:aload_1         
	// 4602 8594:getfield        #379 <Field int azh.P>
	// 4603 8597:aload_0         
	// 4604 8598:getfield        #12  <Field azh a>
	// 4605 8601:getfield        #131 <Field int azh.bc>
	// 4606 8604:ixor            
	// 4607 8605:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4608 8608:aload_0         
	// 4609 8609:getfield        #12  <Field azh a>
	// 4610 8612:astore_1        
		abyte0.bp = ((azh) (abyte0)).H & a.P;
	// 4611 8613:aload_1         
	// 4612 8614:aload_1         
	// 4613 8615:getfield        #235 <Field int azh.H>
	// 4614 8618:aload_0         
	// 4615 8619:getfield        #12  <Field azh a>
	// 4616 8622:getfield        #379 <Field int azh.P>
	// 4617 8625:iand            
	// 4618 8626:putfield        #205 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 4619 8629:aload_0         
	// 4620 8630:getfield        #12  <Field azh a>
	// 4621 8633:astore_1        
		abyte0.ao = ((azh) (abyte0)).H & a.P;
	// 4622 8634:aload_1         
	// 4623 8635:aload_1         
	// 4624 8636:getfield        #235 <Field int azh.H>
	// 4625 8639:aload_0         
	// 4626 8640:getfield        #12  <Field azh a>
	// 4627 8643:getfield        #379 <Field int azh.P>
	// 4628 8646:iand            
	// 4629 8647:putfield        #146 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 4630 8650:aload_0         
	// 4631 8651:getfield        #12  <Field azh a>
	// 4632 8654:astore_1        
		abyte0.bq = ((azh) (abyte0)).ak | a.bq;
	// 4633 8655:aload_1         
	// 4634 8656:aload_1         
	// 4635 8657:getfield        #367 <Field int azh.ak>
	// 4636 8660:aload_0         
	// 4637 8661:getfield        #12  <Field azh a>
	// 4638 8664:getfield        #26  <Field int azh.bq>
	// 4639 8667:ior             
	// 4640 8668:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 4641 8671:aload_0         
	// 4642 8672:getfield        #12  <Field azh a>
	// 4643 8675:astore_1        
		abyte0.bq = ((azh) (abyte0)).aO ^ a.bq;
	// 4644 8676:aload_1         
	// 4645 8677:aload_1         
	// 4646 8678:getfield        #152 <Field int azh.aO>
	// 4647 8681:aload_0         
	// 4648 8682:getfield        #12  <Field azh a>
	// 4649 8685:getfield        #26  <Field int azh.bq>
	// 4650 8688:ixor            
	// 4651 8689:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 4652 8692:aload_0         
	// 4653 8693:getfield        #12  <Field azh a>
	// 4654 8696:astore_1        
		abyte0.aB = ((azh) (abyte0)).bq ^ a.aB;
	// 4655 8697:aload_1         
	// 4656 8698:aload_1         
	// 4657 8699:getfield        #26  <Field int azh.bq>
	// 4658 8702:aload_0         
	// 4659 8703:getfield        #12  <Field azh a>
	// 4660 8706:getfield        #313 <Field int azh.aB>
	// 4661 8709:ixor            
	// 4662 8710:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4663 8713:aload_0         
	// 4664 8714:getfield        #12  <Field azh a>
	// 4665 8717:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB & ~a.U;
	// 4666 8718:aload_1         
	// 4667 8719:aload_1         
	// 4668 8720:getfield        #313 <Field int azh.aB>
	// 4669 8723:aload_0         
	// 4670 8724:getfield        #12  <Field azh a>
	// 4671 8727:getfield        #370 <Field int azh.U>
	// 4672 8730:iconst_m1       
	// 4673 8731:ixor            
	// 4674 8732:iand            
	// 4675 8733:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4676 8736:aload_0         
	// 4677 8737:getfield        #12  <Field azh a>
	// 4678 8740:astore_1        
		abyte0.aB = ((azh) (abyte0)).cd ^ a.aB;
	// 4679 8741:aload_1         
	// 4680 8742:aload_1         
	// 4681 8743:getfield        #149 <Field int azh.cd>
	// 4682 8746:aload_0         
	// 4683 8747:getfield        #12  <Field azh a>
	// 4684 8750:getfield        #313 <Field int azh.aB>
	// 4685 8753:ixor            
	// 4686 8754:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4687 8757:aload_0         
	// 4688 8758:getfield        #12  <Field azh a>
	// 4689 8761:astore_1        
		abyte0.aj = ((azh) (abyte0)).aB ^ a.aj;
	// 4690 8762:aload_1         
	// 4691 8763:aload_1         
	// 4692 8764:getfield        #313 <Field int azh.aB>
	// 4693 8767:aload_0         
	// 4694 8768:getfield        #12  <Field azh a>
	// 4695 8771:getfield        #280 <Field int azh.aj>
	// 4696 8774:ixor            
	// 4697 8775:putfield        #280 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 4698 8778:aload_0         
	// 4699 8779:getfield        #12  <Field azh a>
	// 4700 8782:astore_1        
		abyte0.aB = ((azh) (abyte0)).aj ^ a.F;
	// 4701 8783:aload_1         
	// 4702 8784:aload_1         
	// 4703 8785:getfield        #280 <Field int azh.aj>
	// 4704 8788:aload_0         
	// 4705 8789:getfield        #12  <Field azh a>
	// 4706 8792:getfield        #98  <Field int azh.F>
	// 4707 8795:ixor            
	// 4708 8796:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 4709 8799:aload_0         
	// 4710 8800:getfield        #12  <Field azh a>
	// 4711 8803:astore_1        
		abyte0.br = ((azh) (abyte0)).ak | a.br;
	// 4712 8804:aload_1         
	// 4713 8805:aload_1         
	// 4714 8806:getfield        #367 <Field int azh.ak>
	// 4715 8809:aload_0         
	// 4716 8810:getfield        #12  <Field azh a>
	// 4717 8813:getfield        #38  <Field int azh.br>
	// 4718 8816:ior             
	// 4719 8817:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 4720 8820:aload_0         
	// 4721 8821:getfield        #12  <Field azh a>
	// 4722 8824:astore_1        
		abyte0.br = ((azh) (abyte0)).ci ^ a.br;
	// 4723 8825:aload_1         
	// 4724 8826:aload_1         
	// 4725 8827:getfield        #220 <Field int azh.ci>
	// 4726 8830:aload_0         
	// 4727 8831:getfield        #12  <Field azh a>
	// 4728 8834:getfield        #38  <Field int azh.br>
	// 4729 8837:ixor            
	// 4730 8838:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 4731 8841:aload_0         
	// 4732 8842:getfield        #12  <Field azh a>
	// 4733 8845:astore_1        
		abyte0.br = ((azh) (abyte0)).M & ~a.br;
	// 4734 8846:aload_1         
	// 4735 8847:aload_1         
	// 4736 8848:getfield        #125 <Field int azh.M>
	// 4737 8851:aload_0         
	// 4738 8852:getfield        #12  <Field azh a>
	// 4739 8855:getfield        #38  <Field int azh.br>
	// 4740 8858:iconst_m1       
	// 4741 8859:ixor            
	// 4742 8860:iand            
	// 4743 8861:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 4744 8864:aload_0         
	// 4745 8865:getfield        #12  <Field azh a>
	// 4746 8868:astore_1        
		abyte0.br = ((azh) (abyte0)).aS ^ a.br;
	// 4747 8869:aload_1         
	// 4748 8870:aload_1         
	// 4749 8871:getfield        #214 <Field int azh.aS>
	// 4750 8874:aload_0         
	// 4751 8875:getfield        #12  <Field azh a>
	// 4752 8878:getfield        #38  <Field int azh.br>
	// 4753 8881:ixor            
	// 4754 8882:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 4755 8885:aload_0         
	// 4756 8886:getfield        #12  <Field azh a>
	// 4757 8889:astore_1        
		abyte0.br = ((azh) (abyte0)).U | a.br;
	// 4758 8890:aload_1         
	// 4759 8891:aload_1         
	// 4760 8892:getfield        #370 <Field int azh.U>
	// 4761 8895:aload_0         
	// 4762 8896:getfield        #12  <Field azh a>
	// 4763 8899:getfield        #38  <Field int azh.br>
	// 4764 8902:ior             
	// 4765 8903:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 4766 8906:aload_0         
	// 4767 8907:getfield        #12  <Field azh a>
	// 4768 8910:astore_1        
		abyte0.br = ((azh) (abyte0)).bn ^ a.br;
	// 4769 8911:aload_1         
	// 4770 8912:aload_1         
	// 4771 8913:getfield        #358 <Field int azh.bn>
	// 4772 8916:aload_0         
	// 4773 8917:getfield        #12  <Field azh a>
	// 4774 8920:getfield        #38  <Field int azh.br>
	// 4775 8923:ixor            
	// 4776 8924:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 4777 8927:aload_0         
	// 4778 8928:getfield        #12  <Field azh a>
	// 4779 8931:astore_1        
		abyte0.br = ((azh) (abyte0)).br ^ a.ah;
	// 4780 8932:aload_1         
	// 4781 8933:aload_1         
	// 4782 8934:getfield        #38  <Field int azh.br>
	// 4783 8937:aload_0         
	// 4784 8938:getfield        #12  <Field azh a>
	// 4785 8941:getfield        #364 <Field int azh.ah>
	// 4786 8944:ixor            
	// 4787 8945:putfield        #38  <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 4788 8948:aload_0         
	// 4789 8949:getfield        #12  <Field azh a>
	// 4790 8952:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo | a.ah;
	// 4791 8953:aload_1         
	// 4792 8954:aload_1         
	// 4793 8955:getfield        #310 <Field int azh.bo>
	// 4794 8958:aload_0         
	// 4795 8959:getfield        #12  <Field azh a>
	// 4796 8962:getfield        #364 <Field int azh.ah>
	// 4797 8965:ior             
	// 4798 8966:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4799 8969:aload_0         
	// 4800 8970:getfield        #12  <Field azh a>
	// 4801 8973:astore_1        
		abyte0.bo = ((azh) (abyte0)).ax ^ a.bo;
	// 4802 8974:aload_1         
	// 4803 8975:aload_1         
	// 4804 8976:getfield        #283 <Field int azh.ax>
	// 4805 8979:aload_0         
	// 4806 8980:getfield        #12  <Field azh a>
	// 4807 8983:getfield        #310 <Field int azh.bo>
	// 4808 8986:ixor            
	// 4809 8987:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4810 8990:aload_0         
	// 4811 8991:getfield        #12  <Field azh a>
	// 4812 8994:astore_1        
		abyte0.aa = ((azh) (abyte0)).bo ^ a.aa;
	// 4813 8995:aload_1         
	// 4814 8996:aload_1         
	// 4815 8997:getfield        #310 <Field int azh.bo>
	// 4816 9000:aload_0         
	// 4817 9001:getfield        #12  <Field azh a>
	// 4818 9004:getfield        #382 <Field int azh.aa>
	// 4819 9007:ixor            
	// 4820 9008:putfield        #382 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 4821 9011:aload_0         
	// 4822 9012:getfield        #12  <Field azh a>
	// 4823 9015:astore_1        
		abyte0.bo = ((azh) (abyte0)).C | a.aa;
	// 4824 9016:aload_1         
	// 4825 9017:aload_1         
	// 4826 9018:getfield        #385 <Field int azh.C>
	// 4827 9021:aload_0         
	// 4828 9022:getfield        #12  <Field azh a>
	// 4829 9025:getfield        #382 <Field int azh.aa>
	// 4830 9028:ior             
	// 4831 9029:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4832 9032:aload_0         
	// 4833 9033:getfield        #12  <Field azh a>
	// 4834 9036:astore_1        
		abyte0.bo = ((azh) (abyte0)).K & ~a.bo;
	// 4835 9037:aload_1         
	// 4836 9038:aload_1         
	// 4837 9039:getfield        #388 <Field int azh.K>
	// 4838 9042:aload_0         
	// 4839 9043:getfield        #12  <Field azh a>
	// 4840 9046:getfield        #310 <Field int azh.bo>
	// 4841 9049:iconst_m1       
	// 4842 9050:ixor            
	// 4843 9051:iand            
	// 4844 9052:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4845 9055:aload_0         
	// 4846 9056:getfield        #12  <Field azh a>
	// 4847 9059:astore_1        
		abyte0.bo = ((azh) (abyte0)).aa ^ a.bo;
	// 4848 9060:aload_1         
	// 4849 9061:aload_1         
	// 4850 9062:getfield        #382 <Field int azh.aa>
	// 4851 9065:aload_0         
	// 4852 9066:getfield        #12  <Field azh a>
	// 4853 9069:getfield        #310 <Field int azh.bo>
	// 4854 9072:ixor            
	// 4855 9073:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4856 9076:aload_0         
	// 4857 9077:getfield        #12  <Field azh a>
	// 4858 9080:astore_1        
		abyte0.ax = ((azh) (abyte0)).aa & ~a.C;
	// 4859 9081:aload_1         
	// 4860 9082:aload_1         
	// 4861 9083:getfield        #382 <Field int azh.aa>
	// 4862 9086:aload_0         
	// 4863 9087:getfield        #12  <Field azh a>
	// 4864 9090:getfield        #385 <Field int azh.C>
	// 4865 9093:iconst_m1       
	// 4866 9094:ixor            
	// 4867 9095:iand            
	// 4868 9096:putfield        #283 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4869 9099:aload_0         
	// 4870 9100:getfield        #12  <Field azh a>
	// 4871 9103:astore_1        
		abyte0.bn = ((azh) (abyte0)).aa & ~a.ax;
	// 4872 9104:aload_1         
	// 4873 9105:aload_1         
	// 4874 9106:getfield        #382 <Field int azh.aa>
	// 4875 9109:aload_0         
	// 4876 9110:getfield        #12  <Field azh a>
	// 4877 9113:getfield        #283 <Field int azh.ax>
	// 4878 9116:iconst_m1       
	// 4879 9117:ixor            
	// 4880 9118:iand            
	// 4881 9119:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 4882 9122:aload_0         
	// 4883 9123:getfield        #12  <Field azh a>
	// 4884 9126:astore_1        
		abyte0.aS = ((azh) (abyte0)).S | a.bn;
	// 4885 9127:aload_1         
	// 4886 9128:aload_1         
	// 4887 9129:getfield        #391 <Field int azh.S>
	// 4888 9132:aload_0         
	// 4889 9133:getfield        #12  <Field azh a>
	// 4890 9136:getfield        #358 <Field int azh.bn>
	// 4891 9139:ior             
	// 4892 9140:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 4893 9143:aload_0         
	// 4894 9144:getfield        #12  <Field azh a>
	// 4895 9147:astore_1        
		abyte0.ci = ((azh) (abyte0)).K & a.ax;
	// 4896 9148:aload_1         
	// 4897 9149:aload_1         
	// 4898 9150:getfield        #388 <Field int azh.K>
	// 4899 9153:aload_0         
	// 4900 9154:getfield        #12  <Field azh a>
	// 4901 9157:getfield        #283 <Field int azh.ax>
	// 4902 9160:iand            
	// 4903 9161:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 4904 9164:aload_0         
	// 4905 9165:getfield        #12  <Field azh a>
	// 4906 9168:astore_1        
		abyte0.ci = ((azh) (abyte0)).ax ^ a.ci;
	// 4907 9169:aload_1         
	// 4908 9170:aload_1         
	// 4909 9171:getfield        #283 <Field int azh.ax>
	// 4910 9174:aload_0         
	// 4911 9175:getfield        #12  <Field azh a>
	// 4912 9178:getfield        #220 <Field int azh.ci>
	// 4913 9181:ixor            
	// 4914 9182:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 4915 9185:aload_0         
	// 4916 9186:getfield        #12  <Field azh a>
	// 4917 9189:astore_1        
		abyte0.bW = ((azh) (abyte0)).ax ^ a.bW;
	// 4918 9190:aload_1         
	// 4919 9191:aload_1         
	// 4920 9192:getfield        #283 <Field int azh.ax>
	// 4921 9195:aload_0         
	// 4922 9196:getfield        #12  <Field azh a>
	// 4923 9199:getfield        #394 <Field int azh.bW>
	// 4924 9202:ixor            
	// 4925 9203:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4926 9206:aload_0         
	// 4927 9207:getfield        #12  <Field azh a>
	// 4928 9210:astore_1        
		abyte0.bW = ((azh) (abyte0)).bW & ~a.S;
	// 4929 9211:aload_1         
	// 4930 9212:aload_1         
	// 4931 9213:getfield        #394 <Field int azh.bW>
	// 4932 9216:aload_0         
	// 4933 9217:getfield        #12  <Field azh a>
	// 4934 9220:getfield        #391 <Field int azh.S>
	// 4935 9223:iconst_m1       
	// 4936 9224:ixor            
	// 4937 9225:iand            
	// 4938 9226:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4939 9229:aload_0         
	// 4940 9230:getfield        #12  <Field azh a>
	// 4941 9233:astore_1        
		abyte0.bW = ((azh) (abyte0)).bt ^ a.bW;
	// 4942 9234:aload_1         
	// 4943 9235:aload_1         
	// 4944 9236:getfield        #397 <Field int azh.bt>
	// 4945 9239:aload_0         
	// 4946 9240:getfield        #12  <Field azh a>
	// 4947 9243:getfield        #394 <Field int azh.bW>
	// 4948 9246:ixor            
	// 4949 9247:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4950 9250:aload_0         
	// 4951 9251:getfield        #12  <Field azh a>
	// 4952 9254:astore_1        
		abyte0.bW = ((azh) (abyte0)).g & a.bW;
	// 4953 9255:aload_1         
	// 4954 9256:aload_1         
	// 4955 9257:getfield        #116 <Field int azh.g>
	// 4956 9260:aload_0         
	// 4957 9261:getfield        #12  <Field azh a>
	// 4958 9264:getfield        #394 <Field int azh.bW>
	// 4959 9267:iand            
	// 4960 9268:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4961 9271:aload_0         
	// 4962 9272:getfield        #12  <Field azh a>
	// 4963 9275:astore_1        
		abyte0.cd = ((azh) (abyte0)).K & a.ax;
	// 4964 9276:aload_1         
	// 4965 9277:aload_1         
	// 4966 9278:getfield        #388 <Field int azh.K>
	// 4967 9281:aload_0         
	// 4968 9282:getfield        #12  <Field azh a>
	// 4969 9285:getfield        #283 <Field int azh.ax>
	// 4970 9288:iand            
	// 4971 9289:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4972 9292:aload_0         
	// 4973 9293:getfield        #12  <Field azh a>
	// 4974 9296:astore_1        
		abyte0.bz = ((azh) (abyte0)).ax ^ a.bz;
	// 4975 9297:aload_1         
	// 4976 9298:aload_1         
	// 4977 9299:getfield        #283 <Field int azh.ax>
	// 4978 9302:aload_0         
	// 4979 9303:getfield        #12  <Field azh a>
	// 4980 9306:getfield        #400 <Field int azh.bz>
	// 4981 9309:ixor            
	// 4982 9310:putfield        #400 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 4983 9313:aload_0         
	// 4984 9314:getfield        #12  <Field azh a>
	// 4985 9317:astore_1        
		abyte0.bW = ((azh) (abyte0)).bz ^ a.bW;
	// 4986 9318:aload_1         
	// 4987 9319:aload_1         
	// 4988 9320:getfield        #400 <Field int azh.bz>
	// 4989 9323:aload_0         
	// 4990 9324:getfield        #12  <Field azh a>
	// 4991 9327:getfield        #394 <Field int azh.bW>
	// 4992 9330:ixor            
	// 4993 9331:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4994 9334:aload_0         
	// 4995 9335:getfield        #12  <Field azh a>
	// 4996 9338:astore_1        
		abyte0.bW = ((azh) (abyte0)).bW & ~a.ai;
	// 4997 9339:aload_1         
	// 4998 9340:aload_1         
	// 4999 9341:getfield        #394 <Field int azh.bW>
	// 5000 9344:aload_0         
	// 5001 9345:getfield        #12  <Field azh a>
	// 5002 9348:getfield        #113 <Field int azh.ai>
	// 5003 9351:iconst_m1       
	// 5004 9352:ixor            
	// 5005 9353:iand            
	// 5006 9354:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 5007 9357:aload_0         
	// 5008 9358:getfield        #12  <Field azh a>
	// 5009 9361:astore_1        
		abyte0.bz = ((azh) (abyte0)).K & ~a.aa;
	// 5010 9362:aload_1         
	// 5011 9363:aload_1         
	// 5012 9364:getfield        #388 <Field int azh.K>
	// 5013 9367:aload_0         
	// 5014 9368:getfield        #12  <Field azh a>
	// 5015 9371:getfield        #382 <Field int azh.aa>
	// 5016 9374:iconst_m1       
	// 5017 9375:ixor            
	// 5018 9376:iand            
	// 5019 9377:putfield        #400 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5020 9380:aload_0         
	// 5021 9381:getfield        #12  <Field azh a>
	// 5022 9384:astore_1        
		abyte0.aY = ((azh) (abyte0)).aa ^ a.aY;
	// 5023 9385:aload_1         
	// 5024 9386:aload_1         
	// 5025 9387:getfield        #382 <Field int azh.aa>
	// 5026 9390:aload_0         
	// 5027 9391:getfield        #12  <Field azh a>
	// 5028 9394:getfield        #403 <Field int azh.aY>
	// 5029 9397:ixor            
	// 5030 9398:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5031 9401:aload_0         
	// 5032 9402:getfield        #12  <Field azh a>
	// 5033 9405:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY & ~a.S;
	// 5034 9406:aload_1         
	// 5035 9407:aload_1         
	// 5036 9408:getfield        #403 <Field int azh.aY>
	// 5037 9411:aload_0         
	// 5038 9412:getfield        #12  <Field azh a>
	// 5039 9415:getfield        #391 <Field int azh.S>
	// 5040 9418:iconst_m1       
	// 5041 9419:ixor            
	// 5042 9420:iand            
	// 5043 9421:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5044 9424:aload_0         
	// 5045 9425:getfield        #12  <Field azh a>
	// 5046 9428:astore_1        
		abyte0.aY = ((azh) (abyte0)).aa ^ a.aY;
	// 5047 9429:aload_1         
	// 5048 9430:aload_1         
	// 5049 9431:getfield        #382 <Field int azh.aa>
	// 5050 9434:aload_0         
	// 5051 9435:getfield        #12  <Field azh a>
	// 5052 9438:getfield        #403 <Field int azh.aY>
	// 5053 9441:ixor            
	// 5054 9442:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5055 9445:aload_0         
	// 5056 9446:getfield        #12  <Field azh a>
	// 5057 9449:astore_1        
		abyte0.aY = ((azh) (abyte0)).g & a.aY;
	// 5058 9450:aload_1         
	// 5059 9451:aload_1         
	// 5060 9452:getfield        #116 <Field int azh.g>
	// 5061 9455:aload_0         
	// 5062 9456:getfield        #12  <Field azh a>
	// 5063 9459:getfield        #403 <Field int azh.aY>
	// 5064 9462:iand            
	// 5065 9463:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5066 9466:aload_0         
	// 5067 9467:getfield        #12  <Field azh a>
	// 5068 9470:astore_1        
		abyte0.aY = ((azh) (abyte0)).bo ^ a.aY;
	// 5069 9471:aload_1         
	// 5070 9472:aload_1         
	// 5071 9473:getfield        #310 <Field int azh.bo>
	// 5072 9476:aload_0         
	// 5073 9477:getfield        #12  <Field azh a>
	// 5074 9480:getfield        #403 <Field int azh.aY>
	// 5075 9483:ixor            
	// 5076 9484:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5077 9487:aload_0         
	// 5078 9488:getfield        #12  <Field azh a>
	// 5079 9491:astore_1        
		abyte0.aY = ((azh) (abyte0)).ai | a.aY;
	// 5080 9492:aload_1         
	// 5081 9493:aload_1         
	// 5082 9494:getfield        #113 <Field int azh.ai>
	// 5083 9497:aload_0         
	// 5084 9498:getfield        #12  <Field azh a>
	// 5085 9501:getfield        #403 <Field int azh.aY>
	// 5086 9504:ior             
	// 5087 9505:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5088 9508:aload_0         
	// 5089 9509:getfield        #12  <Field azh a>
	// 5090 9512:astore_1        
		abyte0.bo = ((azh) (abyte0)).aa & ~a.S;
	// 5091 9513:aload_1         
	// 5092 9514:aload_1         
	// 5093 9515:getfield        #382 <Field int azh.aa>
	// 5094 9518:aload_0         
	// 5095 9519:getfield        #12  <Field azh a>
	// 5096 9522:getfield        #391 <Field int azh.S>
	// 5097 9525:iconst_m1       
	// 5098 9526:ixor            
	// 5099 9527:iand            
	// 5100 9528:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5101 9531:aload_0         
	// 5102 9532:getfield        #12  <Field azh a>
	// 5103 9535:astore_1        
		abyte0.bo = ((azh) (abyte0)).ci ^ a.bo;
	// 5104 9536:aload_1         
	// 5105 9537:aload_1         
	// 5106 9538:getfield        #220 <Field int azh.ci>
	// 5107 9541:aload_0         
	// 5108 9542:getfield        #12  <Field azh a>
	// 5109 9545:getfield        #310 <Field int azh.bo>
	// 5110 9548:ixor            
	// 5111 9549:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5112 9552:aload_0         
	// 5113 9553:getfield        #12  <Field azh a>
	// 5114 9556:astore_1        
		abyte0.bo = ((azh) (abyte0)).g & a.bo;
	// 5115 9557:aload_1         
	// 5116 9558:aload_1         
	// 5117 9559:getfield        #116 <Field int azh.g>
	// 5118 9562:aload_0         
	// 5119 9563:getfield        #12  <Field azh a>
	// 5120 9566:getfield        #310 <Field int azh.bo>
	// 5121 9569:iand            
	// 5122 9570:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5123 9573:aload_0         
	// 5124 9574:getfield        #12  <Field azh a>
	// 5125 9577:astore_1        
		abyte0.bo = ((azh) (abyte0)).bi ^ a.bo;
	// 5126 9578:aload_1         
	// 5127 9579:aload_1         
	// 5128 9580:getfield        #406 <Field int azh.bi>
	// 5129 9583:aload_0         
	// 5130 9584:getfield        #12  <Field azh a>
	// 5131 9587:getfield        #310 <Field int azh.bo>
	// 5132 9590:ixor            
	// 5133 9591:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5134 9594:aload_0         
	// 5135 9595:getfield        #12  <Field azh a>
	// 5136 9598:astore_1        
		abyte0.bo = ((azh) (abyte0)).ai | a.bo;
	// 5137 9599:aload_1         
	// 5138 9600:aload_1         
	// 5139 9601:getfield        #113 <Field int azh.ai>
	// 5140 9604:aload_0         
	// 5141 9605:getfield        #12  <Field azh a>
	// 5142 9608:getfield        #310 <Field int azh.bo>
	// 5143 9611:ior             
	// 5144 9612:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5145 9615:aload_0         
	// 5146 9616:getfield        #12  <Field azh a>
	// 5147 9619:astore_1        
		abyte0.bi = ((azh) (abyte0)).C & ~a.aa;
	// 5148 9620:aload_1         
	// 5149 9621:aload_1         
	// 5150 9622:getfield        #385 <Field int azh.C>
	// 5151 9625:aload_0         
	// 5152 9626:getfield        #12  <Field azh a>
	// 5153 9629:getfield        #382 <Field int azh.aa>
	// 5154 9632:iconst_m1       
	// 5155 9633:ixor            
	// 5156 9634:iand            
	// 5157 9635:putfield        #406 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 5158 9638:aload_0         
	// 5159 9639:getfield        #12  <Field azh a>
	// 5160 9642:astore_1        
		abyte0.bq = ((azh) (abyte0)).K & ~a.bi;
	// 5161 9643:aload_1         
	// 5162 9644:aload_1         
	// 5163 9645:getfield        #388 <Field int azh.K>
	// 5164 9648:aload_0         
	// 5165 9649:getfield        #12  <Field azh a>
	// 5166 9652:getfield        #406 <Field int azh.bi>
	// 5167 9655:iconst_m1       
	// 5168 9656:ixor            
	// 5169 9657:iand            
	// 5170 9658:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 5171 9661:aload_0         
	// 5172 9662:getfield        #12  <Field azh a>
	// 5173 9665:astore_1        
		abyte0.bq = ((azh) (abyte0)).aa ^ a.bq;
	// 5174 9666:aload_1         
	// 5175 9667:aload_1         
	// 5176 9668:getfield        #382 <Field int azh.aa>
	// 5177 9671:aload_0         
	// 5178 9672:getfield        #12  <Field azh a>
	// 5179 9675:getfield        #26  <Field int azh.bq>
	// 5180 9678:ixor            
	// 5181 9679:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 5182 9682:aload_0         
	// 5183 9683:getfield        #12  <Field azh a>
	// 5184 9686:astore_1        
		abyte0.bq = ((azh) (abyte0)).S | a.bq;
	// 5185 9687:aload_1         
	// 5186 9688:aload_1         
	// 5187 9689:getfield        #391 <Field int azh.S>
	// 5188 9692:aload_0         
	// 5189 9693:getfield        #12  <Field azh a>
	// 5190 9696:getfield        #26  <Field int azh.bq>
	// 5191 9699:ior             
	// 5192 9700:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 5193 9703:aload_0         
	// 5194 9704:getfield        #12  <Field azh a>
	// 5195 9707:astore_1        
		abyte0.bq = ((azh) (abyte0)).cd ^ a.bq;
	// 5196 9708:aload_1         
	// 5197 9709:aload_1         
	// 5198 9710:getfield        #149 <Field int azh.cd>
	// 5199 9713:aload_0         
	// 5200 9714:getfield        #12  <Field azh a>
	// 5201 9717:getfield        #26  <Field int azh.bq>
	// 5202 9720:ixor            
	// 5203 9721:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 5204 9724:aload_0         
	// 5205 9725:getfield        #12  <Field azh a>
	// 5206 9728:astore_1        
		abyte0.bq = ((azh) (abyte0)).g & a.bq;
	// 5207 9729:aload_1         
	// 5208 9730:aload_1         
	// 5209 9731:getfield        #116 <Field int azh.g>
	// 5210 9734:aload_0         
	// 5211 9735:getfield        #12  <Field azh a>
	// 5212 9738:getfield        #26  <Field int azh.bq>
	// 5213 9741:iand            
	// 5214 9742:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 5215 9745:aload_0         
	// 5216 9746:getfield        #12  <Field azh a>
	// 5217 9749:astore_1        
		abyte0.cd = ((azh) (abyte0)).K & ~a.bi;
	// 5218 9750:aload_1         
	// 5219 9751:aload_1         
	// 5220 9752:getfield        #388 <Field int azh.K>
	// 5221 9755:aload_0         
	// 5222 9756:getfield        #12  <Field azh a>
	// 5223 9759:getfield        #406 <Field int azh.bi>
	// 5224 9762:iconst_m1       
	// 5225 9763:ixor            
	// 5226 9764:iand            
	// 5227 9765:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5228 9768:aload_0         
	// 5229 9769:getfield        #12  <Field azh a>
	// 5230 9772:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd & ~a.S;
	// 5231 9773:aload_1         
	// 5232 9774:aload_1         
	// 5233 9775:getfield        #149 <Field int azh.cd>
	// 5234 9778:aload_0         
	// 5235 9779:getfield        #12  <Field azh a>
	// 5236 9782:getfield        #391 <Field int azh.S>
	// 5237 9785:iconst_m1       
	// 5238 9786:ixor            
	// 5239 9787:iand            
	// 5240 9788:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5241 9791:aload_0         
	// 5242 9792:getfield        #12  <Field azh a>
	// 5243 9795:astore_1        
		abyte0.aO = ((azh) (abyte0)).bi & ~a.S;
	// 5244 9796:aload_1         
	// 5245 9797:aload_1         
	// 5246 9798:getfield        #406 <Field int azh.bi>
	// 5247 9801:aload_0         
	// 5248 9802:getfield        #12  <Field azh a>
	// 5249 9805:getfield        #391 <Field int azh.S>
	// 5250 9808:iconst_m1       
	// 5251 9809:ixor            
	// 5252 9810:iand            
	// 5253 9811:putfield        #152 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5254 9814:aload_0         
	// 5255 9815:getfield        #12  <Field azh a>
	// 5256 9818:astore_1        
		abyte0.bi = ((azh) (abyte0)).K & a.bi;
	// 5257 9819:aload_1         
	// 5258 9820:aload_1         
	// 5259 9821:getfield        #388 <Field int azh.K>
	// 5260 9824:aload_0         
	// 5261 9825:getfield        #12  <Field azh a>
	// 5262 9828:getfield        #406 <Field int azh.bi>
	// 5263 9831:iand            
	// 5264 9832:putfield        #406 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 5265 9835:aload_0         
	// 5266 9836:getfield        #12  <Field azh a>
	// 5267 9839:astore_1        
		abyte0.bi = ((azh) (abyte0)).C ^ a.bi;
	// 5268 9840:aload_1         
	// 5269 9841:aload_1         
	// 5270 9842:getfield        #385 <Field int azh.C>
	// 5271 9845:aload_0         
	// 5272 9846:getfield        #12  <Field azh a>
	// 5273 9849:getfield        #406 <Field int azh.bi>
	// 5274 9852:ixor            
	// 5275 9853:putfield        #406 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 5276 9856:aload_0         
	// 5277 9857:getfield        #12  <Field azh a>
	// 5278 9860:astore_1        
		abyte0.bi = ((azh) (abyte0)).bi & a.S;
	// 5279 9861:aload_1         
	// 5280 9862:aload_1         
	// 5281 9863:getfield        #406 <Field int azh.bi>
	// 5282 9866:aload_0         
	// 5283 9867:getfield        #12  <Field azh a>
	// 5284 9870:getfield        #391 <Field int azh.S>
	// 5285 9873:iand            
	// 5286 9874:putfield        #406 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 5287 9877:aload_0         
	// 5288 9878:getfield        #12  <Field azh a>
	// 5289 9881:astore_1        
		abyte0.bi = ((azh) (abyte0)).g & ~a.bi;
	// 5290 9882:aload_1         
	// 5291 9883:aload_1         
	// 5292 9884:getfield        #116 <Field int azh.g>
	// 5293 9887:aload_0         
	// 5294 9888:getfield        #12  <Field azh a>
	// 5295 9891:getfield        #406 <Field int azh.bi>
	// 5296 9894:iconst_m1       
	// 5297 9895:ixor            
	// 5298 9896:iand            
	// 5299 9897:putfield        #406 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 5300 9900:aload_0         
	// 5301 9901:getfield        #12  <Field azh a>
	// 5302 9904:astore_1        
		abyte0.aD = ((azh) (abyte0)).C & a.aa;
	// 5303 9905:aload_1         
	// 5304 9906:aload_1         
	// 5305 9907:getfield        #385 <Field int azh.C>
	// 5306 9910:aload_0         
	// 5307 9911:getfield        #12  <Field azh a>
	// 5308 9914:getfield        #382 <Field int azh.aa>
	// 5309 9917:iand            
	// 5310 9918:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5311 9921:aload_0         
	// 5312 9922:getfield        #12  <Field azh a>
	// 5313 9925:astore_1        
		abyte0.bF = ((azh) (abyte0)).K & a.aD;
	// 5314 9926:aload_1         
	// 5315 9927:aload_1         
	// 5316 9928:getfield        #388 <Field int azh.K>
	// 5317 9931:aload_0         
	// 5318 9932:getfield        #12  <Field azh a>
	// 5319 9935:getfield        #202 <Field int azh.aD>
	// 5320 9938:iand            
	// 5321 9939:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5322 9942:aload_0         
	// 5323 9943:getfield        #12  <Field azh a>
	// 5324 9946:astore_1        
		abyte0.bF = ((azh) (abyte0)).aa ^ a.bF;
	// 5325 9947:aload_1         
	// 5326 9948:aload_1         
	// 5327 9949:getfield        #382 <Field int azh.aa>
	// 5328 9952:aload_0         
	// 5329 9953:getfield        #12  <Field azh a>
	// 5330 9956:getfield        #89  <Field int azh.bF>
	// 5331 9959:ixor            
	// 5332 9960:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5333 9963:aload_0         
	// 5334 9964:getfield        #12  <Field azh a>
	// 5335 9967:astore_1        
		abyte0.bF = ((azh) (abyte0)).bF & ~a.S;
	// 5336 9968:aload_1         
	// 5337 9969:aload_1         
	// 5338 9970:getfield        #89  <Field int azh.bF>
	// 5339 9973:aload_0         
	// 5340 9974:getfield        #12  <Field azh a>
	// 5341 9977:getfield        #391 <Field int azh.S>
	// 5342 9980:iconst_m1       
	// 5343 9981:ixor            
	// 5344 9982:iand            
	// 5345 9983:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5346 9986:aload_0         
	// 5347 9987:getfield        #12  <Field azh a>
	// 5348 9990:astore_1        
		abyte0.bF = ((azh) (abyte0)).ci ^ a.bF;
	// 5349 9991:aload_1         
	// 5350 9992:aload_1         
	// 5351 9993:getfield        #220 <Field int azh.ci>
	// 5352 9996:aload_0         
	// 5353 9997:getfield        #12  <Field azh a>
	// 5354 10000:getfield        #89  <Field int azh.bF>
	// 5355 10003:ixor            
	// 5356 10004:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5357 10007:aload_0         
	// 5358 10008:getfield        #12  <Field azh a>
	// 5359 10011:astore_1        
		abyte0.bF = ((azh) (abyte0)).g & ~a.bF;
	// 5360 10012:aload_1         
	// 5361 10013:aload_1         
	// 5362 10014:getfield        #116 <Field int azh.g>
	// 5363 10017:aload_0         
	// 5364 10018:getfield        #12  <Field azh a>
	// 5365 10021:getfield        #89  <Field int azh.bF>
	// 5366 10024:iconst_m1       
	// 5367 10025:ixor            
	// 5368 10026:iand            
	// 5369 10027:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5370 10030:aload_0         
	// 5371 10031:getfield        #12  <Field azh a>
	// 5372 10034:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD ^ a.K;
	// 5373 10035:aload_1         
	// 5374 10036:aload_1         
	// 5375 10037:getfield        #202 <Field int azh.aD>
	// 5376 10040:aload_0         
	// 5377 10041:getfield        #12  <Field azh a>
	// 5378 10044:getfield        #388 <Field int azh.K>
	// 5379 10047:ixor            
	// 5380 10048:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5381 10051:aload_0         
	// 5382 10052:getfield        #12  <Field azh a>
	// 5383 10055:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD & a.S;
	// 5384 10056:aload_1         
	// 5385 10057:aload_1         
	// 5386 10058:getfield        #202 <Field int azh.aD>
	// 5387 10061:aload_0         
	// 5388 10062:getfield        #12  <Field azh a>
	// 5389 10065:getfield        #391 <Field int azh.S>
	// 5390 10068:iand            
	// 5391 10069:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5392 10072:aload_0         
	// 5393 10073:getfield        #12  <Field azh a>
	// 5394 10076:astore_1        
		abyte0.aD = ((azh) (abyte0)).bt ^ a.aD;
	// 5395 10077:aload_1         
	// 5396 10078:aload_1         
	// 5397 10079:getfield        #397 <Field int azh.bt>
	// 5398 10082:aload_0         
	// 5399 10083:getfield        #12  <Field azh a>
	// 5400 10086:getfield        #202 <Field int azh.aD>
	// 5401 10089:ixor            
	// 5402 10090:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5403 10093:aload_0         
	// 5404 10094:getfield        #12  <Field azh a>
	// 5405 10097:astore_1        
		abyte0.aD = ((azh) (abyte0)).g & a.aD;
	// 5406 10098:aload_1         
	// 5407 10099:aload_1         
	// 5408 10100:getfield        #116 <Field int azh.g>
	// 5409 10103:aload_0         
	// 5410 10104:getfield        #12  <Field azh a>
	// 5411 10107:getfield        #202 <Field int azh.aD>
	// 5412 10110:iand            
	// 5413 10111:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5414 10114:aload_0         
	// 5415 10115:getfield        #12  <Field azh a>
	// 5416 10118:astore_1        
		abyte0.bt = ((azh) (abyte0)).C ^ a.aa;
	// 5417 10119:aload_1         
	// 5418 10120:aload_1         
	// 5419 10121:getfield        #385 <Field int azh.C>
	// 5420 10124:aload_0         
	// 5421 10125:getfield        #12  <Field azh a>
	// 5422 10128:getfield        #382 <Field int azh.aa>
	// 5423 10131:ixor            
	// 5424 10132:putfield        #397 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 5425 10135:aload_0         
	// 5426 10136:getfield        #12  <Field azh a>
	// 5427 10139:astore_1        
		abyte0.ci = ((azh) (abyte0)).K & ~a.bt;
	// 5428 10140:aload_1         
	// 5429 10141:aload_1         
	// 5430 10142:getfield        #388 <Field int azh.K>
	// 5431 10145:aload_0         
	// 5432 10146:getfield        #12  <Field azh a>
	// 5433 10149:getfield        #397 <Field int azh.bt>
	// 5434 10152:iconst_m1       
	// 5435 10153:ixor            
	// 5436 10154:iand            
	// 5437 10155:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 5438 10158:aload_0         
	// 5439 10159:getfield        #12  <Field azh a>
	// 5440 10162:astore_1        
		abyte0.ci = ((azh) (abyte0)).bn ^ a.ci;
	// 5441 10163:aload_1         
	// 5442 10164:aload_1         
	// 5443 10165:getfield        #358 <Field int azh.bn>
	// 5444 10168:aload_0         
	// 5445 10169:getfield        #12  <Field azh a>
	// 5446 10172:getfield        #220 <Field int azh.ci>
	// 5447 10175:ixor            
	// 5448 10176:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 5449 10179:aload_0         
	// 5450 10180:getfield        #12  <Field azh a>
	// 5451 10183:astore_1        
		abyte0.aS = ((azh) (abyte0)).ci ^ a.aS;
	// 5452 10184:aload_1         
	// 5453 10185:aload_1         
	// 5454 10186:getfield        #220 <Field int azh.ci>
	// 5455 10189:aload_0         
	// 5456 10190:getfield        #12  <Field azh a>
	// 5457 10193:getfield        #214 <Field int azh.aS>
	// 5458 10196:ixor            
	// 5459 10197:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 5460 10200:aload_0         
	// 5461 10201:getfield        #12  <Field azh a>
	// 5462 10204:astore_1        
		abyte0.aD = ((azh) (abyte0)).aS ^ a.aD;
	// 5463 10205:aload_1         
	// 5464 10206:aload_1         
	// 5465 10207:getfield        #214 <Field int azh.aS>
	// 5466 10210:aload_0         
	// 5467 10211:getfield        #12  <Field azh a>
	// 5468 10214:getfield        #202 <Field int azh.aD>
	// 5469 10217:ixor            
	// 5470 10218:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5471 10221:aload_0         
	// 5472 10222:getfield        #12  <Field azh a>
	// 5473 10225:astore_1        
		abyte0.aS = ((azh) (abyte0)).bt ^ a.K;
	// 5474 10226:aload_1         
	// 5475 10227:aload_1         
	// 5476 10228:getfield        #397 <Field int azh.bt>
	// 5477 10231:aload_0         
	// 5478 10232:getfield        #12  <Field azh a>
	// 5479 10235:getfield        #388 <Field int azh.K>
	// 5480 10238:ixor            
	// 5481 10239:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 5482 10242:aload_0         
	// 5483 10243:getfield        #12  <Field azh a>
	// 5484 10246:astore_1        
		abyte0.ci = ((azh) (abyte0)).aS ^ a.S;
	// 5485 10247:aload_1         
	// 5486 10248:aload_1         
	// 5487 10249:getfield        #214 <Field int azh.aS>
	// 5488 10252:aload_0         
	// 5489 10253:getfield        #12  <Field azh a>
	// 5490 10256:getfield        #391 <Field int azh.S>
	// 5491 10259:ixor            
	// 5492 10260:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 5493 10263:aload_0         
	// 5494 10264:getfield        #12  <Field azh a>
	// 5495 10267:astore_1        
		abyte0.bi = ((azh) (abyte0)).ci ^ a.bi;
	// 5496 10268:aload_1         
	// 5497 10269:aload_1         
	// 5498 10270:getfield        #220 <Field int azh.ci>
	// 5499 10273:aload_0         
	// 5500 10274:getfield        #12  <Field azh a>
	// 5501 10277:getfield        #406 <Field int azh.bi>
	// 5502 10280:ixor            
	// 5503 10281:putfield        #406 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 5504 10284:aload_0         
	// 5505 10285:getfield        #12  <Field azh a>
	// 5506 10288:astore_1        
		abyte0.aY = ((azh) (abyte0)).bi ^ a.aY;
	// 5507 10289:aload_1         
	// 5508 10290:aload_1         
	// 5509 10291:getfield        #406 <Field int azh.bi>
	// 5510 10294:aload_0         
	// 5511 10295:getfield        #12  <Field azh a>
	// 5512 10298:getfield        #403 <Field int azh.aY>
	// 5513 10301:ixor            
	// 5514 10302:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5515 10305:aload_0         
	// 5516 10306:getfield        #12  <Field azh a>
	// 5517 10309:astore_1        
		abyte0.d = ((azh) (abyte0)).aY ^ a.d;
	// 5518 10310:aload_1         
	// 5519 10311:aload_1         
	// 5520 10312:getfield        #403 <Field int azh.aY>
	// 5521 10315:aload_0         
	// 5522 10316:getfield        #12  <Field azh a>
	// 5523 10319:getfield        #409 <Field int azh.d>
	// 5524 10322:ixor            
	// 5525 10323:putfield        #409 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 5526 10326:aload_0         
	// 5527 10327:getfield        #12  <Field azh a>
	// 5528 10330:astore_1        
		abyte0.bc = ((azh) (abyte0)).bc & ~a.d;
	// 5529 10331:aload_1         
	// 5530 10332:aload_1         
	// 5531 10333:getfield        #131 <Field int azh.bc>
	// 5532 10336:aload_0         
	// 5533 10337:getfield        #12  <Field azh a>
	// 5534 10340:getfield        #409 <Field int azh.d>
	// 5535 10343:iconst_m1       
	// 5536 10344:ixor            
	// 5537 10345:iand            
	// 5538 10346:putfield        #131 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 5539 10349:aload_0         
	// 5540 10350:getfield        #12  <Field azh a>
	// 5541 10353:astore_1        
		abyte0.aY = ((azh) (abyte0)).d & a.H;
	// 5542 10354:aload_1         
	// 5543 10355:aload_1         
	// 5544 10356:getfield        #409 <Field int azh.d>
	// 5545 10359:aload_0         
	// 5546 10360:getfield        #12  <Field azh a>
	// 5547 10363:getfield        #235 <Field int azh.H>
	// 5548 10366:iand            
	// 5549 10367:putfield        #403 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 5550 10370:aload_0         
	// 5551 10371:getfield        #12  <Field azh a>
	// 5552 10374:astore_1        
		abyte0.bz = ((azh) (abyte0)).bt ^ a.bz;
	// 5553 10375:aload_1         
	// 5554 10376:aload_1         
	// 5555 10377:getfield        #397 <Field int azh.bt>
	// 5556 10380:aload_0         
	// 5557 10381:getfield        #12  <Field azh a>
	// 5558 10384:getfield        #400 <Field int azh.bz>
	// 5559 10387:ixor            
	// 5560 10388:putfield        #400 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5561 10391:aload_0         
	// 5562 10392:getfield        #12  <Field azh a>
	// 5563 10395:astore_1        
		abyte0.cd = ((azh) (abyte0)).bz ^ a.cd;
	// 5564 10396:aload_1         
	// 5565 10397:aload_1         
	// 5566 10398:getfield        #400 <Field int azh.bz>
	// 5567 10401:aload_0         
	// 5568 10402:getfield        #12  <Field azh a>
	// 5569 10405:getfield        #149 <Field int azh.cd>
	// 5570 10408:ixor            
	// 5571 10409:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5572 10412:aload_0         
	// 5573 10413:getfield        #12  <Field azh a>
	// 5574 10416:astore_1        
		abyte0.bF = ((azh) (abyte0)).cd ^ a.bF;
	// 5575 10417:aload_1         
	// 5576 10418:aload_1         
	// 5577 10419:getfield        #149 <Field int azh.cd>
	// 5578 10422:aload_0         
	// 5579 10423:getfield        #12  <Field azh a>
	// 5580 10426:getfield        #89  <Field int azh.bF>
	// 5581 10429:ixor            
	// 5582 10430:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5583 10433:aload_0         
	// 5584 10434:getfield        #12  <Field azh a>
	// 5585 10437:astore_1        
		abyte0.bo = ((azh) (abyte0)).bF ^ a.bo;
	// 5586 10438:aload_1         
	// 5587 10439:aload_1         
	// 5588 10440:getfield        #89  <Field int azh.bF>
	// 5589 10443:aload_0         
	// 5590 10444:getfield        #12  <Field azh a>
	// 5591 10447:getfield        #310 <Field int azh.bo>
	// 5592 10450:ixor            
	// 5593 10451:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5594 10454:aload_0         
	// 5595 10455:getfield        #12  <Field azh a>
	// 5596 10458:astore_1        
		abyte0.f = ((azh) (abyte0)).bo ^ a.f;
	// 5597 10459:aload_1         
	// 5598 10460:aload_1         
	// 5599 10461:getfield        #310 <Field int azh.bo>
	// 5600 10464:aload_0         
	// 5601 10465:getfield        #12  <Field azh a>
	// 5602 10468:getfield        #412 <Field int azh.f>
	// 5603 10471:ixor            
	// 5604 10472:putfield        #412 <Field int azh.f>
		abyte0 = ((byte []) (a));
	// 5605 10475:aload_0         
	// 5606 10476:getfield        #12  <Field azh a>
	// 5607 10479:astore_1        
		abyte0.bo = ((azh) (abyte0)).f ^ a.Z;
	// 5608 10480:aload_1         
	// 5609 10481:aload_1         
	// 5610 10482:getfield        #412 <Field int azh.f>
	// 5611 10485:aload_0         
	// 5612 10486:getfield        #12  <Field azh a>
	// 5613 10489:getfield        #355 <Field int azh.Z>
	// 5614 10492:ixor            
	// 5615 10493:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5616 10496:aload_0         
	// 5617 10497:getfield        #12  <Field azh a>
	// 5618 10500:astore_1        
		abyte0.bF = ((azh) (abyte0)).f | a.Z;
	// 5619 10501:aload_1         
	// 5620 10502:aload_1         
	// 5621 10503:getfield        #412 <Field int azh.f>
	// 5622 10506:aload_0         
	// 5623 10507:getfield        #12  <Field azh a>
	// 5624 10510:getfield        #355 <Field int azh.Z>
	// 5625 10513:ior             
	// 5626 10514:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5627 10517:aload_0         
	// 5628 10518:getfield        #12  <Field azh a>
	// 5629 10521:astore_1        
		abyte0.cd = ((azh) (abyte0)).bF & ~a.Z;
	// 5630 10522:aload_1         
	// 5631 10523:aload_1         
	// 5632 10524:getfield        #89  <Field int azh.bF>
	// 5633 10527:aload_0         
	// 5634 10528:getfield        #12  <Field azh a>
	// 5635 10531:getfield        #355 <Field int azh.Z>
	// 5636 10534:iconst_m1       
	// 5637 10535:ixor            
	// 5638 10536:iand            
	// 5639 10537:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5640 10540:aload_0         
	// 5641 10541:getfield        #12  <Field azh a>
	// 5642 10544:astore_1        
		abyte0.bz = ((azh) (abyte0)).f & ~a.Z;
	// 5643 10545:aload_1         
	// 5644 10546:aload_1         
	// 5645 10547:getfield        #412 <Field int azh.f>
	// 5646 10550:aload_0         
	// 5647 10551:getfield        #12  <Field azh a>
	// 5648 10554:getfield        #355 <Field int azh.Z>
	// 5649 10557:iconst_m1       
	// 5650 10558:ixor            
	// 5651 10559:iand            
	// 5652 10560:putfield        #400 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5653 10563:aload_0         
	// 5654 10564:getfield        #12  <Field azh a>
	// 5655 10567:astore_1        
		abyte0.bi = ((azh) (abyte0)).Z & a.f;
	// 5656 10568:aload_1         
	// 5657 10569:aload_1         
	// 5658 10570:getfield        #355 <Field int azh.Z>
	// 5659 10573:aload_0         
	// 5660 10574:getfield        #12  <Field azh a>
	// 5661 10577:getfield        #412 <Field int azh.f>
	// 5662 10580:iand            
	// 5663 10581:putfield        #406 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 5664 10584:aload_0         
	// 5665 10585:getfield        #12  <Field azh a>
	// 5666 10588:astore_1        
		abyte0.ci = ((azh) (abyte0)).Z & ~a.bi;
	// 5667 10589:aload_1         
	// 5668 10590:aload_1         
	// 5669 10591:getfield        #355 <Field int azh.Z>
	// 5670 10594:aload_0         
	// 5671 10595:getfield        #12  <Field azh a>
	// 5672 10598:getfield        #406 <Field int azh.bi>
	// 5673 10601:iconst_m1       
	// 5674 10602:ixor            
	// 5675 10603:iand            
	// 5676 10604:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 5677 10607:aload_0         
	// 5678 10608:getfield        #12  <Field azh a>
	// 5679 10611:astore_1        
		abyte0.bn = ((azh) (abyte0)).K & a.bt;
	// 5680 10612:aload_1         
	// 5681 10613:aload_1         
	// 5682 10614:getfield        #388 <Field int azh.K>
	// 5683 10617:aload_0         
	// 5684 10618:getfield        #12  <Field azh a>
	// 5685 10621:getfield        #397 <Field int azh.bt>
	// 5686 10624:iand            
	// 5687 10625:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5688 10628:aload_0         
	// 5689 10629:getfield        #12  <Field azh a>
	// 5690 10632:astore_1        
		abyte0.bn = ((azh) (abyte0)).ax ^ a.bn;
	// 5691 10633:aload_1         
	// 5692 10634:aload_1         
	// 5693 10635:getfield        #283 <Field int azh.ax>
	// 5694 10638:aload_0         
	// 5695 10639:getfield        #12  <Field azh a>
	// 5696 10642:getfield        #358 <Field int azh.bn>
	// 5697 10645:ixor            
	// 5698 10646:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5699 10649:aload_0         
	// 5700 10650:getfield        #12  <Field azh a>
	// 5701 10653:astore_1        
		abyte0.aO = ((azh) (abyte0)).bn ^ a.aO;
	// 5702 10654:aload_1         
	// 5703 10655:aload_1         
	// 5704 10656:getfield        #358 <Field int azh.bn>
	// 5705 10659:aload_0         
	// 5706 10660:getfield        #12  <Field azh a>
	// 5707 10663:getfield        #152 <Field int azh.aO>
	// 5708 10666:ixor            
	// 5709 10667:putfield        #152 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5710 10670:aload_0         
	// 5711 10671:getfield        #12  <Field azh a>
	// 5712 10674:astore_1        
		abyte0.bn = ((azh) (abyte0)).g & a.aO;
	// 5713 10675:aload_1         
	// 5714 10676:aload_1         
	// 5715 10677:getfield        #116 <Field int azh.g>
	// 5716 10680:aload_0         
	// 5717 10681:getfield        #12  <Field azh a>
	// 5718 10684:getfield        #152 <Field int azh.aO>
	// 5719 10687:iand            
	// 5720 10688:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5721 10691:aload_0         
	// 5722 10692:getfield        #12  <Field azh a>
	// 5723 10695:astore_1        
		abyte0.bn = ((azh) (abyte0)).aO ^ a.bn;
	// 5724 10696:aload_1         
	// 5725 10697:aload_1         
	// 5726 10698:getfield        #152 <Field int azh.aO>
	// 5727 10701:aload_0         
	// 5728 10702:getfield        #12  <Field azh a>
	// 5729 10705:getfield        #358 <Field int azh.bn>
	// 5730 10708:ixor            
	// 5731 10709:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5732 10712:aload_0         
	// 5733 10713:getfield        #12  <Field azh a>
	// 5734 10716:astore_1        
		abyte0.bn = ((azh) (abyte0)).ai | a.bn;
	// 5735 10717:aload_1         
	// 5736 10718:aload_1         
	// 5737 10719:getfield        #113 <Field int azh.ai>
	// 5738 10722:aload_0         
	// 5739 10723:getfield        #12  <Field azh a>
	// 5740 10726:getfield        #358 <Field int azh.bn>
	// 5741 10729:ior             
	// 5742 10730:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5743 10733:aload_0         
	// 5744 10734:getfield        #12  <Field azh a>
	// 5745 10737:astore_1        
		abyte0.bn = ((azh) (abyte0)).aD ^ a.bn;
	// 5746 10738:aload_1         
	// 5747 10739:aload_1         
	// 5748 10740:getfield        #202 <Field int azh.aD>
	// 5749 10743:aload_0         
	// 5750 10744:getfield        #12  <Field azh a>
	// 5751 10747:getfield        #358 <Field int azh.bn>
	// 5752 10750:ixor            
	// 5753 10751:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5754 10754:aload_0         
	// 5755 10755:getfield        #12  <Field azh a>
	// 5756 10758:astore_1        
		abyte0.x = ((azh) (abyte0)).bn ^ a.x;
	// 5757 10759:aload_1         
	// 5758 10760:aload_1         
	// 5759 10761:getfield        #358 <Field int azh.bn>
	// 5760 10764:aload_0         
	// 5761 10765:getfield        #12  <Field azh a>
	// 5762 10768:getfield        #415 <Field int azh.x>
	// 5763 10771:ixor            
	// 5764 10772:putfield        #415 <Field int azh.x>
		abyte0 = ((byte []) (a));
	// 5765 10775:aload_0         
	// 5766 10776:getfield        #12  <Field azh a>
	// 5767 10779:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB & ~a.x;
	// 5768 10780:aload_1         
	// 5769 10781:aload_1         
	// 5770 10782:getfield        #313 <Field int azh.aB>
	// 5771 10785:aload_0         
	// 5772 10786:getfield        #12  <Field azh a>
	// 5773 10789:getfield        #415 <Field int azh.x>
	// 5774 10792:iconst_m1       
	// 5775 10793:ixor            
	// 5776 10794:iand            
	// 5777 10795:putfield        #313 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 5778 10798:aload_0         
	// 5779 10799:getfield        #12  <Field azh a>
	// 5780 10802:astore_1        
		abyte0.bn = ((azh) (abyte0)).K & ~a.bt;
	// 5781 10803:aload_1         
	// 5782 10804:aload_1         
	// 5783 10805:getfield        #388 <Field int azh.K>
	// 5784 10808:aload_0         
	// 5785 10809:getfield        #12  <Field azh a>
	// 5786 10812:getfield        #397 <Field int azh.bt>
	// 5787 10815:iconst_m1       
	// 5788 10816:ixor            
	// 5789 10817:iand            
	// 5790 10818:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5791 10821:aload_0         
	// 5792 10822:getfield        #12  <Field azh a>
	// 5793 10825:astore_1        
		abyte0.bn = ((azh) (abyte0)).bt ^ a.bn;
	// 5794 10826:aload_1         
	// 5795 10827:aload_1         
	// 5796 10828:getfield        #397 <Field int azh.bt>
	// 5797 10831:aload_0         
	// 5798 10832:getfield        #12  <Field azh a>
	// 5799 10835:getfield        #358 <Field int azh.bn>
	// 5800 10838:ixor            
	// 5801 10839:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5802 10842:aload_0         
	// 5803 10843:getfield        #12  <Field azh a>
	// 5804 10846:astore_1        
		abyte0.bn = ((azh) (abyte0)).S | a.bn;
	// 5805 10847:aload_1         
	// 5806 10848:aload_1         
	// 5807 10849:getfield        #391 <Field int azh.S>
	// 5808 10852:aload_0         
	// 5809 10853:getfield        #12  <Field azh a>
	// 5810 10856:getfield        #358 <Field int azh.bn>
	// 5811 10859:ior             
	// 5812 10860:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5813 10863:aload_0         
	// 5814 10864:getfield        #12  <Field azh a>
	// 5815 10867:astore_1        
		abyte0.bn = ((azh) (abyte0)).aS ^ a.bn;
	// 5816 10868:aload_1         
	// 5817 10869:aload_1         
	// 5818 10870:getfield        #214 <Field int azh.aS>
	// 5819 10873:aload_0         
	// 5820 10874:getfield        #12  <Field azh a>
	// 5821 10877:getfield        #358 <Field int azh.bn>
	// 5822 10880:ixor            
	// 5823 10881:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5824 10884:aload_0         
	// 5825 10885:getfield        #12  <Field azh a>
	// 5826 10888:astore_1        
		abyte0.bq = ((azh) (abyte0)).bn ^ a.bq;
	// 5827 10889:aload_1         
	// 5828 10890:aload_1         
	// 5829 10891:getfield        #358 <Field int azh.bn>
	// 5830 10894:aload_0         
	// 5831 10895:getfield        #12  <Field azh a>
	// 5832 10898:getfield        #26  <Field int azh.bq>
	// 5833 10901:ixor            
	// 5834 10902:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 5835 10905:aload_0         
	// 5836 10906:getfield        #12  <Field azh a>
	// 5837 10909:astore_1        
		abyte0.bW = ((azh) (abyte0)).bq ^ a.bW;
	// 5838 10910:aload_1         
	// 5839 10911:aload_1         
	// 5840 10912:getfield        #26  <Field int azh.bq>
	// 5841 10915:aload_0         
	// 5842 10916:getfield        #12  <Field azh a>
	// 5843 10919:getfield        #394 <Field int azh.bW>
	// 5844 10922:ixor            
	// 5845 10923:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 5846 10926:aload_0         
	// 5847 10927:getfield        #12  <Field azh a>
	// 5848 10930:astore_1        
		abyte0.r = ((azh) (abyte0)).bW ^ a.r;
	// 5849 10931:aload_1         
	// 5850 10932:aload_1         
	// 5851 10933:getfield        #394 <Field int azh.bW>
	// 5852 10936:aload_0         
	// 5853 10937:getfield        #12  <Field azh a>
	// 5854 10940:getfield        #71  <Field int azh.r>
	// 5855 10943:ixor            
	// 5856 10944:putfield        #71  <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5857 10947:aload_0         
	// 5858 10948:getfield        #12  <Field azh a>
	// 5859 10951:astore_1        
		abyte0.bx = ((azh) (abyte0)).L & ~a.bx;
	// 5860 10952:aload_1         
	// 5861 10953:aload_1         
	// 5862 10954:getfield        #271 <Field int azh.L>
	// 5863 10957:aload_0         
	// 5864 10958:getfield        #12  <Field azh a>
	// 5865 10961:getfield        #418 <Field int azh.bx>
	// 5866 10964:iconst_m1       
	// 5867 10965:ixor            
	// 5868 10966:iand            
	// 5869 10967:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 5870 10970:aload_0         
	// 5871 10971:getfield        #12  <Field azh a>
	// 5872 10974:astore_1        
		abyte0.bx = ((azh) (abyte0)).aE ^ a.bx;
	// 5873 10975:aload_1         
	// 5874 10976:aload_1         
	// 5875 10977:getfield        #421 <Field int azh.aE>
	// 5876 10980:aload_0         
	// 5877 10981:getfield        #12  <Field azh a>
	// 5878 10984:getfield        #418 <Field int azh.bx>
	// 5879 10987:ixor            
	// 5880 10988:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 5881 10991:aload_0         
	// 5882 10992:getfield        #12  <Field azh a>
	// 5883 10995:astore_1        
		abyte0.bv = ((azh) (abyte0)).bx ^ a.bv;
	// 5884 10996:aload_1         
	// 5885 10997:aload_1         
	// 5886 10998:getfield        #418 <Field int azh.bx>
	// 5887 11001:aload_0         
	// 5888 11002:getfield        #12  <Field azh a>
	// 5889 11005:getfield        #319 <Field int azh.bv>
	// 5890 11008:ixor            
	// 5891 11009:putfield        #319 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 5892 11012:aload_0         
	// 5893 11013:getfield        #12  <Field azh a>
	// 5894 11016:astore_1        
		abyte0.e = ((azh) (abyte0)).bv ^ a.e;
	// 5895 11017:aload_1         
	// 5896 11018:aload_1         
	// 5897 11019:getfield        #319 <Field int azh.bv>
	// 5898 11022:aload_0         
	// 5899 11023:getfield        #12  <Field azh a>
	// 5900 11026:getfield        #424 <Field int azh.e>
	// 5901 11029:ixor            
	// 5902 11030:putfield        #424 <Field int azh.e>
		abyte0 = ((byte []) (a));
	// 5903 11033:aload_0         
	// 5904 11034:getfield        #12  <Field azh a>
	// 5905 11037:astore_1        
		abyte0.bT = ((azh) (abyte0)).e | a.bT;
	// 5906 11038:aload_1         
	// 5907 11039:aload_1         
	// 5908 11040:getfield        #424 <Field int azh.e>
	// 5909 11043:aload_0         
	// 5910 11044:getfield        #12  <Field azh a>
	// 5911 11047:getfield        #427 <Field int azh.bT>
	// 5912 11050:ior             
	// 5913 11051:putfield        #427 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 5914 11054:aload_0         
	// 5915 11055:getfield        #12  <Field azh a>
	// 5916 11058:astore_1        
		abyte0.bT = ((azh) (abyte0)).bX ^ a.bT;
	// 5917 11059:aload_1         
	// 5918 11060:aload_1         
	// 5919 11061:getfield        #430 <Field int azh.bX>
	// 5920 11064:aload_0         
	// 5921 11065:getfield        #12  <Field azh a>
	// 5922 11068:getfield        #427 <Field int azh.bT>
	// 5923 11071:ixor            
	// 5924 11072:putfield        #427 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 5925 11075:aload_0         
	// 5926 11076:getfield        #12  <Field azh a>
	// 5927 11079:astore_1        
		abyte0.bT = ((azh) (abyte0)).m & ~a.bT;
	// 5928 11080:aload_1         
	// 5929 11081:aload_1         
	// 5930 11082:getfield        #250 <Field int azh.m>
	// 5931 11085:aload_0         
	// 5932 11086:getfield        #12  <Field azh a>
	// 5933 11089:getfield        #427 <Field int azh.bT>
	// 5934 11092:iconst_m1       
	// 5935 11093:ixor            
	// 5936 11094:iand            
	// 5937 11095:putfield        #427 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 5938 11098:aload_0         
	// 5939 11099:getfield        #12  <Field azh a>
	// 5940 11102:astore_1        
		abyte0.bX = ((azh) (abyte0)).A & a.e;
	// 5941 11103:aload_1         
	// 5942 11104:aload_1         
	// 5943 11105:getfield        #80  <Field int azh.A>
	// 5944 11108:aload_0         
	// 5945 11109:getfield        #12  <Field azh a>
	// 5946 11112:getfield        #424 <Field int azh.e>
	// 5947 11115:iand            
	// 5948 11116:putfield        #430 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 5949 11119:aload_0         
	// 5950 11120:getfield        #12  <Field azh a>
	// 5951 11123:astore_1        
		abyte0.bv = ((azh) (abyte0)).e & ~a.bX;
	// 5952 11124:aload_1         
	// 5953 11125:aload_1         
	// 5954 11126:getfield        #424 <Field int azh.e>
	// 5955 11129:aload_0         
	// 5956 11130:getfield        #12  <Field azh a>
	// 5957 11133:getfield        #430 <Field int azh.bX>
	// 5958 11136:iconst_m1       
	// 5959 11137:ixor            
	// 5960 11138:iand            
	// 5961 11139:putfield        #319 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 5962 11142:aload_0         
	// 5963 11143:getfield        #12  <Field azh a>
	// 5964 11146:astore_1        
		abyte0.bx = ((azh) (abyte0)).Q | a.bv;
	// 5965 11147:aload_1         
	// 5966 11148:aload_1         
	// 5967 11149:getfield        #83  <Field int azh.Q>
	// 5968 11152:aload_0         
	// 5969 11153:getfield        #12  <Field azh a>
	// 5970 11156:getfield        #319 <Field int azh.bv>
	// 5971 11159:ior             
	// 5972 11160:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 5973 11163:aload_0         
	// 5974 11164:getfield        #12  <Field azh a>
	// 5975 11167:astore_1        
		abyte0.bx = ((azh) (abyte0)).bX ^ a.bx;
	// 5976 11168:aload_1         
	// 5977 11169:aload_1         
	// 5978 11170:getfield        #430 <Field int azh.bX>
	// 5979 11173:aload_0         
	// 5980 11174:getfield        #12  <Field azh a>
	// 5981 11177:getfield        #418 <Field int azh.bx>
	// 5982 11180:ixor            
	// 5983 11181:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 5984 11184:aload_0         
	// 5985 11185:getfield        #12  <Field azh a>
	// 5986 11188:astore_1        
		abyte0.aE = ((azh) (abyte0)).ag | a.bx;
	// 5987 11189:aload_1         
	// 5988 11190:aload_1         
	// 5989 11191:getfield        #104 <Field int azh.ag>
	// 5990 11194:aload_0         
	// 5991 11195:getfield        #12  <Field azh a>
	// 5992 11198:getfield        #418 <Field int azh.bx>
	// 5993 11201:ior             
	// 5994 11202:putfield        #421 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 5995 11205:aload_0         
	// 5996 11206:getfield        #12  <Field azh a>
	// 5997 11209:astore_1        
		abyte0.bW = ((azh) (abyte0)).ag | a.bv;
	// 5998 11210:aload_1         
	// 5999 11211:aload_1         
	// 6000 11212:getfield        #104 <Field int azh.ag>
	// 6001 11215:aload_0         
	// 6002 11216:getfield        #12  <Field azh a>
	// 6003 11219:getfield        #319 <Field int azh.bv>
	// 6004 11222:ior             
	// 6005 11223:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 6006 11226:aload_0         
	// 6007 11227:getfield        #12  <Field azh a>
	// 6008 11230:astore_1        
		abyte0.av = ((azh) (abyte0)).bv ^ a.av;
	// 6009 11231:aload_1         
	// 6010 11232:aload_1         
	// 6011 11233:getfield        #319 <Field int azh.bv>
	// 6012 11236:aload_0         
	// 6013 11237:getfield        #12  <Field azh a>
	// 6014 11240:getfield        #53  <Field int azh.av>
	// 6015 11243:ixor            
	// 6016 11244:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 6017 11247:aload_0         
	// 6018 11248:getfield        #12  <Field azh a>
	// 6019 11251:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv ^ a.Q;
	// 6020 11252:aload_1         
	// 6021 11253:aload_1         
	// 6022 11254:getfield        #319 <Field int azh.bv>
	// 6023 11257:aload_0         
	// 6024 11258:getfield        #12  <Field azh a>
	// 6025 11261:getfield        #83  <Field int azh.Q>
	// 6026 11264:ixor            
	// 6027 11265:putfield        #319 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6028 11268:aload_0         
	// 6029 11269:getfield        #12  <Field azh a>
	// 6030 11272:astore_1        
		abyte0.bq = ((azh) (abyte0)).Q | a.bX;
	// 6031 11273:aload_1         
	// 6032 11274:aload_1         
	// 6033 11275:getfield        #83  <Field int azh.Q>
	// 6034 11278:aload_0         
	// 6035 11279:getfield        #12  <Field azh a>
	// 6036 11282:getfield        #430 <Field int azh.bX>
	// 6037 11285:ior             
	// 6038 11286:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6039 11289:aload_0         
	// 6040 11290:getfield        #12  <Field azh a>
	// 6041 11293:astore_1        
		abyte0.bq = ((azh) (abyte0)).e ^ a.bq;
	// 6042 11294:aload_1         
	// 6043 11295:aload_1         
	// 6044 11296:getfield        #424 <Field int azh.e>
	// 6045 11299:aload_0         
	// 6046 11300:getfield        #12  <Field azh a>
	// 6047 11303:getfield        #26  <Field int azh.bq>
	// 6048 11306:ixor            
	// 6049 11307:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6050 11310:aload_0         
	// 6051 11311:getfield        #12  <Field azh a>
	// 6052 11314:astore_1        
		abyte0.aV = ((azh) (abyte0)).bX ^ a.aV;
	// 6053 11315:aload_1         
	// 6054 11316:aload_1         
	// 6055 11317:getfield        #430 <Field int azh.bX>
	// 6056 11320:aload_0         
	// 6057 11321:getfield        #12  <Field azh a>
	// 6058 11324:getfield        #77  <Field int azh.aV>
	// 6059 11327:ixor            
	// 6060 11328:putfield        #77  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 6061 11331:aload_0         
	// 6062 11332:getfield        #12  <Field azh a>
	// 6063 11335:astore_1        
		abyte0.aV = ((azh) (abyte0)).ag | a.aV;
	// 6064 11336:aload_1         
	// 6065 11337:aload_1         
	// 6066 11338:getfield        #104 <Field int azh.ag>
	// 6067 11341:aload_0         
	// 6068 11342:getfield        #12  <Field azh a>
	// 6069 11345:getfield        #77  <Field int azh.aV>
	// 6070 11348:ior             
	// 6071 11349:putfield        #77  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 6072 11352:aload_0         
	// 6073 11353:getfield        #12  <Field azh a>
	// 6074 11356:astore_1        
		abyte0.aV = ((azh) (abyte0)).bq ^ a.aV;
	// 6075 11357:aload_1         
	// 6076 11358:aload_1         
	// 6077 11359:getfield        #26  <Field int azh.bq>
	// 6078 11362:aload_0         
	// 6079 11363:getfield        #12  <Field azh a>
	// 6080 11366:getfield        #77  <Field int azh.aV>
	// 6081 11369:ixor            
	// 6082 11370:putfield        #77  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 6083 11373:aload_0         
	// 6084 11374:getfield        #12  <Field azh a>
	// 6085 11377:astore_1        
		abyte0.bq = ((azh) (abyte0)).Q | a.bX;
	// 6086 11378:aload_1         
	// 6087 11379:aload_1         
	// 6088 11380:getfield        #83  <Field int azh.Q>
	// 6089 11383:aload_0         
	// 6090 11384:getfield        #12  <Field azh a>
	// 6091 11387:getfield        #430 <Field int azh.bX>
	// 6092 11390:ior             
	// 6093 11391:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6094 11394:aload_0         
	// 6095 11395:getfield        #12  <Field azh a>
	// 6096 11398:astore_1        
		abyte0.bq = ((azh) (abyte0)).bX ^ a.bq;
	// 6097 11399:aload_1         
	// 6098 11400:aload_1         
	// 6099 11401:getfield        #430 <Field int azh.bX>
	// 6100 11404:aload_0         
	// 6101 11405:getfield        #12  <Field azh a>
	// 6102 11408:getfield        #26  <Field int azh.bq>
	// 6103 11411:ixor            
	// 6104 11412:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6105 11415:aload_0         
	// 6106 11416:getfield        #12  <Field azh a>
	// 6107 11419:astore_1        
		abyte0.bq = ((azh) (abyte0)).ag | a.bq;
	// 6108 11420:aload_1         
	// 6109 11421:aload_1         
	// 6110 11422:getfield        #104 <Field int azh.ag>
	// 6111 11425:aload_0         
	// 6112 11426:getfield        #12  <Field azh a>
	// 6113 11429:getfield        #26  <Field int azh.bq>
	// 6114 11432:ior             
	// 6115 11433:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6116 11436:aload_0         
	// 6117 11437:getfield        #12  <Field azh a>
	// 6118 11440:astore_1        
		abyte0.bn = ((azh) (abyte0)).Q | a.bX;
	// 6119 11441:aload_1         
	// 6120 11442:aload_1         
	// 6121 11443:getfield        #83  <Field int azh.Q>
	// 6122 11446:aload_0         
	// 6123 11447:getfield        #12  <Field azh a>
	// 6124 11450:getfield        #430 <Field int azh.bX>
	// 6125 11453:ior             
	// 6126 11454:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 6127 11457:aload_0         
	// 6128 11458:getfield        #12  <Field azh a>
	// 6129 11461:astore_1        
		abyte0.aS = ((azh) (abyte0)).aX & a.e;
	// 6130 11462:aload_1         
	// 6131 11463:aload_1         
	// 6132 11464:getfield        #433 <Field int azh.aX>
	// 6133 11467:aload_0         
	// 6134 11468:getfield        #12  <Field azh a>
	// 6135 11471:getfield        #424 <Field int azh.e>
	// 6136 11474:iand            
	// 6137 11475:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6138 11478:aload_0         
	// 6139 11479:getfield        #12  <Field azh a>
	// 6140 11482:astore_1        
		abyte0.aS = ((azh) (abyte0)).cc ^ a.aS;
	// 6141 11483:aload_1         
	// 6142 11484:aload_1         
	// 6143 11485:getfield        #436 <Field int azh.cc>
	// 6144 11488:aload_0         
	// 6145 11489:getfield        #12  <Field azh a>
	// 6146 11492:getfield        #214 <Field int azh.aS>
	// 6147 11495:ixor            
	// 6148 11496:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6149 11499:aload_0         
	// 6150 11500:getfield        #12  <Field azh a>
	// 6151 11503:astore_1        
		abyte0.aS = ((azh) (abyte0)).m & ~a.aS;
	// 6152 11504:aload_1         
	// 6153 11505:aload_1         
	// 6154 11506:getfield        #250 <Field int azh.m>
	// 6155 11509:aload_0         
	// 6156 11510:getfield        #12  <Field azh a>
	// 6157 11513:getfield        #214 <Field int azh.aS>
	// 6158 11516:iconst_m1       
	// 6159 11517:ixor            
	// 6160 11518:iand            
	// 6161 11519:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6162 11522:aload_0         
	// 6163 11523:getfield        #12  <Field azh a>
	// 6164 11526:astore_1        
		abyte0.bt = ((azh) (abyte0)).e & ~a.Q;
	// 6165 11527:aload_1         
	// 6166 11528:aload_1         
	// 6167 11529:getfield        #424 <Field int azh.e>
	// 6168 11532:aload_0         
	// 6169 11533:getfield        #12  <Field azh a>
	// 6170 11536:getfield        #83  <Field int azh.Q>
	// 6171 11539:iconst_m1       
	// 6172 11540:ixor            
	// 6173 11541:iand            
	// 6174 11542:putfield        #397 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6175 11545:aload_0         
	// 6176 11546:getfield        #12  <Field azh a>
	// 6177 11549:astore_1        
		abyte0.aD = ((azh) (abyte0)).ag | a.bt;
	// 6178 11550:aload_1         
	// 6179 11551:aload_1         
	// 6180 11552:getfield        #104 <Field int azh.ag>
	// 6181 11555:aload_0         
	// 6182 11556:getfield        #12  <Field azh a>
	// 6183 11559:getfield        #397 <Field int azh.bt>
	// 6184 11562:ior             
	// 6185 11563:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 6186 11566:aload_0         
	// 6187 11567:getfield        #12  <Field azh a>
	// 6188 11570:astore_1        
		abyte0.aD = ((azh) (abyte0)).bv ^ a.aD;
	// 6189 11571:aload_1         
	// 6190 11572:aload_1         
	// 6191 11573:getfield        #319 <Field int azh.bv>
	// 6192 11576:aload_0         
	// 6193 11577:getfield        #12  <Field azh a>
	// 6194 11580:getfield        #202 <Field int azh.aD>
	// 6195 11583:ixor            
	// 6196 11584:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 6197 11587:aload_0         
	// 6198 11588:getfield        #12  <Field azh a>
	// 6199 11591:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.e;
	// 6200 11592:aload_1         
	// 6201 11593:aload_1         
	// 6202 11594:getfield        #433 <Field int azh.aX>
	// 6203 11597:aload_0         
	// 6204 11598:getfield        #12  <Field azh a>
	// 6205 11601:getfield        #424 <Field int azh.e>
	// 6206 11604:iconst_m1       
	// 6207 11605:ixor            
	// 6208 11606:iand            
	// 6209 11607:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6210 11610:aload_0         
	// 6211 11611:getfield        #12  <Field azh a>
	// 6212 11614:astore_1        
		abyte0.aX = ((azh) (abyte0)).bH ^ a.aX;
	// 6213 11615:aload_1         
	// 6214 11616:aload_1         
	// 6215 11617:getfield        #439 <Field int azh.bH>
	// 6216 11620:aload_0         
	// 6217 11621:getfield        #12  <Field azh a>
	// 6218 11624:getfield        #433 <Field int azh.aX>
	// 6219 11627:ixor            
	// 6220 11628:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6221 11631:aload_0         
	// 6222 11632:getfield        #12  <Field azh a>
	// 6223 11635:astore_1        
		abyte0.bT = ((azh) (abyte0)).aX ^ a.bT;
	// 6224 11636:aload_1         
	// 6225 11637:aload_1         
	// 6226 11638:getfield        #433 <Field int azh.aX>
	// 6227 11641:aload_0         
	// 6228 11642:getfield        #12  <Field azh a>
	// 6229 11645:getfield        #427 <Field int azh.bT>
	// 6230 11648:ixor            
	// 6231 11649:putfield        #427 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 6232 11652:aload_0         
	// 6233 11653:getfield        #12  <Field azh a>
	// 6234 11656:astore_1        
		abyte0.cc = ((azh) (abyte0)).e | a.cc;
	// 6235 11657:aload_1         
	// 6236 11658:aload_1         
	// 6237 11659:getfield        #424 <Field int azh.e>
	// 6238 11662:aload_0         
	// 6239 11663:getfield        #12  <Field azh a>
	// 6240 11666:getfield        #436 <Field int azh.cc>
	// 6241 11669:ior             
	// 6242 11670:putfield        #436 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6243 11673:aload_0         
	// 6244 11674:getfield        #12  <Field azh a>
	// 6245 11677:astore_1        
		abyte0.cc = ((azh) (abyte0)).bm ^ a.cc;
	// 6246 11678:aload_1         
	// 6247 11679:aload_1         
	// 6248 11680:getfield        #442 <Field int azh.bm>
	// 6249 11683:aload_0         
	// 6250 11684:getfield        #12  <Field azh a>
	// 6251 11687:getfield        #436 <Field int azh.cc>
	// 6252 11690:ixor            
	// 6253 11691:putfield        #436 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6254 11694:aload_0         
	// 6255 11695:getfield        #12  <Field azh a>
	// 6256 11698:astore_1        
		abyte0.bm = ((azh) (abyte0)).A & ~a.e;
	// 6257 11699:aload_1         
	// 6258 11700:aload_1         
	// 6259 11701:getfield        #80  <Field int azh.A>
	// 6260 11704:aload_0         
	// 6261 11705:getfield        #12  <Field azh a>
	// 6262 11708:getfield        #424 <Field int azh.e>
	// 6263 11711:iconst_m1       
	// 6264 11712:ixor            
	// 6265 11713:iand            
	// 6266 11714:putfield        #442 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6267 11717:aload_0         
	// 6268 11718:getfield        #12  <Field azh a>
	// 6269 11721:astore_1        
		abyte0.aZ = ((azh) (abyte0)).e | a.aZ;
	// 6270 11722:aload_1         
	// 6271 11723:aload_1         
	// 6272 11724:getfield        #424 <Field int azh.e>
	// 6273 11727:aload_0         
	// 6274 11728:getfield        #12  <Field azh a>
	// 6275 11731:getfield        #445 <Field int azh.aZ>
	// 6276 11734:ior             
	// 6277 11735:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6278 11738:aload_0         
	// 6279 11739:getfield        #12  <Field azh a>
	// 6280 11742:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bQ ^ a.aZ;
	// 6281 11743:aload_1         
	// 6282 11744:aload_1         
	// 6283 11745:getfield        #448 <Field int azh.bQ>
	// 6284 11748:aload_0         
	// 6285 11749:getfield        #12  <Field azh a>
	// 6286 11752:getfield        #445 <Field int azh.aZ>
	// 6287 11755:ixor            
	// 6288 11756:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6289 11759:aload_0         
	// 6290 11760:getfield        #12  <Field azh a>
	// 6291 11763:astore_1        
		abyte0.aS = ((azh) (abyte0)).aZ ^ a.aS;
	// 6292 11764:aload_1         
	// 6293 11765:aload_1         
	// 6294 11766:getfield        #445 <Field int azh.aZ>
	// 6295 11769:aload_0         
	// 6296 11770:getfield        #12  <Field azh a>
	// 6297 11773:getfield        #214 <Field int azh.aS>
	// 6298 11776:ixor            
	// 6299 11777:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6300 11780:aload_0         
	// 6301 11781:getfield        #12  <Field azh a>
	// 6302 11784:astore_1        
		abyte0.bE = ((azh) (abyte0)).bE & a.e;
	// 6303 11785:aload_1         
	// 6304 11786:aload_1         
	// 6305 11787:getfield        #451 <Field int azh.bE>
	// 6306 11790:aload_0         
	// 6307 11791:getfield        #12  <Field azh a>
	// 6308 11794:getfield        #424 <Field int azh.e>
	// 6309 11797:iand            
	// 6310 11798:putfield        #451 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6311 11801:aload_0         
	// 6312 11802:getfield        #12  <Field azh a>
	// 6313 11805:astore_1        
		abyte0.bE = ((azh) (abyte0)).bH ^ a.bE;
	// 6314 11806:aload_1         
	// 6315 11807:aload_1         
	// 6316 11808:getfield        #439 <Field int azh.bH>
	// 6317 11811:aload_0         
	// 6318 11812:getfield        #12  <Field azh a>
	// 6319 11815:getfield        #451 <Field int azh.bE>
	// 6320 11818:ixor            
	// 6321 11819:putfield        #451 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6322 11822:aload_0         
	// 6323 11823:getfield        #12  <Field azh a>
	// 6324 11826:astore_1        
		abyte0.bH = ((azh) (abyte0)).A ^ a.e;
	// 6325 11827:aload_1         
	// 6326 11828:aload_1         
	// 6327 11829:getfield        #80  <Field int azh.A>
	// 6328 11832:aload_0         
	// 6329 11833:getfield        #12  <Field azh a>
	// 6330 11836:getfield        #424 <Field int azh.e>
	// 6331 11839:ixor            
	// 6332 11840:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6333 11843:aload_0         
	// 6334 11844:getfield        #12  <Field azh a>
	// 6335 11847:astore_1        
		abyte0.bn = ((azh) (abyte0)).bH ^ a.bn;
	// 6336 11848:aload_1         
	// 6337 11849:aload_1         
	// 6338 11850:getfield        #439 <Field int azh.bH>
	// 6339 11853:aload_0         
	// 6340 11854:getfield        #12  <Field azh a>
	// 6341 11857:getfield        #358 <Field int azh.bn>
	// 6342 11860:ixor            
	// 6343 11861:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 6344 11864:aload_0         
	// 6345 11865:getfield        #12  <Field azh a>
	// 6346 11868:astore_1        
		abyte0.bn = ((azh) (abyte0)).bn & ~a.ag;
	// 6347 11869:aload_1         
	// 6348 11870:aload_1         
	// 6349 11871:getfield        #358 <Field int azh.bn>
	// 6350 11874:aload_0         
	// 6351 11875:getfield        #12  <Field azh a>
	// 6352 11878:getfield        #104 <Field int azh.ag>
	// 6353 11881:iconst_m1       
	// 6354 11882:ixor            
	// 6355 11883:iand            
	// 6356 11884:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 6357 11887:aload_0         
	// 6358 11888:getfield        #12  <Field azh a>
	// 6359 11891:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bH & ~a.Q;
	// 6360 11892:aload_1         
	// 6361 11893:aload_1         
	// 6362 11894:getfield        #439 <Field int azh.bH>
	// 6363 11897:aload_0         
	// 6364 11898:getfield        #12  <Field azh a>
	// 6365 11901:getfield        #83  <Field int azh.Q>
	// 6366 11904:iconst_m1       
	// 6367 11905:ixor            
	// 6368 11906:iand            
	// 6369 11907:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6370 11910:aload_0         
	// 6371 11911:getfield        #12  <Field azh a>
	// 6372 11914:astore_1        
		abyte0.aX = ((azh) (abyte0)).Q | a.bH;
	// 6373 11915:aload_1         
	// 6374 11916:aload_1         
	// 6375 11917:getfield        #83  <Field int azh.Q>
	// 6376 11920:aload_0         
	// 6377 11921:getfield        #12  <Field azh a>
	// 6378 11924:getfield        #439 <Field int azh.bH>
	// 6379 11927:ior             
	// 6380 11928:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6381 11931:aload_0         
	// 6382 11932:getfield        #12  <Field azh a>
	// 6383 11935:astore_1        
		abyte0.aX = ((azh) (abyte0)).bm ^ a.aX;
	// 6384 11936:aload_1         
	// 6385 11937:aload_1         
	// 6386 11938:getfield        #442 <Field int azh.bm>
	// 6387 11941:aload_0         
	// 6388 11942:getfield        #12  <Field azh a>
	// 6389 11945:getfield        #433 <Field int azh.aX>
	// 6390 11948:ixor            
	// 6391 11949:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6392 11952:aload_0         
	// 6393 11953:getfield        #12  <Field azh a>
	// 6394 11956:astore_1        
		abyte0.au = ((azh) (abyte0)).aX ^ a.au;
	// 6395 11957:aload_1         
	// 6396 11958:aload_1         
	// 6397 11959:getfield        #433 <Field int azh.aX>
	// 6398 11962:aload_0         
	// 6399 11963:getfield        #12  <Field azh a>
	// 6400 11966:getfield        #101 <Field int azh.au>
	// 6401 11969:ixor            
	// 6402 11970:putfield        #101 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6403 11973:aload_0         
	// 6404 11974:getfield        #12  <Field azh a>
	// 6405 11977:astore_1        
		abyte0.aX = ((azh) (abyte0)).bH & ~a.Q;
	// 6406 11978:aload_1         
	// 6407 11979:aload_1         
	// 6408 11980:getfield        #439 <Field int azh.bH>
	// 6409 11983:aload_0         
	// 6410 11984:getfield        #12  <Field azh a>
	// 6411 11987:getfield        #83  <Field int azh.Q>
	// 6412 11990:iconst_m1       
	// 6413 11991:ixor            
	// 6414 11992:iand            
	// 6415 11993:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6416 11996:aload_0         
	// 6417 11997:getfield        #12  <Field azh a>
	// 6418 12000:astore_1        
		abyte0.aX = ((azh) (abyte0)).A ^ a.aX;
	// 6419 12001:aload_1         
	// 6420 12002:aload_1         
	// 6421 12003:getfield        #80  <Field int azh.A>
	// 6422 12006:aload_0         
	// 6423 12007:getfield        #12  <Field azh a>
	// 6424 12010:getfield        #433 <Field int azh.aX>
	// 6425 12013:ixor            
	// 6426 12014:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6427 12017:aload_0         
	// 6428 12018:getfield        #12  <Field azh a>
	// 6429 12021:astore_1        
		abyte0.aU = ((azh) (abyte0)).aU & ~a.e;
	// 6430 12022:aload_1         
	// 6431 12023:aload_1         
	// 6432 12024:getfield        #454 <Field int azh.aU>
	// 6433 12027:aload_0         
	// 6434 12028:getfield        #12  <Field azh a>
	// 6435 12031:getfield        #424 <Field int azh.e>
	// 6436 12034:iconst_m1       
	// 6437 12035:ixor            
	// 6438 12036:iand            
	// 6439 12037:putfield        #454 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6440 12040:aload_0         
	// 6441 12041:getfield        #12  <Field azh a>
	// 6442 12044:astore_1        
		abyte0.aU = ((azh) (abyte0)).bQ ^ a.aU;
	// 6443 12045:aload_1         
	// 6444 12046:aload_1         
	// 6445 12047:getfield        #448 <Field int azh.bQ>
	// 6446 12050:aload_0         
	// 6447 12051:getfield        #12  <Field azh a>
	// 6448 12054:getfield        #454 <Field int azh.aU>
	// 6449 12057:ixor            
	// 6450 12058:putfield        #454 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6451 12061:aload_0         
	// 6452 12062:getfield        #12  <Field azh a>
	// 6453 12065:astore_1        
		abyte0.aU = ((azh) (abyte0)).m & a.aU;
	// 6454 12066:aload_1         
	// 6455 12067:aload_1         
	// 6456 12068:getfield        #250 <Field int azh.m>
	// 6457 12071:aload_0         
	// 6458 12072:getfield        #12  <Field azh a>
	// 6459 12075:getfield        #454 <Field int azh.aU>
	// 6460 12078:iand            
	// 6461 12079:putfield        #454 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6462 12082:aload_0         
	// 6463 12083:getfield        #12  <Field azh a>
	// 6464 12086:astore_1        
		abyte0.aU = ((azh) (abyte0)).cc ^ a.aU;
	// 6465 12087:aload_1         
	// 6466 12088:aload_1         
	// 6467 12089:getfield        #436 <Field int azh.cc>
	// 6468 12092:aload_0         
	// 6469 12093:getfield        #12  <Field azh a>
	// 6470 12096:getfield        #454 <Field int azh.aU>
	// 6471 12099:ixor            
	// 6472 12100:putfield        #454 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6473 12103:aload_0         
	// 6474 12104:getfield        #12  <Field azh a>
	// 6475 12107:astore_1        
		abyte0.cc = ((azh) (abyte0)).ag & ~a.aU;
	// 6476 12108:aload_1         
	// 6477 12109:aload_1         
	// 6478 12110:getfield        #104 <Field int azh.ag>
	// 6479 12113:aload_0         
	// 6480 12114:getfield        #12  <Field azh a>
	// 6481 12117:getfield        #454 <Field int azh.aU>
	// 6482 12120:iconst_m1       
	// 6483 12121:ixor            
	// 6484 12122:iand            
	// 6485 12123:putfield        #436 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6486 12126:aload_0         
	// 6487 12127:getfield        #12  <Field azh a>
	// 6488 12130:astore_1        
		abyte0.cc = ((azh) (abyte0)).bT ^ a.cc;
	// 6489 12131:aload_1         
	// 6490 12132:aload_1         
	// 6491 12133:getfield        #427 <Field int azh.bT>
	// 6492 12136:aload_0         
	// 6493 12137:getfield        #12  <Field azh a>
	// 6494 12140:getfield        #436 <Field int azh.cc>
	// 6495 12143:ixor            
	// 6496 12144:putfield        #436 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6497 12147:aload_0         
	// 6498 12148:getfield        #12  <Field azh a>
	// 6499 12151:astore_1        
		abyte0.al = ((azh) (abyte0)).cc ^ a.al;
	// 6500 12152:aload_1         
	// 6501 12153:aload_1         
	// 6502 12154:getfield        #436 <Field int azh.cc>
	// 6503 12157:aload_0         
	// 6504 12158:getfield        #12  <Field azh a>
	// 6505 12161:getfield        #56  <Field int azh.al>
	// 6506 12164:ixor            
	// 6507 12165:putfield        #56  <Field int azh.al>
		abyte0 = ((byte []) (a));
	// 6508 12168:aload_0         
	// 6509 12169:getfield        #12  <Field azh a>
	// 6510 12172:astore_1        
		abyte0.aU = ((azh) (abyte0)).aU & ~a.ag;
	// 6511 12173:aload_1         
	// 6512 12174:aload_1         
	// 6513 12175:getfield        #454 <Field int azh.aU>
	// 6514 12178:aload_0         
	// 6515 12179:getfield        #12  <Field azh a>
	// 6516 12182:getfield        #104 <Field int azh.ag>
	// 6517 12185:iconst_m1       
	// 6518 12186:ixor            
	// 6519 12187:iand            
	// 6520 12188:putfield        #454 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6521 12191:aload_0         
	// 6522 12192:getfield        #12  <Field azh a>
	// 6523 12195:astore_1        
		abyte0.aU = ((azh) (abyte0)).bT ^ a.aU;
	// 6524 12196:aload_1         
	// 6525 12197:aload_1         
	// 6526 12198:getfield        #427 <Field int azh.bT>
	// 6527 12201:aload_0         
	// 6528 12202:getfield        #12  <Field azh a>
	// 6529 12205:getfield        #454 <Field int azh.aU>
	// 6530 12208:ixor            
	// 6531 12209:putfield        #454 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6532 12212:aload_0         
	// 6533 12213:getfield        #12  <Field azh a>
	// 6534 12216:astore_1        
		abyte0.ab = ((azh) (abyte0)).aU ^ a.ab;
	// 6535 12217:aload_1         
	// 6536 12218:aload_1         
	// 6537 12219:getfield        #454 <Field int azh.aU>
	// 6538 12222:aload_0         
	// 6539 12223:getfield        #12  <Field azh a>
	// 6540 12226:getfield        #457 <Field int azh.ab>
	// 6541 12229:ixor            
	// 6542 12230:putfield        #457 <Field int azh.ab>
		abyte0 = ((byte []) (a));
	// 6543 12233:aload_0         
	// 6544 12234:getfield        #12  <Field azh a>
	// 6545 12237:astore_1        
		abyte0.aU = ((azh) (abyte0)).ab | a.D;
	// 6546 12238:aload_1         
	// 6547 12239:aload_1         
	// 6548 12240:getfield        #457 <Field int azh.ab>
	// 6549 12243:aload_0         
	// 6550 12244:getfield        #12  <Field azh a>
	// 6551 12247:getfield        #352 <Field int azh.D>
	// 6552 12250:ior             
	// 6553 12251:putfield        #454 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6554 12254:aload_0         
	// 6555 12255:getfield        #12  <Field azh a>
	// 6556 12258:astore_1        
		abyte0.bT = ((azh) (abyte0)).ab | a.D;
	// 6557 12259:aload_1         
	// 6558 12260:aload_1         
	// 6559 12261:getfield        #457 <Field int azh.ab>
	// 6560 12264:aload_0         
	// 6561 12265:getfield        #12  <Field azh a>
	// 6562 12268:getfield        #352 <Field int azh.D>
	// 6563 12271:ior             
	// 6564 12272:putfield        #427 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 6565 12275:aload_0         
	// 6566 12276:getfield        #12  <Field azh a>
	// 6567 12279:astore_1        
		abyte0.cc = ((azh) (abyte0)).ab | a.D;
	// 6568 12280:aload_1         
	// 6569 12281:aload_1         
	// 6570 12282:getfield        #457 <Field int azh.ab>
	// 6571 12285:aload_0         
	// 6572 12286:getfield        #12  <Field azh a>
	// 6573 12289:getfield        #352 <Field int azh.D>
	// 6574 12292:ior             
	// 6575 12293:putfield        #436 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6576 12296:aload_0         
	// 6577 12297:getfield        #12  <Field azh a>
	// 6578 12300:astore_1        
		abyte0.cc = ((azh) (abyte0)).D ^ a.cc;
	// 6579 12301:aload_1         
	// 6580 12302:aload_1         
	// 6581 12303:getfield        #352 <Field int azh.D>
	// 6582 12306:aload_0         
	// 6583 12307:getfield        #12  <Field azh a>
	// 6584 12310:getfield        #436 <Field int azh.cc>
	// 6585 12313:ixor            
	// 6586 12314:putfield        #436 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6587 12317:aload_0         
	// 6588 12318:getfield        #12  <Field azh a>
	// 6589 12321:astore_1        
		abyte0.bQ = ((azh) (abyte0)).D ^ a.ab;
	// 6590 12322:aload_1         
	// 6591 12323:aload_1         
	// 6592 12324:getfield        #352 <Field int azh.D>
	// 6593 12327:aload_0         
	// 6594 12328:getfield        #12  <Field azh a>
	// 6595 12331:getfield        #457 <Field int azh.ab>
	// 6596 12334:ixor            
	// 6597 12335:putfield        #448 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 6598 12338:aload_0         
	// 6599 12339:getfield        #12  <Field azh a>
	// 6600 12342:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & ~a.e;
	// 6601 12343:aload_1         
	// 6602 12344:aload_1         
	// 6603 12345:getfield        #460 <Field int azh.aW>
	// 6604 12348:aload_0         
	// 6605 12349:getfield        #12  <Field azh a>
	// 6606 12352:getfield        #424 <Field int azh.e>
	// 6607 12355:iconst_m1       
	// 6608 12356:ixor            
	// 6609 12357:iand            
	// 6610 12358:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6611 12361:aload_0         
	// 6612 12362:getfield        #12  <Field azh a>
	// 6613 12365:astore_1        
		abyte0.aW = ((azh) (abyte0)).cg ^ a.aW;
	// 6614 12366:aload_1         
	// 6615 12367:aload_1         
	// 6616 12368:getfield        #463 <Field int azh.cg>
	// 6617 12371:aload_0         
	// 6618 12372:getfield        #12  <Field azh a>
	// 6619 12375:getfield        #460 <Field int azh.aW>
	// 6620 12378:ixor            
	// 6621 12379:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6622 12382:aload_0         
	// 6623 12383:getfield        #12  <Field azh a>
	// 6624 12386:astore_1        
		abyte0.aW = ((azh) (abyte0)).m & a.aW;
	// 6625 12387:aload_1         
	// 6626 12388:aload_1         
	// 6627 12389:getfield        #250 <Field int azh.m>
	// 6628 12392:aload_0         
	// 6629 12393:getfield        #12  <Field azh a>
	// 6630 12396:getfield        #460 <Field int azh.aW>
	// 6631 12399:iand            
	// 6632 12400:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6633 12403:aload_0         
	// 6634 12404:getfield        #12  <Field azh a>
	// 6635 12407:astore_1        
		abyte0.aW = ((azh) (abyte0)).bE ^ a.aW;
	// 6636 12408:aload_1         
	// 6637 12409:aload_1         
	// 6638 12410:getfield        #451 <Field int azh.bE>
	// 6639 12413:aload_0         
	// 6640 12414:getfield        #12  <Field azh a>
	// 6641 12417:getfield        #460 <Field int azh.aW>
	// 6642 12420:ixor            
	// 6643 12421:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6644 12424:aload_0         
	// 6645 12425:getfield        #12  <Field azh a>
	// 6646 12428:astore_1        
		abyte0.bE = ((azh) (abyte0)).ag | a.aW;
	// 6647 12429:aload_1         
	// 6648 12430:aload_1         
	// 6649 12431:getfield        #104 <Field int azh.ag>
	// 6650 12434:aload_0         
	// 6651 12435:getfield        #12  <Field azh a>
	// 6652 12438:getfield        #460 <Field int azh.aW>
	// 6653 12441:ior             
	// 6654 12442:putfield        #451 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6655 12445:aload_0         
	// 6656 12446:getfield        #12  <Field azh a>
	// 6657 12449:astore_1        
		abyte0.bE = ((azh) (abyte0)).aS ^ a.bE;
	// 6658 12450:aload_1         
	// 6659 12451:aload_1         
	// 6660 12452:getfield        #214 <Field int azh.aS>
	// 6661 12455:aload_0         
	// 6662 12456:getfield        #12  <Field azh a>
	// 6663 12459:getfield        #451 <Field int azh.bE>
	// 6664 12462:ixor            
	// 6665 12463:putfield        #451 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6666 12466:aload_0         
	// 6667 12467:getfield        #12  <Field azh a>
	// 6668 12470:astore_1        
		abyte0.J = ((azh) (abyte0)).bE ^ a.J;
	// 6669 12471:aload_1         
	// 6670 12472:aload_1         
	// 6671 12473:getfield        #451 <Field int azh.bE>
	// 6672 12476:aload_0         
	// 6673 12477:getfield        #12  <Field azh a>
	// 6674 12480:getfield        #466 <Field int azh.J>
	// 6675 12483:ixor            
	// 6676 12484:putfield        #466 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 6677 12487:aload_0         
	// 6678 12488:getfield        #12  <Field azh a>
	// 6679 12491:astore_1        
		abyte0.bE = ((azh) (abyte0)).d & ~a.J;
	// 6680 12492:aload_1         
	// 6681 12493:aload_1         
	// 6682 12494:getfield        #409 <Field int azh.d>
	// 6683 12497:aload_0         
	// 6684 12498:getfield        #12  <Field azh a>
	// 6685 12501:getfield        #466 <Field int azh.J>
	// 6686 12504:iconst_m1       
	// 6687 12505:ixor            
	// 6688 12506:iand            
	// 6689 12507:putfield        #451 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6690 12510:aload_0         
	// 6691 12511:getfield        #12  <Field azh a>
	// 6692 12514:astore_1        
		abyte0.cg = ((azh) (abyte0)).d & ~a.bE;
	// 6693 12515:aload_1         
	// 6694 12516:aload_1         
	// 6695 12517:getfield        #409 <Field int azh.d>
	// 6696 12520:aload_0         
	// 6697 12521:getfield        #12  <Field azh a>
	// 6698 12524:getfield        #451 <Field int azh.bE>
	// 6699 12527:iconst_m1       
	// 6700 12528:ixor            
	// 6701 12529:iand            
	// 6702 12530:putfield        #463 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6703 12533:aload_0         
	// 6704 12534:getfield        #12  <Field azh a>
	// 6705 12537:astore_1        
		abyte0.bm = ((azh) (abyte0)).J & a.d;
	// 6706 12538:aload_1         
	// 6707 12539:aload_1         
	// 6708 12540:getfield        #466 <Field int azh.J>
	// 6709 12543:aload_0         
	// 6710 12544:getfield        #12  <Field azh a>
	// 6711 12547:getfield        #409 <Field int azh.d>
	// 6712 12550:iand            
	// 6713 12551:putfield        #442 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6714 12554:aload_0         
	// 6715 12555:getfield        #12  <Field azh a>
	// 6716 12558:astore_1        
		abyte0.bv = ((azh) (abyte0)).J & ~a.d;
	// 6717 12559:aload_1         
	// 6718 12560:aload_1         
	// 6719 12561:getfield        #466 <Field int azh.J>
	// 6720 12564:aload_0         
	// 6721 12565:getfield        #12  <Field azh a>
	// 6722 12568:getfield        #409 <Field int azh.d>
	// 6723 12571:iconst_m1       
	// 6724 12572:ixor            
	// 6725 12573:iand            
	// 6726 12574:putfield        #319 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6727 12577:aload_0         
	// 6728 12578:getfield        #12  <Field azh a>
	// 6729 12581:astore_1        
		abyte0.aO = ((azh) (abyte0)).d | a.bv;
	// 6730 12582:aload_1         
	// 6731 12583:aload_1         
	// 6732 12584:getfield        #409 <Field int azh.d>
	// 6733 12587:aload_0         
	// 6734 12588:getfield        #12  <Field azh a>
	// 6735 12591:getfield        #319 <Field int azh.bv>
	// 6736 12594:ior             
	// 6737 12595:putfield        #152 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 6738 12598:aload_0         
	// 6739 12599:getfield        #12  <Field azh a>
	// 6740 12602:astore_1        
		abyte0.ax = ((azh) (abyte0)).bv & a.l;
	// 6741 12603:aload_1         
	// 6742 12604:aload_1         
	// 6743 12605:getfield        #319 <Field int azh.bv>
	// 6744 12608:aload_0         
	// 6745 12609:getfield        #12  <Field azh a>
	// 6746 12612:getfield        #373 <Field int azh.l>
	// 6747 12615:iand            
	// 6748 12616:putfield        #283 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6749 12619:aload_0         
	// 6750 12620:getfield        #12  <Field azh a>
	// 6751 12623:astore_1        
		abyte0.be = ((azh) (abyte0)).bv & a.l;
	// 6752 12624:aload_1         
	// 6753 12625:aload_1         
	// 6754 12626:getfield        #319 <Field int azh.bv>
	// 6755 12629:aload_0         
	// 6756 12630:getfield        #12  <Field azh a>
	// 6757 12633:getfield        #373 <Field int azh.l>
	// 6758 12636:iand            
	// 6759 12637:putfield        #140 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6760 12640:aload_0         
	// 6761 12641:getfield        #12  <Field azh a>
	// 6762 12644:astore_1        
		abyte0.aN = ((azh) (abyte0)).J ^ a.d;
	// 6763 12645:aload_1         
	// 6764 12646:aload_1         
	// 6765 12647:getfield        #466 <Field int azh.J>
	// 6766 12650:aload_0         
	// 6767 12651:getfield        #12  <Field azh a>
	// 6768 12654:getfield        #409 <Field int azh.d>
	// 6769 12657:ixor            
	// 6770 12658:putfield        #107 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6771 12661:aload_0         
	// 6772 12662:getfield        #12  <Field azh a>
	// 6773 12665:astore_1        
		abyte0.ch = ((azh) (abyte0)).J | a.d;
	// 6774 12666:aload_1         
	// 6775 12667:aload_1         
	// 6776 12668:getfield        #466 <Field int azh.J>
	// 6777 12671:aload_0         
	// 6778 12672:getfield        #12  <Field azh a>
	// 6779 12675:getfield        #409 <Field int azh.d>
	// 6780 12678:ior             
	// 6781 12679:putfield        #217 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 6782 12682:aload_0         
	// 6783 12683:getfield        #12  <Field azh a>
	// 6784 12686:astore_1        
		abyte0.aJ = ((azh) (abyte0)).l & ~a.ch;
	// 6785 12687:aload_1         
	// 6786 12688:aload_1         
	// 6787 12689:getfield        #373 <Field int azh.l>
	// 6788 12692:aload_0         
	// 6789 12693:getfield        #12  <Field azh a>
	// 6790 12696:getfield        #217 <Field int azh.ch>
	// 6791 12699:iconst_m1       
	// 6792 12700:ixor            
	// 6793 12701:iand            
	// 6794 12702:putfield        #211 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6795 12705:aload_0         
	// 6796 12706:getfield        #12  <Field azh a>
	// 6797 12709:astore_1        
		abyte0.bw = ((azh) (abyte0)).l & ~a.ch;
	// 6798 12710:aload_1         
	// 6799 12711:aload_1         
	// 6800 12712:getfield        #373 <Field int azh.l>
	// 6801 12715:aload_0         
	// 6802 12716:getfield        #12  <Field azh a>
	// 6803 12719:getfield        #217 <Field int azh.ch>
	// 6804 12722:iconst_m1       
	// 6805 12723:ixor            
	// 6806 12724:iand            
	// 6807 12725:putfield        #185 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6808 12728:aload_0         
	// 6809 12729:getfield        #12  <Field azh a>
	// 6810 12732:astore_1        
		abyte0.cf = ((azh) (abyte0)).ch & a.l;
	// 6811 12733:aload_1         
	// 6812 12734:aload_1         
	// 6813 12735:getfield        #217 <Field int azh.ch>
	// 6814 12738:aload_0         
	// 6815 12739:getfield        #12  <Field azh a>
	// 6816 12742:getfield        #373 <Field int azh.l>
	// 6817 12745:iand            
	// 6818 12746:putfield        #128 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6819 12749:aload_0         
	// 6820 12750:getfield        #12  <Field azh a>
	// 6821 12753:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & a.ag;
	// 6822 12754:aload_1         
	// 6823 12755:aload_1         
	// 6824 12756:getfield        #460 <Field int azh.aW>
	// 6825 12759:aload_0         
	// 6826 12760:getfield        #12  <Field azh a>
	// 6827 12763:getfield        #104 <Field int azh.ag>
	// 6828 12766:iand            
	// 6829 12767:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6830 12770:aload_0         
	// 6831 12771:getfield        #12  <Field azh a>
	// 6832 12774:astore_1        
		abyte0.aW = ((azh) (abyte0)).aS ^ a.aW;
	// 6833 12775:aload_1         
	// 6834 12776:aload_1         
	// 6835 12777:getfield        #214 <Field int azh.aS>
	// 6836 12780:aload_0         
	// 6837 12781:getfield        #12  <Field azh a>
	// 6838 12784:getfield        #460 <Field int azh.aW>
	// 6839 12787:ixor            
	// 6840 12788:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6841 12791:aload_0         
	// 6842 12792:getfield        #12  <Field azh a>
	// 6843 12795:astore_1        
		abyte0.X = ((azh) (abyte0)).aW ^ a.X;
	// 6844 12796:aload_1         
	// 6845 12797:aload_1         
	// 6846 12798:getfield        #460 <Field int azh.aW>
	// 6847 12801:aload_0         
	// 6848 12802:getfield        #12  <Field azh a>
	// 6849 12805:getfield        #469 <Field int azh.X>
	// 6850 12808:ixor            
	// 6851 12809:putfield        #469 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 6852 12812:aload_0         
	// 6853 12813:getfield        #12  <Field azh a>
	// 6854 12816:astore_1        
		abyte0.aW = ((azh) (abyte0)).e & ~a.Q;
	// 6855 12817:aload_1         
	// 6856 12818:aload_1         
	// 6857 12819:getfield        #424 <Field int azh.e>
	// 6858 12822:aload_0         
	// 6859 12823:getfield        #12  <Field azh a>
	// 6860 12826:getfield        #83  <Field int azh.Q>
	// 6861 12829:iconst_m1       
	// 6862 12830:ixor            
	// 6863 12831:iand            
	// 6864 12832:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6865 12835:aload_0         
	// 6866 12836:getfield        #12  <Field azh a>
	// 6867 12839:astore_1        
		abyte0.aW = ((azh) (abyte0)).bH ^ a.aW;
	// 6868 12840:aload_1         
	// 6869 12841:aload_1         
	// 6870 12842:getfield        #439 <Field int azh.bH>
	// 6871 12845:aload_0         
	// 6872 12846:getfield        #12  <Field azh a>
	// 6873 12849:getfield        #460 <Field int azh.aW>
	// 6874 12852:ixor            
	// 6875 12853:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6876 12856:aload_0         
	// 6877 12857:getfield        #12  <Field azh a>
	// 6878 12860:astore_1        
		abyte0.bq = ((azh) (abyte0)).aW ^ a.bq;
	// 6879 12861:aload_1         
	// 6880 12862:aload_1         
	// 6881 12863:getfield        #460 <Field int azh.aW>
	// 6882 12866:aload_0         
	// 6883 12867:getfield        #12  <Field azh a>
	// 6884 12870:getfield        #26  <Field int azh.bq>
	// 6885 12873:ixor            
	// 6886 12874:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6887 12877:aload_0         
	// 6888 12878:getfield        #12  <Field azh a>
	// 6889 12881:astore_1        
		abyte0.aW = ((azh) (abyte0)).e & ~a.A;
	// 6890 12882:aload_1         
	// 6891 12883:aload_1         
	// 6892 12884:getfield        #424 <Field int azh.e>
	// 6893 12887:aload_0         
	// 6894 12888:getfield        #12  <Field azh a>
	// 6895 12891:getfield        #80  <Field int azh.A>
	// 6896 12894:iconst_m1       
	// 6897 12895:ixor            
	// 6898 12896:iand            
	// 6899 12897:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6900 12900:aload_0         
	// 6901 12901:getfield        #12  <Field azh a>
	// 6902 12904:astore_1        
		abyte0.aS = ((azh) (abyte0)).aW & ~a.Q;
	// 6903 12905:aload_1         
	// 6904 12906:aload_1         
	// 6905 12907:getfield        #460 <Field int azh.aW>
	// 6906 12910:aload_0         
	// 6907 12911:getfield        #12  <Field azh a>
	// 6908 12914:getfield        #83  <Field int azh.Q>
	// 6909 12917:iconst_m1       
	// 6910 12918:ixor            
	// 6911 12919:iand            
	// 6912 12920:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6913 12923:aload_0         
	// 6914 12924:getfield        #12  <Field azh a>
	// 6915 12927:astore_1        
		abyte0.aS = ((azh) (abyte0)).bX ^ a.aS;
	// 6916 12928:aload_1         
	// 6917 12929:aload_1         
	// 6918 12930:getfield        #430 <Field int azh.bX>
	// 6919 12933:aload_0         
	// 6920 12934:getfield        #12  <Field azh a>
	// 6921 12937:getfield        #214 <Field int azh.aS>
	// 6922 12940:ixor            
	// 6923 12941:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6924 12944:aload_0         
	// 6925 12945:getfield        #12  <Field azh a>
	// 6926 12948:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aW & ~a.Q;
	// 6927 12949:aload_1         
	// 6928 12950:aload_1         
	// 6929 12951:getfield        #460 <Field int azh.aW>
	// 6930 12954:aload_0         
	// 6931 12955:getfield        #12  <Field azh a>
	// 6932 12958:getfield        #83  <Field int azh.Q>
	// 6933 12961:iconst_m1       
	// 6934 12962:ixor            
	// 6935 12963:iand            
	// 6936 12964:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 6937 12967:aload_0         
	// 6938 12968:getfield        #12  <Field azh a>
	// 6939 12971:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aW ^ a.bZ;
	// 6940 12972:aload_1         
	// 6941 12973:aload_1         
	// 6942 12974:getfield        #460 <Field int azh.aW>
	// 6943 12977:aload_0         
	// 6944 12978:getfield        #12  <Field azh a>
	// 6945 12981:getfield        #59  <Field int azh.bZ>
	// 6946 12984:ixor            
	// 6947 12985:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 6948 12988:aload_0         
	// 6949 12989:getfield        #12  <Field azh a>
	// 6950 12992:astore_1        
		abyte0.bn = ((azh) (abyte0)).bZ ^ a.bn;
	// 6951 12993:aload_1         
	// 6952 12994:aload_1         
	// 6953 12995:getfield        #59  <Field int azh.bZ>
	// 6954 12998:aload_0         
	// 6955 12999:getfield        #12  <Field azh a>
	// 6956 13002:getfield        #358 <Field int azh.bn>
	// 6957 13005:ixor            
	// 6958 13006:putfield        #358 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 6959 13009:aload_0         
	// 6960 13010:getfield        #12  <Field azh a>
	// 6961 13013:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & ~a.Q;
	// 6962 13014:aload_1         
	// 6963 13015:aload_1         
	// 6964 13016:getfield        #460 <Field int azh.aW>
	// 6965 13019:aload_0         
	// 6966 13020:getfield        #12  <Field azh a>
	// 6967 13023:getfield        #83  <Field int azh.Q>
	// 6968 13026:iconst_m1       
	// 6969 13027:ixor            
	// 6970 13028:iand            
	// 6971 13029:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6972 13032:aload_0         
	// 6973 13033:getfield        #12  <Field azh a>
	// 6974 13036:astore_1        
		abyte0.aW = ((azh) (abyte0)).bH ^ a.aW;
	// 6975 13037:aload_1         
	// 6976 13038:aload_1         
	// 6977 13039:getfield        #439 <Field int azh.bH>
	// 6978 13042:aload_0         
	// 6979 13043:getfield        #12  <Field azh a>
	// 6980 13046:getfield        #460 <Field int azh.aW>
	// 6981 13049:ixor            
	// 6982 13050:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6983 13053:aload_0         
	// 6984 13054:getfield        #12  <Field azh a>
	// 6985 13057:astore_1        
		abyte0.aE = ((azh) (abyte0)).aW ^ a.aE;
	// 6986 13058:aload_1         
	// 6987 13059:aload_1         
	// 6988 13060:getfield        #460 <Field int azh.aW>
	// 6989 13063:aload_0         
	// 6990 13064:getfield        #12  <Field azh a>
	// 6991 13067:getfield        #421 <Field int azh.aE>
	// 6992 13070:ixor            
	// 6993 13071:putfield        #421 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 6994 13074:aload_0         
	// 6995 13075:getfield        #12  <Field azh a>
	// 6996 13078:astore_1        
		abyte0.aW = ((azh) (abyte0)).e & ~a.Q;
	// 6997 13079:aload_1         
	// 6998 13080:aload_1         
	// 6999 13081:getfield        #424 <Field int azh.e>
	// 7000 13084:aload_0         
	// 7001 13085:getfield        #12  <Field azh a>
	// 7002 13088:getfield        #83  <Field int azh.Q>
	// 7003 13091:iconst_m1       
	// 7004 13092:ixor            
	// 7005 13093:iand            
	// 7006 13094:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7007 13097:aload_0         
	// 7008 13098:getfield        #12  <Field azh a>
	// 7009 13101:astore_1        
		abyte0.aW = ((azh) (abyte0)).bX ^ a.aW;
	// 7010 13102:aload_1         
	// 7011 13103:aload_1         
	// 7012 13104:getfield        #430 <Field int azh.bX>
	// 7013 13107:aload_0         
	// 7014 13108:getfield        #12  <Field azh a>
	// 7015 13111:getfield        #460 <Field int azh.aW>
	// 7016 13114:ixor            
	// 7017 13115:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7018 13118:aload_0         
	// 7019 13119:getfield        #12  <Field azh a>
	// 7020 13122:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & ~a.ag;
	// 7021 13123:aload_1         
	// 7022 13124:aload_1         
	// 7023 13125:getfield        #460 <Field int azh.aW>
	// 7024 13128:aload_0         
	// 7025 13129:getfield        #12  <Field azh a>
	// 7026 13132:getfield        #104 <Field int azh.ag>
	// 7027 13135:iconst_m1       
	// 7028 13136:ixor            
	// 7029 13137:iand            
	// 7030 13138:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7031 13141:aload_0         
	// 7032 13142:getfield        #12  <Field azh a>
	// 7033 13145:astore_1        
		abyte0.bX = ((azh) (abyte0)).e | a.A;
	// 7034 13146:aload_1         
	// 7035 13147:aload_1         
	// 7036 13148:getfield        #424 <Field int azh.e>
	// 7037 13151:aload_0         
	// 7038 13152:getfield        #12  <Field azh a>
	// 7039 13155:getfield        #80  <Field int azh.A>
	// 7040 13158:ior             
	// 7041 13159:putfield        #430 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7042 13162:aload_0         
	// 7043 13163:getfield        #12  <Field azh a>
	// 7044 13166:astore_1        
		abyte0.aW = ((azh) (abyte0)).bX ^ a.aW;
	// 7045 13167:aload_1         
	// 7046 13168:aload_1         
	// 7047 13169:getfield        #430 <Field int azh.bX>
	// 7048 13172:aload_0         
	// 7049 13173:getfield        #12  <Field azh a>
	// 7050 13176:getfield        #460 <Field int azh.aW>
	// 7051 13179:ixor            
	// 7052 13180:putfield        #460 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7053 13183:aload_0         
	// 7054 13184:getfield        #12  <Field azh a>
	// 7055 13187:astore_1        
		abyte0.bH = ((azh) (abyte0)).bX & ~a.Q;
	// 7056 13188:aload_1         
	// 7057 13189:aload_1         
	// 7058 13190:getfield        #430 <Field int azh.bX>
	// 7059 13193:aload_0         
	// 7060 13194:getfield        #12  <Field azh a>
	// 7061 13197:getfield        #83  <Field int azh.Q>
	// 7062 13200:iconst_m1       
	// 7063 13201:ixor            
	// 7064 13202:iand            
	// 7065 13203:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7066 13206:aload_0         
	// 7067 13207:getfield        #12  <Field azh a>
	// 7068 13210:astore_1        
		abyte0.bH = ((azh) (abyte0)).bX ^ a.bH;
	// 7069 13211:aload_1         
	// 7070 13212:aload_1         
	// 7071 13213:getfield        #430 <Field int azh.bX>
	// 7072 13216:aload_0         
	// 7073 13217:getfield        #12  <Field azh a>
	// 7074 13220:getfield        #439 <Field int azh.bH>
	// 7075 13223:ixor            
	// 7076 13224:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7077 13227:aload_0         
	// 7078 13228:getfield        #12  <Field azh a>
	// 7079 13231:astore_1        
		abyte0.bH = ((azh) (abyte0)).ag & a.bH;
	// 7080 13232:aload_1         
	// 7081 13233:aload_1         
	// 7082 13234:getfield        #104 <Field int azh.ag>
	// 7083 13237:aload_0         
	// 7084 13238:getfield        #12  <Field azh a>
	// 7085 13241:getfield        #439 <Field int azh.bH>
	// 7086 13244:iand            
	// 7087 13245:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7088 13248:aload_0         
	// 7089 13249:getfield        #12  <Field azh a>
	// 7090 13252:astore_1        
		abyte0.bH = ((azh) (abyte0)).bt ^ a.bH;
	// 7091 13253:aload_1         
	// 7092 13254:aload_1         
	// 7093 13255:getfield        #397 <Field int azh.bt>
	// 7094 13258:aload_0         
	// 7095 13259:getfield        #12  <Field azh a>
	// 7096 13262:getfield        #439 <Field int azh.bH>
	// 7097 13265:ixor            
	// 7098 13266:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7099 13269:aload_0         
	// 7100 13270:getfield        #12  <Field azh a>
	// 7101 13273:astore_1        
		abyte0.bt = ((azh) (abyte0)).Q | a.bX;
	// 7102 13274:aload_1         
	// 7103 13275:aload_1         
	// 7104 13276:getfield        #83  <Field int azh.Q>
	// 7105 13279:aload_0         
	// 7106 13280:getfield        #12  <Field azh a>
	// 7107 13283:getfield        #430 <Field int azh.bX>
	// 7108 13286:ior             
	// 7109 13287:putfield        #397 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7110 13290:aload_0         
	// 7111 13291:getfield        #12  <Field azh a>
	// 7112 13294:astore_1        
		abyte0.bt = ((azh) (abyte0)).bX ^ a.bt;
	// 7113 13295:aload_1         
	// 7114 13296:aload_1         
	// 7115 13297:getfield        #430 <Field int azh.bX>
	// 7116 13300:aload_0         
	// 7117 13301:getfield        #12  <Field azh a>
	// 7118 13304:getfield        #397 <Field int azh.bt>
	// 7119 13307:ixor            
	// 7120 13308:putfield        #397 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7121 13311:aload_0         
	// 7122 13312:getfield        #12  <Field azh a>
	// 7123 13315:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ag | a.bt;
	// 7124 13316:aload_1         
	// 7125 13317:aload_1         
	// 7126 13318:getfield        #104 <Field int azh.ag>
	// 7127 13321:aload_0         
	// 7128 13322:getfield        #12  <Field azh a>
	// 7129 13325:getfield        #397 <Field int azh.bt>
	// 7130 13328:ior             
	// 7131 13329:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 7132 13332:aload_0         
	// 7133 13333:getfield        #12  <Field azh a>
	// 7134 13336:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bx ^ a.bZ;
	// 7135 13337:aload_1         
	// 7136 13338:aload_1         
	// 7137 13339:getfield        #418 <Field int azh.bx>
	// 7138 13342:aload_0         
	// 7139 13343:getfield        #12  <Field azh a>
	// 7140 13346:getfield        #59  <Field int azh.bZ>
	// 7141 13349:ixor            
	// 7142 13350:putfield        #59  <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 7143 13353:aload_0         
	// 7144 13354:getfield        #12  <Field azh a>
	// 7145 13357:astore_1        
		abyte0.bW = ((azh) (abyte0)).bt ^ a.bW;
	// 7146 13358:aload_1         
	// 7147 13359:aload_1         
	// 7148 13360:getfield        #397 <Field int azh.bt>
	// 7149 13363:aload_0         
	// 7150 13364:getfield        #12  <Field azh a>
	// 7151 13367:getfield        #394 <Field int azh.bW>
	// 7152 13370:ixor            
	// 7153 13371:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 7154 13374:aload_0         
	// 7155 13375:getfield        #12  <Field azh a>
	// 7156 13378:astore_1        
		abyte0.bx = ((azh) (abyte0)).bt & a.ag;
	// 7157 13379:aload_1         
	// 7158 13380:aload_1         
	// 7159 13381:getfield        #397 <Field int azh.bt>
	// 7160 13384:aload_0         
	// 7161 13385:getfield        #12  <Field azh a>
	// 7162 13388:getfield        #104 <Field int azh.ag>
	// 7163 13391:iand            
	// 7164 13392:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7165 13395:aload_0         
	// 7166 13396:getfield        #12  <Field azh a>
	// 7167 13399:astore_1        
		abyte0.bC = ((azh) (abyte0)).bX & ~a.e;
	// 7168 13400:aload_1         
	// 7169 13401:aload_1         
	// 7170 13402:getfield        #430 <Field int azh.bX>
	// 7171 13405:aload_0         
	// 7172 13406:getfield        #12  <Field azh a>
	// 7173 13409:getfield        #424 <Field int azh.e>
	// 7174 13412:iconst_m1       
	// 7175 13413:ixor            
	// 7176 13414:iand            
	// 7177 13415:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 7178 13418:aload_0         
	// 7179 13419:getfield        #12  <Field azh a>
	// 7180 13422:astore_1        
		abyte0.aH = ((azh) (abyte0)).bC ^ a.aH;
	// 7181 13423:aload_1         
	// 7182 13424:aload_1         
	// 7183 13425:getfield        #134 <Field int azh.bC>
	// 7184 13428:aload_0         
	// 7185 13429:getfield        #12  <Field azh a>
	// 7186 13432:getfield        #95  <Field int azh.aH>
	// 7187 13435:ixor            
	// 7188 13436:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 7189 13439:aload_0         
	// 7190 13440:getfield        #12  <Field azh a>
	// 7191 13443:astore_1        
		abyte0.bx = ((azh) (abyte0)).bC ^ a.bx;
	// 7192 13444:aload_1         
	// 7193 13445:aload_1         
	// 7194 13446:getfield        #134 <Field int azh.bC>
	// 7195 13449:aload_0         
	// 7196 13450:getfield        #12  <Field azh a>
	// 7197 13453:getfield        #418 <Field int azh.bx>
	// 7198 13456:ixor            
	// 7199 13457:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7200 13460:aload_0         
	// 7201 13461:getfield        #12  <Field azh a>
	// 7202 13464:astore_1        
		abyte0.bC = ((azh) (abyte0)).ag | a.bC;
	// 7203 13465:aload_1         
	// 7204 13466:aload_1         
	// 7205 13467:getfield        #104 <Field int azh.ag>
	// 7206 13470:aload_0         
	// 7207 13471:getfield        #12  <Field azh a>
	// 7208 13474:getfield        #134 <Field int azh.bC>
	// 7209 13477:ior             
	// 7210 13478:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 7211 13481:aload_0         
	// 7212 13482:getfield        #12  <Field azh a>
	// 7213 13485:astore_1        
		abyte0.bC = ((azh) (abyte0)).bt ^ a.bC;
	// 7214 13486:aload_1         
	// 7215 13487:aload_1         
	// 7216 13488:getfield        #397 <Field int azh.bt>
	// 7217 13491:aload_0         
	// 7218 13492:getfield        #12  <Field azh a>
	// 7219 13495:getfield        #134 <Field int azh.bC>
	// 7220 13498:ixor            
	// 7221 13499:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 7222 13502:aload_0         
	// 7223 13503:getfield        #12  <Field azh a>
	// 7224 13506:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bX ^ a.aZ;
	// 7225 13507:aload_1         
	// 7226 13508:aload_1         
	// 7227 13509:getfield        #430 <Field int azh.bX>
	// 7228 13512:aload_0         
	// 7229 13513:getfield        #12  <Field azh a>
	// 7230 13516:getfield        #445 <Field int azh.aZ>
	// 7231 13519:ixor            
	// 7232 13520:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7233 13523:aload_0         
	// 7234 13524:getfield        #12  <Field azh a>
	// 7235 13527:astore_1        
		abyte0.aZ = ((azh) (abyte0)).ag | a.aZ;
	// 7236 13528:aload_1         
	// 7237 13529:aload_1         
	// 7238 13530:getfield        #104 <Field int azh.ag>
	// 7239 13533:aload_0         
	// 7240 13534:getfield        #12  <Field azh a>
	// 7241 13537:getfield        #445 <Field int azh.aZ>
	// 7242 13540:ior             
	// 7243 13541:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7244 13544:aload_0         
	// 7245 13545:getfield        #12  <Field azh a>
	// 7246 13548:astore_1        
		abyte0.aZ = ((azh) (abyte0)).av ^ a.aZ;
	// 7247 13549:aload_1         
	// 7248 13550:aload_1         
	// 7249 13551:getfield        #53  <Field int azh.av>
	// 7250 13554:aload_0         
	// 7251 13555:getfield        #12  <Field azh a>
	// 7252 13558:getfield        #445 <Field int azh.aZ>
	// 7253 13561:ixor            
	// 7254 13562:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7255 13565:aload_0         
	// 7256 13566:getfield        #12  <Field azh a>
	// 7257 13569:astore_1        
		abyte0.aP = ((azh) (abyte0)).L & ~a.aP;
	// 7258 13570:aload_1         
	// 7259 13571:aload_1         
	// 7260 13572:getfield        #271 <Field int azh.L>
	// 7261 13575:aload_0         
	// 7262 13576:getfield        #12  <Field azh a>
	// 7263 13579:getfield        #472 <Field int azh.aP>
	// 7264 13582:iconst_m1       
	// 7265 13583:ixor            
	// 7266 13584:iand            
	// 7267 13585:putfield        #472 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 7268 13588:aload_0         
	// 7269 13589:getfield        #12  <Field azh a>
	// 7270 13592:astore_1        
		abyte0.aP = ((azh) (abyte0)).aK ^ a.aP;
	// 7271 13593:aload_1         
	// 7272 13594:aload_1         
	// 7273 13595:getfield        #475 <Field int azh.aK>
	// 7274 13598:aload_0         
	// 7275 13599:getfield        #12  <Field azh a>
	// 7276 13602:getfield        #472 <Field int azh.aP>
	// 7277 13605:ixor            
	// 7278 13606:putfield        #472 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 7279 13609:aload_0         
	// 7280 13610:getfield        #12  <Field azh a>
	// 7281 13613:astore_1        
		abyte0.aw = ((azh) (abyte0)).aP ^ a.aw;
	// 7282 13614:aload_1         
	// 7283 13615:aload_1         
	// 7284 13616:getfield        #472 <Field int azh.aP>
	// 7285 13619:aload_0         
	// 7286 13620:getfield        #12  <Field azh a>
	// 7287 13623:getfield        #304 <Field int azh.aw>
	// 7288 13626:ixor            
	// 7289 13627:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 7290 13630:aload_0         
	// 7291 13631:getfield        #12  <Field azh a>
	// 7292 13634:astore_1        
		abyte0.c = ((azh) (abyte0)).aw ^ a.c;
	// 7293 13635:aload_1         
	// 7294 13636:aload_1         
	// 7295 13637:getfield        #304 <Field int azh.aw>
	// 7296 13640:aload_0         
	// 7297 13641:getfield        #12  <Field azh a>
	// 7298 13644:getfield        #256 <Field int azh.c>
	// 7299 13647:ixor            
	// 7300 13648:putfield        #256 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7301 13651:aload_0         
	// 7302 13652:getfield        #12  <Field azh a>
	// 7303 13655:astore_1        
		abyte0.aw = ((azh) (abyte0)).A & ~a.c;
	// 7304 13656:aload_1         
	// 7305 13657:aload_1         
	// 7306 13658:getfield        #80  <Field int azh.A>
	// 7307 13661:aload_0         
	// 7308 13662:getfield        #12  <Field azh a>
	// 7309 13665:getfield        #256 <Field int azh.c>
	// 7310 13668:iconst_m1       
	// 7311 13669:ixor            
	// 7312 13670:iand            
	// 7313 13671:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 7314 13674:aload_0         
	// 7315 13675:getfield        #12  <Field azh a>
	// 7316 13678:astore_1        
		abyte0.aw = ((azh) (abyte0)).c ^ a.aw;
	// 7317 13679:aload_1         
	// 7318 13680:aload_1         
	// 7319 13681:getfield        #256 <Field int azh.c>
	// 7320 13684:aload_0         
	// 7321 13685:getfield        #12  <Field azh a>
	// 7322 13688:getfield        #304 <Field int azh.aw>
	// 7323 13691:ixor            
	// 7324 13692:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 7325 13695:aload_0         
	// 7326 13696:getfield        #12  <Field azh a>
	// 7327 13699:astore_1        
		abyte0.aP = ((azh) (abyte0)).c & ~a.O;
	// 7328 13700:aload_1         
	// 7329 13701:aload_1         
	// 7330 13702:getfield        #256 <Field int azh.c>
	// 7331 13705:aload_0         
	// 7332 13706:getfield        #12  <Field azh a>
	// 7333 13709:getfield        #241 <Field int azh.O>
	// 7334 13712:iconst_m1       
	// 7335 13713:ixor            
	// 7336 13714:iand            
	// 7337 13715:putfield        #472 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 7338 13718:aload_0         
	// 7339 13719:getfield        #12  <Field azh a>
	// 7340 13722:astore_1        
		abyte0.aK = ((azh) (abyte0)).c ^ a.O;
	// 7341 13723:aload_1         
	// 7342 13724:aload_1         
	// 7343 13725:getfield        #256 <Field int azh.c>
	// 7344 13728:aload_0         
	// 7345 13729:getfield        #12  <Field azh a>
	// 7346 13732:getfield        #241 <Field int azh.O>
	// 7347 13735:ixor            
	// 7348 13736:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 7349 13739:aload_0         
	// 7350 13740:getfield        #12  <Field azh a>
	// 7351 13743:astore_1        
		abyte0.av = ((azh) (abyte0)).c & ~a.y;
	// 7352 13744:aload_1         
	// 7353 13745:aload_1         
	// 7354 13746:getfield        #256 <Field int azh.c>
	// 7355 13749:aload_0         
	// 7356 13750:getfield        #12  <Field azh a>
	// 7357 13753:getfield        #179 <Field int azh.y>
	// 7358 13756:iconst_m1       
	// 7359 13757:ixor            
	// 7360 13758:iand            
	// 7361 13759:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7362 13762:aload_0         
	// 7363 13763:getfield        #12  <Field azh a>
	// 7364 13766:astore_1        
		abyte0.bX = ((azh) (abyte0)).av & ~a.O;
	// 7365 13767:aload_1         
	// 7366 13768:aload_1         
	// 7367 13769:getfield        #53  <Field int azh.av>
	// 7368 13772:aload_0         
	// 7369 13773:getfield        #12  <Field azh a>
	// 7370 13776:getfield        #241 <Field int azh.O>
	// 7371 13779:iconst_m1       
	// 7372 13780:ixor            
	// 7373 13781:iand            
	// 7374 13782:putfield        #430 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7375 13785:aload_0         
	// 7376 13786:getfield        #12  <Field azh a>
	// 7377 13789:astore_1        
		abyte0.bs = ((azh) (abyte0)).av ^ a.bs;
	// 7378 13790:aload_1         
	// 7379 13791:aload_1         
	// 7380 13792:getfield        #53  <Field int azh.av>
	// 7381 13795:aload_0         
	// 7382 13796:getfield        #12  <Field azh a>
	// 7383 13799:getfield        #229 <Field int azh.bs>
	// 7384 13802:ixor            
	// 7385 13803:putfield        #229 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 7386 13806:aload_0         
	// 7387 13807:getfield        #12  <Field azh a>
	// 7388 13810:astore_1        
		abyte0.bs = ((azh) (abyte0)).G & ~a.bs;
	// 7389 13811:aload_1         
	// 7390 13812:aload_1         
	// 7391 13813:getfield        #176 <Field int azh.G>
	// 7392 13816:aload_0         
	// 7393 13817:getfield        #12  <Field azh a>
	// 7394 13820:getfield        #229 <Field int azh.bs>
	// 7395 13823:iconst_m1       
	// 7396 13824:ixor            
	// 7397 13825:iand            
	// 7398 13826:putfield        #229 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 7399 13829:aload_0         
	// 7400 13830:getfield        #12  <Field azh a>
	// 7401 13833:astore_1        
		abyte0.av = ((azh) (abyte0)).c & ~a.k;
	// 7402 13834:aload_1         
	// 7403 13835:aload_1         
	// 7404 13836:getfield        #256 <Field int azh.c>
	// 7405 13839:aload_0         
	// 7406 13840:getfield        #12  <Field azh a>
	// 7407 13843:getfield        #164 <Field int azh.k>
	// 7408 13846:iconst_m1       
	// 7409 13847:ixor            
	// 7410 13848:iand            
	// 7411 13849:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7412 13852:aload_0         
	// 7413 13853:getfield        #12  <Field azh a>
	// 7414 13856:astore_1        
		abyte0.bt = ((azh) (abyte0)).O | a.c;
	// 7415 13857:aload_1         
	// 7416 13858:aload_1         
	// 7417 13859:getfield        #241 <Field int azh.O>
	// 7418 13862:aload_0         
	// 7419 13863:getfield        #12  <Field azh a>
	// 7420 13866:getfield        #256 <Field int azh.c>
	// 7421 13869:ior             
	// 7422 13870:putfield        #397 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7423 13873:aload_0         
	// 7424 13874:getfield        #12  <Field azh a>
	// 7425 13877:astore_1        
		abyte0.bI = ((azh) (abyte0)).y & a.c;
	// 7426 13878:aload_1         
	// 7427 13879:aload_1         
	// 7428 13880:getfield        #179 <Field int azh.y>
	// 7429 13883:aload_0         
	// 7430 13884:getfield        #12  <Field azh a>
	// 7431 13887:getfield        #256 <Field int azh.c>
	// 7432 13890:iand            
	// 7433 13891:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 7434 13894:aload_0         
	// 7435 13895:getfield        #12  <Field azh a>
	// 7436 13898:astore_1        
		abyte0.aL = ((azh) (abyte0)).bI & ~a.O;
	// 7437 13899:aload_1         
	// 7438 13900:aload_1         
	// 7439 13901:getfield        #65  <Field int azh.bI>
	// 7440 13904:aload_0         
	// 7441 13905:getfield        #12  <Field azh a>
	// 7442 13908:getfield        #241 <Field int azh.O>
	// 7443 13911:iconst_m1       
	// 7444 13912:ixor            
	// 7445 13913:iand            
	// 7446 13914:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7447 13917:aload_0         
	// 7448 13918:getfield        #12  <Field azh a>
	// 7449 13921:astore_1        
		abyte0.bX = ((azh) (abyte0)).bI ^ a.bX;
	// 7450 13922:aload_1         
	// 7451 13923:aload_1         
	// 7452 13924:getfield        #65  <Field int azh.bI>
	// 7453 13927:aload_0         
	// 7454 13928:getfield        #12  <Field azh a>
	// 7455 13931:getfield        #430 <Field int azh.bX>
	// 7456 13934:ixor            
	// 7457 13935:putfield        #430 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7458 13938:aload_0         
	// 7459 13939:getfield        #12  <Field azh a>
	// 7460 13942:astore_1        
		abyte0.bX = ((azh) (abyte0)).G | a.bX;
	// 7461 13943:aload_1         
	// 7462 13944:aload_1         
	// 7463 13945:getfield        #176 <Field int azh.G>
	// 7464 13948:aload_0         
	// 7465 13949:getfield        #12  <Field azh a>
	// 7466 13952:getfield        #430 <Field int azh.bX>
	// 7467 13955:ior             
	// 7468 13956:putfield        #430 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7469 13959:aload_0         
	// 7470 13960:getfield        #12  <Field azh a>
	// 7471 13963:astore_1        
		abyte0.bt = ((azh) (abyte0)).bI ^ a.bt;
	// 7472 13964:aload_1         
	// 7473 13965:aload_1         
	// 7474 13966:getfield        #65  <Field int azh.bI>
	// 7475 13969:aload_0         
	// 7476 13970:getfield        #12  <Field azh a>
	// 7477 13973:getfield        #397 <Field int azh.bt>
	// 7478 13976:ixor            
	// 7479 13977:putfield        #397 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7480 13980:aload_0         
	// 7481 13981:getfield        #12  <Field azh a>
	// 7482 13984:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt ^ a.G;
	// 7483 13985:aload_1         
	// 7484 13986:aload_1         
	// 7485 13987:getfield        #397 <Field int azh.bt>
	// 7486 13990:aload_0         
	// 7487 13991:getfield        #12  <Field azh a>
	// 7488 13994:getfield        #176 <Field int azh.G>
	// 7489 13997:ixor            
	// 7490 13998:putfield        #397 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 7491 14001:aload_0         
	// 7492 14002:getfield        #12  <Field azh a>
	// 7493 14005:astore_1        
		abyte0.bU = ((azh) (abyte0)).c & ~a.bI;
	// 7494 14006:aload_1         
	// 7495 14007:aload_1         
	// 7496 14008:getfield        #256 <Field int azh.c>
	// 7497 14011:aload_0         
	// 7498 14012:getfield        #12  <Field azh a>
	// 7499 14015:getfield        #65  <Field int azh.bI>
	// 7500 14018:iconst_m1       
	// 7501 14019:ixor            
	// 7502 14020:iand            
	// 7503 14021:putfield        #41  <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 7504 14024:aload_0         
	// 7505 14025:getfield        #12  <Field azh a>
	// 7506 14028:astore_1        
		abyte0.bh = ((azh) (abyte0)).O | a.bU;
	// 7507 14029:aload_1         
	// 7508 14030:aload_1         
	// 7509 14031:getfield        #241 <Field int azh.O>
	// 7510 14034:aload_0         
	// 7511 14035:getfield        #12  <Field azh a>
	// 7512 14038:getfield        #41  <Field int azh.bU>
	// 7513 14041:ior             
	// 7514 14042:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 7515 14045:aload_0         
	// 7516 14046:getfield        #12  <Field azh a>
	// 7517 14049:astore_1        
		abyte0.bg = ((azh) (abyte0)).bh & ~a.G;
	// 7518 14050:aload_1         
	// 7519 14051:aload_1         
	// 7520 14052:getfield        #122 <Field int azh.bh>
	// 7521 14055:aload_0         
	// 7522 14056:getfield        #12  <Field azh a>
	// 7523 14059:getfield        #176 <Field int azh.G>
	// 7524 14062:iconst_m1       
	// 7525 14063:ixor            
	// 7526 14064:iand            
	// 7527 14065:putfield        #143 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 7528 14068:aload_0         
	// 7529 14069:getfield        #12  <Field azh a>
	// 7530 14072:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh | a.G;
	// 7531 14073:aload_1         
	// 7532 14074:aload_1         
	// 7533 14075:getfield        #122 <Field int azh.bh>
	// 7534 14078:aload_0         
	// 7535 14079:getfield        #12  <Field azh a>
	// 7536 14082:getfield        #176 <Field int azh.G>
	// 7537 14085:ior             
	// 7538 14086:putfield        #122 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 7539 14089:aload_0         
	// 7540 14090:getfield        #12  <Field azh a>
	// 7541 14093:astore_1        
		abyte0.aP = ((azh) (abyte0)).bU ^ a.aP;
	// 7542 14094:aload_1         
	// 7543 14095:aload_1         
	// 7544 14096:getfield        #41  <Field int azh.bU>
	// 7545 14099:aload_0         
	// 7546 14100:getfield        #12  <Field azh a>
	// 7547 14103:getfield        #472 <Field int azh.aP>
	// 7548 14106:ixor            
	// 7549 14107:putfield        #472 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 7550 14110:aload_0         
	// 7551 14111:getfield        #12  <Field azh a>
	// 7552 14114:astore_1        
		abyte0.bd = ((azh) (abyte0)).bI & ~a.G;
	// 7553 14115:aload_1         
	// 7554 14116:aload_1         
	// 7555 14117:getfield        #65  <Field int azh.bI>
	// 7556 14120:aload_0         
	// 7557 14121:getfield        #12  <Field azh a>
	// 7558 14124:getfield        #176 <Field int azh.G>
	// 7559 14127:iconst_m1       
	// 7560 14128:ixor            
	// 7561 14129:iand            
	// 7562 14130:putfield        #343 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 7563 14133:aload_0         
	// 7564 14134:getfield        #12  <Field azh a>
	// 7565 14137:astore_1        
		abyte0.aA = ((azh) (abyte0)).c & ~a.G;
	// 7566 14138:aload_1         
	// 7567 14139:aload_1         
	// 7568 14140:getfield        #256 <Field int azh.c>
	// 7569 14143:aload_0         
	// 7570 14144:getfield        #12  <Field azh a>
	// 7571 14147:getfield        #176 <Field int azh.G>
	// 7572 14150:iconst_m1       
	// 7573 14151:ixor            
	// 7574 14152:iand            
	// 7575 14153:putfield        #298 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7576 14156:aload_0         
	// 7577 14157:getfield        #12  <Field azh a>
	// 7578 14160:astore_1        
		abyte0.bk = ((azh) (abyte0)).y & ~a.c;
	// 7579 14161:aload_1         
	// 7580 14162:aload_1         
	// 7581 14163:getfield        #179 <Field int azh.y>
	// 7582 14166:aload_0         
	// 7583 14167:getfield        #12  <Field azh a>
	// 7584 14170:getfield        #256 <Field int azh.c>
	// 7585 14173:iconst_m1       
	// 7586 14174:ixor            
	// 7587 14175:iand            
	// 7588 14176:putfield        #346 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7589 14179:aload_0         
	// 7590 14180:getfield        #12  <Field azh a>
	// 7591 14183:astore_1        
		abyte0.bl = ((azh) (abyte0)).bk & ~a.O;
	// 7592 14184:aload_1         
	// 7593 14185:aload_1         
	// 7594 14186:getfield        #346 <Field int azh.bk>
	// 7595 14189:aload_0         
	// 7596 14190:getfield        #12  <Field azh a>
	// 7597 14193:getfield        #241 <Field int azh.O>
	// 7598 14196:iconst_m1       
	// 7599 14197:ixor            
	// 7600 14198:iand            
	// 7601 14199:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7602 14202:aload_0         
	// 7603 14203:getfield        #12  <Field azh a>
	// 7604 14206:astore_1        
		abyte0.bB = ((azh) (abyte0)).bk & ~a.O;
	// 7605 14207:aload_1         
	// 7606 14208:aload_1         
	// 7607 14209:getfield        #346 <Field int azh.bk>
	// 7608 14212:aload_0         
	// 7609 14213:getfield        #12  <Field azh a>
	// 7610 14216:getfield        #241 <Field int azh.O>
	// 7611 14219:iconst_m1       
	// 7612 14220:ixor            
	// 7613 14221:iand            
	// 7614 14222:putfield        #337 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7615 14225:aload_0         
	// 7616 14226:getfield        #12  <Field azh a>
	// 7617 14229:astore_1        
		abyte0.bB = ((azh) (abyte0)).c ^ a.bB;
	// 7618 14230:aload_1         
	// 7619 14231:aload_1         
	// 7620 14232:getfield        #256 <Field int azh.c>
	// 7621 14235:aload_0         
	// 7622 14236:getfield        #12  <Field azh a>
	// 7623 14239:getfield        #337 <Field int azh.bB>
	// 7624 14242:ixor            
	// 7625 14243:putfield        #337 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7626 14246:aload_0         
	// 7627 14247:getfield        #12  <Field azh a>
	// 7628 14250:astore_1        
		abyte0.bB = ((azh) (abyte0)).G & a.bB;
	// 7629 14251:aload_1         
	// 7630 14252:aload_1         
	// 7631 14253:getfield        #176 <Field int azh.G>
	// 7632 14256:aload_0         
	// 7633 14257:getfield        #12  <Field azh a>
	// 7634 14260:getfield        #337 <Field int azh.bB>
	// 7635 14263:iand            
	// 7636 14264:putfield        #337 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7637 14267:aload_0         
	// 7638 14268:getfield        #12  <Field azh a>
	// 7639 14271:astore_1        
		abyte0.bB = ((azh) (abyte0)).bU ^ a.bB;
	// 7640 14272:aload_1         
	// 7641 14273:aload_1         
	// 7642 14274:getfield        #41  <Field int azh.bU>
	// 7643 14277:aload_0         
	// 7644 14278:getfield        #12  <Field azh a>
	// 7645 14281:getfield        #337 <Field int azh.bB>
	// 7646 14284:ixor            
	// 7647 14285:putfield        #337 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7648 14288:aload_0         
	// 7649 14289:getfield        #12  <Field azh a>
	// 7650 14292:astore_1        
		abyte0.aR = ((azh) (abyte0)).bk ^ a.aR;
	// 7651 14293:aload_1         
	// 7652 14294:aload_1         
	// 7653 14295:getfield        #346 <Field int azh.bk>
	// 7654 14298:aload_0         
	// 7655 14299:getfield        #12  <Field azh a>
	// 7656 14302:getfield        #232 <Field int azh.aR>
	// 7657 14305:ixor            
	// 7658 14306:putfield        #232 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 7659 14309:aload_0         
	// 7660 14310:getfield        #12  <Field azh a>
	// 7661 14313:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR & ~a.G;
	// 7662 14314:aload_1         
	// 7663 14315:aload_1         
	// 7664 14316:getfield        #232 <Field int azh.aR>
	// 7665 14319:aload_0         
	// 7666 14320:getfield        #12  <Field azh a>
	// 7667 14323:getfield        #176 <Field int azh.G>
	// 7668 14326:iconst_m1       
	// 7669 14327:ixor            
	// 7670 14328:iand            
	// 7671 14329:putfield        #232 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 7672 14332:aload_0         
	// 7673 14333:getfield        #12  <Field azh a>
	// 7674 14336:astore_1        
		abyte0.bk = ((azh) (abyte0)).y | a.c;
	// 7675 14337:aload_1         
	// 7676 14338:aload_1         
	// 7677 14339:getfield        #179 <Field int azh.y>
	// 7678 14342:aload_0         
	// 7679 14343:getfield        #12  <Field azh a>
	// 7680 14346:getfield        #256 <Field int azh.c>
	// 7681 14349:ior             
	// 7682 14350:putfield        #346 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7683 14353:aload_0         
	// 7684 14354:getfield        #12  <Field azh a>
	// 7685 14357:astore_1        
		abyte0.bl = ((azh) (abyte0)).bk ^ a.bl;
	// 7686 14358:aload_1         
	// 7687 14359:aload_1         
	// 7688 14360:getfield        #346 <Field int azh.bk>
	// 7689 14363:aload_0         
	// 7690 14364:getfield        #12  <Field azh a>
	// 7691 14367:getfield        #334 <Field int azh.bl>
	// 7692 14370:ixor            
	// 7693 14371:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7694 14374:aload_0         
	// 7695 14375:getfield        #12  <Field azh a>
	// 7696 14378:astore_1        
		abyte0.aA = ((azh) (abyte0)).bl ^ a.aA;
	// 7697 14379:aload_1         
	// 7698 14380:aload_1         
	// 7699 14381:getfield        #334 <Field int azh.bl>
	// 7700 14384:aload_0         
	// 7701 14385:getfield        #12  <Field azh a>
	// 7702 14388:getfield        #298 <Field int azh.aA>
	// 7703 14391:ixor            
	// 7704 14392:putfield        #298 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7705 14395:aload_0         
	// 7706 14396:getfield        #12  <Field azh a>
	// 7707 14399:astore_1        
		abyte0.bl = ((azh) (abyte0)).O | a.bk;
	// 7708 14400:aload_1         
	// 7709 14401:aload_1         
	// 7710 14402:getfield        #241 <Field int azh.O>
	// 7711 14405:aload_0         
	// 7712 14406:getfield        #12  <Field azh a>
	// 7713 14409:getfield        #346 <Field int azh.bk>
	// 7714 14412:ior             
	// 7715 14413:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7716 14416:aload_0         
	// 7717 14417:getfield        #12  <Field azh a>
	// 7718 14420:astore_1        
		abyte0.bl = ((azh) (abyte0)).bI ^ a.bl;
	// 7719 14421:aload_1         
	// 7720 14422:aload_1         
	// 7721 14423:getfield        #65  <Field int azh.bI>
	// 7722 14426:aload_0         
	// 7723 14427:getfield        #12  <Field azh a>
	// 7724 14430:getfield        #334 <Field int azh.bl>
	// 7725 14433:ixor            
	// 7726 14434:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7727 14437:aload_0         
	// 7728 14438:getfield        #12  <Field azh a>
	// 7729 14441:astore_1        
		abyte0.bl = ((azh) (abyte0)).bl | a.G;
	// 7730 14442:aload_1         
	// 7731 14443:aload_1         
	// 7732 14444:getfield        #334 <Field int azh.bl>
	// 7733 14447:aload_0         
	// 7734 14448:getfield        #12  <Field azh a>
	// 7735 14451:getfield        #176 <Field int azh.G>
	// 7736 14454:ior             
	// 7737 14455:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7738 14458:aload_0         
	// 7739 14459:getfield        #12  <Field azh a>
	// 7740 14462:astore_1        
		abyte0.bl = ((azh) (abyte0)).bk ^ a.bl;
	// 7741 14463:aload_1         
	// 7742 14464:aload_1         
	// 7743 14465:getfield        #346 <Field int azh.bk>
	// 7744 14468:aload_0         
	// 7745 14469:getfield        #12  <Field azh a>
	// 7746 14472:getfield        #334 <Field int azh.bl>
	// 7747 14475:ixor            
	// 7748 14476:putfield        #334 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7749 14479:aload_0         
	// 7750 14480:getfield        #12  <Field azh a>
	// 7751 14483:astore_1        
		abyte0.bk = ((azh) (abyte0)).O | a.bk;
	// 7752 14484:aload_1         
	// 7753 14485:aload_1         
	// 7754 14486:getfield        #241 <Field int azh.O>
	// 7755 14489:aload_0         
	// 7756 14490:getfield        #12  <Field azh a>
	// 7757 14493:getfield        #346 <Field int azh.bk>
	// 7758 14496:ior             
	// 7759 14497:putfield        #346 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7760 14500:aload_0         
	// 7761 14501:getfield        #12  <Field azh a>
	// 7762 14504:astore_1        
		abyte0.bs = ((azh) (abyte0)).bk ^ a.bs;
	// 7763 14505:aload_1         
	// 7764 14506:aload_1         
	// 7765 14507:getfield        #346 <Field int azh.bk>
	// 7766 14510:aload_0         
	// 7767 14511:getfield        #12  <Field azh a>
	// 7768 14514:getfield        #229 <Field int azh.bs>
	// 7769 14517:ixor            
	// 7770 14518:putfield        #229 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 7771 14521:aload_0         
	// 7772 14522:getfield        #12  <Field azh a>
	// 7773 14525:astore_1        
		abyte0.bd = ((azh) (abyte0)).bk ^ a.bd;
	// 7774 14526:aload_1         
	// 7775 14527:aload_1         
	// 7776 14528:getfield        #346 <Field int azh.bk>
	// 7777 14531:aload_0         
	// 7778 14532:getfield        #12  <Field azh a>
	// 7779 14535:getfield        #343 <Field int azh.bd>
	// 7780 14538:ixor            
	// 7781 14539:putfield        #343 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 7782 14542:aload_0         
	// 7783 14543:getfield        #12  <Field azh a>
	// 7784 14546:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk | a.G;
	// 7785 14547:aload_1         
	// 7786 14548:aload_1         
	// 7787 14549:getfield        #346 <Field int azh.bk>
	// 7788 14552:aload_0         
	// 7789 14553:getfield        #12  <Field azh a>
	// 7790 14556:getfield        #176 <Field int azh.G>
	// 7791 14559:ior             
	// 7792 14560:putfield        #346 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7793 14563:aload_0         
	// 7794 14564:getfield        #12  <Field azh a>
	// 7795 14567:astore_1        
		abyte0.bI = ((azh) (abyte0)).c & ~a.O;
	// 7796 14568:aload_1         
	// 7797 14569:aload_1         
	// 7798 14570:getfield        #256 <Field int azh.c>
	// 7799 14573:aload_0         
	// 7800 14574:getfield        #12  <Field azh a>
	// 7801 14577:getfield        #241 <Field int azh.O>
	// 7802 14580:iconst_m1       
	// 7803 14581:ixor            
	// 7804 14582:iand            
	// 7805 14583:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 7806 14586:aload_0         
	// 7807 14587:getfield        #12  <Field azh a>
	// 7808 14590:astore_1        
		abyte0.ar = ((azh) (abyte0)).bI & ~a.G;
	// 7809 14591:aload_1         
	// 7810 14592:aload_1         
	// 7811 14593:getfield        #65  <Field int azh.bI>
	// 7812 14596:aload_0         
	// 7813 14597:getfield        #12  <Field azh a>
	// 7814 14600:getfield        #176 <Field int azh.G>
	// 7815 14603:iconst_m1       
	// 7816 14604:ixor            
	// 7817 14605:iand            
	// 7818 14606:putfield        #328 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7819 14609:aload_0         
	// 7820 14610:getfield        #12  <Field azh a>
	// 7821 14613:astore_1        
		abyte0.ar = ((azh) (abyte0)).aK ^ a.ar;
	// 7822 14614:aload_1         
	// 7823 14615:aload_1         
	// 7824 14616:getfield        #475 <Field int azh.aK>
	// 7825 14619:aload_0         
	// 7826 14620:getfield        #12  <Field azh a>
	// 7827 14623:getfield        #328 <Field int azh.ar>
	// 7828 14626:ixor            
	// 7829 14627:putfield        #328 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7830 14630:aload_0         
	// 7831 14631:getfield        #12  <Field azh a>
	// 7832 14634:astore_1        
		abyte0.aK = ((azh) (abyte0)).y ^ a.c;
	// 7833 14635:aload_1         
	// 7834 14636:aload_1         
	// 7835 14637:getfield        #179 <Field int azh.y>
	// 7836 14640:aload_0         
	// 7837 14641:getfield        #12  <Field azh a>
	// 7838 14644:getfield        #256 <Field int azh.c>
	// 7839 14647:ixor            
	// 7840 14648:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 7841 14651:aload_0         
	// 7842 14652:getfield        #12  <Field azh a>
	// 7843 14655:astore_1        
		abyte0.as = ((azh) (abyte0)).O | a.aK;
	// 7844 14656:aload_1         
	// 7845 14657:aload_1         
	// 7846 14658:getfield        #241 <Field int azh.O>
	// 7847 14661:aload_0         
	// 7848 14662:getfield        #12  <Field azh a>
	// 7849 14665:getfield        #475 <Field int azh.aK>
	// 7850 14668:ior             
	// 7851 14669:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7852 14672:aload_0         
	// 7853 14673:getfield        #12  <Field azh a>
	// 7854 14676:astore_1        
		abyte0.as = ((azh) (abyte0)).as | a.G;
	// 7855 14677:aload_1         
	// 7856 14678:aload_1         
	// 7857 14679:getfield        #92  <Field int azh.as>
	// 7858 14682:aload_0         
	// 7859 14683:getfield        #12  <Field azh a>
	// 7860 14686:getfield        #176 <Field int azh.G>
	// 7861 14689:ior             
	// 7862 14690:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7863 14693:aload_0         
	// 7864 14694:getfield        #12  <Field azh a>
	// 7865 14697:astore_1        
		abyte0.bP = ((azh) (abyte0)).O | a.aK;
	// 7866 14698:aload_1         
	// 7867 14699:aload_1         
	// 7868 14700:getfield        #241 <Field int azh.O>
	// 7869 14703:aload_0         
	// 7870 14704:getfield        #12  <Field azh a>
	// 7871 14707:getfield        #475 <Field int azh.aK>
	// 7872 14710:ior             
	// 7873 14711:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 7874 14714:aload_0         
	// 7875 14715:getfield        #12  <Field azh a>
	// 7876 14718:astore_1        
		abyte0.bP = ((azh) (abyte0)).c ^ a.bP;
	// 7877 14719:aload_1         
	// 7878 14720:aload_1         
	// 7879 14721:getfield        #256 <Field int azh.c>
	// 7880 14724:aload_0         
	// 7881 14725:getfield        #12  <Field azh a>
	// 7882 14728:getfield        #62  <Field int azh.bP>
	// 7883 14731:ixor            
	// 7884 14732:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 7885 14735:aload_0         
	// 7886 14736:getfield        #12  <Field azh a>
	// 7887 14739:astore_1        
		abyte0.as = ((azh) (abyte0)).bP ^ a.as;
	// 7888 14740:aload_1         
	// 7889 14741:aload_1         
	// 7890 14742:getfield        #62  <Field int azh.bP>
	// 7891 14745:aload_0         
	// 7892 14746:getfield        #12  <Field azh a>
	// 7893 14749:getfield        #92  <Field int azh.as>
	// 7894 14752:ixor            
	// 7895 14753:putfield        #92  <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7896 14756:aload_0         
	// 7897 14757:getfield        #12  <Field azh a>
	// 7898 14760:astore_1        
		abyte0.n = ((azh) (abyte0)).aK ^ a.n;
	// 7899 14761:aload_1         
	// 7900 14762:aload_1         
	// 7901 14763:getfield        #475 <Field int azh.aK>
	// 7902 14766:aload_0         
	// 7903 14767:getfield        #12  <Field azh a>
	// 7904 14770:getfield        #238 <Field int azh.n>
	// 7905 14773:ixor            
	// 7906 14774:putfield        #238 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7907 14777:aload_0         
	// 7908 14778:getfield        #12  <Field azh a>
	// 7909 14781:astore_1        
		abyte0.bk = ((azh) (abyte0)).n ^ a.bk;
	// 7910 14782:aload_1         
	// 7911 14783:aload_1         
	// 7912 14784:getfield        #238 <Field int azh.n>
	// 7913 14787:aload_0         
	// 7914 14788:getfield        #12  <Field azh a>
	// 7915 14791:getfield        #346 <Field int azh.bk>
	// 7916 14794:ixor            
	// 7917 14795:putfield        #346 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7918 14798:aload_0         
	// 7919 14799:getfield        #12  <Field azh a>
	// 7920 14802:astore_1        
		abyte0.n = ((azh) (abyte0)).aK & ~a.O;
	// 7921 14803:aload_1         
	// 7922 14804:aload_1         
	// 7923 14805:getfield        #475 <Field int azh.aK>
	// 7924 14808:aload_0         
	// 7925 14809:getfield        #12  <Field azh a>
	// 7926 14812:getfield        #241 <Field int azh.O>
	// 7927 14815:iconst_m1       
	// 7928 14816:ixor            
	// 7929 14817:iand            
	// 7930 14818:putfield        #238 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7931 14821:aload_0         
	// 7932 14822:getfield        #12  <Field azh a>
	// 7933 14825:astore_1        
		abyte0.n = ((azh) (abyte0)).G & a.n;
	// 7934 14826:aload_1         
	// 7935 14827:aload_1         
	// 7936 14828:getfield        #176 <Field int azh.G>
	// 7937 14831:aload_0         
	// 7938 14832:getfield        #12  <Field azh a>
	// 7939 14835:getfield        #238 <Field int azh.n>
	// 7940 14838:iand            
	// 7941 14839:putfield        #238 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7942 14842:aload_0         
	// 7943 14843:getfield        #12  <Field azh a>
	// 7944 14846:astore_1        
		abyte0.n = ((azh) (abyte0)).bI ^ a.n;
	// 7945 14847:aload_1         
	// 7946 14848:aload_1         
	// 7947 14849:getfield        #65  <Field int azh.bI>
	// 7948 14852:aload_0         
	// 7949 14853:getfield        #12  <Field azh a>
	// 7950 14856:getfield        #238 <Field int azh.n>
	// 7951 14859:ixor            
	// 7952 14860:putfield        #238 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7953 14863:aload_0         
	// 7954 14864:getfield        #12  <Field azh a>
	// 7955 14867:astore_1        
		abyte0.ap = ((azh) (abyte0)).aK ^ a.ap;
	// 7956 14868:aload_1         
	// 7957 14869:aload_1         
	// 7958 14870:getfield        #475 <Field int azh.aK>
	// 7959 14873:aload_0         
	// 7960 14874:getfield        #12  <Field azh a>
	// 7961 14877:getfield        #226 <Field int azh.ap>
	// 7962 14880:ixor            
	// 7963 14881:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7964 14884:aload_0         
	// 7965 14885:getfield        #12  <Field azh a>
	// 7966 14888:astore_1        
		abyte0.aR = ((azh) (abyte0)).ap ^ a.aR;
	// 7967 14889:aload_1         
	// 7968 14890:aload_1         
	// 7969 14891:getfield        #226 <Field int azh.ap>
	// 7970 14894:aload_0         
	// 7971 14895:getfield        #12  <Field azh a>
	// 7972 14898:getfield        #232 <Field int azh.aR>
	// 7973 14901:ixor            
	// 7974 14902:putfield        #232 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 7975 14905:aload_0         
	// 7976 14906:getfield        #12  <Field azh a>
	// 7977 14909:astore_1        
		abyte0.aL = ((azh) (abyte0)).aK ^ a.aL;
	// 7978 14910:aload_1         
	// 7979 14911:aload_1         
	// 7980 14912:getfield        #475 <Field int azh.aK>
	// 7981 14915:aload_0         
	// 7982 14916:getfield        #12  <Field azh a>
	// 7983 14919:getfield        #110 <Field int azh.aL>
	// 7984 14922:ixor            
	// 7985 14923:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7986 14926:aload_0         
	// 7987 14927:getfield        #12  <Field azh a>
	// 7988 14930:astore_1        
		abyte0.bX = ((azh) (abyte0)).aL ^ a.bX;
	// 7989 14931:aload_1         
	// 7990 14932:aload_1         
	// 7991 14933:getfield        #110 <Field int azh.aL>
	// 7992 14936:aload_0         
	// 7993 14937:getfield        #12  <Field azh a>
	// 7994 14940:getfield        #430 <Field int azh.bX>
	// 7995 14943:ixor            
	// 7996 14944:putfield        #430 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7997 14947:aload_0         
	// 7998 14948:getfield        #12  <Field azh a>
	// 7999 14951:astore_1        
		abyte0.aK = ((azh) (abyte0)).aK ^ a.O;
	// 8000 14952:aload_1         
	// 8001 14953:aload_1         
	// 8002 14954:getfield        #475 <Field int azh.aK>
	// 8003 14957:aload_0         
	// 8004 14958:getfield        #12  <Field azh a>
	// 8005 14961:getfield        #241 <Field int azh.O>
	// 8006 14964:ixor            
	// 8007 14965:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 8008 14968:aload_0         
	// 8009 14969:getfield        #12  <Field azh a>
	// 8010 14972:astore_1        
		abyte0.bg = ((azh) (abyte0)).aK ^ a.bg;
	// 8011 14973:aload_1         
	// 8012 14974:aload_1         
	// 8013 14975:getfield        #475 <Field int azh.aK>
	// 8014 14978:aload_0         
	// 8015 14979:getfield        #12  <Field azh a>
	// 8016 14982:getfield        #143 <Field int azh.bg>
	// 8017 14985:ixor            
	// 8018 14986:putfield        #143 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8019 14989:aload_0         
	// 8020 14990:getfield        #12  <Field azh a>
	// 8021 14993:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj & ~a.L;
	// 8022 14994:aload_1         
	// 8023 14995:aload_1         
	// 8024 14996:getfield        #478 <Field int azh.bj>
	// 8025 14999:aload_0         
	// 8026 15000:getfield        #12  <Field azh a>
	// 8027 15003:getfield        #271 <Field int azh.L>
	// 8028 15006:iconst_m1       
	// 8029 15007:ixor            
	// 8030 15008:iand            
	// 8031 15009:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8032 15012:aload_0         
	// 8033 15013:getfield        #12  <Field azh a>
	// 8034 15016:astore_1        
		abyte0.bj = ((azh) (abyte0)).bD ^ a.bj;
	// 8035 15017:aload_1         
	// 8036 15018:aload_1         
	// 8037 15019:getfield        #340 <Field int azh.bD>
	// 8038 15022:aload_0         
	// 8039 15023:getfield        #12  <Field azh a>
	// 8040 15026:getfield        #478 <Field int azh.bj>
	// 8041 15029:ixor            
	// 8042 15030:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8043 15033:aload_0         
	// 8044 15034:getfield        #12  <Field azh a>
	// 8045 15037:astore_1        
		abyte0.bA = ((azh) (abyte0)).bj & ~a.bA;
	// 8046 15038:aload_1         
	// 8047 15039:aload_1         
	// 8048 15040:getfield        #478 <Field int azh.bj>
	// 8049 15043:aload_0         
	// 8050 15044:getfield        #12  <Field azh a>
	// 8051 15047:getfield        #289 <Field int azh.bA>
	// 8052 15050:iconst_m1       
	// 8053 15051:ixor            
	// 8054 15052:iand            
	// 8055 15053:putfield        #289 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8056 15056:aload_0         
	// 8057 15057:getfield        #12  <Field azh a>
	// 8058 15060:astore_1        
		abyte0.bA = ((azh) (abyte0)).bK ^ a.bA;
	// 8059 15061:aload_1         
	// 8060 15062:aload_1         
	// 8061 15063:getfield        #292 <Field int azh.bK>
	// 8062 15066:aload_0         
	// 8063 15067:getfield        #12  <Field azh a>
	// 8064 15070:getfield        #289 <Field int azh.bA>
	// 8065 15073:ixor            
	// 8066 15074:putfield        #289 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8067 15077:aload_0         
	// 8068 15078:getfield        #12  <Field azh a>
	// 8069 15081:astore_1        
		abyte0.bK = ((azh) (abyte0)).ah & a.bA;
	// 8070 15082:aload_1         
	// 8071 15083:aload_1         
	// 8072 15084:getfield        #364 <Field int azh.ah>
	// 8073 15087:aload_0         
	// 8074 15088:getfield        #12  <Field azh a>
	// 8075 15091:getfield        #289 <Field int azh.bA>
	// 8076 15094:iand            
	// 8077 15095:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8078 15098:aload_0         
	// 8079 15099:getfield        #12  <Field azh a>
	// 8080 15102:astore_1        
		abyte0.bK = ((azh) (abyte0)).s ^ a.bK;
	// 8081 15103:aload_1         
	// 8082 15104:aload_1         
	// 8083 15105:getfield        #277 <Field int azh.s>
	// 8084 15108:aload_0         
	// 8085 15109:getfield        #12  <Field azh a>
	// 8086 15112:getfield        #292 <Field int azh.bK>
	// 8087 15115:ixor            
	// 8088 15116:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8089 15119:aload_0         
	// 8090 15120:getfield        #12  <Field azh a>
	// 8091 15123:astore_1        
		abyte0.I = ((azh) (abyte0)).bK ^ a.I;
	// 8092 15124:aload_1         
	// 8093 15125:aload_1         
	// 8094 15126:getfield        #292 <Field int azh.bK>
	// 8095 15129:aload_0         
	// 8096 15130:getfield        #12  <Field azh a>
	// 8097 15133:getfield        #480 <Field int azh.I>
	// 8098 15136:ixor            
	// 8099 15137:putfield        #480 <Field int azh.I>
		abyte0 = ((byte []) (a));
	// 8100 15140:aload_0         
	// 8101 15141:getfield        #12  <Field azh a>
	// 8102 15144:astore_1        
		abyte0.aZ = ((azh) (abyte0)).I | a.aZ;
	// 8103 15145:aload_1         
	// 8104 15146:aload_1         
	// 8105 15147:getfield        #480 <Field int azh.I>
	// 8106 15150:aload_0         
	// 8107 15151:getfield        #12  <Field azh a>
	// 8108 15154:getfield        #445 <Field int azh.aZ>
	// 8109 15157:ior             
	// 8110 15158:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8111 15161:aload_0         
	// 8112 15162:getfield        #12  <Field azh a>
	// 8113 15165:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aH ^ a.aZ;
	// 8114 15166:aload_1         
	// 8115 15167:aload_1         
	// 8116 15168:getfield        #95  <Field int azh.aH>
	// 8117 15171:aload_0         
	// 8118 15172:getfield        #12  <Field azh a>
	// 8119 15175:getfield        #445 <Field int azh.aZ>
	// 8120 15178:ixor            
	// 8121 15179:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8122 15182:aload_0         
	// 8123 15183:getfield        #12  <Field azh a>
	// 8124 15186:astore_1        
		abyte0.bC = ((azh) (abyte0)).bC & ~a.I;
	// 8125 15187:aload_1         
	// 8126 15188:aload_1         
	// 8127 15189:getfield        #134 <Field int azh.bC>
	// 8128 15192:aload_0         
	// 8129 15193:getfield        #12  <Field azh a>
	// 8130 15196:getfield        #480 <Field int azh.I>
	// 8131 15199:iconst_m1       
	// 8132 15200:ixor            
	// 8133 15201:iand            
	// 8134 15202:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 8135 15205:aload_0         
	// 8136 15206:getfield        #12  <Field azh a>
	// 8137 15209:astore_1        
		abyte0.bC = ((azh) (abyte0)).bx ^ a.bC;
	// 8138 15210:aload_1         
	// 8139 15211:aload_1         
	// 8140 15212:getfield        #418 <Field int azh.bx>
	// 8141 15215:aload_0         
	// 8142 15216:getfield        #12  <Field azh a>
	// 8143 15219:getfield        #134 <Field int azh.bC>
	// 8144 15222:ixor            
	// 8145 15223:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 8146 15226:aload_0         
	// 8147 15227:getfield        #12  <Field azh a>
	// 8148 15230:astore_1        
		abyte0.bC = ((azh) (abyte0)).Y & ~a.bC;
	// 8149 15231:aload_1         
	// 8150 15232:aload_1         
	// 8151 15233:getfield        #483 <Field int azh.Y>
	// 8152 15236:aload_0         
	// 8153 15237:getfield        #12  <Field azh a>
	// 8154 15240:getfield        #134 <Field int azh.bC>
	// 8155 15243:iconst_m1       
	// 8156 15244:ixor            
	// 8157 15245:iand            
	// 8158 15246:putfield        #134 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 8159 15249:aload_0         
	// 8160 15250:getfield        #12  <Field azh a>
	// 8161 15253:astore_1        
		abyte0.bx = ((azh) (abyte0)).A & a.I;
	// 8162 15254:aload_1         
	// 8163 15255:aload_1         
	// 8164 15256:getfield        #80  <Field int azh.A>
	// 8165 15259:aload_0         
	// 8166 15260:getfield        #12  <Field azh a>
	// 8167 15263:getfield        #480 <Field int azh.I>
	// 8168 15266:iand            
	// 8169 15267:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8170 15270:aload_0         
	// 8171 15271:getfield        #12  <Field azh a>
	// 8172 15274:astore_1        
		abyte0.aH = ((azh) (abyte0)).bx & ~a.k;
	// 8173 15275:aload_1         
	// 8174 15276:aload_1         
	// 8175 15277:getfield        #418 <Field int azh.bx>
	// 8176 15280:aload_0         
	// 8177 15281:getfield        #12  <Field azh a>
	// 8178 15284:getfield        #164 <Field int azh.k>
	// 8179 15287:iconst_m1       
	// 8180 15288:ixor            
	// 8181 15289:iand            
	// 8182 15290:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8183 15293:aload_0         
	// 8184 15294:getfield        #12  <Field azh a>
	// 8185 15297:astore_1        
		abyte0.bK = ((azh) (abyte0)).I | a.c;
	// 8186 15298:aload_1         
	// 8187 15299:aload_1         
	// 8188 15300:getfield        #480 <Field int azh.I>
	// 8189 15303:aload_0         
	// 8190 15304:getfield        #12  <Field azh a>
	// 8191 15307:getfield        #256 <Field int azh.c>
	// 8192 15310:ior             
	// 8193 15311:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8194 15314:aload_0         
	// 8195 15315:getfield        #12  <Field azh a>
	// 8196 15318:astore_1        
		abyte0.bj = ((azh) (abyte0)).bK | a.k;
	// 8197 15319:aload_1         
	// 8198 15320:aload_1         
	// 8199 15321:getfield        #292 <Field int azh.bK>
	// 8200 15324:aload_0         
	// 8201 15325:getfield        #12  <Field azh a>
	// 8202 15328:getfield        #164 <Field int azh.k>
	// 8203 15331:ior             
	// 8204 15332:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8205 15335:aload_0         
	// 8206 15336:getfield        #12  <Field azh a>
	// 8207 15339:astore_1        
		abyte0.bD = ((azh) (abyte0)).bK & ~a.c;
	// 8208 15340:aload_1         
	// 8209 15341:aload_1         
	// 8210 15342:getfield        #292 <Field int azh.bK>
	// 8211 15345:aload_0         
	// 8212 15346:getfield        #12  <Field azh a>
	// 8213 15349:getfield        #256 <Field int azh.c>
	// 8214 15352:iconst_m1       
	// 8215 15353:ixor            
	// 8216 15354:iand            
	// 8217 15355:putfield        #340 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 8218 15358:aload_0         
	// 8219 15359:getfield        #12  <Field azh a>
	// 8220 15362:astore_1        
		abyte0.aK = ((azh) (abyte0)).A & ~a.bD;
	// 8221 15363:aload_1         
	// 8222 15364:aload_1         
	// 8223 15365:getfield        #80  <Field int azh.A>
	// 8224 15368:aload_0         
	// 8225 15369:getfield        #12  <Field azh a>
	// 8226 15372:getfield        #340 <Field int azh.bD>
	// 8227 15375:iconst_m1       
	// 8228 15376:ixor            
	// 8229 15377:iand            
	// 8230 15378:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 8231 15381:aload_0         
	// 8232 15382:getfield        #12  <Field azh a>
	// 8233 15385:astore_1        
		abyte0.aL = ((azh) (abyte0)).A & ~a.bD;
	// 8234 15386:aload_1         
	// 8235 15387:aload_1         
	// 8236 15388:getfield        #80  <Field int azh.A>
	// 8237 15391:aload_0         
	// 8238 15392:getfield        #12  <Field azh a>
	// 8239 15395:getfield        #340 <Field int azh.bD>
	// 8240 15398:iconst_m1       
	// 8241 15399:ixor            
	// 8242 15400:iand            
	// 8243 15401:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8244 15404:aload_0         
	// 8245 15405:getfield        #12  <Field azh a>
	// 8246 15408:astore_1        
		abyte0.bD = ((azh) (abyte0)).A & ~a.bD;
	// 8247 15409:aload_1         
	// 8248 15410:aload_1         
	// 8249 15411:getfield        #80  <Field int azh.A>
	// 8250 15414:aload_0         
	// 8251 15415:getfield        #12  <Field azh a>
	// 8252 15418:getfield        #340 <Field int azh.bD>
	// 8253 15421:iconst_m1       
	// 8254 15422:ixor            
	// 8255 15423:iand            
	// 8256 15424:putfield        #340 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 8257 15427:aload_0         
	// 8258 15428:getfield        #12  <Field azh a>
	// 8259 15431:astore_1        
		abyte0.bD = ((azh) (abyte0)).c ^ a.bD;
	// 8260 15432:aload_1         
	// 8261 15433:aload_1         
	// 8262 15434:getfield        #256 <Field int azh.c>
	// 8263 15437:aload_0         
	// 8264 15438:getfield        #12  <Field azh a>
	// 8265 15441:getfield        #340 <Field int azh.bD>
	// 8266 15444:ixor            
	// 8267 15445:putfield        #340 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 8268 15448:aload_0         
	// 8269 15449:getfield        #12  <Field azh a>
	// 8270 15452:astore_1        
		abyte0.bD = ((azh) (abyte0)).bD & ~a.k;
	// 8271 15453:aload_1         
	// 8272 15454:aload_1         
	// 8273 15455:getfield        #340 <Field int azh.bD>
	// 8274 15458:aload_0         
	// 8275 15459:getfield        #12  <Field azh a>
	// 8276 15462:getfield        #164 <Field int azh.k>
	// 8277 15465:iconst_m1       
	// 8278 15466:ixor            
	// 8279 15467:iand            
	// 8280 15468:putfield        #340 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 8281 15471:aload_0         
	// 8282 15472:getfield        #12  <Field azh a>
	// 8283 15475:astore_1        
		abyte0.ap = ((azh) (abyte0)).A & ~a.bK;
	// 8284 15476:aload_1         
	// 8285 15477:aload_1         
	// 8286 15478:getfield        #80  <Field int azh.A>
	// 8287 15481:aload_0         
	// 8288 15482:getfield        #12  <Field azh a>
	// 8289 15485:getfield        #292 <Field int azh.bK>
	// 8290 15488:iconst_m1       
	// 8291 15489:ixor            
	// 8292 15490:iand            
	// 8293 15491:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 8294 15494:aload_0         
	// 8295 15495:getfield        #12  <Field azh a>
	// 8296 15498:astore_1        
		abyte0.ap = ((azh) (abyte0)).k | a.ap;
	// 8297 15499:aload_1         
	// 8298 15500:aload_1         
	// 8299 15501:getfield        #164 <Field int azh.k>
	// 8300 15504:aload_0         
	// 8301 15505:getfield        #12  <Field azh a>
	// 8302 15508:getfield        #226 <Field int azh.ap>
	// 8303 15511:ior             
	// 8304 15512:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 8305 15515:aload_0         
	// 8306 15516:getfield        #12  <Field azh a>
	// 8307 15519:astore_1        
		abyte0.bI = ((azh) (abyte0)).c & a.I;
	// 8308 15520:aload_1         
	// 8309 15521:aload_1         
	// 8310 15522:getfield        #256 <Field int azh.c>
	// 8311 15525:aload_0         
	// 8312 15526:getfield        #12  <Field azh a>
	// 8313 15529:getfield        #480 <Field int azh.I>
	// 8314 15532:iand            
	// 8315 15533:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8316 15536:aload_0         
	// 8317 15537:getfield        #12  <Field azh a>
	// 8318 15540:astore_1        
		abyte0.aL = ((azh) (abyte0)).bI ^ a.aL;
	// 8319 15541:aload_1         
	// 8320 15542:aload_1         
	// 8321 15543:getfield        #65  <Field int azh.bI>
	// 8322 15546:aload_0         
	// 8323 15547:getfield        #12  <Field azh a>
	// 8324 15550:getfield        #110 <Field int azh.aL>
	// 8325 15553:ixor            
	// 8326 15554:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8327 15557:aload_0         
	// 8328 15558:getfield        #12  <Field azh a>
	// 8329 15561:astore_1        
		abyte0.bP = ((azh) (abyte0)).aL & ~a.k;
	// 8330 15562:aload_1         
	// 8331 15563:aload_1         
	// 8332 15564:getfield        #110 <Field int azh.aL>
	// 8333 15567:aload_0         
	// 8334 15568:getfield        #12  <Field azh a>
	// 8335 15571:getfield        #164 <Field int azh.k>
	// 8336 15574:iconst_m1       
	// 8337 15575:ixor            
	// 8338 15576:iand            
	// 8339 15577:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8340 15580:aload_0         
	// 8341 15581:getfield        #12  <Field azh a>
	// 8342 15584:astore_1        
		abyte0.cb = ((azh) (abyte0)).c & ~a.bI;
	// 8343 15585:aload_1         
	// 8344 15586:aload_1         
	// 8345 15587:getfield        #256 <Field int azh.c>
	// 8346 15590:aload_0         
	// 8347 15591:getfield        #12  <Field azh a>
	// 8348 15594:getfield        #65  <Field int azh.bI>
	// 8349 15597:iconst_m1       
	// 8350 15598:ixor            
	// 8351 15599:iand            
	// 8352 15600:putfield        #158 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8353 15603:aload_0         
	// 8354 15604:getfield        #12  <Field azh a>
	// 8355 15607:astore_1        
		abyte0.at = ((azh) (abyte0)).A & a.bI;
	// 8356 15608:aload_1         
	// 8357 15609:aload_1         
	// 8358 15610:getfield        #80  <Field int azh.A>
	// 8359 15613:aload_0         
	// 8360 15614:getfield        #12  <Field azh a>
	// 8361 15617:getfield        #65  <Field int azh.bI>
	// 8362 15620:iand            
	// 8363 15621:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 8364 15624:aload_0         
	// 8365 15625:getfield        #12  <Field azh a>
	// 8366 15628:astore_1        
		abyte0.at = ((azh) (abyte0)).bI ^ a.at;
	// 8367 15629:aload_1         
	// 8368 15630:aload_1         
	// 8369 15631:getfield        #65  <Field int azh.bI>
	// 8370 15634:aload_0         
	// 8371 15635:getfield        #12  <Field azh a>
	// 8372 15638:getfield        #322 <Field int azh.at>
	// 8373 15641:ixor            
	// 8374 15642:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 8375 15645:aload_0         
	// 8376 15646:getfield        #12  <Field azh a>
	// 8377 15649:astore_1        
		abyte0.bj = ((azh) (abyte0)).at ^ a.bj;
	// 8378 15650:aload_1         
	// 8379 15651:aload_1         
	// 8380 15652:getfield        #322 <Field int azh.at>
	// 8381 15655:aload_0         
	// 8382 15656:getfield        #12  <Field azh a>
	// 8383 15659:getfield        #478 <Field int azh.bj>
	// 8384 15662:ixor            
	// 8385 15663:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8386 15666:aload_0         
	// 8387 15667:getfield        #12  <Field azh a>
	// 8388 15670:astore_1        
		abyte0.bW = ((azh) (abyte0)).bW & ~a.I;
	// 8389 15671:aload_1         
	// 8390 15672:aload_1         
	// 8391 15673:getfield        #394 <Field int azh.bW>
	// 8392 15676:aload_0         
	// 8393 15677:getfield        #12  <Field azh a>
	// 8394 15680:getfield        #480 <Field int azh.I>
	// 8395 15683:iconst_m1       
	// 8396 15684:ixor            
	// 8397 15685:iand            
	// 8398 15686:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 8399 15689:aload_0         
	// 8400 15690:getfield        #12  <Field azh a>
	// 8401 15693:astore_1        
		abyte0.bW = ((azh) (abyte0)).aD ^ a.bW;
	// 8402 15694:aload_1         
	// 8403 15695:aload_1         
	// 8404 15696:getfield        #202 <Field int azh.aD>
	// 8405 15699:aload_0         
	// 8406 15700:getfield        #12  <Field azh a>
	// 8407 15703:getfield        #394 <Field int azh.bW>
	// 8408 15706:ixor            
	// 8409 15707:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 8410 15710:aload_0         
	// 8411 15711:getfield        #12  <Field azh a>
	// 8412 15714:astore_1        
		abyte0.bW = ((azh) (abyte0)).Y & ~a.bW;
	// 8413 15715:aload_1         
	// 8414 15716:aload_1         
	// 8415 15717:getfield        #483 <Field int azh.Y>
	// 8416 15720:aload_0         
	// 8417 15721:getfield        #12  <Field azh a>
	// 8418 15724:getfield        #394 <Field int azh.bW>
	// 8419 15727:iconst_m1       
	// 8420 15728:ixor            
	// 8421 15729:iand            
	// 8422 15730:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 8423 15733:aload_0         
	// 8424 15734:getfield        #12  <Field azh a>
	// 8425 15737:astore_1        
		abyte0.bW = ((azh) (abyte0)).aZ ^ a.bW;
	// 8426 15738:aload_1         
	// 8427 15739:aload_1         
	// 8428 15740:getfield        #445 <Field int azh.aZ>
	// 8429 15743:aload_0         
	// 8430 15744:getfield        #12  <Field azh a>
	// 8431 15747:getfield        #394 <Field int azh.bW>
	// 8432 15750:ixor            
	// 8433 15751:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 8434 15754:aload_0         
	// 8435 15755:getfield        #12  <Field azh a>
	// 8436 15758:astore_1        
		abyte0.V = ((azh) (abyte0)).bW ^ a.V;
	// 8437 15759:aload_1         
	// 8438 15760:aload_1         
	// 8439 15761:getfield        #394 <Field int azh.bW>
	// 8440 15764:aload_0         
	// 8441 15765:getfield        #12  <Field azh a>
	// 8442 15768:getfield        #68  <Field int azh.V>
	// 8443 15771:ixor            
	// 8444 15772:putfield        #68  <Field int azh.V>
		abyte0 = ((byte []) (a));
	// 8445 15775:aload_0         
	// 8446 15776:getfield        #12  <Field azh a>
	// 8447 15779:astore_1        
		abyte0.bW = ((azh) (abyte0)).V & a.an;
	// 8448 15780:aload_1         
	// 8449 15781:aload_1         
	// 8450 15782:getfield        #68  <Field int azh.V>
	// 8451 15785:aload_0         
	// 8452 15786:getfield        #12  <Field azh a>
	// 8453 15789:getfield        #286 <Field int azh.an>
	// 8454 15792:iand            
	// 8455 15793:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 8456 15796:aload_0         
	// 8457 15797:getfield        #12  <Field azh a>
	// 8458 15800:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.I;
	// 8459 15801:aload_1         
	// 8460 15802:aload_1         
	// 8461 15803:getfield        #433 <Field int azh.aX>
	// 8462 15806:aload_0         
	// 8463 15807:getfield        #12  <Field azh a>
	// 8464 15810:getfield        #480 <Field int azh.I>
	// 8465 15813:iconst_m1       
	// 8466 15814:ixor            
	// 8467 15815:iand            
	// 8468 15816:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8469 15819:aload_0         
	// 8470 15820:getfield        #12  <Field azh a>
	// 8471 15823:astore_1        
		abyte0.aX = ((azh) (abyte0)).bH ^ a.aX;
	// 8472 15824:aload_1         
	// 8473 15825:aload_1         
	// 8474 15826:getfield        #439 <Field int azh.bH>
	// 8475 15829:aload_0         
	// 8476 15830:getfield        #12  <Field azh a>
	// 8477 15833:getfield        #433 <Field int azh.aX>
	// 8478 15836:ixor            
	// 8479 15837:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8480 15840:aload_0         
	// 8481 15841:getfield        #12  <Field azh a>
	// 8482 15844:astore_1        
		abyte0.aX = ((azh) (abyte0)).Y & ~a.aX;
	// 8483 15845:aload_1         
	// 8484 15846:aload_1         
	// 8485 15847:getfield        #483 <Field int azh.Y>
	// 8486 15850:aload_0         
	// 8487 15851:getfield        #12  <Field azh a>
	// 8488 15854:getfield        #433 <Field int azh.aX>
	// 8489 15857:iconst_m1       
	// 8490 15858:ixor            
	// 8491 15859:iand            
	// 8492 15860:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8493 15863:aload_0         
	// 8494 15864:getfield        #12  <Field azh a>
	// 8495 15867:astore_1        
		abyte0.bH = ((azh) (abyte0)).I & ~a.c;
	// 8496 15868:aload_1         
	// 8497 15869:aload_1         
	// 8498 15870:getfield        #480 <Field int azh.I>
	// 8499 15873:aload_0         
	// 8500 15874:getfield        #12  <Field azh a>
	// 8501 15877:getfield        #256 <Field int azh.c>
	// 8502 15880:iconst_m1       
	// 8503 15881:ixor            
	// 8504 15882:iand            
	// 8505 15883:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8506 15886:aload_0         
	// 8507 15887:getfield        #12  <Field azh a>
	// 8508 15890:astore_1        
		abyte0.aZ = ((azh) (abyte0)).A & a.bH;
	// 8509 15891:aload_1         
	// 8510 15892:aload_1         
	// 8511 15893:getfield        #80  <Field int azh.A>
	// 8512 15896:aload_0         
	// 8513 15897:getfield        #12  <Field azh a>
	// 8514 15900:getfield        #439 <Field int azh.bH>
	// 8515 15903:iand            
	// 8516 15904:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8517 15907:aload_0         
	// 8518 15908:getfield        #12  <Field azh a>
	// 8519 15911:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bI ^ a.aZ;
	// 8520 15912:aload_1         
	// 8521 15913:aload_1         
	// 8522 15914:getfield        #65  <Field int azh.bI>
	// 8523 15917:aload_0         
	// 8524 15918:getfield        #12  <Field azh a>
	// 8525 15921:getfield        #445 <Field int azh.aZ>
	// 8526 15924:ixor            
	// 8527 15925:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8528 15928:aload_0         
	// 8529 15929:getfield        #12  <Field azh a>
	// 8530 15932:astore_1        
		abyte0.aH = ((azh) (abyte0)).aZ ^ a.aH;
	// 8531 15933:aload_1         
	// 8532 15934:aload_1         
	// 8533 15935:getfield        #445 <Field int azh.aZ>
	// 8534 15938:aload_0         
	// 8535 15939:getfield        #12  <Field azh a>
	// 8536 15942:getfield        #95  <Field int azh.aH>
	// 8537 15945:ixor            
	// 8538 15946:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8539 15949:aload_0         
	// 8540 15950:getfield        #12  <Field azh a>
	// 8541 15953:astore_1        
		abyte0.aH = ((azh) (abyte0)).aI & a.aH;
	// 8542 15954:aload_1         
	// 8543 15955:aload_1         
	// 8544 15956:getfield        #486 <Field int azh.aI>
	// 8545 15959:aload_0         
	// 8546 15960:getfield        #12  <Field azh a>
	// 8547 15963:getfield        #95  <Field int azh.aH>
	// 8548 15966:iand            
	// 8549 15967:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8550 15970:aload_0         
	// 8551 15971:getfield        #12  <Field azh a>
	// 8552 15974:astore_1        
		abyte0.aH = ((azh) (abyte0)).bj ^ a.aH;
	// 8553 15975:aload_1         
	// 8554 15976:aload_1         
	// 8555 15977:getfield        #478 <Field int azh.bj>
	// 8556 15980:aload_0         
	// 8557 15981:getfield        #12  <Field azh a>
	// 8558 15984:getfield        #95  <Field int azh.aH>
	// 8559 15987:ixor            
	// 8560 15988:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8561 15991:aload_0         
	// 8562 15992:getfield        #12  <Field azh a>
	// 8563 15995:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & ~a.bb;
	// 8564 15996:aload_1         
	// 8565 15997:aload_1         
	// 8566 15998:getfield        #95  <Field int azh.aH>
	// 8567 16001:aload_0         
	// 8568 16002:getfield        #12  <Field azh a>
	// 8569 16005:getfield        #489 <Field int azh.bb>
	// 8570 16008:iconst_m1       
	// 8571 16009:ixor            
	// 8572 16010:iand            
	// 8573 16011:putfield        #95  <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8574 16014:aload_0         
	// 8575 16015:getfield        #12  <Field azh a>
	// 8576 16018:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aI & a.aZ;
	// 8577 16019:aload_1         
	// 8578 16020:aload_1         
	// 8579 16021:getfield        #486 <Field int azh.aI>
	// 8580 16024:aload_0         
	// 8581 16025:getfield        #12  <Field azh a>
	// 8582 16028:getfield        #445 <Field int azh.aZ>
	// 8583 16031:iand            
	// 8584 16032:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8585 16035:aload_0         
	// 8586 16036:getfield        #12  <Field azh a>
	// 8587 16039:astore_1        
		abyte0.bj = ((azh) (abyte0)).A & a.bH;
	// 8588 16040:aload_1         
	// 8589 16041:aload_1         
	// 8590 16042:getfield        #80  <Field int azh.A>
	// 8591 16045:aload_0         
	// 8592 16046:getfield        #12  <Field azh a>
	// 8593 16049:getfield        #439 <Field int azh.bH>
	// 8594 16052:iand            
	// 8595 16053:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8596 16056:aload_0         
	// 8597 16057:getfield        #12  <Field azh a>
	// 8598 16060:astore_1        
		abyte0.bj = ((azh) (abyte0)).bK ^ a.bj;
	// 8599 16061:aload_1         
	// 8600 16062:aload_1         
	// 8601 16063:getfield        #292 <Field int azh.bK>
	// 8602 16066:aload_0         
	// 8603 16067:getfield        #12  <Field azh a>
	// 8604 16070:getfield        #478 <Field int azh.bj>
	// 8605 16073:ixor            
	// 8606 16074:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8607 16077:aload_0         
	// 8608 16078:getfield        #12  <Field azh a>
	// 8609 16081:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj | a.k;
	// 8610 16082:aload_1         
	// 8611 16083:aload_1         
	// 8612 16084:getfield        #478 <Field int azh.bj>
	// 8613 16087:aload_0         
	// 8614 16088:getfield        #12  <Field azh a>
	// 8615 16091:getfield        #164 <Field int azh.k>
	// 8616 16094:ior             
	// 8617 16095:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8618 16098:aload_0         
	// 8619 16099:getfield        #12  <Field azh a>
	// 8620 16102:astore_1        
		abyte0.bj = ((azh) (abyte0)).aw ^ a.bj;
	// 8621 16103:aload_1         
	// 8622 16104:aload_1         
	// 8623 16105:getfield        #304 <Field int azh.aw>
	// 8624 16108:aload_0         
	// 8625 16109:getfield        #12  <Field azh a>
	// 8626 16112:getfield        #478 <Field int azh.bj>
	// 8627 16115:ixor            
	// 8628 16116:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8629 16119:aload_0         
	// 8630 16120:getfield        #12  <Field azh a>
	// 8631 16123:astore_1        
		abyte0.bj = ((azh) (abyte0)).aI & ~a.bj;
	// 8632 16124:aload_1         
	// 8633 16125:aload_1         
	// 8634 16126:getfield        #486 <Field int azh.aI>
	// 8635 16129:aload_0         
	// 8636 16130:getfield        #12  <Field azh a>
	// 8637 16133:getfield        #478 <Field int azh.bj>
	// 8638 16136:iconst_m1       
	// 8639 16137:ixor            
	// 8640 16138:iand            
	// 8641 16139:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8642 16142:aload_0         
	// 8643 16143:getfield        #12  <Field azh a>
	// 8644 16146:astore_1        
		abyte0.aS = ((azh) (abyte0)).I | a.aS;
	// 8645 16147:aload_1         
	// 8646 16148:aload_1         
	// 8647 16149:getfield        #480 <Field int azh.I>
	// 8648 16152:aload_0         
	// 8649 16153:getfield        #12  <Field azh a>
	// 8650 16156:getfield        #214 <Field int azh.aS>
	// 8651 16159:ior             
	// 8652 16160:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 8653 16163:aload_0         
	// 8654 16164:getfield        #12  <Field azh a>
	// 8655 16167:astore_1        
		abyte0.aS = ((azh) (abyte0)).bq ^ a.aS;
	// 8656 16168:aload_1         
	// 8657 16169:aload_1         
	// 8658 16170:getfield        #26  <Field int azh.bq>
	// 8659 16173:aload_0         
	// 8660 16174:getfield        #12  <Field azh a>
	// 8661 16177:getfield        #214 <Field int azh.aS>
	// 8662 16180:ixor            
	// 8663 16181:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 8664 16184:aload_0         
	// 8665 16185:getfield        #12  <Field azh a>
	// 8666 16188:astore_1        
		abyte0.aX = ((azh) (abyte0)).aS ^ a.aX;
	// 8667 16189:aload_1         
	// 8668 16190:aload_1         
	// 8669 16191:getfield        #214 <Field int azh.aS>
	// 8670 16194:aload_0         
	// 8671 16195:getfield        #12  <Field azh a>
	// 8672 16198:getfield        #433 <Field int azh.aX>
	// 8673 16201:ixor            
	// 8674 16202:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8675 16205:aload_0         
	// 8676 16206:getfield        #12  <Field azh a>
	// 8677 16209:astore_1        
		abyte0.v = ((azh) (abyte0)).aX ^ a.v;
	// 8678 16210:aload_1         
	// 8679 16211:aload_1         
	// 8680 16212:getfield        #433 <Field int azh.aX>
	// 8681 16215:aload_0         
	// 8682 16216:getfield        #12  <Field azh a>
	// 8683 16219:getfield        #492 <Field int azh.v>
	// 8684 16222:ixor            
	// 8685 16223:putfield        #492 <Field int azh.v>
		abyte0 = ((byte []) (a));
	// 8686 16226:aload_0         
	// 8687 16227:getfield        #12  <Field azh a>
	// 8688 16230:astore_1        
		abyte0.aX = ((azh) (abyte0)).f ^ a.v;
	// 8689 16231:aload_1         
	// 8690 16232:aload_1         
	// 8691 16233:getfield        #412 <Field int azh.f>
	// 8692 16236:aload_0         
	// 8693 16237:getfield        #12  <Field azh a>
	// 8694 16240:getfield        #492 <Field int azh.v>
	// 8695 16243:ixor            
	// 8696 16244:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8697 16247:aload_0         
	// 8698 16248:getfield        #12  <Field azh a>
	// 8699 16251:astore_1        
		abyte0.aS = ((azh) (abyte0)).D & ~a.aX;
	// 8700 16252:aload_1         
	// 8701 16253:aload_1         
	// 8702 16254:getfield        #352 <Field int azh.D>
	// 8703 16257:aload_0         
	// 8704 16258:getfield        #12  <Field azh a>
	// 8705 16261:getfield        #433 <Field int azh.aX>
	// 8706 16264:iconst_m1       
	// 8707 16265:ixor            
	// 8708 16266:iand            
	// 8709 16267:putfield        #214 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 8710 16270:aload_0         
	// 8711 16271:getfield        #12  <Field azh a>
	// 8712 16274:astore_1        
		abyte0.aX = ((azh) (abyte0)).D & ~a.aX;
	// 8713 16275:aload_1         
	// 8714 16276:aload_1         
	// 8715 16277:getfield        #352 <Field int azh.D>
	// 8716 16280:aload_0         
	// 8717 16281:getfield        #12  <Field azh a>
	// 8718 16284:getfield        #433 <Field int azh.aX>
	// 8719 16287:iconst_m1       
	// 8720 16288:ixor            
	// 8721 16289:iand            
	// 8722 16290:putfield        #433 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8723 16293:aload_0         
	// 8724 16294:getfield        #12  <Field azh a>
	// 8725 16297:astore_1        
		abyte0.bq = ((azh) (abyte0)).v & ~a.f;
	// 8726 16298:aload_1         
	// 8727 16299:aload_1         
	// 8728 16300:getfield        #492 <Field int azh.v>
	// 8729 16303:aload_0         
	// 8730 16304:getfield        #12  <Field azh a>
	// 8731 16307:getfield        #412 <Field int azh.f>
	// 8732 16310:iconst_m1       
	// 8733 16311:ixor            
	// 8734 16312:iand            
	// 8735 16313:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8736 16316:aload_0         
	// 8737 16317:getfield        #12  <Field azh a>
	// 8738 16320:astore_1        
		abyte0.bq = ((azh) (abyte0)).f ^ a.bq;
	// 8739 16321:aload_1         
	// 8740 16322:aload_1         
	// 8741 16323:getfield        #412 <Field int azh.f>
	// 8742 16326:aload_0         
	// 8743 16327:getfield        #12  <Field azh a>
	// 8744 16330:getfield        #26  <Field int azh.bq>
	// 8745 16333:ixor            
	// 8746 16334:putfield        #26  <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8747 16337:aload_0         
	// 8748 16338:getfield        #12  <Field azh a>
	// 8749 16341:astore_1        
		abyte0.aw = ((azh) (abyte0)).A & ~a.I;
	// 8750 16342:aload_1         
	// 8751 16343:aload_1         
	// 8752 16344:getfield        #80  <Field int azh.A>
	// 8753 16347:aload_0         
	// 8754 16348:getfield        #12  <Field azh a>
	// 8755 16351:getfield        #480 <Field int azh.I>
	// 8756 16354:iconst_m1       
	// 8757 16355:ixor            
	// 8758 16356:iand            
	// 8759 16357:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8760 16360:aload_0         
	// 8761 16361:getfield        #12  <Field azh a>
	// 8762 16364:astore_1        
		abyte0.aw = ((azh) (abyte0)).bI ^ a.aw;
	// 8763 16365:aload_1         
	// 8764 16366:aload_1         
	// 8765 16367:getfield        #65  <Field int azh.bI>
	// 8766 16370:aload_0         
	// 8767 16371:getfield        #12  <Field azh a>
	// 8768 16374:getfield        #304 <Field int azh.aw>
	// 8769 16377:ixor            
	// 8770 16378:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8771 16381:aload_0         
	// 8772 16382:getfield        #12  <Field azh a>
	// 8773 16385:astore_1        
		abyte0.bP = ((azh) (abyte0)).aw ^ a.bP;
	// 8774 16386:aload_1         
	// 8775 16387:aload_1         
	// 8776 16388:getfield        #304 <Field int azh.aw>
	// 8777 16391:aload_0         
	// 8778 16392:getfield        #12  <Field azh a>
	// 8779 16395:getfield        #62  <Field int azh.bP>
	// 8780 16398:ixor            
	// 8781 16399:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8782 16402:aload_0         
	// 8783 16403:getfield        #12  <Field azh a>
	// 8784 16406:astore_1        
		abyte0.bP = ((azh) (abyte0)).aI & ~a.bP;
	// 8785 16407:aload_1         
	// 8786 16408:aload_1         
	// 8787 16409:getfield        #486 <Field int azh.aI>
	// 8788 16412:aload_0         
	// 8789 16413:getfield        #12  <Field azh a>
	// 8790 16416:getfield        #62  <Field int azh.bP>
	// 8791 16419:iconst_m1       
	// 8792 16420:ixor            
	// 8793 16421:iand            
	// 8794 16422:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8795 16425:aload_0         
	// 8796 16426:getfield        #12  <Field azh a>
	// 8797 16429:astore_1        
		abyte0.aw = ((azh) (abyte0)).A & ~a.I;
	// 8798 16430:aload_1         
	// 8799 16431:aload_1         
	// 8800 16432:getfield        #80  <Field int azh.A>
	// 8801 16435:aload_0         
	// 8802 16436:getfield        #12  <Field azh a>
	// 8803 16439:getfield        #480 <Field int azh.I>
	// 8804 16442:iconst_m1       
	// 8805 16443:ixor            
	// 8806 16444:iand            
	// 8807 16445:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8808 16448:aload_0         
	// 8809 16449:getfield        #12  <Field azh a>
	// 8810 16452:astore_1        
		abyte0.aw = ((azh) (abyte0)).c ^ a.aw;
	// 8811 16453:aload_1         
	// 8812 16454:aload_1         
	// 8813 16455:getfield        #256 <Field int azh.c>
	// 8814 16458:aload_0         
	// 8815 16459:getfield        #12  <Field azh a>
	// 8816 16462:getfield        #304 <Field int azh.aw>
	// 8817 16465:ixor            
	// 8818 16466:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8819 16469:aload_0         
	// 8820 16470:getfield        #12  <Field azh a>
	// 8821 16473:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & ~a.k;
	// 8822 16474:aload_1         
	// 8823 16475:aload_1         
	// 8824 16476:getfield        #304 <Field int azh.aw>
	// 8825 16479:aload_0         
	// 8826 16480:getfield        #12  <Field azh a>
	// 8827 16483:getfield        #164 <Field int azh.k>
	// 8828 16486:iconst_m1       
	// 8829 16487:ixor            
	// 8830 16488:iand            
	// 8831 16489:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8832 16492:aload_0         
	// 8833 16493:getfield        #12  <Field azh a>
	// 8834 16496:astore_1        
		abyte0.aw = ((azh) (abyte0)).aL ^ a.aw;
	// 8835 16497:aload_1         
	// 8836 16498:aload_1         
	// 8837 16499:getfield        #110 <Field int azh.aL>
	// 8838 16502:aload_0         
	// 8839 16503:getfield        #12  <Field azh a>
	// 8840 16506:getfield        #304 <Field int azh.aw>
	// 8841 16509:ixor            
	// 8842 16510:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8843 16513:aload_0         
	// 8844 16514:getfield        #12  <Field azh a>
	// 8845 16517:astore_1        
		abyte0.aw = ((azh) (abyte0)).aI & a.aw;
	// 8846 16518:aload_1         
	// 8847 16519:aload_1         
	// 8848 16520:getfield        #486 <Field int azh.aI>
	// 8849 16523:aload_0         
	// 8850 16524:getfield        #12  <Field azh a>
	// 8851 16527:getfield        #304 <Field int azh.aw>
	// 8852 16530:iand            
	// 8853 16531:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8854 16534:aload_0         
	// 8855 16535:getfield        #12  <Field azh a>
	// 8856 16538:astore_1        
		abyte0.aL = ((azh) (abyte0)).c & ~a.I;
	// 8857 16539:aload_1         
	// 8858 16540:aload_1         
	// 8859 16541:getfield        #256 <Field int azh.c>
	// 8860 16544:aload_0         
	// 8861 16545:getfield        #12  <Field azh a>
	// 8862 16548:getfield        #480 <Field int azh.I>
	// 8863 16551:iconst_m1       
	// 8864 16552:ixor            
	// 8865 16553:iand            
	// 8866 16554:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8867 16557:aload_0         
	// 8868 16558:getfield        #12  <Field azh a>
	// 8869 16561:astore_1        
		abyte0.bI = ((azh) (abyte0)).A & a.aL;
	// 8870 16562:aload_1         
	// 8871 16563:aload_1         
	// 8872 16564:getfield        #80  <Field int azh.A>
	// 8873 16567:aload_0         
	// 8874 16568:getfield        #12  <Field azh a>
	// 8875 16571:getfield        #110 <Field int azh.aL>
	// 8876 16574:iand            
	// 8877 16575:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8878 16578:aload_0         
	// 8879 16579:getfield        #12  <Field azh a>
	// 8880 16582:astore_1        
		abyte0.bI = ((azh) (abyte0)).I ^ a.bI;
	// 8881 16583:aload_1         
	// 8882 16584:aload_1         
	// 8883 16585:getfield        #480 <Field int azh.I>
	// 8884 16588:aload_0         
	// 8885 16589:getfield        #12  <Field azh a>
	// 8886 16592:getfield        #65  <Field int azh.bI>
	// 8887 16595:ixor            
	// 8888 16596:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8889 16599:aload_0         
	// 8890 16600:getfield        #12  <Field azh a>
	// 8891 16603:astore_1        
		abyte0.bI = ((azh) (abyte0)).bI | a.k;
	// 8892 16604:aload_1         
	// 8893 16605:aload_1         
	// 8894 16606:getfield        #65  <Field int azh.bI>
	// 8895 16609:aload_0         
	// 8896 16610:getfield        #12  <Field azh a>
	// 8897 16613:getfield        #164 <Field int azh.k>
	// 8898 16616:ior             
	// 8899 16617:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8900 16620:aload_0         
	// 8901 16621:getfield        #12  <Field azh a>
	// 8902 16624:astore_1        
		abyte0.bK = ((azh) (abyte0)).aL ^ a.A;
	// 8903 16625:aload_1         
	// 8904 16626:aload_1         
	// 8905 16627:getfield        #110 <Field int azh.aL>
	// 8906 16630:aload_0         
	// 8907 16631:getfield        #12  <Field azh a>
	// 8908 16634:getfield        #80  <Field int azh.A>
	// 8909 16637:ixor            
	// 8910 16638:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8911 16641:aload_0         
	// 8912 16642:getfield        #12  <Field azh a>
	// 8913 16645:astore_1        
		abyte0.aD = ((azh) (abyte0)).k & a.bK;
	// 8914 16646:aload_1         
	// 8915 16647:aload_1         
	// 8916 16648:getfield        #164 <Field int azh.k>
	// 8917 16651:aload_0         
	// 8918 16652:getfield        #12  <Field azh a>
	// 8919 16655:getfield        #292 <Field int azh.bK>
	// 8920 16658:iand            
	// 8921 16659:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 8922 16662:aload_0         
	// 8923 16663:getfield        #12  <Field azh a>
	// 8924 16666:astore_1        
		abyte0.aD = ((azh) (abyte0)).bx ^ a.aD;
	// 8925 16667:aload_1         
	// 8926 16668:aload_1         
	// 8927 16669:getfield        #418 <Field int azh.bx>
	// 8928 16672:aload_0         
	// 8929 16673:getfield        #12  <Field azh a>
	// 8930 16676:getfield        #202 <Field int azh.aD>
	// 8931 16679:ixor            
	// 8932 16680:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 8933 16683:aload_0         
	// 8934 16684:getfield        #12  <Field azh a>
	// 8935 16687:astore_1        
		abyte0.aD = ((azh) (abyte0)).aI & a.aD;
	// 8936 16688:aload_1         
	// 8937 16689:aload_1         
	// 8938 16690:getfield        #486 <Field int azh.aI>
	// 8939 16693:aload_0         
	// 8940 16694:getfield        #12  <Field azh a>
	// 8941 16697:getfield        #202 <Field int azh.aD>
	// 8942 16700:iand            
	// 8943 16701:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 8944 16704:aload_0         
	// 8945 16705:getfield        #12  <Field azh a>
	// 8946 16708:astore_1        
		abyte0.bx = ((azh) (abyte0)).bK & ~a.k;
	// 8947 16709:aload_1         
	// 8948 16710:aload_1         
	// 8949 16711:getfield        #292 <Field int azh.bK>
	// 8950 16714:aload_0         
	// 8951 16715:getfield        #12  <Field azh a>
	// 8952 16718:getfield        #164 <Field int azh.k>
	// 8953 16721:iconst_m1       
	// 8954 16722:ixor            
	// 8955 16723:iand            
	// 8956 16724:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8957 16727:aload_0         
	// 8958 16728:getfield        #12  <Field azh a>
	// 8959 16731:astore_1        
		abyte0.av = ((azh) (abyte0)).bK ^ a.av;
	// 8960 16732:aload_1         
	// 8961 16733:aload_1         
	// 8962 16734:getfield        #292 <Field int azh.bK>
	// 8963 16737:aload_0         
	// 8964 16738:getfield        #12  <Field azh a>
	// 8965 16741:getfield        #53  <Field int azh.av>
	// 8966 16744:ixor            
	// 8967 16745:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8968 16748:aload_0         
	// 8969 16749:getfield        #12  <Field azh a>
	// 8970 16752:astore_1        
		abyte0.aw = ((azh) (abyte0)).av ^ a.aw;
	// 8971 16753:aload_1         
	// 8972 16754:aload_1         
	// 8973 16755:getfield        #53  <Field int azh.av>
	// 8974 16758:aload_0         
	// 8975 16759:getfield        #12  <Field azh a>
	// 8976 16762:getfield        #304 <Field int azh.aw>
	// 8977 16765:ixor            
	// 8978 16766:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8979 16769:aload_0         
	// 8980 16770:getfield        #12  <Field azh a>
	// 8981 16773:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & ~a.bb;
	// 8982 16774:aload_1         
	// 8983 16775:aload_1         
	// 8984 16776:getfield        #304 <Field int azh.aw>
	// 8985 16779:aload_0         
	// 8986 16780:getfield        #12  <Field azh a>
	// 8987 16783:getfield        #489 <Field int azh.bb>
	// 8988 16786:iconst_m1       
	// 8989 16787:ixor            
	// 8990 16788:iand            
	// 8991 16789:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8992 16792:aload_0         
	// 8993 16793:getfield        #12  <Field azh a>
	// 8994 16796:astore_1        
		abyte0.aL = ((azh) (abyte0)).A & a.aL;
	// 8995 16797:aload_1         
	// 8996 16798:aload_1         
	// 8997 16799:getfield        #80  <Field int azh.A>
	// 8998 16802:aload_0         
	// 8999 16803:getfield        #12  <Field azh a>
	// 9000 16806:getfield        #110 <Field int azh.aL>
	// 9001 16809:iand            
	// 9002 16810:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 9003 16813:aload_0         
	// 9004 16814:getfield        #12  <Field azh a>
	// 9005 16817:astore_1        
		abyte0.bI = ((azh) (abyte0)).aL ^ a.bI;
	// 9006 16818:aload_1         
	// 9007 16819:aload_1         
	// 9008 16820:getfield        #110 <Field int azh.aL>
	// 9009 16823:aload_0         
	// 9010 16824:getfield        #12  <Field azh a>
	// 9011 16827:getfield        #65  <Field int azh.bI>
	// 9012 16830:ixor            
	// 9013 16831:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9014 16834:aload_0         
	// 9015 16835:getfield        #12  <Field azh a>
	// 9016 16838:astore_1        
		abyte0.bI = ((azh) (abyte0)).aI & a.bI;
	// 9017 16839:aload_1         
	// 9018 16840:aload_1         
	// 9019 16841:getfield        #486 <Field int azh.aI>
	// 9020 16844:aload_0         
	// 9021 16845:getfield        #12  <Field azh a>
	// 9022 16848:getfield        #65  <Field int azh.bI>
	// 9023 16851:iand            
	// 9024 16852:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9025 16855:aload_0         
	// 9026 16856:getfield        #12  <Field azh a>
	// 9027 16859:astore_1        
		abyte0.aL = ((azh) (abyte0)).I ^ a.c;
	// 9028 16860:aload_1         
	// 9029 16861:aload_1         
	// 9030 16862:getfield        #480 <Field int azh.I>
	// 9031 16865:aload_0         
	// 9032 16866:getfield        #12  <Field azh a>
	// 9033 16869:getfield        #256 <Field int azh.c>
	// 9034 16872:ixor            
	// 9035 16873:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 9036 16876:aload_0         
	// 9037 16877:getfield        #12  <Field azh a>
	// 9038 16880:astore_1        
		abyte0.av = ((azh) (abyte0)).A & ~a.aL;
	// 9039 16881:aload_1         
	// 9040 16882:aload_1         
	// 9041 16883:getfield        #80  <Field int azh.A>
	// 9042 16886:aload_0         
	// 9043 16887:getfield        #12  <Field azh a>
	// 9044 16890:getfield        #110 <Field int azh.aL>
	// 9045 16893:iconst_m1       
	// 9046 16894:ixor            
	// 9047 16895:iand            
	// 9048 16896:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9049 16899:aload_0         
	// 9050 16900:getfield        #12  <Field azh a>
	// 9051 16903:astore_1        
		abyte0.av = ((azh) (abyte0)).bH ^ a.av;
	// 9052 16904:aload_1         
	// 9053 16905:aload_1         
	// 9054 16906:getfield        #439 <Field int azh.bH>
	// 9055 16909:aload_0         
	// 9056 16910:getfield        #12  <Field azh a>
	// 9057 16913:getfield        #53  <Field int azh.av>
	// 9058 16916:ixor            
	// 9059 16917:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9060 16920:aload_0         
	// 9061 16921:getfield        #12  <Field azh a>
	// 9062 16924:astore_1        
		abyte0.av = ((azh) (abyte0)).k & a.av;
	// 9063 16925:aload_1         
	// 9064 16926:aload_1         
	// 9065 16927:getfield        #164 <Field int azh.k>
	// 9066 16930:aload_0         
	// 9067 16931:getfield        #12  <Field azh a>
	// 9068 16934:getfield        #53  <Field int azh.av>
	// 9069 16937:iand            
	// 9070 16938:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9071 16941:aload_0         
	// 9072 16942:getfield        #12  <Field azh a>
	// 9073 16945:astore_1        
		abyte0.av = ((azh) (abyte0)).at ^ a.av;
	// 9074 16946:aload_1         
	// 9075 16947:aload_1         
	// 9076 16948:getfield        #322 <Field int azh.at>
	// 9077 16951:aload_0         
	// 9078 16952:getfield        #12  <Field azh a>
	// 9079 16955:getfield        #53  <Field int azh.av>
	// 9080 16958:ixor            
	// 9081 16959:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9082 16962:aload_0         
	// 9083 16963:getfield        #12  <Field azh a>
	// 9084 16966:astore_1        
		abyte0.av = ((azh) (abyte0)).aI & ~a.av;
	// 9085 16967:aload_1         
	// 9086 16968:aload_1         
	// 9087 16969:getfield        #486 <Field int azh.aI>
	// 9088 16972:aload_0         
	// 9089 16973:getfield        #12  <Field azh a>
	// 9090 16976:getfield        #53  <Field int azh.av>
	// 9091 16979:iconst_m1       
	// 9092 16980:ixor            
	// 9093 16981:iand            
	// 9094 16982:putfield        #53  <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9095 16985:aload_0         
	// 9096 16986:getfield        #12  <Field azh a>
	// 9097 16989:astore_1        
		abyte0.bx = ((azh) (abyte0)).aL ^ a.bx;
	// 9098 16990:aload_1         
	// 9099 16991:aload_1         
	// 9100 16992:getfield        #110 <Field int azh.aL>
	// 9101 16995:aload_0         
	// 9102 16996:getfield        #12  <Field azh a>
	// 9103 16999:getfield        #418 <Field int azh.bx>
	// 9104 17002:ixor            
	// 9105 17003:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9106 17006:aload_0         
	// 9107 17007:getfield        #12  <Field azh a>
	// 9108 17010:astore_1        
		abyte0.aD = ((azh) (abyte0)).bx ^ a.aD;
	// 9109 17011:aload_1         
	// 9110 17012:aload_1         
	// 9111 17013:getfield        #418 <Field int azh.bx>
	// 9112 17016:aload_0         
	// 9113 17017:getfield        #12  <Field azh a>
	// 9114 17020:getfield        #202 <Field int azh.aD>
	// 9115 17023:ixor            
	// 9116 17024:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 9117 17027:aload_0         
	// 9118 17028:getfield        #12  <Field azh a>
	// 9119 17031:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD | a.bb;
	// 9120 17032:aload_1         
	// 9121 17033:aload_1         
	// 9122 17034:getfield        #202 <Field int azh.aD>
	// 9123 17037:aload_0         
	// 9124 17038:getfield        #12  <Field azh a>
	// 9125 17041:getfield        #489 <Field int azh.bb>
	// 9126 17044:ior             
	// 9127 17045:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 9128 17048:aload_0         
	// 9129 17049:getfield        #12  <Field azh a>
	// 9130 17052:astore_1        
		abyte0.bx = ((azh) (abyte0)).aL ^ a.k;
	// 9131 17053:aload_1         
	// 9132 17054:aload_1         
	// 9133 17055:getfield        #110 <Field int azh.aL>
	// 9134 17058:aload_0         
	// 9135 17059:getfield        #12  <Field azh a>
	// 9136 17062:getfield        #164 <Field int azh.k>
	// 9137 17065:ixor            
	// 9138 17066:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9139 17069:aload_0         
	// 9140 17070:getfield        #12  <Field azh a>
	// 9141 17073:astore_1        
		abyte0.bP = ((azh) (abyte0)).bx ^ a.bP;
	// 9142 17074:aload_1         
	// 9143 17075:aload_1         
	// 9144 17076:getfield        #418 <Field int azh.bx>
	// 9145 17079:aload_0         
	// 9146 17080:getfield        #12  <Field azh a>
	// 9147 17083:getfield        #62  <Field int azh.bP>
	// 9148 17086:ixor            
	// 9149 17087:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9150 17090:aload_0         
	// 9151 17091:getfield        #12  <Field azh a>
	// 9152 17094:astore_1        
		abyte0.aw = ((azh) (abyte0)).bP ^ a.aw;
	// 9153 17095:aload_1         
	// 9154 17096:aload_1         
	// 9155 17097:getfield        #62  <Field int azh.bP>
	// 9156 17100:aload_0         
	// 9157 17101:getfield        #12  <Field azh a>
	// 9158 17104:getfield        #304 <Field int azh.aw>
	// 9159 17107:ixor            
	// 9160 17108:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9161 17111:aload_0         
	// 9162 17112:getfield        #12  <Field azh a>
	// 9163 17115:astore_1        
		abyte0.N = ((azh) (abyte0)).aw ^ a.N;
	// 9164 17116:aload_1         
	// 9165 17117:aload_1         
	// 9166 17118:getfield        #304 <Field int azh.aw>
	// 9167 17121:aload_0         
	// 9168 17122:getfield        #12  <Field azh a>
	// 9169 17125:getfield        #50  <Field int azh.N>
	// 9170 17128:ixor            
	// 9171 17129:putfield        #50  <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 9172 17132:aload_0         
	// 9173 17133:getfield        #12  <Field azh a>
	// 9174 17136:astore_1        
		abyte0.aw = ((azh) (abyte0)).N | a.F;
	// 9175 17137:aload_1         
	// 9176 17138:aload_1         
	// 9177 17139:getfield        #50  <Field int azh.N>
	// 9178 17142:aload_0         
	// 9179 17143:getfield        #12  <Field azh a>
	// 9180 17146:getfield        #98  <Field int azh.F>
	// 9181 17149:ior             
	// 9182 17150:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9183 17153:aload_0         
	// 9184 17154:getfield        #12  <Field azh a>
	// 9185 17157:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & ~a.V;
	// 9186 17158:aload_1         
	// 9187 17159:aload_1         
	// 9188 17160:getfield        #304 <Field int azh.aw>
	// 9189 17163:aload_0         
	// 9190 17164:getfield        #12  <Field azh a>
	// 9191 17167:getfield        #68  <Field int azh.V>
	// 9192 17170:iconst_m1       
	// 9193 17171:ixor            
	// 9194 17172:iand            
	// 9195 17173:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9196 17176:aload_0         
	// 9197 17177:getfield        #12  <Field azh a>
	// 9198 17180:astore_1        
		abyte0.bP = ((azh) (abyte0)).F & ~a.N;
	// 9199 17181:aload_1         
	// 9200 17182:aload_1         
	// 9201 17183:getfield        #98  <Field int azh.F>
	// 9202 17186:aload_0         
	// 9203 17187:getfield        #12  <Field azh a>
	// 9204 17190:getfield        #50  <Field int azh.N>
	// 9205 17193:iconst_m1       
	// 9206 17194:ixor            
	// 9207 17195:iand            
	// 9208 17196:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9209 17199:aload_0         
	// 9210 17200:getfield        #12  <Field azh a>
	// 9211 17203:astore_1        
		abyte0.bW = ((azh) (abyte0)).bP ^ a.bW;
	// 9212 17204:aload_1         
	// 9213 17205:aload_1         
	// 9214 17206:getfield        #62  <Field int azh.bP>
	// 9215 17209:aload_0         
	// 9216 17210:getfield        #12  <Field azh a>
	// 9217 17213:getfield        #394 <Field int azh.bW>
	// 9218 17216:ixor            
	// 9219 17217:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9220 17220:aload_0         
	// 9221 17221:getfield        #12  <Field azh a>
	// 9222 17224:astore_1        
		abyte0.bW = ((azh) (abyte0)).al & ~a.bW;
	// 9223 17225:aload_1         
	// 9224 17226:aload_1         
	// 9225 17227:getfield        #56  <Field int azh.al>
	// 9226 17230:aload_0         
	// 9227 17231:getfield        #12  <Field azh a>
	// 9228 17234:getfield        #394 <Field int azh.bW>
	// 9229 17237:iconst_m1       
	// 9230 17238:ixor            
	// 9231 17239:iand            
	// 9232 17240:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9233 17243:aload_0         
	// 9234 17244:getfield        #12  <Field azh a>
	// 9235 17247:astore_1        
		abyte0.bP = ((azh) (abyte0)).N | a.F;
	// 9236 17248:aload_1         
	// 9237 17249:aload_1         
	// 9238 17250:getfield        #50  <Field int azh.N>
	// 9239 17253:aload_0         
	// 9240 17254:getfield        #12  <Field azh a>
	// 9241 17257:getfield        #98  <Field int azh.F>
	// 9242 17260:ior             
	// 9243 17261:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9244 17264:aload_0         
	// 9245 17265:getfield        #12  <Field azh a>
	// 9246 17268:astore_1        
		abyte0.bP = ((azh) (abyte0)).an ^ a.bP;
	// 9247 17269:aload_1         
	// 9248 17270:aload_1         
	// 9249 17271:getfield        #286 <Field int azh.an>
	// 9250 17274:aload_0         
	// 9251 17275:getfield        #12  <Field azh a>
	// 9252 17278:getfield        #62  <Field int azh.bP>
	// 9253 17281:ixor            
	// 9254 17282:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9255 17285:aload_0         
	// 9256 17286:getfield        #12  <Field azh a>
	// 9257 17289:astore_1        
		abyte0.bx = ((azh) (abyte0)).bP & a.V;
	// 9258 17290:aload_1         
	// 9259 17291:aload_1         
	// 9260 17292:getfield        #62  <Field int azh.bP>
	// 9261 17295:aload_0         
	// 9262 17296:getfield        #12  <Field azh a>
	// 9263 17299:getfield        #68  <Field int azh.V>
	// 9264 17302:iand            
	// 9265 17303:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9266 17306:aload_0         
	// 9267 17307:getfield        #12  <Field azh a>
	// 9268 17310:astore_1        
		abyte0.bP = ((azh) (abyte0)).bP & a.V;
	// 9269 17311:aload_1         
	// 9270 17312:aload_1         
	// 9271 17313:getfield        #62  <Field int azh.bP>
	// 9272 17316:aload_0         
	// 9273 17317:getfield        #12  <Field azh a>
	// 9274 17320:getfield        #68  <Field int azh.V>
	// 9275 17323:iand            
	// 9276 17324:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9277 17327:aload_0         
	// 9278 17328:getfield        #12  <Field azh a>
	// 9279 17331:astore_1        
		abyte0.at = ((azh) (abyte0)).N | a.F;
	// 9280 17332:aload_1         
	// 9281 17333:aload_1         
	// 9282 17334:getfield        #50  <Field int azh.N>
	// 9283 17337:aload_0         
	// 9284 17338:getfield        #12  <Field azh a>
	// 9285 17341:getfield        #98  <Field int azh.F>
	// 9286 17344:ior             
	// 9287 17345:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9288 17348:aload_0         
	// 9289 17349:getfield        #12  <Field azh a>
	// 9290 17352:astore_1        
		abyte0.at = ((azh) (abyte0)).bV ^ a.at;
	// 9291 17353:aload_1         
	// 9292 17354:aload_1         
	// 9293 17355:getfield        #188 <Field int azh.bV>
	// 9294 17358:aload_0         
	// 9295 17359:getfield        #12  <Field azh a>
	// 9296 17362:getfield        #322 <Field int azh.at>
	// 9297 17365:ixor            
	// 9298 17366:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9299 17369:aload_0         
	// 9300 17370:getfield        #12  <Field azh a>
	// 9301 17373:astore_1        
		abyte0.bH = ((azh) (abyte0)).V & ~a.at;
	// 9302 17374:aload_1         
	// 9303 17375:aload_1         
	// 9304 17376:getfield        #68  <Field int azh.V>
	// 9305 17379:aload_0         
	// 9306 17380:getfield        #12  <Field azh a>
	// 9307 17383:getfield        #322 <Field int azh.at>
	// 9308 17386:iconst_m1       
	// 9309 17387:ixor            
	// 9310 17388:iand            
	// 9311 17389:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9312 17392:aload_0         
	// 9313 17393:getfield        #12  <Field azh a>
	// 9314 17396:astore_1        
		abyte0.bG = ((azh) (abyte0)).N | a.bG;
	// 9315 17397:aload_1         
	// 9316 17398:aload_1         
	// 9317 17399:getfield        #50  <Field int azh.N>
	// 9318 17402:aload_0         
	// 9319 17403:getfield        #12  <Field azh a>
	// 9320 17406:getfield        #155 <Field int azh.bG>
	// 9321 17409:ior             
	// 9322 17410:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 9323 17413:aload_0         
	// 9324 17414:getfield        #12  <Field azh a>
	// 9325 17417:astore_1        
		abyte0.bG = ((azh) (abyte0)).F ^ a.bG;
	// 9326 17418:aload_1         
	// 9327 17419:aload_1         
	// 9328 17420:getfield        #98  <Field int azh.F>
	// 9329 17423:aload_0         
	// 9330 17424:getfield        #12  <Field azh a>
	// 9331 17427:getfield        #155 <Field int azh.bG>
	// 9332 17430:ixor            
	// 9333 17431:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 9334 17434:aload_0         
	// 9335 17435:getfield        #12  <Field azh a>
	// 9336 17438:astore_1        
		abyte0.by = ((azh) (abyte0)).aj & ~a.N;
	// 9337 17439:aload_1         
	// 9338 17440:aload_1         
	// 9339 17441:getfield        #280 <Field int azh.aj>
	// 9340 17444:aload_0         
	// 9341 17445:getfield        #12  <Field azh a>
	// 9342 17448:getfield        #50  <Field int azh.N>
	// 9343 17451:iconst_m1       
	// 9344 17452:ixor            
	// 9345 17453:iand            
	// 9346 17454:putfield        #301 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9347 17457:aload_0         
	// 9348 17458:getfield        #12  <Field azh a>
	// 9349 17461:astore_1        
		abyte0.by = ((azh) (abyte0)).aj ^ a.by;
	// 9350 17462:aload_1         
	// 9351 17463:aload_1         
	// 9352 17464:getfield        #280 <Field int azh.aj>
	// 9353 17467:aload_0         
	// 9354 17468:getfield        #12  <Field azh a>
	// 9355 17471:getfield        #301 <Field int azh.by>
	// 9356 17474:ixor            
	// 9357 17475:putfield        #301 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9358 17478:aload_0         
	// 9359 17479:getfield        #12  <Field azh a>
	// 9360 17482:astore_1        
		abyte0.ce = ((azh) (abyte0)).by & ~a.F;
	// 9361 17483:aload_1         
	// 9362 17484:aload_1         
	// 9363 17485:getfield        #301 <Field int azh.by>
	// 9364 17488:aload_0         
	// 9365 17489:getfield        #12  <Field azh a>
	// 9366 17492:getfield        #98  <Field int azh.F>
	// 9367 17495:iconst_m1       
	// 9368 17496:ixor            
	// 9369 17497:iand            
	// 9370 17498:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9371 17501:aload_0         
	// 9372 17502:getfield        #12  <Field azh a>
	// 9373 17505:astore_1        
		abyte0.aQ = ((azh) (abyte0)).by & ~a.x;
	// 9374 17506:aload_1         
	// 9375 17507:aload_1         
	// 9376 17508:getfield        #301 <Field int azh.by>
	// 9377 17511:aload_0         
	// 9378 17512:getfield        #12  <Field azh a>
	// 9379 17515:getfield        #415 <Field int azh.x>
	// 9380 17518:iconst_m1       
	// 9381 17519:ixor            
	// 9382 17520:iand            
	// 9383 17521:putfield        #295 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9384 17524:aload_0         
	// 9385 17525:getfield        #12  <Field azh a>
	// 9386 17528:astore_1        
		abyte0.aq = ((azh) (abyte0)).an & ~a.N;
	// 9387 17529:aload_1         
	// 9388 17530:aload_1         
	// 9389 17531:getfield        #286 <Field int azh.an>
	// 9390 17534:aload_0         
	// 9391 17535:getfield        #12  <Field azh a>
	// 9392 17538:getfield        #50  <Field int azh.N>
	// 9393 17541:iconst_m1       
	// 9394 17542:ixor            
	// 9395 17543:iand            
	// 9396 17544:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 9397 17547:aload_0         
	// 9398 17548:getfield        #12  <Field azh a>
	// 9399 17551:astore_1        
		abyte0.aq = ((azh) (abyte0)).aT ^ a.aq;
	// 9400 17552:aload_1         
	// 9401 17553:aload_1         
	// 9402 17554:getfield        #137 <Field int azh.aT>
	// 9403 17557:aload_0         
	// 9404 17558:getfield        #12  <Field azh a>
	// 9405 17561:getfield        #274 <Field int azh.aq>
	// 9406 17564:ixor            
	// 9407 17565:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 9408 17568:aload_0         
	// 9409 17569:getfield        #12  <Field azh a>
	// 9410 17572:astore_1        
		abyte0.bP = ((azh) (abyte0)).aq ^ a.bP;
	// 9411 17573:aload_1         
	// 9412 17574:aload_1         
	// 9413 17575:getfield        #274 <Field int azh.aq>
	// 9414 17578:aload_0         
	// 9415 17579:getfield        #12  <Field azh a>
	// 9416 17582:getfield        #62  <Field int azh.bP>
	// 9417 17585:ixor            
	// 9418 17586:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9419 17589:aload_0         
	// 9420 17590:getfield        #12  <Field azh a>
	// 9421 17593:astore_1        
		abyte0.bP = ((azh) (abyte0)).al & ~a.bP;
	// 9422 17594:aload_1         
	// 9423 17595:aload_1         
	// 9424 17596:getfield        #56  <Field int azh.al>
	// 9425 17599:aload_0         
	// 9426 17600:getfield        #12  <Field azh a>
	// 9427 17603:getfield        #62  <Field int azh.bP>
	// 9428 17606:iconst_m1       
	// 9429 17607:ixor            
	// 9430 17608:iand            
	// 9431 17609:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9432 17612:aload_0         
	// 9433 17613:getfield        #12  <Field azh a>
	// 9434 17616:astore_1        
		abyte0.aq = ((azh) (abyte0)).N | a.aj;
	// 9435 17617:aload_1         
	// 9436 17618:aload_1         
	// 9437 17619:getfield        #50  <Field int azh.N>
	// 9438 17622:aload_0         
	// 9439 17623:getfield        #12  <Field azh a>
	// 9440 17626:getfield        #280 <Field int azh.aj>
	// 9441 17629:ior             
	// 9442 17630:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 9443 17633:aload_0         
	// 9444 17634:getfield        #12  <Field azh a>
	// 9445 17637:astore_1        
		abyte0.aq = ((azh) (abyte0)).aj ^ a.aq;
	// 9446 17638:aload_1         
	// 9447 17639:aload_1         
	// 9448 17640:getfield        #280 <Field int azh.aj>
	// 9449 17643:aload_0         
	// 9450 17644:getfield        #12  <Field azh a>
	// 9451 17647:getfield        #274 <Field int azh.aq>
	// 9452 17650:ixor            
	// 9453 17651:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 9454 17654:aload_0         
	// 9455 17655:getfield        #12  <Field azh a>
	// 9456 17658:astore_1        
		abyte0.ay = ((azh) (abyte0)).aq & a.F;
	// 9457 17659:aload_1         
	// 9458 17660:aload_1         
	// 9459 17661:getfield        #274 <Field int azh.aq>
	// 9460 17664:aload_0         
	// 9461 17665:getfield        #12  <Field azh a>
	// 9462 17668:getfield        #98  <Field int azh.F>
	// 9463 17671:iand            
	// 9464 17672:putfield        #307 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 9465 17675:aload_0         
	// 9466 17676:getfield        #12  <Field azh a>
	// 9467 17679:astore_1        
		abyte0.aq = ((azh) (abyte0)).aq & a.F;
	// 9468 17680:aload_1         
	// 9469 17681:aload_1         
	// 9470 17682:getfield        #274 <Field int azh.aq>
	// 9471 17685:aload_0         
	// 9472 17686:getfield        #12  <Field azh a>
	// 9473 17689:getfield        #98  <Field int azh.F>
	// 9474 17692:iand            
	// 9475 17693:putfield        #274 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 9476 17696:aload_0         
	// 9477 17697:getfield        #12  <Field azh a>
	// 9478 17700:astore_1        
		abyte0.am = ((azh) (abyte0)).N | a.bL;
	// 9479 17701:aload_1         
	// 9480 17702:aload_1         
	// 9481 17703:getfield        #50  <Field int azh.N>
	// 9482 17706:aload_0         
	// 9483 17707:getfield        #12  <Field azh a>
	// 9484 17710:getfield        #86  <Field int azh.bL>
	// 9485 17713:ior             
	// 9486 17714:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9487 17717:aload_0         
	// 9488 17718:getfield        #12  <Field azh a>
	// 9489 17721:astore_1        
		abyte0.aC = ((azh) (abyte0)).V | a.am;
	// 9490 17722:aload_1         
	// 9491 17723:aload_1         
	// 9492 17724:getfield        #68  <Field int azh.V>
	// 9493 17727:aload_0         
	// 9494 17728:getfield        #12  <Field azh a>
	// 9495 17731:getfield        #170 <Field int azh.am>
	// 9496 17734:ior             
	// 9497 17735:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 9498 17738:aload_0         
	// 9499 17739:getfield        #12  <Field azh a>
	// 9500 17742:astore_1        
		abyte0.aC = ((azh) (abyte0)).at ^ a.aC;
	// 9501 17743:aload_1         
	// 9502 17744:aload_1         
	// 9503 17745:getfield        #322 <Field int azh.at>
	// 9504 17748:aload_0         
	// 9505 17749:getfield        #12  <Field azh a>
	// 9506 17752:getfield        #262 <Field int azh.aC>
	// 9507 17755:ixor            
	// 9508 17756:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 9509 17759:aload_0         
	// 9510 17760:getfield        #12  <Field azh a>
	// 9511 17763:astore_1        
		abyte0.bW = ((azh) (abyte0)).aC ^ a.bW;
	// 9512 17764:aload_1         
	// 9513 17765:aload_1         
	// 9514 17766:getfield        #262 <Field int azh.aC>
	// 9515 17769:aload_0         
	// 9516 17770:getfield        #12  <Field azh a>
	// 9517 17773:getfield        #394 <Field int azh.bW>
	// 9518 17776:ixor            
	// 9519 17777:putfield        #394 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9520 17780:aload_0         
	// 9521 17781:getfield        #12  <Field azh a>
	// 9522 17784:astore_1        
		abyte0.bx = ((azh) (abyte0)).am ^ a.bx;
	// 9523 17785:aload_1         
	// 9524 17786:aload_1         
	// 9525 17787:getfield        #170 <Field int azh.am>
	// 9526 17790:aload_0         
	// 9527 17791:getfield        #12  <Field azh a>
	// 9528 17794:getfield        #418 <Field int azh.bx>
	// 9529 17797:ixor            
	// 9530 17798:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9531 17801:aload_0         
	// 9532 17802:getfield        #12  <Field azh a>
	// 9533 17805:astore_1        
		abyte0.bx = ((azh) (abyte0)).al & ~a.bx;
	// 9534 17806:aload_1         
	// 9535 17807:aload_1         
	// 9536 17808:getfield        #56  <Field int azh.al>
	// 9537 17811:aload_0         
	// 9538 17812:getfield        #12  <Field azh a>
	// 9539 17815:getfield        #418 <Field int azh.bx>
	// 9540 17818:iconst_m1       
	// 9541 17819:ixor            
	// 9542 17820:iand            
	// 9543 17821:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9544 17824:aload_0         
	// 9545 17825:getfield        #12  <Field azh a>
	// 9546 17828:astore_1        
		abyte0.bL = ((azh) (abyte0)).N | a.bL;
	// 9547 17829:aload_1         
	// 9548 17830:aload_1         
	// 9549 17831:getfield        #50  <Field int azh.N>
	// 9550 17834:aload_0         
	// 9551 17835:getfield        #12  <Field azh a>
	// 9552 17838:getfield        #86  <Field int azh.bL>
	// 9553 17841:ior             
	// 9554 17842:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 9555 17845:aload_0         
	// 9556 17846:getfield        #12  <Field azh a>
	// 9557 17849:astore_1        
		abyte0.bL = ((azh) (abyte0)).an ^ a.bL;
	// 9558 17850:aload_1         
	// 9559 17851:aload_1         
	// 9560 17852:getfield        #286 <Field int azh.an>
	// 9561 17855:aload_0         
	// 9562 17856:getfield        #12  <Field azh a>
	// 9563 17859:getfield        #86  <Field int azh.bL>
	// 9564 17862:ixor            
	// 9565 17863:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 9566 17866:aload_0         
	// 9567 17867:getfield        #12  <Field azh a>
	// 9568 17870:astore_1        
		abyte0.bH = ((azh) (abyte0)).bL ^ a.bH;
	// 9569 17871:aload_1         
	// 9570 17872:aload_1         
	// 9571 17873:getfield        #86  <Field int azh.bL>
	// 9572 17876:aload_0         
	// 9573 17877:getfield        #12  <Field azh a>
	// 9574 17880:getfield        #439 <Field int azh.bH>
	// 9575 17883:ixor            
	// 9576 17884:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9577 17887:aload_0         
	// 9578 17888:getfield        #12  <Field azh a>
	// 9579 17891:astore_1        
		abyte0.am = ((azh) (abyte0)).F & ~a.N;
	// 9580 17892:aload_1         
	// 9581 17893:aload_1         
	// 9582 17894:getfield        #98  <Field int azh.F>
	// 9583 17897:aload_0         
	// 9584 17898:getfield        #12  <Field azh a>
	// 9585 17901:getfield        #50  <Field int azh.N>
	// 9586 17904:iconst_m1       
	// 9587 17905:ixor            
	// 9588 17906:iand            
	// 9589 17907:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9590 17910:aload_0         
	// 9591 17911:getfield        #12  <Field azh a>
	// 9592 17914:astore_1        
		abyte0.am = ((azh) (abyte0)).bM ^ a.am;
	// 9593 17915:aload_1         
	// 9594 17916:aload_1         
	// 9595 17917:getfield        #361 <Field int azh.bM>
	// 9596 17920:aload_0         
	// 9597 17921:getfield        #12  <Field azh a>
	// 9598 17924:getfield        #170 <Field int azh.am>
	// 9599 17927:ixor            
	// 9600 17928:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9601 17931:aload_0         
	// 9602 17932:getfield        #12  <Field azh a>
	// 9603 17935:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.V;
	// 9604 17936:aload_1         
	// 9605 17937:aload_1         
	// 9606 17938:getfield        #170 <Field int azh.am>
	// 9607 17941:aload_0         
	// 9608 17942:getfield        #12  <Field azh a>
	// 9609 17945:getfield        #68  <Field int azh.V>
	// 9610 17948:iconst_m1       
	// 9611 17949:ixor            
	// 9612 17950:iand            
	// 9613 17951:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9614 17954:aload_0         
	// 9615 17955:getfield        #12  <Field azh a>
	// 9616 17958:astore_1        
		abyte0.am = ((azh) (abyte0)).bL ^ a.am;
	// 9617 17959:aload_1         
	// 9618 17960:aload_1         
	// 9619 17961:getfield        #86  <Field int azh.bL>
	// 9620 17964:aload_0         
	// 9621 17965:getfield        #12  <Field azh a>
	// 9622 17968:getfield        #170 <Field int azh.am>
	// 9623 17971:ixor            
	// 9624 17972:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9625 17975:aload_0         
	// 9626 17976:getfield        #12  <Field azh a>
	// 9627 17979:astore_1        
		abyte0.am = ((azh) (abyte0)).al & a.am;
	// 9628 17980:aload_1         
	// 9629 17981:aload_1         
	// 9630 17982:getfield        #56  <Field int azh.al>
	// 9631 17985:aload_0         
	// 9632 17986:getfield        #12  <Field azh a>
	// 9633 17989:getfield        #170 <Field int azh.am>
	// 9634 17992:iand            
	// 9635 17993:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9636 17996:aload_0         
	// 9637 17997:getfield        #12  <Field azh a>
	// 9638 18000:astore_1        
		abyte0.aC = ((azh) (abyte0)).az & ~a.N;
	// 9639 18001:aload_1         
	// 9640 18002:aload_1         
	// 9641 18003:getfield        #208 <Field int azh.az>
	// 9642 18006:aload_0         
	// 9643 18007:getfield        #12  <Field azh a>
	// 9644 18010:getfield        #50  <Field int azh.N>
	// 9645 18013:iconst_m1       
	// 9646 18014:ixor            
	// 9647 18015:iand            
	// 9648 18016:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 9649 18019:aload_0         
	// 9650 18020:getfield        #12  <Field azh a>
	// 9651 18023:astore_1        
		abyte0.aC = ((azh) (abyte0)).ad ^ a.aC;
	// 9652 18024:aload_1         
	// 9653 18025:aload_1         
	// 9654 18026:getfield        #47  <Field int azh.ad>
	// 9655 18029:aload_0         
	// 9656 18030:getfield        #12  <Field azh a>
	// 9657 18033:getfield        #262 <Field int azh.aC>
	// 9658 18036:ixor            
	// 9659 18037:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 9660 18040:aload_0         
	// 9661 18041:getfield        #12  <Field azh a>
	// 9662 18044:astore_1        
		abyte0.aw = ((azh) (abyte0)).aC ^ a.aw;
	// 9663 18045:aload_1         
	// 9664 18046:aload_1         
	// 9665 18047:getfield        #262 <Field int azh.aC>
	// 9666 18050:aload_0         
	// 9667 18051:getfield        #12  <Field azh a>
	// 9668 18054:getfield        #304 <Field int azh.aw>
	// 9669 18057:ixor            
	// 9670 18058:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9671 18061:aload_0         
	// 9672 18062:getfield        #12  <Field azh a>
	// 9673 18065:astore_1        
		abyte0.bP = ((azh) (abyte0)).aw ^ a.bP;
	// 9674 18066:aload_1         
	// 9675 18067:aload_1         
	// 9676 18068:getfield        #304 <Field int azh.aw>
	// 9677 18071:aload_0         
	// 9678 18072:getfield        #12  <Field azh a>
	// 9679 18075:getfield        #62  <Field int azh.bP>
	// 9680 18078:ixor            
	// 9681 18079:putfield        #62  <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9682 18082:aload_0         
	// 9683 18083:getfield        #12  <Field azh a>
	// 9684 18086:astore_1        
		abyte0.aw = ((azh) (abyte0)).az & ~a.N;
	// 9685 18087:aload_1         
	// 9686 18088:aload_1         
	// 9687 18089:getfield        #208 <Field int azh.az>
	// 9688 18092:aload_0         
	// 9689 18093:getfield        #12  <Field azh a>
	// 9690 18096:getfield        #50  <Field int azh.N>
	// 9691 18099:iconst_m1       
	// 9692 18100:ixor            
	// 9693 18101:iand            
	// 9694 18102:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9695 18105:aload_0         
	// 9696 18106:getfield        #12  <Field azh a>
	// 9697 18109:astore_1        
		abyte0.at = ((azh) (abyte0)).N | a.aj;
	// 9698 18110:aload_1         
	// 9699 18111:aload_1         
	// 9700 18112:getfield        #50  <Field int azh.N>
	// 9701 18115:aload_0         
	// 9702 18116:getfield        #12  <Field azh a>
	// 9703 18119:getfield        #280 <Field int azh.aj>
	// 9704 18122:ior             
	// 9705 18123:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9706 18126:aload_0         
	// 9707 18127:getfield        #12  <Field azh a>
	// 9708 18130:astore_1        
		abyte0.at = ((azh) (abyte0)).F & ~a.at;
	// 9709 18131:aload_1         
	// 9710 18132:aload_1         
	// 9711 18133:getfield        #98  <Field int azh.F>
	// 9712 18136:aload_0         
	// 9713 18137:getfield        #12  <Field azh a>
	// 9714 18140:getfield        #322 <Field int azh.at>
	// 9715 18143:iconst_m1       
	// 9716 18144:ixor            
	// 9717 18145:iand            
	// 9718 18146:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9719 18149:aload_0         
	// 9720 18150:getfield        #12  <Field azh a>
	// 9721 18153:astore_1        
		abyte0.at = ((azh) (abyte0)).x | a.at;
	// 9722 18154:aload_1         
	// 9723 18155:aload_1         
	// 9724 18156:getfield        #415 <Field int azh.x>
	// 9725 18159:aload_0         
	// 9726 18160:getfield        #12  <Field azh a>
	// 9727 18163:getfield        #322 <Field int azh.at>
	// 9728 18166:ior             
	// 9729 18167:putfield        #322 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 9730 18170:aload_0         
	// 9731 18171:getfield        #12  <Field azh a>
	// 9732 18174:astore_1        
		abyte0.bu = ((azh) (abyte0)).N | a.an;
	// 9733 18175:aload_1         
	// 9734 18176:aload_1         
	// 9735 18177:getfield        #50  <Field int azh.N>
	// 9736 18180:aload_0         
	// 9737 18181:getfield        #12  <Field azh a>
	// 9738 18184:getfield        #286 <Field int azh.an>
	// 9739 18187:ior             
	// 9740 18188:putfield        #268 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 9741 18191:aload_0         
	// 9742 18192:getfield        #12  <Field azh a>
	// 9743 18195:astore_1        
		abyte0.ae = ((azh) (abyte0)).N | a.aT;
	// 9744 18196:aload_1         
	// 9745 18197:aload_1         
	// 9746 18198:getfield        #50  <Field int azh.N>
	// 9747 18201:aload_0         
	// 9748 18202:getfield        #12  <Field azh a>
	// 9749 18205:getfield        #137 <Field int azh.aT>
	// 9750 18208:ior             
	// 9751 18209:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9752 18212:aload_0         
	// 9753 18213:getfield        #12  <Field azh a>
	// 9754 18216:astore_1        
		abyte0.ae = ((azh) (abyte0)).bV ^ a.ae;
	// 9755 18217:aload_1         
	// 9756 18218:aload_1         
	// 9757 18219:getfield        #188 <Field int azh.bV>
	// 9758 18222:aload_0         
	// 9759 18223:getfield        #12  <Field azh a>
	// 9760 18226:getfield        #265 <Field int azh.ae>
	// 9761 18229:ixor            
	// 9762 18230:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9763 18233:aload_0         
	// 9764 18234:getfield        #12  <Field azh a>
	// 9765 18237:astore_1        
		abyte0.ae = ((azh) (abyte0)).V & ~a.ae;
	// 9766 18238:aload_1         
	// 9767 18239:aload_1         
	// 9768 18240:getfield        #68  <Field int azh.V>
	// 9769 18243:aload_0         
	// 9770 18244:getfield        #12  <Field azh a>
	// 9771 18247:getfield        #265 <Field int azh.ae>
	// 9772 18250:iconst_m1       
	// 9773 18251:ixor            
	// 9774 18252:iand            
	// 9775 18253:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9776 18256:aload_0         
	// 9777 18257:getfield        #12  <Field azh a>
	// 9778 18260:astore_1        
		abyte0.ae = ((azh) (abyte0)).bu ^ a.ae;
	// 9779 18261:aload_1         
	// 9780 18262:aload_1         
	// 9781 18263:getfield        #268 <Field int azh.bu>
	// 9782 18266:aload_0         
	// 9783 18267:getfield        #12  <Field azh a>
	// 9784 18270:getfield        #265 <Field int azh.ae>
	// 9785 18273:ixor            
	// 9786 18274:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9787 18277:aload_0         
	// 9788 18278:getfield        #12  <Field azh a>
	// 9789 18281:astore_1        
		abyte0.am = ((azh) (abyte0)).ae ^ a.am;
	// 9790 18282:aload_1         
	// 9791 18283:aload_1         
	// 9792 18284:getfield        #265 <Field int azh.ae>
	// 9793 18287:aload_0         
	// 9794 18288:getfield        #12  <Field azh a>
	// 9795 18291:getfield        #170 <Field int azh.am>
	// 9796 18294:ixor            
	// 9797 18295:putfield        #170 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9798 18298:aload_0         
	// 9799 18299:getfield        #12  <Field azh a>
	// 9800 18302:astore_1        
		abyte0.an = ((azh) (abyte0)).an ^ a.N;
	// 9801 18303:aload_1         
	// 9802 18304:aload_1         
	// 9803 18305:getfield        #286 <Field int azh.an>
	// 9804 18308:aload_0         
	// 9805 18309:getfield        #12  <Field azh a>
	// 9806 18312:getfield        #50  <Field int azh.N>
	// 9807 18315:ixor            
	// 9808 18316:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 9809 18319:aload_0         
	// 9810 18320:getfield        #12  <Field azh a>
	// 9811 18323:astore_1        
		abyte0.an = ((azh) (abyte0)).an & a.V;
	// 9812 18324:aload_1         
	// 9813 18325:aload_1         
	// 9814 18326:getfield        #286 <Field int azh.an>
	// 9815 18329:aload_0         
	// 9816 18330:getfield        #12  <Field azh a>
	// 9817 18333:getfield        #68  <Field int azh.V>
	// 9818 18336:iand            
	// 9819 18337:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 9820 18340:aload_0         
	// 9821 18341:getfield        #12  <Field azh a>
	// 9822 18344:astore_1        
		abyte0.ae = ((azh) (abyte0)).N | a.aT;
	// 9823 18345:aload_1         
	// 9824 18346:aload_1         
	// 9825 18347:getfield        #50  <Field int azh.N>
	// 9826 18350:aload_0         
	// 9827 18351:getfield        #12  <Field azh a>
	// 9828 18354:getfield        #137 <Field int azh.aT>
	// 9829 18357:ior             
	// 9830 18358:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9831 18361:aload_0         
	// 9832 18362:getfield        #12  <Field azh a>
	// 9833 18365:astore_1        
		abyte0.ae = ((azh) (abyte0)).aT ^ a.ae;
	// 9834 18366:aload_1         
	// 9835 18367:aload_1         
	// 9836 18368:getfield        #137 <Field int azh.aT>
	// 9837 18371:aload_0         
	// 9838 18372:getfield        #12  <Field azh a>
	// 9839 18375:getfield        #265 <Field int azh.ae>
	// 9840 18378:ixor            
	// 9841 18379:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9842 18382:aload_0         
	// 9843 18383:getfield        #12  <Field azh a>
	// 9844 18386:astore_1        
		abyte0.an = ((azh) (abyte0)).ae ^ a.an;
	// 9845 18387:aload_1         
	// 9846 18388:aload_1         
	// 9847 18389:getfield        #265 <Field int azh.ae>
	// 9848 18392:aload_0         
	// 9849 18393:getfield        #12  <Field azh a>
	// 9850 18396:getfield        #286 <Field int azh.an>
	// 9851 18399:ixor            
	// 9852 18400:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 9853 18403:aload_0         
	// 9854 18404:getfield        #12  <Field azh a>
	// 9855 18407:astore_1        
		abyte0.an = ((azh) (abyte0)).al & a.an;
	// 9856 18408:aload_1         
	// 9857 18409:aload_1         
	// 9858 18410:getfield        #56  <Field int azh.al>
	// 9859 18413:aload_0         
	// 9860 18414:getfield        #12  <Field azh a>
	// 9861 18417:getfield        #286 <Field int azh.an>
	// 9862 18420:iand            
	// 9863 18421:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 9864 18424:aload_0         
	// 9865 18425:getfield        #12  <Field azh a>
	// 9866 18428:astore_1        
		abyte0.bu = ((azh) (abyte0)).ae & ~a.V;
	// 9867 18429:aload_1         
	// 9868 18430:aload_1         
	// 9869 18431:getfield        #265 <Field int azh.ae>
	// 9870 18434:aload_0         
	// 9871 18435:getfield        #12  <Field azh a>
	// 9872 18438:getfield        #68  <Field int azh.V>
	// 9873 18441:iconst_m1       
	// 9874 18442:ixor            
	// 9875 18443:iand            
	// 9876 18444:putfield        #268 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 9877 18447:aload_0         
	// 9878 18448:getfield        #12  <Field azh a>
	// 9879 18451:astore_1        
		abyte0.bu = ((azh) (abyte0)).bL ^ a.bu;
	// 9880 18452:aload_1         
	// 9881 18453:aload_1         
	// 9882 18454:getfield        #86  <Field int azh.bL>
	// 9883 18457:aload_0         
	// 9884 18458:getfield        #12  <Field azh a>
	// 9885 18461:getfield        #268 <Field int azh.bu>
	// 9886 18464:ixor            
	// 9887 18465:putfield        #268 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 9888 18468:aload_0         
	// 9889 18469:getfield        #12  <Field azh a>
	// 9890 18472:astore_1        
		abyte0.bx = ((azh) (abyte0)).bu ^ a.bx;
	// 9891 18473:aload_1         
	// 9892 18474:aload_1         
	// 9893 18475:getfield        #268 <Field int azh.bu>
	// 9894 18478:aload_0         
	// 9895 18479:getfield        #12  <Field azh a>
	// 9896 18482:getfield        #418 <Field int azh.bx>
	// 9897 18485:ixor            
	// 9898 18486:putfield        #418 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9899 18489:aload_0         
	// 9900 18490:getfield        #12  <Field azh a>
	// 9901 18493:astore_1        
		abyte0.az = ((azh) (abyte0)).az & ~a.N;
	// 9902 18494:aload_1         
	// 9903 18495:aload_1         
	// 9904 18496:getfield        #208 <Field int azh.az>
	// 9905 18499:aload_0         
	// 9906 18500:getfield        #12  <Field azh a>
	// 9907 18503:getfield        #50  <Field int azh.N>
	// 9908 18506:iconst_m1       
	// 9909 18507:ixor            
	// 9910 18508:iand            
	// 9911 18509:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 9912 18512:aload_0         
	// 9913 18513:getfield        #12  <Field azh a>
	// 9914 18516:astore_1        
		abyte0.az = ((azh) (abyte0)).bV ^ a.az;
	// 9915 18517:aload_1         
	// 9916 18518:aload_1         
	// 9917 18519:getfield        #188 <Field int azh.bV>
	// 9918 18522:aload_0         
	// 9919 18523:getfield        #12  <Field azh a>
	// 9920 18526:getfield        #208 <Field int azh.az>
	// 9921 18529:ixor            
	// 9922 18530:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 9923 18533:aload_0         
	// 9924 18534:getfield        #12  <Field azh a>
	// 9925 18537:astore_1        
		abyte0.bV = ((azh) (abyte0)).V & ~a.az;
	// 9926 18538:aload_1         
	// 9927 18539:aload_1         
	// 9928 18540:getfield        #68  <Field int azh.V>
	// 9929 18543:aload_0         
	// 9930 18544:getfield        #12  <Field azh a>
	// 9931 18547:getfield        #208 <Field int azh.az>
	// 9932 18550:iconst_m1       
	// 9933 18551:ixor            
	// 9934 18552:iand            
	// 9935 18553:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9936 18556:aload_0         
	// 9937 18557:getfield        #12  <Field azh a>
	// 9938 18560:astore_1        
		abyte0.bV = ((azh) (abyte0)).bG ^ a.bV;
	// 9939 18561:aload_1         
	// 9940 18562:aload_1         
	// 9941 18563:getfield        #155 <Field int azh.bG>
	// 9942 18566:aload_0         
	// 9943 18567:getfield        #12  <Field azh a>
	// 9944 18570:getfield        #188 <Field int azh.bV>
	// 9945 18573:ixor            
	// 9946 18574:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9947 18577:aload_0         
	// 9948 18578:getfield        #12  <Field azh a>
	// 9949 18581:astore_1        
		abyte0.bG = ((azh) (abyte0)).N | a.ad;
	// 9950 18582:aload_1         
	// 9951 18583:aload_1         
	// 9952 18584:getfield        #50  <Field int azh.N>
	// 9953 18587:aload_0         
	// 9954 18588:getfield        #12  <Field azh a>
	// 9955 18591:getfield        #47  <Field int azh.ad>
	// 9956 18594:ior             
	// 9957 18595:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 9958 18598:aload_0         
	// 9959 18599:getfield        #12  <Field azh a>
	// 9960 18602:astore_1        
		abyte0.bG = ((azh) (abyte0)).V & ~a.bG;
	// 9961 18603:aload_1         
	// 9962 18604:aload_1         
	// 9963 18605:getfield        #68  <Field int azh.V>
	// 9964 18608:aload_0         
	// 9965 18609:getfield        #12  <Field azh a>
	// 9966 18612:getfield        #155 <Field int azh.bG>
	// 9967 18615:iconst_m1       
	// 9968 18616:ixor            
	// 9969 18617:iand            
	// 9970 18618:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 9971 18621:aload_0         
	// 9972 18622:getfield        #12  <Field azh a>
	// 9973 18625:astore_1        
		abyte0.bG = ((azh) (abyte0)).aC ^ a.bG;
	// 9974 18626:aload_1         
	// 9975 18627:aload_1         
	// 9976 18628:getfield        #262 <Field int azh.aC>
	// 9977 18631:aload_0         
	// 9978 18632:getfield        #12  <Field azh a>
	// 9979 18635:getfield        #155 <Field int azh.bG>
	// 9980 18638:ixor            
	// 9981 18639:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 9982 18642:aload_0         
	// 9983 18643:getfield        #12  <Field azh a>
	// 9984 18646:astore_1        
		abyte0.an = ((azh) (abyte0)).bG ^ a.an;
	// 9985 18647:aload_1         
	// 9986 18648:aload_1         
	// 9987 18649:getfield        #155 <Field int azh.bG>
	// 9988 18652:aload_0         
	// 9989 18653:getfield        #12  <Field azh a>
	// 9990 18656:getfield        #286 <Field int azh.an>
	// 9991 18659:ixor            
	// 9992 18660:putfield        #286 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 9993 18663:aload_0         
	// 9994 18664:getfield        #12  <Field azh a>
	// 9995 18667:astore_1        
		abyte0.bG = ((azh) (abyte0)).N | a.aj;
	// 9996 18668:aload_1         
	// 9997 18669:aload_1         
	// 9998 18670:getfield        #50  <Field int azh.N>
	// 9999 18673:aload_0         
	// 10000 18674:getfield        #12  <Field azh a>
	// 10001 18677:getfield        #280 <Field int azh.aj>
	// 10002 18680:ior             
	// 10003 18681:putfield        #155 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 10004 18684:aload_0         
	// 10005 18685:getfield        #12  <Field azh a>
	// 10006 18688:astore_1        
		abyte0.aC = ((azh) (abyte0)).V & ~a.N;
	// 10007 18689:aload_1         
	// 10008 18690:aload_1         
	// 10009 18691:getfield        #68  <Field int azh.V>
	// 10010 18694:aload_0         
	// 10011 18695:getfield        #12  <Field azh a>
	// 10012 18698:getfield        #50  <Field int azh.N>
	// 10013 18701:iconst_m1       
	// 10014 18702:ixor            
	// 10015 18703:iand            
	// 10016 18704:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 10017 18707:aload_0         
	// 10018 18708:getfield        #12  <Field azh a>
	// 10019 18711:astore_1        
		abyte0.aC = ((azh) (abyte0)).aw ^ a.aC;
	// 10020 18712:aload_1         
	// 10021 18713:aload_1         
	// 10022 18714:getfield        #304 <Field int azh.aw>
	// 10023 18717:aload_0         
	// 10024 18718:getfield        #12  <Field azh a>
	// 10025 18721:getfield        #262 <Field int azh.aC>
	// 10026 18724:ixor            
	// 10027 18725:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 10028 18728:aload_0         
	// 10029 18729:getfield        #12  <Field azh a>
	// 10030 18732:astore_1        
		abyte0.aC = ((azh) (abyte0)).al & ~a.aC;
	// 10031 18733:aload_1         
	// 10032 18734:aload_1         
	// 10033 18735:getfield        #56  <Field int azh.al>
	// 10034 18738:aload_0         
	// 10035 18739:getfield        #12  <Field azh a>
	// 10036 18742:getfield        #262 <Field int azh.aC>
	// 10037 18745:iconst_m1       
	// 10038 18746:ixor            
	// 10039 18747:iand            
	// 10040 18748:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 10041 18751:aload_0         
	// 10042 18752:getfield        #12  <Field azh a>
	// 10043 18755:astore_1        
		abyte0.aC = ((azh) (abyte0)).bV ^ a.aC;
	// 10044 18756:aload_1         
	// 10045 18757:aload_1         
	// 10046 18758:getfield        #188 <Field int azh.bV>
	// 10047 18761:aload_0         
	// 10048 18762:getfield        #12  <Field azh a>
	// 10049 18765:getfield        #262 <Field int azh.aC>
	// 10050 18768:ixor            
	// 10051 18769:putfield        #262 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 10052 18772:aload_0         
	// 10053 18773:getfield        #12  <Field azh a>
	// 10054 18776:astore_1        
		abyte0.bV = ((azh) (abyte0)).aj ^ a.N;
	// 10055 18777:aload_1         
	// 10056 18778:aload_1         
	// 10057 18779:getfield        #280 <Field int azh.aj>
	// 10058 18782:aload_0         
	// 10059 18783:getfield        #12  <Field azh a>
	// 10060 18786:getfield        #50  <Field int azh.N>
	// 10061 18789:ixor            
	// 10062 18790:putfield        #188 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10063 18793:aload_0         
	// 10064 18794:getfield        #12  <Field azh a>
	// 10065 18797:astore_1        
		abyte0.ce = ((azh) (abyte0)).bV ^ a.ce;
	// 10066 18798:aload_1         
	// 10067 18799:aload_1         
	// 10068 18800:getfield        #188 <Field int azh.bV>
	// 10069 18803:aload_0         
	// 10070 18804:getfield        #12  <Field azh a>
	// 10071 18807:getfield        #29  <Field int azh.ce>
	// 10072 18810:ixor            
	// 10073 18811:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10074 18814:aload_0         
	// 10075 18815:getfield        #12  <Field azh a>
	// 10076 18818:astore_1        
		abyte0.ce = ((azh) (abyte0)).x | a.ce;
	// 10077 18819:aload_1         
	// 10078 18820:aload_1         
	// 10079 18821:getfield        #415 <Field int azh.x>
	// 10080 18824:aload_0         
	// 10081 18825:getfield        #12  <Field azh a>
	// 10082 18828:getfield        #29  <Field int azh.ce>
	// 10083 18831:ior             
	// 10084 18832:putfield        #29  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10085 18835:aload_0         
	// 10086 18836:getfield        #12  <Field azh a>
	// 10087 18839:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT ^ a.N;
	// 10088 18840:aload_1         
	// 10089 18841:aload_1         
	// 10090 18842:getfield        #137 <Field int azh.aT>
	// 10091 18845:aload_0         
	// 10092 18846:getfield        #12  <Field azh a>
	// 10093 18849:getfield        #50  <Field int azh.N>
	// 10094 18852:ixor            
	// 10095 18853:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10096 18856:aload_0         
	// 10097 18857:getfield        #12  <Field azh a>
	// 10098 18860:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & a.V;
	// 10099 18861:aload_1         
	// 10100 18862:aload_1         
	// 10101 18863:getfield        #137 <Field int azh.aT>
	// 10102 18866:aload_0         
	// 10103 18867:getfield        #12  <Field azh a>
	// 10104 18870:getfield        #68  <Field int azh.V>
	// 10105 18873:iand            
	// 10106 18874:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10107 18877:aload_0         
	// 10108 18878:getfield        #12  <Field azh a>
	// 10109 18881:astore_1        
		abyte0.aT = ((azh) (abyte0)).ae ^ a.aT;
	// 10110 18882:aload_1         
	// 10111 18883:aload_1         
	// 10112 18884:getfield        #265 <Field int azh.ae>
	// 10113 18887:aload_0         
	// 10114 18888:getfield        #12  <Field azh a>
	// 10115 18891:getfield        #137 <Field int azh.aT>
	// 10116 18894:ixor            
	// 10117 18895:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10118 18898:aload_0         
	// 10119 18899:getfield        #12  <Field azh a>
	// 10120 18902:astore_1        
		abyte0.aT = ((azh) (abyte0)).al & ~a.aT;
	// 10121 18903:aload_1         
	// 10122 18904:aload_1         
	// 10123 18905:getfield        #56  <Field int azh.al>
	// 10124 18908:aload_0         
	// 10125 18909:getfield        #12  <Field azh a>
	// 10126 18912:getfield        #137 <Field int azh.aT>
	// 10127 18915:iconst_m1       
	// 10128 18916:ixor            
	// 10129 18917:iand            
	// 10130 18918:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10131 18921:aload_0         
	// 10132 18922:getfield        #12  <Field azh a>
	// 10133 18925:astore_1        
		abyte0.aT = ((azh) (abyte0)).bH ^ a.aT;
	// 10134 18926:aload_1         
	// 10135 18927:aload_1         
	// 10136 18928:getfield        #439 <Field int azh.bH>
	// 10137 18931:aload_0         
	// 10138 18932:getfield        #12  <Field azh a>
	// 10139 18935:getfield        #137 <Field int azh.aT>
	// 10140 18938:ixor            
	// 10141 18939:putfield        #137 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10142 18942:aload_0         
	// 10143 18943:getfield        #12  <Field azh a>
	// 10144 18946:astore_1        
		abyte0.bH = ((azh) (abyte0)).bM ^ a.N;
	// 10145 18947:aload_1         
	// 10146 18948:aload_1         
	// 10147 18949:getfield        #361 <Field int azh.bM>
	// 10148 18952:aload_0         
	// 10149 18953:getfield        #12  <Field azh a>
	// 10150 18956:getfield        #50  <Field int azh.N>
	// 10151 18959:ixor            
	// 10152 18960:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10153 18963:aload_0         
	// 10154 18964:getfield        #12  <Field azh a>
	// 10155 18967:astore_1        
		abyte0.bH = ((azh) (abyte0)).V & ~a.bH;
	// 10156 18968:aload_1         
	// 10157 18969:aload_1         
	// 10158 18970:getfield        #68  <Field int azh.V>
	// 10159 18973:aload_0         
	// 10160 18974:getfield        #12  <Field azh a>
	// 10161 18977:getfield        #439 <Field int azh.bH>
	// 10162 18980:iconst_m1       
	// 10163 18981:ixor            
	// 10164 18982:iand            
	// 10165 18983:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10166 18986:aload_0         
	// 10167 18987:getfield        #12  <Field azh a>
	// 10168 18990:astore_1        
		abyte0.bH = ((azh) (abyte0)).az ^ a.bH;
	// 10169 18991:aload_1         
	// 10170 18992:aload_1         
	// 10171 18993:getfield        #208 <Field int azh.az>
	// 10172 18996:aload_0         
	// 10173 18997:getfield        #12  <Field azh a>
	// 10174 19000:getfield        #439 <Field int azh.bH>
	// 10175 19003:ixor            
	// 10176 19004:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10177 19007:aload_0         
	// 10178 19008:getfield        #12  <Field azh a>
	// 10179 19011:astore_1        
		abyte0.bH = ((azh) (abyte0)).al & a.bH;
	// 10180 19012:aload_1         
	// 10181 19013:aload_1         
	// 10182 19014:getfield        #56  <Field int azh.al>
	// 10183 19017:aload_0         
	// 10184 19018:getfield        #12  <Field azh a>
	// 10185 19021:getfield        #439 <Field int azh.bH>
	// 10186 19024:iand            
	// 10187 19025:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10188 19028:aload_0         
	// 10189 19029:getfield        #12  <Field azh a>
	// 10190 19032:astore_1        
		abyte0.bM = ((azh) (abyte0)).bM & ~a.N;
	// 10191 19033:aload_1         
	// 10192 19034:aload_1         
	// 10193 19035:getfield        #361 <Field int azh.bM>
	// 10194 19038:aload_0         
	// 10195 19039:getfield        #12  <Field azh a>
	// 10196 19042:getfield        #50  <Field int azh.N>
	// 10197 19045:iconst_m1       
	// 10198 19046:ixor            
	// 10199 19047:iand            
	// 10200 19048:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10201 19051:aload_0         
	// 10202 19052:getfield        #12  <Field azh a>
	// 10203 19055:astore_1        
		abyte0.bM = ((azh) (abyte0)).F ^ a.bM;
	// 10204 19056:aload_1         
	// 10205 19057:aload_1         
	// 10206 19058:getfield        #98  <Field int azh.F>
	// 10207 19061:aload_0         
	// 10208 19062:getfield        #12  <Field azh a>
	// 10209 19065:getfield        #361 <Field int azh.bM>
	// 10210 19068:ixor            
	// 10211 19069:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10212 19072:aload_0         
	// 10213 19073:getfield        #12  <Field azh a>
	// 10214 19076:astore_1        
		abyte0.bM = ((azh) (abyte0)).V & ~a.bM;
	// 10215 19077:aload_1         
	// 10216 19078:aload_1         
	// 10217 19079:getfield        #68  <Field int azh.V>
	// 10218 19082:aload_0         
	// 10219 19083:getfield        #12  <Field azh a>
	// 10220 19086:getfield        #361 <Field int azh.bM>
	// 10221 19089:iconst_m1       
	// 10222 19090:ixor            
	// 10223 19091:iand            
	// 10224 19092:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10225 19095:aload_0         
	// 10226 19096:getfield        #12  <Field azh a>
	// 10227 19099:astore_1        
		abyte0.bH = ((azh) (abyte0)).bM ^ a.bH;
	// 10228 19100:aload_1         
	// 10229 19101:aload_1         
	// 10230 19102:getfield        #361 <Field int azh.bM>
	// 10231 19105:aload_0         
	// 10232 19106:getfield        #12  <Field azh a>
	// 10233 19109:getfield        #439 <Field int azh.bH>
	// 10234 19112:ixor            
	// 10235 19113:putfield        #439 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10236 19116:aload_0         
	// 10237 19117:getfield        #12  <Field azh a>
	// 10238 19120:astore_1        
		abyte0.bM = ((azh) (abyte0)).aj & ~a.N;
	// 10239 19121:aload_1         
	// 10240 19122:aload_1         
	// 10241 19123:getfield        #280 <Field int azh.aj>
	// 10242 19126:aload_0         
	// 10243 19127:getfield        #12  <Field azh a>
	// 10244 19130:getfield        #50  <Field int azh.N>
	// 10245 19133:iconst_m1       
	// 10246 19134:ixor            
	// 10247 19135:iand            
	// 10248 19136:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10249 19139:aload_0         
	// 10250 19140:getfield        #12  <Field azh a>
	// 10251 19143:astore_1        
		abyte0.bM = ((azh) (abyte0)).F | a.bM;
	// 10252 19144:aload_1         
	// 10253 19145:aload_1         
	// 10254 19146:getfield        #98  <Field int azh.F>
	// 10255 19149:aload_0         
	// 10256 19150:getfield        #12  <Field azh a>
	// 10257 19153:getfield        #361 <Field int azh.bM>
	// 10258 19156:ior             
	// 10259 19157:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10260 19160:aload_0         
	// 10261 19161:getfield        #12  <Field azh a>
	// 10262 19164:astore_1        
		abyte0.bM = ((azh) (abyte0)).bV ^ a.bM;
	// 10263 19165:aload_1         
	// 10264 19166:aload_1         
	// 10265 19167:getfield        #188 <Field int azh.bV>
	// 10266 19170:aload_0         
	// 10267 19171:getfield        #12  <Field azh a>
	// 10268 19174:getfield        #361 <Field int azh.bM>
	// 10269 19177:ixor            
	// 10270 19178:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10271 19181:aload_0         
	// 10272 19182:getfield        #12  <Field azh a>
	// 10273 19185:astore_1        
		abyte0.bM = ((azh) (abyte0)).x | a.bM;
	// 10274 19186:aload_1         
	// 10275 19187:aload_1         
	// 10276 19188:getfield        #415 <Field int azh.x>
	// 10277 19191:aload_0         
	// 10278 19192:getfield        #12  <Field azh a>
	// 10279 19195:getfield        #361 <Field int azh.bM>
	// 10280 19198:ior             
	// 10281 19199:putfield        #361 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10282 19202:aload_0         
	// 10283 19203:getfield        #12  <Field azh a>
	// 10284 19206:astore_1        
		abyte0.aK = ((azh) (abyte0)).aL ^ a.aK;
	// 10285 19207:aload_1         
	// 10286 19208:aload_1         
	// 10287 19209:getfield        #110 <Field int azh.aL>
	// 10288 19212:aload_0         
	// 10289 19213:getfield        #12  <Field azh a>
	// 10290 19216:getfield        #475 <Field int azh.aK>
	// 10291 19219:ixor            
	// 10292 19220:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10293 19223:aload_0         
	// 10294 19224:getfield        #12  <Field azh a>
	// 10295 19227:astore_1        
		abyte0.ap = ((azh) (abyte0)).aK ^ a.ap;
	// 10296 19228:aload_1         
	// 10297 19229:aload_1         
	// 10298 19230:getfield        #475 <Field int azh.aK>
	// 10299 19233:aload_0         
	// 10300 19234:getfield        #12  <Field azh a>
	// 10301 19237:getfield        #226 <Field int azh.ap>
	// 10302 19240:ixor            
	// 10303 19241:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10304 19244:aload_0         
	// 10305 19245:getfield        #12  <Field azh a>
	// 10306 19248:astore_1        
		abyte0.bj = ((azh) (abyte0)).ap ^ a.bj;
	// 10307 19249:aload_1         
	// 10308 19250:aload_1         
	// 10309 19251:getfield        #226 <Field int azh.ap>
	// 10310 19254:aload_0         
	// 10311 19255:getfield        #12  <Field azh a>
	// 10312 19258:getfield        #478 <Field int azh.bj>
	// 10313 19261:ixor            
	// 10314 19262:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10315 19265:aload_0         
	// 10316 19266:getfield        #12  <Field azh a>
	// 10317 19269:astore_1        
		abyte0.ap = ((azh) (abyte0)).k & a.aL;
	// 10318 19270:aload_1         
	// 10319 19271:aload_1         
	// 10320 19272:getfield        #164 <Field int azh.k>
	// 10321 19275:aload_0         
	// 10322 19276:getfield        #12  <Field azh a>
	// 10323 19279:getfield        #110 <Field int azh.aL>
	// 10324 19282:iand            
	// 10325 19283:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10326 19286:aload_0         
	// 10327 19287:getfield        #12  <Field azh a>
	// 10328 19290:astore_1        
		abyte0.ap = ((azh) (abyte0)).bK ^ a.ap;
	// 10329 19291:aload_1         
	// 10330 19292:aload_1         
	// 10331 19293:getfield        #292 <Field int azh.bK>
	// 10332 19296:aload_0         
	// 10333 19297:getfield        #12  <Field azh a>
	// 10334 19300:getfield        #226 <Field int azh.ap>
	// 10335 19303:ixor            
	// 10336 19304:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10337 19307:aload_0         
	// 10338 19308:getfield        #12  <Field azh a>
	// 10339 19311:astore_1        
		abyte0.bI = ((azh) (abyte0)).ap ^ a.bI;
	// 10340 19312:aload_1         
	// 10341 19313:aload_1         
	// 10342 19314:getfield        #226 <Field int azh.ap>
	// 10343 19317:aload_0         
	// 10344 19318:getfield        #12  <Field azh a>
	// 10345 19321:getfield        #65  <Field int azh.bI>
	// 10346 19324:ixor            
	// 10347 19325:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10348 19328:aload_0         
	// 10349 19329:getfield        #12  <Field azh a>
	// 10350 19332:astore_1        
		abyte0.aD = ((azh) (abyte0)).bI ^ a.aD;
	// 10351 19333:aload_1         
	// 10352 19334:aload_1         
	// 10353 19335:getfield        #65  <Field int azh.bI>
	// 10354 19338:aload_0         
	// 10355 19339:getfield        #12  <Field azh a>
	// 10356 19342:getfield        #202 <Field int azh.aD>
	// 10357 19345:ixor            
	// 10358 19346:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 10359 19349:aload_0         
	// 10360 19350:getfield        #12  <Field azh a>
	// 10361 19353:astore_1        
		abyte0.R = ((azh) (abyte0)).aD ^ a.R;
	// 10362 19354:aload_1         
	// 10363 19355:aload_1         
	// 10364 19356:getfield        #202 <Field int azh.aD>
	// 10365 19359:aload_0         
	// 10366 19360:getfield        #12  <Field azh a>
	// 10367 19363:getfield        #495 <Field int azh.R>
	// 10368 19366:ixor            
	// 10369 19367:putfield        #495 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 10370 19370:aload_0         
	// 10371 19371:getfield        #12  <Field azh a>
	// 10372 19374:astore_1        
		abyte0.aD = ((azh) (abyte0)).bF & ~a.R;
	// 10373 19375:aload_1         
	// 10374 19376:aload_1         
	// 10375 19377:getfield        #89  <Field int azh.bF>
	// 10376 19380:aload_0         
	// 10377 19381:getfield        #12  <Field azh a>
	// 10378 19384:getfield        #495 <Field int azh.R>
	// 10379 19387:iconst_m1       
	// 10380 19388:ixor            
	// 10381 19389:iand            
	// 10382 19390:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 10383 19393:aload_0         
	// 10384 19394:getfield        #12  <Field azh a>
	// 10385 19397:astore_1        
		abyte0.bI = ((azh) (abyte0)).bF & ~a.R;
	// 10386 19398:aload_1         
	// 10387 19399:aload_1         
	// 10388 19400:getfield        #89  <Field int azh.bF>
	// 10389 19403:aload_0         
	// 10390 19404:getfield        #12  <Field azh a>
	// 10391 19407:getfield        #495 <Field int azh.R>
	// 10392 19410:iconst_m1       
	// 10393 19411:ixor            
	// 10394 19412:iand            
	// 10395 19413:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10396 19416:aload_0         
	// 10397 19417:getfield        #12  <Field azh a>
	// 10398 19420:astore_1        
		abyte0.bI = ((azh) (abyte0)).cd ^ a.bI;
	// 10399 19421:aload_1         
	// 10400 19422:aload_1         
	// 10401 19423:getfield        #149 <Field int azh.cd>
	// 10402 19426:aload_0         
	// 10403 19427:getfield        #12  <Field azh a>
	// 10404 19430:getfield        #65  <Field int azh.bI>
	// 10405 19433:ixor            
	// 10406 19434:putfield        #65  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10407 19437:aload_0         
	// 10408 19438:getfield        #12  <Field azh a>
	// 10409 19441:astore_1        
		abyte0.ap = ((azh) (abyte0)).br & a.bI;
	// 10410 19442:aload_1         
	// 10411 19443:aload_1         
	// 10412 19444:getfield        #38  <Field int azh.br>
	// 10413 19447:aload_0         
	// 10414 19448:getfield        #12  <Field azh a>
	// 10415 19451:getfield        #65  <Field int azh.bI>
	// 10416 19454:iand            
	// 10417 19455:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10418 19458:aload_0         
	// 10419 19459:getfield        #12  <Field azh a>
	// 10420 19462:astore_1        
		abyte0.bK = ((azh) (abyte0)).bi & ~a.R;
	// 10421 19463:aload_1         
	// 10422 19464:aload_1         
	// 10423 19465:getfield        #406 <Field int azh.bi>
	// 10424 19468:aload_0         
	// 10425 19469:getfield        #12  <Field azh a>
	// 10426 19472:getfield        #495 <Field int azh.R>
	// 10427 19475:iconst_m1       
	// 10428 19476:ixor            
	// 10429 19477:iand            
	// 10430 19478:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10431 19481:aload_0         
	// 10432 19482:getfield        #12  <Field azh a>
	// 10433 19485:astore_1        
		abyte0.bK = ((azh) (abyte0)).br & a.bK;
	// 10434 19486:aload_1         
	// 10435 19487:aload_1         
	// 10436 19488:getfield        #38  <Field int azh.br>
	// 10437 19491:aload_0         
	// 10438 19492:getfield        #12  <Field azh a>
	// 10439 19495:getfield        #292 <Field int azh.bK>
	// 10440 19498:iand            
	// 10441 19499:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10442 19502:aload_0         
	// 10443 19503:getfield        #12  <Field azh a>
	// 10444 19506:astore_1        
		abyte0.aK = ((azh) (abyte0)).bz & ~a.R;
	// 10445 19507:aload_1         
	// 10446 19508:aload_1         
	// 10447 19509:getfield        #400 <Field int azh.bz>
	// 10448 19512:aload_0         
	// 10449 19513:getfield        #12  <Field azh a>
	// 10450 19516:getfield        #495 <Field int azh.R>
	// 10451 19519:iconst_m1       
	// 10452 19520:ixor            
	// 10453 19521:iand            
	// 10454 19522:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10455 19525:aload_0         
	// 10456 19526:getfield        #12  <Field azh a>
	// 10457 19529:astore_1        
		abyte0.aK = ((azh) (abyte0)).ci ^ a.aK;
	// 10458 19530:aload_1         
	// 10459 19531:aload_1         
	// 10460 19532:getfield        #220 <Field int azh.ci>
	// 10461 19535:aload_0         
	// 10462 19536:getfield        #12  <Field azh a>
	// 10463 19539:getfield        #475 <Field int azh.aK>
	// 10464 19542:ixor            
	// 10465 19543:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10466 19546:aload_0         
	// 10467 19547:getfield        #12  <Field azh a>
	// 10468 19550:astore_1        
		abyte0.aK = ((azh) (abyte0)).J & ~a.aK;
	// 10469 19551:aload_1         
	// 10470 19552:aload_1         
	// 10471 19553:getfield        #466 <Field int azh.J>
	// 10472 19556:aload_0         
	// 10473 19557:getfield        #12  <Field azh a>
	// 10474 19560:getfield        #475 <Field int azh.aK>
	// 10475 19563:iconst_m1       
	// 10476 19564:ixor            
	// 10477 19565:iand            
	// 10478 19566:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10479 19569:aload_0         
	// 10480 19570:getfield        #12  <Field azh a>
	// 10481 19573:astore_1        
		abyte0.az = ((azh) (abyte0)).R | a.f;
	// 10482 19574:aload_1         
	// 10483 19575:aload_1         
	// 10484 19576:getfield        #495 <Field int azh.R>
	// 10485 19579:aload_0         
	// 10486 19580:getfield        #12  <Field azh a>
	// 10487 19583:getfield        #412 <Field int azh.f>
	// 10488 19586:ior             
	// 10489 19587:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 10490 19590:aload_0         
	// 10491 19591:getfield        #12  <Field azh a>
	// 10492 19594:astore_1        
		abyte0.az = ((azh) (abyte0)).Z ^ a.az;
	// 10493 19595:aload_1         
	// 10494 19596:aload_1         
	// 10495 19597:getfield        #355 <Field int azh.Z>
	// 10496 19600:aload_0         
	// 10497 19601:getfield        #12  <Field azh a>
	// 10498 19604:getfield        #208 <Field int azh.az>
	// 10499 19607:ixor            
	// 10500 19608:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 10501 19611:aload_0         
	// 10502 19612:getfield        #12  <Field azh a>
	// 10503 19615:astore_1        
		abyte0.az = ((azh) (abyte0)).br & a.az;
	// 10504 19616:aload_1         
	// 10505 19617:aload_1         
	// 10506 19618:getfield        #38  <Field int azh.br>
	// 10507 19621:aload_0         
	// 10508 19622:getfield        #12  <Field azh a>
	// 10509 19625:getfield        #208 <Field int azh.az>
	// 10510 19628:iand            
	// 10511 19629:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 10512 19632:aload_0         
	// 10513 19633:getfield        #12  <Field azh a>
	// 10514 19636:astore_1        
		abyte0.ae = ((azh) (abyte0)).f & ~a.R;
	// 10515 19637:aload_1         
	// 10516 19638:aload_1         
	// 10517 19639:getfield        #412 <Field int azh.f>
	// 10518 19642:aload_0         
	// 10519 19643:getfield        #12  <Field azh a>
	// 10520 19646:getfield        #495 <Field int azh.R>
	// 10521 19649:iconst_m1       
	// 10522 19650:ixor            
	// 10523 19651:iand            
	// 10524 19652:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 10525 19655:aload_0         
	// 10526 19656:getfield        #12  <Field azh a>
	// 10527 19659:astore_1        
		abyte0.ae = ((azh) (abyte0)).Z ^ a.ae;
	// 10528 19660:aload_1         
	// 10529 19661:aload_1         
	// 10530 19662:getfield        #355 <Field int azh.Z>
	// 10531 19665:aload_0         
	// 10532 19666:getfield        #12  <Field azh a>
	// 10533 19669:getfield        #265 <Field int azh.ae>
	// 10534 19672:ixor            
	// 10535 19673:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 10536 19676:aload_0         
	// 10537 19677:getfield        #12  <Field azh a>
	// 10538 19680:astore_1        
		abyte0.aw = ((azh) (abyte0)).f & ~a.R;
	// 10539 19681:aload_1         
	// 10540 19682:aload_1         
	// 10541 19683:getfield        #412 <Field int azh.f>
	// 10542 19686:aload_0         
	// 10543 19687:getfield        #12  <Field azh a>
	// 10544 19690:getfield        #495 <Field int azh.R>
	// 10545 19693:iconst_m1       
	// 10546 19694:ixor            
	// 10547 19695:iand            
	// 10548 19696:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10549 19699:aload_0         
	// 10550 19700:getfield        #12  <Field azh a>
	// 10551 19703:astore_1        
		abyte0.aw = ((azh) (abyte0)).bF ^ a.aw;
	// 10552 19704:aload_1         
	// 10553 19705:aload_1         
	// 10554 19706:getfield        #89  <Field int azh.bF>
	// 10555 19709:aload_0         
	// 10556 19710:getfield        #12  <Field azh a>
	// 10557 19713:getfield        #304 <Field int azh.aw>
	// 10558 19716:ixor            
	// 10559 19717:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10560 19720:aload_0         
	// 10561 19721:getfield        #12  <Field azh a>
	// 10562 19724:astore_1        
		abyte0.aw = ((azh) (abyte0)).br & a.aw;
	// 10563 19725:aload_1         
	// 10564 19726:aload_1         
	// 10565 19727:getfield        #38  <Field int azh.br>
	// 10566 19730:aload_0         
	// 10567 19731:getfield        #12  <Field azh a>
	// 10568 19734:getfield        #304 <Field int azh.aw>
	// 10569 19737:iand            
	// 10570 19738:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10571 19741:aload_0         
	// 10572 19742:getfield        #12  <Field azh a>
	// 10573 19745:astore_1        
		abyte0.bu = ((azh) (abyte0)).f & ~a.R;
	// 10574 19746:aload_1         
	// 10575 19747:aload_1         
	// 10576 19748:getfield        #412 <Field int azh.f>
	// 10577 19751:aload_0         
	// 10578 19752:getfield        #12  <Field azh a>
	// 10579 19755:getfield        #495 <Field int azh.R>
	// 10580 19758:iconst_m1       
	// 10581 19759:ixor            
	// 10582 19760:iand            
	// 10583 19761:putfield        #268 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 10584 19764:aload_0         
	// 10585 19765:getfield        #12  <Field azh a>
	// 10586 19768:astore_1        
		abyte0.bu = ((azh) (abyte0)).cd ^ a.bu;
	// 10587 19769:aload_1         
	// 10588 19770:aload_1         
	// 10589 19771:getfield        #149 <Field int azh.cd>
	// 10590 19774:aload_0         
	// 10591 19775:getfield        #12  <Field azh a>
	// 10592 19778:getfield        #268 <Field int azh.bu>
	// 10593 19781:ixor            
	// 10594 19782:putfield        #268 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 10595 19785:aload_0         
	// 10596 19786:getfield        #12  <Field azh a>
	// 10597 19789:astore_1        
		abyte0.aw = ((azh) (abyte0)).bu ^ a.aw;
	// 10598 19790:aload_1         
	// 10599 19791:aload_1         
	// 10600 19792:getfield        #268 <Field int azh.bu>
	// 10601 19795:aload_0         
	// 10602 19796:getfield        #12  <Field azh a>
	// 10603 19799:getfield        #304 <Field int azh.aw>
	// 10604 19802:ixor            
	// 10605 19803:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10606 19806:aload_0         
	// 10607 19807:getfield        #12  <Field azh a>
	// 10608 19810:astore_1        
		abyte0.aw = ((azh) (abyte0)).J & ~a.aw;
	// 10609 19811:aload_1         
	// 10610 19812:aload_1         
	// 10611 19813:getfield        #466 <Field int azh.J>
	// 10612 19816:aload_0         
	// 10613 19817:getfield        #12  <Field azh a>
	// 10614 19820:getfield        #304 <Field int azh.aw>
	// 10615 19823:iconst_m1       
	// 10616 19824:ixor            
	// 10617 19825:iand            
	// 10618 19826:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 10619 19829:aload_0         
	// 10620 19830:getfield        #12  <Field azh a>
	// 10621 19833:astore_1        
		abyte0.bu = ((azh) (abyte0)).R | a.bi;
	// 10622 19834:aload_1         
	// 10623 19835:aload_1         
	// 10624 19836:getfield        #495 <Field int azh.R>
	// 10625 19839:aload_0         
	// 10626 19840:getfield        #12  <Field azh a>
	// 10627 19843:getfield        #406 <Field int azh.bi>
	// 10628 19846:ior             
	// 10629 19847:putfield        #268 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 10630 19850:aload_0         
	// 10631 19851:getfield        #12  <Field azh a>
	// 10632 19854:astore_1        
		abyte0.bL = ((azh) (abyte0)).br & ~a.bu;
	// 10633 19855:aload_1         
	// 10634 19856:aload_1         
	// 10635 19857:getfield        #38  <Field int azh.br>
	// 10636 19860:aload_0         
	// 10637 19861:getfield        #12  <Field azh a>
	// 10638 19864:getfield        #268 <Field int azh.bu>
	// 10639 19867:iconst_m1       
	// 10640 19868:ixor            
	// 10641 19869:iand            
	// 10642 19870:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 10643 19873:aload_0         
	// 10644 19874:getfield        #12  <Field azh a>
	// 10645 19877:astore_1        
		abyte0.ba = ((azh) (abyte0)).bz ^ a.R;
	// 10646 19878:aload_1         
	// 10647 19879:aload_1         
	// 10648 19880:getfield        #400 <Field int azh.bz>
	// 10649 19883:aload_0         
	// 10650 19884:getfield        #12  <Field azh a>
	// 10651 19887:getfield        #495 <Field int azh.R>
	// 10652 19890:ixor            
	// 10653 19891:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10654 19894:aload_0         
	// 10655 19895:getfield        #12  <Field azh a>
	// 10656 19898:astore_1        
		abyte0.bK = ((azh) (abyte0)).ba ^ a.bK;
	// 10657 19899:aload_1         
	// 10658 19900:aload_1         
	// 10659 19901:getfield        #253 <Field int azh.ba>
	// 10660 19904:aload_0         
	// 10661 19905:getfield        #12  <Field azh a>
	// 10662 19908:getfield        #292 <Field int azh.bK>
	// 10663 19911:ixor            
	// 10664 19912:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 10665 19915:aload_0         
	// 10666 19916:getfield        #12  <Field azh a>
	// 10667 19919:astore_1        
		abyte0.ba = ((azh) (abyte0)).bF & ~a.R;
	// 10668 19920:aload_1         
	// 10669 19921:aload_1         
	// 10670 19922:getfield        #89  <Field int azh.bF>
	// 10671 19925:aload_0         
	// 10672 19926:getfield        #12  <Field azh a>
	// 10673 19929:getfield        #495 <Field int azh.R>
	// 10674 19932:iconst_m1       
	// 10675 19933:ixor            
	// 10676 19934:iand            
	// 10677 19935:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10678 19938:aload_0         
	// 10679 19939:getfield        #12  <Field azh a>
	// 10680 19942:astore_1        
		abyte0.ba = ((azh) (abyte0)).f ^ a.ba;
	// 10681 19943:aload_1         
	// 10682 19944:aload_1         
	// 10683 19945:getfield        #412 <Field int azh.f>
	// 10684 19948:aload_0         
	// 10685 19949:getfield        #12  <Field azh a>
	// 10686 19952:getfield        #253 <Field int azh.ba>
	// 10687 19955:ixor            
	// 10688 19956:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10689 19959:aload_0         
	// 10690 19960:getfield        #12  <Field azh a>
	// 10691 19963:astore_1        
		abyte0.ba = ((azh) (abyte0)).ba | a.br;
	// 10692 19964:aload_1         
	// 10693 19965:aload_1         
	// 10694 19966:getfield        #253 <Field int azh.ba>
	// 10695 19969:aload_0         
	// 10696 19970:getfield        #12  <Field azh a>
	// 10697 19973:getfield        #38  <Field int azh.br>
	// 10698 19976:ior             
	// 10699 19977:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10700 19980:aload_0         
	// 10701 19981:getfield        #12  <Field azh a>
	// 10702 19984:astore_1        
		abyte0.ba = ((azh) (abyte0)).ae ^ a.ba;
	// 10703 19985:aload_1         
	// 10704 19986:aload_1         
	// 10705 19987:getfield        #265 <Field int azh.ae>
	// 10706 19990:aload_0         
	// 10707 19991:getfield        #12  <Field azh a>
	// 10708 19994:getfield        #253 <Field int azh.ba>
	// 10709 19997:ixor            
	// 10710 19998:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10711 20001:aload_0         
	// 10712 20002:getfield        #12  <Field azh a>
	// 10713 20005:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bo ^ a.R;
	// 10714 20006:aload_1         
	// 10715 20007:aload_1         
	// 10716 20008:getfield        #310 <Field int azh.bo>
	// 10717 20011:aload_0         
	// 10718 20012:getfield        #12  <Field azh a>
	// 10719 20015:getfield        #495 <Field int azh.R>
	// 10720 20018:ixor            
	// 10721 20019:putfield        #259 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10722 20022:aload_0         
	// 10723 20023:getfield        #12  <Field azh a>
	// 10724 20026:astore_1        
		abyte0.bJ = ((azh) (abyte0)).br & a.bJ;
	// 10725 20027:aload_1         
	// 10726 20028:aload_1         
	// 10727 20029:getfield        #38  <Field int azh.br>
	// 10728 20032:aload_0         
	// 10729 20033:getfield        #12  <Field azh a>
	// 10730 20036:getfield        #259 <Field int azh.bJ>
	// 10731 20039:iand            
	// 10732 20040:putfield        #259 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10733 20043:aload_0         
	// 10734 20044:getfield        #12  <Field azh a>
	// 10735 20047:astore_1        
		abyte0.bJ = ((azh) (abyte0)).aD ^ a.bJ;
	// 10736 20048:aload_1         
	// 10737 20049:aload_1         
	// 10738 20050:getfield        #202 <Field int azh.aD>
	// 10739 20053:aload_0         
	// 10740 20054:getfield        #12  <Field azh a>
	// 10741 20057:getfield        #259 <Field int azh.bJ>
	// 10742 20060:ixor            
	// 10743 20061:putfield        #259 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10744 20064:aload_0         
	// 10745 20065:getfield        #12  <Field azh a>
	// 10746 20068:astore_1        
		abyte0.bJ = ((azh) (abyte0)).J & ~a.bJ;
	// 10747 20069:aload_1         
	// 10748 20070:aload_1         
	// 10749 20071:getfield        #466 <Field int azh.J>
	// 10750 20074:aload_0         
	// 10751 20075:getfield        #12  <Field azh a>
	// 10752 20078:getfield        #259 <Field int azh.bJ>
	// 10753 20081:iconst_m1       
	// 10754 20082:ixor            
	// 10755 20083:iand            
	// 10756 20084:putfield        #259 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10757 20087:aload_0         
	// 10758 20088:getfield        #12  <Field azh a>
	// 10759 20091:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ba ^ a.bJ;
	// 10760 20092:aload_1         
	// 10761 20093:aload_1         
	// 10762 20094:getfield        #253 <Field int azh.ba>
	// 10763 20097:aload_0         
	// 10764 20098:getfield        #12  <Field azh a>
	// 10765 20101:getfield        #259 <Field int azh.bJ>
	// 10766 20104:ixor            
	// 10767 20105:putfield        #259 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10768 20108:aload_0         
	// 10769 20109:getfield        #12  <Field azh a>
	// 10770 20112:astore_1        
		abyte0.ba = ((azh) (abyte0)).R | a.bo;
	// 10771 20113:aload_1         
	// 10772 20114:aload_1         
	// 10773 20115:getfield        #495 <Field int azh.R>
	// 10774 20118:aload_0         
	// 10775 20119:getfield        #12  <Field azh a>
	// 10776 20122:getfield        #310 <Field int azh.bo>
	// 10777 20125:ior             
	// 10778 20126:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10779 20129:aload_0         
	// 10780 20130:getfield        #12  <Field azh a>
	// 10781 20133:astore_1        
		abyte0.ba = ((azh) (abyte0)).br & a.ba;
	// 10782 20134:aload_1         
	// 10783 20135:aload_1         
	// 10784 20136:getfield        #38  <Field int azh.br>
	// 10785 20139:aload_0         
	// 10786 20140:getfield        #12  <Field azh a>
	// 10787 20143:getfield        #253 <Field int azh.ba>
	// 10788 20146:iand            
	// 10789 20147:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10790 20150:aload_0         
	// 10791 20151:getfield        #12  <Field azh a>
	// 10792 20154:astore_1        
		abyte0.ba = ((azh) (abyte0)).bI ^ a.ba;
	// 10793 20155:aload_1         
	// 10794 20156:aload_1         
	// 10795 20157:getfield        #65  <Field int azh.bI>
	// 10796 20160:aload_0         
	// 10797 20161:getfield        #12  <Field azh a>
	// 10798 20164:getfield        #253 <Field int azh.ba>
	// 10799 20167:ixor            
	// 10800 20168:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10801 20171:aload_0         
	// 10802 20172:getfield        #12  <Field azh a>
	// 10803 20175:astore_1        
		abyte0.aK = ((azh) (abyte0)).ba ^ a.aK;
	// 10804 20176:aload_1         
	// 10805 20177:aload_1         
	// 10806 20178:getfield        #253 <Field int azh.ba>
	// 10807 20181:aload_0         
	// 10808 20182:getfield        #12  <Field azh a>
	// 10809 20185:getfield        #475 <Field int azh.aK>
	// 10810 20188:ixor            
	// 10811 20189:putfield        #475 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10812 20192:aload_0         
	// 10813 20193:getfield        #12  <Field azh a>
	// 10814 20196:astore_1        
		abyte0.ba = ((azh) (abyte0)).f & ~a.R;
	// 10815 20197:aload_1         
	// 10816 20198:aload_1         
	// 10817 20199:getfield        #412 <Field int azh.f>
	// 10818 20202:aload_0         
	// 10819 20203:getfield        #12  <Field azh a>
	// 10820 20206:getfield        #495 <Field int azh.R>
	// 10821 20209:iconst_m1       
	// 10822 20210:ixor            
	// 10823 20211:iand            
	// 10824 20212:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10825 20215:aload_0         
	// 10826 20216:getfield        #12  <Field azh a>
	// 10827 20219:astore_1        
		abyte0.ba = ((azh) (abyte0)).bo ^ a.ba;
	// 10828 20220:aload_1         
	// 10829 20221:aload_1         
	// 10830 20222:getfield        #310 <Field int azh.bo>
	// 10831 20225:aload_0         
	// 10832 20226:getfield        #12  <Field azh a>
	// 10833 20229:getfield        #253 <Field int azh.ba>
	// 10834 20232:ixor            
	// 10835 20233:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10836 20236:aload_0         
	// 10837 20237:getfield        #12  <Field azh a>
	// 10838 20240:astore_1        
		abyte0.ba = ((azh) (abyte0)).br & ~a.ba;
	// 10839 20241:aload_1         
	// 10840 20242:aload_1         
	// 10841 20243:getfield        #38  <Field int azh.br>
	// 10842 20246:aload_0         
	// 10843 20247:getfield        #12  <Field azh a>
	// 10844 20250:getfield        #253 <Field int azh.ba>
	// 10845 20253:iconst_m1       
	// 10846 20254:ixor            
	// 10847 20255:iand            
	// 10848 20256:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 10849 20259:aload_0         
	// 10850 20260:getfield        #12  <Field azh a>
	// 10851 20263:astore_1        
		abyte0.bz = ((azh) (abyte0)).bz & ~a.R;
	// 10852 20264:aload_1         
	// 10853 20265:aload_1         
	// 10854 20266:getfield        #400 <Field int azh.bz>
	// 10855 20269:aload_0         
	// 10856 20270:getfield        #12  <Field azh a>
	// 10857 20273:getfield        #495 <Field int azh.R>
	// 10858 20276:iconst_m1       
	// 10859 20277:ixor            
	// 10860 20278:iand            
	// 10861 20279:putfield        #400 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 10862 20282:aload_0         
	// 10863 20283:getfield        #12  <Field azh a>
	// 10864 20286:astore_1        
		abyte0.bz = ((azh) (abyte0)).bF ^ a.bz;
	// 10865 20287:aload_1         
	// 10866 20288:aload_1         
	// 10867 20289:getfield        #89  <Field int azh.bF>
	// 10868 20292:aload_0         
	// 10869 20293:getfield        #12  <Field azh a>
	// 10870 20296:getfield        #400 <Field int azh.bz>
	// 10871 20299:ixor            
	// 10872 20300:putfield        #400 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 10873 20303:aload_0         
	// 10874 20304:getfield        #12  <Field azh a>
	// 10875 20307:astore_1        
		abyte0.bF = ((azh) (abyte0)).R | a.f;
	// 10876 20308:aload_1         
	// 10877 20309:aload_1         
	// 10878 20310:getfield        #495 <Field int azh.R>
	// 10879 20313:aload_0         
	// 10880 20314:getfield        #12  <Field azh a>
	// 10881 20317:getfield        #412 <Field int azh.f>
	// 10882 20320:ior             
	// 10883 20321:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10884 20324:aload_0         
	// 10885 20325:getfield        #12  <Field azh a>
	// 10886 20328:astore_1        
		abyte0.bF = ((azh) (abyte0)).bi ^ a.bF;
	// 10887 20329:aload_1         
	// 10888 20330:aload_1         
	// 10889 20331:getfield        #406 <Field int azh.bi>
	// 10890 20334:aload_0         
	// 10891 20335:getfield        #12  <Field azh a>
	// 10892 20338:getfield        #89  <Field int azh.bF>
	// 10893 20341:ixor            
	// 10894 20342:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10895 20345:aload_0         
	// 10896 20346:getfield        #12  <Field azh a>
	// 10897 20349:astore_1        
		abyte0.bF = ((azh) (abyte0)).bF | a.br;
	// 10898 20350:aload_1         
	// 10899 20351:aload_1         
	// 10900 20352:getfield        #89  <Field int azh.bF>
	// 10901 20355:aload_0         
	// 10902 20356:getfield        #12  <Field azh a>
	// 10903 20359:getfield        #38  <Field int azh.br>
	// 10904 20362:ior             
	// 10905 20363:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10906 20366:aload_0         
	// 10907 20367:getfield        #12  <Field azh a>
	// 10908 20370:astore_1        
		abyte0.bF = ((azh) (abyte0)).bu ^ a.bF;
	// 10909 20371:aload_1         
	// 10910 20372:aload_1         
	// 10911 20373:getfield        #268 <Field int azh.bu>
	// 10912 20376:aload_0         
	// 10913 20377:getfield        #12  <Field azh a>
	// 10914 20380:getfield        #89  <Field int azh.bF>
	// 10915 20383:ixor            
	// 10916 20384:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10917 20387:aload_0         
	// 10918 20388:getfield        #12  <Field azh a>
	// 10919 20391:astore_1        
		abyte0.bF = ((azh) (abyte0)).J & a.bF;
	// 10920 20392:aload_1         
	// 10921 20393:aload_1         
	// 10922 20394:getfield        #466 <Field int azh.J>
	// 10923 20397:aload_0         
	// 10924 20398:getfield        #12  <Field azh a>
	// 10925 20401:getfield        #89  <Field int azh.bF>
	// 10926 20404:iand            
	// 10927 20405:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10928 20408:aload_0         
	// 10929 20409:getfield        #12  <Field azh a>
	// 10930 20412:astore_1        
		abyte0.bF = ((azh) (abyte0)).bK ^ a.bF;
	// 10931 20413:aload_1         
	// 10932 20414:aload_1         
	// 10933 20415:getfield        #292 <Field int azh.bK>
	// 10934 20418:aload_0         
	// 10935 20419:getfield        #12  <Field azh a>
	// 10936 20422:getfield        #89  <Field int azh.bF>
	// 10937 20425:ixor            
	// 10938 20426:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10939 20429:aload_0         
	// 10940 20430:getfield        #12  <Field azh a>
	// 10941 20433:astore_1        
		abyte0.bF = ((azh) (abyte0)).B & ~a.bF;
	// 10942 20434:aload_1         
	// 10943 20435:aload_1         
	// 10944 20436:getfield        #376 <Field int azh.B>
	// 10945 20439:aload_0         
	// 10946 20440:getfield        #12  <Field azh a>
	// 10947 20443:getfield        #89  <Field int azh.bF>
	// 10948 20446:iconst_m1       
	// 10949 20447:ixor            
	// 10950 20448:iand            
	// 10951 20449:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 10952 20452:aload_0         
	// 10953 20453:getfield        #12  <Field azh a>
	// 10954 20456:astore_1        
		abyte0.cd = ((azh) (abyte0)).R | a.cd;
	// 10955 20457:aload_1         
	// 10956 20458:aload_1         
	// 10957 20459:getfield        #495 <Field int azh.R>
	// 10958 20462:aload_0         
	// 10959 20463:getfield        #12  <Field azh a>
	// 10960 20466:getfield        #149 <Field int azh.cd>
	// 10961 20469:ior             
	// 10962 20470:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 10963 20473:aload_0         
	// 10964 20474:getfield        #12  <Field azh a>
	// 10965 20477:astore_1        
		abyte0.cd = ((azh) (abyte0)).bi ^ a.cd;
	// 10966 20478:aload_1         
	// 10967 20479:aload_1         
	// 10968 20480:getfield        #406 <Field int azh.bi>
	// 10969 20483:aload_0         
	// 10970 20484:getfield        #12  <Field azh a>
	// 10971 20487:getfield        #149 <Field int azh.cd>
	// 10972 20490:ixor            
	// 10973 20491:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 10974 20494:aload_0         
	// 10975 20495:getfield        #12  <Field azh a>
	// 10976 20498:astore_1        
		abyte0.ap = ((azh) (abyte0)).cd ^ a.ap;
	// 10977 20499:aload_1         
	// 10978 20500:aload_1         
	// 10979 20501:getfield        #149 <Field int azh.cd>
	// 10980 20504:aload_0         
	// 10981 20505:getfield        #12  <Field azh a>
	// 10982 20508:getfield        #226 <Field int azh.ap>
	// 10983 20511:ixor            
	// 10984 20512:putfield        #226 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10985 20515:aload_0         
	// 10986 20516:getfield        #12  <Field azh a>
	// 10987 20519:astore_1        
		abyte0.cd = ((azh) (abyte0)).ci ^ a.R;
	// 10988 20520:aload_1         
	// 10989 20521:aload_1         
	// 10990 20522:getfield        #220 <Field int azh.ci>
	// 10991 20525:aload_0         
	// 10992 20526:getfield        #12  <Field azh a>
	// 10993 20529:getfield        #495 <Field int azh.R>
	// 10994 20532:ixor            
	// 10995 20533:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 10996 20536:aload_0         
	// 10997 20537:getfield        #12  <Field azh a>
	// 10998 20540:astore_1        
		abyte0.bK = ((azh) (abyte0)).br & a.cd;
	// 10999 20541:aload_1         
	// 11000 20542:aload_1         
	// 11001 20543:getfield        #38  <Field int azh.br>
	// 11002 20546:aload_0         
	// 11003 20547:getfield        #12  <Field azh a>
	// 11004 20550:getfield        #149 <Field int azh.cd>
	// 11005 20553:iand            
	// 11006 20554:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 11007 20557:aload_0         
	// 11008 20558:getfield        #12  <Field azh a>
	// 11009 20561:astore_1        
		abyte0.bK = ((azh) (abyte0)).ae ^ a.bK;
	// 11010 20562:aload_1         
	// 11011 20563:aload_1         
	// 11012 20564:getfield        #265 <Field int azh.ae>
	// 11013 20567:aload_0         
	// 11014 20568:getfield        #12  <Field azh a>
	// 11015 20571:getfield        #292 <Field int azh.bK>
	// 11016 20574:ixor            
	// 11017 20575:putfield        #292 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 11018 20578:aload_0         
	// 11019 20579:getfield        #12  <Field azh a>
	// 11020 20582:astore_1        
		abyte0.ae = ((azh) (abyte0)).cd ^ a.br;
	// 11021 20583:aload_1         
	// 11022 20584:aload_1         
	// 11023 20585:getfield        #149 <Field int azh.cd>
	// 11024 20588:aload_0         
	// 11025 20589:getfield        #12  <Field azh a>
	// 11026 20592:getfield        #38  <Field int azh.br>
	// 11027 20595:ixor            
	// 11028 20596:putfield        #265 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 11029 20599:aload_0         
	// 11030 20600:getfield        #12  <Field azh a>
	// 11031 20603:astore_1        
		abyte0.aw = ((azh) (abyte0)).ae ^ a.aw;
	// 11032 20604:aload_1         
	// 11033 20605:aload_1         
	// 11034 20606:getfield        #265 <Field int azh.ae>
	// 11035 20609:aload_0         
	// 11036 20610:getfield        #12  <Field azh a>
	// 11037 20613:getfield        #304 <Field int azh.aw>
	// 11038 20616:ixor            
	// 11039 20617:putfield        #304 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 11040 20620:aload_0         
	// 11041 20621:getfield        #12  <Field azh a>
	// 11042 20624:astore_1        
		abyte0.bF = ((azh) (abyte0)).aw ^ a.bF;
	// 11043 20625:aload_1         
	// 11044 20626:aload_1         
	// 11045 20627:getfield        #304 <Field int azh.aw>
	// 11046 20630:aload_0         
	// 11047 20631:getfield        #12  <Field azh a>
	// 11048 20634:getfield        #89  <Field int azh.bF>
	// 11049 20637:ixor            
	// 11050 20638:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 11051 20641:aload_0         
	// 11052 20642:getfield        #12  <Field azh a>
	// 11053 20645:astore_1        
		abyte0.bF = ((azh) (abyte0)).bF ^ a.aI;
	// 11054 20646:aload_1         
	// 11055 20647:aload_1         
	// 11056 20648:getfield        #89  <Field int azh.bF>
	// 11057 20651:aload_0         
	// 11058 20652:getfield        #12  <Field azh a>
	// 11059 20655:getfield        #486 <Field int azh.aI>
	// 11060 20658:ixor            
	// 11061 20659:putfield        #89  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 11062 20662:aload_0         
	// 11063 20663:getfield        #12  <Field azh a>
	// 11064 20666:astore_1        
		abyte0.cd = ((azh) (abyte0)).br & ~a.cd;
	// 11065 20667:aload_1         
	// 11066 20668:aload_1         
	// 11067 20669:getfield        #38  <Field int azh.br>
	// 11068 20672:aload_0         
	// 11069 20673:getfield        #12  <Field azh a>
	// 11070 20676:getfield        #149 <Field int azh.cd>
	// 11071 20679:iconst_m1       
	// 11072 20680:ixor            
	// 11073 20681:iand            
	// 11074 20682:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11075 20685:aload_0         
	// 11076 20686:getfield        #12  <Field azh a>
	// 11077 20689:astore_1        
		abyte0.cd = ((azh) (abyte0)).bz ^ a.cd;
	// 11078 20690:aload_1         
	// 11079 20691:aload_1         
	// 11080 20692:getfield        #400 <Field int azh.bz>
	// 11081 20695:aload_0         
	// 11082 20696:getfield        #12  <Field azh a>
	// 11083 20699:getfield        #149 <Field int azh.cd>
	// 11084 20702:ixor            
	// 11085 20703:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11086 20706:aload_0         
	// 11087 20707:getfield        #12  <Field azh a>
	// 11088 20710:astore_1        
		abyte0.cd = ((azh) (abyte0)).J & a.cd;
	// 11089 20711:aload_1         
	// 11090 20712:aload_1         
	// 11091 20713:getfield        #466 <Field int azh.J>
	// 11092 20716:aload_0         
	// 11093 20717:getfield        #12  <Field azh a>
	// 11094 20720:getfield        #149 <Field int azh.cd>
	// 11095 20723:iand            
	// 11096 20724:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11097 20727:aload_0         
	// 11098 20728:getfield        #12  <Field azh a>
	// 11099 20731:astore_1        
		abyte0.cd = ((azh) (abyte0)).ci ^ a.cd;
	// 11100 20732:aload_1         
	// 11101 20733:aload_1         
	// 11102 20734:getfield        #220 <Field int azh.ci>
	// 11103 20737:aload_0         
	// 11104 20738:getfield        #12  <Field azh a>
	// 11105 20741:getfield        #149 <Field int azh.cd>
	// 11106 20744:ixor            
	// 11107 20745:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11108 20748:aload_0         
	// 11109 20749:getfield        #12  <Field azh a>
	// 11110 20752:astore_1        
		abyte0.cd = ((azh) (abyte0)).B & ~a.cd;
	// 11111 20753:aload_1         
	// 11112 20754:aload_1         
	// 11113 20755:getfield        #376 <Field int azh.B>
	// 11114 20758:aload_0         
	// 11115 20759:getfield        #12  <Field azh a>
	// 11116 20762:getfield        #149 <Field int azh.cd>
	// 11117 20765:iconst_m1       
	// 11118 20766:ixor            
	// 11119 20767:iand            
	// 11120 20768:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11121 20771:aload_0         
	// 11122 20772:getfield        #12  <Field azh a>
	// 11123 20775:astore_1        
		abyte0.ci = ((azh) (abyte0)).f & ~a.R;
	// 11124 20776:aload_1         
	// 11125 20777:aload_1         
	// 11126 20778:getfield        #412 <Field int azh.f>
	// 11127 20781:aload_0         
	// 11128 20782:getfield        #12  <Field azh a>
	// 11129 20785:getfield        #495 <Field int azh.R>
	// 11130 20788:iconst_m1       
	// 11131 20789:ixor            
	// 11132 20790:iand            
	// 11133 20791:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11134 20794:aload_0         
	// 11135 20795:getfield        #12  <Field azh a>
	// 11136 20798:astore_1        
		abyte0.ci = ((azh) (abyte0)).f ^ a.ci;
	// 11137 20799:aload_1         
	// 11138 20800:aload_1         
	// 11139 20801:getfield        #412 <Field int azh.f>
	// 11140 20804:aload_0         
	// 11141 20805:getfield        #12  <Field azh a>
	// 11142 20808:getfield        #220 <Field int azh.ci>
	// 11143 20811:ixor            
	// 11144 20812:putfield        #220 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11145 20815:aload_0         
	// 11146 20816:getfield        #12  <Field azh a>
	// 11147 20819:astore_1        
		abyte0.ba = ((azh) (abyte0)).ci ^ a.ba;
	// 11148 20820:aload_1         
	// 11149 20821:aload_1         
	// 11150 20822:getfield        #220 <Field int azh.ci>
	// 11151 20825:aload_0         
	// 11152 20826:getfield        #12  <Field azh a>
	// 11153 20829:getfield        #253 <Field int azh.ba>
	// 11154 20832:ixor            
	// 11155 20833:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11156 20836:aload_0         
	// 11157 20837:getfield        #12  <Field azh a>
	// 11158 20840:astore_1        
		abyte0.ba = ((azh) (abyte0)).J & ~a.ba;
	// 11159 20841:aload_1         
	// 11160 20842:aload_1         
	// 11161 20843:getfield        #466 <Field int azh.J>
	// 11162 20846:aload_0         
	// 11163 20847:getfield        #12  <Field azh a>
	// 11164 20850:getfield        #253 <Field int azh.ba>
	// 11165 20853:iconst_m1       
	// 11166 20854:ixor            
	// 11167 20855:iand            
	// 11168 20856:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11169 20859:aload_0         
	// 11170 20860:getfield        #12  <Field azh a>
	// 11171 20863:astore_1        
		abyte0.ba = ((azh) (abyte0)).ap ^ a.ba;
	// 11172 20864:aload_1         
	// 11173 20865:aload_1         
	// 11174 20866:getfield        #226 <Field int azh.ap>
	// 11175 20869:aload_0         
	// 11176 20870:getfield        #12  <Field azh a>
	// 11177 20873:getfield        #253 <Field int azh.ba>
	// 11178 20876:ixor            
	// 11179 20877:putfield        #253 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11180 20880:aload_0         
	// 11181 20881:getfield        #12  <Field azh a>
	// 11182 20884:astore_1        
		abyte0.cd = ((azh) (abyte0)).ba ^ a.cd;
	// 11183 20885:aload_1         
	// 11184 20886:aload_1         
	// 11185 20887:getfield        #253 <Field int azh.ba>
	// 11186 20890:aload_0         
	// 11187 20891:getfield        #12  <Field azh a>
	// 11188 20894:getfield        #149 <Field int azh.cd>
	// 11189 20897:ixor            
	// 11190 20898:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11191 20901:aload_0         
	// 11192 20902:getfield        #12  <Field azh a>
	// 11193 20905:astore_1        
		abyte0.U = ((azh) (abyte0)).cd ^ a.U;
	// 11194 20906:aload_1         
	// 11195 20907:aload_1         
	// 11196 20908:getfield        #149 <Field int azh.cd>
	// 11197 20911:aload_0         
	// 11198 20912:getfield        #12  <Field azh a>
	// 11199 20915:getfield        #370 <Field int azh.U>
	// 11200 20918:ixor            
	// 11201 20919:putfield        #370 <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 11202 20922:aload_0         
	// 11203 20923:getfield        #12  <Field azh a>
	// 11204 20926:astore_1        
		abyte0.cd = ((azh) (abyte0)).R | a.Z;
	// 11205 20927:aload_1         
	// 11206 20928:aload_1         
	// 11207 20929:getfield        #495 <Field int azh.R>
	// 11208 20932:aload_0         
	// 11209 20933:getfield        #12  <Field azh a>
	// 11210 20936:getfield        #355 <Field int azh.Z>
	// 11211 20939:ior             
	// 11212 20940:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11213 20943:aload_0         
	// 11214 20944:getfield        #12  <Field azh a>
	// 11215 20947:astore_1        
		abyte0.cd = ((azh) (abyte0)).bi ^ a.cd;
	// 11216 20948:aload_1         
	// 11217 20949:aload_1         
	// 11218 20950:getfield        #406 <Field int azh.bi>
	// 11219 20953:aload_0         
	// 11220 20954:getfield        #12  <Field azh a>
	// 11221 20957:getfield        #149 <Field int azh.cd>
	// 11222 20960:ixor            
	// 11223 20961:putfield        #149 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11224 20964:aload_0         
	// 11225 20965:getfield        #12  <Field azh a>
	// 11226 20968:astore_1        
		abyte0.az = ((azh) (abyte0)).cd ^ a.az;
	// 11227 20969:aload_1         
	// 11228 20970:aload_1         
	// 11229 20971:getfield        #149 <Field int azh.cd>
	// 11230 20974:aload_0         
	// 11231 20975:getfield        #12  <Field azh a>
	// 11232 20978:getfield        #208 <Field int azh.az>
	// 11233 20981:ixor            
	// 11234 20982:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 11235 20985:aload_0         
	// 11236 20986:getfield        #12  <Field azh a>
	// 11237 20989:astore_1        
		abyte0.az = ((azh) (abyte0)).J & ~a.az;
	// 11238 20990:aload_1         
	// 11239 20991:aload_1         
	// 11240 20992:getfield        #466 <Field int azh.J>
	// 11241 20995:aload_0         
	// 11242 20996:getfield        #12  <Field azh a>
	// 11243 20999:getfield        #208 <Field int azh.az>
	// 11244 21002:iconst_m1       
	// 11245 21003:ixor            
	// 11246 21004:iand            
	// 11247 21005:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 11248 21008:aload_0         
	// 11249 21009:getfield        #12  <Field azh a>
	// 11250 21012:astore_1        
		abyte0.az = ((azh) (abyte0)).bK ^ a.az;
	// 11251 21013:aload_1         
	// 11252 21014:aload_1         
	// 11253 21015:getfield        #292 <Field int azh.bK>
	// 11254 21018:aload_0         
	// 11255 21019:getfield        #12  <Field azh a>
	// 11256 21022:getfield        #208 <Field int azh.az>
	// 11257 21025:ixor            
	// 11258 21026:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 11259 21029:aload_0         
	// 11260 21030:getfield        #12  <Field azh a>
	// 11261 21033:astore_1        
		abyte0.az = ((azh) (abyte0)).az & a.B;
	// 11262 21034:aload_1         
	// 11263 21035:aload_1         
	// 11264 21036:getfield        #208 <Field int azh.az>
	// 11265 21039:aload_0         
	// 11266 21040:getfield        #12  <Field azh a>
	// 11267 21043:getfield        #376 <Field int azh.B>
	// 11268 21046:iand            
	// 11269 21047:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 11270 21050:aload_0         
	// 11271 21051:getfield        #12  <Field azh a>
	// 11272 21054:astore_1        
		abyte0.az = ((azh) (abyte0)).bJ ^ a.az;
	// 11273 21055:aload_1         
	// 11274 21056:aload_1         
	// 11275 21057:getfield        #259 <Field int azh.bJ>
	// 11276 21060:aload_0         
	// 11277 21061:getfield        #12  <Field azh a>
	// 11278 21064:getfield        #208 <Field int azh.az>
	// 11279 21067:ixor            
	// 11280 21068:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 11281 21071:aload_0         
	// 11282 21072:getfield        #12  <Field azh a>
	// 11283 21075:astore_1        
		abyte0.g = ((azh) (abyte0)).az ^ a.g;
	// 11284 21076:aload_1         
	// 11285 21077:aload_1         
	// 11286 21078:getfield        #208 <Field int azh.az>
	// 11287 21081:aload_0         
	// 11288 21082:getfield        #12  <Field azh a>
	// 11289 21085:getfield        #116 <Field int azh.g>
	// 11290 21088:ixor            
	// 11291 21089:putfield        #116 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 11292 21092:aload_0         
	// 11293 21093:getfield        #12  <Field azh a>
	// 11294 21096:astore_1        
		abyte0.az = ((azh) (abyte0)).R | a.f;
	// 11295 21097:aload_1         
	// 11296 21098:aload_1         
	// 11297 21099:getfield        #495 <Field int azh.R>
	// 11298 21102:aload_0         
	// 11299 21103:getfield        #12  <Field azh a>
	// 11300 21106:getfield        #412 <Field int azh.f>
	// 11301 21109:ior             
	// 11302 21110:putfield        #208 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 11303 21113:aload_0         
	// 11304 21114:getfield        #12  <Field azh a>
	// 11305 21117:astore_1        
		abyte0.bL = ((azh) (abyte0)).az ^ a.bL;
	// 11306 21118:aload_1         
	// 11307 21119:aload_1         
	// 11308 21120:getfield        #208 <Field int azh.az>
	// 11309 21123:aload_0         
	// 11310 21124:getfield        #12  <Field azh a>
	// 11311 21127:getfield        #86  <Field int azh.bL>
	// 11312 21130:ixor            
	// 11313 21131:putfield        #86  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 11314 21134:aload_0         
	// 11315 21135:getfield        #12  <Field azh a>
	// 11316 21138:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & ~a.R;
	// 11317 21139:aload_1         
	// 11318 21140:aload_1         
	// 11319 21141:getfield        #310 <Field int azh.bo>
	// 11320 21144:aload_0         
	// 11321 21145:getfield        #12  <Field azh a>
	// 11322 21148:getfield        #495 <Field int azh.R>
	// 11323 21151:iconst_m1       
	// 11324 21152:ixor            
	// 11325 21153:iand            
	// 11326 21154:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11327 21157:aload_0         
	// 11328 21158:getfield        #12  <Field azh a>
	// 11329 21161:astore_1        
		abyte0.bo = ((azh) (abyte0)).J & a.bo;
	// 11330 21162:aload_1         
	// 11331 21163:aload_1         
	// 11332 21164:getfield        #466 <Field int azh.J>
	// 11333 21167:aload_0         
	// 11334 21168:getfield        #12  <Field azh a>
	// 11335 21171:getfield        #310 <Field int azh.bo>
	// 11336 21174:iand            
	// 11337 21175:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11338 21178:aload_0         
	// 11339 21179:getfield        #12  <Field azh a>
	// 11340 21182:astore_1        
		abyte0.bo = ((azh) (abyte0)).bL ^ a.bo;
	// 11341 21183:aload_1         
	// 11342 21184:aload_1         
	// 11343 21185:getfield        #86  <Field int azh.bL>
	// 11344 21188:aload_0         
	// 11345 21189:getfield        #12  <Field azh a>
	// 11346 21192:getfield        #310 <Field int azh.bo>
	// 11347 21195:ixor            
	// 11348 21196:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11349 21199:aload_0         
	// 11350 21200:getfield        #12  <Field azh a>
	// 11351 21203:astore_1        
		abyte0.bo = ((azh) (abyte0)).B & a.bo;
	// 11352 21204:aload_1         
	// 11353 21205:aload_1         
	// 11354 21206:getfield        #376 <Field int azh.B>
	// 11355 21209:aload_0         
	// 11356 21210:getfield        #12  <Field azh a>
	// 11357 21213:getfield        #310 <Field int azh.bo>
	// 11358 21216:iand            
	// 11359 21217:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11360 21220:aload_0         
	// 11361 21221:getfield        #12  <Field azh a>
	// 11362 21224:astore_1        
		abyte0.bo = ((azh) (abyte0)).aK ^ a.bo;
	// 11363 21225:aload_1         
	// 11364 21226:aload_1         
	// 11365 21227:getfield        #475 <Field int azh.aK>
	// 11366 21230:aload_0         
	// 11367 21231:getfield        #12  <Field azh a>
	// 11368 21234:getfield        #310 <Field int azh.bo>
	// 11369 21237:ixor            
	// 11370 21238:putfield        #310 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11371 21241:aload_0         
	// 11372 21242:getfield        #12  <Field azh a>
	// 11373 21245:astore_1        
		abyte0.u = ((azh) (abyte0)).bo ^ a.u;
	// 11374 21246:aload_1         
	// 11375 21247:aload_1         
	// 11376 21248:getfield        #310 <Field int azh.bo>
	// 11377 21251:aload_0         
	// 11378 21252:getfield        #12  <Field azh a>
	// 11379 21255:getfield        #498 <Field int azh.u>
	// 11380 21258:ixor            
	// 11381 21259:putfield        #498 <Field int azh.u>
		abyte0 = ((byte []) (a));
	// 11382 21262:aload_0         
	// 11383 21263:getfield        #12  <Field azh a>
	// 11384 21266:astore_1        
		abyte0.aL = ((azh) (abyte0)).A & a.aL;
	// 11385 21267:aload_1         
	// 11386 21268:aload_1         
	// 11387 21269:getfield        #80  <Field int azh.A>
	// 11388 21272:aload_0         
	// 11389 21273:getfield        #12  <Field azh a>
	// 11390 21276:getfield        #110 <Field int azh.aL>
	// 11391 21279:iand            
	// 11392 21280:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 11393 21283:aload_0         
	// 11394 21284:getfield        #12  <Field azh a>
	// 11395 21287:astore_1        
		abyte0.aL = ((azh) (abyte0)).cb ^ a.aL;
	// 11396 21288:aload_1         
	// 11397 21289:aload_1         
	// 11398 21290:getfield        #158 <Field int azh.cb>
	// 11399 21293:aload_0         
	// 11400 21294:getfield        #12  <Field azh a>
	// 11401 21297:getfield        #110 <Field int azh.aL>
	// 11402 21300:ixor            
	// 11403 21301:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 11404 21304:aload_0         
	// 11405 21305:getfield        #12  <Field azh a>
	// 11406 21308:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aL ^ a.aZ;
	// 11407 21309:aload_1         
	// 11408 21310:aload_1         
	// 11409 21311:getfield        #110 <Field int azh.aL>
	// 11410 21314:aload_0         
	// 11411 21315:getfield        #12  <Field azh a>
	// 11412 21318:getfield        #445 <Field int azh.aZ>
	// 11413 21321:ixor            
	// 11414 21322:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 11415 21325:aload_0         
	// 11416 21326:getfield        #12  <Field azh a>
	// 11417 21329:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bb | a.aZ;
	// 11418 21330:aload_1         
	// 11419 21331:aload_1         
	// 11420 21332:getfield        #489 <Field int azh.bb>
	// 11421 21335:aload_0         
	// 11422 21336:getfield        #12  <Field azh a>
	// 11423 21339:getfield        #445 <Field int azh.aZ>
	// 11424 21342:ior             
	// 11425 21343:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 11426 21346:aload_0         
	// 11427 21347:getfield        #12  <Field azh a>
	// 11428 21350:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bj ^ a.aZ;
	// 11429 21351:aload_1         
	// 11430 21352:aload_1         
	// 11431 21353:getfield        #478 <Field int azh.bj>
	// 11432 21356:aload_0         
	// 11433 21357:getfield        #12  <Field azh a>
	// 11434 21360:getfield        #445 <Field int azh.aZ>
	// 11435 21363:ixor            
	// 11436 21364:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 11437 21367:aload_0         
	// 11438 21368:getfield        #12  <Field azh a>
	// 11439 21371:astore_1        
		abyte0.T = ((azh) (abyte0)).aZ ^ a.T;
	// 11440 21372:aload_1         
	// 11441 21373:aload_1         
	// 11442 21374:getfield        #445 <Field int azh.aZ>
	// 11443 21377:aload_0         
	// 11444 21378:getfield        #12  <Field azh a>
	// 11445 21381:getfield        #501 <Field int azh.T>
	// 11446 21384:ixor            
	// 11447 21385:putfield        #501 <Field int azh.T>
		abyte0 = ((byte []) (a));
	// 11448 21388:aload_0         
	// 11449 21389:getfield        #12  <Field azh a>
	// 11450 21392:astore_1        
		abyte0.aZ = ((azh) (abyte0)).T | a.D;
	// 11451 21393:aload_1         
	// 11452 21394:aload_1         
	// 11453 21395:getfield        #501 <Field int azh.T>
	// 11454 21398:aload_0         
	// 11455 21399:getfield        #12  <Field azh a>
	// 11456 21402:getfield        #352 <Field int azh.D>
	// 11457 21405:ior             
	// 11458 21406:putfield        #445 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 11459 21409:aload_0         
	// 11460 21410:getfield        #12  <Field azh a>
	// 11461 21413:astore_1        
		abyte0.bj = ((azh) (abyte0)).ab | a.aZ;
	// 11462 21414:aload_1         
	// 11463 21415:aload_1         
	// 11464 21416:getfield        #457 <Field int azh.ab>
	// 11465 21419:aload_0         
	// 11466 21420:getfield        #12  <Field azh a>
	// 11467 21423:getfield        #445 <Field int azh.aZ>
	// 11468 21426:ior             
	// 11469 21427:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 11470 21430:aload_0         
	// 11471 21431:getfield        #12  <Field azh a>
	// 11472 21434:astore_1        
		abyte0.bj = ((azh) (abyte0)).D ^ a.bj;
	// 11473 21435:aload_1         
	// 11474 21436:aload_1         
	// 11475 21437:getfield        #352 <Field int azh.D>
	// 11476 21440:aload_0         
	// 11477 21441:getfield        #12  <Field azh a>
	// 11478 21444:getfield        #478 <Field int azh.bj>
	// 11479 21447:ixor            
	// 11480 21448:putfield        #478 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 11481 21451:aload_0         
	// 11482 21452:getfield        #12  <Field azh a>
	// 11483 21455:astore_1        
		abyte0.aL = ((azh) (abyte0)).ab | a.T;
	// 11484 21456:aload_1         
	// 11485 21457:aload_1         
	// 11486 21458:getfield        #457 <Field int azh.ab>
	// 11487 21461:aload_0         
	// 11488 21462:getfield        #12  <Field azh a>
	// 11489 21465:getfield        #501 <Field int azh.T>
	// 11490 21468:ior             
	// 11491 21469:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 11492 21472:aload_0         
	// 11493 21473:getfield        #12  <Field azh a>
	// 11494 21476:astore_1        
		abyte0.aL = ((azh) (abyte0)).T ^ a.aL;
	// 11495 21477:aload_1         
	// 11496 21478:aload_1         
	// 11497 21479:getfield        #501 <Field int azh.T>
	// 11498 21482:aload_0         
	// 11499 21483:getfield        #12  <Field azh a>
	// 11500 21486:getfield        #110 <Field int azh.aL>
	// 11501 21489:ixor            
	// 11502 21490:putfield        #110 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 11503 21493:aload_0         
	// 11504 21494:getfield        #12  <Field azh a>
	// 11505 21497:astore_1        
		abyte0.cb = ((azh) (abyte0)).T & ~a.ab;
	// 11506 21498:aload_1         
	// 11507 21499:aload_1         
	// 11508 21500:getfield        #501 <Field int azh.T>
	// 11509 21503:aload_0         
	// 11510 21504:getfield        #12  <Field azh a>
	// 11511 21507:getfield        #457 <Field int azh.ab>
	// 11512 21510:iconst_m1       
	// 11513 21511:ixor            
	// 11514 21512:iand            
	// 11515 21513:putfield        #158 <Field int azh.cb>
	// 11516 21516:return          
	}

	private final azh a;
}
