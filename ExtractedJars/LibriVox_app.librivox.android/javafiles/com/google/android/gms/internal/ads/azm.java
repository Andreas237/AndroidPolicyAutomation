// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azm
	implements azk
{

	private azm(azh azh1)
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

	azm(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azm(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.bh = ((azh) (abyte0)).X & a.H;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.X>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.H>
	//    9   17:iand            
	//   10   18:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field azh a>
	//   13   25:astore_1        
		abyte0.aN = ((azh) (abyte0)).H & ~a.X;
	//   14   26:aload_1         
	//   15   27:aload_1         
	//   16   28:getfield        #29  <Field int azh.H>
	//   17   31:aload_0         
	//   18   32:getfield        #12  <Field azh a>
	//   19   35:getfield        #26  <Field int azh.X>
	//   20   38:iconst_m1       
	//   21   39:ixor            
	//   22   40:iand            
	//   23   41:putfield        #35  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	//   24   44:aload_0         
	//   25   45:getfield        #12  <Field azh a>
	//   26   48:astore_1        
		abyte0.aq = ((azh) (abyte0)).H & ~a.aN;
	//   27   49:aload_1         
	//   28   50:aload_1         
	//   29   51:getfield        #29  <Field int azh.H>
	//   30   54:aload_0         
	//   31   55:getfield        #12  <Field azh a>
	//   32   58:getfield        #35  <Field int azh.aN>
	//   33   61:iconst_m1       
	//   34   62:ixor            
	//   35   63:iand            
	//   36   64:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	//   37   67:aload_0         
	//   38   68:getfield        #12  <Field azh a>
	//   39   71:astore_1        
		abyte0.aE = ((azh) (abyte0)).X | a.H;
	//   40   72:aload_1         
	//   41   73:aload_1         
	//   42   74:getfield        #26  <Field int azh.X>
	//   43   77:aload_0         
	//   44   78:getfield        #12  <Field azh a>
	//   45   81:getfield        #29  <Field int azh.H>
	//   46   84:ior             
	//   47   85:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//   48   88:aload_0         
	//   49   89:getfield        #12  <Field azh a>
	//   50   92:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX ^ a.o;
	//   51   93:aload_1         
	//   52   94:aload_1         
	//   53   95:getfield        #44  <Field int azh.aX>
	//   54   98:aload_0         
	//   55   99:getfield        #12  <Field azh a>
	//   56  102:getfield        #47  <Field int azh.o>
	//   57  105:ixor            
	//   58  106:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//   59  109:aload_0         
	//   60  110:getfield        #12  <Field azh a>
	//   61  113:astore_1        
		abyte0.aP = ((azh) (abyte0)).aX ^ a.aP;
	//   62  114:aload_1         
	//   63  115:aload_1         
	//   64  116:getfield        #44  <Field int azh.aX>
	//   65  119:aload_0         
	//   66  120:getfield        #12  <Field azh a>
	//   67  123:getfield        #50  <Field int azh.aP>
	//   68  126:ixor            
	//   69  127:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	//   70  130:aload_0         
	//   71  131:getfield        #12  <Field azh a>
	//   72  134:astore_1        
		abyte0.ax = ((azh) (abyte0)).aP ^ a.ax;
	//   73  135:aload_1         
	//   74  136:aload_1         
	//   75  137:getfield        #50  <Field int azh.aP>
	//   76  140:aload_0         
	//   77  141:getfield        #12  <Field azh a>
	//   78  144:getfield        #53  <Field int azh.ax>
	//   79  147:ixor            
	//   80  148:putfield        #53  <Field int azh.ax>
		abyte0 = ((byte []) (a));
	//   81  151:aload_0         
	//   82  152:getfield        #12  <Field azh a>
	//   83  155:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax & ~a.g;
	//   84  156:aload_1         
	//   85  157:aload_1         
	//   86  158:getfield        #53  <Field int azh.ax>
	//   87  161:aload_0         
	//   88  162:getfield        #12  <Field azh a>
	//   89  165:getfield        #56  <Field int azh.g>
	//   90  168:iconst_m1       
	//   91  169:ixor            
	//   92  170:iand            
	//   93  171:putfield        #53  <Field int azh.ax>
		abyte0 = ((byte []) (a));
	//   94  174:aload_0         
	//   95  175:getfield        #12  <Field azh a>
	//   96  178:astore_1        
		abyte0.ax = ((azh) (abyte0)).an ^ a.ax;
	//   97  179:aload_1         
	//   98  180:aload_1         
	//   99  181:getfield        #59  <Field int azh.an>
	//  100  184:aload_0         
	//  101  185:getfield        #12  <Field azh a>
	//  102  188:getfield        #53  <Field int azh.ax>
	//  103  191:ixor            
	//  104  192:putfield        #53  <Field int azh.ax>
		abyte0 = ((byte []) (a));
	//  105  195:aload_0         
	//  106  196:getfield        #12  <Field azh a>
	//  107  199:astore_1        
		abyte0.Z = ((azh) (abyte0)).ax ^ a.Z;
	//  108  200:aload_1         
	//  109  201:aload_1         
	//  110  202:getfield        #53  <Field int azh.ax>
	//  111  205:aload_0         
	//  112  206:getfield        #12  <Field azh a>
	//  113  209:getfield        #62  <Field int azh.Z>
	//  114  212:ixor            
	//  115  213:putfield        #62  <Field int azh.Z>
		abyte0 = ((byte []) (a));
	//  116  216:aload_0         
	//  117  217:getfield        #12  <Field azh a>
	//  118  220:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aX ^ a.aJ;
	//  119  221:aload_1         
	//  120  222:aload_1         
	//  121  223:getfield        #44  <Field int azh.aX>
	//  122  226:aload_0         
	//  123  227:getfield        #12  <Field azh a>
	//  124  230:getfield        #65  <Field int azh.aJ>
	//  125  233:ixor            
	//  126  234:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  127  237:aload_0         
	//  128  238:getfield        #12  <Field azh a>
	//  129  241:astore_1        
		abyte0.bF = ((azh) (abyte0)).aJ ^ a.bF;
	//  130  242:aload_1         
	//  131  243:aload_1         
	//  132  244:getfield        #65  <Field int azh.aJ>
	//  133  247:aload_0         
	//  134  248:getfield        #12  <Field azh a>
	//  135  251:getfield        #68  <Field int azh.bF>
	//  136  254:ixor            
	//  137  255:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  138  258:aload_0         
	//  139  259:getfield        #12  <Field azh a>
	//  140  262:astore_1        
		abyte0.aw = ((azh) (abyte0)).bF ^ a.aw;
	//  141  263:aload_1         
	//  142  264:aload_1         
	//  143  265:getfield        #68  <Field int azh.bF>
	//  144  268:aload_0         
	//  145  269:getfield        #12  <Field azh a>
	//  146  272:getfield        #71  <Field int azh.aw>
	//  147  275:ixor            
	//  148  276:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  149  279:aload_0         
	//  150  280:getfield        #12  <Field azh a>
	//  151  283:astore_1        
		abyte0.D = ((azh) (abyte0)).aw ^ a.D;
	//  152  284:aload_1         
	//  153  285:aload_1         
	//  154  286:getfield        #71  <Field int azh.aw>
	//  155  289:aload_0         
	//  156  290:getfield        #12  <Field azh a>
	//  157  293:getfield        #74  <Field int azh.D>
	//  158  296:ixor            
	//  159  297:putfield        #74  <Field int azh.D>
		abyte0 = ((byte []) (a));
	//  160  300:aload_0         
	//  161  301:getfield        #12  <Field azh a>
	//  162  304:astore_1        
		abyte0.aw = ((azh) (abyte0)).D & ~a.ab;
	//  163  305:aload_1         
	//  164  306:aload_1         
	//  165  307:getfield        #74  <Field int azh.D>
	//  166  310:aload_0         
	//  167  311:getfield        #12  <Field azh a>
	//  168  314:getfield        #77  <Field int azh.ab>
	//  169  317:iconst_m1       
	//  170  318:ixor            
	//  171  319:iand            
	//  172  320:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  173  323:aload_0         
	//  174  324:getfield        #12  <Field azh a>
	//  175  327:astore_1        
		abyte0.aA = ((azh) (abyte0)).n & ~a.aA;
	//  176  328:aload_1         
	//  177  329:aload_1         
	//  178  330:getfield        #80  <Field int azh.n>
	//  179  333:aload_0         
	//  180  334:getfield        #12  <Field azh a>
	//  181  337:getfield        #83  <Field int azh.aA>
	//  182  340:iconst_m1       
	//  183  341:ixor            
	//  184  342:iand            
	//  185  343:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  186  346:aload_0         
	//  187  347:getfield        #12  <Field azh a>
	//  188  350:astore_1        
		abyte0.aA = ((azh) (abyte0)).aO ^ a.aA;
	//  189  351:aload_1         
	//  190  352:aload_1         
	//  191  353:getfield        #86  <Field int azh.aO>
	//  192  356:aload_0         
	//  193  357:getfield        #12  <Field azh a>
	//  194  360:getfield        #83  <Field int azh.aA>
	//  195  363:ixor            
	//  196  364:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  197  367:aload_0         
	//  198  368:getfield        #12  <Field azh a>
	//  199  371:astore_1        
		abyte0.aO = ((azh) (abyte0)).bI & ~a.n;
	//  200  372:aload_1         
	//  201  373:aload_1         
	//  202  374:getfield        #89  <Field int azh.bI>
	//  203  377:aload_0         
	//  204  378:getfield        #12  <Field azh a>
	//  205  381:getfield        #80  <Field int azh.n>
	//  206  384:iconst_m1       
	//  207  385:ixor            
	//  208  386:iand            
	//  209  387:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	//  210  390:aload_0         
	//  211  391:getfield        #12  <Field azh a>
	//  212  394:astore_1        
		abyte0.aO = ((azh) (abyte0)).aD ^ a.aO;
	//  213  395:aload_1         
	//  214  396:aload_1         
	//  215  397:getfield        #92  <Field int azh.aD>
	//  216  400:aload_0         
	//  217  401:getfield        #12  <Field azh a>
	//  218  404:getfield        #86  <Field int azh.aO>
	//  219  407:ixor            
	//  220  408:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	//  221  411:aload_0         
	//  222  412:getfield        #12  <Field azh a>
	//  223  415:astore_1        
		abyte0.aO = ((azh) (abyte0)).L & a.aO;
	//  224  416:aload_1         
	//  225  417:aload_1         
	//  226  418:getfield        #95  <Field int azh.L>
	//  227  421:aload_0         
	//  228  422:getfield        #12  <Field azh a>
	//  229  425:getfield        #86  <Field int azh.aO>
	//  230  428:iand            
	//  231  429:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	//  232  432:aload_0         
	//  233  433:getfield        #12  <Field azh a>
	//  234  436:astore_1        
		abyte0.by = ((azh) (abyte0)).n & ~a.by;
	//  235  437:aload_1         
	//  236  438:aload_1         
	//  237  439:getfield        #80  <Field int azh.n>
	//  238  442:aload_0         
	//  239  443:getfield        #12  <Field azh a>
	//  240  446:getfield        #98  <Field int azh.by>
	//  241  449:iconst_m1       
	//  242  450:ixor            
	//  243  451:iand            
	//  244  452:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	//  245  455:aload_0         
	//  246  456:getfield        #12  <Field azh a>
	//  247  459:astore_1        
		abyte0.by = ((azh) (abyte0)).bD ^ a.by;
	//  248  460:aload_1         
	//  249  461:aload_1         
	//  250  462:getfield        #101 <Field int azh.bD>
	//  251  465:aload_0         
	//  252  466:getfield        #12  <Field azh a>
	//  253  469:getfield        #98  <Field int azh.by>
	//  254  472:ixor            
	//  255  473:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	//  256  476:aload_0         
	//  257  477:getfield        #12  <Field azh a>
	//  258  480:astore_1        
		abyte0.aD = ((azh) (abyte0)).n & a.aD;
	//  259  481:aload_1         
	//  260  482:aload_1         
	//  261  483:getfield        #80  <Field int azh.n>
	//  262  486:aload_0         
	//  263  487:getfield        #12  <Field azh a>
	//  264  490:getfield        #92  <Field int azh.aD>
	//  265  493:iand            
	//  266  494:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  267  497:aload_0         
	//  268  498:getfield        #12  <Field azh a>
	//  269  501:astore_1        
		abyte0.aD = ((azh) (abyte0)).az ^ a.aD;
	//  270  502:aload_1         
	//  271  503:aload_1         
	//  272  504:getfield        #104 <Field int azh.az>
	//  273  507:aload_0         
	//  274  508:getfield        #12  <Field azh a>
	//  275  511:getfield        #92  <Field int azh.aD>
	//  276  514:ixor            
	//  277  515:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  278  518:aload_0         
	//  279  519:getfield        #12  <Field azh a>
	//  280  522:astore_1        
		abyte0.aD = ((azh) (abyte0)).L & a.aD;
	//  281  523:aload_1         
	//  282  524:aload_1         
	//  283  525:getfield        #95  <Field int azh.L>
	//  284  528:aload_0         
	//  285  529:getfield        #12  <Field azh a>
	//  286  532:getfield        #92  <Field int azh.aD>
	//  287  535:iand            
	//  288  536:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  289  539:aload_0         
	//  290  540:getfield        #12  <Field azh a>
	//  291  543:astore_1        
		abyte0.bz = ((azh) (abyte0)).n & a.bz;
	//  292  544:aload_1         
	//  293  545:aload_1         
	//  294  546:getfield        #80  <Field int azh.n>
	//  295  549:aload_0         
	//  296  550:getfield        #12  <Field azh a>
	//  297  553:getfield        #107 <Field int azh.bz>
	//  298  556:iand            
	//  299  557:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  300  560:aload_0         
	//  301  561:getfield        #12  <Field azh a>
	//  302  564:astore_1        
		abyte0.bz = ((azh) (abyte0)).aF ^ a.bz;
	//  303  565:aload_1         
	//  304  566:aload_1         
	//  305  567:getfield        #110 <Field int azh.aF>
	//  306  570:aload_0         
	//  307  571:getfield        #12  <Field azh a>
	//  308  574:getfield        #107 <Field int azh.bz>
	//  309  577:ixor            
	//  310  578:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  311  581:aload_0         
	//  312  582:getfield        #12  <Field azh a>
	//  313  585:astore_1        
		abyte0.aD = ((azh) (abyte0)).bz ^ a.aD;
	//  314  586:aload_1         
	//  315  587:aload_1         
	//  316  588:getfield        #107 <Field int azh.bz>
	//  317  591:aload_0         
	//  318  592:getfield        #12  <Field azh a>
	//  319  595:getfield        #92  <Field int azh.aD>
	//  320  598:ixor            
	//  321  599:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  322  602:aload_0         
	//  323  603:getfield        #12  <Field azh a>
	//  324  606:astore_1        
		abyte0.bz = ((azh) (abyte0)).ah | a.aD;
	//  325  607:aload_1         
	//  326  608:aload_1         
	//  327  609:getfield        #113 <Field int azh.ah>
	//  328  612:aload_0         
	//  329  613:getfield        #12  <Field azh a>
	//  330  616:getfield        #92  <Field int azh.aD>
	//  331  619:ior             
	//  332  620:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  333  623:aload_0         
	//  334  624:getfield        #12  <Field azh a>
	//  335  627:astore_1        
		abyte0.aD = ((azh) (abyte0)).ah & a.aD;
	//  336  628:aload_1         
	//  337  629:aload_1         
	//  338  630:getfield        #113 <Field int azh.ah>
	//  339  633:aload_0         
	//  340  634:getfield        #12  <Field azh a>
	//  341  637:getfield        #92  <Field int azh.aD>
	//  342  640:iand            
	//  343  641:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  344  644:aload_0         
	//  345  645:getfield        #12  <Field azh a>
	//  346  648:astore_1        
		abyte0.bK = ((azh) (abyte0)).n & ~a.bK;
	//  347  649:aload_1         
	//  348  650:aload_1         
	//  349  651:getfield        #80  <Field int azh.n>
	//  350  654:aload_0         
	//  351  655:getfield        #12  <Field azh a>
	//  352  658:getfield        #116 <Field int azh.bK>
	//  353  661:iconst_m1       
	//  354  662:ixor            
	//  355  663:iand            
	//  356  664:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  357  667:aload_0         
	//  358  668:getfield        #12  <Field azh a>
	//  359  671:astore_1        
		abyte0.bK = ((azh) (abyte0)).bJ ^ a.bK;
	//  360  672:aload_1         
	//  361  673:aload_1         
	//  362  674:getfield        #119 <Field int azh.bJ>
	//  363  677:aload_0         
	//  364  678:getfield        #12  <Field azh a>
	//  365  681:getfield        #116 <Field int azh.bK>
	//  366  684:ixor            
	//  367  685:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  368  688:aload_0         
	//  369  689:getfield        #12  <Field azh a>
	//  370  692:astore_1        
		abyte0.aO = ((azh) (abyte0)).bK ^ a.aO;
	//  371  693:aload_1         
	//  372  694:aload_1         
	//  373  695:getfield        #116 <Field int azh.bK>
	//  374  698:aload_0         
	//  375  699:getfield        #12  <Field azh a>
	//  376  702:getfield        #86  <Field int azh.aO>
	//  377  705:ixor            
	//  378  706:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	//  379  709:aload_0         
	//  380  710:getfield        #12  <Field azh a>
	//  381  713:astore_1        
		abyte0.bK = ((azh) (abyte0)).n & ~a.bG;
	//  382  714:aload_1         
	//  383  715:aload_1         
	//  384  716:getfield        #80  <Field int azh.n>
	//  385  719:aload_0         
	//  386  720:getfield        #12  <Field azh a>
	//  387  723:getfield        #122 <Field int azh.bG>
	//  388  726:iconst_m1       
	//  389  727:ixor            
	//  390  728:iand            
	//  391  729:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  392  732:aload_0         
	//  393  733:getfield        #12  <Field azh a>
	//  394  736:astore_1        
		abyte0.bK = ((azh) (abyte0)).bx ^ a.bK;
	//  395  737:aload_1         
	//  396  738:aload_1         
	//  397  739:getfield        #125 <Field int azh.bx>
	//  398  742:aload_0         
	//  399  743:getfield        #12  <Field azh a>
	//  400  746:getfield        #116 <Field int azh.bK>
	//  401  749:ixor            
	//  402  750:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  403  753:aload_0         
	//  404  754:getfield        #12  <Field azh a>
	//  405  757:astore_1        
		abyte0.bK = ((azh) (abyte0)).L & ~a.bK;
	//  406  758:aload_1         
	//  407  759:aload_1         
	//  408  760:getfield        #95  <Field int azh.L>
	//  409  763:aload_0         
	//  410  764:getfield        #12  <Field azh a>
	//  411  767:getfield        #116 <Field int azh.bK>
	//  412  770:iconst_m1       
	//  413  771:ixor            
	//  414  772:iand            
	//  415  773:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  416  776:aload_0         
	//  417  777:getfield        #12  <Field azh a>
	//  418  780:astore_1        
		abyte0.bK = ((azh) (abyte0)).aA ^ a.bK;
	//  419  781:aload_1         
	//  420  782:aload_1         
	//  421  783:getfield        #83  <Field int azh.aA>
	//  422  786:aload_0         
	//  423  787:getfield        #12  <Field azh a>
	//  424  790:getfield        #116 <Field int azh.bK>
	//  425  793:ixor            
	//  426  794:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  427  797:aload_0         
	//  428  798:getfield        #12  <Field azh a>
	//  429  801:astore_1        
		abyte0.aA = ((azh) (abyte0)).bK & ~a.ah;
	//  430  802:aload_1         
	//  431  803:aload_1         
	//  432  804:getfield        #116 <Field int azh.bK>
	//  433  807:aload_0         
	//  434  808:getfield        #12  <Field azh a>
	//  435  811:getfield        #113 <Field int azh.ah>
	//  436  814:iconst_m1       
	//  437  815:ixor            
	//  438  816:iand            
	//  439  817:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  440  820:aload_0         
	//  441  821:getfield        #12  <Field azh a>
	//  442  824:astore_1        
		abyte0.aA = ((azh) (abyte0)).aO ^ a.aA;
	//  443  825:aload_1         
	//  444  826:aload_1         
	//  445  827:getfield        #86  <Field int azh.aO>
	//  446  830:aload_0         
	//  447  831:getfield        #12  <Field azh a>
	//  448  834:getfield        #83  <Field int azh.aA>
	//  449  837:ixor            
	//  450  838:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  451  841:aload_0         
	//  452  842:getfield        #12  <Field azh a>
	//  453  845:astore_1        
		abyte0.aa = ((azh) (abyte0)).aA ^ a.aa;
	//  454  846:aload_1         
	//  455  847:aload_1         
	//  456  848:getfield        #83  <Field int azh.aA>
	//  457  851:aload_0         
	//  458  852:getfield        #12  <Field azh a>
	//  459  855:getfield        #128 <Field int azh.aa>
	//  460  858:ixor            
	//  461  859:putfield        #128 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	//  462  862:aload_0         
	//  463  863:getfield        #12  <Field azh a>
	//  464  866:astore_1        
		abyte0.aA = ((azh) (abyte0)).aa ^ a.g;
	//  465  867:aload_1         
	//  466  868:aload_1         
	//  467  869:getfield        #128 <Field int azh.aa>
	//  468  872:aload_0         
	//  469  873:getfield        #12  <Field azh a>
	//  470  876:getfield        #56  <Field int azh.g>
	//  471  879:ixor            
	//  472  880:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  473  883:aload_0         
	//  474  884:getfield        #12  <Field azh a>
	//  475  887:astore_1        
		abyte0.aK = ((azh) (abyte0)).aA ^ a.aK;
	//  476  888:aload_1         
	//  477  889:aload_1         
	//  478  890:getfield        #83  <Field int azh.aA>
	//  479  893:aload_0         
	//  480  894:getfield        #12  <Field azh a>
	//  481  897:getfield        #131 <Field int azh.aK>
	//  482  900:ixor            
	//  483  901:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	//  484  904:aload_0         
	//  485  905:getfield        #12  <Field azh a>
	//  486  908:astore_1        
		abyte0.aA = ((azh) (abyte0)).aa | a.g;
	//  487  909:aload_1         
	//  488  910:aload_1         
	//  489  911:getfield        #128 <Field int azh.aa>
	//  490  914:aload_0         
	//  491  915:getfield        #12  <Field azh a>
	//  492  918:getfield        #56  <Field int azh.g>
	//  493  921:ior             
	//  494  922:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  495  925:aload_0         
	//  496  926:getfield        #12  <Field azh a>
	//  497  929:astore_1        
		abyte0.bx = ((azh) (abyte0)).S & ~a.aA;
	//  498  930:aload_1         
	//  499  931:aload_1         
	//  500  932:getfield        #134 <Field int azh.S>
	//  501  935:aload_0         
	//  502  936:getfield        #12  <Field azh a>
	//  503  939:getfield        #83  <Field int azh.aA>
	//  504  942:iconst_m1       
	//  505  943:ixor            
	//  506  944:iand            
	//  507  945:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  508  948:aload_0         
	//  509  949:getfield        #12  <Field azh a>
	//  510  952:astore_1        
		abyte0.bx = ((azh) (abyte0)).C & ~a.bx;
	//  511  953:aload_1         
	//  512  954:aload_1         
	//  513  955:getfield        #137 <Field int azh.C>
	//  514  958:aload_0         
	//  515  959:getfield        #12  <Field azh a>
	//  516  962:getfield        #125 <Field int azh.bx>
	//  517  965:iconst_m1       
	//  518  966:ixor            
	//  519  967:iand            
	//  520  968:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  521  971:aload_0         
	//  522  972:getfield        #12  <Field azh a>
	//  523  975:astore_1        
		abyte0.bx = ((azh) (abyte0)).as ^ a.bx;
	//  524  976:aload_1         
	//  525  977:aload_1         
	//  526  978:getfield        #140 <Field int azh.as>
	//  527  981:aload_0         
	//  528  982:getfield        #12  <Field azh a>
	//  529  985:getfield        #125 <Field int azh.bx>
	//  530  988:ixor            
	//  531  989:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  532  992:aload_0         
	//  533  993:getfield        #12  <Field azh a>
	//  534  996:astore_1        
		abyte0.bJ = ((azh) (abyte0)).aa ^ a.S;
	//  535  997:aload_1         
	//  536  998:aload_1         
	//  537  999:getfield        #128 <Field int azh.aa>
	//  538 1002:aload_0         
	//  539 1003:getfield        #12  <Field azh a>
	//  540 1006:getfield        #134 <Field int azh.S>
	//  541 1009:ixor            
	//  542 1010:putfield        #119 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  543 1013:aload_0         
	//  544 1014:getfield        #12  <Field azh a>
	//  545 1017:astore_1        
		abyte0.aF = ((azh) (abyte0)).g & ~a.aa;
	//  546 1018:aload_1         
	//  547 1019:aload_1         
	//  548 1020:getfield        #56  <Field int azh.g>
	//  549 1023:aload_0         
	//  550 1024:getfield        #12  <Field azh a>
	//  551 1027:getfield        #128 <Field int azh.aa>
	//  552 1030:iconst_m1       
	//  553 1031:ixor            
	//  554 1032:iand            
	//  555 1033:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	//  556 1036:aload_0         
	//  557 1037:getfield        #12  <Field azh a>
	//  558 1040:astore_1        
		abyte0.az = ((azh) (abyte0)).aF & ~a.C;
	//  559 1041:aload_1         
	//  560 1042:aload_1         
	//  561 1043:getfield        #110 <Field int azh.aF>
	//  562 1046:aload_0         
	//  563 1047:getfield        #12  <Field azh a>
	//  564 1050:getfield        #137 <Field int azh.C>
	//  565 1053:iconst_m1       
	//  566 1054:ixor            
	//  567 1055:iand            
	//  568 1056:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	//  569 1059:aload_0         
	//  570 1060:getfield        #12  <Field azh a>
	//  571 1063:astore_1        
		abyte0.az = ((azh) (abyte0)).ai & a.az;
	//  572 1064:aload_1         
	//  573 1065:aload_1         
	//  574 1066:getfield        #143 <Field int azh.ai>
	//  575 1069:aload_0         
	//  576 1070:getfield        #12  <Field azh a>
	//  577 1073:getfield        #104 <Field int azh.az>
	//  578 1076:iand            
	//  579 1077:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	//  580 1080:aload_0         
	//  581 1081:getfield        #12  <Field azh a>
	//  582 1084:astore_1        
		abyte0.au = ((azh) (abyte0)).aF ^ a.au;
	//  583 1085:aload_1         
	//  584 1086:aload_1         
	//  585 1087:getfield        #110 <Field int azh.aF>
	//  586 1090:aload_0         
	//  587 1091:getfield        #12  <Field azh a>
	//  588 1094:getfield        #146 <Field int azh.au>
	//  589 1097:ixor            
	//  590 1098:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  591 1101:aload_0         
	//  592 1102:getfield        #12  <Field azh a>
	//  593 1105:astore_1        
		abyte0.bD = ((azh) (abyte0)).S & a.aF;
	//  594 1106:aload_1         
	//  595 1107:aload_1         
	//  596 1108:getfield        #134 <Field int azh.S>
	//  597 1111:aload_0         
	//  598 1112:getfield        #12  <Field azh a>
	//  599 1115:getfield        #110 <Field int azh.aF>
	//  600 1118:iand            
	//  601 1119:putfield        #101 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  602 1122:aload_0         
	//  603 1123:getfield        #12  <Field azh a>
	//  604 1126:astore_1        
		abyte0.bF = ((azh) (abyte0)).S & ~a.aF;
	//  605 1127:aload_1         
	//  606 1128:aload_1         
	//  607 1129:getfield        #134 <Field int azh.S>
	//  608 1132:aload_0         
	//  609 1133:getfield        #12  <Field azh a>
	//  610 1136:getfield        #110 <Field int azh.aF>
	//  611 1139:iconst_m1       
	//  612 1140:ixor            
	//  613 1141:iand            
	//  614 1142:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  615 1145:aload_0         
	//  616 1146:getfield        #12  <Field azh a>
	//  617 1149:astore_1        
		abyte0.bp = ((azh) (abyte0)).bF ^ a.bp;
	//  618 1150:aload_1         
	//  619 1151:aload_1         
	//  620 1152:getfield        #68  <Field int azh.bF>
	//  621 1155:aload_0         
	//  622 1156:getfield        #12  <Field azh a>
	//  623 1159:getfield        #149 <Field int azh.bp>
	//  624 1162:ixor            
	//  625 1163:putfield        #149 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  626 1166:aload_0         
	//  627 1167:getfield        #12  <Field azh a>
	//  628 1170:astore_1        
		abyte0.bp = ((azh) (abyte0)).ai & ~a.bp;
	//  629 1171:aload_1         
	//  630 1172:aload_1         
	//  631 1173:getfield        #143 <Field int azh.ai>
	//  632 1176:aload_0         
	//  633 1177:getfield        #12  <Field azh a>
	//  634 1180:getfield        #149 <Field int azh.bp>
	//  635 1183:iconst_m1       
	//  636 1184:ixor            
	//  637 1185:iand            
	//  638 1186:putfield        #149 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  639 1189:aload_0         
	//  640 1190:getfield        #12  <Field azh a>
	//  641 1193:astore_1        
		abyte0.bp = ((azh) (abyte0)).bx ^ a.bp;
	//  642 1194:aload_1         
	//  643 1195:aload_1         
	//  644 1196:getfield        #125 <Field int azh.bx>
	//  645 1199:aload_0         
	//  646 1200:getfield        #12  <Field azh a>
	//  647 1203:getfield        #149 <Field int azh.bp>
	//  648 1206:ixor            
	//  649 1207:putfield        #149 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  650 1210:aload_0         
	//  651 1211:getfield        #12  <Field azh a>
	//  652 1214:astore_1        
		abyte0.bx = ((azh) (abyte0)).S & a.aF;
	//  653 1215:aload_1         
	//  654 1216:aload_1         
	//  655 1217:getfield        #134 <Field int azh.S>
	//  656 1220:aload_0         
	//  657 1221:getfield        #12  <Field azh a>
	//  658 1224:getfield        #110 <Field int azh.aF>
	//  659 1227:iand            
	//  660 1228:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  661 1231:aload_0         
	//  662 1232:getfield        #12  <Field azh a>
	//  663 1235:astore_1        
		abyte0.aF = ((azh) (abyte0)).S & a.aF;
	//  664 1236:aload_1         
	//  665 1237:aload_1         
	//  666 1238:getfield        #134 <Field int azh.S>
	//  667 1241:aload_0         
	//  668 1242:getfield        #12  <Field azh a>
	//  669 1245:getfield        #110 <Field int azh.aF>
	//  670 1248:iand            
	//  671 1249:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	//  672 1252:aload_0         
	//  673 1253:getfield        #12  <Field azh a>
	//  674 1256:astore_1        
		abyte0.bF = ((azh) (abyte0)).aa & a.g;
	//  675 1257:aload_1         
	//  676 1258:aload_1         
	//  677 1259:getfield        #128 <Field int azh.aa>
	//  678 1262:aload_0         
	//  679 1263:getfield        #12  <Field azh a>
	//  680 1266:getfield        #56  <Field int azh.g>
	//  681 1269:iand            
	//  682 1270:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  683 1273:aload_0         
	//  684 1274:getfield        #12  <Field azh a>
	//  685 1277:astore_1        
		abyte0.bx = ((azh) (abyte0)).bF ^ a.bx;
	//  686 1278:aload_1         
	//  687 1279:aload_1         
	//  688 1280:getfield        #68  <Field int azh.bF>
	//  689 1283:aload_0         
	//  690 1284:getfield        #12  <Field azh a>
	//  691 1287:getfield        #125 <Field int azh.bx>
	//  692 1290:ixor            
	//  693 1291:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  694 1294:aload_0         
	//  695 1295:getfield        #12  <Field azh a>
	//  696 1298:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx & ~a.C;
	//  697 1299:aload_1         
	//  698 1300:aload_1         
	//  699 1301:getfield        #125 <Field int azh.bx>
	//  700 1304:aload_0         
	//  701 1305:getfield        #12  <Field azh a>
	//  702 1308:getfield        #137 <Field int azh.C>
	//  703 1311:iconst_m1       
	//  704 1312:ixor            
	//  705 1313:iand            
	//  706 1314:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  707 1317:aload_0         
	//  708 1318:getfield        #12  <Field azh a>
	//  709 1321:astore_1        
		abyte0.aJ = ((azh) (abyte0)).S & a.bF;
	//  710 1322:aload_1         
	//  711 1323:aload_1         
	//  712 1324:getfield        #134 <Field int azh.S>
	//  713 1327:aload_0         
	//  714 1328:getfield        #12  <Field azh a>
	//  715 1331:getfield        #68  <Field int azh.bF>
	//  716 1334:iand            
	//  717 1335:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  718 1338:aload_0         
	//  719 1339:getfield        #12  <Field azh a>
	//  720 1342:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aA ^ a.aJ;
	//  721 1343:aload_1         
	//  722 1344:aload_1         
	//  723 1345:getfield        #83  <Field int azh.aA>
	//  724 1348:aload_0         
	//  725 1349:getfield        #12  <Field azh a>
	//  726 1352:getfield        #65  <Field int azh.aJ>
	//  727 1355:ixor            
	//  728 1356:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  729 1359:aload_0         
	//  730 1360:getfield        #12  <Field azh a>
	//  731 1363:astore_1        
		abyte0.aJ = ((azh) (abyte0)).C | a.aJ;
	//  732 1364:aload_1         
	//  733 1365:aload_1         
	//  734 1366:getfield        #137 <Field int azh.C>
	//  735 1369:aload_0         
	//  736 1370:getfield        #12  <Field azh a>
	//  737 1373:getfield        #65  <Field int azh.aJ>
	//  738 1376:ior             
	//  739 1377:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  740 1380:aload_0         
	//  741 1381:getfield        #12  <Field azh a>
	//  742 1384:astore_1        
		abyte0.aJ = ((azh) (abyte0)).as ^ a.aJ;
	//  743 1385:aload_1         
	//  744 1386:aload_1         
	//  745 1387:getfield        #140 <Field int azh.as>
	//  746 1390:aload_0         
	//  747 1391:getfield        #12  <Field azh a>
	//  748 1394:getfield        #65  <Field int azh.aJ>
	//  749 1397:ixor            
	//  750 1398:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  751 1401:aload_0         
	//  752 1402:getfield        #12  <Field azh a>
	//  753 1405:astore_1        
		abyte0.bF = ((azh) (abyte0)).S & a.bF;
	//  754 1406:aload_1         
	//  755 1407:aload_1         
	//  756 1408:getfield        #134 <Field int azh.S>
	//  757 1411:aload_0         
	//  758 1412:getfield        #12  <Field azh a>
	//  759 1415:getfield        #68  <Field int azh.bF>
	//  760 1418:iand            
	//  761 1419:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  762 1422:aload_0         
	//  763 1423:getfield        #12  <Field azh a>
	//  764 1426:astore_1        
		abyte0.bF = ((azh) (abyte0)).aa ^ a.bF;
	//  765 1427:aload_1         
	//  766 1428:aload_1         
	//  767 1429:getfield        #128 <Field int azh.aa>
	//  768 1432:aload_0         
	//  769 1433:getfield        #12  <Field azh a>
	//  770 1436:getfield        #68  <Field int azh.bF>
	//  771 1439:ixor            
	//  772 1440:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  773 1443:aload_0         
	//  774 1444:getfield        #12  <Field azh a>
	//  775 1447:astore_1        
		abyte0.bF = ((azh) (abyte0)).C | a.bF;
	//  776 1448:aload_1         
	//  777 1449:aload_1         
	//  778 1450:getfield        #137 <Field int azh.C>
	//  779 1453:aload_0         
	//  780 1454:getfield        #12  <Field azh a>
	//  781 1457:getfield        #68  <Field int azh.bF>
	//  782 1460:ior             
	//  783 1461:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  784 1464:aload_0         
	//  785 1465:getfield        #12  <Field azh a>
	//  786 1468:astore_1        
		abyte0.bF = ((azh) (abyte0)).bE ^ a.bF;
	//  787 1469:aload_1         
	//  788 1470:aload_1         
	//  789 1471:getfield        #152 <Field int azh.bE>
	//  790 1474:aload_0         
	//  791 1475:getfield        #12  <Field azh a>
	//  792 1478:getfield        #68  <Field int azh.bF>
	//  793 1481:ixor            
	//  794 1482:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  795 1485:aload_0         
	//  796 1486:getfield        #12  <Field azh a>
	//  797 1489:astore_1        
		abyte0.bF = ((azh) (abyte0)).ai & ~a.bF;
	//  798 1490:aload_1         
	//  799 1491:aload_1         
	//  800 1492:getfield        #143 <Field int azh.ai>
	//  801 1495:aload_0         
	//  802 1496:getfield        #12  <Field azh a>
	//  803 1499:getfield        #68  <Field int azh.bF>
	//  804 1502:iconst_m1       
	//  805 1503:ixor            
	//  806 1504:iand            
	//  807 1505:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  808 1508:aload_0         
	//  809 1509:getfield        #12  <Field azh a>
	//  810 1512:astore_1        
		abyte0.be = ((azh) (abyte0)).aa ^ a.be;
	//  811 1513:aload_1         
	//  812 1514:aload_1         
	//  813 1515:getfield        #128 <Field int azh.aa>
	//  814 1518:aload_0         
	//  815 1519:getfield        #12  <Field azh a>
	//  816 1522:getfield        #155 <Field int azh.be>
	//  817 1525:ixor            
	//  818 1526:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	//  819 1529:aload_0         
	//  820 1530:getfield        #12  <Field azh a>
	//  821 1533:astore_1        
		abyte0.bE = ((azh) (abyte0)).be & ~a.C;
	//  822 1534:aload_1         
	//  823 1535:aload_1         
	//  824 1536:getfield        #155 <Field int azh.be>
	//  825 1539:aload_0         
	//  826 1540:getfield        #12  <Field azh a>
	//  827 1543:getfield        #137 <Field int azh.C>
	//  828 1546:iconst_m1       
	//  829 1547:ixor            
	//  830 1548:iand            
	//  831 1549:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	//  832 1552:aload_0         
	//  833 1553:getfield        #12  <Field azh a>
	//  834 1556:astore_1        
		abyte0.bE = ((azh) (abyte0)).ai & a.bE;
	//  835 1557:aload_1         
	//  836 1558:aload_1         
	//  837 1559:getfield        #143 <Field int azh.ai>
	//  838 1562:aload_0         
	//  839 1563:getfield        #12  <Field azh a>
	//  840 1566:getfield        #152 <Field int azh.bE>
	//  841 1569:iand            
	//  842 1570:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	//  843 1573:aload_0         
	//  844 1574:getfield        #12  <Field azh a>
	//  845 1577:astore_1        
		abyte0.as = ((azh) (abyte0)).be & ~a.C;
	//  846 1578:aload_1         
	//  847 1579:aload_1         
	//  848 1580:getfield        #155 <Field int azh.be>
	//  849 1583:aload_0         
	//  850 1584:getfield        #12  <Field azh a>
	//  851 1587:getfield        #137 <Field int azh.C>
	//  852 1590:iconst_m1       
	//  853 1591:ixor            
	//  854 1592:iand            
	//  855 1593:putfield        #140 <Field int azh.as>
		abyte0 = ((byte []) (a));
	//  856 1596:aload_0         
	//  857 1597:getfield        #12  <Field azh a>
	//  858 1600:astore_1        
		abyte0.aA = ((azh) (abyte0)).aa & ~a.g;
	//  859 1601:aload_1         
	//  860 1602:aload_1         
	//  861 1603:getfield        #128 <Field int azh.aa>
	//  862 1606:aload_0         
	//  863 1607:getfield        #12  <Field azh a>
	//  864 1610:getfield        #56  <Field int azh.g>
	//  865 1613:iconst_m1       
	//  866 1614:ixor            
	//  867 1615:iand            
	//  868 1616:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  869 1619:aload_0         
	//  870 1620:getfield        #12  <Field azh a>
	//  871 1623:astore_1        
		abyte0.aX = ((azh) (abyte0)).g | a.aA;
	//  872 1624:aload_1         
	//  873 1625:aload_1         
	//  874 1626:getfield        #56  <Field int azh.g>
	//  875 1629:aload_0         
	//  876 1630:getfield        #12  <Field azh a>
	//  877 1633:getfield        #83  <Field int azh.aA>
	//  878 1636:ior             
	//  879 1637:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//  880 1640:aload_0         
	//  881 1641:getfield        #12  <Field azh a>
	//  882 1644:astore_1        
		abyte0.bD = ((azh) (abyte0)).aX ^ a.bD;
	//  883 1645:aload_1         
	//  884 1646:aload_1         
	//  885 1647:getfield        #44  <Field int azh.aX>
	//  886 1650:aload_0         
	//  887 1651:getfield        #12  <Field azh a>
	//  888 1654:getfield        #101 <Field int azh.bD>
	//  889 1657:ixor            
	//  890 1658:putfield        #101 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  891 1661:aload_0         
	//  892 1662:getfield        #12  <Field azh a>
	//  893 1665:astore_1        
		abyte0.as = ((azh) (abyte0)).bD ^ a.as;
	//  894 1666:aload_1         
	//  895 1667:aload_1         
	//  896 1668:getfield        #101 <Field int azh.bD>
	//  897 1671:aload_0         
	//  898 1672:getfield        #12  <Field azh a>
	//  899 1675:getfield        #140 <Field int azh.as>
	//  900 1678:ixor            
	//  901 1679:putfield        #140 <Field int azh.as>
		abyte0 = ((byte []) (a));
	//  902 1682:aload_0         
	//  903 1683:getfield        #12  <Field azh a>
	//  904 1686:astore_1        
		abyte0.as = ((azh) (abyte0)).ai & a.as;
	//  905 1687:aload_1         
	//  906 1688:aload_1         
	//  907 1689:getfield        #143 <Field int azh.ai>
	//  908 1692:aload_0         
	//  909 1693:getfield        #12  <Field azh a>
	//  910 1696:getfield        #140 <Field int azh.as>
	//  911 1699:iand            
	//  912 1700:putfield        #140 <Field int azh.as>
		abyte0 = ((byte []) (a));
	//  913 1703:aload_0         
	//  914 1704:getfield        #12  <Field azh a>
	//  915 1707:astore_1        
		abyte0.as = ((azh) (abyte0)).aJ ^ a.as;
	//  916 1708:aload_1         
	//  917 1709:aload_1         
	//  918 1710:getfield        #65  <Field int azh.aJ>
	//  919 1713:aload_0         
	//  920 1714:getfield        #12  <Field azh a>
	//  921 1717:getfield        #140 <Field int azh.as>
	//  922 1720:ixor            
	//  923 1721:putfield        #140 <Field int azh.as>
		abyte0 = ((byte []) (a));
	//  924 1724:aload_0         
	//  925 1725:getfield        #12  <Field azh a>
	//  926 1728:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aX & ~a.C;
	//  927 1729:aload_1         
	//  928 1730:aload_1         
	//  929 1731:getfield        #44  <Field int azh.aX>
	//  930 1734:aload_0         
	//  931 1735:getfield        #12  <Field azh a>
	//  932 1738:getfield        #137 <Field int azh.C>
	//  933 1741:iconst_m1       
	//  934 1742:ixor            
	//  935 1743:iand            
	//  936 1744:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  937 1747:aload_0         
	//  938 1748:getfield        #12  <Field azh a>
	//  939 1751:astore_1        
		abyte0.aJ = ((azh) (abyte0)).bJ ^ a.aJ;
	//  940 1752:aload_1         
	//  941 1753:aload_1         
	//  942 1754:getfield        #119 <Field int azh.bJ>
	//  943 1757:aload_0         
	//  944 1758:getfield        #12  <Field azh a>
	//  945 1761:getfield        #65  <Field int azh.aJ>
	//  946 1764:ixor            
	//  947 1765:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  948 1768:aload_0         
	//  949 1769:getfield        #12  <Field azh a>
	//  950 1772:astore_1        
		abyte0.bF = ((azh) (abyte0)).aJ ^ a.bF;
	//  951 1773:aload_1         
	//  952 1774:aload_1         
	//  953 1775:getfield        #65  <Field int azh.aJ>
	//  954 1778:aload_0         
	//  955 1779:getfield        #12  <Field azh a>
	//  956 1782:getfield        #68  <Field int azh.bF>
	//  957 1785:ixor            
	//  958 1786:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	//  959 1789:aload_0         
	//  960 1790:getfield        #12  <Field azh a>
	//  961 1793:astore_1        
		abyte0.aB = ((azh) (abyte0)).aX ^ a.aB;
	//  962 1794:aload_1         
	//  963 1795:aload_1         
	//  964 1796:getfield        #44  <Field int azh.aX>
	//  965 1799:aload_0         
	//  966 1800:getfield        #12  <Field azh a>
	//  967 1803:getfield        #158 <Field int azh.aB>
	//  968 1806:ixor            
	//  969 1807:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	//  970 1810:aload_0         
	//  971 1811:getfield        #12  <Field azh a>
	//  972 1814:astore_1        
		abyte0.aB = ((azh) (abyte0)).ai & ~a.aB;
	//  973 1815:aload_1         
	//  974 1816:aload_1         
	//  975 1817:getfield        #143 <Field int azh.ai>
	//  976 1820:aload_0         
	//  977 1821:getfield        #12  <Field azh a>
	//  978 1824:getfield        #158 <Field int azh.aB>
	//  979 1827:iconst_m1       
	//  980 1828:ixor            
	//  981 1829:iand            
	//  982 1830:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	//  983 1833:aload_0         
	//  984 1834:getfield        #12  <Field azh a>
	//  985 1837:astore_1        
		abyte0.aB = ((azh) (abyte0)).au ^ a.aB;
	//  986 1838:aload_1         
	//  987 1839:aload_1         
	//  988 1840:getfield        #146 <Field int azh.au>
	//  989 1843:aload_0         
	//  990 1844:getfield        #12  <Field azh a>
	//  991 1847:getfield        #158 <Field int azh.aB>
	//  992 1850:ixor            
	//  993 1851:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	//  994 1854:aload_0         
	//  995 1855:getfield        #12  <Field azh a>
	//  996 1858:astore_1        
		abyte0.aB = ((azh) (abyte0)).K & ~a.aB;
	//  997 1859:aload_1         
	//  998 1860:aload_1         
	//  999 1861:getfield        #161 <Field int azh.K>
	// 1000 1864:aload_0         
	// 1001 1865:getfield        #12  <Field azh a>
	// 1002 1868:getfield        #158 <Field int azh.aB>
	// 1003 1871:iconst_m1       
	// 1004 1872:ixor            
	// 1005 1873:iand            
	// 1006 1874:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1007 1877:aload_0         
	// 1008 1878:getfield        #12  <Field azh a>
	// 1009 1881:astore_1        
		abyte0.aX = ((azh) (abyte0)).S & a.aX;
	// 1010 1882:aload_1         
	// 1011 1883:aload_1         
	// 1012 1884:getfield        #134 <Field int azh.S>
	// 1013 1887:aload_0         
	// 1014 1888:getfield        #12  <Field azh a>
	// 1015 1891:getfield        #44  <Field int azh.aX>
	// 1016 1894:iand            
	// 1017 1895:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 1018 1898:aload_0         
	// 1019 1899:getfield        #12  <Field azh a>
	// 1020 1902:astore_1        
		abyte0.aX = ((azh) (abyte0)).C & a.aX;
	// 1021 1903:aload_1         
	// 1022 1904:aload_1         
	// 1023 1905:getfield        #137 <Field int azh.C>
	// 1024 1908:aload_0         
	// 1025 1909:getfield        #12  <Field azh a>
	// 1026 1912:getfield        #44  <Field int azh.aX>
	// 1027 1915:iand            
	// 1028 1916:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 1029 1919:aload_0         
	// 1030 1920:getfield        #12  <Field azh a>
	// 1031 1923:astore_1        
		abyte0.aX = ((azh) (abyte0)).bJ ^ a.aX;
	// 1032 1924:aload_1         
	// 1033 1925:aload_1         
	// 1034 1926:getfield        #119 <Field int azh.bJ>
	// 1035 1929:aload_0         
	// 1036 1930:getfield        #12  <Field azh a>
	// 1037 1933:getfield        #44  <Field int azh.aX>
	// 1038 1936:ixor            
	// 1039 1937:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 1040 1940:aload_0         
	// 1041 1941:getfield        #12  <Field azh a>
	// 1042 1944:astore_1        
		abyte0.az = ((azh) (abyte0)).aX ^ a.az;
	// 1043 1945:aload_1         
	// 1044 1946:aload_1         
	// 1045 1947:getfield        #44  <Field int azh.aX>
	// 1046 1950:aload_0         
	// 1047 1951:getfield        #12  <Field azh a>
	// 1048 1954:getfield        #104 <Field int azh.az>
	// 1049 1957:ixor            
	// 1050 1958:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 1051 1961:aload_0         
	// 1052 1962:getfield        #12  <Field azh a>
	// 1053 1965:astore_1        
		abyte0.az = ((azh) (abyte0)).K & a.az;
	// 1054 1966:aload_1         
	// 1055 1967:aload_1         
	// 1056 1968:getfield        #161 <Field int azh.K>
	// 1057 1971:aload_0         
	// 1058 1972:getfield        #12  <Field azh a>
	// 1059 1975:getfield        #104 <Field int azh.az>
	// 1060 1978:iand            
	// 1061 1979:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 1062 1982:aload_0         
	// 1063 1983:getfield        #12  <Field azh a>
	// 1064 1986:astore_1        
		abyte0.az = ((azh) (abyte0)).bp ^ a.az;
	// 1065 1987:aload_1         
	// 1066 1988:aload_1         
	// 1067 1989:getfield        #149 <Field int azh.bp>
	// 1068 1992:aload_0         
	// 1069 1993:getfield        #12  <Field azh a>
	// 1070 1996:getfield        #104 <Field int azh.az>
	// 1071 1999:ixor            
	// 1072 2000:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 1073 2003:aload_0         
	// 1074 2004:getfield        #12  <Field azh a>
	// 1075 2007:astore_1        
		abyte0.f = ((azh) (abyte0)).az ^ a.f;
	// 1076 2008:aload_1         
	// 1077 2009:aload_1         
	// 1078 2010:getfield        #104 <Field int azh.az>
	// 1079 2013:aload_0         
	// 1080 2014:getfield        #12  <Field azh a>
	// 1081 2017:getfield        #164 <Field int azh.f>
	// 1082 2020:ixor            
	// 1083 2021:putfield        #164 <Field int azh.f>
		abyte0 = ((byte []) (a));
	// 1084 2024:aload_0         
	// 1085 2025:getfield        #12  <Field azh a>
	// 1086 2028:astore_1        
		abyte0.az = ((azh) (abyte0)).Z & ~a.f;
	// 1087 2029:aload_1         
	// 1088 2030:aload_1         
	// 1089 2031:getfield        #62  <Field int azh.Z>
	// 1090 2034:aload_0         
	// 1091 2035:getfield        #12  <Field azh a>
	// 1092 2038:getfield        #164 <Field int azh.f>
	// 1093 2041:iconst_m1       
	// 1094 2042:ixor            
	// 1095 2043:iand            
	// 1096 2044:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 1097 2047:aload_0         
	// 1098 2048:getfield        #12  <Field azh a>
	// 1099 2051:astore_1        
		abyte0.bp = ((azh) (abyte0)).f | a.Z;
	// 1100 2052:aload_1         
	// 1101 2053:aload_1         
	// 1102 2054:getfield        #164 <Field int azh.f>
	// 1103 2057:aload_0         
	// 1104 2058:getfield        #12  <Field azh a>
	// 1105 2061:getfield        #62  <Field int azh.Z>
	// 1106 2064:ior             
	// 1107 2065:putfield        #149 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1108 2068:aload_0         
	// 1109 2069:getfield        #12  <Field azh a>
	// 1110 2072:astore_1        
		abyte0.aX = ((azh) (abyte0)).bp & ~a.f;
	// 1111 2073:aload_1         
	// 1112 2074:aload_1         
	// 1113 2075:getfield        #149 <Field int azh.bp>
	// 1114 2078:aload_0         
	// 1115 2079:getfield        #12  <Field azh a>
	// 1116 2082:getfield        #164 <Field int azh.f>
	// 1117 2085:iconst_m1       
	// 1118 2086:ixor            
	// 1119 2087:iand            
	// 1120 2088:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 1121 2091:aload_0         
	// 1122 2092:getfield        #12  <Field azh a>
	// 1123 2095:astore_1        
		abyte0.bJ = ((azh) (abyte0)).Z ^ a.f;
	// 1124 2096:aload_1         
	// 1125 2097:aload_1         
	// 1126 2098:getfield        #62  <Field int azh.Z>
	// 1127 2101:aload_0         
	// 1128 2102:getfield        #12  <Field azh a>
	// 1129 2105:getfield        #164 <Field int azh.f>
	// 1130 2108:ixor            
	// 1131 2109:putfield        #119 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1132 2112:aload_0         
	// 1133 2113:getfield        #12  <Field azh a>
	// 1134 2116:astore_1        
		abyte0.au = ((azh) (abyte0)).Z & a.f;
	// 1135 2117:aload_1         
	// 1136 2118:aload_1         
	// 1137 2119:getfield        #62  <Field int azh.Z>
	// 1138 2122:aload_0         
	// 1139 2123:getfield        #12  <Field azh a>
	// 1140 2126:getfield        #164 <Field int azh.f>
	// 1141 2129:iand            
	// 1142 2130:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1143 2133:aload_0         
	// 1144 2134:getfield        #12  <Field azh a>
	// 1145 2137:astore_1        
		abyte0.aJ = ((azh) (abyte0)).f & ~a.au;
	// 1146 2138:aload_1         
	// 1147 2139:aload_1         
	// 1148 2140:getfield        #164 <Field int azh.f>
	// 1149 2143:aload_0         
	// 1150 2144:getfield        #12  <Field azh a>
	// 1151 2147:getfield        #146 <Field int azh.au>
	// 1152 2150:iconst_m1       
	// 1153 2151:ixor            
	// 1154 2152:iand            
	// 1155 2153:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 1156 2156:aload_0         
	// 1157 2157:getfield        #12  <Field azh a>
	// 1158 2160:astore_1        
		abyte0.bD = ((azh) (abyte0)).D & ~a.f;
	// 1159 2161:aload_1         
	// 1160 2162:aload_1         
	// 1161 2163:getfield        #74  <Field int azh.D>
	// 1162 2166:aload_0         
	// 1163 2167:getfield        #12  <Field azh a>
	// 1164 2170:getfield        #164 <Field int azh.f>
	// 1165 2173:iconst_m1       
	// 1166 2174:ixor            
	// 1167 2175:iand            
	// 1168 2176:putfield        #101 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 1169 2179:aload_0         
	// 1170 2180:getfield        #12  <Field azh a>
	// 1171 2183:astore_1        
		abyte0.ax = ((azh) (abyte0)).f | a.D;
	// 1172 2184:aload_1         
	// 1173 2185:aload_1         
	// 1174 2186:getfield        #164 <Field int azh.f>
	// 1175 2189:aload_0         
	// 1176 2190:getfield        #12  <Field azh a>
	// 1177 2193:getfield        #74  <Field int azh.D>
	// 1178 2196:ior             
	// 1179 2197:putfield        #53  <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 1180 2200:aload_0         
	// 1181 2201:getfield        #12  <Field azh a>
	// 1182 2204:astore_1        
		abyte0.an = ((azh) (abyte0)).D & ~a.f;
	// 1183 2205:aload_1         
	// 1184 2206:aload_1         
	// 1185 2207:getfield        #74  <Field int azh.D>
	// 1186 2210:aload_0         
	// 1187 2211:getfield        #12  <Field azh a>
	// 1188 2214:getfield        #164 <Field int azh.f>
	// 1189 2217:iconst_m1       
	// 1190 2218:ixor            
	// 1191 2219:iand            
	// 1192 2220:putfield        #59  <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1193 2223:aload_0         
	// 1194 2224:getfield        #12  <Field azh a>
	// 1195 2227:astore_1        
		abyte0.aP = ((azh) (abyte0)).S & ~a.aA;
	// 1196 2228:aload_1         
	// 1197 2229:aload_1         
	// 1198 2230:getfield        #134 <Field int azh.S>
	// 1199 2233:aload_0         
	// 1200 2234:getfield        #12  <Field azh a>
	// 1201 2237:getfield        #83  <Field int azh.aA>
	// 1202 2240:iconst_m1       
	// 1203 2241:ixor            
	// 1204 2242:iand            
	// 1205 2243:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1206 2246:aload_0         
	// 1207 2247:getfield        #12  <Field azh a>
	// 1208 2250:astore_1        
		abyte0.bx = ((azh) (abyte0)).aP ^ a.bx;
	// 1209 2251:aload_1         
	// 1210 2252:aload_1         
	// 1211 2253:getfield        #50  <Field int azh.aP>
	// 1212 2256:aload_0         
	// 1213 2257:getfield        #12  <Field azh a>
	// 1214 2260:getfield        #125 <Field int azh.bx>
	// 1215 2263:ixor            
	// 1216 2264:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 1217 2267:aload_0         
	// 1218 2268:getfield        #12  <Field azh a>
	// 1219 2271:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bx ^ a.aQ;
	// 1220 2272:aload_1         
	// 1221 2273:aload_1         
	// 1222 2274:getfield        #125 <Field int azh.bx>
	// 1223 2277:aload_0         
	// 1224 2278:getfield        #12  <Field azh a>
	// 1225 2281:getfield        #167 <Field int azh.aQ>
	// 1226 2284:ixor            
	// 1227 2285:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1228 2288:aload_0         
	// 1229 2289:getfield        #12  <Field azh a>
	// 1230 2292:astore_1        
		abyte0.aQ = ((azh) (abyte0)).K & ~a.aQ;
	// 1231 2293:aload_1         
	// 1232 2294:aload_1         
	// 1233 2295:getfield        #161 <Field int azh.K>
	// 1234 2298:aload_0         
	// 1235 2299:getfield        #12  <Field azh a>
	// 1236 2302:getfield        #167 <Field int azh.aQ>
	// 1237 2305:iconst_m1       
	// 1238 2306:ixor            
	// 1239 2307:iand            
	// 1240 2308:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1241 2311:aload_0         
	// 1242 2312:getfield        #12  <Field azh a>
	// 1243 2315:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bF ^ a.aQ;
	// 1244 2316:aload_1         
	// 1245 2317:aload_1         
	// 1246 2318:getfield        #68  <Field int azh.bF>
	// 1247 2321:aload_0         
	// 1248 2322:getfield        #12  <Field azh a>
	// 1249 2325:getfield        #167 <Field int azh.aQ>
	// 1250 2328:ixor            
	// 1251 2329:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1252 2332:aload_0         
	// 1253 2333:getfield        #12  <Field azh a>
	// 1254 2336:astore_1        
		abyte0.r = ((azh) (abyte0)).aQ ^ a.r;
	// 1255 2337:aload_1         
	// 1256 2338:aload_1         
	// 1257 2339:getfield        #167 <Field int azh.aQ>
	// 1258 2342:aload_0         
	// 1259 2343:getfield        #12  <Field azh a>
	// 1260 2346:getfield        #170 <Field int azh.r>
	// 1261 2349:ixor            
	// 1262 2350:putfield        #170 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 1263 2353:aload_0         
	// 1264 2354:getfield        #12  <Field azh a>
	// 1265 2357:astore_1        
		abyte0.aF = ((azh) (abyte0)).aA ^ a.aF;
	// 1266 2358:aload_1         
	// 1267 2359:aload_1         
	// 1268 2360:getfield        #83  <Field int azh.aA>
	// 1269 2363:aload_0         
	// 1270 2364:getfield        #12  <Field azh a>
	// 1271 2367:getfield        #110 <Field int azh.aF>
	// 1272 2370:ixor            
	// 1273 2371:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 1274 2374:aload_0         
	// 1275 2375:getfield        #12  <Field azh a>
	// 1276 2378:astore_1        
		abyte0.aF = ((azh) (abyte0)).C & a.aF;
	// 1277 2379:aload_1         
	// 1278 2380:aload_1         
	// 1279 2381:getfield        #137 <Field int azh.C>
	// 1280 2384:aload_0         
	// 1281 2385:getfield        #12  <Field azh a>
	// 1282 2388:getfield        #110 <Field int azh.aF>
	// 1283 2391:iand            
	// 1284 2392:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 1285 2395:aload_0         
	// 1286 2396:getfield        #12  <Field azh a>
	// 1287 2399:astore_1        
		abyte0.aF = ((azh) (abyte0)).be ^ a.aF;
	// 1288 2400:aload_1         
	// 1289 2401:aload_1         
	// 1290 2402:getfield        #155 <Field int azh.be>
	// 1291 2405:aload_0         
	// 1292 2406:getfield        #12  <Field azh a>
	// 1293 2409:getfield        #110 <Field int azh.aF>
	// 1294 2412:ixor            
	// 1295 2413:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 1296 2416:aload_0         
	// 1297 2417:getfield        #12  <Field azh a>
	// 1298 2420:astore_1        
		abyte0.bE = ((azh) (abyte0)).aF ^ a.bE;
	// 1299 2421:aload_1         
	// 1300 2422:aload_1         
	// 1301 2423:getfield        #110 <Field int azh.aF>
	// 1302 2426:aload_0         
	// 1303 2427:getfield        #12  <Field azh a>
	// 1304 2430:getfield        #152 <Field int azh.bE>
	// 1305 2433:ixor            
	// 1306 2434:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 1307 2437:aload_0         
	// 1308 2438:getfield        #12  <Field azh a>
	// 1309 2441:astore_1        
		abyte0.bE = ((azh) (abyte0)).K & ~a.bE;
	// 1310 2442:aload_1         
	// 1311 2443:aload_1         
	// 1312 2444:getfield        #161 <Field int azh.K>
	// 1313 2447:aload_0         
	// 1314 2448:getfield        #12  <Field azh a>
	// 1315 2451:getfield        #152 <Field int azh.bE>
	// 1316 2454:iconst_m1       
	// 1317 2455:ixor            
	// 1318 2456:iand            
	// 1319 2457:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 1320 2460:aload_0         
	// 1321 2461:getfield        #12  <Field azh a>
	// 1322 2464:astore_1        
		abyte0.bE = ((azh) (abyte0)).as ^ a.bE;
	// 1323 2465:aload_1         
	// 1324 2466:aload_1         
	// 1325 2467:getfield        #140 <Field int azh.as>
	// 1326 2470:aload_0         
	// 1327 2471:getfield        #12  <Field azh a>
	// 1328 2474:getfield        #152 <Field int azh.bE>
	// 1329 2477:ixor            
	// 1330 2478:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 1331 2481:aload_0         
	// 1332 2482:getfield        #12  <Field azh a>
	// 1333 2485:astore_1        
		abyte0.d = ((azh) (abyte0)).bE ^ a.d;
	// 1334 2486:aload_1         
	// 1335 2487:aload_1         
	// 1336 2488:getfield        #152 <Field int azh.bE>
	// 1337 2491:aload_0         
	// 1338 2492:getfield        #12  <Field azh a>
	// 1339 2495:getfield        #173 <Field int azh.d>
	// 1340 2498:ixor            
	// 1341 2499:putfield        #173 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 1342 2502:aload_0         
	// 1343 2503:getfield        #12  <Field azh a>
	// 1344 2506:astore_1        
		abyte0.bE = ((azh) (abyte0)).d & ~a.J;
	// 1345 2507:aload_1         
	// 1346 2508:aload_1         
	// 1347 2509:getfield        #173 <Field int azh.d>
	// 1348 2512:aload_0         
	// 1349 2513:getfield        #12  <Field azh a>
	// 1350 2516:getfield        #176 <Field int azh.J>
	// 1351 2519:iconst_m1       
	// 1352 2520:ixor            
	// 1353 2521:iand            
	// 1354 2522:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 1355 2525:aload_0         
	// 1356 2526:getfield        #12  <Field azh a>
	// 1357 2529:astore_1        
		abyte0.as = ((azh) (abyte0)).d & ~a.J;
	// 1358 2530:aload_1         
	// 1359 2531:aload_1         
	// 1360 2532:getfield        #173 <Field int azh.d>
	// 1361 2535:aload_0         
	// 1362 2536:getfield        #12  <Field azh a>
	// 1363 2539:getfield        #176 <Field int azh.J>
	// 1364 2542:iconst_m1       
	// 1365 2543:ixor            
	// 1366 2544:iand            
	// 1367 2545:putfield        #140 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1368 2548:aload_0         
	// 1369 2549:getfield        #12  <Field azh a>
	// 1370 2552:astore_1        
		abyte0.aF = ((azh) (abyte0)).d & a.J;
	// 1371 2553:aload_1         
	// 1372 2554:aload_1         
	// 1373 2555:getfield        #173 <Field int azh.d>
	// 1374 2558:aload_0         
	// 1375 2559:getfield        #12  <Field azh a>
	// 1376 2562:getfield        #176 <Field int azh.J>
	// 1377 2565:iand            
	// 1378 2566:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 1379 2569:aload_0         
	// 1380 2570:getfield        #12  <Field azh a>
	// 1381 2573:astore_1        
		abyte0.be = ((azh) (abyte0)).S & a.aA;
	// 1382 2574:aload_1         
	// 1383 2575:aload_1         
	// 1384 2576:getfield        #134 <Field int azh.S>
	// 1385 2579:aload_0         
	// 1386 2580:getfield        #12  <Field azh a>
	// 1387 2583:getfield        #83  <Field int azh.aA>
	// 1388 2586:iand            
	// 1389 2587:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1390 2590:aload_0         
	// 1391 2591:getfield        #12  <Field azh a>
	// 1392 2594:astore_1        
		abyte0.be = ((azh) (abyte0)).aA ^ a.be;
	// 1393 2595:aload_1         
	// 1394 2596:aload_1         
	// 1395 2597:getfield        #83  <Field int azh.aA>
	// 1396 2600:aload_0         
	// 1397 2601:getfield        #12  <Field azh a>
	// 1398 2604:getfield        #155 <Field int azh.be>
	// 1399 2607:ixor            
	// 1400 2608:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1401 2611:aload_0         
	// 1402 2612:getfield        #12  <Field azh a>
	// 1403 2615:astore_1        
		abyte0.be = ((azh) (abyte0)).C & a.be;
	// 1404 2616:aload_1         
	// 1405 2617:aload_1         
	// 1406 2618:getfield        #137 <Field int azh.C>
	// 1407 2621:aload_0         
	// 1408 2622:getfield        #12  <Field azh a>
	// 1409 2625:getfield        #155 <Field int azh.be>
	// 1410 2628:iand            
	// 1411 2629:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1412 2632:aload_0         
	// 1413 2633:getfield        #12  <Field azh a>
	// 1414 2636:astore_1        
		abyte0.be = ((azh) (abyte0)).ai & ~a.be;
	// 1415 2637:aload_1         
	// 1416 2638:aload_1         
	// 1417 2639:getfield        #143 <Field int azh.ai>
	// 1418 2642:aload_0         
	// 1419 2643:getfield        #12  <Field azh a>
	// 1420 2646:getfield        #155 <Field int azh.be>
	// 1421 2649:iconst_m1       
	// 1422 2650:ixor            
	// 1423 2651:iand            
	// 1424 2652:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1425 2655:aload_0         
	// 1426 2656:getfield        #12  <Field azh a>
	// 1427 2659:astore_1        
		abyte0.be = ((azh) (abyte0)).aK ^ a.be;
	// 1428 2660:aload_1         
	// 1429 2661:aload_1         
	// 1430 2662:getfield        #131 <Field int azh.aK>
	// 1431 2665:aload_0         
	// 1432 2666:getfield        #12  <Field azh a>
	// 1433 2669:getfield        #155 <Field int azh.be>
	// 1434 2672:ixor            
	// 1435 2673:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1436 2676:aload_0         
	// 1437 2677:getfield        #12  <Field azh a>
	// 1438 2680:astore_1        
		abyte0.aB = ((azh) (abyte0)).be ^ a.aB;
	// 1439 2681:aload_1         
	// 1440 2682:aload_1         
	// 1441 2683:getfield        #155 <Field int azh.be>
	// 1442 2686:aload_0         
	// 1443 2687:getfield        #12  <Field azh a>
	// 1444 2690:getfield        #158 <Field int azh.aB>
	// 1445 2693:ixor            
	// 1446 2694:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1447 2697:aload_0         
	// 1448 2698:getfield        #12  <Field azh a>
	// 1449 2701:astore_1        
		abyte0.x = ((azh) (abyte0)).aB ^ a.x;
	// 1450 2702:aload_1         
	// 1451 2703:aload_1         
	// 1452 2704:getfield        #158 <Field int azh.aB>
	// 1453 2707:aload_0         
	// 1454 2708:getfield        #12  <Field azh a>
	// 1455 2711:getfield        #179 <Field int azh.x>
	// 1456 2714:ixor            
	// 1457 2715:putfield        #179 <Field int azh.x>
		abyte0 = ((byte []) (a));
	// 1458 2718:aload_0         
	// 1459 2719:getfield        #12  <Field azh a>
	// 1460 2722:astore_1        
		abyte0.bK = ((azh) (abyte0)).ah & ~a.bK;
	// 1461 2723:aload_1         
	// 1462 2724:aload_1         
	// 1463 2725:getfield        #113 <Field int azh.ah>
	// 1464 2728:aload_0         
	// 1465 2729:getfield        #12  <Field azh a>
	// 1466 2732:getfield        #116 <Field int azh.bK>
	// 1467 2735:iconst_m1       
	// 1468 2736:ixor            
	// 1469 2737:iand            
	// 1470 2738:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1471 2741:aload_0         
	// 1472 2742:getfield        #12  <Field azh a>
	// 1473 2745:astore_1        
		abyte0.bK = ((azh) (abyte0)).aO ^ a.bK;
	// 1474 2746:aload_1         
	// 1475 2747:aload_1         
	// 1476 2748:getfield        #86  <Field int azh.aO>
	// 1477 2751:aload_0         
	// 1478 2752:getfield        #12  <Field azh a>
	// 1479 2755:getfield        #116 <Field int azh.bK>
	// 1480 2758:ixor            
	// 1481 2759:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1482 2762:aload_0         
	// 1483 2763:getfield        #12  <Field azh a>
	// 1484 2766:astore_1        
		abyte0.ak = ((azh) (abyte0)).bK ^ a.ak;
	// 1485 2767:aload_1         
	// 1486 2768:aload_1         
	// 1487 2769:getfield        #116 <Field int azh.bK>
	// 1488 2772:aload_0         
	// 1489 2773:getfield        #12  <Field azh a>
	// 1490 2776:getfield        #182 <Field int azh.ak>
	// 1491 2779:ixor            
	// 1492 2780:putfield        #182 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 1493 2783:aload_0         
	// 1494 2784:getfield        #12  <Field azh a>
	// 1495 2787:astore_1        
		abyte0.bK = ((azh) (abyte0)).M & a.ak;
	// 1496 2788:aload_1         
	// 1497 2789:aload_1         
	// 1498 2790:getfield        #185 <Field int azh.M>
	// 1499 2793:aload_0         
	// 1500 2794:getfield        #12  <Field azh a>
	// 1501 2797:getfield        #182 <Field int azh.ak>
	// 1502 2800:iand            
	// 1503 2801:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1504 2804:aload_0         
	// 1505 2805:getfield        #12  <Field azh a>
	// 1506 2808:astore_1        
		abyte0.aO = ((azh) (abyte0)).ac & ~a.ak;
	// 1507 2809:aload_1         
	// 1508 2810:aload_1         
	// 1509 2811:getfield        #188 <Field int azh.ac>
	// 1510 2814:aload_0         
	// 1511 2815:getfield        #12  <Field azh a>
	// 1512 2818:getfield        #182 <Field int azh.ak>
	// 1513 2821:iconst_m1       
	// 1514 2822:ixor            
	// 1515 2823:iand            
	// 1516 2824:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 1517 2827:aload_0         
	// 1518 2828:getfield        #12  <Field azh a>
	// 1519 2831:astore_1        
		abyte0.aB = ((azh) (abyte0)).M & a.aO;
	// 1520 2832:aload_1         
	// 1521 2833:aload_1         
	// 1522 2834:getfield        #185 <Field int azh.M>
	// 1523 2837:aload_0         
	// 1524 2838:getfield        #12  <Field azh a>
	// 1525 2841:getfield        #86  <Field int azh.aO>
	// 1526 2844:iand            
	// 1527 2845:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1528 2848:aload_0         
	// 1529 2849:getfield        #12  <Field azh a>
	// 1530 2852:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB & ~a.E;
	// 1531 2853:aload_1         
	// 1532 2854:aload_1         
	// 1533 2855:getfield        #158 <Field int azh.aB>
	// 1534 2858:aload_0         
	// 1535 2859:getfield        #12  <Field azh a>
	// 1536 2862:getfield        #191 <Field int azh.E>
	// 1537 2865:iconst_m1       
	// 1538 2866:ixor            
	// 1539 2867:iand            
	// 1540 2868:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1541 2871:aload_0         
	// 1542 2872:getfield        #12  <Field azh a>
	// 1543 2875:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH & ~a.ak;
	// 1544 2876:aload_1         
	// 1545 2877:aload_1         
	// 1546 2878:getfield        #194 <Field int azh.bH>
	// 1547 2881:aload_0         
	// 1548 2882:getfield        #12  <Field azh a>
	// 1549 2885:getfield        #182 <Field int azh.ak>
	// 1550 2888:iconst_m1       
	// 1551 2889:ixor            
	// 1552 2890:iand            
	// 1553 2891:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1554 2894:aload_0         
	// 1555 2895:getfield        #12  <Field azh a>
	// 1556 2898:astore_1        
		abyte0.bH = ((azh) (abyte0)).aC ^ a.bH;
	// 1557 2899:aload_1         
	// 1558 2900:aload_1         
	// 1559 2901:getfield        #197 <Field int azh.aC>
	// 1560 2904:aload_0         
	// 1561 2905:getfield        #12  <Field azh a>
	// 1562 2908:getfield        #194 <Field int azh.bH>
	// 1563 2911:ixor            
	// 1564 2912:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1565 2915:aload_0         
	// 1566 2916:getfield        #12  <Field azh a>
	// 1567 2919:astore_1        
		abyte0.bs = ((azh) (abyte0)).bs & a.ak;
	// 1568 2920:aload_1         
	// 1569 2921:aload_1         
	// 1570 2922:getfield        #200 <Field int azh.bs>
	// 1571 2925:aload_0         
	// 1572 2926:getfield        #12  <Field azh a>
	// 1573 2929:getfield        #182 <Field int azh.ak>
	// 1574 2932:iand            
	// 1575 2933:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 1576 2936:aload_0         
	// 1577 2937:getfield        #12  <Field azh a>
	// 1578 2940:astore_1        
		abyte0.bs = ((azh) (abyte0)).aC ^ a.bs;
	// 1579 2941:aload_1         
	// 1580 2942:aload_1         
	// 1581 2943:getfield        #197 <Field int azh.aC>
	// 1582 2946:aload_0         
	// 1583 2947:getfield        #12  <Field azh a>
	// 1584 2950:getfield        #200 <Field int azh.bs>
	// 1585 2953:ixor            
	// 1586 2954:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 1587 2957:aload_0         
	// 1588 2958:getfield        #12  <Field azh a>
	// 1589 2961:astore_1        
		abyte0.aC = ((azh) (abyte0)).ac ^ a.ak;
	// 1590 2962:aload_1         
	// 1591 2963:aload_1         
	// 1592 2964:getfield        #188 <Field int azh.ac>
	// 1593 2967:aload_0         
	// 1594 2968:getfield        #12  <Field azh a>
	// 1595 2971:getfield        #182 <Field int azh.ak>
	// 1596 2974:ixor            
	// 1597 2975:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 1598 2978:aload_0         
	// 1599 2979:getfield        #12  <Field azh a>
	// 1600 2982:astore_1        
		abyte0.bb = ((azh) (abyte0)).aC ^ a.bb;
	// 1601 2983:aload_1         
	// 1602 2984:aload_1         
	// 1603 2985:getfield        #197 <Field int azh.aC>
	// 1604 2988:aload_0         
	// 1605 2989:getfield        #12  <Field azh a>
	// 1606 2992:getfield        #203 <Field int azh.bb>
	// 1607 2995:ixor            
	// 1608 2996:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 1609 2999:aload_0         
	// 1610 3000:getfield        #12  <Field azh a>
	// 1611 3003:astore_1        
		abyte0.be = ((azh) (abyte0)).E & ~a.bb;
	// 1612 3004:aload_1         
	// 1613 3005:aload_1         
	// 1614 3006:getfield        #191 <Field int azh.E>
	// 1615 3009:aload_0         
	// 1616 3010:getfield        #12  <Field azh a>
	// 1617 3013:getfield        #203 <Field int azh.bb>
	// 1618 3016:iconst_m1       
	// 1619 3017:ixor            
	// 1620 3018:iand            
	// 1621 3019:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1622 3022:aload_0         
	// 1623 3023:getfield        #12  <Field azh a>
	// 1624 3026:astore_1        
		abyte0.aK = ((azh) (abyte0)).M & a.aC;
	// 1625 3027:aload_1         
	// 1626 3028:aload_1         
	// 1627 3029:getfield        #185 <Field int azh.M>
	// 1628 3032:aload_0         
	// 1629 3033:getfield        #12  <Field azh a>
	// 1630 3036:getfield        #197 <Field int azh.aC>
	// 1631 3039:iand            
	// 1632 3040:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 1633 3043:aload_0         
	// 1634 3044:getfield        #12  <Field azh a>
	// 1635 3047:astore_1        
		abyte0.aA = ((azh) (abyte0)).M & a.aC;
	// 1636 3048:aload_1         
	// 1637 3049:aload_1         
	// 1638 3050:getfield        #185 <Field int azh.M>
	// 1639 3053:aload_0         
	// 1640 3054:getfield        #12  <Field azh a>
	// 1641 3057:getfield        #197 <Field int azh.aC>
	// 1642 3060:iand            
	// 1643 3061:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 1644 3064:aload_0         
	// 1645 3065:getfield        #12  <Field azh a>
	// 1646 3068:astore_1        
		abyte0.aQ = ((azh) (abyte0)).M & a.aC;
	// 1647 3069:aload_1         
	// 1648 3070:aload_1         
	// 1649 3071:getfield        #185 <Field int azh.M>
	// 1650 3074:aload_0         
	// 1651 3075:getfield        #12  <Field azh a>
	// 1652 3078:getfield        #197 <Field int azh.aC>
	// 1653 3081:iand            
	// 1654 3082:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1655 3085:aload_0         
	// 1656 3086:getfield        #12  <Field azh a>
	// 1657 3089:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aO ^ a.aQ;
	// 1658 3090:aload_1         
	// 1659 3091:aload_1         
	// 1660 3092:getfield        #86  <Field int azh.aO>
	// 1661 3095:aload_0         
	// 1662 3096:getfield        #12  <Field azh a>
	// 1663 3099:getfield        #167 <Field int azh.aQ>
	// 1664 3102:ixor            
	// 1665 3103:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1666 3106:aload_0         
	// 1667 3107:getfield        #12  <Field azh a>
	// 1668 3110:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & a.E;
	// 1669 3111:aload_1         
	// 1670 3112:aload_1         
	// 1671 3113:getfield        #167 <Field int azh.aQ>
	// 1672 3116:aload_0         
	// 1673 3117:getfield        #12  <Field azh a>
	// 1674 3120:getfield        #191 <Field int azh.E>
	// 1675 3123:iand            
	// 1676 3124:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1677 3127:aload_0         
	// 1678 3128:getfield        #12  <Field azh a>
	// 1679 3131:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aU ^ a.aQ;
	// 1680 3132:aload_1         
	// 1681 3133:aload_1         
	// 1682 3134:getfield        #206 <Field int azh.aU>
	// 1683 3137:aload_0         
	// 1684 3138:getfield        #12  <Field azh a>
	// 1685 3141:getfield        #167 <Field int azh.aQ>
	// 1686 3144:ixor            
	// 1687 3145:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1688 3148:aload_0         
	// 1689 3149:getfield        #12  <Field azh a>
	// 1690 3152:astore_1        
		abyte0.aQ = ((azh) (abyte0)).a & ~a.aQ;
	// 1691 3153:aload_1         
	// 1692 3154:aload_1         
	// 1693 3155:getfield        #208 <Field int azh.a>
	// 1694 3158:aload_0         
	// 1695 3159:getfield        #12  <Field azh a>
	// 1696 3162:getfield        #167 <Field int azh.aQ>
	// 1697 3165:iconst_m1       
	// 1698 3166:ixor            
	// 1699 3167:iand            
	// 1700 3168:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1701 3171:aload_0         
	// 1702 3172:getfield        #12  <Field azh a>
	// 1703 3175:astore_1        
		abyte0.aC = ((azh) (abyte0)).M & ~a.aC;
	// 1704 3176:aload_1         
	// 1705 3177:aload_1         
	// 1706 3178:getfield        #185 <Field int azh.M>
	// 1707 3181:aload_0         
	// 1708 3182:getfield        #12  <Field azh a>
	// 1709 3185:getfield        #197 <Field int azh.aC>
	// 1710 3188:iconst_m1       
	// 1711 3189:ixor            
	// 1712 3190:iand            
	// 1713 3191:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 1714 3194:aload_0         
	// 1715 3195:getfield        #12  <Field azh a>
	// 1716 3198:astore_1        
		abyte0.aC = ((azh) (abyte0)).ac ^ a.aC;
	// 1717 3199:aload_1         
	// 1718 3200:aload_1         
	// 1719 3201:getfield        #188 <Field int azh.ac>
	// 1720 3204:aload_0         
	// 1721 3205:getfield        #12  <Field azh a>
	// 1722 3208:getfield        #197 <Field int azh.aC>
	// 1723 3211:ixor            
	// 1724 3212:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 1725 3215:aload_0         
	// 1726 3216:getfield        #12  <Field azh a>
	// 1727 3219:astore_1        
		abyte0.be = ((azh) (abyte0)).aC ^ a.be;
	// 1728 3220:aload_1         
	// 1729 3221:aload_1         
	// 1730 3222:getfield        #197 <Field int azh.aC>
	// 1731 3225:aload_0         
	// 1732 3226:getfield        #12  <Field azh a>
	// 1733 3229:getfield        #155 <Field int azh.be>
	// 1734 3232:ixor            
	// 1735 3233:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1736 3236:aload_0         
	// 1737 3237:getfield        #12  <Field azh a>
	// 1738 3240:astore_1        
		abyte0.aU = ((azh) (abyte0)).M & ~a.ak;
	// 1739 3241:aload_1         
	// 1740 3242:aload_1         
	// 1741 3243:getfield        #185 <Field int azh.M>
	// 1742 3246:aload_0         
	// 1743 3247:getfield        #12  <Field azh a>
	// 1744 3250:getfield        #182 <Field int azh.ak>
	// 1745 3253:iconst_m1       
	// 1746 3254:ixor            
	// 1747 3255:iand            
	// 1748 3256:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 1749 3259:aload_0         
	// 1750 3260:getfield        #12  <Field azh a>
	// 1751 3263:astore_1        
		abyte0.aU = ((azh) (abyte0)).ak ^ a.aU;
	// 1752 3264:aload_1         
	// 1753 3265:aload_1         
	// 1754 3266:getfield        #182 <Field int azh.ak>
	// 1755 3269:aload_0         
	// 1756 3270:getfield        #12  <Field azh a>
	// 1757 3273:getfield        #206 <Field int azh.aU>
	// 1758 3276:ixor            
	// 1759 3277:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 1760 3280:aload_0         
	// 1761 3281:getfield        #12  <Field azh a>
	// 1762 3284:astore_1        
		abyte0.aG = ((azh) (abyte0)).ak & ~a.aG;
	// 1763 3285:aload_1         
	// 1764 3286:aload_1         
	// 1765 3287:getfield        #182 <Field int azh.ak>
	// 1766 3290:aload_0         
	// 1767 3291:getfield        #12  <Field azh a>
	// 1768 3294:getfield        #211 <Field int azh.aG>
	// 1769 3297:iconst_m1       
	// 1770 3298:ixor            
	// 1771 3299:iand            
	// 1772 3300:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 1773 3303:aload_0         
	// 1774 3304:getfield        #12  <Field azh a>
	// 1775 3307:astore_1        
		abyte0.aG = ((azh) (abyte0)).aH ^ a.aG;
	// 1776 3308:aload_1         
	// 1777 3309:aload_1         
	// 1778 3310:getfield        #214 <Field int azh.aH>
	// 1779 3313:aload_0         
	// 1780 3314:getfield        #12  <Field azh a>
	// 1781 3317:getfield        #211 <Field int azh.aG>
	// 1782 3320:ixor            
	// 1783 3321:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 1784 3324:aload_0         
	// 1785 3325:getfield        #12  <Field azh a>
	// 1786 3328:astore_1        
		abyte0.aR = ((azh) (abyte0)).ak & ~a.aR;
	// 1787 3329:aload_1         
	// 1788 3330:aload_1         
	// 1789 3331:getfield        #182 <Field int azh.ak>
	// 1790 3334:aload_0         
	// 1791 3335:getfield        #12  <Field azh a>
	// 1792 3338:getfield        #217 <Field int azh.aR>
	// 1793 3341:iconst_m1       
	// 1794 3342:ixor            
	// 1795 3343:iand            
	// 1796 3344:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 1797 3347:aload_0         
	// 1798 3348:getfield        #12  <Field azh a>
	// 1799 3351:astore_1        
		abyte0.aR = ((azh) (abyte0)).aL ^ a.aR;
	// 1800 3352:aload_1         
	// 1801 3353:aload_1         
	// 1802 3354:getfield        #220 <Field int azh.aL>
	// 1803 3357:aload_0         
	// 1804 3358:getfield        #12  <Field azh a>
	// 1805 3361:getfield        #217 <Field int azh.aR>
	// 1806 3364:ixor            
	// 1807 3365:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 1808 3368:aload_0         
	// 1809 3369:getfield        #12  <Field azh a>
	// 1810 3372:astore_1        
		abyte0.aR = ((azh) (abyte0)).a & a.aR;
	// 1811 3373:aload_1         
	// 1812 3374:aload_1         
	// 1813 3375:getfield        #208 <Field int azh.a>
	// 1814 3378:aload_0         
	// 1815 3379:getfield        #12  <Field azh a>
	// 1816 3382:getfield        #217 <Field int azh.aR>
	// 1817 3385:iand            
	// 1818 3386:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 1819 3389:aload_0         
	// 1820 3390:getfield        #12  <Field azh a>
	// 1821 3393:astore_1        
		abyte0.aR = ((azh) (abyte0)).bs ^ a.aR;
	// 1822 3394:aload_1         
	// 1823 3395:aload_1         
	// 1824 3396:getfield        #200 <Field int azh.bs>
	// 1825 3399:aload_0         
	// 1826 3400:getfield        #12  <Field azh a>
	// 1827 3403:getfield        #217 <Field int azh.aR>
	// 1828 3406:ixor            
	// 1829 3407:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 1830 3410:aload_0         
	// 1831 3411:getfield        #12  <Field azh a>
	// 1832 3414:astore_1        
		abyte0.F = ((azh) (abyte0)).aR ^ a.F;
	// 1833 3415:aload_1         
	// 1834 3416:aload_1         
	// 1835 3417:getfield        #217 <Field int azh.aR>
	// 1836 3420:aload_0         
	// 1837 3421:getfield        #12  <Field azh a>
	// 1838 3424:getfield        #223 <Field int azh.F>
	// 1839 3427:ixor            
	// 1840 3428:putfield        #223 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 1841 3431:aload_0         
	// 1842 3432:getfield        #12  <Field azh a>
	// 1843 3435:astore_1        
		abyte0.bg = ((azh) (abyte0)).bg & ~a.ak;
	// 1844 3436:aload_1         
	// 1845 3437:aload_1         
	// 1846 3438:getfield        #226 <Field int azh.bg>
	// 1847 3441:aload_0         
	// 1848 3442:getfield        #12  <Field azh a>
	// 1849 3445:getfield        #182 <Field int azh.ak>
	// 1850 3448:iconst_m1       
	// 1851 3449:ixor            
	// 1852 3450:iand            
	// 1853 3451:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1854 3454:aload_0         
	// 1855 3455:getfield        #12  <Field azh a>
	// 1856 3458:astore_1        
		abyte0.bg = ((azh) (abyte0)).aL ^ a.bg;
	// 1857 3459:aload_1         
	// 1858 3460:aload_1         
	// 1859 3461:getfield        #220 <Field int azh.aL>
	// 1860 3464:aload_0         
	// 1861 3465:getfield        #12  <Field azh a>
	// 1862 3468:getfield        #226 <Field int azh.bg>
	// 1863 3471:ixor            
	// 1864 3472:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1865 3475:aload_0         
	// 1866 3476:getfield        #12  <Field azh a>
	// 1867 3479:astore_1        
		abyte0.bg = ((azh) (abyte0)).a & a.bg;
	// 1868 3480:aload_1         
	// 1869 3481:aload_1         
	// 1870 3482:getfield        #208 <Field int azh.a>
	// 1871 3485:aload_0         
	// 1872 3486:getfield        #12  <Field azh a>
	// 1873 3489:getfield        #226 <Field int azh.bg>
	// 1874 3492:iand            
	// 1875 3493:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1876 3496:aload_0         
	// 1877 3497:getfield        #12  <Field azh a>
	// 1878 3500:astore_1        
		abyte0.bg = ((azh) (abyte0)).bH ^ a.bg;
	// 1879 3501:aload_1         
	// 1880 3502:aload_1         
	// 1881 3503:getfield        #194 <Field int azh.bH>
	// 1882 3506:aload_0         
	// 1883 3507:getfield        #12  <Field azh a>
	// 1884 3510:getfield        #226 <Field int azh.bg>
	// 1885 3513:ixor            
	// 1886 3514:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1887 3517:aload_0         
	// 1888 3518:getfield        #12  <Field azh a>
	// 1889 3521:astore_1        
		abyte0.B = ((azh) (abyte0)).bg ^ a.B;
	// 1890 3522:aload_1         
	// 1891 3523:aload_1         
	// 1892 3524:getfield        #226 <Field int azh.bg>
	// 1893 3527:aload_0         
	// 1894 3528:getfield        #12  <Field azh a>
	// 1895 3531:getfield        #229 <Field int azh.B>
	// 1896 3534:ixor            
	// 1897 3535:putfield        #229 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 1898 3538:aload_0         
	// 1899 3539:getfield        #12  <Field azh a>
	// 1900 3542:astore_1        
		abyte0.bg = ((azh) (abyte0)).B | a.aJ;
	// 1901 3543:aload_1         
	// 1902 3544:aload_1         
	// 1903 3545:getfield        #229 <Field int azh.B>
	// 1904 3548:aload_0         
	// 1905 3549:getfield        #12  <Field azh a>
	// 1906 3552:getfield        #65  <Field int azh.aJ>
	// 1907 3555:ior             
	// 1908 3556:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 1909 3559:aload_0         
	// 1910 3560:getfield        #12  <Field azh a>
	// 1911 3563:astore_1        
		abyte0.bH = ((azh) (abyte0)).B | a.J;
	// 1912 3564:aload_1         
	// 1913 3565:aload_1         
	// 1914 3566:getfield        #229 <Field int azh.B>
	// 1915 3569:aload_0         
	// 1916 3570:getfield        #12  <Field azh a>
	// 1917 3573:getfield        #176 <Field int azh.J>
	// 1918 3576:ior             
	// 1919 3577:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1920 3580:aload_0         
	// 1921 3581:getfield        #12  <Field azh a>
	// 1922 3584:astore_1        
		abyte0.aL = ((azh) (abyte0)).ak | a.ac;
	// 1923 3585:aload_1         
	// 1924 3586:aload_1         
	// 1925 3587:getfield        #182 <Field int azh.ak>
	// 1926 3590:aload_0         
	// 1927 3591:getfield        #12  <Field azh a>
	// 1928 3594:getfield        #188 <Field int azh.ac>
	// 1929 3597:ior             
	// 1930 3598:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 1931 3601:aload_0         
	// 1932 3602:getfield        #12  <Field azh a>
	// 1933 3605:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aL ^ a.aZ;
	// 1934 3606:aload_1         
	// 1935 3607:aload_1         
	// 1936 3608:getfield        #220 <Field int azh.aL>
	// 1937 3611:aload_0         
	// 1938 3612:getfield        #12  <Field azh a>
	// 1939 3615:getfield        #232 <Field int azh.aZ>
	// 1940 3618:ixor            
	// 1941 3619:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 1942 3622:aload_0         
	// 1943 3623:getfield        #12  <Field azh a>
	// 1944 3626:astore_1        
		abyte0.aI = ((azh) (abyte0)).aZ ^ a.aI;
	// 1945 3627:aload_1         
	// 1946 3628:aload_1         
	// 1947 3629:getfield        #232 <Field int azh.aZ>
	// 1948 3632:aload_0         
	// 1949 3633:getfield        #12  <Field azh a>
	// 1950 3636:getfield        #235 <Field int azh.aI>
	// 1951 3639:ixor            
	// 1952 3640:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1953 3643:aload_0         
	// 1954 3644:getfield        #12  <Field azh a>
	// 1955 3647:astore_1        
		abyte0.aB = ((azh) (abyte0)).aZ ^ a.aB;
	// 1956 3648:aload_1         
	// 1957 3649:aload_1         
	// 1958 3650:getfield        #232 <Field int azh.aZ>
	// 1959 3653:aload_0         
	// 1960 3654:getfield        #12  <Field azh a>
	// 1961 3657:getfield        #158 <Field int azh.aB>
	// 1962 3660:ixor            
	// 1963 3661:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1964 3664:aload_0         
	// 1965 3665:getfield        #12  <Field azh a>
	// 1966 3668:astore_1        
		abyte0.aB = ((azh) (abyte0)).a & a.aB;
	// 1967 3669:aload_1         
	// 1968 3670:aload_1         
	// 1969 3671:getfield        #208 <Field int azh.a>
	// 1970 3674:aload_0         
	// 1971 3675:getfield        #12  <Field azh a>
	// 1972 3678:getfield        #158 <Field int azh.aB>
	// 1973 3681:iand            
	// 1974 3682:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 1975 3685:aload_0         
	// 1976 3686:getfield        #12  <Field azh a>
	// 1977 3689:astore_1        
		abyte0.aZ = ((azh) (abyte0)).M & a.aL;
	// 1978 3690:aload_1         
	// 1979 3691:aload_1         
	// 1980 3692:getfield        #185 <Field int azh.M>
	// 1981 3695:aload_0         
	// 1982 3696:getfield        #12  <Field azh a>
	// 1983 3699:getfield        #220 <Field int azh.aL>
	// 1984 3702:iand            
	// 1985 3703:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 1986 3706:aload_0         
	// 1987 3707:getfield        #12  <Field azh a>
	// 1988 3710:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aO ^ a.aZ;
	// 1989 3711:aload_1         
	// 1990 3712:aload_1         
	// 1991 3713:getfield        #86  <Field int azh.aO>
	// 1992 3716:aload_0         
	// 1993 3717:getfield        #12  <Field azh a>
	// 1994 3720:getfield        #232 <Field int azh.aZ>
	// 1995 3723:ixor            
	// 1996 3724:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 1997 3727:aload_0         
	// 1998 3728:getfield        #12  <Field azh a>
	// 1999 3731:astore_1        
		abyte0.aR = ((azh) (abyte0)).aZ & a.E;
	// 2000 3732:aload_1         
	// 2001 3733:aload_1         
	// 2002 3734:getfield        #232 <Field int azh.aZ>
	// 2003 3737:aload_0         
	// 2004 3738:getfield        #12  <Field azh a>
	// 2005 3741:getfield        #191 <Field int azh.E>
	// 2006 3744:iand            
	// 2007 3745:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 2008 3748:aload_0         
	// 2009 3749:getfield        #12  <Field azh a>
	// 2010 3752:astore_1        
		abyte0.aK = ((azh) (abyte0)).aL ^ a.aK;
	// 2011 3753:aload_1         
	// 2012 3754:aload_1         
	// 2013 3755:getfield        #220 <Field int azh.aL>
	// 2014 3758:aload_0         
	// 2015 3759:getfield        #12  <Field azh a>
	// 2016 3762:getfield        #131 <Field int azh.aK>
	// 2017 3765:ixor            
	// 2018 3766:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2019 3769:aload_0         
	// 2020 3770:getfield        #12  <Field azh a>
	// 2021 3773:astore_1        
		abyte0.aK = ((azh) (abyte0)).E & ~a.aK;
	// 2022 3774:aload_1         
	// 2023 3775:aload_1         
	// 2024 3776:getfield        #191 <Field int azh.E>
	// 2025 3779:aload_0         
	// 2026 3780:getfield        #12  <Field azh a>
	// 2027 3783:getfield        #131 <Field int azh.aK>
	// 2028 3786:iconst_m1       
	// 2029 3787:ixor            
	// 2030 3788:iand            
	// 2031 3789:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2032 3792:aload_0         
	// 2033 3793:getfield        #12  <Field azh a>
	// 2034 3796:astore_1        
		abyte0.aK = ((azh) (abyte0)).aC ^ a.aK;
	// 2035 3797:aload_1         
	// 2036 3798:aload_1         
	// 2037 3799:getfield        #197 <Field int azh.aC>
	// 2038 3802:aload_0         
	// 2039 3803:getfield        #12  <Field azh a>
	// 2040 3806:getfield        #131 <Field int azh.aK>
	// 2041 3809:ixor            
	// 2042 3810:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2043 3813:aload_0         
	// 2044 3814:getfield        #12  <Field azh a>
	// 2045 3817:astore_1        
		abyte0.aK = ((azh) (abyte0)).a & ~a.aK;
	// 2046 3818:aload_1         
	// 2047 3819:aload_1         
	// 2048 3820:getfield        #208 <Field int azh.a>
	// 2049 3823:aload_0         
	// 2050 3824:getfield        #12  <Field azh a>
	// 2051 3827:getfield        #131 <Field int azh.aK>
	// 2052 3830:iconst_m1       
	// 2053 3831:ixor            
	// 2054 3832:iand            
	// 2055 3833:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2056 3836:aload_0         
	// 2057 3837:getfield        #12  <Field azh a>
	// 2058 3840:astore_1        
		abyte0.aK = ((azh) (abyte0)).be ^ a.aK;
	// 2059 3841:aload_1         
	// 2060 3842:aload_1         
	// 2061 3843:getfield        #155 <Field int azh.be>
	// 2062 3846:aload_0         
	// 2063 3847:getfield        #12  <Field azh a>
	// 2064 3850:getfield        #131 <Field int azh.aK>
	// 2065 3853:ixor            
	// 2066 3854:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2067 3857:aload_0         
	// 2068 3858:getfield        #12  <Field azh a>
	// 2069 3861:astore_1        
		abyte0.aK = ((azh) (abyte0)).aK & ~a.U;
	// 2070 3862:aload_1         
	// 2071 3863:aload_1         
	// 2072 3864:getfield        #131 <Field int azh.aK>
	// 2073 3867:aload_0         
	// 2074 3868:getfield        #12  <Field azh a>
	// 2075 3871:getfield        #238 <Field int azh.U>
	// 2076 3874:iconst_m1       
	// 2077 3875:ixor            
	// 2078 3876:iand            
	// 2079 3877:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2080 3880:aload_0         
	// 2081 3881:getfield        #12  <Field azh a>
	// 2082 3884:astore_1        
		abyte0.be = ((azh) (abyte0)).aL & ~a.ak;
	// 2083 3885:aload_1         
	// 2084 3886:aload_1         
	// 2085 3887:getfield        #220 <Field int azh.aL>
	// 2086 3890:aload_0         
	// 2087 3891:getfield        #12  <Field azh a>
	// 2088 3894:getfield        #182 <Field int azh.ak>
	// 2089 3897:iconst_m1       
	// 2090 3898:ixor            
	// 2091 3899:iand            
	// 2092 3900:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 2093 3903:aload_0         
	// 2094 3904:getfield        #12  <Field azh a>
	// 2095 3907:astore_1        
		abyte0.bs = ((azh) (abyte0)).M & ~a.be;
	// 2096 3908:aload_1         
	// 2097 3909:aload_1         
	// 2098 3910:getfield        #185 <Field int azh.M>
	// 2099 3913:aload_0         
	// 2100 3914:getfield        #12  <Field azh a>
	// 2101 3917:getfield        #155 <Field int azh.be>
	// 2102 3920:iconst_m1       
	// 2103 3921:ixor            
	// 2104 3922:iand            
	// 2105 3923:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2106 3926:aload_0         
	// 2107 3927:getfield        #12  <Field azh a>
	// 2108 3930:astore_1        
		abyte0.bs = ((azh) (abyte0)).E & ~a.bs;
	// 2109 3931:aload_1         
	// 2110 3932:aload_1         
	// 2111 3933:getfield        #191 <Field int azh.E>
	// 2112 3936:aload_0         
	// 2113 3937:getfield        #12  <Field azh a>
	// 2114 3940:getfield        #200 <Field int azh.bs>
	// 2115 3943:iconst_m1       
	// 2116 3944:ixor            
	// 2117 3945:iand            
	// 2118 3946:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2119 3949:aload_0         
	// 2120 3950:getfield        #12  <Field azh a>
	// 2121 3953:astore_1        
		abyte0.aH = ((azh) (abyte0)).M & ~a.be;
	// 2122 3954:aload_1         
	// 2123 3955:aload_1         
	// 2124 3956:getfield        #185 <Field int azh.M>
	// 2125 3959:aload_0         
	// 2126 3960:getfield        #12  <Field azh a>
	// 2127 3963:getfield        #155 <Field int azh.be>
	// 2128 3966:iconst_m1       
	// 2129 3967:ixor            
	// 2130 3968:iand            
	// 2131 3969:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 2132 3972:aload_0         
	// 2133 3973:getfield        #12  <Field azh a>
	// 2134 3976:astore_1        
		abyte0.aH = ((azh) (abyte0)).aO ^ a.aH;
	// 2135 3977:aload_1         
	// 2136 3978:aload_1         
	// 2137 3979:getfield        #86  <Field int azh.aO>
	// 2138 3982:aload_0         
	// 2139 3983:getfield        #12  <Field azh a>
	// 2140 3986:getfield        #214 <Field int azh.aH>
	// 2141 3989:ixor            
	// 2142 3990:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 2143 3993:aload_0         
	// 2144 3994:getfield        #12  <Field azh a>
	// 2145 3997:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & ~a.E;
	// 2146 3998:aload_1         
	// 2147 3999:aload_1         
	// 2148 4000:getfield        #214 <Field int azh.aH>
	// 2149 4003:aload_0         
	// 2150 4004:getfield        #12  <Field azh a>
	// 2151 4007:getfield        #191 <Field int azh.E>
	// 2152 4010:iconst_m1       
	// 2153 4011:ixor            
	// 2154 4012:iand            
	// 2155 4013:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 2156 4016:aload_0         
	// 2157 4017:getfield        #12  <Field azh a>
	// 2158 4020:astore_1        
		abyte0.aH = ((azh) (abyte0)).aZ ^ a.aH;
	// 2159 4021:aload_1         
	// 2160 4022:aload_1         
	// 2161 4023:getfield        #232 <Field int azh.aZ>
	// 2162 4026:aload_0         
	// 2163 4027:getfield        #12  <Field azh a>
	// 2164 4030:getfield        #214 <Field int azh.aH>
	// 2165 4033:ixor            
	// 2166 4034:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 2167 4037:aload_0         
	// 2168 4038:getfield        #12  <Field azh a>
	// 2169 4041:astore_1        
		abyte0.aH = ((azh) (abyte0)).a & ~a.aH;
	// 2170 4042:aload_1         
	// 2171 4043:aload_1         
	// 2172 4044:getfield        #208 <Field int azh.a>
	// 2173 4047:aload_0         
	// 2174 4048:getfield        #12  <Field azh a>
	// 2175 4051:getfield        #214 <Field int azh.aH>
	// 2176 4054:iconst_m1       
	// 2177 4055:ixor            
	// 2178 4056:iand            
	// 2179 4057:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 2180 4060:aload_0         
	// 2181 4061:getfield        #12  <Field azh a>
	// 2182 4064:astore_1        
		abyte0.at = ((azh) (abyte0)).be ^ a.at;
	// 2183 4065:aload_1         
	// 2184 4066:aload_1         
	// 2185 4067:getfield        #155 <Field int azh.be>
	// 2186 4070:aload_0         
	// 2187 4071:getfield        #12  <Field azh a>
	// 2188 4074:getfield        #241 <Field int azh.at>
	// 2189 4077:ixor            
	// 2190 4078:putfield        #241 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 2191 4081:aload_0         
	// 2192 4082:getfield        #12  <Field azh a>
	// 2193 4085:astore_1        
		abyte0.at = ((azh) (abyte0)).E | a.at;
	// 2194 4086:aload_1         
	// 2195 4087:aload_1         
	// 2196 4088:getfield        #191 <Field int azh.E>
	// 2197 4091:aload_0         
	// 2198 4092:getfield        #12  <Field azh a>
	// 2199 4095:getfield        #241 <Field int azh.at>
	// 2200 4098:ior             
	// 2201 4099:putfield        #241 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 2202 4102:aload_0         
	// 2203 4103:getfield        #12  <Field azh a>
	// 2204 4106:astore_1        
		abyte0.at = ((azh) (abyte0)).bb ^ a.at;
	// 2205 4107:aload_1         
	// 2206 4108:aload_1         
	// 2207 4109:getfield        #203 <Field int azh.bb>
	// 2208 4112:aload_0         
	// 2209 4113:getfield        #12  <Field azh a>
	// 2210 4116:getfield        #241 <Field int azh.at>
	// 2211 4119:ixor            
	// 2212 4120:putfield        #241 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 2213 4123:aload_0         
	// 2214 4124:getfield        #12  <Field azh a>
	// 2215 4127:astore_1        
		abyte0.bb = ((azh) (abyte0)).ak & ~a.ac;
	// 2216 4128:aload_1         
	// 2217 4129:aload_1         
	// 2218 4130:getfield        #182 <Field int azh.ak>
	// 2219 4133:aload_0         
	// 2220 4134:getfield        #12  <Field azh a>
	// 2221 4137:getfield        #188 <Field int azh.ac>
	// 2222 4140:iconst_m1       
	// 2223 4141:ixor            
	// 2224 4142:iand            
	// 2225 4143:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2226 4146:aload_0         
	// 2227 4147:getfield        #12  <Field azh a>
	// 2228 4150:astore_1        
		abyte0.aZ = ((azh) (abyte0)).M & a.bb;
	// 2229 4151:aload_1         
	// 2230 4152:aload_1         
	// 2231 4153:getfield        #185 <Field int azh.M>
	// 2232 4156:aload_0         
	// 2233 4157:getfield        #12  <Field azh a>
	// 2234 4160:getfield        #203 <Field int azh.bb>
	// 2235 4163:iand            
	// 2236 4164:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2237 4167:aload_0         
	// 2238 4168:getfield        #12  <Field azh a>
	// 2239 4171:astore_1        
		abyte0.bb = ((azh) (abyte0)).M & a.bb;
	// 2240 4172:aload_1         
	// 2241 4173:aload_1         
	// 2242 4174:getfield        #185 <Field int azh.M>
	// 2243 4177:aload_0         
	// 2244 4178:getfield        #12  <Field azh a>
	// 2245 4181:getfield        #203 <Field int azh.bb>
	// 2246 4184:iand            
	// 2247 4185:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2248 4188:aload_0         
	// 2249 4189:getfield        #12  <Field azh a>
	// 2250 4192:astore_1        
		abyte0.bb = ((azh) (abyte0)).be ^ a.bb;
	// 2251 4193:aload_1         
	// 2252 4194:aload_1         
	// 2253 4195:getfield        #155 <Field int azh.be>
	// 2254 4198:aload_0         
	// 2255 4199:getfield        #12  <Field azh a>
	// 2256 4202:getfield        #203 <Field int azh.bb>
	// 2257 4205:ixor            
	// 2258 4206:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2259 4209:aload_0         
	// 2260 4210:getfield        #12  <Field azh a>
	// 2261 4213:astore_1        
		abyte0.bb = ((azh) (abyte0)).E & ~a.bb;
	// 2262 4214:aload_1         
	// 2263 4215:aload_1         
	// 2264 4216:getfield        #191 <Field int azh.E>
	// 2265 4219:aload_0         
	// 2266 4220:getfield        #12  <Field azh a>
	// 2267 4223:getfield        #203 <Field int azh.bb>
	// 2268 4226:iconst_m1       
	// 2269 4227:ixor            
	// 2270 4228:iand            
	// 2271 4229:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2272 4232:aload_0         
	// 2273 4233:getfield        #12  <Field azh a>
	// 2274 4236:astore_1        
		abyte0.bb = ((azh) (abyte0)).aC ^ a.bb;
	// 2275 4237:aload_1         
	// 2276 4238:aload_1         
	// 2277 4239:getfield        #197 <Field int azh.aC>
	// 2278 4242:aload_0         
	// 2279 4243:getfield        #12  <Field azh a>
	// 2280 4246:getfield        #203 <Field int azh.bb>
	// 2281 4249:ixor            
	// 2282 4250:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2283 4253:aload_0         
	// 2284 4254:getfield        #12  <Field azh a>
	// 2285 4257:astore_1        
		abyte0.bb = ((azh) (abyte0)).a & a.bb;
	// 2286 4258:aload_1         
	// 2287 4259:aload_1         
	// 2288 4260:getfield        #208 <Field int azh.a>
	// 2289 4263:aload_0         
	// 2290 4264:getfield        #12  <Field azh a>
	// 2291 4267:getfield        #203 <Field int azh.bb>
	// 2292 4270:iand            
	// 2293 4271:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2294 4274:aload_0         
	// 2295 4275:getfield        #12  <Field azh a>
	// 2296 4278:astore_1        
		abyte0.bb = ((azh) (abyte0)).at ^ a.bb;
	// 2297 4279:aload_1         
	// 2298 4280:aload_1         
	// 2299 4281:getfield        #241 <Field int azh.at>
	// 2300 4284:aload_0         
	// 2301 4285:getfield        #12  <Field azh a>
	// 2302 4288:getfield        #203 <Field int azh.bb>
	// 2303 4291:ixor            
	// 2304 4292:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2305 4295:aload_0         
	// 2306 4296:getfield        #12  <Field azh a>
	// 2307 4299:astore_1        
		abyte0.aK = ((azh) (abyte0)).bb ^ a.aK;
	// 2308 4300:aload_1         
	// 2309 4301:aload_1         
	// 2310 4302:getfield        #203 <Field int azh.bb>
	// 2311 4305:aload_0         
	// 2312 4306:getfield        #12  <Field azh a>
	// 2313 4309:getfield        #131 <Field int azh.aK>
	// 2314 4312:ixor            
	// 2315 4313:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2316 4316:aload_0         
	// 2317 4317:getfield        #12  <Field azh a>
	// 2318 4320:astore_1        
		abyte0.ah = ((azh) (abyte0)).aK ^ a.ah;
	// 2319 4321:aload_1         
	// 2320 4322:aload_1         
	// 2321 4323:getfield        #131 <Field int azh.aK>
	// 2322 4326:aload_0         
	// 2323 4327:getfield        #12  <Field azh a>
	// 2324 4330:getfield        #113 <Field int azh.ah>
	// 2325 4333:ixor            
	// 2326 4334:putfield        #113 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 2327 4337:aload_0         
	// 2328 4338:getfield        #12  <Field azh a>
	// 2329 4341:astore_1        
		abyte0.bA = ((azh) (abyte0)).ak & ~a.bA;
	// 2330 4342:aload_1         
	// 2331 4343:aload_1         
	// 2332 4344:getfield        #182 <Field int azh.ak>
	// 2333 4347:aload_0         
	// 2334 4348:getfield        #12  <Field azh a>
	// 2335 4351:getfield        #244 <Field int azh.bA>
	// 2336 4354:iconst_m1       
	// 2337 4355:ixor            
	// 2338 4356:iand            
	// 2339 4357:putfield        #244 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 2340 4360:aload_0         
	// 2341 4361:getfield        #12  <Field azh a>
	// 2342 4364:astore_1        
		abyte0.bA = ((azh) (abyte0)).bf ^ a.bA;
	// 2343 4365:aload_1         
	// 2344 4366:aload_1         
	// 2345 4367:getfield        #247 <Field int azh.bf>
	// 2346 4370:aload_0         
	// 2347 4371:getfield        #12  <Field azh a>
	// 2348 4374:getfield        #244 <Field int azh.bA>
	// 2349 4377:ixor            
	// 2350 4378:putfield        #244 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 2351 4381:aload_0         
	// 2352 4382:getfield        #12  <Field azh a>
	// 2353 4385:astore_1        
		abyte0.bA = ((azh) (abyte0)).a & ~a.bA;
	// 2354 4386:aload_1         
	// 2355 4387:aload_1         
	// 2356 4388:getfield        #208 <Field int azh.a>
	// 2357 4391:aload_0         
	// 2358 4392:getfield        #12  <Field azh a>
	// 2359 4395:getfield        #244 <Field int azh.bA>
	// 2360 4398:iconst_m1       
	// 2361 4399:ixor            
	// 2362 4400:iand            
	// 2363 4401:putfield        #244 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 2364 4404:aload_0         
	// 2365 4405:getfield        #12  <Field azh a>
	// 2366 4408:astore_1        
		abyte0.bA = ((azh) (abyte0)).aG ^ a.bA;
	// 2367 4409:aload_1         
	// 2368 4410:aload_1         
	// 2369 4411:getfield        #211 <Field int azh.aG>
	// 2370 4414:aload_0         
	// 2371 4415:getfield        #12  <Field azh a>
	// 2372 4418:getfield        #244 <Field int azh.bA>
	// 2373 4421:ixor            
	// 2374 4422:putfield        #244 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 2375 4425:aload_0         
	// 2376 4426:getfield        #12  <Field azh a>
	// 2377 4429:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA ^ a.n;
	// 2378 4430:aload_1         
	// 2379 4431:aload_1         
	// 2380 4432:getfield        #244 <Field int azh.bA>
	// 2381 4435:aload_0         
	// 2382 4436:getfield        #12  <Field azh a>
	// 2383 4439:getfield        #80  <Field int azh.n>
	// 2384 4442:ixor            
	// 2385 4443:putfield        #244 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 2386 4446:aload_0         
	// 2387 4447:getfield        #12  <Field azh a>
	// 2388 4450:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & a.ak;
	// 2389 4451:aload_1         
	// 2390 4452:aload_1         
	// 2391 4453:getfield        #250 <Field int azh.ar>
	// 2392 4456:aload_0         
	// 2393 4457:getfield        #12  <Field azh a>
	// 2394 4460:getfield        #182 <Field int azh.ak>
	// 2395 4463:iand            
	// 2396 4464:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2397 4467:aload_0         
	// 2398 4468:getfield        #12  <Field azh a>
	// 2399 4471:astore_1        
		abyte0.ar = ((azh) (abyte0)).ao ^ a.ar;
	// 2400 4472:aload_1         
	// 2401 4473:aload_1         
	// 2402 4474:getfield        #253 <Field int azh.ao>
	// 2403 4477:aload_0         
	// 2404 4478:getfield        #12  <Field azh a>
	// 2405 4481:getfield        #250 <Field int azh.ar>
	// 2406 4484:ixor            
	// 2407 4485:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2408 4488:aload_0         
	// 2409 4489:getfield        #12  <Field azh a>
	// 2410 4492:astore_1        
		abyte0.ar = ((azh) (abyte0)).a & ~a.ar;
	// 2411 4493:aload_1         
	// 2412 4494:aload_1         
	// 2413 4495:getfield        #208 <Field int azh.a>
	// 2414 4498:aload_0         
	// 2415 4499:getfield        #12  <Field azh a>
	// 2416 4502:getfield        #250 <Field int azh.ar>
	// 2417 4505:iconst_m1       
	// 2418 4506:ixor            
	// 2419 4507:iand            
	// 2420 4508:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2421 4511:aload_0         
	// 2422 4512:getfield        #12  <Field azh a>
	// 2423 4515:astore_1        
		abyte0.ao = ((azh) (abyte0)).M & a.ak;
	// 2424 4516:aload_1         
	// 2425 4517:aload_1         
	// 2426 4518:getfield        #185 <Field int azh.M>
	// 2427 4521:aload_0         
	// 2428 4522:getfield        #12  <Field azh a>
	// 2429 4525:getfield        #182 <Field int azh.ak>
	// 2430 4528:iand            
	// 2431 4529:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2432 4532:aload_0         
	// 2433 4533:getfield        #12  <Field azh a>
	// 2434 4536:astore_1        
		abyte0.bm = ((azh) (abyte0)).ak & ~a.bm;
	// 2435 4537:aload_1         
	// 2436 4538:aload_1         
	// 2437 4539:getfield        #182 <Field int azh.ak>
	// 2438 4542:aload_0         
	// 2439 4543:getfield        #12  <Field azh a>
	// 2440 4546:getfield        #256 <Field int azh.bm>
	// 2441 4549:iconst_m1       
	// 2442 4550:ixor            
	// 2443 4551:iand            
	// 2444 4552:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 2445 4555:aload_0         
	// 2446 4556:getfield        #12  <Field azh a>
	// 2447 4559:astore_1        
		abyte0.bm = ((azh) (abyte0)).bk ^ a.bm;
	// 2448 4560:aload_1         
	// 2449 4561:aload_1         
	// 2450 4562:getfield        #259 <Field int azh.bk>
	// 2451 4565:aload_0         
	// 2452 4566:getfield        #12  <Field azh a>
	// 2453 4569:getfield        #256 <Field int azh.bm>
	// 2454 4572:ixor            
	// 2455 4573:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 2456 4576:aload_0         
	// 2457 4577:getfield        #12  <Field azh a>
	// 2458 4580:astore_1        
		abyte0.ar = ((azh) (abyte0)).bm ^ a.ar;
	// 2459 4581:aload_1         
	// 2460 4582:aload_1         
	// 2461 4583:getfield        #256 <Field int azh.bm>
	// 2462 4586:aload_0         
	// 2463 4587:getfield        #12  <Field azh a>
	// 2464 4590:getfield        #250 <Field int azh.ar>
	// 2465 4593:ixor            
	// 2466 4594:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2467 4597:aload_0         
	// 2468 4598:getfield        #12  <Field azh a>
	// 2469 4601:astore_1        
		abyte0.P = ((azh) (abyte0)).ar ^ a.P;
	// 2470 4602:aload_1         
	// 2471 4603:aload_1         
	// 2472 4604:getfield        #250 <Field int azh.ar>
	// 2473 4607:aload_0         
	// 2474 4608:getfield        #12  <Field azh a>
	// 2475 4611:getfield        #262 <Field int azh.P>
	// 2476 4614:ixor            
	// 2477 4615:putfield        #262 <Field int azh.P>
		abyte0 = ((byte []) (a));
	// 2478 4618:aload_0         
	// 2479 4619:getfield        #12  <Field azh a>
	// 2480 4622:astore_1        
		abyte0.ar = ((azh) (abyte0)).P | a.ay;
	// 2481 4623:aload_1         
	// 2482 4624:aload_1         
	// 2483 4625:getfield        #262 <Field int azh.P>
	// 2484 4628:aload_0         
	// 2485 4629:getfield        #12  <Field azh a>
	// 2486 4632:getfield        #265 <Field int azh.ay>
	// 2487 4635:ior             
	// 2488 4636:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2489 4639:aload_0         
	// 2490 4640:getfield        #12  <Field azh a>
	// 2491 4643:astore_1        
		abyte0.ar = ((azh) (abyte0)).X ^ a.ar;
	// 2492 4644:aload_1         
	// 2493 4645:aload_1         
	// 2494 4646:getfield        #26  <Field int azh.X>
	// 2495 4649:aload_0         
	// 2496 4650:getfield        #12  <Field azh a>
	// 2497 4653:getfield        #250 <Field int azh.ar>
	// 2498 4656:ixor            
	// 2499 4657:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 2500 4660:aload_0         
	// 2501 4661:getfield        #12  <Field azh a>
	// 2502 4664:astore_1        
		abyte0.aE = ((azh) (abyte0)).P | a.aE;
	// 2503 4665:aload_1         
	// 2504 4666:aload_1         
	// 2505 4667:getfield        #262 <Field int azh.P>
	// 2506 4670:aload_0         
	// 2507 4671:getfield        #12  <Field azh a>
	// 2508 4674:getfield        #41  <Field int azh.aE>
	// 2509 4677:ior             
	// 2510 4678:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 2511 4681:aload_0         
	// 2512 4682:getfield        #12  <Field azh a>
	// 2513 4685:astore_1        
		abyte0.aE = ((azh) (abyte0)).bC ^ a.aE;
	// 2514 4686:aload_1         
	// 2515 4687:aload_1         
	// 2516 4688:getfield        #268 <Field int azh.bC>
	// 2517 4691:aload_0         
	// 2518 4692:getfield        #12  <Field azh a>
	// 2519 4695:getfield        #41  <Field int azh.aE>
	// 2520 4698:ixor            
	// 2521 4699:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 2522 4702:aload_0         
	// 2523 4703:getfield        #12  <Field azh a>
	// 2524 4706:astore_1        
		abyte0.bm = ((azh) (abyte0)).H & ~a.P;
	// 2525 4707:aload_1         
	// 2526 4708:aload_1         
	// 2527 4709:getfield        #29  <Field int azh.H>
	// 2528 4712:aload_0         
	// 2529 4713:getfield        #12  <Field azh a>
	// 2530 4716:getfield        #262 <Field int azh.P>
	// 2531 4719:iconst_m1       
	// 2532 4720:ixor            
	// 2533 4721:iand            
	// 2534 4722:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 2535 4725:aload_0         
	// 2536 4726:getfield        #12  <Field azh a>
	// 2537 4729:astore_1        
		abyte0.bm = ((azh) (abyte0)).bh ^ a.bm;
	// 2538 4730:aload_1         
	// 2539 4731:aload_1         
	// 2540 4732:getfield        #32  <Field int azh.bh>
	// 2541 4735:aload_0         
	// 2542 4736:getfield        #12  <Field azh a>
	// 2543 4739:getfield        #256 <Field int azh.bm>
	// 2544 4742:ixor            
	// 2545 4743:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 2546 4746:aload_0         
	// 2547 4747:getfield        #12  <Field azh a>
	// 2548 4750:astore_1        
		abyte0.bk = ((azh) (abyte0)).P | a.aN;
	// 2549 4751:aload_1         
	// 2550 4752:aload_1         
	// 2551 4753:getfield        #262 <Field int azh.P>
	// 2552 4756:aload_0         
	// 2553 4757:getfield        #12  <Field azh a>
	// 2554 4760:getfield        #35  <Field int azh.aN>
	// 2555 4763:ior             
	// 2556 4764:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2557 4767:aload_0         
	// 2558 4768:getfield        #12  <Field azh a>
	// 2559 4771:astore_1        
		abyte0.bk = ((azh) (abyte0)).bC ^ a.bk;
	// 2560 4772:aload_1         
	// 2561 4773:aload_1         
	// 2562 4774:getfield        #268 <Field int azh.bC>
	// 2563 4777:aload_0         
	// 2564 4778:getfield        #12  <Field azh a>
	// 2565 4781:getfield        #259 <Field int azh.bk>
	// 2566 4784:ixor            
	// 2567 4785:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2568 4788:aload_0         
	// 2569 4789:getfield        #12  <Field azh a>
	// 2570 4792:astore_1        
		abyte0.aG = ((azh) (abyte0)).bC & ~a.P;
	// 2571 4793:aload_1         
	// 2572 4794:aload_1         
	// 2573 4795:getfield        #268 <Field int azh.bC>
	// 2574 4798:aload_0         
	// 2575 4799:getfield        #12  <Field azh a>
	// 2576 4802:getfield        #262 <Field int azh.P>
	// 2577 4805:iconst_m1       
	// 2578 4806:ixor            
	// 2579 4807:iand            
	// 2580 4808:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2581 4811:aload_0         
	// 2582 4812:getfield        #12  <Field azh a>
	// 2583 4815:astore_1        
		abyte0.aG = ((azh) (abyte0)).aq ^ a.aG;
	// 2584 4816:aload_1         
	// 2585 4817:aload_1         
	// 2586 4818:getfield        #38  <Field int azh.aq>
	// 2587 4821:aload_0         
	// 2588 4822:getfield        #12  <Field azh a>
	// 2589 4825:getfield        #211 <Field int azh.aG>
	// 2590 4828:ixor            
	// 2591 4829:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 2592 4832:aload_0         
	// 2593 4833:getfield        #12  <Field azh a>
	// 2594 4836:astore_1        
		abyte0.aq = ((azh) (abyte0)).P | a.X;
	// 2595 4837:aload_1         
	// 2596 4838:aload_1         
	// 2597 4839:getfield        #262 <Field int azh.P>
	// 2598 4842:aload_0         
	// 2599 4843:getfield        #12  <Field azh a>
	// 2600 4846:getfield        #26  <Field int azh.X>
	// 2601 4849:ior             
	// 2602 4850:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 2603 4853:aload_0         
	// 2604 4854:getfield        #12  <Field azh a>
	// 2605 4857:astore_1        
		abyte0.aq = ((azh) (abyte0)).X ^ a.aq;
	// 2606 4858:aload_1         
	// 2607 4859:aload_1         
	// 2608 4860:getfield        #26  <Field int azh.X>
	// 2609 4863:aload_0         
	// 2610 4864:getfield        #12  <Field azh a>
	// 2611 4867:getfield        #38  <Field int azh.aq>
	// 2612 4870:ixor            
	// 2613 4871:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 2614 4874:aload_0         
	// 2615 4875:getfield        #12  <Field azh a>
	// 2616 4878:astore_1        
		abyte0.bf = ((azh) (abyte0)).ay & ~a.P;
	// 2617 4879:aload_1         
	// 2618 4880:aload_1         
	// 2619 4881:getfield        #265 <Field int azh.ay>
	// 2620 4884:aload_0         
	// 2621 4885:getfield        #12  <Field azh a>
	// 2622 4888:getfield        #262 <Field int azh.P>
	// 2623 4891:iconst_m1       
	// 2624 4892:ixor            
	// 2625 4893:iand            
	// 2626 4894:putfield        #247 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2627 4897:aload_0         
	// 2628 4898:getfield        #12  <Field azh a>
	// 2629 4901:astore_1        
		abyte0.aK = ((azh) (abyte0)).bC ^ a.P;
	// 2630 4902:aload_1         
	// 2631 4903:aload_1         
	// 2632 4904:getfield        #268 <Field int azh.bC>
	// 2633 4907:aload_0         
	// 2634 4908:getfield        #12  <Field azh a>
	// 2635 4911:getfield        #262 <Field int azh.P>
	// 2636 4914:ixor            
	// 2637 4915:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2638 4918:aload_0         
	// 2639 4919:getfield        #12  <Field azh a>
	// 2640 4922:astore_1        
		abyte0.bb = ((azh) (abyte0)).X & ~a.P;
	// 2641 4923:aload_1         
	// 2642 4924:aload_1         
	// 2643 4925:getfield        #26  <Field int azh.X>
	// 2644 4928:aload_0         
	// 2645 4929:getfield        #12  <Field azh a>
	// 2646 4932:getfield        #262 <Field int azh.P>
	// 2647 4935:iconst_m1       
	// 2648 4936:ixor            
	// 2649 4937:iand            
	// 2650 4938:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2651 4941:aload_0         
	// 2652 4942:getfield        #12  <Field azh a>
	// 2653 4945:astore_1        
		abyte0.bb = ((azh) (abyte0)).bh ^ a.bb;
	// 2654 4946:aload_1         
	// 2655 4947:aload_1         
	// 2656 4948:getfield        #32  <Field int azh.bh>
	// 2657 4951:aload_0         
	// 2658 4952:getfield        #12  <Field azh a>
	// 2659 4955:getfield        #203 <Field int azh.bb>
	// 2660 4958:ixor            
	// 2661 4959:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 2662 4962:aload_0         
	// 2663 4963:getfield        #12  <Field azh a>
	// 2664 4966:astore_1        
		abyte0.bh = ((azh) (abyte0)).aN & ~a.P;
	// 2665 4967:aload_1         
	// 2666 4968:aload_1         
	// 2667 4969:getfield        #35  <Field int azh.aN>
	// 2668 4972:aload_0         
	// 2669 4973:getfield        #12  <Field azh a>
	// 2670 4976:getfield        #262 <Field int azh.P>
	// 2671 4979:iconst_m1       
	// 2672 4980:ixor            
	// 2673 4981:iand            
	// 2674 4982:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 2675 4985:aload_0         
	// 2676 4986:getfield        #12  <Field azh a>
	// 2677 4989:astore_1        
		abyte0.at = ((azh) (abyte0)).H & ~a.P;
	// 2678 4990:aload_1         
	// 2679 4991:aload_1         
	// 2680 4992:getfield        #29  <Field int azh.H>
	// 2681 4995:aload_0         
	// 2682 4996:getfield        #12  <Field azh a>
	// 2683 4999:getfield        #262 <Field int azh.P>
	// 2684 5002:iconst_m1       
	// 2685 5003:ixor            
	// 2686 5004:iand            
	// 2687 5005:putfield        #241 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 2688 5008:aload_0         
	// 2689 5009:getfield        #12  <Field azh a>
	// 2690 5012:astore_1        
		abyte0.aC = ((azh) (abyte0)).P | a.bC;
	// 2691 5013:aload_1         
	// 2692 5014:aload_1         
	// 2693 5015:getfield        #262 <Field int azh.P>
	// 2694 5018:aload_0         
	// 2695 5019:getfield        #12  <Field azh a>
	// 2696 5022:getfield        #268 <Field int azh.bC>
	// 2697 5025:ior             
	// 2698 5026:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2699 5029:aload_0         
	// 2700 5030:getfield        #12  <Field azh a>
	// 2701 5033:astore_1        
		abyte0.be = ((azh) (abyte0)).X & ~a.P;
	// 2702 5034:aload_1         
	// 2703 5035:aload_1         
	// 2704 5036:getfield        #26  <Field int azh.X>
	// 2705 5039:aload_0         
	// 2706 5040:getfield        #12  <Field azh a>
	// 2707 5043:getfield        #262 <Field int azh.P>
	// 2708 5046:iconst_m1       
	// 2709 5047:ixor            
	// 2710 5048:iand            
	// 2711 5049:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 2712 5052:aload_0         
	// 2713 5053:getfield        #12  <Field azh a>
	// 2714 5056:astore_1        
		abyte0.be = ((azh) (abyte0)).X ^ a.be;
	// 2715 5057:aload_1         
	// 2716 5058:aload_1         
	// 2717 5059:getfield        #26  <Field int azh.X>
	// 2718 5062:aload_0         
	// 2719 5063:getfield        #12  <Field azh a>
	// 2720 5066:getfield        #155 <Field int azh.be>
	// 2721 5069:ixor            
	// 2722 5070:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 2723 5073:aload_0         
	// 2724 5074:getfield        #12  <Field azh a>
	// 2725 5077:astore_1        
		abyte0.ay = ((azh) (abyte0)).ay & ~a.P;
	// 2726 5078:aload_1         
	// 2727 5079:aload_1         
	// 2728 5080:getfield        #265 <Field int azh.ay>
	// 2729 5083:aload_0         
	// 2730 5084:getfield        #12  <Field azh a>
	// 2731 5087:getfield        #262 <Field int azh.P>
	// 2732 5090:iconst_m1       
	// 2733 5091:ixor            
	// 2734 5092:iand            
	// 2735 5093:putfield        #265 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2736 5096:aload_0         
	// 2737 5097:getfield        #12  <Field azh a>
	// 2738 5100:astore_1        
		abyte0.ay = ((azh) (abyte0)).bC ^ a.ay;
	// 2739 5101:aload_1         
	// 2740 5102:aload_1         
	// 2741 5103:getfield        #268 <Field int azh.bC>
	// 2742 5106:aload_0         
	// 2743 5107:getfield        #12  <Field azh a>
	// 2744 5110:getfield        #265 <Field int azh.ay>
	// 2745 5113:ixor            
	// 2746 5114:putfield        #265 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2747 5117:aload_0         
	// 2748 5118:getfield        #12  <Field azh a>
	// 2749 5121:astore_1        
		abyte0.bC = ((azh) (abyte0)).H & ~a.P;
	// 2750 5122:aload_1         
	// 2751 5123:aload_1         
	// 2752 5124:getfield        #29  <Field int azh.H>
	// 2753 5127:aload_0         
	// 2754 5128:getfield        #12  <Field azh a>
	// 2755 5131:getfield        #262 <Field int azh.P>
	// 2756 5134:iconst_m1       
	// 2757 5135:ixor            
	// 2758 5136:iand            
	// 2759 5137:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 2760 5140:aload_0         
	// 2761 5141:getfield        #12  <Field azh a>
	// 2762 5144:astore_1        
		abyte0.bC = ((azh) (abyte0)).X ^ a.bC;
	// 2763 5145:aload_1         
	// 2764 5146:aload_1         
	// 2765 5147:getfield        #26  <Field int azh.X>
	// 2766 5150:aload_0         
	// 2767 5151:getfield        #12  <Field azh a>
	// 2768 5154:getfield        #268 <Field int azh.bC>
	// 2769 5157:ixor            
	// 2770 5158:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 2771 5161:aload_0         
	// 2772 5162:getfield        #12  <Field azh a>
	// 2773 5165:astore_1        
		abyte0.aO = ((azh) (abyte0)).X & ~a.P;
	// 2774 5166:aload_1         
	// 2775 5167:aload_1         
	// 2776 5168:getfield        #26  <Field int azh.X>
	// 2777 5171:aload_0         
	// 2778 5172:getfield        #12  <Field azh a>
	// 2779 5175:getfield        #262 <Field int azh.P>
	// 2780 5178:iconst_m1       
	// 2781 5179:ixor            
	// 2782 5180:iand            
	// 2783 5181:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2784 5184:aload_0         
	// 2785 5185:getfield        #12  <Field azh a>
	// 2786 5188:astore_1        
		abyte0.bF = ((azh) (abyte0)).P | a.H;
	// 2787 5189:aload_1         
	// 2788 5190:aload_1         
	// 2789 5191:getfield        #262 <Field int azh.P>
	// 2790 5194:aload_0         
	// 2791 5195:getfield        #12  <Field azh a>
	// 2792 5198:getfield        #29  <Field int azh.H>
	// 2793 5201:ior             
	// 2794 5202:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 2795 5205:aload_0         
	// 2796 5206:getfield        #12  <Field azh a>
	// 2797 5209:astore_1        
		abyte0.bx = ((azh) (abyte0)).ac & a.ak;
	// 2798 5210:aload_1         
	// 2799 5211:aload_1         
	// 2800 5212:getfield        #188 <Field int azh.ac>
	// 2801 5215:aload_0         
	// 2802 5216:getfield        #12  <Field azh a>
	// 2803 5219:getfield        #182 <Field int azh.ak>
	// 2804 5222:iand            
	// 2805 5223:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 2806 5226:aload_0         
	// 2807 5227:getfield        #12  <Field azh a>
	// 2808 5230:astore_1        
		abyte0.aP = ((azh) (abyte0)).ak & ~a.bx;
	// 2809 5231:aload_1         
	// 2810 5232:aload_1         
	// 2811 5233:getfield        #182 <Field int azh.ak>
	// 2812 5236:aload_0         
	// 2813 5237:getfield        #12  <Field azh a>
	// 2814 5240:getfield        #125 <Field int azh.bx>
	// 2815 5243:iconst_m1       
	// 2816 5244:ixor            
	// 2817 5245:iand            
	// 2818 5246:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 2819 5249:aload_0         
	// 2820 5250:getfield        #12  <Field azh a>
	// 2821 5253:astore_1        
		abyte0.bw = ((azh) (abyte0)).aP ^ a.bw;
	// 2822 5254:aload_1         
	// 2823 5255:aload_1         
	// 2824 5256:getfield        #50  <Field int azh.aP>
	// 2825 5259:aload_0         
	// 2826 5260:getfield        #12  <Field azh a>
	// 2827 5263:getfield        #271 <Field int azh.bw>
	// 2828 5266:ixor            
	// 2829 5267:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2830 5270:aload_0         
	// 2831 5271:getfield        #12  <Field azh a>
	// 2832 5274:astore_1        
		abyte0.bw = ((azh) (abyte0)).E & ~a.bw;
	// 2833 5275:aload_1         
	// 2834 5276:aload_1         
	// 2835 5277:getfield        #191 <Field int azh.E>
	// 2836 5280:aload_0         
	// 2837 5281:getfield        #12  <Field azh a>
	// 2838 5284:getfield        #271 <Field int azh.bw>
	// 2839 5287:iconst_m1       
	// 2840 5288:ixor            
	// 2841 5289:iand            
	// 2842 5290:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2843 5293:aload_0         
	// 2844 5294:getfield        #12  <Field azh a>
	// 2845 5297:astore_1        
		abyte0.bw = ((azh) (abyte0)).bK ^ a.bw;
	// 2846 5298:aload_1         
	// 2847 5299:aload_1         
	// 2848 5300:getfield        #116 <Field int azh.bK>
	// 2849 5303:aload_0         
	// 2850 5304:getfield        #12  <Field azh a>
	// 2851 5307:getfield        #271 <Field int azh.bw>
	// 2852 5310:ixor            
	// 2853 5311:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2854 5314:aload_0         
	// 2855 5315:getfield        #12  <Field azh a>
	// 2856 5318:astore_1        
		abyte0.bw = ((azh) (abyte0)).a & a.bw;
	// 2857 5319:aload_1         
	// 2858 5320:aload_1         
	// 2859 5321:getfield        #208 <Field int azh.a>
	// 2860 5324:aload_0         
	// 2861 5325:getfield        #12  <Field azh a>
	// 2862 5328:getfield        #271 <Field int azh.bw>
	// 2863 5331:iand            
	// 2864 5332:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2865 5335:aload_0         
	// 2866 5336:getfield        #12  <Field azh a>
	// 2867 5339:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aP ^ a.aZ;
	// 2868 5340:aload_1         
	// 2869 5341:aload_1         
	// 2870 5342:getfield        #50  <Field int azh.aP>
	// 2871 5345:aload_0         
	// 2872 5346:getfield        #12  <Field azh a>
	// 2873 5349:getfield        #232 <Field int azh.aZ>
	// 2874 5352:ixor            
	// 2875 5353:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2876 5356:aload_0         
	// 2877 5357:getfield        #12  <Field azh a>
	// 2878 5360:astore_1        
		abyte0.bs = ((azh) (abyte0)).aZ ^ a.bs;
	// 2879 5361:aload_1         
	// 2880 5362:aload_1         
	// 2881 5363:getfield        #232 <Field int azh.aZ>
	// 2882 5366:aload_0         
	// 2883 5367:getfield        #12  <Field azh a>
	// 2884 5370:getfield        #200 <Field int azh.bs>
	// 2885 5373:ixor            
	// 2886 5374:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2887 5377:aload_0         
	// 2888 5378:getfield        #12  <Field azh a>
	// 2889 5381:astore_1        
		abyte0.bs = ((azh) (abyte0)).a & ~a.bs;
	// 2890 5382:aload_1         
	// 2891 5383:aload_1         
	// 2892 5384:getfield        #208 <Field int azh.a>
	// 2893 5387:aload_0         
	// 2894 5388:getfield        #12  <Field azh a>
	// 2895 5391:getfield        #200 <Field int azh.bs>
	// 2896 5394:iconst_m1       
	// 2897 5395:ixor            
	// 2898 5396:iand            
	// 2899 5397:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2900 5400:aload_0         
	// 2901 5401:getfield        #12  <Field azh a>
	// 2902 5404:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bx & a.E;
	// 2903 5405:aload_1         
	// 2904 5406:aload_1         
	// 2905 5407:getfield        #125 <Field int azh.bx>
	// 2906 5410:aload_0         
	// 2907 5411:getfield        #12  <Field azh a>
	// 2908 5414:getfield        #191 <Field int azh.E>
	// 2909 5417:iand            
	// 2910 5418:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2911 5421:aload_0         
	// 2912 5422:getfield        #12  <Field azh a>
	// 2913 5425:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aA ^ a.aZ;
	// 2914 5426:aload_1         
	// 2915 5427:aload_1         
	// 2916 5428:getfield        #83  <Field int azh.aA>
	// 2917 5431:aload_0         
	// 2918 5432:getfield        #12  <Field azh a>
	// 2919 5435:getfield        #232 <Field int azh.aZ>
	// 2920 5438:ixor            
	// 2921 5439:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2922 5442:aload_0         
	// 2923 5443:getfield        #12  <Field azh a>
	// 2924 5446:astore_1        
		abyte0.aZ = ((azh) (abyte0)).a & a.aZ;
	// 2925 5447:aload_1         
	// 2926 5448:aload_1         
	// 2927 5449:getfield        #208 <Field int azh.a>
	// 2928 5452:aload_0         
	// 2929 5453:getfield        #12  <Field azh a>
	// 2930 5456:getfield        #232 <Field int azh.aZ>
	// 2931 5459:iand            
	// 2932 5460:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2933 5463:aload_0         
	// 2934 5464:getfield        #12  <Field azh a>
	// 2935 5467:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aI ^ a.aZ;
	// 2936 5468:aload_1         
	// 2937 5469:aload_1         
	// 2938 5470:getfield        #235 <Field int azh.aI>
	// 2939 5473:aload_0         
	// 2940 5474:getfield        #12  <Field azh a>
	// 2941 5477:getfield        #232 <Field int azh.aZ>
	// 2942 5480:ixor            
	// 2943 5481:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2944 5484:aload_0         
	// 2945 5485:getfield        #12  <Field azh a>
	// 2946 5488:astore_1        
		abyte0.aZ = ((azh) (abyte0)).U | a.aZ;
	// 2947 5489:aload_1         
	// 2948 5490:aload_1         
	// 2949 5491:getfield        #238 <Field int azh.U>
	// 2950 5494:aload_0         
	// 2951 5495:getfield        #12  <Field azh a>
	// 2952 5498:getfield        #232 <Field int azh.aZ>
	// 2953 5501:ior             
	// 2954 5502:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2955 5505:aload_0         
	// 2956 5506:getfield        #12  <Field azh a>
	// 2957 5509:astore_1        
		abyte0.ao = ((azh) (abyte0)).bx ^ a.ao;
	// 2958 5510:aload_1         
	// 2959 5511:aload_1         
	// 2960 5512:getfield        #125 <Field int azh.bx>
	// 2961 5515:aload_0         
	// 2962 5516:getfield        #12  <Field azh a>
	// 2963 5519:getfield        #253 <Field int azh.ao>
	// 2964 5522:ixor            
	// 2965 5523:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2966 5526:aload_0         
	// 2967 5527:getfield        #12  <Field azh a>
	// 2968 5530:astore_1        
		abyte0.ao = ((azh) (abyte0)).E | a.ao;
	// 2969 5531:aload_1         
	// 2970 5532:aload_1         
	// 2971 5533:getfield        #191 <Field int azh.E>
	// 2972 5536:aload_0         
	// 2973 5537:getfield        #12  <Field azh a>
	// 2974 5540:getfield        #253 <Field int azh.ao>
	// 2975 5543:ior             
	// 2976 5544:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2977 5547:aload_0         
	// 2978 5548:getfield        #12  <Field azh a>
	// 2979 5551:astore_1        
		abyte0.aI = ((azh) (abyte0)).bx ^ a.M;
	// 2980 5552:aload_1         
	// 2981 5553:aload_1         
	// 2982 5554:getfield        #125 <Field int azh.bx>
	// 2983 5557:aload_0         
	// 2984 5558:getfield        #12  <Field azh a>
	// 2985 5561:getfield        #185 <Field int azh.M>
	// 2986 5564:ixor            
	// 2987 5565:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 2988 5568:aload_0         
	// 2989 5569:getfield        #12  <Field azh a>
	// 2990 5572:astore_1        
		abyte0.ao = ((azh) (abyte0)).aI ^ a.ao;
	// 2991 5573:aload_1         
	// 2992 5574:aload_1         
	// 2993 5575:getfield        #235 <Field int azh.aI>
	// 2994 5578:aload_0         
	// 2995 5579:getfield        #12  <Field azh a>
	// 2996 5582:getfield        #253 <Field int azh.ao>
	// 2997 5585:ixor            
	// 2998 5586:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2999 5589:aload_0         
	// 3000 5590:getfield        #12  <Field azh a>
	// 3001 5593:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ao ^ a.aQ;
	// 3002 5594:aload_1         
	// 3003 5595:aload_1         
	// 3004 5596:getfield        #253 <Field int azh.ao>
	// 3005 5599:aload_0         
	// 3006 5600:getfield        #12  <Field azh a>
	// 3007 5603:getfield        #167 <Field int azh.aQ>
	// 3008 5606:ixor            
	// 3009 5607:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3010 5610:aload_0         
	// 3011 5611:getfield        #12  <Field azh a>
	// 3012 5614:astore_1        
		abyte0.aQ = ((azh) (abyte0)).U | a.aQ;
	// 3013 5615:aload_1         
	// 3014 5616:aload_1         
	// 3015 5617:getfield        #238 <Field int azh.U>
	// 3016 5620:aload_0         
	// 3017 5621:getfield        #12  <Field azh a>
	// 3018 5624:getfield        #167 <Field int azh.aQ>
	// 3019 5627:ior             
	// 3020 5628:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3021 5631:aload_0         
	// 3022 5632:getfield        #12  <Field azh a>
	// 3023 5635:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI ^ a.E;
	// 3024 5636:aload_1         
	// 3025 5637:aload_1         
	// 3026 5638:getfield        #235 <Field int azh.aI>
	// 3027 5641:aload_0         
	// 3028 5642:getfield        #12  <Field azh a>
	// 3029 5645:getfield        #191 <Field int azh.E>
	// 3030 5648:ixor            
	// 3031 5649:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 3032 5652:aload_0         
	// 3033 5653:getfield        #12  <Field azh a>
	// 3034 5656:astore_1        
		abyte0.aB = ((azh) (abyte0)).aI ^ a.aB;
	// 3035 5657:aload_1         
	// 3036 5658:aload_1         
	// 3037 5659:getfield        #235 <Field int azh.aI>
	// 3038 5662:aload_0         
	// 3039 5663:getfield        #12  <Field azh a>
	// 3040 5666:getfield        #158 <Field int azh.aB>
	// 3041 5669:ixor            
	// 3042 5670:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3043 5673:aload_0         
	// 3044 5674:getfield        #12  <Field azh a>
	// 3045 5677:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aB ^ a.aZ;
	// 3046 5678:aload_1         
	// 3047 5679:aload_1         
	// 3048 5680:getfield        #158 <Field int azh.aB>
	// 3049 5683:aload_0         
	// 3050 5684:getfield        #12  <Field azh a>
	// 3051 5687:getfield        #232 <Field int azh.aZ>
	// 3052 5690:ixor            
	// 3053 5691:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3054 5694:aload_0         
	// 3055 5695:getfield        #12  <Field azh a>
	// 3056 5698:astore_1        
		abyte0.aj = ((azh) (abyte0)).aZ ^ a.aj;
	// 3057 5699:aload_1         
	// 3058 5700:aload_1         
	// 3059 5701:getfield        #232 <Field int azh.aZ>
	// 3060 5704:aload_0         
	// 3061 5705:getfield        #12  <Field azh a>
	// 3062 5708:getfield        #274 <Field int azh.aj>
	// 3063 5711:ixor            
	// 3064 5712:putfield        #274 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 3065 5715:aload_0         
	// 3066 5716:getfield        #12  <Field azh a>
	// 3067 5719:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bx & ~a.E;
	// 3068 5720:aload_1         
	// 3069 5721:aload_1         
	// 3070 5722:getfield        #125 <Field int azh.bx>
	// 3071 5725:aload_0         
	// 3072 5726:getfield        #12  <Field azh a>
	// 3073 5729:getfield        #191 <Field int azh.E>
	// 3074 5732:iconst_m1       
	// 3075 5733:ixor            
	// 3076 5734:iand            
	// 3077 5735:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3078 5738:aload_0         
	// 3079 5739:getfield        #12  <Field azh a>
	// 3080 5742:astore_1        
		abyte0.bx = ((azh) (abyte0)).M & a.bx;
	// 3081 5743:aload_1         
	// 3082 5744:aload_1         
	// 3083 5745:getfield        #185 <Field int azh.M>
	// 3084 5748:aload_0         
	// 3085 5749:getfield        #12  <Field azh a>
	// 3086 5752:getfield        #125 <Field int azh.bx>
	// 3087 5755:iand            
	// 3088 5756:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 3089 5759:aload_0         
	// 3090 5760:getfield        #12  <Field azh a>
	// 3091 5763:astore_1        
		abyte0.bx = ((azh) (abyte0)).aL ^ a.bx;
	// 3092 5764:aload_1         
	// 3093 5765:aload_1         
	// 3094 5766:getfield        #220 <Field int azh.aL>
	// 3095 5769:aload_0         
	// 3096 5770:getfield        #12  <Field azh a>
	// 3097 5773:getfield        #125 <Field int azh.bx>
	// 3098 5776:ixor            
	// 3099 5777:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 3100 5780:aload_0         
	// 3101 5781:getfield        #12  <Field azh a>
	// 3102 5784:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bx ^ a.aZ;
	// 3103 5785:aload_1         
	// 3104 5786:aload_1         
	// 3105 5787:getfield        #125 <Field int azh.bx>
	// 3106 5790:aload_0         
	// 3107 5791:getfield        #12  <Field azh a>
	// 3108 5794:getfield        #232 <Field int azh.aZ>
	// 3109 5797:ixor            
	// 3110 5798:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3111 5801:aload_0         
	// 3112 5802:getfield        #12  <Field azh a>
	// 3113 5805:astore_1        
		abyte0.aH = ((azh) (abyte0)).aZ ^ a.aH;
	// 3114 5806:aload_1         
	// 3115 5807:aload_1         
	// 3116 5808:getfield        #232 <Field int azh.aZ>
	// 3117 5811:aload_0         
	// 3118 5812:getfield        #12  <Field azh a>
	// 3119 5815:getfield        #214 <Field int azh.aH>
	// 3120 5818:ixor            
	// 3121 5819:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3122 5822:aload_0         
	// 3123 5823:getfield        #12  <Field azh a>
	// 3124 5826:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aH ^ a.aQ;
	// 3125 5827:aload_1         
	// 3126 5828:aload_1         
	// 3127 5829:getfield        #214 <Field int azh.aH>
	// 3128 5832:aload_0         
	// 3129 5833:getfield        #12  <Field azh a>
	// 3130 5836:getfield        #167 <Field int azh.aQ>
	// 3131 5839:ixor            
	// 3132 5840:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3133 5843:aload_0         
	// 3134 5844:getfield        #12  <Field azh a>
	// 3135 5847:astore_1        
		abyte0.l = ((azh) (abyte0)).aQ ^ a.l;
	// 3136 5848:aload_1         
	// 3137 5849:aload_1         
	// 3138 5850:getfield        #167 <Field int azh.aQ>
	// 3139 5853:aload_0         
	// 3140 5854:getfield        #12  <Field azh a>
	// 3141 5857:getfield        #277 <Field int azh.l>
	// 3142 5860:ixor            
	// 3143 5861:putfield        #277 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 3144 5864:aload_0         
	// 3145 5865:getfield        #12  <Field azh a>
	// 3146 5868:astore_1        
		abyte0.aR = ((azh) (abyte0)).bx ^ a.aR;
	// 3147 5869:aload_1         
	// 3148 5870:aload_1         
	// 3149 5871:getfield        #125 <Field int azh.bx>
	// 3150 5874:aload_0         
	// 3151 5875:getfield        #12  <Field azh a>
	// 3152 5878:getfield        #217 <Field int azh.aR>
	// 3153 5881:ixor            
	// 3154 5882:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3155 5885:aload_0         
	// 3156 5886:getfield        #12  <Field azh a>
	// 3157 5889:astore_1        
		abyte0.bs = ((azh) (abyte0)).aR ^ a.bs;
	// 3158 5890:aload_1         
	// 3159 5891:aload_1         
	// 3160 5892:getfield        #217 <Field int azh.aR>
	// 3161 5895:aload_0         
	// 3162 5896:getfield        #12  <Field azh a>
	// 3163 5899:getfield        #200 <Field int azh.bs>
	// 3164 5902:ixor            
	// 3165 5903:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 3166 5906:aload_0         
	// 3167 5907:getfield        #12  <Field azh a>
	// 3168 5910:astore_1        
		abyte0.aR = ((azh) (abyte0)).E & ~a.ak;
	// 3169 5911:aload_1         
	// 3170 5912:aload_1         
	// 3171 5913:getfield        #191 <Field int azh.E>
	// 3172 5916:aload_0         
	// 3173 5917:getfield        #12  <Field azh a>
	// 3174 5920:getfield        #182 <Field int azh.ak>
	// 3175 5923:iconst_m1       
	// 3176 5924:ixor            
	// 3177 5925:iand            
	// 3178 5926:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3179 5929:aload_0         
	// 3180 5930:getfield        #12  <Field azh a>
	// 3181 5933:astore_1        
		abyte0.aR = ((azh) (abyte0)).aU ^ a.aR;
	// 3182 5934:aload_1         
	// 3183 5935:aload_1         
	// 3184 5936:getfield        #206 <Field int azh.aU>
	// 3185 5939:aload_0         
	// 3186 5940:getfield        #12  <Field azh a>
	// 3187 5943:getfield        #217 <Field int azh.aR>
	// 3188 5946:ixor            
	// 3189 5947:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3190 5950:aload_0         
	// 3191 5951:getfield        #12  <Field azh a>
	// 3192 5954:astore_1        
		abyte0.bw = ((azh) (abyte0)).aR ^ a.bw;
	// 3193 5955:aload_1         
	// 3194 5956:aload_1         
	// 3195 5957:getfield        #217 <Field int azh.aR>
	// 3196 5960:aload_0         
	// 3197 5961:getfield        #12  <Field azh a>
	// 3198 5964:getfield        #271 <Field int azh.bw>
	// 3199 5967:ixor            
	// 3200 5968:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 3201 5971:aload_0         
	// 3202 5972:getfield        #12  <Field azh a>
	// 3203 5975:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & ~a.U;
	// 3204 5976:aload_1         
	// 3205 5977:aload_1         
	// 3206 5978:getfield        #271 <Field int azh.bw>
	// 3207 5981:aload_0         
	// 3208 5982:getfield        #12  <Field azh a>
	// 3209 5985:getfield        #238 <Field int azh.U>
	// 3210 5988:iconst_m1       
	// 3211 5989:ixor            
	// 3212 5990:iand            
	// 3213 5991:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 3214 5994:aload_0         
	// 3215 5995:getfield        #12  <Field azh a>
	// 3216 5998:astore_1        
		abyte0.bw = ((azh) (abyte0)).bs ^ a.bw;
	// 3217 5999:aload_1         
	// 3218 6000:aload_1         
	// 3219 6001:getfield        #200 <Field int azh.bs>
	// 3220 6004:aload_0         
	// 3221 6005:getfield        #12  <Field azh a>
	// 3222 6008:getfield        #271 <Field int azh.bw>
	// 3223 6011:ixor            
	// 3224 6012:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 3225 6015:aload_0         
	// 3226 6016:getfield        #12  <Field azh a>
	// 3227 6019:astore_1        
		abyte0.j = ((azh) (abyte0)).bw ^ a.j;
	// 3228 6020:aload_1         
	// 3229 6021:aload_1         
	// 3230 6022:getfield        #271 <Field int azh.bw>
	// 3231 6025:aload_0         
	// 3232 6026:getfield        #12  <Field azh a>
	// 3233 6029:getfield        #280 <Field int azh.j>
	// 3234 6032:ixor            
	// 3235 6033:putfield        #280 <Field int azh.j>
		abyte0 = ((byte []) (a));
	// 3236 6036:aload_0         
	// 3237 6037:getfield        #12  <Field azh a>
	// 3238 6040:astore_1        
		abyte0.bw = ((azh) (abyte0)).r | a.j;
	// 3239 6041:aload_1         
	// 3240 6042:aload_1         
	// 3241 6043:getfield        #170 <Field int azh.r>
	// 3242 6046:aload_0         
	// 3243 6047:getfield        #12  <Field azh a>
	// 3244 6050:getfield        #280 <Field int azh.j>
	// 3245 6053:ior             
	// 3246 6054:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 3247 6057:aload_0         
	// 3248 6058:getfield        #12  <Field azh a>
	// 3249 6061:astore_1        
		abyte0.bs = ((azh) (abyte0)).j & ~a.r;
	// 3250 6062:aload_1         
	// 3251 6063:aload_1         
	// 3252 6064:getfield        #280 <Field int azh.j>
	// 3253 6067:aload_0         
	// 3254 6068:getfield        #12  <Field azh a>
	// 3255 6071:getfield        #170 <Field int azh.r>
	// 3256 6074:iconst_m1       
	// 3257 6075:ixor            
	// 3258 6076:iand            
	// 3259 6077:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 3260 6080:aload_0         
	// 3261 6081:getfield        #12  <Field azh a>
	// 3262 6084:astore_1        
		abyte0.aR = ((azh) (abyte0)).r | a.j;
	// 3263 6085:aload_1         
	// 3264 6086:aload_1         
	// 3265 6087:getfield        #170 <Field int azh.r>
	// 3266 6090:aload_0         
	// 3267 6091:getfield        #12  <Field azh a>
	// 3268 6094:getfield        #280 <Field int azh.j>
	// 3269 6097:ior             
	// 3270 6098:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3271 6101:aload_0         
	// 3272 6102:getfield        #12  <Field azh a>
	// 3273 6105:astore_1        
		abyte0.bI = ((azh) (abyte0)).n & a.bI;
	// 3274 6106:aload_1         
	// 3275 6107:aload_1         
	// 3276 6108:getfield        #80  <Field int azh.n>
	// 3277 6111:aload_0         
	// 3278 6112:getfield        #12  <Field azh a>
	// 3279 6115:getfield        #89  <Field int azh.bI>
	// 3280 6118:iand            
	// 3281 6119:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 3282 6122:aload_0         
	// 3283 6123:getfield        #12  <Field azh a>
	// 3284 6126:astore_1        
		abyte0.bI = ((azh) (abyte0)).bG ^ a.bI;
	// 3285 6127:aload_1         
	// 3286 6128:aload_1         
	// 3287 6129:getfield        #122 <Field int azh.bG>
	// 3288 6132:aload_0         
	// 3289 6133:getfield        #12  <Field azh a>
	// 3290 6136:getfield        #89  <Field int azh.bI>
	// 3291 6139:ixor            
	// 3292 6140:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 3293 6143:aload_0         
	// 3294 6144:getfield        #12  <Field azh a>
	// 3295 6147:astore_1        
		abyte0.bI = ((azh) (abyte0)).L & ~a.bI;
	// 3296 6148:aload_1         
	// 3297 6149:aload_1         
	// 3298 6150:getfield        #95  <Field int azh.L>
	// 3299 6153:aload_0         
	// 3300 6154:getfield        #12  <Field azh a>
	// 3301 6157:getfield        #89  <Field int azh.bI>
	// 3302 6160:iconst_m1       
	// 3303 6161:ixor            
	// 3304 6162:iand            
	// 3305 6163:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 3306 6166:aload_0         
	// 3307 6167:getfield        #12  <Field azh a>
	// 3308 6170:astore_1        
		abyte0.bI = ((azh) (abyte0)).by ^ a.bI;
	// 3309 6171:aload_1         
	// 3310 6172:aload_1         
	// 3311 6173:getfield        #98  <Field int azh.by>
	// 3312 6176:aload_0         
	// 3313 6177:getfield        #12  <Field azh a>
	// 3314 6180:getfield        #89  <Field int azh.bI>
	// 3315 6183:ixor            
	// 3316 6184:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 3317 6187:aload_0         
	// 3318 6188:getfield        #12  <Field azh a>
	// 3319 6191:astore_1        
		abyte0.aD = ((azh) (abyte0)).bI ^ a.aD;
	// 3320 6192:aload_1         
	// 3321 6193:aload_1         
	// 3322 6194:getfield        #89  <Field int azh.bI>
	// 3323 6197:aload_0         
	// 3324 6198:getfield        #12  <Field azh a>
	// 3325 6201:getfield        #92  <Field int azh.aD>
	// 3326 6204:ixor            
	// 3327 6205:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 3328 6208:aload_0         
	// 3329 6209:getfield        #12  <Field azh a>
	// 3330 6212:astore_1        
		abyte0.I = ((azh) (abyte0)).aD ^ a.I;
	// 3331 6213:aload_1         
	// 3332 6214:aload_1         
	// 3333 6215:getfield        #92  <Field int azh.aD>
	// 3334 6218:aload_0         
	// 3335 6219:getfield        #12  <Field azh a>
	// 3336 6222:getfield        #282 <Field int azh.I>
	// 3337 6225:ixor            
	// 3338 6226:putfield        #282 <Field int azh.I>
		abyte0 = ((byte []) (a));
	// 3339 6229:aload_0         
	// 3340 6230:getfield        #12  <Field azh a>
	// 3341 6233:astore_1        
		abyte0.aD = ((azh) (abyte0)).I ^ a.k;
	// 3342 6234:aload_1         
	// 3343 6235:aload_1         
	// 3344 6236:getfield        #282 <Field int azh.I>
	// 3345 6239:aload_0         
	// 3346 6240:getfield        #12  <Field azh a>
	// 3347 6243:getfield        #285 <Field int azh.k>
	// 3348 6246:ixor            
	// 3349 6247:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 3350 6250:aload_0         
	// 3351 6251:getfield        #12  <Field azh a>
	// 3352 6254:astore_1        
		abyte0.by = ((azh) (abyte0)).ae & a.aD;
	// 3353 6255:aload_1         
	// 3354 6256:aload_1         
	// 3355 6257:getfield        #288 <Field int azh.ae>
	// 3356 6260:aload_0         
	// 3357 6261:getfield        #12  <Field azh a>
	// 3358 6264:getfield        #92  <Field int azh.aD>
	// 3359 6267:iand            
	// 3360 6268:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3361 6271:aload_0         
	// 3362 6272:getfield        #12  <Field azh a>
	// 3363 6275:astore_1        
		abyte0.bG = ((azh) (abyte0)).aD | a.c;
	// 3364 6276:aload_1         
	// 3365 6277:aload_1         
	// 3366 6278:getfield        #92  <Field int azh.aD>
	// 3367 6281:aload_0         
	// 3368 6282:getfield        #12  <Field azh a>
	// 3369 6285:getfield        #291 <Field int azh.c>
	// 3370 6288:ior             
	// 3371 6289:putfield        #122 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3372 6292:aload_0         
	// 3373 6293:getfield        #12  <Field azh a>
	// 3374 6296:astore_1        
		abyte0.n = ((azh) (abyte0)).ae & ~a.aD;
	// 3375 6297:aload_1         
	// 3376 6298:aload_1         
	// 3377 6299:getfield        #288 <Field int azh.ae>
	// 3378 6302:aload_0         
	// 3379 6303:getfield        #12  <Field azh a>
	// 3380 6306:getfield        #92  <Field int azh.aD>
	// 3381 6309:iconst_m1       
	// 3382 6310:ixor            
	// 3383 6311:iand            
	// 3384 6312:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3385 6315:aload_0         
	// 3386 6316:getfield        #12  <Field azh a>
	// 3387 6319:astore_1        
		abyte0.n = ((azh) (abyte0)).aD ^ a.n;
	// 3388 6320:aload_1         
	// 3389 6321:aload_1         
	// 3390 6322:getfield        #92  <Field int azh.aD>
	// 3391 6325:aload_0         
	// 3392 6326:getfield        #12  <Field azh a>
	// 3393 6329:getfield        #80  <Field int azh.n>
	// 3394 6332:ixor            
	// 3395 6333:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3396 6336:aload_0         
	// 3397 6337:getfield        #12  <Field azh a>
	// 3398 6340:astore_1        
		abyte0.n = ((azh) (abyte0)).n & ~a.c;
	// 3399 6341:aload_1         
	// 3400 6342:aload_1         
	// 3401 6343:getfield        #80  <Field int azh.n>
	// 3402 6346:aload_0         
	// 3403 6347:getfield        #12  <Field azh a>
	// 3404 6350:getfield        #291 <Field int azh.c>
	// 3405 6353:iconst_m1       
	// 3406 6354:ixor            
	// 3407 6355:iand            
	// 3408 6356:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3409 6359:aload_0         
	// 3410 6360:getfield        #12  <Field azh a>
	// 3411 6363:astore_1        
		abyte0.aU = ((azh) (abyte0)).ae & a.aD;
	// 3412 6364:aload_1         
	// 3413 6365:aload_1         
	// 3414 6366:getfield        #288 <Field int azh.ae>
	// 3415 6369:aload_0         
	// 3416 6370:getfield        #12  <Field azh a>
	// 3417 6373:getfield        #92  <Field int azh.aD>
	// 3418 6376:iand            
	// 3419 6377:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 3420 6380:aload_0         
	// 3421 6381:getfield        #12  <Field azh a>
	// 3422 6384:astore_1        
		abyte0.aU = ((azh) (abyte0)).k ^ a.aU;
	// 3423 6385:aload_1         
	// 3424 6386:aload_1         
	// 3425 6387:getfield        #285 <Field int azh.k>
	// 3426 6390:aload_0         
	// 3427 6391:getfield        #12  <Field azh a>
	// 3428 6394:getfield        #206 <Field int azh.aU>
	// 3429 6397:ixor            
	// 3430 6398:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 3431 6401:aload_0         
	// 3432 6402:getfield        #12  <Field azh a>
	// 3433 6405:astore_1        
		abyte0.aU = ((azh) (abyte0)).aU & a.A;
	// 3434 6406:aload_1         
	// 3435 6407:aload_1         
	// 3436 6408:getfield        #206 <Field int azh.aU>
	// 3437 6411:aload_0         
	// 3438 6412:getfield        #12  <Field azh a>
	// 3439 6415:getfield        #294 <Field int azh.A>
	// 3440 6418:iand            
	// 3441 6419:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 3442 6422:aload_0         
	// 3443 6423:getfield        #12  <Field azh a>
	// 3444 6426:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD ^ a.ae;
	// 3445 6427:aload_1         
	// 3446 6428:aload_1         
	// 3447 6429:getfield        #92  <Field int azh.aD>
	// 3448 6432:aload_0         
	// 3449 6433:getfield        #12  <Field azh a>
	// 3450 6436:getfield        #288 <Field int azh.ae>
	// 3451 6439:ixor            
	// 3452 6440:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 3453 6443:aload_0         
	// 3454 6444:getfield        #12  <Field azh a>
	// 3455 6447:astore_1        
		abyte0.bx = ((azh) (abyte0)).k & ~a.I;
	// 3456 6448:aload_1         
	// 3457 6449:aload_1         
	// 3458 6450:getfield        #285 <Field int azh.k>
	// 3459 6453:aload_0         
	// 3460 6454:getfield        #12  <Field azh a>
	// 3461 6457:getfield        #282 <Field int azh.I>
	// 3462 6460:iconst_m1       
	// 3463 6461:ixor            
	// 3464 6462:iand            
	// 3465 6463:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 3466 6466:aload_0         
	// 3467 6467:getfield        #12  <Field azh a>
	// 3468 6470:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ae & a.bx;
	// 3469 6471:aload_1         
	// 3470 6472:aload_1         
	// 3471 6473:getfield        #288 <Field int azh.ae>
	// 3472 6476:aload_0         
	// 3473 6477:getfield        #12  <Field azh a>
	// 3474 6480:getfield        #125 <Field int azh.bx>
	// 3475 6483:iand            
	// 3476 6484:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3477 6487:aload_0         
	// 3478 6488:getfield        #12  <Field azh a>
	// 3479 6491:astore_1        
		abyte0.aQ = ((azh) (abyte0)).k ^ a.aQ;
	// 3480 6492:aload_1         
	// 3481 6493:aload_1         
	// 3482 6494:getfield        #285 <Field int azh.k>
	// 3483 6497:aload_0         
	// 3484 6498:getfield        #12  <Field azh a>
	// 3485 6501:getfield        #167 <Field int azh.aQ>
	// 3486 6504:ixor            
	// 3487 6505:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3488 6508:aload_0         
	// 3489 6509:getfield        #12  <Field azh a>
	// 3490 6512:astore_1        
		abyte0.aQ = ((azh) (abyte0)).c | a.aQ;
	// 3491 6513:aload_1         
	// 3492 6514:aload_1         
	// 3493 6515:getfield        #291 <Field int azh.c>
	// 3494 6518:aload_0         
	// 3495 6519:getfield        #12  <Field azh a>
	// 3496 6522:getfield        #167 <Field int azh.aQ>
	// 3497 6525:ior             
	// 3498 6526:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3499 6529:aload_0         
	// 3500 6530:getfield        #12  <Field azh a>
	// 3501 6533:astore_1        
		abyte0.aH = ((azh) (abyte0)).ae & a.bx;
	// 3502 6534:aload_1         
	// 3503 6535:aload_1         
	// 3504 6536:getfield        #288 <Field int azh.ae>
	// 3505 6539:aload_0         
	// 3506 6540:getfield        #12  <Field azh a>
	// 3507 6543:getfield        #125 <Field int azh.bx>
	// 3508 6546:iand            
	// 3509 6547:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3510 6550:aload_0         
	// 3511 6551:getfield        #12  <Field azh a>
	// 3512 6554:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & ~a.c;
	// 3513 6555:aload_1         
	// 3514 6556:aload_1         
	// 3515 6557:getfield        #214 <Field int azh.aH>
	// 3516 6560:aload_0         
	// 3517 6561:getfield        #12  <Field azh a>
	// 3518 6564:getfield        #291 <Field int azh.c>
	// 3519 6567:iconst_m1       
	// 3520 6568:ixor            
	// 3521 6569:iand            
	// 3522 6570:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3523 6573:aload_0         
	// 3524 6574:getfield        #12  <Field azh a>
	// 3525 6577:astore_1        
		abyte0.by = ((azh) (abyte0)).bx ^ a.by;
	// 3526 6578:aload_1         
	// 3527 6579:aload_1         
	// 3528 6580:getfield        #125 <Field int azh.bx>
	// 3529 6583:aload_0         
	// 3530 6584:getfield        #12  <Field azh a>
	// 3531 6587:getfield        #98  <Field int azh.by>
	// 3532 6590:ixor            
	// 3533 6591:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3534 6594:aload_0         
	// 3535 6595:getfield        #12  <Field azh a>
	// 3536 6598:astore_1        
		abyte0.by = ((azh) (abyte0)).by & ~a.c;
	// 3537 6599:aload_1         
	// 3538 6600:aload_1         
	// 3539 6601:getfield        #98  <Field int azh.by>
	// 3540 6604:aload_0         
	// 3541 6605:getfield        #12  <Field azh a>
	// 3542 6608:getfield        #291 <Field int azh.c>
	// 3543 6611:iconst_m1       
	// 3544 6612:ixor            
	// 3545 6613:iand            
	// 3546 6614:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3547 6617:aload_0         
	// 3548 6618:getfield        #12  <Field azh a>
	// 3549 6621:astore_1        
		abyte0.bx = ((azh) (abyte0)).I & ~a.k;
	// 3550 6622:aload_1         
	// 3551 6623:aload_1         
	// 3552 6624:getfield        #282 <Field int azh.I>
	// 3553 6627:aload_0         
	// 3554 6628:getfield        #12  <Field azh a>
	// 3555 6631:getfield        #285 <Field int azh.k>
	// 3556 6634:iconst_m1       
	// 3557 6635:ixor            
	// 3558 6636:iand            
	// 3559 6637:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 3560 6640:aload_0         
	// 3561 6641:getfield        #12  <Field azh a>
	// 3562 6644:astore_1        
		abyte0.aZ = ((azh) (abyte0)).ae & a.bx;
	// 3563 6645:aload_1         
	// 3564 6646:aload_1         
	// 3565 6647:getfield        #288 <Field int azh.ae>
	// 3566 6650:aload_0         
	// 3567 6651:getfield        #12  <Field azh a>
	// 3568 6654:getfield        #125 <Field int azh.bx>
	// 3569 6657:iand            
	// 3570 6658:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3571 6661:aload_0         
	// 3572 6662:getfield        #12  <Field azh a>
	// 3573 6665:astore_1        
		abyte0.aL = ((azh) (abyte0)).c & a.aZ;
	// 3574 6666:aload_1         
	// 3575 6667:aload_1         
	// 3576 6668:getfield        #291 <Field int azh.c>
	// 3577 6671:aload_0         
	// 3578 6672:getfield        #12  <Field azh a>
	// 3579 6675:getfield        #232 <Field int azh.aZ>
	// 3580 6678:iand            
	// 3581 6679:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3582 6682:aload_0         
	// 3583 6683:getfield        #12  <Field azh a>
	// 3584 6686:astore_1        
		abyte0.aL = ((azh) (abyte0)).aZ ^ a.aL;
	// 3585 6687:aload_1         
	// 3586 6688:aload_1         
	// 3587 6689:getfield        #232 <Field int azh.aZ>
	// 3588 6692:aload_0         
	// 3589 6693:getfield        #12  <Field azh a>
	// 3590 6696:getfield        #220 <Field int azh.aL>
	// 3591 6699:ixor            
	// 3592 6700:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3593 6703:aload_0         
	// 3594 6704:getfield        #12  <Field azh a>
	// 3595 6707:astore_1        
		abyte0.aL = ((azh) (abyte0)).A & ~a.aL;
	// 3596 6708:aload_1         
	// 3597 6709:aload_1         
	// 3598 6710:getfield        #294 <Field int azh.A>
	// 3599 6713:aload_0         
	// 3600 6714:getfield        #12  <Field azh a>
	// 3601 6717:getfield        #220 <Field int azh.aL>
	// 3602 6720:iconst_m1       
	// 3603 6721:ixor            
	// 3604 6722:iand            
	// 3605 6723:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3606 6726:aload_0         
	// 3607 6727:getfield        #12  <Field azh a>
	// 3608 6730:astore_1        
		abyte0.aH = ((azh) (abyte0)).aZ ^ a.aH;
	// 3609 6731:aload_1         
	// 3610 6732:aload_1         
	// 3611 6733:getfield        #232 <Field int azh.aZ>
	// 3612 6736:aload_0         
	// 3613 6737:getfield        #12  <Field azh a>
	// 3614 6740:getfield        #214 <Field int azh.aH>
	// 3615 6743:ixor            
	// 3616 6744:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3617 6747:aload_0         
	// 3618 6748:getfield        #12  <Field azh a>
	// 3619 6751:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & a.A;
	// 3620 6752:aload_1         
	// 3621 6753:aload_1         
	// 3622 6754:getfield        #214 <Field int azh.aH>
	// 3623 6757:aload_0         
	// 3624 6758:getfield        #12  <Field azh a>
	// 3625 6761:getfield        #294 <Field int azh.A>
	// 3626 6764:iand            
	// 3627 6765:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3628 6768:aload_0         
	// 3629 6769:getfield        #12  <Field azh a>
	// 3630 6772:astore_1        
		abyte0.aB = ((azh) (abyte0)).ae & a.bx;
	// 3631 6773:aload_1         
	// 3632 6774:aload_1         
	// 3633 6775:getfield        #288 <Field int azh.ae>
	// 3634 6778:aload_0         
	// 3635 6779:getfield        #12  <Field azh a>
	// 3636 6782:getfield        #125 <Field int azh.bx>
	// 3637 6785:iand            
	// 3638 6786:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3639 6789:aload_0         
	// 3640 6790:getfield        #12  <Field azh a>
	// 3641 6793:astore_1        
		abyte0.bx = ((azh) (abyte0)).ae & a.bx;
	// 3642 6794:aload_1         
	// 3643 6795:aload_1         
	// 3644 6796:getfield        #288 <Field int azh.ae>
	// 3645 6799:aload_0         
	// 3646 6800:getfield        #12  <Field azh a>
	// 3647 6803:getfield        #125 <Field int azh.bx>
	// 3648 6806:iand            
	// 3649 6807:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 3650 6810:aload_0         
	// 3651 6811:getfield        #12  <Field azh a>
	// 3652 6814:astore_1        
		abyte0.aI = ((azh) (abyte0)).ae & ~a.I;
	// 3653 6815:aload_1         
	// 3654 6816:aload_1         
	// 3655 6817:getfield        #288 <Field int azh.ae>
	// 3656 6820:aload_0         
	// 3657 6821:getfield        #12  <Field azh a>
	// 3658 6824:getfield        #282 <Field int azh.I>
	// 3659 6827:iconst_m1       
	// 3660 6828:ixor            
	// 3661 6829:iand            
	// 3662 6830:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 3663 6833:aload_0         
	// 3664 6834:getfield        #12  <Field azh a>
	// 3665 6837:astore_1        
		abyte0.ao = ((azh) (abyte0)).I | a.k;
	// 3666 6838:aload_1         
	// 3667 6839:aload_1         
	// 3668 6840:getfield        #282 <Field int azh.I>
	// 3669 6843:aload_0         
	// 3670 6844:getfield        #12  <Field azh a>
	// 3671 6847:getfield        #285 <Field int azh.k>
	// 3672 6850:ior             
	// 3673 6851:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 3674 6854:aload_0         
	// 3675 6855:getfield        #12  <Field azh a>
	// 3676 6858:astore_1        
		abyte0.aA = ((azh) (abyte0)).ae & a.ao;
	// 3677 6859:aload_1         
	// 3678 6860:aload_1         
	// 3679 6861:getfield        #288 <Field int azh.ae>
	// 3680 6864:aload_0         
	// 3681 6865:getfield        #12  <Field azh a>
	// 3682 6868:getfield        #253 <Field int azh.ao>
	// 3683 6871:iand            
	// 3684 6872:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3685 6875:aload_0         
	// 3686 6876:getfield        #12  <Field azh a>
	// 3687 6879:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aA ^ a.aQ;
	// 3688 6880:aload_1         
	// 3689 6881:aload_1         
	// 3690 6882:getfield        #83  <Field int azh.aA>
	// 3691 6885:aload_0         
	// 3692 6886:getfield        #12  <Field azh a>
	// 3693 6889:getfield        #167 <Field int azh.aQ>
	// 3694 6892:ixor            
	// 3695 6893:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3696 6896:aload_0         
	// 3697 6897:getfield        #12  <Field azh a>
	// 3698 6900:astore_1        
		abyte0.aA = ((azh) (abyte0)).ae & ~a.ao;
	// 3699 6901:aload_1         
	// 3700 6902:aload_1         
	// 3701 6903:getfield        #288 <Field int azh.ae>
	// 3702 6906:aload_0         
	// 3703 6907:getfield        #12  <Field azh a>
	// 3704 6910:getfield        #253 <Field int azh.ao>
	// 3705 6913:iconst_m1       
	// 3706 6914:ixor            
	// 3707 6915:iand            
	// 3708 6916:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3709 6919:aload_0         
	// 3710 6920:getfield        #12  <Field azh a>
	// 3711 6923:astore_1        
		abyte0.aP = ((azh) (abyte0)).c | a.aA;
	// 3712 6924:aload_1         
	// 3713 6925:aload_1         
	// 3714 6926:getfield        #291 <Field int azh.c>
	// 3715 6929:aload_0         
	// 3716 6930:getfield        #12  <Field azh a>
	// 3717 6933:getfield        #83  <Field int azh.aA>
	// 3718 6936:ior             
	// 3719 6937:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 3720 6940:aload_0         
	// 3721 6941:getfield        #12  <Field azh a>
	// 3722 6944:astore_1        
		abyte0.aP = ((azh) (abyte0)).aD ^ a.aP;
	// 3723 6945:aload_1         
	// 3724 6946:aload_1         
	// 3725 6947:getfield        #92  <Field int azh.aD>
	// 3726 6950:aload_0         
	// 3727 6951:getfield        #12  <Field azh a>
	// 3728 6954:getfield        #50  <Field int azh.aP>
	// 3729 6957:ixor            
	// 3730 6958:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 3731 6961:aload_0         
	// 3732 6962:getfield        #12  <Field azh a>
	// 3733 6965:astore_1        
		abyte0.aH = ((azh) (abyte0)).aP ^ a.aH;
	// 3734 6966:aload_1         
	// 3735 6967:aload_1         
	// 3736 6968:getfield        #50  <Field int azh.aP>
	// 3737 6971:aload_0         
	// 3738 6972:getfield        #12  <Field azh a>
	// 3739 6975:getfield        #214 <Field int azh.aH>
	// 3740 6978:ixor            
	// 3741 6979:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3742 6982:aload_0         
	// 3743 6983:getfield        #12  <Field azh a>
	// 3744 6986:astore_1        
		abyte0.aP = ((azh) (abyte0)).ao & ~a.k;
	// 3745 6987:aload_1         
	// 3746 6988:aload_1         
	// 3747 6989:getfield        #253 <Field int azh.ao>
	// 3748 6992:aload_0         
	// 3749 6993:getfield        #12  <Field azh a>
	// 3750 6996:getfield        #285 <Field int azh.k>
	// 3751 6999:iconst_m1       
	// 3752 7000:ixor            
	// 3753 7001:iand            
	// 3754 7002:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 3755 7005:aload_0         
	// 3756 7006:getfield        #12  <Field azh a>
	// 3757 7009:astore_1        
		abyte0.aB = ((azh) (abyte0)).aP ^ a.aB;
	// 3758 7010:aload_1         
	// 3759 7011:aload_1         
	// 3760 7012:getfield        #50  <Field int azh.aP>
	// 3761 7015:aload_0         
	// 3762 7016:getfield        #12  <Field azh a>
	// 3763 7019:getfield        #158 <Field int azh.aB>
	// 3764 7022:ixor            
	// 3765 7023:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3766 7026:aload_0         
	// 3767 7027:getfield        #12  <Field azh a>
	// 3768 7030:astore_1        
		abyte0.by = ((azh) (abyte0)).aB ^ a.by;
	// 3769 7031:aload_1         
	// 3770 7032:aload_1         
	// 3771 7033:getfield        #158 <Field int azh.aB>
	// 3772 7036:aload_0         
	// 3773 7037:getfield        #12  <Field azh a>
	// 3774 7040:getfield        #98  <Field int azh.by>
	// 3775 7043:ixor            
	// 3776 7044:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3777 7047:aload_0         
	// 3778 7048:getfield        #12  <Field azh a>
	// 3779 7051:astore_1        
		abyte0.by = ((azh) (abyte0)).A & ~a.by;
	// 3780 7052:aload_1         
	// 3781 7053:aload_1         
	// 3782 7054:getfield        #294 <Field int azh.A>
	// 3783 7057:aload_0         
	// 3784 7058:getfield        #12  <Field azh a>
	// 3785 7061:getfield        #98  <Field int azh.by>
	// 3786 7064:iconst_m1       
	// 3787 7065:ixor            
	// 3788 7066:iand            
	// 3789 7067:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3790 7070:aload_0         
	// 3791 7071:getfield        #12  <Field azh a>
	// 3792 7074:astore_1        
		abyte0.by = ((azh) (abyte0)).aQ ^ a.by;
	// 3793 7075:aload_1         
	// 3794 7076:aload_1         
	// 3795 7077:getfield        #167 <Field int azh.aQ>
	// 3796 7080:aload_0         
	// 3797 7081:getfield        #12  <Field azh a>
	// 3798 7084:getfield        #98  <Field int azh.by>
	// 3799 7087:ixor            
	// 3800 7088:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3801 7091:aload_0         
	// 3802 7092:getfield        #12  <Field azh a>
	// 3803 7095:astore_1        
		abyte0.aI = ((azh) (abyte0)).aP ^ a.aI;
	// 3804 7096:aload_1         
	// 3805 7097:aload_1         
	// 3806 7098:getfield        #50  <Field int azh.aP>
	// 3807 7101:aload_0         
	// 3808 7102:getfield        #12  <Field azh a>
	// 3809 7105:getfield        #235 <Field int azh.aI>
	// 3810 7108:ixor            
	// 3811 7109:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 3812 7112:aload_0         
	// 3813 7113:getfield        #12  <Field azh a>
	// 3814 7116:astore_1        
		abyte0.aI = ((azh) (abyte0)).c & ~a.aI;
	// 3815 7117:aload_1         
	// 3816 7118:aload_1         
	// 3817 7119:getfield        #291 <Field int azh.c>
	// 3818 7122:aload_0         
	// 3819 7123:getfield        #12  <Field azh a>
	// 3820 7126:getfield        #235 <Field int azh.aI>
	// 3821 7129:iconst_m1       
	// 3822 7130:ixor            
	// 3823 7131:iand            
	// 3824 7132:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 3825 7135:aload_0         
	// 3826 7136:getfield        #12  <Field azh a>
	// 3827 7139:astore_1        
		abyte0.bO = ((azh) (abyte0)).I & a.bO;
	// 3828 7140:aload_1         
	// 3829 7141:aload_1         
	// 3830 7142:getfield        #282 <Field int azh.I>
	// 3831 7145:aload_0         
	// 3832 7146:getfield        #12  <Field azh a>
	// 3833 7149:getfield        #297 <Field int azh.bO>
	// 3834 7152:iand            
	// 3835 7153:putfield        #297 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3836 7156:aload_0         
	// 3837 7157:getfield        #12  <Field azh a>
	// 3838 7160:astore_1        
		abyte0.bO = ((azh) (abyte0)).bM ^ a.bO;
	// 3839 7161:aload_1         
	// 3840 7162:aload_1         
	// 3841 7163:getfield        #300 <Field int azh.bM>
	// 3842 7166:aload_0         
	// 3843 7167:getfield        #12  <Field azh a>
	// 3844 7170:getfield        #297 <Field int azh.bO>
	// 3845 7173:ixor            
	// 3846 7174:putfield        #297 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3847 7177:aload_0         
	// 3848 7178:getfield        #12  <Field azh a>
	// 3849 7181:astore_1        
		abyte0.v = ((azh) (abyte0)).bO ^ a.v;
	// 3850 7182:aload_1         
	// 3851 7183:aload_1         
	// 3852 7184:getfield        #297 <Field int azh.bO>
	// 3853 7187:aload_0         
	// 3854 7188:getfield        #12  <Field azh a>
	// 3855 7191:getfield        #303 <Field int azh.v>
	// 3856 7194:ixor            
	// 3857 7195:putfield        #303 <Field int azh.v>
		abyte0 = ((byte []) (a));
	// 3858 7198:aload_0         
	// 3859 7199:getfield        #12  <Field azh a>
	// 3860 7202:astore_1        
		abyte0.bO = ((azh) (abyte0)).v & ~a.D;
	// 3861 7203:aload_1         
	// 3862 7204:aload_1         
	// 3863 7205:getfield        #303 <Field int azh.v>
	// 3864 7208:aload_0         
	// 3865 7209:getfield        #12  <Field azh a>
	// 3866 7212:getfield        #74  <Field int azh.D>
	// 3867 7215:iconst_m1       
	// 3868 7216:ixor            
	// 3869 7217:iand            
	// 3870 7218:putfield        #297 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3871 7221:aload_0         
	// 3872 7222:getfield        #12  <Field azh a>
	// 3873 7225:astore_1        
		abyte0.bM = ((azh) (abyte0)).bO & ~a.f;
	// 3874 7226:aload_1         
	// 3875 7227:aload_1         
	// 3876 7228:getfield        #297 <Field int azh.bO>
	// 3877 7231:aload_0         
	// 3878 7232:getfield        #12  <Field azh a>
	// 3879 7235:getfield        #164 <Field int azh.f>
	// 3880 7238:iconst_m1       
	// 3881 7239:ixor            
	// 3882 7240:iand            
	// 3883 7241:putfield        #300 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3884 7244:aload_0         
	// 3885 7245:getfield        #12  <Field azh a>
	// 3886 7248:astore_1        
		abyte0.bO = ((azh) (abyte0)).bO ^ a.f;
	// 3887 7249:aload_1         
	// 3888 7250:aload_1         
	// 3889 7251:getfield        #297 <Field int azh.bO>
	// 3890 7254:aload_0         
	// 3891 7255:getfield        #12  <Field azh a>
	// 3892 7258:getfield        #164 <Field int azh.f>
	// 3893 7261:ixor            
	// 3894 7262:putfield        #297 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3895 7265:aload_0         
	// 3896 7266:getfield        #12  <Field azh a>
	// 3897 7269:astore_1        
		abyte0.aQ = ((azh) (abyte0)).D & a.v;
	// 3898 7270:aload_1         
	// 3899 7271:aload_1         
	// 3900 7272:getfield        #74  <Field int azh.D>
	// 3901 7275:aload_0         
	// 3902 7276:getfield        #12  <Field azh a>
	// 3903 7279:getfield        #303 <Field int azh.v>
	// 3904 7282:iand            
	// 3905 7283:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3906 7286:aload_0         
	// 3907 7287:getfield        #12  <Field azh a>
	// 3908 7290:astore_1        
		abyte0.aB = ((azh) (abyte0)).v & ~a.aQ;
	// 3909 7291:aload_1         
	// 3910 7292:aload_1         
	// 3911 7293:getfield        #303 <Field int azh.v>
	// 3912 7296:aload_0         
	// 3913 7297:getfield        #12  <Field azh a>
	// 3914 7300:getfield        #167 <Field int azh.aQ>
	// 3915 7303:iconst_m1       
	// 3916 7304:ixor            
	// 3917 7305:iand            
	// 3918 7306:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3919 7309:aload_0         
	// 3920 7310:getfield        #12  <Field azh a>
	// 3921 7313:astore_1        
		abyte0.bD = ((azh) (abyte0)).aB ^ a.bD;
	// 3922 7314:aload_1         
	// 3923 7315:aload_1         
	// 3924 7316:getfield        #158 <Field int azh.aB>
	// 3925 7319:aload_0         
	// 3926 7320:getfield        #12  <Field azh a>
	// 3927 7323:getfield        #101 <Field int azh.bD>
	// 3928 7326:ixor            
	// 3929 7327:putfield        #101 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 3930 7330:aload_0         
	// 3931 7331:getfield        #12  <Field azh a>
	// 3932 7334:astore_1        
		abyte0.aB = ((azh) (abyte0)).aQ ^ a.f;
	// 3933 7335:aload_1         
	// 3934 7336:aload_1         
	// 3935 7337:getfield        #167 <Field int azh.aQ>
	// 3936 7340:aload_0         
	// 3937 7341:getfield        #12  <Field azh a>
	// 3938 7344:getfield        #164 <Field int azh.f>
	// 3939 7347:ixor            
	// 3940 7348:putfield        #158 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3941 7351:aload_0         
	// 3942 7352:getfield        #12  <Field azh a>
	// 3943 7355:astore_1        
		abyte0.bK = ((azh) (abyte0)).aQ & ~a.f;
	// 3944 7356:aload_1         
	// 3945 7357:aload_1         
	// 3946 7358:getfield        #167 <Field int azh.aQ>
	// 3947 7361:aload_0         
	// 3948 7362:getfield        #12  <Field azh a>
	// 3949 7365:getfield        #164 <Field int azh.f>
	// 3950 7368:iconst_m1       
	// 3951 7369:ixor            
	// 3952 7370:iand            
	// 3953 7371:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 3954 7374:aload_0         
	// 3955 7375:getfield        #12  <Field azh a>
	// 3956 7378:astore_1        
		abyte0.bK = ((azh) (abyte0)).aQ ^ a.bK;
	// 3957 7379:aload_1         
	// 3958 7380:aload_1         
	// 3959 7381:getfield        #167 <Field int azh.aQ>
	// 3960 7384:aload_0         
	// 3961 7385:getfield        #12  <Field azh a>
	// 3962 7388:getfield        #116 <Field int azh.bK>
	// 3963 7391:ixor            
	// 3964 7392:putfield        #116 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 3965 7395:aload_0         
	// 3966 7396:getfield        #12  <Field azh a>
	// 3967 7399:astore_1        
		abyte0.aQ = ((azh) (abyte0)).f | a.v;
	// 3968 7400:aload_1         
	// 3969 7401:aload_1         
	// 3970 7402:getfield        #164 <Field int azh.f>
	// 3971 7405:aload_0         
	// 3972 7406:getfield        #12  <Field azh a>
	// 3973 7409:getfield        #303 <Field int azh.v>
	// 3974 7412:ior             
	// 3975 7413:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3976 7416:aload_0         
	// 3977 7417:getfield        #12  <Field azh a>
	// 3978 7420:astore_1        
		abyte0.aQ = ((azh) (abyte0)).D ^ a.aQ;
	// 3979 7421:aload_1         
	// 3980 7422:aload_1         
	// 3981 7423:getfield        #74  <Field int azh.D>
	// 3982 7426:aload_0         
	// 3983 7427:getfield        #12  <Field azh a>
	// 3984 7430:getfield        #167 <Field int azh.aQ>
	// 3985 7433:ixor            
	// 3986 7434:putfield        #167 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3987 7437:aload_0         
	// 3988 7438:getfield        #12  <Field azh a>
	// 3989 7441:astore_1        
		abyte0.bo = ((azh) (abyte0)).D & ~a.v;
	// 3990 7442:aload_1         
	// 3991 7443:aload_1         
	// 3992 7444:getfield        #74  <Field int azh.D>
	// 3993 7447:aload_0         
	// 3994 7448:getfield        #12  <Field azh a>
	// 3995 7451:getfield        #303 <Field int azh.v>
	// 3996 7454:iconst_m1       
	// 3997 7455:ixor            
	// 3998 7456:iand            
	// 3999 7457:putfield        #306 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4000 7460:aload_0         
	// 4001 7461:getfield        #12  <Field azh a>
	// 4002 7464:astore_1        
		abyte0.bM = ((azh) (abyte0)).bo ^ a.bM;
	// 4003 7465:aload_1         
	// 4004 7466:aload_1         
	// 4005 7467:getfield        #306 <Field int azh.bo>
	// 4006 7470:aload_0         
	// 4007 7471:getfield        #12  <Field azh a>
	// 4008 7474:getfield        #300 <Field int azh.bM>
	// 4009 7477:ixor            
	// 4010 7478:putfield        #300 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4011 7481:aload_0         
	// 4012 7482:getfield        #12  <Field azh a>
	// 4013 7485:astore_1        
		abyte0.bo = ((azh) (abyte0)).v & ~a.f;
	// 4014 7486:aload_1         
	// 4015 7487:aload_1         
	// 4016 7488:getfield        #303 <Field int azh.v>
	// 4017 7491:aload_0         
	// 4018 7492:getfield        #12  <Field azh a>
	// 4019 7495:getfield        #164 <Field int azh.f>
	// 4020 7498:iconst_m1       
	// 4021 7499:ixor            
	// 4022 7500:iand            
	// 4023 7501:putfield        #306 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4024 7504:aload_0         
	// 4025 7505:getfield        #12  <Field azh a>
	// 4026 7508:astore_1        
		abyte0.bo = ((azh) (abyte0)).v ^ a.bo;
	// 4027 7509:aload_1         
	// 4028 7510:aload_1         
	// 4029 7511:getfield        #303 <Field int azh.v>
	// 4030 7514:aload_0         
	// 4031 7515:getfield        #12  <Field azh a>
	// 4032 7518:getfield        #306 <Field int azh.bo>
	// 4033 7521:ixor            
	// 4034 7522:putfield        #306 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 4035 7525:aload_0         
	// 4036 7526:getfield        #12  <Field azh a>
	// 4037 7529:astore_1        
		abyte0.bd = ((azh) (abyte0)).D ^ a.v;
	// 4038 7530:aload_1         
	// 4039 7531:aload_1         
	// 4040 7532:getfield        #74  <Field int azh.D>
	// 4041 7535:aload_0         
	// 4042 7536:getfield        #12  <Field azh a>
	// 4043 7539:getfield        #303 <Field int azh.v>
	// 4044 7542:ixor            
	// 4045 7543:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4046 7546:aload_0         
	// 4047 7547:getfield        #12  <Field azh a>
	// 4048 7550:astore_1        
		abyte0.bl = ((azh) (abyte0)).bd & ~a.f;
	// 4049 7551:aload_1         
	// 4050 7552:aload_1         
	// 4051 7553:getfield        #309 <Field int azh.bd>
	// 4052 7556:aload_0         
	// 4053 7557:getfield        #12  <Field azh a>
	// 4054 7560:getfield        #164 <Field int azh.f>
	// 4055 7563:iconst_m1       
	// 4056 7564:ixor            
	// 4057 7565:iand            
	// 4058 7566:putfield        #312 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 4059 7569:aload_0         
	// 4060 7570:getfield        #12  <Field azh a>
	// 4061 7573:astore_1        
		abyte0.bj = ((azh) (abyte0)).v | a.D;
	// 4062 7574:aload_1         
	// 4063 7575:aload_1         
	// 4064 7576:getfield        #303 <Field int azh.v>
	// 4065 7579:aload_0         
	// 4066 7580:getfield        #12  <Field azh a>
	// 4067 7583:getfield        #74  <Field int azh.D>
	// 4068 7586:ior             
	// 4069 7587:putfield        #315 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4070 7590:aload_0         
	// 4071 7591:getfield        #12  <Field azh a>
	// 4072 7594:astore_1        
		abyte0.ax = ((azh) (abyte0)).bj ^ a.ax;
	// 4073 7595:aload_1         
	// 4074 7596:aload_1         
	// 4075 7597:getfield        #315 <Field int azh.bj>
	// 4076 7600:aload_0         
	// 4077 7601:getfield        #12  <Field azh a>
	// 4078 7604:getfield        #53  <Field int azh.ax>
	// 4079 7607:ixor            
	// 4080 7608:putfield        #53  <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4081 7611:aload_0         
	// 4082 7612:getfield        #12  <Field azh a>
	// 4083 7615:astore_1        
		abyte0.bn = ((azh) (abyte0)).bj & ~a.f;
	// 4084 7616:aload_1         
	// 4085 7617:aload_1         
	// 4086 7618:getfield        #315 <Field int azh.bj>
	// 4087 7621:aload_0         
	// 4088 7622:getfield        #12  <Field azh a>
	// 4089 7625:getfield        #164 <Field int azh.f>
	// 4090 7628:iconst_m1       
	// 4091 7629:ixor            
	// 4092 7630:iand            
	// 4093 7631:putfield        #318 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 4094 7634:aload_0         
	// 4095 7635:getfield        #12  <Field azh a>
	// 4096 7638:astore_1        
		abyte0.bn = ((azh) (abyte0)).v ^ a.bn;
	// 4097 7639:aload_1         
	// 4098 7640:aload_1         
	// 4099 7641:getfield        #303 <Field int azh.v>
	// 4100 7644:aload_0         
	// 4101 7645:getfield        #12  <Field azh a>
	// 4102 7648:getfield        #318 <Field int azh.bn>
	// 4103 7651:ixor            
	// 4104 7652:putfield        #318 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 4105 7655:aload_0         
	// 4106 7656:getfield        #12  <Field azh a>
	// 4107 7659:astore_1        
		abyte0.bl = ((azh) (abyte0)).bj ^ a.bl;
	// 4108 7660:aload_1         
	// 4109 7661:aload_1         
	// 4110 7662:getfield        #315 <Field int azh.bj>
	// 4111 7665:aload_0         
	// 4112 7666:getfield        #12  <Field azh a>
	// 4113 7669:getfield        #312 <Field int azh.bl>
	// 4114 7672:ixor            
	// 4115 7673:putfield        #312 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 4116 7676:aload_0         
	// 4117 7677:getfield        #12  <Field azh a>
	// 4118 7680:astore_1        
		abyte0.bj = ((azh) (abyte0)).f | a.v;
	// 4119 7681:aload_1         
	// 4120 7682:aload_1         
	// 4121 7683:getfield        #164 <Field int azh.f>
	// 4122 7686:aload_0         
	// 4123 7687:getfield        #12  <Field azh a>
	// 4124 7690:getfield        #303 <Field int azh.v>
	// 4125 7693:ior             
	// 4126 7694:putfield        #315 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4127 7697:aload_0         
	// 4128 7698:getfield        #12  <Field azh a>
	// 4129 7701:astore_1        
		abyte0.bB = ((azh) (abyte0)).f | a.v;
	// 4130 7702:aload_1         
	// 4131 7703:aload_1         
	// 4132 7704:getfield        #164 <Field int azh.f>
	// 4133 7707:aload_0         
	// 4134 7708:getfield        #12  <Field azh a>
	// 4135 7711:getfield        #303 <Field int azh.v>
	// 4136 7714:ior             
	// 4137 7715:putfield        #321 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 4138 7718:aload_0         
	// 4139 7719:getfield        #12  <Field azh a>
	// 4140 7722:astore_1        
		abyte0.bB = ((azh) (abyte0)).bd ^ a.bB;
	// 4141 7723:aload_1         
	// 4142 7724:aload_1         
	// 4143 7725:getfield        #309 <Field int azh.bd>
	// 4144 7728:aload_0         
	// 4145 7729:getfield        #12  <Field azh a>
	// 4146 7732:getfield        #321 <Field int azh.bB>
	// 4147 7735:ixor            
	// 4148 7736:putfield        #321 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 4149 7739:aload_0         
	// 4150 7740:getfield        #12  <Field azh a>
	// 4151 7743:astore_1        
		abyte0.bd = ((azh) (abyte0)).ae & ~a.I;
	// 4152 7744:aload_1         
	// 4153 7745:aload_1         
	// 4154 7746:getfield        #288 <Field int azh.ae>
	// 4155 7749:aload_0         
	// 4156 7750:getfield        #12  <Field azh a>
	// 4157 7753:getfield        #282 <Field int azh.I>
	// 4158 7756:iconst_m1       
	// 4159 7757:ixor            
	// 4160 7758:iand            
	// 4161 7759:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4162 7762:aload_0         
	// 4163 7763:getfield        #12  <Field azh a>
	// 4164 7766:astore_1        
		abyte0.bd = ((azh) (abyte0)).I ^ a.bd;
	// 4165 7767:aload_1         
	// 4166 7768:aload_1         
	// 4167 7769:getfield        #282 <Field int azh.I>
	// 4168 7772:aload_0         
	// 4169 7773:getfield        #12  <Field azh a>
	// 4170 7776:getfield        #309 <Field int azh.bd>
	// 4171 7779:ixor            
	// 4172 7780:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4173 7783:aload_0         
	// 4174 7784:getfield        #12  <Field azh a>
	// 4175 7787:astore_1        
		abyte0.aI = ((azh) (abyte0)).bd ^ a.aI;
	// 4176 7788:aload_1         
	// 4177 7789:aload_1         
	// 4178 7790:getfield        #309 <Field int azh.bd>
	// 4179 7793:aload_0         
	// 4180 7794:getfield        #12  <Field azh a>
	// 4181 7797:getfield        #235 <Field int azh.aI>
	// 4182 7800:ixor            
	// 4183 7801:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 4184 7804:aload_0         
	// 4185 7805:getfield        #12  <Field azh a>
	// 4186 7808:astore_1        
		abyte0.bi = ((azh) (abyte0)).c & a.bd;
	// 4187 7809:aload_1         
	// 4188 7810:aload_1         
	// 4189 7811:getfield        #291 <Field int azh.c>
	// 4190 7814:aload_0         
	// 4191 7815:getfield        #12  <Field azh a>
	// 4192 7818:getfield        #309 <Field int azh.bd>
	// 4193 7821:iand            
	// 4194 7822:putfield        #324 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 4195 7825:aload_0         
	// 4196 7826:getfield        #12  <Field azh a>
	// 4197 7829:astore_1        
		abyte0.bi = ((azh) (abyte0)).bd ^ a.bi;
	// 4198 7830:aload_1         
	// 4199 7831:aload_1         
	// 4200 7832:getfield        #309 <Field int azh.bd>
	// 4201 7835:aload_0         
	// 4202 7836:getfield        #12  <Field azh a>
	// 4203 7839:getfield        #324 <Field int azh.bi>
	// 4204 7842:ixor            
	// 4205 7843:putfield        #324 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 4206 7846:aload_0         
	// 4207 7847:getfield        #12  <Field azh a>
	// 4208 7850:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd | a.c;
	// 4209 7851:aload_1         
	// 4210 7852:aload_1         
	// 4211 7853:getfield        #309 <Field int azh.bd>
	// 4212 7856:aload_0         
	// 4213 7857:getfield        #12  <Field azh a>
	// 4214 7860:getfield        #291 <Field int azh.c>
	// 4215 7863:ior             
	// 4216 7864:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4217 7867:aload_0         
	// 4218 7868:getfield        #12  <Field azh a>
	// 4219 7871:astore_1        
		abyte0.bd = ((azh) (abyte0)).aA ^ a.bd;
	// 4220 7872:aload_1         
	// 4221 7873:aload_1         
	// 4222 7874:getfield        #83  <Field int azh.aA>
	// 4223 7877:aload_0         
	// 4224 7878:getfield        #12  <Field azh a>
	// 4225 7881:getfield        #309 <Field int azh.bd>
	// 4226 7884:ixor            
	// 4227 7885:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4228 7888:aload_0         
	// 4229 7889:getfield        #12  <Field azh a>
	// 4230 7892:astore_1        
		abyte0.bd = ((azh) (abyte0)).A & ~a.bd;
	// 4231 7893:aload_1         
	// 4232 7894:aload_1         
	// 4233 7895:getfield        #294 <Field int azh.A>
	// 4234 7898:aload_0         
	// 4235 7899:getfield        #12  <Field azh a>
	// 4236 7902:getfield        #309 <Field int azh.bd>
	// 4237 7905:iconst_m1       
	// 4238 7906:ixor            
	// 4239 7907:iand            
	// 4240 7908:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4241 7911:aload_0         
	// 4242 7912:getfield        #12  <Field azh a>
	// 4243 7915:astore_1        
		abyte0.bd = ((azh) (abyte0)).aI ^ a.bd;
	// 4244 7916:aload_1         
	// 4245 7917:aload_1         
	// 4246 7918:getfield        #235 <Field int azh.aI>
	// 4247 7921:aload_0         
	// 4248 7922:getfield        #12  <Field azh a>
	// 4249 7925:getfield        #309 <Field int azh.bd>
	// 4250 7928:ixor            
	// 4251 7929:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4252 7932:aload_0         
	// 4253 7933:getfield        #12  <Field azh a>
	// 4254 7936:astore_1        
		abyte0.bd = ((azh) (abyte0)).s & a.bd;
	// 4255 7937:aload_1         
	// 4256 7938:aload_1         
	// 4257 7939:getfield        #327 <Field int azh.s>
	// 4258 7942:aload_0         
	// 4259 7943:getfield        #12  <Field azh a>
	// 4260 7946:getfield        #309 <Field int azh.bd>
	// 4261 7949:iand            
	// 4262 7950:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4263 7953:aload_0         
	// 4264 7954:getfield        #12  <Field azh a>
	// 4265 7957:astore_1        
		abyte0.bd = ((azh) (abyte0)).by ^ a.bd;
	// 4266 7958:aload_1         
	// 4267 7959:aload_1         
	// 4268 7960:getfield        #98  <Field int azh.by>
	// 4269 7963:aload_0         
	// 4270 7964:getfield        #12  <Field azh a>
	// 4271 7967:getfield        #309 <Field int azh.bd>
	// 4272 7970:ixor            
	// 4273 7971:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4274 7974:aload_0         
	// 4275 7975:getfield        #12  <Field azh a>
	// 4276 7978:astore_1        
		abyte0.z = ((azh) (abyte0)).bd ^ a.z;
	// 4277 7979:aload_1         
	// 4278 7980:aload_1         
	// 4279 7981:getfield        #309 <Field int azh.bd>
	// 4280 7984:aload_0         
	// 4281 7985:getfield        #12  <Field azh a>
	// 4282 7988:getfield        #330 <Field int azh.z>
	// 4283 7991:ixor            
	// 4284 7992:putfield        #330 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 4285 7995:aload_0         
	// 4286 7996:getfield        #12  <Field azh a>
	// 4287 7999:astore_1        
		abyte0.aR = ((azh) (abyte0)).z | a.aR;
	// 4288 8000:aload_1         
	// 4289 8001:aload_1         
	// 4290 8002:getfield        #330 <Field int azh.z>
	// 4291 8005:aload_0         
	// 4292 8006:getfield        #12  <Field azh a>
	// 4293 8009:getfield        #217 <Field int azh.aR>
	// 4294 8012:ior             
	// 4295 8013:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4296 8016:aload_0         
	// 4297 8017:getfield        #12  <Field azh a>
	// 4298 8020:astore_1        
		abyte0.ap = ((azh) (abyte0)).I & ~a.ap;
	// 4299 8021:aload_1         
	// 4300 8022:aload_1         
	// 4301 8023:getfield        #282 <Field int azh.I>
	// 4302 8026:aload_0         
	// 4303 8027:getfield        #12  <Field azh a>
	// 4304 8030:getfield        #333 <Field int azh.ap>
	// 4305 8033:iconst_m1       
	// 4306 8034:ixor            
	// 4307 8035:iand            
	// 4308 8036:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 4309 8039:aload_0         
	// 4310 8040:getfield        #12  <Field azh a>
	// 4311 8043:astore_1        
		abyte0.ap = ((azh) (abyte0)).bv ^ a.ap;
	// 4312 8044:aload_1         
	// 4313 8045:aload_1         
	// 4314 8046:getfield        #336 <Field int azh.bv>
	// 4315 8049:aload_0         
	// 4316 8050:getfield        #12  <Field azh a>
	// 4317 8053:getfield        #333 <Field int azh.ap>
	// 4318 8056:ixor            
	// 4319 8057:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 4320 8060:aload_0         
	// 4321 8061:getfield        #12  <Field azh a>
	// 4322 8064:astore_1        
		abyte0.h = ((azh) (abyte0)).ap ^ a.h;
	// 4323 8065:aload_1         
	// 4324 8066:aload_1         
	// 4325 8067:getfield        #333 <Field int azh.ap>
	// 4326 8070:aload_0         
	// 4327 8071:getfield        #12  <Field azh a>
	// 4328 8074:getfield        #339 <Field int azh.h>
	// 4329 8077:ixor            
	// 4330 8078:putfield        #339 <Field int azh.h>
		abyte0 = ((byte []) (a));
	// 4331 8081:aload_0         
	// 4332 8082:getfield        #12  <Field azh a>
	// 4333 8085:astore_1        
		abyte0.ap = ((azh) (abyte0)).D & a.h;
	// 4334 8086:aload_1         
	// 4335 8087:aload_1         
	// 4336 8088:getfield        #74  <Field int azh.D>
	// 4337 8091:aload_0         
	// 4338 8092:getfield        #12  <Field azh a>
	// 4339 8095:getfield        #339 <Field int azh.h>
	// 4340 8098:iand            
	// 4341 8099:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 4342 8102:aload_0         
	// 4343 8103:getfield        #12  <Field azh a>
	// 4344 8106:astore_1        
		abyte0.bv = ((azh) (abyte0)).ap & ~a.ab;
	// 4345 8107:aload_1         
	// 4346 8108:aload_1         
	// 4347 8109:getfield        #333 <Field int azh.ap>
	// 4348 8112:aload_0         
	// 4349 8113:getfield        #12  <Field azh a>
	// 4350 8116:getfield        #77  <Field int azh.ab>
	// 4351 8119:iconst_m1       
	// 4352 8120:ixor            
	// 4353 8121:iand            
	// 4354 8122:putfield        #336 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 4355 8125:aload_0         
	// 4356 8126:getfield        #12  <Field azh a>
	// 4357 8129:astore_1        
		abyte0.bv = ((azh) (abyte0)).ap ^ a.bv;
	// 4358 8130:aload_1         
	// 4359 8131:aload_1         
	// 4360 8132:getfield        #333 <Field int azh.ap>
	// 4361 8135:aload_0         
	// 4362 8136:getfield        #12  <Field azh a>
	// 4363 8139:getfield        #336 <Field int azh.bv>
	// 4364 8142:ixor            
	// 4365 8143:putfield        #336 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 4366 8146:aload_0         
	// 4367 8147:getfield        #12  <Field azh a>
	// 4368 8150:astore_1        
		abyte0.ap = ((azh) (abyte0)).aj & a.h;
	// 4369 8151:aload_1         
	// 4370 8152:aload_1         
	// 4371 8153:getfield        #274 <Field int azh.aj>
	// 4372 8156:aload_0         
	// 4373 8157:getfield        #12  <Field azh a>
	// 4374 8160:getfield        #339 <Field int azh.h>
	// 4375 8163:iand            
	// 4376 8164:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 4377 8167:aload_0         
	// 4378 8168:getfield        #12  <Field azh a>
	// 4379 8171:astore_1        
		abyte0.bd = ((azh) (abyte0)).ab | a.h;
	// 4380 8172:aload_1         
	// 4381 8173:aload_1         
	// 4382 8174:getfield        #77  <Field int azh.ab>
	// 4383 8177:aload_0         
	// 4384 8178:getfield        #12  <Field azh a>
	// 4385 8181:getfield        #339 <Field int azh.h>
	// 4386 8184:ior             
	// 4387 8185:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4388 8188:aload_0         
	// 4389 8189:getfield        #12  <Field azh a>
	// 4390 8192:astore_1        
		abyte0.by = ((azh) (abyte0)).ab | a.h;
	// 4391 8193:aload_1         
	// 4392 8194:aload_1         
	// 4393 8195:getfield        #77  <Field int azh.ab>
	// 4394 8198:aload_0         
	// 4395 8199:getfield        #12  <Field azh a>
	// 4396 8202:getfield        #339 <Field int azh.h>
	// 4397 8205:ior             
	// 4398 8206:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4399 8209:aload_0         
	// 4400 8210:getfield        #12  <Field azh a>
	// 4401 8213:astore_1        
		abyte0.aI = ((azh) (abyte0)).D & ~a.h;
	// 4402 8214:aload_1         
	// 4403 8215:aload_1         
	// 4404 8216:getfield        #74  <Field int azh.D>
	// 4405 8219:aload_0         
	// 4406 8220:getfield        #12  <Field azh a>
	// 4407 8223:getfield        #339 <Field int azh.h>
	// 4408 8226:iconst_m1       
	// 4409 8227:ixor            
	// 4410 8228:iand            
	// 4411 8229:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 4412 8232:aload_0         
	// 4413 8233:getfield        #12  <Field azh a>
	// 4414 8236:astore_1        
		abyte0.bd = ((azh) (abyte0)).aI ^ a.bd;
	// 4415 8237:aload_1         
	// 4416 8238:aload_1         
	// 4417 8239:getfield        #235 <Field int azh.aI>
	// 4418 8242:aload_0         
	// 4419 8243:getfield        #12  <Field azh a>
	// 4420 8246:getfield        #309 <Field int azh.bd>
	// 4421 8249:ixor            
	// 4422 8250:putfield        #309 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4423 8253:aload_0         
	// 4424 8254:getfield        #12  <Field azh a>
	// 4425 8257:astore_1        
		abyte0.aI = ((azh) (abyte0)).D & a.h;
	// 4426 8258:aload_1         
	// 4427 8259:aload_1         
	// 4428 8260:getfield        #74  <Field int azh.D>
	// 4429 8263:aload_0         
	// 4430 8264:getfield        #12  <Field azh a>
	// 4431 8267:getfield        #339 <Field int azh.h>
	// 4432 8270:iand            
	// 4433 8271:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 4434 8274:aload_0         
	// 4435 8275:getfield        #12  <Field azh a>
	// 4436 8278:astore_1        
		abyte0.aA = ((azh) (abyte0)).h & ~a.ab;
	// 4437 8279:aload_1         
	// 4438 8280:aload_1         
	// 4439 8281:getfield        #339 <Field int azh.h>
	// 4440 8284:aload_0         
	// 4441 8285:getfield        #12  <Field azh a>
	// 4442 8288:getfield        #77  <Field int azh.ab>
	// 4443 8291:iconst_m1       
	// 4444 8292:ixor            
	// 4445 8293:iand            
	// 4446 8294:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 4447 8297:aload_0         
	// 4448 8298:getfield        #12  <Field azh a>
	// 4449 8301:astore_1        
		abyte0.bL = ((azh) (abyte0)).ae & ~a.I;
	// 4450 8302:aload_1         
	// 4451 8303:aload_1         
	// 4452 8304:getfield        #288 <Field int azh.ae>
	// 4453 8307:aload_0         
	// 4454 8308:getfield        #12  <Field azh a>
	// 4455 8311:getfield        #282 <Field int azh.I>
	// 4456 8314:iconst_m1       
	// 4457 8315:ixor            
	// 4458 8316:iand            
	// 4459 8317:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4460 8320:aload_0         
	// 4461 8321:getfield        #12  <Field azh a>
	// 4462 8324:astore_1        
		abyte0.aW = ((azh) (abyte0)).c & ~a.bL;
	// 4463 8325:aload_1         
	// 4464 8326:aload_1         
	// 4465 8327:getfield        #291 <Field int azh.c>
	// 4466 8330:aload_0         
	// 4467 8331:getfield        #12  <Field azh a>
	// 4468 8334:getfield        #342 <Field int azh.bL>
	// 4469 8337:iconst_m1       
	// 4470 8338:ixor            
	// 4471 8339:iand            
	// 4472 8340:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4473 8343:aload_0         
	// 4474 8344:getfield        #12  <Field azh a>
	// 4475 8347:astore_1        
		abyte0.aW = ((azh) (abyte0)).I ^ a.aW;
	// 4476 8348:aload_1         
	// 4477 8349:aload_1         
	// 4478 8350:getfield        #282 <Field int azh.I>
	// 4479 8353:aload_0         
	// 4480 8354:getfield        #12  <Field azh a>
	// 4481 8357:getfield        #345 <Field int azh.aW>
	// 4482 8360:ixor            
	// 4483 8361:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4484 8364:aload_0         
	// 4485 8365:getfield        #12  <Field azh a>
	// 4486 8368:astore_1        
		abyte0.aW = ((azh) (abyte0)).A & a.aW;
	// 4487 8369:aload_1         
	// 4488 8370:aload_1         
	// 4489 8371:getfield        #294 <Field int azh.A>
	// 4490 8374:aload_0         
	// 4491 8375:getfield        #12  <Field azh a>
	// 4492 8378:getfield        #345 <Field int azh.aW>
	// 4493 8381:iand            
	// 4494 8382:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4495 8385:aload_0         
	// 4496 8386:getfield        #12  <Field azh a>
	// 4497 8389:astore_1        
		abyte0.aW = ((azh) (abyte0)).bi ^ a.aW;
	// 4498 8390:aload_1         
	// 4499 8391:aload_1         
	// 4500 8392:getfield        #324 <Field int azh.bi>
	// 4501 8395:aload_0         
	// 4502 8396:getfield        #12  <Field azh a>
	// 4503 8399:getfield        #345 <Field int azh.aW>
	// 4504 8402:ixor            
	// 4505 8403:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4506 8406:aload_0         
	// 4507 8407:getfield        #12  <Field azh a>
	// 4508 8410:astore_1        
		abyte0.aW = ((azh) (abyte0)).s & ~a.aW;
	// 4509 8411:aload_1         
	// 4510 8412:aload_1         
	// 4511 8413:getfield        #327 <Field int azh.s>
	// 4512 8416:aload_0         
	// 4513 8417:getfield        #12  <Field azh a>
	// 4514 8420:getfield        #345 <Field int azh.aW>
	// 4515 8423:iconst_m1       
	// 4516 8424:ixor            
	// 4517 8425:iand            
	// 4518 8426:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4519 8429:aload_0         
	// 4520 8430:getfield        #12  <Field azh a>
	// 4521 8433:astore_1        
		abyte0.bL = ((azh) (abyte0)).bL & ~a.c;
	// 4522 8434:aload_1         
	// 4523 8435:aload_1         
	// 4524 8436:getfield        #342 <Field int azh.bL>
	// 4525 8439:aload_0         
	// 4526 8440:getfield        #12  <Field azh a>
	// 4527 8443:getfield        #291 <Field int azh.c>
	// 4528 8446:iconst_m1       
	// 4529 8447:ixor            
	// 4530 8448:iand            
	// 4531 8449:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4532 8452:aload_0         
	// 4533 8453:getfield        #12  <Field azh a>
	// 4534 8456:astore_1        
		abyte0.bL = ((azh) (abyte0)).aZ ^ a.bL;
	// 4535 8457:aload_1         
	// 4536 8458:aload_1         
	// 4537 8459:getfield        #232 <Field int azh.aZ>
	// 4538 8462:aload_0         
	// 4539 8463:getfield        #12  <Field azh a>
	// 4540 8466:getfield        #342 <Field int azh.bL>
	// 4541 8469:ixor            
	// 4542 8470:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4543 8473:aload_0         
	// 4544 8474:getfield        #12  <Field azh a>
	// 4545 8477:astore_1        
		abyte0.bL = ((azh) (abyte0)).A & ~a.bL;
	// 4546 8478:aload_1         
	// 4547 8479:aload_1         
	// 4548 8480:getfield        #294 <Field int azh.A>
	// 4549 8483:aload_0         
	// 4550 8484:getfield        #12  <Field azh a>
	// 4551 8487:getfield        #342 <Field int azh.bL>
	// 4552 8490:iconst_m1       
	// 4553 8491:ixor            
	// 4554 8492:iand            
	// 4555 8493:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4556 8496:aload_0         
	// 4557 8497:getfield        #12  <Field azh a>
	// 4558 8500:astore_1        
		abyte0.bL = ((azh) (abyte0)).n ^ a.bL;
	// 4559 8501:aload_1         
	// 4560 8502:aload_1         
	// 4561 8503:getfield        #80  <Field int azh.n>
	// 4562 8506:aload_0         
	// 4563 8507:getfield        #12  <Field azh a>
	// 4564 8510:getfield        #342 <Field int azh.bL>
	// 4565 8513:ixor            
	// 4566 8514:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4567 8517:aload_0         
	// 4568 8518:getfield        #12  <Field azh a>
	// 4569 8521:astore_1        
		abyte0.bL = ((azh) (abyte0)).s & a.bL;
	// 4570 8522:aload_1         
	// 4571 8523:aload_1         
	// 4572 8524:getfield        #327 <Field int azh.s>
	// 4573 8527:aload_0         
	// 4574 8528:getfield        #12  <Field azh a>
	// 4575 8531:getfield        #342 <Field int azh.bL>
	// 4576 8534:iand            
	// 4577 8535:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4578 8538:aload_0         
	// 4579 8539:getfield        #12  <Field azh a>
	// 4580 8542:astore_1        
		abyte0.bL = ((azh) (abyte0)).aH ^ a.bL;
	// 4581 8543:aload_1         
	// 4582 8544:aload_1         
	// 4583 8545:getfield        #214 <Field int azh.aH>
	// 4584 8548:aload_0         
	// 4585 8549:getfield        #12  <Field azh a>
	// 4586 8552:getfield        #342 <Field int azh.bL>
	// 4587 8555:ixor            
	// 4588 8556:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4589 8559:aload_0         
	// 4590 8560:getfield        #12  <Field azh a>
	// 4591 8563:astore_1        
		abyte0.N = ((azh) (abyte0)).bL ^ a.N;
	// 4592 8564:aload_1         
	// 4593 8565:aload_1         
	// 4594 8566:getfield        #342 <Field int azh.bL>
	// 4595 8569:aload_0         
	// 4596 8570:getfield        #12  <Field azh a>
	// 4597 8573:getfield        #348 <Field int azh.N>
	// 4598 8576:ixor            
	// 4599 8577:putfield        #348 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 4600 8580:aload_0         
	// 4601 8581:getfield        #12  <Field azh a>
	// 4602 8584:astore_1        
		abyte0.bL = ((azh) (abyte0)).ad ^ a.N;
	// 4603 8585:aload_1         
	// 4604 8586:aload_1         
	// 4605 8587:getfield        #351 <Field int azh.ad>
	// 4606 8590:aload_0         
	// 4607 8591:getfield        #12  <Field azh a>
	// 4608 8594:getfield        #348 <Field int azh.N>
	// 4609 8597:ixor            
	// 4610 8598:putfield        #342 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4611 8601:aload_0         
	// 4612 8602:getfield        #12  <Field azh a>
	// 4613 8605:astore_1        
		abyte0.aH = ((azh) (abyte0)).bL & ~a.al;
	// 4614 8606:aload_1         
	// 4615 8607:aload_1         
	// 4616 8608:getfield        #342 <Field int azh.bL>
	// 4617 8611:aload_0         
	// 4618 8612:getfield        #12  <Field azh a>
	// 4619 8615:getfield        #354 <Field int azh.al>
	// 4620 8618:iconst_m1       
	// 4621 8619:ixor            
	// 4622 8620:iand            
	// 4623 8621:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 4624 8624:aload_0         
	// 4625 8625:getfield        #12  <Field azh a>
	// 4626 8628:astore_1        
		abyte0.n = ((azh) (abyte0)).aj & a.N;
	// 4627 8629:aload_1         
	// 4628 8630:aload_1         
	// 4629 8631:getfield        #274 <Field int azh.aj>
	// 4630 8634:aload_0         
	// 4631 8635:getfield        #12  <Field azh a>
	// 4632 8638:getfield        #348 <Field int azh.N>
	// 4633 8641:iand            
	// 4634 8642:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 4635 8645:aload_0         
	// 4636 8646:getfield        #12  <Field azh a>
	// 4637 8649:astore_1        
		abyte0.aZ = ((azh) (abyte0)).h ^ a.N;
	// 4638 8650:aload_1         
	// 4639 8651:aload_1         
	// 4640 8652:getfield        #339 <Field int azh.h>
	// 4641 8655:aload_0         
	// 4642 8656:getfield        #12  <Field azh a>
	// 4643 8659:getfield        #348 <Field int azh.N>
	// 4644 8662:ixor            
	// 4645 8663:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4646 8666:aload_0         
	// 4647 8667:getfield        #12  <Field azh a>
	// 4648 8670:astore_1        
		abyte0.bi = ((azh) (abyte0)).aZ ^ a.aj;
	// 4649 8671:aload_1         
	// 4650 8672:aload_1         
	// 4651 8673:getfield        #232 <Field int azh.aZ>
	// 4652 8676:aload_0         
	// 4653 8677:getfield        #12  <Field azh a>
	// 4654 8680:getfield        #274 <Field int azh.aj>
	// 4655 8683:ixor            
	// 4656 8684:putfield        #324 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 4657 8687:aload_0         
	// 4658 8688:getfield        #12  <Field azh a>
	// 4659 8691:astore_1        
		abyte0.aV = ((azh) (abyte0)).aj & ~a.aZ;
	// 4660 8692:aload_1         
	// 4661 8693:aload_1         
	// 4662 8694:getfield        #274 <Field int azh.aj>
	// 4663 8697:aload_0         
	// 4664 8698:getfield        #12  <Field azh a>
	// 4665 8701:getfield        #232 <Field int azh.aZ>
	// 4666 8704:iconst_m1       
	// 4667 8705:ixor            
	// 4668 8706:iand            
	// 4669 8707:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 4670 8710:aload_0         
	// 4671 8711:getfield        #12  <Field azh a>
	// 4672 8714:astore_1        
		abyte0.aV = ((azh) (abyte0)).h ^ a.aV;
	// 4673 8715:aload_1         
	// 4674 8716:aload_1         
	// 4675 8717:getfield        #339 <Field int azh.h>
	// 4676 8720:aload_0         
	// 4677 8721:getfield        #12  <Field azh a>
	// 4678 8724:getfield        #357 <Field int azh.aV>
	// 4679 8727:ixor            
	// 4680 8728:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 4681 8731:aload_0         
	// 4682 8732:getfield        #12  <Field azh a>
	// 4683 8735:astore_1        
		abyte0.bq = ((azh) (abyte0)).N | a.ad;
	// 4684 8736:aload_1         
	// 4685 8737:aload_1         
	// 4686 8738:getfield        #348 <Field int azh.N>
	// 4687 8741:aload_0         
	// 4688 8742:getfield        #12  <Field azh a>
	// 4689 8745:getfield        #351 <Field int azh.ad>
	// 4690 8748:ior             
	// 4691 8749:putfield        #360 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 4692 8752:aload_0         
	// 4693 8753:getfield        #12  <Field azh a>
	// 4694 8756:astore_1        
		abyte0.bP = ((azh) (abyte0)).al | a.N;
	// 4695 8757:aload_1         
	// 4696 8758:aload_1         
	// 4697 8759:getfield        #354 <Field int azh.al>
	// 4698 8762:aload_0         
	// 4699 8763:getfield        #12  <Field azh a>
	// 4700 8766:getfield        #348 <Field int azh.N>
	// 4701 8769:ior             
	// 4702 8770:putfield        #363 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 4703 8773:aload_0         
	// 4704 8774:getfield        #12  <Field azh a>
	// 4705 8777:astore_1        
		abyte0.bN = ((azh) (abyte0)).N & ~a.h;
	// 4706 8778:aload_1         
	// 4707 8779:aload_1         
	// 4708 8780:getfield        #348 <Field int azh.N>
	// 4709 8783:aload_0         
	// 4710 8784:getfield        #12  <Field azh a>
	// 4711 8787:getfield        #339 <Field int azh.h>
	// 4712 8790:iconst_m1       
	// 4713 8791:ixor            
	// 4714 8792:iand            
	// 4715 8793:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 4716 8796:aload_0         
	// 4717 8797:getfield        #12  <Field azh a>
	// 4718 8800:astore_1        
		abyte0.n = ((azh) (abyte0)).bN ^ a.n;
	// 4719 8801:aload_1         
	// 4720 8802:aload_1         
	// 4721 8803:getfield        #366 <Field int azh.bN>
	// 4722 8806:aload_0         
	// 4723 8807:getfield        #12  <Field azh a>
	// 4724 8810:getfield        #80  <Field int azh.n>
	// 4725 8813:ixor            
	// 4726 8814:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 4727 8817:aload_0         
	// 4728 8818:getfield        #12  <Field azh a>
	// 4729 8821:astore_1        
		abyte0.aY = ((azh) (abyte0)).aj & a.bN;
	// 4730 8822:aload_1         
	// 4731 8823:aload_1         
	// 4732 8824:getfield        #274 <Field int azh.aj>
	// 4733 8827:aload_0         
	// 4734 8828:getfield        #12  <Field azh a>
	// 4735 8831:getfield        #366 <Field int azh.bN>
	// 4736 8834:iand            
	// 4737 8835:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 4738 8838:aload_0         
	// 4739 8839:getfield        #12  <Field azh a>
	// 4740 8842:astore_1        
		abyte0.aY = ((azh) (abyte0)).N ^ a.aY;
	// 4741 8843:aload_1         
	// 4742 8844:aload_1         
	// 4743 8845:getfield        #348 <Field int azh.N>
	// 4744 8848:aload_0         
	// 4745 8849:getfield        #12  <Field azh a>
	// 4746 8852:getfield        #369 <Field int azh.aY>
	// 4747 8855:ixor            
	// 4748 8856:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 4749 8859:aload_0         
	// 4750 8860:getfield        #12  <Field azh a>
	// 4751 8863:astore_1        
		abyte0.bc = ((azh) (abyte0)).aj & ~a.bN;
	// 4752 8864:aload_1         
	// 4753 8865:aload_1         
	// 4754 8866:getfield        #274 <Field int azh.aj>
	// 4755 8869:aload_0         
	// 4756 8870:getfield        #12  <Field azh a>
	// 4757 8873:getfield        #366 <Field int azh.bN>
	// 4758 8876:iconst_m1       
	// 4759 8877:ixor            
	// 4760 8878:iand            
	// 4761 8879:putfield        #372 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4762 8882:aload_0         
	// 4763 8883:getfield        #12  <Field azh a>
	// 4764 8886:astore_1        
		abyte0.bc = ((azh) (abyte0)).h ^ a.bc;
	// 4765 8887:aload_1         
	// 4766 8888:aload_1         
	// 4767 8889:getfield        #339 <Field int azh.h>
	// 4768 8892:aload_0         
	// 4769 8893:getfield        #12  <Field azh a>
	// 4770 8896:getfield        #372 <Field int azh.bc>
	// 4771 8899:ixor            
	// 4772 8900:putfield        #372 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4773 8903:aload_0         
	// 4774 8904:getfield        #12  <Field azh a>
	// 4775 8907:astore_1        
		abyte0.bc = ((azh) (abyte0)).x & a.bc;
	// 4776 8908:aload_1         
	// 4777 8909:aload_1         
	// 4778 8910:getfield        #179 <Field int azh.x>
	// 4779 8913:aload_0         
	// 4780 8914:getfield        #12  <Field azh a>
	// 4781 8917:getfield        #372 <Field int azh.bc>
	// 4782 8920:iand            
	// 4783 8921:putfield        #372 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 4784 8924:aload_0         
	// 4785 8925:getfield        #12  <Field azh a>
	// 4786 8928:astore_1        
		abyte0.bQ = ((azh) (abyte0)).N & ~a.bN;
	// 4787 8929:aload_1         
	// 4788 8930:aload_1         
	// 4789 8931:getfield        #348 <Field int azh.N>
	// 4790 8934:aload_0         
	// 4791 8935:getfield        #12  <Field azh a>
	// 4792 8938:getfield        #366 <Field int azh.bN>
	// 4793 8941:iconst_m1       
	// 4794 8942:ixor            
	// 4795 8943:iand            
	// 4796 8944:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 4797 8947:aload_0         
	// 4798 8948:getfield        #12  <Field azh a>
	// 4799 8951:astore_1        
		abyte0.bR = ((azh) (abyte0)).h & a.N;
	// 4800 8952:aload_1         
	// 4801 8953:aload_1         
	// 4802 8954:getfield        #339 <Field int azh.h>
	// 4803 8957:aload_0         
	// 4804 8958:getfield        #12  <Field azh a>
	// 4805 8961:getfield        #348 <Field int azh.N>
	// 4806 8964:iand            
	// 4807 8965:putfield        #378 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 4808 8968:aload_0         
	// 4809 8969:getfield        #12  <Field azh a>
	// 4810 8972:astore_1        
		abyte0.bR = ((azh) (abyte0)).aj & a.bR;
	// 4811 8973:aload_1         
	// 4812 8974:aload_1         
	// 4813 8975:getfield        #274 <Field int azh.aj>
	// 4814 8978:aload_0         
	// 4815 8979:getfield        #12  <Field azh a>
	// 4816 8982:getfield        #378 <Field int azh.bR>
	// 4817 8985:iand            
	// 4818 8986:putfield        #378 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 4819 8989:aload_0         
	// 4820 8990:getfield        #12  <Field azh a>
	// 4821 8993:astore_1        
		abyte0.bS = ((azh) (abyte0)).h & ~a.N;
	// 4822 8994:aload_1         
	// 4823 8995:aload_1         
	// 4824 8996:getfield        #339 <Field int azh.h>
	// 4825 8999:aload_0         
	// 4826 9000:getfield        #12  <Field azh a>
	// 4827 9003:getfield        #348 <Field int azh.N>
	// 4828 9006:iconst_m1       
	// 4829 9007:ixor            
	// 4830 9008:iand            
	// 4831 9009:putfield        #381 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 4832 9012:aload_0         
	// 4833 9013:getfield        #12  <Field azh a>
	// 4834 9016:astore_1        
		abyte0.bT = ((azh) (abyte0)).aj & ~a.bS;
	// 4835 9017:aload_1         
	// 4836 9018:aload_1         
	// 4837 9019:getfield        #274 <Field int azh.aj>
	// 4838 9022:aload_0         
	// 4839 9023:getfield        #12  <Field azh a>
	// 4840 9026:getfield        #381 <Field int azh.bS>
	// 4841 9029:iconst_m1       
	// 4842 9030:ixor            
	// 4843 9031:iand            
	// 4844 9032:putfield        #384 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 4845 9035:aload_0         
	// 4846 9036:getfield        #12  <Field azh a>
	// 4847 9039:astore_1        
		abyte0.bT = ((azh) (abyte0)).aZ ^ a.bT;
	// 4848 9040:aload_1         
	// 4849 9041:aload_1         
	// 4850 9042:getfield        #232 <Field int azh.aZ>
	// 4851 9045:aload_0         
	// 4852 9046:getfield        #12  <Field azh a>
	// 4853 9049:getfield        #384 <Field int azh.bT>
	// 4854 9052:ixor            
	// 4855 9053:putfield        #384 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 4856 9056:aload_0         
	// 4857 9057:getfield        #12  <Field azh a>
	// 4858 9060:astore_1        
		abyte0.bU = ((azh) (abyte0)).aj & ~a.bS;
	// 4859 9061:aload_1         
	// 4860 9062:aload_1         
	// 4861 9063:getfield        #274 <Field int azh.aj>
	// 4862 9066:aload_0         
	// 4863 9067:getfield        #12  <Field azh a>
	// 4864 9070:getfield        #381 <Field int azh.bS>
	// 4865 9073:iconst_m1       
	// 4866 9074:ixor            
	// 4867 9075:iand            
	// 4868 9076:putfield        #387 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 4869 9079:aload_0         
	// 4870 9080:getfield        #12  <Field azh a>
	// 4871 9083:astore_1        
		abyte0.bV = ((azh) (abyte0)).N | a.bS;
	// 4872 9084:aload_1         
	// 4873 9085:aload_1         
	// 4874 9086:getfield        #348 <Field int azh.N>
	// 4875 9089:aload_0         
	// 4876 9090:getfield        #12  <Field azh a>
	// 4877 9093:getfield        #381 <Field int azh.bS>
	// 4878 9096:ior             
	// 4879 9097:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4880 9100:aload_0         
	// 4881 9101:getfield        #12  <Field azh a>
	// 4882 9104:astore_1        
		abyte0.bW = ((azh) (abyte0)).aj & a.bV;
	// 4883 9105:aload_1         
	// 4884 9106:aload_1         
	// 4885 9107:getfield        #274 <Field int azh.aj>
	// 4886 9110:aload_0         
	// 4887 9111:getfield        #12  <Field azh a>
	// 4888 9114:getfield        #390 <Field int azh.bV>
	// 4889 9117:iand            
	// 4890 9118:putfield        #393 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4891 9121:aload_0         
	// 4892 9122:getfield        #12  <Field azh a>
	// 4893 9125:astore_1        
		abyte0.bV = ((azh) (abyte0)).aj & a.bV;
	// 4894 9126:aload_1         
	// 4895 9127:aload_1         
	// 4896 9128:getfield        #274 <Field int azh.aj>
	// 4897 9131:aload_0         
	// 4898 9132:getfield        #12  <Field azh a>
	// 4899 9135:getfield        #390 <Field int azh.bV>
	// 4900 9138:iand            
	// 4901 9139:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4902 9142:aload_0         
	// 4903 9143:getfield        #12  <Field azh a>
	// 4904 9146:astore_1        
		abyte0.bV = ((azh) (abyte0)).bN ^ a.bV;
	// 4905 9147:aload_1         
	// 4906 9148:aload_1         
	// 4907 9149:getfield        #366 <Field int azh.bN>
	// 4908 9152:aload_0         
	// 4909 9153:getfield        #12  <Field azh a>
	// 4910 9156:getfield        #390 <Field int azh.bV>
	// 4911 9159:ixor            
	// 4912 9160:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4913 9163:aload_0         
	// 4914 9164:getfield        #12  <Field azh a>
	// 4915 9167:astore_1        
		abyte0.bV = ((azh) (abyte0)).x & a.bV;
	// 4916 9168:aload_1         
	// 4917 9169:aload_1         
	// 4918 9170:getfield        #179 <Field int azh.x>
	// 4919 9173:aload_0         
	// 4920 9174:getfield        #12  <Field azh a>
	// 4921 9177:getfield        #390 <Field int azh.bV>
	// 4922 9180:iand            
	// 4923 9181:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4924 9184:aload_0         
	// 4925 9185:getfield        #12  <Field azh a>
	// 4926 9188:astore_1        
		abyte0.bX = ((azh) (abyte0)).aj & a.bS;
	// 4927 9189:aload_1         
	// 4928 9190:aload_1         
	// 4929 9191:getfield        #274 <Field int azh.aj>
	// 4930 9194:aload_0         
	// 4931 9195:getfield        #12  <Field azh a>
	// 4932 9198:getfield        #381 <Field int azh.bS>
	// 4933 9201:iand            
	// 4934 9202:putfield        #396 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 4935 9205:aload_0         
	// 4936 9206:getfield        #12  <Field azh a>
	// 4937 9209:astore_1        
		abyte0.bX = ((azh) (abyte0)).x & ~a.bX;
	// 4938 9210:aload_1         
	// 4939 9211:aload_1         
	// 4940 9212:getfield        #179 <Field int azh.x>
	// 4941 9215:aload_0         
	// 4942 9216:getfield        #12  <Field azh a>
	// 4943 9219:getfield        #396 <Field int azh.bX>
	// 4944 9222:iconst_m1       
	// 4945 9223:ixor            
	// 4946 9224:iand            
	// 4947 9225:putfield        #396 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 4948 9228:aload_0         
	// 4949 9229:getfield        #12  <Field azh a>
	// 4950 9232:astore_1        
		abyte0.bY = ((azh) (abyte0)).aj & a.bS;
	// 4951 9233:aload_1         
	// 4952 9234:aload_1         
	// 4953 9235:getfield        #274 <Field int azh.aj>
	// 4954 9238:aload_0         
	// 4955 9239:getfield        #12  <Field azh a>
	// 4956 9242:getfield        #381 <Field int azh.bS>
	// 4957 9245:iand            
	// 4958 9246:putfield        #399 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4959 9249:aload_0         
	// 4960 9250:getfield        #12  <Field azh a>
	// 4961 9253:astore_1        
		abyte0.bY = ((azh) (abyte0)).bS ^ a.bY;
	// 4962 9254:aload_1         
	// 4963 9255:aload_1         
	// 4964 9256:getfield        #381 <Field int azh.bS>
	// 4965 9259:aload_0         
	// 4966 9260:getfield        #12  <Field azh a>
	// 4967 9263:getfield        #399 <Field int azh.bY>
	// 4968 9266:ixor            
	// 4969 9267:putfield        #399 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4970 9270:aload_0         
	// 4971 9271:getfield        #12  <Field azh a>
	// 4972 9274:astore_1        
		abyte0.bY = ((azh) (abyte0)).x & ~a.bY;
	// 4973 9275:aload_1         
	// 4974 9276:aload_1         
	// 4975 9277:getfield        #179 <Field int azh.x>
	// 4976 9280:aload_0         
	// 4977 9281:getfield        #12  <Field azh a>
	// 4978 9284:getfield        #399 <Field int azh.bY>
	// 4979 9287:iconst_m1       
	// 4980 9288:ixor            
	// 4981 9289:iand            
	// 4982 9290:putfield        #399 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4983 9293:aload_0         
	// 4984 9294:getfield        #12  <Field azh a>
	// 4985 9297:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aj & ~a.bS;
	// 4986 9298:aload_1         
	// 4987 9299:aload_1         
	// 4988 9300:getfield        #274 <Field int azh.aj>
	// 4989 9303:aload_0         
	// 4990 9304:getfield        #12  <Field azh a>
	// 4991 9307:getfield        #381 <Field int azh.bS>
	// 4992 9310:iconst_m1       
	// 4993 9311:ixor            
	// 4994 9312:iand            
	// 4995 9313:putfield        #402 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4996 9316:aload_0         
	// 4997 9317:getfield        #12  <Field azh a>
	// 4998 9320:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bS ^ a.bZ;
	// 4999 9321:aload_1         
	// 5000 9322:aload_1         
	// 5001 9323:getfield        #381 <Field int azh.bS>
	// 5002 9326:aload_0         
	// 5003 9327:getfield        #12  <Field azh a>
	// 5004 9330:getfield        #402 <Field int azh.bZ>
	// 5005 9333:ixor            
	// 5006 9334:putfield        #402 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5007 9337:aload_0         
	// 5008 9338:getfield        #12  <Field azh a>
	// 5009 9341:astore_1        
		abyte0.ca = ((azh) (abyte0)).aj & a.bS;
	// 5010 9342:aload_1         
	// 5011 9343:aload_1         
	// 5012 9344:getfield        #274 <Field int azh.aj>
	// 5013 9347:aload_0         
	// 5014 9348:getfield        #12  <Field azh a>
	// 5015 9351:getfield        #381 <Field int azh.bS>
	// 5016 9354:iand            
	// 5017 9355:putfield        #405 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 5018 9358:aload_0         
	// 5019 9359:getfield        #12  <Field azh a>
	// 5020 9362:astore_1        
		abyte0.ca = ((azh) (abyte0)).aZ ^ a.ca;
	// 5021 9363:aload_1         
	// 5022 9364:aload_1         
	// 5023 9365:getfield        #232 <Field int azh.aZ>
	// 5024 9368:aload_0         
	// 5025 9369:getfield        #12  <Field azh a>
	// 5026 9372:getfield        #405 <Field int azh.ca>
	// 5027 9375:ixor            
	// 5028 9376:putfield        #405 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 5029 9379:aload_0         
	// 5030 9380:getfield        #12  <Field azh a>
	// 5031 9383:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aj & a.bS;
	// 5032 9384:aload_1         
	// 5033 9385:aload_1         
	// 5034 9386:getfield        #274 <Field int azh.aj>
	// 5035 9389:aload_0         
	// 5036 9390:getfield        #12  <Field azh a>
	// 5037 9393:getfield        #381 <Field int azh.bS>
	// 5038 9396:iand            
	// 5039 9397:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5040 9400:aload_0         
	// 5041 9401:getfield        #12  <Field azh a>
	// 5042 9404:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bQ ^ a.aZ;
	// 5043 9405:aload_1         
	// 5044 9406:aload_1         
	// 5045 9407:getfield        #375 <Field int azh.bQ>
	// 5046 9410:aload_0         
	// 5047 9411:getfield        #12  <Field azh a>
	// 5048 9414:getfield        #232 <Field int azh.aZ>
	// 5049 9417:ixor            
	// 5050 9418:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5051 9421:aload_0         
	// 5052 9422:getfield        #12  <Field azh a>
	// 5053 9425:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aj & a.N;
	// 5054 9426:aload_1         
	// 5055 9427:aload_1         
	// 5056 9428:getfield        #274 <Field int azh.aj>
	// 5057 9431:aload_0         
	// 5058 9432:getfield        #12  <Field azh a>
	// 5059 9435:getfield        #348 <Field int azh.N>
	// 5060 9438:iand            
	// 5061 9439:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5062 9442:aload_0         
	// 5063 9443:getfield        #12  <Field azh a>
	// 5064 9446:astore_1        
		abyte0.bQ = ((azh) (abyte0)).N ^ a.bQ;
	// 5065 9447:aload_1         
	// 5066 9448:aload_1         
	// 5067 9449:getfield        #348 <Field int azh.N>
	// 5068 9452:aload_0         
	// 5069 9453:getfield        #12  <Field azh a>
	// 5070 9456:getfield        #375 <Field int azh.bQ>
	// 5071 9459:ixor            
	// 5072 9460:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5073 9463:aload_0         
	// 5074 9464:getfield        #12  <Field azh a>
	// 5075 9467:astore_1        
		abyte0.bQ = ((azh) (abyte0)).x & a.bQ;
	// 5076 9468:aload_1         
	// 5077 9469:aload_1         
	// 5078 9470:getfield        #179 <Field int azh.x>
	// 5079 9473:aload_0         
	// 5080 9474:getfield        #12  <Field azh a>
	// 5081 9477:getfield        #375 <Field int azh.bQ>
	// 5082 9480:iand            
	// 5083 9481:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5084 9484:aload_0         
	// 5085 9485:getfield        #12  <Field azh a>
	// 5086 9488:astore_1        
		abyte0.cb = ((azh) (abyte0)).h | a.N;
	// 5087 9489:aload_1         
	// 5088 9490:aload_1         
	// 5089 9491:getfield        #339 <Field int azh.h>
	// 5090 9494:aload_0         
	// 5091 9495:getfield        #12  <Field azh a>
	// 5092 9498:getfield        #348 <Field int azh.N>
	// 5093 9501:ior             
	// 5094 9502:putfield        #408 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5095 9505:aload_0         
	// 5096 9506:getfield        #12  <Field azh a>
	// 5097 9509:astore_1        
		abyte0.bU = ((azh) (abyte0)).cb ^ a.bU;
	// 5098 9510:aload_1         
	// 5099 9511:aload_1         
	// 5100 9512:getfield        #408 <Field int azh.cb>
	// 5101 9515:aload_0         
	// 5102 9516:getfield        #12  <Field azh a>
	// 5103 9519:getfield        #387 <Field int azh.bU>
	// 5104 9522:ixor            
	// 5105 9523:putfield        #387 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 5106 9526:aload_0         
	// 5107 9527:getfield        #12  <Field azh a>
	// 5108 9530:astore_1        
		abyte0.cb = ((azh) (abyte0)).aj & ~a.cb;
	// 5109 9531:aload_1         
	// 5110 9532:aload_1         
	// 5111 9533:getfield        #274 <Field int azh.aj>
	// 5112 9536:aload_0         
	// 5113 9537:getfield        #12  <Field azh a>
	// 5114 9540:getfield        #408 <Field int azh.cb>
	// 5115 9543:iconst_m1       
	// 5116 9544:ixor            
	// 5117 9545:iand            
	// 5118 9546:putfield        #408 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5119 9549:aload_0         
	// 5120 9550:getfield        #12  <Field azh a>
	// 5121 9553:astore_1        
		abyte0.cb = ((azh) (abyte0)).N ^ a.cb;
	// 5122 9554:aload_1         
	// 5123 9555:aload_1         
	// 5124 9556:getfield        #348 <Field int azh.N>
	// 5125 9559:aload_0         
	// 5126 9560:getfield        #12  <Field azh a>
	// 5127 9563:getfield        #408 <Field int azh.cb>
	// 5128 9566:ixor            
	// 5129 9567:putfield        #408 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5130 9570:aload_0         
	// 5131 9571:getfield        #12  <Field azh a>
	// 5132 9574:astore_1        
		abyte0.av = ((azh) (abyte0)).av & a.I;
	// 5133 9575:aload_1         
	// 5134 9576:aload_1         
	// 5135 9577:getfield        #411 <Field int azh.av>
	// 5136 9580:aload_0         
	// 5137 9581:getfield        #12  <Field azh a>
	// 5138 9584:getfield        #282 <Field int azh.I>
	// 5139 9587:iand            
	// 5140 9588:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5141 9591:aload_0         
	// 5142 9592:getfield        #12  <Field azh a>
	// 5143 9595:astore_1        
		abyte0.av = ((azh) (abyte0)).aS ^ a.av;
	// 5144 9596:aload_1         
	// 5145 9597:aload_1         
	// 5146 9598:getfield        #414 <Field int azh.aS>
	// 5147 9601:aload_0         
	// 5148 9602:getfield        #12  <Field azh a>
	// 5149 9605:getfield        #411 <Field int azh.av>
	// 5150 9608:ixor            
	// 5151 9609:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5152 9612:aload_0         
	// 5153 9613:getfield        #12  <Field azh a>
	// 5154 9616:astore_1        
		abyte0.af = ((azh) (abyte0)).av ^ a.af;
	// 5155 9617:aload_1         
	// 5156 9618:aload_1         
	// 5157 9619:getfield        #411 <Field int azh.av>
	// 5158 9622:aload_0         
	// 5159 9623:getfield        #12  <Field azh a>
	// 5160 9626:getfield        #417 <Field int azh.af>
	// 5161 9629:ixor            
	// 5162 9630:putfield        #417 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 5163 9633:aload_0         
	// 5164 9634:getfield        #12  <Field azh a>
	// 5165 9637:astore_1        
		abyte0.aC = ((azh) (abyte0)).af | a.aC;
	// 5166 9638:aload_1         
	// 5167 9639:aload_1         
	// 5168 9640:getfield        #417 <Field int azh.af>
	// 5169 9643:aload_0         
	// 5170 9644:getfield        #12  <Field azh a>
	// 5171 9647:getfield        #197 <Field int azh.aC>
	// 5172 9650:ior             
	// 5173 9651:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5174 9654:aload_0         
	// 5175 9655:getfield        #12  <Field azh a>
	// 5176 9658:astore_1        
		abyte0.aC = ((azh) (abyte0)).ay ^ a.aC;
	// 5177 9659:aload_1         
	// 5178 9660:aload_1         
	// 5179 9661:getfield        #265 <Field int azh.ay>
	// 5180 9664:aload_0         
	// 5181 9665:getfield        #12  <Field azh a>
	// 5182 9668:getfield        #197 <Field int azh.aC>
	// 5183 9671:ixor            
	// 5184 9672:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5185 9675:aload_0         
	// 5186 9676:getfield        #12  <Field azh a>
	// 5187 9679:astore_1        
		abyte0.av = ((azh) (abyte0)).af & ~a.J;
	// 5188 9680:aload_1         
	// 5189 9681:aload_1         
	// 5190 9682:getfield        #417 <Field int azh.af>
	// 5191 9685:aload_0         
	// 5192 9686:getfield        #12  <Field azh a>
	// 5193 9689:getfield        #176 <Field int azh.J>
	// 5194 9692:iconst_m1       
	// 5195 9693:ixor            
	// 5196 9694:iand            
	// 5197 9695:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5198 9698:aload_0         
	// 5199 9699:getfield        #12  <Field azh a>
	// 5200 9702:astore_1        
		abyte0.aS = ((azh) (abyte0)).av & ~a.B;
	// 5201 9703:aload_1         
	// 5202 9704:aload_1         
	// 5203 9705:getfield        #411 <Field int azh.av>
	// 5204 9708:aload_0         
	// 5205 9709:getfield        #12  <Field azh a>
	// 5206 9712:getfield        #229 <Field int azh.B>
	// 5207 9715:iconst_m1       
	// 5208 9716:ixor            
	// 5209 9717:iand            
	// 5210 9718:putfield        #414 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 5211 9721:aload_0         
	// 5212 9722:getfield        #12  <Field azh a>
	// 5213 9725:astore_1        
		abyte0.aS = ((azh) (abyte0)).av ^ a.aS;
	// 5214 9726:aload_1         
	// 5215 9727:aload_1         
	// 5216 9728:getfield        #411 <Field int azh.av>
	// 5217 9731:aload_0         
	// 5218 9732:getfield        #12  <Field azh a>
	// 5219 9735:getfield        #414 <Field int azh.aS>
	// 5220 9738:ixor            
	// 5221 9739:putfield        #414 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 5222 9742:aload_0         
	// 5223 9743:getfield        #12  <Field azh a>
	// 5224 9746:astore_1        
		abyte0.cc = ((azh) (abyte0)).aS | a.d;
	// 5225 9747:aload_1         
	// 5226 9748:aload_1         
	// 5227 9749:getfield        #414 <Field int azh.aS>
	// 5228 9752:aload_0         
	// 5229 9753:getfield        #12  <Field azh a>
	// 5230 9756:getfield        #173 <Field int azh.d>
	// 5231 9759:ior             
	// 5232 9760:putfield        #420 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5233 9763:aload_0         
	// 5234 9764:getfield        #12  <Field azh a>
	// 5235 9767:astore_1        
		abyte0.av = ((azh) (abyte0)).B | a.av;
	// 5236 9768:aload_1         
	// 5237 9769:aload_1         
	// 5238 9770:getfield        #229 <Field int azh.B>
	// 5239 9773:aload_0         
	// 5240 9774:getfield        #12  <Field azh a>
	// 5241 9777:getfield        #411 <Field int azh.av>
	// 5242 9780:ior             
	// 5243 9781:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5244 9784:aload_0         
	// 5245 9785:getfield        #12  <Field azh a>
	// 5246 9788:astore_1        
		abyte0.av = ((azh) (abyte0)).af ^ a.av;
	// 5247 9789:aload_1         
	// 5248 9790:aload_1         
	// 5249 9791:getfield        #417 <Field int azh.af>
	// 5250 9794:aload_0         
	// 5251 9795:getfield        #12  <Field azh a>
	// 5252 9798:getfield        #411 <Field int azh.av>
	// 5253 9801:ixor            
	// 5254 9802:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5255 9805:aload_0         
	// 5256 9806:getfield        #12  <Field azh a>
	// 5257 9809:astore_1        
		abyte0.av = ((azh) (abyte0)).d & ~a.av;
	// 5258 9810:aload_1         
	// 5259 9811:aload_1         
	// 5260 9812:getfield        #173 <Field int azh.d>
	// 5261 9815:aload_0         
	// 5262 9816:getfield        #12  <Field azh a>
	// 5263 9819:getfield        #411 <Field int azh.av>
	// 5264 9822:iconst_m1       
	// 5265 9823:ixor            
	// 5266 9824:iand            
	// 5267 9825:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5268 9828:aload_0         
	// 5269 9829:getfield        #12  <Field azh a>
	// 5270 9832:astore_1        
		abyte0.aO = ((azh) (abyte0)).af & ~a.aO;
	// 5271 9833:aload_1         
	// 5272 9834:aload_1         
	// 5273 9835:getfield        #417 <Field int azh.af>
	// 5274 9838:aload_0         
	// 5275 9839:getfield        #12  <Field azh a>
	// 5276 9842:getfield        #86  <Field int azh.aO>
	// 5277 9845:iconst_m1       
	// 5278 9846:ixor            
	// 5279 9847:iand            
	// 5280 9848:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5281 9851:aload_0         
	// 5282 9852:getfield        #12  <Field azh a>
	// 5283 9855:astore_1        
		abyte0.aO = ((azh) (abyte0)).ar ^ a.aO;
	// 5284 9856:aload_1         
	// 5285 9857:aload_1         
	// 5286 9858:getfield        #250 <Field int azh.ar>
	// 5287 9861:aload_0         
	// 5288 9862:getfield        #12  <Field azh a>
	// 5289 9865:getfield        #86  <Field int azh.aO>
	// 5290 9868:ixor            
	// 5291 9869:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5292 9872:aload_0         
	// 5293 9873:getfield        #12  <Field azh a>
	// 5294 9876:astore_1        
		abyte0.aO = ((azh) (abyte0)).d & a.aO;
	// 5295 9877:aload_1         
	// 5296 9878:aload_1         
	// 5297 9879:getfield        #173 <Field int azh.d>
	// 5298 9882:aload_0         
	// 5299 9883:getfield        #12  <Field azh a>
	// 5300 9886:getfield        #86  <Field int azh.aO>
	// 5301 9889:iand            
	// 5302 9890:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5303 9893:aload_0         
	// 5304 9894:getfield        #12  <Field azh a>
	// 5305 9897:astore_1        
		abyte0.aq = ((azh) (abyte0)).af & ~a.aq;
	// 5306 9898:aload_1         
	// 5307 9899:aload_1         
	// 5308 9900:getfield        #417 <Field int azh.af>
	// 5309 9903:aload_0         
	// 5310 9904:getfield        #12  <Field azh a>
	// 5311 9907:getfield        #38  <Field int azh.aq>
	// 5312 9910:iconst_m1       
	// 5313 9911:ixor            
	// 5314 9912:iand            
	// 5315 9913:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5316 9916:aload_0         
	// 5317 9917:getfield        #12  <Field azh a>
	// 5318 9920:astore_1        
		abyte0.aq = ((azh) (abyte0)).ay ^ a.aq;
	// 5319 9921:aload_1         
	// 5320 9922:aload_1         
	// 5321 9923:getfield        #265 <Field int azh.ay>
	// 5322 9926:aload_0         
	// 5323 9927:getfield        #12  <Field azh a>
	// 5324 9930:getfield        #38  <Field int azh.aq>
	// 5325 9933:ixor            
	// 5326 9934:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 5327 9937:aload_0         
	// 5328 9938:getfield        #12  <Field azh a>
	// 5329 9941:astore_1        
		abyte0.aO = ((azh) (abyte0)).aq ^ a.aO;
	// 5330 9942:aload_1         
	// 5331 9943:aload_1         
	// 5332 9944:getfield        #38  <Field int azh.aq>
	// 5333 9947:aload_0         
	// 5334 9948:getfield        #12  <Field azh a>
	// 5335 9951:getfield        #86  <Field int azh.aO>
	// 5336 9954:ixor            
	// 5337 9955:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5338 9958:aload_0         
	// 5339 9959:getfield        #12  <Field azh a>
	// 5340 9962:astore_1        
		abyte0.ar = ((azh) (abyte0)).af & ~a.X;
	// 5341 9963:aload_1         
	// 5342 9964:aload_1         
	// 5343 9965:getfield        #417 <Field int azh.af>
	// 5344 9968:aload_0         
	// 5345 9969:getfield        #12  <Field azh a>
	// 5346 9972:getfield        #26  <Field int azh.X>
	// 5347 9975:iconst_m1       
	// 5348 9976:ixor            
	// 5349 9977:iand            
	// 5350 9978:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 5351 9981:aload_0         
	// 5352 9982:getfield        #12  <Field azh a>
	// 5353 9985:astore_1        
		abyte0.ar = ((azh) (abyte0)).bk ^ a.ar;
	// 5354 9986:aload_1         
	// 5355 9987:aload_1         
	// 5356 9988:getfield        #259 <Field int azh.bk>
	// 5357 9991:aload_0         
	// 5358 9992:getfield        #12  <Field azh a>
	// 5359 9995:getfield        #250 <Field int azh.ar>
	// 5360 9998:ixor            
	// 5361 9999:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 5362 10002:aload_0         
	// 5363 10003:getfield        #12  <Field azh a>
	// 5364 10006:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar ^ a.d;
	// 5365 10007:aload_1         
	// 5366 10008:aload_1         
	// 5367 10009:getfield        #250 <Field int azh.ar>
	// 5368 10012:aload_0         
	// 5369 10013:getfield        #12  <Field azh a>
	// 5370 10016:getfield        #173 <Field int azh.d>
	// 5371 10019:ixor            
	// 5372 10020:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 5373 10023:aload_0         
	// 5374 10024:getfield        #12  <Field azh a>
	// 5375 10027:astore_1        
		abyte0.cd = ((azh) (abyte0)).bF & ~a.af;
	// 5376 10028:aload_1         
	// 5377 10029:aload_1         
	// 5378 10030:getfield        #68  <Field int azh.bF>
	// 5379 10033:aload_0         
	// 5380 10034:getfield        #12  <Field azh a>
	// 5381 10037:getfield        #417 <Field int azh.af>
	// 5382 10040:iconst_m1       
	// 5383 10041:ixor            
	// 5384 10042:iand            
	// 5385 10043:putfield        #423 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5386 10046:aload_0         
	// 5387 10047:getfield        #12  <Field azh a>
	// 5388 10050:astore_1        
		abyte0.cd = ((azh) (abyte0)).aK ^ a.cd;
	// 5389 10051:aload_1         
	// 5390 10052:aload_1         
	// 5391 10053:getfield        #131 <Field int azh.aK>
	// 5392 10056:aload_0         
	// 5393 10057:getfield        #12  <Field azh a>
	// 5394 10060:getfield        #423 <Field int azh.cd>
	// 5395 10063:ixor            
	// 5396 10064:putfield        #423 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5397 10067:aload_0         
	// 5398 10068:getfield        #12  <Field azh a>
	// 5399 10071:astore_1        
		abyte0.bF = ((azh) (abyte0)).af & a.bF;
	// 5400 10072:aload_1         
	// 5401 10073:aload_1         
	// 5402 10074:getfield        #417 <Field int azh.af>
	// 5403 10077:aload_0         
	// 5404 10078:getfield        #12  <Field azh a>
	// 5405 10081:getfield        #68  <Field int azh.bF>
	// 5406 10084:iand            
	// 5407 10085:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5408 10088:aload_0         
	// 5409 10089:getfield        #12  <Field azh a>
	// 5410 10092:astore_1        
		abyte0.bF = ((azh) (abyte0)).bf ^ a.bF;
	// 5411 10093:aload_1         
	// 5412 10094:aload_1         
	// 5413 10095:getfield        #247 <Field int azh.bf>
	// 5414 10098:aload_0         
	// 5415 10099:getfield        #12  <Field azh a>
	// 5416 10102:getfield        #68  <Field int azh.bF>
	// 5417 10105:ixor            
	// 5418 10106:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5419 10109:aload_0         
	// 5420 10110:getfield        #12  <Field azh a>
	// 5421 10113:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & a.af;
	// 5422 10114:aload_1         
	// 5423 10115:aload_1         
	// 5424 10116:getfield        #256 <Field int azh.bm>
	// 5425 10119:aload_0         
	// 5426 10120:getfield        #12  <Field azh a>
	// 5427 10123:getfield        #417 <Field int azh.af>
	// 5428 10126:iand            
	// 5429 10127:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5430 10130:aload_0         
	// 5431 10131:getfield        #12  <Field azh a>
	// 5432 10134:astore_1        
		abyte0.bm = ((azh) (abyte0)).aN ^ a.bm;
	// 5433 10135:aload_1         
	// 5434 10136:aload_1         
	// 5435 10137:getfield        #35  <Field int azh.aN>
	// 5436 10140:aload_0         
	// 5437 10141:getfield        #12  <Field azh a>
	// 5438 10144:getfield        #256 <Field int azh.bm>
	// 5439 10147:ixor            
	// 5440 10148:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5441 10151:aload_0         
	// 5442 10152:getfield        #12  <Field azh a>
	// 5443 10155:astore_1        
		abyte0.bm = ((azh) (abyte0)).d | a.bm;
	// 5444 10156:aload_1         
	// 5445 10157:aload_1         
	// 5446 10158:getfield        #173 <Field int azh.d>
	// 5447 10161:aload_0         
	// 5448 10162:getfield        #12  <Field azh a>
	// 5449 10165:getfield        #256 <Field int azh.bm>
	// 5450 10168:ior             
	// 5451 10169:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5452 10172:aload_0         
	// 5453 10173:getfield        #12  <Field azh a>
	// 5454 10176:astore_1        
		abyte0.bm = ((azh) (abyte0)).cd ^ a.bm;
	// 5455 10177:aload_1         
	// 5456 10178:aload_1         
	// 5457 10179:getfield        #423 <Field int azh.cd>
	// 5458 10182:aload_0         
	// 5459 10183:getfield        #12  <Field azh a>
	// 5460 10186:getfield        #256 <Field int azh.bm>
	// 5461 10189:ixor            
	// 5462 10190:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5463 10193:aload_0         
	// 5464 10194:getfield        #12  <Field azh a>
	// 5465 10197:astore_1        
		abyte0.aK = ((azh) (abyte0)).af & a.aK;
	// 5466 10198:aload_1         
	// 5467 10199:aload_1         
	// 5468 10200:getfield        #417 <Field int azh.af>
	// 5469 10203:aload_0         
	// 5470 10204:getfield        #12  <Field azh a>
	// 5471 10207:getfield        #131 <Field int azh.aK>
	// 5472 10210:iand            
	// 5473 10211:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5474 10214:aload_0         
	// 5475 10215:getfield        #12  <Field azh a>
	// 5476 10218:astore_1        
		abyte0.aK = ((azh) (abyte0)).bh ^ a.aK;
	// 5477 10219:aload_1         
	// 5478 10220:aload_1         
	// 5479 10221:getfield        #32  <Field int azh.bh>
	// 5480 10224:aload_0         
	// 5481 10225:getfield        #12  <Field azh a>
	// 5482 10228:getfield        #131 <Field int azh.aK>
	// 5483 10231:ixor            
	// 5484 10232:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5485 10235:aload_0         
	// 5486 10236:getfield        #12  <Field azh a>
	// 5487 10239:astore_1        
		abyte0.aK = ((azh) (abyte0)).aK & ~a.d;
	// 5488 10240:aload_1         
	// 5489 10241:aload_1         
	// 5490 10242:getfield        #131 <Field int azh.aK>
	// 5491 10245:aload_0         
	// 5492 10246:getfield        #12  <Field azh a>
	// 5493 10249:getfield        #173 <Field int azh.d>
	// 5494 10252:iconst_m1       
	// 5495 10253:ixor            
	// 5496 10254:iand            
	// 5497 10255:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 5498 10258:aload_0         
	// 5499 10259:getfield        #12  <Field azh a>
	// 5500 10262:astore_1        
		abyte0.bh = ((azh) (abyte0)).af | a.d;
	// 5501 10263:aload_1         
	// 5502 10264:aload_1         
	// 5503 10265:getfield        #417 <Field int azh.af>
	// 5504 10268:aload_0         
	// 5505 10269:getfield        #12  <Field azh a>
	// 5506 10272:getfield        #173 <Field int azh.d>
	// 5507 10275:ior             
	// 5508 10276:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 5509 10279:aload_0         
	// 5510 10280:getfield        #12  <Field azh a>
	// 5511 10283:astore_1        
		abyte0.bh = ((azh) (abyte0)).aS ^ a.bh;
	// 5512 10284:aload_1         
	// 5513 10285:aload_1         
	// 5514 10286:getfield        #414 <Field int azh.aS>
	// 5515 10289:aload_0         
	// 5516 10290:getfield        #12  <Field azh a>
	// 5517 10293:getfield        #32  <Field int azh.bh>
	// 5518 10296:ixor            
	// 5519 10297:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 5520 10300:aload_0         
	// 5521 10301:getfield        #12  <Field azh a>
	// 5522 10304:astore_1        
		abyte0.bC = ((azh) (abyte0)).bC & a.af;
	// 5523 10305:aload_1         
	// 5524 10306:aload_1         
	// 5525 10307:getfield        #268 <Field int azh.bC>
	// 5526 10310:aload_0         
	// 5527 10311:getfield        #12  <Field azh a>
	// 5528 10314:getfield        #417 <Field int azh.af>
	// 5529 10317:iand            
	// 5530 10318:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 5531 10321:aload_0         
	// 5532 10322:getfield        #12  <Field azh a>
	// 5533 10325:astore_1        
		abyte0.bC = ((azh) (abyte0)).d | a.bC;
	// 5534 10326:aload_1         
	// 5535 10327:aload_1         
	// 5536 10328:getfield        #173 <Field int azh.d>
	// 5537 10331:aload_0         
	// 5538 10332:getfield        #12  <Field azh a>
	// 5539 10335:getfield        #268 <Field int azh.bC>
	// 5540 10338:ior             
	// 5541 10339:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 5542 10342:aload_0         
	// 5543 10343:getfield        #12  <Field azh a>
	// 5544 10346:astore_1        
		abyte0.bC = ((azh) (abyte0)).bF ^ a.bC;
	// 5545 10347:aload_1         
	// 5546 10348:aload_1         
	// 5547 10349:getfield        #68  <Field int azh.bF>
	// 5548 10352:aload_0         
	// 5549 10353:getfield        #12  <Field azh a>
	// 5550 10356:getfield        #268 <Field int azh.bC>
	// 5551 10359:ixor            
	// 5552 10360:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 5553 10363:aload_0         
	// 5554 10364:getfield        #12  <Field azh a>
	// 5555 10367:astore_1        
		abyte0.bC = ((azh) (abyte0)).z | a.bC;
	// 5556 10368:aload_1         
	// 5557 10369:aload_1         
	// 5558 10370:getfield        #330 <Field int azh.z>
	// 5559 10373:aload_0         
	// 5560 10374:getfield        #12  <Field azh a>
	// 5561 10377:getfield        #268 <Field int azh.bC>
	// 5562 10380:ior             
	// 5563 10381:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 5564 10384:aload_0         
	// 5565 10385:getfield        #12  <Field azh a>
	// 5566 10388:astore_1        
		abyte0.bC = ((azh) (abyte0)).aO ^ a.bC;
	// 5567 10389:aload_1         
	// 5568 10390:aload_1         
	// 5569 10391:getfield        #86  <Field int azh.aO>
	// 5570 10394:aload_0         
	// 5571 10395:getfield        #12  <Field azh a>
	// 5572 10398:getfield        #268 <Field int azh.bC>
	// 5573 10401:ixor            
	// 5574 10402:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 5575 10405:aload_0         
	// 5576 10406:getfield        #12  <Field azh a>
	// 5577 10409:astore_1        
		abyte0.K = ((azh) (abyte0)).bC ^ a.K;
	// 5578 10410:aload_1         
	// 5579 10411:aload_1         
	// 5580 10412:getfield        #268 <Field int azh.bC>
	// 5581 10415:aload_0         
	// 5582 10416:getfield        #12  <Field azh a>
	// 5583 10419:getfield        #161 <Field int azh.K>
	// 5584 10422:ixor            
	// 5585 10423:putfield        #161 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 5586 10426:aload_0         
	// 5587 10427:getfield        #12  <Field azh a>
	// 5588 10430:astore_1        
		abyte0.bC = ((azh) (abyte0)).J & a.af;
	// 5589 10431:aload_1         
	// 5590 10432:aload_1         
	// 5591 10433:getfield        #176 <Field int azh.J>
	// 5592 10436:aload_0         
	// 5593 10437:getfield        #12  <Field azh a>
	// 5594 10440:getfield        #417 <Field int azh.af>
	// 5595 10443:iand            
	// 5596 10444:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 5597 10447:aload_0         
	// 5598 10448:getfield        #12  <Field azh a>
	// 5599 10451:astore_1        
		abyte0.aO = ((azh) (abyte0)).bC & ~a.B;
	// 5600 10452:aload_1         
	// 5601 10453:aload_1         
	// 5602 10454:getfield        #268 <Field int azh.bC>
	// 5603 10457:aload_0         
	// 5604 10458:getfield        #12  <Field azh a>
	// 5605 10461:getfield        #229 <Field int azh.B>
	// 5606 10464:iconst_m1       
	// 5607 10465:ixor            
	// 5608 10466:iand            
	// 5609 10467:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5610 10470:aload_0         
	// 5611 10471:getfield        #12  <Field azh a>
	// 5612 10474:astore_1        
		abyte0.bF = ((azh) (abyte0)).bC & ~a.B;
	// 5613 10475:aload_1         
	// 5614 10476:aload_1         
	// 5615 10477:getfield        #268 <Field int azh.bC>
	// 5616 10480:aload_0         
	// 5617 10481:getfield        #12  <Field azh a>
	// 5618 10484:getfield        #229 <Field int azh.B>
	// 5619 10487:iconst_m1       
	// 5620 10488:ixor            
	// 5621 10489:iand            
	// 5622 10490:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5623 10493:aload_0         
	// 5624 10494:getfield        #12  <Field azh a>
	// 5625 10497:astore_1        
		abyte0.cd = ((azh) (abyte0)).bC & ~a.B;
	// 5626 10498:aload_1         
	// 5627 10499:aload_1         
	// 5628 10500:getfield        #268 <Field int azh.bC>
	// 5629 10503:aload_0         
	// 5630 10504:getfield        #12  <Field azh a>
	// 5631 10507:getfield        #229 <Field int azh.B>
	// 5632 10510:iconst_m1       
	// 5633 10511:ixor            
	// 5634 10512:iand            
	// 5635 10513:putfield        #423 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5636 10516:aload_0         
	// 5637 10517:getfield        #12  <Field azh a>
	// 5638 10520:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd & ~a.d;
	// 5639 10521:aload_1         
	// 5640 10522:aload_1         
	// 5641 10523:getfield        #423 <Field int azh.cd>
	// 5642 10526:aload_0         
	// 5643 10527:getfield        #12  <Field azh a>
	// 5644 10530:getfield        #173 <Field int azh.d>
	// 5645 10533:iconst_m1       
	// 5646 10534:ixor            
	// 5647 10535:iand            
	// 5648 10536:putfield        #423 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5649 10539:aload_0         
	// 5650 10540:getfield        #12  <Field azh a>
	// 5651 10543:astore_1        
		abyte0.cd = ((azh) (abyte0)).aS ^ a.cd;
	// 5652 10544:aload_1         
	// 5653 10545:aload_1         
	// 5654 10546:getfield        #414 <Field int azh.aS>
	// 5655 10549:aload_0         
	// 5656 10550:getfield        #12  <Field azh a>
	// 5657 10553:getfield        #423 <Field int azh.cd>
	// 5658 10556:ixor            
	// 5659 10557:putfield        #423 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5660 10560:aload_0         
	// 5661 10561:getfield        #12  <Field azh a>
	// 5662 10564:astore_1        
		abyte0.aS = ((azh) (abyte0)).bC & ~a.B;
	// 5663 10565:aload_1         
	// 5664 10566:aload_1         
	// 5665 10567:getfield        #268 <Field int azh.bC>
	// 5666 10570:aload_0         
	// 5667 10571:getfield        #12  <Field azh a>
	// 5668 10574:getfield        #229 <Field int azh.B>
	// 5669 10577:iconst_m1       
	// 5670 10578:ixor            
	// 5671 10579:iand            
	// 5672 10580:putfield        #414 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 5673 10583:aload_0         
	// 5674 10584:getfield        #12  <Field azh a>
	// 5675 10587:astore_1        
		abyte0.aN = ((azh) (abyte0)).af ^ a.J;
	// 5676 10588:aload_1         
	// 5677 10589:aload_1         
	// 5678 10590:getfield        #417 <Field int azh.af>
	// 5679 10593:aload_0         
	// 5680 10594:getfield        #12  <Field azh a>
	// 5681 10597:getfield        #176 <Field int azh.J>
	// 5682 10600:ixor            
	// 5683 10601:putfield        #35  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5684 10604:aload_0         
	// 5685 10605:getfield        #12  <Field azh a>
	// 5686 10608:astore_1        
		abyte0.aO = ((azh) (abyte0)).aN ^ a.aO;
	// 5687 10609:aload_1         
	// 5688 10610:aload_1         
	// 5689 10611:getfield        #35  <Field int azh.aN>
	// 5690 10614:aload_0         
	// 5691 10615:getfield        #12  <Field azh a>
	// 5692 10618:getfield        #86  <Field int azh.aO>
	// 5693 10621:ixor            
	// 5694 10622:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5695 10625:aload_0         
	// 5696 10626:getfield        #12  <Field azh a>
	// 5697 10629:astore_1        
		abyte0.aO = ((azh) (abyte0)).d & a.aO;
	// 5698 10630:aload_1         
	// 5699 10631:aload_1         
	// 5700 10632:getfield        #173 <Field int azh.d>
	// 5701 10635:aload_0         
	// 5702 10636:getfield        #12  <Field azh a>
	// 5703 10639:getfield        #86  <Field int azh.aO>
	// 5704 10642:iand            
	// 5705 10643:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5706 10646:aload_0         
	// 5707 10647:getfield        #12  <Field azh a>
	// 5708 10650:astore_1        
		abyte0.ce = ((azh) (abyte0)).aN & ~a.B;
	// 5709 10651:aload_1         
	// 5710 10652:aload_1         
	// 5711 10653:getfield        #35  <Field int azh.aN>
	// 5712 10656:aload_0         
	// 5713 10657:getfield        #12  <Field azh a>
	// 5714 10660:getfield        #229 <Field int azh.B>
	// 5715 10663:iconst_m1       
	// 5716 10664:ixor            
	// 5717 10665:iand            
	// 5718 10666:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 5719 10669:aload_0         
	// 5720 10670:getfield        #12  <Field azh a>
	// 5721 10673:astore_1        
		abyte0.cf = ((azh) (abyte0)).aN ^ a.B;
	// 5722 10674:aload_1         
	// 5723 10675:aload_1         
	// 5724 10676:getfield        #35  <Field int azh.aN>
	// 5725 10679:aload_0         
	// 5726 10680:getfield        #12  <Field azh a>
	// 5727 10683:getfield        #229 <Field int azh.B>
	// 5728 10686:ixor            
	// 5729 10687:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 5730 10690:aload_0         
	// 5731 10691:getfield        #12  <Field azh a>
	// 5732 10694:astore_1        
		abyte0.av = ((azh) (abyte0)).cf ^ a.av;
	// 5733 10695:aload_1         
	// 5734 10696:aload_1         
	// 5735 10697:getfield        #429 <Field int azh.cf>
	// 5736 10700:aload_0         
	// 5737 10701:getfield        #12  <Field azh a>
	// 5738 10704:getfield        #411 <Field int azh.av>
	// 5739 10707:ixor            
	// 5740 10708:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 5741 10711:aload_0         
	// 5742 10712:getfield        #12  <Field azh a>
	// 5743 10715:astore_1        
		abyte0.cf = ((azh) (abyte0)).be & a.af;
	// 5744 10716:aload_1         
	// 5745 10717:aload_1         
	// 5746 10718:getfield        #155 <Field int azh.be>
	// 5747 10721:aload_0         
	// 5748 10722:getfield        #12  <Field azh a>
	// 5749 10725:getfield        #417 <Field int azh.af>
	// 5750 10728:iand            
	// 5751 10729:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 5752 10732:aload_0         
	// 5753 10733:getfield        #12  <Field azh a>
	// 5754 10736:astore_1        
		abyte0.cf = ((azh) (abyte0)).bf ^ a.cf;
	// 5755 10737:aload_1         
	// 5756 10738:aload_1         
	// 5757 10739:getfield        #247 <Field int azh.bf>
	// 5758 10742:aload_0         
	// 5759 10743:getfield        #12  <Field azh a>
	// 5760 10746:getfield        #429 <Field int azh.cf>
	// 5761 10749:ixor            
	// 5762 10750:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 5763 10753:aload_0         
	// 5764 10754:getfield        #12  <Field azh a>
	// 5765 10757:astore_1        
		abyte0.be = ((azh) (abyte0)).be & a.af;
	// 5766 10758:aload_1         
	// 5767 10759:aload_1         
	// 5768 10760:getfield        #155 <Field int azh.be>
	// 5769 10763:aload_0         
	// 5770 10764:getfield        #12  <Field azh a>
	// 5771 10767:getfield        #417 <Field int azh.af>
	// 5772 10770:iand            
	// 5773 10771:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 5774 10774:aload_0         
	// 5775 10775:getfield        #12  <Field azh a>
	// 5776 10778:astore_1        
		abyte0.be = ((azh) (abyte0)).aE ^ a.be;
	// 5777 10779:aload_1         
	// 5778 10780:aload_1         
	// 5779 10781:getfield        #41  <Field int azh.aE>
	// 5780 10784:aload_0         
	// 5781 10785:getfield        #12  <Field azh a>
	// 5782 10788:getfield        #155 <Field int azh.be>
	// 5783 10791:ixor            
	// 5784 10792:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 5785 10795:aload_0         
	// 5786 10796:getfield        #12  <Field azh a>
	// 5787 10799:astore_1        
		abyte0.be = ((azh) (abyte0)).be | a.d;
	// 5788 10800:aload_1         
	// 5789 10801:aload_1         
	// 5790 10802:getfield        #155 <Field int azh.be>
	// 5791 10805:aload_0         
	// 5792 10806:getfield        #12  <Field azh a>
	// 5793 10809:getfield        #173 <Field int azh.d>
	// 5794 10812:ior             
	// 5795 10813:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 5796 10816:aload_0         
	// 5797 10817:getfield        #12  <Field azh a>
	// 5798 10820:astore_1        
		abyte0.be = ((azh) (abyte0)).cf ^ a.be;
	// 5799 10821:aload_1         
	// 5800 10822:aload_1         
	// 5801 10823:getfield        #429 <Field int azh.cf>
	// 5802 10826:aload_0         
	// 5803 10827:getfield        #12  <Field azh a>
	// 5804 10830:getfield        #155 <Field int azh.be>
	// 5805 10833:ixor            
	// 5806 10834:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 5807 10837:aload_0         
	// 5808 10838:getfield        #12  <Field azh a>
	// 5809 10841:astore_1        
		abyte0.be = ((azh) (abyte0)).be & ~a.z;
	// 5810 10842:aload_1         
	// 5811 10843:aload_1         
	// 5812 10844:getfield        #155 <Field int azh.be>
	// 5813 10847:aload_0         
	// 5814 10848:getfield        #12  <Field azh a>
	// 5815 10851:getfield        #330 <Field int azh.z>
	// 5816 10854:iconst_m1       
	// 5817 10855:ixor            
	// 5818 10856:iand            
	// 5819 10857:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 5820 10860:aload_0         
	// 5821 10861:getfield        #12  <Field azh a>
	// 5822 10864:astore_1        
		abyte0.cf = ((azh) (abyte0)).J & ~a.af;
	// 5823 10865:aload_1         
	// 5824 10866:aload_1         
	// 5825 10867:getfield        #176 <Field int azh.J>
	// 5826 10870:aload_0         
	// 5827 10871:getfield        #12  <Field azh a>
	// 5828 10874:getfield        #417 <Field int azh.af>
	// 5829 10877:iconst_m1       
	// 5830 10878:ixor            
	// 5831 10879:iand            
	// 5832 10880:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 5833 10883:aload_0         
	// 5834 10884:getfield        #12  <Field azh a>
	// 5835 10887:astore_1        
		abyte0.aE = ((azh) (abyte0)).J & ~a.cf;
	// 5836 10888:aload_1         
	// 5837 10889:aload_1         
	// 5838 10890:getfield        #176 <Field int azh.J>
	// 5839 10893:aload_0         
	// 5840 10894:getfield        #12  <Field azh a>
	// 5841 10897:getfield        #429 <Field int azh.cf>
	// 5842 10900:iconst_m1       
	// 5843 10901:ixor            
	// 5844 10902:iand            
	// 5845 10903:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 5846 10906:aload_0         
	// 5847 10907:getfield        #12  <Field azh a>
	// 5848 10910:astore_1        
		abyte0.bH = ((azh) (abyte0)).aE ^ a.bH;
	// 5849 10911:aload_1         
	// 5850 10912:aload_1         
	// 5851 10913:getfield        #41  <Field int azh.aE>
	// 5852 10916:aload_0         
	// 5853 10917:getfield        #12  <Field azh a>
	// 5854 10920:getfield        #194 <Field int azh.bH>
	// 5855 10923:ixor            
	// 5856 10924:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 5857 10927:aload_0         
	// 5858 10928:getfield        #12  <Field azh a>
	// 5859 10931:astore_1        
		abyte0.bF = ((azh) (abyte0)).aE ^ a.bF;
	// 5860 10932:aload_1         
	// 5861 10933:aload_1         
	// 5862 10934:getfield        #41  <Field int azh.aE>
	// 5863 10937:aload_0         
	// 5864 10938:getfield        #12  <Field azh a>
	// 5865 10941:getfield        #68  <Field int azh.bF>
	// 5866 10944:ixor            
	// 5867 10945:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5868 10948:aload_0         
	// 5869 10949:getfield        #12  <Field azh a>
	// 5870 10952:astore_1        
		abyte0.bf = ((azh) (abyte0)).d & ~a.bF;
	// 5871 10953:aload_1         
	// 5872 10954:aload_1         
	// 5873 10955:getfield        #173 <Field int azh.d>
	// 5874 10958:aload_0         
	// 5875 10959:getfield        #12  <Field azh a>
	// 5876 10962:getfield        #68  <Field int azh.bF>
	// 5877 10965:iconst_m1       
	// 5878 10966:ixor            
	// 5879 10967:iand            
	// 5880 10968:putfield        #247 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 5881 10971:aload_0         
	// 5882 10972:getfield        #12  <Field azh a>
	// 5883 10975:astore_1        
		abyte0.bE = ((azh) (abyte0)).bF ^ a.bE;
	// 5884 10976:aload_1         
	// 5885 10977:aload_1         
	// 5886 10978:getfield        #68  <Field int azh.bF>
	// 5887 10981:aload_0         
	// 5888 10982:getfield        #12  <Field azh a>
	// 5889 10985:getfield        #152 <Field int azh.bE>
	// 5890 10988:ixor            
	// 5891 10989:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 5892 10992:aload_0         
	// 5893 10993:getfield        #12  <Field azh a>
	// 5894 10996:astore_1        
		abyte0.bF = ((azh) (abyte0)).B | a.aE;
	// 5895 10997:aload_1         
	// 5896 10998:aload_1         
	// 5897 10999:getfield        #229 <Field int azh.B>
	// 5898 11002:aload_0         
	// 5899 11003:getfield        #12  <Field azh a>
	// 5900 11006:getfield        #41  <Field int azh.aE>
	// 5901 11009:ior             
	// 5902 11010:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5903 11013:aload_0         
	// 5904 11014:getfield        #12  <Field azh a>
	// 5905 11017:astore_1        
		abyte0.bF = ((azh) (abyte0)).aN ^ a.bF;
	// 5906 11018:aload_1         
	// 5907 11019:aload_1         
	// 5908 11020:getfield        #35  <Field int azh.aN>
	// 5909 11023:aload_0         
	// 5910 11024:getfield        #12  <Field azh a>
	// 5911 11027:getfield        #68  <Field int azh.bF>
	// 5912 11030:ixor            
	// 5913 11031:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5914 11034:aload_0         
	// 5915 11035:getfield        #12  <Field azh a>
	// 5916 11038:astore_1        
		abyte0.aO = ((azh) (abyte0)).bF ^ a.aO;
	// 5917 11039:aload_1         
	// 5918 11040:aload_1         
	// 5919 11041:getfield        #68  <Field int azh.bF>
	// 5920 11044:aload_0         
	// 5921 11045:getfield        #12  <Field azh a>
	// 5922 11048:getfield        #86  <Field int azh.aO>
	// 5923 11051:ixor            
	// 5924 11052:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 5925 11055:aload_0         
	// 5926 11056:getfield        #12  <Field azh a>
	// 5927 11059:astore_1        
		abyte0.bF = ((azh) (abyte0)).B | a.aE;
	// 5928 11060:aload_1         
	// 5929 11061:aload_1         
	// 5930 11062:getfield        #229 <Field int azh.B>
	// 5931 11065:aload_0         
	// 5932 11066:getfield        #12  <Field azh a>
	// 5933 11069:getfield        #41  <Field int azh.aE>
	// 5934 11072:ior             
	// 5935 11073:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5936 11076:aload_0         
	// 5937 11077:getfield        #12  <Field azh a>
	// 5938 11080:astore_1        
		abyte0.bF = ((azh) (abyte0)).J ^ a.bF;
	// 5939 11081:aload_1         
	// 5940 11082:aload_1         
	// 5941 11083:getfield        #176 <Field int azh.J>
	// 5942 11086:aload_0         
	// 5943 11087:getfield        #12  <Field azh a>
	// 5944 11090:getfield        #68  <Field int azh.bF>
	// 5945 11093:ixor            
	// 5946 11094:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5947 11097:aload_0         
	// 5948 11098:getfield        #12  <Field azh a>
	// 5949 11101:astore_1        
		abyte0.bF = ((azh) (abyte0)).d & ~a.bF;
	// 5950 11102:aload_1         
	// 5951 11103:aload_1         
	// 5952 11104:getfield        #173 <Field int azh.d>
	// 5953 11107:aload_0         
	// 5954 11108:getfield        #12  <Field azh a>
	// 5955 11111:getfield        #68  <Field int azh.bF>
	// 5956 11114:iconst_m1       
	// 5957 11115:ixor            
	// 5958 11116:iand            
	// 5959 11117:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5960 11120:aload_0         
	// 5961 11121:getfield        #12  <Field azh a>
	// 5962 11124:astore_1        
		abyte0.bF = ((azh) (abyte0)).bH ^ a.bF;
	// 5963 11125:aload_1         
	// 5964 11126:aload_1         
	// 5965 11127:getfield        #194 <Field int azh.bH>
	// 5966 11130:aload_0         
	// 5967 11131:getfield        #12  <Field azh a>
	// 5968 11134:getfield        #68  <Field int azh.bF>
	// 5969 11137:ixor            
	// 5970 11138:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 5971 11141:aload_0         
	// 5972 11142:getfield        #12  <Field azh a>
	// 5973 11145:astore_1        
		abyte0.aE = ((azh) (abyte0)).B | a.aE;
	// 5974 11146:aload_1         
	// 5975 11147:aload_1         
	// 5976 11148:getfield        #229 <Field int azh.B>
	// 5977 11151:aload_0         
	// 5978 11152:getfield        #12  <Field azh a>
	// 5979 11155:getfield        #41  <Field int azh.aE>
	// 5980 11158:ior             
	// 5981 11159:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 5982 11162:aload_0         
	// 5983 11163:getfield        #12  <Field azh a>
	// 5984 11166:astore_1        
		abyte0.aE = ((azh) (abyte0)).bC ^ a.aE;
	// 5985 11167:aload_1         
	// 5986 11168:aload_1         
	// 5987 11169:getfield        #268 <Field int azh.bC>
	// 5988 11172:aload_0         
	// 5989 11173:getfield        #12  <Field azh a>
	// 5990 11176:getfield        #41  <Field int azh.aE>
	// 5991 11179:ixor            
	// 5992 11180:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 5993 11183:aload_0         
	// 5994 11184:getfield        #12  <Field azh a>
	// 5995 11187:astore_1        
		abyte0.aF = ((azh) (abyte0)).aE ^ a.aF;
	// 5996 11188:aload_1         
	// 5997 11189:aload_1         
	// 5998 11190:getfield        #41  <Field int azh.aE>
	// 5999 11193:aload_0         
	// 6000 11194:getfield        #12  <Field azh a>
	// 6001 11197:getfield        #110 <Field int azh.aF>
	// 6002 11200:ixor            
	// 6003 11201:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 6004 11204:aload_0         
	// 6005 11205:getfield        #12  <Field azh a>
	// 6006 11208:astore_1        
		abyte0.bC = ((azh) (abyte0)).cf & ~a.B;
	// 6007 11209:aload_1         
	// 6008 11210:aload_1         
	// 6009 11211:getfield        #429 <Field int azh.cf>
	// 6010 11214:aload_0         
	// 6011 11215:getfield        #12  <Field azh a>
	// 6012 11218:getfield        #229 <Field int azh.B>
	// 6013 11221:iconst_m1       
	// 6014 11222:ixor            
	// 6015 11223:iand            
	// 6016 11224:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 6017 11227:aload_0         
	// 6018 11228:getfield        #12  <Field azh a>
	// 6019 11231:astore_1        
		abyte0.bC = ((azh) (abyte0)).J ^ a.bC;
	// 6020 11232:aload_1         
	// 6021 11233:aload_1         
	// 6022 11234:getfield        #176 <Field int azh.J>
	// 6023 11237:aload_0         
	// 6024 11238:getfield        #12  <Field azh a>
	// 6025 11241:getfield        #268 <Field int azh.bC>
	// 6026 11244:ixor            
	// 6027 11245:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 6028 11248:aload_0         
	// 6029 11249:getfield        #12  <Field azh a>
	// 6030 11252:astore_1        
		abyte0.bH = ((azh) (abyte0)).d | a.bC;
	// 6031 11253:aload_1         
	// 6032 11254:aload_1         
	// 6033 11255:getfield        #173 <Field int azh.d>
	// 6034 11258:aload_0         
	// 6035 11259:getfield        #12  <Field azh a>
	// 6036 11262:getfield        #268 <Field int azh.bC>
	// 6037 11265:ior             
	// 6038 11266:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6039 11269:aload_0         
	// 6040 11270:getfield        #12  <Field azh a>
	// 6041 11273:astore_1        
		abyte0.bH = ((azh) (abyte0)).J ^ a.bH;
	// 6042 11274:aload_1         
	// 6043 11275:aload_1         
	// 6044 11276:getfield        #176 <Field int azh.J>
	// 6045 11279:aload_0         
	// 6046 11280:getfield        #12  <Field azh a>
	// 6047 11283:getfield        #194 <Field int azh.bH>
	// 6048 11286:ixor            
	// 6049 11287:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6050 11290:aload_0         
	// 6051 11291:getfield        #12  <Field azh a>
	// 6052 11294:astore_1        
		abyte0.bC = ((azh) (abyte0)).d & a.bC;
	// 6053 11295:aload_1         
	// 6054 11296:aload_1         
	// 6055 11297:getfield        #173 <Field int azh.d>
	// 6056 11300:aload_0         
	// 6057 11301:getfield        #12  <Field azh a>
	// 6058 11304:getfield        #268 <Field int azh.bC>
	// 6059 11307:iand            
	// 6060 11308:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 6061 11311:aload_0         
	// 6062 11312:getfield        #12  <Field azh a>
	// 6063 11315:astore_1        
		abyte0.cg = ((azh) (abyte0)).cf ^ a.B;
	// 6064 11316:aload_1         
	// 6065 11317:aload_1         
	// 6066 11318:getfield        #429 <Field int azh.cf>
	// 6067 11321:aload_0         
	// 6068 11322:getfield        #12  <Field azh a>
	// 6069 11325:getfield        #229 <Field int azh.B>
	// 6070 11328:ixor            
	// 6071 11329:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6072 11332:aload_0         
	// 6073 11333:getfield        #12  <Field azh a>
	// 6074 11336:astore_1        
		abyte0.as = ((azh) (abyte0)).cg ^ a.as;
	// 6075 11337:aload_1         
	// 6076 11338:aload_1         
	// 6077 11339:getfield        #432 <Field int azh.cg>
	// 6078 11342:aload_0         
	// 6079 11343:getfield        #12  <Field azh a>
	// 6080 11346:getfield        #140 <Field int azh.as>
	// 6081 11349:ixor            
	// 6082 11350:putfield        #140 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 6083 11353:aload_0         
	// 6084 11354:getfield        #12  <Field azh a>
	// 6085 11357:astore_1        
		abyte0.cg = ((azh) (abyte0)).B | a.cf;
	// 6086 11358:aload_1         
	// 6087 11359:aload_1         
	// 6088 11360:getfield        #229 <Field int azh.B>
	// 6089 11363:aload_0         
	// 6090 11364:getfield        #12  <Field azh a>
	// 6091 11367:getfield        #429 <Field int azh.cf>
	// 6092 11370:ior             
	// 6093 11371:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6094 11374:aload_0         
	// 6095 11375:getfield        #12  <Field azh a>
	// 6096 11378:astore_1        
		abyte0.cg = ((azh) (abyte0)).aN ^ a.cg;
	// 6097 11379:aload_1         
	// 6098 11380:aload_1         
	// 6099 11381:getfield        #35  <Field int azh.aN>
	// 6100 11384:aload_0         
	// 6101 11385:getfield        #12  <Field azh a>
	// 6102 11388:getfield        #432 <Field int azh.cg>
	// 6103 11391:ixor            
	// 6104 11392:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6105 11395:aload_0         
	// 6106 11396:getfield        #12  <Field azh a>
	// 6107 11399:astore_1        
		abyte0.aN = ((azh) (abyte0)).d & a.cg;
	// 6108 11400:aload_1         
	// 6109 11401:aload_1         
	// 6110 11402:getfield        #173 <Field int azh.d>
	// 6111 11405:aload_0         
	// 6112 11406:getfield        #12  <Field azh a>
	// 6113 11409:getfield        #432 <Field int azh.cg>
	// 6114 11412:iand            
	// 6115 11413:putfield        #35  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6116 11416:aload_0         
	// 6117 11417:getfield        #12  <Field azh a>
	// 6118 11420:astore_1        
		abyte0.aN = ((azh) (abyte0)).l | a.aN;
	// 6119 11421:aload_1         
	// 6120 11422:aload_1         
	// 6121 11423:getfield        #277 <Field int azh.l>
	// 6122 11426:aload_0         
	// 6123 11427:getfield        #12  <Field azh a>
	// 6124 11430:getfield        #35  <Field int azh.aN>
	// 6125 11433:ior             
	// 6126 11434:putfield        #35  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6127 11437:aload_0         
	// 6128 11438:getfield        #12  <Field azh a>
	// 6129 11441:astore_1        
		abyte0.bC = ((azh) (abyte0)).cg ^ a.bC;
	// 6130 11442:aload_1         
	// 6131 11443:aload_1         
	// 6132 11444:getfield        #432 <Field int azh.cg>
	// 6133 11447:aload_0         
	// 6134 11448:getfield        #12  <Field azh a>
	// 6135 11451:getfield        #268 <Field int azh.bC>
	// 6136 11454:ixor            
	// 6137 11455:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 6138 11458:aload_0         
	// 6139 11459:getfield        #12  <Field azh a>
	// 6140 11462:astore_1        
		abyte0.aG = ((azh) (abyte0)).af | a.aG;
	// 6141 11463:aload_1         
	// 6142 11464:aload_1         
	// 6143 11465:getfield        #417 <Field int azh.af>
	// 6144 11468:aload_0         
	// 6145 11469:getfield        #12  <Field azh a>
	// 6146 11472:getfield        #211 <Field int azh.aG>
	// 6147 11475:ior             
	// 6148 11476:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 6149 11479:aload_0         
	// 6150 11480:getfield        #12  <Field azh a>
	// 6151 11483:astore_1        
		abyte0.aG = ((azh) (abyte0)).bk ^ a.aG;
	// 6152 11484:aload_1         
	// 6153 11485:aload_1         
	// 6154 11486:getfield        #259 <Field int azh.bk>
	// 6155 11489:aload_0         
	// 6156 11490:getfield        #12  <Field azh a>
	// 6157 11493:getfield        #211 <Field int azh.aG>
	// 6158 11496:ixor            
	// 6159 11497:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 6160 11500:aload_0         
	// 6161 11501:getfield        #12  <Field azh a>
	// 6162 11504:astore_1        
		abyte0.aG = ((azh) (abyte0)).aG & ~a.d;
	// 6163 11505:aload_1         
	// 6164 11506:aload_1         
	// 6165 11507:getfield        #211 <Field int azh.aG>
	// 6166 11510:aload_0         
	// 6167 11511:getfield        #12  <Field azh a>
	// 6168 11514:getfield        #173 <Field int azh.d>
	// 6169 11517:iconst_m1       
	// 6170 11518:ixor            
	// 6171 11519:iand            
	// 6172 11520:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 6173 11523:aload_0         
	// 6174 11524:getfield        #12  <Field azh a>
	// 6175 11527:astore_1        
		abyte0.aG = ((azh) (abyte0)).aq ^ a.aG;
	// 6176 11528:aload_1         
	// 6177 11529:aload_1         
	// 6178 11530:getfield        #38  <Field int azh.aq>
	// 6179 11533:aload_0         
	// 6180 11534:getfield        #12  <Field azh a>
	// 6181 11537:getfield        #211 <Field int azh.aG>
	// 6182 11540:ixor            
	// 6183 11541:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 6184 11544:aload_0         
	// 6185 11545:getfield        #12  <Field azh a>
	// 6186 11548:astore_1        
		abyte0.be = ((azh) (abyte0)).aG ^ a.be;
	// 6187 11549:aload_1         
	// 6188 11550:aload_1         
	// 6189 11551:getfield        #211 <Field int azh.aG>
	// 6190 11554:aload_0         
	// 6191 11555:getfield        #12  <Field azh a>
	// 6192 11558:getfield        #155 <Field int azh.be>
	// 6193 11561:ixor            
	// 6194 11562:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6195 11565:aload_0         
	// 6196 11566:getfield        #12  <Field azh a>
	// 6197 11569:astore_1        
		abyte0.a = ((azh) (abyte0)).be ^ a.a;
	// 6198 11570:aload_1         
	// 6199 11571:aload_1         
	// 6200 11572:getfield        #155 <Field int azh.be>
	// 6201 11575:aload_0         
	// 6202 11576:getfield        #12  <Field azh a>
	// 6203 11579:getfield        #208 <Field int azh.a>
	// 6204 11582:ixor            
	// 6205 11583:putfield        #208 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 6206 11586:aload_0         
	// 6207 11587:getfield        #12  <Field azh a>
	// 6208 11590:astore_1        
		abyte0.be = ((azh) (abyte0)).B | a.af;
	// 6209 11591:aload_1         
	// 6210 11592:aload_1         
	// 6211 11593:getfield        #229 <Field int azh.B>
	// 6212 11596:aload_0         
	// 6213 11597:getfield        #12  <Field azh a>
	// 6214 11600:getfield        #417 <Field int azh.af>
	// 6215 11603:ior             
	// 6216 11604:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6217 11607:aload_0         
	// 6218 11608:getfield        #12  <Field azh a>
	// 6219 11611:astore_1        
		abyte0.be = ((azh) (abyte0)).cf ^ a.be;
	// 6220 11612:aload_1         
	// 6221 11613:aload_1         
	// 6222 11614:getfield        #429 <Field int azh.cf>
	// 6223 11617:aload_0         
	// 6224 11618:getfield        #12  <Field azh a>
	// 6225 11621:getfield        #155 <Field int azh.be>
	// 6226 11624:ixor            
	// 6227 11625:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6228 11628:aload_0         
	// 6229 11629:getfield        #12  <Field azh a>
	// 6230 11632:astore_1        
		abyte0.cf = ((azh) (abyte0)).af | a.J;
	// 6231 11633:aload_1         
	// 6232 11634:aload_1         
	// 6233 11635:getfield        #417 <Field int azh.af>
	// 6234 11638:aload_0         
	// 6235 11639:getfield        #12  <Field azh a>
	// 6236 11642:getfield        #176 <Field int azh.J>
	// 6237 11645:ior             
	// 6238 11646:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6239 11649:aload_0         
	// 6240 11650:getfield        #12  <Field azh a>
	// 6241 11653:astore_1        
		abyte0.aS = ((azh) (abyte0)).cf ^ a.aS;
	// 6242 11654:aload_1         
	// 6243 11655:aload_1         
	// 6244 11656:getfield        #429 <Field int azh.cf>
	// 6245 11659:aload_0         
	// 6246 11660:getfield        #12  <Field azh a>
	// 6247 11663:getfield        #414 <Field int azh.aS>
	// 6248 11666:ixor            
	// 6249 11667:putfield        #414 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6250 11670:aload_0         
	// 6251 11671:getfield        #12  <Field azh a>
	// 6252 11674:astore_1        
		abyte0.bf = ((azh) (abyte0)).aS ^ a.bf;
	// 6253 11675:aload_1         
	// 6254 11676:aload_1         
	// 6255 11677:getfield        #414 <Field int azh.aS>
	// 6256 11680:aload_0         
	// 6257 11681:getfield        #12  <Field azh a>
	// 6258 11684:getfield        #247 <Field int azh.bf>
	// 6259 11687:ixor            
	// 6260 11688:putfield        #247 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 6261 11691:aload_0         
	// 6262 11692:getfield        #12  <Field azh a>
	// 6263 11695:astore_1        
		abyte0.cc = ((azh) (abyte0)).cf ^ a.cc;
	// 6264 11696:aload_1         
	// 6265 11697:aload_1         
	// 6266 11698:getfield        #429 <Field int azh.cf>
	// 6267 11701:aload_0         
	// 6268 11702:getfield        #12  <Field azh a>
	// 6269 11705:getfield        #420 <Field int azh.cc>
	// 6270 11708:ixor            
	// 6271 11709:putfield        #420 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6272 11712:aload_0         
	// 6273 11713:getfield        #12  <Field azh a>
	// 6274 11716:astore_1        
		abyte0.ce = ((azh) (abyte0)).cf ^ a.ce;
	// 6275 11717:aload_1         
	// 6276 11718:aload_1         
	// 6277 11719:getfield        #429 <Field int azh.cf>
	// 6278 11722:aload_0         
	// 6279 11723:getfield        #12  <Field azh a>
	// 6280 11726:getfield        #426 <Field int azh.ce>
	// 6281 11729:ixor            
	// 6282 11730:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6283 11733:aload_0         
	// 6284 11734:getfield        #12  <Field azh a>
	// 6285 11737:astore_1        
		abyte0.ce = ((azh) (abyte0)).d & ~a.ce;
	// 6286 11738:aload_1         
	// 6287 11739:aload_1         
	// 6288 11740:getfield        #173 <Field int azh.d>
	// 6289 11743:aload_0         
	// 6290 11744:getfield        #12  <Field azh a>
	// 6291 11747:getfield        #426 <Field int azh.ce>
	// 6292 11750:iconst_m1       
	// 6293 11751:ixor            
	// 6294 11752:iand            
	// 6295 11753:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6296 11756:aload_0         
	// 6297 11757:getfield        #12  <Field azh a>
	// 6298 11760:astore_1        
		abyte0.ce = ((azh) (abyte0)).aE ^ a.ce;
	// 6299 11761:aload_1         
	// 6300 11762:aload_1         
	// 6301 11763:getfield        #41  <Field int azh.aE>
	// 6302 11766:aload_0         
	// 6303 11767:getfield        #12  <Field azh a>
	// 6304 11770:getfield        #426 <Field int azh.ce>
	// 6305 11773:ixor            
	// 6306 11774:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6307 11777:aload_0         
	// 6308 11778:getfield        #12  <Field azh a>
	// 6309 11781:astore_1        
		abyte0.cf = ((azh) (abyte0)).d & ~a.cf;
	// 6310 11782:aload_1         
	// 6311 11783:aload_1         
	// 6312 11784:getfield        #173 <Field int azh.d>
	// 6313 11787:aload_0         
	// 6314 11788:getfield        #12  <Field azh a>
	// 6315 11791:getfield        #429 <Field int azh.cf>
	// 6316 11794:iconst_m1       
	// 6317 11795:ixor            
	// 6318 11796:iand            
	// 6319 11797:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6320 11800:aload_0         
	// 6321 11801:getfield        #12  <Field azh a>
	// 6322 11804:astore_1        
		abyte0.cf = ((azh) (abyte0)).be ^ a.cf;
	// 6323 11805:aload_1         
	// 6324 11806:aload_1         
	// 6325 11807:getfield        #155 <Field int azh.be>
	// 6326 11810:aload_0         
	// 6327 11811:getfield        #12  <Field azh a>
	// 6328 11814:getfield        #429 <Field int azh.cf>
	// 6329 11817:ixor            
	// 6330 11818:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6331 11821:aload_0         
	// 6332 11822:getfield        #12  <Field azh a>
	// 6333 11825:astore_1        
		abyte0.at = ((azh) (abyte0)).at & a.af;
	// 6334 11826:aload_1         
	// 6335 11827:aload_1         
	// 6336 11828:getfield        #241 <Field int azh.at>
	// 6337 11831:aload_0         
	// 6338 11832:getfield        #12  <Field azh a>
	// 6339 11835:getfield        #417 <Field int azh.af>
	// 6340 11838:iand            
	// 6341 11839:putfield        #241 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6342 11842:aload_0         
	// 6343 11843:getfield        #12  <Field azh a>
	// 6344 11846:astore_1        
		abyte0.aK = ((azh) (abyte0)).at ^ a.aK;
	// 6345 11847:aload_1         
	// 6346 11848:aload_1         
	// 6347 11849:getfield        #241 <Field int azh.at>
	// 6348 11852:aload_0         
	// 6349 11853:getfield        #12  <Field azh a>
	// 6350 11856:getfield        #131 <Field int azh.aK>
	// 6351 11859:ixor            
	// 6352 11860:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 6353 11863:aload_0         
	// 6354 11864:getfield        #12  <Field azh a>
	// 6355 11867:astore_1        
		abyte0.aK = ((azh) (abyte0)).z | a.aK;
	// 6356 11868:aload_1         
	// 6357 11869:aload_1         
	// 6358 11870:getfield        #330 <Field int azh.z>
	// 6359 11873:aload_0         
	// 6360 11874:getfield        #12  <Field azh a>
	// 6361 11877:getfield        #131 <Field int azh.aK>
	// 6362 11880:ior             
	// 6363 11881:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 6364 11884:aload_0         
	// 6365 11885:getfield        #12  <Field azh a>
	// 6366 11888:astore_1        
		abyte0.aK = ((azh) (abyte0)).ar ^ a.aK;
	// 6367 11889:aload_1         
	// 6368 11890:aload_1         
	// 6369 11891:getfield        #250 <Field int azh.ar>
	// 6370 11894:aload_0         
	// 6371 11895:getfield        #12  <Field azh a>
	// 6372 11898:getfield        #131 <Field int azh.aK>
	// 6373 11901:ixor            
	// 6374 11902:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 6375 11905:aload_0         
	// 6376 11906:getfield        #12  <Field azh a>
	// 6377 11909:astore_1        
		abyte0.o = ((azh) (abyte0)).aK ^ a.o;
	// 6378 11910:aload_1         
	// 6379 11911:aload_1         
	// 6380 11912:getfield        #131 <Field int azh.aK>
	// 6381 11915:aload_0         
	// 6382 11916:getfield        #12  <Field azh a>
	// 6383 11919:getfield        #47  <Field int azh.o>
	// 6384 11922:ixor            
	// 6385 11923:putfield        #47  <Field int azh.o>
		abyte0 = ((byte []) (a));
	// 6386 11926:aload_0         
	// 6387 11927:getfield        #12  <Field azh a>
	// 6388 11930:astore_1        
		abyte0.bb = ((azh) (abyte0)).bb & ~a.af;
	// 6389 11931:aload_1         
	// 6390 11932:aload_1         
	// 6391 11933:getfield        #203 <Field int azh.bb>
	// 6392 11936:aload_0         
	// 6393 11937:getfield        #12  <Field azh a>
	// 6394 11940:getfield        #417 <Field int azh.af>
	// 6395 11943:iconst_m1       
	// 6396 11944:ixor            
	// 6397 11945:iand            
	// 6398 11946:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 6399 11949:aload_0         
	// 6400 11950:getfield        #12  <Field azh a>
	// 6401 11953:astore_1        
		abyte0.bb = ((azh) (abyte0)).ay ^ a.bb;
	// 6402 11954:aload_1         
	// 6403 11955:aload_1         
	// 6404 11956:getfield        #265 <Field int azh.ay>
	// 6405 11959:aload_0         
	// 6406 11960:getfield        #12  <Field azh a>
	// 6407 11963:getfield        #203 <Field int azh.bb>
	// 6408 11966:ixor            
	// 6409 11967:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 6410 11970:aload_0         
	// 6411 11971:getfield        #12  <Field azh a>
	// 6412 11974:astore_1        
		abyte0.bb = ((azh) (abyte0)).bb & ~a.d;
	// 6413 11975:aload_1         
	// 6414 11976:aload_1         
	// 6415 11977:getfield        #203 <Field int azh.bb>
	// 6416 11980:aload_0         
	// 6417 11981:getfield        #12  <Field azh a>
	// 6418 11984:getfield        #173 <Field int azh.d>
	// 6419 11987:iconst_m1       
	// 6420 11988:ixor            
	// 6421 11989:iand            
	// 6422 11990:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 6423 11993:aload_0         
	// 6424 11994:getfield        #12  <Field azh a>
	// 6425 11997:astore_1        
		abyte0.bb = ((azh) (abyte0)).aC ^ a.bb;
	// 6426 11998:aload_1         
	// 6427 11999:aload_1         
	// 6428 12000:getfield        #197 <Field int azh.aC>
	// 6429 12003:aload_0         
	// 6430 12004:getfield        #12  <Field azh a>
	// 6431 12007:getfield        #203 <Field int azh.bb>
	// 6432 12010:ixor            
	// 6433 12011:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 6434 12014:aload_0         
	// 6435 12015:getfield        #12  <Field azh a>
	// 6436 12018:astore_1        
		abyte0.bb = ((azh) (abyte0)).bb & ~a.z;
	// 6437 12019:aload_1         
	// 6438 12020:aload_1         
	// 6439 12021:getfield        #203 <Field int azh.bb>
	// 6440 12024:aload_0         
	// 6441 12025:getfield        #12  <Field azh a>
	// 6442 12028:getfield        #330 <Field int azh.z>
	// 6443 12031:iconst_m1       
	// 6444 12032:ixor            
	// 6445 12033:iand            
	// 6446 12034:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 6447 12037:aload_0         
	// 6448 12038:getfield        #12  <Field azh a>
	// 6449 12041:astore_1        
		abyte0.bb = ((azh) (abyte0)).bm ^ a.bb;
	// 6450 12042:aload_1         
	// 6451 12043:aload_1         
	// 6452 12044:getfield        #256 <Field int azh.bm>
	// 6453 12047:aload_0         
	// 6454 12048:getfield        #12  <Field azh a>
	// 6455 12051:getfield        #203 <Field int azh.bb>
	// 6456 12054:ixor            
	// 6457 12055:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 6458 12058:aload_0         
	// 6459 12059:getfield        #12  <Field azh a>
	// 6460 12062:astore_1        
		abyte0.bb = ((azh) (abyte0)).bb ^ a.s;
	// 6461 12063:aload_1         
	// 6462 12064:aload_1         
	// 6463 12065:getfield        #203 <Field int azh.bb>
	// 6464 12068:aload_0         
	// 6465 12069:getfield        #12  <Field azh a>
	// 6466 12072:getfield        #327 <Field int azh.s>
	// 6467 12075:ixor            
	// 6468 12076:putfield        #203 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 6469 12079:aload_0         
	// 6470 12080:getfield        #12  <Field azh a>
	// 6471 12083:astore_1        
		abyte0.bm = ((azh) (abyte0)).k & a.I;
	// 6472 12084:aload_1         
	// 6473 12085:aload_1         
	// 6474 12086:getfield        #285 <Field int azh.k>
	// 6475 12089:aload_0         
	// 6476 12090:getfield        #12  <Field azh a>
	// 6477 12093:getfield        #282 <Field int azh.I>
	// 6478 12096:iand            
	// 6479 12097:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6480 12100:aload_0         
	// 6481 12101:getfield        #12  <Field azh a>
	// 6482 12104:astore_1        
		abyte0.aC = ((azh) (abyte0)).k & ~a.bm;
	// 6483 12105:aload_1         
	// 6484 12106:aload_1         
	// 6485 12107:getfield        #285 <Field int azh.k>
	// 6486 12110:aload_0         
	// 6487 12111:getfield        #12  <Field azh a>
	// 6488 12114:getfield        #256 <Field int azh.bm>
	// 6489 12117:iconst_m1       
	// 6490 12118:ixor            
	// 6491 12119:iand            
	// 6492 12120:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 6493 12123:aload_0         
	// 6494 12124:getfield        #12  <Field azh a>
	// 6495 12127:astore_1        
		abyte0.aC = ((azh) (abyte0)).ae & ~a.aC;
	// 6496 12128:aload_1         
	// 6497 12129:aload_1         
	// 6498 12130:getfield        #288 <Field int azh.ae>
	// 6499 12133:aload_0         
	// 6500 12134:getfield        #12  <Field azh a>
	// 6501 12137:getfield        #197 <Field int azh.aC>
	// 6502 12140:iconst_m1       
	// 6503 12141:ixor            
	// 6504 12142:iand            
	// 6505 12143:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 6506 12146:aload_0         
	// 6507 12147:getfield        #12  <Field azh a>
	// 6508 12150:astore_1        
		abyte0.aC = ((azh) (abyte0)).aP ^ a.aC;
	// 6509 12151:aload_1         
	// 6510 12152:aload_1         
	// 6511 12153:getfield        #50  <Field int azh.aP>
	// 6512 12156:aload_0         
	// 6513 12157:getfield        #12  <Field azh a>
	// 6514 12160:getfield        #197 <Field int azh.aC>
	// 6515 12163:ixor            
	// 6516 12164:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 6517 12167:aload_0         
	// 6518 12168:getfield        #12  <Field azh a>
	// 6519 12171:astore_1        
		abyte0.aC = ((azh) (abyte0)).c & ~a.aC;
	// 6520 12172:aload_1         
	// 6521 12173:aload_1         
	// 6522 12174:getfield        #291 <Field int azh.c>
	// 6523 12177:aload_0         
	// 6524 12178:getfield        #12  <Field azh a>
	// 6525 12181:getfield        #197 <Field int azh.aC>
	// 6526 12184:iconst_m1       
	// 6527 12185:ixor            
	// 6528 12186:iand            
	// 6529 12187:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 6530 12190:aload_0         
	// 6531 12191:getfield        #12  <Field azh a>
	// 6532 12194:astore_1        
		abyte0.aC = ((azh) (abyte0)).A & ~a.aC;
	// 6533 12195:aload_1         
	// 6534 12196:aload_1         
	// 6535 12197:getfield        #294 <Field int azh.A>
	// 6536 12200:aload_0         
	// 6537 12201:getfield        #12  <Field azh a>
	// 6538 12204:getfield        #197 <Field int azh.aC>
	// 6539 12207:iconst_m1       
	// 6540 12208:ixor            
	// 6541 12209:iand            
	// 6542 12210:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 6543 12213:aload_0         
	// 6544 12214:getfield        #12  <Field azh a>
	// 6545 12217:astore_1        
		abyte0.bx = ((azh) (abyte0)).bm ^ a.bx;
	// 6546 12218:aload_1         
	// 6547 12219:aload_1         
	// 6548 12220:getfield        #256 <Field int azh.bm>
	// 6549 12223:aload_0         
	// 6550 12224:getfield        #12  <Field azh a>
	// 6551 12227:getfield        #125 <Field int azh.bx>
	// 6552 12230:ixor            
	// 6553 12231:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6554 12234:aload_0         
	// 6555 12235:getfield        #12  <Field azh a>
	// 6556 12238:astore_1        
		abyte0.bx = ((azh) (abyte0)).c | a.bx;
	// 6557 12239:aload_1         
	// 6558 12240:aload_1         
	// 6559 12241:getfield        #291 <Field int azh.c>
	// 6560 12244:aload_0         
	// 6561 12245:getfield        #12  <Field azh a>
	// 6562 12248:getfield        #125 <Field int azh.bx>
	// 6563 12251:ior             
	// 6564 12252:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6565 12255:aload_0         
	// 6566 12256:getfield        #12  <Field azh a>
	// 6567 12259:astore_1        
		abyte0.bx = ((azh) (abyte0)).I ^ a.bx;
	// 6568 12260:aload_1         
	// 6569 12261:aload_1         
	// 6570 12262:getfield        #282 <Field int azh.I>
	// 6571 12265:aload_0         
	// 6572 12266:getfield        #12  <Field azh a>
	// 6573 12269:getfield        #125 <Field int azh.bx>
	// 6574 12272:ixor            
	// 6575 12273:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6576 12276:aload_0         
	// 6577 12277:getfield        #12  <Field azh a>
	// 6578 12280:astore_1        
		abyte0.aU = ((azh) (abyte0)).bx ^ a.aU;
	// 6579 12281:aload_1         
	// 6580 12282:aload_1         
	// 6581 12283:getfield        #125 <Field int azh.bx>
	// 6582 12286:aload_0         
	// 6583 12287:getfield        #12  <Field azh a>
	// 6584 12290:getfield        #206 <Field int azh.aU>
	// 6585 12293:ixor            
	// 6586 12294:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6587 12297:aload_0         
	// 6588 12298:getfield        #12  <Field azh a>
	// 6589 12301:astore_1        
		abyte0.aU = ((azh) (abyte0)).s & ~a.aU;
	// 6590 12302:aload_1         
	// 6591 12303:aload_1         
	// 6592 12304:getfield        #327 <Field int azh.s>
	// 6593 12307:aload_0         
	// 6594 12308:getfield        #12  <Field azh a>
	// 6595 12311:getfield        #206 <Field int azh.aU>
	// 6596 12314:iconst_m1       
	// 6597 12315:ixor            
	// 6598 12316:iand            
	// 6599 12317:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6600 12320:aload_0         
	// 6601 12321:getfield        #12  <Field azh a>
	// 6602 12324:astore_1        
		abyte0.s = ((azh) (abyte0)).ae & ~a.bm;
	// 6603 12325:aload_1         
	// 6604 12326:aload_1         
	// 6605 12327:getfield        #288 <Field int azh.ae>
	// 6606 12330:aload_0         
	// 6607 12331:getfield        #12  <Field azh a>
	// 6608 12334:getfield        #256 <Field int azh.bm>
	// 6609 12337:iconst_m1       
	// 6610 12338:ixor            
	// 6611 12339:iand            
	// 6612 12340:putfield        #327 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 6613 12343:aload_0         
	// 6614 12344:getfield        #12  <Field azh a>
	// 6615 12347:astore_1        
		abyte0.s = ((azh) (abyte0)).c & ~a.s;
	// 6616 12348:aload_1         
	// 6617 12349:aload_1         
	// 6618 12350:getfield        #291 <Field int azh.c>
	// 6619 12353:aload_0         
	// 6620 12354:getfield        #12  <Field azh a>
	// 6621 12357:getfield        #327 <Field int azh.s>
	// 6622 12360:iconst_m1       
	// 6623 12361:ixor            
	// 6624 12362:iand            
	// 6625 12363:putfield        #327 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 6626 12366:aload_0         
	// 6627 12367:getfield        #12  <Field azh a>
	// 6628 12370:astore_1        
		abyte0.s = ((azh) (abyte0)).aD ^ a.s;
	// 6629 12371:aload_1         
	// 6630 12372:aload_1         
	// 6631 12373:getfield        #92  <Field int azh.aD>
	// 6632 12376:aload_0         
	// 6633 12377:getfield        #12  <Field azh a>
	// 6634 12380:getfield        #327 <Field int azh.s>
	// 6635 12383:ixor            
	// 6636 12384:putfield        #327 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 6637 12387:aload_0         
	// 6638 12388:getfield        #12  <Field azh a>
	// 6639 12391:astore_1        
		abyte0.aC = ((azh) (abyte0)).s ^ a.aC;
	// 6640 12392:aload_1         
	// 6641 12393:aload_1         
	// 6642 12394:getfield        #327 <Field int azh.s>
	// 6643 12397:aload_0         
	// 6644 12398:getfield        #12  <Field azh a>
	// 6645 12401:getfield        #197 <Field int azh.aC>
	// 6646 12404:ixor            
	// 6647 12405:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 6648 12408:aload_0         
	// 6649 12409:getfield        #12  <Field azh a>
	// 6650 12412:astore_1        
		abyte0.aW = ((azh) (abyte0)).aC ^ a.aW;
	// 6651 12413:aload_1         
	// 6652 12414:aload_1         
	// 6653 12415:getfield        #197 <Field int azh.aC>
	// 6654 12418:aload_0         
	// 6655 12419:getfield        #12  <Field azh a>
	// 6656 12422:getfield        #345 <Field int azh.aW>
	// 6657 12425:ixor            
	// 6658 12426:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6659 12429:aload_0         
	// 6660 12430:getfield        #12  <Field azh a>
	// 6661 12433:astore_1        
		abyte0.T = ((azh) (abyte0)).aW ^ a.T;
	// 6662 12434:aload_1         
	// 6663 12435:aload_1         
	// 6664 12436:getfield        #345 <Field int azh.aW>
	// 6665 12439:aload_0         
	// 6666 12440:getfield        #12  <Field azh a>
	// 6667 12443:getfield        #435 <Field int azh.T>
	// 6668 12446:ixor            
	// 6669 12447:putfield        #435 <Field int azh.T>
		abyte0 = ((byte []) (a));
	// 6670 12450:aload_0         
	// 6671 12451:getfield        #12  <Field azh a>
	// 6672 12454:astore_1        
		abyte0.aW = ((azh) (abyte0)).h & ~a.T;
	// 6673 12455:aload_1         
	// 6674 12456:aload_1         
	// 6675 12457:getfield        #339 <Field int azh.h>
	// 6676 12460:aload_0         
	// 6677 12461:getfield        #12  <Field azh a>
	// 6678 12464:getfield        #435 <Field int azh.T>
	// 6679 12467:iconst_m1       
	// 6680 12468:ixor            
	// 6681 12469:iand            
	// 6682 12470:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 6683 12473:aload_0         
	// 6684 12474:getfield        #12  <Field azh a>
	// 6685 12477:astore_1        
		abyte0.aC = ((azh) (abyte0)).D & a.aW;
	// 6686 12478:aload_1         
	// 6687 12479:aload_1         
	// 6688 12480:getfield        #74  <Field int azh.D>
	// 6689 12483:aload_0         
	// 6690 12484:getfield        #12  <Field azh a>
	// 6691 12487:getfield        #345 <Field int azh.aW>
	// 6692 12490:iand            
	// 6693 12491:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 6694 12494:aload_0         
	// 6695 12495:getfield        #12  <Field azh a>
	// 6696 12498:astore_1        
		abyte0.s = ((azh) (abyte0)).D & ~a.aW;
	// 6697 12499:aload_1         
	// 6698 12500:aload_1         
	// 6699 12501:getfield        #74  <Field int azh.D>
	// 6700 12504:aload_0         
	// 6701 12505:getfield        #12  <Field azh a>
	// 6702 12508:getfield        #345 <Field int azh.aW>
	// 6703 12511:iconst_m1       
	// 6704 12512:ixor            
	// 6705 12513:iand            
	// 6706 12514:putfield        #327 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 6707 12517:aload_0         
	// 6708 12518:getfield        #12  <Field azh a>
	// 6709 12521:astore_1        
		abyte0.s = ((azh) (abyte0)).s & ~a.ab;
	// 6710 12522:aload_1         
	// 6711 12523:aload_1         
	// 6712 12524:getfield        #327 <Field int azh.s>
	// 6713 12527:aload_0         
	// 6714 12528:getfield        #12  <Field azh a>
	// 6715 12531:getfield        #77  <Field int azh.ab>
	// 6716 12534:iconst_m1       
	// 6717 12535:ixor            
	// 6718 12536:iand            
	// 6719 12537:putfield        #327 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 6720 12540:aload_0         
	// 6721 12541:getfield        #12  <Field azh a>
	// 6722 12544:astore_1        
		abyte0.aD = ((azh) (abyte0)).D & a.aW;
	// 6723 12545:aload_1         
	// 6724 12546:aload_1         
	// 6725 12547:getfield        #74  <Field int azh.D>
	// 6726 12550:aload_0         
	// 6727 12551:getfield        #12  <Field azh a>
	// 6728 12554:getfield        #345 <Field int azh.aW>
	// 6729 12557:iand            
	// 6730 12558:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 6731 12561:aload_0         
	// 6732 12562:getfield        #12  <Field azh a>
	// 6733 12565:astore_1        
		abyte0.aw = ((azh) (abyte0)).aD ^ a.aw;
	// 6734 12566:aload_1         
	// 6735 12567:aload_1         
	// 6736 12568:getfield        #92  <Field int azh.aD>
	// 6737 12571:aload_0         
	// 6738 12572:getfield        #12  <Field azh a>
	// 6739 12575:getfield        #71  <Field int azh.aw>
	// 6740 12578:ixor            
	// 6741 12579:putfield        #71  <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 6742 12582:aload_0         
	// 6743 12583:getfield        #12  <Field azh a>
	// 6744 12586:astore_1        
		abyte0.bx = ((azh) (abyte0)).h & ~a.aW;
	// 6745 12587:aload_1         
	// 6746 12588:aload_1         
	// 6747 12589:getfield        #339 <Field int azh.h>
	// 6748 12592:aload_0         
	// 6749 12593:getfield        #12  <Field azh a>
	// 6750 12596:getfield        #345 <Field int azh.aW>
	// 6751 12599:iconst_m1       
	// 6752 12600:ixor            
	// 6753 12601:iand            
	// 6754 12602:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6755 12605:aload_0         
	// 6756 12606:getfield        #12  <Field azh a>
	// 6757 12609:astore_1        
		abyte0.aP = ((azh) (abyte0)).D & ~a.bx;
	// 6758 12610:aload_1         
	// 6759 12611:aload_1         
	// 6760 12612:getfield        #74  <Field int azh.D>
	// 6761 12615:aload_0         
	// 6762 12616:getfield        #12  <Field azh a>
	// 6763 12619:getfield        #125 <Field int azh.bx>
	// 6764 12622:iconst_m1       
	// 6765 12623:ixor            
	// 6766 12624:iand            
	// 6767 12625:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 6768 12628:aload_0         
	// 6769 12629:getfield        #12  <Field azh a>
	// 6770 12632:astore_1        
		abyte0.aA = ((azh) (abyte0)).bx ^ a.aA;
	// 6771 12633:aload_1         
	// 6772 12634:aload_1         
	// 6773 12635:getfield        #125 <Field int azh.bx>
	// 6774 12638:aload_0         
	// 6775 12639:getfield        #12  <Field azh a>
	// 6776 12642:getfield        #83  <Field int azh.aA>
	// 6777 12645:ixor            
	// 6778 12646:putfield        #83  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 6779 12649:aload_0         
	// 6780 12650:getfield        #12  <Field azh a>
	// 6781 12653:astore_1        
		abyte0.ay = ((azh) (abyte0)).ab | a.bx;
	// 6782 12654:aload_1         
	// 6783 12655:aload_1         
	// 6784 12656:getfield        #77  <Field int azh.ab>
	// 6785 12659:aload_0         
	// 6786 12660:getfield        #12  <Field azh a>
	// 6787 12663:getfield        #125 <Field int azh.bx>
	// 6788 12666:ior             
	// 6789 12667:putfield        #265 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 6790 12670:aload_0         
	// 6791 12671:getfield        #12  <Field azh a>
	// 6792 12674:astore_1        
		abyte0.ay = ((azh) (abyte0)).bx ^ a.ay;
	// 6793 12675:aload_1         
	// 6794 12676:aload_1         
	// 6795 12677:getfield        #125 <Field int azh.bx>
	// 6796 12680:aload_0         
	// 6797 12681:getfield        #12  <Field azh a>
	// 6798 12684:getfield        #265 <Field int azh.ay>
	// 6799 12687:ixor            
	// 6800 12688:putfield        #265 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 6801 12691:aload_0         
	// 6802 12692:getfield        #12  <Field azh a>
	// 6803 12695:astore_1        
		abyte0.aK = ((azh) (abyte0)).bx & ~a.ab;
	// 6804 12696:aload_1         
	// 6805 12697:aload_1         
	// 6806 12698:getfield        #125 <Field int azh.bx>
	// 6807 12701:aload_0         
	// 6808 12702:getfield        #12  <Field azh a>
	// 6809 12705:getfield        #77  <Field int azh.ab>
	// 6810 12708:iconst_m1       
	// 6811 12709:ixor            
	// 6812 12710:iand            
	// 6813 12711:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 6814 12714:aload_0         
	// 6815 12715:getfield        #12  <Field azh a>
	// 6816 12718:astore_1        
		abyte0.bx = ((azh) (abyte0)).D & ~a.bx;
	// 6817 12719:aload_1         
	// 6818 12720:aload_1         
	// 6819 12721:getfield        #74  <Field int azh.D>
	// 6820 12724:aload_0         
	// 6821 12725:getfield        #12  <Field azh a>
	// 6822 12728:getfield        #125 <Field int azh.bx>
	// 6823 12731:iconst_m1       
	// 6824 12732:ixor            
	// 6825 12733:iand            
	// 6826 12734:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6827 12737:aload_0         
	// 6828 12738:getfield        #12  <Field azh a>
	// 6829 12741:astore_1        
		abyte0.ar = ((azh) (abyte0)).D & ~a.aW;
	// 6830 12742:aload_1         
	// 6831 12743:aload_1         
	// 6832 12744:getfield        #74  <Field int azh.D>
	// 6833 12747:aload_0         
	// 6834 12748:getfield        #12  <Field azh a>
	// 6835 12751:getfield        #345 <Field int azh.aW>
	// 6836 12754:iconst_m1       
	// 6837 12755:ixor            
	// 6838 12756:iand            
	// 6839 12757:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 6840 12760:aload_0         
	// 6841 12761:getfield        #12  <Field azh a>
	// 6842 12764:astore_1        
		abyte0.aI = ((azh) (abyte0)).aW ^ a.aI;
	// 6843 12765:aload_1         
	// 6844 12766:aload_1         
	// 6845 12767:getfield        #345 <Field int azh.aW>
	// 6846 12770:aload_0         
	// 6847 12771:getfield        #12  <Field azh a>
	// 6848 12774:getfield        #235 <Field int azh.aI>
	// 6849 12777:ixor            
	// 6850 12778:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 6851 12781:aload_0         
	// 6852 12782:getfield        #12  <Field azh a>
	// 6853 12785:astore_1        
		abyte0.at = ((azh) (abyte0)).aI & ~a.ab;
	// 6854 12786:aload_1         
	// 6855 12787:aload_1         
	// 6856 12788:getfield        #235 <Field int azh.aI>
	// 6857 12791:aload_0         
	// 6858 12792:getfield        #12  <Field azh a>
	// 6859 12795:getfield        #77  <Field int azh.ab>
	// 6860 12798:iconst_m1       
	// 6861 12799:ixor            
	// 6862 12800:iand            
	// 6863 12801:putfield        #241 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6864 12804:aload_0         
	// 6865 12805:getfield        #12  <Field azh a>
	// 6866 12808:astore_1        
		abyte0.be = ((azh) (abyte0)).T ^ a.h;
	// 6867 12809:aload_1         
	// 6868 12810:aload_1         
	// 6869 12811:getfield        #435 <Field int azh.T>
	// 6870 12814:aload_0         
	// 6871 12815:getfield        #12  <Field azh a>
	// 6872 12818:getfield        #339 <Field int azh.h>
	// 6873 12821:ixor            
	// 6874 12822:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6875 12825:aload_0         
	// 6876 12826:getfield        #12  <Field azh a>
	// 6877 12829:astore_1        
		abyte0.bx = ((azh) (abyte0)).be ^ a.bx;
	// 6878 12830:aload_1         
	// 6879 12831:aload_1         
	// 6880 12832:getfield        #155 <Field int azh.be>
	// 6881 12835:aload_0         
	// 6882 12836:getfield        #12  <Field azh a>
	// 6883 12839:getfield        #125 <Field int azh.bx>
	// 6884 12842:ixor            
	// 6885 12843:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6886 12846:aload_0         
	// 6887 12847:getfield        #12  <Field azh a>
	// 6888 12850:astore_1        
		abyte0.aK = ((azh) (abyte0)).bx ^ a.aK;
	// 6889 12851:aload_1         
	// 6890 12852:aload_1         
	// 6891 12853:getfield        #125 <Field int azh.bx>
	// 6892 12856:aload_0         
	// 6893 12857:getfield        #12  <Field azh a>
	// 6894 12860:getfield        #131 <Field int azh.aK>
	// 6895 12863:ixor            
	// 6896 12864:putfield        #131 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 6897 12867:aload_0         
	// 6898 12868:getfield        #12  <Field azh a>
	// 6899 12871:astore_1        
		abyte0.bx = ((azh) (abyte0)).D & ~a.be;
	// 6900 12872:aload_1         
	// 6901 12873:aload_1         
	// 6902 12874:getfield        #74  <Field int azh.D>
	// 6903 12877:aload_0         
	// 6904 12878:getfield        #12  <Field azh a>
	// 6905 12881:getfield        #155 <Field int azh.be>
	// 6906 12884:iconst_m1       
	// 6907 12885:ixor            
	// 6908 12886:iand            
	// 6909 12887:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 6910 12890:aload_0         
	// 6911 12891:getfield        #12  <Field azh a>
	// 6912 12894:astore_1        
		abyte0.aE = ((azh) (abyte0)).D & a.T;
	// 6913 12895:aload_1         
	// 6914 12896:aload_1         
	// 6915 12897:getfield        #74  <Field int azh.D>
	// 6916 12900:aload_0         
	// 6917 12901:getfield        #12  <Field azh a>
	// 6918 12904:getfield        #435 <Field int azh.T>
	// 6919 12907:iand            
	// 6920 12908:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 6921 12911:aload_0         
	// 6922 12912:getfield        #12  <Field azh a>
	// 6923 12915:astore_1        
		abyte0.aE = ((azh) (abyte0)).be ^ a.aE;
	// 6924 12916:aload_1         
	// 6925 12917:aload_1         
	// 6926 12918:getfield        #155 <Field int azh.be>
	// 6927 12921:aload_0         
	// 6928 12922:getfield        #12  <Field azh a>
	// 6929 12925:getfield        #41  <Field int azh.aE>
	// 6930 12928:ixor            
	// 6931 12929:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 6932 12932:aload_0         
	// 6933 12933:getfield        #12  <Field azh a>
	// 6934 12936:astore_1        
		abyte0.aE = ((azh) (abyte0)).aE ^ a.ab;
	// 6935 12937:aload_1         
	// 6936 12938:aload_1         
	// 6937 12939:getfield        #41  <Field int azh.aE>
	// 6938 12942:aload_0         
	// 6939 12943:getfield        #12  <Field azh a>
	// 6940 12946:getfield        #77  <Field int azh.ab>
	// 6941 12949:ixor            
	// 6942 12950:putfield        #41  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 6943 12953:aload_0         
	// 6944 12954:getfield        #12  <Field azh a>
	// 6945 12957:astore_1        
		abyte0.aS = ((azh) (abyte0)).T & a.h;
	// 6946 12958:aload_1         
	// 6947 12959:aload_1         
	// 6948 12960:getfield        #435 <Field int azh.T>
	// 6949 12963:aload_0         
	// 6950 12964:getfield        #12  <Field azh a>
	// 6951 12967:getfield        #339 <Field int azh.h>
	// 6952 12970:iand            
	// 6953 12971:putfield        #414 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 6954 12974:aload_0         
	// 6955 12975:getfield        #12  <Field azh a>
	// 6956 12978:astore_1        
		abyte0.aG = ((azh) (abyte0)).D & a.aS;
	// 6957 12979:aload_1         
	// 6958 12980:aload_1         
	// 6959 12981:getfield        #74  <Field int azh.D>
	// 6960 12984:aload_0         
	// 6961 12985:getfield        #12  <Field azh a>
	// 6962 12988:getfield        #414 <Field int azh.aS>
	// 6963 12991:iand            
	// 6964 12992:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 6965 12995:aload_0         
	// 6966 12996:getfield        #12  <Field azh a>
	// 6967 12999:astore_1        
		abyte0.aP = ((azh) (abyte0)).aS ^ a.aP;
	// 6968 13000:aload_1         
	// 6969 13001:aload_1         
	// 6970 13002:getfield        #414 <Field int azh.aS>
	// 6971 13005:aload_0         
	// 6972 13006:getfield        #12  <Field azh a>
	// 6973 13009:getfield        #50  <Field int azh.aP>
	// 6974 13012:ixor            
	// 6975 13013:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 6976 13016:aload_0         
	// 6977 13017:getfield        #12  <Field azh a>
	// 6978 13020:astore_1        
		abyte0.aP = ((azh) (abyte0)).aP & ~a.ab;
	// 6979 13021:aload_1         
	// 6980 13022:aload_1         
	// 6981 13023:getfield        #50  <Field int azh.aP>
	// 6982 13026:aload_0         
	// 6983 13027:getfield        #12  <Field azh a>
	// 6984 13030:getfield        #77  <Field int azh.ab>
	// 6985 13033:iconst_m1       
	// 6986 13034:ixor            
	// 6987 13035:iand            
	// 6988 13036:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 6989 13039:aload_0         
	// 6990 13040:getfield        #12  <Field azh a>
	// 6991 13043:astore_1        
		abyte0.aP = ((azh) (abyte0)).aD ^ a.aP;
	// 6992 13044:aload_1         
	// 6993 13045:aload_1         
	// 6994 13046:getfield        #92  <Field int azh.aD>
	// 6995 13049:aload_0         
	// 6996 13050:getfield        #12  <Field azh a>
	// 6997 13053:getfield        #50  <Field int azh.aP>
	// 6998 13056:ixor            
	// 6999 13057:putfield        #50  <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 7000 13060:aload_0         
	// 7001 13061:getfield        #12  <Field azh a>
	// 7002 13064:astore_1        
		abyte0.aS = ((azh) (abyte0)).D & a.aS;
	// 7003 13065:aload_1         
	// 7004 13066:aload_1         
	// 7005 13067:getfield        #74  <Field int azh.D>
	// 7006 13070:aload_0         
	// 7007 13071:getfield        #12  <Field azh a>
	// 7008 13074:getfield        #414 <Field int azh.aS>
	// 7009 13077:iand            
	// 7010 13078:putfield        #414 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 7011 13081:aload_0         
	// 7012 13082:getfield        #12  <Field azh a>
	// 7013 13085:astore_1        
		abyte0.aD = ((azh) (abyte0)).h | a.T;
	// 7014 13086:aload_1         
	// 7015 13087:aload_1         
	// 7016 13088:getfield        #339 <Field int azh.h>
	// 7017 13091:aload_0         
	// 7018 13092:getfield        #12  <Field azh a>
	// 7019 13095:getfield        #435 <Field int azh.T>
	// 7020 13098:ior             
	// 7021 13099:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7022 13102:aload_0         
	// 7023 13103:getfield        #12  <Field azh a>
	// 7024 13106:astore_1        
		abyte0.aC = ((azh) (abyte0)).aD ^ a.aC;
	// 7025 13107:aload_1         
	// 7026 13108:aload_1         
	// 7027 13109:getfield        #92  <Field int azh.aD>
	// 7028 13112:aload_0         
	// 7029 13113:getfield        #12  <Field azh a>
	// 7030 13116:getfield        #197 <Field int azh.aC>
	// 7031 13119:ixor            
	// 7032 13120:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 7033 13123:aload_0         
	// 7034 13124:getfield        #12  <Field azh a>
	// 7035 13127:astore_1        
		abyte0.aG = ((azh) (abyte0)).aD ^ a.aG;
	// 7036 13128:aload_1         
	// 7037 13129:aload_1         
	// 7038 13130:getfield        #92  <Field int azh.aD>
	// 7039 13133:aload_0         
	// 7040 13134:getfield        #12  <Field azh a>
	// 7041 13137:getfield        #211 <Field int azh.aG>
	// 7042 13140:ixor            
	// 7043 13141:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 7044 13144:aload_0         
	// 7045 13145:getfield        #12  <Field azh a>
	// 7046 13148:astore_1        
		abyte0.aG = ((azh) (abyte0)).ab & ~a.aG;
	// 7047 13149:aload_1         
	// 7048 13150:aload_1         
	// 7049 13151:getfield        #77  <Field int azh.ab>
	// 7050 13154:aload_0         
	// 7051 13155:getfield        #12  <Field azh a>
	// 7052 13158:getfield        #211 <Field int azh.aG>
	// 7053 13161:iconst_m1       
	// 7054 13162:ixor            
	// 7055 13163:iand            
	// 7056 13164:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 7057 13167:aload_0         
	// 7058 13168:getfield        #12  <Field azh a>
	// 7059 13171:astore_1        
		abyte0.aG = ((azh) (abyte0)).aI ^ a.aG;
	// 7060 13172:aload_1         
	// 7061 13173:aload_1         
	// 7062 13174:getfield        #235 <Field int azh.aI>
	// 7063 13177:aload_0         
	// 7064 13178:getfield        #12  <Field azh a>
	// 7065 13181:getfield        #211 <Field int azh.aG>
	// 7066 13184:ixor            
	// 7067 13185:putfield        #211 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 7068 13188:aload_0         
	// 7069 13189:getfield        #12  <Field azh a>
	// 7070 13192:astore_1        
		abyte0.aI = ((azh) (abyte0)).D & ~a.aD;
	// 7071 13193:aload_1         
	// 7072 13194:aload_1         
	// 7073 13195:getfield        #74  <Field int azh.D>
	// 7074 13198:aload_0         
	// 7075 13199:getfield        #12  <Field azh a>
	// 7076 13202:getfield        #92  <Field int azh.aD>
	// 7077 13205:iconst_m1       
	// 7078 13206:ixor            
	// 7079 13207:iand            
	// 7080 13208:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7081 13211:aload_0         
	// 7082 13212:getfield        #12  <Field azh a>
	// 7083 13215:astore_1        
		abyte0.aq = ((azh) (abyte0)).T & ~a.h;
	// 7084 13216:aload_1         
	// 7085 13217:aload_1         
	// 7086 13218:getfield        #435 <Field int azh.T>
	// 7087 13221:aload_0         
	// 7088 13222:getfield        #12  <Field azh a>
	// 7089 13225:getfield        #339 <Field int azh.h>
	// 7090 13228:iconst_m1       
	// 7091 13229:ixor            
	// 7092 13230:iand            
	// 7093 13231:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 7094 13234:aload_0         
	// 7095 13235:getfield        #12  <Field azh a>
	// 7096 13238:astore_1        
		abyte0.bk = ((azh) (abyte0)).D & a.aq;
	// 7097 13239:aload_1         
	// 7098 13240:aload_1         
	// 7099 13241:getfield        #74  <Field int azh.D>
	// 7100 13244:aload_0         
	// 7101 13245:getfield        #12  <Field azh a>
	// 7102 13248:getfield        #38  <Field int azh.aq>
	// 7103 13251:iand            
	// 7104 13252:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7105 13255:aload_0         
	// 7106 13256:getfield        #12  <Field azh a>
	// 7107 13259:astore_1        
		abyte0.bk = ((azh) (abyte0)).be ^ a.bk;
	// 7108 13260:aload_1         
	// 7109 13261:aload_1         
	// 7110 13262:getfield        #155 <Field int azh.be>
	// 7111 13265:aload_0         
	// 7112 13266:getfield        #12  <Field azh a>
	// 7113 13269:getfield        #259 <Field int azh.bk>
	// 7114 13272:ixor            
	// 7115 13273:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7116 13276:aload_0         
	// 7117 13277:getfield        #12  <Field azh a>
	// 7118 13280:astore_1        
		abyte0.s = ((azh) (abyte0)).bk ^ a.s;
	// 7119 13281:aload_1         
	// 7120 13282:aload_1         
	// 7121 13283:getfield        #259 <Field int azh.bk>
	// 7122 13286:aload_0         
	// 7123 13287:getfield        #12  <Field azh a>
	// 7124 13290:getfield        #327 <Field int azh.s>
	// 7125 13293:ixor            
	// 7126 13294:putfield        #327 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 7127 13297:aload_0         
	// 7128 13298:getfield        #12  <Field azh a>
	// 7129 13301:astore_1        
		abyte0.bk = ((azh) (abyte0)).D & a.aq;
	// 7130 13302:aload_1         
	// 7131 13303:aload_1         
	// 7132 13304:getfield        #74  <Field int azh.D>
	// 7133 13307:aload_0         
	// 7134 13308:getfield        #12  <Field azh a>
	// 7135 13311:getfield        #38  <Field int azh.aq>
	// 7136 13314:iand            
	// 7137 13315:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7138 13318:aload_0         
	// 7139 13319:getfield        #12  <Field azh a>
	// 7140 13322:astore_1        
		abyte0.bk = ((azh) (abyte0)).aD ^ a.bk;
	// 7141 13323:aload_1         
	// 7142 13324:aload_1         
	// 7143 13325:getfield        #92  <Field int azh.aD>
	// 7144 13328:aload_0         
	// 7145 13329:getfield        #12  <Field azh a>
	// 7146 13332:getfield        #259 <Field int azh.bk>
	// 7147 13335:ixor            
	// 7148 13336:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7149 13339:aload_0         
	// 7150 13340:getfield        #12  <Field azh a>
	// 7151 13343:astore_1        
		abyte0.bk = ((azh) (abyte0)).ab & ~a.bk;
	// 7152 13344:aload_1         
	// 7153 13345:aload_1         
	// 7154 13346:getfield        #77  <Field int azh.ab>
	// 7155 13349:aload_0         
	// 7156 13350:getfield        #12  <Field azh a>
	// 7157 13353:getfield        #259 <Field int azh.bk>
	// 7158 13356:iconst_m1       
	// 7159 13357:ixor            
	// 7160 13358:iand            
	// 7161 13359:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7162 13362:aload_0         
	// 7163 13363:getfield        #12  <Field azh a>
	// 7164 13366:astore_1        
		abyte0.aD = ((azh) (abyte0)).h | a.aq;
	// 7165 13367:aload_1         
	// 7166 13368:aload_1         
	// 7167 13369:getfield        #339 <Field int azh.h>
	// 7168 13372:aload_0         
	// 7169 13373:getfield        #12  <Field azh a>
	// 7170 13376:getfield        #38  <Field int azh.aq>
	// 7171 13379:ior             
	// 7172 13380:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7173 13383:aload_0         
	// 7174 13384:getfield        #12  <Field azh a>
	// 7175 13387:astore_1        
		abyte0.bx = ((azh) (abyte0)).aD ^ a.bx;
	// 7176 13388:aload_1         
	// 7177 13389:aload_1         
	// 7178 13390:getfield        #92  <Field int azh.aD>
	// 7179 13393:aload_0         
	// 7180 13394:getfield        #12  <Field azh a>
	// 7181 13397:getfield        #125 <Field int azh.bx>
	// 7182 13400:ixor            
	// 7183 13401:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7184 13404:aload_0         
	// 7185 13405:getfield        #12  <Field azh a>
	// 7186 13408:astore_1        
		abyte0.at = ((azh) (abyte0)).bx ^ a.at;
	// 7187 13409:aload_1         
	// 7188 13410:aload_1         
	// 7189 13411:getfield        #125 <Field int azh.bx>
	// 7190 13414:aload_0         
	// 7191 13415:getfield        #12  <Field azh a>
	// 7192 13418:getfield        #241 <Field int azh.at>
	// 7193 13421:ixor            
	// 7194 13422:putfield        #241 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7195 13425:aload_0         
	// 7196 13426:getfield        #12  <Field azh a>
	// 7197 13429:astore_1        
		abyte0.aI = ((azh) (abyte0)).aD ^ a.aI;
	// 7198 13430:aload_1         
	// 7199 13431:aload_1         
	// 7200 13432:getfield        #92  <Field int azh.aD>
	// 7201 13435:aload_0         
	// 7202 13436:getfield        #12  <Field azh a>
	// 7203 13439:getfield        #235 <Field int azh.aI>
	// 7204 13442:ixor            
	// 7205 13443:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7206 13446:aload_0         
	// 7207 13447:getfield        #12  <Field azh a>
	// 7208 13450:astore_1        
		abyte0.bx = ((azh) (abyte0)).aI & ~a.ab;
	// 7209 13451:aload_1         
	// 7210 13452:aload_1         
	// 7211 13453:getfield        #235 <Field int azh.aI>
	// 7212 13456:aload_0         
	// 7213 13457:getfield        #12  <Field azh a>
	// 7214 13460:getfield        #77  <Field int azh.ab>
	// 7215 13463:iconst_m1       
	// 7216 13464:ixor            
	// 7217 13465:iand            
	// 7218 13466:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7219 13469:aload_0         
	// 7220 13470:getfield        #12  <Field azh a>
	// 7221 13473:astore_1        
		abyte0.bx = ((azh) (abyte0)).aC ^ a.bx;
	// 7222 13474:aload_1         
	// 7223 13475:aload_1         
	// 7224 13476:getfield        #197 <Field int azh.aC>
	// 7225 13479:aload_0         
	// 7226 13480:getfield        #12  <Field azh a>
	// 7227 13483:getfield        #125 <Field int azh.bx>
	// 7228 13486:ixor            
	// 7229 13487:putfield        #125 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 7230 13490:aload_0         
	// 7231 13491:getfield        #12  <Field azh a>
	// 7232 13494:astore_1        
		abyte0.bk = ((azh) (abyte0)).aI ^ a.bk;
	// 7233 13495:aload_1         
	// 7234 13496:aload_1         
	// 7235 13497:getfield        #235 <Field int azh.aI>
	// 7236 13500:aload_0         
	// 7237 13501:getfield        #12  <Field azh a>
	// 7238 13504:getfield        #259 <Field int azh.bk>
	// 7239 13507:ixor            
	// 7240 13508:putfield        #259 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7241 13511:aload_0         
	// 7242 13512:getfield        #12  <Field azh a>
	// 7243 13515:astore_1        
		abyte0.ar = ((azh) (abyte0)).aD ^ a.ar;
	// 7244 13516:aload_1         
	// 7245 13517:aload_1         
	// 7246 13518:getfield        #92  <Field int azh.aD>
	// 7247 13521:aload_0         
	// 7248 13522:getfield        #12  <Field azh a>
	// 7249 13525:getfield        #250 <Field int azh.ar>
	// 7250 13528:ixor            
	// 7251 13529:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7252 13532:aload_0         
	// 7253 13533:getfield        #12  <Field azh a>
	// 7254 13536:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & ~a.ab;
	// 7255 13537:aload_1         
	// 7256 13538:aload_1         
	// 7257 13539:getfield        #250 <Field int azh.ar>
	// 7258 13542:aload_0         
	// 7259 13543:getfield        #12  <Field azh a>
	// 7260 13546:getfield        #77  <Field int azh.ab>
	// 7261 13549:iconst_m1       
	// 7262 13550:ixor            
	// 7263 13551:iand            
	// 7264 13552:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7265 13555:aload_0         
	// 7266 13556:getfield        #12  <Field azh a>
	// 7267 13559:astore_1        
		abyte0.ar = ((azh) (abyte0)).aS ^ a.ar;
	// 7268 13560:aload_1         
	// 7269 13561:aload_1         
	// 7270 13562:getfield        #414 <Field int azh.aS>
	// 7271 13565:aload_0         
	// 7272 13566:getfield        #12  <Field azh a>
	// 7273 13569:getfield        #250 <Field int azh.ar>
	// 7274 13572:ixor            
	// 7275 13573:putfield        #250 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7276 13576:aload_0         
	// 7277 13577:getfield        #12  <Field azh a>
	// 7278 13580:astore_1        
		abyte0.aq = ((azh) (abyte0)).D & ~a.aq;
	// 7279 13581:aload_1         
	// 7280 13582:aload_1         
	// 7281 13583:getfield        #74  <Field int azh.D>
	// 7282 13586:aload_0         
	// 7283 13587:getfield        #12  <Field azh a>
	// 7284 13590:getfield        #38  <Field int azh.aq>
	// 7285 13593:iconst_m1       
	// 7286 13594:ixor            
	// 7287 13595:iand            
	// 7288 13596:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 7289 13599:aload_0         
	// 7290 13600:getfield        #12  <Field azh a>
	// 7291 13603:astore_1        
		abyte0.aq = ((azh) (abyte0)).aW ^ a.aq;
	// 7292 13604:aload_1         
	// 7293 13605:aload_1         
	// 7294 13606:getfield        #345 <Field int azh.aW>
	// 7295 13609:aload_0         
	// 7296 13610:getfield        #12  <Field azh a>
	// 7297 13613:getfield        #38  <Field int azh.aq>
	// 7298 13616:ixor            
	// 7299 13617:putfield        #38  <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 7300 13620:aload_0         
	// 7301 13621:getfield        #12  <Field azh a>
	// 7302 13624:astore_1        
		abyte0.by = ((azh) (abyte0)).aq ^ a.by;
	// 7303 13625:aload_1         
	// 7304 13626:aload_1         
	// 7305 13627:getfield        #38  <Field int azh.aq>
	// 7306 13630:aload_0         
	// 7307 13631:getfield        #12  <Field azh a>
	// 7308 13634:getfield        #98  <Field int azh.by>
	// 7309 13637:ixor            
	// 7310 13638:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 7311 13641:aload_0         
	// 7312 13642:getfield        #12  <Field azh a>
	// 7313 13645:astore_1        
		abyte0.bm = ((azh) (abyte0)).ae & ~a.bm;
	// 7314 13646:aload_1         
	// 7315 13647:aload_1         
	// 7316 13648:getfield        #288 <Field int azh.ae>
	// 7317 13651:aload_0         
	// 7318 13652:getfield        #12  <Field azh a>
	// 7319 13655:getfield        #256 <Field int azh.bm>
	// 7320 13658:iconst_m1       
	// 7321 13659:ixor            
	// 7322 13660:iand            
	// 7323 13661:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7324 13664:aload_0         
	// 7325 13665:getfield        #12  <Field azh a>
	// 7326 13668:astore_1        
		abyte0.bm = ((azh) (abyte0)).ao ^ a.bm;
	// 7327 13669:aload_1         
	// 7328 13670:aload_1         
	// 7329 13671:getfield        #253 <Field int azh.ao>
	// 7330 13674:aload_0         
	// 7331 13675:getfield        #12  <Field azh a>
	// 7332 13678:getfield        #256 <Field int azh.bm>
	// 7333 13681:ixor            
	// 7334 13682:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7335 13685:aload_0         
	// 7336 13686:getfield        #12  <Field azh a>
	// 7337 13689:astore_1        
		abyte0.bG = ((azh) (abyte0)).bm ^ a.bG;
	// 7338 13690:aload_1         
	// 7339 13691:aload_1         
	// 7340 13692:getfield        #256 <Field int azh.bm>
	// 7341 13695:aload_0         
	// 7342 13696:getfield        #12  <Field azh a>
	// 7343 13699:getfield        #122 <Field int azh.bG>
	// 7344 13702:ixor            
	// 7345 13703:putfield        #122 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 7346 13706:aload_0         
	// 7347 13707:getfield        #12  <Field azh a>
	// 7348 13710:astore_1        
		abyte0.aL = ((azh) (abyte0)).bG ^ a.aL;
	// 7349 13711:aload_1         
	// 7350 13712:aload_1         
	// 7351 13713:getfield        #122 <Field int azh.bG>
	// 7352 13716:aload_0         
	// 7353 13717:getfield        #12  <Field azh a>
	// 7354 13720:getfield        #220 <Field int azh.aL>
	// 7355 13723:ixor            
	// 7356 13724:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7357 13727:aload_0         
	// 7358 13728:getfield        #12  <Field azh a>
	// 7359 13731:astore_1        
		abyte0.aU = ((azh) (abyte0)).aL ^ a.aU;
	// 7360 13732:aload_1         
	// 7361 13733:aload_1         
	// 7362 13734:getfield        #220 <Field int azh.aL>
	// 7363 13737:aload_0         
	// 7364 13738:getfield        #12  <Field azh a>
	// 7365 13741:getfield        #206 <Field int azh.aU>
	// 7366 13744:ixor            
	// 7367 13745:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7368 13748:aload_0         
	// 7369 13749:getfield        #12  <Field azh a>
	// 7370 13752:astore_1        
		abyte0.R = ((azh) (abyte0)).aU ^ a.R;
	// 7371 13753:aload_1         
	// 7372 13754:aload_1         
	// 7373 13755:getfield        #206 <Field int azh.aU>
	// 7374 13758:aload_0         
	// 7375 13759:getfield        #12  <Field azh a>
	// 7376 13762:getfield        #438 <Field int azh.R>
	// 7377 13765:ixor            
	// 7378 13766:putfield        #438 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7379 13769:aload_0         
	// 7380 13770:getfield        #12  <Field azh a>
	// 7381 13773:astore_1        
		abyte0.aU = ((azh) (abyte0)).R & a.az;
	// 7382 13774:aload_1         
	// 7383 13775:aload_1         
	// 7384 13776:getfield        #438 <Field int azh.R>
	// 7385 13779:aload_0         
	// 7386 13780:getfield        #12  <Field azh a>
	// 7387 13783:getfield        #104 <Field int azh.az>
	// 7388 13786:iand            
	// 7389 13787:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7390 13790:aload_0         
	// 7391 13791:getfield        #12  <Field azh a>
	// 7392 13794:astore_1        
		abyte0.aU = ((azh) (abyte0)).B | a.aU;
	// 7393 13795:aload_1         
	// 7394 13796:aload_1         
	// 7395 13797:getfield        #229 <Field int azh.B>
	// 7396 13800:aload_0         
	// 7397 13801:getfield        #12  <Field azh a>
	// 7398 13804:getfield        #206 <Field int azh.aU>
	// 7399 13807:ior             
	// 7400 13808:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7401 13811:aload_0         
	// 7402 13812:getfield        #12  <Field azh a>
	// 7403 13815:astore_1        
		abyte0.aL = ((azh) (abyte0)).R & a.az;
	// 7404 13816:aload_1         
	// 7405 13817:aload_1         
	// 7406 13818:getfield        #438 <Field int azh.R>
	// 7407 13821:aload_0         
	// 7408 13822:getfield        #12  <Field azh a>
	// 7409 13825:getfield        #104 <Field int azh.az>
	// 7410 13828:iand            
	// 7411 13829:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7412 13832:aload_0         
	// 7413 13833:getfield        #12  <Field azh a>
	// 7414 13836:astore_1        
		abyte0.aL = ((azh) (abyte0)).aJ ^ a.aL;
	// 7415 13837:aload_1         
	// 7416 13838:aload_1         
	// 7417 13839:getfield        #65  <Field int azh.aJ>
	// 7418 13842:aload_0         
	// 7419 13843:getfield        #12  <Field azh a>
	// 7420 13846:getfield        #220 <Field int azh.aL>
	// 7421 13849:ixor            
	// 7422 13850:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7423 13853:aload_0         
	// 7424 13854:getfield        #12  <Field azh a>
	// 7425 13857:astore_1        
		abyte0.bG = ((azh) (abyte0)).R & ~a.bp;
	// 7426 13858:aload_1         
	// 7427 13859:aload_1         
	// 7428 13860:getfield        #438 <Field int azh.R>
	// 7429 13863:aload_0         
	// 7430 13864:getfield        #12  <Field azh a>
	// 7431 13867:getfield        #149 <Field int azh.bp>
	// 7432 13870:iconst_m1       
	// 7433 13871:ixor            
	// 7434 13872:iand            
	// 7435 13873:putfield        #122 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 7436 13876:aload_0         
	// 7437 13877:getfield        #12  <Field azh a>
	// 7438 13880:astore_1        
		abyte0.bG = ((azh) (abyte0)).bG & ~a.B;
	// 7439 13881:aload_1         
	// 7440 13882:aload_1         
	// 7441 13883:getfield        #122 <Field int azh.bG>
	// 7442 13886:aload_0         
	// 7443 13887:getfield        #12  <Field azh a>
	// 7444 13890:getfield        #229 <Field int azh.B>
	// 7445 13893:iconst_m1       
	// 7446 13894:ixor            
	// 7447 13895:iand            
	// 7448 13896:putfield        #122 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 7449 13899:aload_0         
	// 7450 13900:getfield        #12  <Field azh a>
	// 7451 13903:astore_1        
		abyte0.bm = ((azh) (abyte0)).R & a.f;
	// 7452 13904:aload_1         
	// 7453 13905:aload_1         
	// 7454 13906:getfield        #438 <Field int azh.R>
	// 7455 13909:aload_0         
	// 7456 13910:getfield        #12  <Field azh a>
	// 7457 13913:getfield        #164 <Field int azh.f>
	// 7458 13916:iand            
	// 7459 13917:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7460 13920:aload_0         
	// 7461 13921:getfield        #12  <Field azh a>
	// 7462 13924:astore_1        
		abyte0.bm = ((azh) (abyte0)).Z ^ a.bm;
	// 7463 13925:aload_1         
	// 7464 13926:aload_1         
	// 7465 13927:getfield        #62  <Field int azh.Z>
	// 7466 13930:aload_0         
	// 7467 13931:getfield        #12  <Field azh a>
	// 7468 13934:getfield        #256 <Field int azh.bm>
	// 7469 13937:ixor            
	// 7470 13938:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7471 13941:aload_0         
	// 7472 13942:getfield        #12  <Field azh a>
	// 7473 13945:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.B;
	// 7474 13946:aload_1         
	// 7475 13947:aload_1         
	// 7476 13948:getfield        #256 <Field int azh.bm>
	// 7477 13951:aload_0         
	// 7478 13952:getfield        #12  <Field azh a>
	// 7479 13955:getfield        #229 <Field int azh.B>
	// 7480 13958:iconst_m1       
	// 7481 13959:ixor            
	// 7482 13960:iand            
	// 7483 13961:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7484 13964:aload_0         
	// 7485 13965:getfield        #12  <Field azh a>
	// 7486 13968:astore_1        
		abyte0.ao = ((azh) (abyte0)).R & ~a.au;
	// 7487 13969:aload_1         
	// 7488 13970:aload_1         
	// 7489 13971:getfield        #438 <Field int azh.R>
	// 7490 13974:aload_0         
	// 7491 13975:getfield        #12  <Field azh a>
	// 7492 13978:getfield        #146 <Field int azh.au>
	// 7493 13981:iconst_m1       
	// 7494 13982:ixor            
	// 7495 13983:iand            
	// 7496 13984:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7497 13987:aload_0         
	// 7498 13988:getfield        #12  <Field azh a>
	// 7499 13991:astore_1        
		abyte0.ao = ((azh) (abyte0)).f ^ a.ao;
	// 7500 13992:aload_1         
	// 7501 13993:aload_1         
	// 7502 13994:getfield        #164 <Field int azh.f>
	// 7503 13997:aload_0         
	// 7504 13998:getfield        #12  <Field azh a>
	// 7505 14001:getfield        #253 <Field int azh.ao>
	// 7506 14004:ixor            
	// 7507 14005:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7508 14008:aload_0         
	// 7509 14009:getfield        #12  <Field azh a>
	// 7510 14012:astore_1        
		abyte0.aW = ((azh) (abyte0)).R & a.bJ;
	// 7511 14013:aload_1         
	// 7512 14014:aload_1         
	// 7513 14015:getfield        #438 <Field int azh.R>
	// 7514 14018:aload_0         
	// 7515 14019:getfield        #12  <Field azh a>
	// 7516 14022:getfield        #119 <Field int azh.bJ>
	// 7517 14025:iand            
	// 7518 14026:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7519 14029:aload_0         
	// 7520 14030:getfield        #12  <Field azh a>
	// 7521 14033:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & ~a.B;
	// 7522 14034:aload_1         
	// 7523 14035:aload_1         
	// 7524 14036:getfield        #345 <Field int azh.aW>
	// 7525 14039:aload_0         
	// 7526 14040:getfield        #12  <Field azh a>
	// 7527 14043:getfield        #229 <Field int azh.B>
	// 7528 14046:iconst_m1       
	// 7529 14047:ixor            
	// 7530 14048:iand            
	// 7531 14049:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7532 14052:aload_0         
	// 7533 14053:getfield        #12  <Field azh a>
	// 7534 14056:astore_1        
		abyte0.aW = ((azh) (abyte0)).aL ^ a.aW;
	// 7535 14057:aload_1         
	// 7536 14058:aload_1         
	// 7537 14059:getfield        #220 <Field int azh.aL>
	// 7538 14062:aload_0         
	// 7539 14063:getfield        #12  <Field azh a>
	// 7540 14066:getfield        #345 <Field int azh.aW>
	// 7541 14069:ixor            
	// 7542 14070:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7543 14073:aload_0         
	// 7544 14074:getfield        #12  <Field azh a>
	// 7545 14077:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW | a.J;
	// 7546 14078:aload_1         
	// 7547 14079:aload_1         
	// 7548 14080:getfield        #345 <Field int azh.aW>
	// 7549 14083:aload_0         
	// 7550 14084:getfield        #12  <Field azh a>
	// 7551 14087:getfield        #176 <Field int azh.J>
	// 7552 14090:ior             
	// 7553 14091:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7554 14094:aload_0         
	// 7555 14095:getfield        #12  <Field azh a>
	// 7556 14098:astore_1        
		abyte0.aL = ((azh) (abyte0)).R & a.bJ;
	// 7557 14099:aload_1         
	// 7558 14100:aload_1         
	// 7559 14101:getfield        #438 <Field int azh.R>
	// 7560 14104:aload_0         
	// 7561 14105:getfield        #12  <Field azh a>
	// 7562 14108:getfield        #119 <Field int azh.bJ>
	// 7563 14111:iand            
	// 7564 14112:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7565 14115:aload_0         
	// 7566 14116:getfield        #12  <Field azh a>
	// 7567 14119:astore_1        
		abyte0.aL = ((azh) (abyte0)).aJ ^ a.aL;
	// 7568 14120:aload_1         
	// 7569 14121:aload_1         
	// 7570 14122:getfield        #65  <Field int azh.aJ>
	// 7571 14125:aload_0         
	// 7572 14126:getfield        #12  <Field azh a>
	// 7573 14129:getfield        #220 <Field int azh.aL>
	// 7574 14132:ixor            
	// 7575 14133:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7576 14136:aload_0         
	// 7577 14137:getfield        #12  <Field azh a>
	// 7578 14140:astore_1        
		abyte0.aL = ((azh) (abyte0)).B & ~a.aL;
	// 7579 14141:aload_1         
	// 7580 14142:aload_1         
	// 7581 14143:getfield        #229 <Field int azh.B>
	// 7582 14146:aload_0         
	// 7583 14147:getfield        #12  <Field azh a>
	// 7584 14150:getfield        #220 <Field int azh.aL>
	// 7585 14153:iconst_m1       
	// 7586 14154:ixor            
	// 7587 14155:iand            
	// 7588 14156:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 7589 14159:aload_0         
	// 7590 14160:getfield        #12  <Field azh a>
	// 7591 14163:astore_1        
		abyte0.au = ((azh) (abyte0)).R & ~a.au;
	// 7592 14164:aload_1         
	// 7593 14165:aload_1         
	// 7594 14166:getfield        #438 <Field int azh.R>
	// 7595 14169:aload_0         
	// 7596 14170:getfield        #12  <Field azh a>
	// 7597 14173:getfield        #146 <Field int azh.au>
	// 7598 14176:iconst_m1       
	// 7599 14177:ixor            
	// 7600 14178:iand            
	// 7601 14179:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7602 14182:aload_0         
	// 7603 14183:getfield        #12  <Field azh a>
	// 7604 14186:astore_1        
		abyte0.au = ((azh) (abyte0)).az ^ a.au;
	// 7605 14187:aload_1         
	// 7606 14188:aload_1         
	// 7607 14189:getfield        #104 <Field int azh.az>
	// 7608 14192:aload_0         
	// 7609 14193:getfield        #12  <Field azh a>
	// 7610 14196:getfield        #146 <Field int azh.au>
	// 7611 14199:ixor            
	// 7612 14200:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7613 14203:aload_0         
	// 7614 14204:getfield        #12  <Field azh a>
	// 7615 14207:astore_1        
		abyte0.aS = ((azh) (abyte0)).R & ~a.bJ;
	// 7616 14208:aload_1         
	// 7617 14209:aload_1         
	// 7618 14210:getfield        #438 <Field int azh.R>
	// 7619 14213:aload_0         
	// 7620 14214:getfield        #12  <Field azh a>
	// 7621 14217:getfield        #119 <Field int azh.bJ>
	// 7622 14220:iconst_m1       
	// 7623 14221:ixor            
	// 7624 14222:iand            
	// 7625 14223:putfield        #414 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 7626 14226:aload_0         
	// 7627 14227:getfield        #12  <Field azh a>
	// 7628 14230:astore_1        
		abyte0.aX = ((azh) (abyte0)).R & ~a.aX;
	// 7629 14231:aload_1         
	// 7630 14232:aload_1         
	// 7631 14233:getfield        #438 <Field int azh.R>
	// 7632 14236:aload_0         
	// 7633 14237:getfield        #12  <Field azh a>
	// 7634 14240:getfield        #44  <Field int azh.aX>
	// 7635 14243:iconst_m1       
	// 7636 14244:ixor            
	// 7637 14245:iand            
	// 7638 14246:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7639 14249:aload_0         
	// 7640 14250:getfield        #12  <Field azh a>
	// 7641 14253:astore_1        
		abyte0.aX = ((azh) (abyte0)).f ^ a.aX;
	// 7642 14254:aload_1         
	// 7643 14255:aload_1         
	// 7644 14256:getfield        #164 <Field int azh.f>
	// 7645 14259:aload_0         
	// 7646 14260:getfield        #12  <Field azh a>
	// 7647 14263:getfield        #44  <Field int azh.aX>
	// 7648 14266:ixor            
	// 7649 14267:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7650 14270:aload_0         
	// 7651 14271:getfield        #12  <Field azh a>
	// 7652 14274:astore_1        
		abyte0.aX = ((azh) (abyte0)).B | a.aX;
	// 7653 14275:aload_1         
	// 7654 14276:aload_1         
	// 7655 14277:getfield        #229 <Field int azh.B>
	// 7656 14280:aload_0         
	// 7657 14281:getfield        #12  <Field azh a>
	// 7658 14284:getfield        #44  <Field int azh.aX>
	// 7659 14287:ior             
	// 7660 14288:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7661 14291:aload_0         
	// 7662 14292:getfield        #12  <Field azh a>
	// 7663 14295:astore_1        
		abyte0.aX = ((azh) (abyte0)).Z ^ a.aX;
	// 7664 14296:aload_1         
	// 7665 14297:aload_1         
	// 7666 14298:getfield        #62  <Field int azh.Z>
	// 7667 14301:aload_0         
	// 7668 14302:getfield        #12  <Field azh a>
	// 7669 14305:getfield        #44  <Field int azh.aX>
	// 7670 14308:ixor            
	// 7671 14309:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7672 14312:aload_0         
	// 7673 14313:getfield        #12  <Field azh a>
	// 7674 14316:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.J;
	// 7675 14317:aload_1         
	// 7676 14318:aload_1         
	// 7677 14319:getfield        #44  <Field int azh.aX>
	// 7678 14322:aload_0         
	// 7679 14323:getfield        #12  <Field azh a>
	// 7680 14326:getfield        #176 <Field int azh.J>
	// 7681 14329:iconst_m1       
	// 7682 14330:ixor            
	// 7683 14331:iand            
	// 7684 14332:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7685 14335:aload_0         
	// 7686 14336:getfield        #12  <Field azh a>
	// 7687 14339:astore_1        
		abyte0.aD = ((azh) (abyte0)).R & a.f;
	// 7688 14340:aload_1         
	// 7689 14341:aload_1         
	// 7690 14342:getfield        #438 <Field int azh.R>
	// 7691 14345:aload_0         
	// 7692 14346:getfield        #12  <Field azh a>
	// 7693 14349:getfield        #164 <Field int azh.f>
	// 7694 14352:iand            
	// 7695 14353:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7696 14356:aload_0         
	// 7697 14357:getfield        #12  <Field azh a>
	// 7698 14360:astore_1        
		abyte0.aD = ((azh) (abyte0)).bp ^ a.aD;
	// 7699 14361:aload_1         
	// 7700 14362:aload_1         
	// 7701 14363:getfield        #149 <Field int azh.bp>
	// 7702 14366:aload_0         
	// 7703 14367:getfield        #12  <Field azh a>
	// 7704 14370:getfield        #92  <Field int azh.aD>
	// 7705 14373:ixor            
	// 7706 14374:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7707 14377:aload_0         
	// 7708 14378:getfield        #12  <Field azh a>
	// 7709 14381:astore_1        
		abyte0.aI = ((azh) (abyte0)).B & ~a.aD;
	// 7710 14382:aload_1         
	// 7711 14383:aload_1         
	// 7712 14384:getfield        #229 <Field int azh.B>
	// 7713 14387:aload_0         
	// 7714 14388:getfield        #12  <Field azh a>
	// 7715 14391:getfield        #92  <Field int azh.aD>
	// 7716 14394:iconst_m1       
	// 7717 14395:ixor            
	// 7718 14396:iand            
	// 7719 14397:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7720 14400:aload_0         
	// 7721 14401:getfield        #12  <Field azh a>
	// 7722 14404:astore_1        
		abyte0.aD = ((azh) (abyte0)).B & a.aD;
	// 7723 14405:aload_1         
	// 7724 14406:aload_1         
	// 7725 14407:getfield        #229 <Field int azh.B>
	// 7726 14410:aload_0         
	// 7727 14411:getfield        #12  <Field azh a>
	// 7728 14414:getfield        #92  <Field int azh.aD>
	// 7729 14417:iand            
	// 7730 14418:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7731 14421:aload_0         
	// 7732 14422:getfield        #12  <Field azh a>
	// 7733 14425:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aJ ^ a.R;
	// 7734 14426:aload_1         
	// 7735 14427:aload_1         
	// 7736 14428:getfield        #65  <Field int azh.aJ>
	// 7737 14431:aload_0         
	// 7738 14432:getfield        #12  <Field azh a>
	// 7739 14435:getfield        #438 <Field int azh.R>
	// 7740 14438:ixor            
	// 7741 14439:putfield        #65  <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 7742 14442:aload_0         
	// 7743 14443:getfield        #12  <Field azh a>
	// 7744 14446:astore_1        
		abyte0.aD = ((azh) (abyte0)).aJ ^ a.aD;
	// 7745 14447:aload_1         
	// 7746 14448:aload_1         
	// 7747 14449:getfield        #65  <Field int azh.aJ>
	// 7748 14452:aload_0         
	// 7749 14453:getfield        #12  <Field azh a>
	// 7750 14456:getfield        #92  <Field int azh.aD>
	// 7751 14459:ixor            
	// 7752 14460:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 7753 14463:aload_0         
	// 7754 14464:getfield        #12  <Field azh a>
	// 7755 14467:astore_1        
		abyte0.aC = ((azh) (abyte0)).aJ & ~a.B;
	// 7756 14468:aload_1         
	// 7757 14469:aload_1         
	// 7758 14470:getfield        #65  <Field int azh.aJ>
	// 7759 14473:aload_0         
	// 7760 14474:getfield        #12  <Field azh a>
	// 7761 14477:getfield        #229 <Field int azh.B>
	// 7762 14480:iconst_m1       
	// 7763 14481:ixor            
	// 7764 14482:iand            
	// 7765 14483:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 7766 14486:aload_0         
	// 7767 14487:getfield        #12  <Field azh a>
	// 7768 14490:astore_1        
		abyte0.be = ((azh) (abyte0)).B | a.aJ;
	// 7769 14491:aload_1         
	// 7770 14492:aload_1         
	// 7771 14493:getfield        #229 <Field int azh.B>
	// 7772 14496:aload_0         
	// 7773 14497:getfield        #12  <Field azh a>
	// 7774 14500:getfield        #65  <Field int azh.aJ>
	// 7775 14503:ior             
	// 7776 14504:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 7777 14507:aload_0         
	// 7778 14508:getfield        #12  <Field azh a>
	// 7779 14511:astore_1        
		abyte0.be = ((azh) (abyte0)).ao ^ a.be;
	// 7780 14512:aload_1         
	// 7781 14513:aload_1         
	// 7782 14514:getfield        #253 <Field int azh.ao>
	// 7783 14517:aload_0         
	// 7784 14518:getfield        #12  <Field azh a>
	// 7785 14521:getfield        #155 <Field int azh.be>
	// 7786 14524:ixor            
	// 7787 14525:putfield        #155 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 7788 14528:aload_0         
	// 7789 14529:getfield        #12  <Field azh a>
	// 7790 14532:astore_1        
		abyte0.ao = ((azh) (abyte0)).R & a.bp;
	// 7791 14533:aload_1         
	// 7792 14534:aload_1         
	// 7793 14535:getfield        #438 <Field int azh.R>
	// 7794 14538:aload_0         
	// 7795 14539:getfield        #12  <Field azh a>
	// 7796 14542:getfield        #149 <Field int azh.bp>
	// 7797 14545:iand            
	// 7798 14546:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7799 14549:aload_0         
	// 7800 14550:getfield        #12  <Field azh a>
	// 7801 14553:astore_1        
		abyte0.cg = ((azh) (abyte0)).ao & ~a.B;
	// 7802 14554:aload_1         
	// 7803 14555:aload_1         
	// 7804 14556:getfield        #253 <Field int azh.ao>
	// 7805 14559:aload_0         
	// 7806 14560:getfield        #12  <Field azh a>
	// 7807 14563:getfield        #229 <Field int azh.B>
	// 7808 14566:iconst_m1       
	// 7809 14567:ixor            
	// 7810 14568:iand            
	// 7811 14569:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7812 14572:aload_0         
	// 7813 14573:getfield        #12  <Field azh a>
	// 7814 14576:astore_1        
		abyte0.cg = ((azh) (abyte0)).aS ^ a.cg;
	// 7815 14577:aload_1         
	// 7816 14578:aload_1         
	// 7817 14579:getfield        #414 <Field int azh.aS>
	// 7818 14582:aload_0         
	// 7819 14583:getfield        #12  <Field azh a>
	// 7820 14586:getfield        #432 <Field int azh.cg>
	// 7821 14589:ixor            
	// 7822 14590:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7823 14593:aload_0         
	// 7824 14594:getfield        #12  <Field azh a>
	// 7825 14597:astore_1        
		abyte0.cg = ((azh) (abyte0)).ah | a.cg;
	// 7826 14598:aload_1         
	// 7827 14599:aload_1         
	// 7828 14600:getfield        #113 <Field int azh.ah>
	// 7829 14603:aload_0         
	// 7830 14604:getfield        #12  <Field azh a>
	// 7831 14607:getfield        #432 <Field int azh.cg>
	// 7832 14610:ior             
	// 7833 14611:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7834 14614:aload_0         
	// 7835 14615:getfield        #12  <Field azh a>
	// 7836 14618:astore_1        
		abyte0.ao = ((azh) (abyte0)).ao & ~a.B;
	// 7837 14619:aload_1         
	// 7838 14620:aload_1         
	// 7839 14621:getfield        #253 <Field int azh.ao>
	// 7840 14624:aload_0         
	// 7841 14625:getfield        #12  <Field azh a>
	// 7842 14628:getfield        #229 <Field int azh.B>
	// 7843 14631:iconst_m1       
	// 7844 14632:ixor            
	// 7845 14633:iand            
	// 7846 14634:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7847 14637:aload_0         
	// 7848 14638:getfield        #12  <Field azh a>
	// 7849 14641:astore_1        
		abyte0.ao = ((azh) (abyte0)).Z ^ a.ao;
	// 7850 14642:aload_1         
	// 7851 14643:aload_1         
	// 7852 14644:getfield        #62  <Field int azh.Z>
	// 7853 14647:aload_0         
	// 7854 14648:getfield        #12  <Field azh a>
	// 7855 14651:getfield        #253 <Field int azh.ao>
	// 7856 14654:ixor            
	// 7857 14655:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7858 14658:aload_0         
	// 7859 14659:getfield        #12  <Field azh a>
	// 7860 14662:astore_1        
		abyte0.ao = ((azh) (abyte0)).ao & ~a.J;
	// 7861 14663:aload_1         
	// 7862 14664:aload_1         
	// 7863 14665:getfield        #253 <Field int azh.ao>
	// 7864 14668:aload_0         
	// 7865 14669:getfield        #12  <Field azh a>
	// 7866 14672:getfield        #176 <Field int azh.J>
	// 7867 14675:iconst_m1       
	// 7868 14676:ixor            
	// 7869 14677:iand            
	// 7870 14678:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7871 14681:aload_0         
	// 7872 14682:getfield        #12  <Field azh a>
	// 7873 14685:astore_1        
		abyte0.bp = ((azh) (abyte0)).R & a.bp;
	// 7874 14686:aload_1         
	// 7875 14687:aload_1         
	// 7876 14688:getfield        #438 <Field int azh.R>
	// 7877 14691:aload_0         
	// 7878 14692:getfield        #12  <Field azh a>
	// 7879 14695:getfield        #149 <Field int azh.bp>
	// 7880 14698:iand            
	// 7881 14699:putfield        #149 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 7882 14702:aload_0         
	// 7883 14703:getfield        #12  <Field azh a>
	// 7884 14706:astore_1        
		abyte0.bp = ((azh) (abyte0)).az ^ a.bp;
	// 7885 14707:aload_1         
	// 7886 14708:aload_1         
	// 7887 14709:getfield        #104 <Field int azh.az>
	// 7888 14712:aload_0         
	// 7889 14713:getfield        #12  <Field azh a>
	// 7890 14716:getfield        #149 <Field int azh.bp>
	// 7891 14719:ixor            
	// 7892 14720:putfield        #149 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 7893 14723:aload_0         
	// 7894 14724:getfield        #12  <Field azh a>
	// 7895 14727:astore_1        
		abyte0.az = ((azh) (abyte0)).bp & ~a.B;
	// 7896 14728:aload_1         
	// 7897 14729:aload_1         
	// 7898 14730:getfield        #149 <Field int azh.bp>
	// 7899 14733:aload_0         
	// 7900 14734:getfield        #12  <Field azh a>
	// 7901 14737:getfield        #229 <Field int azh.B>
	// 7902 14740:iconst_m1       
	// 7903 14741:ixor            
	// 7904 14742:iand            
	// 7905 14743:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7906 14746:aload_0         
	// 7907 14747:getfield        #12  <Field azh a>
	// 7908 14750:astore_1        
		abyte0.az = ((azh) (abyte0)).aJ ^ a.az;
	// 7909 14751:aload_1         
	// 7910 14752:aload_1         
	// 7911 14753:getfield        #65  <Field int azh.aJ>
	// 7912 14756:aload_0         
	// 7913 14757:getfield        #12  <Field azh a>
	// 7914 14760:getfield        #104 <Field int azh.az>
	// 7915 14763:ixor            
	// 7916 14764:putfield        #104 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7917 14767:aload_0         
	// 7918 14768:getfield        #12  <Field azh a>
	// 7919 14771:astore_1        
		abyte0.ao = ((azh) (abyte0)).az ^ a.ao;
	// 7920 14772:aload_1         
	// 7921 14773:aload_1         
	// 7922 14774:getfield        #104 <Field int azh.az>
	// 7923 14777:aload_0         
	// 7924 14778:getfield        #12  <Field azh a>
	// 7925 14781:getfield        #253 <Field int azh.ao>
	// 7926 14784:ixor            
	// 7927 14785:putfield        #253 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7928 14788:aload_0         
	// 7929 14789:getfield        #12  <Field azh a>
	// 7930 14792:astore_1        
		abyte0.aU = ((azh) (abyte0)).bp ^ a.aU;
	// 7931 14793:aload_1         
	// 7932 14794:aload_1         
	// 7933 14795:getfield        #149 <Field int azh.bp>
	// 7934 14798:aload_0         
	// 7935 14799:getfield        #12  <Field azh a>
	// 7936 14802:getfield        #206 <Field int azh.aU>
	// 7937 14805:ixor            
	// 7938 14806:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7939 14809:aload_0         
	// 7940 14810:getfield        #12  <Field azh a>
	// 7941 14813:astore_1        
		abyte0.aW = ((azh) (abyte0)).aU ^ a.aW;
	// 7942 14814:aload_1         
	// 7943 14815:aload_1         
	// 7944 14816:getfield        #206 <Field int azh.aU>
	// 7945 14819:aload_0         
	// 7946 14820:getfield        #12  <Field azh a>
	// 7947 14823:getfield        #345 <Field int azh.aW>
	// 7948 14826:ixor            
	// 7949 14827:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7950 14830:aload_0         
	// 7951 14831:getfield        #12  <Field azh a>
	// 7952 14834:astore_1        
		abyte0.cg = ((azh) (abyte0)).aW ^ a.cg;
	// 7953 14835:aload_1         
	// 7954 14836:aload_1         
	// 7955 14837:getfield        #345 <Field int azh.aW>
	// 7956 14840:aload_0         
	// 7957 14841:getfield        #12  <Field azh a>
	// 7958 14844:getfield        #432 <Field int azh.cg>
	// 7959 14847:ixor            
	// 7960 14848:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7961 14851:aload_0         
	// 7962 14852:getfield        #12  <Field azh a>
	// 7963 14855:astore_1        
		abyte0.u = ((azh) (abyte0)).cg ^ a.u;
	// 7964 14856:aload_1         
	// 7965 14857:aload_1         
	// 7966 14858:getfield        #432 <Field int azh.cg>
	// 7967 14861:aload_0         
	// 7968 14862:getfield        #12  <Field azh a>
	// 7969 14865:getfield        #441 <Field int azh.u>
	// 7970 14868:ixor            
	// 7971 14869:putfield        #441 <Field int azh.u>
		abyte0 = ((byte []) (a));
	// 7972 14872:aload_0         
	// 7973 14873:getfield        #12  <Field azh a>
	// 7974 14876:astore_1        
		abyte0.cg = ((azh) (abyte0)).K & ~a.u;
	// 7975 14877:aload_1         
	// 7976 14878:aload_1         
	// 7977 14879:getfield        #161 <Field int azh.K>
	// 7978 14882:aload_0         
	// 7979 14883:getfield        #12  <Field azh a>
	// 7980 14886:getfield        #441 <Field int azh.u>
	// 7981 14889:iconst_m1       
	// 7982 14890:ixor            
	// 7983 14891:iand            
	// 7984 14892:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7985 14895:aload_0         
	// 7986 14896:getfield        #12  <Field azh a>
	// 7987 14899:astore_1        
		abyte0.aW = ((azh) (abyte0)).K & a.u;
	// 7988 14900:aload_1         
	// 7989 14901:aload_1         
	// 7990 14902:getfield        #161 <Field int azh.K>
	// 7991 14905:aload_0         
	// 7992 14906:getfield        #12  <Field azh a>
	// 7993 14909:getfield        #441 <Field int azh.u>
	// 7994 14912:iand            
	// 7995 14913:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 7996 14916:aload_0         
	// 7997 14917:getfield        #12  <Field azh a>
	// 7998 14920:astore_1        
		abyte0.aU = ((azh) (abyte0)).K & ~a.u;
	// 7999 14921:aload_1         
	// 8000 14922:aload_1         
	// 8001 14923:getfield        #161 <Field int azh.K>
	// 8002 14926:aload_0         
	// 8003 14927:getfield        #12  <Field azh a>
	// 8004 14930:getfield        #441 <Field int azh.u>
	// 8005 14933:iconst_m1       
	// 8006 14934:ixor            
	// 8007 14935:iand            
	// 8008 14936:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 8009 14939:aload_0         
	// 8010 14940:getfield        #12  <Field azh a>
	// 8011 14943:astore_1        
		abyte0.aL = ((azh) (abyte0)).bp ^ a.aL;
	// 8012 14944:aload_1         
	// 8013 14945:aload_1         
	// 8014 14946:getfield        #149 <Field int azh.bp>
	// 8015 14949:aload_0         
	// 8016 14950:getfield        #12  <Field azh a>
	// 8017 14953:getfield        #220 <Field int azh.aL>
	// 8018 14956:ixor            
	// 8019 14957:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8020 14960:aload_0         
	// 8021 14961:getfield        #12  <Field azh a>
	// 8022 14964:astore_1        
		abyte0.aL = ((azh) (abyte0)).J | a.aL;
	// 8023 14965:aload_1         
	// 8024 14966:aload_1         
	// 8025 14967:getfield        #176 <Field int azh.J>
	// 8026 14970:aload_0         
	// 8027 14971:getfield        #12  <Field azh a>
	// 8028 14974:getfield        #220 <Field int azh.aL>
	// 8029 14977:ior             
	// 8030 14978:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8031 14981:aload_0         
	// 8032 14982:getfield        #12  <Field azh a>
	// 8033 14985:astore_1        
		abyte0.aL = ((azh) (abyte0)).aD ^ a.aL;
	// 8034 14986:aload_1         
	// 8035 14987:aload_1         
	// 8036 14988:getfield        #92  <Field int azh.aD>
	// 8037 14991:aload_0         
	// 8038 14992:getfield        #12  <Field azh a>
	// 8039 14995:getfield        #220 <Field int azh.aL>
	// 8040 14998:ixor            
	// 8041 14999:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8042 15002:aload_0         
	// 8043 15003:getfield        #12  <Field azh a>
	// 8044 15006:astore_1        
		abyte0.aD = ((azh) (abyte0)).R & a.Z;
	// 8045 15007:aload_1         
	// 8046 15008:aload_1         
	// 8047 15009:getfield        #438 <Field int azh.R>
	// 8048 15012:aload_0         
	// 8049 15013:getfield        #12  <Field azh a>
	// 8050 15016:getfield        #62  <Field int azh.Z>
	// 8051 15019:iand            
	// 8052 15020:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 8053 15023:aload_0         
	// 8054 15024:getfield        #12  <Field azh a>
	// 8055 15027:astore_1        
		abyte0.aD = ((azh) (abyte0)).f ^ a.aD;
	// 8056 15028:aload_1         
	// 8057 15029:aload_1         
	// 8058 15030:getfield        #164 <Field int azh.f>
	// 8059 15033:aload_0         
	// 8060 15034:getfield        #12  <Field azh a>
	// 8061 15037:getfield        #92  <Field int azh.aD>
	// 8062 15040:ixor            
	// 8063 15041:putfield        #92  <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 8064 15044:aload_0         
	// 8065 15045:getfield        #12  <Field azh a>
	// 8066 15048:astore_1        
		abyte0.bg = ((azh) (abyte0)).aD ^ a.bg;
	// 8067 15049:aload_1         
	// 8068 15050:aload_1         
	// 8069 15051:getfield        #92  <Field int azh.aD>
	// 8070 15054:aload_0         
	// 8071 15055:getfield        #12  <Field azh a>
	// 8072 15058:getfield        #226 <Field int azh.bg>
	// 8073 15061:ixor            
	// 8074 15062:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8075 15065:aload_0         
	// 8076 15066:getfield        #12  <Field azh a>
	// 8077 15069:astore_1        
		abyte0.aX = ((azh) (abyte0)).bg ^ a.aX;
	// 8078 15070:aload_1         
	// 8079 15071:aload_1         
	// 8080 15072:getfield        #226 <Field int azh.bg>
	// 8081 15075:aload_0         
	// 8082 15076:getfield        #12  <Field azh a>
	// 8083 15079:getfield        #44  <Field int azh.aX>
	// 8084 15082:ixor            
	// 8085 15083:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8086 15086:aload_0         
	// 8087 15087:getfield        #12  <Field azh a>
	// 8088 15090:astore_1        
		abyte0.bg = ((azh) (abyte0)).bJ ^ a.R;
	// 8089 15091:aload_1         
	// 8090 15092:aload_1         
	// 8091 15093:getfield        #119 <Field int azh.bJ>
	// 8092 15096:aload_0         
	// 8093 15097:getfield        #12  <Field azh a>
	// 8094 15100:getfield        #438 <Field int azh.R>
	// 8095 15103:ixor            
	// 8096 15104:putfield        #226 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8097 15107:aload_0         
	// 8098 15108:getfield        #12  <Field azh a>
	// 8099 15111:astore_1        
		abyte0.aI = ((azh) (abyte0)).bg ^ a.aI;
	// 8100 15112:aload_1         
	// 8101 15113:aload_1         
	// 8102 15114:getfield        #226 <Field int azh.bg>
	// 8103 15117:aload_0         
	// 8104 15118:getfield        #12  <Field azh a>
	// 8105 15121:getfield        #235 <Field int azh.aI>
	// 8106 15124:ixor            
	// 8107 15125:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 8108 15128:aload_0         
	// 8109 15129:getfield        #12  <Field azh a>
	// 8110 15132:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI & ~a.J;
	// 8111 15133:aload_1         
	// 8112 15134:aload_1         
	// 8113 15135:getfield        #235 <Field int azh.aI>
	// 8114 15138:aload_0         
	// 8115 15139:getfield        #12  <Field azh a>
	// 8116 15142:getfield        #176 <Field int azh.J>
	// 8117 15145:iconst_m1       
	// 8118 15146:ixor            
	// 8119 15147:iand            
	// 8120 15148:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 8121 15151:aload_0         
	// 8122 15152:getfield        #12  <Field azh a>
	// 8123 15155:astore_1        
		abyte0.aI = ((azh) (abyte0)).bG ^ a.aI;
	// 8124 15156:aload_1         
	// 8125 15157:aload_1         
	// 8126 15158:getfield        #122 <Field int azh.bG>
	// 8127 15161:aload_0         
	// 8128 15162:getfield        #12  <Field azh a>
	// 8129 15165:getfield        #235 <Field int azh.aI>
	// 8130 15168:ixor            
	// 8131 15169:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 8132 15172:aload_0         
	// 8133 15173:getfield        #12  <Field azh a>
	// 8134 15176:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI | a.ah;
	// 8135 15177:aload_1         
	// 8136 15178:aload_1         
	// 8137 15179:getfield        #235 <Field int azh.aI>
	// 8138 15182:aload_0         
	// 8139 15183:getfield        #12  <Field azh a>
	// 8140 15186:getfield        #113 <Field int azh.ah>
	// 8141 15189:ior             
	// 8142 15190:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 8143 15193:aload_0         
	// 8144 15194:getfield        #12  <Field azh a>
	// 8145 15197:astore_1        
		abyte0.aI = ((azh) (abyte0)).ao ^ a.aI;
	// 8146 15198:aload_1         
	// 8147 15199:aload_1         
	// 8148 15200:getfield        #253 <Field int azh.ao>
	// 8149 15203:aload_0         
	// 8150 15204:getfield        #12  <Field azh a>
	// 8151 15207:getfield        #235 <Field int azh.aI>
	// 8152 15210:ixor            
	// 8153 15211:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 8154 15214:aload_0         
	// 8155 15215:getfield        #12  <Field azh a>
	// 8156 15218:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI ^ a.ae;
	// 8157 15219:aload_1         
	// 8158 15220:aload_1         
	// 8159 15221:getfield        #235 <Field int azh.aI>
	// 8160 15224:aload_0         
	// 8161 15225:getfield        #12  <Field azh a>
	// 8162 15228:getfield        #288 <Field int azh.ae>
	// 8163 15231:ixor            
	// 8164 15232:putfield        #235 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 8165 15235:aload_0         
	// 8166 15236:getfield        #12  <Field azh a>
	// 8167 15239:astore_1        
		abyte0.bm = ((azh) (abyte0)).bg ^ a.bm;
	// 8168 15240:aload_1         
	// 8169 15241:aload_1         
	// 8170 15242:getfield        #226 <Field int azh.bg>
	// 8171 15245:aload_0         
	// 8172 15246:getfield        #12  <Field azh a>
	// 8173 15249:getfield        #256 <Field int azh.bm>
	// 8174 15252:ixor            
	// 8175 15253:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8176 15256:aload_0         
	// 8177 15257:getfield        #12  <Field azh a>
	// 8178 15260:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm | a.J;
	// 8179 15261:aload_1         
	// 8180 15262:aload_1         
	// 8181 15263:getfield        #256 <Field int azh.bm>
	// 8182 15266:aload_0         
	// 8183 15267:getfield        #12  <Field azh a>
	// 8184 15270:getfield        #176 <Field int azh.J>
	// 8185 15273:ior             
	// 8186 15274:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8187 15277:aload_0         
	// 8188 15278:getfield        #12  <Field azh a>
	// 8189 15281:astore_1        
		abyte0.bm = ((azh) (abyte0)).be ^ a.bm;
	// 8190 15282:aload_1         
	// 8191 15283:aload_1         
	// 8192 15284:getfield        #155 <Field int azh.be>
	// 8193 15287:aload_0         
	// 8194 15288:getfield        #12  <Field azh a>
	// 8195 15291:getfield        #256 <Field int azh.bm>
	// 8196 15294:ixor            
	// 8197 15295:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8198 15298:aload_0         
	// 8199 15299:getfield        #12  <Field azh a>
	// 8200 15302:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.ah;
	// 8201 15303:aload_1         
	// 8202 15304:aload_1         
	// 8203 15305:getfield        #256 <Field int azh.bm>
	// 8204 15308:aload_0         
	// 8205 15309:getfield        #12  <Field azh a>
	// 8206 15312:getfield        #113 <Field int azh.ah>
	// 8207 15315:iconst_m1       
	// 8208 15316:ixor            
	// 8209 15317:iand            
	// 8210 15318:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8211 15321:aload_0         
	// 8212 15322:getfield        #12  <Field azh a>
	// 8213 15325:astore_1        
		abyte0.bm = ((azh) (abyte0)).aL ^ a.bm;
	// 8214 15326:aload_1         
	// 8215 15327:aload_1         
	// 8216 15328:getfield        #220 <Field int azh.aL>
	// 8217 15331:aload_0         
	// 8218 15332:getfield        #12  <Field azh a>
	// 8219 15335:getfield        #256 <Field int azh.bm>
	// 8220 15338:ixor            
	// 8221 15339:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8222 15342:aload_0         
	// 8223 15343:getfield        #12  <Field azh a>
	// 8224 15346:astore_1        
		abyte0.g = ((azh) (abyte0)).bm ^ a.g;
	// 8225 15347:aload_1         
	// 8226 15348:aload_1         
	// 8227 15349:getfield        #256 <Field int azh.bm>
	// 8228 15352:aload_0         
	// 8229 15353:getfield        #12  <Field azh a>
	// 8230 15356:getfield        #56  <Field int azh.g>
	// 8231 15359:ixor            
	// 8232 15360:putfield        #56  <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 8233 15363:aload_0         
	// 8234 15364:getfield        #12  <Field azh a>
	// 8235 15367:astore_1        
		abyte0.bm = ((azh) (abyte0)).R & ~a.f;
	// 8236 15368:aload_1         
	// 8237 15369:aload_1         
	// 8238 15370:getfield        #438 <Field int azh.R>
	// 8239 15373:aload_0         
	// 8240 15374:getfield        #12  <Field azh a>
	// 8241 15377:getfield        #164 <Field int azh.f>
	// 8242 15380:iconst_m1       
	// 8243 15381:ixor            
	// 8244 15382:iand            
	// 8245 15383:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8246 15386:aload_0         
	// 8247 15387:getfield        #12  <Field azh a>
	// 8248 15390:astore_1        
		abyte0.bm = ((azh) (abyte0)).bJ ^ a.bm;
	// 8249 15391:aload_1         
	// 8250 15392:aload_1         
	// 8251 15393:getfield        #119 <Field int azh.bJ>
	// 8252 15396:aload_0         
	// 8253 15397:getfield        #12  <Field azh a>
	// 8254 15400:getfield        #256 <Field int azh.bm>
	// 8255 15403:ixor            
	// 8256 15404:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8257 15407:aload_0         
	// 8258 15408:getfield        #12  <Field azh a>
	// 8259 15411:astore_1        
		abyte0.aC = ((azh) (abyte0)).bm ^ a.aC;
	// 8260 15412:aload_1         
	// 8261 15413:aload_1         
	// 8262 15414:getfield        #256 <Field int azh.bm>
	// 8263 15417:aload_0         
	// 8264 15418:getfield        #12  <Field azh a>
	// 8265 15421:getfield        #197 <Field int azh.aC>
	// 8266 15424:ixor            
	// 8267 15425:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8268 15428:aload_0         
	// 8269 15429:getfield        #12  <Field azh a>
	// 8270 15432:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC | a.J;
	// 8271 15433:aload_1         
	// 8272 15434:aload_1         
	// 8273 15435:getfield        #197 <Field int azh.aC>
	// 8274 15438:aload_0         
	// 8275 15439:getfield        #12  <Field azh a>
	// 8276 15442:getfield        #176 <Field int azh.J>
	// 8277 15445:ior             
	// 8278 15446:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8279 15449:aload_0         
	// 8280 15450:getfield        #12  <Field azh a>
	// 8281 15453:astore_1        
		abyte0.aC = ((azh) (abyte0)).au ^ a.aC;
	// 8282 15454:aload_1         
	// 8283 15455:aload_1         
	// 8284 15456:getfield        #146 <Field int azh.au>
	// 8285 15459:aload_0         
	// 8286 15460:getfield        #12  <Field azh a>
	// 8287 15463:getfield        #197 <Field int azh.aC>
	// 8288 15466:ixor            
	// 8289 15467:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8290 15470:aload_0         
	// 8291 15471:getfield        #12  <Field azh a>
	// 8292 15474:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC | a.ah;
	// 8293 15475:aload_1         
	// 8294 15476:aload_1         
	// 8295 15477:getfield        #197 <Field int azh.aC>
	// 8296 15480:aload_0         
	// 8297 15481:getfield        #12  <Field azh a>
	// 8298 15484:getfield        #113 <Field int azh.ah>
	// 8299 15487:ior             
	// 8300 15488:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8301 15491:aload_0         
	// 8302 15492:getfield        #12  <Field azh a>
	// 8303 15495:astore_1        
		abyte0.aC = ((azh) (abyte0)).aX ^ a.aC;
	// 8304 15496:aload_1         
	// 8305 15497:aload_1         
	// 8306 15498:getfield        #44  <Field int azh.aX>
	// 8307 15501:aload_0         
	// 8308 15502:getfield        #12  <Field azh a>
	// 8309 15505:getfield        #197 <Field int azh.aC>
	// 8310 15508:ixor            
	// 8311 15509:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8312 15512:aload_0         
	// 8313 15513:getfield        #12  <Field azh a>
	// 8314 15516:astore_1        
		abyte0.U = ((azh) (abyte0)).aC ^ a.U;
	// 8315 15517:aload_1         
	// 8316 15518:aload_1         
	// 8317 15519:getfield        #197 <Field int azh.aC>
	// 8318 15522:aload_0         
	// 8319 15523:getfield        #12  <Field azh a>
	// 8320 15526:getfield        #238 <Field int azh.U>
	// 8321 15529:ixor            
	// 8322 15530:putfield        #238 <Field int azh.U>
		abyte0 = ((byte []) (a));
	// 8323 15533:aload_0         
	// 8324 15534:getfield        #12  <Field azh a>
	// 8325 15537:astore_1        
		abyte0.br = ((azh) (abyte0)).I & ~a.br;
	// 8326 15538:aload_1         
	// 8327 15539:aload_1         
	// 8328 15540:getfield        #282 <Field int azh.I>
	// 8329 15543:aload_0         
	// 8330 15544:getfield        #12  <Field azh a>
	// 8331 15547:getfield        #444 <Field int azh.br>
	// 8332 15550:iconst_m1       
	// 8333 15551:ixor            
	// 8334 15552:iand            
	// 8335 15553:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 8336 15556:aload_0         
	// 8337 15557:getfield        #12  <Field azh a>
	// 8338 15560:astore_1        
		abyte0.br = ((azh) (abyte0)).bt ^ a.br;
	// 8339 15561:aload_1         
	// 8340 15562:aload_1         
	// 8341 15563:getfield        #447 <Field int azh.bt>
	// 8342 15566:aload_0         
	// 8343 15567:getfield        #12  <Field azh a>
	// 8344 15570:getfield        #444 <Field int azh.br>
	// 8345 15573:ixor            
	// 8346 15574:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 8347 15577:aload_0         
	// 8348 15578:getfield        #12  <Field azh a>
	// 8349 15581:astore_1        
		abyte0.V = ((azh) (abyte0)).br ^ a.V;
	// 8350 15582:aload_1         
	// 8351 15583:aload_1         
	// 8352 15584:getfield        #444 <Field int azh.br>
	// 8353 15587:aload_0         
	// 8354 15588:getfield        #12  <Field azh a>
	// 8355 15591:getfield        #450 <Field int azh.V>
	// 8356 15594:ixor            
	// 8357 15595:putfield        #450 <Field int azh.V>
		abyte0 = ((byte []) (a));
	// 8358 15598:aload_0         
	// 8359 15599:getfield        #12  <Field azh a>
	// 8360 15602:astore_1        
		abyte0.bz = ((azh) (abyte0)).bI ^ a.bz;
	// 8361 15603:aload_1         
	// 8362 15604:aload_1         
	// 8363 15605:getfield        #89  <Field int azh.bI>
	// 8364 15608:aload_0         
	// 8365 15609:getfield        #12  <Field azh a>
	// 8366 15612:getfield        #107 <Field int azh.bz>
	// 8367 15615:ixor            
	// 8368 15616:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 8369 15619:aload_0         
	// 8370 15620:getfield        #12  <Field azh a>
	// 8371 15623:astore_1        
		abyte0.W = ((azh) (abyte0)).bz ^ a.W;
	// 8372 15624:aload_1         
	// 8373 15625:aload_1         
	// 8374 15626:getfield        #107 <Field int azh.bz>
	// 8375 15629:aload_0         
	// 8376 15630:getfield        #12  <Field azh a>
	// 8377 15633:getfield        #453 <Field int azh.W>
	// 8378 15636:ixor            
	// 8379 15637:putfield        #453 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8380 15640:aload_0         
	// 8381 15641:getfield        #12  <Field azh a>
	// 8382 15644:astore_1        
		abyte0.bz = ((azh) (abyte0)).O ^ a.W;
	// 8383 15645:aload_1         
	// 8384 15646:aload_1         
	// 8385 15647:getfield        #456 <Field int azh.O>
	// 8386 15650:aload_0         
	// 8387 15651:getfield        #12  <Field azh a>
	// 8388 15654:getfield        #453 <Field int azh.W>
	// 8389 15657:ixor            
	// 8390 15658:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 8391 15661:aload_0         
	// 8392 15662:getfield        #12  <Field azh a>
	// 8393 15665:astore_1        
		abyte0.bI = ((azh) (abyte0)).G & a.bz;
	// 8394 15666:aload_1         
	// 8395 15667:aload_1         
	// 8396 15668:getfield        #459 <Field int azh.G>
	// 8397 15671:aload_0         
	// 8398 15672:getfield        #12  <Field azh a>
	// 8399 15675:getfield        #107 <Field int azh.bz>
	// 8400 15678:iand            
	// 8401 15679:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8402 15682:aload_0         
	// 8403 15683:getfield        #12  <Field azh a>
	// 8404 15686:astore_1        
		abyte0.bI = ((azh) (abyte0)).c & a.bI;
	// 8405 15687:aload_1         
	// 8406 15688:aload_1         
	// 8407 15689:getfield        #291 <Field int azh.c>
	// 8408 15692:aload_0         
	// 8409 15693:getfield        #12  <Field azh a>
	// 8410 15696:getfield        #89  <Field int azh.bI>
	// 8411 15699:iand            
	// 8412 15700:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8413 15703:aload_0         
	// 8414 15704:getfield        #12  <Field azh a>
	// 8415 15707:astore_1        
		abyte0.bI = ((azh) (abyte0)).aM ^ a.bI;
	// 8416 15708:aload_1         
	// 8417 15709:aload_1         
	// 8418 15710:getfield        #462 <Field int azh.aM>
	// 8419 15713:aload_0         
	// 8420 15714:getfield        #12  <Field azh a>
	// 8421 15717:getfield        #89  <Field int azh.bI>
	// 8422 15720:ixor            
	// 8423 15721:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8424 15724:aload_0         
	// 8425 15725:getfield        #12  <Field azh a>
	// 8426 15728:astore_1        
		abyte0.br = ((azh) (abyte0)).G & a.bz;
	// 8427 15729:aload_1         
	// 8428 15730:aload_1         
	// 8429 15731:getfield        #459 <Field int azh.G>
	// 8430 15734:aload_0         
	// 8431 15735:getfield        #12  <Field azh a>
	// 8432 15738:getfield        #107 <Field int azh.bz>
	// 8433 15741:iand            
	// 8434 15742:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 8435 15745:aload_0         
	// 8436 15746:getfield        #12  <Field azh a>
	// 8437 15749:astore_1        
		abyte0.bt = ((azh) (abyte0)).bz ^ a.G;
	// 8438 15750:aload_1         
	// 8439 15751:aload_1         
	// 8440 15752:getfield        #107 <Field int azh.bz>
	// 8441 15755:aload_0         
	// 8442 15756:getfield        #12  <Field azh a>
	// 8443 15759:getfield        #459 <Field int azh.G>
	// 8444 15762:ixor            
	// 8445 15763:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8446 15766:aload_0         
	// 8447 15767:getfield        #12  <Field azh a>
	// 8448 15770:astore_1        
		abyte0.am = ((azh) (abyte0)).bt ^ a.am;
	// 8449 15771:aload_1         
	// 8450 15772:aload_1         
	// 8451 15773:getfield        #447 <Field int azh.bt>
	// 8452 15776:aload_0         
	// 8453 15777:getfield        #12  <Field azh a>
	// 8454 15780:getfield        #465 <Field int azh.am>
	// 8455 15783:ixor            
	// 8456 15784:putfield        #465 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8457 15787:aload_0         
	// 8458 15788:getfield        #12  <Field azh a>
	// 8459 15791:astore_1        
		abyte0.bt = ((azh) (abyte0)).c & ~a.bt;
	// 8460 15792:aload_1         
	// 8461 15793:aload_1         
	// 8462 15794:getfield        #291 <Field int azh.c>
	// 8463 15797:aload_0         
	// 8464 15798:getfield        #12  <Field azh a>
	// 8465 15801:getfield        #447 <Field int azh.bt>
	// 8466 15804:iconst_m1       
	// 8467 15805:ixor            
	// 8468 15806:iand            
	// 8469 15807:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8470 15810:aload_0         
	// 8471 15811:getfield        #12  <Field azh a>
	// 8472 15814:astore_1        
		abyte0.bt = ((azh) (abyte0)).aT ^ a.bt;
	// 8473 15815:aload_1         
	// 8474 15816:aload_1         
	// 8475 15817:getfield        #468 <Field int azh.aT>
	// 8476 15820:aload_0         
	// 8477 15821:getfield        #12  <Field azh a>
	// 8478 15824:getfield        #447 <Field int azh.bt>
	// 8479 15827:ixor            
	// 8480 15828:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8481 15831:aload_0         
	// 8482 15832:getfield        #12  <Field azh a>
	// 8483 15835:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt & ~a.y;
	// 8484 15836:aload_1         
	// 8485 15837:aload_1         
	// 8486 15838:getfield        #447 <Field int azh.bt>
	// 8487 15841:aload_0         
	// 8488 15842:getfield        #12  <Field azh a>
	// 8489 15845:getfield        #471 <Field int azh.y>
	// 8490 15848:iconst_m1       
	// 8491 15849:ixor            
	// 8492 15850:iand            
	// 8493 15851:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8494 15854:aload_0         
	// 8495 15855:getfield        #12  <Field azh a>
	// 8496 15858:astore_1        
		abyte0.bt = ((azh) (abyte0)).W ^ a.bt;
	// 8497 15859:aload_1         
	// 8498 15860:aload_1         
	// 8499 15861:getfield        #453 <Field int azh.W>
	// 8500 15864:aload_0         
	// 8501 15865:getfield        #12  <Field azh a>
	// 8502 15868:getfield        #447 <Field int azh.bt>
	// 8503 15871:ixor            
	// 8504 15872:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8505 15875:aload_0         
	// 8506 15876:getfield        #12  <Field azh a>
	// 8507 15879:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt & ~a.ae;
	// 8508 15880:aload_1         
	// 8509 15881:aload_1         
	// 8510 15882:getfield        #447 <Field int azh.bt>
	// 8511 15885:aload_0         
	// 8512 15886:getfield        #12  <Field azh a>
	// 8513 15889:getfield        #288 <Field int azh.ae>
	// 8514 15892:iconst_m1       
	// 8515 15893:ixor            
	// 8516 15894:iand            
	// 8517 15895:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8518 15898:aload_0         
	// 8519 15899:getfield        #12  <Field azh a>
	// 8520 15902:astore_1        
		abyte0.bu = ((azh) (abyte0)).W ^ a.bu;
	// 8521 15903:aload_1         
	// 8522 15904:aload_1         
	// 8523 15905:getfield        #453 <Field int azh.W>
	// 8524 15908:aload_0         
	// 8525 15909:getfield        #12  <Field azh a>
	// 8526 15912:getfield        #474 <Field int azh.bu>
	// 8527 15915:ixor            
	// 8528 15916:putfield        #474 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 8529 15919:aload_0         
	// 8530 15920:getfield        #12  <Field azh a>
	// 8531 15923:astore_1        
		abyte0.aC = ((azh) (abyte0)).c & ~a.bu;
	// 8532 15924:aload_1         
	// 8533 15925:aload_1         
	// 8534 15926:getfield        #291 <Field int azh.c>
	// 8535 15929:aload_0         
	// 8536 15930:getfield        #12  <Field azh a>
	// 8537 15933:getfield        #474 <Field int azh.bu>
	// 8538 15936:iconst_m1       
	// 8539 15937:ixor            
	// 8540 15938:iand            
	// 8541 15939:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8542 15942:aload_0         
	// 8543 15943:getfield        #12  <Field azh a>
	// 8544 15946:astore_1        
		abyte0.aC = ((azh) (abyte0)).aM ^ a.aC;
	// 8545 15947:aload_1         
	// 8546 15948:aload_1         
	// 8547 15949:getfield        #462 <Field int azh.aM>
	// 8548 15952:aload_0         
	// 8549 15953:getfield        #12  <Field azh a>
	// 8550 15956:getfield        #197 <Field int azh.aC>
	// 8551 15959:ixor            
	// 8552 15960:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8553 15963:aload_0         
	// 8554 15964:getfield        #12  <Field azh a>
	// 8555 15967:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC & ~a.y;
	// 8556 15968:aload_1         
	// 8557 15969:aload_1         
	// 8558 15970:getfield        #197 <Field int azh.aC>
	// 8559 15973:aload_0         
	// 8560 15974:getfield        #12  <Field azh a>
	// 8561 15977:getfield        #471 <Field int azh.y>
	// 8562 15980:iconst_m1       
	// 8563 15981:ixor            
	// 8564 15982:iand            
	// 8565 15983:putfield        #197 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8566 15986:aload_0         
	// 8567 15987:getfield        #12  <Field azh a>
	// 8568 15990:astore_1        
		abyte0.bu = ((azh) (abyte0)).c & a.bu;
	// 8569 15991:aload_1         
	// 8570 15992:aload_1         
	// 8571 15993:getfield        #291 <Field int azh.c>
	// 8572 15996:aload_0         
	// 8573 15997:getfield        #12  <Field azh a>
	// 8574 16000:getfield        #474 <Field int azh.bu>
	// 8575 16003:iand            
	// 8576 16004:putfield        #474 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 8577 16007:aload_0         
	// 8578 16008:getfield        #12  <Field azh a>
	// 8579 16011:astore_1        
		abyte0.aM = ((azh) (abyte0)).G & ~a.W;
	// 8580 16012:aload_1         
	// 8581 16013:aload_1         
	// 8582 16014:getfield        #459 <Field int azh.G>
	// 8583 16017:aload_0         
	// 8584 16018:getfield        #12  <Field azh a>
	// 8585 16021:getfield        #453 <Field int azh.W>
	// 8586 16024:iconst_m1       
	// 8587 16025:ixor            
	// 8588 16026:iand            
	// 8589 16027:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8590 16030:aload_0         
	// 8591 16031:getfield        #12  <Field azh a>
	// 8592 16034:astore_1        
		abyte0.aX = ((azh) (abyte0)).O | a.W;
	// 8593 16035:aload_1         
	// 8594 16036:aload_1         
	// 8595 16037:getfield        #456 <Field int azh.O>
	// 8596 16040:aload_0         
	// 8597 16041:getfield        #12  <Field azh a>
	// 8598 16044:getfield        #453 <Field int azh.W>
	// 8599 16047:ior             
	// 8600 16048:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8601 16051:aload_0         
	// 8602 16052:getfield        #12  <Field azh a>
	// 8603 16055:astore_1        
		abyte0.au = ((azh) (abyte0)).G & ~a.aX;
	// 8604 16056:aload_1         
	// 8605 16057:aload_1         
	// 8606 16058:getfield        #459 <Field int azh.G>
	// 8607 16061:aload_0         
	// 8608 16062:getfield        #12  <Field azh a>
	// 8609 16065:getfield        #44  <Field int azh.aX>
	// 8610 16068:iconst_m1       
	// 8611 16069:ixor            
	// 8612 16070:iand            
	// 8613 16071:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 8614 16074:aload_0         
	// 8615 16075:getfield        #12  <Field azh a>
	// 8616 16078:astore_1        
		abyte0.au = ((azh) (abyte0)).W ^ a.au;
	// 8617 16079:aload_1         
	// 8618 16080:aload_1         
	// 8619 16081:getfield        #453 <Field int azh.W>
	// 8620 16084:aload_0         
	// 8621 16085:getfield        #12  <Field azh a>
	// 8622 16088:getfield        #146 <Field int azh.au>
	// 8623 16091:ixor            
	// 8624 16092:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 8625 16095:aload_0         
	// 8626 16096:getfield        #12  <Field azh a>
	// 8627 16099:astore_1        
		abyte0.aM = ((azh) (abyte0)).aX ^ a.aM;
	// 8628 16100:aload_1         
	// 8629 16101:aload_1         
	// 8630 16102:getfield        #44  <Field int azh.aX>
	// 8631 16105:aload_0         
	// 8632 16106:getfield        #12  <Field azh a>
	// 8633 16109:getfield        #462 <Field int azh.aM>
	// 8634 16112:ixor            
	// 8635 16113:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8636 16116:aload_0         
	// 8637 16117:getfield        #12  <Field azh a>
	// 8638 16120:astore_1        
		abyte0.aM = ((azh) (abyte0)).c & ~a.aM;
	// 8639 16121:aload_1         
	// 8640 16122:aload_1         
	// 8641 16123:getfield        #291 <Field int azh.c>
	// 8642 16126:aload_0         
	// 8643 16127:getfield        #12  <Field azh a>
	// 8644 16130:getfield        #462 <Field int azh.aM>
	// 8645 16133:iconst_m1       
	// 8646 16134:ixor            
	// 8647 16135:iand            
	// 8648 16136:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8649 16139:aload_0         
	// 8650 16140:getfield        #12  <Field azh a>
	// 8651 16143:astore_1        
		abyte0.aX = ((azh) (abyte0)).G & ~a.aX;
	// 8652 16144:aload_1         
	// 8653 16145:aload_1         
	// 8654 16146:getfield        #459 <Field int azh.G>
	// 8655 16149:aload_0         
	// 8656 16150:getfield        #12  <Field azh a>
	// 8657 16153:getfield        #44  <Field int azh.aX>
	// 8658 16156:iconst_m1       
	// 8659 16157:ixor            
	// 8660 16158:iand            
	// 8661 16159:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8662 16162:aload_0         
	// 8663 16163:getfield        #12  <Field azh a>
	// 8664 16166:astore_1        
		abyte0.aX = ((azh) (abyte0)).bz ^ a.aX;
	// 8665 16167:aload_1         
	// 8666 16168:aload_1         
	// 8667 16169:getfield        #107 <Field int azh.bz>
	// 8668 16172:aload_0         
	// 8669 16173:getfield        #12  <Field azh a>
	// 8670 16176:getfield        #44  <Field int azh.aX>
	// 8671 16179:ixor            
	// 8672 16180:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8673 16183:aload_0         
	// 8674 16184:getfield        #12  <Field azh a>
	// 8675 16187:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.c;
	// 8676 16188:aload_1         
	// 8677 16189:aload_1         
	// 8678 16190:getfield        #44  <Field int azh.aX>
	// 8679 16193:aload_0         
	// 8680 16194:getfield        #12  <Field azh a>
	// 8681 16197:getfield        #291 <Field int azh.c>
	// 8682 16200:iconst_m1       
	// 8683 16201:ixor            
	// 8684 16202:iand            
	// 8685 16203:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8686 16206:aload_0         
	// 8687 16207:getfield        #12  <Field azh a>
	// 8688 16210:astore_1        
		abyte0.bm = ((azh) (abyte0)).W & ~a.O;
	// 8689 16211:aload_1         
	// 8690 16212:aload_1         
	// 8691 16213:getfield        #453 <Field int azh.W>
	// 8692 16216:aload_0         
	// 8693 16217:getfield        #12  <Field azh a>
	// 8694 16220:getfield        #456 <Field int azh.O>
	// 8695 16223:iconst_m1       
	// 8696 16224:ixor            
	// 8697 16225:iand            
	// 8698 16226:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8699 16229:aload_0         
	// 8700 16230:getfield        #12  <Field azh a>
	// 8701 16233:astore_1        
		abyte0.bJ = ((azh) (abyte0)).W & ~a.bm;
	// 8702 16234:aload_1         
	// 8703 16235:aload_1         
	// 8704 16236:getfield        #453 <Field int azh.W>
	// 8705 16239:aload_0         
	// 8706 16240:getfield        #12  <Field azh a>
	// 8707 16243:getfield        #256 <Field int azh.bm>
	// 8708 16246:iconst_m1       
	// 8709 16247:ixor            
	// 8710 16248:iand            
	// 8711 16249:putfield        #119 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 8712 16252:aload_0         
	// 8713 16253:getfield        #12  <Field azh a>
	// 8714 16256:astore_1        
		abyte0.aL = ((azh) (abyte0)).G & ~a.bm;
	// 8715 16257:aload_1         
	// 8716 16258:aload_1         
	// 8717 16259:getfield        #459 <Field int azh.G>
	// 8718 16262:aload_0         
	// 8719 16263:getfield        #12  <Field azh a>
	// 8720 16266:getfield        #256 <Field int azh.bm>
	// 8721 16269:iconst_m1       
	// 8722 16270:ixor            
	// 8723 16271:iand            
	// 8724 16272:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8725 16275:aload_0         
	// 8726 16276:getfield        #12  <Field azh a>
	// 8727 16279:astore_1        
		abyte0.aL = ((azh) (abyte0)).O ^ a.aL;
	// 8728 16280:aload_1         
	// 8729 16281:aload_1         
	// 8730 16282:getfield        #456 <Field int azh.O>
	// 8731 16285:aload_0         
	// 8732 16286:getfield        #12  <Field azh a>
	// 8733 16289:getfield        #220 <Field int azh.aL>
	// 8734 16292:ixor            
	// 8735 16293:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8736 16296:aload_0         
	// 8737 16297:getfield        #12  <Field azh a>
	// 8738 16300:astore_1        
		abyte0.aL = ((azh) (abyte0)).c & ~a.aL;
	// 8739 16301:aload_1         
	// 8740 16302:aload_1         
	// 8741 16303:getfield        #291 <Field int azh.c>
	// 8742 16306:aload_0         
	// 8743 16307:getfield        #12  <Field azh a>
	// 8744 16310:getfield        #220 <Field int azh.aL>
	// 8745 16313:iconst_m1       
	// 8746 16314:ixor            
	// 8747 16315:iand            
	// 8748 16316:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8749 16319:aload_0         
	// 8750 16320:getfield        #12  <Field azh a>
	// 8751 16323:astore_1        
		abyte0.aL = ((azh) (abyte0)).au ^ a.aL;
	// 8752 16324:aload_1         
	// 8753 16325:aload_1         
	// 8754 16326:getfield        #146 <Field int azh.au>
	// 8755 16329:aload_0         
	// 8756 16330:getfield        #12  <Field azh a>
	// 8757 16333:getfield        #220 <Field int azh.aL>
	// 8758 16336:ixor            
	// 8759 16337:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8760 16340:aload_0         
	// 8761 16341:getfield        #12  <Field azh a>
	// 8762 16344:astore_1        
		abyte0.aL = ((azh) (abyte0)).aL & ~a.y;
	// 8763 16345:aload_1         
	// 8764 16346:aload_1         
	// 8765 16347:getfield        #220 <Field int azh.aL>
	// 8766 16350:aload_0         
	// 8767 16351:getfield        #12  <Field azh a>
	// 8768 16354:getfield        #471 <Field int azh.y>
	// 8769 16357:iconst_m1       
	// 8770 16358:ixor            
	// 8771 16359:iand            
	// 8772 16360:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8773 16363:aload_0         
	// 8774 16364:getfield        #12  <Field azh a>
	// 8775 16367:astore_1        
		abyte0.au = ((azh) (abyte0)).G & a.bm;
	// 8776 16368:aload_1         
	// 8777 16369:aload_1         
	// 8778 16370:getfield        #459 <Field int azh.G>
	// 8779 16373:aload_0         
	// 8780 16374:getfield        #12  <Field azh a>
	// 8781 16377:getfield        #256 <Field int azh.bm>
	// 8782 16380:iand            
	// 8783 16381:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 8784 16384:aload_0         
	// 8785 16385:getfield        #12  <Field azh a>
	// 8786 16388:astore_1        
		abyte0.au = ((azh) (abyte0)).bm ^ a.au;
	// 8787 16389:aload_1         
	// 8788 16390:aload_1         
	// 8789 16391:getfield        #256 <Field int azh.bm>
	// 8790 16394:aload_0         
	// 8791 16395:getfield        #12  <Field azh a>
	// 8792 16398:getfield        #146 <Field int azh.au>
	// 8793 16401:ixor            
	// 8794 16402:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 8795 16405:aload_0         
	// 8796 16406:getfield        #12  <Field azh a>
	// 8797 16409:astore_1        
		abyte0.bu = ((azh) (abyte0)).au ^ a.bu;
	// 8798 16410:aload_1         
	// 8799 16411:aload_1         
	// 8800 16412:getfield        #146 <Field int azh.au>
	// 8801 16415:aload_0         
	// 8802 16416:getfield        #12  <Field azh a>
	// 8803 16419:getfield        #474 <Field int azh.bu>
	// 8804 16422:ixor            
	// 8805 16423:putfield        #474 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 8806 16426:aload_0         
	// 8807 16427:getfield        #12  <Field azh a>
	// 8808 16430:astore_1        
		abyte0.bu = ((azh) (abyte0)).y | a.bu;
	// 8809 16431:aload_1         
	// 8810 16432:aload_1         
	// 8811 16433:getfield        #471 <Field int azh.y>
	// 8812 16436:aload_0         
	// 8813 16437:getfield        #12  <Field azh a>
	// 8814 16440:getfield        #474 <Field int azh.bu>
	// 8815 16443:ior             
	// 8816 16444:putfield        #474 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 8817 16447:aload_0         
	// 8818 16448:getfield        #12  <Field azh a>
	// 8819 16451:astore_1        
		abyte0.ba = ((azh) (abyte0)).bm ^ a.ba;
	// 8820 16452:aload_1         
	// 8821 16453:aload_1         
	// 8822 16454:getfield        #256 <Field int azh.bm>
	// 8823 16457:aload_0         
	// 8824 16458:getfield        #12  <Field azh a>
	// 8825 16461:getfield        #477 <Field int azh.ba>
	// 8826 16464:ixor            
	// 8827 16465:putfield        #477 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 8828 16468:aload_0         
	// 8829 16469:getfield        #12  <Field azh a>
	// 8830 16472:astore_1        
		abyte0.aM = ((azh) (abyte0)).ba ^ a.aM;
	// 8831 16473:aload_1         
	// 8832 16474:aload_1         
	// 8833 16475:getfield        #477 <Field int azh.ba>
	// 8834 16478:aload_0         
	// 8835 16479:getfield        #12  <Field azh a>
	// 8836 16482:getfield        #462 <Field int azh.aM>
	// 8837 16485:ixor            
	// 8838 16486:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8839 16489:aload_0         
	// 8840 16490:getfield        #12  <Field azh a>
	// 8841 16493:astore_1        
		abyte0.aM = ((azh) (abyte0)).aM & ~a.y;
	// 8842 16494:aload_1         
	// 8843 16495:aload_1         
	// 8844 16496:getfield        #462 <Field int azh.aM>
	// 8845 16499:aload_0         
	// 8846 16500:getfield        #12  <Field azh a>
	// 8847 16503:getfield        #471 <Field int azh.y>
	// 8848 16506:iconst_m1       
	// 8849 16507:ixor            
	// 8850 16508:iand            
	// 8851 16509:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8852 16512:aload_0         
	// 8853 16513:getfield        #12  <Field azh a>
	// 8854 16516:astore_1        
		abyte0.aM = ((azh) (abyte0)).bI ^ a.aM;
	// 8855 16517:aload_1         
	// 8856 16518:aload_1         
	// 8857 16519:getfield        #89  <Field int azh.bI>
	// 8858 16522:aload_0         
	// 8859 16523:getfield        #12  <Field azh a>
	// 8860 16526:getfield        #462 <Field int azh.aM>
	// 8861 16529:ixor            
	// 8862 16530:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8863 16533:aload_0         
	// 8864 16534:getfield        #12  <Field azh a>
	// 8865 16537:astore_1        
		abyte0.aM = ((azh) (abyte0)).aM & ~a.ae;
	// 8866 16538:aload_1         
	// 8867 16539:aload_1         
	// 8868 16540:getfield        #462 <Field int azh.aM>
	// 8869 16543:aload_0         
	// 8870 16544:getfield        #12  <Field azh a>
	// 8871 16547:getfield        #288 <Field int azh.ae>
	// 8872 16550:iconst_m1       
	// 8873 16551:ixor            
	// 8874 16552:iand            
	// 8875 16553:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 8876 16556:aload_0         
	// 8877 16557:getfield        #12  <Field azh a>
	// 8878 16560:astore_1        
		abyte0.bm = ((azh) (abyte0)).G & ~a.bm;
	// 8879 16561:aload_1         
	// 8880 16562:aload_1         
	// 8881 16563:getfield        #459 <Field int azh.G>
	// 8882 16566:aload_0         
	// 8883 16567:getfield        #12  <Field azh a>
	// 8884 16570:getfield        #256 <Field int azh.bm>
	// 8885 16573:iconst_m1       
	// 8886 16574:ixor            
	// 8887 16575:iand            
	// 8888 16576:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8889 16579:aload_0         
	// 8890 16580:getfield        #12  <Field azh a>
	// 8891 16583:astore_1        
		abyte0.bm = ((azh) (abyte0)).bz ^ a.bm;
	// 8892 16584:aload_1         
	// 8893 16585:aload_1         
	// 8894 16586:getfield        #107 <Field int azh.bz>
	// 8895 16589:aload_0         
	// 8896 16590:getfield        #12  <Field azh a>
	// 8897 16593:getfield        #256 <Field int azh.bm>
	// 8898 16596:ixor            
	// 8899 16597:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8900 16600:aload_0         
	// 8901 16601:getfield        #12  <Field azh a>
	// 8902 16604:astore_1        
		abyte0.bz = ((azh) (abyte0)).c & ~a.bm;
	// 8903 16605:aload_1         
	// 8904 16606:aload_1         
	// 8905 16607:getfield        #291 <Field int azh.c>
	// 8906 16610:aload_0         
	// 8907 16611:getfield        #12  <Field azh a>
	// 8908 16614:getfield        #256 <Field int azh.bm>
	// 8909 16617:iconst_m1       
	// 8910 16618:ixor            
	// 8911 16619:iand            
	// 8912 16620:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 8913 16623:aload_0         
	// 8914 16624:getfield        #12  <Field azh a>
	// 8915 16627:astore_1        
		abyte0.bz = ((azh) (abyte0)).aT ^ a.bz;
	// 8916 16628:aload_1         
	// 8917 16629:aload_1         
	// 8918 16630:getfield        #468 <Field int azh.aT>
	// 8919 16633:aload_0         
	// 8920 16634:getfield        #12  <Field azh a>
	// 8921 16637:getfield        #107 <Field int azh.bz>
	// 8922 16640:ixor            
	// 8923 16641:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 8924 16644:aload_0         
	// 8925 16645:getfield        #12  <Field azh a>
	// 8926 16648:astore_1        
		abyte0.bz = ((azh) (abyte0)).y & ~a.bz;
	// 8927 16649:aload_1         
	// 8928 16650:aload_1         
	// 8929 16651:getfield        #471 <Field int azh.y>
	// 8930 16654:aload_0         
	// 8931 16655:getfield        #12  <Field azh a>
	// 8932 16658:getfield        #107 <Field int azh.bz>
	// 8933 16661:iconst_m1       
	// 8934 16662:ixor            
	// 8935 16663:iand            
	// 8936 16664:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 8937 16667:aload_0         
	// 8938 16668:getfield        #12  <Field azh a>
	// 8939 16671:astore_1        
		abyte0.bm = ((azh) (abyte0)).c & a.bm;
	// 8940 16672:aload_1         
	// 8941 16673:aload_1         
	// 8942 16674:getfield        #291 <Field int azh.c>
	// 8943 16677:aload_0         
	// 8944 16678:getfield        #12  <Field azh a>
	// 8945 16681:getfield        #256 <Field int azh.bm>
	// 8946 16684:iand            
	// 8947 16685:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8948 16688:aload_0         
	// 8949 16689:getfield        #12  <Field azh a>
	// 8950 16692:astore_1        
		abyte0.aT = ((azh) (abyte0)).O & ~a.W;
	// 8951 16693:aload_1         
	// 8952 16694:aload_1         
	// 8953 16695:getfield        #456 <Field int azh.O>
	// 8954 16698:aload_0         
	// 8955 16699:getfield        #12  <Field azh a>
	// 8956 16702:getfield        #453 <Field int azh.W>
	// 8957 16705:iconst_m1       
	// 8958 16706:ixor            
	// 8959 16707:iand            
	// 8960 16708:putfield        #468 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 8961 16711:aload_0         
	// 8962 16712:getfield        #12  <Field azh a>
	// 8963 16715:astore_1        
		abyte0.bI = ((azh) (abyte0)).c & a.aT;
	// 8964 16716:aload_1         
	// 8965 16717:aload_1         
	// 8966 16718:getfield        #291 <Field int azh.c>
	// 8967 16721:aload_0         
	// 8968 16722:getfield        #12  <Field azh a>
	// 8969 16725:getfield        #468 <Field int azh.aT>
	// 8970 16728:iand            
	// 8971 16729:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8972 16732:aload_0         
	// 8973 16733:getfield        #12  <Field azh a>
	// 8974 16736:astore_1        
		abyte0.bI = ((azh) (abyte0)).aT ^ a.bI;
	// 8975 16737:aload_1         
	// 8976 16738:aload_1         
	// 8977 16739:getfield        #468 <Field int azh.aT>
	// 8978 16742:aload_0         
	// 8979 16743:getfield        #12  <Field azh a>
	// 8980 16746:getfield        #89  <Field int azh.bI>
	// 8981 16749:ixor            
	// 8982 16750:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8983 16753:aload_0         
	// 8984 16754:getfield        #12  <Field azh a>
	// 8985 16757:astore_1        
		abyte0.bI = ((azh) (abyte0)).bI & ~a.y;
	// 8986 16758:aload_1         
	// 8987 16759:aload_1         
	// 8988 16760:getfield        #89  <Field int azh.bI>
	// 8989 16763:aload_0         
	// 8990 16764:getfield        #12  <Field azh a>
	// 8991 16767:getfield        #471 <Field int azh.y>
	// 8992 16770:iconst_m1       
	// 8993 16771:ixor            
	// 8994 16772:iand            
	// 8995 16773:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 8996 16776:aload_0         
	// 8997 16777:getfield        #12  <Field azh a>
	// 8998 16780:astore_1        
		abyte0.ba = ((azh) (abyte0)).W | a.aT;
	// 8999 16781:aload_1         
	// 9000 16782:aload_1         
	// 9001 16783:getfield        #453 <Field int azh.W>
	// 9002 16786:aload_0         
	// 9003 16787:getfield        #12  <Field azh a>
	// 9004 16790:getfield        #468 <Field int azh.aT>
	// 9005 16793:ior             
	// 9006 16794:putfield        #477 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 9007 16797:aload_0         
	// 9008 16798:getfield        #12  <Field azh a>
	// 9009 16801:astore_1        
		abyte0.au = ((azh) (abyte0)).G & a.ba;
	// 9010 16802:aload_1         
	// 9011 16803:aload_1         
	// 9012 16804:getfield        #459 <Field int azh.G>
	// 9013 16807:aload_0         
	// 9014 16808:getfield        #12  <Field azh a>
	// 9015 16811:getfield        #477 <Field int azh.ba>
	// 9016 16814:iand            
	// 9017 16815:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9018 16818:aload_0         
	// 9019 16819:getfield        #12  <Field azh a>
	// 9020 16822:astore_1        
		abyte0.au = ((azh) (abyte0)).aT ^ a.au;
	// 9021 16823:aload_1         
	// 9022 16824:aload_1         
	// 9023 16825:getfield        #468 <Field int azh.aT>
	// 9024 16828:aload_0         
	// 9025 16829:getfield        #12  <Field azh a>
	// 9026 16832:getfield        #146 <Field int azh.au>
	// 9027 16835:ixor            
	// 9028 16836:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9029 16839:aload_0         
	// 9030 16840:getfield        #12  <Field azh a>
	// 9031 16843:astore_1        
		abyte0.au = ((azh) (abyte0)).au & ~a.c;
	// 9032 16844:aload_1         
	// 9033 16845:aload_1         
	// 9034 16846:getfield        #146 <Field int azh.au>
	// 9035 16849:aload_0         
	// 9036 16850:getfield        #12  <Field azh a>
	// 9037 16853:getfield        #291 <Field int azh.c>
	// 9038 16856:iconst_m1       
	// 9039 16857:ixor            
	// 9040 16858:iand            
	// 9041 16859:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9042 16862:aload_0         
	// 9043 16863:getfield        #12  <Field azh a>
	// 9044 16866:astore_1        
		abyte0.au = ((azh) (abyte0)).y | a.au;
	// 9045 16867:aload_1         
	// 9046 16868:aload_1         
	// 9047 16869:getfield        #471 <Field int azh.y>
	// 9048 16872:aload_0         
	// 9049 16873:getfield        #12  <Field azh a>
	// 9050 16876:getfield        #146 <Field int azh.au>
	// 9051 16879:ior             
	// 9052 16880:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9053 16883:aload_0         
	// 9054 16884:getfield        #12  <Field azh a>
	// 9055 16887:astore_1        
		abyte0.au = ((azh) (abyte0)).am ^ a.au;
	// 9056 16888:aload_1         
	// 9057 16889:aload_1         
	// 9058 16890:getfield        #465 <Field int azh.am>
	// 9059 16893:aload_0         
	// 9060 16894:getfield        #12  <Field azh a>
	// 9061 16897:getfield        #146 <Field int azh.au>
	// 9062 16900:ixor            
	// 9063 16901:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9064 16904:aload_0         
	// 9065 16905:getfield        #12  <Field azh a>
	// 9066 16908:astore_1        
		abyte0.aM = ((azh) (abyte0)).au ^ a.aM;
	// 9067 16909:aload_1         
	// 9068 16910:aload_1         
	// 9069 16911:getfield        #146 <Field int azh.au>
	// 9070 16914:aload_0         
	// 9071 16915:getfield        #12  <Field azh a>
	// 9072 16918:getfield        #462 <Field int azh.aM>
	// 9073 16921:ixor            
	// 9074 16922:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 9075 16925:aload_0         
	// 9076 16926:getfield        #12  <Field azh a>
	// 9077 16929:astore_1        
		abyte0.t = ((azh) (abyte0)).aM ^ a.t;
	// 9078 16930:aload_1         
	// 9079 16931:aload_1         
	// 9080 16932:getfield        #462 <Field int azh.aM>
	// 9081 16935:aload_0         
	// 9082 16936:getfield        #12  <Field azh a>
	// 9083 16939:getfield        #480 <Field int azh.t>
	// 9084 16942:ixor            
	// 9085 16943:putfield        #480 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 9086 16946:aload_0         
	// 9087 16947:getfield        #12  <Field azh a>
	// 9088 16950:astore_1        
		abyte0.bF = ((azh) (abyte0)).bF & ~a.t;
	// 9089 16951:aload_1         
	// 9090 16952:aload_1         
	// 9091 16953:getfield        #68  <Field int azh.bF>
	// 9092 16956:aload_0         
	// 9093 16957:getfield        #12  <Field azh a>
	// 9094 16960:getfield        #480 <Field int azh.t>
	// 9095 16963:iconst_m1       
	// 9096 16964:ixor            
	// 9097 16965:iand            
	// 9098 16966:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 9099 16969:aload_0         
	// 9100 16970:getfield        #12  <Field azh a>
	// 9101 16973:astore_1        
		abyte0.bF = ((azh) (abyte0)).av ^ a.bF;
	// 9102 16974:aload_1         
	// 9103 16975:aload_1         
	// 9104 16976:getfield        #411 <Field int azh.av>
	// 9105 16979:aload_0         
	// 9106 16980:getfield        #12  <Field azh a>
	// 9107 16983:getfield        #68  <Field int azh.bF>
	// 9108 16986:ixor            
	// 9109 16987:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 9110 16990:aload_0         
	// 9111 16991:getfield        #12  <Field azh a>
	// 9112 16994:astore_1        
		abyte0.aN = ((azh) (abyte0)).bF ^ a.aN;
	// 9113 16995:aload_1         
	// 9114 16996:aload_1         
	// 9115 16997:getfield        #68  <Field int azh.bF>
	// 9116 17000:aload_0         
	// 9117 17001:getfield        #12  <Field azh a>
	// 9118 17004:getfield        #35  <Field int azh.aN>
	// 9119 17007:ixor            
	// 9120 17008:putfield        #35  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 9121 17011:aload_0         
	// 9122 17012:getfield        #12  <Field azh a>
	// 9123 17015:astore_1        
		abyte0.S = ((azh) (abyte0)).aN ^ a.S;
	// 9124 17016:aload_1         
	// 9125 17017:aload_1         
	// 9126 17018:getfield        #35  <Field int azh.aN>
	// 9127 17021:aload_0         
	// 9128 17022:getfield        #12  <Field azh a>
	// 9129 17025:getfield        #134 <Field int azh.S>
	// 9130 17028:ixor            
	// 9131 17029:putfield        #134 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9132 17032:aload_0         
	// 9133 17033:getfield        #12  <Field azh a>
	// 9134 17036:astore_1        
		abyte0.bH = ((azh) (abyte0)).t | a.bH;
	// 9135 17037:aload_1         
	// 9136 17038:aload_1         
	// 9137 17039:getfield        #480 <Field int azh.t>
	// 9138 17042:aload_0         
	// 9139 17043:getfield        #12  <Field azh a>
	// 9140 17046:getfield        #194 <Field int azh.bH>
	// 9141 17049:ior             
	// 9142 17050:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9143 17053:aload_0         
	// 9144 17054:getfield        #12  <Field azh a>
	// 9145 17057:astore_1        
		abyte0.bH = ((azh) (abyte0)).bC ^ a.bH;
	// 9146 17058:aload_1         
	// 9147 17059:aload_1         
	// 9148 17060:getfield        #268 <Field int azh.bC>
	// 9149 17063:aload_0         
	// 9150 17064:getfield        #12  <Field azh a>
	// 9151 17067:getfield        #194 <Field int azh.bH>
	// 9152 17070:ixor            
	// 9153 17071:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9154 17074:aload_0         
	// 9155 17075:getfield        #12  <Field azh a>
	// 9156 17078:astore_1        
		abyte0.aO = ((azh) (abyte0)).aO & ~a.t;
	// 9157 17079:aload_1         
	// 9158 17080:aload_1         
	// 9159 17081:getfield        #86  <Field int azh.aO>
	// 9160 17084:aload_0         
	// 9161 17085:getfield        #12  <Field azh a>
	// 9162 17088:getfield        #480 <Field int azh.t>
	// 9163 17091:iconst_m1       
	// 9164 17092:ixor            
	// 9165 17093:iand            
	// 9166 17094:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 9167 17097:aload_0         
	// 9168 17098:getfield        #12  <Field azh a>
	// 9169 17101:astore_1        
		abyte0.aO = ((azh) (abyte0)).bf ^ a.aO;
	// 9170 17102:aload_1         
	// 9171 17103:aload_1         
	// 9172 17104:getfield        #247 <Field int azh.bf>
	// 9173 17107:aload_0         
	// 9174 17108:getfield        #12  <Field azh a>
	// 9175 17111:getfield        #86  <Field int azh.aO>
	// 9176 17114:ixor            
	// 9177 17115:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 9178 17118:aload_0         
	// 9179 17119:getfield        #12  <Field azh a>
	// 9180 17122:astore_1        
		abyte0.aF = ((azh) (abyte0)).t | a.aF;
	// 9181 17123:aload_1         
	// 9182 17124:aload_1         
	// 9183 17125:getfield        #480 <Field int azh.t>
	// 9184 17128:aload_0         
	// 9185 17129:getfield        #12  <Field azh a>
	// 9186 17132:getfield        #110 <Field int azh.aF>
	// 9187 17135:ior             
	// 9188 17136:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 9189 17139:aload_0         
	// 9190 17140:getfield        #12  <Field azh a>
	// 9191 17143:astore_1        
		abyte0.aF = ((azh) (abyte0)).as ^ a.aF;
	// 9192 17144:aload_1         
	// 9193 17145:aload_1         
	// 9194 17146:getfield        #140 <Field int azh.as>
	// 9195 17149:aload_0         
	// 9196 17150:getfield        #12  <Field azh a>
	// 9197 17153:getfield        #110 <Field int azh.aF>
	// 9198 17156:ixor            
	// 9199 17157:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 9200 17160:aload_0         
	// 9201 17161:getfield        #12  <Field azh a>
	// 9202 17164:astore_1        
		abyte0.bE = ((azh) (abyte0)).bE & ~a.t;
	// 9203 17165:aload_1         
	// 9204 17166:aload_1         
	// 9205 17167:getfield        #152 <Field int azh.bE>
	// 9206 17170:aload_0         
	// 9207 17171:getfield        #12  <Field azh a>
	// 9208 17174:getfield        #480 <Field int azh.t>
	// 9209 17177:iconst_m1       
	// 9210 17178:ixor            
	// 9211 17179:iand            
	// 9212 17180:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9213 17183:aload_0         
	// 9214 17184:getfield        #12  <Field azh a>
	// 9215 17187:astore_1        
		abyte0.bE = ((azh) (abyte0)).ce ^ a.bE;
	// 9216 17188:aload_1         
	// 9217 17189:aload_1         
	// 9218 17190:getfield        #426 <Field int azh.ce>
	// 9219 17193:aload_0         
	// 9220 17194:getfield        #12  <Field azh a>
	// 9221 17197:getfield        #152 <Field int azh.bE>
	// 9222 17200:ixor            
	// 9223 17201:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9224 17204:aload_0         
	// 9225 17205:getfield        #12  <Field azh a>
	// 9226 17208:astore_1        
		abyte0.bE = ((azh) (abyte0)).l | a.bE;
	// 9227 17209:aload_1         
	// 9228 17210:aload_1         
	// 9229 17211:getfield        #277 <Field int azh.l>
	// 9230 17214:aload_0         
	// 9231 17215:getfield        #12  <Field azh a>
	// 9232 17218:getfield        #152 <Field int azh.bE>
	// 9233 17221:ior             
	// 9234 17222:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9235 17225:aload_0         
	// 9236 17226:getfield        #12  <Field azh a>
	// 9237 17229:astore_1        
		abyte0.bE = ((azh) (abyte0)).bH ^ a.bE;
	// 9238 17230:aload_1         
	// 9239 17231:aload_1         
	// 9240 17232:getfield        #194 <Field int azh.bH>
	// 9241 17235:aload_0         
	// 9242 17236:getfield        #12  <Field azh a>
	// 9243 17239:getfield        #152 <Field int azh.bE>
	// 9244 17242:ixor            
	// 9245 17243:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9246 17246:aload_0         
	// 9247 17247:getfield        #12  <Field azh a>
	// 9248 17250:astore_1        
		abyte0.y = ((azh) (abyte0)).bE ^ a.y;
	// 9249 17251:aload_1         
	// 9250 17252:aload_1         
	// 9251 17253:getfield        #152 <Field int azh.bE>
	// 9252 17256:aload_0         
	// 9253 17257:getfield        #12  <Field azh a>
	// 9254 17260:getfield        #471 <Field int azh.y>
	// 9255 17263:ixor            
	// 9256 17264:putfield        #471 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 9257 17267:aload_0         
	// 9258 17268:getfield        #12  <Field azh a>
	// 9259 17271:astore_1        
		abyte0.cf = ((azh) (abyte0)).t | a.cf;
	// 9260 17272:aload_1         
	// 9261 17273:aload_1         
	// 9262 17274:getfield        #480 <Field int azh.t>
	// 9263 17277:aload_0         
	// 9264 17278:getfield        #12  <Field azh a>
	// 9265 17281:getfield        #429 <Field int azh.cf>
	// 9266 17284:ior             
	// 9267 17285:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9268 17288:aload_0         
	// 9269 17289:getfield        #12  <Field azh a>
	// 9270 17292:astore_1        
		abyte0.cf = ((azh) (abyte0)).cc ^ a.cf;
	// 9271 17293:aload_1         
	// 9272 17294:aload_1         
	// 9273 17295:getfield        #420 <Field int azh.cc>
	// 9274 17298:aload_0         
	// 9275 17299:getfield        #12  <Field azh a>
	// 9276 17302:getfield        #429 <Field int azh.cf>
	// 9277 17305:ixor            
	// 9278 17306:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9279 17309:aload_0         
	// 9280 17310:getfield        #12  <Field azh a>
	// 9281 17313:astore_1        
		abyte0.cf = ((azh) (abyte0)).cf & ~a.l;
	// 9282 17314:aload_1         
	// 9283 17315:aload_1         
	// 9284 17316:getfield        #429 <Field int azh.cf>
	// 9285 17319:aload_0         
	// 9286 17320:getfield        #12  <Field azh a>
	// 9287 17323:getfield        #277 <Field int azh.l>
	// 9288 17326:iconst_m1       
	// 9289 17327:ixor            
	// 9290 17328:iand            
	// 9291 17329:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9292 17332:aload_0         
	// 9293 17333:getfield        #12  <Field azh a>
	// 9294 17336:astore_1        
		abyte0.cf = ((azh) (abyte0)).aF ^ a.cf;
	// 9295 17337:aload_1         
	// 9296 17338:aload_1         
	// 9297 17339:getfield        #110 <Field int azh.aF>
	// 9298 17342:aload_0         
	// 9299 17343:getfield        #12  <Field azh a>
	// 9300 17346:getfield        #429 <Field int azh.cf>
	// 9301 17349:ixor            
	// 9302 17350:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9303 17353:aload_0         
	// 9304 17354:getfield        #12  <Field azh a>
	// 9305 17357:astore_1        
		abyte0.Q = ((azh) (abyte0)).cf ^ a.Q;
	// 9306 17358:aload_1         
	// 9307 17359:aload_1         
	// 9308 17360:getfield        #429 <Field int azh.cf>
	// 9309 17363:aload_0         
	// 9310 17364:getfield        #12  <Field azh a>
	// 9311 17367:getfield        #483 <Field int azh.Q>
	// 9312 17370:ixor            
	// 9313 17371:putfield        #483 <Field int azh.Q>
		abyte0 = ((byte []) (a));
	// 9314 17374:aload_0         
	// 9315 17375:getfield        #12  <Field azh a>
	// 9316 17378:astore_1        
		abyte0.bh = ((azh) (abyte0)).t | a.bh;
	// 9317 17379:aload_1         
	// 9318 17380:aload_1         
	// 9319 17381:getfield        #480 <Field int azh.t>
	// 9320 17384:aload_0         
	// 9321 17385:getfield        #12  <Field azh a>
	// 9322 17388:getfield        #32  <Field int azh.bh>
	// 9323 17391:ior             
	// 9324 17392:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9325 17395:aload_0         
	// 9326 17396:getfield        #12  <Field azh a>
	// 9327 17399:astore_1        
		abyte0.bh = ((azh) (abyte0)).cd ^ a.bh;
	// 9328 17400:aload_1         
	// 9329 17401:aload_1         
	// 9330 17402:getfield        #423 <Field int azh.cd>
	// 9331 17405:aload_0         
	// 9332 17406:getfield        #12  <Field azh a>
	// 9333 17409:getfield        #32  <Field int azh.bh>
	// 9334 17412:ixor            
	// 9335 17413:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9336 17416:aload_0         
	// 9337 17417:getfield        #12  <Field azh a>
	// 9338 17420:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh & ~a.l;
	// 9339 17421:aload_1         
	// 9340 17422:aload_1         
	// 9341 17423:getfield        #32  <Field int azh.bh>
	// 9342 17426:aload_0         
	// 9343 17427:getfield        #12  <Field azh a>
	// 9344 17430:getfield        #277 <Field int azh.l>
	// 9345 17433:iconst_m1       
	// 9346 17434:ixor            
	// 9347 17435:iand            
	// 9348 17436:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9349 17439:aload_0         
	// 9350 17440:getfield        #12  <Field azh a>
	// 9351 17443:astore_1        
		abyte0.bh = ((azh) (abyte0)).aO ^ a.bh;
	// 9352 17444:aload_1         
	// 9353 17445:aload_1         
	// 9354 17446:getfield        #86  <Field int azh.aO>
	// 9355 17449:aload_0         
	// 9356 17450:getfield        #12  <Field azh a>
	// 9357 17453:getfield        #32  <Field int azh.bh>
	// 9358 17456:ixor            
	// 9359 17457:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9360 17460:aload_0         
	// 9361 17461:getfield        #12  <Field azh a>
	// 9362 17464:astore_1        
		abyte0.M = ((azh) (abyte0)).bh ^ a.M;
	// 9363 17465:aload_1         
	// 9364 17466:aload_1         
	// 9365 17467:getfield        #32  <Field int azh.bh>
	// 9366 17470:aload_0         
	// 9367 17471:getfield        #12  <Field azh a>
	// 9368 17474:getfield        #185 <Field int azh.M>
	// 9369 17477:ixor            
	// 9370 17478:putfield        #185 <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 9371 17481:aload_0         
	// 9372 17482:getfield        #12  <Field azh a>
	// 9373 17485:astore_1        
		abyte0.bh = ((azh) (abyte0)).g & a.M;
	// 9374 17486:aload_1         
	// 9375 17487:aload_1         
	// 9376 17488:getfield        #56  <Field int azh.g>
	// 9377 17491:aload_0         
	// 9378 17492:getfield        #12  <Field azh a>
	// 9379 17495:getfield        #185 <Field int azh.M>
	// 9380 17498:iand            
	// 9381 17499:putfield        #32  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9382 17502:aload_0         
	// 9383 17503:getfield        #12  <Field azh a>
	// 9384 17506:astore_1        
		abyte0.aO = ((azh) (abyte0)).g & a.M;
	// 9385 17507:aload_1         
	// 9386 17508:aload_1         
	// 9387 17509:getfield        #56  <Field int azh.g>
	// 9388 17512:aload_0         
	// 9389 17513:getfield        #12  <Field azh a>
	// 9390 17516:getfield        #185 <Field int azh.M>
	// 9391 17519:iand            
	// 9392 17520:putfield        #86  <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 9393 17523:aload_0         
	// 9394 17524:getfield        #12  <Field azh a>
	// 9395 17527:astore_1        
		abyte0.cd = ((azh) (abyte0)).g & a.M;
	// 9396 17528:aload_1         
	// 9397 17529:aload_1         
	// 9398 17530:getfield        #56  <Field int azh.g>
	// 9399 17533:aload_0         
	// 9400 17534:getfield        #12  <Field azh a>
	// 9401 17537:getfield        #185 <Field int azh.M>
	// 9402 17540:iand            
	// 9403 17541:putfield        #423 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9404 17544:aload_0         
	// 9405 17545:getfield        #12  <Field azh a>
	// 9406 17548:astore_1        
		abyte0.cd = ((azh) (abyte0)).M ^ a.cd;
	// 9407 17549:aload_1         
	// 9408 17550:aload_1         
	// 9409 17551:getfield        #185 <Field int azh.M>
	// 9410 17554:aload_0         
	// 9411 17555:getfield        #12  <Field azh a>
	// 9412 17558:getfield        #423 <Field int azh.cd>
	// 9413 17561:ixor            
	// 9414 17562:putfield        #423 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9415 17565:aload_0         
	// 9416 17566:getfield        #12  <Field azh a>
	// 9417 17569:astore_1        
		abyte0.cf = ((azh) (abyte0)).o | a.M;
	// 9418 17570:aload_1         
	// 9419 17571:aload_1         
	// 9420 17572:getfield        #47  <Field int azh.o>
	// 9421 17575:aload_0         
	// 9422 17576:getfield        #12  <Field azh a>
	// 9423 17579:getfield        #185 <Field int azh.M>
	// 9424 17582:ior             
	// 9425 17583:putfield        #429 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 9426 17586:aload_0         
	// 9427 17587:getfield        #12  <Field azh a>
	// 9428 17590:astore_1        
		abyte0.aF = ((azh) (abyte0)).M ^ a.g;
	// 9429 17591:aload_1         
	// 9430 17592:aload_1         
	// 9431 17593:getfield        #185 <Field int azh.M>
	// 9432 17596:aload_0         
	// 9433 17597:getfield        #12  <Field azh a>
	// 9434 17600:getfield        #56  <Field int azh.g>
	// 9435 17603:ixor            
	// 9436 17604:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 9437 17607:aload_0         
	// 9438 17608:getfield        #12  <Field azh a>
	// 9439 17611:astore_1        
		abyte0.aF = ((azh) (abyte0)).aF ^ a.o;
	// 9440 17612:aload_1         
	// 9441 17613:aload_1         
	// 9442 17614:getfield        #110 <Field int azh.aF>
	// 9443 17617:aload_0         
	// 9444 17618:getfield        #12  <Field azh a>
	// 9445 17621:getfield        #47  <Field int azh.o>
	// 9446 17624:ixor            
	// 9447 17625:putfield        #110 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 9448 17628:aload_0         
	// 9449 17629:getfield        #12  <Field azh a>
	// 9450 17632:astore_1        
		abyte0.cc = ((azh) (abyte0)).G & a.ba;
	// 9451 17633:aload_1         
	// 9452 17634:aload_1         
	// 9453 17635:getfield        #459 <Field int azh.G>
	// 9454 17638:aload_0         
	// 9455 17639:getfield        #12  <Field azh a>
	// 9456 17642:getfield        #477 <Field int azh.ba>
	// 9457 17645:iand            
	// 9458 17646:putfield        #420 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9459 17649:aload_0         
	// 9460 17650:getfield        #12  <Field azh a>
	// 9461 17653:astore_1        
		abyte0.cc = ((azh) (abyte0)).O ^ a.cc;
	// 9462 17654:aload_1         
	// 9463 17655:aload_1         
	// 9464 17656:getfield        #456 <Field int azh.O>
	// 9465 17659:aload_0         
	// 9466 17660:getfield        #12  <Field azh a>
	// 9467 17663:getfield        #420 <Field int azh.cc>
	// 9468 17666:ixor            
	// 9469 17667:putfield        #420 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9470 17670:aload_0         
	// 9471 17671:getfield        #12  <Field azh a>
	// 9472 17674:astore_1        
		abyte0.aX = ((azh) (abyte0)).cc ^ a.aX;
	// 9473 17675:aload_1         
	// 9474 17676:aload_1         
	// 9475 17677:getfield        #420 <Field int azh.cc>
	// 9476 17680:aload_0         
	// 9477 17681:getfield        #12  <Field azh a>
	// 9478 17684:getfield        #44  <Field int azh.aX>
	// 9479 17687:ixor            
	// 9480 17688:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 9481 17691:aload_0         
	// 9482 17692:getfield        #12  <Field azh a>
	// 9483 17695:astore_1        
		abyte0.bu = ((azh) (abyte0)).aX ^ a.bu;
	// 9484 17696:aload_1         
	// 9485 17697:aload_1         
	// 9486 17698:getfield        #44  <Field int azh.aX>
	// 9487 17701:aload_0         
	// 9488 17702:getfield        #12  <Field azh a>
	// 9489 17705:getfield        #474 <Field int azh.bu>
	// 9490 17708:ixor            
	// 9491 17709:putfield        #474 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 9492 17712:aload_0         
	// 9493 17713:getfield        #12  <Field azh a>
	// 9494 17716:astore_1        
		abyte0.bm = ((azh) (abyte0)).cc ^ a.bm;
	// 9495 17717:aload_1         
	// 9496 17718:aload_1         
	// 9497 17719:getfield        #420 <Field int azh.cc>
	// 9498 17722:aload_0         
	// 9499 17723:getfield        #12  <Field azh a>
	// 9500 17726:getfield        #256 <Field int azh.bm>
	// 9501 17729:ixor            
	// 9502 17730:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9503 17733:aload_0         
	// 9504 17734:getfield        #12  <Field azh a>
	// 9505 17737:astore_1        
		abyte0.aL = ((azh) (abyte0)).bm ^ a.aL;
	// 9506 17738:aload_1         
	// 9507 17739:aload_1         
	// 9508 17740:getfield        #256 <Field int azh.bm>
	// 9509 17743:aload_0         
	// 9510 17744:getfield        #12  <Field azh a>
	// 9511 17747:getfield        #220 <Field int azh.aL>
	// 9512 17750:ixor            
	// 9513 17751:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 9514 17754:aload_0         
	// 9515 17755:getfield        #12  <Field azh a>
	// 9516 17758:astore_1        
		abyte0.bz = ((azh) (abyte0)).bm ^ a.bz;
	// 9517 17759:aload_1         
	// 9518 17760:aload_1         
	// 9519 17761:getfield        #256 <Field int azh.bm>
	// 9520 17764:aload_0         
	// 9521 17765:getfield        #12  <Field azh a>
	// 9522 17768:getfield        #107 <Field int azh.bz>
	// 9523 17771:ixor            
	// 9524 17772:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 9525 17775:aload_0         
	// 9526 17776:getfield        #12  <Field azh a>
	// 9527 17779:astore_1        
		abyte0.bt = ((azh) (abyte0)).bz ^ a.bt;
	// 9528 17780:aload_1         
	// 9529 17781:aload_1         
	// 9530 17782:getfield        #107 <Field int azh.bz>
	// 9531 17785:aload_0         
	// 9532 17786:getfield        #12  <Field azh a>
	// 9533 17789:getfield        #447 <Field int azh.bt>
	// 9534 17792:ixor            
	// 9535 17793:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9536 17796:aload_0         
	// 9537 17797:getfield        #12  <Field azh a>
	// 9538 17800:astore_1        
		abyte0.p = ((azh) (abyte0)).bt ^ a.p;
	// 9539 17801:aload_1         
	// 9540 17802:aload_1         
	// 9541 17803:getfield        #447 <Field int azh.bt>
	// 9542 17806:aload_0         
	// 9543 17807:getfield        #12  <Field azh a>
	// 9544 17810:getfield        #486 <Field int azh.p>
	// 9545 17813:ixor            
	// 9546 17814:putfield        #486 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 9547 17817:aload_0         
	// 9548 17818:getfield        #12  <Field azh a>
	// 9549 17821:astore_1        
		abyte0.n = ((azh) (abyte0)).p & a.n;
	// 9550 17822:aload_1         
	// 9551 17823:aload_1         
	// 9552 17824:getfield        #486 <Field int azh.p>
	// 9553 17827:aload_0         
	// 9554 17828:getfield        #12  <Field azh a>
	// 9555 17831:getfield        #80  <Field int azh.n>
	// 9556 17834:iand            
	// 9557 17835:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9558 17838:aload_0         
	// 9559 17839:getfield        #12  <Field azh a>
	// 9560 17842:astore_1        
		abyte0.n = ((azh) (abyte0)).bN ^ a.n;
	// 9561 17843:aload_1         
	// 9562 17844:aload_1         
	// 9563 17845:getfield        #366 <Field int azh.bN>
	// 9564 17848:aload_0         
	// 9565 17849:getfield        #12  <Field azh a>
	// 9566 17852:getfield        #80  <Field int azh.n>
	// 9567 17855:ixor            
	// 9568 17856:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9569 17859:aload_0         
	// 9570 17860:getfield        #12  <Field azh a>
	// 9571 17863:astore_1        
		abyte0.n = ((azh) (abyte0)).x & ~a.n;
	// 9572 17864:aload_1         
	// 9573 17865:aload_1         
	// 9574 17866:getfield        #179 <Field int azh.x>
	// 9575 17869:aload_0         
	// 9576 17870:getfield        #12  <Field azh a>
	// 9577 17873:getfield        #80  <Field int azh.n>
	// 9578 17876:iconst_m1       
	// 9579 17877:ixor            
	// 9580 17878:iand            
	// 9581 17879:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9582 17882:aload_0         
	// 9583 17883:getfield        #12  <Field azh a>
	// 9584 17886:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY | a.p;
	// 9585 17887:aload_1         
	// 9586 17888:aload_1         
	// 9587 17889:getfield        #369 <Field int azh.aY>
	// 9588 17892:aload_0         
	// 9589 17893:getfield        #12  <Field azh a>
	// 9590 17896:getfield        #486 <Field int azh.p>
	// 9591 17899:ior             
	// 9592 17900:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9593 17903:aload_0         
	// 9594 17904:getfield        #12  <Field azh a>
	// 9595 17907:astore_1        
		abyte0.aY = ((azh) (abyte0)).bZ ^ a.aY;
	// 9596 17908:aload_1         
	// 9597 17909:aload_1         
	// 9598 17910:getfield        #402 <Field int azh.bZ>
	// 9599 17913:aload_0         
	// 9600 17914:getfield        #12  <Field azh a>
	// 9601 17917:getfield        #369 <Field int azh.aY>
	// 9602 17920:ixor            
	// 9603 17921:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9604 17924:aload_0         
	// 9605 17925:getfield        #12  <Field azh a>
	// 9606 17928:astore_1        
		abyte0.bN = ((azh) (abyte0)).N | a.p;
	// 9607 17929:aload_1         
	// 9608 17930:aload_1         
	// 9609 17931:getfield        #348 <Field int azh.N>
	// 9610 17934:aload_0         
	// 9611 17935:getfield        #12  <Field azh a>
	// 9612 17938:getfield        #486 <Field int azh.p>
	// 9613 17941:ior             
	// 9614 17942:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 9615 17945:aload_0         
	// 9616 17946:getfield        #12  <Field azh a>
	// 9617 17949:astore_1        
		abyte0.bN = ((azh) (abyte0)).bZ ^ a.bN;
	// 9618 17950:aload_1         
	// 9619 17951:aload_1         
	// 9620 17952:getfield        #402 <Field int azh.bZ>
	// 9621 17955:aload_0         
	// 9622 17956:getfield        #12  <Field azh a>
	// 9623 17959:getfield        #366 <Field int azh.bN>
	// 9624 17962:ixor            
	// 9625 17963:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 9626 17966:aload_0         
	// 9627 17967:getfield        #12  <Field azh a>
	// 9628 17970:astore_1        
		abyte0.bN = ((azh) (abyte0)).x & ~a.bN;
	// 9629 17971:aload_1         
	// 9630 17972:aload_1         
	// 9631 17973:getfield        #179 <Field int azh.x>
	// 9632 17976:aload_0         
	// 9633 17977:getfield        #12  <Field azh a>
	// 9634 17980:getfield        #366 <Field int azh.bN>
	// 9635 17983:iconst_m1       
	// 9636 17984:ixor            
	// 9637 17985:iand            
	// 9638 17986:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 9639 17989:aload_0         
	// 9640 17990:getfield        #12  <Field azh a>
	// 9641 17993:astore_1        
		abyte0.bN = ((azh) (abyte0)).aY ^ a.bN;
	// 9642 17994:aload_1         
	// 9643 17995:aload_1         
	// 9644 17996:getfield        #369 <Field int azh.aY>
	// 9645 17999:aload_0         
	// 9646 18000:getfield        #12  <Field azh a>
	// 9647 18003:getfield        #366 <Field int azh.bN>
	// 9648 18006:ixor            
	// 9649 18007:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 9650 18010:aload_0         
	// 9651 18011:getfield        #12  <Field azh a>
	// 9652 18014:astore_1        
		abyte0.bN = ((azh) (abyte0)).F & a.bN;
	// 9653 18015:aload_1         
	// 9654 18016:aload_1         
	// 9655 18017:getfield        #223 <Field int azh.F>
	// 9656 18020:aload_0         
	// 9657 18021:getfield        #12  <Field azh a>
	// 9658 18024:getfield        #366 <Field int azh.bN>
	// 9659 18027:iand            
	// 9660 18028:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 9661 18031:aload_0         
	// 9662 18032:getfield        #12  <Field azh a>
	// 9663 18035:astore_1        
		abyte0.aY = ((azh) (abyte0)).p & ~a.aZ;
	// 9664 18036:aload_1         
	// 9665 18037:aload_1         
	// 9666 18038:getfield        #486 <Field int azh.p>
	// 9667 18041:aload_0         
	// 9668 18042:getfield        #12  <Field azh a>
	// 9669 18045:getfield        #232 <Field int azh.aZ>
	// 9670 18048:iconst_m1       
	// 9671 18049:ixor            
	// 9672 18050:iand            
	// 9673 18051:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9674 18054:aload_0         
	// 9675 18055:getfield        #12  <Field azh a>
	// 9676 18058:astore_1        
		abyte0.aY = ((azh) (abyte0)).bW ^ a.aY;
	// 9677 18059:aload_1         
	// 9678 18060:aload_1         
	// 9679 18061:getfield        #393 <Field int azh.bW>
	// 9680 18064:aload_0         
	// 9681 18065:getfield        #12  <Field azh a>
	// 9682 18068:getfield        #369 <Field int azh.aY>
	// 9683 18071:ixor            
	// 9684 18072:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9685 18075:aload_0         
	// 9686 18076:getfield        #12  <Field azh a>
	// 9687 18079:astore_1        
		abyte0.bQ = ((azh) (abyte0)).aY ^ a.bQ;
	// 9688 18080:aload_1         
	// 9689 18081:aload_1         
	// 9690 18082:getfield        #369 <Field int azh.aY>
	// 9691 18085:aload_0         
	// 9692 18086:getfield        #12  <Field azh a>
	// 9693 18089:getfield        #375 <Field int azh.bQ>
	// 9694 18092:ixor            
	// 9695 18093:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 9696 18096:aload_0         
	// 9697 18097:getfield        #12  <Field azh a>
	// 9698 18100:astore_1        
		abyte0.bQ = ((azh) (abyte0)).F & a.bQ;
	// 9699 18101:aload_1         
	// 9700 18102:aload_1         
	// 9701 18103:getfield        #223 <Field int azh.F>
	// 9702 18106:aload_0         
	// 9703 18107:getfield        #12  <Field azh a>
	// 9704 18110:getfield        #375 <Field int azh.bQ>
	// 9705 18113:iand            
	// 9706 18114:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 9707 18117:aload_0         
	// 9708 18118:getfield        #12  <Field azh a>
	// 9709 18121:astore_1        
		abyte0.aY = ((azh) (abyte0)).p & ~a.ap;
	// 9710 18122:aload_1         
	// 9711 18123:aload_1         
	// 9712 18124:getfield        #486 <Field int azh.p>
	// 9713 18127:aload_0         
	// 9714 18128:getfield        #12  <Field azh a>
	// 9715 18131:getfield        #333 <Field int azh.ap>
	// 9716 18134:iconst_m1       
	// 9717 18135:ixor            
	// 9718 18136:iand            
	// 9719 18137:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9720 18140:aload_0         
	// 9721 18141:getfield        #12  <Field azh a>
	// 9722 18144:astore_1        
		abyte0.aY = ((azh) (abyte0)).bi ^ a.aY;
	// 9723 18145:aload_1         
	// 9724 18146:aload_1         
	// 9725 18147:getfield        #324 <Field int azh.bi>
	// 9726 18150:aload_0         
	// 9727 18151:getfield        #12  <Field azh a>
	// 9728 18154:getfield        #369 <Field int azh.aY>
	// 9729 18157:ixor            
	// 9730 18158:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9731 18161:aload_0         
	// 9732 18162:getfield        #12  <Field azh a>
	// 9733 18165:astore_1        
		abyte0.ap = ((azh) (abyte0)).p & a.ap;
	// 9734 18166:aload_1         
	// 9735 18167:aload_1         
	// 9736 18168:getfield        #486 <Field int azh.p>
	// 9737 18171:aload_0         
	// 9738 18172:getfield        #12  <Field azh a>
	// 9739 18175:getfield        #333 <Field int azh.ap>
	// 9740 18178:iand            
	// 9741 18179:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9742 18182:aload_0         
	// 9743 18183:getfield        #12  <Field azh a>
	// 9744 18186:astore_1        
		abyte0.ap = ((azh) (abyte0)).aj ^ a.ap;
	// 9745 18187:aload_1         
	// 9746 18188:aload_1         
	// 9747 18189:getfield        #274 <Field int azh.aj>
	// 9748 18192:aload_0         
	// 9749 18193:getfield        #12  <Field azh a>
	// 9750 18196:getfield        #333 <Field int azh.ap>
	// 9751 18199:ixor            
	// 9752 18200:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9753 18203:aload_0         
	// 9754 18204:getfield        #12  <Field azh a>
	// 9755 18207:astore_1        
		abyte0.ap = ((azh) (abyte0)).x & a.ap;
	// 9756 18208:aload_1         
	// 9757 18209:aload_1         
	// 9758 18210:getfield        #179 <Field int azh.x>
	// 9759 18213:aload_0         
	// 9760 18214:getfield        #12  <Field azh a>
	// 9761 18217:getfield        #333 <Field int azh.ap>
	// 9762 18220:iand            
	// 9763 18221:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9764 18224:aload_0         
	// 9765 18225:getfield        #12  <Field azh a>
	// 9766 18228:astore_1        
		abyte0.ap = ((azh) (abyte0)).aY ^ a.ap;
	// 9767 18229:aload_1         
	// 9768 18230:aload_1         
	// 9769 18231:getfield        #369 <Field int azh.aY>
	// 9770 18234:aload_0         
	// 9771 18235:getfield        #12  <Field azh a>
	// 9772 18238:getfield        #333 <Field int azh.ap>
	// 9773 18241:ixor            
	// 9774 18242:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 9775 18245:aload_0         
	// 9776 18246:getfield        #12  <Field azh a>
	// 9777 18249:astore_1        
		abyte0.aZ = ((azh) (abyte0)).p & a.aZ;
	// 9778 18250:aload_1         
	// 9779 18251:aload_1         
	// 9780 18252:getfield        #486 <Field int azh.p>
	// 9781 18255:aload_0         
	// 9782 18256:getfield        #12  <Field azh a>
	// 9783 18259:getfield        #232 <Field int azh.aZ>
	// 9784 18262:iand            
	// 9785 18263:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9786 18266:aload_0         
	// 9787 18267:getfield        #12  <Field azh a>
	// 9788 18270:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bT ^ a.aZ;
	// 9789 18271:aload_1         
	// 9790 18272:aload_1         
	// 9791 18273:getfield        #384 <Field int azh.bT>
	// 9792 18276:aload_0         
	// 9793 18277:getfield        #12  <Field azh a>
	// 9794 18280:getfield        #232 <Field int azh.aZ>
	// 9795 18283:ixor            
	// 9796 18284:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9797 18287:aload_0         
	// 9798 18288:getfield        #12  <Field azh a>
	// 9799 18291:astore_1        
		abyte0.bX = ((azh) (abyte0)).aZ ^ a.bX;
	// 9800 18292:aload_1         
	// 9801 18293:aload_1         
	// 9802 18294:getfield        #232 <Field int azh.aZ>
	// 9803 18297:aload_0         
	// 9804 18298:getfield        #12  <Field azh a>
	// 9805 18301:getfield        #396 <Field int azh.bX>
	// 9806 18304:ixor            
	// 9807 18305:putfield        #396 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9808 18308:aload_0         
	// 9809 18309:getfield        #12  <Field azh a>
	// 9810 18312:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bX ^ a.bQ;
	// 9811 18313:aload_1         
	// 9812 18314:aload_1         
	// 9813 18315:getfield        #396 <Field int azh.bX>
	// 9814 18318:aload_0         
	// 9815 18319:getfield        #12  <Field azh a>
	// 9816 18322:getfield        #375 <Field int azh.bQ>
	// 9817 18325:ixor            
	// 9818 18326:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 9819 18329:aload_0         
	// 9820 18330:getfield        #12  <Field azh a>
	// 9821 18333:astore_1        
		abyte0.C = ((azh) (abyte0)).bQ ^ a.C;
	// 9822 18334:aload_1         
	// 9823 18335:aload_1         
	// 9824 18336:getfield        #375 <Field int azh.bQ>
	// 9825 18339:aload_0         
	// 9826 18340:getfield        #12  <Field azh a>
	// 9827 18343:getfield        #137 <Field int azh.C>
	// 9828 18346:ixor            
	// 9829 18347:putfield        #137 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 9830 18350:aload_0         
	// 9831 18351:getfield        #12  <Field azh a>
	// 9832 18354:astore_1        
		abyte0.bQ = ((azh) (abyte0)).C | a.u;
	// 9833 18355:aload_1         
	// 9834 18356:aload_1         
	// 9835 18357:getfield        #137 <Field int azh.C>
	// 9836 18360:aload_0         
	// 9837 18361:getfield        #12  <Field azh a>
	// 9838 18364:getfield        #441 <Field int azh.u>
	// 9839 18367:ior             
	// 9840 18368:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 9841 18371:aload_0         
	// 9842 18372:getfield        #12  <Field azh a>
	// 9843 18375:astore_1        
		abyte0.bX = ((azh) (abyte0)).K & ~a.bQ;
	// 9844 18376:aload_1         
	// 9845 18377:aload_1         
	// 9846 18378:getfield        #161 <Field int azh.K>
	// 9847 18381:aload_0         
	// 9848 18382:getfield        #12  <Field azh a>
	// 9849 18385:getfield        #375 <Field int azh.bQ>
	// 9850 18388:iconst_m1       
	// 9851 18389:ixor            
	// 9852 18390:iand            
	// 9853 18391:putfield        #396 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9854 18394:aload_0         
	// 9855 18395:getfield        #12  <Field azh a>
	// 9856 18398:astore_1        
		abyte0.aZ = ((azh) (abyte0)).K & ~a.bQ;
	// 9857 18399:aload_1         
	// 9858 18400:aload_1         
	// 9859 18401:getfield        #161 <Field int azh.K>
	// 9860 18404:aload_0         
	// 9861 18405:getfield        #12  <Field azh a>
	// 9862 18408:getfield        #375 <Field int azh.bQ>
	// 9863 18411:iconst_m1       
	// 9864 18412:ixor            
	// 9865 18413:iand            
	// 9866 18414:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9867 18417:aload_0         
	// 9868 18418:getfield        #12  <Field azh a>
	// 9869 18421:astore_1        
		abyte0.aZ = ((azh) (abyte0)).u ^ a.aZ;
	// 9870 18422:aload_1         
	// 9871 18423:aload_1         
	// 9872 18424:getfield        #441 <Field int azh.u>
	// 9873 18427:aload_0         
	// 9874 18428:getfield        #12  <Field azh a>
	// 9875 18431:getfield        #232 <Field int azh.aZ>
	// 9876 18434:ixor            
	// 9877 18435:putfield        #232 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9878 18438:aload_0         
	// 9879 18439:getfield        #12  <Field azh a>
	// 9880 18442:astore_1        
		abyte0.bT = ((azh) (abyte0)).K & ~a.C;
	// 9881 18443:aload_1         
	// 9882 18444:aload_1         
	// 9883 18445:getfield        #161 <Field int azh.K>
	// 9884 18448:aload_0         
	// 9885 18449:getfield        #12  <Field azh a>
	// 9886 18452:getfield        #137 <Field int azh.C>
	// 9887 18455:iconst_m1       
	// 9888 18456:ixor            
	// 9889 18457:iand            
	// 9890 18458:putfield        #384 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 9891 18461:aload_0         
	// 9892 18462:getfield        #12  <Field azh a>
	// 9893 18465:astore_1        
		abyte0.aY = ((azh) (abyte0)).K & ~a.C;
	// 9894 18466:aload_1         
	// 9895 18467:aload_1         
	// 9896 18468:getfield        #161 <Field int azh.K>
	// 9897 18471:aload_0         
	// 9898 18472:getfield        #12  <Field azh a>
	// 9899 18475:getfield        #137 <Field int azh.C>
	// 9900 18478:iconst_m1       
	// 9901 18479:ixor            
	// 9902 18480:iand            
	// 9903 18481:putfield        #369 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9904 18484:aload_0         
	// 9905 18485:getfield        #12  <Field azh a>
	// 9906 18488:astore_1        
		abyte0.bi = ((azh) (abyte0)).C & ~a.S;
	// 9907 18489:aload_1         
	// 9908 18490:aload_1         
	// 9909 18491:getfield        #137 <Field int azh.C>
	// 9910 18494:aload_0         
	// 9911 18495:getfield        #12  <Field azh a>
	// 9912 18498:getfield        #134 <Field int azh.S>
	// 9913 18501:iconst_m1       
	// 9914 18502:ixor            
	// 9915 18503:iand            
	// 9916 18504:putfield        #324 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 9917 18507:aload_0         
	// 9918 18508:getfield        #12  <Field azh a>
	// 9919 18511:astore_1        
		abyte0.bW = ((azh) (abyte0)).K & a.C;
	// 9920 18512:aload_1         
	// 9921 18513:aload_1         
	// 9922 18514:getfield        #161 <Field int azh.K>
	// 9923 18517:aload_0         
	// 9924 18518:getfield        #12  <Field azh a>
	// 9925 18521:getfield        #137 <Field int azh.C>
	// 9926 18524:iand            
	// 9927 18525:putfield        #393 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9928 18528:aload_0         
	// 9929 18529:getfield        #12  <Field azh a>
	// 9930 18532:astore_1        
		abyte0.bt = ((azh) (abyte0)).C & a.u;
	// 9931 18533:aload_1         
	// 9932 18534:aload_1         
	// 9933 18535:getfield        #137 <Field int azh.C>
	// 9934 18538:aload_0         
	// 9935 18539:getfield        #12  <Field azh a>
	// 9936 18542:getfield        #441 <Field int azh.u>
	// 9937 18545:iand            
	// 9938 18546:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9939 18549:aload_0         
	// 9940 18550:getfield        #12  <Field azh a>
	// 9941 18553:astore_1        
		abyte0.cg = ((azh) (abyte0)).bt ^ a.cg;
	// 9942 18554:aload_1         
	// 9943 18555:aload_1         
	// 9944 18556:getfield        #447 <Field int azh.bt>
	// 9945 18559:aload_0         
	// 9946 18560:getfield        #12  <Field azh a>
	// 9947 18563:getfield        #432 <Field int azh.cg>
	// 9948 18566:ixor            
	// 9949 18567:putfield        #432 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9950 18570:aload_0         
	// 9951 18571:getfield        #12  <Field azh a>
	// 9952 18574:astore_1        
		abyte0.bt = ((azh) (abyte0)).K & ~a.C;
	// 9953 18575:aload_1         
	// 9954 18576:aload_1         
	// 9955 18577:getfield        #161 <Field int azh.K>
	// 9956 18580:aload_0         
	// 9957 18581:getfield        #12  <Field azh a>
	// 9958 18584:getfield        #137 <Field int azh.C>
	// 9959 18587:iconst_m1       
	// 9960 18588:ixor            
	// 9961 18589:iand            
	// 9962 18590:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9963 18593:aload_0         
	// 9964 18594:getfield        #12  <Field azh a>
	// 9965 18597:astore_1        
		abyte0.bt = ((azh) (abyte0)).C ^ a.bt;
	// 9966 18598:aload_1         
	// 9967 18599:aload_1         
	// 9968 18600:getfield        #137 <Field int azh.C>
	// 9969 18603:aload_0         
	// 9970 18604:getfield        #12  <Field azh a>
	// 9971 18607:getfield        #447 <Field int azh.bt>
	// 9972 18610:ixor            
	// 9973 18611:putfield        #447 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9974 18614:aload_0         
	// 9975 18615:getfield        #12  <Field azh a>
	// 9976 18618:astore_1        
		abyte0.bz = ((azh) (abyte0)).bt & ~a.S;
	// 9977 18619:aload_1         
	// 9978 18620:aload_1         
	// 9979 18621:getfield        #447 <Field int azh.bt>
	// 9980 18624:aload_0         
	// 9981 18625:getfield        #12  <Field azh a>
	// 9982 18628:getfield        #134 <Field int azh.S>
	// 9983 18631:iconst_m1       
	// 9984 18632:ixor            
	// 9985 18633:iand            
	// 9986 18634:putfield        #107 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 9987 18637:aload_0         
	// 9988 18638:getfield        #12  <Field azh a>
	// 9989 18641:astore_1        
		abyte0.bm = ((azh) (abyte0)).u & ~a.C;
	// 9990 18642:aload_1         
	// 9991 18643:aload_1         
	// 9992 18644:getfield        #441 <Field int azh.u>
	// 9993 18647:aload_0         
	// 9994 18648:getfield        #12  <Field azh a>
	// 9995 18651:getfield        #137 <Field int azh.C>
	// 9996 18654:iconst_m1       
	// 9997 18655:ixor            
	// 9998 18656:iand            
	// 9999 18657:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10000 18660:aload_0         
	// 10001 18661:getfield        #12  <Field azh a>
	// 10002 18664:astore_1        
		abyte0.cc = ((azh) (abyte0)).K & ~a.bm;
	// 10003 18665:aload_1         
	// 10004 18666:aload_1         
	// 10005 18667:getfield        #161 <Field int azh.K>
	// 10006 18670:aload_0         
	// 10007 18671:getfield        #12  <Field azh a>
	// 10008 18674:getfield        #256 <Field int azh.bm>
	// 10009 18677:iconst_m1       
	// 10010 18678:ixor            
	// 10011 18679:iand            
	// 10012 18680:putfield        #420 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10013 18683:aload_0         
	// 10014 18684:getfield        #12  <Field azh a>
	// 10015 18687:astore_1        
		abyte0.cc = ((azh) (abyte0)).bQ ^ a.cc;
	// 10016 18688:aload_1         
	// 10017 18689:aload_1         
	// 10018 18690:getfield        #375 <Field int azh.bQ>
	// 10019 18693:aload_0         
	// 10020 18694:getfield        #12  <Field azh a>
	// 10021 18697:getfield        #420 <Field int azh.cc>
	// 10022 18700:ixor            
	// 10023 18701:putfield        #420 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10024 18704:aload_0         
	// 10025 18705:getfield        #12  <Field azh a>
	// 10026 18708:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bm ^ a.K;
	// 10027 18709:aload_1         
	// 10028 18710:aload_1         
	// 10029 18711:getfield        #256 <Field int azh.bm>
	// 10030 18714:aload_0         
	// 10031 18715:getfield        #12  <Field azh a>
	// 10032 18718:getfield        #161 <Field int azh.K>
	// 10033 18721:ixor            
	// 10034 18722:putfield        #375 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 10035 18725:aload_0         
	// 10036 18726:getfield        #12  <Field azh a>
	// 10037 18729:astore_1        
		abyte0.bm = ((azh) (abyte0)).u & ~a.bm;
	// 10038 18730:aload_1         
	// 10039 18731:aload_1         
	// 10040 18732:getfield        #441 <Field int azh.u>
	// 10041 18735:aload_0         
	// 10042 18736:getfield        #12  <Field azh a>
	// 10043 18739:getfield        #256 <Field int azh.bm>
	// 10044 18742:iconst_m1       
	// 10045 18743:ixor            
	// 10046 18744:iand            
	// 10047 18745:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10048 18748:aload_0         
	// 10049 18749:getfield        #12  <Field azh a>
	// 10050 18752:astore_1        
		abyte0.bm = ((azh) (abyte0)).K & ~a.bm;
	// 10051 18753:aload_1         
	// 10052 18754:aload_1         
	// 10053 18755:getfield        #161 <Field int azh.K>
	// 10054 18758:aload_0         
	// 10055 18759:getfield        #12  <Field azh a>
	// 10056 18762:getfield        #256 <Field int azh.bm>
	// 10057 18765:iconst_m1       
	// 10058 18766:ixor            
	// 10059 18767:iand            
	// 10060 18768:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10061 18771:aload_0         
	// 10062 18772:getfield        #12  <Field azh a>
	// 10063 18775:astore_1        
		abyte0.aX = ((azh) (abyte0)).C ^ a.u;
	// 10064 18776:aload_1         
	// 10065 18777:aload_1         
	// 10066 18778:getfield        #137 <Field int azh.C>
	// 10067 18781:aload_0         
	// 10068 18782:getfield        #12  <Field azh a>
	// 10069 18785:getfield        #441 <Field int azh.u>
	// 10070 18788:ixor            
	// 10071 18789:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10072 18792:aload_0         
	// 10073 18793:getfield        #12  <Field azh a>
	// 10074 18796:astore_1        
		abyte0.aW = ((azh) (abyte0)).aX ^ a.aW;
	// 10075 18797:aload_1         
	// 10076 18798:aload_1         
	// 10077 18799:getfield        #44  <Field int azh.aX>
	// 10078 18802:aload_0         
	// 10079 18803:getfield        #12  <Field azh a>
	// 10080 18806:getfield        #345 <Field int azh.aW>
	// 10081 18809:ixor            
	// 10082 18810:putfield        #345 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 10083 18813:aload_0         
	// 10084 18814:getfield        #12  <Field azh a>
	// 10085 18817:astore_1        
		abyte0.bm = ((azh) (abyte0)).aX ^ a.bm;
	// 10086 18818:aload_1         
	// 10087 18819:aload_1         
	// 10088 18820:getfield        #44  <Field int azh.aX>
	// 10089 18823:aload_0         
	// 10090 18824:getfield        #12  <Field azh a>
	// 10091 18827:getfield        #256 <Field int azh.bm>
	// 10092 18830:ixor            
	// 10093 18831:putfield        #256 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 10094 18834:aload_0         
	// 10095 18835:getfield        #12  <Field azh a>
	// 10096 18838:astore_1        
		abyte0.aX = ((azh) (abyte0)).K & ~a.aX;
	// 10097 18839:aload_1         
	// 10098 18840:aload_1         
	// 10099 18841:getfield        #161 <Field int azh.K>
	// 10100 18844:aload_0         
	// 10101 18845:getfield        #12  <Field azh a>
	// 10102 18848:getfield        #44  <Field int azh.aX>
	// 10103 18851:iconst_m1       
	// 10104 18852:ixor            
	// 10105 18853:iand            
	// 10106 18854:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10107 18857:aload_0         
	// 10108 18858:getfield        #12  <Field azh a>
	// 10109 18861:astore_1        
		abyte0.aX = ((azh) (abyte0)).u ^ a.aX;
	// 10110 18862:aload_1         
	// 10111 18863:aload_1         
	// 10112 18864:getfield        #441 <Field int azh.u>
	// 10113 18867:aload_0         
	// 10114 18868:getfield        #12  <Field azh a>
	// 10115 18871:getfield        #44  <Field int azh.aX>
	// 10116 18874:ixor            
	// 10117 18875:putfield        #44  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10118 18878:aload_0         
	// 10119 18879:getfield        #12  <Field azh a>
	// 10120 18882:astore_1        
		abyte0.bE = ((azh) (abyte0)).C & ~a.u;
	// 10121 18883:aload_1         
	// 10122 18884:aload_1         
	// 10123 18885:getfield        #137 <Field int azh.C>
	// 10124 18888:aload_0         
	// 10125 18889:getfield        #12  <Field azh a>
	// 10126 18892:getfield        #441 <Field int azh.u>
	// 10127 18895:iconst_m1       
	// 10128 18896:ixor            
	// 10129 18897:iand            
	// 10130 18898:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 10131 18901:aload_0         
	// 10132 18902:getfield        #12  <Field azh a>
	// 10133 18905:astore_1        
		abyte0.bH = ((azh) (abyte0)).K & a.bE;
	// 10134 18906:aload_1         
	// 10135 18907:aload_1         
	// 10136 18908:getfield        #161 <Field int azh.K>
	// 10137 18911:aload_0         
	// 10138 18912:getfield        #12  <Field azh a>
	// 10139 18915:getfield        #152 <Field int azh.bE>
	// 10140 18918:iand            
	// 10141 18919:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10142 18922:aload_0         
	// 10143 18923:getfield        #12  <Field azh a>
	// 10144 18926:astore_1        
		abyte0.bH = ((azh) (abyte0)).C ^ a.bH;
	// 10145 18927:aload_1         
	// 10146 18928:aload_1         
	// 10147 18929:getfield        #137 <Field int azh.C>
	// 10148 18932:aload_0         
	// 10149 18933:getfield        #12  <Field azh a>
	// 10150 18936:getfield        #194 <Field int azh.bH>
	// 10151 18939:ixor            
	// 10152 18940:putfield        #194 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10153 18943:aload_0         
	// 10154 18944:getfield        #12  <Field azh a>
	// 10155 18947:astore_1        
		abyte0.ce = ((azh) (abyte0)).u | a.bE;
	// 10156 18948:aload_1         
	// 10157 18949:aload_1         
	// 10158 18950:getfield        #441 <Field int azh.u>
	// 10159 18953:aload_0         
	// 10160 18954:getfield        #12  <Field azh a>
	// 10161 18957:getfield        #152 <Field int azh.bE>
	// 10162 18960:ior             
	// 10163 18961:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10164 18964:aload_0         
	// 10165 18965:getfield        #12  <Field azh a>
	// 10166 18968:astore_1        
		abyte0.bX = ((azh) (abyte0)).ce ^ a.bX;
	// 10167 18969:aload_1         
	// 10168 18970:aload_1         
	// 10169 18971:getfield        #426 <Field int azh.ce>
	// 10170 18974:aload_0         
	// 10171 18975:getfield        #12  <Field azh a>
	// 10172 18978:getfield        #396 <Field int azh.bX>
	// 10173 18981:ixor            
	// 10174 18982:putfield        #396 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10175 18985:aload_0         
	// 10176 18986:getfield        #12  <Field azh a>
	// 10177 18989:astore_1        
		abyte0.bE = ((azh) (abyte0)).K & a.bE;
	// 10178 18990:aload_1         
	// 10179 18991:aload_1         
	// 10180 18992:getfield        #161 <Field int azh.K>
	// 10181 18995:aload_0         
	// 10182 18996:getfield        #12  <Field azh a>
	// 10183 18999:getfield        #152 <Field int azh.bE>
	// 10184 19002:iand            
	// 10185 19003:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 10186 19006:aload_0         
	// 10187 19007:getfield        #12  <Field azh a>
	// 10188 19010:astore_1        
		abyte0.bE = ((azh) (abyte0)).u ^ a.bE;
	// 10189 19011:aload_1         
	// 10190 19012:aload_1         
	// 10191 19013:getfield        #441 <Field int azh.u>
	// 10192 19016:aload_0         
	// 10193 19017:getfield        #12  <Field azh a>
	// 10194 19020:getfield        #152 <Field int azh.bE>
	// 10195 19023:ixor            
	// 10196 19024:putfield        #152 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 10197 19027:aload_0         
	// 10198 19028:getfield        #12  <Field azh a>
	// 10199 19031:astore_1        
		abyte0.aU = ((azh) (abyte0)).C ^ a.aU;
	// 10200 19032:aload_1         
	// 10201 19033:aload_1         
	// 10202 19034:getfield        #137 <Field int azh.C>
	// 10203 19037:aload_0         
	// 10204 19038:getfield        #12  <Field azh a>
	// 10205 19041:getfield        #206 <Field int azh.aU>
	// 10206 19044:ixor            
	// 10207 19045:putfield        #206 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 10208 19048:aload_0         
	// 10209 19049:getfield        #12  <Field azh a>
	// 10210 19052:astore_1        
		abyte0.bZ = ((azh) (abyte0)).p & ~a.bZ;
	// 10211 19053:aload_1         
	// 10212 19054:aload_1         
	// 10213 19055:getfield        #486 <Field int azh.p>
	// 10214 19058:aload_0         
	// 10215 19059:getfield        #12  <Field azh a>
	// 10216 19062:getfield        #402 <Field int azh.bZ>
	// 10217 19065:iconst_m1       
	// 10218 19066:ixor            
	// 10219 19067:iand            
	// 10220 19068:putfield        #402 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 10221 19071:aload_0         
	// 10222 19072:getfield        #12  <Field azh a>
	// 10223 19075:astore_1        
		abyte0.bY = ((azh) (abyte0)).bZ ^ a.bY;
	// 10224 19076:aload_1         
	// 10225 19077:aload_1         
	// 10226 19078:getfield        #402 <Field int azh.bZ>
	// 10227 19081:aload_0         
	// 10228 19082:getfield        #12  <Field azh a>
	// 10229 19085:getfield        #399 <Field int azh.bY>
	// 10230 19088:ixor            
	// 10231 19089:putfield        #399 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 10232 19092:aload_0         
	// 10233 19093:getfield        #12  <Field azh a>
	// 10234 19096:astore_1        
		abyte0.bY = ((azh) (abyte0)).F & ~a.bY;
	// 10235 19097:aload_1         
	// 10236 19098:aload_1         
	// 10237 19099:getfield        #223 <Field int azh.F>
	// 10238 19102:aload_0         
	// 10239 19103:getfield        #12  <Field azh a>
	// 10240 19106:getfield        #399 <Field int azh.bY>
	// 10241 19109:iconst_m1       
	// 10242 19110:ixor            
	// 10243 19111:iand            
	// 10244 19112:putfield        #399 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 10245 19115:aload_0         
	// 10246 19116:getfield        #12  <Field azh a>
	// 10247 19119:astore_1        
		abyte0.bY = ((azh) (abyte0)).ap ^ a.bY;
	// 10248 19120:aload_1         
	// 10249 19121:aload_1         
	// 10250 19122:getfield        #333 <Field int azh.ap>
	// 10251 19125:aload_0         
	// 10252 19126:getfield        #12  <Field azh a>
	// 10253 19129:getfield        #399 <Field int azh.bY>
	// 10254 19132:ixor            
	// 10255 19133:putfield        #399 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 10256 19136:aload_0         
	// 10257 19137:getfield        #12  <Field azh a>
	// 10258 19140:astore_1        
		abyte0.G = ((azh) (abyte0)).bY ^ a.G;
	// 10259 19141:aload_1         
	// 10260 19142:aload_1         
	// 10261 19143:getfield        #399 <Field int azh.bY>
	// 10262 19146:aload_0         
	// 10263 19147:getfield        #12  <Field azh a>
	// 10264 19150:getfield        #459 <Field int azh.G>
	// 10265 19153:ixor            
	// 10266 19154:putfield        #459 <Field int azh.G>
		abyte0 = ((byte []) (a));
	// 10267 19157:aload_0         
	// 10268 19158:getfield        #12  <Field azh a>
	// 10269 19161:astore_1        
		abyte0.bR = ((azh) (abyte0)).p & ~a.bR;
	// 10270 19162:aload_1         
	// 10271 19163:aload_1         
	// 10272 19164:getfield        #486 <Field int azh.p>
	// 10273 19167:aload_0         
	// 10274 19168:getfield        #12  <Field azh a>
	// 10275 19171:getfield        #378 <Field int azh.bR>
	// 10276 19174:iconst_m1       
	// 10277 19175:ixor            
	// 10278 19176:iand            
	// 10279 19177:putfield        #378 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 10280 19180:aload_0         
	// 10281 19181:getfield        #12  <Field azh a>
	// 10282 19184:astore_1        
		abyte0.bR = ((azh) (abyte0)).cb ^ a.bR;
	// 10283 19185:aload_1         
	// 10284 19186:aload_1         
	// 10285 19187:getfield        #408 <Field int azh.cb>
	// 10286 19190:aload_0         
	// 10287 19191:getfield        #12  <Field azh a>
	// 10288 19194:getfield        #378 <Field int azh.bR>
	// 10289 19197:ixor            
	// 10290 19198:putfield        #378 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 10291 19201:aload_0         
	// 10292 19202:getfield        #12  <Field azh a>
	// 10293 19205:astore_1        
		abyte0.bV = ((azh) (abyte0)).bR ^ a.bV;
	// 10294 19206:aload_1         
	// 10295 19207:aload_1         
	// 10296 19208:getfield        #378 <Field int azh.bR>
	// 10297 19211:aload_0         
	// 10298 19212:getfield        #12  <Field azh a>
	// 10299 19215:getfield        #390 <Field int azh.bV>
	// 10300 19218:ixor            
	// 10301 19219:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10302 19222:aload_0         
	// 10303 19223:getfield        #12  <Field azh a>
	// 10304 19226:astore_1        
		abyte0.bS = ((azh) (abyte0)).p & ~a.bS;
	// 10305 19227:aload_1         
	// 10306 19228:aload_1         
	// 10307 19229:getfield        #486 <Field int azh.p>
	// 10308 19232:aload_0         
	// 10309 19233:getfield        #12  <Field azh a>
	// 10310 19236:getfield        #381 <Field int azh.bS>
	// 10311 19239:iconst_m1       
	// 10312 19240:ixor            
	// 10313 19241:iand            
	// 10314 19242:putfield        #381 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10315 19245:aload_0         
	// 10316 19246:getfield        #12  <Field azh a>
	// 10317 19249:astore_1        
		abyte0.bS = ((azh) (abyte0)).ca ^ a.bS;
	// 10318 19250:aload_1         
	// 10319 19251:aload_1         
	// 10320 19252:getfield        #405 <Field int azh.ca>
	// 10321 19255:aload_0         
	// 10322 19256:getfield        #12  <Field azh a>
	// 10323 19259:getfield        #381 <Field int azh.bS>
	// 10324 19262:ixor            
	// 10325 19263:putfield        #381 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10326 19266:aload_0         
	// 10327 19267:getfield        #12  <Field azh a>
	// 10328 19270:astore_1        
		abyte0.n = ((azh) (abyte0)).bS ^ a.n;
	// 10329 19271:aload_1         
	// 10330 19272:aload_1         
	// 10331 19273:getfield        #381 <Field int azh.bS>
	// 10332 19276:aload_0         
	// 10333 19277:getfield        #12  <Field azh a>
	// 10334 19280:getfield        #80  <Field int azh.n>
	// 10335 19283:ixor            
	// 10336 19284:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10337 19287:aload_0         
	// 10338 19288:getfield        #12  <Field azh a>
	// 10339 19291:astore_1        
		abyte0.bN = ((azh) (abyte0)).n ^ a.bN;
	// 10340 19292:aload_1         
	// 10341 19293:aload_1         
	// 10342 19294:getfield        #80  <Field int azh.n>
	// 10343 19297:aload_0         
	// 10344 19298:getfield        #12  <Field azh a>
	// 10345 19301:getfield        #366 <Field int azh.bN>
	// 10346 19304:ixor            
	// 10347 19305:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 10348 19308:aload_0         
	// 10349 19309:getfield        #12  <Field azh a>
	// 10350 19312:astore_1        
		abyte0.ac = ((azh) (abyte0)).bN ^ a.ac;
	// 10351 19313:aload_1         
	// 10352 19314:aload_1         
	// 10353 19315:getfield        #366 <Field int azh.bN>
	// 10354 19318:aload_0         
	// 10355 19319:getfield        #12  <Field azh a>
	// 10356 19322:getfield        #188 <Field int azh.ac>
	// 10357 19325:ixor            
	// 10358 19326:putfield        #188 <Field int azh.ac>
		abyte0 = ((byte []) (a));
	// 10359 19329:aload_0         
	// 10360 19330:getfield        #12  <Field azh a>
	// 10361 19333:astore_1        
		abyte0.bN = ((azh) (abyte0)).ac & ~a.a;
	// 10362 19334:aload_1         
	// 10363 19335:aload_1         
	// 10364 19336:getfield        #188 <Field int azh.ac>
	// 10365 19339:aload_0         
	// 10366 19340:getfield        #12  <Field azh a>
	// 10367 19343:getfield        #208 <Field int azh.a>
	// 10368 19346:iconst_m1       
	// 10369 19347:ixor            
	// 10370 19348:iand            
	// 10371 19349:putfield        #366 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 10372 19352:aload_0         
	// 10373 19353:getfield        #12  <Field azh a>
	// 10374 19356:astore_1        
		abyte0.aV = ((azh) (abyte0)).p & a.aV;
	// 10375 19357:aload_1         
	// 10376 19358:aload_1         
	// 10377 19359:getfield        #486 <Field int azh.p>
	// 10378 19362:aload_0         
	// 10379 19363:getfield        #12  <Field azh a>
	// 10380 19366:getfield        #357 <Field int azh.aV>
	// 10381 19369:iand            
	// 10382 19370:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10383 19373:aload_0         
	// 10384 19374:getfield        #12  <Field azh a>
	// 10385 19377:astore_1        
		abyte0.aV = ((azh) (abyte0)).bU ^ a.aV;
	// 10386 19378:aload_1         
	// 10387 19379:aload_1         
	// 10388 19380:getfield        #387 <Field int azh.bU>
	// 10389 19383:aload_0         
	// 10390 19384:getfield        #12  <Field azh a>
	// 10391 19387:getfield        #357 <Field int azh.aV>
	// 10392 19390:ixor            
	// 10393 19391:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10394 19394:aload_0         
	// 10395 19395:getfield        #12  <Field azh a>
	// 10396 19398:astore_1        
		abyte0.bc = ((azh) (abyte0)).aV ^ a.bc;
	// 10397 19399:aload_1         
	// 10398 19400:aload_1         
	// 10399 19401:getfield        #357 <Field int azh.aV>
	// 10400 19404:aload_0         
	// 10401 19405:getfield        #12  <Field azh a>
	// 10402 19408:getfield        #372 <Field int azh.bc>
	// 10403 19411:ixor            
	// 10404 19412:putfield        #372 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 10405 19415:aload_0         
	// 10406 19416:getfield        #12  <Field azh a>
	// 10407 19419:astore_1        
		abyte0.bc = ((azh) (abyte0)).F & ~a.bc;
	// 10408 19420:aload_1         
	// 10409 19421:aload_1         
	// 10410 19422:getfield        #223 <Field int azh.F>
	// 10411 19425:aload_0         
	// 10412 19426:getfield        #12  <Field azh a>
	// 10413 19429:getfield        #372 <Field int azh.bc>
	// 10414 19432:iconst_m1       
	// 10415 19433:ixor            
	// 10416 19434:iand            
	// 10417 19435:putfield        #372 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 10418 19438:aload_0         
	// 10419 19439:getfield        #12  <Field azh a>
	// 10420 19442:astore_1        
		abyte0.bc = ((azh) (abyte0)).bV ^ a.bc;
	// 10421 19443:aload_1         
	// 10422 19444:aload_1         
	// 10423 19445:getfield        #390 <Field int azh.bV>
	// 10424 19448:aload_0         
	// 10425 19449:getfield        #12  <Field azh a>
	// 10426 19452:getfield        #372 <Field int azh.bc>
	// 10427 19455:ixor            
	// 10428 19456:putfield        #372 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 10429 19459:aload_0         
	// 10430 19460:getfield        #12  <Field azh a>
	// 10431 19463:astore_1        
		abyte0.Y = ((azh) (abyte0)).bc ^ a.Y;
	// 10432 19464:aload_1         
	// 10433 19465:aload_1         
	// 10434 19466:getfield        #372 <Field int azh.bc>
	// 10435 19469:aload_0         
	// 10436 19470:getfield        #12  <Field azh a>
	// 10437 19473:getfield        #489 <Field int azh.Y>
	// 10438 19476:ixor            
	// 10439 19477:putfield        #489 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 10440 19480:aload_0         
	// 10441 19481:getfield        #12  <Field azh a>
	// 10442 19484:astore_1        
		abyte0.br = ((azh) (abyte0)).ba ^ a.br;
	// 10443 19485:aload_1         
	// 10444 19486:aload_1         
	// 10445 19487:getfield        #477 <Field int azh.ba>
	// 10446 19490:aload_0         
	// 10447 19491:getfield        #12  <Field azh a>
	// 10448 19494:getfield        #444 <Field int azh.br>
	// 10449 19497:ixor            
	// 10450 19498:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 10451 19501:aload_0         
	// 10452 19502:getfield        #12  <Field azh a>
	// 10453 19505:astore_1        
		abyte0.br = ((azh) (abyte0)).c & a.br;
	// 10454 19506:aload_1         
	// 10455 19507:aload_1         
	// 10456 19508:getfield        #291 <Field int azh.c>
	// 10457 19511:aload_0         
	// 10458 19512:getfield        #12  <Field azh a>
	// 10459 19515:getfield        #444 <Field int azh.br>
	// 10460 19518:iand            
	// 10461 19519:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 10462 19522:aload_0         
	// 10463 19523:getfield        #12  <Field azh a>
	// 10464 19526:astore_1        
		abyte0.br = ((azh) (abyte0)).bJ ^ a.br;
	// 10465 19527:aload_1         
	// 10466 19528:aload_1         
	// 10467 19529:getfield        #119 <Field int azh.bJ>
	// 10468 19532:aload_0         
	// 10469 19533:getfield        #12  <Field azh a>
	// 10470 19536:getfield        #444 <Field int azh.br>
	// 10471 19539:ixor            
	// 10472 19540:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 10473 19543:aload_0         
	// 10474 19544:getfield        #12  <Field azh a>
	// 10475 19547:astore_1        
		abyte0.bI = ((azh) (abyte0)).br ^ a.bI;
	// 10476 19548:aload_1         
	// 10477 19549:aload_1         
	// 10478 19550:getfield        #444 <Field int azh.br>
	// 10479 19553:aload_0         
	// 10480 19554:getfield        #12  <Field azh a>
	// 10481 19557:getfield        #89  <Field int azh.bI>
	// 10482 19560:ixor            
	// 10483 19561:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10484 19564:aload_0         
	// 10485 19565:getfield        #12  <Field azh a>
	// 10486 19568:astore_1        
		abyte0.bI = ((azh) (abyte0)).ae | a.bI;
	// 10487 19569:aload_1         
	// 10488 19570:aload_1         
	// 10489 19571:getfield        #288 <Field int azh.ae>
	// 10490 19574:aload_0         
	// 10491 19575:getfield        #12  <Field azh a>
	// 10492 19578:getfield        #89  <Field int azh.bI>
	// 10493 19581:ior             
	// 10494 19582:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10495 19585:aload_0         
	// 10496 19586:getfield        #12  <Field azh a>
	// 10497 19589:astore_1        
		abyte0.bI = ((azh) (abyte0)).aL ^ a.bI;
	// 10498 19590:aload_1         
	// 10499 19591:aload_1         
	// 10500 19592:getfield        #220 <Field int azh.aL>
	// 10501 19595:aload_0         
	// 10502 19596:getfield        #12  <Field azh a>
	// 10503 19599:getfield        #89  <Field int azh.bI>
	// 10504 19602:ixor            
	// 10505 19603:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10506 19606:aload_0         
	// 10507 19607:getfield        #12  <Field azh a>
	// 10508 19610:astore_1        
		abyte0.b = ((azh) (abyte0)).bI ^ a.b;
	// 10509 19611:aload_1         
	// 10510 19612:aload_1         
	// 10511 19613:getfield        #89  <Field int azh.bI>
	// 10512 19616:aload_0         
	// 10513 19617:getfield        #12  <Field azh a>
	// 10514 19620:getfield        #492 <Field int azh.b>
	// 10515 19623:ixor            
	// 10516 19624:putfield        #492 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 10517 19627:aload_0         
	// 10518 19628:getfield        #12  <Field azh a>
	// 10519 19631:astore_1        
		abyte0.bI = ((azh) (abyte0)).ad & ~a.b;
	// 10520 19632:aload_1         
	// 10521 19633:aload_1         
	// 10522 19634:getfield        #351 <Field int azh.ad>
	// 10523 19637:aload_0         
	// 10524 19638:getfield        #12  <Field azh a>
	// 10525 19641:getfield        #492 <Field int azh.b>
	// 10526 19644:iconst_m1       
	// 10527 19645:ixor            
	// 10528 19646:iand            
	// 10529 19647:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10530 19650:aload_0         
	// 10531 19651:getfield        #12  <Field azh a>
	// 10532 19654:astore_1        
		abyte0.aL = ((azh) (abyte0)).bI ^ a.N;
	// 10533 19655:aload_1         
	// 10534 19656:aload_1         
	// 10535 19657:getfield        #89  <Field int azh.bI>
	// 10536 19660:aload_0         
	// 10537 19661:getfield        #12  <Field azh a>
	// 10538 19664:getfield        #348 <Field int azh.N>
	// 10539 19667:ixor            
	// 10540 19668:putfield        #220 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 10541 19671:aload_0         
	// 10542 19672:getfield        #12  <Field azh a>
	// 10543 19675:astore_1        
		abyte0.br = ((azh) (abyte0)).bI & ~a.N;
	// 10544 19676:aload_1         
	// 10545 19677:aload_1         
	// 10546 19678:getfield        #89  <Field int azh.bI>
	// 10547 19681:aload_0         
	// 10548 19682:getfield        #12  <Field azh a>
	// 10549 19685:getfield        #348 <Field int azh.N>
	// 10550 19688:iconst_m1       
	// 10551 19689:ixor            
	// 10552 19690:iand            
	// 10553 19691:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 10554 19694:aload_0         
	// 10555 19695:getfield        #12  <Field azh a>
	// 10556 19698:astore_1        
		abyte0.bc = ((azh) (abyte0)).j ^ a.b;
	// 10557 19699:aload_1         
	// 10558 19700:aload_1         
	// 10559 19701:getfield        #280 <Field int azh.j>
	// 10560 19704:aload_0         
	// 10561 19705:getfield        #12  <Field azh a>
	// 10562 19708:getfield        #492 <Field int azh.b>
	// 10563 19711:ixor            
	// 10564 19712:putfield        #372 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 10565 19715:aload_0         
	// 10566 19716:getfield        #12  <Field azh a>
	// 10567 19719:astore_1        
		abyte0.bV = ((azh) (abyte0)).r | a.bc;
	// 10568 19720:aload_1         
	// 10569 19721:aload_1         
	// 10570 19722:getfield        #170 <Field int azh.r>
	// 10571 19725:aload_0         
	// 10572 19726:getfield        #12  <Field azh a>
	// 10573 19729:getfield        #372 <Field int azh.bc>
	// 10574 19732:ior             
	// 10575 19733:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10576 19736:aload_0         
	// 10577 19737:getfield        #12  <Field azh a>
	// 10578 19740:astore_1        
		abyte0.bw = ((azh) (abyte0)).bc ^ a.bw;
	// 10579 19741:aload_1         
	// 10580 19742:aload_1         
	// 10581 19743:getfield        #372 <Field int azh.bc>
	// 10582 19746:aload_0         
	// 10583 19747:getfield        #12  <Field azh a>
	// 10584 19750:getfield        #271 <Field int azh.bw>
	// 10585 19753:ixor            
	// 10586 19754:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10587 19757:aload_0         
	// 10588 19758:getfield        #12  <Field azh a>
	// 10589 19761:astore_1        
		abyte0.bw = ((azh) (abyte0)).z & a.bw;
	// 10590 19762:aload_1         
	// 10591 19763:aload_1         
	// 10592 19764:getfield        #330 <Field int azh.z>
	// 10593 19767:aload_0         
	// 10594 19768:getfield        #12  <Field azh a>
	// 10595 19771:getfield        #271 <Field int azh.bw>
	// 10596 19774:iand            
	// 10597 19775:putfield        #271 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10598 19778:aload_0         
	// 10599 19779:getfield        #12  <Field azh a>
	// 10600 19782:astore_1        
		abyte0.aV = ((azh) (abyte0)).bc & ~a.r;
	// 10601 19783:aload_1         
	// 10602 19784:aload_1         
	// 10603 19785:getfield        #372 <Field int azh.bc>
	// 10604 19788:aload_0         
	// 10605 19789:getfield        #12  <Field azh a>
	// 10606 19792:getfield        #170 <Field int azh.r>
	// 10607 19795:iconst_m1       
	// 10608 19796:ixor            
	// 10609 19797:iand            
	// 10610 19798:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10611 19801:aload_0         
	// 10612 19802:getfield        #12  <Field azh a>
	// 10613 19805:astore_1        
		abyte0.aV = ((azh) (abyte0)).bc ^ a.aV;
	// 10614 19806:aload_1         
	// 10615 19807:aload_1         
	// 10616 19808:getfield        #372 <Field int azh.bc>
	// 10617 19811:aload_0         
	// 10618 19812:getfield        #12  <Field azh a>
	// 10619 19815:getfield        #357 <Field int azh.aV>
	// 10620 19818:ixor            
	// 10621 19819:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10622 19822:aload_0         
	// 10623 19823:getfield        #12  <Field azh a>
	// 10624 19826:astore_1        
		abyte0.aR = ((azh) (abyte0)).aV ^ a.aR;
	// 10625 19827:aload_1         
	// 10626 19828:aload_1         
	// 10627 19829:getfield        #357 <Field int azh.aV>
	// 10628 19832:aload_0         
	// 10629 19833:getfield        #12  <Field azh a>
	// 10630 19836:getfield        #217 <Field int azh.aR>
	// 10631 19839:ixor            
	// 10632 19840:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10633 19843:aload_0         
	// 10634 19844:getfield        #12  <Field azh a>
	// 10635 19847:astore_1        
		abyte0.aR = ((azh) (abyte0)).al & ~a.aR;
	// 10636 19848:aload_1         
	// 10637 19849:aload_1         
	// 10638 19850:getfield        #354 <Field int azh.al>
	// 10639 19853:aload_0         
	// 10640 19854:getfield        #12  <Field azh a>
	// 10641 19857:getfield        #217 <Field int azh.aR>
	// 10642 19860:iconst_m1       
	// 10643 19861:ixor            
	// 10644 19862:iand            
	// 10645 19863:putfield        #217 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10646 19866:aload_0         
	// 10647 19867:getfield        #12  <Field azh a>
	// 10648 19870:astore_1        
		abyte0.aV = ((azh) (abyte0)).aV & a.z;
	// 10649 19871:aload_1         
	// 10650 19872:aload_1         
	// 10651 19873:getfield        #357 <Field int azh.aV>
	// 10652 19876:aload_0         
	// 10653 19877:getfield        #12  <Field azh a>
	// 10654 19880:getfield        #330 <Field int azh.z>
	// 10655 19883:iand            
	// 10656 19884:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10657 19887:aload_0         
	// 10658 19888:getfield        #12  <Field azh a>
	// 10659 19891:astore_1        
		abyte0.bU = ((azh) (abyte0)).bc ^ a.r;
	// 10660 19892:aload_1         
	// 10661 19893:aload_1         
	// 10662 19894:getfield        #372 <Field int azh.bc>
	// 10663 19897:aload_0         
	// 10664 19898:getfield        #12  <Field azh a>
	// 10665 19901:getfield        #170 <Field int azh.r>
	// 10666 19904:ixor            
	// 10667 19905:putfield        #387 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10668 19908:aload_0         
	// 10669 19909:getfield        #12  <Field azh a>
	// 10670 19912:astore_1        
		abyte0.bq = ((azh) (abyte0)).b ^ a.bq;
	// 10671 19913:aload_1         
	// 10672 19914:aload_1         
	// 10673 19915:getfield        #492 <Field int azh.b>
	// 10674 19918:aload_0         
	// 10675 19919:getfield        #12  <Field azh a>
	// 10676 19922:getfield        #360 <Field int azh.bq>
	// 10677 19925:ixor            
	// 10678 19926:putfield        #360 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 10679 19929:aload_0         
	// 10680 19930:getfield        #12  <Field azh a>
	// 10681 19933:astore_1        
		abyte0.aH = ((azh) (abyte0)).bq ^ a.aH;
	// 10682 19934:aload_1         
	// 10683 19935:aload_1         
	// 10684 19936:getfield        #360 <Field int azh.bq>
	// 10685 19939:aload_0         
	// 10686 19940:getfield        #12  <Field azh a>
	// 10687 19943:getfield        #214 <Field int azh.aH>
	// 10688 19946:ixor            
	// 10689 19947:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10690 19950:aload_0         
	// 10691 19951:getfield        #12  <Field azh a>
	// 10692 19954:astore_1        
		abyte0.bq = ((azh) (abyte0)).j & a.b;
	// 10693 19955:aload_1         
	// 10694 19956:aload_1         
	// 10695 19957:getfield        #280 <Field int azh.j>
	// 10696 19960:aload_0         
	// 10697 19961:getfield        #12  <Field azh a>
	// 10698 19964:getfield        #492 <Field int azh.b>
	// 10699 19967:iand            
	// 10700 19968:putfield        #360 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 10701 19971:aload_0         
	// 10702 19972:getfield        #12  <Field azh a>
	// 10703 19975:astore_1        
		abyte0.aV = ((azh) (abyte0)).bq ^ a.aV;
	// 10704 19976:aload_1         
	// 10705 19977:aload_1         
	// 10706 19978:getfield        #360 <Field int azh.bq>
	// 10707 19981:aload_0         
	// 10708 19982:getfield        #12  <Field azh a>
	// 10709 19985:getfield        #357 <Field int azh.aV>
	// 10710 19988:ixor            
	// 10711 19989:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10712 19992:aload_0         
	// 10713 19993:getfield        #12  <Field azh a>
	// 10714 19996:astore_1        
		abyte0.aV = ((azh) (abyte0)).al & a.aV;
	// 10715 19997:aload_1         
	// 10716 19998:aload_1         
	// 10717 19999:getfield        #354 <Field int azh.al>
	// 10718 20002:aload_0         
	// 10719 20003:getfield        #12  <Field azh a>
	// 10720 20006:getfield        #357 <Field int azh.aV>
	// 10721 20009:iand            
	// 10722 20010:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10723 20013:aload_0         
	// 10724 20014:getfield        #12  <Field azh a>
	// 10725 20017:astore_1        
		abyte0.n = ((azh) (abyte0)).bq ^ a.r;
	// 10726 20018:aload_1         
	// 10727 20019:aload_1         
	// 10728 20020:getfield        #360 <Field int azh.bq>
	// 10729 20023:aload_0         
	// 10730 20024:getfield        #12  <Field azh a>
	// 10731 20027:getfield        #170 <Field int azh.r>
	// 10732 20030:ixor            
	// 10733 20031:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10734 20034:aload_0         
	// 10735 20035:getfield        #12  <Field azh a>
	// 10736 20038:astore_1        
		abyte0.n = ((azh) (abyte0)).z | a.n;
	// 10737 20039:aload_1         
	// 10738 20040:aload_1         
	// 10739 20041:getfield        #330 <Field int azh.z>
	// 10740 20044:aload_0         
	// 10741 20045:getfield        #12  <Field azh a>
	// 10742 20048:getfield        #80  <Field int azh.n>
	// 10743 20051:ior             
	// 10744 20052:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10745 20055:aload_0         
	// 10746 20056:getfield        #12  <Field azh a>
	// 10747 20059:astore_1        
		abyte0.bs = ((azh) (abyte0)).bq ^ a.bs;
	// 10748 20060:aload_1         
	// 10749 20061:aload_1         
	// 10750 20062:getfield        #360 <Field int azh.bq>
	// 10751 20065:aload_0         
	// 10752 20066:getfield        #12  <Field azh a>
	// 10753 20069:getfield        #200 <Field int azh.bs>
	// 10754 20072:ixor            
	// 10755 20073:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 10756 20076:aload_0         
	// 10757 20077:getfield        #12  <Field azh a>
	// 10758 20080:astore_1        
		abyte0.bS = ((azh) (abyte0)).bs & ~a.z;
	// 10759 20081:aload_1         
	// 10760 20082:aload_1         
	// 10761 20083:getfield        #200 <Field int azh.bs>
	// 10762 20086:aload_0         
	// 10763 20087:getfield        #12  <Field azh a>
	// 10764 20090:getfield        #330 <Field int azh.z>
	// 10765 20093:iconst_m1       
	// 10766 20094:ixor            
	// 10767 20095:iand            
	// 10768 20096:putfield        #381 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10769 20099:aload_0         
	// 10770 20100:getfield        #12  <Field azh a>
	// 10771 20103:astore_1        
		abyte0.bS = ((azh) (abyte0)).bS & a.al;
	// 10772 20104:aload_1         
	// 10773 20105:aload_1         
	// 10774 20106:getfield        #381 <Field int azh.bS>
	// 10775 20109:aload_0         
	// 10776 20110:getfield        #12  <Field azh a>
	// 10777 20113:getfield        #354 <Field int azh.al>
	// 10778 20116:iand            
	// 10779 20117:putfield        #381 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10780 20120:aload_0         
	// 10781 20121:getfield        #12  <Field azh a>
	// 10782 20124:astore_1        
		abyte0.bs = ((azh) (abyte0)).z & ~a.bs;
	// 10783 20125:aload_1         
	// 10784 20126:aload_1         
	// 10785 20127:getfield        #330 <Field int azh.z>
	// 10786 20130:aload_0         
	// 10787 20131:getfield        #12  <Field azh a>
	// 10788 20134:getfield        #200 <Field int azh.bs>
	// 10789 20137:iconst_m1       
	// 10790 20138:ixor            
	// 10791 20139:iand            
	// 10792 20140:putfield        #200 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 10793 20143:aload_0         
	// 10794 20144:getfield        #12  <Field azh a>
	// 10795 20147:astore_1        
		abyte0.ca = ((azh) (abyte0)).b & ~a.bq;
	// 10796 20148:aload_1         
	// 10797 20149:aload_1         
	// 10798 20150:getfield        #492 <Field int azh.b>
	// 10799 20153:aload_0         
	// 10800 20154:getfield        #12  <Field azh a>
	// 10801 20157:getfield        #360 <Field int azh.bq>
	// 10802 20160:iconst_m1       
	// 10803 20161:ixor            
	// 10804 20162:iand            
	// 10805 20163:putfield        #405 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 10806 20166:aload_0         
	// 10807 20167:getfield        #12  <Field azh a>
	// 10808 20170:astore_1        
		abyte0.bR = ((azh) (abyte0)).bq & ~a.r;
	// 10809 20171:aload_1         
	// 10810 20172:aload_1         
	// 10811 20173:getfield        #360 <Field int azh.bq>
	// 10812 20176:aload_0         
	// 10813 20177:getfield        #12  <Field azh a>
	// 10814 20180:getfield        #170 <Field int azh.r>
	// 10815 20183:iconst_m1       
	// 10816 20184:ixor            
	// 10817 20185:iand            
	// 10818 20186:putfield        #378 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 10819 20189:aload_0         
	// 10820 20190:getfield        #12  <Field azh a>
	// 10821 20193:astore_1        
		abyte0.bR = ((azh) (abyte0)).j ^ a.bR;
	// 10822 20194:aload_1         
	// 10823 20195:aload_1         
	// 10824 20196:getfield        #280 <Field int azh.j>
	// 10825 20199:aload_0         
	// 10826 20200:getfield        #12  <Field azh a>
	// 10827 20203:getfield        #378 <Field int azh.bR>
	// 10828 20206:ixor            
	// 10829 20207:putfield        #378 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 10830 20210:aload_0         
	// 10831 20211:getfield        #12  <Field azh a>
	// 10832 20214:astore_1        
		abyte0.cb = ((azh) (abyte0)).N | a.b;
	// 10833 20215:aload_1         
	// 10834 20216:aload_1         
	// 10835 20217:getfield        #348 <Field int azh.N>
	// 10836 20220:aload_0         
	// 10837 20221:getfield        #12  <Field azh a>
	// 10838 20224:getfield        #492 <Field int azh.b>
	// 10839 20227:ior             
	// 10840 20228:putfield        #408 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10841 20231:aload_0         
	// 10842 20232:getfield        #12  <Field azh a>
	// 10843 20235:astore_1        
		abyte0.cb = ((azh) (abyte0)).bI ^ a.cb;
	// 10844 20236:aload_1         
	// 10845 20237:aload_1         
	// 10846 20238:getfield        #89  <Field int azh.bI>
	// 10847 20241:aload_0         
	// 10848 20242:getfield        #12  <Field azh a>
	// 10849 20245:getfield        #408 <Field int azh.cb>
	// 10850 20248:ixor            
	// 10851 20249:putfield        #408 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10852 20252:aload_0         
	// 10853 20253:getfield        #12  <Field azh a>
	// 10854 20256:astore_1        
		abyte0.cb = ((azh) (abyte0)).al & ~a.cb;
	// 10855 20257:aload_1         
	// 10856 20258:aload_1         
	// 10857 20259:getfield        #354 <Field int azh.al>
	// 10858 20262:aload_0         
	// 10859 20263:getfield        #12  <Field azh a>
	// 10860 20266:getfield        #408 <Field int azh.cb>
	// 10861 20269:iconst_m1       
	// 10862 20270:ixor            
	// 10863 20271:iand            
	// 10864 20272:putfield        #408 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10865 20275:aload_0         
	// 10866 20276:getfield        #12  <Field azh a>
	// 10867 20279:astore_1        
		abyte0.bY = ((azh) (abyte0)).b | a.ad;
	// 10868 20280:aload_1         
	// 10869 20281:aload_1         
	// 10870 20282:getfield        #492 <Field int azh.b>
	// 10871 20285:aload_0         
	// 10872 20286:getfield        #12  <Field azh a>
	// 10873 20289:getfield        #351 <Field int azh.ad>
	// 10874 20292:ior             
	// 10875 20293:putfield        #399 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 10876 20296:aload_0         
	// 10877 20297:getfield        #12  <Field azh a>
	// 10878 20300:astore_1        
		abyte0.ap = ((azh) (abyte0)).N | a.bY;
	// 10879 20301:aload_1         
	// 10880 20302:aload_1         
	// 10881 20303:getfield        #348 <Field int azh.N>
	// 10882 20306:aload_0         
	// 10883 20307:getfield        #12  <Field azh a>
	// 10884 20310:getfield        #399 <Field int azh.bY>
	// 10885 20313:ior             
	// 10886 20314:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10887 20317:aload_0         
	// 10888 20318:getfield        #12  <Field azh a>
	// 10889 20321:astore_1        
		abyte0.ap = ((azh) (abyte0)).ad ^ a.ap;
	// 10890 20322:aload_1         
	// 10891 20323:aload_1         
	// 10892 20324:getfield        #351 <Field int azh.ad>
	// 10893 20327:aload_0         
	// 10894 20328:getfield        #12  <Field azh a>
	// 10895 20331:getfield        #333 <Field int azh.ap>
	// 10896 20334:ixor            
	// 10897 20335:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 10898 20338:aload_0         
	// 10899 20339:getfield        #12  <Field azh a>
	// 10900 20342:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bY & ~a.N;
	// 10901 20343:aload_1         
	// 10902 20344:aload_1         
	// 10903 20345:getfield        #399 <Field int azh.bY>
	// 10904 20348:aload_0         
	// 10905 20349:getfield        #12  <Field azh a>
	// 10906 20352:getfield        #348 <Field int azh.N>
	// 10907 20355:iconst_m1       
	// 10908 20356:ixor            
	// 10909 20357:iand            
	// 10910 20358:putfield        #402 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 10911 20361:aload_0         
	// 10912 20362:getfield        #12  <Field azh a>
	// 10913 20365:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bI ^ a.bZ;
	// 10914 20366:aload_1         
	// 10915 20367:aload_1         
	// 10916 20368:getfield        #89  <Field int azh.bI>
	// 10917 20371:aload_0         
	// 10918 20372:getfield        #12  <Field azh a>
	// 10919 20375:getfield        #402 <Field int azh.bZ>
	// 10920 20378:ixor            
	// 10921 20379:putfield        #402 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 10922 20382:aload_0         
	// 10923 20383:getfield        #12  <Field azh a>
	// 10924 20386:astore_1        
		abyte0.br = ((azh) (abyte0)).bY ^ a.br;
	// 10925 20387:aload_1         
	// 10926 20388:aload_1         
	// 10927 20389:getfield        #399 <Field int azh.bY>
	// 10928 20392:aload_0         
	// 10929 20393:getfield        #12  <Field azh a>
	// 10930 20396:getfield        #444 <Field int azh.br>
	// 10931 20399:ixor            
	// 10932 20400:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 10933 20403:aload_0         
	// 10934 20404:getfield        #12  <Field azh a>
	// 10935 20407:astore_1        
		abyte0.bI = ((azh) (abyte0)).bY & ~a.N;
	// 10936 20408:aload_1         
	// 10937 20409:aload_1         
	// 10938 20410:getfield        #399 <Field int azh.bY>
	// 10939 20413:aload_0         
	// 10940 20414:getfield        #12  <Field azh a>
	// 10941 20417:getfield        #348 <Field int azh.N>
	// 10942 20420:iconst_m1       
	// 10943 20421:ixor            
	// 10944 20422:iand            
	// 10945 20423:putfield        #89  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 10946 20426:aload_0         
	// 10947 20427:getfield        #12  <Field azh a>
	// 10948 20430:astore_1        
		abyte0.ce = ((azh) (abyte0)).bY & ~a.ad;
	// 10949 20431:aload_1         
	// 10950 20432:aload_1         
	// 10951 20433:getfield        #399 <Field int azh.bY>
	// 10952 20436:aload_0         
	// 10953 20437:getfield        #12  <Field azh a>
	// 10954 20440:getfield        #351 <Field int azh.ad>
	// 10955 20443:iconst_m1       
	// 10956 20444:ixor            
	// 10957 20445:iand            
	// 10958 20446:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10959 20449:aload_0         
	// 10960 20450:getfield        #12  <Field azh a>
	// 10961 20453:astore_1        
		abyte0.as = ((azh) (abyte0)).al | a.ce;
	// 10962 20454:aload_1         
	// 10963 20455:aload_1         
	// 10964 20456:getfield        #354 <Field int azh.al>
	// 10965 20459:aload_0         
	// 10966 20460:getfield        #12  <Field azh a>
	// 10967 20463:getfield        #426 <Field int azh.ce>
	// 10968 20466:ior             
	// 10969 20467:putfield        #140 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 10970 20470:aload_0         
	// 10971 20471:getfield        #12  <Field azh a>
	// 10972 20474:astore_1        
		abyte0.bf = ((azh) (abyte0)).N | a.ce;
	// 10973 20475:aload_1         
	// 10974 20476:aload_1         
	// 10975 20477:getfield        #348 <Field int azh.N>
	// 10976 20480:aload_0         
	// 10977 20481:getfield        #12  <Field azh a>
	// 10978 20484:getfield        #426 <Field int azh.ce>
	// 10979 20487:ior             
	// 10980 20488:putfield        #247 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 10981 20491:aload_0         
	// 10982 20492:getfield        #12  <Field azh a>
	// 10983 20495:astore_1        
		abyte0.bf = ((azh) (abyte0)).al & ~a.bf;
	// 10984 20496:aload_1         
	// 10985 20497:aload_1         
	// 10986 20498:getfield        #354 <Field int azh.al>
	// 10987 20501:aload_0         
	// 10988 20502:getfield        #12  <Field azh a>
	// 10989 20505:getfield        #247 <Field int azh.bf>
	// 10990 20508:iconst_m1       
	// 10991 20509:ixor            
	// 10992 20510:iand            
	// 10993 20511:putfield        #247 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 10994 20514:aload_0         
	// 10995 20515:getfield        #12  <Field azh a>
	// 10996 20518:astore_1        
		abyte0.bC = ((azh) (abyte0)).b & ~a.N;
	// 10997 20519:aload_1         
	// 10998 20520:aload_1         
	// 10999 20521:getfield        #492 <Field int azh.b>
	// 11000 20524:aload_0         
	// 11001 20525:getfield        #12  <Field azh a>
	// 11002 20528:getfield        #348 <Field int azh.N>
	// 11003 20531:iconst_m1       
	// 11004 20532:ixor            
	// 11005 20533:iand            
	// 11006 20534:putfield        #268 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 11007 20537:aload_0         
	// 11008 20538:getfield        #12  <Field azh a>
	// 11009 20541:astore_1        
		abyte0.bf = ((azh) (abyte0)).bC ^ a.bf;
	// 11010 20542:aload_1         
	// 11011 20543:aload_1         
	// 11012 20544:getfield        #268 <Field int azh.bC>
	// 11013 20547:aload_0         
	// 11014 20548:getfield        #12  <Field azh a>
	// 11015 20551:getfield        #247 <Field int azh.bf>
	// 11016 20554:ixor            
	// 11017 20555:putfield        #247 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 11018 20558:aload_0         
	// 11019 20559:getfield        #12  <Field azh a>
	// 11020 20562:astore_1        
		abyte0.aN = ((azh) (abyte0)).b & ~a.ad;
	// 11021 20563:aload_1         
	// 11022 20564:aload_1         
	// 11023 20565:getfield        #492 <Field int azh.b>
	// 11024 20568:aload_0         
	// 11025 20569:getfield        #12  <Field azh a>
	// 11026 20572:getfield        #351 <Field int azh.ad>
	// 11027 20575:iconst_m1       
	// 11028 20576:ixor            
	// 11029 20577:iand            
	// 11030 20578:putfield        #35  <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 11031 20581:aload_0         
	// 11032 20582:getfield        #12  <Field azh a>
	// 11033 20585:astore_1        
		abyte0.bF = ((azh) (abyte0)).aN & ~a.N;
	// 11034 20586:aload_1         
	// 11035 20587:aload_1         
	// 11036 20588:getfield        #35  <Field int azh.aN>
	// 11037 20591:aload_0         
	// 11038 20592:getfield        #12  <Field azh a>
	// 11039 20595:getfield        #348 <Field int azh.N>
	// 11040 20598:iconst_m1       
	// 11041 20599:ixor            
	// 11042 20600:iand            
	// 11043 20601:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 11044 20604:aload_0         
	// 11045 20605:getfield        #12  <Field azh a>
	// 11046 20608:astore_1        
		abyte0.bF = ((azh) (abyte0)).ce ^ a.bF;
	// 11047 20609:aload_1         
	// 11048 20610:aload_1         
	// 11049 20611:getfield        #426 <Field int azh.ce>
	// 11050 20614:aload_0         
	// 11051 20615:getfield        #12  <Field azh a>
	// 11052 20618:getfield        #68  <Field int azh.bF>
	// 11053 20621:ixor            
	// 11054 20622:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 11055 20625:aload_0         
	// 11056 20626:getfield        #12  <Field azh a>
	// 11057 20629:astore_1        
		abyte0.av = ((azh) (abyte0)).al | a.bF;
	// 11058 20630:aload_1         
	// 11059 20631:aload_1         
	// 11060 20632:getfield        #354 <Field int azh.al>
	// 11061 20635:aload_0         
	// 11062 20636:getfield        #12  <Field azh a>
	// 11063 20639:getfield        #68  <Field int azh.bF>
	// 11064 20642:ior             
	// 11065 20643:putfield        #411 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 11066 20646:aload_0         
	// 11067 20647:getfield        #12  <Field azh a>
	// 11068 20650:astore_1        
		abyte0.bP = ((azh) (abyte0)).bF ^ a.bP;
	// 11069 20651:aload_1         
	// 11070 20652:aload_1         
	// 11071 20653:getfield        #68  <Field int azh.bF>
	// 11072 20656:aload_0         
	// 11073 20657:getfield        #12  <Field azh a>
	// 11074 20660:getfield        #363 <Field int azh.bP>
	// 11075 20663:ixor            
	// 11076 20664:putfield        #363 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 11077 20667:aload_0         
	// 11078 20668:getfield        #12  <Field azh a>
	// 11079 20671:astore_1        
		abyte0.bP = ((azh) (abyte0)).bP & ~a.V;
	// 11080 20672:aload_1         
	// 11081 20673:aload_1         
	// 11082 20674:getfield        #363 <Field int azh.bP>
	// 11083 20677:aload_0         
	// 11084 20678:getfield        #12  <Field azh a>
	// 11085 20681:getfield        #450 <Field int azh.V>
	// 11086 20684:iconst_m1       
	// 11087 20685:ixor            
	// 11088 20686:iand            
	// 11089 20687:putfield        #363 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 11090 20690:aload_0         
	// 11091 20691:getfield        #12  <Field azh a>
	// 11092 20694:astore_1        
		abyte0.bF = ((azh) (abyte0)).aN & ~a.N;
	// 11093 20695:aload_1         
	// 11094 20696:aload_1         
	// 11095 20697:getfield        #35  <Field int azh.aN>
	// 11096 20700:aload_0         
	// 11097 20701:getfield        #12  <Field azh a>
	// 11098 20704:getfield        #348 <Field int azh.N>
	// 11099 20707:iconst_m1       
	// 11100 20708:ixor            
	// 11101 20709:iand            
	// 11102 20710:putfield        #68  <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 11103 20713:aload_0         
	// 11104 20714:getfield        #12  <Field azh a>
	// 11105 20717:astore_1        
		abyte0.aM = ((azh) (abyte0)).r | a.b;
	// 11106 20718:aload_1         
	// 11107 20719:aload_1         
	// 11108 20720:getfield        #170 <Field int azh.r>
	// 11109 20723:aload_0         
	// 11110 20724:getfield        #12  <Field azh a>
	// 11111 20727:getfield        #492 <Field int azh.b>
	// 11112 20730:ior             
	// 11113 20731:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 11114 20734:aload_0         
	// 11115 20735:getfield        #12  <Field azh a>
	// 11116 20738:astore_1        
		abyte0.au = ((azh) (abyte0)).N | a.b;
	// 11117 20739:aload_1         
	// 11118 20740:aload_1         
	// 11119 20741:getfield        #348 <Field int azh.N>
	// 11120 20744:aload_0         
	// 11121 20745:getfield        #12  <Field azh a>
	// 11122 20748:getfield        #492 <Field int azh.b>
	// 11123 20751:ior             
	// 11124 20752:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 11125 20755:aload_0         
	// 11126 20756:getfield        #12  <Field azh a>
	// 11127 20759:astore_1        
		abyte0.am = ((azh) (abyte0)).au & ~a.al;
	// 11128 20760:aload_1         
	// 11129 20761:aload_1         
	// 11130 20762:getfield        #146 <Field int azh.au>
	// 11131 20765:aload_0         
	// 11132 20766:getfield        #12  <Field azh a>
	// 11133 20769:getfield        #354 <Field int azh.al>
	// 11134 20772:iconst_m1       
	// 11135 20773:ixor            
	// 11136 20774:iand            
	// 11137 20775:putfield        #465 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11138 20778:aload_0         
	// 11139 20779:getfield        #12  <Field azh a>
	// 11140 20782:astore_1        
		abyte0.am = ((azh) (abyte0)).bC ^ a.am;
	// 11141 20783:aload_1         
	// 11142 20784:aload_1         
	// 11143 20785:getfield        #268 <Field int azh.bC>
	// 11144 20788:aload_0         
	// 11145 20789:getfield        #12  <Field azh a>
	// 11146 20792:getfield        #465 <Field int azh.am>
	// 11147 20795:ixor            
	// 11148 20796:putfield        #465 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11149 20799:aload_0         
	// 11150 20800:getfield        #12  <Field azh a>
	// 11151 20803:astore_1        
		abyte0.am = ((azh) (abyte0)).V | a.am;
	// 11152 20804:aload_1         
	// 11153 20805:aload_1         
	// 11154 20806:getfield        #450 <Field int azh.V>
	// 11155 20809:aload_0         
	// 11156 20810:getfield        #12  <Field azh a>
	// 11157 20813:getfield        #465 <Field int azh.am>
	// 11158 20816:ior             
	// 11159 20817:putfield        #465 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11160 20820:aload_0         
	// 11161 20821:getfield        #12  <Field azh a>
	// 11162 20824:astore_1        
		abyte0.au = ((azh) (abyte0)).al | a.au;
	// 11163 20825:aload_1         
	// 11164 20826:aload_1         
	// 11165 20827:getfield        #354 <Field int azh.al>
	// 11166 20830:aload_0         
	// 11167 20831:getfield        #12  <Field azh a>
	// 11168 20834:getfield        #146 <Field int azh.au>
	// 11169 20837:ior             
	// 11170 20838:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 11171 20841:aload_0         
	// 11172 20842:getfield        #12  <Field azh a>
	// 11173 20845:astore_1        
		abyte0.au = ((azh) (abyte0)).br ^ a.au;
	// 11174 20846:aload_1         
	// 11175 20847:aload_1         
	// 11176 20848:getfield        #444 <Field int azh.br>
	// 11177 20851:aload_0         
	// 11178 20852:getfield        #12  <Field azh a>
	// 11179 20855:getfield        #146 <Field int azh.au>
	// 11180 20858:ixor            
	// 11181 20859:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 11182 20862:aload_0         
	// 11183 20863:getfield        #12  <Field azh a>
	// 11184 20866:astore_1        
		abyte0.au = ((azh) (abyte0)).V | a.au;
	// 11185 20867:aload_1         
	// 11186 20868:aload_1         
	// 11187 20869:getfield        #450 <Field int azh.V>
	// 11188 20872:aload_0         
	// 11189 20873:getfield        #12  <Field azh a>
	// 11190 20876:getfield        #146 <Field int azh.au>
	// 11191 20879:ior             
	// 11192 20880:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 11193 20883:aload_0         
	// 11194 20884:getfield        #12  <Field azh a>
	// 11195 20887:astore_1        
		abyte0.au = ((azh) (abyte0)).aH ^ a.au;
	// 11196 20888:aload_1         
	// 11197 20889:aload_1         
	// 11198 20890:getfield        #214 <Field int azh.aH>
	// 11199 20893:aload_0         
	// 11200 20894:getfield        #12  <Field azh a>
	// 11201 20897:getfield        #146 <Field int azh.au>
	// 11202 20900:ixor            
	// 11203 20901:putfield        #146 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 11204 20904:aload_0         
	// 11205 20905:getfield        #12  <Field azh a>
	// 11206 20908:astore_1        
		abyte0.aH = ((azh) (abyte0)).b & ~a.j;
	// 11207 20909:aload_1         
	// 11208 20910:aload_1         
	// 11209 20911:getfield        #492 <Field int azh.b>
	// 11210 20914:aload_0         
	// 11211 20915:getfield        #12  <Field azh a>
	// 11212 20918:getfield        #280 <Field int azh.j>
	// 11213 20921:iconst_m1       
	// 11214 20922:ixor            
	// 11215 20923:iand            
	// 11216 20924:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 11217 20927:aload_0         
	// 11218 20928:getfield        #12  <Field azh a>
	// 11219 20931:astore_1        
		abyte0.bV = ((azh) (abyte0)).aH ^ a.bV;
	// 11220 20932:aload_1         
	// 11221 20933:aload_1         
	// 11222 20934:getfield        #214 <Field int azh.aH>
	// 11223 20937:aload_0         
	// 11224 20938:getfield        #12  <Field azh a>
	// 11225 20941:getfield        #390 <Field int azh.bV>
	// 11226 20944:ixor            
	// 11227 20945:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11228 20948:aload_0         
	// 11229 20949:getfield        #12  <Field azh a>
	// 11230 20952:astore_1        
		abyte0.bV = ((azh) (abyte0)).z & ~a.bV;
	// 11231 20953:aload_1         
	// 11232 20954:aload_1         
	// 11233 20955:getfield        #330 <Field int azh.z>
	// 11234 20958:aload_0         
	// 11235 20959:getfield        #12  <Field azh a>
	// 11236 20962:getfield        #390 <Field int azh.bV>
	// 11237 20965:iconst_m1       
	// 11238 20966:ixor            
	// 11239 20967:iand            
	// 11240 20968:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11241 20971:aload_0         
	// 11242 20972:getfield        #12  <Field azh a>
	// 11243 20975:astore_1        
		abyte0.br = ((azh) (abyte0)).b & ~a.r;
	// 11244 20976:aload_1         
	// 11245 20977:aload_1         
	// 11246 20978:getfield        #492 <Field int azh.b>
	// 11247 20981:aload_0         
	// 11248 20982:getfield        #12  <Field azh a>
	// 11249 20985:getfield        #170 <Field int azh.r>
	// 11250 20988:iconst_m1       
	// 11251 20989:ixor            
	// 11252 20990:iand            
	// 11253 20991:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 11254 20994:aload_0         
	// 11255 20995:getfield        #12  <Field azh a>
	// 11256 20998:astore_1        
		abyte0.br = ((azh) (abyte0)).aH ^ a.br;
	// 11257 20999:aload_1         
	// 11258 21000:aload_1         
	// 11259 21001:getfield        #214 <Field int azh.aH>
	// 11260 21004:aload_0         
	// 11261 21005:getfield        #12  <Field azh a>
	// 11262 21008:getfield        #444 <Field int azh.br>
	// 11263 21011:ixor            
	// 11264 21012:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 11265 21015:aload_0         
	// 11266 21016:getfield        #12  <Field azh a>
	// 11267 21019:astore_1        
		abyte0.br = ((azh) (abyte0)).br & a.z;
	// 11268 21020:aload_1         
	// 11269 21021:aload_1         
	// 11270 21022:getfield        #444 <Field int azh.br>
	// 11271 21025:aload_0         
	// 11272 21026:getfield        #12  <Field azh a>
	// 11273 21029:getfield        #330 <Field int azh.z>
	// 11274 21032:iand            
	// 11275 21033:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 11276 21036:aload_0         
	// 11277 21037:getfield        #12  <Field azh a>
	// 11278 21040:astore_1        
		abyte0.br = ((azh) (abyte0)).bq ^ a.br;
	// 11279 21041:aload_1         
	// 11280 21042:aload_1         
	// 11281 21043:getfield        #360 <Field int azh.bq>
	// 11282 21046:aload_0         
	// 11283 21047:getfield        #12  <Field azh a>
	// 11284 21050:getfield        #444 <Field int azh.br>
	// 11285 21053:ixor            
	// 11286 21054:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 11287 21057:aload_0         
	// 11288 21058:getfield        #12  <Field azh a>
	// 11289 21061:astore_1        
		abyte0.aV = ((azh) (abyte0)).br ^ a.aV;
	// 11290 21062:aload_1         
	// 11291 21063:aload_1         
	// 11292 21064:getfield        #444 <Field int azh.br>
	// 11293 21067:aload_0         
	// 11294 21068:getfield        #12  <Field azh a>
	// 11295 21071:getfield        #357 <Field int azh.aV>
	// 11296 21074:ixor            
	// 11297 21075:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 11298 21078:aload_0         
	// 11299 21079:getfield        #12  <Field azh a>
	// 11300 21082:astore_1        
		abyte0.aV = ((azh) (abyte0)).H & ~a.aV;
	// 11301 21083:aload_1         
	// 11302 21084:aload_1         
	// 11303 21085:getfield        #29  <Field int azh.H>
	// 11304 21088:aload_0         
	// 11305 21089:getfield        #12  <Field azh a>
	// 11306 21092:getfield        #357 <Field int azh.aV>
	// 11307 21095:iconst_m1       
	// 11308 21096:ixor            
	// 11309 21097:iand            
	// 11310 21098:putfield        #357 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 11311 21101:aload_0         
	// 11312 21102:getfield        #12  <Field azh a>
	// 11313 21105:astore_1        
		abyte0.aH = ((azh) (abyte0)).b & ~a.N;
	// 11314 21106:aload_1         
	// 11315 21107:aload_1         
	// 11316 21108:getfield        #492 <Field int azh.b>
	// 11317 21111:aload_0         
	// 11318 21112:getfield        #12  <Field azh a>
	// 11319 21115:getfield        #348 <Field int azh.N>
	// 11320 21118:iconst_m1       
	// 11321 21119:ixor            
	// 11322 21120:iand            
	// 11323 21121:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 11324 21124:aload_0         
	// 11325 21125:getfield        #12  <Field azh a>
	// 11326 21128:astore_1        
		abyte0.aH = ((azh) (abyte0)).ce ^ a.aH;
	// 11327 21129:aload_1         
	// 11328 21130:aload_1         
	// 11329 21131:getfield        #426 <Field int azh.ce>
	// 11330 21134:aload_0         
	// 11331 21135:getfield        #12  <Field azh a>
	// 11332 21138:getfield        #214 <Field int azh.aH>
	// 11333 21141:ixor            
	// 11334 21142:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 11335 21145:aload_0         
	// 11336 21146:getfield        #12  <Field azh a>
	// 11337 21149:astore_1        
		abyte0.aH = ((azh) (abyte0)).al | a.aH;
	// 11338 21150:aload_1         
	// 11339 21151:aload_1         
	// 11340 21152:getfield        #354 <Field int azh.al>
	// 11341 21155:aload_0         
	// 11342 21156:getfield        #12  <Field azh a>
	// 11343 21159:getfield        #214 <Field int azh.aH>
	// 11344 21162:ior             
	// 11345 21163:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 11346 21166:aload_0         
	// 11347 21167:getfield        #12  <Field azh a>
	// 11348 21170:astore_1        
		abyte0.aH = ((azh) (abyte0)).ap ^ a.aH;
	// 11349 21171:aload_1         
	// 11350 21172:aload_1         
	// 11351 21173:getfield        #333 <Field int azh.ap>
	// 11352 21176:aload_0         
	// 11353 21177:getfield        #12  <Field azh a>
	// 11354 21180:getfield        #214 <Field int azh.aH>
	// 11355 21183:ixor            
	// 11356 21184:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 11357 21187:aload_0         
	// 11358 21188:getfield        #12  <Field azh a>
	// 11359 21191:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & ~a.V;
	// 11360 21192:aload_1         
	// 11361 21193:aload_1         
	// 11362 21194:getfield        #214 <Field int azh.aH>
	// 11363 21197:aload_0         
	// 11364 21198:getfield        #12  <Field azh a>
	// 11365 21201:getfield        #450 <Field int azh.V>
	// 11366 21204:iconst_m1       
	// 11367 21205:ixor            
	// 11368 21206:iand            
	// 11369 21207:putfield        #214 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 11370 21210:aload_0         
	// 11371 21211:getfield        #12  <Field azh a>
	// 11372 21214:astore_1        
		abyte0.ap = ((azh) (abyte0)).r | a.b;
	// 11373 21215:aload_1         
	// 11374 21216:aload_1         
	// 11375 21217:getfield        #170 <Field int azh.r>
	// 11376 21220:aload_0         
	// 11377 21221:getfield        #12  <Field azh a>
	// 11378 21224:getfield        #492 <Field int azh.b>
	// 11379 21227:ior             
	// 11380 21228:putfield        #333 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11381 21231:aload_0         
	// 11382 21232:getfield        #12  <Field azh a>
	// 11383 21235:astore_1        
		abyte0.ce = ((azh) (abyte0)).r | a.b;
	// 11384 21236:aload_1         
	// 11385 21237:aload_1         
	// 11386 21238:getfield        #170 <Field int azh.r>
	// 11387 21241:aload_0         
	// 11388 21242:getfield        #12  <Field azh a>
	// 11389 21245:getfield        #492 <Field int azh.b>
	// 11390 21248:ior             
	// 11391 21249:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 11392 21252:aload_0         
	// 11393 21253:getfield        #12  <Field azh a>
	// 11394 21256:astore_1        
		abyte0.ce = ((azh) (abyte0)).bc ^ a.ce;
	// 11395 21257:aload_1         
	// 11396 21258:aload_1         
	// 11397 21259:getfield        #372 <Field int azh.bc>
	// 11398 21262:aload_0         
	// 11399 21263:getfield        #12  <Field azh a>
	// 11400 21266:getfield        #426 <Field int azh.ce>
	// 11401 21269:ixor            
	// 11402 21270:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 11403 21273:aload_0         
	// 11404 21274:getfield        #12  <Field azh a>
	// 11405 21277:astore_1        
		abyte0.bV = ((azh) (abyte0)).ce ^ a.bV;
	// 11406 21278:aload_1         
	// 11407 21279:aload_1         
	// 11408 21280:getfield        #426 <Field int azh.ce>
	// 11409 21283:aload_0         
	// 11410 21284:getfield        #12  <Field azh a>
	// 11411 21287:getfield        #390 <Field int azh.bV>
	// 11412 21290:ixor            
	// 11413 21291:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11414 21294:aload_0         
	// 11415 21295:getfield        #12  <Field azh a>
	// 11416 21298:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.al;
	// 11417 21299:aload_1         
	// 11418 21300:aload_1         
	// 11419 21301:getfield        #390 <Field int azh.bV>
	// 11420 21304:aload_0         
	// 11421 21305:getfield        #12  <Field azh a>
	// 11422 21308:getfield        #354 <Field int azh.al>
	// 11423 21311:iconst_m1       
	// 11424 21312:ixor            
	// 11425 21313:iand            
	// 11426 21314:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11427 21317:aload_0         
	// 11428 21318:getfield        #12  <Field azh a>
	// 11429 21321:astore_1        
		abyte0.bV = ((azh) (abyte0)).br ^ a.bV;
	// 11430 21322:aload_1         
	// 11431 21323:aload_1         
	// 11432 21324:getfield        #444 <Field int azh.br>
	// 11433 21327:aload_0         
	// 11434 21328:getfield        #12  <Field azh a>
	// 11435 21331:getfield        #390 <Field int azh.bV>
	// 11436 21334:ixor            
	// 11437 21335:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11438 21338:aload_0         
	// 11439 21339:getfield        #12  <Field azh a>
	// 11440 21342:astore_1        
		abyte0.bV = ((azh) (abyte0)).H & ~a.bV;
	// 11441 21343:aload_1         
	// 11442 21344:aload_1         
	// 11443 21345:getfield        #29  <Field int azh.H>
	// 11444 21348:aload_0         
	// 11445 21349:getfield        #12  <Field azh a>
	// 11446 21352:getfield        #390 <Field int azh.bV>
	// 11447 21355:iconst_m1       
	// 11448 21356:ixor            
	// 11449 21357:iand            
	// 11450 21358:putfield        #390 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11451 21361:aload_0         
	// 11452 21362:getfield        #12  <Field azh a>
	// 11453 21365:astore_1        
		abyte0.n = ((azh) (abyte0)).ce ^ a.n;
	// 11454 21366:aload_1         
	// 11455 21367:aload_1         
	// 11456 21368:getfield        #426 <Field int azh.ce>
	// 11457 21371:aload_0         
	// 11458 21372:getfield        #12  <Field azh a>
	// 11459 21375:getfield        #80  <Field int azh.n>
	// 11460 21378:ixor            
	// 11461 21379:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11462 21382:aload_0         
	// 11463 21383:getfield        #12  <Field azh a>
	// 11464 21386:astore_1        
		abyte0.n = ((azh) (abyte0)).n ^ a.al;
	// 11465 21387:aload_1         
	// 11466 21388:aload_1         
	// 11467 21389:getfield        #80  <Field int azh.n>
	// 11468 21392:aload_0         
	// 11469 21393:getfield        #12  <Field azh a>
	// 11470 21396:getfield        #354 <Field int azh.al>
	// 11471 21399:ixor            
	// 11472 21400:putfield        #80  <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11473 21403:aload_0         
	// 11474 21404:getfield        #12  <Field azh a>
	// 11475 21407:astore_1        
		abyte0.ce = ((azh) (abyte0)).b & ~a.r;
	// 11476 21408:aload_1         
	// 11477 21409:aload_1         
	// 11478 21410:getfield        #492 <Field int azh.b>
	// 11479 21413:aload_0         
	// 11480 21414:getfield        #12  <Field azh a>
	// 11481 21417:getfield        #170 <Field int azh.r>
	// 11482 21420:iconst_m1       
	// 11483 21421:ixor            
	// 11484 21422:iand            
	// 11485 21423:putfield        #426 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 11486 21426:aload_0         
	// 11487 21427:getfield        #12  <Field azh a>
	// 11488 21430:astore_1        
		abyte0.br = ((azh) (abyte0)).j | a.b;
	// 11489 21431:aload_1         
	// 11490 21432:aload_1         
	// 11491 21433:getfield        #280 <Field int azh.j>
	// 11492 21436:aload_0         
	// 11493 21437:getfield        #12  <Field azh a>
	// 11494 21440:getfield        #492 <Field int azh.b>
	// 11495 21443:ior             
	// 11496 21444:putfield        #444 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 11497 21447:aload_0         
	// 11498 21448:getfield        #12  <Field azh a>
	// 11499 21451:astore_1        
		abyte0.aM = ((azh) (abyte0)).br ^ a.aM;
	// 11500 21452:aload_1         
	// 11501 21453:aload_1         
	// 11502 21454:getfield        #444 <Field int azh.br>
	// 11503 21457:aload_0         
	// 11504 21458:getfield        #12  <Field azh a>
	// 11505 21461:getfield        #462 <Field int azh.aM>
	// 11506 21464:ixor            
	// 11507 21465:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 11508 21468:aload_0         
	// 11509 21469:getfield        #12  <Field azh a>
	// 11510 21472:astore_1        
		abyte0.aM = ((azh) (abyte0)).aM & ~a.z;
	// 11511 21473:aload_1         
	// 11512 21474:aload_1         
	// 11513 21475:getfield        #462 <Field int azh.aM>
	// 11514 21478:aload_0         
	// 11515 21479:getfield        #12  <Field azh a>
	// 11516 21482:getfield        #330 <Field int azh.z>
	// 11517 21485:iconst_m1       
	// 11518 21486:ixor            
	// 11519 21487:iand            
	// 11520 21488:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 11521 21491:aload_0         
	// 11522 21492:getfield        #12  <Field azh a>
	// 11523 21495:astore_1        
		abyte0.aM = ((azh) (abyte0)).bq ^ a.aM;
	// 11524 21496:aload_1         
	// 11525 21497:aload_1         
	// 11526 21498:getfield        #360 <Field int azh.bq>
	// 11527 21501:aload_0         
	// 11528 21502:getfield        #12  <Field azh a>
	// 11529 21505:getfield        #462 <Field int azh.aM>
	// 11530 21508:ixor            
	// 11531 21509:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 11532 21512:aload_0         
	// 11533 21513:getfield        #12  <Field azh a>
	// 11534 21516:astore_1        
		abyte0.aM = ((azh) (abyte0)).al & ~a.aM;
	// 11535 21517:aload_1         
	// 11536 21518:aload_1         
	// 11537 21519:getfield        #354 <Field int azh.al>
	// 11538 21522:aload_0         
	// 11539 21523:getfield        #12  <Field azh a>
	// 11540 21526:getfield        #462 <Field int azh.aM>
	// 11541 21529:iconst_m1       
	// 11542 21530:ixor            
	// 11543 21531:iand            
	// 11544 21532:putfield        #462 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 11545 21535:aload_0         
	// 11546 21536:getfield        #12  <Field azh a>
	// 11547 21539:astore_1        
		abyte0.bq = ((azh) (abyte0)).br & ~a.b;
	// 11548 21540:aload_1         
	// 11549 21541:aload_1         
	// 11550 21542:getfield        #444 <Field int azh.br>
	// 11551 21545:aload_0         
	// 11552 21546:getfield        #12  <Field azh a>
	// 11553 21549:getfield        #492 <Field int azh.b>
	// 11554 21552:iconst_m1       
	// 11555 21553:ixor            
	// 11556 21554:iand            
	// 11557 21555:putfield        #360 <Field int azh.bq>
	// 11558 21558:return          
	}

	private final azh a;
}
